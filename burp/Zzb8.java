package burp;

import java.awt.Container;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.text.View;

abstract class Zzb8 extends JPanel {
  protected Zmgw Zx;
  
  protected int Zm;
  
  Zzb8(Zmgw paramZmgw) {
    Zc();
    ZQ(paramZmgw);
  }
  
  protected static Rectangle ZJ(View paramView, int paramInt, Rectangle paramRectangle) {
    Shape shape = paramView.getChildAllocation(paramInt, paramRectangle);
    return (shape == null) ? new Rectangle() : ((shape instanceof Rectangle) ? (Rectangle)shape : shape.getBounds());
  }
  
  protected Zsqn ZI() {
    Container container = getParent();
    return (container instanceof Zsqn) ? (Zsqn)container : null;
  }
  
  abstract void Z_(DocumentEvent paramDocumentEvent);
  
  protected void Zc() {}
  
  abstract void Zp();
  
  public void ZQ(Zmgw paramZmgw) {
    this.Zx = paramZmgw;
    boolean bool = (paramZmgw == null) ? false : paramZmgw.getLineCount();
    if (this.Zm != bool) {
      this.Zm = bool;
      repaint();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzb8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */