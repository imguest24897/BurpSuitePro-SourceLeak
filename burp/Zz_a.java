package burp;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class Zz_a {
  public static Color Zo(JTable paramJTable, int paramInt) {
    TableModel tableModel = paramJTable.getModel();
    if (tableModel instanceof Zmiw) {
      Zmiw zmiw = (Zmiw)tableModel;
      int i = paramJTable.convertRowIndexToModel(paramInt);
      Zz_1 zz_1 = zmiw.Zs(i);
      if (zz_1 != null && zz_1.ZaP() == 0)
        return ((Zxya)zz_1.Z_()).ZH ? Zlkk.MAP_NODE_ERROR.ZS() : (zz_1.Zi() ? Zlkk.MAP_NODE_REQUESTED.ZS() : Zlkk.MAP_NODE_NOT_REQUESTED.ZS()); 
    } 
    return null;
  }
  
  public static void Zm(Component paramComponent, Zz_1 paramZz_1, Zl2z paramZl2z) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual Z_ : ()Ljava/lang/Object;
    //   8: checkcast burp/Zxya
    //   11: invokevirtual Zm : ()Lburp/Zstu;
    //   14: ifnull -> 115
    //   17: aload_0
    //   18: invokevirtual getBackground : ()Ljava/awt/Color;
    //   21: astore #4
    //   23: aload_2
    //   24: aload_1
    //   25: invokevirtual Z_ : ()Ljava/lang/Object;
    //   28: checkcast burp/Zxya
    //   31: getfield ZX : Lburp/Zez3;
    //   34: iconst_3
    //   35: invokevirtual ZD : (Lburp/Zez3;B)Z
    //   38: ifeq -> 53
    //   41: getstatic burp/Zlkk.COMPARER_MODIFIED : Lburp/Zlkk;
    //   44: invokevirtual ZS : ()Ljava/awt/Color;
    //   47: astore #4
    //   49: aload_3
    //   50: ifnonnull -> 109
    //   53: aload_2
    //   54: aload_1
    //   55: invokevirtual Z_ : ()Ljava/lang/Object;
    //   58: checkcast burp/Zxya
    //   61: getfield ZX : Lburp/Zez3;
    //   64: iconst_2
    //   65: invokevirtual ZD : (Lburp/Zez3;B)Z
    //   68: ifeq -> 83
    //   71: getstatic burp/Zlkk.COMPARER_ADDED : Lburp/Zlkk;
    //   74: invokevirtual ZS : ()Ljava/awt/Color;
    //   77: astore #4
    //   79: aload_3
    //   80: ifnonnull -> 109
    //   83: aload_2
    //   84: aload_1
    //   85: invokevirtual Z_ : ()Ljava/lang/Object;
    //   88: checkcast burp/Zxya
    //   91: getfield ZX : Lburp/Zez3;
    //   94: iconst_1
    //   95: invokevirtual ZD : (Lburp/Zez3;B)Z
    //   98: ifeq -> 109
    //   101: getstatic burp/Zlkk.COMPARER_DELETED : Lburp/Zlkk;
    //   104: invokevirtual ZS : ()Ljava/awt/Color;
    //   107: astore #4
    //   109: aload_0
    //   110: aload #4
    //   112: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   115: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz_a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */