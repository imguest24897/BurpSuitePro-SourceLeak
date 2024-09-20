package burp;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.border.AbstractBorder;

class Zvot extends AbstractBorder {
  final Zzy1 ZO;
  
  Zvot(Zzy1 paramZzy1) {}
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramGraphics.setColor(Zlkk.BURP_TITLE.ZS());
    paramGraphics.fillPolygon(new int[] { 2, 2, paramInt3 }, new int[] { (paramInt4 - paramInt3) / 2, (paramInt4 + paramInt3) / 2, paramInt4 / 2 }, 3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */