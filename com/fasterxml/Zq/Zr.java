package com.fasterxml.Zq;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zma;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zmr;
import com.fasterxml.Zc.Zs;
import com.fasterxml.Zlr;
import com.fasterxml.Zof.Za;
import com.fasterxml.Zof.Zn;
import com.fasterxml.Zr.Za;
import com.fasterxml.Zr.Zm;
import com.fasterxml.Zv9;
import com.fasterxml.Zy4;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public final class Zr {
  private final Zv9 Za;
  
  private final InputStream ZO;
  
  private final byte[] Zn;
  
  private int ZS;
  
  private int Zt;
  
  private final boolean ZA;
  
  private boolean Zp = true;
  
  private int ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zr(Zv9 paramZv9, InputStream paramInputStream) {
    this.Za = paramZv9;
    this.ZO = paramInputStream;
    this.Zn = paramZv9.ZL();
    this.Zt = this.ZS = 0;
    this.ZA = true;
  }
  
  public Zr(Zv9 paramZv9, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.Za = paramZv9;
    this.ZO = null;
    this.Zn = paramArrayOfbyte;
    this.ZS = paramInt1;
    this.Zt = paramInt1 + paramInt2;
    this.ZA = false;
  }
  
  public Zma Zk() throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: iconst_0
    //   4: istore_2
    //   5: istore_1
    //   6: aload_0
    //   7: iconst_4
    //   8: invokevirtual ZB : (I)Z
    //   11: ifeq -> 140
    //   14: aload_0
    //   15: getfield Zn : [B
    //   18: aload_0
    //   19: getfield ZS : I
    //   22: baload
    //   23: bipush #24
    //   25: ishl
    //   26: aload_0
    //   27: getfield Zn : [B
    //   30: aload_0
    //   31: getfield ZS : I
    //   34: iconst_1
    //   35: iadd
    //   36: baload
    //   37: sipush #255
    //   40: iand
    //   41: bipush #16
    //   43: ishl
    //   44: ior
    //   45: aload_0
    //   46: getfield Zn : [B
    //   49: aload_0
    //   50: getfield ZS : I
    //   53: iconst_2
    //   54: iadd
    //   55: baload
    //   56: sipush #255
    //   59: iand
    //   60: bipush #8
    //   62: ishl
    //   63: ior
    //   64: aload_0
    //   65: getfield Zn : [B
    //   68: aload_0
    //   69: getfield ZS : I
    //   72: iconst_3
    //   73: iadd
    //   74: baload
    //   75: sipush #255
    //   78: iand
    //   79: ior
    //   80: istore_3
    //   81: aload_0
    //   82: iload_3
    //   83: invokespecial Zj : (I)Z
    //   86: ifeq -> 95
    //   89: iconst_1
    //   90: istore_2
    //   91: iload_1
    //   92: ifeq -> 136
    //   95: aload_0
    //   96: iload_3
    //   97: invokespecial ZQ : (I)Z
    //   100: ifeq -> 116
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   109: athrow
    //   110: iconst_1
    //   111: istore_2
    //   112: iload_1
    //   113: ifeq -> 136
    //   116: aload_0
    //   117: iload_3
    //   118: bipush #16
    //   120: iushr
    //   121: invokespecial Zf : (I)Z
    //   124: ifeq -> 136
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   133: athrow
    //   134: iconst_1
    //   135: istore_2
    //   136: iload_1
    //   137: ifeq -> 198
    //   140: aload_0
    //   141: iconst_2
    //   142: invokevirtual ZB : (I)Z
    //   145: ifeq -> 198
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   154: athrow
    //   155: aload_0
    //   156: getfield Zn : [B
    //   159: aload_0
    //   160: getfield ZS : I
    //   163: baload
    //   164: sipush #255
    //   167: iand
    //   168: bipush #8
    //   170: ishl
    //   171: aload_0
    //   172: getfield Zn : [B
    //   175: aload_0
    //   176: getfield ZS : I
    //   179: iconst_1
    //   180: iadd
    //   181: baload
    //   182: sipush #255
    //   185: iand
    //   186: ior
    //   187: istore_3
    //   188: aload_0
    //   189: iload_3
    //   190: invokespecial Zf : (I)Z
    //   193: ifeq -> 198
    //   196: iconst_1
    //   197: istore_2
    //   198: iload_2
    //   199: ifne -> 210
    //   202: getstatic com/fasterxml/Zb/Zma.UTF8 : Lcom/fasterxml/Zb/Zma;
    //   205: astore_3
    //   206: iload_1
    //   207: ifeq -> 331
    //   210: aload_0
    //   211: getfield ZE : I
    //   214: tableswitch default -> 320, 1 -> 248, 2 -> 256, 3 -> 320, 4 -> 288
    //   244: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   247: athrow
    //   248: getstatic com/fasterxml/Zb/Zma.UTF8 : Lcom/fasterxml/Zb/Zma;
    //   251: astore_3
    //   252: iload_1
    //   253: ifeq -> 331
    //   256: aload_0
    //   257: getfield Zp : Z
    //   260: ifeq -> 280
    //   263: goto -> 270
    //   266: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   269: athrow
    //   270: getstatic com/fasterxml/Zb/Zma.UTF16_BE : Lcom/fasterxml/Zb/Zma;
    //   273: goto -> 283
    //   276: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   279: athrow
    //   280: getstatic com/fasterxml/Zb/Zma.UTF16_LE : Lcom/fasterxml/Zb/Zma;
    //   283: astore_3
    //   284: iload_1
    //   285: ifeq -> 331
    //   288: aload_0
    //   289: getfield Zp : Z
    //   292: ifeq -> 312
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   301: athrow
    //   302: getstatic com/fasterxml/Zb/Zma.UTF32_BE : Lcom/fasterxml/Zb/Zma;
    //   305: goto -> 315
    //   308: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   311: athrow
    //   312: getstatic com/fasterxml/Zb/Zma.UTF32_LE : Lcom/fasterxml/Zb/Zma;
    //   315: astore_3
    //   316: iload_1
    //   317: ifeq -> 331
    //   320: invokestatic Zt : ()Ljava/lang/Object;
    //   323: checkcast com/fasterxml/Zb/Zma
    //   326: areturn
    //   327: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   330: athrow
    //   331: aload_0
    //   332: getfield Za : Lcom/fasterxml/Zv9;
    //   335: aload_3
    //   336: invokevirtual Zs : (Lcom/fasterxml/Zb/Zma;)V
    //   339: aload_3
    //   340: areturn
    // Exception table:
    //   from	to	target	type
    //   91	103	106	java/io/IOException
    //   112	127	130	java/io/IOException
    //   136	148	151	java/io/IOException
    //   206	244	244	java/io/IOException
    //   252	263	266	java/io/IOException
    //   256	276	276	java/io/IOException
    //   284	295	298	java/io/IOException
    //   288	308	308	java/io/IOException
    //   316	327	327	java/io/IOException
  }
  
  public Reader Zx() throws IOException {
    InputStream inputStream;
    Zy4 zy4;
    Zma zma = this.Za.ZQ();
    int i = Zf.ZI();
    switch (zma.ZC()) {
      case 8:
      case 16:
        inputStream = this.ZO;
        if (inputStream == null) {
          int j = this.Zt - this.ZS;
          try {
            if (j <= 8192)
              return new StringReader(new String(this.Zn, this.ZS, j, zma.Zz())); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          inputStream = new ByteArrayInputStream(this.Zn, this.ZS, this.Zt);
          try {
            if (i != 0) {
              if (this.ZS < this.Zt)
                zy4 = new Zy4(this.Za, inputStream, this.Zn, this.ZS, this.Zt); 
              return new InputStreamReader((InputStream)zy4, zma.Zz());
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return new InputStreamReader((InputStream)zy4, zma.Zz());
        } 
        if (this.ZS < this.Zt)
          zy4 = new Zy4(this.Za, (InputStream)zy4, this.Zn, this.ZS, this.Zt); 
        return new InputStreamReader((InputStream)zy4, zma.Zz());
      case 32:
        return (Reader)new Zlr(this.Za, this.ZO, this.Zn, this.ZS, this.Zt, this.Za.ZQ().Zj());
    } 
    return (Reader)Zs.Zt();
  }
  
  public Zg Zj(int paramInt1, Zmd paramZmd, Za paramZa, Zn paramZn, int paramInt2) throws IOException {
    int i = this.ZS;
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zma zma = Zmr.CHARSET_DETECTION.ZR(paramInt2) ? Zk() : Zma.UTF8;
    int j = this.ZS - i;
    try {
      if (zma == Zma.UTF8 && Zmr.CANONICALIZE_FIELD_NAMES.ZR(paramInt2)) {
        Za za = paramZa.ZE(paramInt2);
        return (Zg)new Zl(this.Za, paramInt1, this.ZO, paramZmd, za, this.Zn, this.ZS, this.Zt, j, this.ZA);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Zg)new Zk(this.Za, paramInt1, Zx(), paramZmd, paramZn.Zt());
  }
  
  public static Zm Zx(Za paramZa) throws IOException {
    try {
      if (!paramZa.Zh())
        return Zm.INCONCLUSIVE; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = paramZa.Zn();
    try {
      if (b == -17) {
        try {
          if (!paramZa.Zh())
            return Zm.INCONCLUSIVE; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (paramZa.Zn() != -69)
            return Zm.NO_MATCH; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (!paramZa.Zh())
            return Zm.INCONCLUSIVE; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (paramZa.Zn() != -65)
            return Zm.NO_MATCH; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (!paramZa.Zh())
            return Zm.INCONCLUSIVE; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        b = paramZa.Zn();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = Zx(paramZa, b);
    try {
      if (i < 0)
        return Zm.INCONCLUSIVE; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (i == 123) {
      i = ZT(paramZa);
      try {
        if (i < 0)
          return Zm.INCONCLUSIVE; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (i != 34)
          try {
            return (i != 125) ? Zm.NO_MATCH : Zm.SOLID_MATCH;
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      return Zm.SOLID_MATCH;
    } 
    if (i == 91) {
      i = ZT(paramZa);
      try {
        if (i < 0)
          return Zm.INCONCLUSIVE; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (i != 93)
          try {
            return (i != 91) ? Zm.SOLID_MATCH : Zm.SOLID_MATCH;
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      return Zm.SOLID_MATCH;
    } 
    Zm zm = Zm.WEAK_MATCH;
    try {
      if (i == 34)
        return zm; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (i <= 57)
        try {
          if (i >= 48)
            return zm; 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (i == 45) {
      i = ZT(paramZa);
      try {
        if (i < 0)
          return Zm.INCONCLUSIVE; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (i <= 57)
          try {
            if (i >= 48);
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      return Zm.NO_MATCH;
    } 
    try {
      if (i == 110)
        return ZW(paramZa, a(21666, -10026), zm); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (i == 116)
        return ZW(paramZa, a(21667, -8077), zm); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (i == 102)
        return ZW(paramZa, a(21665, 9780), zm); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zm.NO_MATCH;
  }
  
  private static Zm ZW(Za paramZa, String paramString, Zm paramZm) throws IOException {
    byte b = 0;
    int i = Zf.ZI();
    int j = paramString.length();
    while (b < j) {
      try {
        if (!paramZa.Zh())
          return Zm.INCONCLUSIVE; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (paramZa.Zn() != paramString.charAt(b))
          return Zm.NO_MATCH; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      b++;
      if (i != 0)
        break; 
    } 
    return paramZm;
  }
  
  private static int ZT(Za paramZa) throws IOException {
    try {
      if (!paramZa.Zh())
        return -1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zx(paramZa, paramZa.Zn());
  }
  
  private static int Zx(Za paramZa, byte paramByte) throws IOException {
    while (true) {
      int i = paramByte & 0xFF;
      try {
        if (i != 32)
          try {
            if (i != 13)
              try {
                if (i != 10)
                  try {
                    if (i != 9)
                      return i; 
                  } catch (IOException iOException) {
                    throw a(null);
                  }  
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (!paramZa.Zh())
          return -1; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      paramByte = paramZa.Zn();
    } 
  }
  
  private boolean Zj(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_2
    //   4: iload_1
    //   5: lookupswitch default -> 133, -16842752 -> 113, -131072 -> 74, 65279 -> 48, 65534 -> 96
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield Zp : Z
    //   53: aload_0
    //   54: dup
    //   55: getfield ZS : I
    //   58: iconst_4
    //   59: iadd
    //   60: putfield ZS : I
    //   63: aload_0
    //   64: iconst_4
    //   65: putfield ZE : I
    //   68: iconst_1
    //   69: ireturn
    //   70: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   73: athrow
    //   74: aload_0
    //   75: dup
    //   76: getfield ZS : I
    //   79: iconst_4
    //   80: iadd
    //   81: putfield ZS : I
    //   84: aload_0
    //   85: iconst_4
    //   86: putfield ZE : I
    //   89: aload_0
    //   90: iconst_0
    //   91: putfield Zp : Z
    //   94: iconst_1
    //   95: ireturn
    //   96: aload_0
    //   97: sipush #21669
    //   100: sipush #6100
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial ZT : (Ljava/lang/String;)V
    //   109: iload_2
    //   110: ifne -> 133
    //   113: aload_0
    //   114: sipush #21664
    //   117: sipush #-6207
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: invokespecial ZT : (Ljava/lang/String;)V
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   132: athrow
    //   133: iload_1
    //   134: bipush #16
    //   136: iushr
    //   137: istore_3
    //   138: iload_3
    //   139: ldc 65279
    //   141: if_icmpne -> 170
    //   144: aload_0
    //   145: dup
    //   146: getfield ZS : I
    //   149: iconst_2
    //   150: iadd
    //   151: putfield ZS : I
    //   154: aload_0
    //   155: iconst_2
    //   156: putfield ZE : I
    //   159: aload_0
    //   160: iconst_1
    //   161: putfield Zp : Z
    //   164: iconst_1
    //   165: ireturn
    //   166: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   169: athrow
    //   170: iload_3
    //   171: ldc 65534
    //   173: if_icmpne -> 202
    //   176: aload_0
    //   177: dup
    //   178: getfield ZS : I
    //   181: iconst_2
    //   182: iadd
    //   183: putfield ZS : I
    //   186: aload_0
    //   187: iconst_2
    //   188: putfield ZE : I
    //   191: aload_0
    //   192: iconst_0
    //   193: putfield Zp : Z
    //   196: iconst_1
    //   197: ireturn
    //   198: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   201: athrow
    //   202: iload_1
    //   203: bipush #8
    //   205: iushr
    //   206: ldc 15711167
    //   208: if_icmpne -> 237
    //   211: aload_0
    //   212: dup
    //   213: getfield ZS : I
    //   216: iconst_3
    //   217: iadd
    //   218: putfield ZS : I
    //   221: aload_0
    //   222: iconst_1
    //   223: putfield ZE : I
    //   226: aload_0
    //   227: iconst_1
    //   228: putfield Zp : Z
    //   231: iconst_1
    //   232: ireturn
    //   233: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   236: athrow
    //   237: iconst_0
    //   238: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	70	70	java/io/IOException
    //   96	129	129	java/io/IOException
    //   138	166	166	java/io/IOException
    //   170	198	198	java/io/IOException
    //   202	233	233	java/io/IOException
  }
  
  private boolean ZQ(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_2
    //   4: iload_1
    //   5: bipush #8
    //   7: ishr
    //   8: ifne -> 27
    //   11: aload_0
    //   12: iconst_1
    //   13: putfield Zp : Z
    //   16: iload_2
    //   17: ifeq -> 139
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   26: athrow
    //   27: iload_1
    //   28: ldc 16777215
    //   30: iand
    //   31: ifne -> 57
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   40: athrow
    //   41: aload_0
    //   42: iconst_0
    //   43: putfield Zp : Z
    //   46: iload_2
    //   47: ifeq -> 139
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   56: athrow
    //   57: iload_1
    //   58: ldc -16711681
    //   60: iand
    //   61: ifne -> 95
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   70: athrow
    //   71: aload_0
    //   72: sipush #21668
    //   75: sipush #-7873
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: invokespecial ZT : (Ljava/lang/String;)V
    //   84: iload_2
    //   85: ifeq -> 139
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   94: athrow
    //   95: iload_1
    //   96: ldc -65281
    //   98: iand
    //   99: ifne -> 133
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   108: athrow
    //   109: aload_0
    //   110: sipush #21670
    //   113: sipush #18513
    //   116: invokestatic a : (II)Ljava/lang/String;
    //   119: invokespecial ZT : (Ljava/lang/String;)V
    //   122: iload_2
    //   123: ifeq -> 139
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   132: athrow
    //   133: iconst_0
    //   134: ireturn
    //   135: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   138: athrow
    //   139: aload_0
    //   140: iconst_4
    //   141: putfield ZE : I
    //   144: iconst_1
    //   145: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/io/IOException
    //   11	34	37	java/io/IOException
    //   27	50	53	java/io/IOException
    //   41	64	67	java/io/IOException
    //   57	88	91	java/io/IOException
    //   71	102	105	java/io/IOException
    //   95	126	129	java/io/IOException
    //   109	135	135	java/io/IOException
  }
  
  private boolean Zf(int paramInt) {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_2
    //   4: iload_1
    //   5: ldc 65280
    //   7: iand
    //   8: ifne -> 20
    //   11: aload_0
    //   12: iconst_1
    //   13: putfield Zp : Z
    //   16: iload_2
    //   17: ifne -> 39
    //   20: iload_1
    //   21: sipush #255
    //   24: iand
    //   25: ifne -> 37
    //   28: aload_0
    //   29: iconst_0
    //   30: putfield Zp : Z
    //   33: iload_2
    //   34: ifne -> 39
    //   37: iconst_0
    //   38: ireturn
    //   39: aload_0
    //   40: iconst_2
    //   41: putfield ZE : I
    //   44: iconst_1
    //   45: ireturn
  }
  
  private void ZT(String paramString) throws IOException {
    throw new CharConversionException(a(21671, -29871) + paramString + a(21673, 10538));
  }
  
  protected boolean ZB(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: getfield Zt : I
    //   7: aload_0
    //   8: getfield ZS : I
    //   11: isub
    //   12: istore_3
    //   13: istore_2
    //   14: iload_3
    //   15: iload_1
    //   16: if_icmpge -> 92
    //   19: aload_0
    //   20: getfield ZO : Ljava/io/InputStream;
    //   23: ifnonnull -> 33
    //   26: iconst_m1
    //   27: istore #4
    //   29: iload_2
    //   30: ifne -> 60
    //   33: aload_0
    //   34: getfield ZO : Ljava/io/InputStream;
    //   37: aload_0
    //   38: getfield Zn : [B
    //   41: aload_0
    //   42: getfield Zt : I
    //   45: aload_0
    //   46: getfield Zn : [B
    //   49: arraylength
    //   50: aload_0
    //   51: getfield Zt : I
    //   54: isub
    //   55: invokevirtual read : ([BII)I
    //   58: istore #4
    //   60: iload #4
    //   62: iconst_1
    //   63: if_icmpge -> 72
    //   66: iconst_0
    //   67: ireturn
    //   68: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   71: athrow
    //   72: aload_0
    //   73: dup
    //   74: getfield Zt : I
    //   77: iload #4
    //   79: iadd
    //   80: putfield Zt : I
    //   83: iload_3
    //   84: iload #4
    //   86: iadd
    //   87: istore_3
    //   88: iload_2
    //   89: ifne -> 14
    //   92: iconst_1
    //   93: ireturn
    // Exception table:
    //   from	to	target	type
    //   60	68	68	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '{\\n{òLWp`}m0òX4ÖÙFòÜWµûwvwQI!#/dñkÇX¼'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #109
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
    //   67: ldc '¤Æµ\\nI%¬anDÎ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #29
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic com/fasterxml/Zq/Zr.a : [Ljava/lang/String;
    //   130: bipush #9
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zq/Zr.b : [Ljava/lang/String;
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
    //   212: bipush #101
    //   214: goto -> 244
    //   217: bipush #15
    //   219: goto -> 244
    //   222: bipush #70
    //   224: goto -> 244
    //   227: bipush #22
    //   229: goto -> 244
    //   232: bipush #41
    //   234: goto -> 244
    //   237: bipush #43
    //   239: goto -> 244
    //   242: bipush #106
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
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x54A1) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq\Zr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */