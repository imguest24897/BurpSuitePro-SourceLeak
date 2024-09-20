package burp;

import java.util.Set;

public class Zroi implements Zs4_ {
  private final Zkox ZU;
  
  private static final String a;
  
  public Zroi(Zkox paramZkox) {
    this.ZU = paramZkox;
  }
  
  public void Z_(Ze3n paramZe3n, Zlit paramZlit, long paramLong, Zefx paramZefx, Zb6q paramZb6q, Zswz paramZswz, Zsw6 paramZsw6, Zsdd paramZsdd, Zgq<Zrdb> paramZgq) {
    Zx_5 zx_5 = this.ZU.Zm(paramZe3n, paramZlit, paramLong, paramZefx, paramZb6q, paramZswz, paramZsw6, paramZsdd);
    try {
      if (zx_5 != null)
        paramZgq.Zu(zx_5); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public Set<Zvs> ZD() {
    throw new UnsupportedOperationException(a);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: ldc 'MhEqQ&Id[QvH7QhYZ8X9@rXl%QnDQ8]8\!_GkI3V/'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zroi.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #79
    //   82: goto -> 111
    //   85: bipush #60
    //   87: goto -> 111
    //   90: bipush #24
    //   92: goto -> 111
    //   95: bipush #47
    //   97: goto -> 111
    //   100: bipush #45
    //   102: goto -> 111
    //   105: iconst_1
    //   106: goto -> 111
    //   109: bipush #37
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zroi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */