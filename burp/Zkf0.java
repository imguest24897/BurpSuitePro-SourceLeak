package burp;

import java.io.IOException;
import java.util.Objects;

abstract class Zkf0<T> implements Zr1u {
  private final Zrj_<T> Zh;
  
  private final Zgzx Zn;
  
  private static final String a;
  
  Zkf0(Zrj_<T> paramZrj_, Zgzx paramZgzx) {
    this.Zh = paramZrj_;
    this.Zn = paramZgzx;
  }
  
  abstract T Ze(Zmzk paramZmzk, Zgzx paramZgzx);
  
  public Zlvr Zm(Zmzk paramZmzk) throws IOException {
    T t = Ze(paramZmzk, this.Zn);
    Zb43 zb43 = this.Zh.ZH(t);
    try {
      if (zb43 != null)
        try {
          if (!Objects.equals(paramZmzk, zb43.ZA()))
            throw new IllegalStateException(a); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return zb43;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #122
    //   2: ldc '/FP{*QGF<u]pD|9FH}oJ\\tUf*HVND..\\tKD.<q-rk=LF{<\\rA]AX.; @]@T|=\\rK\\tBa!@WHa!'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkf0.a : Ljava/lang/String;
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
    //   80: bipush #7
    //   82: goto -> 112
    //   85: bipush #89
    //   87: goto -> 112
    //   90: bipush #91
    //   92: goto -> 112
    //   95: bipush #116
    //   97: goto -> 112
    //   100: bipush #53
    //   102: goto -> 112
    //   105: bipush #18
    //   107: goto -> 112
    //   110: bipush #95
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkf0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */