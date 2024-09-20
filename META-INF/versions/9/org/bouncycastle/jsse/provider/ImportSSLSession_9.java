package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.List;
import javax.net.ssl.ExtendedSSLSession;
import org.bouncycastle.jsse.provider.ImportSSLSession_8;

class ImportSSLSession_9 extends ImportSSLSession_8 {
  ImportSSLSession_9(ExtendedSSLSession paramExtendedSSLSession) {
    super(paramExtendedSSLSession);
  }
  
  public List<byte[]> getStatusResponses() {
    return this.sslSession.getStatusResponses();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ImportSSLSession_9.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */