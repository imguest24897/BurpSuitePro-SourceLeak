package burp;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.border.MatteBorder;

public class Zrf5 extends MatteBorder {
  private final Zlkk Zn;
  
  public Zrf5(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Zlkk paramZlkk) {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramZlkk.ZS());
    this.Zn = paramZlkk;
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ZD();
    super.paintBorder(paramComponent, paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private void ZD() {
    this.color = this.Zn.ZS();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrf5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */