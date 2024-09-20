package burp;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

final class Zbub implements ItemListener {
  final Zz8u ZO;
  
  private Zbub(Zz8u paramZz8u) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    Zbqc[] arrayOfZbqc = Zrv_.ZG();
    if (paramItemEvent.getStateChange() == 1) {
      this.ZO.Zj.Zi(Zlkk.QUESTIONNAIRE_BUTTON_SELECTED_BACKGROUND);
      if (arrayOfZbqc == null) {
        if (paramItemEvent.getStateChange() == 2)
          this.ZO.Zj.Zi(Zlkk.QUESTIONNAIRE_BUTTON_HOVER_BACKGROUND); 
        return;
      } 
      return;
    } 
    if (paramItemEvent.getStateChange() == 2)
      this.ZO.Zj.Zi(Zlkk.QUESTIONNAIRE_BUTTON_HOVER_BACKGROUND); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbub.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */