package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import java.security.SecureRandom;
import org.bouncycastle.pqc.legacy.math.ntru.util.Util;
import org.bouncycastle.util.Arrays;

public class DenseTernaryPolynomial extends IntegerPolynomial implements TernaryPolynomial {
  DenseTernaryPolynomial(int paramInt) {
    super(paramInt);
    checkTernarity();
  }
  
  public DenseTernaryPolynomial(IntegerPolynomial paramIntegerPolynomial) {
    this(paramIntegerPolynomial.coeffs);
  }
  
  public DenseTernaryPolynomial(int[] paramArrayOfint) {
    super(paramArrayOfint);
    checkTernarity();
  }
  
  private void checkTernarity() {
    for (byte b = 0; b != this.coeffs.length; b++) {
      int i = this.coeffs[b];
      if (i < -1 || i > 1)
        throw new IllegalStateException("Illegal value: " + i + ", must be one of {-1, 0, 1}"); 
    } 
  }
  
  public static DenseTernaryPolynomial generateRandom(int paramInt1, int paramInt2, int paramInt3, SecureRandom paramSecureRandom) {
    int[] arrayOfInt = Util.generateRandomTernary(paramInt1, paramInt2, paramInt3, paramSecureRandom);
    return new DenseTernaryPolynomial(arrayOfInt);
  }
  
  public static DenseTernaryPolynomial generateRandom(int paramInt, SecureRandom paramSecureRandom) {
    DenseTernaryPolynomial denseTernaryPolynomial = new DenseTernaryPolynomial(paramInt);
    for (byte b = 0; b < paramInt; b++)
      denseTernaryPolynomial.coeffs[b] = paramSecureRandom.nextInt(3) - 1; 
    return denseTernaryPolynomial;
  }
  
  public IntegerPolynomial mult(IntegerPolynomial paramIntegerPolynomial, int paramInt) {
    if (paramInt == 2048) {
      IntegerPolynomial integerPolynomial = (IntegerPolynomial)paramIntegerPolynomial.clone();
      integerPolynomial.modPositive(2048);
      LongPolynomial5 longPolynomial5 = new LongPolynomial5(integerPolynomial);
      return longPolynomial5.mult(this).toIntegerPolynomial();
    } 
    return super.mult(paramIntegerPolynomial, paramInt);
  }
  
  public int[] getOnes() {
    int i = this.coeffs.length;
    int[] arrayOfInt = new int[i];
    byte b1 = 0;
    for (byte b2 = 0; b2 < i; b2++) {
      int j = this.coeffs[b2];
      if (j == 1)
        arrayOfInt[b1++] = b2; 
    } 
    return Arrays.copyOf(arrayOfInt, b1);
  }
  
  public int[] getNegOnes() {
    int i = this.coeffs.length;
    int[] arrayOfInt = new int[i];
    byte b1 = 0;
    for (byte b2 = 0; b2 < i; b2++) {
      int j = this.coeffs[b2];
      if (j == -1)
        arrayOfInt[b1++] = b2; 
    } 
    return Arrays.copyOf(arrayOfInt, b1);
  }
  
  public int size() {
    return this.coeffs.length;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\polynomial\DenseTernaryPolynomial.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */