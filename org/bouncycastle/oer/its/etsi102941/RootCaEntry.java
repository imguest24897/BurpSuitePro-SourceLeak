package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097Certificate;

public class RootCaEntry extends ASN1Object {
  private final EtsiTs103097Certificate selfsignedRootCa;
  
  private final EtsiTs103097Certificate successorTo;
  
  public RootCaEntry(EtsiTs103097Certificate paramEtsiTs103097Certificate1, EtsiTs103097Certificate paramEtsiTs103097Certificate2) {
    this.selfsignedRootCa = paramEtsiTs103097Certificate1;
    this.successorTo = paramEtsiTs103097Certificate2;
  }
  
  private RootCaEntry(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.selfsignedRootCa = EtsiTs103097Certificate.getInstance(paramASN1Sequence.getObjectAt(0));
    this.successorTo = (EtsiTs103097Certificate)OEROptional.getValue(EtsiTs103097Certificate.class, paramASN1Sequence.getObjectAt(1));
  }
  
  public static RootCaEntry getInstance(Object paramObject) {
    return (paramObject instanceof RootCaEntry) ? (RootCaEntry)paramObject : ((paramObject != null) ? new RootCaEntry(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public EtsiTs103097Certificate getSelfsignedRootCa() {
    return this.selfsignedRootCa;
  }
  
  public EtsiTs103097Certificate getSuccessorTo() {
    return this.successorTo;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.selfsignedRootCa, (ASN1Encodable)OEROptional.getInstance(this.successorTo) });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private EtsiTs103097Certificate selfsignedRootCa;
    
    private EtsiTs103097Certificate successorTo;
    
    public Builder setSelfsignedRootCa(EtsiTs103097Certificate param1EtsiTs103097Certificate) {
      this.selfsignedRootCa = param1EtsiTs103097Certificate;
      return this;
    }
    
    public Builder setSuccessorTo(EtsiTs103097Certificate param1EtsiTs103097Certificate) {
      this.successorTo = param1EtsiTs103097Certificate;
      return this;
    }
    
    public RootCaEntry createRootCaEntry() {
      return new RootCaEntry(this.selfsignedRootCa, this.successorTo);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\RootCaEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */