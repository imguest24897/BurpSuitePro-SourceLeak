package META-INF.versions.9.org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.cmce.CMCEParameters;

public class CMCEKeyParameters extends AsymmetricKeyParameter {
  private CMCEParameters params;
  
  public CMCEKeyParameters(boolean paramBoolean, CMCEParameters paramCMCEParameters) {
    super(paramBoolean);
    this.params = paramCMCEParameters;
  }
  
  public CMCEParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\cmce\CMCEKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */