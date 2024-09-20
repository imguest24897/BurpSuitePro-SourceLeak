package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;
import org.bouncycastle.jsse.provider.JsseUtils;

final class DummyX509TrustManager extends BCX509ExtendedTrustManager {
  static final BCX509ExtendedTrustManager INSTANCE = new org.bouncycastle.jsse.provider.DummyX509TrustManager();
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws CertificateException {
    throw new CertificateException("No X509TrustManager implementation available");
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, Socket paramSocket) throws CertificateException {
    throw new CertificateException("No X509TrustManager implementation available");
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, SSLEngine paramSSLEngine) throws CertificateException {
    throw new CertificateException("No X509TrustManager implementation available");
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws CertificateException {
    throw new CertificateException("No X509TrustManager implementation available");
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, Socket paramSocket) throws CertificateException {
    throw new CertificateException("No X509TrustManager implementation available");
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, SSLEngine paramSSLEngine) throws CertificateException {
    throw new CertificateException("No X509TrustManager implementation available");
  }
  
  public X509Certificate[] getAcceptedIssuers() {
    return JsseUtils.EMPTY_X509CERTIFICATES;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\DummyX509TrustManager.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */