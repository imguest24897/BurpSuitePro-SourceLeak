package burp;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class Zedw extends DefaultListCellRenderer {
  private static final String a;
  
  public Zedw() {
    putClientProperty(a, Boolean.TRUE);
  }
  
  public Component getListCellRendererComponent(JList<?> paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    boolean bool = Zm99.ZM();
    if (paramBoolean1) {
      setForeground(Zlkk.SELECTION_FOREGROUND.ZS());
      if (!bool) {
        setForeground(Zlkk.FOREGROUND.ZS());
        return this;
      } 
      return this;
    } 
    setForeground(Zlkk.FOREGROUND.ZS());
    return this;
  }
  
  static {
    // Byte code:
    //   0: bipush #95
    //   2: ldc ';F32uZ% S<2>'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zedw.a : Ljava/lang/String;
    //   11: goto -> 151
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
    //   29: if_icmpgt -> 125
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 107, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 98, 5 -> 102
    //   80: bipush #12
    //   82: goto -> 109
    //   85: bipush #109
    //   87: goto -> 109
    //   90: iconst_1
    //   91: goto -> 109
    //   94: iconst_1
    //   95: goto -> 109
    //   98: iconst_4
    //   99: goto -> 109
    //   102: bipush #97
    //   104: goto -> 109
    //   107: bipush #19
    //   109: ixor
    //   110: ixor
    //   111: i2c
    //   112: castore
    //   113: iinc #0, 1
    //   116: dup
    //   117: ifne -> 125
    //   120: dup2
    //   121: dup_x1
    //   122: goto -> 35
    //   125: dup2_x1
    //   126: pop2
    //   127: dup_x2
    //   128: iload_0
    //   129: if_icmpgt -> 32
    //   132: pop
    //   133: new java/lang/String
    //   136: dup_x1
    //   137: swap
    //   138: invokespecial <init> : ([C)V
    //   141: invokevirtual intern : ()Ljava/lang/String;
    //   144: swap
    //   145: pop
    //   146: swap
    //   147: pop
    //   148: goto -> 8
    //   151: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */