package burp;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.Position;

class Zs2y extends AbstractAction {
  final Zgr7 Zb;
  
  private Zs2y(Zgr7 paramZgr7) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    int i = Zgr7.ZX(this.Zb.Zl.getText());
    int j = this.Zb.Zl.getSelectionStart();
    int k = this.Zb.Zl.getSelectionEnd();
    boolean bool = Zgr7.ZI(this.Zb.Zl.getText(), i, j);
    boolean bool1 = (Zgr7.Zg(i, j) || bool || j != k || this.Zb.Zo || this.Zb.ZT(this.Zb.Zl.getCaretPosition()) != ']') ? true : false;
    if (bool1)
      this.Zb.Zl.replaceSelection("]"); 
    this.Zb.Zl.Zc(j + 1, Position.Bias.Backward);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs2y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */