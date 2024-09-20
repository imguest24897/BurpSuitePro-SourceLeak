package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097Certificate;

public class EaEntry extends ASN1Object {
  private final EtsiTs103097Certificate eaCertificate;
  
  private final Url aaAccessPoint;
  
  private final Url itsAccessPoint;
  
  public EaEntry(EtsiTs103097Certificate paramEtsiTs103097Certificate, Url paramUrl1, Url paramUrl2) {
    this.eaCertificate = paramEtsiTs103097Certificate;
    this.aaAccessPoint = paramUrl1;
    this.itsAccessPoint = paramUrl2;
  }
  
  private EaEntry(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 3)
      throw new IllegalArgumentException("expected sequence size of 3"); 
    this.eaCertificate = EtsiTs103097Certificate.getInstance(paramASN1Sequence.getObjectAt(0));
    this.aaAccessPoint = Url.getInstance(paramASN1Sequence.getObjectAt(1));
    this.itsAccessPoint = (Url)OEROptional.getValue(Url.class, paramASN1Sequence.getObjectAt(2));
  }
  
  public static EaEntry getInstance(Object paramObject) {
    return (paramObject instanceof EaEntry) ? (EaEntry)paramObject : ((paramObject != null) ? new EaEntry(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public EtsiTs103097Certificate getEaCertificate() {
    return this.eaCertificate;
  }
  
  public Url getAaAccessPoint() {
    return this.aaAccessPoint;
  }
  
  public Url getItsAccessPoint() {
    return this.itsAccessPoint;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.eaCertificate, (ASN1Encodable)this.aaAccessPoint, (ASN1Encodable)OEROptional.getInstance(this.itsAccessPoint) });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private EtsiTs103097Certificate eaCertificate;
    
    private Url aaAccessPoint;
    
    private Url itsAccessPoint;
    
    public Builder setEaCertificate(EtsiTs103097Certificate param1EtsiTs103097Certificate) {
      this.eaCertificate = param1EtsiTs103097Certificate;
      return this;
    }
    
    public Builder setAaAccessPoint(Url param1Url) {
      this.aaAccessPoint = param1Url;
      return this;
    }
    
    public Builder setItsAccessPoint(Url param1Url) {
      this.itsAccessPoint = param1Url;
      return this;
    }
    
    public EaEntry createEaEntry() {
      return new EaEntry(this.eaCertificate, this.aaAccessPoint, this.itsAccessPoint);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\EaEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */