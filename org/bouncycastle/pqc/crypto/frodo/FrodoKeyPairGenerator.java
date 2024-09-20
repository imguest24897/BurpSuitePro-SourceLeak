package org.bouncycastle.pqc.crypto.frodo;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class FrodoKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private FrodoKeyGenerationParameters frodoParams;
  
  private int n;
  
  private int D;
  
  private int B;
  
  private SecureRandom random;
  
  private void initialize(KeyGenerationParameters paramKeyGenerationParameters) {
    this.frodoParams = (FrodoKeyGenerationParameters)paramKeyGenerationParameters;
    this.random = paramKeyGenerationParameters.getRandom();
    this.n = this.frodoParams.getParameters().getN();
    this.D = this.frodoParams.getParameters().getD();
    this.B = this.frodoParams.getParameters().getB();
  }
  
  private AsymmetricCipherKeyPair genKeyPair() {
    FrodoEngine frodoEngine = this.frodoParams.getParameters().getEngine();
    byte[] arrayOfByte1 = new byte[frodoEngine.getPrivateKeySize()];
    byte[] arrayOfByte2 = new byte[frodoEngine.getPublicKeySize()];
    frodoEngine.kem_keypair(arrayOfByte2, arrayOfByte1, this.random);
    FrodoPublicKeyParameters frodoPublicKeyParameters = new FrodoPublicKeyParameters(this.frodoParams.getParameters(), arrayOfByte2);
    FrodoPrivateKeyParameters frodoPrivateKeyParameters = new FrodoPrivateKeyParameters(this.frodoParams.getParameters(), arrayOfByte1);
    return new AsymmetricCipherKeyPair(frodoPublicKeyParameters, frodoPrivateKeyParameters);
  }
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    initialize(paramKeyGenerationParameters);
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    return genKeyPair();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\frodo\FrodoKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */