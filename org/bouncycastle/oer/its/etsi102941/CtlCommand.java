package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class CtlCommand extends ASN1Object implements ASN1Choice {
  private final int choice;
  
  private final ASN1Encodable ctlCommand;
  
  public static final int add = 0;
  
  public static final int delete = 1;
  
  public CtlCommand(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.ctlCommand = paramASN1Encodable;
  }
  
  private CtlCommand(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.ctlCommand = (ASN1Encodable)CtlEntry.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this.ctlCommand = (ASN1Encodable)CtlDelete.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static CtlCommand getInstance(Object paramObject) {
    return (paramObject instanceof CtlCommand) ? (CtlCommand)paramObject : ((paramObject != null) ? new CtlCommand(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public static CtlCommand add(CtlEntry paramCtlEntry) {
    return new CtlCommand(0, (ASN1Encodable)paramCtlEntry);
  }
  
  public static CtlCommand delete(CtlDelete paramCtlDelete) {
    return new CtlCommand(1, (ASN1Encodable)paramCtlDelete);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getCtlCommand() {
    return this.ctlCommand;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.ctlCommand);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\CtlCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */