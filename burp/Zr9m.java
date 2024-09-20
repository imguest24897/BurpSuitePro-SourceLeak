package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class Zr9m extends MouseAdapter {
  private int Zx = -1;
  
  final Zbqc Zz;
  
  final Zbhw ZC;
  
  Zr9m(Zbhw paramZbhw, Zbqc paramZbqc) {}
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (this.Zx != -1) {
      int i = this.Zz.getHeight();
      int j = i + this.Zx - paramMouseEvent.getYOnScreen();
      if (j < this.ZC.Zw() || j > this.ZC.Zl() - this.ZC.Zw())
        return; 
      this.ZC.ZR = j / this.ZC.Zl();
      SwingUtilities.invokeLater(this::lambda$mouseDragged$0);
    } 
    this.Zx = paramMouseEvent.getYOnScreen();
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.Zx = -1;
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    this.Zx = -1;
  }
  
  private void lambda$mouseDragged$0() {
    Zmse.ZF(this.ZC);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr9m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */