package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class PKIResponse extends ASN1Object {
  public static final TaggedContentInfo[] EMPTY_CMS_SEQUENCE = new TaggedContentInfo[0];
  
  public static final OtherMsg[] EMPTY_OTHER_MSG = new OtherMsg[0];
  
  private final ASN1Sequence controlSequence;
  
  private final ASN1Sequence cmsSequence;
  
  private final ASN1Sequence otherMsgSequence;
  
  private PKIResponse(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 3)
      throw new IllegalArgumentException("incorrect sequence size"); 
    this.controlSequence = ASN1Sequence.getInstance(paramASN1Sequence.getObjectAt(0));
    this.cmsSequence = ASN1Sequence.getInstance(paramASN1Sequence.getObjectAt(1));
    this.otherMsgSequence = ASN1Sequence.getInstance(paramASN1Sequence.getObjectAt(2));
  }
  
  public static PKIResponse getInstance(Object paramObject) {
    return (paramObject instanceof PKIResponse) ? (PKIResponse)paramObject : ((paramObject != null) ? new PKIResponse(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static PKIResponse getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Sequence.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public PKIResponse(TaggedAttribute paramTaggedAttribute) {
    this.controlSequence = (ASN1Sequence)new DERSequence((ASN1Encodable)paramTaggedAttribute);
    this.cmsSequence = (ASN1Sequence)new DERSequence();
    this.otherMsgSequence = (ASN1Sequence)new DERSequence();
  }
  
  public PKIResponse(TaggedAttribute[] paramArrayOfTaggedAttribute, TaggedContentInfo[] paramArrayOfTaggedContentInfo, OtherMsg[] paramArrayOfOtherMsg) {
    this.controlSequence = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfTaggedAttribute);
    this.cmsSequence = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfTaggedContentInfo);
    this.otherMsgSequence = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfOtherMsg);
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    aSN1EncodableVector.add((ASN1Encodable)this.controlSequence);
    aSN1EncodableVector.add((ASN1Encodable)this.cmsSequence);
    aSN1EncodableVector.add((ASN1Encodable)this.otherMsgSequence);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public ASN1Sequence getControlSequence() {
    return this.controlSequence;
  }
  
  public ASN1Sequence getCmsSequence() {
    return this.cmsSequence;
  }
  
  public ASN1Sequence getOtherMsgSequence() {
    return this.otherMsgSequence;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmc\PKIResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */