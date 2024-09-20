package burp;

import java.awt.Window;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zr45 {
  private final Zt4u Zq;
  
  private final Zskh ZZ;
  
  private final Zl0 Zg;
  
  private Zbiw Zi;
  
  private Zbr9 Zn;
  
  private Zbr2 ZY;
  
  private Zbrq ZL;
  
  private static Zbqc[] ZR;
  
  private static final String a;
  
  public Zr45(Window paramWindow, Zt4u paramZt4u, Zskh paramZskh, Zl0 paramZl0) {
    this.Zq = paramZt4u;
    this.ZZ = paramZskh;
    this.Zg = paramZl0;
    this.Zn = new Zbr9(this);
    this.Zi = new Zl0a(paramWindow, a, 75, 25, this.Zn);
  }
  
  Zl04 ZT() {
    return this.Zi.Zu();
  }
  
  Zsic ZE(Zsic paramZsic) {
    if (paramZsic == this.ZY)
      return this.Zn; 
    if (paramZsic == this.ZL)
      return this.ZY; 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  Zsic Zs(Zsic paramZsic) {
    if (paramZsic == this.Zn) {
      this.ZY = new Zbr2(this.Zq, this, this.Zn);
      return this.ZY;
    } 
    if (paramZsic == this.ZY) {
      this.ZL = new Zbrq(this, this.Zn, this.ZY, this.ZZ, this.Zg);
      return this.ZL;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  public static void ZV(Zbqc[] paramArrayOfZbqc) {
    ZR = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zi() {
    return ZR;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zi : ()[Lburp/Zbqc;
    //   3: ifnonnull -> 13
    //   6: iconst_1
    //   7: anewarray burp/Zbqc
    //   10: invokestatic ZV : ([Lburp/Zbqc;)V
    //   13: bipush #62
    //   15: ldc '(Z:/=)'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zr45.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #106
    //   94: goto -> 124
    //   97: bipush #87
    //   99: goto -> 124
    //   102: bipush #68
    //   104: goto -> 124
    //   107: bipush #71
    //   109: goto -> 124
    //   112: bipush #78
    //   114: goto -> 124
    //   117: bipush #99
    //   119: goto -> 124
    //   122: bipush #84
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
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
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr45.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */