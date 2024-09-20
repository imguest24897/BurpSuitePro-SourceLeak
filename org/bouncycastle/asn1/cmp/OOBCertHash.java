package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class OOBCertHash extends ASN1Object {
  private final AlgorithmIdentifier hashAlg;
  
  private final CertId certId;
  
  private final ASN1BitString hashVal;
  
  private OOBCertHash(ASN1Sequence paramASN1Sequence) {
    int i = paramASN1Sequence.size() - 1;
    this.hashVal = ASN1BitString.getInstance(paramASN1Sequence.getObjectAt(i--));
    AlgorithmIdentifier algorithmIdentifier = null;
    CertId certId = null;
    for (int j = i; j >= 0; j--) {
      ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject)paramASN1Sequence.getObjectAt(j);
      if (aSN1TaggedObject.hasContextTag(0)) {
        algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
      } else if (aSN1TaggedObject.hasContextTag(1)) {
        certId = CertId.getInstance(aSN1TaggedObject, true);
      } else {
        throw new IllegalArgumentException("unknown tag " + ASN1Util.getTagText(aSN1TaggedObject));
      } 
    } 
    this.hashAlg = algorithmIdentifier;
    this.certId = certId;
  }
  
  public OOBCertHash(AlgorithmIdentifier paramAlgorithmIdentifier, CertId paramCertId, byte[] paramArrayOfbyte) {
    this(paramAlgorithmIdentifier, paramCertId, new DERBitString(paramArrayOfbyte));
  }
  
  public OOBCertHash(AlgorithmIdentifier paramAlgorithmIdentifier, CertId paramCertId, DERBitString paramDERBitString) {
    this.hashAlg = paramAlgorithmIdentifier;
    this.certId = paramCertId;
    this.hashVal = (ASN1BitString)paramDERBitString;
  }
  
  public static OOBCertHash getInstance(Object paramObject) {
    return (paramObject instanceof OOBCertHash) ? (OOBCertHash)paramObject : ((paramObject != null) ? new OOBCertHash(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public AlgorithmIdentifier getHashAlg() {
    return this.hashAlg;
  }
  
  public CertId getCertId() {
    return this.certId;
  }
  
  public ASN1BitString getHashVal() {
    return this.hashVal;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    addOptional(aSN1EncodableVector, 0, (ASN1Encodable)this.hashAlg);
    addOptional(aSN1EncodableVector, 1, (ASN1Encodable)this.certId);
    aSN1EncodableVector.add((ASN1Encodable)this.hashVal);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  private void addOptional(ASN1EncodableVector paramASN1EncodableVector, int paramInt, ASN1Encodable paramASN1Encodable) {
    if (paramASN1Encodable != null)
      paramASN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, paramInt, paramASN1Encodable)); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\OOBCertHash.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */