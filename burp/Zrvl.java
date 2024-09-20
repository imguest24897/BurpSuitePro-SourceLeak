package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

public class Zrvl extends Zrh7 {
  private boolean ZR;
  
  private Ze01 Zt;
  
  public boolean Zh() {
    return this.ZR;
  }
  
  public void dispose() {
    setVisible(false);
    super.dispose();
  }
  
  private void lambda$createActionButtons$2(ActionEvent paramActionEvent) {
    dispose();
  }
  
  private void lambda$createRadioButtonPanels$1(ItemEvent paramItemEvent) {
    this.ZR = false;
    this.Zt.Zj(Zlkk.PRIMARY_BUTTON_BACKGROUND);
    this.Zt.Zv(Zlkk.PRIMARY_BUTTON_FOREGROUND);
  }
  
  private void lambda$createRadioButtonPanels$0(ItemEvent paramItemEvent) {
    this.ZR = true;
    this.Zt.Zj(Zlkk.BACKGROUND);
    this.Zt.Zv(Zlkk.FOREGROUND);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrvl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */