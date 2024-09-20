package burp;

import java.math.BigInteger;

class Zmyk extends ClassLoader {
  static Object Za;
  
  static String Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZY(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zl(Object paramObject) {
    Zbss.ZV = a(-197, -10644);
    Zbss.Zh = new BigInteger(a(-196, -31265));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zek4.Zo.charAt(Math.abs(((BigInteger)Zea9.Zt).intValue() % 32)) <= Zxt7.Zi.charAt(Math.abs(((BigInteger)Zrh_.Zb).intValue() % 32))) {
          try {
            Zl6e.ZB(Class.forName(a(-198, 26384)));
            if (!bool)
              Zlwj.ZW(Class.forName(a(-193, -30958))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlwj.ZW(Class.forName(a(-193, -30958)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZO(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zsn4.ZQ : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zz0b.ZT : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zbx4.Zw : Ljava/lang/Object;
    //   22: sipush #-195
    //   25: getstatic burp/Zg7u.Zh : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zl3j.ZY : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zeub.ZD : Ljava/lang/Object;
    //   43: sipush #-23908
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: iconst_1
    //   50: ldc burp/Zxyq
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
    //   168: sipush #-199
    //   171: sipush #29885
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
    //   207: ifne -> 69
    //   210: sipush #-194
    //   213: sipush #-1926
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
    //   352: ifne -> 369
    //   355: iinc #5, 1
    //   358: iload_2
    //   359: ifne -> 233
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   368: athrow
    //   369: getstatic burp/Zsjc.ZX : Ljava/lang/Object;
    //   372: checkcast java/math/BigInteger
    //   375: invokevirtual toByteArray : ()[B
    //   378: astore_3
    //   379: aload_3
    //   380: arraylength
    //   381: bipush #8
    //   383: iadd
    //   384: bipush #6
    //   386: ishr
    //   387: iconst_1
    //   388: iadd
    //   389: bipush #16
    //   391: imul
    //   392: newarray int
    //   394: astore #5
    //   396: iconst_0
    //   397: istore #6
    //   399: iload #6
    //   401: aload_3
    //   402: arraylength
    //   403: if_icmpge -> 446
    //   406: aload_3
    //   407: iload #6
    //   409: baload
    //   410: sipush #255
    //   413: iand
    //   414: istore #7
    //   416: aload #5
    //   418: iload #6
    //   420: iconst_2
    //   421: ishr
    //   422: dup2
    //   423: iaload
    //   424: iload #7
    //   426: bipush #24
    //   428: iload #6
    //   430: iconst_4
    //   431: irem
    //   432: bipush #8
    //   434: imul
    //   435: isub
    //   436: ishl
    //   437: ior
    //   438: iastore
    //   439: iinc #6, 1
    //   442: iload_2
    //   443: ifne -> 399
    //   446: aload #5
    //   448: iload #6
    //   450: iconst_2
    //   451: ishr
    //   452: dup2
    //   453: iaload
    //   454: sipush #128
    //   457: bipush #24
    //   459: iload #6
    //   461: iconst_4
    //   462: irem
    //   463: bipush #8
    //   465: imul
    //   466: isub
    //   467: ishl
    //   468: ior
    //   469: iastore
    //   470: aload #5
    //   472: aload #5
    //   474: arraylength
    //   475: iconst_1
    //   476: isub
    //   477: aload_3
    //   478: arraylength
    //   479: bipush #8
    //   481: imul
    //   482: iastore
    //   483: bipush #80
    //   485: newarray int
    //   487: astore #7
    //   489: ldc 1732584193
    //   491: istore #8
    //   493: ldc -271733879
    //   495: istore #9
    //   497: ldc -1732584194
    //   499: istore #10
    //   501: ldc 271733878
    //   503: istore #11
    //   505: ldc -1009589776
    //   507: istore #12
    //   509: iconst_0
    //   510: istore #6
    //   512: iload #6
    //   514: aload #5
    //   516: arraylength
    //   517: if_icmpge -> 839
    //   520: iload #8
    //   522: istore #13
    //   524: iload #9
    //   526: istore #14
    //   528: iload #10
    //   530: istore #15
    //   532: iload #11
    //   534: istore #16
    //   536: iload #12
    //   538: istore #17
    //   540: iconst_0
    //   541: istore #18
    //   543: iload #18
    //   545: bipush #80
    //   547: if_icmpge -> 797
    //   550: iload #18
    //   552: bipush #16
    //   554: if_icmpge -> 581
    //   557: aload #7
    //   559: iload #18
    //   561: aload #5
    //   563: iload #6
    //   565: iload #18
    //   567: iadd
    //   568: iaload
    //   569: iastore
    //   570: iload_2
    //   571: ifne -> 636
    //   574: goto -> 581
    //   577: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   580: athrow
    //   581: aload #7
    //   583: iload #18
    //   585: iconst_3
    //   586: isub
    //   587: iaload
    //   588: aload #7
    //   590: iload #18
    //   592: bipush #8
    //   594: isub
    //   595: iaload
    //   596: ixor
    //   597: aload #7
    //   599: iload #18
    //   601: bipush #14
    //   603: isub
    //   604: iaload
    //   605: ixor
    //   606: aload #7
    //   608: iload #18
    //   610: bipush #16
    //   612: isub
    //   613: iaload
    //   614: ixor
    //   615: istore #19
    //   617: iload #19
    //   619: iconst_1
    //   620: ishl
    //   621: iload #19
    //   623: bipush #31
    //   625: iushr
    //   626: ior
    //   627: istore #20
    //   629: aload #7
    //   631: iload #18
    //   633: iload #20
    //   635: iastore
    //   636: iload #8
    //   638: iconst_5
    //   639: ishl
    //   640: iload #8
    //   642: bipush #27
    //   644: iushr
    //   645: ior
    //   646: istore #19
    //   648: iload #19
    //   650: iload #12
    //   652: iadd
    //   653: aload #7
    //   655: iload #18
    //   657: iaload
    //   658: iadd
    //   659: iload #18
    //   661: bipush #20
    //   663: if_icmpge -> 689
    //   666: ldc 1518500249
    //   668: iload #9
    //   670: iload #10
    //   672: iand
    //   673: iload #9
    //   675: iconst_m1
    //   676: ixor
    //   677: iload #11
    //   679: iand
    //   680: ior
    //   681: iadd
    //   682: goto -> 759
    //   685: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   688: athrow
    //   689: iload #18
    //   691: bipush #40
    //   693: if_icmpge -> 714
    //   696: ldc 1859775393
    //   698: iload #9
    //   700: iload #10
    //   702: ixor
    //   703: iload #11
    //   705: ixor
    //   706: iadd
    //   707: goto -> 759
    //   710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   713: athrow
    //   714: iload #18
    //   716: bipush #60
    //   718: if_icmpge -> 748
    //   721: ldc -1894007588
    //   723: iload #9
    //   725: iload #10
    //   727: iand
    //   728: iload #9
    //   730: iload #11
    //   732: iand
    //   733: ior
    //   734: iload #10
    //   736: iload #11
    //   738: iand
    //   739: ior
    //   740: iadd
    //   741: goto -> 759
    //   744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   747: athrow
    //   748: ldc -899497514
    //   750: iload #9
    //   752: iload #10
    //   754: ixor
    //   755: iload #11
    //   757: ixor
    //   758: iadd
    //   759: iadd
    //   760: istore #20
    //   762: iload #11
    //   764: istore #12
    //   766: iload #10
    //   768: istore #11
    //   770: iload #9
    //   772: bipush #30
    //   774: ishl
    //   775: iload #9
    //   777: iconst_2
    //   778: iushr
    //   779: ior
    //   780: istore #10
    //   782: iload #8
    //   784: istore #9
    //   786: iload #20
    //   788: istore #8
    //   790: iinc #18, 1
    //   793: iload_2
    //   794: ifne -> 543
    //   797: iload #8
    //   799: iload #13
    //   801: iadd
    //   802: istore #8
    //   804: iload #9
    //   806: iload #14
    //   808: iadd
    //   809: istore #9
    //   811: iload #10
    //   813: iload #15
    //   815: iadd
    //   816: istore #10
    //   818: iload #11
    //   820: iload #16
    //   822: iadd
    //   823: istore #11
    //   825: iload #12
    //   827: iload #17
    //   829: iadd
    //   830: istore #12
    //   832: iinc #6, 16
    //   835: iload_2
    //   836: ifne -> 512
    //   839: iconst_5
    //   840: newarray int
    //   842: dup
    //   843: iconst_0
    //   844: iload #8
    //   846: iastore
    //   847: dup
    //   848: iconst_1
    //   849: iload #9
    //   851: iastore
    //   852: dup
    //   853: iconst_2
    //   854: iload #10
    //   856: iastore
    //   857: dup
    //   858: iconst_3
    //   859: iload #11
    //   861: iastore
    //   862: dup
    //   863: iconst_4
    //   864: iload #12
    //   866: iastore
    //   867: astore #13
    //   869: bipush #20
    //   871: newarray byte
    //   873: astore #14
    //   875: iconst_0
    //   876: istore #15
    //   878: iload #15
    //   880: bipush #20
    //   882: if_icmpge -> 923
    //   885: aload #13
    //   887: iload #15
    //   889: iconst_4
    //   890: idiv
    //   891: iaload
    //   892: istore #16
    //   894: iconst_3
    //   895: iload #15
    //   897: iconst_4
    //   898: irem
    //   899: isub
    //   900: bipush #8
    //   902: imul
    //   903: istore #17
    //   905: aload #14
    //   907: iload #15
    //   909: iload #16
    //   911: iload #17
    //   913: iushr
    //   914: i2b
    //   915: bastore
    //   916: iinc #15, 1
    //   919: iload_2
    //   920: ifne -> 878
    //   923: aload #14
    //   925: astore #4
    //   927: getstatic burp/Zxci.Zw : Ljava/lang/String;
    //   930: getstatic burp/Zrw0.ZC : Ljava/lang/Object;
    //   933: checkcast java/math/BigInteger
    //   936: invokevirtual intValue : ()I
    //   939: bipush #32
    //   941: irem
    //   942: invokestatic abs : (I)I
    //   945: invokevirtual charAt : (I)C
    //   948: getstatic burp/Zrqi.Zu : Ljava/lang/String;
    //   951: getstatic burp/Zepy.Ze : Ljava/lang/Object;
    //   954: checkcast java/math/BigInteger
    //   957: invokevirtual intValue : ()I
    //   960: bipush #32
    //   962: irem
    //   963: invokestatic abs : (I)I
    //   966: invokevirtual charAt : (I)C
    //   969: if_icmple -> 1076
    //   972: getstatic burp/Zxci.Zw : Ljava/lang/String;
    //   975: getstatic burp/Zrle.Zl : Ljava/lang/Object;
    //   978: checkcast java/math/BigInteger
    //   981: invokevirtual intValue : ()I
    //   984: bipush #32
    //   986: irem
    //   987: invokestatic abs : (I)I
    //   990: invokevirtual charAt : (I)C
    //   993: getstatic burp/Zzhx.ZV : Ljava/lang/String;
    //   996: getstatic burp/Zejz.ZF : Ljava/lang/Object;
    //   999: checkcast java/math/BigInteger
    //   1002: invokevirtual intValue : ()I
    //   1005: bipush #32
    //   1007: irem
    //   1008: invokestatic abs : (I)I
    //   1011: invokevirtual charAt : (I)C
    //   1014: if_icmple -> 1076
    //   1017: goto -> 1024
    //   1020: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1023: athrow
    //   1024: getstatic burp/Zr6c.Zf : Ljava/lang/String;
    //   1027: getstatic burp/Zepy.Ze : Ljava/lang/Object;
    //   1030: checkcast java/math/BigInteger
    //   1033: invokevirtual intValue : ()I
    //   1036: bipush #32
    //   1038: irem
    //   1039: invokestatic abs : (I)I
    //   1042: invokevirtual charAt : (I)C
    //   1045: getstatic burp/Zb3l.Zz : Ljava/lang/String;
    //   1048: getstatic burp/Zr60.Ze : Ljava/lang/Object;
    //   1051: checkcast java/math/BigInteger
    //   1054: invokevirtual intValue : ()I
    //   1057: bipush #32
    //   1059: irem
    //   1060: invokestatic abs : (I)I
    //   1063: invokevirtual charAt : (I)C
    //   1066: if_icmple -> 1084
    //   1069: goto -> 1076
    //   1072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1075: athrow
    //   1076: iconst_1
    //   1077: goto -> 1085
    //   1080: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1083: athrow
    //   1084: iconst_0
    //   1085: ireturn
    //   1086: astore_3
    //   1087: new java/lang/Exception
    //   1090: dup
    //   1091: aload_3
    //   1092: invokevirtual getMessage : ()Ljava/lang/String;
    //   1095: invokespecial <init> : (Ljava/lang/String;)V
    //   1098: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1085	1086	java/lang/Throwable
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
    //   550	574	577	java/lang/Throwable
    //   648	685	685	java/lang/Throwable
    //   689	710	710	java/lang/Throwable
    //   714	744	744	java/lang/Throwable
    //   927	1017	1020	java/lang/Throwable
    //   972	1069	1072	java/lang/Throwable
    //   1024	1080	1080	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '±.§mn÷}¤ 8·a6ìµ¹²éFåq â!\ôxfz&â- ¬:o³y¨l1Mrf2Cdu÷uå£W¯gÌì3Ú¦·tgÓ\\tbù_}D¿\\tn\ìàìC'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #6
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
    //   68: ldc '¯ ÜSÒ¬<¥§£½KM½\\f«¸\\t" öLåWá÷5Lç¸+\\fR$»ÁidøRX>\îrßÕÃÇb ÉÔ[þOîËê}A¸»Éx,¯÷Ç\\t<FÕVàtâ`'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #33
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
    //   129: putstatic burp/Zmyk.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmyk.b : [Ljava/lang/String;
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
    //   212: bipush #27
    //   214: goto -> 244
    //   217: bipush #120
    //   219: goto -> 244
    //   222: bipush #104
    //   224: goto -> 244
    //   227: bipush #63
    //   229: goto -> 244
    //   232: bipush #64
    //   234: goto -> 244
    //   237: bipush #120
    //   239: goto -> 244
    //   242: bipush #19
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
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #122
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #93
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-94
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-82
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-41
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #34
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #112
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #117
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-31
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-103
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #90
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #58
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-92
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-42
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #78
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-114
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: iconst_4
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-54
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-63
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: iconst_1
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #-43
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #59
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #87
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #-118
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #127
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #101
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #-98
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #-16
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #-90
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-46
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-68
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #31
    //   492: bastore
    //   493: invokespecial <init> : (I[B)V
    //   496: putstatic burp/Zmyk.Za : Ljava/lang/Object;
    //   499: sipush #-200
    //   502: sipush #-1014
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zmyk.Zx : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFF3A) & 0xFFFF;
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
      char c = 'ö';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmyk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */