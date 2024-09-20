package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.asn1.ASN1Integer;

public class Time32 extends UINT32 {
  public static long etsiEpochMillis = 1072915200000L;
  
  public Time32(long paramLong) {
    super(paramLong);
  }
  
  public Time32(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  public Time32(UINT32 paramUINT32) {
    this(paramUINT32.getValue());
  }
  
  public static Time32 now() {
    return ofUnixMillis(System.currentTimeMillis());
  }
  
  public static Time32 ofUnixMillis(long paramLong) {
    return new Time32((paramLong - etsiEpochMillis) / 1000L);
  }
  
  public static Time32 getInstance(Object paramObject) {
    return (paramObject instanceof UINT32) ? new Time32((UINT32)paramObject) : ((paramObject != null) ? new Time32(ASN1Integer.getInstance(paramObject).getValue()) : null);
  }
  
  public long toUnixMillis() {
    return getValue().longValue() * 1000L + etsiEpochMillis;
  }
  
  public String toString() {
    return (new Date(toUnixMillis())).toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\Time32.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */