package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ItsUtils;

public class PsidSsp extends ASN1Object {
  private final Psid psid;
  
  private final ServiceSpecificPermissions ssp;
  
  public PsidSsp(Psid paramPsid, ServiceSpecificPermissions paramServiceSpecificPermissions) {
    this.psid = paramPsid;
    this.ssp = paramServiceSpecificPermissions;
  }
  
  private PsidSsp(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.psid = Psid.getInstance(paramASN1Sequence.getObjectAt(0));
    this.ssp = (ServiceSpecificPermissions)OEROptional.getValue(ServiceSpecificPermissions.class, paramASN1Sequence.getObjectAt(1));
  }
  
  public static PsidSsp getInstance(Object paramObject) {
    return (paramObject instanceof PsidSsp) ? (PsidSsp)paramObject : ((paramObject != null) ? new PsidSsp(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public Psid getPsid() {
    return this.psid;
  }
  
  public ServiceSpecificPermissions getSsp() {
    return this.ssp;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.psid, (ASN1Encodable)OEROptional.getInstance(this.ssp) });
  }
  
  public static class Builder {
    private Psid psid;
    
    private ServiceSpecificPermissions ssp;
    
    public Builder setPsid(Psid param1Psid) {
      this.psid = param1Psid;
      return this;
    }
    
    public Builder setSsp(ServiceSpecificPermissions param1ServiceSpecificPermissions) {
      this.ssp = param1ServiceSpecificPermissions;
      return this;
    }
    
    public PsidSsp createPsidSsp() {
      return new PsidSsp(this.psid, this.ssp);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\PsidSsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */