package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsuv {
  private final Zerg ZV;
  
  private final Zz4b ZU;
  
  private final Zbiv Za;
  
  public Zsuv(Zerg paramZerg, Zz4b paramZz4b, Zbiv paramZbiv) {
    this.ZV = paramZerg;
    this.ZU = paramZz4b;
    this.Za = paramZbiv;
  }
  
  public void Zy() {
    Zv(Zkcl.LEGACY_EXTENSION_PASSIVE_AUDIT);
  }
  
  public void ZO() {
    Zv(Zkcl.LEGACY_EXTENSION_ACTIVE_AUDIT);
  }
  
  private void Zv(Zkcl paramZkcl) {
    synchronized (this.ZU.ZV_().Zz6()) {
      if (Zg(paramZkcl))
        return; 
      Zru5 zru5 = new Zru5(new Zgin(paramZkcl, false, false, false, Zmet.EVERYTHING, null, false), Zgyw.Zi, Zb2y.ZX());
      this.Za.ZW().Zp(zru5, this.ZV.Zk());
    } 
  }
  
  private boolean Zg(Zkcl paramZkcl) {
    long l = this.ZU.ZV_().stream().filter(paramZkcl::lambda$dashboardContainsTaskOfType$0).count();
    Zuh.Zb((l <= 1L), Zqf.Zr);
    return (l > 0L);
  }
  
  private static boolean lambda$dashboardContainsTaskOfType$0(Zkcl paramZkcl, Zgna paramZgna) {
    return (paramZgna.ZNs() == paramZkcl);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsuv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */