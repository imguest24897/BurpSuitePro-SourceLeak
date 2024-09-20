package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

public class Longitude extends OneEightyDegreeInt {
  public Longitude(long paramLong) {
    super(paramLong);
  }
  
  public Longitude(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  private Longitude(ASN1Integer paramASN1Integer) {
    this(paramASN1Integer.getValue());
  }
  
  public static Longitude getInstance(Object paramObject) {
    return (paramObject instanceof Longitude) ? (Longitude)paramObject : ((paramObject != null) ? new Longitude(ASN1Integer.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\Longitude.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */