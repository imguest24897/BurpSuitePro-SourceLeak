package META-INF.versions.9.org.bouncycastle.tls.crypto.impl;

import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.impl.AbstractTlsSecret;

public abstract class AbstractTlsCrypto implements TlsCrypto {
  public TlsSecret adoptSecret(TlsSecret paramTlsSecret) {
    if (paramTlsSecret instanceof AbstractTlsSecret) {
      AbstractTlsSecret abstractTlsSecret = (AbstractTlsSecret)paramTlsSecret;
      return createSecret(abstractTlsSecret.copyData());
    } 
    throw new IllegalArgumentException("unrecognized TlsSecret - cannot copy data: " + paramTlsSecret.getClass().getName());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\AbstractTlsCrypto.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */