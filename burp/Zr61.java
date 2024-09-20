package burp;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;

public class Zr61 extends Zr63 {
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.paintBorder(paramComponent, paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
    Graphics2D graphics2D = Zb(paramGraphics);
    Area area = new Area(new RoundRectangle2D.Double(paramInt1, paramInt2, paramInt3, paramInt4, 12.0D, 12.0D));
    area.subtract(new Area(new Rectangle(paramInt1, paramInt2, paramInt3 - 6, paramInt4)));
    graphics2D.setColor(Zlkk.TASK_LIST_ENTRY_SELECTED_HIGHLIGHT.ZS());
    graphics2D.fill(area);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr61.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */