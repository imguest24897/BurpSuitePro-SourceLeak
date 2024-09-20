package burp;

import java.math.BigInteger;

class Zeqg extends ClassLoader {
  static String Zh;
  
  static Object Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zo(Object paramObject) {
    Zs8q.Zs = a(-7115, 21115);
    Zs8q.ZI = new BigInteger(a(-7113, -20183));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zest.Zd.charAt(Math.abs(((BigInteger)Zmr7.ZO).intValue() % 32)) <= Zt5j.ZR.charAt(Math.abs(((BigInteger)Zkm0.ZI).intValue() % 32))) {
          try {
            Zzym.ZI(Class.forName(a(-7114, -21088)));
            if (!bool)
              Zkbm.Zg(Class.forName(a(-7119, 634))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkbm.Zg(Class.forName(a(-7119, 634)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zf(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zm4i.Zr : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zeqg.Zm : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zs34.ZE : Ljava/lang/Object;
    //   22: getstatic burp/Ze5t.Zc : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_3
    //   32: aload_3
    //   33: arraylength
    //   34: bipush #8
    //   36: iadd
    //   37: bipush #6
    //   39: ishr
    //   40: iconst_1
    //   41: iadd
    //   42: bipush #16
    //   44: imul
    //   45: newarray int
    //   47: astore #5
    //   49: iconst_0
    //   50: istore #6
    //   52: iload #6
    //   54: aload_3
    //   55: arraylength
    //   56: if_icmpge -> 99
    //   59: aload_3
    //   60: iload #6
    //   62: baload
    //   63: sipush #255
    //   66: iand
    //   67: istore #7
    //   69: aload #5
    //   71: iload #6
    //   73: iconst_2
    //   74: ishr
    //   75: dup2
    //   76: iaload
    //   77: iload #7
    //   79: bipush #24
    //   81: iload #6
    //   83: iconst_4
    //   84: irem
    //   85: bipush #8
    //   87: imul
    //   88: isub
    //   89: ishl
    //   90: ior
    //   91: iastore
    //   92: iinc #6, 1
    //   95: iload_2
    //   96: ifne -> 52
    //   99: aload #5
    //   101: iload #6
    //   103: iconst_2
    //   104: ishr
    //   105: dup2
    //   106: iaload
    //   107: sipush #128
    //   110: bipush #24
    //   112: iload #6
    //   114: iconst_4
    //   115: irem
    //   116: bipush #8
    //   118: imul
    //   119: isub
    //   120: ishl
    //   121: ior
    //   122: iastore
    //   123: aload #5
    //   125: aload #5
    //   127: arraylength
    //   128: iconst_1
    //   129: isub
    //   130: aload_3
    //   131: arraylength
    //   132: bipush #8
    //   134: imul
    //   135: iastore
    //   136: bipush #80
    //   138: newarray int
    //   140: astore #7
    //   142: ldc 1732584193
    //   144: istore #8
    //   146: ldc -271733879
    //   148: istore #9
    //   150: ldc -1732584194
    //   152: istore #10
    //   154: ldc 271733878
    //   156: istore #11
    //   158: ldc -1009589776
    //   160: istore #12
    //   162: iconst_0
    //   163: istore #6
    //   165: iload #6
    //   167: aload #5
    //   169: arraylength
    //   170: if_icmpge -> 492
    //   173: iload #8
    //   175: istore #13
    //   177: iload #9
    //   179: istore #14
    //   181: iload #10
    //   183: istore #15
    //   185: iload #11
    //   187: istore #16
    //   189: iload #12
    //   191: istore #17
    //   193: iconst_0
    //   194: istore #18
    //   196: iload #18
    //   198: bipush #80
    //   200: if_icmpge -> 450
    //   203: iload #18
    //   205: bipush #16
    //   207: if_icmpge -> 234
    //   210: aload #7
    //   212: iload #18
    //   214: aload #5
    //   216: iload #6
    //   218: iload #18
    //   220: iadd
    //   221: iaload
    //   222: iastore
    //   223: iload_2
    //   224: ifne -> 289
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   233: athrow
    //   234: aload #7
    //   236: iload #18
    //   238: iconst_3
    //   239: isub
    //   240: iaload
    //   241: aload #7
    //   243: iload #18
    //   245: bipush #8
    //   247: isub
    //   248: iaload
    //   249: ixor
    //   250: aload #7
    //   252: iload #18
    //   254: bipush #14
    //   256: isub
    //   257: iaload
    //   258: ixor
    //   259: aload #7
    //   261: iload #18
    //   263: bipush #16
    //   265: isub
    //   266: iaload
    //   267: ixor
    //   268: istore #19
    //   270: iload #19
    //   272: iconst_1
    //   273: ishl
    //   274: iload #19
    //   276: bipush #31
    //   278: iushr
    //   279: ior
    //   280: istore #20
    //   282: aload #7
    //   284: iload #18
    //   286: iload #20
    //   288: iastore
    //   289: iload #8
    //   291: iconst_5
    //   292: ishl
    //   293: iload #8
    //   295: bipush #27
    //   297: iushr
    //   298: ior
    //   299: istore #19
    //   301: iload #19
    //   303: iload #12
    //   305: iadd
    //   306: aload #7
    //   308: iload #18
    //   310: iaload
    //   311: iadd
    //   312: iload #18
    //   314: bipush #20
    //   316: if_icmpge -> 342
    //   319: ldc 1518500249
    //   321: iload #9
    //   323: iload #10
    //   325: iand
    //   326: iload #9
    //   328: iconst_m1
    //   329: ixor
    //   330: iload #11
    //   332: iand
    //   333: ior
    //   334: iadd
    //   335: goto -> 412
    //   338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   341: athrow
    //   342: iload #18
    //   344: bipush #40
    //   346: if_icmpge -> 367
    //   349: ldc 1859775393
    //   351: iload #9
    //   353: iload #10
    //   355: ixor
    //   356: iload #11
    //   358: ixor
    //   359: iadd
    //   360: goto -> 412
    //   363: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   366: athrow
    //   367: iload #18
    //   369: bipush #60
    //   371: if_icmpge -> 401
    //   374: ldc -1894007588
    //   376: iload #9
    //   378: iload #10
    //   380: iand
    //   381: iload #9
    //   383: iload #11
    //   385: iand
    //   386: ior
    //   387: iload #10
    //   389: iload #11
    //   391: iand
    //   392: ior
    //   393: iadd
    //   394: goto -> 412
    //   397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   400: athrow
    //   401: ldc -899497514
    //   403: iload #9
    //   405: iload #10
    //   407: ixor
    //   408: iload #11
    //   410: ixor
    //   411: iadd
    //   412: iadd
    //   413: istore #20
    //   415: iload #11
    //   417: istore #12
    //   419: iload #10
    //   421: istore #11
    //   423: iload #9
    //   425: bipush #30
    //   427: ishl
    //   428: iload #9
    //   430: iconst_2
    //   431: iushr
    //   432: ior
    //   433: istore #10
    //   435: iload #8
    //   437: istore #9
    //   439: iload #20
    //   441: istore #8
    //   443: iinc #18, 1
    //   446: iload_2
    //   447: ifne -> 196
    //   450: iload #8
    //   452: iload #13
    //   454: iadd
    //   455: istore #8
    //   457: iload #9
    //   459: iload #14
    //   461: iadd
    //   462: istore #9
    //   464: iload #10
    //   466: iload #15
    //   468: iadd
    //   469: istore #10
    //   471: iload #11
    //   473: iload #16
    //   475: iadd
    //   476: istore #11
    //   478: iload #12
    //   480: iload #17
    //   482: iadd
    //   483: istore #12
    //   485: iinc #6, 16
    //   488: iload_2
    //   489: ifne -> 165
    //   492: iconst_5
    //   493: newarray int
    //   495: dup
    //   496: iconst_0
    //   497: iload #8
    //   499: iastore
    //   500: dup
    //   501: iconst_1
    //   502: iload #9
    //   504: iastore
    //   505: dup
    //   506: iconst_2
    //   507: iload #10
    //   509: iastore
    //   510: dup
    //   511: iconst_3
    //   512: iload #11
    //   514: iastore
    //   515: dup
    //   516: iconst_4
    //   517: iload #12
    //   519: iastore
    //   520: astore #13
    //   522: bipush #20
    //   524: newarray byte
    //   526: astore #14
    //   528: iconst_0
    //   529: istore #15
    //   531: iload #15
    //   533: bipush #20
    //   535: if_icmpge -> 576
    //   538: aload #13
    //   540: iload #15
    //   542: iconst_4
    //   543: idiv
    //   544: iaload
    //   545: istore #16
    //   547: iconst_3
    //   548: iload #15
    //   550: iconst_4
    //   551: irem
    //   552: isub
    //   553: bipush #8
    //   555: imul
    //   556: istore #17
    //   558: aload #14
    //   560: iload #15
    //   562: iload #16
    //   564: iload #17
    //   566: iushr
    //   567: i2b
    //   568: bastore
    //   569: iinc #15, 1
    //   572: iload_2
    //   573: ifne -> 531
    //   576: aload #14
    //   578: astore #4
    //   580: sipush #-7118
    //   583: new java/math/BigInteger
    //   586: dup
    //   587: aload #4
    //   589: invokespecial <init> : ([B)V
    //   592: invokevirtual abs : ()Ljava/math/BigInteger;
    //   595: putstatic burp/Zevr.ZG : Ljava/lang/Object;
    //   598: sipush #28889
    //   601: getstatic burp/Zke7.Zj : Ljava/lang/Object;
    //   604: checkcast java/math/BigInteger
    //   607: getstatic burp/Zest.Zq : Ljava/lang/Object;
    //   610: checkcast java/math/BigInteger
    //   613: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   616: putstatic burp/Zef0.ZX : Ljava/lang/Object;
    //   619: invokestatic a : (II)Ljava/lang/String;
    //   622: iconst_1
    //   623: ldc burp/Zei_
    //   625: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   628: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   631: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   634: astore_3
    //   635: aload_3
    //   636: arraylength
    //   637: istore #4
    //   639: iconst_0
    //   640: istore #5
    //   642: iload #5
    //   644: iload #4
    //   646: if_icmpge -> 783
    //   649: aload_3
    //   650: iload #5
    //   652: aaload
    //   653: astore #6
    //   655: aload #6
    //   657: invokevirtual getModifiers : ()I
    //   660: invokestatic isStatic : (I)Z
    //   663: ifne -> 673
    //   666: goto -> 776
    //   669: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   672: athrow
    //   673: aload #6
    //   675: invokevirtual getType : ()Ljava/lang/Class;
    //   678: astore #7
    //   680: aload #7
    //   682: ifnull -> 763
    //   685: aload #7
    //   687: invokevirtual isPrimitive : ()Z
    //   690: ifne -> 763
    //   693: goto -> 700
    //   696: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   699: athrow
    //   700: aload #7
    //   702: invokevirtual getPackage : ()Ljava/lang/Package;
    //   705: ifnull -> 763
    //   708: goto -> 715
    //   711: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   714: athrow
    //   715: aload #7
    //   717: invokevirtual getPackage : ()Ljava/lang/Package;
    //   720: invokevirtual getName : ()Ljava/lang/String;
    //   723: ifnull -> 763
    //   726: goto -> 733
    //   729: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   732: athrow
    //   733: aload #7
    //   735: invokevirtual getPackage : ()Ljava/lang/Package;
    //   738: invokevirtual getName : ()Ljava/lang/String;
    //   741: sipush #-7117
    //   744: sipush #-28991
    //   747: invokestatic a : (II)Ljava/lang/String;
    //   750: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   753: ifne -> 763
    //   756: goto -> 763
    //   759: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   762: athrow
    //   763: aload #6
    //   765: iconst_1
    //   766: invokevirtual setAccessible : (Z)V
    //   769: aload #6
    //   771: aconst_null
    //   772: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   775: pop
    //   776: iinc #5, 1
    //   779: iload_2
    //   780: ifne -> 642
    //   783: sipush #-7116
    //   786: sipush #13444
    //   789: invokestatic a : (II)Ljava/lang/String;
    //   792: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   795: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   798: astore_3
    //   799: aload_3
    //   800: arraylength
    //   801: istore #4
    //   803: iconst_0
    //   804: istore #5
    //   806: iload #5
    //   808: iload #4
    //   810: if_icmpge -> 942
    //   813: aload_3
    //   814: iload #5
    //   816: aaload
    //   817: astore #6
    //   819: aload #6
    //   821: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   824: pop
    //   825: aload #6
    //   827: invokevirtual getModifiers : ()I
    //   830: invokestatic isStatic : (I)Z
    //   833: ifeq -> 928
    //   836: aload #6
    //   838: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   841: arraylength
    //   842: iconst_2
    //   843: if_icmpne -> 928
    //   846: goto -> 853
    //   849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   852: athrow
    //   853: aload #6
    //   855: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   858: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   861: invokevirtual equals : (Ljava/lang/Object;)Z
    //   864: ifeq -> 928
    //   867: goto -> 874
    //   870: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   873: athrow
    //   874: aload #6
    //   876: iconst_1
    //   877: invokevirtual setAccessible : (Z)V
    //   880: aload #6
    //   882: aconst_null
    //   883: iconst_2
    //   884: anewarray java/lang/Object
    //   887: dup
    //   888: iconst_0
    //   889: aload_0
    //   890: aastore
    //   891: dup
    //   892: iconst_1
    //   893: aload_1
    //   894: ifnonnull -> 912
    //   897: goto -> 904
    //   900: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   903: athrow
    //   904: aload_1
    //   905: goto -> 919
    //   908: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   911: athrow
    //   912: aload_1
    //   913: checkcast [B
    //   916: invokevirtual clone : ()Ljava/lang/Object;
    //   919: aastore
    //   920: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   923: pop
    //   924: iload_2
    //   925: ifne -> 942
    //   928: iinc #5, 1
    //   931: iload_2
    //   932: ifne -> 806
    //   935: goto -> 942
    //   938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   941: athrow
    //   942: getstatic burp/Zl50.Zm : Ljava/lang/String;
    //   945: getstatic burp/Zl8f.ZA : Ljava/lang/Object;
    //   948: checkcast java/math/BigInteger
    //   951: invokevirtual intValue : ()I
    //   954: bipush #32
    //   956: irem
    //   957: invokestatic abs : (I)I
    //   960: invokevirtual charAt : (I)C
    //   963: getstatic burp/Zsf7.ZS : Ljava/lang/String;
    //   966: getstatic burp/Zeb7.ZJ : Ljava/lang/Object;
    //   969: checkcast java/math/BigInteger
    //   972: invokevirtual intValue : ()I
    //   975: bipush #32
    //   977: irem
    //   978: invokestatic abs : (I)I
    //   981: invokevirtual charAt : (I)C
    //   984: if_icmple -> 1099
    //   987: getstatic burp/Zgva.ZV : Ljava/lang/String;
    //   990: getstatic burp/Zgqi.Zp : Ljava/lang/Object;
    //   993: checkcast java/math/BigInteger
    //   996: invokevirtual intValue : ()I
    //   999: bipush #32
    //   1001: irem
    //   1002: invokestatic abs : (I)I
    //   1005: invokevirtual charAt : (I)C
    //   1008: getstatic burp/Zkb_.ZR : Ljava/lang/String;
    //   1011: getstatic burp/Zera.Zy : Ljava/lang/Object;
    //   1014: checkcast java/math/BigInteger
    //   1017: invokevirtual intValue : ()I
    //   1020: bipush #32
    //   1022: irem
    //   1023: invokestatic abs : (I)I
    //   1026: invokevirtual charAt : (I)C
    //   1029: if_icmple -> 1099
    //   1032: goto -> 1039
    //   1035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1038: athrow
    //   1039: getstatic burp/Zz2e.ZS : Ljava/lang/String;
    //   1042: getstatic burp/Ztsu.Zr : Ljava/lang/Object;
    //   1045: checkcast java/math/BigInteger
    //   1048: invokevirtual intValue : ()I
    //   1051: bipush #32
    //   1053: irem
    //   1054: invokestatic abs : (I)I
    //   1057: invokevirtual charAt : (I)C
    //   1060: getstatic burp/Ze5f.Zt : Ljava/lang/String;
    //   1063: getstatic burp/Ze6d.Zw : Ljava/lang/Object;
    //   1066: checkcast java/math/BigInteger
    //   1069: invokevirtual intValue : ()I
    //   1072: bipush #32
    //   1074: irem
    //   1075: invokestatic abs : (I)I
    //   1078: invokevirtual charAt : (I)C
    //   1081: if_icmple -> 1099
    //   1084: goto -> 1091
    //   1087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1090: athrow
    //   1091: iconst_1
    //   1092: goto -> 1100
    //   1095: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1098: athrow
    //   1099: iconst_0
    //   1100: ireturn
    //   1101: astore_3
    //   1102: new java/lang/Exception
    //   1105: dup
    //   1106: aload_3
    //   1107: invokevirtual getMessage : ()Ljava/lang/String;
    //   1110: invokespecial <init> : (Ljava/lang/String;)V
    //   1113: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1100	1101	java/lang/Throwable
    //   203	227	230	java/lang/Throwable
    //   301	338	338	java/lang/Throwable
    //   342	363	363	java/lang/Throwable
    //   367	397	397	java/lang/Throwable
    //   655	669	669	java/lang/Throwable
    //   680	693	696	java/lang/Throwable
    //   685	708	711	java/lang/Throwable
    //   700	726	729	java/lang/Throwable
    //   715	756	759	java/lang/Throwable
    //   819	846	849	java/lang/Throwable
    //   836	867	870	java/lang/Throwable
    //   853	897	900	java/lang/Throwable
    //   874	908	908	java/lang/Throwable
    //   919	935	938	java/lang/Throwable
    //   942	1032	1035	java/lang/Throwable
    //   987	1084	1087	java/lang/Throwable
    //   1039	1095	1095	java/lang/Throwable
  }
  
  static void ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '*»öt ¥ ·%Íú\\rûæ£GyCïF\;ªàáâØxÝM\\bð·õE\\t7Ì\\r*ÍïÚmä JN¬¡ÜÁNÅ»ñt|bnè´zæa»1\\tÍR&ê§ÍK'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #51
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
    //   68: ldc 'uR\Ûrå<J¨ ë\\tè4ª,ÜTàÓª¨8[ó2¥¢YúTÁ¶Íy6vy0ÕòËYÏRÎVb÷=})[¾² ¹IÂ,\\n\\tàýÉÙRíé'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #75
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #113
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
    //   129: putstatic burp/Zeqg.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zeqg.b : [Ljava/lang/String;
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
    //   212: bipush #76
    //   214: goto -> 244
    //   217: bipush #75
    //   219: goto -> 244
    //   222: bipush #107
    //   224: goto -> 244
    //   227: bipush #36
    //   229: goto -> 244
    //   232: bipush #70
    //   234: goto -> 244
    //   237: bipush #95
    //   239: goto -> 244
    //   242: bipush #120
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
    //   300: sipush #-7120
    //   303: sipush #-7535
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zeqg.Zh : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #84
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #95
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-61
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #106
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-2
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #63
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-104
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #-116
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #74
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-95
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #43
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #105
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: iconst_m1
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #41
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-21
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-7
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-100
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-15
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #44
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-102
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #100
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-94
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-24
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-3
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-25
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #42
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-49
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #-91
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #59
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #103
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #48
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #118
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zeqg.Zm : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE431) & 0xFFFF;
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
      byte b1 = 2;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeqg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */