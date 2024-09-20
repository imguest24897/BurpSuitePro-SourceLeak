package org.bouncycastle.crypto.agreement;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;

public final class X25519Agreement implements RawAgreement {
  private X25519PrivateKeyParameters privateKey;
  
  public void init(CipherParameters paramCipherParameters) {
    this.privateKey = (X25519PrivateKeyParameters)paramCipherParameters;
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("X25519", this.privateKey));
  }
  
  public int getAgreementSize() {
    return 32;
  }
  
  public void calculateAgreement(CipherParameters paramCipherParameters, byte[] paramArrayOfbyte, int paramInt) {
    this.privateKey.generateSecret((X25519PublicKeyParameters)paramCipherParameters, paramArrayOfbyte, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\agreement\X25519Agreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */