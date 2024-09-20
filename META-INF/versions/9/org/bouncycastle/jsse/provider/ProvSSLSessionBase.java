package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLPermission;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.auth.x500.X500Principal;
import javax.security.cert.X509Certificate;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.provider.JsseSecurityParameters;
import org.bouncycastle.jsse.provider.JsseSessionParameters;
import org.bouncycastle.jsse.provider.JsseUtils;
import org.bouncycastle.jsse.provider.OldCertUtil;
import org.bouncycastle.jsse.provider.ProvSSLContextSpi;
import org.bouncycastle.jsse.provider.ProvSSLSessionContext;
import org.bouncycastle.jsse.provider.SSLSessionUtil;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.util.Arrays;

abstract class ProvSSLSessionBase extends BCExtendedSSLSession {
  protected final Map<String, Object> valueMap = Collections.synchronizedMap(new HashMap<>());
  
  protected final AtomicReference<ProvSSLSessionContext> sslSessionContext;
  
  protected final boolean isFips;
  
  protected final JcaTlsCrypto crypto;
  
  protected final String peerHost;
  
  protected final int peerPort;
  
  protected final long creationTime;
  
  protected final SSLSession exportSSLSession;
  
  protected final AtomicLong lastAccessedTime;
  
  ProvSSLSessionBase(ProvSSLSessionContext paramProvSSLSessionContext, String paramString, int paramInt) {
    this.sslSessionContext = new AtomicReference<>(paramProvSSLSessionContext);
    this.isFips = (null == paramProvSSLSessionContext) ? false : paramProvSSLSessionContext.getSSLContext().isFips();
    this.crypto = (null == paramProvSSLSessionContext) ? null : paramProvSSLSessionContext.getCrypto();
    this.peerHost = paramString;
    this.peerPort = paramInt;
    this.creationTime = System.currentTimeMillis();
    this.exportSSLSession = SSLSessionUtil.exportSSLSession(this);
    this.lastAccessedTime = new AtomicLong(this.creationTime);
  }
  
  protected abstract int getCipherSuiteTLS();
  
  protected abstract byte[] getIDArray();
  
  protected abstract JsseSecurityParameters getJsseSecurityParameters();
  
  protected abstract JsseSessionParameters getJsseSessionParameters();
  
  protected abstract Certificate getLocalCertificateTLS();
  
  protected abstract Certificate getPeerCertificateTLS();
  
  protected abstract ProtocolVersion getProtocolTLS();
  
  protected abstract void invalidateTLS();
  
  SSLSession getExportSSLSession() {
    return this.exportSSLSession;
  }
  
  void accessedAt(long paramLong) {
    long l = this.lastAccessedTime.get();
    if (paramLong > l)
      this.lastAccessedTime.compareAndSet(l, paramLong); 
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof org.bouncycastle.jsse.provider.ProvSSLSessionBase))
      return false; 
    org.bouncycastle.jsse.provider.ProvSSLSessionBase provSSLSessionBase = (org.bouncycastle.jsse.provider.ProvSSLSessionBase)paramObject;
    return Arrays.areEqual(getIDArray(), provSSLSessionBase.getIDArray());
  }
  
  public int getApplicationBufferSize() {
    return 16384;
  }
  
  public String getCipherSuite() {
    return ProvSSLContextSpi.getCipherSuiteName(getCipherSuiteTLS());
  }
  
  public long getCreationTime() {
    return this.creationTime;
  }
  
  public byte[] getId() {
    byte[] arrayOfByte = getIDArray();
    return TlsUtils.isNullOrEmpty(arrayOfByte) ? TlsUtils.EMPTY_BYTES : (byte[])arrayOfByte.clone();
  }
  
  public long getLastAccessedTime() {
    return this.lastAccessedTime.get();
  }
  
  public Certificate[] getLocalCertificates() {
    if (null != this.crypto) {
      X509Certificate[] arrayOfX509Certificate = JsseUtils.getX509CertificateChain(this.crypto, getLocalCertificateTLS());
      if (null != arrayOfX509Certificate && arrayOfX509Certificate.length > 0)
        return (Certificate[])arrayOfX509Certificate; 
    } 
    return null;
  }
  
  public Principal getLocalPrincipal() {
    return (null != this.crypto) ? JsseUtils.getSubject(this.crypto, getLocalCertificateTLS()) : null;
  }
  
  public int getPacketBufferSize() {
    ProtocolVersion protocolVersion = getProtocolTLS();
    return (null == protocolVersion || !TlsUtils.isTLSv11(protocolVersion)) ? 18443 : (TlsUtils.isTLSv13(protocolVersion) ? 16911 : 17413);
  }
  
  public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
    return OldCertUtil.getPeerCertificateChain(this);
  }
  
  public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
    if (null != this.crypto) {
      X509Certificate[] arrayOfX509Certificate = JsseUtils.getX509CertificateChain(this.crypto, getPeerCertificateTLS());
      if (null != arrayOfX509Certificate && arrayOfX509Certificate.length > 0)
        return (Certificate[])arrayOfX509Certificate; 
    } 
    throw new SSLPeerUnverifiedException("No peer identity established");
  }
  
  public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
    if (null != this.crypto) {
      X500Principal x500Principal = JsseUtils.getSubject(this.crypto, getPeerCertificateTLS());
      if (null != x500Principal)
        return x500Principal; 
    } 
    throw new SSLPeerUnverifiedException("No peer identity established");
  }
  
  public String getPeerHost() {
    return this.peerHost;
  }
  
  public int getPeerPort() {
    return this.peerPort;
  }
  
  public String getProtocol() {
    return ProvSSLContextSpi.getProtocolVersionName(getProtocolTLS());
  }
  
  public SSLSessionContext getSessionContext() {
    SecurityManager securityManager = System.getSecurityManager();
    if (null != securityManager)
      securityManager.checkPermission(new SSLPermission("getSSLSessionContext")); 
    return (SSLSessionContext)this.sslSessionContext.get();
  }
  
  public Object getValue(String paramString) {
    return this.valueMap.get(paramString);
  }
  
  public String[] getValueNames() {
    synchronized (this.valueMap) {
      return (String[])this.valueMap.keySet().toArray((Object[])new String[this.valueMap.size()]);
    } 
  }
  
  public int hashCode() {
    return Arrays.hashCode(getIDArray());
  }
  
  public final void invalidate() {
    implInvalidate(true);
  }
  
  final void invalidatedBySessionContext() {
    implInvalidate(false);
  }
  
  public boolean isFipsMode() {
    return this.isFips;
  }
  
  public boolean isValid() {
    return (null == this.sslSessionContext.get()) ? false : (!TlsUtils.isNullOrEmpty(getIDArray()));
  }
  
  public void putValue(String paramString, Object paramObject) {
    notifyUnbound(paramString, this.valueMap.put(paramString, paramObject));
    notifyBound(paramString, paramObject);
  }
  
  public void removeValue(String paramString) {
    notifyUnbound(paramString, this.valueMap.remove(paramString));
  }
  
  public String toString() {
    return "Session(" + getCreationTime() + "|" + getCipherSuite() + ")";
  }
  
  protected void notifyBound(String paramString, Object paramObject) {
    if (paramObject instanceof SSLSessionBindingListener)
      ((SSLSessionBindingListener)paramObject).valueBound(new SSLSessionBindingEvent((SSLSession)this, paramString)); 
  }
  
  protected void notifyUnbound(String paramString, Object paramObject) {
    if (paramObject instanceof SSLSessionBindingListener)
      ((SSLSessionBindingListener)paramObject).valueUnbound(new SSLSessionBindingEvent((SSLSession)this, paramString)); 
  }
  
  private void implInvalidate(boolean paramBoolean) {
    if (paramBoolean) {
      ProvSSLSessionContext provSSLSessionContext = this.sslSessionContext.getAndSet(null);
      if (null != provSSLSessionContext)
        provSSLSessionContext.removeSession(getIDArray()); 
    } else {
      this.sslSessionContext.set(null);
    } 
    invalidateTLS();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLSessionBase.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */