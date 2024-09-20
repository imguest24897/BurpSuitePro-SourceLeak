package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zs07 extends MouseAdapter {
  final Zm2l Zc;
  
  Zs07(Zm2l paramZm2l) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.Zc.Zu = true;
    this.Zc.ZL();
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.Zc.Zu = false;
    this.Zc.ZL();
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.Zc.isEnabled() && this.Zc.isFocusable())
      this.Zc.requestFocusInWindow(); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (this.Zc.isEnabled() && this.Zc.contains(paramMouseEvent.getPoint()))
      this.Zc.ZW(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs07.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */