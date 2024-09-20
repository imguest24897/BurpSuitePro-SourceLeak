package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.util.BigIntegers;

public class Time64 extends UINT64 {
  public static long etsiEpochMicros = Time32.etsiEpochMillis * 1000L;
  
  public Time64(long paramLong) {
    this(BigInteger.valueOf(paramLong));
  }
  
  public Time64(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  public Time64(UINT64 paramUINT64) {
    this(paramUINT64.getValue());
  }
  
  public static Time64 now() {
    return new Time64(1000L * System.currentTimeMillis() - etsiEpochMicros);
  }
  
  public static Time64 ofUnixMillis(long paramLong) {
    return new Time64(paramLong * 1000L - etsiEpochMicros);
  }
  
  public static Time64 getInstance(Object paramObject) {
    return (paramObject instanceof UINT64) ? new Time64((UINT64)paramObject) : ((paramObject != null) ? new Time64(ASN1Integer.getInstance(paramObject).getValue()) : null);
  }
  
  public long toUnixMillis() {
    return (BigIntegers.longValueExact(getValue()) + etsiEpochMicros) / 1000L;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\Time64.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */