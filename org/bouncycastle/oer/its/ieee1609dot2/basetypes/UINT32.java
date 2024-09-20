package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

public class UINT32 extends UintBase {
  private static final BigInteger MAX = new BigInteger("FFFFFFFF", 16);
  
  public UINT32(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  public UINT32(int paramInt) {
    super(paramInt);
  }
  
  public UINT32(long paramLong) {
    super(paramLong);
  }
  
  protected UINT32(ASN1Integer paramASN1Integer) {
    super(paramASN1Integer);
  }
  
  public static UINT32 getInstance(Object paramObject) {
    return (paramObject instanceof UINT8) ? (UINT32)paramObject : ((paramObject != null) ? new UINT32(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  protected void assertLimit() {
    if (this.value.signum() < 0)
      throw new IllegalArgumentException("value must not be negative"); 
    if (this.value.compareTo(MAX) > 0)
      throw new IllegalArgumentException("value must not exceed " + MAX.toString(16)); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\UINT32.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */