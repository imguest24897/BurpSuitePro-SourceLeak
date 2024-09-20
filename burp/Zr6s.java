package burp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;

public class Zr6s extends AbstractBorder {
  private static final RenderingHints Ze = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
  
  private final Insets Zy;
  
  private final int Zg;
  
  private Color ZE;
  
  public Zr6s(Insets paramInsets) {
    this(paramInsets, 4);
  }
  
  public Zr6s(Insets paramInsets, int paramInt) {
    this.Zy = paramInsets;
    this.Zg = paramInt;
  }
  
  public Zr6s(Insets paramInsets, int paramInt, Zlkk paramZlkk) {
    this.Zy = paramInsets;
    this.Zg = paramInt;
    this.ZE = paramZlkk.ZS();
  }
  
  public Insets getBorderInsets(Component paramComponent) {
    return this.Zy;
  }
  
  public Insets getBorderInsets(Component paramComponent, Insets paramInsets) {
    paramInsets.top = this.Zy.top;
    paramInsets.left = this.Zy.left;
    paramInsets.bottom = this.Zy.bottom;
    paramInsets.right = this.Zy.right;
    return paramInsets;
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Graphics2D graphics2D = Zb(paramGraphics);
    Area area1 = new Area(new Rectangle(paramInt1, paramInt2, paramInt3, paramInt4));
    Area area2 = new Area(new Rectangle(paramInt1 + this.Zy.left, paramInt2 + this.Zy.top, paramInt3 - this.Zy.left - this.Zy.right, paramInt4 - this.Zy.top - this.Zy.bottom));
    area1.subtract(area2);
    area1.intersect(new Area(graphics2D.getClip()));
    graphics2D.setClip(area1);
    Area area3 = new Area(new RoundRectangle2D.Double(paramInt1, paramInt2, paramInt3, paramInt4, (this.Zg * 2), (this.Zg * 2)));
    graphics2D.setColor(paramComponent.getParent().getBackground());
    graphics2D.fill(area1);
    graphics2D.setColor((this.ZE == null) ? paramComponent.getBackground() : this.ZE);
    graphics2D.fill(area3);
  }
  
  protected static Graphics2D Zb(Graphics paramGraphics) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics.create();
    graphics2D.setRenderingHints(Ze);
    return graphics2D;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr6s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */