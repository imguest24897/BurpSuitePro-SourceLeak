package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.util.Pack;

public class Tables64kGCMMultiplier implements GCMMultiplier {
  private byte[] H;
  
  private long[][][] T;
  
  public void init(byte[] paramArrayOfbyte) {
    if (this.T == null) {
      this.T = new long[16][256][2];
    } else if (0 != GCMUtil.areEqual(this.H, paramArrayOfbyte)) {
      return;
    } 
    this.H = new byte[16];
    GCMUtil.copy(paramArrayOfbyte, this.H);
    for (byte b = 0; b < 16; b++) {
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
    long[] arrayOfLong1 = this.T[0][paramArrayOfbyte[0] & 0xFF];
    long[] arrayOfLong2 = this.T[1][paramArrayOfbyte[1] & 0xFF];
    long[] arrayOfLong3 = this.T[2][paramArrayOfbyte[2] & 0xFF];
    long[] arrayOfLong4 = this.T[3][paramArrayOfbyte[3] & 0xFF];
    long[] arrayOfLong5 = this.T[4][paramArrayOfbyte[4] & 0xFF];
    long[] arrayOfLong6 = this.T[5][paramArrayOfbyte[5] & 0xFF];
    long[] arrayOfLong7 = this.T[6][paramArrayOfbyte[6] & 0xFF];
    long[] arrayOfLong8 = this.T[7][paramArrayOfbyte[7] & 0xFF];
    long[] arrayOfLong9 = this.T[8][paramArrayOfbyte[8] & 0xFF];
    long[] arrayOfLong10 = this.T[9][paramArrayOfbyte[9] & 0xFF];
    long[] arrayOfLong11 = this.T[10][paramArrayOfbyte[10] & 0xFF];
    long[] arrayOfLong12 = this.T[11][paramArrayOfbyte[11] & 0xFF];
    long[] arrayOfLong13 = this.T[12][paramArrayOfbyte[12] & 0xFF];
    long[] arrayOfLong14 = this.T[13][paramArrayOfbyte[13] & 0xFF];
    long[] arrayOfLong15 = this.T[14][paramArrayOfbyte[14] & 0xFF];
    long[] arrayOfLong16 = this.T[15][paramArrayOfbyte[15] & 0xFF];
    long l1 = arrayOfLong1[0] ^ arrayOfLong2[0] ^ arrayOfLong3[0] ^ arrayOfLong4[0] ^ arrayOfLong5[0] ^ arrayOfLong6[0] ^ arrayOfLong7[0] ^ arrayOfLong8[0] ^ arrayOfLong9[0] ^ arrayOfLong10[0] ^ arrayOfLong11[0] ^ arrayOfLong12[0] ^ arrayOfLong13[0] ^ arrayOfLong14[0] ^ arrayOfLong15[0] ^ arrayOfLong16[0];
    long l2 = arrayOfLong1[1] ^ arrayOfLong2[1] ^ arrayOfLong3[1] ^ arrayOfLong4[1] ^ arrayOfLong5[1] ^ arrayOfLong6[1] ^ arrayOfLong7[1] ^ arrayOfLong8[1] ^ arrayOfLong9[1] ^ arrayOfLong10[1] ^ arrayOfLong11[1] ^ arrayOfLong12[1] ^ arrayOfLong13[1] ^ arrayOfLong14[1] ^ arrayOfLong15[1] ^ arrayOfLong16[1];
    Pack.longToBigEndian(l1, paramArrayOfbyte, 0);
    Pack.longToBigEndian(l2, paramArrayOfbyte, 8);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\modes\gcm\Tables64kGCMMultiplier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */