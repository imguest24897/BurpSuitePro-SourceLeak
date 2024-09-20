package META-INF.versions.9.org.bouncycastle.math.field;

import java.math.BigInteger;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.GF2Polynomial;
import org.bouncycastle.math.field.GenericPolynomialExtensionField;
import org.bouncycastle.math.field.Polynomial;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.math.field.PrimeField;
import org.bouncycastle.util.BigIntegers;

public abstract class FiniteFields {
  static final FiniteField GF_2 = (FiniteField)new PrimeField(BigInteger.valueOf(2L));
  
  static final FiniteField GF_3 = (FiniteField)new PrimeField(BigInteger.valueOf(3L));
  
  public static PolynomialExtensionField getBinaryExtensionField(int[] paramArrayOfint) {
    if (paramArrayOfint[0] != 0)
      throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term"); 
    for (byte b = 1; b < paramArrayOfint.length; b++) {
      if (paramArrayOfint[b] <= paramArrayOfint[b - 1])
        throw new IllegalArgumentException("Polynomial exponents must be monotonically increasing"); 
    } 
    return (PolynomialExtensionField)new GenericPolynomialExtensionField(GF_2, (Polynomial)new GF2Polynomial(paramArrayOfint));
  }
  
  public static FiniteField getPrimeField(BigInteger paramBigInteger) {
    int i = paramBigInteger.bitLength();
    if (paramBigInteger.signum() <= 0 || i < 2)
      throw new IllegalArgumentException("'characteristic' must be >= 2"); 
    if (i < 3)
      switch (BigIntegers.intValueExact(paramBigInteger)) {
        case 2:
          return GF_2;
        case 3:
          return GF_3;
      }  
    return (FiniteField)new PrimeField(paramBigInteger);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\field\FiniteFields.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */