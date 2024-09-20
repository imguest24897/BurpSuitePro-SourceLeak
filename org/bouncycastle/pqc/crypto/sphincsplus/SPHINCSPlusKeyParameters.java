package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\SPHINCSPlusKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */