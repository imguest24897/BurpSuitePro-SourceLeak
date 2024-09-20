package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.encoders.Hex;

public class SM2Signer implements Signer, ECConstants {
  private final DSAKCalculator kCalculator = new RandomDSAKCalculator();
  
  private final Digest digest;
  
  private final DSAEncoding encoding;
  
  private int state = 0;
  
  private ECDomainParameters ecParams;
  
  private ECPoint pubPoint;
  
  private ECKeyParameters ecKey;
  
  private byte[] z;
  
  public SM2Signer() {
    this(StandardDSAEncoding.INSTANCE, (Digest)new SM3Digest());
  }
  
  public SM2Signer(Digest paramDigest) {
    this(StandardDSAEncoding.INSTANCE, paramDigest);
  }
  
  public SM2Signer(DSAEncoding paramDSAEncoding) {
    this.encoding = paramDSAEncoding;
    this.digest = (Digest)new SM3Digest();
  }
  
  public SM2Signer(DSAEncoding paramDSAEncoding, Digest paramDigest) {
    this.encoding = paramDSAEncoding;
    this.digest = paramDigest;
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    CipherParameters cipherParameters;
    byte[] arrayOfByte;
    if (paramCipherParameters instanceof ParametersWithID) {
      cipherParameters = ((ParametersWithID)paramCipherParameters).getParameters();
      arrayOfByte = ((ParametersWithID)paramCipherParameters).getID();
      if (arrayOfByte.length >= 8192)
        throw new IllegalArgumentException("SM2 user ID must be less than 2^13 bits long"); 
    } else {
      cipherParameters = paramCipherParameters;
      arrayOfByte = Hex.decodeStrict("31323334353637383132333435363738");
    } 
    if (paramBoolean) {
      if (cipherParameters instanceof ParametersWithRandom) {
        ParametersWithRandom parametersWithRandom = (ParametersWithRandom)cipherParameters;
        this.ecKey = (ECKeyParameters)parametersWithRandom.getParameters();
        this.ecParams = this.ecKey.getParameters();
        this.kCalculator.init(this.ecParams.getN(), parametersWithRandom.getRandom());
      } else {
        this.ecKey = (ECKeyParameters)cipherParameters;
        this.ecParams = this.ecKey.getParameters();
        this.kCalculator.init(this.ecParams.getN(), CryptoServicesRegistrar.getSecureRandom());
      } 
      BigInteger bigInteger1 = ((ECPrivateKeyParameters)this.ecKey).getD();
      BigInteger bigInteger2 = this.ecParams.getN().subtract(BigIntegers.ONE);
      if (bigInteger1.compareTo(ONE) < 0 || bigInteger1.compareTo(bigInteger2) >= 0)
        throw new IllegalArgumentException("SM2 private key out of range"); 
      this.pubPoint = createBasePointMultiplier().multiply(this.ecParams.getG(), bigInteger1).normalize();
    } else {
      this.ecKey = (ECKeyParameters)cipherParameters;
      this.ecParams = this.ecKey.getParameters();
      this.pubPoint = ((ECPublicKeyParameters)this.ecKey).getQ();
    } 
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("ECNR", this.ecKey, paramBoolean));
    this.digest.reset();
    this.z = getZ(arrayOfByte);
    this.state = 1;
  }
  
  public void update(byte paramByte) {
    checkData();
    this.digest.update(paramByte);
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    checkData();
    this.digest.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public boolean verifySignature(byte[] paramArrayOfbyte) {
    checkData();
    try {
      BigInteger[] arrayOfBigInteger = this.encoding.decode(this.ecParams.getN(), paramArrayOfbyte);
      return verifySignature(arrayOfBigInteger[0], arrayOfBigInteger[1]);
    } catch (Exception exception) {
    
    } finally {
      reset();
    } 
    return false;
  }
  
  public void reset() {
    switch (this.state) {
      case 1:
        return;
      case 2:
        break;
      default:
        throw new IllegalStateException("SM2Signer needs to be initialized");
    } 
    this.digest.reset();
    this.state = 1;
  }
  
  public byte[] generateSignature() throws CryptoException {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial checkData : ()V
    //   4: aload_0
    //   5: invokespecial digestDoFinal : ()[B
    //   8: astore_1
    //   9: aload_0
    //   10: getfield ecParams : Lorg/bouncycastle/crypto/params/ECDomainParameters;
    //   13: invokevirtual getN : ()Ljava/math/BigInteger;
    //   16: astore_2
    //   17: aload_0
    //   18: aload_2
    //   19: aload_1
    //   20: invokevirtual calculateE : (Ljava/math/BigInteger;[B)Ljava/math/BigInteger;
    //   23: astore_3
    //   24: aload_0
    //   25: getfield ecKey : Lorg/bouncycastle/crypto/params/ECKeyParameters;
    //   28: checkcast org/bouncycastle/crypto/params/ECPrivateKeyParameters
    //   31: invokevirtual getD : ()Ljava/math/BigInteger;
    //   34: astore #4
    //   36: aload_0
    //   37: invokevirtual createBasePointMultiplier : ()Lorg/bouncycastle/math/ec/ECMultiplier;
    //   40: astore #7
    //   42: aload_0
    //   43: getfield kCalculator : Lorg/bouncycastle/crypto/signers/DSAKCalculator;
    //   46: invokeinterface nextK : ()Ljava/math/BigInteger;
    //   51: astore #8
    //   53: aload #7
    //   55: aload_0
    //   56: getfield ecParams : Lorg/bouncycastle/crypto/params/ECDomainParameters;
    //   59: invokevirtual getG : ()Lorg/bouncycastle/math/ec/ECPoint;
    //   62: aload #8
    //   64: invokeinterface multiply : (Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECPoint;
    //   69: invokevirtual normalize : ()Lorg/bouncycastle/math/ec/ECPoint;
    //   72: astore #9
    //   74: aload_3
    //   75: aload #9
    //   77: invokevirtual getAffineXCoord : ()Lorg/bouncycastle/math/ec/ECFieldElement;
    //   80: invokevirtual toBigInteger : ()Ljava/math/BigInteger;
    //   83: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   86: aload_2
    //   87: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   90: astore #5
    //   92: aload #5
    //   94: getstatic org/bouncycastle/crypto/signers/SM2Signer.ZERO : Ljava/math/BigInteger;
    //   97: invokevirtual equals : (Ljava/lang/Object;)Z
    //   100: ifne -> 42
    //   103: aload #5
    //   105: aload #8
    //   107: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   110: aload_2
    //   111: invokevirtual equals : (Ljava/lang/Object;)Z
    //   114: ifne -> 42
    //   117: aload_2
    //   118: aload #4
    //   120: getstatic org/bouncycastle/crypto/signers/SM2Signer.ONE : Ljava/math/BigInteger;
    //   123: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   126: invokestatic modOddInverse : (Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   129: astore #9
    //   131: aload #8
    //   133: aload #5
    //   135: aload #4
    //   137: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   140: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   143: aload_2
    //   144: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   147: astore #6
    //   149: aload #9
    //   151: aload #6
    //   153: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   156: aload_2
    //   157: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   160: astore #6
    //   162: aload #6
    //   164: getstatic org/bouncycastle/crypto/signers/SM2Signer.ZERO : Ljava/math/BigInteger;
    //   167: invokevirtual equals : (Ljava/lang/Object;)Z
    //   170: ifne -> 42
    //   173: aload_0
    //   174: getfield encoding : Lorg/bouncycastle/crypto/signers/DSAEncoding;
    //   177: aload_0
    //   178: getfield ecParams : Lorg/bouncycastle/crypto/params/ECDomainParameters;
    //   181: invokevirtual getN : ()Ljava/math/BigInteger;
    //   184: aload #5
    //   186: aload #6
    //   188: invokeinterface encode : (Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)[B
    //   193: astore #8
    //   195: aload_0
    //   196: invokevirtual reset : ()V
    //   199: aload #8
    //   201: areturn
    //   202: astore #8
    //   204: new org/bouncycastle/crypto/CryptoException
    //   207: dup
    //   208: new java/lang/StringBuilder
    //   211: dup
    //   212: invokespecial <init> : ()V
    //   215: ldc_w 'unable to encode signature: '
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: aload #8
    //   223: invokevirtual getMessage : ()Ljava/lang/String;
    //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: invokevirtual toString : ()Ljava/lang/String;
    //   232: aload #8
    //   234: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   237: athrow
    //   238: astore #10
    //   240: aload_0
    //   241: invokevirtual reset : ()V
    //   244: aload #10
    //   246: athrow
    // Exception table:
    //   from	to	target	type
    //   173	195	202	java/lang/Exception
    //   173	195	238	finally
    //   202	240	238	finally
  }
  
  private boolean verifySignature(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    BigInteger bigInteger1 = this.ecParams.getN();
    if (paramBigInteger1.compareTo(ONE) < 0 || paramBigInteger1.compareTo(bigInteger1) >= 0)
      return false; 
    if (paramBigInteger2.compareTo(ONE) < 0 || paramBigInteger2.compareTo(bigInteger1) >= 0)
      return false; 
    byte[] arrayOfByte = digestDoFinal();
    BigInteger bigInteger2 = calculateE(bigInteger1, arrayOfByte);
    BigInteger bigInteger3 = paramBigInteger1.add(paramBigInteger2).mod(bigInteger1);
    if (bigInteger3.equals(ZERO))
      return false; 
    ECPoint eCPoint1 = ((ECPublicKeyParameters)this.ecKey).getQ();
    ECPoint eCPoint2 = ECAlgorithms.sumOfTwoMultiplies(this.ecParams.getG(), paramBigInteger2, eCPoint1, bigInteger3).normalize();
    if (eCPoint2.isInfinity())
      return false; 
    BigInteger bigInteger4 = bigInteger2.add(eCPoint2.getAffineXCoord().toBigInteger()).mod(bigInteger1);
    return bigInteger4.equals(paramBigInteger1);
  }
  
  private void checkData() {
    switch (this.state) {
      case 1:
        break;
      case 2:
        return;
      default:
        throw new IllegalStateException("SM2Signer needs to be initialized");
    } 
    this.digest.update(this.z, 0, this.z.length);
    this.state = 2;
  }
  
  private byte[] digestDoFinal() {
    byte[] arrayOfByte = new byte[this.digest.getDigestSize()];
    this.digest.doFinal(arrayOfByte, 0);
    return arrayOfByte;
  }
  
  private byte[] getZ(byte[] paramArrayOfbyte) {
    addUserID(this.digest, paramArrayOfbyte);
    addFieldElement(this.digest, this.ecParams.getCurve().getA());
    addFieldElement(this.digest, this.ecParams.getCurve().getB());
    addFieldElement(this.digest, this.ecParams.getG().getAffineXCoord());
    addFieldElement(this.digest, this.ecParams.getG().getAffineYCoord());
    addFieldElement(this.digest, this.pubPoint.getAffineXCoord());
    addFieldElement(this.digest, this.pubPoint.getAffineYCoord());
    return digestDoFinal();
  }
  
  private void addUserID(Digest paramDigest, byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length * 8;
    paramDigest.update((byte)(i >>> 8));
    paramDigest.update((byte)i);
    paramDigest.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  private void addFieldElement(Digest paramDigest, ECFieldElement paramECFieldElement) {
    byte[] arrayOfByte = paramECFieldElement.getEncoded();
    paramDigest.update(arrayOfByte, 0, arrayOfByte.length);
  }
  
  protected ECMultiplier createBasePointMultiplier() {
    return (ECMultiplier)new FixedPointCombMultiplier();
  }
  
  protected BigInteger calculateE(BigInteger paramBigInteger, byte[] paramArrayOfbyte) {
    return new BigInteger(1, paramArrayOfbyte);
  }
  
  private static final class State {
    static final int UNINITIALIZED = 0;
    
    static final int INIT = 1;
    
    static final int DATA = 2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\signers\SM2Signer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */