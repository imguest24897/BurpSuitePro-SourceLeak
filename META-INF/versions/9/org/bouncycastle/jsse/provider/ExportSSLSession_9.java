package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.List;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.provider.ExportSSLSession_8;

class ExportSSLSession_9 extends ExportSSLSession_8 {
  ExportSSLSession_9(BCExtendedSSLSession paramBCExtendedSSLSession) {
    super(paramBCExtendedSSLSession);
  }
  
  public List<byte[]> getStatusResponses() {
    return this.sslSession.getStatusResponses();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ExportSSLSession_9.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */