package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;

public interface DSAKCalculator {
  boolean isDeterministic();
  
  void init(BigInteger paramBigInteger, SecureRandom paramSecureRandom);
  
  void init(BigInteger paramBigInteger1, BigInteger paramBigInteger2, byte[] paramArrayOfbyte);
  
  BigInteger nextK();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\signers\DSAKCalculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */