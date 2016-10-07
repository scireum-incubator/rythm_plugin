package com.rythmplugin.imports;

import com.intellij.injected.editor.VirtualFileWindow;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ImportOptimizer;
import com.intellij.openapi.fileTypes.StdFileTypes;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.util.EmptyRunnable;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CodeStyleSettingsManager;
import com.intellij.psi.impl.source.codeStyle.ImportHelper;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.psi.xml.*;
import com.intellij.util.containers.HashSet;
import com.intellij.xml.XmlAttributeDescriptor;
import com.intellij.xml.XmlElementDescriptor;
import com.rythmplugin.file.RythmFileTypeFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * Created by mpl on 07.10.2016.
 */
public class RythmJavImportsOptimizer implements ImportOptimizer {
    @Override
    public boolean supports(PsiFile file) {
        return RythmFileTypeFactory.isFxml(file);
    }

    @NotNull
    @Override
    public Runnable processFile(final PsiFile file) {
        VirtualFile vFile = file.getVirtualFile();
        if (vFile instanceof VirtualFileWindow) vFile = ((VirtualFileWindow)vFile).getDelegate();
        final Project project = file.getProject();
        if (vFile == null || !ProjectRootManager.getInstance(project).getFileIndex().isInSourceContent(vFile)) {
            return EmptyRunnable.INSTANCE;
        }
        final List<Pair<String, Boolean>> names = new ArrayList<Pair<String, Boolean>>();
        final Set<String> demandedForNested = new HashSet<>();
        collectNamesToImport(names, demandedForNested, (XmlFile)file);
        Collections.sort(names, (o1, o2) -> StringUtil.compare(o1.first, o2.first, true));
        final CodeStyleSettings settings = CodeStyleSettingsManager.getSettings(project);
        final List<Pair<String, Boolean>> sortedNames = ImportHelper.sortItemsAccordingToSettings(names, settings);
        final HashSet<String> onDemand = new HashSet<String>();
        ImportHelper.collectOnDemandImports(sortedNames, onDemand, settings);
        onDemand.addAll(demandedForNested);
        final Set<String> imported = new HashSet<String>();
        final List<String> imports = new ArrayList<String>();
        for (Pair<String, Boolean> pair : sortedNames) {
            final String qName = pair.first;
            final String packageName = StringUtil.getPackageName(qName);
            if (imported.contains(packageName) || imported.contains(qName)) {
                continue;
            }
            if (onDemand.contains(packageName)) {
                imported.add(packageName);
                imports.add("<?import " + packageName + ".*?>");
            } else {
                imported.add(qName);
                imports.add("<?import " + qName + "?>");
            }
        }
        final PsiFileFactory factory = PsiFileFactory.getInstance(file.getProject());

        final XmlFile dummyFile = (XmlFile)factory.createFileFromText("_Dummy_.fxml", StdFileTypes.XML, StringUtil.join(imports, "\n"));
        final XmlDocument document = dummyFile.getDocument();
        final XmlProlog newImportList = document != null ? document.getProlog() : null;
        if (newImportList == null) return EmptyRunnable.getInstance();
        return () -> {
            final XmlDocument xmlDocument = ((XmlFile)file).getDocument();
            final XmlProlog prolog = xmlDocument != null ? xmlDocument.getProlog() : null;
            if (prolog != null) {
                final Collection<XmlProcessingInstruction> instructions = PsiTreeUtil.findChildrenOfType(prolog, XmlProcessingInstruction.class);
                for (final XmlProcessingInstruction instruction : instructions) {
                    final ASTNode node = instruction.getNode();
                    final ASTNode nameNode = node.findChildByType(XmlTokenType.XML_NAME);
                    if (nameNode != null && nameNode.getText().equals("import")) {
                        instruction.delete();
                    }
                }
                prolog.add(newImportList);
            } else {
                document.addBefore(newImportList, document.getRootTag());
            }
        };
    }

    private static void collectNamesToImport(@NotNull final Collection<Pair<String, Boolean>> names,
                                             @NotNull final Collection<String> demandedForNested,
                                             @NotNull XmlFile file) {
        file.accept(new JavaFxUsedClassesVisitor() {
            @Override
            protected void appendClassName(String fqn) {
                names.add(Pair.create(fqn, false));
            }

            @Override
            protected void appendDemandedPackageName(@NotNull String packageName) {
                demandedForNested.add(packageName);
            }
        });
    }

    public static abstract class JavaFxUsedClassesVisitor extends XmlRecursiveElementVisitor {
        @Override
        public void visitXmlProlog(XmlProlog prolog) {}

        @Override
        public void visitXmlProcessingInstruction(XmlProcessingInstruction processingInstruction) {}

        @Override
        public void visitXmlAttribute(XmlAttribute attribute) {
            final XmlAttributeDescriptor descriptor = attribute.getDescriptor();
           if (descriptor instanceof RythmJavStaticSetterAttributeDescriptor) {
                final PsiElement declaration = descriptor.getDeclaration();
                if (declaration instanceof PsiMember) {
                    appendClassName(((PsiMember)declaration).getContainingClass());
                }
            }
            else if (descriptor instanceof RythmJavRootTagDescriptor.RootTagTypeAttributeDescriptor) {
                appendClassName(RythmJavPsiUtil.findPsiClass(attribute.getValue(), attribute));
            }
        }

        @Override
        public void visitXmlTag(XmlTag tag) {
            super.visitXmlTag(tag);
            final XmlElementDescriptor descriptor = tag.getDescriptor();
            if (descriptor instanceof RythmJavClassTagDescriptorBase) {
                appendClassName(descriptor.getDeclaration());
            }
            else if (descriptor instanceof RythmJavPropertyTagDescriptor && ((RythmJavPropertyTagDescriptor)descriptor).isStatic()) {
                final PsiElement declaration = descriptor.getDeclaration();
                if (declaration instanceof PsiMember) {
                    appendClassName(((PsiMember)declaration).getContainingClass());
                }
            }
        }

        private void appendClassName(PsiElement declaration) {
            if (declaration instanceof PsiClass) {
                final PsiClass psiClass = (PsiClass)declaration;
                final String ownerClassQN = getTopmostOwnerClassQualifiedName(psiClass);
                if (ownerClassQN != null) {
                    appendClassName(ownerClassQN);
                    final String ownerClassPackageName = StringUtil.getPackageName(ownerClassQN);
                    if (!StringUtil.isEmpty(ownerClassPackageName)) {
                        appendDemandedPackageName(ownerClassPackageName);
                    }
                }
                else {
                    final String classQN = psiClass.getQualifiedName();
                    if (classQN != null) {
                        appendClassName(classQN);
                    }
                }
            }
        }

        @Nullable
        private static String getTopmostOwnerClassQualifiedName(@NotNull PsiClass psiClass) {
            PsiClass ownerClass = null;
            for (PsiClass aClass = psiClass.getContainingClass(); aClass != null; aClass = aClass.getContainingClass()) {
                ownerClass = aClass;
            }
            if (ownerClass != null) {
                return ownerClass.getQualifiedName();
            }
            return null;
        }

        protected abstract void appendClassName(String fqn);

        protected abstract void appendDemandedPackageName(@NotNull String packageName);
    }
}
