package org.bouncycastle.cert.cmp;

import org.bouncycastle.asn1.cmp.CertConfirmContent;
import org.bouncycastle.asn1.cmp.CertStatus;
import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;

public class CertificateConfirmationContent {
  private DigestAlgorithmIdentifierFinder digestAlgFinder;
  
  private CertConfirmContent content;
  
  public CertificateConfirmationContent(CertConfirmContent paramCertConfirmContent) {
    this(paramCertConfirmContent, (DigestAlgorithmIdentifierFinder)new DefaultDigestAlgorithmIdentifierFinder());
  }
  
  public CertificateConfirmationContent(CertConfirmContent paramCertConfirmContent, DigestAlgorithmIdentifierFinder paramDigestAlgorithmIdentifierFinder) {
    this.digestAlgFinder = paramDigestAlgorithmIdentifierFinder;
    this.content = paramCertConfirmContent;
  }
  
  public static CertificateConfirmationContent fromPKIBody(PKIBody paramPKIBody) {
    return fromPKIBody(paramPKIBody, (DigestAlgorithmIdentifierFinder)new DefaultDigestAlgorithmIdentifierFinder());
  }
  
  public static CertificateConfirmationContent fromPKIBody(PKIBody paramPKIBody, DigestAlgorithmIdentifierFinder paramDigestAlgorithmIdentifierFinder) {
    if (!isCertificateConfirmationContent(paramPKIBody.getType()))
      throw new IllegalArgumentException("content of PKIBody wrong type: " + paramPKIBody.getType()); 
    return new CertificateConfirmationContent(CertConfirmContent.getInstance(paramPKIBody.getContent()), paramDigestAlgorithmIdentifierFinder);
  }
  
  public static boolean isCertificateConfirmationContent(int paramInt) {
    switch (paramInt) {
      case 24:
        return true;
    } 
    return false;
  }
  
  public CertConfirmContent toASN1Structure() {
    return this.content;
  }
  
  public CertificateStatus[] getStatusMessages() {
    CertStatus[] arrayOfCertStatus = this.content.toCertStatusArray();
    CertificateStatus[] arrayOfCertificateStatus = new CertificateStatus[arrayOfCertStatus.length];
    for (byte b = 0; b != arrayOfCertificateStatus.length; b++)
      arrayOfCertificateStatus[b] = new CertificateStatus(this.digestAlgFinder, arrayOfCertStatus[b]); 
    return arrayOfCertificateStatus;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\cmp\CertificateConfirmationContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */