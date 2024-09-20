package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

class Zt6i extends MouseAdapter {
  final Consumer Zx;
  
  final Zm9t Zn;
  
  Zt6i(Zm9t paramZm9t, Consumer paramConsumer) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.Zn.ZV = true;
    this.Zn.ZG();
    this.Zn.Zd();
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.Zn.ZV = false;
    this.Zn.ZG();
    this.Zn.Zd();
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.Zn.isEnabled() && this.Zn.isFocusable())
      this.Zn.requestFocusInWindow(); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (this.Zn.isEnabled() && this.Zn.contains(paramMouseEvent.getPoint()))
      this.Zx.accept(paramMouseEvent); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt6i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */