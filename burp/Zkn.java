package burp;

public class Zkn {
  private final Zmsm ZA;
  
  private final Zze7 ZF;
  
  private final Zbnt ZV;
  
  private final Zey9 ZJ;
  
  private static String ZM;
  
  public Zkn(Zmsm paramZmsm, Zze7 paramZze7, Zbnt paramZbnt, Zey9 paramZey9) {
    this.ZA = paramZmsm;
    this.ZF = paramZze7;
    this.ZV = paramZbnt;
    this.ZJ = paramZey9;
  }
  
  public void Zx(Zmzk paramZmzk, Zeo2 paramZeo2, Zz1p paramZz1p, long paramLong) {
    this.ZA.ZK(Zmup.PROXY, paramZmzk, paramZeo2.Zos(), paramZeo2.ZoO(), paramZz1p, paramZeo2.ZoB(), paramLong);
    this.ZF.Zp(paramZeo2, paramZz1p);
  }
  
  public void ZJ(Zvo1 paramZvo1) {
    // Byte code:
    //   0: invokestatic ZI : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface Zo3 : ()Lburp/Zbr;
    //   10: astore_3
    //   11: aload_3
    //   12: ifnull -> 22
    //   15: aload_3
    //   16: invokevirtual Zd : ()Z
    //   19: ifeq -> 36
    //   22: aconst_null
    //   23: astore #4
    //   25: aload_2
    //   26: ifnonnull -> 86
    //   29: iconst_4
    //   30: anewarray burp/Zbqc
    //   33: invokestatic Zr : ([Lburp/Zbqc;)V
    //   36: aload_3
    //   37: invokevirtual Zu : ()Z
    //   40: ifeq -> 80
    //   43: aload_3
    //   44: aload_1
    //   45: invokeinterface Zod : ()Lburp/Zmzk;
    //   50: aload_0
    //   51: getfield ZJ : Lburp/Zey9;
    //   54: invokevirtual ZP : (Lburp/Zmzk;Lburp/Zey9;)Lburp/Zefx;
    //   57: astore #5
    //   59: aload #5
    //   61: invokeinterface Zb : ()Lburp/Zefx;
    //   66: invokeinterface ZD : ()[B
    //   71: invokestatic Zy : ([B)Lburp/Zyf;
    //   74: astore #4
    //   76: aload_2
    //   77: ifnonnull -> 86
    //   80: aload_3
    //   81: invokevirtual Zr : ()Lburp/Zstu;
    //   84: astore #4
    //   86: aload_1
    //   87: invokeinterface Zod : ()Lburp/Zmzk;
    //   92: aload #4
    //   94: iconst_3
    //   95: aload_0
    //   96: getfield ZV : Lburp/Zbnt;
    //   99: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   102: astore #5
    //   104: aload_0
    //   105: getfield ZA : Lburp/Zmsm;
    //   108: getstatic burp/Zmup.REPEATER : Lburp/Zmup;
    //   111: aload_1
    //   112: invokeinterface Zod : ()Lburp/Zmzk;
    //   117: aload #4
    //   119: aload_1
    //   120: invokeinterface ZoO : ()Lburp/Zstu;
    //   125: aload #5
    //   127: aload_1
    //   128: invokeinterface ZoB : ()J
    //   133: aload_1
    //   134: invokeinterface ZYQ : ()J
    //   139: invokevirtual ZK : (Lburp/Zmup;Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;Lburp/Zz1p;JJ)V
    //   142: aload_0
    //   143: getfield ZF : Lburp/Zze7;
    //   146: aload_1
    //   147: aload #5
    //   149: invokevirtual Zh : (Lburp/Zvo1;Lburp/Zz1p;)V
    //   152: return
  }
  
  public void ZR(Zsxd paramZsxd) {
    Zg3d zg3d = paramZsxd.ZG();
    if (zg3d == null)
      return; 
    Zefx zefx = ((Zg3d)paramZsxd.ZX().get(0)).ZR();
    Zyf zyf = Zyf.Zy(((zefx == null) ? null : zefx.Zb()).ZD());
    Zstu zstu = (zg3d.Ze() == null) ? null : zg3d.Ze().Za();
    Zz1p zz1p = Zghc.ZY(zefx.ZT(), zyf, (byte)3, this.ZV);
    this.ZA.ZK(Zmup.INTRUDER, zefx.ZT(), zyf, zstu, zz1p, paramZsxd.ZE().toMillis(), paramZsxd.ZE().toMillis());
    this.ZF.ZM(zz1p, zyf, zstu);
  }
  
  public static void Ze(String paramString) {
    ZM = paramString;
  }
  
  public static String ZI() {
    return ZM;
  }
  
  static {
    if (ZI() == null)
      Ze("a74EFc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */