package burp;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Zr53 extends ComponentAdapter {
  final Zmyz ZP;
  
  final Zbvk Zb;
  
  Zr53(Zbvk paramZbvk, Zmyz paramZmyz) {}
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    if (paramComponentEvent.getComponent().getHeight() > 0) {
      this.Zb.removeComponentListener(this);
      this.ZP.setDividerLocation(0.5D);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr53.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */