package burp;

import java.util.Collections;
import java.util.List;

public class Zgdo implements Zka2 {
  private final Zl2k Zb;
  
  private final Zli8 Zg;
  
  private static final String a;
  
  public Zgdo(Zl2k paramZl2k, Zli8 paramZli8) {
    this.Zb = paramZl2k;
    this.Zg = paramZli8;
  }
  
  public Zm0f ZF(Zl_ paramZl_, Zlru paramZlru, Ztpx paramZtpx) {
    Zmrv zmrv = this.Zb.ZJ(paramZl_, paramZlru, paramZtpx);
    Zlat zlat = zmrv.ZHZ();
    List<Zg8y> list = Zf(zlat);
    return Zm0f.Zd(Zz36.Zc(zmrv), zlat, list);
  }
  
  public Zm0f ZU(Zgyy paramZgyy, Zlru paramZlru, Ztpx paramZtpx) {
    Zlvj zlvj = paramZgyy.<Zlvj>ZJ(new Zr0e(this));
    Zlat zlat = this.Zb.ZC(zlvj, paramZlru, paramZtpx);
    Zmrv zmrv = new Zmrv(zlvj, zlat);
    List<Zg8y> list = Zf(zlat);
    return Zm0f.Zd(Zz36.Zc(zmrv), zlat, list);
  }
  
  private List<Zg8y> Zf(Zlat paramZlat) {
    return (paramZlat.Zu() != null) ? Collections.emptyList() : this.Zg.Zh(paramZlat.ZO(), paramZlat.ZE());
  }
  
  public void ZM() {
    this.Zb.Zk();
  }
  
  public void ZW() {}
  
  public String toString() {
    return a;
  }
  
  static {
    // Byte code:
    //   0: bipush #53
    //   2: ldc '^UC-5~u\V51'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgdo.a : Ljava/lang/String;
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
    //   80: bipush #39
    //   82: goto -> 112
    //   85: bipush #86
    //   87: goto -> 112
    //   90: bipush #7
    //   92: goto -> 112
    //   95: bipush #23
    //   97: goto -> 112
    //   100: bipush #123
    //   102: goto -> 112
    //   105: bipush #121
    //   107: goto -> 112
    //   110: bipush #10
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgdo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */