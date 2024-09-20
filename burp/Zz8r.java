package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zz8r extends MouseAdapter {
  final Runnable ZO;
  
  final Zbcm Zw;
  
  Zz8r(Zbcm paramZbcm, Runnable paramRunnable) {}
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (this.Zw.ZI && this.Zw.ZS.getAsBoolean() && this.Zw.contains(paramMouseEvent.getPoint()))
      this.ZO.run(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz8r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */