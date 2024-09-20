package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class ValidityPeriod extends ASN1Object {
  private final Time32 start;
  
  private final Duration duration;
  
  public ValidityPeriod(Time32 paramTime32, Duration paramDuration) {
    this.start = paramTime32;
    this.duration = paramDuration;
  }
  
  public static ValidityPeriod getInstance(Object paramObject) {
    return (paramObject instanceof ValidityPeriod) ? (ValidityPeriod)paramObject : ((paramObject != null) ? new ValidityPeriod(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private ValidityPeriod(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.start = Time32.getInstance(paramASN1Sequence.getObjectAt(0));
    this.duration = Duration.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public Time32 getStart() {
    return this.start;
  }
  
  public Duration getDuration() {
    return this.duration;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.start, (ASN1Encodable)this.duration });
  }
  
  public String toString() {
    return "ValidityPeriod[" + this.start + " " + this.duration + "]";
  }
  
  public static class Builder {
    private Time32 start;
    
    private Duration duration;
    
    public Builder setStart(Time32 param1Time32) {
      this.start = param1Time32;
      return this;
    }
    
    public Builder setDuration(Duration param1Duration) {
      this.duration = param1Duration;
      return this;
    }
    
    public ValidityPeriod createValidityPeriod() {
      return new ValidityPeriod(this.start, this.duration);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\ValidityPeriod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */