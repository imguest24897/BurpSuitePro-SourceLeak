package net.portswigger;

import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;

public class Zqk {
  private final List<KeyManager> Zy = new ArrayList<>();
  
  private static final String a;
  
  public Znf Zd() {
    try {
      if (this.Zy.isEmpty())
        throw new IllegalStateException(a); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    SSLContext sSLContext = Zzl.ZN(this.Zy.<KeyManager>toArray(new KeyManager[0]), null, new java.security.cert.X509Certificate[0], false);
    return new Zss(this, sSLContext);
  }
  
  public boolean Zx() {
    return this.Zy.isEmpty();
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: ldc '{;?\\bXu5\\nIFYk&RQ'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zqk.a : Ljava/lang/String;
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
    //   80: bipush #35
    //   82: goto -> 112
    //   85: bipush #111
    //   87: goto -> 112
    //   90: bipush #13
    //   92: goto -> 112
    //   95: bipush #66
    //   97: goto -> 112
    //   100: bipush #123
    //   102: goto -> 112
    //   105: bipush #120
    //   107: goto -> 112
    //   110: bipush #45
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zqk.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */