package org.bouncycastle.pqc.crypto.crystals.dilithium;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class DilithiumKeyGenerationParameters extends KeyGenerationParameters {
  private final DilithiumParameters params;
  
  public DilithiumKeyGenerationParameters(SecureRandom paramSecureRandom, DilithiumParameters paramDilithiumParameters) {
    super(paramSecureRandom, 256);
    this.params = paramDilithiumParameters;
  }
  
  public DilithiumParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\dilithium\DilithiumKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */