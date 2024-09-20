package META-INF.versions.9.org.bouncycastle.jsse;

import java.io.IOException;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCApplicationProtocolSelector;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLConnection;
import org.bouncycastle.jsse.BCSSLParameters;

public interface BCSSLSocket {
  void connect(String paramString, int paramInt1, int paramInt2) throws IOException;
  
  String getApplicationProtocol();
  
  BCApplicationProtocolSelector<SSLSocket> getBCHandshakeApplicationProtocolSelector();
  
  void setBCHandshakeApplicationProtocolSelector(BCApplicationProtocolSelector<SSLSocket> paramBCApplicationProtocolSelector);
  
  void setBCSessionToResume(BCExtendedSSLSession paramBCExtendedSSLSession);
  
  BCExtendedSSLSession getBCHandshakeSession();
  
  BCExtendedSSLSession getBCSession();
  
  BCSSLConnection getConnection();
  
  String getHandshakeApplicationProtocol();
  
  BCSSLParameters getParameters();
  
  void setHost(String paramString);
  
  void setParameters(BCSSLParameters paramBCSSLParameters);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\BCSSLSocket.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */