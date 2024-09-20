package META-INF.versions.9.org.bouncycastle.tls;

import org.bouncycastle.tls.AbstractTlsContext;
import org.bouncycastle.tls.TlsClientContext;
import org.bouncycastle.tls.crypto.TlsCrypto;

class TlsClientContextImpl extends AbstractTlsContext implements TlsClientContext {
  TlsClientContextImpl(TlsCrypto paramTlsCrypto) {
    super(paramTlsCrypto, 1);
  }
  
  public boolean isServer() {
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsClientContextImpl.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */