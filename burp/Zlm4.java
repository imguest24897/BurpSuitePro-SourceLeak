package burp;

public class Zlm4 extends Zlml {
  private final String ZV;
  
  private final String Zu;
  
  private static final String a;
  
  public Zlm4(String paramString1, String paramString2) {
    this.ZV = paramString1;
    this.Zu = paramString2;
  }
  
  public String Zg() {
    return a.formatted(new Object[] { this.ZV, this.Zu });
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: ldc 'I=bb$C'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlm4.a : Ljava/lang/String;
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
    //   80: bipush #115
    //   82: goto -> 112
    //   85: bipush #81
    //   87: goto -> 112
    //   90: bipush #83
    //   92: goto -> 112
    //   95: bipush #88
    //   97: goto -> 112
    //   100: bipush #72
    //   102: goto -> 112
    //   105: bipush #49
    //   107: goto -> 112
    //   110: bipush #117
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlm4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */