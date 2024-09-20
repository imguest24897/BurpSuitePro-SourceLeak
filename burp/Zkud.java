package burp;

import java.util.Locale;
import net.portswigger.Zsy;

abstract class Zkud implements Zs69 {
  protected final Zsy ZS;
  
  private static final String a;
  
  protected abstract boolean ZL(Zxaq paramZxaq, String paramString);
  
  protected abstract String ZX(Zmlc paramZmlc);
  
  Zkud(Zsy paramZsy) {
    this.ZS = paramZsy;
  }
  
  public boolean ZZ(Ze7n paramZe7n) {
    Zxaq zxaq = paramZe7n.Zm();
    String str = ZV(paramZe7n.ZW());
    return ZL(zxaq, str);
  }
  
  public final String Za(Ze7n paramZe7n) {
    return ZZ(paramZe7n) ? ZX(paramZe7n.ZE()) : null;
  }
  
  String ZT(int paramInt1, int paramInt2) {
    if (paramInt2 == Integer.MAX_VALUE)
      paramInt2--; 
    return String.valueOf(this.ZS.ZP().ZO(paramInt1).Zr(paramInt2 + 1).Zc());
  }
  
  protected static String ZV(String paramString) {
    return (paramString == null) ? "" : paramString.toLowerCase(Locale.ENGLISH).replaceAll(a, "");
  }
  
  protected static boolean ZT(Zxaq paramZxaq) {
    return (paramZxaq == Zxaq.TEXT);
  }
  
  static {
    // Byte code:
    //   0: bipush #126
    //   2: ldc 'VvBs4u'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkud.a : Ljava/lang/String;
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
    //   85: bipush #86
    //   87: goto -> 112
    //   90: bipush #20
    //   92: goto -> 112
    //   95: bipush #87
    //   97: goto -> 112
    //   100: bipush #70
    //   102: goto -> 112
    //   105: bipush #89
    //   107: goto -> 112
    //   110: bipush #32
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkud.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */