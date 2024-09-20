package burp;

import java.math.BigInteger;

class Zs00 extends ClassLoader {
  static Object ZF;
  
  static String Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zo(Object paramObject) {
    Zs75.Zn = a(12856, 30685);
    Zs75.Zo = new BigInteger(a(12862, -29027));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zb.Zt.charAt(Math.abs(((BigInteger)Zztk.Za).intValue() % 32)) <= Zef0.ZR.charAt(Math.abs(((BigInteger)Zera.Zy).intValue() % 32))) {
          try {
            Zlhu.ZE(Class.forName(a(12861, -18786)));
            if (!bool)
              Zsf7.Zm(Class.forName(a(12860, -17489))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zsf7.Zm(Class.forName(a(12860, -17489)));
    } catch (Throwable throwable) {}
  }
  
  static void ZU(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zb(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zz75.ZX : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zsj5.Zv : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zzyr.Za : Ljava/lang/Object;
    //   22: sipush #12858
    //   25: sipush #29698
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zgkl
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
    //   150: sipush #12857
    //   153: sipush #-28427
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
    //   189: ifne -> 51
    //   192: sipush #12859
    //   195: sipush #15505
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
    //   334: ifne -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifne -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: getstatic burp/Zzym.Zj : Ljava/lang/String;
    //   354: getstatic burp/Ztlz.ZW : Ljava/lang/Object;
    //   357: checkcast java/math/BigInteger
    //   360: invokevirtual intValue : ()I
    //   363: bipush #32
    //   365: irem
    //   366: invokestatic abs : (I)I
    //   369: invokevirtual charAt : (I)C
    //   372: getstatic burp/Zsxh.Z_ : Ljava/lang/String;
    //   375: getstatic burp/Zlh8.Zm : Ljava/lang/Object;
    //   378: checkcast java/math/BigInteger
    //   381: invokevirtual intValue : ()I
    //   384: bipush #32
    //   386: irem
    //   387: invokestatic abs : (I)I
    //   390: invokevirtual charAt : (I)C
    //   393: if_icmple -> 500
    //   396: getstatic burp/Zz0w.ZO : Ljava/lang/String;
    //   399: getstatic burp/Ze82.ZR : Ljava/lang/Object;
    //   402: checkcast java/math/BigInteger
    //   405: invokevirtual intValue : ()I
    //   408: bipush #32
    //   410: irem
    //   411: invokestatic abs : (I)I
    //   414: invokevirtual charAt : (I)C
    //   417: getstatic burp/Zztn.ZY : Ljava/lang/String;
    //   420: getstatic burp/Zkll.Zl : Ljava/lang/Object;
    //   423: checkcast java/math/BigInteger
    //   426: invokevirtual intValue : ()I
    //   429: bipush #32
    //   431: irem
    //   432: invokestatic abs : (I)I
    //   435: invokevirtual charAt : (I)C
    //   438: if_icmpgt -> 500
    //   441: goto -> 448
    //   444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   447: athrow
    //   448: getstatic burp/Zrcy.Zq : Ljava/lang/String;
    //   451: getstatic burp/Zl8f.ZA : Ljava/lang/Object;
    //   454: checkcast java/math/BigInteger
    //   457: invokevirtual intValue : ()I
    //   460: bipush #32
    //   462: irem
    //   463: invokestatic abs : (I)I
    //   466: invokevirtual charAt : (I)C
    //   469: getstatic burp/Zera.Zn : Ljava/lang/String;
    //   472: getstatic burp/Zzr5.Za : Ljava/lang/Object;
    //   475: checkcast java/math/BigInteger
    //   478: invokevirtual intValue : ()I
    //   481: bipush #32
    //   483: irem
    //   484: invokestatic abs : (I)I
    //   487: invokevirtual charAt : (I)C
    //   490: if_icmpgt -> 508
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
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'JµF1sm×T llz^Ëù 5m`\\n³S¬S{LãõhSô¹t4l  «¤}z÷ïßÙÉ¤òW~sÆmÞ¾}ÇRx#AZS$ËÏû\\fÑ*#}§Ôvig¦°½wsC¸:\\tCH¢¯Éj'\\t÷ØXuW\\r\\t¹}ý\\t"¾ï\\n\\ty¥²+ý¸Î'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #19
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
    //   68: ldc 'W¡Í ²ÁÂ5ÝhÀÕÛòxæêòµÒv ^¹8iDÖÕ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #86
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
    //   128: putstatic burp/Zs00.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zs00.b : [Ljava/lang/String;
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
    //   212: bipush #86
    //   214: goto -> 244
    //   217: bipush #82
    //   219: goto -> 244
    //   222: bipush #45
    //   224: goto -> 244
    //   227: bipush #54
    //   229: goto -> 244
    //   232: bipush #91
    //   234: goto -> 244
    //   237: bipush #12
    //   239: goto -> 244
    //   242: bipush #49
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #83
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #25
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-86
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-107
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-23
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #17
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-3
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #43
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #13
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #11
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #26
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #95
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-121
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-38
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-60
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #65
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #38
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #45
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #61
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #24
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #72
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #28
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #79
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-57
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #25
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-60
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-80
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #56
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #-34
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #-38
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #84
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-96
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zs00.ZF : Ljava/lang/Object;
    //   501: sipush #12863
    //   504: sipush #21549
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zs00.Zv : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x323F) & 0xFFFF;
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
      byte b1 = 42;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs00.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */