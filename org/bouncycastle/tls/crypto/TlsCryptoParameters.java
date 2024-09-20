package org.bouncycastle.tls.crypto;

import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsContext;

public class TlsCryptoParameters {
  private final TlsContext context;
  
  public TlsCryptoParameters(TlsContext paramTlsContext) {
    this.context = paramTlsContext;
  }
  
  public SecurityParameters getSecurityParametersConnection() {
    return this.context.getSecurityParametersConnection();
  }
  
  public SecurityParameters getSecurityParametersHandshake() {
    return this.context.getSecurityParametersHandshake();
  }
  
  public ProtocolVersion getClientVersion() {
    return this.context.getClientVersion();
  }
  
  public ProtocolVersion getRSAPreMasterSecretVersion() {
    return this.context.getRSAPreMasterSecretVersion();
  }
  
  public ProtocolVersion getServerVersion() {
    return this.context.getServerVersion();
  }
  
  public boolean isServer() {
    return this.context.isServer();
  }
  
  public TlsNonceGenerator getNonceGenerator() {
    return this.context.getNonceGenerator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsCryptoParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */