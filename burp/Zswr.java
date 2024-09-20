package burp;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Zswr extends ComponentAdapter {
  final Zmyz Zq;
  
  Zswr(Zb5w paramZb5w, Zmyz paramZmyz) {}
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    if (paramComponentEvent.getComponent().getHeight() > 0) {
      if (this.Zq.isShowing())
        this.Zq.removeComponentListener(this); 
      this.Zq.setDividerLocation(0.5D);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zswr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */