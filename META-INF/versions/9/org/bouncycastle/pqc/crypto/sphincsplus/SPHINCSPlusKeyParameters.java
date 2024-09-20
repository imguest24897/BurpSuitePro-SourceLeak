package META-INF.versions.9.org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters;

public class SPHINCSPlusKeyParameters extends AsymmetricKeyParameter {
  final SPHINCSPlusParameters parameters;
  
  protected SPHINCSPlusKeyParameters(boolean paramBoolean, SPHINCSPlusParameters paramSPHINCSPlusParameters) {
    super(paramBoolean);
    this.parameters = paramSPHINCSPlusParameters;
  }
  
  public SPHINCSPlusParameters getParameters() {
    return this.parameters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\sphincsplus\SPHINCSPlusKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */