package org.bouncycastle.oer.its.etsi103097.extension;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

public class EtsiTs102941CtlRequest extends ASN1Object {
  private final HashedId8 issuerId;
  
  private final ASN1Integer lastKnownCtlSequence;
  
  protected EtsiTs102941CtlRequest(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.issuerId = HashedId8.getInstance(paramASN1Sequence.getObjectAt(0));
    if (paramASN1Sequence.size() == 2) {
      this.lastKnownCtlSequence = (ASN1Integer)OEROptional.getValue(ASN1Integer.class, paramASN1Sequence.getObjectAt(1));
    } else {
      this.lastKnownCtlSequence = null;
    } 
  }
  
  public EtsiTs102941CtlRequest(HashedId8 paramHashedId8, ASN1Integer paramASN1Integer) {
    this.issuerId = paramHashedId8;
    this.lastKnownCtlSequence = paramASN1Integer;
  }
  
  public static EtsiTs102941CtlRequest getInstance(Object paramObject) {
    return (paramObject instanceof EtsiTs102941CtlRequest) ? (EtsiTs102941CtlRequest)paramObject : ((paramObject != null) ? new EtsiTs102941CtlRequest(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public HashedId8 getIssuerId() {
    return this.issuerId;
  }
  
  public ASN1Integer getLastKnownCtlSequence() {
    return this.lastKnownCtlSequence;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.issuerId, (ASN1Encodable)OEROptional.getInstance(this.lastKnownCtlSequence) });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private HashedId8 issuerId;
    
    private ASN1Integer lastKnownCtlSequence;
    
    public Builder setIssuerId(HashedId8 param1HashedId8) {
      this.issuerId = param1HashedId8;
      return this;
    }
    
    public Builder setLastKnownCtlSequence(ASN1Integer param1ASN1Integer) {
      this.lastKnownCtlSequence = param1ASN1Integer;
      return this;
    }
    
    public EtsiTs102941CtlRequest createEtsiTs102941CtlRequest() {
      return new EtsiTs102941CtlRequest(this.issuerId, this.lastKnownCtlSequence);
    }
    
    public EtsiTs102941DeltaCtlRequest createEtsiTs102941DeltaCtlRequest() {
      return new EtsiTs102941DeltaCtlRequest(this.issuerId, this.lastKnownCtlSequence);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi103097\extension\EtsiTs102941CtlRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */