package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.List;
import javax.net.ssl.ExtendedSSLSession;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.jsse.provider.ImportSSLSession_7;
import org.bouncycastle.jsse.provider.JsseUtils_8;

class ImportSSLSession_8 extends ImportSSLSession_7 {
  ImportSSLSession_8(ExtendedSSLSession paramExtendedSSLSession) {
    super(paramExtendedSSLSession);
  }
  
  public List<BCSNIServerName> getRequestedServerNames() {
    return JsseUtils_8.importSNIServerNames(this.sslSession.getRequestedServerNames());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ImportSSLSession_8.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */