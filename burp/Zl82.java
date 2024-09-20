package burp;

import javax.swing.text.BadLocationException;
import javax.swing.text.GapContent;

class Zl82 extends GapContent {
  private static final String a;
  
  public char Zi(int paramInt) throws BadLocationException {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < length()) {
            int i = getGapStart();
            char[] arrayOfChar = (char[])getArray();
            try {
              if (paramInt < i)
                return arrayOfChar[paramInt]; 
            } catch (BadLocationException badLocationException) {
              throw a(null);
            } 
            return arrayOfChar[getGapEnd() + paramInt - i];
          } 
          throw new BadLocationException(a, paramInt);
        } catch (BadLocationException badLocationException) {
          throw a(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    throw new BadLocationException(a, paramInt);
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #116
    //   2: ldc '?ODZCVNT]S'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl82.a : Ljava/lang/String;
    //   11: goto -> 151
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 125
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 107, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 103
    //   80: iconst_2
    //   81: goto -> 109
    //   84: bipush #85
    //   86: goto -> 109
    //   89: bipush #70
    //   91: goto -> 109
    //   94: bipush #79
    //   96: goto -> 109
    //   99: iconst_4
    //   100: goto -> 109
    //   103: iconst_4
    //   104: goto -> 109
    //   107: bipush #83
    //   109: ixor
    //   110: ixor
    //   111: i2c
    //   112: castore
    //   113: iinc #0, 1
    //   116: dup
    //   117: ifne -> 125
    //   120: dup2
    //   121: dup_x1
    //   122: goto -> 35
    //   125: dup2_x1
    //   126: pop2
    //   127: dup_x2
    //   128: iload_0
    //   129: if_icmpgt -> 32
    //   132: pop
    //   133: new java/lang/String
    //   136: dup_x1
    //   137: swap
    //   138: invokespecial <init> : ([C)V
    //   141: invokevirtual intern : ()Ljava/lang/String;
    //   144: swap
    //   145: pop
    //   146: swap
    //   147: pop
    //   148: goto -> 8
    //   151: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl82.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */