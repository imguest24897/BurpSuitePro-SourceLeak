package burp;

import java.math.BigInteger;

class Zmc_ extends ClassLoader {
  static String Zb;
  
  static Object Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zn(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zm1d.ZS : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zzgb.ZG : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zrd2.Zt : Ljava/lang/Object;
    //   22: sipush #-27515
    //   25: sipush #15193
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zl8f
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
    //   150: sipush #-27514
    //   153: sipush #-15405
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
    //   192: sipush #-27491
    //   195: sipush #-3293
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
    //   351: getstatic burp/Zzre.ZE : Ljava/lang/Object;
    //   354: checkcast java/math/BigInteger
    //   357: invokevirtual toByteArray : ()[B
    //   360: astore_3
    //   361: new java/lang/StringBuilder
    //   364: dup
    //   365: invokespecial <init> : ()V
    //   368: astore #5
    //   370: aload #5
    //   372: sipush #-27502
    //   375: sipush #-29332
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
    //   428: sipush #-27516
    //   431: sipush #11696
    //   434: invokestatic a : (II)Ljava/lang/String;
    //   437: ldc ''
    //   439: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   442: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   445: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   448: pop
    //   449: aload #5
    //   451: sipush #-27507
    //   454: sipush #30992
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
    //   1033: iconst_0
    //   1034: istore_3
    //   1035: getstatic burp/Zegw.Zn : Ljava/lang/String;
    //   1038: getstatic burp/Zm8j.Zj : Ljava/lang/Object;
    //   1041: checkcast java/math/BigInteger
    //   1044: invokevirtual intValue : ()I
    //   1047: bipush #32
    //   1049: irem
    //   1050: invokestatic abs : (I)I
    //   1053: invokevirtual charAt : (I)C
    //   1056: getstatic burp/Zbsz.Zu : Ljava/lang/String;
    //   1059: getstatic burp/Zrp2.Zw : Ljava/lang/Object;
    //   1062: checkcast java/math/BigInteger
    //   1065: invokevirtual intValue : ()I
    //   1068: bipush #32
    //   1070: irem
    //   1071: invokestatic abs : (I)I
    //   1074: invokevirtual charAt : (I)C
    //   1077: if_icmpgt -> 1421
    //   1080: sipush #-27512
    //   1083: sipush #26048
    //   1086: invokestatic a : (II)Ljava/lang/String;
    //   1089: iconst_1
    //   1090: ldc burp/Zsin
    //   1092: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1095: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1098: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1101: astore #4
    //   1103: aload #4
    //   1105: arraylength
    //   1106: istore #5
    //   1108: iconst_0
    //   1109: istore #6
    //   1111: iload #6
    //   1113: iload #5
    //   1115: if_icmpge -> 1253
    //   1118: aload #4
    //   1120: iload #6
    //   1122: aaload
    //   1123: astore #7
    //   1125: aload #7
    //   1127: invokevirtual getModifiers : ()I
    //   1130: invokestatic isStatic : (I)Z
    //   1133: ifne -> 1143
    //   1136: goto -> 1246
    //   1139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1142: athrow
    //   1143: aload #7
    //   1145: invokevirtual getType : ()Ljava/lang/Class;
    //   1148: astore #8
    //   1150: aload #8
    //   1152: ifnull -> 1233
    //   1155: aload #8
    //   1157: invokevirtual isPrimitive : ()Z
    //   1160: ifne -> 1233
    //   1163: goto -> 1170
    //   1166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1169: athrow
    //   1170: aload #8
    //   1172: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1175: ifnull -> 1233
    //   1178: goto -> 1185
    //   1181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1184: athrow
    //   1185: aload #8
    //   1187: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1190: invokevirtual getName : ()Ljava/lang/String;
    //   1193: ifnull -> 1233
    //   1196: goto -> 1203
    //   1199: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1202: athrow
    //   1203: aload #8
    //   1205: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1208: invokevirtual getName : ()Ljava/lang/String;
    //   1211: sipush #-27489
    //   1214: sipush #12137
    //   1217: invokestatic a : (II)Ljava/lang/String;
    //   1220: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1223: ifne -> 1233
    //   1226: goto -> 1233
    //   1229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1232: athrow
    //   1233: aload #7
    //   1235: iconst_1
    //   1236: invokevirtual setAccessible : (Z)V
    //   1239: aload #7
    //   1241: aconst_null
    //   1242: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1245: pop
    //   1246: iinc #6, 1
    //   1249: iload_2
    //   1250: ifne -> 1111
    //   1253: sipush #-27501
    //   1256: sipush #21513
    //   1259: invokestatic a : (II)Ljava/lang/String;
    //   1262: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1265: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1268: astore #4
    //   1270: aload #4
    //   1272: arraylength
    //   1273: istore #5
    //   1275: iconst_0
    //   1276: istore #6
    //   1278: iload #6
    //   1280: iload #5
    //   1282: if_icmpge -> 1418
    //   1285: aload #4
    //   1287: iload #6
    //   1289: aaload
    //   1290: astore #7
    //   1292: aload #7
    //   1294: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1297: pop
    //   1298: aload #7
    //   1300: invokevirtual getModifiers : ()I
    //   1303: invokestatic isStatic : (I)Z
    //   1306: ifeq -> 1404
    //   1309: aload #7
    //   1311: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1314: arraylength
    //   1315: iconst_2
    //   1316: if_icmpne -> 1404
    //   1319: goto -> 1326
    //   1322: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1325: athrow
    //   1326: aload #7
    //   1328: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1331: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1334: if_acmpne -> 1404
    //   1337: goto -> 1344
    //   1340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1343: athrow
    //   1344: aload #7
    //   1346: iconst_1
    //   1347: invokevirtual setAccessible : (Z)V
    //   1350: aload #7
    //   1352: aconst_null
    //   1353: iconst_2
    //   1354: anewarray java/lang/Object
    //   1357: dup
    //   1358: iconst_0
    //   1359: aload_0
    //   1360: aastore
    //   1361: dup
    //   1362: iconst_1
    //   1363: aload_1
    //   1364: ifnonnull -> 1382
    //   1367: goto -> 1374
    //   1370: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1373: athrow
    //   1374: aload_1
    //   1375: goto -> 1389
    //   1378: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1381: athrow
    //   1382: aload_1
    //   1383: checkcast [B
    //   1386: invokevirtual clone : ()Ljava/lang/Object;
    //   1389: aastore
    //   1390: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1393: checkcast java/lang/Boolean
    //   1396: invokevirtual booleanValue : ()Z
    //   1399: istore_3
    //   1400: iload_2
    //   1401: ifne -> 1418
    //   1404: iinc #6, 1
    //   1407: iload_2
    //   1408: ifne -> 1278
    //   1411: goto -> 1418
    //   1414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1417: athrow
    //   1418: goto -> 1759
    //   1421: sipush #-27520
    //   1424: sipush #-8498
    //   1427: invokestatic a : (II)Ljava/lang/String;
    //   1430: iconst_1
    //   1431: ldc burp/Zl1z
    //   1433: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1436: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1439: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1442: astore #4
    //   1444: aload #4
    //   1446: arraylength
    //   1447: istore #5
    //   1449: iconst_0
    //   1450: istore #6
    //   1452: iload #6
    //   1454: iload #5
    //   1456: if_icmpge -> 1594
    //   1459: aload #4
    //   1461: iload #6
    //   1463: aaload
    //   1464: astore #7
    //   1466: aload #7
    //   1468: invokevirtual getModifiers : ()I
    //   1471: invokestatic isStatic : (I)Z
    //   1474: ifne -> 1484
    //   1477: goto -> 1587
    //   1480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1483: athrow
    //   1484: aload #7
    //   1486: invokevirtual getType : ()Ljava/lang/Class;
    //   1489: astore #8
    //   1491: aload #8
    //   1493: ifnull -> 1574
    //   1496: aload #8
    //   1498: invokevirtual isPrimitive : ()Z
    //   1501: ifne -> 1574
    //   1504: goto -> 1511
    //   1507: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1510: athrow
    //   1511: aload #8
    //   1513: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1516: ifnull -> 1574
    //   1519: goto -> 1526
    //   1522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1525: athrow
    //   1526: aload #8
    //   1528: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1531: invokevirtual getName : ()Ljava/lang/String;
    //   1534: ifnull -> 1574
    //   1537: goto -> 1544
    //   1540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1543: athrow
    //   1544: aload #8
    //   1546: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1549: invokevirtual getName : ()Ljava/lang/String;
    //   1552: sipush #-27489
    //   1555: sipush #12137
    //   1558: invokestatic a : (II)Ljava/lang/String;
    //   1561: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1564: ifne -> 1574
    //   1567: goto -> 1574
    //   1570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1573: athrow
    //   1574: aload #7
    //   1576: iconst_1
    //   1577: invokevirtual setAccessible : (Z)V
    //   1580: aload #7
    //   1582: aconst_null
    //   1583: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1586: pop
    //   1587: iinc #6, 1
    //   1590: iload_2
    //   1591: ifne -> 1452
    //   1594: sipush #-27517
    //   1597: sipush #7930
    //   1600: invokestatic a : (II)Ljava/lang/String;
    //   1603: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1606: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1609: astore #4
    //   1611: aload #4
    //   1613: arraylength
    //   1614: istore #5
    //   1616: iconst_0
    //   1617: istore #6
    //   1619: iload #6
    //   1621: iload #5
    //   1623: if_icmpge -> 1759
    //   1626: aload #4
    //   1628: iload #6
    //   1630: aaload
    //   1631: astore #7
    //   1633: aload #7
    //   1635: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1638: pop
    //   1639: aload #7
    //   1641: invokevirtual getModifiers : ()I
    //   1644: invokestatic isStatic : (I)Z
    //   1647: ifeq -> 1745
    //   1650: aload #7
    //   1652: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1655: arraylength
    //   1656: iconst_2
    //   1657: if_icmpne -> 1745
    //   1660: goto -> 1667
    //   1663: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1666: athrow
    //   1667: aload #7
    //   1669: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1672: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1675: if_acmpne -> 1745
    //   1678: goto -> 1685
    //   1681: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1684: athrow
    //   1685: aload #7
    //   1687: iconst_1
    //   1688: invokevirtual setAccessible : (Z)V
    //   1691: aload #7
    //   1693: aconst_null
    //   1694: iconst_2
    //   1695: anewarray java/lang/Object
    //   1698: dup
    //   1699: iconst_0
    //   1700: aload_0
    //   1701: aastore
    //   1702: dup
    //   1703: iconst_1
    //   1704: aload_1
    //   1705: ifnonnull -> 1723
    //   1708: goto -> 1715
    //   1711: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1714: athrow
    //   1715: aload_1
    //   1716: goto -> 1730
    //   1719: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1722: athrow
    //   1723: aload_1
    //   1724: checkcast [B
    //   1727: invokevirtual clone : ()Ljava/lang/Object;
    //   1730: aastore
    //   1731: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1734: checkcast java/lang/Boolean
    //   1737: invokevirtual booleanValue : ()Z
    //   1740: istore_3
    //   1741: iload_2
    //   1742: ifne -> 1759
    //   1745: iinc #6, 1
    //   1748: iload_2
    //   1749: ifne -> 1619
    //   1752: goto -> 1759
    //   1755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1758: athrow
    //   1759: iload_3
    //   1760: ifeq -> 1765
    //   1763: iload_3
    //   1764: ireturn
    //   1765: getstatic burp/Zb3r.Zo : Ljava/lang/String;
    //   1768: getstatic burp/Zvh.Zb : Ljava/lang/Object;
    //   1771: checkcast java/math/BigInteger
    //   1774: invokevirtual intValue : ()I
    //   1777: bipush #32
    //   1779: irem
    //   1780: invokestatic abs : (I)I
    //   1783: invokevirtual charAt : (I)C
    //   1786: getstatic burp/Zb4d.ZS : Ljava/lang/String;
    //   1789: getstatic burp/Zst7.ZI : Ljava/lang/Object;
    //   1792: checkcast java/math/BigInteger
    //   1795: invokevirtual intValue : ()I
    //   1798: bipush #32
    //   1800: irem
    //   1801: invokestatic abs : (I)I
    //   1804: invokevirtual charAt : (I)C
    //   1807: if_icmple -> 2152
    //   1810: sipush #-27506
    //   1813: sipush #31861
    //   1816: invokestatic a : (II)Ljava/lang/String;
    //   1819: iconst_1
    //   1820: ldc burp/Zssb
    //   1822: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1825: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1828: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1831: astore #4
    //   1833: aload #4
    //   1835: arraylength
    //   1836: istore #5
    //   1838: iconst_0
    //   1839: istore #6
    //   1841: iload #6
    //   1843: iload #5
    //   1845: if_icmpge -> 1983
    //   1848: aload #4
    //   1850: iload #6
    //   1852: aaload
    //   1853: astore #7
    //   1855: aload #7
    //   1857: invokevirtual getModifiers : ()I
    //   1860: invokestatic isStatic : (I)Z
    //   1863: ifne -> 1873
    //   1866: goto -> 1976
    //   1869: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1872: athrow
    //   1873: aload #7
    //   1875: invokevirtual getType : ()Ljava/lang/Class;
    //   1878: astore #8
    //   1880: aload #8
    //   1882: ifnull -> 1963
    //   1885: aload #8
    //   1887: invokevirtual isPrimitive : ()Z
    //   1890: ifne -> 1963
    //   1893: goto -> 1900
    //   1896: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1899: athrow
    //   1900: aload #8
    //   1902: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1905: ifnull -> 1963
    //   1908: goto -> 1915
    //   1911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1914: athrow
    //   1915: aload #8
    //   1917: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1920: invokevirtual getName : ()Ljava/lang/String;
    //   1923: ifnull -> 1963
    //   1926: goto -> 1933
    //   1929: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1932: athrow
    //   1933: aload #8
    //   1935: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1938: invokevirtual getName : ()Ljava/lang/String;
    //   1941: sipush #-27489
    //   1944: sipush #12137
    //   1947: invokestatic a : (II)Ljava/lang/String;
    //   1950: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1953: ifne -> 1963
    //   1956: goto -> 1963
    //   1959: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1962: athrow
    //   1963: aload #7
    //   1965: iconst_1
    //   1966: invokevirtual setAccessible : (Z)V
    //   1969: aload #7
    //   1971: aconst_null
    //   1972: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1975: pop
    //   1976: iinc #6, 1
    //   1979: iload_2
    //   1980: ifne -> 1841
    //   1983: sipush #-27504
    //   1986: sipush #-12447
    //   1989: invokestatic a : (II)Ljava/lang/String;
    //   1992: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1995: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1998: astore #4
    //   2000: aload #4
    //   2002: arraylength
    //   2003: istore #5
    //   2005: iconst_0
    //   2006: istore #6
    //   2008: iload #6
    //   2010: iload #5
    //   2012: if_icmpge -> 2148
    //   2015: aload #4
    //   2017: iload #6
    //   2019: aaload
    //   2020: astore #7
    //   2022: aload #7
    //   2024: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2027: pop
    //   2028: aload #7
    //   2030: invokevirtual getModifiers : ()I
    //   2033: invokestatic isStatic : (I)Z
    //   2036: ifeq -> 2134
    //   2039: aload #7
    //   2041: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2044: arraylength
    //   2045: iconst_2
    //   2046: if_icmpne -> 2134
    //   2049: goto -> 2056
    //   2052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2055: athrow
    //   2056: aload #7
    //   2058: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2061: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2064: if_acmpne -> 2134
    //   2067: goto -> 2074
    //   2070: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2073: athrow
    //   2074: aload #7
    //   2076: iconst_1
    //   2077: invokevirtual setAccessible : (Z)V
    //   2080: aload #7
    //   2082: aconst_null
    //   2083: iconst_2
    //   2084: anewarray java/lang/Object
    //   2087: dup
    //   2088: iconst_0
    //   2089: aload_0
    //   2090: aastore
    //   2091: dup
    //   2092: iconst_1
    //   2093: aload_1
    //   2094: ifnonnull -> 2112
    //   2097: goto -> 2104
    //   2100: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2103: athrow
    //   2104: aload_1
    //   2105: goto -> 2119
    //   2108: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2111: athrow
    //   2112: aload_1
    //   2113: checkcast [B
    //   2116: invokevirtual clone : ()Ljava/lang/Object;
    //   2119: aastore
    //   2120: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2123: checkcast java/lang/Boolean
    //   2126: invokevirtual booleanValue : ()Z
    //   2129: istore_3
    //   2130: iload_2
    //   2131: ifne -> 2148
    //   2134: iinc #6, 1
    //   2137: iload_2
    //   2138: ifne -> 2008
    //   2141: goto -> 2148
    //   2144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2147: athrow
    //   2148: iload_2
    //   2149: ifne -> 2490
    //   2152: sipush #-27492
    //   2155: sipush #21295
    //   2158: invokestatic a : (II)Ljava/lang/String;
    //   2161: iconst_1
    //   2162: ldc burp/Zl3l
    //   2164: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2167: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2170: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2173: astore #4
    //   2175: aload #4
    //   2177: arraylength
    //   2178: istore #5
    //   2180: iconst_0
    //   2181: istore #6
    //   2183: iload #6
    //   2185: iload #5
    //   2187: if_icmpge -> 2325
    //   2190: aload #4
    //   2192: iload #6
    //   2194: aaload
    //   2195: astore #7
    //   2197: aload #7
    //   2199: invokevirtual getModifiers : ()I
    //   2202: invokestatic isStatic : (I)Z
    //   2205: ifne -> 2215
    //   2208: goto -> 2318
    //   2211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2214: athrow
    //   2215: aload #7
    //   2217: invokevirtual getType : ()Ljava/lang/Class;
    //   2220: astore #8
    //   2222: aload #8
    //   2224: ifnull -> 2305
    //   2227: aload #8
    //   2229: invokevirtual isPrimitive : ()Z
    //   2232: ifne -> 2305
    //   2235: goto -> 2242
    //   2238: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2241: athrow
    //   2242: aload #8
    //   2244: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2247: ifnull -> 2305
    //   2250: goto -> 2257
    //   2253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2256: athrow
    //   2257: aload #8
    //   2259: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2262: invokevirtual getName : ()Ljava/lang/String;
    //   2265: ifnull -> 2305
    //   2268: goto -> 2275
    //   2271: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2274: athrow
    //   2275: aload #8
    //   2277: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2280: invokevirtual getName : ()Ljava/lang/String;
    //   2283: sipush #-27489
    //   2286: sipush #12137
    //   2289: invokestatic a : (II)Ljava/lang/String;
    //   2292: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2295: ifne -> 2305
    //   2298: goto -> 2305
    //   2301: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2304: athrow
    //   2305: aload #7
    //   2307: iconst_1
    //   2308: invokevirtual setAccessible : (Z)V
    //   2311: aload #7
    //   2313: aconst_null
    //   2314: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2317: pop
    //   2318: iinc #6, 1
    //   2321: iload_2
    //   2322: ifne -> 2183
    //   2325: sipush #-27513
    //   2328: sipush #-14840
    //   2331: invokestatic a : (II)Ljava/lang/String;
    //   2334: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2337: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2340: astore #4
    //   2342: aload #4
    //   2344: arraylength
    //   2345: istore #5
    //   2347: iconst_0
    //   2348: istore #6
    //   2350: iload #6
    //   2352: iload #5
    //   2354: if_icmpge -> 2490
    //   2357: aload #4
    //   2359: iload #6
    //   2361: aaload
    //   2362: astore #7
    //   2364: aload #7
    //   2366: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2369: pop
    //   2370: aload #7
    //   2372: invokevirtual getModifiers : ()I
    //   2375: invokestatic isStatic : (I)Z
    //   2378: ifeq -> 2476
    //   2381: aload #7
    //   2383: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2386: arraylength
    //   2387: iconst_2
    //   2388: if_icmpne -> 2476
    //   2391: goto -> 2398
    //   2394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2397: athrow
    //   2398: aload #7
    //   2400: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2403: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2406: if_acmpne -> 2476
    //   2409: goto -> 2416
    //   2412: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2415: athrow
    //   2416: aload #7
    //   2418: iconst_1
    //   2419: invokevirtual setAccessible : (Z)V
    //   2422: aload #7
    //   2424: aconst_null
    //   2425: iconst_2
    //   2426: anewarray java/lang/Object
    //   2429: dup
    //   2430: iconst_0
    //   2431: aload_0
    //   2432: aastore
    //   2433: dup
    //   2434: iconst_1
    //   2435: aload_1
    //   2436: ifnonnull -> 2454
    //   2439: goto -> 2446
    //   2442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2445: athrow
    //   2446: aload_1
    //   2447: goto -> 2461
    //   2450: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2453: athrow
    //   2454: aload_1
    //   2455: checkcast [B
    //   2458: invokevirtual clone : ()Ljava/lang/Object;
    //   2461: aastore
    //   2462: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2465: checkcast java/lang/Boolean
    //   2468: invokevirtual booleanValue : ()Z
    //   2471: istore_3
    //   2472: iload_2
    //   2473: ifne -> 2490
    //   2476: iinc #6, 1
    //   2479: iload_2
    //   2480: ifne -> 2350
    //   2483: goto -> 2490
    //   2486: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2489: athrow
    //   2490: iload_3
    //   2491: ifeq -> 2496
    //   2494: iload_3
    //   2495: ireturn
    //   2496: getstatic burp/Zrwp.ZS : Ljava/lang/String;
    //   2499: getstatic burp/Zb2n.ZR : Ljava/lang/Object;
    //   2502: checkcast java/math/BigInteger
    //   2505: invokevirtual intValue : ()I
    //   2508: bipush #32
    //   2510: irem
    //   2511: invokestatic abs : (I)I
    //   2514: invokevirtual charAt : (I)C
    //   2517: getstatic burp/Zrex.Za : Ljava/lang/String;
    //   2520: getstatic burp/Zr2q.ZS : Ljava/lang/Object;
    //   2523: checkcast java/math/BigInteger
    //   2526: invokevirtual intValue : ()I
    //   2529: bipush #32
    //   2531: irem
    //   2532: invokestatic abs : (I)I
    //   2535: invokevirtual charAt : (I)C
    //   2538: if_icmpgt -> 2883
    //   2541: sipush #-27490
    //   2544: sipush #-22953
    //   2547: invokestatic a : (II)Ljava/lang/String;
    //   2550: iconst_1
    //   2551: ldc burp/Zrug
    //   2553: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2556: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2559: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2562: astore #4
    //   2564: aload #4
    //   2566: arraylength
    //   2567: istore #5
    //   2569: iconst_0
    //   2570: istore #6
    //   2572: iload #6
    //   2574: iload #5
    //   2576: if_icmpge -> 2714
    //   2579: aload #4
    //   2581: iload #6
    //   2583: aaload
    //   2584: astore #7
    //   2586: aload #7
    //   2588: invokevirtual getModifiers : ()I
    //   2591: invokestatic isStatic : (I)Z
    //   2594: ifne -> 2604
    //   2597: goto -> 2707
    //   2600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2603: athrow
    //   2604: aload #7
    //   2606: invokevirtual getType : ()Ljava/lang/Class;
    //   2609: astore #8
    //   2611: aload #8
    //   2613: ifnull -> 2694
    //   2616: aload #8
    //   2618: invokevirtual isPrimitive : ()Z
    //   2621: ifne -> 2694
    //   2624: goto -> 2631
    //   2627: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2630: athrow
    //   2631: aload #8
    //   2633: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2636: ifnull -> 2694
    //   2639: goto -> 2646
    //   2642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2645: athrow
    //   2646: aload #8
    //   2648: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2651: invokevirtual getName : ()Ljava/lang/String;
    //   2654: ifnull -> 2694
    //   2657: goto -> 2664
    //   2660: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2663: athrow
    //   2664: aload #8
    //   2666: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2669: invokevirtual getName : ()Ljava/lang/String;
    //   2672: sipush #-27489
    //   2675: sipush #12137
    //   2678: invokestatic a : (II)Ljava/lang/String;
    //   2681: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2684: ifne -> 2694
    //   2687: goto -> 2694
    //   2690: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2693: athrow
    //   2694: aload #7
    //   2696: iconst_1
    //   2697: invokevirtual setAccessible : (Z)V
    //   2700: aload #7
    //   2702: aconst_null
    //   2703: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2706: pop
    //   2707: iinc #6, 1
    //   2710: iload_2
    //   2711: ifne -> 2572
    //   2714: sipush #-27503
    //   2717: sipush #13960
    //   2720: invokestatic a : (II)Ljava/lang/String;
    //   2723: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2726: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2729: astore #4
    //   2731: aload #4
    //   2733: arraylength
    //   2734: istore #5
    //   2736: iconst_0
    //   2737: istore #6
    //   2739: iload #6
    //   2741: iload #5
    //   2743: if_icmpge -> 2879
    //   2746: aload #4
    //   2748: iload #6
    //   2750: aaload
    //   2751: astore #7
    //   2753: aload #7
    //   2755: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2758: pop
    //   2759: aload #7
    //   2761: invokevirtual getModifiers : ()I
    //   2764: invokestatic isStatic : (I)Z
    //   2767: ifeq -> 2865
    //   2770: aload #7
    //   2772: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2775: arraylength
    //   2776: iconst_2
    //   2777: if_icmpne -> 2865
    //   2780: goto -> 2787
    //   2783: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2786: athrow
    //   2787: aload #7
    //   2789: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2792: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2795: if_acmpne -> 2865
    //   2798: goto -> 2805
    //   2801: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2804: athrow
    //   2805: aload #7
    //   2807: iconst_1
    //   2808: invokevirtual setAccessible : (Z)V
    //   2811: aload #7
    //   2813: aconst_null
    //   2814: iconst_2
    //   2815: anewarray java/lang/Object
    //   2818: dup
    //   2819: iconst_0
    //   2820: aload_0
    //   2821: aastore
    //   2822: dup
    //   2823: iconst_1
    //   2824: aload_1
    //   2825: ifnonnull -> 2843
    //   2828: goto -> 2835
    //   2831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2834: athrow
    //   2835: aload_1
    //   2836: goto -> 2850
    //   2839: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2842: athrow
    //   2843: aload_1
    //   2844: checkcast [B
    //   2847: invokevirtual clone : ()Ljava/lang/Object;
    //   2850: aastore
    //   2851: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2854: checkcast java/lang/Boolean
    //   2857: invokevirtual booleanValue : ()Z
    //   2860: istore_3
    //   2861: iload_2
    //   2862: ifne -> 2879
    //   2865: iinc #6, 1
    //   2868: iload_2
    //   2869: ifne -> 2739
    //   2872: goto -> 2879
    //   2875: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2878: athrow
    //   2879: iload_2
    //   2880: ifne -> 3221
    //   2883: sipush #-27518
    //   2886: sipush #12382
    //   2889: invokestatic a : (II)Ljava/lang/String;
    //   2892: iconst_1
    //   2893: ldc burp/Zlxs
    //   2895: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2898: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2901: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2904: astore #4
    //   2906: aload #4
    //   2908: arraylength
    //   2909: istore #5
    //   2911: iconst_0
    //   2912: istore #6
    //   2914: iload #6
    //   2916: iload #5
    //   2918: if_icmpge -> 3056
    //   2921: aload #4
    //   2923: iload #6
    //   2925: aaload
    //   2926: astore #7
    //   2928: aload #7
    //   2930: invokevirtual getModifiers : ()I
    //   2933: invokestatic isStatic : (I)Z
    //   2936: ifne -> 2946
    //   2939: goto -> 3049
    //   2942: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2945: athrow
    //   2946: aload #7
    //   2948: invokevirtual getType : ()Ljava/lang/Class;
    //   2951: astore #8
    //   2953: aload #8
    //   2955: ifnull -> 3036
    //   2958: aload #8
    //   2960: invokevirtual isPrimitive : ()Z
    //   2963: ifne -> 3036
    //   2966: goto -> 2973
    //   2969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2972: athrow
    //   2973: aload #8
    //   2975: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2978: ifnull -> 3036
    //   2981: goto -> 2988
    //   2984: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2987: athrow
    //   2988: aload #8
    //   2990: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2993: invokevirtual getName : ()Ljava/lang/String;
    //   2996: ifnull -> 3036
    //   2999: goto -> 3006
    //   3002: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3005: athrow
    //   3006: aload #8
    //   3008: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3011: invokevirtual getName : ()Ljava/lang/String;
    //   3014: sipush #-27489
    //   3017: sipush #12137
    //   3020: invokestatic a : (II)Ljava/lang/String;
    //   3023: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3026: ifne -> 3036
    //   3029: goto -> 3036
    //   3032: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3035: athrow
    //   3036: aload #7
    //   3038: iconst_1
    //   3039: invokevirtual setAccessible : (Z)V
    //   3042: aload #7
    //   3044: aconst_null
    //   3045: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3048: pop
    //   3049: iinc #6, 1
    //   3052: iload_2
    //   3053: ifne -> 2914
    //   3056: sipush #-27510
    //   3059: sipush #-27221
    //   3062: invokestatic a : (II)Ljava/lang/String;
    //   3065: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3068: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3071: astore #4
    //   3073: aload #4
    //   3075: arraylength
    //   3076: istore #5
    //   3078: iconst_0
    //   3079: istore #6
    //   3081: iload #6
    //   3083: iload #5
    //   3085: if_icmpge -> 3221
    //   3088: aload #4
    //   3090: iload #6
    //   3092: aaload
    //   3093: astore #7
    //   3095: aload #7
    //   3097: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3100: pop
    //   3101: aload #7
    //   3103: invokevirtual getModifiers : ()I
    //   3106: invokestatic isStatic : (I)Z
    //   3109: ifeq -> 3207
    //   3112: aload #7
    //   3114: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3117: arraylength
    //   3118: iconst_2
    //   3119: if_icmpne -> 3207
    //   3122: goto -> 3129
    //   3125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3128: athrow
    //   3129: aload #7
    //   3131: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3134: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3137: if_acmpne -> 3207
    //   3140: goto -> 3147
    //   3143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3146: athrow
    //   3147: aload #7
    //   3149: iconst_1
    //   3150: invokevirtual setAccessible : (Z)V
    //   3153: aload #7
    //   3155: aconst_null
    //   3156: iconst_2
    //   3157: anewarray java/lang/Object
    //   3160: dup
    //   3161: iconst_0
    //   3162: aload_0
    //   3163: aastore
    //   3164: dup
    //   3165: iconst_1
    //   3166: aload_1
    //   3167: ifnonnull -> 3185
    //   3170: goto -> 3177
    //   3173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3176: athrow
    //   3177: aload_1
    //   3178: goto -> 3192
    //   3181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3184: athrow
    //   3185: aload_1
    //   3186: checkcast [B
    //   3189: invokevirtual clone : ()Ljava/lang/Object;
    //   3192: aastore
    //   3193: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3196: checkcast java/lang/Boolean
    //   3199: invokevirtual booleanValue : ()Z
    //   3202: istore_3
    //   3203: iload_2
    //   3204: ifne -> 3221
    //   3207: iinc #6, 1
    //   3210: iload_2
    //   3211: ifne -> 3081
    //   3214: goto -> 3221
    //   3217: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3220: athrow
    //   3221: iload_3
    //   3222: ifeq -> 3227
    //   3225: iload_3
    //   3226: ireturn
    //   3227: getstatic burp/Zb87.ZK : Ljava/lang/String;
    //   3230: getstatic burp/Zrtp.Zy : Ljava/lang/Object;
    //   3233: checkcast java/math/BigInteger
    //   3236: invokevirtual intValue : ()I
    //   3239: bipush #32
    //   3241: irem
    //   3242: invokestatic abs : (I)I
    //   3245: invokevirtual charAt : (I)C
    //   3248: getstatic burp/Zz4m.ZI : Ljava/lang/String;
    //   3251: getstatic burp/Zrgo.ZJ : Ljava/lang/Object;
    //   3254: checkcast java/math/BigInteger
    //   3257: invokevirtual intValue : ()I
    //   3260: bipush #32
    //   3262: irem
    //   3263: invokestatic abs : (I)I
    //   3266: invokevirtual charAt : (I)C
    //   3269: if_icmple -> 3614
    //   3272: sipush #-27509
    //   3275: sipush #2792
    //   3278: invokestatic a : (II)Ljava/lang/String;
    //   3281: iconst_1
    //   3282: ldc burp/Zg8
    //   3284: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3287: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3290: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3293: astore #4
    //   3295: aload #4
    //   3297: arraylength
    //   3298: istore #5
    //   3300: iconst_0
    //   3301: istore #6
    //   3303: iload #6
    //   3305: iload #5
    //   3307: if_icmpge -> 3445
    //   3310: aload #4
    //   3312: iload #6
    //   3314: aaload
    //   3315: astore #7
    //   3317: aload #7
    //   3319: invokevirtual getModifiers : ()I
    //   3322: invokestatic isStatic : (I)Z
    //   3325: ifne -> 3335
    //   3328: goto -> 3438
    //   3331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3334: athrow
    //   3335: aload #7
    //   3337: invokevirtual getType : ()Ljava/lang/Class;
    //   3340: astore #8
    //   3342: aload #8
    //   3344: ifnull -> 3425
    //   3347: aload #8
    //   3349: invokevirtual isPrimitive : ()Z
    //   3352: ifne -> 3425
    //   3355: goto -> 3362
    //   3358: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3361: athrow
    //   3362: aload #8
    //   3364: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3367: ifnull -> 3425
    //   3370: goto -> 3377
    //   3373: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3376: athrow
    //   3377: aload #8
    //   3379: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3382: invokevirtual getName : ()Ljava/lang/String;
    //   3385: ifnull -> 3425
    //   3388: goto -> 3395
    //   3391: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3394: athrow
    //   3395: aload #8
    //   3397: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3400: invokevirtual getName : ()Ljava/lang/String;
    //   3403: sipush #-27489
    //   3406: sipush #12137
    //   3409: invokestatic a : (II)Ljava/lang/String;
    //   3412: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3415: ifne -> 3425
    //   3418: goto -> 3425
    //   3421: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3424: athrow
    //   3425: aload #7
    //   3427: iconst_1
    //   3428: invokevirtual setAccessible : (Z)V
    //   3431: aload #7
    //   3433: aconst_null
    //   3434: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3437: pop
    //   3438: iinc #6, 1
    //   3441: iload_2
    //   3442: ifne -> 3303
    //   3445: sipush #-27519
    //   3448: sipush #-23951
    //   3451: invokestatic a : (II)Ljava/lang/String;
    //   3454: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3457: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3460: astore #4
    //   3462: aload #4
    //   3464: arraylength
    //   3465: istore #5
    //   3467: iconst_0
    //   3468: istore #6
    //   3470: iload #6
    //   3472: iload #5
    //   3474: if_icmpge -> 3610
    //   3477: aload #4
    //   3479: iload #6
    //   3481: aaload
    //   3482: astore #7
    //   3484: aload #7
    //   3486: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3489: pop
    //   3490: aload #7
    //   3492: invokevirtual getModifiers : ()I
    //   3495: invokestatic isStatic : (I)Z
    //   3498: ifeq -> 3596
    //   3501: aload #7
    //   3503: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3506: arraylength
    //   3507: iconst_2
    //   3508: if_icmpne -> 3596
    //   3511: goto -> 3518
    //   3514: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3517: athrow
    //   3518: aload #7
    //   3520: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3523: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3526: if_acmpne -> 3596
    //   3529: goto -> 3536
    //   3532: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3535: athrow
    //   3536: aload #7
    //   3538: iconst_1
    //   3539: invokevirtual setAccessible : (Z)V
    //   3542: aload #7
    //   3544: aconst_null
    //   3545: iconst_2
    //   3546: anewarray java/lang/Object
    //   3549: dup
    //   3550: iconst_0
    //   3551: aload_0
    //   3552: aastore
    //   3553: dup
    //   3554: iconst_1
    //   3555: aload_1
    //   3556: ifnonnull -> 3574
    //   3559: goto -> 3566
    //   3562: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3565: athrow
    //   3566: aload_1
    //   3567: goto -> 3581
    //   3570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3573: athrow
    //   3574: aload_1
    //   3575: checkcast [B
    //   3578: invokevirtual clone : ()Ljava/lang/Object;
    //   3581: aastore
    //   3582: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3585: checkcast java/lang/Boolean
    //   3588: invokevirtual booleanValue : ()Z
    //   3591: istore_3
    //   3592: iload_2
    //   3593: ifne -> 3610
    //   3596: iinc #6, 1
    //   3599: iload_2
    //   3600: ifne -> 3470
    //   3603: goto -> 3610
    //   3606: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3609: athrow
    //   3610: iload_2
    //   3611: ifne -> 3952
    //   3614: sipush #-27505
    //   3617: sipush #19945
    //   3620: invokestatic a : (II)Ljava/lang/String;
    //   3623: iconst_1
    //   3624: ldc burp/Zmt6
    //   3626: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3629: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3632: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3635: astore #4
    //   3637: aload #4
    //   3639: arraylength
    //   3640: istore #5
    //   3642: iconst_0
    //   3643: istore #6
    //   3645: iload #6
    //   3647: iload #5
    //   3649: if_icmpge -> 3787
    //   3652: aload #4
    //   3654: iload #6
    //   3656: aaload
    //   3657: astore #7
    //   3659: aload #7
    //   3661: invokevirtual getModifiers : ()I
    //   3664: invokestatic isStatic : (I)Z
    //   3667: ifne -> 3677
    //   3670: goto -> 3780
    //   3673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3676: athrow
    //   3677: aload #7
    //   3679: invokevirtual getType : ()Ljava/lang/Class;
    //   3682: astore #8
    //   3684: aload #8
    //   3686: ifnull -> 3767
    //   3689: aload #8
    //   3691: invokevirtual isPrimitive : ()Z
    //   3694: ifne -> 3767
    //   3697: goto -> 3704
    //   3700: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3703: athrow
    //   3704: aload #8
    //   3706: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3709: ifnull -> 3767
    //   3712: goto -> 3719
    //   3715: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3718: athrow
    //   3719: aload #8
    //   3721: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3724: invokevirtual getName : ()Ljava/lang/String;
    //   3727: ifnull -> 3767
    //   3730: goto -> 3737
    //   3733: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3736: athrow
    //   3737: aload #8
    //   3739: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3742: invokevirtual getName : ()Ljava/lang/String;
    //   3745: sipush #-27489
    //   3748: sipush #12137
    //   3751: invokestatic a : (II)Ljava/lang/String;
    //   3754: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3757: ifne -> 3767
    //   3760: goto -> 3767
    //   3763: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3766: athrow
    //   3767: aload #7
    //   3769: iconst_1
    //   3770: invokevirtual setAccessible : (Z)V
    //   3773: aload #7
    //   3775: aconst_null
    //   3776: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3779: pop
    //   3780: iinc #6, 1
    //   3783: iload_2
    //   3784: ifne -> 3645
    //   3787: sipush #-27494
    //   3790: sipush #21012
    //   3793: invokestatic a : (II)Ljava/lang/String;
    //   3796: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3799: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3802: astore #4
    //   3804: aload #4
    //   3806: arraylength
    //   3807: istore #5
    //   3809: iconst_0
    //   3810: istore #6
    //   3812: iload #6
    //   3814: iload #5
    //   3816: if_icmpge -> 3952
    //   3819: aload #4
    //   3821: iload #6
    //   3823: aaload
    //   3824: astore #7
    //   3826: aload #7
    //   3828: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3831: pop
    //   3832: aload #7
    //   3834: invokevirtual getModifiers : ()I
    //   3837: invokestatic isStatic : (I)Z
    //   3840: ifeq -> 3938
    //   3843: aload #7
    //   3845: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3848: arraylength
    //   3849: iconst_2
    //   3850: if_icmpne -> 3938
    //   3853: goto -> 3860
    //   3856: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3859: athrow
    //   3860: aload #7
    //   3862: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3865: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3868: if_acmpne -> 3938
    //   3871: goto -> 3878
    //   3874: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3877: athrow
    //   3878: aload #7
    //   3880: iconst_1
    //   3881: invokevirtual setAccessible : (Z)V
    //   3884: aload #7
    //   3886: aconst_null
    //   3887: iconst_2
    //   3888: anewarray java/lang/Object
    //   3891: dup
    //   3892: iconst_0
    //   3893: aload_0
    //   3894: aastore
    //   3895: dup
    //   3896: iconst_1
    //   3897: aload_1
    //   3898: ifnonnull -> 3916
    //   3901: goto -> 3908
    //   3904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3907: athrow
    //   3908: aload_1
    //   3909: goto -> 3923
    //   3912: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3915: athrow
    //   3916: aload_1
    //   3917: checkcast [B
    //   3920: invokevirtual clone : ()Ljava/lang/Object;
    //   3923: aastore
    //   3924: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3927: checkcast java/lang/Boolean
    //   3930: invokevirtual booleanValue : ()Z
    //   3933: istore_3
    //   3934: iload_2
    //   3935: ifne -> 3952
    //   3938: iinc #6, 1
    //   3941: iload_2
    //   3942: ifne -> 3812
    //   3945: goto -> 3952
    //   3948: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3951: athrow
    //   3952: iload_3
    //   3953: ireturn
    //   3954: astore_3
    //   3955: new java/lang/Exception
    //   3958: dup
    //   3959: aload_3
    //   3960: invokevirtual getMessage : ()Ljava/lang/String;
    //   3963: invokespecial <init> : (Ljava/lang/String;)V
    //   3966: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1764	3954	java/lang/Throwable
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
    //   1125	1139	1139	java/lang/Throwable
    //   1150	1163	1166	java/lang/Throwable
    //   1155	1178	1181	java/lang/Throwable
    //   1170	1196	1199	java/lang/Throwable
    //   1185	1226	1229	java/lang/Throwable
    //   1292	1319	1322	java/lang/Throwable
    //   1309	1337	1340	java/lang/Throwable
    //   1326	1367	1370	java/lang/Throwable
    //   1344	1378	1378	java/lang/Throwable
    //   1400	1411	1414	java/lang/Throwable
    //   1466	1480	1480	java/lang/Throwable
    //   1491	1504	1507	java/lang/Throwable
    //   1496	1519	1522	java/lang/Throwable
    //   1511	1537	1540	java/lang/Throwable
    //   1526	1567	1570	java/lang/Throwable
    //   1633	1660	1663	java/lang/Throwable
    //   1650	1678	1681	java/lang/Throwable
    //   1667	1708	1711	java/lang/Throwable
    //   1685	1719	1719	java/lang/Throwable
    //   1741	1752	1755	java/lang/Throwable
    //   1765	2495	3954	java/lang/Throwable
    //   1855	1869	1869	java/lang/Throwable
    //   1880	1893	1896	java/lang/Throwable
    //   1885	1908	1911	java/lang/Throwable
    //   1900	1926	1929	java/lang/Throwable
    //   1915	1956	1959	java/lang/Throwable
    //   2022	2049	2052	java/lang/Throwable
    //   2039	2067	2070	java/lang/Throwable
    //   2056	2097	2100	java/lang/Throwable
    //   2074	2108	2108	java/lang/Throwable
    //   2130	2141	2144	java/lang/Throwable
    //   2197	2211	2211	java/lang/Throwable
    //   2222	2235	2238	java/lang/Throwable
    //   2227	2250	2253	java/lang/Throwable
    //   2242	2268	2271	java/lang/Throwable
    //   2257	2298	2301	java/lang/Throwable
    //   2364	2391	2394	java/lang/Throwable
    //   2381	2409	2412	java/lang/Throwable
    //   2398	2439	2442	java/lang/Throwable
    //   2416	2450	2450	java/lang/Throwable
    //   2472	2483	2486	java/lang/Throwable
    //   2496	3226	3954	java/lang/Throwable
    //   2586	2600	2600	java/lang/Throwable
    //   2611	2624	2627	java/lang/Throwable
    //   2616	2639	2642	java/lang/Throwable
    //   2631	2657	2660	java/lang/Throwable
    //   2646	2687	2690	java/lang/Throwable
    //   2753	2780	2783	java/lang/Throwable
    //   2770	2798	2801	java/lang/Throwable
    //   2787	2828	2831	java/lang/Throwable
    //   2805	2839	2839	java/lang/Throwable
    //   2861	2872	2875	java/lang/Throwable
    //   2928	2942	2942	java/lang/Throwable
    //   2953	2966	2969	java/lang/Throwable
    //   2958	2981	2984	java/lang/Throwable
    //   2973	2999	3002	java/lang/Throwable
    //   2988	3029	3032	java/lang/Throwable
    //   3095	3122	3125	java/lang/Throwable
    //   3112	3140	3143	java/lang/Throwable
    //   3129	3170	3173	java/lang/Throwable
    //   3147	3181	3181	java/lang/Throwable
    //   3203	3214	3217	java/lang/Throwable
    //   3227	3953	3954	java/lang/Throwable
    //   3317	3331	3331	java/lang/Throwable
    //   3342	3355	3358	java/lang/Throwable
    //   3347	3370	3373	java/lang/Throwable
    //   3362	3388	3391	java/lang/Throwable
    //   3377	3418	3421	java/lang/Throwable
    //   3484	3511	3514	java/lang/Throwable
    //   3501	3529	3532	java/lang/Throwable
    //   3518	3559	3562	java/lang/Throwable
    //   3536	3570	3570	java/lang/Throwable
    //   3592	3603	3606	java/lang/Throwable
    //   3659	3673	3673	java/lang/Throwable
    //   3684	3697	3700	java/lang/Throwable
    //   3689	3712	3715	java/lang/Throwable
    //   3704	3730	3733	java/lang/Throwable
    //   3719	3760	3763	java/lang/Throwable
    //   3826	3853	3856	java/lang/Throwable
    //   3843	3871	3874	java/lang/Throwable
    //   3860	3901	3904	java/lang/Throwable
    //   3878	3912	3912	java/lang/Throwable
    //   3934	3945	3948	java/lang/Throwable
  }
  
  static void Zz(Object paramObject) {
    Zk8i.ZS = a(-27511, -27303);
    Zk8i.ZN = new BigInteger(a(-27496, 8872));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zl7x.Zo.charAt(Math.abs(((BigInteger)Zlwj.ZE).intValue() % 32)) <= Zrwp.ZS.charAt(Math.abs(((BigInteger)Zt4p.Zh).intValue() % 32))) {
          try {
            Zea8.ZG(Class.forName(a(-27495, 856)));
            if (!bool)
              Zz67.ZX(Class.forName(a(-27508, 19546))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zz67.ZX(Class.forName(a(-27508, 19546)));
    } catch (Throwable throwable) {}
  }
  
  static void Zf(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ààx÷5`»§ÿ0ÊÝ·Ðf«*o\\rG»k\\tÔ*ü3l¹ß\\t<Y¯*\\t8KÐQ\\tÐaiQØWvc\\t¯Lp\\rd\\t¬QÒöP\\nY\\tÊÈêKÙk½d\\tÅ­)\\fwåe\\tÈCµcg\\tþàfNHËz\\t¥.%|öÜå\\t­Ò\\f\\bwcí8ÜfQ¢\\tk ÔRJµü'&\\tþÊNàq>M!ãÊÓp¡+9¶gW§¶ûÝ²Wôà²Ö+!0è;\\f×z¬¾nÍÌÿ´»wrw b©£Ø¾dæ<O§GÙoÚCÌíÝ ùKÆ\±k¶(ÚriU?úV~À©²\\ràÖ\\tyæ¾e(ºÑ\\t&¯ULø\\rv \\tÛ®êl\\têén-²4ï\\t!/µ\ä=\\tRå`g\\t¨GQÂ®ZSB'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #78
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
    //   68: ldc '9QnµÜwÒ Þ³íÉ%ôÙÀ±-£¶\\tÞC*!½%£Tû½ÙÑ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #86
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
    //   129: putstatic burp/Zmc_.a : [Ljava/lang/String;
    //   132: bipush #28
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmc_.b : [Ljava/lang/String;
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
    //   212: bipush #33
    //   214: goto -> 244
    //   217: bipush #111
    //   219: goto -> 244
    //   222: bipush #110
    //   224: goto -> 244
    //   227: bipush #120
    //   229: goto -> 244
    //   232: bipush #10
    //   234: goto -> 244
    //   237: bipush #40
    //   239: goto -> 244
    //   242: bipush #74
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
    //   300: sipush #-27493
    //   303: sipush #10362
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zmc_.Zb : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #12
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-11
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-104
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #99
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #124
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #66
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-9
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-124
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #126
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-110
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #99
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-128
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #92
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #17
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-40
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #35
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #58
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-45
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-101
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-105
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-107
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #78
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #10
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #22
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #104
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-106
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-16
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #-52
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #107
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #51
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-39
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #30
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zmc_.Zj : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9489) & 0xFFFF;
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
      byte b1 = 64;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmc_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */