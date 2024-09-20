package META-INF.versions.9.org.bouncycastle.jsse;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public interface BCX509Key {
  X509Certificate[] getCertificateChain();
  
  String getKeyType();
  
  PrivateKey getPrivateKey();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\BCX509Key.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */