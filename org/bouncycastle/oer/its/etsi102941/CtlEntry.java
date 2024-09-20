package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class CtlEntry extends ASN1Object implements ASN1Choice {
  public static final int rca = 0;
  
  public static final int ea = 1;
  
  public static final int aa = 2;
  
  public static final int dc = 3;
  
  public static final int tlm = 4;
  
  private final int choice;
  
  private final ASN1Encodable ctlEntry;
  
  public CtlEntry(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.ctlEntry = paramASN1Encodable;
  }
  
  private CtlEntry(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.ctlEntry = (ASN1Encodable)RootCaEntry.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this.ctlEntry = (ASN1Encodable)EaEntry.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 2:
        this.ctlEntry = (ASN1Encodable)AaEntry.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 3:
        this.ctlEntry = (ASN1Encodable)DcEntry.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 4:
        this.ctlEntry = (ASN1Encodable)TlmEntry.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static CtlEntry getInstance(Object paramObject) {
    return (paramObject instanceof CtlEntry) ? (CtlEntry)paramObject : ((paramObject != null) ? new CtlEntry(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public static CtlEntry rca(RootCaEntry paramRootCaEntry) {
    return new CtlEntry(0, (ASN1Encodable)paramRootCaEntry);
  }
  
  public static CtlEntry ea(EaEntry paramEaEntry) {
    return new CtlEntry(1, (ASN1Encodable)paramEaEntry);
  }
  
  public static CtlEntry aa(AaEntry paramAaEntry) {
    return new CtlEntry(2, (ASN1Encodable)paramAaEntry);
  }
  
  public static CtlEntry dc(DcEntry paramDcEntry) {
    return new CtlEntry(3, (ASN1Encodable)paramDcEntry);
  }
  
  public static CtlEntry tlm(TlmEntry paramTlmEntry) {
    return new CtlEntry(4, (ASN1Encodable)paramTlmEntry);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getCtlEntry() {
    return this.ctlEntry;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.ctlEntry);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\CtlEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */