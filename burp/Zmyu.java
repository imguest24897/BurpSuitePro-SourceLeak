package burp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

class Zmyu implements Border {
  private static final ConvolveOp ZM = new ConvolveOp(new Kernel(7, 7, new float[] { 
          0.005F, 0.005F, 0.01F, 0.01F, 0.01F, 0.005F, 0.005F, 0.005F, 0.01F, 0.02F, 
          0.02F, 0.02F, 0.01F, 0.005F, 0.01F, 0.02F, 0.04F, 0.04F, 0.04F, 0.02F, 
          0.01F, 0.01F, 0.02F, 0.04F, 0.08F, 0.04F, 0.02F, 0.01F, 0.01F, 0.02F, 
          0.04F, 0.04F, 0.04F, 0.02F, 0.01F, 0.005F, 0.01F, 0.02F, 0.02F, 0.02F, 
          0.01F, 0.005F, 0.005F, 0.005F, 0.01F, 0.01F, 0.01F, 0.005F, 0.005F }));
  
  private final Zeyc Zb;
  
  private final Component Zc;
  
  public Zmyu(Zeyc paramZeyc, Component paramComponent) {
    this.Zb = paramZeyc;
    this.Zc = paramComponent;
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics.create();
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    paramInt2 = this.Zb.ZT() ? paramInt2 : (paramInt2 + 10);
    Area area = new Area(new RoundRectangle2D.Double((paramInt1 + 5), (paramInt2 + 5), (paramInt3 - 8), (paramInt4 - 8 - 10), 15.0D, 15.0D));
    area.add(new Area(Za(paramComponent, paramInt4)));
    ZI(graphics2D, area, paramInt3, paramInt4);
    graphics2D.setColor(paramComponent.getBackground());
    graphics2D.fill(area);
    graphics2D.setStroke(new BasicStroke(1.0F));
    graphics2D.setColor(Zlkk.BORDER.ZS());
    graphics2D.draw(area);
    graphics2D.dispose();
  }
  
  public Insets getBorderInsets(Component paramComponent) {
    return this.Zb.ZT() ? new Insets(8, 8, 18, 8) : new Insets(18, 8, 8, 8);
  }
  
  public boolean isBorderOpaque() {
    return true;
  }
  
  private Polygon Za(Component paramComponent, int paramInt) {
    int i = Zk(paramComponent);
    Polygon polygon = new Polygon();
    boolean bool = Zm99.ZQ();
    if (this.Zb.ZT()) {
      polygon.addPoint(i - 10, paramInt - 8 - 10);
      polygon.addPoint(i, paramInt - 5);
      polygon.addPoint(i + 10, paramInt - 8 - 10);
      if (bool) {
        polygon.addPoint(i - 10, 18);
        polygon.addPoint(i, 5);
        polygon.addPoint(i + 10, 18);
        return polygon;
      } 
      return polygon;
    } 
    polygon.addPoint(i - 10, 18);
    polygon.addPoint(i, 5);
    polygon.addPoint(i + 10, 18);
    return polygon;
  }
  
  private int Zk(Component paramComponent) {
    Point point = SwingUtilities.convertPoint(this.Zc.getParent(), this.Zc.getLocation(), paramComponent);
    point.translate(this.Zc.getWidth() / 2, 0);
    return point.x;
  }
  
  private static void ZI(Graphics2D paramGraphics2D, Area paramArea, int paramInt1, int paramInt2) {
    BufferedImage bufferedImage = new BufferedImage(paramInt1, paramInt2, 2);
    Graphics2D graphics2D = bufferedImage.createGraphics();
    graphics2D.setColor(new Color(0, 0, 0, 100));
    graphics2D.fill(paramArea);
    graphics2D.dispose();
    paramGraphics2D.drawImage(ZM.filter(bufferedImage, (BufferedImage)null), (BufferedImageOp)null, 0, 2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmyu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */