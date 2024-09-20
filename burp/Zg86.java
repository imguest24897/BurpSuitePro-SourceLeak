package burp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;

public class Zg86 extends Zbqc {
  private final Zg8l Zn;
  
  private final Zl04 ZT;
  
  private static int[] Zl;
  
  private static final String a;
  
  public Zg86(Zg8l paramZg8l, Zl04 paramZl04) {
    this.Zn = paramZg8l;
    int[] arrayOfInt = ZQ();
    this.ZT = paramZl04;
    Z_();
    setLayout(new BorderLayout());
    paramZg8l.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    add(paramZg8l, a);
    ZA();
    paramZl04.addComponentListener(new Zlj1(this));
    if (Zbqc.Zwu() == null)
      Zb(new int[4]); 
  }
  
  private void ZA() {
    Dimension dimension = this.Zn.getPreferredSize();
    int i = this.ZT.getWidth() - dimension.width - 20;
    setBounds(i, 20, dimension.width, dimension.height);
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    int i = getHeight();
    paramGraphics.setColor(Zlkk.UPDATE_READY_PANEL_LEFT_BORDER.ZS());
    byte b = 4;
    boolean bool1 = false;
    boolean bool2 = false;
    paramGraphics.fillRect(bool1, bool2, b, i);
  }
  
  private void Z_() {
    setLayout(new BorderLayout());
  }
  
  public static void Zb(int[] paramArrayOfint) {
    Zl = paramArrayOfint;
  }
  
  public static int[] ZQ() {
    return Zl;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZQ : ()[I
    //   3: ifnull -> 12
    //   6: iconst_1
    //   7: newarray int
    //   9: invokestatic Zb : ([I)V
    //   12: bipush #52
    //   14: ldc '<\\t(Pa`'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Zg86.a : Ljava/lang/String;
    //   23: goto -> 166
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 140
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #75
    //   94: goto -> 124
    //   97: bipush #88
    //   99: goto -> 124
    //   102: bipush #114
    //   104: goto -> 124
    //   107: bipush #16
    //   109: goto -> 124
    //   112: bipush #48
    //   114: goto -> 124
    //   117: bipush #38
    //   119: goto -> 124
    //   122: bipush #12
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 47
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 44
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 20
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg86.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */