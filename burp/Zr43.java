package burp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;

public class Zr43 extends AbstractBorder {
  private final Zlkk Zj;
  
  private final int ZT;
  
  private final Insets Zl;
  
  public Zr43(Zlkk paramZlkk) {
    this(paramZlkk, 1);
  }
  
  public Zr43(Zlkk paramZlkk, int paramInt) {
    this(paramZlkk, paramInt, new Insets(paramInt, paramInt, paramInt, paramInt));
  }
  
  public Zr43(Zlkk paramZlkk, int paramInt, Insets paramInsets) {
    this.Zj = paramZlkk;
    this.ZT = paramInt;
    this.Zl = paramInsets;
  }
  
  public Insets getBorderInsets(Component paramComponent) {
    return this.Zl;
  }
  
  public Insets getBorderInsets(Component paramComponent, Insets paramInsets) {
    paramInsets.top = this.Zl.top;
    paramInsets.left = this.Zl.left;
    paramInsets.bottom = this.Zl.bottom;
    paramInsets.right = this.Zl.right;
    return paramInsets;
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Color color = paramGraphics.getColor();
    paramGraphics.setColor(this.Zj.ZS());
    paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, this.ZT);
    paramGraphics.fillRect(paramInt1 + paramInt3 - this.ZT, paramInt2 + this.ZT, this.ZT, paramInt4 - this.ZT * 2);
    paramGraphics.fillRect(paramInt1, paramInt2 + this.ZT, this.ZT, paramInt4 - this.ZT * 2);
    paramGraphics.fillRect(paramInt1, paramInt2 + paramInt4 - this.ZT, paramInt3, this.ZT);
    paramGraphics.setColor(color);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr43.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */