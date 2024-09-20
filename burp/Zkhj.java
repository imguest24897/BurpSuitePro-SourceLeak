package burp;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import javax.swing.SwingUtilities;

class Zkhj implements AWTEventListener {
  final Zl02 ZQ;
  
  private Zkhj(Zl02 paramZl02) {}
  
  public void eventDispatched(AWTEvent paramAWTEvent) {
    if (paramAWTEvent.getID() == 401) {
      Component component = (Component)paramAWTEvent.getSource();
      if (Zx(paramAWTEvent, component))
        this.ZQ.setVisible(false); 
    } 
  }
  
  private boolean Zx(AWTEvent paramAWTEvent, Component paramComponent) {
    KeyEvent keyEvent = (KeyEvent)paramAWTEvent;
    if (keyEvent.getKeyCode() == 27 && keyEvent.getModifiersEx() == 0 && !ZQ(paramComponent) && SwingUtilities.getWindowAncestor(paramComponent) == this.ZQ) {
      keyEvent.consume();
      return true;
    } 
    return false;
  }
  
  private boolean ZQ(Component paramComponent) {
    return paramComponent instanceof javax.swing.JRootPane;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkhj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */