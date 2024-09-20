package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.Arrays;

class RSACoreEngine {
  private RSAKeyParameters key;
  
  private boolean forEncryption;
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    if (paramCipherParameters instanceof ParametersWithRandom) {
      ParametersWithRandom parametersWithRandom = (ParametersWithRandom)paramCipherParameters;
      paramCipherParameters = parametersWithRandom.getParameters();
    } 
    this.forEncryption = paramBoolean;
    this.key = (RSAKeyParameters)paramCipherParameters;
    int i = ConstraintUtils.bitsOfSecurityFor(this.key.getModulus());
    CryptoServicePurpose cryptoServicePurpose = getPurpose(this.key.isPrivate(), paramBoolean);
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("RSA", i, this.key, cryptoServicePurpose));
  }
  
  public int getInputBlockSize() {
    int i = this.key.getModulus().bitLength();
    return this.forEncryption ? ((i + 7) / 8 - 1) : ((i + 7) / 8);
  }
  
  public int getOutputBlockSize() {
    int i = this.key.getModulus().bitLength();
    return this.forEncryption ? ((i + 7) / 8) : ((i + 7) / 8 - 1);
  }
  
  public BigInteger convertInput(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte;
    if (paramInt2 > getInputBlockSize() + 1)
      throw new DataLengthException("input too large for RSA cipher."); 
    if (paramInt2 == getInputBlockSize() + 1 && !this.forEncryption)
      throw new DataLengthException("input too large for RSA cipher."); 
    if (paramInt1 != 0 || paramInt2 != paramArrayOfbyte.length) {
      arrayOfByte = new byte[paramInt2];
      System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, paramInt2);
    } else {
      arrayOfByte = paramArrayOfbyte;
    } 
    BigInteger bigInteger = new BigInteger(1, arrayOfByte);
    if (bigInteger.compareTo(this.key.getModulus()) >= 0)
      throw new DataLengthException("input too large for RSA cipher."); 
    return bigInteger;
  }
  
  public byte[] convertOutput(BigInteger paramBigInteger) {
    byte[] arrayOfByte2;
    byte[] arrayOfByte1 = paramBigInteger.toByteArray();
    if (this.forEncryption) {
      if (arrayOfByte1[0] == 0 && arrayOfByte1.length > getOutputBlockSize()) {
        arrayOfByte2 = new byte[arrayOfByte1.length - 1];
        System.arraycopy(arrayOfByte1, 1, arrayOfByte2, 0, arrayOfByte2.length);
        return arrayOfByte2;
      } 
      if (arrayOfByte1.length < getOutputBlockSize()) {
        arrayOfByte2 = new byte[getOutputBlockSize()];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, arrayOfByte2.length - arrayOfByte1.length, arrayOfByte1.length);
        return arrayOfByte2;
      } 
      return arrayOfByte1;
    } 
    if (arrayOfByte1[0] == 0) {
      arrayOfByte2 = new byte[arrayOfByte1.length - 1];
      System.arraycopy(arrayOfByte1, 1, arrayOfByte2, 0, arrayOfByte2.length);
    } else {
      arrayOfByte2 = new byte[arrayOfByte1.length];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte2.length);
    } 
    Arrays.fill(arrayOfByte1, (byte)0);
    return arrayOfByte2;
  }
  
  public BigInteger processBlock(BigInteger paramBigInteger) {
    if (this.key instanceof RSAPrivateCrtKeyParameters) {
      RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters)this.key;
      BigInteger bigInteger = rSAPrivateCrtKeyParameters.getPublicExponent();
      if (bigInteger != null) {
        BigInteger bigInteger1 = rSAPrivateCrtKeyParameters.getP();
        BigInteger bigInteger2 = rSAPrivateCrtKeyParameters.getQ();
        BigInteger bigInteger3 = rSAPrivateCrtKeyParameters.getDP();
        BigInteger bigInteger4 = rSAPrivateCrtKeyParameters.getDQ();
        BigInteger bigInteger5 = rSAPrivateCrtKeyParameters.getQInv();
        BigInteger bigInteger6 = paramBigInteger.remainder(bigInteger1).modPow(bigInteger3, bigInteger1);
        BigInteger bigInteger7 = paramBigInteger.remainder(bigInteger2).modPow(bigInteger4, bigInteger2);
        BigInteger bigInteger8 = bigInteger6.subtract(bigInteger7);
        bigInteger8 = bigInteger8.multiply(bigInteger5);
        bigInteger8 = bigInteger8.mod(bigInteger1);
        BigInteger bigInteger9 = bigInteger8.multiply(bigInteger2).add(bigInteger7);
        BigInteger bigInteger10 = bigInteger9.modPow(bigInteger, rSAPrivateCrtKeyParameters.getModulus());
        if (!bigInteger10.equals(paramBigInteger))
          throw new IllegalStateException("RSA engine faulty decryption/signing detected"); 
        return bigInteger9;
      } 
    } 
    return paramBigInteger.modPow(this.key.getExponent(), this.key.getModulus());
  }
  
  private CryptoServicePurpose getPurpose(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool1 = (paramBoolean1 && paramBoolean2) ? true : false;
    boolean bool2 = (!paramBoolean1 && paramBoolean2) ? true : false;
    boolean bool3 = (!paramBoolean1 && !paramBoolean2) ? true : false;
    return bool1 ? CryptoServicePurpose.SIGNING : (bool2 ? CryptoServicePurpose.ENCRYPTION : (bool3 ? CryptoServicePurpose.VERIFYING : CryptoServicePurpose.DECRYPTION));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\RSACoreEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */