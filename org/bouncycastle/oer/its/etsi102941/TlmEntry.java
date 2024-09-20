package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097Certificate;

public class TlmEntry extends ASN1Object {
  private final EtsiTs103097Certificate selfSignedTLMCertificate;
  
  private final EtsiTs103097Certificate successorTo;
  
  private final Url accessPoint;
  
  public TlmEntry(EtsiTs103097Certificate paramEtsiTs103097Certificate1, EtsiTs103097Certificate paramEtsiTs103097Certificate2, Url paramUrl) {
    this.selfSignedTLMCertificate = paramEtsiTs103097Certificate1;
    this.successorTo = paramEtsiTs103097Certificate2;
    this.accessPoint = paramUrl;
  }
  
  private TlmEntry(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 3)
      throw new IllegalArgumentException("expected sequence size of 3"); 
    this.selfSignedTLMCertificate = EtsiTs103097Certificate.getInstance(paramASN1Sequence.getObjectAt(0));
    this.successorTo = (EtsiTs103097Certificate)OEROptional.getValue(EtsiTs103097Certificate.class, paramASN1Sequence.getObjectAt(1));
    this.accessPoint = Url.getInstance(paramASN1Sequence.getObjectAt(2));
  }
  
  public static TlmEntry getInstance(Object paramObject) {
    return (paramObject instanceof TlmEntry) ? (TlmEntry)paramObject : ((paramObject != null) ? new TlmEntry(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public EtsiTs103097Certificate getSelfSignedTLMCertificate() {
    return this.selfSignedTLMCertificate;
  }
  
  public EtsiTs103097Certificate getSuccessorTo() {
    return this.successorTo;
  }
  
  public Url getAccessPoint() {
    return this.accessPoint;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.selfSignedTLMCertificate, (ASN1Encodable)OEROptional.getInstance(this.successorTo), (ASN1Encodable)this.accessPoint });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private EtsiTs103097Certificate selfSignedTLMCertificate;
    
    private EtsiTs103097Certificate successorTo;
    
    private Url accessPoint;
    
    public Builder setSelfSignedTLMCertificate(EtsiTs103097Certificate param1EtsiTs103097Certificate) {
      this.selfSignedTLMCertificate = param1EtsiTs103097Certificate;
      return this;
    }
    
    public Builder setSuccessorTo(EtsiTs103097Certificate param1EtsiTs103097Certificate) {
      this.successorTo = param1EtsiTs103097Certificate;
      return this;
    }
    
    public Builder setAccessPoint(Url param1Url) {
      this.accessPoint = param1Url;
      return this;
    }
    
    public TlmEntry createTlmEntry() {
      return new TlmEntry(this.selfSignedTLMCertificate, this.successorTo, this.accessPoint);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\TlmEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */