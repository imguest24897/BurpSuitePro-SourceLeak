package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

public class Psid extends ASN1Object {
  private final BigInteger psid;
  
  public Psid(long paramLong) {
    this(BigInteger.valueOf(paramLong));
  }
  
  public Psid(BigInteger paramBigInteger) {
    if (paramBigInteger.signum() < 0)
      throw new IllegalStateException("psid must be greater than zero"); 
    this.psid = paramBigInteger;
  }
  
  public BigInteger getPsid() {
    return this.psid;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new ASN1Integer(this.psid);
  }
  
  public static Psid getInstance(Object paramObject) {
    return (paramObject instanceof Psid) ? (Psid)paramObject : ((paramObject != null) ? new Psid(ASN1Integer.getInstance(paramObject).getValue()) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\Psid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */