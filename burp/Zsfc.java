package burp;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Zsfc extends ComponentAdapter {
  final Zmxv ZH;
  
  final Zbws ZB;
  
  final Zt8j Zd;
  
  Zsfc(Zt8j paramZt8j, Zmxv paramZmxv, Zbws paramZbws) {}
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    if (this.Zd.Zu != -1) {
      int i = (int)this.Zd.ZW.getPreferredSize().getHeight();
      this.ZH.Zj(this.Zd.Zu, this.Zd.Zd, i);
      int j = this.ZH.Ze(this.Zd.Zu);
      int k = this.ZB.getRowHeight(this.Zd.Zu);
      if (k != j)
        this.ZB.setRowHeight(this.Zd.Zu, j); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsfc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */