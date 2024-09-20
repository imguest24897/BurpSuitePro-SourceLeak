package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.util.Pack;

class GF2Field {
  static final byte[][] gfMulTable = new byte[256][256];
  
  static final byte[] gfInvTable = new byte[256];
  
  public static final int MASK = 255;
  
  private static short gf4Mul2(short paramShort) {
    int i = paramShort << 1;
    i ^= (paramShort >>> 1) * 7;
    return (short)(i & 0xFF);
  }
  
  private static short gf4Mul3(short paramShort) {
    int i = paramShort - 2 >>> 1;
    int j = i & paramShort * 3 | (i ^ 0xFFFFFFFF) & paramShort - 1;
    return (short)(j & 0xFF);
  }
  
  private static short gf4Mul(short paramShort1, short paramShort2) {
    int i = paramShort1 * (paramShort2 & 0x1);
    i ^= gf4Mul2(paramShort1) * (paramShort2 >>> 1);
    return (short)(i & 0xFF);
  }
  
  private static short gf4Squ(short paramShort) {
    int i = paramShort ^ paramShort >>> 1;
    return (short)(i & 0xFF);
  }
  
  private static short gf16Mul(short paramShort1, short paramShort2) {
    short s1 = (short)(paramShort1 & 0x3 & 0xFF);
    short s2 = (short)(paramShort1 >>> 2 & 0xFF);
    short s3 = (short)(paramShort2 & 0x3 & 0xFF);
    short s4 = (short)(paramShort2 >>> 2 & 0xFF);
    short s5 = gf4Mul(s1, s3);
    short s6 = gf4Mul(s2, s4);
    short s7 = (short)(gf4Mul((short)(s1 ^ s2), (short)(s3 ^ s4)) ^ s5);
    short s8 = gf4Mul2(s6);
    return (short)((s7 << 2 ^ s5 ^ s8) & 0xFF);
  }
  
  private static short gf16Squ(short paramShort) {
    short s1 = (short)(paramShort & 0x3 & 0xFF);
    short s2 = (short)(paramShort >>> 2 & 0xFF);
    s2 = gf4Squ(s2);
    short s3 = gf4Mul2(s2);
    return (short)((s2 << 2 ^ s3 ^ gf4Squ(s1)) & 0xFF);
  }
  
  private static short gf16Mul8(short paramShort) {
    short s1 = (short)(paramShort & 0x3 & 0xFF);
    short s2 = (short)(paramShort >>> 2 & 0xFF);
    int i = gf4Mul2((short)(s1 ^ s2)) << 2;
    i |= gf4Mul3(s2);
    return (short)(i & 0xFF);
  }
  
  private static short gf256Mul(short paramShort1, short paramShort2) {
    short s1 = (short)(paramShort1 & 0xF & 0xFF);
    short s2 = (short)(paramShort1 >>> 4 & 0xFF);
    short s3 = (short)(paramShort2 & 0xF & 0xFF);
    short s4 = (short)(paramShort2 >>> 4 & 0xFF);
    short s5 = gf16Mul(s1, s3);
    short s6 = gf16Mul(s2, s4);
    short s7 = (short)(gf16Mul((short)(s1 ^ s2), (short)(s3 ^ s4)) ^ s5);
    short s8 = gf16Mul8(s6);
    return (short)((s7 << 4 ^ s5 ^ s8) & 0xFF);
  }
  
  private static short gf256Squ(short paramShort) {
    short s1 = (short)(paramShort & 0xF & 0xFF);
    short s2 = (short)(paramShort >>> 4 & 0xFF);
    s2 = gf16Squ(s2);
    short s3 = gf16Mul8(s2);
    return (short)((s2 << 4 ^ s3 ^ gf16Squ(s1)) & 0xFF);
  }
  
  private static short gf256Inv(short paramShort) {
    short s1 = gf256Squ(paramShort);
    short s2 = gf256Squ(s1);
    short s3 = gf256Squ(s2);
    short s4 = gf256Mul(s2, s1);
    short s5 = gf256Mul(s4, s3);
    short s6 = gf256Squ(s5);
    s6 = gf256Squ(s6);
    s6 = gf256Squ(s6);
    short s7 = gf256Mul(s6, s5);
    short s8 = gf256Squ(s7);
    return gf256Mul(s1, s8);
  }
  
  public static short addElem(short paramShort1, short paramShort2) {
    return (short)(paramShort1 ^ paramShort2);
  }
  
  public static long addElem_64(long paramLong1, long paramLong2) {
    return paramLong1 ^ paramLong2;
  }
  
  public static short invElem(short paramShort) {
    return (short)(gfInvTable[paramShort] & 0xFF);
  }
  
  public static long invElem_64(long paramLong) {
    return gf256Inv_64(paramLong);
  }
  
  public static short multElem(short paramShort1, short paramShort2) {
    return (short)(gfMulTable[paramShort1][paramShort2] & 0xFF);
  }
  
  public static long multElem_64(long paramLong1, long paramLong2) {
    return gf256Mul_64(paramLong1, paramLong2);
  }
  
  private static long gf4Mul2_64(long paramLong) {
    long l1 = paramLong & 0x5555555555555555L;
    long l2 = paramLong & 0xAAAAAAAAAAAAAAAAL;
    return l2 ^ l1 << 1L ^ l2 >>> 1L;
  }
  
  private static long gf4Mul_64(long paramLong1, long paramLong2) {
    long l1 = (paramLong1 << 1L & paramLong2 ^ paramLong2 << 1L & paramLong1) & 0xAAAAAAAAAAAAAAAAL;
    long l2 = paramLong1 & paramLong2;
    return l2 ^ l1 ^ (l2 & 0xAAAAAAAAAAAAAAAAL) >>> 1L;
  }
  
  private static long gf4Squ_64(long paramLong) {
    long l = paramLong & 0xAAAAAAAAAAAAAAAAL;
    return paramLong ^ l >>> 1L;
  }
  
  private static long gf16Mul_64(long paramLong1, long paramLong2) {
    long l1 = gf4Mul_64(paramLong1, paramLong2);
    long l2 = l1 & 0x3333333333333333L;
    long l3 = l1 & 0xCCCCCCCCCCCCCCCCL;
    long l4 = (paramLong1 << 2L ^ paramLong1) & 0xCCCCCCCCCCCCCCCCL ^ l3 >>> 2L;
    long l5 = (paramLong2 << 2L ^ paramLong2) & 0xCCCCCCCCCCCCCCCCL ^ 0x2222222222222222L;
    long l6 = gf4Mul_64(l4, l5);
    return l6 ^ l2 << 2L ^ l2;
  }
  
  private static long gf16Squ_64(long paramLong) {
    long l1 = gf4Squ_64(paramLong);
    long l2 = gf4Mul2_64(l1 & 0xCCCCCCCCCCCCCCCCL);
    return l1 ^ l2 >>> 2L;
  }
  
  private static long gf16Mul8_64(long paramLong) {
    long l1 = paramLong & 0x3333333333333333L;
    long l2 = paramLong & 0xCCCCCCCCCCCCCCCCL;
    long l3 = l1 << 2L ^ l2 ^ l2 >>> 2L;
    long l4 = gf4Mul2_64(l3);
    return l4 ^ l2 >>> 2L;
  }
  
  private static long gf256Mul_64(long paramLong1, long paramLong2) {
    long l1 = gf16Mul_64(paramLong1, paramLong2);
    long l2 = l1 & 0xF0F0F0F0F0F0F0FL;
    long l3 = l1 & 0xF0F0F0F0F0F0F0F0L;
    long l4 = (paramLong1 << 4L ^ paramLong1) & 0xF0F0F0F0F0F0F0F0L ^ l3 >>> 4L;
    long l5 = (paramLong2 << 4L ^ paramLong2) & 0xF0F0F0F0F0F0F0F0L ^ 0x808080808080808L;
    long l6 = gf16Mul_64(l4, l5);
    return l6 ^ l2 << 4L ^ l2;
  }
  
  private static long gf256Squ_64(long paramLong) {
    long l1 = gf16Squ_64(paramLong);
    long l2 = l1 & 0xF0F0F0F0F0F0F0F0L;
    long l3 = gf16Mul8_64(l2);
    return l1 ^ l3 >>> 4L;
  }
  
  private static long gf256Inv_64(long paramLong) {
    long l1 = gf256Squ_64(paramLong);
    long l2 = gf256Squ_64(l1);
    long l3 = gf256Squ_64(l2);
    long l4 = gf256Mul_64(l2, l1);
    long l5 = gf256Mul_64(l4, l3);
    long l6 = gf256Squ_64(l5);
    l6 = gf256Squ_64(l6);
    l6 = gf256Squ_64(l6);
    long l7 = gf256Mul_64(l6, l5);
    long l8 = gf256Squ_64(l7);
    return gf256Mul_64(l1, l8);
  }
  
  static {
    long l = 72340172838076673L;
    byte b;
    for (b = 1; b <= 'ÿ'; b++) {
      long l1 = 506097522914230528L;
      for (byte b1 = 0; b1 < 'Ā'; b1 += 8) {
        long l2 = gf256Mul_64(l, l1);
        Pack.longToLittleEndian(l2, gfMulTable[b], b1);
        l1 += 578721382704613384L;
      } 
      l += 72340172838076673L;
    } 
    l = 506097522914230528L;
    for (b = 0; b < 'Ā'; b += 8) {
      long l1 = gf256Inv_64(l);
      Pack.longToLittleEndian(l1, gfInvTable, b);
      l += 578721382704613384L;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\rainbow\GF2Field.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */