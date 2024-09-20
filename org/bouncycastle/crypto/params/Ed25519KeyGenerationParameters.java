package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class Ed25519KeyGenerationParameters extends KeyGenerationParameters {
  public Ed25519KeyGenerationParameters(SecureRandom paramSecureRandom) {
    super(paramSecureRandom, 256);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\Ed25519KeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */