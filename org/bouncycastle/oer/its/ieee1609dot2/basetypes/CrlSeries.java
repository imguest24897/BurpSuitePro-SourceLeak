package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

public class CrlSeries extends UINT16 {
  public CrlSeries(int paramInt) {
    super(paramInt);
  }
  
  public CrlSeries(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  public static CrlSeries getInstance(Object paramObject) {
    return (paramObject instanceof CrlSeries) ? (CrlSeries)paramObject : ((paramObject != null) ? new CrlSeries(ASN1Integer.getInstance(paramObject).getValue()) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\CrlSeries.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */