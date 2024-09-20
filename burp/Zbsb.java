package burp;

import java.awt.KeyboardFocusManager;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

class Zbsb implements AncestorListener {
  final Zb58 Zf;
  
  private Zbsb(Zb58 paramZb58) {}
  
  public void ancestorAdded(AncestorEvent paramAncestorEvent) {
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this.Zf.Zi);
  }
  
  public void ancestorRemoved(AncestorEvent paramAncestorEvent) {
    KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this.Zf.Zi);
  }
  
  public void ancestorMoved(AncestorEvent paramAncestorEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbsb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */