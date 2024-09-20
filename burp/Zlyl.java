package burp;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class Zlyl extends AbstractAction {
  final Ztf6 ZN;
  
  Zlyl(Ztf6 paramZtf6) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.ZN.Zq.requestFocus();
  }
  
  public boolean isEnabled() {
    return this.ZN.Zq.isEditable();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlyl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */