package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Zgeu extends KeyAdapter {
  private final Runnable Zr;
  
  public Zgeu(Runnable paramRunnable) {
    this.Zr = paramRunnable;
  }
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyChar() == '\n' && !paramKeyEvent.isShiftDown()) {
      this.Zr.run();
      paramKeyEvent.consume();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgeu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */