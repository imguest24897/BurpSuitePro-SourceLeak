package burp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Zts9 extends WindowAdapter {
  private final Zbq8 Zh;
  
  public Zts9(Zbq8 paramZbq8) {
    this.Zh = paramZbq8;
  }
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    this.Zh.ZK(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zts9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */