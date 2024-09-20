package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsge {
  private int Zt;
  
  private boolean ZM;
  
  private boolean ZU;
  
  void Z_(int paramInt) {
    String str = Zs8m.ZY();
    if (this.ZU)
      return; 
    if (this.ZM) {
      if (paramInt != this.Zt) {
        this.ZU = true;
        if (str != null) {
          this.Zt = paramInt;
          this.ZM = true;
          return;
        } 
      } 
      return;
    } 
    this.Zt = paramInt;
    this.ZM = true;
  }
  
  boolean Zw(int paramInt) {
    Zuh.Zb(this.ZM, Zqf.Zr);
    return this.ZU ? true : ((this.Zt == paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsge.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */