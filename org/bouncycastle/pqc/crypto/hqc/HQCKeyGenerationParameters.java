package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class HQCKeyGenerationParameters extends KeyGenerationParameters {
  private HQCParameters params;
  
  public HQCKeyGenerationParameters(SecureRandom paramSecureRandom, HQCParameters paramHQCParameters) {
    super(paramSecureRandom, 256);
    this.params = paramHQCParameters;
  }
  
  public HQCParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\hqc\HQCKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */