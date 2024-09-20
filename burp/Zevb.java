package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zevb extends MouseAdapter {
  final Runnable ZW;
  
  final Runnable ZU;
  
  final Zbcv Zb;
  
  Zevb(Zbcv paramZbcv, Runnable paramRunnable1, Runnable paramRunnable2) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.ZW.run();
    this.Zb.repaint();
    this.Zb.ZI.ZQ();
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.ZU.run();
    this.Zb.repaint();
    this.Zb.ZI.Zt();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zevb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */