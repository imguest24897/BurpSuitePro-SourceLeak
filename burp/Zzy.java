package burp;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.event.MouseInputAdapter;

class Zzy extends MouseInputAdapter implements PropertyChangeListener {
  final Zzbf Zo;
  
  Zzy(Zzbf paramZzbf1, Zzbf paramZzbf2) {
    paramZzbf2.addMouseListener(this);
    paramZzbf2.addMouseMotionListener(this);
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    Point point = paramMouseEvent.getPoint();
    int i = this.Zo.ZW(point);
    Zmgn zmgn = (Zmgn)this.Zo.Zx;
    Zxam zxam = zmgn.Zm();
    Zxyv zxyv = zxam.ZY(i);
    if (zxyv != null) {
      zxyv.Zh();
      this.Zo.ZI().repaint();
      this.Zo.Zx.repaint();
    } 
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    if (this.Zo.Zt != null) {
      this.Zo.Zt = null;
      this.Zo.Zp = false;
      this.Zo.repaint();
    } 
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    boolean bool = this.Zo.Zp;
    Zxyv zxyv = this.Zo.ZG(paramMouseEvent.getPoint());
    int i = Zz85.ZT();
    if (zxyv != this.Zo.Zt && zxyv != null && !zxyv.ZK()) {
      this.Zo.Zt = zxyv;
      this.Zo.repaint();
      if (i == 0) {
        if (this.Zo.Zp != bool)
          this.Zo.repaint(); 
        return;
      } 
      return;
    } 
    if (this.Zo.Zp != bool)
      this.Zo.repaint(); 
  }
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    this.Zo.repaint();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */