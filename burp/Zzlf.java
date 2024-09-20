package burp;

import java.util.Arrays;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

class Zzlf implements TreeSelectionListener {
  final Zl4w Zi;
  
  private Zzlf(Zl4w paramZl4w) {}
  
  public void valueChanged(TreeSelectionEvent paramTreeSelectionEvent) {
    Zbqc[] arrayOfZbqc = Zl4w.ZS();
    TreePath treePath = paramTreeSelectionEvent.getNewLeadSelectionPath();
    if (treePath == null) {
      this.Zi.Zy = null;
      if (arrayOfZbqc != null) {
        if (Zs(treePath)) {
          this.Zi.Zy = treePath;
          DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.Zi.Zy.getLastPathComponent();
          Zg3w zg3w = (Zg3w)defaultMutableTreeNode.getUserObject();
          this.Zi.Zi.ZP(zg3w.ZU());
          this.Zi.Zo.ZK((String[])Arrays.stream(Arrays.copyOfRange(this.Zi.Zy.getPath(), 1, (this.Zi.Zy.getPath()).length)).map(String::valueOf).toArray(Zzlf::lambda$valueChanged$0));
        } 
        this.Zi.ZI.clearSelection();
        return;
      } 
      return;
    } 
    if (Zs(treePath)) {
      this.Zi.Zy = treePath;
      DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.Zi.Zy.getLastPathComponent();
      Zg3w zg3w = (Zg3w)defaultMutableTreeNode.getUserObject();
      this.Zi.Zi.ZP(zg3w.ZU());
      this.Zi.Zo.ZK((String[])Arrays.stream(Arrays.copyOfRange(this.Zi.Zy.getPath(), 1, (this.Zi.Zy.getPath()).length)).map(String::valueOf).toArray(Zzlf::lambda$valueChanged$0));
    } 
    this.Zi.ZI.clearSelection();
  }
  
  private boolean Zs(TreePath paramTreePath) {
    if (paramTreePath == null)
      return false; 
    TreeNode treeNode = (TreeNode)paramTreePath.getLastPathComponent();
    return (treeNode != this.Zi.Zn.getRoot() && treeNode.isLeaf());
  }
  
  private static String[] lambda$valueChanged$0(int paramInt) {
    return new String[paramInt];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzlf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */