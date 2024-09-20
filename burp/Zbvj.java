package burp;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.RenderingHints;

class Zbvj extends Zbqc {
  private static final RenderingHints Zm;
  
  private final Zm99 Zk;
  
  private static final String a;
  
  public Zbvj() {
    Zl(Zlkk.TASK_LIST_ENTRY_HOVER);
    setOpaque(false);
    setCursor(Cursor.getPredefinedCursor(13));
    setBorder(new Zxce(this));
    setLayout(new BorderLayout());
    this.Zk = new Zm99(a);
    this.Zk.ZE(Zt00.BOLD_FONT);
    add(this.Zk);
  }
  
  public void ZE(String paramString) {
    this.Zk.setText(paramString);
  }
  
  public void Zg(Point paramPoint) {
    char c = 'Ƥ';
    int i = (getPreferredSize()).height;
    setBounds(paramPoint.x - c / 2, paramPoint.y - i / 2, c, i);
    setVisible(true);
  }
  
  static {
    // Byte code:
    //   0: bipush #93
    //   2: ldc 'waY,k?HkG,`'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbvj.a : Ljava/lang/String;
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
    //   80: bipush #98
    //   82: goto -> 112
    //   85: bipush #89
    //   87: goto -> 112
    //   90: bipush #104
    //   92: goto -> 112
    //   95: bipush #29
    //   97: goto -> 112
    //   100: bipush #89
    //   102: goto -> 112
    //   105: bipush #117
    //   107: goto -> 112
    //   110: bipush #66
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
    //   154: new java/awt/RenderingHints
    //   157: dup
    //   158: getstatic java/awt/RenderingHints.KEY_ANTIALIASING : Ljava/awt/RenderingHints$Key;
    //   161: getstatic java/awt/RenderingHints.VALUE_ANTIALIAS_ON : Ljava/lang/Object;
    //   164: invokespecial <init> : (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
    //   167: putstatic burp/Zbvj.Zm : Ljava/awt/RenderingHints;
    //   170: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */