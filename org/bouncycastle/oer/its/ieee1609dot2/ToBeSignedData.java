package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class ToBeSignedData extends ASN1Object {
  private final SignedDataPayload payload;
  
  private final HeaderInfo headerInfo;
  
  public ToBeSignedData(SignedDataPayload paramSignedDataPayload, HeaderInfo paramHeaderInfo) {
    this.payload = paramSignedDataPayload;
    this.headerInfo = paramHeaderInfo;
  }
  
  private ToBeSignedData(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.payload = SignedDataPayload.getInstance(paramASN1Sequence.getObjectAt(0));
    this.headerInfo = HeaderInfo.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static ToBeSignedData getInstance(Object paramObject) {
    return (paramObject instanceof ToBeSignedData) ? (ToBeSignedData)paramObject : ((paramObject != null) ? new ToBeSignedData(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public SignedDataPayload getPayload() {
    return this.payload;
  }
  
  public HeaderInfo getHeaderInfo() {
    return this.headerInfo;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.payload, (ASN1Encodable)this.headerInfo });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private SignedDataPayload payload;
    
    private HeaderInfo headerInfo;
    
    public Builder setPayload(SignedDataPayload param1SignedDataPayload) {
      this.payload = param1SignedDataPayload;
      return this;
    }
    
    public Builder setHeaderInfo(HeaderInfo param1HeaderInfo) {
      this.headerInfo = param1HeaderInfo;
      return this;
    }
    
    public ToBeSignedData createToBeSignedData() {
      return new ToBeSignedData(this.payload, this.headerInfo);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\ToBeSignedData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */