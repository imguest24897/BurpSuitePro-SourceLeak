package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

public class NinetyDegreeInt extends ASN1Object {
  private static final BigInteger loweBound = new BigInteger("-900000000");
  
  private static final BigInteger upperBound = new BigInteger("900000000");
  
  private static final BigInteger unknown = new BigInteger("900000001");
  
  private final BigInteger value;
  
  public NinetyDegreeInt(long paramLong) {
    this(BigInteger.valueOf(paramLong));
  }
  
  public NinetyDegreeInt(BigInteger paramBigInteger) {
    if (!paramBigInteger.equals(unknown)) {
      if (paramBigInteger.compareTo(loweBound) < 0)
        throw new IllegalStateException("ninety degree int cannot be less than -900000000"); 
      if (paramBigInteger.compareTo(upperBound) > 0)
        throw new IllegalStateException("ninety degree int cannot be greater than 900000000"); 
    } 
    this.value = paramBigInteger;
  }
  
  private NinetyDegreeInt(ASN1Integer paramASN1Integer) {
    this(paramASN1Integer.getValue());
  }
  
  public BigInteger getValue() {
    return this.value;
  }
  
  public static NinetyDegreeInt getInstance(Object paramObject) {
    return (paramObject instanceof NinetyDegreeInt) ? (NinetyDegreeInt)paramObject : ((paramObject != null) ? new NinetyDegreeInt(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new ASN1Integer(this.value);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\NinetyDegreeInt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */