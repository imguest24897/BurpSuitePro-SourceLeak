package org.bouncycastle.crypto.agreement;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;

public final class X448Agreement implements RawAgreement {
  private X448PrivateKeyParameters privateKey;
  
  public void init(CipherParameters paramCipherParameters) {
    this.privateKey = (X448PrivateKeyParameters)paramCipherParameters;
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("X448", this.privateKey));
  }
  
  public int getAgreementSize() {
    return 56;
  }
  
  public void calculateAgreement(CipherParameters paramCipherParameters, byte[] paramArrayOfbyte, int paramInt) {
    this.privateKey.generateSecret((X448PublicKeyParameters)paramCipherParameters, paramArrayOfbyte, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\agreement\X448Agreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */