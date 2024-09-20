package org.bouncycastle.tls;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.tls.crypto.TlsCrypto;

public class SRPTlsServer extends AbstractTlsServer {
  private static final int[] DEFAULT_CIPHER_SUITES = new int[] { 49186, 49183, 49185, 49182, 49184, 49181 };
  
  protected TlsSRPIdentityManager srpIdentityManager;
  
  protected byte[] srpIdentity = null;
  
  protected TlsSRPLoginParameters srpLoginParameters = null;
  
  public SRPTlsServer(TlsCrypto paramTlsCrypto, TlsSRPIdentityManager paramTlsSRPIdentityManager) {
    super(paramTlsCrypto);
    this.srpIdentityManager = paramTlsSRPIdentityManager;
  }
  
  protected TlsCredentialedSigner getDSASignerCredentials() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  protected TlsCredentialedSigner getRSASignerCredentials() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  protected ProtocolVersion[] getSupportedVersions() {
    return ProtocolVersion.TLSv12.only();
  }
  
  protected int[] getSupportedCipherSuites() {
    return TlsUtils.getSupportedCipherSuites(getCrypto(), DEFAULT_CIPHER_SUITES);
  }
  
  public void processClientExtensions(Hashtable paramHashtable) throws IOException {
    super.processClientExtensions(paramHashtable);
    this.srpIdentity = TlsSRPUtils.getSRPExtension(paramHashtable);
  }
  
  public int getSelectedCipherSuite() throws IOException {
    int i = super.getSelectedCipherSuite();
    if (TlsSRPUtils.isSRPCipherSuite(i)) {
      if (this.srpIdentity != null)
        this.srpLoginParameters = this.srpIdentityManager.getLoginParameters(this.srpIdentity); 
      if (this.srpLoginParameters == null)
        throw new TlsFatalAlert((short)115); 
    } 
    return i;
  }
  
  public TlsCredentials getCredentials() throws IOException {
    int i = this.context.getSecurityParametersHandshake().getKeyExchangeAlgorithm();
    switch (i) {
      case 21:
        return null;
      case 22:
        return getDSASignerCredentials();
      case 23:
        return getRSASignerCredentials();
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsSRPLoginParameters getSRPLoginParameters() throws IOException {
    return this.srpLoginParameters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\SRPTlsServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */