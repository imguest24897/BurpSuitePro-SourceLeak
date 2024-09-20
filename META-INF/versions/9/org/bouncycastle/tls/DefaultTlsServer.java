package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.AbstractTlsServer;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsCredentialedDecryptor;
import org.bouncycastle.tls.TlsCredentialedSigner;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
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
        return (TlsCredentials)getDSASignerCredentials();
      case 17:
        return (TlsCredentials)getECDSASignerCredentials();
      case 5:
      case 19:
        return (TlsCredentials)getRSASignerCredentials();
      case 0:
        throw new TlsFatalAlert((short)80, "" + securityParameters.getNegotiatedVersion() + " credentials unhandled");
      case 1:
        return (TlsCredentials)getRSAEncryptionCredentials();
    } 
    throw new TlsFatalAlert((short)80);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\DefaultTlsServer.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */