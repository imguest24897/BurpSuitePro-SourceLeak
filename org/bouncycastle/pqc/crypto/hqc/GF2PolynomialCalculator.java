package org.bouncycastle.pqc.crypto.hqc;

class GF2PolynomialCalculator {
  private final int VEC_N_SIZE_64;
  
  private final int PARAM_N;
  
  private final long RED_MASK;
  
  GF2PolynomialCalculator(int paramInt1, int paramInt2, long paramLong) {
    this.VEC_N_SIZE_64 = paramInt1;
    this.PARAM_N = paramInt2;
    this.RED_MASK = paramLong;
  }
  
  protected void multLongs(long[] paramArrayOflong1, long[] paramArrayOflong2, long[] paramArrayOflong3) {
    long[] arrayOfLong1 = new long[this.VEC_N_SIZE_64 << 3];
    long[] arrayOfLong2 = new long[(this.VEC_N_SIZE_64 << 1) + 1];
    karatsuba(arrayOfLong2, 0, paramArrayOflong2, 0, paramArrayOflong3, 0, this.VEC_N_SIZE_64, arrayOfLong1, 0);
    reduce(paramArrayOflong1, arrayOfLong2);
  }
  
  private void base_mul(long[] paramArrayOflong, int paramInt, long paramLong1, long paramLong2) {
    long l1 = 0L;
    long l2 = 0L;
    long[] arrayOfLong1 = new long[16];
    long[] arrayOfLong2 = new long[4];
    arrayOfLong1[0] = 0L;
    arrayOfLong1[1] = paramLong2 & 0xFFFFFFFFFFFFFFFL;
    arrayOfLong1[2] = arrayOfLong1[1] << 1L;
    arrayOfLong1[3] = arrayOfLong1[2] ^ arrayOfLong1[1];
    arrayOfLong1[4] = arrayOfLong1[2] << 1L;
    arrayOfLong1[5] = arrayOfLong1[4] ^ arrayOfLong1[1];
    arrayOfLong1[6] = arrayOfLong1[3] << 1L;
    arrayOfLong1[7] = arrayOfLong1[6] ^ arrayOfLong1[1];
    arrayOfLong1[8] = arrayOfLong1[4] << 1L;
    arrayOfLong1[9] = arrayOfLong1[8] ^ arrayOfLong1[1];
    arrayOfLong1[10] = arrayOfLong1[5] << 1L;
    arrayOfLong1[11] = arrayOfLong1[10] ^ arrayOfLong1[1];
    arrayOfLong1[12] = arrayOfLong1[6] << 1L;
    arrayOfLong1[13] = arrayOfLong1[12] ^ arrayOfLong1[1];
    arrayOfLong1[14] = arrayOfLong1[7] << 1L;
    arrayOfLong1[15] = arrayOfLong1[14] ^ arrayOfLong1[1];
    long l3 = 0L;
    long l4 = paramLong1 & 0xFL;
    byte b;
    for (b = 0; b < 16; b++) {
      long l = l4 - b;
      l3 ^= arrayOfLong1[b] & -(1L - ((l | -l) >>> 63L));
    } 
    l2 = l3;
    l1 = 0L;
    for (b = 4; b < 64; b = (byte)(b + 4)) {
      l3 = 0L;
      long l = paramLong1 >> b & 0xFL;
      for (byte b1 = 0; b1 < 16; b1++) {
        long l5 = l - b1;
        l3 ^= arrayOfLong1[b1] & -(1L - ((l5 | -l5) >>> 63L));
      } 
      l2 ^= l3 << b;
      l1 ^= l3 >>> 64 - b;
    } 
    arrayOfLong2[0] = -(paramLong2 >> 60L & 0x1L);
    arrayOfLong2[1] = -(paramLong2 >> 61L & 0x1L);
    arrayOfLong2[2] = -(paramLong2 >> 62L & 0x1L);
    arrayOfLong2[3] = -(paramLong2 >> 63L & 0x1L);
    l2 ^= paramLong1 << 60L & arrayOfLong2[0];
    l1 ^= paramLong1 >>> 4L & arrayOfLong2[0];
    l2 ^= paramLong1 << 61L & arrayOfLong2[1];
    l1 ^= paramLong1 >>> 3L & arrayOfLong2[1];
    l2 ^= paramLong1 << 62L & arrayOfLong2[2];
    l1 ^= paramLong1 >>> 2L & arrayOfLong2[2];
    l2 ^= paramLong1 << 63L & arrayOfLong2[3];
    l1 ^= paramLong1 >>> 1L & arrayOfLong2[3];
    paramArrayOflong[0 + paramInt] = l2;
    paramArrayOflong[1 + paramInt] = l1;
  }
  
  private void karatsuba_add1(long[] paramArrayOflong1, int paramInt1, long[] paramArrayOflong2, int paramInt2, long[] paramArrayOflong3, int paramInt3, long[] paramArrayOflong4, int paramInt4, int paramInt5, int paramInt6) {
    for (byte b = 0; b < paramInt6; b++) {
      paramArrayOflong1[b + paramInt1] = paramArrayOflong3[b + paramInt3] ^ paramArrayOflong3[b + paramInt5 + paramInt3];
      paramArrayOflong2[b + paramInt2] = paramArrayOflong4[b + paramInt4] ^ paramArrayOflong4[b + paramInt5 + paramInt4];
    } 
    if (paramInt6 < paramInt5) {
      paramArrayOflong1[paramInt6 + paramInt1] = paramArrayOflong3[paramInt6 + paramInt3];
      paramArrayOflong2[paramInt6 + paramInt2] = paramArrayOflong4[paramInt6 + paramInt4];
    } 
  }
  
  private void karatsuba_add2(long[] paramArrayOflong1, int paramInt1, long[] paramArrayOflong2, int paramInt2, long[] paramArrayOflong3, int paramInt3, int paramInt4, int paramInt5) {
    byte b;
    for (b = 0; b < 2 * paramInt4; b++)
      paramArrayOflong2[b + paramInt2] = paramArrayOflong2[b + paramInt2] ^ paramArrayOflong1[b + paramInt1]; 
    for (b = 0; b < 2 * paramInt5; b++)
      paramArrayOflong2[b + paramInt2] = paramArrayOflong2[b + paramInt2] ^ paramArrayOflong3[b + paramInt3]; 
    for (b = 0; b < 2 * paramInt4; b++)
      paramArrayOflong1[b + paramInt4 + paramInt1] = paramArrayOflong1[b + paramInt4 + paramInt1] ^ paramArrayOflong2[b + paramInt2]; 
  }
  
  private void karatsuba(long[] paramArrayOflong1, int paramInt1, long[] paramArrayOflong2, int paramInt2, long[] paramArrayOflong3, int paramInt3, int paramInt4, long[] paramArrayOflong4, int paramInt5) {
    if (paramInt4 == 1) {
      base_mul(paramArrayOflong1, paramInt1, paramArrayOflong2[0 + paramInt2], paramArrayOflong3[0 + paramInt3]);
      return;
    } 
    int j = paramInt4 / 2;
    int i = (paramInt4 + 1) / 2;
    int n = paramInt5;
    int i1 = n + i;
    int i2 = i1 + i;
    int i3 = paramInt1 + i * 2;
    paramInt5 += 4 * i;
    int k = paramInt2 + i;
    int m = paramInt3 + i;
    karatsuba(paramArrayOflong1, paramInt1, paramArrayOflong2, paramInt2, paramArrayOflong3, paramInt3, i, paramArrayOflong4, paramInt5);
    karatsuba(paramArrayOflong1, i3, paramArrayOflong2, k, paramArrayOflong3, m, j, paramArrayOflong4, paramInt5);
    karatsuba_add1(paramArrayOflong4, n, paramArrayOflong4, i1, paramArrayOflong2, paramInt2, paramArrayOflong3, paramInt3, i, j);
    karatsuba(paramArrayOflong4, i2, paramArrayOflong4, n, paramArrayOflong4, i1, i, paramArrayOflong4, paramInt5);
    karatsuba_add2(paramArrayOflong1, paramInt1, paramArrayOflong4, i2, paramArrayOflong1, i3, i, j);
  }
  
  private void reduce(long[] paramArrayOflong1, long[] paramArrayOflong2) {
    for (byte b = 0; b < this.VEC_N_SIZE_64; b++) {
      long l1 = paramArrayOflong2[b + this.VEC_N_SIZE_64 - 1] >>> (this.PARAM_N & 0x3F);
      long l2 = paramArrayOflong2[b + this.VEC_N_SIZE_64] << (int)(64L - (this.PARAM_N & 0x3FL));
      paramArrayOflong1[b] = paramArrayOflong2[b] ^ l1 ^ l2;
    } 
    paramArrayOflong1[this.VEC_N_SIZE_64 - 1] = paramArrayOflong1[this.VEC_N_SIZE_64 - 1] & this.RED_MASK;
  }
  
  static void addLongs(long[] paramArrayOflong1, long[] paramArrayOflong2, long[] paramArrayOflong3) {
    for (byte b = 0; b < paramArrayOflong2.length; b++)
      paramArrayOflong1[b] = paramArrayOflong2[b] ^ paramArrayOflong3[b]; 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\hqc\GF2PolynomialCalculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */