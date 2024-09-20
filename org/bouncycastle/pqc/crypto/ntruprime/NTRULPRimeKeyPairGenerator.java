package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.util.Arrays;

public class NTRULPRimeKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private NTRULPRimeKeyGenerationParameters params;
  
  public NTRULPRimeKeyGenerationParameters getParams() {
    return this.params;
  }
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.params = (NTRULPRimeKeyGenerationParameters)paramKeyGenerationParameters;
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    int i = this.params.getNtrulprParams().getP();
    int j = this.params.getNtrulprParams().getQ();
    int k = this.params.getNtrulprParams().getW();
    byte[] arrayOfByte1 = new byte[32];
    this.params.getRandom().nextBytes(arrayOfByte1);
    short[] arrayOfShort1 = new short[i];
    Utils.generatePolynomialInRQFromSeed(arrayOfShort1, arrayOfByte1, i, j);
    byte[] arrayOfByte2 = new byte[i];
    Utils.getRandomShortPolynomial(this.params.getRandom(), arrayOfByte2, i, k);
    short[] arrayOfShort2 = new short[i];
    Utils.multiplicationInRQ(arrayOfShort2, arrayOfShort1, arrayOfByte2, i, j);
    short[] arrayOfShort3 = new short[i];
    Utils.roundPolynomial(arrayOfShort3, arrayOfShort2);
    byte[] arrayOfByte3 = new byte[this.params.getNtrulprParams().getPublicKeyBytes() - 32];
    Utils.getRoundedEncodedPolynomial(arrayOfByte3, arrayOfShort3, i, j);
    NTRULPRimePublicKeyParameters nTRULPRimePublicKeyParameters = new NTRULPRimePublicKeyParameters(this.params.getNtrulprParams(), arrayOfByte1, arrayOfByte3);
    byte[] arrayOfByte4 = new byte[(i + 3) / 4];
    Utils.getEncodedSmallPolynomial(arrayOfByte4, arrayOfByte2, i);
    byte[] arrayOfByte5 = new byte[32];
    this.params.getRandom().nextBytes(arrayOfByte5);
    byte[] arrayOfByte6 = { 4 };
    byte[] arrayOfByte7 = Utils.getHashWithPrefix(arrayOfByte6, nTRULPRimePublicKeyParameters.getEncoded());
    NTRULPRimePrivateKeyParameters nTRULPRimePrivateKeyParameters = new NTRULPRimePrivateKeyParameters(this.params.getNtrulprParams(), arrayOfByte4, nTRULPRimePublicKeyParameters.getEncoded(), arrayOfByte5, Arrays.copyOfRange(arrayOfByte7, 0, arrayOfByte7.length / 2));
    return new AsymmetricCipherKeyPair(nTRULPRimePublicKeyParameters, nTRULPRimePrivateKeyParameters);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntruprime\NTRULPRimeKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */