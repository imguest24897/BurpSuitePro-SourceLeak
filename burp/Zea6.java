package burp;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class Zea6 implements TableModelListener {
  final int ZT;
  
  final Zb5s ZY;
  
  Zea6(Zb5s paramZb5s, int paramInt) {}
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getType : ()I
    //   4: ifne -> 55
    //   7: aload_1
    //   8: invokevirtual getFirstRow : ()I
    //   11: ifne -> 55
    //   14: aload_1
    //   15: invokevirtual getLastRow : ()I
    //   18: ldc 2147483647
    //   20: if_icmpne -> 55
    //   23: aload_1
    //   24: invokevirtual getColumn : ()I
    //   27: iconst_m1
    //   28: if_icmpne -> 55
    //   31: aload_0
    //   32: aload_0
    //   33: getfield ZT : I
    //   36: <illegal opcode> run : (Lburp/Zea6;I)Ljava/lang/Runnable;
    //   41: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   44: aload_0
    //   45: getfield ZY : Lburp/Zb5s;
    //   48: getfield Zn : Lburp/Zmif;
    //   51: aload_0
    //   52: invokevirtual removeTableModelListener : (Ljavax/swing/event/TableModelListener;)V
    //   55: return
  }
  
  private void lambda$tableChanged$0(int paramInt) {
    this.ZY.ZC.changeSelection(this.ZY.ZC.convertRowIndexToView(paramInt), -1, false, false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zea6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */