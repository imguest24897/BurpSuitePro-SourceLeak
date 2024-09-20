package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;

public class SignedDataPayload extends ASN1Object {
  private final Ieee1609Dot2Data data;
  
  private final HashedData extDataHash;
  
  public SignedDataPayload(Ieee1609Dot2Data paramIeee1609Dot2Data, HashedData paramHashedData) {
    this.data = paramIeee1609Dot2Data;
    this.extDataHash = paramHashedData;
  }
  
  private SignedDataPayload(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.data = (Ieee1609Dot2Data)OEROptional.getValue(Ieee1609Dot2Data.class, paramASN1Sequence.getObjectAt(0));
    this.extDataHash = (HashedData)OEROptional.getValue(HashedData.class, paramASN1Sequence.getObjectAt(1));
  }
  
  public static SignedDataPayload getInstance(Object paramObject) {
    return (paramObject instanceof SignedDataPayload) ? (SignedDataPayload)paramObject : ((paramObject != null) ? new SignedDataPayload(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)OEROptional.getInstance(this.data), (ASN1Encodable)OEROptional.getInstance(this.extDataHash) });
  }
  
  public Ieee1609Dot2Data getData() {
    return this.data;
  }
  
  public HashedData getExtDataHash() {
    return this.extDataHash;
  }
  
  public static class Builder {
    private Ieee1609Dot2Data data;
    
    private HashedData extDataHash;
    
    public Builder setData(Ieee1609Dot2Data param1Ieee1609Dot2Data) {
      this.data = param1Ieee1609Dot2Data;
      return this;
    }
    
    public Builder setExtDataHash(HashedData param1HashedData) {
      this.extDataHash = param1HashedData;
      return this;
    }
    
    public SignedDataPayload createSignedDataPayload() {
      return new SignedDataPayload(this.data, this.extDataHash);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\SignedDataPayload.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */