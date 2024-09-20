package burp;

import java.awt.Window;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zmps {
  private final Zte ZW;
  
  private final Zk70 ZQ;
  
  private final Zl04 Zo;
  
  private final Zbrr ZC;
  
  private Zbrt Zl;
  
  private static final String a;
  
  Zmps(Window paramWindow, Zte paramZte, Zk70 paramZk70) {
    this.ZW = paramZte;
    this.ZQ = paramZk70;
    this.ZC = new Zbrr(this, paramZk70);
    this.Zo = new Zl0a(paramWindow, a, 75, 25, this.ZC);
  }
  
  Zl04 Za() {
    return this.Zo;
  }
  
  void Zb(Zk70 paramZk70) {
    this.ZW.Zj(paramZk70);
  }
  
  Zsic ZW(Zsic paramZsic) {
    if (paramZsic == this.Zl)
      return this.ZC; 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  Zsic Zd(Zsic paramZsic) {
    if (paramZsic == this.ZC) {
      if (this.Zl == null)
        this.Zl = new Zbrt(this, this.ZQ); 
      return this.Zl;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  static {
    // Byte code:
    //   0: bipush #46
    //   2: ldc 'FFg5p{+'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmps.a : Ljava/lang/String;
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
    //   80: bipush #59
    //   82: goto -> 112
    //   85: bipush #11
    //   87: goto -> 112
    //   90: bipush #33
    //   92: goto -> 112
    //   95: bipush #64
    //   97: goto -> 112
    //   100: bipush #65
    //   102: goto -> 112
    //   105: bipush #110
    //   107: goto -> 112
    //   110: bipush #65
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
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmps.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */