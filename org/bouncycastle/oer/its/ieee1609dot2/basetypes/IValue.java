package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.BigIntegers;

public class IValue extends ASN1Object {
  private final BigInteger value;
  
  private IValue(ASN1Integer paramASN1Integer) {
    int i = BigIntegers.intValueExact(paramASN1Integer.getValue());
    if (i < 0 || i > 65535)
      throw new IllegalArgumentException("value out of range"); 
    this.value = paramASN1Integer.getValue();
  }
  
  public static IValue getInstance(Object paramObject) {
    return (paramObject instanceof IValue) ? (IValue)paramObject : ((paramObject != null) ? new IValue(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  public BigInteger getValue() {
    return this.value;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new ASN1Integer(this.value);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\IValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */