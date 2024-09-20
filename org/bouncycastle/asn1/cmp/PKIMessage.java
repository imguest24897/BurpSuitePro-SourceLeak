package org.bouncycastle.asn1.cmp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class PKIMessage extends ASN1Object {
  private final PKIHeader header;
  
  private final PKIBody body;
  
  private final ASN1BitString protection;
  
  private final ASN1Sequence extraCerts;
  
  private PKIMessage(ASN1Sequence paramASN1Sequence) {
    Enumeration<ASN1TaggedObject> enumeration = paramASN1Sequence.getObjects();
    this.header = PKIHeader.getInstance(enumeration.nextElement());
    if (enumeration.hasMoreElements()) {
      this.body = PKIBody.getInstance(enumeration.nextElement());
    } else {
      throw new IllegalArgumentException("PKIMessage missing PKIBody structure");
    } 
    ASN1BitString aSN1BitString = null;
    ASN1Sequence aSN1Sequence;
    for (aSN1Sequence = null; enumeration.hasMoreElements(); aSN1Sequence = ASN1Sequence.getInstance(aSN1TaggedObject, true)) {
      ASN1TaggedObject aSN1TaggedObject = enumeration.nextElement();
      if (aSN1TaggedObject.getTagNo() == 0) {
        aSN1BitString = ASN1BitString.getInstance(aSN1TaggedObject, true);
        continue;
      } 
    } 
    this.protection = aSN1BitString;
    this.extraCerts = aSN1Sequence;
  }
  
  public PKIMessage(PKIHeader paramPKIHeader, PKIBody paramPKIBody, ASN1BitString paramASN1BitString, CMPCertificate[] paramArrayOfCMPCertificate) {
    this.header = paramPKIHeader;
    this.body = paramPKIBody;
    this.protection = paramASN1BitString;
    if (paramArrayOfCMPCertificate != null) {
      this.extraCerts = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfCMPCertificate);
    } else {
      this.extraCerts = null;
    } 
  }
  
  public PKIMessage(PKIHeader paramPKIHeader, PKIBody paramPKIBody, ASN1BitString paramASN1BitString) {
    this(paramPKIHeader, paramPKIBody, paramASN1BitString, null);
  }
  
  public PKIMessage(PKIHeader paramPKIHeader, PKIBody paramPKIBody) {
    this(paramPKIHeader, paramPKIBody, null, null);
  }
  
  public static PKIMessage getInstance(Object paramObject) {
    return (paramObject instanceof PKIMessage) ? (PKIMessage)paramObject : ((paramObject != null) ? new PKIMessage(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public PKIHeader getHeader() {
    return this.header;
  }
  
  public PKIBody getBody() {
    return this.body;
  }
  
  public ASN1BitString getProtection() {
    return this.protection;
  }
  
  public CMPCertificate[] getExtraCerts() {
    if (this.extraCerts == null)
      return null; 
    CMPCertificate[] arrayOfCMPCertificate = new CMPCertificate[this.extraCerts.size()];
    for (byte b = 0; b < arrayOfCMPCertificate.length; b++)
      arrayOfCMPCertificate[b] = CMPCertificate.getInstance(this.extraCerts.getObjectAt(b)); 
    return arrayOfCMPCertificate;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
    aSN1EncodableVector.add((ASN1Encodable)this.header);
    aSN1EncodableVector.add((ASN1Encodable)this.body);
    addOptional(aSN1EncodableVector, 0, (ASN1Encodable)this.protection);
    addOptional(aSN1EncodableVector, 1, (ASN1Encodable)this.extraCerts);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  private void addOptional(ASN1EncodableVector paramASN1EncodableVector, int paramInt, ASN1Encodable paramASN1Encodable) {
    if (paramASN1Encodable != null)
      paramASN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, paramInt, paramASN1Encodable)); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\PKIMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */