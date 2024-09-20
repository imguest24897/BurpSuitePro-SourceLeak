package burp;

import java.awt.BasicStroke;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;

public class Zxz5 extends AbstractBorder {
  private final int ZA;
  
  private final Zlkk ZV;
  
  private final int ZN;
  
  private final int ZE;
  
  private final int ZM;
  
  public Zxz5(Zlkk paramZlkk, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.ZA = paramInt2;
    this.ZV = paramZlkk;
    this.ZN = paramInt1;
    this.ZE = paramInt3;
    this.ZM = paramInt4;
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics.create();
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    RoundRectangle2D.Double double_ = new RoundRectangle2D.Double(paramInt1, paramInt2, (paramInt3 - 1), (paramInt4 - 1), this.ZA, this.ZA);
    BasicStroke basicStroke = new BasicStroke(this.ZN, 1, 1, 0.0F, new float[] { this.ZE, this.ZM }, 0.0F);
    graphics2D.setStroke(basicStroke);
    Container container = paramComponent.getParent();
    if (container != null && this.ZA > 0) {
      Shape shape = graphics2D.getClip();
      Area area1 = new Area(new RoundRectangle2D.Double(paramInt1, paramInt2, paramInt3, paramInt4, this.ZA, this.ZA));
      Area area2 = new Area(new Rectangle(paramInt1, paramInt2, paramInt3, paramInt4));
      area2.subtract(area1);
      graphics2D.setClip(area2);
      graphics2D.setColor(container.getBackground());
      graphics2D.fillRect(0, 0, paramInt3, paramInt4);
      graphics2D.setClip(shape);
    } 
    graphics2D.setColor(this.ZV.ZS());
    graphics2D.draw(double_);
    graphics2D.dispose();
  }
  
  public Insets getBorderInsets(Component paramComponent) {
    return new Insets(this.ZN, this.ZN, this.ZN, this.ZN);
  }
  
  public Insets getBorderInsets(Component paramComponent, Insets paramInsets) {
    paramInsets.left = paramInsets.top = paramInsets.right = paramInsets.bottom = this.ZN;
    return paramInsets;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxz5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */