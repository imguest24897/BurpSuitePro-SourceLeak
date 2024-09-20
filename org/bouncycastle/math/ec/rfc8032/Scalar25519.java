package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

abstract class Scalar25519 {
  static final int SIZE = 8;
  
  private static final int SCALAR_BYTES = 32;
  
  private static final long M08L = 255L;
  
  private static final long M28L = 268435455L;
  
  private static final long M32L = 4294967295L;
  
  private static final int TARGET_LENGTH = 254;
  
  private static final int[] L = new int[] { 1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456 };
  
  private static final int[] LSq = new int[] { 
      -1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, 
      -731974758, 43769659, 0, 0, 0, 16777216 };
  
  private static final int L0 = -50998291;
  
  private static final int L1 = 19280294;
  
  private static final int L2 = 127719000;
  
  private static final int L3 = -6428113;
  
  private static final int L4 = 5343;
  
  static boolean checkVar(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    decode(paramArrayOfbyte, paramArrayOfint);
    return !Nat256.gte(paramArrayOfint, L);
  }
  
  static void decode(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    Codec.decode32(paramArrayOfbyte, 0, paramArrayOfint, 0, 8);
  }
  
  static void getOrderWnafVar(int paramInt, byte[] paramArrayOfbyte) {
    Wnaf.getSignedVar(L, paramInt, paramArrayOfbyte);
  }
  
  static void multiply128Var(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int[] arrayOfInt = new int[12];
    Nat256.mul128(paramArrayOfint1, paramArrayOfint2, arrayOfInt);
    if (paramArrayOfint2[3] < 0) {
      Nat256.addTo(L, 0, arrayOfInt, 4, 0);
      Nat256.subFrom(paramArrayOfint1, 0, arrayOfInt, 4, 0);
    } 
    byte[] arrayOfByte1 = new byte[48];
    Codec.encode32(arrayOfInt, 0, 12, arrayOfByte1, 0);
    byte[] arrayOfByte2 = reduce384(arrayOfByte1);
    decode(arrayOfByte2, paramArrayOfint3);
  }
  
  static byte[] reduce384(byte[] paramArrayOfbyte) {
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
    long l14 = (Codec.decode16(paramArrayOfbyte, 46) << 4) & 0xFFFFFFFFL;
    l14 += l13 >> 28L;
    l13 &= 0xFFFFFFFL;
    l5 -= l14 * -50998291L;
    l6 -= l14 * 19280294L;
    l7 -= l14 * 127719000L;
    l8 -= l14 * -6428113L;
    l9 -= l14 * 5343L;
    l13 += l12 >> 28L;
    l12 &= 0xFFFFFFFL;
    l4 -= l13 * -50998291L;
    l5 -= l13 * 19280294L;
    l6 -= l13 * 127719000L;
    l7 -= l13 * -6428113L;
    l8 -= l13 * 5343L;
    l12 += l11 >> 28L;
    l11 &= 0xFFFFFFFL;
    l3 -= l12 * -50998291L;
    l4 -= l12 * 19280294L;
    l5 -= l12 * 127719000L;
    l6 -= l12 * -6428113L;
    l7 -= l12 * 5343L;
    l11 += l10 >> 28L;
    l10 &= 0xFFFFFFFL;
    l2 -= l11 * -50998291L;
    l3 -= l11 * 19280294L;
    l4 -= l11 * 127719000L;
    l5 -= l11 * -6428113L;
    l6 -= l11 * 5343L;
    l9 += l8 >> 28L;
    l8 &= 0xFFFFFFFL;
    l10 += l9 >> 28L;
    l9 &= 0xFFFFFFFL;
    long l15 = l9 >>> 27L;
    l10 += l15;
    l1 -= l10 * -50998291L;
    l2 -= l10 * 19280294L;
    l3 -= l10 * 127719000L;
    l4 -= l10 * -6428113L;
    l5 -= l10 * 5343L;
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
    l10 = l9 >> 28L;
    l9 &= 0xFFFFFFFL;
    l10 -= l15;
    l1 += l10 & 0xFFFFFFFFFCF5D3EDL;
    l2 += l10 & 0x12631A6L;
    l3 += l10 & 0x79CD658L;
    l4 += l10 & 0xFFFFFFFFFF9DEA2FL;
    l5 += l10 & 0x14DFL;
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
    byte[] arrayOfByte = new byte[64];
    Codec.encode56(l1 | l2 << 28L, arrayOfByte, 0);
    Codec.encode56(l3 | l4 << 28L, arrayOfByte, 7);
    Codec.encode56(l5 | l6 << 28L, arrayOfByte, 14);
    Codec.encode56(l7 | l8 << 28L, arrayOfByte, 21);
    Codec.encode32((int)l9, arrayOfByte, 28);
    return arrayOfByte;
  }
  
  static byte[] reduce512(byte[] paramArrayOfbyte) {
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
    long l19 = paramArrayOfbyte[63] & 0xFFL;
    l10 -= l19 * -50998291L;
    l11 -= l19 * 19280294L;
    l12 -= l19 * 127719000L;
    l13 -= l19 * -6428113L;
    l14 -= l19 * 5343L;
    l18 += l17 >> 28L;
    l17 &= 0xFFFFFFFL;
    l9 -= l18 * -50998291L;
    l10 -= l18 * 19280294L;
    l11 -= l18 * 127719000L;
    l12 -= l18 * -6428113L;
    l13 -= l18 * 5343L;
    l8 -= l17 * -50998291L;
    l9 -= l17 * 19280294L;
    l10 -= l17 * 127719000L;
    l11 -= l17 * -6428113L;
    l12 -= l17 * 5343L;
    l16 += l15 >> 28L;
    l15 &= 0xFFFFFFFL;
    l7 -= l16 * -50998291L;
    l8 -= l16 * 19280294L;
    l9 -= l16 * 127719000L;
    l10 -= l16 * -6428113L;
    l11 -= l16 * 5343L;
    l6 -= l15 * -50998291L;
    l7 -= l15 * 19280294L;
    l8 -= l15 * 127719000L;
    l9 -= l15 * -6428113L;
    l10 -= l15 * 5343L;
    l14 += l13 >> 28L;
    l13 &= 0xFFFFFFFL;
    l5 -= l14 * -50998291L;
    l6 -= l14 * 19280294L;
    l7 -= l14 * 127719000L;
    l8 -= l14 * -6428113L;
    l9 -= l14 * 5343L;
    l13 += l12 >> 28L;
    l12 &= 0xFFFFFFFL;
    l4 -= l13 * -50998291L;
    l5 -= l13 * 19280294L;
    l6 -= l13 * 127719000L;
    l7 -= l13 * -6428113L;
    l8 -= l13 * 5343L;
    l12 += l11 >> 28L;
    l11 &= 0xFFFFFFFL;
    l3 -= l12 * -50998291L;
    l4 -= l12 * 19280294L;
    l5 -= l12 * 127719000L;
    l6 -= l12 * -6428113L;
    l7 -= l12 * 5343L;
    l11 += l10 >> 28L;
    l10 &= 0xFFFFFFFL;
    l2 -= l11 * -50998291L;
    l3 -= l11 * 19280294L;
    l4 -= l11 * 127719000L;
    l5 -= l11 * -6428113L;
    l6 -= l11 * 5343L;
    l9 += l8 >> 28L;
    l8 &= 0xFFFFFFFL;
    l10 += l9 >> 28L;
    l9 &= 0xFFFFFFFL;
    long l20 = l9 >>> 27L;
    l10 += l20;
    l1 -= l10 * -50998291L;
    l2 -= l10 * 19280294L;
    l3 -= l10 * 127719000L;
    l4 -= l10 * -6428113L;
    l5 -= l10 * 5343L;
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
    l10 = l9 >> 28L;
    l9 &= 0xFFFFFFFL;
    l10 -= l20;
    l1 += l10 & 0xFFFFFFFFFCF5D3EDL;
    l2 += l10 & 0x12631A6L;
    l3 += l10 & 0x79CD658L;
    l4 += l10 & 0xFFFFFFFFFF9DEA2FL;
    l5 += l10 & 0x14DFL;
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
    byte[] arrayOfByte = new byte[32];
    Codec.encode56(l1 | l2 << 28L, arrayOfByte, 0);
    Codec.encode56(l3 | l4 << 28L, arrayOfByte, 7);
    Codec.encode56(l5 | l6 << 28L, arrayOfByte, 14);
    Codec.encode56(l7 | l8 << 28L, arrayOfByte, 21);
    Codec.encode32((int)l9, arrayOfByte, 28);
    return arrayOfByte;
  }
  
  static boolean reduceBasisVar(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int[] arrayOfInt1 = new int[16];
    System.arraycopy(LSq, 0, arrayOfInt1, 0, 16);
    int[] arrayOfInt2 = new int[16];
    Nat256.square(paramArrayOfint1, arrayOfInt2);
    arrayOfInt2[0] = arrayOfInt2[0] + 1;
    int[] arrayOfInt3 = new int[16];
    Nat256.mul(L, paramArrayOfint1, arrayOfInt3);
    int[] arrayOfInt4 = new int[16];
    int[] arrayOfInt5 = new int[4];
    System.arraycopy(L, 0, arrayOfInt5, 0, 4);
    int[] arrayOfInt6 = new int[4];
    int[] arrayOfInt7 = new int[4];
    System.arraycopy(paramArrayOfint1, 0, arrayOfInt7, 0, 4);
    int[] arrayOfInt8 = new int[4];
    arrayOfInt8[0] = 1;
    char c = 'ϸ';
    int i = 15;
    int j = ScalarUtil.getBitLengthPositive(i, arrayOfInt2);
    while (j > 254) {
      if (--c < '\000')
        return false; 
      int k = ScalarUtil.getBitLength(i, arrayOfInt3);
      int m = k - j;
      m &= m >> 31 ^ 0xFFFFFFFF;
      if (arrayOfInt3[i] < 0) {
        ScalarUtil.addShifted_NP(i, m, arrayOfInt1, arrayOfInt2, arrayOfInt3, arrayOfInt4);
        ScalarUtil.addShifted_UV(3, m, arrayOfInt5, arrayOfInt6, arrayOfInt7, arrayOfInt8);
      } else {
        ScalarUtil.subShifted_NP(i, m, arrayOfInt1, arrayOfInt2, arrayOfInt3, arrayOfInt4);
        ScalarUtil.subShifted_UV(3, m, arrayOfInt5, arrayOfInt6, arrayOfInt7, arrayOfInt8);
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
    System.arraycopy(arrayOfInt7, 0, paramArrayOfint2, 0, 4);
    System.arraycopy(arrayOfInt8, 0, paramArrayOfint3, 0, 4);
    return true;
  }
  
  static void toSignedDigits(int paramInt, int[] paramArrayOfint) {
    Nat.caddTo(8, (paramArrayOfint[0] ^ 0xFFFFFFFF) & 0x1, L, paramArrayOfint);
    Nat.shiftDownBit(8, paramArrayOfint, 1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\rfc8032\Scalar25519.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */