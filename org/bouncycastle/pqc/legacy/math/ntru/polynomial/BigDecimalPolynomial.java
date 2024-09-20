package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import java.math.BigDecimal;

public class BigDecimalPolynomial {
  private static final BigDecimal ZERO = new BigDecimal("0");
  
  private static final BigDecimal ONE_HALF = new BigDecimal("0.5");
  
  BigDecimal[] coeffs;
  
  BigDecimalPolynomial(int paramInt) {
    this.coeffs = new BigDecimal[paramInt];
    for (byte b = 0; b < paramInt; b++)
      this.coeffs[b] = ZERO; 
  }
  
  BigDecimalPolynomial(BigDecimal[] paramArrayOfBigDecimal) {
    this.coeffs = paramArrayOfBigDecimal;
  }
  
  public BigDecimalPolynomial(BigIntPolynomial paramBigIntPolynomial) {
    int i = paramBigIntPolynomial.coeffs.length;
    this.coeffs = new BigDecimal[i];
    for (byte b = 0; b < i; b++)
      this.coeffs[b] = new BigDecimal(paramBigIntPolynomial.coeffs[b]); 
  }
  
  public void halve() {
    for (byte b = 0; b < this.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b].multiply(ONE_HALF); 
  }
  
  public BigDecimalPolynomial mult(BigIntPolynomial paramBigIntPolynomial) {
    return mult(new BigDecimalPolynomial(paramBigIntPolynomial));
  }
  
  public BigDecimalPolynomial mult(BigDecimalPolynomial paramBigDecimalPolynomial) {
    int i = this.coeffs.length;
    if (paramBigDecimalPolynomial.coeffs.length != i)
      throw new IllegalArgumentException("Number of coefficients must be the same"); 
    BigDecimalPolynomial bigDecimalPolynomial = multRecursive(paramBigDecimalPolynomial);
    if (bigDecimalPolynomial.coeffs.length > i) {
      for (int j = i; j < bigDecimalPolynomial.coeffs.length; j++)
        bigDecimalPolynomial.coeffs[j - i] = bigDecimalPolynomial.coeffs[j - i].add(bigDecimalPolynomial.coeffs[j]); 
      bigDecimalPolynomial.coeffs = copyOf(bigDecimalPolynomial.coeffs, i);
    } 
    return bigDecimalPolynomial;
  }
  
  private BigDecimalPolynomial multRecursive(BigDecimalPolynomial paramBigDecimalPolynomial) {
    BigDecimal[] arrayOfBigDecimal1 = this.coeffs;
    BigDecimal[] arrayOfBigDecimal2 = paramBigDecimalPolynomial.coeffs;
    int i = paramBigDecimalPolynomial.coeffs.length;
    if (i <= 1) {
      BigDecimal[] arrayOfBigDecimal = (BigDecimal[])this.coeffs.clone();
      for (byte b1 = 0; b1 < this.coeffs.length; b1++)
        arrayOfBigDecimal[b1] = arrayOfBigDecimal[b1].multiply(paramBigDecimalPolynomial.coeffs[0]); 
      return new BigDecimalPolynomial(arrayOfBigDecimal);
    } 
    int j = i / 2;
    BigDecimalPolynomial bigDecimalPolynomial1 = new BigDecimalPolynomial(copyOf(arrayOfBigDecimal1, j));
    BigDecimalPolynomial bigDecimalPolynomial2 = new BigDecimalPolynomial(copyOfRange(arrayOfBigDecimal1, j, i));
    BigDecimalPolynomial bigDecimalPolynomial3 = new BigDecimalPolynomial(copyOf(arrayOfBigDecimal2, j));
    BigDecimalPolynomial bigDecimalPolynomial4 = new BigDecimalPolynomial(copyOfRange(arrayOfBigDecimal2, j, i));
    BigDecimalPolynomial bigDecimalPolynomial5 = (BigDecimalPolynomial)bigDecimalPolynomial1.clone();
    bigDecimalPolynomial5.add(bigDecimalPolynomial2);
    BigDecimalPolynomial bigDecimalPolynomial6 = (BigDecimalPolynomial)bigDecimalPolynomial3.clone();
    bigDecimalPolynomial6.add(bigDecimalPolynomial4);
    BigDecimalPolynomial bigDecimalPolynomial7 = bigDecimalPolynomial1.multRecursive(bigDecimalPolynomial3);
    BigDecimalPolynomial bigDecimalPolynomial8 = bigDecimalPolynomial2.multRecursive(bigDecimalPolynomial4);
    BigDecimalPolynomial bigDecimalPolynomial9 = bigDecimalPolynomial5.multRecursive(bigDecimalPolynomial6);
    bigDecimalPolynomial9.sub(bigDecimalPolynomial7);
    bigDecimalPolynomial9.sub(bigDecimalPolynomial8);
    BigDecimalPolynomial bigDecimalPolynomial10 = new BigDecimalPolynomial(2 * i - 1);
    byte b;
    for (b = 0; b < bigDecimalPolynomial7.coeffs.length; b++)
      bigDecimalPolynomial10.coeffs[b] = bigDecimalPolynomial7.coeffs[b]; 
    for (b = 0; b < bigDecimalPolynomial9.coeffs.length; b++)
      bigDecimalPolynomial10.coeffs[j + b] = bigDecimalPolynomial10.coeffs[j + b].add(bigDecimalPolynomial9.coeffs[b]); 
    for (b = 0; b < bigDecimalPolynomial8.coeffs.length; b++)
      bigDecimalPolynomial10.coeffs[2 * j + b] = bigDecimalPolynomial10.coeffs[2 * j + b].add(bigDecimalPolynomial8.coeffs[b]); 
    return bigDecimalPolynomial10;
  }
  
  public void add(BigDecimalPolynomial paramBigDecimalPolynomial) {
    if (paramBigDecimalPolynomial.coeffs.length > this.coeffs.length) {
      int i = this.coeffs.length;
      this.coeffs = copyOf(this.coeffs, paramBigDecimalPolynomial.coeffs.length);
      for (int j = i; j < this.coeffs.length; j++)
        this.coeffs[j] = ZERO; 
    } 
    for (byte b = 0; b < paramBigDecimalPolynomial.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b].add(paramBigDecimalPolynomial.coeffs[b]); 
  }
  
  void sub(BigDecimalPolynomial paramBigDecimalPolynomial) {
    if (paramBigDecimalPolynomial.coeffs.length > this.coeffs.length) {
      int i = this.coeffs.length;
      this.coeffs = copyOf(this.coeffs, paramBigDecimalPolynomial.coeffs.length);
      for (int j = i; j < this.coeffs.length; j++)
        this.coeffs[j] = ZERO; 
    } 
    for (byte b = 0; b < paramBigDecimalPolynomial.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b].subtract(paramBigDecimalPolynomial.coeffs[b]); 
  }
  
  public BigIntPolynomial round() {
    int i = this.coeffs.length;
    BigIntPolynomial bigIntPolynomial = new BigIntPolynomial(i);
    for (byte b = 0; b < i; b++)
      bigIntPolynomial.coeffs[b] = this.coeffs[b].setScale(0, 6).toBigInteger(); 
    return bigIntPolynomial;
  }
  
  public Object clone() {
    return new BigDecimalPolynomial((BigDecimal[])this.coeffs.clone());
  }
  
  private BigDecimal[] copyOf(BigDecimal[] paramArrayOfBigDecimal, int paramInt) {
    BigDecimal[] arrayOfBigDecimal = new BigDecimal[paramInt];
    System.arraycopy(paramArrayOfBigDecimal, 0, arrayOfBigDecimal, 0, (paramArrayOfBigDecimal.length < paramInt) ? paramArrayOfBigDecimal.length : paramInt);
    return arrayOfBigDecimal;
  }
  
  private BigDecimal[] copyOfRange(BigDecimal[] paramArrayOfBigDecimal, int paramInt1, int paramInt2) {
    int i = paramInt2 - paramInt1;
    BigDecimal[] arrayOfBigDecimal = new BigDecimal[paramInt2 - paramInt1];
    System.arraycopy(paramArrayOfBigDecimal, paramInt1, arrayOfBigDecimal, 0, (paramArrayOfBigDecimal.length - paramInt1 < i) ? (paramArrayOfBigDecimal.length - paramInt1) : i);
    return arrayOfBigDecimal;
  }
  
  public BigDecimal[] getCoeffs() {
    BigDecimal[] arrayOfBigDecimal = new BigDecimal[this.coeffs.length];
    System.arraycopy(this.coeffs, 0, arrayOfBigDecimal, 0, this.coeffs.length);
    return arrayOfBigDecimal;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\polynomial\BigDecimalPolynomial.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */