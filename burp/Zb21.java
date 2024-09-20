package burp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Zb21 extends WindowAdapter {
  final Zlgj Ze;
  
  Zb21(Zlgj paramZlgj) {}
  
  public void windowClosed(WindowEvent paramWindowEvent) {
    this.Ze.Zt.decrementAndGet();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb21.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */