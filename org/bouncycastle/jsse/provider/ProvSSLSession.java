package org.bouncycastle.jsse.provider;

import java.util.List;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SessionParameters;
import org.bouncycastle.tls.TlsSession;

class ProvSSLSession extends ProvSSLSessionBase {
  static final ProvSSLSession NULL_SESSION = new ProvSSLSession(null, null, -1, null, new JsseSessionParameters(null, null));
  
  protected final TlsSession tlsSession;
  
  protected final SessionParameters sessionParameters;
  
  protected final JsseSessionParameters jsseSessionParameters;
  
  ProvSSLSession(ProvSSLSessionContext paramProvSSLSessionContext, String paramString, int paramInt, TlsSession paramTlsSession, JsseSessionParameters paramJsseSessionParameters) {
    super(paramProvSSLSessionContext, paramString, paramInt);
    this.tlsSession = paramTlsSession;
    this.sessionParameters = (paramTlsSession == null) ? null : paramTlsSession.exportSessionParameters();
    this.jsseSessionParameters = paramJsseSessionParameters;
  }
  
  protected int getCipherSuiteTLS() {
    return (null == this.sessionParameters) ? 0 : this.sessionParameters.getCipherSuite();
  }
  
  protected byte[] getIDArray() {
    return (null == this.tlsSession) ? null : this.tlsSession.getSessionID();
  }
  
  protected JsseSecurityParameters getJsseSecurityParameters() {
    return null;
  }
  
  protected JsseSessionParameters getJsseSessionParameters() {
    return this.jsseSessionParameters;
  }
  
  protected Certificate getLocalCertificateTLS() {
    return (null == this.sessionParameters) ? null : this.sessionParameters.getLocalCertificate();
  }
  
  public String[] getLocalSupportedSignatureAlgorithms() {
    return null;
  }
  
  protected Certificate getPeerCertificateTLS() {
    return (null == this.sessionParameters) ? null : this.sessionParameters.getPeerCertificate();
  }
  
  public String[] getPeerSupportedSignatureAlgorithms() {
    return null;
  }
  
  protected ProtocolVersion getProtocolTLS() {
    return (null == this.sessionParameters) ? null : this.sessionParameters.getNegotiatedVersion();
  }
  
  public List<BCSNIServerName> getRequestedServerNames() {
    throw new UnsupportedOperationException();
  }
  
  TlsSession getTlsSession() {
    return this.tlsSession;
  }
  
  protected void invalidateTLS() {
    if (null != this.tlsSession)
      this.tlsSession.invalidate(); 
  }
  
  public boolean isValid() {
    return (super.isValid() && null != this.tlsSession && this.tlsSession.isResumable());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvSSLSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */