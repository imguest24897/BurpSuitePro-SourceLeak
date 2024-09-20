package org.bouncycastle.jce;

import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.math.ec.ECCurve;

public class ECPointUtil {
  public static ECPoint decodePoint(EllipticCurve paramEllipticCurve, byte[] paramArrayOfbyte) {
    ECCurve.F2m f2m;
    ECCurve.Fp fp = null;
    if (paramEllipticCurve.getField() instanceof ECFieldFp) {
      fp = new ECCurve.Fp(((ECFieldFp)paramEllipticCurve.getField()).getP(), paramEllipticCurve.getA(), paramEllipticCurve.getB(), null, null);
    } else {
      int[] arrayOfInt = ((ECFieldF2m)paramEllipticCurve.getField()).getMidTermsOfReductionPolynomial();
      if (arrayOfInt.length == 3) {
        f2m = new ECCurve.F2m(((ECFieldF2m)paramEllipticCurve.getField()).getM(), arrayOfInt[2], arrayOfInt[1], arrayOfInt[0], paramEllipticCurve.getA(), paramEllipticCurve.getB(), null, null);
      } else {
        f2m = new ECCurve.F2m(((ECFieldF2m)paramEllipticCurve.getField()).getM(), arrayOfInt[0], paramEllipticCurve.getA(), paramEllipticCurve.getB(), null, null);
      } 
    } 
    return EC5Util.convertPoint(f2m.decodePoint(paramArrayOfbyte));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jce\ECPointUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */