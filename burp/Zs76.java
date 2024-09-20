package burp;

import java.io.IOException;
import net.portswigger.Zkb;
import net.portswigger.Zmw;

public class Zs76 {
  private static String Zh;
  
  private static final String b;
  
  public static void ZB(Zrq9 paramZrq9, Zs4f paramZs4f) throws IOException {
    paramZs4f.ZY("s", Zkb.Zy(paramZrq9.Zle()));
    paramZs4f.Zb("f", paramZrq9.ZlV());
    paramZs4f.Zb("t", paramZrq9.Zln());
    paramZs4f.Zb("s", paramZrq9.Zlh());
    paramZs4f.Zb("n", paramZrq9.ZlB());
    String str = paramZrq9.Zl4();
    try {
      if (str != null)
        paramZs4f.ZL("p", str); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public static void Zr(Zrq9 paramZrq9, String paramString, Zr_4 paramZr_4) {
    paramZrq9.Zjh(paramString);
    Zstu zstu = paramZr_4.Zh(paramString);
    paramZrq9.Z_(zstu);
    paramZrq9.ZjU(Zkb.ZG(Zmw.Zi(zstu.ZiD(), 9, 6)));
  }
  
  static void ZL(Zrq9 paramZrq9) {
    String str = ZM();
    if (paramZrq9.Zlh() == 0 || paramZrq9.Zle().length() == 0 || paramZrq9.ZlV() < 0 || paramZrq9.Zln() < paramZrq9.ZlV() || paramZrq9.Zlh() < 0) {
      paramZrq9.ZvH(0);
      if (str == null) {
        paramZrq9.ZvH((int)((paramZrq9.Zln() - paramZrq9.ZlV()) / paramZrq9.Zlh()) + 1);
        return;
      } 
      return;
    } 
    paramZrq9.ZvH((int)((paramZrq9.Zln() - paramZrq9.ZlV()) / paramZrq9.Zlh()) + 1);
  }
  
  static void ZV(Zrq9 paramZrq9) throws Zs7w {
    try {
      paramZrq9.ZyK();
      if (paramZrq9.Zyv() <= 0)
        throw new Zs7w(b); 
    } catch (Zs7w zs7w) {
      throw a(null);
    } 
    paramZrq9.ZHn(paramZrq9.ZlV());
  }
  
  static void ZX(Zrq9 paramZrq9) {
    paramZrq9.ZHn(paramZrq9.ZlV());
  }
  
  public static void Z_(String paramString) {
    Zh = paramString;
  }
  
  public static String ZM() {
    return Zh;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZM : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'kQgEDb'
    //   8: invokestatic Z_ : (Ljava/lang/String;)V
    //   11: bipush #103
    //   13: ldc '1\\nw.jXia&m\\fs^q+a!\\rv3z\\nf\\r'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zs76.b : Ljava/lang/String;
    //   22: goto -> 165
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 139
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 101, 3 -> 106, 4 -> 111, 5 -> 116
    //   92: bipush #31
    //   94: goto -> 123
    //   97: iconst_3
    //   98: goto -> 123
    //   101: bipush #102
    //   103: goto -> 123
    //   106: bipush #25
    //   108: goto -> 123
    //   111: bipush #116
    //   113: goto -> 123
    //   116: bipush #32
    //   118: goto -> 123
    //   121: bipush #105
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 46
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 43
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
    //   162: goto -> 19
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs76.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */