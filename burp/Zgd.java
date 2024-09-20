package burp;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgd implements Zggu {
  private final Zbz5 ZB;
  
  private final Ztdi ZW;
  
  private final Zbzs Zx;
  
  private final Ze7b ZC;
  
  private final Ztos<Zt14> ZA;
  
  private final List<Zgrn> ZQ;
  
  private volatile Zlbu ZR;
  
  protected boolean Zt = true;
  
  private static final Zbzs Zl = Zgd::lambda$static$0;
  
  public Zgd(Ztdi paramZtdi, Zskz paramZskz) {
    this(paramZtdi, new Zbz5(paramZskz), Zl);
  }
  
  public Zgd(Ztdi paramZtdi, Zskz paramZskz, Zbzs paramZbzs) {
    this(paramZtdi, new Zbz5(paramZskz), paramZbzs);
  }
  
  private Zgd(Ztdi paramZtdi, Zbz5 paramZbz5, Zbzs paramZbzs) {
    this.ZW = paramZtdi;
    this.ZB = paramZbz5;
    this.Zx = paramZbzs;
    this.ZC = new Ze7b();
    this.ZA = new Ztos<>(Zt14.ZA());
    this.ZQ = new ArrayList<>();
    this.ZQ.add(paramZtdi.Zk().ZE(Zt10.Zn, this::lambda$new$1));
    this.ZQ.add(paramZtdi.Zk().ZE(Zt10.Zz, this::lambda$new$2));
    this.ZQ.add(paramZtdi.Zk().ZE(Zt10.ZN, this::lambda$new$3));
    this.ZQ.add(paramZtdi.Zk().ZE(Zt10.Zf, this::lambda$new$4));
    this.ZQ.add(paramZtdi.Zk().ZE(Zt10.ZH, this::lambda$new$5));
    this.ZQ.add(paramZtdi.Zk().ZE(Zt10.ZB, this::lambda$new$6));
    this.ZQ.add(paramZtdi.Zk().ZE(Zt10.ZA, this::lambda$new$7));
    this.ZQ.add(paramZtdi.Zk().ZE(Zt10.Zw, this::lambda$new$8));
  }
  
  public Zlli<Zt14> ZT() {
    return this.ZA;
  }
  
  public Zgd Zz(Zbzs paramZbzs) {
    Zgd zgd = new Zgd(this.ZW, this.ZB.Zs(), paramZbzs);
    zgd.Zt = false;
    return zgd;
  }
  
  private boolean ZT(Zez3 paramZez3) {
    return (this.ZC.ZK(paramZez3) != null);
  }
  
  private boolean Zq(Zez3 paramZez3) {
    return this.ZB.ZW(paramZez3, (byte)1);
  }
  
  private boolean Zm(Zez3 paramZez3) {
    return this.ZB.ZW(paramZez3, (byte)2);
  }
  
  public void ZM(Ztws paramZtws) {
    if (!Zu(paramZtws.ZW()))
      return; 
    ZA(paramZtws.ZW().ZkJ());
    Zd(paramZtws.ZW(), (byte)1, false);
  }
  
  public void Zf(Zez3 paramZez3) {
    ZP(paramZez3, false);
  }
  
  private boolean ZW(Zez3 paramZez3) {
    return ZP(paramZez3, true);
  }
  
  private boolean ZP(Zez3 paramZez3, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZW : Lburp/Ztdi;
    //   8: aload_1
    //   9: invokeinterface Za : (Lburp/Zez3;)Z
    //   14: ifeq -> 19
    //   17: iconst_0
    //   18: ireturn
    //   19: iconst_0
    //   20: istore #4
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual Zq : (Lburp/Zez3;)Z
    //   27: istore #5
    //   29: aload_0
    //   30: aload_1
    //   31: invokevirtual Zu : (Lburp/Zez3;)Z
    //   34: istore #6
    //   36: iload #5
    //   38: ifeq -> 77
    //   41: iload #6
    //   43: ifeq -> 68
    //   46: aload_0
    //   47: aload_1
    //   48: invokevirtual Zk : (Lburp/Zez3;)V
    //   51: aload_0
    //   52: aload_1
    //   53: iconst_0
    //   54: invokevirtual ZS : (Lburp/Zez3;Z)Lburp/Zxya;
    //   57: pop
    //   58: aload_0
    //   59: aload_1
    //   60: iload_2
    //   61: invokevirtual Zz : (Lburp/Zez3;Z)V
    //   64: aload_3
    //   65: ifnonnull -> 170
    //   68: aload_0
    //   69: aload_1
    //   70: invokevirtual ZK : (Lburp/Zez3;)V
    //   73: aload_3
    //   74: ifnonnull -> 170
    //   77: iload #6
    //   79: ifeq -> 157
    //   82: aload_0
    //   83: aload_1
    //   84: invokevirtual Zk : (Lburp/Zez3;)V
    //   87: aload_0
    //   88: aload_1
    //   89: invokevirtual ZT : (Lburp/Zez3;)Z
    //   92: ifeq -> 127
    //   95: aload_0
    //   96: getfield ZB : Lburp/Zbz5;
    //   99: aload_1
    //   100: iconst_1
    //   101: newarray byte
    //   103: dup
    //   104: iconst_0
    //   105: iconst_1
    //   106: bastore
    //   107: invokevirtual ZP : (Lburp/Zez3;[B)V
    //   110: aload_0
    //   111: aload_1
    //   112: iconst_0
    //   113: invokevirtual ZS : (Lburp/Zez3;Z)Lburp/Zxya;
    //   116: pop
    //   117: aload_0
    //   118: aload_1
    //   119: iconst_1
    //   120: invokevirtual Zz : (Lburp/Zez3;Z)V
    //   123: aload_3
    //   124: ifnonnull -> 170
    //   127: aload_0
    //   128: aload_1
    //   129: invokeinterface ZkJ : ()Lburp/Zez3;
    //   134: invokevirtual ZA : (Lburp/Zez3;)V
    //   137: aload_0
    //   138: aload_1
    //   139: iconst_1
    //   140: iconst_0
    //   141: invokevirtual Zd : (Lburp/Zez3;BZ)V
    //   144: aload_0
    //   145: aload_1
    //   146: iconst_1
    //   147: invokevirtual Zz : (Lburp/Zez3;Z)V
    //   150: iconst_1
    //   151: istore #4
    //   153: aload_3
    //   154: ifnonnull -> 170
    //   157: aload_0
    //   158: aload_1
    //   159: invokevirtual ZT : (Lburp/Zez3;)Z
    //   162: ifeq -> 170
    //   165: aload_0
    //   166: aload_1
    //   167: invokevirtual ZK : (Lburp/Zez3;)V
    //   170: iload #4
    //   172: ireturn
  }
  
  private void ZU(Zez3 paramZez3) {
    if (!ZT(paramZez3))
      return; 
    ZT(paramZez3, false);
    Zez3 zez3 = paramZez3.ZkJ();
    if (zez3 != null) {
      Zv(zez3);
      Zf(zez3);
    } 
  }
  
  private void ZM() {
    this.ZB.Zn();
    this.ZC.ZU();
  }
  
  public void ZN(Zew paramZew) {
    boolean bool1 = ZW(paramZew.Zv());
    boolean bool2 = ZT(paramZew.Zv());
    if (paramZew.ZX() && bool2)
      ZI(paramZew.Zv(), paramZew.Zq()); 
    if (bool1 || !bool2)
      return; 
    this.ZA.ZD(Zt14.Zh(this.ZC.ZK(paramZew.Zv()), paramZew.Zq()));
  }
  
  private void ZB(Zrnp paramZrnp) {
    ArrayList<Zk7x> arrayList = new ArrayList();
    Iterator<Zk7x> iterator = paramZrnp.ZF().iterator();
    String str = Zz_1.ZG();
    while (iterator.hasNext()) {
      Zk7x zk7x = iterator.next();
      if (!ZT(zk7x.Zxm()))
        continue; 
      Zf(zk7x.Zxm());
      arrayList.add(zk7x);
      if (str == null)
        break; 
    } 
    this.ZA.ZD(Zt14.ZV(arrayList));
  }
  
  private void ZS(Zmdd paramZmdd) {
    if (!ZT(paramZmdd.ZR()))
      return; 
    this.ZA.ZD(Zt14.Zk(this.ZC.ZK(paramZmdd.ZR()), paramZmdd.Zq()));
  }
  
  public void ZL(Zs7k paramZs7k) {
    Zf(paramZs7k.ZE());
    if (!ZT(paramZs7k.ZE()))
      return; 
    this.ZA.ZD(Zt14.Zd(this.ZC.ZK(paramZs7k.ZE()), paramZs7k.Zp()));
  }
  
  private void ZI(Zez3 paramZez3, List<Zrdb> paramList) {
    byte b = Zt(paramList);
    switch (b) {
      case 4:
      
      case 3:
      
      case 2:
      
      case 1:
      
      default:
        Zuh.Zv(false, Zqf.Zk, b);
        break;
    } 
    Color color = null;
    this.Zx.Zw(paramZez3, color);
  }
  
  private byte Zt(List<Zrdb> paramList) {
    byte b = -1;
    int i = 9999;
    String str = Zz_1.ZG();
    for (Zrdb zrdb : paramList) {
      int j = Zb3i.ZE(zrdb.ZaJ(), zrdb.Zac());
      if (j < i) {
        i = j;
        b = zrdb.ZaJ();
      } 
      if (str == null)
        break; 
    } 
    return b;
  }
  
  public boolean Zu(Zez3 paramZez3) {
    return (this.ZR == null || this.ZR.Zx(paramZez3, Zo(paramZez3)));
  }
  
  private int Zo(Zez3 paramZez3) {
    Zl9y zl9y = new Zl9y(this);
    paramZez3.ZK(zl9y);
    return zl9y.ZN;
  }
  
  private void ZK(Zez3 paramZez3) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual Zm : (Lburp/Zez3;)Z
    //   9: istore_3
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual Zo : (Lburp/Zez3;)I
    //   15: ifne -> 42
    //   18: aload_0
    //   19: aload_1
    //   20: iconst_0
    //   21: invokevirtual ZT : (Lburp/Zez3;Z)V
    //   24: iload_3
    //   25: ifeq -> 59
    //   28: aload_0
    //   29: aload_1
    //   30: invokeinterface ZkJ : ()Lburp/Zez3;
    //   35: invokevirtual Zv : (Lburp/Zez3;)V
    //   38: aload_2
    //   39: ifnonnull -> 59
    //   42: aload_0
    //   43: aload_1
    //   44: invokevirtual Zt : (Lburp/Zez3;)V
    //   47: aload_0
    //   48: aload_1
    //   49: invokevirtual ZG : (Lburp/Zez3;)V
    //   52: aload_0
    //   53: aload_1
    //   54: iconst_0
    //   55: invokevirtual ZS : (Lburp/Zez3;Z)Lburp/Zxya;
    //   58: pop
    //   59: aload_0
    //   60: aload_1
    //   61: iconst_0
    //   62: invokevirtual Zz : (Lburp/Zez3;Z)V
    //   65: return
  }
  
  private void Zt(Zez3 paramZez3) {
    this.ZB.Zy(paramZez3, new byte[] { 1 });
  }
  
  private void Zd(Zez3 paramZez3, byte paramByte, boolean paramBoolean) {
    if (paramZez3 == null) {
      Zuh.Zb(false, Zqf.Zv);
      return;
    } 
    Zuh.Zv((this.ZC.ZK(paramZez3) == null), Zqf.Zr, 1L);
    this.ZB.ZP(paramZez3, new byte[] { paramByte });
    Zxya zxya1 = ZS(paramZez3, paramBoolean);
    Zxya zxya2 = this.ZC.ZK(paramZez3.ZkJ());
    if (zxya2 == null && !Zk8c.ZK(paramZez3)) {
      Zuh.Zv(false, Zqf.Zr, 2L);
      return;
    } 
    this.ZA.ZD(Zt14.ZI(zxya1, zxya2, paramBoolean));
  }
  
  private Zxya ZS(Zez3 paramZez3, boolean paramBoolean) {
    Zxya zxya1 = this.ZC.ZK(paramZez3);
    boolean bool = (zxya1 != null) ? true : false;
    Zxya zxya2 = new Zxya(paramZez3, this.ZB.ZN(paramZez3));
    this.ZC.Zl(paramZez3, zxya2);
    if (bool)
      this.ZA.ZD(Zt14.ZJ(zxya2, paramBoolean)); 
    return zxya2;
  }
  
  private void ZT(Zez3 paramZez3, boolean paramBoolean) {
    Zxya zxya = this.ZC.ZK(paramZez3);
    if (zxya == null) {
      Zuh.Zb(false, Zqf.Zx);
      return;
    } 
    this.ZC.Zr(paramZez3);
    this.ZB.ZG(paramZez3);
    paramZez3.ZK(new Zl9c(this));
    this.ZA.ZD(Zt14.Zz(zxya, paramBoolean));
  }
  
  private void ZA(Zez3 paramZez3) {
    if (paramZez3 != null && !ZT(paramZez3) && !this.ZW.Za(paramZez3)) {
      ZA(paramZez3.ZkJ());
      Zd(paramZez3, Zu(paramZez3) ? 1 : 0, false);
    } 
  }
  
  private void Zv(Zez3 paramZez3) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 103
    //   8: aload_0
    //   9: getfield ZW : Lburp/Ztdi;
    //   12: aload_1
    //   13: invokeinterface Za : (Lburp/Zez3;)Z
    //   18: ifne -> 103
    //   21: new burp/Zl95
    //   24: dup
    //   25: aload_0
    //   26: invokespecial <init> : (Lburp/Zgd;)V
    //   29: astore_3
    //   30: aload_1
    //   31: aload_3
    //   32: invokeinterface ZK : (Lburp/Zl9l;)Z
    //   37: pop
    //   38: aload_3
    //   39: getfield Zu : I
    //   42: ifne -> 92
    //   45: aload_0
    //   46: aload_1
    //   47: invokevirtual Zq : (Lburp/Zez3;)Z
    //   50: ifne -> 70
    //   53: aload_3
    //   54: getfield ZJ : I
    //   57: ifne -> 70
    //   60: aload_0
    //   61: aload_1
    //   62: iconst_0
    //   63: invokevirtual ZT : (Lburp/Zez3;Z)V
    //   66: aload_2
    //   67: ifnonnull -> 92
    //   70: aload_0
    //   71: getfield ZB : Lburp/Zbz5;
    //   74: aload_1
    //   75: iconst_1
    //   76: newarray byte
    //   78: dup
    //   79: iconst_0
    //   80: iconst_2
    //   81: bastore
    //   82: invokevirtual Zy : (Lburp/Zez3;[B)V
    //   85: aload_0
    //   86: aload_1
    //   87: iconst_0
    //   88: invokevirtual ZS : (Lburp/Zez3;Z)Lburp/Zxya;
    //   91: pop
    //   92: aload_1
    //   93: invokeinterface ZkJ : ()Lburp/Zez3;
    //   98: astore_1
    //   99: aload_2
    //   100: ifnonnull -> 4
    //   103: return
  }
  
  private void Zk(Zez3 paramZez3) {
    Zd(paramZez3);
    ZG(paramZez3);
  }
  
  private void ZG(Zez3 paramZez3) {
    String str = Zz_1.ZG();
    if (Zk8c.Zh(paramZez3)) {
      ZJ((Zmxt)paramZez3);
      if (str == null) {
        if (!Zk8c.ZX(paramZez3))
          Zc(paramZez3); 
        return;
      } 
      return;
    } 
    if (!Zk8c.ZX(paramZez3))
      Zc(paramZez3); 
  }
  
  private void Zd(Zez3 paramZez3) {
    if (ZC(paramZez3))
      this.ZB.ZP(paramZez3, new byte[] { 2 }); 
  }
  
  private boolean ZC(Zez3 paramZez3) {
    Zs73 zs73 = (new Zz19(paramZez3)).ZN();
    return (zs73 != null && (zs73.ZTU() == 2 || zs73.ZTU() == 3));
  }
  
  private void Zz(Zez3 paramZez3, boolean paramBoolean) {
    boolean bool = false;
    Zez3 zez3 = paramZez3.ZkJ();
    String str = Zz_1.ZG();
    while (zez3 != null && !this.ZW.Za(zez3)) {
      if (Zm(paramZez3) && !Zm(zez3)) {
        this.ZB.ZP(zez3, new byte[] { 2 });
        bool = true;
      } 
      if (Zy(zez3, paramZez3, paramBoolean))
        bool = true; 
      if (!bool)
        return; 
      ZS(zez3, false);
      bool = false;
      zez3 = zez3.ZkJ();
      if (str == null)
        break; 
    } 
  }
  
  private void ZJ(Zmxt paramZmxt) {
    Zs3g zs3g = new Zs3g(this.ZB, paramZmxt);
    byte b1 = 0;
    byte b2 = 0;
    int i = 9999;
    Iterator<Zrdb> iterator = paramZmxt.Zqz().ZRn().iterator();
    String str = Zz_1.ZG();
    while (iterator.hasNext()) {
      Zrdb zrdb = iterator.next();
      byte b3 = zrdb.ZaJ();
      byte b4 = zrdb.Zac();
      int j = Zs3g.Zz(b3, b4);
      if (!b1 || !b2 || j < i) {
        b1 = b3;
        b2 = b4;
        i = j;
      } 
      if (str == null)
        break; 
    } 
    if (i != zs3g.ZN())
      zs3g.ZD(b1, b2); 
  }
  
  private boolean Zy(Zez3 paramZez31, Zez3 paramZez32, boolean paramBoolean) {
    if (Zk8c.Zh(paramZez31))
      return false; 
    Zs3g zs3g1 = new Zs3g(this.ZB, paramZez31);
    int i = zs3g1.ZN();
    Zs3g zs3g2 = new Zs3g(this.ZB, paramZez32);
    int j = zs3g2.ZN();
    if (j < i) {
      zs3g1.ZD(zs3g2.ZM(), zs3g2.Zk());
      return true;
    } 
    return paramBoolean ? false : Zb(paramZez31, zs3g1);
  }
  
  private void Zc(Zez3 paramZez3) {
    Zb(paramZez3, new Zs3g(this.ZB, paramZez3));
  }
  
  private boolean Zb(Zez3 paramZez3, Zs3g paramZs3g) {
    Zl9r zl9r = new Zl9r(this);
    paramZez3.ZK(zl9r);
    if (zl9r.ZK != paramZs3g.ZN()) {
      paramZs3g.ZD(zl9r.Zf, zl9r.ZA);
      return true;
    } 
    return false;
  }
  
  public void ZB() {
    this.ZQ.forEach(Zgrn::ZZ);
    this.ZQ.clear();
  }
  
  public void Zd(Zlbu paramZlbu, BooleanSupplier paramBooleanSupplier, Runnable paramRunnable) {
    String str = Zz_1.ZG();
    Zuh.Zb(!SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.ZR = paramZlbu;
    try {
      if (this.Zt) {
        this.Zt = false;
        return;
      } 
      for (Zzhb zzhb : this.ZW.ZE()) {
        if (paramBooleanSupplier.getAsBoolean())
          break; 
        if (this.ZW.Za(zzhb) || this.ZW.Zj(zzhb, this))
          continue; 
        Zv(zzhb, paramBooleanSupplier);
        this.ZW.Zh(zzhb, this);
        if (str == null)
          break; 
      } 
      Zl();
    } finally {
      paramRunnable.run();
    } 
  }
  
  protected void Zl() {
    this.ZA.ZD(Zt14.ZN());
  }
  
  private void Zv(Zez3 paramZez3, BooleanSupplier paramBooleanSupplier) {
    Zl9d zl9d = new Zl9d(this, paramBooleanSupplier);
    paramZez3.ZK(zl9d);
  }
  
  public void Zr(Zez3 paramZez3) {
    (new Zr3m(this, paramZez3)).Zb();
  }
  
  public boolean ZO(Zez3 paramZez3) {
    if (this.ZR != null && ZT(paramZez3) && this.ZR.ZM(paramZez3)) {
      ZT(paramZez3, true);
      return true;
    } 
    return false;
  }
  
  public void Zk(Zr05 paramZr05) {
    Zl9g zl9g = new Zl9g(this, paramZr05);
    this.ZW.ZZ(zl9g);
  }
  
  private void lambda$new$8(Zxr8 paramZxr8) {
    ZM();
  }
  
  private void lambda$new$7(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zf);
  }
  
  private void lambda$new$6(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZU);
  }
  
  private void lambda$new$5(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZM);
  }
  
  private void lambda$new$4(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZL);
  }
  
  private void lambda$new$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZS);
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZB);
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZN);
  }
  
  private static void lambda$static$0(Zez3 paramZez3, Color paramColor) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */