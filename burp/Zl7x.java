package burp;

import java.math.BigInteger;

class Zl7x extends ClassLoader {
  static String Zo;
  
  static Object Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zg(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zgcg.Zi : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zmyk.Za : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zg2u.ZI : Ljava/lang/Object;
    //   22: sipush #30825
    //   25: sipush #-2399
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zrva
    //   34: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   37: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   40: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   43: astore_3
    //   44: aload_3
    //   45: arraylength
    //   46: istore #4
    //   48: iconst_0
    //   49: istore #5
    //   51: iload #5
    //   53: iload #4
    //   55: if_icmpge -> 192
    //   58: aload_3
    //   59: iload #5
    //   61: aaload
    //   62: astore #6
    //   64: aload #6
    //   66: invokevirtual getModifiers : ()I
    //   69: invokestatic isStatic : (I)Z
    //   72: ifne -> 82
    //   75: goto -> 185
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: aload #6
    //   84: invokevirtual getType : ()Ljava/lang/Class;
    //   87: astore #7
    //   89: aload #7
    //   91: ifnull -> 172
    //   94: aload #7
    //   96: invokevirtual isPrimitive : ()Z
    //   99: ifne -> 172
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   108: athrow
    //   109: aload #7
    //   111: invokevirtual getPackage : ()Ljava/lang/Package;
    //   114: ifnull -> 172
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload #7
    //   126: invokevirtual getPackage : ()Ljava/lang/Package;
    //   129: invokevirtual getName : ()Ljava/lang/String;
    //   132: ifnull -> 172
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: sipush #30826
    //   153: sipush #-2660
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   162: ifne -> 172
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   171: athrow
    //   172: aload #6
    //   174: iconst_1
    //   175: invokevirtual setAccessible : (Z)V
    //   178: aload #6
    //   180: aconst_null
    //   181: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   184: pop
    //   185: iinc #5, 1
    //   188: iload_2
    //   189: ifeq -> 51
    //   192: sipush #30827
    //   195: sipush #-6081
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   204: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   207: astore_3
    //   208: aload_3
    //   209: arraylength
    //   210: istore #4
    //   212: iconst_0
    //   213: istore #5
    //   215: iload #5
    //   217: iload #4
    //   219: if_icmpge -> 351
    //   222: aload_3
    //   223: iload #5
    //   225: aaload
    //   226: astore #6
    //   228: aload #6
    //   230: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   233: pop
    //   234: aload #6
    //   236: invokevirtual getModifiers : ()I
    //   239: invokestatic isStatic : (I)Z
    //   242: ifeq -> 337
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 337
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   270: invokevirtual equals : (Ljava/lang/Object;)Z
    //   273: ifeq -> 337
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   282: athrow
    //   283: aload #6
    //   285: iconst_1
    //   286: invokevirtual setAccessible : (Z)V
    //   289: aload #6
    //   291: aconst_null
    //   292: iconst_2
    //   293: anewarray java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: aload_0
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload_1
    //   303: ifnonnull -> 321
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload_1
    //   314: goto -> 328
    //   317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   320: athrow
    //   321: aload_1
    //   322: checkcast [B
    //   325: invokevirtual clone : ()Ljava/lang/Object;
    //   328: aastore
    //   329: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   332: pop
    //   333: iload_2
    //   334: ifeq -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifeq -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: getstatic burp/Zoe.ZE : Ljava/lang/String;
    //   354: getstatic burp/Zscz.ZN : Ljava/lang/Object;
    //   357: checkcast java/math/BigInteger
    //   360: invokevirtual intValue : ()I
    //   363: bipush #32
    //   365: irem
    //   366: invokestatic abs : (I)I
    //   369: invokevirtual charAt : (I)C
    //   372: getstatic burp/Zkdq.ZZ : Ljava/lang/String;
    //   375: getstatic burp/Zxxf.ZZ : Ljava/lang/Object;
    //   378: checkcast java/math/BigInteger
    //   381: invokevirtual intValue : ()I
    //   384: bipush #32
    //   386: irem
    //   387: invokestatic abs : (I)I
    //   390: invokevirtual charAt : (I)C
    //   393: if_icmple -> 508
    //   396: getstatic burp/Zlg2.ZL : Ljava/lang/String;
    //   399: getstatic burp/Zxdp.ZW : Ljava/lang/Object;
    //   402: checkcast java/math/BigInteger
    //   405: invokevirtual intValue : ()I
    //   408: bipush #32
    //   410: irem
    //   411: invokestatic abs : (I)I
    //   414: invokevirtual charAt : (I)C
    //   417: getstatic burp/Zzna.Zi : Ljava/lang/String;
    //   420: getstatic burp/Zbx4.Zw : Ljava/lang/Object;
    //   423: checkcast java/math/BigInteger
    //   426: invokevirtual intValue : ()I
    //   429: bipush #32
    //   431: irem
    //   432: invokestatic abs : (I)I
    //   435: invokevirtual charAt : (I)C
    //   438: if_icmple -> 508
    //   441: goto -> 448
    //   444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   447: athrow
    //   448: getstatic burp/Zsu2.Zq : Ljava/lang/String;
    //   451: getstatic burp/Zskf.ZQ : Ljava/lang/Object;
    //   454: checkcast java/math/BigInteger
    //   457: invokevirtual intValue : ()I
    //   460: bipush #32
    //   462: irem
    //   463: invokestatic abs : (I)I
    //   466: invokevirtual charAt : (I)C
    //   469: getstatic burp/Zz0b.ZD : Ljava/lang/String;
    //   472: getstatic burp/Zos.ZB : Ljava/lang/Object;
    //   475: checkcast java/math/BigInteger
    //   478: invokevirtual intValue : ()I
    //   481: bipush #32
    //   483: irem
    //   484: invokestatic abs : (I)I
    //   487: invokevirtual charAt : (I)C
    //   490: if_icmple -> 508
    //   493: goto -> 500
    //   496: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   499: athrow
    //   500: iconst_1
    //   501: goto -> 509
    //   504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   507: athrow
    //   508: iconst_0
    //   509: ireturn
    //   510: astore_3
    //   511: new java/lang/Exception
    //   514: dup
    //   515: aload_3
    //   516: invokevirtual getMessage : ()Ljava/lang/String;
    //   519: invokespecial <init> : (Ljava/lang/String;)V
    //   522: athrow
    // Exception table:
    //   from	to	target	type
    //   4	509	510	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	276	279	java/lang/Throwable
    //   262	306	309	java/lang/Throwable
    //   283	317	317	java/lang/Throwable
    //   328	344	347	java/lang/Throwable
    //   351	441	444	java/lang/Throwable
    //   396	493	496	java/lang/Throwable
    //   448	504	504	java/lang/Throwable
  }
  
  static void Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zi(Object paramObject) {
    Zebc.ZC = a(30829, 8904);
    Zebc.Zr = new BigInteger(a(30831, 10852));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zlt1.ZA.charAt(Math.abs(((BigInteger)Zlid.Zx).intValue() % 32)) > Zxcn.ZF.charAt(Math.abs(((BigInteger)Zlf7.ZE).intValue() % 32))) {
          try {
            Zxtc.ZD(Class.forName(a(30824, 32347)));
            if (!bool)
              Zezi.Zu(Class.forName(a(30828, -8494))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zezi.Zu(Class.forName(a(30828, -8494)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '<½_Þ& jwS÷¬ÎÀ³9 \^XÐö|Ö-Ô}DÒPXË~î ¹,÷ä¬ª½êÏfßÊ#ËR×ñ¶ø%i/ÊZ5ÜMøâP[ù°#zðd_zñf9ýÐ'l\\bÕþwnN\\n?~â-^NÙÑ0Ã»Õªy|ø±2Â1\<ÆDÊ¢Vd3§åÞÜ\\ty}¬1J\\r(ð*\\b:ÎÄGGÃ"'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #107
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
    //   68: ldc '¯Y&å\\b6F-»}'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #121
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
    //   128: putstatic burp/Zl7x.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zl7x.b : [Ljava/lang/String;
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
    //   212: bipush #119
    //   214: goto -> 244
    //   217: bipush #73
    //   219: goto -> 244
    //   222: bipush #55
    //   224: goto -> 244
    //   227: bipush #26
    //   229: goto -> 244
    //   232: bipush #45
    //   234: goto -> 244
    //   237: bipush #74
    //   239: goto -> 244
    //   242: bipush #90
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
    //   300: sipush #30830
    //   303: sipush #-4283
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zl7x.Zo : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #55
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-58
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-95
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #34
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #85
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #37
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #62
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-82
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-38
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-88
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-5
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-40
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-55
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-120
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #84
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-9
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #84
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-118
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-100
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #117
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-114
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-44
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #110
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-120
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #11
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #11
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-56
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #-88
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-118
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #56
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-70
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #100
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zl7x.Za : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x786C) & 0xFFFF;
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
      byte b1 = 125;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl7x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */