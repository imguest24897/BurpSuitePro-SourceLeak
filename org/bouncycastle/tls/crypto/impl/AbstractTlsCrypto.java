package org.bouncycastle.tls.crypto.impl;

import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsSecret;

public abstract class AbstractTlsCrypto implements TlsCrypto {
  public TlsSecret adoptSecret(TlsSecret paramTlsSecret) {
    if (paramTlsSecret instanceof AbstractTlsSecret) {
      AbstractTlsSecret abstractTlsSecret = (AbstractTlsSecret)paramTlsSecret;
      return createSecret(abstractTlsSecret.copyData());
    } 
    throw new IllegalArgumentException("unrecognized TlsSecret - cannot copy data: " + paramTlsSecret.getClass().getName());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\AbstractTlsCrypto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */