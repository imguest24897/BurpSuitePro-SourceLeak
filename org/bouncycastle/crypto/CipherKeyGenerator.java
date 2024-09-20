package org.bouncycastle.crypto;

import java.security.SecureRandom;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;

public class CipherKeyGenerator {
  protected SecureRandom random;
  
  protected int strength;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.random = paramKeyGenerationParameters.getRandom();
    this.strength = (paramKeyGenerationParameters.getStrength() + 7) / 8;
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("SymKeyGen", paramKeyGenerationParameters.getStrength()));
  }
  
  public byte[] generateKey() {
    byte[] arrayOfByte = new byte[this.strength];
    this.random.nextBytes(arrayOfByte);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\CipherKeyGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */