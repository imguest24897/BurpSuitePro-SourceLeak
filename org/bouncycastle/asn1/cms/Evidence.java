package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.tsp.EvidenceRecord;

public class Evidence extends ASN1Object implements ASN1Choice {
  private TimeStampTokenEvidence tstEvidence;
  
  private EvidenceRecord ersEvidence;
  
  private ASN1Sequence otherEvidence;
  
  public Evidence(TimeStampTokenEvidence paramTimeStampTokenEvidence) {
    this.tstEvidence = paramTimeStampTokenEvidence;
  }
  
  public Evidence(EvidenceRecord paramEvidenceRecord) {
    this.ersEvidence = paramEvidenceRecord;
  }
  
  private Evidence(ASN1TaggedObject paramASN1TaggedObject) {
    if (paramASN1TaggedObject.getTagNo() == 0) {
      this.tstEvidence = TimeStampTokenEvidence.getInstance(paramASN1TaggedObject, false);
    } else if (paramASN1TaggedObject.getTagNo() == 1) {
      this.ersEvidence = EvidenceRecord.getInstance(paramASN1TaggedObject, false);
    } else if (paramASN1TaggedObject.getTagNo() == 2) {
      this.otherEvidence = ASN1Sequence.getInstance(paramASN1TaggedObject, false);
    } else {
      throw new IllegalArgumentException("unknown tag in Evidence");
    } 
  }
  
  public static Evidence getInstance(Object paramObject) {
    if (paramObject == null || paramObject instanceof Evidence)
      return (Evidence)paramObject; 
    if (paramObject instanceof ASN1TaggedObject)
      return new Evidence(ASN1TaggedObject.getInstance(paramObject, 128)); 
    throw new IllegalArgumentException("unknown object in getInstance");
  }
  
  public static Evidence getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    if (!paramBoolean)
      throw new IllegalArgumentException("choice item must be explicitly tagged"); 
    return getInstance(paramASN1TaggedObject.getExplicitBaseObject());
  }
  
  public TimeStampTokenEvidence getTstEvidence() {
    return this.tstEvidence;
  }
  
  public EvidenceRecord getErsEvidence() {
    return this.ersEvidence;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)((this.tstEvidence != null) ? new DERTaggedObject(false, 0, (ASN1Encodable)this.tstEvidence) : ((this.ersEvidence != null) ? new DERTaggedObject(false, 1, (ASN1Encodable)this.ersEvidence) : new DERTaggedObject(false, 2, (ASN1Encodable)this.otherEvidence)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cms\Evidence.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */