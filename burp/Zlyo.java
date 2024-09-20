package burp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Zlyo extends WindowAdapter {
  final Zl4n ZJ;
  
  Zlyo(Zl4n paramZl4n) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    this.ZJ.Zl = true;
    this.ZJ.setVisible(false);
    this.ZJ.dispose();
    this.ZJ.Zu.stop();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlyo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */