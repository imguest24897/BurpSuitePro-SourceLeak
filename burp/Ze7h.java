package burp;

import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;

public class Ze7h extends JRadioButtonMenuItem {
  private final boolean ZZ = true;
  
  private Zlkk ZD;
  
  public Ze7h() {}
  
  public Ze7h(String paramString) {
    super(paramString);
  }
  
  public Ze7h(String paramString, boolean paramBoolean) {
    super(paramString);
  }
  
  public void processMouseEvent(MouseEvent paramMouseEvent) {
    if (!this.ZZ && paramMouseEvent.getID() == 502 && contains(paramMouseEvent.getPoint())) {
      doClick();
      setArmed(true);
      return;
    } 
    super.processMouseEvent(paramMouseEvent);
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZD != null)
      setBackground(this.ZD.ZS()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze7h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */