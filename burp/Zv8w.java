package burp;

public class Zv8w implements Zg0z {
  private final Zl7h ZN;
  
  private final Zr69 Zk;
  
  private final Zz1m<Zt35> ZE;
  
  private final Zez7 ZL;
  
  private final Zlas Zn;
  
  private final Zt1g Zo;
  
  public Zv8w(Zl7h paramZl7h, Zr69 paramZr69, Zz1m<Zt35> paramZz1m, Zez7 paramZez7, Zlas paramZlas, Zt1g paramZt1g) {
    this.ZN = paramZl7h;
    this.Zk = paramZr69;
    this.ZE = paramZz1m;
    this.ZL = paramZez7;
    this.Zn = paramZlas;
    this.Zo = paramZt1g;
  }
  
  public void ZZ(Zvb paramZvb) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zk : Lburp/Zr69;
    //   4: invokeinterface Zu : ()V
    //   9: invokestatic ZM : ()[Lburp/Zbqc;
    //   12: aload_0
    //   13: getfield ZN : Lburp/Zl7h;
    //   16: aload_0
    //   17: getfield ZL : Lburp/Zez7;
    //   20: invokevirtual Zn : ()B
    //   23: iconst_1
    //   24: iadd
    //   25: invokeinterface Zg : (I)V
    //   30: astore_2
    //   31: aload_1
    //   32: instanceof burp/Zxno
    //   35: ifeq -> 96
    //   38: aload_1
    //   39: checkcast burp/Zxno
    //   42: astore_3
    //   43: aload_3
    //   44: invokevirtual Zt : ()Ljava/lang/Exception;
    //   47: astore #4
    //   49: aload_0
    //   50: getfield Zk : Lburp/Zr69;
    //   53: invokeinterface ZD : ()Lburp/Zmv7;
    //   58: getstatic burp/Zrp6.TRACE : Lburp/Zrp6;
    //   61: getstatic burp/Zlq7.UNEXPECTED_EXCEPTION_IN_STATE_MACHINE : Lburp/Zlq7;
    //   64: iconst_2
    //   65: anewarray java/lang/Object
    //   68: dup
    //   69: iconst_0
    //   70: aload #4
    //   72: invokevirtual getClass : ()Ljava/lang/Class;
    //   75: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   78: aastore
    //   79: dup
    //   80: iconst_1
    //   81: aload #4
    //   83: invokevirtual getMessage : ()Ljava/lang/String;
    //   86: aastore
    //   87: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   92: aload_2
    //   93: ifnull -> 215
    //   96: aload_1
    //   97: instanceof burp/Zljv
    //   100: ifeq -> 141
    //   103: aload_0
    //   104: getfield Zk : Lburp/Zr69;
    //   107: invokeinterface ZD : ()Lburp/Zmv7;
    //   112: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   115: getstatic burp/Zlq7.REFUSED_SCENE : Lburp/Zlq7;
    //   118: iconst_1
    //   119: anewarray java/lang/Object
    //   122: dup
    //   123: iconst_0
    //   124: aload_0
    //   125: getfield ZL : Lburp/Zez7;
    //   128: invokevirtual Zp : ()Ljava/lang/String;
    //   131: aastore
    //   132: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   137: aload_2
    //   138: ifnull -> 215
    //   141: aload_0
    //   142: getfield ZL : Lburp/Zez7;
    //   145: aload_0
    //   146: getfield ZN : Lburp/Zl7h;
    //   149: invokeinterface ZVv : ()Lburp/Zsiv;
    //   154: aload_0
    //   155: getfield Zo : Lburp/Zt1g;
    //   158: invokevirtual Zl : (Lburp/Zsiv;Lburp/Zt1g;)V
    //   161: aload_0
    //   162: getfield Zk : Lburp/Zr69;
    //   165: invokeinterface ZD : ()Lburp/Zmv7;
    //   170: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   173: getstatic burp/Zlq7.SCENE_FINISHED : Lburp/Zlq7;
    //   176: iconst_1
    //   177: anewarray java/lang/Object
    //   180: dup
    //   181: iconst_0
    //   182: aload_0
    //   183: getfield ZL : Lburp/Zez7;
    //   186: aastore
    //   187: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   192: aload_0
    //   193: getfield ZE : Lburp/Zz1m;
    //   196: new burp/Zxr8
    //   199: dup
    //   200: getstatic burp/Zt35.ZB : Lburp/Zlnb;
    //   203: aload_0
    //   204: getfield ZL : Lburp/Zez7;
    //   207: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   210: invokeinterface ZD : (Lburp/Zxr8;)V
    //   215: return
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */