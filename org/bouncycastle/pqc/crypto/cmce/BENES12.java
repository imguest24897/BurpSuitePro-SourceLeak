package org.bouncycastle.pqc.crypto.cmce;

class BENES12 extends BENES {
  public BENES12(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1, paramInt2, paramInt3);
  }
  
  static void layerBenes(long[] paramArrayOflong1, long[] paramArrayOflong2, int paramInt) {
    byte b = 0;
    int j = 1 << paramInt;
    for (int i = 0; i < 64; i += j * 2) {
      for (int k = i; k < i + j; k++) {
        long l = paramArrayOflong1[k + 0] ^ paramArrayOflong1[k + j];
        l &= paramArrayOflong2[b++];
        paramArrayOflong1[k + 0] = paramArrayOflong1[k + 0] ^ l;
        paramArrayOflong1[k + j] = paramArrayOflong1[k + j] ^ l;
      } 
    } 
  }
  
  private void apply_benes(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    int i;
    short s;
    long[] arrayOfLong1 = new long[64];
    long[] arrayOfLong2 = new long[64];
    byte b1;
    for (b1 = 0; b1 < 64; b1++)
      arrayOfLong1[b1] = Utils.load8(paramArrayOfbyte1, b1 * 8); 
    if (paramInt == 0) {
      s = 256;
      i = this.SYS_T * 2 + 40;
    } else {
      s = -256;
      i = this.SYS_T * 2 + 40 + (2 * this.GFBITS - 2) * 256;
    } 
    transpose_64x64(arrayOfLong1, arrayOfLong1);
    byte b2;
    for (b2 = 0; b2 <= 5; b2++) {
      for (b1 = 0; b1 < 64; b1++)
        arrayOfLong2[b1] = Utils.load4(paramArrayOfbyte2, i + b1 * 4); 
      transpose_64x64(arrayOfLong2, arrayOfLong2);
      layerBenes(arrayOfLong1, arrayOfLong2, b2);
      i += s;
    } 
    transpose_64x64(arrayOfLong1, arrayOfLong1);
    for (b2 = 0; b2 <= 5; b2++) {
      for (b1 = 0; b1 < 32; b1++)
        arrayOfLong2[b1] = Utils.load8(paramArrayOfbyte2, i + b1 * 8); 
      layerBenes(arrayOfLong1, arrayOfLong2, b2);
      i += s;
    } 
    for (b2 = 4; b2 >= 0; b2--) {
      for (b1 = 0; b1 < 32; b1++)
        arrayOfLong2[b1] = Utils.load8(paramArrayOfbyte2, i + b1 * 8); 
      layerBenes(arrayOfLong1, arrayOfLong2, b2);
      i += s;
    } 
    transpose_64x64(arrayOfLong1, arrayOfLong1);
    for (b2 = 5; b2 >= 0; b2--) {
      for (b1 = 0; b1 < 64; b1++)
        arrayOfLong2[b1] = Utils.load4(paramArrayOfbyte2, i + b1 * 4); 
      transpose_64x64(arrayOfLong2, arrayOfLong2);
      layerBenes(arrayOfLong1, arrayOfLong2, b2);
      i += s;
    } 
    transpose_64x64(arrayOfLong1, arrayOfLong1);
    for (b1 = 0; b1 < 64; b1++)
      Utils.store8(paramArrayOfbyte1, b1 * 8, arrayOfLong1[b1]); 
  }
  
  public void support_gen(short[] paramArrayOfshort, byte[] paramArrayOfbyte) {
    byte[][] arrayOfByte = new byte[this.GFBITS][(1 << this.GFBITS) / 8];
    byte b;
    for (b = 0; b < this.GFBITS; b++) {
      for (byte b1 = 0; b1 < (1 << this.GFBITS) / 8; b1++)
        arrayOfByte[b][b1] = 0; 
    } 
    for (b = 0; b < 1 << this.GFBITS; b++) {
      short s = Utils.bitrev((short)b, this.GFBITS);
      for (byte b1 = 0; b1 < this.GFBITS; b1++)
        arrayOfByte[b1][b / 8] = (byte)(arrayOfByte[b1][b / 8] | (s >> b1 & 0x1) << b % 8); 
    } 
    for (b = 0; b < this.GFBITS; b++)
      apply_benes(arrayOfByte[b], paramArrayOfbyte, 0); 
    for (b = 0; b < this.SYS_N; b++) {
      paramArrayOfshort[b] = 0;
      for (int i = this.GFBITS - 1; i >= 0; i--) {
        paramArrayOfshort[b] = (short)(paramArrayOfshort[b] << 1);
        paramArrayOfshort[b] = (short)(paramArrayOfshort[b] | arrayOfByte[i][b / 8] >> b % 8 & 0x1);
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\cmce\BENES12.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */