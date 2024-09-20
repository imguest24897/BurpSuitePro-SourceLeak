package org.bouncycastle.pqc.crypto.saber;

import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

class SABEREngine {
  public static final int SABER_EP = 10;
  
  public static final int SABER_N = 256;
  
  private static final int SABER_SEEDBYTES = 32;
  
  private static final int SABER_NOISE_SEEDBYTES = 32;
  
  private static final int SABER_KEYBYTES = 32;
  
  private static final int SABER_HASHBYTES = 32;
  
  private final int SABER_L;
  
  private final int SABER_MU;
  
  private final int SABER_ET;
  
  private final int SABER_POLYCOINBYTES;
  
  private final int SABER_EQ;
  
  private final int SABER_POLYBYTES;
  
  private final int SABER_POLYVECBYTES;
  
  private final int SABER_POLYCOMPRESSEDBYTES;
  
  private final int SABER_POLYVECCOMPRESSEDBYTES;
  
  private final int SABER_SCALEBYTES_KEM;
  
  private final int SABER_INDCPA_PUBLICKEYBYTES;
  
  private final int SABER_INDCPA_SECRETKEYBYTES;
  
  private final int SABER_PUBLICKEYBYTES;
  
  private final int SABER_SECRETKEYBYTES;
  
  private final int SABER_BYTES_CCA_DEC;
  
  private final int defaultKeySize;
  
  private final int h1;
  
  private final int h2;
  
  private final Utils utils;
  
  private final Poly poly;
  
  private final boolean usingAES;
  
  protected final boolean usingEffectiveMasking;
  
  protected final Symmetric symmetric;
  
  public int getSABER_N() {
    return 256;
  }
  
  public int getSABER_EP() {
    return 10;
  }
  
  public int getSABER_KEYBYTES() {
    return 32;
  }
  
  public int getSABER_L() {
    return this.SABER_L;
  }
  
  public int getSABER_ET() {
    return this.SABER_ET;
  }
  
  public int getSABER_POLYBYTES() {
    return this.SABER_POLYBYTES;
  }
  
  public int getSABER_POLYVECBYTES() {
    return this.SABER_POLYVECBYTES;
  }
  
  public int getSABER_SEEDBYTES() {
    return 32;
  }
  
  public int getSABER_POLYCOINBYTES() {
    return this.SABER_POLYCOINBYTES;
  }
  
  public int getSABER_NOISE_SEEDBYTES() {
    return 32;
  }
  
  public int getSABER_MU() {
    return this.SABER_MU;
  }
  
  public Utils getUtils() {
    return this.utils;
  }
  
  public int getSessionKeySize() {
    return this.defaultKeySize / 8;
  }
  
  public int getCipherTextSize() {
    return this.SABER_BYTES_CCA_DEC;
  }
  
  public int getPublicKeySize() {
    return this.SABER_PUBLICKEYBYTES;
  }
  
  public int getPrivateKeySize() {
    return this.SABER_SECRETKEYBYTES;
  }
  
  public SABEREngine(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    this.defaultKeySize = paramInt2;
    this.usingAES = paramBoolean1;
    this.usingEffectiveMasking = paramBoolean2;
    this.SABER_L = paramInt1;
    if (paramInt1 == 2) {
      this.SABER_MU = 10;
      this.SABER_ET = 3;
    } else if (paramInt1 == 3) {
      this.SABER_MU = 8;
      this.SABER_ET = 4;
    } else {
      this.SABER_MU = 6;
      this.SABER_ET = 6;
    } 
    if (paramBoolean1) {
      this.symmetric = new Symmetric.AesSymmetric();
    } else {
      this.symmetric = new Symmetric.ShakeSymmetric();
    } 
    if (paramBoolean2) {
      this.SABER_EQ = 12;
      this.SABER_POLYCOINBYTES = 64;
    } else {
      this.SABER_EQ = 13;
      this.SABER_POLYCOINBYTES = this.SABER_MU * 256 / 8;
    } 
    this.SABER_POLYBYTES = this.SABER_EQ * 256 / 8;
    this.SABER_POLYVECBYTES = this.SABER_L * this.SABER_POLYBYTES;
    this.SABER_POLYCOMPRESSEDBYTES = 320;
    this.SABER_POLYVECCOMPRESSEDBYTES = this.SABER_L * this.SABER_POLYCOMPRESSEDBYTES;
    this.SABER_SCALEBYTES_KEM = this.SABER_ET * 256 / 8;
    this.SABER_INDCPA_PUBLICKEYBYTES = this.SABER_POLYVECCOMPRESSEDBYTES + 32;
    this.SABER_INDCPA_SECRETKEYBYTES = this.SABER_POLYVECBYTES;
    this.SABER_PUBLICKEYBYTES = this.SABER_INDCPA_PUBLICKEYBYTES;
    this.SABER_SECRETKEYBYTES = this.SABER_INDCPA_SECRETKEYBYTES + this.SABER_INDCPA_PUBLICKEYBYTES + 32 + 32;
    this.SABER_BYTES_CCA_DEC = this.SABER_POLYVECCOMPRESSEDBYTES + this.SABER_SCALEBYTES_KEM;
    this.h1 = 1 << this.SABER_EQ - 10 - 1;
    this.h2 = 256 - (1 << 10 - this.SABER_ET - 1) + (1 << this.SABER_EQ - 10 - 1);
    this.utils = new Utils(this);
    this.poly = new Poly(this);
  }
  
  private void indcpa_kem_keypair(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, SecureRandom paramSecureRandom) {
    short[][][] arrayOfShort = new short[this.SABER_L][this.SABER_L][256];
    short[][] arrayOfShort1 = new short[this.SABER_L][256];
    short[][] arrayOfShort2 = new short[this.SABER_L][256];
    byte[] arrayOfByte1 = new byte[32];
    byte[] arrayOfByte2 = new byte[32];
    paramSecureRandom.nextBytes(arrayOfByte1);
    this.symmetric.prf(arrayOfByte1, arrayOfByte1, 32, 32);
    paramSecureRandom.nextBytes(arrayOfByte2);
    this.poly.GenMatrix(arrayOfShort, arrayOfByte1);
    this.poly.GenSecret(arrayOfShort1, arrayOfByte2);
    this.poly.MatrixVectorMul(arrayOfShort, arrayOfShort1, arrayOfShort2, 1);
    for (byte b = 0; b < this.SABER_L; b++) {
      for (byte b1 = 0; b1 < 'Ā'; b1++)
        arrayOfShort2[b][b1] = (short)((arrayOfShort2[b][b1] + this.h1 & 0xFFFF) >>> this.SABER_EQ - 10); 
    } 
    this.utils.POLVECq2BS(paramArrayOfbyte2, arrayOfShort1);
    this.utils.POLVECp2BS(paramArrayOfbyte1, arrayOfShort2);
    System.arraycopy(arrayOfByte1, 0, paramArrayOfbyte1, this.SABER_POLYVECCOMPRESSEDBYTES, arrayOfByte1.length);
  }
  
  public int crypto_kem_keypair(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, SecureRandom paramSecureRandom) {
    indcpa_kem_keypair(paramArrayOfbyte1, paramArrayOfbyte2, paramSecureRandom);
    for (byte b = 0; b < this.SABER_INDCPA_PUBLICKEYBYTES; b++)
      paramArrayOfbyte2[b + this.SABER_INDCPA_SECRETKEYBYTES] = paramArrayOfbyte1[b]; 
    this.symmetric.hash_h(paramArrayOfbyte2, paramArrayOfbyte1, this.SABER_SECRETKEYBYTES - 64);
    byte[] arrayOfByte = new byte[32];
    paramSecureRandom.nextBytes(arrayOfByte);
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte2, this.SABER_SECRETKEYBYTES - 32, arrayOfByte.length);
    return 0;
  }
  
  private void indcpa_kem_enc(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    short[][][] arrayOfShort = new short[this.SABER_L][this.SABER_L][256];
    short[][] arrayOfShort1 = new short[this.SABER_L][256];
    short[][] arrayOfShort2 = new short[this.SABER_L][256];
    short[][] arrayOfShort3 = new short[this.SABER_L][256];
    short[] arrayOfShort4 = new short[256];
    short[] arrayOfShort5 = new short[256];
    byte[] arrayOfByte = Arrays.copyOfRange(paramArrayOfbyte3, this.SABER_POLYVECCOMPRESSEDBYTES, paramArrayOfbyte3.length);
    this.poly.GenMatrix(arrayOfShort, arrayOfByte);
    this.poly.GenSecret(arrayOfShort1, paramArrayOfbyte2);
    this.poly.MatrixVectorMul(arrayOfShort, arrayOfShort1, arrayOfShort2, 0);
    for (byte b1 = 0; b1 < this.SABER_L; b1++) {
      for (byte b = 0; b < 'Ā'; b++)
        arrayOfShort2[b1][b] = (short)((arrayOfShort2[b1][b] + this.h1 & 0xFFFF) >>> this.SABER_EQ - 10); 
    } 
    this.utils.POLVECp2BS(paramArrayOfbyte4, arrayOfShort2);
    this.utils.BS2POLVECp(paramArrayOfbyte3, arrayOfShort3);
    this.poly.InnerProd(arrayOfShort3, arrayOfShort1, arrayOfShort5);
    this.utils.BS2POLmsg(paramArrayOfbyte1, arrayOfShort4);
    for (byte b2 = 0; b2 < 'Ā'; b2++)
      arrayOfShort5[b2] = (short)((arrayOfShort5[b2] - (arrayOfShort4[b2] << 9) + this.h1 & 0xFFFF) >>> 10 - this.SABER_ET); 
    this.utils.POLT2BS(paramArrayOfbyte4, this.SABER_POLYVECCOMPRESSEDBYTES, arrayOfShort5);
  }
  
  public int crypto_kem_enc(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, SecureRandom paramSecureRandom) {
    byte[] arrayOfByte1 = new byte[64];
    byte[] arrayOfByte2 = new byte[64];
    byte[] arrayOfByte3 = new byte[32];
    paramSecureRandom.nextBytes(arrayOfByte3);
    this.symmetric.hash_h(arrayOfByte3, arrayOfByte3, 0);
    System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 0, 32);
    this.symmetric.hash_h(arrayOfByte2, paramArrayOfbyte3, 32);
    this.symmetric.hash_g(arrayOfByte1, arrayOfByte2);
    indcpa_kem_enc(arrayOfByte2, Arrays.copyOfRange(arrayOfByte1, 32, arrayOfByte1.length), paramArrayOfbyte3, paramArrayOfbyte1);
    this.symmetric.hash_h(arrayOfByte1, paramArrayOfbyte1, 32);
    byte[] arrayOfByte4 = new byte[32];
    this.symmetric.hash_h(arrayOfByte4, arrayOfByte1, 0);
    System.arraycopy(arrayOfByte4, 0, paramArrayOfbyte2, 0, this.defaultKeySize / 8);
    return 0;
  }
  
  private void indcpa_kem_dec(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    short[][] arrayOfShort1 = new short[this.SABER_L][256];
    short[][] arrayOfShort2 = new short[this.SABER_L][256];
    short[] arrayOfShort3 = new short[256];
    short[] arrayOfShort4 = new short[256];
    this.utils.BS2POLVECq(paramArrayOfbyte1, 0, arrayOfShort1);
    this.utils.BS2POLVECp(paramArrayOfbyte2, arrayOfShort2);
    this.poly.InnerProd(arrayOfShort2, arrayOfShort1, arrayOfShort3);
    this.utils.BS2POLT(paramArrayOfbyte2, this.SABER_POLYVECCOMPRESSEDBYTES, arrayOfShort4);
    for (byte b = 0; b < 'Ā'; b++)
      arrayOfShort3[b] = (short)((arrayOfShort3[b] + this.h2 - (arrayOfShort4[b] << 10 - this.SABER_ET) & 0xFFFF) >> 9); 
    this.utils.POLmsg2BS(paramArrayOfbyte3, arrayOfShort3);
  }
  
  public int crypto_kem_dec(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    byte[] arrayOfByte1 = new byte[this.SABER_BYTES_CCA_DEC];
    byte[] arrayOfByte2 = new byte[64];
    byte[] arrayOfByte3 = new byte[64];
    byte[] arrayOfByte4 = Arrays.copyOfRange(paramArrayOfbyte3, this.SABER_INDCPA_SECRETKEYBYTES, paramArrayOfbyte3.length);
    indcpa_kem_dec(paramArrayOfbyte3, paramArrayOfbyte2, arrayOfByte2);
    for (byte b = 0; b < 32; b++)
      arrayOfByte2[32 + b] = paramArrayOfbyte3[this.SABER_SECRETKEYBYTES - 64 + b]; 
    this.symmetric.hash_g(arrayOfByte3, arrayOfByte2);
    indcpa_kem_enc(arrayOfByte2, Arrays.copyOfRange(arrayOfByte3, 32, arrayOfByte3.length), arrayOfByte4, arrayOfByte1);
    int i = verify(paramArrayOfbyte2, arrayOfByte1, this.SABER_BYTES_CCA_DEC);
    this.symmetric.hash_h(arrayOfByte3, paramArrayOfbyte2, 32);
    cmov(arrayOfByte3, paramArrayOfbyte3, this.SABER_SECRETKEYBYTES - 32, 32, (byte)i);
    byte[] arrayOfByte5 = new byte[32];
    this.symmetric.hash_h(arrayOfByte5, arrayOfByte3, 0);
    System.arraycopy(arrayOfByte5, 0, paramArrayOfbyte1, 0, this.defaultKeySize / 8);
    return 0;
  }
  
  static int verify(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    long l = 0L;
    for (byte b = 0; b < paramInt; b++)
      l |= (paramArrayOfbyte1[b] ^ paramArrayOfbyte2[b]); 
    l = -l >>> 63L;
    return (int)l;
  }
  
  static void cmov(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, byte paramByte) {
    paramByte = (byte)-paramByte;
    for (byte b = 0; b < paramInt2; b++)
      paramArrayOfbyte1[b] = (byte)(paramArrayOfbyte1[b] ^ paramByte & (paramArrayOfbyte2[b + paramInt1] ^ paramArrayOfbyte1[b])); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\saber\SABEREngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */