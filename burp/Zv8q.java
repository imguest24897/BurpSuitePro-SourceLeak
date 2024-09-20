package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zv8q extends Zv84 {
  private final Zl7h Zu;
  
  private final Zr69 ZT;
  
  private final Zz1m<Zt18> ZB;
  
  public Zv8q(Zl7h paramZl7h, Zr69 paramZr69, Zz1m<Zt18> paramZz1m) {
    this.Zu = paramZl7h;
    this.ZT = paramZr69;
    this.ZB = paramZz1m;
  }
  
  public Zvb Zb(Zvb paramZvb) {
    Zuh.Zb(paramZvb instanceof Zx64, Zqf.Zr);
    if (paramZvb instanceof Zx64) {
      Zx64 zx64 = (Zx64)paramZvb;
      Zb0_ zb0_ = zx64.Zl();
      int i = this.Zu.ZVP().ZXY() + 1;
      if (i > this.ZT.ZJ()) {
        this.ZB.ZD(Zt18.Zb);
        return new Zgec();
      } 
      this.ZT.ZD().Zy(Zrp6.DEBUG, Zlq7.TAKING_EXIT, new Object[] { zb0_.Zo() });
      return new Zx64(zb0_);
    } 
    return null;
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */