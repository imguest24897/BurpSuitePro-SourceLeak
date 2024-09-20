package META-INF.versions.9.org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.util.Pack;

class Utils {
  static void store_gf(byte[] paramArrayOfbyte, int paramInt, short paramShort) {
    paramArrayOfbyte[paramInt + 0] = (byte)(paramShort & 0xFF);
    paramArrayOfbyte[paramInt + 1] = (byte)(paramShort >> 8);
  }
  
  static short load_gf(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (short)(Pack.littleEndianToShort(paramArrayOfbyte, paramInt1) & paramInt2);
  }
  
  static int load4(byte[] paramArrayOfbyte, int paramInt) {
    return Pack.littleEndianToInt(paramArrayOfbyte, paramInt);
  }
  
  static void store8(byte[] paramArrayOfbyte, int paramInt, long paramLong) {
    paramArrayOfbyte[paramInt + 0] = (byte)(int)(paramLong >> 0L & 0xFFL);
    paramArrayOfbyte[paramInt + 1] = (byte)(int)(paramLong >> 8L & 0xFFL);
    paramArrayOfbyte[paramInt + 2] = (byte)(int)(paramLong >> 16L & 0xFFL);
    paramArrayOfbyte[paramInt + 3] = (byte)(int)(paramLong >> 24L & 0xFFL);
    paramArrayOfbyte[paramInt + 4] = (byte)(int)(paramLong >> 32L & 0xFFL);
    paramArrayOfbyte[paramInt + 5] = (byte)(int)(paramLong >> 40L & 0xFFL);
    paramArrayOfbyte[paramInt + 6] = (byte)(int)(paramLong >> 48L & 0xFFL);
    paramArrayOfbyte[paramInt + 7] = (byte)(int)(paramLong >> 56L & 0xFFL);
  }
  
  static long load8(byte[] paramArrayOfbyte, int paramInt) {
    return Pack.littleEndianToLong(paramArrayOfbyte, paramInt);
  }
  
  static short bitrev(short paramShort, int paramInt) {
    paramShort = (short)((paramShort & 0xFF) << 8 | (paramShort & 0xFF00) >> 8);
    paramShort = (short)((paramShort & 0xF0F) << 4 | (paramShort & 0xF0F0) >> 4);
    paramShort = (short)((paramShort & 0x3333) << 2 | (paramShort & 0xCCCC) >> 2);
    paramShort = (short)((paramShort & 0x5555) << 1 | (paramShort & 0xAAAA) >> 1);
    return (paramInt == 12) ? (short)(paramShort >> 4) : (short)(paramShort >> 3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\cmce\Utils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */