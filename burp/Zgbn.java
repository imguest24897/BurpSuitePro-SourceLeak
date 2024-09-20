package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Zgbn extends KeyAdapter {
  final Zgr7 ZW;
  
  Zgbn(Zgr7 paramZgr7) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.isActionKey())
      this.ZW.ZC(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgbn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */