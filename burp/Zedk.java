package burp;

import java.awt.Component;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zedk {
  private final Zl7t ZG;
  
  private final Component Zj;
  
  public Zedk(Zl7t paramZl7t, Component paramComponent) {
    this.ZG = paramZl7t;
    this.Zj = paramComponent;
  }
  
  public Zmf_ ZS(Zl_j paramZl_j) {
    try {
      String str = this.ZG.Zg();
      if (str == null)
        return null; 
      Zzkm zzkm = (new Zz0e(str)).ZO();
      if (paramZl_j.ZV(zzkm))
        return zzkm; 
      Zx6o.Zv(this.Zj, Zrgs.CONFIGURATION_FILE_ERROR.ZN(new Object[0]), paramZl_j.Zb());
    } catch (Ze0d ze0d) {
      Zah.Zl(ze0d, Zk_.COMMON_RUNTIME_FAILURE);
      Zx6o.Zv(this.Zj, Zrgs.CONFIGURATION_FILE_ERROR.ZN(new Object[0]), ze0d.getMessage());
    } 
    return null;
  }
  
  public void Zx(Zskm paramZskm, Zmf_ paramZmf_) {
    String str = (new Ztsd(paramZmf_.ZR())).Zh();
    this.ZG.Zo(paramZskm, str);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */