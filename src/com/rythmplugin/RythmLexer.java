/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.rythmplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.rythmplugin.psi.RythmTypes;
import com.intellij.psi.TokenType;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>Rythm.flex</tt>
 */
class RythmLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\1\1\13\2\1\22\0\1\2\1\45\1\42\3\0\1\46\1\0\1\34\1\23\4\0\1\33"+
    "\2\0\1\47\6\0\1\50\3\0\1\4\1\3\1\14\1\0\1\15\32\31\4\0\1\35\1\0\1\16\1\32"+
    "\1\6\1\25\1\20\1\44\1\17\1\32\1\10\1\32\1\30\1\40\1\26\1\22\1\21\1\11\1\36"+
    "\1\7\1\5\1\12\1\37\1\27\1\32\1\24\2\32\1\43\11\0\1\13\32\0\1\41\337\0\1\41"+
    "\177\0\13\41\35\0\2\13\5\0\1\41\57\0\1\41\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\4\1\1\0\10\3\5\0\5\3"+
    "\1\0\4\3\2\0\1\4\5\0\4\3\3\0\1\3"+
    "\1\5\6\0\3\3\1\6\7\0\4\3\7\0\4\5"+
    "\3\0\1\5\7\0\1\5\1\7\1\3\1\10\1\3"+
    "\1\0\1\3\1\6\1\0\1\11\1\4\2\0\4\3"+
    "\1\5\4\0\4\5\2\0\3\5\1\0\4\5\1\0"+
    "\1\5\1\0\2\5\1\0\2\3\2\4\2\0\1\3"+
    "\1\12\1\13\1\14\1\5\5\0\11\5\1\0\1\15"+
    "\1\3\2\4\1\0\1\16\1\0\1\3\1\12\1\0"+
    "\1\3\1\13\2\0\1\5\1\0\1\5\1\0\1\17"+
    "\1\20\1\0\1\3\1\16\1\0\1\5\4\0\1\3"+
    "\1\17\2\5\1\0\1\7\2\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[196];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215\0\u023e\0\u0267"+
    "\0\u0290\0\u02b9\0\u02e2\0\u030b\0\u0334\0\u035d\0\u0386\0\u03af"+
    "\0\u03d8\0\u0401\0\u042a\0\u0453\0\u047c\0\u04a5\0\u04ce\0\u04f7"+
    "\0\u0520\0\51\0\u0549\0\u0572\0\u059b\0\u05c4\0\u05ed\0\u0616"+
    "\0\u063f\0\u0668\0\u0691\0\u06ba\0\u06e3\0\u070c\0\u0735\0\u075e"+
    "\0\u0787\0\u07b0\0\u07d9\0\u0802\0\u082b\0\u0854\0\u087d\0\u08a6"+
    "\0\u08cf\0\u08f8\0\u0921\0\u094a\0\u0973\0\u099c\0\u09c5\0\u09ee"+
    "\0\u0a17\0\u0a40\0\u0a69\0\u0a92\0\u0abb\0\u0ae4\0\u0b0d\0\u0b36"+
    "\0\u0b5f\0\u0b88\0\u0bb1\0\u0bda\0\u0c03\0\u0c2c\0\u0c55\0\u0c7e"+
    "\0\u0ca7\0\u0cd0\0\u0cf9\0\u0d22\0\u0d4b\0\u0d74\0\u0d9d\0\u0dc6"+
    "\0\u0def\0\u0e18\0\u0e41\0\u0e6a\0\u0e93\0\u0ebc\0\u0ee5\0\u0f0e"+
    "\0\u0f37\0\u08f8\0\u0f37\0\u0f60\0\51\0\u0f89\0\u0fb2\0\u0fdb"+
    "\0\u1004\0\u102d\0\u1056\0\u107f\0\u0ae4\0\u10a8\0\u10d1\0\u10fa"+
    "\0\u1123\0\u114c\0\u1175\0\u119e\0\u11c7\0\u11f0\0\u1219\0\u1242"+
    "\0\u126b\0\u1294\0\u12bd\0\u12e6\0\u130f\0\u1338\0\u1361\0\u138a"+
    "\0\u13b3\0\u13dc\0\u1405\0\u142e\0\u1457\0\u1480\0\u14a9\0\u14d2"+
    "\0\u14fb\0\u1524\0\u154d\0\u1576\0\u159f\0\u15c8\0\u15f1\0\u161a"+
    "\0\u1643\0\u166c\0\u1695\0\u16be\0\u16e7\0\u1710\0\u1739\0\u1762"+
    "\0\u178b\0\u17b4\0\u17dd\0\u1806\0\u182f\0\u1858\0\u1881\0\u0171"+
    "\0\u18aa\0\u18d3\0\u0520\0\u18fc\0\u1925\0\u194e\0\u159f\0\u194e"+
    "\0\u1977\0\u15c8\0\u1977\0\u19a0\0\u19c9\0\u19f2\0\u1a1b\0\u1a44"+
    "\0\u1a6d\0\u1a96\0\u18fc\0\u1abf\0\u1925\0\u1abf\0\u1ae8\0\u1b11"+
    "\0\u1b3a\0\u1b63\0\u1b8c\0\u1bb5\0\u1a96\0\u1bb5\0\u1ae8\0\u1bde"+
    "\0\u1c07\0\u1b8c\0\u1c30\0\u1c59";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[196];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\2\1\4\6\2\1\0\1\2\1\5"+
    "\2\2\1\6\12\2\1\7\15\2\52\0\2\3\53\0"+
    "\1\10\50\0\1\11\1\12\1\13\1\14\1\15\1\12"+
    "\3\0\1\16\1\12\1\17\2\12\1\0\7\12\3\0"+
    "\3\12\3\0\1\20\44\0\1\21\15\0\6\22\3\0"+
    "\1\22\1\23\1\24\2\22\1\0\7\22\3\0\3\22"+
    "\3\0\1\22\12\0\1\25\47\0\6\12\3\0\2\12"+
    "\1\26\2\12\1\0\7\12\3\0\3\12\3\0\1\12"+
    "\11\0\6\12\3\0\5\12\1\0\7\12\3\0\3\12"+
    "\3\0\1\12\11\0\6\12\3\0\2\12\1\27\2\12"+
    "\1\0\7\12\3\0\3\12\3\0\1\12\11\0\6\12"+
    "\3\0\4\12\1\30\1\0\2\12\1\31\4\12\3\0"+
    "\3\12\3\0\1\32\2\0\1\33\6\0\2\12\1\34"+
    "\3\12\3\0\5\12\1\0\7\12\3\0\3\12\3\0"+
    "\1\12\11\0\2\12\1\35\3\12\3\0\5\12\1\0"+
    "\7\12\3\0\3\12\3\0\1\12\11\0\6\12\3\0"+
    "\5\12\1\0\1\36\6\12\3\0\3\12\3\0\1\12"+
    "\11\0\6\12\3\0\3\12\1\37\1\12\1\0\7\12"+
    "\3\0\3\12\3\0\1\12\11\0\1\40\50\0\6\41"+
    "\3\0\5\41\1\42\7\41\1\0\1\43\1\44\3\41"+
    "\3\0\1\41\11\0\6\41\3\0\2\41\1\45\2\41"+
    "\1\42\7\41\1\0\1\43\1\44\3\41\3\0\1\41"+
    "\11\0\6\41\3\0\5\41\1\42\7\41\1\0\1\43"+
    "\1\44\1\46\2\41\3\0\1\41\13\0\1\47\46\0"+
    "\1\12\1\50\4\12\3\0\5\12\1\0\7\12\3\0"+
    "\3\12\3\0\1\12\11\0\6\12\3\0\4\12\1\51"+
    "\1\0\7\12\3\0\3\12\3\0\1\12\11\0\6\12"+
    "\3\0\5\12\1\0\3\12\1\52\3\12\3\0\3\12"+
    "\3\0\1\12\11\0\4\12\1\53\1\12\3\0\5\12"+
    "\1\0\7\12\3\0\3\12\3\0\1\12\4\0\1\54"+
    "\2\55\1\56\1\54\6\57\1\55\2\54\5\57\1\60"+
    "\7\57\1\61\1\62\1\54\3\57\1\55\1\63\1\54"+
    "\1\57\1\64\1\65\2\54\50\0\1\66\5\0\6\12"+
    "\3\0\2\12\1\67\2\12\1\0\7\12\3\0\3\12"+
    "\3\0\1\12\11\0\6\12\3\0\1\12\1\70\3\12"+
    "\1\0\7\12\3\0\3\12\3\0\1\12\11\0\5\12"+
    "\1\71\3\0\5\12\1\0\7\12\3\0\3\12\3\0"+
    "\1\12\11\0\2\12\1\72\3\12\3\0\5\12\1\0"+
    "\7\12\3\0\3\12\3\0\1\12\24\0\1\73\35\0"+
    "\6\41\3\0\5\41\1\42\7\41\1\0\1\74\1\44"+
    "\3\41\3\0\1\41\11\0\6\75\3\0\5\75\1\42"+
    "\7\75\1\0\1\43\1\0\3\75\3\0\1\75\27\0"+
    "\1\42\5\0\1\76\2\0\1\74\1\44\20\0\5\41"+
    "\1\77\3\0\5\41\1\42\7\41\1\0\1\74\1\44"+
    "\3\41\3\0\1\41\11\0\6\41\3\0\5\41\1\42"+
    "\7\41\1\0\1\74\1\44\1\41\1\100\1\41\3\0"+
    "\1\41\14\0\1\101\45\0\5\12\1\102\3\0\5\12"+
    "\1\0\7\12\3\0\3\12\3\0\1\12\11\0\6\12"+
    "\3\0\5\12\1\0\1\12\1\103\5\12\3\0\3\12"+
    "\3\0\1\12\11\0\6\12\3\0\3\12\1\104\1\12"+
    "\1\0\7\12\3\0\3\12\3\0\1\12\11\0\6\12"+
    "\3\0\3\12\1\105\1\12\1\0\7\12\3\0\3\12"+
    "\3\0\1\12\4\0\1\54\1\0\11\54\1\0\7\54"+
    "\1\106\26\54\2\55\1\56\1\54\6\107\1\55\2\54"+
    "\5\107\1\60\7\107\1\61\1\62\1\54\3\107\1\55"+
    "\1\63\1\54\1\107\1\64\1\65\3\54\2\110\1\56"+
    "\7\54\1\110\7\54\1\106\15\54\1\110\10\54\2\111"+
    "\1\56\1\54\6\57\1\111\2\54\5\57\1\60\7\57"+
    "\1\61\1\112\1\54\3\57\1\111\1\63\1\54\1\57"+
    "\1\113\1\65\2\54\1\106\1\111\1\114\1\115\1\106"+
    "\6\116\1\111\2\106\5\116\1\60\7\116\1\117\1\120"+
    "\1\106\3\116\1\114\2\106\1\116\1\121\1\65\2\106"+
    "\1\54\2\111\1\56\1\54\6\122\1\111\2\54\5\122"+
    "\1\60\7\122\1\61\1\112\1\54\3\122\1\111\1\63"+
    "\1\54\1\122\1\113\1\65\3\54\2\111\1\56\1\54"+
    "\6\107\1\111\2\54\5\107\1\60\7\107\1\61\1\62"+
    "\1\54\3\107\1\111\1\63\1\54\1\107\1\64\1\65"+
    "\3\54\1\0\3\54\6\123\1\0\2\54\5\123\1\124"+
    "\7\123\1\125\1\126\1\54\3\123\1\54\1\63\1\54"+
    "\1\123\5\54\2\110\1\56\1\54\6\127\1\110\2\54"+
    "\5\127\1\124\7\127\1\130\1\131\1\54\3\127\1\110"+
    "\1\63\1\54\1\127\1\64\3\54\1\132\2\133\10\132"+
    "\1\133\7\132\1\134\15\132\1\133\4\132\1\65\2\132"+
    "\22\0\1\135\33\0\6\12\3\0\5\12\1\0\7\12"+
    "\3\0\3\12\3\0\1\136\11\0\1\137\5\12\3\0"+
    "\5\12\1\0\7\12\3\0\3\12\3\0\1\12\11\0"+
    "\6\12\3\0\2\12\1\140\2\12\1\0\7\12\3\0"+
    "\3\12\3\0\1\12\4\0\1\141\1\0\3\141\6\142"+
    "\1\0\2\141\5\142\1\143\7\142\3\141\3\142\3\141"+
    "\1\142\4\141\1\0\2\144\10\0\1\144\25\0\1\144"+
    "\1\0\1\145\30\0\1\42\10\0\1\74\21\0\6\75"+
    "\3\0\5\75\1\42\7\75\3\0\3\75\3\0\1\75"+
    "\27\0\1\42\5\0\1\76\2\0\1\74\21\0\6\146"+
    "\3\0\5\146\1\42\7\146\1\0\1\74\1\44\3\146"+
    "\3\0\1\146\11\0\6\41\3\0\1\147\4\41\1\42"+
    "\7\41\1\0\1\74\1\44\3\41\3\0\1\41\15\0"+
    "\1\150\44\0\3\12\1\151\2\12\3\0\5\12\1\0"+
    "\7\12\3\0\3\12\3\0\1\12\11\0\6\12\3\0"+
    "\2\12\1\152\2\12\1\0\7\12\3\0\3\12\3\0"+
    "\1\12\11\0\6\12\3\0\5\12\1\0\4\12\1\153"+
    "\2\12\3\0\3\12\3\0\1\12\11\0\2\12\1\154"+
    "\3\12\3\0\5\12\1\0\7\12\3\0\3\12\3\0"+
    "\1\12\4\0\1\106\1\0\11\106\1\0\7\106\1\155"+
    "\25\106\1\54\2\111\1\56\1\54\6\107\1\111\2\54"+
    "\5\107\1\60\7\107\1\61\1\112\1\54\3\107\1\111"+
    "\1\63\1\54\1\107\1\113\1\65\3\54\2\110\10\54"+
    "\1\110\7\54\1\106\15\54\1\110\10\54\2\111\1\56"+
    "\7\54\1\111\7\54\1\106\15\54\1\111\3\54\1\113"+
    "\1\65\3\54\2\111\1\56\1\54\6\156\1\111\2\54"+
    "\5\156\1\60\7\156\1\157\1\112\1\54\3\156\1\111"+
    "\1\63\1\54\1\156\1\113\1\65\3\54\2\110\1\56"+
    "\7\54\1\110\7\54\1\106\15\54\1\110\3\54\1\113"+
    "\3\54\1\106\1\111\1\114\1\160\7\106\1\111\7\106"+
    "\1\155\15\106\1\114\3\106\1\121\1\65\3\106\1\110"+
    "\1\161\1\115\1\106\6\162\1\110\2\106\5\162\1\163"+
    "\7\162\1\164\1\165\1\106\3\162\1\161\2\106\1\162"+
    "\5\106\1\166\1\167\2\106\6\116\1\166\2\106\5\116"+
    "\1\170\7\116\1\171\1\120\1\106\3\116\1\167\2\106"+
    "\1\116\1\106\1\65\3\106\1\166\1\167\2\106\6\116"+
    "\1\166\2\106\5\116\1\170\7\116\1\117\1\120\1\106"+
    "\3\116\1\167\2\106\1\116\1\106\1\65\3\106\1\166"+
    "\1\167\2\106\6\172\1\166\2\106\5\172\1\170\7\172"+
    "\1\171\1\120\1\106\3\172\1\167\2\106\1\172\1\106"+
    "\1\65\3\106\1\110\1\161\1\160\7\106\1\110\7\106"+
    "\1\155\15\106\1\161\3\106\1\121\3\106\1\54\2\111"+
    "\1\56\1\54\6\122\1\111\2\54\5\122\1\60\7\122"+
    "\1\157\1\112\1\54\3\122\1\111\1\63\1\54\1\122"+
    "\1\113\1\65\3\54\1\0\3\54\6\123\1\0\2\54"+
    "\5\123\1\124\7\123\1\125\1\126\1\54\3\123\1\54"+
    "\1\173\1\54\1\123\4\54\1\106\1\0\1\106\1\174"+
    "\1\106\6\175\1\0\2\106\5\175\1\124\7\175\1\176"+
    "\1\177\1\106\3\175\3\106\1\175\4\106\1\54\1\0"+
    "\3\54\6\200\1\0\2\54\5\200\1\201\7\200\1\125"+
    "\1\126\1\54\3\200\3\54\1\200\5\54\1\0\11\54"+
    "\1\0\7\54\1\201\10\54\1\126\15\54\1\0\3\54"+
    "\6\127\1\0\2\54\5\127\1\124\7\127\1\130\1\131"+
    "\1\54\3\127\1\54\1\63\1\54\1\127\5\54\1\0"+
    "\3\54\6\202\1\0\2\54\5\202\1\124\7\202\1\130"+
    "\1\131\1\54\3\202\1\54\1\63\1\54\1\202\5\54"+
    "\1\0\3\54\6\123\1\0\2\54\5\123\1\124\7\123"+
    "\1\125\1\131\1\54\3\123\1\54\1\63\1\54\1\123"+
    "\4\54\1\132\1\0\11\132\1\0\7\132\1\134\26\132"+
    "\2\133\10\132\1\133\7\132\1\134\15\132\1\133\10\132"+
    "\1\0\3\132\6\203\1\0\2\132\5\203\1\134\7\203"+
    "\1\134\1\204\1\132\3\203\3\132\1\203\4\132\34\0"+
    "\1\205\21\0\3\12\1\206\2\12\3\0\5\12\1\0"+
    "\7\12\3\0\3\12\3\0\1\12\4\0\1\137\1\0"+
    "\11\137\1\0\35\137\5\0\6\12\3\0\4\12\1\207"+
    "\1\0\7\12\3\0\3\12\3\0\1\12\4\0\1\141"+
    "\1\0\11\141\1\0\7\141\1\143\25\141\43\0\1\145"+
    "\12\0\6\146\3\0\5\146\1\210\7\146\1\0\1\211"+
    "\1\44\3\146\3\0\1\146\11\0\6\41\3\0\5\41"+
    "\1\42\7\41\1\0\1\74\1\44\2\41\1\212\3\0"+
    "\1\41\16\0\1\213\43\0\6\12\3\0\3\12\1\214"+
    "\1\12\1\0\7\12\3\0\3\12\3\0\1\12\11\0"+
    "\2\12\1\215\3\12\3\0\5\12\1\0\7\12\3\0"+
    "\3\12\3\0\1\12\11\0\6\12\3\0\2\12\1\216"+
    "\2\12\1\0\7\12\3\0\3\12\3\0\1\12\11\0"+
    "\5\12\1\217\3\0\5\12\1\0\7\12\3\0\3\12"+
    "\3\0\1\12\4\0\1\54\2\111\1\56\1\54\6\156"+
    "\1\111\2\54\5\156\1\220\7\156\1\221\1\222\1\54"+
    "\3\156\1\111\1\173\1\54\1\156\1\113\1\65\3\54"+
    "\1\166\1\223\2\54\6\224\1\166\2\54\5\224\1\170"+
    "\7\224\1\157\1\225\1\54\3\224\1\223\2\54\1\224"+
    "\1\54\1\65\2\54\1\106\1\110\1\161\1\160\7\106"+
    "\1\110\7\106\1\155\15\106\1\161\10\106\1\110\1\161"+
    "\10\106\1\110\7\106\1\155\15\106\1\161\10\106\1\0"+
    "\3\106\6\162\1\0\2\106\5\162\1\163\7\162\1\226"+
    "\1\165\1\106\3\162\3\106\1\162\5\106\1\0\3\106"+
    "\6\227\1\0\2\106\5\227\1\163\7\227\1\230\1\231"+
    "\1\106\3\227\3\106\1\227\5\106\1\0\3\106\6\162"+
    "\1\0\2\106\5\162\1\163\7\162\1\164\1\165\1\106"+
    "\3\162\3\106\1\162\5\106\1\0\3\106\6\232\1\0"+
    "\2\106\5\232\1\163\7\232\1\226\1\165\1\106\3\232"+
    "\3\106\1\232\4\106\1\0\2\166\10\0\1\166\25\0"+
    "\1\166\4\0\1\65\2\0\1\106\1\166\1\167\10\106"+
    "\1\166\7\106\1\155\15\106\1\167\4\106\1\65\3\106"+
    "\1\166\1\167\1\174\1\106\6\162\1\166\2\106\5\162"+
    "\1\233\7\162\1\164\1\165\1\106\3\162\1\167\2\106"+
    "\1\162\1\106\1\65\3\106\1\166\1\167\2\106\6\234"+
    "\1\166\2\106\5\234\1\235\7\234\1\171\1\236\1\106"+
    "\3\234\1\167\2\106\1\234\1\106\1\65\3\106\1\166"+
    "\1\167\2\106\6\172\1\166\2\106\5\172\1\235\7\172"+
    "\1\171\1\236\1\106\3\172\1\167\2\106\1\172\1\106"+
    "\1\65\2\106\1\54\1\0\3\54\6\200\1\0\2\54"+
    "\5\200\1\124\7\200\1\125\1\126\1\54\3\200\1\54"+
    "\1\173\1\54\1\200\4\54\1\106\1\0\1\106\1\174"+
    "\1\106\6\162\1\0\2\106\5\162\1\163\7\162\1\164"+
    "\1\165\1\106\3\162\3\106\1\162\5\106\1\0\3\106"+
    "\6\175\1\0\2\106\5\175\1\201\7\175\1\226\1\177"+
    "\1\106\3\175\3\106\1\175\5\106\1\0\3\106\6\175"+
    "\1\0\2\106\5\175\1\201\7\175\1\176\1\177\1\106"+
    "\3\175\3\106\1\175\5\106\1\0\3\106\6\232\1\0"+
    "\2\106\5\232\1\201\7\232\1\226\1\177\1\106\3\232"+
    "\3\106\1\232\4\106\1\54\1\0\3\54\6\200\1\0"+
    "\2\54\5\200\1\201\7\200\1\54\1\126\1\54\3\200"+
    "\3\54\1\200\4\54\1\106\1\0\1\106\1\174\1\106"+
    "\6\162\1\0\2\106\5\162\1\174\7\162\1\164\1\165"+
    "\1\106\3\162\3\106\1\162\4\106\1\54\1\0\3\54"+
    "\6\202\1\0\2\54\5\202\1\124\7\202\1\125\1\131"+
    "\1\54\3\202\1\54\1\63\1\54\1\202\4\54\1\132"+
    "\1\0\3\132\6\203\1\0\2\132\5\203\1\134\7\203"+
    "\1\132\1\204\1\132\3\203\3\132\1\203\5\132\1\0"+
    "\11\132\1\0\7\132\1\134\10\132\1\204\14\132\42\0"+
    "\1\237\13\0\6\12\3\0\5\12\1\0\1\240\6\12"+
    "\3\0\3\12\3\0\1\12\11\0\6\12\3\0\5\12"+
    "\1\0\1\12\1\241\5\12\3\0\3\12\3\0\1\12"+
    "\27\0\1\210\32\0\6\242\3\0\5\242\1\210\7\242"+
    "\1\0\1\211\1\0\3\242\3\0\1\242\11\0\1\243"+
    "\5\41\3\0\5\41\1\42\7\41\1\0\1\74\1\44"+
    "\3\41\3\0\1\41\4\0\1\213\1\0\11\213\1\0"+
    "\1\244\34\213\5\0\6\12\3\0\4\12\1\245\1\0"+
    "\7\12\3\0\3\12\3\0\1\12\4\0\1\246\1\0"+
    "\3\246\6\247\1\0\2\246\5\247\1\250\7\247\3\246"+
    "\3\247\3\246\1\247\4\246\1\251\1\0\3\251\6\252"+
    "\1\0\2\251\5\252\1\253\7\252\3\251\3\252\3\251"+
    "\1\252\4\251\1\217\1\0\11\217\1\0\35\217\1\106"+
    "\1\111\1\114\1\115\1\106\6\175\1\111\2\106\5\175"+
    "\1\220\7\175\1\176\1\177\1\106\3\175\1\114\2\106"+
    "\1\175\1\121\1\65\2\106\1\54\1\166\1\223\2\54"+
    "\6\254\1\166\2\54\5\254\1\170\7\254\1\221\1\126"+
    "\1\54\3\254\1\223\2\54\1\254\1\54\1\65\3\54"+
    "\2\111\1\56\1\54\6\255\1\111\2\54\5\255\1\256"+
    "\7\255\1\257\1\222\1\54\3\255\1\111\2\54\1\255"+
    "\1\113\1\65\3\54\1\166\1\223\10\54\1\166\7\54"+
    "\1\106\15\54\1\223\4\54\1\65\3\54\1\166\1\223"+
    "\2\54\6\224\1\166\2\54\5\224\1\170\7\224\1\257"+
    "\1\225\1\54\3\224\1\223\2\54\1\224\1\54\1\65"+
    "\3\54\1\166\1\223\2\54\6\255\1\166\2\54\5\255"+
    "\1\170\7\255\1\257\1\225\1\54\3\255\1\223\2\54"+
    "\1\255\1\54\1\65\2\54\1\106\1\0\3\106\6\260"+
    "\1\0\2\106\5\260\1\163\7\260\1\226\1\236\1\106"+
    "\3\260\3\106\1\260\5\106\1\0\3\106\6\227\1\0"+
    "\2\106\5\227\1\155\7\227\1\106\1\231\1\106\3\227"+
    "\3\106\1\227\5\106\1\0\3\106\6\227\1\0\2\106"+
    "\5\227\1\155\7\227\1\230\1\231\1\106\3\227\3\106"+
    "\1\227\5\106\1\0\11\106\1\0\7\106\1\155\10\106"+
    "\1\231\15\106\1\0\3\106\6\232\1\0\2\106\5\232"+
    "\1\163\7\232\1\226\1\236\1\106\3\232\3\106\1\232"+
    "\5\106\1\166\1\167\1\174\1\106\6\162\1\166\2\106"+
    "\5\162\1\235\7\162\1\164\1\165\1\106\3\162\1\167"+
    "\2\106\1\162\1\106\1\65\3\106\1\166\1\167\2\106"+
    "\6\234\1\166\2\106\5\234\1\235\7\234\1\230\1\236"+
    "\1\106\3\234\1\167\2\106\1\234\1\106\1\65\3\106"+
    "\1\166\1\167\2\106\6\227\1\166\2\106\5\227\1\235"+
    "\7\227\1\230\1\231\1\106\3\227\1\167\2\106\1\227"+
    "\1\106\1\65\3\106\1\0\3\106\6\227\1\0\2\106"+
    "\5\227\1\163\7\227\1\230\1\236\1\106\3\227\3\106"+
    "\1\227\4\106\5\0\6\261\3\0\5\261\1\0\7\261"+
    "\3\0\3\261\3\0\1\261\11\0\1\262\5\12\3\0"+
    "\5\12\1\0\7\12\3\0\3\12\3\0\1\12\11\0"+
    "\6\242\3\0\5\242\1\210\7\242\3\0\3\242\3\0"+
    "\1\242\4\0\1\244\1\0\11\244\1\0\1\263\34\244"+
    "\1\264\1\0\3\264\6\265\1\0\2\264\5\265\1\266"+
    "\7\265\3\264\3\265\3\264\1\265\4\264\1\246\1\0"+
    "\11\246\1\0\7\246\1\250\25\246\1\251\1\0\11\251"+
    "\1\0\7\251\1\253\25\251\1\54\1\166\1\223\2\54"+
    "\6\254\1\166\2\54\5\254\1\170\7\254\1\54\1\126"+
    "\1\54\3\254\1\223\2\54\1\254\1\54\1\65\3\54"+
    "\1\166\1\223\2\54\6\255\1\166\2\54\5\255\1\267"+
    "\7\255\1\257\2\54\3\255\1\223\2\54\1\255\1\54"+
    "\1\65\2\54\1\106\1\111\1\114\1\115\1\106\6\162"+
    "\1\111\2\106\5\162\1\270\7\162\1\164\1\165\1\106"+
    "\3\162\1\114\2\106\1\162\1\121\1\65\2\106\1\54"+
    "\1\166\1\223\2\54\6\271\1\166\2\54\5\271\1\267"+
    "\7\271\1\257\2\54\3\271\1\223\2\54\1\271\1\54"+
    "\1\65\2\54\1\106\1\0\3\106\6\260\1\0\2\106"+
    "\5\260\1\163\7\260\1\230\1\236\1\106\3\260\3\106"+
    "\1\260\4\106\5\0\6\261\3\0\5\261\1\0\7\261"+
    "\1\272\2\0\3\261\1\0\1\273\1\0\1\261\4\0"+
    "\1\274\1\0\3\274\6\275\1\0\2\274\5\275\1\276"+
    "\7\275\3\274\3\275\3\274\1\275\4\274\1\264\1\0"+
    "\11\264\1\0\7\264\1\266\25\264\1\106\1\166\1\167"+
    "\10\106\1\166\7\106\1\277\15\106\1\167\4\106\1\65"+
    "\3\106\1\111\1\114\1\115\1\106\6\162\1\111\2\106"+
    "\5\162\1\300\7\162\1\164\1\165\1\106\3\162\1\114"+
    "\2\106\1\162\1\121\1\65\2\106\1\54\1\166\1\223"+
    "\2\54\6\271\1\166\2\54\5\271\1\267\7\271\3\54"+
    "\3\271\1\223\2\54\1\271\1\54\1\65\2\54\5\0"+
    "\6\301\3\0\5\301\1\0\7\301\1\272\2\0\3\301"+
    "\1\0\1\273\1\0\1\301\27\0\1\302\25\0\1\274"+
    "\1\0\11\274\1\0\7\274\1\276\25\274\1\106\1\111"+
    "\1\114\1\160\1\106\6\227\1\111\2\106\5\227\1\300"+
    "\7\227\1\230\1\231\1\106\3\227\1\114\2\106\1\227"+
    "\1\121\1\65\2\106\5\0\6\301\3\0\5\301\1\0"+
    "\7\301\1\303\2\0\3\301\1\0\1\273\1\0\1\301"+
    "\11\0\6\304\3\0\5\304\1\0\7\304\1\303\2\0"+
    "\3\304\1\0\1\273\1\0\1\304\11\0\6\304\3\0"+
    "\5\304\1\0\7\304\3\0\3\304\1\0\1\273\1\0"+
    "\1\304\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7298];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\1\0\10\1\5\0\5\1\1\0"+
    "\4\1\2\0\1\11\5\0\4\1\3\0\2\1\6\0"+
    "\4\1\7\0\4\1\7\0\4\1\3\0\1\1\7\0"+
    "\5\1\1\0\2\1\1\0\1\11\1\1\2\0\5\1"+
    "\4\0\4\1\2\0\3\1\1\0\4\1\1\0\1\1"+
    "\1\0\2\1\1\0\4\1\2\0\5\1\5\0\11\1"+
    "\1\0\4\1\1\0\1\1\1\0\2\1\1\0\2\1"+
    "\2\0\1\1\1\0\1\1\1\0\2\1\1\0\2\1"+
    "\1\0\1\1\4\0\4\1\1\0\1\1\2\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[196];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  RythmLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            }
          case 17: break;
          case 2: 
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            }
          case 18: break;
          case 3: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_KEY;
            }
          case 19: break;
          case 4: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_METHOD;
            }
          case 20: break;
          case 5: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_IF;
            }
          case 21: break;
          case 6: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_FOR;
            }
          case 22: break;
          case 7: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_I_18_N;
            }
          case 23: break;
          case 8: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_ARGS;
            }
          case 24: break;
          case 9: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_ELSE;
            }
          case 25: break;
          case 10: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_RENDER;
            }
          case 26: break;
          case 11: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_INVOKE;
            }
          case 27: break;
          case 12: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_IMPORT;
            }
          case 28: break;
          case 13: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_PREFIX;
            }
          case 29: break;
          case 14: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_SECTION;
            }
          case 30: break;
          case 15: 
            { yybegin(YYINITIAL); return RythmTypes.RYTHM_EXTENDS;
            }
          case 31: break;
          case 16: 
            { yybegin(YYINITIAL); return RythmTypes.SCRIPT;
            }
          case 32: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
