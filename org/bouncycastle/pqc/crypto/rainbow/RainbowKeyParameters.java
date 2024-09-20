package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\rainbow\RainbowKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */