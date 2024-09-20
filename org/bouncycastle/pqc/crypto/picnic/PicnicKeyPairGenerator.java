package org.bouncycastle.pqc.crypto.picnic;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class PicnicKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private SecureRandom random;
  
  private PicnicParameters parameters;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.random = paramKeyGenerationParameters.getRandom();
    this.parameters = ((PicnicKeyGenerationParameters)paramKeyGenerationParameters).getParameters();
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    PicnicEngine picnicEngine = this.parameters.getEngine();
    byte[] arrayOfByte1 = new byte[picnicEngine.getSecretKeySize()];
    byte[] arrayOfByte2 = new byte[picnicEngine.getPublicKeySize()];
    picnicEngine.crypto_sign_keypair(arrayOfByte2, arrayOfByte1, this.random);
    PicnicPublicKeyParameters picnicPublicKeyParameters = new PicnicPublicKeyParameters(this.parameters, arrayOfByte2);
    PicnicPrivateKeyParameters picnicPrivateKeyParameters = new PicnicPrivateKeyParameters(this.parameters, arrayOfByte1);
    return new AsymmetricCipherKeyPair(picnicPublicKeyParameters, picnicPrivateKeyParameters);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\picnic\PicnicKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */