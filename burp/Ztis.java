package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Ztis extends KeyAdapter {
  final Zgol ZG;
  
  Ztis(Zgol paramZgol) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    this.ZG.ZH(paramKeyEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztis.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */