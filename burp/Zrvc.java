package burp;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import javax.swing.SwingUtilities;

class Zrvc implements AWTEventListener {
  final Zl09 Zw;
  
  private Zrvc(Zl09 paramZl09) {}
  
  public void eventDispatched(AWTEvent paramAWTEvent) {
    if (paramAWTEvent.getID() == 401) {
      Component component = (Component)paramAWTEvent.getSource();
      if (ZQ(paramAWTEvent, component))
        this.Zw.setVisible(false); 
    } 
  }
  
  private boolean ZQ(AWTEvent paramAWTEvent, Component paramComponent) {
    KeyEvent keyEvent = (KeyEvent)paramAWTEvent;
    if (keyEvent.getKeyCode() == 27 && keyEvent.getModifiersEx() == 0 && !Zq(paramComponent) && SwingUtilities.getWindowAncestor(paramComponent) == this.Zw) {
      keyEvent.consume();
      return true;
    } 
    return false;
  }
  
  private boolean Zq(Component paramComponent) {
    return paramComponent instanceof javax.swing.JRootPane;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrvc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */