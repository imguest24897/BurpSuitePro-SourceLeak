package burp;

import com.formdev.flatlaf.ui.FlatRootPaneUI;
import com.formdev.flatlaf.ui.FlatTitlePane;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class Zgm7 extends FlatRootPaneUI {
  public static ComponentUI createUI(JComponent paramJComponent) {
    return (ComponentUI)new Zgm7();
  }
  
  protected FlatTitlePane createTitlePane() {
    return new Zgln(this.rootPane);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgm7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */