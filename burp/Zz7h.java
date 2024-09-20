package burp;

import javax.swing.tree.TreePath;

class Zz7h implements Runnable {
  final Zm7z Zn;
  
  Zz7h(Zm7z paramZm7z) {}
  
  public void run() {
    int[] arrayOfInt = Zgxf.ZV();
    for (TreePath treePath : this.Zn.Zz) {
      if (this.Zn.Zc(treePath))
        this.Zn.Zp.expandPath(treePath); 
      if (arrayOfInt != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz7h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */