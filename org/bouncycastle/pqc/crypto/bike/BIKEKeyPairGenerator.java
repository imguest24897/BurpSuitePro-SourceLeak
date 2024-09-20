package org.bouncycastle.pqc.crypto.bike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class BIKEKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private SecureRandom random;
  
  private int r;
  
  private int l;
  
  private int L_BYTE;
  
  private int R_BYTE;
  
  private BIKEKeyGenerationParameters bikeKeyGenerationParameters;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.bikeKeyGenerationParameters = (BIKEKeyGenerationParameters)paramKeyGenerationParameters;
    this.random = paramKeyGenerationParameters.getRandom();
    this.r = this.bikeKeyGenerationParameters.getParameters().getR();
    this.l = this.bikeKeyGenerationParameters.getParameters().getL();
    this.L_BYTE = this.l / 8;
    this.R_BYTE = (this.r + 7) / 8;
  }
  
  private AsymmetricCipherKeyPair genKeyPair() {
    BIKEEngine bIKEEngine = this.bikeKeyGenerationParameters.getParameters().getEngine();
    byte[] arrayOfByte1 = new byte[this.R_BYTE];
    byte[] arrayOfByte2 = new byte[this.R_BYTE];
    byte[] arrayOfByte3 = new byte[this.R_BYTE];
    byte[] arrayOfByte4 = new byte[this.L_BYTE];
    bIKEEngine.genKeyPair(arrayOfByte1, arrayOfByte2, arrayOfByte4, arrayOfByte3, this.random);
    BIKEPublicKeyParameters bIKEPublicKeyParameters = new BIKEPublicKeyParameters(this.bikeKeyGenerationParameters.getParameters(), arrayOfByte3);
    BIKEPrivateKeyParameters bIKEPrivateKeyParameters = new BIKEPrivateKeyParameters(this.bikeKeyGenerationParameters.getParameters(), arrayOfByte1, arrayOfByte2, arrayOfByte4);
    return new AsymmetricCipherKeyPair(bIKEPublicKeyParameters, bIKEPrivateKeyParameters);
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    return genKeyPair();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\bike\BIKEKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */