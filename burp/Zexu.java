package burp;

import java.math.BigInteger;

class Zexu extends ClassLoader {
  static Object ZI;
  
  static String Zp;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zk(Object paramObject) {
    Zblj.Za = a(-9676, -12683);
    Zblj.Zl = new BigInteger(a(-9667, 11870));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zblj.Za.charAt(Math.abs(((BigInteger)Zgkp.Zp).intValue() % 32)) <= Zrpx.ZM.charAt(Math.abs(((BigInteger)Zgj5.ZO).intValue() % 32))) {
          try {
            Zzx8.ZM(Class.forName(a(-9674, 13569)));
            if (!bool)
              Zrkc.ZA(Class.forName(a(-9666, 2387))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrkc.ZA(Class.forName(a(-9666, 2387)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zw(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: getstatic burp/Zeud.Za : Ljava/lang/String;
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
    //   63: getstatic burp/Zb29.ZM : Ljava/lang/Object;
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
    //   131: sipush #-9665
    //   134: sipush #15881
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
    //   1179: sipush #-9668
    //   1182: sipush #-26536
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: invokespecial <init> : (Ljava/lang/String;)V
    //   1191: athrow
    //   1192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1195: athrow
    //   1196: bipush #10
    //   1198: istore #36
    //   1200: sipush #-9678
    //   1203: sipush #256
    //   1206: newarray byte
    //   1208: astore #37
    //   1210: sipush #-26228
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
    //   2506: sipush #-9675
    //   2509: new java/math/BigInteger
    //   2512: dup
    //   2513: aload #7
    //   2515: invokespecial <init> : ([B)V
    //   2518: invokevirtual abs : ()Ljava/math/BigInteger;
    //   2521: putstatic burp/Zl3n.Zh : Ljava/lang/Object;
    //   2524: sipush #30341
    //   2527: invokestatic a : (II)Ljava/lang/String;
    //   2530: iconst_1
    //   2531: ldc burp/Zedz
    //   2533: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2536: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2539: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2542: astore_3
    //   2543: aload_3
    //   2544: arraylength
    //   2545: istore #4
    //   2547: iconst_0
    //   2548: istore #5
    //   2550: iload #5
    //   2552: iload #4
    //   2554: if_icmpge -> 2691
    //   2557: aload_3
    //   2558: iload #5
    //   2560: aaload
    //   2561: astore #6
    //   2563: aload #6
    //   2565: invokevirtual getModifiers : ()I
    //   2568: invokestatic isStatic : (I)Z
    //   2571: ifne -> 2581
    //   2574: goto -> 2684
    //   2577: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2580: athrow
    //   2581: aload #6
    //   2583: invokevirtual getType : ()Ljava/lang/Class;
    //   2586: astore #7
    //   2588: aload #7
    //   2590: ifnull -> 2671
    //   2593: aload #7
    //   2595: invokevirtual isPrimitive : ()Z
    //   2598: ifne -> 2671
    //   2601: goto -> 2608
    //   2604: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2607: athrow
    //   2608: aload #7
    //   2610: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2613: ifnull -> 2671
    //   2616: goto -> 2623
    //   2619: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2622: athrow
    //   2623: aload #7
    //   2625: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2628: invokevirtual getName : ()Ljava/lang/String;
    //   2631: ifnull -> 2671
    //   2634: goto -> 2641
    //   2637: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2640: athrow
    //   2641: aload #7
    //   2643: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2646: invokevirtual getName : ()Ljava/lang/String;
    //   2649: sipush #-9671
    //   2652: sipush #-6572
    //   2655: invokestatic a : (II)Ljava/lang/String;
    //   2658: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2661: ifne -> 2671
    //   2664: goto -> 2671
    //   2667: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2670: athrow
    //   2671: aload #6
    //   2673: iconst_1
    //   2674: invokevirtual setAccessible : (Z)V
    //   2677: aload #6
    //   2679: aconst_null
    //   2680: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2683: pop
    //   2684: iinc #5, 1
    //   2687: iload_2
    //   2688: ifeq -> 2550
    //   2691: sipush #-9672
    //   2694: sipush #4079
    //   2697: invokestatic a : (II)Ljava/lang/String;
    //   2700: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2703: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2706: astore_3
    //   2707: aload_3
    //   2708: arraylength
    //   2709: istore #4
    //   2711: iconst_0
    //   2712: istore #5
    //   2714: iload #5
    //   2716: iload #4
    //   2718: if_icmpge -> 2850
    //   2721: aload_3
    //   2722: iload #5
    //   2724: aaload
    //   2725: astore #6
    //   2727: aload #6
    //   2729: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2732: pop
    //   2733: aload #6
    //   2735: invokevirtual getModifiers : ()I
    //   2738: invokestatic isStatic : (I)Z
    //   2741: ifeq -> 2836
    //   2744: aload #6
    //   2746: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2749: arraylength
    //   2750: iconst_2
    //   2751: if_icmpne -> 2836
    //   2754: goto -> 2761
    //   2757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2760: athrow
    //   2761: aload #6
    //   2763: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2766: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2769: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2772: ifeq -> 2836
    //   2775: goto -> 2782
    //   2778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2781: athrow
    //   2782: aload #6
    //   2784: iconst_1
    //   2785: invokevirtual setAccessible : (Z)V
    //   2788: aload #6
    //   2790: aconst_null
    //   2791: iconst_2
    //   2792: anewarray java/lang/Object
    //   2795: dup
    //   2796: iconst_0
    //   2797: aload_0
    //   2798: aastore
    //   2799: dup
    //   2800: iconst_1
    //   2801: aload_1
    //   2802: ifnonnull -> 2820
    //   2805: goto -> 2812
    //   2808: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2811: athrow
    //   2812: aload_1
    //   2813: goto -> 2827
    //   2816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2819: athrow
    //   2820: aload_1
    //   2821: checkcast [B
    //   2824: invokevirtual clone : ()Ljava/lang/Object;
    //   2827: aastore
    //   2828: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2831: pop
    //   2832: iload_2
    //   2833: ifeq -> 2850
    //   2836: iinc #5, 1
    //   2839: iload_2
    //   2840: ifeq -> 2714
    //   2843: goto -> 2850
    //   2846: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2849: athrow
    //   2850: new java/io/ByteArrayOutputStream
    //   2853: dup
    //   2854: invokespecial <init> : ()V
    //   2857: astore_3
    //   2858: getstatic burp/Zr9p.Za : Ljava/lang/String;
    //   2861: astore #4
    //   2863: iconst_0
    //   2864: istore #5
    //   2866: iload #5
    //   2868: aload #4
    //   2870: invokevirtual length : ()I
    //   2873: if_icmpge -> 2903
    //   2876: aload_3
    //   2877: aload #4
    //   2879: iload #5
    //   2881: iload #5
    //   2883: iconst_2
    //   2884: iadd
    //   2885: invokevirtual substring : (II)Ljava/lang/String;
    //   2888: bipush #16
    //   2890: invokestatic parseInt : (Ljava/lang/String;I)I
    //   2893: invokevirtual write : (I)V
    //   2896: iinc #5, 2
    //   2899: iload_2
    //   2900: ifeq -> 2866
    //   2903: aload_3
    //   2904: invokevirtual toByteArray : ()[B
    //   2907: astore #5
    //   2909: getstatic burp/Zlpl.Ze : Ljava/lang/Object;
    //   2912: checkcast java/math/BigInteger
    //   2915: invokevirtual toByteArray : ()[B
    //   2918: astore #6
    //   2920: sipush #256
    //   2923: newarray byte
    //   2925: astore #8
    //   2927: sipush #256
    //   2930: newarray int
    //   2932: astore #9
    //   2934: sipush #256
    //   2937: newarray int
    //   2939: astore #10
    //   2941: sipush #256
    //   2944: newarray int
    //   2946: astore #11
    //   2948: sipush #256
    //   2951: newarray int
    //   2953: astore #12
    //   2955: bipush #10
    //   2957: newarray int
    //   2959: astore #13
    //   2961: sipush #283
    //   2964: istore #14
    //   2966: iconst_0
    //   2967: istore #16
    //   2969: iload #16
    //   2971: sipush #256
    //   2974: if_icmpge -> 3208
    //   2977: sipush #-9678
    //   2980: sipush #-26228
    //   2983: invokestatic a : (II)Ljava/lang/String;
    //   2986: iload #16
    //   2988: iconst_1
    //   2989: iushr
    //   2990: invokevirtual charAt : (I)C
    //   2993: istore #25
    //   2995: iload #16
    //   2997: iconst_1
    //   2998: iand
    //   2999: ifne -> 3014
    //   3002: iload #25
    //   3004: bipush #8
    //   3006: iushr
    //   3007: goto -> 3016
    //   3010: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3013: athrow
    //   3014: iload #25
    //   3016: i2b
    //   3017: sipush #255
    //   3020: iand
    //   3021: istore #15
    //   3023: iload #16
    //   3025: iconst_1
    //   3026: ishl
    //   3027: istore #17
    //   3029: iload #17
    //   3031: sipush #256
    //   3034: if_icmplt -> 3044
    //   3037: iload #17
    //   3039: iload #14
    //   3041: ixor
    //   3042: istore #17
    //   3044: iload #17
    //   3046: iconst_1
    //   3047: ishl
    //   3048: istore #18
    //   3050: iload #18
    //   3052: sipush #256
    //   3055: if_icmplt -> 3065
    //   3058: iload #18
    //   3060: iload #14
    //   3062: ixor
    //   3063: istore #18
    //   3065: iload #18
    //   3067: iconst_1
    //   3068: ishl
    //   3069: istore #19
    //   3071: iload #19
    //   3073: sipush #256
    //   3076: if_icmplt -> 3086
    //   3079: iload #19
    //   3081: iload #14
    //   3083: ixor
    //   3084: istore #19
    //   3086: iload #19
    //   3088: iload #16
    //   3090: ixor
    //   3091: istore #20
    //   3093: iload #20
    //   3095: iload #17
    //   3097: ixor
    //   3098: istore #21
    //   3100: iload #20
    //   3102: iload #18
    //   3104: ixor
    //   3105: istore #22
    //   3107: iload #19
    //   3109: iload #18
    //   3111: ixor
    //   3112: iload #17
    //   3114: ixor
    //   3115: istore #23
    //   3117: aload #8
    //   3119: iload #16
    //   3121: iload #15
    //   3123: i2b
    //   3124: bastore
    //   3125: aload #9
    //   3127: iload #15
    //   3129: iload #23
    //   3131: bipush #24
    //   3133: ishl
    //   3134: iload #20
    //   3136: bipush #16
    //   3138: ishl
    //   3139: ior
    //   3140: iload #22
    //   3142: bipush #8
    //   3144: ishl
    //   3145: ior
    //   3146: iload #21
    //   3148: ior
    //   3149: dup
    //   3150: istore #24
    //   3152: iastore
    //   3153: aload #10
    //   3155: iload #15
    //   3157: iload #24
    //   3159: bipush #8
    //   3161: iushr
    //   3162: iload #24
    //   3164: bipush #24
    //   3166: ishl
    //   3167: ior
    //   3168: iastore
    //   3169: aload #11
    //   3171: iload #15
    //   3173: iload #24
    //   3175: bipush #16
    //   3177: iushr
    //   3178: iload #24
    //   3180: bipush #16
    //   3182: ishl
    //   3183: ior
    //   3184: iastore
    //   3185: aload #12
    //   3187: iload #15
    //   3189: iload #24
    //   3191: bipush #24
    //   3193: iushr
    //   3194: iload #24
    //   3196: bipush #8
    //   3198: ishl
    //   3199: ior
    //   3200: iastore
    //   3201: iinc #16, 1
    //   3204: iload_2
    //   3205: ifeq -> 2969
    //   3208: iconst_1
    //   3209: istore #25
    //   3211: aload #13
    //   3213: iconst_0
    //   3214: iload #25
    //   3216: bipush #24
    //   3218: ishl
    //   3219: iastore
    //   3220: iconst_1
    //   3221: istore #26
    //   3223: iload #26
    //   3225: bipush #10
    //   3227: if_icmpge -> 3268
    //   3230: iload #25
    //   3232: iconst_1
    //   3233: ishl
    //   3234: istore #25
    //   3236: iload #25
    //   3238: sipush #256
    //   3241: if_icmplt -> 3251
    //   3244: iload #25
    //   3246: iload #14
    //   3248: ixor
    //   3249: istore #25
    //   3251: aload #13
    //   3253: iload #26
    //   3255: iload #25
    //   3257: bipush #24
    //   3259: ishl
    //   3260: iastore
    //   3261: iinc #26, 1
    //   3264: iload_2
    //   3265: ifeq -> 3223
    //   3268: iconst_4
    //   3269: istore #26
    //   3271: iload #26
    //   3273: bipush #6
    //   3275: iadd
    //   3276: istore #27
    //   3278: iconst_4
    //   3279: iload #27
    //   3281: iconst_1
    //   3282: iadd
    //   3283: imul
    //   3284: istore #28
    //   3286: iload #28
    //   3288: newarray int
    //   3290: astore #29
    //   3292: iload #28
    //   3294: newarray int
    //   3296: astore #30
    //   3298: iconst_0
    //   3299: istore #25
    //   3301: iconst_0
    //   3302: istore #32
    //   3304: iconst_0
    //   3305: istore #33
    //   3307: iload #32
    //   3309: iload #26
    //   3311: if_icmpge -> 3379
    //   3314: aload #29
    //   3316: iload #32
    //   3318: aload #5
    //   3320: iload #33
    //   3322: baload
    //   3323: bipush #24
    //   3325: ishl
    //   3326: aload #5
    //   3328: iload #33
    //   3330: iconst_1
    //   3331: iadd
    //   3332: baload
    //   3333: sipush #255
    //   3336: iand
    //   3337: bipush #16
    //   3339: ishl
    //   3340: ior
    //   3341: aload #5
    //   3343: iload #33
    //   3345: iconst_2
    //   3346: iadd
    //   3347: baload
    //   3348: sipush #255
    //   3351: iand
    //   3352: bipush #8
    //   3354: ishl
    //   3355: ior
    //   3356: aload #5
    //   3358: iload #33
    //   3360: iconst_3
    //   3361: iadd
    //   3362: baload
    //   3363: sipush #255
    //   3366: iand
    //   3367: ior
    //   3368: iastore
    //   3369: iinc #32, 1
    //   3372: iinc #33, 4
    //   3375: iload_2
    //   3376: ifeq -> 3307
    //   3379: iload #26
    //   3381: istore #32
    //   3383: iconst_0
    //   3384: istore #33
    //   3386: iload #32
    //   3388: iload #28
    //   3390: if_icmpge -> 3517
    //   3393: aload #29
    //   3395: iload #32
    //   3397: iconst_1
    //   3398: isub
    //   3399: iaload
    //   3400: istore #31
    //   3402: iload #33
    //   3404: ifne -> 3491
    //   3407: iload #26
    //   3409: istore #33
    //   3411: aload #8
    //   3413: iload #31
    //   3415: bipush #16
    //   3417: iushr
    //   3418: sipush #255
    //   3421: iand
    //   3422: baload
    //   3423: bipush #24
    //   3425: ishl
    //   3426: aload #8
    //   3428: iload #31
    //   3430: bipush #8
    //   3432: iushr
    //   3433: sipush #255
    //   3436: iand
    //   3437: baload
    //   3438: sipush #255
    //   3441: iand
    //   3442: bipush #16
    //   3444: ishl
    //   3445: ior
    //   3446: aload #8
    //   3448: iload #31
    //   3450: sipush #255
    //   3453: iand
    //   3454: baload
    //   3455: sipush #255
    //   3458: iand
    //   3459: bipush #8
    //   3461: ishl
    //   3462: ior
    //   3463: aload #8
    //   3465: iload #31
    //   3467: bipush #24
    //   3469: iushr
    //   3470: baload
    //   3471: sipush #255
    //   3474: iand
    //   3475: ior
    //   3476: istore #31
    //   3478: iload #31
    //   3480: aload #13
    //   3482: iload #25
    //   3484: iinc #25, 1
    //   3487: iaload
    //   3488: ixor
    //   3489: istore #31
    //   3491: aload #29
    //   3493: iload #32
    //   3495: aload #29
    //   3497: iload #32
    //   3499: iload #26
    //   3501: isub
    //   3502: iaload
    //   3503: iload #31
    //   3505: ixor
    //   3506: iastore
    //   3507: iinc #32, 1
    //   3510: iinc #33, -1
    //   3513: iload_2
    //   3514: ifeq -> 3386
    //   3517: iconst_0
    //   3518: istore #32
    //   3520: iconst_4
    //   3521: iload #27
    //   3523: imul
    //   3524: istore #33
    //   3526: aload #30
    //   3528: iload #32
    //   3530: aload #29
    //   3532: iload #33
    //   3534: iaload
    //   3535: iastore
    //   3536: aload #30
    //   3538: iload #32
    //   3540: iconst_1
    //   3541: iadd
    //   3542: aload #29
    //   3544: iload #33
    //   3546: iconst_1
    //   3547: iadd
    //   3548: iaload
    //   3549: iastore
    //   3550: aload #30
    //   3552: iload #32
    //   3554: iconst_2
    //   3555: iadd
    //   3556: aload #29
    //   3558: iload #33
    //   3560: iconst_2
    //   3561: iadd
    //   3562: iaload
    //   3563: iastore
    //   3564: aload #30
    //   3566: iload #32
    //   3568: iconst_3
    //   3569: iadd
    //   3570: aload #29
    //   3572: iload #33
    //   3574: iconst_3
    //   3575: iadd
    //   3576: iaload
    //   3577: iastore
    //   3578: iinc #32, 4
    //   3581: iinc #33, -4
    //   3584: iconst_1
    //   3585: istore #35
    //   3587: iload #35
    //   3589: iload #27
    //   3591: if_icmpge -> 3955
    //   3594: aload #29
    //   3596: iload #33
    //   3598: iaload
    //   3599: istore #34
    //   3601: aload #30
    //   3603: iload #32
    //   3605: aload #9
    //   3607: aload #8
    //   3609: iload #34
    //   3611: bipush #24
    //   3613: iushr
    //   3614: baload
    //   3615: sipush #255
    //   3618: iand
    //   3619: iaload
    //   3620: aload #10
    //   3622: aload #8
    //   3624: iload #34
    //   3626: bipush #16
    //   3628: iushr
    //   3629: sipush #255
    //   3632: iand
    //   3633: baload
    //   3634: sipush #255
    //   3637: iand
    //   3638: iaload
    //   3639: ixor
    //   3640: aload #11
    //   3642: aload #8
    //   3644: iload #34
    //   3646: bipush #8
    //   3648: iushr
    //   3649: sipush #255
    //   3652: iand
    //   3653: baload
    //   3654: sipush #255
    //   3657: iand
    //   3658: iaload
    //   3659: ixor
    //   3660: aload #12
    //   3662: aload #8
    //   3664: iload #34
    //   3666: sipush #255
    //   3669: iand
    //   3670: baload
    //   3671: sipush #255
    //   3674: iand
    //   3675: iaload
    //   3676: ixor
    //   3677: iastore
    //   3678: aload #29
    //   3680: iload #33
    //   3682: iconst_1
    //   3683: iadd
    //   3684: iaload
    //   3685: istore #34
    //   3687: aload #30
    //   3689: iload #32
    //   3691: iconst_1
    //   3692: iadd
    //   3693: aload #9
    //   3695: aload #8
    //   3697: iload #34
    //   3699: bipush #24
    //   3701: iushr
    //   3702: baload
    //   3703: sipush #255
    //   3706: iand
    //   3707: iaload
    //   3708: aload #10
    //   3710: aload #8
    //   3712: iload #34
    //   3714: bipush #16
    //   3716: iushr
    //   3717: sipush #255
    //   3720: iand
    //   3721: baload
    //   3722: sipush #255
    //   3725: iand
    //   3726: iaload
    //   3727: ixor
    //   3728: aload #11
    //   3730: aload #8
    //   3732: iload #34
    //   3734: bipush #8
    //   3736: iushr
    //   3737: sipush #255
    //   3740: iand
    //   3741: baload
    //   3742: sipush #255
    //   3745: iand
    //   3746: iaload
    //   3747: ixor
    //   3748: aload #12
    //   3750: aload #8
    //   3752: iload #34
    //   3754: sipush #255
    //   3757: iand
    //   3758: baload
    //   3759: sipush #255
    //   3762: iand
    //   3763: iaload
    //   3764: ixor
    //   3765: iastore
    //   3766: aload #29
    //   3768: iload #33
    //   3770: iconst_2
    //   3771: iadd
    //   3772: iaload
    //   3773: istore #34
    //   3775: aload #30
    //   3777: iload #32
    //   3779: iconst_2
    //   3780: iadd
    //   3781: aload #9
    //   3783: aload #8
    //   3785: iload #34
    //   3787: bipush #24
    //   3789: iushr
    //   3790: baload
    //   3791: sipush #255
    //   3794: iand
    //   3795: iaload
    //   3796: aload #10
    //   3798: aload #8
    //   3800: iload #34
    //   3802: bipush #16
    //   3804: iushr
    //   3805: sipush #255
    //   3808: iand
    //   3809: baload
    //   3810: sipush #255
    //   3813: iand
    //   3814: iaload
    //   3815: ixor
    //   3816: aload #11
    //   3818: aload #8
    //   3820: iload #34
    //   3822: bipush #8
    //   3824: iushr
    //   3825: sipush #255
    //   3828: iand
    //   3829: baload
    //   3830: sipush #255
    //   3833: iand
    //   3834: iaload
    //   3835: ixor
    //   3836: aload #12
    //   3838: aload #8
    //   3840: iload #34
    //   3842: sipush #255
    //   3845: iand
    //   3846: baload
    //   3847: sipush #255
    //   3850: iand
    //   3851: iaload
    //   3852: ixor
    //   3853: iastore
    //   3854: aload #29
    //   3856: iload #33
    //   3858: iconst_3
    //   3859: iadd
    //   3860: iaload
    //   3861: istore #34
    //   3863: aload #30
    //   3865: iload #32
    //   3867: iconst_3
    //   3868: iadd
    //   3869: aload #9
    //   3871: aload #8
    //   3873: iload #34
    //   3875: bipush #24
    //   3877: iushr
    //   3878: baload
    //   3879: sipush #255
    //   3882: iand
    //   3883: iaload
    //   3884: aload #10
    //   3886: aload #8
    //   3888: iload #34
    //   3890: bipush #16
    //   3892: iushr
    //   3893: sipush #255
    //   3896: iand
    //   3897: baload
    //   3898: sipush #255
    //   3901: iand
    //   3902: iaload
    //   3903: ixor
    //   3904: aload #11
    //   3906: aload #8
    //   3908: iload #34
    //   3910: bipush #8
    //   3912: iushr
    //   3913: sipush #255
    //   3916: iand
    //   3917: baload
    //   3918: sipush #255
    //   3921: iand
    //   3922: iaload
    //   3923: ixor
    //   3924: aload #12
    //   3926: aload #8
    //   3928: iload #34
    //   3930: sipush #255
    //   3933: iand
    //   3934: baload
    //   3935: sipush #255
    //   3938: iand
    //   3939: iaload
    //   3940: ixor
    //   3941: iastore
    //   3942: iinc #32, 4
    //   3945: iinc #33, -4
    //   3948: iinc #35, 1
    //   3951: iload_2
    //   3952: ifeq -> 3587
    //   3955: aload #30
    //   3957: iload #32
    //   3959: aload #29
    //   3961: iload #33
    //   3963: iaload
    //   3964: iastore
    //   3965: aload #30
    //   3967: iload #32
    //   3969: iconst_1
    //   3970: iadd
    //   3971: aload #29
    //   3973: iload #33
    //   3975: iconst_1
    //   3976: iadd
    //   3977: iaload
    //   3978: iastore
    //   3979: aload #30
    //   3981: iload #32
    //   3983: iconst_2
    //   3984: iadd
    //   3985: aload #29
    //   3987: iload #33
    //   3989: iconst_2
    //   3990: iadd
    //   3991: iaload
    //   3992: iastore
    //   3993: aload #30
    //   3995: iload #32
    //   3997: iconst_3
    //   3998: iadd
    //   3999: aload #29
    //   4001: iload #33
    //   4003: iconst_3
    //   4004: iadd
    //   4005: iaload
    //   4006: iastore
    //   4007: iconst_0
    //   4008: newarray byte
    //   4010: astore #35
    //   4012: aload #6
    //   4014: arraylength
    //   4015: bipush #16
    //   4017: irem
    //   4018: ifeq -> 4042
    //   4021: new java/lang/Exception
    //   4024: dup
    //   4025: sipush #-9673
    //   4028: sipush #-22835
    //   4031: invokestatic a : (II)Ljava/lang/String;
    //   4034: invokespecial <init> : (Ljava/lang/String;)V
    //   4037: athrow
    //   4038: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4041: athrow
    //   4042: bipush #10
    //   4044: istore #36
    //   4046: sipush #-9678
    //   4049: sipush #256
    //   4052: newarray byte
    //   4054: astore #37
    //   4056: sipush #-26228
    //   4059: sipush #256
    //   4062: newarray int
    //   4064: astore #38
    //   4066: sipush #256
    //   4069: newarray int
    //   4071: astore #39
    //   4073: sipush #256
    //   4076: newarray int
    //   4078: astore #40
    //   4080: sipush #256
    //   4083: newarray int
    //   4085: astore #41
    //   4087: sipush #283
    //   4090: istore #14
    //   4092: invokestatic a : (II)Ljava/lang/String;
    //   4095: astore #42
    //   4097: iconst_0
    //   4098: istore #16
    //   4100: iload #16
    //   4102: sipush #256
    //   4105: if_icmpge -> 4332
    //   4108: aload #42
    //   4110: iload #16
    //   4112: iconst_1
    //   4113: iushr
    //   4114: invokevirtual charAt : (I)C
    //   4117: istore #43
    //   4119: iload #16
    //   4121: iconst_1
    //   4122: iand
    //   4123: ifne -> 4138
    //   4126: iload #43
    //   4128: bipush #8
    //   4130: iushr
    //   4131: goto -> 4140
    //   4134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4137: athrow
    //   4138: iload #43
    //   4140: i2b
    //   4141: sipush #255
    //   4144: iand
    //   4145: istore #15
    //   4147: iload #16
    //   4149: iconst_1
    //   4150: ishl
    //   4151: istore #17
    //   4153: iload #17
    //   4155: sipush #256
    //   4158: if_icmplt -> 4168
    //   4161: iload #17
    //   4163: iload #14
    //   4165: ixor
    //   4166: istore #17
    //   4168: iload #17
    //   4170: iconst_1
    //   4171: ishl
    //   4172: istore #18
    //   4174: iload #18
    //   4176: sipush #256
    //   4179: if_icmplt -> 4189
    //   4182: iload #18
    //   4184: iload #14
    //   4186: ixor
    //   4187: istore #18
    //   4189: iload #18
    //   4191: iconst_1
    //   4192: ishl
    //   4193: istore #19
    //   4195: iload #19
    //   4197: sipush #256
    //   4200: if_icmplt -> 4210
    //   4203: iload #19
    //   4205: iload #14
    //   4207: ixor
    //   4208: istore #19
    //   4210: iload #19
    //   4212: iload #16
    //   4214: ixor
    //   4215: istore #20
    //   4217: iload #20
    //   4219: iload #17
    //   4221: ixor
    //   4222: istore #21
    //   4224: iload #20
    //   4226: iload #18
    //   4228: ixor
    //   4229: istore #22
    //   4231: iload #19
    //   4233: iload #18
    //   4235: ixor
    //   4236: iload #17
    //   4238: ixor
    //   4239: istore #23
    //   4241: aload #37
    //   4243: iload #15
    //   4245: iload #16
    //   4247: i2b
    //   4248: bastore
    //   4249: aload #38
    //   4251: iload #15
    //   4253: iload #23
    //   4255: bipush #24
    //   4257: ishl
    //   4258: iload #20
    //   4260: bipush #16
    //   4262: ishl
    //   4263: ior
    //   4264: iload #22
    //   4266: bipush #8
    //   4268: ishl
    //   4269: ior
    //   4270: iload #21
    //   4272: ior
    //   4273: dup
    //   4274: istore #24
    //   4276: iastore
    //   4277: aload #39
    //   4279: iload #15
    //   4281: iload #24
    //   4283: bipush #8
    //   4285: iushr
    //   4286: iload #24
    //   4288: bipush #24
    //   4290: ishl
    //   4291: ior
    //   4292: iastore
    //   4293: aload #40
    //   4295: iload #15
    //   4297: iload #24
    //   4299: bipush #16
    //   4301: iushr
    //   4302: iload #24
    //   4304: bipush #16
    //   4306: ishl
    //   4307: ior
    //   4308: iastore
    //   4309: aload #41
    //   4311: iload #15
    //   4313: iload #24
    //   4315: bipush #24
    //   4317: iushr
    //   4318: iload #24
    //   4320: bipush #8
    //   4322: ishl
    //   4323: ior
    //   4324: iastore
    //   4325: iinc #16, 1
    //   4328: iload_2
    //   4329: ifeq -> 4100
    //   4332: aload #6
    //   4334: arraylength
    //   4335: newarray byte
    //   4337: astore #43
    //   4339: iconst_0
    //   4340: istore #44
    //   4342: iload #44
    //   4344: aload #6
    //   4346: arraylength
    //   4347: bipush #16
    //   4349: idiv
    //   4350: if_icmpge -> 5264
    //   4353: bipush #16
    //   4355: newarray byte
    //   4357: astore #45
    //   4359: bipush #16
    //   4361: newarray byte
    //   4363: astore #46
    //   4365: iconst_0
    //   4366: istore #47
    //   4368: iload #47
    //   4370: bipush #16
    //   4372: if_icmpge -> 4398
    //   4375: aload #45
    //   4377: iload #47
    //   4379: aload #6
    //   4381: iload #47
    //   4383: iload #44
    //   4385: bipush #16
    //   4387: imul
    //   4388: iadd
    //   4389: baload
    //   4390: bastore
    //   4391: iinc #47, 1
    //   4394: iload_2
    //   4395: ifeq -> 4368
    //   4398: iconst_0
    //   4399: istore #47
    //   4401: aload #45
    //   4403: iconst_0
    //   4404: baload
    //   4405: bipush #24
    //   4407: ishl
    //   4408: aload #45
    //   4410: iconst_1
    //   4411: baload
    //   4412: sipush #255
    //   4415: iand
    //   4416: bipush #16
    //   4418: ishl
    //   4419: ior
    //   4420: aload #45
    //   4422: iconst_2
    //   4423: baload
    //   4424: sipush #255
    //   4427: iand
    //   4428: bipush #8
    //   4430: ishl
    //   4431: ior
    //   4432: aload #45
    //   4434: iconst_3
    //   4435: baload
    //   4436: sipush #255
    //   4439: iand
    //   4440: ior
    //   4441: aload #30
    //   4443: iconst_0
    //   4444: iaload
    //   4445: ixor
    //   4446: istore #49
    //   4448: aload #45
    //   4450: iconst_4
    //   4451: baload
    //   4452: bipush #24
    //   4454: ishl
    //   4455: aload #45
    //   4457: iconst_5
    //   4458: baload
    //   4459: sipush #255
    //   4462: iand
    //   4463: bipush #16
    //   4465: ishl
    //   4466: ior
    //   4467: aload #45
    //   4469: bipush #6
    //   4471: baload
    //   4472: sipush #255
    //   4475: iand
    //   4476: bipush #8
    //   4478: ishl
    //   4479: ior
    //   4480: aload #45
    //   4482: bipush #7
    //   4484: baload
    //   4485: sipush #255
    //   4488: iand
    //   4489: ior
    //   4490: aload #30
    //   4492: iconst_1
    //   4493: iaload
    //   4494: ixor
    //   4495: istore #50
    //   4497: aload #45
    //   4499: bipush #8
    //   4501: baload
    //   4502: bipush #24
    //   4504: ishl
    //   4505: aload #45
    //   4507: bipush #9
    //   4509: baload
    //   4510: sipush #255
    //   4513: iand
    //   4514: bipush #16
    //   4516: ishl
    //   4517: ior
    //   4518: aload #45
    //   4520: bipush #10
    //   4522: baload
    //   4523: sipush #255
    //   4526: iand
    //   4527: bipush #8
    //   4529: ishl
    //   4530: ior
    //   4531: aload #45
    //   4533: bipush #11
    //   4535: baload
    //   4536: sipush #255
    //   4539: iand
    //   4540: ior
    //   4541: aload #30
    //   4543: iconst_2
    //   4544: iaload
    //   4545: ixor
    //   4546: istore #51
    //   4548: aload #45
    //   4550: bipush #12
    //   4552: baload
    //   4553: bipush #24
    //   4555: ishl
    //   4556: aload #45
    //   4558: bipush #13
    //   4560: baload
    //   4561: sipush #255
    //   4564: iand
    //   4565: bipush #16
    //   4567: ishl
    //   4568: ior
    //   4569: aload #45
    //   4571: bipush #14
    //   4573: baload
    //   4574: sipush #255
    //   4577: iand
    //   4578: bipush #8
    //   4580: ishl
    //   4581: ior
    //   4582: aload #45
    //   4584: bipush #15
    //   4586: baload
    //   4587: sipush #255
    //   4590: iand
    //   4591: ior
    //   4592: aload #30
    //   4594: iconst_3
    //   4595: iaload
    //   4596: ixor
    //   4597: istore #52
    //   4599: iconst_1
    //   4600: istore #53
    //   4602: iload #53
    //   4604: iload #36
    //   4606: if_icmpge -> 4849
    //   4609: iinc #47, 4
    //   4612: aload #38
    //   4614: iload #49
    //   4616: bipush #24
    //   4618: iushr
    //   4619: iaload
    //   4620: aload #39
    //   4622: iload #52
    //   4624: bipush #16
    //   4626: iushr
    //   4627: sipush #255
    //   4630: iand
    //   4631: iaload
    //   4632: ixor
    //   4633: aload #40
    //   4635: iload #51
    //   4637: bipush #8
    //   4639: iushr
    //   4640: sipush #255
    //   4643: iand
    //   4644: iaload
    //   4645: ixor
    //   4646: aload #41
    //   4648: iload #50
    //   4650: sipush #255
    //   4653: iand
    //   4654: iaload
    //   4655: ixor
    //   4656: aload #30
    //   4658: iload #47
    //   4660: iaload
    //   4661: ixor
    //   4662: istore #54
    //   4664: aload #38
    //   4666: iload #50
    //   4668: bipush #24
    //   4670: iushr
    //   4671: iaload
    //   4672: aload #39
    //   4674: iload #49
    //   4676: bipush #16
    //   4678: iushr
    //   4679: sipush #255
    //   4682: iand
    //   4683: iaload
    //   4684: ixor
    //   4685: aload #40
    //   4687: iload #52
    //   4689: bipush #8
    //   4691: iushr
    //   4692: sipush #255
    //   4695: iand
    //   4696: iaload
    //   4697: ixor
    //   4698: aload #41
    //   4700: iload #51
    //   4702: sipush #255
    //   4705: iand
    //   4706: iaload
    //   4707: ixor
    //   4708: aload #30
    //   4710: iload #47
    //   4712: iconst_1
    //   4713: iadd
    //   4714: iaload
    //   4715: ixor
    //   4716: istore #55
    //   4718: aload #38
    //   4720: iload #51
    //   4722: bipush #24
    //   4724: iushr
    //   4725: iaload
    //   4726: aload #39
    //   4728: iload #50
    //   4730: bipush #16
    //   4732: iushr
    //   4733: sipush #255
    //   4736: iand
    //   4737: iaload
    //   4738: ixor
    //   4739: aload #40
    //   4741: iload #49
    //   4743: bipush #8
    //   4745: iushr
    //   4746: sipush #255
    //   4749: iand
    //   4750: iaload
    //   4751: ixor
    //   4752: aload #41
    //   4754: iload #52
    //   4756: sipush #255
    //   4759: iand
    //   4760: iaload
    //   4761: ixor
    //   4762: aload #30
    //   4764: iload #47
    //   4766: iconst_2
    //   4767: iadd
    //   4768: iaload
    //   4769: ixor
    //   4770: istore #56
    //   4772: aload #38
    //   4774: iload #52
    //   4776: bipush #24
    //   4778: iushr
    //   4779: iaload
    //   4780: aload #39
    //   4782: iload #51
    //   4784: bipush #16
    //   4786: iushr
    //   4787: sipush #255
    //   4790: iand
    //   4791: iaload
    //   4792: ixor
    //   4793: aload #40
    //   4795: iload #50
    //   4797: bipush #8
    //   4799: iushr
    //   4800: sipush #255
    //   4803: iand
    //   4804: iaload
    //   4805: ixor
    //   4806: aload #41
    //   4808: iload #49
    //   4810: sipush #255
    //   4813: iand
    //   4814: iaload
    //   4815: ixor
    //   4816: aload #30
    //   4818: iload #47
    //   4820: iconst_3
    //   4821: iadd
    //   4822: iaload
    //   4823: ixor
    //   4824: istore #57
    //   4826: iload #54
    //   4828: istore #49
    //   4830: iload #55
    //   4832: istore #50
    //   4834: iload #56
    //   4836: istore #51
    //   4838: iload #57
    //   4840: istore #52
    //   4842: iinc #53, 1
    //   4845: iload_2
    //   4846: ifeq -> 4602
    //   4849: iinc #47, 4
    //   4852: aload #30
    //   4854: iload #47
    //   4856: iaload
    //   4857: istore #48
    //   4859: aload #46
    //   4861: iconst_0
    //   4862: aload #37
    //   4864: iload #49
    //   4866: bipush #24
    //   4868: iushr
    //   4869: baload
    //   4870: iload #48
    //   4872: bipush #24
    //   4874: iushr
    //   4875: ixor
    //   4876: i2b
    //   4877: bastore
    //   4878: aload #46
    //   4880: iconst_1
    //   4881: aload #37
    //   4883: iload #52
    //   4885: bipush #16
    //   4887: iushr
    //   4888: sipush #255
    //   4891: iand
    //   4892: baload
    //   4893: iload #48
    //   4895: bipush #16
    //   4897: iushr
    //   4898: ixor
    //   4899: i2b
    //   4900: bastore
    //   4901: aload #46
    //   4903: iconst_2
    //   4904: aload #37
    //   4906: iload #51
    //   4908: bipush #8
    //   4910: iushr
    //   4911: sipush #255
    //   4914: iand
    //   4915: baload
    //   4916: iload #48
    //   4918: bipush #8
    //   4920: iushr
    //   4921: ixor
    //   4922: i2b
    //   4923: bastore
    //   4924: aload #46
    //   4926: iconst_3
    //   4927: aload #37
    //   4929: iload #50
    //   4931: sipush #255
    //   4934: iand
    //   4935: baload
    //   4936: iload #48
    //   4938: ixor
    //   4939: i2b
    //   4940: bastore
    //   4941: aload #30
    //   4943: iload #47
    //   4945: iconst_1
    //   4946: iadd
    //   4947: iaload
    //   4948: istore #48
    //   4950: aload #46
    //   4952: iconst_4
    //   4953: aload #37
    //   4955: iload #50
    //   4957: bipush #24
    //   4959: iushr
    //   4960: baload
    //   4961: iload #48
    //   4963: bipush #24
    //   4965: iushr
    //   4966: ixor
    //   4967: i2b
    //   4968: bastore
    //   4969: aload #46
    //   4971: iconst_5
    //   4972: aload #37
    //   4974: iload #49
    //   4976: bipush #16
    //   4978: iushr
    //   4979: sipush #255
    //   4982: iand
    //   4983: baload
    //   4984: iload #48
    //   4986: bipush #16
    //   4988: iushr
    //   4989: ixor
    //   4990: i2b
    //   4991: bastore
    //   4992: aload #46
    //   4994: bipush #6
    //   4996: aload #37
    //   4998: iload #52
    //   5000: bipush #8
    //   5002: iushr
    //   5003: sipush #255
    //   5006: iand
    //   5007: baload
    //   5008: iload #48
    //   5010: bipush #8
    //   5012: iushr
    //   5013: ixor
    //   5014: i2b
    //   5015: bastore
    //   5016: aload #46
    //   5018: bipush #7
    //   5020: aload #37
    //   5022: iload #51
    //   5024: sipush #255
    //   5027: iand
    //   5028: baload
    //   5029: iload #48
    //   5031: ixor
    //   5032: i2b
    //   5033: bastore
    //   5034: aload #30
    //   5036: iload #47
    //   5038: iconst_2
    //   5039: iadd
    //   5040: iaload
    //   5041: istore #48
    //   5043: aload #46
    //   5045: bipush #8
    //   5047: aload #37
    //   5049: iload #51
    //   5051: bipush #24
    //   5053: iushr
    //   5054: baload
    //   5055: iload #48
    //   5057: bipush #24
    //   5059: iushr
    //   5060: ixor
    //   5061: i2b
    //   5062: bastore
    //   5063: aload #46
    //   5065: bipush #9
    //   5067: aload #37
    //   5069: iload #50
    //   5071: bipush #16
    //   5073: iushr
    //   5074: sipush #255
    //   5077: iand
    //   5078: baload
    //   5079: iload #48
    //   5081: bipush #16
    //   5083: iushr
    //   5084: ixor
    //   5085: i2b
    //   5086: bastore
    //   5087: aload #46
    //   5089: bipush #10
    //   5091: aload #37
    //   5093: iload #49
    //   5095: bipush #8
    //   5097: iushr
    //   5098: sipush #255
    //   5101: iand
    //   5102: baload
    //   5103: iload #48
    //   5105: bipush #8
    //   5107: iushr
    //   5108: ixor
    //   5109: i2b
    //   5110: bastore
    //   5111: aload #46
    //   5113: bipush #11
    //   5115: aload #37
    //   5117: iload #52
    //   5119: sipush #255
    //   5122: iand
    //   5123: baload
    //   5124: iload #48
    //   5126: ixor
    //   5127: i2b
    //   5128: bastore
    //   5129: aload #30
    //   5131: iload #47
    //   5133: iconst_3
    //   5134: iadd
    //   5135: iaload
    //   5136: istore #48
    //   5138: aload #46
    //   5140: bipush #12
    //   5142: aload #37
    //   5144: iload #52
    //   5146: bipush #24
    //   5148: iushr
    //   5149: baload
    //   5150: iload #48
    //   5152: bipush #24
    //   5154: iushr
    //   5155: ixor
    //   5156: i2b
    //   5157: bastore
    //   5158: aload #46
    //   5160: bipush #13
    //   5162: aload #37
    //   5164: iload #51
    //   5166: bipush #16
    //   5168: iushr
    //   5169: sipush #255
    //   5172: iand
    //   5173: baload
    //   5174: iload #48
    //   5176: bipush #16
    //   5178: iushr
    //   5179: ixor
    //   5180: i2b
    //   5181: bastore
    //   5182: aload #46
    //   5184: bipush #14
    //   5186: aload #37
    //   5188: iload #50
    //   5190: bipush #8
    //   5192: iushr
    //   5193: sipush #255
    //   5196: iand
    //   5197: baload
    //   5198: iload #48
    //   5200: bipush #8
    //   5202: iushr
    //   5203: ixor
    //   5204: i2b
    //   5205: bastore
    //   5206: aload #46
    //   5208: bipush #15
    //   5210: aload #37
    //   5212: iload #49
    //   5214: sipush #255
    //   5217: iand
    //   5218: baload
    //   5219: iload #48
    //   5221: ixor
    //   5222: i2b
    //   5223: bastore
    //   5224: iconst_0
    //   5225: istore #53
    //   5227: iload #53
    //   5229: bipush #16
    //   5231: if_icmpge -> 5257
    //   5234: aload #43
    //   5236: iload #53
    //   5238: iload #44
    //   5240: bipush #16
    //   5242: imul
    //   5243: iadd
    //   5244: aload #46
    //   5246: iload #53
    //   5248: baload
    //   5249: bastore
    //   5250: iinc #53, 1
    //   5253: iload_2
    //   5254: ifeq -> 5227
    //   5257: iinc #44, 1
    //   5260: iload_2
    //   5261: ifeq -> 4342
    //   5264: aload #43
    //   5266: arraylength
    //   5267: ifle -> 5348
    //   5270: aload #43
    //   5272: aload #43
    //   5274: arraylength
    //   5275: iconst_1
    //   5276: isub
    //   5277: baload
    //   5278: istore #44
    //   5280: iload #44
    //   5282: bipush #16
    //   5284: if_icmple -> 5295
    //   5287: aload #43
    //   5289: astore #35
    //   5291: iload_2
    //   5292: ifeq -> 5348
    //   5295: aload #43
    //   5297: arraylength
    //   5298: iload #44
    //   5300: isub
    //   5301: newarray byte
    //   5303: astore #35
    //   5305: iconst_0
    //   5306: istore #45
    //   5308: iload #45
    //   5310: aload #35
    //   5312: arraylength
    //   5313: if_icmpge -> 5348
    //   5316: iload #45
    //   5318: aload #43
    //   5320: arraylength
    //   5321: if_icmpge -> 5348
    //   5324: aload #35
    //   5326: iload #45
    //   5328: aload #43
    //   5330: iload #45
    //   5332: baload
    //   5333: bastore
    //   5334: iinc #45, 1
    //   5337: iload_2
    //   5338: ifeq -> 5308
    //   5341: goto -> 5348
    //   5344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5347: athrow
    //   5348: aload #35
    //   5350: astore #7
    //   5352: getstatic burp/Zgyk.ZB : Ljava/lang/String;
    //   5355: getstatic burp/Zs9k.ZX : Ljava/lang/Object;
    //   5358: checkcast java/math/BigInteger
    //   5361: invokevirtual intValue : ()I
    //   5364: bipush #32
    //   5366: irem
    //   5367: invokestatic abs : (I)I
    //   5370: invokevirtual charAt : (I)C
    //   5373: getstatic burp/Zrxm.Zp : Ljava/lang/String;
    //   5376: getstatic burp/Zlg1.ZH : Ljava/lang/Object;
    //   5379: checkcast java/math/BigInteger
    //   5382: invokevirtual intValue : ()I
    //   5385: bipush #32
    //   5387: irem
    //   5388: invokestatic abs : (I)I
    //   5391: invokevirtual charAt : (I)C
    //   5394: if_icmpgt -> 5501
    //   5397: getstatic burp/Zgyk.ZB : Ljava/lang/String;
    //   5400: getstatic burp/Zmnb.Zz : Ljava/lang/Object;
    //   5403: checkcast java/math/BigInteger
    //   5406: invokevirtual intValue : ()I
    //   5409: bipush #32
    //   5411: irem
    //   5412: invokestatic abs : (I)I
    //   5415: invokevirtual charAt : (I)C
    //   5418: getstatic burp/Zz5s.ZL : Ljava/lang/String;
    //   5421: getstatic burp/Ztod.ZP : Ljava/lang/Object;
    //   5424: checkcast java/math/BigInteger
    //   5427: invokevirtual intValue : ()I
    //   5430: bipush #32
    //   5432: irem
    //   5433: invokestatic abs : (I)I
    //   5436: invokevirtual charAt : (I)C
    //   5439: if_icmpgt -> 5501
    //   5442: goto -> 5449
    //   5445: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5448: athrow
    //   5449: getstatic burp/Zkdc.Zc : Ljava/lang/String;
    //   5452: getstatic burp/Zlg1.ZH : Ljava/lang/Object;
    //   5455: checkcast java/math/BigInteger
    //   5458: invokevirtual intValue : ()I
    //   5461: bipush #32
    //   5463: irem
    //   5464: invokestatic abs : (I)I
    //   5467: invokevirtual charAt : (I)C
    //   5470: getstatic burp/Zttq.ZO : Ljava/lang/String;
    //   5473: getstatic burp/Zryq.ZR : Ljava/lang/Object;
    //   5476: checkcast java/math/BigInteger
    //   5479: invokevirtual intValue : ()I
    //   5482: bipush #32
    //   5484: irem
    //   5485: invokestatic abs : (I)I
    //   5488: invokevirtual charAt : (I)C
    //   5491: if_icmpgt -> 5509
    //   5494: goto -> 5501
    //   5497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5500: athrow
    //   5501: iconst_1
    //   5502: goto -> 5510
    //   5505: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5508: athrow
    //   5509: iconst_0
    //   5510: ireturn
    //   5511: astore_3
    //   5512: new java/lang/Exception
    //   5515: dup
    //   5516: aload_3
    //   5517: invokevirtual getMessage : ()Ljava/lang/String;
    //   5520: invokespecial <init> : (Ljava/lang/String;)V
    //   5523: athrow
    // Exception table:
    //   from	to	target	type
    //   4	5510	5511	java/lang/Throwable
    //   149	164	164	java/lang/Throwable
    //   1166	1192	1192	java/lang/Throwable
    //   1273	1288	1288	java/lang/Throwable
    //   2470	2495	2498	java/lang/Throwable
    //   2563	2577	2577	java/lang/Throwable
    //   2588	2601	2604	java/lang/Throwable
    //   2593	2616	2619	java/lang/Throwable
    //   2608	2634	2637	java/lang/Throwable
    //   2623	2664	2667	java/lang/Throwable
    //   2727	2754	2757	java/lang/Throwable
    //   2744	2775	2778	java/lang/Throwable
    //   2761	2805	2808	java/lang/Throwable
    //   2782	2816	2816	java/lang/Throwable
    //   2827	2843	2846	java/lang/Throwable
    //   2995	3010	3010	java/lang/Throwable
    //   4012	4038	4038	java/lang/Throwable
    //   4119	4134	4134	java/lang/Throwable
    //   5316	5341	5344	java/lang/Throwable
    //   5352	5442	5445	java/lang/Throwable
    //   5397	5494	5497	java/lang/Throwable
    //   5449	5505	5505	java/lang/Throwable
  }
  
  static void Zk(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '1|ÀDC揩睷澽ト枷︴ꯉ쨶짍𢡊䟆괉ꉂ鳌狍띥鏅㚌㐷焰㆜Ҁ⎺ᣯ֭ެ肁뉹१Ⲹ᮪嫩勒혋⥧⽽叴₎놥橈븿䪪塠키꫆䏔㏨䔅Ȋ倌龢冞䁹銨㠦볐?ၞ췘Ꭼ徃䒮쓤细撕᤮惴來≘遉䙑뢣?ଈ㫶䧡␒숮골釈㝴趪仠汳攊꺉멚◍Ო뒋瓲䬣譾炋땵䢔慆坌蛌ᵂ頋槼蹄鬾蜱캔⠪賓襝뾋䈲䆄ⷷ끩묙¤Ëð©ßTï\\t±Íîp¥¬%MîM®HFÒD8Ö|~þRJF«ø¤\\r¯Ê'92´mb5Äõ\\rùåÑEÓILñëmP;ËP-ù$â7µaMâ $RBï?[ÿ\{ó¡mÈ®§HÔÒ~¼3V¡-8QØhG9"}×@?ÔÜ#KÖ÷áC2³Ã ,â!?D¸H Ð]d¥\\fþl'\\tQ\\rw/¯giÝÝKI/\\t¿þÞ©OKv£Ù\\t2%+*ÃºÇÙ§¹$öå¥Ù­wY6â¾þñÈI ìCuùØü°Høq 0cÅ¬^²ePÝÇzý¸»'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #36
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
    //   68: ldc 'ãMGôÑ}Â捰眔濃ヾ杪ﻠꭠ쪾짪頻䜰굻ꊎ鲐牆럼鎦㚭㐁燤ㄵЈ⎝ᣬ՛ߞ聍닲৾ⳛᮋ媗勤훖⦳⿔卼ª₍녓樺뻳䫶士퀽ꪥ䏵㎖䔳˗僘鼋儖䁞銫㣐벢?ဂ쵁Ꮟ徢䓐쓒縛摁ᦇ恼価≛邿䘣롯?ஃ㪕䧀⑬수갵鄜㝓趩世氁敖긂뫃▮᲼듵琯䯷诗瀃땒䢗愴垀蚐᷉顨槝踺鬈蟬칀⢃豛襺뾈䋄䇶ⴻ뀵뮒'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #52
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
    //   129: putstatic burp/Zexu.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zexu.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #109
    //   214: goto -> 243
    //   217: bipush #57
    //   219: goto -> 243
    //   222: bipush #60
    //   224: goto -> 243
    //   227: iconst_5
    //   228: goto -> 243
    //   231: bipush #122
    //   233: goto -> 243
    //   236: bipush #86
    //   238: goto -> 243
    //   241: bipush #52
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: sipush #-9670
    //   307: sipush #-21219
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zexu.ZI : Ljava/lang/Object;
    //   319: sipush #-9669
    //   322: sipush #30717
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zexu.Zp : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDA3E) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zexu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */