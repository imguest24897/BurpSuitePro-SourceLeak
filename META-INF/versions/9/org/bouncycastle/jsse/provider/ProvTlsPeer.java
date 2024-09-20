package META-INF.versions.9.org.bouncycastle.jsse.provider;

import org.bouncycastle.jsse.provider.ProvSSLSession;
import org.bouncycastle.tls.TlsContext;

interface ProvTlsPeer {
  String getID();
  
  ProvSSLSession getSession();
  
  TlsContext getTlsContext();
  
  boolean isHandshakeComplete();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvTlsPeer.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */