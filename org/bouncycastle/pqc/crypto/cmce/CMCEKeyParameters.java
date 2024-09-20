package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class CMCEKeyParameters extends AsymmetricKeyParameter {
  private CMCEParameters params;
  
  public CMCEKeyParameters(boolean paramBoolean, CMCEParameters paramCMCEParameters) {
    super(paramBoolean);
    this.params = paramCMCEParameters;
  }
  
  public CMCEParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\cmce\CMCEKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */