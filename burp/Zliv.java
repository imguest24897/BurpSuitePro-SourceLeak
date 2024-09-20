package burp;

import javax.swing.SwingUtilities;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;

class Zliv implements TreeModelListener {
  final Zg84 Zt;
  
  private Zliv(Zg84 paramZg84) {}
  
  public void treeNodesChanged(TreeModelEvent paramTreeModelEvent) {}
  
  public void treeNodesInserted(TreeModelEvent paramTreeModelEvent) {
    SwingUtilities.invokeLater(this::lambda$treeNodesInserted$0);
  }
  
  public void treeNodesRemoved(TreeModelEvent paramTreeModelEvent) {
    SwingUtilities.invokeLater(this::lambda$treeNodesRemoved$1);
  }
  
  public void treeStructureChanged(TreeModelEvent paramTreeModelEvent) {}
  
  private void lambda$treeNodesRemoved$1() {
    this.Zt.ZX.Zf(this.Zt.Zv.getRowCount());
  }
  
  private void lambda$treeNodesInserted$0() {
    int i = this.Zt.Zv.getRowCount();
    if (i == 1) {
      this.Zt.Zv.expandRow(0);
      this.Zt.Zv.setSelectionRow(0);
    } 
    this.Zt.ZX.Zf(i);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zliv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */