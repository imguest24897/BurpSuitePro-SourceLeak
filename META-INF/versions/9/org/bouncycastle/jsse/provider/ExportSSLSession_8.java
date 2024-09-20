package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.List;
import javax.net.ssl.SNIServerName;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.provider.ExportSSLSession_7;
import org.bouncycastle.jsse.provider.JsseUtils_8;

class ExportSSLSession_8 extends ExportSSLSession_7 {
  ExportSSLSession_8(BCExtendedSSLSession paramBCExtendedSSLSession) {
    super(paramBCExtendedSSLSession);
  }
  
  public List<SNIServerName> getRequestedServerNames() {
    return JsseUtils_8.exportSNIServerNames(this.sslSession.getRequestedServerNames());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ExportSSLSession_8.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */