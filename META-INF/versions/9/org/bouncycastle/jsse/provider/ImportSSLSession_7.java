package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.jsse.provider.ImportSSLSession;
import org.bouncycastle.jsse.provider.OldCertUtil;
import org.bouncycastle.jsse.provider.ProvSSLSessionContext;

class ImportSSLSession_7 extends BCExtendedSSLSession implements ImportSSLSession {
  final ExtendedSSLSession sslSession;
  
  ImportSSLSession_7(ExtendedSSLSession paramExtendedSSLSession) {
    this.sslSession = paramExtendedSSLSession;
  }
  
  public SSLSession unwrap() {
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
    return OldCertUtil.getPeerCertificateChain(this);
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
  
  public List<BCSNIServerName> getRequestedServerNames() {
    return Collections.emptyList();
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
  
  public boolean isFipsMode() {
    SSLSessionContext sSLSessionContext = getSessionContext();
    return (sSLSessionContext instanceof ProvSSLSessionContext) ? ((ProvSSLSessionContext)sSLSessionContext).getSSLContext().isFips() : false;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ImportSSLSession_7.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */