package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;

public class RainbowSigner implements MessageSigner {
  private static final int MAXITS = 65536;
  
  private SecureRandom random;
  
  int signableDocumentLength;
  
  private ComputeInField cf = new ComputeInField();
  
  private RainbowKeyParameters key;
  
  private Digest hashAlgo;
  
  private Version version;
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    if (paramBoolean) {
      RainbowKeyParameters rainbowKeyParameters;
      if (paramCipherParameters instanceof ParametersWithRandom) {
        ParametersWithRandom parametersWithRandom = (ParametersWithRandom)paramCipherParameters;
        this.random = parametersWithRandom.getRandom();
        rainbowKeyParameters = (RainbowKeyParameters)parametersWithRandom.getParameters();
      } else {
        rainbowKeyParameters = (RainbowKeyParameters)paramCipherParameters;
        SecureRandom secureRandom = CryptoServicesRegistrar.getSecureRandom();
        byte[] arrayOfByte = new byte[rainbowKeyParameters.getParameters().getLen_skseed()];
        secureRandom.nextBytes(arrayOfByte);
        this.random = new RainbowDRBG(arrayOfByte, rainbowKeyParameters.getParameters().getHash_algo());
      } 
      this.version = rainbowKeyParameters.getParameters().getVersion();
      this.key = rainbowKeyParameters;
    } else {
      this.key = (RainbowKeyParameters)paramCipherParameters;
      this.version = this.key.getParameters().getVersion();
    } 
    this.signableDocumentLength = this.key.getDocLength();
    this.hashAlgo = this.key.getParameters().getHash_algo();
  }
  
  private byte[] genSignature(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = new byte[this.hashAlgo.getDigestSize()];
    this.hashAlgo.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    this.hashAlgo.doFinal(arrayOfByte1, 0);
    int i = this.key.getParameters().getV1();
    int j = this.key.getParameters().getO1();
    int k = this.key.getParameters().getO2();
    int m = this.key.getParameters().getM();
    int n = this.key.getParameters().getN();
    RainbowPrivateKeyParameters rainbowPrivateKeyParameters = (RainbowPrivateKeyParameters)this.key;
    byte[] arrayOfByte2 = RainbowUtil.hash(this.hashAlgo, rainbowPrivateKeyParameters.sk_seed, arrayOfByte1, new byte[this.hashAlgo.getDigestSize()]);
    this.random = new RainbowDRBG(arrayOfByte2, rainbowPrivateKeyParameters.getParameters().getHash_algo());
    short[] arrayOfShort1 = new short[i];
    short[][] arrayOfShort2 = null;
    short[] arrayOfShort3 = new short[j];
    short[] arrayOfShort4 = new short[k];
    short[] arrayOfShort5 = new short[k];
    short[][] arrayOfShort6 = new short[k][j];
    short[][] arrayOfShort7 = new short[k][k];
    byte[] arrayOfByte3 = new byte[rainbowPrivateKeyParameters.getParameters().getLen_salt()];
    short[] arrayOfShort8 = new short[m];
    short[] arrayOfShort9 = new short[j];
    short[] arrayOfShort10 = null;
    byte b1;
    for (b1 = 0; arrayOfShort2 == null && b1 < 65536; b1++) {
      byte[] arrayOfByte = new byte[i];
      this.random.nextBytes(arrayOfByte);
      byte b;
      for (b = 0; b < i; b++)
        arrayOfShort1[b] = (short)(arrayOfByte[b] & 0xFF); 
      arrayOfShort2 = new short[j][j];
      for (b = 0; b < i; b++) {
        for (byte b3 = 0; b3 < j; b3++) {
          for (byte b4 = 0; b4 < j; b4++) {
            short s = GF2Field.multElem(rainbowPrivateKeyParameters.l1_F2[b3][b][b4], arrayOfShort1[b]);
            arrayOfShort2[b3][b4] = GF2Field.addElem(arrayOfShort2[b3][b4], s);
          } 
        } 
      } 
      arrayOfShort2 = this.cf.inverse(arrayOfShort2);
    } 
    byte b2;
    for (b2 = 0; b2 < j; b2++)
      arrayOfShort3[b2] = this.cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l1_F1[b2], arrayOfShort1); 
    for (b2 = 0; b2 < i; b2++) {
      for (byte b = 0; b < k; b++) {
        arrayOfShort4[b] = this.cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l2_F1[b], arrayOfShort1);
        byte b3;
        for (b3 = 0; b3 < j; b3++) {
          short s = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F2[b][b2][b3], arrayOfShort1[b2]);
          arrayOfShort6[b][b3] = GF2Field.addElem(arrayOfShort6[b][b3], s);
        } 
        for (b3 = 0; b3 < k; b3++) {
          short s = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F3[b][b2][b3], arrayOfShort1[b2]);
          arrayOfShort7[b][b3] = GF2Field.addElem(arrayOfShort7[b][b3], s);
        } 
      } 
    } 
    byte[] arrayOfByte4 = new byte[m];
    while (arrayOfShort10 == null && b1 < 65536) {
      short[][] arrayOfShort = new short[k][k];
      this.random.nextBytes(arrayOfByte3);
      byte[] arrayOfByte = RainbowUtil.hash(this.hashAlgo, arrayOfByte1, arrayOfByte3, arrayOfByte4);
      short[] arrayOfShort13 = makeMessageRepresentative(arrayOfByte);
      short[] arrayOfShort14 = this.cf.multiplyMatrix(rainbowPrivateKeyParameters.s1, Arrays.copyOfRange(arrayOfShort13, j, m));
      arrayOfShort14 = this.cf.addVect(Arrays.copyOf(arrayOfShort13, j), arrayOfShort14);
      System.arraycopy(arrayOfShort14, 0, arrayOfShort8, 0, j);
      System.arraycopy(arrayOfShort13, j, arrayOfShort8, j, k);
      arrayOfShort14 = this.cf.addVect(arrayOfShort3, Arrays.copyOf(arrayOfShort8, j));
      arrayOfShort9 = this.cf.multiplyMatrix(arrayOfShort2, arrayOfShort14);
      arrayOfShort14 = this.cf.multiplyMatrix(arrayOfShort6, arrayOfShort9);
      byte b;
      for (b = 0; b < k; b++)
        arrayOfShort5[b] = this.cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l2_F5[b], arrayOfShort9); 
      arrayOfShort14 = this.cf.addVect(arrayOfShort14, arrayOfShort5);
      arrayOfShort14 = this.cf.addVect(arrayOfShort14, arrayOfShort4);
      arrayOfShort14 = this.cf.addVect(arrayOfShort14, Arrays.copyOfRange(arrayOfShort8, j, m));
      for (b = 0; b < j; b++) {
        for (byte b3 = 0; b3 < k; b3++) {
          for (byte b4 = 0; b4 < k; b4++) {
            short s = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F6[b3][b][b4], arrayOfShort9[b]);
            arrayOfShort[b3][b4] = GF2Field.addElem(arrayOfShort[b3][b4], s);
          } 
        } 
      } 
      arrayOfShort = this.cf.addMatrix(arrayOfShort, arrayOfShort7);
      arrayOfShort10 = this.cf.solveEquation(arrayOfShort, arrayOfShort14);
      b1++;
    } 
    arrayOfShort10 = (arrayOfShort10 == null) ? new short[k] : arrayOfShort10;
    short[] arrayOfShort12 = this.cf.multiplyMatrix(rainbowPrivateKeyParameters.t1, arrayOfShort9);
    short[] arrayOfShort11 = this.cf.addVect(arrayOfShort1, arrayOfShort12);
    arrayOfShort12 = this.cf.multiplyMatrix(rainbowPrivateKeyParameters.t4, arrayOfShort10);
    arrayOfShort11 = this.cf.addVect(arrayOfShort11, arrayOfShort12);
    arrayOfShort12 = this.cf.multiplyMatrix(rainbowPrivateKeyParameters.t3, arrayOfShort10);
    arrayOfShort12 = this.cf.addVect(arrayOfShort9, arrayOfShort12);
    arrayOfShort11 = Arrays.copyOf(arrayOfShort11, n);
    System.arraycopy(arrayOfShort12, 0, arrayOfShort11, i, j);
    System.arraycopy(arrayOfShort10, 0, arrayOfShort11, j + i, k);
    if (b1 == 65536)
      throw new IllegalStateException("unable to generate signature - LES not solvable"); 
    byte[] arrayOfByte5 = RainbowUtil.convertArray(arrayOfShort11);
    return Arrays.concatenate(arrayOfByte5, arrayOfByte3);
  }
  
  public byte[] generateSignature(byte[] paramArrayOfbyte) {
    return genSignature(paramArrayOfbyte);
  }
  
  public boolean verifySignature(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    short[] arrayOfShort3;
    RainbowPublicKeyParameters rainbowPublicKeyParameters1;
    RainbowPublicKeyParameters rainbowPublicKeyParameters2;
    byte[] arrayOfByte1 = new byte[this.hashAlgo.getDigestSize()];
    this.hashAlgo.update(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    this.hashAlgo.doFinal(arrayOfByte1, 0);
    int i = this.key.getParameters().getM();
    int j = this.key.getParameters().getN();
    RainbowPublicMap rainbowPublicMap = new RainbowPublicMap(this.key.getParameters());
    byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfbyte2, j, paramArrayOfbyte2.length);
    byte[] arrayOfByte3 = RainbowUtil.hash(this.hashAlgo, arrayOfByte1, arrayOfByte2, new byte[i]);
    short[] arrayOfShort1 = makeMessageRepresentative(arrayOfByte3);
    byte[] arrayOfByte4 = Arrays.copyOfRange(paramArrayOfbyte2, 0, j);
    short[] arrayOfShort2 = RainbowUtil.convertArray(arrayOfByte4);
    switch (this.version) {
      case CLASSIC:
        rainbowPublicKeyParameters1 = (RainbowPublicKeyParameters)this.key;
        arrayOfShort3 = rainbowPublicMap.publicMap(rainbowPublicKeyParameters1, arrayOfShort2);
        return RainbowUtil.equals(arrayOfShort1, arrayOfShort3);
      case CIRCUMZENITHAL:
      case COMPRESSED:
        rainbowPublicKeyParameters2 = (RainbowPublicKeyParameters)this.key;
        arrayOfShort3 = rainbowPublicMap.publicMap_cyclic(rainbowPublicKeyParameters2, arrayOfShort2);
        return RainbowUtil.equals(arrayOfShort1, arrayOfShort3);
    } 
    throw new IllegalArgumentException("No valid version. Please choose one of the following: classic, circumzenithal, compressed");
  }
  
  private short[] makeMessageRepresentative(byte[] paramArrayOfbyte) {
    short[] arrayOfShort = new short[this.signableDocumentLength];
    byte b1 = 0;
    byte b2 = 0;
    while (b2 < paramArrayOfbyte.length) {
      arrayOfShort[b2] = (short)(paramArrayOfbyte[b1] & 0xFF);
      b1++;
      if (++b2 >= arrayOfShort.length)
        break; 
    } 
    return arrayOfShort;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\rainbow\RainbowSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */