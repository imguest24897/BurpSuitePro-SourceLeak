package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097Certificate;

public class AaEntry extends ASN1Object {
  private final EtsiTs103097Certificate aaCertificate;
  
  private final Url accessPoint;
  
  public AaEntry(EtsiTs103097Certificate paramEtsiTs103097Certificate, Url paramUrl) {
    this.aaCertificate = paramEtsiTs103097Certificate;
    this.accessPoint = paramUrl;
  }
  
  private AaEntry(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.aaCertificate = EtsiTs103097Certificate.getInstance(paramASN1Sequence.getObjectAt(0));
    this.accessPoint = Url.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static AaEntry getInstance(Object paramObject) {
    return (paramObject instanceof AaEntry) ? (AaEntry)paramObject : ((paramObject != null) ? new AaEntry(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public EtsiTs103097Certificate getAaCertificate() {
    return this.aaCertificate;
  }
  
  public Url getAccessPoint() {
    return this.accessPoint;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.aaCertificate, (ASN1Encodable)this.accessPoint });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private EtsiTs103097Certificate aaCertificate;
    
    private Url accessPoint;
    
    public Builder setAaCertificate(EtsiTs103097Certificate param1EtsiTs103097Certificate) {
      this.aaCertificate = param1EtsiTs103097Certificate;
      return this;
    }
    
    public Builder setAccessPoint(Url param1Url) {
      this.accessPoint = param1Url;
      return this;
    }
    
    public AaEntry createAaEntry() {
      return new AaEntry(this.aaCertificate, this.accessPoint);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\AaEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */