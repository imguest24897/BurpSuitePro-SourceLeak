package burp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Zxsj extends WindowAdapter {
  final Zz_r ZD;
  
  final Zl41 Zm;
  
  Zxsj(Zl41 paramZl41, Zz_r paramZz_r) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    if (this.Zm.ZC != null) {
      this.Zm.ZC.ZP();
      this.ZD.Za(this.Zm.ZC);
    } 
    Zl41.ZH = this.Zm.Zo.ZHh();
    this.Zm.dispose();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxsj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */