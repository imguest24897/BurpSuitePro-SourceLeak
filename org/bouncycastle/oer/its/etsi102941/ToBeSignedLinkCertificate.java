package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.ieee1609dot2.HashedData;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;

public class ToBeSignedLinkCertificate extends ASN1Object {
  private final Time32 expiryTime;
  
  private final HashedData certificateHash;
  
  public ToBeSignedLinkCertificate(Time32 paramTime32, HashedData paramHashedData) {
    this.expiryTime = paramTime32;
    this.certificateHash = paramHashedData;
  }
  
  protected ToBeSignedLinkCertificate(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.expiryTime = Time32.getInstance(paramASN1Sequence.getObjectAt(0));
    this.certificateHash = HashedData.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static ToBeSignedLinkCertificate getInstance(Object paramObject) {
    return (paramObject instanceof ToBeSignedLinkCertificate) ? (ToBeSignedLinkCertificate)paramObject : ((paramObject != null) ? new ToBeSignedLinkCertificate(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public Time32 getExpiryTime() {
    return this.expiryTime;
  }
  
  public HashedData getCertificateHash() {
    return this.certificateHash;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.expiryTime, (ASN1Encodable)this.certificateHash });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private Time32 expiryTime;
    
    private HashedData certificateHash;
    
    public Builder setExpiryTime(Time32 param1Time32) {
      this.expiryTime = param1Time32;
      return this;
    }
    
    public Builder setCertificateHash(HashedData param1HashedData) {
      this.certificateHash = param1HashedData;
      return this;
    }
    
    public ToBeSignedLinkCertificate createToBeSignedLinkCertificate() {
      return new ToBeSignedLinkCertificate(this.expiryTime, this.certificateHash);
    }
    
    public ToBeSignedLinkCertificateTlm createToBeSignedLinkCertificateTlm() {
      return new ToBeSignedLinkCertificateTlm(this.expiryTime, this.certificateHash);
    }
    
    public ToBeSignedLinkCertificateRca createToBeSignedLinkCertificateRca() {
      return new ToBeSignedLinkCertificateRca(this.expiryTime, this.certificateHash);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\ToBeSignedLinkCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */