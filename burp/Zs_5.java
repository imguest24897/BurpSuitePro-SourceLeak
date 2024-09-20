package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Zs_5 extends KeyAdapter {
  final Zb5h Zh;
  
  Zs_5(Zb5h paramZb5h) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 10 || paramKeyEvent.getKeyCode() == 27)
      this.Zh.ZI.dispatchEvent(paramKeyEvent); 
    this.Zh.ZM.run();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */