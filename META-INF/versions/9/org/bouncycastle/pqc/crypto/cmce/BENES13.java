package META-INF.versions.9.org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.pqc.crypto.cmce.BENES;
import org.bouncycastle.pqc.crypto.cmce.Utils;

class BENES13 extends BENES {
  public BENES13(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1, paramInt2, paramInt3);
  }
  
  static void layer_in(long[] paramArrayOflong1, long[] paramArrayOflong2, int paramInt) {
    byte b = 0;
    int j = 1 << paramInt;
    for (int i = 0; i < 64; i += j * 2) {
      for (int k = i; k < i + j; k++) {
        long l = paramArrayOflong1[k + 0] ^ paramArrayOflong1[k + j];
        l &= paramArrayOflong2[b++];
        paramArrayOflong1[k + 0] = paramArrayOflong1[k + 0] ^ l;
        paramArrayOflong1[k + j] = paramArrayOflong1[k + j] ^ l;
        l = paramArrayOflong1[64 + k + 0] ^ paramArrayOflong1[64 + k + j];
        l &= paramArrayOflong2[b++];
        paramArrayOflong1[64 + k + 0] = paramArrayOflong1[64 + k + 0] ^ l;
        paramArrayOflong1[64 + k + j] = paramArrayOflong1[64 + k + j] ^ l;
      } 
    } 
  }
  
  static void layer_ex(long[] paramArrayOflong1, long[] paramArrayOflong2, int paramInt) {
    byte b = 0;
    int j = 1 << paramInt;
    for (int i = 0; i < 128; i += j * 2) {
      for (int k = i; k < i + j; k++) {
        long l = paramArrayOflong1[k + 0] ^ paramArrayOflong1[k + j];
        l &= paramArrayOflong2[b++];
        paramArrayOflong1[k + 0] = paramArrayOflong1[k + 0] ^ l;
        paramArrayOflong1[k + j] = paramArrayOflong1[k + j] ^ l;
      } 
    } 
  }
  
  void apply_benes(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    short s;
    byte b3 = 0;
    int i = 0;
    long[] arrayOfLong1 = new long[128];
    long[] arrayOfLong2 = new long[128];
    long[] arrayOfLong3 = new long[64];
    long[] arrayOfLong4 = new long[64];
    if (paramInt == 0) {
      i = this.SYS_T * 2 + 40;
      s = 0;
    } else {
      i = this.SYS_T * 2 + 40 + 12288;
      s = -1024;
    } 
    byte b1;
    for (b1 = 0; b1 < 64; b1++) {
      arrayOfLong1[b1 + 0] = Utils.load8(paramArrayOfbyte1, b3 + b1 * 16 + 0);
      arrayOfLong1[b1 + 64] = Utils.load8(paramArrayOfbyte1, b3 + b1 * 16 + 8);
    } 
    transpose_64x64(arrayOfLong2, arrayOfLong1, 0);
    transpose_64x64(arrayOfLong2, arrayOfLong1, 64);
    byte b2;
    for (b2 = 0; b2 <= 6; b2++) {
      for (b1 = 0; b1 < 64; b1++) {
        arrayOfLong3[b1] = Utils.load8(paramArrayOfbyte2, i);
        i += 8;
      } 
      i += s;
      transpose_64x64(arrayOfLong4, arrayOfLong3);
      layer_ex(arrayOfLong2, arrayOfLong4, b2);
    } 
    transpose_64x64(arrayOfLong1, arrayOfLong2, 0);
    transpose_64x64(arrayOfLong1, arrayOfLong2, 64);
    for (b2 = 0; b2 <= 5; b2++) {
      for (b1 = 0; b1 < 64; b1++) {
        arrayOfLong3[b1] = Utils.load8(paramArrayOfbyte2, i);
        i += 8;
      } 
      i += s;
      layer_in(arrayOfLong1, arrayOfLong3, b2);
    } 
    for (b2 = 4; b2 >= 0; b2--) {
      for (b1 = 0; b1 < 64; b1++) {
        arrayOfLong3[b1] = Utils.load8(paramArrayOfbyte2, i);
        i += 8;
      } 
      i += s;
      layer_in(arrayOfLong1, arrayOfLong3, b2);
    } 
    transpose_64x64(arrayOfLong2, arrayOfLong1, 0);
    transpose_64x64(arrayOfLong2, arrayOfLong1, 64);
    for (b2 = 6; b2 >= 0; b2--) {
      for (b1 = 0; b1 < 64; b1++) {
        arrayOfLong3[b1] = Utils.load8(paramArrayOfbyte2, i);
        i += 8;
      } 
      i += s;
      transpose_64x64(arrayOfLong4, arrayOfLong3);
      layer_ex(arrayOfLong2, arrayOfLong4, b2);
    } 
    transpose_64x64(arrayOfLong1, arrayOfLong2, 0);
    transpose_64x64(arrayOfLong1, arrayOfLong2, 64);
    for (b1 = 0; b1 < 64; b1++) {
      Utils.store8(paramArrayOfbyte1, b3 + b1 * 16 + 0, arrayOfLong1[0 + b1]);
      Utils.store8(paramArrayOfbyte1, b3 + b1 * 16 + 8, arrayOfLong1[64 + b1]);
    } 
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
    int i;
    for (i = 0; i < this.GFBITS; i++)
      apply_benes(arrayOfByte[i], paramArrayOfbyte, 0); 
    for (b = 0; b < this.SYS_N; b++) {
      paramArrayOfshort[b] = 0;
      for (i = this.GFBITS - 1; i >= 0; i--) {
        paramArrayOfshort[b] = (short)(paramArrayOfshort[b] << 1);
        paramArrayOfshort[b] = (short)(paramArrayOfshort[b] | arrayOfByte[i][b / 8] >> b % 8 & 0x1);
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\cmce\BENES13.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */