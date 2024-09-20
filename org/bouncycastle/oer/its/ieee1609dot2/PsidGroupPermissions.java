package org.bouncycastle.oer.its.ieee1609dot2;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;

public class PsidGroupPermissions extends ASN1Object {
  private final SubjectPermissions subjectPermissions;
  
  private final ASN1Integer minChainLength;
  
  private final ASN1Integer chainLengthRange;
  
  private final EndEntityType eeType;
  
  private PsidGroupPermissions(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 4)
      throw new IllegalArgumentException("expected sequence size of 4"); 
    this.subjectPermissions = SubjectPermissions.getInstance(paramASN1Sequence.getObjectAt(0));
    this.minChainLength = (ASN1Integer)OEROptional.getInstance(paramASN1Sequence.getObjectAt(1)).getObject(ASN1Integer.class);
    this.chainLengthRange = (ASN1Integer)OEROptional.getInstance(paramASN1Sequence.getObjectAt(2)).getObject(ASN1Integer.class);
    this.eeType = (EndEntityType)OEROptional.getInstance(paramASN1Sequence.getObjectAt(3)).getObject(EndEntityType.class);
  }
  
  public PsidGroupPermissions(SubjectPermissions paramSubjectPermissions, ASN1Integer paramASN1Integer1, ASN1Integer paramASN1Integer2, EndEntityType paramEndEntityType) {
    this.subjectPermissions = paramSubjectPermissions;
    this.minChainLength = paramASN1Integer1;
    this.chainLengthRange = paramASN1Integer2;
    this.eeType = paramEndEntityType;
  }
  
  public static PsidGroupPermissions getInstance(Object paramObject) {
    return (paramObject instanceof PsidGroupPermissions) ? (PsidGroupPermissions)paramObject : ((paramObject != null) ? new PsidGroupPermissions(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public SubjectPermissions getSubjectPermissions() {
    return this.subjectPermissions;
  }
  
  public ASN1Integer getMinChainLength() {
    return this.minChainLength;
  }
  
  public EndEntityType getEeType() {
    return this.eeType;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.subjectPermissions, (ASN1Encodable)OEROptional.getInstance(this.minChainLength), (ASN1Encodable)OEROptional.getInstance(this.chainLengthRange), (ASN1Encodable)OEROptional.getInstance(this.eeType) });
  }
  
  public ASN1Integer getChainLengthRange() {
    return this.chainLengthRange;
  }
  
  public static class Builder {
    private SubjectPermissions subjectPermissions;
    
    private ASN1Integer minChainLength;
    
    private ASN1Integer chainLengthRange;
    
    private EndEntityType eeType;
    
    public Builder setSubjectPermissions(SubjectPermissions param1SubjectPermissions) {
      this.subjectPermissions = param1SubjectPermissions;
      return this;
    }
    
    public Builder setMinChainLength(BigInteger param1BigInteger) {
      this.minChainLength = new ASN1Integer(param1BigInteger);
      return this;
    }
    
    public Builder setMinChainLength(long param1Long) {
      this.minChainLength = new ASN1Integer(param1Long);
      return this;
    }
    
    public Builder setChainLengthRange(ASN1Integer param1ASN1Integer) {
      this.chainLengthRange = param1ASN1Integer;
      return this;
    }
    
    public Builder setMinChainLength(ASN1Integer param1ASN1Integer) {
      this.minChainLength = param1ASN1Integer;
      return this;
    }
    
    public Builder setChainLengthRange(BigInteger param1BigInteger) {
      this.chainLengthRange = new ASN1Integer(param1BigInteger);
      return this;
    }
    
    public Builder setChainLengthRange(long param1Long) {
      this.chainLengthRange = new ASN1Integer(param1Long);
      return this;
    }
    
    public Builder setEeType(EndEntityType param1EndEntityType) {
      this.eeType = param1EndEntityType;
      return this;
    }
    
    public PsidGroupPermissions createPsidGroupPermissions() {
      return new PsidGroupPermissions(this.subjectPermissions, this.minChainLength, this.chainLengthRange, this.eeType);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\PsidGroupPermissions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */