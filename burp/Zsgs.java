package burp;

public class Zsgs {
  private final Zs98 Zi;
  
  private final Zrjo ZB;
  
  private final Zbnt ZO;
  
  private final Zey9 Zb;
  
  private static boolean ZX;
  
  public Zsgs(Zs98 paramZs98, Zrjo paramZrjo, Zbnt paramZbnt, Zey9 paramZey9) {
    this.Zi = paramZs98;
    this.ZB = paramZrjo;
    this.ZO = paramZbnt;
    this.Zb = paramZey9;
  }
  
  public Zvo9 ZG(Zeo2 paramZeo2) {
    return ZZ(paramZeo2);
  }
  
  public Zvo9 ZK(Zvo1 paramZvo1) {
    return ZZ(paramZvo1);
  }
  
  private Zvo9 ZZ(Zmgv paramZmgv) {
    // Byte code:
    //   0: invokestatic Zb : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: ifnonnull -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_1
    //   11: invokeinterface Zo3 : ()Lburp/Zbr;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnull -> 28
    //   21: aload_3
    //   22: invokevirtual Zd : ()Z
    //   25: ifeq -> 35
    //   28: aconst_null
    //   29: astore #4
    //   31: iload_2
    //   32: ifne -> 85
    //   35: aload_3
    //   36: invokevirtual Zu : ()Z
    //   39: ifeq -> 79
    //   42: aload_3
    //   43: aload_1
    //   44: invokeinterface Zod : ()Lburp/Zmzk;
    //   49: aload_0
    //   50: getfield Zb : Lburp/Zey9;
    //   53: invokevirtual ZP : (Lburp/Zmzk;Lburp/Zey9;)Lburp/Zefx;
    //   56: astore #5
    //   58: aload #5
    //   60: invokeinterface Zb : ()Lburp/Zefx;
    //   65: invokeinterface ZD : ()[B
    //   70: invokestatic Zy : ([B)Lburp/Zyf;
    //   73: astore #4
    //   75: iload_2
    //   76: ifne -> 85
    //   79: aload_3
    //   80: invokevirtual Zr : ()Lburp/Zstu;
    //   83: astore #4
    //   85: aload_1
    //   86: invokeinterface Zod : ()Lburp/Zmzk;
    //   91: aload #4
    //   93: iconst_1
    //   94: aload_0
    //   95: getfield ZO : Lburp/Zbnt;
    //   98: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   101: astore #5
    //   103: new burp/Zvo9
    //   106: dup
    //   107: aload #5
    //   109: aload #4
    //   111: aload_1
    //   112: invokeinterface ZoO : ()Lburp/Zstu;
    //   117: aload_0
    //   118: getfield Zi : Lburp/Zs98;
    //   121: invokeinterface ZC7 : ()Ljava/util/EnumSet;
    //   126: aload_0
    //   127: getfield ZB : Lburp/Zrjo;
    //   130: aload #5
    //   132: getfield Zo : Lburp/Zlit;
    //   135: invokevirtual ZU : (Lburp/Zlit;)Lburp/Ztfx;
    //   138: invokespecial <init> : (Lburp/Zz1p;Lburp/Zstu;Lburp/Zstu;Ljava/util/EnumSet;Lburp/Ztfx;)V
    //   141: areturn
  }
  
  public static void ZU(boolean paramBoolean) {
    ZX = paramBoolean;
  }
  
  public static boolean Zb() {
    return ZX;
  }
  
  public static boolean Zd() {
    boolean bool = Zb();
    return !bool;
  }
  
  static {
    if (!Zb())
      ZU(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsgs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */