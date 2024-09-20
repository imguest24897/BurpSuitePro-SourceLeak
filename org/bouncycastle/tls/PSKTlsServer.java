package org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsCrypto;

public class PSKTlsServer extends AbstractTlsServer {
  private static final int[] DEFAULT_CIPHER_SUITES = new int[] { 
      52396, 49208, 49207, 49206, 49205, 52397, 171, 170, 179, 178, 
      145, 144 };
  
  protected TlsPSKIdentityManager pskIdentityManager;
  
  public PSKTlsServer(TlsCrypto paramTlsCrypto, TlsPSKIdentityManager paramTlsPSKIdentityManager) {
    super(paramTlsCrypto);
    this.pskIdentityManager = paramTlsPSKIdentityManager;
  }
  
  protected TlsCredentialedDecryptor getRSAEncryptionCredentials() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  protected ProtocolVersion[] getSupportedVersions() {
    return ProtocolVersion.TLSv12.only();
  }
  
  protected int[] getSupportedCipherSuites() {
    return TlsUtils.getSupportedCipherSuites(getCrypto(), DEFAULT_CIPHER_SUITES);
  }
  
  public TlsCredentials getCredentials() throws IOException {
    int i = this.context.getSecurityParametersHandshake().getKeyExchangeAlgorithm();
    switch (i) {
      case 13:
      case 14:
      case 24:
        return null;
      case 15:
        return getRSAEncryptionCredentials();
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsPSKIdentityManager getPSKIdentityManager() {
    return this.pskIdentityManager;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\PSKTlsServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */