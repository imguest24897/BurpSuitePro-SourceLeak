package burp;

import java.util.Collection;
import java.util.Collections;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public interface Zgd4 extends Zeu9 {
  public static final Zeu4<Zgd4> ZN;
  
  public static final String a;
  
  default void ZR(Zsiv paramZsiv, Ztk0 paramZtk0, Zr69 paramZr69, Zz1m<Zt35> paramZz1m) {}
  
  default void Zp(Zsl5<?> paramZsl5) {}
  
  default void ZN(Zttl paramZttl) {
    Zuh.ZT(false, Zqf.ZC, getClass().getName());
  }
  
  default void Zk(Zrp0 paramZrp0, Zszw paramZszw, Zlru paramZlru, Ztk0 paramZtk0, Zt1i paramZt1i, Zz1m<Zt35> paramZz1m, Zr69 paramZr69) {}
  
  default Collection<Zrp0> ZSA() {
    return Collections.emptyList();
  }
  
  default void ZP(Zbj5 paramZbj5) {
    Zuh.ZT(false, Zqf.ZC, getClass().getName());
  }
  
  default long ZSE() {
    return 0L;
  }
  
  default boolean ZVL() {
    return false;
  }
  
  default String ZfT() {
    return a;
  }
  
  static {
    // Byte code:
    //   0: bipush #54
    //   2: ldc '#_Z'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgd4.a : Ljava/lang/String;
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
    //   80: bipush #83
    //   82: goto -> 112
    //   85: bipush #8
    //   87: goto -> 112
    //   90: bipush #86
    //   92: goto -> 112
    //   95: bipush #9
    //   97: goto -> 112
    //   100: bipush #41
    //   102: goto -> 112
    //   105: bipush #24
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
    //   154: new burp/Zkx8
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zgd4.ZN : Lburp/Zeu4;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgd4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */