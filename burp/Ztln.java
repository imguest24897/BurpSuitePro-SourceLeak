package burp;

import java.awt.Dimension;
import javax.swing.JPasswordField;

public class Ztln extends JPasswordField {
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztln.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */