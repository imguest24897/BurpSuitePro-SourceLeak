package org.bouncycastle.cert.crmf;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.CertOrEncCert;
import org.bouncycastle.asn1.cmp.CertResponse;
import org.bouncycastle.asn1.cmp.CertifiedKeyPair;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.asn1.crmf.EncryptedKey;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSEnvelopedData;

public class CertificateResponseBuilder {
  private final ASN1Integer certReqId;
  
  private final PKIStatusInfo statusInfo;
  
  private CertifiedKeyPair certKeyPair;
  
  private ASN1OctetString rspInfo;
  
  public CertificateResponseBuilder(ASN1Integer paramASN1Integer, PKIStatusInfo paramPKIStatusInfo) {
    this.certReqId = paramASN1Integer;
    this.statusInfo = paramPKIStatusInfo;
  }
  
  public CertificateResponseBuilder withCertificate(X509CertificateHolder paramX509CertificateHolder) {
    if (this.certKeyPair != null)
      throw new IllegalStateException("certificate in response already set"); 
    this.certKeyPair = new CertifiedKeyPair(new CertOrEncCert(new CMPCertificate(paramX509CertificateHolder.toASN1Structure())));
    return this;
  }
  
  public CertificateResponseBuilder withCertificate(CMPCertificate paramCMPCertificate) {
    if (this.certKeyPair != null)
      throw new IllegalStateException("certificate in response already set"); 
    this.certKeyPair = new CertifiedKeyPair(new CertOrEncCert(paramCMPCertificate));
    return this;
  }
  
  public CertificateResponseBuilder withCertificate(CMSEnvelopedData paramCMSEnvelopedData) {
    if (this.certKeyPair != null)
      throw new IllegalStateException("certificate in response already set"); 
    this.certKeyPair = new CertifiedKeyPair(new CertOrEncCert(new EncryptedKey(EnvelopedData.getInstance(paramCMSEnvelopedData.toASN1Structure().getContent()))));
    return this;
  }
  
  public CertificateResponseBuilder withResponseInfo(byte[] paramArrayOfbyte) {
    if (this.rspInfo != null)
      throw new IllegalStateException("response info already set"); 
    this.rspInfo = (ASN1OctetString)new DEROctetString(paramArrayOfbyte);
    return this;
  }
  
  public CertificateResponse build() {
    return new CertificateResponse(new CertResponse(this.certReqId, this.statusInfo, this.certKeyPair, this.rspInfo));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\CertificateResponseBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */