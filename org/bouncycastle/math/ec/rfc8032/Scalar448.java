package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat448;

abstract class Scalar448 {
  static final int SIZE = 14;
  
  private static final int SCALAR_BYTES = 57;
  
  private static final long M26L = 67108863L;
  
  private static final long M28L = 268435455L;
  
  private static final long M32L = 4294967295L;
  
  private static final int TARGET_LENGTH = 447;
  
  private static final int[] L = new int[] { 
      -1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, 
      -1, -1, -1, 1073741823 };
  
  private static final int[] LSq = new int[] { 
      463601321, -1045562440, 1239460018, -1189350089, -412821483, 1160071467, -1564970643, 1256291574, -1170454588, -240530412, 
      2118977290, -1845154869, -1618855054, -1019204973, 1437344377, -1849925303, 1189267370, 280387897, -680846520, -500732508, 
      -1100672524, -1, -1, -1, -1, -1, -1, 268435455 };
  
  private static final int L_0 = 78101261;
  
  private static final int L_1 = 141809365;
  
  private static final int L_2 = 175155932;
  
  private static final int L_3 = 64542499;
  
  private static final int L_4 = 158326419;
  
  private static final int L_5 = 191173276;
  
  private static final int L_6 = 104575268;
  
  private static final int L_7 = 137584065;
  
  private static final int L4_0 = 43969588;
  
  private static final int L4_1 = 30366549;
  
  private static final int L4_2 = 163752818;
  
  private static final int L4_3 = 258169998;
  
  private static final int L4_4 = 96434764;
  
  private static final int L4_5 = 227822194;
  
  private static final int L4_6 = 149865618;
  
  private static final int L4_7 = 550336261;
  
  static boolean checkVar(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    if (paramArrayOfbyte[56] != 0)
      return false; 
    decode(paramArrayOfbyte, paramArrayOfint);
    return !Nat.gte(14, paramArrayOfint, L);
  }
  
  static void decode(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    Codec.decode32(paramArrayOfbyte, 0, paramArrayOfint, 0, 14);
  }
  
  static void getOrderWnafVar(int paramInt, byte[] paramArrayOfbyte) {
    Wnaf.getSignedVar(L, paramInt, paramArrayOfbyte);
  }
  
  static void multiply225Var(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int[] arrayOfInt = new int[22];
    Nat.mul(paramArrayOfint2, 0, 8, paramArrayOfint1, 0, 14, arrayOfInt, 0);
    if (paramArrayOfint2[7] < 0) {
      Nat.addTo(14, L, 0, arrayOfInt, 8);
      Nat.subFrom(14, paramArrayOfint1, 0, arrayOfInt, 8);
    } 
    byte[] arrayOfByte1 = new byte[88];
    Codec.encode32(arrayOfInt, 0, 22, arrayOfByte1, 0);
    byte[] arrayOfByte2 = reduce704(arrayOfByte1);
    decode(arrayOfByte2, paramArrayOfint3);
  }
  
  static byte[] reduce704(byte[] paramArrayOfbyte) {
    long l1 = Codec.decode32(paramArrayOfbyte, 0) & 0xFFFFFFFFL;
    long l2 = (Codec.decode24(paramArrayOfbyte, 4) << 4) & 0xFFFFFFFFL;
    long l3 = Codec.decode32(paramArrayOfbyte, 7) & 0xFFFFFFFFL;
    long l4 = (Codec.decode24(paramArrayOfbyte, 11) << 4) & 0xFFFFFFFFL;
    long l5 = Codec.decode32(paramArrayOfbyte, 14) & 0xFFFFFFFFL;
    long l6 = (Codec.decode24(paramArrayOfbyte, 18) << 4) & 0xFFFFFFFFL;
    long l7 = Codec.decode32(paramArrayOfbyte, 21) & 0xFFFFFFFFL;
    long l8 = (Codec.decode24(paramArrayOfbyte, 25) << 4) & 0xFFFFFFFFL;
    long l9 = Codec.decode32(paramArrayOfbyte, 28) & 0xFFFFFFFFL;
    long l10 = (Codec.decode24(paramArrayOfbyte, 32) << 4) & 0xFFFFFFFFL;
    long l11 = Codec.decode32(paramArrayOfbyte, 35) & 0xFFFFFFFFL;
    long l12 = (Codec.decode24(paramArrayOfbyte, 39) << 4) & 0xFFFFFFFFL;
    long l13 = Codec.decode32(paramArrayOfbyte, 42) & 0xFFFFFFFFL;
    long l14 = (Codec.decode24(paramArrayOfbyte, 46) << 4) & 0xFFFFFFFFL;
    long l15 = Codec.decode32(paramArrayOfbyte, 49) & 0xFFFFFFFFL;
    long l16 = (Codec.decode24(paramArrayOfbyte, 53) << 4) & 0xFFFFFFFFL;
    long l17 = Codec.decode32(paramArrayOfbyte, 56) & 0xFFFFFFFFL;
    long l18 = (Codec.decode24(paramArrayOfbyte, 60) << 4) & 0xFFFFFFFFL;
    long l19 = Codec.decode32(paramArrayOfbyte, 63) & 0xFFFFFFFFL;
    long l20 = (Codec.decode24(paramArrayOfbyte, 67) << 4) & 0xFFFFFFFFL;
    long l21 = Codec.decode32(paramArrayOfbyte, 70) & 0xFFFFFFFFL;
    long l22 = (Codec.decode24(paramArrayOfbyte, 74) << 4) & 0xFFFFFFFFL;
    long l23 = Codec.decode32(paramArrayOfbyte, 77) & 0xFFFFFFFFL;
    long l24 = (Codec.decode24(paramArrayOfbyte, 81) << 4) & 0xFFFFFFFFL;
    long l25 = Codec.decode32(paramArrayOfbyte, 84) & 0xFFFFFFFFL;
    long l26 = 0L;
    l26 += l25 >>> 28L;
    l25 &= 0xFFFFFFFL;
    l10 += l26 * 43969588L;
    l11 += l26 * 30366549L;
    l12 += l26 * 163752818L;
    l13 += l26 * 258169998L;
    l14 += l26 * 96434764L;
    l15 += l26 * 227822194L;
    l16 += l26 * 149865618L;
    l17 += l26 * 550336261L;
    l22 += l21 >>> 28L;
    l21 &= 0xFFFFFFFL;
    l23 += l22 >>> 28L;
    l22 &= 0xFFFFFFFL;
    l24 += l23 >>> 28L;
    l23 &= 0xFFFFFFFL;
    l25 += l24 >>> 28L;
    l24 &= 0xFFFFFFFL;
    l9 += l25 * 43969588L;
    l10 += l25 * 30366549L;
    l11 += l25 * 163752818L;
    l12 += l25 * 258169998L;
    l13 += l25 * 96434764L;
    l14 += l25 * 227822194L;
    l15 += l25 * 149865618L;
    l16 += l25 * 550336261L;
    l8 += l24 * 43969588L;
    l9 += l24 * 30366549L;
    l10 += l24 * 163752818L;
    l11 += l24 * 258169998L;
    l12 += l24 * 96434764L;
    l13 += l24 * 227822194L;
    l14 += l24 * 149865618L;
    l15 += l24 * 550336261L;
    l7 += l23 * 43969588L;
    l8 += l23 * 30366549L;
    l9 += l23 * 163752818L;
    l10 += l23 * 258169998L;
    l11 += l23 * 96434764L;
    l12 += l23 * 227822194L;
    l13 += l23 * 149865618L;
    l14 += l23 * 550336261L;
    l19 += l18 >>> 28L;
    l18 &= 0xFFFFFFFL;
    l20 += l19 >>> 28L;
    l19 &= 0xFFFFFFFL;
    l21 += l20 >>> 28L;
    l20 &= 0xFFFFFFFL;
    l22 += l21 >>> 28L;
    l21 &= 0xFFFFFFFL;
    l6 += l22 * 43969588L;
    l7 += l22 * 30366549L;
    l8 += l22 * 163752818L;
    l9 += l22 * 258169998L;
    l10 += l22 * 96434764L;
    l11 += l22 * 227822194L;
    l12 += l22 * 149865618L;
    l13 += l22 * 550336261L;
    l5 += l21 * 43969588L;
    l6 += l21 * 30366549L;
    l7 += l21 * 163752818L;
    l8 += l21 * 258169998L;
    l9 += l21 * 96434764L;
    l10 += l21 * 227822194L;
    l11 += l21 * 149865618L;
    l12 += l21 * 550336261L;
    l4 += l20 * 43969588L;
    l5 += l20 * 30366549L;
    l6 += l20 * 163752818L;
    l7 += l20 * 258169998L;
    l8 += l20 * 96434764L;
    l9 += l20 * 227822194L;
    l10 += l20 * 149865618L;
    l11 += l20 * 550336261L;
    l16 += l15 >>> 28L;
    l15 &= 0xFFFFFFFL;
    l17 += l16 >>> 28L;
    l16 &= 0xFFFFFFFL;
    l18 += l17 >>> 28L;
    l17 &= 0xFFFFFFFL;
    l19 += l18 >>> 28L;
    l18 &= 0xFFFFFFFL;
    l3 += l19 * 43969588L;
    l4 += l19 * 30366549L;
    l5 += l19 * 163752818L;
    l6 += l19 * 258169998L;
    l7 += l19 * 96434764L;
    l8 += l19 * 227822194L;
    l9 += l19 * 149865618L;
    l10 += l19 * 550336261L;
    l2 += l18 * 43969588L;
    l3 += l18 * 30366549L;
    l4 += l18 * 163752818L;
    l5 += l18 * 258169998L;
    l6 += l18 * 96434764L;
    l7 += l18 * 227822194L;
    l8 += l18 * 149865618L;
    l9 += l18 * 550336261L;
    l17 *= 4L;
    l17 += l16 >>> 26L;
    l16 &= 0x3FFFFFFL;
    l17++;
    l1 += l17 * 78101261L;
    l2 += l17 * 141809365L;
    l3 += l17 * 175155932L;
    l4 += l17 * 64542499L;
    l5 += l17 * 158326419L;
    l6 += l17 * 191173276L;
    l7 += l17 * 104575268L;
    l8 += l17 * 137584065L;
    l2 += l1 >>> 28L;
    l1 &= 0xFFFFFFFL;
    l3 += l2 >>> 28L;
    l2 &= 0xFFFFFFFL;
    l4 += l3 >>> 28L;
    l3 &= 0xFFFFFFFL;
    l5 += l4 >>> 28L;
    l4 &= 0xFFFFFFFL;
    l6 += l5 >>> 28L;
    l5 &= 0xFFFFFFFL;
    l7 += l6 >>> 28L;
    l6 &= 0xFFFFFFFL;
    l8 += l7 >>> 28L;
    l7 &= 0xFFFFFFFL;
    l9 += l8 >>> 28L;
    l8 &= 0xFFFFFFFL;
    l10 += l9 >>> 28L;
    l9 &= 0xFFFFFFFL;
    l11 += l10 >>> 28L;
    l10 &= 0xFFFFFFFL;
    l12 += l11 >>> 28L;
    l11 &= 0xFFFFFFFL;
    l13 += l12 >>> 28L;
    l12 &= 0xFFFFFFFL;
    l14 += l13 >>> 28L;
    l13 &= 0xFFFFFFFL;
    l15 += l14 >>> 28L;
    l14 &= 0xFFFFFFFL;
    l16 += l15 >>> 28L;
    l15 &= 0xFFFFFFFL;
    l17 = l16 >>> 26L;
    l16 &= 0x3FFFFFFL;
    l17--;
    l1 -= l17 & 0x4A7BB0DL;
    l2 -= l17 & 0x873D6D5L;
    l3 -= l17 & 0xA70AADCL;
    l4 -= l17 & 0x3D8D723L;
    l5 -= l17 & 0x96FDE93L;
    l6 -= l17 & 0xB65129CL;
    l7 -= l17 & 0x63BB124L;
    l8 -= l17 & 0x8335DC1L;
    l2 += l1 >> 28L;
    l1 &= 0xFFFFFFFL;
    l3 += l2 >> 28L;
    l2 &= 0xFFFFFFFL;
    l4 += l3 >> 28L;
    l3 &= 0xFFFFFFFL;
    l5 += l4 >> 28L;
    l4 &= 0xFFFFFFFL;
    l6 += l5 >> 28L;
    l5 &= 0xFFFFFFFL;
    l7 += l6 >> 28L;
    l6 &= 0xFFFFFFFL;
    l8 += l7 >> 28L;
    l7 &= 0xFFFFFFFL;
    l9 += l8 >> 28L;
    l8 &= 0xFFFFFFFL;
    l10 += l9 >> 28L;
    l9 &= 0xFFFFFFFL;
    l11 += l10 >> 28L;
    l10 &= 0xFFFFFFFL;
    l12 += l11 >> 28L;
    l11 &= 0xFFFFFFFL;
    l13 += l12 >> 28L;
    l12 &= 0xFFFFFFFL;
    l14 += l13 >> 28L;
    l13 &= 0xFFFFFFFL;
    l15 += l14 >> 28L;
    l14 &= 0xFFFFFFFL;
    l16 += l15 >> 28L;
    l15 &= 0xFFFFFFFL;
    byte[] arrayOfByte = new byte[57];
    Codec.encode56(l1 | l2 << 28L, arrayOfByte, 0);
    Codec.encode56(l3 | l4 << 28L, arrayOfByte, 7);
    Codec.encode56(l5 | l6 << 28L, arrayOfByte, 14);
    Codec.encode56(l7 | l8 << 28L, arrayOfByte, 21);
    Codec.encode56(l9 | l10 << 28L, arrayOfByte, 28);
    Codec.encode56(l11 | l12 << 28L, arrayOfByte, 35);
    Codec.encode56(l13 | l14 << 28L, arrayOfByte, 42);
    Codec.encode56(l15 | l16 << 28L, arrayOfByte, 49);
    return arrayOfByte;
  }
  
  static byte[] reduce912(byte[] paramArrayOfbyte) {
    long l1 = Codec.decode32(paramArrayOfbyte, 0) & 0xFFFFFFFFL;
    long l2 = (Codec.decode24(paramArrayOfbyte, 4) << 4) & 0xFFFFFFFFL;
    long l3 = Codec.decode32(paramArrayOfbyte, 7) & 0xFFFFFFFFL;
    long l4 = (Codec.decode24(paramArrayOfbyte, 11) << 4) & 0xFFFFFFFFL;
    long l5 = Codec.decode32(paramArrayOfbyte, 14) & 0xFFFFFFFFL;
    long l6 = (Codec.decode24(paramArrayOfbyte, 18) << 4) & 0xFFFFFFFFL;
    long l7 = Codec.decode32(paramArrayOfbyte, 21) & 0xFFFFFFFFL;
    long l8 = (Codec.decode24(paramArrayOfbyte, 25) << 4) & 0xFFFFFFFFL;
    long l9 = Codec.decode32(paramArrayOfbyte, 28) & 0xFFFFFFFFL;
    long l10 = (Codec.decode24(paramArrayOfbyte, 32) << 4) & 0xFFFFFFFFL;
    long l11 = Codec.decode32(paramArrayOfbyte, 35) & 0xFFFFFFFFL;
    long l12 = (Codec.decode24(paramArrayOfbyte, 39) << 4) & 0xFFFFFFFFL;
    long l13 = Codec.decode32(paramArrayOfbyte, 42) & 0xFFFFFFFFL;
    long l14 = (Codec.decode24(paramArrayOfbyte, 46) << 4) & 0xFFFFFFFFL;
    long l15 = Codec.decode32(paramArrayOfbyte, 49) & 0xFFFFFFFFL;
    long l16 = (Codec.decode24(paramArrayOfbyte, 53) << 4) & 0xFFFFFFFFL;
    long l17 = Codec.decode32(paramArrayOfbyte, 56) & 0xFFFFFFFFL;
    long l18 = (Codec.decode24(paramArrayOfbyte, 60) << 4) & 0xFFFFFFFFL;
    long l19 = Codec.decode32(paramArrayOfbyte, 63) & 0xFFFFFFFFL;
    long l20 = (Codec.decode24(paramArrayOfbyte, 67) << 4) & 0xFFFFFFFFL;
    long l21 = Codec.decode32(paramArrayOfbyte, 70) & 0xFFFFFFFFL;
    long l22 = (Codec.decode24(paramArrayOfbyte, 74) << 4) & 0xFFFFFFFFL;
    long l23 = Codec.decode32(paramArrayOfbyte, 77) & 0xFFFFFFFFL;
    long l24 = (Codec.decode24(paramArrayOfbyte, 81) << 4) & 0xFFFFFFFFL;
    long l25 = Codec.decode32(paramArrayOfbyte, 84) & 0xFFFFFFFFL;
    long l26 = (Codec.decode24(paramArrayOfbyte, 88) << 4) & 0xFFFFFFFFL;
    long l27 = Codec.decode32(paramArrayOfbyte, 91) & 0xFFFFFFFFL;
    long l28 = (Codec.decode24(paramArrayOfbyte, 95) << 4) & 0xFFFFFFFFL;
    long l29 = Codec.decode32(paramArrayOfbyte, 98) & 0xFFFFFFFFL;
    long l30 = (Codec.decode24(paramArrayOfbyte, 102) << 4) & 0xFFFFFFFFL;
    long l31 = Codec.decode32(paramArrayOfbyte, 105) & 0xFFFFFFFFL;
    long l32 = (Codec.decode24(paramArrayOfbyte, 109) << 4) & 0xFFFFFFFFL;
    long l33 = Codec.decode16(paramArrayOfbyte, 112) & 0xFFFFFFFFL;
    l17 += l33 * 43969588L;
    l18 += l33 * 30366549L;
    l19 += l33 * 163752818L;
    l20 += l33 * 258169998L;
    l21 += l33 * 96434764L;
    l22 += l33 * 227822194L;
    l23 += l33 * 149865618L;
    l24 += l33 * 550336261L;
    l32 += l31 >>> 28L;
    l31 &= 0xFFFFFFFL;
    l16 += l32 * 43969588L;
    l17 += l32 * 30366549L;
    l18 += l32 * 163752818L;
    l19 += l32 * 258169998L;
    l20 += l32 * 96434764L;
    l21 += l32 * 227822194L;
    l22 += l32 * 149865618L;
    l23 += l32 * 550336261L;
    l15 += l31 * 43969588L;
    l16 += l31 * 30366549L;
    l17 += l31 * 163752818L;
    l18 += l31 * 258169998L;
    l19 += l31 * 96434764L;
    l20 += l31 * 227822194L;
    l21 += l31 * 149865618L;
    l22 += l31 * 550336261L;
    l30 += l29 >>> 28L;
    l29 &= 0xFFFFFFFL;
    l14 += l30 * 43969588L;
    l15 += l30 * 30366549L;
    l16 += l30 * 163752818L;
    l17 += l30 * 258169998L;
    l18 += l30 * 96434764L;
    l19 += l30 * 227822194L;
    l20 += l30 * 149865618L;
    l21 += l30 * 550336261L;
    l13 += l29 * 43969588L;
    l14 += l29 * 30366549L;
    l15 += l29 * 163752818L;
    l16 += l29 * 258169998L;
    l17 += l29 * 96434764L;
    l18 += l29 * 227822194L;
    l19 += l29 * 149865618L;
    l20 += l29 * 550336261L;
    l28 += l27 >>> 28L;
    l27 &= 0xFFFFFFFL;
    l12 += l28 * 43969588L;
    l13 += l28 * 30366549L;
    l14 += l28 * 163752818L;
    l15 += l28 * 258169998L;
    l16 += l28 * 96434764L;
    l17 += l28 * 227822194L;
    l18 += l28 * 149865618L;
    l19 += l28 * 550336261L;
    l11 += l27 * 43969588L;
    l12 += l27 * 30366549L;
    l13 += l27 * 163752818L;
    l14 += l27 * 258169998L;
    l15 += l27 * 96434764L;
    l16 += l27 * 227822194L;
    l17 += l27 * 149865618L;
    l18 += l27 * 550336261L;
    l26 += l25 >>> 28L;
    l25 &= 0xFFFFFFFL;
    l10 += l26 * 43969588L;
    l11 += l26 * 30366549L;
    l12 += l26 * 163752818L;
    l13 += l26 * 258169998L;
    l14 += l26 * 96434764L;
    l15 += l26 * 227822194L;
    l16 += l26 * 149865618L;
    l17 += l26 * 550336261L;
    l22 += l21 >>> 28L;
    l21 &= 0xFFFFFFFL;
    l23 += l22 >>> 28L;
    l22 &= 0xFFFFFFFL;
    l24 += l23 >>> 28L;
    l23 &= 0xFFFFFFFL;
    l25 += l24 >>> 28L;
    l24 &= 0xFFFFFFFL;
    l9 += l25 * 43969588L;
    l10 += l25 * 30366549L;
    l11 += l25 * 163752818L;
    l12 += l25 * 258169998L;
    l13 += l25 * 96434764L;
    l14 += l25 * 227822194L;
    l15 += l25 * 149865618L;
    l16 += l25 * 550336261L;
    l8 += l24 * 43969588L;
    l9 += l24 * 30366549L;
    l10 += l24 * 163752818L;
    l11 += l24 * 258169998L;
    l12 += l24 * 96434764L;
    l13 += l24 * 227822194L;
    l14 += l24 * 149865618L;
    l15 += l24 * 550336261L;
    l7 += l23 * 43969588L;
    l8 += l23 * 30366549L;
    l9 += l23 * 163752818L;
    l10 += l23 * 258169998L;
    l11 += l23 * 96434764L;
    l12 += l23 * 227822194L;
    l13 += l23 * 149865618L;
    l14 += l23 * 550336261L;
    l19 += l18 >>> 28L;
    l18 &= 0xFFFFFFFL;
    l20 += l19 >>> 28L;
    l19 &= 0xFFFFFFFL;
    l21 += l20 >>> 28L;
    l20 &= 0xFFFFFFFL;
    l22 += l21 >>> 28L;
    l21 &= 0xFFFFFFFL;
    l6 += l22 * 43969588L;
    l7 += l22 * 30366549L;
    l8 += l22 * 163752818L;
    l9 += l22 * 258169998L;
    l10 += l22 * 96434764L;
    l11 += l22 * 227822194L;
    l12 += l22 * 149865618L;
    l13 += l22 * 550336261L;
    l5 += l21 * 43969588L;
    l6 += l21 * 30366549L;
    l7 += l21 * 163752818L;
    l8 += l21 * 258169998L;
    l9 += l21 * 96434764L;
    l10 += l21 * 227822194L;
    l11 += l21 * 149865618L;
    l12 += l21 * 550336261L;
    l4 += l20 * 43969588L;
    l5 += l20 * 30366549L;
    l6 += l20 * 163752818L;
    l7 += l20 * 258169998L;
    l8 += l20 * 96434764L;
    l9 += l20 * 227822194L;
    l10 += l20 * 149865618L;
    l11 += l20 * 550336261L;
    l16 += l15 >>> 28L;
    l15 &= 0xFFFFFFFL;
    l17 += l16 >>> 28L;
    l16 &= 0xFFFFFFFL;
    l18 += l17 >>> 28L;
    l17 &= 0xFFFFFFFL;
    l19 += l18 >>> 28L;
    l18 &= 0xFFFFFFFL;
    l3 += l19 * 43969588L;
    l4 += l19 * 30366549L;
    l5 += l19 * 163752818L;
    l6 += l19 * 258169998L;
    l7 += l19 * 96434764L;
    l8 += l19 * 227822194L;
    l9 += l19 * 149865618L;
    l10 += l19 * 550336261L;
    l2 += l18 * 43969588L;
    l3 += l18 * 30366549L;
    l4 += l18 * 163752818L;
    l5 += l18 * 258169998L;
    l6 += l18 * 96434764L;
    l7 += l18 * 227822194L;
    l8 += l18 * 149865618L;
    l9 += l18 * 550336261L;
    l17 *= 4L;
    l17 += l16 >>> 26L;
    l16 &= 0x3FFFFFFL;
    l17++;
    l1 += l17 * 78101261L;
    l2 += l17 * 141809365L;
    l3 += l17 * 175155932L;
    l4 += l17 * 64542499L;
    l5 += l17 * 158326419L;
    l6 += l17 * 191173276L;
    l7 += l17 * 104575268L;
    l8 += l17 * 137584065L;
    l2 += l1 >>> 28L;
    l1 &= 0xFFFFFFFL;
    l3 += l2 >>> 28L;
    l2 &= 0xFFFFFFFL;
    l4 += l3 >>> 28L;
    l3 &= 0xFFFFFFFL;
    l5 += l4 >>> 28L;
    l4 &= 0xFFFFFFFL;
    l6 += l5 >>> 28L;
    l5 &= 0xFFFFFFFL;
    l7 += l6 >>> 28L;
    l6 &= 0xFFFFFFFL;
    l8 += l7 >>> 28L;
    l7 &= 0xFFFFFFFL;
    l9 += l8 >>> 28L;
    l8 &= 0xFFFFFFFL;
    l10 += l9 >>> 28L;
    l9 &= 0xFFFFFFFL;
    l11 += l10 >>> 28L;
    l10 &= 0xFFFFFFFL;
    l12 += l11 >>> 28L;
    l11 &= 0xFFFFFFFL;
    l13 += l12 >>> 28L;
    l12 &= 0xFFFFFFFL;
    l14 += l13 >>> 28L;
    l13 &= 0xFFFFFFFL;
    l15 += l14 >>> 28L;
    l14 &= 0xFFFFFFFL;
    l16 += l15 >>> 28L;
    l15 &= 0xFFFFFFFL;
    l17 = l16 >>> 26L;
    l16 &= 0x3FFFFFFL;
    l17--;
    l1 -= l17 & 0x4A7BB0DL;
    l2 -= l17 & 0x873D6D5L;
    l3 -= l17 & 0xA70AADCL;
    l4 -= l17 & 0x3D8D723L;
    l5 -= l17 & 0x96FDE93L;
    l6 -= l17 & 0xB65129CL;
    l7 -= l17 & 0x63BB124L;
    l8 -= l17 & 0x8335DC1L;
    l2 += l1 >> 28L;
    l1 &= 0xFFFFFFFL;
    l3 += l2 >> 28L;
    l2 &= 0xFFFFFFFL;
    l4 += l3 >> 28L;
    l3 &= 0xFFFFFFFL;
    l5 += l4 >> 28L;
    l4 &= 0xFFFFFFFL;
    l6 += l5 >> 28L;
    l5 &= 0xFFFFFFFL;
    l7 += l6 >> 28L;
    l6 &= 0xFFFFFFFL;
    l8 += l7 >> 28L;
    l7 &= 0xFFFFFFFL;
    l9 += l8 >> 28L;
    l8 &= 0xFFFFFFFL;
    l10 += l9 >> 28L;
    l9 &= 0xFFFFFFFL;
    l11 += l10 >> 28L;
    l10 &= 0xFFFFFFFL;
    l12 += l11 >> 28L;
    l11 &= 0xFFFFFFFL;
    l13 += l12 >> 28L;
    l12 &= 0xFFFFFFFL;
    l14 += l13 >> 28L;
    l13 &= 0xFFFFFFFL;
    l15 += l14 >> 28L;
    l14 &= 0xFFFFFFFL;
    l16 += l15 >> 28L;
    l15 &= 0xFFFFFFFL;
    byte[] arrayOfByte = new byte[57];
    Codec.encode56(l1 | l2 << 28L, arrayOfByte, 0);
    Codec.encode56(l3 | l4 << 28L, arrayOfByte, 7);
    Codec.encode56(l5 | l6 << 28L, arrayOfByte, 14);
    Codec.encode56(l7 | l8 << 28L, arrayOfByte, 21);
    Codec.encode56(l9 | l10 << 28L, arrayOfByte, 28);
    Codec.encode56(l11 | l12 << 28L, arrayOfByte, 35);
    Codec.encode56(l13 | l14 << 28L, arrayOfByte, 42);
    Codec.encode56(l15 | l16 << 28L, arrayOfByte, 49);
    return arrayOfByte;
  }
  
  static boolean reduceBasisVar(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int[] arrayOfInt1 = new int[28];
    System.arraycopy(LSq, 0, arrayOfInt1, 0, 28);
    int[] arrayOfInt2 = new int[28];
    Nat448.square(paramArrayOfint1, arrayOfInt2);
    arrayOfInt2[0] = arrayOfInt2[0] + 1;
    int[] arrayOfInt3 = new int[28];
    Nat448.mul(L, paramArrayOfint1, arrayOfInt3);
    int[] arrayOfInt4 = new int[28];
    int[] arrayOfInt5 = new int[8];
    System.arraycopy(L, 0, arrayOfInt5, 0, 8);
    int[] arrayOfInt6 = new int[8];
    int[] arrayOfInt7 = new int[8];
    System.arraycopy(paramArrayOfint1, 0, arrayOfInt7, 0, 8);
    int[] arrayOfInt8 = new int[8];
    arrayOfInt8[0] = 1;
    char c = 'ۼ';
    int i = 27;
    int j = ScalarUtil.getBitLengthPositive(i, arrayOfInt2);
    while (j > 447) {
      if (--c < '\000')
        return false; 
      int k = ScalarUtil.getBitLength(i, arrayOfInt3);
      int m = k - j;
      m &= m >> 31 ^ 0xFFFFFFFF;
      if (arrayOfInt3[i] < 0) {
        ScalarUtil.addShifted_NP(i, m, arrayOfInt1, arrayOfInt2, arrayOfInt3, arrayOfInt4);
        ScalarUtil.addShifted_UV(7, m, arrayOfInt5, arrayOfInt6, arrayOfInt7, arrayOfInt8);
      } else {
        ScalarUtil.subShifted_NP(i, m, arrayOfInt1, arrayOfInt2, arrayOfInt3, arrayOfInt4);
        ScalarUtil.subShifted_UV(7, m, arrayOfInt5, arrayOfInt6, arrayOfInt7, arrayOfInt8);
      } 
      if (ScalarUtil.lessThan(i, arrayOfInt1, arrayOfInt2)) {
        int[] arrayOfInt9 = arrayOfInt5;
        arrayOfInt5 = arrayOfInt7;
        arrayOfInt7 = arrayOfInt9;
        int[] arrayOfInt10 = arrayOfInt6;
        arrayOfInt6 = arrayOfInt8;
        arrayOfInt8 = arrayOfInt10;
        int[] arrayOfInt11 = arrayOfInt1;
        arrayOfInt1 = arrayOfInt2;
        arrayOfInt2 = arrayOfInt11;
        i = j >>> 5;
        j = ScalarUtil.getBitLengthPositive(i, arrayOfInt2);
      } 
    } 
    System.arraycopy(arrayOfInt7, 0, paramArrayOfint2, 0, 8);
    System.arraycopy(arrayOfInt8, 0, paramArrayOfint3, 0, 8);
    return true;
  }
  
  static void toSignedDigits(int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    paramArrayOfint2[14] = (1 << paramInt - 448) + Nat.cadd(14, (paramArrayOfint1[0] ^ 0xFFFFFFFF) & 0x1, paramArrayOfint1, L, paramArrayOfint2);
    Nat.shiftDownBit(15, paramArrayOfint2, 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\rfc8032\Scalar448.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */