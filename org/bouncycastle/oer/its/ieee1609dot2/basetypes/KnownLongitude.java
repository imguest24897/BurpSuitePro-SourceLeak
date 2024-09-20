package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

public class KnownLongitude extends Longitude {
  public KnownLongitude(long paramLong) {
    super(paramLong);
  }
  
  public KnownLongitude(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  private KnownLongitude(ASN1Integer paramASN1Integer) {
    this(paramASN1Integer.getValue());
  }
  
  public static KnownLongitude getInstance(Object paramObject) {
    return (paramObject instanceof KnownLongitude) ? (KnownLongitude)paramObject : ((paramObject != null) ? new KnownLongitude(ASN1Integer.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\KnownLongitude.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */