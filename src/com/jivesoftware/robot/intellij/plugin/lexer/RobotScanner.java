/* The following code was generated by JFlex 1.4.3 on 3/4/14 4:54 PM */

/*
   Copyright 2010 - 2013 Ed Venaglia

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.jivesoftware.robot.intellij.plugin.lexer;

import com.intellij.psi.tree.IElementType;

//@SuppressWarnings({ "ALL" })


/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/4/14 4:54 PM from the specification file
 * <tt>/home/charles/Jive/hackday/robot-intellij-plugin/src/com/jivesoftware/robot/intellij/plugin/lexer/robot.flex</tt>
 */
class RobotScanner implements com.intellij.lexer.FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;
  private static final String ZZ_NL = System.getProperty("line.separator");

  /** lexical states */
  public static final int TEST_CASES_START_OF_LINE = 6;
  public static final int YYINITIAL = 0;
  public static final int TEST_CASES = 4;
  public static final int START_OF_LINE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /**
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED =
    "\11\0\1\4\1\2\2\0\1\1\22\0\1\5\2\0\1\6\1\3"+
    "\5\0\1\36\3\0\1\41\1\0\1\40\11\13\3\0\1\11\3\0"+
    "\2\12\1\37\1\25\16\12\1\12\1\20\6\12\1\16\1\0\1\17"+
    "\1\0\1\14\1\0\1\22\1\15\1\30\1\26\1\33\1\15\1\23"+
    "\1\15\1\35\3\15\1\32\1\34\1\27\3\15\1\24\1\21\1\31"+
    "\5\15\1\7\1\0\1\10\uff82\0";

  /**
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\2\1\1\10\1\11\2\12\1\11\1\13\2\14"+
    "\1\3\1\15\1\10\2\13\1\10\1\16\1\17\3\0"+
    "\4\1\2\0\2\20\1\1\4\0\2\13\2\0\1\21"+
    "\1\13\2\0\1\10\1\22\2\1\6\20\2\0\1\10"+
    "\1\22\4\21\1\23\2\1\4\20\1\0\1\23\2\21"+
    "\2\1\2\20\1\24\1\25\1\26\1\1\3\20\1\1"+
    "\3\20\1\1\2\20\1\1\2\20\1\1\1\20\1\27"+
    "\1\1\4\27\1\1\2\27\2\1\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[119];
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
    "\0\0\0\42\0\104\0\146\0\210\0\252\0\314\0\356"+
    "\0\u0110\0\u0110\0\u0132\0\u0154\0\u0176\0\u0198\0\u01ba\0\u01dc"+
    "\0\314\0\u01fe\0\314\0\u0220\0\u0242\0\u0264\0\314\0\u0286"+
    "\0\u02a8\0\u02ca\0\u02ec\0\u030e\0\u0330\0\314\0\u0352\0\u0374"+
    "\0\u0396\0\u03b8\0\u03da\0\u03fc\0\u041e\0\u0440\0\u0462\0\u0484"+
    "\0\u04a6\0\u04c8\0\u01dc\0\u04ea\0\u050c\0\u052e\0\u0550\0\u0572"+
    "\0\u0594\0\u05b6\0\u05d8\0\u05fa\0\u0330\0\u061c\0\u063e\0\u03da"+
    "\0\210\0\u0660\0\u0682\0\u06a4\0\u06c6\0\u06e8\0\u070a\0\u072c"+
    "\0\u074e\0\u0770\0\u0792\0\u0572\0\u0242\0\u07b4\0\u07d6\0\u07f8"+
    "\0\u081a\0\314\0\u083c\0\u085e\0\u0880\0\u08a2\0\u08c4\0\u08e6"+
    "\0\u0908\0\u092a\0\u094c\0\u096e\0\u0990\0\u09b2\0\u09d4\0\u09f6"+
    "\0\314\0\314\0\210\0\u0a18\0\u0a3a\0\u0a5c\0\u0a7e\0\u0aa0"+
    "\0\u0ac2\0\u0ae4\0\u0b06\0\u0b28\0\u0b4a\0\u0b6c\0\u0b8e\0\u0bb0"+
    "\0\u0bd2\0\u0bf4\0\u0c16\0\u0c38\0\u0c5a\0\u0c7c\0\u0c9e\0\u0cc0"+
    "\0\u0ce2\0\u0d04\0\u0d26\0\u0d48\0\u0d6a\0\u0d8c\0\210";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[119];
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
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\3\5"+
    "\1\14\1\15\2\5\1\16\1\5\1\14\4\5\1\14"+
    "\10\5\1\17\1\14\1\20\1\5\1\21\1\22\1\23"+
    "\1\24\36\21\1\25\1\26\1\27\1\30\1\11\1\12"+
    "\1\13\3\25\1\31\1\32\2\25\1\33\1\25\1\31"+
    "\4\25\1\31\10\25\1\34\1\31\1\35\1\25\1\36"+
    "\1\22\1\23\7\36\1\37\1\36\2\37\2\36\16\37"+
    "\1\36\1\37\2\36\1\5\4\0\1\40\34\5\2\0"+
    "\1\7\110\0\1\41\36\0\2\11\34\0\1\13\2\0"+
    "\37\13\1\5\4\0\1\42\4\5\2\14\1\5\1\14"+
    "\2\5\16\14\1\5\2\14\2\5\4\0\1\40\5\5"+
    "\1\15\24\5\1\15\1\43\1\5\4\0\1\40\4\5"+
    "\1\44\1\5\2\44\2\5\2\45\3\44\2\46\7\44"+
    "\1\5\1\44\3\5\3\0\1\47\1\50\4\5\1\51"+
    "\1\5\2\51\2\5\2\52\14\51\1\17\1\51\3\5"+
    "\4\0\1\40\5\5\1\53\24\5\1\53\1\43\2\0"+
    "\1\23\46\0\1\54\32\0\1\25\4\0\1\55\34\25"+
    "\2\0\1\27\46\0\1\56\32\0\1\25\4\0\1\57"+
    "\4\25\2\31\1\25\1\31\2\25\16\31\1\25\2\31"+
    "\2\25\4\0\1\55\5\25\1\32\24\25\1\32\1\60"+
    "\1\25\4\0\1\55\4\25\1\61\1\25\2\61\2\25"+
    "\16\61\1\25\1\61\3\25\3\0\1\62\1\63\4\25"+
    "\1\64\1\25\2\64\2\25\16\64\1\34\1\64\3\25"+
    "\4\0\1\55\5\25\1\65\24\25\1\65\1\60\5\0"+
    "\1\66\4\0\4\37\2\0\16\37\1\0\2\37\1\0"+
    "\1\5\5\0\34\5\12\0\1\67\1\0\2\67\2\0"+
    "\16\67\1\0\1\67\2\0\1\5\5\0\4\5\1\14"+
    "\5\5\1\14\4\5\1\14\11\5\1\14\3\5\4\0"+
    "\1\40\5\5\1\70\24\5\1\70\2\5\4\0\1\40"+
    "\4\5\4\44\1\5\1\71\16\44\1\5\2\44\2\5"+
    "\4\0\1\40\4\5\4\44\1\5\1\71\2\44\1\72"+
    "\13\44\1\5\2\44\2\5\4\0\1\40\4\5\4\44"+
    "\1\5\1\71\7\44\1\73\6\44\1\5\2\44\1\5"+
    "\4\0\2\47\4\0\1\74\1\0\2\74\2\0\2\75"+
    "\14\74\1\0\1\74\2\0\1\5\3\0\2\47\4\5"+
    "\1\51\1\5\2\51\2\5\2\52\14\51\1\5\1\51"+
    "\3\5\3\0\1\76\1\77\4\5\4\51\2\5\16\51"+
    "\1\100\2\51\2\5\3\0\1\76\1\77\4\5\4\51"+
    "\2\5\13\51\1\101\2\51\1\100\2\51\1\5\12\0"+
    "\1\102\1\0\2\102\2\0\16\102\1\0\1\102\2\0"+
    "\1\25\5\0\34\25\12\0\1\103\1\0\2\103\2\0"+
    "\16\103\1\0\1\103\2\0\1\25\5\0\4\25\1\31"+
    "\5\25\1\31\4\25\1\31\11\25\1\31\3\25\4\0"+
    "\1\55\5\25\1\104\24\25\1\104\2\25\4\0\1\55"+
    "\4\25\4\61\1\25\1\105\16\61\1\25\2\61\1\25"+
    "\4\0\2\62\4\0\1\106\1\0\2\106\2\0\16\106"+
    "\1\0\1\106\2\0\1\25\3\0\2\62\4\25\1\64"+
    "\1\25\2\64\2\25\16\64\1\25\1\64\3\25\3\0"+
    "\1\107\1\110\4\25\4\64\2\25\16\64\1\111\2\64"+
    "\1\25\12\0\1\37\1\0\2\37\2\0\16\37\1\0"+
    "\1\37\12\0\1\112\1\0\4\67\2\0\16\67\1\0"+
    "\2\67\1\0\1\5\4\0\1\40\4\5\4\44\1\5"+
    "\1\71\3\44\1\113\12\44\1\5\2\44\2\5\4\0"+
    "\1\40\4\5\4\44\1\5\1\71\10\44\1\114\5\44"+
    "\1\5\2\44\1\5\4\0\1\76\1\115\4\0\4\74"+
    "\2\0\16\74\1\116\2\74\5\0\1\76\1\115\4\0"+
    "\4\74\2\0\13\74\1\117\2\74\1\116\2\74\5\0"+
    "\2\76\30\0\1\116\3\0\1\5\3\0\2\76\4\5"+
    "\1\51\1\5\2\51\2\5\16\51\1\100\1\51\3\5"+
    "\4\0\1\40\30\5\1\100\4\5\3\0\1\76\1\77"+
    "\4\5\4\51\2\5\4\51\1\120\11\51\1\100\2\51"+
    "\1\5\10\0\1\121\1\0\4\102\2\0\16\102\1\0"+
    "\2\102\11\0\1\122\1\0\4\103\2\0\16\103\1\0"+
    "\2\103\5\0\1\107\1\123\4\0\4\106\2\0\16\106"+
    "\1\124\2\106\5\0\2\107\30\0\1\124\3\0\1\25"+
    "\3\0\2\107\4\25\1\64\1\25\2\64\2\25\16\64"+
    "\1\111\1\64\3\25\4\0\1\55\30\25\1\111\3\25"+
    "\1\5\4\0\1\40\4\5\4\44\1\5\1\71\4\44"+
    "\1\125\11\44\1\5\2\44\2\5\4\0\1\40\4\5"+
    "\4\44\1\5\1\71\11\44\1\126\4\44\1\5\2\44"+
    "\1\5\4\0\2\76\4\0\1\74\1\0\2\74\2\0"+
    "\16\74\1\116\1\74\40\0\1\116\7\0\1\76\1\115"+
    "\4\0\4\74\2\0\4\74\1\127\11\74\1\116\2\74"+
    "\1\0\1\5\3\0\1\76\1\77\4\5\4\51\2\5"+
    "\1\51\1\130\14\51\1\100\2\51\1\5\11\0\1\131"+
    "\41\0\1\132\34\0\2\107\4\0\1\106\1\0\2\106"+
    "\2\0\16\106\1\124\1\106\40\0\1\124\3\0\1\5"+
    "\4\0\1\40\4\5\4\44\1\5\1\133\16\44\1\5"+
    "\2\44\2\5\4\0\1\40\4\5\4\44\1\5\1\71"+
    "\12\44\1\134\3\44\1\5\2\44\1\5\4\0\1\76"+
    "\1\115\4\0\4\74\2\0\1\74\1\135\14\74\1\116"+
    "\2\74\1\0\1\5\3\0\1\76\1\136\4\5\4\51"+
    "\2\5\10\51\1\137\5\51\1\100\1\137\1\51\2\5"+
    "\4\0\1\40\4\5\4\44\1\5\1\71\13\44\1\140"+
    "\2\44\1\5\2\44\1\5\4\0\1\76\1\141\4\0"+
    "\4\74\2\0\10\74\1\142\5\74\1\116\1\142\1\74"+
    "\1\0\1\5\3\0\2\76\4\5\1\51\1\5\2\51"+
    "\2\5\10\51\1\137\5\51\1\100\1\137\3\5\3\0"+
    "\1\76\1\77\4\5\4\51\2\5\2\51\1\143\13\51"+
    "\1\100\2\51\2\5\4\0\1\40\4\5\4\44\1\5"+
    "\1\71\14\44\1\144\1\44\1\5\2\44\1\5\4\0"+
    "\2\76\4\0\1\74\1\0\2\74\2\0\10\74\1\142"+
    "\5\74\1\116\1\142\6\0\1\76\1\115\4\0\4\74"+
    "\2\0\2\74\1\145\13\74\1\116\2\74\1\0\1\5"+
    "\3\0\1\76\1\77\4\5\4\51\2\5\4\51\1\146"+
    "\11\51\1\100\2\51\2\5\4\0\1\40\4\5\4\44"+
    "\1\5\1\71\1\44\1\147\14\44\1\5\2\44\1\5"+
    "\4\0\1\76\1\115\4\0\4\74\2\0\4\74\1\150"+
    "\11\74\1\116\2\74\1\0\1\5\3\0\1\76\1\77"+
    "\4\5\4\51\2\5\13\51\1\151\2\51\1\100\2\51"+
    "\2\5\4\0\1\40\4\5\4\44\1\5\1\71\2\44"+
    "\1\152\13\44\1\5\2\44\1\5\4\0\1\76\1\115"+
    "\4\0\4\74\2\0\13\74\1\153\2\74\1\116\2\74"+
    "\1\0\1\5\3\0\1\76\1\77\4\5\4\51\2\5"+
    "\4\51\1\154\11\51\1\100\2\51\2\5\4\0\1\40"+
    "\4\5\4\44\1\5\1\71\1\44\1\155\14\44\1\5"+
    "\2\44\1\5\4\0\1\76\1\115\4\0\4\74\2\0"+
    "\4\74\1\156\11\74\1\116\2\74\1\0\1\5\3\0"+
    "\1\157\1\160\4\5\4\51\2\5\16\51\1\161\2\51"+
    "\2\5\4\0\1\40\4\5\4\44\1\5\1\71\15\44"+
    "\1\162\1\5\2\44\1\5\4\0\1\157\1\163\4\0"+
    "\4\74\2\0\16\74\1\164\2\74\5\0\2\157\30\0"+
    "\1\164\3\0\1\5\3\0\2\157\4\5\1\51\1\5"+
    "\2\51\2\5\16\51\1\161\1\51\3\5\4\0\1\40"+
    "\30\5\1\161\4\5\4\0\1\40\4\5\4\44\1\5"+
    "\1\71\7\44\1\165\6\44\1\5\2\44\1\5\4\0"+
    "\2\157\4\0\1\74\1\0\2\74\2\0\16\74\1\164"+
    "\1\74\40\0\1\164\3\0\1\5\4\0\1\40\4\5"+
    "\4\44\1\5\1\71\14\44\1\166\1\44\1\5\2\44"+
    "\2\5\4\0\1\40\4\5\4\44\1\5\1\167\16\44"+
    "\1\5\2\44\1\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3502];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\2\1\1\11\11\1\1\11\1\1\1\11\3\1"+
    "\1\11\6\1\1\11\1\1\3\0\4\1\2\0\3\1"+
    "\4\0\2\1\2\0\2\1\2\0\12\1\2\0\6\1"+
    "\1\11\6\1\1\0\7\1\2\11\35\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[119];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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

  /* user code: */
  public RobotScanner() {
    this((java.io.Reader)null);
  }

  int yyline, yycolumn, yychar;
  private boolean onTagsLine = false;
  private boolean onDocsLine = false;
  private boolean keywordToLeft = false;

  private static final void debug(RobotToken type) {
    System.out.println("Found token " + type.toString());
  }



  RobotScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  RobotScanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /**
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 110) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL.charAt(zzCurrentPosL)) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
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
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL.charAt(zzMarkedPosL) == '\n';
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
            zzPeek = zzBufferL.charAt(zzMarkedPosL) == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 10:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [133] { return RobotToken.NEWLINE_TOKEN; }");
          { return RobotToken.NEWLINE_TOKEN;
          }
        case 25: break;
        case 6:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [115] { return RobotToken.COMMENT_TOKEN; }");
          { return RobotToken.COMMENT_TOKEN;
          }
        case 26: break;
        case 14:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [161] { yypushback(1); yybegin(TEST_CASES); }");
          { yypushback(1); yybegin(TEST_CASES);
          }
        case 27: break;
        case 8:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [121] { return RobotToken.NUMBER_LITERAL_TOKEN; }");
          { return RobotToken.NUMBER_LITERAL_TOKEN;
          }
        case 28: break;
        case 4:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [123] { return RobotToken.COLUMN_SEP_TOKEN; }");
          { return RobotToken.COLUMN_SEP_TOKEN;
          }
        case 29: break;
        case 20:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [132] { yybegin(YYINITIAL); return RobotToken.ASSIGNMENT_TOKEN; }");
          { yybegin(YYINITIAL); return RobotToken.ASSIGNMENT_TOKEN;
          }
        case 30: break;
        case 7:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [117] { if (onTagsLine) { return RobotToken.TAG_TOKEN; }"+ZZ_NL+"                          if (onDocsLine) { return RobotToken.DOCUMENTATION_TOKEN;}"+ZZ_NL+"                          if (keywordToLeft) { return RobotToken.ROBOT_KEYWORD_ARG_TOKEN; }"+ZZ_NL+"                          keywordToLeft = true; return RobotToken.ROBOT_KEYWORD_TOKEN; }");
          { if (onTagsLine) { return RobotToken.TAG_TOKEN; }
                          if (onDocsLine) { return RobotToken.DOCUMENTATION_TOKEN;}
                          if (keywordToLeft) { return RobotToken.ROBOT_KEYWORD_ARG_TOKEN; }
                          keywordToLeft = true; return RobotToken.ROBOT_KEYWORD_TOKEN;
          }
        case 31: break;
        case 22:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [111] { onTagsLine = true; return RobotToken.META_INFO_TOKEN; }");
          { onTagsLine = true; return RobotToken.META_INFO_TOKEN;
          }
        case 32: break;
        case 1:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [122] { if (onTagsLine) { return RobotToken.TAG_TOKEN; } if (onDocsLine) { return RobotToken.DOCUMENTATION_TOKEN;} return RobotToken.ROBOT_KEYWORD_ARG_TOKEN; }");
          { if (onTagsLine) { return RobotToken.TAG_TOKEN; } if (onDocsLine) { return RobotToken.DOCUMENTATION_TOKEN;} return RobotToken.ROBOT_KEYWORD_ARG_TOKEN;
          }
        case 33: break;
        case 16:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [110] { return RobotToken.TABLE_HEADING_TOKEN; }");
          { return RobotToken.TABLE_HEADING_TOKEN;
          }
        case 34: break;
        case 23:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [109] { yybegin(TEST_CASES); return RobotToken.TEST_CASES_TABLE_HEADING_TOKEN; }");
          { yybegin(TEST_CASES); return RobotToken.TEST_CASES_TABLE_HEADING_TOKEN;
          }
        case 35: break;
        case 13:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [147] { if (keywordToLeft) { return RobotToken.ROBOT_KEYWORD_ARG_TOKEN; } keywordToLeft = true; return RobotToken.ROBOT_KEYWORD_TOKEN; }");
          { if (keywordToLeft) { return RobotToken.ROBOT_KEYWORD_ARG_TOKEN; } keywordToLeft = true; return RobotToken.ROBOT_KEYWORD_TOKEN;
          }
        case 36: break;
        case 24:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [112] { onDocsLine = true; return RobotToken.META_INFO_TOKEN; }");
          { onDocsLine = true; return RobotToken.META_INFO_TOKEN;
          }
        case 37: break;
        case 19:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [116] { return RobotToken.VARIABLE_TOKEN; }");
          { return RobotToken.VARIABLE_TOKEN;
          }
        case 38: break;
        case 15:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [159] { yybegin(TEST_CASES); return RobotToken.TEST_CASE_HEADER_TOKEN; }");
          { yybegin(TEST_CASES); return RobotToken.TEST_CASE_HEADER_TOKEN;
          }
        case 39: break;
        case 17:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [142] { yybegin(YYINITIAL); return RobotToken.TABLE_HEADING_TOKEN; }");
          { yybegin(YYINITIAL); return RobotToken.TABLE_HEADING_TOKEN;
          }
        case 40: break;
        case 3:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [126] { return RobotToken.BAD_CHAR_TOKEN; }");
          { return RobotToken.BAD_CHAR_TOKEN;
          }
        case 41: break;
        case 5:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [124] { return RobotToken.SINGLE_SPACE_TOKEN; }");
          { return RobotToken.SINGLE_SPACE_TOKEN;
          }
        case 42: break;
        case 9:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [134] { System.out.println(\"Matched . as: \'\" + yytext() + \"\'\"); yypushback(1); yybegin(YYINITIAL); }");
          { System.out.println("Matched . as: '" + yytext() + "'"); yypushback(1); yybegin(YYINITIAL);
          }
        case 43: break;
        case 11:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [149] { return RobotToken.ROBOT_KEYWORD_ARG_TOKEN; }");
          { return RobotToken.ROBOT_KEYWORD_ARG_TOKEN;
          }
        case 44: break;
        case 2:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [108] { onTagsLine = onDocsLine = keywordToLeft = false; yybegin(START_OF_LINE); return RobotToken.NEWLINE_TOKEN; }");
          { onTagsLine = onDocsLine = keywordToLeft = false; yybegin(START_OF_LINE); return RobotToken.NEWLINE_TOKEN;
          }
        case 45: break;
        case 21:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [146] { return RobotToken.ASSIGNMENT_TOKEN; }");
          { return RobotToken.ASSIGNMENT_TOKEN;
          }
        case 46: break;
        case 12:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [141] { yybegin(START_OF_LINE); keywordToLeft = false; return RobotToken.NEWLINE_TOKEN; }");
          { yybegin(START_OF_LINE); keywordToLeft = false; return RobotToken.NEWLINE_TOKEN;
          }
        case 47: break;
        case 18:
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [113] { return RobotToken.META_INFO_TOKEN; }");
          { return RobotToken.META_INFO_TOKEN;
          }
        case 48: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case TEST_CASES_START_OF_LINE: {
              System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: <<EOF>>");
              System.out.println("action [162] { yybegin(YYINITIAL); }");
              yybegin(YYINITIAL);
            }
            case 120: break;
            case YYINITIAL: {
              System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: <<EOF>>");
              System.out.println("action [128] { return null; }");
              return null;
            }
            case 121: break;
            case TEST_CASES: {
              System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: <<EOF>>");
              System.out.println("action [155] { yybegin(YYINITIAL); }");
              yybegin(YYINITIAL);
            }
            case 122: break;
            case START_OF_LINE: {
              System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: <<EOF>>");
              System.out.println("action [135] { yybegin(YYINITIAL); }");
              yybegin(YYINITIAL);
            }
            case 123: break;
            default:
            return null;
            }
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java RobotScanner <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        RobotScanner scanner = null;
        try {
          scanner = new RobotScanner( new java.io.FileReader(argv[i]) );
          do {
            System.out.println(scanner.advance());
          } while (!scanner.zzAtEOF);

        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
