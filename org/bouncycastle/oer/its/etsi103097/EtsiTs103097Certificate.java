package org.bouncycastle.oer.its.etsi103097;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.ExplicitCertificate;
import org.bouncycastle.oer.its.ieee1609dot2.IssuerIdentifier;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

public class EtsiTs103097Certificate extends ExplicitCertificate {
  public EtsiTs103097Certificate(UINT8 paramUINT8, IssuerIdentifier paramIssuerIdentifier, ToBeSignedCertificate paramToBeSignedCertificate, Signature paramSignature) {
    super(paramUINT8, paramIssuerIdentifier, paramToBeSignedCertificate, paramSignature);
  }
  
  protected EtsiTs103097Certificate(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static EtsiTs103097Certificate getInstance(Object paramObject) {
    return (paramObject instanceof EtsiTs103097Certificate) ? (EtsiTs103097Certificate)paramObject : ((paramObject != null) ? new EtsiTs103097Certificate(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi103097\EtsiTs103097Certificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */