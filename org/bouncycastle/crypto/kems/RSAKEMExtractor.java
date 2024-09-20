package org.bouncycastle.crypto.kems;

import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.RSAKeyParameters;

public class RSAKEMExtractor implements EncapsulatedSecretExtractor {
  private final RSAKeyParameters privKey;
  
  private final int keyLen;
  
  private DerivationFunction kdf;
  
  public RSAKEMExtractor(RSAKeyParameters paramRSAKeyParameters, int paramInt, DerivationFunction paramDerivationFunction) {
    if (!paramRSAKeyParameters.isPrivate())
      throw new IllegalArgumentException("private key required for encryption"); 
    this.privKey = paramRSAKeyParameters;
    this.keyLen = paramInt;
    this.kdf = paramDerivationFunction;
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("RSAKem", ConstraintUtils.bitsOfSecurityFor(this.privKey.getModulus()), paramRSAKeyParameters, CryptoServicePurpose.DECRYPTION));
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte) {
    BigInteger bigInteger1 = this.privKey.getModulus();
    BigInteger bigInteger2 = this.privKey.getExponent();
    BigInteger bigInteger3 = new BigInteger(1, paramArrayOfbyte);
    BigInteger bigInteger4 = bigInteger3.modPow(bigInteger2, bigInteger1);
    return RSAKEMGenerator.generateKey(this.kdf, bigInteger1, bigInteger4, this.keyLen);
  }
  
  public int getEncapsulationLength() {
    return (this.privKey.getModulus().bitLength() + 7) / 8;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\kems\RSAKEMExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */