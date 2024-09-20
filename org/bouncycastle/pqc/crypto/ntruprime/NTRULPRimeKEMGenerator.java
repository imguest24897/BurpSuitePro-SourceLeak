package org.bouncycastle.pqc.crypto.ntruprime;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;
import org.bouncycastle.util.Arrays;

public class NTRULPRimeKEMGenerator implements EncapsulatedSecretGenerator {
  private final SecureRandom random;
  
  public NTRULPRimeKEMGenerator(SecureRandom paramSecureRandom) {
    this.random = paramSecureRandom;
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    NTRULPRimePublicKeyParameters nTRULPRimePublicKeyParameters = (NTRULPRimePublicKeyParameters)paramAsymmetricKeyParameter;
    NTRULPRimeParameters nTRULPRimeParameters = nTRULPRimePublicKeyParameters.getParameters();
    int i = nTRULPRimeParameters.getP();
    int j = nTRULPRimeParameters.getQ();
    int k = nTRULPRimeParameters.getW();
    int m = nTRULPRimeParameters.getRoundedPolynomialBytes();
    int n = nTRULPRimeParameters.getTau0();
    int i1 = nTRULPRimeParameters.getTau1();
    byte[] arrayOfByte1 = { 4 };
    byte[] arrayOfByte2 = Utils.getHashWithPrefix(arrayOfByte1, nTRULPRimePublicKeyParameters.getEncoded());
    byte[] arrayOfByte3 = new byte[256];
    Utils.getRandomInputs(this.random, arrayOfByte3);
    byte[] arrayOfByte4 = new byte[32];
    Utils.getEncodedInputs(arrayOfByte4, arrayOfByte3);
    short[] arrayOfShort1 = new short[i];
    Utils.getRoundedDecodedPolynomial(arrayOfShort1, nTRULPRimePublicKeyParameters.getRoundEncA(), i, j);
    short[] arrayOfShort2 = new short[i];
    Utils.generatePolynomialInRQFromSeed(arrayOfShort2, nTRULPRimePublicKeyParameters.getSeed(), i, j);
    byte[] arrayOfByte5 = { 5 };
    byte[] arrayOfByte6 = Utils.getHashWithPrefix(arrayOfByte5, arrayOfByte4);
    byte[] arrayOfByte7 = Arrays.copyOfRange(arrayOfByte6, 0, arrayOfByte6.length / 2);
    int[] arrayOfInt = new int[i];
    Utils.expand(arrayOfInt, arrayOfByte7);
    byte[] arrayOfByte8 = new byte[i];
    Utils.sortGenerateShortPolynomial(arrayOfByte8, arrayOfInt, i, k);
    short[] arrayOfShort3 = new short[i];
    Utils.multiplicationInRQ(arrayOfShort3, arrayOfShort2, arrayOfByte8, i, j);
    short[] arrayOfShort4 = new short[i];
    Utils.roundPolynomial(arrayOfShort4, arrayOfShort3);
    byte[] arrayOfByte9 = new byte[m];
    Utils.getRoundedEncodedPolynomial(arrayOfByte9, arrayOfShort4, i, j);
    short[] arrayOfShort5 = new short[i];
    Utils.multiplicationInRQ(arrayOfShort5, arrayOfShort1, arrayOfByte8, i, j);
    byte[] arrayOfByte10 = new byte[256];
    Utils.top(arrayOfByte10, arrayOfShort5, arrayOfByte3, j, n, i1);
    byte[] arrayOfByte11 = new byte[128];
    Utils.getTopEncodedPolynomial(arrayOfByte11, arrayOfByte10);
    byte[] arrayOfByte12 = new byte[arrayOfByte4.length + arrayOfByte2.length / 2];
    System.arraycopy(arrayOfByte4, 0, arrayOfByte12, 0, arrayOfByte4.length);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte12, arrayOfByte4.length, arrayOfByte2.length / 2);
    byte[] arrayOfByte13 = { 2 };
    byte[] arrayOfByte14 = Utils.getHashWithPrefix(arrayOfByte13, arrayOfByte12);
    byte[] arrayOfByte15 = new byte[arrayOfByte9.length + arrayOfByte11.length + arrayOfByte14.length / 2];
    System.arraycopy(arrayOfByte9, 0, arrayOfByte15, 0, arrayOfByte9.length);
    System.arraycopy(arrayOfByte11, 0, arrayOfByte15, arrayOfByte9.length, arrayOfByte11.length);
    System.arraycopy(arrayOfByte14, 0, arrayOfByte15, arrayOfByte9.length + arrayOfByte11.length, arrayOfByte14.length / 2);
    byte[] arrayOfByte16 = new byte[arrayOfByte4.length + arrayOfByte15.length];
    System.arraycopy(arrayOfByte4, 0, arrayOfByte16, 0, arrayOfByte4.length);
    System.arraycopy(arrayOfByte15, 0, arrayOfByte16, arrayOfByte4.length, arrayOfByte15.length);
    byte[] arrayOfByte17 = { 1 };
    byte[] arrayOfByte18 = Utils.getHashWithPrefix(arrayOfByte17, arrayOfByte16);
    byte[] arrayOfByte19 = Arrays.copyOfRange(arrayOfByte18, 0, nTRULPRimeParameters.getSessionKeySize() / 8);
    return (SecretWithEncapsulation)new SecretWithEncapsulationImpl(arrayOfByte19, arrayOfByte15);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntruprime\NTRULPRimeKEMGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */