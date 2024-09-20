package burp;

import java.time.Duration;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsm7 {
  private static final Duration ZS;
  
  private static final Duration Z_;
  
  private static final Duration Zb;
  
  final boolean Zp;
  
  private final Duration Zt;
  
  private static final String a;
  
  public Zsm7(Duration paramDuration, boolean paramBoolean) {
    this.Zt = paramDuration;
    this.Zp = paramBoolean;
  }
  
  public Duration Zb() {
    return this.Zt;
  }
  
  public Duration Zh(Duration paramDuration) {
    Duration duration = this.Zt.plus(ZS).plus(paramDuration);
    if (duration.toMillis() < 0L || duration.toMillis() > Zb.toMillis()) {
      Zuh.ZT(false, Zqf.Zk, String.format(a, new Object[] { Long.valueOf(Zb().toMillis()), Long.valueOf(ZS.toMillis()), Long.valueOf(paramDuration.toMillis()), Long.valueOf(duration.toMillis()) }));
      return Z_;
    } 
    return duration;
  }
  
  static {
    // Byte code:
    //   0: bipush #82
    //   2: ldc 'g5PdS#0'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsm7.a : Ljava/lang/String;
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
    //   80: bipush #101
    //   82: goto -> 112
    //   85: bipush #81
    //   87: goto -> 112
    //   90: bipush #71
    //   92: goto -> 112
    //   95: bipush #39
    //   97: goto -> 112
    //   100: bipush #34
    //   102: goto -> 112
    //   105: bipush #22
    //   107: goto -> 112
    //   110: bipush #110
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
    //   154: ldc2_w 2
    //   157: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   160: putstatic burp/Zsm7.ZS : Ljava/time/Duration;
    //   163: ldc2_w 60
    //   166: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   169: putstatic burp/Zsm7.Z_ : Ljava/time/Duration;
    //   172: lconst_1
    //   173: invokestatic ofHours : (J)Ljava/time/Duration;
    //   176: putstatic burp/Zsm7.Zb : Ljava/time/Duration;
    //   179: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsm7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */