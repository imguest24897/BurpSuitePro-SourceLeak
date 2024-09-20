package burp;

import burp.theme.RolloverTreeUI;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.plaf.TreeUI;

public class Zet0 extends Zet_ {
  public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4) {
    super.getTreeCellRendererComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
    Color color = paramJTree.getBackground();
    TreeUI treeUI = paramJTree.getUI();
    if (treeUI instanceof RolloverTreeUI) {
      RolloverTreeUI rolloverTreeUI = (RolloverTreeUI)treeUI;
      if (rolloverTreeUI.isRolloverRow(paramInt))
        color = Zlkk.ROLLOVER_BACKGROUND.ZS(); 
    } 
    setBackground(color);
    setBackgroundNonSelectionColor(color);
    setBorderSelectionColor(null);
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zet0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */