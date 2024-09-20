package burp;

public class Zxx_ {
  public static Zz7s Zw(String paramString) {
    String str = paramString.trim();
    char[] arrayOfChar = str.toCharArray();
    switch (ZC(arrayOfChar).ordinal()) {
      case 0:
      
      case 1:
      
    } 
    return new Zs_u(arrayOfChar);
  }
  
  private static Zlnc ZC(char[] paramArrayOfchar) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: invokestatic ZJ : ()I
    //   7: aload_0
    //   8: astore #4
    //   10: aload #4
    //   12: arraylength
    //   13: istore #5
    //   15: istore_1
    //   16: iconst_0
    //   17: istore #6
    //   19: iload #6
    //   21: iload #5
    //   23: if_icmpge -> 85
    //   26: aload #4
    //   28: iload #6
    //   30: caload
    //   31: istore #7
    //   33: iload #7
    //   35: invokestatic isWhitespace : (C)Z
    //   38: istore #8
    //   40: iload_3
    //   41: ifeq -> 55
    //   44: iload #8
    //   46: ifne -> 55
    //   49: iconst_0
    //   50: istore_3
    //   51: iload_1
    //   52: ifeq -> 69
    //   55: iload_3
    //   56: ifne -> 69
    //   59: iload #8
    //   61: ifeq -> 69
    //   64: iconst_1
    //   65: istore_3
    //   66: iinc #2, 1
    //   69: iload_2
    //   70: iconst_1
    //   71: if_icmple -> 78
    //   74: getstatic burp/Zlnc.THREE_OR_MORE_TOKENS : Lburp/Zlnc;
    //   77: areturn
    //   78: iinc #6, 1
    //   81: iload_1
    //   82: ifeq -> 19
    //   85: iload_2
    //   86: ifne -> 95
    //   89: getstatic burp/Zlnc.EMPTY_OR_SINGLE_TOKEN : Lburp/Zlnc;
    //   92: goto -> 98
    //   95: getstatic burp/Zlnc.TWO_TOKENS : Lburp/Zlnc;
    //   98: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxx_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */