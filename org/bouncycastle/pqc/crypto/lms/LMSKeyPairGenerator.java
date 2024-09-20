package org.bouncycastle.pqc.crypto.lms;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class LMSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  LMSKeyGenerationParameters param;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.param = (LMSKeyGenerationParameters)paramKeyGenerationParameters;
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    SecureRandom secureRandom = this.param.getRandom();
    byte[] arrayOfByte1 = new byte[16];
    secureRandom.nextBytes(arrayOfByte1);
    LMSigParameters lMSigParameters = this.param.getParameters().getLMSigParam();
    byte[] arrayOfByte2 = new byte[lMSigParameters.getM()];
    secureRandom.nextBytes(arrayOfByte2);
    LMSPrivateKeyParameters lMSPrivateKeyParameters = LMS.generateKeys(lMSigParameters, this.param.getParameters().getLMOTSParam(), 0, arrayOfByte1, arrayOfByte2);
    return new AsymmetricCipherKeyPair(lMSPrivateKeyParameters.getPublicKey(), lMSPrivateKeyParameters);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\lms\LMSKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */