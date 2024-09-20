package META-INF.versions.9.org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.saber.SABERParameters;

public class SABERKeyParameters extends AsymmetricKeyParameter {
  private SABERParameters params;
  
  public SABERKeyParameters(boolean paramBoolean, SABERParameters paramSABERParameters) {
    super(paramBoolean);
    this.params = paramSABERParameters;
  }
  
  public SABERParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\saber\SABERKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */