package org.bouncycastle.pqc.crypto.cmce;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class CMCEKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private CMCEKeyGenerationParameters cmceParams;
  
  private SecureRandom random;
  
  private void initialize(KeyGenerationParameters paramKeyGenerationParameters) {
    this.cmceParams = (CMCEKeyGenerationParameters)paramKeyGenerationParameters;
    this.random = paramKeyGenerationParameters.getRandom();
  }
  
  private AsymmetricCipherKeyPair genKeyPair() {
    CMCEEngine cMCEEngine = this.cmceParams.getParameters().getEngine();
    byte[] arrayOfByte1 = new byte[cMCEEngine.getPrivateKeySize()];
    byte[] arrayOfByte2 = new byte[cMCEEngine.getPublicKeySize()];
    cMCEEngine.kem_keypair(arrayOfByte2, arrayOfByte1, this.random);
    CMCEPublicKeyParameters cMCEPublicKeyParameters = new CMCEPublicKeyParameters(this.cmceParams.getParameters(), arrayOfByte2);
    CMCEPrivateKeyParameters cMCEPrivateKeyParameters = new CMCEPrivateKeyParameters(this.cmceParams.getParameters(), arrayOfByte1);
    return new AsymmetricCipherKeyPair(cMCEPublicKeyParameters, cMCEPrivateKeyParameters);
  }
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    initialize(paramKeyGenerationParameters);
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    return genKeyPair();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\cmce\CMCEKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */