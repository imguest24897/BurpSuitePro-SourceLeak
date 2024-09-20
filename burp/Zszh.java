package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

public class Zszh extends Zszq {
  private static final String a;
  
  public Zszh(Component paramComponent, String paramString) {
    this.Zx = paramComponent;
    this.ZV = paramString;
  }
  
  Zszh(String paramString) {
    this.ZV = paramString;
  }
  
  protected static Zbqc ZO(Zrx6[] paramArrayOfZrx6) {
    return Zg(paramArrayOfZrx6, 30);
  }
  
  protected static Zbqc Zg(Zrx6[] paramArrayOfZrx6, int paramInt) {
    Zbqc zbqc1 = new Zbqc();
    zbqc1.setLayout(new BorderLayout());
    Zbqc zbqc2 = new Zbqc();
    zbqc2.setLayout(new BoxLayout(zbqc2, 1));
    String[] arrayOfString = Zbv5.ZvS();
    zbqc2.setBorder(new EmptyBorder(new Insets(10, 10, paramInt, 10)));
    byte b = 0;
    while (b < paramArrayOfZrx6.length) {
      if (paramArrayOfZrx6[b] != null) {
        zbqc2.add(paramArrayOfZrx6[b].Zz());
        if (b + 1 < paramArrayOfZrx6.length) {
          zbqc2.add(Box.createVerticalStrut(15));
          zbqc2.add(new JSeparator());
          zbqc2.add(Box.createVerticalStrut(20));
        } 
      } 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    zbqc1.add(zbqc2, a);
    return zbqc1;
  }
  
  static {
    // Byte code:
    //   0: bipush #45
    //   2: ldc 'l];'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zszh.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #120
    //   82: goto -> 111
    //   85: bipush #46
    //   87: goto -> 111
    //   90: iconst_2
    //   91: goto -> 111
    //   94: bipush #86
    //   96: goto -> 111
    //   99: bipush #126
    //   101: goto -> 111
    //   104: bipush #79
    //   106: goto -> 111
    //   109: bipush #76
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zszh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */