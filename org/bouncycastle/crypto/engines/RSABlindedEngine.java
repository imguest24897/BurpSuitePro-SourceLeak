package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.BigIntegers;

public class RSABlindedEngine implements AsymmetricBlockCipher {
  private static final BigInteger ONE = BigInteger.valueOf(1L);
  
  private RSACoreEngine core = new RSACoreEngine();
  
  private RSAKeyParameters key;
  
  private SecureRandom random;
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    SecureRandom secureRandom = null;
    if (paramCipherParameters instanceof ParametersWithRandom) {
      ParametersWithRandom parametersWithRandom = (ParametersWithRandom)paramCipherParameters;
      secureRandom = parametersWithRandom.getRandom();
      paramCipherParameters = parametersWithRandom.getParameters();
    } 
    this.core.init(paramBoolean, paramCipherParameters);
    this.key = (RSAKeyParameters)paramCipherParameters;
    this.random = initSecureRandom(this.key instanceof RSAPrivateCrtKeyParameters, secureRandom);
  }
  
  public int getInputBlockSize() {
    return this.core.getInputBlockSize();
  }
  
  public int getOutputBlockSize() {
    return this.core.getOutputBlockSize();
  }
  
  public byte[] processBlock(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.key == null)
      throw new IllegalStateException("RSA engine not initialised"); 
    BigInteger bigInteger1 = this.core.convertInput(paramArrayOfbyte, paramInt1, paramInt2);
    BigInteger bigInteger2 = processInput(bigInteger1);
    return this.core.convertOutput(bigInteger2);
  }
  
  protected SecureRandom initSecureRandom(boolean paramBoolean, SecureRandom paramSecureRandom) {
    return paramBoolean ? CryptoServicesRegistrar.getSecureRandom(paramSecureRandom) : null;
  }
  
  private BigInteger processInput(BigInteger paramBigInteger) {
    if (this.key instanceof RSAPrivateCrtKeyParameters) {
      RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters)this.key;
      BigInteger bigInteger = rSAPrivateCrtKeyParameters.getPublicExponent();
      if (bigInteger != null) {
        BigInteger bigInteger1 = rSAPrivateCrtKeyParameters.getModulus();
        BigInteger bigInteger2 = BigIntegers.createRandomInRange(ONE, bigInteger1.subtract(ONE), this.random);
        BigInteger bigInteger3 = bigInteger2.modPow(bigInteger, bigInteger1);
        BigInteger bigInteger4 = BigIntegers.modOddInverse(bigInteger1, bigInteger2);
        BigInteger bigInteger5 = bigInteger3.multiply(paramBigInteger).mod(bigInteger1);
        BigInteger bigInteger6 = this.core.processBlock(bigInteger5);
        return bigInteger4.multiply(bigInteger6).mod(bigInteger1);
      } 
    } 
    return this.core.processBlock(paramBigInteger);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\RSABlindedEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */