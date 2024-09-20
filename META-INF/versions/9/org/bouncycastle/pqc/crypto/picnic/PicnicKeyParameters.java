package META-INF.versions.9.org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.picnic.PicnicParameters;

public class PicnicKeyParameters extends AsymmetricKeyParameter {
  final PicnicParameters parameters;
  
  public PicnicKeyParameters(boolean paramBoolean, PicnicParameters paramPicnicParameters) {
    super(paramBoolean);
    this.parameters = paramPicnicParameters;
  }
  
  public PicnicParameters getParameters() {
    return this.parameters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\picnic\PicnicKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */