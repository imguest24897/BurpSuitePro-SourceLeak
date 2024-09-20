package org.bouncycastle.oer.its.ieee1609dot2;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

public class HeaderInfoContributorId extends ASN1Object {
  private final BigInteger contributorId;
  
  private static final BigInteger MAX = BigInteger.valueOf(255L);
  
  public HeaderInfoContributorId(long paramLong) {
    this(BigInteger.valueOf(paramLong));
  }
  
  public HeaderInfoContributorId(BigInteger paramBigInteger) {
    if (paramBigInteger.signum() < 0 && paramBigInteger.compareTo(MAX) > 0)
      throw new IllegalArgumentException("contributor id " + paramBigInteger + " is out of range 0..255"); 
    this.contributorId = paramBigInteger;
  }
  
  private HeaderInfoContributorId(ASN1Integer paramASN1Integer) {
    this(paramASN1Integer.getValue());
  }
  
  public static HeaderInfoContributorId getInstance(Object paramObject) {
    return (paramObject instanceof HeaderInfoContributorId) ? (HeaderInfoContributorId)paramObject : ((paramObject != null) ? new HeaderInfoContributorId(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  public BigInteger getContributorId() {
    return this.contributorId;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new ASN1Integer(this.contributorId);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\HeaderInfoContributorId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */