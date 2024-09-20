package org.bouncycastle.pqc.crypto.gemss;

abstract class Mul_GF2x {
  public abstract void mul_gf2x(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3);
  
  public abstract void sqr_gf2x(long[] paramArrayOflong1, long[] paramArrayOflong2, int paramInt);
  
  public abstract void mul_gf2x_xor(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3);
  
  private static long SQR32_NO_SIMD_GF2X(long paramLong) {
    paramLong = (paramLong ^ paramLong << 16L) & 0xFFFF0000FFFFL;
    paramLong = (paramLong ^ paramLong << 8L) & 0xFF00FF00FF00FFL;
    paramLong = (paramLong ^ paramLong << 4L) & 0xF0F0F0F0F0F0F0FL;
    paramLong = (paramLong ^ paramLong << 2L) & 0x3333333333333333L;
    return (paramLong ^ paramLong << 1L) & 0x5555555555555555L;
  }
  
  private static long SQR64LOW_NO_SIMD_GF2X(long paramLong) {
    paramLong = (paramLong & 0xFFFFFFFFL ^ paramLong << 16L) & 0xFFFF0000FFFFL;
    paramLong = (paramLong ^ paramLong << 8L) & 0xFF00FF00FF00FFL;
    paramLong = (paramLong ^ paramLong << 4L) & 0xF0F0F0F0F0F0F0FL;
    paramLong = (paramLong ^ paramLong << 2L) & 0x3333333333333333L;
    return (paramLong ^ paramLong << 1L) & 0x5555555555555555L;
  }
  
  private static void SQR64_NO_SIMD_GF2X(long[] paramArrayOflong, int paramInt, long paramLong) {
    paramArrayOflong[paramInt + 1] = SQR32_NO_SIMD_GF2X(paramLong >>> 32L);
    paramArrayOflong[paramInt] = SQR64LOW_NO_SIMD_GF2X(paramLong);
  }
  
  private static void SQR128_NO_SIMD_GF2X(long[] paramArrayOflong1, int paramInt1, long[] paramArrayOflong2, int paramInt2) {
    SQR64_NO_SIMD_GF2X(paramArrayOflong1, paramInt1 + 2, paramArrayOflong2[paramInt2 + 1]);
    SQR64_NO_SIMD_GF2X(paramArrayOflong1, paramInt1, paramArrayOflong2[paramInt2]);
  }
  
  private static void SQR256_NO_SIMD_GF2X(long[] paramArrayOflong1, int paramInt1, long[] paramArrayOflong2, int paramInt2) {
    SQR128_NO_SIMD_GF2X(paramArrayOflong1, paramInt1 + 4, paramArrayOflong2, paramInt2 + 2);
    SQR128_NO_SIMD_GF2X(paramArrayOflong1, paramInt1, paramArrayOflong2, paramInt2);
  }
  
  private static long MUL32_NO_SIMD_GF2X(long paramLong1, long paramLong2) {
    long l = -(paramLong2 & 0x1L) & paramLong1;
    l ^= (-(paramLong2 >>> 1L & 0x1L) & paramLong1) << 1L;
    l ^= (-(paramLong2 >>> 2L & 0x1L) & paramLong1) << 2L;
    l ^= (-(paramLong2 >>> 3L & 0x1L) & paramLong1) << 3L;
    l ^= (-(paramLong2 >>> 4L & 0x1L) & paramLong1) << 4L;
    l ^= (-(paramLong2 >>> 5L & 0x1L) & paramLong1) << 5L;
    l ^= (-(paramLong2 >>> 6L & 0x1L) & paramLong1) << 6L;
    l ^= (-(paramLong2 >>> 7L & 0x1L) & paramLong1) << 7L;
    l ^= (-(paramLong2 >>> 8L & 0x1L) & paramLong1) << 8L;
    l ^= (-(paramLong2 >>> 9L & 0x1L) & paramLong1) << 9L;
    l ^= (-(paramLong2 >>> 10L & 0x1L) & paramLong1) << 10L;
    l ^= (-(paramLong2 >>> 11L & 0x1L) & paramLong1) << 11L;
    l ^= (-(paramLong2 >>> 12L & 0x1L) & paramLong1) << 12L;
    l ^= (-(paramLong2 >>> 13L & 0x1L) & paramLong1) << 13L;
    l ^= (-(paramLong2 >>> 14L & 0x1L) & paramLong1) << 14L;
    l ^= (-(paramLong2 >>> 15L & 0x1L) & paramLong1) << 15L;
    l ^= (-(paramLong2 >>> 16L & 0x1L) & paramLong1) << 16L;
    l ^= (-(paramLong2 >>> 17L & 0x1L) & paramLong1) << 17L;
    l ^= (-(paramLong2 >>> 18L & 0x1L) & paramLong1) << 18L;
    l ^= (-(paramLong2 >>> 19L & 0x1L) & paramLong1) << 19L;
    l ^= (-(paramLong2 >>> 20L & 0x1L) & paramLong1) << 20L;
    l ^= (-(paramLong2 >>> 21L & 0x1L) & paramLong1) << 21L;
    l ^= (-(paramLong2 >>> 22L & 0x1L) & paramLong1) << 22L;
    l ^= (-(paramLong2 >>> 23L & 0x1L) & paramLong1) << 23L;
    l ^= (-(paramLong2 >>> 24L & 0x1L) & paramLong1) << 24L;
    l ^= (-(paramLong2 >>> 25L & 0x1L) & paramLong1) << 25L;
    l ^= (-(paramLong2 >>> 26L & 0x1L) & paramLong1) << 26L;
    l ^= (-(paramLong2 >>> 27L & 0x1L) & paramLong1) << 27L;
    l ^= (-(paramLong2 >>> 28L & 0x1L) & paramLong1) << 28L;
    l ^= (-(paramLong2 >>> 29L & 0x1L) & paramLong1) << 29L;
    l ^= (-(paramLong2 >>> 30L & 0x1L) & paramLong1) << 30L;
    l ^= (-(paramLong2 >>> 31L & 0x1L) & paramLong1) << 31L;
    return l;
  }
  
  private static void MUL64_NO_SIMD_GF2X(long[] paramArrayOflong, int paramInt, long paramLong1, long paramLong2) {
    long l1 = -(paramLong2 & 0x1L) & paramLong1;
    long l3 = -(paramLong2 >>> 63L) & paramLong1;
    l1 ^= l3 << 63L;
    long l2 = l3 >>> 1L;
    l3 = -(paramLong2 >>> 1L & 0x1L) & paramLong1;
    l1 ^= l3 << 1L;
    l2 ^= l3 >>> 63L;
    l3 = -(paramLong2 >>> 2L & 0x1L) & paramLong1;
    l1 ^= l3 << 2L;
    l2 ^= l3 >>> 62L;
    l3 = -(paramLong2 >>> 3L & 0x1L) & paramLong1;
    l1 ^= l3 << 3L;
    l2 ^= l3 >>> 61L;
    l3 = -(paramLong2 >>> 4L & 0x1L) & paramLong1;
    l1 ^= l3 << 4L;
    l2 ^= l3 >>> 60L;
    l3 = -(paramLong2 >>> 5L & 0x1L) & paramLong1;
    l1 ^= l3 << 5L;
    l2 ^= l3 >>> 59L;
    l3 = -(paramLong2 >>> 6L & 0x1L) & paramLong1;
    l1 ^= l3 << 6L;
    l2 ^= l3 >>> 58L;
    l3 = -(paramLong2 >>> 7L & 0x1L) & paramLong1;
    l1 ^= l3 << 7L;
    l2 ^= l3 >>> 57L;
    l3 = -(paramLong2 >>> 8L & 0x1L) & paramLong1;
    l1 ^= l3 << 8L;
    l2 ^= l3 >>> 56L;
    l3 = -(paramLong2 >>> 9L & 0x1L) & paramLong1;
    l1 ^= l3 << 9L;
    l2 ^= l3 >>> 55L;
    l3 = -(paramLong2 >>> 10L & 0x1L) & paramLong1;
    l1 ^= l3 << 10L;
    l2 ^= l3 >>> 54L;
    l3 = -(paramLong2 >>> 11L & 0x1L) & paramLong1;
    l1 ^= l3 << 11L;
    l2 ^= l3 >>> 53L;
    l3 = -(paramLong2 >>> 12L & 0x1L) & paramLong1;
    l1 ^= l3 << 12L;
    l2 ^= l3 >>> 52L;
    l3 = -(paramLong2 >>> 13L & 0x1L) & paramLong1;
    l1 ^= l3 << 13L;
    l2 ^= l3 >>> 51L;
    l3 = -(paramLong2 >>> 14L & 0x1L) & paramLong1;
    l1 ^= l3 << 14L;
    l2 ^= l3 >>> 50L;
    l3 = -(paramLong2 >>> 15L & 0x1L) & paramLong1;
    l1 ^= l3 << 15L;
    l2 ^= l3 >>> 49L;
    l3 = -(paramLong2 >>> 16L & 0x1L) & paramLong1;
    l1 ^= l3 << 16L;
    l2 ^= l3 >>> 48L;
    l3 = -(paramLong2 >>> 17L & 0x1L) & paramLong1;
    l1 ^= l3 << 17L;
    l2 ^= l3 >>> 47L;
    l3 = -(paramLong2 >>> 18L & 0x1L) & paramLong1;
    l1 ^= l3 << 18L;
    l2 ^= l3 >>> 46L;
    l3 = -(paramLong2 >>> 19L & 0x1L) & paramLong1;
    l1 ^= l3 << 19L;
    l2 ^= l3 >>> 45L;
    l3 = -(paramLong2 >>> 20L & 0x1L) & paramLong1;
    l1 ^= l3 << 20L;
    l2 ^= l3 >>> 44L;
    l3 = -(paramLong2 >>> 21L & 0x1L) & paramLong1;
    l1 ^= l3 << 21L;
    l2 ^= l3 >>> 43L;
    l3 = -(paramLong2 >>> 22L & 0x1L) & paramLong1;
    l1 ^= l3 << 22L;
    l2 ^= l3 >>> 42L;
    l3 = -(paramLong2 >>> 23L & 0x1L) & paramLong1;
    l1 ^= l3 << 23L;
    l2 ^= l3 >>> 41L;
    l3 = -(paramLong2 >>> 24L & 0x1L) & paramLong1;
    l1 ^= l3 << 24L;
    l2 ^= l3 >>> 40L;
    l3 = -(paramLong2 >>> 25L & 0x1L) & paramLong1;
    l1 ^= l3 << 25L;
    l2 ^= l3 >>> 39L;
    l3 = -(paramLong2 >>> 26L & 0x1L) & paramLong1;
    l1 ^= l3 << 26L;
    l2 ^= l3 >>> 38L;
    l3 = -(paramLong2 >>> 27L & 0x1L) & paramLong1;
    l1 ^= l3 << 27L;
    l2 ^= l3 >>> 37L;
    l3 = -(paramLong2 >>> 28L & 0x1L) & paramLong1;
    l1 ^= l3 << 28L;
    l2 ^= l3 >>> 36L;
    l3 = -(paramLong2 >>> 29L & 0x1L) & paramLong1;
    l1 ^= l3 << 29L;
    l2 ^= l3 >>> 35L;
    l3 = -(paramLong2 >>> 30L & 0x1L) & paramLong1;
    l1 ^= l3 << 30L;
    l2 ^= l3 >>> 34L;
    l3 = -(paramLong2 >>> 31L & 0x1L) & paramLong1;
    l1 ^= l3 << 31L;
    l2 ^= l3 >>> 33L;
    l3 = -(paramLong2 >>> 32L & 0x1L) & paramLong1;
    l1 ^= l3 << 32L;
    l2 ^= l3 >>> 32L;
    l3 = -(paramLong2 >>> 33L & 0x1L) & paramLong1;
    l1 ^= l3 << 33L;
    l2 ^= l3 >>> 31L;
    l3 = -(paramLong2 >>> 34L & 0x1L) & paramLong1;
    l1 ^= l3 << 34L;
    l2 ^= l3 >>> 30L;
    l3 = -(paramLong2 >>> 35L & 0x1L) & paramLong1;
    l1 ^= l3 << 35L;
    l2 ^= l3 >>> 29L;
    l3 = -(paramLong2 >>> 36L & 0x1L) & paramLong1;
    l1 ^= l3 << 36L;
    l2 ^= l3 >>> 28L;
    l3 = -(paramLong2 >>> 37L & 0x1L) & paramLong1;
    l1 ^= l3 << 37L;
    l2 ^= l3 >>> 27L;
    l3 = -(paramLong2 >>> 38L & 0x1L) & paramLong1;
    l1 ^= l3 << 38L;
    l2 ^= l3 >>> 26L;
    l3 = -(paramLong2 >>> 39L & 0x1L) & paramLong1;
    l1 ^= l3 << 39L;
    l2 ^= l3 >>> 25L;
    l3 = -(paramLong2 >>> 40L & 0x1L) & paramLong1;
    l1 ^= l3 << 40L;
    l2 ^= l3 >>> 24L;
    l3 = -(paramLong2 >>> 41L & 0x1L) & paramLong1;
    l1 ^= l3 << 41L;
    l2 ^= l3 >>> 23L;
    l3 = -(paramLong2 >>> 42L & 0x1L) & paramLong1;
    l1 ^= l3 << 42L;
    l2 ^= l3 >>> 22L;
    l3 = -(paramLong2 >>> 43L & 0x1L) & paramLong1;
    l1 ^= l3 << 43L;
    l2 ^= l3 >>> 21L;
    l3 = -(paramLong2 >>> 44L & 0x1L) & paramLong1;
    l1 ^= l3 << 44L;
    l2 ^= l3 >>> 20L;
    l3 = -(paramLong2 >>> 45L & 0x1L) & paramLong1;
    l1 ^= l3 << 45L;
    l2 ^= l3 >>> 19L;
    l3 = -(paramLong2 >>> 46L & 0x1L) & paramLong1;
    l1 ^= l3 << 46L;
    l2 ^= l3 >>> 18L;
    l3 = -(paramLong2 >>> 47L & 0x1L) & paramLong1;
    l1 ^= l3 << 47L;
    l2 ^= l3 >>> 17L;
    l3 = -(paramLong2 >>> 48L & 0x1L) & paramLong1;
    l1 ^= l3 << 48L;
    l2 ^= l3 >>> 16L;
    l3 = -(paramLong2 >>> 49L & 0x1L) & paramLong1;
    l1 ^= l3 << 49L;
    l2 ^= l3 >>> 15L;
    l3 = -(paramLong2 >>> 50L & 0x1L) & paramLong1;
    l1 ^= l3 << 50L;
    l2 ^= l3 >>> 14L;
    l3 = -(paramLong2 >>> 51L & 0x1L) & paramLong1;
    l1 ^= l3 << 51L;
    l2 ^= l3 >>> 13L;
    l3 = -(paramLong2 >>> 52L & 0x1L) & paramLong1;
    l1 ^= l3 << 52L;
    l2 ^= l3 >>> 12L;
    l3 = -(paramLong2 >>> 53L & 0x1L) & paramLong1;
    l1 ^= l3 << 53L;
    l2 ^= l3 >>> 11L;
    l3 = -(paramLong2 >>> 54L & 0x1L) & paramLong1;
    l1 ^= l3 << 54L;
    l2 ^= l3 >>> 10L;
    l3 = -(paramLong2 >>> 55L & 0x1L) & paramLong1;
    l1 ^= l3 << 55L;
    l2 ^= l3 >>> 9L;
    l3 = -(paramLong2 >>> 56L & 0x1L) & paramLong1;
    l1 ^= l3 << 56L;
    l2 ^= l3 >>> 8L;
    l3 = -(paramLong2 >>> 57L & 0x1L) & paramLong1;
    l1 ^= l3 << 57L;
    l2 ^= l3 >>> 7L;
    l3 = -(paramLong2 >>> 58L & 0x1L) & paramLong1;
    l1 ^= l3 << 58L;
    l2 ^= l3 >>> 6L;
    l3 = -(paramLong2 >>> 59L & 0x1L) & paramLong1;
    l1 ^= l3 << 59L;
    l2 ^= l3 >>> 5L;
    l3 = -(paramLong2 >>> 60L & 0x1L) & paramLong1;
    l1 ^= l3 << 60L;
    l2 ^= l3 >>> 4L;
    l3 = -(paramLong2 >>> 61L & 0x1L) & paramLong1;
    l1 ^= l3 << 61L;
    l2 ^= l3 >>> 3L;
    l3 = -(paramLong2 >>> 62L & 0x1L) & paramLong1;
    paramArrayOflong[paramInt] = l1 ^ l3 << 62L;
    paramArrayOflong[paramInt + 1] = l2 ^ l3 >>> 2L;
  }
  
  private static void MUL64_NO_SIMD_GF2X_XOR(long[] paramArrayOflong, int paramInt, long paramLong1, long paramLong2) {
    long l1 = -(paramLong2 & 0x1L) & paramLong1;
    long l3 = -(paramLong2 >>> 63L) & paramLong1;
    l1 ^= l3 << 63L;
    long l2 = l3 >>> 1L;
    l3 = -(paramLong2 >>> 1L & 0x1L) & paramLong1;
    l1 ^= l3 << 1L;
    l2 ^= l3 >>> 63L;
    l3 = -(paramLong2 >>> 2L & 0x1L) & paramLong1;
    l1 ^= l3 << 2L;
    l2 ^= l3 >>> 62L;
    l3 = -(paramLong2 >>> 3L & 0x1L) & paramLong1;
    l1 ^= l3 << 3L;
    l2 ^= l3 >>> 61L;
    l3 = -(paramLong2 >>> 4L & 0x1L) & paramLong1;
    l1 ^= l3 << 4L;
    l2 ^= l3 >>> 60L;
    l3 = -(paramLong2 >>> 5L & 0x1L) & paramLong1;
    l1 ^= l3 << 5L;
    l2 ^= l3 >>> 59L;
    l3 = -(paramLong2 >>> 6L & 0x1L) & paramLong1;
    l1 ^= l3 << 6L;
    l2 ^= l3 >>> 58L;
    l3 = -(paramLong2 >>> 7L & 0x1L) & paramLong1;
    l1 ^= l3 << 7L;
    l2 ^= l3 >>> 57L;
    l3 = -(paramLong2 >>> 8L & 0x1L) & paramLong1;
    l1 ^= l3 << 8L;
    l2 ^= l3 >>> 56L;
    l3 = -(paramLong2 >>> 9L & 0x1L) & paramLong1;
    l1 ^= l3 << 9L;
    l2 ^= l3 >>> 55L;
    l3 = -(paramLong2 >>> 10L & 0x1L) & paramLong1;
    l1 ^= l3 << 10L;
    l2 ^= l3 >>> 54L;
    l3 = -(paramLong2 >>> 11L & 0x1L) & paramLong1;
    l1 ^= l3 << 11L;
    l2 ^= l3 >>> 53L;
    l3 = -(paramLong2 >>> 12L & 0x1L) & paramLong1;
    l1 ^= l3 << 12L;
    l2 ^= l3 >>> 52L;
    l3 = -(paramLong2 >>> 13L & 0x1L) & paramLong1;
    l1 ^= l3 << 13L;
    l2 ^= l3 >>> 51L;
    l3 = -(paramLong2 >>> 14L & 0x1L) & paramLong1;
    l1 ^= l3 << 14L;
    l2 ^= l3 >>> 50L;
    l3 = -(paramLong2 >>> 15L & 0x1L) & paramLong1;
    l1 ^= l3 << 15L;
    l2 ^= l3 >>> 49L;
    l3 = -(paramLong2 >>> 16L & 0x1L) & paramLong1;
    l1 ^= l3 << 16L;
    l2 ^= l3 >>> 48L;
    l3 = -(paramLong2 >>> 17L & 0x1L) & paramLong1;
    l1 ^= l3 << 17L;
    l2 ^= l3 >>> 47L;
    l3 = -(paramLong2 >>> 18L & 0x1L) & paramLong1;
    l1 ^= l3 << 18L;
    l2 ^= l3 >>> 46L;
    l3 = -(paramLong2 >>> 19L & 0x1L) & paramLong1;
    l1 ^= l3 << 19L;
    l2 ^= l3 >>> 45L;
    l3 = -(paramLong2 >>> 20L & 0x1L) & paramLong1;
    l1 ^= l3 << 20L;
    l2 ^= l3 >>> 44L;
    l3 = -(paramLong2 >>> 21L & 0x1L) & paramLong1;
    l1 ^= l3 << 21L;
    l2 ^= l3 >>> 43L;
    l3 = -(paramLong2 >>> 22L & 0x1L) & paramLong1;
    l1 ^= l3 << 22L;
    l2 ^= l3 >>> 42L;
    l3 = -(paramLong2 >>> 23L & 0x1L) & paramLong1;
    l1 ^= l3 << 23L;
    l2 ^= l3 >>> 41L;
    l3 = -(paramLong2 >>> 24L & 0x1L) & paramLong1;
    l1 ^= l3 << 24L;
    l2 ^= l3 >>> 40L;
    l3 = -(paramLong2 >>> 25L & 0x1L) & paramLong1;
    l1 ^= l3 << 25L;
    l2 ^= l3 >>> 39L;
    l3 = -(paramLong2 >>> 26L & 0x1L) & paramLong1;
    l1 ^= l3 << 26L;
    l2 ^= l3 >>> 38L;
    l3 = -(paramLong2 >>> 27L & 0x1L) & paramLong1;
    l1 ^= l3 << 27L;
    l2 ^= l3 >>> 37L;
    l3 = -(paramLong2 >>> 28L & 0x1L) & paramLong1;
    l1 ^= l3 << 28L;
    l2 ^= l3 >>> 36L;
    l3 = -(paramLong2 >>> 29L & 0x1L) & paramLong1;
    l1 ^= l3 << 29L;
    l2 ^= l3 >>> 35L;
    l3 = -(paramLong2 >>> 30L & 0x1L) & paramLong1;
    l1 ^= l3 << 30L;
    l2 ^= l3 >>> 34L;
    l3 = -(paramLong2 >>> 31L & 0x1L) & paramLong1;
    l1 ^= l3 << 31L;
    l2 ^= l3 >>> 33L;
    l3 = -(paramLong2 >>> 32L & 0x1L) & paramLong1;
    l1 ^= l3 << 32L;
    l2 ^= l3 >>> 32L;
    l3 = -(paramLong2 >>> 33L & 0x1L) & paramLong1;
    l1 ^= l3 << 33L;
    l2 ^= l3 >>> 31L;
    l3 = -(paramLong2 >>> 34L & 0x1L) & paramLong1;
    l1 ^= l3 << 34L;
    l2 ^= l3 >>> 30L;
    l3 = -(paramLong2 >>> 35L & 0x1L) & paramLong1;
    l1 ^= l3 << 35L;
    l2 ^= l3 >>> 29L;
    l3 = -(paramLong2 >>> 36L & 0x1L) & paramLong1;
    l1 ^= l3 << 36L;
    l2 ^= l3 >>> 28L;
    l3 = -(paramLong2 >>> 37L & 0x1L) & paramLong1;
    l1 ^= l3 << 37L;
    l2 ^= l3 >>> 27L;
    l3 = -(paramLong2 >>> 38L & 0x1L) & paramLong1;
    l1 ^= l3 << 38L;
    l2 ^= l3 >>> 26L;
    l3 = -(paramLong2 >>> 39L & 0x1L) & paramLong1;
    l1 ^= l3 << 39L;
    l2 ^= l3 >>> 25L;
    l3 = -(paramLong2 >>> 40L & 0x1L) & paramLong1;
    l1 ^= l3 << 40L;
    l2 ^= l3 >>> 24L;
    l3 = -(paramLong2 >>> 41L & 0x1L) & paramLong1;
    l1 ^= l3 << 41L;
    l2 ^= l3 >>> 23L;
    l3 = -(paramLong2 >>> 42L & 0x1L) & paramLong1;
    l1 ^= l3 << 42L;
    l2 ^= l3 >>> 22L;
    l3 = -(paramLong2 >>> 43L & 0x1L) & paramLong1;
    l1 ^= l3 << 43L;
    l2 ^= l3 >>> 21L;
    l3 = -(paramLong2 >>> 44L & 0x1L) & paramLong1;
    l1 ^= l3 << 44L;
    l2 ^= l3 >>> 20L;
    l3 = -(paramLong2 >>> 45L & 0x1L) & paramLong1;
    l1 ^= l3 << 45L;
    l2 ^= l3 >>> 19L;
    l3 = -(paramLong2 >>> 46L & 0x1L) & paramLong1;
    l1 ^= l3 << 46L;
    l2 ^= l3 >>> 18L;
    l3 = -(paramLong2 >>> 47L & 0x1L) & paramLong1;
    l1 ^= l3 << 47L;
    l2 ^= l3 >>> 17L;
    l3 = -(paramLong2 >>> 48L & 0x1L) & paramLong1;
    l1 ^= l3 << 48L;
    l2 ^= l3 >>> 16L;
    l3 = -(paramLong2 >>> 49L & 0x1L) & paramLong1;
    l1 ^= l3 << 49L;
    l2 ^= l3 >>> 15L;
    l3 = -(paramLong2 >>> 50L & 0x1L) & paramLong1;
    l1 ^= l3 << 50L;
    l2 ^= l3 >>> 14L;
    l3 = -(paramLong2 >>> 51L & 0x1L) & paramLong1;
    l1 ^= l3 << 51L;
    l2 ^= l3 >>> 13L;
    l3 = -(paramLong2 >>> 52L & 0x1L) & paramLong1;
    l1 ^= l3 << 52L;
    l2 ^= l3 >>> 12L;
    l3 = -(paramLong2 >>> 53L & 0x1L) & paramLong1;
    l1 ^= l3 << 53L;
    l2 ^= l3 >>> 11L;
    l3 = -(paramLong2 >>> 54L & 0x1L) & paramLong1;
    l1 ^= l3 << 54L;
    l2 ^= l3 >>> 10L;
    l3 = -(paramLong2 >>> 55L & 0x1L) & paramLong1;
    l1 ^= l3 << 55L;
    l2 ^= l3 >>> 9L;
    l3 = -(paramLong2 >>> 56L & 0x1L) & paramLong1;
    l1 ^= l3 << 56L;
    l2 ^= l3 >>> 8L;
    l3 = -(paramLong2 >>> 57L & 0x1L) & paramLong1;
    l1 ^= l3 << 57L;
    l2 ^= l3 >>> 7L;
    l3 = -(paramLong2 >>> 58L & 0x1L) & paramLong1;
    l1 ^= l3 << 58L;
    l2 ^= l3 >>> 6L;
    l3 = -(paramLong2 >>> 59L & 0x1L) & paramLong1;
    l1 ^= l3 << 59L;
    l2 ^= l3 >>> 5L;
    l3 = -(paramLong2 >>> 60L & 0x1L) & paramLong1;
    l1 ^= l3 << 60L;
    l2 ^= l3 >>> 4L;
    l3 = -(paramLong2 >>> 61L & 0x1L) & paramLong1;
    l1 ^= l3 << 61L;
    l2 ^= l3 >>> 3L;
    l3 = -(paramLong2 >>> 62L & 0x1L) & paramLong1;
    paramArrayOflong[paramInt] = paramArrayOflong[paramInt] ^ l1 ^ l3 << 62L;
    paramArrayOflong[paramInt + 1] = paramArrayOflong[paramInt + 1] ^ l2 ^ l3 >>> 2L;
  }
  
  private static void mul128_no_simd_gf2x(long[] paramArrayOflong1, int paramInt1, long[] paramArrayOflong2, int paramInt2, long[] paramArrayOflong3, int paramInt3) {
    MUL64_NO_SIMD_GF2X(paramArrayOflong1, paramInt1, paramArrayOflong2[paramInt2], paramArrayOflong3[paramInt3]);
    MUL64_NO_SIMD_GF2X(paramArrayOflong1, paramInt1 + 2, paramArrayOflong2[paramInt2 + 1], paramArrayOflong3[paramInt3 + 1]);
    paramArrayOflong1[paramInt1 + 2] = paramArrayOflong1[paramInt1 + 2] ^ paramArrayOflong1[paramInt1 + 1];
    paramArrayOflong1[paramInt1 + 1] = paramArrayOflong1[paramInt1] ^ paramArrayOflong1[paramInt1 + 2];
    paramArrayOflong1[paramInt1 + 2] = paramArrayOflong1[paramInt1 + 2] ^ paramArrayOflong1[paramInt1 + 3];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 1, paramArrayOflong2[paramInt2] ^ paramArrayOflong2[paramInt2 + 1], paramArrayOflong3[paramInt3] ^ paramArrayOflong3[paramInt3 + 1]);
  }
  
  private static void mul128_no_simd_gf2x(long[] paramArrayOflong, int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
    MUL64_NO_SIMD_GF2X(paramArrayOflong, paramInt, paramLong1, paramLong3);
    MUL64_NO_SIMD_GF2X(paramArrayOflong, paramInt + 2, paramLong2, paramLong4);
    paramArrayOflong[paramInt + 2] = paramArrayOflong[paramInt + 2] ^ paramArrayOflong[paramInt + 1];
    paramArrayOflong[paramInt + 1] = paramArrayOflong[paramInt] ^ paramArrayOflong[paramInt + 2];
    paramArrayOflong[paramInt + 2] = paramArrayOflong[paramInt + 2] ^ paramArrayOflong[paramInt + 3];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong, paramInt + 1, paramLong1 ^ paramLong2, paramLong3 ^ paramLong4);
  }
  
  private static void mul128_no_simd_gf2x_xor(long[] paramArrayOflong1, int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long[] paramArrayOflong2) {
    MUL64_NO_SIMD_GF2X(paramArrayOflong2, 0, paramLong1, paramLong3);
    MUL64_NO_SIMD_GF2X(paramArrayOflong2, 2, paramLong2, paramLong4);
    paramArrayOflong1[paramInt] = paramArrayOflong1[paramInt] ^ paramArrayOflong2[0];
    paramArrayOflong2[2] = paramArrayOflong2[2] ^ paramArrayOflong2[1];
    paramArrayOflong1[paramInt + 1] = paramArrayOflong1[paramInt + 1] ^ paramArrayOflong2[0] ^ paramArrayOflong2[2];
    paramArrayOflong1[paramInt + 2] = paramArrayOflong1[paramInt + 2] ^ paramArrayOflong2[2] ^ paramArrayOflong2[3];
    paramArrayOflong1[paramInt + 3] = paramArrayOflong1[paramInt + 3] ^ paramArrayOflong2[3];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt + 1, paramLong1 ^ paramLong2, paramLong3 ^ paramLong4);
  }
  
  public static void mul192_no_simd_gf2x(long[] paramArrayOflong1, int paramInt1, long[] paramArrayOflong2, int paramInt2, long[] paramArrayOflong3, int paramInt3) {
    MUL64_NO_SIMD_GF2X(paramArrayOflong1, paramInt1, paramArrayOflong2[paramInt2], paramArrayOflong3[paramInt3]);
    MUL64_NO_SIMD_GF2X(paramArrayOflong1, paramInt1 + 4, paramArrayOflong2[paramInt2 + 2], paramArrayOflong3[paramInt3 + 2]);
    MUL64_NO_SIMD_GF2X(paramArrayOflong1, paramInt1 + 2, paramArrayOflong2[paramInt2 + 1], paramArrayOflong3[paramInt3 + 1]);
    paramArrayOflong1[paramInt1 + 1] = paramArrayOflong1[paramInt1 + 1] ^ paramArrayOflong1[paramInt1 + 2];
    paramArrayOflong1[paramInt1 + 3] = paramArrayOflong1[paramInt1 + 3] ^ paramArrayOflong1[paramInt1 + 4];
    paramArrayOflong1[paramInt1 + 4] = paramArrayOflong1[paramInt1 + 3] ^ paramArrayOflong1[paramInt1 + 5];
    paramArrayOflong1[paramInt1 + 2] = paramArrayOflong1[paramInt1 + 3] ^ paramArrayOflong1[paramInt1 + 1] ^ paramArrayOflong1[paramInt1];
    paramArrayOflong1[paramInt1 + 3] = paramArrayOflong1[paramInt1 + 1] ^ paramArrayOflong1[paramInt1 + 4];
    paramArrayOflong1[paramInt1 + 1] = paramArrayOflong1[paramInt1 + 1] ^ paramArrayOflong1[paramInt1];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 1, paramArrayOflong2[paramInt2] ^ paramArrayOflong2[paramInt2 + 1], paramArrayOflong3[paramInt3] ^ paramArrayOflong3[paramInt3 + 1]);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 3, paramArrayOflong2[paramInt2 + 1] ^ paramArrayOflong2[paramInt2 + 2], paramArrayOflong3[paramInt3 + 1] ^ paramArrayOflong3[paramInt3 + 2]);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 2, paramArrayOflong2[paramInt2] ^ paramArrayOflong2[paramInt2 + 2], paramArrayOflong3[paramInt3] ^ paramArrayOflong3[paramInt3 + 2]);
  }
  
  public static void mul192_no_simd_gf2x_xor(long[] paramArrayOflong1, int paramInt1, long[] paramArrayOflong2, int paramInt2, long[] paramArrayOflong3, int paramInt3, long[] paramArrayOflong4) {
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 0, paramArrayOflong2[paramInt2], paramArrayOflong3[paramInt3]);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 4, paramArrayOflong2[paramInt2 + 2], paramArrayOflong3[paramInt3 + 2]);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 2, paramArrayOflong2[paramInt2 + 1], paramArrayOflong3[paramInt3 + 1]);
    paramArrayOflong1[paramInt1] = paramArrayOflong1[paramInt1] ^ paramArrayOflong4[0];
    paramArrayOflong4[1] = paramArrayOflong4[1] ^ paramArrayOflong4[2];
    paramArrayOflong4[3] = paramArrayOflong4[3] ^ paramArrayOflong4[4];
    paramArrayOflong4[4] = paramArrayOflong4[3] ^ paramArrayOflong4[5];
    paramArrayOflong4[0] = paramArrayOflong4[0] ^ paramArrayOflong4[1];
    paramArrayOflong1[paramInt1 + 1] = paramArrayOflong1[paramInt1 + 1] ^ paramArrayOflong4[0];
    paramArrayOflong1[paramInt1 + 2] = paramArrayOflong1[paramInt1 + 2] ^ paramArrayOflong4[3] ^ paramArrayOflong4[0];
    paramArrayOflong1[paramInt1 + 3] = paramArrayOflong1[paramInt1 + 3] ^ paramArrayOflong4[1] ^ paramArrayOflong4[4];
    paramArrayOflong1[paramInt1 + 4] = paramArrayOflong1[paramInt1 + 4] ^ paramArrayOflong4[4];
    paramArrayOflong1[paramInt1 + 5] = paramArrayOflong1[paramInt1 + 5] ^ paramArrayOflong4[5];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 1, paramArrayOflong2[paramInt2] ^ paramArrayOflong2[paramInt2 + 1], paramArrayOflong3[paramInt3] ^ paramArrayOflong3[paramInt3 + 1]);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 3, paramArrayOflong2[paramInt2 + 1] ^ paramArrayOflong2[paramInt2 + 2], paramArrayOflong3[paramInt3 + 1] ^ paramArrayOflong3[paramInt3 + 2]);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 2, paramArrayOflong2[paramInt2] ^ paramArrayOflong2[paramInt2 + 2], paramArrayOflong3[paramInt3] ^ paramArrayOflong3[paramInt3 + 2]);
  }
  
  private static void mul288_no_simd_gf2x(long[] paramArrayOflong1, int paramInt1, long[] paramArrayOflong2, int paramInt2, long[] paramArrayOflong3, int paramInt3, long[] paramArrayOflong4) {
    mul128_no_simd_gf2x(paramArrayOflong1, paramInt1, paramArrayOflong2[paramInt2], paramArrayOflong2[paramInt2 + 1], paramArrayOflong3[paramInt3], paramArrayOflong3[paramInt3 + 1]);
    MUL64_NO_SIMD_GF2X(paramArrayOflong1, paramInt1 + 4, paramArrayOflong2[paramInt2 + 2], paramArrayOflong3[paramInt3 + 2]);
    MUL64_NO_SIMD_GF2X(paramArrayOflong1, paramInt1 + 7, paramArrayOflong2[paramInt2 + 3], paramArrayOflong3[paramInt3 + 3]);
    paramArrayOflong1[paramInt1 + 7] = paramArrayOflong1[paramInt1 + 7] ^ paramArrayOflong1[paramInt1 + 5];
    paramArrayOflong1[paramInt1 + 8] = paramArrayOflong1[paramInt1 + 8] ^ MUL32_NO_SIMD_GF2X(paramArrayOflong2[paramInt2 + 4], paramArrayOflong3[paramInt3 + 4]);
    paramArrayOflong1[paramInt1 + 5] = paramArrayOflong1[paramInt1 + 7] ^ paramArrayOflong1[paramInt1 + 4];
    paramArrayOflong1[paramInt1 + 7] = paramArrayOflong1[paramInt1 + 7] ^ paramArrayOflong1[paramInt1 + 8];
    paramArrayOflong1[paramInt1 + 6] = paramArrayOflong1[paramInt1 + 7] ^ paramArrayOflong1[paramInt1 + 4];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 5, paramArrayOflong2[paramInt2 + 2] ^ paramArrayOflong2[paramInt2 + 3], paramArrayOflong3[paramInt3 + 2] ^ paramArrayOflong3[paramInt3 + 3]);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 7, paramArrayOflong2[paramInt2 + 3] ^ paramArrayOflong2[paramInt2 + 4], paramArrayOflong3[paramInt3 + 3] ^ paramArrayOflong3[paramInt3 + 4]);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 6, paramArrayOflong2[paramInt2 + 2] ^ paramArrayOflong2[paramInt2 + 4], paramArrayOflong3[paramInt3 + 2] ^ paramArrayOflong3[paramInt3 + 4]);
    paramArrayOflong1[paramInt1 + 4] = paramArrayOflong1[paramInt1 + 4] ^ paramArrayOflong1[paramInt1 + 2];
    paramArrayOflong1[paramInt1 + 5] = paramArrayOflong1[paramInt1 + 5] ^ paramArrayOflong1[paramInt1 + 3];
    long l1 = paramArrayOflong2[paramInt2] ^ paramArrayOflong2[paramInt2 + 2];
    long l2 = paramArrayOflong2[paramInt2 + 1] ^ paramArrayOflong2[paramInt2 + 3];
    long l3 = paramArrayOflong3[paramInt3] ^ paramArrayOflong3[paramInt3 + 2];
    long l4 = paramArrayOflong3[paramInt3 + 1] ^ paramArrayOflong3[paramInt3 + 3];
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 0, l1, l3);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 2, l2, l4);
    paramArrayOflong4[2] = paramArrayOflong4[2] ^ paramArrayOflong4[1];
    paramArrayOflong4[3] = paramArrayOflong4[3] ^ MUL32_NO_SIMD_GF2X(paramArrayOflong2[paramInt2 + 4], paramArrayOflong3[paramInt3 + 4]);
    paramArrayOflong1[paramInt1 + 2] = paramArrayOflong1[paramInt1 + 4] ^ paramArrayOflong1[paramInt1] ^ paramArrayOflong4[0];
    paramArrayOflong1[paramInt1 + 3] = paramArrayOflong1[paramInt1 + 5] ^ paramArrayOflong1[paramInt1 + 1] ^ paramArrayOflong4[2] ^ paramArrayOflong4[0];
    paramArrayOflong4[2] = paramArrayOflong4[2] ^ paramArrayOflong4[3];
    paramArrayOflong1[paramInt1 + 4] = paramArrayOflong1[paramInt1 + 4] ^ paramArrayOflong1[paramInt1 + 6] ^ paramArrayOflong4[2] ^ paramArrayOflong4[0];
    paramArrayOflong1[paramInt1 + 5] = paramArrayOflong1[paramInt1 + 5] ^ paramArrayOflong1[paramInt1 + 7] ^ paramArrayOflong4[2];
    paramArrayOflong1[paramInt1 + 6] = paramArrayOflong1[paramInt1 + 6] ^ paramArrayOflong1[paramInt1 + 8] ^ paramArrayOflong4[3];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 3, l1 ^ l2, l3 ^ l4);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 5, l2 ^ paramArrayOflong2[paramInt2 + 4], l4 ^ paramArrayOflong3[paramInt3 + 4]);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 4, l1 ^ paramArrayOflong2[paramInt2 + 4], l3 ^ paramArrayOflong3[paramInt3 + 4]);
  }
  
  private static void mul288_no_simd_gf2x_xor(long[] paramArrayOflong1, int paramInt1, long[] paramArrayOflong2, int paramInt2, long[] paramArrayOflong3, int paramInt3, long[] paramArrayOflong4) {
    mul128_no_simd_gf2x(paramArrayOflong4, 0, paramArrayOflong2[paramInt2], paramArrayOflong2[paramInt2 + 1], paramArrayOflong3[paramInt3], paramArrayOflong3[paramInt3 + 1]);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 4, paramArrayOflong2[paramInt2 + 2], paramArrayOflong3[paramInt3 + 2]);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 7, paramArrayOflong2[paramInt2 + 3], paramArrayOflong3[paramInt3 + 3]);
    paramArrayOflong4[7] = paramArrayOflong4[7] ^ paramArrayOflong4[5];
    paramArrayOflong4[8] = paramArrayOflong4[8] ^ MUL32_NO_SIMD_GF2X(paramArrayOflong2[paramInt2 + 4], paramArrayOflong3[paramInt3 + 4]);
    paramArrayOflong4[5] = paramArrayOflong4[7] ^ paramArrayOflong4[4];
    paramArrayOflong4[7] = paramArrayOflong4[7] ^ paramArrayOflong4[8];
    paramArrayOflong4[6] = paramArrayOflong4[7] ^ paramArrayOflong4[4];
    paramArrayOflong4[4] = paramArrayOflong4[4] ^ paramArrayOflong4[2];
    paramArrayOflong4[5] = paramArrayOflong4[5] ^ paramArrayOflong4[3];
    paramArrayOflong1[paramInt1] = paramArrayOflong1[paramInt1] ^ paramArrayOflong4[0];
    paramArrayOflong1[paramInt1 + 1] = paramArrayOflong1[paramInt1 + 1] ^ paramArrayOflong4[1];
    paramArrayOflong1[paramInt1 + 2] = paramArrayOflong1[paramInt1 + 2] ^ paramArrayOflong4[4] ^ paramArrayOflong4[0];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong4, 5, paramArrayOflong2[paramInt2 + 2] ^ paramArrayOflong2[paramInt2 + 3], paramArrayOflong3[paramInt3 + 2] ^ paramArrayOflong3[paramInt3 + 3]);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong4, 7, paramArrayOflong2[paramInt2 + 3] ^ paramArrayOflong2[paramInt2 + 4], paramArrayOflong3[paramInt3 + 3] ^ paramArrayOflong3[paramInt3 + 4]);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong4, 6, paramArrayOflong2[paramInt2 + 2] ^ paramArrayOflong2[paramInt2 + 4], paramArrayOflong3[paramInt3 + 2] ^ paramArrayOflong3[paramInt3 + 4]);
    paramArrayOflong1[paramInt1 + 3] = paramArrayOflong1[paramInt1 + 3] ^ paramArrayOflong4[5] ^ paramArrayOflong4[1];
    paramArrayOflong1[paramInt1 + 4] = paramArrayOflong1[paramInt1 + 4] ^ paramArrayOflong4[4] ^ paramArrayOflong4[6];
    paramArrayOflong1[paramInt1 + 5] = paramArrayOflong1[paramInt1 + 5] ^ paramArrayOflong4[5] ^ paramArrayOflong4[7];
    paramArrayOflong1[paramInt1 + 6] = paramArrayOflong1[paramInt1 + 6] ^ paramArrayOflong4[6] ^ paramArrayOflong4[8];
    paramArrayOflong1[paramInt1 + 7] = paramArrayOflong1[paramInt1 + 7] ^ paramArrayOflong4[7];
    paramArrayOflong1[paramInt1 + 8] = paramArrayOflong1[paramInt1 + 8] ^ paramArrayOflong4[8];
    long l1 = paramArrayOflong2[paramInt2] ^ paramArrayOflong2[paramInt2 + 2];
    long l2 = paramArrayOflong2[paramInt2 + 1] ^ paramArrayOflong2[paramInt2 + 3];
    long l3 = paramArrayOflong3[paramInt3] ^ paramArrayOflong3[paramInt3 + 2];
    long l4 = paramArrayOflong3[paramInt3 + 1] ^ paramArrayOflong3[paramInt3 + 3];
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 0, l1, l3);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 2, l2, l4);
    paramArrayOflong4[2] = paramArrayOflong4[2] ^ paramArrayOflong4[1];
    paramArrayOflong4[3] = paramArrayOflong4[3] ^ MUL32_NO_SIMD_GF2X(paramArrayOflong2[paramInt2 + 4], paramArrayOflong3[paramInt3 + 4]);
    paramArrayOflong1[paramInt1 + 2] = paramArrayOflong1[paramInt1 + 2] ^ paramArrayOflong4[0];
    paramArrayOflong1[paramInt1 + 3] = paramArrayOflong1[paramInt1 + 3] ^ paramArrayOflong4[2] ^ paramArrayOflong4[0];
    paramArrayOflong4[2] = paramArrayOflong4[2] ^ paramArrayOflong4[3];
    paramArrayOflong1[paramInt1 + 4] = paramArrayOflong1[paramInt1 + 4] ^ paramArrayOflong4[2] ^ paramArrayOflong4[0];
    paramArrayOflong1[paramInt1 + 5] = paramArrayOflong1[paramInt1 + 5] ^ paramArrayOflong4[2];
    paramArrayOflong1[paramInt1 + 6] = paramArrayOflong1[paramInt1 + 6] ^ paramArrayOflong4[3];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 3, l1 ^ l2, l3 ^ l4);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 5, l2 ^ paramArrayOflong2[paramInt2 + 4], l4 ^ paramArrayOflong3[paramInt3 + 4]);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, paramInt1 + 4, l1 ^ paramArrayOflong2[paramInt2 + 4], l3 ^ paramArrayOflong3[paramInt3 + 4]);
  }
  
  private static void mul384_no_simd_gf2x(long[] paramArrayOflong1, long[] paramArrayOflong2, int paramInt1, long[] paramArrayOflong3, int paramInt2, long[] paramArrayOflong4) {
    mul192_no_simd_gf2x(paramArrayOflong1, 0, paramArrayOflong2, paramInt1, paramArrayOflong3, paramInt2);
    mul192_no_simd_gf2x(paramArrayOflong1, 6, paramArrayOflong2, paramInt1 + 3, paramArrayOflong3, paramInt2 + 3);
    long l1 = paramArrayOflong2[paramInt1] ^ paramArrayOflong2[paramInt1 + 3];
    long l2 = paramArrayOflong2[paramInt1 + 1] ^ paramArrayOflong2[paramInt1 + 4];
    long l3 = paramArrayOflong2[paramInt1 + 2] ^ paramArrayOflong2[paramInt1 + 5];
    long l4 = paramArrayOflong3[paramInt2] ^ paramArrayOflong3[paramInt2 + 3];
    long l5 = paramArrayOflong3[paramInt2 + 1] ^ paramArrayOflong3[paramInt2 + 4];
    long l6 = paramArrayOflong3[paramInt2 + 2] ^ paramArrayOflong3[paramInt2 + 5];
    paramArrayOflong1[6] = paramArrayOflong1[6] ^ paramArrayOflong1[3];
    paramArrayOflong1[7] = paramArrayOflong1[7] ^ paramArrayOflong1[4];
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong1[5];
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 0, l1, l4);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 4, l3, l6);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 2, l2, l5);
    paramArrayOflong1[3] = paramArrayOflong1[6] ^ paramArrayOflong1[0] ^ paramArrayOflong4[0];
    paramArrayOflong4[1] = paramArrayOflong4[1] ^ paramArrayOflong4[2];
    paramArrayOflong4[0] = paramArrayOflong4[0] ^ paramArrayOflong4[1];
    paramArrayOflong4[3] = paramArrayOflong4[3] ^ paramArrayOflong4[4];
    paramArrayOflong4[4] = paramArrayOflong4[3] ^ paramArrayOflong4[5];
    paramArrayOflong1[5] = paramArrayOflong1[8] ^ paramArrayOflong1[2] ^ paramArrayOflong4[3] ^ paramArrayOflong4[0];
    paramArrayOflong1[6] = paramArrayOflong1[6] ^ paramArrayOflong1[9] ^ paramArrayOflong4[1] ^ paramArrayOflong4[4];
    paramArrayOflong1[4] = paramArrayOflong1[7] ^ paramArrayOflong1[1] ^ paramArrayOflong4[0];
    paramArrayOflong1[7] = paramArrayOflong1[7] ^ paramArrayOflong1[10] ^ paramArrayOflong4[4];
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong1[11] ^ paramArrayOflong4[5];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, 4, l1 ^ l2, l4 ^ l5);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, 6, l2 ^ l3, l5 ^ l6);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, 5, l1 ^ l3, l4 ^ l6);
  }
  
  private static void mul384_no_simd_gf2x_xor(long[] paramArrayOflong1, long[] paramArrayOflong2, int paramInt1, long[] paramArrayOflong3, int paramInt2, long[] paramArrayOflong4) {
    mul192_no_simd_gf2x(paramArrayOflong4, 0, paramArrayOflong2, paramInt1, paramArrayOflong3, paramInt2);
    mul192_no_simd_gf2x(paramArrayOflong4, 6, paramArrayOflong2, paramInt1 + 3, paramArrayOflong3, paramInt2 + 3);
    long l1 = paramArrayOflong2[paramInt1] ^ paramArrayOflong2[paramInt1 + 3];
    long l2 = paramArrayOflong2[paramInt1 + 1] ^ paramArrayOflong2[paramInt1 + 4];
    long l3 = paramArrayOflong2[paramInt1 + 2] ^ paramArrayOflong2[paramInt1 + 5];
    long l4 = paramArrayOflong3[paramInt2] ^ paramArrayOflong3[paramInt2 + 3];
    long l5 = paramArrayOflong3[paramInt2 + 1] ^ paramArrayOflong3[paramInt2 + 4];
    long l6 = paramArrayOflong3[paramInt2 + 2] ^ paramArrayOflong3[paramInt2 + 5];
    paramArrayOflong4[6] = paramArrayOflong4[6] ^ paramArrayOflong4[3];
    paramArrayOflong4[7] = paramArrayOflong4[7] ^ paramArrayOflong4[4];
    paramArrayOflong4[8] = paramArrayOflong4[8] ^ paramArrayOflong4[5];
    paramArrayOflong1[0] = paramArrayOflong1[0] ^ paramArrayOflong4[0];
    paramArrayOflong1[1] = paramArrayOflong1[1] ^ paramArrayOflong4[1];
    paramArrayOflong1[2] = paramArrayOflong1[2] ^ paramArrayOflong4[2];
    paramArrayOflong1[3] = paramArrayOflong1[3] ^ paramArrayOflong4[6] ^ paramArrayOflong4[0];
    paramArrayOflong1[5] = paramArrayOflong1[5] ^ paramArrayOflong4[8] ^ paramArrayOflong4[2];
    paramArrayOflong1[6] = paramArrayOflong1[6] ^ paramArrayOflong4[6] ^ paramArrayOflong4[9];
    paramArrayOflong1[4] = paramArrayOflong1[4] ^ paramArrayOflong4[7] ^ paramArrayOflong4[1];
    paramArrayOflong1[7] = paramArrayOflong1[7] ^ paramArrayOflong4[7] ^ paramArrayOflong4[10];
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong4[8] ^ paramArrayOflong4[11];
    paramArrayOflong1[9] = paramArrayOflong1[9] ^ paramArrayOflong4[9];
    paramArrayOflong1[10] = paramArrayOflong1[10] ^ paramArrayOflong4[10];
    paramArrayOflong1[11] = paramArrayOflong1[11] ^ paramArrayOflong4[11];
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 0, l1, l4);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 4, l3, l6);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 2, l2, l5);
    paramArrayOflong1[3] = paramArrayOflong1[3] ^ paramArrayOflong4[0];
    paramArrayOflong4[1] = paramArrayOflong4[1] ^ paramArrayOflong4[2];
    paramArrayOflong4[0] = paramArrayOflong4[0] ^ paramArrayOflong4[1];
    paramArrayOflong4[3] = paramArrayOflong4[3] ^ paramArrayOflong4[4];
    paramArrayOflong4[4] = paramArrayOflong4[3] ^ paramArrayOflong4[5];
    paramArrayOflong1[5] = paramArrayOflong1[5] ^ paramArrayOflong4[3] ^ paramArrayOflong4[0];
    paramArrayOflong1[6] = paramArrayOflong1[6] ^ paramArrayOflong4[1] ^ paramArrayOflong4[4];
    paramArrayOflong1[4] = paramArrayOflong1[4] ^ paramArrayOflong4[0];
    paramArrayOflong1[7] = paramArrayOflong1[7] ^ paramArrayOflong4[4];
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong4[5];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, 4, l1 ^ l2, l4 ^ l5);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, 6, l2 ^ l3, l5 ^ l6);
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, 5, l1 ^ l3, l4 ^ l6);
  }
  
  private static void mul416_no_simd_gf2x(long[] paramArrayOflong1, long[] paramArrayOflong2, int paramInt1, long[] paramArrayOflong3, int paramInt2, long[] paramArrayOflong4) {
    mul192_no_simd_gf2x(paramArrayOflong1, 0, paramArrayOflong2, paramInt1, paramArrayOflong3, paramInt2);
    mul128_no_simd_gf2x(paramArrayOflong1, 6, paramArrayOflong2[paramInt1 + 3], paramArrayOflong2[paramInt1 + 4], paramArrayOflong3[paramInt2 + 3], paramArrayOflong3[paramInt2 + 4]);
    MUL64_NO_SIMD_GF2X(paramArrayOflong1, 10, paramArrayOflong2[paramInt1 + 5], paramArrayOflong3[paramInt2 + 5]);
    paramArrayOflong1[12] = MUL32_NO_SIMD_GF2X(paramArrayOflong2[paramInt1 + 6], paramArrayOflong3[paramInt2 + 6]) ^ paramArrayOflong1[11];
    paramArrayOflong1[11] = paramArrayOflong1[10] ^ paramArrayOflong1[12];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong1, 11, paramArrayOflong2[paramInt1 + 5] ^ paramArrayOflong2[paramInt1 + 6], paramArrayOflong3[paramInt2 + 5] ^ paramArrayOflong3[paramInt2 + 6]);
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong1[10];
    paramArrayOflong1[11] = paramArrayOflong1[11] ^ paramArrayOflong1[9];
    paramArrayOflong1[10] = paramArrayOflong1[8] ^ paramArrayOflong1[12];
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong1[6];
    paramArrayOflong1[9] = paramArrayOflong1[11] ^ paramArrayOflong1[7];
    mul128_no_simd_gf2x_xor(paramArrayOflong1, 8, paramArrayOflong2[paramInt1 + 3] ^ paramArrayOflong2[paramInt1 + 5], paramArrayOflong2[paramInt1 + 4] ^ paramArrayOflong2[paramInt1 + 6], paramArrayOflong3[paramInt2 + 3] ^ paramArrayOflong3[paramInt2 + 5], paramArrayOflong3[paramInt2 + 4] ^ paramArrayOflong3[paramInt2 + 6], paramArrayOflong4);
    long l1 = paramArrayOflong2[paramInt1] ^ paramArrayOflong2[paramInt1 + 3];
    long l2 = paramArrayOflong2[paramInt1 + 1] ^ paramArrayOflong2[paramInt1 + 4];
    long l3 = paramArrayOflong2[paramInt1 + 2] ^ paramArrayOflong2[paramInt1 + 5];
    long l4 = paramArrayOflong2[paramInt1 + 6];
    long l5 = paramArrayOflong3[paramInt2] ^ paramArrayOflong3[paramInt2 + 3];
    long l6 = paramArrayOflong3[paramInt2 + 1] ^ paramArrayOflong3[paramInt2 + 4];
    long l7 = paramArrayOflong3[paramInt2 + 2] ^ paramArrayOflong3[paramInt2 + 5];
    long l8 = paramArrayOflong3[paramInt2 + 6];
    paramArrayOflong1[6] = paramArrayOflong1[6] ^ paramArrayOflong1[3];
    paramArrayOflong1[7] = paramArrayOflong1[7] ^ paramArrayOflong1[4];
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong1[5];
    mul128_no_simd_gf2x(paramArrayOflong4, 0, l1, l2, l5, l6);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 4, l3, l7);
    paramArrayOflong4[6] = MUL32_NO_SIMD_GF2X(l4, l8) ^ paramArrayOflong4[5];
    paramArrayOflong4[5] = paramArrayOflong4[4] ^ paramArrayOflong4[6];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong4, 5, l3 ^ l4, l7 ^ l8);
    paramArrayOflong1[3] = paramArrayOflong1[6] ^ paramArrayOflong1[0] ^ paramArrayOflong4[0];
    paramArrayOflong1[4] = paramArrayOflong1[7] ^ paramArrayOflong1[1] ^ paramArrayOflong4[1];
    paramArrayOflong4[2] = paramArrayOflong4[2] ^ paramArrayOflong4[4];
    paramArrayOflong4[3] = paramArrayOflong4[3] ^ paramArrayOflong4[5];
    paramArrayOflong1[5] = paramArrayOflong1[8] ^ paramArrayOflong1[2] ^ paramArrayOflong4[2] ^ paramArrayOflong4[0];
    paramArrayOflong1[6] = paramArrayOflong1[6] ^ paramArrayOflong1[9] ^ paramArrayOflong4[3] ^ paramArrayOflong4[1];
    paramArrayOflong1[7] = paramArrayOflong1[7] ^ paramArrayOflong1[10] ^ paramArrayOflong4[2] ^ paramArrayOflong4[6];
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong1[11] ^ paramArrayOflong4[3];
    paramArrayOflong1[9] = paramArrayOflong1[9] ^ paramArrayOflong1[12] ^ paramArrayOflong4[6];
    mul128_no_simd_gf2x_xor(paramArrayOflong1, 5, l1 ^ l3, l2 ^ l4, l5 ^ l7, l6 ^ l8, paramArrayOflong4);
  }
  
  private static void mul416_no_simd_gf2x_xor(long[] paramArrayOflong1, long[] paramArrayOflong2, int paramInt1, long[] paramArrayOflong3, int paramInt2, long[] paramArrayOflong4, long[] paramArrayOflong5) {
    mul192_no_simd_gf2x(paramArrayOflong4, 0, paramArrayOflong2, paramInt1, paramArrayOflong3, paramInt2);
    mul128_no_simd_gf2x(paramArrayOflong4, 6, paramArrayOflong2[paramInt1 + 3], paramArrayOflong2[paramInt1 + 4], paramArrayOflong3[paramInt2 + 3], paramArrayOflong3[paramInt2 + 4]);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 10, paramArrayOflong2[paramInt1 + 5], paramArrayOflong3[paramInt2 + 5]);
    paramArrayOflong4[12] = MUL32_NO_SIMD_GF2X(paramArrayOflong2[paramInt1 + 6], paramArrayOflong3[paramInt2 + 6]) ^ paramArrayOflong4[11];
    paramArrayOflong4[11] = paramArrayOflong4[10] ^ paramArrayOflong4[12];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong4, 11, paramArrayOflong2[paramInt1 + 5] ^ paramArrayOflong2[paramInt1 + 6], paramArrayOflong3[paramInt2 + 5] ^ paramArrayOflong3[paramInt2 + 6]);
    paramArrayOflong4[8] = paramArrayOflong4[8] ^ paramArrayOflong4[10];
    paramArrayOflong4[11] = paramArrayOflong4[11] ^ paramArrayOflong4[9];
    paramArrayOflong4[10] = paramArrayOflong4[8] ^ paramArrayOflong4[12];
    paramArrayOflong4[8] = paramArrayOflong4[8] ^ paramArrayOflong4[6];
    paramArrayOflong4[9] = paramArrayOflong4[11] ^ paramArrayOflong4[7];
    paramArrayOflong4[6] = paramArrayOflong4[6] ^ paramArrayOflong4[3];
    paramArrayOflong4[7] = paramArrayOflong4[7] ^ paramArrayOflong4[4];
    paramArrayOflong4[8] = paramArrayOflong4[8] ^ paramArrayOflong4[5];
    mul128_no_simd_gf2x_xor(paramArrayOflong4, 8, paramArrayOflong2[paramInt1 + 3] ^ paramArrayOflong2[paramInt1 + 5], paramArrayOflong2[paramInt1 + 4] ^ paramArrayOflong2[paramInt1 + 6], paramArrayOflong3[paramInt2 + 3] ^ paramArrayOflong3[paramInt2 + 5], paramArrayOflong3[paramInt2 + 4] ^ paramArrayOflong3[paramInt2 + 6], paramArrayOflong5);
    paramArrayOflong1[0] = paramArrayOflong1[0] ^ paramArrayOflong4[0];
    paramArrayOflong1[1] = paramArrayOflong1[1] ^ paramArrayOflong4[1];
    paramArrayOflong1[2] = paramArrayOflong1[2] ^ paramArrayOflong4[2];
    paramArrayOflong1[3] = paramArrayOflong1[3] ^ paramArrayOflong4[6] ^ paramArrayOflong4[0];
    paramArrayOflong1[4] = paramArrayOflong1[4] ^ paramArrayOflong4[7] ^ paramArrayOflong4[1];
    paramArrayOflong1[5] = paramArrayOflong1[5] ^ paramArrayOflong4[8] ^ paramArrayOflong4[2];
    paramArrayOflong1[6] = paramArrayOflong1[6] ^ paramArrayOflong4[6] ^ paramArrayOflong4[9];
    paramArrayOflong1[7] = paramArrayOflong1[7] ^ paramArrayOflong4[7] ^ paramArrayOflong4[10];
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong4[8] ^ paramArrayOflong4[11];
    paramArrayOflong1[9] = paramArrayOflong1[9] ^ paramArrayOflong4[9] ^ paramArrayOflong4[12];
    paramArrayOflong1[10] = paramArrayOflong1[10] ^ paramArrayOflong4[10];
    paramArrayOflong1[11] = paramArrayOflong1[11] ^ paramArrayOflong4[11];
    paramArrayOflong1[12] = paramArrayOflong1[12] ^ paramArrayOflong4[12];
    long l1 = paramArrayOflong2[paramInt1] ^ paramArrayOflong2[paramInt1 + 3];
    long l2 = paramArrayOflong2[paramInt1 + 1] ^ paramArrayOflong2[paramInt1 + 4];
    long l3 = paramArrayOflong2[paramInt1 + 2] ^ paramArrayOflong2[paramInt1 + 5];
    long l4 = paramArrayOflong2[paramInt1 + 6];
    long l5 = paramArrayOflong3[paramInt2] ^ paramArrayOflong3[paramInt2 + 3];
    long l6 = paramArrayOflong3[paramInt2 + 1] ^ paramArrayOflong3[paramInt2 + 4];
    long l7 = paramArrayOflong3[paramInt2 + 2] ^ paramArrayOflong3[paramInt2 + 5];
    long l8 = paramArrayOflong3[paramInt2 + 6];
    mul128_no_simd_gf2x(paramArrayOflong4, 0, l1, l2, l5, l6);
    MUL64_NO_SIMD_GF2X(paramArrayOflong4, 4, l3, l7);
    paramArrayOflong4[6] = MUL32_NO_SIMD_GF2X(l4, l8) ^ paramArrayOflong4[5];
    paramArrayOflong4[5] = paramArrayOflong4[4] ^ paramArrayOflong4[6];
    MUL64_NO_SIMD_GF2X_XOR(paramArrayOflong4, 5, l3 ^ l4, l7 ^ l8);
    paramArrayOflong1[3] = paramArrayOflong1[3] ^ paramArrayOflong4[0];
    paramArrayOflong1[4] = paramArrayOflong1[4] ^ paramArrayOflong4[1];
    paramArrayOflong4[2] = paramArrayOflong4[2] ^ paramArrayOflong4[4];
    paramArrayOflong4[3] = paramArrayOflong4[3] ^ paramArrayOflong4[5];
    paramArrayOflong1[5] = paramArrayOflong1[5] ^ paramArrayOflong4[2] ^ paramArrayOflong4[0];
    paramArrayOflong1[6] = paramArrayOflong1[6] ^ paramArrayOflong4[3] ^ paramArrayOflong4[1];
    paramArrayOflong1[7] = paramArrayOflong1[7] ^ paramArrayOflong4[2] ^ paramArrayOflong4[6];
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong4[3];
    paramArrayOflong1[9] = paramArrayOflong1[9] ^ paramArrayOflong4[6];
    mul128_no_simd_gf2x_xor(paramArrayOflong1, 5, l1 ^ l3, l2 ^ l4, l5 ^ l7, l6 ^ l8, paramArrayOflong4);
  }
  
  private static void mul544_no_simd_gf2x(long[] paramArrayOflong1, long[] paramArrayOflong2, int paramInt1, long[] paramArrayOflong3, int paramInt2, long[] paramArrayOflong4, long[] paramArrayOflong5, long[] paramArrayOflong6) {
    mul128_no_simd_gf2x(paramArrayOflong1, 0, paramArrayOflong2[paramInt1], paramArrayOflong2[paramInt1 + 1], paramArrayOflong3[paramInt2], paramArrayOflong3[paramInt2 + 1]);
    mul128_no_simd_gf2x(paramArrayOflong1, 4, paramArrayOflong2[paramInt1 + 2], paramArrayOflong2[paramInt1 + 3], paramArrayOflong3[paramInt2 + 2], paramArrayOflong3[paramInt2 + 3]);
    paramArrayOflong1[4] = paramArrayOflong1[4] ^ paramArrayOflong1[2];
    paramArrayOflong1[5] = paramArrayOflong1[5] ^ paramArrayOflong1[3];
    paramArrayOflong1[2] = paramArrayOflong1[4] ^ paramArrayOflong1[0];
    paramArrayOflong1[3] = paramArrayOflong1[5] ^ paramArrayOflong1[1];
    paramArrayOflong1[4] = paramArrayOflong1[4] ^ paramArrayOflong1[6];
    paramArrayOflong1[5] = paramArrayOflong1[5] ^ paramArrayOflong1[7];
    mul128_no_simd_gf2x_xor(paramArrayOflong1, 2, paramArrayOflong2[paramInt1] ^ paramArrayOflong2[paramInt1 + 2], paramArrayOflong2[paramInt1 + 1] ^ paramArrayOflong2[paramInt1 + 3], paramArrayOflong3[paramInt2] ^ paramArrayOflong3[paramInt2 + 2], paramArrayOflong3[paramInt2 + 1] ^ paramArrayOflong3[paramInt2 + 3], paramArrayOflong6);
    mul288_no_simd_gf2x(paramArrayOflong1, 8, paramArrayOflong2, paramInt1 + 4, paramArrayOflong3, paramInt2 + 4, paramArrayOflong6);
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong1[4];
    paramArrayOflong1[9] = paramArrayOflong1[9] ^ paramArrayOflong1[5];
    paramArrayOflong1[10] = paramArrayOflong1[10] ^ paramArrayOflong1[6];
    paramArrayOflong1[11] = paramArrayOflong1[11] ^ paramArrayOflong1[7];
    paramArrayOflong1[4] = paramArrayOflong1[8] ^ paramArrayOflong1[0];
    paramArrayOflong1[5] = paramArrayOflong1[9] ^ paramArrayOflong1[1];
    paramArrayOflong1[6] = paramArrayOflong1[10] ^ paramArrayOflong1[2];
    paramArrayOflong1[7] = paramArrayOflong1[11] ^ paramArrayOflong1[3];
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong1[12];
    paramArrayOflong1[9] = paramArrayOflong1[9] ^ paramArrayOflong1[13];
    paramArrayOflong1[10] = paramArrayOflong1[10] ^ paramArrayOflong1[14];
    paramArrayOflong1[11] = paramArrayOflong1[11] ^ paramArrayOflong1[15];
    paramArrayOflong1[12] = paramArrayOflong1[12] ^ paramArrayOflong1[16];
    paramArrayOflong4[0] = paramArrayOflong2[paramInt1] ^ paramArrayOflong2[paramInt1 + 4];
    paramArrayOflong4[1] = paramArrayOflong2[paramInt1 + 1] ^ paramArrayOflong2[paramInt1 + 5];
    paramArrayOflong4[2] = paramArrayOflong2[paramInt1 + 2] ^ paramArrayOflong2[paramInt1 + 6];
    paramArrayOflong4[3] = paramArrayOflong2[paramInt1 + 3] ^ paramArrayOflong2[paramInt1 + 7];
    paramArrayOflong4[4] = paramArrayOflong2[paramInt1 + 8];
    paramArrayOflong5[0] = paramArrayOflong3[paramInt2] ^ paramArrayOflong3[paramInt2 + 4];
    paramArrayOflong5[1] = paramArrayOflong3[paramInt2 + 1] ^ paramArrayOflong3[paramInt2 + 5];
    paramArrayOflong5[2] = paramArrayOflong3[paramInt2 + 2] ^ paramArrayOflong3[paramInt2 + 6];
    paramArrayOflong5[3] = paramArrayOflong3[paramInt2 + 3] ^ paramArrayOflong3[paramInt2 + 7];
    paramArrayOflong5[4] = paramArrayOflong3[paramInt2 + 8];
    mul288_no_simd_gf2x_xor(paramArrayOflong1, 4, paramArrayOflong4, 0, paramArrayOflong5, 0, paramArrayOflong6);
  }
  
  private static void mul544_no_simd_gf2x_xor(long[] paramArrayOflong1, long[] paramArrayOflong2, int paramInt1, long[] paramArrayOflong3, int paramInt2, long[] paramArrayOflong4, long[] paramArrayOflong5, long[] paramArrayOflong6, long[] paramArrayOflong7) {
    mul128_no_simd_gf2x(paramArrayOflong6, 0, paramArrayOflong2[paramInt1], paramArrayOflong2[paramInt1 + 1], paramArrayOflong3[paramInt2], paramArrayOflong3[paramInt2 + 1]);
    mul128_no_simd_gf2x(paramArrayOflong6, 4, paramArrayOflong2[paramInt1 + 2], paramArrayOflong2[paramInt1 + 3], paramArrayOflong3[paramInt2 + 2], paramArrayOflong3[paramInt2 + 3]);
    paramArrayOflong6[4] = paramArrayOflong6[4] ^ paramArrayOflong6[2];
    paramArrayOflong6[5] = paramArrayOflong6[5] ^ paramArrayOflong6[3];
    paramArrayOflong6[2] = paramArrayOflong6[4] ^ paramArrayOflong6[0];
    paramArrayOflong6[3] = paramArrayOflong6[5] ^ paramArrayOflong6[1];
    paramArrayOflong6[4] = paramArrayOflong6[4] ^ paramArrayOflong6[6];
    paramArrayOflong6[5] = paramArrayOflong6[5] ^ paramArrayOflong6[7];
    mul128_no_simd_gf2x_xor(paramArrayOflong6, 2, paramArrayOflong2[paramInt1] ^ paramArrayOflong2[paramInt1 + 2], paramArrayOflong2[paramInt1 + 1] ^ paramArrayOflong2[paramInt1 + 3], paramArrayOflong3[paramInt2] ^ paramArrayOflong3[paramInt2 + 2], paramArrayOflong3[paramInt2 + 1] ^ paramArrayOflong3[paramInt2 + 3], paramArrayOflong7);
    mul288_no_simd_gf2x(paramArrayOflong6, 8, paramArrayOflong2, paramInt1 + 4, paramArrayOflong3, paramInt2 + 4, paramArrayOflong7);
    paramArrayOflong6[8] = paramArrayOflong6[8] ^ paramArrayOflong6[4];
    paramArrayOflong6[9] = paramArrayOflong6[9] ^ paramArrayOflong6[5];
    paramArrayOflong6[10] = paramArrayOflong6[10] ^ paramArrayOflong6[6];
    paramArrayOflong6[11] = paramArrayOflong6[11] ^ paramArrayOflong6[7];
    paramArrayOflong1[0] = paramArrayOflong1[0] ^ paramArrayOflong6[0];
    paramArrayOflong1[1] = paramArrayOflong1[1] ^ paramArrayOflong6[1];
    paramArrayOflong1[2] = paramArrayOflong1[2] ^ paramArrayOflong6[2];
    paramArrayOflong1[3] = paramArrayOflong1[3] ^ paramArrayOflong6[3];
    paramArrayOflong1[4] = paramArrayOflong1[4] ^ paramArrayOflong6[8] ^ paramArrayOflong6[0];
    paramArrayOflong1[5] = paramArrayOflong1[5] ^ paramArrayOflong6[9] ^ paramArrayOflong6[1];
    paramArrayOflong1[6] = paramArrayOflong1[6] ^ paramArrayOflong6[10] ^ paramArrayOflong6[2];
    paramArrayOflong1[7] = paramArrayOflong1[7] ^ paramArrayOflong6[11] ^ paramArrayOflong6[3];
    paramArrayOflong1[8] = paramArrayOflong1[8] ^ paramArrayOflong6[8] ^ paramArrayOflong6[12];
    paramArrayOflong1[9] = paramArrayOflong1[9] ^ paramArrayOflong6[9] ^ paramArrayOflong6[13];
    paramArrayOflong1[10] = paramArrayOflong1[10] ^ paramArrayOflong6[10] ^ paramArrayOflong6[14];
    paramArrayOflong1[11] = paramArrayOflong1[11] ^ paramArrayOflong6[11] ^ paramArrayOflong6[15];
    paramArrayOflong1[12] = paramArrayOflong1[12] ^ paramArrayOflong6[12] ^ paramArrayOflong6[16];
    paramArrayOflong1[13] = paramArrayOflong1[13] ^ paramArrayOflong6[13];
    paramArrayOflong1[14] = paramArrayOflong1[14] ^ paramArrayOflong6[14];
    paramArrayOflong1[15] = paramArrayOflong1[15] ^ paramArrayOflong6[15];
    paramArrayOflong1[16] = paramArrayOflong1[16] ^ paramArrayOflong6[16];
    paramArrayOflong4[0] = paramArrayOflong2[paramInt1] ^ paramArrayOflong2[paramInt1 + 4];
    paramArrayOflong4[1] = paramArrayOflong2[paramInt1 + 1] ^ paramArrayOflong2[paramInt1 + 5];
    paramArrayOflong4[2] = paramArrayOflong2[paramInt1 + 2] ^ paramArrayOflong2[paramInt1 + 6];
    paramArrayOflong4[3] = paramArrayOflong2[paramInt1 + 3] ^ paramArrayOflong2[paramInt1 + 7];
    paramArrayOflong4[4] = paramArrayOflong2[paramInt1 + 8];
    paramArrayOflong5[0] = paramArrayOflong3[paramInt2] ^ paramArrayOflong3[paramInt2 + 4];
    paramArrayOflong5[1] = paramArrayOflong3[paramInt2 + 1] ^ paramArrayOflong3[paramInt2 + 5];
    paramArrayOflong5[2] = paramArrayOflong3[paramInt2 + 2] ^ paramArrayOflong3[paramInt2 + 6];
    paramArrayOflong5[3] = paramArrayOflong3[paramInt2 + 3] ^ paramArrayOflong3[paramInt2 + 7];
    paramArrayOflong5[4] = paramArrayOflong3[paramInt2 + 8];
    mul288_no_simd_gf2x_xor(paramArrayOflong1, 4, paramArrayOflong4, 0, paramArrayOflong5, 0, paramArrayOflong6);
  }
  
  public static class Mul12 extends Mul_GF2x {
    private long[] Buffer = new long[12];
    
    public void mul_gf2x(Pointer param1Pointer1, Pointer param1Pointer2, Pointer param1Pointer3) {
      Mul_GF2x.mul384_no_simd_gf2x(param1Pointer1.array, param1Pointer2.array, param1Pointer2.cp, param1Pointer3.array, param1Pointer3.cp, this.Buffer);
    }
    
    public void sqr_gf2x(long[] param1ArrayOflong1, long[] param1ArrayOflong2, int param1Int) {
      Mul_GF2x.SQR128_NO_SIMD_GF2X(param1ArrayOflong1, 8, param1ArrayOflong2, param1Int + 4);
      Mul_GF2x.SQR256_NO_SIMD_GF2X(param1ArrayOflong1, 0, param1ArrayOflong2, param1Int);
    }
    
    public void mul_gf2x_xor(Pointer param1Pointer1, Pointer param1Pointer2, Pointer param1Pointer3) {
      Mul_GF2x.mul384_no_simd_gf2x_xor(param1Pointer1.array, param1Pointer2.array, param1Pointer2.cp, param1Pointer3.array, param1Pointer3.cp, this.Buffer);
    }
  }
  
  public static class Mul13 extends Mul_GF2x {
    private long[] Buffer = new long[13];
    
    private long[] Buffer2 = new long[4];
    
    public void mul_gf2x(Pointer param1Pointer1, Pointer param1Pointer2, Pointer param1Pointer3) {
      Mul_GF2x.mul416_no_simd_gf2x(param1Pointer1.array, param1Pointer2.array, param1Pointer2.cp, param1Pointer3.array, param1Pointer3.cp, this.Buffer);
    }
    
    public void sqr_gf2x(long[] param1ArrayOflong1, long[] param1ArrayOflong2, int param1Int) {
      param1ArrayOflong1[12] = Mul_GF2x.SQR32_NO_SIMD_GF2X(param1ArrayOflong2[param1Int + 6]);
      Mul_GF2x.SQR128_NO_SIMD_GF2X(param1ArrayOflong1, 8, param1ArrayOflong2, param1Int + 4);
      Mul_GF2x.SQR256_NO_SIMD_GF2X(param1ArrayOflong1, 0, param1ArrayOflong2, param1Int);
    }
    
    public void mul_gf2x_xor(Pointer param1Pointer1, Pointer param1Pointer2, Pointer param1Pointer3) {
      Mul_GF2x.mul416_no_simd_gf2x_xor(param1Pointer1.array, param1Pointer2.array, param1Pointer2.cp, param1Pointer3.array, param1Pointer3.cp, this.Buffer, this.Buffer2);
    }
  }
  
  public static class Mul17 extends Mul_GF2x {
    private long[] AA = new long[5];
    
    private long[] BB = new long[5];
    
    private long[] Buffer1 = new long[17];
    
    private long[] Buffer2 = new long[4];
    
    public void mul_gf2x(Pointer param1Pointer1, Pointer param1Pointer2, Pointer param1Pointer3) {
      Mul_GF2x.mul544_no_simd_gf2x(param1Pointer1.array, param1Pointer2.array, param1Pointer2.cp, param1Pointer3.array, param1Pointer3.cp, this.AA, this.BB, this.Buffer1);
    }
    
    public void sqr_gf2x(long[] param1ArrayOflong1, long[] param1ArrayOflong2, int param1Int) {
      param1ArrayOflong1[16] = Mul_GF2x.SQR32_NO_SIMD_GF2X(param1ArrayOflong2[param1Int + 8]);
      Mul_GF2x.SQR256_NO_SIMD_GF2X(param1ArrayOflong1, 8, param1ArrayOflong2, param1Int + 4);
      Mul_GF2x.SQR256_NO_SIMD_GF2X(param1ArrayOflong1, 0, param1ArrayOflong2, param1Int);
    }
    
    public void mul_gf2x_xor(Pointer param1Pointer1, Pointer param1Pointer2, Pointer param1Pointer3) {
      Mul_GF2x.mul544_no_simd_gf2x_xor(param1Pointer1.array, param1Pointer2.array, param1Pointer2.cp, param1Pointer3.array, param1Pointer3.cp, this.AA, this.BB, this.Buffer1, this.Buffer2);
    }
  }
  
  public static class Mul6 extends Mul_GF2x {
    private long[] Buffer = new long[6];
    
    public void mul_gf2x(Pointer param1Pointer1, Pointer param1Pointer2, Pointer param1Pointer3) {
      mul192_no_simd_gf2x(param1Pointer1.array, 0, param1Pointer2.array, param1Pointer2.cp, param1Pointer3.array, param1Pointer3.cp);
    }
    
    public void sqr_gf2x(long[] param1ArrayOflong1, long[] param1ArrayOflong2, int param1Int) {
      Mul_GF2x.SQR64_NO_SIMD_GF2X(param1ArrayOflong1, 4, param1ArrayOflong2[param1Int + 2]);
      Mul_GF2x.SQR128_NO_SIMD_GF2X(param1ArrayOflong1, 0, param1ArrayOflong2, param1Int);
    }
    
    public void mul_gf2x_xor(Pointer param1Pointer1, Pointer param1Pointer2, Pointer param1Pointer3) {
      mul192_no_simd_gf2x_xor(param1Pointer1.array, param1Pointer1.cp, param1Pointer2.array, param1Pointer2.cp, param1Pointer3.array, param1Pointer3.cp, this.Buffer);
    }
  }
  
  public static class Mul9 extends Mul_GF2x {
    private long[] Buffer = new long[9];
    
    public void mul_gf2x(Pointer param1Pointer1, Pointer param1Pointer2, Pointer param1Pointer3) {
      Mul_GF2x.mul288_no_simd_gf2x(param1Pointer1.array, 0, param1Pointer2.array, param1Pointer2.cp, param1Pointer3.array, param1Pointer3.cp, this.Buffer);
    }
    
    public void sqr_gf2x(long[] param1ArrayOflong1, long[] param1ArrayOflong2, int param1Int) {
      param1ArrayOflong1[8] = Mul_GF2x.SQR32_NO_SIMD_GF2X(param1ArrayOflong2[param1Int + 4]);
      Mul_GF2x.SQR256_NO_SIMD_GF2X(param1ArrayOflong1, 0, param1ArrayOflong2, param1Int);
    }
    
    public void mul_gf2x_xor(Pointer param1Pointer1, Pointer param1Pointer2, Pointer param1Pointer3) {
      Mul_GF2x.mul288_no_simd_gf2x_xor(param1Pointer1.array, param1Pointer1.cp, param1Pointer2.array, param1Pointer2.cp, param1Pointer3.array, param1Pointer3.cp, this.Buffer);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\Mul_GF2x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */