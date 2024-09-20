package burp;

import java.io.IOException;
import java.net.Socket;

public class Zmlo extends Zmj5 implements Zm7w {
  private static final String c;
  
  public Zmlo(Zbw_ paramZbw_, Zgb6 paramZgb6, Zrgd paramZrgd, Zkl6 paramZkl6) {
    super(paramZbw_, paramZgb6, paramZrgd, paramZkl6);
  }
  
  public void Zc(Zb2f paramZb2f, Zml3 paramZml3, Zi8 paramZi8) throws Zz8h, IOException, Zxgy, Zxg5 {
    ZK(paramZml3);
    ZY(paramZml3);
    ZA(paramZml3);
    Zt(paramZi8);
    ZI(paramZml3);
    ZR(paramZml3);
    ZL(paramZml3);
    ZT(paramZb2f);
  }
  
  private void ZA(Zml3 paramZml3) throws Zz8h {
    try {
      if (paramZml3.ZP(this.ZS, this.ZX) == null)
        throw new Zz8h(c); 
    } catch (Zz8h zz8h) {
      throw a(null);
    } 
  }
  
  private void Zt(Zi8 paramZi8) {
    if (paramZi8.Z_ != null)
      this.ZS = paramZi8.Z_; 
    if (paramZi8.ZU != 0)
      this.ZX = paramZi8.ZU; 
  }
  
  private void ZR(Zml3 paramZml3) throws Zz8e, IOException {
    if (this.Zx.Zu(this.ZS, this.ZX)) {
      Socket socket = paramZml3.Zu();
      throw new Zz8e(socket, socket.getInputStream(), socket.getOutputStream(), this.ZS, this.ZX);
    } 
  }
  
  private static Zz8h a(Zz8h paramZz8h) {
    return paramZz8h;
  }
  
  static {
    // Byte code:
    //   0: bipush #56
    //   2: ldc '%a\\r_\\tQcB*_\\tL*D?\\tX&'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmlo.c : Ljava/lang/String;
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
    //   80: bipush #73
    //   82: goto -> 112
    //   85: bipush #21
    //   87: goto -> 112
    //   90: bipush #102
    //   92: goto -> 112
    //   95: bipush #71
    //   97: goto -> 112
    //   100: bipush #88
    //   102: goto -> 112
    //   105: bipush #26
    //   107: goto -> 112
    //   110: bipush #123
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmlo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */