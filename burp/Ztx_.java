package burp;

import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

class Ztx_ extends MouseInputAdapter {
  private Point Ze;
  
  final JPanel ZN;
  
  final Zzl2 ZK;
  
  Ztx_(Zzl2 paramZzl2, JPanel paramJPanel) {}
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    Point point = paramMouseEvent.getPoint();
    SwingUtilities.convertPointToScreen(point, this.ZN);
    if (this.Ze != null) {
      int i = point.x - this.Ze.x;
      int j = point.y - this.Ze.y;
      this.ZK.setLocation(this.ZK.getX() + i, this.ZK.getY() + j);
    } 
    this.Ze = point;
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.Ze = paramMouseEvent.getPoint();
    SwingUtilities.convertPointToScreen(this.Ze, this.ZN);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztx_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */