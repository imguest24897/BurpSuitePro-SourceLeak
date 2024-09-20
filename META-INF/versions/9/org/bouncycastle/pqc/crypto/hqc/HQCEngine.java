package META-INF.versions.9.org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.pqc.crypto.hqc.GF2PolynomialCalculator;
import org.bouncycastle.pqc.crypto.hqc.KeccakRandomGenerator;
import org.bouncycastle.pqc.crypto.hqc.ReedMuller;
import org.bouncycastle.pqc.crypto.hqc.ReedSolomon;
import org.bouncycastle.pqc.crypto.hqc.Utils;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

class HQCEngine {
  private int n;
  
  private int n1;
  
  private int n2;
  
  private int k;
  
  private int delta;
  
  private int w;
  
  private int wr;
  
  private int we;
  
  private int g;
  
  private int rejectionThreshold;
  
  private int fft;
  
  private int mulParam;
  
  private int SEED_SIZE = 40;
  
  private byte G_FCT_DOMAIN = 3;
  
  private byte H_FCT_DOMAIN = 4;
  
  private byte K_FCT_DOMAIN = 5;
  
  private int N_BYTE;
  
  private int n1n2;
  
  private int N_BYTE_64;
  
  private int K_BYTE;
  
  private int K_BYTE_64;
  
  private int N1_BYTE_64;
  
  private int N1N2_BYTE_64;
  
  private int N1N2_BYTE;
  
  private int N1_BYTE;
  
  private int GF_POLY_WT = 5;
  
  private int GF_POLY_M2 = 4;
  
  private int SALT_SIZE_BYTES = 16;
  
  private int SALT_SIZE_64 = 2;
  
  private int[] generatorPoly;
  
  private int SHA512_BYTES = 64;
  
  private long RED_MASK;
  
  private GF2PolynomialCalculator gfCalculator;
  
  public HQCEngine(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int[] paramArrayOfint) {
    this.n = paramInt1;
    this.k = paramInt4;
    this.delta = paramInt6;
    this.w = paramInt7;
    this.wr = paramInt8;
    this.we = paramInt9;
    this.n1 = paramInt2;
    this.n2 = paramInt3;
    this.n1n2 = paramInt2 * paramInt3;
    this.generatorPoly = paramArrayOfint;
    this.g = paramInt5;
    this.rejectionThreshold = paramInt10;
    this.fft = paramInt11;
    this.mulParam = (int)Math.ceil((paramInt3 / 128));
    this.N_BYTE = Utils.getByteSizeFromBitSize(paramInt1);
    this.K_BYTE = paramInt4;
    this.N_BYTE_64 = Utils.getByte64SizeFromBitSize(paramInt1);
    this.K_BYTE_64 = Utils.getByteSizeFromBitSize(paramInt4);
    this.N1_BYTE_64 = Utils.getByteSizeFromBitSize(paramInt2);
    this.N1N2_BYTE_64 = Utils.getByte64SizeFromBitSize(paramInt2 * paramInt3);
    this.N1N2_BYTE = Utils.getByteSizeFromBitSize(paramInt2 * paramInt3);
    this.N1_BYTE = Utils.getByteSizeFromBitSize(paramInt2);
    this.RED_MASK = (1L << (int)(paramInt1 % 64L)) - 1L;
    this.gfCalculator = new GF2PolynomialCalculator(this.N_BYTE_64, paramInt1, this.RED_MASK);
  }
  
  public void genKeyPair(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    byte[] arrayOfByte1 = new byte[this.SEED_SIZE];
    KeccakRandomGenerator keccakRandomGenerator1 = new KeccakRandomGenerator(256);
    keccakRandomGenerator1.randomGeneratorInit(paramArrayOfbyte3, null, paramArrayOfbyte3.length, 0);
    keccakRandomGenerator1.squeeze(arrayOfByte1, 40);
    KeccakRandomGenerator keccakRandomGenerator2 = new KeccakRandomGenerator(256);
    keccakRandomGenerator2.seedExpanderInit(arrayOfByte1, arrayOfByte1.length);
    long[] arrayOfLong1 = new long[this.N_BYTE_64];
    long[] arrayOfLong2 = new long[this.N_BYTE_64];
    generateRandomFixedWeight(arrayOfLong1, keccakRandomGenerator2, this.w);
    generateRandomFixedWeight(arrayOfLong2, keccakRandomGenerator2, this.w);
    byte[] arrayOfByte2 = new byte[this.SEED_SIZE];
    keccakRandomGenerator1.squeeze(arrayOfByte2, 40);
    KeccakRandomGenerator keccakRandomGenerator3 = new KeccakRandomGenerator(256);
    keccakRandomGenerator3.seedExpanderInit(arrayOfByte2, arrayOfByte2.length);
    long[] arrayOfLong3 = new long[this.N_BYTE_64];
    generatePublicKeyH(arrayOfLong3, keccakRandomGenerator3);
    long[] arrayOfLong4 = new long[this.N_BYTE_64];
    this.gfCalculator.multLongs(arrayOfLong4, arrayOfLong2, arrayOfLong3);
    GF2PolynomialCalculator.addLongs(arrayOfLong4, arrayOfLong4, arrayOfLong1);
    byte[] arrayOfByte3 = new byte[this.N_BYTE];
    Utils.fromLongArrayToByteArray(arrayOfByte3, arrayOfLong4);
    byte[] arrayOfByte4 = Arrays.concatenate(arrayOfByte2, arrayOfByte3);
    byte[] arrayOfByte5 = Arrays.concatenate(arrayOfByte1, arrayOfByte4);
    System.arraycopy(arrayOfByte4, 0, paramArrayOfbyte1, 0, arrayOfByte4.length);
    System.arraycopy(arrayOfByte5, 0, paramArrayOfbyte2, 0, arrayOfByte5.length);
  }
  
  public void encaps(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5, byte[] paramArrayOfbyte6, byte[] paramArrayOfbyte7) {
    byte[] arrayOfByte1 = new byte[this.K_BYTE];
    byte[] arrayOfByte2 = new byte[this.SEED_SIZE];
    KeccakRandomGenerator keccakRandomGenerator1 = new KeccakRandomGenerator(256);
    keccakRandomGenerator1.randomGeneratorInit(paramArrayOfbyte6, null, paramArrayOfbyte6.length, 0);
    keccakRandomGenerator1.squeeze(arrayOfByte2, 40);
    byte[] arrayOfByte3 = new byte[this.SEED_SIZE];
    keccakRandomGenerator1.squeeze(arrayOfByte3, 40);
    keccakRandomGenerator1.squeeze(arrayOfByte1, this.K_BYTE);
    byte[] arrayOfByte4 = new byte[this.SHA512_BYTES];
    byte[] arrayOfByte5 = new byte[this.K_BYTE + this.SEED_SIZE + this.SALT_SIZE_BYTES];
    keccakRandomGenerator1.squeeze(paramArrayOfbyte7, this.SALT_SIZE_BYTES);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte5, 0, arrayOfByte1.length);
    System.arraycopy(paramArrayOfbyte5, 0, arrayOfByte5, this.K_BYTE, this.SEED_SIZE);
    System.arraycopy(paramArrayOfbyte7, 0, arrayOfByte5, this.K_BYTE + this.SEED_SIZE, this.SALT_SIZE_BYTES);
    KeccakRandomGenerator keccakRandomGenerator2 = new KeccakRandomGenerator(256);
    keccakRandomGenerator2.SHAKE256_512_ds(arrayOfByte4, arrayOfByte5, arrayOfByte5.length, new byte[] { this.G_FCT_DOMAIN });
    long[] arrayOfLong1 = new long[this.N_BYTE_64];
    byte[] arrayOfByte6 = new byte[this.N_BYTE];
    extractPublicKeys(arrayOfLong1, arrayOfByte6, paramArrayOfbyte5);
    long[] arrayOfLong2 = new long[this.N1N2_BYTE_64];
    encrypt(paramArrayOfbyte1, arrayOfLong2, arrayOfLong1, arrayOfByte6, arrayOfByte1, arrayOfByte4);
    Utils.fromLongArrayToByteArray(paramArrayOfbyte2, arrayOfLong2);
    keccakRandomGenerator2.SHAKE256_512_ds(paramArrayOfbyte4, arrayOfByte1, arrayOfByte1.length, new byte[] { this.H_FCT_DOMAIN });
    byte[] arrayOfByte7 = new byte[this.K_BYTE + this.N_BYTE + this.N1N2_BYTE];
    arrayOfByte7 = Arrays.concatenate(arrayOfByte1, paramArrayOfbyte1);
    arrayOfByte7 = Arrays.concatenate(arrayOfByte7, paramArrayOfbyte2);
    keccakRandomGenerator2.SHAKE256_512_ds(paramArrayOfbyte3, arrayOfByte7, arrayOfByte7.length, new byte[] { this.K_FCT_DOMAIN });
  }
  
  public void decaps(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    long[] arrayOfLong1 = new long[this.N_BYTE_64];
    long[] arrayOfLong2 = new long[this.N_BYTE_64];
    byte[] arrayOfByte1 = new byte[40 + this.N_BYTE];
    extractKeysFromSecretKeys(arrayOfLong1, arrayOfLong2, arrayOfByte1, paramArrayOfbyte3);
    byte[] arrayOfByte2 = new byte[this.N_BYTE];
    byte[] arrayOfByte3 = new byte[this.N1N2_BYTE];
    byte[] arrayOfByte4 = new byte[this.SHA512_BYTES];
    byte[] arrayOfByte5 = new byte[this.SALT_SIZE_BYTES];
    extractCiphertexts(arrayOfByte2, arrayOfByte3, arrayOfByte4, arrayOfByte5, paramArrayOfbyte2);
    byte[] arrayOfByte6 = new byte[this.k];
    decrypt(arrayOfByte6, arrayOfByte6, arrayOfByte2, arrayOfByte3, arrayOfLong2);
    byte[] arrayOfByte7 = new byte[this.SHA512_BYTES];
    byte[] arrayOfByte8 = new byte[this.K_BYTE + this.SALT_SIZE_BYTES + this.SEED_SIZE];
    System.arraycopy(arrayOfByte6, 0, arrayOfByte8, 0, arrayOfByte6.length);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte8, this.K_BYTE, this.SEED_SIZE);
    System.arraycopy(arrayOfByte5, 0, arrayOfByte8, this.K_BYTE + this.SEED_SIZE, this.SALT_SIZE_BYTES);
    KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
    keccakRandomGenerator.SHAKE256_512_ds(arrayOfByte7, arrayOfByte8, arrayOfByte8.length, new byte[] { this.G_FCT_DOMAIN });
    long[] arrayOfLong3 = new long[this.N_BYTE_64];
    byte[] arrayOfByte9 = new byte[this.N_BYTE];
    extractPublicKeys(arrayOfLong3, arrayOfByte9, arrayOfByte1);
    byte[] arrayOfByte10 = new byte[this.N_BYTE];
    byte[] arrayOfByte11 = new byte[this.N1N2_BYTE];
    long[] arrayOfLong4 = new long[this.N1N2_BYTE_64];
    encrypt(arrayOfByte10, arrayOfLong4, arrayOfLong3, arrayOfByte9, arrayOfByte6, arrayOfByte7);
    Utils.fromLongArrayToByteArray(arrayOfByte11, arrayOfLong4);
    byte[] arrayOfByte12 = new byte[this.SHA512_BYTES];
    keccakRandomGenerator.SHAKE256_512_ds(arrayOfByte12, arrayOfByte6, arrayOfByte6.length, new byte[] { this.H_FCT_DOMAIN });
    byte[] arrayOfByte13 = new byte[this.K_BYTE + this.N_BYTE + this.N1N2_BYTE];
    arrayOfByte13 = Arrays.concatenate(arrayOfByte6, arrayOfByte2);
    arrayOfByte13 = Arrays.concatenate(arrayOfByte13, arrayOfByte3);
    keccakRandomGenerator.SHAKE256_512_ds(paramArrayOfbyte1, arrayOfByte13, arrayOfByte13.length, new byte[] { this.K_FCT_DOMAIN });
    boolean bool = true;
    if (!Arrays.areEqual(arrayOfByte2, arrayOfByte10))
      bool = false; 
    if (!Arrays.areEqual(arrayOfByte3, arrayOfByte11))
      bool = false; 
    if (!Arrays.areEqual(arrayOfByte4, arrayOfByte12))
      bool = false; 
    if (!bool)
      for (byte b = 0; b < getSessionKeySize(); b++)
        paramArrayOfbyte1[b] = 0;  
  }
  
  int getSessionKeySize() {
    return this.SHA512_BYTES;
  }
  
  private void encrypt(byte[] paramArrayOfbyte1, long[] paramArrayOflong1, long[] paramArrayOflong2, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
    keccakRandomGenerator.seedExpanderInit(paramArrayOfbyte4, this.SEED_SIZE);
    long[] arrayOfLong1 = new long[this.N_BYTE_64];
    long[] arrayOfLong2 = new long[this.N_BYTE_64];
    long[] arrayOfLong3 = new long[this.N_BYTE_64];
    generateRandomFixedWeight(arrayOfLong2, keccakRandomGenerator, this.wr);
    generateRandomFixedWeight(arrayOfLong3, keccakRandomGenerator, this.wr);
    generateRandomFixedWeight(arrayOfLong1, keccakRandomGenerator, this.we);
    long[] arrayOfLong4 = new long[this.N_BYTE_64];
    this.gfCalculator.multLongs(arrayOfLong4, arrayOfLong3, paramArrayOflong2);
    GF2PolynomialCalculator.addLongs(arrayOfLong4, arrayOfLong4, arrayOfLong2);
    Utils.fromLongArrayToByteArray(paramArrayOfbyte1, arrayOfLong4);
    byte[] arrayOfByte = new byte[this.n1];
    long[] arrayOfLong5 = new long[this.N1N2_BYTE_64];
    long[] arrayOfLong6 = new long[this.N_BYTE_64];
    ReedSolomon.encode(arrayOfByte, paramArrayOfbyte3, this.K_BYTE * 8, this.n1, this.k, this.g, this.generatorPoly);
    ReedMuller.encode(arrayOfLong5, arrayOfByte, this.n1, this.mulParam);
    System.arraycopy(arrayOfLong5, 0, arrayOfLong6, 0, arrayOfLong5.length);
    long[] arrayOfLong7 = new long[this.N_BYTE_64];
    Utils.fromByteArrayToLongArray(arrayOfLong7, paramArrayOfbyte2);
    long[] arrayOfLong8 = new long[this.N_BYTE_64];
    this.gfCalculator.multLongs(arrayOfLong8, arrayOfLong3, arrayOfLong7);
    GF2PolynomialCalculator.addLongs(arrayOfLong8, arrayOfLong8, arrayOfLong6);
    GF2PolynomialCalculator.addLongs(arrayOfLong8, arrayOfLong8, arrayOfLong1);
    Utils.resizeArray(paramArrayOflong1, this.n1n2, arrayOfLong8, this.n, this.N1N2_BYTE_64, this.N1N2_BYTE_64);
  }
  
  private void decrypt(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, long[] paramArrayOflong) {
    long[] arrayOfLong1 = new long[this.N_BYTE_64];
    Utils.fromByteArrayToLongArray(arrayOfLong1, paramArrayOfbyte3);
    long[] arrayOfLong2 = new long[this.N1N2_BYTE_64];
    Utils.fromByteArrayToLongArray(arrayOfLong2, paramArrayOfbyte4);
    long[] arrayOfLong3 = new long[this.N_BYTE_64];
    System.arraycopy(arrayOfLong2, 0, arrayOfLong3, 0, arrayOfLong2.length);
    long[] arrayOfLong4 = new long[this.N_BYTE_64];
    this.gfCalculator.multLongs(arrayOfLong4, paramArrayOflong, arrayOfLong1);
    GF2PolynomialCalculator.addLongs(arrayOfLong4, arrayOfLong4, arrayOfLong3);
    byte[] arrayOfByte = new byte[this.n1];
    ReedMuller.decode(arrayOfByte, arrayOfLong4, this.n1, this.mulParam);
    ReedSolomon.decode(paramArrayOfbyte2, arrayOfByte, this.n1, this.fft, this.delta, this.k, this.g);
    System.arraycopy(paramArrayOfbyte2, 0, paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
  }
  
  private void generateRandomFixedWeight(long[] paramArrayOflong, KeccakRandomGenerator paramKeccakRandomGenerator, int paramInt) {
    int[] arrayOfInt1 = new int[this.wr];
    byte[] arrayOfByte = new byte[this.wr * 4];
    int[] arrayOfInt2 = new int[this.wr];
    int[] arrayOfInt3 = new int[this.wr];
    long[] arrayOfLong = new long[this.wr];
    paramKeccakRandomGenerator.expandSeed(arrayOfByte, 4 * paramInt);
    Pack.littleEndianToInt(arrayOfByte, 0, arrayOfInt1, 0, arrayOfInt1.length);
    int i;
    for (i = 0; i < paramInt; i++)
      arrayOfInt2[i] = (int)(i + (arrayOfInt1[i] & 0xFFFFFFFFL) % (this.n - i)); 
    for (i = paramInt - 1; i >= 0; i--) {
      int j = 0;
      int k;
      for (k = i + 1; k < paramInt; k++) {
        if (arrayOfInt2[k] == arrayOfInt2[i])
          j |= 0x1; 
      } 
      k = -j;
      arrayOfInt2[i] = k & i ^ (k ^ 0xFFFFFFFF) & arrayOfInt2[i];
    } 
    for (i = 0; i < paramInt; i++) {
      arrayOfInt3[i] = arrayOfInt2[i] >>> 6;
      int j = arrayOfInt2[i] & 0x3F;
      arrayOfLong[i] = 1L << j;
    } 
    long l = 0L;
    for (byte b = 0; b < this.N_BYTE_64; b++) {
      l = 0L;
      for (byte b1 = 0; b1 < paramInt; b1++) {
        int j = b - arrayOfInt3[b1];
        int k = 0x1 ^ (j | -j) >>> 31;
        long l1 = -k;
        l |= arrayOfLong[b1] & l1;
      } 
      paramArrayOflong[b] = paramArrayOflong[b] | l;
    } 
  }
  
  void generatePublicKeyH(long[] paramArrayOflong, KeccakRandomGenerator paramKeccakRandomGenerator) {
    byte[] arrayOfByte = new byte[this.N_BYTE];
    paramKeccakRandomGenerator.expandSeed(arrayOfByte, this.N_BYTE);
    long[] arrayOfLong = new long[this.N_BYTE_64];
    Utils.fromByteArrayToLongArray(arrayOfLong, arrayOfByte);
    arrayOfLong[this.N_BYTE_64 - 1] = arrayOfLong[this.N_BYTE_64 - 1] & Utils.bitMask(this.n, 64L);
    System.arraycopy(arrayOfLong, 0, paramArrayOflong, 0, paramArrayOflong.length);
  }
  
  private void extractPublicKeys(long[] paramArrayOflong, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte = new byte[this.SEED_SIZE];
    System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, 0, arrayOfByte.length);
    KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
    keccakRandomGenerator.seedExpanderInit(arrayOfByte, arrayOfByte.length);
    long[] arrayOfLong = new long[this.N_BYTE_64];
    generatePublicKeyH(arrayOfLong, keccakRandomGenerator);
    System.arraycopy(arrayOfLong, 0, paramArrayOflong, 0, paramArrayOflong.length);
    System.arraycopy(paramArrayOfbyte2, 40, paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
  }
  
  private void extractKeysFromSecretKeys(long[] paramArrayOflong1, long[] paramArrayOflong2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte = new byte[this.SEED_SIZE];
    System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, 0, arrayOfByte.length);
    KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
    keccakRandomGenerator.seedExpanderInit(arrayOfByte, arrayOfByte.length);
    generateRandomFixedWeight(paramArrayOflong1, keccakRandomGenerator, this.w);
    generateRandomFixedWeight(paramArrayOflong2, keccakRandomGenerator, this.w);
    System.arraycopy(paramArrayOfbyte2, this.SEED_SIZE, paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
  }
  
  private void extractCiphertexts(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5) {
    System.arraycopy(paramArrayOfbyte5, 0, paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    System.arraycopy(paramArrayOfbyte5, paramArrayOfbyte1.length, paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
    System.arraycopy(paramArrayOfbyte5, paramArrayOfbyte1.length + paramArrayOfbyte2.length, paramArrayOfbyte3, 0, paramArrayOfbyte3.length);
    System.arraycopy(paramArrayOfbyte5, paramArrayOfbyte1.length + paramArrayOfbyte2.length + paramArrayOfbyte3.length, paramArrayOfbyte4, 0, paramArrayOfbyte4.length);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\hqc\HQCEngine.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */