package org.bouncycastle.pqc.crypto.xwing;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.generators.X25519KeyPairGenerator;
import org.bouncycastle.crypto.params.X25519KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;

public class XWingKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private SecureRandom random;
  
  private void initialize(KeyGenerationParameters paramKeyGenerationParameters) {
    this.random = paramKeyGenerationParameters.getRandom();
  }
  
  private AsymmetricCipherKeyPair genKeyPair() {
    KyberKeyPairGenerator kyberKeyPairGenerator = new KyberKeyPairGenerator();
    kyberKeyPairGenerator.init((KeyGenerationParameters)new KyberKeyGenerationParameters(this.random, KyberParameters.kyber768));
    X25519KeyPairGenerator x25519KeyPairGenerator = new X25519KeyPairGenerator();
    x25519KeyPairGenerator.init((KeyGenerationParameters)new X25519KeyGenerationParameters(this.random));
    AsymmetricCipherKeyPair asymmetricCipherKeyPair1 = kyberKeyPairGenerator.generateKeyPair();
    AsymmetricCipherKeyPair asymmetricCipherKeyPair2 = x25519KeyPairGenerator.generateKeyPair();
    return new AsymmetricCipherKeyPair(new XWingPublicKeyParameters(asymmetricCipherKeyPair1.getPublic(), asymmetricCipherKeyPair2.getPublic()), new XWingPrivateKeyParameters(asymmetricCipherKeyPair1.getPrivate(), asymmetricCipherKeyPair2.getPrivate()));
  }
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    initialize(paramKeyGenerationParameters);
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    return genKeyPair();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\xwing\XWingKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */