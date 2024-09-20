package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.etsi102941.basetypes.CertificateSubjectAttributes;
import org.bouncycastle.util.Arrays;

public class AuthorizationValidationResponse extends ASN1Object {
  private final ASN1OctetString requestHash;
  
  private final AuthorizationValidationResponseCode responseCode;
  
  private final CertificateSubjectAttributes confirmedSubjectAttributes;
  
  public AuthorizationValidationResponse(ASN1OctetString paramASN1OctetString, AuthorizationValidationResponseCode paramAuthorizationValidationResponseCode, CertificateSubjectAttributes paramCertificateSubjectAttributes) {
    this.requestHash = paramASN1OctetString;
    this.responseCode = paramAuthorizationValidationResponseCode;
    this.confirmedSubjectAttributes = paramCertificateSubjectAttributes;
  }
  
  private AuthorizationValidationResponse(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 3)
      throw new IllegalArgumentException("expected sequence size of 3"); 
    this.requestHash = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0));
    this.responseCode = AuthorizationValidationResponseCode.getInstance(paramASN1Sequence.getObjectAt(1));
    this.confirmedSubjectAttributes = (CertificateSubjectAttributes)OEROptional.getValue(CertificateSubjectAttributes.class, paramASN1Sequence.getObjectAt(2));
  }
  
  public static AuthorizationValidationResponse getInstance(Object paramObject) {
    return (paramObject instanceof AuthorizationValidationResponse) ? (AuthorizationValidationResponse)paramObject : ((paramObject != null) ? new AuthorizationValidationResponse(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1OctetString getRequestHash() {
    return this.requestHash;
  }
  
  public AuthorizationValidationResponseCode getResponseCode() {
    return this.responseCode;
  }
  
  public CertificateSubjectAttributes getConfirmedSubjectAttributes() {
    return this.confirmedSubjectAttributes;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.requestHash, (ASN1Encodable)this.responseCode, (ASN1Encodable)OEROptional.getInstance(this.confirmedSubjectAttributes) });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private ASN1OctetString requestHash;
    
    private AuthorizationValidationResponseCode responseCode;
    
    private CertificateSubjectAttributes confirmedSubjectAttributes;
    
    public Builder setRequestHash(ASN1OctetString param1ASN1OctetString) {
      this.requestHash = param1ASN1OctetString;
      return this;
    }
    
    public Builder setRequestHash(byte[] param1ArrayOfbyte) {
      this.requestHash = (ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte));
      return this;
    }
    
    public Builder setResponseCode(AuthorizationValidationResponseCode param1AuthorizationValidationResponseCode) {
      this.responseCode = param1AuthorizationValidationResponseCode;
      return this;
    }
    
    public Builder setConfirmedSubjectAttributes(CertificateSubjectAttributes param1CertificateSubjectAttributes) {
      this.confirmedSubjectAttributes = param1CertificateSubjectAttributes;
      return this;
    }
    
    public AuthorizationValidationResponse createAuthorizationValidationResponse() {
      return new AuthorizationValidationResponse(this.requestHash, this.responseCode, this.confirmedSubjectAttributes);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\AuthorizationValidationResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */