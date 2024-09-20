package burp;

import java.math.BigInteger;

class Zvof extends ClassLoader {
  static Object Zl;
  
  static String ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zm(Object paramObject) {
    Zrdo.Zj = a(-31055, 4695);
    Zrdo.ZK = new BigInteger(a(-31046, -4940));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zxzt.ZG.charAt(Math.abs(((BigInteger)Zeoa.ZF).intValue() % 32)) <= Zmwu.ZM.charAt(Math.abs(((BigInteger)Zstq.Zf).intValue() % 32))) {
          try {
            Zss8.ZK(Class.forName(a(-31043, -10773)));
            if (bool)
              Zxxf.ZJ(Class.forName(a(-31048, -19477))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxxf.ZJ(Class.forName(a(-31048, -19477)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZL(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: getstatic burp/Zgz2.ZI : Ljava/lang/String;
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
    //   54: ifeq -> 20
    //   57: aload_3
    //   58: invokevirtual toByteArray : ()[B
    //   61: astore #5
    //   63: getstatic burp/Zr_z.ZT : Ljava/lang/Object;
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
    //   131: sipush #-31047
    //   134: sipush #-1510
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
    //   359: ifeq -> 123
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
    //   419: ifeq -> 377
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
    //   530: ifeq -> 461
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
    //   668: ifeq -> 540
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
    //   1106: ifeq -> 741
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
    //   1179: sipush #-31042
    //   1182: sipush #27992
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: invokespecial <init> : (Ljava/lang/String;)V
    //   1191: athrow
    //   1192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1195: athrow
    //   1196: bipush #10
    //   1198: istore #36
    //   1200: sipush #-31053
    //   1203: sipush #256
    //   1206: newarray byte
    //   1208: astore #37
    //   1210: sipush #-4319
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
    //   1483: ifeq -> 1254
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
    //   1549: ifeq -> 1522
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
    //   2000: ifeq -> 1756
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
    //   2408: ifeq -> 2381
    //   2411: iinc #44, 1
    //   2414: iload_2
    //   2415: ifeq -> 1496
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
    //   2446: ifeq -> 2502
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
    //   2492: ifeq -> 2462
    //   2495: goto -> 2502
    //   2498: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2501: athrow
    //   2502: aload #35
    //   2504: astore #7
    //   2506: sipush #-31044
    //   2509: new java/math/BigInteger
    //   2512: dup
    //   2513: aload #7
    //   2515: invokespecial <init> : ([B)V
    //   2518: invokevirtual abs : ()Ljava/math/BigInteger;
    //   2521: putstatic burp/Zluk.Zz : Ljava/lang/Object;
    //   2524: sipush #10234
    //   2527: getstatic burp/Zz4r.ZQ : Ljava/lang/Object;
    //   2530: checkcast java/math/BigInteger
    //   2533: getstatic burp/Zge1.ZK : Ljava/lang/Object;
    //   2536: checkcast java/math/BigInteger
    //   2539: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   2542: putstatic burp/Zkby.Zv : Ljava/lang/Object;
    //   2545: invokestatic a : (II)Ljava/lang/String;
    //   2548: iconst_1
    //   2549: ldc burp/Ztq8
    //   2551: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2554: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2557: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2560: astore_3
    //   2561: aload_3
    //   2562: arraylength
    //   2563: istore #4
    //   2565: iconst_0
    //   2566: istore #5
    //   2568: iload #5
    //   2570: iload #4
    //   2572: if_icmpge -> 2709
    //   2575: aload_3
    //   2576: iload #5
    //   2578: aaload
    //   2579: astore #6
    //   2581: aload #6
    //   2583: invokevirtual getModifiers : ()I
    //   2586: invokestatic isStatic : (I)Z
    //   2589: ifne -> 2599
    //   2592: goto -> 2702
    //   2595: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2598: athrow
    //   2599: aload #6
    //   2601: invokevirtual getType : ()Ljava/lang/Class;
    //   2604: astore #7
    //   2606: aload #7
    //   2608: ifnull -> 2689
    //   2611: aload #7
    //   2613: invokevirtual isPrimitive : ()Z
    //   2616: ifne -> 2689
    //   2619: goto -> 2626
    //   2622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2625: athrow
    //   2626: aload #7
    //   2628: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2631: ifnull -> 2689
    //   2634: goto -> 2641
    //   2637: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2640: athrow
    //   2641: aload #7
    //   2643: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2646: invokevirtual getName : ()Ljava/lang/String;
    //   2649: ifnull -> 2689
    //   2652: goto -> 2659
    //   2655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2658: athrow
    //   2659: aload #7
    //   2661: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2664: invokevirtual getName : ()Ljava/lang/String;
    //   2667: sipush #-31051
    //   2670: sipush #20221
    //   2673: invokestatic a : (II)Ljava/lang/String;
    //   2676: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2679: ifne -> 2689
    //   2682: goto -> 2689
    //   2685: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2688: athrow
    //   2689: aload #6
    //   2691: iconst_1
    //   2692: invokevirtual setAccessible : (Z)V
    //   2695: aload #6
    //   2697: aconst_null
    //   2698: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2701: pop
    //   2702: iinc #5, 1
    //   2705: iload_2
    //   2706: ifeq -> 2568
    //   2709: sipush #-31054
    //   2712: sipush #6753
    //   2715: invokestatic a : (II)Ljava/lang/String;
    //   2718: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2721: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2724: astore_3
    //   2725: aload_3
    //   2726: arraylength
    //   2727: istore #4
    //   2729: iconst_0
    //   2730: istore #5
    //   2732: iload #5
    //   2734: iload #4
    //   2736: if_icmpge -> 2868
    //   2739: aload_3
    //   2740: iload #5
    //   2742: aaload
    //   2743: astore #6
    //   2745: aload #6
    //   2747: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2750: pop
    //   2751: aload #6
    //   2753: invokevirtual getModifiers : ()I
    //   2756: invokestatic isStatic : (I)Z
    //   2759: ifeq -> 2854
    //   2762: aload #6
    //   2764: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2767: arraylength
    //   2768: iconst_2
    //   2769: if_icmpne -> 2854
    //   2772: goto -> 2779
    //   2775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2778: athrow
    //   2779: aload #6
    //   2781: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2784: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2787: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2790: ifeq -> 2854
    //   2793: goto -> 2800
    //   2796: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2799: athrow
    //   2800: aload #6
    //   2802: iconst_1
    //   2803: invokevirtual setAccessible : (Z)V
    //   2806: aload #6
    //   2808: aconst_null
    //   2809: iconst_2
    //   2810: anewarray java/lang/Object
    //   2813: dup
    //   2814: iconst_0
    //   2815: aload_0
    //   2816: aastore
    //   2817: dup
    //   2818: iconst_1
    //   2819: aload_1
    //   2820: ifnonnull -> 2838
    //   2823: goto -> 2830
    //   2826: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2829: athrow
    //   2830: aload_1
    //   2831: goto -> 2845
    //   2834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2837: athrow
    //   2838: aload_1
    //   2839: checkcast [B
    //   2842: invokevirtual clone : ()Ljava/lang/Object;
    //   2845: aastore
    //   2846: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2849: pop
    //   2850: iload_2
    //   2851: ifeq -> 2868
    //   2854: iinc #5, 1
    //   2857: iload_2
    //   2858: ifeq -> 2732
    //   2861: goto -> 2868
    //   2864: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2867: athrow
    //   2868: getstatic burp/Zgz1.ZX : Ljava/lang/Object;
    //   2871: checkcast java/math/BigInteger
    //   2874: invokevirtual intValue : ()I
    //   2877: i2l
    //   2878: invokestatic currentTimeMillis : ()J
    //   2881: ladd
    //   2882: getstatic burp/Zb9d.Ze : Ljava/lang/Object;
    //   2885: checkcast java/math/BigInteger
    //   2888: invokevirtual intValue : ()I
    //   2891: i2l
    //   2892: lcmp
    //   2893: ifge -> 3225
    //   2896: sipush #-31049
    //   2899: sipush #6879
    //   2902: invokestatic a : (II)Ljava/lang/String;
    //   2905: iconst_1
    //   2906: ldc burp/Zrd4
    //   2908: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2911: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2914: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2917: astore_3
    //   2918: aload_3
    //   2919: arraylength
    //   2920: istore #4
    //   2922: iconst_0
    //   2923: istore #5
    //   2925: iload #5
    //   2927: iload #4
    //   2929: if_icmpge -> 3066
    //   2932: aload_3
    //   2933: iload #5
    //   2935: aaload
    //   2936: astore #6
    //   2938: aload #6
    //   2940: invokevirtual getModifiers : ()I
    //   2943: invokestatic isStatic : (I)Z
    //   2946: ifne -> 2956
    //   2949: goto -> 3059
    //   2952: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2955: athrow
    //   2956: aload #6
    //   2958: invokevirtual getType : ()Ljava/lang/Class;
    //   2961: astore #7
    //   2963: aload #7
    //   2965: ifnull -> 3046
    //   2968: aload #7
    //   2970: invokevirtual isPrimitive : ()Z
    //   2973: ifne -> 3046
    //   2976: goto -> 2983
    //   2979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2982: athrow
    //   2983: aload #7
    //   2985: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2988: ifnull -> 3046
    //   2991: goto -> 2998
    //   2994: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2997: athrow
    //   2998: aload #7
    //   3000: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3003: invokevirtual getName : ()Ljava/lang/String;
    //   3006: ifnull -> 3046
    //   3009: goto -> 3016
    //   3012: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3015: athrow
    //   3016: aload #7
    //   3018: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3021: invokevirtual getName : ()Ljava/lang/String;
    //   3024: sipush #-31041
    //   3027: sipush #-28323
    //   3030: invokestatic a : (II)Ljava/lang/String;
    //   3033: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3036: ifne -> 3046
    //   3039: goto -> 3046
    //   3042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3045: athrow
    //   3046: aload #6
    //   3048: iconst_1
    //   3049: invokevirtual setAccessible : (Z)V
    //   3052: aload #6
    //   3054: aconst_null
    //   3055: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3058: pop
    //   3059: iinc #5, 1
    //   3062: iload_2
    //   3063: ifeq -> 2925
    //   3066: sipush #-31045
    //   3069: sipush #-15866
    //   3072: invokestatic a : (II)Ljava/lang/String;
    //   3075: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3078: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3081: astore_3
    //   3082: aload_3
    //   3083: arraylength
    //   3084: istore #4
    //   3086: iconst_0
    //   3087: istore #5
    //   3089: iload #5
    //   3091: iload #4
    //   3093: if_icmpge -> 3225
    //   3096: aload_3
    //   3097: iload #5
    //   3099: aaload
    //   3100: astore #6
    //   3102: aload #6
    //   3104: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3107: pop
    //   3108: aload #6
    //   3110: invokevirtual getModifiers : ()I
    //   3113: invokestatic isStatic : (I)Z
    //   3116: ifeq -> 3211
    //   3119: aload #6
    //   3121: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3124: arraylength
    //   3125: iconst_2
    //   3126: if_icmpne -> 3211
    //   3129: goto -> 3136
    //   3132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3135: athrow
    //   3136: aload #6
    //   3138: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3141: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   3144: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3147: ifeq -> 3211
    //   3150: goto -> 3157
    //   3153: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3156: athrow
    //   3157: aload #6
    //   3159: iconst_1
    //   3160: invokevirtual setAccessible : (Z)V
    //   3163: aload #6
    //   3165: aconst_null
    //   3166: iconst_2
    //   3167: anewarray java/lang/Object
    //   3170: dup
    //   3171: iconst_0
    //   3172: aload_0
    //   3173: aastore
    //   3174: dup
    //   3175: iconst_1
    //   3176: aload_1
    //   3177: ifnonnull -> 3195
    //   3180: goto -> 3187
    //   3183: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3186: athrow
    //   3187: aload_1
    //   3188: goto -> 3202
    //   3191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3194: athrow
    //   3195: aload_1
    //   3196: checkcast [B
    //   3199: invokevirtual clone : ()Ljava/lang/Object;
    //   3202: aastore
    //   3203: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3206: pop
    //   3207: iload_2
    //   3208: ifeq -> 3225
    //   3211: iinc #5, 1
    //   3214: iload_2
    //   3215: ifeq -> 3089
    //   3218: goto -> 3225
    //   3221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3224: athrow
    //   3225: sipush #-31052
    //   3228: sipush #-20217
    //   3231: invokestatic a : (II)Ljava/lang/String;
    //   3234: iconst_1
    //   3235: ldc burp/Ztw4
    //   3237: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3240: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3243: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3246: astore_3
    //   3247: aload_3
    //   3248: arraylength
    //   3249: istore #4
    //   3251: iconst_0
    //   3252: istore #5
    //   3254: iload #5
    //   3256: iload #4
    //   3258: if_icmpge -> 3395
    //   3261: aload_3
    //   3262: iload #5
    //   3264: aaload
    //   3265: astore #6
    //   3267: aload #6
    //   3269: invokevirtual getModifiers : ()I
    //   3272: invokestatic isStatic : (I)Z
    //   3275: ifne -> 3285
    //   3278: goto -> 3388
    //   3281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3284: athrow
    //   3285: aload #6
    //   3287: invokevirtual getType : ()Ljava/lang/Class;
    //   3290: astore #7
    //   3292: aload #7
    //   3294: ifnull -> 3375
    //   3297: aload #7
    //   3299: invokevirtual isPrimitive : ()Z
    //   3302: ifne -> 3375
    //   3305: goto -> 3312
    //   3308: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3311: athrow
    //   3312: aload #7
    //   3314: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3317: ifnull -> 3375
    //   3320: goto -> 3327
    //   3323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3326: athrow
    //   3327: aload #7
    //   3329: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3332: invokevirtual getName : ()Ljava/lang/String;
    //   3335: ifnull -> 3375
    //   3338: goto -> 3345
    //   3341: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3344: athrow
    //   3345: aload #7
    //   3347: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3350: invokevirtual getName : ()Ljava/lang/String;
    //   3353: sipush #-31041
    //   3356: sipush #-28323
    //   3359: invokestatic a : (II)Ljava/lang/String;
    //   3362: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3365: ifne -> 3375
    //   3368: goto -> 3375
    //   3371: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3374: athrow
    //   3375: aload #6
    //   3377: iconst_1
    //   3378: invokevirtual setAccessible : (Z)V
    //   3381: aload #6
    //   3383: aconst_null
    //   3384: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3387: pop
    //   3388: iinc #5, 1
    //   3391: iload_2
    //   3392: ifeq -> 3254
    //   3395: sipush #-31056
    //   3398: sipush #-19974
    //   3401: invokestatic a : (II)Ljava/lang/String;
    //   3404: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3407: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3410: astore_3
    //   3411: aload_3
    //   3412: arraylength
    //   3413: istore #4
    //   3415: iconst_0
    //   3416: istore #5
    //   3418: iload #5
    //   3420: iload #4
    //   3422: if_icmpge -> 3533
    //   3425: aload_3
    //   3426: iload #5
    //   3428: aaload
    //   3429: astore #6
    //   3431: aload #6
    //   3433: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3436: pop
    //   3437: aload #6
    //   3439: invokevirtual getModifiers : ()I
    //   3442: invokestatic isStatic : (I)Z
    //   3445: ifeq -> 3519
    //   3448: aload #6
    //   3450: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3453: arraylength
    //   3454: iconst_2
    //   3455: if_icmpne -> 3519
    //   3458: goto -> 3465
    //   3461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3464: athrow
    //   3465: aload #6
    //   3467: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3470: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3473: if_acmpne -> 3519
    //   3476: goto -> 3483
    //   3479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3482: athrow
    //   3483: aload #6
    //   3485: iconst_1
    //   3486: invokevirtual setAccessible : (Z)V
    //   3489: aload #6
    //   3491: aconst_null
    //   3492: iconst_2
    //   3493: anewarray java/lang/Object
    //   3496: dup
    //   3497: iconst_0
    //   3498: aload_0
    //   3499: aastore
    //   3500: dup
    //   3501: iconst_1
    //   3502: aload_1
    //   3503: aastore
    //   3504: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3507: pop
    //   3508: iload_2
    //   3509: ifeq -> 3533
    //   3512: goto -> 3519
    //   3515: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3518: athrow
    //   3519: iinc #5, 1
    //   3522: iload_2
    //   3523: ifeq -> 3418
    //   3526: goto -> 3533
    //   3529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3532: athrow
    //   3533: getstatic burp/Zzi3.ZS : Ljava/lang/String;
    //   3536: getstatic burp/Zsvh.Zv : Ljava/lang/Object;
    //   3539: checkcast java/math/BigInteger
    //   3542: invokevirtual intValue : ()I
    //   3545: bipush #32
    //   3547: irem
    //   3548: invokestatic abs : (I)I
    //   3551: invokevirtual charAt : (I)C
    //   3554: getstatic burp/Zbf9.Zp : Ljava/lang/String;
    //   3557: getstatic burp/Zebu.Zu : Ljava/lang/Object;
    //   3560: checkcast java/math/BigInteger
    //   3563: invokevirtual intValue : ()I
    //   3566: bipush #32
    //   3568: irem
    //   3569: invokestatic abs : (I)I
    //   3572: invokevirtual charAt : (I)C
    //   3575: if_icmple -> 3682
    //   3578: getstatic burp/Zg_y.ZF : Ljava/lang/String;
    //   3581: getstatic burp/Zz80.ZR : Ljava/lang/Object;
    //   3584: checkcast java/math/BigInteger
    //   3587: invokevirtual intValue : ()I
    //   3590: bipush #32
    //   3592: irem
    //   3593: invokestatic abs : (I)I
    //   3596: invokevirtual charAt : (I)C
    //   3599: getstatic burp/Zk52.ZL : Ljava/lang/String;
    //   3602: getstatic burp/Zts_.ZH : Ljava/lang/Object;
    //   3605: checkcast java/math/BigInteger
    //   3608: invokevirtual intValue : ()I
    //   3611: bipush #32
    //   3613: irem
    //   3614: invokestatic abs : (I)I
    //   3617: invokevirtual charAt : (I)C
    //   3620: if_icmpgt -> 3682
    //   3623: goto -> 3630
    //   3626: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3629: athrow
    //   3630: getstatic burp/Zzuh.ZX : Ljava/lang/String;
    //   3633: getstatic burp/Zm0v.ZH : Ljava/lang/Object;
    //   3636: checkcast java/math/BigInteger
    //   3639: invokevirtual intValue : ()I
    //   3642: bipush #32
    //   3644: irem
    //   3645: invokestatic abs : (I)I
    //   3648: invokevirtual charAt : (I)C
    //   3651: getstatic burp/Zmjw.ZB : Ljava/lang/String;
    //   3654: getstatic burp/Ze6t.Zu : Ljava/lang/Object;
    //   3657: checkcast java/math/BigInteger
    //   3660: invokevirtual intValue : ()I
    //   3663: bipush #32
    //   3665: irem
    //   3666: invokestatic abs : (I)I
    //   3669: invokevirtual charAt : (I)C
    //   3672: if_icmpgt -> 3690
    //   3675: goto -> 3682
    //   3678: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3681: athrow
    //   3682: iconst_1
    //   3683: goto -> 3691
    //   3686: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3689: athrow
    //   3690: iconst_0
    //   3691: ireturn
    //   3692: astore_3
    //   3693: new java/lang/Exception
    //   3696: dup
    //   3697: aload_3
    //   3698: invokevirtual getMessage : ()Ljava/lang/String;
    //   3701: invokespecial <init> : (Ljava/lang/String;)V
    //   3704: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3691	3692	java/lang/Throwable
    //   149	164	164	java/lang/Throwable
    //   1166	1192	1192	java/lang/Throwable
    //   1273	1288	1288	java/lang/Throwable
    //   2470	2495	2498	java/lang/Throwable
    //   2581	2595	2595	java/lang/Throwable
    //   2606	2619	2622	java/lang/Throwable
    //   2611	2634	2637	java/lang/Throwable
    //   2626	2652	2655	java/lang/Throwable
    //   2641	2682	2685	java/lang/Throwable
    //   2745	2772	2775	java/lang/Throwable
    //   2762	2793	2796	java/lang/Throwable
    //   2779	2823	2826	java/lang/Throwable
    //   2800	2834	2834	java/lang/Throwable
    //   2845	2861	2864	java/lang/Throwable
    //   2938	2952	2952	java/lang/Throwable
    //   2963	2976	2979	java/lang/Throwable
    //   2968	2991	2994	java/lang/Throwable
    //   2983	3009	3012	java/lang/Throwable
    //   2998	3039	3042	java/lang/Throwable
    //   3102	3129	3132	java/lang/Throwable
    //   3119	3150	3153	java/lang/Throwable
    //   3136	3180	3183	java/lang/Throwable
    //   3157	3191	3191	java/lang/Throwable
    //   3202	3218	3221	java/lang/Throwable
    //   3267	3281	3281	java/lang/Throwable
    //   3292	3305	3308	java/lang/Throwable
    //   3297	3320	3323	java/lang/Throwable
    //   3312	3338	3341	java/lang/Throwable
    //   3327	3368	3371	java/lang/Throwable
    //   3431	3458	3461	java/lang/Throwable
    //   3448	3476	3479	java/lang/Throwable
    //   3465	3512	3515	java/lang/Throwable
    //   3483	3526	3529	java/lang/Throwable
    //   3533	3623	3626	java/lang/Throwable
    //   3578	3675	3678	java/lang/Throwable
    //   3630	3686	3686	java/lang/Throwable
  }
  
  static void Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '2*/ôYQé>T ½\\bÁiÜL Øÿ6¡49Æßø4b.%HiÀaõ\\tÀÚÆJ(&4\\täKõ·¯2áù jS¬2X£«F6\\r+§öÔþù¡ñrí{ÝæÖ­ï'æè\\tSüAqØá+挔眐澦メ杖ﺋꮣ쪙즄鬒䞱귋ꈶ鳂爛랠鏨㙪㑱熠㇎ѥ⎮ᣑֵܽ胚닥৿ⲩᬣ媝劻횁⦽⽲匭ö⃣높櫡븮䫁壀큓ꪄ䍲㎤䔦˝僪鿂儔䀭鋽㡛밤?ၚ촀Ꮦ彯䒿쓻繾搠ᥡ恆侘≐逈䛊룝?௃㫑䤱⑬쉢걿酅㝖跍仲泇敫긟뫴▅ᰞ듚琯䯳譇瀋딄䣜憸块蚑ᶻ顬楇蹟鬗蟐츫⡀豼褔뾉䉅䅆ⶃ끧믏\\t¬ü}_Ûu\\tÊB0"#eR¸ýLÊn^Ðp¨TF¤2¶¦ÿ.ù\\tÊd0Rº<c_挖眀澤ラ朖ﺊꮫ쪹즅韛䞑굋ꈲ鳒犛랢鏸㘪㑹熡㇆х⎯ᣕ֕޽胞뉥৽ⲹ᭣媟劳훁⦼⽺匍÷⃧놲橡븪䫑塀큑ꪔ䌲㎦䔮ʝ僫鿊儴䀬鋹㡻벤?၊촂Ꮖ弯䒽쓳績搡ᥩ恦侙≔逨䙊룙?ୃ㫁䥱⑮쉪갿酄㝗跉仒汇敻꺟뫶▕ᱞ듘瑯䯲譏瀫딅䣘愸坓蚁ᴻ顼椇蹝鬟螐츪⡈豜褕뾍䉥䇆ⶇ끷뭏'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #55
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
    //   68: ldc '-óèòl²±FCy~W\t9ßDcm\\r2¤cD\\rÇ"2v+yd»\\tSq ¸ãñPM|1?oÆ«kRÖhã¤R©±\\tuOvn» #'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #73
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
    //   129: putstatic burp/Zvof.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zvof.b : [Ljava/lang/String;
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
    //   212: bipush #12
    //   214: goto -> 244
    //   217: bipush #125
    //   219: goto -> 244
    //   222: bipush #101
    //   224: goto -> 244
    //   227: bipush #11
    //   229: goto -> 244
    //   232: bipush #126
    //   234: goto -> 244
    //   237: bipush #100
    //   239: goto -> 244
    //   242: bipush #95
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
    //   311: bipush #101
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #52
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #86
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #64
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-80
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-63
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-63
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #98
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #55
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-72
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-108
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #121
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #96
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-65
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-15
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-72
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-14
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #127
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #25
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: iconst_5
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-12
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-103
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #34
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-128
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-11
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #70
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-62
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #53
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #90
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-84
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #60
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-14
    //   493: bastore
    //   494: invokespecial <init> : (I[B)V
    //   497: putstatic burp/Zvof.Zl : Ljava/lang/Object;
    //   500: sipush #-31050
    //   503: sipush #-27094
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zvof.ZR : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF86B4) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvof.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */