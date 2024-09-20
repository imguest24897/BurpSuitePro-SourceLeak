package burp;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;

public class Zg__ extends AbstractBorder {
  private static final RenderingHints Zb = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
  
  private final Insets Ze;
  
  private final float ZJ;
  
  public Zg__(Insets paramInsets) {
    this(paramInsets, 1.0F);
  }
  
  public Zg__(Insets paramInsets, float paramFloat) {
    this.Ze = paramInsets;
    this.ZJ = paramFloat;
  }
  
  public Insets getBorderInsets(Component paramComponent) {
    return getBorderInsets(paramComponent, new Insets(0, 0, 0, 0));
  }
  
  public Insets getBorderInsets(Component paramComponent, Insets paramInsets) {
    int i = (int)Math.ceil((Zn(paramComponent) * this.ZJ));
    paramInsets.top = this.Ze.top;
    paramInsets.left = i + this.Ze.left;
    paramInsets.bottom = this.Ze.bottom;
    paramInsets.right = i + this.Ze.right;
    return paramInsets;
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Insets insets = getBorderInsets(paramComponent);
    boolean bool = Zxt_.ZL();
    Graphics2D graphics2D = (Graphics2D)paramGraphics.create();
    try {
      graphics2D.setRenderingHints(Zb);
      Area area1 = new Area(graphics2D.getClip());
      Area area2 = new Area(new Rectangle(paramInt1 + insets.left, paramInt2 + insets.top, paramInt3 - insets.left + insets.right, paramInt4 - insets.top + insets.bottom));
      Area area3 = new Area(new Rectangle(paramInt1, paramInt2, paramInt3, paramInt4));
      Area area4 = new Area(new RoundRectangle2D.Double(paramInt1, paramInt2, paramInt3, paramInt4, (paramInt4 * this.ZJ), (paramInt4 * this.ZJ)));
      area3.intersect(area1);
      area3.subtract(area2);
      graphics2D.setClip(area3);
      if (paramComponent.isOpaque()) {
        graphics2D.setColor(paramComponent.getParent().getBackground());
        graphics2D.fill(area3);
      } 
      graphics2D.setColor(paramComponent.getBackground());
      graphics2D.fill(area4);
    } finally {
      graphics2D.dispose();
    } 
    if (Zbqc.Zwu() == null)
      Zxt_.Zm(!bool); 
  }
  
  private static float Zn(Component paramComponent) {
    float f = paramComponent.getHeight();
    return f / 2.0F;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg__.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */