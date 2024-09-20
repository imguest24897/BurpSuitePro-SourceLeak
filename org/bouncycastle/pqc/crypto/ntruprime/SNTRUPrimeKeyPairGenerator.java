package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.util.Arrays;

public class SNTRUPrimeKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private SNTRUPrimeKeyGenerationParameters params;
  
  public SNTRUPrimeKeyGenerationParameters getParams() {
    return this.params;
  }
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.params = (SNTRUPrimeKeyGenerationParameters)paramKeyGenerationParameters;
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    int i = this.params.getSntrupParams().getP();
    int j = this.params.getSntrupParams().getQ();
    int k = this.params.getSntrupParams().getW();
    byte[] arrayOfByte1 = new byte[i];
    byte[] arrayOfByte2 = new byte[i];
    while (true) {
      Utils.getRandomSmallPolynomial(this.params.getRandom(), arrayOfByte1);
      if (Utils.isInvertiblePolynomialInR3(arrayOfByte1, arrayOfByte2, i)) {
        byte[] arrayOfByte3 = new byte[i];
        Utils.getRandomShortPolynomial(this.params.getRandom(), arrayOfByte3, i, k);
        short[] arrayOfShort1 = new short[i];
        Utils.getOneThirdInverseInRQ(arrayOfShort1, arrayOfByte3, i, j);
        short[] arrayOfShort2 = new short[i];
        Utils.multiplicationInRQ(arrayOfShort2, arrayOfShort1, arrayOfByte1, i, j);
        byte[] arrayOfByte4 = new byte[this.params.getSntrupParams().getPublicKeyBytes()];
        Utils.getEncodedPolynomial(arrayOfByte4, arrayOfShort2, i, j);
        SNTRUPrimePublicKeyParameters sNTRUPrimePublicKeyParameters = new SNTRUPrimePublicKeyParameters(this.params.getSntrupParams(), arrayOfByte4);
        byte[] arrayOfByte5 = new byte[(i + 3) / 4];
        Utils.getEncodedSmallPolynomial(arrayOfByte5, arrayOfByte3, i);
        byte[] arrayOfByte6 = new byte[(i + 3) / 4];
        Utils.getEncodedSmallPolynomial(arrayOfByte6, arrayOfByte2, i);
        byte[] arrayOfByte7 = new byte[(i + 3) / 4];
        this.params.getRandom().nextBytes(arrayOfByte7);
        byte[] arrayOfByte8 = { 4 };
        byte[] arrayOfByte9 = Utils.getHashWithPrefix(arrayOfByte8, arrayOfByte4);
        SNTRUPrimePrivateKeyParameters sNTRUPrimePrivateKeyParameters = new SNTRUPrimePrivateKeyParameters(this.params.getSntrupParams(), arrayOfByte5, arrayOfByte6, arrayOfByte4, arrayOfByte7, Arrays.copyOfRange(arrayOfByte9, 0, arrayOfByte9.length / 2));
        return new AsymmetricCipherKeyPair(sNTRUPrimePublicKeyParameters, sNTRUPrimePrivateKeyParameters);
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntruprime\SNTRUPrimeKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */