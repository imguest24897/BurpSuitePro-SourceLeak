package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JLayeredPane;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztzt {
  private final Component Zw;
  
  private final Component Zx;
  
  private final Zeyc ZO;
  
  private final int Zb;
  
  private Zbcl ZP;
  
  public Ztzt(Component paramComponent1, Component paramComponent2, Zeyc paramZeyc, int paramInt) {
    this.Zw = paramComponent1;
    this.Zx = paramComponent2;
    this.ZO = paramZeyc;
    this.Zb = paramInt;
  }
  
  public void Zf() {
    if (this.Zx != null)
      SwingUtilities.updateComponentTreeUI(this.Zx); 
  }
  
  public void ZQ() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    if (this.ZP == null)
      this.ZP = ZU(); 
    if (this.ZP == null || this.ZP.isVisible())
      return; 
    Point point = this.ZO.Zy(this.Zw, this.Zx, this.Zb);
    Rectangle rectangle = ((Zl04)Zt2m.ZF(this.Zw)).getRootPane().getLayeredPane().getBounds();
    point.x = Math.max(rectangle.x, point.x);
    point.x = Math.min(rectangle.x + rectangle.width - (this.ZP.getPreferredSize()).width, point.x);
    this.ZP.setBounds(point.x, point.y, (this.ZP.getPreferredSize()).width, (this.ZP.getPreferredSize()).height);
    this.ZP.setVisible(true);
  }
  
  private Zbcl ZU() {
    Zl04 zl04 = (Zl04)Zt2m.ZF(this.Zw);
    if (zl04 == null)
      return null; 
    JRootPane jRootPane = zl04.getRootPane();
    JLayeredPane jLayeredPane = jRootPane.getLayeredPane();
    Zbcl zbcl = new Zbcl(this.ZO, this.Zw, this.Zx);
    jLayeredPane.add(zbcl, JLayeredPane.POPUP_LAYER);
    zbcl.setVisible(false);
    return zbcl;
  }
  
  public void Zt() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    if (this.ZP != null && this.ZP.isVisible())
      this.ZP.setVisible(false); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztzt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */