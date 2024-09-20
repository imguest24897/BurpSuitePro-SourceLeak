package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import java.math.BigInteger;

public class Resultant {
  public BigIntPolynomial rho;
  
  public BigInteger res;
  
  Resultant(BigIntPolynomial paramBigIntPolynomial, BigInteger paramBigInteger) {
    this.rho = paramBigIntPolynomial;
    this.res = paramBigInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\polynomial\Resultant.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */