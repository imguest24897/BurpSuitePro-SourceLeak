package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Zbln extends KeyAdapter {
  final Zbef ZU;
  
  Zbln(Zbef paramZbef) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    this.ZU.ZP(paramKeyEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbln.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */