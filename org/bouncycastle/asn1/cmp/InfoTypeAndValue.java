package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class InfoTypeAndValue extends ASN1Object {
  private final ASN1ObjectIdentifier infoType;
  
  private final ASN1Encodable infoValue;
  
  private InfoTypeAndValue(ASN1Sequence paramASN1Sequence) {
    this.infoType = ASN1ObjectIdentifier.getInstance(paramASN1Sequence.getObjectAt(0));
    if (paramASN1Sequence.size() > 1) {
      this.infoValue = paramASN1Sequence.getObjectAt(1);
    } else {
      this.infoValue = null;
    } 
  }
  
  public InfoTypeAndValue(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this(paramASN1ObjectIdentifier, null);
  }
  
  public InfoTypeAndValue(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Encodable paramASN1Encodable) {
    if (paramASN1ObjectIdentifier == null)
      throw new NullPointerException("'infoType' cannot be null"); 
    this.infoType = paramASN1ObjectIdentifier;
    this.infoValue = paramASN1Encodable;
  }
  
  public static InfoTypeAndValue getInstance(Object paramObject) {
    return (paramObject instanceof InfoTypeAndValue) ? (InfoTypeAndValue)paramObject : ((paramObject != null) ? new InfoTypeAndValue(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1ObjectIdentifier getInfoType() {
    return this.infoType;
  }
  
  public ASN1Encodable getInfoValue() {
    return this.infoValue;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.infoType);
    if (this.infoValue != null)
      aSN1EncodableVector.add(this.infoValue); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\InfoTypeAndValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */