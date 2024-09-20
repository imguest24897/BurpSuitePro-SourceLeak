package burp;

import com.formdev.flatlaf.ui.FlatRoundBorder;
import java.awt.Color;
import java.awt.Component;

public class Zlkz extends FlatRoundBorder {
  private boolean ZG;
  
  protected Color getOutlineColor(Component paramComponent) {
    return this.ZG ? super.getOutlineColor(paramComponent) : Zlkk.TYPOGRAPHY_ERROR.ZS();
  }
  
  public void ZW(boolean paramBoolean) {
    this.ZG = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlkz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */