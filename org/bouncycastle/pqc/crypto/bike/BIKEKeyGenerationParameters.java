package org.bouncycastle.pqc.crypto.bike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class BIKEKeyGenerationParameters extends KeyGenerationParameters {
  private BIKEParameters params;
  
  public BIKEKeyGenerationParameters(SecureRandom paramSecureRandom, BIKEParameters paramBIKEParameters) {
    super(paramSecureRandom, 256);
    this.params = paramBIKEParameters;
  }
  
  public BIKEParameters getParameters() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\bike\BIKEKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */