package burp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Zmpo {
  public static final Zmpo Zi;
  
  public final List<Zs7s> ZQ;
  
  public final List<Zko4> ZF;
  
  private static final String a;
  
  public Zmpo(List<Zs3n> paramList) {
    this.ZQ = (List<Zs7s>)paramList.stream().filter(Zmpo::lambda$new$0).map(Zmpo::lambda$new$1).collect(Collectors.toList());
    this.ZF = (List<Zko4>)paramList.stream().filter(Zmpo::lambda$new$2).map(Zmpo::lambda$new$3).collect(Collectors.toList());
  }
  
  public Optional<String> Zl(Zgyw paramZgyw) {
    return this.ZF.isEmpty() ? Optional.empty() : (Zgvb.Zb(paramZgyw) ? Optional.of(a) : Optional.empty());
  }
  
  private static Zko4 lambda$new$3(Zs3n paramZs3n) {
    return (Zko4)paramZs3n;
  }
  
  private static boolean lambda$new$2(Zs3n paramZs3n) {
    return paramZs3n instanceof Zko4;
  }
  
  private static Zs7s lambda$new$1(Zs3n paramZs3n) {
    return (Zs7s)paramZs3n;
  }
  
  private static boolean lambda$new$0(Zs3n paramZs3n) {
    return paramZs3n instanceof Zs7s;
  }
  
  static {
    // Byte code:
    //   0: bipush #74
    //   2: ldc 'j>7<eZ/<1c\\fV\\t-<1eKL;y>e\\rFG,y%cGF*-rFG8y0xXZ:+rnF_:7ry\\tNG10<m'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmpo.a : Ljava/lang/String;
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
    //   80: bipush #99
    //   82: goto -> 112
    //   85: bipush #21
    //   87: goto -> 112
    //   90: bipush #19
    //   92: goto -> 112
    //   95: bipush #24
    //   97: goto -> 112
    //   100: bipush #64
    //   102: goto -> 112
    //   105: bipush #32
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
    //   154: new burp/Zmpo
    //   157: dup
    //   158: invokestatic emptyList : ()Ljava/util/List;
    //   161: invokespecial <init> : (Ljava/util/List;)V
    //   164: putstatic burp/Zmpo.Zi : Lburp/Zmpo;
    //   167: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmpo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */