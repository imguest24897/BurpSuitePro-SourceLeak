package burp;

import javax.swing.tree.TreePath;

class Zm11 implements Runnable {
  final Zmai ZP;
  
  Zm11(Zmai paramZmai) {}
  
  public void run() {
    int[] arrayOfInt = Zgxf.ZV();
    for (TreePath treePath : this.ZP.Zl) {
      if (this.ZP.Zv(treePath))
        this.ZP.ZK.collapsePath(treePath); 
      if (arrayOfInt != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm11.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */