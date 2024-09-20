package burp;

import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JTabbedPane;

public final class Zgzo {
  public static Point ZO(JTabbedPane paramJTabbedPane, int paramInt, Point paramPoint) {
    Point point1 = new Point(MouseInfo.getPointerInfo().getLocation());
    Point point2 = new Point(paramPoint);
    Point point3 = paramJTabbedPane.getBoundsAt(paramInt).getLocation();
    point2.x -= point3.x;
    point2.y -= point3.y;
    point1.x -= point2.x;
    point1.y -= point2.y;
    return point1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */