package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Zbna implements ActionListener {
  final Zbrk Zr;
  
  Zbna(Zbrk paramZbrk) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.Zr.ZC(paramActionEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbna.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */