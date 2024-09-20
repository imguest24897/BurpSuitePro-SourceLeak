package META-INF.versions.9.org.bouncycastle.tls;

import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.CertificateStatus;
import org.bouncycastle.tls.TlsServerCertificate;

class TlsServerCertificateImpl implements TlsServerCertificate {
  protected Certificate certificate;
  
  protected CertificateStatus certificateStatus;
  
  TlsServerCertificateImpl(Certificate paramCertificate, CertificateStatus paramCertificateStatus) {
    this.certificate = paramCertificate;
    this.certificateStatus = paramCertificateStatus;
  }
  
  public Certificate getCertificate() {
    return this.certificate;
  }
  
  public CertificateStatus getCertificateStatus() {
    return this.certificateStatus;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsServerCertificateImpl.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */