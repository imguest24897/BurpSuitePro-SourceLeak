package org.bouncycastle.tls.crypto.impl.bc;

import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsSRP6Client;

final class BcTlsSRP6Client implements TlsSRP6Client {
  private final SRP6Client srp6Client;
  
  BcTlsSRP6Client(SRP6Client paramSRP6Client) {
    this.srp6Client = paramSRP6Client;
  }
  
  public BigInteger calculateSecret(BigInteger paramBigInteger) throws TlsFatalAlert {
    try {
      return this.srp6Client.calculateSecret(paramBigInteger);
    } catch (CryptoException cryptoException) {
      throw new TlsFatalAlert((short)47, cryptoException);
    } 
  }
  
  public BigInteger generateClientCredentials(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    return this.srp6Client.generateClientCredentials(paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsSRP6Client.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */