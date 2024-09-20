package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.util.BigIntegers;

public class HashAlgorithm extends ASN1Enumerated {
  public static final HashAlgorithm sha256 = new HashAlgorithm(BigInteger.ZERO);
  
  public static final HashAlgorithm sha384 = new HashAlgorithm(BigIntegers.ONE);
  
  public HashAlgorithm(BigInteger paramBigInteger) {
    super(paramBigInteger);
    assertValues();
  }
  
  private HashAlgorithm(ASN1Enumerated paramASN1Enumerated) {
    this(paramASN1Enumerated.getValue());
  }
  
  public static HashAlgorithm getInstance(Object paramObject) {
    return (paramObject instanceof HashAlgorithm) ? (HashAlgorithm)paramObject : ((paramObject != null) ? new HashAlgorithm(ASN1Enumerated.getInstance(paramObject)) : null);
  }
  
  protected void assertValues() {
    switch (BigIntegers.intValueExact(getValue())) {
      case 0:
      case 1:
        return;
    } 
    throw new IllegalArgumentException("invalid enumeration value " + getValue());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\HashAlgorithm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */