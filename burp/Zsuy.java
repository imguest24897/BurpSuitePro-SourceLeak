package burp;

import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;

public class Zsuy extends JCheckBoxMenuItem {
  private final boolean Zm = true;
  
  public Zsuy() {}
  
  public Zsuy(String paramString) {
    super(paramString);
  }
  
  public Zsuy(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramString, paramBoolean1);
  }
  
  public void processMouseEvent(MouseEvent paramMouseEvent) {
    if (!this.Zm && paramMouseEvent.getID() == 502 && contains(paramMouseEvent.getPoint())) {
      doClick();
      setArmed(true);
      return;
    } 
    super.processMouseEvent(paramMouseEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsuy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */