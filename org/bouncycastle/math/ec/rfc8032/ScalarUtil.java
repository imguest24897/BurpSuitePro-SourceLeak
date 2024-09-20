package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.util.Integers;

abstract class ScalarUtil {
  private static final long M = 4294967295L;
  
  static void addShifted_NP(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int[] paramArrayOfint4) {
    long l1 = 0L;
    long l2 = 0L;
    if (paramInt2 == 0) {
      for (byte b = 0; b <= paramInt1; b++) {
        int i = paramArrayOfint3[b];
        l2 += paramArrayOfint1[b] & 0xFFFFFFFFL;
        l2 += i & 0xFFFFFFFFL;
        l1 += i & 0xFFFFFFFFL;
        l1 += paramArrayOfint2[b] & 0xFFFFFFFFL;
        i = (int)l1;
        l1 >>>= 32L;
        paramArrayOfint3[b] = i;
        l2 += i & 0xFFFFFFFFL;
        paramArrayOfint1[b] = (int)l2;
        l2 >>>= 32L;
      } 
    } else if (paramInt2 < 32) {
      int i = 0;
      int j = 0;
      int k = 0;
      for (byte b = 0; b <= paramInt1; b++) {
        int m = paramArrayOfint3[b];
        int n = m << paramInt2 | i >>> -paramInt2;
        i = m;
        l2 += paramArrayOfint1[b] & 0xFFFFFFFFL;
        l2 += n & 0xFFFFFFFFL;
        int i1 = paramArrayOfint2[b];
        int i2 = i1 << paramInt2 | k >>> -paramInt2;
        k = i1;
        l1 += m & 0xFFFFFFFFL;
        l1 += i2 & 0xFFFFFFFFL;
        m = (int)l1;
        l1 >>>= 32L;
        paramArrayOfint3[b] = m;
        int i3 = m << paramInt2 | j >>> -paramInt2;
        j = m;
        l2 += i3 & 0xFFFFFFFFL;
        paramArrayOfint1[b] = (int)l2;
        l2 >>>= 32L;
      } 
    } else {
      System.arraycopy(paramArrayOfint3, 0, paramArrayOfint4, 0, paramInt1);
      int i = paramInt2 >>> 5;
      int j = paramInt2 & 0x1F;
      if (j == 0) {
        for (int k = i; k <= paramInt1; k++) {
          l2 += paramArrayOfint1[k] & 0xFFFFFFFFL;
          l2 += paramArrayOfint4[k - i] & 0xFFFFFFFFL;
          l1 += paramArrayOfint3[k] & 0xFFFFFFFFL;
          l1 += paramArrayOfint2[k - i] & 0xFFFFFFFFL;
          paramArrayOfint3[k] = (int)l1;
          l1 >>>= 32L;
          l2 += paramArrayOfint3[k - i] & 0xFFFFFFFFL;
          paramArrayOfint1[k] = (int)l2;
          l2 >>>= 32L;
        } 
      } else {
        int k = 0;
        int m = 0;
        int n = 0;
        for (int i1 = i; i1 <= paramInt1; i1++) {
          int i2 = paramArrayOfint4[i1 - i];
          int i3 = i2 << j | k >>> -j;
          k = i2;
          l2 += paramArrayOfint1[i1] & 0xFFFFFFFFL;
          l2 += i3 & 0xFFFFFFFFL;
          int i4 = paramArrayOfint2[i1 - i];
          int i5 = i4 << j | n >>> -j;
          n = i4;
          l1 += paramArrayOfint3[i1] & 0xFFFFFFFFL;
          l1 += i5 & 0xFFFFFFFFL;
          paramArrayOfint3[i1] = (int)l1;
          l1 >>>= 32L;
          int i6 = paramArrayOfint3[i1 - i];
          int i7 = i6 << j | m >>> -j;
          m = i6;
          l2 += i7 & 0xFFFFFFFFL;
          paramArrayOfint1[i1] = (int)l2;
          l2 >>>= 32L;
        } 
      } 
    } 
  }
  
  static void addShifted_UV(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int[] paramArrayOfint4) {
    int i = paramInt2 >>> 5;
    int j = paramInt2 & 0x1F;
    long l1 = 0L;
    long l2 = 0L;
    if (j == 0) {
      for (int k = i; k <= paramInt1; k++) {
        l1 += paramArrayOfint1[k] & 0xFFFFFFFFL;
        l2 += paramArrayOfint2[k] & 0xFFFFFFFFL;
        l1 += paramArrayOfint3[k - i] & 0xFFFFFFFFL;
        l2 += paramArrayOfint4[k - i] & 0xFFFFFFFFL;
        paramArrayOfint1[k] = (int)l1;
        l1 >>>= 32L;
        paramArrayOfint2[k] = (int)l2;
        l2 >>>= 32L;
      } 
    } else {
      int k = 0;
      int m = 0;
      for (int n = i; n <= paramInt1; n++) {
        int i1 = paramArrayOfint3[n - i];
        int i2 = paramArrayOfint4[n - i];
        int i3 = i1 << j | k >>> -j;
        int i4 = i2 << j | m >>> -j;
        k = i1;
        m = i2;
        l1 += paramArrayOfint1[n] & 0xFFFFFFFFL;
        l2 += paramArrayOfint2[n] & 0xFFFFFFFFL;
        l1 += i3 & 0xFFFFFFFFL;
        l2 += i4 & 0xFFFFFFFFL;
        paramArrayOfint1[n] = (int)l1;
        l1 >>>= 32L;
        paramArrayOfint2[n] = (int)l2;
        l2 >>>= 32L;
      } 
    } 
  }
  
  static int getBitLength(int paramInt, int[] paramArrayOfint) {
    int i = paramInt;
    int j = paramArrayOfint[i] >> 31;
    while (i > 0 && paramArrayOfint[i] == j)
      i--; 
    return i * 32 + 32 - Integers.numberOfLeadingZeros(paramArrayOfint[i] ^ j);
  }
  
  static int getBitLengthPositive(int paramInt, int[] paramArrayOfint) {
    int i;
    for (i = paramInt; i > 0 && paramArrayOfint[i] == 0; i--);
    return i * 32 + 32 - Integers.numberOfLeadingZeros(paramArrayOfint[i]);
  }
  
  static boolean lessThan(int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int i = paramInt;
    while (true) {
      int j = paramArrayOfint1[i] + Integer.MIN_VALUE;
      int k = paramArrayOfint2[i] + Integer.MIN_VALUE;
      if (j < k)
        return true; 
      if (j > k)
        return false; 
      if (--i < 0)
        return false; 
    } 
  }
  
  static void subShifted_NP(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int[] paramArrayOfint4) {
    long l1 = 0L;
    long l2 = 0L;
    if (paramInt2 == 0) {
      for (byte b = 0; b <= paramInt1; b++) {
        int i = paramArrayOfint3[b];
        l2 += paramArrayOfint1[b] & 0xFFFFFFFFL;
        l2 -= i & 0xFFFFFFFFL;
        l1 += i & 0xFFFFFFFFL;
        l1 -= paramArrayOfint2[b] & 0xFFFFFFFFL;
        i = (int)l1;
        l1 >>= 32L;
        paramArrayOfint3[b] = i;
        l2 -= i & 0xFFFFFFFFL;
        paramArrayOfint1[b] = (int)l2;
        l2 >>= 32L;
      } 
    } else if (paramInt2 < 32) {
      int i = 0;
      int j = 0;
      int k = 0;
      for (byte b = 0; b <= paramInt1; b++) {
        int m = paramArrayOfint3[b];
        int n = m << paramInt2 | i >>> -paramInt2;
        i = m;
        l2 += paramArrayOfint1[b] & 0xFFFFFFFFL;
        l2 -= n & 0xFFFFFFFFL;
        int i1 = paramArrayOfint2[b];
        int i2 = i1 << paramInt2 | k >>> -paramInt2;
        k = i1;
        l1 += m & 0xFFFFFFFFL;
        l1 -= i2 & 0xFFFFFFFFL;
        m = (int)l1;
        l1 >>= 32L;
        paramArrayOfint3[b] = m;
        int i3 = m << paramInt2 | j >>> -paramInt2;
        j = m;
        l2 -= i3 & 0xFFFFFFFFL;
        paramArrayOfint1[b] = (int)l2;
        l2 >>= 32L;
      } 
    } else {
      System.arraycopy(paramArrayOfint3, 0, paramArrayOfint4, 0, paramInt1);
      int i = paramInt2 >>> 5;
      int j = paramInt2 & 0x1F;
      if (j == 0) {
        for (int k = i; k <= paramInt1; k++) {
          l2 += paramArrayOfint1[k] & 0xFFFFFFFFL;
          l2 -= paramArrayOfint4[k - i] & 0xFFFFFFFFL;
          l1 += paramArrayOfint3[k] & 0xFFFFFFFFL;
          l1 -= paramArrayOfint2[k - i] & 0xFFFFFFFFL;
          paramArrayOfint3[k] = (int)l1;
          l1 >>= 32L;
          l2 -= paramArrayOfint3[k - i] & 0xFFFFFFFFL;
          paramArrayOfint1[k] = (int)l2;
          l2 >>= 32L;
        } 
      } else {
        int k = 0;
        int m = 0;
        int n = 0;
        for (int i1 = i; i1 <= paramInt1; i1++) {
          int i2 = paramArrayOfint4[i1 - i];
          int i3 = i2 << j | k >>> -j;
          k = i2;
          l2 += paramArrayOfint1[i1] & 0xFFFFFFFFL;
          l2 -= i3 & 0xFFFFFFFFL;
          int i4 = paramArrayOfint2[i1 - i];
          int i5 = i4 << j | n >>> -j;
          n = i4;
          l1 += paramArrayOfint3[i1] & 0xFFFFFFFFL;
          l1 -= i5 & 0xFFFFFFFFL;
          paramArrayOfint3[i1] = (int)l1;
          l1 >>= 32L;
          int i6 = paramArrayOfint3[i1 - i];
          int i7 = i6 << j | m >>> -j;
          m = i6;
          l2 -= i7 & 0xFFFFFFFFL;
          paramArrayOfint1[i1] = (int)l2;
          l2 >>= 32L;
        } 
      } 
    } 
  }
  
  static void subShifted_UV(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int[] paramArrayOfint4) {
    int i = paramInt2 >>> 5;
    int j = paramInt2 & 0x1F;
    long l1 = 0L;
    long l2 = 0L;
    if (j == 0) {
      for (int k = i; k <= paramInt1; k++) {
        l1 += paramArrayOfint1[k] & 0xFFFFFFFFL;
        l2 += paramArrayOfint2[k] & 0xFFFFFFFFL;
        l1 -= paramArrayOfint3[k - i] & 0xFFFFFFFFL;
        l2 -= paramArrayOfint4[k - i] & 0xFFFFFFFFL;
        paramArrayOfint1[k] = (int)l1;
        l1 >>= 32L;
        paramArrayOfint2[k] = (int)l2;
        l2 >>= 32L;
      } 
    } else {
      int k = 0;
      int m = 0;
      for (int n = i; n <= paramInt1; n++) {
        int i1 = paramArrayOfint3[n - i];
        int i2 = paramArrayOfint4[n - i];
        int i3 = i1 << j | k >>> -j;
        int i4 = i2 << j | m >>> -j;
        k = i1;
        m = i2;
        l1 += paramArrayOfint1[n] & 0xFFFFFFFFL;
        l2 += paramArrayOfint2[n] & 0xFFFFFFFFL;
        l1 -= i3 & 0xFFFFFFFFL;
        l2 -= i4 & 0xFFFFFFFFL;
        paramArrayOfint1[n] = (int)l1;
        l1 >>= 32L;
        paramArrayOfint2[n] = (int)l2;
        l2 >>= 32L;
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\rfc8032\ScalarUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */