package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.etsi102941.basetypes.CertificateSubjectAttributes;
import org.bouncycastle.oer.its.etsi102941.basetypes.PublicKeys;

public class CaCertificateRequest extends ASN1Object {
  private final PublicKeys publicKeys;
  
  private final CertificateSubjectAttributes requestedSubjectAttributes;
  
  public CaCertificateRequest(PublicKeys paramPublicKeys, CertificateSubjectAttributes paramCertificateSubjectAttributes) {
    this.publicKeys = paramPublicKeys;
    this.requestedSubjectAttributes = paramCertificateSubjectAttributes;
  }
  
  private CaCertificateRequest(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.publicKeys = PublicKeys.getInstance(paramASN1Sequence.getObjectAt(0));
    this.requestedSubjectAttributes = CertificateSubjectAttributes.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static CaCertificateRequest getInstance(Object paramObject) {
    return (paramObject instanceof CaCertificateRequest) ? (CaCertificateRequest)paramObject : ((paramObject != null) ? new CaCertificateRequest(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public PublicKeys getPublicKeys() {
    return this.publicKeys;
  }
  
  public CertificateSubjectAttributes getRequestedSubjectAttributes() {
    return this.requestedSubjectAttributes;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.publicKeys, (ASN1Encodable)this.requestedSubjectAttributes });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private PublicKeys publicKeys;
    
    private CertificateSubjectAttributes requestedSubjectAttributes;
    
    public Builder setPublicKeys(PublicKeys param1PublicKeys) {
      this.publicKeys = param1PublicKeys;
      return this;
    }
    
    public Builder setRequestedSubjectAttributes(CertificateSubjectAttributes param1CertificateSubjectAttributes) {
      this.requestedSubjectAttributes = param1CertificateSubjectAttributes;
      return this;
    }
    
    public CaCertificateRequest createCaCertificateRequest() {
      return new CaCertificateRequest(this.publicKeys, this.requestedSubjectAttributes);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\CaCertificateRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */