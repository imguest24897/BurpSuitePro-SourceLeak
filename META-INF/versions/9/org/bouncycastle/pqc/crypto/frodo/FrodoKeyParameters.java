package META-INF.versions.9.org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.frodo.FrodoParameters;

public class FrodoKeyParameters extends AsymmetricKeyParameter {
  private FrodoParameters params;
  
  public FrodoKeyParameters(boolean paramBoolean, FrodoParameters paramFrodoParameters) {
    super(paramBoolean);
    this.params = paramFrodoParameters;
  }
  
  public FrodoParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\frodo\FrodoKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */