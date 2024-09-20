package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.agreement.srp.SRP6Server;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsSRP6Server;

final class BcTlsSRP6Server implements TlsSRP6Server {
  private final SRP6Server srp6Server;
  
  BcTlsSRP6Server(SRP6Server paramSRP6Server) {
    this.srp6Server = paramSRP6Server;
  }
  
  public BigInteger generateServerCredentials() {
    return this.srp6Server.generateServerCredentials();
  }
  
  public BigInteger calculateSecret(BigInteger paramBigInteger) throws IOException {
    try {
      return this.srp6Server.calculateSecret(paramBigInteger);
    } catch (CryptoException cryptoException) {
      throw new TlsFatalAlert((short)47, cryptoException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsSRP6Server.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */