package org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\picnic\PicnicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */