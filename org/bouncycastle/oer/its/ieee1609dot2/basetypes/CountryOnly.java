package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

public class CountryOnly extends UINT16 implements RegionInterface {
  public CountryOnly(int paramInt) {
    super(paramInt);
  }
  
  public CountryOnly(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  public static CountryOnly getInstance(Object paramObject) {
    return (paramObject instanceof CountryOnly) ? (CountryOnly)paramObject : ((paramObject != null) ? new CountryOnly(ASN1Integer.getInstance(paramObject).getValue()) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\CountryOnly.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */