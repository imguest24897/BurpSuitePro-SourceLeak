package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

final class Zm1w extends MouseAdapter {
  final Zzl2 Zz;
  
  private Zm1w(Zzl2 paramZzl2) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.Zz.actionPerformed((ActionEvent)null);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    Component component = (Component)paramMouseEvent.getSource();
    Point point = paramMouseEvent.getPoint();
    SwingUtilities.convertPointToScreen(point, component);
    if (!this.Zz.getBounds().contains(point))
      this.Zz.Zl.ZX(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm1w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */