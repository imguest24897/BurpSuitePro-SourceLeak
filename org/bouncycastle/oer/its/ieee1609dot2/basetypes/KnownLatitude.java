package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

public class KnownLatitude extends NinetyDegreeInt {
  public KnownLatitude(long paramLong) {
    super(paramLong);
  }
  
  public KnownLatitude(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  private KnownLatitude(ASN1Integer paramASN1Integer) {
    this(paramASN1Integer.getValue());
  }
  
  public static KnownLatitude getInstance(Object paramObject) {
    return (paramObject instanceof KnownLatitude) ? (KnownLatitude)paramObject : ((paramObject != null) ? new KnownLatitude(ASN1Integer.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\KnownLatitude.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */