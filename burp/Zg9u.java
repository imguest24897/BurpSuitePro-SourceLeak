package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Zg9u implements ActionListener {
  private final ActionListener Zx;
  
  final Zzkl Zu;
  
  private Zg9u(Zzkl paramZzkl, ActionListener paramActionListener) {
    this.Zx = paramActionListener;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.Zx.actionPerformed(paramActionEvent);
    this.Zu.Ze.removeAll();
    this.Zu.ZY.removeAll();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg9u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */