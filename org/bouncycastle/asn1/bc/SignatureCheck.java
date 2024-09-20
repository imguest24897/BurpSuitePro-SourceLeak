package org.bouncycastle.asn1.bc;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.util.Arrays;

public class SignatureCheck extends ASN1Object {
  private final AlgorithmIdentifier signatureAlgorithm;
  
  private final ASN1Sequence certificates;
  
  private final ASN1BitString signatureValue;
  
  public SignatureCheck(AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte) {
    this.signatureAlgorithm = paramAlgorithmIdentifier;
    this.certificates = null;
    this.signatureValue = (ASN1BitString)new DERBitString(Arrays.clone(paramArrayOfbyte));
  }
  
  public SignatureCheck(AlgorithmIdentifier paramAlgorithmIdentifier, Certificate[] paramArrayOfCertificate, byte[] paramArrayOfbyte) {
    this.signatureAlgorithm = paramAlgorithmIdentifier;
    this.certificates = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfCertificate);
    this.signatureValue = (ASN1BitString)new DERBitString(Arrays.clone(paramArrayOfbyte));
  }
  
  private SignatureCheck(ASN1Sequence paramASN1Sequence) {
    this.signatureAlgorithm = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(0));
    byte b = 1;
    if (paramASN1Sequence.getObjectAt(1) instanceof ASN1TaggedObject) {
      this.certificates = ASN1Sequence.getInstance(ASN1TaggedObject.getInstance(paramASN1Sequence.getObjectAt(b++)).getBaseUniversal(true, 16));
    } else {
      this.certificates = null;
    } 
    this.signatureValue = ASN1BitString.getInstance(paramASN1Sequence.getObjectAt(b));
  }
  
  public static SignatureCheck getInstance(Object paramObject) {
    return (paramObject instanceof SignatureCheck) ? (SignatureCheck)paramObject : ((paramObject != null) ? new SignatureCheck(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1BitString getSignature() {
    return (ASN1BitString)new DERBitString(this.signatureValue.getBytes(), this.signatureValue.getPadBits());
  }
  
  public AlgorithmIdentifier getSignatureAlgorithm() {
    return this.signatureAlgorithm;
  }
  
  public Certificate[] getCertificates() {
    if (this.certificates == null)
      return null; 
    Certificate[] arrayOfCertificate = new Certificate[this.certificates.size()];
    for (byte b = 0; b != arrayOfCertificate.length; b++)
      arrayOfCertificate[b] = Certificate.getInstance(this.certificates.getObjectAt(b)); 
    return arrayOfCertificate;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    aSN1EncodableVector.add((ASN1Encodable)this.signatureAlgorithm);
    if (this.certificates != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(0, (ASN1Encodable)this.certificates)); 
    aSN1EncodableVector.add((ASN1Encodable)this.signatureValue);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\bc\SignatureCheck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */