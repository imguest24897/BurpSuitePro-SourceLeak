package burp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zzjr extends Zzjg {
  private static final Pattern Zu;
  
  private final boolean ZX;
  
  private final int ZP;
  
  public Zzjr(String paramString) {
    String str1 = Zq(paramString);
    String str2 = ZY(str1, Zu);
    Matcher matcher = Zm6r.ZS.matcher(str2);
    this.ZX = matcher.find();
    String str3 = ZK(matcher.replaceAll(""));
    this.ZP = ZH(str3);
  }
  
  public boolean Zx() {
    return false;
  }
  
  public boolean Zg() {
    return this.ZX;
  }
  
  public int ZT() {
    return this.ZP;
  }
  
  static {
    // Byte code:
    //   0: bipush #47
    //   2: ldc 'h/c'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #25
    //   82: goto -> 112
    //   85: bipush #105
    //   87: goto -> 112
    //   90: bipush #42
    //   92: goto -> 112
    //   95: bipush #104
    //   97: goto -> 112
    //   100: bipush #120
    //   102: goto -> 112
    //   105: bipush #46
    //   107: goto -> 112
    //   110: bipush #35
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: aload_0
    //   155: bipush #8
    //   157: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   160: putstatic burp/Zzjr.Zu : Ljava/util/regex/Pattern;
    //   163: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzjr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */