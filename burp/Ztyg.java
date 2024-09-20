package burp;

import java.util.EnumSet;
import java.util.function.Supplier;

public class Ztyg {
  private final Zz0n ZL;
  
  private final Zt4u Zo;
  
  private final Zerg Zn;
  
  private final Zgbj Zj;
  
  private final Zgb6 Za;
  
  private final Zskh Z_;
  
  private final Zbnt Zg;
  
  private final Ztwv Zz;
  
  private final Ztdq ZQ;
  
  private final Ze_8 Zf;
  
  private final Zkl6 ZD;
  
  private final Zm6x ZO;
  
  private final Zr_4 ZF;
  
  private final Zb86 ZE;
  
  private final Zskl ZG;
  
  private final Zey9 Zm;
  
  private Zbiv Zl;
  
  public Ztyg(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgbj paramZgbj, Zgb6 paramZgb6, Zskh paramZskh, Ztwv paramZtwv, Ztdq paramZtdq, Ze_8 paramZe_8, Zb86 paramZb86, Zskl paramZskl, Zr_4 paramZr_4, Zm6x paramZm6x) {
    this.ZL = paramZz0n;
    this.Zo = paramZt4u;
    this.Zn = paramZerg;
    this.Zj = paramZgbj;
    this.Za = paramZgb6;
    this.Z_ = paramZskh;
    this.Zz = paramZtwv;
    this.ZQ = paramZtdq;
    this.Zf = paramZe_8;
    this.ZE = paramZb86;
    this.ZG = paramZskl;
    this.ZF = paramZr_4;
    this.ZD = paramZt4u.Ze();
    this.ZO = paramZm6x;
    this.Zg = this.ZD.ZB();
    this.Zm = this.ZD.ZH();
  }
  
  public Zbdf Zz(Zmgv paramZmgv, Zeew paramZeew, boolean paramBoolean, EnumSet<Zgu3> paramEnumSet, Zb9b paramZb9b) {
    return Zv(paramZmgv, paramZeew::lambda$create$0, paramBoolean, paramEnumSet, paramZb9b);
  }
  
  public Zbdf Zv(Zmgv paramZmgv, Supplier<Zeew> paramSupplier, boolean paramBoolean, EnumSet<Zgu3> paramEnumSet, Zb9b paramZb9b) {
    return Zv(paramZmgv, new Zseu(), paramSupplier, paramBoolean, paramEnumSet, true, Zghz.Zq, Zt22.ZG, new Zmd2(this.Zg), Zzie.Zh, paramZb9b);
  }
  
  public Zbdf ZE(Zmgv paramZmgv, Zs9h paramZs9h, Zeew paramZeew, boolean paramBoolean, EnumSet<Zgu3> paramEnumSet, Zghz paramZghz, Zt22 paramZt22, Zs18 paramZs18, Zzie paramZzie, Zb9b paramZb9b) {
    return Zv(paramZmgv, paramZs9h, paramZeew::lambda$create$0, paramBoolean, paramEnumSet, true, paramZghz, paramZt22, paramZs18, paramZzie, paramZb9b);
  }
  
  public Zbdf Z_(Zmgv paramZmgv, Zeew paramZeew, boolean paramBoolean1, EnumSet<Zgu3> paramEnumSet, boolean paramBoolean2, Zb9b paramZb9b) {
    return Zv(paramZmgv, new Zseu(), paramZeew::lambda$create$0, paramBoolean1, paramEnumSet, paramBoolean2, Zghz.Zq, Zt22.ZG, new Zmd2(this.Zg), Zzie.Zh, paramZb9b);
  }
  
  private Zbdf Zv(Zmgv paramZmgv, Zs9h paramZs9h, Supplier<Zeew> paramSupplier, boolean paramBoolean1, EnumSet<Zgu3> paramEnumSet, boolean paramBoolean2, Zghz paramZghz, Zt22 paramZt22, Zs18 paramZs18, Zzie paramZzie, Zb9b paramZb9b) {
    Zrs_ zrs_ = (Zrs_)(paramBoolean2 ? ZH(paramSupplier, paramBoolean1, paramZb9b) : ZU(paramSupplier, paramBoolean1));
    return new Zbdf(this.ZL, this.Zn, this.Za, paramZs18, this.Zm, this.Zz, this.ZE, paramZmgv, paramZs9h, paramSupplier.get(), paramBoolean1, paramEnumSet, this.Zf, zrs_, new Zlul(paramSupplier.get()), new Zgk8(this.ZL, this.Zo, this.Zn, paramSupplier, this.Zg, this.Zl, this.ZQ, this.Z_, this.Zj, this.Zz, paramBoolean2, this.Zm, paramZb9b), this.ZG, new Zsai(), paramZghz, paramZt22, paramZzie);
  }
  
  private Zrqk ZH(Supplier<Zeew> paramSupplier, boolean paramBoolean, Zb9b paramZb9b) {
    return new Zrqk(paramBoolean, this.Zn, this.ZF, this.Zz, this.Zl, this.Zg, this.ZD, paramSupplier.get(), new Zsai(), this.ZO, paramZb9b);
  }
  
  private Zbnh ZU(Supplier<Zeew> paramSupplier, boolean paramBoolean) {
    return new Zbnh(paramBoolean, this.Zn, this.Zg, this.ZD, paramSupplier.get(), this.ZO);
  }
  
  public Zbdf Zo(Zmgv paramZmgv, Zeew paramZeew, boolean paramBoolean, EnumSet<Zgu3> paramEnumSet, Zgli paramZgli, Zb9b paramZb9b) {
    return Zn(paramZmgv, paramZeew, paramBoolean, paramEnumSet, paramZgli, new Zrqk(paramBoolean, this.Zn, this.ZF, this.Zz, this.Zl, this.Zg, this.ZD, paramZeew, paramZgli, this.ZO, paramZb9b), paramZb9b);
  }
  
  public Zbdf Zn(Zmgv paramZmgv, Zeew paramZeew, boolean paramBoolean, EnumSet<Zgu3> paramEnumSet, Zgli paramZgli, Zrs_ paramZrs_, Zb9b paramZb9b) {
    return new Zbdf(this.ZL, this.Zn, this.Za, new Zmd2(this.Zg), this.Zm, this.Zz, this.ZE, paramZmgv, new Zseu(), paramZeew, paramBoolean, paramEnumSet, this.Zf, paramZrs_, new Zlul(paramZeew), new Zkgr(this.ZL, this.Zo, this.Zn, paramZeew, this.Zg, this.Zl, this.ZQ, this.Z_, this.Zj, this.Zz, paramZgli, this.Zm, this.ZF, paramZb9b), this.ZG, paramZgli, Zghz.Zq, Zt22.ZG, Zzie.Zh);
  }
  
  public void Zq(Zbiv paramZbiv) {
    this.Zl = paramZbiv;
  }
  
  private static Zeew lambda$create$0(Zeew paramZeew) {
    return paramZeew;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztyg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */