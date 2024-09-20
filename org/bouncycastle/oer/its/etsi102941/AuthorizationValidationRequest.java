package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.etsi102941.basetypes.EcSignature;

public class AuthorizationValidationRequest extends ASN1Object {
  private final SharedAtRequest sharedAtRequest;
  
  private final EcSignature ecSignature;
  
  public AuthorizationValidationRequest(SharedAtRequest paramSharedAtRequest, EcSignature paramEcSignature) {
    this.sharedAtRequest = paramSharedAtRequest;
    this.ecSignature = paramEcSignature;
  }
  
  private AuthorizationValidationRequest(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.sharedAtRequest = SharedAtRequest.getInstance(paramASN1Sequence.getObjectAt(0));
    this.ecSignature = EcSignature.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static AuthorizationValidationRequest getInstance(Object paramObject) {
    return (paramObject instanceof AuthorizationValidationRequest) ? (AuthorizationValidationRequest)paramObject : ((paramObject != null) ? new AuthorizationValidationRequest(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public SharedAtRequest getSharedAtRequest() {
    return this.sharedAtRequest;
  }
  
  public EcSignature getEcSignature() {
    return this.ecSignature;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.sharedAtRequest, (ASN1Encodable)this.ecSignature });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private SharedAtRequest sharedAtRequest;
    
    private EcSignature ecSignature;
    
    public Builder setSharedAtRequest(SharedAtRequest param1SharedAtRequest) {
      this.sharedAtRequest = param1SharedAtRequest;
      return this;
    }
    
    public Builder setEcSignature(EcSignature param1EcSignature) {
      this.ecSignature = param1EcSignature;
      return this;
    }
    
    public AuthorizationValidationRequest createAuthorizationValidationRequest() {
      return new AuthorizationValidationRequest(this.sharedAtRequest, this.ecSignature);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\AuthorizationValidationRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */