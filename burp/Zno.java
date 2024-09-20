package burp;

import javax.accessibility.AccessibleContext;
import javax.swing.tree.TreeModel;

class Zno extends Zot {
  final Zg84 Zu;
  
  Zno(Zg84 paramZg84, TreeModel paramTreeModel) {
    super(paramTreeModel);
  }
  
  protected void Zr() {
    setRowHeight((int)(Zrt.Zx() * 1.7F));
  }
  
  public AccessibleContext getAccessibleContext() {
    return new Zrbt(super.getAccessibleContext());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zno.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */