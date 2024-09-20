package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.signers.DSAKCalculator;
import org.bouncycastle.crypto.signers.DSASigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;

public class BcTlsDSASigner extends BcTlsDSSSigner {
  public BcTlsDSASigner(BcTlsCrypto paramBcTlsCrypto, DSAPrivateKeyParameters paramDSAPrivateKeyParameters) {
    super(paramBcTlsCrypto, (AsymmetricKeyParameter)paramDSAPrivateKeyParameters);
  }
  
  protected DSA createDSAImpl(int paramInt) {
    return (DSA)new DSASigner((DSAKCalculator)new HMacDSAKCalculator(this.crypto.createDigest(paramInt)));
  }
  
  protected short getSignatureAlgorithm() {
    return 2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsDSASigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */