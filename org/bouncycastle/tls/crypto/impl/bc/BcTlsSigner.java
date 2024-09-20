package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsSigner;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

public abstract class BcTlsSigner implements TlsSigner {
  protected final BcTlsCrypto crypto;
  
  protected final AsymmetricKeyParameter privateKey;
  
  protected BcTlsSigner(BcTlsCrypto paramBcTlsCrypto, AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    if (paramBcTlsCrypto == null)
      throw new NullPointerException("'crypto' cannot be null"); 
    if (paramAsymmetricKeyParameter == null)
      throw new NullPointerException("'privateKey' cannot be null"); 
    if (!paramAsymmetricKeyParameter.isPrivate())
      throw new IllegalArgumentException("'privateKey' must be private"); 
    this.crypto = paramBcTlsCrypto;
    this.privateKey = paramAsymmetricKeyParameter;
  }
  
  public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */