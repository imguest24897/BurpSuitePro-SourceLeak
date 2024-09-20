package burp;

import java.math.BigInteger;

class Zt5j extends ClassLoader {
  static Object Zn;
  
  static String ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZH(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zl06.Zw : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: aload_3
    //   15: arraylength
    //   16: bipush #8
    //   18: iadd
    //   19: bipush #6
    //   21: ishr
    //   22: iconst_1
    //   23: iadd
    //   24: bipush #16
    //   26: imul
    //   27: newarray int
    //   29: astore #5
    //   31: iconst_0
    //   32: istore #6
    //   34: iload #6
    //   36: aload_3
    //   37: arraylength
    //   38: if_icmpge -> 81
    //   41: aload_3
    //   42: iload #6
    //   44: baload
    //   45: sipush #255
    //   48: iand
    //   49: istore #7
    //   51: aload #5
    //   53: iload #6
    //   55: iconst_2
    //   56: ishr
    //   57: dup2
    //   58: iaload
    //   59: iload #7
    //   61: bipush #24
    //   63: iload #6
    //   65: iconst_4
    //   66: irem
    //   67: bipush #8
    //   69: imul
    //   70: isub
    //   71: ishl
    //   72: ior
    //   73: iastore
    //   74: iinc #6, 1
    //   77: iload_2
    //   78: ifne -> 34
    //   81: aload #5
    //   83: iload #6
    //   85: iconst_2
    //   86: ishr
    //   87: dup2
    //   88: iaload
    //   89: sipush #128
    //   92: bipush #24
    //   94: iload #6
    //   96: iconst_4
    //   97: irem
    //   98: bipush #8
    //   100: imul
    //   101: isub
    //   102: ishl
    //   103: ior
    //   104: iastore
    //   105: aload #5
    //   107: aload #5
    //   109: arraylength
    //   110: iconst_1
    //   111: isub
    //   112: aload_3
    //   113: arraylength
    //   114: bipush #8
    //   116: imul
    //   117: iastore
    //   118: bipush #80
    //   120: newarray int
    //   122: astore #7
    //   124: ldc 1732584193
    //   126: istore #8
    //   128: ldc -271733879
    //   130: istore #9
    //   132: ldc -1732584194
    //   134: istore #10
    //   136: ldc 271733878
    //   138: istore #11
    //   140: ldc -1009589776
    //   142: istore #12
    //   144: iconst_0
    //   145: istore #6
    //   147: iload #6
    //   149: aload #5
    //   151: arraylength
    //   152: if_icmpge -> 474
    //   155: iload #8
    //   157: istore #13
    //   159: iload #9
    //   161: istore #14
    //   163: iload #10
    //   165: istore #15
    //   167: iload #11
    //   169: istore #16
    //   171: iload #12
    //   173: istore #17
    //   175: iconst_0
    //   176: istore #18
    //   178: iload #18
    //   180: bipush #80
    //   182: if_icmpge -> 432
    //   185: iload #18
    //   187: bipush #16
    //   189: if_icmpge -> 216
    //   192: aload #7
    //   194: iload #18
    //   196: aload #5
    //   198: iload #6
    //   200: iload #18
    //   202: iadd
    //   203: iaload
    //   204: iastore
    //   205: iload_2
    //   206: ifne -> 271
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   215: athrow
    //   216: aload #7
    //   218: iload #18
    //   220: iconst_3
    //   221: isub
    //   222: iaload
    //   223: aload #7
    //   225: iload #18
    //   227: bipush #8
    //   229: isub
    //   230: iaload
    //   231: ixor
    //   232: aload #7
    //   234: iload #18
    //   236: bipush #14
    //   238: isub
    //   239: iaload
    //   240: ixor
    //   241: aload #7
    //   243: iload #18
    //   245: bipush #16
    //   247: isub
    //   248: iaload
    //   249: ixor
    //   250: istore #19
    //   252: iload #19
    //   254: iconst_1
    //   255: ishl
    //   256: iload #19
    //   258: bipush #31
    //   260: iushr
    //   261: ior
    //   262: istore #20
    //   264: aload #7
    //   266: iload #18
    //   268: iload #20
    //   270: iastore
    //   271: iload #8
    //   273: iconst_5
    //   274: ishl
    //   275: iload #8
    //   277: bipush #27
    //   279: iushr
    //   280: ior
    //   281: istore #19
    //   283: iload #19
    //   285: iload #12
    //   287: iadd
    //   288: aload #7
    //   290: iload #18
    //   292: iaload
    //   293: iadd
    //   294: iload #18
    //   296: bipush #20
    //   298: if_icmpge -> 324
    //   301: ldc 1518500249
    //   303: iload #9
    //   305: iload #10
    //   307: iand
    //   308: iload #9
    //   310: iconst_m1
    //   311: ixor
    //   312: iload #11
    //   314: iand
    //   315: ior
    //   316: iadd
    //   317: goto -> 394
    //   320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   323: athrow
    //   324: iload #18
    //   326: bipush #40
    //   328: if_icmpge -> 349
    //   331: ldc 1859775393
    //   333: iload #9
    //   335: iload #10
    //   337: ixor
    //   338: iload #11
    //   340: ixor
    //   341: iadd
    //   342: goto -> 394
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: iload #18
    //   351: bipush #60
    //   353: if_icmpge -> 383
    //   356: ldc -1894007588
    //   358: iload #9
    //   360: iload #10
    //   362: iand
    //   363: iload #9
    //   365: iload #11
    //   367: iand
    //   368: ior
    //   369: iload #10
    //   371: iload #11
    //   373: iand
    //   374: ior
    //   375: iadd
    //   376: goto -> 394
    //   379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   382: athrow
    //   383: ldc -899497514
    //   385: iload #9
    //   387: iload #10
    //   389: ixor
    //   390: iload #11
    //   392: ixor
    //   393: iadd
    //   394: iadd
    //   395: istore #20
    //   397: iload #11
    //   399: istore #12
    //   401: iload #10
    //   403: istore #11
    //   405: iload #9
    //   407: bipush #30
    //   409: ishl
    //   410: iload #9
    //   412: iconst_2
    //   413: iushr
    //   414: ior
    //   415: istore #10
    //   417: iload #8
    //   419: istore #9
    //   421: iload #20
    //   423: istore #8
    //   425: iinc #18, 1
    //   428: iload_2
    //   429: ifne -> 178
    //   432: iload #8
    //   434: iload #13
    //   436: iadd
    //   437: istore #8
    //   439: iload #9
    //   441: iload #14
    //   443: iadd
    //   444: istore #9
    //   446: iload #10
    //   448: iload #15
    //   450: iadd
    //   451: istore #10
    //   453: iload #11
    //   455: iload #16
    //   457: iadd
    //   458: istore #11
    //   460: iload #12
    //   462: iload #17
    //   464: iadd
    //   465: istore #12
    //   467: iinc #6, 16
    //   470: iload_2
    //   471: ifne -> 147
    //   474: iconst_5
    //   475: newarray int
    //   477: dup
    //   478: iconst_0
    //   479: iload #8
    //   481: iastore
    //   482: dup
    //   483: iconst_1
    //   484: iload #9
    //   486: iastore
    //   487: dup
    //   488: iconst_2
    //   489: iload #10
    //   491: iastore
    //   492: dup
    //   493: iconst_3
    //   494: iload #11
    //   496: iastore
    //   497: dup
    //   498: iconst_4
    //   499: iload #12
    //   501: iastore
    //   502: astore #13
    //   504: bipush #20
    //   506: newarray byte
    //   508: astore #14
    //   510: iconst_0
    //   511: istore #15
    //   513: iload #15
    //   515: bipush #20
    //   517: if_icmpge -> 558
    //   520: aload #13
    //   522: iload #15
    //   524: iconst_4
    //   525: idiv
    //   526: iaload
    //   527: istore #16
    //   529: iconst_3
    //   530: iload #15
    //   532: iconst_4
    //   533: irem
    //   534: isub
    //   535: bipush #8
    //   537: imul
    //   538: istore #17
    //   540: aload #14
    //   542: iload #15
    //   544: iload #16
    //   546: iload #17
    //   548: iushr
    //   549: i2b
    //   550: bastore
    //   551: iinc #15, 1
    //   554: iload_2
    //   555: ifne -> 513
    //   558: aload #14
    //   560: astore #4
    //   562: sipush #-32206
    //   565: new java/math/BigInteger
    //   568: dup
    //   569: aload #4
    //   571: invokespecial <init> : ([B)V
    //   574: invokevirtual abs : ()Ljava/math/BigInteger;
    //   577: putstatic burp/Zs8q.ZI : Ljava/lang/Object;
    //   580: sipush #-25569
    //   583: invokestatic a : (II)Ljava/lang/String;
    //   586: iconst_1
    //   587: ldc burp/Zs4v
    //   589: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   592: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   595: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   598: astore_3
    //   599: aload_3
    //   600: arraylength
    //   601: istore #4
    //   603: iconst_0
    //   604: istore #5
    //   606: iload #5
    //   608: iload #4
    //   610: if_icmpge -> 747
    //   613: aload_3
    //   614: iload #5
    //   616: aaload
    //   617: astore #6
    //   619: aload #6
    //   621: invokevirtual getModifiers : ()I
    //   624: invokestatic isStatic : (I)Z
    //   627: ifne -> 637
    //   630: goto -> 740
    //   633: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   636: athrow
    //   637: aload #6
    //   639: invokevirtual getType : ()Ljava/lang/Class;
    //   642: astore #7
    //   644: aload #7
    //   646: ifnull -> 727
    //   649: aload #7
    //   651: invokevirtual isPrimitive : ()Z
    //   654: ifne -> 727
    //   657: goto -> 664
    //   660: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   663: athrow
    //   664: aload #7
    //   666: invokevirtual getPackage : ()Ljava/lang/Package;
    //   669: ifnull -> 727
    //   672: goto -> 679
    //   675: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   678: athrow
    //   679: aload #7
    //   681: invokevirtual getPackage : ()Ljava/lang/Package;
    //   684: invokevirtual getName : ()Ljava/lang/String;
    //   687: ifnull -> 727
    //   690: goto -> 697
    //   693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   696: athrow
    //   697: aload #7
    //   699: invokevirtual getPackage : ()Ljava/lang/Package;
    //   702: invokevirtual getName : ()Ljava/lang/String;
    //   705: sipush #-32204
    //   708: sipush #16147
    //   711: invokestatic a : (II)Ljava/lang/String;
    //   714: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   717: ifne -> 727
    //   720: goto -> 727
    //   723: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   726: athrow
    //   727: aload #6
    //   729: iconst_1
    //   730: invokevirtual setAccessible : (Z)V
    //   733: aload #6
    //   735: aconst_null
    //   736: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   739: pop
    //   740: iinc #5, 1
    //   743: iload_2
    //   744: ifne -> 606
    //   747: sipush #-32205
    //   750: sipush #17029
    //   753: invokestatic a : (II)Ljava/lang/String;
    //   756: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   759: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   762: astore_3
    //   763: aload_3
    //   764: arraylength
    //   765: istore #4
    //   767: iconst_0
    //   768: istore #5
    //   770: iload #5
    //   772: iload #4
    //   774: if_icmpge -> 906
    //   777: aload_3
    //   778: iload #5
    //   780: aaload
    //   781: astore #6
    //   783: aload #6
    //   785: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   788: pop
    //   789: aload #6
    //   791: invokevirtual getModifiers : ()I
    //   794: invokestatic isStatic : (I)Z
    //   797: ifeq -> 892
    //   800: aload #6
    //   802: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   805: arraylength
    //   806: iconst_2
    //   807: if_icmpne -> 892
    //   810: goto -> 817
    //   813: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   816: athrow
    //   817: aload #6
    //   819: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   822: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   825: invokevirtual equals : (Ljava/lang/Object;)Z
    //   828: ifeq -> 892
    //   831: goto -> 838
    //   834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   837: athrow
    //   838: aload #6
    //   840: iconst_1
    //   841: invokevirtual setAccessible : (Z)V
    //   844: aload #6
    //   846: aconst_null
    //   847: iconst_2
    //   848: anewarray java/lang/Object
    //   851: dup
    //   852: iconst_0
    //   853: aload_0
    //   854: aastore
    //   855: dup
    //   856: iconst_1
    //   857: aload_1
    //   858: ifnonnull -> 876
    //   861: goto -> 868
    //   864: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   867: athrow
    //   868: aload_1
    //   869: goto -> 883
    //   872: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   875: athrow
    //   876: aload_1
    //   877: checkcast [B
    //   880: invokevirtual clone : ()Ljava/lang/Object;
    //   883: aastore
    //   884: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   887: pop
    //   888: iload_2
    //   889: ifne -> 906
    //   892: iinc #5, 1
    //   895: iload_2
    //   896: ifne -> 770
    //   899: goto -> 906
    //   902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   905: athrow
    //   906: getstatic burp/Zm4i.Zr : Ljava/lang/Object;
    //   909: checkcast java/math/BigInteger
    //   912: invokevirtual toByteArray : ()[B
    //   915: astore_3
    //   916: aload_3
    //   917: arraylength
    //   918: bipush #8
    //   920: iadd
    //   921: bipush #6
    //   923: ishr
    //   924: iconst_1
    //   925: iadd
    //   926: bipush #16
    //   928: imul
    //   929: newarray int
    //   931: astore #5
    //   933: iconst_0
    //   934: istore #6
    //   936: iload #6
    //   938: aload_3
    //   939: arraylength
    //   940: if_icmpge -> 983
    //   943: aload_3
    //   944: iload #6
    //   946: baload
    //   947: sipush #255
    //   950: iand
    //   951: istore #7
    //   953: aload #5
    //   955: iload #6
    //   957: iconst_2
    //   958: ishr
    //   959: dup2
    //   960: iaload
    //   961: iload #7
    //   963: bipush #24
    //   965: iload #6
    //   967: iconst_4
    //   968: irem
    //   969: bipush #8
    //   971: imul
    //   972: isub
    //   973: ishl
    //   974: ior
    //   975: iastore
    //   976: iinc #6, 1
    //   979: iload_2
    //   980: ifne -> 936
    //   983: aload #5
    //   985: iload #6
    //   987: iconst_2
    //   988: ishr
    //   989: dup2
    //   990: iaload
    //   991: sipush #128
    //   994: bipush #24
    //   996: iload #6
    //   998: iconst_4
    //   999: irem
    //   1000: bipush #8
    //   1002: imul
    //   1003: isub
    //   1004: ishl
    //   1005: ior
    //   1006: iastore
    //   1007: aload #5
    //   1009: aload #5
    //   1011: arraylength
    //   1012: iconst_1
    //   1013: isub
    //   1014: aload_3
    //   1015: arraylength
    //   1016: bipush #8
    //   1018: imul
    //   1019: iastore
    //   1020: bipush #80
    //   1022: newarray int
    //   1024: astore #7
    //   1026: ldc 1732584193
    //   1028: istore #8
    //   1030: ldc -271733879
    //   1032: istore #9
    //   1034: ldc -1732584194
    //   1036: istore #10
    //   1038: ldc 271733878
    //   1040: istore #11
    //   1042: ldc -1009589776
    //   1044: istore #12
    //   1046: iconst_0
    //   1047: istore #6
    //   1049: iload #6
    //   1051: aload #5
    //   1053: arraylength
    //   1054: if_icmpge -> 1376
    //   1057: iload #8
    //   1059: istore #13
    //   1061: iload #9
    //   1063: istore #14
    //   1065: iload #10
    //   1067: istore #15
    //   1069: iload #11
    //   1071: istore #16
    //   1073: iload #12
    //   1075: istore #17
    //   1077: iconst_0
    //   1078: istore #18
    //   1080: iload #18
    //   1082: bipush #80
    //   1084: if_icmpge -> 1334
    //   1087: iload #18
    //   1089: bipush #16
    //   1091: if_icmpge -> 1118
    //   1094: aload #7
    //   1096: iload #18
    //   1098: aload #5
    //   1100: iload #6
    //   1102: iload #18
    //   1104: iadd
    //   1105: iaload
    //   1106: iastore
    //   1107: iload_2
    //   1108: ifne -> 1173
    //   1111: goto -> 1118
    //   1114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1117: athrow
    //   1118: aload #7
    //   1120: iload #18
    //   1122: iconst_3
    //   1123: isub
    //   1124: iaload
    //   1125: aload #7
    //   1127: iload #18
    //   1129: bipush #8
    //   1131: isub
    //   1132: iaload
    //   1133: ixor
    //   1134: aload #7
    //   1136: iload #18
    //   1138: bipush #14
    //   1140: isub
    //   1141: iaload
    //   1142: ixor
    //   1143: aload #7
    //   1145: iload #18
    //   1147: bipush #16
    //   1149: isub
    //   1150: iaload
    //   1151: ixor
    //   1152: istore #19
    //   1154: iload #19
    //   1156: iconst_1
    //   1157: ishl
    //   1158: iload #19
    //   1160: bipush #31
    //   1162: iushr
    //   1163: ior
    //   1164: istore #20
    //   1166: aload #7
    //   1168: iload #18
    //   1170: iload #20
    //   1172: iastore
    //   1173: iload #8
    //   1175: iconst_5
    //   1176: ishl
    //   1177: iload #8
    //   1179: bipush #27
    //   1181: iushr
    //   1182: ior
    //   1183: istore #19
    //   1185: iload #19
    //   1187: iload #12
    //   1189: iadd
    //   1190: aload #7
    //   1192: iload #18
    //   1194: iaload
    //   1195: iadd
    //   1196: iload #18
    //   1198: bipush #20
    //   1200: if_icmpge -> 1226
    //   1203: ldc 1518500249
    //   1205: iload #9
    //   1207: iload #10
    //   1209: iand
    //   1210: iload #9
    //   1212: iconst_m1
    //   1213: ixor
    //   1214: iload #11
    //   1216: iand
    //   1217: ior
    //   1218: iadd
    //   1219: goto -> 1296
    //   1222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1225: athrow
    //   1226: iload #18
    //   1228: bipush #40
    //   1230: if_icmpge -> 1251
    //   1233: ldc 1859775393
    //   1235: iload #9
    //   1237: iload #10
    //   1239: ixor
    //   1240: iload #11
    //   1242: ixor
    //   1243: iadd
    //   1244: goto -> 1296
    //   1247: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1250: athrow
    //   1251: iload #18
    //   1253: bipush #60
    //   1255: if_icmpge -> 1285
    //   1258: ldc -1894007588
    //   1260: iload #9
    //   1262: iload #10
    //   1264: iand
    //   1265: iload #9
    //   1267: iload #11
    //   1269: iand
    //   1270: ior
    //   1271: iload #10
    //   1273: iload #11
    //   1275: iand
    //   1276: ior
    //   1277: iadd
    //   1278: goto -> 1296
    //   1281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1284: athrow
    //   1285: ldc -899497514
    //   1287: iload #9
    //   1289: iload #10
    //   1291: ixor
    //   1292: iload #11
    //   1294: ixor
    //   1295: iadd
    //   1296: iadd
    //   1297: istore #20
    //   1299: iload #11
    //   1301: istore #12
    //   1303: iload #10
    //   1305: istore #11
    //   1307: iload #9
    //   1309: bipush #30
    //   1311: ishl
    //   1312: iload #9
    //   1314: iconst_2
    //   1315: iushr
    //   1316: ior
    //   1317: istore #10
    //   1319: iload #8
    //   1321: istore #9
    //   1323: iload #20
    //   1325: istore #8
    //   1327: iinc #18, 1
    //   1330: iload_2
    //   1331: ifne -> 1080
    //   1334: iload #8
    //   1336: iload #13
    //   1338: iadd
    //   1339: istore #8
    //   1341: iload #9
    //   1343: iload #14
    //   1345: iadd
    //   1346: istore #9
    //   1348: iload #10
    //   1350: iload #15
    //   1352: iadd
    //   1353: istore #10
    //   1355: iload #11
    //   1357: iload #16
    //   1359: iadd
    //   1360: istore #11
    //   1362: iload #12
    //   1364: iload #17
    //   1366: iadd
    //   1367: istore #12
    //   1369: iinc #6, 16
    //   1372: iload_2
    //   1373: ifne -> 1049
    //   1376: iconst_5
    //   1377: newarray int
    //   1379: dup
    //   1380: iconst_0
    //   1381: iload #8
    //   1383: iastore
    //   1384: dup
    //   1385: iconst_1
    //   1386: iload #9
    //   1388: iastore
    //   1389: dup
    //   1390: iconst_2
    //   1391: iload #10
    //   1393: iastore
    //   1394: dup
    //   1395: iconst_3
    //   1396: iload #11
    //   1398: iastore
    //   1399: dup
    //   1400: iconst_4
    //   1401: iload #12
    //   1403: iastore
    //   1404: astore #13
    //   1406: bipush #20
    //   1408: newarray byte
    //   1410: astore #14
    //   1412: iconst_0
    //   1413: istore #15
    //   1415: iload #15
    //   1417: bipush #20
    //   1419: if_icmpge -> 1460
    //   1422: aload #13
    //   1424: iload #15
    //   1426: iconst_4
    //   1427: idiv
    //   1428: iaload
    //   1429: istore #16
    //   1431: iconst_3
    //   1432: iload #15
    //   1434: iconst_4
    //   1435: irem
    //   1436: isub
    //   1437: bipush #8
    //   1439: imul
    //   1440: istore #17
    //   1442: aload #14
    //   1444: iload #15
    //   1446: iload #16
    //   1448: iload #17
    //   1450: iushr
    //   1451: i2b
    //   1452: bastore
    //   1453: iinc #15, 1
    //   1456: iload_2
    //   1457: ifne -> 1415
    //   1460: aload #14
    //   1462: astore #4
    //   1464: getstatic burp/Zgq_.ZQ : Ljava/lang/String;
    //   1467: getstatic burp/Zm8w.Zz : Ljava/lang/Object;
    //   1470: checkcast java/math/BigInteger
    //   1473: invokevirtual intValue : ()I
    //   1476: bipush #32
    //   1478: irem
    //   1479: invokestatic abs : (I)I
    //   1482: invokevirtual charAt : (I)C
    //   1485: getstatic burp/Zkm0.ZL : Ljava/lang/String;
    //   1488: getstatic burp/Zest.Zq : Ljava/lang/Object;
    //   1491: checkcast java/math/BigInteger
    //   1494: invokevirtual intValue : ()I
    //   1497: bipush #32
    //   1499: irem
    //   1500: invokestatic abs : (I)I
    //   1503: invokevirtual charAt : (I)C
    //   1506: if_icmple -> 1613
    //   1509: getstatic burp/Ze5f.Zt : Ljava/lang/String;
    //   1512: getstatic burp/Zgqi.Zp : Ljava/lang/Object;
    //   1515: checkcast java/math/BigInteger
    //   1518: invokevirtual intValue : ()I
    //   1521: bipush #32
    //   1523: irem
    //   1524: invokestatic abs : (I)I
    //   1527: invokevirtual charAt : (I)C
    //   1530: getstatic burp/Zs0_.ZH : Ljava/lang/String;
    //   1533: getstatic burp/Zl39.ZA : Ljava/lang/Object;
    //   1536: checkcast java/math/BigInteger
    //   1539: invokevirtual intValue : ()I
    //   1542: bipush #32
    //   1544: irem
    //   1545: invokestatic abs : (I)I
    //   1548: invokevirtual charAt : (I)C
    //   1551: if_icmpgt -> 1613
    //   1554: goto -> 1561
    //   1557: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1560: athrow
    //   1561: getstatic burp/Zlck.ZL : Ljava/lang/String;
    //   1564: getstatic burp/Zxjv.ZY : Ljava/lang/Object;
    //   1567: checkcast java/math/BigInteger
    //   1570: invokevirtual intValue : ()I
    //   1573: bipush #32
    //   1575: irem
    //   1576: invokestatic abs : (I)I
    //   1579: invokevirtual charAt : (I)C
    //   1582: getstatic burp/Zef0.ZR : Ljava/lang/String;
    //   1585: getstatic burp/Zv8c.Zx : Ljava/lang/Object;
    //   1588: checkcast java/math/BigInteger
    //   1591: invokevirtual intValue : ()I
    //   1594: bipush #32
    //   1596: irem
    //   1597: invokestatic abs : (I)I
    //   1600: invokevirtual charAt : (I)C
    //   1603: if_icmpgt -> 1621
    //   1606: goto -> 1613
    //   1609: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1612: athrow
    //   1613: iconst_1
    //   1614: goto -> 1622
    //   1617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1620: athrow
    //   1621: iconst_0
    //   1622: ireturn
    //   1623: astore_3
    //   1624: new java/lang/Exception
    //   1627: dup
    //   1628: aload_3
    //   1629: invokevirtual getMessage : ()Ljava/lang/String;
    //   1632: invokespecial <init> : (Ljava/lang/String;)V
    //   1635: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1622	1623	java/lang/Throwable
    //   185	209	212	java/lang/Throwable
    //   283	320	320	java/lang/Throwable
    //   324	345	345	java/lang/Throwable
    //   349	379	379	java/lang/Throwable
    //   619	633	633	java/lang/Throwable
    //   644	657	660	java/lang/Throwable
    //   649	672	675	java/lang/Throwable
    //   664	690	693	java/lang/Throwable
    //   679	720	723	java/lang/Throwable
    //   783	810	813	java/lang/Throwable
    //   800	831	834	java/lang/Throwable
    //   817	861	864	java/lang/Throwable
    //   838	872	872	java/lang/Throwable
    //   883	899	902	java/lang/Throwable
    //   1087	1111	1114	java/lang/Throwable
    //   1185	1222	1222	java/lang/Throwable
    //   1226	1247	1247	java/lang/Throwable
    //   1251	1281	1281	java/lang/Throwable
    //   1464	1554	1557	java/lang/Throwable
    //   1509	1606	1609	java/lang/Throwable
    //   1561	1617	1617	java/lang/Throwable
  }
  
  static void Zi(Object paramObject) {
    Zlem.Zl = a(-32207, -2562);
    Zlem.ZI = new BigInteger(a(-32203, -27094));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zlnm.ZL.charAt(Math.abs(((BigInteger)Zlhy.ZN).intValue() % 32)) <= Ztj5.Zt.charAt(Math.abs(((BigInteger)Ze6d.Zw).intValue() % 32))) {
          try {
            Zkb_.Zu(Class.forName(a(-32208, -32683)));
            if (!bool)
              Zldt.Zo(Class.forName(a(-32201, 21228))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zldt.Zo(Class.forName(a(-32201, 21228)));
    } catch (Throwable throwable) {}
  }
  
  static void Zp(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\fT\GH6² u³BF@V|ö.ªC\zRZbBiw§ÀÈ(âC¥MeÇ±%¡*¬L\\fñG¢dÒ¼êä¿A yä°X+4tºÔ7Àÿaí µ_i3>O[o1ÖY¯@ÎÉïK-T8û_-OYFÕ=*Î2o§;\\t°Iÿä3³0\\tmÎ©-ñpí'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #84
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
    //   68: ldc 'Ü\ïñÝ'wôªâ¤X-óÁ5cÝ)îçëáâp\\t&ßÿ6á;¡'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #41
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
    //   129: putstatic burp/Zt5j.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zt5j.b : [Ljava/lang/String;
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
    //   212: bipush #55
    //   214: goto -> 244
    //   217: bipush #6
    //   219: goto -> 244
    //   222: bipush #96
    //   224: goto -> 244
    //   227: bipush #99
    //   229: goto -> 244
    //   232: bipush #102
    //   234: goto -> 244
    //   237: bipush #90
    //   239: goto -> 244
    //   242: bipush #9
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
    //   310: bipush #64
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #70
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-80
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: iconst_0
    //   326: bastore
    //   327: dup
    //   328: iconst_4
    //   329: bipush #-68
    //   331: bastore
    //   332: dup
    //   333: iconst_5
    //   334: bipush #48
    //   336: bastore
    //   337: dup
    //   338: bipush #6
    //   340: bipush #-109
    //   342: bastore
    //   343: dup
    //   344: bipush #7
    //   346: bipush #-101
    //   348: bastore
    //   349: dup
    //   350: bipush #8
    //   352: bipush #-79
    //   354: bastore
    //   355: dup
    //   356: bipush #9
    //   358: iconst_5
    //   359: bastore
    //   360: dup
    //   361: bipush #10
    //   363: bipush #57
    //   365: bastore
    //   366: dup
    //   367: bipush #11
    //   369: bipush #-72
    //   371: bastore
    //   372: dup
    //   373: bipush #12
    //   375: bipush #-15
    //   377: bastore
    //   378: dup
    //   379: bipush #13
    //   381: bipush #107
    //   383: bastore
    //   384: dup
    //   385: bipush #14
    //   387: bipush #36
    //   389: bastore
    //   390: dup
    //   391: bipush #15
    //   393: bipush #24
    //   395: bastore
    //   396: dup
    //   397: bipush #16
    //   399: bipush #-116
    //   401: bastore
    //   402: dup
    //   403: bipush #17
    //   405: bipush #-123
    //   407: bastore
    //   408: dup
    //   409: bipush #18
    //   411: bipush #-114
    //   413: bastore
    //   414: dup
    //   415: bipush #19
    //   417: bipush #121
    //   419: bastore
    //   420: dup
    //   421: bipush #20
    //   423: bipush #-2
    //   425: bastore
    //   426: dup
    //   427: bipush #21
    //   429: bipush #59
    //   431: bastore
    //   432: dup
    //   433: bipush #22
    //   435: bipush #82
    //   437: bastore
    //   438: dup
    //   439: bipush #23
    //   441: bipush #72
    //   443: bastore
    //   444: dup
    //   445: bipush #24
    //   447: bipush #-31
    //   449: bastore
    //   450: dup
    //   451: bipush #25
    //   453: bipush #-16
    //   455: bastore
    //   456: dup
    //   457: bipush #26
    //   459: bipush #-51
    //   461: bastore
    //   462: dup
    //   463: bipush #27
    //   465: bipush #15
    //   467: bastore
    //   468: dup
    //   469: bipush #28
    //   471: iconst_0
    //   472: bastore
    //   473: dup
    //   474: bipush #29
    //   476: bipush #-123
    //   478: bastore
    //   479: dup
    //   480: bipush #30
    //   482: bipush #-105
    //   484: bastore
    //   485: dup
    //   486: bipush #31
    //   488: bipush #-36
    //   490: bastore
    //   491: invokespecial <init> : ([B)V
    //   494: putstatic burp/Zt5j.Zn : Ljava/lang/Object;
    //   497: sipush #-32202
    //   500: sipush #-28595
    //   503: invokestatic a : (II)Ljava/lang/String;
    //   506: putstatic burp/Zt5j.ZR : Ljava/lang/String;
    //   509: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8237) & 0xFFFF;
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
      byte b1 = 33;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt5j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */