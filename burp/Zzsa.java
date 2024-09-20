package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzsa extends Zzsb {
  private final Zlas Zd;
  
  private final Zz1m<Zt18> Zo;
  
  private final Zskh Zb;
  
  public Zzsa(Zlas paramZlas, Zz1m<Zt18> paramZz1m, Zskh paramZskh) {
    this.Zd = paramZlas;
    this.Zo = paramZz1m;
    this.Zb = paramZskh;
  }
  
  protected Zvb Zv(Ztpx paramZtpx, Zvb paramZvb) {
    Zuh.Zb(paramZvb instanceof Zx64, Zqf.Zr);
    if (paramZvb instanceof Zx64) {
      Zx64 zx64 = (Zx64)paramZvb;
      Zb0_ zb0_ = zx64.Zl();
      try {
        Zm0f zm0f = zb0_.ZQ(this.Zd, paramZtpx);
        return new Zx6_(zb0_, zm0f);
      } catch (Zlff zlff) {
        Zah.Zl(zlff, Zk_.COMMON_RUNTIME_FAILURE);
        this.Zo.ZD(Zt18.Zo);
        return new Zmkm();
      } catch (Zkok zkok) {
        Zah.Zl(zkok, Zk_.IGNORED);
        return new Zmkm();
      } catch (Throwable throwable) {
        try {
          Zah.Zl(throwable, Zk_.UNEXPECTED);
          if (Zepz.Zm(throwable))
            Ztyh.ZR(this.Zb); 
        } catch (Zlff zlff) {
          throw a(null);
        } 
        return new Zmkm();
      } 
    } 
    return null;
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
  
  private static Zlff a(Zlff paramZlff) {
    return paramZlff;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzsa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */