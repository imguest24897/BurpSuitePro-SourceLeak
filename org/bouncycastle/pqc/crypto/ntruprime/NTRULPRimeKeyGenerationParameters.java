package org.bouncycastle.pqc.crypto.ntruprime;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class NTRULPRimeKeyGenerationParameters extends KeyGenerationParameters {
  private final NTRULPRimeParameters ntrulprParams;
  
  public NTRULPRimeKeyGenerationParameters(SecureRandom paramSecureRandom, NTRULPRimeParameters paramNTRULPRimeParameters) {
    super((null != paramSecureRandom) ? paramSecureRandom : CryptoServicesRegistrar.getSecureRandom(), 256);
    this.ntrulprParams = paramNTRULPRimeParameters;
  }
  
  public NTRULPRimeParameters getNtrulprParams() {
    return this.ntrulprParams;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntruprime\NTRULPRimeKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */