package com.fasterxml;

public final class Zvr {
  private static int Zy;
  
  private static int Zd;
  
  private static long Zo;
  
  private static long ZE;
  
  private static long ZZ;
  
  static final String ZI;
  
  static final String ZK;
  
  private static final int[] Zs;
  
  private static final String[] ZO;
  
  private static final String[] Zz;
  
  public static int Zx(int paramInt1, char[] paramArrayOfchar, int paramInt2) {
    int i = Zyt.ZD();
    if (paramInt1 < 0) {
      if (paramInt1 == Integer.MIN_VALUE)
        return Zr(paramArrayOfchar, paramInt2); 
      paramArrayOfchar[paramInt2++] = '-';
      paramInt1 = -paramInt1;
    } 
    if (paramInt1 < Zy) {
      if (paramInt1 < 1000) {
        if (paramInt1 < 10) {
          paramArrayOfchar[paramInt2] = (char)(48 + paramInt1);
          return paramInt2 + 1;
        } 
        return ZB(paramInt1, paramArrayOfchar, paramInt2);
      } 
      int j = ZN(paramInt1);
      paramInt1 -= j * 1000;
      paramInt2 = ZB(j, paramArrayOfchar, paramInt2);
      return Zv(paramInt1, paramArrayOfchar, paramInt2);
    } 
    if (paramInt1 >= Zd) {
      paramInt1 -= Zd;
      if (paramInt1 >= Zd) {
        paramInt1 -= Zd;
        paramArrayOfchar[paramInt2++] = '2';
        if (i == 0) {
          paramArrayOfchar[paramInt2++] = '1';
          return Zu(paramInt1, paramArrayOfchar, paramInt2);
        } 
        return Zu(paramInt1, paramArrayOfchar, paramInt2);
      } 
    } else {
      int j = ZN(paramInt1);
      int k = paramInt1 - j * 1000;
      paramInt1 = j;
      j = ZN(j);
      int m = paramInt1 - j * 1000;
      paramInt2 = ZB(j, paramArrayOfchar, paramInt2);
      paramInt2 = Zv(m, paramArrayOfchar, paramInt2);
      return Zv(k, paramArrayOfchar, paramInt2);
    } 
    paramArrayOfchar[paramInt2++] = '1';
    return Zu(paramInt1, paramArrayOfchar, paramInt2);
  }
  
  public static int ZG(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZD : ()I
    //   3: istore_3
    //   4: iload_0
    //   5: ifge -> 31
    //   8: iload_0
    //   9: ldc -2147483648
    //   11: if_icmpne -> 20
    //   14: aload_1
    //   15: iload_2
    //   16: invokestatic Zv : ([BI)I
    //   19: ireturn
    //   20: aload_1
    //   21: iload_2
    //   22: iinc #2, 1
    //   25: bipush #45
    //   27: bastore
    //   28: iload_0
    //   29: ineg
    //   30: istore_0
    //   31: iload_0
    //   32: getstatic com/fasterxml/Zvr.Zy : I
    //   35: if_icmpge -> 109
    //   38: iload_0
    //   39: sipush #1000
    //   42: if_icmpge -> 77
    //   45: iload_0
    //   46: bipush #10
    //   48: if_icmpge -> 66
    //   51: aload_1
    //   52: iload_2
    //   53: iinc #2, 1
    //   56: bipush #48
    //   58: iload_0
    //   59: iadd
    //   60: i2b
    //   61: bastore
    //   62: iload_3
    //   63: ifne -> 107
    //   66: iload_0
    //   67: aload_1
    //   68: iload_2
    //   69: invokestatic ZF : (I[BI)I
    //   72: istore_2
    //   73: iload_3
    //   74: ifne -> 107
    //   77: iload_0
    //   78: invokestatic ZN : (I)I
    //   81: istore #4
    //   83: iload_0
    //   84: iload #4
    //   86: sipush #1000
    //   89: imul
    //   90: isub
    //   91: istore_0
    //   92: iload #4
    //   94: aload_1
    //   95: iload_2
    //   96: invokestatic ZF : (I[BI)I
    //   99: istore_2
    //   100: iload_0
    //   101: aload_1
    //   102: iload_2
    //   103: invokestatic ZW : (I[BI)I
    //   106: istore_2
    //   107: iload_2
    //   108: ireturn
    //   109: iload_0
    //   110: getstatic com/fasterxml/Zvr.Zd : I
    //   113: if_icmplt -> 162
    //   116: iload_0
    //   117: getstatic com/fasterxml/Zvr.Zd : I
    //   120: isub
    //   121: istore_0
    //   122: iload_0
    //   123: getstatic com/fasterxml/Zvr.Zd : I
    //   126: if_icmplt -> 147
    //   129: iload_0
    //   130: getstatic com/fasterxml/Zvr.Zd : I
    //   133: isub
    //   134: istore_0
    //   135: aload_1
    //   136: iload_2
    //   137: iinc #2, 1
    //   140: bipush #50
    //   142: bastore
    //   143: iload_3
    //   144: ifne -> 155
    //   147: aload_1
    //   148: iload_2
    //   149: iinc #2, 1
    //   152: bipush #49
    //   154: bastore
    //   155: iload_0
    //   156: aload_1
    //   157: iload_2
    //   158: invokestatic Zv : (I[BI)I
    //   161: ireturn
    //   162: iload_0
    //   163: invokestatic ZN : (I)I
    //   166: istore #4
    //   168: iload_0
    //   169: iload #4
    //   171: sipush #1000
    //   174: imul
    //   175: isub
    //   176: istore #5
    //   178: iload #4
    //   180: istore_0
    //   181: iload #4
    //   183: invokestatic ZN : (I)I
    //   186: istore #4
    //   188: iload_0
    //   189: iload #4
    //   191: sipush #1000
    //   194: imul
    //   195: isub
    //   196: istore #6
    //   198: iload #4
    //   200: aload_1
    //   201: iload_2
    //   202: invokestatic ZF : (I[BI)I
    //   205: istore_2
    //   206: iload #6
    //   208: aload_1
    //   209: iload_2
    //   210: invokestatic ZW : (I[BI)I
    //   213: istore_2
    //   214: iload #5
    //   216: aload_1
    //   217: iload_2
    //   218: invokestatic ZW : (I[BI)I
    //   221: ireturn
  }
  
  public static int Zx(long paramLong, char[] paramArrayOfchar, int paramInt) {
    // Byte code:
    //   0: invokestatic Zn : ()I
    //   3: istore #4
    //   5: lload_0
    //   6: lconst_0
    //   7: lcmp
    //   8: ifge -> 57
    //   11: lload_0
    //   12: getstatic com/fasterxml/Zvr.ZE : J
    //   15: lcmp
    //   16: ifle -> 27
    //   19: lload_0
    //   20: l2i
    //   21: aload_2
    //   22: iload_3
    //   23: invokestatic Zx : (I[CI)I
    //   26: ireturn
    //   27: lload_0
    //   28: ldc2_w -9223372036854775808
    //   31: lcmp
    //   32: ifne -> 41
    //   35: aload_2
    //   36: iload_3
    //   37: invokestatic Zw : ([CI)I
    //   40: ireturn
    //   41: aload_2
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: bipush #45
    //   48: castore
    //   49: lload_0
    //   50: lneg
    //   51: lstore_0
    //   52: iload #4
    //   54: ifeq -> 73
    //   57: lload_0
    //   58: getstatic com/fasterxml/Zvr.ZZ : J
    //   61: lcmp
    //   62: ifgt -> 73
    //   65: lload_0
    //   66: l2i
    //   67: aload_2
    //   68: iload_3
    //   69: invokestatic Zx : (I[CI)I
    //   72: ireturn
    //   73: lload_0
    //   74: getstatic com/fasterxml/Zvr.Zo : J
    //   77: ldiv
    //   78: lstore #5
    //   80: lload_0
    //   81: lload #5
    //   83: getstatic com/fasterxml/Zvr.Zo : J
    //   86: lmul
    //   87: lsub
    //   88: lstore_0
    //   89: lload #5
    //   91: getstatic com/fasterxml/Zvr.Zo : J
    //   94: lcmp
    //   95: ifge -> 112
    //   98: lload #5
    //   100: l2i
    //   101: aload_2
    //   102: iload_3
    //   103: invokestatic ZQ : (I[CI)I
    //   106: istore_3
    //   107: iload #4
    //   109: ifeq -> 149
    //   112: lload #5
    //   114: getstatic com/fasterxml/Zvr.Zo : J
    //   117: ldiv
    //   118: lstore #7
    //   120: lload #5
    //   122: lload #7
    //   124: getstatic com/fasterxml/Zvr.Zo : J
    //   127: lmul
    //   128: lsub
    //   129: lstore #5
    //   131: lload #7
    //   133: l2i
    //   134: aload_2
    //   135: iload_3
    //   136: invokestatic ZB : (I[CI)I
    //   139: istore_3
    //   140: lload #5
    //   142: l2i
    //   143: aload_2
    //   144: iload_3
    //   145: invokestatic Zu : (I[CI)I
    //   148: istore_3
    //   149: lload_0
    //   150: l2i
    //   151: aload_2
    //   152: iload_3
    //   153: invokestatic Zu : (I[CI)I
    //   156: ireturn
  }
  
  public static int Ze(long paramLong, byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: invokestatic Zn : ()I
    //   3: istore #4
    //   5: lload_0
    //   6: lconst_0
    //   7: lcmp
    //   8: ifge -> 57
    //   11: lload_0
    //   12: getstatic com/fasterxml/Zvr.ZE : J
    //   15: lcmp
    //   16: ifle -> 27
    //   19: lload_0
    //   20: l2i
    //   21: aload_2
    //   22: iload_3
    //   23: invokestatic ZG : (I[BI)I
    //   26: ireturn
    //   27: lload_0
    //   28: ldc2_w -9223372036854775808
    //   31: lcmp
    //   32: ifne -> 41
    //   35: aload_2
    //   36: iload_3
    //   37: invokestatic ZF : ([BI)I
    //   40: ireturn
    //   41: aload_2
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: bipush #45
    //   48: bastore
    //   49: lload_0
    //   50: lneg
    //   51: lstore_0
    //   52: iload #4
    //   54: ifeq -> 73
    //   57: lload_0
    //   58: getstatic com/fasterxml/Zvr.ZZ : J
    //   61: lcmp
    //   62: ifgt -> 73
    //   65: lload_0
    //   66: l2i
    //   67: aload_2
    //   68: iload_3
    //   69: invokestatic ZG : (I[BI)I
    //   72: ireturn
    //   73: lload_0
    //   74: getstatic com/fasterxml/Zvr.Zo : J
    //   77: ldiv
    //   78: lstore #5
    //   80: lload_0
    //   81: lload #5
    //   83: getstatic com/fasterxml/Zvr.Zo : J
    //   86: lmul
    //   87: lsub
    //   88: lstore_0
    //   89: lload #5
    //   91: getstatic com/fasterxml/Zvr.Zo : J
    //   94: lcmp
    //   95: ifge -> 112
    //   98: lload #5
    //   100: l2i
    //   101: aload_2
    //   102: iload_3
    //   103: invokestatic Zt : (I[BI)I
    //   106: istore_3
    //   107: iload #4
    //   109: ifeq -> 149
    //   112: lload #5
    //   114: getstatic com/fasterxml/Zvr.Zo : J
    //   117: ldiv
    //   118: lstore #7
    //   120: lload #5
    //   122: lload #7
    //   124: getstatic com/fasterxml/Zvr.Zo : J
    //   127: lmul
    //   128: lsub
    //   129: lstore #5
    //   131: lload #7
    //   133: l2i
    //   134: aload_2
    //   135: iload_3
    //   136: invokestatic ZF : (I[BI)I
    //   139: istore_3
    //   140: lload #5
    //   142: l2i
    //   143: aload_2
    //   144: iload_3
    //   145: invokestatic Zv : (I[BI)I
    //   148: istore_3
    //   149: lload_0
    //   150: l2i
    //   151: aload_2
    //   152: iload_3
    //   153: invokestatic Zv : (I[BI)I
    //   156: ireturn
  }
  
  static int ZN(int paramInt) {
    return (int)(paramInt * 274877907L >>> 38L);
  }
  
  public static String ZW(int paramInt) {
    if (paramInt < ZO.length) {
      if (paramInt >= 0)
        return ZO[paramInt]; 
      int i = -paramInt - 1;
      if (i < Zz.length)
        return Zz[i]; 
    } 
    return Integer.toString(paramInt);
  }
  
  public static String ZC(long paramLong) {
    return (paramLong <= 2147483647L && paramLong >= -2147483648L) ? ZW((int)paramLong) : Long.toString(paramLong);
  }
  
  public static String Z_(double paramDouble) {
    return ZR(paramDouble, false);
  }
  
  public static String ZR(double paramDouble, boolean paramBoolean) {
    return paramBoolean ? Zvw.Zy(paramDouble) : Double.toString(paramDouble);
  }
  
  public static String Zo(float paramFloat) {
    return Zh(paramFloat, false);
  }
  
  public static String Zh(float paramFloat, boolean paramBoolean) {
    return paramBoolean ? Zyz.Zn(paramFloat) : Float.toString(paramFloat);
  }
  
  public static boolean ZV(double paramDouble) {
    return !Double.isFinite(paramDouble);
  }
  
  public static boolean Zi(float paramFloat) {
    return !Float.isFinite(paramFloat);
  }
  
  private static int ZQ(int paramInt1, char[] paramArrayOfchar, int paramInt2) {
    if (paramInt1 < Zy) {
      if (paramInt1 < 1000)
        return ZB(paramInt1, paramArrayOfchar, paramInt2); 
      int n = ZN(paramInt1);
      int i1 = paramInt1 - n * 1000;
      return Zm(paramArrayOfchar, paramInt2, n, i1);
    } 
    int i = ZN(paramInt1);
    int j = paramInt1 - i * 1000;
    int k = ZN(i);
    i -= k * 1000;
    paramInt2 = ZB(k, paramArrayOfchar, paramInt2);
    int m = Zs[i];
    paramArrayOfchar[paramInt2++] = (char)(m >> 16);
    paramArrayOfchar[paramInt2++] = (char)(m >> 8 & 0x7F);
    paramArrayOfchar[paramInt2++] = (char)(m & 0x7F);
    m = Zs[j];
    paramArrayOfchar[paramInt2++] = (char)(m >> 16);
    paramArrayOfchar[paramInt2++] = (char)(m >> 8 & 0x7F);
    paramArrayOfchar[paramInt2++] = (char)(m & 0x7F);
    return paramInt2;
  }
  
  private static int Zu(int paramInt1, char[] paramArrayOfchar, int paramInt2) {
    int i = ZN(paramInt1);
    int j = paramInt1 - i * 1000;
    int k = ZN(i);
    int m = Zs[k];
    paramArrayOfchar[paramInt2++] = (char)(m >> 16);
    paramArrayOfchar[paramInt2++] = (char)(m >> 8 & 0x7F);
    paramArrayOfchar[paramInt2++] = (char)(m & 0x7F);
    i -= k * 1000;
    m = Zs[i];
    paramArrayOfchar[paramInt2++] = (char)(m >> 16);
    paramArrayOfchar[paramInt2++] = (char)(m >> 8 & 0x7F);
    paramArrayOfchar[paramInt2++] = (char)(m & 0x7F);
    m = Zs[j];
    paramArrayOfchar[paramInt2++] = (char)(m >> 16);
    paramArrayOfchar[paramInt2++] = (char)(m >> 8 & 0x7F);
    paramArrayOfchar[paramInt2++] = (char)(m & 0x7F);
    return paramInt2;
  }
  
  private static int Zt(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    if (paramInt1 < Zy) {
      if (paramInt1 < 1000)
        return ZF(paramInt1, paramArrayOfbyte, paramInt2); 
      int n = ZN(paramInt1);
      int i1 = paramInt1 - n * 1000;
      return ZO(paramArrayOfbyte, paramInt2, n, i1);
    } 
    int i = ZN(paramInt1);
    int j = paramInt1 - i * 1000;
    int k = ZN(i);
    i -= k * 1000;
    paramInt2 = ZF(k, paramArrayOfbyte, paramInt2);
    int m = Zs[i];
    paramArrayOfbyte[paramInt2++] = (byte)(m >> 16);
    paramArrayOfbyte[paramInt2++] = (byte)(m >> 8);
    paramArrayOfbyte[paramInt2++] = (byte)m;
    m = Zs[j];
    paramArrayOfbyte[paramInt2++] = (byte)(m >> 16);
    paramArrayOfbyte[paramInt2++] = (byte)(m >> 8);
    paramArrayOfbyte[paramInt2++] = (byte)m;
    return paramInt2;
  }
  
  private static int Zv(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    int i = ZN(paramInt1);
    int j = paramInt1 - i * 1000;
    int k = ZN(i);
    i -= k * 1000;
    int m = Zs[k];
    paramArrayOfbyte[paramInt2++] = (byte)(m >> 16);
    paramArrayOfbyte[paramInt2++] = (byte)(m >> 8);
    paramArrayOfbyte[paramInt2++] = (byte)m;
    m = Zs[i];
    paramArrayOfbyte[paramInt2++] = (byte)(m >> 16);
    paramArrayOfbyte[paramInt2++] = (byte)(m >> 8);
    paramArrayOfbyte[paramInt2++] = (byte)m;
    m = Zs[j];
    paramArrayOfbyte[paramInt2++] = (byte)(m >> 16);
    paramArrayOfbyte[paramInt2++] = (byte)(m >> 8);
    paramArrayOfbyte[paramInt2++] = (byte)m;
    return paramInt2;
  }
  
  private static int Zm(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) {
    int i = Zs[paramInt2];
    if (paramInt2 > 9) {
      if (paramInt2 > 99)
        paramArrayOfchar[paramInt1++] = (char)(i >> 16); 
      paramArrayOfchar[paramInt1++] = (char)(i >> 8 & 0x7F);
    } 
    paramArrayOfchar[paramInt1++] = (char)(i & 0x7F);
    i = Zs[paramInt3];
    paramArrayOfchar[paramInt1++] = (char)(i >> 16);
    paramArrayOfchar[paramInt1++] = (char)(i >> 8 & 0x7F);
    paramArrayOfchar[paramInt1++] = (char)(i & 0x7F);
    return paramInt1;
  }
  
  private static int ZO(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    int i = Zs[paramInt2];
    if (paramInt2 > 9) {
      if (paramInt2 > 99)
        paramArrayOfbyte[paramInt1++] = (byte)(i >> 16); 
      paramArrayOfbyte[paramInt1++] = (byte)(i >> 8);
    } 
    paramArrayOfbyte[paramInt1++] = (byte)i;
    i = Zs[paramInt3];
    paramArrayOfbyte[paramInt1++] = (byte)(i >> 16);
    paramArrayOfbyte[paramInt1++] = (byte)(i >> 8);
    paramArrayOfbyte[paramInt1++] = (byte)i;
    return paramInt1;
  }
  
  private static int ZB(int paramInt1, char[] paramArrayOfchar, int paramInt2) {
    int i = Zs[paramInt1];
    if (paramInt1 > 9) {
      if (paramInt1 > 99)
        paramArrayOfchar[paramInt2++] = (char)(i >> 16); 
      paramArrayOfchar[paramInt2++] = (char)(i >> 8 & 0x7F);
    } 
    paramArrayOfchar[paramInt2++] = (char)(i & 0x7F);
    return paramInt2;
  }
  
  private static int ZF(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    int i = Zs[paramInt1];
    if (paramInt1 > 9) {
      if (paramInt1 > 99)
        paramArrayOfbyte[paramInt2++] = (byte)(i >> 16); 
      paramArrayOfbyte[paramInt2++] = (byte)(i >> 8);
    } 
    paramArrayOfbyte[paramInt2++] = (byte)i;
    return paramInt2;
  }
  
  private static int Zv(int paramInt1, char[] paramArrayOfchar, int paramInt2) {
    int i = Zs[paramInt1];
    paramArrayOfchar[paramInt2++] = (char)(i >> 16);
    paramArrayOfchar[paramInt2++] = (char)(i >> 8 & 0x7F);
    paramArrayOfchar[paramInt2++] = (char)(i & 0x7F);
    return paramInt2;
  }
  
  private static int ZW(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    int i = Zs[paramInt1];
    paramArrayOfbyte[paramInt2++] = (byte)(i >> 16);
    paramArrayOfbyte[paramInt2++] = (byte)(i >> 8);
    paramArrayOfbyte[paramInt2++] = (byte)i;
    return paramInt2;
  }
  
  private static int Zw(char[] paramArrayOfchar, int paramInt) {
    int i = ZK.length();
    ZK.getChars(0, i, paramArrayOfchar, paramInt);
    return paramInt + i;
  }
  
  private static int ZF(byte[] paramArrayOfbyte, int paramInt) {
    int j = ZK.length();
    byte b = 0;
    int i = Zyt.ZD();
    while (b < j) {
      paramArrayOfbyte[paramInt++] = (byte)ZK.charAt(b);
      b++;
      if (i == 0)
        break; 
    } 
    return paramInt;
  }
  
  private static int Zr(char[] paramArrayOfchar, int paramInt) {
    int i = ZI.length();
    ZI.getChars(0, i, paramArrayOfchar, paramInt);
    return paramInt + i;
  }
  
  private static int Zv(byte[] paramArrayOfbyte, int paramInt) {
    int j = ZI.length();
    byte b = 0;
    int i = Zyt.Zn();
    while (b < j) {
      paramArrayOfbyte[paramInt++] = (byte)ZI.charAt(b);
      b++;
      if (i != 0)
        break; 
    } 
    return paramInt;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '191<-;1:_1?1>131:1='
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: iconst_2
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #29
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 128
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: ldc ''
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: iconst_2
    //   77: istore_2
    //   78: iconst_m1
    //   79: istore_1
    //   80: bipush #54
    //   82: iinc #1, 1
    //   85: aload_3
    //   86: iload_1
    //   87: dup
    //   88: iload_2
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 128
    //   97: aload_0
    //   98: swap
    //   99: iload #4
    //   101: iinc #4, 1
    //   104: swap
    //   105: aastore
    //   106: iload_1
    //   107: iload_2
    //   108: iadd
    //   109: dup
    //   110: istore_1
    //   111: iload #5
    //   113: if_icmpge -> 125
    //   116: aload_3
    //   117: iload_1
    //   118: invokevirtual charAt : (I)C
    //   121: istore_2
    //   122: goto -> 80
    //   125: goto -> 284
    //   128: dup_x2
    //   129: pop
    //   130: invokevirtual toCharArray : ()[C
    //   133: dup_x1
    //   134: arraylength
    //   135: dup_x2
    //   136: pop
    //   137: iconst_0
    //   138: istore #6
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iconst_1
    //   144: if_icmpgt -> 243
    //   147: dup2
    //   148: swap
    //   149: iload #6
    //   151: dup2_x1
    //   152: caload
    //   153: swap
    //   154: iload #6
    //   156: bipush #7
    //   158: irem
    //   159: tableswitch default -> 225, 0 -> 196, 1 -> 200, 2 -> 205, 3 -> 210, 4 -> 215, 5 -> 220
    //   196: iconst_1
    //   197: goto -> 227
    //   200: bipush #22
    //   202: goto -> 227
    //   205: bipush #114
    //   207: goto -> 227
    //   210: bipush #49
    //   212: goto -> 227
    //   215: bipush #16
    //   217: goto -> 227
    //   220: bipush #92
    //   222: goto -> 227
    //   225: bipush #122
    //   227: ixor
    //   228: ixor
    //   229: i2c
    //   230: castore
    //   231: iinc #6, 1
    //   234: dup
    //   235: ifne -> 243
    //   238: dup2
    //   239: dup_x1
    //   240: goto -> 151
    //   243: dup2_x1
    //   244: pop2
    //   245: dup_x2
    //   246: iload #6
    //   248: if_icmpgt -> 147
    //   251: pop
    //   252: new java/lang/String
    //   255: dup_x1
    //   256: swap
    //   257: invokespecial <init> : ([C)V
    //   260: invokevirtual intern : ()Ljava/lang/String;
    //   263: swap
    //   264: pop
    //   265: swap
    //   266: tableswitch default -> 39, 0 -> 97
    //   284: ldc 1000000
    //   286: putstatic com/fasterxml/Zvr.Zy : I
    //   289: ldc 1000000000
    //   291: putstatic com/fasterxml/Zvr.Zd : I
    //   294: ldc2_w 1000000000
    //   297: putstatic com/fasterxml/Zvr.Zo : J
    //   300: ldc2_w -2147483648
    //   303: putstatic com/fasterxml/Zvr.ZE : J
    //   306: ldc2_w 2147483647
    //   309: putstatic com/fasterxml/Zvr.ZZ : J
    //   312: ldc -2147483648
    //   314: invokestatic valueOf : (I)Ljava/lang/String;
    //   317: putstatic com/fasterxml/Zvr.ZI : Ljava/lang/String;
    //   320: ldc2_w -9223372036854775808
    //   323: invokestatic valueOf : (J)Ljava/lang/String;
    //   326: putstatic com/fasterxml/Zvr.ZK : Ljava/lang/String;
    //   329: sipush #1000
    //   332: newarray int
    //   334: putstatic com/fasterxml/Zvr.Zs : [I
    //   337: iconst_0
    //   338: istore #7
    //   340: iconst_0
    //   341: istore #8
    //   343: iload #8
    //   345: bipush #10
    //   347: if_icmpge -> 424
    //   350: iconst_0
    //   351: istore #9
    //   353: iload #9
    //   355: bipush #10
    //   357: if_icmpge -> 418
    //   360: iconst_0
    //   361: istore #10
    //   363: iload #10
    //   365: bipush #10
    //   367: if_icmpge -> 412
    //   370: iload #8
    //   372: bipush #48
    //   374: iadd
    //   375: bipush #16
    //   377: ishl
    //   378: iload #9
    //   380: bipush #48
    //   382: iadd
    //   383: bipush #8
    //   385: ishl
    //   386: ior
    //   387: iload #10
    //   389: bipush #48
    //   391: iadd
    //   392: ior
    //   393: istore #11
    //   395: getstatic com/fasterxml/Zvr.Zs : [I
    //   398: iload #7
    //   400: iinc #7, 1
    //   403: iload #11
    //   405: iastore
    //   406: iinc #10, 1
    //   409: goto -> 363
    //   412: iinc #9, 1
    //   415: goto -> 353
    //   418: iinc #8, 1
    //   421: goto -> 343
    //   424: bipush #11
    //   426: anewarray java/lang/String
    //   429: dup
    //   430: iconst_0
    //   431: ldc '0'
    //   433: aastore
    //   434: dup
    //   435: iconst_1
    //   436: ldc '1'
    //   438: aastore
    //   439: dup
    //   440: iconst_2
    //   441: ldc '2'
    //   443: aastore
    //   444: dup
    //   445: iconst_3
    //   446: ldc '3'
    //   448: aastore
    //   449: dup
    //   450: iconst_4
    //   451: ldc '4'
    //   453: aastore
    //   454: dup
    //   455: iconst_5
    //   456: ldc '5'
    //   458: aastore
    //   459: dup
    //   460: bipush #6
    //   462: ldc '6'
    //   464: aastore
    //   465: dup
    //   466: bipush #7
    //   468: ldc '7'
    //   470: aastore
    //   471: dup
    //   472: bipush #8
    //   474: ldc '8'
    //   476: aastore
    //   477: dup
    //   478: bipush #9
    //   480: ldc '9'
    //   482: aastore
    //   483: dup
    //   484: bipush #10
    //   486: aload_0
    //   487: iconst_2
    //   488: aaload
    //   489: aastore
    //   490: putstatic com/fasterxml/Zvr.ZO : [Ljava/lang/String;
    //   493: bipush #10
    //   495: anewarray java/lang/String
    //   498: dup
    //   499: iconst_0
    //   500: aload_0
    //   501: bipush #7
    //   503: aaload
    //   504: aastore
    //   505: dup
    //   506: iconst_1
    //   507: aload_0
    //   508: iconst_0
    //   509: aaload
    //   510: aastore
    //   511: dup
    //   512: iconst_2
    //   513: aload_0
    //   514: bipush #10
    //   516: aaload
    //   517: aastore
    //   518: dup
    //   519: iconst_3
    //   520: aload_0
    //   521: iconst_4
    //   522: aaload
    //   523: aastore
    //   524: dup
    //   525: iconst_4
    //   526: aload_0
    //   527: iconst_5
    //   528: aaload
    //   529: aastore
    //   530: dup
    //   531: iconst_5
    //   532: aload_0
    //   533: bipush #8
    //   535: aaload
    //   536: aastore
    //   537: dup
    //   538: bipush #6
    //   540: aload_0
    //   541: iconst_1
    //   542: aaload
    //   543: aastore
    //   544: dup
    //   545: bipush #7
    //   547: aload_0
    //   548: bipush #6
    //   550: aaload
    //   551: aastore
    //   552: dup
    //   553: bipush #8
    //   555: aload_0
    //   556: bipush #9
    //   558: aaload
    //   559: aastore
    //   560: dup
    //   561: bipush #9
    //   563: aload_0
    //   564: iconst_3
    //   565: aaload
    //   566: aastore
    //   567: putstatic com/fasterxml/Zvr.Zz : [Ljava/lang/String;
    //   570: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zvr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */