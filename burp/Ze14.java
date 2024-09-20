package burp;

public abstract class Ze14<T extends Zvo1> implements Zsqx<T> {
  protected final Zmzk ZC;
  
  protected final Zlit ZO;
  
  protected final Zbr ZH;
  
  protected final byte[] Zh;
  
  protected final long Zu;
  
  protected final long Zq;
  
  protected final int ZB;
  
  protected final short Zt;
  
  protected final int Zj;
  
  protected final int Zb;
  
  protected final String ZP;
  
  protected final Zstu ZJ;
  
  protected final String Zx;
  
  protected final String Zg;
  
  private static String Zk;
  
  protected Ze14(Zefx paramZefx, Zkyt paramZkyt, byte[] paramArrayOfbyte, long paramLong1, long paramLong2, int[] paramArrayOfint, Zbnt paramZbnt, String paramString1, String paramString2, String paramString3) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: new burp/Zx42
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore #14
    //   13: aload_1
    //   14: aload #14
    //   16: invokeinterface Zi : (Lburp/Zg5o;)V
    //   21: aload_0
    //   22: aload_1
    //   23: invokeinterface ZT : ()Lburp/Zmzk;
    //   28: putfield ZC : Lburp/Zmzk;
    //   31: aload_0
    //   32: aload_1
    //   33: aload_2
    //   34: invokestatic ZF : (Lburp/Zefx;Lburp/Zkyt;)Lburp/Zbr;
    //   37: putfield ZH : Lburp/Zbr;
    //   40: invokestatic Za : ()Ljava/lang/String;
    //   43: aload_0
    //   44: aconst_null
    //   45: putfield ZJ : Lburp/Zstu;
    //   48: aload_0
    //   49: aload_3
    //   50: putfield Zh : [B
    //   53: aload_0
    //   54: aload_1
    //   55: invokeinterface ZF : ()Lburp/Zlit;
    //   60: putfield ZO : Lburp/Zlit;
    //   63: aload_0
    //   64: lload #4
    //   66: putfield Zu : J
    //   69: aload_0
    //   70: aload #10
    //   72: putfield Zx : Ljava/lang/String;
    //   75: aload_0
    //   76: aload #11
    //   78: putfield Zg : Ljava/lang/String;
    //   81: aload_0
    //   82: aload #12
    //   84: putfield ZP : Ljava/lang/String;
    //   87: astore #13
    //   89: aload #8
    //   91: ifnull -> 122
    //   94: aload_0
    //   95: aload #8
    //   97: iconst_0
    //   98: iaload
    //   99: putfield Zj : I
    //   102: aload_0
    //   103: aload #8
    //   105: iconst_1
    //   106: iaload
    //   107: putfield Zb : I
    //   110: aload #13
    //   112: ifnull -> 132
    //   115: iconst_1
    //   116: anewarray burp/Zbqc
    //   119: invokestatic Zr : ([Lburp/Zbqc;)V
    //   122: aload_0
    //   123: iconst_0
    //   124: putfield Zj : I
    //   127: aload_0
    //   128: iconst_0
    //   129: putfield Zb : I
    //   132: aload_3
    //   133: ifnull -> 177
    //   136: aconst_null
    //   137: aload_3
    //   138: getstatic burp/Zt0k.NO_HTML_ANALYSIS : Lburp/Zt0k;
    //   141: aload #9
    //   143: invokestatic ZK : (Lburp/Zz1p;[BLburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   146: astore #15
    //   148: aload_0
    //   149: lload #6
    //   151: putfield Zq : J
    //   154: aload_0
    //   155: aload #15
    //   157: getfield Zb : S
    //   160: putfield Zt : S
    //   163: aload_0
    //   164: aload #15
    //   166: getfield Zs : I
    //   169: putfield ZB : I
    //   172: aload #13
    //   174: ifnull -> 192
    //   177: aload_0
    //   178: lconst_0
    //   179: putfield Zq : J
    //   182: aload_0
    //   183: iconst_0
    //   184: putfield Zt : S
    //   187: aload_0
    //   188: iconst_0
    //   189: putfield ZB : I
    //   192: return
  }
  
  protected Zstu Zz(Zstu paramZstu, byte[] paramArrayOfbyte, Zr_4 paramZr_4) {
    return (paramZstu != null) ? paramZstu : ((paramArrayOfbyte == null) ? null : paramZr_4.ZZ(paramArrayOfbyte));
  }
  
  public static void ZF(String paramString) {
    Zk = paramString;
  }
  
  public static String Za() {
    return Zk;
  }
  
  static {
    if (Za() != null)
      ZF("RW87Kc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze14.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */