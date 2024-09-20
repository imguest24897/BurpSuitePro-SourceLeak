package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class HQCKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private int n;
  
  private int k;
  
  private int delta;
  
  private int w;
  
  private int wr;
  
  private int we;
  
  private int N_BYTE;
  
  private HQCKeyGenerationParameters hqcKeyGenerationParameters;
  
  private SecureRandom random;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.hqcKeyGenerationParameters = (HQCKeyGenerationParameters)paramKeyGenerationParameters;
    this.random = paramKeyGenerationParameters.getRandom();
    this.n = this.hqcKeyGenerationParameters.getParameters().getN();
    this.k = this.hqcKeyGenerationParameters.getParameters().getK();
    this.delta = this.hqcKeyGenerationParameters.getParameters().getDelta();
    this.w = this.hqcKeyGenerationParameters.getParameters().getW();
    this.wr = this.hqcKeyGenerationParameters.getParameters().getWr();
    this.we = this.hqcKeyGenerationParameters.getParameters().getWe();
    this.N_BYTE = (this.n + 7) / 8;
  }
  
  private AsymmetricCipherKeyPair genKeyPair(byte[] paramArrayOfbyte) {
    HQCEngine hQCEngine = this.hqcKeyGenerationParameters.getParameters().getEngine();
    byte[] arrayOfByte1 = new byte[40 + this.N_BYTE];
    byte[] arrayOfByte2 = new byte[80 + this.N_BYTE];
    hQCEngine.genKeyPair(arrayOfByte1, arrayOfByte2, paramArrayOfbyte);
    HQCPublicKeyParameters hQCPublicKeyParameters = new HQCPublicKeyParameters(this.hqcKeyGenerationParameters.getParameters(), arrayOfByte1);
    HQCPrivateKeyParameters hQCPrivateKeyParameters = new HQCPrivateKeyParameters(this.hqcKeyGenerationParameters.getParameters(), arrayOfByte2);
    return new AsymmetricCipherKeyPair(hQCPublicKeyParameters, hQCPrivateKeyParameters);
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    byte[] arrayOfByte = new byte[48];
    this.random.nextBytes(arrayOfByte);
    return genKeyPair(arrayOfByte);
  }
  
  public AsymmetricCipherKeyPair generateKeyPairWithSeed(byte[] paramArrayOfbyte) {
    return genKeyPair(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\hqc\HQCKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */