package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zxq implements Zlaz {
  private final Zkrr ZE;
  
  private final Zz1i ZA;
  
  private final Ze4e ZN;
  
  private final Runnable Zj;
  
  Zxq(Zkrr paramZkrr, Zz1i paramZz1i, Ze4e paramZe4e, Runnable paramRunnable) {
    this.ZE = paramZkrr;
    this.ZA = paramZz1i;
    this.ZN = paramZe4e;
    this.Zj = paramRunnable;
  }
  
  public void Zf(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx, Zz4_ paramZz4_) {
    try {
      this.Zj.run();
      this.ZE.ZU(paramZrj, paramZtpx, paramZz4_);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.ZN.Zl(Zb09.Zh(Zt0r.A1, this.ZA.Zd(Zt0r.A1), Zblb.ZB(throwable)).ZY(this.ZE.Zp()).Zn(), throwable);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */