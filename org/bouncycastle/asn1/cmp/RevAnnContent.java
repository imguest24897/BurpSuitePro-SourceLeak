package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.Extensions;

public class RevAnnContent extends ASN1Object {
  private final PKIStatus status;
  
  private final CertId certId;
  
  private final ASN1GeneralizedTime willBeRevokedAt;
  
  private final ASN1GeneralizedTime badSinceDate;
  
  private Extensions crlDetails;
  
  public RevAnnContent(PKIStatus paramPKIStatus, CertId paramCertId, ASN1GeneralizedTime paramASN1GeneralizedTime1, ASN1GeneralizedTime paramASN1GeneralizedTime2) {
    this(paramPKIStatus, paramCertId, paramASN1GeneralizedTime1, paramASN1GeneralizedTime2, null);
  }
  
  public RevAnnContent(PKIStatus paramPKIStatus, CertId paramCertId, ASN1GeneralizedTime paramASN1GeneralizedTime1, ASN1GeneralizedTime paramASN1GeneralizedTime2, Extensions paramExtensions) {
    this.status = paramPKIStatus;
    this.certId = paramCertId;
    this.willBeRevokedAt = paramASN1GeneralizedTime1;
    this.badSinceDate = paramASN1GeneralizedTime2;
    this.crlDetails = paramExtensions;
  }
  
  private RevAnnContent(ASN1Sequence paramASN1Sequence) {
    this.status = PKIStatus.getInstance(paramASN1Sequence.getObjectAt(0));
    this.certId = CertId.getInstance(paramASN1Sequence.getObjectAt(1));
    this.willBeRevokedAt = ASN1GeneralizedTime.getInstance(paramASN1Sequence.getObjectAt(2));
    this.badSinceDate = ASN1GeneralizedTime.getInstance(paramASN1Sequence.getObjectAt(3));
    if (paramASN1Sequence.size() > 4)
      this.crlDetails = Extensions.getInstance(paramASN1Sequence.getObjectAt(4)); 
  }
  
  public static RevAnnContent getInstance(Object paramObject) {
    return (paramObject instanceof RevAnnContent) ? (RevAnnContent)paramObject : ((paramObject != null) ? new RevAnnContent(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public PKIStatus getStatus() {
    return this.status;
  }
  
  public CertId getCertId() {
    return this.certId;
  }
  
  public ASN1GeneralizedTime getWillBeRevokedAt() {
    return this.willBeRevokedAt;
  }
  
  public ASN1GeneralizedTime getBadSinceDate() {
    return this.badSinceDate;
  }
  
  public Extensions getCrlDetails() {
    return this.crlDetails;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
    aSN1EncodableVector.add((ASN1Encodable)this.status);
    aSN1EncodableVector.add((ASN1Encodable)this.certId);
    aSN1EncodableVector.add((ASN1Encodable)this.willBeRevokedAt);
    aSN1EncodableVector.add((ASN1Encodable)this.badSinceDate);
    if (this.crlDetails != null)
      aSN1EncodableVector.add((ASN1Encodable)this.crlDetails); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\RevAnnContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */