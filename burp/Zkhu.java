package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

class Zkhu extends MouseAdapter {
  final Consumer Zq;
  
  final Zm9h ZZ;
  
  Zkhu(Zm9h paramZm9h, Consumer paramConsumer) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.ZZ.Zd = true;
    this.ZZ.ZD();
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.ZZ.Zd = false;
    this.ZZ.ZD();
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.ZZ.isEnabled() && this.ZZ.isFocusable())
      this.ZZ.requestFocusInWindow(); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (this.ZZ.isEnabled() && this.ZZ.contains(paramMouseEvent.getPoint()))
      this.Zq.accept(paramMouseEvent); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkhu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */