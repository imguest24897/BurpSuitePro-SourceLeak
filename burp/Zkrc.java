package burp;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zkrc extends MouseAdapter {
  final Zm9r Zt;
  
  Zkrc(Zm9r paramZm9r) {}
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    int i = (this.Zt.getInsets()).right + Zbz3.ZK(Zxpj.COMBO_OPEN).getIconWidth() + this.Zt.getIconTextGap() / 2;
    int j = this.Zt.getWidth() - i;
    Rectangle rectangle = new Rectangle(j, 0, i, this.Zt.getHeight());
    if (this.Zt.isEnabled() && rectangle.contains(paramMouseEvent.getPoint()))
      this.Zt.ZB.show(this.Zt, j, this.Zt.getHeight() - (this.Zt.getInsets()).bottom); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkrc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */