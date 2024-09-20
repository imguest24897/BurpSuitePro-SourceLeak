package burp.theme;

import com.formdev.flatlaf.ui.FlatTabbedPaneUI;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import javax.swing.event.PopupMenuListener;

class BurpOverflowTabbedPaneUI$MoreTabsButton extends FlatTabbedPaneUI.FlatMoreTabsButton {
  final BurpOverflowTabbedPaneUI this$0;
  
  private BurpOverflowTabbedPaneUI$MoreTabsButton() {
    super(paramBurpOverflowTabbedPaneUI);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    int i = BurpTableUI.ZL();
    if (BurpOverflowTabbedPaneUI.access$2500(BurpOverflowTabbedPaneUI.this) == null)
      return; 
    if (BurpOverflowTabbedPaneUI.this.tabbedPane.ZO() == -1) {
      super.actionPerformed(paramActionEvent);
      return;
    } 
    JPopupMenu jPopupMenu = new JPopupMenu();
    jPopupMenu.addPopupMenuListener((PopupMenuListener)this);
    int j = BurpOverflowTabbedPaneUI.this.tabbedPane.Zy();
    while (j < (BurpOverflowTabbedPaneUI.access$2600(BurpOverflowTabbedPaneUI.this)).length) {
      if (j != BurpOverflowTabbedPaneUI.this.tabbedPane.ZO())
        jPopupMenu.add(createTabMenuItem(j)); 
      j++;
      if (i == 0)
        break; 
    } 
    jPopupMenu.show((Component)this, getWidth() - (jPopupMenu.getPreferredSize()).width, getHeight());
  }
  
  protected void selectTab(int paramInt) {
    super.selectTab(paramInt);
    BurpOverflowTabbedPaneUI.this.tabbedPane.Zg(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpOverflowTabbedPaneUI$MoreTabsButton.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */