package burp;

public class Zmp3 {
  private final Zzkm Za;
  
  private static boolean Zb;
  
  private static final String a;
  
  private Zmp3(Zzkm paramZzkm) {
    this.Za = paramZzkm;
  }
  
  public static Zmp3 Zs() {
    Zzkm zzkm = Zscj.ZS(a, new String[0]);
    return new Zmp3(zzkm);
  }
  
  public Zmf_ Zd(String... paramVarArgs) {
    return this.Za.ZV(paramVarArgs);
  }
  
  public static void Zr(boolean paramBoolean) {
    Zb = paramBoolean;
  }
  
  public static boolean Zg() {
    return Zb;
  }
  
  public static boolean Zx() {
    boolean bool = Zg();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zg : ()Z
    //   3: ifeq -> 10
    //   6: iconst_1
    //   7: invokestatic Zr : (Z)V
    //   10: bipush #46
    //   12: ldc 'vF+10$|p%$!+mGn(3\\b)'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Zmp3.a : Ljava/lang/String;
    //   21: goto -> 166
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 140
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #105
    //   94: goto -> 124
    //   97: bipush #55
    //   99: goto -> 124
    //   102: bipush #26
    //   104: goto -> 124
    //   107: bipush #110
    //   109: goto -> 124
    //   112: bipush #108
    //   114: goto -> 124
    //   117: bipush #110
    //   119: goto -> 124
    //   122: bipush #73
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 45
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 42
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 18
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmp3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */