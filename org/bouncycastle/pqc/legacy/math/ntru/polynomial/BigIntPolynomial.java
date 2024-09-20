package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Arrays;

public class BigIntPolynomial {
  private static final double LOG_10_2 = Math.log10(2.0D);
  
  BigInteger[] coeffs;
  
  BigIntPolynomial(int paramInt) {
    this.coeffs = new BigInteger[paramInt];
    for (byte b = 0; b < paramInt; b++)
      this.coeffs[b] = Constants.BIGINT_ZERO; 
  }
  
  BigIntPolynomial(BigInteger[] paramArrayOfBigInteger) {
    this.coeffs = paramArrayOfBigInteger;
  }
  
  public BigIntPolynomial(IntegerPolynomial paramIntegerPolynomial) {
    this.coeffs = new BigInteger[paramIntegerPolynomial.coeffs.length];
    for (byte b = 0; b < this.coeffs.length; b++)
      this.coeffs[b] = BigInteger.valueOf(paramIntegerPolynomial.coeffs[b]); 
  }
  
  static BigIntPolynomial generateRandomSmall(int paramInt1, int paramInt2, int paramInt3) {
    ArrayList<BigInteger> arrayList = new ArrayList();
    byte b1;
    for (b1 = 0; b1 < paramInt2; b1++)
      arrayList.add(Constants.BIGINT_ONE); 
    for (b1 = 0; b1 < paramInt3; b1++)
      arrayList.add(BigInteger.valueOf(-1L)); 
    while (arrayList.size() < paramInt1)
      arrayList.add(Constants.BIGINT_ZERO); 
    Collections.shuffle(arrayList, CryptoServicesRegistrar.getSecureRandom());
    BigIntPolynomial bigIntPolynomial = new BigIntPolynomial(paramInt1);
    for (byte b2 = 0; b2 < arrayList.size(); b2++)
      bigIntPolynomial.coeffs[b2] = arrayList.get(b2); 
    return bigIntPolynomial;
  }
  
  public BigIntPolynomial mult(BigIntPolynomial paramBigIntPolynomial) {
    int i = this.coeffs.length;
    if (paramBigIntPolynomial.coeffs.length != i)
      throw new IllegalArgumentException("Number of coefficients must be the same"); 
    BigIntPolynomial bigIntPolynomial = multRecursive(paramBigIntPolynomial);
    if (bigIntPolynomial.coeffs.length > i) {
      for (int j = i; j < bigIntPolynomial.coeffs.length; j++)
        bigIntPolynomial.coeffs[j - i] = bigIntPolynomial.coeffs[j - i].add(bigIntPolynomial.coeffs[j]); 
      bigIntPolynomial.coeffs = Arrays.copyOf(bigIntPolynomial.coeffs, i);
    } 
    return bigIntPolynomial;
  }
  
  private BigIntPolynomial multRecursive(BigIntPolynomial paramBigIntPolynomial) {
    BigInteger[] arrayOfBigInteger1 = this.coeffs;
    BigInteger[] arrayOfBigInteger2 = paramBigIntPolynomial.coeffs;
    int i = paramBigIntPolynomial.coeffs.length;
    if (i <= 1) {
      BigInteger[] arrayOfBigInteger = Arrays.clone(this.coeffs);
      for (byte b1 = 0; b1 < this.coeffs.length; b1++)
        arrayOfBigInteger[b1] = arrayOfBigInteger[b1].multiply(paramBigIntPolynomial.coeffs[0]); 
      return new BigIntPolynomial(arrayOfBigInteger);
    } 
    int j = i / 2;
    BigIntPolynomial bigIntPolynomial1 = new BigIntPolynomial(Arrays.copyOf(arrayOfBigInteger1, j));
    BigIntPolynomial bigIntPolynomial2 = new BigIntPolynomial(Arrays.copyOfRange(arrayOfBigInteger1, j, i));
    BigIntPolynomial bigIntPolynomial3 = new BigIntPolynomial(Arrays.copyOf(arrayOfBigInteger2, j));
    BigIntPolynomial bigIntPolynomial4 = new BigIntPolynomial(Arrays.copyOfRange(arrayOfBigInteger2, j, i));
    BigIntPolynomial bigIntPolynomial5 = (BigIntPolynomial)bigIntPolynomial1.clone();
    bigIntPolynomial5.add(bigIntPolynomial2);
    BigIntPolynomial bigIntPolynomial6 = (BigIntPolynomial)bigIntPolynomial3.clone();
    bigIntPolynomial6.add(bigIntPolynomial4);
    BigIntPolynomial bigIntPolynomial7 = bigIntPolynomial1.multRecursive(bigIntPolynomial3);
    BigIntPolynomial bigIntPolynomial8 = bigIntPolynomial2.multRecursive(bigIntPolynomial4);
    BigIntPolynomial bigIntPolynomial9 = bigIntPolynomial5.multRecursive(bigIntPolynomial6);
    bigIntPolynomial9.sub(bigIntPolynomial7);
    bigIntPolynomial9.sub(bigIntPolynomial8);
    BigIntPolynomial bigIntPolynomial10 = new BigIntPolynomial(2 * i - 1);
    byte b;
    for (b = 0; b < bigIntPolynomial7.coeffs.length; b++)
      bigIntPolynomial10.coeffs[b] = bigIntPolynomial7.coeffs[b]; 
    for (b = 0; b < bigIntPolynomial9.coeffs.length; b++)
      bigIntPolynomial10.coeffs[j + b] = bigIntPolynomial10.coeffs[j + b].add(bigIntPolynomial9.coeffs[b]); 
    for (b = 0; b < bigIntPolynomial8.coeffs.length; b++)
      bigIntPolynomial10.coeffs[2 * j + b] = bigIntPolynomial10.coeffs[2 * j + b].add(bigIntPolynomial8.coeffs[b]); 
    return bigIntPolynomial10;
  }
  
  void add(BigIntPolynomial paramBigIntPolynomial, BigInteger paramBigInteger) {
    add(paramBigIntPolynomial);
    mod(paramBigInteger);
  }
  
  public void add(BigIntPolynomial paramBigIntPolynomial) {
    if (paramBigIntPolynomial.coeffs.length > this.coeffs.length) {
      int i = this.coeffs.length;
      this.coeffs = Arrays.copyOf(this.coeffs, paramBigIntPolynomial.coeffs.length);
      for (int j = i; j < this.coeffs.length; j++)
        this.coeffs[j] = Constants.BIGINT_ZERO; 
    } 
    for (byte b = 0; b < paramBigIntPolynomial.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b].add(paramBigIntPolynomial.coeffs[b]); 
  }
  
  public void sub(BigIntPolynomial paramBigIntPolynomial) {
    if (paramBigIntPolynomial.coeffs.length > this.coeffs.length) {
      int i = this.coeffs.length;
      this.coeffs = Arrays.copyOf(this.coeffs, paramBigIntPolynomial.coeffs.length);
      for (int j = i; j < this.coeffs.length; j++)
        this.coeffs[j] = Constants.BIGINT_ZERO; 
    } 
    for (byte b = 0; b < paramBigIntPolynomial.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b].subtract(paramBigIntPolynomial.coeffs[b]); 
  }
  
  public void mult(BigInteger paramBigInteger) {
    for (byte b = 0; b < this.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b].multiply(paramBigInteger); 
  }
  
  void mult(int paramInt) {
    mult(BigInteger.valueOf(paramInt));
  }
  
  public void div(BigInteger paramBigInteger) {
    BigInteger bigInteger = paramBigInteger.add(Constants.BIGINT_ONE).divide(BigInteger.valueOf(2L));
    for (byte b = 0; b < this.coeffs.length; b++) {
      this.coeffs[b] = (this.coeffs[b].compareTo(Constants.BIGINT_ZERO) > 0) ? this.coeffs[b].add(bigInteger) : this.coeffs[b].add(bigInteger.negate());
      this.coeffs[b] = this.coeffs[b].divide(paramBigInteger);
    } 
  }
  
  public BigDecimalPolynomial div(BigDecimal paramBigDecimal, int paramInt) {
    BigInteger bigInteger = maxCoeffAbs();
    int i = (int)(bigInteger.bitLength() * LOG_10_2) + 1;
    BigDecimal bigDecimal = Constants.BIGDEC_ONE.divide(paramBigDecimal, i + paramInt + 1, 6);
    BigDecimalPolynomial bigDecimalPolynomial = new BigDecimalPolynomial(this.coeffs.length);
    for (byte b = 0; b < this.coeffs.length; b++)
      bigDecimalPolynomial.coeffs[b] = (new BigDecimal(this.coeffs[b])).multiply(bigDecimal).setScale(paramInt, 6); 
    return bigDecimalPolynomial;
  }
  
  public int getMaxCoeffLength() {
    return (int)(maxCoeffAbs().bitLength() * LOG_10_2) + 1;
  }
  
  private BigInteger maxCoeffAbs() {
    BigInteger bigInteger = this.coeffs[0].abs();
    for (byte b = 1; b < this.coeffs.length; b++) {
      BigInteger bigInteger1 = this.coeffs[b].abs();
      if (bigInteger1.compareTo(bigInteger) > 0)
        bigInteger = bigInteger1; 
    } 
    return bigInteger;
  }
  
  public void mod(BigInteger paramBigInteger) {
    for (byte b = 0; b < this.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b].mod(paramBigInteger); 
  }
  
  BigInteger sumCoeffs() {
    BigInteger bigInteger = Constants.BIGINT_ZERO;
    for (byte b = 0; b < this.coeffs.length; b++)
      bigInteger = bigInteger.add(this.coeffs[b]); 
    return bigInteger;
  }
  
  public Object clone() {
    return new BigIntPolynomial((BigInteger[])this.coeffs.clone());
  }
  
  public int hashCode() {
    null = 1;
    return 31 * null + Arrays.hashCode((Object[])this.coeffs);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    BigIntPolynomial bigIntPolynomial = (BigIntPolynomial)paramObject;
    return !!Arrays.areEqual((Object[])this.coeffs, (Object[])bigIntPolynomial.coeffs);
  }
  
  public BigInteger[] getCoeffs() {
    return Arrays.clone(this.coeffs);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\polynomial\BigIntPolynomial.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */