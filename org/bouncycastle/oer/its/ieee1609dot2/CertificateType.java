package org.bouncycastle.oer.its.ieee1609dot2;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.util.BigIntegers;

public class CertificateType extends ASN1Enumerated {
  public static final CertificateType explicit = new CertificateType(BigInteger.ZERO);
  
  public static final CertificateType implicit = new CertificateType(BigInteger.ONE);
  
  public CertificateType(BigInteger paramBigInteger) {
    super(paramBigInteger);
    assertValues();
  }
  
  private CertificateType(ASN1Enumerated paramASN1Enumerated) {
    this(paramASN1Enumerated.getValue());
  }
  
  public static CertificateType getInstance(Object paramObject) {
    return (paramObject instanceof CertificateType) ? (CertificateType)paramObject : ((paramObject != null) ? new CertificateType(ASN1Enumerated.getInstance(paramObject)) : null);
  }
  
  protected void assertValues() {
    if (getValue().compareTo(BigInteger.ZERO) < 0 || getValue().compareTo(BigIntegers.ONE) > 0)
      throw new IllegalArgumentException("invalid enumeration value " + getValue()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\CertificateType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */