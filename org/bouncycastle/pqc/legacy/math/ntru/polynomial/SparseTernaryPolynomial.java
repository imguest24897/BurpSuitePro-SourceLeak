package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.pqc.legacy.math.ntru.util.ArrayEncoder;
import org.bouncycastle.pqc.legacy.math.ntru.util.Util;
import org.bouncycastle.util.Arrays;

public class SparseTernaryPolynomial implements TernaryPolynomial {
  private static final int BITS_PER_INDEX = 11;
  
  private int N;
  
  private int[] ones;
  
  private int[] negOnes;
  
  SparseTernaryPolynomial(int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    this.N = paramInt;
    this.ones = paramArrayOfint1;
    this.negOnes = paramArrayOfint2;
  }
  
  public SparseTernaryPolynomial(IntegerPolynomial paramIntegerPolynomial) {
    this(paramIntegerPolynomial.coeffs);
  }
  
  public SparseTernaryPolynomial(int[] paramArrayOfint) {
    this.N = paramArrayOfint.length;
    this.ones = new int[this.N];
    this.negOnes = new int[this.N];
    byte b1 = 0;
    byte b2 = 0;
    for (byte b3 = 0; b3 < this.N; b3++) {
      int i = paramArrayOfint[b3];
      switch (i) {
        case 1:
          this.ones[b1++] = b3;
          break;
        case -1:
          this.negOnes[b2++] = b3;
          break;
        case 0:
          break;
        default:
          throw new IllegalArgumentException("Illegal value: " + i + ", must be one of {-1, 0, 1}");
      } 
    } 
    this.ones = Arrays.copyOf(this.ones, b1);
    this.negOnes = Arrays.copyOf(this.negOnes, b2);
  }
  
  public static SparseTernaryPolynomial fromBinary(InputStream paramInputStream, int paramInt1, int paramInt2, int paramInt3) throws IOException {
    char c = 'ࠀ';
    int i = 32 - Integer.numberOfLeadingZeros(c - 1);
    int j = (paramInt2 * i + 7) / 8;
    byte[] arrayOfByte1 = Util.readFullLength(paramInputStream, j);
    int[] arrayOfInt1 = ArrayEncoder.decodeModQ(arrayOfByte1, paramInt2, c);
    int k = (paramInt3 * i + 7) / 8;
    byte[] arrayOfByte2 = Util.readFullLength(paramInputStream, k);
    int[] arrayOfInt2 = ArrayEncoder.decodeModQ(arrayOfByte2, paramInt3, c);
    return new SparseTernaryPolynomial(paramInt1, arrayOfInt1, arrayOfInt2);
  }
  
  public static SparseTernaryPolynomial generateRandom(int paramInt1, int paramInt2, int paramInt3, SecureRandom paramSecureRandom) {
    int[] arrayOfInt = Util.generateRandomTernary(paramInt1, paramInt2, paramInt3, paramSecureRandom);
    return new SparseTernaryPolynomial(arrayOfInt);
  }
  
  public IntegerPolynomial mult(IntegerPolynomial paramIntegerPolynomial) {
    int[] arrayOfInt1 = paramIntegerPolynomial.coeffs;
    if (arrayOfInt1.length != this.N)
      throw new IllegalArgumentException("Number of coefficients must be the same"); 
    int[] arrayOfInt2 = new int[this.N];
    byte b;
    for (b = 0; b != this.ones.length; b++) {
      int i = this.ones[b];
      int j = this.N - 1 - i;
      for (int k = this.N - 1; k >= 0; k--) {
        arrayOfInt2[k] = arrayOfInt2[k] + arrayOfInt1[j];
        if (--j < 0)
          j = this.N - 1; 
      } 
    } 
    for (b = 0; b != this.negOnes.length; b++) {
      int i = this.negOnes[b];
      int j = this.N - 1 - i;
      for (int k = this.N - 1; k >= 0; k--) {
        arrayOfInt2[k] = arrayOfInt2[k] - arrayOfInt1[j];
        if (--j < 0)
          j = this.N - 1; 
      } 
    } 
    return new IntegerPolynomial(arrayOfInt2);
  }
  
  public IntegerPolynomial mult(IntegerPolynomial paramIntegerPolynomial, int paramInt) {
    IntegerPolynomial integerPolynomial = mult(paramIntegerPolynomial);
    integerPolynomial.mod(paramInt);
    return integerPolynomial;
  }
  
  public BigIntPolynomial mult(BigIntPolynomial paramBigIntPolynomial) {
    BigInteger[] arrayOfBigInteger1 = paramBigIntPolynomial.coeffs;
    if (arrayOfBigInteger1.length != this.N)
      throw new IllegalArgumentException("Number of coefficients must be the same"); 
    BigInteger[] arrayOfBigInteger2 = new BigInteger[this.N];
    byte b;
    for (b = 0; b < this.N; b++)
      arrayOfBigInteger2[b] = BigInteger.ZERO; 
    for (b = 0; b != this.ones.length; b++) {
      int i = this.ones[b];
      int j = this.N - 1 - i;
      for (int k = this.N - 1; k >= 0; k--) {
        arrayOfBigInteger2[k] = arrayOfBigInteger2[k].add(arrayOfBigInteger1[j]);
        if (--j < 0)
          j = this.N - 1; 
      } 
    } 
    for (b = 0; b != this.negOnes.length; b++) {
      int i = this.negOnes[b];
      int j = this.N - 1 - i;
      for (int k = this.N - 1; k >= 0; k--) {
        arrayOfBigInteger2[k] = arrayOfBigInteger2[k].subtract(arrayOfBigInteger1[j]);
        if (--j < 0)
          j = this.N - 1; 
      } 
    } 
    return new BigIntPolynomial(arrayOfBigInteger2);
  }
  
  public int[] getOnes() {
    return this.ones;
  }
  
  public int[] getNegOnes() {
    return this.negOnes;
  }
  
  public byte[] toBinary() {
    char c = 'ࠀ';
    byte[] arrayOfByte1 = ArrayEncoder.encodeModQ(this.ones, c);
    byte[] arrayOfByte2 = ArrayEncoder.encodeModQ(this.negOnes, c);
    byte[] arrayOfByte3 = Arrays.copyOf(arrayOfByte1, arrayOfByte1.length + arrayOfByte2.length);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte3, arrayOfByte1.length, arrayOfByte2.length);
    return arrayOfByte3;
  }
  
  public IntegerPolynomial toIntegerPolynomial() {
    int[] arrayOfInt = new int[this.N];
    byte b;
    for (b = 0; b != this.ones.length; b++) {
      int i = this.ones[b];
      arrayOfInt[i] = 1;
    } 
    for (b = 0; b != this.negOnes.length; b++) {
      int i = this.negOnes[b];
      arrayOfInt[i] = -1;
    } 
    return new IntegerPolynomial(arrayOfInt);
  }
  
  public int size() {
    return this.N;
  }
  
  public void clear() {
    byte b;
    for (b = 0; b < this.ones.length; b++)
      this.ones[b] = 0; 
    for (b = 0; b < this.negOnes.length; b++)
      this.negOnes[b] = 0; 
  }
  
  public int hashCode() {
    null = 1;
    null = 31 * null + this.N;
    null = 31 * null + Arrays.hashCode(this.negOnes);
    return 31 * null + Arrays.hashCode(this.ones);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    SparseTernaryPolynomial sparseTernaryPolynomial = (SparseTernaryPolynomial)paramObject;
    return (this.N != sparseTernaryPolynomial.N) ? false : (!Arrays.areEqual(this.negOnes, sparseTernaryPolynomial.negOnes) ? false : (!!Arrays.areEqual(this.ones, sparseTernaryPolynomial.ones)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\polynomial\SparseTernaryPolynomial.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */