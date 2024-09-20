package org.bouncycastle.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.pkcs.Attribute;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public class DeltaCertificateRequestAttributeValueBuilder {
  private final SubjectPublicKeyInfo subjectPublicKey;
  
  private AlgorithmIdentifier signatureAlgorithm;
  
  private X500Name subject;
  
  public DeltaCertificateRequestAttributeValueBuilder(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) {
    this.subjectPublicKey = paramSubjectPublicKeyInfo;
  }
  
  public DeltaCertificateRequestAttributeValueBuilder setSignatureAlgorithm(AlgorithmIdentifier paramAlgorithmIdentifier) {
    this.signatureAlgorithm = paramAlgorithmIdentifier;
    return this;
  }
  
  public DeltaCertificateRequestAttributeValueBuilder setSubject(X500Name paramX500Name) {
    this.subject = paramX500Name;
    return this;
  }
  
  public DeltaCertificateRequestAttributeValue build() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    if (this.subject != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(false, 0, (ASN1Encodable)this.subject)); 
    aSN1EncodableVector.add((ASN1Encodable)this.subjectPublicKey);
    if (this.signatureAlgorithm != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(false, 2, (ASN1Encodable)this.signatureAlgorithm)); 
    return new DeltaCertificateRequestAttributeValue(new Attribute(new ASN1ObjectIdentifier("2.16.840.1.114027.80.6.2"), (ASN1Set)new DERSet((ASN1Encodable)new DERSequence(aSN1EncodableVector))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\DeltaCertificateRequestAttributeValueBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */