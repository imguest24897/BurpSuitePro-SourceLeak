package burp;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Zmjy extends ComponentAdapter {
  final Zbyy Zc;
  
  Zmjy(Zbyy paramZbyy) {}
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    if (paramComponentEvent.getComponent().getHeight() > 0) {
      if (this.Zc.ZQ.isShowing())
        this.Zc.ZQ.removeComponentListener(this); 
      this.Zc.ZQ.setDividerLocation(0.4D);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmjy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */