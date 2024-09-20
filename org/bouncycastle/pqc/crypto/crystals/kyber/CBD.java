package org.bouncycastle.pqc.crypto.crystals.kyber;

final class CBD {
  public static void kyberCBD(Poly paramPoly, byte[] paramArrayOfbyte, int paramInt) {
    switch (paramInt) {
      case 3:
        for (b = 0; b < 64; b++) {
          long l1 = convertByteTo24BitUnsignedInt(paramArrayOfbyte, 3 * b);
          long l2 = l1 & 0x249249L;
          l2 += l1 >> 1L & 0x249249L;
          l2 += l1 >> 2L & 0x249249L;
          for (byte b1 = 0; b1 < 4; b1++) {
            short s1 = (short)(int)(l2 >> 6 * b1 + 0 & 0x7L);
            short s2 = (short)(int)(l2 >> 6 * b1 + 3 & 0x7L);
            paramPoly.setCoeffIndex(4 * b + b1, (short)(s1 - s2));
          } 
        } 
        return;
    } 
    for (byte b = 0; b < 32; b++) {
      long l1 = convertByteTo32BitUnsignedInt(paramArrayOfbyte, 4 * b);
      long l2 = l1 & 0x55555555L;
      l2 += l1 >> 1L & 0x55555555L;
      for (byte b1 = 0; b1 < 8; b1++) {
        short s1 = (short)(int)(l2 >> 4 * b1 + 0 & 0x3L);
        short s2 = (short)(int)(l2 >> 4 * b1 + paramInt & 0x3L);
        paramPoly.setCoeffIndex(8 * b + b1, (short)(s1 - s2));
      } 
    } 
  }
  
  private static long convertByteTo32BitUnsignedInt(byte[] paramArrayOfbyte, int paramInt) {
    long l = (paramArrayOfbyte[paramInt] & 0xFF);
    l |= (paramArrayOfbyte[paramInt + 1] & 0xFF) << 8L;
    l |= (paramArrayOfbyte[paramInt + 2] & 0xFF) << 16L;
    l |= (paramArrayOfbyte[paramInt + 3] & 0xFF) << 24L;
    return l;
  }
  
  private static long convertByteTo24BitUnsignedInt(byte[] paramArrayOfbyte, int paramInt) {
    long l = (paramArrayOfbyte[paramInt] & 0xFF);
    l |= (paramArrayOfbyte[paramInt + 1] & 0xFF) << 8L;
    l |= (paramArrayOfbyte[paramInt + 2] & 0xFF) << 16L;
    return l;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\kyber\CBD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */