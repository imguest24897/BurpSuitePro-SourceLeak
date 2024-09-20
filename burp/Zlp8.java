package burp;

import java.math.BigInteger;

class Zlp8 extends ClassLoader {
  static Object Zu;
  
  static String ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Ze(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zu(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zlwi.Zw : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zxee.Zj : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zxc.ZR : Ljava/lang/Object;
    //   22: getstatic burp/Zeor.Zb : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Ztvp.Zy : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zeoa.ZF : Ljava/lang/Object;
    //   40: new java/io/ByteArrayOutputStream
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: astore_3
    //   48: getstatic burp/Ztp.ZG : Ljava/lang/String;
    //   51: astore #4
    //   53: iconst_0
    //   54: istore #5
    //   56: iload #5
    //   58: aload #4
    //   60: invokevirtual length : ()I
    //   63: if_icmpge -> 93
    //   66: aload_3
    //   67: aload #4
    //   69: iload #5
    //   71: iload #5
    //   73: iconst_2
    //   74: iadd
    //   75: invokevirtual substring : (II)Ljava/lang/String;
    //   78: bipush #16
    //   80: invokestatic parseInt : (Ljava/lang/String;I)I
    //   83: invokevirtual write : (I)V
    //   86: iinc #5, 2
    //   89: iload_2
    //   90: ifeq -> 56
    //   93: aload_3
    //   94: invokevirtual toByteArray : ()[B
    //   97: astore #5
    //   99: getstatic burp/Zxf8.Zz : Ljava/lang/Object;
    //   102: checkcast java/math/BigInteger
    //   105: invokevirtual toByteArray : ()[B
    //   108: astore #6
    //   110: sipush #256
    //   113: newarray byte
    //   115: astore #8
    //   117: sipush #256
    //   120: newarray int
    //   122: astore #9
    //   124: sipush #256
    //   127: newarray int
    //   129: astore #10
    //   131: sipush #256
    //   134: newarray int
    //   136: astore #11
    //   138: sipush #256
    //   141: newarray int
    //   143: astore #12
    //   145: bipush #10
    //   147: newarray int
    //   149: astore #13
    //   151: sipush #283
    //   154: istore #14
    //   156: iconst_0
    //   157: istore #16
    //   159: iload #16
    //   161: sipush #256
    //   164: if_icmpge -> 398
    //   167: sipush #13227
    //   170: sipush #-26104
    //   173: invokestatic a : (II)Ljava/lang/String;
    //   176: iload #16
    //   178: iconst_1
    //   179: iushr
    //   180: invokevirtual charAt : (I)C
    //   183: istore #25
    //   185: iload #16
    //   187: iconst_1
    //   188: iand
    //   189: ifne -> 204
    //   192: iload #25
    //   194: bipush #8
    //   196: iushr
    //   197: goto -> 206
    //   200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   203: athrow
    //   204: iload #25
    //   206: i2b
    //   207: sipush #255
    //   210: iand
    //   211: istore #15
    //   213: iload #16
    //   215: iconst_1
    //   216: ishl
    //   217: istore #17
    //   219: iload #17
    //   221: sipush #256
    //   224: if_icmplt -> 234
    //   227: iload #17
    //   229: iload #14
    //   231: ixor
    //   232: istore #17
    //   234: iload #17
    //   236: iconst_1
    //   237: ishl
    //   238: istore #18
    //   240: iload #18
    //   242: sipush #256
    //   245: if_icmplt -> 255
    //   248: iload #18
    //   250: iload #14
    //   252: ixor
    //   253: istore #18
    //   255: iload #18
    //   257: iconst_1
    //   258: ishl
    //   259: istore #19
    //   261: iload #19
    //   263: sipush #256
    //   266: if_icmplt -> 276
    //   269: iload #19
    //   271: iload #14
    //   273: ixor
    //   274: istore #19
    //   276: iload #19
    //   278: iload #16
    //   280: ixor
    //   281: istore #20
    //   283: iload #20
    //   285: iload #17
    //   287: ixor
    //   288: istore #21
    //   290: iload #20
    //   292: iload #18
    //   294: ixor
    //   295: istore #22
    //   297: iload #19
    //   299: iload #18
    //   301: ixor
    //   302: iload #17
    //   304: ixor
    //   305: istore #23
    //   307: aload #8
    //   309: iload #16
    //   311: iload #15
    //   313: i2b
    //   314: bastore
    //   315: aload #9
    //   317: iload #15
    //   319: iload #23
    //   321: bipush #24
    //   323: ishl
    //   324: iload #20
    //   326: bipush #16
    //   328: ishl
    //   329: ior
    //   330: iload #22
    //   332: bipush #8
    //   334: ishl
    //   335: ior
    //   336: iload #21
    //   338: ior
    //   339: dup
    //   340: istore #24
    //   342: iastore
    //   343: aload #10
    //   345: iload #15
    //   347: iload #24
    //   349: bipush #8
    //   351: iushr
    //   352: iload #24
    //   354: bipush #24
    //   356: ishl
    //   357: ior
    //   358: iastore
    //   359: aload #11
    //   361: iload #15
    //   363: iload #24
    //   365: bipush #16
    //   367: iushr
    //   368: iload #24
    //   370: bipush #16
    //   372: ishl
    //   373: ior
    //   374: iastore
    //   375: aload #12
    //   377: iload #15
    //   379: iload #24
    //   381: bipush #24
    //   383: iushr
    //   384: iload #24
    //   386: bipush #8
    //   388: ishl
    //   389: ior
    //   390: iastore
    //   391: iinc #16, 1
    //   394: iload_2
    //   395: ifeq -> 159
    //   398: iconst_1
    //   399: istore #25
    //   401: aload #13
    //   403: iconst_0
    //   404: iload #25
    //   406: bipush #24
    //   408: ishl
    //   409: iastore
    //   410: iconst_1
    //   411: istore #26
    //   413: iload #26
    //   415: bipush #10
    //   417: if_icmpge -> 458
    //   420: iload #25
    //   422: iconst_1
    //   423: ishl
    //   424: istore #25
    //   426: iload #25
    //   428: sipush #256
    //   431: if_icmplt -> 441
    //   434: iload #25
    //   436: iload #14
    //   438: ixor
    //   439: istore #25
    //   441: aload #13
    //   443: iload #26
    //   445: iload #25
    //   447: bipush #24
    //   449: ishl
    //   450: iastore
    //   451: iinc #26, 1
    //   454: iload_2
    //   455: ifeq -> 413
    //   458: iconst_4
    //   459: istore #26
    //   461: iload #26
    //   463: bipush #6
    //   465: iadd
    //   466: istore #27
    //   468: iconst_4
    //   469: iload #27
    //   471: iconst_1
    //   472: iadd
    //   473: imul
    //   474: istore #28
    //   476: iload #28
    //   478: newarray int
    //   480: astore #29
    //   482: iload #28
    //   484: newarray int
    //   486: astore #30
    //   488: iconst_0
    //   489: istore #25
    //   491: iconst_0
    //   492: istore #32
    //   494: iconst_0
    //   495: istore #33
    //   497: iload #32
    //   499: iload #26
    //   501: if_icmpge -> 569
    //   504: aload #29
    //   506: iload #32
    //   508: aload #5
    //   510: iload #33
    //   512: baload
    //   513: bipush #24
    //   515: ishl
    //   516: aload #5
    //   518: iload #33
    //   520: iconst_1
    //   521: iadd
    //   522: baload
    //   523: sipush #255
    //   526: iand
    //   527: bipush #16
    //   529: ishl
    //   530: ior
    //   531: aload #5
    //   533: iload #33
    //   535: iconst_2
    //   536: iadd
    //   537: baload
    //   538: sipush #255
    //   541: iand
    //   542: bipush #8
    //   544: ishl
    //   545: ior
    //   546: aload #5
    //   548: iload #33
    //   550: iconst_3
    //   551: iadd
    //   552: baload
    //   553: sipush #255
    //   556: iand
    //   557: ior
    //   558: iastore
    //   559: iinc #32, 1
    //   562: iinc #33, 4
    //   565: iload_2
    //   566: ifeq -> 497
    //   569: iload #26
    //   571: istore #32
    //   573: iconst_0
    //   574: istore #33
    //   576: iload #32
    //   578: iload #28
    //   580: if_icmpge -> 707
    //   583: aload #29
    //   585: iload #32
    //   587: iconst_1
    //   588: isub
    //   589: iaload
    //   590: istore #31
    //   592: iload #33
    //   594: ifne -> 681
    //   597: iload #26
    //   599: istore #33
    //   601: aload #8
    //   603: iload #31
    //   605: bipush #16
    //   607: iushr
    //   608: sipush #255
    //   611: iand
    //   612: baload
    //   613: bipush #24
    //   615: ishl
    //   616: aload #8
    //   618: iload #31
    //   620: bipush #8
    //   622: iushr
    //   623: sipush #255
    //   626: iand
    //   627: baload
    //   628: sipush #255
    //   631: iand
    //   632: bipush #16
    //   634: ishl
    //   635: ior
    //   636: aload #8
    //   638: iload #31
    //   640: sipush #255
    //   643: iand
    //   644: baload
    //   645: sipush #255
    //   648: iand
    //   649: bipush #8
    //   651: ishl
    //   652: ior
    //   653: aload #8
    //   655: iload #31
    //   657: bipush #24
    //   659: iushr
    //   660: baload
    //   661: sipush #255
    //   664: iand
    //   665: ior
    //   666: istore #31
    //   668: iload #31
    //   670: aload #13
    //   672: iload #25
    //   674: iinc #25, 1
    //   677: iaload
    //   678: ixor
    //   679: istore #31
    //   681: aload #29
    //   683: iload #32
    //   685: aload #29
    //   687: iload #32
    //   689: iload #26
    //   691: isub
    //   692: iaload
    //   693: iload #31
    //   695: ixor
    //   696: iastore
    //   697: iinc #32, 1
    //   700: iinc #33, -1
    //   703: iload_2
    //   704: ifeq -> 576
    //   707: iconst_0
    //   708: istore #32
    //   710: iconst_4
    //   711: iload #27
    //   713: imul
    //   714: istore #33
    //   716: aload #30
    //   718: iload #32
    //   720: aload #29
    //   722: iload #33
    //   724: iaload
    //   725: iastore
    //   726: aload #30
    //   728: iload #32
    //   730: iconst_1
    //   731: iadd
    //   732: aload #29
    //   734: iload #33
    //   736: iconst_1
    //   737: iadd
    //   738: iaload
    //   739: iastore
    //   740: aload #30
    //   742: iload #32
    //   744: iconst_2
    //   745: iadd
    //   746: aload #29
    //   748: iload #33
    //   750: iconst_2
    //   751: iadd
    //   752: iaload
    //   753: iastore
    //   754: aload #30
    //   756: iload #32
    //   758: iconst_3
    //   759: iadd
    //   760: aload #29
    //   762: iload #33
    //   764: iconst_3
    //   765: iadd
    //   766: iaload
    //   767: iastore
    //   768: iinc #32, 4
    //   771: iinc #33, -4
    //   774: iconst_1
    //   775: istore #35
    //   777: iload #35
    //   779: iload #27
    //   781: if_icmpge -> 1145
    //   784: aload #29
    //   786: iload #33
    //   788: iaload
    //   789: istore #34
    //   791: aload #30
    //   793: iload #32
    //   795: aload #9
    //   797: aload #8
    //   799: iload #34
    //   801: bipush #24
    //   803: iushr
    //   804: baload
    //   805: sipush #255
    //   808: iand
    //   809: iaload
    //   810: aload #10
    //   812: aload #8
    //   814: iload #34
    //   816: bipush #16
    //   818: iushr
    //   819: sipush #255
    //   822: iand
    //   823: baload
    //   824: sipush #255
    //   827: iand
    //   828: iaload
    //   829: ixor
    //   830: aload #11
    //   832: aload #8
    //   834: iload #34
    //   836: bipush #8
    //   838: iushr
    //   839: sipush #255
    //   842: iand
    //   843: baload
    //   844: sipush #255
    //   847: iand
    //   848: iaload
    //   849: ixor
    //   850: aload #12
    //   852: aload #8
    //   854: iload #34
    //   856: sipush #255
    //   859: iand
    //   860: baload
    //   861: sipush #255
    //   864: iand
    //   865: iaload
    //   866: ixor
    //   867: iastore
    //   868: aload #29
    //   870: iload #33
    //   872: iconst_1
    //   873: iadd
    //   874: iaload
    //   875: istore #34
    //   877: aload #30
    //   879: iload #32
    //   881: iconst_1
    //   882: iadd
    //   883: aload #9
    //   885: aload #8
    //   887: iload #34
    //   889: bipush #24
    //   891: iushr
    //   892: baload
    //   893: sipush #255
    //   896: iand
    //   897: iaload
    //   898: aload #10
    //   900: aload #8
    //   902: iload #34
    //   904: bipush #16
    //   906: iushr
    //   907: sipush #255
    //   910: iand
    //   911: baload
    //   912: sipush #255
    //   915: iand
    //   916: iaload
    //   917: ixor
    //   918: aload #11
    //   920: aload #8
    //   922: iload #34
    //   924: bipush #8
    //   926: iushr
    //   927: sipush #255
    //   930: iand
    //   931: baload
    //   932: sipush #255
    //   935: iand
    //   936: iaload
    //   937: ixor
    //   938: aload #12
    //   940: aload #8
    //   942: iload #34
    //   944: sipush #255
    //   947: iand
    //   948: baload
    //   949: sipush #255
    //   952: iand
    //   953: iaload
    //   954: ixor
    //   955: iastore
    //   956: aload #29
    //   958: iload #33
    //   960: iconst_2
    //   961: iadd
    //   962: iaload
    //   963: istore #34
    //   965: aload #30
    //   967: iload #32
    //   969: iconst_2
    //   970: iadd
    //   971: aload #9
    //   973: aload #8
    //   975: iload #34
    //   977: bipush #24
    //   979: iushr
    //   980: baload
    //   981: sipush #255
    //   984: iand
    //   985: iaload
    //   986: aload #10
    //   988: aload #8
    //   990: iload #34
    //   992: bipush #16
    //   994: iushr
    //   995: sipush #255
    //   998: iand
    //   999: baload
    //   1000: sipush #255
    //   1003: iand
    //   1004: iaload
    //   1005: ixor
    //   1006: aload #11
    //   1008: aload #8
    //   1010: iload #34
    //   1012: bipush #8
    //   1014: iushr
    //   1015: sipush #255
    //   1018: iand
    //   1019: baload
    //   1020: sipush #255
    //   1023: iand
    //   1024: iaload
    //   1025: ixor
    //   1026: aload #12
    //   1028: aload #8
    //   1030: iload #34
    //   1032: sipush #255
    //   1035: iand
    //   1036: baload
    //   1037: sipush #255
    //   1040: iand
    //   1041: iaload
    //   1042: ixor
    //   1043: iastore
    //   1044: aload #29
    //   1046: iload #33
    //   1048: iconst_3
    //   1049: iadd
    //   1050: iaload
    //   1051: istore #34
    //   1053: aload #30
    //   1055: iload #32
    //   1057: iconst_3
    //   1058: iadd
    //   1059: aload #9
    //   1061: aload #8
    //   1063: iload #34
    //   1065: bipush #24
    //   1067: iushr
    //   1068: baload
    //   1069: sipush #255
    //   1072: iand
    //   1073: iaload
    //   1074: aload #10
    //   1076: aload #8
    //   1078: iload #34
    //   1080: bipush #16
    //   1082: iushr
    //   1083: sipush #255
    //   1086: iand
    //   1087: baload
    //   1088: sipush #255
    //   1091: iand
    //   1092: iaload
    //   1093: ixor
    //   1094: aload #11
    //   1096: aload #8
    //   1098: iload #34
    //   1100: bipush #8
    //   1102: iushr
    //   1103: sipush #255
    //   1106: iand
    //   1107: baload
    //   1108: sipush #255
    //   1111: iand
    //   1112: iaload
    //   1113: ixor
    //   1114: aload #12
    //   1116: aload #8
    //   1118: iload #34
    //   1120: sipush #255
    //   1123: iand
    //   1124: baload
    //   1125: sipush #255
    //   1128: iand
    //   1129: iaload
    //   1130: ixor
    //   1131: iastore
    //   1132: iinc #32, 4
    //   1135: iinc #33, -4
    //   1138: iinc #35, 1
    //   1141: iload_2
    //   1142: ifeq -> 777
    //   1145: aload #30
    //   1147: iload #32
    //   1149: aload #29
    //   1151: iload #33
    //   1153: iaload
    //   1154: iastore
    //   1155: aload #30
    //   1157: iload #32
    //   1159: iconst_1
    //   1160: iadd
    //   1161: aload #29
    //   1163: iload #33
    //   1165: iconst_1
    //   1166: iadd
    //   1167: iaload
    //   1168: iastore
    //   1169: aload #30
    //   1171: iload #32
    //   1173: iconst_2
    //   1174: iadd
    //   1175: aload #29
    //   1177: iload #33
    //   1179: iconst_2
    //   1180: iadd
    //   1181: iaload
    //   1182: iastore
    //   1183: aload #30
    //   1185: iload #32
    //   1187: iconst_3
    //   1188: iadd
    //   1189: aload #29
    //   1191: iload #33
    //   1193: iconst_3
    //   1194: iadd
    //   1195: iaload
    //   1196: iastore
    //   1197: iconst_0
    //   1198: newarray byte
    //   1200: astore #35
    //   1202: aload #6
    //   1204: arraylength
    //   1205: bipush #16
    //   1207: irem
    //   1208: ifeq -> 1232
    //   1211: new java/lang/Exception
    //   1214: dup
    //   1215: sipush #13218
    //   1218: sipush #-21594
    //   1221: invokestatic a : (II)Ljava/lang/String;
    //   1224: invokespecial <init> : (Ljava/lang/String;)V
    //   1227: athrow
    //   1228: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1231: athrow
    //   1232: bipush #10
    //   1234: istore #36
    //   1236: sipush #13225
    //   1239: sipush #256
    //   1242: newarray byte
    //   1244: astore #37
    //   1246: sipush #26658
    //   1249: sipush #256
    //   1252: newarray int
    //   1254: astore #38
    //   1256: sipush #256
    //   1259: newarray int
    //   1261: astore #39
    //   1263: sipush #256
    //   1266: newarray int
    //   1268: astore #40
    //   1270: sipush #256
    //   1273: newarray int
    //   1275: astore #41
    //   1277: sipush #283
    //   1280: istore #14
    //   1282: invokestatic a : (II)Ljava/lang/String;
    //   1285: astore #42
    //   1287: iconst_0
    //   1288: istore #16
    //   1290: iload #16
    //   1292: sipush #256
    //   1295: if_icmpge -> 1522
    //   1298: aload #42
    //   1300: iload #16
    //   1302: iconst_1
    //   1303: iushr
    //   1304: invokevirtual charAt : (I)C
    //   1307: istore #43
    //   1309: iload #16
    //   1311: iconst_1
    //   1312: iand
    //   1313: ifne -> 1328
    //   1316: iload #43
    //   1318: bipush #8
    //   1320: iushr
    //   1321: goto -> 1330
    //   1324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1327: athrow
    //   1328: iload #43
    //   1330: i2b
    //   1331: sipush #255
    //   1334: iand
    //   1335: istore #15
    //   1337: iload #16
    //   1339: iconst_1
    //   1340: ishl
    //   1341: istore #17
    //   1343: iload #17
    //   1345: sipush #256
    //   1348: if_icmplt -> 1358
    //   1351: iload #17
    //   1353: iload #14
    //   1355: ixor
    //   1356: istore #17
    //   1358: iload #17
    //   1360: iconst_1
    //   1361: ishl
    //   1362: istore #18
    //   1364: iload #18
    //   1366: sipush #256
    //   1369: if_icmplt -> 1379
    //   1372: iload #18
    //   1374: iload #14
    //   1376: ixor
    //   1377: istore #18
    //   1379: iload #18
    //   1381: iconst_1
    //   1382: ishl
    //   1383: istore #19
    //   1385: iload #19
    //   1387: sipush #256
    //   1390: if_icmplt -> 1400
    //   1393: iload #19
    //   1395: iload #14
    //   1397: ixor
    //   1398: istore #19
    //   1400: iload #19
    //   1402: iload #16
    //   1404: ixor
    //   1405: istore #20
    //   1407: iload #20
    //   1409: iload #17
    //   1411: ixor
    //   1412: istore #21
    //   1414: iload #20
    //   1416: iload #18
    //   1418: ixor
    //   1419: istore #22
    //   1421: iload #19
    //   1423: iload #18
    //   1425: ixor
    //   1426: iload #17
    //   1428: ixor
    //   1429: istore #23
    //   1431: aload #37
    //   1433: iload #15
    //   1435: iload #16
    //   1437: i2b
    //   1438: bastore
    //   1439: aload #38
    //   1441: iload #15
    //   1443: iload #23
    //   1445: bipush #24
    //   1447: ishl
    //   1448: iload #20
    //   1450: bipush #16
    //   1452: ishl
    //   1453: ior
    //   1454: iload #22
    //   1456: bipush #8
    //   1458: ishl
    //   1459: ior
    //   1460: iload #21
    //   1462: ior
    //   1463: dup
    //   1464: istore #24
    //   1466: iastore
    //   1467: aload #39
    //   1469: iload #15
    //   1471: iload #24
    //   1473: bipush #8
    //   1475: iushr
    //   1476: iload #24
    //   1478: bipush #24
    //   1480: ishl
    //   1481: ior
    //   1482: iastore
    //   1483: aload #40
    //   1485: iload #15
    //   1487: iload #24
    //   1489: bipush #16
    //   1491: iushr
    //   1492: iload #24
    //   1494: bipush #16
    //   1496: ishl
    //   1497: ior
    //   1498: iastore
    //   1499: aload #41
    //   1501: iload #15
    //   1503: iload #24
    //   1505: bipush #24
    //   1507: iushr
    //   1508: iload #24
    //   1510: bipush #8
    //   1512: ishl
    //   1513: ior
    //   1514: iastore
    //   1515: iinc #16, 1
    //   1518: iload_2
    //   1519: ifeq -> 1290
    //   1522: aload #6
    //   1524: arraylength
    //   1525: newarray byte
    //   1527: astore #43
    //   1529: iconst_0
    //   1530: istore #44
    //   1532: iload #44
    //   1534: aload #6
    //   1536: arraylength
    //   1537: bipush #16
    //   1539: idiv
    //   1540: if_icmpge -> 2454
    //   1543: bipush #16
    //   1545: newarray byte
    //   1547: astore #45
    //   1549: bipush #16
    //   1551: newarray byte
    //   1553: astore #46
    //   1555: iconst_0
    //   1556: istore #47
    //   1558: iload #47
    //   1560: bipush #16
    //   1562: if_icmpge -> 1588
    //   1565: aload #45
    //   1567: iload #47
    //   1569: aload #6
    //   1571: iload #47
    //   1573: iload #44
    //   1575: bipush #16
    //   1577: imul
    //   1578: iadd
    //   1579: baload
    //   1580: bastore
    //   1581: iinc #47, 1
    //   1584: iload_2
    //   1585: ifeq -> 1558
    //   1588: iconst_0
    //   1589: istore #47
    //   1591: aload #45
    //   1593: iconst_0
    //   1594: baload
    //   1595: bipush #24
    //   1597: ishl
    //   1598: aload #45
    //   1600: iconst_1
    //   1601: baload
    //   1602: sipush #255
    //   1605: iand
    //   1606: bipush #16
    //   1608: ishl
    //   1609: ior
    //   1610: aload #45
    //   1612: iconst_2
    //   1613: baload
    //   1614: sipush #255
    //   1617: iand
    //   1618: bipush #8
    //   1620: ishl
    //   1621: ior
    //   1622: aload #45
    //   1624: iconst_3
    //   1625: baload
    //   1626: sipush #255
    //   1629: iand
    //   1630: ior
    //   1631: aload #30
    //   1633: iconst_0
    //   1634: iaload
    //   1635: ixor
    //   1636: istore #49
    //   1638: aload #45
    //   1640: iconst_4
    //   1641: baload
    //   1642: bipush #24
    //   1644: ishl
    //   1645: aload #45
    //   1647: iconst_5
    //   1648: baload
    //   1649: sipush #255
    //   1652: iand
    //   1653: bipush #16
    //   1655: ishl
    //   1656: ior
    //   1657: aload #45
    //   1659: bipush #6
    //   1661: baload
    //   1662: sipush #255
    //   1665: iand
    //   1666: bipush #8
    //   1668: ishl
    //   1669: ior
    //   1670: aload #45
    //   1672: bipush #7
    //   1674: baload
    //   1675: sipush #255
    //   1678: iand
    //   1679: ior
    //   1680: aload #30
    //   1682: iconst_1
    //   1683: iaload
    //   1684: ixor
    //   1685: istore #50
    //   1687: aload #45
    //   1689: bipush #8
    //   1691: baload
    //   1692: bipush #24
    //   1694: ishl
    //   1695: aload #45
    //   1697: bipush #9
    //   1699: baload
    //   1700: sipush #255
    //   1703: iand
    //   1704: bipush #16
    //   1706: ishl
    //   1707: ior
    //   1708: aload #45
    //   1710: bipush #10
    //   1712: baload
    //   1713: sipush #255
    //   1716: iand
    //   1717: bipush #8
    //   1719: ishl
    //   1720: ior
    //   1721: aload #45
    //   1723: bipush #11
    //   1725: baload
    //   1726: sipush #255
    //   1729: iand
    //   1730: ior
    //   1731: aload #30
    //   1733: iconst_2
    //   1734: iaload
    //   1735: ixor
    //   1736: istore #51
    //   1738: aload #45
    //   1740: bipush #12
    //   1742: baload
    //   1743: bipush #24
    //   1745: ishl
    //   1746: aload #45
    //   1748: bipush #13
    //   1750: baload
    //   1751: sipush #255
    //   1754: iand
    //   1755: bipush #16
    //   1757: ishl
    //   1758: ior
    //   1759: aload #45
    //   1761: bipush #14
    //   1763: baload
    //   1764: sipush #255
    //   1767: iand
    //   1768: bipush #8
    //   1770: ishl
    //   1771: ior
    //   1772: aload #45
    //   1774: bipush #15
    //   1776: baload
    //   1777: sipush #255
    //   1780: iand
    //   1781: ior
    //   1782: aload #30
    //   1784: iconst_3
    //   1785: iaload
    //   1786: ixor
    //   1787: istore #52
    //   1789: iconst_1
    //   1790: istore #53
    //   1792: iload #53
    //   1794: iload #36
    //   1796: if_icmpge -> 2039
    //   1799: iinc #47, 4
    //   1802: aload #38
    //   1804: iload #49
    //   1806: bipush #24
    //   1808: iushr
    //   1809: iaload
    //   1810: aload #39
    //   1812: iload #52
    //   1814: bipush #16
    //   1816: iushr
    //   1817: sipush #255
    //   1820: iand
    //   1821: iaload
    //   1822: ixor
    //   1823: aload #40
    //   1825: iload #51
    //   1827: bipush #8
    //   1829: iushr
    //   1830: sipush #255
    //   1833: iand
    //   1834: iaload
    //   1835: ixor
    //   1836: aload #41
    //   1838: iload #50
    //   1840: sipush #255
    //   1843: iand
    //   1844: iaload
    //   1845: ixor
    //   1846: aload #30
    //   1848: iload #47
    //   1850: iaload
    //   1851: ixor
    //   1852: istore #54
    //   1854: aload #38
    //   1856: iload #50
    //   1858: bipush #24
    //   1860: iushr
    //   1861: iaload
    //   1862: aload #39
    //   1864: iload #49
    //   1866: bipush #16
    //   1868: iushr
    //   1869: sipush #255
    //   1872: iand
    //   1873: iaload
    //   1874: ixor
    //   1875: aload #40
    //   1877: iload #52
    //   1879: bipush #8
    //   1881: iushr
    //   1882: sipush #255
    //   1885: iand
    //   1886: iaload
    //   1887: ixor
    //   1888: aload #41
    //   1890: iload #51
    //   1892: sipush #255
    //   1895: iand
    //   1896: iaload
    //   1897: ixor
    //   1898: aload #30
    //   1900: iload #47
    //   1902: iconst_1
    //   1903: iadd
    //   1904: iaload
    //   1905: ixor
    //   1906: istore #55
    //   1908: aload #38
    //   1910: iload #51
    //   1912: bipush #24
    //   1914: iushr
    //   1915: iaload
    //   1916: aload #39
    //   1918: iload #50
    //   1920: bipush #16
    //   1922: iushr
    //   1923: sipush #255
    //   1926: iand
    //   1927: iaload
    //   1928: ixor
    //   1929: aload #40
    //   1931: iload #49
    //   1933: bipush #8
    //   1935: iushr
    //   1936: sipush #255
    //   1939: iand
    //   1940: iaload
    //   1941: ixor
    //   1942: aload #41
    //   1944: iload #52
    //   1946: sipush #255
    //   1949: iand
    //   1950: iaload
    //   1951: ixor
    //   1952: aload #30
    //   1954: iload #47
    //   1956: iconst_2
    //   1957: iadd
    //   1958: iaload
    //   1959: ixor
    //   1960: istore #56
    //   1962: aload #38
    //   1964: iload #52
    //   1966: bipush #24
    //   1968: iushr
    //   1969: iaload
    //   1970: aload #39
    //   1972: iload #51
    //   1974: bipush #16
    //   1976: iushr
    //   1977: sipush #255
    //   1980: iand
    //   1981: iaload
    //   1982: ixor
    //   1983: aload #40
    //   1985: iload #50
    //   1987: bipush #8
    //   1989: iushr
    //   1990: sipush #255
    //   1993: iand
    //   1994: iaload
    //   1995: ixor
    //   1996: aload #41
    //   1998: iload #49
    //   2000: sipush #255
    //   2003: iand
    //   2004: iaload
    //   2005: ixor
    //   2006: aload #30
    //   2008: iload #47
    //   2010: iconst_3
    //   2011: iadd
    //   2012: iaload
    //   2013: ixor
    //   2014: istore #57
    //   2016: iload #54
    //   2018: istore #49
    //   2020: iload #55
    //   2022: istore #50
    //   2024: iload #56
    //   2026: istore #51
    //   2028: iload #57
    //   2030: istore #52
    //   2032: iinc #53, 1
    //   2035: iload_2
    //   2036: ifeq -> 1792
    //   2039: iinc #47, 4
    //   2042: aload #30
    //   2044: iload #47
    //   2046: iaload
    //   2047: istore #48
    //   2049: aload #46
    //   2051: iconst_0
    //   2052: aload #37
    //   2054: iload #49
    //   2056: bipush #24
    //   2058: iushr
    //   2059: baload
    //   2060: iload #48
    //   2062: bipush #24
    //   2064: iushr
    //   2065: ixor
    //   2066: i2b
    //   2067: bastore
    //   2068: aload #46
    //   2070: iconst_1
    //   2071: aload #37
    //   2073: iload #52
    //   2075: bipush #16
    //   2077: iushr
    //   2078: sipush #255
    //   2081: iand
    //   2082: baload
    //   2083: iload #48
    //   2085: bipush #16
    //   2087: iushr
    //   2088: ixor
    //   2089: i2b
    //   2090: bastore
    //   2091: aload #46
    //   2093: iconst_2
    //   2094: aload #37
    //   2096: iload #51
    //   2098: bipush #8
    //   2100: iushr
    //   2101: sipush #255
    //   2104: iand
    //   2105: baload
    //   2106: iload #48
    //   2108: bipush #8
    //   2110: iushr
    //   2111: ixor
    //   2112: i2b
    //   2113: bastore
    //   2114: aload #46
    //   2116: iconst_3
    //   2117: aload #37
    //   2119: iload #50
    //   2121: sipush #255
    //   2124: iand
    //   2125: baload
    //   2126: iload #48
    //   2128: ixor
    //   2129: i2b
    //   2130: bastore
    //   2131: aload #30
    //   2133: iload #47
    //   2135: iconst_1
    //   2136: iadd
    //   2137: iaload
    //   2138: istore #48
    //   2140: aload #46
    //   2142: iconst_4
    //   2143: aload #37
    //   2145: iload #50
    //   2147: bipush #24
    //   2149: iushr
    //   2150: baload
    //   2151: iload #48
    //   2153: bipush #24
    //   2155: iushr
    //   2156: ixor
    //   2157: i2b
    //   2158: bastore
    //   2159: aload #46
    //   2161: iconst_5
    //   2162: aload #37
    //   2164: iload #49
    //   2166: bipush #16
    //   2168: iushr
    //   2169: sipush #255
    //   2172: iand
    //   2173: baload
    //   2174: iload #48
    //   2176: bipush #16
    //   2178: iushr
    //   2179: ixor
    //   2180: i2b
    //   2181: bastore
    //   2182: aload #46
    //   2184: bipush #6
    //   2186: aload #37
    //   2188: iload #52
    //   2190: bipush #8
    //   2192: iushr
    //   2193: sipush #255
    //   2196: iand
    //   2197: baload
    //   2198: iload #48
    //   2200: bipush #8
    //   2202: iushr
    //   2203: ixor
    //   2204: i2b
    //   2205: bastore
    //   2206: aload #46
    //   2208: bipush #7
    //   2210: aload #37
    //   2212: iload #51
    //   2214: sipush #255
    //   2217: iand
    //   2218: baload
    //   2219: iload #48
    //   2221: ixor
    //   2222: i2b
    //   2223: bastore
    //   2224: aload #30
    //   2226: iload #47
    //   2228: iconst_2
    //   2229: iadd
    //   2230: iaload
    //   2231: istore #48
    //   2233: aload #46
    //   2235: bipush #8
    //   2237: aload #37
    //   2239: iload #51
    //   2241: bipush #24
    //   2243: iushr
    //   2244: baload
    //   2245: iload #48
    //   2247: bipush #24
    //   2249: iushr
    //   2250: ixor
    //   2251: i2b
    //   2252: bastore
    //   2253: aload #46
    //   2255: bipush #9
    //   2257: aload #37
    //   2259: iload #50
    //   2261: bipush #16
    //   2263: iushr
    //   2264: sipush #255
    //   2267: iand
    //   2268: baload
    //   2269: iload #48
    //   2271: bipush #16
    //   2273: iushr
    //   2274: ixor
    //   2275: i2b
    //   2276: bastore
    //   2277: aload #46
    //   2279: bipush #10
    //   2281: aload #37
    //   2283: iload #49
    //   2285: bipush #8
    //   2287: iushr
    //   2288: sipush #255
    //   2291: iand
    //   2292: baload
    //   2293: iload #48
    //   2295: bipush #8
    //   2297: iushr
    //   2298: ixor
    //   2299: i2b
    //   2300: bastore
    //   2301: aload #46
    //   2303: bipush #11
    //   2305: aload #37
    //   2307: iload #52
    //   2309: sipush #255
    //   2312: iand
    //   2313: baload
    //   2314: iload #48
    //   2316: ixor
    //   2317: i2b
    //   2318: bastore
    //   2319: aload #30
    //   2321: iload #47
    //   2323: iconst_3
    //   2324: iadd
    //   2325: iaload
    //   2326: istore #48
    //   2328: aload #46
    //   2330: bipush #12
    //   2332: aload #37
    //   2334: iload #52
    //   2336: bipush #24
    //   2338: iushr
    //   2339: baload
    //   2340: iload #48
    //   2342: bipush #24
    //   2344: iushr
    //   2345: ixor
    //   2346: i2b
    //   2347: bastore
    //   2348: aload #46
    //   2350: bipush #13
    //   2352: aload #37
    //   2354: iload #51
    //   2356: bipush #16
    //   2358: iushr
    //   2359: sipush #255
    //   2362: iand
    //   2363: baload
    //   2364: iload #48
    //   2366: bipush #16
    //   2368: iushr
    //   2369: ixor
    //   2370: i2b
    //   2371: bastore
    //   2372: aload #46
    //   2374: bipush #14
    //   2376: aload #37
    //   2378: iload #50
    //   2380: bipush #8
    //   2382: iushr
    //   2383: sipush #255
    //   2386: iand
    //   2387: baload
    //   2388: iload #48
    //   2390: bipush #8
    //   2392: iushr
    //   2393: ixor
    //   2394: i2b
    //   2395: bastore
    //   2396: aload #46
    //   2398: bipush #15
    //   2400: aload #37
    //   2402: iload #49
    //   2404: sipush #255
    //   2407: iand
    //   2408: baload
    //   2409: iload #48
    //   2411: ixor
    //   2412: i2b
    //   2413: bastore
    //   2414: iconst_0
    //   2415: istore #53
    //   2417: iload #53
    //   2419: bipush #16
    //   2421: if_icmpge -> 2447
    //   2424: aload #43
    //   2426: iload #53
    //   2428: iload #44
    //   2430: bipush #16
    //   2432: imul
    //   2433: iadd
    //   2434: aload #46
    //   2436: iload #53
    //   2438: baload
    //   2439: bastore
    //   2440: iinc #53, 1
    //   2443: iload_2
    //   2444: ifeq -> 2417
    //   2447: iinc #44, 1
    //   2450: iload_2
    //   2451: ifeq -> 1532
    //   2454: aload #43
    //   2456: arraylength
    //   2457: ifle -> 2538
    //   2460: aload #43
    //   2462: aload #43
    //   2464: arraylength
    //   2465: iconst_1
    //   2466: isub
    //   2467: baload
    //   2468: istore #44
    //   2470: iload #44
    //   2472: bipush #16
    //   2474: if_icmple -> 2485
    //   2477: aload #43
    //   2479: astore #35
    //   2481: iload_2
    //   2482: ifeq -> 2538
    //   2485: aload #43
    //   2487: arraylength
    //   2488: iload #44
    //   2490: isub
    //   2491: newarray byte
    //   2493: astore #35
    //   2495: iconst_0
    //   2496: istore #45
    //   2498: iload #45
    //   2500: aload #35
    //   2502: arraylength
    //   2503: if_icmpge -> 2538
    //   2506: iload #45
    //   2508: aload #43
    //   2510: arraylength
    //   2511: if_icmpge -> 2538
    //   2514: aload #35
    //   2516: iload #45
    //   2518: aload #43
    //   2520: iload #45
    //   2522: baload
    //   2523: bastore
    //   2524: iinc #45, 1
    //   2527: iload_2
    //   2528: ifeq -> 2498
    //   2531: goto -> 2538
    //   2534: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2537: athrow
    //   2538: aload #35
    //   2540: astore #7
    //   2542: sipush #13217
    //   2545: new java/math/BigInteger
    //   2548: dup
    //   2549: aload #7
    //   2551: invokespecial <init> : ([B)V
    //   2554: invokevirtual abs : ()Ljava/math/BigInteger;
    //   2557: putstatic burp/Ztgj.ZY : Ljava/lang/Object;
    //   2560: sipush #-23777
    //   2563: invokestatic a : (II)Ljava/lang/String;
    //   2566: iconst_1
    //   2567: ldc burp/Zlpn
    //   2569: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2572: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2575: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2578: astore_3
    //   2579: aload_3
    //   2580: arraylength
    //   2581: istore #4
    //   2583: iconst_0
    //   2584: istore #5
    //   2586: iload #5
    //   2588: iload #4
    //   2590: if_icmpge -> 2727
    //   2593: aload_3
    //   2594: iload #5
    //   2596: aaload
    //   2597: astore #6
    //   2599: aload #6
    //   2601: invokevirtual getModifiers : ()I
    //   2604: invokestatic isStatic : (I)Z
    //   2607: ifne -> 2617
    //   2610: goto -> 2720
    //   2613: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2616: athrow
    //   2617: aload #6
    //   2619: invokevirtual getType : ()Ljava/lang/Class;
    //   2622: astore #7
    //   2624: aload #7
    //   2626: ifnull -> 2707
    //   2629: aload #7
    //   2631: invokevirtual isPrimitive : ()Z
    //   2634: ifne -> 2707
    //   2637: goto -> 2644
    //   2640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2643: athrow
    //   2644: aload #7
    //   2646: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2649: ifnull -> 2707
    //   2652: goto -> 2659
    //   2655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2658: athrow
    //   2659: aload #7
    //   2661: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2664: invokevirtual getName : ()Ljava/lang/String;
    //   2667: ifnull -> 2707
    //   2670: goto -> 2677
    //   2673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2676: athrow
    //   2677: aload #7
    //   2679: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2682: invokevirtual getName : ()Ljava/lang/String;
    //   2685: sipush #13228
    //   2688: sipush #22598
    //   2691: invokestatic a : (II)Ljava/lang/String;
    //   2694: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2697: ifne -> 2707
    //   2700: goto -> 2707
    //   2703: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2706: athrow
    //   2707: aload #6
    //   2709: iconst_1
    //   2710: invokevirtual setAccessible : (Z)V
    //   2713: aload #6
    //   2715: aconst_null
    //   2716: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2719: pop
    //   2720: iinc #5, 1
    //   2723: iload_2
    //   2724: ifeq -> 2586
    //   2727: sipush #13226
    //   2730: sipush #-21395
    //   2733: invokestatic a : (II)Ljava/lang/String;
    //   2736: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2739: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2742: astore_3
    //   2743: aload_3
    //   2744: arraylength
    //   2745: istore #4
    //   2747: iconst_0
    //   2748: istore #5
    //   2750: iload #5
    //   2752: iload #4
    //   2754: if_icmpge -> 2865
    //   2757: aload_3
    //   2758: iload #5
    //   2760: aaload
    //   2761: astore #6
    //   2763: aload #6
    //   2765: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2768: pop
    //   2769: aload #6
    //   2771: invokevirtual getModifiers : ()I
    //   2774: invokestatic isStatic : (I)Z
    //   2777: ifeq -> 2851
    //   2780: aload #6
    //   2782: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2785: arraylength
    //   2786: iconst_2
    //   2787: if_icmpne -> 2851
    //   2790: goto -> 2797
    //   2793: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2796: athrow
    //   2797: aload #6
    //   2799: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2802: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2805: if_acmpne -> 2851
    //   2808: goto -> 2815
    //   2811: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2814: athrow
    //   2815: aload #6
    //   2817: iconst_1
    //   2818: invokevirtual setAccessible : (Z)V
    //   2821: aload #6
    //   2823: aconst_null
    //   2824: iconst_2
    //   2825: anewarray java/lang/Object
    //   2828: dup
    //   2829: iconst_0
    //   2830: aload_0
    //   2831: aastore
    //   2832: dup
    //   2833: iconst_1
    //   2834: aload_1
    //   2835: aastore
    //   2836: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2839: pop
    //   2840: iload_2
    //   2841: ifeq -> 2865
    //   2844: goto -> 2851
    //   2847: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2850: athrow
    //   2851: iinc #5, 1
    //   2854: iload_2
    //   2855: ifeq -> 2750
    //   2858: goto -> 2865
    //   2861: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2864: athrow
    //   2865: sipush #13224
    //   2868: sipush #-28917
    //   2871: invokestatic a : (II)Ljava/lang/String;
    //   2874: iconst_1
    //   2875: ldc burp/Zgvf
    //   2877: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2880: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2883: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2886: astore_3
    //   2887: aload_3
    //   2888: arraylength
    //   2889: istore #4
    //   2891: iconst_0
    //   2892: istore #5
    //   2894: iload #5
    //   2896: iload #4
    //   2898: if_icmpge -> 3035
    //   2901: aload_3
    //   2902: iload #5
    //   2904: aaload
    //   2905: astore #6
    //   2907: aload #6
    //   2909: invokevirtual getModifiers : ()I
    //   2912: invokestatic isStatic : (I)Z
    //   2915: ifne -> 2925
    //   2918: goto -> 3028
    //   2921: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2924: athrow
    //   2925: aload #6
    //   2927: invokevirtual getType : ()Ljava/lang/Class;
    //   2930: astore #7
    //   2932: aload #7
    //   2934: ifnull -> 3015
    //   2937: aload #7
    //   2939: invokevirtual isPrimitive : ()Z
    //   2942: ifne -> 3015
    //   2945: goto -> 2952
    //   2948: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2951: athrow
    //   2952: aload #7
    //   2954: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2957: ifnull -> 3015
    //   2960: goto -> 2967
    //   2963: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2966: athrow
    //   2967: aload #7
    //   2969: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2972: invokevirtual getName : ()Ljava/lang/String;
    //   2975: ifnull -> 3015
    //   2978: goto -> 2985
    //   2981: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2984: athrow
    //   2985: aload #7
    //   2987: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2990: invokevirtual getName : ()Ljava/lang/String;
    //   2993: sipush #13216
    //   2996: sipush #23170
    //   2999: invokestatic a : (II)Ljava/lang/String;
    //   3002: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3005: ifne -> 3015
    //   3008: goto -> 3015
    //   3011: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3014: athrow
    //   3015: aload #6
    //   3017: iconst_1
    //   3018: invokevirtual setAccessible : (Z)V
    //   3021: aload #6
    //   3023: aconst_null
    //   3024: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3027: pop
    //   3028: iinc #5, 1
    //   3031: iload_2
    //   3032: ifeq -> 2894
    //   3035: sipush #13231
    //   3038: sipush #-27448
    //   3041: invokestatic a : (II)Ljava/lang/String;
    //   3044: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3047: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3050: astore_3
    //   3051: aload_3
    //   3052: arraylength
    //   3053: istore #4
    //   3055: iconst_0
    //   3056: istore #5
    //   3058: iload #5
    //   3060: iload #4
    //   3062: if_icmpge -> 3194
    //   3065: aload_3
    //   3066: iload #5
    //   3068: aaload
    //   3069: astore #6
    //   3071: aload #6
    //   3073: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3076: pop
    //   3077: aload #6
    //   3079: invokevirtual getModifiers : ()I
    //   3082: invokestatic isStatic : (I)Z
    //   3085: ifeq -> 3180
    //   3088: aload #6
    //   3090: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3093: arraylength
    //   3094: iconst_2
    //   3095: if_icmpne -> 3180
    //   3098: goto -> 3105
    //   3101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3104: athrow
    //   3105: aload #6
    //   3107: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3110: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   3113: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3116: ifeq -> 3180
    //   3119: goto -> 3126
    //   3122: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3125: athrow
    //   3126: aload #6
    //   3128: iconst_1
    //   3129: invokevirtual setAccessible : (Z)V
    //   3132: aload #6
    //   3134: aconst_null
    //   3135: iconst_2
    //   3136: anewarray java/lang/Object
    //   3139: dup
    //   3140: iconst_0
    //   3141: aload_0
    //   3142: aastore
    //   3143: dup
    //   3144: iconst_1
    //   3145: aload_1
    //   3146: ifnonnull -> 3164
    //   3149: goto -> 3156
    //   3152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3155: athrow
    //   3156: aload_1
    //   3157: goto -> 3171
    //   3160: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3163: athrow
    //   3164: aload_1
    //   3165: checkcast [B
    //   3168: invokevirtual clone : ()Ljava/lang/Object;
    //   3171: aastore
    //   3172: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3175: pop
    //   3176: iload_2
    //   3177: ifeq -> 3194
    //   3180: iinc #5, 1
    //   3183: iload_2
    //   3184: ifeq -> 3058
    //   3187: goto -> 3194
    //   3190: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3193: athrow
    //   3194: getstatic burp/Zr5k.Zq : Ljava/lang/String;
    //   3197: getstatic burp/Zg7z.ZV : Ljava/lang/Object;
    //   3200: checkcast java/math/BigInteger
    //   3203: invokevirtual intValue : ()I
    //   3206: bipush #32
    //   3208: irem
    //   3209: invokestatic abs : (I)I
    //   3212: invokevirtual charAt : (I)C
    //   3215: getstatic burp/Zmji.Zs : Ljava/lang/String;
    //   3218: getstatic burp/Zry0.Zr : Ljava/lang/Object;
    //   3221: checkcast java/math/BigInteger
    //   3224: invokevirtual intValue : ()I
    //   3227: bipush #32
    //   3229: irem
    //   3230: invokestatic abs : (I)I
    //   3233: invokevirtual charAt : (I)C
    //   3236: if_icmple -> 3343
    //   3239: getstatic burp/Zluk.ZW : Ljava/lang/String;
    //   3242: getstatic burp/Zrug.Zp : Ljava/lang/Object;
    //   3245: checkcast java/math/BigInteger
    //   3248: invokevirtual intValue : ()I
    //   3251: bipush #32
    //   3253: irem
    //   3254: invokestatic abs : (I)I
    //   3257: invokevirtual charAt : (I)C
    //   3260: getstatic burp/Zszz.Zg : Ljava/lang/String;
    //   3263: getstatic burp/Zgsy.ZC : Ljava/lang/Object;
    //   3266: checkcast java/math/BigInteger
    //   3269: invokevirtual intValue : ()I
    //   3272: bipush #32
    //   3274: irem
    //   3275: invokestatic abs : (I)I
    //   3278: invokevirtual charAt : (I)C
    //   3281: if_icmpgt -> 3343
    //   3284: goto -> 3291
    //   3287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3290: athrow
    //   3291: getstatic burp/Zxrd.ZF : Ljava/lang/String;
    //   3294: getstatic burp/Zsji.Zg : Ljava/lang/Object;
    //   3297: checkcast java/math/BigInteger
    //   3300: invokevirtual intValue : ()I
    //   3303: bipush #32
    //   3305: irem
    //   3306: invokestatic abs : (I)I
    //   3309: invokevirtual charAt : (I)C
    //   3312: getstatic burp/Zer1.ZV : Ljava/lang/String;
    //   3315: getstatic burp/Zkcd.ZE : Ljava/lang/Object;
    //   3318: checkcast java/math/BigInteger
    //   3321: invokevirtual intValue : ()I
    //   3324: bipush #32
    //   3326: irem
    //   3327: invokestatic abs : (I)I
    //   3330: invokevirtual charAt : (I)C
    //   3333: if_icmpgt -> 3351
    //   3336: goto -> 3343
    //   3339: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3342: athrow
    //   3343: iconst_1
    //   3344: goto -> 3352
    //   3347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3350: athrow
    //   3351: iconst_0
    //   3352: ireturn
    //   3353: astore_3
    //   3354: new java/lang/Exception
    //   3357: dup
    //   3358: aload_3
    //   3359: invokevirtual getMessage : ()Ljava/lang/String;
    //   3362: invokespecial <init> : (Ljava/lang/String;)V
    //   3365: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3352	3353	java/lang/Throwable
    //   185	200	200	java/lang/Throwable
    //   1202	1228	1228	java/lang/Throwable
    //   1309	1324	1324	java/lang/Throwable
    //   2506	2531	2534	java/lang/Throwable
    //   2599	2613	2613	java/lang/Throwable
    //   2624	2637	2640	java/lang/Throwable
    //   2629	2652	2655	java/lang/Throwable
    //   2644	2670	2673	java/lang/Throwable
    //   2659	2700	2703	java/lang/Throwable
    //   2763	2790	2793	java/lang/Throwable
    //   2780	2808	2811	java/lang/Throwable
    //   2797	2844	2847	java/lang/Throwable
    //   2815	2858	2861	java/lang/Throwable
    //   2907	2921	2921	java/lang/Throwable
    //   2932	2945	2948	java/lang/Throwable
    //   2937	2960	2963	java/lang/Throwable
    //   2952	2978	2981	java/lang/Throwable
    //   2967	3008	3011	java/lang/Throwable
    //   3071	3098	3101	java/lang/Throwable
    //   3088	3119	3122	java/lang/Throwable
    //   3105	3149	3152	java/lang/Throwable
    //   3126	3160	3160	java/lang/Throwable
    //   3171	3187	3190	java/lang/Throwable
    //   3194	3284	3287	java/lang/Throwable
    //   3239	3336	3339	java/lang/Throwable
    //   3291	3347	3347	java/lang/Throwable
  }
  
  static void Zs(Object paramObject) {
    Zvk.ZG = a(13229, -15311);
    Zvk.ZN = new BigInteger(a(13230, 1419));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zgds.ZA.charAt(Math.abs(((BigInteger)Zb0s.Zv).intValue() % 32)) > Zls0.ZI.charAt(Math.abs(((BigInteger)Zrpm.ZR).intValue() % 32))) {
          try {
            Zxo4.Zf(Class.forName(a(13222, 14207)));
            if (bool)
              Zex.ZZ(Class.forName(a(13223, -14511))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zex.ZZ(Class.forName(a(13223, -14511)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '揁睵潉ェ杰ﺮꯔ쪰짡磌䝽규ꉂ鲓爘뜁鏋㘾㐖燁㇍Њ⎮ᣧ՘݈胪늠ऻⳚ᭖婀劘횱⦚⼔匒×₷넻櫠빘䪁壕킶ꪕ䍃㌍䕃ʈ傝龅光䁈鋝㢴뱀?ျ춡Ꮃ弘䑳쓎縊搵ᥢ息侻∕邷䚏뢙?ீ㫑䤖⒁숵걏鄤㜥趩丯泆攈깹멃▤ᱛ둳瑙䯷譒灦딕䣼懿圂蚢᷼頉楶躰魑蟶츎⠷豕襱뿯䊉䅑ⷷ뀶믌\\t}®MHØ";揠眨濢〣朅︾ꭺ쪢줴﫩䟇궔ꈕ鲚狲뜠鎖㘚㒒煑ㅣИ⍻ᢥע܀肽뉊चⲇ᭲嫫刜후⤊⾺匀⃵놁檨븏䪈堿킗꫈䍧㎦䗇˽倍鼫兛䂝銟㠎밈?ဲ춀Ꮾ弼䓘쑊繿撥᧌恽佮≗逍䛇룎?ପ㪌䤲␪슱갺醴㟰跫井沎攁꺓멢◹᱿듘琬䭧诼灴뗀䢾憷坕蚫ᴖ顔楒踛鯕螃캞⢙豇覤뾭䈳䄙ⶠ뀿묦\\t¾üH\\bn\\tBqÕ_ËµMÿ@Ë¹\\boo>I´®½dÇúZä¼¼jf¸ø²-Ô×òñ®÷¶ñ¹:"ç3 j»Âzó.TIï~à#æ}°® è\\bj+ ¯»ª9¿üJ<ðþ¦¹".|Ûk©ìó $GÞZIÐ$¿ìËu8Y<müá®ÎFh¿­£&Óµ;4vòé?ùñ¡¢)¤n\\tºôX\\tqÌ~èä=YÒ1Äü'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #128
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #16
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 144
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc '\\b N·0K\\tü&¯V,_·'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #8
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #109
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zlp8.a : [Ljava/lang/String;
    //   133: bipush #14
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zlp8.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #126
    //   214: goto -> 244
    //   217: bipush #123
    //   219: goto -> 244
    //   222: bipush #99
    //   224: goto -> 244
    //   227: bipush #75
    //   229: goto -> 244
    //   232: bipush #29
    //   234: goto -> 244
    //   237: bipush #116
    //   239: goto -> 244
    //   242: bipush #29
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 41, 0 -> 100
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #56
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #10
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #94
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-30
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #57
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #52
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: iconst_m1
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #121
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-91
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #80
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-128
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-64
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #73
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-97
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #33
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #125
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-3
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: iconst_1
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #-22
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #-113
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #-105
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #-28
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #-126
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #119
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #-61
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #12
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #-111
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #29
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #-30
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-75
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #11
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #71
    //   492: bastore
    //   493: invokespecial <init> : (I[B)V
    //   496: putstatic burp/Zlp8.Zu : Ljava/lang/Object;
    //   499: sipush #13219
    //   502: sipush #1643
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zlp8.ZW : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x33AB) & 0xFFFF;
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
      byte b1 = 89;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlp8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */