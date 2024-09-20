package org.bouncycastle.pqc.crypto.falcon;

class FalconCommon {
  static final int[] l2bound = new int[] { 
      0, 101498, 208714, 428865, 892039, 1852696, 3842630, 7959734, 16468416, 34034726, 
      70265242 };
  
  void hash_to_point_vartime(SHAKE256 paramSHAKE256, short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    int i = 1 << paramInt2;
    while (i > 0) {
      byte[] arrayOfByte = new byte[2];
      paramSHAKE256.inner_shake256_extract(arrayOfByte, 0, 2);
      int j = (arrayOfByte[0] & 0xFF) << 8 | arrayOfByte[1] & 0xFF;
      if (j < 61445) {
        while (j >= 12289)
          j -= 12289; 
        paramArrayOfshort[paramInt1++] = (short)j;
        i--;
      } 
    } 
  }
  
  void hash_to_point_ct(SHAKE256 paramSHAKE256, short[] paramArrayOfshort1, int paramInt1, int paramInt2, short[] paramArrayOfshort2, int paramInt3) {
    short[] arrayOfShort1 = { 
        0, 65, 67, 71, 77, 86, 100, 122, 154, 205, 
        287 };
    short[] arrayOfShort2 = new short[63];
    int i = 1 << paramInt2;
    int j = i << 1;
    short s = arrayOfShort1[paramInt2];
    int k = i + s;
    int n = paramInt3;
    byte b;
    for (b = 0; b < k; b++) {
      byte[] arrayOfByte = new byte[2];
      paramSHAKE256.inner_shake256_extract(arrayOfByte, 0, arrayOfByte.length);
      int i1 = (arrayOfByte[0] & 0xFF) << 8 | arrayOfByte[1] & 0xFF;
      int i2 = i1 - (0x6002 & (i1 - 24578 >>> 31) - 1);
      i2 -= 0x6002 & (i2 - 24578 >>> 31) - 1;
      i2 -= 0x3001 & (i2 - 12289 >>> 31) - 1;
      i2 |= (i1 - 61445 >>> 31) - 1;
      if (b < i) {
        paramArrayOfshort1[paramInt1 + b] = (short)i2;
      } else if (b < j) {
        paramArrayOfshort2[n + b - i] = (short)i2;
      } else {
        arrayOfShort2[b - j] = (short)i2;
      } 
    } 
    int m;
    for (m = 1; m <= s; m <<= 1) {
      int i1 = 0;
      for (b = 0; b < k; b++) {
        int i2;
        byte b1;
        short s1;
        if (b < i) {
          b1 = 1;
          i2 = paramInt1 + b;
          s1 = paramArrayOfshort1[i2];
        } else if (b < j) {
          b1 = 2;
          i2 = n + b - i;
          s1 = paramArrayOfshort2[i2];
        } else {
          b1 = 3;
          i2 = b - j;
          s1 = arrayOfShort2[i2];
        } 
        int i3 = b - i1;
        int i4 = (s1 >>> 15) - 1;
        i1 -= i4;
        if (b >= m) {
          int i5;
          byte b2;
          short s2;
          if (b - m < i) {
            b2 = 1;
            i5 = paramInt1 + b - m;
            s2 = paramArrayOfshort1[i5];
          } else if (b - m < j) {
            b2 = 2;
            i5 = n + b - m - i;
            s2 = paramArrayOfshort2[i5];
          } else {
            b2 = 3;
            i5 = b - m - j;
            s2 = arrayOfShort2[i5];
          } 
          i4 &= -((i3 & m) + 511 >> 9);
          if (b1 == 1) {
            paramArrayOfshort1[i2] = (short)(s1 ^ i4 & (s1 ^ s2));
          } else if (b1 == 2) {
            paramArrayOfshort2[i2] = (short)(s1 ^ i4 & (s1 ^ s2));
          } else {
            arrayOfShort2[i2] = (short)(s1 ^ i4 & (s1 ^ s2));
          } 
          if (b2 == 1) {
            paramArrayOfshort1[i5] = (short)(s2 ^ i4 & (s1 ^ s2));
          } else if (b2 == 2) {
            paramArrayOfshort2[i5] = (short)(s2 ^ i4 & (s1 ^ s2));
          } else {
            arrayOfShort2[i5] = (short)(s2 ^ i4 & (s1 ^ s2));
          } 
        } 
      } 
    } 
  }
  
  int is_short(short[] paramArrayOfshort1, int paramInt1, short[] paramArrayOfshort2, int paramInt2, int paramInt3) {
    int i = 1 << paramInt3;
    int j = 0;
    int k = 0;
    for (byte b = 0; b < i; b++) {
      short s = paramArrayOfshort1[paramInt1 + b];
      j += s * s;
      k |= j;
      s = paramArrayOfshort2[paramInt2 + b];
      j += s * s;
      k |= j;
    } 
    j |= -(k >>> 31);
    return ((j & 0xFFFFFFFFL) <= l2bound[paramInt3]) ? 1 : 0;
  }
  
  int is_short_half(int paramInt1, short[] paramArrayOfshort, int paramInt2, int paramInt3) {
    int i = 1 << paramInt3;
    int j = -(paramInt1 >>> 31);
    for (byte b = 0; b < i; b++) {
      short s = paramArrayOfshort[paramInt2 + b];
      paramInt1 += s * s;
      j |= paramInt1;
    } 
    paramInt1 |= -(j >>> 31);
    return ((paramInt1 & 0xFFFFFFFFL) <= l2bound[paramInt3]) ? 1 : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\FalconCommon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */