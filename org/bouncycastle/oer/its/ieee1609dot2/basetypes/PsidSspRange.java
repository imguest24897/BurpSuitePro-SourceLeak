package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;

public class PsidSspRange extends ASN1Object {
  private final Psid psid;
  
  private final SspRange sspRange;
  
  public PsidSspRange(Psid paramPsid, SspRange paramSspRange) {
    this.psid = paramPsid;
    this.sspRange = paramSspRange;
  }
  
  private PsidSspRange(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.psid = Psid.getInstance(paramASN1Sequence.getObjectAt(0));
    this.sspRange = (SspRange)OEROptional.getValue(SspRange.class, paramASN1Sequence.getObjectAt(1));
  }
  
  public static PsidSspRange getInstance(Object paramObject) {
    return (paramObject instanceof PsidSspRange) ? (PsidSspRange)paramObject : ((paramObject != null) ? new PsidSspRange(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public Psid getPsid() {
    return this.psid;
  }
  
  public SspRange getSspRange() {
    return this.sspRange;
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.psid, (ASN1Encodable)OEROptional.getInstance(this.sspRange) });
  }
  
  public static class Builder {
    private Psid psid;
    
    private SspRange sspRange;
    
    public Builder setPsid(Psid param1Psid) {
      this.psid = param1Psid;
      return this;
    }
    
    public Builder setPsid(long param1Long) {
      this.psid = new Psid(param1Long);
      return this;
    }
    
    public Builder setSspRange(SspRange param1SspRange) {
      this.sspRange = param1SspRange;
      return this;
    }
    
    public PsidSspRange createPsidSspRange() {
      return new PsidSspRange(this.psid, this.sspRange);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\PsidSspRange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */