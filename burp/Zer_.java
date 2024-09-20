package burp;

import net.portswigger.browser.Zc1;
import net.portswigger.browser.Ze6;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Zt3;
import net.portswigger.browser.Ztk;

public class Zer_ {
  public static final Ze6 ZM = Ze6.Ze().ZJ(false);
  
  public Zjw ZX(Zmle paramZmle) {
    Zc1 zc1 = paramZmle.Zb();
    return zc1.Zj().Zc().orElseThrow();
  }
  
  public Zt3 ZN(Zmle paramZmle) throws Ztk {
    return ZX(paramZmle).Zx().Zi(ZM).Zz().orElseThrow();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zer_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */