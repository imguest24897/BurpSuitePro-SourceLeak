package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class CramerShoupKeyGenerationParameters extends KeyGenerationParameters {
  private CramerShoupParameters params;
  
  public CramerShoupKeyGenerationParameters(SecureRandom paramSecureRandom, CramerShoupParameters paramCramerShoupParameters) {
    super(paramSecureRandom, getStrength(paramCramerShoupParameters));
    this.params = paramCramerShoupParameters;
  }
  
  public CramerShoupParameters getParameters() {
    return this.params;
  }
  
  static int getStrength(CramerShoupParameters paramCramerShoupParameters) {
    return paramCramerShoupParameters.getP().bitLength();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\CramerShoupKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */