package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Zlky implements ActionListener {
  final Zrha Zp;
  
  Zlky(Zrha paramZrha) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.Zp.ZT(paramActionEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlky.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */