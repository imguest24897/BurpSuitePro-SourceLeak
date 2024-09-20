package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.util.Arrays;

class RainbowKeyComputation {
  private SecureRandom random;
  
  private Version version;
  
  private RainbowParameters rainbowParams;
  
  ComputeInField cf = new ComputeInField();
  
  private int v1;
  
  private int o1;
  
  private int o2;
  
  private byte[] sk_seed;
  
  private byte[] pk_seed;
  
  private short[][] s1;
  
  private short[][] t1;
  
  private short[][] t2;
  
  private short[][] t3;
  
  private short[][] t4;
  
  private short[][][] l1_F1;
  
  private short[][][] l1_F2;
  
  private short[][][] l2_F1;
  
  private short[][][] l2_F2;
  
  private short[][][] l2_F3;
  
  private short[][][] l2_F5;
  
  private short[][][] l2_F6;
  
  private short[][][] l1_Q1;
  
  private short[][][] l1_Q2;
  
  private short[][][] l1_Q3;
  
  private short[][][] l1_Q5;
  
  private short[][][] l1_Q6;
  
  private short[][][] l1_Q9;
  
  private short[][][] l2_Q1;
  
  private short[][][] l2_Q2;
  
  private short[][][] l2_Q3;
  
  private short[][][] l2_Q5;
  
  private short[][][] l2_Q6;
  
  private short[][][] l2_Q9;
  
  public RainbowKeyComputation(RainbowParameters paramRainbowParameters, SecureRandom paramSecureRandom) {
    this.rainbowParams = paramRainbowParameters;
    this.random = paramSecureRandom;
    this.version = this.rainbowParams.getVersion();
    this.v1 = this.rainbowParams.getV1();
    this.o1 = this.rainbowParams.getO1();
    this.o2 = this.rainbowParams.getO2();
  }
  
  public RainbowKeyComputation(RainbowParameters paramRainbowParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.rainbowParams = paramRainbowParameters;
    this.random = null;
    this.version = this.rainbowParams.getVersion();
    this.pk_seed = paramArrayOfbyte1;
    this.sk_seed = paramArrayOfbyte2;
    this.v1 = this.rainbowParams.getV1();
    this.o1 = this.rainbowParams.getO1();
    this.o2 = this.rainbowParams.getO2();
  }
  
  private void generate_S_and_T(SecureRandom paramSecureRandom) {
    this.s1 = RainbowUtil.generate_random_2d(paramSecureRandom, this.o1, this.o2);
    this.t1 = RainbowUtil.generate_random_2d(paramSecureRandom, this.v1, this.o1);
    this.t2 = RainbowUtil.generate_random_2d(paramSecureRandom, this.v1, this.o2);
    this.t3 = RainbowUtil.generate_random_2d(paramSecureRandom, this.o1, this.o2);
  }
  
  private void generate_B1_and_B2(SecureRandom paramSecureRandom) {
    this.l1_Q1 = RainbowUtil.generate_random(paramSecureRandom, this.o1, this.v1, this.v1, true);
    this.l1_Q2 = RainbowUtil.generate_random(paramSecureRandom, this.o1, this.v1, this.o1, false);
    this.l2_Q1 = RainbowUtil.generate_random(paramSecureRandom, this.o2, this.v1, this.v1, true);
    this.l2_Q2 = RainbowUtil.generate_random(paramSecureRandom, this.o2, this.v1, this.o1, false);
    this.l2_Q3 = RainbowUtil.generate_random(paramSecureRandom, this.o2, this.v1, this.o2, false);
    this.l2_Q5 = RainbowUtil.generate_random(paramSecureRandom, this.o2, this.o1, this.o1, true);
    this.l2_Q6 = RainbowUtil.generate_random(paramSecureRandom, this.o2, this.o1, this.o2, false);
  }
  
  private void calculate_t4() {
    short[][] arrayOfShort = this.cf.multiplyMatrix(this.t1, this.t3);
    this.t4 = this.cf.addMatrix(arrayOfShort, this.t2);
  }
  
  private void calculate_F_from_Q() {
    this.l1_F1 = RainbowUtil.cloneArray(this.l1_Q1);
    this.l1_F2 = new short[this.o1][][];
    byte b;
    for (b = 0; b < this.o1; b++) {
      this.l1_F2[b] = this.cf.addMatrixTranspose(this.l1_Q1[b]);
      this.l1_F2[b] = this.cf.multiplyMatrix(this.l1_F2[b], this.t1);
      this.l1_F2[b] = this.cf.addMatrix(this.l1_F2[b], this.l1_Q2[b]);
    } 
    this.l2_F2 = new short[this.o2][][];
    this.l2_F3 = new short[this.o2][][];
    this.l2_F5 = new short[this.o2][][];
    this.l2_F6 = new short[this.o2][][];
    this.l2_F1 = RainbowUtil.cloneArray(this.l2_Q1);
    for (b = 0; b < this.o2; b++) {
      short[][] arrayOfShort1 = this.cf.addMatrixTranspose(this.l2_Q1[b]);
      this.l2_F2[b] = this.cf.multiplyMatrix(arrayOfShort1, this.t1);
      this.l2_F2[b] = this.cf.addMatrix(this.l2_F2[b], this.l2_Q2[b]);
      this.l2_F3[b] = this.cf.multiplyMatrix(arrayOfShort1, this.t4);
      short[][] arrayOfShort2 = this.cf.multiplyMatrix(this.l2_Q2[b], this.t3);
      this.l2_F3[b] = this.cf.addMatrix(this.l2_F3[b], arrayOfShort2);
      this.l2_F3[b] = this.cf.addMatrix(this.l2_F3[b], this.l2_Q3[b]);
      arrayOfShort2 = this.cf.multiplyMatrix(this.l2_Q1[b], this.t1);
      arrayOfShort2 = this.cf.addMatrix(arrayOfShort2, this.l2_Q2[b]);
      short[][] arrayOfShort3 = this.cf.transpose(this.t1);
      this.l2_F5[b] = this.cf.multiplyMatrix(arrayOfShort3, arrayOfShort2);
      this.l2_F5[b] = this.cf.addMatrix(this.l2_F5[b], this.l2_Q5[b]);
      this.l2_F5[b] = this.cf.to_UT(this.l2_F5[b]);
      this.l2_F6[b] = this.cf.multiplyMatrix(arrayOfShort3, this.l2_F3[b]);
      arrayOfShort2 = this.cf.multiplyMatrix(this.cf.transpose(this.l2_Q2[b]), this.t4);
      this.l2_F6[b] = this.cf.addMatrix(this.l2_F6[b], arrayOfShort2);
      arrayOfShort2 = this.cf.addMatrixTranspose(this.l2_Q5[b]);
      arrayOfShort2 = this.cf.multiplyMatrix(arrayOfShort2, this.t3);
      this.l2_F6[b] = this.cf.addMatrix(this.l2_F6[b], arrayOfShort2);
      this.l2_F6[b] = this.cf.addMatrix(this.l2_F6[b], this.l2_Q6[b]);
    } 
  }
  
  private void calculate_Q_from_F() {
    short[][] arrayOfShort1 = this.cf.transpose(this.t1);
    short[][] arrayOfShort2 = this.cf.transpose(this.t2);
    this.l1_Q1 = RainbowUtil.cloneArray(this.l1_F1);
    this.l1_Q2 = new short[this.o1][][];
    for (byte b1 = 0; b1 < this.o1; b1++) {
      this.l1_Q2[b1] = this.cf.addMatrixTranspose(this.l1_F1[b1]);
      this.l1_Q2[b1] = this.cf.multiplyMatrix(this.l1_Q2[b1], this.t1);
      this.l1_Q2[b1] = this.cf.addMatrix(this.l1_Q2[b1], this.l1_F2[b1]);
    } 
    calculate_l1_Q3569(arrayOfShort1, arrayOfShort2);
    this.l2_Q2 = new short[this.o2][][];
    this.l2_Q3 = new short[this.o2][][];
    this.l2_Q5 = new short[this.o2][][];
    this.l2_Q6 = new short[this.o2][][];
    this.l2_Q1 = RainbowUtil.cloneArray(this.l2_F1);
    for (byte b2 = 0; b2 < this.o2; b2++) {
      short[][] arrayOfShort3 = this.cf.addMatrixTranspose(this.l2_F1[b2]);
      this.l2_Q2[b2] = this.cf.multiplyMatrix(arrayOfShort3, this.t1);
      this.l2_Q2[b2] = this.cf.addMatrix(this.l2_Q2[b2], this.l2_F2[b2]);
      this.l2_Q3[b2] = this.cf.multiplyMatrix(arrayOfShort3, this.t2);
      short[][] arrayOfShort4 = this.cf.multiplyMatrix(this.l2_F2[b2], this.t3);
      this.l2_Q3[b2] = this.cf.addMatrix(this.l2_Q3[b2], arrayOfShort4);
      this.l2_Q3[b2] = this.cf.addMatrix(this.l2_Q3[b2], this.l2_F3[b2]);
      arrayOfShort4 = this.cf.multiplyMatrix(this.l2_F1[b2], this.t1);
      arrayOfShort4 = this.cf.addMatrix(arrayOfShort4, this.l2_F2[b2]);
      this.l2_Q5[b2] = this.cf.multiplyMatrix(arrayOfShort1, arrayOfShort4);
      this.l2_Q5[b2] = this.cf.addMatrix(this.l2_Q5[b2], this.l2_F5[b2]);
      this.l2_Q5[b2] = this.cf.to_UT(this.l2_Q5[b2]);
      this.l2_Q6[b2] = this.cf.multiplyMatrix(arrayOfShort1, this.l2_Q3[b2]);
      arrayOfShort4 = this.cf.multiplyMatrix(this.cf.transpose(this.l2_F2[b2]), this.t2);
      this.l2_Q6[b2] = this.cf.addMatrix(this.l2_Q6[b2], arrayOfShort4);
      arrayOfShort4 = this.cf.addMatrixTranspose(this.l2_F5[b2]);
      arrayOfShort4 = this.cf.multiplyMatrix(arrayOfShort4, this.t3);
      this.l2_Q6[b2] = this.cf.addMatrix(this.l2_Q6[b2], arrayOfShort4);
      this.l2_Q6[b2] = this.cf.addMatrix(this.l2_Q6[b2], this.l2_F6[b2]);
    } 
    calculate_l2_Q9(arrayOfShort2);
  }
  
  private void calculate_Q_from_F_cyclic() {
    short[][] arrayOfShort1 = this.cf.transpose(this.t1);
    short[][] arrayOfShort2 = this.cf.transpose(this.t2);
    calculate_l1_Q3569(arrayOfShort1, arrayOfShort2);
    calculate_l2_Q9(arrayOfShort2);
  }
  
  private void calculate_l1_Q3569(short[][] paramArrayOfshort1, short[][] paramArrayOfshort2) {
    this.l1_Q3 = new short[this.o1][][];
    this.l1_Q5 = new short[this.o1][][];
    this.l1_Q6 = new short[this.o1][][];
    this.l1_Q9 = new short[this.o1][][];
    for (byte b = 0; b < this.o1; b++) {
      short[][] arrayOfShort1 = this.cf.multiplyMatrix(this.l1_F2[b], this.t3);
      this.l1_Q3[b] = this.cf.addMatrixTranspose(this.l1_F1[b]);
      this.l1_Q3[b] = this.cf.multiplyMatrix(this.l1_Q3[b], this.t2);
      this.l1_Q3[b] = this.cf.addMatrix(this.l1_Q3[b], arrayOfShort1);
      this.l1_Q5[b] = this.cf.multiplyMatrix(this.l1_F1[b], this.t1);
      this.l1_Q5[b] = this.cf.addMatrix(this.l1_Q5[b], this.l1_F2[b]);
      this.l1_Q5[b] = this.cf.multiplyMatrix(paramArrayOfshort1, this.l1_Q5[b]);
      this.l1_Q5[b] = this.cf.to_UT(this.l1_Q5[b]);
      short[][] arrayOfShort2 = this.cf.multiplyMatrix(this.cf.transpose(this.l1_F2[b]), this.t2);
      this.l1_Q6[b] = this.cf.multiplyMatrix(paramArrayOfshort1, this.l1_Q3[b]);
      this.l1_Q6[b] = this.cf.addMatrix(this.l1_Q6[b], arrayOfShort2);
      arrayOfShort2 = this.cf.multiplyMatrix(this.l1_F1[b], this.t2);
      this.l1_Q9[b] = this.cf.addMatrix(arrayOfShort2, arrayOfShort1);
      this.l1_Q9[b] = this.cf.multiplyMatrix(paramArrayOfshort2, this.l1_Q9[b]);
      this.l1_Q9[b] = this.cf.to_UT(this.l1_Q9[b]);
    } 
  }
  
  private void calculate_l2_Q9(short[][] paramArrayOfshort) {
    this.l2_Q9 = new short[this.o2][][];
    for (byte b = 0; b < this.o2; b++) {
      this.l2_Q9[b] = this.cf.multiplyMatrix(this.l2_F1[b], this.t2);
      short[][] arrayOfShort = this.cf.multiplyMatrix(this.l2_F2[b], this.t3);
      this.l2_Q9[b] = this.cf.addMatrix(this.l2_Q9[b], arrayOfShort);
      this.l2_Q9[b] = this.cf.addMatrix(this.l2_Q9[b], this.l2_F3[b]);
      this.l2_Q9[b] = this.cf.multiplyMatrix(paramArrayOfshort, this.l2_Q9[b]);
      arrayOfShort = this.cf.multiplyMatrix(this.l2_F5[b], this.t3);
      arrayOfShort = this.cf.addMatrix(arrayOfShort, this.l2_F6[b]);
      arrayOfShort = this.cf.multiplyMatrix(this.cf.transpose(this.t3), arrayOfShort);
      this.l2_Q9[b] = this.cf.addMatrix(this.l2_Q9[b], arrayOfShort);
      this.l2_Q9[b] = this.cf.to_UT(this.l2_Q9[b]);
    } 
  }
  
  private void genKeyMaterial() {
    this.sk_seed = new byte[this.rainbowParams.getLen_skseed()];
    this.random.nextBytes(this.sk_seed);
    RainbowDRBG rainbowDRBG = new RainbowDRBG(this.sk_seed, this.rainbowParams.getHash_algo());
    generate_S_and_T(rainbowDRBG);
    this.l1_F1 = RainbowUtil.generate_random(rainbowDRBG, this.o1, this.v1, this.v1, true);
    this.l1_F2 = RainbowUtil.generate_random(rainbowDRBG, this.o1, this.v1, this.o1, false);
    this.l2_F1 = RainbowUtil.generate_random(rainbowDRBG, this.o2, this.v1, this.v1, true);
    this.l2_F2 = RainbowUtil.generate_random(rainbowDRBG, this.o2, this.v1, this.o1, false);
    this.l2_F3 = RainbowUtil.generate_random(rainbowDRBG, this.o2, this.v1, this.o2, false);
    this.l2_F5 = RainbowUtil.generate_random(rainbowDRBG, this.o2, this.o1, this.o1, true);
    this.l2_F6 = RainbowUtil.generate_random(rainbowDRBG, this.o2, this.o1, this.o2, false);
    calculate_Q_from_F();
    calculate_t4();
    this.l1_Q1 = this.cf.obfuscate_l1_polys(this.s1, this.l2_Q1, this.l1_Q1);
    this.l1_Q2 = this.cf.obfuscate_l1_polys(this.s1, this.l2_Q2, this.l1_Q2);
    this.l1_Q3 = this.cf.obfuscate_l1_polys(this.s1, this.l2_Q3, this.l1_Q3);
    this.l1_Q5 = this.cf.obfuscate_l1_polys(this.s1, this.l2_Q5, this.l1_Q5);
    this.l1_Q6 = this.cf.obfuscate_l1_polys(this.s1, this.l2_Q6, this.l1_Q6);
    this.l1_Q9 = this.cf.obfuscate_l1_polys(this.s1, this.l2_Q9, this.l1_Q9);
  }
  
  private void genPrivateKeyMaterial_cyclic() {
    RainbowDRBG rainbowDRBG1 = new RainbowDRBG(this.sk_seed, this.rainbowParams.getHash_algo());
    RainbowDRBG rainbowDRBG2 = new RainbowDRBG(this.pk_seed, this.rainbowParams.getHash_algo());
    generate_S_and_T(rainbowDRBG1);
    calculate_t4();
    generate_B1_and_B2(rainbowDRBG2);
    this.l1_Q1 = this.cf.obfuscate_l1_polys(this.s1, this.l2_Q1, this.l1_Q1);
    this.l1_Q2 = this.cf.obfuscate_l1_polys(this.s1, this.l2_Q2, this.l1_Q2);
    calculate_F_from_Q();
  }
  
  private void genKeyMaterial_cyclic() {
    this.sk_seed = new byte[this.rainbowParams.getLen_skseed()];
    this.random.nextBytes(this.sk_seed);
    this.pk_seed = new byte[this.rainbowParams.getLen_pkseed()];
    this.random.nextBytes(this.pk_seed);
    genPrivateKeyMaterial_cyclic();
    calculate_Q_from_F_cyclic();
    this.l1_Q3 = this.cf.obfuscate_l1_polys(this.s1, this.l2_Q3, this.l1_Q3);
    this.l1_Q5 = this.cf.obfuscate_l1_polys(this.s1, this.l2_Q5, this.l1_Q5);
    this.l1_Q6 = this.cf.obfuscate_l1_polys(this.s1, this.l2_Q6, this.l1_Q6);
    this.l1_Q9 = this.cf.obfuscate_l1_polys(this.s1, this.l2_Q9, this.l1_Q9);
  }
  
  public AsymmetricCipherKeyPair genKeyPairClassical() {
    genKeyMaterial();
    RainbowPublicKeyParameters rainbowPublicKeyParameters = new RainbowPublicKeyParameters(this.rainbowParams, this.l1_Q1, this.l1_Q2, this.l1_Q3, this.l1_Q5, this.l1_Q6, this.l1_Q9, this.l2_Q1, this.l2_Q2, this.l2_Q3, this.l2_Q5, this.l2_Q6, this.l2_Q9);
    RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.rainbowParams, this.sk_seed, this.s1, this.t1, this.t3, this.t4, this.l1_F1, this.l1_F2, this.l2_F1, this.l2_F2, this.l2_F3, this.l2_F5, this.l2_F6, rainbowPublicKeyParameters.getEncoded());
    return new AsymmetricCipherKeyPair(rainbowPublicKeyParameters, rainbowPrivateKeyParameters);
  }
  
  public AsymmetricCipherKeyPair genKeyPairCircumzenithal() {
    genKeyMaterial_cyclic();
    RainbowPublicKeyParameters rainbowPublicKeyParameters = new RainbowPublicKeyParameters(this.rainbowParams, this.pk_seed, this.l1_Q3, this.l1_Q5, this.l1_Q6, this.l1_Q9, this.l2_Q9);
    RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.rainbowParams, this.sk_seed, this.s1, this.t1, this.t3, this.t4, this.l1_F1, this.l1_F2, this.l2_F1, this.l2_F2, this.l2_F3, this.l2_F5, this.l2_F6, rainbowPublicKeyParameters.getEncoded());
    return new AsymmetricCipherKeyPair(rainbowPublicKeyParameters, rainbowPrivateKeyParameters);
  }
  
  public AsymmetricCipherKeyPair genKeyPairCompressed() {
    genKeyMaterial_cyclic();
    RainbowPublicKeyParameters rainbowPublicKeyParameters = new RainbowPublicKeyParameters(this.rainbowParams, this.pk_seed, this.l1_Q3, this.l1_Q5, this.l1_Q6, this.l1_Q9, this.l2_Q9);
    RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.rainbowParams, this.pk_seed, this.sk_seed, rainbowPublicKeyParameters.getEncoded());
    return new AsymmetricCipherKeyPair(rainbowPublicKeyParameters, rainbowPrivateKeyParameters);
  }
  
  RainbowPrivateKeyParameters generatePrivateKey() {
    this.sk_seed = Arrays.clone(this.sk_seed);
    this.pk_seed = Arrays.clone(this.pk_seed);
    genPrivateKeyMaterial_cyclic();
    return new RainbowPrivateKeyParameters(this.rainbowParams, this.sk_seed, this.s1, this.t1, this.t3, this.t4, this.l1_F1, this.l1_F2, this.l2_F1, this.l2_F2, this.l2_F3, this.l2_F5, this.l2_F6, null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\rainbow\RainbowKeyComputation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */