package burp;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Zbny extends ComponentAdapter {
  final Zl04 Zt;
  
  Zbny(Zl04 paramZl04) {}
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    this.Zt.Zj.Zu(this.Zt::Zy);
  }
  
  public void componentMoved(ComponentEvent paramComponentEvent) {
    this.Zt.Zj.Zu(this.Zt::Zy);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbny.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */