package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class SNTRUPrimeKeyParameters extends AsymmetricKeyParameter {
  private final SNTRUPrimeParameters params;
  
  public SNTRUPrimeKeyParameters(boolean paramBoolean, SNTRUPrimeParameters paramSNTRUPrimeParameters) {
    super(paramBoolean);
    this.params = paramSNTRUPrimeParameters;
  }
  
  public SNTRUPrimeParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntruprime\SNTRUPrimeKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */