package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

public class UINT64 extends UintBase {
  private static final BigInteger MAX = new BigInteger("18446744073709551615");
  
  public UINT64(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  public UINT64(int paramInt) {
    super(paramInt);
  }
  
  public UINT64(long paramLong) {
    super(paramLong);
  }
  
  protected UINT64(ASN1Integer paramASN1Integer) {
    super(paramASN1Integer);
  }
  
  public static UINT64 getInstance(Object paramObject) {
    return (paramObject instanceof UINT64) ? (UINT64)paramObject : ((paramObject != null) ? new UINT64(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  protected void assertLimit() {
    if (this.value.signum() < 0)
      throw new IllegalArgumentException("value must not be negative"); 
    if (this.value.compareTo(MAX) > 0)
      throw new IllegalArgumentException("value must not exceed " + MAX.toString(16)); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\UINT64.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */