package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Objects;
import javax.swing.border.EmptyBorder;

public class Zbcr extends Zbqc {
  private static final String a;
  
  private Zbcr(Zvc paramZvc) {
    Zlkk zlkk = (paramZvc.ZK != null) ? paramZvc.ZK : Zlkk.EMPTY_PANEL_V2_BACKGROUND;
    Zl(zlkk);
    Zbup zbup = new Zbup();
    zbup.Zh(zlkk);
    zbup.setBorder(Zxt_.Zb);
    zbup.setHorizontalScrollBarPolicy(31);
    setLayout(ZP(paramZvc, zbup));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    (new int[5])[0] = 0;
    (new int[5])[1] = 30;
    (new int[5])[2] = 0;
    (new int[5])[3] = 20;
    (new int[5])[4] = 0;
    (new int[3])[0] = 0;
    (new int[3])[1] = 30;
    (new int[3])[2] = 0;
    gridBagLayout.rowHeights = (paramZvc.Zr != null) ? new int[5] : new int[3];
    Zbdp zbdp = new Zbdp(gridBagLayout, zbup);
    zbdp.Zl(zlkk);
    zbdp.setBorder(new EmptyBorder(10, 10, 10, 10));
    Zx0x zx0x = new Zx0x();
    zx0x.ZN(Zt00.LARGE_FONT);
    zx0x.Ze(Zlkk.SOLID_FOREGROUND);
    zx0x.Zx(zlkk);
    zx0x.setEditable(false);
    zx0x.setFocusable(false);
    zx0x.setBorder(Zxt_.Zb);
    zx0x.setText(paramZvc.ZR);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    zbdp.add(zx0x, gridBagConstraints);
    byte b = 2;
    if (paramZvc.Zr != null) {
      gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 2;
      gridBagConstraints.anchor = 21;
      zbdp.add(ZW(paramZvc.Zr), gridBagConstraints);
      b = 4;
    } 
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = b;
    gridBagConstraints.anchor = 21;
    zbdp.add(new Zm99(paramZvc.Zq.ZD()), gridBagConstraints);
    zbup.setViewportView(zbdp);
    add(zbup);
  }
  
  private static Zgs3 ZP(Zvc paramZvc, Zbup paramZbup) {
    return (paramZvc.Zm == -1) ? new Zgs3(paramZbup, 62) : new Zgs3(paramZbup, 62, paramZvc.Zm);
  }
  
  private Zm99 ZW(Zlar paramZlar) {
    Zm99 zm99 = new Zm99(a);
    zm99.Ze(Zlkk.LINK_FOREGROUND_2);
    zm99.ZE(Zt00.UNDERLINE_FONT);
    zm99.addMouseListener(new Ze42(this, paramZlar, zm99));
    return zm99;
  }
  
  public static Zvc Zw(String paramString, Zgzq paramZgzq) {
    Objects.requireNonNull(paramString);
    Objects.requireNonNull(paramZgzq);
    return new Zvc(paramString, paramZgzq);
  }
  
  static {
    // Byte code:
    //   0: bipush #123
    //   2: ldc '\\bY9T&\\f'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbcr.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #50
    //   82: goto -> 111
    //   85: iconst_2
    //   86: goto -> 111
    //   89: bipush #18
    //   91: goto -> 111
    //   94: bipush #80
    //   96: goto -> 111
    //   99: bipush #44
    //   101: goto -> 111
    //   104: bipush #89
    //   106: goto -> 111
    //   109: bipush #66
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */