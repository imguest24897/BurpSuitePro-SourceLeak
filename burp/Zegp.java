package burp;

import java.time.Duration;
import net.portswigger.Zce;
import net.portswigger.Zfc;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zup;

public class Zegp implements Zmnh {
  private static final String a;
  
  public void ZJ(Zg1c paramZg1c, Zup paramZup) {
    Zbqc[] arrayOfZbqc = Zkf1.ZA();
    if (paramZup.ZU.isEmpty())
      return; 
    if (paramZup.ZU.stream().allMatch(Zegp::lambda$processUpdateAvailable$0)) {
      System.out.println(a);
      if (arrayOfZbqc != null) {
        Zuh.Zb(false, Zqf.ZC);
        return;
      } 
      return;
    } 
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public Duration Zb() {
    return Duration.ofDays(1L);
  }
  
  public Duration Zq() {
    return Duration.ZERO;
  }
  
  private static boolean lambda$processUpdateAvailable$0(Zfc paramZfc) {
    return (paramZfc.Zq == Zce.DASTARDLY);
  }
  
  static {
    // Byte code:
    //   0: bipush #60
    //   2: ldc 'lF?jx@8YM?kgXZo?[Q0YM?v{8[IvsiF5H\\t?OdA8^M?o}H5\\r\wz(H8YMlk(R<_[vpf6K\\bkwm=BKtzz0@Ixz(P6\\r]o{iP<'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zegp.a : Ljava/lang/String;
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
    //   80: bipush #17
    //   82: goto -> 112
    //   85: bipush #20
    //   87: goto -> 112
    //   90: bipush #35
    //   92: goto -> 112
    //   95: bipush #35
    //   97: goto -> 112
    //   100: bipush #52
    //   102: goto -> 112
    //   105: bipush #24
    //   107: goto -> 112
    //   110: bipush #101
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zegp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */