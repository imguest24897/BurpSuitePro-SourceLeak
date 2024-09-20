package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zl5r implements Runnable {
  private final JFrame ZY;
  
  private static final String a;
  
  public Zl5r(JFrame paramJFrame) {
    this.ZY = paramJFrame;
  }
  
  public void run() {
    Zbqc zbqc = new Zbqc();
    zbqc.setOpaque(false);
    int[] arrayOfInt = Zkro.ZcN();
    Zm99 zm99 = new Zm99(a);
    zm99.Ze(Zlkk.BURP_ERROR);
    zm99.ZE(Zt00.VERY_LARGE_FONT);
    GridBagLayout gridBagLayout = new GridBagLayout();
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.anchor = 10;
    gridBagConstraints.insets = new Insets(0, 0, this.ZY.getHeight() / 2, 0);
    zbqc.setLayout(gridBagLayout);
    zbqc.add(zm99, gridBagConstraints);
    Component component = this.ZY.getGlassPane();
    this.ZY.setGlassPane(zbqc);
    try {
      byte b = 0;
      while (b < 3) {
        Thread.sleep(800L);
        zbqc.setVisible(true);
        Thread.sleep(800L);
        zbqc.setVisible(false);
        b++;
        if (arrayOfInt == null)
          break; 
      } 
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.UNEXPECTED);
    } 
    this.ZY.setGlassPane(component);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: ldc 'j5jrEWh3gpUYa;'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zl5r.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #33
    //   82: goto -> 112
    //   85: bipush #127
    //   87: goto -> 112
    //   90: bipush #72
    //   92: goto -> 112
    //   95: bipush #66
    //   97: goto -> 112
    //   100: bipush #39
    //   102: goto -> 112
    //   105: bipush #21
    //   107: goto -> 112
    //   110: bipush #16
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl5r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */