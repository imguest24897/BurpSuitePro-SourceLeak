package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class CertificationRequest extends ASN1Object {
  protected CertificationRequestInfo reqInfo = null;
  
  protected AlgorithmIdentifier sigAlgId = null;
  
  protected ASN1BitString sigBits = null;
  
  public static CertificationRequest getInstance(Object paramObject) {
    return (paramObject instanceof CertificationRequest) ? (CertificationRequest)paramObject : ((paramObject != null) ? new CertificationRequest(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  protected CertificationRequest() {}
  
  public CertificationRequest(CertificationRequestInfo paramCertificationRequestInfo, AlgorithmIdentifier paramAlgorithmIdentifier, ASN1BitString paramASN1BitString) {
    this.reqInfo = paramCertificationRequestInfo;
    this.sigAlgId = paramAlgorithmIdentifier;
    this.sigBits = paramASN1BitString;
  }
  
  public CertificationRequest(ASN1Sequence paramASN1Sequence) {
    this.reqInfo = CertificationRequestInfo.getInstance(paramASN1Sequence.getObjectAt(0));
    this.sigAlgId = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(1));
    this.sigBits = (ASN1BitString)paramASN1Sequence.getObjectAt(2);
  }
  
  public CertificationRequestInfo getCertificationRequestInfo() {
    return this.reqInfo;
  }
  
  public AlgorithmIdentifier getSignatureAlgorithm() {
    return this.sigAlgId;
  }
  
  public ASN1BitString getSignature() {
    return this.sigBits;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    aSN1EncodableVector.add((ASN1Encodable)this.reqInfo);
    aSN1EncodableVector.add((ASN1Encodable)this.sigAlgId);
    aSN1EncodableVector.add((ASN1Encodable)this.sigBits);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\pkcs\CertificationRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */