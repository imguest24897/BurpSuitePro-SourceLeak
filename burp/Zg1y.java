package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zg1y extends MouseAdapter {
  final Zbd7 Zz;
  
  final Zm2y ZD;
  
  final Zm8o ZB;
  
  Zg1y(Zm8o paramZm8o, Zbd7 paramZbd7, Zm2y paramZm2y) {}
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    String str = Zbd7.ZE();
    if (this.ZB.columnAtPoint(paramMouseEvent.getPoint()) == 2) {
      this.ZD.ZT = true;
      this.ZB.repaint();
      if (str != null) {
        if (this.ZD.ZT) {
          this.ZD.ZT = false;
          this.ZB.repaint();
        } 
        return;
      } 
      return;
    } 
    if (this.ZD.ZT) {
      this.ZD.ZT = false;
      this.ZB.repaint();
    } 
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    if (this.ZD.ZT) {
      this.ZD.ZT = false;
      this.ZB.repaint();
    } 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (this.ZB.columnAtPoint(paramMouseEvent.getPoint()) == 2) {
      this.ZB.Zq.ZG.Zk();
      this.ZB.Zq.ZY();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg1y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */