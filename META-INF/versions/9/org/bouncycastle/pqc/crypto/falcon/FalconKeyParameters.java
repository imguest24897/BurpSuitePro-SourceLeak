package META-INF.versions.9.org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;

public class FalconKeyParameters extends AsymmetricKeyParameter {
  private final FalconParameters params;
  
  public FalconKeyParameters(boolean paramBoolean, FalconParameters paramFalconParameters) {
    super(paramBoolean);
    this.params = paramFalconParameters;
  }
  
  public FalconParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\falcon\FalconKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */