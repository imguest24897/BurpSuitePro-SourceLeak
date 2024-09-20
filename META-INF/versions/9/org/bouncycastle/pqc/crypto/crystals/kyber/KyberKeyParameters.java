package META-INF.versions.9.org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;

public class KyberKeyParameters extends AsymmetricKeyParameter {
  private KyberParameters params;
  
  public KyberKeyParameters(boolean paramBoolean, KyberParameters paramKyberParameters) {
    super(paramBoolean);
    this.params = paramKyberParameters;
  }
  
  public KyberParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\crystals\kyber\KyberKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */