package burp;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Zmve implements Icon {
  private final ImageIcon ZA;
  
  private FlatSVGIcon ZB;
  
  private int Zl;
  
  public Zmve(ImageIcon paramImageIcon, FlatSVGIcon paramFlatSVGIcon) {
    this.ZA = paramImageIcon;
    this.ZB = paramFlatSVGIcon;
  }
  
  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2) {
    ZR();
    this.ZA.paintIcon(paramComponent, paramGraphics, paramInt1, paramInt2);
    int i = paramInt1 + this.ZA.getIconWidth() - this.ZB.getIconWidth();
    int j = paramInt2 + this.ZA.getIconHeight() - this.ZB.getIconHeight();
    int[] arrayOfInt = Zeuf.ZS();
    this.ZB.paintIcon(paramComponent, paramGraphics, i, j);
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  private void ZR() {
    if (this.Zl != Zrt.ZC()) {
      this.Zl = Zrt.ZC();
      this.ZB = this.ZB.derive((int)(this.ZA.getIconWidth() * 0.5D), (int)(this.ZA.getIconHeight() * 0.5D));
    } 
  }
  
  public int getIconWidth() {
    return this.ZA.getIconWidth();
  }
  
  public int getIconHeight() {
    return this.ZA.getIconHeight();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmve.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */