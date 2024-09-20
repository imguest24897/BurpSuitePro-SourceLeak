package burp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;

class Zgnl extends AbstractBorder {
  private static final Insets Za = new Insets(10, 10, 10, 10);
  
  public Insets getBorderInsets(Component paramComponent) {
    return Za;
  }
  
  public Insets getBorderInsets(Component paramComponent, Insets paramInsets) {
    paramInsets.top = Za.top;
    paramInsets.left = Za.left;
    paramInsets.bottom = Za.bottom;
    paramInsets.right = Za.right;
    return paramInsets;
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Color color = paramGraphics.getColor();
    paramGraphics.setColor(Zlkk.BORDER.ZS());
    paramGraphics.drawLine(paramInt1, paramInt2 + paramInt4 - 1, paramInt1 + paramInt3, paramInt2 + paramInt4 - 1);
    paramGraphics.setColor(color);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgnl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */