package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

public abstract class UintBase extends ASN1Object {
  protected final BigInteger value;
  
  public UintBase(BigInteger paramBigInteger) {
    this.value = paramBigInteger;
    assertLimit();
  }
  
  public UintBase(int paramInt) {
    this(BigInteger.valueOf(paramInt));
  }
  
  public UintBase(long paramLong) {
    this(BigInteger.valueOf(paramLong));
  }
  
  protected UintBase(ASN1Integer paramASN1Integer) {
    this(paramASN1Integer.getValue());
  }
  
  public BigInteger getValue() {
    return this.value;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new ASN1Integer(this.value);
  }
  
  protected abstract void assertLimit();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\UintBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */