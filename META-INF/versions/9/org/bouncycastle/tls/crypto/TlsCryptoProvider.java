package META-INF.versions.9.org.bouncycastle.tls.crypto;

import java.security.SecureRandom;
import org.bouncycastle.tls.crypto.TlsCrypto;

public interface TlsCryptoProvider {
  TlsCrypto create(SecureRandom paramSecureRandom);
  
  TlsCrypto create(SecureRandom paramSecureRandom1, SecureRandom paramSecureRandom2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsCryptoProvider.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */