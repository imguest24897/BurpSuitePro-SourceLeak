package burp;

import com.formdev.flatlaf.ui.FlatButtonBorder;
import java.awt.Component;

class Zg_4 extends FlatButtonBorder {
  protected float getBorderWidth(Component paramComponent) {
    return paramComponent.isEnabled() ? 0.0F : 1.0F;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */