package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

public class UINT16 extends UintBase {
  private static final BigInteger MAX = BigInteger.valueOf(65535L);
  
  public UINT16(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  public UINT16(int paramInt) {
    super(paramInt);
  }
  
  public UINT16(long paramLong) {
    super(paramLong);
  }
  
  protected UINT16(ASN1Integer paramASN1Integer) {
    super(paramASN1Integer);
  }
  
  public static UINT16 getInstance(Object paramObject) {
    return (paramObject instanceof UINT16) ? (UINT16)paramObject : ((paramObject != null) ? new UINT16(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  public static UINT16 valueOf(int paramInt) {
    return new UINT16(paramInt);
  }
  
  protected void assertLimit() {
    if (this.value.signum() < 0)
      throw new IllegalArgumentException("value must not be negative"); 
    if (this.value.compareTo(MAX) > 0)
      throw new IllegalArgumentException("value must not exceed " + MAX.toString(16)); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\UINT16.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */