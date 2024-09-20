package burp;

import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zv83 extends Zv84 {
  private final Zxf2 Za;
  
  public Zv83(Zxf2 paramZxf2) {
    this.Za = paramZxf2;
  }
  
  protected Zvb Zb(Zvb paramZvb) {
    Zuh.Zb(paramZvb instanceof Zx66, Zqf.Zr);
    if (paramZvb instanceof Zx66) {
      Zx66 zx66 = (Zx66)paramZvb;
      Zzcs zzcs = zx66.Zg();
      Zb0_ zb0_ = zx66.Zl();
      Zrp0 zrp0 = zb0_.Zo();
      Zlru zlru = zb0_.ZR();
      Zszw zszw1 = zb0_.Zv();
      Zszw zszw2 = zb0_.ZG();
      Zeu9 zeu9 = zx66.ZG();
      boolean bool = this.Za.ZH(zeu9, zzcs.ZM());
      this.Za.Zy(zzcs, zszw1, zszw2, zrp0, zlru, zeu9);
      Optional<Zb0_> optional = zb0_.Zc();
      return (Zvb)((bool || optional.isEmpty()) ? Ze79.Zz(zszw2, zeu9, zrp0) : new Zx64(optional.get()));
    } 
    return null;
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv83.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */