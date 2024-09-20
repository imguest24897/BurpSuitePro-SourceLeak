package burp;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.SwingUtilities;

class Zx55 implements PropertyChangeListener {
  private int ZT;
  
  private boolean ZM;
  
  final Zbgo ZC;
  
  private static final String a;
  
  private Zx55(Zbgo paramZbgo) {}
  
  void ZR() {
    if (this.ZC.ZA.getWidth() == 0) {
      SwingUtilities.invokeLater(this::ZR);
      return;
    } 
    int i = (this.ZM && this.ZT > 0) ? this.ZT : this.ZC.ZU.Zd();
    int j = this.ZC.Z_(i);
    this.ZC.ZA.setDividerLocation(j);
    this.ZC.ZA.ZF(this.ZM);
  }
  
  public void Zd(boolean paramBoolean) {
    this.ZM = paramBoolean;
    ZR();
  }
  
  public void Zc(Zrpp paramZrpp) {
    if (this.ZC.Zu != paramZrpp) {
      this.ZC.Zu = paramZrpp;
      this.ZC.ZQ();
    } 
  }
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (!a.equals(paramPropertyChangeEvent.getPropertyName()))
      return; 
    int i = this.ZC.ZA.getDividerLocation();
    if (this.ZM && i > 0) {
      int j = (this.ZC.Zu == Zrpp.LEFT) ? i : (this.ZC.ZA.getWidth() - this.ZC.ZA.getDividerSize() - i);
      this.ZT = Math.max(j, this.ZC.ZU.Zd());
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #86
    //   2: ldc 'A>48UGi8!0EZK'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zx55.a : Ljava/lang/String;
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
    //   80: bipush #115
    //   82: goto -> 111
    //   85: iconst_1
    //   86: goto -> 111
    //   89: bipush #20
    //   91: goto -> 111
    //   94: bipush #7
    //   96: goto -> 111
    //   99: bipush #103
    //   101: goto -> 111
    //   104: bipush #42
    //   106: goto -> 111
    //   109: bipush #99
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx55.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */