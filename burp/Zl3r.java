package burp;

import java.util.Objects;
import javax.swing.JTabbedPane;

public class Zl3r implements Zz9w {
  public boolean ZG(JTabbedPane paramJTabbedPane, int paramInt1, Zxer paramZxer, int paramInt2) {
    return Objects.equals(paramJTabbedPane, paramZxer) ? paramZxer.Zg(paramInt1, paramInt2) : false;
  }
  
  public boolean ZS(JTabbedPane paramJTabbedPane, int paramInt1, Zxer paramZxer, int paramInt2) {
    if (Objects.equals(paramJTabbedPane, paramZxer)) {
      paramZxer.ZO(paramInt1, paramInt2, true);
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl3r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */