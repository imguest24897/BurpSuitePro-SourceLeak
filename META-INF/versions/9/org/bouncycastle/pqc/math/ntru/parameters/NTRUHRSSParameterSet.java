package META-INF.versions.9.org.bouncycastle.pqc.math.ntru.parameters;

import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;
import org.bouncycastle.pqc.math.ntru.HRSSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;

public abstract class NTRUHRSSParameterSet extends NTRUParameterSet {
  NTRUHRSSParameterSet(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public Polynomial createPolynomial() {
    return (n() == 1373) ? (Polynomial)new HRSS1373Polynomial(this) : (Polynomial)new HRSSPolynomial(this);
  }
  
  public int sampleFgBytes() {
    return 2 * sampleIidBytes();
  }
  
  public int sampleRmBytes() {
    return 2 * sampleIidBytes();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\math\ntru\parameters\NTRUHRSSParameterSet.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */