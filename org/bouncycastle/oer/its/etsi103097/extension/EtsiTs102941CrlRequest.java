package org.bouncycastle.oer.its.etsi103097.extension;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;

public class EtsiTs102941CrlRequest extends ASN1Object {
  private final HashedId8 issuerId;
  
  private final Time32 lastKnownUpdate;
  
  public EtsiTs102941CrlRequest(HashedId8 paramHashedId8, Time32 paramTime32) {
    this.issuerId = paramHashedId8;
    this.lastKnownUpdate = paramTime32;
  }
  
  private EtsiTs102941CrlRequest(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.issuerId = HashedId8.getInstance(paramASN1Sequence.getObjectAt(0));
    if (paramASN1Sequence.size() > 1) {
      this.lastKnownUpdate = (Time32)OEROptional.getValue(Time32.class, paramASN1Sequence.getObjectAt(1));
    } else {
      this.lastKnownUpdate = null;
    } 
  }
  
  public static EtsiTs102941CrlRequest getInstance(Object paramObject) {
    return (paramObject instanceof EtsiTs102941CrlRequest) ? (EtsiTs102941CrlRequest)paramObject : ((paramObject != null) ? new EtsiTs102941CrlRequest(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public HashedId8 getIssuerId() {
    return this.issuerId;
  }
  
  public Time32 getLastKnownUpdate() {
    return this.lastKnownUpdate;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.issuerId, (ASN1Encodable)OEROptional.getInstance(this.lastKnownUpdate) });
  }
  
  public static class Builder {
    private HashedId8 issuerId;
    
    private Time32 lastKnownUpdate;
    
    public Builder setIssuerId(HashedId8 param1HashedId8) {
      this.issuerId = param1HashedId8;
      return this;
    }
    
    public Builder setLastKnownUpdate(Time32 param1Time32) {
      this.lastKnownUpdate = param1Time32;
      return this;
    }
    
    public EtsiTs102941CrlRequest createEtsiTs102941CrlRequest() {
      return new EtsiTs102941CrlRequest(this.issuerId, this.lastKnownUpdate);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi103097\extension\EtsiTs102941CrlRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */