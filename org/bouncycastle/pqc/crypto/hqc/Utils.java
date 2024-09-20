package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Pack;

class Utils {
  static void resizeArray(long[] paramArrayOflong1, int paramInt1, long[] paramArrayOflong2, int paramInt2, int paramInt3, int paramInt4) {
    long l = Long.MAX_VALUE;
    int i = 0;
    if (paramInt1 < paramInt2) {
      if (paramInt1 % 64 != 0)
        i = 64 - paramInt1 % 64; 
      System.arraycopy(paramArrayOflong2, 0, paramArrayOflong1, 0, paramInt3);
      for (byte b = 0; b < i; b++)
        paramArrayOflong1[paramInt4 - 1] = paramArrayOflong1[paramInt4 - 1] & l >> b; 
    } else {
      System.arraycopy(paramArrayOflong2, 0, paramArrayOflong1, 0, (paramInt2 + 7) / 8);
    } 
  }
  
  static void fromByte16ArrayToLongArray(long[] paramArrayOflong, int[] paramArrayOfint) {
    for (byte b = 0; b != paramArrayOfint.length; b += 4) {
      paramArrayOflong[b / 4] = paramArrayOfint[b] & 0xFFFFL;
      paramArrayOflong[b / 4] = paramArrayOflong[b / 4] | paramArrayOfint[b + 1] << 16L;
      paramArrayOflong[b / 4] = paramArrayOflong[b / 4] | paramArrayOfint[b + 2] << 32L;
      paramArrayOflong[b / 4] = paramArrayOflong[b / 4] | paramArrayOfint[b + 3] << 48L;
    } 
  }
  
  static void fromByteArrayToByte16Array(int[] paramArrayOfint, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = paramArrayOfbyte;
    if (paramArrayOfbyte.length % 2 != 0) {
      arrayOfByte = new byte[(paramArrayOfbyte.length + 1) / 2 * 2];
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramArrayOfbyte.length);
    } 
    boolean bool = false;
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      paramArrayOfint[b] = Pack.littleEndianToShort(arrayOfByte, bool) & 0xFFFF;
      bool += true;
    } 
  }
  
  static void fromLongArrayToByteArray(byte[] paramArrayOfbyte, long[] paramArrayOflong) {
    int i = paramArrayOfbyte.length / 8;
    int j;
    for (j = 0; j != i; j++)
      Pack.longToLittleEndian(paramArrayOflong[j], paramArrayOfbyte, j * 8); 
    if (paramArrayOfbyte.length % 8 != 0) {
      j = i * 8;
      byte b = 0;
      while (j < paramArrayOfbyte.length)
        paramArrayOfbyte[j++] = (byte)(int)(paramArrayOflong[i] >>> b++ * 8); 
    } 
  }
  
  static long bitMask(long paramLong1, long paramLong2) {
    return (1L << (int)(paramLong1 % paramLong2)) - 1L;
  }
  
  static void fromByteArrayToLongArray(long[] paramArrayOflong, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = paramArrayOfbyte;
    if (paramArrayOfbyte.length % 8 != 0) {
      arrayOfByte = new byte[(paramArrayOfbyte.length + 7) / 8 * 8];
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramArrayOfbyte.length);
    } 
    boolean bool = false;
    for (byte b = 0; b < paramArrayOflong.length; b++) {
      paramArrayOflong[b] = Pack.littleEndianToLong(arrayOfByte, bool);
      bool += true;
    } 
  }
  
  static void fromByte32ArrayToLongArray(long[] paramArrayOflong, int[] paramArrayOfint) {
    for (byte b = 0; b != paramArrayOfint.length; b += 2) {
      paramArrayOflong[b / 2] = paramArrayOfint[b] & 0xFFFFFFFFL;
      paramArrayOflong[b / 2] = paramArrayOflong[b / 2] | paramArrayOfint[b + 1] << 32L;
    } 
  }
  
  static void fromLongArrayToByte32Array(int[] paramArrayOfint, long[] paramArrayOflong) {
    for (byte b = 0; b != paramArrayOflong.length; b++) {
      paramArrayOfint[2 * b] = (int)paramArrayOflong[b];
      paramArrayOfint[2 * b + 1] = (int)(paramArrayOflong[b] >> 32L);
    } 
  }
  
  static void copyBytes(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int paramInt3) {
    System.arraycopy(paramArrayOfint1, paramInt1, paramArrayOfint2, paramInt2, paramInt3 / 2);
  }
  
  static int getByteSizeFromBitSize(int paramInt) {
    return (paramInt + 7) / 8;
  }
  
  static int getByte64SizeFromBitSize(int paramInt) {
    return (paramInt + 63) / 64;
  }
  
  static int toUnsigned8bits(int paramInt) {
    return paramInt & 0xFF;
  }
  
  static int toUnsigned16Bits(int paramInt) {
    return paramInt & 0xFFFF;
  }
  
  static void xorLongToByte16Array(int[] paramArrayOfint, long paramLong, int paramInt) {
    paramArrayOfint[paramInt + 0] = paramArrayOfint[paramInt + 0] ^ (int)paramLong & 0xFFFF;
    paramArrayOfint[paramInt + 1] = paramArrayOfint[paramInt + 1] ^ (int)(paramLong >>> 16L) & 0xFFFF;
    paramArrayOfint[paramInt + 2] = paramArrayOfint[paramInt + 2] ^ (int)(paramLong >>> 32L) & 0xFFFF;
    paramArrayOfint[paramInt + 3] = paramArrayOfint[paramInt + 3] ^ (int)(paramLong >>> 48L) & 0xFFFF;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\hqc\Utils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */