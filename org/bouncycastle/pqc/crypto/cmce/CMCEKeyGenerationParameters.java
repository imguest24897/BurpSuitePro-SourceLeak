package org.bouncycastle.pqc.crypto.cmce;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class CMCEKeyGenerationParameters extends KeyGenerationParameters {
  private CMCEParameters params;
  
  public CMCEKeyGenerationParameters(SecureRandom paramSecureRandom, CMCEParameters paramCMCEParameters) {
    super(paramSecureRandom, 256);
    this.params = paramCMCEParameters;
  }
  
  public CMCEParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\cmce\CMCEKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */