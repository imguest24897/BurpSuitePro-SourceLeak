package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zrfc extends MouseAdapter {
  final Zl59 Zo;
  
  Zrfc(Zl59 paramZl59) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      this.Zo.Ze(paramMouseEvent.getComponent(), paramMouseEvent.getPoint()); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      this.Zo.Ze(paramMouseEvent.getComponent(), paramMouseEvent.getPoint()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrfc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */