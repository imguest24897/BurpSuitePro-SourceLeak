package META-INF.versions.9.org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;

public class RainbowKeyParameters extends AsymmetricKeyParameter {
  private final RainbowParameters params;
  
  private final int docLength;
  
  public RainbowKeyParameters(boolean paramBoolean, RainbowParameters paramRainbowParameters) {
    super(paramBoolean);
    this.params = paramRainbowParameters;
    this.docLength = paramRainbowParameters.getM();
  }
  
  public RainbowParameters getParameters() {
    return this.params;
  }
  
  public int getDocLength() {
    return this.docLength;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\rainbow\RainbowKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */