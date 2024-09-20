package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.etsi102941.basetypes.CertificateFormat;
import org.bouncycastle.oer.its.etsi102941.basetypes.CertificateSubjectAttributes;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

public class SharedAtRequest extends ASN1Object {
  private final HashedId8 eaId;
  
  private final ASN1OctetString keyTag;
  
  private final CertificateFormat certificateFormat;
  
  private final CertificateSubjectAttributes requestedSubjectAttributes;
  
  public SharedAtRequest(HashedId8 paramHashedId8, ASN1OctetString paramASN1OctetString, CertificateFormat paramCertificateFormat, CertificateSubjectAttributes paramCertificateSubjectAttributes) {
    this.eaId = paramHashedId8;
    this.keyTag = paramASN1OctetString;
    this.certificateFormat = paramCertificateFormat;
    this.requestedSubjectAttributes = paramCertificateSubjectAttributes;
  }
  
  private SharedAtRequest(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 4)
      throw new IllegalArgumentException("expected sequence size of 4"); 
    this.eaId = HashedId8.getInstance(paramASN1Sequence.getObjectAt(0));
    this.keyTag = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1));
    this.certificateFormat = CertificateFormat.getInstance(paramASN1Sequence.getObjectAt(2));
    this.requestedSubjectAttributes = CertificateSubjectAttributes.getInstance(paramASN1Sequence.getObjectAt(3));
  }
  
  public static SharedAtRequest getInstance(Object paramObject) {
    return (paramObject instanceof SharedAtRequest) ? (SharedAtRequest)paramObject : ((paramObject != null) ? new SharedAtRequest(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public HashedId8 getEaId() {
    return this.eaId;
  }
  
  public ASN1OctetString getKeyTag() {
    return this.keyTag;
  }
  
  public CertificateFormat getCertificateFormat() {
    return this.certificateFormat;
  }
  
  public CertificateSubjectAttributes getRequestedSubjectAttributes() {
    return this.requestedSubjectAttributes;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.eaId, (ASN1Encodable)this.keyTag, (ASN1Encodable)this.certificateFormat, (ASN1Encodable)this.requestedSubjectAttributes });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private HashedId8 eaId;
    
    private ASN1OctetString keyTag;
    
    private CertificateFormat certificateFormat;
    
    private CertificateSubjectAttributes requestedSubjectAttributes;
    
    public Builder setEaId(HashedId8 param1HashedId8) {
      this.eaId = param1HashedId8;
      return this;
    }
    
    public Builder setKeyTag(ASN1OctetString param1ASN1OctetString) {
      this.keyTag = param1ASN1OctetString;
      return this;
    }
    
    public Builder setKeyTag(byte[] param1ArrayOfbyte) {
      this.keyTag = (ASN1OctetString)new DEROctetString(param1ArrayOfbyte);
      return this;
    }
    
    public Builder setCertificateFormat(CertificateFormat param1CertificateFormat) {
      this.certificateFormat = param1CertificateFormat;
      return this;
    }
    
    public Builder setRequestedSubjectAttributes(CertificateSubjectAttributes param1CertificateSubjectAttributes) {
      this.requestedSubjectAttributes = param1CertificateSubjectAttributes;
      return this;
    }
    
    public SharedAtRequest createSharedAtRequest() {
      return new SharedAtRequest(this.eaId, this.keyTag, this.certificateFormat, this.requestedSubjectAttributes);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\SharedAtRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */