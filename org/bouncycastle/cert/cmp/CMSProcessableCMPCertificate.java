package org.bouncycastle.cert.cmp;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSTypedData;

public class CMSProcessableCMPCertificate implements CMSTypedData {
  private final CMPCertificate cmpCert;
  
  public CMSProcessableCMPCertificate(X509CertificateHolder paramX509CertificateHolder) {
    this(new CMPCertificate(paramX509CertificateHolder.toASN1Structure()));
  }
  
  public CMSProcessableCMPCertificate(CMPCertificate paramCMPCertificate) {
    this.cmpCert = paramCMPCertificate;
  }
  
  public void write(OutputStream paramOutputStream) throws IOException, CMSException {
    paramOutputStream.write(this.cmpCert.getEncoded());
  }
  
  public Object getContent() {
    return this.cmpCert;
  }
  
  public ASN1ObjectIdentifier getContentType() {
    return PKCSObjectIdentifiers.data;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\cmp\CMSProcessableCMPCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */