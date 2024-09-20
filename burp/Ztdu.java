package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Ztdu extends MouseAdapter {
  private final Zmg2 ZX;
  
  private Ztdu(Zmg2 paramZmg2) {
    this.ZX = paramZmg2;
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.ZX == null)
      return; 
    this.ZX.setSelected(true);
    super.mousePressed(paramMouseEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztdu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */