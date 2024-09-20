package burp;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Zzxl extends ComponentAdapter {
  final Zkt3 Zt;
  
  Zzxl(Zkt3 paramZkt3) {}
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    if (this.Zt.ZP.isShowing())
      this.Zt.ZP.removeComponentListener(this); 
    this.Zt.ZL();
    this.Zt.ZO = false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzxl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */