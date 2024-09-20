package burp;

import javax.swing.tree.TreeModel;

class Zo5 extends Zot {
  Zo5(TreeModel paramTreeModel) {
    super(paramTreeModel);
    setRootVisible(false);
    setToggleClickCount(1);
    setCellRenderer(new Zet4());
    getSelectionModel().setSelectionMode(1);
  }
  
  protected void Zr() {
    setRowHeight((int)(Zrt.Zx() + 10.0F));
  }
  
  void Zp() {
    Z_(true);
  }
  
  void Zs() {
    Z_(false);
  }
  
  private void Z_(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield treeModel : Ljavax/swing/tree/TreeModel;
    //   4: invokeinterface getRoot : ()Ljava/lang/Object;
    //   9: checkcast javax/swing/tree/DefaultMutableTreeNode
    //   12: astore_3
    //   13: invokestatic ZS : ()[Lburp/Zbqc;
    //   16: aload_3
    //   17: invokevirtual children : ()Ljava/util/Enumeration;
    //   20: astore #4
    //   22: astore_2
    //   23: aload #4
    //   25: invokeinterface hasMoreElements : ()Z
    //   30: ifeq -> 101
    //   33: aload #4
    //   35: invokeinterface nextElement : ()Ljava/lang/Object;
    //   40: checkcast javax/swing/tree/TreeNode
    //   43: astore #5
    //   45: aload #5
    //   47: invokeinterface isLeaf : ()Z
    //   52: ifne -> 97
    //   55: new javax/swing/tree/TreePath
    //   58: dup
    //   59: iconst_2
    //   60: anewarray java/lang/Object
    //   63: dup
    //   64: iconst_0
    //   65: aload_3
    //   66: aastore
    //   67: dup
    //   68: iconst_1
    //   69: aload #5
    //   71: aastore
    //   72: invokespecial <init> : ([Ljava/lang/Object;)V
    //   75: astore #6
    //   77: iload_1
    //   78: ifeq -> 91
    //   81: aload_0
    //   82: aload #6
    //   84: invokevirtual expandPath : (Ljavax/swing/tree/TreePath;)V
    //   87: aload_2
    //   88: ifnull -> 97
    //   91: aload_0
    //   92: aload #6
    //   94: invokevirtual collapsePath : (Ljavax/swing/tree/TreePath;)V
    //   97: aload_2
    //   98: ifnull -> 23
    //   101: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zo5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */