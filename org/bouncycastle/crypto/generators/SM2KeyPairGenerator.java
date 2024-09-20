package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.util.BigIntegers;

public class SM2KeyPairGenerator extends ECKeyPairGenerator {
  public SM2KeyPairGenerator() {
    super("SM2KeyGen");
  }
  
  protected boolean isOutOfRangeD(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    return (paramBigInteger1.compareTo(ONE) < 0 || paramBigInteger1.compareTo(paramBigInteger2.subtract(BigIntegers.ONE)) >= 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\generators\SM2KeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */