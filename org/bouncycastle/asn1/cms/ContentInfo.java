package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.DLTaggedObject;

public class ContentInfo extends ASN1Object implements CMSObjectIdentifiers {
  private final ASN1ObjectIdentifier contentType;
  
  private final ASN1Encodable content;
  
  private final boolean isDefiniteLength;
  
  public static ContentInfo getInstance(Object paramObject) {
    return (paramObject instanceof ContentInfo) ? (ContentInfo)paramObject : ((paramObject != null) ? new ContentInfo(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static ContentInfo getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Sequence.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  private ContentInfo(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() < 1 || paramASN1Sequence.size() > 2)
      throw new IllegalArgumentException("Bad sequence size: " + paramASN1Sequence.size()); 
    this.contentType = (ASN1ObjectIdentifier)paramASN1Sequence.getObjectAt(0);
    if (paramASN1Sequence.size() > 1) {
      ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(paramASN1Sequence.getObjectAt(1), 128);
      if (!aSN1TaggedObject.isExplicit() || aSN1TaggedObject.getTagNo() != 0)
        throw new IllegalArgumentException("Bad tag for 'content'"); 
      this.content = (ASN1Encodable)aSN1TaggedObject.getExplicitBaseObject();
    } else {
      this.content = null;
    } 
    this.isDefiniteLength = !(paramASN1Sequence instanceof BERSequence);
  }
  
  public ContentInfo(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Encodable paramASN1Encodable) {
    this.contentType = paramASN1ObjectIdentifier;
    this.content = paramASN1Encodable;
    if (paramASN1Encodable != null) {
      ASN1Primitive aSN1Primitive = paramASN1Encodable.toASN1Primitive();
      this.isDefiniteLength = (aSN1Primitive instanceof org.bouncycastle.asn1.DEROctetString || aSN1Primitive instanceof DLSequence || aSN1Primitive instanceof org.bouncycastle.asn1.DERSequence);
    } else {
      this.isDefiniteLength = true;
    } 
  }
  
  public ASN1ObjectIdentifier getContentType() {
    return this.contentType;
  }
  
  public ASN1Encodable getContent() {
    return this.content;
  }
  
  public boolean isDefiniteLength() {
    return this.isDefiniteLength;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.contentType);
    if (this.content != null)
      if (this.isDefiniteLength) {
        aSN1EncodableVector.add((ASN1Encodable)new DLTaggedObject(0, this.content));
      } else {
        aSN1EncodableVector.add((ASN1Encodable)new BERTaggedObject(0, this.content));
      }  
    return this.isDefiniteLength ? (ASN1Primitive)new DLSequence(aSN1EncodableVector) : (ASN1Primitive)new BERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cms\ContentInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */