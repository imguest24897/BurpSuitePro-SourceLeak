package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.util.Arrays;

public class NTRULPRimeKEMExtractor implements EncapsulatedSecretExtractor {
  private final NTRULPRimePrivateKeyParameters privateKey;
  
  public NTRULPRimeKEMExtractor(NTRULPRimePrivateKeyParameters paramNTRULPRimePrivateKeyParameters) {
    this.privateKey = paramNTRULPRimePrivateKeyParameters;
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte) {
    NTRULPRimeParameters nTRULPRimeParameters = this.privateKey.getParameters();
    int i = nTRULPRimeParameters.getP();
    int j = nTRULPRimeParameters.getQ();
    int k = nTRULPRimeParameters.getW();
    int m = nTRULPRimeParameters.getRoundedPolynomialBytes();
    int n = nTRULPRimeParameters.getTau0();
    int i1 = nTRULPRimeParameters.getTau1();
    int i2 = nTRULPRimeParameters.getTau2();
    int i3 = nTRULPRimeParameters.getTau3();
    byte[] arrayOfByte1 = new byte[i];
    Utils.getDecodedSmallPolynomial(arrayOfByte1, this.privateKey.getEncoded(), i);
    byte[] arrayOfByte2 = new byte[m];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte2, 0, m);
    short[] arrayOfShort1 = new short[i];
    Utils.getRoundedDecodedPolynomial(arrayOfShort1, arrayOfByte2, i, j);
    byte[] arrayOfByte3 = new byte[128];
    System.arraycopy(paramArrayOfbyte, m, arrayOfByte3, 0, arrayOfByte3.length);
    byte[] arrayOfByte4 = new byte[256];
    Utils.getTopDecodedPolynomial(arrayOfByte4, arrayOfByte3);
    short[] arrayOfShort2 = new short[i];
    Utils.multiplicationInRQ(arrayOfShort2, arrayOfShort1, arrayOfByte1, i, j);
    byte[] arrayOfByte5 = new byte[256];
    Utils.right(arrayOfByte5, arrayOfShort2, arrayOfByte4, j, k, i2, i3);
    byte[] arrayOfByte6 = new byte[32];
    Utils.getEncodedInputs(arrayOfByte6, arrayOfByte5);
    byte[] arrayOfByte7 = new byte[nTRULPRimeParameters.getPublicKeyBytes() - 32];
    System.arraycopy(this.privateKey.getPk(), 32, arrayOfByte7, 0, arrayOfByte7.length);
    short[] arrayOfShort3 = new short[i];
    Utils.getRoundedDecodedPolynomial(arrayOfShort3, arrayOfByte7, i, j);
    byte[] arrayOfByte8 = new byte[32];
    System.arraycopy(this.privateKey.getPk(), 0, arrayOfByte8, 0, arrayOfByte8.length);
    short[] arrayOfShort4 = new short[i];
    Utils.generatePolynomialInRQFromSeed(arrayOfShort4, arrayOfByte8, i, j);
    byte[] arrayOfByte9 = { 5 };
    byte[] arrayOfByte10 = Utils.getHashWithPrefix(arrayOfByte9, arrayOfByte6);
    byte[] arrayOfByte11 = Arrays.copyOfRange(arrayOfByte10, 0, arrayOfByte10.length / 2);
    int[] arrayOfInt = new int[i];
    Utils.expand(arrayOfInt, arrayOfByte11);
    byte[] arrayOfByte12 = new byte[i];
    Utils.sortGenerateShortPolynomial(arrayOfByte12, arrayOfInt, i, k);
    short[] arrayOfShort5 = new short[i];
    Utils.multiplicationInRQ(arrayOfShort5, arrayOfShort4, arrayOfByte12, i, j);
    short[] arrayOfShort6 = new short[i];
    Utils.roundPolynomial(arrayOfShort6, arrayOfShort5);
    byte[] arrayOfByte13 = new byte[m];
    Utils.getRoundedEncodedPolynomial(arrayOfByte13, arrayOfShort6, i, j);
    short[] arrayOfShort7 = new short[i];
    Utils.multiplicationInRQ(arrayOfShort7, arrayOfShort3, arrayOfByte12, i, j);
    byte[] arrayOfByte14 = new byte[256];
    Utils.top(arrayOfByte14, arrayOfShort7, arrayOfByte5, j, n, i1);
    byte[] arrayOfByte15 = new byte[128];
    Utils.getTopEncodedPolynomial(arrayOfByte15, arrayOfByte4);
    byte[] arrayOfByte16 = new byte[arrayOfByte6.length + (this.privateKey.getHash()).length];
    System.arraycopy(arrayOfByte6, 0, arrayOfByte16, 0, arrayOfByte6.length);
    System.arraycopy(this.privateKey.getHash(), 0, arrayOfByte16, arrayOfByte6.length, (this.privateKey.getHash()).length);
    byte[] arrayOfByte17 = { 2 };
    byte[] arrayOfByte18 = Utils.getHashWithPrefix(arrayOfByte17, arrayOfByte16);
    byte[] arrayOfByte19 = new byte[arrayOfByte2.length + arrayOfByte3.length + arrayOfByte18.length / 2];
    System.arraycopy(arrayOfByte2, 0, arrayOfByte19, 0, arrayOfByte2.length);
    System.arraycopy(arrayOfByte3, 0, arrayOfByte19, arrayOfByte2.length, arrayOfByte3.length);
    System.arraycopy(arrayOfByte18, 0, arrayOfByte19, arrayOfByte2.length + arrayOfByte3.length, arrayOfByte18.length / 2);
    boolean bool = Arrays.areEqual(paramArrayOfbyte, arrayOfByte19) ? false : true;
    Utils.updateDiffMask(arrayOfByte6, this.privateKey.getRho(), bool);
    byte[] arrayOfByte20 = new byte[arrayOfByte6.length + arrayOfByte19.length];
    System.arraycopy(arrayOfByte6, 0, arrayOfByte20, 0, arrayOfByte6.length);
    System.arraycopy(arrayOfByte19, 0, arrayOfByte20, arrayOfByte6.length, arrayOfByte19.length);
    byte[] arrayOfByte21 = { 1 };
    byte[] arrayOfByte22 = Utils.getHashWithPrefix(arrayOfByte21, arrayOfByte20);
    return Arrays.copyOfRange(arrayOfByte22, 0, nTRULPRimeParameters.getSessionKeySize() / 8);
  }
  
  public int getEncapsulationLength() {
    return this.privateKey.getParameters().getRoundedPolynomialBytes() + 128 + 32;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntruprime\NTRULPRimeKEMExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */