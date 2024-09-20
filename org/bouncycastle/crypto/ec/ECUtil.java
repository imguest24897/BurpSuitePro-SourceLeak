package org.bouncycastle.crypto.ec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.util.BigIntegers;

class ECUtil {
  static BigInteger generateK(BigInteger paramBigInteger, SecureRandom paramSecureRandom) {
    int i = paramBigInteger.bitLength();
    while (true) {
      BigInteger bigInteger = BigIntegers.createRandomBigInteger(i, paramSecureRandom);
      if (!bigInteger.equals(ECConstants.ZERO) && bigInteger.compareTo(paramBigInteger) < 0)
        return bigInteger; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\ec\ECUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */