package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

public class ImplicitCertificate extends CertificateBase {
  public ImplicitCertificate(CertificateBase paramCertificateBase) {
    this(paramCertificateBase.getVersion(), paramCertificateBase.getIssuer(), paramCertificateBase.getToBeSigned(), paramCertificateBase.getSignature());
  }
  
  public ImplicitCertificate(UINT8 paramUINT8, IssuerIdentifier paramIssuerIdentifier, ToBeSignedCertificate paramToBeSignedCertificate, Signature paramSignature) {
    super(paramUINT8, CertificateType.implicit, paramIssuerIdentifier, paramToBeSignedCertificate, paramSignature);
  }
  
  private ImplicitCertificate(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
    if (!getType().equals((ASN1Primitive)CertificateType.implicit))
      throw new IllegalArgumentException("object was certificate base but the type was not implicit"); 
  }
  
  public static ImplicitCertificate getInstance(Object paramObject) {
    return (paramObject instanceof ImplicitCertificate) ? (ImplicitCertificate)paramObject : ((paramObject != null) ? new ImplicitCertificate(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\ImplicitCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */