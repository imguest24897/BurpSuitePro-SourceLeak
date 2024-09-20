package META-INF.versions.9.org.bouncycastle.pqc.crypto.frodo;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

class FrodoEngine {
  static final int nbar = 8;
  
  private static final int mbar = 8;
  
  private static final int len_seedA = 128;
  
  private static final int len_z = 128;
  
  private static final int len_chi = 16;
  
  private static final int len_seedA_bytes = 16;
  
  private static final int len_z_bytes = 16;
  
  private static final int len_chi_bytes = 2;
  
  private final int D;
  
  private final int q;
  
  private final int n;
  
  private final int B;
  
  private final int len_sk_bytes;
  
  private final int len_pk_bytes;
  
  private final int len_ct_bytes;
  
  private final short[] T_chi;
  
  private final int len_mu;
  
  private final int len_seedSE;
  
  private final int len_s;
  
  private final int len_k;
  
  private final int len_pkh;
  
  private final int len_ss;
  
  private final int len_mu_bytes;
  
  private final int len_seedSE_bytes;
  
  private final int len_s_bytes;
  
  private final int len_k_bytes;
  
  private final int len_pkh_bytes;
  
  private final int len_ss_bytes;
  
  private final Xof digest;
  
  private final FrodoMatrixGenerator gen;
  
  public int getCipherTextSize() {
    return this.len_ct_bytes;
  }
  
  public int getSessionKeySize() {
    return this.len_ss_bytes;
  }
  
  public int getPrivateKeySize() {
    return this.len_sk_bytes;
  }
  
  public int getPublicKeySize() {
    return this.len_pk_bytes;
  }
  
  public FrodoEngine(int paramInt1, int paramInt2, int paramInt3, short[] paramArrayOfshort, Xof paramXof, FrodoMatrixGenerator paramFrodoMatrixGenerator) {
    this.n = paramInt1;
    this.D = paramInt2;
    this.q = 1 << paramInt2;
    this.B = paramInt3;
    this.len_mu = paramInt3 * 8 * 8;
    this.len_seedSE = this.len_mu;
    this.len_s = this.len_mu;
    this.len_k = this.len_mu;
    this.len_pkh = this.len_mu;
    this.len_ss = this.len_mu;
    this.len_mu_bytes = this.len_mu / 8;
    this.len_seedSE_bytes = this.len_seedSE / 8;
    this.len_s_bytes = this.len_s / 8;
    this.len_k_bytes = this.len_k / 8;
    this.len_pkh_bytes = this.len_pkh / 8;
    this.len_ss_bytes = this.len_ss / 8;
    this.len_ct_bytes = paramInt2 * paramInt1 * 8 / 8 + paramInt2 * 8 * 8 / 8;
    this.len_pk_bytes = 16 + paramInt2 * paramInt1 * 8 / 8;
    this.len_sk_bytes = this.len_s_bytes + this.len_pk_bytes + 2 * paramInt1 * 8 + this.len_pkh_bytes;
    this.T_chi = paramArrayOfshort;
    this.digest = paramXof;
    this.gen = paramFrodoMatrixGenerator;
  }
  
  private short sample(short paramShort) {
    short s = (short)((paramShort & 0xFFFF) >>> 1);
    short s1 = 0;
    for (byte b = 0; b < this.T_chi.length; b++) {
      if (s > this.T_chi[b])
        s1 = (short)(s1 + 1); 
    } 
    if ((paramShort & 0xFFFF) % 2 == 1)
      s1 = (short)(s1 * -1 & 0xFFFF); 
    return s1;
  }
  
  private short[] sample_matrix(short[] paramArrayOfshort, int paramInt1, int paramInt2, int paramInt3) {
    short[] arrayOfShort = new short[paramInt2 * paramInt3];
    for (byte b = 0; b < paramInt2; b++) {
      for (byte b1 = 0; b1 < paramInt3; b1++)
        arrayOfShort[b * paramInt3 + b1] = sample(paramArrayOfshort[b * paramInt3 + b1 + paramInt1]); 
    } 
    return arrayOfShort;
  }
  
  private short[] matrix_transpose(short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    short[] arrayOfShort = new short[paramInt1 * paramInt2];
    for (byte b = 0; b < paramInt2; b++) {
      for (byte b1 = 0; b1 < paramInt1; b1++)
        arrayOfShort[b * paramInt1 + b1] = paramArrayOfshort[b1 * paramInt2 + b]; 
    } 
    return arrayOfShort;
  }
  
  private short[] matrix_mul(short[] paramArrayOfshort1, int paramInt1, int paramInt2, short[] paramArrayOfshort2, int paramInt3, int paramInt4) {
    int i = this.q - 1;
    short[] arrayOfShort = new short[paramInt1 * paramInt4];
    for (byte b = 0; b < paramInt1; b++) {
      for (byte b1 = 0; b1 < paramInt4; b1++) {
        int j = 0;
        for (byte b2 = 0; b2 < paramInt2; b2++)
          j += paramArrayOfshort1[b * paramInt2 + b2] * paramArrayOfshort2[b2 * paramInt4 + b1]; 
        arrayOfShort[b * paramInt4 + b1] = (short)(j & i);
      } 
    } 
    return arrayOfShort;
  }
  
  private short[] matrix_add(short[] paramArrayOfshort1, short[] paramArrayOfshort2, int paramInt1, int paramInt2) {
    int i = this.q - 1;
    short[] arrayOfShort = new short[paramInt1 * paramInt2];
    for (byte b = 0; b < paramInt1; b++) {
      for (byte b1 = 0; b1 < paramInt2; b1++)
        arrayOfShort[b * paramInt2 + b1] = (short)(paramArrayOfshort1[b * paramInt2 + b1] + paramArrayOfshort2[b * paramInt2 + b1] & i); 
    } 
    return arrayOfShort;
  }
  
  private byte[] pack(short[] paramArrayOfshort) {
    int i = paramArrayOfshort.length;
    byte[] arrayOfByte = new byte[this.D * i / 8];
    short s1 = 0;
    short s2 = 0;
    short s3 = 0;
    byte b = 0;
    while (s1 < arrayOfByte.length && (s2 < i || (s2 == i && b))) {
      byte b1 = 0;
      while (b1 < 8) {
        int j = Math.min(8 - b1, b);
        short s = (short)((1 << j) - 1);
        byte b2 = (byte)(s3 >> b - j & s);
        arrayOfByte[s1] = (byte)(arrayOfByte[s1] + (b2 << 8 - b1 - j));
        b1 = (byte)(b1 + j);
        b = (byte)(b - j);
        if (b == 0) {
          if (s2 < i) {
            s3 = paramArrayOfshort[s2];
            b = (byte)this.D;
            s2 = (short)(s2 + 1);
            continue;
          } 
          break;
        } 
      } 
      if (b1 == 8)
        s1 = (short)(s1 + 1); 
    } 
    return arrayOfByte;
  }
  
  public void kem_keypair(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, SecureRandom paramSecureRandom) {
    byte[] arrayOfByte1 = new byte[this.len_s_bytes + this.len_seedSE_bytes + 16];
    paramSecureRandom.nextBytes(arrayOfByte1);
    byte[] arrayOfByte2 = Arrays.copyOfRange(arrayOfByte1, 0, this.len_s_bytes);
    byte[] arrayOfByte3 = Arrays.copyOfRange(arrayOfByte1, this.len_s_bytes, this.len_s_bytes + this.len_seedSE_bytes);
    byte[] arrayOfByte4 = Arrays.copyOfRange(arrayOfByte1, this.len_s_bytes + this.len_seedSE_bytes, this.len_s_bytes + this.len_seedSE_bytes + 16);
    byte[] arrayOfByte5 = new byte[16];
    this.digest.update(arrayOfByte4, 0, arrayOfByte4.length);
    this.digest.doFinal(arrayOfByte5, 0, arrayOfByte5.length);
    short[] arrayOfShort1 = this.gen.genMatrix(arrayOfByte5);
    byte[] arrayOfByte6 = new byte[2 * this.n * 8 * 2];
    this.digest.update((byte)95);
    this.digest.update(arrayOfByte3, 0, arrayOfByte3.length);
    this.digest.doFinal(arrayOfByte6, 0, arrayOfByte6.length);
    short[] arrayOfShort2 = new short[2 * this.n * 8];
    for (byte b1 = 0; b1 < arrayOfShort2.length; b1++)
      arrayOfShort2[b1] = Pack.littleEndianToShort(arrayOfByte6, b1 * 2); 
    short[] arrayOfShort3 = sample_matrix(arrayOfShort2, 0, 8, this.n);
    short[] arrayOfShort4 = matrix_transpose(arrayOfShort3, 8, this.n);
    short[] arrayOfShort5 = sample_matrix(arrayOfShort2, this.n * 8, this.n, 8);
    short[] arrayOfShort6 = matrix_add(matrix_mul(arrayOfShort1, this.n, this.n, arrayOfShort4, this.n, 8), arrayOfShort5, this.n, 8);
    byte[] arrayOfByte7 = pack(arrayOfShort6);
    System.arraycopy(Arrays.concatenate(arrayOfByte5, arrayOfByte7), 0, paramArrayOfbyte1, 0, this.len_pk_bytes);
    byte[] arrayOfByte8 = new byte[this.len_pkh_bytes];
    this.digest.update(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    this.digest.doFinal(arrayOfByte8, 0, arrayOfByte8.length);
    System.arraycopy(Arrays.concatenate(arrayOfByte2, paramArrayOfbyte1), 0, paramArrayOfbyte2, 0, this.len_s_bytes + this.len_pk_bytes);
    for (byte b2 = 0; b2 < 8; b2++) {
      for (byte b = 0; b < this.n; b++)
        System.arraycopy(Pack.shortToLittleEndian(arrayOfShort3[b2 * this.n + b]), 0, paramArrayOfbyte2, this.len_s_bytes + this.len_pk_bytes + b2 * this.n * 2 + b * 2, 2); 
    } 
    System.arraycopy(arrayOfByte8, 0, paramArrayOfbyte2, this.len_sk_bytes - this.len_pkh_bytes, this.len_pkh_bytes);
  }
  
  private short[] unpack(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    short[] arrayOfShort = new short[paramInt1 * paramInt2];
    short s1 = 0;
    short s2 = 0;
    byte b1 = 0;
    byte b2 = 0;
    while (s1 < arrayOfShort.length && (s2 < paramArrayOfbyte.length || (s2 == paramArrayOfbyte.length && b2))) {
      byte b = 0;
      while (b < this.D) {
        int i = Math.min(this.D - b, b2);
        short s = (short)((1 << i) - 1 & 0xFFFF);
        byte b3 = (byte)((b1 & 0xFF) >>> (b2 & 0xFF) - i & s & 0xFFFF & 0xFF);
        arrayOfShort[s1] = (short)((arrayOfShort[s1] & 0xFFFF) + ((b3 & 0xFF) << this.D - (b & 0xFF) - i) & 0xFFFF);
        b = (byte)(b + i);
        b2 = (byte)(b2 - i);
        b1 = (byte)(b1 & (s << b2 ^ 0xFFFFFFFF));
        if (b2 == 0) {
          if (s2 < paramArrayOfbyte.length) {
            b1 = paramArrayOfbyte[s2];
            b2 = 8;
            s2 = (short)(s2 + 1);
            continue;
          } 
          break;
        } 
      } 
      if (b == this.D)
        s1 = (short)(s1 + 1); 
    } 
    return arrayOfShort;
  }
  
  private short[] encode(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    byte b = 1;
    short[] arrayOfShort = new short[64];
    for (byte b2 = 0; b2 < 8; b2++) {
      for (byte b3 = 0; b3 < 8; b3++) {
        int i = 0;
        for (byte b4 = 0; b4 < this.B; b4++) {
          byte b5 = ((paramArrayOfbyte[b1] & b) == b) ? 1 : 0;
          i += (1 << b4) * b5;
          b = (byte)(b << 1);
          if (b == 0) {
            b = 1;
            b1++;
          } 
        } 
        arrayOfShort[b2 * 8 + b3] = (short)(i * this.q / (1 << this.B));
      } 
    } 
    return arrayOfShort;
  }
  
  public void kem_enc(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, SecureRandom paramSecureRandom) {
    byte[] arrayOfByte1 = Arrays.copyOfRange(paramArrayOfbyte3, 0, 16);
    byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfbyte3, 16, this.len_pk_bytes);
    byte[] arrayOfByte3 = new byte[this.len_mu_bytes];
    paramSecureRandom.nextBytes(arrayOfByte3);
    byte[] arrayOfByte4 = new byte[this.len_pkh_bytes];
    this.digest.update(paramArrayOfbyte3, 0, this.len_pk_bytes);
    this.digest.doFinal(arrayOfByte4, 0, this.len_pkh_bytes);
    byte[] arrayOfByte5 = new byte[this.len_seedSE + this.len_k];
    this.digest.update(arrayOfByte4, 0, this.len_pkh_bytes);
    this.digest.update(arrayOfByte3, 0, this.len_mu_bytes);
    this.digest.doFinal(arrayOfByte5, 0, this.len_seedSE_bytes + this.len_k_bytes);
    byte[] arrayOfByte6 = Arrays.copyOfRange(arrayOfByte5, 0, this.len_seedSE_bytes);
    byte[] arrayOfByte7 = Arrays.copyOfRange(arrayOfByte5, this.len_seedSE_bytes, this.len_seedSE_bytes + this.len_k_bytes);
    byte[] arrayOfByte8 = new byte[(16 * this.n + 64) * 2];
    this.digest.update((byte)-106);
    this.digest.update(arrayOfByte6, 0, arrayOfByte6.length);
    this.digest.doFinal(arrayOfByte8, 0, arrayOfByte8.length);
    short[] arrayOfShort1 = new short[arrayOfByte8.length / 2];
    for (byte b = 0; b < arrayOfShort1.length; b++)
      arrayOfShort1[b] = Pack.littleEndianToShort(arrayOfByte8, b * 2); 
    short[] arrayOfShort2 = sample_matrix(arrayOfShort1, 0, 8, this.n);
    short[] arrayOfShort3 = sample_matrix(arrayOfShort1, 8 * this.n, 8, this.n);
    short[] arrayOfShort4 = this.gen.genMatrix(arrayOfByte1);
    short[] arrayOfShort5 = matrix_add(matrix_mul(arrayOfShort2, 8, this.n, arrayOfShort4, this.n, this.n), arrayOfShort3, 8, this.n);
    byte[] arrayOfByte9 = pack(arrayOfShort5);
    short[] arrayOfShort6 = sample_matrix(arrayOfShort1, 16 * this.n, 8, 8);
    short[] arrayOfShort7 = unpack(arrayOfByte2, this.n, 8);
    short[] arrayOfShort8 = matrix_add(matrix_mul(arrayOfShort2, 8, this.n, arrayOfShort7, this.n, 8), arrayOfShort6, 8, 8);
    short[] arrayOfShort9 = encode(arrayOfByte3);
    short[] arrayOfShort10 = matrix_add(arrayOfShort8, arrayOfShort9, 8, 8);
    byte[] arrayOfByte10 = pack(arrayOfShort10);
    System.arraycopy(Arrays.concatenate(arrayOfByte9, arrayOfByte10), 0, paramArrayOfbyte1, 0, this.len_ct_bytes);
    this.digest.update(arrayOfByte9, 0, arrayOfByte9.length);
    this.digest.update(arrayOfByte10, 0, arrayOfByte10.length);
    this.digest.update(arrayOfByte7, 0, this.len_k_bytes);
    this.digest.doFinal(paramArrayOfbyte2, 0, this.len_s_bytes);
  }
  
  private short[] matrix_sub(short[] paramArrayOfshort1, short[] paramArrayOfshort2, int paramInt1, int paramInt2) {
    int i = this.q - 1;
    short[] arrayOfShort = new short[paramInt1 * paramInt2];
    for (byte b = 0; b < paramInt1; b++) {
      for (byte b1 = 0; b1 < paramInt2; b1++)
        arrayOfShort[b * paramInt2 + b1] = (short)(paramArrayOfshort1[b * paramInt2 + b1] - paramArrayOfshort2[b * paramInt2 + b1] & i); 
    } 
    return arrayOfShort;
  }
  
  private byte[] decode(short[] paramArrayOfshort) {
    byte b2 = 0;
    byte b3 = 8;
    byte b4 = 8;
    short s1 = (short)((1 << this.B) - 1);
    short s2 = (short)((1 << this.D) - 1);
    byte[] arrayOfByte = new byte[b3 * this.B];
    for (byte b1 = 0; b1 < b4; b1++) {
      long l = 0L;
      byte b;
      for (b = 0; b < b3; b++) {
        short s = (short)((paramArrayOfshort[b2] & s2) + (1 << this.D - this.B - 1) >> this.D - this.B);
        l |= (s & s1) << this.B * b;
        b2++;
      } 
      for (b = 0; b < this.B; b++)
        arrayOfByte[b1 * this.B + b] = (byte)(int)(l >> 8 * b & 0xFFL); 
    } 
    return arrayOfByte;
  }
  
  private short ctverify(short[] paramArrayOfshort1, short[] paramArrayOfshort2, short[] paramArrayOfshort3, short[] paramArrayOfshort4) {
    short s1 = 0;
    short s2;
    for (s2 = 0; s2 < paramArrayOfshort1.length; s2 = (short)(s2 + 1))
      s1 = (short)(s1 | paramArrayOfshort1[s2] ^ paramArrayOfshort3[s2]); 
    for (s2 = 0; s2 < paramArrayOfshort2.length; s2 = (short)(s2 + 1))
      s1 = (short)(s1 | paramArrayOfshort2[s2] ^ paramArrayOfshort4[s2]); 
    return (s1 == 0) ? 0 : -1;
  }
  
  private byte[] ctselect(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, short paramShort) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte1.length];
    for (byte b = 0; b < paramArrayOfbyte1.length; b++)
      arrayOfByte[b] = (byte)((paramShort ^ 0xFFFFFFFF) & paramArrayOfbyte1[b] & 0xFF | paramShort & paramArrayOfbyte2[b] & 0xFF); 
    return arrayOfByte;
  }
  
  public void kem_dec(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    int i = 0;
    int j = 8 * this.n * this.D / 8;
    byte[] arrayOfByte1 = Arrays.copyOfRange(paramArrayOfbyte2, i, i + j);
    i += j;
    j = 64 * this.D / 8;
    byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfbyte2, i, i + j);
    i = 0;
    j = this.len_s_bytes;
    byte[] arrayOfByte3 = Arrays.copyOfRange(paramArrayOfbyte3, i, i + j);
    i += j;
    j = 16;
    byte[] arrayOfByte4 = Arrays.copyOfRange(paramArrayOfbyte3, i, i + j);
    i += j;
    j = this.D * this.n * 8 / 8;
    byte[] arrayOfByte5 = Arrays.copyOfRange(paramArrayOfbyte3, i, i + j);
    i += j;
    j = this.n * 8 * 16 / 8;
    byte[] arrayOfByte6 = Arrays.copyOfRange(paramArrayOfbyte3, i, i + j);
    short[] arrayOfShort1 = new short[8 * this.n];
    for (byte b1 = 0; b1 < 8; b1++) {
      for (byte b = 0; b < this.n; b++)
        arrayOfShort1[b1 * this.n + b] = Pack.littleEndianToShort(arrayOfByte6, b1 * this.n * 2 + b * 2); 
    } 
    short[] arrayOfShort2 = matrix_transpose(arrayOfShort1, 8, this.n);
    i += j;
    j = this.len_pkh_bytes;
    byte[] arrayOfByte7 = Arrays.copyOfRange(paramArrayOfbyte3, i, i + j);
    short[] arrayOfShort3 = unpack(arrayOfByte1, 8, this.n);
    short[] arrayOfShort4 = unpack(arrayOfByte2, 8, 8);
    short[] arrayOfShort5 = matrix_mul(arrayOfShort3, 8, this.n, arrayOfShort2, this.n, 8);
    short[] arrayOfShort6 = matrix_sub(arrayOfShort4, arrayOfShort5, 8, 8);
    byte[] arrayOfByte8 = decode(arrayOfShort6);
    byte[] arrayOfByte9 = new byte[this.len_seedSE_bytes + this.len_k_bytes];
    this.digest.update(arrayOfByte7, 0, this.len_pkh_bytes);
    this.digest.update(arrayOfByte8, 0, this.len_mu_bytes);
    this.digest.doFinal(arrayOfByte9, 0, this.len_seedSE_bytes + this.len_k_bytes);
    byte[] arrayOfByte10 = Arrays.copyOfRange(arrayOfByte9, this.len_seedSE_bytes, this.len_seedSE_bytes + this.len_k_bytes);
    byte[] arrayOfByte11 = new byte[(16 * this.n + 64) * 2];
    this.digest.update((byte)-106);
    this.digest.update(arrayOfByte9, 0, this.len_seedSE_bytes);
    this.digest.doFinal(arrayOfByte11, 0, arrayOfByte11.length);
    short[] arrayOfShort7 = new short[16 * this.n + 64];
    for (byte b2 = 0; b2 < arrayOfShort7.length; b2++)
      arrayOfShort7[b2] = Pack.littleEndianToShort(arrayOfByte11, b2 * 2); 
    short[] arrayOfShort8 = sample_matrix(arrayOfShort7, 0, 8, this.n);
    short[] arrayOfShort9 = sample_matrix(arrayOfShort7, 8 * this.n, 8, this.n);
    short[] arrayOfShort10 = this.gen.genMatrix(arrayOfByte4);
    short[] arrayOfShort11 = matrix_add(matrix_mul(arrayOfShort8, 8, this.n, arrayOfShort10, this.n, this.n), arrayOfShort9, 8, this.n);
    short[] arrayOfShort12 = sample_matrix(arrayOfShort7, 16 * this.n, 8, 8);
    short[] arrayOfShort13 = unpack(arrayOfByte5, this.n, 8);
    short[] arrayOfShort14 = matrix_add(matrix_mul(arrayOfShort8, 8, this.n, arrayOfShort13, this.n, 8), arrayOfShort12, 8, 8);
    short[] arrayOfShort15 = matrix_add(arrayOfShort14, encode(arrayOfByte8), 8, 8);
    short s = ctverify(arrayOfShort3, arrayOfShort4, arrayOfShort11, arrayOfShort15);
    byte[] arrayOfByte12 = ctselect(arrayOfByte10, arrayOfByte3, s);
    this.digest.update(arrayOfByte1, 0, arrayOfByte1.length);
    this.digest.update(arrayOfByte2, 0, arrayOfByte2.length);
    this.digest.update(arrayOfByte12, 0, arrayOfByte12.length);
    this.digest.doFinal(paramArrayOfbyte1, 0, this.len_ss_bytes);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\frodo\FrodoEngine.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */