package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.prng.RandomGenerator;
import org.bouncycastle.tls.crypto.TlsNonceGenerator;

final class BcTlsNonceGenerator implements TlsNonceGenerator {
  private final RandomGenerator randomGenerator;
  
  BcTlsNonceGenerator(RandomGenerator paramRandomGenerator) {
    this.randomGenerator = paramRandomGenerator;
  }
  
  public byte[] generateNonce(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    this.randomGenerator.nextBytes(arrayOfByte);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsNonceGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */