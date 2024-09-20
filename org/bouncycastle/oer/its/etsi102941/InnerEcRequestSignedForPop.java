package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataSigned;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;

public class InnerEcRequestSignedForPop extends EtsiTs103097DataSigned {
  public InnerEcRequestSignedForPop(Ieee1609Dot2Content paramIeee1609Dot2Content) {
    super(paramIeee1609Dot2Content);
  }
  
  protected InnerEcRequestSignedForPop(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static InnerEcRequestSignedForPop getInstance(Object paramObject) {
    return (paramObject instanceof InnerEcRequestSignedForPop) ? (InnerEcRequestSignedForPop)paramObject : ((paramObject != null) ? new InnerEcRequestSignedForPop(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\InnerEcRequestSignedForPop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */