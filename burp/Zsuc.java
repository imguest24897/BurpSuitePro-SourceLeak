package burp;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class Zsuc implements TableModelListener {
  final int ZW;
  
  final Zsbp Zh;
  
  Zsuc(Zsbp paramZsbp, int paramInt) {}
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic Zb : (Ljavax/swing/event/TableModelEvent;)Z
    //   4: ifeq -> 36
    //   7: aload_0
    //   8: aload_0
    //   9: getfield ZW : I
    //   12: <illegal opcode> run : (Lburp/Zsuc;I)Ljava/lang/Runnable;
    //   17: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   20: aload_0
    //   21: getfield Zh : Lburp/Zsbp;
    //   24: getfield ZX : Lburp/Zbws;
    //   27: invokevirtual getModel : ()Ljavax/swing/table/TableModel;
    //   30: aload_0
    //   31: invokeinterface removeTableModelListener : (Ljavax/swing/event/TableModelListener;)V
    //   36: return
  }
  
  private void lambda$tableChanged$0(int paramInt) {
    this.Zh.ZX.setRowSelectionInterval(paramInt, paramInt);
    this.Zh.ZX.scrollRectToVisible(this.Zh.ZX.getCellRect(paramInt, 0, true));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsuc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */