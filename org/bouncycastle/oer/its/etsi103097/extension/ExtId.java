package org.bouncycastle.oer.its.etsi103097.extension;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

public class ExtId extends ASN1Object {
  private final BigInteger extId;
  
  private static final BigInteger MAX = BigInteger.valueOf(255L);
  
  public ExtId(long paramLong) {
    this(BigInteger.valueOf(paramLong));
  }
  
  public ExtId(BigInteger paramBigInteger) {
    if (paramBigInteger.signum() < 0 || paramBigInteger.compareTo(MAX) > 0)
      throw new IllegalArgumentException("value " + paramBigInteger + " outside of range 0...255"); 
    this.extId = paramBigInteger;
  }
  
  public ExtId(byte[] paramArrayOfbyte) {
    this(new BigInteger(paramArrayOfbyte));
  }
  
  private ExtId(ASN1Integer paramASN1Integer) {
    this(paramASN1Integer.getValue());
  }
  
  public BigInteger getExtId() {
    return this.extId;
  }
  
  public static ExtId getInstance(Object paramObject) {
    return (paramObject instanceof ExtId) ? (ExtId)paramObject : ((paramObject != null) ? new ExtId(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new ASN1Integer(this.extId);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi103097\extension\ExtId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */