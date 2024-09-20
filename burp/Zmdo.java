package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zmdo extends MouseAdapter {
  final Runnable Zd;
  
  final Zrv_ Zq;
  
  Zmdo(Zrv_ paramZrv_, Runnable paramRunnable) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    this.Zd.run();
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.Zq.Zu.Ze(Zlkk.PRIMARY_LINK_HOVER);
    this.Zq.Zu.setBorder(new Zrf5(0, 0, 1, 0, Zlkk.PRIMARY_LINK_HOVER));
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.Zq.Zu.Ze(Zlkk.PRIMARY_LINK);
    this.Zq.Zu.setBorder(new Zrf5(0, 0, 1, 0, Zlkk.PRIMARY_LINK));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmdo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */