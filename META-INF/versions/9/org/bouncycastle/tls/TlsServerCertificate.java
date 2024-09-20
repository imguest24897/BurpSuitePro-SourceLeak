package META-INF.versions.9.org.bouncycastle.tls;

import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.CertificateStatus;

public interface TlsServerCertificate {
  Certificate getCertificate();
  
  CertificateStatus getCertificateStatus();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsServerCertificate.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */