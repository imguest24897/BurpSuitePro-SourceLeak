package burp;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public interface Zxjt extends Ze6r {
  public static final Zeu4<Zxjt> ZC;
  
  public static final String a;
  
  default void ZN(Zttl paramZttl) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  default Optional<Zm72> Zu(String paramString) {
    Objects.requireNonNull(Zm72.class);
    Objects.requireNonNull(Zm72.class);
    return ZHR().stream().filter(Zm72.class::isInstance).map(Zm72.class::cast).filter(paramString::lambda$getRecordedLoginSequencePortal$0).findFirst();
  }
  
  default void Zk(Zrp0 paramZrp0, Zszw paramZszw, Zlru paramZlru, Ztk0 paramZtk0, Zt1i paramZt1i, Zz1m<Zt35> paramZz1m, Zr69 paramZr69) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  default Collection<Zrp0> ZSA() {
    Zuh.Zb(false, Zqf.ZC);
    return null;
  }
  
  default long ZSE() {
    Zuh.Zb(false, Zqf.ZC);
    return 0L;
  }
  
  default String ZfT() {
    return a;
  }
  
  default List<Zski> ZBZ() {
    Objects.requireNonNull(Zs9a.class);
    Objects.requireNonNull(Zs9a.class);
    return ZHR().stream().filter(Zs9a.class::isInstance).map(Zs9a.class::cast).map(Zxss::ZFy).toList();
  }
  
  private static boolean lambda$getRecordedLoginSequencePortal$0(String paramString, Zm72 paramZm72) {
    return paramZm72.Zej().ZRc().equals(paramString);
  }
  
  static {
    // Byte code:
    //   0: bipush #60
    //   2: ldc 'Jg`-'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxjt.a : Ljava/lang/String;
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
    //   80: bipush #48
    //   82: goto -> 112
    //   85: bipush #52
    //   87: goto -> 112
    //   90: bipush #37
    //   92: goto -> 112
    //   95: bipush #116
    //   97: goto -> 112
    //   100: bipush #76
    //   102: goto -> 112
    //   105: bipush #65
    //   107: goto -> 112
    //   110: bipush #45
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
    //   154: new burp/Zkxf
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zxjt.ZC : Lburp/Zeu4;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxjt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */