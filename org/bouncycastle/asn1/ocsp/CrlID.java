package org.bouncycastle.asn1.ocsp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class CrlID extends ASN1Object {
  private ASN1IA5String crlUrl;
  
  private ASN1Integer crlNum;
  
  private ASN1GeneralizedTime crlTime;
  
  private CrlID(ASN1Sequence paramASN1Sequence) {
    Enumeration<ASN1TaggedObject> enumeration = paramASN1Sequence.getObjects();
    while (enumeration.hasMoreElements()) {
      ASN1TaggedObject aSN1TaggedObject = enumeration.nextElement();
      switch (aSN1TaggedObject.getTagNo()) {
        case 0:
          this.crlUrl = ASN1IA5String.getInstance(aSN1TaggedObject, true);
          continue;
        case 1:
          this.crlNum = ASN1Integer.getInstance(aSN1TaggedObject, true);
          continue;
        case 2:
          this.crlTime = ASN1GeneralizedTime.getInstance(aSN1TaggedObject, true);
          continue;
      } 
      throw new IllegalArgumentException("unknown tag number: " + aSN1TaggedObject.getTagNo());
    } 
  }
  
  public static CrlID getInstance(Object paramObject) {
    return (paramObject instanceof CrlID) ? (CrlID)paramObject : ((paramObject != null) ? new CrlID(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public DERIA5String getCrlUrl() {
    return (null == this.crlUrl || this.crlUrl instanceof DERIA5String) ? (DERIA5String)this.crlUrl : new DERIA5String(this.crlUrl.getString(), false);
  }
  
  public ASN1IA5String getCrlUrlIA5() {
    return this.crlUrl;
  }
  
  public ASN1Integer getCrlNum() {
    return this.crlNum;
  }
  
  public ASN1GeneralizedTime getCrlTime() {
    return this.crlTime;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    if (this.crlUrl != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, 0, (ASN1Encodable)this.crlUrl)); 
    if (this.crlNum != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, 1, (ASN1Encodable)this.crlNum)); 
    if (this.crlTime != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, 2, (ASN1Encodable)this.crlTime)); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\ocsp\CrlID.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */