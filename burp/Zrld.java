package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zrld extends KeyAdapter {
  final Zbe6 ZA;
  
  Zrld(Zbe6 paramZbe6) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    try {
      int i = Zbe6.ZV(this.ZA.Zd.getText());
      this.ZA.Zc.setText(Integer.toString(i));
      this.ZA.Zt(i);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrld.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */