package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zb36 extends MouseAdapter {
  final Ze8f ZK;
  
  final Zm99 Zp;
  
  Zb36(Ze8f paramZe8f, Zm99 paramZm99) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    this.ZK.ZU();
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.Zp.ZE(Zt00.UNDERLINE_FONT);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.Zp.ZE(Zt00.DEFAULT_FONT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb36.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */