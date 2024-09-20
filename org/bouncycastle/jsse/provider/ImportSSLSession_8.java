package org.bouncycastle.jsse.provider;

import java.util.List;
import javax.net.ssl.ExtendedSSLSession;
import org.bouncycastle.jsse.BCSNIServerName;

class ImportSSLSession_8 extends ImportSSLSession_7 {
  ImportSSLSession_8(ExtendedSSLSession paramExtendedSSLSession) {
    super(paramExtendedSSLSession);
  }
  
  public List<BCSNIServerName> getRequestedServerNames() {
    return JsseUtils_8.importSNIServerNames(this.sslSession.getRequestedServerNames());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ImportSSLSession_8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */