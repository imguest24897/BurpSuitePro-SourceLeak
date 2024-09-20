package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztag implements Zljz {
  private final Zlc8 Za;
  
  private int Zu;
  
  public Ztag(Zlc8 paramZlc8) {
    this.Za = paramZlc8;
  }
  
  public boolean Zt(Zkit paramZkit1, Zkit paramZkit2) {
    long l = paramZkit1.Zl().Za();
    if (l > 0L) {
      float f = (float)(paramZkit2.Za() / l) * 100.0F;
      if ((int)f != this.Zu) {
        this.Zu = (int)f;
        return Zx(this.Zu);
      } 
    } 
    return !ZW();
  }
  
  public boolean ZW(int paramInt) {
    Zuh.Zb(false, Zqf.ZC);
    return !ZW();
  }
  
  public boolean ZW() {
    return this.Za.ZS();
  }
  
  private boolean Zx(int paramInt) {
    return this.Za.Zq(paramInt, null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztag.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */