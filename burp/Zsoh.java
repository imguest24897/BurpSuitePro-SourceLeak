package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsoh {
  public static final byte[] ZG = new byte[0];
  
  private final Zggx Zi;
  
  private final Zkq4 ZZ;
  
  private final Zlba ZL;
  
  private final Zkg9 ZF;
  
  private final Zey9 ZV;
  
  public Zsoh(Zggx paramZggx, Zkq4 paramZkq4, Zlba paramZlba, Zkg9 paramZkg9, Zey9 paramZey9) {
    this.Zi = paramZggx;
    this.ZZ = paramZkq4;
    this.ZL = paramZlba;
    this.ZF = paramZkg9;
    this.ZV = paramZey9;
  }
  
  public Zsxd ZD(Ztao paramZtao) {
    // Byte code:
    //   0: invokestatic Zy : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual Zv : ()Lburp/Zbza;
    //   8: ifnull -> 46
    //   11: aload_0
    //   12: getfield ZL : Lburp/Zlba;
    //   15: aload_1
    //   16: invokevirtual Zv : ()Lburp/Zbza;
    //   19: invokeinterface Zw : (Lburp/Zbza;)Z
    //   24: ifne -> 46
    //   27: goto -> 34
    //   30: invokestatic a : (Lburp/Zktz;)Lburp/Zktz;
    //   33: athrow
    //   34: new burp/Zktz
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: athrow
    //   42: invokestatic a : (Lburp/Zktz;)Lburp/Zktz;
    //   45: athrow
    //   46: aload_1
    //   47: invokevirtual Zn : ()Lburp/Zmzk;
    //   50: astore_3
    //   51: aload_1
    //   52: invokevirtual Zq : ()[B
    //   55: astore #4
    //   57: aload_0
    //   58: getfield ZV : Lburp/Zey9;
    //   61: aload_3
    //   62: aload #4
    //   64: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   67: astore #5
    //   69: aload_1
    //   70: invokevirtual Zu : ()Lburp/Zxgd;
    //   73: aload_0
    //   74: getfield ZZ : Lburp/Zkq4;
    //   77: invokeinterface ZA : ()Lburp/Zb_i;
    //   82: invokeinterface ZF : ()Lburp/Zrec;
    //   87: invokevirtual ZY : (Lburp/Zrec;)Lburp/Zxgd;
    //   90: aload #5
    //   92: invokevirtual Zo : (Lburp/Zefx;)Lburp/Zefx;
    //   95: astore #6
    //   97: new burp/Zrih
    //   100: dup
    //   101: aload_1
    //   102: invokevirtual ZG : ()Lburp/Ztpx;
    //   105: aload_1
    //   106: invokevirtual Zv : ()Lburp/Zbza;
    //   109: aload_0
    //   110: getfield ZF : Lburp/Zkg9;
    //   113: invokespecial <init> : (Lburp/Ztpx;Lburp/Zbza;Lburp/Zkg9;)V
    //   116: astore #7
    //   118: aload_1
    //   119: invokevirtual ZH : ()Z
    //   122: ifeq -> 152
    //   125: aload_0
    //   126: getfield ZZ : Lburp/Zkq4;
    //   129: invokeinterface ZqP : ()Z
    //   134: ifeq -> 152
    //   137: goto -> 144
    //   140: invokestatic a : (Lburp/Zktz;)Lburp/Zktz;
    //   143: athrow
    //   144: iconst_1
    //   145: goto -> 153
    //   148: invokestatic a : (Lburp/Zktz;)Lburp/Zktz;
    //   151: athrow
    //   152: iconst_0
    //   153: istore #8
    //   155: aload_0
    //   156: getfield Zi : Lburp/Zggx;
    //   159: aload #7
    //   161: aload_1
    //   162: invokevirtual Zi : ()Lburp/Zlgm;
    //   165: aload #6
    //   167: iload #8
    //   169: aload_1
    //   170: invokevirtual Zz : ()Ljava/time/Duration;
    //   173: aload_1
    //   174: invokevirtual Z_ : ()Ljava/time/Duration;
    //   177: aload_1
    //   178: invokevirtual ZL : ()[B
    //   181: aload_1
    //   182: invokevirtual ZT : ()Lburp/Ze45;
    //   185: aload_1
    //   186: invokevirtual Zu : ()Lburp/Zxgd;
    //   189: invokevirtual Zh : ()Z
    //   192: aload_1
    //   193: invokevirtual ZV : ()Lburp/Zlig;
    //   196: aload_1
    //   197: invokevirtual Zu : ()Lburp/Zxgd;
    //   200: invokevirtual ZF : ()Ljava/lang/String;
    //   203: aload_1
    //   204: invokevirtual Zu : ()Lburp/Zxgd;
    //   207: invokevirtual Zb : ()Z
    //   210: invokevirtual ZL : (Lburp/Ztpx;Lburp/Zlgm;Lburp/Zefx;ZLjava/time/Duration;Ljava/time/Duration;[BLburp/Ze45;ZLburp/Zlig;Ljava/lang/String;Z)Lburp/Zsxd;
    //   213: invokestatic Zwu : ()[Lburp/Zbqc;
    //   216: ifnonnull -> 231
    //   219: ldc 'rpSP3'
    //   221: invokestatic ZU : (Ljava/lang/String;)V
    //   224: goto -> 231
    //   227: invokestatic a : (Lburp/Zktz;)Lburp/Zktz;
    //   230: athrow
    //   231: areturn
    // Exception table:
    //   from	to	target	type
    //   4	27	30	burp/Zktz
    //   11	42	42	burp/Zktz
    //   118	137	140	burp/Zktz
    //   125	148	148	burp/Zktz
    //   155	224	227	burp/Zktz
  }
  
  public static Zstu ZA(Zsxd paramZsxd) {
    try {
    
    } catch (Zktz zktz) {
      throw a(null);
    } 
    Zstu zstu = (paramZsxd.ZG().Ze() == null) ? null : paramZsxd.ZG().Ze().Za();
    try {
    
    } catch (Zktz zktz) {
      throw a(null);
    } 
    Zuh.Zb((zstu != null), Zqf.Zk);
    return zstu;
  }
  
  public static Zstu Zu(Zsxd paramZsxd) {
    try {
    
    } catch (Zktz zktz) {
      throw a(null);
    } 
    Zstu zstu = (paramZsxd.ZG().Ze() == null) ? null : paramZsxd.ZG().Ze().Zt();
    try {
    
    } catch (Zktz zktz) {
      throw a(null);
    } 
    Zuh.Zb((zstu != null), Zqf.Zk);
    return zstu;
  }
  
  private static Zktz a(Zktz paramZktz) {
    return paramZktz;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsoh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */