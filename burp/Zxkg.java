package burp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

class Zxkg extends Zxkd {
  private static final String a;
  
  Zxkg(Zrgd paramZrgd, Zbw_ paramZbw_, Zgb6 paramZgb6, Zkl6 paramZkl6) {
    super(paramZrgd, paramZbw_, paramZgb6, paramZkl6);
  }
  
  void ZL(Zml3 paramZml3) throws Zz8v, Zz8b {
    try {
      Zmzk zmzk = Zd(paramZml3);
      if (!Zn(zmzk, paramZml3))
        return; 
      InetAddress inetAddress = zmzk.Zx(this.ZM, this.Zq, this.ZF.Zq(), this.ZF.Zd());
      if (inetAddress == null)
        return; 
      String str = inetAddress.getHostAddress();
      try {
        if (Zo(str, paramZml3.Zu(), paramZml3.ZX())) {
          Zu(paramZml3);
          throw new Zz8v(a, paramZml3.ZC());
        } 
      } catch (Zz8v zz8v) {
        throw a(null);
      } 
    } catch (Zz8v zz8v) {
      Zah.Zl(zz8v, Zk_.COMMON_RUNTIME_FAILURE);
      throw zz8v;
    } catch (Zz8b zz8b) {
      Zah.Zl(zz8b, Zk_.IGNORED);
      throw zz8b;
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zu(Zml3 paramZml3) throws IOException, Zz8b {
    Zb49 zb49 = new Zb49(paramZml3.Zu(), this.ZY);
    Zz1p zz1p = paramZml3.Zi();
    String str = Zkb.ZG(zz1p.Zo.ZdH());
    try {
      if (zb49.ZM(str))
        throw new Zz8b(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static boolean Zn(Zmzk paramZmzk, Zml3 paramZml3) {
    return (paramZmzk.ZJO() == paramZml3.Zu().getLocalPort());
  }
  
  private static boolean Zw(String paramString, Socket paramSocket) {
    return paramString.equals(paramSocket.getLocalAddress().getHostAddress());
  }
  
  private static boolean ZI(String paramString, InetAddress paramInetAddress) {
    return (paramInetAddress != null && paramString.equals(paramInetAddress.getHostAddress()));
  }
  
  static boolean Zo(String paramString, Socket paramSocket, InetAddress paramInetAddress) {
    return (Zw(paramString, paramSocket) || ZI(paramString, paramInetAddress));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #112
    //   2: ldc 'js#\\fL\\r3s)\\rI\\r$Z! S>@fl]<u#\O\\t:K!S.m%H\\r9Ksb'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxkg.a : Ljava/lang/String;
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
    //   80: bipush #94
    //   82: goto -> 112
    //   85: bipush #113
    //   87: goto -> 112
    //   90: bipush #60
    //   92: goto -> 112
    //   95: bipush #12
    //   97: goto -> 112
    //   100: bipush #76
    //   102: goto -> 112
    //   105: bipush #24
    //   107: goto -> 112
    //   110: bipush #39
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxkg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */