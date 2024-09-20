package net.portswigger.browser;

import burp.Zxr8;

public abstract class Zcx {
  protected final Zjc Za;
  
  private static String Zh;
  
  protected Zcx(Zjc paramZjc) {
    this.Za = paramZjc;
  }
  
  public static Zxr8<? extends Zcx> ZX(Zjc paramZjc, Ze3 paramZe3) {
    // Byte code:
    //   0: invokestatic ZL : ()Ljava/lang/String;
    //   3: astore_2
    //   4: getstatic net/portswigger/browser/Ze4.Zq : [I
    //   7: aload_1
    //   8: invokevirtual ordinal : ()I
    //   11: iaload
    //   12: lookupswitch default -> 58, 1 -> 40, 2 -> 51
    //   40: aload_0
    //   41: invokestatic Zp : (Lnet/portswigger/browser/Zjc;)Lburp/Zxr8;
    //   44: goto -> 81
    //   47: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   50: athrow
    //   51: aload_0
    //   52: invokestatic ZZ : (Lnet/portswigger/browser/Zjc;)Lburp/Zxr8;
    //   55: goto -> 81
    //   58: iconst_0
    //   59: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   62: aload_1
    //   63: invokevirtual name : ()Ljava/lang/String;
    //   66: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   69: new java/lang/IllegalArgumentException
    //   72: dup
    //   73: aload_1
    //   74: invokevirtual name : ()Ljava/lang/String;
    //   77: invokespecial <init> : (Ljava/lang/String;)V
    //   80: athrow
    //   81: aload_2
    //   82: ifnonnull -> 99
    //   85: iconst_5
    //   86: anewarray burp/Zbqc
    //   89: invokestatic Zr : ([Lburp/Zbqc;)V
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   98: athrow
    //   99: areturn
    // Exception table:
    //   from	to	target	type
    //   4	47	47	java/lang/IllegalArgumentException
    //   81	92	95	java/lang/IllegalArgumentException
  }
  
  public Zjc Zv() {
    return this.Za;
  }
  
  public static void ZR(String paramString) {
    Zh = paramString;
  }
  
  public static String ZL() {
    return Zh;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    if (ZL() == null)
      ZR("Omj5Mb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zcx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */