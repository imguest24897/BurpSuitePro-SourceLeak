package burp;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Zzpa extends ComponentAdapter {
  final Zbyi Zh;
  
  Zzpa(Zbyi paramZbyi) {}
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    if (paramComponentEvent.getComponent().getHeight() > 0) {
      this.Zh.ZK.removeComponentListener(this);
      this.Zh.ZK.setDividerLocation(0.3D);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzpa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */