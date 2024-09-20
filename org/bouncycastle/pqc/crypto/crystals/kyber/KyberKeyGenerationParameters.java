package org.bouncycastle.pqc.crypto.crystals.kyber;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class KyberKeyGenerationParameters extends KeyGenerationParameters {
  private final KyberParameters params;
  
  public KyberKeyGenerationParameters(SecureRandom paramSecureRandom, KyberParameters paramKyberParameters) {
    super(paramSecureRandom, 256);
    this.params = paramKyberParameters;
  }
  
  public KyberParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\kyber\KyberKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */