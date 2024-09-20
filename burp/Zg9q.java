package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zg9q extends MouseAdapter {
  final Zerv ZM;
  
  final int ZZ;
  
  final Zbc0 ZC;
  
  Zg9q(Zbc0 paramZbc0, Zerv paramZerv, int paramInt) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.ZC.Zj = true;
    this.ZC.ZR(Zlkk.RIBBON_BUTTON_SELECTED_HOVER_BACKGROUND, Zlkk.RIBBON_BUTTON_HOVER_BACKGROUND);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.ZC.Zj = false;
    this.ZC.ZR(Zlkk.RIBBON_BUTTON_SELECTED_BACKGROUND, Zlkk.RIBBON_BUTTON_BACKGROUND);
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (this.ZC.isEnabled() && this.ZC.contains(paramMouseEvent.getPoint()))
      this.ZM.ZJ(this.ZZ); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg9q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */