package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Zbqg extends Zbqc {
  private Zm99 Zi;
  
  private Zx0x ZG;
  
  private static final String a;
  
  public Zbqg(Zg98 paramZg98) {
    Zc();
    Ze9n ze9n = Ze3m.ZC(Zeuf.JAVA, Zlkk.ICON_NORMAL).ZU(Zmcx.TWO_LINES_SIZE).Z_();
    this.Zi.setIcon(ze9n);
    this.ZG.Zx(Zlkk.PANEL_BACKGROUND);
    this.ZG.setText(paramZg98.Zx());
    this.ZG.addHyperlinkListener(new Zew1(this, paramZg98.Zq()));
    this.ZG.setFocusable(false);
  }
  
  private void Zc() {
    this.Zi = new Zm99();
    this.ZG = new Zx0x();
    setLayout(new GridBagLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 5, 0, 0);
    add(this.Zi, gridBagConstraints);
    this.ZG.setEditable(false);
    this.ZG.setContentType(a);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    add(this.ZG, gridBagConstraints);
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: ldc 'zCm6DMfcJ'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbqg.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_3
    //   81: goto -> 111
    //   84: bipush #43
    //   86: goto -> 111
    //   89: bipush #24
    //   91: goto -> 111
    //   94: bipush #79
    //   96: goto -> 111
    //   99: bipush #102
    //   101: goto -> 111
    //   104: bipush #40
    //   106: goto -> 111
    //   109: bipush #31
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbqg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */