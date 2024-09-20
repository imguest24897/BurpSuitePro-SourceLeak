package org.bouncycastle.jsse.provider;

import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import org.bouncycastle.jsse.BCExtendedSSLSession;

class ExportSSLSession_7 extends ExtendedSSLSession implements ExportSSLSession {
  final BCExtendedSSLSession sslSession;
  
  ExportSSLSession_7(BCExtendedSSLSession paramBCExtendedSSLSession) {
    this.sslSession = paramBCExtendedSSLSession;
  }
  
  public BCExtendedSSLSession unwrap() {
    return this.sslSession;
  }
  
  public boolean equals(Object paramObject) {
    return (null != paramObject && paramObject.equals(this.sslSession));
  }
  
  public int getApplicationBufferSize() {
    return this.sslSession.getApplicationBufferSize();
  }
  
  public String getCipherSuite() {
    return this.sslSession.getCipherSuite();
  }
  
  public long getCreationTime() {
    return this.sslSession.getCreationTime();
  }
  
  public byte[] getId() {
    return this.sslSession.getId();
  }
  
  public long getLastAccessedTime() {
    return this.sslSession.getLastAccessedTime();
  }
  
  public Certificate[] getLocalCertificates() {
    return this.sslSession.getLocalCertificates();
  }
  
  public Principal getLocalPrincipal() {
    return this.sslSession.getLocalPrincipal();
  }
  
  public String[] getLocalSupportedSignatureAlgorithms() {
    return this.sslSession.getLocalSupportedSignatureAlgorithms();
  }
  
  public int getPacketBufferSize() {
    return this.sslSession.getPacketBufferSize();
  }
  
  public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
    return OldCertUtil.getPeerCertificateChain(this.sslSession);
  }
  
  public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
    return this.sslSession.getPeerCertificates();
  }
  
  public String getPeerHost() {
    return this.sslSession.getPeerHost();
  }
  
  public int getPeerPort() {
    return this.sslSession.getPeerPort();
  }
  
  public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
    return this.sslSession.getPeerPrincipal();
  }
  
  public String[] getPeerSupportedSignatureAlgorithms() {
    return this.sslSession.getPeerSupportedSignatureAlgorithms();
  }
  
  public String getProtocol() {
    return this.sslSession.getProtocol();
  }
  
  public SSLSessionContext getSessionContext() {
    return this.sslSession.getSessionContext();
  }
  
  public Object getValue(String paramString) {
    return this.sslSession.getValue(paramString);
  }
  
  public String[] getValueNames() {
    return this.sslSession.getValueNames();
  }
  
  public int hashCode() {
    return this.sslSession.hashCode();
  }
  
  public void invalidate() {
    this.sslSession.invalidate();
  }
  
  public boolean isValid() {
    return this.sslSession.isValid();
  }
  
  public void putValue(String paramString, Object paramObject) {
    this.sslSession.putValue(paramString, paramObject);
  }
  
  public void removeValue(String paramString) {
    this.sslSession.removeValue(paramString);
  }
  
  public String toString() {
    return this.sslSession.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ExportSSLSession_7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */