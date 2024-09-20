package burp;

import com.formdev.flatlaf.ui.FlatSplitPaneUI;
import java.awt.Graphics;
import javax.swing.plaf.basic.BasicSplitPaneUI;

class Zen7 extends FlatSplitPaneUI.FlatSplitPaneDivider {
  final Zzmk ZS;
  
  Zen7(Zzmk paramZzmk, BasicSplitPaneUI paramBasicSplitPaneUI) {
    super(paramZzmk, paramBasicSplitPaneUI);
  }
  
  protected void paintGrip(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Graphics graphics = paramGraphics.create();
    try {
      graphics.setColor(this.ZS.ZE.ZS());
      graphics.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
    } finally {
      graphics.dispose();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zen7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */