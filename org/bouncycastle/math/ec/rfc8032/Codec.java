package org.bouncycastle.math.ec.rfc8032;

abstract class Codec {
  static int decode16(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramArrayOfbyte[paramInt] & 0xFF;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 8;
    return i;
  }
  
  static int decode24(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramArrayOfbyte[paramInt] & 0xFF;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 8;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 16;
    return i;
  }
  
  static int decode32(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramArrayOfbyte[paramInt] & 0xFF;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 8;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 16;
    i |= paramArrayOfbyte[++paramInt] << 24;
    return i;
  }
  
  static void decode32(byte[] paramArrayOfbyte, int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3) {
    for (byte b = 0; b < paramInt3; b++)
      paramArrayOfint[paramInt2 + b] = decode32(paramArrayOfbyte, paramInt1 + b * 4); 
  }
  
  static void encode24(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    paramArrayOfbyte[paramInt2] = (byte)paramInt1;
    paramArrayOfbyte[++paramInt2] = (byte)(paramInt1 >>> 8);
    paramArrayOfbyte[++paramInt2] = (byte)(paramInt1 >>> 16);
  }
  
  static void encode32(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    paramArrayOfbyte[paramInt2] = (byte)paramInt1;
    paramArrayOfbyte[++paramInt2] = (byte)(paramInt1 >>> 8);
    paramArrayOfbyte[++paramInt2] = (byte)(paramInt1 >>> 16);
    paramArrayOfbyte[++paramInt2] = (byte)(paramInt1 >>> 24);
  }
  
  static void encode32(int[] paramArrayOfint, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3) {
    for (byte b = 0; b < paramInt2; b++)
      encode32(paramArrayOfint[paramInt1 + b], paramArrayOfbyte, paramInt3 + b * 4); 
  }
  
  static void encode56(long paramLong, byte[] paramArrayOfbyte, int paramInt) {
    encode32((int)paramLong, paramArrayOfbyte, paramInt);
    encode24((int)(paramLong >>> 32L), paramArrayOfbyte, paramInt + 4);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\rfc8032\Codec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */