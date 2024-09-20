package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Zb48 extends KeyAdapter {
  final Zr7t ZG;
  
  Zb48(Zr7t paramZr7t) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyChar() == '\033')
      this.ZG.Zj(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb48.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */