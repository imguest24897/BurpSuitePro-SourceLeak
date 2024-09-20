package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsCrypto;

class TlsServerContextImpl extends AbstractTlsContext implements TlsServerContext {
  TlsServerContextImpl(TlsCrypto paramTlsCrypto) {
    super(paramTlsCrypto, 0);
  }
  
  public boolean isServer() {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsServerContextImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */