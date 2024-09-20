package burp;

import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;

class Zxdm implements TreeExpansionListener {
  final Zoy ZH;
  
  private Zxdm(Zoy paramZoy) {}
  
  public void treeExpanded(TreeExpansionEvent paramTreeExpansionEvent) {
    // Byte code:
    //   0: invokestatic ZY : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual getPath : ()Ljavax/swing/tree/TreePath;
    //   8: invokevirtual getLastPathComponent : ()Ljava/lang/Object;
    //   11: astore_3
    //   12: aload_3
    //   13: aload_0
    //   14: getfield ZH : Lburp/Zoy;
    //   17: getfield Zb : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   20: invokevirtual equals : (Ljava/lang/Object;)Z
    //   23: ifeq -> 38
    //   26: aload_0
    //   27: getfield ZH : Lburp/Zoy;
    //   30: iconst_1
    //   31: putfield Zs : Z
    //   34: aload_2
    //   35: ifnull -> 86
    //   38: aload_3
    //   39: aload_0
    //   40: getfield ZH : Lburp/Zoy;
    //   43: getfield ZL : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   46: invokevirtual equals : (Ljava/lang/Object;)Z
    //   49: ifeq -> 64
    //   52: aload_0
    //   53: getfield ZH : Lburp/Zoy;
    //   56: iconst_1
    //   57: putfield Zi : Z
    //   60: aload_2
    //   61: ifnull -> 86
    //   64: aload_3
    //   65: aload_0
    //   66: getfield ZH : Lburp/Zoy;
    //   69: getfield Zy : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   72: invokevirtual equals : (Ljava/lang/Object;)Z
    //   75: ifeq -> 86
    //   78: aload_0
    //   79: getfield ZH : Lburp/Zoy;
    //   82: iconst_1
    //   83: putfield ZI : Z
    //   86: return
  }
  
  public void treeCollapsed(TreeExpansionEvent paramTreeExpansionEvent) {
    // Byte code:
    //   0: invokestatic ZY : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual getPath : ()Ljavax/swing/tree/TreePath;
    //   8: invokevirtual getLastPathComponent : ()Ljava/lang/Object;
    //   11: astore_3
    //   12: aload_3
    //   13: aload_0
    //   14: getfield ZH : Lburp/Zoy;
    //   17: getfield Zb : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   20: invokevirtual equals : (Ljava/lang/Object;)Z
    //   23: ifeq -> 38
    //   26: aload_0
    //   27: getfield ZH : Lburp/Zoy;
    //   30: iconst_0
    //   31: putfield Zs : Z
    //   34: aload_2
    //   35: ifnull -> 86
    //   38: aload_3
    //   39: aload_0
    //   40: getfield ZH : Lburp/Zoy;
    //   43: getfield ZL : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   46: invokevirtual equals : (Ljava/lang/Object;)Z
    //   49: ifeq -> 64
    //   52: aload_0
    //   53: getfield ZH : Lburp/Zoy;
    //   56: iconst_0
    //   57: putfield Zi : Z
    //   60: aload_2
    //   61: ifnull -> 86
    //   64: aload_3
    //   65: aload_0
    //   66: getfield ZH : Lburp/Zoy;
    //   69: getfield Zy : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   72: invokevirtual equals : (Ljava/lang/Object;)Z
    //   75: ifeq -> 86
    //   78: aload_0
    //   79: getfield ZH : Lburp/Zoy;
    //   82: iconst_0
    //   83: putfield ZI : Z
    //   86: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxdm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */