package com.fasterxml.Zz;

import burp.Zbqc;
import burp.Zmuc;
import java.math.BigInteger;

class Zbs {
  public static final double ZG;
  
  public static final double ZE;
  
  private static volatile Zh[] Zh;
  
  private static volatile Zh[] Zy;
  
  static final boolean Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static int ZF(int paramInt) {
    try {
      if (paramInt <= 9728)
        return 19; 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (paramInt <= 18432)
        return 18; 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (paramInt <= 69632)
        return 17; 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (paramInt <= 262144)
        return 16; 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (paramInt <= 983040)
        return 15; 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (paramInt <= 3670016)
        return 14; 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (paramInt <= 13631488)
        return 13; 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (paramInt <= 25165824)
        return 12; 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (paramInt <= 92274688)
        return 11; 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (paramInt <= 335544320)
        return 10; 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (paramInt <= 1207959552)
        return 9; 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    return 8;
  }
  
  private static Zh Ze(int paramInt) {
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    if (paramInt == 1) {
      Zh zh1 = new Zh(1);
      zh1.ZI(0, 1.0D);
      zh1.ZS(0, 0.0D);
      return zh1;
    } 
    Zh zh = new Zh(paramInt);
    zh.Zt(0, 1.0D, 0.0D);
    double d1 = ZG;
    double d2 = ZE;
    zh.Zt(paramInt / 2, d1, d2);
    double d3 = 1.5707963267948966D / paramInt;
    byte b = 1;
    while (b < paramInt / 2) {
      double d = d3 * b;
      d1 = Math.cos(d);
      d2 = Math.sin(d);
      zh.Zt(b, d1, d2);
      zh.Zt(paramInt - b, d2, d1);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return zh;
  }
  
  private static void ZF(Zh paramZh, Zh[] paramArrayOfZh) {
    int i = Zh.ZI(paramZh);
    int j = 31 - Integer.numberOfLeadingZeros(i);
    Zbt zbt1 = new Zbt();
    Zbt zbt2 = new Zbt();
    Zbt zbt3 = new Zbt();
    Zbt zbt4 = new Zbt();
    Zbt zbt5 = new Zbt();
    Zbt zbt6 = new Zbt();
    int k = j;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    while (k >= 2) {
      Zh zh = paramArrayOfZh[k - 2];
      int m = 1 << k;
      int n = 0;
      while (n < i) {
        byte b = 0;
        while (b < m / 4) {
          zbt5.Zg(zh, b);
          zbt5.Zh(zbt6);
          int i1 = n + b;
          int i2 = n + b + m / 4;
          int i3 = n + b + m / 2;
          int i4 = n + b + m * 3 / 4;
          paramZh.ZY(i1, paramZh, i2, zbt1);
          zbt1.ZT(paramZh, i3);
          zbt1.ZT(paramZh, i4);
          paramZh.Zh(i1, paramZh, i2, zbt2);
          zbt2.Zp(paramZh, i3);
          zbt2.ZB(paramZh, i4);
          zbt2.ZN(zbt5);
          paramZh.ZE(i1, paramZh, i2, zbt3);
          zbt3.ZT(paramZh, i3);
          zbt3.Zp(paramZh, i4);
          zbt3.ZN(zbt6);
          paramZh.Zk(i1, paramZh, i2, zbt4);
          zbt4.Zp(paramZh, i3);
          zbt4.Zl(paramZh, i4);
          zbt4.ZS(zbt5);
          zbt1.ZY(paramZh, i1);
          zbt2.ZY(paramZh, i2);
          zbt3.ZY(paramZh, i3);
          zbt4.ZY(paramZh, i4);
          b++;
          if (arrayOfZbqc != null)
            break; 
        } 
        n += m;
        if (arrayOfZbqc != null)
          break; 
      } 
      k -= 2;
      if (arrayOfZbqc != null)
        break; 
    } 
    if (k > 0) {
      byte b = 0;
      while (b < i) {
        paramZh.Zo(b, zbt1);
        paramZh.Zo(b + 1, zbt2);
        paramZh.ZY(b, zbt2);
        zbt1.Za(zbt2, paramZh, b + 1);
        b += 2;
        if (arrayOfZbqc != null)
          break; 
      } 
    } 
  }
  
  private static void Zk(Zh paramZh1, Zh paramZh2, Zh paramZh3, int paramInt, double paramDouble) {
    double d = paramInt * -0.5D * Math.sqrt(3.0D);
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    byte b = 0;
    while (b < Zh.ZI(paramZh1)) {
      double d1 = paramZh1.Zl(b) + paramZh2.Zl(b) + paramZh3.Zl(b);
      double d2 = paramZh1.ZF(b) + paramZh2.ZF(b) + paramZh3.ZF(b);
      double d3 = d * (paramZh3.ZF(b) - paramZh2.ZF(b));
      double d4 = d * (paramZh2.Zl(b) - paramZh3.Zl(b));
      double d5 = 0.5D * (paramZh2.Zl(b) + paramZh3.Zl(b));
      double d6 = 0.5D * (paramZh2.ZF(b) + paramZh3.ZF(b));
      double d7 = paramZh1.Zl(b) - d5 + d3;
      double d8 = paramZh1.ZF(b) + d4 - d6;
      double d9 = paramZh1.Zl(b) - d5 - d3;
      double d10 = paramZh1.ZF(b) - d4 - d6;
      paramZh1.ZI(b, d1 * paramDouble);
      paramZh1.ZS(b, d2 * paramDouble);
      paramZh2.ZI(b, d7 * paramDouble);
      paramZh2.ZS(b, d8 * paramDouble);
      paramZh3.ZI(b, d9 * paramDouble);
      paramZh3.ZS(b, d10 * paramDouble);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private static void Zo(Zh paramZh1, Zh[] paramArrayOfZh, Zh paramZh2) {
    int i = Zh.ZI(paramZh1) / 3;
    Zh zh1 = new Zh(paramZh1, 0, i);
    Zh zh2 = new Zh(paramZh1, i, i * 2);
    Zh zh3 = new Zh(paramZh1, i * 2, Zh.ZI(paramZh1));
    Zk(zh1, zh2, zh3, 1, 1.0D);
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    Zbt zbt = new Zbt();
    int j = 0;
    while (j < Zh.ZI(paramZh1) / 4) {
      zbt.Zg(paramZh2, j);
      zh2.Zg(j, zbt);
      zh3.Zg(j, zbt);
      zh3.Zg(j, zbt);
      j++;
      if (arrayOfZbqc != null)
        break; 
    } 
    j = Zh.ZI(paramZh1) / 4;
    while (j < i) {
      zbt.Zg(paramZh2, j - Zh.ZI(paramZh1) / 4);
      zh2.Zy(j, zbt);
      zh3.Zy(j, zbt);
      zh3.Zy(j, zbt);
      j++;
      if (arrayOfZbqc != null)
        break; 
    } 
    ZF(zh1, paramArrayOfZh);
    ZF(zh2, paramArrayOfZh);
    ZF(zh3, paramArrayOfZh);
  }
  
  static BigInteger Zv(Zh paramZh, int paramInt1, int paramInt2) {
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    try {
      if (!Za)
        try {
          if (paramInt2 > 25)
            throw new AssertionError(paramInt2 + a(-6425, 497)); 
        } catch (ArithmeticException arithmeticException) {
          throw a(null);
        }  
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    int i = (int)Math.min(Zh.ZI(paramZh), 2147483648L / paramInt2 + 1L);
    int j = (int)(8L * (i * paramInt2 + 31L) / 32L);
    byte[] arrayOfByte = new byte[j];
    int k = 1 << paramInt2;
    int m = k - 1;
    int n = 32 - paramInt2;
    long l = 0L;
    int i1 = arrayOfByte.length * 8;
    int i2 = i1 - paramInt2;
    int i3 = 0;
    int i4 = Math.min(Math.max(0, i2 >> 3), arrayOfByte.length - 4);
    byte b = 0;
    while (b <= 1) {
      byte b1 = 0;
      while (b1 < i) {
        long l1 = Math.round(paramZh.Zy(b1, b)) + l;
        l = l1 >> paramInt2;
        int i5 = Math.min(Math.max(0, i2 >> 3), arrayOfByte.length - 4);
        i3 >>>= i4 - i5 << 3;
        int i6 = n - i2 + (i5 << 3);
        i3 = (int)(i3 | (l1 & m) << i6);
        Zb.Zd(arrayOfByte, i5, i3);
        i4 = i5;
        i2 -= paramInt2;
        b1++;
        if (arrayOfZbqc != null)
          break; 
      } 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return new BigInteger(paramInt1, arrayOfByte);
  }
  
  private static Zh[] ZL(int paramInt) {
    // Byte code:
    //   0: iload_0
    //   1: iconst_1
    //   2: iadd
    //   3: anewarray com/fasterxml/Zz/Zh
    //   6: astore_2
    //   7: invokestatic ZA : ()[Lburp/Zbqc;
    //   10: iload_0
    //   11: istore_3
    //   12: astore_1
    //   13: iload_3
    //   14: iflt -> 91
    //   17: iload_3
    //   18: bipush #20
    //   20: if_icmpge -> 68
    //   23: getstatic com/fasterxml/Zz/Zbs.Zh : [Lcom/fasterxml/Zz/Zh;
    //   26: iload_3
    //   27: aaload
    //   28: ifnonnull -> 56
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   37: athrow
    //   38: getstatic com/fasterxml/Zz/Zbs.Zh : [Lcom/fasterxml/Zz/Zh;
    //   41: iload_3
    //   42: iconst_1
    //   43: iload_3
    //   44: ishl
    //   45: invokestatic Ze : (I)Lcom/fasterxml/Zz/Zh;
    //   48: aastore
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   55: athrow
    //   56: aload_2
    //   57: iload_3
    //   58: getstatic com/fasterxml/Zz/Zbs.Zh : [Lcom/fasterxml/Zz/Zh;
    //   61: iload_3
    //   62: aaload
    //   63: aastore
    //   64: aload_1
    //   65: ifnull -> 84
    //   68: aload_2
    //   69: iload_3
    //   70: iconst_1
    //   71: iload_3
    //   72: ishl
    //   73: invokestatic Ze : (I)Lcom/fasterxml/Zz/Zh;
    //   76: aastore
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   83: athrow
    //   84: iinc #3, -2
    //   87: aload_1
    //   88: ifnull -> 13
    //   91: aload_2
    //   92: areturn
    // Exception table:
    //   from	to	target	type
    //   17	31	34	java/lang/ArithmeticException
    //   23	49	52	java/lang/ArithmeticException
    //   56	77	80	java/lang/ArithmeticException
  }
  
  private static Zh Zt(int paramInt) {
    try {
      if (paramInt < 20) {
        try {
          if (Zy[paramInt] == null)
            Zy[paramInt] = Ze(3 << paramInt); 
        } catch (ArithmeticException arithmeticException) {
          throw a(null);
        } 
        return Zy[paramInt];
      } 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    return Ze(3 << paramInt);
  }
  
  private static void Zq(Zh paramZh, Zh[] paramArrayOfZh) {
    int i = Zh.ZI(paramZh);
    int j = 31 - Integer.numberOfLeadingZeros(i);
    Zbt zbt1 = new Zbt();
    Zbt zbt2 = new Zbt();
    Zbt zbt3 = new Zbt();
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    Zbt zbt4 = new Zbt();
    Zbt zbt5 = new Zbt();
    Zbt zbt6 = new Zbt();
    Zbt zbt7 = new Zbt();
    Zbt zbt8 = new Zbt();
    byte b1 = 1;
    if (j % 2 != 0) {
      byte b = 0;
      while (b < i) {
        paramZh.Zo(b + 1, zbt3);
        paramZh.Zo(b, zbt1);
        paramZh.ZY(b, zbt3);
        zbt1.Za(zbt3, paramZh, b + 1);
        b += 2;
        if (arrayOfZbqc != null)
          break; 
      } 
      b1++;
    } 
    Zbt zbt9 = new Zbt();
    Zbt zbt10 = new Zbt();
    while (b1 <= j) {
      Zh zh = paramArrayOfZh[b1 - 1];
      int k = 1 << b1 + 1;
      int m = 0;
      while (m < i) {
        byte b = 0;
        while (b < k / 4) {
          zbt9.Zg(zh, b);
          zbt9.Zh(zbt10);
          int n = m + b;
          int i1 = m + b + k / 4;
          int i2 = m + b + k / 2;
          int i3 = m + b + k * 3 / 4;
          paramZh.Zo(n, zbt1);
          paramZh.Zx(i1, zbt9, zbt2);
          paramZh.Zx(i2, zbt10, zbt3);
          paramZh.Zo(i3, zbt9, zbt4);
          zbt1.ZX(zbt2, zbt5);
          zbt5.Zy(zbt3);
          zbt5.Zy(zbt4);
          zbt1.ZC(zbt2, zbt6);
          zbt6.Zs(zbt3);
          zbt6.ZK(zbt4);
          zbt1.Zx(zbt2, zbt7);
          zbt7.Zy(zbt3);
          zbt7.Zs(zbt4);
          zbt1.Zo(zbt2, zbt8);
          zbt8.Zs(zbt3);
          zbt8.Zw(zbt4);
          zbt5.ZY(paramZh, n);
          zbt6.ZY(paramZh, i1);
          zbt7.ZY(paramZh, i2);
          zbt8.ZY(paramZh, i3);
          b++;
          if (arrayOfZbqc != null)
            break; 
        } 
        m += k;
        if (arrayOfZbqc != null)
          break; 
      } 
      b1 += 2;
      if (arrayOfZbqc != null)
        break; 
    } 
    byte b2 = 0;
    while (b2 < i) {
      paramZh.ZT(b2, -j);
      b2++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private static void Zy(Zh paramZh1, Zh[] paramArrayOfZh, Zh paramZh2) {
    int i = Zh.ZI(paramZh1) / 3;
    Zh zh1 = new Zh(paramZh1, 0, i);
    Zh zh2 = new Zh(paramZh1, i, i * 2);
    Zh zh3 = new Zh(paramZh1, i * 2, Zh.ZI(paramZh1));
    Zq(zh1, paramArrayOfZh);
    Zq(zh2, paramArrayOfZh);
    Zq(zh3, paramArrayOfZh);
    Zbt zbt = new Zbt();
    int j = 0;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    while (j < Zh.ZI(paramZh1) / 4) {
      zbt.Zg(paramZh2, j);
      zh2.ZX(j, zbt);
      zh3.ZX(j, zbt);
      zh3.ZX(j, zbt);
      j++;
      if (arrayOfZbqc != null)
        break; 
    } 
    j = Zh.ZI(paramZh1) / 4;
    while (j < i) {
      zbt.Zg(paramZh2, j - Zh.ZI(paramZh1) / 4);
      zh2.ZS(j, zbt);
      zh3.ZS(j, zbt);
      zh3.ZS(j, zbt);
      j++;
      if (arrayOfZbqc != null)
        break; 
    } 
    Zk(zh1, zh2, zh3, -1, 0.3333333333333333D);
  }
  
  static BigInteger ZT(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    try {
      if (!Za)
        try {
          if (paramBigInteger1 == null)
            throw new AssertionError(a(-6428, 15795)); 
        } catch (ArithmeticException arithmeticException) {
          throw a(null);
        }  
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (!Za)
        try {
          if (paramBigInteger2 == null)
            throw new AssertionError(a(-6430, 18306)); 
        } catch (ArithmeticException arithmeticException) {
          throw a(null);
        }  
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (paramBigInteger2.signum() != 0)
        try {
          if (paramBigInteger1.signum() != 0) {
            try {
              if (paramBigInteger2 == paramBigInteger1)
                return ZE(paramBigInteger2); 
            } catch (ArithmeticException arithmeticException) {
              throw a(null);
            } 
            int i = paramBigInteger1.bitLength();
            int j = paramBigInteger2.bitLength();
            try {
              if (i + j > 2147483648L)
                throw new ArithmeticException(a(-6426, -26857)); 
            } catch (ArithmeticException arithmeticException) {
              throw a(null);
            } 
            try {
              if (i > 1920)
                try {
                  if (j > 1920)
                    try {
                      if (i <= 33220) {
                        try {
                          if (j > 33220)
                            return ZE(paramBigInteger1, paramBigInteger2); 
                        } catch (ArithmeticException arithmeticException) {
                          throw a(null);
                        } 
                      } else {
                        return ZE(paramBigInteger1, paramBigInteger2);
                      } 
                    } catch (ArithmeticException arithmeticException) {
                      throw a(null);
                    }  
                } catch (ArithmeticException arithmeticException) {
                  throw a(null);
                }  
            } catch (ArithmeticException arithmeticException) {
              throw a(null);
            } 
            return paramBigInteger1.multiply(paramBigInteger2);
          } 
          return BigInteger.ZERO;
        } catch (ArithmeticException arithmeticException) {
          throw a(null);
        }  
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    return BigInteger.ZERO;
  }
  
  static BigInteger ZE(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    int i = paramBigInteger1.signum() * paramBigInteger2.signum();
    try {
    
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    byte[] arrayOfByte1 = ((paramBigInteger1.signum() < 0) ? paramBigInteger1.negate() : paramBigInteger1).toByteArray();
    try {
    
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    byte[] arrayOfByte2 = ((paramBigInteger2.signum() < 0) ? paramBigInteger2.negate() : paramBigInteger2).toByteArray();
    int j = Math.max(arrayOfByte1.length, arrayOfByte2.length) * 8;
    int k = ZF(j);
    int m = (j + k - 1) / k + 1;
    int n = 32 - Integer.numberOfLeadingZeros(m - 1);
    int i1 = 1 << n;
    int i2 = i1 * 3 / 4;
    try {
      if (m < i2 && n > 3) {
        Zh[] arrayOfZh1 = ZL(n - 2);
        Zh zh3 = Zt(n - 2);
        Zh zh4 = Zt(n - 4);
        Zh zh5 = ZR(arrayOfByte1, i2, k);
        zh5.Zs(zh3);
        Zo(zh5, arrayOfZh1, zh4);
        Zh zh6 = ZR(arrayOfByte2, i2, k);
        zh6.Zs(zh3);
        Zo(zh6, arrayOfZh1, zh4);
        zh5.ZE(zh6);
        Zy(zh5, arrayOfZh1, zh4);
        zh5.ZG(zh3);
        return Zv(zh5, i, k);
      } 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    Zh[] arrayOfZh = ZL(n);
    Zh zh1 = ZR(arrayOfByte1, i1, k);
    zh1.Zs(arrayOfZh[n]);
    ZF(zh1, arrayOfZh);
    Zh zh2 = ZR(arrayOfByte2, i1, k);
    zh2.Zs(arrayOfZh[n]);
    ZF(zh2, arrayOfZh);
    zh1.ZE(zh2);
    Zq(zh1, arrayOfZh);
    zh1.ZG(arrayOfZh[n]);
    return Zv(zh1, i, k);
  }
  
  static BigInteger ZE(BigInteger paramBigInteger) {
    try {
      if (paramBigInteger.signum() == 0)
        return BigInteger.ZERO; 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
    
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    return (paramBigInteger.bitLength() < 33220) ? paramBigInteger.multiply(paramBigInteger) : ZR(paramBigInteger);
  }
  
  static BigInteger ZR(BigInteger paramBigInteger) {
    byte[] arrayOfByte = paramBigInteger.toByteArray();
    int i = arrayOfByte.length * 8;
    int j = ZF(i);
    int k = (i + j - 1) / j + 1;
    int m = 32 - Integer.numberOfLeadingZeros(k - 1);
    int n = 1 << m;
    int i1 = n * 3 / 4;
    if (k < i1) {
      k = i1;
      Zh zh1 = ZR(arrayOfByte, k, j);
      Zh[] arrayOfZh1 = ZL(m - 2);
      Zh zh2 = Zt(m - 2);
      Zh zh3 = Zt(m - 4);
      zh1.Zs(zh2);
      Zo(zh1, arrayOfZh1, zh3);
      zh1.Zl();
      Zy(zh1, arrayOfZh1, zh3);
      zh1.ZG(zh2);
      return Zv(zh1, 1, j);
    } 
    k = n;
    Zh zh = ZR(arrayOfByte, k, j);
    Zh[] arrayOfZh = ZL(m);
    zh.Zs(arrayOfZh[m]);
    ZF(zh, arrayOfZh);
    zh.Zl();
    Zq(zh, arrayOfZh);
    zh.ZG(arrayOfZh[m]);
    return Zv(zh, 1, j);
  }
  
  static Zh ZR(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    try {
      if (!Za)
        try {
          if (paramInt2 > 25)
            throw new AssertionError(paramInt2 + a(-6427, 21416)); 
        } catch (ArithmeticException arithmeticException) {
          throw a(null);
        }  
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    Zh zh = new Zh(paramInt1);
    if (paramArrayOfbyte.length < 4) {
      byte[] arrayOfByte = new byte[4];
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 4 - paramArrayOfbyte.length, paramArrayOfbyte.length);
      paramArrayOfbyte = arrayOfByte;
    } 
    int i = 1 << paramInt2;
    int j = i / 2;
    int k = i - 1;
    int m = 32 - paramInt2;
    int n = paramArrayOfbyte.length * 8;
    int i1 = 0;
    byte b = 0;
    int i2 = n - paramInt2;
    while (i2 > -paramInt2) {
      int i3 = Math.min(Math.max(0, i2 >> 3), paramArrayOfbyte.length - 4);
      int i4 = m - i2 + (i3 << 3);
      int i5 = Zb.Zl(paramArrayOfbyte, i3) >>> i4 & k;
      i5 += i1;
      i1 = j - i5 >>> 31;
      i5 -= i & -i1;
      zh.ZI(b, i5);
      b++;
      i2 -= paramInt2;
      if (arrayOfZbqc != null)
        break; 
    } 
    try {
      if (i1 > 0)
        zh.ZI(b, i1); 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    return zh;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'l®í==¼àÉå3cWX§³FÏ»îüLÖ÷VIAK5¤å§ÔÈýØí$&{ö×Ä6aã÷ÕXð²Wî£$Eó?Éß\\nþ)Æµïh^.h-RY`ß:¤þ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #41
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #24
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'Ç5.ú;Æ-­dÁ?»BjÞÀÄÆyTÒþåv{ctsà&ü{'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #36
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #85
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic com/fasterxml/Zz/Zbs.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zz/Zbs.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #40
    //   214: goto -> 244
    //   217: bipush #65
    //   219: goto -> 244
    //   222: bipush #103
    //   224: goto -> 244
    //   227: bipush #6
    //   229: goto -> 244
    //   232: bipush #28
    //   234: goto -> 244
    //   237: bipush #79
    //   239: goto -> 244
    //   242: bipush #69
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: ldc com/fasterxml/Zz/Zbs
    //   302: invokevirtual desiredAssertionStatus : ()Z
    //   305: ifne -> 316
    //   308: iconst_1
    //   309: goto -> 317
    //   312: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   315: athrow
    //   316: iconst_0
    //   317: putstatic com/fasterxml/Zz/Zbs.Za : Z
    //   320: ldc2_w 0.7853981633974483
    //   323: invokestatic cos : (D)D
    //   326: putstatic com/fasterxml/Zz/Zbs.ZG : D
    //   329: ldc2_w 0.7853981633974483
    //   332: invokestatic sin : (D)D
    //   335: putstatic com/fasterxml/Zz/Zbs.ZE : D
    //   338: bipush #20
    //   340: anewarray com/fasterxml/Zz/Zh
    //   343: putstatic com/fasterxml/Zz/Zbs.Zh : [Lcom/fasterxml/Zz/Zh;
    //   346: bipush #20
    //   348: anewarray com/fasterxml/Zz/Zh
    //   351: putstatic com/fasterxml/Zz/Zbs.Zy : [Lcom/fasterxml/Zz/Zh;
    //   354: return
    // Exception table:
    //   from	to	target	type
    //   300	312	312	java/lang/ArithmeticException
  }
  
  private static ArithmeticException a(ArithmeticException paramArithmeticException) {
    return paramArithmeticException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE6E6) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'Ë';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zbs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */