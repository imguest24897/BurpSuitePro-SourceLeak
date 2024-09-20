package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

public class Latitude extends NinetyDegreeInt {
  public Latitude(long paramLong) {
    super(paramLong);
  }
  
  public Latitude(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  private Latitude(ASN1Integer paramASN1Integer) {
    this(paramASN1Integer.getValue());
  }
  
  public static Latitude getInstance(Object paramObject) {
    return (paramObject instanceof Latitude) ? (Latitude)paramObject : ((paramObject != null) ? new Latitude(ASN1Integer.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\Latitude.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */