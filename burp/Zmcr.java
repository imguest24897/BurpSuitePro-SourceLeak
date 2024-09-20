package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Zmcr extends KeyAdapter {
  final Zba9 Zb;
  
  private Zmcr(Zba9 paramZba9) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() != 10)
      return; 
    this.Zb.Zd();
    paramKeyEvent.consume();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmcr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */