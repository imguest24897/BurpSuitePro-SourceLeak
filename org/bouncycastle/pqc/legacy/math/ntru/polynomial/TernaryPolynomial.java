package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

public interface TernaryPolynomial extends Polynomial {
  IntegerPolynomial mult(IntegerPolynomial paramIntegerPolynomial);
  
  int[] getOnes();
  
  int[] getNegOnes();
  
  int size();
  
  void clear();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\polynomial\TernaryPolynomial.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */