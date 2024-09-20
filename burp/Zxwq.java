package burp;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zxwq extends Zxw9 {
  private final Ztbq ZS;
  
  private final Zmzk Zw;
  
  private X509Certificate[] ZT;
  
  Zxwq(Zzen paramZzen, Ztbq paramZtbq, Zmzk paramZmzk) {
    super(paramZzen);
    this.ZS = paramZtbq;
    this.Zw = paramZmzk;
  }
  
  public void ZM(SSLSession paramSSLSession) {
    super.ZM(paramSSLSession);
    try {
      this.ZT = (X509Certificate[])paramSSLSession.getPeerCertificates();
      if (this.ZT.length > 0)
        this.ZS.Zs(this.Zw, (Certificate[])this.ZT); 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      Zah.Zl(sSLPeerUnverifiedException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  X509Certificate Zq() {
    return (this.ZT != null && this.ZT.length > 0) ? this.ZT[0] : null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxwq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */