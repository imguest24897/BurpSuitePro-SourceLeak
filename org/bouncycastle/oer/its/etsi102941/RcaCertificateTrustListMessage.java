package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataSigned;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;

public class RcaCertificateTrustListMessage extends EtsiTs103097DataSigned {
  public RcaCertificateTrustListMessage(Ieee1609Dot2Content paramIeee1609Dot2Content) {
    super(paramIeee1609Dot2Content);
  }
  
  protected RcaCertificateTrustListMessage(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static RcaCertificateTrustListMessage getInstance(Object paramObject) {
    return (paramObject instanceof RcaCertificateTrustListMessage) ? (RcaCertificateTrustListMessage)paramObject : ((paramObject != null) ? new RcaCertificateTrustListMessage(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\RcaCertificateTrustListMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */