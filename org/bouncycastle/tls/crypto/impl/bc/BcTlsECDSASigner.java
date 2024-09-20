package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.signers.DSAKCalculator;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;

public class BcTlsECDSASigner extends BcTlsDSSSigner {
  public BcTlsECDSASigner(BcTlsCrypto paramBcTlsCrypto, ECPrivateKeyParameters paramECPrivateKeyParameters) {
    super(paramBcTlsCrypto, (AsymmetricKeyParameter)paramECPrivateKeyParameters);
  }
  
  protected DSA createDSAImpl(int paramInt) {
    return (DSA)new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator(this.crypto.createDigest(paramInt)));
  }
  
  protected short getSignatureAlgorithm() {
    return 3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsECDSASigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */