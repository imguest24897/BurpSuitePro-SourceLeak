package burp;

import java.math.BigInteger;

class Zsqy extends ClassLoader {
  static String Zo;
  
  static Object ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZB(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: getstatic burp/Zxe.ZD : Ljava/lang/String;
    //   15: astore #4
    //   17: iconst_0
    //   18: istore #5
    //   20: iload #5
    //   22: aload #4
    //   24: invokevirtual length : ()I
    //   27: if_icmpge -> 57
    //   30: aload_3
    //   31: aload #4
    //   33: iload #5
    //   35: iload #5
    //   37: iconst_2
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: bipush #16
    //   44: invokestatic parseInt : (Ljava/lang/String;I)I
    //   47: invokevirtual write : (I)V
    //   50: iinc #5, 2
    //   53: iload_2
    //   54: ifne -> 20
    //   57: aload_3
    //   58: invokevirtual toByteArray : ()[B
    //   61: astore #5
    //   63: getstatic burp/Zg6f.Zl : Ljava/lang/Object;
    //   66: checkcast java/math/BigInteger
    //   69: invokevirtual toByteArray : ()[B
    //   72: astore #6
    //   74: sipush #256
    //   77: newarray byte
    //   79: astore #8
    //   81: sipush #256
    //   84: newarray int
    //   86: astore #9
    //   88: sipush #256
    //   91: newarray int
    //   93: astore #10
    //   95: sipush #256
    //   98: newarray int
    //   100: astore #11
    //   102: sipush #256
    //   105: newarray int
    //   107: astore #12
    //   109: bipush #10
    //   111: newarray int
    //   113: astore #13
    //   115: sipush #283
    //   118: istore #14
    //   120: iconst_0
    //   121: istore #16
    //   123: iload #16
    //   125: sipush #256
    //   128: if_icmpge -> 362
    //   131: sipush #7381
    //   134: sipush #17607
    //   137: invokestatic a : (II)Ljava/lang/String;
    //   140: iload #16
    //   142: iconst_1
    //   143: iushr
    //   144: invokevirtual charAt : (I)C
    //   147: istore #25
    //   149: iload #16
    //   151: iconst_1
    //   152: iand
    //   153: ifne -> 168
    //   156: iload #25
    //   158: bipush #8
    //   160: iushr
    //   161: goto -> 170
    //   164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   167: athrow
    //   168: iload #25
    //   170: i2b
    //   171: sipush #255
    //   174: iand
    //   175: istore #15
    //   177: iload #16
    //   179: iconst_1
    //   180: ishl
    //   181: istore #17
    //   183: iload #17
    //   185: sipush #256
    //   188: if_icmplt -> 198
    //   191: iload #17
    //   193: iload #14
    //   195: ixor
    //   196: istore #17
    //   198: iload #17
    //   200: iconst_1
    //   201: ishl
    //   202: istore #18
    //   204: iload #18
    //   206: sipush #256
    //   209: if_icmplt -> 219
    //   212: iload #18
    //   214: iload #14
    //   216: ixor
    //   217: istore #18
    //   219: iload #18
    //   221: iconst_1
    //   222: ishl
    //   223: istore #19
    //   225: iload #19
    //   227: sipush #256
    //   230: if_icmplt -> 240
    //   233: iload #19
    //   235: iload #14
    //   237: ixor
    //   238: istore #19
    //   240: iload #19
    //   242: iload #16
    //   244: ixor
    //   245: istore #20
    //   247: iload #20
    //   249: iload #17
    //   251: ixor
    //   252: istore #21
    //   254: iload #20
    //   256: iload #18
    //   258: ixor
    //   259: istore #22
    //   261: iload #19
    //   263: iload #18
    //   265: ixor
    //   266: iload #17
    //   268: ixor
    //   269: istore #23
    //   271: aload #8
    //   273: iload #16
    //   275: iload #15
    //   277: i2b
    //   278: bastore
    //   279: aload #9
    //   281: iload #15
    //   283: iload #23
    //   285: bipush #24
    //   287: ishl
    //   288: iload #20
    //   290: bipush #16
    //   292: ishl
    //   293: ior
    //   294: iload #22
    //   296: bipush #8
    //   298: ishl
    //   299: ior
    //   300: iload #21
    //   302: ior
    //   303: dup
    //   304: istore #24
    //   306: iastore
    //   307: aload #10
    //   309: iload #15
    //   311: iload #24
    //   313: bipush #8
    //   315: iushr
    //   316: iload #24
    //   318: bipush #24
    //   320: ishl
    //   321: ior
    //   322: iastore
    //   323: aload #11
    //   325: iload #15
    //   327: iload #24
    //   329: bipush #16
    //   331: iushr
    //   332: iload #24
    //   334: bipush #16
    //   336: ishl
    //   337: ior
    //   338: iastore
    //   339: aload #12
    //   341: iload #15
    //   343: iload #24
    //   345: bipush #24
    //   347: iushr
    //   348: iload #24
    //   350: bipush #8
    //   352: ishl
    //   353: ior
    //   354: iastore
    //   355: iinc #16, 1
    //   358: iload_2
    //   359: ifne -> 123
    //   362: iconst_1
    //   363: istore #25
    //   365: aload #13
    //   367: iconst_0
    //   368: iload #25
    //   370: bipush #24
    //   372: ishl
    //   373: iastore
    //   374: iconst_1
    //   375: istore #26
    //   377: iload #26
    //   379: bipush #10
    //   381: if_icmpge -> 422
    //   384: iload #25
    //   386: iconst_1
    //   387: ishl
    //   388: istore #25
    //   390: iload #25
    //   392: sipush #256
    //   395: if_icmplt -> 405
    //   398: iload #25
    //   400: iload #14
    //   402: ixor
    //   403: istore #25
    //   405: aload #13
    //   407: iload #26
    //   409: iload #25
    //   411: bipush #24
    //   413: ishl
    //   414: iastore
    //   415: iinc #26, 1
    //   418: iload_2
    //   419: ifne -> 377
    //   422: iconst_4
    //   423: istore #26
    //   425: iload #26
    //   427: bipush #6
    //   429: iadd
    //   430: istore #27
    //   432: iconst_4
    //   433: iload #27
    //   435: iconst_1
    //   436: iadd
    //   437: imul
    //   438: istore #28
    //   440: iload #28
    //   442: newarray int
    //   444: astore #29
    //   446: iload #28
    //   448: newarray int
    //   450: astore #30
    //   452: iconst_0
    //   453: istore #25
    //   455: iconst_0
    //   456: istore #32
    //   458: iconst_0
    //   459: istore #33
    //   461: iload #32
    //   463: iload #26
    //   465: if_icmpge -> 533
    //   468: aload #29
    //   470: iload #32
    //   472: aload #5
    //   474: iload #33
    //   476: baload
    //   477: bipush #24
    //   479: ishl
    //   480: aload #5
    //   482: iload #33
    //   484: iconst_1
    //   485: iadd
    //   486: baload
    //   487: sipush #255
    //   490: iand
    //   491: bipush #16
    //   493: ishl
    //   494: ior
    //   495: aload #5
    //   497: iload #33
    //   499: iconst_2
    //   500: iadd
    //   501: baload
    //   502: sipush #255
    //   505: iand
    //   506: bipush #8
    //   508: ishl
    //   509: ior
    //   510: aload #5
    //   512: iload #33
    //   514: iconst_3
    //   515: iadd
    //   516: baload
    //   517: sipush #255
    //   520: iand
    //   521: ior
    //   522: iastore
    //   523: iinc #32, 1
    //   526: iinc #33, 4
    //   529: iload_2
    //   530: ifne -> 461
    //   533: iload #26
    //   535: istore #32
    //   537: iconst_0
    //   538: istore #33
    //   540: iload #32
    //   542: iload #28
    //   544: if_icmpge -> 671
    //   547: aload #29
    //   549: iload #32
    //   551: iconst_1
    //   552: isub
    //   553: iaload
    //   554: istore #31
    //   556: iload #33
    //   558: ifne -> 645
    //   561: iload #26
    //   563: istore #33
    //   565: aload #8
    //   567: iload #31
    //   569: bipush #16
    //   571: iushr
    //   572: sipush #255
    //   575: iand
    //   576: baload
    //   577: bipush #24
    //   579: ishl
    //   580: aload #8
    //   582: iload #31
    //   584: bipush #8
    //   586: iushr
    //   587: sipush #255
    //   590: iand
    //   591: baload
    //   592: sipush #255
    //   595: iand
    //   596: bipush #16
    //   598: ishl
    //   599: ior
    //   600: aload #8
    //   602: iload #31
    //   604: sipush #255
    //   607: iand
    //   608: baload
    //   609: sipush #255
    //   612: iand
    //   613: bipush #8
    //   615: ishl
    //   616: ior
    //   617: aload #8
    //   619: iload #31
    //   621: bipush #24
    //   623: iushr
    //   624: baload
    //   625: sipush #255
    //   628: iand
    //   629: ior
    //   630: istore #31
    //   632: iload #31
    //   634: aload #13
    //   636: iload #25
    //   638: iinc #25, 1
    //   641: iaload
    //   642: ixor
    //   643: istore #31
    //   645: aload #29
    //   647: iload #32
    //   649: aload #29
    //   651: iload #32
    //   653: iload #26
    //   655: isub
    //   656: iaload
    //   657: iload #31
    //   659: ixor
    //   660: iastore
    //   661: iinc #32, 1
    //   664: iinc #33, -1
    //   667: iload_2
    //   668: ifne -> 540
    //   671: iconst_0
    //   672: istore #32
    //   674: iconst_4
    //   675: iload #27
    //   677: imul
    //   678: istore #33
    //   680: aload #30
    //   682: iload #32
    //   684: aload #29
    //   686: iload #33
    //   688: iaload
    //   689: iastore
    //   690: aload #30
    //   692: iload #32
    //   694: iconst_1
    //   695: iadd
    //   696: aload #29
    //   698: iload #33
    //   700: iconst_1
    //   701: iadd
    //   702: iaload
    //   703: iastore
    //   704: aload #30
    //   706: iload #32
    //   708: iconst_2
    //   709: iadd
    //   710: aload #29
    //   712: iload #33
    //   714: iconst_2
    //   715: iadd
    //   716: iaload
    //   717: iastore
    //   718: aload #30
    //   720: iload #32
    //   722: iconst_3
    //   723: iadd
    //   724: aload #29
    //   726: iload #33
    //   728: iconst_3
    //   729: iadd
    //   730: iaload
    //   731: iastore
    //   732: iinc #32, 4
    //   735: iinc #33, -4
    //   738: iconst_1
    //   739: istore #35
    //   741: iload #35
    //   743: iload #27
    //   745: if_icmpge -> 1109
    //   748: aload #29
    //   750: iload #33
    //   752: iaload
    //   753: istore #34
    //   755: aload #30
    //   757: iload #32
    //   759: aload #9
    //   761: aload #8
    //   763: iload #34
    //   765: bipush #24
    //   767: iushr
    //   768: baload
    //   769: sipush #255
    //   772: iand
    //   773: iaload
    //   774: aload #10
    //   776: aload #8
    //   778: iload #34
    //   780: bipush #16
    //   782: iushr
    //   783: sipush #255
    //   786: iand
    //   787: baload
    //   788: sipush #255
    //   791: iand
    //   792: iaload
    //   793: ixor
    //   794: aload #11
    //   796: aload #8
    //   798: iload #34
    //   800: bipush #8
    //   802: iushr
    //   803: sipush #255
    //   806: iand
    //   807: baload
    //   808: sipush #255
    //   811: iand
    //   812: iaload
    //   813: ixor
    //   814: aload #12
    //   816: aload #8
    //   818: iload #34
    //   820: sipush #255
    //   823: iand
    //   824: baload
    //   825: sipush #255
    //   828: iand
    //   829: iaload
    //   830: ixor
    //   831: iastore
    //   832: aload #29
    //   834: iload #33
    //   836: iconst_1
    //   837: iadd
    //   838: iaload
    //   839: istore #34
    //   841: aload #30
    //   843: iload #32
    //   845: iconst_1
    //   846: iadd
    //   847: aload #9
    //   849: aload #8
    //   851: iload #34
    //   853: bipush #24
    //   855: iushr
    //   856: baload
    //   857: sipush #255
    //   860: iand
    //   861: iaload
    //   862: aload #10
    //   864: aload #8
    //   866: iload #34
    //   868: bipush #16
    //   870: iushr
    //   871: sipush #255
    //   874: iand
    //   875: baload
    //   876: sipush #255
    //   879: iand
    //   880: iaload
    //   881: ixor
    //   882: aload #11
    //   884: aload #8
    //   886: iload #34
    //   888: bipush #8
    //   890: iushr
    //   891: sipush #255
    //   894: iand
    //   895: baload
    //   896: sipush #255
    //   899: iand
    //   900: iaload
    //   901: ixor
    //   902: aload #12
    //   904: aload #8
    //   906: iload #34
    //   908: sipush #255
    //   911: iand
    //   912: baload
    //   913: sipush #255
    //   916: iand
    //   917: iaload
    //   918: ixor
    //   919: iastore
    //   920: aload #29
    //   922: iload #33
    //   924: iconst_2
    //   925: iadd
    //   926: iaload
    //   927: istore #34
    //   929: aload #30
    //   931: iload #32
    //   933: iconst_2
    //   934: iadd
    //   935: aload #9
    //   937: aload #8
    //   939: iload #34
    //   941: bipush #24
    //   943: iushr
    //   944: baload
    //   945: sipush #255
    //   948: iand
    //   949: iaload
    //   950: aload #10
    //   952: aload #8
    //   954: iload #34
    //   956: bipush #16
    //   958: iushr
    //   959: sipush #255
    //   962: iand
    //   963: baload
    //   964: sipush #255
    //   967: iand
    //   968: iaload
    //   969: ixor
    //   970: aload #11
    //   972: aload #8
    //   974: iload #34
    //   976: bipush #8
    //   978: iushr
    //   979: sipush #255
    //   982: iand
    //   983: baload
    //   984: sipush #255
    //   987: iand
    //   988: iaload
    //   989: ixor
    //   990: aload #12
    //   992: aload #8
    //   994: iload #34
    //   996: sipush #255
    //   999: iand
    //   1000: baload
    //   1001: sipush #255
    //   1004: iand
    //   1005: iaload
    //   1006: ixor
    //   1007: iastore
    //   1008: aload #29
    //   1010: iload #33
    //   1012: iconst_3
    //   1013: iadd
    //   1014: iaload
    //   1015: istore #34
    //   1017: aload #30
    //   1019: iload #32
    //   1021: iconst_3
    //   1022: iadd
    //   1023: aload #9
    //   1025: aload #8
    //   1027: iload #34
    //   1029: bipush #24
    //   1031: iushr
    //   1032: baload
    //   1033: sipush #255
    //   1036: iand
    //   1037: iaload
    //   1038: aload #10
    //   1040: aload #8
    //   1042: iload #34
    //   1044: bipush #16
    //   1046: iushr
    //   1047: sipush #255
    //   1050: iand
    //   1051: baload
    //   1052: sipush #255
    //   1055: iand
    //   1056: iaload
    //   1057: ixor
    //   1058: aload #11
    //   1060: aload #8
    //   1062: iload #34
    //   1064: bipush #8
    //   1066: iushr
    //   1067: sipush #255
    //   1070: iand
    //   1071: baload
    //   1072: sipush #255
    //   1075: iand
    //   1076: iaload
    //   1077: ixor
    //   1078: aload #12
    //   1080: aload #8
    //   1082: iload #34
    //   1084: sipush #255
    //   1087: iand
    //   1088: baload
    //   1089: sipush #255
    //   1092: iand
    //   1093: iaload
    //   1094: ixor
    //   1095: iastore
    //   1096: iinc #32, 4
    //   1099: iinc #33, -4
    //   1102: iinc #35, 1
    //   1105: iload_2
    //   1106: ifne -> 741
    //   1109: aload #30
    //   1111: iload #32
    //   1113: aload #29
    //   1115: iload #33
    //   1117: iaload
    //   1118: iastore
    //   1119: aload #30
    //   1121: iload #32
    //   1123: iconst_1
    //   1124: iadd
    //   1125: aload #29
    //   1127: iload #33
    //   1129: iconst_1
    //   1130: iadd
    //   1131: iaload
    //   1132: iastore
    //   1133: aload #30
    //   1135: iload #32
    //   1137: iconst_2
    //   1138: iadd
    //   1139: aload #29
    //   1141: iload #33
    //   1143: iconst_2
    //   1144: iadd
    //   1145: iaload
    //   1146: iastore
    //   1147: aload #30
    //   1149: iload #32
    //   1151: iconst_3
    //   1152: iadd
    //   1153: aload #29
    //   1155: iload #33
    //   1157: iconst_3
    //   1158: iadd
    //   1159: iaload
    //   1160: iastore
    //   1161: iconst_0
    //   1162: newarray byte
    //   1164: astore #35
    //   1166: aload #6
    //   1168: arraylength
    //   1169: bipush #16
    //   1171: irem
    //   1172: ifeq -> 1196
    //   1175: new java/lang/Exception
    //   1178: dup
    //   1179: sipush #7377
    //   1182: sipush #-30743
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: invokespecial <init> : (Ljava/lang/String;)V
    //   1191: athrow
    //   1192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1195: athrow
    //   1196: bipush #10
    //   1198: istore #36
    //   1200: sipush #7386
    //   1203: sipush #256
    //   1206: newarray byte
    //   1208: astore #37
    //   1210: sipush #-1196
    //   1213: sipush #256
    //   1216: newarray int
    //   1218: astore #38
    //   1220: sipush #256
    //   1223: newarray int
    //   1225: astore #39
    //   1227: sipush #256
    //   1230: newarray int
    //   1232: astore #40
    //   1234: sipush #256
    //   1237: newarray int
    //   1239: astore #41
    //   1241: sipush #283
    //   1244: istore #14
    //   1246: invokestatic a : (II)Ljava/lang/String;
    //   1249: astore #42
    //   1251: iconst_0
    //   1252: istore #16
    //   1254: iload #16
    //   1256: sipush #256
    //   1259: if_icmpge -> 1486
    //   1262: aload #42
    //   1264: iload #16
    //   1266: iconst_1
    //   1267: iushr
    //   1268: invokevirtual charAt : (I)C
    //   1271: istore #43
    //   1273: iload #16
    //   1275: iconst_1
    //   1276: iand
    //   1277: ifne -> 1292
    //   1280: iload #43
    //   1282: bipush #8
    //   1284: iushr
    //   1285: goto -> 1294
    //   1288: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1291: athrow
    //   1292: iload #43
    //   1294: i2b
    //   1295: sipush #255
    //   1298: iand
    //   1299: istore #15
    //   1301: iload #16
    //   1303: iconst_1
    //   1304: ishl
    //   1305: istore #17
    //   1307: iload #17
    //   1309: sipush #256
    //   1312: if_icmplt -> 1322
    //   1315: iload #17
    //   1317: iload #14
    //   1319: ixor
    //   1320: istore #17
    //   1322: iload #17
    //   1324: iconst_1
    //   1325: ishl
    //   1326: istore #18
    //   1328: iload #18
    //   1330: sipush #256
    //   1333: if_icmplt -> 1343
    //   1336: iload #18
    //   1338: iload #14
    //   1340: ixor
    //   1341: istore #18
    //   1343: iload #18
    //   1345: iconst_1
    //   1346: ishl
    //   1347: istore #19
    //   1349: iload #19
    //   1351: sipush #256
    //   1354: if_icmplt -> 1364
    //   1357: iload #19
    //   1359: iload #14
    //   1361: ixor
    //   1362: istore #19
    //   1364: iload #19
    //   1366: iload #16
    //   1368: ixor
    //   1369: istore #20
    //   1371: iload #20
    //   1373: iload #17
    //   1375: ixor
    //   1376: istore #21
    //   1378: iload #20
    //   1380: iload #18
    //   1382: ixor
    //   1383: istore #22
    //   1385: iload #19
    //   1387: iload #18
    //   1389: ixor
    //   1390: iload #17
    //   1392: ixor
    //   1393: istore #23
    //   1395: aload #37
    //   1397: iload #15
    //   1399: iload #16
    //   1401: i2b
    //   1402: bastore
    //   1403: aload #38
    //   1405: iload #15
    //   1407: iload #23
    //   1409: bipush #24
    //   1411: ishl
    //   1412: iload #20
    //   1414: bipush #16
    //   1416: ishl
    //   1417: ior
    //   1418: iload #22
    //   1420: bipush #8
    //   1422: ishl
    //   1423: ior
    //   1424: iload #21
    //   1426: ior
    //   1427: dup
    //   1428: istore #24
    //   1430: iastore
    //   1431: aload #39
    //   1433: iload #15
    //   1435: iload #24
    //   1437: bipush #8
    //   1439: iushr
    //   1440: iload #24
    //   1442: bipush #24
    //   1444: ishl
    //   1445: ior
    //   1446: iastore
    //   1447: aload #40
    //   1449: iload #15
    //   1451: iload #24
    //   1453: bipush #16
    //   1455: iushr
    //   1456: iload #24
    //   1458: bipush #16
    //   1460: ishl
    //   1461: ior
    //   1462: iastore
    //   1463: aload #41
    //   1465: iload #15
    //   1467: iload #24
    //   1469: bipush #24
    //   1471: iushr
    //   1472: iload #24
    //   1474: bipush #8
    //   1476: ishl
    //   1477: ior
    //   1478: iastore
    //   1479: iinc #16, 1
    //   1482: iload_2
    //   1483: ifne -> 1254
    //   1486: aload #6
    //   1488: arraylength
    //   1489: newarray byte
    //   1491: astore #43
    //   1493: iconst_0
    //   1494: istore #44
    //   1496: iload #44
    //   1498: aload #6
    //   1500: arraylength
    //   1501: bipush #16
    //   1503: idiv
    //   1504: if_icmpge -> 2418
    //   1507: bipush #16
    //   1509: newarray byte
    //   1511: astore #45
    //   1513: bipush #16
    //   1515: newarray byte
    //   1517: astore #46
    //   1519: iconst_0
    //   1520: istore #47
    //   1522: iload #47
    //   1524: bipush #16
    //   1526: if_icmpge -> 1552
    //   1529: aload #45
    //   1531: iload #47
    //   1533: aload #6
    //   1535: iload #47
    //   1537: iload #44
    //   1539: bipush #16
    //   1541: imul
    //   1542: iadd
    //   1543: baload
    //   1544: bastore
    //   1545: iinc #47, 1
    //   1548: iload_2
    //   1549: ifne -> 1522
    //   1552: iconst_0
    //   1553: istore #47
    //   1555: aload #45
    //   1557: iconst_0
    //   1558: baload
    //   1559: bipush #24
    //   1561: ishl
    //   1562: aload #45
    //   1564: iconst_1
    //   1565: baload
    //   1566: sipush #255
    //   1569: iand
    //   1570: bipush #16
    //   1572: ishl
    //   1573: ior
    //   1574: aload #45
    //   1576: iconst_2
    //   1577: baload
    //   1578: sipush #255
    //   1581: iand
    //   1582: bipush #8
    //   1584: ishl
    //   1585: ior
    //   1586: aload #45
    //   1588: iconst_3
    //   1589: baload
    //   1590: sipush #255
    //   1593: iand
    //   1594: ior
    //   1595: aload #30
    //   1597: iconst_0
    //   1598: iaload
    //   1599: ixor
    //   1600: istore #49
    //   1602: aload #45
    //   1604: iconst_4
    //   1605: baload
    //   1606: bipush #24
    //   1608: ishl
    //   1609: aload #45
    //   1611: iconst_5
    //   1612: baload
    //   1613: sipush #255
    //   1616: iand
    //   1617: bipush #16
    //   1619: ishl
    //   1620: ior
    //   1621: aload #45
    //   1623: bipush #6
    //   1625: baload
    //   1626: sipush #255
    //   1629: iand
    //   1630: bipush #8
    //   1632: ishl
    //   1633: ior
    //   1634: aload #45
    //   1636: bipush #7
    //   1638: baload
    //   1639: sipush #255
    //   1642: iand
    //   1643: ior
    //   1644: aload #30
    //   1646: iconst_1
    //   1647: iaload
    //   1648: ixor
    //   1649: istore #50
    //   1651: aload #45
    //   1653: bipush #8
    //   1655: baload
    //   1656: bipush #24
    //   1658: ishl
    //   1659: aload #45
    //   1661: bipush #9
    //   1663: baload
    //   1664: sipush #255
    //   1667: iand
    //   1668: bipush #16
    //   1670: ishl
    //   1671: ior
    //   1672: aload #45
    //   1674: bipush #10
    //   1676: baload
    //   1677: sipush #255
    //   1680: iand
    //   1681: bipush #8
    //   1683: ishl
    //   1684: ior
    //   1685: aload #45
    //   1687: bipush #11
    //   1689: baload
    //   1690: sipush #255
    //   1693: iand
    //   1694: ior
    //   1695: aload #30
    //   1697: iconst_2
    //   1698: iaload
    //   1699: ixor
    //   1700: istore #51
    //   1702: aload #45
    //   1704: bipush #12
    //   1706: baload
    //   1707: bipush #24
    //   1709: ishl
    //   1710: aload #45
    //   1712: bipush #13
    //   1714: baload
    //   1715: sipush #255
    //   1718: iand
    //   1719: bipush #16
    //   1721: ishl
    //   1722: ior
    //   1723: aload #45
    //   1725: bipush #14
    //   1727: baload
    //   1728: sipush #255
    //   1731: iand
    //   1732: bipush #8
    //   1734: ishl
    //   1735: ior
    //   1736: aload #45
    //   1738: bipush #15
    //   1740: baload
    //   1741: sipush #255
    //   1744: iand
    //   1745: ior
    //   1746: aload #30
    //   1748: iconst_3
    //   1749: iaload
    //   1750: ixor
    //   1751: istore #52
    //   1753: iconst_1
    //   1754: istore #53
    //   1756: iload #53
    //   1758: iload #36
    //   1760: if_icmpge -> 2003
    //   1763: iinc #47, 4
    //   1766: aload #38
    //   1768: iload #49
    //   1770: bipush #24
    //   1772: iushr
    //   1773: iaload
    //   1774: aload #39
    //   1776: iload #52
    //   1778: bipush #16
    //   1780: iushr
    //   1781: sipush #255
    //   1784: iand
    //   1785: iaload
    //   1786: ixor
    //   1787: aload #40
    //   1789: iload #51
    //   1791: bipush #8
    //   1793: iushr
    //   1794: sipush #255
    //   1797: iand
    //   1798: iaload
    //   1799: ixor
    //   1800: aload #41
    //   1802: iload #50
    //   1804: sipush #255
    //   1807: iand
    //   1808: iaload
    //   1809: ixor
    //   1810: aload #30
    //   1812: iload #47
    //   1814: iaload
    //   1815: ixor
    //   1816: istore #54
    //   1818: aload #38
    //   1820: iload #50
    //   1822: bipush #24
    //   1824: iushr
    //   1825: iaload
    //   1826: aload #39
    //   1828: iload #49
    //   1830: bipush #16
    //   1832: iushr
    //   1833: sipush #255
    //   1836: iand
    //   1837: iaload
    //   1838: ixor
    //   1839: aload #40
    //   1841: iload #52
    //   1843: bipush #8
    //   1845: iushr
    //   1846: sipush #255
    //   1849: iand
    //   1850: iaload
    //   1851: ixor
    //   1852: aload #41
    //   1854: iload #51
    //   1856: sipush #255
    //   1859: iand
    //   1860: iaload
    //   1861: ixor
    //   1862: aload #30
    //   1864: iload #47
    //   1866: iconst_1
    //   1867: iadd
    //   1868: iaload
    //   1869: ixor
    //   1870: istore #55
    //   1872: aload #38
    //   1874: iload #51
    //   1876: bipush #24
    //   1878: iushr
    //   1879: iaload
    //   1880: aload #39
    //   1882: iload #50
    //   1884: bipush #16
    //   1886: iushr
    //   1887: sipush #255
    //   1890: iand
    //   1891: iaload
    //   1892: ixor
    //   1893: aload #40
    //   1895: iload #49
    //   1897: bipush #8
    //   1899: iushr
    //   1900: sipush #255
    //   1903: iand
    //   1904: iaload
    //   1905: ixor
    //   1906: aload #41
    //   1908: iload #52
    //   1910: sipush #255
    //   1913: iand
    //   1914: iaload
    //   1915: ixor
    //   1916: aload #30
    //   1918: iload #47
    //   1920: iconst_2
    //   1921: iadd
    //   1922: iaload
    //   1923: ixor
    //   1924: istore #56
    //   1926: aload #38
    //   1928: iload #52
    //   1930: bipush #24
    //   1932: iushr
    //   1933: iaload
    //   1934: aload #39
    //   1936: iload #51
    //   1938: bipush #16
    //   1940: iushr
    //   1941: sipush #255
    //   1944: iand
    //   1945: iaload
    //   1946: ixor
    //   1947: aload #40
    //   1949: iload #50
    //   1951: bipush #8
    //   1953: iushr
    //   1954: sipush #255
    //   1957: iand
    //   1958: iaload
    //   1959: ixor
    //   1960: aload #41
    //   1962: iload #49
    //   1964: sipush #255
    //   1967: iand
    //   1968: iaload
    //   1969: ixor
    //   1970: aload #30
    //   1972: iload #47
    //   1974: iconst_3
    //   1975: iadd
    //   1976: iaload
    //   1977: ixor
    //   1978: istore #57
    //   1980: iload #54
    //   1982: istore #49
    //   1984: iload #55
    //   1986: istore #50
    //   1988: iload #56
    //   1990: istore #51
    //   1992: iload #57
    //   1994: istore #52
    //   1996: iinc #53, 1
    //   1999: iload_2
    //   2000: ifne -> 1756
    //   2003: iinc #47, 4
    //   2006: aload #30
    //   2008: iload #47
    //   2010: iaload
    //   2011: istore #48
    //   2013: aload #46
    //   2015: iconst_0
    //   2016: aload #37
    //   2018: iload #49
    //   2020: bipush #24
    //   2022: iushr
    //   2023: baload
    //   2024: iload #48
    //   2026: bipush #24
    //   2028: iushr
    //   2029: ixor
    //   2030: i2b
    //   2031: bastore
    //   2032: aload #46
    //   2034: iconst_1
    //   2035: aload #37
    //   2037: iload #52
    //   2039: bipush #16
    //   2041: iushr
    //   2042: sipush #255
    //   2045: iand
    //   2046: baload
    //   2047: iload #48
    //   2049: bipush #16
    //   2051: iushr
    //   2052: ixor
    //   2053: i2b
    //   2054: bastore
    //   2055: aload #46
    //   2057: iconst_2
    //   2058: aload #37
    //   2060: iload #51
    //   2062: bipush #8
    //   2064: iushr
    //   2065: sipush #255
    //   2068: iand
    //   2069: baload
    //   2070: iload #48
    //   2072: bipush #8
    //   2074: iushr
    //   2075: ixor
    //   2076: i2b
    //   2077: bastore
    //   2078: aload #46
    //   2080: iconst_3
    //   2081: aload #37
    //   2083: iload #50
    //   2085: sipush #255
    //   2088: iand
    //   2089: baload
    //   2090: iload #48
    //   2092: ixor
    //   2093: i2b
    //   2094: bastore
    //   2095: aload #30
    //   2097: iload #47
    //   2099: iconst_1
    //   2100: iadd
    //   2101: iaload
    //   2102: istore #48
    //   2104: aload #46
    //   2106: iconst_4
    //   2107: aload #37
    //   2109: iload #50
    //   2111: bipush #24
    //   2113: iushr
    //   2114: baload
    //   2115: iload #48
    //   2117: bipush #24
    //   2119: iushr
    //   2120: ixor
    //   2121: i2b
    //   2122: bastore
    //   2123: aload #46
    //   2125: iconst_5
    //   2126: aload #37
    //   2128: iload #49
    //   2130: bipush #16
    //   2132: iushr
    //   2133: sipush #255
    //   2136: iand
    //   2137: baload
    //   2138: iload #48
    //   2140: bipush #16
    //   2142: iushr
    //   2143: ixor
    //   2144: i2b
    //   2145: bastore
    //   2146: aload #46
    //   2148: bipush #6
    //   2150: aload #37
    //   2152: iload #52
    //   2154: bipush #8
    //   2156: iushr
    //   2157: sipush #255
    //   2160: iand
    //   2161: baload
    //   2162: iload #48
    //   2164: bipush #8
    //   2166: iushr
    //   2167: ixor
    //   2168: i2b
    //   2169: bastore
    //   2170: aload #46
    //   2172: bipush #7
    //   2174: aload #37
    //   2176: iload #51
    //   2178: sipush #255
    //   2181: iand
    //   2182: baload
    //   2183: iload #48
    //   2185: ixor
    //   2186: i2b
    //   2187: bastore
    //   2188: aload #30
    //   2190: iload #47
    //   2192: iconst_2
    //   2193: iadd
    //   2194: iaload
    //   2195: istore #48
    //   2197: aload #46
    //   2199: bipush #8
    //   2201: aload #37
    //   2203: iload #51
    //   2205: bipush #24
    //   2207: iushr
    //   2208: baload
    //   2209: iload #48
    //   2211: bipush #24
    //   2213: iushr
    //   2214: ixor
    //   2215: i2b
    //   2216: bastore
    //   2217: aload #46
    //   2219: bipush #9
    //   2221: aload #37
    //   2223: iload #50
    //   2225: bipush #16
    //   2227: iushr
    //   2228: sipush #255
    //   2231: iand
    //   2232: baload
    //   2233: iload #48
    //   2235: bipush #16
    //   2237: iushr
    //   2238: ixor
    //   2239: i2b
    //   2240: bastore
    //   2241: aload #46
    //   2243: bipush #10
    //   2245: aload #37
    //   2247: iload #49
    //   2249: bipush #8
    //   2251: iushr
    //   2252: sipush #255
    //   2255: iand
    //   2256: baload
    //   2257: iload #48
    //   2259: bipush #8
    //   2261: iushr
    //   2262: ixor
    //   2263: i2b
    //   2264: bastore
    //   2265: aload #46
    //   2267: bipush #11
    //   2269: aload #37
    //   2271: iload #52
    //   2273: sipush #255
    //   2276: iand
    //   2277: baload
    //   2278: iload #48
    //   2280: ixor
    //   2281: i2b
    //   2282: bastore
    //   2283: aload #30
    //   2285: iload #47
    //   2287: iconst_3
    //   2288: iadd
    //   2289: iaload
    //   2290: istore #48
    //   2292: aload #46
    //   2294: bipush #12
    //   2296: aload #37
    //   2298: iload #52
    //   2300: bipush #24
    //   2302: iushr
    //   2303: baload
    //   2304: iload #48
    //   2306: bipush #24
    //   2308: iushr
    //   2309: ixor
    //   2310: i2b
    //   2311: bastore
    //   2312: aload #46
    //   2314: bipush #13
    //   2316: aload #37
    //   2318: iload #51
    //   2320: bipush #16
    //   2322: iushr
    //   2323: sipush #255
    //   2326: iand
    //   2327: baload
    //   2328: iload #48
    //   2330: bipush #16
    //   2332: iushr
    //   2333: ixor
    //   2334: i2b
    //   2335: bastore
    //   2336: aload #46
    //   2338: bipush #14
    //   2340: aload #37
    //   2342: iload #50
    //   2344: bipush #8
    //   2346: iushr
    //   2347: sipush #255
    //   2350: iand
    //   2351: baload
    //   2352: iload #48
    //   2354: bipush #8
    //   2356: iushr
    //   2357: ixor
    //   2358: i2b
    //   2359: bastore
    //   2360: aload #46
    //   2362: bipush #15
    //   2364: aload #37
    //   2366: iload #49
    //   2368: sipush #255
    //   2371: iand
    //   2372: baload
    //   2373: iload #48
    //   2375: ixor
    //   2376: i2b
    //   2377: bastore
    //   2378: iconst_0
    //   2379: istore #53
    //   2381: iload #53
    //   2383: bipush #16
    //   2385: if_icmpge -> 2411
    //   2388: aload #43
    //   2390: iload #53
    //   2392: iload #44
    //   2394: bipush #16
    //   2396: imul
    //   2397: iadd
    //   2398: aload #46
    //   2400: iload #53
    //   2402: baload
    //   2403: bastore
    //   2404: iinc #53, 1
    //   2407: iload_2
    //   2408: ifne -> 2381
    //   2411: iinc #44, 1
    //   2414: iload_2
    //   2415: ifne -> 1496
    //   2418: aload #43
    //   2420: arraylength
    //   2421: ifle -> 2502
    //   2424: aload #43
    //   2426: aload #43
    //   2428: arraylength
    //   2429: iconst_1
    //   2430: isub
    //   2431: baload
    //   2432: istore #44
    //   2434: iload #44
    //   2436: bipush #16
    //   2438: if_icmple -> 2449
    //   2441: aload #43
    //   2443: astore #35
    //   2445: iload_2
    //   2446: ifne -> 2502
    //   2449: aload #43
    //   2451: arraylength
    //   2452: iload #44
    //   2454: isub
    //   2455: newarray byte
    //   2457: astore #35
    //   2459: iconst_0
    //   2460: istore #45
    //   2462: iload #45
    //   2464: aload #35
    //   2466: arraylength
    //   2467: if_icmpge -> 2502
    //   2470: iload #45
    //   2472: aload #43
    //   2474: arraylength
    //   2475: if_icmpge -> 2502
    //   2478: aload #35
    //   2480: iload #45
    //   2482: aload #43
    //   2484: iload #45
    //   2486: baload
    //   2487: bastore
    //   2488: iinc #45, 1
    //   2491: iload_2
    //   2492: ifne -> 2462
    //   2495: goto -> 2502
    //   2498: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2501: athrow
    //   2502: aload #35
    //   2504: astore #7
    //   2506: new java/math/BigInteger
    //   2509: dup
    //   2510: aload #7
    //   2512: invokespecial <init> : ([B)V
    //   2515: invokevirtual abs : ()Ljava/math/BigInteger;
    //   2518: putstatic burp/Zzoi.ZI : Ljava/lang/Object;
    //   2521: ldc2_w 8682522807148012
    //   2524: invokestatic currentTimeMillis : ()J
    //   2527: lxor
    //   2528: lstore #4
    //   2530: lload #4
    //   2532: ldc2_w 25214903917
    //   2535: lmul
    //   2536: ldc2_w 11
    //   2539: ladd
    //   2540: ldc2_w 281474976710655
    //   2543: land
    //   2544: lstore #4
    //   2546: lload #4
    //   2548: bipush #32
    //   2550: lshl
    //   2551: lstore #6
    //   2553: lload #4
    //   2555: ldc2_w 25214903917
    //   2558: lmul
    //   2559: ldc2_w 11
    //   2562: ladd
    //   2563: ldc2_w 281474976710655
    //   2566: land
    //   2567: lstore #4
    //   2569: lload #6
    //   2571: lload #4
    //   2573: ladd
    //   2574: lstore #6
    //   2576: bipush #16
    //   2578: newarray byte
    //   2580: dup
    //   2581: iconst_0
    //   2582: bipush #48
    //   2584: bastore
    //   2585: dup
    //   2586: iconst_1
    //   2587: bipush #49
    //   2589: bastore
    //   2590: dup
    //   2591: iconst_2
    //   2592: bipush #50
    //   2594: bastore
    //   2595: dup
    //   2596: iconst_3
    //   2597: bipush #51
    //   2599: bastore
    //   2600: dup
    //   2601: iconst_4
    //   2602: bipush #52
    //   2604: bastore
    //   2605: dup
    //   2606: iconst_5
    //   2607: bipush #53
    //   2609: bastore
    //   2610: dup
    //   2611: bipush #6
    //   2613: bipush #54
    //   2615: bastore
    //   2616: dup
    //   2617: bipush #7
    //   2619: bipush #55
    //   2621: bastore
    //   2622: dup
    //   2623: bipush #8
    //   2625: bipush #56
    //   2627: bastore
    //   2628: dup
    //   2629: bipush #9
    //   2631: bipush #57
    //   2633: bastore
    //   2634: dup
    //   2635: bipush #10
    //   2637: bipush #97
    //   2639: bastore
    //   2640: dup
    //   2641: bipush #11
    //   2643: bipush #98
    //   2645: bastore
    //   2646: dup
    //   2647: bipush #12
    //   2649: bipush #99
    //   2651: bastore
    //   2652: dup
    //   2653: bipush #13
    //   2655: bipush #100
    //   2657: bastore
    //   2658: dup
    //   2659: bipush #14
    //   2661: bipush #101
    //   2663: bastore
    //   2664: dup
    //   2665: bipush #15
    //   2667: bipush #102
    //   2669: bastore
    //   2670: astore #8
    //   2672: bipush #64
    //   2674: newarray byte
    //   2676: astore #9
    //   2678: bipush #64
    //   2680: istore #10
    //   2682: bipush #16
    //   2684: istore #11
    //   2686: iload #11
    //   2688: iconst_1
    //   2689: isub
    //   2690: i2l
    //   2691: lstore #12
    //   2693: aload #9
    //   2695: iinc #10, -1
    //   2698: iload #10
    //   2700: aload #8
    //   2702: lload #6
    //   2704: lload #12
    //   2706: land
    //   2707: l2i
    //   2708: baload
    //   2709: bastore
    //   2710: lload #6
    //   2712: iconst_4
    //   2713: lushr
    //   2714: lstore #6
    //   2716: lload #6
    //   2718: lconst_0
    //   2719: lcmp
    //   2720: ifne -> 2693
    //   2723: bipush #64
    //   2725: iload #10
    //   2727: isub
    //   2728: newarray byte
    //   2730: astore_3
    //   2731: iconst_0
    //   2732: istore #14
    //   2734: iload #14
    //   2736: aload_3
    //   2737: arraylength
    //   2738: if_icmpge -> 2760
    //   2741: aload_3
    //   2742: iload #14
    //   2744: aload #9
    //   2746: iload #10
    //   2748: iload #14
    //   2750: iadd
    //   2751: baload
    //   2752: bastore
    //   2753: iinc #14, 1
    //   2756: iload_2
    //   2757: ifne -> 2734
    //   2760: aload_3
    //   2761: arraylength
    //   2762: bipush #10
    //   2764: if_icmplt -> 2530
    //   2767: ldc2_w 8682522807148012
    //   2770: invokestatic currentTimeMillis : ()J
    //   2773: lxor
    //   2774: lstore #4
    //   2776: lload #4
    //   2778: ldc2_w 25214903917
    //   2781: lmul
    //   2782: ldc2_w 11
    //   2785: ladd
    //   2786: ldc2_w 281474976710655
    //   2789: land
    //   2790: lstore #4
    //   2792: lload #4
    //   2794: bipush #32
    //   2796: lshl
    //   2797: lstore #6
    //   2799: lload #4
    //   2801: ldc2_w 25214903917
    //   2804: lmul
    //   2805: ldc2_w 11
    //   2808: ladd
    //   2809: ldc2_w 281474976710655
    //   2812: land
    //   2813: lstore #4
    //   2815: lload #6
    //   2817: lload #4
    //   2819: ladd
    //   2820: lstore #6
    //   2822: bipush #16
    //   2824: newarray byte
    //   2826: dup
    //   2827: iconst_0
    //   2828: bipush #48
    //   2830: bastore
    //   2831: dup
    //   2832: iconst_1
    //   2833: bipush #49
    //   2835: bastore
    //   2836: dup
    //   2837: iconst_2
    //   2838: bipush #50
    //   2840: bastore
    //   2841: dup
    //   2842: iconst_3
    //   2843: bipush #51
    //   2845: bastore
    //   2846: dup
    //   2847: iconst_4
    //   2848: bipush #52
    //   2850: bastore
    //   2851: dup
    //   2852: iconst_5
    //   2853: bipush #53
    //   2855: bastore
    //   2856: dup
    //   2857: bipush #6
    //   2859: bipush #54
    //   2861: bastore
    //   2862: dup
    //   2863: bipush #7
    //   2865: bipush #55
    //   2867: bastore
    //   2868: dup
    //   2869: bipush #8
    //   2871: bipush #56
    //   2873: bastore
    //   2874: dup
    //   2875: bipush #9
    //   2877: bipush #57
    //   2879: bastore
    //   2880: dup
    //   2881: bipush #10
    //   2883: bipush #97
    //   2885: bastore
    //   2886: dup
    //   2887: bipush #11
    //   2889: bipush #98
    //   2891: bastore
    //   2892: dup
    //   2893: bipush #12
    //   2895: bipush #99
    //   2897: bastore
    //   2898: dup
    //   2899: bipush #13
    //   2901: bipush #100
    //   2903: bastore
    //   2904: dup
    //   2905: bipush #14
    //   2907: bipush #101
    //   2909: bastore
    //   2910: dup
    //   2911: bipush #15
    //   2913: bipush #102
    //   2915: bastore
    //   2916: astore #8
    //   2918: bipush #64
    //   2920: newarray byte
    //   2922: astore #9
    //   2924: bipush #64
    //   2926: istore #10
    //   2928: bipush #16
    //   2930: istore #11
    //   2932: iload #11
    //   2934: iconst_1
    //   2935: isub
    //   2936: i2l
    //   2937: lstore #12
    //   2939: aload #9
    //   2941: iinc #10, -1
    //   2944: iload #10
    //   2946: aload #8
    //   2948: lload #6
    //   2950: lload #12
    //   2952: land
    //   2953: l2i
    //   2954: baload
    //   2955: bastore
    //   2956: lload #6
    //   2958: iconst_4
    //   2959: lushr
    //   2960: lstore #6
    //   2962: lload #6
    //   2964: lconst_0
    //   2965: lcmp
    //   2966: ifne -> 2939
    //   2969: bipush #64
    //   2971: iload #10
    //   2973: isub
    //   2974: newarray byte
    //   2976: astore_3
    //   2977: iconst_0
    //   2978: istore #14
    //   2980: iload #14
    //   2982: aload_3
    //   2983: arraylength
    //   2984: if_icmpge -> 3006
    //   2987: aload_3
    //   2988: iload #14
    //   2990: aload #9
    //   2992: iload #10
    //   2994: iload #14
    //   2996: iadd
    //   2997: baload
    //   2998: bastore
    //   2999: iinc #14, 1
    //   3002: iload_2
    //   3003: ifne -> 2980
    //   3006: aload_3
    //   3007: arraylength
    //   3008: bipush #10
    //   3010: if_icmplt -> 2776
    //   3013: sipush #7389
    //   3016: sipush #-984
    //   3019: invokestatic a : (II)Ljava/lang/String;
    //   3022: iconst_1
    //   3023: ldc burp/Zb9q
    //   3025: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3028: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3031: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3034: astore_3
    //   3035: aload_3
    //   3036: arraylength
    //   3037: istore #4
    //   3039: iconst_0
    //   3040: istore #5
    //   3042: iload #5
    //   3044: iload #4
    //   3046: if_icmpge -> 3183
    //   3049: aload_3
    //   3050: iload #5
    //   3052: aaload
    //   3053: astore #6
    //   3055: aload #6
    //   3057: invokevirtual getModifiers : ()I
    //   3060: invokestatic isStatic : (I)Z
    //   3063: ifne -> 3073
    //   3066: goto -> 3176
    //   3069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3072: athrow
    //   3073: aload #6
    //   3075: invokevirtual getType : ()Ljava/lang/Class;
    //   3078: astore #7
    //   3080: aload #7
    //   3082: ifnull -> 3163
    //   3085: aload #7
    //   3087: invokevirtual isPrimitive : ()Z
    //   3090: ifne -> 3163
    //   3093: goto -> 3100
    //   3096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3099: athrow
    //   3100: aload #7
    //   3102: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3105: ifnull -> 3163
    //   3108: goto -> 3115
    //   3111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3114: athrow
    //   3115: aload #7
    //   3117: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3120: invokevirtual getName : ()Ljava/lang/String;
    //   3123: ifnull -> 3163
    //   3126: goto -> 3133
    //   3129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3132: athrow
    //   3133: aload #7
    //   3135: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3138: invokevirtual getName : ()Ljava/lang/String;
    //   3141: sipush #7376
    //   3144: sipush #-1877
    //   3147: invokestatic a : (II)Ljava/lang/String;
    //   3150: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3153: ifne -> 3163
    //   3156: goto -> 3163
    //   3159: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3162: athrow
    //   3163: aload #6
    //   3165: iconst_1
    //   3166: invokevirtual setAccessible : (Z)V
    //   3169: aload #6
    //   3171: aconst_null
    //   3172: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3175: pop
    //   3176: iinc #5, 1
    //   3179: iload_2
    //   3180: ifne -> 3042
    //   3183: sipush #7390
    //   3186: sipush #-8612
    //   3189: invokestatic a : (II)Ljava/lang/String;
    //   3192: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3195: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3198: astore_3
    //   3199: aload_3
    //   3200: arraylength
    //   3201: istore #4
    //   3203: iconst_0
    //   3204: istore #5
    //   3206: iload #5
    //   3208: iload #4
    //   3210: if_icmpge -> 3342
    //   3213: aload_3
    //   3214: iload #5
    //   3216: aaload
    //   3217: astore #6
    //   3219: aload #6
    //   3221: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3224: pop
    //   3225: aload #6
    //   3227: invokevirtual getModifiers : ()I
    //   3230: invokestatic isStatic : (I)Z
    //   3233: ifeq -> 3328
    //   3236: aload #6
    //   3238: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3241: arraylength
    //   3242: iconst_2
    //   3243: if_icmpne -> 3328
    //   3246: goto -> 3253
    //   3249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3252: athrow
    //   3253: aload #6
    //   3255: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3258: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   3261: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3264: ifeq -> 3328
    //   3267: goto -> 3274
    //   3270: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3273: athrow
    //   3274: aload #6
    //   3276: iconst_1
    //   3277: invokevirtual setAccessible : (Z)V
    //   3280: aload #6
    //   3282: aconst_null
    //   3283: iconst_2
    //   3284: anewarray java/lang/Object
    //   3287: dup
    //   3288: iconst_0
    //   3289: aload_0
    //   3290: aastore
    //   3291: dup
    //   3292: iconst_1
    //   3293: aload_1
    //   3294: ifnonnull -> 3312
    //   3297: goto -> 3304
    //   3300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3303: athrow
    //   3304: aload_1
    //   3305: goto -> 3319
    //   3308: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3311: athrow
    //   3312: aload_1
    //   3313: checkcast [B
    //   3316: invokevirtual clone : ()Ljava/lang/Object;
    //   3319: aastore
    //   3320: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3323: pop
    //   3324: iload_2
    //   3325: ifne -> 3342
    //   3328: iinc #5, 1
    //   3331: iload_2
    //   3332: ifne -> 3206
    //   3335: goto -> 3342
    //   3338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3341: athrow
    //   3342: new java/io/ByteArrayOutputStream
    //   3345: dup
    //   3346: invokespecial <init> : ()V
    //   3349: astore_3
    //   3350: sipush #7387
    //   3353: aload_3
    //   3354: sipush #202
    //   3357: invokevirtual write : (I)V
    //   3360: sipush #1951
    //   3363: aload_3
    //   3364: sipush #254
    //   3367: invokevirtual write : (I)V
    //   3370: aload_3
    //   3371: sipush #186
    //   3374: invokevirtual write : (I)V
    //   3377: aload_3
    //   3378: sipush #190
    //   3381: invokevirtual write : (I)V
    //   3384: aload_3
    //   3385: iconst_0
    //   3386: invokevirtual write : (I)V
    //   3389: aload_3
    //   3390: iconst_1
    //   3391: invokevirtual write : (I)V
    //   3394: aload_3
    //   3395: iconst_0
    //   3396: invokevirtual write : (I)V
    //   3399: aload_3
    //   3400: bipush #50
    //   3402: invokevirtual write : (I)V
    //   3405: aload_3
    //   3406: getstatic burp/Zewo.ZZ : Ljava/lang/Object;
    //   3409: checkcast java/math/BigInteger
    //   3412: invokevirtual toByteArray : ()[B
    //   3415: invokevirtual write : ([B)V
    //   3418: aload_3
    //   3419: getstatic burp/Zlwi.Zw : Ljava/lang/Object;
    //   3422: checkcast java/math/BigInteger
    //   3425: invokevirtual toByteArray : ()[B
    //   3428: invokevirtual write : ([B)V
    //   3431: aload_3
    //   3432: getstatic burp/Zzmc.Zg : Ljava/lang/Object;
    //   3435: checkcast java/math/BigInteger
    //   3438: invokevirtual toByteArray : ()[B
    //   3441: invokevirtual write : ([B)V
    //   3444: aload_3
    //   3445: invokevirtual toByteArray : ()[B
    //   3448: astore #4
    //   3450: aconst_null
    //   3451: astore #5
    //   3453: invokestatic a : (II)Ljava/lang/String;
    //   3456: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3459: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3462: astore #6
    //   3464: aload #6
    //   3466: arraylength
    //   3467: istore #7
    //   3469: iconst_0
    //   3470: istore #8
    //   3472: iload #8
    //   3474: iload #7
    //   3476: if_icmpge -> 3604
    //   3479: aload #6
    //   3481: iload #8
    //   3483: aaload
    //   3484: astore #9
    //   3486: aload #9
    //   3488: invokevirtual getName : ()Ljava/lang/String;
    //   3491: sipush #7382
    //   3494: sipush #1403
    //   3497: invokestatic a : (II)Ljava/lang/String;
    //   3500: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3503: ifeq -> 3597
    //   3506: aload #9
    //   3508: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3511: astore #10
    //   3513: aload #10
    //   3515: arraylength
    //   3516: iconst_4
    //   3517: if_icmpeq -> 3527
    //   3520: goto -> 3597
    //   3523: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3526: athrow
    //   3527: aload #10
    //   3529: iconst_0
    //   3530: aaload
    //   3531: ldc java/lang/String
    //   3533: if_acmpeq -> 3543
    //   3536: goto -> 3597
    //   3539: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3542: athrow
    //   3543: aload #10
    //   3545: iconst_1
    //   3546: aaload
    //   3547: ldc [B
    //   3549: if_acmpeq -> 3559
    //   3552: goto -> 3597
    //   3555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3558: athrow
    //   3559: aload #10
    //   3561: iconst_2
    //   3562: aaload
    //   3563: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   3566: if_acmpeq -> 3576
    //   3569: goto -> 3597
    //   3572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3575: athrow
    //   3576: aload #10
    //   3578: iconst_3
    //   3579: aaload
    //   3580: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   3583: if_acmpeq -> 3593
    //   3586: goto -> 3597
    //   3589: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3592: athrow
    //   3593: aload #9
    //   3595: astore #5
    //   3597: iinc #8, 1
    //   3600: iload_2
    //   3601: ifne -> 3472
    //   3604: aload #5
    //   3606: iconst_1
    //   3607: invokevirtual setAccessible : (Z)V
    //   3610: ldc burp/Zxzd
    //   3612: iconst_0
    //   3613: anewarray java/lang/Class
    //   3616: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   3619: astore #6
    //   3621: aload #6
    //   3623: iconst_1
    //   3624: invokevirtual setAccessible : (Z)V
    //   3627: aload #5
    //   3629: aload #6
    //   3631: iconst_0
    //   3632: anewarray java/lang/Object
    //   3635: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   3638: iconst_4
    //   3639: anewarray java/lang/Object
    //   3642: dup
    //   3643: iconst_0
    //   3644: sipush #7383
    //   3647: sipush #-25968
    //   3650: invokestatic a : (II)Ljava/lang/String;
    //   3653: aastore
    //   3654: dup
    //   3655: iconst_1
    //   3656: aload #4
    //   3658: aastore
    //   3659: dup
    //   3660: iconst_2
    //   3661: iconst_0
    //   3662: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3665: aastore
    //   3666: dup
    //   3667: iconst_3
    //   3668: aload #4
    //   3670: arraylength
    //   3671: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3674: aastore
    //   3675: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3678: pop
    //   3679: goto -> 3683
    //   3682: astore_3
    //   3683: getstatic burp/Zstb.Zd : Ljava/lang/String;
    //   3686: getstatic burp/Zsxo.Za : Ljava/lang/Object;
    //   3689: checkcast java/math/BigInteger
    //   3692: invokevirtual intValue : ()I
    //   3695: bipush #32
    //   3697: irem
    //   3698: invokestatic abs : (I)I
    //   3701: invokevirtual charAt : (I)C
    //   3704: getstatic burp/Ze5f.Zt : Ljava/lang/String;
    //   3707: getstatic burp/Zkll.Zl : Ljava/lang/Object;
    //   3710: checkcast java/math/BigInteger
    //   3713: invokevirtual intValue : ()I
    //   3716: bipush #32
    //   3718: irem
    //   3719: invokestatic abs : (I)I
    //   3722: invokevirtual charAt : (I)C
    //   3725: if_icmple -> 3832
    //   3728: getstatic burp/Zest.Zd : Ljava/lang/String;
    //   3731: getstatic burp/Zztk.Za : Ljava/lang/Object;
    //   3734: checkcast java/math/BigInteger
    //   3737: invokevirtual intValue : ()I
    //   3740: bipush #32
    //   3742: irem
    //   3743: invokestatic abs : (I)I
    //   3746: invokevirtual charAt : (I)C
    //   3749: getstatic burp/Zmsn.ZD : Ljava/lang/String;
    //   3752: getstatic burp/Zel.ZB : Ljava/lang/Object;
    //   3755: checkcast java/math/BigInteger
    //   3758: invokevirtual intValue : ()I
    //   3761: bipush #32
    //   3763: irem
    //   3764: invokestatic abs : (I)I
    //   3767: invokevirtual charAt : (I)C
    //   3770: if_icmple -> 3832
    //   3773: goto -> 3780
    //   3776: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3779: athrow
    //   3780: getstatic burp/Zeqg.Zh : Ljava/lang/String;
    //   3783: getstatic burp/Ztfh.Zo : Ljava/lang/Object;
    //   3786: checkcast java/math/BigInteger
    //   3789: invokevirtual intValue : ()I
    //   3792: bipush #32
    //   3794: irem
    //   3795: invokestatic abs : (I)I
    //   3798: invokevirtual charAt : (I)C
    //   3801: getstatic burp/Zkc8.Za : Ljava/lang/String;
    //   3804: getstatic burp/Zt5j.Zn : Ljava/lang/Object;
    //   3807: checkcast java/math/BigInteger
    //   3810: invokevirtual intValue : ()I
    //   3813: bipush #32
    //   3815: irem
    //   3816: invokestatic abs : (I)I
    //   3819: invokevirtual charAt : (I)C
    //   3822: if_icmple -> 3840
    //   3825: goto -> 3832
    //   3828: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3831: athrow
    //   3832: iconst_1
    //   3833: goto -> 3841
    //   3836: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3839: athrow
    //   3840: iconst_0
    //   3841: ireturn
    //   3842: astore_3
    //   3843: new java/lang/Exception
    //   3846: dup
    //   3847: aload_3
    //   3848: invokevirtual getMessage : ()Ljava/lang/String;
    //   3851: invokespecial <init> : (Ljava/lang/String;)V
    //   3854: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3841	3842	java/lang/Throwable
    //   149	164	164	java/lang/Throwable
    //   1166	1192	1192	java/lang/Throwable
    //   1273	1288	1288	java/lang/Throwable
    //   2470	2495	2498	java/lang/Throwable
    //   3055	3069	3069	java/lang/Throwable
    //   3080	3093	3096	java/lang/Throwable
    //   3085	3108	3111	java/lang/Throwable
    //   3100	3126	3129	java/lang/Throwable
    //   3115	3156	3159	java/lang/Throwable
    //   3219	3246	3249	java/lang/Throwable
    //   3236	3267	3270	java/lang/Throwable
    //   3253	3297	3300	java/lang/Throwable
    //   3274	3308	3308	java/lang/Throwable
    //   3319	3335	3338	java/lang/Throwable
    //   3342	3679	3682	java/lang/Throwable
    //   3513	3523	3523	java/lang/Throwable
    //   3527	3539	3539	java/lang/Throwable
    //   3543	3555	3555	java/lang/Throwable
    //   3559	3572	3572	java/lang/Throwable
    //   3576	3589	3589	java/lang/Throwable
    //   3683	3773	3776	java/lang/Throwable
    //   3728	3825	3828	java/lang/Throwable
    //   3780	3836	3836	java/lang/Throwable
  }
  
  static void Zr(Object paramObject) {
    Zzym.Zj = a(7391, -15165);
    Zzym.ZK = new BigInteger(a(7379, -6886));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zrpu.Zy.charAt(Math.abs(((BigInteger)Zl8f.ZA).intValue() % 32)) <= Zl8f.ZK.charAt(Math.abs(((BigInteger)Zl8f.ZA).intValue() % 32))) {
          try {
            Ze54.ZX(Class.forName(a(7380, 366)));
            if (bool)
              Zer1.Zx(Class.forName(a(7378, 15716))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zer1.Zx(Class.forName(a(7378, 15716)));
    } catch (Throwable throwable) {}
  }
  
  static void ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'å\\bkÄdJîaâç\\bË·-¿ë\\t8®´éo?按矿潋ブ柌ﺮꬬ쨏줙﨏䟌궴ꉚ鳱犤랪錏㛥㑃燔ㅖӻ⍳ᠥ׍ݿ胧뉒঵ⱸᮩ婻勘혱⧁⾪厅.‪놻檴븛䪥塁퀜ꩨ䎩㍕䕍ȭ傠鼟冁䂤鈣㡺백?ျ촞ጭ徼䐎쒦纋摗᧭惄伙⋎速䛚룣?୨㩪䧔ⓘ숂곛鄥㟡赖付沆敓껴뫔┻᳆됿璃䯓诵烌떎䠖懱圾蚟ᵕ颃榈躲鬠蝊츎⣏質覉뽋䈸䄹ⷯ끔뭰\\t¥¿k vèêM³KÚÍö2!Lë8~LßÏåÓµFòiî%åñCª# <5®PðààUì^!sÂéxw[HëÑy@·C8²úõwæFöÍ%åÁü\§zû>Ô»çç4v\\t±V3¹W5 Ìæø¾0)´ºÇ"§¥±l~#[!ª¸z®\\tS \\t\ ,K;;·nÏmX^Õ,ÐyØ=ËaÏÝê¼QÂ\\tEL­Gj?OÅ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #95
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 144
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
    //   68: ldc '掤睸漢ナ杸ﺴꬣ쫕쥡鬒䝚굵ꈑ鱐牔뜇鎈㛉㑟燎ㅙС⌋ᣧ՛޾肬늢घ⳿ᮅ娒勄횅⧛⾥卟V⃨넭橵빐䨄墱킱ꫯ䎅㌼䕑ʙ傺鼐兛䃜鋡㣬볰?ႚ춳Ꭺ徐䑧쒺縿摍᧢怞佡∌邉䘛뢨?஘㫭䧸⒱숞걯鄿㞙趔乎汇旲긄멹▼ᳪ둖琷䯉诺瀖뗶䣔愰坵蘾ᶥ頄榤軛鬼蟾츔⣀谰觱뾉䊮䇸ⶤ냵뮀Î/H5Ëíè&ÛOâÉÕÐ¸¨U'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: sipush #128
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #40
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
    //   130: putstatic burp/Zsqy.a : [Ljava/lang/String;
    //   133: bipush #14
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zsqy.b : [Ljava/lang/String;
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
    //   212: bipush #53
    //   214: goto -> 244
    //   217: bipush #71
    //   219: goto -> 244
    //   222: bipush #75
    //   224: goto -> 244
    //   227: bipush #57
    //   229: goto -> 244
    //   232: bipush #16
    //   234: goto -> 244
    //   237: bipush #96
    //   239: goto -> 244
    //   242: bipush #52
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
    //   283: tableswitch default -> 40, 0 -> 100
    //   300: sipush #7388
    //   303: sipush #21395
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zsqy.Zo : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #72
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-47
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-40
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-18
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-96
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-110
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-73
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: iconst_2
    //   360: bastore
    //   361: dup
    //   362: bipush #8
    //   364: bipush #60
    //   366: bastore
    //   367: dup
    //   368: bipush #9
    //   370: bipush #-76
    //   372: bastore
    //   373: dup
    //   374: bipush #10
    //   376: bipush #-46
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: bipush #24
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #33
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #72
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #11
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: bipush #83
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #113
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #-21
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #-64
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #76
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #55
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #-70
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #6
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #86
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #50
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #-98
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #-30
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #66
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #-26
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #-47
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #112
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #113
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zsqy.ZV : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1CD6) & 0xFFFF;
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
      char c = 'º';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsqy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */