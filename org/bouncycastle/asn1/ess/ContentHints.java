package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

public class ContentHints extends ASN1Object {
  private ASN1UTF8String contentDescription;
  
  private ASN1ObjectIdentifier contentType;
  
  public static ContentHints getInstance(Object paramObject) {
    return (paramObject instanceof ContentHints) ? (ContentHints)paramObject : ((paramObject != null) ? new ContentHints(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private ContentHints(ASN1Sequence paramASN1Sequence) {
    ASN1Encodable aSN1Encodable = paramASN1Sequence.getObjectAt(0);
    if (aSN1Encodable.toASN1Primitive() instanceof ASN1UTF8String) {
      this.contentDescription = ASN1UTF8String.getInstance(aSN1Encodable);
      this.contentType = ASN1ObjectIdentifier.getInstance(paramASN1Sequence.getObjectAt(1));
    } else {
      this.contentType = ASN1ObjectIdentifier.getInstance(paramASN1Sequence.getObjectAt(0));
    } 
  }
  
  public ContentHints(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this.contentType = paramASN1ObjectIdentifier;
    this.contentDescription = null;
  }
  
  public ContentHints(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1UTF8String paramASN1UTF8String) {
    this.contentType = paramASN1ObjectIdentifier;
    this.contentDescription = paramASN1UTF8String;
  }
  
  public ASN1ObjectIdentifier getContentType() {
    return this.contentType;
  }
  
  public DERUTF8String getContentDescription() {
    return (null == this.contentDescription || this.contentDescription instanceof DERUTF8String) ? (DERUTF8String)this.contentDescription : new DERUTF8String(this.contentDescription.getString());
  }
  
  public ASN1UTF8String getContentDescriptionUTF8() {
    return this.contentDescription;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    if (this.contentDescription != null)
      aSN1EncodableVector.add((ASN1Encodable)this.contentDescription); 
    aSN1EncodableVector.add((ASN1Encodable)this.contentType);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\ess\ContentHints.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */