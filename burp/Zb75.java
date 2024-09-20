package burp;

import com.formdev.flatlaf.ui.FlatDropShadowBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.border.Border;

public class Zb75 extends Zbqc {
  private static final Color Zo = new Color(0.0F, 0.0F, 0.0F, 0.1F);
  
  private final Zbqc ZJ;
  
  public Zb75(Component paramComponent) {
    super(new BorderLayout());
    Zl(Zlkk.BACKGROUNDER);
    Zo();
    this.ZJ = new Zbqc(new BorderLayout());
    this.ZJ.add(paramComponent);
    Zh();
    add(this.ZJ);
  }
  
  public void updateUI() {
    super.updateUI();
    Zo();
    Zh();
  }
  
  private void Zo() {
    setBorder((Border)new FlatDropShadowBorder(Zo, new Insets(8, 8, 8, 8), 0.1F));
  }
  
  private void Zh() {
    if (this.ZJ != null)
      this.ZJ.setBackground(ZD(Zlkk.BACKGROUNDER.ZS())); 
  }
  
  private static Color ZD(Color paramColor) {
    float f = 0.9F;
    return new Color(Math.max((int)(paramColor.getRed() * f), 0), Math.max((int)(paramColor.getGreen() * f), 0), Math.max((int)(paramColor.getBlue() * f), 0), paramColor.getAlpha());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb75.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */