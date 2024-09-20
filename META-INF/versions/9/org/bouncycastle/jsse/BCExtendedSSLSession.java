package META-INF.versions.9.org.bouncycastle.jsse;

import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSession;
import org.bouncycastle.jsse.BCSNIServerName;

public abstract class BCExtendedSSLSession implements SSLSession {
  public abstract String[] getLocalSupportedSignatureAlgorithms();
  
  public String[] getLocalSupportedSignatureAlgorithmsBC() {
    return getLocalSupportedSignatureAlgorithms();
  }
  
  public abstract String[] getPeerSupportedSignatureAlgorithms();
  
  public String[] getPeerSupportedSignatureAlgorithmsBC() {
    return getPeerSupportedSignatureAlgorithms();
  }
  
  public List<BCSNIServerName> getRequestedServerNames() {
    throw new UnsupportedOperationException();
  }
  
  public List<byte[]> getStatusResponses() {
    return (List)Collections.emptyList();
  }
  
  public abstract boolean isFipsMode();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\BCExtendedSSLSession.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */