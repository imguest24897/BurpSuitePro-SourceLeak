package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Zz3n extends KeyAdapter {
  final Zr75 Zv;
  
  Zz3n(Zr75 paramZr75) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    String[] arrayOfString = Zb5h.ZX();
    if (paramKeyEvent.getKeyCode() == 10 && this.Zv.Ze != null && this.Zv.Ze.ZM()) {
      this.Zv.Zi();
      if (arrayOfString == null) {
        if (paramKeyEvent.getKeyCode() == 27)
          this.Zv.dispose(); 
        return;
      } 
      return;
    } 
    if (paramKeyEvent.getKeyCode() == 27)
      this.Zv.dispose(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz3n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */