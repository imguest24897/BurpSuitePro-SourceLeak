package META-INF.versions.9.org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;

public class NTRULPRimeKeyParameters extends AsymmetricKeyParameter {
  private final NTRULPRimeParameters params;
  
  public NTRULPRimeKeyParameters(boolean paramBoolean, NTRULPRimeParameters paramNTRULPRimeParameters) {
    super(paramBoolean);
    this.params = paramNTRULPRimeParameters;
  }
  
  public NTRULPRimeParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\ntruprime\NTRULPRimeKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */