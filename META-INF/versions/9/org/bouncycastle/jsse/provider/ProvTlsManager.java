package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.List;
import org.bouncycastle.jsse.BCX509Key;
import org.bouncycastle.jsse.provider.ContextData;
import org.bouncycastle.jsse.provider.JsseSecurityParameters;
import org.bouncycastle.jsse.provider.ProvSSLConnection;
import org.bouncycastle.jsse.provider.ProvSSLSession;
import org.bouncycastle.jsse.provider.ProvSSLSessionContext;
import org.bouncycastle.tls.SecurityParameters;

interface ProvTlsManager {
  void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws IOException;
  
  void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws IOException;
  
  BCX509Key chooseClientKey(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal);
  
  BCX509Key chooseServerKey(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal);
  
  boolean getEnableSessionCreation();
  
  ContextData getContextData();
  
  String getPeerHost();
  
  String getPeerHostSNI();
  
  int getPeerPort();
  
  int getTransportID();
  
  void notifyHandshakeComplete(ProvSSLConnection paramProvSSLConnection);
  
  void notifyHandshakeSession(ProvSSLSessionContext paramProvSSLSessionContext, SecurityParameters paramSecurityParameters, JsseSecurityParameters paramJsseSecurityParameters, ProvSSLSession paramProvSSLSession);
  
  String selectApplicationProtocol(List<String> paramList);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvTlsManager.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */