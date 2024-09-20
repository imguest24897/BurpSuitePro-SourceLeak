package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

public class CounterSignature extends Ieee1609Dot2Data {
  public CounterSignature(UINT8 paramUINT8, Ieee1609Dot2Content paramIeee1609Dot2Content) {
    super(paramUINT8, paramIeee1609Dot2Content);
  }
  
  protected CounterSignature(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static Ieee1609Dot2Data getInstance(Object paramObject) {
    return (paramObject instanceof Ieee1609Dot2Data) ? (Ieee1609Dot2Data)paramObject : ((paramObject != null) ? new CounterSignature(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\CounterSignature.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */