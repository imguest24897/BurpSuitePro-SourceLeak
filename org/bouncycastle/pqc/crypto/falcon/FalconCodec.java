package org.bouncycastle.pqc.crypto.falcon;

class FalconCodec {
  final byte[] max_fg_bits = new byte[] { 
      0, 8, 8, 8, 8, 8, 7, 7, 6, 6, 
      5 };
  
  final byte[] max_FG_bits = new byte[] { 
      0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 
      8 };
  
  final byte[] max_sig_bits = new byte[] { 
      0, 10, 11, 11, 12, 12, 12, 12, 12, 12, 
      12 };
  
  int modq_encode(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, short[] paramArrayOfshort, int paramInt3, int paramInt4) {
    int i = 1 << paramInt4;
    byte b1;
    for (b1 = 0; b1 < i; b1++) {
      if ((paramArrayOfshort[paramInt3 + b1] & 0xFFFF) >= 12289)
        return 0; 
    } 
    int j = i * 14 + 7 >> 3;
    if (paramArrayOfbyte == null)
      return j; 
    if (j > paramInt2)
      return 0; 
    int k = paramInt1;
    int m = 0;
    byte b2 = 0;
    for (b1 = 0; b1 < i; b1++) {
      m = m << 14 | paramArrayOfshort[paramInt3 + b1] & 0xFFFF;
      b2 += true;
      while (b2 >= 8) {
        b2 -= 8;
        paramArrayOfbyte[k++] = (byte)(m >> b2);
      } 
    } 
    if (b2 > 0)
      paramArrayOfbyte[k] = (byte)(m << 8 - b2); 
    return j;
  }
  
  int modq_decode(short[] paramArrayOfshort, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3, int paramInt4) {
    int i = 1 << paramInt2;
    int j = i * 14 + 7 >> 3;
    if (j > paramInt4)
      return 0; 
    int k = paramInt3;
    int m = 0;
    byte b2 = 0;
    byte b1 = 0;
    while (b1 < i) {
      m = m << 8 | paramArrayOfbyte[k++] & 0xFF;
      b2 += true;
      if (b2 >= 14) {
        b2 -= 14;
        int n = m >>> b2 & 0x3FFF;
        if (n >= 12289)
          return 0; 
        paramArrayOfshort[paramInt1 + b1] = (short)n;
        b1++;
      } 
    } 
    return ((m & (1 << b2) - 1) != 0) ? 0 : j;
  }
  
  int trim_i16_encode(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, short[] paramArrayOfshort, int paramInt3, int paramInt4, int paramInt5) {
    int i = 1 << paramInt4;
    int m = (1 << paramInt5 - 1) - 1;
    int k = -m;
    byte b;
    for (b = 0; b < i; b++) {
      if (paramArrayOfshort[paramInt3 + b] < k || paramArrayOfshort[paramInt3 + b] > m)
        return 0; 
    } 
    int j = i * paramInt5 + 7 >> 3;
    if (paramArrayOfbyte == null)
      return j; 
    if (j > paramInt2)
      return 0; 
    int n = paramInt1;
    int i1 = 0;
    int i3 = 0;
    int i2 = (1 << paramInt5) - 1;
    for (b = 0; b < i; b++) {
      i1 = i1 << paramInt5 | paramArrayOfshort[paramInt3 + b] & 0xFFF & i2;
      i3 += paramInt5;
      while (i3 >= 8) {
        i3 -= 8;
        paramArrayOfbyte[n++] = (byte)(i1 >> i3);
      } 
    } 
    if (i3 > 0)
      paramArrayOfbyte[n++] = (byte)(i1 << 8 - i3); 
    return j;
  }
  
  int trim_i16_decode(short[] paramArrayOfshort, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte, int paramInt4, int paramInt5) {
    int i = 1 << paramInt2;
    int j = i * paramInt3 + 7 >> 3;
    if (j > paramInt5)
      return 0; 
    int k = paramInt4;
    byte b = 0;
    int m = 0;
    int i2 = 0;
    int n = (1 << paramInt3) - 1;
    int i1 = 1 << paramInt3 - 1;
    while (b < i) {
      m = m << 8 | paramArrayOfbyte[k++] & 0xFF;
      i2 += true;
      while (i2 >= paramInt3 && b < i) {
        i2 -= paramInt3;
        int i3 = m >>> i2 & n;
        i3 |= -(i3 & i1);
        if (i3 == -i1)
          return 0; 
        i3 |= -(i3 & i1);
        paramArrayOfshort[paramInt1 + b] = (short)i3;
        b++;
      } 
    } 
    return ((m & (1 << i2) - 1) != 0) ? 0 : j;
  }
  
  int trim_i8_encode(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, int paramInt4, int paramInt5) {
    int i = 1 << paramInt4;
    int m = (1 << paramInt5 - 1) - 1;
    int k = -m;
    byte b;
    for (b = 0; b < i; b++) {
      if (paramArrayOfbyte2[paramInt3 + b] < k || paramArrayOfbyte2[paramInt3 + b] > m)
        return 0; 
    } 
    int j = i * paramInt5 + 7 >> 3;
    if (paramArrayOfbyte1 == null)
      return j; 
    if (j > paramInt2)
      return 0; 
    int n = paramInt1;
    int i1 = 0;
    int i3 = 0;
    int i2 = (1 << paramInt5) - 1;
    for (b = 0; b < i; b++) {
      i1 = i1 << paramInt5 | paramArrayOfbyte2[paramInt3 + b] & 0xFFFF & i2;
      i3 += paramInt5;
      while (i3 >= 8) {
        i3 -= 8;
        paramArrayOfbyte1[n++] = (byte)(i1 >>> i3);
      } 
    } 
    if (i3 > 0)
      paramArrayOfbyte1[n++] = (byte)(i1 << 8 - i3); 
    return j;
  }
  
  int trim_i8_decode(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte2, int paramInt4, int paramInt5) {
    int i = 1 << paramInt2;
    int j = i * paramInt3 + 7 >> 3;
    if (j > paramInt5)
      return 0; 
    int k = paramInt4;
    byte b = 0;
    int m = 0;
    int i2 = 0;
    int n = (1 << paramInt3) - 1;
    int i1 = 1 << paramInt3 - 1;
    while (b < i) {
      m = m << 8 | paramArrayOfbyte2[k++] & 0xFF;
      i2 += true;
      while (i2 >= paramInt3 && b < i) {
        i2 -= paramInt3;
        int i3 = m >>> i2 & n;
        i3 |= -(i3 & i1);
        if (i3 == -i1)
          return 0; 
        paramArrayOfbyte1[paramInt1 + b] = (byte)i3;
        b++;
      } 
    } 
    return ((m & (1 << i2) - 1) != 0) ? 0 : j;
  }
  
  int comp_encode(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, short[] paramArrayOfshort, int paramInt3, int paramInt4) {
    int j = 1 << paramInt4;
    int i = paramInt1;
    byte b1;
    for (b1 = 0; b1 < j; b1++) {
      if (paramArrayOfshort[paramInt3 + b1] < -2047 || paramArrayOfshort[paramInt3 + b1] > 2047)
        return 0; 
    } 
    int k = 0;
    int m = 0;
    byte b2 = 0;
    for (b1 = 0; b1 < j; b1++) {
      k <<= 1;
      short s = paramArrayOfshort[paramInt3 + b1];
      if (s < 0) {
        s = -s;
        k |= 0x1;
      } 
      int n = s;
      k <<= 7;
      k |= n & 0x7F;
      n >>>= 7;
      m += true;
      k <<= n + 1;
      k |= 0x1;
      m += n + 1;
      while (m >= 8) {
        m -= 8;
        if (paramArrayOfbyte != null) {
          if (b2 >= paramInt2)
            return 0; 
          paramArrayOfbyte[i + b2] = (byte)(k >>> m);
        } 
        b2++;
      } 
    } 
    if (m > 0) {
      if (paramArrayOfbyte != null) {
        if (b2 >= paramInt2)
          return 0; 
        paramArrayOfbyte[i + b2] = (byte)(k << 8 - m);
      } 
      b2++;
    } 
    return b2;
  }
  
  int comp_decode(short[] paramArrayOfshort, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: iconst_1
    //   1: iload_3
    //   2: ishl
    //   3: istore #8
    //   5: iload #5
    //   7: istore #7
    //   9: iconst_0
    //   10: istore #11
    //   12: iconst_0
    //   13: istore #12
    //   15: iconst_0
    //   16: istore #10
    //   18: iconst_0
    //   19: istore #9
    //   21: iload #9
    //   23: iload #8
    //   25: if_icmpge -> 193
    //   28: iload #10
    //   30: iload #6
    //   32: if_icmplt -> 37
    //   35: iconst_0
    //   36: ireturn
    //   37: iload #11
    //   39: bipush #8
    //   41: ishl
    //   42: aload #4
    //   44: iload #7
    //   46: iload #10
    //   48: iadd
    //   49: baload
    //   50: sipush #255
    //   53: iand
    //   54: ior
    //   55: istore #11
    //   57: iinc #10, 1
    //   60: iload #11
    //   62: iload #12
    //   64: iushr
    //   65: istore #13
    //   67: iload #13
    //   69: sipush #128
    //   72: iand
    //   73: istore #14
    //   75: iload #13
    //   77: bipush #127
    //   79: iand
    //   80: istore #15
    //   82: iload #12
    //   84: ifne -> 123
    //   87: iload #10
    //   89: iload #6
    //   91: if_icmplt -> 96
    //   94: iconst_0
    //   95: ireturn
    //   96: iload #11
    //   98: bipush #8
    //   100: ishl
    //   101: aload #4
    //   103: iload #7
    //   105: iload #10
    //   107: iadd
    //   108: baload
    //   109: sipush #255
    //   112: iand
    //   113: ior
    //   114: istore #11
    //   116: iinc #10, 1
    //   119: bipush #8
    //   121: istore #12
    //   123: iinc #12, -1
    //   126: iload #11
    //   128: iload #12
    //   130: iushr
    //   131: iconst_1
    //   132: iand
    //   133: ifeq -> 139
    //   136: goto -> 155
    //   139: wide iinc #15 128
    //   145: iload #15
    //   147: sipush #2047
    //   150: if_icmple -> 82
    //   153: iconst_0
    //   154: ireturn
    //   155: iload #14
    //   157: ifeq -> 167
    //   160: iload #15
    //   162: ifne -> 167
    //   165: iconst_0
    //   166: ireturn
    //   167: aload_1
    //   168: iload_2
    //   169: iload #9
    //   171: iadd
    //   172: iload #14
    //   174: ifeq -> 183
    //   177: iload #15
    //   179: ineg
    //   180: goto -> 185
    //   183: iload #15
    //   185: i2s
    //   186: sastore
    //   187: iinc #9, 1
    //   190: goto -> 21
    //   193: iload #11
    //   195: iconst_1
    //   196: iload #12
    //   198: ishl
    //   199: iconst_1
    //   200: isub
    //   201: iand
    //   202: ifeq -> 207
    //   205: iconst_0
    //   206: ireturn
    //   207: iload #10
    //   209: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\FalconCodec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */