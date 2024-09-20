package org.bouncycastle.oer.its.etsi102941.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

public class Version extends ASN1Object {
  private final BigInteger version;
  
  public Version(BigInteger paramBigInteger) {
    this.version = paramBigInteger;
  }
  
  public Version(int paramInt) {
    this(BigInteger.valueOf(paramInt));
  }
  
  public Version(long paramLong) {
    this(BigInteger.valueOf(paramLong));
  }
  
  protected Version(ASN1Integer paramASN1Integer) {
    this.version = paramASN1Integer.getValue();
  }
  
  public BigInteger getVersion() {
    return this.version;
  }
  
  public static Version getInstance(Object paramObject) {
    return (paramObject instanceof org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8) ? (Version)paramObject : ((paramObject != null) ? new Version(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new ASN1Integer(this.version);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\basetypes\Version.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */