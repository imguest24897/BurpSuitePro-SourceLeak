package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zx_e extends MouseAdapter {
  final Zz_s ZW;
  
  Zx_e(Zz_s paramZz_s) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger() || (paramMouseEvent.getModifiersEx() & 0x1000) != 0)
      this.ZW.Zq().show(this.ZW.ZS, paramMouseEvent.getX(), paramMouseEvent.getY()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */