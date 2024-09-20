package META-INF.versions.9.org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;

public class BIKEKeyParameters extends AsymmetricKeyParameter {
  private BIKEParameters params;
  
  public BIKEKeyParameters(boolean paramBoolean, BIKEParameters paramBIKEParameters) {
    super(paramBoolean);
    this.params = paramBIKEParameters;
  }
  
  public BIKEParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\bike\BIKEKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */