package org.bouncycastle.asn1.x509;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

public class SubjectPublicKeyInfo extends ASN1Object {
  private AlgorithmIdentifier algId;
  
  private ASN1BitString keyData;
  
  public static SubjectPublicKeyInfo getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Sequence.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public static SubjectPublicKeyInfo getInstance(Object paramObject) {
    return (paramObject instanceof SubjectPublicKeyInfo) ? (SubjectPublicKeyInfo)paramObject : ((paramObject != null) ? new SubjectPublicKeyInfo(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public SubjectPublicKeyInfo(AlgorithmIdentifier paramAlgorithmIdentifier, ASN1BitString paramASN1BitString) {
    this.keyData = paramASN1BitString;
    this.algId = paramAlgorithmIdentifier;
  }
  
  public SubjectPublicKeyInfo(AlgorithmIdentifier paramAlgorithmIdentifier, ASN1Encodable paramASN1Encodable) throws IOException {
    this.keyData = (ASN1BitString)new DERBitString(paramASN1Encodable);
    this.algId = paramAlgorithmIdentifier;
  }
  
  public SubjectPublicKeyInfo(AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte) {
    this.keyData = (ASN1BitString)new DERBitString(paramArrayOfbyte);
    this.algId = paramAlgorithmIdentifier;
  }
  
  public SubjectPublicKeyInfo(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("Bad sequence size: " + paramASN1Sequence.size()); 
    Enumeration enumeration = paramASN1Sequence.getObjects();
    this.algId = AlgorithmIdentifier.getInstance(enumeration.nextElement());
    this.keyData = ASN1BitString.getInstance(enumeration.nextElement());
  }
  
  public AlgorithmIdentifier getAlgorithm() {
    return this.algId;
  }
  
  public AlgorithmIdentifier getAlgorithmId() {
    return this.algId;
  }
  
  public ASN1Primitive parsePublicKey() throws IOException {
    return ASN1Primitive.fromByteArray(this.keyData.getOctets());
  }
  
  public ASN1Primitive getPublicKey() throws IOException {
    return ASN1Primitive.fromByteArray(this.keyData.getOctets());
  }
  
  public ASN1BitString getPublicKeyData() {
    return this.keyData;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.algId);
    aSN1EncodableVector.add((ASN1Encodable)this.keyData);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x509\SubjectPublicKeyInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */