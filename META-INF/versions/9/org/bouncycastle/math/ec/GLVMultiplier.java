package META-INF.versions.9.org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECMultiplier;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.ec.endo.EndoUtil;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;

public class GLVMultiplier extends AbstractECMultiplier {
  protected final ECCurve curve;
  
  protected final GLVEndomorphism glvEndomorphism;
  
  public GLVMultiplier(ECCurve paramECCurve, GLVEndomorphism paramGLVEndomorphism) {
    if (paramECCurve == null || paramECCurve.getOrder() == null)
      throw new IllegalArgumentException("Need curve with known group order"); 
    this.curve = paramECCurve;
    this.glvEndomorphism = paramGLVEndomorphism;
  }
  
  protected ECPoint multiplyPositive(ECPoint paramECPoint, BigInteger paramBigInteger) {
    if (!this.curve.equals(paramECPoint.getCurve()))
      throw new IllegalStateException(); 
    BigInteger bigInteger1 = paramECPoint.getCurve().getOrder();
    BigInteger[] arrayOfBigInteger = this.glvEndomorphism.decomposeScalar(paramBigInteger.mod(bigInteger1));
    BigInteger bigInteger2 = arrayOfBigInteger[0];
    BigInteger bigInteger3 = arrayOfBigInteger[1];
    if (this.glvEndomorphism.hasEfficientPointMap())
      return ECAlgorithms.implShamirsTrickWNaf((ECEndomorphism)this.glvEndomorphism, paramECPoint, bigInteger2, bigInteger3); 
    ECPoint eCPoint = EndoUtil.mapPoint((ECEndomorphism)this.glvEndomorphism, paramECPoint);
    return ECAlgorithms.implShamirsTrickWNaf(paramECPoint, bigInteger2, eCPoint, bigInteger3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\GLVMultiplier.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */