package org.bouncycastle.pqc.math.ntru.parameters;

import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;

public abstract class NTRUHPSParameterSet extends NTRUParameterSet {
  NTRUHPSParameterSet(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public Polynomial createPolynomial() {
    return (Polynomial)new HPSPolynomial(this);
  }
  
  public int sampleFgBytes() {
    return sampleIidBytes() + sampleFixedTypeBytes();
  }
  
  public int sampleRmBytes() {
    return sampleIidBytes() + sampleFixedTypeBytes();
  }
  
  public int weight() {
    return q() / 8 - 2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\math\ntru\parameters\NTRUHPSParameterSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */