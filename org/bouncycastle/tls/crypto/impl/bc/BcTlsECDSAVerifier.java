package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.ECDSASigner;

public class BcTlsECDSAVerifier extends BcTlsDSSVerifier {
  public BcTlsECDSAVerifier(BcTlsCrypto paramBcTlsCrypto, ECPublicKeyParameters paramECPublicKeyParameters) {
    super(paramBcTlsCrypto, (AsymmetricKeyParameter)paramECPublicKeyParameters);
  }
  
  protected DSA createDSAImpl() {
    return (DSA)new ECDSASigner();
  }
  
  protected short getSignatureAlgorithm() {
    return 3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsECDSAVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */