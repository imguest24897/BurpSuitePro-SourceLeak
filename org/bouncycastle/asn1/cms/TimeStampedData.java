package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERIA5String;

public class TimeStampedData extends ASN1Object {
  private ASN1Integer version = new ASN1Integer(1L);
  
  private ASN1IA5String dataUri;
  
  private MetaData metaData;
  
  private ASN1OctetString content;
  
  private Evidence temporalEvidence;
  
  public TimeStampedData(ASN1IA5String paramASN1IA5String, MetaData paramMetaData, ASN1OctetString paramASN1OctetString, Evidence paramEvidence) {
    this.dataUri = paramASN1IA5String;
    this.metaData = paramMetaData;
    this.content = paramASN1OctetString;
    this.temporalEvidence = paramEvidence;
  }
  
  private TimeStampedData(ASN1Sequence paramASN1Sequence) {
    byte b = 1;
    if (paramASN1Sequence.getObjectAt(b) instanceof ASN1IA5String)
      this.dataUri = ASN1IA5String.getInstance(paramASN1Sequence.getObjectAt(b++)); 
    if (paramASN1Sequence.getObjectAt(b) instanceof MetaData || paramASN1Sequence.getObjectAt(b) instanceof ASN1Sequence)
      this.metaData = MetaData.getInstance(paramASN1Sequence.getObjectAt(b++)); 
    if (paramASN1Sequence.getObjectAt(b) instanceof ASN1OctetString)
      this.content = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(b++)); 
    this.temporalEvidence = Evidence.getInstance(paramASN1Sequence.getObjectAt(b));
  }
  
  public static TimeStampedData getInstance(Object paramObject) {
    return (paramObject == null || paramObject instanceof TimeStampedData) ? (TimeStampedData)paramObject : new TimeStampedData(ASN1Sequence.getInstance(paramObject));
  }
  
  public DERIA5String getDataUri() {
    return (null == this.dataUri || this.dataUri instanceof DERIA5String) ? (DERIA5String)this.dataUri : new DERIA5String(this.dataUri.getString(), false);
  }
  
  public ASN1IA5String getDataUriIA5() {
    return this.dataUri;
  }
  
  public MetaData getMetaData() {
    return this.metaData;
  }
  
  public ASN1OctetString getContent() {
    return this.content;
  }
  
  public Evidence getTemporalEvidence() {
    return this.temporalEvidence;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
    aSN1EncodableVector.add((ASN1Encodable)this.version);
    if (this.dataUri != null)
      aSN1EncodableVector.add((ASN1Encodable)this.dataUri); 
    if (this.metaData != null)
      aSN1EncodableVector.add((ASN1Encodable)this.metaData); 
    if (this.content != null)
      aSN1EncodableVector.add((ASN1Encodable)this.content); 
    aSN1EncodableVector.add((ASN1Encodable)this.temporalEvidence);
    return (ASN1Primitive)new BERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cms\TimeStampedData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */