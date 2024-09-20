package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ToolTipManager;

class Ze32 extends MouseAdapter {
  Ze32(Zbqd paramZbqd) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    ToolTipManager.sharedInstance().setDismissDelay(60000);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    ToolTipManager.sharedInstance().setDismissDelay(Zbqd.ZY);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze32.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */