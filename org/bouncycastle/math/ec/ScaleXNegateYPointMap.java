package org.bouncycastle.math.ec;

public class ScaleXNegateYPointMap implements ECPointMap {
  protected final ECFieldElement scale;
  
  public ScaleXNegateYPointMap(ECFieldElement paramECFieldElement) {
    this.scale = paramECFieldElement;
  }
  
  public ECPoint map(ECPoint paramECPoint) {
    return paramECPoint.scaleXNegateY(this.scale);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\ScaleXNegateYPointMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */