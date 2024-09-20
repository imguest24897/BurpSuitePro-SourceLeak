package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

public class UINT8 extends UintBase {
  private static final BigInteger MAX = BigInteger.valueOf(255L);
  
  public UINT8(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  public UINT8(int paramInt) {
    super(paramInt);
  }
  
  public UINT8(long paramLong) {
    super(paramLong);
  }
  
  protected UINT8(ASN1Integer paramASN1Integer) {
    super(paramASN1Integer);
  }
  
  public static UINT8 getInstance(Object paramObject) {
    return (paramObject instanceof UINT8) ? (UINT8)paramObject : ((paramObject != null) ? new UINT8(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  protected void assertLimit() {
    if (this.value.signum() < 0)
      throw new IllegalArgumentException("value must not be negative"); 
    if (this.value.compareTo(MAX) > 0)
      throw new IllegalArgumentException("value 0x" + this.value.toString(16) + "  must not exceed 0x" + MAX.toString(16)); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\UINT8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */