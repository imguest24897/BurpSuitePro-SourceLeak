package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Window;
import java.awt.event.HierarchyBoundsAdapter;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Zbci extends Zbqc {
  private final Component Zs;
  
  private final Zla4 ZN;
  
  private final Zrf0 ZT;
  
  private final Window ZQ;
  
  private final Zglk Zq;
  
  private final int ZV;
  
  private final Component ZP;
  
  private final HierarchyBoundsAdapter Zw;
  
  public Zbci(Component paramComponent1, Component paramComponent2, Zla4 paramZla4, Zrf0 paramZrf0, Zglk paramZglk, int paramInt) {
    this.ZP = paramComponent1;
    this.Zs = paramComponent2;
    this.ZN = paramZla4;
    this.ZT = paramZrf0;
    this.Zq = paramZglk;
    this.ZV = paramInt;
    this.ZQ = SwingUtilities.getWindowAncestor(paramComponent2);
    ZV();
    setOpaque(false);
    Zl(Zlkk.SKIDMARK_BACKGROUND);
    setBorder(new EmptyBorder((paramZla4 == Zla4.NORTH) ? 25 : 18, (paramZla4 == Zla4.WEST) ? 25 : 18, (paramZla4 == Zla4.SOUTH) ? 25 : 18, (paramZla4 == Zla4.EAST) ? 25 : 18));
    setLayout(new BorderLayout());
    add(paramComponent1);
    this.Zw = new Ze6m(this);
    paramComponent2.addHierarchyBoundsListener(this.Zw);
  }
  
  private Polygon Zo() {
    Polygon polygon = new Polygon();
    Point point = Zz();
    boolean bool = Zm99.ZM();
    polygon.addPoint(point.x, point.y);
    if (this.ZN.ZY()) {
      polygon.addPoint(point.x - 10 * this.ZN.Zg(), point.y - 10);
      polygon.addPoint(point.x - 10 * this.ZN.Zg(), point.y + 10);
      if (!bool) {
        polygon.addPoint(point.x - 10, point.y - 10 * this.ZN.Zg());
        polygon.addPoint(point.x + 10, point.y - 10 * this.ZN.Zg());
        return polygon;
      } 
      return polygon;
    } 
    polygon.addPoint(point.x - 10, point.y - 10 * this.ZN.Zg());
    polygon.addPoint(point.x + 10, point.y - 10 * this.ZN.Zg());
    return polygon;
  }
  
  private Point Zz() {
    Point point1 = Zw();
    Point point2 = ZI();
    Point point3 = new Point(point1.x + point2.x, point1.y + point2.y);
    return new Point(this.ZN.ZY() ? (point3.x - this.ZN.Zg() * this.ZV) : point3.x, this.ZN.ZY() ? point3.y : (point3.y - this.ZN.Zg() * this.ZV));
  }
  
  private Point Zw() {
    return new Point(15 + (this.ZP.getPreferredSize()).width / 2 + ((this.ZN == Zla4.WEST) ? 10 : 3), 15 + (this.ZP.getPreferredSize()).height / 2 + ((this.ZN == Zla4.NORTH) ? 10 : 3));
  }
  
  public void paintComponent(Graphics paramGraphics) {
    super.paintComponent(paramGraphics);
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    Area area = new Area(new RoundRectangle2D.Double((this.ZN == Zla4.WEST) ? 10.0D : 3.0D, (this.ZN == Zla4.NORTH) ? 10.0D : 3.0D, (getWidth() - 3 - (this.ZN.ZY() ? 10 : 3)), (getHeight() - 3 - (this.ZN.ZY() ? 3 : 10)), 15.0D, 15.0D));
    area.add(new Area(Zo()));
    graphics2D.setColor(Zlkk.SKIDMARK_BACKGROUND.ZS());
    graphics2D.fill(area);
    graphics2D.draw(area);
  }
  
  private void ZV() {
    int i = (this.ZP.getPreferredSize()).width + 30 + 3 + (this.ZN.ZY() ? 10 : 3);
    int j = (this.ZP.getPreferredSize()).height + 30 + 3 + (this.ZN.ZY() ? 3 : 10);
    Point point1 = this.Zq.Zf(this.Zs);
    SwingUtilities.convertPointFromScreen(point1, this.ZQ);
    Point point2 = new Point(point1.x, point1.y - (this.ZQ.getInsets()).top);
    Point point3 = Zw();
    Point point4 = ZI();
    int k = point2.x - point4.x - point3.x;
    int m = point2.y - point4.y - point3.y;
    k = Math.max(0, k);
    m = Math.max(0, m);
    k = Math.min(this.ZQ.getWidth() - i, k);
    m = Math.min(this.ZQ.getHeight() - j - (this.ZQ.getInsets()).top, m);
    setBounds(k, m, i, j);
  }
  
  private Point ZI() {
    int i = (this.ZP.getPreferredSize()).height / 2 + 15;
    int j = (this.ZP.getPreferredSize()).width / 2 + 15;
    int k = this.ZN.ZY() ? j : i;
    int m = this.ZN.ZY() ? i : j;
    int n = this.ZV + 10;
    byte b = 35;
    int i1 = this.ZN.Zg() * (k + n);
    int i2 = this.ZT.Zr() * (m - b);
    int i3 = this.ZN.ZY() ? i1 : i2;
    int i4 = this.ZN.ZY() ? i2 : i1;
    return new Point(i3, i4);
  }
  
  public void Zb() {
    this.Zs.removeHierarchyBoundsListener(this.Zw);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbci.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */