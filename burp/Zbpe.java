package burp;

import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zrzg;
import net.portswigger.browser.Zjb;
import net.portswigger.browser.Zts;
import net.portswigger.browser.service.Zi;

public class Zbpe {
  private Zg10 ZI;
  
  private static final String a;
  
  public boolean Zo(Zxei paramZxei, Zkl6 paramZkl6, Ztwv paramZtwv, Zrgd paramZrgd, Zrzg paramZrzg) {
    try {
      if (!paramZxei.Zu())
        return false; 
    } catch (Zts zts) {
      throw a(null);
    } 
    try {
      this.ZI = new Zrhn(paramZrgd, paramZkl6, paramZtwv);
      Ze_f.Z_().ZR(paramZrzg.Zc().toPath().resolve(a));
    } catch (Zts zts) {
      Zah.Zl((Throwable)zts, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZI.ZY();
      return false;
    } 
    return true;
  }
  
  public Zg10 Zl() {
    return this.ZI;
  }
  
  public static boolean Zb(Zra1 paramZra1, Zi paramZi, Set<Zjb> paramSet) {
    return (paramZra1 != Zra1.EXECUTION_MODE_ENTERPRISE_SERVER && ZQ(paramZi, paramSet));
  }
  
  private static boolean ZQ(Zi paramZi, Set<Zjb> paramSet) {
    return (!paramZi.equals(Zi.STANDALONE) || paramSet.contains(Zjb.Zr()));
  }
  
  private static Zts a(Zts paramZts) {
    return paramZts;
  }
  
  static {
    // Byte code:
    //   0: bipush #112
    //   2: ldc '54ZF\\b.n 2MD'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbpe.a : Ljava/lang/String;
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
    //   85: bipush #49
    //   87: goto -> 112
    //   90: bipush #88
    //   92: goto -> 112
    //   95: bipush #70
    //   97: goto -> 112
    //   100: bipush #26
    //   102: goto -> 112
    //   105: bipush #44
    //   107: goto -> 112
    //   110: bipush #113
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbpe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */