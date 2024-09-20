package org.bouncycastle.crypto.tls;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;

public abstract class TlsRsaKeyExchange {
  public static final int PRE_MASTER_SECRET_LENGTH = 48;
  
  private static final BigInteger ONE = BigInteger.valueOf(1L);
  
  public static byte[] decryptPreMasterSecret(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, RSAKeyParameters paramRSAKeyParameters, int paramInt3, SecureRandom paramSecureRandom) {
    if (paramArrayOfbyte == null || paramInt2 < 1 || paramInt2 > getInputLimit(paramRSAKeyParameters) || paramInt1 < 0 || paramInt1 > paramArrayOfbyte.length - paramInt2)
      throw new IllegalArgumentException("input not a valid EncryptedPreMasterSecret"); 
    if (!paramRSAKeyParameters.isPrivate())
      throw new IllegalArgumentException("'privateKey' must be an RSA private key"); 
    BigInteger bigInteger = paramRSAKeyParameters.getModulus();
    int i = bigInteger.bitLength();
    if (i < 512)
      throw new IllegalArgumentException("'privateKey' must be at least 512 bits"); 
    int j = ConstraintUtils.bitsOfSecurityFor(bigInteger);
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("RSA", j, paramRSAKeyParameters, CryptoServicePurpose.DECRYPTION));
    if ((paramInt3 & 0xFFFF) != paramInt3)
      throw new IllegalArgumentException("'protocolVersion' must be a 16 bit value"); 
    paramSecureRandom = CryptoServicesRegistrar.getSecureRandom(paramSecureRandom);
    byte[] arrayOfByte = new byte[48];
    paramSecureRandom.nextBytes(arrayOfByte);
    try {
      BigInteger bigInteger1 = convertInput(bigInteger, paramArrayOfbyte, paramInt1, paramInt2);
      byte[] arrayOfByte1 = rsaBlinded(paramRSAKeyParameters, bigInteger1, paramSecureRandom);
      int k = (i - 1) / 8;
      int m = arrayOfByte1.length - 48;
      int n = checkPkcs1Encoding2(arrayOfByte1, k, 48);
      int i1 = -((Pack.bigEndianToShort(arrayOfByte1, m) ^ paramInt3) & 0xFFFF) >> 31;
      int i2 = n | i1;
      for (byte b = 0; b < 48; b++)
        arrayOfByte[b] = (byte)(arrayOfByte[b] & i2 | arrayOfByte1[m + b] & (i2 ^ 0xFFFFFFFF)); 
      Arrays.fill(arrayOfByte1, (byte)0);
    } catch (Exception exception) {}
    return arrayOfByte;
  }
  
  public static int getInputLimit(RSAKeyParameters paramRSAKeyParameters) {
    return (paramRSAKeyParameters.getModulus().bitLength() + 7) / 8;
  }
  
  private static int caddTo(int paramInt1, int paramInt2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    int i = paramInt2 & 0xFF;
    int j = 0;
    for (int k = paramInt1 - 1; k >= 0; k--) {
      j += (paramArrayOfbyte2[k] & 0xFF) + (paramArrayOfbyte1[k] & i);
      paramArrayOfbyte2[k] = (byte)j;
      j >>>= 8;
    } 
    return j;
  }
  
  private static int checkPkcs1Encoding2(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt1 - paramInt2 - 10;
    int j = paramArrayOfbyte.length - paramInt1;
    int k = paramArrayOfbyte.length - 1 - paramInt2;
    int m;
    for (m = 0; m < j; m++)
      i |= -(paramArrayOfbyte[m] & 0xFF); 
    i |= -(paramArrayOfbyte[j] & 0xFF ^ 0x2);
    for (m = j + 1; m < k; m++)
      i |= (paramArrayOfbyte[m] & 0xFF) - 1; 
    i |= -(paramArrayOfbyte[k] & 0xFF);
    return i >> 31;
  }
  
  private static BigInteger convertInput(BigInteger paramBigInteger, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    BigInteger bigInteger = BigIntegers.fromUnsignedByteArray(paramArrayOfbyte, paramInt1, paramInt2);
    if (bigInteger.compareTo(paramBigInteger) < 0)
      return bigInteger; 
    throw new DataLengthException("input too large for RSA cipher.");
  }
  
  private static BigInteger rsa(RSAKeyParameters paramRSAKeyParameters, BigInteger paramBigInteger) {
    return paramBigInteger.modPow(paramRSAKeyParameters.getExponent(), paramRSAKeyParameters.getModulus());
  }
  
  private static byte[] rsaBlinded(RSAKeyParameters paramRSAKeyParameters, BigInteger paramBigInteger, SecureRandom paramSecureRandom) {
    BigInteger bigInteger = paramRSAKeyParameters.getModulus();
    int i = bigInteger.bitLength() / 8 + 1;
    if (paramRSAKeyParameters instanceof RSAPrivateCrtKeyParameters) {
      RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters)paramRSAKeyParameters;
      BigInteger bigInteger1 = rSAPrivateCrtKeyParameters.getPublicExponent();
      if (bigInteger1 != null) {
        BigInteger bigInteger2 = BigIntegers.createRandomInRange(ONE, bigInteger.subtract(ONE), paramSecureRandom);
        BigInteger bigInteger3 = bigInteger2.modPow(bigInteger1, bigInteger);
        BigInteger bigInteger4 = BigIntegers.modOddInverse(bigInteger, bigInteger2);
        BigInteger bigInteger5 = bigInteger3.multiply(paramBigInteger).mod(bigInteger);
        BigInteger bigInteger6 = rsaCrt(rSAPrivateCrtKeyParameters, bigInteger5);
        BigInteger bigInteger7 = bigInteger4.add(ONE).multiply(bigInteger6).mod(bigInteger);
        byte[] arrayOfByte1 = toBytes(bigInteger6, i);
        byte[] arrayOfByte2 = toBytes(bigInteger, i);
        byte[] arrayOfByte3 = toBytes(bigInteger7, i);
        int j = subFrom(i, arrayOfByte1, arrayOfByte3);
        caddTo(i, j, arrayOfByte2, arrayOfByte3);
        return arrayOfByte3;
      } 
    } 
    return toBytes(rsa(paramRSAKeyParameters, paramBigInteger), i);
  }
  
  private static BigInteger rsaCrt(RSAPrivateCrtKeyParameters paramRSAPrivateCrtKeyParameters, BigInteger paramBigInteger) {
    BigInteger bigInteger1 = paramRSAPrivateCrtKeyParameters.getPublicExponent();
    BigInteger bigInteger2 = paramRSAPrivateCrtKeyParameters.getP();
    BigInteger bigInteger3 = paramRSAPrivateCrtKeyParameters.getQ();
    BigInteger bigInteger4 = paramRSAPrivateCrtKeyParameters.getDP();
    BigInteger bigInteger5 = paramRSAPrivateCrtKeyParameters.getDQ();
    BigInteger bigInteger6 = paramRSAPrivateCrtKeyParameters.getQInv();
    BigInteger bigInteger7 = paramBigInteger.remainder(bigInteger2).modPow(bigInteger4, bigInteger2);
    BigInteger bigInteger8 = paramBigInteger.remainder(bigInteger3).modPow(bigInteger5, bigInteger3);
    BigInteger bigInteger9 = bigInteger7.subtract(bigInteger8);
    bigInteger9 = bigInteger9.multiply(bigInteger6);
    bigInteger9 = bigInteger9.mod(bigInteger2);
    BigInteger bigInteger10 = bigInteger9.multiply(bigInteger3).add(bigInteger8);
    BigInteger bigInteger11 = bigInteger10.modPow(bigInteger1, paramRSAPrivateCrtKeyParameters.getModulus());
    if (!bigInteger11.equals(paramBigInteger))
      throw new IllegalStateException("RSA engine faulty decryption/signing detected"); 
    return bigInteger10;
  }
  
  private static int subFrom(int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    int i = 0;
    for (int j = paramInt - 1; j >= 0; j--) {
      i += (paramArrayOfbyte2[j] & 0xFF) - (paramArrayOfbyte1[j] & 0xFF);
      paramArrayOfbyte2[j] = (byte)i;
      i >>= 8;
    } 
    return i;
  }
  
  private static byte[] toBytes(BigInteger paramBigInteger, int paramInt) {
    byte[] arrayOfByte1 = paramBigInteger.toByteArray();
    byte[] arrayOfByte2 = new byte[paramInt];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, arrayOfByte2.length - arrayOfByte1.length, arrayOfByte1.length);
    return arrayOfByte2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\tls\TlsRsaKeyExchange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */