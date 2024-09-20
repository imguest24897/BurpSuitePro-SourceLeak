package burp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Zeo8 extends WindowAdapter {
  final Zb05 ZX;
  
  Zeo8(Zgtg paramZgtg, Zb05 paramZb05) {}
  
  public void windowClosed(WindowEvent paramWindowEvent) {
    Zgtg.ZF.remove(this.ZX);
    super.windowClosed(paramWindowEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeo8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */