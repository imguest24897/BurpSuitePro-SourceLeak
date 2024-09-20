package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zv81 extends Zv84 {
  private final Zxf2 Zj;
  
  public Zv81(Zxf2 paramZxf2) {
    this.Zj = paramZxf2;
  }
  
  protected Zvb Zb(Zvb paramZvb) {
    Zuh.Zb(paramZvb instanceof Zx6z, Zqf.Zr);
    if (paramZvb instanceof Zx6z) {
      Zx6z zx6z = (Zx6z)paramZvb;
      Zzcs zzcs = zx6z.Zg();
      Zb0_ zb0_ = zx6z.Zl();
      Zszw zszw1 = zb0_.Zv();
      Zszw zszw2 = zb0_.ZG();
      Zrp0 zrp0 = zb0_.Zo();
      Zlru zlru = zb0_.ZR();
      Zeu9 zeu9 = zx6z.Zu();
      this.Zj.ZH(zeu9, zzcs.ZM());
      this.Zj.Zy(zzcs, zszw1, zszw2, zrp0, zlru, zeu9);
      return Ze79.Zz(zszw2, zeu9, zrp0);
    } 
    return null;
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv81.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */