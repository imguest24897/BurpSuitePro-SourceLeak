package org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsCrypto;

public abstract class DefaultTlsServer extends AbstractTlsServer {
  private static final int[] DEFAULT_CIPHER_SUITES = new int[] { 
      4867, 4866, 4865, 52392, 49200, 49199, 49192, 49191, 49172, 49171, 
      52394, 159, 158, 107, 103, 57, 51 };
  
  public DefaultTlsServer(TlsCrypto paramTlsCrypto) {
    super(paramTlsCrypto);
  }
  
  protected TlsCredentialedSigner getDSASignerCredentials() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  protected TlsCredentialedSigner getECDSASignerCredentials() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  protected TlsCredentialedDecryptor getRSAEncryptionCredentials() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  protected TlsCredentialedSigner getRSASignerCredentials() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  protected int[] getSupportedCipherSuites() {
    return TlsUtils.getSupportedCipherSuites(getCrypto(), DEFAULT_CIPHER_SUITES);
  }
  
  public TlsCredentials getCredentials() throws IOException {
    SecurityParameters securityParameters = this.context.getSecurityParametersHandshake();
    switch (securityParameters.getKeyExchangeAlgorithm()) {
      case 3:
        return getDSASignerCredentials();
      case 17:
        return getECDSASignerCredentials();
      case 5:
      case 19:
        return getRSASignerCredentials();
      case 0:
        throw new TlsFatalAlert((short)80, securityParameters.getNegotiatedVersion() + " credentials unhandled");
      case 1:
        return getRSAEncryptionCredentials();
    } 
    throw new TlsFatalAlert((short)80);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DefaultTlsServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */