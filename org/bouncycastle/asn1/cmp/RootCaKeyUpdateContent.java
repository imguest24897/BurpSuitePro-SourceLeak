package org.bouncycastle.asn1.cmp;

import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class RootCaKeyUpdateContent extends ASN1Object {
  private final CMPCertificate newWithNew;
  
  private final CMPCertificate newWithOld;
  
  private final CMPCertificate oldWithNew;
  
  public RootCaKeyUpdateContent(CMPCertificate paramCMPCertificate1, CMPCertificate paramCMPCertificate2, CMPCertificate paramCMPCertificate3) {
    if (paramCMPCertificate1 == null)
      throw new NullPointerException("'newWithNew' cannot be null"); 
    this.newWithNew = paramCMPCertificate1;
    this.newWithOld = paramCMPCertificate2;
    this.oldWithNew = paramCMPCertificate3;
  }
  
  private RootCaKeyUpdateContent(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() < 1 || paramASN1Sequence.size() > 3)
      throw new IllegalArgumentException("expected sequence of 1 to 3 elements only"); 
    CMPCertificate cMPCertificate2 = null;
    CMPCertificate cMPCertificate3 = null;
    Iterator iterator = paramASN1Sequence.iterator();
    CMPCertificate cMPCertificate1 = CMPCertificate.getInstance(iterator.next());
    while (iterator.hasNext()) {
      ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(iterator.next());
      if (aSN1TaggedObject.hasContextTag(0)) {
        cMPCertificate2 = CMPCertificate.getInstance(aSN1TaggedObject, true);
        continue;
      } 
      if (aSN1TaggedObject.hasContextTag(1))
        cMPCertificate3 = CMPCertificate.getInstance(aSN1TaggedObject, true); 
    } 
    this.newWithNew = cMPCertificate1;
    this.newWithOld = cMPCertificate2;
    this.oldWithNew = cMPCertificate3;
  }
  
  public static RootCaKeyUpdateContent getInstance(Object paramObject) {
    return (paramObject instanceof RootCaKeyUpdateContent) ? (RootCaKeyUpdateContent)paramObject : ((paramObject != null) ? new RootCaKeyUpdateContent(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public CMPCertificate getNewWithNew() {
    return this.newWithNew;
  }
  
  public CMPCertificate getNewWithOld() {
    return this.newWithOld;
  }
  
  public CMPCertificate getOldWithNew() {
    return this.oldWithNew;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    aSN1EncodableVector.add((ASN1Encodable)this.newWithNew);
    if (this.newWithOld != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, 0, (ASN1Encodable)this.newWithOld)); 
    if (this.oldWithNew != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, 1, (ASN1Encodable)this.oldWithNew)); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\RootCaKeyUpdateContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */