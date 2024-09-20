package META-INF.versions.9.org.bouncycastle.jsse;

import javax.net.ssl.SSLEngine;
import org.bouncycastle.jsse.BCApplicationProtocolSelector;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLConnection;
import org.bouncycastle.jsse.BCSSLParameters;

public interface BCSSLEngine {
  String getApplicationProtocol();
  
  BCApplicationProtocolSelector<SSLEngine> getBCHandshakeApplicationProtocolSelector();
  
  void setBCHandshakeApplicationProtocolSelector(BCApplicationProtocolSelector<SSLEngine> paramBCApplicationProtocolSelector);
  
  void setBCSessionToResume(BCExtendedSSLSession paramBCExtendedSSLSession);
  
  BCExtendedSSLSession getBCHandshakeSession();
  
  BCExtendedSSLSession getBCSession();
  
  BCSSLConnection getConnection();
  
  String getHandshakeApplicationProtocol();
  
  BCSSLParameters getParameters();
  
  void setParameters(BCSSLParameters paramBCSSLParameters);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\BCSSLEngine.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */