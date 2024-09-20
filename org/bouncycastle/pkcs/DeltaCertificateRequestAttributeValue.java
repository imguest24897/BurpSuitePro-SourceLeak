package org.bouncycastle.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.pkcs.Attribute;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public class DeltaCertificateRequestAttributeValue implements ASN1Encodable {
  private final X500Name subject;
  
  private final SubjectPublicKeyInfo subjectPKInfo;
  
  private final Extensions extensions;
  
  private final AlgorithmIdentifier signatureAlgorithm;
  
  private final ASN1Sequence attrSeq;
  
  public DeltaCertificateRequestAttributeValue(Attribute paramAttribute) {
    this(ASN1Sequence.getInstance(paramAttribute.getAttributeValues()[0]));
  }
  
  DeltaCertificateRequestAttributeValue(ASN1Sequence paramASN1Sequence) {
    this.attrSeq = paramASN1Sequence;
    byte b = 0;
    if (paramASN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
      this.subject = X500Name.getInstance(ASN1TaggedObject.getInstance(paramASN1Sequence.getObjectAt(0)), true);
      b++;
    } else {
      this.subject = null;
    } 
    this.subjectPKInfo = SubjectPublicKeyInfo.getInstance(paramASN1Sequence.getObjectAt(b));
    b++;
    Extensions extensions = null;
    AlgorithmIdentifier algorithmIdentifier = null;
    if (b != paramASN1Sequence.size())
      while (b < paramASN1Sequence.size()) {
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(paramASN1Sequence.getObjectAt(b));
        if (aSN1TaggedObject.getTagNo() == 1) {
          extensions = Extensions.getInstance(aSN1TaggedObject, false);
        } else if (aSN1TaggedObject.getTagNo() == 2) {
          algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
        } else {
          throw new IllegalArgumentException("unknown tag");
        } 
        b++;
      }  
    this.extensions = extensions;
    this.signatureAlgorithm = algorithmIdentifier;
  }
  
  public X500Name getSubject() {
    return this.subject;
  }
  
  public SubjectPublicKeyInfo getSubjectPKInfo() {
    return this.subjectPKInfo;
  }
  
  public Extensions getExtensions() {
    return this.extensions;
  }
  
  public AlgorithmIdentifier getSignatureAlgorithm() {
    return this.signatureAlgorithm;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.attrSeq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\DeltaCertificateRequestAttributeValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */