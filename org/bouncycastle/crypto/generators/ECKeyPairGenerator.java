package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

public class ECKeyPairGenerator implements AsymmetricCipherKeyPairGenerator, ECConstants {
  private final String name;
  
  ECDomainParameters params;
  
  SecureRandom random;
  
  public ECKeyPairGenerator() {
    this("ECKeyGen");
  }
  
  protected ECKeyPairGenerator(String paramString) {
    this.name = paramString;
  }
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    ECKeyGenerationParameters eCKeyGenerationParameters = (ECKeyGenerationParameters)paramKeyGenerationParameters;
    this.random = eCKeyGenerationParameters.getRandom();
    this.params = eCKeyGenerationParameters.getDomainParameters();
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties(this.name, ConstraintUtils.bitsOfSecurityFor(this.params.getCurve()), eCKeyGenerationParameters.getDomainParameters(), CryptoServicePurpose.KEYGEN));
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    BigInteger bigInteger = this.params.getN();
    int i = bigInteger.bitLength();
    int j = i >>> 2;
    while (true) {
      BigInteger bigInteger1 = BigIntegers.createRandomBigInteger(i, this.random);
      if (isOutOfRangeD(bigInteger1, bigInteger) || WNafUtil.getNafWeight(bigInteger1) < j)
        continue; 
      ECPoint eCPoint = createBasePointMultiplier().multiply(this.params.getG(), bigInteger1);
      return new AsymmetricCipherKeyPair((AsymmetricKeyParameter)new ECPublicKeyParameters(eCPoint, this.params), (AsymmetricKeyParameter)new ECPrivateKeyParameters(bigInteger1, this.params));
    } 
  }
  
  protected boolean isOutOfRangeD(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    return (paramBigInteger1.compareTo(ONE) < 0 || paramBigInteger1.compareTo(paramBigInteger2) >= 0);
  }
  
  protected ECMultiplier createBasePointMultiplier() {
    return (ECMultiplier)new FixedPointCombMultiplier();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\generators\ECKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */