package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

public class UINT3 extends UintBase {
  private static final BigInteger MAX = BigInteger.valueOf(7L);
  
  public UINT3(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  public UINT3(int paramInt) {
    super(paramInt);
  }
  
  public UINT3(long paramLong) {
    super(paramLong);
  }
  
  protected UINT3(ASN1Integer paramASN1Integer) {
    super(paramASN1Integer);
  }
  
  public static UINT3 getInstance(Object paramObject) {
    return (paramObject instanceof UINT3) ? (UINT3)paramObject : ((paramObject != null) ? new UINT3(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  protected void assertLimit() {
    if (this.value.signum() < 0)
      throw new IllegalArgumentException("value must not be negative"); 
    if (this.value.compareTo(MAX) > 0)
      throw new IllegalArgumentException("value must not exceed " + MAX.toString(16)); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\UINT3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */