package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

public class CtlDelete extends ASN1Object implements ASN1Choice {
  public static final int cert = 0;
  
  public static final int dc = 1;
  
  private final int choice;
  
  private final ASN1Encodable ctlDelete;
  
  public static CtlDelete cert(HashedId8 paramHashedId8) {
    return new CtlDelete(0, (ASN1Encodable)paramHashedId8);
  }
  
  public static CtlDelete dc(DcDelete paramDcDelete) {
    return new CtlDelete(1, (ASN1Encodable)paramDcDelete);
  }
  
  public CtlDelete(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    switch (paramInt) {
      case 0:
        this.ctlDelete = (ASN1Encodable)HashedId8.getInstance(paramASN1Encodable);
        return;
      case 1:
        this.ctlDelete = (ASN1Encodable)DcDelete.getInstance(paramASN1Encodable);
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + paramInt);
  }
  
  private CtlDelete(ASN1TaggedObject paramASN1TaggedObject) {
    this(paramASN1TaggedObject.getTagNo(), (ASN1Encodable)paramASN1TaggedObject.getExplicitBaseObject());
  }
  
  public static CtlDelete getInstance(Object paramObject) {
    return (paramObject instanceof CtlDelete) ? (CtlDelete)paramObject : ((paramObject != null) ? new CtlDelete(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getCtlDelete() {
    return this.ctlDelete;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.ctlDelete);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\CtlDelete.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */