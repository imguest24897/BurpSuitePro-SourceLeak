package org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.util.Integers;

class Utils {
  protected static int numBytes(int paramInt) {
    return (paramInt == 0) ? 0 : ((paramInt - 1) / 8 + 1);
  }
  
  protected static int ceil_log2(int paramInt) {
    return (paramInt == 0) ? 0 : (32 - nlz(paramInt - 1));
  }
  
  private static int nlz(int paramInt) {
    if (paramInt == 0)
      return 32; 
    int i = 1;
    if (paramInt >>> 16 == 0) {
      i += 16;
      paramInt <<= 16;
    } 
    if (paramInt >>> 24 == 0) {
      i += 8;
      paramInt <<= 8;
    } 
    if (paramInt >>> 28 == 0) {
      i += 4;
      paramInt <<= 4;
    } 
    if (paramInt >>> 30 == 0) {
      i += 2;
      paramInt <<= 2;
    } 
    i -= paramInt >>> 31;
    return i;
  }
  
  protected static int parity(byte[] paramArrayOfbyte, int paramInt) {
    byte b = paramArrayOfbyte[0];
    for (byte b1 = 1; b1 < paramInt; b1++)
      b = (byte)(b ^ paramArrayOfbyte[b1]); 
    return Integers.bitCount(b & 0xFF) & 0x1;
  }
  
  protected static int parity16(int paramInt) {
    return Integers.bitCount(paramInt & 0xFFFF) & 0x1;
  }
  
  protected static int parity32(int paramInt) {
    return Integers.bitCount(paramInt) & 0x1;
  }
  
  protected static void setBitInWordArray(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    setBit(paramArrayOfint, paramInt1, paramInt2);
  }
  
  protected static int getBitFromWordArray(int[] paramArrayOfint, int paramInt) {
    return getBit(paramArrayOfint, paramInt);
  }
  
  protected static byte getBit(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramInt >>> 3;
    int j = paramInt & 0x7 ^ 0x7;
    return (byte)(paramArrayOfbyte[i] >>> j & 0x1);
  }
  
  protected static byte getCrumbAligned(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramInt >>> 2;
    int j = paramInt << 1 & 0x6 ^ 0x6;
    int k = paramArrayOfbyte[i] >>> j;
    return (byte)((k & 0x1) << 1 | (k & 0x2) >> 1);
  }
  
  protected static int getBit(int paramInt1, int paramInt2) {
    int i = paramInt2 ^ 0x7;
    return paramInt1 >>> i & 0x1;
  }
  
  protected static int getBit(int[] paramArrayOfint, int paramInt) {
    int i = paramInt >>> 5;
    int j = paramInt & 0x1F ^ 0x7;
    return paramArrayOfint[i] >>> j & 0x1;
  }
  
  protected static void setBit(byte[] paramArrayOfbyte, int paramInt, byte paramByte) {
    int i = paramInt >>> 3;
    int j = paramInt & 0x7 ^ 0x7;
    byte b = paramArrayOfbyte[i];
    int k = b & (1 << j ^ 0xFFFFFFFF);
    k |= paramByte << j;
    paramArrayOfbyte[i] = (byte)k;
  }
  
  protected static int setBit(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2 ^ 0x7;
    paramInt1 &= 1 << i ^ 0xFFFFFFFF;
    paramInt1 |= paramInt3 << i;
    return paramInt1;
  }
  
  protected static void setBit(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    int i = paramInt1 >>> 5;
    int j = paramInt1 & 0x1F ^ 0x7;
    int k = paramArrayOfint[i];
    k &= 1 << j ^ 0xFFFFFFFF;
    k |= paramInt2 << j;
    paramArrayOfint[i] = k;
  }
  
  protected static void zeroTrailingBits(int[] paramArrayOfint, int paramInt) {
    int i = paramInt & 0x1F;
    if (i != 0)
      paramArrayOfint[paramInt >>> 5] = paramArrayOfint[paramInt >>> 5] & getTrailingBitsMask(paramInt); 
  }
  
  protected static int getTrailingBitsMask(int paramInt) {
    int i = paramInt & 0xFFFFFFF8;
    int j = -1 << i ^ 0xFFFFFFFF;
    int k = paramInt & 0x7;
    if (k != 0)
      j ^= (65280 >>> k & 0xFF) << i; 
    return j;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\picnic\Utils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */