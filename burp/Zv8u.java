package burp;

import java.util.Collection;
import java.util.Collections;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zv8u extends Zv84 {
  private final Zxf2 ZE;
  
  public Zv8u(Zxf2 paramZxf2) {
    this.ZE = paramZxf2;
  }
  
  public Zvb Zb(Zvb paramZvb) {
    Zuh.Zb(paramZvb instanceof Zx6x, Zqf.Zr);
    if (paramZvb instanceof Zx6x) {
      Zx6x zx6x = (Zx6x)paramZvb;
      Zzcs zzcs = zx6x.Zg();
      Zb0_ zb0_ = zx6x.Zl();
      Zszw zszw1 = zb0_.Zv();
      Zszw zszw2 = zb0_.ZG();
      Zrp0 zrp0 = zb0_.Zo();
      Zlru zlru = zb0_.ZR();
      if (zrp0 instanceof Zm5e)
        return new Zx6j(zb0_, zzcs); 
      Collection<Zt8i> collection = zb0_.Zo().Znr().getOrDefault(zszw1, Collections.emptyList());
      Zeu9 zeu9 = this.ZE.ZM(zzcs, collection);
      Zuh.Zb((zeu9 != null), Zqf.Zr);
      this.ZE.Zy(zzcs, zszw1, zszw2, zrp0, zlru, zeu9);
      return Ze79.Zz(zszw2, zeu9, zrp0);
    } 
    return null;
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */