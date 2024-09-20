package org.bouncycastle.tls;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsServerCertificateImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */