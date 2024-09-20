package org.bouncycastle.pqc.crypto.picnic;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class PicnicKeyGenerationParameters extends KeyGenerationParameters {
  private final PicnicParameters parameters;
  
  public PicnicKeyGenerationParameters(SecureRandom paramSecureRandom, PicnicParameters paramPicnicParameters) {
    super(paramSecureRandom, -1);
    this.parameters = paramPicnicParameters;
  }
  
  public PicnicParameters getParameters() {
    return this.parameters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\picnic\PicnicKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */