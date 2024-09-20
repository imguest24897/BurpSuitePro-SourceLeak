package META-INF.versions.9.org.bouncycastle.jsse.provider;

import org.bouncycastle.jsse.provider.JsseSecurityParameters;
import org.bouncycastle.jsse.provider.JsseSessionParameters;
import org.bouncycastle.jsse.provider.ProvSSLSessionContext;
import org.bouncycastle.jsse.provider.ProvSSLSessionHandshake;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.SessionParameters;
import org.bouncycastle.tls.TlsSession;

class ProvSSLSessionResumed extends ProvSSLSessionHandshake {
  protected final TlsSession tlsSession;
  
  protected final SessionParameters sessionParameters;
  
  protected final JsseSessionParameters jsseSessionParameters;
  
  ProvSSLSessionResumed(ProvSSLSessionContext paramProvSSLSessionContext, String paramString, int paramInt, SecurityParameters paramSecurityParameters, JsseSecurityParameters paramJsseSecurityParameters, TlsSession paramTlsSession, JsseSessionParameters paramJsseSessionParameters) {
    super(paramProvSSLSessionContext, paramString, paramInt, paramSecurityParameters, paramJsseSecurityParameters);
    this.tlsSession = paramTlsSession;
    this.sessionParameters = paramTlsSession.exportSessionParameters();
    this.jsseSessionParameters = paramJsseSessionParameters;
  }
  
  protected int getCipherSuiteTLS() {
    return this.sessionParameters.getCipherSuite();
  }
  
  protected byte[] getIDArray() {
    return this.tlsSession.getSessionID();
  }
  
  protected JsseSessionParameters getJsseSessionParameters() {
    return this.jsseSessionParameters;
  }
  
  protected Certificate getLocalCertificateTLS() {
    return this.sessionParameters.getLocalCertificate();
  }
  
  protected Certificate getPeerCertificateTLS() {
    return this.sessionParameters.getPeerCertificate();
  }
  
  protected ProtocolVersion getProtocolTLS() {
    return this.sessionParameters.getNegotiatedVersion();
  }
  
  protected void invalidateTLS() {
    this.tlsSession.invalidate();
  }
  
  public boolean isValid() {
    return (super.isValid() && this.tlsSession.isResumable());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLSessionResumed.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */