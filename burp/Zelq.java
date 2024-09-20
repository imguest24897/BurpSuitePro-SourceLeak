package burp;

import java.util.Arrays;
import java.util.Collections;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zelq extends Zeli<Zrbc, Zt0r> {
  private final Zlba ZN;
  
  private final Zmz6 Zl;
  
  private final Ztai ZG;
  
  private final Zens ZR;
  
  private final Zrjd Zq;
  
  private final Zr46 Zx;
  
  private final Zz1i ZJ;
  
  public Zelq(Zbza paramZbza, Zlba paramZlba, Zmz6 paramZmz6, Ztai paramZtai, Zm8t paramZm8t, Zens paramZens, Zrjd paramZrjd, Ze4e paramZe4e, Zr46 paramZr46, Zr_4 paramZr_4, Zbnt paramZbnt, Zrgd paramZrgd, Zz1i paramZz1i, Zsoh paramZsoh, Zlli<Zt13> paramZlli, Ztos<Zt1o> paramZtos) {
    super(paramZm8t, Zt0r.A3, paramZbza, paramZz1i, paramZr_4, paramZbnt, paramZrgd, paramZe4e, paramZsoh, paramZlli, paramZtos);
    this.ZN = paramZlba;
    this.Zl = paramZmz6;
    this.ZG = paramZtai;
    this.ZR = paramZens;
    this.Zq = paramZrjd;
    this.Zx = paramZr46;
    this.ZJ = paramZz1i;
  }
  
  protected boolean ZR() {
    return this.ZG.ZsB();
  }
  
  protected Iterable<Zrbc> Zi() {
    try {
    
    } catch (Zg57 zg57) {
      throw a(null);
    } 
    return this.ZG.ZsB() ? Arrays.<Zrbc>asList(new Zrbc[] { new Ztmi(Zt0r.A3, this.ZJ, this.Zs, Zelq::lambda$buildPhases$0), new Zg6p(Collections.singleton(new Zttc(this::lambda$buildPhases$1, this.Zl, this.ZN, this.Zs, this.ZJ, Zt0r.A3, this.Zp))), new Zso2(Zt0r.A3, this.Zs, this.Zx) }) : Collections.<Zrbc>emptyList();
  }
  
  private void ZL(int paramInt, Zz4_ paramZz4_, Ze3n paramZe3n) {
    try {
      try {
        this.ZR.Zg(paramInt).Zk(paramZe3n, null, paramZz4_);
        if (!paramZe3n.ZR())
          try {
            if (!paramZe3n.ZU())
              ZL(paramInt, paramZz4_, paramZe3n); 
          } catch (Zg57 zg57) {
            throw a(null);
          }  
      } catch (Zg57 zg57) {
        throw a(null);
      } 
    } catch (Zg57 zg57) {
      Zah.Zl(zg57, Zk_.IGNORED);
      ZL(paramInt, paramZz4_, paramZe3n);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.Zp.Zl(Zb09.Zh(Zt0r.A3, this.ZJ.Zd(Zt0r.A3), Zblb.ZB(throwable)).Zn(), throwable);
    } 
  }
  
  private void lambda$buildPhases$1(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx, Zz4_ paramZz4_) {
    Ze3n ze3n = this.Zq.Zc(this.Zs, paramZtpx);
    ZG(ze3n);
    ZL(paramZrj.Zg(), paramZz4_, ze3n);
  }
  
  private static void lambda$buildPhases$0(Zb09 paramZb09) {}
  
  private static Zg57 a(Zg57 paramZg57) {
    return paramZg57;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zelq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */