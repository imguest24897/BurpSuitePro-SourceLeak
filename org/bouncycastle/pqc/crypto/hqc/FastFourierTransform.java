package org.bouncycastle.pqc.crypto.hqc;

class FastFourierTransform {
  static void fastFourierTransform(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt1, int paramInt2) {
    byte b1 = 8;
    char c = '';
    int i = 1 << paramInt2;
    int[] arrayOfInt1 = new int[i];
    int[] arrayOfInt2 = new int[i];
    int[] arrayOfInt3 = new int[b1 - 1];
    int[] arrayOfInt4 = new int[c];
    int[] arrayOfInt5 = new int[c];
    int[] arrayOfInt6 = new int[b1 - 1];
    int[] arrayOfInt7 = new int[c];
    computeFFTBetas(arrayOfInt6, b1);
    computeSubsetSum(arrayOfInt7, arrayOfInt6, b1 - 1);
    computeRadix(arrayOfInt1, arrayOfInt2, paramArrayOfint2, paramInt2, paramInt2);
    int j;
    for (j = 0; j < b1 - 1; j++)
      arrayOfInt3[j] = GFCalculator.mult(arrayOfInt6[j], arrayOfInt6[j]) ^ arrayOfInt6[j]; 
    computeFFTRec(arrayOfInt4, arrayOfInt1, (paramInt1 + 1) / 2, b1 - 1, paramInt2 - 1, arrayOfInt3, paramInt2, b1);
    computeFFTRec(arrayOfInt5, arrayOfInt2, paramInt1 / 2, b1 - 1, paramInt2 - 1, arrayOfInt3, paramInt2, b1);
    j = 1;
    j = 1 << b1 - 1;
    System.arraycopy(arrayOfInt5, 0, paramArrayOfint1, j, j);
    paramArrayOfint1[0] = arrayOfInt4[0];
    paramArrayOfint1[j] = paramArrayOfint1[j] ^ arrayOfInt4[0];
    for (byte b2 = 1; b2 < j; b2++) {
      paramArrayOfint1[b2] = arrayOfInt4[b2] ^ GFCalculator.mult(arrayOfInt7[b2], arrayOfInt5[b2]);
      paramArrayOfint1[j + b2] = paramArrayOfint1[j + b2] ^ paramArrayOfint1[b2];
    } 
  }
  
  static void computeFFTBetas(int[] paramArrayOfint, int paramInt) {
    for (byte b = 0; b < paramInt - 1; b++)
      paramArrayOfint[b] = 1 << paramInt - 1 - b; 
  }
  
  static void computeSubsetSum(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt) {
    paramArrayOfint1[0] = 0;
    for (byte b = 0; b < paramInt; b++) {
      for (byte b1 = 0; b1 < 1 << b; b1++)
        paramArrayOfint1[(1 << b) + b1] = paramArrayOfint2[b] ^ paramArrayOfint1[b1]; 
    } 
  }
  
  static void computeRadix(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int paramInt1, int paramInt2) {
    switch (paramInt1) {
      case 4:
        paramArrayOfint1[4] = paramArrayOfint3[8] ^ paramArrayOfint3[12];
        paramArrayOfint1[6] = paramArrayOfint3[12] ^ paramArrayOfint3[14];
        paramArrayOfint1[7] = paramArrayOfint3[14] ^ paramArrayOfint3[15];
        paramArrayOfint2[5] = paramArrayOfint3[11] ^ paramArrayOfint3[13];
        paramArrayOfint2[6] = paramArrayOfint3[13] ^ paramArrayOfint3[14];
        paramArrayOfint2[7] = paramArrayOfint3[15];
        paramArrayOfint1[5] = paramArrayOfint3[10] ^ paramArrayOfint3[12] ^ paramArrayOfint2[5];
        paramArrayOfint2[4] = paramArrayOfint3[9] ^ paramArrayOfint3[13] ^ paramArrayOfint1[5];
        paramArrayOfint1[0] = paramArrayOfint3[0];
        paramArrayOfint2[3] = paramArrayOfint3[7] ^ paramArrayOfint3[11] ^ paramArrayOfint3[15];
        paramArrayOfint1[3] = paramArrayOfint3[6] ^ paramArrayOfint3[10] ^ paramArrayOfint3[14] ^ paramArrayOfint2[3];
        paramArrayOfint1[2] = paramArrayOfint3[4] ^ paramArrayOfint1[4] ^ paramArrayOfint1[3] ^ paramArrayOfint2[3];
        paramArrayOfint2[1] = paramArrayOfint3[3] ^ paramArrayOfint3[5] ^ paramArrayOfint3[9] ^ paramArrayOfint3[13] ^ paramArrayOfint2[3];
        paramArrayOfint2[2] = paramArrayOfint3[3] ^ paramArrayOfint2[1] ^ paramArrayOfint1[3];
        paramArrayOfint1[1] = paramArrayOfint3[2] ^ paramArrayOfint1[2] ^ paramArrayOfint2[1];
        paramArrayOfint2[0] = paramArrayOfint3[1] ^ paramArrayOfint1[1];
        return;
      case 3:
        paramArrayOfint1[0] = paramArrayOfint3[0];
        paramArrayOfint1[2] = paramArrayOfint3[4] ^ paramArrayOfint3[6];
        paramArrayOfint1[3] = paramArrayOfint3[6] ^ paramArrayOfint3[7];
        paramArrayOfint2[1] = paramArrayOfint3[3] ^ paramArrayOfint3[5] ^ paramArrayOfint3[7];
        paramArrayOfint2[2] = paramArrayOfint3[5] ^ paramArrayOfint3[6];
        paramArrayOfint2[3] = paramArrayOfint3[7];
        paramArrayOfint1[1] = paramArrayOfint3[2] ^ paramArrayOfint1[2] ^ paramArrayOfint2[1];
        paramArrayOfint2[0] = paramArrayOfint3[1] ^ paramArrayOfint1[1];
        return;
      case 2:
        paramArrayOfint1[0] = paramArrayOfint3[0];
        paramArrayOfint1[1] = paramArrayOfint3[2] ^ paramArrayOfint3[3];
        paramArrayOfint2[0] = paramArrayOfint3[1] ^ paramArrayOfint1[1];
        paramArrayOfint2[1] = paramArrayOfint3[3];
        return;
      case 1:
        paramArrayOfint1[0] = paramArrayOfint3[0];
        paramArrayOfint2[0] = paramArrayOfint3[1];
        return;
    } 
    computeRadixBig(paramArrayOfint1, paramArrayOfint2, paramArrayOfint3, paramInt1, paramInt2);
  }
  
  static void computeRadixBig(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int paramInt1, int paramInt2) {
    int i = 1;
    i <<= paramInt1 - 2;
    int j = 1 << paramInt2 - 2;
    int[] arrayOfInt1 = new int[2 * j];
    int[] arrayOfInt2 = new int[2 * j];
    int[] arrayOfInt3 = new int[j];
    int[] arrayOfInt4 = new int[j];
    int[] arrayOfInt5 = new int[j];
    int[] arrayOfInt6 = new int[j];
    Utils.copyBytes(paramArrayOfint3, 3 * i, arrayOfInt1, 0, 2 * i);
    Utils.copyBytes(paramArrayOfint3, 3 * i, arrayOfInt1, i, 2 * i);
    Utils.copyBytes(paramArrayOfint3, 0, arrayOfInt2, 0, 4 * i);
    for (byte b = 0; b < i; b++) {
      arrayOfInt1[b] = arrayOfInt1[b] ^ paramArrayOfint3[2 * i + b];
      arrayOfInt2[i + b] = arrayOfInt2[i + b] ^ arrayOfInt1[b];
    } 
    computeRadix(arrayOfInt3, arrayOfInt4, arrayOfInt1, paramInt1 - 1, paramInt2);
    computeRadix(arrayOfInt5, arrayOfInt6, arrayOfInt2, paramInt1 - 1, paramInt2);
    Utils.copyBytes(arrayOfInt5, 0, paramArrayOfint1, 0, 2 * i);
    Utils.copyBytes(arrayOfInt3, 0, paramArrayOfint1, i, 2 * i);
    Utils.copyBytes(arrayOfInt6, 0, paramArrayOfint2, 0, 2 * i);
    Utils.copyBytes(arrayOfInt4, 0, paramArrayOfint2, i, 2 * i);
  }
  
  static void computeFFTRec(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint3, int paramInt4, int paramInt5) {
    int i = 1 << paramInt4 - 2;
    int j = 1 << paramInt5 - 2;
    int[] arrayOfInt1 = new int[i];
    int[] arrayOfInt2 = new int[i];
    int[] arrayOfInt3 = new int[paramInt5 - 2];
    int[] arrayOfInt4 = new int[paramInt5 - 2];
    int k = 1;
    int[] arrayOfInt5 = new int[j];
    int[] arrayOfInt6 = new int[j];
    int[] arrayOfInt7 = new int[j];
    int[] arrayOfInt8 = new int[paramInt5 - paramInt4 + 1];
    int m = 0;
    if (paramInt3 == 1) {
      byte b1;
      for (b1 = 0; b1 < paramInt2; b1++)
        arrayOfInt8[b1] = GFCalculator.mult(paramArrayOfint3[b1], paramArrayOfint2[1]); 
      paramArrayOfint1[0] = paramArrayOfint2[0];
      m = 1;
      for (b1 = 0; b1 < paramInt2; b1++) {
        for (byte b2 = 0; b2 < m; b2++)
          paramArrayOfint1[m + b2] = paramArrayOfint1[b2] ^ arrayOfInt8[b1]; 
        m <<= 1;
      } 
      return;
    } 
    if (paramArrayOfint3[paramInt2 - 1] != 1) {
      int n = 1;
      m = 1;
      m <<= paramInt3;
      for (byte b1 = 1; b1 < m; b1++) {
        n = GFCalculator.mult(n, paramArrayOfint3[paramInt2 - 1]);
        paramArrayOfint2[b1] = GFCalculator.mult(n, paramArrayOfint2[b1]);
      } 
    } 
    computeRadix(arrayOfInt1, arrayOfInt2, paramArrayOfint2, paramInt3, paramInt4);
    byte b;
    for (b = 0; b < paramInt2 - 1; b++) {
      arrayOfInt3[b] = GFCalculator.mult(paramArrayOfint3[b], GFCalculator.inverse(paramArrayOfint3[paramInt2 - 1]));
      arrayOfInt4[b] = GFCalculator.mult(arrayOfInt3[b], arrayOfInt3[b]) ^ arrayOfInt3[b];
    } 
    computeSubsetSum(arrayOfInt5, arrayOfInt3, paramInt2 - 1);
    computeFFTRec(arrayOfInt6, arrayOfInt1, (paramInt1 + 1) / 2, paramInt2 - 1, paramInt3 - 1, arrayOfInt4, paramInt4, paramInt5);
    k = 1;
    k <<= paramInt2 - 1 & 0xF;
    if (paramInt1 <= 3) {
      paramArrayOfint1[0] = arrayOfInt6[0];
      paramArrayOfint1[k] = arrayOfInt6[0] ^ arrayOfInt2[0];
      for (b = 1; b < k; b++) {
        paramArrayOfint1[b] = arrayOfInt6[b] ^ GFCalculator.mult(arrayOfInt5[b], arrayOfInt2[0]);
        paramArrayOfint1[k + b] = paramArrayOfint1[b] ^ arrayOfInt2[0];
      } 
    } else {
      computeFFTRec(arrayOfInt7, arrayOfInt2, paramInt1 / 2, paramInt2 - 1, paramInt3 - 1, arrayOfInt4, paramInt4, paramInt5);
      System.arraycopy(arrayOfInt7, 0, paramArrayOfint1, k, k);
      paramArrayOfint1[0] = arrayOfInt6[0];
      paramArrayOfint1[k] = paramArrayOfint1[k] ^ arrayOfInt6[0];
      for (b = 1; b < k; b++) {
        paramArrayOfint1[b] = arrayOfInt6[b] ^ GFCalculator.mult(arrayOfInt5[b], arrayOfInt7[b]);
        paramArrayOfint1[k + b] = paramArrayOfint1[k + b] ^ paramArrayOfint1[b];
      } 
    } 
  }
  
  static void fastFourierTransformGetError(byte[] paramArrayOfbyte, int[] paramArrayOfint1, int paramInt, int[] paramArrayOfint2) {
    byte b1 = 8;
    char c = 'ÿ';
    int[] arrayOfInt1 = new int[b1 - 1];
    int[] arrayOfInt2 = new int[paramInt];
    int i = paramInt;
    computeFFTBetas(arrayOfInt1, b1);
    computeSubsetSum(arrayOfInt2, arrayOfInt1, b1 - 1);
    paramArrayOfbyte[0] = (byte)(paramArrayOfbyte[0] ^ 0x1 ^ Utils.toUnsigned16Bits(-paramArrayOfint1[0] >> 15));
    paramArrayOfbyte[0] = (byte)(paramArrayOfbyte[0] ^ 0x1 ^ Utils.toUnsigned16Bits(-paramArrayOfint1[i] >> 15));
    for (byte b2 = 1; b2 < i; b2++) {
      int j = c - paramArrayOfint2[arrayOfInt2[b2]];
      paramArrayOfbyte[j] = (byte)(paramArrayOfbyte[j] ^ 0x1 ^ Math.abs(-paramArrayOfint1[b2] >> 15));
      j = c - paramArrayOfint2[arrayOfInt2[b2] ^ 0x1];
      paramArrayOfbyte[j] = (byte)(paramArrayOfbyte[j] ^ 0x1 ^ Math.abs(-paramArrayOfint1[i + b2] >> 15));
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\hqc\FastFourierTransform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */