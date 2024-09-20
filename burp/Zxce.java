package burp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;

class Zxce extends AbstractBorder {
  final Zbvj ZA;
  
  Zxce(Zbvj paramZbvj) {}
  
  public Insets getBorderInsets(Component paramComponent) {
    return new Insets(20, 20, 20, 20);
  }
  
  public Insets getBorderInsets(Component paramComponent, Insets paramInsets) {
    return new Insets(20, 20, 20, 20);
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics.create();
    graphics2D.setRenderingHints(Zbvj.Zm);
    Area area = new Area(new RoundRectangle2D.Double(paramInt1, paramInt2, paramInt3, paramInt4, 16.0D, 16.0D));
    Color color = paramComponent.getBackground();
    graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), 191));
    graphics2D.fill(area);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxce.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */