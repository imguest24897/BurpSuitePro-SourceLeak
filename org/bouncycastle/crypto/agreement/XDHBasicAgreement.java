package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class XDHBasicAgreement implements BasicAgreement {
  private AsymmetricKeyParameter key;
  
  private RawAgreement agreement;
  
  private int fieldSize = 0;
  
  public void init(CipherParameters paramCipherParameters) {
    if (paramCipherParameters instanceof org.bouncycastle.crypto.params.X25519PrivateKeyParameters) {
      this.fieldSize = 32;
      this.agreement = new X25519Agreement();
    } else if (paramCipherParameters instanceof org.bouncycastle.crypto.params.X448PrivateKeyParameters) {
      this.fieldSize = 56;
      this.agreement = new X448Agreement();
    } else {
      throw new IllegalArgumentException("key is neither X25519 nor X448");
    } 
    this.key = (AsymmetricKeyParameter)paramCipherParameters;
    this.agreement.init(paramCipherParameters);
  }
  
  public int getFieldSize() {
    return this.fieldSize;
  }
  
  public BigInteger calculateAgreement(CipherParameters paramCipherParameters) {
    byte[] arrayOfByte = new byte[this.fieldSize];
    this.agreement.calculateAgreement(paramCipherParameters, arrayOfByte, 0);
    return new BigInteger(1, arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\agreement\XDHBasicAgreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */