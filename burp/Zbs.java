package burp;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Zbs extends ComponentAdapter {
  final Zt8 Zk;
  
  final Zkt4 Zp;
  
  Zbs(Zkt4 paramZkt4, Zt8 paramZt8) {}
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    if (this.Zp.Zt.isShowing())
      this.Zp.Zt.removeComponentListener(this); 
    this.Zp.Zt.setDividerLocation((this.Zk == Zt8.HORIZONTAL) ? this.Zp.ZX : this.Zp.Zu);
    this.Zp.Zl = false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */