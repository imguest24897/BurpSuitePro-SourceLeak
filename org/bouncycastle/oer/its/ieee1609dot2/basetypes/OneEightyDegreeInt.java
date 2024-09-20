package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

public class OneEightyDegreeInt extends ASN1Object {
  private static final BigInteger loweBound = new BigInteger("-1799999999");
  
  private static final BigInteger upperBound = new BigInteger("1800000000");
  
  private static final BigInteger unknown = new BigInteger("1800000001");
  
  private final BigInteger value;
  
  public OneEightyDegreeInt(long paramLong) {
    this(BigInteger.valueOf(paramLong));
  }
  
  public OneEightyDegreeInt(BigInteger paramBigInteger) {
    if (!paramBigInteger.equals(unknown)) {
      if (paramBigInteger.compareTo(loweBound) < 0)
        throw new IllegalStateException("one eighty degree int cannot be less than -1799999999"); 
      if (paramBigInteger.compareTo(upperBound) > 0)
        throw new IllegalStateException("one eighty degree int cannot be greater than 1800000000"); 
    } 
    this.value = paramBigInteger;
  }
  
  private OneEightyDegreeInt(ASN1Integer paramASN1Integer) {
    this(paramASN1Integer.getValue());
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new ASN1Integer(this.value);
  }
  
  public BigInteger getValue() {
    return this.value;
  }
  
  public static OneEightyDegreeInt getInstance(Object paramObject) {
    return (paramObject instanceof OneEightyDegreeInt) ? (OneEightyDegreeInt)paramObject : ((paramObject != null) ? new OneEightyDegreeInt(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  private static BigInteger assertValue(BigInteger paramBigInteger) {
    return paramBigInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\OneEightyDegreeInt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */