package burp;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.Position;

class Zkeh extends AbstractAction {
  final Zgr7 ZW;
  
  private Zkeh(Zgr7 paramZgr7) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = this.ZW.Zl.getText();
    int i = this.ZW.Zl.getSelectionStart();
    int j = this.ZW.Zl.getSelectionEnd();
    int k = Zgr7.ZX(str);
    boolean bool = (Zgr7.Zg(k, i) || i != j || this.ZW.ZT || Zgr7.ZI(this.ZW.Zl.getText(), k, i) || this.ZW.ZT(this.ZW.Zl.getCaretPosition()) != '}') ? true : false;
    if (bool)
      this.ZW.Zl.replaceSelection("}"); 
    this.ZW.Zl.Zc(i + 1, Position.Bias.Backward);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkeh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */