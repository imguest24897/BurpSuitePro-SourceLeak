package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.security.cert.X509Certificate;
import org.bouncycastle.jsse.BCExtendedSSLSession;

class OldCertUtil {
  static X509Certificate[] getPeerCertificateChain(BCExtendedSSLSession paramBCExtendedSSLSession) throws SSLPeerUnverifiedException {
    boolean bool = paramBCExtendedSSLSession.isFipsMode();
    Certificate[] arrayOfCertificate = paramBCExtendedSSLSession.getPeerCertificates();
    X509Certificate[] arrayOfX509Certificate1 = new X509Certificate[arrayOfCertificate.length];
    byte b = 0;
    try {
      for (byte b1 = 0; b1 < arrayOfCertificate.length; b1++) {
        Certificate certificate = arrayOfCertificate[b1];
        if (certificate instanceof X509Certificate) {
          X509Certificate x509Certificate = (X509Certificate)certificate;
          if (bool) {
            arrayOfX509Certificate1[b++] = (X509Certificate)new X509CertificateWrapper(x509Certificate, null);
          } else {
            arrayOfX509Certificate1[b++] = X509Certificate.getInstance(x509Certificate.getEncoded());
          } 
        } 
      } 
    } catch (Exception exception) {
      throw new SSLPeerUnverifiedException(exception.getMessage());
    } 
    if (b >= arrayOfX509Certificate1.length)
      return arrayOfX509Certificate1; 
    X509Certificate[] arrayOfX509Certificate2 = new X509Certificate[b];
    System.arraycopy(arrayOfX509Certificate1, 0, arrayOfX509Certificate2, 0, b);
    return arrayOfX509Certificate2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\OldCertUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */