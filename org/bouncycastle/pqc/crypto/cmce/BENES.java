package org.bouncycastle.pqc.crypto.cmce;

abstract class BENES {
  private static final long[] TRANSPOSE_MASKS = new long[] { 6148914691236517205L, 3689348814741910323L, 1085102592571150095L, 71777214294589695L, 281470681808895L, 4294967295L };
  
  protected final int SYS_N;
  
  protected final int SYS_T;
  
  protected final int GFBITS;
  
  public BENES(int paramInt1, int paramInt2, int paramInt3) {
    this.SYS_N = paramInt1;
    this.SYS_T = paramInt2;
    this.GFBITS = paramInt3;
  }
  
  static void transpose_64x64(long[] paramArrayOflong1, long[] paramArrayOflong2) {
    transpose_64x64(paramArrayOflong1, paramArrayOflong2, 0);
  }
  
  static void transpose_64x64(long[] paramArrayOflong1, long[] paramArrayOflong2, int paramInt) {
    System.arraycopy(paramArrayOflong2, paramInt, paramArrayOflong1, paramInt, 64);
    byte b = 5;
    do {
      long l = TRANSPOSE_MASKS[b];
      int i = 1 << b;
      int j;
      for (j = paramInt; j < paramInt + 64; j += i * 2) {
        for (int k = j; k < j + i; k += 4) {
          long l1 = paramArrayOflong1[k + 0];
          long l2 = paramArrayOflong1[k + 1];
          long l3 = paramArrayOflong1[k + 2];
          long l4 = paramArrayOflong1[k + 3];
          long l5 = paramArrayOflong1[k + i + 0];
          long l6 = paramArrayOflong1[k + i + 1];
          long l7 = paramArrayOflong1[k + i + 2];
          long l8 = paramArrayOflong1[k + i + 3];
          long l9 = (l1 >>> i ^ l5) & l;
          long l10 = (l2 >>> i ^ l6) & l;
          long l11 = (l3 >>> i ^ l7) & l;
          long l12 = (l4 >>> i ^ l8) & l;
          paramArrayOflong1[k + 0] = l1 ^ l9 << i;
          paramArrayOflong1[k + 1] = l2 ^ l10 << i;
          paramArrayOflong1[k + 2] = l3 ^ l11 << i;
          paramArrayOflong1[k + 3] = l4 ^ l12 << i;
          paramArrayOflong1[k + i + 0] = l5 ^ l9;
          paramArrayOflong1[k + i + 1] = l6 ^ l10;
          paramArrayOflong1[k + i + 2] = l7 ^ l11;
          paramArrayOflong1[k + i + 3] = l8 ^ l12;
        } 
      } 
    } while (--b >= 2);
    do {
      long l = TRANSPOSE_MASKS[b];
      int i = 1 << b;
      int j;
      for (j = paramInt; j < paramInt + 64; j += i * 2) {
        for (int k = j; k < j + i; k++) {
          long l1 = paramArrayOflong1[k + 0];
          long l2 = paramArrayOflong1[k + i];
          long l3 = (l1 >>> i ^ l2) & l;
          paramArrayOflong1[k + 0] = l1 ^ l3 << i;
          paramArrayOflong1[k + i] = l2 ^ l3;
        } 
      } 
    } while (--b >= 0);
  }
  
  protected abstract void support_gen(short[] paramArrayOfshort, byte[] paramArrayOfbyte);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\cmce\BENES.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */