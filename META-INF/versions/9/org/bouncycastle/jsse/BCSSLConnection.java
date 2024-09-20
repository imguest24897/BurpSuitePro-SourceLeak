package META-INF.versions.9.org.bouncycastle.jsse;

import org.bouncycastle.jsse.BCExtendedSSLSession;

public interface BCSSLConnection {
  String getApplicationProtocol();
  
  byte[] getChannelBinding(String paramString);
  
  String getID();
  
  BCExtendedSSLSession getSession();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\BCSSLConnection.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */