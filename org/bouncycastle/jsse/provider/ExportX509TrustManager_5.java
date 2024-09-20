package org.bouncycastle.jsse.provider;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;

class ExportX509TrustManager_5 implements X509TrustManager, ExportX509TrustManager {
  final BCX509ExtendedTrustManager x509TrustManager;
  
  ExportX509TrustManager_5(BCX509ExtendedTrustManager paramBCX509ExtendedTrustManager) {
    this.x509TrustManager = paramBCX509ExtendedTrustManager;
  }
  
  public BCX509ExtendedTrustManager unwrap() {
    return this.x509TrustManager;
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws CertificateException {
    this.x509TrustManager.checkClientTrusted(paramArrayOfX509Certificate, paramString);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws CertificateException {
    this.x509TrustManager.checkServerTrusted(paramArrayOfX509Certificate, paramString);
  }
  
  public X509Certificate[] getAcceptedIssuers() {
    return this.x509TrustManager.getAcceptedIssuers();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ExportX509TrustManager_5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */