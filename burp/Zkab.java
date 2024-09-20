package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.atomic.AtomicBoolean;

class Zkab extends KeyAdapter {
  final AtomicBoolean ZD;
  
  final Zgfo Zj;
  
  Zkab(Zba1 paramZba1, AtomicBoolean paramAtomicBoolean, Zgfo paramZgfo) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 10 && this.ZD.get()) {
      this.Zj.setEnabled(false);
      this.Zj.setEnabled(true);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkab.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */