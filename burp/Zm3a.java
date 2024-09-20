package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zm3a extends MouseAdapter {
  final Zbdi ZB;
  
  Zm3a(Zbdi paramZbdi) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    boolean bool = ((paramMouseEvent.getModifiersEx() & 0x400) != 0) ? true : false;
    this.ZB.Zo.Ze(bool ? Zlkk.ACTION_PRESSED : Zlkk.ACTION_HOVER);
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.ZB.Zo.Ze(Zlkk.ACTION_PRESSED);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.ZB.Zo.Ze(Zlkk.ACTION_NORMAL);
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    this.ZB.Zo.Ze(this.ZB.Zo.contains(paramMouseEvent.getPoint()) ? Zlkk.ACTION_HOVER : Zlkk.ACTION_NORMAL);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm3a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */