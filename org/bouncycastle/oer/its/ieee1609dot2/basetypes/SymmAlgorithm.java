package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.util.BigIntegers;

public class SymmAlgorithm extends ASN1Enumerated {
  public static final SymmAlgorithm aes128Ccm = new SymmAlgorithm(BigInteger.ZERO);
  
  public SymmAlgorithm(BigInteger paramBigInteger) {
    super(paramBigInteger);
    assertValues();
  }
  
  private SymmAlgorithm(ASN1Enumerated paramASN1Enumerated) {
    super(paramASN1Enumerated.getValue());
    assertValues();
  }
  
  protected void assertValues() {
    switch (BigIntegers.intValueExact(getValue())) {
      case 0:
        return;
    } 
    throw new IllegalArgumentException("invalid enumeration value " + getValue());
  }
  
  public static SymmAlgorithm getInstance(Object paramObject) {
    return (paramObject instanceof SymmAlgorithm) ? (SymmAlgorithm)paramObject : ((paramObject != null) ? new SymmAlgorithm(ASN1Enumerated.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SymmAlgorithm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */