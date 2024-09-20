package burp;

import java.security.cert.Certificate;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zgkr implements Zeu6 {
  final Zeqd Zp;
  
  private static final String a;
  
  Zgkr(Zeqd paramZeqd) {}
  
  public void ZR(Zmzk paramZmzk, SSLSocket paramSSLSocket) {
    this.Zp.Zj.ZC().ZR(paramZmzk, paramSSLSocket);
  }
  
  public void Zf(Zmzk paramZmzk, SSLSession paramSSLSession) throws SSLException {
    try {
      if (this.Zp.Zu)
        try {
          if (!this.Zp.Zs.verify(paramZmzk.ZJ1(), paramSSLSession))
            throw new SSLException(a); 
        } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
          throw a(null);
        }  
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    try {
      Certificate[] arrayOfCertificate = paramSSLSession.getPeerCertificates();
      try {
        if (arrayOfCertificate.length > 0)
          this.Zp.Zc.Zs(paramZmzk, arrayOfCertificate); 
      } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
        throw a(null);
      } 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      Zah.Zl(sSLPeerUnverifiedException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    this.Zp.Zj.ZC().Zf(paramZmzk, paramSSLSession);
  }
  
  private static SSLPeerUnverifiedException a(SSLPeerUnverifiedException paramSSLPeerUnverifiedException) {
    return paramSSLPeerUnverifiedException;
  }
  
  static {
    // Byte code:
    //   0: bipush #51
    //   2: ldc '20<NBaL;=Qa]7?_Qe[~+SQaF;=Tk]G*8DUa[I'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgkr.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 103
    //   80: bipush #84
    //   82: goto -> 110
    //   85: bipush #109
    //   87: goto -> 110
    //   90: bipush #106
    //   92: goto -> 110
    //   95: iconst_5
    //   96: goto -> 110
    //   99: iconst_1
    //   100: goto -> 110
    //   103: bipush #55
    //   105: goto -> 110
    //   108: bipush #28
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgkr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */