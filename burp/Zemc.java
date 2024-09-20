package burp;

import java.awt.Window;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

class Zemc extends ComponentAdapter implements WindowFocusListener {
  final Zljk ZE;
  
  private Zemc(Zljk paramZljk) {}
  
  public void Zu(Window paramWindow) {
    paramWindow.addComponentListener(this);
    paramWindow.addWindowFocusListener(this);
  }
  
  public void componentHidden(ComponentEvent paramComponentEvent) {
    this.ZE.ZJ();
  }
  
  public void componentMoved(ComponentEvent paramComponentEvent) {
    this.ZE.ZJ();
  }
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    this.ZE.ZJ();
  }
  
  public void ZA(Window paramWindow) {
    paramWindow.removeComponentListener(this);
    paramWindow.removeWindowFocusListener(this);
  }
  
  public void windowGainedFocus(WindowEvent paramWindowEvent) {}
  
  public void windowLostFocus(WindowEvent paramWindowEvent) {
    this.ZE.ZJ();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zemc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */