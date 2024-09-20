package burp;

import java.awt.Color;
import java.util.Locale;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Zr52 {
  private static final Locale Zk = Locale.getDefault();
  
  public static Border Zr(String paramString) {
    return (paramString == null) ? null : UIManager.getBorder(paramString, Zk);
  }
  
  public static Color Zg(String paramString) {
    return (paramString == null) ? null : UIManager.getColor(paramString, Zk);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr52.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */