package org.bouncycastle.pqc.crypto.gemss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class GeMSSKeyParameters extends AsymmetricKeyParameter {
  final GeMSSParameters parameters;
  
  protected GeMSSKeyParameters(boolean paramBoolean, GeMSSParameters paramGeMSSParameters) {
    super(paramBoolean);
    this.parameters = paramGeMSSParameters;
  }
  
  public GeMSSParameters getParameters() {
    return this.parameters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\GeMSSKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */