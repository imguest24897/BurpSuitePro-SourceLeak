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
import org.bouncycastle.oer.its.etsi102941.basetypes.PublicKeys;
import org.bouncycastle.util.Arrays;

public class InnerEcRequest extends ASN1Object {
  private final ASN1OctetString itsId;
  
  private final CertificateFormat certificateFormat;
  
  private final PublicKeys publicKeys;
  
  private final CertificateSubjectAttributes requestedSubjectAttributes;
  
  public InnerEcRequest(ASN1OctetString paramASN1OctetString, CertificateFormat paramCertificateFormat, PublicKeys paramPublicKeys, CertificateSubjectAttributes paramCertificateSubjectAttributes) {
    this.itsId = paramASN1OctetString;
    this.certificateFormat = paramCertificateFormat;
    this.publicKeys = paramPublicKeys;
    this.requestedSubjectAttributes = paramCertificateSubjectAttributes;
  }
  
  private InnerEcRequest(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 4)
      throw new IllegalArgumentException("expected sequence size of 4"); 
    this.itsId = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0));
    this.certificateFormat = CertificateFormat.getInstance(paramASN1Sequence.getObjectAt(1));
    this.publicKeys = PublicKeys.getInstance(paramASN1Sequence.getObjectAt(2));
    this.requestedSubjectAttributes = CertificateSubjectAttributes.getInstance(paramASN1Sequence.getObjectAt(3));
  }
  
  public static InnerEcRequest getInstance(Object paramObject) {
    return (paramObject instanceof InnerEcRequest) ? (InnerEcRequest)paramObject : ((paramObject != null) ? new InnerEcRequest(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1OctetString getItsId() {
    return this.itsId;
  }
  
  public CertificateFormat getCertificateFormat() {
    return this.certificateFormat;
  }
  
  public PublicKeys getPublicKeys() {
    return this.publicKeys;
  }
  
  public CertificateSubjectAttributes getRequestedSubjectAttributes() {
    return this.requestedSubjectAttributes;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.itsId, (ASN1Encodable)this.certificateFormat, (ASN1Encodable)this.publicKeys, (ASN1Encodable)this.requestedSubjectAttributes });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private ASN1OctetString itsId;
    
    private CertificateFormat certificateFormat;
    
    private PublicKeys publicKeys;
    
    private CertificateSubjectAttributes requestedSubjectAttributes;
    
    public Builder setItsId(ASN1OctetString param1ASN1OctetString) {
      this.itsId = param1ASN1OctetString;
      return this;
    }
    
    public Builder setItsId(byte[] param1ArrayOfbyte) {
      this.itsId = (ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte));
      return this;
    }
    
    public Builder setCertificateFormat(CertificateFormat param1CertificateFormat) {
      this.certificateFormat = param1CertificateFormat;
      return this;
    }
    
    public Builder setPublicKeys(PublicKeys param1PublicKeys) {
      this.publicKeys = param1PublicKeys;
      return this;
    }
    
    public Builder setRequestedSubjectAttributes(CertificateSubjectAttributes param1CertificateSubjectAttributes) {
      this.requestedSubjectAttributes = param1CertificateSubjectAttributes;
      return this;
    }
    
    public InnerEcRequest createInnerEcRequest() {
      return new InnerEcRequest(this.itsId, this.certificateFormat, this.publicKeys, this.requestedSubjectAttributes);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\InnerEcRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */