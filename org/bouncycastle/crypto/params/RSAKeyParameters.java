package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Properties;

public class RSAKeyParameters extends AsymmetricKeyParameter {
  private static final BigIntegers.Cache validated = new BigIntegers.Cache();
  
  private static final BigInteger SMALL_PRIMES_PRODUCT = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
  
  private BigInteger modulus;
  
  private BigInteger exponent;
  
  public RSAKeyParameters(boolean paramBoolean, BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    this(paramBoolean, paramBigInteger1, paramBigInteger2, false);
  }
  
  public RSAKeyParameters(boolean paramBoolean1, BigInteger paramBigInteger1, BigInteger paramBigInteger2, boolean paramBoolean2) {
    super(paramBoolean1);
    if (!paramBoolean1 && (paramBigInteger2.intValue() & 0x1) == 0)
      throw new IllegalArgumentException("RSA publicExponent is even"); 
    this.modulus = validated.contains(paramBigInteger1) ? paramBigInteger1 : validate(paramBigInteger1, paramBoolean2);
    this.exponent = paramBigInteger2;
  }
  
  private static boolean hasAnySmallFactors(BigInteger paramBigInteger) {
    BigInteger bigInteger1 = paramBigInteger;
    BigInteger bigInteger2 = SMALL_PRIMES_PRODUCT;
    if (paramBigInteger.bitLength() < SMALL_PRIMES_PRODUCT.bitLength()) {
      bigInteger1 = SMALL_PRIMES_PRODUCT;
      bigInteger2 = paramBigInteger;
    } 
    return !BigIntegers.modOddIsCoprimeVar(bigInteger1, bigInteger2);
  }
  
  private static BigInteger validate(BigInteger paramBigInteger, boolean paramBoolean) {
    if (paramBoolean) {
      validated.add(paramBigInteger);
      return paramBigInteger;
    } 
    if ((paramBigInteger.intValue() & 0x1) == 0)
      throw new IllegalArgumentException("RSA modulus is even"); 
    if (Properties.isOverrideSet("org.bouncycastle.rsa.allow_unsafe_mod"))
      return paramBigInteger; 
    int i = Properties.asInteger("org.bouncycastle.rsa.max_size", 16384);
    if (i < paramBigInteger.bitLength())
      throw new IllegalArgumentException("RSA modulus out of range"); 
    if (hasAnySmallFactors(paramBigInteger))
      throw new IllegalArgumentException("RSA modulus has a small prime factor"); 
    int j = paramBigInteger.bitLength() / 2;
    int k = Properties.asInteger("org.bouncycastle.rsa.max_mr_tests", getMRIterations(j));
    if (k > 0) {
      Primes.MROutput mROutput = Primes.enhancedMRProbablePrimeTest(paramBigInteger, CryptoServicesRegistrar.getSecureRandom(), k);
      if (!mROutput.isProvablyComposite())
        throw new IllegalArgumentException("RSA modulus is not composite"); 
    } 
    validated.add(paramBigInteger);
    return paramBigInteger;
  }
  
  private static int getMRIterations(int paramInt) {
    return (paramInt >= 1536) ? 3 : ((paramInt >= 1024) ? 4 : ((paramInt >= 512) ? 7 : 50));
  }
  
  public BigInteger getModulus() {
    return this.modulus;
  }
  
  public BigInteger getExponent() {
    return this.exponent;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\RSAKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */