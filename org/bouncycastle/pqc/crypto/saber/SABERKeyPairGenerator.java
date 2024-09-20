package org.bouncycastle.pqc.crypto.saber;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class SABERKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private SABERKeyGenerationParameters saberParams;
  
  private int l;
  
  private SecureRandom random;
  
  private void initialize(KeyGenerationParameters paramKeyGenerationParameters) {
    this.saberParams = (SABERKeyGenerationParameters)paramKeyGenerationParameters;
    this.random = paramKeyGenerationParameters.getRandom();
    this.l = this.saberParams.getParameters().getL();
  }
  
  private AsymmetricCipherKeyPair genKeyPair() {
    SABEREngine sABEREngine = this.saberParams.getParameters().getEngine();
    byte[] arrayOfByte1 = new byte[sABEREngine.getPrivateKeySize()];
    byte[] arrayOfByte2 = new byte[sABEREngine.getPublicKeySize()];
    sABEREngine.crypto_kem_keypair(arrayOfByte2, arrayOfByte1, this.random);
    SABERPublicKeyParameters sABERPublicKeyParameters = new SABERPublicKeyParameters(this.saberParams.getParameters(), arrayOfByte2);
    SABERPrivateKeyParameters sABERPrivateKeyParameters = new SABERPrivateKeyParameters(this.saberParams.getParameters(), arrayOfByte1);
    return new AsymmetricCipherKeyPair(sABERPublicKeyParameters, sABERPrivateKeyParameters);
  }
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    initialize(paramKeyGenerationParameters);
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    return genKeyPair();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\saber\SABERKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */