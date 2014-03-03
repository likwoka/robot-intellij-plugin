/* The following code was generated by JFlex 1.4.3 on 3/1/14 6:09 PM */

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

import static com.jivesoftware.robot.intellij.plugin.lexer.RobotToken.*;

import com.intellij.psi.tree.IElementType;

//@SuppressWarnings({ "ALL" })


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/1/14 6:09 PM from the specification file
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
    "\5\0\1\20\3\0\1\31\1\0\1\30\11\13\3\0\1\11\3\0"+
    "\2\12\1\25\17\12\1\12\1\24\6\12\1\16\1\0\1\17\1\0"+
    "\1\14\1\0\1\27\1\15\1\26\1\15\1\22\1\15\1\15\1\15"+
    "\1\15\4\15\1\15\4\15\1\21\1\23\6\15\1\7\1\0\1\10"+
    "\uff82\0";

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
    "\1\10\2\1\1\10\1\11\2\12\1\11\1\3\1\1"+
    "\1\13\1\14\3\0\2\1\2\0\2\15\1\1\4\0"+
    "\1\16\2\0\1\10\1\17\6\15\2\0\4\16\1\20"+
    "\4\15\1\0\1\20\2\16\2\15\1\21\1\22\13\15"+
    "\7\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[86];
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
    "\0\0\0\32\0\64\0\116\0\150\0\202\0\234\0\266"+
    "\0\320\0\320\0\352\0\u0104\0\u011e\0\u0138\0\u0152\0\u016c"+
    "\0\234\0\u0186\0\234\0\u01a0\0\u01ba\0\u01d4\0\234\0\u01ee"+
    "\0\u0208\0\u0222\0\u023c\0\u0256\0\u0270\0\u028a\0\u02a4\0\u02be"+
    "\0\u02d8\0\u016c\0\u02f2\0\u030c\0\u0326\0\u0340\0\u035a\0\u0374"+
    "\0\u038e\0\u0256\0\150\0\u03a8\0\u03c2\0\u03dc\0\u03f6\0\u0410"+
    "\0\u042a\0\u0444\0\u045e\0\u0478\0\u0492\0\u04ac\0\u04c6\0\234"+
    "\0\u04e0\0\u04fa\0\u0514\0\u052e\0\u0548\0\u0562\0\u057c\0\u0596"+
    "\0\u05b0\0\u05ca\0\234\0\234\0\u05e4\0\u05fe\0\u0618\0\u0632"+
    "\0\u064c\0\u0666\0\u0680\0\u069a\0\u06b4\0\u06ce\0\u06e8\0\u0702"+
    "\0\u071c\0\u0736\0\u0750\0\u076a\0\u0784\0\u079e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[86];
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
    "\1\14\1\15\2\5\1\16\1\5\1\17\3\5\2\14"+
    "\2\5\1\20\1\5\1\21\1\22\1\23\1\24\26\21"+
    "\1\5\1\6\1\7\1\25\1\11\1\12\1\13\3\5"+
    "\1\14\1\15\2\5\1\16\1\5\1\26\3\5\2\14"+
    "\2\5\1\20\1\5\1\27\1\22\1\23\7\27\1\30"+
    "\1\27\2\30\3\27\7\30\2\27\1\5\4\0\1\31"+
    "\24\5\2\0\1\7\70\0\1\32\26\0\2\11\24\0"+
    "\1\13\2\0\27\13\1\5\4\0\1\33\4\5\2\14"+
    "\1\5\1\14\3\5\10\14\2\5\4\0\1\31\5\5"+
    "\1\15\14\5\1\15\1\34\1\5\4\0\1\31\4\5"+
    "\1\35\1\5\2\35\3\5\7\35\3\5\3\0\1\36"+
    "\1\37\4\5\1\40\1\5\2\40\2\5\1\17\2\40"+
    "\2\41\3\40\3\5\4\0\1\31\5\5\1\42\14\5"+
    "\1\42\1\34\2\0\1\23\36\0\1\43\31\0\1\44"+
    "\22\0\1\5\3\0\1\45\1\46\4\5\1\47\1\5"+
    "\2\47\2\5\1\26\7\47\2\5\5\0\1\50\4\0"+
    "\4\30\3\0\10\30\1\0\1\5\5\0\24\5\12\0"+
    "\1\51\1\0\2\51\3\0\7\51\2\0\1\5\5\0"+
    "\4\5\1\14\11\5\2\14\5\5\4\0\1\31\5\5"+
    "\1\52\14\5\1\52\2\5\4\0\1\31\4\5\4\35"+
    "\1\5\1\53\1\5\10\35\1\5\4\0\2\36\4\0"+
    "\1\54\1\0\2\54\3\0\2\54\2\55\3\54\2\0"+
    "\1\5\3\0\2\36\4\5\1\40\1\5\2\40\3\5"+
    "\2\40\2\41\3\40\3\5\3\0\1\56\1\57\4\5"+
    "\4\40\2\5\1\60\10\40\2\5\3\0\1\56\1\57"+
    "\4\5\4\40\2\5\1\60\1\40\1\61\6\40\1\5"+
    "\12\0\1\62\1\0\2\62\3\0\7\62\14\0\1\63"+
    "\1\0\2\63\3\0\7\63\6\0\2\45\4\0\1\64"+
    "\1\0\2\64\3\0\7\64\2\0\1\5\3\0\2\45"+
    "\4\5\1\47\1\5\2\47\3\5\7\47\3\5\3\0"+
    "\1\65\1\66\4\5\4\47\2\5\1\67\10\47\1\5"+
    "\12\0\1\30\1\0\2\30\3\0\7\30\12\0\1\70"+
    "\1\0\4\51\3\0\10\51\5\0\1\56\1\71\4\0"+
    "\4\54\2\0\1\72\10\54\5\0\1\56\1\71\4\0"+
    "\4\54\2\0\1\72\1\54\1\73\6\54\5\0\2\56"+
    "\12\0\1\72\11\0\1\5\3\0\2\56\4\5\1\40"+
    "\1\5\2\40\2\5\1\60\7\40\3\5\4\0\1\31"+
    "\12\5\1\60\12\5\3\0\1\56\1\57\4\5\4\40"+
    "\2\5\1\60\1\74\7\40\1\5\10\0\1\75\1\0"+
    "\4\62\3\0\10\62\11\0\1\76\1\0\4\63\3\0"+
    "\10\63\5\0\1\65\1\77\4\0\4\64\2\0\1\100"+
    "\10\64\5\0\2\65\12\0\1\100\11\0\1\5\3\0"+
    "\2\65\4\5\1\47\1\5\2\47\2\5\1\67\7\47"+
    "\3\5\4\0\1\31\12\5\1\67\11\5\4\0\2\56"+
    "\4\0\1\54\1\0\2\54\2\0\1\72\7\54\22\0"+
    "\1\72\15\0\1\56\1\71\4\0\4\54\2\0\1\72"+
    "\1\101\7\54\1\0\1\5\3\0\1\56\1\57\4\5"+
    "\4\40\2\5\1\60\2\40\1\102\5\40\1\5\11\0"+
    "\1\103\31\0\1\104\24\0\2\65\4\0\1\64\1\0"+
    "\2\64\2\0\1\100\7\64\22\0\1\100\15\0\1\56"+
    "\1\71\4\0\4\54\2\0\1\72\2\54\1\105\5\54"+
    "\1\0\1\5\3\0\1\56\1\106\4\5\4\40\2\5"+
    "\1\60\4\40\2\107\2\40\1\5\4\0\1\56\1\110"+
    "\4\0\4\54\2\0\1\72\4\54\2\111\2\54\1\0"+
    "\1\5\3\0\2\56\4\5\1\40\1\5\2\40\2\5"+
    "\1\60\4\40\2\107\1\40\3\5\3\0\1\56\1\57"+
    "\4\5\4\40\2\5\1\60\6\40\1\112\1\40\1\5"+
    "\4\0\2\56\4\0\1\54\1\0\2\54\2\0\1\72"+
    "\4\54\2\111\1\54\6\0\1\56\1\71\4\0\4\54"+
    "\2\0\1\72\6\54\1\113\1\54\1\0\1\5\3\0"+
    "\1\56\1\57\4\5\4\40\2\5\1\60\1\114\7\40"+
    "\1\5\4\0\1\56\1\71\4\0\4\54\2\0\1\72"+
    "\1\115\7\54\1\0\1\5\3\0\1\56\1\57\4\5"+
    "\4\40\2\5\1\60\1\40\1\116\6\40\1\5\4\0"+
    "\1\56\1\71\4\0\4\54\2\0\1\72\1\54\1\117"+
    "\6\54\1\0\1\5\3\0\1\56\1\57\4\5\4\40"+
    "\2\5\1\60\1\120\7\40\1\5\4\0\1\56\1\71"+
    "\4\0\4\54\2\0\1\72\1\121\7\54\1\0\1\5"+
    "\3\0\1\122\1\123\4\5\4\40\2\5\1\124\10\40"+
    "\1\5\4\0\1\122\1\125\4\0\4\54\2\0\1\126"+
    "\10\54\5\0\2\122\12\0\1\126\11\0\1\5\3\0"+
    "\2\122\4\5\1\40\1\5\2\40\2\5\1\124\7\40"+
    "\3\5\4\0\1\31\12\5\1\124\11\5\4\0\2\122"+
    "\4\0\1\54\1\0\2\54\2\0\1\126\7\54\22\0"+
    "\1\126\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1976];
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
    "\1\11\1\1\3\0\2\1\2\0\3\1\4\0\1\1"+
    "\2\0\10\1\2\0\4\1\1\11\4\1\1\0\5\1"+
    "\2\11\22\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[86];
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
    while (i < 102) {
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
        case 2: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [103] { yybegin(START_OF_LINE); return RobotToken.NEWLINE_TOKEN; }");
          { yybegin(START_OF_LINE); return RobotToken.NEWLINE_TOKEN;
          }
        case 20: break;
        case 10: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [123] { return RobotToken.NEWLINE_TOKEN; }");
          { return RobotToken.NEWLINE_TOKEN;
          }
        case 21: break;
        case 6: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [108] { return RobotToken.COMMENT_TOKEN; }");
          { return RobotToken.COMMENT_TOKEN;
          }
        case 22: break;
        case 11: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [151] { yypushback(1); yybegin(TEST_CASES); }");
          { yypushback(1); yybegin(TEST_CASES);
          }
        case 23: break;
        case 8: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [111] { return RobotToken.NUMBER_LITERAL_TOKEN; }");
          { return RobotToken.NUMBER_LITERAL_TOKEN;
          }
        case 24: break;
        case 4: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [113] { return RobotToken.COLUMN_SEP_TOKEN; }");
          { return RobotToken.COLUMN_SEP_TOKEN;
          }
        case 25: break;
        case 17: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [122] { yybegin(YYINITIAL); return RobotToken.ASSIGNMENT_TOKEN; }");
          { yybegin(YYINITIAL); return RobotToken.ASSIGNMENT_TOKEN;
          }
        case 26: break;
        case 13: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [105] { return RobotToken.TABLE_HEADING_TOKEN; }");
          { return RobotToken.TABLE_HEADING_TOKEN;
          }
        case 27: break;
        case 19: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [104] { yybegin(TEST_CASES); return RobotToken.TEST_CASES_TABLE_HEADING_TOKEN; }");
          { yybegin(TEST_CASES); return RobotToken.TEST_CASES_TABLE_HEADING_TOKEN;
          }
        case 28: break;
        case 16: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [109] { return RobotToken.VARIABLE_TOKEN; }");
          { return RobotToken.VARIABLE_TOKEN;
          }
        case 29: break;
        case 12: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [149] { yybegin(TEST_CASES); return RobotToken.TEST_CASE_HEADER_TOKEN; }");
          { yybegin(TEST_CASES); return RobotToken.TEST_CASE_HEADER_TOKEN;
          }
        case 30: break;
        case 14: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [132] { yybegin(YYINITIAL); return RobotToken.TABLE_HEADING_TOKEN; }");
          { yybegin(YYINITIAL); return RobotToken.TABLE_HEADING_TOKEN;
          }
        case 31: break;
        case 3: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [116] { return RobotToken.BAD_CHAR_TOKEN; }");
          { return RobotToken.BAD_CHAR_TOKEN;
          }
        case 32: break;
        case 5: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [114] { return RobotToken.SINGLE_SPACE_TOKEN; }");
          { return RobotToken.SINGLE_SPACE_TOKEN;
          }
        case 33: break;
        case 7: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [110] { return RobotToken.ROBOT_KEYWORD_TOKEN; }");
          { return RobotToken.ROBOT_KEYWORD_TOKEN;
          }
        case 34: break;
        case 9: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [124] { System.out.println(\"Matched . as: \'\" + yytext() + \"\'\"); yypushback(1); yybegin(YYINITIAL); }");
          { System.out.println("Matched . as: '" + yytext() + "'"); yypushback(1); yybegin(YYINITIAL);
          }
        case 35: break;
        case 1: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [112] { return RobotToken.ROBOT_KEYWORD_ARG_TOKEN; }");
          { return RobotToken.ROBOT_KEYWORD_ARG_TOKEN;
          }
        case 36: break;
        case 18: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [136] { return RobotToken.ASSIGNMENT_TOKEN; }");
          { return RobotToken.ASSIGNMENT_TOKEN;
          }
        case 37: break;
        case 15: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [106] { return RobotToken.META_INFO_TOKEN; }");
          { return RobotToken.META_INFO_TOKEN;
          }
        case 38: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case TEST_CASES_START_OF_LINE: {
              System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: <<EOF>>");
              System.out.println("action [152] { yybegin(YYINITIAL); }");
              yybegin(YYINITIAL);
            }
            case 87: break;
            case YYINITIAL: {
              System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: <<EOF>>");
              System.out.println("action [118] { return null; }");
              return null;
            }
            case 88: break;
            case TEST_CASES: {
              System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: <<EOF>>");
              System.out.println("action [145] { yybegin(YYINITIAL); }");
              yybegin(YYINITIAL);
            }
            case 89: break;
            case START_OF_LINE: {
              System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: <<EOF>>");
              System.out.println("action [125] { yybegin(YYINITIAL); }");
              yybegin(YYINITIAL);
            }
            case 90: break;
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