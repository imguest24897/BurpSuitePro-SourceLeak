package burp;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.function.Function;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

class Ze7k implements CellEditorListener, PropertyChangeListener {
  private final Zbws Zm;
  
  private final Function<Integer, Zb6u> Zz;
  
  private final Zgtm Zi;
  
  private final int ZC;
  
  private final int Zf;
  
  private int ZI = -1;
  
  private static final String a;
  
  Ze7k(Zbws paramZbws, Function<Integer, Zb6u> paramFunction, Zgtm paramZgtm, Zlns paramZlns) {
    this.Zm = paramZbws;
    this.Zz = paramFunction;
    this.Zi = paramZgtm;
    this.ZC = paramZlns.ZX();
    this.Zf = paramZlns.ZE(Zm0m.VALUE);
  }
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    String str = Zbd7.ZE();
    boolean bool = (a.equals(paramPropertyChangeEvent.getPropertyName()) && !this.Zm.isEditing()) ? true : false;
    if (bool) {
      this.ZI = this.Zm.getEditingRow();
      if (str != null) {
        this.ZI = -1;
        return;
      } 
      return;
    } 
    this.ZI = -1;
  }
  
  public void editingStopped(ChangeEvent paramChangeEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getSource : ()Ljava/lang/Object;
    //   4: checkcast javax/swing/table/TableCellEditor
    //   7: astore_3
    //   8: aload_0
    //   9: getfield Zm : Lburp/Zbws;
    //   12: aload_0
    //   13: getfield ZI : I
    //   16: aload_0
    //   17: getfield ZC : I
    //   20: invokevirtual getValueAt : (II)Ljava/lang/Object;
    //   23: invokevirtual toString : ()Ljava/lang/String;
    //   26: astore #4
    //   28: invokestatic ZE : ()Ljava/lang/String;
    //   31: aload_0
    //   32: getfield Zm : Lburp/Zbws;
    //   35: aload_0
    //   36: getfield ZI : I
    //   39: aload_0
    //   40: getfield Zf : I
    //   43: invokevirtual getValueAt : (II)Ljava/lang/Object;
    //   46: invokevirtual toString : ()Ljava/lang/String;
    //   49: astore #5
    //   51: aload_3
    //   52: invokeinterface getCellEditorValue : ()Ljava/lang/Object;
    //   57: invokevirtual toString : ()Ljava/lang/String;
    //   60: astore #6
    //   62: astore_2
    //   63: aload_0
    //   64: getfield Zm : Lburp/Zbws;
    //   67: invokevirtual getSelectedColumn : ()I
    //   70: aload_0
    //   71: getfield ZC : I
    //   74: if_icmpne -> 108
    //   77: aload #4
    //   79: aload #6
    //   81: invokevirtual equals : (Ljava/lang/Object;)Z
    //   84: ifne -> 183
    //   87: aload_0
    //   88: getfield Zi : Lburp/Zgtm;
    //   91: aload_0
    //   92: getfield ZI : I
    //   95: aload #6
    //   97: aload #5
    //   99: invokeinterface Zr : (ILjava/lang/String;Ljava/lang/String;)V
    //   104: aload_2
    //   105: ifnull -> 183
    //   108: aload_0
    //   109: getfield Zm : Lburp/Zbws;
    //   112: invokevirtual getSelectedColumn : ()I
    //   115: aload_0
    //   116: getfield Zf : I
    //   119: if_icmpne -> 183
    //   122: aload #5
    //   124: aload #6
    //   126: invokevirtual equals : (Ljava/lang/Object;)Z
    //   129: ifne -> 183
    //   132: aload_0
    //   133: getfield Zz : Ljava/util/function/Function;
    //   136: aload_0
    //   137: getfield ZI : I
    //   140: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   143: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   148: checkcast burp/Zb6u
    //   151: getfield Zv : Lburp/Zeup;
    //   154: getfield initialTranscoder : Lburp/Zre8;
    //   157: astore #7
    //   159: aload_0
    //   160: getfield Zi : Lburp/Zgtm;
    //   163: aload_0
    //   164: getfield ZI : I
    //   167: aload #4
    //   169: aload #7
    //   171: aload #6
    //   173: invokeinterface ZI : (Ljava/lang/String;)Ljava/lang/String;
    //   178: invokeinterface Zr : (ILjava/lang/String;Ljava/lang/String;)V
    //   183: aload_0
    //   184: getfield Zm : Lburp/Zbws;
    //   187: invokevirtual transferFocus : ()V
    //   190: return
  }
  
  public void editingCanceled(ChangeEvent paramChangeEvent) {}
  
  static {
    // Byte code:
    //   0: bipush #122
    //   2: ldc '\\n;:/\\f6'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ze7k.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 104
    //   80: bipush #11
    //   82: goto -> 111
    //   85: bipush #17
    //   87: goto -> 111
    //   90: bipush #35
    //   92: goto -> 111
    //   95: iconst_3
    //   96: goto -> 111
    //   99: bipush #37
    //   101: goto -> 111
    //   104: bipush #22
    //   106: goto -> 111
    //   109: bipush #19
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze7k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */