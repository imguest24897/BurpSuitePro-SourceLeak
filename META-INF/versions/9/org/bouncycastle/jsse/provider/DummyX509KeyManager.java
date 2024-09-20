package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import org.bouncycastle.jsse.BCX509ExtendedKeyManager;
import org.bouncycastle.jsse.BCX509Key;

final class DummyX509KeyManager extends BCX509ExtendedKeyManager {
  static final BCX509ExtendedKeyManager INSTANCE = new org.bouncycastle.jsse.provider.DummyX509KeyManager();
  
  public String chooseClientAlias(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return null;
  }
  
  public String chooseServerAlias(String paramString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return null;
  }
  
  public X509Certificate[] getCertificateChain(String paramString) {
    return null;
  }
  
  public String[] getClientAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return null;
  }
  
  public PrivateKey getPrivateKey(String paramString) {
    return null;
  }
  
  public String[] getServerAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return null;
  }
  
  protected BCX509Key getKeyBC(String paramString1, String paramString2) {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\DummyX509KeyManager.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */