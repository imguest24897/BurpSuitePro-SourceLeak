package org.bouncycastle.pqc.crypto.gemss;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class GeMSSKeyGenerationParameters extends KeyGenerationParameters {
  final GeMSSParameters parameters;
  
  public GeMSSKeyGenerationParameters(SecureRandom paramSecureRandom, GeMSSParameters paramGeMSSParameters) {
    super(paramSecureRandom, -1);
    this.parameters = paramGeMSSParameters;
  }
  
  public GeMSSParameters getParameters() {
    return this.parameters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\GeMSSKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */