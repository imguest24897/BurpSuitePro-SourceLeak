package burp;

import java.math.BigInteger;

class Zmul extends ClassLoader {
  static Object ZD;
  
  static String Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZM(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #28056
    //   7: sipush #-1927
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   19: astore_3
    //   20: aload_3
    //   21: arraylength
    //   22: istore #4
    //   24: iconst_0
    //   25: istore #5
    //   27: iload #5
    //   29: iload #4
    //   31: if_icmpge -> 161
    //   34: aload_3
    //   35: iload #5
    //   37: aaload
    //   38: astore #6
    //   40: aload #6
    //   42: invokevirtual getType : ()Ljava/lang/Class;
    //   45: ldc java/lang/Object
    //   47: invokevirtual equals : (Ljava/lang/Object;)Z
    //   50: ifeq -> 154
    //   53: aload #6
    //   55: iconst_1
    //   56: invokevirtual setAccessible : (Z)V
    //   59: sipush #28063
    //   62: sipush #6480
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   71: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   74: astore #7
    //   76: aload #7
    //   78: arraylength
    //   79: istore #8
    //   81: iconst_0
    //   82: istore #9
    //   84: iload #9
    //   86: iload #8
    //   88: if_icmpge -> 154
    //   91: aload #7
    //   93: iload #9
    //   95: aaload
    //   96: astore #10
    //   98: aload #10
    //   100: invokevirtual getType : ()Ljava/lang/Class;
    //   103: ldc java/lang/Object
    //   105: invokevirtual equals : (Ljava/lang/Object;)Z
    //   108: ifeq -> 140
    //   111: aload #10
    //   113: iconst_1
    //   114: invokevirtual setAccessible : (Z)V
    //   117: aload #10
    //   119: aconst_null
    //   120: aload #6
    //   122: aconst_null
    //   123: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   126: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   129: iload_2
    //   130: ifeq -> 161
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   139: athrow
    //   140: iinc #9, 1
    //   143: iload_2
    //   144: ifeq -> 84
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   153: athrow
    //   154: iinc #5, 1
    //   157: iload_2
    //   158: ifeq -> 27
    //   161: sipush #28062
    //   164: sipush #20874
    //   167: invokestatic a : (II)Ljava/lang/String;
    //   170: iconst_1
    //   171: ldc burp/Zsow
    //   173: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   176: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   179: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   182: astore_3
    //   183: aload_3
    //   184: arraylength
    //   185: istore #4
    //   187: iconst_0
    //   188: istore #5
    //   190: iload #5
    //   192: iload #4
    //   194: if_icmpge -> 331
    //   197: aload_3
    //   198: iload #5
    //   200: aaload
    //   201: astore #6
    //   203: aload #6
    //   205: invokevirtual getModifiers : ()I
    //   208: invokestatic isStatic : (I)Z
    //   211: ifne -> 221
    //   214: goto -> 324
    //   217: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   220: athrow
    //   221: aload #6
    //   223: invokevirtual getType : ()Ljava/lang/Class;
    //   226: astore #7
    //   228: aload #7
    //   230: ifnull -> 311
    //   233: aload #7
    //   235: invokevirtual isPrimitive : ()Z
    //   238: ifne -> 311
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   247: athrow
    //   248: aload #7
    //   250: invokevirtual getPackage : ()Ljava/lang/Package;
    //   253: ifnull -> 311
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   262: athrow
    //   263: aload #7
    //   265: invokevirtual getPackage : ()Ljava/lang/Package;
    //   268: invokevirtual getName : ()Ljava/lang/String;
    //   271: ifnull -> 311
    //   274: goto -> 281
    //   277: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   280: athrow
    //   281: aload #7
    //   283: invokevirtual getPackage : ()Ljava/lang/Package;
    //   286: invokevirtual getName : ()Ljava/lang/String;
    //   289: sipush #28061
    //   292: sipush #-32136
    //   295: invokestatic a : (II)Ljava/lang/String;
    //   298: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   301: ifne -> 311
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   310: athrow
    //   311: aload #6
    //   313: iconst_1
    //   314: invokevirtual setAccessible : (Z)V
    //   317: aload #6
    //   319: aconst_null
    //   320: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   323: pop
    //   324: iinc #5, 1
    //   327: iload_2
    //   328: ifeq -> 190
    //   331: sipush #28060
    //   334: sipush #13694
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   343: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   346: astore_3
    //   347: aload_3
    //   348: arraylength
    //   349: istore #4
    //   351: iconst_0
    //   352: istore #5
    //   354: iload #5
    //   356: iload #4
    //   358: if_icmpge -> 490
    //   361: aload_3
    //   362: iload #5
    //   364: aaload
    //   365: astore #6
    //   367: aload #6
    //   369: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   372: pop
    //   373: aload #6
    //   375: invokevirtual getModifiers : ()I
    //   378: invokestatic isStatic : (I)Z
    //   381: ifeq -> 476
    //   384: aload #6
    //   386: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   389: arraylength
    //   390: iconst_2
    //   391: if_icmpne -> 476
    //   394: goto -> 401
    //   397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   400: athrow
    //   401: aload #6
    //   403: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   406: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   409: invokevirtual equals : (Ljava/lang/Object;)Z
    //   412: ifeq -> 476
    //   415: goto -> 422
    //   418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   421: athrow
    //   422: aload #6
    //   424: iconst_1
    //   425: invokevirtual setAccessible : (Z)V
    //   428: aload #6
    //   430: aconst_null
    //   431: iconst_2
    //   432: anewarray java/lang/Object
    //   435: dup
    //   436: iconst_0
    //   437: aload_0
    //   438: aastore
    //   439: dup
    //   440: iconst_1
    //   441: aload_1
    //   442: ifnonnull -> 460
    //   445: goto -> 452
    //   448: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   451: athrow
    //   452: aload_1
    //   453: goto -> 467
    //   456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   459: athrow
    //   460: aload_1
    //   461: checkcast [B
    //   464: invokevirtual clone : ()Ljava/lang/Object;
    //   467: aastore
    //   468: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   471: pop
    //   472: iload_2
    //   473: ifeq -> 490
    //   476: iinc #5, 1
    //   479: iload_2
    //   480: ifeq -> 354
    //   483: goto -> 490
    //   486: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   489: athrow
    //   490: getstatic burp/Zkc5.ZH : Ljava/lang/String;
    //   493: getstatic burp/Zr4z.ZH : Ljava/lang/Object;
    //   496: checkcast java/math/BigInteger
    //   499: invokevirtual intValue : ()I
    //   502: bipush #32
    //   504: irem
    //   505: invokestatic abs : (I)I
    //   508: invokevirtual charAt : (I)C
    //   511: getstatic burp/Zl8s.Zn : Ljava/lang/String;
    //   514: getstatic burp/Zsot.ZJ : Ljava/lang/Object;
    //   517: checkcast java/math/BigInteger
    //   520: invokevirtual intValue : ()I
    //   523: bipush #32
    //   525: irem
    //   526: invokestatic abs : (I)I
    //   529: invokevirtual charAt : (I)C
    //   532: if_icmple -> 639
    //   535: getstatic burp/Zmec.Zi : Ljava/lang/String;
    //   538: getstatic burp/Ztsc.Zr : Ljava/lang/Object;
    //   541: checkcast java/math/BigInteger
    //   544: invokevirtual intValue : ()I
    //   547: bipush #32
    //   549: irem
    //   550: invokestatic abs : (I)I
    //   553: invokevirtual charAt : (I)C
    //   556: getstatic burp/Zgl2.Zw : Ljava/lang/String;
    //   559: getstatic burp/Zre4.Zx : Ljava/lang/Object;
    //   562: checkcast java/math/BigInteger
    //   565: invokevirtual intValue : ()I
    //   568: bipush #32
    //   570: irem
    //   571: invokestatic abs : (I)I
    //   574: invokevirtual charAt : (I)C
    //   577: if_icmple -> 639
    //   580: goto -> 587
    //   583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   586: athrow
    //   587: getstatic burp/Zgr1.Za : Ljava/lang/String;
    //   590: getstatic burp/Zsot.ZJ : Ljava/lang/Object;
    //   593: checkcast java/math/BigInteger
    //   596: invokevirtual intValue : ()I
    //   599: bipush #32
    //   601: irem
    //   602: invokestatic abs : (I)I
    //   605: invokevirtual charAt : (I)C
    //   608: getstatic burp/Zmdm.Za : Ljava/lang/String;
    //   611: getstatic burp/Ztpg.Z_ : Ljava/lang/Object;
    //   614: checkcast java/math/BigInteger
    //   617: invokevirtual intValue : ()I
    //   620: bipush #32
    //   622: irem
    //   623: invokestatic abs : (I)I
    //   626: invokevirtual charAt : (I)C
    //   629: if_icmple -> 647
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   638: athrow
    //   639: iconst_1
    //   640: goto -> 648
    //   643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   646: athrow
    //   647: iconst_0
    //   648: ireturn
    //   649: astore_3
    //   650: new java/lang/Exception
    //   653: dup
    //   654: aload_3
    //   655: invokevirtual getMessage : ()Ljava/lang/String;
    //   658: invokespecial <init> : (Ljava/lang/String;)V
    //   661: athrow
    // Exception table:
    //   from	to	target	type
    //   4	648	649	java/lang/Throwable
    //   98	133	136	java/lang/Throwable
    //   111	147	150	java/lang/Throwable
    //   203	217	217	java/lang/Throwable
    //   228	241	244	java/lang/Throwable
    //   233	256	259	java/lang/Throwable
    //   248	274	277	java/lang/Throwable
    //   263	304	307	java/lang/Throwable
    //   367	394	397	java/lang/Throwable
    //   384	415	418	java/lang/Throwable
    //   401	445	448	java/lang/Throwable
    //   422	456	456	java/lang/Throwable
    //   467	483	486	java/lang/Throwable
    //   490	580	583	java/lang/Throwable
    //   535	632	635	java/lang/Throwable
    //   587	643	643	java/lang/Throwable
  }
  
  static void ZP(Object paramObject) {
    Zg_6.Zc = a(28054, 31302);
    Zg_6.ZU = new BigInteger(new byte[] { 
          13, 95, 35, 90, 118, -10, 14, 68, 45, -14, 
          71, 10, 86, -108, 52, 80, 20, 30, 56, 99, 
          40, -4, 96, -13, -125, Byte.MAX_VALUE, 25, -19, -95, -87, 
          -119, -18 });
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zlpn.ZF.charAt(Math.abs(((BigInteger)Zehi.Zb).intValue() % 32)) <= Ztgv.ZC.charAt(Math.abs(((BigInteger)Zrf9.Zu).intValue() % 32))) {
          try {
            Zz75.ZI(Class.forName(a(28057, 31462)));
            if (bool)
              Ztmy.Zo(Class.forName(a(28058, -1838))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztmy.Zo(Class.forName(a(28058, -1838)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'øÔ}6¼W@\\töÈ¼µ'RÆã\\bÖú¸óïWß°º\\t;âËOè27  Ä&´Ô0ãP³4Û=1isN&ó±ÙKÿÍV\\tM«ËÙjªdM'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #79
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc 'µDx°,p Ò¦N³´ý-M¨Ððy¢5åÍOYX`sóÝQn>-!'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #66
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zmul.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmul.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #54
    //   214: goto -> 244
    //   217: bipush #68
    //   219: goto -> 244
    //   222: bipush #94
    //   224: goto -> 244
    //   227: bipush #41
    //   229: goto -> 244
    //   232: bipush #108
    //   234: goto -> 244
    //   237: bipush #54
    //   239: goto -> 244
    //   242: bipush #112
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #55
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-90
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #93
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-39
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #45
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #127
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #87
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-64
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #63
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #98
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-94
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-72
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #54
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #105
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #83
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #102
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-119
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #47
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #52
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #75
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #120
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-19
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-106
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-2
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-40
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-87
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: iconst_4
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #-36
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #100
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #87
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-53
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #-98
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zmul.ZD : Ljava/lang/Object;
    //   499: sipush #28059
    //   502: sipush #7265
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zmul.Zd : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6D9E) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmul.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */