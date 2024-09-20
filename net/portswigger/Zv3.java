package net.portswigger;

public class Zv3 {
  static final Zrmq Zh;
  
  private static final String[] Zj;
  
  private static boolean Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static String Zj(String paramString) {
    Zm9 zm9 = new Zm9();
    Zl(paramString, zm9);
    return zm9.toString();
  }
  
  public static void Zl(String paramString, Za1 paramZa1) {
    int i = 0;
    for (byte b = 0; b < paramString.length(); b++) {
      char c = paramString.charAt(b);
      try {
        if (c < 'Ā')
          try {
            if (Zj[c] != null) {
              try {
                if (c == '/')
                  try {
                    if (b > 0)
                      try {
                        if (paramString.charAt(b - 1) != '<')
                          continue; 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw a(null);
                      }  
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              paramZa1.ZF(paramString, i, b);
              paramZa1.Z_(Zj[c]);
              i = b + 1;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      continue;
    } 
    paramZa1.ZF(paramString, i, paramString.length());
  }
  
  public static Zrmq Zx(String paramString) {
    return ZR(paramString, Zdm.STRICT);
  }
  
  public static Zrmq Zp(String paramString) {
    return ZR(paramString, Zdm.LAX);
  }
  
  public static Zrmq ZD(byte[] paramArrayOfbyte) {
    return ZR(Zny.ZL(paramArrayOfbyte), Zdm.STRICT);
  }
  
  public static Zrmq Zz(byte[] paramArrayOfbyte) {
    return ZR(Zny.ZL(paramArrayOfbyte), Zdm.LAX);
  }
  
  private static Zrmq ZR(String paramString, Zdm paramZdm) {
    try {
      if (paramString != null)
        try {
          if (!paramString.isEmpty()) {
            char[] arrayOfChar = paramString.toCharArray();
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            Zrmo zrmo = new Zrmo(arrayOfChar, (paramZdm == Zdm.LAX) ? Zi9.ZB : Zi9.Zz);
            Zrmq zrmq = (new Zi9(zrmo, paramZdm, Zrx0.DISALLOW)).Zt();
            try {
              if (!zrmo.Zx().Ze())
                zrmo.Zt(); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return zrmq;
          } 
          return new Zrzb();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zrzb();
  }
  
  public static Zhq ZN(String paramString) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramString == null) ? new Zrzd() : new Zrzf(paramString);
  }
  
  public static Zhq Zf(Zij paramZij) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramZij == null) ? new Zrzd() : new Zrzw(paramZij);
  }
  
  public static Zzo ZM(Number paramNumber) {
    return new Zrz2(paramNumber);
  }
  
  public static Zzo Zr(byte paramByte) {
    return new Zrz2(Byte.valueOf(paramByte));
  }
  
  public static Zzo Zn(short paramShort) {
    return new Zrz2(Short.valueOf(paramShort));
  }
  
  public static Zzo Za(int paramInt) {
    return new Zrz2(Integer.valueOf(paramInt));
  }
  
  public static Zzo ZB(float paramFloat) {
    try {
      if (!Float.isInfinite(paramFloat))
        try {
          if (!Float.isNaN(paramFloat))
            return new Zrz2(Float.valueOf(paramFloat)); 
          throw new Zes(a(-23679, -28850));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new Zes(a(-23679, -28850));
  }
  
  public static Zzo Zb(double paramDouble) {
    try {
      if (!Double.isInfinite(paramDouble))
        try {
          if (!Double.isNaN(paramDouble))
            return new Zrz2(Double.valueOf(paramDouble)); 
          throw new Zes(a(-23680, 26168));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new Zes(a(-23680, 26168));
  }
  
  public static Zkw ZK(boolean paramBoolean) {
    return new Zrzq(paramBoolean);
  }
  
  public static Zmp ZE() {
    return new Zrzd();
  }
  
  public static Zfb ZG() {
    return new Zrzl();
  }
  
  public static Zfb Z_(Zd4... paramVarArgs) {
    Zfb zfb = ZG();
    Zd4[] arrayOfZd4 = paramVarArgs;
    int i = arrayOfZd4.length;
    byte b = 0;
    boolean bool = Zz();
    while (b < i) {
      Zd4 zd4 = arrayOfZd4[b];
      zfb.Zh(zd4);
      b++;
      if (!bool)
        break; 
    } 
    return zfb;
  }
  
  public static Zfb ZV(Iterable<?> paramIterable) {
    // Byte code:
    //   0: invokestatic Zz : ()Z
    //   3: invokestatic ZG : ()Lnet/portswigger/Zfb;
    //   6: astore_2
    //   7: aload_0
    //   8: invokeinterface iterator : ()Ljava/util/Iterator;
    //   13: astore_3
    //   14: istore_1
    //   15: aload_3
    //   16: invokeinterface hasNext : ()Z
    //   21: ifeq -> 226
    //   24: aload_3
    //   25: invokeinterface next : ()Ljava/lang/Object;
    //   30: astore #4
    //   32: aload #4
    //   34: instanceof java/lang/Number
    //   37: ifeq -> 66
    //   40: aload_2
    //   41: aload #4
    //   43: checkcast java/lang/Number
    //   46: invokevirtual doubleValue : ()D
    //   49: invokeinterface Zk : (D)Lnet/portswigger/Zrmq;
    //   54: pop
    //   55: iload_1
    //   56: ifne -> 222
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   65: athrow
    //   66: aload #4
    //   68: instanceof java/lang/String
    //   71: ifeq -> 104
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   80: athrow
    //   81: aload_2
    //   82: aload #4
    //   84: checkcast java/lang/String
    //   87: invokeinterface ZR : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   92: pop
    //   93: iload_1
    //   94: ifne -> 222
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   103: athrow
    //   104: aload #4
    //   106: instanceof java/lang/Boolean
    //   109: ifeq -> 145
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   118: athrow
    //   119: aload_2
    //   120: aload #4
    //   122: checkcast java/lang/Boolean
    //   125: invokevirtual booleanValue : ()Z
    //   128: invokeinterface Zm : (Z)Lnet/portswigger/Zrmq;
    //   133: pop
    //   134: iload_1
    //   135: ifne -> 222
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   144: athrow
    //   145: aload #4
    //   147: instanceof net/portswigger/Zrmq
    //   150: ifeq -> 183
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   159: athrow
    //   160: aload_2
    //   161: aload #4
    //   163: checkcast net/portswigger/Zrmq
    //   166: invokeinterface Zh : (Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   171: pop
    //   172: iload_1
    //   173: ifne -> 222
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   182: athrow
    //   183: new java/lang/IllegalArgumentException
    //   186: dup
    //   187: sipush #-23672
    //   190: sipush #19154
    //   193: invokestatic a : (II)Ljava/lang/String;
    //   196: iconst_1
    //   197: anewarray java/lang/Object
    //   200: dup
    //   201: iconst_0
    //   202: aload #4
    //   204: invokevirtual getClass : ()Ljava/lang/Class;
    //   207: invokevirtual getName : ()Ljava/lang/String;
    //   210: aastore
    //   211: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   214: invokespecial <init> : (Ljava/lang/String;)V
    //   217: athrow
    //   218: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   221: athrow
    //   222: iload_1
    //   223: ifne -> 15
    //   226: aload_2
    //   227: areturn
    // Exception table:
    //   from	to	target	type
    //   32	59	62	java/lang/IllegalArgumentException
    //   40	74	77	java/lang/IllegalArgumentException
    //   66	97	100	java/lang/IllegalArgumentException
    //   81	112	115	java/lang/IllegalArgumentException
    //   104	138	141	java/lang/IllegalArgumentException
    //   119	153	156	java/lang/IllegalArgumentException
    //   145	176	179	java/lang/IllegalArgumentException
    //   160	218	218	java/lang/IllegalArgumentException
  }
  
  public static Zi7 ZU() {
    return new Zrzr();
  }
  
  private static boolean Zh(char paramChar) {
    try {
      if (paramChar >= '0')
        try {
          if (paramChar <= '9');
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean Zj(char paramChar) {
    // Byte code:
    //   0: iload_0
    //   1: bipush #97
    //   3: if_icmplt -> 19
    //   6: iload_0
    //   7: bipush #122
    //   9: if_icmple -> 45
    //   12: goto -> 19
    //   15: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   18: athrow
    //   19: iload_0
    //   20: bipush #65
    //   22: if_icmplt -> 53
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   31: athrow
    //   32: iload_0
    //   33: bipush #90
    //   35: if_icmpgt -> 53
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   44: athrow
    //   45: iconst_1
    //   46: goto -> 54
    //   49: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   52: athrow
    //   53: iconst_0
    //   54: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	12	15	java/lang/IllegalArgumentException
    //   6	25	28	java/lang/IllegalArgumentException
    //   19	38	41	java/lang/IllegalArgumentException
    //   32	49	49	java/lang/IllegalArgumentException
  }
  
  private static String ZX(String paramString) {
    boolean bool = ZP();
    try {
      if (paramString == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    while (paramString.contains(a(-23668, 25289))) {
      paramString = paramString.replace(a(-23669, 32060), "");
      if (bool)
        break; 
    } 
    return paramString;
  }
  
  private static void Zn(Object paramObject, String paramString) {
    try {
      if (paramObject == null)
        throw new IllegalArgumentException(paramString + paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static void Ze(Object paramObject, String paramString) {
    try {
      if (paramObject instanceof Zrzb)
        throw new IllegalArgumentException(paramString + paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static void ZW(int paramInt, Za1 paramZa1) {
    byte b = 0;
    boolean bool = Zz();
    while (b < paramInt) {
      paramZa1.Zz(' ');
      b++;
      if (!bool)
        break; 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_1
    //   10: ldc '/í@+ÄHr×_ùe\àÊ½OÄ,±¡Éê£ofñsrx=ÑnæÂ+\\r¿-Môø)¢k£¥ -BÅ×ªN\\r¥¥ÉnyXEcº:8*½â\\t 0ösþ-ÜxÊ¸äYÐå¼ÜIaI³;Â ã&mwÃZA!@Þ«´,¤;hT\\nøÕjßhÏÒ)\\n5ã'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zz : (Z)V
    //   22: bipush #6
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #109
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'D,ü[hw~Ó­ÿûp|'ÙÙ³£â¹(Ð<l{8a4âAª¥#¦øÙ\\bî'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_2
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #65
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic net/portswigger/Zv3.a : [Ljava/lang/String;
    //   135: bipush #16
    //   137: anewarray java/lang/String
    //   140: putstatic net/portswigger/Zv3.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #14
    //   218: goto -> 248
    //   221: bipush #95
    //   223: goto -> 248
    //   226: bipush #86
    //   228: goto -> 248
    //   231: bipush #86
    //   233: goto -> 248
    //   236: bipush #115
    //   238: goto -> 248
    //   241: bipush #105
    //   243: goto -> 248
    //   246: bipush #53
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: new net/portswigger/Zrzb
    //   307: dup
    //   308: invokespecial <init> : ()V
    //   311: invokevirtual ZP : ()Lnet/portswigger/Zrmq;
    //   314: putstatic net/portswigger/Zv3.Zh : Lnet/portswigger/Zrmq;
    //   317: sipush #256
    //   320: anewarray java/lang/String
    //   323: putstatic net/portswigger/Zv3.Zj : [Ljava/lang/String;
    //   326: iconst_0
    //   327: istore #7
    //   329: iload #7
    //   331: getstatic net/portswigger/Zv3.Zj : [Ljava/lang/String;
    //   334: arraylength
    //   335: if_icmpge -> 443
    //   338: iload #7
    //   340: bipush #31
    //   342: if_icmple -> 396
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   351: athrow
    //   352: iload #7
    //   354: bipush #127
    //   356: if_icmpeq -> 396
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   365: athrow
    //   366: iload #7
    //   368: sipush #128
    //   371: if_icmplt -> 433
    //   374: goto -> 381
    //   377: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   380: athrow
    //   381: iload #7
    //   383: sipush #159
    //   386: if_icmpgt -> 433
    //   389: goto -> 396
    //   392: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   395: athrow
    //   396: getstatic net/portswigger/Zv3.Zj : [Ljava/lang/String;
    //   399: iload #7
    //   401: sipush #-23673
    //   404: sipush #-2211
    //   407: invokestatic a : (II)Ljava/lang/String;
    //   410: iconst_1
    //   411: anewarray java/lang/Object
    //   414: dup
    //   415: iconst_0
    //   416: iload #7
    //   418: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   421: aastore
    //   422: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   425: aastore
    //   426: goto -> 433
    //   429: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   432: athrow
    //   433: iload #7
    //   435: iconst_1
    //   436: iadd
    //   437: i2c
    //   438: istore #7
    //   440: goto -> 329
    //   443: getstatic net/portswigger/Zv3.Zj : [Ljava/lang/String;
    //   446: bipush #92
    //   448: sipush #-23674
    //   451: sipush #12998
    //   454: invokestatic a : (II)Ljava/lang/String;
    //   457: aastore
    //   458: getstatic net/portswigger/Zv3.Zj : [Ljava/lang/String;
    //   461: bipush #34
    //   463: sipush #-23665
    //   466: sipush #-12010
    //   469: invokestatic a : (II)Ljava/lang/String;
    //   472: aastore
    //   473: getstatic net/portswigger/Zv3.Zj : [Ljava/lang/String;
    //   476: bipush #8
    //   478: sipush #-23667
    //   481: sipush #-28117
    //   484: invokestatic a : (II)Ljava/lang/String;
    //   487: aastore
    //   488: getstatic net/portswigger/Zv3.Zj : [Ljava/lang/String;
    //   491: bipush #12
    //   493: sipush #-23677
    //   496: sipush #17088
    //   499: invokestatic a : (II)Ljava/lang/String;
    //   502: aastore
    //   503: getstatic net/portswigger/Zv3.Zj : [Ljava/lang/String;
    //   506: bipush #10
    //   508: sipush #-23678
    //   511: sipush #5990
    //   514: invokestatic a : (II)Ljava/lang/String;
    //   517: aastore
    //   518: getstatic net/portswigger/Zv3.Zj : [Ljava/lang/String;
    //   521: bipush #13
    //   523: sipush #-23670
    //   526: sipush #-19429
    //   529: invokestatic a : (II)Ljava/lang/String;
    //   532: aastore
    //   533: getstatic net/portswigger/Zv3.Zj : [Ljava/lang/String;
    //   536: bipush #9
    //   538: sipush #-23671
    //   541: sipush #-24316
    //   544: invokestatic a : (II)Ljava/lang/String;
    //   547: aastore
    //   548: getstatic net/portswigger/Zv3.Zj : [Ljava/lang/String;
    //   551: bipush #47
    //   553: sipush #-23666
    //   556: sipush #-19999
    //   559: invokestatic a : (II)Ljava/lang/String;
    //   562: aastore
    //   563: return
    // Exception table:
    //   from	to	target	type
    //   329	345	348	java/lang/IllegalArgumentException
    //   338	359	362	java/lang/IllegalArgumentException
    //   352	374	377	java/lang/IllegalArgumentException
    //   366	389	392	java/lang/IllegalArgumentException
    //   381	426	429	java/lang/IllegalArgumentException
  }
  
  public static void Zz(boolean paramBoolean) {
    Zw = paramBoolean;
  }
  
  public static boolean Zz() {
    return Zw;
  }
  
  public static boolean ZP() {
    boolean bool = Zz();
    try {
      if (!bool)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA387) & 0xFFFF;
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
      char c = '¼';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zv3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */