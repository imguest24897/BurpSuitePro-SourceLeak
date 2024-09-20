package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

public class ExplicitCertificate extends CertificateBase {
  public ExplicitCertificate(CertificateBase paramCertificateBase) {
    this(paramCertificateBase.getVersion(), paramCertificateBase.getIssuer(), paramCertificateBase.getToBeSigned(), paramCertificateBase.getSignature());
  }
  
  public ExplicitCertificate(UINT8 paramUINT8, IssuerIdentifier paramIssuerIdentifier, ToBeSignedCertificate paramToBeSignedCertificate, Signature paramSignature) {
    super(paramUINT8, CertificateType.explicit, paramIssuerIdentifier, paramToBeSignedCertificate, paramSignature);
  }
  
  protected ExplicitCertificate(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
    if (!getType().equals((ASN1Primitive)CertificateType.explicit))
      throw new IllegalArgumentException("object was certificate base but the type was not explicit"); 
  }
  
  public static ExplicitCertificate getInstance(Object paramObject) {
    return (paramObject instanceof ExplicitCertificate) ? (ExplicitCertificate)paramObject : ((paramObject != null) ? new ExplicitCertificate(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\ExplicitCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */