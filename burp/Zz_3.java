package burp;

import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

class Zz_3<T> implements MutableTreeNode {
  private final List<TreeNode> Zq = new CopyOnWriteArrayList<>();
  
  private MutableTreeNode ZM = null;
  
  protected Object ZC = null;
  
  Zz_3(T paramT) {
    setUserObject(paramT);
  }
  
  public T Z_() {
    return (T)this.ZC;
  }
  
  public void insert(MutableTreeNode paramMutableTreeNode, int paramInt) {
    paramMutableTreeNode.setParent(this);
    this.Zq.add(paramInt, paramMutableTreeNode);
  }
  
  public void remove(int paramInt) {
    this.Zq.remove(paramInt);
  }
  
  public void remove(MutableTreeNode paramMutableTreeNode) {
    this.Zq.remove(paramMutableTreeNode);
  }
  
  public void setUserObject(Object paramObject) {
    try {
      if (paramObject == null)
        throw new InvalidParameterException(); 
    } catch (InvalidParameterException invalidParameterException) {
      throw a(null);
    } 
    this.ZC = paramObject;
  }
  
  public void removeFromParent() {
    this.ZM.remove(this);
  }
  
  public void setParent(MutableTreeNode paramMutableTreeNode) {
    this.ZM = paramMutableTreeNode;
  }
  
  public TreeNode getChildAt(int paramInt) {
    return this.Zq.get(paramInt);
  }
  
  public int getChildCount() {
    return this.Zq.size();
  }
  
  public TreeNode getParent() {
    return this.ZM;
  }
  
  public int getIndex(TreeNode paramTreeNode) {
    return this.Zq.indexOf(paramTreeNode);
  }
  
  public boolean getAllowsChildren() {
    return true;
  }
  
  public boolean isLeaf() {
    return this.Zq.isEmpty();
  }
  
  public Enumeration children() {
    return Collections.enumeration(this.Zq);
  }
  
  public TreeNode[] Zp() {
    return ZE(this, 0);
  }
  
  private static TreeNode[] ZE(TreeNode paramTreeNode, int paramInt) {
    TreeNode treeNode = paramTreeNode.getParent();
    if (treeNode == null) {
      TreeNode[] arrayOfTreeNode1 = new TreeNode[paramInt + 1];
      arrayOfTreeNode1[0] = paramTreeNode;
      return arrayOfTreeNode1;
    } 
    TreeNode[] arrayOfTreeNode = ZE(treeNode, paramInt + 1);
    arrayOfTreeNode[arrayOfTreeNode.length - paramInt - 1] = paramTreeNode;
    return arrayOfTreeNode;
  }
  
  public boolean Zp(Zz_3<T> paramZz_3) {
    try {
      if (this.ZM != null)
        try {
          if (this.ZM instanceof Zz_3) {
            try {
              if (this.ZM == paramZz_3)
                return true; 
            } catch (InvalidParameterException invalidParameterException) {
              throw a(null);
            } 
            return ((Zz_3<T>)this.ZM).Zp(paramZz_3);
          } 
          return false;
        } catch (InvalidParameterException invalidParameterException) {
          throw a(null);
        }  
    } catch (InvalidParameterException invalidParameterException) {
      throw a(null);
    } 
    return false;
  }
  
  private static InvalidParameterException a(InvalidParameterException paramInvalidParameterException) {
    return paramInvalidParameterException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz_3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */