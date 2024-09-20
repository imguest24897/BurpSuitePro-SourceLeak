package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.etsi102941.basetypes.EcSignature;
import org.bouncycastle.oer.its.etsi102941.basetypes.PublicKeys;
import org.bouncycastle.util.Arrays;

public class InnerAtRequest extends ASN1Object {
  private final PublicKeys publicKeys;
  
  private final ASN1OctetString hmacKey;
  
  private final SharedAtRequest sharedAtRequest;
  
  private final EcSignature ecSignature;
  
  public InnerAtRequest(PublicKeys paramPublicKeys, ASN1OctetString paramASN1OctetString, SharedAtRequest paramSharedAtRequest, EcSignature paramEcSignature) {
    this.publicKeys = paramPublicKeys;
    this.hmacKey = paramASN1OctetString;
    this.sharedAtRequest = paramSharedAtRequest;
    this.ecSignature = paramEcSignature;
  }
  
  private InnerAtRequest(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 4)
      throw new IllegalArgumentException("expected sequence size of 4"); 
    this.publicKeys = PublicKeys.getInstance(paramASN1Sequence.getObjectAt(0));
    this.hmacKey = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1));
    this.sharedAtRequest = SharedAtRequest.getInstance(paramASN1Sequence.getObjectAt(2));
    this.ecSignature = EcSignature.getInstance(paramASN1Sequence.getObjectAt(3));
  }
  
  public static InnerAtRequest getInstance(Object paramObject) {
    return (paramObject instanceof InnerAtRequest) ? (InnerAtRequest)paramObject : ((paramObject != null) ? new InnerAtRequest(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public PublicKeys getPublicKeys() {
    return this.publicKeys;
  }
  
  public ASN1OctetString getHmacKey() {
    return this.hmacKey;
  }
  
  public SharedAtRequest getSharedAtRequest() {
    return this.sharedAtRequest;
  }
  
  public EcSignature getEcSignature() {
    return this.ecSignature;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.publicKeys, (ASN1Encodable)this.hmacKey, (ASN1Encodable)this.sharedAtRequest, (ASN1Encodable)this.ecSignature });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private PublicKeys publicKeys;
    
    private ASN1OctetString hmacKey;
    
    private SharedAtRequest sharedAtRequest;
    
    private EcSignature ecSignature;
    
    public Builder setPublicKeys(PublicKeys param1PublicKeys) {
      this.publicKeys = param1PublicKeys;
      return this;
    }
    
    public Builder setHmacKey(ASN1OctetString param1ASN1OctetString) {
      this.hmacKey = param1ASN1OctetString;
      return this;
    }
    
    public Builder setHmacKey(byte[] param1ArrayOfbyte) {
      this.hmacKey = (ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte));
      return this;
    }
    
    public Builder setSharedAtRequest(SharedAtRequest param1SharedAtRequest) {
      this.sharedAtRequest = param1SharedAtRequest;
      return this;
    }
    
    public Builder setEcSignature(EcSignature param1EcSignature) {
      this.ecSignature = param1EcSignature;
      return this;
    }
    
    public InnerAtRequest createInnerAtRequest() {
      return new InnerAtRequest(this.publicKeys, this.hmacKey, this.sharedAtRequest, this.ecSignature);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\InnerAtRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */