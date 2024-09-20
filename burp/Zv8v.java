package burp;

import java.util.Collections;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zv8v extends Zv84 {
  private final Zxf2 ZU;
  
  private final Zzs_ ZS;
  
  Zv8v(Zxf2 paramZxf2, Zzs_ paramZzs_) {
    this.ZU = paramZxf2;
    this.ZS = paramZzs_;
  }
  
  public Zvb Zb(Zvb paramZvb) {
    Zuh.Zb(paramZvb instanceof Zx6j, Zqf.Zr);
    if (paramZvb instanceof Zx6j) {
      Zx6j zx6j = (Zx6j)paramZvb;
      Zb0_ zb0_ = zx6j.Zl();
      Zzcs zzcs = zx6j.Zg();
      Zszw zszw1 = zb0_.Zv();
      Zszw zszw2 = zb0_.ZG();
      Zlru zlru = zb0_.ZR();
      Zrp0 zrp0 = zb0_.Zo();
      Zlat zlat = zzcs.ZJ().Zl();
      if (zlat.Zu() != null) {
        this.ZU.Zy(zzcs, zszw1, zszw2, zrp0, zlru, zlat.Zu());
        return Ze79.ZI();
      } 
      if (zrp0 instanceof Zm5e) {
        Zm5e zm5e = (Zm5e)zrp0;
        if (this.ZS.Zs(zzcs)) {
          this.ZU.Zy(zzcs, zszw1, zszw2, zm5e, zlru, this.ZU.Zx());
          return Ze79.ZI();
        } 
        if (this.ZS.ZF(zm5e.ZFy().ZyR())) {
          Zeu9 zeu9 = this.ZU.ZM(zzcs, Collections.emptyList());
          this.ZU.Zy(zzcs, zszw1, zszw2, zm5e, zlru, zeu9);
          return Ze79.Zz(zb0_.ZG(), zeu9, zrp0);
        } 
        return new Zx6n(zb0_, zx6j.Zg());
      } 
      Zuh.Zb(false, Zqf.Zr);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */