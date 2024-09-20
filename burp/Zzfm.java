package burp;

import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Zzfm extends Zzfv {
  private static final long serialVersionUID = 1L;
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    if (!paramZmgw.isEditable() || !paramZmgw.isEnabled()) {
      UIManager.getLookAndFeel().provideErrorFeedback(paramZmgw);
      return;
    } 
    Zmgn zmgn = (Zmgn)paramZmgw;
    paramZmgw.replaceSelection(zmgn.Zq());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */