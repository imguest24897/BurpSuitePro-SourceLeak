package burp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import net.portswigger.Zsy;

public class Zel7 extends Zeli<Zrbc, Zt0r> {
  private final Zbza Zi;
  
  private final Ze4e Z_;
  
  private final Zr46 ZH;
  
  private final Zlba Zy;
  
  private final Zmz6 ZW;
  
  private final Zr_4 Zj;
  
  private final Zb0k Zt;
  
  private final Zrjd ZG;
  
  private final Zkq4 Zz;
  
  private final Zz1i ZE;
  
  private final Zsy ZJ;
  
  private final Zesv ZX;
  
  private final Zsoh Zq;
  
  private final Zkl6 ZK;
  
  private final Zbjl ZN;
  
  private final Zly1 Zv;
  
  private final Znn Zm;
  
  private final Zzkd ZO;
  
  public Zel7(Zbza paramZbza, Ze4e paramZe4e, Zr46 paramZr46, Zlba paramZlba, Zmz6 paramZmz6, Zr_4 paramZr_41, Zr_4 paramZr_42, Zb0k paramZb0k, Zm8t paramZm8t, Zkq4 paramZkq4, Zz1i paramZz1i, Zsy paramZsy, Zrjd paramZrjd, Zsoh paramZsoh, Zesv paramZesv, Zkl6 paramZkl6, Zbjl paramZbjl, Zrgd paramZrgd, Zly1 paramZly1, Znn paramZnn, Zzkd paramZzkd, Zlli<Zt13> paramZlli, Ztos<Zt1o> paramZtos) {
    super(paramZm8t, Zt0r.A1, paramZbza, paramZz1i, paramZr_41, paramZkl6.ZB(), paramZrgd, paramZe4e, paramZsoh, paramZlli, paramZtos);
    this.Zi = paramZbza;
    this.Z_ = paramZe4e;
    this.ZH = paramZr46;
    this.Zy = paramZlba;
    this.ZW = paramZmz6;
    this.Zj = paramZr_42;
    this.Zt = paramZb0k;
    this.Zz = paramZkq4;
    this.ZE = paramZz1i;
    this.ZJ = paramZsy;
    boolean bool = Zg75.Zo();
    this.ZG = paramZrjd;
    this.Zq = paramZsoh;
    this.ZX = paramZesv;
    this.ZK = paramZkl6;
    this.ZN = paramZbjl;
    this.Zv = paramZly1;
    this.Zm = paramZnn;
    this.ZO = paramZzkd;
    if (Zbqc.Zwu() == null)
      Zg75.ZB(!bool); 
  }
  
  protected boolean ZR() {
    return this.Zz.Zsn();
  }
  
  protected Iterable<Zrbc> Zi() {
    Zkvg zkvg = new Zkvg(this);
    Objects.requireNonNull(this.ZE);
    Zbje zbje = new Zbje(this.ZE::Zd, this.Z_, this.Zz);
    return this.Zz.Zsn() ? Arrays.<Zrbc>asList(new Zrbc[] { 
          new Zg6p(Collections.singleton(new Zs7m(this.Zi, this.ZE, this.ZG, zkvg, this.Zz, this.Z_, this.ZK.ZB()))), new Ztmi(Zt0r.A1, this.ZE, this.Zi, zkvg::lambda$buildPhases$0), new Zsbn(this.Zt, this.ZW.ZV(), zkvg, this.Zy, this.Zi, this.ZE, this.Zm, this.Z_, this.ZC), new Zz31(this.ZM, this.ZW, this.Zz, this.ZE, this.Zy, this.Zi, this.Z_, new Zlnr(this.Zy, this.Zz, this.Zq, this.ZX, this.Zv, this.ZO, zkvg, this.Zt, this.ZC), zkvg::lambda$buildPhases$1, Zel7::lambda$buildPhases$2, zkvg::lambda$buildPhases$3), new Ze3q(this.Zt, this.ZW, zkvg, this.Zy, this.Zi, this.ZE, this.Zz, zbje, this.Z_, this.ZC), new Zzkw(this.Zt, zkvg, this.ZW, this.Zy, this.Zi, this.ZM, this.ZE, this.Z_, this.ZK.ZB(), this.ZC), new Zmxp(this.Zt, zkvg, this.ZW, this.Zy, this.Zi, this.ZM, this.ZE, this.Z_, this.ZK.ZB(), this.ZC), zbje.ZD(), new Zle2(this.ZW, zkvg, this.Zy, this.Zj, this.Zz, this.Zi, this.ZE, this.ZJ, this.Zq, this.ZK, this.ZN, this.ZX, this.Z_), new Zmk6(Zt0r.A1, this.ZW, zkvg, this.Zy, this.Zz, this.Zi, this.ZE, this.Zv, this.Z_), 
          new Zso2(Zt0r.A1, this.Zi, this.ZH) }) : Collections.<Zrbc>emptyList();
  }
  
  private static Collection lambda$buildPhases$3(Zkvg paramZkvg) {
    return paramZkvg.ZR().ZF();
  }
  
  private static void lambda$buildPhases$2(Zrj paramZrj, Ze3n paramZe3n, Zz4_ paramZz4_) {}
  
  private static Ze3n lambda$buildPhases$1(Zkvg paramZkvg, Ztpx paramZtpx) {
    return paramZkvg.ZR().ZO();
  }
  
  private static void lambda$buildPhases$0(Zkvg paramZkvg, Zb09 paramZb09) {
    paramZkvg.ZR().ZF().add(paramZb09);
  }
  
  static void ZY(Zel7 paramZel7, Ze3n paramZe3n) {
    paramZel7.ZG(paramZe3n);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zel7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */