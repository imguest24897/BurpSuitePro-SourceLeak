package burp.theme;

import burp.Zlkk;
import com.formdev.flatlaf.ui.FlatButtonBorder;
import com.formdev.flatlaf.ui.FlatUIUtils;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class BurpAiButtonUI extends BurpButtonUI {
  protected BurpAiButtonUI(boolean paramBoolean) {
    super(paramBoolean);
  }
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    return (FlatUIUtils.canUseSharedUI(paramJComponent) && !needsLightAwtPeer(paramJComponent)) ? FlatUIUtils.createSharedUI(BurpAiButtonUI.class, BurpAiButtonUI::lambda$createUI$0) : (ComponentUI)new BurpAiButtonUI(false);
  }
  
  protected void installDefaults(AbstractButton paramAbstractButton) {
    super.installDefaults(paramAbstractButton);
    this.defaultBoldText = true;
  }
  
  protected Zlkk foreground() {
    return Zlkk.FOREGROUND;
  }
  
  protected Zlkk hoverForeground() {
    return Zlkk.BUTTON_HOVER_FOREGROUND;
  }
  
  protected Zlkk background() {
    return Zlkk.BACKGROUND;
  }
  
  protected Zlkk hoverBackground() {
    return Zlkk.BUTTON_HOVER_BACKGROUND;
  }
  
  protected FlatButtonBorder border() {
    return new BurpAiButtonUI$AiButtonBorder();
  }
  
  private static ComponentUI lambda$createUI$0() {
    return (ComponentUI)new BurpAiButtonUI(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpAiButtonUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */