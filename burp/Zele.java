package burp;

import java.util.Collections;
import java.util.Iterator;
import net.portswigger.Zs4;
import net.portswigger.Zsy;

public class Zele extends Zeli<Zrbc, Zt0r> {
  private final Zbza ZY;
  
  private final Zkq4 Zc;
  
  private final Zkl6 ZI;
  
  private final Zrjd ZQ;
  
  private final Zkm8 Zw;
  
  private final Zkc_ Zi;
  
  private final Ztks Zr;
  
  private final Zzs1 ZP;
  
  private final Zmz6 Zu;
  
  private final Zesv Za;
  
  private final Ze4e ZS;
  
  private final Zr46 Zm;
  
  private final Zsy Zj;
  
  private final Zs4 ZV;
  
  private final Zte5 ZG;
  
  private final Zz45 ZN;
  
  private final Zskh Zd;
  
  private final Zz1i ZR;
  
  private final int Zf;
  
  private final Zsoh Zg;
  
  private final Zz28 Z_;
  
  private final Zg56 Zt;
  
  private final Zlli<Zt13> Zh;
  
  public Zele(Zbza paramZbza, Zkq4 paramZkq4, Zm8t paramZm8t, Zkl6 paramZkl6, Zrjd paramZrjd, Zkm8 paramZkm8, Zkc_ paramZkc_, Ztks paramZtks, Zzs1 paramZzs1, Zmz6 paramZmz6, Zesv paramZesv, Ze4e paramZe4e, Zsy paramZsy, Zs4 paramZs4, Zr_4 paramZr_4, Zrgd paramZrgd, Zr46 paramZr46, Zte5 paramZte5, Zz45 paramZz45, Zskh paramZskh, Zz1i paramZz1i, int paramInt, Zsoh paramZsoh, Zz28 paramZz28, Zlli<Zt13> paramZlli, Ztos<Zt1o> paramZtos) {
    super(paramZm8t, Zt0r.S3, paramZbza, paramZz1i, paramZr_4, paramZkl6.ZB(), paramZrgd, paramZe4e, paramZsoh, paramZlli, paramZtos);
    this.ZY = paramZbza;
    this.Zc = paramZkq4;
    this.ZI = paramZkl6;
    this.ZQ = paramZrjd;
    this.Zw = paramZkm8;
    this.Zi = paramZkc_;
    this.Zr = paramZtks;
    this.ZP = paramZzs1;
    int i = Zz45.ZU();
    this.Zu = paramZmz6;
    this.Za = paramZesv;
    this.ZS = paramZe4e;
    this.Zj = paramZsy;
    this.ZV = paramZs4;
    this.Zm = paramZr46;
    this.ZG = paramZte5;
    this.ZN = paramZz45;
    this.Zd = paramZskh;
    this.ZR = paramZz1i;
    this.Zf = paramInt;
    this.Zg = paramZsoh;
    this.Z_ = paramZz28;
    this.Zt = new Zg56(paramZe4e);
    this.Zh = paramZlli;
    if (Zbqc.Zwu() == null)
      Zz45.ZU(++i); 
  }
  
  protected boolean ZR() {
    return this.Zc.ZsZ();
  }
  
  protected Iterable<Zrbc> Zi() {
    return (this.Zc.ZEc() && this.Zc.ZsZ()) ? ZM() : Collections.emptySet();
  }
  
  private Iterable<Zrbc> ZM() {
    boolean bool1 = (this.Zc.ZEb() && this.Zc.ZEG() > 0) ? true : false;
    boolean bool2 = (this.Zc.ZEo() && this.Zc.ZE6() > 0) ? true : false;
    boolean bool3 = (bool1 || bool2) ? true : false;
    return (bool3 && this.Zc.ZsZ()) ? this::lambda$staticAnalysisThreePhases$2 : Collections.<Zrbc>emptyList();
  }
  
  private Iterator lambda$staticAnalysisThreePhases$2() {
    return new Zs25(this.ZG, this.ZQ, this.ZY, this.ZN, this.Zi, this.ZI.ZB(), this.Zw, this.Zc, this.Zu, this.ZS, this.Zm, this.Za, new Ztij(this.ZD, this.Zj, this.ZV, this.ZI, this.Zc, this.Zr, this.ZP, Zmdu.STORED, this::lambda$staticAnalysisThreePhases$0, this.Zf, this.Zd, this.Zt, Zt0r.S3, this.ZR.Zd(Zt0r.S3), this.ZY, this.Zg, this.Z_, this.Zh), new Zb9t(this::lambda$staticAnalysisThreePhases$1), this.ZR, this.Zt);
  }
  
  private static void lambda$staticAnalysisThreePhases$1(Zele paramZele, Ze3n paramZe3n) {
    paramZele.ZG(paramZe3n);
  }
  
  private Zmhe lambda$staticAnalysisThreePhases$0(Ztpx paramZtpx, Ze3n paramZe3n1, Ze3n paramZe3n2, Zxs7 paramZxs7) {
    return this.Za.ZY(paramZe3n2, paramZe3n1, paramZxs7);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zele.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */