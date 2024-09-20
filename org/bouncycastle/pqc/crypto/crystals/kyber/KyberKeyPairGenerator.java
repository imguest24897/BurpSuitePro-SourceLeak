package org.bouncycastle.pqc.crypto.crystals.kyber;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class KyberKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private KyberParameters kyberParams;
  
  private SecureRandom random;
  
  private void initialize(KeyGenerationParameters paramKeyGenerationParameters) {
    this.kyberParams = ((KyberKeyGenerationParameters)paramKeyGenerationParameters).getParameters();
    this.random = paramKeyGenerationParameters.getRandom();
  }
  
  private AsymmetricCipherKeyPair genKeyPair() {
    KyberEngine kyberEngine = this.kyberParams.getEngine();
    kyberEngine.init(this.random);
    byte[][] arrayOfByte = kyberEngine.generateKemKeyPair();
    KyberPublicKeyParameters kyberPublicKeyParameters = new KyberPublicKeyParameters(this.kyberParams, arrayOfByte[0], arrayOfByte[1]);
    KyberPrivateKeyParameters kyberPrivateKeyParameters = new KyberPrivateKeyParameters(this.kyberParams, arrayOfByte[2], arrayOfByte[3], arrayOfByte[4], arrayOfByte[0], arrayOfByte[1]);
    return new AsymmetricCipherKeyPair(kyberPublicKeyParameters, kyberPrivateKeyParameters);
  }
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    initialize(paramKeyGenerationParameters);
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    return genKeyPair();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\kyber\KyberKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */