package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.util.Pack;

public class Tables8kGCMMultiplier implements GCMMultiplier {
  private byte[] H;
  
  private long[][][] T;
  
  public void init(byte[] paramArrayOfbyte) {
    if (this.T == null) {
      this.T = new long[2][256][2];
    } else if (0 != GCMUtil.areEqual(this.H, paramArrayOfbyte)) {
      return;
    } 
    this.H = new byte[16];
    GCMUtil.copy(paramArrayOfbyte, this.H);
    for (byte b = 0; b < 2; b++) {
      long[][] arrayOfLong = this.T[b];
      if (b == 0) {
        GCMUtil.asLongs(this.H, arrayOfLong[1]);
        GCMUtil.multiplyP7(arrayOfLong[1], arrayOfLong[1]);
      } else {
        GCMUtil.multiplyP8(this.T[b - 1][1], arrayOfLong[1]);
      } 
      for (byte b1 = 2; b1 < 'Ā'; b1 += 2) {
        GCMUtil.divideP(arrayOfLong[b1 >> 1], arrayOfLong[b1]);
        GCMUtil.xor(arrayOfLong[b1], arrayOfLong[1], arrayOfLong[b1 + 1]);
      } 
    } 
  }
  
  public void multiplyH(byte[] paramArrayOfbyte) {
    long[][] arrayOfLong1 = this.T[0];
    long[][] arrayOfLong2 = this.T[1];
    long[] arrayOfLong3 = arrayOfLong1[paramArrayOfbyte[14] & 0xFF];
    long[] arrayOfLong4 = arrayOfLong2[paramArrayOfbyte[15] & 0xFF];
    long l1 = arrayOfLong3[0] ^ arrayOfLong4[0];
    long l2 = arrayOfLong3[1] ^ arrayOfLong4[1];
    for (byte b = 12; b >= 0; b -= 2) {
      arrayOfLong3 = arrayOfLong1[paramArrayOfbyte[b] & 0xFF];
      arrayOfLong4 = arrayOfLong2[paramArrayOfbyte[b + 1] & 0xFF];
      long l = l2 << 48L;
      l2 = arrayOfLong3[1] ^ arrayOfLong4[1] ^ (l2 >>> 16L | l1 << 48L);
      l1 = arrayOfLong3[0] ^ arrayOfLong4[0] ^ l1 >>> 16L ^ l ^ l >>> 1L ^ l >>> 2L ^ l >>> 7L;
    } 
    Pack.longToBigEndian(l1, paramArrayOfbyte, 0);
    Pack.longToBigEndian(l2, paramArrayOfbyte, 8);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\modes\gcm\Tables8kGCMMultiplier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */