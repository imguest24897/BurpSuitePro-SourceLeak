package org.bouncycastle.pqc.crypto.crystals.dilithium;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class DilithiumKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private DilithiumParameters dilithiumParams;
  
  private SecureRandom random;
  
  private void initialize(KeyGenerationParameters paramKeyGenerationParameters) {
    this.dilithiumParams = ((DilithiumKeyGenerationParameters)paramKeyGenerationParameters).getParameters();
    this.random = paramKeyGenerationParameters.getRandom();
  }
  
  private AsymmetricCipherKeyPair genKeyPair() {
    DilithiumEngine dilithiumEngine = this.dilithiumParams.getEngine(this.random);
    byte[][] arrayOfByte = dilithiumEngine.generateKeyPair();
    DilithiumPublicKeyParameters dilithiumPublicKeyParameters = new DilithiumPublicKeyParameters(this.dilithiumParams, arrayOfByte[0], arrayOfByte[6]);
    DilithiumPrivateKeyParameters dilithiumPrivateKeyParameters = new DilithiumPrivateKeyParameters(this.dilithiumParams, arrayOfByte[0], arrayOfByte[1], arrayOfByte[2], arrayOfByte[3], arrayOfByte[4], arrayOfByte[5], arrayOfByte[6]);
    return new AsymmetricCipherKeyPair(dilithiumPublicKeyParameters, dilithiumPrivateKeyParameters);
  }
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    initialize(paramKeyGenerationParameters);
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    return genKeyPair();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\dilithium\DilithiumKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */