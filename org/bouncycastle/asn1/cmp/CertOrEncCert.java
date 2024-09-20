package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.EncryptedKey;
import org.bouncycastle.asn1.crmf.EncryptedValue;

public class CertOrEncCert extends ASN1Object implements ASN1Choice {
  private CMPCertificate certificate;
  
  private EncryptedKey encryptedCert;
  
  private CertOrEncCert(ASN1TaggedObject paramASN1TaggedObject) {
    if (paramASN1TaggedObject.hasContextTag(0)) {
      this.certificate = CMPCertificate.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
    } else if (paramASN1TaggedObject.hasContextTag(1)) {
      this.encryptedCert = EncryptedKey.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
    } else {
      throw new IllegalArgumentException("unknown tag: " + ASN1Util.getTagText(paramASN1TaggedObject));
    } 
  }
  
  public CertOrEncCert(CMPCertificate paramCMPCertificate) {
    if (paramCMPCertificate == null)
      throw new IllegalArgumentException("'certificate' cannot be null"); 
    this.certificate = paramCMPCertificate;
  }
  
  public CertOrEncCert(EncryptedValue paramEncryptedValue) {
    if (paramEncryptedValue == null)
      throw new IllegalArgumentException("'encryptedCert' cannot be null"); 
    this.encryptedCert = new EncryptedKey(paramEncryptedValue);
  }
  
  public CertOrEncCert(EncryptedKey paramEncryptedKey) {
    if (paramEncryptedKey == null)
      throw new IllegalArgumentException("'encryptedCert' cannot be null"); 
    this.encryptedCert = paramEncryptedKey;
  }
  
  public static CertOrEncCert getInstance(Object paramObject) {
    return (paramObject instanceof CertOrEncCert) ? (CertOrEncCert)paramObject : ((paramObject instanceof ASN1TaggedObject) ? new CertOrEncCert(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public boolean hasEncryptedCertificate() {
    return (this.encryptedCert != null);
  }
  
  public CMPCertificate getCertificate() {
    return this.certificate;
  }
  
  public EncryptedKey getEncryptedCert() {
    return this.encryptedCert;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)((this.certificate != null) ? new DERTaggedObject(true, 0, (ASN1Encodable)this.certificate) : new DERTaggedObject(true, 1, (ASN1Encodable)this.encryptedCert));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\CertOrEncCert.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */