package org.bouncycastle.jsse.provider;

import java.util.List;
import javax.net.ssl.SNIServerName;
import org.bouncycastle.jsse.BCExtendedSSLSession;

class ExportSSLSession_8 extends ExportSSLSession_7 {
  ExportSSLSession_8(BCExtendedSSLSession paramBCExtendedSSLSession) {
    super(paramBCExtendedSSLSession);
  }
  
  public List<SNIServerName> getRequestedServerNames() {
    return JsseUtils_8.exportSNIServerNames(this.sslSession.getRequestedServerNames());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ExportSSLSession_8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */