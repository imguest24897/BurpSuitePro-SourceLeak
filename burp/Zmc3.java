package burp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Zmc3 extends WindowAdapter {
  final Zl44 Zq;
  
  Zmc3(Zl44 paramZl44) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    if (this.Zq.Zz != null)
      this.Zq.Zz.ZP(); 
    Zl44.Za = this.Zq.Zv.ZHh();
    this.Zq.dispose();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmc3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */