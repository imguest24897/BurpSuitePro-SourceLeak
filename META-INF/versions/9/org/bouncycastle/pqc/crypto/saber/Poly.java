package META-INF.versions.9.org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.pqc.crypto.saber.SABEREngine;
import org.bouncycastle.pqc.crypto.saber.Utils;

class Poly {
  private static final int KARATSUBA_N = 64;
  
  private static int SCHB_N = 16;
  
  private final int N_RES;
  
  private final int N_SB;
  
  private final int N_SB_RES;
  
  private final int SABER_N;
  
  private final int SABER_L;
  
  private final SABEREngine engine;
  
  private final Utils utils;
  
  public Poly(SABEREngine paramSABEREngine) {
    this.engine = paramSABEREngine;
    this.SABER_L = paramSABEREngine.getSABER_L();
    this.SABER_N = paramSABEREngine.getSABER_N();
    this.N_RES = this.SABER_N << 1;
    this.N_SB = this.SABER_N >> 2;
    this.N_SB_RES = 2 * this.N_SB - 1;
    this.utils = paramSABEREngine.getUtils();
  }
  
  public void GenMatrix(short[][][] paramArrayOfshort, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[this.SABER_L * this.engine.getSABER_POLYVECBYTES()];
    this.engine.symmetric.prf(arrayOfByte, paramArrayOfbyte, this.engine.getSABER_SEEDBYTES(), arrayOfByte.length);
    for (byte b = 0; b < this.SABER_L; b++)
      this.utils.BS2POLVECq(arrayOfByte, b * this.engine.getSABER_POLYVECBYTES(), paramArrayOfshort[b]); 
  }
  
  public void GenSecret(short[][] paramArrayOfshort, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[this.SABER_L * this.engine.getSABER_POLYCOINBYTES()];
    this.engine.symmetric.prf(arrayOfByte, paramArrayOfbyte, this.engine.getSABER_NOISE_SEEDBYTES(), arrayOfByte.length);
    for (byte b = 0; b < this.SABER_L; b++) {
      if (!this.engine.usingEffectiveMasking) {
        cbd(paramArrayOfshort[b], arrayOfByte, b * this.engine.getSABER_POLYCOINBYTES());
      } else {
        for (byte b1 = 0; b1 < this.SABER_N / 4; b1++) {
          paramArrayOfshort[b][4 * b1] = (short)((arrayOfByte[b1 + b * this.engine.getSABER_POLYCOINBYTES()] & 0x3 ^ 0x2) - 2);
          paramArrayOfshort[b][4 * b1 + 1] = (short)((arrayOfByte[b1 + b * this.engine.getSABER_POLYCOINBYTES()] >>> 2 & 0x3 ^ 0x2) - 2);
          paramArrayOfshort[b][4 * b1 + 2] = (short)((arrayOfByte[b1 + b * this.engine.getSABER_POLYCOINBYTES()] >>> 4 & 0x3 ^ 0x2) - 2);
          paramArrayOfshort[b][4 * b1 + 3] = (short)((arrayOfByte[b1 + b * this.engine.getSABER_POLYCOINBYTES()] >>> 6 & 0x3 ^ 0x2) - 2);
        } 
      } 
    } 
  }
  
  private long load_littleendian(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = (paramArrayOfbyte[paramInt1 + 0] & 0xFF);
    for (byte b = 1; b < paramInt2; b++)
      l |= (paramArrayOfbyte[paramInt1 + b] & 0xFF) << 8 * b; 
    return l;
  }
  
  private void cbd(short[] paramArrayOfshort, byte[] paramArrayOfbyte, int paramInt) {
    int[] arrayOfInt1 = new int[4];
    int[] arrayOfInt2 = new int[4];
    if (this.engine.getSABER_MU() == 6) {
      for (byte b = 0; b < this.SABER_N / 4; b++) {
        int i = (int)load_littleendian(paramArrayOfbyte, paramInt + 3 * b, 3);
        int j = 0;
        for (byte b1 = 0; b1 < 3; b1++)
          j += i >> b1 & 0x249249; 
        arrayOfInt1[0] = j & 0x7;
        arrayOfInt2[0] = j >>> 3 & 0x7;
        arrayOfInt1[1] = j >>> 6 & 0x7;
        arrayOfInt2[1] = j >>> 9 & 0x7;
        arrayOfInt1[2] = j >>> 12 & 0x7;
        arrayOfInt2[2] = j >>> 15 & 0x7;
        arrayOfInt1[3] = j >>> 18 & 0x7;
        arrayOfInt2[3] = j >>> 21;
        paramArrayOfshort[4 * b + 0] = (short)(arrayOfInt1[0] - arrayOfInt2[0]);
        paramArrayOfshort[4 * b + 1] = (short)(arrayOfInt1[1] - arrayOfInt2[1]);
        paramArrayOfshort[4 * b + 2] = (short)(arrayOfInt1[2] - arrayOfInt2[2]);
        paramArrayOfshort[4 * b + 3] = (short)(arrayOfInt1[3] - arrayOfInt2[3]);
      } 
    } else if (this.engine.getSABER_MU() == 8) {
      for (byte b = 0; b < this.SABER_N / 4; b++) {
        int i = (int)load_littleendian(paramArrayOfbyte, paramInt + 4 * b, 4);
        int j = 0;
        for (byte b1 = 0; b1 < 4; b1++)
          j += i >>> b1 & 0x11111111; 
        arrayOfInt1[0] = j & 0xF;
        arrayOfInt2[0] = j >>> 4 & 0xF;
        arrayOfInt1[1] = j >>> 8 & 0xF;
        arrayOfInt2[1] = j >>> 12 & 0xF;
        arrayOfInt1[2] = j >>> 16 & 0xF;
        arrayOfInt2[2] = j >>> 20 & 0xF;
        arrayOfInt1[3] = j >>> 24 & 0xF;
        arrayOfInt2[3] = j >>> 28;
        paramArrayOfshort[4 * b + 0] = (short)(arrayOfInt1[0] - arrayOfInt2[0]);
        paramArrayOfshort[4 * b + 1] = (short)(arrayOfInt1[1] - arrayOfInt2[1]);
        paramArrayOfshort[4 * b + 2] = (short)(arrayOfInt1[2] - arrayOfInt2[2]);
        paramArrayOfshort[4 * b + 3] = (short)(arrayOfInt1[3] - arrayOfInt2[3]);
      } 
    } else if (this.engine.getSABER_MU() == 10) {
      for (byte b = 0; b < this.SABER_N / 4; b++) {
        long l1 = load_littleendian(paramArrayOfbyte, paramInt + 5 * b, 5);
        long l2 = 0L;
        for (byte b1 = 0; b1 < 5; b1++)
          l2 += l1 >>> b1 & 0x842108421L; 
        arrayOfInt1[0] = (int)(l2 & 0x1FL);
        arrayOfInt2[0] = (int)(l2 >>> 5L & 0x1FL);
        arrayOfInt1[1] = (int)(l2 >>> 10L & 0x1FL);
        arrayOfInt2[1] = (int)(l2 >>> 15L & 0x1FL);
        arrayOfInt1[2] = (int)(l2 >>> 20L & 0x1FL);
        arrayOfInt2[2] = (int)(l2 >>> 25L & 0x1FL);
        arrayOfInt1[3] = (int)(l2 >>> 30L & 0x1FL);
        arrayOfInt2[3] = (int)(l2 >>> 35L);
        paramArrayOfshort[4 * b + 0] = (short)(arrayOfInt1[0] - arrayOfInt2[0]);
        paramArrayOfshort[4 * b + 1] = (short)(arrayOfInt1[1] - arrayOfInt2[1]);
        paramArrayOfshort[4 * b + 2] = (short)(arrayOfInt1[2] - arrayOfInt2[2]);
        paramArrayOfshort[4 * b + 3] = (short)(arrayOfInt1[3] - arrayOfInt2[3]);
      } 
    } 
  }
  
  private short OVERFLOWING_MUL(int paramInt1, int paramInt2) {
    return (short)(paramInt1 * paramInt2);
  }
  
  private void karatsuba_simple(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int[] arrayOfInt1 = new int[31];
    int[] arrayOfInt2 = new int[31];
    int[] arrayOfInt3 = new int[31];
    int[] arrayOfInt4 = new int[63];
    byte b;
    for (b = 0; b < 16; b++) {
      int i = paramArrayOfint1[b];
      int j = paramArrayOfint1[b + 16];
      int k = paramArrayOfint1[b + 32];
      int m = paramArrayOfint1[b + 48];
      for (byte b1 = 0; b1 < 16; b1++) {
        int n = paramArrayOfint2[b1];
        int i1 = paramArrayOfint2[b1 + 16];
        paramArrayOfint3[b + b1 + 0] = paramArrayOfint3[b + b1 + 0] + OVERFLOWING_MUL(i, n);
        paramArrayOfint3[b + b1 + 32] = paramArrayOfint3[b + b1 + 32] + OVERFLOWING_MUL(j, i1);
        int i2 = n + i1;
        int i3 = i + j;
        arrayOfInt1[b + b1] = (int)(arrayOfInt1[b + b1] + i2 * i3);
        i2 = paramArrayOfint2[b1 + 32];
        i3 = paramArrayOfint2[b1 + 48];
        paramArrayOfint3[b + b1 + 64] = paramArrayOfint3[b + b1 + 64] + OVERFLOWING_MUL(i2, k);
        paramArrayOfint3[b + b1 + 96] = paramArrayOfint3[b + b1 + 96] + OVERFLOWING_MUL(i3, m);
        int i4 = k + m;
        int i5 = i2 + i3;
        arrayOfInt3[b + b1] = arrayOfInt3[b + b1] + OVERFLOWING_MUL(i4, i5);
        n += i2;
        i2 = i + k;
        arrayOfInt4[b + b1 + 0] = arrayOfInt4[b + b1 + 0] + OVERFLOWING_MUL(n, i2);
        i1 += i3;
        i3 = j + m;
        arrayOfInt4[b + b1 + 32] = arrayOfInt4[b + b1 + 32] + OVERFLOWING_MUL(i1, i3);
        n += i1;
        i2 += i3;
        arrayOfInt2[b + b1] = arrayOfInt2[b + b1] + OVERFLOWING_MUL(n, i2);
      } 
    } 
    for (b = 0; b < 31; b++) {
      arrayOfInt2[b] = arrayOfInt2[b] - arrayOfInt4[b + 0] - arrayOfInt4[b + 32];
      arrayOfInt1[b] = arrayOfInt1[b] - paramArrayOfint3[b + 0] - paramArrayOfint3[b + 32];
      arrayOfInt3[b] = arrayOfInt3[b] - paramArrayOfint3[b + 64] - paramArrayOfint3[b + 96];
    } 
    for (b = 0; b < 31; b++) {
      arrayOfInt4[b + 16] = arrayOfInt4[b + 16] + arrayOfInt2[b];
      paramArrayOfint3[b + 16] = paramArrayOfint3[b + 16] + arrayOfInt1[b];
      paramArrayOfint3[b + 80] = paramArrayOfint3[b + 80] + arrayOfInt3[b];
    } 
    for (b = 0; b < 63; b++)
      arrayOfInt4[b] = arrayOfInt4[b] - paramArrayOfint3[b] - paramArrayOfint3[b + 64]; 
    for (b = 0; b < 63; b++)
      paramArrayOfint3[b + 32] = paramArrayOfint3[b + 32] + arrayOfInt4[b]; 
  }
  
  private void toom_cook_4way(short[] paramArrayOfshort1, short[] paramArrayOfshort2, short[] paramArrayOfshort3) {
    char c1 = 'ꪫ';
    char c2 = '踹';
    char c3 = '';
    int[] arrayOfInt1 = new int[this.N_SB];
    int[] arrayOfInt2 = new int[this.N_SB];
    int[] arrayOfInt3 = new int[this.N_SB];
    int[] arrayOfInt4 = new int[this.N_SB];
    int[] arrayOfInt5 = new int[this.N_SB];
    int[] arrayOfInt6 = new int[this.N_SB];
    int[] arrayOfInt7 = new int[this.N_SB];
    int[] arrayOfInt8 = new int[this.N_SB];
    int[] arrayOfInt9 = new int[this.N_SB];
    int[] arrayOfInt10 = new int[this.N_SB];
    int[] arrayOfInt11 = new int[this.N_SB];
    int[] arrayOfInt12 = new int[this.N_SB];
    int[] arrayOfInt13 = new int[this.N_SB];
    int[] arrayOfInt14 = new int[this.N_SB];
    int[] arrayOfInt15 = new int[this.N_SB_RES];
    int[] arrayOfInt16 = new int[this.N_SB_RES];
    int[] arrayOfInt17 = new int[this.N_SB_RES];
    int[] arrayOfInt18 = new int[this.N_SB_RES];
    int[] arrayOfInt19 = new int[this.N_SB_RES];
    int[] arrayOfInt20 = new int[this.N_SB_RES];
    int[] arrayOfInt21 = new int[this.N_SB_RES];
    short[] arrayOfShort = paramArrayOfshort3;
    byte b2;
    for (b2 = 0; b2 < this.N_SB; b2++) {
      short s1 = paramArrayOfshort1[b2];
      short s2 = paramArrayOfshort1[b2 + this.N_SB];
      short s3 = paramArrayOfshort1[b2 + this.N_SB * 2];
      short s4 = paramArrayOfshort1[b2 + this.N_SB * 3];
      short s5 = (short)(s1 + s3);
      short s6 = (short)(s2 + s4);
      short s7 = (short)(s5 + s6);
      short s8 = (short)(s5 - s6);
      arrayOfInt3[b2] = s7;
      arrayOfInt4[b2] = s8;
      s5 = (short)((s1 << 2) + s3 << 1);
      s6 = (short)((s2 << 2) + s4);
      s7 = (short)(s5 + s6);
      s8 = (short)(s5 - s6);
      arrayOfInt5[b2] = s7;
      arrayOfInt6[b2] = s8;
      s5 = (short)((s4 << 3) + (s3 << 2) + (s2 << 1) + s1);
      arrayOfInt2[b2] = s5;
      arrayOfInt7[b2] = s1;
      arrayOfInt1[b2] = s4;
    } 
    for (b2 = 0; b2 < this.N_SB; b2++) {
      short s1 = paramArrayOfshort2[b2];
      short s2 = paramArrayOfshort2[b2 + this.N_SB];
      short s3 = paramArrayOfshort2[b2 + this.N_SB * 2];
      short s4 = paramArrayOfshort2[b2 + this.N_SB * 3];
      int i = s1 + s3;
      int j = s2 + s4;
      int k = i + j;
      int m = i - j;
      arrayOfInt10[b2] = k;
      arrayOfInt11[b2] = m;
      i = (s1 << 2) + s3 << 1;
      j = (s2 << 2) + s4;
      k = i + j;
      m = i - j;
      arrayOfInt12[b2] = k;
      arrayOfInt13[b2] = m;
      i = (s4 << 3) + (s3 << 2) + (s2 << 1) + s1;
      arrayOfInt9[b2] = i;
      arrayOfInt14[b2] = s1;
      arrayOfInt8[b2] = s4;
    } 
    karatsuba_simple(arrayOfInt1, arrayOfInt8, arrayOfInt15);
    karatsuba_simple(arrayOfInt2, arrayOfInt9, arrayOfInt16);
    karatsuba_simple(arrayOfInt3, arrayOfInt10, arrayOfInt17);
    karatsuba_simple(arrayOfInt4, arrayOfInt11, arrayOfInt18);
    karatsuba_simple(arrayOfInt5, arrayOfInt12, arrayOfInt19);
    karatsuba_simple(arrayOfInt6, arrayOfInt13, arrayOfInt20);
    karatsuba_simple(arrayOfInt7, arrayOfInt14, arrayOfInt21);
    for (byte b1 = 0; b1 < this.N_SB_RES; b1++) {
      int i = arrayOfInt15[b1];
      int j = arrayOfInt16[b1];
      int k = arrayOfInt17[b1];
      int m = arrayOfInt18[b1];
      int n = arrayOfInt19[b1];
      int i1 = arrayOfInt20[b1];
      int i2 = arrayOfInt21[b1];
      j += n;
      i1 -= n;
      m = (m & 0xFFFF) - (k & 0xFFFF) >>> 1;
      n -= i;
      n -= i2 << 6;
      n = (n << 1) + i1;
      k += m;
      j = j - (k << 6) - k;
      k -= i2;
      k -= i;
      j += 45 * k;
      n = ((n & 0xFFFF) - (k << 3)) * c1 >> 3;
      i1 += j;
      j = ((j & 0xFFFF) + ((m & 0xFFFF) << 4)) * c2 >> 1;
      m = -(m + j);
      i1 = (30 * (j & 0xFFFF) - (i1 & 0xFFFF)) * c3 >> 2;
      k -= n;
      j -= i1;
      arrayOfShort[b1] = (short)(arrayOfShort[b1] + (i2 & 0xFFFF));
      arrayOfShort[b1 + 64] = (short)(arrayOfShort[b1 + 64] + (i1 & 0xFFFF));
      arrayOfShort[b1 + 128] = (short)(arrayOfShort[b1 + 128] + (n & 0xFFFF));
      arrayOfShort[b1 + 192] = (short)(arrayOfShort[b1 + 192] + (m & 0xFFFF));
      arrayOfShort[b1 + 256] = (short)(arrayOfShort[b1 + 256] + (k & 0xFFFF));
      arrayOfShort[b1 + 320] = (short)(arrayOfShort[b1 + 320] + (j & 0xFFFF));
      arrayOfShort[b1 + 384] = (short)(arrayOfShort[b1 + 384] + (i & 0xFFFF));
    } 
  }
  
  private void poly_mul_acc(short[] paramArrayOfshort1, short[] paramArrayOfshort2, short[] paramArrayOfshort3) {
    short[] arrayOfShort = new short[2 * this.SABER_N];
    toom_cook_4way(paramArrayOfshort1, paramArrayOfshort2, arrayOfShort);
    for (int i = this.SABER_N; i < 2 * this.SABER_N; i++)
      paramArrayOfshort3[i - this.SABER_N] = (short)(paramArrayOfshort3[i - this.SABER_N] + arrayOfShort[i - this.SABER_N] - arrayOfShort[i]); 
  }
  
  public void MatrixVectorMul(short[][][] paramArrayOfshort, short[][] paramArrayOfshort1, short[][] paramArrayOfshort2, int paramInt) {
    for (byte b = 0; b < this.SABER_L; b++) {
      for (byte b1 = 0; b1 < this.SABER_L; b1++) {
        if (paramInt == 1) {
          poly_mul_acc(paramArrayOfshort[b1][b], paramArrayOfshort1[b1], paramArrayOfshort2[b]);
        } else {
          poly_mul_acc(paramArrayOfshort[b][b1], paramArrayOfshort1[b1], paramArrayOfshort2[b]);
        } 
      } 
    } 
  }
  
  public void InnerProd(short[][] paramArrayOfshort1, short[][] paramArrayOfshort2, short[] paramArrayOfshort) {
    for (byte b = 0; b < this.SABER_L; b++)
      poly_mul_acc(paramArrayOfshort1[b], paramArrayOfshort2[b], paramArrayOfshort); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\saber\Poly.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */