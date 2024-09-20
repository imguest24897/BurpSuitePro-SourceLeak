package org.bouncycastle.crypto.util;

import java.math.BigInteger;
import org.bouncycastle.util.BigIntegers;

public class RadixConverter {
  private static final double LOG_LONG_MAX_VALUE = Math.log(9.223372036854776E18D);
  
  private static final int DEFAULT_POWERS_TO_CACHE = 10;
  
  private final int digitsGroupLength;
  
  private final BigInteger digitsGroupSpaceSize;
  
  private final int radix;
  
  private final BigInteger[] digitsGroupSpacePowers;
  
  public RadixConverter(int paramInt1, int paramInt2) {
    this.radix = paramInt1;
    this.digitsGroupLength = (int)Math.floor(LOG_LONG_MAX_VALUE / Math.log(paramInt1));
    this.digitsGroupSpaceSize = BigInteger.valueOf(paramInt1).pow(this.digitsGroupLength);
    this.digitsGroupSpacePowers = precomputeDigitsGroupPowers(paramInt2, this.digitsGroupSpaceSize);
  }
  
  public RadixConverter(int paramInt) {
    this(paramInt, 10);
  }
  
  public int getRadix() {
    return this.radix;
  }
  
  public void toEncoding(BigInteger paramBigInteger, int paramInt, short[] paramArrayOfshort) {
    if (paramBigInteger.signum() < 0)
      throw new IllegalArgumentException(); 
    int i = paramInt - 1;
    while (true) {
      if (paramBigInteger.equals(BigInteger.ZERO)) {
        paramArrayOfshort[i--] = 0;
      } else {
        BigInteger[] arrayOfBigInteger = paramBigInteger.divideAndRemainder(this.digitsGroupSpaceSize);
        paramBigInteger = arrayOfBigInteger[0];
        i = toEncoding(arrayOfBigInteger[1].longValue(), i, paramArrayOfshort);
      } 
      if (i < 0) {
        if (paramBigInteger.signum() != 0)
          throw new IllegalArgumentException(); 
        return;
      } 
    } 
  }
  
  private int toEncoding(long paramLong, int paramInt, short[] paramArrayOfshort) {
    for (byte b = 0; b < this.digitsGroupLength && paramInt >= 0; b++) {
      if (paramLong == 0L) {
        paramArrayOfshort[paramInt--] = 0;
      } else {
        paramArrayOfshort[paramInt--] = (short)(int)(paramLong % this.radix);
        paramLong /= this.radix;
      } 
    } 
    if (paramLong != 0L)
      throw new IllegalStateException("Failed to convert decimal number"); 
    return paramInt;
  }
  
  public BigInteger fromEncoding(short[] paramArrayOfshort) {
    BigInteger bigInteger1 = BigIntegers.ONE;
    BigInteger bigInteger2 = null;
    byte b = 0;
    int i = paramArrayOfshort.length;
    int j;
    for (j = i - this.digitsGroupLength; j > -this.digitsGroupLength; j -= this.digitsGroupLength) {
      int k = this.digitsGroupLength;
      if (j < 0) {
        k = this.digitsGroupLength + j;
        j = 0;
      } 
      int m = Math.min(j + k, i);
      long l = fromEncoding(j, m, paramArrayOfshort);
      BigInteger bigInteger = BigInteger.valueOf(l);
      if (!b) {
        bigInteger2 = bigInteger;
      } else {
        bigInteger1 = (b <= this.digitsGroupSpacePowers.length) ? this.digitsGroupSpacePowers[b - 1] : bigInteger1.multiply(this.digitsGroupSpaceSize);
        bigInteger2 = bigInteger2.add(bigInteger.multiply(bigInteger1));
      } 
      b++;
    } 
    return bigInteger2;
  }
  
  public int getDigitsGroupLength() {
    return this.digitsGroupLength;
  }
  
  private long fromEncoding(int paramInt1, int paramInt2, short[] paramArrayOfshort) {
    long l = 0L;
    for (int i = paramInt1; i < paramInt2; i++)
      l = l * this.radix + (paramArrayOfshort[i] & 0xFFFF); 
    return l;
  }
  
  private BigInteger[] precomputeDigitsGroupPowers(int paramInt, BigInteger paramBigInteger) {
    BigInteger[] arrayOfBigInteger = new BigInteger[paramInt];
    BigInteger bigInteger = paramBigInteger;
    for (byte b = 0; b < paramInt; b++) {
      arrayOfBigInteger[b] = bigInteger;
      bigInteger = bigInteger.multiply(paramBigInteger);
    } 
    return arrayOfBigInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypt\\util\RadixConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */