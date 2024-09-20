package org.bouncycastle.pqc.legacy.math.ntru.euclid;

import java.math.BigInteger;

public class BigIntEuclidean {
  public BigInteger x;
  
  public BigInteger y;
  
  public BigInteger gcd;
  
  public static BigIntEuclidean calculate(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    BigInteger bigInteger1 = BigInteger.ZERO;
    BigInteger bigInteger2 = BigInteger.ONE;
    BigInteger bigInteger3 = BigInteger.ONE;
    BigInteger bigInteger4;
    for (bigInteger4 = BigInteger.ZERO; !paramBigInteger2.equals(BigInteger.ZERO); bigInteger4 = bigInteger6) {
      BigInteger[] arrayOfBigInteger = paramBigInteger1.divideAndRemainder(paramBigInteger2);
      BigInteger bigInteger5 = arrayOfBigInteger[0];
      BigInteger bigInteger6 = paramBigInteger1;
      paramBigInteger1 = paramBigInteger2;
      paramBigInteger2 = arrayOfBigInteger[1];
      bigInteger6 = bigInteger1;
      bigInteger1 = bigInteger2.subtract(bigInteger5.multiply(bigInteger1));
      bigInteger2 = bigInteger6;
      bigInteger6 = bigInteger3;
      bigInteger3 = bigInteger4.subtract(bigInteger5.multiply(bigInteger3));
    } 
    BigIntEuclidean bigIntEuclidean = new BigIntEuclidean();
    bigIntEuclidean.x = bigInteger2;
    bigIntEuclidean.y = bigInteger4;
    bigIntEuclidean.gcd = paramBigInteger1;
    return bigIntEuclidean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\euclid\BigIntEuclidean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */