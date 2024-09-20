package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097Certificate;
import org.bouncycastle.util.Arrays;

public class InnerAtResponse extends ASN1Object {
  private final ASN1OctetString requestHash;
  
  private final AuthorizationResponseCode responseCode;
  
  private final EtsiTs103097Certificate certificate;
  
  public InnerAtResponse(ASN1OctetString paramASN1OctetString, AuthorizationResponseCode paramAuthorizationResponseCode, EtsiTs103097Certificate paramEtsiTs103097Certificate) {
    this.requestHash = paramASN1OctetString;
    this.responseCode = paramAuthorizationResponseCode;
    this.certificate = paramEtsiTs103097Certificate;
  }
  
  private InnerAtResponse(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 3)
      throw new IllegalArgumentException("expected sequence size of 3"); 
    this.requestHash = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0));
    this.responseCode = AuthorizationResponseCode.getInstance(paramASN1Sequence.getObjectAt(1));
    this.certificate = (EtsiTs103097Certificate)OEROptional.getValue(EtsiTs103097Certificate.class, paramASN1Sequence.getObjectAt(2));
  }
  
  public static InnerAtResponse getInstance(Object paramObject) {
    return (paramObject instanceof InnerAtResponse) ? (InnerAtResponse)paramObject : ((paramObject != null) ? new InnerAtResponse(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1OctetString getRequestHash() {
    return this.requestHash;
  }
  
  public AuthorizationResponseCode getResponseCode() {
    return this.responseCode;
  }
  
  public EtsiTs103097Certificate getCertificate() {
    return this.certificate;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.requestHash, (ASN1Encodable)this.responseCode, (ASN1Encodable)OEROptional.getInstance(this.certificate) });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private ASN1OctetString requestHash;
    
    private AuthorizationResponseCode responseCode;
    
    private EtsiTs103097Certificate certificate;
    
    public Builder setRequestHash(ASN1OctetString param1ASN1OctetString) {
      this.requestHash = param1ASN1OctetString;
      return this;
    }
    
    public Builder setRequestHash(byte[] param1ArrayOfbyte) {
      this.requestHash = (ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte));
      return this;
    }
    
    public Builder setResponseCode(AuthorizationResponseCode param1AuthorizationResponseCode) {
      this.responseCode = param1AuthorizationResponseCode;
      return this;
    }
    
    public Builder setCertificate(EtsiTs103097Certificate param1EtsiTs103097Certificate) {
      this.certificate = param1EtsiTs103097Certificate;
      return this;
    }
    
    public InnerAtResponse createInnerAtResponse() {
      return new InnerAtResponse(this.requestHash, this.responseCode, this.certificate);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\InnerAtResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */