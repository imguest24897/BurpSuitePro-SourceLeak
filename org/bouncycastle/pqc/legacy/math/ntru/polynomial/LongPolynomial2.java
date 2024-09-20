package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import org.bouncycastle.util.Arrays;

public class LongPolynomial2 {
  private long[] coeffs;
  
  private int numCoeffs;
  
  public LongPolynomial2(IntegerPolynomial paramIntegerPolynomial) {
    this.numCoeffs = paramIntegerPolynomial.coeffs.length;
    this.coeffs = new long[(this.numCoeffs + 1) / 2];
    byte b1 = 0;
    byte b2 = 0;
    while (b2 < this.numCoeffs) {
      int i;
      for (i = paramIntegerPolynomial.coeffs[b2++]; i < 0; i += 2048);
      long l;
      for (l = (b2 < this.numCoeffs) ? paramIntegerPolynomial.coeffs[b2++] : 0L; l < 0L; l += 2048L);
      this.coeffs[b1] = i + (l << 24L);
      b1++;
    } 
  }
  
  private LongPolynomial2(long[] paramArrayOflong) {
    this.coeffs = paramArrayOflong;
  }
  
  private LongPolynomial2(int paramInt) {
    this.coeffs = new long[paramInt];
  }
  
  public LongPolynomial2 mult(LongPolynomial2 paramLongPolynomial2) {
    int i = this.coeffs.length;
    if (paramLongPolynomial2.coeffs.length != i || this.numCoeffs != paramLongPolynomial2.numCoeffs)
      throw new IllegalArgumentException("Number of coefficients must be the same"); 
    LongPolynomial2 longPolynomial2 = multRecursive(paramLongPolynomial2);
    if (longPolynomial2.coeffs.length > i)
      if (this.numCoeffs % 2 == 0) {
        for (int j = i; j < longPolynomial2.coeffs.length; j++)
          longPolynomial2.coeffs[j - i] = longPolynomial2.coeffs[j - i] + longPolynomial2.coeffs[j] & 0x7FF0007FFL; 
        longPolynomial2.coeffs = Arrays.copyOf(longPolynomial2.coeffs, i);
      } else {
        for (int j = i; j < longPolynomial2.coeffs.length; j++) {
          longPolynomial2.coeffs[j - i] = longPolynomial2.coeffs[j - i] + (longPolynomial2.coeffs[j - 1] >> 24L);
          longPolynomial2.coeffs[j - i] = longPolynomial2.coeffs[j - i] + ((longPolynomial2.coeffs[j] & 0x7FFL) << 24L);
          longPolynomial2.coeffs[j - i] = longPolynomial2.coeffs[j - i] & 0x7FF0007FFL;
        } 
        longPolynomial2.coeffs = Arrays.copyOf(longPolynomial2.coeffs, i);
        longPolynomial2.coeffs[longPolynomial2.coeffs.length - 1] = longPolynomial2.coeffs[longPolynomial2.coeffs.length - 1] & 0x7FFL;
      }  
    longPolynomial2 = new LongPolynomial2(longPolynomial2.coeffs);
    longPolynomial2.numCoeffs = this.numCoeffs;
    return longPolynomial2;
  }
  
  public IntegerPolynomial toIntegerPolynomial() {
    int[] arrayOfInt = new int[this.numCoeffs];
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.coeffs.length; b2++) {
      arrayOfInt[b1++] = (int)(this.coeffs[b2] & 0x7FFL);
      if (b1 < this.numCoeffs)
        arrayOfInt[b1++] = (int)(this.coeffs[b2] >> 24L & 0x7FFL); 
    } 
    return new IntegerPolynomial(arrayOfInt);
  }
  
  private LongPolynomial2 multRecursive(LongPolynomial2 paramLongPolynomial2) {
    long[] arrayOfLong1 = this.coeffs;
    long[] arrayOfLong2 = paramLongPolynomial2.coeffs;
    int i = paramLongPolynomial2.coeffs.length;
    if (i <= 32) {
      int k = 2 * i;
      LongPolynomial2 longPolynomial2 = new LongPolynomial2(new long[k]);
      for (byte b1 = 0; b1 < k; b1++) {
        for (int m = Math.max(0, b1 - i + 1); m <= Math.min(b1, i - 1); m++) {
          long l1 = arrayOfLong1[b1 - m] * arrayOfLong2[m];
          long l2 = l1 & 34342961152L + (l1 & 0x7FFL);
          long l3 = l1 >>> 48L & 0x7FFL;
          longPolynomial2.coeffs[b1] = longPolynomial2.coeffs[b1] + l2 & 0x7FF0007FFL;
          longPolynomial2.coeffs[b1 + 1] = longPolynomial2.coeffs[b1 + 1] + l3 & 0x7FF0007FFL;
        } 
      } 
      return longPolynomial2;
    } 
    int j = i / 2;
    LongPolynomial2 longPolynomial21 = new LongPolynomial2(Arrays.copyOf(arrayOfLong1, j));
    LongPolynomial2 longPolynomial22 = new LongPolynomial2(Arrays.copyOfRange(arrayOfLong1, j, i));
    LongPolynomial2 longPolynomial23 = new LongPolynomial2(Arrays.copyOf(arrayOfLong2, j));
    LongPolynomial2 longPolynomial24 = new LongPolynomial2(Arrays.copyOfRange(arrayOfLong2, j, i));
    LongPolynomial2 longPolynomial25 = (LongPolynomial2)longPolynomial21.clone();
    longPolynomial25.add(longPolynomial22);
    LongPolynomial2 longPolynomial26 = (LongPolynomial2)longPolynomial23.clone();
    longPolynomial26.add(longPolynomial24);
    LongPolynomial2 longPolynomial27 = longPolynomial21.multRecursive(longPolynomial23);
    LongPolynomial2 longPolynomial28 = longPolynomial22.multRecursive(longPolynomial24);
    LongPolynomial2 longPolynomial29 = longPolynomial25.multRecursive(longPolynomial26);
    longPolynomial29.sub(longPolynomial27);
    longPolynomial29.sub(longPolynomial28);
    LongPolynomial2 longPolynomial210 = new LongPolynomial2(2 * i);
    byte b;
    for (b = 0; b < longPolynomial27.coeffs.length; b++)
      longPolynomial210.coeffs[b] = longPolynomial27.coeffs[b] & 0x7FF0007FFL; 
    for (b = 0; b < longPolynomial29.coeffs.length; b++)
      longPolynomial210.coeffs[j + b] = longPolynomial210.coeffs[j + b] + longPolynomial29.coeffs[b] & 0x7FF0007FFL; 
    for (b = 0; b < longPolynomial28.coeffs.length; b++)
      longPolynomial210.coeffs[2 * j + b] = longPolynomial210.coeffs[2 * j + b] + longPolynomial28.coeffs[b] & 0x7FF0007FFL; 
    return longPolynomial210;
  }
  
  private void add(LongPolynomial2 paramLongPolynomial2) {
    if (paramLongPolynomial2.coeffs.length > this.coeffs.length)
      this.coeffs = Arrays.copyOf(this.coeffs, paramLongPolynomial2.coeffs.length); 
    for (byte b = 0; b < paramLongPolynomial2.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b] + paramLongPolynomial2.coeffs[b] & 0x7FF0007FFL; 
  }
  
  private void sub(LongPolynomial2 paramLongPolynomial2) {
    if (paramLongPolynomial2.coeffs.length > this.coeffs.length)
      this.coeffs = Arrays.copyOf(this.coeffs, paramLongPolynomial2.coeffs.length); 
    for (byte b = 0; b < paramLongPolynomial2.coeffs.length; b++)
      this.coeffs[b] = 140737496743936L + this.coeffs[b] - paramLongPolynomial2.coeffs[b] & 0x7FF0007FFL; 
  }
  
  public void subAnd(LongPolynomial2 paramLongPolynomial2, int paramInt) {
    long l = (paramInt << 24L) + paramInt;
    for (byte b = 0; b < paramLongPolynomial2.coeffs.length; b++)
      this.coeffs[b] = 140737496743936L + this.coeffs[b] - paramLongPolynomial2.coeffs[b] & l; 
  }
  
  public void mult2And(int paramInt) {
    long l = (paramInt << 24L) + paramInt;
    for (byte b = 0; b < this.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b] << 1L & l; 
  }
  
  public Object clone() {
    LongPolynomial2 longPolynomial2 = new LongPolynomial2((long[])this.coeffs.clone());
    longPolynomial2.numCoeffs = this.numCoeffs;
    return longPolynomial2;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof LongPolynomial2) ? Arrays.areEqual(this.coeffs, ((LongPolynomial2)paramObject).coeffs) : false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\polynomial\LongPolynomial2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */