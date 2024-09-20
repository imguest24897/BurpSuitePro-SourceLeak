package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class ProtectedPart extends ASN1Object {
  private final PKIHeader header;
  
  private final PKIBody body;
  
  private ProtectedPart(ASN1Sequence paramASN1Sequence) {
    this.header = PKIHeader.getInstance(paramASN1Sequence.getObjectAt(0));
    this.body = PKIBody.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public ProtectedPart(PKIHeader paramPKIHeader, PKIBody paramPKIBody) {
    this.header = paramPKIHeader;
    this.body = paramPKIBody;
  }
  
  public static ProtectedPart getInstance(Object paramObject) {
    return (paramObject instanceof ProtectedPart) ? (ProtectedPart)paramObject : ((paramObject != null) ? new ProtectedPart(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public PKIHeader getHeader() {
    return this.header;
  }
  
  public PKIBody getBody() {
    return this.body;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.header);
    aSN1EncodableVector.add((ASN1Encodable)this.body);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\ProtectedPart.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */