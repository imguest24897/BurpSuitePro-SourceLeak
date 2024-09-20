package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.HashedData;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;

public class ToBeSignedLinkCertificateTlm extends ToBeSignedLinkCertificate {
  public ToBeSignedLinkCertificateTlm(Time32 paramTime32, HashedData paramHashedData) {
    super(paramTime32, paramHashedData);
  }
  
  protected ToBeSignedLinkCertificateTlm(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  private ToBeSignedLinkCertificateTlm(ToBeSignedLinkCertificate paramToBeSignedLinkCertificate) {
    super(paramToBeSignedLinkCertificate.getExpiryTime(), paramToBeSignedLinkCertificate.getCertificateHash());
  }
  
  public static ToBeSignedLinkCertificateTlm getInstance(Object paramObject) {
    return (paramObject instanceof ToBeSignedLinkCertificateTlm) ? (ToBeSignedLinkCertificateTlm)paramObject : ((paramObject instanceof ToBeSignedLinkCertificate) ? new ToBeSignedLinkCertificateTlm((ToBeSignedLinkCertificate)paramObject) : ((paramObject != null) ? new ToBeSignedLinkCertificateTlm(ASN1Sequence.getInstance(paramObject)) : null));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\ToBeSignedLinkCertificateTlm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */