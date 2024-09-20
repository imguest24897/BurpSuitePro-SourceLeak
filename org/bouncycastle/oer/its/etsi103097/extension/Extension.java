package org.bouncycastle.oer.its.etsi103097.extension;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class Extension extends ASN1Object {
  public static final ExtId etsiTs102941CrlRequestId = new ExtId(1L);
  
  public static final ExtId etsiTs102941DeltaCtlRequestId = new ExtId(2L);
  
  private final ExtId id;
  
  private final ASN1Encodable content;
  
  protected Extension(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.id = ExtId.getInstance(paramASN1Sequence.getObjectAt(0));
    if (this.id.equals(etsiTs102941CrlRequestId)) {
      this.content = (ASN1Encodable)EtsiTs102941CrlRequest.getInstance(paramASN1Sequence.getObjectAt(1));
    } else if (this.id.equals(etsiTs102941DeltaCtlRequestId)) {
      this.content = (ASN1Encodable)EtsiTs102941DeltaCtlRequest.getInstance(paramASN1Sequence.getObjectAt(1));
    } else {
      throw new IllegalArgumentException("id not 1 (EtsiTs102941CrlRequest) or 2 (EtsiTs102941DeltaCtlRequest)");
    } 
  }
  
  public Extension(ExtId paramExtId, ASN1Encodable paramASN1Encodable) {
    this.id = paramExtId;
    if (paramExtId.getExtId().intValue() != 1 && paramExtId.getExtId().intValue() != 2)
      throw new IllegalArgumentException("id not 1 (EtsiTs102941CrlRequest) or 2 (EtsiTs102941DeltaCtlRequest)"); 
    this.content = paramASN1Encodable;
  }
  
  public static Extension etsiTs102941CrlRequest(EtsiTs102941CrlRequest paramEtsiTs102941CrlRequest) {
    return new Extension(etsiTs102941CrlRequestId, (ASN1Encodable)paramEtsiTs102941CrlRequest);
  }
  
  public static Extension etsiTs102941DeltaCtlRequest(EtsiTs102941DeltaCtlRequest paramEtsiTs102941DeltaCtlRequest) {
    return new Extension(etsiTs102941DeltaCtlRequestId, (ASN1Encodable)paramEtsiTs102941DeltaCtlRequest);
  }
  
  public static Extension getInstance(Object paramObject) {
    return (paramObject instanceof Extension) ? (Extension)paramObject : ((paramObject != null) ? new Extension(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.id, this.content });
  }
  
  public ExtId getId() {
    return this.id;
  }
  
  public ASN1Encodable getContent() {
    return this.content;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi103097\extension\Extension.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */