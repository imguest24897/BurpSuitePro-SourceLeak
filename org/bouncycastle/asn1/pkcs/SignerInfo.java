package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class SignerInfo extends ASN1Object {
  private ASN1Integer version;
  
  private IssuerAndSerialNumber issuerAndSerialNumber;
  
  private AlgorithmIdentifier digAlgorithm;
  
  private ASN1Set authenticatedAttributes;
  
  private AlgorithmIdentifier digEncryptionAlgorithm;
  
  private ASN1OctetString encryptedDigest;
  
  private ASN1Set unauthenticatedAttributes;
  
  public static SignerInfo getInstance(Object paramObject) {
    if (paramObject instanceof SignerInfo)
      return (SignerInfo)paramObject; 
    if (paramObject instanceof ASN1Sequence)
      return new SignerInfo((ASN1Sequence)paramObject); 
    throw new IllegalArgumentException("unknown object in factory: " + paramObject.getClass().getName());
  }
  
  public SignerInfo(ASN1Integer paramASN1Integer, IssuerAndSerialNumber paramIssuerAndSerialNumber, AlgorithmIdentifier paramAlgorithmIdentifier1, ASN1Set paramASN1Set1, AlgorithmIdentifier paramAlgorithmIdentifier2, ASN1OctetString paramASN1OctetString, ASN1Set paramASN1Set2) {
    this.version = paramASN1Integer;
    this.issuerAndSerialNumber = paramIssuerAndSerialNumber;
    this.digAlgorithm = paramAlgorithmIdentifier1;
    this.authenticatedAttributes = paramASN1Set1;
    this.digEncryptionAlgorithm = paramAlgorithmIdentifier2;
    this.encryptedDigest = paramASN1OctetString;
    this.unauthenticatedAttributes = paramASN1Set2;
  }
  
  public SignerInfo(ASN1Sequence paramASN1Sequence) {
    Enumeration<ASN1Integer> enumeration = paramASN1Sequence.getObjects();
    this.version = enumeration.nextElement();
    this.issuerAndSerialNumber = IssuerAndSerialNumber.getInstance(enumeration.nextElement());
    this.digAlgorithm = AlgorithmIdentifier.getInstance(enumeration.nextElement());
    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject)enumeration.nextElement();
    if (aSN1TaggedObject instanceof ASN1TaggedObject) {
      this.authenticatedAttributes = ASN1Set.getInstance(aSN1TaggedObject, false);
      this.digEncryptionAlgorithm = AlgorithmIdentifier.getInstance(enumeration.nextElement());
    } else {
      this.authenticatedAttributes = null;
      this.digEncryptionAlgorithm = AlgorithmIdentifier.getInstance(aSN1TaggedObject);
    } 
    this.encryptedDigest = DEROctetString.getInstance(enumeration.nextElement());
    if (enumeration.hasMoreElements()) {
      this.unauthenticatedAttributes = ASN1Set.getInstance((ASN1TaggedObject)enumeration.nextElement(), false);
    } else {
      this.unauthenticatedAttributes = null;
    } 
  }
  
  public ASN1Integer getVersion() {
    return this.version;
  }
  
  public IssuerAndSerialNumber getIssuerAndSerialNumber() {
    return this.issuerAndSerialNumber;
  }
  
  public ASN1Set getAuthenticatedAttributes() {
    return this.authenticatedAttributes;
  }
  
  public AlgorithmIdentifier getDigestAlgorithm() {
    return this.digAlgorithm;
  }
  
  public ASN1OctetString getEncryptedDigest() {
    return this.encryptedDigest;
  }
  
  public AlgorithmIdentifier getDigestEncryptionAlgorithm() {
    return this.digEncryptionAlgorithm;
  }
  
  public ASN1Set getUnauthenticatedAttributes() {
    return this.unauthenticatedAttributes;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
    aSN1EncodableVector.add((ASN1Encodable)this.version);
    aSN1EncodableVector.add((ASN1Encodable)this.issuerAndSerialNumber);
    aSN1EncodableVector.add((ASN1Encodable)this.digAlgorithm);
    if (this.authenticatedAttributes != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(false, 0, (ASN1Encodable)this.authenticatedAttributes)); 
    aSN1EncodableVector.add((ASN1Encodable)this.digEncryptionAlgorithm);
    aSN1EncodableVector.add((ASN1Encodable)this.encryptedDigest);
    if (this.unauthenticatedAttributes != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(false, 1, (ASN1Encodable)this.unauthenticatedAttributes)); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\pkcs\SignerInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */