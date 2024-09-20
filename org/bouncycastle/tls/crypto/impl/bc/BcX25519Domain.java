package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsECDomain;

public class BcX25519Domain implements TlsECDomain {
  protected final BcTlsCrypto crypto;
  
  public BcX25519Domain(BcTlsCrypto paramBcTlsCrypto) {
    this.crypto = paramBcTlsCrypto;
  }
  
  public TlsAgreement createECDH() {
    return new BcX25519(this.crypto);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcX25519Domain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */