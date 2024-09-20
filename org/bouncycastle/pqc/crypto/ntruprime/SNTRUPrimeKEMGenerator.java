package org.bouncycastle.pqc.crypto.ntruprime;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;
import org.bouncycastle.util.Arrays;

public class SNTRUPrimeKEMGenerator implements EncapsulatedSecretGenerator {
  private final SecureRandom random;
  
  public SNTRUPrimeKEMGenerator(SecureRandom paramSecureRandom) {
    this.random = paramSecureRandom;
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    SNTRUPrimePublicKeyParameters sNTRUPrimePublicKeyParameters = (SNTRUPrimePublicKeyParameters)paramAsymmetricKeyParameter;
    SNTRUPrimeParameters sNTRUPrimeParameters = sNTRUPrimePublicKeyParameters.getParameters();
    int i = sNTRUPrimeParameters.getP();
    int j = sNTRUPrimeParameters.getQ();
    int k = sNTRUPrimeParameters.getW();
    int m = sNTRUPrimeParameters.getRoundedPolynomialBytes();
    byte[] arrayOfByte1 = { 4 };
    byte[] arrayOfByte2 = Utils.getHashWithPrefix(arrayOfByte1, sNTRUPrimePublicKeyParameters.getEncoded());
    byte[] arrayOfByte3 = new byte[i];
    Utils.getRandomShortPolynomial(this.random, arrayOfByte3, i, k);
    byte[] arrayOfByte4 = new byte[(i + 3) / 4];
    Utils.getEncodedSmallPolynomial(arrayOfByte4, arrayOfByte3, i);
    short[] arrayOfShort1 = new short[i];
    Utils.getDecodedPolynomial(arrayOfShort1, sNTRUPrimePublicKeyParameters.getEncH(), i, j);
    short[] arrayOfShort2 = new short[i];
    Utils.multiplicationInRQ(arrayOfShort2, arrayOfShort1, arrayOfByte3, i, j);
    short[] arrayOfShort3 = new short[i];
    Utils.roundPolynomial(arrayOfShort3, arrayOfShort2);
    byte[] arrayOfByte5 = new byte[m];
    Utils.getRoundedEncodedPolynomial(arrayOfByte5, arrayOfShort3, i, j);
    byte[] arrayOfByte6 = { 3 };
    byte[] arrayOfByte7 = Utils.getHashWithPrefix(arrayOfByte6, arrayOfByte4);
    byte[] arrayOfByte8 = new byte[arrayOfByte7.length / 2 + arrayOfByte2.length / 2];
    System.arraycopy(arrayOfByte7, 0, arrayOfByte8, 0, arrayOfByte7.length / 2);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte8, arrayOfByte7.length / 2, arrayOfByte2.length / 2);
    byte[] arrayOfByte9 = { 2 };
    byte[] arrayOfByte10 = Utils.getHashWithPrefix(arrayOfByte9, arrayOfByte8);
    byte[] arrayOfByte11 = new byte[arrayOfByte5.length + arrayOfByte10.length / 2];
    System.arraycopy(arrayOfByte5, 0, arrayOfByte11, 0, arrayOfByte5.length);
    System.arraycopy(arrayOfByte10, 0, arrayOfByte11, arrayOfByte5.length, arrayOfByte10.length / 2);
    byte[] arrayOfByte12 = { 3 };
    byte[] arrayOfByte13 = Utils.getHashWithPrefix(arrayOfByte12, arrayOfByte4);
    byte[] arrayOfByte14 = new byte[arrayOfByte13.length / 2 + arrayOfByte11.length];
    System.arraycopy(arrayOfByte13, 0, arrayOfByte14, 0, arrayOfByte13.length / 2);
    System.arraycopy(arrayOfByte11, 0, arrayOfByte14, arrayOfByte13.length / 2, arrayOfByte11.length);
    byte[] arrayOfByte15 = { 1 };
    byte[] arrayOfByte16 = Utils.getHashWithPrefix(arrayOfByte15, arrayOfByte14);
    byte[] arrayOfByte17 = Arrays.copyOfRange(arrayOfByte16, 0, sNTRUPrimeParameters.getSessionKeySize() / 8);
    return (SecretWithEncapsulation)new SecretWithEncapsulationImpl(arrayOfByte17, arrayOfByte11);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntruprime\SNTRUPrimeKEMGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */