package burp;

public class Zecc {
  private final Zr_4 Zh;
  
  public Zecc(Zr_4 paramZr_4) {
    this.Zh = paramZr_4;
  }
  
  public Zkjm ZH(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) throws Zxt3 {
    return Ze(paramInt, paramString1, paramString2, paramString3, paramString4, paramString5, true);
  }
  
  public Zkjm Ze(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean) throws Zxt3 {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zh : Lburp/Zr_4;
    //   4: new burp/Zrwr
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   16: checkcast burp/Zxp8
    //   19: astore #9
    //   21: invokestatic ZG : ()I
    //   24: aload #9
    //   26: aload_2
    //   27: invokeinterface Z_0 : (Ljava/lang/String;)V
    //   32: new burp/Zm4r
    //   35: dup
    //   36: aload #9
    //   38: invokeinterface ZkR : ()Lburp/Zs1t;
    //   43: aload #6
    //   45: aload #5
    //   47: aload_2
    //   48: invokespecial <init> : (Lburp/Zs1t;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   51: astore #10
    //   53: istore #8
    //   55: aload #10
    //   57: aload_3
    //   58: invokevirtual ZP : (Ljava/lang/String;)V
    //   61: aload #9
    //   63: iload #7
    //   65: invokeinterface ZzN : (Z)V
    //   70: aload #9
    //   72: iload_1
    //   73: invokeinterface Zii : (I)V
    //   78: iload_1
    //   79: tableswitch default -> 190, 1 -> 104, 2 -> 143, 3 -> 143
    //   104: aload #9
    //   106: new java/lang/String
    //   109: dup
    //   110: aload_2
    //   111: aload_3
    //   112: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   117: invokevirtual getBytes : ()[B
    //   120: invokestatic ZZ : ([B)[B
    //   123: invokespecial <init> : ([B)V
    //   126: invokeinterface Z_B : (Ljava/lang/String;)V
    //   131: iload #8
    //   133: ifne -> 190
    //   136: goto -> 143
    //   139: invokestatic a : (Lburp/Zxt3;)Lburp/Zxt3;
    //   142: athrow
    //   143: aload #9
    //   145: aload #4
    //   147: invokeinterface Z_6 : (Ljava/lang/String;)V
    //   152: aload #9
    //   154: aload #5
    //   156: invokeinterface Z_t : (Ljava/lang/String;)V
    //   161: aload #9
    //   163: aload_3
    //   164: invokestatic Zl : (Ljava/lang/String;)[B
    //   167: invokeinterface ZQ : ([B)V
    //   172: aload #9
    //   174: aload_3
    //   175: invokestatic ZT : (Ljava/lang/String;)[B
    //   178: invokeinterface ZS : ([B)V
    //   183: goto -> 190
    //   186: invokestatic a : (Lburp/Zxt3;)Lburp/Zxt3;
    //   189: athrow
    //   190: new burp/Zkjm
    //   193: dup
    //   194: aload #9
    //   196: aload #10
    //   198: invokespecial <init> : (Lburp/Zxp8;Lburp/Zm4r;)V
    //   201: areturn
    // Exception table:
    //   from	to	target	type
    //   55	136	139	burp/Zxt3
    //   104	186	186	burp/Zxt3
  }
  
  private static Zxt3 a(Zxt3 paramZxt3) {
    return paramZxt3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zecc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */