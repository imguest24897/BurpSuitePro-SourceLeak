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
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

public class ECIESKEMGenerator implements EncapsulatedSecretGenerator {
  private static final BigInteger ONE = BigInteger.valueOf(1L);
  
  private DerivationFunction kdf;
  
  private SecureRandom rnd;
  
  private final int keySize;
  
  private boolean CofactorMode;
  
  private boolean OldCofactorMode;
  
  private boolean SingleHashMode;
  
  public ECIESKEMGenerator(int paramInt, DerivationFunction paramDerivationFunction, SecureRandom paramSecureRandom) {
    this.keySize = paramInt;
    this.kdf = paramDerivationFunction;
    this.rnd = paramSecureRandom;
    this.CofactorMode = false;
    this.OldCofactorMode = false;
    this.SingleHashMode = false;
  }
  
  public ECIESKEMGenerator(int paramInt, DerivationFunction paramDerivationFunction, SecureRandom paramSecureRandom, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.kdf = paramDerivationFunction;
    this.rnd = paramSecureRandom;
    this.keySize = paramInt;
    this.CofactorMode = paramBoolean1;
    if (paramBoolean1) {
      this.OldCofactorMode = false;
    } else {
      this.OldCofactorMode = paramBoolean2;
    } 
    this.SingleHashMode = paramBoolean3;
  }
  
  private ECMultiplier createBasePointMultiplier() {
    return (ECMultiplier)new FixedPointCombMultiplier();
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    if (!(paramAsymmetricKeyParameter instanceof org.bouncycastle.crypto.params.ECKeyParameters))
      throw new IllegalArgumentException("EC key required"); 
    ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters)paramAsymmetricKeyParameter;
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("ECIESKem", ConstraintUtils.bitsOfSecurityFor(eCPublicKeyParameters.getParameters().getCurve()), paramAsymmetricKeyParameter, CryptoServicePurpose.ENCRYPTION));
    ECDomainParameters eCDomainParameters = eCPublicKeyParameters.getParameters();
    ECCurve eCCurve = eCDomainParameters.getCurve();
    BigInteger bigInteger1 = eCDomainParameters.getN();
    BigInteger bigInteger2 = eCDomainParameters.getH();
    BigInteger bigInteger3 = BigIntegers.createRandomInRange(ONE, bigInteger1, this.rnd);
    BigInteger bigInteger4 = this.OldCofactorMode ? bigInteger3.multiply(bigInteger2).mod(bigInteger1) : bigInteger3;
    ECMultiplier eCMultiplier = createBasePointMultiplier();
    ECPoint[] arrayOfECPoint = { eCMultiplier.multiply(eCDomainParameters.getG(), bigInteger3), eCPublicKeyParameters.getQ().multiply(bigInteger4) };
    eCCurve.normalizeAll(arrayOfECPoint);
    ECPoint eCPoint1 = arrayOfECPoint[0];
    ECPoint eCPoint2 = arrayOfECPoint[1];
    byte[] arrayOfByte1 = eCPoint1.getEncoded(false);
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    byte[] arrayOfByte3 = eCPoint2.getAffineXCoord().getEncoded();
    return new SecretWithEncapsulationImpl(deriveKey(this.SingleHashMode, this.kdf, this.keySize, arrayOfByte1, arrayOfByte3), arrayOfByte2);
  }
  
  static byte[] deriveKey(boolean paramBoolean, DerivationFunction paramDerivationFunction, int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte = paramArrayOfbyte2;
    if (!paramBoolean) {
      arrayOfByte = Arrays.concatenate(paramArrayOfbyte1, paramArrayOfbyte2);
      Arrays.fill(paramArrayOfbyte2, (byte)0);
    } 
    try {
      paramDerivationFunction.init((DerivationParameters)new KDFParameters(arrayOfByte, null));
      byte[] arrayOfByte1 = new byte[paramInt];
      paramDerivationFunction.generateBytes(arrayOfByte1, 0, arrayOfByte1.length);
      return arrayOfByte1;
    } finally {
      Arrays.fill(arrayOfByte, (byte)0);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\kems\ECIESKEMGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */