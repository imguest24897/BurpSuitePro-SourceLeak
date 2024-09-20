package burp;

import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

final class Zel8 extends Record implements ListSelectionListener {
  private final ListModel<Zx02> Zv;
  
  private final ListSelectionModel Zs;
  
  private final Zl5i Zk;
  
  private Zel8(ListModel<Zx02> paramListModel, ListSelectionModel paramListSelectionModel, Zl5i paramZl5i) {
    this.Zv = paramListModel;
    this.Zs = paramListSelectionModel;
    this.Zk = paramZl5i;
  }
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    // Byte code:
    //   0: invokestatic ZH : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zs : Ljavax/swing/ListSelectionModel;
    //   8: invokeinterface isSelectionEmpty : ()Z
    //   13: ifeq -> 30
    //   16: aload_0
    //   17: getfield Zk : Lburp/Zl5i;
    //   20: ldc ''
    //   22: iconst_0
    //   23: invokevirtual Zz : (Ljava/lang/String;Z)V
    //   26: aload_2
    //   27: ifnull -> 91
    //   30: aload_0
    //   31: getfield Zk : Lburp/Zl5i;
    //   34: invokevirtual Zi1 : ()I
    //   37: ifeq -> 53
    //   40: aload_0
    //   41: getfield Zs : Ljavax/swing/ListSelectionModel;
    //   44: invokeinterface getSelectedItemsCount : ()I
    //   49: iconst_1
    //   50: if_icmpne -> 91
    //   53: aload_0
    //   54: getfield Zs : Ljavax/swing/ListSelectionModel;
    //   57: invokeinterface getMinSelectionIndex : ()I
    //   62: istore_3
    //   63: aload_0
    //   64: getfield Zv : Ljavax/swing/ListModel;
    //   67: iload_3
    //   68: invokeinterface getElementAt : (I)Ljava/lang/Object;
    //   73: checkcast burp/Zx02
    //   76: astore #4
    //   78: aload_0
    //   79: getfield Zk : Lburp/Zl5i;
    //   82: aload #4
    //   84: invokevirtual ZtQ : ()Ljava/lang/String;
    //   87: iconst_0
    //   88: invokevirtual Zz : (Ljava/lang/String;Z)V
    //   91: return
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zel8;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zel8;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zel8;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zel8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */