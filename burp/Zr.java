package burp;

import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

class Zr extends ComponentUI {
  final Zsqn Zp;
  
  Zr(Zsqn paramZsqn) {}
  
  public Dimension getPreferredSize(JComponent paramJComponent) {
    Dimension dimension1 = this.Zp.Zm.getPreferredSize();
    Dimension dimension2 = this.Zp.ZT.getPreferredSize();
    return new Dimension(Math.max(dimension1.width, dimension2.width), Math.max(dimension1.height, dimension2.height));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */