package org.bouncycastle.oer.its.etsi103097;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Data;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

public class EtsiTs103097Data extends Ieee1609Dot2Data {
  public EtsiTs103097Data(Ieee1609Dot2Content paramIeee1609Dot2Content) {
    super(new UINT8(3), paramIeee1609Dot2Content);
  }
  
  public EtsiTs103097Data(UINT8 paramUINT8, Ieee1609Dot2Content paramIeee1609Dot2Content) {
    super(paramUINT8, paramIeee1609Dot2Content);
  }
  
  protected EtsiTs103097Data(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static EtsiTs103097Data getInstance(Object paramObject) {
    return (paramObject instanceof EtsiTs103097Data) ? (EtsiTs103097Data)paramObject : ((paramObject != null) ? new EtsiTs103097Data(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi103097\EtsiTs103097Data.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */