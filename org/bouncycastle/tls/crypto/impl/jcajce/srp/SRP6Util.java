package org.bouncycastle.tls.crypto.impl.jcajce.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.util.BigIntegers;

class SRP6Util {
  private static final byte[] colon = new byte[] { 58 };
  
  private static BigInteger ZERO = BigInteger.valueOf(0L);
  
  private static BigInteger ONE = BigInteger.valueOf(1L);
  
  public static BigInteger calculateK(TlsHash paramTlsHash, BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    return hashPaddedPair(paramTlsHash, paramBigInteger1, paramBigInteger1, paramBigInteger2);
  }
  
  public static BigInteger calculateU(TlsHash paramTlsHash, BigInteger paramBigInteger1, BigInteger paramBigInteger2, BigInteger paramBigInteger3) {
    return hashPaddedPair(paramTlsHash, paramBigInteger1, paramBigInteger2, paramBigInteger3);
  }
  
  public static BigInteger calculateX(TlsHash paramTlsHash, BigInteger paramBigInteger, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    paramTlsHash.update(paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
    paramTlsHash.update(colon, 0, 1);
    paramTlsHash.update(paramArrayOfbyte3, 0, paramArrayOfbyte3.length);
    byte[] arrayOfByte = paramTlsHash.calculateHash();
    paramTlsHash.update(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    paramTlsHash.update(arrayOfByte, 0, arrayOfByte.length);
    return new BigInteger(1, paramTlsHash.calculateHash());
  }
  
  public static BigInteger generatePrivateValue(BigInteger paramBigInteger1, BigInteger paramBigInteger2, SecureRandom paramSecureRandom) {
    int i = Math.min(256, paramBigInteger1.bitLength() / 2);
    BigInteger bigInteger1 = ONE.shiftLeft(i - 1);
    BigInteger bigInteger2 = paramBigInteger1.subtract(ONE);
    return BigIntegers.createRandomInRange(bigInteger1, bigInteger2, paramSecureRandom);
  }
  
  public static BigInteger validatePublicValue(BigInteger paramBigInteger1, BigInteger paramBigInteger2) throws IllegalArgumentException {
    paramBigInteger2 = paramBigInteger2.mod(paramBigInteger1);
    if (paramBigInteger2.equals(ZERO))
      throw new IllegalArgumentException("Invalid public value: 0"); 
    return paramBigInteger2;
  }
  
  public static BigInteger calculateM1(TlsHash paramTlsHash, BigInteger paramBigInteger1, BigInteger paramBigInteger2, BigInteger paramBigInteger3, BigInteger paramBigInteger4) {
    return hashPaddedTriplet(paramTlsHash, paramBigInteger1, paramBigInteger2, paramBigInteger3, paramBigInteger4);
  }
  
  public static BigInteger calculateM2(TlsHash paramTlsHash, BigInteger paramBigInteger1, BigInteger paramBigInteger2, BigInteger paramBigInteger3, BigInteger paramBigInteger4) {
    return hashPaddedTriplet(paramTlsHash, paramBigInteger1, paramBigInteger2, paramBigInteger3, paramBigInteger4);
  }
  
  public static BigInteger calculateKey(TlsHash paramTlsHash, BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    int i = (paramBigInteger1.bitLength() + 7) / 8;
    byte[] arrayOfByte = getPadded(paramBigInteger2, i);
    paramTlsHash.update(arrayOfByte, 0, arrayOfByte.length);
    return new BigInteger(1, paramTlsHash.calculateHash());
  }
  
  private static BigInteger hashPaddedTriplet(TlsHash paramTlsHash, BigInteger paramBigInteger1, BigInteger paramBigInteger2, BigInteger paramBigInteger3, BigInteger paramBigInteger4) {
    int i = (paramBigInteger1.bitLength() + 7) / 8;
    byte[] arrayOfByte1 = getPadded(paramBigInteger2, i);
    byte[] arrayOfByte2 = getPadded(paramBigInteger3, i);
    byte[] arrayOfByte3 = getPadded(paramBigInteger4, i);
    paramTlsHash.update(arrayOfByte1, 0, arrayOfByte1.length);
    paramTlsHash.update(arrayOfByte2, 0, arrayOfByte2.length);
    paramTlsHash.update(arrayOfByte3, 0, arrayOfByte3.length);
    return new BigInteger(1, paramTlsHash.calculateHash());
  }
  
  private static BigInteger hashPaddedPair(TlsHash paramTlsHash, BigInteger paramBigInteger1, BigInteger paramBigInteger2, BigInteger paramBigInteger3) {
    int i = (paramBigInteger1.bitLength() + 7) / 8;
    byte[] arrayOfByte1 = getPadded(paramBigInteger2, i);
    byte[] arrayOfByte2 = getPadded(paramBigInteger3, i);
    paramTlsHash.update(arrayOfByte1, 0, arrayOfByte1.length);
    paramTlsHash.update(arrayOfByte2, 0, arrayOfByte2.length);
    return new BigInteger(1, paramTlsHash.calculateHash());
  }
  
  private static byte[] getPadded(BigInteger paramBigInteger, int paramInt) {
    byte[] arrayOfByte = BigIntegers.asUnsignedByteArray(paramBigInteger);
    if (arrayOfByte.length < paramInt) {
      byte[] arrayOfByte1 = new byte[paramInt];
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, paramInt - arrayOfByte.length, arrayOfByte.length);
      arrayOfByte = arrayOfByte1;
    } 
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\srp\SRP6Util.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */