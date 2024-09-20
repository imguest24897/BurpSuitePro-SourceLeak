package org.bouncycastle.crypto.kems;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.BigIntegers;

public class RSAKEMGenerator implements EncapsulatedSecretGenerator {
  private static final BigInteger ZERO = BigInteger.valueOf(0L);
  
  private static final BigInteger ONE = BigInteger.valueOf(1L);
  
  private final int keyLen;
  
  private DerivationFunction kdf;
  
  private SecureRandom rnd;
  
  public RSAKEMGenerator(int paramInt, DerivationFunction paramDerivationFunction, SecureRandom paramSecureRandom) {
    this.keyLen = paramInt;
    this.kdf = paramDerivationFunction;
    this.rnd = paramSecureRandom;
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    RSAKeyParameters rSAKeyParameters = (RSAKeyParameters)paramAsymmetricKeyParameter;
    if (rSAKeyParameters.isPrivate())
      throw new IllegalArgumentException("public key required for encryption"); 
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("RSAKem", ConstraintUtils.bitsOfSecurityFor(rSAKeyParameters.getModulus()), rSAKeyParameters, CryptoServicePurpose.ENCRYPTION));
    BigInteger bigInteger1 = rSAKeyParameters.getModulus();
    BigInteger bigInteger2 = rSAKeyParameters.getExponent();
    BigInteger bigInteger3 = BigIntegers.createRandomInRange(ZERO, bigInteger1.subtract(ONE), this.rnd);
    BigInteger bigInteger4 = bigInteger3.modPow(bigInteger2, bigInteger1);
    byte[] arrayOfByte = BigIntegers.asUnsignedByteArray((bigInteger1.bitLength() + 7) / 8, bigInteger4);
    return new SecretWithEncapsulationImpl(generateKey(this.kdf, bigInteger1, bigInteger3, this.keyLen), arrayOfByte);
  }
  
  static byte[] generateKey(DerivationFunction paramDerivationFunction, BigInteger paramBigInteger1, BigInteger paramBigInteger2, int paramInt) {
    byte[] arrayOfByte1 = BigIntegers.asUnsignedByteArray((paramBigInteger1.bitLength() + 7) / 8, paramBigInteger2);
    paramDerivationFunction.init((DerivationParameters)new KDFParameters(arrayOfByte1, null));
    byte[] arrayOfByte2 = new byte[paramInt];
    paramDerivationFunction.generateBytes(arrayOfByte2, 0, arrayOfByte2.length);
    return arrayOfByte2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\kems\RSAKEMGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */