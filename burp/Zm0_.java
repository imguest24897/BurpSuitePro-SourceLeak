package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingUtilities;

class Zm0_ extends KeyAdapter {
  final Zb52 ZA;
  
  Zm0_(Zb52 paramZb52) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    SwingUtilities.invokeLater(this::lambda$keyTyped$0);
  }
  
  private void lambda$keyTyped$0() {
    this.ZA.ZC(Zzsp.INITIAL);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm0_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */