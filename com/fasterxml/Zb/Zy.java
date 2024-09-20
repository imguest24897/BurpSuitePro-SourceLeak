package com.fasterxml.Zb;

import burp.Zbqc;
import com.fasterxml.Zc.Zf;
import java.io.Serializable;
import java.util.Arrays;

public final class Zy implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private final transient int[] ZG = new int[128];
  
  private final transient char[] ZS = new char[64];
  
  private final transient byte[] Zp = new byte[64];
  
  final String ZL;
  
  private final char ZO;
  
  private final int ZF;
  
  private final boolean Zm;
  
  private final Zc Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zy(String paramString1, String paramString2, boolean paramBoolean, char paramChar, int paramInt) {
    this.ZL = paramString1;
    this.Zm = paramBoolean;
    this.ZO = paramChar;
    this.ZF = paramInt;
    int i = paramString2.length();
    try {
      if (i != 64)
        throw new IllegalArgumentException(a(5711, 30569) + i + ")"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramString2.getChars(0, i, this.ZS, 0);
    Arrays.fill(this.ZG, -1);
    for (byte b = 0; b < i; b++) {
      char c = this.ZS[b];
      this.Zp[b] = (byte)c;
      this.ZG[c] = b;
    } 
    try {
      if (paramBoolean)
        this.ZG[paramChar] = -2; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Z_ = paramBoolean ? Zc.PADDING_REQUIRED : Zc.PADDING_FORBIDDEN;
  }
  
  public Zy(Zy paramZy, String paramString, int paramInt) {
    this(paramZy, paramString, paramZy.Zm, paramZy.ZO, paramInt);
  }
  
  public Zy(Zy paramZy, String paramString, boolean paramBoolean, char paramChar, int paramInt) {
    this(paramZy, paramString, paramBoolean, paramChar, paramZy.Z_, paramInt);
  }
  
  private Zy(Zy paramZy, String paramString, boolean paramBoolean, char paramChar, Zc paramZc, int paramInt) {
    this.ZL = paramString;
    byte[] arrayOfByte = paramZy.Zp;
    System.arraycopy(arrayOfByte, 0, this.Zp, 0, arrayOfByte.length);
    char[] arrayOfChar = paramZy.ZS;
    System.arraycopy(arrayOfChar, 0, this.ZS, 0, arrayOfChar.length);
    int[] arrayOfInt = paramZy.ZG;
    System.arraycopy(arrayOfInt, 0, this.ZG, 0, arrayOfInt.length);
    this.Zm = paramBoolean;
    this.ZO = paramChar;
    this.ZF = paramInt;
    this.Z_ = paramZc;
  }
  
  protected Object readResolve() {
    Zy zy = Zmw.ZE(this.ZL);
    try {
      if (this.Zm == zy.Zm)
        try {
          if (this.ZO == zy.ZO)
            try {
              if (this.Z_ == zy.Z_)
                try {
                  if (this.ZF == zy.ZF)
                    try {
                      return (this.Zm == zy.Zm) ? zy : new Zy(zy, this.ZL, this.Zm, this.ZO, this.Z_, this.ZF);
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    }  
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                }  
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zy(zy, this.ZL, this.Zm, this.ZO, this.Z_, this.ZF);
  }
  
  public String Zg() {
    return this.ZL;
  }
  
  public boolean Zq() {
    return this.Zm;
  }
  
  public boolean ZX() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.Z_ == Zc.PADDING_REQUIRED);
  }
  
  public boolean ZS() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.Z_ != Zc.PADDING_FORBIDDEN);
  }
  
  public boolean Zt(char paramChar) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramChar == this.ZO);
  }
  
  public boolean ZK(int paramInt) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramInt == this.ZO);
  }
  
  public char Zx() {
    return this.ZO;
  }
  
  public int ZZ() {
    return this.ZF;
  }
  
  public int Zd(char paramChar) {
    char c = paramChar;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (c <= '') ? this.ZG[c] : -1;
  }
  
  public int Zd(int paramInt) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramInt <= 127) ? this.ZG[paramInt] : -1;
  }
  
  public int ZH(int paramInt1, char[] paramArrayOfchar, int paramInt2) {
    paramArrayOfchar[paramInt2++] = this.ZS[paramInt1 >> 18 & 0x3F];
    paramArrayOfchar[paramInt2++] = this.ZS[paramInt1 >> 12 & 0x3F];
    paramArrayOfchar[paramInt2++] = this.ZS[paramInt1 >> 6 & 0x3F];
    paramArrayOfchar[paramInt2++] = this.ZS[paramInt1 & 0x3F];
    return paramInt2;
  }
  
  public void Zv(StringBuilder paramStringBuilder, int paramInt) {
    paramStringBuilder.append(this.ZS[paramInt >> 18 & 0x3F]);
    paramStringBuilder.append(this.ZS[paramInt >> 12 & 0x3F]);
    paramStringBuilder.append(this.ZS[paramInt >> 6 & 0x3F]);
    paramStringBuilder.append(this.ZS[paramInt & 0x3F]);
  }
  
  public int Zt(int paramInt1, int paramInt2, char[] paramArrayOfchar, int paramInt3) {
    paramArrayOfchar[paramInt3++] = this.ZS[paramInt1 >> 18 & 0x3F];
    paramArrayOfchar[paramInt3++] = this.ZS[paramInt1 >> 12 & 0x3F];
    boolean bool = Zd.Zm();
    try {
      if (Zq()) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          paramArrayOfchar[paramInt3++] = (paramInt2 == 2) ? this.ZS[paramInt1 >> 6 & 0x3F] : this.ZO;
          paramArrayOfchar[paramInt3++] = this.ZO;
          if (!bool) {
            try {
              if (paramInt2 == 2)
                paramArrayOfchar[paramInt3++] = this.ZS[paramInt1 >> 6 & 0x3F]; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return paramInt3;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return paramInt3;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramInt2 == 2)
        paramArrayOfchar[paramInt3++] = this.ZS[paramInt1 >> 6 & 0x3F]; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramInt3;
  }
  
  public void ZE(StringBuilder paramStringBuilder, int paramInt1, int paramInt2) {
    paramStringBuilder.append(this.ZS[paramInt1 >> 18 & 0x3F]);
    boolean bool = Zd.Zm();
    try {
      paramStringBuilder.append(this.ZS[paramInt1 >> 12 & 0x3F]);
      if (Zq()) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          paramStringBuilder.append((paramInt2 == 2) ? this.ZS[paramInt1 >> 6 & 0x3F] : this.ZO);
          paramStringBuilder.append(this.ZO);
          if (!bool) {
            try {
              if (paramInt2 == 2)
                paramStringBuilder.append(this.ZS[paramInt1 >> 6 & 0x3F]); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramInt2 == 2)
        paramStringBuilder.append(this.ZS[paramInt1 >> 6 & 0x3F]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public int ZS(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    paramArrayOfbyte[paramInt2++] = this.Zp[paramInt1 >> 18 & 0x3F];
    paramArrayOfbyte[paramInt2++] = this.Zp[paramInt1 >> 12 & 0x3F];
    paramArrayOfbyte[paramInt2++] = this.Zp[paramInt1 >> 6 & 0x3F];
    paramArrayOfbyte[paramInt2++] = this.Zp[paramInt1 & 0x3F];
    return paramInt2;
  }
  
  public int Zs(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3) {
    paramArrayOfbyte[paramInt3++] = this.Zp[paramInt1 >> 18 & 0x3F];
    boolean bool = Zd.Zm();
    paramArrayOfbyte[paramInt3++] = this.Zp[paramInt1 >> 12 & 0x3F];
    if (Zq()) {
      byte b = (byte)this.ZO;
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        paramArrayOfbyte[paramInt3++] = (paramInt2 == 2) ? this.Zp[paramInt1 >> 6 & 0x3F] : b;
        paramArrayOfbyte[paramInt3++] = b;
        if (!bool) {
          try {
            if (paramInt2 == 2)
              paramArrayOfbyte[paramInt3++] = this.Zp[paramInt1 >> 6 & 0x3F]; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          return paramInt3;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return paramInt3;
    } 
    try {
      if (paramInt2 == 2)
        paramArrayOfbyte[paramInt3++] = this.Zp[paramInt1 >> 6 & 0x3F]; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramInt3;
  }
  
  public String ZS(byte[] paramArrayOfbyte) {
    return Zn(paramArrayOfbyte, false);
  }
  
  public String Zn(byte[] paramArrayOfbyte, boolean paramBoolean) {
    int i = paramArrayOfbyte.length;
    StringBuilder stringBuilder = new StringBuilder(i + (i >> 2) + (i >> 3));
    boolean bool = Zd.Zm();
    try {
      if (paramBoolean)
        stringBuilder.append('"'); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int j = ZZ() >> 2;
    byte b = 0;
    int k = i - 3;
    while (b <= k) {
      int n = paramArrayOfbyte[b++] << 8;
      n |= paramArrayOfbyte[b++] & 0xFF;
      n = n << 8 | paramArrayOfbyte[b++] & 0xFF;
      Zv(stringBuilder, n);
      if (--j <= 0) {
        stringBuilder.append('\\');
        stringBuilder.append('n');
        j = ZZ() >> 2;
      } 
      if (!bool)
        break; 
    } 
    int m = i - b;
    if (m > 0) {
      int n = paramArrayOfbyte[b++] << 16;
      if (m == 2)
        n |= (paramArrayOfbyte[b++] & 0xFF) << 8; 
      ZE(stringBuilder, n, m);
    } 
    try {
      if (paramBoolean)
        stringBuilder.append('"'); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        Zd.ZM(!bool);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return stringBuilder.toString();
  }
  
  public byte[] ZF(String paramString) throws IllegalArgumentException {
    Zf zf = new Zf();
    Zj(paramString, zf);
    return zf.ZA();
  }
  
  public void Zj(String paramString, Zf paramZf) throws IllegalArgumentException {
    // Byte code:
    //   0: invokestatic Zm : ()Z
    //   3: iconst_0
    //   4: istore #4
    //   6: aload_1
    //   7: invokevirtual length : ()I
    //   10: istore #5
    //   12: istore_3
    //   13: iload #4
    //   15: iload #5
    //   17: if_icmplt -> 24
    //   20: iload_3
    //   21: ifne -> 527
    //   24: aload_1
    //   25: iload #4
    //   27: iinc #4, 1
    //   30: invokevirtual charAt : (I)C
    //   33: istore #6
    //   35: iload #6
    //   37: bipush #32
    //   39: if_icmple -> 13
    //   42: aload_0
    //   43: iload #6
    //   45: invokevirtual Zd : (C)I
    //   48: istore #7
    //   50: iload #7
    //   52: ifge -> 70
    //   55: aload_0
    //   56: iload #6
    //   58: iconst_0
    //   59: aconst_null
    //   60: invokevirtual ZJ : (CILjava/lang/String;)V
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   69: athrow
    //   70: iload #7
    //   72: istore #8
    //   74: iload #4
    //   76: iload #5
    //   78: if_icmplt -> 92
    //   81: aload_0
    //   82: invokevirtual ZJ : ()V
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   91: athrow
    //   92: aload_1
    //   93: iload #4
    //   95: iinc #4, 1
    //   98: invokevirtual charAt : (I)C
    //   101: istore #6
    //   103: aload_0
    //   104: iload #6
    //   106: invokevirtual Zd : (C)I
    //   109: istore #7
    //   111: iload #7
    //   113: ifge -> 131
    //   116: aload_0
    //   117: iload #6
    //   119: iconst_1
    //   120: aconst_null
    //   121: invokevirtual ZJ : (CILjava/lang/String;)V
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   130: athrow
    //   131: iload #8
    //   133: bipush #6
    //   135: ishl
    //   136: iload #7
    //   138: ior
    //   139: istore #8
    //   141: iload #4
    //   143: iload #5
    //   145: if_icmplt -> 189
    //   148: aload_0
    //   149: invokevirtual ZX : ()Z
    //   152: ifne -> 178
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   161: athrow
    //   162: iload #8
    //   164: iconst_4
    //   165: ishr
    //   166: istore #8
    //   168: aload_2
    //   169: iload #8
    //   171: invokevirtual ZX : (I)V
    //   174: iload_3
    //   175: ifne -> 527
    //   178: aload_0
    //   179: invokevirtual ZJ : ()V
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   188: athrow
    //   189: aload_1
    //   190: iload #4
    //   192: iinc #4, 1
    //   195: invokevirtual charAt : (I)C
    //   198: istore #6
    //   200: aload_0
    //   201: iload #6
    //   203: invokevirtual Zd : (C)I
    //   206: istore #7
    //   208: iload #7
    //   210: ifge -> 362
    //   213: iload #7
    //   215: bipush #-2
    //   217: if_icmpeq -> 242
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   226: athrow
    //   227: aload_0
    //   228: iload #6
    //   230: iconst_2
    //   231: aconst_null
    //   232: invokevirtual ZJ : (CILjava/lang/String;)V
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   241: athrow
    //   242: aload_0
    //   243: invokevirtual ZS : ()Z
    //   246: ifne -> 260
    //   249: aload_0
    //   250: invokevirtual Zv : ()V
    //   253: goto -> 260
    //   256: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   259: athrow
    //   260: iload #4
    //   262: iload #5
    //   264: if_icmplt -> 278
    //   267: aload_0
    //   268: invokevirtual ZJ : ()V
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   277: athrow
    //   278: aload_1
    //   279: iload #4
    //   281: iinc #4, 1
    //   284: invokevirtual charAt : (I)C
    //   287: istore #6
    //   289: aload_0
    //   290: iload #6
    //   292: invokevirtual Zt : (C)Z
    //   295: ifne -> 346
    //   298: aload_0
    //   299: iload #6
    //   301: iconst_3
    //   302: new java/lang/StringBuilder
    //   305: dup
    //   306: invokespecial <init> : ()V
    //   309: sipush #5709
    //   312: sipush #-11554
    //   315: invokestatic a : (II)Ljava/lang/String;
    //   318: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: aload_0
    //   322: invokevirtual Zx : ()C
    //   325: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   328: ldc '''
    //   330: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: invokevirtual toString : ()Ljava/lang/String;
    //   336: invokevirtual ZJ : (CILjava/lang/String;)V
    //   339: goto -> 346
    //   342: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   345: athrow
    //   346: iload #8
    //   348: iconst_4
    //   349: ishr
    //   350: istore #8
    //   352: aload_2
    //   353: iload #8
    //   355: invokevirtual ZX : (I)V
    //   358: iload_3
    //   359: ifne -> 13
    //   362: iload #8
    //   364: bipush #6
    //   366: ishl
    //   367: iload #7
    //   369: ior
    //   370: istore #8
    //   372: iload #4
    //   374: iload #5
    //   376: if_icmplt -> 420
    //   379: aload_0
    //   380: invokevirtual ZX : ()Z
    //   383: ifne -> 409
    //   386: goto -> 393
    //   389: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   392: athrow
    //   393: iload #8
    //   395: iconst_2
    //   396: ishr
    //   397: istore #8
    //   399: aload_2
    //   400: iload #8
    //   402: invokevirtual Zp : (I)V
    //   405: iload_3
    //   406: ifne -> 527
    //   409: aload_0
    //   410: invokevirtual ZJ : ()V
    //   413: goto -> 420
    //   416: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   419: athrow
    //   420: aload_1
    //   421: iload #4
    //   423: iinc #4, 1
    //   426: invokevirtual charAt : (I)C
    //   429: istore #6
    //   431: aload_0
    //   432: iload #6
    //   434: invokevirtual Zd : (C)I
    //   437: istore #7
    //   439: iload #7
    //   441: ifge -> 507
    //   444: iload #7
    //   446: bipush #-2
    //   448: if_icmpeq -> 473
    //   451: goto -> 458
    //   454: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   457: athrow
    //   458: aload_0
    //   459: iload #6
    //   461: iconst_3
    //   462: aconst_null
    //   463: invokevirtual ZJ : (CILjava/lang/String;)V
    //   466: goto -> 473
    //   469: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   472: athrow
    //   473: aload_0
    //   474: invokevirtual ZS : ()Z
    //   477: ifne -> 491
    //   480: aload_0
    //   481: invokevirtual Zv : ()V
    //   484: goto -> 491
    //   487: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   490: athrow
    //   491: iload #8
    //   493: iconst_2
    //   494: ishr
    //   495: istore #8
    //   497: aload_2
    //   498: iload #8
    //   500: invokevirtual Zp : (I)V
    //   503: iload_3
    //   504: ifne -> 523
    //   507: iload #8
    //   509: bipush #6
    //   511: ishl
    //   512: iload #7
    //   514: ior
    //   515: istore #8
    //   517: aload_2
    //   518: iload #8
    //   520: invokevirtual ZZ : (I)V
    //   523: iload_3
    //   524: ifne -> 13
    //   527: return
    // Exception table:
    //   from	to	target	type
    //   50	63	66	java/lang/IllegalArgumentException
    //   74	85	88	java/lang/IllegalArgumentException
    //   111	124	127	java/lang/IllegalArgumentException
    //   141	155	158	java/lang/IllegalArgumentException
    //   168	182	185	java/lang/IllegalArgumentException
    //   208	220	223	java/lang/IllegalArgumentException
    //   213	235	238	java/lang/IllegalArgumentException
    //   242	253	256	java/lang/IllegalArgumentException
    //   260	271	274	java/lang/IllegalArgumentException
    //   289	339	342	java/lang/IllegalArgumentException
    //   372	386	389	java/lang/IllegalArgumentException
    //   399	413	416	java/lang/IllegalArgumentException
    //   439	451	454	java/lang/IllegalArgumentException
    //   444	466	469	java/lang/IllegalArgumentException
    //   473	484	487	java/lang/IllegalArgumentException
  }
  
  public String toString() {
    return this.ZL;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject == this)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (paramObject.getClass() != getClass())
            return false; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zy zy = (Zy)paramObject;
    try {
      if (zy.ZO == this.ZO)
        try {
          if (zy.ZF == this.ZF)
            try {
              if (zy.Zm == this.Zm)
                try {
                  if (zy.Z_ == this.Z_)
                    try {
                      if (this.ZL.equals(zy.ZL));
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    }  
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                }  
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.ZL.hashCode();
  }
  
  protected void ZJ(char paramChar, int paramInt, String paramString) throws IllegalArgumentException {
    // Byte code:
    //   0: invokestatic ZR : ()Z
    //   3: istore #4
    //   5: iload_1
    //   6: bipush #32
    //   8: if_icmpgt -> 77
    //   11: new java/lang/StringBuilder
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: sipush #5707
    //   21: sipush #-31784
    //   24: invokestatic a : (II)Ljava/lang/String;
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: iload_1
    //   31: invokestatic toHexString : (I)Ljava/lang/String;
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: sipush #5708
    //   40: sipush #4411
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: iload_2
    //   50: iconst_1
    //   51: iadd
    //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   55: sipush #5698
    //   58: sipush #26543
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual toString : ()Ljava/lang/String;
    //   70: astore #5
    //   72: iload #4
    //   74: ifeq -> 292
    //   77: aload_0
    //   78: iload_1
    //   79: invokevirtual Zt : (C)Z
    //   82: ifeq -> 158
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   91: athrow
    //   92: new java/lang/StringBuilder
    //   95: dup
    //   96: invokespecial <init> : ()V
    //   99: sipush #5706
    //   102: sipush #-2832
    //   105: invokestatic a : (II)Ljava/lang/String;
    //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: aload_0
    //   112: invokevirtual Zx : ()C
    //   115: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   118: sipush #5696
    //   121: sipush #-15602
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: iload_2
    //   131: iconst_1
    //   132: iadd
    //   133: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   136: sipush #5699
    //   139: sipush #-4570
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: invokevirtual toString : ()Ljava/lang/String;
    //   151: astore #5
    //   153: iload #4
    //   155: ifeq -> 292
    //   158: iload_1
    //   159: invokestatic isDefined : (C)Z
    //   162: ifeq -> 186
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   171: athrow
    //   172: iload_1
    //   173: invokestatic isISOControl : (C)Z
    //   176: ifeq -> 233
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   185: athrow
    //   186: new java/lang/StringBuilder
    //   189: dup
    //   190: invokespecial <init> : ()V
    //   193: sipush #5703
    //   196: bipush #-65
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: iload_1
    //   205: invokestatic toHexString : (I)Ljava/lang/String;
    //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: sipush #5700
    //   214: sipush #2029
    //   217: invokestatic a : (II)Ljava/lang/String;
    //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: invokevirtual toString : ()Ljava/lang/String;
    //   226: astore #5
    //   228: iload #4
    //   230: ifeq -> 292
    //   233: new java/lang/StringBuilder
    //   236: dup
    //   237: invokespecial <init> : ()V
    //   240: sipush #5701
    //   243: sipush #-20988
    //   246: invokestatic a : (II)Ljava/lang/String;
    //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: iload_1
    //   253: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   256: sipush #5697
    //   259: sipush #27322
    //   262: invokestatic a : (II)Ljava/lang/String;
    //   265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: iload_1
    //   269: invokestatic toHexString : (I)Ljava/lang/String;
    //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: sipush #5704
    //   278: sipush #30892
    //   281: invokestatic a : (II)Ljava/lang/String;
    //   284: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   287: invokevirtual toString : ()Ljava/lang/String;
    //   290: astore #5
    //   292: aload_3
    //   293: ifnull -> 329
    //   296: new java/lang/StringBuilder
    //   299: dup
    //   300: invokespecial <init> : ()V
    //   303: aload #5
    //   305: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: sipush #5702
    //   311: sipush #-5263
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: aload_3
    //   321: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: invokevirtual toString : ()Ljava/lang/String;
    //   327: astore #5
    //   329: new java/lang/IllegalArgumentException
    //   332: dup
    //   333: aload #5
    //   335: invokespecial <init> : (Ljava/lang/String;)V
    //   338: athrow
    // Exception table:
    //   from	to	target	type
    //   72	85	88	java/lang/IllegalArgumentException
    //   153	165	168	java/lang/IllegalArgumentException
    //   158	179	182	java/lang/IllegalArgumentException
  }
  
  protected void ZJ() throws IllegalArgumentException {
    throw new IllegalArgumentException(ZF());
  }
  
  protected void Zv() throws IllegalArgumentException {
    throw new IllegalArgumentException(Ze());
  }
  
  protected String Ze() {
    return String.format(a(5705, -13086), new Object[] { Zg() });
  }
  
  public String ZF() {
    return String.format(a(5710, 27964), new Object[] { Zg(), Character.valueOf(Zx()) });
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'je{Ñ¾«rm6+ÌxG/¤_0"¦'\\n-ÿMmþ+¦cÒµH?7HÇÒþnygÀC0`aÇIâ@ÑµÀÁ>È2NcøÂ2Jk®«scÉßZo\\b$?cmÍ÷\\rQ·ýfÞ¼4}ÖVa?<ÖÍ-Ì>uðÃÄÈ?lÍÞHê{v±¹Ç÷¯ÆFýAùÉ`HotPs\\nÇI%ôÑ¶÷­Ì*DÔ:Ð­Ó|êÊrÐÇÔ)+ð=Gpæ)£®Áñh&r¢«~ü·9é¬öxÐM~©"Ö:nt´{(Ü¤§\\fS²ZDÌñ§Cðð9n.ÆÉµÖ\³L7?Ù£Þ!¥7du\\fUÀþJú°ðÐ×ºútC2?Àcd}U½#>´Ü8=\\n?¼`³{òÜýçÉÎT¢ÚsG~U5ÝKå>öÐý\\n7 ÄN^oÝT ºî26½³+/g»oxÐß µÆÌX#äxM¢í:PJ4b1¾¦¢+eí^ú·»Éà¨\\rË'û£>\\røë"Ìè§U}ms8S5Òµý2öËîÆÉG <1Z!Â.FYâx­>Ðá3æ¤®s¢ H3+^gÑ£{ô\\fK}'9*£õb3íÌ\\tÇe¯) pªB\\n ½¼ÖÒêR3í ¬ÍÑ|?¹¶!R­ÃecÇ]~Íà÷-Þïù@<áÁu_Ë}È®íG±nPâ\\rBÁ)HaÌ){ty\\n¦È.ëØû}PáJï ¶!.CyJÞ áXX8·×à$43¿¢kZO}öº·é7g=Ý¡9p(D~+\\tðÎyLÉÖÆ¼ãÎ_Ì&yOî³ä'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #19
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #69
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '}·ûTß§5mµ\\t·k×\\n±yRvø³.^é'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #35
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic com/fasterxml/Zb/Zy.a : [Ljava/lang/String;
    //   131: bipush #16
    //   133: anewarray java/lang/String
    //   136: putstatic com/fasterxml/Zb/Zy.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #116
    //   214: goto -> 244
    //   217: bipush #62
    //   219: goto -> 244
    //   222: bipush #48
    //   224: goto -> 244
    //   227: bipush #81
    //   229: goto -> 244
    //   232: bipush #49
    //   234: goto -> 244
    //   237: bipush #11
    //   239: goto -> 244
    //   242: bipush #31
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1648) & 0xFFFF;
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
      byte b1 = 93;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */