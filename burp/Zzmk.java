package burp;

import com.formdev.flatlaf.ui.FlatSplitPaneUI;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;

public class Zzmk extends FlatSplitPaneUI {
  private final Zlkk ZE;
  
  public Zzmk(Zlkk paramZlkk) {
    this.ZE = paramZlkk;
  }
  
  public BasicSplitPaneDivider createDefaultDivider() {
    return (BasicSplitPaneDivider)new Zen7(this, (BasicSplitPaneUI)this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzmk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */