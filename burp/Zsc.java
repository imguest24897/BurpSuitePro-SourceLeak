package burp;

import com.formdev.flatlaf.extras.components.FlatTriStateCheckBox;
import javax.swing.JComponent;

public class Zsc extends FlatTriStateCheckBox {
  private Zlkk Zx;
  
  private Zlkk Zf;
  
  private Zt00 Z_;
  
  private static final String a;
  
  public Zsc() {
    setFocusable(false);
    setIcon(new Zgld());
    putClientProperty(a, Boolean.TRUE);
  }
  
  public void updateUI() {
    super.updateUI();
    Zbp2.Zq((JComponent)this);
    if (this.Zx != null)
      setForeground(this.Zx.ZS()); 
    if (this.Zf != null)
      setBackground(this.Zf.ZS()); 
    if (this.Z_ != null)
      setFont(this.Z_.ZV()); 
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: ldc '-Q:4F6D\\fq'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsc.a : Ljava/lang/String;
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
    //   80: bipush #101
    //   82: goto -> 111
    //   85: iconst_5
    //   86: goto -> 111
    //   89: bipush #78
    //   91: goto -> 111
    //   94: bipush #93
    //   96: goto -> 111
    //   99: bipush #52
    //   101: goto -> 111
    //   104: bipush #112
    //   106: goto -> 111
    //   109: bipush #15
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */