package burp;

import java.util.List;

public class Zmo0 implements Zxlu {
  private final Zrso ZE;
  
  private static final String a;
  
  public Zmo0(Zrso paramZrso) {
    this.ZE = paramZrso;
  }
  
  public Zsqx<Zrdb> Zr() {
    Zms4 zms4 = this.ZE.Zi();
    String str1 = zms4.ZA();
    String str2 = zms4.ZA();
    if (str1 == null || str2 == null)
      return null; 
    Zk2s zk2s = new Zk2s(str1 + str1 + a, List.of(str1 + "/" + str1, str1 + "\\" + str1), (byte)11, (byte)1);
    return this.ZE.Zq(zk2s);
  }
  
  static {
    // Byte code:
    //   0: bipush #122
    //   2: ldc 'lIQ<t;WG"p]'@J'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmo0.a : Ljava/lang/String;
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
    //   80: bipush #50
    //   82: goto -> 112
    //   85: bipush #72
    //   87: goto -> 112
    //   90: bipush #77
    //   92: goto -> 112
    //   95: bipush #6
    //   97: goto -> 112
    //   100: bipush #42
    //   102: goto -> 112
    //   105: bipush #107
    //   107: goto -> 112
    //   110: bipush #83
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmo0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */