package burp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;

class Zr80 extends AbstractBorder {
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Color color = paramGraphics.getColor();
    paramGraphics.setColor(Zlkk.BORDER.ZS());
    paramGraphics.drawLine(paramInt1, paramInt2, paramInt1 + paramInt3 - 1, paramInt2);
    paramGraphics.setColor(color);
  }
  
  public Insets getBorderInsets(Component paramComponent, Insets paramInsets) {
    paramInsets.set(5, 5, 5, 5);
    return paramInsets;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr80.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */