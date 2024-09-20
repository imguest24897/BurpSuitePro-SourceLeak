package burp;

import java.awt.KeyboardFocusManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Zto_ extends WindowAdapter {
  final Zrvn Zg;
  
  private Zto_(Zrvn paramZrvn) {}
  
  public void windowClosed(WindowEvent paramWindowEvent) {
    KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this.Zg.ZO);
    super.windowClosed(paramWindowEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zto_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */