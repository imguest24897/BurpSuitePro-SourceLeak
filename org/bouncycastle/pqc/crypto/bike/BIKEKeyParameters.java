package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class BIKEKeyParameters extends AsymmetricKeyParameter {
  private BIKEParameters params;
  
  public BIKEKeyParameters(boolean paramBoolean, BIKEParameters paramBIKEParameters) {
    super(paramBoolean);
    this.params = paramBIKEParameters;
  }
  
  public BIKEParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\bike\BIKEKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */