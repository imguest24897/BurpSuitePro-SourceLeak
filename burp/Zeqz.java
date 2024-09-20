package burp;

import java.math.BigInteger;

class Zeqz extends ClassLoader {
  static String ZV;
  
  static Object ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zc(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZI(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zebc.Zr : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zzht.Zb : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zgis.ZV : Ljava/lang/Object;
    //   22: getstatic burp/Zmyk.Za : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_3
    //   32: new java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial <init> : ()V
    //   39: astore #5
    //   41: aload #5
    //   43: sipush #-12559
    //   46: sipush #-29337
    //   49: invokestatic a : (II)Ljava/lang/String;
    //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload_3
    //   57: astore #6
    //   59: aload #6
    //   61: arraylength
    //   62: istore #7
    //   64: iconst_0
    //   65: istore #8
    //   67: iload #8
    //   69: iload #7
    //   71: if_icmpge -> 97
    //   74: aload #6
    //   76: iload #8
    //   78: baload
    //   79: istore #9
    //   81: aload #5
    //   83: iload #9
    //   85: i2c
    //   86: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: iinc #8, 1
    //   93: iload_2
    //   94: ifne -> 67
    //   97: aload #5
    //   99: sipush #-12545
    //   102: sipush #-22018
    //   105: invokestatic a : (II)Ljava/lang/String;
    //   108: ldc ''
    //   110: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   113: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload #5
    //   122: sipush #-12555
    //   125: sipush #31782
    //   128: invokestatic a : (II)Ljava/lang/String;
    //   131: ldc ''
    //   133: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   136: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload #5
    //   145: invokevirtual toString : ()Ljava/lang/String;
    //   148: invokevirtual getBytes : ()[B
    //   151: astore #4
    //   153: aload #4
    //   155: astore_3
    //   156: aload_3
    //   157: arraylength
    //   158: bipush #8
    //   160: iadd
    //   161: bipush #6
    //   163: ishr
    //   164: iconst_1
    //   165: iadd
    //   166: bipush #16
    //   168: imul
    //   169: newarray int
    //   171: astore #5
    //   173: iconst_0
    //   174: istore #6
    //   176: iload #6
    //   178: aload_3
    //   179: arraylength
    //   180: if_icmpge -> 223
    //   183: aload_3
    //   184: iload #6
    //   186: baload
    //   187: sipush #255
    //   190: iand
    //   191: istore #7
    //   193: aload #5
    //   195: iload #6
    //   197: iconst_2
    //   198: ishr
    //   199: dup2
    //   200: iaload
    //   201: iload #7
    //   203: bipush #24
    //   205: iload #6
    //   207: iconst_4
    //   208: irem
    //   209: bipush #8
    //   211: imul
    //   212: isub
    //   213: ishl
    //   214: ior
    //   215: iastore
    //   216: iinc #6, 1
    //   219: iload_2
    //   220: ifne -> 176
    //   223: aload #5
    //   225: iload #6
    //   227: iconst_2
    //   228: ishr
    //   229: dup2
    //   230: iaload
    //   231: sipush #128
    //   234: bipush #24
    //   236: iload #6
    //   238: iconst_4
    //   239: irem
    //   240: bipush #8
    //   242: imul
    //   243: isub
    //   244: ishl
    //   245: ior
    //   246: iastore
    //   247: aload #5
    //   249: aload #5
    //   251: arraylength
    //   252: iconst_1
    //   253: isub
    //   254: aload_3
    //   255: arraylength
    //   256: bipush #8
    //   258: imul
    //   259: iastore
    //   260: bipush #80
    //   262: newarray int
    //   264: astore #7
    //   266: ldc 1732584193
    //   268: istore #8
    //   270: ldc -271733879
    //   272: istore #9
    //   274: ldc -1732584194
    //   276: istore #10
    //   278: ldc 271733878
    //   280: istore #11
    //   282: ldc -1009589776
    //   284: istore #12
    //   286: iconst_0
    //   287: istore #6
    //   289: iload #6
    //   291: aload #5
    //   293: arraylength
    //   294: if_icmpge -> 616
    //   297: iload #8
    //   299: istore #13
    //   301: iload #9
    //   303: istore #14
    //   305: iload #10
    //   307: istore #15
    //   309: iload #11
    //   311: istore #16
    //   313: iload #12
    //   315: istore #17
    //   317: iconst_0
    //   318: istore #18
    //   320: iload #18
    //   322: bipush #80
    //   324: if_icmpge -> 574
    //   327: iload #18
    //   329: bipush #16
    //   331: if_icmpge -> 358
    //   334: aload #7
    //   336: iload #18
    //   338: aload #5
    //   340: iload #6
    //   342: iload #18
    //   344: iadd
    //   345: iaload
    //   346: iastore
    //   347: iload_2
    //   348: ifne -> 413
    //   351: goto -> 358
    //   354: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   357: athrow
    //   358: aload #7
    //   360: iload #18
    //   362: iconst_3
    //   363: isub
    //   364: iaload
    //   365: aload #7
    //   367: iload #18
    //   369: bipush #8
    //   371: isub
    //   372: iaload
    //   373: ixor
    //   374: aload #7
    //   376: iload #18
    //   378: bipush #14
    //   380: isub
    //   381: iaload
    //   382: ixor
    //   383: aload #7
    //   385: iload #18
    //   387: bipush #16
    //   389: isub
    //   390: iaload
    //   391: ixor
    //   392: istore #19
    //   394: iload #19
    //   396: iconst_1
    //   397: ishl
    //   398: iload #19
    //   400: bipush #31
    //   402: iushr
    //   403: ior
    //   404: istore #20
    //   406: aload #7
    //   408: iload #18
    //   410: iload #20
    //   412: iastore
    //   413: iload #8
    //   415: iconst_5
    //   416: ishl
    //   417: iload #8
    //   419: bipush #27
    //   421: iushr
    //   422: ior
    //   423: istore #19
    //   425: iload #19
    //   427: iload #12
    //   429: iadd
    //   430: aload #7
    //   432: iload #18
    //   434: iaload
    //   435: iadd
    //   436: iload #18
    //   438: bipush #20
    //   440: if_icmpge -> 466
    //   443: ldc 1518500249
    //   445: iload #9
    //   447: iload #10
    //   449: iand
    //   450: iload #9
    //   452: iconst_m1
    //   453: ixor
    //   454: iload #11
    //   456: iand
    //   457: ior
    //   458: iadd
    //   459: goto -> 536
    //   462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   465: athrow
    //   466: iload #18
    //   468: bipush #40
    //   470: if_icmpge -> 491
    //   473: ldc 1859775393
    //   475: iload #9
    //   477: iload #10
    //   479: ixor
    //   480: iload #11
    //   482: ixor
    //   483: iadd
    //   484: goto -> 536
    //   487: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   490: athrow
    //   491: iload #18
    //   493: bipush #60
    //   495: if_icmpge -> 525
    //   498: ldc -1894007588
    //   500: iload #9
    //   502: iload #10
    //   504: iand
    //   505: iload #9
    //   507: iload #11
    //   509: iand
    //   510: ior
    //   511: iload #10
    //   513: iload #11
    //   515: iand
    //   516: ior
    //   517: iadd
    //   518: goto -> 536
    //   521: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   524: athrow
    //   525: ldc -899497514
    //   527: iload #9
    //   529: iload #10
    //   531: ixor
    //   532: iload #11
    //   534: ixor
    //   535: iadd
    //   536: iadd
    //   537: istore #20
    //   539: iload #11
    //   541: istore #12
    //   543: iload #10
    //   545: istore #11
    //   547: iload #9
    //   549: bipush #30
    //   551: ishl
    //   552: iload #9
    //   554: iconst_2
    //   555: iushr
    //   556: ior
    //   557: istore #10
    //   559: iload #8
    //   561: istore #9
    //   563: iload #20
    //   565: istore #8
    //   567: iinc #18, 1
    //   570: iload_2
    //   571: ifne -> 320
    //   574: iload #8
    //   576: iload #13
    //   578: iadd
    //   579: istore #8
    //   581: iload #9
    //   583: iload #14
    //   585: iadd
    //   586: istore #9
    //   588: iload #10
    //   590: iload #15
    //   592: iadd
    //   593: istore #10
    //   595: iload #11
    //   597: iload #16
    //   599: iadd
    //   600: istore #11
    //   602: iload #12
    //   604: iload #17
    //   606: iadd
    //   607: istore #12
    //   609: iinc #6, 16
    //   612: iload_2
    //   613: ifne -> 289
    //   616: iconst_5
    //   617: newarray int
    //   619: dup
    //   620: iconst_0
    //   621: iload #8
    //   623: iastore
    //   624: dup
    //   625: iconst_1
    //   626: iload #9
    //   628: iastore
    //   629: dup
    //   630: iconst_2
    //   631: iload #10
    //   633: iastore
    //   634: dup
    //   635: iconst_3
    //   636: iload #11
    //   638: iastore
    //   639: dup
    //   640: iconst_4
    //   641: iload #12
    //   643: iastore
    //   644: astore #13
    //   646: bipush #20
    //   648: newarray byte
    //   650: astore #14
    //   652: iconst_0
    //   653: istore #15
    //   655: iload #15
    //   657: bipush #20
    //   659: if_icmpge -> 700
    //   662: aload #13
    //   664: iload #15
    //   666: iconst_4
    //   667: idiv
    //   668: iaload
    //   669: istore #16
    //   671: iconst_3
    //   672: iload #15
    //   674: iconst_4
    //   675: irem
    //   676: isub
    //   677: bipush #8
    //   679: imul
    //   680: istore #17
    //   682: aload #14
    //   684: iload #15
    //   686: iload #16
    //   688: iload #17
    //   690: iushr
    //   691: i2b
    //   692: bastore
    //   693: iinc #15, 1
    //   696: iload_2
    //   697: ifne -> 655
    //   700: aload #14
    //   702: astore #4
    //   704: sipush #-12546
    //   707: getstatic burp/Zscz.ZN : Ljava/lang/Object;
    //   710: checkcast java/math/BigInteger
    //   713: getstatic burp/Zsu2.ZG : Ljava/lang/Object;
    //   716: checkcast java/math/BigInteger
    //   719: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   722: putstatic burp/Zr2q.ZS : Ljava/lang/Object;
    //   725: sipush #-14218
    //   728: invokestatic a : (II)Ljava/lang/String;
    //   731: iconst_1
    //   732: ldc burp/Zl15
    //   734: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   737: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   740: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   743: astore_3
    //   744: aload_3
    //   745: arraylength
    //   746: istore #4
    //   748: iconst_0
    //   749: istore #5
    //   751: iload #5
    //   753: iload #4
    //   755: if_icmpge -> 892
    //   758: aload_3
    //   759: iload #5
    //   761: aaload
    //   762: astore #6
    //   764: aload #6
    //   766: invokevirtual getModifiers : ()I
    //   769: invokestatic isStatic : (I)Z
    //   772: ifne -> 782
    //   775: goto -> 885
    //   778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   781: athrow
    //   782: aload #6
    //   784: invokevirtual getType : ()Ljava/lang/Class;
    //   787: astore #7
    //   789: aload #7
    //   791: ifnull -> 872
    //   794: aload #7
    //   796: invokevirtual isPrimitive : ()Z
    //   799: ifne -> 872
    //   802: goto -> 809
    //   805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   808: athrow
    //   809: aload #7
    //   811: invokevirtual getPackage : ()Ljava/lang/Package;
    //   814: ifnull -> 872
    //   817: goto -> 824
    //   820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   823: athrow
    //   824: aload #7
    //   826: invokevirtual getPackage : ()Ljava/lang/Package;
    //   829: invokevirtual getName : ()Ljava/lang/String;
    //   832: ifnull -> 872
    //   835: goto -> 842
    //   838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   841: athrow
    //   842: aload #7
    //   844: invokevirtual getPackage : ()Ljava/lang/Package;
    //   847: invokevirtual getName : ()Ljava/lang/String;
    //   850: sipush #-12550
    //   853: sipush #-9623
    //   856: invokestatic a : (II)Ljava/lang/String;
    //   859: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   862: ifne -> 872
    //   865: goto -> 872
    //   868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   871: athrow
    //   872: aload #6
    //   874: iconst_1
    //   875: invokevirtual setAccessible : (Z)V
    //   878: aload #6
    //   880: aconst_null
    //   881: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   884: pop
    //   885: iinc #5, 1
    //   888: iload_2
    //   889: ifne -> 751
    //   892: sipush #-12556
    //   895: sipush #31584
    //   898: invokestatic a : (II)Ljava/lang/String;
    //   901: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   904: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   907: astore_3
    //   908: aload_3
    //   909: arraylength
    //   910: istore #4
    //   912: iconst_0
    //   913: istore #5
    //   915: iload #5
    //   917: iload #4
    //   919: if_icmpge -> 1051
    //   922: aload_3
    //   923: iload #5
    //   925: aaload
    //   926: astore #6
    //   928: aload #6
    //   930: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   933: pop
    //   934: aload #6
    //   936: invokevirtual getModifiers : ()I
    //   939: invokestatic isStatic : (I)Z
    //   942: ifeq -> 1037
    //   945: aload #6
    //   947: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   950: arraylength
    //   951: iconst_2
    //   952: if_icmpne -> 1037
    //   955: goto -> 962
    //   958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   961: athrow
    //   962: aload #6
    //   964: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   967: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   970: invokevirtual equals : (Ljava/lang/Object;)Z
    //   973: ifeq -> 1037
    //   976: goto -> 983
    //   979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   982: athrow
    //   983: aload #6
    //   985: iconst_1
    //   986: invokevirtual setAccessible : (Z)V
    //   989: aload #6
    //   991: aconst_null
    //   992: iconst_2
    //   993: anewarray java/lang/Object
    //   996: dup
    //   997: iconst_0
    //   998: aload_0
    //   999: aastore
    //   1000: dup
    //   1001: iconst_1
    //   1002: aload_1
    //   1003: ifnonnull -> 1021
    //   1006: goto -> 1013
    //   1009: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1012: athrow
    //   1013: aload_1
    //   1014: goto -> 1028
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: aload_1
    //   1022: checkcast [B
    //   1025: invokevirtual clone : ()Ljava/lang/Object;
    //   1028: aastore
    //   1029: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1032: pop
    //   1033: iload_2
    //   1034: ifne -> 1051
    //   1037: iinc #5, 1
    //   1040: iload_2
    //   1041: ifne -> 915
    //   1044: goto -> 1051
    //   1047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1050: athrow
    //   1051: new java/io/ByteArrayOutputStream
    //   1054: dup
    //   1055: invokespecial <init> : ()V
    //   1058: astore_3
    //   1059: sipush #-12557
    //   1062: aload_3
    //   1063: sipush #202
    //   1066: invokevirtual write : (I)V
    //   1069: sipush #27932
    //   1072: aload_3
    //   1073: sipush #254
    //   1076: invokevirtual write : (I)V
    //   1079: aload_3
    //   1080: sipush #186
    //   1083: invokevirtual write : (I)V
    //   1086: aload_3
    //   1087: sipush #190
    //   1090: invokevirtual write : (I)V
    //   1093: aload_3
    //   1094: iconst_0
    //   1095: invokevirtual write : (I)V
    //   1098: aload_3
    //   1099: iconst_1
    //   1100: invokevirtual write : (I)V
    //   1103: aload_3
    //   1104: iconst_0
    //   1105: invokevirtual write : (I)V
    //   1108: aload_3
    //   1109: bipush #50
    //   1111: invokevirtual write : (I)V
    //   1114: aload_3
    //   1115: getstatic burp/Ztp.Zp : Ljava/lang/Object;
    //   1118: checkcast java/math/BigInteger
    //   1121: invokevirtual toByteArray : ()[B
    //   1124: invokevirtual write : ([B)V
    //   1127: aload_3
    //   1128: getstatic burp/Zm6h.ZB : Ljava/lang/Object;
    //   1131: checkcast java/math/BigInteger
    //   1134: invokevirtual toByteArray : ()[B
    //   1137: invokevirtual write : ([B)V
    //   1140: aload_3
    //   1141: getstatic burp/Zlqq.ZV : Ljava/lang/Object;
    //   1144: checkcast java/math/BigInteger
    //   1147: invokevirtual toByteArray : ()[B
    //   1150: invokevirtual write : ([B)V
    //   1153: aload_3
    //   1154: invokevirtual toByteArray : ()[B
    //   1157: astore #4
    //   1159: aconst_null
    //   1160: astore #5
    //   1162: invokestatic a : (II)Ljava/lang/String;
    //   1165: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1168: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1171: astore #6
    //   1173: aload #6
    //   1175: arraylength
    //   1176: istore #7
    //   1178: iconst_0
    //   1179: istore #8
    //   1181: iload #8
    //   1183: iload #7
    //   1185: if_icmpge -> 1313
    //   1188: aload #6
    //   1190: iload #8
    //   1192: aaload
    //   1193: astore #9
    //   1195: aload #9
    //   1197: invokevirtual getName : ()Ljava/lang/String;
    //   1200: sipush #-12551
    //   1203: sipush #-12408
    //   1206: invokestatic a : (II)Ljava/lang/String;
    //   1209: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1212: ifeq -> 1306
    //   1215: aload #9
    //   1217: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1220: astore #10
    //   1222: aload #10
    //   1224: arraylength
    //   1225: iconst_4
    //   1226: if_icmpeq -> 1236
    //   1229: goto -> 1306
    //   1232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1235: athrow
    //   1236: aload #10
    //   1238: iconst_0
    //   1239: aaload
    //   1240: ldc java/lang/String
    //   1242: if_acmpeq -> 1252
    //   1245: goto -> 1306
    //   1248: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1251: athrow
    //   1252: aload #10
    //   1254: iconst_1
    //   1255: aaload
    //   1256: ldc [B
    //   1258: if_acmpeq -> 1268
    //   1261: goto -> 1306
    //   1264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1267: athrow
    //   1268: aload #10
    //   1270: iconst_2
    //   1271: aaload
    //   1272: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1275: if_acmpeq -> 1285
    //   1278: goto -> 1306
    //   1281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1284: athrow
    //   1285: aload #10
    //   1287: iconst_3
    //   1288: aaload
    //   1289: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1292: if_acmpeq -> 1302
    //   1295: goto -> 1306
    //   1298: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1301: athrow
    //   1302: aload #9
    //   1304: astore #5
    //   1306: iinc #8, 1
    //   1309: iload_2
    //   1310: ifne -> 1181
    //   1313: aload #5
    //   1315: iconst_1
    //   1316: invokevirtual setAccessible : (Z)V
    //   1319: ldc burp/Zlvx
    //   1321: iconst_0
    //   1322: anewarray java/lang/Class
    //   1325: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1328: astore #6
    //   1330: aload #6
    //   1332: iconst_1
    //   1333: invokevirtual setAccessible : (Z)V
    //   1336: aload #5
    //   1338: aload #6
    //   1340: iconst_0
    //   1341: anewarray java/lang/Object
    //   1344: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1347: iconst_4
    //   1348: anewarray java/lang/Object
    //   1351: dup
    //   1352: iconst_0
    //   1353: sipush #-12553
    //   1356: sipush #8566
    //   1359: invokestatic a : (II)Ljava/lang/String;
    //   1362: aastore
    //   1363: dup
    //   1364: iconst_1
    //   1365: aload #4
    //   1367: aastore
    //   1368: dup
    //   1369: iconst_2
    //   1370: iconst_0
    //   1371: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1374: aastore
    //   1375: dup
    //   1376: iconst_3
    //   1377: aload #4
    //   1379: arraylength
    //   1380: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1383: aastore
    //   1384: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1387: pop
    //   1388: goto -> 1392
    //   1391: astore_3
    //   1392: getstatic burp/Zm_u.Zi : Ljava/lang/String;
    //   1395: getstatic burp/Zry1.Zf : Ljava/lang/Object;
    //   1398: checkcast java/math/BigInteger
    //   1401: invokevirtual intValue : ()I
    //   1404: bipush #32
    //   1406: irem
    //   1407: invokestatic abs : (I)I
    //   1410: invokevirtual charAt : (I)C
    //   1413: getstatic burp/Zrl5.ZG : Ljava/lang/String;
    //   1416: getstatic burp/Zegv.ZL : Ljava/lang/Object;
    //   1419: checkcast java/math/BigInteger
    //   1422: invokevirtual intValue : ()I
    //   1425: bipush #32
    //   1427: irem
    //   1428: invokestatic abs : (I)I
    //   1431: invokevirtual charAt : (I)C
    //   1434: if_icmple -> 1549
    //   1437: getstatic burp/Zg0q.Ze : Ljava/lang/String;
    //   1440: getstatic burp/Zt6z.Zl : Ljava/lang/Object;
    //   1443: checkcast java/math/BigInteger
    //   1446: invokevirtual intValue : ()I
    //   1449: bipush #32
    //   1451: irem
    //   1452: invokestatic abs : (I)I
    //   1455: invokevirtual charAt : (I)C
    //   1458: getstatic burp/Zx4u.ZL : Ljava/lang/String;
    //   1461: getstatic burp/Zgei.ZN : Ljava/lang/Object;
    //   1464: checkcast java/math/BigInteger
    //   1467: invokevirtual intValue : ()I
    //   1470: bipush #32
    //   1472: irem
    //   1473: invokestatic abs : (I)I
    //   1476: invokevirtual charAt : (I)C
    //   1479: if_icmple -> 1549
    //   1482: goto -> 1489
    //   1485: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1488: athrow
    //   1489: getstatic burp/Zrfs.ZD : Ljava/lang/String;
    //   1492: getstatic burp/Ze25.ZW : Ljava/lang/Object;
    //   1495: checkcast java/math/BigInteger
    //   1498: invokevirtual intValue : ()I
    //   1501: bipush #32
    //   1503: irem
    //   1504: invokestatic abs : (I)I
    //   1507: invokevirtual charAt : (I)C
    //   1510: getstatic burp/Zst7.Zi : Ljava/lang/String;
    //   1513: getstatic burp/Zzht.Zb : Ljava/lang/Object;
    //   1516: checkcast java/math/BigInteger
    //   1519: invokevirtual intValue : ()I
    //   1522: bipush #32
    //   1524: irem
    //   1525: invokestatic abs : (I)I
    //   1528: invokevirtual charAt : (I)C
    //   1531: if_icmple -> 1549
    //   1534: goto -> 1541
    //   1537: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1540: athrow
    //   1541: iconst_1
    //   1542: goto -> 1550
    //   1545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1548: athrow
    //   1549: iconst_0
    //   1550: ireturn
    //   1551: astore_3
    //   1552: new java/lang/Exception
    //   1555: dup
    //   1556: aload_3
    //   1557: invokevirtual getMessage : ()Ljava/lang/String;
    //   1560: invokespecial <init> : (Ljava/lang/String;)V
    //   1563: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1550	1551	java/lang/Throwable
    //   327	351	354	java/lang/Throwable
    //   425	462	462	java/lang/Throwable
    //   466	487	487	java/lang/Throwable
    //   491	521	521	java/lang/Throwable
    //   764	778	778	java/lang/Throwable
    //   789	802	805	java/lang/Throwable
    //   794	817	820	java/lang/Throwable
    //   809	835	838	java/lang/Throwable
    //   824	865	868	java/lang/Throwable
    //   928	955	958	java/lang/Throwable
    //   945	976	979	java/lang/Throwable
    //   962	1006	1009	java/lang/Throwable
    //   983	1017	1017	java/lang/Throwable
    //   1028	1044	1047	java/lang/Throwable
    //   1051	1388	1391	java/lang/Throwable
    //   1222	1232	1232	java/lang/Throwable
    //   1236	1248	1248	java/lang/Throwable
    //   1252	1264	1264	java/lang/Throwable
    //   1268	1281	1281	java/lang/Throwable
    //   1285	1298	1298	java/lang/Throwable
    //   1392	1482	1485	java/lang/Throwable
    //   1437	1534	1537	java/lang/Throwable
    //   1489	1545	1545	java/lang/Throwable
  }
  
  static void ZT(Object paramObject) {
    Zewr.ZW = a(-12560, -22040);
    Zewr.Zw = new BigInteger(a(-12554, 30497));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zsko.Zd.charAt(Math.abs(((BigInteger)Zz5e.Zl).intValue() % 32)) > Zskf.ZV.charAt(Math.abs(((BigInteger)Zepy.Ze).intValue() % 32))) {
          try {
            Zlav.ZZ(Class.forName(a(-12552, -8106)));
            if (!bool)
              Zti7.Zf(Class.forName(a(-12558, 1956))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zti7.Zf(Class.forName(a(-12558, 1956)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'KÙÿ6U2ügÇwrÀ¿¢¥ÚÁì¨%úõ çö£@¥7êo8!óÃ<Z9âµ§Q¸ {¯%ãëë õ \\t©aöÓ´°M3÷Õd1÷Ç«ÎúÄäx_3dMøÑ^ý\ëWM.çqx¢µ³®B¼>·ÂÏÐæ9ùÁ%ú½\RxDÖ kóo'ìÁ¯È³SH%ý­n<xÈ©Mæ\\bØàÿÕr\\tX84¹T\\tñYJâÞxÿü^ ] TÅgÿx|*ã !qÝú=Ó{Dº«ñD½L½Fz\\tÏÕôj¾Úµ ¼±Gyyw·'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #75
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
    //   68: ldc '°1åNsXµñ°5¥pãu'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #35
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
    //   129: putstatic burp/Zeqz.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zeqz.b : [Ljava/lang/String;
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
    //   212: bipush #47
    //   214: goto -> 244
    //   217: bipush #87
    //   219: goto -> 244
    //   222: bipush #13
    //   224: goto -> 244
    //   227: bipush #110
    //   229: goto -> 244
    //   232: bipush #59
    //   234: goto -> 244
    //   237: bipush #63
    //   239: goto -> 244
    //   242: bipush #117
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
    //   300: sipush #-12549
    //   303: sipush #1826
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zeqz.ZV : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #13
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: iconst_1
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-72
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #122
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-114
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-5
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #78
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #55
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #89
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-30
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-60
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-104
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #75
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #80
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #104
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-122
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #31
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #101
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-30
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-42
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-62
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #35
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-110
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #104
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #28
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-42
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-5
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #103
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-64
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #121
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-117
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #23
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zeqz.ZG : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCEF2) & 0xFFFF;
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
      char c = 'õ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeqz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */