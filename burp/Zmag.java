package burp;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.util.Locale;
import javax.swing.SwingUtilities;
import net.portswigger.Zm2;

class Zmag implements AWTEventListener {
  private boolean Zw;
  
  private String ZN = "";
  
  final Zl4w ZX;
  
  private Zmag(Zl4w paramZl4w) {}
  
  public void eventDispatched(AWTEvent paramAWTEvent) {
    if (paramAWTEvent.getID() == 401) {
      Component component = (Component)paramAWTEvent.getSource();
      if (Zt(paramAWTEvent, component)) {
        this.ZX.setVisible(false);
        return;
      } 
      if (component == this.ZX.ZP) {
        this.Zw = true;
        return;
      } 
    } 
    if (!this.Zw || paramAWTEvent.getID() != 500 || !this.ZX.isVisible() || this.ZX.Zi.getMousePosition() == null)
      return; 
    this.Zw = false;
    String str = this.ZX.ZP.getText().trim();
    if (str.length() < 2 || this.ZX.ZV.getRowCount() == 0)
      return; 
    str = str.toLowerCase(Locale.ENGLISH);
    if (!this.ZN.equals(str)) {
      this.ZN = str;
      Zm2.ZB(Zec3.SUITE_SETTINGS_SUCCESSFUL_SEARCH, str);
    } 
  }
  
  private boolean Zt(AWTEvent paramAWTEvent, Component paramComponent) {
    KeyEvent keyEvent = (KeyEvent)paramAWTEvent;
    if (keyEvent.getKeyCode() == 27 && keyEvent.getModifiersEx() == 0 && !ZQ(paramComponent) && SwingUtilities.getWindowAncestor(paramComponent) == this.ZX) {
      keyEvent.consume();
      return true;
    } 
    return false;
  }
  
  private boolean ZQ(Component paramComponent) {
    return paramComponent instanceof javax.swing.JRootPane;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmag.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */