package org.bouncycastle.oer.its.etsi102941.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.BigIntegers;

public class CertificateFormat extends ASN1Object {
  private final int format;
  
  public CertificateFormat(int paramInt) {
    this.format = paramInt;
  }
  
  public CertificateFormat(BigInteger paramBigInteger) {
    this.format = BigIntegers.intValueExact(paramBigInteger);
  }
  
  private CertificateFormat(ASN1Integer paramASN1Integer) {
    this(paramASN1Integer.getValue());
  }
  
  public int getFormat() {
    return this.format;
  }
  
  public static CertificateFormat getInstance(Object paramObject) {
    return (paramObject instanceof CertificateFormat) ? (CertificateFormat)paramObject : ((paramObject != null) ? new CertificateFormat(ASN1Integer.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new ASN1Integer(this.format);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\basetypes\CertificateFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */