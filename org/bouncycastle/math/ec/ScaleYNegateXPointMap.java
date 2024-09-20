package org.bouncycastle.math.ec;

public class ScaleYNegateXPointMap implements ECPointMap {
  protected final ECFieldElement scale;
  
  public ScaleYNegateXPointMap(ECFieldElement paramECFieldElement) {
    this.scale = paramECFieldElement;
  }
  
  public ECPoint map(ECPoint paramECPoint) {
    return paramECPoint.scaleYNegateX(this.scale);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\ScaleYNegateXPointMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */