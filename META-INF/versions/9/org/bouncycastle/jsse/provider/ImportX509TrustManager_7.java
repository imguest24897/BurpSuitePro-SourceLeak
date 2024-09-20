package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;
import org.bouncycastle.jsse.provider.ImportX509TrustManager;

class ImportX509TrustManager_7 extends BCX509ExtendedTrustManager implements ImportX509TrustManager {
  final X509ExtendedTrustManager x509TrustManager;
  
  ImportX509TrustManager_7(X509ExtendedTrustManager paramX509ExtendedTrustManager) {
    this.x509TrustManager = paramX509ExtendedTrustManager;
  }
  
  public X509TrustManager unwrap() {
    return this.x509TrustManager;
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws CertificateException {
    this.x509TrustManager.checkClientTrusted(paramArrayOfX509Certificate, paramString);
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, Socket paramSocket) throws CertificateException {
    this.x509TrustManager.checkClientTrusted(paramArrayOfX509Certificate, paramString, paramSocket);
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, SSLEngine paramSSLEngine) throws CertificateException {
    this.x509TrustManager.checkClientTrusted(paramArrayOfX509Certificate, paramString, paramSSLEngine);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws CertificateException {
    this.x509TrustManager.checkServerTrusted(paramArrayOfX509Certificate, paramString);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, Socket paramSocket) throws CertificateException {
    this.x509TrustManager.checkServerTrusted(paramArrayOfX509Certificate, paramString, paramSocket);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, SSLEngine paramSSLEngine) throws CertificateException {
    this.x509TrustManager.checkServerTrusted(paramArrayOfX509Certificate, paramString, paramSSLEngine);
  }
  
  public X509Certificate[] getAcceptedIssuers() {
    return this.x509TrustManager.getAcceptedIssuers();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ImportX509TrustManager_7.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */