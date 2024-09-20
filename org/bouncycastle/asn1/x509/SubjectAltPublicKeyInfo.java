package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class SubjectAltPublicKeyInfo extends ASN1Object {
  private AlgorithmIdentifier algorithm;
  
  private ASN1BitString subjectAltPublicKey;
  
  public static SubjectAltPublicKeyInfo getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Sequence.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public static SubjectAltPublicKeyInfo getInstance(Object paramObject) {
    return (paramObject instanceof SubjectAltPublicKeyInfo) ? (SubjectAltPublicKeyInfo)paramObject : ((paramObject != null) ? new SubjectAltPublicKeyInfo(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static SubjectAltPublicKeyInfo fromExtensions(Extensions paramExtensions) {
    return getInstance(Extensions.getExtensionParsedValue(paramExtensions, Extension.subjectAltPublicKeyInfo));
  }
  
  private SubjectAltPublicKeyInfo(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("extension should contain only 2 elements"); 
    this.algorithm = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(0));
    this.subjectAltPublicKey = ASN1BitString.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public SubjectAltPublicKeyInfo(AlgorithmIdentifier paramAlgorithmIdentifier, ASN1BitString paramASN1BitString) {
    this.algorithm = paramAlgorithmIdentifier;
    this.subjectAltPublicKey = paramASN1BitString;
  }
  
  public SubjectAltPublicKeyInfo(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) {
    this.algorithm = paramSubjectPublicKeyInfo.getAlgorithm();
    this.subjectAltPublicKey = paramSubjectPublicKeyInfo.getPublicKeyData();
  }
  
  public AlgorithmIdentifier getAlgorithm() {
    return this.algorithm;
  }
  
  public ASN1BitString getSubjectAltPublicKey() {
    return this.subjectAltPublicKey;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)this.algorithm);
    aSN1EncodableVector.add((ASN1Encodable)this.subjectAltPublicKey);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x509\SubjectAltPublicKeyInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */