package META-INF.versions.9.org.bouncycastle.math.ec.endo;

import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.PreCompInfo;
import org.bouncycastle.math.ec.endo.ECEndomorphism;

public class EndoPreCompInfo implements PreCompInfo {
  protected ECEndomorphism endomorphism;
  
  protected ECPoint mappedPoint;
  
  public ECEndomorphism getEndomorphism() {
    return this.endomorphism;
  }
  
  public void setEndomorphism(ECEndomorphism paramECEndomorphism) {
    this.endomorphism = paramECEndomorphism;
  }
  
  public ECPoint getMappedPoint() {
    return this.mappedPoint;
  }
  
  public void setMappedPoint(ECPoint paramECPoint) {
    this.mappedPoint = paramECPoint;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\endo\EndoPreCompInfo.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */