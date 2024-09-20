package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zerp extends MouseAdapter {
  final Runnable ZM;
  
  Zerp(Zbvo paramZbvo, Runnable paramRunnable) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    this.ZM.run();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zerp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */