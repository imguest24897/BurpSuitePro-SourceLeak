package burp;

import java.io.IOException;

public class Zmce {
  private static int[] ZH;
  
  private static final String a;
  
  static void Zk(Zl61 paramZl61, Zs4f paramZs4f) throws IOException {
    paramZs4f.Zb("c", paramZl61.ZDU());
  }
  
  public static void Zi(Zl61 paramZl61) {
    paramZl61.ZCh(0);
  }
  
  public static void ZQ(Zl61 paramZl61) throws Zs7w {
    int i = paramZl61.Zyv();
    try {
      if (i < 1)
        try {
          if (i != -1)
            throw new Zs7w(a); 
        } catch (Zs7w zs7w) {
          throw a(null);
        }  
    } catch (Zs7w zs7w) {
      throw a(null);
    } 
  }
  
  public static void Zs(int[] paramArrayOfint) {
    ZH = paramArrayOfint;
  }
  
  public static int[] ZL() {
    return ZH;
  }
  
  private static Zs7w a(Zs7w paramZs7w) {
    return paramZs7w;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZL : ()[I
    //   3: ifnonnull -> 12
    //   6: iconst_4
    //   7: newarray int
    //   9: invokestatic Zs : ([I)V
    //   12: bipush #14
    //   14: ldc ']Q$>g7s4Q'2i;e4P4e+{x">r2xu[!q'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Zmce.a : Ljava/lang/String;
    //   23: goto -> 165
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 139
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 116
    //   92: bipush #26
    //   94: goto -> 123
    //   97: bipush #49
    //   99: goto -> 123
    //   102: bipush #92
    //   104: goto -> 123
    //   107: bipush #81
    //   109: goto -> 123
    //   112: iconst_5
    //   113: goto -> 123
    //   116: bipush #80
    //   118: goto -> 123
    //   121: bipush #25
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 47
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 44
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 20
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmce.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */