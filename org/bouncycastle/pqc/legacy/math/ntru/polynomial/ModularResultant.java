package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import java.math.BigInteger;
import org.bouncycastle.pqc.legacy.math.ntru.euclid.BigIntEuclidean;

public class ModularResultant extends Resultant {
  BigInteger modulus;
  
  ModularResultant(BigIntPolynomial paramBigIntPolynomial, BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    super(paramBigIntPolynomial, paramBigInteger1);
    this.modulus = paramBigInteger2;
  }
  
  static ModularResultant combineRho(ModularResultant paramModularResultant1, ModularResultant paramModularResultant2) {
    BigInteger bigInteger1 = paramModularResultant1.modulus;
    BigInteger bigInteger2 = paramModularResultant2.modulus;
    BigInteger bigInteger3 = bigInteger1.multiply(bigInteger2);
    BigIntEuclidean bigIntEuclidean = BigIntEuclidean.calculate(bigInteger2, bigInteger1);
    BigIntPolynomial bigIntPolynomial1 = (BigIntPolynomial)paramModularResultant1.rho.clone();
    bigIntPolynomial1.mult(bigIntEuclidean.x.multiply(bigInteger2));
    BigIntPolynomial bigIntPolynomial2 = (BigIntPolynomial)paramModularResultant2.rho.clone();
    bigIntPolynomial2.mult(bigIntEuclidean.y.multiply(bigInteger1));
    bigIntPolynomial1.add(bigIntPolynomial2);
    bigIntPolynomial1.mod(bigInteger3);
    return new ModularResultant(bigIntPolynomial1, null, bigInteger3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\polynomial\ModularResultant.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */