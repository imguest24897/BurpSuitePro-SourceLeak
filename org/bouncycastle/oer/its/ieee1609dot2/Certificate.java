package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

public class Certificate extends CertificateBase {
  public Certificate(UINT8 paramUINT8, CertificateType paramCertificateType, IssuerIdentifier paramIssuerIdentifier, ToBeSignedCertificate paramToBeSignedCertificate, Signature paramSignature) {
    super(paramUINT8, paramCertificateType, paramIssuerIdentifier, paramToBeSignedCertificate, paramSignature);
  }
  
  public Certificate(CertificateBase paramCertificateBase) {
    this(paramCertificateBase.getVersion(), paramCertificateBase.getType(), paramCertificateBase.getIssuer(), paramCertificateBase.getToBeSigned(), paramCertificateBase.getSignature());
  }
  
  protected Certificate(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static Certificate getInstance(Object paramObject) {
    return (paramObject instanceof Certificate) ? (Certificate)paramObject : ((paramObject != null) ? new Certificate(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\Certificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */