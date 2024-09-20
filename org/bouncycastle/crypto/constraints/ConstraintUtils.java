package org.bouncycastle.crypto.constraints;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;

public class ConstraintUtils {
  public static int bitsOfSecurityFor(BigInteger paramBigInteger) {
    return bitsOfSecurityForFF(paramBigInteger.bitLength());
  }
  
  public static int bitsOfSecurityFor(ECCurve paramECCurve) {
    int i = (paramECCurve.getFieldSize() + 1) / 2;
    return (i > 256) ? 256 : i;
  }
  
  public static int bitsOfSecurityForFF(int paramInt) {
    return (paramInt >= 2048) ? ((paramInt >= 3072) ? ((paramInt >= 7680) ? ((paramInt >= 15360) ? 256 : 192) : 128) : 112) : ((paramInt >= 1024) ? 80 : 20);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\constraints\ConstraintUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */