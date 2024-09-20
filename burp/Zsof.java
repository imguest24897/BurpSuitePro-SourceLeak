package burp;

import java.math.BigInteger;

class Zsof extends ClassLoader {
  static Object ZQ;
  
  static String ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZQ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #-9273
    //   7: sipush #31836
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
    //   31: if_icmpge -> 181
    //   34: aload_3
    //   35: iload #5
    //   37: aaload
    //   38: astore #6
    //   40: aload #6
    //   42: invokevirtual getType : ()Ljava/lang/Class;
    //   45: ldc java/lang/Object
    //   47: invokevirtual equals : (Ljava/lang/Object;)Z
    //   50: ifeq -> 174
    //   53: aload #6
    //   55: iconst_1
    //   56: invokevirtual setAccessible : (Z)V
    //   59: aload #6
    //   61: aconst_null
    //   62: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   65: checkcast java/lang/Class
    //   68: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   71: astore #7
    //   73: aload #7
    //   75: arraylength
    //   76: istore #8
    //   78: iconst_0
    //   79: istore #9
    //   81: iload #9
    //   83: iload #8
    //   85: if_icmpge -> 174
    //   88: aload #7
    //   90: iload #9
    //   92: aaload
    //   93: astore #10
    //   95: aload #10
    //   97: invokevirtual getModifiers : ()I
    //   100: invokestatic isStatic : (I)Z
    //   103: ifeq -> 167
    //   106: aload #10
    //   108: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   111: arraylength
    //   112: iconst_2
    //   113: if_icmpne -> 167
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   122: athrow
    //   123: aload #10
    //   125: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   128: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   131: if_acmpne -> 167
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   140: athrow
    //   141: aload #10
    //   143: aconst_null
    //   144: iconst_2
    //   145: anewarray java/lang/Object
    //   148: dup
    //   149: iconst_0
    //   150: aload_0
    //   151: aastore
    //   152: dup
    //   153: iconst_1
    //   154: aload_1
    //   155: aastore
    //   156: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   159: pop
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   166: athrow
    //   167: iinc #9, 1
    //   170: iload_2
    //   171: ifeq -> 81
    //   174: iinc #5, 1
    //   177: iload_2
    //   178: ifeq -> 27
    //   181: sipush #-9275
    //   184: sipush #21585
    //   187: invokestatic a : (II)Ljava/lang/String;
    //   190: iconst_1
    //   191: ldc burp/Zb1
    //   193: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   196: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   199: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   202: astore_3
    //   203: aload_3
    //   204: arraylength
    //   205: istore #4
    //   207: iconst_0
    //   208: istore #5
    //   210: iload #5
    //   212: iload #4
    //   214: if_icmpge -> 351
    //   217: aload_3
    //   218: iload #5
    //   220: aaload
    //   221: astore #6
    //   223: aload #6
    //   225: invokevirtual getModifiers : ()I
    //   228: invokestatic isStatic : (I)Z
    //   231: ifne -> 241
    //   234: goto -> 344
    //   237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   240: athrow
    //   241: aload #6
    //   243: invokevirtual getType : ()Ljava/lang/Class;
    //   246: astore #7
    //   248: aload #7
    //   250: ifnull -> 331
    //   253: aload #7
    //   255: invokevirtual isPrimitive : ()Z
    //   258: ifne -> 331
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   267: athrow
    //   268: aload #7
    //   270: invokevirtual getPackage : ()Ljava/lang/Package;
    //   273: ifnull -> 331
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   282: athrow
    //   283: aload #7
    //   285: invokevirtual getPackage : ()Ljava/lang/Package;
    //   288: invokevirtual getName : ()Ljava/lang/String;
    //   291: ifnull -> 331
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   300: athrow
    //   301: aload #7
    //   303: invokevirtual getPackage : ()Ljava/lang/Package;
    //   306: invokevirtual getName : ()Ljava/lang/String;
    //   309: sipush #-9274
    //   312: sipush #30284
    //   315: invokestatic a : (II)Ljava/lang/String;
    //   318: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   321: ifne -> 331
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   330: athrow
    //   331: aload #6
    //   333: iconst_1
    //   334: invokevirtual setAccessible : (Z)V
    //   337: aload #6
    //   339: aconst_null
    //   340: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   343: pop
    //   344: iinc #5, 1
    //   347: iload_2
    //   348: ifeq -> 210
    //   351: sipush #-9280
    //   354: sipush #-14533
    //   357: invokestatic a : (II)Ljava/lang/String;
    //   360: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   363: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   366: astore_3
    //   367: aload_3
    //   368: arraylength
    //   369: istore #4
    //   371: iconst_0
    //   372: istore #5
    //   374: iload #5
    //   376: iload #4
    //   378: if_icmpge -> 510
    //   381: aload_3
    //   382: iload #5
    //   384: aaload
    //   385: astore #6
    //   387: aload #6
    //   389: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   392: pop
    //   393: aload #6
    //   395: invokevirtual getModifiers : ()I
    //   398: invokestatic isStatic : (I)Z
    //   401: ifeq -> 496
    //   404: aload #6
    //   406: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   409: arraylength
    //   410: iconst_2
    //   411: if_icmpne -> 496
    //   414: goto -> 421
    //   417: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   420: athrow
    //   421: aload #6
    //   423: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   426: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   429: invokevirtual equals : (Ljava/lang/Object;)Z
    //   432: ifeq -> 496
    //   435: goto -> 442
    //   438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   441: athrow
    //   442: aload #6
    //   444: iconst_1
    //   445: invokevirtual setAccessible : (Z)V
    //   448: aload #6
    //   450: aconst_null
    //   451: iconst_2
    //   452: anewarray java/lang/Object
    //   455: dup
    //   456: iconst_0
    //   457: aload_0
    //   458: aastore
    //   459: dup
    //   460: iconst_1
    //   461: aload_1
    //   462: ifnonnull -> 480
    //   465: goto -> 472
    //   468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   471: athrow
    //   472: aload_1
    //   473: goto -> 487
    //   476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   479: athrow
    //   480: aload_1
    //   481: checkcast [B
    //   484: invokevirtual clone : ()Ljava/lang/Object;
    //   487: aastore
    //   488: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   491: pop
    //   492: iload_2
    //   493: ifeq -> 510
    //   496: iinc #5, 1
    //   499: iload_2
    //   500: ifeq -> 374
    //   503: goto -> 510
    //   506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   509: athrow
    //   510: getstatic burp/Zkt7.ZM : Ljava/lang/String;
    //   513: getstatic burp/Zm8w.Zz : Ljava/lang/Object;
    //   516: checkcast java/math/BigInteger
    //   519: invokevirtual intValue : ()I
    //   522: bipush #32
    //   524: irem
    //   525: invokestatic abs : (I)I
    //   528: invokevirtual charAt : (I)C
    //   531: getstatic burp/Zxjk.Za : Ljava/lang/String;
    //   534: getstatic burp/Zs8q.ZI : Ljava/lang/Object;
    //   537: checkcast java/math/BigInteger
    //   540: invokevirtual intValue : ()I
    //   543: bipush #32
    //   545: irem
    //   546: invokestatic abs : (I)I
    //   549: invokevirtual charAt : (I)C
    //   552: if_icmple -> 659
    //   555: getstatic burp/Zmx6.ZG : Ljava/lang/String;
    //   558: getstatic burp/Zl06.Zw : Ljava/lang/Object;
    //   561: checkcast java/math/BigInteger
    //   564: invokevirtual intValue : ()I
    //   567: bipush #32
    //   569: irem
    //   570: invokestatic abs : (I)I
    //   573: invokevirtual charAt : (I)C
    //   576: getstatic burp/Zzyr.Z_ : Ljava/lang/String;
    //   579: getstatic burp/Zre5.Zo : Ljava/lang/Object;
    //   582: checkcast java/math/BigInteger
    //   585: invokevirtual intValue : ()I
    //   588: bipush #32
    //   590: irem
    //   591: invokestatic abs : (I)I
    //   594: invokevirtual charAt : (I)C
    //   597: if_icmpgt -> 659
    //   600: goto -> 607
    //   603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   606: athrow
    //   607: getstatic burp/Zx6d.ZP : Ljava/lang/String;
    //   610: getstatic burp/Zzym.ZK : Ljava/lang/Object;
    //   613: checkcast java/math/BigInteger
    //   616: invokevirtual intValue : ()I
    //   619: bipush #32
    //   621: irem
    //   622: invokestatic abs : (I)I
    //   625: invokevirtual charAt : (I)C
    //   628: getstatic burp/Zest.Zd : Ljava/lang/String;
    //   631: getstatic burp/Zmyg.Zj : Ljava/lang/Object;
    //   634: checkcast java/math/BigInteger
    //   637: invokevirtual intValue : ()I
    //   640: bipush #32
    //   642: irem
    //   643: invokestatic abs : (I)I
    //   646: invokevirtual charAt : (I)C
    //   649: if_icmple -> 667
    //   652: goto -> 659
    //   655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   658: athrow
    //   659: iconst_1
    //   660: goto -> 668
    //   663: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   666: athrow
    //   667: iconst_0
    //   668: ireturn
    //   669: astore_3
    //   670: new java/lang/Exception
    //   673: dup
    //   674: aload_3
    //   675: invokevirtual getMessage : ()Ljava/lang/String;
    //   678: invokespecial <init> : (Ljava/lang/String;)V
    //   681: athrow
    // Exception table:
    //   from	to	target	type
    //   4	668	669	java/lang/Throwable
    //   95	116	119	java/lang/Throwable
    //   106	134	137	java/lang/Throwable
    //   123	160	163	java/lang/Throwable
    //   223	237	237	java/lang/Throwable
    //   248	261	264	java/lang/Throwable
    //   253	276	279	java/lang/Throwable
    //   268	294	297	java/lang/Throwable
    //   283	324	327	java/lang/Throwable
    //   387	414	417	java/lang/Throwable
    //   404	435	438	java/lang/Throwable
    //   421	465	468	java/lang/Throwable
    //   442	476	476	java/lang/Throwable
    //   487	503	506	java/lang/Throwable
    //   510	600	603	java/lang/Throwable
    //   555	652	655	java/lang/Throwable
    //   607	663	663	java/lang/Throwable
  }
  
  static void ZU(Object paramObject) {
    Zgva.ZV = a(-9279, 4152);
    Zgva.Zr = new BigInteger(1, new byte[] { 
          43, 57, -86, -103, 108, -115, 86, 72, 10, 55, 
          9, 89, 107, 61, -80, 33, -69, -96, 81, 61, 
          -49, -32, -46, -40, -68, 117, -22, 100, 15, 27, 
          34, -109 });
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zlid.ZU.charAt(Math.abs(((BigInteger)Zmtf.ZH).intValue() % 32)) > Zb3z.Zi.charAt(Math.abs(((BigInteger)Zec0.Zg).intValue() % 32))) {
          try {
            Zer1.Zx(Class.forName(a(-9276, 18776)));
            if (bool)
              Zgj5.ZN(Class.forName(a(-9277, 10672))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgj5.ZN(Class.forName(a(-9277, 10672)));
    } catch (Throwable throwable) {}
  }
  
  static void Zy(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'á0¯\\t¹År61mª,³³#óùÉöarû¬\\tnÎdËQÓþÆm\\bIÞÉÍwË /9â¤´¶ñ}øéØç®¾VÖ±PlÝmh~Õ½¿S\\t¾[Å¶þò\\ttI';9ÍýÌ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #58
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
    //   68: ldc 'q½VtÆõÖÚßum'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #13
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
    //   129: putstatic burp/Zsof.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zsof.b : [Ljava/lang/String;
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
    //   212: bipush #116
    //   214: goto -> 244
    //   217: bipush #79
    //   219: goto -> 244
    //   222: bipush #6
    //   224: goto -> 244
    //   227: bipush #45
    //   229: goto -> 244
    //   232: bipush #114
    //   234: goto -> 244
    //   237: bipush #86
    //   239: goto -> 244
    //   242: bipush #96
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
    //   310: bipush #82
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #100
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #17
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #23
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #100
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #53
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #103
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-59
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #46
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #86
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-90
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #17
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #38
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #44
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #49
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-67
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #93
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-7
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #57
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-68
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #57
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-47
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-104
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-54
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #97
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #41
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-53
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #45
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-96
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #69
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-113
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #83
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zsof.ZQ : Ljava/lang/Object;
    //   500: sipush #-9278
    //   503: sipush #15318
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zsof.ZU : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDBC1) & 0xFFFF;
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
      char c = 'û';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsof.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */