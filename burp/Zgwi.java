package burp;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

class Zgwi implements TableCellRenderer {
  private static final Border Zd;
  
  private final TableCellRenderer Zt;
  
  private static final String a;
  
  Zgwi(TableCellRenderer paramTableCellRenderer) {
    this.Zt = paramTableCellRenderer;
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Component component = this.Zt.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    if (component instanceof JComponent) {
      JComponent jComponent = (JComponent)component;
      jComponent.putClientProperty(a, Boolean.TRUE);
      if (paramInt2 == 0)
        jComponent.setBorder(BorderFactory.createCompoundBorder(jComponent.getBorder(), Zd)); 
    } 
    component.setBackground(Zlkk.TABLE_HEADER_BACKGROUND.ZS());
    return component;
  }
  
  public void Ze(int paramInt) {
    if (this.Zt instanceof JLabel)
      ((JLabel)this.Zt).setHorizontalAlignment(paramInt); 
  }
  
  static {
    // Byte code:
    //   0: bipush #86
    //   2: ldc 'J0$^Y;Q%+^'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgwi.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #116
    //   82: goto -> 112
    //   85: bipush #18
    //   87: goto -> 112
    //   90: bipush #31
    //   92: goto -> 112
    //   95: bipush #100
    //   97: goto -> 112
    //   100: bipush #33
    //   102: goto -> 112
    //   105: bipush #9
    //   107: goto -> 112
    //   110: bipush #40
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: iconst_0
    //   155: iconst_5
    //   156: iconst_0
    //   157: iconst_0
    //   158: invokestatic createEmptyBorder : (IIII)Ljavax/swing/border/Border;
    //   161: putstatic burp/Zgwi.Zd : Ljavax/swing/border/Border;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgwi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */