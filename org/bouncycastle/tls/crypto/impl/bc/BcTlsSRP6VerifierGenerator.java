package org.bouncycastle.tls.crypto.impl.bc;

import java.math.BigInteger;
import org.bouncycastle.crypto.agreement.srp.SRP6VerifierGenerator;
import org.bouncycastle.tls.crypto.TlsSRP6VerifierGenerator;

final class BcTlsSRP6VerifierGenerator implements TlsSRP6VerifierGenerator {
  private final SRP6VerifierGenerator srp6VerifierGenerator;
  
  BcTlsSRP6VerifierGenerator(SRP6VerifierGenerator paramSRP6VerifierGenerator) {
    this.srp6VerifierGenerator = paramSRP6VerifierGenerator;
  }
  
  public BigInteger generateVerifier(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    return this.srp6VerifierGenerator.generateVerifier(paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsSRP6VerifierGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */