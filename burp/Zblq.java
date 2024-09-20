package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Zblq extends MouseAdapter {
  private final MouseListener ZU;
  
  private final Runnable ZK;
  
  Zblq(MouseListener paramMouseListener, Runnable paramRunnable) {
    this.ZU = paramMouseListener;
    this.ZK = paramRunnable;
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    this.ZK.run();
    this.ZU.mouseClicked(paramMouseEvent);
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.ZK.run();
    this.ZU.mousePressed(paramMouseEvent);
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    this.ZK.run();
    this.ZU.mouseReleased(paramMouseEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zblq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */