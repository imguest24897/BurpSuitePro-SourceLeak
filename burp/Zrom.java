package burp;

import java.math.BigInteger;

class Zrom extends ClassLoader {
  static Object ZF;
  
  static String ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZM(Object paramObject) {
    Zzah.Zs = a(-26565, 3550);
    Zzah.Za = new BigInteger(a(-26571, -32160));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zgsb.ZM.charAt(Math.abs(((BigInteger)Zlf7.ZE).intValue() % 32)) > Zb6m.ZR.charAt(Math.abs(((BigInteger)Zepy.Ze).intValue() % 32))) {
          try {
            Zeqr.Zn(Class.forName(a(-26568, 1541)));
            if (bool)
              Zxci.Zj(Class.forName(a(-26567, 93))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxci.Zj(Class.forName(a(-26567, 93)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZK(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: getstatic burp/Zmll.Zu : Ljava/lang/String;
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
    //   63: getstatic burp/Zebe.Zw : Ljava/lang/Object;
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
    //   131: sipush #-26573
    //   134: sipush #-4091
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
    //   1179: sipush #-26570
    //   1182: sipush #19438
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: invokespecial <init> : (Ljava/lang/String;)V
    //   1191: athrow
    //   1192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1195: athrow
    //   1196: bipush #10
    //   1198: istore #36
    //   1200: sipush #-26582
    //   1203: sipush #256
    //   1206: newarray byte
    //   1208: astore #37
    //   1210: sipush #-12427
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
    //   2506: new java/math/BigInteger
    //   2509: dup
    //   2510: aload #7
    //   2512: invokespecial <init> : ([B)V
    //   2515: invokevirtual abs : ()Ljava/math/BigInteger;
    //   2518: putstatic burp/Zrl5.ZI : Ljava/lang/Object;
    //   2521: new java/lang/StringBuilder
    //   2524: dup
    //   2525: invokespecial <init> : ()V
    //   2528: astore_3
    //   2529: iconst_0
    //   2530: istore #4
    //   2532: iload #4
    //   2534: bipush #32
    //   2536: if_icmpge -> 3871
    //   2539: iload #4
    //   2541: tableswitch default -> 3864, 0 -> 2684, 1 -> 2721, 2 -> 2758, 3 -> 2795, 4 -> 2832, 5 -> 2869, 6 -> 2906, 7 -> 2943, 8 -> 2980, 9 -> 3017, 10 -> 3054, 11 -> 3091, 12 -> 3128, 13 -> 3165, 14 -> 3202, 15 -> 3239, 16 -> 3276, 17 -> 3313, 18 -> 3350, 19 -> 3387, 20 -> 3424, 21 -> 3461, 22 -> 3498, 23 -> 3535, 24 -> 3572, 25 -> 3609, 26 -> 3646, 27 -> 3683, 28 -> 3720, 29 -> 3757, 30 -> 3794, 31 -> 3831
    //   2684: aload_3
    //   2685: getstatic burp/Zspg.ZG : Ljava/lang/String;
    //   2688: getstatic burp/Zrfs.ZV : Ljava/lang/Object;
    //   2691: checkcast java/math/BigInteger
    //   2694: invokevirtual intValue : ()I
    //   2697: bipush #32
    //   2699: irem
    //   2700: invokestatic abs : (I)I
    //   2703: invokevirtual charAt : (I)C
    //   2706: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2709: pop
    //   2710: iload_2
    //   2711: ifeq -> 3864
    //   2714: goto -> 2721
    //   2717: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2720: athrow
    //   2721: aload_3
    //   2722: getstatic burp/Zmzj.Zb : Ljava/lang/String;
    //   2725: getstatic burp/Zt8m.Zf : Ljava/lang/Object;
    //   2728: checkcast java/math/BigInteger
    //   2731: invokevirtual intValue : ()I
    //   2734: bipush #32
    //   2736: irem
    //   2737: invokestatic abs : (I)I
    //   2740: invokevirtual charAt : (I)C
    //   2743: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2746: pop
    //   2747: iload_2
    //   2748: ifeq -> 3864
    //   2751: goto -> 2758
    //   2754: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2757: athrow
    //   2758: aload_3
    //   2759: getstatic burp/Zbow.Zr : Ljava/lang/String;
    //   2762: getstatic burp/Zg2u.ZI : Ljava/lang/Object;
    //   2765: checkcast java/math/BigInteger
    //   2768: invokevirtual intValue : ()I
    //   2771: bipush #32
    //   2773: irem
    //   2774: invokestatic abs : (I)I
    //   2777: invokevirtual charAt : (I)C
    //   2780: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2783: pop
    //   2784: iload_2
    //   2785: ifeq -> 3864
    //   2788: goto -> 2795
    //   2791: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2794: athrow
    //   2795: aload_3
    //   2796: getstatic burp/Zrnt.Zy : Ljava/lang/String;
    //   2799: getstatic burp/Zz66.ZQ : Ljava/lang/Object;
    //   2802: checkcast java/math/BigInteger
    //   2805: invokevirtual intValue : ()I
    //   2808: bipush #32
    //   2810: irem
    //   2811: invokestatic abs : (I)I
    //   2814: invokevirtual charAt : (I)C
    //   2817: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2820: pop
    //   2821: iload_2
    //   2822: ifeq -> 3864
    //   2825: goto -> 2832
    //   2828: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2831: athrow
    //   2832: aload_3
    //   2833: getstatic burp/Zzpm.Za : Ljava/lang/String;
    //   2836: getstatic burp/Zex0.Ze : Ljava/lang/Object;
    //   2839: checkcast java/math/BigInteger
    //   2842: invokevirtual intValue : ()I
    //   2845: bipush #32
    //   2847: irem
    //   2848: invokestatic abs : (I)I
    //   2851: invokevirtual charAt : (I)C
    //   2854: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2857: pop
    //   2858: iload_2
    //   2859: ifeq -> 3864
    //   2862: goto -> 2869
    //   2865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2868: athrow
    //   2869: aload_3
    //   2870: getstatic burp/Zbw5.ZC : Ljava/lang/String;
    //   2873: getstatic burp/Zxxh.Za : Ljava/lang/Object;
    //   2876: checkcast java/math/BigInteger
    //   2879: invokevirtual intValue : ()I
    //   2882: bipush #32
    //   2884: irem
    //   2885: invokestatic abs : (I)I
    //   2888: invokevirtual charAt : (I)C
    //   2891: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2894: pop
    //   2895: iload_2
    //   2896: ifeq -> 3864
    //   2899: goto -> 2906
    //   2902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2905: athrow
    //   2906: aload_3
    //   2907: getstatic burp/Zmlr.ZJ : Ljava/lang/String;
    //   2910: getstatic burp/Ztvy.ZH : Ljava/lang/Object;
    //   2913: checkcast java/math/BigInteger
    //   2916: invokevirtual intValue : ()I
    //   2919: bipush #32
    //   2921: irem
    //   2922: invokestatic abs : (I)I
    //   2925: invokevirtual charAt : (I)C
    //   2928: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2931: pop
    //   2932: iload_2
    //   2933: ifeq -> 3864
    //   2936: goto -> 2943
    //   2939: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2942: athrow
    //   2943: aload_3
    //   2944: getstatic burp/Zb2u.ZM : Ljava/lang/String;
    //   2947: getstatic burp/Zx5w.Zo : Ljava/lang/Object;
    //   2950: checkcast java/math/BigInteger
    //   2953: invokevirtual intValue : ()I
    //   2956: bipush #32
    //   2958: irem
    //   2959: invokestatic abs : (I)I
    //   2962: invokevirtual charAt : (I)C
    //   2965: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2968: pop
    //   2969: iload_2
    //   2970: ifeq -> 3864
    //   2973: goto -> 2980
    //   2976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2979: athrow
    //   2980: aload_3
    //   2981: getstatic burp/Zzre.Zr : Ljava/lang/String;
    //   2984: getstatic burp/Zvob.ZX : Ljava/lang/Object;
    //   2987: checkcast java/math/BigInteger
    //   2990: invokevirtual intValue : ()I
    //   2993: bipush #32
    //   2995: irem
    //   2996: invokestatic abs : (I)I
    //   2999: invokevirtual charAt : (I)C
    //   3002: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3005: pop
    //   3006: iload_2
    //   3007: ifeq -> 3864
    //   3010: goto -> 3017
    //   3013: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3016: athrow
    //   3017: aload_3
    //   3018: getstatic burp/Zg0f.Zd : Ljava/lang/String;
    //   3021: getstatic burp/Zebc.Zr : Ljava/lang/Object;
    //   3024: checkcast java/math/BigInteger
    //   3027: invokevirtual intValue : ()I
    //   3030: bipush #32
    //   3032: irem
    //   3033: invokestatic abs : (I)I
    //   3036: invokevirtual charAt : (I)C
    //   3039: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3042: pop
    //   3043: iload_2
    //   3044: ifeq -> 3864
    //   3047: goto -> 3054
    //   3050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3053: athrow
    //   3054: aload_3
    //   3055: getstatic burp/Ze7e.Zc : Ljava/lang/String;
    //   3058: getstatic burp/Zrp2.Zw : Ljava/lang/Object;
    //   3061: checkcast java/math/BigInteger
    //   3064: invokevirtual intValue : ()I
    //   3067: bipush #32
    //   3069: irem
    //   3070: invokestatic abs : (I)I
    //   3073: invokevirtual charAt : (I)C
    //   3076: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3079: pop
    //   3080: iload_2
    //   3081: ifeq -> 3864
    //   3084: goto -> 3091
    //   3087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3090: athrow
    //   3091: aload_3
    //   3092: getstatic burp/Ztwp.ZK : Ljava/lang/String;
    //   3095: getstatic burp/Zz66.ZQ : Ljava/lang/Object;
    //   3098: checkcast java/math/BigInteger
    //   3101: invokevirtual intValue : ()I
    //   3104: bipush #32
    //   3106: irem
    //   3107: invokestatic abs : (I)I
    //   3110: invokevirtual charAt : (I)C
    //   3113: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3116: pop
    //   3117: iload_2
    //   3118: ifeq -> 3864
    //   3121: goto -> 3128
    //   3124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3127: athrow
    //   3128: aload_3
    //   3129: getstatic burp/Ze6w.ZY : Ljava/lang/String;
    //   3132: getstatic burp/Ze2w.ZA : Ljava/lang/Object;
    //   3135: checkcast java/math/BigInteger
    //   3138: invokevirtual intValue : ()I
    //   3141: bipush #32
    //   3143: irem
    //   3144: invokestatic abs : (I)I
    //   3147: invokevirtual charAt : (I)C
    //   3150: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3153: pop
    //   3154: iload_2
    //   3155: ifeq -> 3864
    //   3158: goto -> 3165
    //   3161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3164: athrow
    //   3165: aload_3
    //   3166: getstatic burp/Zmz.Zp : Ljava/lang/String;
    //   3169: getstatic burp/Zmtr.Zv : Ljava/lang/Object;
    //   3172: checkcast java/math/BigInteger
    //   3175: invokevirtual intValue : ()I
    //   3178: bipush #32
    //   3180: irem
    //   3181: invokestatic abs : (I)I
    //   3184: invokevirtual charAt : (I)C
    //   3187: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3190: pop
    //   3191: iload_2
    //   3192: ifeq -> 3864
    //   3195: goto -> 3202
    //   3198: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3201: athrow
    //   3202: aload_3
    //   3203: getstatic burp/Zd9.Ze : Ljava/lang/String;
    //   3206: getstatic burp/Zmz.ZW : Ljava/lang/Object;
    //   3209: checkcast java/math/BigInteger
    //   3212: invokevirtual intValue : ()I
    //   3215: bipush #32
    //   3217: irem
    //   3218: invokestatic abs : (I)I
    //   3221: invokevirtual charAt : (I)C
    //   3224: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3227: pop
    //   3228: iload_2
    //   3229: ifeq -> 3864
    //   3232: goto -> 3239
    //   3235: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3238: athrow
    //   3239: aload_3
    //   3240: getstatic burp/Zs5y.ZO : Ljava/lang/String;
    //   3243: getstatic burp/Zeva.Zf : Ljava/lang/Object;
    //   3246: checkcast java/math/BigInteger
    //   3249: invokevirtual intValue : ()I
    //   3252: bipush #32
    //   3254: irem
    //   3255: invokestatic abs : (I)I
    //   3258: invokevirtual charAt : (I)C
    //   3261: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3264: pop
    //   3265: iload_2
    //   3266: ifeq -> 3864
    //   3269: goto -> 3276
    //   3272: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3275: athrow
    //   3276: aload_3
    //   3277: getstatic burp/Zz7j.ZP : Ljava/lang/String;
    //   3280: getstatic burp/Zm3x.ZM : Ljava/lang/Object;
    //   3283: checkcast java/math/BigInteger
    //   3286: invokevirtual intValue : ()I
    //   3289: bipush #32
    //   3291: irem
    //   3292: invokestatic abs : (I)I
    //   3295: invokevirtual charAt : (I)C
    //   3298: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3301: pop
    //   3302: iload_2
    //   3303: ifeq -> 3864
    //   3306: goto -> 3313
    //   3309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3312: athrow
    //   3313: aload_3
    //   3314: getstatic burp/Zz41.Zc : Ljava/lang/String;
    //   3317: getstatic burp/Ze1k.ZD : Ljava/lang/Object;
    //   3320: checkcast java/math/BigInteger
    //   3323: invokevirtual intValue : ()I
    //   3326: bipush #32
    //   3328: irem
    //   3329: invokestatic abs : (I)I
    //   3332: invokevirtual charAt : (I)C
    //   3335: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3338: pop
    //   3339: iload_2
    //   3340: ifeq -> 3864
    //   3343: goto -> 3350
    //   3346: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3349: athrow
    //   3350: aload_3
    //   3351: getstatic burp/Zl2t.Zg : Ljava/lang/String;
    //   3354: getstatic burp/Zxp5.ZA : Ljava/lang/Object;
    //   3357: checkcast java/math/BigInteger
    //   3360: invokevirtual intValue : ()I
    //   3363: bipush #32
    //   3365: irem
    //   3366: invokestatic abs : (I)I
    //   3369: invokevirtual charAt : (I)C
    //   3372: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3375: pop
    //   3376: iload_2
    //   3377: ifeq -> 3864
    //   3380: goto -> 3387
    //   3383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3386: athrow
    //   3387: aload_3
    //   3388: getstatic burp/Zrw0.Zj : Ljava/lang/String;
    //   3391: getstatic burp/Zs0h.ZU : Ljava/lang/Object;
    //   3394: checkcast java/math/BigInteger
    //   3397: invokevirtual intValue : ()I
    //   3400: bipush #32
    //   3402: irem
    //   3403: invokestatic abs : (I)I
    //   3406: invokevirtual charAt : (I)C
    //   3409: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3412: pop
    //   3413: iload_2
    //   3414: ifeq -> 3864
    //   3417: goto -> 3424
    //   3420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3423: athrow
    //   3424: aload_3
    //   3425: getstatic burp/Ze5h.Zk : Ljava/lang/String;
    //   3428: getstatic burp/Zmyk.Za : Ljava/lang/Object;
    //   3431: checkcast java/math/BigInteger
    //   3434: invokevirtual intValue : ()I
    //   3437: bipush #32
    //   3439: irem
    //   3440: invokestatic abs : (I)I
    //   3443: invokevirtual charAt : (I)C
    //   3446: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3449: pop
    //   3450: iload_2
    //   3451: ifeq -> 3864
    //   3454: goto -> 3461
    //   3457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3460: athrow
    //   3461: aload_3
    //   3462: getstatic burp/Zgu4.Za : Ljava/lang/String;
    //   3465: getstatic burp/Zzhx.ZB : Ljava/lang/Object;
    //   3468: checkcast java/math/BigInteger
    //   3471: invokevirtual intValue : ()I
    //   3474: bipush #32
    //   3476: irem
    //   3477: invokestatic abs : (I)I
    //   3480: invokevirtual charAt : (I)C
    //   3483: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3486: pop
    //   3487: iload_2
    //   3488: ifeq -> 3864
    //   3491: goto -> 3498
    //   3494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3497: athrow
    //   3498: aload_3
    //   3499: getstatic burp/Zek4.Zo : Ljava/lang/String;
    //   3502: getstatic burp/Zrjq.ZU : Ljava/lang/Object;
    //   3505: checkcast java/math/BigInteger
    //   3508: invokevirtual intValue : ()I
    //   3511: bipush #32
    //   3513: irem
    //   3514: invokestatic abs : (I)I
    //   3517: invokevirtual charAt : (I)C
    //   3520: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3523: pop
    //   3524: iload_2
    //   3525: ifeq -> 3864
    //   3528: goto -> 3535
    //   3531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3534: athrow
    //   3535: aload_3
    //   3536: getstatic burp/Zlf7.ZM : Ljava/lang/String;
    //   3539: getstatic burp/Zlf7.ZE : Ljava/lang/Object;
    //   3542: checkcast java/math/BigInteger
    //   3545: invokevirtual intValue : ()I
    //   3548: bipush #32
    //   3550: irem
    //   3551: invokestatic abs : (I)I
    //   3554: invokevirtual charAt : (I)C
    //   3557: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3560: pop
    //   3561: iload_2
    //   3562: ifeq -> 3864
    //   3565: goto -> 3572
    //   3568: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3571: athrow
    //   3572: aload_3
    //   3573: getstatic burp/Zscz.ZJ : Ljava/lang/String;
    //   3576: getstatic burp/Zejz.ZF : Ljava/lang/Object;
    //   3579: checkcast java/math/BigInteger
    //   3582: invokevirtual intValue : ()I
    //   3585: bipush #32
    //   3587: irem
    //   3588: invokestatic abs : (I)I
    //   3591: invokevirtual charAt : (I)C
    //   3594: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3597: pop
    //   3598: iload_2
    //   3599: ifeq -> 3864
    //   3602: goto -> 3609
    //   3605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3608: athrow
    //   3609: aload_3
    //   3610: getstatic burp/Zti4.ZI : Ljava/lang/String;
    //   3613: getstatic burp/Zb4d.Ze : Ljava/lang/Object;
    //   3616: checkcast java/math/BigInteger
    //   3619: invokevirtual intValue : ()I
    //   3622: bipush #32
    //   3624: irem
    //   3625: invokestatic abs : (I)I
    //   3628: invokevirtual charAt : (I)C
    //   3631: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3634: pop
    //   3635: iload_2
    //   3636: ifeq -> 3864
    //   3639: goto -> 3646
    //   3642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3645: athrow
    //   3646: aload_3
    //   3647: getstatic burp/Zt0m.ZH : Ljava/lang/String;
    //   3650: getstatic burp/Zrye.Zx : Ljava/lang/Object;
    //   3653: checkcast java/math/BigInteger
    //   3656: invokevirtual intValue : ()I
    //   3659: bipush #32
    //   3661: irem
    //   3662: invokestatic abs : (I)I
    //   3665: invokevirtual charAt : (I)C
    //   3668: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3671: pop
    //   3672: iload_2
    //   3673: ifeq -> 3864
    //   3676: goto -> 3683
    //   3679: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3682: athrow
    //   3683: aload_3
    //   3684: getstatic burp/Zrn4.ZY : Ljava/lang/String;
    //   3687: getstatic burp/Zz91.Z_ : Ljava/lang/Object;
    //   3690: checkcast java/math/BigInteger
    //   3693: invokevirtual intValue : ()I
    //   3696: bipush #32
    //   3698: irem
    //   3699: invokestatic abs : (I)I
    //   3702: invokevirtual charAt : (I)C
    //   3705: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3708: pop
    //   3709: iload_2
    //   3710: ifeq -> 3864
    //   3713: goto -> 3720
    //   3716: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3719: athrow
    //   3720: aload_3
    //   3721: getstatic burp/Zb0q.Zr : Ljava/lang/String;
    //   3724: getstatic burp/Zlgh.Zd : Ljava/lang/Object;
    //   3727: checkcast java/math/BigInteger
    //   3730: invokevirtual intValue : ()I
    //   3733: bipush #32
    //   3735: irem
    //   3736: invokestatic abs : (I)I
    //   3739: invokevirtual charAt : (I)C
    //   3742: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3745: pop
    //   3746: iload_2
    //   3747: ifeq -> 3864
    //   3750: goto -> 3757
    //   3753: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3756: athrow
    //   3757: aload_3
    //   3758: getstatic burp/Zr6c.Zf : Ljava/lang/String;
    //   3761: getstatic burp/Zkjj.Zh : Ljava/lang/Object;
    //   3764: checkcast java/math/BigInteger
    //   3767: invokevirtual intValue : ()I
    //   3770: bipush #32
    //   3772: irem
    //   3773: invokestatic abs : (I)I
    //   3776: invokevirtual charAt : (I)C
    //   3779: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3782: pop
    //   3783: iload_2
    //   3784: ifeq -> 3864
    //   3787: goto -> 3794
    //   3790: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3793: athrow
    //   3794: aload_3
    //   3795: getstatic burp/Zrex.Za : Ljava/lang/String;
    //   3798: getstatic burp/Zrd2.Zt : Ljava/lang/Object;
    //   3801: checkcast java/math/BigInteger
    //   3804: invokevirtual intValue : ()I
    //   3807: bipush #32
    //   3809: irem
    //   3810: invokestatic abs : (I)I
    //   3813: invokevirtual charAt : (I)C
    //   3816: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3819: pop
    //   3820: iload_2
    //   3821: ifeq -> 3864
    //   3824: goto -> 3831
    //   3827: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3830: athrow
    //   3831: aload_3
    //   3832: getstatic burp/Zsfg.Zh : Ljava/lang/String;
    //   3835: getstatic burp/Zxxo.ZJ : Ljava/lang/Object;
    //   3838: checkcast java/math/BigInteger
    //   3841: invokevirtual intValue : ()I
    //   3844: bipush #32
    //   3846: irem
    //   3847: invokestatic abs : (I)I
    //   3850: invokevirtual charAt : (I)C
    //   3853: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3856: pop
    //   3857: goto -> 3864
    //   3860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3863: athrow
    //   3864: iinc #4, 1
    //   3867: iload_2
    //   3868: ifeq -> 2532
    //   3871: aload_3
    //   3872: invokevirtual toString : ()Ljava/lang/String;
    //   3875: putstatic burp/Zsjw.ZQ : Ljava/lang/String;
    //   3878: sipush #-26584
    //   3881: getstatic burp/Zenr.ZA : Ljava/lang/Object;
    //   3884: checkcast java/math/BigInteger
    //   3887: getstatic burp/Zllk.Zi : Ljava/lang/Object;
    //   3890: checkcast java/math/BigInteger
    //   3893: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   3896: putstatic burp/Zle9.ZI : Ljava/lang/Object;
    //   3899: sipush #902
    //   3902: invokestatic a : (II)Ljava/lang/String;
    //   3905: iconst_1
    //   3906: ldc burp/Zv8c
    //   3908: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3911: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3914: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3917: astore #4
    //   3919: aload #4
    //   3921: arraylength
    //   3922: istore #5
    //   3924: iconst_0
    //   3925: istore #6
    //   3927: iload #6
    //   3929: iload #5
    //   3931: if_icmpge -> 4069
    //   3934: aload #4
    //   3936: iload #6
    //   3938: aaload
    //   3939: astore #7
    //   3941: aload #7
    //   3943: invokevirtual getModifiers : ()I
    //   3946: invokestatic isStatic : (I)Z
    //   3949: ifne -> 3959
    //   3952: goto -> 4062
    //   3955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3958: athrow
    //   3959: aload #7
    //   3961: invokevirtual getType : ()Ljava/lang/Class;
    //   3964: astore #8
    //   3966: aload #8
    //   3968: ifnull -> 4049
    //   3971: aload #8
    //   3973: invokevirtual isPrimitive : ()Z
    //   3976: ifne -> 4049
    //   3979: goto -> 3986
    //   3982: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3985: athrow
    //   3986: aload #8
    //   3988: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3991: ifnull -> 4049
    //   3994: goto -> 4001
    //   3997: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4000: athrow
    //   4001: aload #8
    //   4003: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4006: invokevirtual getName : ()Ljava/lang/String;
    //   4009: ifnull -> 4049
    //   4012: goto -> 4019
    //   4015: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4018: athrow
    //   4019: aload #8
    //   4021: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4024: invokevirtual getName : ()Ljava/lang/String;
    //   4027: sipush #-26590
    //   4030: sipush #10927
    //   4033: invokestatic a : (II)Ljava/lang/String;
    //   4036: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4039: ifne -> 4049
    //   4042: goto -> 4049
    //   4045: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4048: athrow
    //   4049: aload #7
    //   4051: iconst_1
    //   4052: invokevirtual setAccessible : (Z)V
    //   4055: aload #7
    //   4057: aconst_null
    //   4058: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4061: pop
    //   4062: iinc #6, 1
    //   4065: iload_2
    //   4066: ifeq -> 3927
    //   4069: sipush #-26569
    //   4072: sipush #20720
    //   4075: invokestatic a : (II)Ljava/lang/String;
    //   4078: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4081: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4084: astore #4
    //   4086: aload #4
    //   4088: arraylength
    //   4089: istore #5
    //   4091: iconst_0
    //   4092: istore #6
    //   4094: iload #6
    //   4096: iload #5
    //   4098: if_icmpge -> 4231
    //   4101: aload #4
    //   4103: iload #6
    //   4105: aaload
    //   4106: astore #7
    //   4108: aload #7
    //   4110: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4113: pop
    //   4114: aload #7
    //   4116: invokevirtual getModifiers : ()I
    //   4119: invokestatic isStatic : (I)Z
    //   4122: ifeq -> 4217
    //   4125: aload #7
    //   4127: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4130: arraylength
    //   4131: iconst_2
    //   4132: if_icmpne -> 4217
    //   4135: goto -> 4142
    //   4138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4141: athrow
    //   4142: aload #7
    //   4144: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4147: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   4150: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4153: ifeq -> 4217
    //   4156: goto -> 4163
    //   4159: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4162: athrow
    //   4163: aload #7
    //   4165: iconst_1
    //   4166: invokevirtual setAccessible : (Z)V
    //   4169: aload #7
    //   4171: aconst_null
    //   4172: iconst_2
    //   4173: anewarray java/lang/Object
    //   4176: dup
    //   4177: iconst_0
    //   4178: aload_0
    //   4179: aastore
    //   4180: dup
    //   4181: iconst_1
    //   4182: aload_1
    //   4183: ifnonnull -> 4201
    //   4186: goto -> 4193
    //   4189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4192: athrow
    //   4193: aload_1
    //   4194: goto -> 4208
    //   4197: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4200: athrow
    //   4201: aload_1
    //   4202: checkcast [B
    //   4205: invokevirtual clone : ()Ljava/lang/Object;
    //   4208: aastore
    //   4209: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4212: pop
    //   4213: iload_2
    //   4214: ifeq -> 4231
    //   4217: iinc #6, 1
    //   4220: iload_2
    //   4221: ifeq -> 4094
    //   4224: goto -> 4231
    //   4227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4230: athrow
    //   4231: iconst_0
    //   4232: istore #4
    //   4234: getstatic burp/Zsfg.Zh : Ljava/lang/String;
    //   4237: getstatic burp/Zrn4.Zq : Ljava/lang/Object;
    //   4240: checkcast java/math/BigInteger
    //   4243: invokevirtual intValue : ()I
    //   4246: bipush #32
    //   4248: irem
    //   4249: invokestatic abs : (I)I
    //   4252: invokevirtual charAt : (I)C
    //   4255: getstatic burp/Zzac.ZE : Ljava/lang/String;
    //   4258: getstatic burp/Zt5t.Za : Ljava/lang/Object;
    //   4261: checkcast java/math/BigInteger
    //   4264: invokevirtual intValue : ()I
    //   4267: bipush #32
    //   4269: irem
    //   4270: invokestatic abs : (I)I
    //   4273: invokevirtual charAt : (I)C
    //   4276: if_icmpgt -> 4621
    //   4279: sipush #-26562
    //   4282: sipush #27255
    //   4285: invokestatic a : (II)Ljava/lang/String;
    //   4288: iconst_1
    //   4289: ldc burp/Zeig
    //   4291: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4294: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4297: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4300: astore #5
    //   4302: aload #5
    //   4304: arraylength
    //   4305: istore #6
    //   4307: iconst_0
    //   4308: istore #7
    //   4310: iload #7
    //   4312: iload #6
    //   4314: if_icmpge -> 4452
    //   4317: aload #5
    //   4319: iload #7
    //   4321: aaload
    //   4322: astore #8
    //   4324: aload #8
    //   4326: invokevirtual getModifiers : ()I
    //   4329: invokestatic isStatic : (I)Z
    //   4332: ifne -> 4342
    //   4335: goto -> 4445
    //   4338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4341: athrow
    //   4342: aload #8
    //   4344: invokevirtual getType : ()Ljava/lang/Class;
    //   4347: astore #9
    //   4349: aload #9
    //   4351: ifnull -> 4432
    //   4354: aload #9
    //   4356: invokevirtual isPrimitive : ()Z
    //   4359: ifne -> 4432
    //   4362: goto -> 4369
    //   4365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4368: athrow
    //   4369: aload #9
    //   4371: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4374: ifnull -> 4432
    //   4377: goto -> 4384
    //   4380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4383: athrow
    //   4384: aload #9
    //   4386: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4389: invokevirtual getName : ()Ljava/lang/String;
    //   4392: ifnull -> 4432
    //   4395: goto -> 4402
    //   4398: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4401: athrow
    //   4402: aload #9
    //   4404: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4407: invokevirtual getName : ()Ljava/lang/String;
    //   4410: sipush #-26574
    //   4413: sipush #6927
    //   4416: invokestatic a : (II)Ljava/lang/String;
    //   4419: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4422: ifne -> 4432
    //   4425: goto -> 4432
    //   4428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4431: athrow
    //   4432: aload #8
    //   4434: iconst_1
    //   4435: invokevirtual setAccessible : (Z)V
    //   4438: aload #8
    //   4440: aconst_null
    //   4441: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4444: pop
    //   4445: iinc #7, 1
    //   4448: iload_2
    //   4449: ifeq -> 4310
    //   4452: sipush #-26577
    //   4455: sipush #30937
    //   4458: invokestatic a : (II)Ljava/lang/String;
    //   4461: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4464: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4467: astore #5
    //   4469: aload #5
    //   4471: arraylength
    //   4472: istore #6
    //   4474: iconst_0
    //   4475: istore #7
    //   4477: iload #7
    //   4479: iload #6
    //   4481: if_icmpge -> 4618
    //   4484: aload #5
    //   4486: iload #7
    //   4488: aaload
    //   4489: astore #8
    //   4491: aload #8
    //   4493: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4496: pop
    //   4497: aload #8
    //   4499: invokevirtual getModifiers : ()I
    //   4502: invokestatic isStatic : (I)Z
    //   4505: ifeq -> 4604
    //   4508: aload #8
    //   4510: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4513: arraylength
    //   4514: iconst_2
    //   4515: if_icmpne -> 4604
    //   4518: goto -> 4525
    //   4521: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4524: athrow
    //   4525: aload #8
    //   4527: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4530: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4533: if_acmpne -> 4604
    //   4536: goto -> 4543
    //   4539: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4542: athrow
    //   4543: aload #8
    //   4545: iconst_1
    //   4546: invokevirtual setAccessible : (Z)V
    //   4549: aload #8
    //   4551: aconst_null
    //   4552: iconst_2
    //   4553: anewarray java/lang/Object
    //   4556: dup
    //   4557: iconst_0
    //   4558: aload_0
    //   4559: aastore
    //   4560: dup
    //   4561: iconst_1
    //   4562: aload_1
    //   4563: ifnonnull -> 4581
    //   4566: goto -> 4573
    //   4569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4572: athrow
    //   4573: aload_1
    //   4574: goto -> 4588
    //   4577: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4580: athrow
    //   4581: aload_1
    //   4582: checkcast [B
    //   4585: invokevirtual clone : ()Ljava/lang/Object;
    //   4588: aastore
    //   4589: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4592: checkcast java/lang/Boolean
    //   4595: invokevirtual booleanValue : ()Z
    //   4598: istore #4
    //   4600: iload_2
    //   4601: ifeq -> 4618
    //   4604: iinc #7, 1
    //   4607: iload_2
    //   4608: ifeq -> 4477
    //   4611: goto -> 4618
    //   4614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4617: athrow
    //   4618: goto -> 4960
    //   4621: sipush #-26576
    //   4624: sipush #3447
    //   4627: invokestatic a : (II)Ljava/lang/String;
    //   4630: iconst_1
    //   4631: ldc burp/Zm52
    //   4633: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4636: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4639: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4642: astore #5
    //   4644: aload #5
    //   4646: arraylength
    //   4647: istore #6
    //   4649: iconst_0
    //   4650: istore #7
    //   4652: iload #7
    //   4654: iload #6
    //   4656: if_icmpge -> 4794
    //   4659: aload #5
    //   4661: iload #7
    //   4663: aaload
    //   4664: astore #8
    //   4666: aload #8
    //   4668: invokevirtual getModifiers : ()I
    //   4671: invokestatic isStatic : (I)Z
    //   4674: ifne -> 4684
    //   4677: goto -> 4787
    //   4680: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4683: athrow
    //   4684: aload #8
    //   4686: invokevirtual getType : ()Ljava/lang/Class;
    //   4689: astore #9
    //   4691: aload #9
    //   4693: ifnull -> 4774
    //   4696: aload #9
    //   4698: invokevirtual isPrimitive : ()Z
    //   4701: ifne -> 4774
    //   4704: goto -> 4711
    //   4707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4710: athrow
    //   4711: aload #9
    //   4713: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4716: ifnull -> 4774
    //   4719: goto -> 4726
    //   4722: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4725: athrow
    //   4726: aload #9
    //   4728: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4731: invokevirtual getName : ()Ljava/lang/String;
    //   4734: ifnull -> 4774
    //   4737: goto -> 4744
    //   4740: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4743: athrow
    //   4744: aload #9
    //   4746: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4749: invokevirtual getName : ()Ljava/lang/String;
    //   4752: sipush #-26574
    //   4755: sipush #6927
    //   4758: invokestatic a : (II)Ljava/lang/String;
    //   4761: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4764: ifne -> 4774
    //   4767: goto -> 4774
    //   4770: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4773: athrow
    //   4774: aload #8
    //   4776: iconst_1
    //   4777: invokevirtual setAccessible : (Z)V
    //   4780: aload #8
    //   4782: aconst_null
    //   4783: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4786: pop
    //   4787: iinc #7, 1
    //   4790: iload_2
    //   4791: ifeq -> 4652
    //   4794: sipush #-26563
    //   4797: sipush #28997
    //   4800: invokestatic a : (II)Ljava/lang/String;
    //   4803: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4806: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4809: astore #5
    //   4811: aload #5
    //   4813: arraylength
    //   4814: istore #6
    //   4816: iconst_0
    //   4817: istore #7
    //   4819: iload #7
    //   4821: iload #6
    //   4823: if_icmpge -> 4960
    //   4826: aload #5
    //   4828: iload #7
    //   4830: aaload
    //   4831: astore #8
    //   4833: aload #8
    //   4835: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4838: pop
    //   4839: aload #8
    //   4841: invokevirtual getModifiers : ()I
    //   4844: invokestatic isStatic : (I)Z
    //   4847: ifeq -> 4946
    //   4850: aload #8
    //   4852: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4855: arraylength
    //   4856: iconst_2
    //   4857: if_icmpne -> 4946
    //   4860: goto -> 4867
    //   4863: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4866: athrow
    //   4867: aload #8
    //   4869: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4872: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4875: if_acmpne -> 4946
    //   4878: goto -> 4885
    //   4881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4884: athrow
    //   4885: aload #8
    //   4887: iconst_1
    //   4888: invokevirtual setAccessible : (Z)V
    //   4891: aload #8
    //   4893: aconst_null
    //   4894: iconst_2
    //   4895: anewarray java/lang/Object
    //   4898: dup
    //   4899: iconst_0
    //   4900: aload_0
    //   4901: aastore
    //   4902: dup
    //   4903: iconst_1
    //   4904: aload_1
    //   4905: ifnonnull -> 4923
    //   4908: goto -> 4915
    //   4911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4914: athrow
    //   4915: aload_1
    //   4916: goto -> 4930
    //   4919: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4922: athrow
    //   4923: aload_1
    //   4924: checkcast [B
    //   4927: invokevirtual clone : ()Ljava/lang/Object;
    //   4930: aastore
    //   4931: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4934: checkcast java/lang/Boolean
    //   4937: invokevirtual booleanValue : ()Z
    //   4940: istore #4
    //   4942: iload_2
    //   4943: ifeq -> 4960
    //   4946: iinc #7, 1
    //   4949: iload_2
    //   4950: ifeq -> 4819
    //   4953: goto -> 4960
    //   4956: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4959: athrow
    //   4960: iload #4
    //   4962: ifeq -> 4968
    //   4965: iload #4
    //   4967: ireturn
    //   4968: getstatic burp/Zek4.Zo : Ljava/lang/String;
    //   4971: getstatic burp/Zz4a.ZB : Ljava/lang/Object;
    //   4974: checkcast java/math/BigInteger
    //   4977: invokevirtual intValue : ()I
    //   4980: bipush #32
    //   4982: irem
    //   4983: invokestatic abs : (I)I
    //   4986: invokevirtual charAt : (I)C
    //   4989: getstatic burp/Zl7b.Zv : Ljava/lang/String;
    //   4992: getstatic burp/Zgio.ZP : Ljava/lang/Object;
    //   4995: checkcast java/math/BigInteger
    //   4998: invokevirtual intValue : ()I
    //   5001: bipush #32
    //   5003: irem
    //   5004: invokestatic abs : (I)I
    //   5007: invokevirtual charAt : (I)C
    //   5010: if_icmpgt -> 5356
    //   5013: sipush #-26579
    //   5016: sipush #11885
    //   5019: invokestatic a : (II)Ljava/lang/String;
    //   5022: iconst_1
    //   5023: ldc burp/Zt7w
    //   5025: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5028: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5031: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5034: astore #5
    //   5036: aload #5
    //   5038: arraylength
    //   5039: istore #6
    //   5041: iconst_0
    //   5042: istore #7
    //   5044: iload #7
    //   5046: iload #6
    //   5048: if_icmpge -> 5186
    //   5051: aload #5
    //   5053: iload #7
    //   5055: aaload
    //   5056: astore #8
    //   5058: aload #8
    //   5060: invokevirtual getModifiers : ()I
    //   5063: invokestatic isStatic : (I)Z
    //   5066: ifne -> 5076
    //   5069: goto -> 5179
    //   5072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5075: athrow
    //   5076: aload #8
    //   5078: invokevirtual getType : ()Ljava/lang/Class;
    //   5081: astore #9
    //   5083: aload #9
    //   5085: ifnull -> 5166
    //   5088: aload #9
    //   5090: invokevirtual isPrimitive : ()Z
    //   5093: ifne -> 5166
    //   5096: goto -> 5103
    //   5099: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5102: athrow
    //   5103: aload #9
    //   5105: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5108: ifnull -> 5166
    //   5111: goto -> 5118
    //   5114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5117: athrow
    //   5118: aload #9
    //   5120: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5123: invokevirtual getName : ()Ljava/lang/String;
    //   5126: ifnull -> 5166
    //   5129: goto -> 5136
    //   5132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5135: athrow
    //   5136: aload #9
    //   5138: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5141: invokevirtual getName : ()Ljava/lang/String;
    //   5144: sipush #-26574
    //   5147: sipush #6927
    //   5150: invokestatic a : (II)Ljava/lang/String;
    //   5153: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5156: ifne -> 5166
    //   5159: goto -> 5166
    //   5162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5165: athrow
    //   5166: aload #8
    //   5168: iconst_1
    //   5169: invokevirtual setAccessible : (Z)V
    //   5172: aload #8
    //   5174: aconst_null
    //   5175: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5178: pop
    //   5179: iinc #7, 1
    //   5182: iload_2
    //   5183: ifeq -> 5044
    //   5186: sipush #-26591
    //   5189: sipush #8665
    //   5192: invokestatic a : (II)Ljava/lang/String;
    //   5195: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5198: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5201: astore #5
    //   5203: aload #5
    //   5205: arraylength
    //   5206: istore #6
    //   5208: iconst_0
    //   5209: istore #7
    //   5211: iload #7
    //   5213: iload #6
    //   5215: if_icmpge -> 5352
    //   5218: aload #5
    //   5220: iload #7
    //   5222: aaload
    //   5223: astore #8
    //   5225: aload #8
    //   5227: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5230: pop
    //   5231: aload #8
    //   5233: invokevirtual getModifiers : ()I
    //   5236: invokestatic isStatic : (I)Z
    //   5239: ifeq -> 5338
    //   5242: aload #8
    //   5244: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5247: arraylength
    //   5248: iconst_2
    //   5249: if_icmpne -> 5338
    //   5252: goto -> 5259
    //   5255: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5258: athrow
    //   5259: aload #8
    //   5261: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5264: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5267: if_acmpne -> 5338
    //   5270: goto -> 5277
    //   5273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5276: athrow
    //   5277: aload #8
    //   5279: iconst_1
    //   5280: invokevirtual setAccessible : (Z)V
    //   5283: aload #8
    //   5285: aconst_null
    //   5286: iconst_2
    //   5287: anewarray java/lang/Object
    //   5290: dup
    //   5291: iconst_0
    //   5292: aload_0
    //   5293: aastore
    //   5294: dup
    //   5295: iconst_1
    //   5296: aload_1
    //   5297: ifnonnull -> 5315
    //   5300: goto -> 5307
    //   5303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5306: athrow
    //   5307: aload_1
    //   5308: goto -> 5322
    //   5311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5314: athrow
    //   5315: aload_1
    //   5316: checkcast [B
    //   5319: invokevirtual clone : ()Ljava/lang/Object;
    //   5322: aastore
    //   5323: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5326: checkcast java/lang/Boolean
    //   5329: invokevirtual booleanValue : ()Z
    //   5332: istore #4
    //   5334: iload_2
    //   5335: ifeq -> 5352
    //   5338: iinc #7, 1
    //   5341: iload_2
    //   5342: ifeq -> 5211
    //   5345: goto -> 5352
    //   5348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5351: athrow
    //   5352: iload_2
    //   5353: ifeq -> 5695
    //   5356: sipush #-26592
    //   5359: sipush #-23651
    //   5362: invokestatic a : (II)Ljava/lang/String;
    //   5365: iconst_1
    //   5366: ldc burp/Zgfm
    //   5368: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5371: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5374: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5377: astore #5
    //   5379: aload #5
    //   5381: arraylength
    //   5382: istore #6
    //   5384: iconst_0
    //   5385: istore #7
    //   5387: iload #7
    //   5389: iload #6
    //   5391: if_icmpge -> 5529
    //   5394: aload #5
    //   5396: iload #7
    //   5398: aaload
    //   5399: astore #8
    //   5401: aload #8
    //   5403: invokevirtual getModifiers : ()I
    //   5406: invokestatic isStatic : (I)Z
    //   5409: ifne -> 5419
    //   5412: goto -> 5522
    //   5415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5418: athrow
    //   5419: aload #8
    //   5421: invokevirtual getType : ()Ljava/lang/Class;
    //   5424: astore #9
    //   5426: aload #9
    //   5428: ifnull -> 5509
    //   5431: aload #9
    //   5433: invokevirtual isPrimitive : ()Z
    //   5436: ifne -> 5509
    //   5439: goto -> 5446
    //   5442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5445: athrow
    //   5446: aload #9
    //   5448: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5451: ifnull -> 5509
    //   5454: goto -> 5461
    //   5457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5460: athrow
    //   5461: aload #9
    //   5463: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5466: invokevirtual getName : ()Ljava/lang/String;
    //   5469: ifnull -> 5509
    //   5472: goto -> 5479
    //   5475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5478: athrow
    //   5479: aload #9
    //   5481: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5484: invokevirtual getName : ()Ljava/lang/String;
    //   5487: sipush #-26574
    //   5490: sipush #6927
    //   5493: invokestatic a : (II)Ljava/lang/String;
    //   5496: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5499: ifne -> 5509
    //   5502: goto -> 5509
    //   5505: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5508: athrow
    //   5509: aload #8
    //   5511: iconst_1
    //   5512: invokevirtual setAccessible : (Z)V
    //   5515: aload #8
    //   5517: aconst_null
    //   5518: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5521: pop
    //   5522: iinc #7, 1
    //   5525: iload_2
    //   5526: ifeq -> 5387
    //   5529: sipush #-26572
    //   5532: sipush #7613
    //   5535: invokestatic a : (II)Ljava/lang/String;
    //   5538: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5541: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5544: astore #5
    //   5546: aload #5
    //   5548: arraylength
    //   5549: istore #6
    //   5551: iconst_0
    //   5552: istore #7
    //   5554: iload #7
    //   5556: iload #6
    //   5558: if_icmpge -> 5695
    //   5561: aload #5
    //   5563: iload #7
    //   5565: aaload
    //   5566: astore #8
    //   5568: aload #8
    //   5570: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5573: pop
    //   5574: aload #8
    //   5576: invokevirtual getModifiers : ()I
    //   5579: invokestatic isStatic : (I)Z
    //   5582: ifeq -> 5681
    //   5585: aload #8
    //   5587: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5590: arraylength
    //   5591: iconst_2
    //   5592: if_icmpne -> 5681
    //   5595: goto -> 5602
    //   5598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5601: athrow
    //   5602: aload #8
    //   5604: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5607: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5610: if_acmpne -> 5681
    //   5613: goto -> 5620
    //   5616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5619: athrow
    //   5620: aload #8
    //   5622: iconst_1
    //   5623: invokevirtual setAccessible : (Z)V
    //   5626: aload #8
    //   5628: aconst_null
    //   5629: iconst_2
    //   5630: anewarray java/lang/Object
    //   5633: dup
    //   5634: iconst_0
    //   5635: aload_0
    //   5636: aastore
    //   5637: dup
    //   5638: iconst_1
    //   5639: aload_1
    //   5640: ifnonnull -> 5658
    //   5643: goto -> 5650
    //   5646: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5649: athrow
    //   5650: aload_1
    //   5651: goto -> 5665
    //   5654: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5657: athrow
    //   5658: aload_1
    //   5659: checkcast [B
    //   5662: invokevirtual clone : ()Ljava/lang/Object;
    //   5665: aastore
    //   5666: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5669: checkcast java/lang/Boolean
    //   5672: invokevirtual booleanValue : ()Z
    //   5675: istore #4
    //   5677: iload_2
    //   5678: ifeq -> 5695
    //   5681: iinc #7, 1
    //   5684: iload_2
    //   5685: ifeq -> 5554
    //   5688: goto -> 5695
    //   5691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5694: athrow
    //   5695: iload #4
    //   5697: ifeq -> 5703
    //   5700: iload #4
    //   5702: ireturn
    //   5703: getstatic burp/Zebe.ZW : Ljava/lang/String;
    //   5706: getstatic burp/Zeqz.ZG : Ljava/lang/Object;
    //   5709: checkcast java/math/BigInteger
    //   5712: invokevirtual intValue : ()I
    //   5715: bipush #32
    //   5717: irem
    //   5718: invokestatic abs : (I)I
    //   5721: invokevirtual charAt : (I)C
    //   5724: getstatic burp/Zs_m.Zt : Ljava/lang/String;
    //   5727: getstatic burp/Zso.ZA : Ljava/lang/Object;
    //   5730: checkcast java/math/BigInteger
    //   5733: invokevirtual intValue : ()I
    //   5736: bipush #32
    //   5738: irem
    //   5739: invokestatic abs : (I)I
    //   5742: invokevirtual charAt : (I)C
    //   5745: if_icmple -> 6091
    //   5748: sipush #-26578
    //   5751: sipush #27933
    //   5754: invokestatic a : (II)Ljava/lang/String;
    //   5757: iconst_1
    //   5758: ldc burp/Zgrf
    //   5760: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5763: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5766: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5769: astore #5
    //   5771: aload #5
    //   5773: arraylength
    //   5774: istore #6
    //   5776: iconst_0
    //   5777: istore #7
    //   5779: iload #7
    //   5781: iload #6
    //   5783: if_icmpge -> 5921
    //   5786: aload #5
    //   5788: iload #7
    //   5790: aaload
    //   5791: astore #8
    //   5793: aload #8
    //   5795: invokevirtual getModifiers : ()I
    //   5798: invokestatic isStatic : (I)Z
    //   5801: ifne -> 5811
    //   5804: goto -> 5914
    //   5807: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5810: athrow
    //   5811: aload #8
    //   5813: invokevirtual getType : ()Ljava/lang/Class;
    //   5816: astore #9
    //   5818: aload #9
    //   5820: ifnull -> 5901
    //   5823: aload #9
    //   5825: invokevirtual isPrimitive : ()Z
    //   5828: ifne -> 5901
    //   5831: goto -> 5838
    //   5834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5837: athrow
    //   5838: aload #9
    //   5840: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5843: ifnull -> 5901
    //   5846: goto -> 5853
    //   5849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5852: athrow
    //   5853: aload #9
    //   5855: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5858: invokevirtual getName : ()Ljava/lang/String;
    //   5861: ifnull -> 5901
    //   5864: goto -> 5871
    //   5867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5870: athrow
    //   5871: aload #9
    //   5873: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5876: invokevirtual getName : ()Ljava/lang/String;
    //   5879: sipush #-26574
    //   5882: sipush #6927
    //   5885: invokestatic a : (II)Ljava/lang/String;
    //   5888: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5891: ifne -> 5901
    //   5894: goto -> 5901
    //   5897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5900: athrow
    //   5901: aload #8
    //   5903: iconst_1
    //   5904: invokevirtual setAccessible : (Z)V
    //   5907: aload #8
    //   5909: aconst_null
    //   5910: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5913: pop
    //   5914: iinc #7, 1
    //   5917: iload_2
    //   5918: ifeq -> 5779
    //   5921: sipush #-26561
    //   5924: sipush #21639
    //   5927: invokestatic a : (II)Ljava/lang/String;
    //   5930: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5933: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5936: astore #5
    //   5938: aload #5
    //   5940: arraylength
    //   5941: istore #6
    //   5943: iconst_0
    //   5944: istore #7
    //   5946: iload #7
    //   5948: iload #6
    //   5950: if_icmpge -> 6087
    //   5953: aload #5
    //   5955: iload #7
    //   5957: aaload
    //   5958: astore #8
    //   5960: aload #8
    //   5962: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5965: pop
    //   5966: aload #8
    //   5968: invokevirtual getModifiers : ()I
    //   5971: invokestatic isStatic : (I)Z
    //   5974: ifeq -> 6073
    //   5977: aload #8
    //   5979: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5982: arraylength
    //   5983: iconst_2
    //   5984: if_icmpne -> 6073
    //   5987: goto -> 5994
    //   5990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5993: athrow
    //   5994: aload #8
    //   5996: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5999: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6002: if_acmpne -> 6073
    //   6005: goto -> 6012
    //   6008: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6011: athrow
    //   6012: aload #8
    //   6014: iconst_1
    //   6015: invokevirtual setAccessible : (Z)V
    //   6018: aload #8
    //   6020: aconst_null
    //   6021: iconst_2
    //   6022: anewarray java/lang/Object
    //   6025: dup
    //   6026: iconst_0
    //   6027: aload_0
    //   6028: aastore
    //   6029: dup
    //   6030: iconst_1
    //   6031: aload_1
    //   6032: ifnonnull -> 6050
    //   6035: goto -> 6042
    //   6038: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6041: athrow
    //   6042: aload_1
    //   6043: goto -> 6057
    //   6046: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6049: athrow
    //   6050: aload_1
    //   6051: checkcast [B
    //   6054: invokevirtual clone : ()Ljava/lang/Object;
    //   6057: aastore
    //   6058: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6061: checkcast java/lang/Boolean
    //   6064: invokevirtual booleanValue : ()Z
    //   6067: istore #4
    //   6069: iload_2
    //   6070: ifeq -> 6087
    //   6073: iinc #7, 1
    //   6076: iload_2
    //   6077: ifeq -> 5946
    //   6080: goto -> 6087
    //   6083: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6086: athrow
    //   6087: iload_2
    //   6088: ifeq -> 6430
    //   6091: sipush #-26583
    //   6094: sipush #-5190
    //   6097: invokestatic a : (II)Ljava/lang/String;
    //   6100: iconst_1
    //   6101: ldc burp/Zm6h
    //   6103: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6106: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6109: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6112: astore #5
    //   6114: aload #5
    //   6116: arraylength
    //   6117: istore #6
    //   6119: iconst_0
    //   6120: istore #7
    //   6122: iload #7
    //   6124: iload #6
    //   6126: if_icmpge -> 6264
    //   6129: aload #5
    //   6131: iload #7
    //   6133: aaload
    //   6134: astore #8
    //   6136: aload #8
    //   6138: invokevirtual getModifiers : ()I
    //   6141: invokestatic isStatic : (I)Z
    //   6144: ifne -> 6154
    //   6147: goto -> 6257
    //   6150: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6153: athrow
    //   6154: aload #8
    //   6156: invokevirtual getType : ()Ljava/lang/Class;
    //   6159: astore #9
    //   6161: aload #9
    //   6163: ifnull -> 6244
    //   6166: aload #9
    //   6168: invokevirtual isPrimitive : ()Z
    //   6171: ifne -> 6244
    //   6174: goto -> 6181
    //   6177: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6180: athrow
    //   6181: aload #9
    //   6183: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6186: ifnull -> 6244
    //   6189: goto -> 6196
    //   6192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6195: athrow
    //   6196: aload #9
    //   6198: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6201: invokevirtual getName : ()Ljava/lang/String;
    //   6204: ifnull -> 6244
    //   6207: goto -> 6214
    //   6210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6213: athrow
    //   6214: aload #9
    //   6216: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6219: invokevirtual getName : ()Ljava/lang/String;
    //   6222: sipush #-26574
    //   6225: sipush #6927
    //   6228: invokestatic a : (II)Ljava/lang/String;
    //   6231: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6234: ifne -> 6244
    //   6237: goto -> 6244
    //   6240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6243: athrow
    //   6244: aload #8
    //   6246: iconst_1
    //   6247: invokevirtual setAccessible : (Z)V
    //   6250: aload #8
    //   6252: aconst_null
    //   6253: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6256: pop
    //   6257: iinc #7, 1
    //   6260: iload_2
    //   6261: ifeq -> 6122
    //   6264: sipush #-26566
    //   6267: sipush #-472
    //   6270: invokestatic a : (II)Ljava/lang/String;
    //   6273: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6276: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6279: astore #5
    //   6281: aload #5
    //   6283: arraylength
    //   6284: istore #6
    //   6286: iconst_0
    //   6287: istore #7
    //   6289: iload #7
    //   6291: iload #6
    //   6293: if_icmpge -> 6430
    //   6296: aload #5
    //   6298: iload #7
    //   6300: aaload
    //   6301: astore #8
    //   6303: aload #8
    //   6305: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6308: pop
    //   6309: aload #8
    //   6311: invokevirtual getModifiers : ()I
    //   6314: invokestatic isStatic : (I)Z
    //   6317: ifeq -> 6416
    //   6320: aload #8
    //   6322: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6325: arraylength
    //   6326: iconst_2
    //   6327: if_icmpne -> 6416
    //   6330: goto -> 6337
    //   6333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6336: athrow
    //   6337: aload #8
    //   6339: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6342: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6345: if_acmpne -> 6416
    //   6348: goto -> 6355
    //   6351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6354: athrow
    //   6355: aload #8
    //   6357: iconst_1
    //   6358: invokevirtual setAccessible : (Z)V
    //   6361: aload #8
    //   6363: aconst_null
    //   6364: iconst_2
    //   6365: anewarray java/lang/Object
    //   6368: dup
    //   6369: iconst_0
    //   6370: aload_0
    //   6371: aastore
    //   6372: dup
    //   6373: iconst_1
    //   6374: aload_1
    //   6375: ifnonnull -> 6393
    //   6378: goto -> 6385
    //   6381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6384: athrow
    //   6385: aload_1
    //   6386: goto -> 6400
    //   6389: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6392: athrow
    //   6393: aload_1
    //   6394: checkcast [B
    //   6397: invokevirtual clone : ()Ljava/lang/Object;
    //   6400: aastore
    //   6401: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6404: checkcast java/lang/Boolean
    //   6407: invokevirtual booleanValue : ()Z
    //   6410: istore #4
    //   6412: iload_2
    //   6413: ifeq -> 6430
    //   6416: iinc #7, 1
    //   6419: iload_2
    //   6420: ifeq -> 6289
    //   6423: goto -> 6430
    //   6426: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6429: athrow
    //   6430: iload #4
    //   6432: ifeq -> 6438
    //   6435: iload #4
    //   6437: ireturn
    //   6438: getstatic burp/Zm83.Zq : Ljava/lang/String;
    //   6441: getstatic burp/Zm1d.ZS : Ljava/lang/Object;
    //   6444: checkcast java/math/BigInteger
    //   6447: invokevirtual intValue : ()I
    //   6450: bipush #32
    //   6452: irem
    //   6453: invokestatic abs : (I)I
    //   6456: invokevirtual charAt : (I)C
    //   6459: getstatic burp/Zt7x.Zu : Ljava/lang/String;
    //   6462: getstatic burp/Zm83.Zl : Ljava/lang/Object;
    //   6465: checkcast java/math/BigInteger
    //   6468: invokevirtual intValue : ()I
    //   6471: bipush #32
    //   6473: irem
    //   6474: invokestatic abs : (I)I
    //   6477: invokevirtual charAt : (I)C
    //   6480: if_icmple -> 6826
    //   6483: sipush #-26580
    //   6486: sipush #-24787
    //   6489: invokestatic a : (II)Ljava/lang/String;
    //   6492: iconst_1
    //   6493: ldc burp/Zbu6
    //   6495: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6498: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6501: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6504: astore #5
    //   6506: aload #5
    //   6508: arraylength
    //   6509: istore #6
    //   6511: iconst_0
    //   6512: istore #7
    //   6514: iload #7
    //   6516: iload #6
    //   6518: if_icmpge -> 6656
    //   6521: aload #5
    //   6523: iload #7
    //   6525: aaload
    //   6526: astore #8
    //   6528: aload #8
    //   6530: invokevirtual getModifiers : ()I
    //   6533: invokestatic isStatic : (I)Z
    //   6536: ifne -> 6546
    //   6539: goto -> 6649
    //   6542: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6545: athrow
    //   6546: aload #8
    //   6548: invokevirtual getType : ()Ljava/lang/Class;
    //   6551: astore #9
    //   6553: aload #9
    //   6555: ifnull -> 6636
    //   6558: aload #9
    //   6560: invokevirtual isPrimitive : ()Z
    //   6563: ifne -> 6636
    //   6566: goto -> 6573
    //   6569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6572: athrow
    //   6573: aload #9
    //   6575: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6578: ifnull -> 6636
    //   6581: goto -> 6588
    //   6584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6587: athrow
    //   6588: aload #9
    //   6590: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6593: invokevirtual getName : ()Ljava/lang/String;
    //   6596: ifnull -> 6636
    //   6599: goto -> 6606
    //   6602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6605: athrow
    //   6606: aload #9
    //   6608: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6611: invokevirtual getName : ()Ljava/lang/String;
    //   6614: sipush #-26574
    //   6617: sipush #6927
    //   6620: invokestatic a : (II)Ljava/lang/String;
    //   6623: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6626: ifne -> 6636
    //   6629: goto -> 6636
    //   6632: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6635: athrow
    //   6636: aload #8
    //   6638: iconst_1
    //   6639: invokevirtual setAccessible : (Z)V
    //   6642: aload #8
    //   6644: aconst_null
    //   6645: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6648: pop
    //   6649: iinc #7, 1
    //   6652: iload_2
    //   6653: ifeq -> 6514
    //   6656: sipush #-26575
    //   6659: sipush #19606
    //   6662: invokestatic a : (II)Ljava/lang/String;
    //   6665: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6668: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6671: astore #5
    //   6673: aload #5
    //   6675: arraylength
    //   6676: istore #6
    //   6678: iconst_0
    //   6679: istore #7
    //   6681: iload #7
    //   6683: iload #6
    //   6685: if_icmpge -> 6822
    //   6688: aload #5
    //   6690: iload #7
    //   6692: aaload
    //   6693: astore #8
    //   6695: aload #8
    //   6697: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6700: pop
    //   6701: aload #8
    //   6703: invokevirtual getModifiers : ()I
    //   6706: invokestatic isStatic : (I)Z
    //   6709: ifeq -> 6808
    //   6712: aload #8
    //   6714: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6717: arraylength
    //   6718: iconst_2
    //   6719: if_icmpne -> 6808
    //   6722: goto -> 6729
    //   6725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6728: athrow
    //   6729: aload #8
    //   6731: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6734: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6737: if_acmpne -> 6808
    //   6740: goto -> 6747
    //   6743: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6746: athrow
    //   6747: aload #8
    //   6749: iconst_1
    //   6750: invokevirtual setAccessible : (Z)V
    //   6753: aload #8
    //   6755: aconst_null
    //   6756: iconst_2
    //   6757: anewarray java/lang/Object
    //   6760: dup
    //   6761: iconst_0
    //   6762: aload_0
    //   6763: aastore
    //   6764: dup
    //   6765: iconst_1
    //   6766: aload_1
    //   6767: ifnonnull -> 6785
    //   6770: goto -> 6777
    //   6773: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6776: athrow
    //   6777: aload_1
    //   6778: goto -> 6792
    //   6781: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6784: athrow
    //   6785: aload_1
    //   6786: checkcast [B
    //   6789: invokevirtual clone : ()Ljava/lang/Object;
    //   6792: aastore
    //   6793: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6796: checkcast java/lang/Boolean
    //   6799: invokevirtual booleanValue : ()Z
    //   6802: istore #4
    //   6804: iload_2
    //   6805: ifeq -> 6822
    //   6808: iinc #7, 1
    //   6811: iload_2
    //   6812: ifeq -> 6681
    //   6815: goto -> 6822
    //   6818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6821: athrow
    //   6822: iload_2
    //   6823: ifeq -> 7165
    //   6826: sipush #-26589
    //   6829: sipush #1397
    //   6832: invokestatic a : (II)Ljava/lang/String;
    //   6835: iconst_1
    //   6836: ldc burp/Zsq6
    //   6838: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6841: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6844: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6847: astore #5
    //   6849: aload #5
    //   6851: arraylength
    //   6852: istore #6
    //   6854: iconst_0
    //   6855: istore #7
    //   6857: iload #7
    //   6859: iload #6
    //   6861: if_icmpge -> 6999
    //   6864: aload #5
    //   6866: iload #7
    //   6868: aaload
    //   6869: astore #8
    //   6871: aload #8
    //   6873: invokevirtual getModifiers : ()I
    //   6876: invokestatic isStatic : (I)Z
    //   6879: ifne -> 6889
    //   6882: goto -> 6992
    //   6885: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6888: athrow
    //   6889: aload #8
    //   6891: invokevirtual getType : ()Ljava/lang/Class;
    //   6894: astore #9
    //   6896: aload #9
    //   6898: ifnull -> 6979
    //   6901: aload #9
    //   6903: invokevirtual isPrimitive : ()Z
    //   6906: ifne -> 6979
    //   6909: goto -> 6916
    //   6912: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6915: athrow
    //   6916: aload #9
    //   6918: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6921: ifnull -> 6979
    //   6924: goto -> 6931
    //   6927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6930: athrow
    //   6931: aload #9
    //   6933: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6936: invokevirtual getName : ()Ljava/lang/String;
    //   6939: ifnull -> 6979
    //   6942: goto -> 6949
    //   6945: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6948: athrow
    //   6949: aload #9
    //   6951: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6954: invokevirtual getName : ()Ljava/lang/String;
    //   6957: sipush #-26574
    //   6960: sipush #6927
    //   6963: invokestatic a : (II)Ljava/lang/String;
    //   6966: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6969: ifne -> 6979
    //   6972: goto -> 6979
    //   6975: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6978: athrow
    //   6979: aload #8
    //   6981: iconst_1
    //   6982: invokevirtual setAccessible : (Z)V
    //   6985: aload #8
    //   6987: aconst_null
    //   6988: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6991: pop
    //   6992: iinc #7, 1
    //   6995: iload_2
    //   6996: ifeq -> 6857
    //   6999: sipush #-26581
    //   7002: sipush #-2118
    //   7005: invokestatic a : (II)Ljava/lang/String;
    //   7008: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7011: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7014: astore #5
    //   7016: aload #5
    //   7018: arraylength
    //   7019: istore #6
    //   7021: iconst_0
    //   7022: istore #7
    //   7024: iload #7
    //   7026: iload #6
    //   7028: if_icmpge -> 7165
    //   7031: aload #5
    //   7033: iload #7
    //   7035: aaload
    //   7036: astore #8
    //   7038: aload #8
    //   7040: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7043: pop
    //   7044: aload #8
    //   7046: invokevirtual getModifiers : ()I
    //   7049: invokestatic isStatic : (I)Z
    //   7052: ifeq -> 7151
    //   7055: aload #8
    //   7057: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7060: arraylength
    //   7061: iconst_2
    //   7062: if_icmpne -> 7151
    //   7065: goto -> 7072
    //   7068: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7071: athrow
    //   7072: aload #8
    //   7074: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7077: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7080: if_acmpne -> 7151
    //   7083: goto -> 7090
    //   7086: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7089: athrow
    //   7090: aload #8
    //   7092: iconst_1
    //   7093: invokevirtual setAccessible : (Z)V
    //   7096: aload #8
    //   7098: aconst_null
    //   7099: iconst_2
    //   7100: anewarray java/lang/Object
    //   7103: dup
    //   7104: iconst_0
    //   7105: aload_0
    //   7106: aastore
    //   7107: dup
    //   7108: iconst_1
    //   7109: aload_1
    //   7110: ifnonnull -> 7128
    //   7113: goto -> 7120
    //   7116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7119: athrow
    //   7120: aload_1
    //   7121: goto -> 7135
    //   7124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7127: athrow
    //   7128: aload_1
    //   7129: checkcast [B
    //   7132: invokevirtual clone : ()Ljava/lang/Object;
    //   7135: aastore
    //   7136: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7139: checkcast java/lang/Boolean
    //   7142: invokevirtual booleanValue : ()Z
    //   7145: istore #4
    //   7147: iload_2
    //   7148: ifeq -> 7165
    //   7151: iinc #7, 1
    //   7154: iload_2
    //   7155: ifeq -> 7024
    //   7158: goto -> 7165
    //   7161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7164: athrow
    //   7165: iload #4
    //   7167: ireturn
    //   7168: astore_3
    //   7169: new java/lang/Exception
    //   7172: dup
    //   7173: aload_3
    //   7174: invokevirtual getMessage : ()Ljava/lang/String;
    //   7177: invokespecial <init> : (Ljava/lang/String;)V
    //   7180: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4967	7168	java/lang/Throwable
    //   149	164	164	java/lang/Throwable
    //   1166	1192	1192	java/lang/Throwable
    //   1273	1288	1288	java/lang/Throwable
    //   2470	2495	2498	java/lang/Throwable
    //   2539	2714	2717	java/lang/Throwable
    //   2684	2751	2754	java/lang/Throwable
    //   2721	2788	2791	java/lang/Throwable
    //   2758	2825	2828	java/lang/Throwable
    //   2795	2862	2865	java/lang/Throwable
    //   2832	2899	2902	java/lang/Throwable
    //   2869	2936	2939	java/lang/Throwable
    //   2906	2973	2976	java/lang/Throwable
    //   2943	3010	3013	java/lang/Throwable
    //   2980	3047	3050	java/lang/Throwable
    //   3017	3084	3087	java/lang/Throwable
    //   3054	3121	3124	java/lang/Throwable
    //   3091	3158	3161	java/lang/Throwable
    //   3128	3195	3198	java/lang/Throwable
    //   3165	3232	3235	java/lang/Throwable
    //   3202	3269	3272	java/lang/Throwable
    //   3239	3306	3309	java/lang/Throwable
    //   3276	3343	3346	java/lang/Throwable
    //   3313	3380	3383	java/lang/Throwable
    //   3350	3417	3420	java/lang/Throwable
    //   3387	3454	3457	java/lang/Throwable
    //   3424	3491	3494	java/lang/Throwable
    //   3461	3528	3531	java/lang/Throwable
    //   3498	3565	3568	java/lang/Throwable
    //   3535	3602	3605	java/lang/Throwable
    //   3572	3639	3642	java/lang/Throwable
    //   3609	3676	3679	java/lang/Throwable
    //   3646	3713	3716	java/lang/Throwable
    //   3683	3750	3753	java/lang/Throwable
    //   3720	3787	3790	java/lang/Throwable
    //   3757	3824	3827	java/lang/Throwable
    //   3794	3857	3860	java/lang/Throwable
    //   3941	3955	3955	java/lang/Throwable
    //   3966	3979	3982	java/lang/Throwable
    //   3971	3994	3997	java/lang/Throwable
    //   3986	4012	4015	java/lang/Throwable
    //   4001	4042	4045	java/lang/Throwable
    //   4108	4135	4138	java/lang/Throwable
    //   4125	4156	4159	java/lang/Throwable
    //   4142	4186	4189	java/lang/Throwable
    //   4163	4197	4197	java/lang/Throwable
    //   4208	4224	4227	java/lang/Throwable
    //   4324	4338	4338	java/lang/Throwable
    //   4349	4362	4365	java/lang/Throwable
    //   4354	4377	4380	java/lang/Throwable
    //   4369	4395	4398	java/lang/Throwable
    //   4384	4425	4428	java/lang/Throwable
    //   4491	4518	4521	java/lang/Throwable
    //   4508	4536	4539	java/lang/Throwable
    //   4525	4566	4569	java/lang/Throwable
    //   4543	4577	4577	java/lang/Throwable
    //   4600	4611	4614	java/lang/Throwable
    //   4666	4680	4680	java/lang/Throwable
    //   4691	4704	4707	java/lang/Throwable
    //   4696	4719	4722	java/lang/Throwable
    //   4711	4737	4740	java/lang/Throwable
    //   4726	4767	4770	java/lang/Throwable
    //   4833	4860	4863	java/lang/Throwable
    //   4850	4878	4881	java/lang/Throwable
    //   4867	4908	4911	java/lang/Throwable
    //   4885	4919	4919	java/lang/Throwable
    //   4942	4953	4956	java/lang/Throwable
    //   4968	5702	7168	java/lang/Throwable
    //   5058	5072	5072	java/lang/Throwable
    //   5083	5096	5099	java/lang/Throwable
    //   5088	5111	5114	java/lang/Throwable
    //   5103	5129	5132	java/lang/Throwable
    //   5118	5159	5162	java/lang/Throwable
    //   5225	5252	5255	java/lang/Throwable
    //   5242	5270	5273	java/lang/Throwable
    //   5259	5300	5303	java/lang/Throwable
    //   5277	5311	5311	java/lang/Throwable
    //   5334	5345	5348	java/lang/Throwable
    //   5401	5415	5415	java/lang/Throwable
    //   5426	5439	5442	java/lang/Throwable
    //   5431	5454	5457	java/lang/Throwable
    //   5446	5472	5475	java/lang/Throwable
    //   5461	5502	5505	java/lang/Throwable
    //   5568	5595	5598	java/lang/Throwable
    //   5585	5613	5616	java/lang/Throwable
    //   5602	5643	5646	java/lang/Throwable
    //   5620	5654	5654	java/lang/Throwable
    //   5677	5688	5691	java/lang/Throwable
    //   5703	6437	7168	java/lang/Throwable
    //   5793	5807	5807	java/lang/Throwable
    //   5818	5831	5834	java/lang/Throwable
    //   5823	5846	5849	java/lang/Throwable
    //   5838	5864	5867	java/lang/Throwable
    //   5853	5894	5897	java/lang/Throwable
    //   5960	5987	5990	java/lang/Throwable
    //   5977	6005	6008	java/lang/Throwable
    //   5994	6035	6038	java/lang/Throwable
    //   6012	6046	6046	java/lang/Throwable
    //   6069	6080	6083	java/lang/Throwable
    //   6136	6150	6150	java/lang/Throwable
    //   6161	6174	6177	java/lang/Throwable
    //   6166	6189	6192	java/lang/Throwable
    //   6181	6207	6210	java/lang/Throwable
    //   6196	6237	6240	java/lang/Throwable
    //   6303	6330	6333	java/lang/Throwable
    //   6320	6348	6351	java/lang/Throwable
    //   6337	6378	6381	java/lang/Throwable
    //   6355	6389	6389	java/lang/Throwable
    //   6412	6423	6426	java/lang/Throwable
    //   6438	7167	7168	java/lang/Throwable
    //   6528	6542	6542	java/lang/Throwable
    //   6553	6566	6569	java/lang/Throwable
    //   6558	6581	6584	java/lang/Throwable
    //   6573	6599	6602	java/lang/Throwable
    //   6588	6629	6632	java/lang/Throwable
    //   6695	6722	6725	java/lang/Throwable
    //   6712	6740	6743	java/lang/Throwable
    //   6729	6770	6773	java/lang/Throwable
    //   6747	6781	6781	java/lang/Throwable
    //   6804	6815	6818	java/lang/Throwable
    //   6871	6885	6885	java/lang/Throwable
    //   6896	6909	6912	java/lang/Throwable
    //   6901	6924	6927	java/lang/Throwable
    //   6916	6942	6945	java/lang/Throwable
    //   6931	6972	6975	java/lang/Throwable
    //   7038	7065	7068	java/lang/Throwable
    //   7055	7083	7086	java/lang/Throwable
    //   7072	7113	7116	java/lang/Throwable
    //   7090	7124	7124	java/lang/Throwable
    //   7147	7158	7161	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '²õô$ÖÞÄçzOq¸ï?;ÃìùM<Rü\\tZïÝÿño\\ta³1\\r£ß\\t~¦®ô:¨\\t\\tôf:­gZÄÚ\\t#AÀI8Æ!Á¼\\tc8Èf9#|ú P²Ä¸Ç»IUü ×ÈclÕxkËG~|\\bõ´B¸%捛眙漸ご枚ﻓꬌ쨂즼度䞇굍ꈞ鰤犎랱鏥㙹㓽熡ㄿӺ⎡ᠽֺޖ肫뉴৙Ⲅᬉ娎剮혾⦸⾴厒À•뇄樔빛䩎塱큌ꪄ䌁㍩䗷ɕ像鼽円䁂鉢㠉볦?წ쵆ᎈ弘䑅쐊经搨ᧇ悊俳⋸遺䘱뢥?ଁ㪸䥦⒯슾겗鄓㜝赜亭汥斀껪몖◕ᱤ둀瓃䮒诅烉땢䠔愞坆虚ᵷ顥楣軁鮢蜜칳⣯賧褬뽅䉳䇀ⶫ낁뭚\\nqåO\\te¼\\bö!1eÑ\\t<å#ÝDT´\\tpªu>9%íáv'c4hHÉÍf¡L«÷iº>0§Ú(S«á1T³aRB³y¹5ÌUë¶~B)G&RP8eë£fIä·À\\bYË¿_NÂ]Ö£!­ìÕ°þæ¦Ï\\t>±cWL¹§(\\t?CH&¢"挼瞥澯ド杨﹠ꭒ쩴쥷𢡊䟾궔ꈱ鰟牫럖鍙㚕㑠焒ㅡҌ⍪ᣳ׃ݏ肄늑াⰸᯥ媙勳훌⤋⿪古⃬놽櫍빴䩵墔퀫꨸䏭㏾䕪ʧ偼齣凰䂉銬㡰밿?თ촡ጴ忴䓒쒗總撛ᦙ惼伸∶逃䛨뢊?௤㨄䦊␸숣걥醠㟖趒仔沼斻긏뫱╩ᲈ듗琱䬡讛炿떩䣚懇坩虡ᶒ飙榏蹖鬿蟮컀⢱貑觧뾋䈊䄙ⶄ낺뮿\\t?CHÝ!·a\\t9Ñ[P:Ð\\t´t2ïfú@\\t ¿¤´=¾ã\\tÄj<,§j×QÇ\\tsÊ3yr°\\t~¡kUME´+Ì=b'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #91
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
    //   68: ldc '\\b?\uÐßõ\\tÆ¯é}¯â>'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #97
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
    //   129: putstatic burp/Zrom.a : [Ljava/lang/String;
    //   132: bipush #28
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrom.b : [Ljava/lang/String;
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
    //   212: bipush #85
    //   214: goto -> 244
    //   217: bipush #45
    //   219: goto -> 244
    //   222: bipush #98
    //   224: goto -> 244
    //   227: bipush #95
    //   229: goto -> 244
    //   232: bipush #78
    //   234: goto -> 244
    //   237: bipush #16
    //   239: goto -> 244
    //   242: bipush #86
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
    //   310: bipush #83
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-5
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-28
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #32
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #67
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #94
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #88
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-23
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #127
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #7
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-111
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-52
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-14
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-99
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #36
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-114
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-82
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #47
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #100
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #47
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #59
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-28
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-47
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-35
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-55
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #105
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-7
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-17
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #65
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #101
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #12
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #38
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zrom.ZF : Ljava/lang/Object;
    //   500: sipush #-26564
    //   503: sipush #21965
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zrom.ZD : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF983B) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrom.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */