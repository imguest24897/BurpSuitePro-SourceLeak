package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.signers.DSASigner;

public class BcTlsDSAVerifier extends BcTlsDSSVerifier {
  public BcTlsDSAVerifier(BcTlsCrypto paramBcTlsCrypto, DSAPublicKeyParameters paramDSAPublicKeyParameters) {
    super(paramBcTlsCrypto, (AsymmetricKeyParameter)paramDSAPublicKeyParameters);
  }
  
  protected DSA createDSAImpl() {
    return (DSA)new DSASigner();
  }
  
  protected short getSignatureAlgorithm() {
    return 2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsDSAVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */