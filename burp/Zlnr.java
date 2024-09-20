package burp;

import java.util.function.BiConsumer;

class Zlnr implements Zku7 {
  private final Zly1 Zx;
  
  private final Zzkd ZL;
  
  private final Zeyu Zi;
  
  private final Zesv Zp;
  
  private final Zkvg ZK;
  
  Zlnr(Zlba paramZlba, Zkq4 paramZkq4, Zsoh paramZsoh, Zesv paramZesv, Zly1 paramZly1, Zzkd paramZzkd, Zkvg paramZkvg, Zb0k paramZb0k, Ztos<Zt1o> paramZtos) {
    this.Zx = paramZly1;
    this.ZL = paramZzkd;
    this.Zp = paramZesv;
    this.ZK = paramZkvg;
    this.Zi = new Zeyu(paramZlba, paramZkq4, paramZsoh, paramZb0k, Zt0r.A1, paramZtos);
  }
  
  public Ze5i Zn(Zrj paramZrj, Ztpx paramZtpx, Ze3n paramZe3n, Zz1i paramZz1i, Zxs7 paramZxs7, BiConsumer<Zb09, Throwable> paramBiConsumer) {
    Zg75 zg75 = this.ZK.ZR();
    Zeum zeum = this.Zx.ZS(paramZxs7, Zz76.Zf(paramZe3n, paramZxs7), paramZe3n.Za(), paramZe3n.ZA().Zr(), (paramZe3n.Zp()).ZH.ZJ);
    Zlu zlu = this.Zi.ZY(paramZtpx, paramZrj, paramZz1i, zg75, paramBiConsumer);
    Zszi zszi = this.Zp.Za(paramZe3n, paramZxs7);
    try {
      switch (zeum.ordinal()) {
        default:
          throw new MatchException(null, null);
        case 0:
        
        case 1:
        
        case 2:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    paramZe3n.Zk(paramZxs7, Zecx.NOT_LIGHT_AUDITED);
    return Ze5i.Zm;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlnr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */