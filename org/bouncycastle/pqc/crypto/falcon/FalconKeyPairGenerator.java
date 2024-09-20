package org.bouncycastle.pqc.crypto.falcon;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class FalconKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private FalconKeyGenerationParameters params;
  
  private SecureRandom random;
  
  private FalconNIST nist;
  
  private int logn;
  
  private int noncelen;
  
  private int pk_size;
  
  private int sk_size;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.params = (FalconKeyGenerationParameters)paramKeyGenerationParameters;
    this.random = paramKeyGenerationParameters.getRandom();
    this.logn = ((FalconKeyGenerationParameters)paramKeyGenerationParameters).getParameters().getLogN();
    this.noncelen = ((FalconKeyGenerationParameters)paramKeyGenerationParameters).getParameters().getNonceLength();
    this.nist = new FalconNIST(this.logn, this.noncelen, this.random);
    int i = 1 << this.logn;
    byte b = 8;
    if (i == 1024) {
      b = 5;
    } else if (i == 256 || i == 512) {
      b = 6;
    } else if (i == 64 || i == 128) {
      b = 7;
    } 
    this.pk_size = 1 + 14 * i / 8;
    this.sk_size = 1 + 2 * b * i / 8 + i;
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    byte[] arrayOfByte1 = new byte[this.pk_size];
    byte[] arrayOfByte2 = new byte[this.sk_size];
    byte[][] arrayOfByte = this.nist.crypto_sign_keypair(arrayOfByte1, 0, arrayOfByte2, 0);
    FalconParameters falconParameters = this.params.getParameters();
    FalconPrivateKeyParameters falconPrivateKeyParameters = new FalconPrivateKeyParameters(falconParameters, arrayOfByte[1], arrayOfByte[2], arrayOfByte[3], arrayOfByte[0]);
    FalconPublicKeyParameters falconPublicKeyParameters = new FalconPublicKeyParameters(falconParameters, arrayOfByte[0]);
    return new AsymmetricCipherKeyPair(falconPublicKeyParameters, falconPrivateKeyParameters);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\FalconKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */