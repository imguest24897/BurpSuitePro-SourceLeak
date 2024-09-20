package org.bouncycastle.pqc.crypto.falcon;

class FalconConversions {
  byte[] int_to_bytes(int paramInt) {
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[0] = (byte)(paramInt >>> 0);
    arrayOfByte[1] = (byte)(paramInt >>> 8);
    arrayOfByte[2] = (byte)(paramInt >>> 16);
    arrayOfByte[3] = (byte)(paramInt >>> 24);
    return arrayOfByte;
  }
  
  int bytes_to_int(byte[] paramArrayOfbyte, int paramInt) {
    null = 0;
    return toUnsignedInt(paramArrayOfbyte[paramInt + 0]) << 0 | toUnsignedInt(paramArrayOfbyte[paramInt + 1]) << 8 | toUnsignedInt(paramArrayOfbyte[paramInt + 2]) << 16 | toUnsignedInt(paramArrayOfbyte[paramInt + 3]) << 24;
  }
  
  int[] bytes_to_int_array(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int[] arrayOfInt = new int[paramInt2];
    for (byte b = 0; b < paramInt2; b++)
      arrayOfInt[b] = bytes_to_int(paramArrayOfbyte, paramInt1 + 4 * b); 
    return arrayOfInt;
  }
  
  byte[] long_to_bytes(long paramLong) {
    byte[] arrayOfByte = new byte[8];
    arrayOfByte[0] = (byte)(int)(paramLong >>> 0L);
    arrayOfByte[1] = (byte)(int)(paramLong >>> 8L);
    arrayOfByte[2] = (byte)(int)(paramLong >>> 16L);
    arrayOfByte[3] = (byte)(int)(paramLong >>> 24L);
    arrayOfByte[4] = (byte)(int)(paramLong >>> 32L);
    arrayOfByte[5] = (byte)(int)(paramLong >>> 40L);
    arrayOfByte[6] = (byte)(int)(paramLong >>> 48L);
    arrayOfByte[7] = (byte)(int)(paramLong >>> 56L);
    return arrayOfByte;
  }
  
  long bytes_to_long(byte[] paramArrayOfbyte, int paramInt) {
    null = 0L;
    return toUnsignedLong(paramArrayOfbyte[paramInt + 0]) << 0L | toUnsignedLong(paramArrayOfbyte[paramInt + 1]) << 8L | toUnsignedLong(paramArrayOfbyte[paramInt + 2]) << 16L | toUnsignedLong(paramArrayOfbyte[paramInt + 3]) << 24L | toUnsignedLong(paramArrayOfbyte[paramInt + 4]) << 32L | toUnsignedLong(paramArrayOfbyte[paramInt + 5]) << 40L | toUnsignedLong(paramArrayOfbyte[paramInt + 6]) << 48L | toUnsignedLong(paramArrayOfbyte[paramInt + 7]) << 56L;
  }
  
  private int toUnsignedInt(byte paramByte) {
    return paramByte & 0xFF;
  }
  
  private long toUnsignedLong(byte paramByte) {
    return paramByte & 0xFFL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\FalconConversions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */