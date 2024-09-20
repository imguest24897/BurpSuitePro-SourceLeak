package burp.theme;

import burp.Zlkk;
import com.formdev.flatlaf.ui.FlatUIUtils;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class BurpSecondaryButtonUI extends BurpButtonUI {
  protected BurpSecondaryButtonUI(boolean paramBoolean) {
    super(paramBoolean);
  }
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    return (FlatUIUtils.canUseSharedUI(paramJComponent) && !needsLightAwtPeer(paramJComponent)) ? FlatUIUtils.createSharedUI(BurpSecondaryButtonUI.class, BurpSecondaryButtonUI::lambda$createUI$0) : (ComponentUI)new BurpSecondaryButtonUI(false);
  }
  
  protected void installDefaults(AbstractButton paramAbstractButton) {
    super.installDefaults(paramAbstractButton);
    this.defaultBoldText = true;
  }
  
  protected Zlkk disabledBackground() {
    return Zlkk.SECONDARY_BUTTON_DISABLED_BACKGROUND;
  }
  
  private static ComponentUI lambda$createUI$0() {
    return (ComponentUI)new BurpSecondaryButtonUI(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpSecondaryButtonUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */