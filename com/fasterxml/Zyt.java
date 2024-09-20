package com.fasterxml;

import com.fasterxml.Zz.Zi;
import com.fasterxml.Zz.Zt;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;

public final class Zyt {
  static final String Zm;
  
  static final String ZP;
  
  private static final Pattern ZU;
  
  private static int Zl;
  
  public static int Zf(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    try {
      if (paramInt2 > 0)
        try {
          if (paramArrayOfchar[paramInt1] == '+') {
            paramInt1++;
            paramInt2--;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    int i = paramArrayOfchar[paramInt1 + paramInt2 - 1] - 48;
    switch (paramInt2) {
      case 9:
        i += (paramArrayOfchar[paramInt1++] - 48) * 100000000;
      case 8:
        i += (paramArrayOfchar[paramInt1++] - 48) * 10000000;
      case 7:
        i += (paramArrayOfchar[paramInt1++] - 48) * 1000000;
      case 6:
        i += (paramArrayOfchar[paramInt1++] - 48) * 100000;
      case 5:
        i += (paramArrayOfchar[paramInt1++] - 48) * 10000;
      case 4:
        i += (paramArrayOfchar[paramInt1++] - 48) * 1000;
      case 3:
        i += (paramArrayOfchar[paramInt1++] - 48) * 100;
      case 2:
        i += (paramArrayOfchar[paramInt1] - 48) * 10;
        break;
    } 
    return i;
  }
  
  public static int ZC(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: invokevirtual charAt : (I)C
    //   5: istore_2
    //   6: invokestatic ZD : ()I
    //   9: aload_0
    //   10: invokevirtual length : ()I
    //   13: istore_3
    //   14: istore_1
    //   15: iload_2
    //   16: bipush #45
    //   18: if_icmpne -> 29
    //   21: iconst_1
    //   22: goto -> 30
    //   25: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   28: athrow
    //   29: iconst_0
    //   30: istore #4
    //   32: iconst_1
    //   33: istore #5
    //   35: iload #4
    //   37: ifeq -> 88
    //   40: iload_3
    //   41: iconst_1
    //   42: if_icmpeq -> 65
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   51: athrow
    //   52: iload_3
    //   53: bipush #10
    //   55: if_icmple -> 74
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   64: athrow
    //   65: aload_0
    //   66: invokestatic parseInt : (Ljava/lang/String;)I
    //   69: ireturn
    //   70: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   73: athrow
    //   74: aload_0
    //   75: iload #5
    //   77: iinc #5, 1
    //   80: invokevirtual charAt : (I)C
    //   83: istore_2
    //   84: iload_1
    //   85: ifne -> 110
    //   88: iload_3
    //   89: bipush #9
    //   91: if_icmple -> 110
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   100: athrow
    //   101: aload_0
    //   102: invokestatic parseInt : (Ljava/lang/String;)I
    //   105: ireturn
    //   106: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   109: athrow
    //   110: iload_2
    //   111: bipush #57
    //   113: if_icmpgt -> 129
    //   116: iload_2
    //   117: bipush #48
    //   119: if_icmpge -> 138
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   128: athrow
    //   129: aload_0
    //   130: invokestatic parseInt : (Ljava/lang/String;)I
    //   133: ireturn
    //   134: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   137: athrow
    //   138: iload_2
    //   139: bipush #48
    //   141: isub
    //   142: istore #6
    //   144: iload #5
    //   146: iload_3
    //   147: if_icmpge -> 311
    //   150: aload_0
    //   151: iload #5
    //   153: iinc #5, 1
    //   156: invokevirtual charAt : (I)C
    //   159: istore_2
    //   160: iload_2
    //   161: bipush #57
    //   163: if_icmpgt -> 179
    //   166: iload_2
    //   167: bipush #48
    //   169: if_icmpge -> 188
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   178: athrow
    //   179: aload_0
    //   180: invokestatic parseInt : (Ljava/lang/String;)I
    //   183: ireturn
    //   184: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   187: athrow
    //   188: iload #6
    //   190: bipush #10
    //   192: imul
    //   193: iload_2
    //   194: bipush #48
    //   196: isub
    //   197: iadd
    //   198: istore #6
    //   200: iload #5
    //   202: iload_3
    //   203: if_icmpge -> 311
    //   206: aload_0
    //   207: iload #5
    //   209: iinc #5, 1
    //   212: invokevirtual charAt : (I)C
    //   215: istore_2
    //   216: iload_2
    //   217: bipush #57
    //   219: if_icmpgt -> 235
    //   222: iload_2
    //   223: bipush #48
    //   225: if_icmpge -> 244
    //   228: goto -> 235
    //   231: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   234: athrow
    //   235: aload_0
    //   236: invokestatic parseInt : (Ljava/lang/String;)I
    //   239: ireturn
    //   240: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   243: athrow
    //   244: iload #6
    //   246: bipush #10
    //   248: imul
    //   249: iload_2
    //   250: bipush #48
    //   252: isub
    //   253: iadd
    //   254: istore #6
    //   256: iload #5
    //   258: iload_3
    //   259: if_icmpge -> 311
    //   262: aload_0
    //   263: iload #5
    //   265: iinc #5, 1
    //   268: invokevirtual charAt : (I)C
    //   271: istore_2
    //   272: iload_2
    //   273: bipush #57
    //   275: if_icmpgt -> 284
    //   278: iload_2
    //   279: bipush #48
    //   281: if_icmpge -> 293
    //   284: aload_0
    //   285: invokestatic parseInt : (Ljava/lang/String;)I
    //   288: ireturn
    //   289: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   292: athrow
    //   293: iload #6
    //   295: bipush #10
    //   297: imul
    //   298: iload_2
    //   299: bipush #48
    //   301: isub
    //   302: iadd
    //   303: istore #6
    //   305: iload #5
    //   307: iload_3
    //   308: if_icmplt -> 262
    //   311: iload #4
    //   313: ifeq -> 326
    //   316: iload #6
    //   318: ineg
    //   319: goto -> 328
    //   322: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   325: athrow
    //   326: iload #6
    //   328: ireturn
    // Exception table:
    //   from	to	target	type
    //   15	25	25	java/lang/NumberFormatException
    //   35	45	48	java/lang/NumberFormatException
    //   40	58	61	java/lang/NumberFormatException
    //   52	70	70	java/lang/NumberFormatException
    //   84	94	97	java/lang/NumberFormatException
    //   88	106	106	java/lang/NumberFormatException
    //   110	122	125	java/lang/NumberFormatException
    //   116	134	134	java/lang/NumberFormatException
    //   160	172	175	java/lang/NumberFormatException
    //   166	184	184	java/lang/NumberFormatException
    //   216	228	231	java/lang/NumberFormatException
    //   222	240	240	java/lang/NumberFormatException
    //   278	289	289	java/lang/NumberFormatException
    //   311	322	322	java/lang/NumberFormatException
  }
  
  public static long Zl(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int i = paramInt2 - 9;
    long l = Zf(paramArrayOfchar, paramInt1, i) * 1000000000L;
    return l + Zf(paramArrayOfchar, paramInt1 + i, 9);
  }
  
  public static long Zj(char[] paramArrayOfchar, int paramInt, boolean paramBoolean) {
    long l = 0L;
    byte b = 0;
    int i = Zn();
    while (b < 19) {
      char c = paramArrayOfchar[paramInt + b];
      l = l * 10L + (c - 48);
      b++;
      if (i != 0)
        break; 
    } 
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return paramBoolean ? -l : l;
  }
  
  public static long ZO(String paramString) {
    int i = paramString.length();
    try {
      if (i <= 9)
        return ZC(paramString); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return Long.parseLong(paramString);
  }
  
  public static boolean ZP(char[] paramArrayOfchar, int paramInt1, int paramInt2, boolean paramBoolean) {
    int i = Zn();
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    String str = paramBoolean ? Zm : ZP;
    int j = str.length();
    try {
      if (paramInt2 < j)
        return true; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (paramInt2 > j)
        return false; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    byte b = 0;
    while (b < j) {
      int k = paramArrayOfchar[paramInt1 + b] - str.charAt(b);
      try {
        if (k != 0) {
          try {
          
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return (k < 0);
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      b++;
      if (i != 0)
        break; 
    } 
    return true;
  }
  
  public static boolean ZG(String paramString, boolean paramBoolean) {
    int i = Zn();
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    String str = paramBoolean ? Zm : ZP;
    int j = str.length();
    int k = paramString.length();
    try {
      if (k < j)
        return true; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (k > j)
        return false; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    byte b = 0;
    while (b < j) {
      int m = paramString.charAt(b) - str.charAt(b);
      try {
        if (m != 0) {
          try {
          
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return (m < 0);
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      b++;
      if (i != 0)
        break; 
    } 
    return true;
  }
  
  public static int ZV(String paramString, int paramInt) {
    // Byte code:
    //   0: invokestatic Zn : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: ifnonnull -> 14
    //   8: iload_1
    //   9: ireturn
    //   10: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   13: athrow
    //   14: aload_0
    //   15: invokevirtual trim : ()Ljava/lang/String;
    //   18: astore_0
    //   19: aload_0
    //   20: invokevirtual length : ()I
    //   23: istore_3
    //   24: iload_3
    //   25: ifne -> 34
    //   28: iload_1
    //   29: ireturn
    //   30: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   33: athrow
    //   34: iconst_0
    //   35: istore #4
    //   37: aload_0
    //   38: iconst_0
    //   39: invokevirtual charAt : (I)C
    //   42: istore #5
    //   44: iload #5
    //   46: bipush #43
    //   48: if_icmpne -> 66
    //   51: aload_0
    //   52: iconst_1
    //   53: invokevirtual substring : (I)Ljava/lang/String;
    //   56: astore_0
    //   57: aload_0
    //   58: invokevirtual length : ()I
    //   61: istore_3
    //   62: iload_2
    //   63: ifeq -> 83
    //   66: iload #5
    //   68: bipush #45
    //   70: if_icmpne -> 83
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   79: athrow
    //   80: iconst_1
    //   81: istore #4
    //   83: iload #4
    //   85: iload_3
    //   86: if_icmpge -> 136
    //   89: aload_0
    //   90: iload #4
    //   92: invokevirtual charAt : (I)C
    //   95: istore #6
    //   97: iload #6
    //   99: bipush #57
    //   101: if_icmpgt -> 118
    //   104: iload #6
    //   106: bipush #48
    //   108: if_icmpge -> 129
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   117: athrow
    //   118: aload_0
    //   119: iconst_1
    //   120: invokestatic ZE : (Ljava/lang/String;Z)D
    //   123: d2i
    //   124: ireturn
    //   125: astore #7
    //   127: iload_1
    //   128: ireturn
    //   129: iinc #4, 1
    //   132: iload_2
    //   133: ifeq -> 83
    //   136: aload_0
    //   137: invokestatic parseInt : (Ljava/lang/String;)I
    //   140: ireturn
    //   141: astore #6
    //   143: iload_1
    //   144: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	10	10	java/lang/NumberFormatException
    //   24	30	30	java/lang/NumberFormatException
    //   62	73	76	java/lang/NumberFormatException
    //   97	111	114	java/lang/NumberFormatException
    //   118	124	125	java/lang/NumberFormatException
    //   136	140	141	java/lang/NumberFormatException
  }
  
  public static long Zd(String paramString, long paramLong) {
    // Byte code:
    //   0: invokestatic ZD : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: ifnonnull -> 14
    //   8: lload_1
    //   9: lreturn
    //   10: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   13: athrow
    //   14: aload_0
    //   15: invokevirtual trim : ()Ljava/lang/String;
    //   18: astore_0
    //   19: aload_0
    //   20: invokevirtual length : ()I
    //   23: istore #4
    //   25: iload #4
    //   27: ifne -> 36
    //   30: lload_1
    //   31: lreturn
    //   32: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   35: athrow
    //   36: iconst_0
    //   37: istore #5
    //   39: aload_0
    //   40: iconst_0
    //   41: invokevirtual charAt : (I)C
    //   44: istore #6
    //   46: iload #6
    //   48: bipush #43
    //   50: if_icmpne -> 69
    //   53: aload_0
    //   54: iconst_1
    //   55: invokevirtual substring : (I)Ljava/lang/String;
    //   58: astore_0
    //   59: aload_0
    //   60: invokevirtual length : ()I
    //   63: istore #4
    //   65: iload_3
    //   66: ifne -> 86
    //   69: iload #6
    //   71: bipush #45
    //   73: if_icmpne -> 86
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   82: athrow
    //   83: iconst_1
    //   84: istore #5
    //   86: iload #5
    //   88: iload #4
    //   90: if_icmpge -> 140
    //   93: aload_0
    //   94: iload #5
    //   96: invokevirtual charAt : (I)C
    //   99: istore #7
    //   101: iload #7
    //   103: bipush #57
    //   105: if_icmpgt -> 122
    //   108: iload #7
    //   110: bipush #48
    //   112: if_icmpge -> 133
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   121: athrow
    //   122: aload_0
    //   123: iconst_1
    //   124: invokestatic ZE : (Ljava/lang/String;Z)D
    //   127: d2l
    //   128: lreturn
    //   129: astore #8
    //   131: lload_1
    //   132: lreturn
    //   133: iinc #5, 1
    //   136: iload_3
    //   137: ifne -> 86
    //   140: aload_0
    //   141: invokestatic parseLong : (Ljava/lang/String;)J
    //   144: lreturn
    //   145: astore #7
    //   147: lload_1
    //   148: lreturn
    // Exception table:
    //   from	to	target	type
    //   4	10	10	java/lang/NumberFormatException
    //   25	32	32	java/lang/NumberFormatException
    //   65	76	79	java/lang/NumberFormatException
    //   101	115	118	java/lang/NumberFormatException
    //   122	128	129	java/lang/NumberFormatException
    //   140	144	145	java/lang/NumberFormatException
  }
  
  public static double ZE(String paramString, boolean paramBoolean) throws NumberFormatException {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return paramBoolean ? Zt.Z_(paramString) : Double.parseDouble(paramString);
  }
  
  public static float ZT(String paramString, boolean paramBoolean) throws NumberFormatException {
    try {
      if (paramBoolean)
        return Zi.Zk(paramString); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return Float.parseFloat(paramString);
  }
  
  public static BigDecimal Zu(String paramString, boolean paramBoolean) throws NumberFormatException {
    try {
      if (paramBoolean)
        return Zvp.Zt(paramString); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return Zvp.ZB(paramString);
  }
  
  public static BigInteger ZI(String paramString, boolean paramBoolean) throws NumberFormatException {
    try {
      if (paramBoolean)
        return Zvf.Zg(paramString); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return new BigInteger(paramString);
  }
  
  public static BigInteger Z_(String paramString, int paramInt, boolean paramBoolean) throws NumberFormatException {
    try {
      if (paramBoolean)
        return Zvf.ZS(paramString, paramInt); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return new BigInteger(paramString, paramInt);
  }
  
  public static boolean ZA(String paramString) {
    try {
      if (paramString != null)
        try {
          if (ZU.matcher(paramString).matches());
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zn : ()I
    //   3: ifeq -> 10
    //   6: iconst_3
    //   7: invokestatic ZY : (I)V
    //   10: bipush #54
    //   12: ldc '-DI>aZ[Vf?)fD-_-\CIG`qDg1]Bf+Z\\nGO2=>'
    //   14: iconst_m1
    //   15: goto -> 22
    //   18: astore_0
    //   19: goto -> 162
    //   22: dup_x2
    //   23: pop
    //   24: invokevirtual toCharArray : ()[C
    //   27: dup_x1
    //   28: arraylength
    //   29: dup_x2
    //   30: pop
    //   31: iconst_0
    //   32: istore_1
    //   33: dup2_x1
    //   34: pop2
    //   35: dup_x2
    //   36: iconst_1
    //   37: if_icmpgt -> 136
    //   40: dup2
    //   41: swap
    //   42: iload_1
    //   43: dup2_x1
    //   44: caload
    //   45: swap
    //   46: iload_1
    //   47: bipush #7
    //   49: irem
    //   50: tableswitch default -> 118, 0 -> 88, 1 -> 93, 2 -> 98, 3 -> 103, 4 -> 108, 5 -> 113
    //   88: bipush #64
    //   90: goto -> 120
    //   93: bipush #89
    //   95: goto -> 120
    //   98: bipush #13
    //   100: goto -> 120
    //   103: bipush #34
    //   105: goto -> 120
    //   108: bipush #55
    //   110: goto -> 120
    //   113: bipush #12
    //   115: goto -> 120
    //   118: bipush #92
    //   120: ixor
    //   121: ixor
    //   122: i2c
    //   123: castore
    //   124: iinc #1, 1
    //   127: dup
    //   128: ifne -> 136
    //   131: dup2
    //   132: dup_x1
    //   133: goto -> 43
    //   136: dup2_x1
    //   137: pop2
    //   138: dup_x2
    //   139: iload_1
    //   140: if_icmpgt -> 40
    //   143: pop
    //   144: new java/lang/String
    //   147: dup_x1
    //   148: swap
    //   149: invokespecial <init> : ([C)V
    //   152: invokevirtual intern : ()Ljava/lang/String;
    //   155: swap
    //   156: pop
    //   157: swap
    //   158: pop
    //   159: goto -> 18
    //   162: ldc2_w -9223372036854775808
    //   165: invokestatic valueOf : (J)Ljava/lang/String;
    //   168: iconst_1
    //   169: invokevirtual substring : (I)Ljava/lang/String;
    //   172: putstatic com/fasterxml/Zyt.Zm : Ljava/lang/String;
    //   175: ldc2_w 9223372036854775807
    //   178: invokestatic valueOf : (J)Ljava/lang/String;
    //   181: putstatic com/fasterxml/Zyt.ZP : Ljava/lang/String;
    //   184: aload_0
    //   185: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   188: putstatic com/fasterxml/Zyt.ZU : Ljava/util/regex/Pattern;
    //   191: return
  }
  
  public static void ZY(int paramInt) {
    Zl = paramInt;
  }
  
  public static int ZD() {
    return Zl;
  }
  
  public static int Zn() {
    int i = ZD();
    try {
      if (i == 0)
        return 119; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zyt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */