package burp;

import java.math.BigInteger;

class Zm5s extends ClassLoader {
  static Object ZB;
  
  static String Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Za(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zs5k.Zg : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zl6z.Zt : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ztc2.ZM : Ljava/lang/Object;
    //   22: sipush #-18797
    //   25: sipush #-6831
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zbnb
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
    //   150: sipush #-18798
    //   153: sipush #-30632
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
    //   192: sipush #-18795
    //   195: sipush #4459
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
    //   351: getstatic burp/Zzh9.Zv : Ljava/lang/Object;
    //   354: checkcast java/math/BigInteger
    //   357: invokevirtual toByteArray : ()[B
    //   360: astore_3
    //   361: aload_3
    //   362: arraylength
    //   363: iconst_2
    //   364: iadd
    //   365: newarray byte
    //   367: astore #5
    //   369: iconst_0
    //   370: istore #6
    //   372: iload #6
    //   374: aload_3
    //   375: arraylength
    //   376: if_icmpge -> 395
    //   379: aload #5
    //   381: iload #6
    //   383: aload_3
    //   384: iload #6
    //   386: baload
    //   387: bastore
    //   388: iinc #6, 1
    //   391: iload_2
    //   392: ifne -> 372
    //   395: aload #5
    //   397: arraylength
    //   398: iconst_3
    //   399: idiv
    //   400: iconst_4
    //   401: imul
    //   402: newarray byte
    //   404: astore #4
    //   406: iconst_0
    //   407: istore #6
    //   409: iconst_0
    //   410: istore #7
    //   412: iload #6
    //   414: aload_3
    //   415: arraylength
    //   416: if_icmpge -> 527
    //   419: aload #4
    //   421: iload #7
    //   423: aload #5
    //   425: iload #6
    //   427: baload
    //   428: iconst_2
    //   429: iushr
    //   430: bipush #63
    //   432: iand
    //   433: i2b
    //   434: bastore
    //   435: aload #4
    //   437: iload #7
    //   439: iconst_1
    //   440: iadd
    //   441: aload #5
    //   443: iload #6
    //   445: iconst_1
    //   446: iadd
    //   447: baload
    //   448: iconst_4
    //   449: iushr
    //   450: bipush #15
    //   452: iand
    //   453: aload #5
    //   455: iload #6
    //   457: baload
    //   458: iconst_4
    //   459: ishl
    //   460: bipush #63
    //   462: iand
    //   463: ior
    //   464: i2b
    //   465: bastore
    //   466: aload #4
    //   468: iload #7
    //   470: iconst_2
    //   471: iadd
    //   472: aload #5
    //   474: iload #6
    //   476: iconst_2
    //   477: iadd
    //   478: baload
    //   479: bipush #6
    //   481: iushr
    //   482: iconst_3
    //   483: iand
    //   484: aload #5
    //   486: iload #6
    //   488: iconst_1
    //   489: iadd
    //   490: baload
    //   491: iconst_2
    //   492: ishl
    //   493: bipush #63
    //   495: iand
    //   496: ior
    //   497: i2b
    //   498: bastore
    //   499: aload #4
    //   501: iload #7
    //   503: iconst_3
    //   504: iadd
    //   505: aload #5
    //   507: iload #6
    //   509: iconst_2
    //   510: iadd
    //   511: baload
    //   512: bipush #63
    //   514: iand
    //   515: i2b
    //   516: bastore
    //   517: iinc #6, 3
    //   520: iinc #7, 4
    //   523: iload_2
    //   524: ifne -> 412
    //   527: iconst_0
    //   528: istore #6
    //   530: iload #6
    //   532: aload #4
    //   534: arraylength
    //   535: if_icmpge -> 719
    //   538: aload #4
    //   540: iload #6
    //   542: baload
    //   543: bipush #26
    //   545: if_icmpge -> 573
    //   548: aload #4
    //   550: iload #6
    //   552: aload #4
    //   554: iload #6
    //   556: baload
    //   557: bipush #65
    //   559: iadd
    //   560: i2b
    //   561: bastore
    //   562: iload_2
    //   563: ifne -> 712
    //   566: goto -> 573
    //   569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   572: athrow
    //   573: aload #4
    //   575: iload #6
    //   577: baload
    //   578: bipush #52
    //   580: if_icmpge -> 618
    //   583: goto -> 590
    //   586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   589: athrow
    //   590: aload #4
    //   592: iload #6
    //   594: aload #4
    //   596: iload #6
    //   598: baload
    //   599: bipush #97
    //   601: iadd
    //   602: bipush #26
    //   604: isub
    //   605: i2b
    //   606: bastore
    //   607: iload_2
    //   608: ifne -> 712
    //   611: goto -> 618
    //   614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   617: athrow
    //   618: aload #4
    //   620: iload #6
    //   622: baload
    //   623: bipush #62
    //   625: if_icmpge -> 663
    //   628: goto -> 635
    //   631: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   634: athrow
    //   635: aload #4
    //   637: iload #6
    //   639: aload #4
    //   641: iload #6
    //   643: baload
    //   644: bipush #48
    //   646: iadd
    //   647: bipush #52
    //   649: isub
    //   650: i2b
    //   651: bastore
    //   652: iload_2
    //   653: ifne -> 712
    //   656: goto -> 663
    //   659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   662: athrow
    //   663: aload #4
    //   665: iload #6
    //   667: baload
    //   668: bipush #63
    //   670: if_icmpge -> 698
    //   673: goto -> 680
    //   676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   679: athrow
    //   680: aload #4
    //   682: iload #6
    //   684: bipush #43
    //   686: bastore
    //   687: iload_2
    //   688: ifne -> 712
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   697: athrow
    //   698: aload #4
    //   700: iload #6
    //   702: bipush #47
    //   704: bastore
    //   705: goto -> 712
    //   708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   711: athrow
    //   712: iinc #6, 1
    //   715: iload_2
    //   716: ifne -> 530
    //   719: aload #4
    //   721: arraylength
    //   722: iconst_1
    //   723: isub
    //   724: istore #6
    //   726: iload #6
    //   728: aload_3
    //   729: arraylength
    //   730: iconst_4
    //   731: imul
    //   732: iconst_3
    //   733: idiv
    //   734: if_icmple -> 751
    //   737: aload #4
    //   739: iload #6
    //   741: bipush #61
    //   743: bastore
    //   744: iinc #6, -1
    //   747: iload_2
    //   748: ifne -> 726
    //   751: getstatic burp/Zml2.Zh : Ljava/lang/String;
    //   754: getstatic burp/Ztg3.Zg : Ljava/lang/Object;
    //   757: checkcast java/math/BigInteger
    //   760: invokevirtual intValue : ()I
    //   763: bipush #32
    //   765: irem
    //   766: invokestatic abs : (I)I
    //   769: invokevirtual charAt : (I)C
    //   772: getstatic burp/Zkfb.ZV : Ljava/lang/String;
    //   775: getstatic burp/Zkc5.ZZ : Ljava/lang/Object;
    //   778: checkcast java/math/BigInteger
    //   781: invokevirtual intValue : ()I
    //   784: bipush #32
    //   786: irem
    //   787: invokestatic abs : (I)I
    //   790: invokevirtual charAt : (I)C
    //   793: if_icmpgt -> 908
    //   796: getstatic burp/Zrnw.Zg : Ljava/lang/String;
    //   799: getstatic burp/Ztsc.Zr : Ljava/lang/Object;
    //   802: checkcast java/math/BigInteger
    //   805: invokevirtual intValue : ()I
    //   808: bipush #32
    //   810: irem
    //   811: invokestatic abs : (I)I
    //   814: invokevirtual charAt : (I)C
    //   817: getstatic burp/Zr8r.Zn : Ljava/lang/String;
    //   820: getstatic burp/Zml2.Zo : Ljava/lang/Object;
    //   823: checkcast java/math/BigInteger
    //   826: invokevirtual intValue : ()I
    //   829: bipush #32
    //   831: irem
    //   832: invokestatic abs : (I)I
    //   835: invokevirtual charAt : (I)C
    //   838: if_icmple -> 908
    //   841: goto -> 848
    //   844: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   847: athrow
    //   848: getstatic burp/Zlzs.Zp : Ljava/lang/String;
    //   851: getstatic burp/Zzxa.ZI : Ljava/lang/Object;
    //   854: checkcast java/math/BigInteger
    //   857: invokevirtual intValue : ()I
    //   860: bipush #32
    //   862: irem
    //   863: invokestatic abs : (I)I
    //   866: invokevirtual charAt : (I)C
    //   869: getstatic burp/Ztpg.Zr : Ljava/lang/String;
    //   872: getstatic burp/Zlzs.ZL : Ljava/lang/Object;
    //   875: checkcast java/math/BigInteger
    //   878: invokevirtual intValue : ()I
    //   881: bipush #32
    //   883: irem
    //   884: invokestatic abs : (I)I
    //   887: invokevirtual charAt : (I)C
    //   890: if_icmple -> 908
    //   893: goto -> 900
    //   896: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   899: athrow
    //   900: iconst_1
    //   901: goto -> 909
    //   904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   907: athrow
    //   908: iconst_0
    //   909: ireturn
    //   910: astore_3
    //   911: new java/lang/Exception
    //   914: dup
    //   915: aload_3
    //   916: invokevirtual getMessage : ()Ljava/lang/String;
    //   919: invokespecial <init> : (Ljava/lang/String;)V
    //   922: athrow
    // Exception table:
    //   from	to	target	type
    //   4	909	910	java/lang/Throwable
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
    //   538	566	569	java/lang/Throwable
    //   548	583	586	java/lang/Throwable
    //   573	611	614	java/lang/Throwable
    //   590	628	631	java/lang/Throwable
    //   618	656	659	java/lang/Throwable
    //   635	673	676	java/lang/Throwable
    //   663	691	694	java/lang/Throwable
    //   680	705	708	java/lang/Throwable
    //   751	841	844	java/lang/Throwable
    //   796	893	896	java/lang/Throwable
    //   848	904	904	java/lang/Throwable
  }
  
  static void ZQ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZC(Object paramObject) {
    Zr4z.Zw = a(-18800, 29291);
    Zr4z.ZH = new BigInteger(a(-18793, -27935));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zl15.ZI.charAt(Math.abs(((BigInteger)Zspk.ZF).intValue() % 32)) <= Zr4z.Zw.charAt(Math.abs(((BigInteger)Zzoc.Zx).intValue() % 32))) {
          try {
            Zro2.ZJ(Class.forName(a(-18794, -5853)));
            if (!bool)
              Zeai.ZE(Class.forName(a(-18796, -26479))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zeai.ZE(Class.forName(a(-18796, -26479)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 's©·U®x+Mî=ã"*ódT#{°IFêîI¥çÍ´Ô@æ¾x*Áÿª§]¢ä.%ÅHÙ2lÖÀ4Y0ÿÙ®ÝÞ1#p1 ?hPzÿØwáôO\\t©DìèÅÏyµ\\t.\ëÛ¯®&â<\\t+S¼\\nÏ,Â'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #44
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
    //   68: ldc '°ÊKr«oÏCªu¥ùéÐiá(\\niQø÷]åc nÊüõ?ØÁÒÜåg`jU¬¾ ,C^éÁ\Þ­'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #37
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
    //   129: putstatic burp/Zm5s.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zm5s.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #24
    //   214: goto -> 243
    //   217: bipush #27
    //   219: goto -> 243
    //   222: bipush #47
    //   224: goto -> 243
    //   227: iconst_1
    //   228: goto -> 243
    //   231: bipush #6
    //   233: goto -> 243
    //   236: bipush #127
    //   238: goto -> 243
    //   241: bipush #59
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #71
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-32
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #111
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-15
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-53
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #14
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-67
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-105
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #63
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-32
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #109
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #73
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-17
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-29
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #9
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-97
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #112
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #111
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #32
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-69
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #32
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #114
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #72
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-18
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #33
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #64
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-75
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #-13
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #122
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #46
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #56
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-103
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zm5s.ZB : Ljava/lang/Object;
    //   501: sipush #-18799
    //   504: sipush #3757
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zm5s.Z_ : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB696) & 0xFFFF;
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
      byte b1 = 47;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm5s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */