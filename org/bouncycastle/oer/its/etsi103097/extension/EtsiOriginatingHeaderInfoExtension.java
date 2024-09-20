package org.bouncycastle.oer.its.etsi103097.extension;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;

public class EtsiOriginatingHeaderInfoExtension extends Extension {
  public EtsiOriginatingHeaderInfoExtension(ExtId paramExtId, ASN1Encodable paramASN1Encodable) {
    super(paramExtId, paramASN1Encodable);
  }
  
  private EtsiOriginatingHeaderInfoExtension(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static EtsiOriginatingHeaderInfoExtension getInstance(Object paramObject) {
    return (paramObject instanceof EtsiOriginatingHeaderInfoExtension) ? (EtsiOriginatingHeaderInfoExtension)paramObject : ((paramObject != null) ? new EtsiOriginatingHeaderInfoExtension(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public EtsiTs102941CrlRequest getEtsiTs102941CrlRequest() {
    return EtsiTs102941CrlRequest.getInstance(getContent());
  }
  
  public EtsiTs102941DeltaCtlRequest getEtsiTs102941DeltaCtlRequest() {
    return EtsiTs102941DeltaCtlRequest.getInstance(getContent());
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private ExtId id;
    
    private ASN1Encodable encodable;
    
    public Builder setId(ExtId param1ExtId) {
      this.id = param1ExtId;
      return this;
    }
    
    public Builder setEncodable(ASN1Encodable param1ASN1Encodable) {
      this.encodable = param1ASN1Encodable;
      return this;
    }
    
    public Builder setEtsiTs102941CrlRequest(EtsiTs102941CrlRequest param1EtsiTs102941CrlRequest) {
      this.id = Extension.etsiTs102941CrlRequestId;
      this.encodable = (ASN1Encodable)param1EtsiTs102941CrlRequest;
      return this;
    }
    
    public Builder setEtsiTs102941DeltaCtlRequest(EtsiTs102941DeltaCtlRequest param1EtsiTs102941DeltaCtlRequest) {
      this.id = Extension.etsiTs102941DeltaCtlRequestId;
      this.encodable = (ASN1Encodable)param1EtsiTs102941DeltaCtlRequest;
      return this;
    }
    
    public EtsiOriginatingHeaderInfoExtension createEtsiOriginatingHeaderInfoExtension() {
      return new EtsiOriginatingHeaderInfoExtension(this.id, this.encodable);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi103097\extension\EtsiOriginatingHeaderInfoExtension.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */