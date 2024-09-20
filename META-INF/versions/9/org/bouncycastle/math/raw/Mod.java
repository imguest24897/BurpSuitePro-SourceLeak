package META-INF.versions.9.org.bouncycastle.math.raw;

import java.util.Random;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Integers;

public abstract class Mod {
  private static final int M30 = 1073741823;
  
  private static final long M32L = 4294967295L;
  
  public static void checkedModOddInverse(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    if (0 == modOddInverse(paramArrayOfint1, paramArrayOfint2, paramArrayOfint3))
      throw new ArithmeticException("Inverse does not exist."); 
  }
  
  public static void checkedModOddInverseVar(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    if (!modOddInverseVar(paramArrayOfint1, paramArrayOfint2, paramArrayOfint3))
      throw new ArithmeticException("Inverse does not exist."); 
  }
  
  public static int inverse32(int paramInt) {
    int i = paramInt;
    i *= 2 - paramInt * i;
    i *= 2 - paramInt * i;
    i *= 2 - paramInt * i;
    i *= 2 - paramInt * i;
    return i;
  }
  
  public static int modOddInverse(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int i = paramArrayOfint1.length;
    int j = (i << 5) - Integers.numberOfLeadingZeros(paramArrayOfint1[i - 1]);
    int k = (j + 29) / 30;
    int[] arrayOfInt1 = new int[4];
    int[] arrayOfInt2 = new int[k];
    int[] arrayOfInt3 = new int[k];
    int[] arrayOfInt4 = new int[k];
    int[] arrayOfInt5 = new int[k];
    int[] arrayOfInt6 = new int[k];
    arrayOfInt3[0] = 1;
    encode30(j, paramArrayOfint2, arrayOfInt5);
    encode30(j, paramArrayOfint1, arrayOfInt6);
    System.arraycopy(arrayOfInt6, 0, arrayOfInt4, 0, k);
    int m = 0;
    int n = inverse32(arrayOfInt6[0]);
    int i1 = getMaximumHDDivsteps(j);
    int i2;
    for (i2 = 0; i2 < i1; i2 += 30) {
      m = hddivsteps30(m, arrayOfInt4[0], arrayOfInt5[0], arrayOfInt1);
      updateDE30(k, arrayOfInt2, arrayOfInt3, arrayOfInt1, n, arrayOfInt6);
      updateFG30(k, arrayOfInt4, arrayOfInt5, arrayOfInt1);
    } 
    i2 = arrayOfInt4[k - 1] >> 31;
    cnegate30(k, i2, arrayOfInt4);
    cnormalize30(k, i2, arrayOfInt2, arrayOfInt6);
    decode30(j, arrayOfInt2, paramArrayOfint3);
    return equalTo(k, arrayOfInt4, 1) & equalTo(k, arrayOfInt5, 0);
  }
  
  public static boolean modOddInverseVar(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int i = paramArrayOfint1.length;
    int j = (i << 5) - Integers.numberOfLeadingZeros(paramArrayOfint1[i - 1]);
    int k = (j + 29) / 30;
    int m = j - Nat.getBitLength(i, paramArrayOfint2);
    int[] arrayOfInt1 = new int[4];
    int[] arrayOfInt2 = new int[k];
    int[] arrayOfInt3 = new int[k];
    int[] arrayOfInt4 = new int[k];
    int[] arrayOfInt5 = new int[k];
    int[] arrayOfInt6 = new int[k];
    arrayOfInt3[0] = 1;
    encode30(j, paramArrayOfint2, arrayOfInt5);
    encode30(j, paramArrayOfint1, arrayOfInt6);
    System.arraycopy(arrayOfInt6, 0, arrayOfInt4, 0, k);
    int n = -m;
    int i1 = k;
    int i2 = k;
    int i3 = inverse32(arrayOfInt6[0]);
    int i4 = getMaximumDivsteps(j);
    int i5 = m;
    while (!equalToVar(i2, arrayOfInt5, 0)) {
      if (i5 >= i4)
        return false; 
      i5 += 30;
      n = divsteps30Var(n, arrayOfInt4[0], arrayOfInt5[0], arrayOfInt1);
      updateDE30(i1, arrayOfInt2, arrayOfInt3, arrayOfInt1, i3, arrayOfInt6);
      updateFG30(i2, arrayOfInt4, arrayOfInt5, arrayOfInt1);
      i2 = trimFG30(i2, arrayOfInt4, arrayOfInt5);
    } 
    int i6 = arrayOfInt4[i2 - 1] >> 31;
    int i7 = arrayOfInt2[i1 - 1] >> 31;
    if (i7 < 0)
      i7 = add30(i1, arrayOfInt2, arrayOfInt6); 
    if (i6 < 0) {
      i7 = negate30(i1, arrayOfInt2);
      i6 = negate30(i2, arrayOfInt4);
    } 
    if (!equalToVar(i2, arrayOfInt4, 1))
      return false; 
    if (i7 < 0)
      i7 = add30(i1, arrayOfInt2, arrayOfInt6); 
    decode30(j, arrayOfInt2, paramArrayOfint3);
    return true;
  }
  
  public static int modOddIsCoprime(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int i = paramArrayOfint1.length;
    int j = (i << 5) - Integers.numberOfLeadingZeros(paramArrayOfint1[i - 1]);
    int k = (j + 29) / 30;
    int[] arrayOfInt1 = new int[4];
    int[] arrayOfInt2 = new int[k];
    int[] arrayOfInt3 = new int[k];
    int[] arrayOfInt4 = new int[k];
    encode30(j, paramArrayOfint2, arrayOfInt3);
    encode30(j, paramArrayOfint1, arrayOfInt4);
    System.arraycopy(arrayOfInt4, 0, arrayOfInt2, 0, k);
    int m = 0;
    int n = getMaximumHDDivsteps(j);
    int i1;
    for (i1 = 0; i1 < n; i1 += 30) {
      m = hddivsteps30(m, arrayOfInt2[0], arrayOfInt3[0], arrayOfInt1);
      updateFG30(k, arrayOfInt2, arrayOfInt3, arrayOfInt1);
    } 
    i1 = arrayOfInt2[k - 1] >> 31;
    cnegate30(k, i1, arrayOfInt2);
    return equalTo(k, arrayOfInt2, 1) & equalTo(k, arrayOfInt3, 0);
  }
  
  public static boolean modOddIsCoprimeVar(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int i = paramArrayOfint1.length;
    int j = (i << 5) - Integers.numberOfLeadingZeros(paramArrayOfint1[i - 1]);
    int k = (j + 29) / 30;
    int m = j - Nat.getBitLength(i, paramArrayOfint2);
    int[] arrayOfInt1 = new int[4];
    int[] arrayOfInt2 = new int[k];
    int[] arrayOfInt3 = new int[k];
    int[] arrayOfInt4 = new int[k];
    encode30(j, paramArrayOfint2, arrayOfInt3);
    encode30(j, paramArrayOfint1, arrayOfInt4);
    System.arraycopy(arrayOfInt4, 0, arrayOfInt2, 0, k);
    int n = -m;
    int i1 = k;
    int i2 = getMaximumDivsteps(j);
    int i3 = m;
    while (!equalToVar(i1, arrayOfInt3, 0)) {
      if (i3 >= i2)
        return false; 
      i3 += 30;
      n = divsteps30Var(n, arrayOfInt2[0], arrayOfInt3[0], arrayOfInt1);
      updateFG30(i1, arrayOfInt2, arrayOfInt3, arrayOfInt1);
      i1 = trimFG30(i1, arrayOfInt2, arrayOfInt3);
    } 
    int i4 = arrayOfInt2[i1 - 1] >> 31;
    if (i4 < 0)
      i4 = negate30(i1, arrayOfInt2); 
    return equalToVar(i1, arrayOfInt2, 1);
  }
  
  public static int[] random(int[] paramArrayOfint) {
    int i = paramArrayOfint.length;
    Random random = new Random();
    int[] arrayOfInt = Nat.create(i);
    int j = paramArrayOfint[i - 1];
    j |= j >>> 1;
    j |= j >>> 2;
    j |= j >>> 4;
    j |= j >>> 8;
    j |= j >>> 16;
    while (true) {
      for (int k = 0; k != i; k++)
        arrayOfInt[k] = random.nextInt(); 
      arrayOfInt[i - 1] = arrayOfInt[i - 1] & j;
      if (!Nat.gte(i, arrayOfInt, paramArrayOfint))
        return arrayOfInt; 
    } 
  }
  
  private static int add30(int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int i = 0;
    int j = paramInt - 1;
    for (byte b = 0; b < j; b++) {
      i += paramArrayOfint1[b] + paramArrayOfint2[b];
      paramArrayOfint1[b] = i & 0x3FFFFFFF;
      i >>= 30;
    } 
    i += paramArrayOfint1[j] + paramArrayOfint2[j];
    paramArrayOfint1[j] = i;
    i >>= 30;
    return i;
  }
  
  private static void cnegate30(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    int i = 0;
    int j = paramInt1 - 1;
    for (byte b = 0; b < j; b++) {
      i += (paramArrayOfint[b] ^ paramInt2) - paramInt2;
      paramArrayOfint[b] = i & 0x3FFFFFFF;
      i >>= 30;
    } 
    i += (paramArrayOfint[j] ^ paramInt2) - paramInt2;
    paramArrayOfint[j] = i;
  }
  
  private static void cnormalize30(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int i = paramInt1 - 1;
    int j = 0;
    int k = paramArrayOfint1[i] >> 31;
    int m;
    for (m = 0; m < i; m++) {
      int n = paramArrayOfint1[m] + (paramArrayOfint2[m] & k);
      n = (n ^ paramInt2) - paramInt2;
      j += n;
      paramArrayOfint1[m] = j & 0x3FFFFFFF;
      j >>= 30;
    } 
    m = paramArrayOfint1[i] + (paramArrayOfint2[i] & k);
    m = (m ^ paramInt2) - paramInt2;
    j += m;
    paramArrayOfint1[i] = j;
    j = 0;
    k = paramArrayOfint1[i] >> 31;
    for (m = 0; m < i; m++) {
      int n = paramArrayOfint1[m] + (paramArrayOfint2[m] & k);
      j += n;
      paramArrayOfint1[m] = j & 0x3FFFFFFF;
      j >>= 30;
    } 
    m = paramArrayOfint1[i] + (paramArrayOfint2[i] & k);
    j += m;
    paramArrayOfint1[i] = j;
  }
  
  private static void decode30(int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    byte b1 = 0;
    long l = 0L;
    byte b2 = 0;
    byte b3 = 0;
    while (paramInt > 0) {
      while (b1 < Math.min(32, paramInt)) {
        l |= paramArrayOfint1[b2++] << b1;
        b1 += 30;
      } 
      paramArrayOfint2[b3++] = (int)l;
      l >>>= 32L;
      b1 -= 32;
      paramInt -= 32;
    } 
  }
  
  private static int divsteps30Var(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    int i = 1;
    int j = 0;
    int k = 0;
    int m = 1;
    int n = paramInt2;
    int i1 = paramInt3;
    int i2 = 30;
    while (true) {
      int i3;
      int i4 = Integers.numberOfTrailingZeros(i1 | -1 << i2);
      i1 >>= i4;
      i <<= i4;
      j <<= i4;
      paramInt1 -= i4;
      i2 -= i4;
      if (i2 <= 0) {
        paramArrayOfint[0] = i;
        paramArrayOfint[1] = j;
        paramArrayOfint[2] = k;
        paramArrayOfint[3] = m;
        return paramInt1;
      } 
      if (paramInt1 <= 0) {
        paramInt1 = 2 - paramInt1;
        int i6 = n;
        n = i1;
        i1 = -i6;
        int i7 = i;
        i = k;
        k = -i7;
        int i8 = j;
        j = m;
        m = -i8;
        int i9 = (paramInt1 > i2) ? i2 : paramInt1;
        int i5 = -1 >>> 32 - i9 & 0x3F;
        i3 = n * i1 * (n * n - 2) & i5;
      } else {
        int i6 = (paramInt1 > i2) ? i2 : paramInt1;
        int i5 = -1 >>> 32 - i6 & 0xF;
        i3 = n + ((n + 1 & 0x4) << 1);
        i3 = i3 * -i1 & i5;
      } 
      i1 += n * i3;
      k += i * i3;
      m += j * i3;
    } 
  }
  
  private static void encode30(int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    byte b1 = 0;
    long l = 0L;
    byte b2 = 0;
    byte b3 = 0;
    while (paramInt > 0) {
      if (b1 < Math.min(30, paramInt)) {
        l |= (paramArrayOfint1[b2++] & 0xFFFFFFFFL) << b1;
        b1 += 32;
      } 
      paramArrayOfint2[b3++] = (int)l & 0x3FFFFFFF;
      l >>>= 30L;
      b1 -= 30;
      paramInt -= 30;
    } 
  }
  
  private static int equalTo(int paramInt1, int[] paramArrayOfint, int paramInt2) {
    int i = paramArrayOfint[0] ^ paramInt2;
    for (byte b = 1; b < paramInt1; b++)
      i |= paramArrayOfint[b]; 
    i = i >>> 1 | i & 0x1;
    return i - 1 >> 31;
  }
  
  private static boolean equalToVar(int paramInt1, int[] paramArrayOfint, int paramInt2) {
    int i = paramArrayOfint[0] ^ paramInt2;
    if (i != 0)
      return false; 
    for (byte b = 1; b < paramInt1; b++)
      i |= paramArrayOfint[b]; 
    return (i == 0);
  }
  
  private static int getMaximumDivsteps(int paramInt) {
    return (int)(188898L * paramInt + ((paramInt < 46) ? 308405L : 181188L) >>> 16L);
  }
  
  private static int getMaximumHDDivsteps(int paramInt) {
    return (int)(150964L * paramInt + 99243L >>> 16L);
  }
  
  private static int hddivsteps30(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    int i = 1073741824;
    int j = 0;
    int k = 0;
    int m = 1073741824;
    int n = paramInt2;
    int i1 = paramInt3;
    for (byte b = 0; b < 30; b++) {
      int i2 = paramInt1 >> 31;
      int i3 = -(i1 & 0x1);
      int i4 = n ^ i2;
      int i5 = i ^ i2;
      int i6 = j ^ i2;
      i1 -= i4 & i3;
      k -= i5 & i3;
      m -= i6 & i3;
      int i7 = i3 & (i2 ^ 0xFFFFFFFF);
      paramInt1 = (paramInt1 ^ i7) + 1;
      n += i1 & i7;
      i += k & i7;
      j += m & i7;
      i1 >>= 1;
      k >>= 1;
      m >>= 1;
    } 
    paramArrayOfint[0] = i;
    paramArrayOfint[1] = j;
    paramArrayOfint[2] = k;
    paramArrayOfint[3] = m;
    return paramInt1;
  }
  
  private static int negate30(int paramInt, int[] paramArrayOfint) {
    int i = 0;
    int j = paramInt - 1;
    for (byte b = 0; b < j; b++) {
      i -= paramArrayOfint[b];
      paramArrayOfint[b] = i & 0x3FFFFFFF;
      i >>= 30;
    } 
    i -= paramArrayOfint[j];
    paramArrayOfint[j] = i;
    i >>= 30;
    return i;
  }
  
  private static int trimFG30(int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int i = paramArrayOfint1[paramInt - 1];
    int j = paramArrayOfint2[paramInt - 1];
    int k = paramInt - 2 >> 31;
    k |= i ^ i >> 31;
    k |= j ^ j >> 31;
    if (k == 0) {
      paramArrayOfint1[paramInt - 2] = paramArrayOfint1[paramInt - 2] | i << 30;
      paramArrayOfint2[paramInt - 2] = paramArrayOfint2[paramInt - 2] | j << 30;
      paramInt--;
    } 
    return paramInt;
  }
  
  private static void updateDE30(int paramInt1, int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int paramInt2, int[] paramArrayOfint4) {
    int i = paramArrayOfint3[0];
    int j = paramArrayOfint3[1];
    int k = paramArrayOfint3[2];
    int m = paramArrayOfint3[3];
    int i5 = paramArrayOfint1[paramInt1 - 1] >> 31;
    int i6 = paramArrayOfint2[paramInt1 - 1] >> 31;
    int i2 = (i & i5) + (j & i6);
    int i3 = (k & i5) + (m & i6);
    int i4 = paramArrayOfint4[0];
    int n = paramArrayOfint1[0];
    int i1 = paramArrayOfint2[0];
    long l1 = i * n + j * i1;
    long l2 = k * n + m * i1;
    i2 -= paramInt2 * (int)l1 + i2 & 0x3FFFFFFF;
    i3 -= paramInt2 * (int)l2 + i3 & 0x3FFFFFFF;
    l1 += i4 * i2;
    l2 += i4 * i3;
    l1 >>= 30L;
    l2 >>= 30L;
    for (byte b = 1; b < paramInt1; b++) {
      i4 = paramArrayOfint4[b];
      n = paramArrayOfint1[b];
      i1 = paramArrayOfint2[b];
      l1 += i * n + j * i1 + i4 * i2;
      l2 += k * n + m * i1 + i4 * i3;
      paramArrayOfint1[b - 1] = (int)l1 & 0x3FFFFFFF;
      l1 >>= 30L;
      paramArrayOfint2[b - 1] = (int)l2 & 0x3FFFFFFF;
      l2 >>= 30L;
    } 
    paramArrayOfint1[paramInt1 - 1] = (int)l1;
    paramArrayOfint2[paramInt1 - 1] = (int)l2;
  }
  
  private static void updateFG30(int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int i = paramArrayOfint3[0];
    int j = paramArrayOfint3[1];
    int k = paramArrayOfint3[2];
    int m = paramArrayOfint3[3];
    int n = paramArrayOfint1[0];
    int i1 = paramArrayOfint2[0];
    long l1 = i * n + j * i1;
    long l2 = k * n + m * i1;
    l1 >>= 30L;
    l2 >>= 30L;
    for (byte b = 1; b < paramInt; b++) {
      n = paramArrayOfint1[b];
      i1 = paramArrayOfint2[b];
      l1 += i * n + j * i1;
      l2 += k * n + m * i1;
      paramArrayOfint1[b - 1] = (int)l1 & 0x3FFFFFFF;
      l1 >>= 30L;
      paramArrayOfint2[b - 1] = (int)l2 & 0x3FFFFFFF;
      l2 >>= 30L;
    } 
    paramArrayOfint1[paramInt - 1] = (int)l1;
    paramArrayOfint2[paramInt - 1] = (int)l2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\raw\Mod.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */