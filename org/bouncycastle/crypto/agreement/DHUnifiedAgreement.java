package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.DHKeyParameters;
import org.bouncycastle.crypto.params.DHUPrivateParameters;
import org.bouncycastle.crypto.params.DHUPublicParameters;
import org.bouncycastle.util.BigIntegers;

public class DHUnifiedAgreement {
  private DHUPrivateParameters privParams;
  
  public void init(CipherParameters paramCipherParameters) {
    this.privParams = (DHUPrivateParameters)paramCipherParameters;
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("DHU", (DHKeyParameters)this.privParams.getStaticPrivateKey()));
  }
  
  public int getFieldSize() {
    return (this.privParams.getStaticPrivateKey().getParameters().getP().bitLength() + 7) / 8;
  }
  
  public byte[] calculateAgreement(CipherParameters paramCipherParameters) {
    DHUPublicParameters dHUPublicParameters = (DHUPublicParameters)paramCipherParameters;
    DHBasicAgreement dHBasicAgreement1 = new DHBasicAgreement();
    DHBasicAgreement dHBasicAgreement2 = new DHBasicAgreement();
    dHBasicAgreement1.init((CipherParameters)this.privParams.getStaticPrivateKey());
    BigInteger bigInteger1 = dHBasicAgreement1.calculateAgreement((CipherParameters)dHUPublicParameters.getStaticPublicKey());
    dHBasicAgreement2.init((CipherParameters)this.privParams.getEphemeralPrivateKey());
    BigInteger bigInteger2 = dHBasicAgreement2.calculateAgreement((CipherParameters)dHUPublicParameters.getEphemeralPublicKey());
    int i = getFieldSize();
    byte[] arrayOfByte = new byte[i * 2];
    BigIntegers.asUnsignedByteArray(bigInteger2, arrayOfByte, 0, i);
    BigIntegers.asUnsignedByteArray(bigInteger1, arrayOfByte, i, i);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\agreement\DHUnifiedAgreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */