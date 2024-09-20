package burp;

public class Zrcn implements Ze2t {
  private static String ZN;
  
  public void ZZ(Zsvc paramZsvc, Zzih paramZzih) {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: getfield ZE : Lburp/Zgho;
    //   8: getstatic burp/Zgho.SEMICOLON : Lburp/Zgho;
    //   11: if_acmpeq -> 155
    //   14: iconst_0
    //   15: istore #4
    //   17: iconst_0
    //   18: istore #5
    //   20: aconst_null
    //   21: astore #7
    //   23: aload_2
    //   24: iload #4
    //   26: invokevirtual ZW : (I)Lburp/Zsvc;
    //   29: astore #6
    //   31: aload #6
    //   33: ifnull -> 54
    //   36: aload #6
    //   38: getfield ZE : Lburp/Zgho;
    //   41: astore #7
    //   43: aload #7
    //   45: getstatic burp/Zgho.LINE_TERMINATOR : Lburp/Zgho;
    //   48: if_acmpne -> 54
    //   51: iconst_1
    //   52: istore #5
    //   54: iinc #4, 1
    //   57: aload #6
    //   59: ifnull -> 78
    //   62: aload #7
    //   64: getstatic burp/Zgho.LINE_TERMINATOR : Lburp/Zgho;
    //   67: if_acmpeq -> 23
    //   70: aload #7
    //   72: getstatic burp/Zgho.COMMENT : Lburp/Zgho;
    //   75: if_acmpeq -> 23
    //   78: iload #5
    //   80: ifeq -> 155
    //   83: aload_0
    //   84: aload_1
    //   85: aload #7
    //   87: invokevirtual Zk : (Lburp/Zsvc;Lburp/Zgho;)Z
    //   90: ifeq -> 155
    //   93: aload #6
    //   95: ifnull -> 130
    //   98: new burp/Zsvc
    //   101: dup
    //   102: getstatic burp/Zgho.SEMICOLON : Lburp/Zgho;
    //   105: aconst_null
    //   106: aload #6
    //   108: getfield ZY : Lburp/Zgfi;
    //   111: aload #6
    //   113: getfield ZJ : I
    //   116: aload #6
    //   118: getfield ZJ : I
    //   121: invokespecial <init> : (Lburp/Zgho;Ljava/lang/Object;Lburp/Zgfi;II)V
    //   124: astore #8
    //   126: aload_3
    //   127: ifnonnull -> 149
    //   130: new burp/Zsvc
    //   133: dup
    //   134: getstatic burp/Zgho.SEMICOLON : Lburp/Zgho;
    //   137: aconst_null
    //   138: aload_2
    //   139: getfield Za : Lburp/Zgfi;
    //   142: iconst_0
    //   143: iconst_0
    //   144: invokespecial <init> : (Lburp/Zgho;Ljava/lang/Object;Lburp/Zgfi;II)V
    //   147: astore #8
    //   149: aload_2
    //   150: aload #8
    //   152: invokevirtual ZQ : (Lburp/Zsvc;)V
    //   155: aload_2
    //   156: aload_1
    //   157: invokevirtual ZQ : (Lburp/Zsvc;)V
    //   160: return
  }
  
  private boolean Zk(Zsvc paramZsvc, Zgho paramZgho) {
    return (paramZgho == Zgho.KEYWORD_RETURN || paramZgho == Zgho.KEYWORD_CONTINUE || paramZgho == Zgho.KEYWORD_BREAK) ? true : ((paramZgho == Zgho.IDENTIFIER && (paramZsvc.ZE == Zgho.PLUS_PLUS || paramZsvc.ZE == Zgho.MINUS_MINUS)));
  }
  
  public static void ZE(String paramString) {
    ZN = paramString;
  }
  
  public static String Zl() {
    return ZN;
  }
  
  static {
    if (Zl() == null)
      ZE("pGW7q"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrcn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */