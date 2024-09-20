package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.EncryptedKey;
import org.bouncycastle.asn1.crmf.EncryptedValue;
import org.bouncycastle.asn1.crmf.PKIPublicationInfo;

public class CertifiedKeyPair extends ASN1Object {
  private final CertOrEncCert certOrEncCert;
  
  private EncryptedKey privateKey;
  
  private PKIPublicationInfo publicationInfo;
  
  private CertifiedKeyPair(ASN1Sequence paramASN1Sequence) {
    this.certOrEncCert = CertOrEncCert.getInstance(paramASN1Sequence.getObjectAt(0));
    if (paramASN1Sequence.size() >= 2)
      if (paramASN1Sequence.size() == 2) {
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(paramASN1Sequence.getObjectAt(1), 128);
        if (aSN1TaggedObject.getTagNo() == 0) {
          this.privateKey = EncryptedKey.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else {
          this.publicationInfo = PKIPublicationInfo.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } 
      } else {
        this.privateKey = EncryptedKey.getInstance(ASN1TaggedObject.getInstance(paramASN1Sequence.getObjectAt(1), 128).getExplicitBaseObject());
        this.publicationInfo = PKIPublicationInfo.getInstance(ASN1TaggedObject.getInstance(paramASN1Sequence.getObjectAt(2), 128).getExplicitBaseObject());
      }  
  }
  
  public CertifiedKeyPair(CertOrEncCert paramCertOrEncCert) {
    this(paramCertOrEncCert, (EncryptedKey)null, (PKIPublicationInfo)null);
  }
  
  public CertifiedKeyPair(CertOrEncCert paramCertOrEncCert, EncryptedKey paramEncryptedKey, PKIPublicationInfo paramPKIPublicationInfo) {
    if (paramCertOrEncCert == null)
      throw new IllegalArgumentException("'certOrEncCert' cannot be null"); 
    this.certOrEncCert = paramCertOrEncCert;
    this.privateKey = paramEncryptedKey;
    this.publicationInfo = paramPKIPublicationInfo;
  }
  
  public CertifiedKeyPair(CertOrEncCert paramCertOrEncCert, EncryptedValue paramEncryptedValue, PKIPublicationInfo paramPKIPublicationInfo) {
    if (paramCertOrEncCert == null)
      throw new IllegalArgumentException("'certOrEncCert' cannot be null"); 
    this.certOrEncCert = paramCertOrEncCert;
    this.privateKey = (paramEncryptedValue != null) ? new EncryptedKey(paramEncryptedValue) : null;
    this.publicationInfo = paramPKIPublicationInfo;
  }
  
  public static CertifiedKeyPair getInstance(Object paramObject) {
    return (paramObject instanceof CertifiedKeyPair) ? (CertifiedKeyPair)paramObject : ((paramObject != null) ? new CertifiedKeyPair(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public CertOrEncCert getCertOrEncCert() {
    return this.certOrEncCert;
  }
  
  public EncryptedKey getPrivateKey() {
    return this.privateKey;
  }
  
  public PKIPublicationInfo getPublicationInfo() {
    return this.publicationInfo;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    aSN1EncodableVector.add((ASN1Encodable)this.certOrEncCert);
    if (this.privateKey != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, 0, (ASN1Encodable)this.privateKey)); 
    if (this.publicationInfo != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, 1, (ASN1Encodable)this.publicationInfo)); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\CertifiedKeyPair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */