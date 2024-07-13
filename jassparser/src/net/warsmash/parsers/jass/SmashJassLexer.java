/* The following code was generated by JFlex 1.7.0 */

/*
 * Lex file for SmashJass
 */
package net.warsmash.parsers.jass;
import com.etheller.warsmash.util.RawcodeUtils;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>SmashJassLexer.flex</tt>
 */
class SmashJassLexer {

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
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\45\1\33\1\35\1\35\1\34\22\0\1\45\1\52\1\32"+
    "\1\0\1\41\2\0\1\42\1\55\1\56\1\47\1\2\1\57\1\3"+
    "\1\0\1\46\1\36\11\37\1\0\1\43\1\50\1\1\1\51\2\0"+
    "\6\40\24\44\1\53\1\0\1\54\1\0\1\44\1\0\1\10\1\7"+
    "\1\22\1\14\1\12\1\20\1\4\1\25\1\16\1\44\1\23\1\5"+
    "\1\44\1\13\1\6\1\27\1\44\1\24\1\11\1\15\1\21\1\17"+
    "\1\31\1\30\1\26\1\44\12\0\1\35\u1fa2\0\1\35\1\35\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\16\5\1\1\2\6"+
    "\2\7\1\10\1\1\1\11\1\12\1\13\1\14\1\15"+
    "\1\1\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\2\5\1\30\16\5\1\31\5\5"+
    "\1\0\1\32\1\33\2\0\1\34\1\0\1\35\1\36"+
    "\1\37\3\5\1\40\1\5\1\41\4\5\1\42\14\5"+
    "\2\0\1\34\1\5\1\43\2\5\1\44\10\5\1\45"+
    "\2\5\1\46\1\47\1\50\3\5\1\51\1\5\1\52"+
    "\1\34\1\0\1\52\1\5\1\53\1\54\3\5\1\55"+
    "\5\5\1\56\1\57\1\60\4\5\1\61\6\5\1\62"+
    "\2\5\1\63\1\64\1\5\1\65\1\5\1\66\1\5"+
    "\1\67\2\5\1\70\2\5\1\71\1\72\1\73\2\5"+
    "\1\74\1\5\1\75";

  private static int [] zzUnpackAction() {
    int [] result = new int[179];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0"+
    "\0\u0300\0\u0330\0\u0360\0\u0390\0\60\0\u03c0\0\u03f0\0\u0420"+
    "\0\u0450\0\u0480\0\u04b0\0\u04e0\0\60\0\u0510\0\u0540\0\u0570"+
    "\0\60\0\60\0\60\0\60\0\60\0\60\0\60\0\60"+
    "\0\60\0\60\0\u05a0\0\u05d0\0\u0180\0\u0600\0\u0630\0\u0660"+
    "\0\u0690\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0"+
    "\0\u0810\0\u0840\0\u0870\0\u0180\0\u08a0\0\u08d0\0\u0900\0\u0930"+
    "\0\u0960\0\u0390\0\u0390\0\u0990\0\u09c0\0\u09f0\0\u09f0\0\u0a20"+
    "\0\60\0\60\0\60\0\u0a50\0\u0a80\0\u0ab0\0\u0180\0\u0ae0"+
    "\0\u0180\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30"+
    "\0\u0c60\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0"+
    "\0\u0de0\0\u0e10\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0\0\u0180\0\u0f00"+
    "\0\u0f30\0\u0f60\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050\0\u1080"+
    "\0\u10b0\0\u10e0\0\u0180\0\u1110\0\u1140\0\u0180\0\u0180\0\u0180"+
    "\0\u1170\0\u11a0\0\u11d0\0\u0180\0\u1200\0\u1230\0\u0e70\0\u0ea0"+
    "\0\u0e70\0\u1260\0\u0180\0\u0180\0\u1290\0\u12c0\0\u12f0\0\u0180"+
    "\0\u1320\0\u1350\0\u1380\0\u13b0\0\u13e0\0\u0180\0\u0180\0\u0180"+
    "\0\u1410\0\u1440\0\u1470\0\u14a0\0\u0180\0\u14d0\0\u1500\0\u1530"+
    "\0\u1560\0\u1590\0\u15c0\0\u0180\0\u15f0\0\u1620\0\u1650\0\u0180"+
    "\0\u1680\0\u0180\0\u16b0\0\u0180\0\u16e0\0\u0180\0\u1710\0\u1740"+
    "\0\u0180\0\u1770\0\u17a0\0\u0180\0\u0180\0\u0180\0\u17d0\0\u1800"+
    "\0\u0180\0\u1830\0\u0180";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[179];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\11"+
    "\1\21\1\11\1\22\1\11\1\23\5\11\1\24\1\25"+
    "\1\26\1\2\1\27\1\30\1\11\1\31\1\32\1\2"+
    "\1\11\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\61\0\1\46\57\0\1\47"+
    "\1\50\56\0\1\51\1\0\1\52\60\0\1\11\1\53"+
    "\24\11\4\0\3\11\3\0\1\11\17\0\2\11\1\54"+
    "\23\11\4\0\3\11\3\0\1\11\17\0\20\11\1\55"+
    "\5\11\4\0\3\11\3\0\1\11\17\0\26\11\4\0"+
    "\3\11\3\0\1\11\17\0\7\11\1\56\10\11\1\57"+
    "\5\11\4\0\3\11\3\0\1\11\17\0\6\11\1\60"+
    "\17\11\4\0\3\11\3\0\1\11\17\0\1\11\1\61"+
    "\5\11\1\62\14\11\1\63\1\11\4\0\3\11\3\0"+
    "\1\11\17\0\2\11\1\64\1\11\1\65\10\11\1\66"+
    "\10\11\4\0\3\11\3\0\1\11\17\0\6\11\1\67"+
    "\17\11\4\0\3\11\3\0\1\11\17\0\4\11\1\70"+
    "\13\11\1\71\1\72\1\73\3\11\4\0\3\11\3\0"+
    "\1\11\17\0\14\11\1\74\11\11\4\0\3\11\3\0"+
    "\1\11\17\0\4\11\1\75\10\11\1\76\10\11\4\0"+
    "\3\11\3\0\1\11\17\0\2\11\1\77\1\11\1\100"+
    "\21\11\4\0\3\11\3\0\1\11\17\0\6\11\1\101"+
    "\17\11\4\0\3\11\3\0\1\11\13\0\32\102\1\103"+
    "\3\0\22\102\33\0\1\25\54\0\1\104\11\0\1\105"+
    "\53\0\2\30\2\0\1\105\53\0\3\31\17\0\33\106"+
    "\3\0\4\106\1\107\15\106\45\0\1\33\60\0\1\110"+
    "\12\0\1\111\57\0\1\112\57\0\1\113\62\0\2\11"+
    "\1\114\23\11\4\0\3\11\3\0\1\11\17\0\2\11"+
    "\1\115\13\11\1\116\7\11\4\0\3\11\3\0\1\11"+
    "\17\0\10\11\1\117\15\11\4\0\3\11\3\0\1\11"+
    "\17\0\20\11\1\120\5\11\4\0\3\11\3\0\1\11"+
    "\17\0\11\11\1\121\14\11\4\0\3\11\3\0\1\11"+
    "\17\0\5\11\1\122\20\11\4\0\3\11\3\0\1\11"+
    "\17\0\10\11\1\123\15\11\4\0\3\11\3\0\1\11"+
    "\17\0\11\11\1\124\1\125\13\11\4\0\3\11\3\0"+
    "\1\11\17\0\11\11\1\126\14\11\4\0\3\11\3\0"+
    "\1\11\17\0\11\11\1\127\14\11\4\0\3\11\3\0"+
    "\1\11\17\0\1\11\1\130\24\11\4\0\3\11\3\0"+
    "\1\11\17\0\3\11\1\131\22\11\4\0\3\11\3\0"+
    "\1\11\17\0\17\11\1\132\6\11\4\0\3\11\3\0"+
    "\1\11\17\0\15\11\1\133\10\11\4\0\3\11\3\0"+
    "\1\11\17\0\6\11\1\134\17\11\4\0\3\11\3\0"+
    "\1\11\17\0\23\11\1\135\2\11\4\0\3\11\3\0"+
    "\1\11\17\0\1\11\1\136\24\11\4\0\3\11\3\0"+
    "\1\11\17\0\7\11\1\137\16\11\4\0\3\11\3\0"+
    "\1\11\17\0\7\11\1\140\16\11\4\0\3\11\3\0"+
    "\1\11\17\0\1\11\1\141\24\11\4\0\3\11\3\0"+
    "\1\11\17\0\11\11\1\142\14\11\4\0\3\11\3\0"+
    "\1\11\22\0\2\104\1\0\1\104\1\0\1\104\3\0"+
    "\1\104\1\0\1\104\13\0\3\104\17\0\33\143\3\0"+
    "\22\143\33\144\3\0\4\144\1\145\15\144\33\110\1\25"+
    "\1\26\1\0\22\110\4\0\3\11\1\146\22\11\4\0"+
    "\3\11\3\0\1\11\17\0\23\11\1\147\2\11\4\0"+
    "\3\11\3\0\1\11\17\0\4\11\1\150\21\11\4\0"+
    "\3\11\3\0\1\11\17\0\4\11\1\151\21\11\4\0"+
    "\3\11\3\0\1\11\17\0\6\11\1\152\17\11\4\0"+
    "\3\11\3\0\1\11\17\0\1\153\1\154\10\11\1\155"+
    "\1\11\1\156\11\11\4\0\3\11\3\0\1\11\17\0"+
    "\6\11\1\157\17\11\4\0\3\11\3\0\1\11\17\0"+
    "\11\11\1\160\14\11\4\0\3\11\3\0\1\11\17\0"+
    "\21\11\1\161\4\11\4\0\3\11\3\0\1\11\17\0"+
    "\12\11\1\162\13\11\4\0\3\11\3\0\1\11\17\0"+
    "\1\11\1\163\24\11\4\0\3\11\3\0\1\11\17\0"+
    "\15\11\1\164\10\11\4\0\3\11\3\0\1\11\17\0"+
    "\6\11\1\165\17\11\4\0\3\11\3\0\1\11\17\0"+
    "\6\11\1\166\17\11\4\0\3\11\3\0\1\11\17\0"+
    "\7\11\1\167\16\11\4\0\3\11\3\0\1\11\17\0"+
    "\6\11\1\170\17\11\4\0\3\11\3\0\1\11\17\0"+
    "\5\11\1\171\20\11\4\0\3\11\3\0\1\11\17\0"+
    "\16\11\1\172\7\11\4\0\3\11\3\0\1\11\17\0"+
    "\5\11\1\173\20\11\4\0\3\11\3\0\1\11\17\0"+
    "\1\11\1\174\24\11\4\0\3\11\3\0\1\11\17\0"+
    "\15\11\1\175\10\11\4\0\3\11\3\0\1\11\55\0"+
    "\1\176\15\0\33\144\3\0\4\144\1\177\50\144\3\0"+
    "\2\200\2\144\1\177\1\201\14\144\4\0\4\11\1\202"+
    "\21\11\4\0\3\11\3\0\1\11\17\0\1\11\1\203"+
    "\24\11\4\0\3\11\3\0\1\11\17\0\22\11\1\204"+
    "\3\11\4\0\3\11\3\0\1\11\17\0\12\11\1\205"+
    "\13\11\4\0\3\11\3\0\1\11\17\0\1\11\1\206"+
    "\24\11\4\0\3\11\3\0\1\11\17\0\2\11\1\207"+
    "\23\11\4\0\3\11\3\0\1\11\17\0\14\11\1\210"+
    "\11\11\4\0\3\11\3\0\1\11\17\0\15\11\1\211"+
    "\10\11\4\0\3\11\3\0\1\11\17\0\7\11\1\212"+
    "\16\11\4\0\3\11\3\0\1\11\17\0\25\11\1\213"+
    "\4\0\3\11\3\0\1\11\17\0\12\11\1\214\13\11"+
    "\4\0\3\11\3\0\1\11\17\0\13\11\1\215\12\11"+
    "\4\0\3\11\3\0\1\11\17\0\1\216\25\11\4\0"+
    "\3\11\3\0\1\11\17\0\5\11\1\217\20\11\4\0"+
    "\3\11\3\0\1\11\17\0\6\11\1\220\17\11\4\0"+
    "\3\11\3\0\1\11\17\0\11\11\1\221\14\11\4\0"+
    "\3\11\3\0\1\11\17\0\11\11\1\222\14\11\4\0"+
    "\3\11\3\0\1\11\17\0\20\11\1\223\5\11\4\0"+
    "\3\11\3\0\1\11\51\0\2\176\24\0\1\11\1\224"+
    "\24\11\4\0\3\11\3\0\1\11\17\0\14\11\1\225"+
    "\11\11\4\0\3\11\3\0\1\11\17\0\2\11\1\226"+
    "\23\11\4\0\3\11\3\0\1\11\17\0\2\11\1\227"+
    "\23\11\4\0\3\11\3\0\1\11\17\0\7\11\1\230"+
    "\16\11\4\0\3\11\3\0\1\11\17\0\10\11\1\231"+
    "\15\11\4\0\3\11\3\0\1\11\17\0\21\11\1\232"+
    "\4\11\4\0\3\11\3\0\1\11\17\0\7\11\1\233"+
    "\16\11\4\0\3\11\3\0\1\11\17\0\6\11\1\234"+
    "\17\11\4\0\3\11\3\0\1\11\17\0\12\11\1\235"+
    "\13\11\4\0\3\11\3\0\1\11\17\0\4\11\1\236"+
    "\21\11\4\0\3\11\3\0\1\11\17\0\7\11\1\237"+
    "\16\11\4\0\3\11\3\0\1\11\17\0\5\11\1\240"+
    "\20\11\4\0\3\11\3\0\1\11\17\0\3\11\1\241"+
    "\22\11\4\0\3\11\3\0\1\11\17\0\23\11\1\242"+
    "\2\11\4\0\3\11\3\0\1\11\17\0\16\11\1\243"+
    "\7\11\4\0\3\11\3\0\1\11\17\0\5\11\1\244"+
    "\20\11\4\0\3\11\3\0\1\11\17\0\6\11\1\245"+
    "\17\11\4\0\3\11\3\0\1\11\17\0\1\246\25\11"+
    "\4\0\3\11\3\0\1\11\17\0\2\11\1\247\23\11"+
    "\4\0\3\11\3\0\1\11\17\0\7\11\1\250\16\11"+
    "\4\0\3\11\3\0\1\11\17\0\5\11\1\251\20\11"+
    "\4\0\3\11\3\0\1\11\17\0\4\11\1\252\21\11"+
    "\4\0\3\11\3\0\1\11\17\0\11\11\1\253\14\11"+
    "\4\0\3\11\3\0\1\11\17\0\7\11\1\254\16\11"+
    "\4\0\3\11\3\0\1\11\17\0\7\11\1\255\16\11"+
    "\4\0\3\11\3\0\1\11\17\0\11\11\1\256\14\11"+
    "\4\0\3\11\3\0\1\11\17\0\1\11\1\257\24\11"+
    "\4\0\3\11\3\0\1\11\17\0\12\11\1\260\13\11"+
    "\4\0\3\11\3\0\1\11\17\0\5\11\1\261\20\11"+
    "\4\0\3\11\3\0\1\11\17\0\2\11\1\262\23\11"+
    "\4\0\3\11\3\0\1\11\17\0\7\11\1\263\16\11"+
    "\4\0\3\11\3\0\1\11\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6240];
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\22\1\1\11\7\1\1\11\3\1\12\11"+
    "\27\1\1\0\2\1\2\0\1\1\1\0\3\11\27\1"+
    "\2\0\33\1\1\0\63\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[179];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

	private Object yylval;
	public Object getLVal() {
		return yylval;
	}
	
	public int getLine() {
		return yyline;
	}
	
	public int getColumn() {
		return yycolumn;
	}
	


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  SmashJassLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 172) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
          { return 0; }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new IllegalStateException("Unexpected character '" + yytext() + "'");
            } 
            // fall through
          case 62: break;
          case 2: 
            { return SmashJassParser.Lexer.EQUALS;
            } 
            // fall through
          case 63: break;
          case 3: 
            { return SmashJassParser.Lexer.PLUS;
            } 
            // fall through
          case 64: break;
          case 4: 
            { return SmashJassParser.Lexer.MINUS;
            } 
            // fall through
          case 65: break;
          case 5: 
            { yylval = yytext();
	return SmashJassParser.Lexer.ID;
            } 
            // fall through
          case 66: break;
          case 6: 
            { return SmashJassParser.Lexer.NEWLINE;
            } 
            // fall through
          case 67: break;
          case 7: 
            { yylval = (int) Long.parseLong(yytext());
	return SmashJassParser.Lexer.INTEGER;
            } 
            // fall through
          case 68: break;
          case 8: 
            { yylval = Integer.parseInt(yytext().substring(1), 16);
	return SmashJassParser.Lexer.DOLLAR_HEX_CONSTANT;
            } 
            // fall through
          case 69: break;
          case 9: 
            { /* skip this */
            } 
            // fall through
          case 70: break;
          case 10: 
            { return SmashJassParser.Lexer.DIVIDE;
            } 
            // fall through
          case 71: break;
          case 11: 
            { return SmashJassParser.Lexer.TIMES;
            } 
            // fall through
          case 72: break;
          case 12: 
            { return SmashJassParser.Lexer.LESS;
            } 
            // fall through
          case 73: break;
          case 13: 
            { return SmashJassParser.Lexer.GREATER;
            } 
            // fall through
          case 74: break;
          case 14: 
            { return SmashJassParser.Lexer.OPEN_BRACKET;
            } 
            // fall through
          case 75: break;
          case 15: 
            { return SmashJassParser.Lexer.CLOSE_BRACKET;
            } 
            // fall through
          case 76: break;
          case 16: 
            { return SmashJassParser.Lexer.OPEN_PAREN;
            } 
            // fall through
          case 77: break;
          case 17: 
            { return SmashJassParser.Lexer.CLOSE_PAREN;
            } 
            // fall through
          case 78: break;
          case 18: 
            { return SmashJassParser.Lexer.COMMA;
            } 
            // fall through
          case 79: break;
          case 19: 
            { return SmashJassParser.Lexer.DOUBLE_EQUALS;
            } 
            // fall through
          case 80: break;
          case 20: 
            { return SmashJassParser.Lexer.PLUSEQUALS;
            } 
            // fall through
          case 81: break;
          case 21: 
            { return SmashJassParser.Lexer.PLUSPLUS;
            } 
            // fall through
          case 82: break;
          case 22: 
            { return SmashJassParser.Lexer.MINUSEQUALS;
            } 
            // fall through
          case 83: break;
          case 23: 
            { return SmashJassParser.Lexer.MINUSMINUS;
            } 
            // fall through
          case 84: break;
          case 24: 
            { return SmashJassParser.Lexer.OR;
            } 
            // fall through
          case 85: break;
          case 25: 
            { return SmashJassParser.Lexer.IF;
            } 
            // fall through
          case 86: break;
          case 26: 
            { final String stringLiteralText = yytext();
	final String parsedString = stringLiteralText.substring(1, stringLiteralText.length() - 1).replace("\\\\", "\\");
	yylval = parsedString;
	return SmashJassParser.Lexer.STRING_LITERAL;
            } 
            // fall through
          case 87: break;
          case 27: 
            { yylval = (int) (Long.parseLong(yytext().substring(2), 16) & 0xFFFFFFFF);
	return SmashJassParser.Lexer.HEX_CONSTANT;
            } 
            // fall through
          case 88: break;
          case 28: 
            { final String stringLiteralText = yytext();
	String parsedString = stringLiteralText.substring(1, stringLiteralText.length() - 1).replace("\\\\", "\\");
	while (parsedString.length() < 4) {
		parsedString += '\0';
	}
	yylval = RawcodeUtils.toInt(parsedString);
	return SmashJassParser.Lexer.RAWCODE;
            } 
            // fall through
          case 89: break;
          case 29: 
            { return SmashJassParser.Lexer.LESS_EQUALS;
            } 
            // fall through
          case 90: break;
          case 30: 
            { return SmashJassParser.Lexer.GREATER_EQUALS;
            } 
            // fall through
          case 91: break;
          case 31: 
            { return SmashJassParser.Lexer.NOT_EQUALS;
            } 
            // fall through
          case 92: break;
          case 32: 
            { return SmashJassParser.Lexer.AND;
            } 
            // fall through
          case 93: break;
          case 33: 
            { return SmashJassParser.Lexer.SET;
            } 
            // fall through
          case 94: break;
          case 34: 
            { return SmashJassParser.Lexer.NOT;
            } 
            // fall through
          case 95: break;
          case 35: 
            { return SmashJassParser.Lexer.LOOP;
            } 
            // fall through
          case 96: break;
          case 36: 
            { return SmashJassParser.Lexer.ELSE;
            } 
            // fall through
          case 97: break;
          case 37: 
            { return SmashJassParser.Lexer.NULL;
            } 
            // fall through
          case 98: break;
          case 38: 
            { return SmashJassParser.Lexer.TRUE;
            } 
            // fall through
          case 99: break;
          case 39: 
            { return SmashJassParser.Lexer.THEN;
            } 
            // fall through
          case 100: break;
          case 40: 
            { return SmashJassParser.Lexer.TYPE;
            } 
            // fall through
          case 101: break;
          case 41: 
            { return SmashJassParser.Lexer.CALL;
            } 
            // fall through
          case 102: break;
          case 42: 
            { yylval = Double.parseDouble(yytext());
	return SmashJassParser.Lexer.REAL;
            } 
            // fall through
          case 103: break;
          case 43: 
            { return SmashJassParser.Lexer.LOCAL;
            } 
            // fall through
          case 104: break;
          case 44: 
            { return SmashJassParser.Lexer.ARRAY;
            } 
            // fall through
          case 105: break;
          case 45: 
            { return SmashJassParser.Lexer.ENDIF;
            } 
            // fall through
          case 106: break;
          case 46: 
            { return SmashJassParser.Lexer.DEBUG;
            } 
            // fall through
          case 107: break;
          case 47: 
            { return SmashJassParser.Lexer.TAKES;
            } 
            // fall through
          case 108: break;
          case 48: 
            { return SmashJassParser.Lexer.FALSE;
            } 
            // fall through
          case 109: break;
          case 49: 
            { return SmashJassParser.Lexer.ELSEIF;
            } 
            // fall through
          case 110: break;
          case 50: 
            { return SmashJassParser.Lexer.NATIVE;
            } 
            // fall through
          case 111: break;
          case 51: 
            { return SmashJassParser.Lexer.RETURN;
            } 
            // fall through
          case 112: break;
          case 52: 
            { return SmashJassParser.Lexer.GLOBALS;
            } 
            // fall through
          case 113: break;
          case 53: 
            { return SmashJassParser.Lexer.ENDLOOP;
            } 
            // fall through
          case 114: break;
          case 54: 
            { return SmashJassParser.Lexer.EXTENDS;
            } 
            // fall through
          case 115: break;
          case 55: 
            { return SmashJassParser.Lexer.NOTHING;
            } 
            // fall through
          case 116: break;
          case 56: 
            { return SmashJassParser.Lexer.RETURNS;
            } 
            // fall through
          case 117: break;
          case 57: 
            { return SmashJassParser.Lexer.EXITWHEN;
            } 
            // fall through
          case 118: break;
          case 58: 
            { return SmashJassParser.Lexer.FUNCTION;
            } 
            // fall through
          case 119: break;
          case 59: 
            { return SmashJassParser.Lexer.CONSTANT;
            } 
            // fall through
          case 120: break;
          case 60: 
            { return SmashJassParser.Lexer.ENDGLOBALS;
            } 
            // fall through
          case 121: break;
          case 61: 
            { return SmashJassParser.Lexer.ENDFUNCTION;
            } 
            // fall through
          case 122: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}