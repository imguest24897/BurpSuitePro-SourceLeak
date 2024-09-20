package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zkoa implements Zrkn {
  private final Zmzk ZB;
  
  private final Zewx ZC;
  
  private final boolean ZF;
  
  private final Zbnt Zv;
  
  private final List<Zsjh<?>> Zf;
  
  private final long Zj;
  
  private static boolean ZZ;
  
  public Zkoa(Zewx paramZewx, Zbnt paramZbnt, boolean paramBoolean, long paramLong, Zmzk paramZmzk) {
    this.ZC = paramZewx;
    this.ZF = paramBoolean;
    this.Zv = paramZbnt;
    this.Zj = paramLong;
    this.ZB = paramZmzk;
    this.Zf = new ArrayList<>();
  }
  
  public List<Zsjh<?>> Zq(Zlp9 paramZlp9, Zer0 paramZer0, List<Zer0> paramList) {
    return Z_(Zj(paramZlp9, paramZer0, paramList));
  }
  
  public List<Zsjh<?>> Z_(Zer0 paramZer0) {
    if (paramZer0 == null)
      return Collections.emptyList(); 
    paramZer0.ZQ(this);
    return this.Zf;
  }
  
  public void ZK(Zxyt paramZxyt) {
    if (paramZxyt.ZT() == null || paramZxyt.ZM() == null)
      return; 
    Zl1r zl1r = this.ZF ? this.ZC.ZE(paramZxyt.ZM()) : null;
    Zvow zvow = (new Zvow(this.ZB, this.Zv)).Zp(paramZxyt.ZT()).ZK(paramZxyt.ZM()).Zz(this.ZC.ZY(paramZxyt.ZT())).Zf(zl1r);
    this.Zf.add(new Zqc(zvow, paramZxyt.Zd(), paramZxyt.ZJ(), paramZxyt.Zv(), paramZxyt.Zu(), this.Zj, paramZxyt.Zx()));
  }
  
  public void ZJ(Zxyr paramZxyr) {
    boolean bool = ZP();
    this.Zf.add(new Zrln(paramZxyr.Zk(), paramZxyr.ZW(), paramZxyr.ZG(), paramZxyr.ZJ(), paramZxyr.Zv(), paramZxyr.Zu(), this.Zj, paramZxyr.Zx()));
    if (Zbqc.Zwu() == null)
      ZZ(!bool); 
  }
  
  public void ZR(Zxyy paramZxyy) {
    boolean bool = ZB();
    this.Zf.add(new Zlyq(paramZxyy.Zh(), paramZxyy.Zq(), paramZxyy.ZP(), paramZxyy.ZI(), paramZxyy.Zd(), paramZxyy.ZJ(), paramZxyy.Zv(), paramZxyy.Zu(), this.Zj, paramZxyy.Zx()));
    if (bool)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  private static Zer0 Zj(Zlp9 paramZlp9, Zer0 paramZer0, List<Zer0> paramList) {
    // Byte code:
    //   0: invokestatic ZP : ()Z
    //   3: istore_3
    //   4: new burp/Zrh3
    //   7: dup
    //   8: aload_1
    //   9: invokeinterface Zi : ()Ljava/lang/String;
    //   14: invokespecial <init> : (Ljava/lang/String;)V
    //   17: invokevirtual Zd : ()Lburp/Ztt6;
    //   20: astore #4
    //   22: aload #4
    //   24: ifnonnull -> 42
    //   27: iconst_0
    //   28: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   31: aload_1
    //   32: invokeinterface Zi : ()Ljava/lang/String;
    //   37: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   40: aconst_null
    //   41: areturn
    //   42: aload_2
    //   43: invokeinterface iterator : ()Ljava/util/Iterator;
    //   48: astore #5
    //   50: aload #5
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 114
    //   60: aload #5
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: checkcast burp/Zer0
    //   70: astore #6
    //   72: aload_1
    //   73: invokeinterface ZA : ()Lburp/Zb25;
    //   78: aload #6
    //   80: invokeinterface ZA : ()Lburp/Zb25;
    //   85: if_acmpne -> 110
    //   88: aload #6
    //   90: invokeinterface Zx : ()Ljava/lang/String;
    //   95: aload_1
    //   96: invokeinterface Zx : ()Ljava/lang/String;
    //   101: invokevirtual equals : (Ljava/lang/Object;)Z
    //   104: ifeq -> 110
    //   107: aload #6
    //   109: areturn
    //   110: iload_3
    //   111: ifne -> 50
    //   114: aload_2
    //   115: invokeinterface iterator : ()Ljava/util/Iterator;
    //   120: astore #5
    //   122: aload #5
    //   124: invokeinterface hasNext : ()Z
    //   129: ifeq -> 252
    //   132: aload #5
    //   134: invokeinterface next : ()Ljava/lang/Object;
    //   139: checkcast burp/Zer0
    //   142: astore #6
    //   144: new burp/Zrh3
    //   147: dup
    //   148: aload #6
    //   150: invokeinterface Zi : ()Ljava/lang/String;
    //   155: invokespecial <init> : (Ljava/lang/String;)V
    //   158: invokevirtual Zd : ()Lburp/Ztt6;
    //   161: astore #7
    //   163: aload #7
    //   165: ifnonnull -> 186
    //   168: iconst_0
    //   169: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   172: aload #6
    //   174: invokeinterface Zi : ()Ljava/lang/String;
    //   179: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   182: iload_3
    //   183: ifne -> 122
    //   186: aload_1
    //   187: invokeinterface ZA : ()Lburp/Zb25;
    //   192: aload #6
    //   194: invokeinterface ZA : ()Lburp/Zb25;
    //   199: if_acmpne -> 248
    //   202: aload #7
    //   204: invokevirtual ZN : ()Lburp/Zlp9;
    //   207: aload_0
    //   208: if_acmpne -> 248
    //   211: aload #7
    //   213: invokevirtual Zk : ()Lburp/Zro0;
    //   216: aload #4
    //   218: invokevirtual Zk : ()Lburp/Zro0;
    //   221: invokeinterface equals : (Ljava/lang/Object;)Z
    //   226: ifeq -> 248
    //   229: aload_1
    //   230: invokeinterface ZO : ()I
    //   235: aload #6
    //   237: invokeinterface ZO : ()I
    //   242: if_icmpne -> 248
    //   245: aload #6
    //   247: areturn
    //   248: iload_3
    //   249: ifne -> 122
    //   252: aconst_null
    //   253: areturn
  }
  
  public static void ZZ(boolean paramBoolean) {
    ZZ = paramBoolean;
  }
  
  public static boolean ZB() {
    return ZZ;
  }
  
  public static boolean ZP() {
    boolean bool = ZB();
    return !bool;
  }
  
  static {
    if (ZB())
      ZZ(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkoa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */