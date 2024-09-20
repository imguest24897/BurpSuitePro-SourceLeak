package org.bouncycastle.pqc.crypto.gemss;

public class GeMSSUtils {
  static long NORBITS_UINT(long paramLong) {
    paramLong |= paramLong << 32L;
    paramLong >>>= 32L;
    paramLong--;
    return paramLong >>> 63L;
  }
  
  static long XORBITS_UINT(long paramLong) {
    paramLong ^= paramLong << 1L;
    paramLong ^= paramLong << 2L;
    return (paramLong & 0x8888888888888888L) * 1229782938247303441L >>> 63L;
  }
  
  static long ORBITS_UINT(long paramLong) {
    paramLong |= paramLong << 32L;
    paramLong >>>= 32L;
    paramLong += 4294967295L;
    return paramLong >>> 32L;
  }
  
  static long CMP_LT_UINT(long paramLong1, long paramLong2) {
    return (paramLong1 >>> 63L ^ paramLong2 >>> 63L) & (paramLong1 >>> 63L) - (paramLong2 >>> 63L) >>> 63L ^ (paramLong1 >>> 63L ^ paramLong2 >>> 63L ^ 0x1L) & (paramLong1 & Long.MAX_VALUE) - (paramLong2 & Long.MAX_VALUE) >>> 63L;
  }
  
  static long maskUINT(int paramInt) {
    return (paramInt != 0) ? ((1L << paramInt) - 1L) : -1L;
  }
  
  static int Highest_One(int paramInt) {
    paramInt |= paramInt >>> 1;
    paramInt |= paramInt >>> 2;
    paramInt |= paramInt >>> 4;
    paramInt |= paramInt >>> 8;
    paramInt |= paramInt >>> 16;
    return paramInt ^ paramInt >>> 1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\GeMSSUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */