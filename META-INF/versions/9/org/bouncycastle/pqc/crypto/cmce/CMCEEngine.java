package META-INF.versions.9.org.bouncycastle.pqc.crypto.cmce;

import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.cmce.BENES;
import org.bouncycastle.pqc.crypto.cmce.BENES12;
import org.bouncycastle.pqc.crypto.cmce.BENES13;
import org.bouncycastle.pqc.crypto.cmce.GF;
import org.bouncycastle.pqc.crypto.cmce.GF12;
import org.bouncycastle.pqc.crypto.cmce.GF13;
import org.bouncycastle.pqc.crypto.cmce.Utils;
import org.bouncycastle.util.Arrays;

class CMCEEngine {
  private int SYS_N;
  
  private int SYS_T;
  
  private int GFBITS;
  
  private int IRR_BYTES;
  
  private int COND_BYTES;
  
  private int PK_NROWS;
  
  private int PK_NCOLS;
  
  private int PK_ROW_BYTES;
  
  private int SYND_BYTES;
  
  private int GFMASK;
  
  private int[] poly;
  
  private final int defaultKeySize;
  
  private GF gf;
  
  private BENES benes;
  
  private boolean usePadding;
  
  private boolean countErrorIndices;
  
  private boolean usePivots;
  
  public int getIrrBytes() {
    return this.IRR_BYTES;
  }
  
  public int getCondBytes() {
    return this.COND_BYTES;
  }
  
  public int getPrivateKeySize() {
    return this.COND_BYTES + this.IRR_BYTES + this.SYS_N / 8 + 40;
  }
  
  public int getPublicKeySize() {
    return this.usePadding ? (this.PK_NROWS * (this.SYS_N / 8 - (this.PK_NROWS - 1) / 8)) : (this.PK_NROWS * this.PK_NCOLS / 8);
  }
  
  public int getCipherTextSize() {
    return this.SYND_BYTES;
  }
  
  public CMCEEngine(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint, boolean paramBoolean, int paramInt4) {
    this.usePivots = paramBoolean;
    this.SYS_N = paramInt2;
    this.SYS_T = paramInt3;
    this.GFBITS = paramInt1;
    this.poly = paramArrayOfint;
    this.defaultKeySize = paramInt4;
    this.IRR_BYTES = this.SYS_T * 2;
    this.COND_BYTES = (1 << this.GFBITS - 4) * (2 * this.GFBITS - 1);
    this.PK_NROWS = this.SYS_T * this.GFBITS;
    this.PK_NCOLS = this.SYS_N - this.PK_NROWS;
    this.PK_ROW_BYTES = (this.PK_NCOLS + 7) / 8;
    this.SYND_BYTES = (this.PK_NROWS + 7) / 8;
    this.GFMASK = (1 << this.GFBITS) - 1;
    if (this.GFBITS == 12) {
      this.gf = (GF)new GF12();
      this.benes = (BENES)new BENES12(this.SYS_N, this.SYS_T, this.GFBITS);
    } else {
      this.gf = (GF)new GF13();
      this.benes = (BENES)new BENES13(this.SYS_N, this.SYS_T, this.GFBITS);
    } 
    this.usePadding = (this.SYS_T % 8 != 0);
    this.countErrorIndices = (1 << this.GFBITS > this.SYS_N);
  }
  
  public byte[] generate_public_key_from_private_key(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = new byte[getPublicKeySize()];
    short[] arrayOfShort = new short[1 << this.GFBITS];
    long[] arrayOfLong = { 0L };
    int[] arrayOfInt = new int[1 << this.GFBITS];
    byte[] arrayOfByte2 = new byte[this.SYS_N / 8 + (1 << this.GFBITS) * 4];
    int i = arrayOfByte2.length - 32 - this.IRR_BYTES - (1 << this.GFBITS) * 4;
    SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
    sHAKEDigest.update((byte)64);
    sHAKEDigest.update(paramArrayOfbyte, 0, 32);
    sHAKEDigest.doFinal(arrayOfByte2, 0, arrayOfByte2.length);
    for (byte b = 0; b < 1 << this.GFBITS; b++)
      arrayOfInt[b] = Utils.load4(arrayOfByte2, i + b * 4); 
    pk_gen(arrayOfByte1, paramArrayOfbyte, arrayOfInt, arrayOfShort, arrayOfLong);
    return arrayOfByte1;
  }
  
  public byte[] decompress_private_key(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = new byte[getPrivateKeySize()];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte1, 0, paramArrayOfbyte.length);
    byte[] arrayOfByte2 = new byte[this.SYS_N / 8 + (1 << this.GFBITS) * 4 + this.IRR_BYTES + 32];
    int i = 0;
    SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
    sHAKEDigest.update((byte)64);
    sHAKEDigest.update(paramArrayOfbyte, 0, 32);
    sHAKEDigest.doFinal(arrayOfByte2, 0, arrayOfByte2.length);
    if (paramArrayOfbyte.length <= 40) {
      short[] arrayOfShort = new short[this.SYS_T];
      byte[] arrayOfByte = new byte[this.IRR_BYTES];
      i = arrayOfByte2.length - 32 - this.IRR_BYTES;
      byte b;
      for (b = 0; b < this.SYS_T; b++)
        arrayOfShort[b] = Utils.load_gf(arrayOfByte2, i + b * 2, this.GFMASK); 
      generate_irr_poly(arrayOfShort);
      for (b = 0; b < this.SYS_T; b++)
        Utils.store_gf(arrayOfByte, b * 2, arrayOfShort[b]); 
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, 40, this.IRR_BYTES);
    } 
    if (paramArrayOfbyte.length <= 40 + this.IRR_BYTES) {
      int[] arrayOfInt = new int[1 << this.GFBITS];
      short[] arrayOfShort = new short[1 << this.GFBITS];
      i = arrayOfByte2.length - 32 - this.IRR_BYTES - (1 << this.GFBITS) * 4;
      for (byte b = 0; b < 1 << this.GFBITS; b++)
        arrayOfInt[b] = Utils.load4(arrayOfByte2, i + b * 4); 
      if (this.usePivots) {
        long[] arrayOfLong = { 0L };
        pk_gen(null, arrayOfByte1, arrayOfInt, arrayOfShort, arrayOfLong);
      } else {
        long[] arrayOfLong = new long[1 << this.GFBITS];
        byte b1;
        for (b1 = 0; b1 < 1 << this.GFBITS; b1++) {
          arrayOfLong[b1] = arrayOfInt[b1];
          arrayOfLong[b1] = arrayOfLong[b1] << 31L;
          arrayOfLong[b1] = arrayOfLong[b1] | b1;
          arrayOfLong[b1] = arrayOfLong[b1] & Long.MAX_VALUE;
        } 
        sort64(arrayOfLong, 0, arrayOfLong.length);
        for (b1 = 0; b1 < 1 << this.GFBITS; b1++)
          arrayOfShort[b1] = (short)(int)(arrayOfLong[b1] & this.GFMASK); 
      } 
      byte[] arrayOfByte = new byte[this.COND_BYTES];
      controlbitsfrompermutation(arrayOfByte, arrayOfShort, this.GFBITS, (1 << this.GFBITS));
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, this.IRR_BYTES + 40, arrayOfByte.length);
    } 
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, getPrivateKeySize() - this.SYS_N / 8, this.SYS_N / 8);
    return arrayOfByte1;
  }
  
  public void kem_keypair(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, SecureRandom paramSecureRandom) {
    byte[] arrayOfByte1 = new byte[1];
    byte[] arrayOfByte2 = new byte[32];
    arrayOfByte1[0] = 64;
    paramSecureRandom.nextBytes(arrayOfByte2);
    byte[] arrayOfByte3 = new byte[this.SYS_N / 8 + (1 << this.GFBITS) * 4 + this.SYS_T * 2 + 32];
    byte b = 0;
    byte[] arrayOfByte4 = arrayOfByte2;
    long[] arrayOfLong = { 0L };
    SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
    while (true) {
      sHAKEDigest.update(arrayOfByte1, 0, arrayOfByte1.length);
      sHAKEDigest.update(arrayOfByte2, 0, arrayOfByte2.length);
      sHAKEDigest.doFinal(arrayOfByte3, 0, arrayOfByte3.length);
      int i = arrayOfByte3.length - 32;
      arrayOfByte2 = Arrays.copyOfRange(arrayOfByte3, i, i + 32);
      System.arraycopy(arrayOfByte4, 0, paramArrayOfbyte2, 0, 32);
      arrayOfByte4 = Arrays.copyOfRange(arrayOfByte2, 0, 32);
      short[] arrayOfShort1 = new short[this.SYS_T];
      int j = arrayOfByte3.length - 32 - 2 * this.SYS_T;
      i = j;
      byte b1;
      for (b1 = 0; b1 < this.SYS_T; b1++)
        arrayOfShort1[b1] = Utils.load_gf(arrayOfByte3, j + b1 * 2, this.GFMASK); 
      if (generate_irr_poly(arrayOfShort1) == -1)
        continue; 
      b = 40;
      for (b1 = 0; b1 < this.SYS_T; b1++)
        Utils.store_gf(paramArrayOfbyte2, b + b1 * 2, arrayOfShort1[b1]); 
      int[] arrayOfInt = new int[1 << this.GFBITS];
      i -= (1 << this.GFBITS) * 4;
      for (byte b2 = 0; b2 < 1 << this.GFBITS; b2++)
        arrayOfInt[b2] = Utils.load4(arrayOfByte3, i + b2 * 4); 
      short[] arrayOfShort2 = new short[1 << this.GFBITS];
      if (pk_gen(paramArrayOfbyte1, paramArrayOfbyte2, arrayOfInt, arrayOfShort2, arrayOfLong) == -1)
        continue; 
      byte[] arrayOfByte = new byte[this.COND_BYTES];
      controlbitsfrompermutation(arrayOfByte, arrayOfShort2, this.GFBITS, (1 << this.GFBITS));
      System.arraycopy(arrayOfByte, 0, paramArrayOfbyte2, this.IRR_BYTES + 40, arrayOfByte.length);
      i -= this.SYS_N / 8;
      System.arraycopy(arrayOfByte3, i, paramArrayOfbyte2, paramArrayOfbyte2.length - this.SYS_N / 8, this.SYS_N / 8);
      if (!this.usePivots) {
        Utils.store8(paramArrayOfbyte2, 32, 4294967295L);
      } else {
        Utils.store8(paramArrayOfbyte2, 32, arrayOfLong[0]);
      } 
      return;
    } 
  }
  
  private void syndrome(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    short[] arrayOfShort = new short[this.SYS_N / 8];
    int i = 0;
    int j = this.PK_NROWS % 8;
    byte b;
    for (b = 0; b < this.SYND_BYTES; b++)
      paramArrayOfbyte1[b] = 0; 
    for (b = 0; b < this.PK_NROWS; b++) {
      int k;
      for (k = 0; k < this.SYS_N / 8; k++)
        arrayOfShort[k] = 0; 
      for (k = 0; k < this.PK_ROW_BYTES; k++)
        arrayOfShort[this.SYS_N / 8 - this.PK_ROW_BYTES + k] = (short)paramArrayOfbyte2[i + k]; 
      if (this.usePadding)
        for (k = this.SYS_N / 8 - 1; k >= this.SYS_N / 8 - this.PK_ROW_BYTES; k--)
          arrayOfShort[k] = (short)(((arrayOfShort[k] & 0xFF) << j | (arrayOfShort[k - 1] & 0xFF) >>> 8 - j) & 0xFF);  
      arrayOfShort[b / 8] = (short)(arrayOfShort[b / 8] | 1 << b % 8);
      byte b1 = 0;
      for (k = 0; k < this.SYS_N / 8; k++)
        b1 = (byte)(b1 ^ arrayOfShort[k] & paramArrayOfbyte3[k]); 
      b1 = (byte)(b1 ^ b1 >>> 4);
      b1 = (byte)(b1 ^ b1 >>> 2);
      b1 = (byte)(b1 ^ b1 >>> 1);
      b1 = (byte)(b1 & 0x1);
      paramArrayOfbyte1[b / 8] = (byte)(paramArrayOfbyte1[b / 8] | b1 << b % 8);
      i += this.PK_ROW_BYTES;
    } 
  }
  
  private void generate_error_vector(byte[] paramArrayOfbyte, SecureRandom paramSecureRandom) {
    short[] arrayOfShort1 = new short[this.SYS_T * 2];
    short[] arrayOfShort2 = new short[this.SYS_T];
    byte[] arrayOfByte = new byte[this.SYS_T];
    while (true) {
      if (this.countErrorIndices) {
        byte[] arrayOfByte1 = new byte[this.SYS_T * 4];
        paramSecureRandom.nextBytes(arrayOfByte1);
        byte b1;
        for (b1 = 0; b1 < this.SYS_T * 2; b1++)
          arrayOfShort1[b1] = Utils.load_gf(arrayOfByte1, b1 * 2, this.GFMASK); 
        b1 = 0;
        for (byte b2 = 0; b2 < this.SYS_T * 2 && b1 < this.SYS_T; b2++) {
          if (arrayOfShort1[b2] < this.SYS_N)
            arrayOfShort2[b1++] = arrayOfShort1[b2]; 
        } 
        if (b1 < this.SYS_T)
          continue; 
      } else {
        byte[] arrayOfByte1 = new byte[this.SYS_T * 2];
        paramSecureRandom.nextBytes(arrayOfByte1);
        for (byte b1 = 0; b1 < this.SYS_T; b1++)
          arrayOfShort2[b1] = Utils.load_gf(arrayOfByte1, b1 * 2, this.GFMASK); 
      } 
      short s = 0;
      byte b;
      for (b = 1; b < this.SYS_T && s != 1; b++) {
        for (byte b1 = 0; b1 < b; b1++) {
          if (arrayOfShort2[b] == arrayOfShort2[b1]) {
            s = 1;
            break;
          } 
        } 
      } 
      if (!s) {
        for (s = 0; s < this.SYS_T; s++)
          arrayOfByte[s] = (byte)(1 << (arrayOfShort2[s] & 0x7)); 
        for (s = 0; s < this.SYS_N / 8; s = (short)(s + 1)) {
          paramArrayOfbyte[s] = 0;
          for (b = 0; b < this.SYS_T; b++) {
            short s1 = (short)same_mask32(s, (short)(arrayOfShort2[b] >> 3));
            s1 = (short)(s1 & 0xFF);
            paramArrayOfbyte[s] = (byte)(paramArrayOfbyte[s] | arrayOfByte[b] & s1);
          } 
        } 
        return;
      } 
    } 
  }
  
  private void encrypt(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, SecureRandom paramSecureRandom) {
    generate_error_vector(paramArrayOfbyte3, paramSecureRandom);
    syndrome(paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3);
  }
  
  public int kem_enc(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, SecureRandom paramSecureRandom) {
    byte[] arrayOfByte = new byte[this.SYS_N / 8];
    int i = 0;
    if (this.usePadding)
      i = check_pk_padding(paramArrayOfbyte3); 
    encrypt(paramArrayOfbyte1, paramArrayOfbyte3, arrayOfByte, paramSecureRandom);
    SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
    sHAKEDigest.update((byte)1);
    sHAKEDigest.update(arrayOfByte, 0, arrayOfByte.length);
    sHAKEDigest.update(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    sHAKEDigest.doFinal(paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
    if (this.usePadding) {
      byte b = (byte)i;
      b = (byte)(b ^ 0xFF);
      byte b1;
      for (b1 = 0; b1 < this.SYND_BYTES; b1++)
        paramArrayOfbyte1[b1] = (byte)(paramArrayOfbyte1[b1] & b); 
      for (b1 = 0; b1 < 32; b1++)
        paramArrayOfbyte2[b1] = (byte)(paramArrayOfbyte2[b1] & b); 
      return i;
    } 
    return 0;
  }
  
  public int kem_dec(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    byte[] arrayOfByte1 = new byte[this.SYS_N / 8];
    byte[] arrayOfByte2 = new byte[1 + this.SYS_N / 8 + this.SYND_BYTES];
    int i = 0;
    if (this.usePadding)
      i = check_c_padding(paramArrayOfbyte2); 
    byte b1 = (byte)decrypt(arrayOfByte1, paramArrayOfbyte3, paramArrayOfbyte2);
    short s = (short)b1;
    s = (short)(s - 1);
    s = (short)(s >> 8);
    s = (short)(s & 0xFF);
    arrayOfByte2[0] = (byte)(s & 0x1);
    byte b;
    for (b = 0; b < this.SYS_N / 8; b++)
      arrayOfByte2[1 + b] = (byte)((s ^ 0xFFFFFFFF) & paramArrayOfbyte3[b + 40 + this.IRR_BYTES + this.COND_BYTES] | s & arrayOfByte1[b]); 
    for (b = 0; b < this.SYND_BYTES; b++)
      arrayOfByte2[1 + this.SYS_N / 8 + b] = paramArrayOfbyte2[b]; 
    SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
    sHAKEDigest.update(arrayOfByte2, 0, arrayOfByte2.length);
    sHAKEDigest.doFinal(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    if (this.usePadding) {
      byte b2 = (byte)i;
      for (b = 0; b < paramArrayOfbyte1.length; b++)
        paramArrayOfbyte1[b] = (byte)(paramArrayOfbyte1[b] | b2); 
      return i;
    } 
    return 0;
  }
  
  private int decrypt(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    short[] arrayOfShort1 = new short[this.SYS_T + 1];
    short[] arrayOfShort2 = new short[this.SYS_N];
    short[] arrayOfShort3 = new short[this.SYS_T * 2];
    short[] arrayOfShort4 = new short[this.SYS_T * 2];
    short[] arrayOfShort5 = new short[this.SYS_T + 1];
    short[] arrayOfShort6 = new short[this.SYS_N];
    byte[] arrayOfByte = new byte[this.SYS_N / 8];
    int i;
    for (i = 0; i < this.SYND_BYTES; i++)
      arrayOfByte[i] = paramArrayOfbyte3[i]; 
    for (i = this.SYND_BYTES; i < this.SYS_N / 8; i++)
      arrayOfByte[i] = 0; 
    for (i = 0; i < this.SYS_T; i++)
      arrayOfShort1[i] = Utils.load_gf(paramArrayOfbyte2, 40 + i * 2, this.GFMASK); 
    arrayOfShort1[this.SYS_T] = 1;
    this.benes.support_gen(arrayOfShort2, paramArrayOfbyte2);
    synd(arrayOfShort3, arrayOfShort1, arrayOfShort2, arrayOfByte);
    bm(arrayOfShort5, arrayOfShort3);
    root(arrayOfShort6, arrayOfShort5, arrayOfShort2);
    for (i = 0; i < this.SYS_N / 8; i++)
      paramArrayOfbyte1[i] = 0; 
    i = 0;
    int j;
    for (j = 0; j < this.SYS_N; j++) {
      short s = (short)(this.gf.gf_iszero(arrayOfShort6[j]) & 0x1);
      paramArrayOfbyte1[j / 8] = (byte)(paramArrayOfbyte1[j / 8] | s << j % 8);
      i += s;
    } 
    synd(arrayOfShort4, arrayOfShort1, arrayOfShort2, paramArrayOfbyte1);
    j = i;
    j ^= this.SYS_T;
    for (byte b = 0; b < this.SYS_T * 2; b++)
      j |= arrayOfShort3[b] ^ arrayOfShort4[b]; 
    j = --j >> 15;
    j &= 0x1;
    if ((j ^ 0x1) != 0);
    return j ^ 0x1;
  }
  
  private static int min(short paramShort, int paramInt) {
    return (paramShort < paramInt) ? paramShort : paramInt;
  }
  
  private void bm(short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    short s1 = 0;
    short s2 = 0;
    short[] arrayOfShort1 = new short[this.SYS_T + 1];
    short[] arrayOfShort2 = new short[this.SYS_T + 1];
    short[] arrayOfShort3 = new short[this.SYS_T + 1];
    short s3 = 1;
    int i;
    for (i = 0; i < this.SYS_T + 1; i++) {
      arrayOfShort3[i] = 0;
      arrayOfShort2[i] = 0;
    } 
    arrayOfShort2[0] = 1;
    arrayOfShort3[1] = 1;
    for (s1 = 0; s1 < 2 * this.SYS_T; s1 = (short)(s1 + 1)) {
      i = 0;
      int j;
      for (j = 0; j <= min(s1, this.SYS_T); j++)
        i ^= this.gf.gf_mul_ext(arrayOfShort2[j], paramArrayOfshort2[s1 - j]); 
      short s6 = this.gf.gf_reduce(i);
      short s5 = s6;
      s5 = (short)(s5 - 1);
      s5 = (short)(s5 >> 15);
      s5 = (short)(s5 & 0x1);
      s5 = (short)(s5 - 1);
      short s4 = s1;
      s4 = (short)(s4 - 2 * s2);
      s4 = (short)(s4 >> 15);
      s4 = (short)(s4 & 0x1);
      s4 = (short)(s4 - 1);
      s4 = (short)(s4 & s5);
      for (j = 0; j <= this.SYS_T; j++)
        arrayOfShort1[j] = arrayOfShort2[j]; 
      short s7 = this.gf.gf_frac(s3, s6);
      for (j = 0; j <= this.SYS_T; j++)
        arrayOfShort2[j] = (short)(arrayOfShort2[j] ^ this.gf.gf_mul(s7, arrayOfShort3[j]) & s5); 
      s2 = (short)(s2 & (s4 ^ 0xFFFFFFFF) | s1 + 1 - s2 & s4);
      for (j = this.SYS_T - 1; j >= 0; j--)
        arrayOfShort3[j + 1] = (short)(arrayOfShort3[j] & (s4 ^ 0xFFFFFFFF) | arrayOfShort1[j] & s4); 
      arrayOfShort3[0] = 0;
      s3 = (short)(s3 & (s4 ^ 0xFFFFFFFF) | s6 & s4);
    } 
    for (i = 0; i <= this.SYS_T; i++)
      paramArrayOfshort1[i] = arrayOfShort2[this.SYS_T - i]; 
  }
  
  private void synd(short[] paramArrayOfshort1, short[] paramArrayOfshort2, short[] paramArrayOfshort3, byte[] paramArrayOfbyte) {
    short s1 = (short)(paramArrayOfbyte[0] & 0x1);
    short s2 = paramArrayOfshort3[0];
    short s3 = eval(paramArrayOfshort2, s2);
    short s4 = this.gf.gf_inv(this.gf.gf_sq(s3));
    short s5 = (short)(s4 & -s1);
    paramArrayOfshort1[0] = s5;
    short s;
    for (s = 1; s < 2 * this.SYS_T; s++) {
      s5 = this.gf.gf_mul(s5, s2);
      paramArrayOfshort1[s] = s5;
    } 
    for (s1 = 1; s1 < this.SYS_N; s1++) {
      s2 = (short)(paramArrayOfbyte[s1 / 8] >> s1 % 8 & 0x1);
      s3 = paramArrayOfshort3[s1];
      s4 = eval(paramArrayOfshort2, s3);
      s5 = this.gf.gf_inv(this.gf.gf_sq(s4));
      s = this.gf.gf_mul(s5, s2);
      paramArrayOfshort1[0] = (short)(paramArrayOfshort1[0] ^ s);
      for (byte b = 1; b < 2 * this.SYS_T; b++) {
        s = this.gf.gf_mul(s, s3);
        paramArrayOfshort1[b] = (short)(paramArrayOfshort1[b] ^ s);
      } 
    } 
  }
  
  private int mov_columns(byte[][] paramArrayOfbyte, short[] paramArrayOfshort, long[] paramArrayOflong) {
    long[] arrayOfLong1 = new long[64];
    long[] arrayOfLong2 = new long[32];
    long l = 1L;
    byte[] arrayOfByte = new byte[9];
    int j = this.PK_NROWS - 32;
    int i = j / 8;
    int k = j % 8;
    if (this.usePadding) {
      for (byte b = 0; b < 32; b++) {
        byte b3;
        for (b3 = 0; b3 < 9; b3++)
          arrayOfByte[b3] = paramArrayOfbyte[j + b][i + b3]; 
        for (b3 = 0; b3 < 8; b3++)
          arrayOfByte[b3] = (byte)((arrayOfByte[b3] & 0xFF) >> k | arrayOfByte[b3 + 1] << 8 - k); 
        arrayOfLong1[b] = Utils.load8(arrayOfByte, 0);
      } 
    } else {
      for (byte b = 0; b < 32; b++)
        arrayOfLong1[b] = Utils.load8(paramArrayOfbyte[j + b], i); 
    } 
    paramArrayOflong[0] = 0L;
    byte b1;
    for (b1 = 0; b1 < 32; b1++) {
      long l1 = arrayOfLong1[b1];
      int m;
      for (m = b1 + 1; m < 32; m++)
        l1 |= arrayOfLong1[m]; 
      if (l1 == 0L)
        return -1; 
      int n;
      arrayOfLong2[b1] = (n = ctz(l1));
      paramArrayOflong[0] = paramArrayOflong[0] | l << (int)arrayOfLong2[b1];
      for (m = b1 + 1; m < 32; m++) {
        long l2 = arrayOfLong1[b1] >> n & 0x1L;
        l2--;
        arrayOfLong1[b1] = arrayOfLong1[b1] ^ arrayOfLong1[m] & l2;
      } 
      for (m = b1 + 1; m < 32; m++) {
        long l2 = arrayOfLong1[m] >> n & 0x1L;
        l2 = -l2;
        arrayOfLong1[m] = arrayOfLong1[m] ^ arrayOfLong1[b1] & l2;
      } 
    } 
    byte b2;
    for (b2 = 0; b2 < 32; b2++) {
      for (int m = b2 + 1; m < 64; m++) {
        long l1 = (paramArrayOfshort[j + b2] ^ paramArrayOfshort[j + m]);
        l1 &= same_mask64((short)m, (short)(int)arrayOfLong2[b2]);
        paramArrayOfshort[j + b2] = (short)(int)(paramArrayOfshort[j + b2] ^ l1);
        paramArrayOfshort[j + m] = (short)(int)(paramArrayOfshort[j + m] ^ l1);
      } 
    } 
    for (b1 = 0; b1 < this.PK_NROWS; b1++) {
      long l1;
      if (this.usePadding) {
        byte b;
        for (b = 0; b < 9; b++)
          arrayOfByte[b] = paramArrayOfbyte[b1][i + b]; 
        for (b = 0; b < 8; b++)
          arrayOfByte[b] = (byte)((arrayOfByte[b] & 0xFF) >> k | arrayOfByte[b + 1] << 8 - k); 
        l1 = Utils.load8(arrayOfByte, 0);
      } else {
        l1 = Utils.load8(paramArrayOfbyte[b1], i);
      } 
      for (b2 = 0; b2 < 32; b2++) {
        long l2 = l1 >> b2;
        l2 ^= l1 >> (int)arrayOfLong2[b2];
        l2 &= 0x1L;
        l1 ^= l2 << (int)arrayOfLong2[b2];
        l1 ^= l2 << b2;
      } 
      if (this.usePadding) {
        Utils.store8(arrayOfByte, 0, l1);
        paramArrayOfbyte[b1][i + 8] = (byte)((paramArrayOfbyte[b1][i + 8] & 0xFF) >>> k << k | (arrayOfByte[7] & 0xFF) >>> 8 - k);
        paramArrayOfbyte[b1][i + 0] = (byte)((arrayOfByte[0] & 0xFF) << k | (paramArrayOfbyte[b1][i] & 0xFF) << 8 - k >>> 8 - k);
        for (byte b = 7; b >= 1; b--)
          paramArrayOfbyte[b1][i + b] = (byte)((arrayOfByte[b] & 0xFF) << k | (arrayOfByte[b - 1] & 0xFF) >>> 8 - k); 
      } else {
        Utils.store8(paramArrayOfbyte[b1], i, l1);
      } 
    } 
    return 0;
  }
  
  private static int ctz(long paramLong) {
    long l1 = 72340172838076673L;
    long l2 = 0L;
    long l3 = paramLong ^ 0xFFFFFFFFFFFFFFFFL;
    for (byte b1 = 0; b1 < 8; b1++) {
      l1 &= l3 >>> b1;
      l2 += l1;
    } 
    long l4 = l2 & 0x808080808080808L;
    l4 |= l4 >>> 1L;
    l4 |= l4 >>> 2L;
    long l5 = l2;
    l2 >>>= 8L;
    l5 += l2 & l4;
    for (byte b2 = 2; b2 < 8; b2++) {
      l4 &= l4 >>> 8L;
      l2 >>>= 8L;
      l5 += l2 & l4;
    } 
    return (int)l5 & 0xFF;
  }
  
  private static long same_mask64(short paramShort1, short paramShort2) {
    null = (paramShort1 ^ paramShort2);
    null--;
    null >>>= 63L;
    return -null;
  }
  
  private static byte same_mask32(short paramShort1, short paramShort2) {
    int i = paramShort1 ^ paramShort2;
    i = --i >>> 31;
    i = -i;
    return (byte)(i & 0xFF);
  }
  
  private static void layer(short[] paramArrayOfshort, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    int j = 1 << paramInt2;
    byte b = 0;
    int i;
    for (i = 0; i < paramInt3; i += j * 2) {
      for (byte b1 = 0; b1 < j; b1++) {
        int k = paramArrayOfshort[i + b1] ^ paramArrayOfshort[i + b1 + j];
        int m = paramArrayOfbyte[paramInt1 + (b >> 3)] >> (b & 0x7) & 0x1;
        m = -m;
        k &= m;
        paramArrayOfshort[i + b1] = (short)(paramArrayOfshort[i + b1] ^ k);
        paramArrayOfshort[i + b1 + j] = (short)(paramArrayOfshort[i + b1 + j] ^ k);
        b++;
      } 
    } 
  }
  
  private static void controlbitsfrompermutation(byte[] paramArrayOfbyte, short[] paramArrayOfshort, long paramLong1, long paramLong2) {
    short s;
    int[] arrayOfInt = new int[(int)(2L * paramLong2)];
    short[] arrayOfShort = new short[(int)paramLong2];
    do {
      int i;
      for (i = 0; i < ((2L * paramLong1 - 1L) * paramLong2 / 2L + 7L) / 8L; i++)
        paramArrayOfbyte[i] = 0; 
      cbrecursion(paramArrayOfbyte, 0L, 1L, paramArrayOfshort, 0, paramLong1, paramLong2, arrayOfInt);
      for (i = 0; i < paramLong2; i++)
        arrayOfShort[i] = (short)i; 
      int j = 0;
      for (i = 0; i < paramLong1; i++) {
        layer(arrayOfShort, paramArrayOfbyte, j, i, (int)paramLong2);
        j = (int)(j + (paramLong2 >> 4L));
      } 
      for (i = (int)(paramLong1 - 2L); i >= 0; i--) {
        layer(arrayOfShort, paramArrayOfbyte, j, i, (int)paramLong2);
        j = (int)(j + (paramLong2 >> 4L));
      } 
      s = 0;
      for (i = 0; i < paramLong2; i++)
        s = (short)(s | paramArrayOfshort[i] ^ arrayOfShort[i]); 
    } while (s != 0);
  }
  
  static short get_q_short(int[] paramArrayOfint, int paramInt) {
    int i = paramInt / 2;
    return (paramInt % 2 == 0) ? (short)paramArrayOfint[i] : (short)((paramArrayOfint[i] & 0xFFFF0000) >> 16);
  }
  
  static void cbrecursion(byte[] paramArrayOfbyte, long paramLong1, long paramLong2, short[] paramArrayOfshort, int paramInt, long paramLong3, long paramLong4, int[] paramArrayOfint) {
    if (paramLong3 == 1L) {
      paramArrayOfbyte[(int)(paramLong1 >> 3L)] = (byte)(paramArrayOfbyte[(int)(paramLong1 >> 3L)] ^ get_q_short(paramArrayOfint, paramInt) << (int)(paramLong1 & 0x7L));
      return;
    } 
    if (paramArrayOfshort != null) {
      long l;
      for (l = 0L; l < paramLong4; l++)
        paramArrayOfint[(int)l] = (paramArrayOfshort[(int)l] ^ 0x1) << 16 | paramArrayOfshort[(int)(l ^ 0x1L)]; 
    } else {
      long l;
      for (l = 0L; l < paramLong4; l++)
        paramArrayOfint[(int)l] = (get_q_short(paramArrayOfint, (int)(paramInt + l)) ^ 0x1) << 16 | get_q_short(paramArrayOfint, (int)(paramInt + (l ^ 0x1L))); 
    } 
    sort32(paramArrayOfint, 0, (int)paramLong4);
    long l1;
    for (l1 = 0L; l1 < paramLong4; l1++) {
      int i = paramArrayOfint[(int)l1];
      int j = i & 0xFFFF;
      int k = j;
      if (l1 < k)
        k = (int)l1; 
      paramArrayOfint[(int)(paramLong4 + l1)] = j << 16 | k;
    } 
    for (l1 = 0L; l1 < paramLong4; l1++)
      paramArrayOfint[(int)l1] = (int)((paramArrayOfint[(int)l1] << 16) | l1); 
    sort32(paramArrayOfint, 0, (int)paramLong4);
    for (l1 = 0L; l1 < paramLong4; l1++)
      paramArrayOfint[(int)l1] = (paramArrayOfint[(int)l1] << 16) + (paramArrayOfint[(int)(paramLong4 + l1)] >> 16); 
    sort32(paramArrayOfint, 0, (int)paramLong4);
    if (paramLong3 <= 10L) {
      for (l1 = 0L; l1 < paramLong4; l1++)
        paramArrayOfint[(int)(paramLong4 + l1)] = (paramArrayOfint[(int)l1] & 0xFFFF) << 10 | paramArrayOfint[(int)(paramLong4 + l1)] & 0x3FF; 
      long l;
      for (l = 1L; l < paramLong3 - 1L; l++) {
        for (l1 = 0L; l1 < paramLong4; l1++)
          paramArrayOfint[(int)l1] = (int)(((paramArrayOfint[(int)(paramLong4 + l1)] & 0xFFFFFC00) << 6) | l1); 
        sort32(paramArrayOfint, 0, (int)paramLong4);
        for (l1 = 0L; l1 < paramLong4; l1++)
          paramArrayOfint[(int)l1] = paramArrayOfint[(int)l1] << 20 | paramArrayOfint[(int)(paramLong4 + l1)]; 
        sort32(paramArrayOfint, 0, (int)paramLong4);
        for (l1 = 0L; l1 < paramLong4; l1++) {
          int i = paramArrayOfint[(int)l1] & 0xFFFFF;
          int j = paramArrayOfint[(int)l1] & 0xFFC00 | paramArrayOfint[(int)(paramLong4 + l1)] & 0x3FF;
          if (i < j)
            j = i; 
          paramArrayOfint[(int)(paramLong4 + l1)] = j;
        } 
      } 
      for (l1 = 0L; l1 < paramLong4; l1++)
        paramArrayOfint[(int)(paramLong4 + l1)] = paramArrayOfint[(int)(paramLong4 + l1)] & 0x3FF; 
    } else {
      for (l1 = 0L; l1 < paramLong4; l1++)
        paramArrayOfint[(int)(paramLong4 + l1)] = paramArrayOfint[(int)l1] << 16 | paramArrayOfint[(int)(paramLong4 + l1)] & 0xFFFF; 
      long l;
      for (l = 1L; l < paramLong3 - 1L; l++) {
        for (l1 = 0L; l1 < paramLong4; l1++)
          paramArrayOfint[(int)l1] = (int)((paramArrayOfint[(int)(paramLong4 + l1)] & 0xFFFF0000) | l1); 
        sort32(paramArrayOfint, 0, (int)paramLong4);
        for (l1 = 0L; l1 < paramLong4; l1++)
          paramArrayOfint[(int)l1] = paramArrayOfint[(int)l1] << 16 | paramArrayOfint[(int)(paramLong4 + l1)] & 0xFFFF; 
        if (l < paramLong3 - 2L) {
          for (l1 = 0L; l1 < paramLong4; l1++)
            paramArrayOfint[(int)(paramLong4 + l1)] = paramArrayOfint[(int)l1] & 0xFFFF0000 | paramArrayOfint[(int)(paramLong4 + l1)] >> 16; 
          sort32(paramArrayOfint, (int)paramLong4, (int)(paramLong4 * 2L));
          for (l1 = 0L; l1 < paramLong4; l1++)
            paramArrayOfint[(int)(paramLong4 + l1)] = paramArrayOfint[(int)(paramLong4 + l1)] << 16 | paramArrayOfint[(int)l1] & 0xFFFF; 
        } 
        sort32(paramArrayOfint, 0, (int)paramLong4);
        for (l1 = 0L; l1 < paramLong4; l1++) {
          int i = paramArrayOfint[(int)(paramLong4 + l1)] & 0xFFFF0000 | paramArrayOfint[(int)l1] & 0xFFFF;
          if (i < paramArrayOfint[(int)(paramLong4 + l1)])
            paramArrayOfint[(int)(paramLong4 + l1)] = i; 
        } 
      } 
      for (l1 = 0L; l1 < paramLong4; l1++)
        paramArrayOfint[(int)(paramLong4 + l1)] = paramArrayOfint[(int)(paramLong4 + l1)] & 0xFFFF; 
    } 
    if (paramArrayOfshort != null) {
      for (l1 = 0L; l1 < paramLong4; l1++)
        paramArrayOfint[(int)l1] = (int)((paramArrayOfshort[(int)l1] << 16) + l1); 
    } else {
      for (l1 = 0L; l1 < paramLong4; l1++)
        paramArrayOfint[(int)l1] = (int)((get_q_short(paramArrayOfint, (int)(paramInt + l1)) << 16) + l1); 
    } 
    sort32(paramArrayOfint, 0, (int)paramLong4);
    long l3;
    for (l3 = 0L; l3 < paramLong4 / 2L; l3++) {
      long l = 2L * l3;
      int i = paramArrayOfint[(int)(paramLong4 + l)] & 0x1;
      int j = (int)(l + i);
      int k = j ^ 0x1;
      paramArrayOfbyte[(int)(paramLong1 >> 3L)] = (byte)(paramArrayOfbyte[(int)(paramLong1 >> 3L)] ^ i << (int)(paramLong1 & 0x7L));
      paramLong1 += paramLong2;
      paramArrayOfint[(int)(paramLong4 + l)] = paramArrayOfint[(int)l] << 16 | j;
      paramArrayOfint[(int)(paramLong4 + l + 1L)] = paramArrayOfint[(int)(l + 1L)] << 16 | k;
    } 
    sort32(paramArrayOfint, (int)paramLong4, (int)(paramLong4 * 2L));
    paramLong1 += (2L * paramLong3 - 3L) * paramLong2 * paramLong4 / 2L;
    long l4;
    for (l4 = 0L; l4 < paramLong4 / 2L; l4++) {
      long l = 2L * l4;
      int i = paramArrayOfint[(int)(paramLong4 + l)] & 0x1;
      int j = (int)(l + i);
      int k = j ^ 0x1;
      paramArrayOfbyte[(int)(paramLong1 >> 3L)] = (byte)(paramArrayOfbyte[(int)(paramLong1 >> 3L)] ^ i << (int)(paramLong1 & 0x7L));
      paramLong1 += paramLong2;
      paramArrayOfint[(int)l] = j << 16 | paramArrayOfint[(int)(paramLong4 + l)] & 0xFFFF;
      paramArrayOfint[(int)(l + 1L)] = k << 16 | paramArrayOfint[(int)(paramLong4 + l + 1L)] & 0xFFFF;
    } 
    sort32(paramArrayOfint, 0, (int)paramLong4);
    paramLong1 -= (2L * paramLong3 - 2L) * paramLong2 * paramLong4 / 2L;
    short[] arrayOfShort = new short[(int)paramLong4 * 4];
    long l2;
    for (l2 = 0L; l2 < paramLong4 * 2L; l2++) {
      arrayOfShort[(int)(l2 * 2L + 0L)] = (short)paramArrayOfint[(int)l2];
      arrayOfShort[(int)(l2 * 2L + 1L)] = (short)((paramArrayOfint[(int)l2] & 0xFFFF0000) >> 16);
    } 
    for (l3 = 0L; l3 < paramLong4 / 2L; l3++) {
      arrayOfShort[(int)l3] = (short)((paramArrayOfint[(int)(2L * l3)] & 0xFFFF) >>> 1);
      arrayOfShort[(int)(l3 + paramLong4 / 2L)] = (short)((paramArrayOfint[(int)(2L * l3 + 1L)] & 0xFFFF) >>> 1);
    } 
    for (l2 = 0L; l2 < paramLong4 / 2L; l2++)
      paramArrayOfint[(int)(paramLong4 + paramLong4 / 4L + l2)] = arrayOfShort[(int)(l2 * 2L + 1L)] << 16 | arrayOfShort[(int)(l2 * 2L)]; 
    cbrecursion(paramArrayOfbyte, paramLong1, paramLong2 * 2L, null, (int)(paramLong4 + paramLong4 / 4L) * 2, paramLong3 - 1L, paramLong4 / 2L, paramArrayOfint);
    cbrecursion(paramArrayOfbyte, paramLong1 + paramLong2, paramLong2 * 2L, null, (int)((paramLong4 + paramLong4 / 4L) * 2L + paramLong4 / 2L), paramLong3 - 1L, paramLong4 / 2L, paramArrayOfint);
  }
  
  private int pk_gen(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int[] paramArrayOfint, short[] paramArrayOfshort, long[] paramArrayOflong) {
    short[] arrayOfShort1 = new short[this.SYS_T + 1];
    arrayOfShort1[this.SYS_T] = 1;
    int i;
    for (i = 0; i < this.SYS_T; i++)
      arrayOfShort1[i] = Utils.load_gf(paramArrayOfbyte2, 40 + i * 2, this.GFMASK); 
    long[] arrayOfLong = new long[1 << this.GFBITS];
    for (i = 0; i < 1 << this.GFBITS; i++) {
      arrayOfLong[i] = paramArrayOfint[i];
      arrayOfLong[i] = arrayOfLong[i] << 31L;
      arrayOfLong[i] = arrayOfLong[i] | i;
      arrayOfLong[i] = arrayOfLong[i] & Long.MAX_VALUE;
    } 
    sort64(arrayOfLong, 0, arrayOfLong.length);
    for (i = 1; i < 1 << this.GFBITS; i++) {
      if (arrayOfLong[i - 1] >> 31L == arrayOfLong[i] >> 31L)
        return -1; 
    } 
    short[] arrayOfShort2 = new short[this.SYS_N];
    for (i = 0; i < 1 << this.GFBITS; i++)
      paramArrayOfshort[i] = (short)(int)(arrayOfLong[i] & this.GFMASK); 
    for (i = 0; i < this.SYS_N; i++)
      arrayOfShort2[i] = Utils.bitrev(paramArrayOfshort[i], this.GFBITS); 
    short[] arrayOfShort3 = new short[this.SYS_N];
    root(arrayOfShort3, arrayOfShort1, arrayOfShort2);
    for (i = 0; i < this.SYS_N; i++)
      arrayOfShort3[i] = this.gf.gf_inv(arrayOfShort3[i]); 
    byte[][] arrayOfByte = new byte[this.PK_NROWS][this.SYS_N / 8];
    for (i = 0; i < this.PK_NROWS; i++) {
      for (byte b1 = 0; b1 < this.SYS_N / 8; b1++)
        arrayOfByte[i][b1] = 0; 
    } 
    for (i = 0; i < this.SYS_T; i++) {
      byte b1;
      for (b1 = 0; b1 < this.SYS_N; b1 += 8) {
        for (byte b2 = 0; b2 < this.GFBITS; b2++) {
          byte b3 = (byte)(arrayOfShort3[b1 + 7] >>> b2 & 0x1);
          b3 = (byte)(b3 << 1);
          b3 = (byte)(b3 | arrayOfShort3[b1 + 6] >>> b2 & 0x1);
          b3 = (byte)(b3 << 1);
          b3 = (byte)(b3 | arrayOfShort3[b1 + 5] >>> b2 & 0x1);
          b3 = (byte)(b3 << 1);
          b3 = (byte)(b3 | arrayOfShort3[b1 + 4] >>> b2 & 0x1);
          b3 = (byte)(b3 << 1);
          b3 = (byte)(b3 | arrayOfShort3[b1 + 3] >>> b2 & 0x1);
          b3 = (byte)(b3 << 1);
          b3 = (byte)(b3 | arrayOfShort3[b1 + 2] >>> b2 & 0x1);
          b3 = (byte)(b3 << 1);
          b3 = (byte)(b3 | arrayOfShort3[b1 + 1] >>> b2 & 0x1);
          b3 = (byte)(b3 << 1);
          b3 = (byte)(b3 | arrayOfShort3[b1 + 0] >>> b2 & 0x1);
          arrayOfByte[i * this.GFBITS + b2][b1 / 8] = b3;
        } 
      } 
      for (b1 = 0; b1 < this.SYS_N; b1++)
        arrayOfShort3[b1] = this.gf.gf_mul(arrayOfShort3[b1], arrayOfShort2[b1]); 
    } 
    for (byte b = 0; b < this.PK_NROWS; b++) {
      i = b >>> 3;
      int j = b & 0x7;
      if (this.usePivots && b == this.PK_NROWS - 32 && mov_columns(arrayOfByte, paramArrayOfshort, paramArrayOflong) != 0)
        return -1; 
      int k;
      for (k = b + 1; k < this.PK_NROWS; k++) {
        byte b2 = (byte)(arrayOfByte[b][i] ^ arrayOfByte[k][i]);
        b2 = (byte)(b2 >> j);
        b2 = (byte)(b2 & 0x1);
        b2 = (byte)-b2;
        for (byte b1 = 0; b1 < this.SYS_N / 8; b1++)
          arrayOfByte[b][b1] = (byte)(arrayOfByte[b][b1] ^ arrayOfByte[k][b1] & b2); 
      } 
      if ((arrayOfByte[b][i] >> j & 0x1) == 0)
        return -1; 
      for (k = 0; k < this.PK_NROWS; k++) {
        if (k != b) {
          byte b2 = (byte)(arrayOfByte[k][i] >> j);
          b2 = (byte)(b2 & 0x1);
          b2 = (byte)-b2;
          for (byte b1 = 0; b1 < this.SYS_N / 8; b1++)
            arrayOfByte[k][b1] = (byte)(arrayOfByte[k][b1] ^ arrayOfByte[b][b1] & b2); 
        } 
      } 
    } 
    if (paramArrayOfbyte1 != null)
      if (this.usePadding) {
        int j = 0;
        int k = this.PK_NROWS % 8;
        if (k == 0) {
          System.arraycopy(arrayOfByte[i], (this.PK_NROWS - 1) / 8, paramArrayOfbyte1, j, this.SYS_N / 8);
          j += this.SYS_N / 8;
        } else {
          for (i = 0; i < this.PK_NROWS; i++) {
            int m;
            for (m = (this.PK_NROWS - 1) / 8; m < this.SYS_N / 8 - 1; m++)
              paramArrayOfbyte1[j++] = (byte)((arrayOfByte[i][m] & 0xFF) >>> k | arrayOfByte[i][m + 1] << 8 - k); 
            paramArrayOfbyte1[j++] = (byte)((arrayOfByte[i][m] & 0xFF) >>> k);
          } 
        } 
      } else {
        int j = (this.SYS_N - this.PK_NROWS + 7) / 8;
        for (i = 0; i < this.PK_NROWS; i++)
          System.arraycopy(arrayOfByte[i], this.PK_NROWS / 8, paramArrayOfbyte1, j * i, j); 
      }  
    return 0;
  }
  
  private short eval(short[] paramArrayOfshort, short paramShort) {
    short s = paramArrayOfshort[this.SYS_T];
    for (int i = this.SYS_T - 1; i >= 0; i--)
      s = (short)(this.gf.gf_mul(s, paramShort) ^ paramArrayOfshort[i]); 
    return s;
  }
  
  private void root(short[] paramArrayOfshort1, short[] paramArrayOfshort2, short[] paramArrayOfshort3) {
    for (byte b = 0; b < this.SYS_N; b++)
      paramArrayOfshort1[b] = eval(paramArrayOfshort2, paramArrayOfshort3[b]); 
  }
  
  private int generate_irr_poly(short[] paramArrayOfshort) {
    short[][] arrayOfShort = new short[this.SYS_T + 1][this.SYS_T];
    arrayOfShort[0][0] = 1;
    System.arraycopy(paramArrayOfshort, 0, arrayOfShort[1], 0, this.SYS_T);
    int[] arrayOfInt = new int[this.SYS_T * 2 - 1];
    int i;
    for (i = 2; i < this.SYS_T; i += 2) {
      this.gf.gf_sqr_poly(this.SYS_T, this.poly, arrayOfShort[i], arrayOfShort[i >>> 1], arrayOfInt);
      this.gf.gf_mul_poly(this.SYS_T, this.poly, arrayOfShort[i + 1], arrayOfShort[i], paramArrayOfshort, arrayOfInt);
    } 
    if (i == this.SYS_T)
      this.gf.gf_sqr_poly(this.SYS_T, this.poly, arrayOfShort[i], arrayOfShort[i >>> 1], arrayOfInt); 
    for (byte b = 0; b < this.SYS_T; b++) {
      for (i = b + 1; i < this.SYS_T; i++) {
        short s = this.gf.gf_iszero(arrayOfShort[b][b]);
        for (byte b2 = b; b2 < this.SYS_T + 1; b2++)
          arrayOfShort[b2][b] = (short)(arrayOfShort[b2][b] ^ (short)(arrayOfShort[b2][i] & s)); 
      } 
      if (arrayOfShort[b][b] == 0)
        return -1; 
      i = this.gf.gf_inv(arrayOfShort[b][b]);
      byte b1;
      for (b1 = b; b1 < this.SYS_T + 1; b1++)
        arrayOfShort[b1][b] = this.gf.gf_mul(arrayOfShort[b1][b], i); 
      for (b1 = 0; b1 < this.SYS_T; b1++) {
        if (b1 != b) {
          short s = arrayOfShort[b][b1];
          for (byte b2 = b; b2 <= this.SYS_T; b2++)
            arrayOfShort[b2][b1] = (short)(arrayOfShort[b2][b1] ^ this.gf.gf_mul(arrayOfShort[b2][b], s)); 
        } 
      } 
    } 
    System.arraycopy(arrayOfShort[this.SYS_T], 0, paramArrayOfshort, 0, this.SYS_T);
    return 0;
  }
  
  int check_pk_padding(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    for (byte b = 0; b < this.PK_NROWS; b++)
      b1 = (byte)(b1 | paramArrayOfbyte[b * this.PK_ROW_BYTES + this.PK_ROW_BYTES - 1]); 
    b1 = (byte)((b1 & 0xFF) >>> this.PK_NCOLS % 8);
    b1 = (byte)(b1 - 1);
    b1 = (byte)((b1 & 0xFF) >>> 7);
    byte b2 = b1;
    return b2 - 1;
  }
  
  int check_c_padding(byte[] paramArrayOfbyte) {
    byte b = (byte)((paramArrayOfbyte[this.SYND_BYTES - 1] & 0xFF) >>> this.PK_NROWS % 8);
    b = (byte)(b - 1);
    b = (byte)((b & 0xFF) >>> 7);
    byte b1 = b;
    return b1 - 1;
  }
  
  public int getDefaultSessionKeySize() {
    return this.defaultKeySize;
  }
  
  private static void sort32(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    int k = paramInt2 - paramInt1;
    if (k < 2)
      return; 
    int i;
    for (i = 1; i < k - i; i += i);
    int j;
    for (j = i; j > 0; j >>>= 1) {
      byte b;
      for (b = 0; b < k - j; b++) {
        if ((b & j) == 0) {
          int n = paramArrayOfint[paramInt1 + b + j] ^ paramArrayOfint[paramInt1 + b];
          int i1 = paramArrayOfint[paramInt1 + b + j] - paramArrayOfint[paramInt1 + b];
          i1 ^= n & (i1 ^ paramArrayOfint[paramInt1 + b + j]);
          i1 >>= 31;
          i1 &= n;
          paramArrayOfint[paramInt1 + b] = paramArrayOfint[paramInt1 + b] ^ i1;
          paramArrayOfint[paramInt1 + b + j] = paramArrayOfint[paramInt1 + b + j] ^ i1;
        } 
      } 
      b = 0;
      int m;
      for (m = i; m > j; m >>>= 1) {
        while (b < k - m) {
          if ((b & j) == 0) {
            int i1 = paramArrayOfint[paramInt1 + b + j];
            int n;
            for (n = m; n > j; n >>>= 1) {
              int i2 = paramArrayOfint[paramInt1 + b + n] ^ i1;
              int i3 = paramArrayOfint[paramInt1 + b + n] - i1;
              i3 ^= i2 & (i3 ^ paramArrayOfint[paramInt1 + b + n]);
              i3 >>= 31;
              i3 &= i2;
              i1 ^= i3;
              paramArrayOfint[paramInt1 + b + n] = paramArrayOfint[paramInt1 + b + n] ^ i3;
            } 
            paramArrayOfint[paramInt1 + b + j] = i1;
          } 
          b++;
        } 
      } 
    } 
  }
  
  private static void sort64(long[] paramArrayOflong, int paramInt1, int paramInt2) {
    int k = paramInt2 - paramInt1;
    if (k < 2)
      return; 
    int i;
    for (i = 1; i < k - i; i += i);
    int j;
    for (j = i; j > 0; j >>>= 1) {
      byte b;
      for (b = 0; b < k - j; b++) {
        if ((b & j) == 0) {
          long l = paramArrayOflong[paramInt1 + b + j] - paramArrayOflong[paramInt1 + b];
          l >>>= 63L;
          l = -l;
          l &= paramArrayOflong[paramInt1 + b] ^ paramArrayOflong[paramInt1 + b + j];
          paramArrayOflong[paramInt1 + b] = paramArrayOflong[paramInt1 + b] ^ l;
          paramArrayOflong[paramInt1 + b + j] = paramArrayOflong[paramInt1 + b + j] ^ l;
        } 
      } 
      b = 0;
      int m;
      for (m = i; m > j; m >>>= 1) {
        while (b < k - m) {
          if ((b & j) == 0) {
            long l = paramArrayOflong[paramInt1 + b + j];
            int n;
            for (n = m; n > j; n >>>= 1) {
              long l1 = paramArrayOflong[paramInt1 + b + n] - l;
              l1 >>>= 63L;
              l1 = -l1;
              l1 &= l ^ paramArrayOflong[paramInt1 + b + n];
              l ^= l1;
              paramArrayOflong[paramInt1 + b + n] = paramArrayOflong[paramInt1 + b + n] ^ l1;
            } 
            paramArrayOflong[paramInt1 + b + j] = l;
          } 
          b++;
        } 
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\cmce\CMCEEngine.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */