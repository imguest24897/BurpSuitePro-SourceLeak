package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Zruc extends KeyAdapter {
  private final Zrvj ZN;
  
  private Zruc(Zrvj paramZrvj) {
    this.ZN = paramZrvj;
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 10 || paramKeyEvent.getKeyCode() == 27)
      this.ZN.dispatchEvent(paramKeyEvent); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zruc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */