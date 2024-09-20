package burp;

import java.util.Collections;
import java.util.Iterator;
import net.portswigger.Zs4;
import net.portswigger.Zsy;

public class Zela extends Zeli<Zrbc, Zt0r> {
  private final Zbza ZF;
  
  private final Zkq4 Zz;
  
  private final Zrjd Zr;
  
  private final Zkl6 ZJ;
  
  private final Zkm8 Zl;
  
  private final Zkc_ ZR;
  
  private final Ztks Zb;
  
  private final Zzs1 Zq;
  
  private final Zmz6 Zy;
  
  private final Zesv ZN;
  
  private final Ze4e ZV;
  
  private final Zr46 ZE;
  
  private final Zsy ZO;
  
  private final Zs4 Zc;
  
  private final Zzld ZW;
  
  private final Zz45 Zx;
  
  private final Zskh Z_;
  
  private final Zz1i Zj;
  
  private final int Zm;
  
  private final Zsoh ZX;
  
  private final Zz28 Zw;
  
  private final Zg56 ZK;
  
  private final Zlli<Zt13> ZH;
  
  public Zela(Zbza paramZbza, Zkq4 paramZkq4, Zm8t paramZm8t, Zkl6 paramZkl6, Zrjd paramZrjd, Zkm8 paramZkm8, Zkc_ paramZkc_, Ztks paramZtks, Zzs1 paramZzs1, Zmz6 paramZmz6, Zesv paramZesv, Ze4e paramZe4e, Zsy paramZsy, Zs4 paramZs4, Zr_4 paramZr_4, Zrgd paramZrgd, Zr46 paramZr46, Zzld paramZzld, Zz45 paramZz45, Zskh paramZskh, Zz1i paramZz1i, int paramInt, Zsoh paramZsoh, Zz28 paramZz28, Zlli<Zt13> paramZlli, Ztos<Zt1o> paramZtos) {
    super(paramZm8t, Zt0r.S2, paramZbza, paramZz1i, paramZr_4, paramZkl6.ZB(), paramZrgd, paramZe4e, paramZsoh, paramZlli, paramZtos);
    this.ZF = paramZbza;
    this.Zz = paramZkq4;
    this.ZJ = paramZkl6;
    this.Zr = paramZrjd;
    this.Zl = paramZkm8;
    this.ZR = paramZkc_;
    this.Zb = paramZtks;
    this.Zq = paramZzs1;
    this.Zy = paramZmz6;
    this.ZN = paramZesv;
    this.ZV = paramZe4e;
    this.ZO = paramZsy;
    this.Zc = paramZs4;
    this.ZE = paramZr46;
    this.ZW = paramZzld;
    this.Zx = paramZz45;
    this.Z_ = paramZskh;
    this.Zj = paramZz1i;
    this.Zm = paramInt;
    this.ZX = paramZsoh;
    this.Zw = paramZz28;
    this.ZK = new Zg56(paramZe4e);
    this.ZH = paramZlli;
  }
  
  protected boolean ZR() {
    return this.Zz.Zsb();
  }
  
  protected Iterable<Zrbc> Zi() {
    return (this.Zz.ZEc() && this.Zz.Zsb()) ? Zw() : Collections.emptySet();
  }
  
  private Iterable<Zrbc> Zw() {
    return this::lambda$staticAnalysisTwoPhases$2;
  }
  
  private Iterator lambda$staticAnalysisTwoPhases$2() {
    return new Zt04(this.Zr, this.ZR, this.ZJ.ZB(), this.Zx, this.ZF, this.Zl, this.ZW, this.Zz, this.Zy, this.ZV, this.ZE, new Ztij(this.ZD, this.ZO, this.Zc, this.ZJ, this.Zz, this.Zb, this.Zq, Zmdu.REFLECTED, this::lambda$staticAnalysisTwoPhases$0, this.Zm, this.Z_, this.ZK, Zt0r.S2, this.Zj.Zd(Zt0r.S2), this.ZF, this.ZX, this.Zw, this.ZH), this.ZN, new Zb9t(this::lambda$staticAnalysisTwoPhases$1), this.Zj, this.ZK);
  }
  
  private static void lambda$staticAnalysisTwoPhases$1(Zela paramZela, Ze3n paramZe3n) {
    paramZela.ZG(paramZe3n);
  }
  
  private Zmhe lambda$staticAnalysisTwoPhases$0(Ztpx paramZtpx, Ze3n paramZe3n1, Ze3n paramZe3n2, Zxs7 paramZxs7) {
    return this.ZN.Za(paramZe3n1, paramZxs7);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zela.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */