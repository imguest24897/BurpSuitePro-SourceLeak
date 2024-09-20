package org.bouncycastle.math.ec.rfc8032;

abstract class Wnaf {
  static void getSignedVar(int[] paramArrayOfint, int paramInt, byte[] paramArrayOfbyte) {
    int[] arrayOfInt = new int[paramArrayOfint.length * 2];
    int i = paramArrayOfint[paramArrayOfint.length - 1] >> 31;
    int j = paramArrayOfint.length;
    int k = arrayOfInt.length;
    while (--j >= 0) {
      int m = paramArrayOfint[j];
      arrayOfInt[--k] = m >>> 16 | i << 16;
      arrayOfInt[--k] = i = m;
    } 
    i = 32 - paramInt;
    j = 0;
    k = 0;
    byte b = 0;
    while (b < arrayOfInt.length) {
      int m = arrayOfInt[b];
      while (j < 16) {
        int n = m >>> j;
        int i1 = n & 0x1;
        if (i1 == k) {
          j++;
          continue;
        } 
        int i2 = (n | 0x1) << i;
        k = i2 >>> 31;
        paramArrayOfbyte[(b << 4) + j] = (byte)(i2 >> i);
        j += paramInt;
      } 
      b++;
      j -= 16;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\rfc8032\Wnaf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */