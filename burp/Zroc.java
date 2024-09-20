package burp;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class Zroc extends AbstractAction {
  private final String ZY;
  
  final Zljk Zj;
  
  Zroc(Zljk paramZljk, char paramChar) {
    this.ZY = Character.toString(paramChar);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    int[] arrayOfInt = Zghd.ZM();
    boolean bool = this.Zj.ZM();
    if (!bool || !this.Zj.ZZ()) {
      this.Zj.ZI.replaceSelection(this.ZY);
      return;
    } 
    Zmy1 zmy1 = this.Zj.Z_.Ze();
    if (zmy1 instanceof Zzmq) {
      this.Zj.Zu(zmy1, true);
      if (arrayOfInt == null) {
        this.Zj.ZI.replaceSelection(this.ZY);
        return;
      } 
      return;
    } 
    this.Zj.ZI.replaceSelection(this.ZY);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zroc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */