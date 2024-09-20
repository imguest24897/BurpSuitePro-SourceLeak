package burp;

import java.time.Duration;
import net.portswigger.browser.Zjq;

public class Zz3v {
  private final Zxgd Za;
  
  private final boolean Zh;
  
  private final boolean Zx;
  
  private final Zkks ZS;
  
  private final Zjq ZL;
  
  private final Duration Zg;
  
  private final boolean Zc;
  
  private Zz3v(Zxgd paramZxgd, boolean paramBoolean1, boolean paramBoolean2, Zkks paramZkks, Zjq paramZjq, Duration paramDuration, boolean paramBoolean3) {
    this.Za = paramZxgd;
    this.Zh = paramBoolean1;
    this.ZS = paramZkks;
    this.Zx = paramBoolean2;
    this.ZL = paramZjq;
    this.Zg = paramDuration;
    this.Zc = paramBoolean3;
  }
  
  public static Zz3v ZW() {
    return new Zz3v(Zxgd.ZZ(), true, false, Zkks.Zt(), null, null, false);
  }
  
  public Zz3v Zl(Zkks paramZkks) {
    return new Zz3v(this.Za, this.Zh, this.Zx, paramZkks, this.ZL, this.Zg, this.Zc);
  }
  
  public Zz3v ZT(Zjq paramZjq) {
    return (this.ZL == paramZjq || paramZjq == null) ? this : new Zz3v(this.Za, this.Zh, this.Zx, this.ZS, paramZjq, this.Zg, this.Zc);
  }
  
  public Zz3v Zu(Zlv5 paramZlv5) {
    return new Zz3v(paramZlv5.Zy(), paramZlv5.ZN(), this.Zx, this.ZS, this.ZL, paramZlv5.ZZ(), paramZlv5.Zc());
  }
  
  public Zz3v ZX() {
    return new Zz3v(this.Za, this.Zh, true, this.ZS, this.ZL, this.Zg, this.Zc);
  }
  
  public Zxgd Zc() {
    return this.Za;
  }
  
  public Zlgm ZD() {
    return this.Za.Zl();
  }
  
  public Ze45 Zy() {
    return this.Za.ZO();
  }
  
  public boolean ZY() {
    return this.Zh;
  }
  
  public boolean ZU() {
    return this.Zx;
  }
  
  public Zkks ZJ() {
    return this.ZS;
  }
  
  public Duration Z_() {
    return this.Zg;
  }
  
  public boolean Zb() {
    return this.Zc;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz3v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */