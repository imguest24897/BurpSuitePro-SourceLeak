package burp;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class Zxle implements TableModelListener {
  private final Zmyz Zl;
  
  private int ZM;
  
  private Zxle(Zmyz paramZmyz) {
    this.Zl = paramZmyz;
    this.ZM = paramZmyz.getDividerLocation();
  }
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    // Byte code:
    //   0: invokestatic ZX : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zl : Lburp/Zmyz;
    //   8: invokevirtual getBottomComponent : ()Ljava/awt/Component;
    //   11: invokevirtual isVisible : ()Z
    //   14: ifeq -> 32
    //   17: aload_0
    //   18: aload_0
    //   19: getfield Zl : Lburp/Zmyz;
    //   22: invokevirtual getDividerLocation : ()I
    //   25: putfield ZM : I
    //   28: iload_2
    //   29: ifeq -> 43
    //   32: aload_0
    //   33: getfield Zl : Lburp/Zmyz;
    //   36: aload_0
    //   37: getfield ZM : I
    //   40: invokevirtual setDividerLocation : (I)V
    //   43: aload_1
    //   44: invokevirtual getSource : ()Ljava/lang/Object;
    //   47: checkcast javax/swing/table/TableModel
    //   50: astore_3
    //   51: aload_3
    //   52: invokeinterface getRowCount : ()I
    //   57: ifle -> 64
    //   60: iconst_1
    //   61: goto -> 65
    //   64: iconst_0
    //   65: istore #4
    //   67: aload_0
    //   68: getfield Zl : Lburp/Zmyz;
    //   71: iload #4
    //   73: invokevirtual Zl : (Z)V
    //   76: aload_0
    //   77: getfield Zl : Lburp/Zmyz;
    //   80: invokevirtual getBottomComponent : ()Ljava/awt/Component;
    //   83: iload #4
    //   85: invokevirtual setVisible : (Z)V
    //   88: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxle.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */