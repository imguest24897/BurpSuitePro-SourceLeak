package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.util.Arrays;

public class SNTRUPrimeKEMExtractor implements EncapsulatedSecretExtractor {
  private final SNTRUPrimePrivateKeyParameters privateKey;
  
  public SNTRUPrimeKEMExtractor(SNTRUPrimePrivateKeyParameters paramSNTRUPrimePrivateKeyParameters) {
    this.privateKey = paramSNTRUPrimePrivateKeyParameters;
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte) {
    SNTRUPrimeParameters sNTRUPrimeParameters = this.privateKey.getParameters();
    int i = sNTRUPrimeParameters.getP();
    int j = sNTRUPrimeParameters.getQ();
    int k = sNTRUPrimeParameters.getW();
    int m = sNTRUPrimeParameters.getRoundedPolynomialBytes();
    byte[] arrayOfByte1 = new byte[i];
    Utils.getDecodedSmallPolynomial(arrayOfByte1, this.privateKey.getF(), i);
    byte[] arrayOfByte2 = new byte[i];
    Utils.getDecodedSmallPolynomial(arrayOfByte2, this.privateKey.getGinv(), i);
    short[] arrayOfShort1 = new short[i];
    Utils.getRoundedDecodedPolynomial(arrayOfShort1, paramArrayOfbyte, i, j);
    short[] arrayOfShort2 = new short[i];
    Utils.multiplicationInRQ(arrayOfShort2, arrayOfShort1, arrayOfByte1, i, j);
    short[] arrayOfShort3 = new short[i];
    Utils.scalarMultiplicationInRQ(arrayOfShort3, arrayOfShort2, 3, j);
    byte[] arrayOfByte3 = new byte[i];
    Utils.transformRQToR3(arrayOfByte3, arrayOfShort3);
    byte[] arrayOfByte4 = new byte[i];
    Utils.multiplicationInR3(arrayOfByte4, arrayOfByte3, arrayOfByte2, i);
    byte[] arrayOfByte5 = new byte[i];
    Utils.checkForSmallPolynomial(arrayOfByte5, arrayOfByte4, i, k);
    byte[] arrayOfByte6 = new byte[(i + 3) / 4];
    Utils.getEncodedSmallPolynomial(arrayOfByte6, arrayOfByte5, i);
    short[] arrayOfShort4 = new short[i];
    Utils.getDecodedPolynomial(arrayOfShort4, this.privateKey.getPk(), i, j);
    short[] arrayOfShort5 = new short[i];
    Utils.multiplicationInRQ(arrayOfShort5, arrayOfShort4, arrayOfByte5, i, j);
    short[] arrayOfShort6 = new short[i];
    Utils.roundPolynomial(arrayOfShort6, arrayOfShort5);
    byte[] arrayOfByte7 = new byte[m];
    Utils.getRoundedEncodedPolynomial(arrayOfByte7, arrayOfShort6, i, j);
    byte[] arrayOfByte8 = { 3 };
    byte[] arrayOfByte9 = Utils.getHashWithPrefix(arrayOfByte8, arrayOfByte6);
    byte[] arrayOfByte10 = new byte[arrayOfByte9.length / 2 + (this.privateKey.getHash()).length];
    System.arraycopy(arrayOfByte9, 0, arrayOfByte10, 0, arrayOfByte9.length / 2);
    System.arraycopy(this.privateKey.getHash(), 0, arrayOfByte10, arrayOfByte9.length / 2, (this.privateKey.getHash()).length);
    byte[] arrayOfByte11 = { 2 };
    byte[] arrayOfByte12 = Utils.getHashWithPrefix(arrayOfByte11, arrayOfByte10);
    byte[] arrayOfByte13 = new byte[arrayOfByte7.length + arrayOfByte12.length / 2];
    System.arraycopy(arrayOfByte7, 0, arrayOfByte13, 0, arrayOfByte7.length);
    System.arraycopy(arrayOfByte12, 0, arrayOfByte13, arrayOfByte7.length, arrayOfByte12.length / 2);
    byte b = Arrays.areEqual(paramArrayOfbyte, arrayOfByte13) ? 0 : -1;
    Utils.updateDiffMask(arrayOfByte6, this.privateKey.getRho(), b);
    byte[] arrayOfByte14 = { 3 };
    byte[] arrayOfByte15 = Utils.getHashWithPrefix(arrayOfByte14, arrayOfByte6);
    byte[] arrayOfByte16 = new byte[arrayOfByte15.length / 2 + arrayOfByte13.length];
    System.arraycopy(arrayOfByte15, 0, arrayOfByte16, 0, arrayOfByte15.length / 2);
    System.arraycopy(arrayOfByte13, 0, arrayOfByte16, arrayOfByte15.length / 2, arrayOfByte13.length);
    byte[] arrayOfByte17 = { (byte)(b + 1) };
    byte[] arrayOfByte18 = Utils.getHashWithPrefix(arrayOfByte17, arrayOfByte16);
    return Arrays.copyOfRange(arrayOfByte18, 0, sNTRUPrimeParameters.getSessionKeySize() / 8);
  }
  
  public int getEncapsulationLength() {
    return this.privateKey.getParameters().getRoundedPolynomialBytes() + 32;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntruprime\SNTRUPrimeKEMExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */