package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;

public class TimeStampReq extends ASN1Object {
  ASN1Integer version;
  
  MessageImprint messageImprint;
  
  ASN1ObjectIdentifier tsaPolicy;
  
  ASN1Integer nonce;
  
  ASN1Boolean certReq;
  
  Extensions extensions;
  
  public static TimeStampReq getInstance(Object paramObject) {
    return (paramObject instanceof TimeStampReq) ? (TimeStampReq)paramObject : ((paramObject != null) ? new TimeStampReq(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private TimeStampReq(ASN1Sequence paramASN1Sequence) {
    int i = paramASN1Sequence.size();
    byte b1 = 0;
    this.version = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(b1));
    this.messageImprint = MessageImprint.getInstance(paramASN1Sequence.getObjectAt(++b1));
    for (byte b2 = ++b1; b2 < i; b2++) {
      if (paramASN1Sequence.getObjectAt(b2) instanceof ASN1ObjectIdentifier) {
        checkOption(this.tsaPolicy, b2, 2);
        this.tsaPolicy = ASN1ObjectIdentifier.getInstance(paramASN1Sequence.getObjectAt(b2));
      } else if (paramASN1Sequence.getObjectAt(b2) instanceof ASN1Integer) {
        checkOption(this.nonce, b2, 3);
        this.nonce = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(b2));
      } else if (paramASN1Sequence.getObjectAt(b2) instanceof ASN1Boolean) {
        checkOption(this.certReq, b2, 4);
        this.certReq = ASN1Boolean.getInstance(paramASN1Sequence.getObjectAt(b2));
      } else if (paramASN1Sequence.getObjectAt(b2) instanceof ASN1TaggedObject) {
        checkOption(this.extensions, b2, 5);
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject)paramASN1Sequence.getObjectAt(b2);
        if (aSN1TaggedObject.getTagNo() == 0)
          this.extensions = Extensions.getInstance(aSN1TaggedObject, false); 
      } else {
        throw new IllegalArgumentException("unidentified structure in sequence");
      } 
    } 
  }
  
  private void checkOption(Object paramObject, int paramInt1, int paramInt2) {
    if (paramObject != null || paramInt1 > paramInt2)
      throw new IllegalArgumentException("badly placed optional in sequence"); 
  }
  
  public TimeStampReq(MessageImprint paramMessageImprint, ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Integer paramASN1Integer, ASN1Boolean paramASN1Boolean, Extensions paramExtensions) {
    this.version = new ASN1Integer(1L);
    this.messageImprint = paramMessageImprint;
    this.tsaPolicy = paramASN1ObjectIdentifier;
    this.nonce = paramASN1Integer;
    this.certReq = paramASN1Boolean;
    this.extensions = paramExtensions;
  }
  
  public ASN1Integer getVersion() {
    return this.version;
  }
  
  public MessageImprint getMessageImprint() {
    return this.messageImprint;
  }
  
  public ASN1ObjectIdentifier getReqPolicy() {
    return this.tsaPolicy;
  }
  
  public ASN1Integer getNonce() {
    return this.nonce;
  }
  
  public ASN1Boolean getCertReq() {
    return (this.certReq == null) ? ASN1Boolean.FALSE : this.certReq;
  }
  
  public Extensions getExtensions() {
    return this.extensions;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
    aSN1EncodableVector.add((ASN1Encodable)this.version);
    aSN1EncodableVector.add((ASN1Encodable)this.messageImprint);
    if (this.tsaPolicy != null)
      aSN1EncodableVector.add((ASN1Encodable)this.tsaPolicy); 
    if (this.nonce != null)
      aSN1EncodableVector.add((ASN1Encodable)this.nonce); 
    if (this.certReq != null && this.certReq.isTrue())
      aSN1EncodableVector.add((ASN1Encodable)this.certReq); 
    if (this.extensions != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(false, 0, (ASN1Encodable)this.extensions)); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\tsp\TimeStampReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */