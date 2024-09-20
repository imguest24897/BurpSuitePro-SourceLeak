package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

public class Elevation extends UINT16 {
  public Elevation(UINT16 paramUINT16) {
    super(paramUINT16.getValue());
  }
  
  public Elevation(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  public Elevation(int paramInt) {
    super(paramInt);
  }
  
  public Elevation(long paramLong) {
    super(paramLong);
  }
  
  protected Elevation(ASN1Integer paramASN1Integer) {
    super(paramASN1Integer);
  }
  
  public static Elevation getInstance(Object paramObject) {
    return (paramObject instanceof Elevation) ? (Elevation)paramObject : ((paramObject != null) ? new Elevation(UINT16.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\Elevation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */