package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.TlsVerifier;

public abstract class BcTlsVerifier implements TlsVerifier {
  protected final BcTlsCrypto crypto;
  
  protected final AsymmetricKeyParameter publicKey;
  
  protected BcTlsVerifier(BcTlsCrypto paramBcTlsCrypto, AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    if (paramBcTlsCrypto == null)
      throw new NullPointerException("'crypto' cannot be null"); 
    if (paramAsymmetricKeyParameter == null)
      throw new NullPointerException("'publicKey' cannot be null"); 
    if (paramAsymmetricKeyParameter.isPrivate())
      throw new IllegalArgumentException("'publicKey' must be public"); 
    this.crypto = paramBcTlsCrypto;
    this.publicKey = paramAsymmetricKeyParameter;
  }
  
  public TlsStreamVerifier getStreamVerifier(DigitallySigned paramDigitallySigned) {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */