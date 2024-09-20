package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Ze62 extends KeyAdapter {
  final Zm6a Zq;
  
  final Zgf8 Zl;
  
  Ze62(Zgf8 paramZgf8, Zm6a paramZm6a) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    if (!paramKeyEvent.isActionKey())
      this.Zq.Zc(this.Zl.getText()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze62.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */