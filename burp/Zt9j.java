package burp;

import java.lang.management.ManagementFactory;

public class Zt9j {
  private final Zkl6 ZE;
  
  private final Zlog ZB;
  
  private final Zl7h ZL;
  
  private final Zr69 Zz;
  
  private final Zs32 ZQ;
  
  private final Ztos<Zt18> ZF;
  
  private final Zr_4 Zs;
  
  private final Zskh ZH;
  
  private final Ztdi Zd;
  
  private final Ztks Ze;
  
  private final Zzs1 Zh;
  
  private final Zgb6 Zg;
  
  private final Zlli<Zt13> Zf;
  
  public Zt9j(Zlog paramZlog, Zr69 paramZr69, Zkl6 paramZkl6, Zs32 paramZs32, Ztos<Zt18> paramZtos, Zr_4 paramZr_4, Zskh paramZskh, Ztdi paramZtdi, Ztks paramZtks, Zzs1 paramZzs1, Zgb6 paramZgb6, Zlli<Zt13> paramZlli) {
    this.ZB = paramZlog;
    this.ZL = paramZlog.ZnH();
    this.Zz = paramZr69;
    this.ZE = paramZkl6;
    this.ZQ = paramZs32;
    this.ZF = paramZtos;
    this.Zs = paramZr_4;
    this.ZH = paramZskh;
    this.Zd = paramZtdi;
    this.Ze = paramZtks;
    this.Zh = paramZzs1;
    this.Zg = paramZgb6;
    this.Zf = paramZlli;
  }
  
  public Zss4 Zp(Zbql paramZbql, Zm90 paramZm90, Zt1g paramZt1g) {
    Ztos<Zt35> ztos = paramZbql.ZH();
    Zes1 zes1 = this.Zg.ZU0();
    Zli8 zli8 = (new Zm4d(this.ZE.ZB(), ztos::lambda$from$0, this.Zz, zes1)).ZL(this.Zz.ZT()).ZI(this.Zz.ZI(), this.Zd).ZP(this.Zz.Zc(), this.Zz.ZD(), this.Zz.ZP()).Zr(this.Zz.Zo()).Zn(this.Zz.Zt()).Zy();
    Ztla ztla = new Ztla(this.Zz.ZD(), this.ZE, this.Zs, this.ZL.ZVe());
    Zt0d zt0d = new Zt0d(new Zz6n(Runtime.getRuntime()), ManagementFactory.getPlatformMBeanServer());
    Zmv2 zmv2 = new Zmv2(this.ZE, this.Zs, this.ZQ, this.ZF, ztos, zli8, paramZm90, ztla, this.Ze, this.Zh, zt0d, this.Zz, this.ZL, this.Zg, this.ZH, paramZt1g);
    int[] arrayOfInt = Zzcs.ZE();
    Zzs_ zzs_ = new Zzs_();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zss4(this.ZF, paramZbql, this.Zz, ztla, zmv2, this.Zf, this.ZB, this.Zs, this.ZH, paramZt1g, zzs_);
  }
  
  private static void lambda$from$0(Ztos paramZtos, Zlvj paramZlvj) {
    paramZtos.ZD(new Zxr8<>(Zt35.Zq, paramZlvj));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt9j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */