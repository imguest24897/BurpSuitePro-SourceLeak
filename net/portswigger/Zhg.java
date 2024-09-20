package net.portswigger;

import burp.Zbqc;

public class Zhg extends Exception {
  private final Zrxp Zy;
  
  private static Zbqc[] Zb;
  
  public static Zhg ZX() {
    return new Zhg(Zrxp.NO_VERSION, null);
  }
  
  public static Zhg ZL() {
    return new Zhg(Zrxp.NO_SERVER_URLS, null);
  }
  
  public static Zhg ZL(String paramString) {
    return new Zhg(Zrxp.VALIDATION, paramString);
  }
  
  private Zhg(Zrxp paramZrxp, String paramString) {
    super(paramString);
    this.Zy = paramZrxp;
  }
  
  public Zhg(Throwable paramThrowable) {
    // Byte code:
    //   0: invokestatic Zr : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: aload_1
    //   5: invokevirtual getMessage : ()Ljava/lang/String;
    //   8: aload_1
    //   9: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   12: aload_1
    //   13: astore_3
    //   14: iconst_0
    //   15: istore #4
    //   17: astore_2
    //   18: aload_3
    //   19: iload #4
    //   21: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   26: tableswitch default -> 163, -1 -> 163, 0 -> 64, 1 -> 95, 2 -> 112, 3 -> 129, 4 -> 146
    //   64: aload_3
    //   65: checkcast net/portswigger/Zki
    //   68: astore #5
    //   70: aload_0
    //   71: getstatic net/portswigger/Zrxp.GENERATION : Lnet/portswigger/Zrxp;
    //   74: putfield Zy : Lnet/portswigger/Zrxp;
    //   77: aload_2
    //   78: ifnonnull -> 177
    //   81: iconst_1
    //   82: anewarray burp/Zbqc
    //   85: invokestatic Zr : ([Lburp/Zbqc;)V
    //   88: goto -> 95
    //   91: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   94: athrow
    //   95: aload_3
    //   96: checkcast org/openapi4j/Zpa
    //   99: astore #6
    //   101: aload_0
    //   102: getstatic net/portswigger/Zrxp.EXTERNAL_RESOLUTION : Lnet/portswigger/Zrxp;
    //   105: putfield Zy : Lnet/portswigger/Zrxp;
    //   108: aload_2
    //   109: ifnonnull -> 177
    //   112: aload_3
    //   113: checkcast org/openapi4j/Zp0
    //   116: astore #7
    //   118: aload_0
    //   119: getstatic net/portswigger/Zrxp.RESOLUTION : Lnet/portswigger/Zrxp;
    //   122: putfield Zy : Lnet/portswigger/Zrxp;
    //   125: aload_2
    //   126: ifnonnull -> 177
    //   129: aload_3
    //   130: checkcast org/openapi4j/Zps
    //   133: astore #8
    //   135: aload_0
    //   136: getstatic net/portswigger/Zrxp.VALIDATION : Lnet/portswigger/Zrxp;
    //   139: putfield Zy : Lnet/portswigger/Zrxp;
    //   142: aload_2
    //   143: ifnonnull -> 177
    //   146: aload_3
    //   147: checkcast org/openapi4j/Zau
    //   150: astore #9
    //   152: aload_0
    //   153: getstatic net/portswigger/Zrxp.DECODE : Lnet/portswigger/Zrxp;
    //   156: putfield Zy : Lnet/portswigger/Zrxp;
    //   159: aload_2
    //   160: ifnonnull -> 177
    //   163: aload_0
    //   164: getstatic net/portswigger/Zrxp.OTHER : Lnet/portswigger/Zrxp;
    //   167: putfield Zy : Lnet/portswigger/Zrxp;
    //   170: goto -> 177
    //   173: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   176: athrow
    //   177: return
    // Exception table:
    //   from	to	target	type
    //   70	88	91	net/portswigger/Zki
    //   152	170	173	net/portswigger/Zki
  }
  
  public Zrxp ZC() {
    return this.Zy;
  }
  
  public static void ZU(Zbqc[] paramArrayOfZbqc) {
    Zb = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zr() {
    return Zb;
  }
  
  private static Zki a(Zki paramZki) {
    return paramZki;
  }
  
  static {
    if (Zr() == null)
      ZU(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zhg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */