package burp;

import java.io.IOException;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zkf4 extends Zkf0<String> {
  private final Zgzx Zq;
  
  private static final String b;
  
  Zkf4(Zxdt paramZxdt, Zgzx paramZgzx) {
    super(paramZxdt.ZR(), paramZgzx);
    this.Zq = paramZgzx;
  }
  
  String Zk(Zmzk paramZmzk, Zgzx paramZgzx) {
    return paramZgzx.ZE();
  }
  
  public Zlvr Zm(Zmzk paramZmzk) throws IOException {
    Zlvr zlvr = super.Zm(paramZmzk);
    try {
      if (zlvr != null)
        try {
          if (this.Zq.ZX()) {
            Zuh.Zb(zlvr instanceof Zb43, Zqf.Zr);
            Zb43 zb43 = (Zb43)zlvr;
            boolean bool = zb43.ZT();
            try {
              Zlqg.Zz(zb43.ZH(), b, new Object[] { Boolean.valueOf(bool) });
            } catch (IOException iOException) {
              throw b(null);
            } 
            return bool ? null : zlvr;
          } 
          return zlvr;
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    return zlvr;
  }
  
  private static IOException b(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: ldc 'wrB%H^\\t:4JNS(NDKbeX'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkf4.b : Ljava/lang/String;
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
    //   80: bipush #47
    //   82: goto -> 112
    //   85: bipush #98
    //   87: goto -> 112
    //   90: bipush #99
    //   92: goto -> 112
    //   95: bipush #87
    //   97: goto -> 112
    //   100: bipush #56
    //   102: goto -> 112
    //   105: bipush #72
    //   107: goto -> 112
    //   110: bipush #35
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkf4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */