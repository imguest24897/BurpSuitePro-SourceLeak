package burp;

import java.math.BigInteger;

class Zrcx extends ClassLoader {
  static String ZW;
  
  static Object Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zg(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zc(Object paramObject) {
    Zex5.Zh = a(5911, 5469);
    Zex5.Zb = new BigInteger(a(5918, -17709));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zs9x.ZY.charAt(Math.abs(((BigInteger)Zec_.ZN).intValue() % 32)) > Zec_.Zv.charAt(Math.abs(((BigInteger)Zztx.ZM).intValue() % 32))) {
          try {
            Zmsl.Zx(Class.forName(a(5915, 30093)));
            if (bool)
              Zlwm.ZU(Class.forName(a(5910, -19672))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlwm.ZU(Class.forName(a(5910, -19672)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zw(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zsbd.Zh : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zgfm.ZV : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zkff.Zr : Ljava/lang/Object;
    //   22: sipush #5909
    //   25: getstatic burp/Zrfl.Z_ : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zec0.Zg : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zztx.ZM : Ljava/lang/Object;
    //   43: sipush #-16325
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: iconst_1
    //   50: ldc burp/Zbz_
    //   52: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   55: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   58: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   61: astore_3
    //   62: aload_3
    //   63: arraylength
    //   64: istore #4
    //   66: iconst_0
    //   67: istore #5
    //   69: iload #5
    //   71: iload #4
    //   73: if_icmpge -> 210
    //   76: aload_3
    //   77: iload #5
    //   79: aaload
    //   80: astore #6
    //   82: aload #6
    //   84: invokevirtual getModifiers : ()I
    //   87: invokestatic isStatic : (I)Z
    //   90: ifne -> 100
    //   93: goto -> 203
    //   96: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   99: athrow
    //   100: aload #6
    //   102: invokevirtual getType : ()Ljava/lang/Class;
    //   105: astore #7
    //   107: aload #7
    //   109: ifnull -> 190
    //   112: aload #7
    //   114: invokevirtual isPrimitive : ()Z
    //   117: ifne -> 190
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   126: athrow
    //   127: aload #7
    //   129: invokevirtual getPackage : ()Ljava/lang/Package;
    //   132: ifnull -> 190
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: ifnull -> 190
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: invokevirtual getName : ()Ljava/lang/String;
    //   168: sipush #5913
    //   171: sipush #-10975
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   180: ifne -> 190
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   189: athrow
    //   190: aload #6
    //   192: iconst_1
    //   193: invokevirtual setAccessible : (Z)V
    //   196: aload #6
    //   198: aconst_null
    //   199: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   202: pop
    //   203: iinc #5, 1
    //   206: iload_2
    //   207: ifeq -> 69
    //   210: sipush #5908
    //   213: sipush #-11726
    //   216: invokestatic a : (II)Ljava/lang/String;
    //   219: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   222: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   225: astore_3
    //   226: aload_3
    //   227: arraylength
    //   228: istore #4
    //   230: iconst_0
    //   231: istore #5
    //   233: iload #5
    //   235: iload #4
    //   237: if_icmpge -> 369
    //   240: aload_3
    //   241: iload #5
    //   243: aaload
    //   244: astore #6
    //   246: aload #6
    //   248: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   251: pop
    //   252: aload #6
    //   254: invokevirtual getModifiers : ()I
    //   257: invokestatic isStatic : (I)Z
    //   260: ifeq -> 355
    //   263: aload #6
    //   265: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   268: arraylength
    //   269: iconst_2
    //   270: if_icmpne -> 355
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   279: athrow
    //   280: aload #6
    //   282: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   285: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   288: invokevirtual equals : (Ljava/lang/Object;)Z
    //   291: ifeq -> 355
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   300: athrow
    //   301: aload #6
    //   303: iconst_1
    //   304: invokevirtual setAccessible : (Z)V
    //   307: aload #6
    //   309: aconst_null
    //   310: iconst_2
    //   311: anewarray java/lang/Object
    //   314: dup
    //   315: iconst_0
    //   316: aload_0
    //   317: aastore
    //   318: dup
    //   319: iconst_1
    //   320: aload_1
    //   321: ifnonnull -> 339
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   330: athrow
    //   331: aload_1
    //   332: goto -> 346
    //   335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   338: athrow
    //   339: aload_1
    //   340: checkcast [B
    //   343: invokevirtual clone : ()Ljava/lang/Object;
    //   346: aastore
    //   347: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   350: pop
    //   351: iload_2
    //   352: ifeq -> 369
    //   355: iinc #5, 1
    //   358: iload_2
    //   359: ifeq -> 233
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   368: athrow
    //   369: new java/io/ByteArrayOutputStream
    //   372: dup
    //   373: invokespecial <init> : ()V
    //   376: astore_3
    //   377: sipush #5916
    //   380: aload_3
    //   381: sipush #202
    //   384: invokevirtual write : (I)V
    //   387: sipush #16233
    //   390: aload_3
    //   391: sipush #254
    //   394: invokevirtual write : (I)V
    //   397: aload_3
    //   398: sipush #186
    //   401: invokevirtual write : (I)V
    //   404: aload_3
    //   405: sipush #190
    //   408: invokevirtual write : (I)V
    //   411: aload_3
    //   412: iconst_0
    //   413: invokevirtual write : (I)V
    //   416: aload_3
    //   417: iconst_1
    //   418: invokevirtual write : (I)V
    //   421: aload_3
    //   422: iconst_0
    //   423: invokevirtual write : (I)V
    //   426: aload_3
    //   427: bipush #50
    //   429: invokevirtual write : (I)V
    //   432: aload_3
    //   433: getstatic burp/Zgp_.Zm : Ljava/lang/Object;
    //   436: checkcast java/math/BigInteger
    //   439: invokevirtual toByteArray : ()[B
    //   442: invokevirtual write : ([B)V
    //   445: aload_3
    //   446: getstatic burp/Zg6f.Zl : Ljava/lang/Object;
    //   449: checkcast java/math/BigInteger
    //   452: invokevirtual toByteArray : ()[B
    //   455: invokevirtual write : ([B)V
    //   458: aload_3
    //   459: getstatic burp/Zxd0.Za : Ljava/lang/Object;
    //   462: checkcast java/math/BigInteger
    //   465: invokevirtual toByteArray : ()[B
    //   468: invokevirtual write : ([B)V
    //   471: aload_3
    //   472: invokevirtual toByteArray : ()[B
    //   475: astore #4
    //   477: aconst_null
    //   478: astore #5
    //   480: invokestatic a : (II)Ljava/lang/String;
    //   483: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   486: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   489: astore #6
    //   491: aload #6
    //   493: arraylength
    //   494: istore #7
    //   496: iconst_0
    //   497: istore #8
    //   499: iload #8
    //   501: iload #7
    //   503: if_icmpge -> 631
    //   506: aload #6
    //   508: iload #8
    //   510: aaload
    //   511: astore #9
    //   513: aload #9
    //   515: invokevirtual getName : ()Ljava/lang/String;
    //   518: sipush #5912
    //   521: sipush #1894
    //   524: invokestatic a : (II)Ljava/lang/String;
    //   527: invokevirtual equals : (Ljava/lang/Object;)Z
    //   530: ifeq -> 624
    //   533: aload #9
    //   535: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   538: astore #10
    //   540: aload #10
    //   542: arraylength
    //   543: iconst_4
    //   544: if_icmpeq -> 554
    //   547: goto -> 624
    //   550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   553: athrow
    //   554: aload #10
    //   556: iconst_0
    //   557: aaload
    //   558: ldc java/lang/String
    //   560: if_acmpeq -> 570
    //   563: goto -> 624
    //   566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   569: athrow
    //   570: aload #10
    //   572: iconst_1
    //   573: aaload
    //   574: ldc [B
    //   576: if_acmpeq -> 586
    //   579: goto -> 624
    //   582: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   585: athrow
    //   586: aload #10
    //   588: iconst_2
    //   589: aaload
    //   590: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   593: if_acmpeq -> 603
    //   596: goto -> 624
    //   599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   602: athrow
    //   603: aload #10
    //   605: iconst_3
    //   606: aaload
    //   607: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   610: if_acmpeq -> 620
    //   613: goto -> 624
    //   616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   619: athrow
    //   620: aload #9
    //   622: astore #5
    //   624: iinc #8, 1
    //   627: iload_2
    //   628: ifeq -> 499
    //   631: aload #5
    //   633: iconst_1
    //   634: invokevirtual setAccessible : (Z)V
    //   637: ldc burp/Zxt5
    //   639: iconst_0
    //   640: anewarray java/lang/Class
    //   643: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   646: astore #6
    //   648: aload #6
    //   650: iconst_1
    //   651: invokevirtual setAccessible : (Z)V
    //   654: aload #5
    //   656: aload #6
    //   658: iconst_0
    //   659: anewarray java/lang/Object
    //   662: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   665: iconst_4
    //   666: anewarray java/lang/Object
    //   669: dup
    //   670: iconst_0
    //   671: sipush #5917
    //   674: sipush #30525
    //   677: invokestatic a : (II)Ljava/lang/String;
    //   680: aastore
    //   681: dup
    //   682: iconst_1
    //   683: aload #4
    //   685: aastore
    //   686: dup
    //   687: iconst_2
    //   688: iconst_0
    //   689: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   692: aastore
    //   693: dup
    //   694: iconst_3
    //   695: aload #4
    //   697: arraylength
    //   698: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   701: aastore
    //   702: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   705: pop
    //   706: goto -> 710
    //   709: astore_3
    //   710: getstatic burp/Zl1n.ZZ : Ljava/lang/String;
    //   713: getstatic burp/Ztfr.Zr : Ljava/lang/Object;
    //   716: checkcast java/math/BigInteger
    //   719: invokevirtual intValue : ()I
    //   722: bipush #32
    //   724: irem
    //   725: invokestatic abs : (I)I
    //   728: invokevirtual charAt : (I)C
    //   731: getstatic burp/Zlpu.ZA : Ljava/lang/String;
    //   734: getstatic burp/Zrw7.ZV : Ljava/lang/Object;
    //   737: checkcast java/math/BigInteger
    //   740: invokevirtual intValue : ()I
    //   743: bipush #32
    //   745: irem
    //   746: invokestatic abs : (I)I
    //   749: invokevirtual charAt : (I)C
    //   752: if_icmple -> 867
    //   755: getstatic burp/Zlum.ZW : Ljava/lang/String;
    //   758: getstatic burp/Zb9m.ZK : Ljava/lang/Object;
    //   761: checkcast java/math/BigInteger
    //   764: invokevirtual intValue : ()I
    //   767: bipush #32
    //   769: irem
    //   770: invokestatic abs : (I)I
    //   773: invokevirtual charAt : (I)C
    //   776: getstatic burp/Ze3z.Zv : Ljava/lang/String;
    //   779: getstatic burp/Zty2.Zl : Ljava/lang/Object;
    //   782: checkcast java/math/BigInteger
    //   785: invokevirtual intValue : ()I
    //   788: bipush #32
    //   790: irem
    //   791: invokestatic abs : (I)I
    //   794: invokevirtual charAt : (I)C
    //   797: if_icmpgt -> 867
    //   800: goto -> 807
    //   803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   806: athrow
    //   807: getstatic burp/Zt7w.Zi : Ljava/lang/String;
    //   810: getstatic burp/Zsyu.Zj : Ljava/lang/Object;
    //   813: checkcast java/math/BigInteger
    //   816: invokevirtual intValue : ()I
    //   819: bipush #32
    //   821: irem
    //   822: invokestatic abs : (I)I
    //   825: invokevirtual charAt : (I)C
    //   828: getstatic burp/Zegk.Ze : Ljava/lang/String;
    //   831: getstatic burp/Zec0.Zg : Ljava/lang/Object;
    //   834: checkcast java/math/BigInteger
    //   837: invokevirtual intValue : ()I
    //   840: bipush #32
    //   842: irem
    //   843: invokestatic abs : (I)I
    //   846: invokevirtual charAt : (I)C
    //   849: if_icmpgt -> 867
    //   852: goto -> 859
    //   855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   858: athrow
    //   859: iconst_1
    //   860: goto -> 868
    //   863: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   866: athrow
    //   867: iconst_0
    //   868: ireturn
    //   869: astore_3
    //   870: new java/lang/Exception
    //   873: dup
    //   874: aload_3
    //   875: invokevirtual getMessage : ()Ljava/lang/String;
    //   878: invokespecial <init> : (Ljava/lang/String;)V
    //   881: athrow
    // Exception table:
    //   from	to	target	type
    //   4	868	869	java/lang/Throwable
    //   82	96	96	java/lang/Throwable
    //   107	120	123	java/lang/Throwable
    //   112	135	138	java/lang/Throwable
    //   127	153	156	java/lang/Throwable
    //   142	183	186	java/lang/Throwable
    //   246	273	276	java/lang/Throwable
    //   263	294	297	java/lang/Throwable
    //   280	324	327	java/lang/Throwable
    //   301	335	335	java/lang/Throwable
    //   346	362	365	java/lang/Throwable
    //   369	706	709	java/lang/Throwable
    //   540	550	550	java/lang/Throwable
    //   554	566	566	java/lang/Throwable
    //   570	582	582	java/lang/Throwable
    //   586	599	599	java/lang/Throwable
    //   603	616	616	java/lang/Throwable
    //   710	800	803	java/lang/Throwable
    //   755	852	855	java/lang/Throwable
    //   807	863	863	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '<T?¢^.\\npHÏ+æ\æâ1oe:óöUÑM.·ëÃú\\n+Ìãà<·TrØ[íyc+^ý^s\\føâ­I£ÊR+è²êõ{YÆ®É°N®^JPM Þ ¦5âçwkËùL  ÆÇb£¤¨à®\\buiùh¸ZÞî`«9!àËá©ïd\\tf°pJK`{oÜü¬ñ·cÔ\åZsA#Í3£ôÃ]ãjE¥Êm+ë\\r¨Ëê0(_Ôð\\t>ªæ_u <&ÐéXÃaÕ[¢\\t´J(j¿Y¨TÇÖ2äîî\\bÁnCUO°v\\bsÖ®òéÁ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #52
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
    //   68: ldc '#hôÿdè®óÎÿ¤ÒNtLÚ\\nßRº\Ü³±Õ\\tù`}xÒòt'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #64
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
    //   129: putstatic burp/Zrcx.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrcx.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #75
    //   214: goto -> 243
    //   217: bipush #78
    //   219: goto -> 243
    //   222: bipush #63
    //   224: goto -> 243
    //   227: bipush #94
    //   229: goto -> 243
    //   232: iconst_2
    //   233: goto -> 243
    //   236: bipush #122
    //   238: goto -> 243
    //   241: bipush #103
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
    //   300: sipush #5914
    //   303: sipush #24126
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zrcx.ZW : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #5919
    //   319: sipush #370
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zrcx.Za : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x171D) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrcx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */