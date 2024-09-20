package burp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;

public class Zrz7 extends AbstractBorder {
  private final Zlkk ZO;
  
  private final Insets ZI;
  
  public Zrz7(Zlkk paramZlkk) {
    this.ZO = paramZlkk;
    this.ZI = new Insets(1, 0, 0, 0);
  }
  
  public Insets getBorderInsets(Component paramComponent) {
    return this.ZI;
  }
  
  public Insets getBorderInsets(Component paramComponent, Insets paramInsets) {
    paramInsets.top = this.ZI.top;
    paramInsets.left = this.ZI.left;
    paramInsets.bottom = this.ZI.bottom;
    paramInsets.right = this.ZI.right;
    return paramInsets;
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Color color = paramGraphics.getColor();
    paramGraphics.setColor(this.ZO.ZS());
    paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, 1);
    paramGraphics.setColor(color);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrz7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */