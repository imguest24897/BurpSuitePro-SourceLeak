package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Zxwt implements ActionListener {
  final Zrxt Zr;
  
  Zxwt(Zrxt paramZrxt) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    synchronized (this.Zr.Zj) {
      if (this.Zr.ZV != null) {
        this.Zr.Zd(this.Zr.ZV);
        this.Zr.ZV = null;
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxwt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */