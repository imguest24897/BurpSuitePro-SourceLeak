package burp;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Zt0u implements Zl7q {
  private final String Zu;
  
  private final int Zv;
  
  private final AtomicBoolean Zf;
  
  private final int Z_;
  
  private static final String b;
  
  private Zt0u(String paramString, int paramInt1, int paramInt2) {
    this.Zv = paramInt1;
    this.Zu = paramString;
    this.Z_ = paramInt2;
    this.Zf = new AtomicBoolean();
  }
  
  public String ZW() {
    return this.Zf.get() ? b : this.Zu;
  }
  
  public int Zs() {
    return this.Zv;
  }
  
  public int Zi() {
    return this.Z_;
  }
  
  public Duration ZE() {
    return Duration.of(100L, ChronoUnit.MILLIS);
  }
  
  public void ZB() {
    this.Zf.set(true);
  }
  
  public static Zl7q ZB(String paramString, int paramInt1, int paramInt2) {
    return new Zt0u(paramString, paramInt1, paramInt2);
  }
  
  static {
    // Byte code:
    //   0: bipush #52
    //   2: ldc 'GcG:$blWi'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zt0u.b : Ljava/lang/String;
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
    //   80: bipush #6
    //   82: goto -> 112
    //   85: bipush #57
    //   87: goto -> 112
    //   90: bipush #49
    //   92: goto -> 112
    //   95: bipush #111
    //   97: goto -> 112
    //   100: bipush #100
    //   102: goto -> 112
    //   105: bipush #53
    //   107: goto -> 112
    //   110: bipush #48
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt0u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */