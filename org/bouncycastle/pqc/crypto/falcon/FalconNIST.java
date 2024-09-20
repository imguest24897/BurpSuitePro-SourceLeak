package org.bouncycastle.pqc.crypto.falcon;

import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

class FalconNIST {
  int NONCELEN;
  
  int LOGN;
  
  private int N;
  
  private SecureRandom rand;
  
  private int CRYPTO_SECRETKEYBYTES;
  
  private int CRYPTO_PUBLICKEYBYTES;
  
  int CRYPTO_BYTES;
  
  private FalconCodec codec = new FalconCodec();
  
  FalconNIST(int paramInt1, int paramInt2, SecureRandom paramSecureRandom) {
    this.rand = paramSecureRandom;
    this.LOGN = paramInt1;
    this.NONCELEN = paramInt2;
    this.N = 1 << paramInt1;
    this.CRYPTO_PUBLICKEYBYTES = 1 + 14 * this.N / 8;
    if (paramInt1 == 10) {
      this.CRYPTO_SECRETKEYBYTES = 2305;
      this.CRYPTO_BYTES = 1330;
    } else if (paramInt1 == 9 || paramInt1 == 8) {
      this.CRYPTO_SECRETKEYBYTES = 1 + 6 * this.N * 2 / 8 + this.N;
      this.CRYPTO_BYTES = 690;
    } else if (paramInt1 == 7 || paramInt1 == 6) {
      this.CRYPTO_SECRETKEYBYTES = 1 + 7 * this.N * 2 / 8 + this.N;
      this.CRYPTO_BYTES = 690;
    } else {
      this.CRYPTO_SECRETKEYBYTES = 1 + this.N * 2 + this.N;
      this.CRYPTO_BYTES = 690;
    } 
  }
  
  byte[][] crypto_sign_keypair(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    byte[] arrayOfByte1 = new byte[this.N];
    byte[] arrayOfByte2 = new byte[this.N];
    byte[] arrayOfByte3 = new byte[this.N];
    short[] arrayOfShort = new short[this.N];
    byte[] arrayOfByte4 = new byte[48];
    SHAKE256 sHAKE256 = new SHAKE256();
    FalconKeyGen falconKeyGen = new FalconKeyGen();
    this.rand.nextBytes(arrayOfByte4);
    sHAKE256.inner_shake256_init();
    sHAKE256.inner_shake256_inject(arrayOfByte4, 0, arrayOfByte4.length);
    sHAKE256.i_shake256_flip();
    falconKeyGen.keygen(sHAKE256, arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte3, 0, null, 0, arrayOfShort, 0, this.LOGN);
    paramArrayOfbyte2[paramInt2 + 0] = (byte)(80 + this.LOGN);
    int i = 1;
    int j = this.codec.trim_i8_encode(paramArrayOfbyte2, paramInt2 + i, this.CRYPTO_SECRETKEYBYTES - i, arrayOfByte1, 0, this.LOGN, this.codec.max_fg_bits[this.LOGN]);
    if (j == 0)
      throw new IllegalStateException("f encode failed"); 
    byte[] arrayOfByte5 = Arrays.copyOfRange(paramArrayOfbyte2, paramInt2 + i, i + j);
    i += j;
    j = this.codec.trim_i8_encode(paramArrayOfbyte2, paramInt2 + i, this.CRYPTO_SECRETKEYBYTES - i, arrayOfByte2, 0, this.LOGN, this.codec.max_fg_bits[this.LOGN]);
    if (j == 0)
      throw new IllegalStateException("g encode failed"); 
    byte[] arrayOfByte6 = Arrays.copyOfRange(paramArrayOfbyte2, paramInt2 + i, i + j);
    i += j;
    j = this.codec.trim_i8_encode(paramArrayOfbyte2, paramInt2 + i, this.CRYPTO_SECRETKEYBYTES - i, arrayOfByte3, 0, this.LOGN, this.codec.max_FG_bits[this.LOGN]);
    if (j == 0)
      throw new IllegalStateException("F encode failed"); 
    byte[] arrayOfByte7 = Arrays.copyOfRange(paramArrayOfbyte2, paramInt2 + i, i + j);
    i += j;
    if (i != this.CRYPTO_SECRETKEYBYTES)
      throw new IllegalStateException("secret key encoding failed"); 
    paramArrayOfbyte1[paramInt1 + 0] = (byte)(0 + this.LOGN);
    j = this.codec.modq_encode(paramArrayOfbyte1, paramInt1 + 1, this.CRYPTO_PUBLICKEYBYTES - 1, arrayOfShort, 0, this.LOGN);
    if (j != this.CRYPTO_PUBLICKEYBYTES - 1)
      throw new IllegalStateException("public key encoding failed"); 
    return new byte[][] { Arrays.copyOfRange(paramArrayOfbyte1, 1, paramArrayOfbyte1.length), arrayOfByte5, arrayOfByte6, arrayOfByte7 };
  }
  
  byte[] crypto_sign(boolean paramBoolean, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, byte[] paramArrayOfbyte3, int paramInt3) {
    int k;
    byte[] arrayOfByte1 = new byte[this.N];
    byte[] arrayOfByte2 = new byte[this.N];
    byte[] arrayOfByte3 = new byte[this.N];
    byte[] arrayOfByte4 = new byte[this.N];
    short[] arrayOfShort1 = new short[this.N];
    short[] arrayOfShort2 = new short[this.N];
    byte[] arrayOfByte5 = new byte[48];
    byte[] arrayOfByte6 = new byte[this.NONCELEN];
    SHAKE256 sHAKE256 = new SHAKE256();
    FalconSign falconSign = new FalconSign();
    FalconVrfy falconVrfy = new FalconVrfy();
    FalconCommon falconCommon = new FalconCommon();
    int i = 0;
    int j = this.codec.trim_i8_decode(arrayOfByte1, 0, this.LOGN, this.codec.max_fg_bits[this.LOGN], paramArrayOfbyte3, paramInt3 + i, this.CRYPTO_SECRETKEYBYTES - i);
    if (j == 0)
      throw new IllegalStateException("f decode failed"); 
    i += j;
    j = this.codec.trim_i8_decode(arrayOfByte2, 0, this.LOGN, this.codec.max_fg_bits[this.LOGN], paramArrayOfbyte3, paramInt3 + i, this.CRYPTO_SECRETKEYBYTES - i);
    if (j == 0)
      throw new IllegalStateException("g decode failed"); 
    i += j;
    j = this.codec.trim_i8_decode(arrayOfByte3, 0, this.LOGN, this.codec.max_FG_bits[this.LOGN], paramArrayOfbyte3, paramInt3 + i, this.CRYPTO_SECRETKEYBYTES - i);
    if (j == 0)
      throw new IllegalArgumentException("F decode failed"); 
    i += j;
    if (i != this.CRYPTO_SECRETKEYBYTES - 1)
      throw new IllegalStateException("full key not used"); 
    if (!falconVrfy.complete_private(arrayOfByte4, 0, arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte3, 0, this.LOGN, new short[2 * this.N], 0))
      throw new IllegalStateException("complete_private failed"); 
    this.rand.nextBytes(arrayOfByte6);
    sHAKE256.inner_shake256_init();
    sHAKE256.inner_shake256_inject(arrayOfByte6, 0, this.NONCELEN);
    sHAKE256.inner_shake256_inject(paramArrayOfbyte2, paramInt1, paramInt2);
    sHAKE256.i_shake256_flip();
    falconCommon.hash_to_point_vartime(sHAKE256, arrayOfShort2, 0, this.LOGN);
    this.rand.nextBytes(arrayOfByte5);
    sHAKE256.inner_shake256_init();
    sHAKE256.inner_shake256_inject(arrayOfByte5, 0, arrayOfByte5.length);
    sHAKE256.i_shake256_flip();
    falconSign.sign_dyn(arrayOfShort1, 0, sHAKE256, arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte3, 0, arrayOfByte4, 0, arrayOfShort2, 0, this.LOGN, new FalconFPR[10 * this.N], 0);
    byte[] arrayOfByte7 = new byte[this.CRYPTO_BYTES - 2 - this.NONCELEN];
    if (paramBoolean) {
      arrayOfByte7[0] = (byte)(32 + this.LOGN);
      k = this.codec.comp_encode(arrayOfByte7, 1, arrayOfByte7.length - 1, arrayOfShort1, 0, this.LOGN);
      if (k == 0)
        throw new IllegalStateException("signature failed to generate"); 
      k++;
    } else {
      k = this.codec.comp_encode(arrayOfByte7, 0, arrayOfByte7.length, arrayOfShort1, 0, this.LOGN);
      if (k == 0)
        throw new IllegalStateException("signature failed to generate"); 
    } 
    paramArrayOfbyte1[0] = (byte)(48 + this.LOGN);
    System.arraycopy(arrayOfByte6, 0, paramArrayOfbyte1, 1, this.NONCELEN);
    System.arraycopy(arrayOfByte7, 0, paramArrayOfbyte1, 1 + this.NONCELEN, k);
    return Arrays.copyOfRange(paramArrayOfbyte1, 0, 1 + this.NONCELEN + k);
  }
  
  int crypto_sign_open(boolean paramBoolean, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, int paramInt) {
    short[] arrayOfShort1 = new short[this.N];
    short[] arrayOfShort2 = new short[this.N];
    short[] arrayOfShort3 = new short[this.N];
    SHAKE256 sHAKE256 = new SHAKE256();
    FalconVrfy falconVrfy = new FalconVrfy();
    FalconCommon falconCommon = new FalconCommon();
    if (this.codec.modq_decode(arrayOfShort1, 0, this.LOGN, paramArrayOfbyte4, paramInt, this.CRYPTO_PUBLICKEYBYTES - 1) != this.CRYPTO_PUBLICKEYBYTES - 1)
      return -1; 
    falconVrfy.to_ntt_monty(arrayOfShort1, 0, this.LOGN);
    int i = paramArrayOfbyte1.length;
    int j = paramArrayOfbyte3.length;
    if (paramBoolean) {
      if (i < 1 || paramArrayOfbyte1[0] != (byte)(32 + this.LOGN))
        return -1; 
      if (this.codec.comp_decode(arrayOfShort3, 0, this.LOGN, paramArrayOfbyte1, 1, i - 1) != i - 1)
        return -1; 
    } else if (i < 1 || this.codec.comp_decode(arrayOfShort3, 0, this.LOGN, paramArrayOfbyte1, 0, i) != i) {
      return -1;
    } 
    sHAKE256.inner_shake256_init();
    sHAKE256.inner_shake256_inject(paramArrayOfbyte2, 0, this.NONCELEN);
    sHAKE256.inner_shake256_inject(paramArrayOfbyte3, 0, j);
    sHAKE256.i_shake256_flip();
    falconCommon.hash_to_point_vartime(sHAKE256, arrayOfShort2, 0, this.LOGN);
    return (falconVrfy.verify_raw(arrayOfShort2, 0, arrayOfShort3, 0, arrayOfShort1, 0, this.LOGN, new short[this.N], 0) == 0) ? -1 : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\FalconNIST.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */