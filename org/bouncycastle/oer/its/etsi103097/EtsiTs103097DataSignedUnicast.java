package org.bouncycastle.oer.its.etsi103097;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;

public class EtsiTs103097DataSignedUnicast extends EtsiTs103097Data {
  public EtsiTs103097DataSignedUnicast(Ieee1609Dot2Content paramIeee1609Dot2Content) {
    super(paramIeee1609Dot2Content);
  }
  
  protected EtsiTs103097DataSignedUnicast(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static EtsiTs103097DataSignedUnicast getInstance(Object paramObject) {
    return (paramObject instanceof EtsiTs103097DataSignedUnicast) ? (EtsiTs103097DataSignedUnicast)paramObject : ((paramObject != null) ? new EtsiTs103097DataSignedUnicast(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi103097\EtsiTs103097DataSignedUnicast.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */