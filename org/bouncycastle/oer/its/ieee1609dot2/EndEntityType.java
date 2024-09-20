package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;

public class EndEntityType extends ASN1Object {
  public static final int app = 128;
  
  public static final int enrol = 64;
  
  private final ASN1BitString type;
  
  public EndEntityType(int paramInt) {
    this((ASN1BitString)new DERBitString(paramInt));
  }
  
  private EndEntityType(ASN1BitString paramASN1BitString) {
    this.type = paramASN1BitString;
  }
  
  public static EndEntityType getInstance(Object paramObject) {
    return (paramObject instanceof EndEntityType) ? (EndEntityType)paramObject : ((paramObject != null) ? new EndEntityType(ASN1BitString.getInstance(paramObject)) : null);
  }
  
  public ASN1BitString getType() {
    return this.type;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.type;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\EndEntityType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */