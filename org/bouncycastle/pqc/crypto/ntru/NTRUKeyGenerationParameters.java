package org.bouncycastle.pqc.crypto.ntru;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class NTRUKeyGenerationParameters extends KeyGenerationParameters {
  private final NTRUParameters ntruParameters;
  
  public NTRUKeyGenerationParameters(SecureRandom paramSecureRandom, NTRUParameters paramNTRUParameters) {
    super(paramSecureRandom, 0);
    this.ntruParameters = paramNTRUParameters;
  }
  
  public NTRUParameters getParameters() {
    return this.ntruParameters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntru\NTRUKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */