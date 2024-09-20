package net.portswigger.browser;

import java.util.List;
import net.portswigger.Zlz;

abstract class Zto implements Zeo {
  protected abstract Zs ZU(Zjp paramZjp);
  
  public boolean Zj(Zjp paramZjp) {
    return (paramZjp != null && Zlz.Zu(ZU(paramZjp).ZU()) && !paramZjp.Zi());
  }
  
  public List<Zh> Zn(Zjp paramZjp, Zdr paramZdr, Zdm paramZdm, Zd0 paramZd0) {
    return paramZdm.ZB(ZU(paramZjp));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zto.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */