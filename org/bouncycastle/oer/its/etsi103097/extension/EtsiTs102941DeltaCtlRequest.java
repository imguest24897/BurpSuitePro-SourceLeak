package org.bouncycastle.oer.its.etsi103097.extension;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

public class EtsiTs102941DeltaCtlRequest extends EtsiTs102941CtlRequest {
  private EtsiTs102941DeltaCtlRequest(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public EtsiTs102941DeltaCtlRequest(EtsiTs102941CtlRequest paramEtsiTs102941CtlRequest) {
    super(paramEtsiTs102941CtlRequest.getIssuerId(), paramEtsiTs102941CtlRequest.getLastKnownCtlSequence());
  }
  
  public EtsiTs102941DeltaCtlRequest(HashedId8 paramHashedId8, ASN1Integer paramASN1Integer) {
    super(paramHashedId8, paramASN1Integer);
  }
  
  public static EtsiTs102941DeltaCtlRequest getInstance(Object paramObject) {
    return (paramObject instanceof EtsiTs102941DeltaCtlRequest) ? (EtsiTs102941DeltaCtlRequest)paramObject : ((paramObject != null) ? new EtsiTs102941DeltaCtlRequest(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi103097\extension\EtsiTs102941DeltaCtlRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */