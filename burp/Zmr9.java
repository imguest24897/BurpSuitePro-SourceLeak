package burp;

import java.security.GeneralSecurityException;
import javax.net.ssl.SSLSocketFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmr9 implements Zxoo {
  private final SSLSocketFactory Zt;
  
  Zmr9(Zskh paramZskh) {
    SSLSocketFactory sSLSocketFactory = null;
    try {
      sSLSocketFactory = Zg_u.Zb();
    } catch (GeneralSecurityException|java.io.IOException generalSecurityException) {
      Zah.Zl(generalSecurityException, Zk_.COMMON_RUNTIME_FAILURE);
      Zmgc.TLS_INITIALISE_FAILED.ZV(paramZskh, new Object[] { generalSecurityException.getMessage() });
    } 
    this.Zt = sSLSocketFactory;
  }
  
  public SSLSocketFactory ZP(String paramString, int paramInt) {
    return this.Zt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmr9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */