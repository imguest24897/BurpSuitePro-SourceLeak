package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

public interface Polynomial {
  IntegerPolynomial mult(IntegerPolynomial paramIntegerPolynomial);
  
  IntegerPolynomial mult(IntegerPolynomial paramIntegerPolynomial, int paramInt);
  
  IntegerPolynomial toIntegerPolynomial();
  
  BigIntPolynomial mult(BigIntPolynomial paramBigIntPolynomial);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\polynomial\Polynomial.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */