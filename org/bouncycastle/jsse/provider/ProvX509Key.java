package org.bouncycastle.jsse.provider;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.X509KeyManager;
import org.bouncycastle.jsse.BCX509Key;
import org.bouncycastle.tls.TlsUtils;

class ProvX509Key implements BCX509Key {
  private static final Logger LOG = Logger.getLogger(ProvX509Key.class.getName());
  
  private final String keyType;
  
  private final PrivateKey privateKey;
  
  private final X509Certificate[] certificateChain;
  
  static ProvX509Key from(X509KeyManager paramX509KeyManager, String paramString1, String paramString2) {
    if (null == paramX509KeyManager)
      throw new NullPointerException("'x509KeyManager' cannot be null"); 
    if (null == paramString1 || null == paramString2)
      return null; 
    X509Certificate[] arrayOfX509Certificate = getCertificateChain(paramX509KeyManager, paramString2);
    if (null == arrayOfX509Certificate)
      return null; 
    PrivateKey privateKey = getPrivateKey(paramX509KeyManager, paramString2);
    return (null == privateKey) ? null : new ProvX509Key(paramString1, privateKey, arrayOfX509Certificate);
  }
  
  static ProvX509Key validate(X509KeyManager paramX509KeyManager, boolean paramBoolean, String paramString1, String paramString2, TransportData paramTransportData) {
    if (null == paramX509KeyManager)
      throw new NullPointerException("'x509KeyManager' cannot be null"); 
    if (null == paramString1 || null == paramString2)
      return null; 
    X509Certificate[] arrayOfX509Certificate = getCertificateChain(paramX509KeyManager, paramString2);
    if (null == arrayOfX509Certificate)
      return null; 
    if (!ProvX509KeyManager.isSuitableKeyType(paramBoolean, paramString1, arrayOfX509Certificate[0], paramTransportData)) {
      if (LOG.isLoggable(Level.FINER))
        LOG.finer("Rejecting alias '" + paramString2 + "': not suitable for key type '" + paramString1 + "'"); 
      return null;
    } 
    PrivateKey privateKey = getPrivateKey(paramX509KeyManager, paramString2);
    return (null == privateKey) ? null : new ProvX509Key(paramString1, privateKey, arrayOfX509Certificate);
  }
  
  private static X509Certificate[] getCertificateChain(X509KeyManager paramX509KeyManager, String paramString) {
    X509Certificate[] arrayOfX509Certificate = paramX509KeyManager.getCertificateChain(paramString);
    if (TlsUtils.isNullOrEmpty((Object[])arrayOfX509Certificate)) {
      LOG.finer("Rejecting alias '" + paramString + "': no certificate chain");
      return null;
    } 
    arrayOfX509Certificate = (X509Certificate[])arrayOfX509Certificate.clone();
    if (JsseUtils.containsNull(arrayOfX509Certificate)) {
      LOG.finer("Rejecting alias '" + paramString + "': invalid certificate chain");
      return null;
    } 
    return arrayOfX509Certificate;
  }
  
  private static PrivateKey getPrivateKey(X509KeyManager paramX509KeyManager, String paramString) {
    PrivateKey privateKey = paramX509KeyManager.getPrivateKey(paramString);
    if (null == privateKey) {
      LOG.finer("Rejecting alias '" + paramString + "': no private key");
      return null;
    } 
    return privateKey;
  }
  
  ProvX509Key(String paramString, PrivateKey paramPrivateKey, X509Certificate[] paramArrayOfX509Certificate) {
    this.keyType = paramString;
    this.privateKey = paramPrivateKey;
    this.certificateChain = paramArrayOfX509Certificate;
  }
  
  public X509Certificate[] getCertificateChain() {
    return (X509Certificate[])this.certificateChain.clone();
  }
  
  public String getKeyType() {
    return this.keyType;
  }
  
  public PrivateKey getPrivateKey() {
    return this.privateKey;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvX509Key.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */