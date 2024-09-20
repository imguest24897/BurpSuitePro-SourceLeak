package org.bouncycastle.oer.its.ieee1609dot2;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

public class PduFunctionalType extends ASN1Object {
  private static final BigInteger MAX = BigInteger.valueOf(255L);
  
  public static final PduFunctionalType tlsHandshake = new PduFunctionalType(1L);
  
  public static final PduFunctionalType iso21177ExtendedAuth = new PduFunctionalType(2L);
  
  private final BigInteger functionalType;
  
  public PduFunctionalType(long paramLong) {
    this(BigInteger.valueOf(paramLong));
  }
  
  public PduFunctionalType(BigInteger paramBigInteger) {
    this.functionalType = assertValue(paramBigInteger);
  }
  
  public PduFunctionalType(byte[] paramArrayOfbyte) {
    this(new BigInteger(paramArrayOfbyte));
  }
  
  private PduFunctionalType(ASN1Integer paramASN1Integer) {
    this(paramASN1Integer.getValue());
  }
  
  public static PduFunctionalType getInstance(Object paramObject) {
    return (paramObject instanceof PduFunctionalType) ? (PduFunctionalType)paramObject : ((paramObject != null) ? new PduFunctionalType(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  public BigInteger getFunctionalType() {
    return this.functionalType;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new ASN1Integer(this.functionalType);
  }
  
  private static BigInteger assertValue(BigInteger paramBigInteger) {
    if (paramBigInteger.signum() < 0)
      throw new IllegalArgumentException("value less than 0"); 
    if (paramBigInteger.compareTo(MAX) > 0)
      throw new IllegalArgumentException("value exceeds " + MAX); 
    return paramBigInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\PduFunctionalType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */