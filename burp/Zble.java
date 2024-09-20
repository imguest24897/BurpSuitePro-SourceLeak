package burp;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class Zble extends DefaultMutableTreeNode {
  private static int Zl;
  
  public Zble() {
    this((Zmnm)null);
  }
  
  public Zble(Zmnm paramZmnm) {
    setUserObject(paramZmnm);
  }
  
  public Zble Zw() {
    return (Zble)this.parent;
  }
  
  public List<Zble> ZT() {
    Objects.requireNonNull(Zble.class);
    return (this.children == null) ? Collections.<Zble>emptyList() : this.children.stream().map(Zble.class::cast).toList();
  }
  
  public void setUserObject(Object paramObject) {
    super.setUserObject(paramObject);
  }
  
  public Zmnm Zb() {
    return (Zmnm)super.getUserObject();
  }
  
  public Zmnm Zg() {
    return Zb();
  }
  
  public String toString() {
    return Objects.toString(Zg());
  }
  
  public static void ZZ(int paramInt) {
    Zl = paramInt;
  }
  
  public static int ZI() {
    return Zl;
  }
  
  public static int Zr() {
    int i = ZI();
    return (i == 0) ? 94 : 0;
  }
  
  static {
    if (ZI() != 0)
      ZZ(114); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zble.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */