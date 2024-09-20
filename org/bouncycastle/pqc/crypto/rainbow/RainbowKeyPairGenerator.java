package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private RainbowKeyComputation rkc;
  
  private Version version;
  
  private void initialize(KeyGenerationParameters paramKeyGenerationParameters) {
    RainbowParameters rainbowParameters = ((RainbowKeyGenerationParameters)paramKeyGenerationParameters).getParameters();
    this.rkc = new RainbowKeyComputation(rainbowParameters, paramKeyGenerationParameters.getRandom());
    this.version = rainbowParameters.getVersion();
  }
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    initialize(paramKeyGenerationParameters);
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    switch (this.version) {
      case CLASSIC:
        return this.rkc.genKeyPairClassical();
      case CIRCUMZENITHAL:
        return this.rkc.genKeyPairCircumzenithal();
      case COMPRESSED:
        return this.rkc.genKeyPairCompressed();
    } 
    throw new IllegalArgumentException("No valid version. Please choose one of the following: classic, circumzenithal, compressed");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\rainbow\RainbowKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */