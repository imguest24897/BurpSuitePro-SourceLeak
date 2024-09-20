package org.bouncycastle.jsse.provider;

import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.tls.TlsUtils;

class ImportX509TrustManager_5 extends BCX509ExtendedTrustManager implements ImportX509TrustManager {
  final boolean isInFipsMode;
  
  final JcaJceHelper helper;
  
  final X509TrustManager x509TrustManager;
  
  ImportX509TrustManager_5(boolean paramBoolean, JcaJceHelper paramJcaJceHelper, X509TrustManager paramX509TrustManager) {
    this.isInFipsMode = paramBoolean;
    this.helper = paramJcaJceHelper;
    this.x509TrustManager = paramX509TrustManager;
  }
  
  public X509TrustManager unwrap() {
    return this.x509TrustManager;
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws CertificateException {
    this.x509TrustManager.checkClientTrusted(copyChain(paramArrayOfX509Certificate), paramString);
    checkAdditionalTrust(paramArrayOfX509Certificate, paramString, null, false);
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, Socket paramSocket) throws CertificateException {
    this.x509TrustManager.checkClientTrusted(copyChain(paramArrayOfX509Certificate), paramString);
    checkAdditionalTrust(paramArrayOfX509Certificate, paramString, TransportData.from(paramSocket), false);
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, SSLEngine paramSSLEngine) throws CertificateException {
    this.x509TrustManager.checkClientTrusted(copyChain(paramArrayOfX509Certificate), paramString);
    checkAdditionalTrust(paramArrayOfX509Certificate, paramString, TransportData.from(paramSSLEngine), false);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws CertificateException {
    this.x509TrustManager.checkServerTrusted(copyChain(paramArrayOfX509Certificate), paramString);
    checkAdditionalTrust(paramArrayOfX509Certificate, paramString, null, true);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, Socket paramSocket) throws CertificateException {
    this.x509TrustManager.checkServerTrusted(copyChain(paramArrayOfX509Certificate), paramString);
    checkAdditionalTrust(paramArrayOfX509Certificate, paramString, TransportData.from(paramSocket), true);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, SSLEngine paramSSLEngine) throws CertificateException {
    this.x509TrustManager.checkServerTrusted(copyChain(paramArrayOfX509Certificate), paramString);
    checkAdditionalTrust(paramArrayOfX509Certificate, paramString, TransportData.from(paramSSLEngine), true);
  }
  
  public X509Certificate[] getAcceptedIssuers() {
    return this.x509TrustManager.getAcceptedIssuers();
  }
  
  private void checkAdditionalTrust(X509Certificate[] paramArrayOfX509Certificate, String paramString, TransportData paramTransportData, boolean paramBoolean) throws CertificateException {
    checkAlgorithmConstraints(paramArrayOfX509Certificate, paramString, paramTransportData, paramBoolean);
    ProvX509TrustManager.checkExtendedTrust(paramArrayOfX509Certificate, paramTransportData, paramBoolean);
  }
  
  private void checkAlgorithmConstraints(X509Certificate[] paramArrayOfX509Certificate, String paramString, TransportData paramTransportData, boolean paramBoolean) throws CertificateException {
    BCAlgorithmConstraints bCAlgorithmConstraints = TransportData.getAlgorithmConstraints(paramTransportData, false);
    Set<X509Certificate> set = getTrustedCerts();
    KeyPurposeId keyPurposeId = ProvX509TrustManager.getRequiredExtendedKeyUsage(paramBoolean);
    int i = ProvX509TrustManager.getRequiredKeyUsage(paramBoolean, paramString);
    try {
      ProvAlgorithmChecker.checkChain(this.isInFipsMode, this.helper, bCAlgorithmConstraints, set, paramArrayOfX509Certificate, keyPurposeId, i);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new CertificateException("Certificates do not conform to algorithm constraints", generalSecurityException);
    } 
  }
  
  private Set<X509Certificate> getTrustedCerts() {
    X509Certificate[] arrayOfX509Certificate = getAcceptedIssuers();
    if (TlsUtils.isNullOrEmpty((Object[])arrayOfX509Certificate))
      return Collections.emptySet(); 
    HashSet<X509Certificate> hashSet = new HashSet();
    for (byte b = 0; b < arrayOfX509Certificate.length; b++) {
      X509Certificate x509Certificate = arrayOfX509Certificate[b];
      if (null != x509Certificate)
        hashSet.add(x509Certificate); 
    } 
    return Collections.unmodifiableSet(hashSet);
  }
  
  private static X509Certificate[] checkChain(X509Certificate[] paramArrayOfX509Certificate) {
    if (TlsUtils.isNullOrEmpty((Object[])paramArrayOfX509Certificate))
      throw new IllegalArgumentException("'chain' must be a chain of at least one certificate"); 
    return paramArrayOfX509Certificate;
  }
  
  private static X509Certificate[] copyChain(X509Certificate[] paramArrayOfX509Certificate) {
    return (X509Certificate[])checkChain(paramArrayOfX509Certificate).clone();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ImportX509TrustManager_5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */