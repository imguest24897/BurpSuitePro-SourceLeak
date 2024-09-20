package burp.theme;

import com.formdev.flatlaf.ui.FlatTableHeaderUI;
import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.table.JTableHeader;

public class BurpTableHeaderUI extends FlatTableHeaderUI {
  public static ComponentUI createUI(JComponent paramJComponent) {
    return (ComponentUI)new BurpTableHeaderUI();
  }
  
  protected MouseInputListener createMouseInputListener() {
    return (MouseInputListener)new BurpTableHeaderUI$BurpMouseInputHandler(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTableHeaderUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */