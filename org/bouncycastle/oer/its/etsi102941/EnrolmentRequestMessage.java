package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataSignedAndEncryptedUnicast;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;

public class EnrolmentRequestMessage extends EtsiTs103097DataSignedAndEncryptedUnicast {
  public EnrolmentRequestMessage(Ieee1609Dot2Content paramIeee1609Dot2Content) {
    super(paramIeee1609Dot2Content);
  }
  
  protected EnrolmentRequestMessage(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static EnrolmentRequestMessage getInstance(Object paramObject) {
    return (paramObject instanceof EnrolmentRequestMessage) ? (EnrolmentRequestMessage)paramObject : ((paramObject != null) ? new EnrolmentRequestMessage(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\EnrolmentRequestMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */