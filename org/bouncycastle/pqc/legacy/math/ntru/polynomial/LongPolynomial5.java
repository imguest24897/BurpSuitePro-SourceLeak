package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import org.bouncycastle.util.Arrays;

public class LongPolynomial5 {
  private long[] coeffs;
  
  private int numCoeffs;
  
  public LongPolynomial5(IntegerPolynomial paramIntegerPolynomial) {
    this.numCoeffs = paramIntegerPolynomial.coeffs.length;
    this.coeffs = new long[(this.numCoeffs + 4) / 5];
    byte b1 = 0;
    byte b2 = 0;
    for (byte b3 = 0; b3 < this.numCoeffs; b3++) {
      this.coeffs[b1] = this.coeffs[b1] | paramIntegerPolynomial.coeffs[b3] << b2;
      b2 += true;
      if (b2 >= 60) {
        b2 = 0;
        b1++;
      } 
    } 
  }
  
  private LongPolynomial5(long[] paramArrayOflong, int paramInt) {
    this.coeffs = paramArrayOflong;
    this.numCoeffs = paramInt;
  }
  
  public LongPolynomial5 mult(TernaryPolynomial paramTernaryPolynomial) {
    long[][] arrayOfLong = new long[5][this.coeffs.length + (paramTernaryPolynomial.size() + 4) / 5 - 1];
    int[] arrayOfInt1 = paramTernaryPolynomial.getOnes();
    for (byte b1 = 0; b1 != arrayOfInt1.length; b1++) {
      int k = arrayOfInt1[b1];
      int m = k / 5;
      int n = k - m * 5;
      for (byte b = 0; b < this.coeffs.length; b++) {
        arrayOfLong[n][m] = arrayOfLong[n][m] + this.coeffs[b] & 0x7FF7FF7FF7FF7FFL;
        m++;
      } 
    } 
    int[] arrayOfInt2 = paramTernaryPolynomial.getNegOnes();
    for (byte b2 = 0; b2 != arrayOfInt2.length; b2++) {
      int k = arrayOfInt2[b2];
      int m = k / 5;
      int n = k - m * 5;
      for (byte b = 0; b < this.coeffs.length; b++) {
        arrayOfLong[n][m] = 576601524159907840L + arrayOfLong[n][m] - this.coeffs[b] & 0x7FF7FF7FF7FF7FFL;
        m++;
      } 
    } 
    long[] arrayOfLong1 = Arrays.copyOf(arrayOfLong[0], (arrayOfLong[0]).length + 1);
    int i;
    for (i = 1; i <= 4; i++) {
      int k = i * 12;
      int m = 60 - k;
      long l = (1L << m) - 1L;
      int n = (arrayOfLong[i]).length;
      for (byte b = 0; b < n; b++) {
        long l1 = arrayOfLong[i][b] >> m;
        long l2 = arrayOfLong[i][b] & l;
        arrayOfLong1[b] = arrayOfLong1[b] + (l2 << k) & 0x7FF7FF7FF7FF7FFL;
        int i1 = b + 1;
        arrayOfLong1[i1] = arrayOfLong1[i1] + l1 & 0x7FF7FF7FF7FF7FFL;
      } 
    } 
    i = 12 * this.numCoeffs % 5;
    for (int j = this.coeffs.length - 1; j < arrayOfLong1.length; j++) {
      long l1;
      int k;
      if (j == this.coeffs.length - 1) {
        l1 = (this.numCoeffs == 5) ? 0L : (arrayOfLong1[j] >> i);
        k = 0;
      } else {
        l1 = arrayOfLong1[j];
        k = j * 5 - this.numCoeffs;
      } 
      int m = k / 5;
      int n = k - m * 5;
      long l2 = l1 << 12 * n;
      long l3 = l1 >> 12 * (5 - n);
      arrayOfLong1[m] = arrayOfLong1[m] + l2 & 0x7FF7FF7FF7FF7FFL;
      int i1 = m + 1;
      if (i1 < this.coeffs.length)
        arrayOfLong1[i1] = arrayOfLong1[i1] + l3 & 0x7FF7FF7FF7FF7FFL; 
    } 
    return new LongPolynomial5(arrayOfLong1, this.numCoeffs);
  }
  
  public IntegerPolynomial toIntegerPolynomial() {
    int[] arrayOfInt = new int[this.numCoeffs];
    byte b1 = 0;
    byte b2 = 0;
    for (byte b3 = 0; b3 < this.numCoeffs; b3++) {
      arrayOfInt[b3] = (int)(this.coeffs[b1] >> b2 & 0x7FFL);
      b2 += true;
      if (b2 >= 60) {
        b2 = 0;
        b1++;
      } 
    } 
    return new IntegerPolynomial(arrayOfInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\polynomial\LongPolynomial5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */