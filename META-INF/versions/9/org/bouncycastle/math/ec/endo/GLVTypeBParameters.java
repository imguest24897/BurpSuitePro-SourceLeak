package META-INF.versions.9.org.bouncycastle.math.ec.endo;

import java.math.BigInteger;
import org.bouncycastle.math.ec.endo.ScalarSplitParameters;

public class GLVTypeBParameters {
  protected final BigInteger beta;
  
  protected final BigInteger lambda;
  
  protected final ScalarSplitParameters splitParams;
  
  public GLVTypeBParameters(BigInteger paramBigInteger1, BigInteger paramBigInteger2, ScalarSplitParameters paramScalarSplitParameters) {
    this.beta = paramBigInteger1;
    this.lambda = paramBigInteger2;
    this.splitParams = paramScalarSplitParameters;
  }
  
  public BigInteger getBeta() {
    return this.beta;
  }
  
  public BigInteger getLambda() {
    return this.lambda;
  }
  
  public ScalarSplitParameters getSplitParams() {
    return this.splitParams;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\endo\GLVTypeBParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */