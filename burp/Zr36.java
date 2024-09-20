package burp;

import java.math.BigInteger;

class Zr36 extends ClassLoader {
  static String Ze;
  
  static Object Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZQ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Ze25.ZW : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zedq.Zy : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ze2k.ZK : Ljava/lang/Object;
    //   22: new java/io/ByteArrayOutputStream
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore_3
    //   30: getstatic burp/Zsn9.Zp : Ljava/lang/String;
    //   33: astore #4
    //   35: iconst_0
    //   36: istore #5
    //   38: iload #5
    //   40: aload #4
    //   42: invokevirtual length : ()I
    //   45: if_icmpge -> 75
    //   48: aload_3
    //   49: aload #4
    //   51: iload #5
    //   53: iload #5
    //   55: iconst_2
    //   56: iadd
    //   57: invokevirtual substring : (II)Ljava/lang/String;
    //   60: bipush #16
    //   62: invokestatic parseInt : (Ljava/lang/String;I)I
    //   65: invokevirtual write : (I)V
    //   68: iinc #5, 2
    //   71: iload_2
    //   72: ifne -> 38
    //   75: aload_3
    //   76: invokevirtual toByteArray : ()[B
    //   79: astore #5
    //   81: getstatic burp/Zeqx.Zh : Ljava/lang/Object;
    //   84: checkcast java/math/BigInteger
    //   87: invokevirtual toByteArray : ()[B
    //   90: astore #6
    //   92: sipush #256
    //   95: newarray byte
    //   97: astore #8
    //   99: sipush #256
    //   102: newarray int
    //   104: astore #9
    //   106: sipush #256
    //   109: newarray int
    //   111: astore #10
    //   113: sipush #256
    //   116: newarray int
    //   118: astore #11
    //   120: sipush #256
    //   123: newarray int
    //   125: astore #12
    //   127: bipush #10
    //   129: newarray int
    //   131: astore #13
    //   133: sipush #283
    //   136: istore #14
    //   138: iconst_0
    //   139: istore #16
    //   141: iload #16
    //   143: sipush #256
    //   146: if_icmpge -> 380
    //   149: sipush #-16422
    //   152: sipush #-29870
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: iload #16
    //   160: iconst_1
    //   161: iushr
    //   162: invokevirtual charAt : (I)C
    //   165: istore #25
    //   167: iload #16
    //   169: iconst_1
    //   170: iand
    //   171: ifne -> 186
    //   174: iload #25
    //   176: bipush #8
    //   178: iushr
    //   179: goto -> 188
    //   182: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   185: athrow
    //   186: iload #25
    //   188: i2b
    //   189: sipush #255
    //   192: iand
    //   193: istore #15
    //   195: iload #16
    //   197: iconst_1
    //   198: ishl
    //   199: istore #17
    //   201: iload #17
    //   203: sipush #256
    //   206: if_icmplt -> 216
    //   209: iload #17
    //   211: iload #14
    //   213: ixor
    //   214: istore #17
    //   216: iload #17
    //   218: iconst_1
    //   219: ishl
    //   220: istore #18
    //   222: iload #18
    //   224: sipush #256
    //   227: if_icmplt -> 237
    //   230: iload #18
    //   232: iload #14
    //   234: ixor
    //   235: istore #18
    //   237: iload #18
    //   239: iconst_1
    //   240: ishl
    //   241: istore #19
    //   243: iload #19
    //   245: sipush #256
    //   248: if_icmplt -> 258
    //   251: iload #19
    //   253: iload #14
    //   255: ixor
    //   256: istore #19
    //   258: iload #19
    //   260: iload #16
    //   262: ixor
    //   263: istore #20
    //   265: iload #20
    //   267: iload #17
    //   269: ixor
    //   270: istore #21
    //   272: iload #20
    //   274: iload #18
    //   276: ixor
    //   277: istore #22
    //   279: iload #19
    //   281: iload #18
    //   283: ixor
    //   284: iload #17
    //   286: ixor
    //   287: istore #23
    //   289: aload #8
    //   291: iload #16
    //   293: iload #15
    //   295: i2b
    //   296: bastore
    //   297: aload #9
    //   299: iload #15
    //   301: iload #23
    //   303: bipush #24
    //   305: ishl
    //   306: iload #20
    //   308: bipush #16
    //   310: ishl
    //   311: ior
    //   312: iload #22
    //   314: bipush #8
    //   316: ishl
    //   317: ior
    //   318: iload #21
    //   320: ior
    //   321: dup
    //   322: istore #24
    //   324: iastore
    //   325: aload #10
    //   327: iload #15
    //   329: iload #24
    //   331: bipush #8
    //   333: iushr
    //   334: iload #24
    //   336: bipush #24
    //   338: ishl
    //   339: ior
    //   340: iastore
    //   341: aload #11
    //   343: iload #15
    //   345: iload #24
    //   347: bipush #16
    //   349: iushr
    //   350: iload #24
    //   352: bipush #16
    //   354: ishl
    //   355: ior
    //   356: iastore
    //   357: aload #12
    //   359: iload #15
    //   361: iload #24
    //   363: bipush #24
    //   365: iushr
    //   366: iload #24
    //   368: bipush #8
    //   370: ishl
    //   371: ior
    //   372: iastore
    //   373: iinc #16, 1
    //   376: iload_2
    //   377: ifne -> 141
    //   380: iconst_1
    //   381: istore #25
    //   383: aload #13
    //   385: iconst_0
    //   386: iload #25
    //   388: bipush #24
    //   390: ishl
    //   391: iastore
    //   392: iconst_1
    //   393: istore #26
    //   395: iload #26
    //   397: bipush #10
    //   399: if_icmpge -> 440
    //   402: iload #25
    //   404: iconst_1
    //   405: ishl
    //   406: istore #25
    //   408: iload #25
    //   410: sipush #256
    //   413: if_icmplt -> 423
    //   416: iload #25
    //   418: iload #14
    //   420: ixor
    //   421: istore #25
    //   423: aload #13
    //   425: iload #26
    //   427: iload #25
    //   429: bipush #24
    //   431: ishl
    //   432: iastore
    //   433: iinc #26, 1
    //   436: iload_2
    //   437: ifne -> 395
    //   440: iconst_4
    //   441: istore #26
    //   443: iload #26
    //   445: bipush #6
    //   447: iadd
    //   448: istore #27
    //   450: iconst_4
    //   451: iload #27
    //   453: iconst_1
    //   454: iadd
    //   455: imul
    //   456: istore #28
    //   458: iload #28
    //   460: newarray int
    //   462: astore #29
    //   464: iload #28
    //   466: newarray int
    //   468: astore #30
    //   470: iconst_0
    //   471: istore #25
    //   473: iconst_0
    //   474: istore #32
    //   476: iconst_0
    //   477: istore #33
    //   479: iload #32
    //   481: iload #26
    //   483: if_icmpge -> 551
    //   486: aload #29
    //   488: iload #32
    //   490: aload #5
    //   492: iload #33
    //   494: baload
    //   495: bipush #24
    //   497: ishl
    //   498: aload #5
    //   500: iload #33
    //   502: iconst_1
    //   503: iadd
    //   504: baload
    //   505: sipush #255
    //   508: iand
    //   509: bipush #16
    //   511: ishl
    //   512: ior
    //   513: aload #5
    //   515: iload #33
    //   517: iconst_2
    //   518: iadd
    //   519: baload
    //   520: sipush #255
    //   523: iand
    //   524: bipush #8
    //   526: ishl
    //   527: ior
    //   528: aload #5
    //   530: iload #33
    //   532: iconst_3
    //   533: iadd
    //   534: baload
    //   535: sipush #255
    //   538: iand
    //   539: ior
    //   540: iastore
    //   541: iinc #32, 1
    //   544: iinc #33, 4
    //   547: iload_2
    //   548: ifne -> 479
    //   551: iload #26
    //   553: istore #32
    //   555: iconst_0
    //   556: istore #33
    //   558: iload #32
    //   560: iload #28
    //   562: if_icmpge -> 689
    //   565: aload #29
    //   567: iload #32
    //   569: iconst_1
    //   570: isub
    //   571: iaload
    //   572: istore #31
    //   574: iload #33
    //   576: ifne -> 663
    //   579: iload #26
    //   581: istore #33
    //   583: aload #8
    //   585: iload #31
    //   587: bipush #16
    //   589: iushr
    //   590: sipush #255
    //   593: iand
    //   594: baload
    //   595: bipush #24
    //   597: ishl
    //   598: aload #8
    //   600: iload #31
    //   602: bipush #8
    //   604: iushr
    //   605: sipush #255
    //   608: iand
    //   609: baload
    //   610: sipush #255
    //   613: iand
    //   614: bipush #16
    //   616: ishl
    //   617: ior
    //   618: aload #8
    //   620: iload #31
    //   622: sipush #255
    //   625: iand
    //   626: baload
    //   627: sipush #255
    //   630: iand
    //   631: bipush #8
    //   633: ishl
    //   634: ior
    //   635: aload #8
    //   637: iload #31
    //   639: bipush #24
    //   641: iushr
    //   642: baload
    //   643: sipush #255
    //   646: iand
    //   647: ior
    //   648: istore #31
    //   650: iload #31
    //   652: aload #13
    //   654: iload #25
    //   656: iinc #25, 1
    //   659: iaload
    //   660: ixor
    //   661: istore #31
    //   663: aload #29
    //   665: iload #32
    //   667: aload #29
    //   669: iload #32
    //   671: iload #26
    //   673: isub
    //   674: iaload
    //   675: iload #31
    //   677: ixor
    //   678: iastore
    //   679: iinc #32, 1
    //   682: iinc #33, -1
    //   685: iload_2
    //   686: ifne -> 558
    //   689: iconst_0
    //   690: istore #32
    //   692: iconst_4
    //   693: iload #27
    //   695: imul
    //   696: istore #33
    //   698: aload #30
    //   700: iload #32
    //   702: aload #29
    //   704: iload #33
    //   706: iaload
    //   707: iastore
    //   708: aload #30
    //   710: iload #32
    //   712: iconst_1
    //   713: iadd
    //   714: aload #29
    //   716: iload #33
    //   718: iconst_1
    //   719: iadd
    //   720: iaload
    //   721: iastore
    //   722: aload #30
    //   724: iload #32
    //   726: iconst_2
    //   727: iadd
    //   728: aload #29
    //   730: iload #33
    //   732: iconst_2
    //   733: iadd
    //   734: iaload
    //   735: iastore
    //   736: aload #30
    //   738: iload #32
    //   740: iconst_3
    //   741: iadd
    //   742: aload #29
    //   744: iload #33
    //   746: iconst_3
    //   747: iadd
    //   748: iaload
    //   749: iastore
    //   750: iinc #32, 4
    //   753: iinc #33, -4
    //   756: iconst_1
    //   757: istore #35
    //   759: iload #35
    //   761: iload #27
    //   763: if_icmpge -> 1127
    //   766: aload #29
    //   768: iload #33
    //   770: iaload
    //   771: istore #34
    //   773: aload #30
    //   775: iload #32
    //   777: aload #9
    //   779: aload #8
    //   781: iload #34
    //   783: bipush #24
    //   785: iushr
    //   786: baload
    //   787: sipush #255
    //   790: iand
    //   791: iaload
    //   792: aload #10
    //   794: aload #8
    //   796: iload #34
    //   798: bipush #16
    //   800: iushr
    //   801: sipush #255
    //   804: iand
    //   805: baload
    //   806: sipush #255
    //   809: iand
    //   810: iaload
    //   811: ixor
    //   812: aload #11
    //   814: aload #8
    //   816: iload #34
    //   818: bipush #8
    //   820: iushr
    //   821: sipush #255
    //   824: iand
    //   825: baload
    //   826: sipush #255
    //   829: iand
    //   830: iaload
    //   831: ixor
    //   832: aload #12
    //   834: aload #8
    //   836: iload #34
    //   838: sipush #255
    //   841: iand
    //   842: baload
    //   843: sipush #255
    //   846: iand
    //   847: iaload
    //   848: ixor
    //   849: iastore
    //   850: aload #29
    //   852: iload #33
    //   854: iconst_1
    //   855: iadd
    //   856: iaload
    //   857: istore #34
    //   859: aload #30
    //   861: iload #32
    //   863: iconst_1
    //   864: iadd
    //   865: aload #9
    //   867: aload #8
    //   869: iload #34
    //   871: bipush #24
    //   873: iushr
    //   874: baload
    //   875: sipush #255
    //   878: iand
    //   879: iaload
    //   880: aload #10
    //   882: aload #8
    //   884: iload #34
    //   886: bipush #16
    //   888: iushr
    //   889: sipush #255
    //   892: iand
    //   893: baload
    //   894: sipush #255
    //   897: iand
    //   898: iaload
    //   899: ixor
    //   900: aload #11
    //   902: aload #8
    //   904: iload #34
    //   906: bipush #8
    //   908: iushr
    //   909: sipush #255
    //   912: iand
    //   913: baload
    //   914: sipush #255
    //   917: iand
    //   918: iaload
    //   919: ixor
    //   920: aload #12
    //   922: aload #8
    //   924: iload #34
    //   926: sipush #255
    //   929: iand
    //   930: baload
    //   931: sipush #255
    //   934: iand
    //   935: iaload
    //   936: ixor
    //   937: iastore
    //   938: aload #29
    //   940: iload #33
    //   942: iconst_2
    //   943: iadd
    //   944: iaload
    //   945: istore #34
    //   947: aload #30
    //   949: iload #32
    //   951: iconst_2
    //   952: iadd
    //   953: aload #9
    //   955: aload #8
    //   957: iload #34
    //   959: bipush #24
    //   961: iushr
    //   962: baload
    //   963: sipush #255
    //   966: iand
    //   967: iaload
    //   968: aload #10
    //   970: aload #8
    //   972: iload #34
    //   974: bipush #16
    //   976: iushr
    //   977: sipush #255
    //   980: iand
    //   981: baload
    //   982: sipush #255
    //   985: iand
    //   986: iaload
    //   987: ixor
    //   988: aload #11
    //   990: aload #8
    //   992: iload #34
    //   994: bipush #8
    //   996: iushr
    //   997: sipush #255
    //   1000: iand
    //   1001: baload
    //   1002: sipush #255
    //   1005: iand
    //   1006: iaload
    //   1007: ixor
    //   1008: aload #12
    //   1010: aload #8
    //   1012: iload #34
    //   1014: sipush #255
    //   1017: iand
    //   1018: baload
    //   1019: sipush #255
    //   1022: iand
    //   1023: iaload
    //   1024: ixor
    //   1025: iastore
    //   1026: aload #29
    //   1028: iload #33
    //   1030: iconst_3
    //   1031: iadd
    //   1032: iaload
    //   1033: istore #34
    //   1035: aload #30
    //   1037: iload #32
    //   1039: iconst_3
    //   1040: iadd
    //   1041: aload #9
    //   1043: aload #8
    //   1045: iload #34
    //   1047: bipush #24
    //   1049: iushr
    //   1050: baload
    //   1051: sipush #255
    //   1054: iand
    //   1055: iaload
    //   1056: aload #10
    //   1058: aload #8
    //   1060: iload #34
    //   1062: bipush #16
    //   1064: iushr
    //   1065: sipush #255
    //   1068: iand
    //   1069: baload
    //   1070: sipush #255
    //   1073: iand
    //   1074: iaload
    //   1075: ixor
    //   1076: aload #11
    //   1078: aload #8
    //   1080: iload #34
    //   1082: bipush #8
    //   1084: iushr
    //   1085: sipush #255
    //   1088: iand
    //   1089: baload
    //   1090: sipush #255
    //   1093: iand
    //   1094: iaload
    //   1095: ixor
    //   1096: aload #12
    //   1098: aload #8
    //   1100: iload #34
    //   1102: sipush #255
    //   1105: iand
    //   1106: baload
    //   1107: sipush #255
    //   1110: iand
    //   1111: iaload
    //   1112: ixor
    //   1113: iastore
    //   1114: iinc #32, 4
    //   1117: iinc #33, -4
    //   1120: iinc #35, 1
    //   1123: iload_2
    //   1124: ifne -> 759
    //   1127: aload #30
    //   1129: iload #32
    //   1131: aload #29
    //   1133: iload #33
    //   1135: iaload
    //   1136: iastore
    //   1137: aload #30
    //   1139: iload #32
    //   1141: iconst_1
    //   1142: iadd
    //   1143: aload #29
    //   1145: iload #33
    //   1147: iconst_1
    //   1148: iadd
    //   1149: iaload
    //   1150: iastore
    //   1151: aload #30
    //   1153: iload #32
    //   1155: iconst_2
    //   1156: iadd
    //   1157: aload #29
    //   1159: iload #33
    //   1161: iconst_2
    //   1162: iadd
    //   1163: iaload
    //   1164: iastore
    //   1165: aload #30
    //   1167: iload #32
    //   1169: iconst_3
    //   1170: iadd
    //   1171: aload #29
    //   1173: iload #33
    //   1175: iconst_3
    //   1176: iadd
    //   1177: iaload
    //   1178: iastore
    //   1179: iconst_0
    //   1180: newarray byte
    //   1182: astore #35
    //   1184: aload #6
    //   1186: arraylength
    //   1187: bipush #16
    //   1189: irem
    //   1190: ifeq -> 1214
    //   1193: new java/lang/Exception
    //   1196: dup
    //   1197: sipush #-16419
    //   1200: sipush #2054
    //   1203: invokestatic a : (II)Ljava/lang/String;
    //   1206: invokespecial <init> : (Ljava/lang/String;)V
    //   1209: athrow
    //   1210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1213: athrow
    //   1214: bipush #10
    //   1216: istore #36
    //   1218: sipush #-16447
    //   1221: sipush #256
    //   1224: newarray byte
    //   1226: astore #37
    //   1228: sipush #-6941
    //   1231: sipush #256
    //   1234: newarray int
    //   1236: astore #38
    //   1238: sipush #256
    //   1241: newarray int
    //   1243: astore #39
    //   1245: sipush #256
    //   1248: newarray int
    //   1250: astore #40
    //   1252: sipush #256
    //   1255: newarray int
    //   1257: astore #41
    //   1259: sipush #283
    //   1262: istore #14
    //   1264: invokestatic a : (II)Ljava/lang/String;
    //   1267: astore #42
    //   1269: iconst_0
    //   1270: istore #16
    //   1272: iload #16
    //   1274: sipush #256
    //   1277: if_icmpge -> 1504
    //   1280: aload #42
    //   1282: iload #16
    //   1284: iconst_1
    //   1285: iushr
    //   1286: invokevirtual charAt : (I)C
    //   1289: istore #43
    //   1291: iload #16
    //   1293: iconst_1
    //   1294: iand
    //   1295: ifne -> 1310
    //   1298: iload #43
    //   1300: bipush #8
    //   1302: iushr
    //   1303: goto -> 1312
    //   1306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1309: athrow
    //   1310: iload #43
    //   1312: i2b
    //   1313: sipush #255
    //   1316: iand
    //   1317: istore #15
    //   1319: iload #16
    //   1321: iconst_1
    //   1322: ishl
    //   1323: istore #17
    //   1325: iload #17
    //   1327: sipush #256
    //   1330: if_icmplt -> 1340
    //   1333: iload #17
    //   1335: iload #14
    //   1337: ixor
    //   1338: istore #17
    //   1340: iload #17
    //   1342: iconst_1
    //   1343: ishl
    //   1344: istore #18
    //   1346: iload #18
    //   1348: sipush #256
    //   1351: if_icmplt -> 1361
    //   1354: iload #18
    //   1356: iload #14
    //   1358: ixor
    //   1359: istore #18
    //   1361: iload #18
    //   1363: iconst_1
    //   1364: ishl
    //   1365: istore #19
    //   1367: iload #19
    //   1369: sipush #256
    //   1372: if_icmplt -> 1382
    //   1375: iload #19
    //   1377: iload #14
    //   1379: ixor
    //   1380: istore #19
    //   1382: iload #19
    //   1384: iload #16
    //   1386: ixor
    //   1387: istore #20
    //   1389: iload #20
    //   1391: iload #17
    //   1393: ixor
    //   1394: istore #21
    //   1396: iload #20
    //   1398: iload #18
    //   1400: ixor
    //   1401: istore #22
    //   1403: iload #19
    //   1405: iload #18
    //   1407: ixor
    //   1408: iload #17
    //   1410: ixor
    //   1411: istore #23
    //   1413: aload #37
    //   1415: iload #15
    //   1417: iload #16
    //   1419: i2b
    //   1420: bastore
    //   1421: aload #38
    //   1423: iload #15
    //   1425: iload #23
    //   1427: bipush #24
    //   1429: ishl
    //   1430: iload #20
    //   1432: bipush #16
    //   1434: ishl
    //   1435: ior
    //   1436: iload #22
    //   1438: bipush #8
    //   1440: ishl
    //   1441: ior
    //   1442: iload #21
    //   1444: ior
    //   1445: dup
    //   1446: istore #24
    //   1448: iastore
    //   1449: aload #39
    //   1451: iload #15
    //   1453: iload #24
    //   1455: bipush #8
    //   1457: iushr
    //   1458: iload #24
    //   1460: bipush #24
    //   1462: ishl
    //   1463: ior
    //   1464: iastore
    //   1465: aload #40
    //   1467: iload #15
    //   1469: iload #24
    //   1471: bipush #16
    //   1473: iushr
    //   1474: iload #24
    //   1476: bipush #16
    //   1478: ishl
    //   1479: ior
    //   1480: iastore
    //   1481: aload #41
    //   1483: iload #15
    //   1485: iload #24
    //   1487: bipush #24
    //   1489: iushr
    //   1490: iload #24
    //   1492: bipush #8
    //   1494: ishl
    //   1495: ior
    //   1496: iastore
    //   1497: iinc #16, 1
    //   1500: iload_2
    //   1501: ifne -> 1272
    //   1504: aload #6
    //   1506: arraylength
    //   1507: newarray byte
    //   1509: astore #43
    //   1511: iconst_0
    //   1512: istore #44
    //   1514: iload #44
    //   1516: aload #6
    //   1518: arraylength
    //   1519: bipush #16
    //   1521: idiv
    //   1522: if_icmpge -> 2436
    //   1525: bipush #16
    //   1527: newarray byte
    //   1529: astore #45
    //   1531: bipush #16
    //   1533: newarray byte
    //   1535: astore #46
    //   1537: iconst_0
    //   1538: istore #47
    //   1540: iload #47
    //   1542: bipush #16
    //   1544: if_icmpge -> 1570
    //   1547: aload #45
    //   1549: iload #47
    //   1551: aload #6
    //   1553: iload #47
    //   1555: iload #44
    //   1557: bipush #16
    //   1559: imul
    //   1560: iadd
    //   1561: baload
    //   1562: bastore
    //   1563: iinc #47, 1
    //   1566: iload_2
    //   1567: ifne -> 1540
    //   1570: iconst_0
    //   1571: istore #47
    //   1573: aload #45
    //   1575: iconst_0
    //   1576: baload
    //   1577: bipush #24
    //   1579: ishl
    //   1580: aload #45
    //   1582: iconst_1
    //   1583: baload
    //   1584: sipush #255
    //   1587: iand
    //   1588: bipush #16
    //   1590: ishl
    //   1591: ior
    //   1592: aload #45
    //   1594: iconst_2
    //   1595: baload
    //   1596: sipush #255
    //   1599: iand
    //   1600: bipush #8
    //   1602: ishl
    //   1603: ior
    //   1604: aload #45
    //   1606: iconst_3
    //   1607: baload
    //   1608: sipush #255
    //   1611: iand
    //   1612: ior
    //   1613: aload #30
    //   1615: iconst_0
    //   1616: iaload
    //   1617: ixor
    //   1618: istore #49
    //   1620: aload #45
    //   1622: iconst_4
    //   1623: baload
    //   1624: bipush #24
    //   1626: ishl
    //   1627: aload #45
    //   1629: iconst_5
    //   1630: baload
    //   1631: sipush #255
    //   1634: iand
    //   1635: bipush #16
    //   1637: ishl
    //   1638: ior
    //   1639: aload #45
    //   1641: bipush #6
    //   1643: baload
    //   1644: sipush #255
    //   1647: iand
    //   1648: bipush #8
    //   1650: ishl
    //   1651: ior
    //   1652: aload #45
    //   1654: bipush #7
    //   1656: baload
    //   1657: sipush #255
    //   1660: iand
    //   1661: ior
    //   1662: aload #30
    //   1664: iconst_1
    //   1665: iaload
    //   1666: ixor
    //   1667: istore #50
    //   1669: aload #45
    //   1671: bipush #8
    //   1673: baload
    //   1674: bipush #24
    //   1676: ishl
    //   1677: aload #45
    //   1679: bipush #9
    //   1681: baload
    //   1682: sipush #255
    //   1685: iand
    //   1686: bipush #16
    //   1688: ishl
    //   1689: ior
    //   1690: aload #45
    //   1692: bipush #10
    //   1694: baload
    //   1695: sipush #255
    //   1698: iand
    //   1699: bipush #8
    //   1701: ishl
    //   1702: ior
    //   1703: aload #45
    //   1705: bipush #11
    //   1707: baload
    //   1708: sipush #255
    //   1711: iand
    //   1712: ior
    //   1713: aload #30
    //   1715: iconst_2
    //   1716: iaload
    //   1717: ixor
    //   1718: istore #51
    //   1720: aload #45
    //   1722: bipush #12
    //   1724: baload
    //   1725: bipush #24
    //   1727: ishl
    //   1728: aload #45
    //   1730: bipush #13
    //   1732: baload
    //   1733: sipush #255
    //   1736: iand
    //   1737: bipush #16
    //   1739: ishl
    //   1740: ior
    //   1741: aload #45
    //   1743: bipush #14
    //   1745: baload
    //   1746: sipush #255
    //   1749: iand
    //   1750: bipush #8
    //   1752: ishl
    //   1753: ior
    //   1754: aload #45
    //   1756: bipush #15
    //   1758: baload
    //   1759: sipush #255
    //   1762: iand
    //   1763: ior
    //   1764: aload #30
    //   1766: iconst_3
    //   1767: iaload
    //   1768: ixor
    //   1769: istore #52
    //   1771: iconst_1
    //   1772: istore #53
    //   1774: iload #53
    //   1776: iload #36
    //   1778: if_icmpge -> 2021
    //   1781: iinc #47, 4
    //   1784: aload #38
    //   1786: iload #49
    //   1788: bipush #24
    //   1790: iushr
    //   1791: iaload
    //   1792: aload #39
    //   1794: iload #52
    //   1796: bipush #16
    //   1798: iushr
    //   1799: sipush #255
    //   1802: iand
    //   1803: iaload
    //   1804: ixor
    //   1805: aload #40
    //   1807: iload #51
    //   1809: bipush #8
    //   1811: iushr
    //   1812: sipush #255
    //   1815: iand
    //   1816: iaload
    //   1817: ixor
    //   1818: aload #41
    //   1820: iload #50
    //   1822: sipush #255
    //   1825: iand
    //   1826: iaload
    //   1827: ixor
    //   1828: aload #30
    //   1830: iload #47
    //   1832: iaload
    //   1833: ixor
    //   1834: istore #54
    //   1836: aload #38
    //   1838: iload #50
    //   1840: bipush #24
    //   1842: iushr
    //   1843: iaload
    //   1844: aload #39
    //   1846: iload #49
    //   1848: bipush #16
    //   1850: iushr
    //   1851: sipush #255
    //   1854: iand
    //   1855: iaload
    //   1856: ixor
    //   1857: aload #40
    //   1859: iload #52
    //   1861: bipush #8
    //   1863: iushr
    //   1864: sipush #255
    //   1867: iand
    //   1868: iaload
    //   1869: ixor
    //   1870: aload #41
    //   1872: iload #51
    //   1874: sipush #255
    //   1877: iand
    //   1878: iaload
    //   1879: ixor
    //   1880: aload #30
    //   1882: iload #47
    //   1884: iconst_1
    //   1885: iadd
    //   1886: iaload
    //   1887: ixor
    //   1888: istore #55
    //   1890: aload #38
    //   1892: iload #51
    //   1894: bipush #24
    //   1896: iushr
    //   1897: iaload
    //   1898: aload #39
    //   1900: iload #50
    //   1902: bipush #16
    //   1904: iushr
    //   1905: sipush #255
    //   1908: iand
    //   1909: iaload
    //   1910: ixor
    //   1911: aload #40
    //   1913: iload #49
    //   1915: bipush #8
    //   1917: iushr
    //   1918: sipush #255
    //   1921: iand
    //   1922: iaload
    //   1923: ixor
    //   1924: aload #41
    //   1926: iload #52
    //   1928: sipush #255
    //   1931: iand
    //   1932: iaload
    //   1933: ixor
    //   1934: aload #30
    //   1936: iload #47
    //   1938: iconst_2
    //   1939: iadd
    //   1940: iaload
    //   1941: ixor
    //   1942: istore #56
    //   1944: aload #38
    //   1946: iload #52
    //   1948: bipush #24
    //   1950: iushr
    //   1951: iaload
    //   1952: aload #39
    //   1954: iload #51
    //   1956: bipush #16
    //   1958: iushr
    //   1959: sipush #255
    //   1962: iand
    //   1963: iaload
    //   1964: ixor
    //   1965: aload #40
    //   1967: iload #50
    //   1969: bipush #8
    //   1971: iushr
    //   1972: sipush #255
    //   1975: iand
    //   1976: iaload
    //   1977: ixor
    //   1978: aload #41
    //   1980: iload #49
    //   1982: sipush #255
    //   1985: iand
    //   1986: iaload
    //   1987: ixor
    //   1988: aload #30
    //   1990: iload #47
    //   1992: iconst_3
    //   1993: iadd
    //   1994: iaload
    //   1995: ixor
    //   1996: istore #57
    //   1998: iload #54
    //   2000: istore #49
    //   2002: iload #55
    //   2004: istore #50
    //   2006: iload #56
    //   2008: istore #51
    //   2010: iload #57
    //   2012: istore #52
    //   2014: iinc #53, 1
    //   2017: iload_2
    //   2018: ifne -> 1774
    //   2021: iinc #47, 4
    //   2024: aload #30
    //   2026: iload #47
    //   2028: iaload
    //   2029: istore #48
    //   2031: aload #46
    //   2033: iconst_0
    //   2034: aload #37
    //   2036: iload #49
    //   2038: bipush #24
    //   2040: iushr
    //   2041: baload
    //   2042: iload #48
    //   2044: bipush #24
    //   2046: iushr
    //   2047: ixor
    //   2048: i2b
    //   2049: bastore
    //   2050: aload #46
    //   2052: iconst_1
    //   2053: aload #37
    //   2055: iload #52
    //   2057: bipush #16
    //   2059: iushr
    //   2060: sipush #255
    //   2063: iand
    //   2064: baload
    //   2065: iload #48
    //   2067: bipush #16
    //   2069: iushr
    //   2070: ixor
    //   2071: i2b
    //   2072: bastore
    //   2073: aload #46
    //   2075: iconst_2
    //   2076: aload #37
    //   2078: iload #51
    //   2080: bipush #8
    //   2082: iushr
    //   2083: sipush #255
    //   2086: iand
    //   2087: baload
    //   2088: iload #48
    //   2090: bipush #8
    //   2092: iushr
    //   2093: ixor
    //   2094: i2b
    //   2095: bastore
    //   2096: aload #46
    //   2098: iconst_3
    //   2099: aload #37
    //   2101: iload #50
    //   2103: sipush #255
    //   2106: iand
    //   2107: baload
    //   2108: iload #48
    //   2110: ixor
    //   2111: i2b
    //   2112: bastore
    //   2113: aload #30
    //   2115: iload #47
    //   2117: iconst_1
    //   2118: iadd
    //   2119: iaload
    //   2120: istore #48
    //   2122: aload #46
    //   2124: iconst_4
    //   2125: aload #37
    //   2127: iload #50
    //   2129: bipush #24
    //   2131: iushr
    //   2132: baload
    //   2133: iload #48
    //   2135: bipush #24
    //   2137: iushr
    //   2138: ixor
    //   2139: i2b
    //   2140: bastore
    //   2141: aload #46
    //   2143: iconst_5
    //   2144: aload #37
    //   2146: iload #49
    //   2148: bipush #16
    //   2150: iushr
    //   2151: sipush #255
    //   2154: iand
    //   2155: baload
    //   2156: iload #48
    //   2158: bipush #16
    //   2160: iushr
    //   2161: ixor
    //   2162: i2b
    //   2163: bastore
    //   2164: aload #46
    //   2166: bipush #6
    //   2168: aload #37
    //   2170: iload #52
    //   2172: bipush #8
    //   2174: iushr
    //   2175: sipush #255
    //   2178: iand
    //   2179: baload
    //   2180: iload #48
    //   2182: bipush #8
    //   2184: iushr
    //   2185: ixor
    //   2186: i2b
    //   2187: bastore
    //   2188: aload #46
    //   2190: bipush #7
    //   2192: aload #37
    //   2194: iload #51
    //   2196: sipush #255
    //   2199: iand
    //   2200: baload
    //   2201: iload #48
    //   2203: ixor
    //   2204: i2b
    //   2205: bastore
    //   2206: aload #30
    //   2208: iload #47
    //   2210: iconst_2
    //   2211: iadd
    //   2212: iaload
    //   2213: istore #48
    //   2215: aload #46
    //   2217: bipush #8
    //   2219: aload #37
    //   2221: iload #51
    //   2223: bipush #24
    //   2225: iushr
    //   2226: baload
    //   2227: iload #48
    //   2229: bipush #24
    //   2231: iushr
    //   2232: ixor
    //   2233: i2b
    //   2234: bastore
    //   2235: aload #46
    //   2237: bipush #9
    //   2239: aload #37
    //   2241: iload #50
    //   2243: bipush #16
    //   2245: iushr
    //   2246: sipush #255
    //   2249: iand
    //   2250: baload
    //   2251: iload #48
    //   2253: bipush #16
    //   2255: iushr
    //   2256: ixor
    //   2257: i2b
    //   2258: bastore
    //   2259: aload #46
    //   2261: bipush #10
    //   2263: aload #37
    //   2265: iload #49
    //   2267: bipush #8
    //   2269: iushr
    //   2270: sipush #255
    //   2273: iand
    //   2274: baload
    //   2275: iload #48
    //   2277: bipush #8
    //   2279: iushr
    //   2280: ixor
    //   2281: i2b
    //   2282: bastore
    //   2283: aload #46
    //   2285: bipush #11
    //   2287: aload #37
    //   2289: iload #52
    //   2291: sipush #255
    //   2294: iand
    //   2295: baload
    //   2296: iload #48
    //   2298: ixor
    //   2299: i2b
    //   2300: bastore
    //   2301: aload #30
    //   2303: iload #47
    //   2305: iconst_3
    //   2306: iadd
    //   2307: iaload
    //   2308: istore #48
    //   2310: aload #46
    //   2312: bipush #12
    //   2314: aload #37
    //   2316: iload #52
    //   2318: bipush #24
    //   2320: iushr
    //   2321: baload
    //   2322: iload #48
    //   2324: bipush #24
    //   2326: iushr
    //   2327: ixor
    //   2328: i2b
    //   2329: bastore
    //   2330: aload #46
    //   2332: bipush #13
    //   2334: aload #37
    //   2336: iload #51
    //   2338: bipush #16
    //   2340: iushr
    //   2341: sipush #255
    //   2344: iand
    //   2345: baload
    //   2346: iload #48
    //   2348: bipush #16
    //   2350: iushr
    //   2351: ixor
    //   2352: i2b
    //   2353: bastore
    //   2354: aload #46
    //   2356: bipush #14
    //   2358: aload #37
    //   2360: iload #50
    //   2362: bipush #8
    //   2364: iushr
    //   2365: sipush #255
    //   2368: iand
    //   2369: baload
    //   2370: iload #48
    //   2372: bipush #8
    //   2374: iushr
    //   2375: ixor
    //   2376: i2b
    //   2377: bastore
    //   2378: aload #46
    //   2380: bipush #15
    //   2382: aload #37
    //   2384: iload #49
    //   2386: sipush #255
    //   2389: iand
    //   2390: baload
    //   2391: iload #48
    //   2393: ixor
    //   2394: i2b
    //   2395: bastore
    //   2396: iconst_0
    //   2397: istore #53
    //   2399: iload #53
    //   2401: bipush #16
    //   2403: if_icmpge -> 2429
    //   2406: aload #43
    //   2408: iload #53
    //   2410: iload #44
    //   2412: bipush #16
    //   2414: imul
    //   2415: iadd
    //   2416: aload #46
    //   2418: iload #53
    //   2420: baload
    //   2421: bastore
    //   2422: iinc #53, 1
    //   2425: iload_2
    //   2426: ifne -> 2399
    //   2429: iinc #44, 1
    //   2432: iload_2
    //   2433: ifne -> 1514
    //   2436: aload #43
    //   2438: arraylength
    //   2439: ifle -> 2520
    //   2442: aload #43
    //   2444: aload #43
    //   2446: arraylength
    //   2447: iconst_1
    //   2448: isub
    //   2449: baload
    //   2450: istore #44
    //   2452: iload #44
    //   2454: bipush #16
    //   2456: if_icmple -> 2467
    //   2459: aload #43
    //   2461: astore #35
    //   2463: iload_2
    //   2464: ifne -> 2520
    //   2467: aload #43
    //   2469: arraylength
    //   2470: iload #44
    //   2472: isub
    //   2473: newarray byte
    //   2475: astore #35
    //   2477: iconst_0
    //   2478: istore #45
    //   2480: iload #45
    //   2482: aload #35
    //   2484: arraylength
    //   2485: if_icmpge -> 2520
    //   2488: iload #45
    //   2490: aload #43
    //   2492: arraylength
    //   2493: if_icmpge -> 2520
    //   2496: aload #35
    //   2498: iload #45
    //   2500: aload #43
    //   2502: iload #45
    //   2504: baload
    //   2505: bastore
    //   2506: iinc #45, 1
    //   2509: iload_2
    //   2510: ifne -> 2480
    //   2513: goto -> 2520
    //   2516: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2519: athrow
    //   2520: aload #35
    //   2522: astore #7
    //   2524: new java/math/BigInteger
    //   2527: dup
    //   2528: aload #7
    //   2530: invokespecial <init> : ([B)V
    //   2533: invokevirtual abs : ()Ljava/math/BigInteger;
    //   2536: putstatic burp/Zscf.ZG : Ljava/lang/Object;
    //   2539: ldc2_w 8682522807148012
    //   2542: invokestatic currentTimeMillis : ()J
    //   2545: lxor
    //   2546: lstore #4
    //   2548: lload #4
    //   2550: ldc2_w 25214903917
    //   2553: lmul
    //   2554: ldc2_w 11
    //   2557: ladd
    //   2558: ldc2_w 281474976710655
    //   2561: land
    //   2562: lstore #4
    //   2564: lload #4
    //   2566: bipush #32
    //   2568: lshl
    //   2569: lstore #6
    //   2571: lload #4
    //   2573: ldc2_w 25214903917
    //   2576: lmul
    //   2577: ldc2_w 11
    //   2580: ladd
    //   2581: ldc2_w 281474976710655
    //   2584: land
    //   2585: lstore #4
    //   2587: lload #6
    //   2589: lload #4
    //   2591: ladd
    //   2592: lstore #6
    //   2594: bipush #16
    //   2596: newarray byte
    //   2598: dup
    //   2599: iconst_0
    //   2600: bipush #48
    //   2602: bastore
    //   2603: dup
    //   2604: iconst_1
    //   2605: bipush #49
    //   2607: bastore
    //   2608: dup
    //   2609: iconst_2
    //   2610: bipush #50
    //   2612: bastore
    //   2613: dup
    //   2614: iconst_3
    //   2615: bipush #51
    //   2617: bastore
    //   2618: dup
    //   2619: iconst_4
    //   2620: bipush #52
    //   2622: bastore
    //   2623: dup
    //   2624: iconst_5
    //   2625: bipush #53
    //   2627: bastore
    //   2628: dup
    //   2629: bipush #6
    //   2631: bipush #54
    //   2633: bastore
    //   2634: dup
    //   2635: bipush #7
    //   2637: bipush #55
    //   2639: bastore
    //   2640: dup
    //   2641: bipush #8
    //   2643: bipush #56
    //   2645: bastore
    //   2646: dup
    //   2647: bipush #9
    //   2649: bipush #57
    //   2651: bastore
    //   2652: dup
    //   2653: bipush #10
    //   2655: bipush #97
    //   2657: bastore
    //   2658: dup
    //   2659: bipush #11
    //   2661: bipush #98
    //   2663: bastore
    //   2664: dup
    //   2665: bipush #12
    //   2667: bipush #99
    //   2669: bastore
    //   2670: dup
    //   2671: bipush #13
    //   2673: bipush #100
    //   2675: bastore
    //   2676: dup
    //   2677: bipush #14
    //   2679: bipush #101
    //   2681: bastore
    //   2682: dup
    //   2683: bipush #15
    //   2685: bipush #102
    //   2687: bastore
    //   2688: astore #8
    //   2690: bipush #64
    //   2692: newarray byte
    //   2694: astore #9
    //   2696: bipush #64
    //   2698: istore #10
    //   2700: bipush #16
    //   2702: istore #11
    //   2704: iload #11
    //   2706: iconst_1
    //   2707: isub
    //   2708: i2l
    //   2709: lstore #12
    //   2711: aload #9
    //   2713: iinc #10, -1
    //   2716: iload #10
    //   2718: aload #8
    //   2720: lload #6
    //   2722: lload #12
    //   2724: land
    //   2725: l2i
    //   2726: baload
    //   2727: bastore
    //   2728: lload #6
    //   2730: iconst_4
    //   2731: lushr
    //   2732: lstore #6
    //   2734: lload #6
    //   2736: lconst_0
    //   2737: lcmp
    //   2738: ifne -> 2711
    //   2741: bipush #64
    //   2743: iload #10
    //   2745: isub
    //   2746: newarray byte
    //   2748: astore_3
    //   2749: iconst_0
    //   2750: istore #14
    //   2752: iload #14
    //   2754: aload_3
    //   2755: arraylength
    //   2756: if_icmpge -> 2778
    //   2759: aload_3
    //   2760: iload #14
    //   2762: aload #9
    //   2764: iload #10
    //   2766: iload #14
    //   2768: iadd
    //   2769: baload
    //   2770: bastore
    //   2771: iinc #14, 1
    //   2774: iload_2
    //   2775: ifne -> 2752
    //   2778: aload_3
    //   2779: arraylength
    //   2780: bipush #10
    //   2782: if_icmplt -> 2548
    //   2785: sipush #-16418
    //   2788: sipush #-10214
    //   2791: invokestatic a : (II)Ljava/lang/String;
    //   2794: iconst_1
    //   2795: ldc burp/Ze7y
    //   2797: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2800: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2803: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2806: astore_3
    //   2807: aload_3
    //   2808: arraylength
    //   2809: istore #4
    //   2811: iconst_0
    //   2812: istore #5
    //   2814: iload #5
    //   2816: iload #4
    //   2818: if_icmpge -> 2955
    //   2821: aload_3
    //   2822: iload #5
    //   2824: aaload
    //   2825: astore #6
    //   2827: aload #6
    //   2829: invokevirtual getModifiers : ()I
    //   2832: invokestatic isStatic : (I)Z
    //   2835: ifne -> 2845
    //   2838: goto -> 2948
    //   2841: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2844: athrow
    //   2845: aload #6
    //   2847: invokevirtual getType : ()Ljava/lang/Class;
    //   2850: astore #7
    //   2852: aload #7
    //   2854: ifnull -> 2935
    //   2857: aload #7
    //   2859: invokevirtual isPrimitive : ()Z
    //   2862: ifne -> 2935
    //   2865: goto -> 2872
    //   2868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2871: athrow
    //   2872: aload #7
    //   2874: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2877: ifnull -> 2935
    //   2880: goto -> 2887
    //   2883: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2886: athrow
    //   2887: aload #7
    //   2889: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2892: invokevirtual getName : ()Ljava/lang/String;
    //   2895: ifnull -> 2935
    //   2898: goto -> 2905
    //   2901: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2904: athrow
    //   2905: aload #7
    //   2907: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2910: invokevirtual getName : ()Ljava/lang/String;
    //   2913: sipush #-16438
    //   2916: sipush #24050
    //   2919: invokestatic a : (II)Ljava/lang/String;
    //   2922: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2925: ifne -> 2935
    //   2928: goto -> 2935
    //   2931: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2934: athrow
    //   2935: aload #6
    //   2937: iconst_1
    //   2938: invokevirtual setAccessible : (Z)V
    //   2941: aload #6
    //   2943: aconst_null
    //   2944: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2947: pop
    //   2948: iinc #5, 1
    //   2951: iload_2
    //   2952: ifne -> 2814
    //   2955: sipush #-16436
    //   2958: sipush #-7962
    //   2961: invokestatic a : (II)Ljava/lang/String;
    //   2964: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2967: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2970: astore_3
    //   2971: aload_3
    //   2972: arraylength
    //   2973: istore #4
    //   2975: iconst_0
    //   2976: istore #5
    //   2978: iload #5
    //   2980: iload #4
    //   2982: if_icmpge -> 3114
    //   2985: aload_3
    //   2986: iload #5
    //   2988: aaload
    //   2989: astore #6
    //   2991: aload #6
    //   2993: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2996: pop
    //   2997: aload #6
    //   2999: invokevirtual getModifiers : ()I
    //   3002: invokestatic isStatic : (I)Z
    //   3005: ifeq -> 3100
    //   3008: aload #6
    //   3010: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3013: arraylength
    //   3014: iconst_2
    //   3015: if_icmpne -> 3100
    //   3018: goto -> 3025
    //   3021: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3024: athrow
    //   3025: aload #6
    //   3027: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3030: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   3033: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3036: ifeq -> 3100
    //   3039: goto -> 3046
    //   3042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3045: athrow
    //   3046: aload #6
    //   3048: iconst_1
    //   3049: invokevirtual setAccessible : (Z)V
    //   3052: aload #6
    //   3054: aconst_null
    //   3055: iconst_2
    //   3056: anewarray java/lang/Object
    //   3059: dup
    //   3060: iconst_0
    //   3061: aload_0
    //   3062: aastore
    //   3063: dup
    //   3064: iconst_1
    //   3065: aload_1
    //   3066: ifnonnull -> 3084
    //   3069: goto -> 3076
    //   3072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3075: athrow
    //   3076: aload_1
    //   3077: goto -> 3091
    //   3080: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3083: athrow
    //   3084: aload_1
    //   3085: checkcast [B
    //   3088: invokevirtual clone : ()Ljava/lang/Object;
    //   3091: aastore
    //   3092: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3095: pop
    //   3096: iload_2
    //   3097: ifne -> 3114
    //   3100: iinc #5, 1
    //   3103: iload_2
    //   3104: ifne -> 2978
    //   3107: goto -> 3114
    //   3110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3113: athrow
    //   3114: iconst_0
    //   3115: istore_3
    //   3116: getstatic burp/Zl7x.Zo : Ljava/lang/String;
    //   3119: getstatic burp/Zs3m.ZW : Ljava/lang/Object;
    //   3122: checkcast java/math/BigInteger
    //   3125: invokevirtual intValue : ()I
    //   3128: bipush #32
    //   3130: irem
    //   3131: invokestatic abs : (I)I
    //   3134: invokevirtual charAt : (I)C
    //   3137: getstatic burp/Zz66.ZM : Ljava/lang/String;
    //   3140: getstatic burp/Zm83.Zl : Ljava/lang/Object;
    //   3143: checkcast java/math/BigInteger
    //   3146: invokevirtual intValue : ()I
    //   3149: bipush #32
    //   3151: irem
    //   3152: invokestatic abs : (I)I
    //   3155: invokevirtual charAt : (I)C
    //   3158: if_icmple -> 3502
    //   3161: sipush #-16431
    //   3164: sipush #-15453
    //   3167: invokestatic a : (II)Ljava/lang/String;
    //   3170: iconst_1
    //   3171: ldc burp/Zs9k
    //   3173: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3176: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3179: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3182: astore #4
    //   3184: aload #4
    //   3186: arraylength
    //   3187: istore #5
    //   3189: iconst_0
    //   3190: istore #6
    //   3192: iload #6
    //   3194: iload #5
    //   3196: if_icmpge -> 3334
    //   3199: aload #4
    //   3201: iload #6
    //   3203: aaload
    //   3204: astore #7
    //   3206: aload #7
    //   3208: invokevirtual getModifiers : ()I
    //   3211: invokestatic isStatic : (I)Z
    //   3214: ifne -> 3224
    //   3217: goto -> 3327
    //   3220: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3223: athrow
    //   3224: aload #7
    //   3226: invokevirtual getType : ()Ljava/lang/Class;
    //   3229: astore #8
    //   3231: aload #8
    //   3233: ifnull -> 3314
    //   3236: aload #8
    //   3238: invokevirtual isPrimitive : ()Z
    //   3241: ifne -> 3314
    //   3244: goto -> 3251
    //   3247: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3250: athrow
    //   3251: aload #8
    //   3253: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3256: ifnull -> 3314
    //   3259: goto -> 3266
    //   3262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3265: athrow
    //   3266: aload #8
    //   3268: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3271: invokevirtual getName : ()Ljava/lang/String;
    //   3274: ifnull -> 3314
    //   3277: goto -> 3284
    //   3280: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3283: athrow
    //   3284: aload #8
    //   3286: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3289: invokevirtual getName : ()Ljava/lang/String;
    //   3292: sipush #-16427
    //   3295: sipush #-31526
    //   3298: invokestatic a : (II)Ljava/lang/String;
    //   3301: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3304: ifne -> 3314
    //   3307: goto -> 3314
    //   3310: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3313: athrow
    //   3314: aload #7
    //   3316: iconst_1
    //   3317: invokevirtual setAccessible : (Z)V
    //   3320: aload #7
    //   3322: aconst_null
    //   3323: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3326: pop
    //   3327: iinc #6, 1
    //   3330: iload_2
    //   3331: ifne -> 3192
    //   3334: sipush #-16424
    //   3337: sipush #-6691
    //   3340: invokestatic a : (II)Ljava/lang/String;
    //   3343: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3346: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3349: astore #4
    //   3351: aload #4
    //   3353: arraylength
    //   3354: istore #5
    //   3356: iconst_0
    //   3357: istore #6
    //   3359: iload #6
    //   3361: iload #5
    //   3363: if_icmpge -> 3499
    //   3366: aload #4
    //   3368: iload #6
    //   3370: aaload
    //   3371: astore #7
    //   3373: aload #7
    //   3375: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3378: pop
    //   3379: aload #7
    //   3381: invokevirtual getModifiers : ()I
    //   3384: invokestatic isStatic : (I)Z
    //   3387: ifeq -> 3485
    //   3390: aload #7
    //   3392: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3395: arraylength
    //   3396: iconst_2
    //   3397: if_icmpne -> 3485
    //   3400: goto -> 3407
    //   3403: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3406: athrow
    //   3407: aload #7
    //   3409: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3412: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3415: if_acmpne -> 3485
    //   3418: goto -> 3425
    //   3421: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3424: athrow
    //   3425: aload #7
    //   3427: iconst_1
    //   3428: invokevirtual setAccessible : (Z)V
    //   3431: aload #7
    //   3433: aconst_null
    //   3434: iconst_2
    //   3435: anewarray java/lang/Object
    //   3438: dup
    //   3439: iconst_0
    //   3440: aload_0
    //   3441: aastore
    //   3442: dup
    //   3443: iconst_1
    //   3444: aload_1
    //   3445: ifnonnull -> 3463
    //   3448: goto -> 3455
    //   3451: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3454: athrow
    //   3455: aload_1
    //   3456: goto -> 3470
    //   3459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3462: athrow
    //   3463: aload_1
    //   3464: checkcast [B
    //   3467: invokevirtual clone : ()Ljava/lang/Object;
    //   3470: aastore
    //   3471: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3474: checkcast java/lang/Boolean
    //   3477: invokevirtual booleanValue : ()Z
    //   3480: istore_3
    //   3481: iload_2
    //   3482: ifne -> 3499
    //   3485: iinc #6, 1
    //   3488: iload_2
    //   3489: ifne -> 3359
    //   3492: goto -> 3499
    //   3495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3498: athrow
    //   3499: goto -> 3840
    //   3502: sipush #-16434
    //   3505: sipush #-4603
    //   3508: invokestatic a : (II)Ljava/lang/String;
    //   3511: iconst_1
    //   3512: ldc burp/Zlc5
    //   3514: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3517: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3520: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3523: astore #4
    //   3525: aload #4
    //   3527: arraylength
    //   3528: istore #5
    //   3530: iconst_0
    //   3531: istore #6
    //   3533: iload #6
    //   3535: iload #5
    //   3537: if_icmpge -> 3675
    //   3540: aload #4
    //   3542: iload #6
    //   3544: aaload
    //   3545: astore #7
    //   3547: aload #7
    //   3549: invokevirtual getModifiers : ()I
    //   3552: invokestatic isStatic : (I)Z
    //   3555: ifne -> 3565
    //   3558: goto -> 3668
    //   3561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3564: athrow
    //   3565: aload #7
    //   3567: invokevirtual getType : ()Ljava/lang/Class;
    //   3570: astore #8
    //   3572: aload #8
    //   3574: ifnull -> 3655
    //   3577: aload #8
    //   3579: invokevirtual isPrimitive : ()Z
    //   3582: ifne -> 3655
    //   3585: goto -> 3592
    //   3588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3591: athrow
    //   3592: aload #8
    //   3594: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3597: ifnull -> 3655
    //   3600: goto -> 3607
    //   3603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3606: athrow
    //   3607: aload #8
    //   3609: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3612: invokevirtual getName : ()Ljava/lang/String;
    //   3615: ifnull -> 3655
    //   3618: goto -> 3625
    //   3621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3624: athrow
    //   3625: aload #8
    //   3627: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3630: invokevirtual getName : ()Ljava/lang/String;
    //   3633: sipush #-16427
    //   3636: sipush #-31526
    //   3639: invokestatic a : (II)Ljava/lang/String;
    //   3642: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3645: ifne -> 3655
    //   3648: goto -> 3655
    //   3651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3654: athrow
    //   3655: aload #7
    //   3657: iconst_1
    //   3658: invokevirtual setAccessible : (Z)V
    //   3661: aload #7
    //   3663: aconst_null
    //   3664: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3667: pop
    //   3668: iinc #6, 1
    //   3671: iload_2
    //   3672: ifne -> 3533
    //   3675: sipush #-16426
    //   3678: sipush #-31526
    //   3681: invokestatic a : (II)Ljava/lang/String;
    //   3684: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3687: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3690: astore #4
    //   3692: aload #4
    //   3694: arraylength
    //   3695: istore #5
    //   3697: iconst_0
    //   3698: istore #6
    //   3700: iload #6
    //   3702: iload #5
    //   3704: if_icmpge -> 3840
    //   3707: aload #4
    //   3709: iload #6
    //   3711: aaload
    //   3712: astore #7
    //   3714: aload #7
    //   3716: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3719: pop
    //   3720: aload #7
    //   3722: invokevirtual getModifiers : ()I
    //   3725: invokestatic isStatic : (I)Z
    //   3728: ifeq -> 3826
    //   3731: aload #7
    //   3733: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3736: arraylength
    //   3737: iconst_2
    //   3738: if_icmpne -> 3826
    //   3741: goto -> 3748
    //   3744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3747: athrow
    //   3748: aload #7
    //   3750: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3753: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3756: if_acmpne -> 3826
    //   3759: goto -> 3766
    //   3762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3765: athrow
    //   3766: aload #7
    //   3768: iconst_1
    //   3769: invokevirtual setAccessible : (Z)V
    //   3772: aload #7
    //   3774: aconst_null
    //   3775: iconst_2
    //   3776: anewarray java/lang/Object
    //   3779: dup
    //   3780: iconst_0
    //   3781: aload_0
    //   3782: aastore
    //   3783: dup
    //   3784: iconst_1
    //   3785: aload_1
    //   3786: ifnonnull -> 3804
    //   3789: goto -> 3796
    //   3792: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3795: athrow
    //   3796: aload_1
    //   3797: goto -> 3811
    //   3800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3803: athrow
    //   3804: aload_1
    //   3805: checkcast [B
    //   3808: invokevirtual clone : ()Ljava/lang/Object;
    //   3811: aastore
    //   3812: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3815: checkcast java/lang/Boolean
    //   3818: invokevirtual booleanValue : ()Z
    //   3821: istore_3
    //   3822: iload_2
    //   3823: ifne -> 3840
    //   3826: iinc #6, 1
    //   3829: iload_2
    //   3830: ifne -> 3700
    //   3833: goto -> 3840
    //   3836: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3839: athrow
    //   3840: iload_3
    //   3841: ifeq -> 3846
    //   3844: iload_3
    //   3845: ireturn
    //   3846: getstatic burp/Ze4w.Zc : Ljava/lang/String;
    //   3849: getstatic burp/Zg4z.ZB : Ljava/lang/Object;
    //   3852: checkcast java/math/BigInteger
    //   3855: invokevirtual intValue : ()I
    //   3858: bipush #32
    //   3860: irem
    //   3861: invokestatic abs : (I)I
    //   3864: invokevirtual charAt : (I)C
    //   3867: getstatic burp/Zeqx.Zu : Ljava/lang/String;
    //   3870: getstatic burp/Zs1d.Zo : Ljava/lang/Object;
    //   3873: checkcast java/math/BigInteger
    //   3876: invokevirtual intValue : ()I
    //   3879: bipush #32
    //   3881: irem
    //   3882: invokestatic abs : (I)I
    //   3885: invokevirtual charAt : (I)C
    //   3888: if_icmpgt -> 4233
    //   3891: sipush #-16430
    //   3894: sipush #6235
    //   3897: invokestatic a : (II)Ljava/lang/String;
    //   3900: iconst_1
    //   3901: ldc burp/Zm_w
    //   3903: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3906: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3909: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3912: astore #4
    //   3914: aload #4
    //   3916: arraylength
    //   3917: istore #5
    //   3919: iconst_0
    //   3920: istore #6
    //   3922: iload #6
    //   3924: iload #5
    //   3926: if_icmpge -> 4064
    //   3929: aload #4
    //   3931: iload #6
    //   3933: aaload
    //   3934: astore #7
    //   3936: aload #7
    //   3938: invokevirtual getModifiers : ()I
    //   3941: invokestatic isStatic : (I)Z
    //   3944: ifne -> 3954
    //   3947: goto -> 4057
    //   3950: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3953: athrow
    //   3954: aload #7
    //   3956: invokevirtual getType : ()Ljava/lang/Class;
    //   3959: astore #8
    //   3961: aload #8
    //   3963: ifnull -> 4044
    //   3966: aload #8
    //   3968: invokevirtual isPrimitive : ()Z
    //   3971: ifne -> 4044
    //   3974: goto -> 3981
    //   3977: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3980: athrow
    //   3981: aload #8
    //   3983: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3986: ifnull -> 4044
    //   3989: goto -> 3996
    //   3992: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3995: athrow
    //   3996: aload #8
    //   3998: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4001: invokevirtual getName : ()Ljava/lang/String;
    //   4004: ifnull -> 4044
    //   4007: goto -> 4014
    //   4010: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4013: athrow
    //   4014: aload #8
    //   4016: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4019: invokevirtual getName : ()Ljava/lang/String;
    //   4022: sipush #-16427
    //   4025: sipush #-31526
    //   4028: invokestatic a : (II)Ljava/lang/String;
    //   4031: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4034: ifne -> 4044
    //   4037: goto -> 4044
    //   4040: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4043: athrow
    //   4044: aload #7
    //   4046: iconst_1
    //   4047: invokevirtual setAccessible : (Z)V
    //   4050: aload #7
    //   4052: aconst_null
    //   4053: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4056: pop
    //   4057: iinc #6, 1
    //   4060: iload_2
    //   4061: ifne -> 3922
    //   4064: sipush #-16429
    //   4067: sipush #32399
    //   4070: invokestatic a : (II)Ljava/lang/String;
    //   4073: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4076: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4079: astore #4
    //   4081: aload #4
    //   4083: arraylength
    //   4084: istore #5
    //   4086: iconst_0
    //   4087: istore #6
    //   4089: iload #6
    //   4091: iload #5
    //   4093: if_icmpge -> 4229
    //   4096: aload #4
    //   4098: iload #6
    //   4100: aaload
    //   4101: astore #7
    //   4103: aload #7
    //   4105: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4108: pop
    //   4109: aload #7
    //   4111: invokevirtual getModifiers : ()I
    //   4114: invokestatic isStatic : (I)Z
    //   4117: ifeq -> 4215
    //   4120: aload #7
    //   4122: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4125: arraylength
    //   4126: iconst_2
    //   4127: if_icmpne -> 4215
    //   4130: goto -> 4137
    //   4133: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4136: athrow
    //   4137: aload #7
    //   4139: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4142: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4145: if_acmpne -> 4215
    //   4148: goto -> 4155
    //   4151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4154: athrow
    //   4155: aload #7
    //   4157: iconst_1
    //   4158: invokevirtual setAccessible : (Z)V
    //   4161: aload #7
    //   4163: aconst_null
    //   4164: iconst_2
    //   4165: anewarray java/lang/Object
    //   4168: dup
    //   4169: iconst_0
    //   4170: aload_0
    //   4171: aastore
    //   4172: dup
    //   4173: iconst_1
    //   4174: aload_1
    //   4175: ifnonnull -> 4193
    //   4178: goto -> 4185
    //   4181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4184: athrow
    //   4185: aload_1
    //   4186: goto -> 4200
    //   4189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4192: athrow
    //   4193: aload_1
    //   4194: checkcast [B
    //   4197: invokevirtual clone : ()Ljava/lang/Object;
    //   4200: aastore
    //   4201: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4204: checkcast java/lang/Boolean
    //   4207: invokevirtual booleanValue : ()Z
    //   4210: istore_3
    //   4211: iload_2
    //   4212: ifne -> 4229
    //   4215: iinc #6, 1
    //   4218: iload_2
    //   4219: ifne -> 4089
    //   4222: goto -> 4229
    //   4225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4228: athrow
    //   4229: iload_2
    //   4230: ifne -> 4571
    //   4233: sipush #-16448
    //   4236: sipush #-24189
    //   4239: invokestatic a : (II)Ljava/lang/String;
    //   4242: iconst_1
    //   4243: ldc burp/Zgde
    //   4245: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4248: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4251: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4254: astore #4
    //   4256: aload #4
    //   4258: arraylength
    //   4259: istore #5
    //   4261: iconst_0
    //   4262: istore #6
    //   4264: iload #6
    //   4266: iload #5
    //   4268: if_icmpge -> 4406
    //   4271: aload #4
    //   4273: iload #6
    //   4275: aaload
    //   4276: astore #7
    //   4278: aload #7
    //   4280: invokevirtual getModifiers : ()I
    //   4283: invokestatic isStatic : (I)Z
    //   4286: ifne -> 4296
    //   4289: goto -> 4399
    //   4292: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4295: athrow
    //   4296: aload #7
    //   4298: invokevirtual getType : ()Ljava/lang/Class;
    //   4301: astore #8
    //   4303: aload #8
    //   4305: ifnull -> 4386
    //   4308: aload #8
    //   4310: invokevirtual isPrimitive : ()Z
    //   4313: ifne -> 4386
    //   4316: goto -> 4323
    //   4319: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4322: athrow
    //   4323: aload #8
    //   4325: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4328: ifnull -> 4386
    //   4331: goto -> 4338
    //   4334: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4337: athrow
    //   4338: aload #8
    //   4340: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4343: invokevirtual getName : ()Ljava/lang/String;
    //   4346: ifnull -> 4386
    //   4349: goto -> 4356
    //   4352: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4355: athrow
    //   4356: aload #8
    //   4358: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4361: invokevirtual getName : ()Ljava/lang/String;
    //   4364: sipush #-16427
    //   4367: sipush #-31526
    //   4370: invokestatic a : (II)Ljava/lang/String;
    //   4373: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4376: ifne -> 4386
    //   4379: goto -> 4386
    //   4382: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4385: athrow
    //   4386: aload #7
    //   4388: iconst_1
    //   4389: invokevirtual setAccessible : (Z)V
    //   4392: aload #7
    //   4394: aconst_null
    //   4395: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4398: pop
    //   4399: iinc #6, 1
    //   4402: iload_2
    //   4403: ifne -> 4264
    //   4406: sipush #-16417
    //   4409: sipush #31966
    //   4412: invokestatic a : (II)Ljava/lang/String;
    //   4415: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4418: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4421: astore #4
    //   4423: aload #4
    //   4425: arraylength
    //   4426: istore #5
    //   4428: iconst_0
    //   4429: istore #6
    //   4431: iload #6
    //   4433: iload #5
    //   4435: if_icmpge -> 4571
    //   4438: aload #4
    //   4440: iload #6
    //   4442: aaload
    //   4443: astore #7
    //   4445: aload #7
    //   4447: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4450: pop
    //   4451: aload #7
    //   4453: invokevirtual getModifiers : ()I
    //   4456: invokestatic isStatic : (I)Z
    //   4459: ifeq -> 4557
    //   4462: aload #7
    //   4464: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4467: arraylength
    //   4468: iconst_2
    //   4469: if_icmpne -> 4557
    //   4472: goto -> 4479
    //   4475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4478: athrow
    //   4479: aload #7
    //   4481: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4484: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4487: if_acmpne -> 4557
    //   4490: goto -> 4497
    //   4493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4496: athrow
    //   4497: aload #7
    //   4499: iconst_1
    //   4500: invokevirtual setAccessible : (Z)V
    //   4503: aload #7
    //   4505: aconst_null
    //   4506: iconst_2
    //   4507: anewarray java/lang/Object
    //   4510: dup
    //   4511: iconst_0
    //   4512: aload_0
    //   4513: aastore
    //   4514: dup
    //   4515: iconst_1
    //   4516: aload_1
    //   4517: ifnonnull -> 4535
    //   4520: goto -> 4527
    //   4523: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4526: athrow
    //   4527: aload_1
    //   4528: goto -> 4542
    //   4531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4534: athrow
    //   4535: aload_1
    //   4536: checkcast [B
    //   4539: invokevirtual clone : ()Ljava/lang/Object;
    //   4542: aastore
    //   4543: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4546: checkcast java/lang/Boolean
    //   4549: invokevirtual booleanValue : ()Z
    //   4552: istore_3
    //   4553: iload_2
    //   4554: ifne -> 4571
    //   4557: iinc #6, 1
    //   4560: iload_2
    //   4561: ifne -> 4431
    //   4564: goto -> 4571
    //   4567: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4570: athrow
    //   4571: iload_3
    //   4572: ifeq -> 4577
    //   4575: iload_3
    //   4576: ireturn
    //   4577: getstatic burp/Zlo0.ZD : Ljava/lang/String;
    //   4580: getstatic burp/Zrzg.ZA : Ljava/lang/Object;
    //   4583: checkcast java/math/BigInteger
    //   4586: invokevirtual intValue : ()I
    //   4589: bipush #32
    //   4591: irem
    //   4592: invokestatic abs : (I)I
    //   4595: invokevirtual charAt : (I)C
    //   4598: getstatic burp/Zrtp.Zq : Ljava/lang/String;
    //   4601: getstatic burp/Zst7.ZI : Ljava/lang/Object;
    //   4604: checkcast java/math/BigInteger
    //   4607: invokevirtual intValue : ()I
    //   4610: bipush #32
    //   4612: irem
    //   4613: invokestatic abs : (I)I
    //   4616: invokevirtual charAt : (I)C
    //   4619: if_icmple -> 4964
    //   4622: sipush #-16446
    //   4625: sipush #14182
    //   4628: invokestatic a : (II)Ljava/lang/String;
    //   4631: iconst_1
    //   4632: ldc burp/Zlpu
    //   4634: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4637: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4640: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4643: astore #4
    //   4645: aload #4
    //   4647: arraylength
    //   4648: istore #5
    //   4650: iconst_0
    //   4651: istore #6
    //   4653: iload #6
    //   4655: iload #5
    //   4657: if_icmpge -> 4795
    //   4660: aload #4
    //   4662: iload #6
    //   4664: aaload
    //   4665: astore #7
    //   4667: aload #7
    //   4669: invokevirtual getModifiers : ()I
    //   4672: invokestatic isStatic : (I)Z
    //   4675: ifne -> 4685
    //   4678: goto -> 4788
    //   4681: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4684: athrow
    //   4685: aload #7
    //   4687: invokevirtual getType : ()Ljava/lang/Class;
    //   4690: astore #8
    //   4692: aload #8
    //   4694: ifnull -> 4775
    //   4697: aload #8
    //   4699: invokevirtual isPrimitive : ()Z
    //   4702: ifne -> 4775
    //   4705: goto -> 4712
    //   4708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4711: athrow
    //   4712: aload #8
    //   4714: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4717: ifnull -> 4775
    //   4720: goto -> 4727
    //   4723: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4726: athrow
    //   4727: aload #8
    //   4729: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4732: invokevirtual getName : ()Ljava/lang/String;
    //   4735: ifnull -> 4775
    //   4738: goto -> 4745
    //   4741: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4744: athrow
    //   4745: aload #8
    //   4747: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4750: invokevirtual getName : ()Ljava/lang/String;
    //   4753: sipush #-16427
    //   4756: sipush #-31526
    //   4759: invokestatic a : (II)Ljava/lang/String;
    //   4762: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4765: ifne -> 4775
    //   4768: goto -> 4775
    //   4771: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4774: athrow
    //   4775: aload #7
    //   4777: iconst_1
    //   4778: invokevirtual setAccessible : (Z)V
    //   4781: aload #7
    //   4783: aconst_null
    //   4784: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4787: pop
    //   4788: iinc #6, 1
    //   4791: iload_2
    //   4792: ifne -> 4653
    //   4795: sipush #-16428
    //   4798: sipush #-32297
    //   4801: invokestatic a : (II)Ljava/lang/String;
    //   4804: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4807: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4810: astore #4
    //   4812: aload #4
    //   4814: arraylength
    //   4815: istore #5
    //   4817: iconst_0
    //   4818: istore #6
    //   4820: iload #6
    //   4822: iload #5
    //   4824: if_icmpge -> 4960
    //   4827: aload #4
    //   4829: iload #6
    //   4831: aaload
    //   4832: astore #7
    //   4834: aload #7
    //   4836: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4839: pop
    //   4840: aload #7
    //   4842: invokevirtual getModifiers : ()I
    //   4845: invokestatic isStatic : (I)Z
    //   4848: ifeq -> 4946
    //   4851: aload #7
    //   4853: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4856: arraylength
    //   4857: iconst_2
    //   4858: if_icmpne -> 4946
    //   4861: goto -> 4868
    //   4864: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4867: athrow
    //   4868: aload #7
    //   4870: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4873: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4876: if_acmpne -> 4946
    //   4879: goto -> 4886
    //   4882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4885: athrow
    //   4886: aload #7
    //   4888: iconst_1
    //   4889: invokevirtual setAccessible : (Z)V
    //   4892: aload #7
    //   4894: aconst_null
    //   4895: iconst_2
    //   4896: anewarray java/lang/Object
    //   4899: dup
    //   4900: iconst_0
    //   4901: aload_0
    //   4902: aastore
    //   4903: dup
    //   4904: iconst_1
    //   4905: aload_1
    //   4906: ifnonnull -> 4924
    //   4909: goto -> 4916
    //   4912: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4915: athrow
    //   4916: aload_1
    //   4917: goto -> 4931
    //   4920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4923: athrow
    //   4924: aload_1
    //   4925: checkcast [B
    //   4928: invokevirtual clone : ()Ljava/lang/Object;
    //   4931: aastore
    //   4932: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4935: checkcast java/lang/Boolean
    //   4938: invokevirtual booleanValue : ()Z
    //   4941: istore_3
    //   4942: iload_2
    //   4943: ifne -> 4960
    //   4946: iinc #6, 1
    //   4949: iload_2
    //   4950: ifne -> 4820
    //   4953: goto -> 4960
    //   4956: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4959: athrow
    //   4960: iload_2
    //   4961: ifne -> 5302
    //   4964: sipush #-16433
    //   4967: sipush #10665
    //   4970: invokestatic a : (II)Ljava/lang/String;
    //   4973: iconst_1
    //   4974: ldc burp/Zlyf
    //   4976: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4979: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4982: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4985: astore #4
    //   4987: aload #4
    //   4989: arraylength
    //   4990: istore #5
    //   4992: iconst_0
    //   4993: istore #6
    //   4995: iload #6
    //   4997: iload #5
    //   4999: if_icmpge -> 5137
    //   5002: aload #4
    //   5004: iload #6
    //   5006: aaload
    //   5007: astore #7
    //   5009: aload #7
    //   5011: invokevirtual getModifiers : ()I
    //   5014: invokestatic isStatic : (I)Z
    //   5017: ifne -> 5027
    //   5020: goto -> 5130
    //   5023: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5026: athrow
    //   5027: aload #7
    //   5029: invokevirtual getType : ()Ljava/lang/Class;
    //   5032: astore #8
    //   5034: aload #8
    //   5036: ifnull -> 5117
    //   5039: aload #8
    //   5041: invokevirtual isPrimitive : ()Z
    //   5044: ifne -> 5117
    //   5047: goto -> 5054
    //   5050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5053: athrow
    //   5054: aload #8
    //   5056: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5059: ifnull -> 5117
    //   5062: goto -> 5069
    //   5065: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5068: athrow
    //   5069: aload #8
    //   5071: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5074: invokevirtual getName : ()Ljava/lang/String;
    //   5077: ifnull -> 5117
    //   5080: goto -> 5087
    //   5083: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5086: athrow
    //   5087: aload #8
    //   5089: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5092: invokevirtual getName : ()Ljava/lang/String;
    //   5095: sipush #-16427
    //   5098: sipush #-31526
    //   5101: invokestatic a : (II)Ljava/lang/String;
    //   5104: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5107: ifne -> 5117
    //   5110: goto -> 5117
    //   5113: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5116: athrow
    //   5117: aload #7
    //   5119: iconst_1
    //   5120: invokevirtual setAccessible : (Z)V
    //   5123: aload #7
    //   5125: aconst_null
    //   5126: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5129: pop
    //   5130: iinc #6, 1
    //   5133: iload_2
    //   5134: ifne -> 4995
    //   5137: sipush #-16432
    //   5140: sipush #-10989
    //   5143: invokestatic a : (II)Ljava/lang/String;
    //   5146: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5149: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5152: astore #4
    //   5154: aload #4
    //   5156: arraylength
    //   5157: istore #5
    //   5159: iconst_0
    //   5160: istore #6
    //   5162: iload #6
    //   5164: iload #5
    //   5166: if_icmpge -> 5302
    //   5169: aload #4
    //   5171: iload #6
    //   5173: aaload
    //   5174: astore #7
    //   5176: aload #7
    //   5178: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5181: pop
    //   5182: aload #7
    //   5184: invokevirtual getModifiers : ()I
    //   5187: invokestatic isStatic : (I)Z
    //   5190: ifeq -> 5288
    //   5193: aload #7
    //   5195: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5198: arraylength
    //   5199: iconst_2
    //   5200: if_icmpne -> 5288
    //   5203: goto -> 5210
    //   5206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5209: athrow
    //   5210: aload #7
    //   5212: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5215: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5218: if_acmpne -> 5288
    //   5221: goto -> 5228
    //   5224: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5227: athrow
    //   5228: aload #7
    //   5230: iconst_1
    //   5231: invokevirtual setAccessible : (Z)V
    //   5234: aload #7
    //   5236: aconst_null
    //   5237: iconst_2
    //   5238: anewarray java/lang/Object
    //   5241: dup
    //   5242: iconst_0
    //   5243: aload_0
    //   5244: aastore
    //   5245: dup
    //   5246: iconst_1
    //   5247: aload_1
    //   5248: ifnonnull -> 5266
    //   5251: goto -> 5258
    //   5254: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5257: athrow
    //   5258: aload_1
    //   5259: goto -> 5273
    //   5262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5265: athrow
    //   5266: aload_1
    //   5267: checkcast [B
    //   5270: invokevirtual clone : ()Ljava/lang/Object;
    //   5273: aastore
    //   5274: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5277: checkcast java/lang/Boolean
    //   5280: invokevirtual booleanValue : ()Z
    //   5283: istore_3
    //   5284: iload_2
    //   5285: ifne -> 5302
    //   5288: iinc #6, 1
    //   5291: iload_2
    //   5292: ifne -> 5162
    //   5295: goto -> 5302
    //   5298: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5301: athrow
    //   5302: iload_3
    //   5303: ifeq -> 5308
    //   5306: iload_3
    //   5307: ireturn
    //   5308: getstatic burp/Zkhf.Zb : Ljava/lang/String;
    //   5311: getstatic burp/Zv8l.ZL : Ljava/lang/Object;
    //   5314: checkcast java/math/BigInteger
    //   5317: invokevirtual intValue : ()I
    //   5320: bipush #32
    //   5322: irem
    //   5323: invokestatic abs : (I)I
    //   5326: invokevirtual charAt : (I)C
    //   5329: getstatic burp/Zt6z.ZL : Ljava/lang/String;
    //   5332: getstatic burp/Zt8m.Zf : Ljava/lang/Object;
    //   5335: checkcast java/math/BigInteger
    //   5338: invokevirtual intValue : ()I
    //   5341: bipush #32
    //   5343: irem
    //   5344: invokestatic abs : (I)I
    //   5347: invokevirtual charAt : (I)C
    //   5350: if_icmpgt -> 5695
    //   5353: sipush #-16445
    //   5356: sipush #-25780
    //   5359: invokestatic a : (II)Ljava/lang/String;
    //   5362: iconst_1
    //   5363: ldc burp/Zr0g
    //   5365: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5368: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5371: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5374: astore #4
    //   5376: aload #4
    //   5378: arraylength
    //   5379: istore #5
    //   5381: iconst_0
    //   5382: istore #6
    //   5384: iload #6
    //   5386: iload #5
    //   5388: if_icmpge -> 5526
    //   5391: aload #4
    //   5393: iload #6
    //   5395: aaload
    //   5396: astore #7
    //   5398: aload #7
    //   5400: invokevirtual getModifiers : ()I
    //   5403: invokestatic isStatic : (I)Z
    //   5406: ifne -> 5416
    //   5409: goto -> 5519
    //   5412: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5415: athrow
    //   5416: aload #7
    //   5418: invokevirtual getType : ()Ljava/lang/Class;
    //   5421: astore #8
    //   5423: aload #8
    //   5425: ifnull -> 5506
    //   5428: aload #8
    //   5430: invokevirtual isPrimitive : ()Z
    //   5433: ifne -> 5506
    //   5436: goto -> 5443
    //   5439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5442: athrow
    //   5443: aload #8
    //   5445: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5448: ifnull -> 5506
    //   5451: goto -> 5458
    //   5454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5457: athrow
    //   5458: aload #8
    //   5460: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5463: invokevirtual getName : ()Ljava/lang/String;
    //   5466: ifnull -> 5506
    //   5469: goto -> 5476
    //   5472: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5475: athrow
    //   5476: aload #8
    //   5478: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5481: invokevirtual getName : ()Ljava/lang/String;
    //   5484: sipush #-16427
    //   5487: sipush #-31526
    //   5490: invokestatic a : (II)Ljava/lang/String;
    //   5493: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5496: ifne -> 5506
    //   5499: goto -> 5506
    //   5502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5505: athrow
    //   5506: aload #7
    //   5508: iconst_1
    //   5509: invokevirtual setAccessible : (Z)V
    //   5512: aload #7
    //   5514: aconst_null
    //   5515: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5518: pop
    //   5519: iinc #6, 1
    //   5522: iload_2
    //   5523: ifne -> 5384
    //   5526: sipush #-16437
    //   5529: sipush #1847
    //   5532: invokestatic a : (II)Ljava/lang/String;
    //   5535: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5538: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5541: astore #4
    //   5543: aload #4
    //   5545: arraylength
    //   5546: istore #5
    //   5548: iconst_0
    //   5549: istore #6
    //   5551: iload #6
    //   5553: iload #5
    //   5555: if_icmpge -> 5691
    //   5558: aload #4
    //   5560: iload #6
    //   5562: aaload
    //   5563: astore #7
    //   5565: aload #7
    //   5567: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5570: pop
    //   5571: aload #7
    //   5573: invokevirtual getModifiers : ()I
    //   5576: invokestatic isStatic : (I)Z
    //   5579: ifeq -> 5677
    //   5582: aload #7
    //   5584: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5587: arraylength
    //   5588: iconst_2
    //   5589: if_icmpne -> 5677
    //   5592: goto -> 5599
    //   5595: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5598: athrow
    //   5599: aload #7
    //   5601: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5604: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5607: if_acmpne -> 5677
    //   5610: goto -> 5617
    //   5613: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5616: athrow
    //   5617: aload #7
    //   5619: iconst_1
    //   5620: invokevirtual setAccessible : (Z)V
    //   5623: aload #7
    //   5625: aconst_null
    //   5626: iconst_2
    //   5627: anewarray java/lang/Object
    //   5630: dup
    //   5631: iconst_0
    //   5632: aload_0
    //   5633: aastore
    //   5634: dup
    //   5635: iconst_1
    //   5636: aload_1
    //   5637: ifnonnull -> 5655
    //   5640: goto -> 5647
    //   5643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5646: athrow
    //   5647: aload_1
    //   5648: goto -> 5662
    //   5651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5654: athrow
    //   5655: aload_1
    //   5656: checkcast [B
    //   5659: invokevirtual clone : ()Ljava/lang/Object;
    //   5662: aastore
    //   5663: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5666: checkcast java/lang/Boolean
    //   5669: invokevirtual booleanValue : ()Z
    //   5672: istore_3
    //   5673: iload_2
    //   5674: ifne -> 5691
    //   5677: iinc #6, 1
    //   5680: iload_2
    //   5681: ifne -> 5551
    //   5684: goto -> 5691
    //   5687: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5690: athrow
    //   5691: iload_2
    //   5692: ifne -> 6033
    //   5695: sipush #-16423
    //   5698: sipush #30737
    //   5701: invokestatic a : (II)Ljava/lang/String;
    //   5704: iconst_1
    //   5705: ldc burp/Zkw
    //   5707: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5710: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5713: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5716: astore #4
    //   5718: aload #4
    //   5720: arraylength
    //   5721: istore #5
    //   5723: iconst_0
    //   5724: istore #6
    //   5726: iload #6
    //   5728: iload #5
    //   5730: if_icmpge -> 5868
    //   5733: aload #4
    //   5735: iload #6
    //   5737: aaload
    //   5738: astore #7
    //   5740: aload #7
    //   5742: invokevirtual getModifiers : ()I
    //   5745: invokestatic isStatic : (I)Z
    //   5748: ifne -> 5758
    //   5751: goto -> 5861
    //   5754: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5757: athrow
    //   5758: aload #7
    //   5760: invokevirtual getType : ()Ljava/lang/Class;
    //   5763: astore #8
    //   5765: aload #8
    //   5767: ifnull -> 5848
    //   5770: aload #8
    //   5772: invokevirtual isPrimitive : ()Z
    //   5775: ifne -> 5848
    //   5778: goto -> 5785
    //   5781: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5784: athrow
    //   5785: aload #8
    //   5787: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5790: ifnull -> 5848
    //   5793: goto -> 5800
    //   5796: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5799: athrow
    //   5800: aload #8
    //   5802: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5805: invokevirtual getName : ()Ljava/lang/String;
    //   5808: ifnull -> 5848
    //   5811: goto -> 5818
    //   5814: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5817: athrow
    //   5818: aload #8
    //   5820: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5823: invokevirtual getName : ()Ljava/lang/String;
    //   5826: sipush #-16427
    //   5829: sipush #-31526
    //   5832: invokestatic a : (II)Ljava/lang/String;
    //   5835: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5838: ifne -> 5848
    //   5841: goto -> 5848
    //   5844: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5847: athrow
    //   5848: aload #7
    //   5850: iconst_1
    //   5851: invokevirtual setAccessible : (Z)V
    //   5854: aload #7
    //   5856: aconst_null
    //   5857: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5860: pop
    //   5861: iinc #6, 1
    //   5864: iload_2
    //   5865: ifne -> 5726
    //   5868: sipush #-16439
    //   5871: sipush #-8431
    //   5874: invokestatic a : (II)Ljava/lang/String;
    //   5877: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5880: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5883: astore #4
    //   5885: aload #4
    //   5887: arraylength
    //   5888: istore #5
    //   5890: iconst_0
    //   5891: istore #6
    //   5893: iload #6
    //   5895: iload #5
    //   5897: if_icmpge -> 6033
    //   5900: aload #4
    //   5902: iload #6
    //   5904: aaload
    //   5905: astore #7
    //   5907: aload #7
    //   5909: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5912: pop
    //   5913: aload #7
    //   5915: invokevirtual getModifiers : ()I
    //   5918: invokestatic isStatic : (I)Z
    //   5921: ifeq -> 6019
    //   5924: aload #7
    //   5926: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5929: arraylength
    //   5930: iconst_2
    //   5931: if_icmpne -> 6019
    //   5934: goto -> 5941
    //   5937: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5940: athrow
    //   5941: aload #7
    //   5943: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5946: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5949: if_acmpne -> 6019
    //   5952: goto -> 5959
    //   5955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5958: athrow
    //   5959: aload #7
    //   5961: iconst_1
    //   5962: invokevirtual setAccessible : (Z)V
    //   5965: aload #7
    //   5967: aconst_null
    //   5968: iconst_2
    //   5969: anewarray java/lang/Object
    //   5972: dup
    //   5973: iconst_0
    //   5974: aload_0
    //   5975: aastore
    //   5976: dup
    //   5977: iconst_1
    //   5978: aload_1
    //   5979: ifnonnull -> 5997
    //   5982: goto -> 5989
    //   5985: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5988: athrow
    //   5989: aload_1
    //   5990: goto -> 6004
    //   5993: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5996: athrow
    //   5997: aload_1
    //   5998: checkcast [B
    //   6001: invokevirtual clone : ()Ljava/lang/Object;
    //   6004: aastore
    //   6005: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6008: checkcast java/lang/Boolean
    //   6011: invokevirtual booleanValue : ()Z
    //   6014: istore_3
    //   6015: iload_2
    //   6016: ifne -> 6033
    //   6019: iinc #6, 1
    //   6022: iload_2
    //   6023: ifne -> 5893
    //   6026: goto -> 6033
    //   6029: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6032: athrow
    //   6033: iload_3
    //   6034: ireturn
    //   6035: astore_3
    //   6036: new java/lang/Exception
    //   6039: dup
    //   6040: aload_3
    //   6041: invokevirtual getMessage : ()Ljava/lang/String;
    //   6044: invokespecial <init> : (Ljava/lang/String;)V
    //   6047: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3845	6035	java/lang/Throwable
    //   167	182	182	java/lang/Throwable
    //   1184	1210	1210	java/lang/Throwable
    //   1291	1306	1306	java/lang/Throwable
    //   2488	2513	2516	java/lang/Throwable
    //   2827	2841	2841	java/lang/Throwable
    //   2852	2865	2868	java/lang/Throwable
    //   2857	2880	2883	java/lang/Throwable
    //   2872	2898	2901	java/lang/Throwable
    //   2887	2928	2931	java/lang/Throwable
    //   2991	3018	3021	java/lang/Throwable
    //   3008	3039	3042	java/lang/Throwable
    //   3025	3069	3072	java/lang/Throwable
    //   3046	3080	3080	java/lang/Throwable
    //   3091	3107	3110	java/lang/Throwable
    //   3206	3220	3220	java/lang/Throwable
    //   3231	3244	3247	java/lang/Throwable
    //   3236	3259	3262	java/lang/Throwable
    //   3251	3277	3280	java/lang/Throwable
    //   3266	3307	3310	java/lang/Throwable
    //   3373	3400	3403	java/lang/Throwable
    //   3390	3418	3421	java/lang/Throwable
    //   3407	3448	3451	java/lang/Throwable
    //   3425	3459	3459	java/lang/Throwable
    //   3481	3492	3495	java/lang/Throwable
    //   3547	3561	3561	java/lang/Throwable
    //   3572	3585	3588	java/lang/Throwable
    //   3577	3600	3603	java/lang/Throwable
    //   3592	3618	3621	java/lang/Throwable
    //   3607	3648	3651	java/lang/Throwable
    //   3714	3741	3744	java/lang/Throwable
    //   3731	3759	3762	java/lang/Throwable
    //   3748	3789	3792	java/lang/Throwable
    //   3766	3800	3800	java/lang/Throwable
    //   3822	3833	3836	java/lang/Throwable
    //   3846	4576	6035	java/lang/Throwable
    //   3936	3950	3950	java/lang/Throwable
    //   3961	3974	3977	java/lang/Throwable
    //   3966	3989	3992	java/lang/Throwable
    //   3981	4007	4010	java/lang/Throwable
    //   3996	4037	4040	java/lang/Throwable
    //   4103	4130	4133	java/lang/Throwable
    //   4120	4148	4151	java/lang/Throwable
    //   4137	4178	4181	java/lang/Throwable
    //   4155	4189	4189	java/lang/Throwable
    //   4211	4222	4225	java/lang/Throwable
    //   4278	4292	4292	java/lang/Throwable
    //   4303	4316	4319	java/lang/Throwable
    //   4308	4331	4334	java/lang/Throwable
    //   4323	4349	4352	java/lang/Throwable
    //   4338	4379	4382	java/lang/Throwable
    //   4445	4472	4475	java/lang/Throwable
    //   4462	4490	4493	java/lang/Throwable
    //   4479	4520	4523	java/lang/Throwable
    //   4497	4531	4531	java/lang/Throwable
    //   4553	4564	4567	java/lang/Throwable
    //   4577	5307	6035	java/lang/Throwable
    //   4667	4681	4681	java/lang/Throwable
    //   4692	4705	4708	java/lang/Throwable
    //   4697	4720	4723	java/lang/Throwable
    //   4712	4738	4741	java/lang/Throwable
    //   4727	4768	4771	java/lang/Throwable
    //   4834	4861	4864	java/lang/Throwable
    //   4851	4879	4882	java/lang/Throwable
    //   4868	4909	4912	java/lang/Throwable
    //   4886	4920	4920	java/lang/Throwable
    //   4942	4953	4956	java/lang/Throwable
    //   5009	5023	5023	java/lang/Throwable
    //   5034	5047	5050	java/lang/Throwable
    //   5039	5062	5065	java/lang/Throwable
    //   5054	5080	5083	java/lang/Throwable
    //   5069	5110	5113	java/lang/Throwable
    //   5176	5203	5206	java/lang/Throwable
    //   5193	5221	5224	java/lang/Throwable
    //   5210	5251	5254	java/lang/Throwable
    //   5228	5262	5262	java/lang/Throwable
    //   5284	5295	5298	java/lang/Throwable
    //   5308	6034	6035	java/lang/Throwable
    //   5398	5412	5412	java/lang/Throwable
    //   5423	5436	5439	java/lang/Throwable
    //   5428	5451	5454	java/lang/Throwable
    //   5443	5469	5472	java/lang/Throwable
    //   5458	5499	5502	java/lang/Throwable
    //   5565	5592	5595	java/lang/Throwable
    //   5582	5610	5613	java/lang/Throwable
    //   5599	5640	5643	java/lang/Throwable
    //   5617	5651	5651	java/lang/Throwable
    //   5673	5684	5687	java/lang/Throwable
    //   5740	5754	5754	java/lang/Throwable
    //   5765	5778	5781	java/lang/Throwable
    //   5770	5793	5796	java/lang/Throwable
    //   5785	5811	5814	java/lang/Throwable
    //   5800	5841	5844	java/lang/Throwable
    //   5907	5934	5937	java/lang/Throwable
    //   5924	5952	5955	java/lang/Throwable
    //   5941	5982	5985	java/lang/Throwable
    //   5959	5993	5993	java/lang/Throwable
    //   6015	6026	6029	java/lang/Throwable
  }
  
  static void ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zd(Object paramObject) {
    Zvh.ZP = a(-16435, -9179);
    Zvh.Zb = new BigInteger(a(-16440, 19291));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zeub.ZT.charAt(Math.abs(((BigInteger)Zemp.Zr).intValue() % 32)) > Zrle.ZG.charAt(Math.abs(((BigInteger)Zrom.ZF).intValue() % 32))) {
          try {
            Zm_u.Zi(Class.forName(a(-16425, -19071)));
            if (bool)
              Zx58.ZU(Class.forName(a(-16420, 10649))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zx58.ZU(Class.forName(a(-16420, 10649)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '揵眇漓〇术ﺘꭤ쪉줁滛䟏궮ꈶ鲆物띕鏱㘚㒰燪ㄝѻ⌚ᣝ׬ݔ肃늙ऻ⳩᭴婽刣훠⧹⾐卪e⃣높檜빹䪠壥킰꫈䍼㍐䖰ʍ僷鼇兟䃧鋩㡕뱨?လ춺ᎎ彯䑺쐴縉搱᧽怙作≵遟䚡룟?௾㪸䥨⒎슡걑酀㟋跏亩泵敺긓먙○᱋둡琏䯇讌灂떕䢇憄坰蛙ᶐ须椆軪鯱螩츸⢇豬覑뿜䈻䄣ⶃ뀣뮽 @L¹2¯8G½¿Z7CGùjC¶à5Ùhj£êëÛ>E\\tsVzCWtÜ\\tèr\\tÇþÇ×<=\\töÊ¸(ÐÃ\\tÚEO!6Ñ¥G\\bÅH¬J/H&]Vèñ\\n÷-¯0iÀ¥G\\tþÔVEõ¯%\\t¥ ¸Ë(qÞ·\\tfeØ%Ä¾\\t^Cßá$±F\\tF«JõÞ\\t×j%r¤X\\t;ès±­+gCF«>´Ó\\t5Ø²m.m½MÐTzm¦+ë(tbs.®^2Þ8Y?cßÓÞÀPqê ëóÍrËS2ûÓõ;0¸k*È¥uieP¹ÅòÔQ=§"0Û@\\bè\\túþ`ÌÅ\\tÿõë7¢ÙCâ\\b\\t3ÅïgÂâ\\r\\tÔãõÁö¶ «÷¨ )E¡Êðr*JTáZîËÐÓVÑgH\\tig9eøªG\\tõªªjN±'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #128
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #58
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
    //   69: ldc '`l&\\t§ý掟瞵漱ご期ﺆꬖ쨾줻祥䟼궊ꈤ鱶牟뜿鍃㘣㓣燴ㅯӌ⌠ᡟןݰ肑늯॑ⱛ᭍婟剰훐⧧⿢叝_⁡놡檸빫䩐壓탚ꩺ䍅㍲䗣ʽ僩齵凨䃝鉫㡦뱌?წ췐ጼ彖䑘쑧縹搯ᦏ悮佦⋷遬䚅룍?ை㨊䥑⒬싲걡酞㟱赍亚泑斊긥멳╹ᱲ둃琿䯙课烵떯䠅憠坢蘩ᶦ飉椿軈鮢螙츦⣵賛覫뽞䈈䄇ⶑ냓뮋'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #9
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #8
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
    //   130: putstatic burp/Zr36.a : [Ljava/lang/String;
    //   133: bipush #28
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zr36.b : [Ljava/lang/String;
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
    //   212: bipush #64
    //   214: goto -> 244
    //   217: bipush #106
    //   219: goto -> 244
    //   222: bipush #61
    //   224: goto -> 244
    //   227: bipush #18
    //   229: goto -> 244
    //   232: bipush #23
    //   234: goto -> 244
    //   237: bipush #36
    //   239: goto -> 244
    //   242: bipush #17
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
    //   300: sipush #-16421
    //   303: sipush #-30354
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zr36.Ze : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #40
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-20
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-82
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #69
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-31
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-113
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: iconst_0
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #93
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #15
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-90
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-13
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-113
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #6
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-89
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-45
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-86
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #55
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #88
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-57
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-125
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-88
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #120
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-103
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #79
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: iconst_4
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #-122
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #-19
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #-126
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #-3
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #71
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #-81
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #-87
    //   504: bastore
    //   505: invokespecial <init> : (I[B)V
    //   508: putstatic burp/Zr36.Za : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBFDA) & 0xFFFF;
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
      char c = 'á';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr36.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */