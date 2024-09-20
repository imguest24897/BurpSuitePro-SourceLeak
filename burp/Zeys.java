package burp;

import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.browser.Zc1;
import net.portswigger.browser.Zj9;
import net.portswigger.browser.Zjo;
import net.portswigger.browser.Ztk;

public class Zeys {
  private final Zj9 ZI;
  
  private final AtomicReference<Zc1> Zd = new AtomicReference<>();
  
  public Zeys(Zj9 paramZj9) {
    this.ZI = paramZj9;
  }
  
  public Zc1 Zu(Zjo paramZjo) throws Ztk {
    Zc1 zc11 = this.ZI.ZC(paramZjo);
    zc11.Zl();
    Zc1 zc12 = this.Zd.getAndSet(zc11);
    try {
      if (zc12 != null)
        this.ZI.Zl(zc12); 
    } catch (Ztk ztk) {
      throw a(null);
    } 
    return zc11;
  }
  
  public Zc1 Zi() {
    return this.Zd.get();
  }
  
  public void ZZ() {
    Zc1 zc1 = this.Zd.getAndSet(null);
    if (zc1 != null)
      this.ZI.Zl(zc1); 
  }
  
  private static Ztk a(Ztk paramZtk) {
    return paramZtk;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeys.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */