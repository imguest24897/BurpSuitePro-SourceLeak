package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zz2 extends MouseAdapter {
  final Zbcm Zl;
  
  Zz2(Zbcm paramZbcm) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.Zl.ZB = true;
    this.Zl.Zw();
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.Zl.ZB = false;
    this.Zl.Zw();
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.Zl.isEnabled() && this.Zl.isFocusable())
      this.Zl.requestFocusInWindow(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */