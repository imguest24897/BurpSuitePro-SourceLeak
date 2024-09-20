package burp;

import java.math.BigInteger;

class Zku9 extends ClassLoader {
  static Object Zp;
  
  static String Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zu(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zql.Zt : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Ztq2.Zj : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zexl.ZG : Ljava/lang/Object;
    //   22: sipush #17627
    //   25: sipush #-21046
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zxwl
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
    //   150: sipush #17626
    //   153: sipush #20902
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
    //   192: sipush #17625
    //   195: sipush #8704
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
    //   351: getstatic burp/Zrip.ZB : Ljava/lang/Object;
    //   354: checkcast java/math/BigInteger
    //   357: invokevirtual toByteArray : ()[B
    //   360: astore_3
    //   361: new java/lang/StringBuilder
    //   364: dup
    //   365: invokespecial <init> : ()V
    //   368: astore #5
    //   370: aload #5
    //   372: sipush #17630
    //   375: sipush #-1955
    //   378: invokestatic a : (II)Ljava/lang/String;
    //   381: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: pop
    //   385: aload_3
    //   386: astore #6
    //   388: aload #6
    //   390: arraylength
    //   391: istore #7
    //   393: iconst_0
    //   394: istore #8
    //   396: iload #8
    //   398: iload #7
    //   400: if_icmpge -> 426
    //   403: aload #6
    //   405: iload #8
    //   407: baload
    //   408: istore #9
    //   410: aload #5
    //   412: iload #9
    //   414: i2c
    //   415: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   418: pop
    //   419: iinc #8, 1
    //   422: iload_2
    //   423: ifne -> 396
    //   426: aload #5
    //   428: sipush #17619
    //   431: sipush #14200
    //   434: invokestatic a : (II)Ljava/lang/String;
    //   437: ldc ''
    //   439: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   442: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   445: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   448: pop
    //   449: aload #5
    //   451: sipush #17616
    //   454: sipush #-16437
    //   457: invokestatic a : (II)Ljava/lang/String;
    //   460: ldc ''
    //   462: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   465: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   468: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   471: pop
    //   472: aload #5
    //   474: invokevirtual toString : ()Ljava/lang/String;
    //   477: invokevirtual getBytes : ()[B
    //   480: astore #4
    //   482: aload #4
    //   484: astore_3
    //   485: aload_3
    //   486: arraylength
    //   487: bipush #8
    //   489: iadd
    //   490: bipush #6
    //   492: ishr
    //   493: iconst_1
    //   494: iadd
    //   495: bipush #16
    //   497: imul
    //   498: newarray int
    //   500: astore #5
    //   502: iconst_0
    //   503: istore #6
    //   505: iload #6
    //   507: aload_3
    //   508: arraylength
    //   509: if_icmpge -> 552
    //   512: aload_3
    //   513: iload #6
    //   515: baload
    //   516: sipush #255
    //   519: iand
    //   520: istore #7
    //   522: aload #5
    //   524: iload #6
    //   526: iconst_2
    //   527: ishr
    //   528: dup2
    //   529: iaload
    //   530: iload #7
    //   532: bipush #24
    //   534: iload #6
    //   536: iconst_4
    //   537: irem
    //   538: bipush #8
    //   540: imul
    //   541: isub
    //   542: ishl
    //   543: ior
    //   544: iastore
    //   545: iinc #6, 1
    //   548: iload_2
    //   549: ifne -> 505
    //   552: aload #5
    //   554: iload #6
    //   556: iconst_2
    //   557: ishr
    //   558: dup2
    //   559: iaload
    //   560: sipush #128
    //   563: bipush #24
    //   565: iload #6
    //   567: iconst_4
    //   568: irem
    //   569: bipush #8
    //   571: imul
    //   572: isub
    //   573: ishl
    //   574: ior
    //   575: iastore
    //   576: aload #5
    //   578: aload #5
    //   580: arraylength
    //   581: iconst_1
    //   582: isub
    //   583: aload_3
    //   584: arraylength
    //   585: bipush #8
    //   587: imul
    //   588: iastore
    //   589: bipush #80
    //   591: newarray int
    //   593: astore #7
    //   595: ldc 1732584193
    //   597: istore #8
    //   599: ldc -271733879
    //   601: istore #9
    //   603: ldc -1732584194
    //   605: istore #10
    //   607: ldc 271733878
    //   609: istore #11
    //   611: ldc -1009589776
    //   613: istore #12
    //   615: iconst_0
    //   616: istore #6
    //   618: iload #6
    //   620: aload #5
    //   622: arraylength
    //   623: if_icmpge -> 945
    //   626: iload #8
    //   628: istore #13
    //   630: iload #9
    //   632: istore #14
    //   634: iload #10
    //   636: istore #15
    //   638: iload #11
    //   640: istore #16
    //   642: iload #12
    //   644: istore #17
    //   646: iconst_0
    //   647: istore #18
    //   649: iload #18
    //   651: bipush #80
    //   653: if_icmpge -> 903
    //   656: iload #18
    //   658: bipush #16
    //   660: if_icmpge -> 687
    //   663: aload #7
    //   665: iload #18
    //   667: aload #5
    //   669: iload #6
    //   671: iload #18
    //   673: iadd
    //   674: iaload
    //   675: iastore
    //   676: iload_2
    //   677: ifne -> 742
    //   680: goto -> 687
    //   683: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   686: athrow
    //   687: aload #7
    //   689: iload #18
    //   691: iconst_3
    //   692: isub
    //   693: iaload
    //   694: aload #7
    //   696: iload #18
    //   698: bipush #8
    //   700: isub
    //   701: iaload
    //   702: ixor
    //   703: aload #7
    //   705: iload #18
    //   707: bipush #14
    //   709: isub
    //   710: iaload
    //   711: ixor
    //   712: aload #7
    //   714: iload #18
    //   716: bipush #16
    //   718: isub
    //   719: iaload
    //   720: ixor
    //   721: istore #19
    //   723: iload #19
    //   725: iconst_1
    //   726: ishl
    //   727: iload #19
    //   729: bipush #31
    //   731: iushr
    //   732: ior
    //   733: istore #20
    //   735: aload #7
    //   737: iload #18
    //   739: iload #20
    //   741: iastore
    //   742: iload #8
    //   744: iconst_5
    //   745: ishl
    //   746: iload #8
    //   748: bipush #27
    //   750: iushr
    //   751: ior
    //   752: istore #19
    //   754: iload #19
    //   756: iload #12
    //   758: iadd
    //   759: aload #7
    //   761: iload #18
    //   763: iaload
    //   764: iadd
    //   765: iload #18
    //   767: bipush #20
    //   769: if_icmpge -> 795
    //   772: ldc 1518500249
    //   774: iload #9
    //   776: iload #10
    //   778: iand
    //   779: iload #9
    //   781: iconst_m1
    //   782: ixor
    //   783: iload #11
    //   785: iand
    //   786: ior
    //   787: iadd
    //   788: goto -> 865
    //   791: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   794: athrow
    //   795: iload #18
    //   797: bipush #40
    //   799: if_icmpge -> 820
    //   802: ldc 1859775393
    //   804: iload #9
    //   806: iload #10
    //   808: ixor
    //   809: iload #11
    //   811: ixor
    //   812: iadd
    //   813: goto -> 865
    //   816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   819: athrow
    //   820: iload #18
    //   822: bipush #60
    //   824: if_icmpge -> 854
    //   827: ldc -1894007588
    //   829: iload #9
    //   831: iload #10
    //   833: iand
    //   834: iload #9
    //   836: iload #11
    //   838: iand
    //   839: ior
    //   840: iload #10
    //   842: iload #11
    //   844: iand
    //   845: ior
    //   846: iadd
    //   847: goto -> 865
    //   850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   853: athrow
    //   854: ldc -899497514
    //   856: iload #9
    //   858: iload #10
    //   860: ixor
    //   861: iload #11
    //   863: ixor
    //   864: iadd
    //   865: iadd
    //   866: istore #20
    //   868: iload #11
    //   870: istore #12
    //   872: iload #10
    //   874: istore #11
    //   876: iload #9
    //   878: bipush #30
    //   880: ishl
    //   881: iload #9
    //   883: iconst_2
    //   884: iushr
    //   885: ior
    //   886: istore #10
    //   888: iload #8
    //   890: istore #9
    //   892: iload #20
    //   894: istore #8
    //   896: iinc #18, 1
    //   899: iload_2
    //   900: ifne -> 649
    //   903: iload #8
    //   905: iload #13
    //   907: iadd
    //   908: istore #8
    //   910: iload #9
    //   912: iload #14
    //   914: iadd
    //   915: istore #9
    //   917: iload #10
    //   919: iload #15
    //   921: iadd
    //   922: istore #10
    //   924: iload #11
    //   926: iload #16
    //   928: iadd
    //   929: istore #11
    //   931: iload #12
    //   933: iload #17
    //   935: iadd
    //   936: istore #12
    //   938: iinc #6, 16
    //   941: iload_2
    //   942: ifne -> 618
    //   945: iconst_5
    //   946: newarray int
    //   948: dup
    //   949: iconst_0
    //   950: iload #8
    //   952: iastore
    //   953: dup
    //   954: iconst_1
    //   955: iload #9
    //   957: iastore
    //   958: dup
    //   959: iconst_2
    //   960: iload #10
    //   962: iastore
    //   963: dup
    //   964: iconst_3
    //   965: iload #11
    //   967: iastore
    //   968: dup
    //   969: iconst_4
    //   970: iload #12
    //   972: iastore
    //   973: astore #13
    //   975: bipush #20
    //   977: newarray byte
    //   979: astore #14
    //   981: iconst_0
    //   982: istore #15
    //   984: iload #15
    //   986: bipush #20
    //   988: if_icmpge -> 1029
    //   991: aload #13
    //   993: iload #15
    //   995: iconst_4
    //   996: idiv
    //   997: iaload
    //   998: istore #16
    //   1000: iconst_3
    //   1001: iload #15
    //   1003: iconst_4
    //   1004: irem
    //   1005: isub
    //   1006: bipush #8
    //   1008: imul
    //   1009: istore #17
    //   1011: aload #14
    //   1013: iload #15
    //   1015: iload #16
    //   1017: iload #17
    //   1019: iushr
    //   1020: i2b
    //   1021: bastore
    //   1022: iinc #15, 1
    //   1025: iload_2
    //   1026: ifne -> 984
    //   1029: aload #14
    //   1031: astore #4
    //   1033: getstatic burp/Zeqz.ZV : Ljava/lang/String;
    //   1036: getstatic burp/Zxan.ZX : Ljava/lang/Object;
    //   1039: checkcast java/math/BigInteger
    //   1042: invokevirtual intValue : ()I
    //   1045: bipush #32
    //   1047: irem
    //   1048: invokestatic abs : (I)I
    //   1051: invokevirtual charAt : (I)C
    //   1054: getstatic burp/Zld9.Zx : Ljava/lang/String;
    //   1057: getstatic burp/Zz4a.ZB : Ljava/lang/Object;
    //   1060: checkcast java/math/BigInteger
    //   1063: invokevirtual intValue : ()I
    //   1066: bipush #32
    //   1068: irem
    //   1069: invokestatic abs : (I)I
    //   1072: invokevirtual charAt : (I)C
    //   1075: if_icmple -> 1182
    //   1078: getstatic burp/Ze4a.Zm : Ljava/lang/String;
    //   1081: getstatic burp/Zzi_.Zf : Ljava/lang/Object;
    //   1084: checkcast java/math/BigInteger
    //   1087: invokevirtual intValue : ()I
    //   1090: bipush #32
    //   1092: irem
    //   1093: invokestatic abs : (I)I
    //   1096: invokevirtual charAt : (I)C
    //   1099: getstatic burp/Zr60.ZQ : Ljava/lang/String;
    //   1102: getstatic burp/Zxxo.ZJ : Ljava/lang/Object;
    //   1105: checkcast java/math/BigInteger
    //   1108: invokevirtual intValue : ()I
    //   1111: bipush #32
    //   1113: irem
    //   1114: invokestatic abs : (I)I
    //   1117: invokevirtual charAt : (I)C
    //   1120: if_icmpgt -> 1182
    //   1123: goto -> 1130
    //   1126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1129: athrow
    //   1130: getstatic burp/Zrqe.ZB : Ljava/lang/String;
    //   1133: getstatic burp/Zxwf.Zi : Ljava/lang/Object;
    //   1136: checkcast java/math/BigInteger
    //   1139: invokevirtual intValue : ()I
    //   1142: bipush #32
    //   1144: irem
    //   1145: invokestatic abs : (I)I
    //   1148: invokevirtual charAt : (I)C
    //   1151: getstatic burp/Zlgh.Zm : Ljava/lang/String;
    //   1154: getstatic burp/Ztq2.Zj : Ljava/lang/Object;
    //   1157: checkcast java/math/BigInteger
    //   1160: invokevirtual intValue : ()I
    //   1163: bipush #32
    //   1165: irem
    //   1166: invokestatic abs : (I)I
    //   1169: invokevirtual charAt : (I)C
    //   1172: if_icmpgt -> 1190
    //   1175: goto -> 1182
    //   1178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1181: athrow
    //   1182: iconst_1
    //   1183: goto -> 1191
    //   1186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1189: athrow
    //   1190: iconst_0
    //   1191: ireturn
    //   1192: astore_3
    //   1193: new java/lang/Exception
    //   1196: dup
    //   1197: aload_3
    //   1198: invokevirtual getMessage : ()Ljava/lang/String;
    //   1201: invokespecial <init> : (Ljava/lang/String;)V
    //   1204: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1191	1192	java/lang/Throwable
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
    //   656	680	683	java/lang/Throwable
    //   754	791	791	java/lang/Throwable
    //   795	816	816	java/lang/Throwable
    //   820	850	850	java/lang/Throwable
    //   1033	1123	1126	java/lang/Throwable
    //   1078	1175	1178	java/lang/Throwable
    //   1130	1186	1186	java/lang/Throwable
  }
  
  static void ZL(Object paramObject) {
    Zz0y.ZM = a(17628, 21986);
    Zz0y.Zp = new BigInteger(a(17629, 5014));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zlc2.Zz.charAt(Math.abs(((BigInteger)Zlt1.ZH).intValue() % 32)) > Zz5e.Zd.charAt(Math.abs(((BigInteger)Zlf7.ZE).intValue() % 32))) {
          try {
            Zxxf.ZJ(Class.forName(a(17631, -30276)));
            if (!bool)
              Zgeq.Zl(Class.forName(a(17624, 17076))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgeq.Zl(Class.forName(a(17624, 17076)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¦ñÒ\\t¨ÏÀZ@¤\\t±=0>ÕÆÍ{\\tpP\\b39`,k íWå\t}cë`Çhè¢ØGì*)ÈªC\\fk4\\tËU@F¢ Þ#naßâÕß±®%i1õBkv,×7M²ª"kXMlù¶h]¢©ÈºFd8¡Æ Ú\\fÏ,Üµ¦t¸¬ÝJ%c¥«áUh¾\\tqõVB¸Æ®Y1F§DÁÃÅì(w8ZaN³ 5oÒ×ã¶ UZön2Þ½7{Ö¹­É¨"ÏÑ\\f³'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #107
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc '·ßÑÏ\\t·¸Ô,3ìp'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #7
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #109
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
    //   128: putstatic burp/Zku9.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zku9.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #120
    //   214: goto -> 243
    //   217: bipush #109
    //   219: goto -> 243
    //   222: bipush #83
    //   224: goto -> 243
    //   227: bipush #57
    //   229: goto -> 243
    //   232: bipush #70
    //   234: goto -> 243
    //   237: iconst_3
    //   238: goto -> 243
    //   241: bipush #92
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #99
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-53
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: iconst_0
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-31
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-28
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-112
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #103
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #91
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-52
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-4
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #10
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-35
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-127
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-122
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-124
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-85
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-120
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-105
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #42
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-44
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-73
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #106
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #18
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-106
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #55
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-4
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-48
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #89
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-16
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-33
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #58
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-90
    //   493: bastore
    //   494: invokespecial <init> : (I[B)V
    //   497: putstatic burp/Zku9.Zp : Ljava/lang/Object;
    //   500: sipush #17618
    //   503: sipush #18676
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zku9.Zl : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x44DA) & 0xFFFF;
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
      byte b1 = 96;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zku9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */