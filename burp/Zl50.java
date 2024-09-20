package burp;

import java.math.BigInteger;

class Zl50 extends ClassLoader {
  static Object ZV;
  
  static String Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zi(Object paramObject) {
    Ztex.Zx = a(3809, 16589);
    Ztex.Z_ = new BigInteger(a(3821, -13140));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zs34.Zq.charAt(Math.abs(((BigInteger)Ztdd.ZD).intValue() % 32)) > Zlhy.ZS.charAt(Math.abs(((BigInteger)Zb8y.ZI).intValue() % 32))) {
          try {
            Zlqm.ZB(Class.forName(a(3838, 1277)));
            if (!bool)
              Zgpp.Ze(Class.forName(a(3811, 2610))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgpp.Ze(Class.forName(a(3811, 2610)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZO(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: getstatic burp/Zg4k.ZB : Ljava/lang/String;
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
    //   63: getstatic burp/Zm8w.Zz : Ljava/lang/Object;
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
    //   131: sipush #3824
    //   134: sipush #18804
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
    //   1179: sipush #3810
    //   1182: sipush #9411
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: invokespecial <init> : (Ljava/lang/String;)V
    //   1191: athrow
    //   1192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1195: athrow
    //   1196: bipush #10
    //   1198: istore #36
    //   1200: sipush #3825
    //   1203: sipush #256
    //   1206: newarray byte
    //   1208: astore #37
    //   1210: sipush #-24644
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
    //   2506: sipush #3830
    //   2509: new java/math/BigInteger
    //   2512: dup
    //   2513: aload #7
    //   2515: invokespecial <init> : ([B)V
    //   2518: invokevirtual abs : ()Ljava/math/BigInteger;
    //   2521: putstatic burp/Zk7e.ZW : Ljava/lang/Object;
    //   2524: sipush #-8095
    //   2527: getstatic burp/Zx6d.ZU : Ljava/lang/Object;
    //   2530: checkcast java/math/BigInteger
    //   2533: getstatic burp/Zlck.Zr : Ljava/lang/Object;
    //   2536: checkcast java/math/BigInteger
    //   2539: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   2542: putstatic burp/Zzr5.Za : Ljava/lang/Object;
    //   2545: invokestatic a : (II)Ljava/lang/String;
    //   2548: iconst_1
    //   2549: ldc burp/Zzai
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
    //   2667: sipush #3836
    //   2670: sipush #-26723
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
    //   2706: ifne -> 2568
    //   2709: sipush #3818
    //   2712: sipush #8142
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
    //   2851: ifne -> 2868
    //   2854: iinc #5, 1
    //   2857: iload_2
    //   2858: ifne -> 2732
    //   2861: goto -> 2868
    //   2864: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2867: athrow
    //   2868: getstatic burp/Zsf7.Zg : Ljava/lang/Object;
    //   2871: checkcast java/math/BigInteger
    //   2874: invokevirtual intValue : ()I
    //   2877: i2l
    //   2878: invokestatic currentTimeMillis : ()J
    //   2881: ladd
    //   2882: getstatic burp/Zvo3.Ze : Ljava/lang/Object;
    //   2885: checkcast java/math/BigInteger
    //   2888: invokevirtual intValue : ()I
    //   2891: i2l
    //   2892: lcmp
    //   2893: ifge -> 3225
    //   2896: sipush #3818
    //   2899: sipush #8142
    //   2902: invokestatic a : (II)Ljava/lang/String;
    //   2905: iconst_1
    //   2906: ldc burp/Ztex
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
    //   3024: sipush #3823
    //   3027: sipush #-29875
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
    //   3063: ifne -> 2925
    //   3066: sipush #3818
    //   3069: sipush #8142
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
    //   3208: ifne -> 3225
    //   3211: iinc #5, 1
    //   3214: iload_2
    //   3215: ifne -> 3089
    //   3218: goto -> 3225
    //   3221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3224: athrow
    //   3225: iconst_0
    //   3226: istore_3
    //   3227: getstatic burp/Zli5.Zq : Ljava/lang/String;
    //   3230: getstatic burp/Zmyg.Zj : Ljava/lang/Object;
    //   3233: checkcast java/math/BigInteger
    //   3236: invokevirtual intValue : ()I
    //   3239: bipush #32
    //   3241: irem
    //   3242: invokestatic abs : (I)I
    //   3245: invokevirtual charAt : (I)C
    //   3248: getstatic burp/Zlhy.ZS : Ljava/lang/String;
    //   3251: getstatic burp/Zlnm.Zn : Ljava/lang/Object;
    //   3254: checkcast java/math/BigInteger
    //   3257: invokevirtual intValue : ()I
    //   3260: bipush #32
    //   3262: irem
    //   3263: invokestatic abs : (I)I
    //   3266: invokevirtual charAt : (I)C
    //   3269: if_icmpgt -> 3613
    //   3272: sipush #3834
    //   3275: sipush #-27512
    //   3278: invokestatic a : (II)Ljava/lang/String;
    //   3281: iconst_1
    //   3282: ldc burp/Zvk
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
    //   3403: sipush #3823
    //   3406: sipush #-29875
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
    //   3445: sipush #3833
    //   3448: sipush #-31668
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
    //   3610: goto -> 3951
    //   3613: sipush #3817
    //   3616: sipush #-32052
    //   3619: invokestatic a : (II)Ljava/lang/String;
    //   3622: iconst_1
    //   3623: ldc burp/Zrdy
    //   3625: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3628: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3631: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3634: astore #4
    //   3636: aload #4
    //   3638: arraylength
    //   3639: istore #5
    //   3641: iconst_0
    //   3642: istore #6
    //   3644: iload #6
    //   3646: iload #5
    //   3648: if_icmpge -> 3786
    //   3651: aload #4
    //   3653: iload #6
    //   3655: aaload
    //   3656: astore #7
    //   3658: aload #7
    //   3660: invokevirtual getModifiers : ()I
    //   3663: invokestatic isStatic : (I)Z
    //   3666: ifne -> 3676
    //   3669: goto -> 3779
    //   3672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3675: athrow
    //   3676: aload #7
    //   3678: invokevirtual getType : ()Ljava/lang/Class;
    //   3681: astore #8
    //   3683: aload #8
    //   3685: ifnull -> 3766
    //   3688: aload #8
    //   3690: invokevirtual isPrimitive : ()Z
    //   3693: ifne -> 3766
    //   3696: goto -> 3703
    //   3699: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3702: athrow
    //   3703: aload #8
    //   3705: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3708: ifnull -> 3766
    //   3711: goto -> 3718
    //   3714: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3717: athrow
    //   3718: aload #8
    //   3720: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3723: invokevirtual getName : ()Ljava/lang/String;
    //   3726: ifnull -> 3766
    //   3729: goto -> 3736
    //   3732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3735: athrow
    //   3736: aload #8
    //   3738: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3741: invokevirtual getName : ()Ljava/lang/String;
    //   3744: sipush #3823
    //   3747: sipush #-29875
    //   3750: invokestatic a : (II)Ljava/lang/String;
    //   3753: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3756: ifne -> 3766
    //   3759: goto -> 3766
    //   3762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3765: athrow
    //   3766: aload #7
    //   3768: iconst_1
    //   3769: invokevirtual setAccessible : (Z)V
    //   3772: aload #7
    //   3774: aconst_null
    //   3775: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3778: pop
    //   3779: iinc #6, 1
    //   3782: iload_2
    //   3783: ifne -> 3644
    //   3786: sipush #3828
    //   3789: sipush #-9116
    //   3792: invokestatic a : (II)Ljava/lang/String;
    //   3795: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3798: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3801: astore #4
    //   3803: aload #4
    //   3805: arraylength
    //   3806: istore #5
    //   3808: iconst_0
    //   3809: istore #6
    //   3811: iload #6
    //   3813: iload #5
    //   3815: if_icmpge -> 3951
    //   3818: aload #4
    //   3820: iload #6
    //   3822: aaload
    //   3823: astore #7
    //   3825: aload #7
    //   3827: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3830: pop
    //   3831: aload #7
    //   3833: invokevirtual getModifiers : ()I
    //   3836: invokestatic isStatic : (I)Z
    //   3839: ifeq -> 3937
    //   3842: aload #7
    //   3844: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3847: arraylength
    //   3848: iconst_2
    //   3849: if_icmpne -> 3937
    //   3852: goto -> 3859
    //   3855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3858: athrow
    //   3859: aload #7
    //   3861: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3864: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3867: if_acmpne -> 3937
    //   3870: goto -> 3877
    //   3873: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3876: athrow
    //   3877: aload #7
    //   3879: iconst_1
    //   3880: invokevirtual setAccessible : (Z)V
    //   3883: aload #7
    //   3885: aconst_null
    //   3886: iconst_2
    //   3887: anewarray java/lang/Object
    //   3890: dup
    //   3891: iconst_0
    //   3892: aload_0
    //   3893: aastore
    //   3894: dup
    //   3895: iconst_1
    //   3896: aload_1
    //   3897: ifnonnull -> 3915
    //   3900: goto -> 3907
    //   3903: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3906: athrow
    //   3907: aload_1
    //   3908: goto -> 3922
    //   3911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3914: athrow
    //   3915: aload_1
    //   3916: checkcast [B
    //   3919: invokevirtual clone : ()Ljava/lang/Object;
    //   3922: aastore
    //   3923: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3926: checkcast java/lang/Boolean
    //   3929: invokevirtual booleanValue : ()Z
    //   3932: istore_3
    //   3933: iload_2
    //   3934: ifne -> 3951
    //   3937: iinc #6, 1
    //   3940: iload_2
    //   3941: ifne -> 3811
    //   3944: goto -> 3951
    //   3947: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3950: athrow
    //   3951: iload_3
    //   3952: ifeq -> 3957
    //   3955: iload_3
    //   3956: ireturn
    //   3957: getstatic burp/Zs75.Zn : Ljava/lang/String;
    //   3960: getstatic burp/Zzox.Zq : Ljava/lang/Object;
    //   3963: checkcast java/math/BigInteger
    //   3966: invokevirtual intValue : ()I
    //   3969: bipush #32
    //   3971: irem
    //   3972: invokestatic abs : (I)I
    //   3975: invokevirtual charAt : (I)C
    //   3978: getstatic burp/Zrof.ZE : Ljava/lang/String;
    //   3981: getstatic burp/Ztex.Z_ : Ljava/lang/Object;
    //   3984: checkcast java/math/BigInteger
    //   3987: invokevirtual intValue : ()I
    //   3990: bipush #32
    //   3992: irem
    //   3993: invokestatic abs : (I)I
    //   3996: invokevirtual charAt : (I)C
    //   3999: if_icmpgt -> 4344
    //   4002: sipush #3822
    //   4005: sipush #21031
    //   4008: invokestatic a : (II)Ljava/lang/String;
    //   4011: iconst_1
    //   4012: ldc burp/Zlpj
    //   4014: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4017: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4020: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4023: astore #4
    //   4025: aload #4
    //   4027: arraylength
    //   4028: istore #5
    //   4030: iconst_0
    //   4031: istore #6
    //   4033: iload #6
    //   4035: iload #5
    //   4037: if_icmpge -> 4175
    //   4040: aload #4
    //   4042: iload #6
    //   4044: aaload
    //   4045: astore #7
    //   4047: aload #7
    //   4049: invokevirtual getModifiers : ()I
    //   4052: invokestatic isStatic : (I)Z
    //   4055: ifne -> 4065
    //   4058: goto -> 4168
    //   4061: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4064: athrow
    //   4065: aload #7
    //   4067: invokevirtual getType : ()Ljava/lang/Class;
    //   4070: astore #8
    //   4072: aload #8
    //   4074: ifnull -> 4155
    //   4077: aload #8
    //   4079: invokevirtual isPrimitive : ()Z
    //   4082: ifne -> 4155
    //   4085: goto -> 4092
    //   4088: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4091: athrow
    //   4092: aload #8
    //   4094: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4097: ifnull -> 4155
    //   4100: goto -> 4107
    //   4103: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4106: athrow
    //   4107: aload #8
    //   4109: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4112: invokevirtual getName : ()Ljava/lang/String;
    //   4115: ifnull -> 4155
    //   4118: goto -> 4125
    //   4121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4124: athrow
    //   4125: aload #8
    //   4127: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4130: invokevirtual getName : ()Ljava/lang/String;
    //   4133: sipush #3823
    //   4136: sipush #-29875
    //   4139: invokestatic a : (II)Ljava/lang/String;
    //   4142: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4145: ifne -> 4155
    //   4148: goto -> 4155
    //   4151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4154: athrow
    //   4155: aload #7
    //   4157: iconst_1
    //   4158: invokevirtual setAccessible : (Z)V
    //   4161: aload #7
    //   4163: aconst_null
    //   4164: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4167: pop
    //   4168: iinc #6, 1
    //   4171: iload_2
    //   4172: ifne -> 4033
    //   4175: sipush #3819
    //   4178: sipush #4482
    //   4181: invokestatic a : (II)Ljava/lang/String;
    //   4184: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4187: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4190: astore #4
    //   4192: aload #4
    //   4194: arraylength
    //   4195: istore #5
    //   4197: iconst_0
    //   4198: istore #6
    //   4200: iload #6
    //   4202: iload #5
    //   4204: if_icmpge -> 4340
    //   4207: aload #4
    //   4209: iload #6
    //   4211: aaload
    //   4212: astore #7
    //   4214: aload #7
    //   4216: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4219: pop
    //   4220: aload #7
    //   4222: invokevirtual getModifiers : ()I
    //   4225: invokestatic isStatic : (I)Z
    //   4228: ifeq -> 4326
    //   4231: aload #7
    //   4233: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4236: arraylength
    //   4237: iconst_2
    //   4238: if_icmpne -> 4326
    //   4241: goto -> 4248
    //   4244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4247: athrow
    //   4248: aload #7
    //   4250: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4253: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4256: if_acmpne -> 4326
    //   4259: goto -> 4266
    //   4262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4265: athrow
    //   4266: aload #7
    //   4268: iconst_1
    //   4269: invokevirtual setAccessible : (Z)V
    //   4272: aload #7
    //   4274: aconst_null
    //   4275: iconst_2
    //   4276: anewarray java/lang/Object
    //   4279: dup
    //   4280: iconst_0
    //   4281: aload_0
    //   4282: aastore
    //   4283: dup
    //   4284: iconst_1
    //   4285: aload_1
    //   4286: ifnonnull -> 4304
    //   4289: goto -> 4296
    //   4292: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4295: athrow
    //   4296: aload_1
    //   4297: goto -> 4311
    //   4300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4303: athrow
    //   4304: aload_1
    //   4305: checkcast [B
    //   4308: invokevirtual clone : ()Ljava/lang/Object;
    //   4311: aastore
    //   4312: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4315: checkcast java/lang/Boolean
    //   4318: invokevirtual booleanValue : ()Z
    //   4321: istore_3
    //   4322: iload_2
    //   4323: ifne -> 4340
    //   4326: iinc #6, 1
    //   4329: iload_2
    //   4330: ifne -> 4200
    //   4333: goto -> 4340
    //   4336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4339: athrow
    //   4340: iload_2
    //   4341: ifne -> 4682
    //   4344: sipush #3808
    //   4347: sipush #-16914
    //   4350: invokestatic a : (II)Ljava/lang/String;
    //   4353: iconst_1
    //   4354: ldc burp/Zmrc
    //   4356: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4359: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4362: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4365: astore #4
    //   4367: aload #4
    //   4369: arraylength
    //   4370: istore #5
    //   4372: iconst_0
    //   4373: istore #6
    //   4375: iload #6
    //   4377: iload #5
    //   4379: if_icmpge -> 4517
    //   4382: aload #4
    //   4384: iload #6
    //   4386: aaload
    //   4387: astore #7
    //   4389: aload #7
    //   4391: invokevirtual getModifiers : ()I
    //   4394: invokestatic isStatic : (I)Z
    //   4397: ifne -> 4407
    //   4400: goto -> 4510
    //   4403: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4406: athrow
    //   4407: aload #7
    //   4409: invokevirtual getType : ()Ljava/lang/Class;
    //   4412: astore #8
    //   4414: aload #8
    //   4416: ifnull -> 4497
    //   4419: aload #8
    //   4421: invokevirtual isPrimitive : ()Z
    //   4424: ifne -> 4497
    //   4427: goto -> 4434
    //   4430: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4433: athrow
    //   4434: aload #8
    //   4436: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4439: ifnull -> 4497
    //   4442: goto -> 4449
    //   4445: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4448: athrow
    //   4449: aload #8
    //   4451: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4454: invokevirtual getName : ()Ljava/lang/String;
    //   4457: ifnull -> 4497
    //   4460: goto -> 4467
    //   4463: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4466: athrow
    //   4467: aload #8
    //   4469: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4472: invokevirtual getName : ()Ljava/lang/String;
    //   4475: sipush #3823
    //   4478: sipush #-29875
    //   4481: invokestatic a : (II)Ljava/lang/String;
    //   4484: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4487: ifne -> 4497
    //   4490: goto -> 4497
    //   4493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4496: athrow
    //   4497: aload #7
    //   4499: iconst_1
    //   4500: invokevirtual setAccessible : (Z)V
    //   4503: aload #7
    //   4505: aconst_null
    //   4506: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4509: pop
    //   4510: iinc #6, 1
    //   4513: iload_2
    //   4514: ifne -> 4375
    //   4517: sipush #3812
    //   4520: sipush #7755
    //   4523: invokestatic a : (II)Ljava/lang/String;
    //   4526: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4529: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4532: astore #4
    //   4534: aload #4
    //   4536: arraylength
    //   4537: istore #5
    //   4539: iconst_0
    //   4540: istore #6
    //   4542: iload #6
    //   4544: iload #5
    //   4546: if_icmpge -> 4682
    //   4549: aload #4
    //   4551: iload #6
    //   4553: aaload
    //   4554: astore #7
    //   4556: aload #7
    //   4558: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4561: pop
    //   4562: aload #7
    //   4564: invokevirtual getModifiers : ()I
    //   4567: invokestatic isStatic : (I)Z
    //   4570: ifeq -> 4668
    //   4573: aload #7
    //   4575: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4578: arraylength
    //   4579: iconst_2
    //   4580: if_icmpne -> 4668
    //   4583: goto -> 4590
    //   4586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4589: athrow
    //   4590: aload #7
    //   4592: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4595: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4598: if_acmpne -> 4668
    //   4601: goto -> 4608
    //   4604: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4607: athrow
    //   4608: aload #7
    //   4610: iconst_1
    //   4611: invokevirtual setAccessible : (Z)V
    //   4614: aload #7
    //   4616: aconst_null
    //   4617: iconst_2
    //   4618: anewarray java/lang/Object
    //   4621: dup
    //   4622: iconst_0
    //   4623: aload_0
    //   4624: aastore
    //   4625: dup
    //   4626: iconst_1
    //   4627: aload_1
    //   4628: ifnonnull -> 4646
    //   4631: goto -> 4638
    //   4634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4637: athrow
    //   4638: aload_1
    //   4639: goto -> 4653
    //   4642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4645: athrow
    //   4646: aload_1
    //   4647: checkcast [B
    //   4650: invokevirtual clone : ()Ljava/lang/Object;
    //   4653: aastore
    //   4654: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4657: checkcast java/lang/Boolean
    //   4660: invokevirtual booleanValue : ()Z
    //   4663: istore_3
    //   4664: iload_2
    //   4665: ifne -> 4682
    //   4668: iinc #6, 1
    //   4671: iload_2
    //   4672: ifne -> 4542
    //   4675: goto -> 4682
    //   4678: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4681: athrow
    //   4682: iload_3
    //   4683: ifeq -> 4688
    //   4686: iload_3
    //   4687: ireturn
    //   4688: getstatic burp/Zram.Ze : Ljava/lang/String;
    //   4691: getstatic burp/Zli5.Zt : Ljava/lang/Object;
    //   4694: checkcast java/math/BigInteger
    //   4697: invokevirtual intValue : ()I
    //   4700: bipush #32
    //   4702: irem
    //   4703: invokestatic abs : (I)I
    //   4706: invokevirtual charAt : (I)C
    //   4709: getstatic burp/Zrtv.ZA : Ljava/lang/String;
    //   4712: getstatic burp/Zl50.ZV : Ljava/lang/Object;
    //   4715: checkcast java/math/BigInteger
    //   4718: invokevirtual intValue : ()I
    //   4721: bipush #32
    //   4723: irem
    //   4724: invokestatic abs : (I)I
    //   4727: invokevirtual charAt : (I)C
    //   4730: if_icmpgt -> 5075
    //   4733: sipush #3829
    //   4736: sipush #31024
    //   4739: invokestatic a : (II)Ljava/lang/String;
    //   4742: iconst_1
    //   4743: ldc burp/Zg7p
    //   4745: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4748: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4751: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4754: astore #4
    //   4756: aload #4
    //   4758: arraylength
    //   4759: istore #5
    //   4761: iconst_0
    //   4762: istore #6
    //   4764: iload #6
    //   4766: iload #5
    //   4768: if_icmpge -> 4906
    //   4771: aload #4
    //   4773: iload #6
    //   4775: aaload
    //   4776: astore #7
    //   4778: aload #7
    //   4780: invokevirtual getModifiers : ()I
    //   4783: invokestatic isStatic : (I)Z
    //   4786: ifne -> 4796
    //   4789: goto -> 4899
    //   4792: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4795: athrow
    //   4796: aload #7
    //   4798: invokevirtual getType : ()Ljava/lang/Class;
    //   4801: astore #8
    //   4803: aload #8
    //   4805: ifnull -> 4886
    //   4808: aload #8
    //   4810: invokevirtual isPrimitive : ()Z
    //   4813: ifne -> 4886
    //   4816: goto -> 4823
    //   4819: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4822: athrow
    //   4823: aload #8
    //   4825: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4828: ifnull -> 4886
    //   4831: goto -> 4838
    //   4834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4837: athrow
    //   4838: aload #8
    //   4840: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4843: invokevirtual getName : ()Ljava/lang/String;
    //   4846: ifnull -> 4886
    //   4849: goto -> 4856
    //   4852: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4855: athrow
    //   4856: aload #8
    //   4858: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4861: invokevirtual getName : ()Ljava/lang/String;
    //   4864: sipush #3823
    //   4867: sipush #-29875
    //   4870: invokestatic a : (II)Ljava/lang/String;
    //   4873: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4876: ifne -> 4886
    //   4879: goto -> 4886
    //   4882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4885: athrow
    //   4886: aload #7
    //   4888: iconst_1
    //   4889: invokevirtual setAccessible : (Z)V
    //   4892: aload #7
    //   4894: aconst_null
    //   4895: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4898: pop
    //   4899: iinc #6, 1
    //   4902: iload_2
    //   4903: ifne -> 4764
    //   4906: sipush #3813
    //   4909: sipush #-31529
    //   4912: invokestatic a : (II)Ljava/lang/String;
    //   4915: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4918: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4921: astore #4
    //   4923: aload #4
    //   4925: arraylength
    //   4926: istore #5
    //   4928: iconst_0
    //   4929: istore #6
    //   4931: iload #6
    //   4933: iload #5
    //   4935: if_icmpge -> 5071
    //   4938: aload #4
    //   4940: iload #6
    //   4942: aaload
    //   4943: astore #7
    //   4945: aload #7
    //   4947: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4950: pop
    //   4951: aload #7
    //   4953: invokevirtual getModifiers : ()I
    //   4956: invokestatic isStatic : (I)Z
    //   4959: ifeq -> 5057
    //   4962: aload #7
    //   4964: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4967: arraylength
    //   4968: iconst_2
    //   4969: if_icmpne -> 5057
    //   4972: goto -> 4979
    //   4975: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4978: athrow
    //   4979: aload #7
    //   4981: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4984: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4987: if_acmpne -> 5057
    //   4990: goto -> 4997
    //   4993: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4996: athrow
    //   4997: aload #7
    //   4999: iconst_1
    //   5000: invokevirtual setAccessible : (Z)V
    //   5003: aload #7
    //   5005: aconst_null
    //   5006: iconst_2
    //   5007: anewarray java/lang/Object
    //   5010: dup
    //   5011: iconst_0
    //   5012: aload_0
    //   5013: aastore
    //   5014: dup
    //   5015: iconst_1
    //   5016: aload_1
    //   5017: ifnonnull -> 5035
    //   5020: goto -> 5027
    //   5023: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5026: athrow
    //   5027: aload_1
    //   5028: goto -> 5042
    //   5031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5034: athrow
    //   5035: aload_1
    //   5036: checkcast [B
    //   5039: invokevirtual clone : ()Ljava/lang/Object;
    //   5042: aastore
    //   5043: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5046: checkcast java/lang/Boolean
    //   5049: invokevirtual booleanValue : ()Z
    //   5052: istore_3
    //   5053: iload_2
    //   5054: ifne -> 5071
    //   5057: iinc #6, 1
    //   5060: iload_2
    //   5061: ifne -> 4931
    //   5064: goto -> 5071
    //   5067: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5070: athrow
    //   5071: iload_2
    //   5072: ifne -> 5413
    //   5075: sipush #3820
    //   5078: sipush #26583
    //   5081: invokestatic a : (II)Ljava/lang/String;
    //   5084: iconst_1
    //   5085: ldc burp/Zkjr
    //   5087: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5090: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5093: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5096: astore #4
    //   5098: aload #4
    //   5100: arraylength
    //   5101: istore #5
    //   5103: iconst_0
    //   5104: istore #6
    //   5106: iload #6
    //   5108: iload #5
    //   5110: if_icmpge -> 5248
    //   5113: aload #4
    //   5115: iload #6
    //   5117: aaload
    //   5118: astore #7
    //   5120: aload #7
    //   5122: invokevirtual getModifiers : ()I
    //   5125: invokestatic isStatic : (I)Z
    //   5128: ifne -> 5138
    //   5131: goto -> 5241
    //   5134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5137: athrow
    //   5138: aload #7
    //   5140: invokevirtual getType : ()Ljava/lang/Class;
    //   5143: astore #8
    //   5145: aload #8
    //   5147: ifnull -> 5228
    //   5150: aload #8
    //   5152: invokevirtual isPrimitive : ()Z
    //   5155: ifne -> 5228
    //   5158: goto -> 5165
    //   5161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5164: athrow
    //   5165: aload #8
    //   5167: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5170: ifnull -> 5228
    //   5173: goto -> 5180
    //   5176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5179: athrow
    //   5180: aload #8
    //   5182: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5185: invokevirtual getName : ()Ljava/lang/String;
    //   5188: ifnull -> 5228
    //   5191: goto -> 5198
    //   5194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5197: athrow
    //   5198: aload #8
    //   5200: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5203: invokevirtual getName : ()Ljava/lang/String;
    //   5206: sipush #3823
    //   5209: sipush #-29875
    //   5212: invokestatic a : (II)Ljava/lang/String;
    //   5215: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5218: ifne -> 5228
    //   5221: goto -> 5228
    //   5224: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5227: athrow
    //   5228: aload #7
    //   5230: iconst_1
    //   5231: invokevirtual setAccessible : (Z)V
    //   5234: aload #7
    //   5236: aconst_null
    //   5237: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5240: pop
    //   5241: iinc #6, 1
    //   5244: iload_2
    //   5245: ifne -> 5106
    //   5248: sipush #3827
    //   5251: sipush #-3468
    //   5254: invokestatic a : (II)Ljava/lang/String;
    //   5257: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5260: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5263: astore #4
    //   5265: aload #4
    //   5267: arraylength
    //   5268: istore #5
    //   5270: iconst_0
    //   5271: istore #6
    //   5273: iload #6
    //   5275: iload #5
    //   5277: if_icmpge -> 5413
    //   5280: aload #4
    //   5282: iload #6
    //   5284: aaload
    //   5285: astore #7
    //   5287: aload #7
    //   5289: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5292: pop
    //   5293: aload #7
    //   5295: invokevirtual getModifiers : ()I
    //   5298: invokestatic isStatic : (I)Z
    //   5301: ifeq -> 5399
    //   5304: aload #7
    //   5306: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5309: arraylength
    //   5310: iconst_2
    //   5311: if_icmpne -> 5399
    //   5314: goto -> 5321
    //   5317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5320: athrow
    //   5321: aload #7
    //   5323: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5326: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5329: if_acmpne -> 5399
    //   5332: goto -> 5339
    //   5335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5338: athrow
    //   5339: aload #7
    //   5341: iconst_1
    //   5342: invokevirtual setAccessible : (Z)V
    //   5345: aload #7
    //   5347: aconst_null
    //   5348: iconst_2
    //   5349: anewarray java/lang/Object
    //   5352: dup
    //   5353: iconst_0
    //   5354: aload_0
    //   5355: aastore
    //   5356: dup
    //   5357: iconst_1
    //   5358: aload_1
    //   5359: ifnonnull -> 5377
    //   5362: goto -> 5369
    //   5365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5368: athrow
    //   5369: aload_1
    //   5370: goto -> 5384
    //   5373: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5376: athrow
    //   5377: aload_1
    //   5378: checkcast [B
    //   5381: invokevirtual clone : ()Ljava/lang/Object;
    //   5384: aastore
    //   5385: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5388: checkcast java/lang/Boolean
    //   5391: invokevirtual booleanValue : ()Z
    //   5394: istore_3
    //   5395: iload_2
    //   5396: ifne -> 5413
    //   5399: iinc #6, 1
    //   5402: iload_2
    //   5403: ifne -> 5273
    //   5406: goto -> 5413
    //   5409: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5412: athrow
    //   5413: iload_3
    //   5414: ifeq -> 5419
    //   5417: iload_3
    //   5418: ireturn
    //   5419: getstatic burp/Zl06.ZL : Ljava/lang/String;
    //   5422: getstatic burp/Zgva.Zr : Ljava/lang/Object;
    //   5425: checkcast java/math/BigInteger
    //   5428: invokevirtual intValue : ()I
    //   5431: bipush #32
    //   5433: irem
    //   5434: invokestatic abs : (I)I
    //   5437: invokevirtual charAt : (I)C
    //   5440: getstatic burp/Zsxo.ZW : Ljava/lang/String;
    //   5443: getstatic burp/Ztj5.Zj : Ljava/lang/Object;
    //   5446: checkcast java/math/BigInteger
    //   5449: invokevirtual intValue : ()I
    //   5452: bipush #32
    //   5454: irem
    //   5455: invokestatic abs : (I)I
    //   5458: invokevirtual charAt : (I)C
    //   5461: if_icmpgt -> 5806
    //   5464: sipush #3837
    //   5467: sipush #620
    //   5470: invokestatic a : (II)Ljava/lang/String;
    //   5473: iconst_1
    //   5474: ldc burp/Zs5y
    //   5476: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5479: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5482: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5485: astore #4
    //   5487: aload #4
    //   5489: arraylength
    //   5490: istore #5
    //   5492: iconst_0
    //   5493: istore #6
    //   5495: iload #6
    //   5497: iload #5
    //   5499: if_icmpge -> 5637
    //   5502: aload #4
    //   5504: iload #6
    //   5506: aaload
    //   5507: astore #7
    //   5509: aload #7
    //   5511: invokevirtual getModifiers : ()I
    //   5514: invokestatic isStatic : (I)Z
    //   5517: ifne -> 5527
    //   5520: goto -> 5630
    //   5523: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5526: athrow
    //   5527: aload #7
    //   5529: invokevirtual getType : ()Ljava/lang/Class;
    //   5532: astore #8
    //   5534: aload #8
    //   5536: ifnull -> 5617
    //   5539: aload #8
    //   5541: invokevirtual isPrimitive : ()Z
    //   5544: ifne -> 5617
    //   5547: goto -> 5554
    //   5550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5553: athrow
    //   5554: aload #8
    //   5556: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5559: ifnull -> 5617
    //   5562: goto -> 5569
    //   5565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5568: athrow
    //   5569: aload #8
    //   5571: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5574: invokevirtual getName : ()Ljava/lang/String;
    //   5577: ifnull -> 5617
    //   5580: goto -> 5587
    //   5583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5586: athrow
    //   5587: aload #8
    //   5589: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5592: invokevirtual getName : ()Ljava/lang/String;
    //   5595: sipush #3823
    //   5598: sipush #-29875
    //   5601: invokestatic a : (II)Ljava/lang/String;
    //   5604: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5607: ifne -> 5617
    //   5610: goto -> 5617
    //   5613: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5616: athrow
    //   5617: aload #7
    //   5619: iconst_1
    //   5620: invokevirtual setAccessible : (Z)V
    //   5623: aload #7
    //   5625: aconst_null
    //   5626: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5629: pop
    //   5630: iinc #6, 1
    //   5633: iload_2
    //   5634: ifne -> 5495
    //   5637: sipush #3839
    //   5640: sipush #4810
    //   5643: invokestatic a : (II)Ljava/lang/String;
    //   5646: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5649: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5652: astore #4
    //   5654: aload #4
    //   5656: arraylength
    //   5657: istore #5
    //   5659: iconst_0
    //   5660: istore #6
    //   5662: iload #6
    //   5664: iload #5
    //   5666: if_icmpge -> 5802
    //   5669: aload #4
    //   5671: iload #6
    //   5673: aaload
    //   5674: astore #7
    //   5676: aload #7
    //   5678: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5681: pop
    //   5682: aload #7
    //   5684: invokevirtual getModifiers : ()I
    //   5687: invokestatic isStatic : (I)Z
    //   5690: ifeq -> 5788
    //   5693: aload #7
    //   5695: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5698: arraylength
    //   5699: iconst_2
    //   5700: if_icmpne -> 5788
    //   5703: goto -> 5710
    //   5706: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5709: athrow
    //   5710: aload #7
    //   5712: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5715: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5718: if_acmpne -> 5788
    //   5721: goto -> 5728
    //   5724: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5727: athrow
    //   5728: aload #7
    //   5730: iconst_1
    //   5731: invokevirtual setAccessible : (Z)V
    //   5734: aload #7
    //   5736: aconst_null
    //   5737: iconst_2
    //   5738: anewarray java/lang/Object
    //   5741: dup
    //   5742: iconst_0
    //   5743: aload_0
    //   5744: aastore
    //   5745: dup
    //   5746: iconst_1
    //   5747: aload_1
    //   5748: ifnonnull -> 5766
    //   5751: goto -> 5758
    //   5754: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5757: athrow
    //   5758: aload_1
    //   5759: goto -> 5773
    //   5762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5765: athrow
    //   5766: aload_1
    //   5767: checkcast [B
    //   5770: invokevirtual clone : ()Ljava/lang/Object;
    //   5773: aastore
    //   5774: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5777: checkcast java/lang/Boolean
    //   5780: invokevirtual booleanValue : ()Z
    //   5783: istore_3
    //   5784: iload_2
    //   5785: ifne -> 5802
    //   5788: iinc #6, 1
    //   5791: iload_2
    //   5792: ifne -> 5662
    //   5795: goto -> 5802
    //   5798: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5801: athrow
    //   5802: iload_2
    //   5803: ifne -> 6143
    //   5806: sipush #3831
    //   5809: sipush #-10564
    //   5812: invokestatic a : (II)Ljava/lang/String;
    //   5815: iconst_1
    //   5816: ldc burp/Zlbd
    //   5818: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5821: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5824: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5827: astore #4
    //   5829: aload #4
    //   5831: arraylength
    //   5832: istore #5
    //   5834: iconst_0
    //   5835: istore #6
    //   5837: iload #6
    //   5839: iload #5
    //   5841: if_icmpge -> 5979
    //   5844: aload #4
    //   5846: iload #6
    //   5848: aaload
    //   5849: astore #7
    //   5851: aload #7
    //   5853: invokevirtual getModifiers : ()I
    //   5856: invokestatic isStatic : (I)Z
    //   5859: ifne -> 5869
    //   5862: goto -> 5972
    //   5865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5868: athrow
    //   5869: aload #7
    //   5871: invokevirtual getType : ()Ljava/lang/Class;
    //   5874: astore #8
    //   5876: aload #8
    //   5878: ifnull -> 5959
    //   5881: aload #8
    //   5883: invokevirtual isPrimitive : ()Z
    //   5886: ifne -> 5959
    //   5889: goto -> 5896
    //   5892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5895: athrow
    //   5896: aload #8
    //   5898: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5901: ifnull -> 5959
    //   5904: goto -> 5911
    //   5907: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5910: athrow
    //   5911: aload #8
    //   5913: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5916: invokevirtual getName : ()Ljava/lang/String;
    //   5919: ifnull -> 5959
    //   5922: goto -> 5929
    //   5925: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5928: athrow
    //   5929: aload #8
    //   5931: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5934: invokevirtual getName : ()Ljava/lang/String;
    //   5937: sipush #3823
    //   5940: sipush #-29875
    //   5943: invokestatic a : (II)Ljava/lang/String;
    //   5946: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5949: ifne -> 5959
    //   5952: goto -> 5959
    //   5955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5958: athrow
    //   5959: aload #7
    //   5961: iconst_1
    //   5962: invokevirtual setAccessible : (Z)V
    //   5965: aload #7
    //   5967: aconst_null
    //   5968: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5971: pop
    //   5972: iinc #6, 1
    //   5975: iload_2
    //   5976: ifne -> 5837
    //   5979: sipush #3814
    //   5982: bipush #-111
    //   5984: invokestatic a : (II)Ljava/lang/String;
    //   5987: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5990: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5993: astore #4
    //   5995: aload #4
    //   5997: arraylength
    //   5998: istore #5
    //   6000: iconst_0
    //   6001: istore #6
    //   6003: iload #6
    //   6005: iload #5
    //   6007: if_icmpge -> 6143
    //   6010: aload #4
    //   6012: iload #6
    //   6014: aaload
    //   6015: astore #7
    //   6017: aload #7
    //   6019: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6022: pop
    //   6023: aload #7
    //   6025: invokevirtual getModifiers : ()I
    //   6028: invokestatic isStatic : (I)Z
    //   6031: ifeq -> 6129
    //   6034: aload #7
    //   6036: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6039: arraylength
    //   6040: iconst_2
    //   6041: if_icmpne -> 6129
    //   6044: goto -> 6051
    //   6047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6050: athrow
    //   6051: aload #7
    //   6053: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6056: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6059: if_acmpne -> 6129
    //   6062: goto -> 6069
    //   6065: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6068: athrow
    //   6069: aload #7
    //   6071: iconst_1
    //   6072: invokevirtual setAccessible : (Z)V
    //   6075: aload #7
    //   6077: aconst_null
    //   6078: iconst_2
    //   6079: anewarray java/lang/Object
    //   6082: dup
    //   6083: iconst_0
    //   6084: aload_0
    //   6085: aastore
    //   6086: dup
    //   6087: iconst_1
    //   6088: aload_1
    //   6089: ifnonnull -> 6107
    //   6092: goto -> 6099
    //   6095: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6098: athrow
    //   6099: aload_1
    //   6100: goto -> 6114
    //   6103: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6106: athrow
    //   6107: aload_1
    //   6108: checkcast [B
    //   6111: invokevirtual clone : ()Ljava/lang/Object;
    //   6114: aastore
    //   6115: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6118: checkcast java/lang/Boolean
    //   6121: invokevirtual booleanValue : ()Z
    //   6124: istore_3
    //   6125: iload_2
    //   6126: ifne -> 6143
    //   6129: iinc #6, 1
    //   6132: iload_2
    //   6133: ifne -> 6003
    //   6136: goto -> 6143
    //   6139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6142: athrow
    //   6143: iload_3
    //   6144: ifeq -> 6149
    //   6147: iload_3
    //   6148: ireturn
    //   6149: getstatic burp/Zlx5.ZP : Ljava/lang/String;
    //   6152: getstatic burp/Zera.Zy : Ljava/lang/Object;
    //   6155: checkcast java/math/BigInteger
    //   6158: invokevirtual intValue : ()I
    //   6161: bipush #32
    //   6163: irem
    //   6164: invokestatic abs : (I)I
    //   6167: invokevirtual charAt : (I)C
    //   6170: getstatic burp/Zs8q.Zs : Ljava/lang/String;
    //   6173: getstatic burp/Zevr.ZG : Ljava/lang/Object;
    //   6176: checkcast java/math/BigInteger
    //   6179: invokevirtual intValue : ()I
    //   6182: bipush #32
    //   6184: irem
    //   6185: invokestatic abs : (I)I
    //   6188: invokevirtual charAt : (I)C
    //   6191: if_icmple -> 6536
    //   6194: sipush #3832
    //   6197: sipush #13905
    //   6200: invokestatic a : (II)Ljava/lang/String;
    //   6203: iconst_1
    //   6204: ldc burp/Zmt6
    //   6206: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6209: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6212: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6215: astore #4
    //   6217: aload #4
    //   6219: arraylength
    //   6220: istore #5
    //   6222: iconst_0
    //   6223: istore #6
    //   6225: iload #6
    //   6227: iload #5
    //   6229: if_icmpge -> 6367
    //   6232: aload #4
    //   6234: iload #6
    //   6236: aaload
    //   6237: astore #7
    //   6239: aload #7
    //   6241: invokevirtual getModifiers : ()I
    //   6244: invokestatic isStatic : (I)Z
    //   6247: ifne -> 6257
    //   6250: goto -> 6360
    //   6253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6256: athrow
    //   6257: aload #7
    //   6259: invokevirtual getType : ()Ljava/lang/Class;
    //   6262: astore #8
    //   6264: aload #8
    //   6266: ifnull -> 6347
    //   6269: aload #8
    //   6271: invokevirtual isPrimitive : ()Z
    //   6274: ifne -> 6347
    //   6277: goto -> 6284
    //   6280: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6283: athrow
    //   6284: aload #8
    //   6286: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6289: ifnull -> 6347
    //   6292: goto -> 6299
    //   6295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6298: athrow
    //   6299: aload #8
    //   6301: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6304: invokevirtual getName : ()Ljava/lang/String;
    //   6307: ifnull -> 6347
    //   6310: goto -> 6317
    //   6313: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6316: athrow
    //   6317: aload #8
    //   6319: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6322: invokevirtual getName : ()Ljava/lang/String;
    //   6325: sipush #3823
    //   6328: sipush #-29875
    //   6331: invokestatic a : (II)Ljava/lang/String;
    //   6334: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6337: ifne -> 6347
    //   6340: goto -> 6347
    //   6343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6346: athrow
    //   6347: aload #7
    //   6349: iconst_1
    //   6350: invokevirtual setAccessible : (Z)V
    //   6353: aload #7
    //   6355: aconst_null
    //   6356: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6359: pop
    //   6360: iinc #6, 1
    //   6363: iload_2
    //   6364: ifne -> 6225
    //   6367: sipush #3826
    //   6370: sipush #-19559
    //   6373: invokestatic a : (II)Ljava/lang/String;
    //   6376: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6379: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6382: astore #4
    //   6384: aload #4
    //   6386: arraylength
    //   6387: istore #5
    //   6389: iconst_0
    //   6390: istore #6
    //   6392: iload #6
    //   6394: iload #5
    //   6396: if_icmpge -> 6532
    //   6399: aload #4
    //   6401: iload #6
    //   6403: aaload
    //   6404: astore #7
    //   6406: aload #7
    //   6408: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6411: pop
    //   6412: aload #7
    //   6414: invokevirtual getModifiers : ()I
    //   6417: invokestatic isStatic : (I)Z
    //   6420: ifeq -> 6518
    //   6423: aload #7
    //   6425: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6428: arraylength
    //   6429: iconst_2
    //   6430: if_icmpne -> 6518
    //   6433: goto -> 6440
    //   6436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6439: athrow
    //   6440: aload #7
    //   6442: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6445: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6448: if_acmpne -> 6518
    //   6451: goto -> 6458
    //   6454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6457: athrow
    //   6458: aload #7
    //   6460: iconst_1
    //   6461: invokevirtual setAccessible : (Z)V
    //   6464: aload #7
    //   6466: aconst_null
    //   6467: iconst_2
    //   6468: anewarray java/lang/Object
    //   6471: dup
    //   6472: iconst_0
    //   6473: aload_0
    //   6474: aastore
    //   6475: dup
    //   6476: iconst_1
    //   6477: aload_1
    //   6478: ifnonnull -> 6496
    //   6481: goto -> 6488
    //   6484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6487: athrow
    //   6488: aload_1
    //   6489: goto -> 6503
    //   6492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6495: athrow
    //   6496: aload_1
    //   6497: checkcast [B
    //   6500: invokevirtual clone : ()Ljava/lang/Object;
    //   6503: aastore
    //   6504: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6507: checkcast java/lang/Boolean
    //   6510: invokevirtual booleanValue : ()Z
    //   6513: istore_3
    //   6514: iload_2
    //   6515: ifne -> 6532
    //   6518: iinc #6, 1
    //   6521: iload_2
    //   6522: ifne -> 6392
    //   6525: goto -> 6532
    //   6528: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6531: athrow
    //   6532: iload_2
    //   6533: ifne -> 6874
    //   6536: sipush #3815
    //   6539: sipush #10157
    //   6542: invokestatic a : (II)Ljava/lang/String;
    //   6545: iconst_1
    //   6546: ldc burp/Zsq5
    //   6548: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6551: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6554: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6557: astore #4
    //   6559: aload #4
    //   6561: arraylength
    //   6562: istore #5
    //   6564: iconst_0
    //   6565: istore #6
    //   6567: iload #6
    //   6569: iload #5
    //   6571: if_icmpge -> 6709
    //   6574: aload #4
    //   6576: iload #6
    //   6578: aaload
    //   6579: astore #7
    //   6581: aload #7
    //   6583: invokevirtual getModifiers : ()I
    //   6586: invokestatic isStatic : (I)Z
    //   6589: ifne -> 6599
    //   6592: goto -> 6702
    //   6595: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6598: athrow
    //   6599: aload #7
    //   6601: invokevirtual getType : ()Ljava/lang/Class;
    //   6604: astore #8
    //   6606: aload #8
    //   6608: ifnull -> 6689
    //   6611: aload #8
    //   6613: invokevirtual isPrimitive : ()Z
    //   6616: ifne -> 6689
    //   6619: goto -> 6626
    //   6622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6625: athrow
    //   6626: aload #8
    //   6628: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6631: ifnull -> 6689
    //   6634: goto -> 6641
    //   6637: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6640: athrow
    //   6641: aload #8
    //   6643: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6646: invokevirtual getName : ()Ljava/lang/String;
    //   6649: ifnull -> 6689
    //   6652: goto -> 6659
    //   6655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6658: athrow
    //   6659: aload #8
    //   6661: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6664: invokevirtual getName : ()Ljava/lang/String;
    //   6667: sipush #3823
    //   6670: sipush #-29875
    //   6673: invokestatic a : (II)Ljava/lang/String;
    //   6676: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6679: ifne -> 6689
    //   6682: goto -> 6689
    //   6685: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6688: athrow
    //   6689: aload #7
    //   6691: iconst_1
    //   6692: invokevirtual setAccessible : (Z)V
    //   6695: aload #7
    //   6697: aconst_null
    //   6698: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6701: pop
    //   6702: iinc #6, 1
    //   6705: iload_2
    //   6706: ifne -> 6567
    //   6709: sipush #3835
    //   6712: sipush #19867
    //   6715: invokestatic a : (II)Ljava/lang/String;
    //   6718: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6721: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6724: astore #4
    //   6726: aload #4
    //   6728: arraylength
    //   6729: istore #5
    //   6731: iconst_0
    //   6732: istore #6
    //   6734: iload #6
    //   6736: iload #5
    //   6738: if_icmpge -> 6874
    //   6741: aload #4
    //   6743: iload #6
    //   6745: aaload
    //   6746: astore #7
    //   6748: aload #7
    //   6750: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6753: pop
    //   6754: aload #7
    //   6756: invokevirtual getModifiers : ()I
    //   6759: invokestatic isStatic : (I)Z
    //   6762: ifeq -> 6860
    //   6765: aload #7
    //   6767: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6770: arraylength
    //   6771: iconst_2
    //   6772: if_icmpne -> 6860
    //   6775: goto -> 6782
    //   6778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6781: athrow
    //   6782: aload #7
    //   6784: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6787: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6790: if_acmpne -> 6860
    //   6793: goto -> 6800
    //   6796: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6799: athrow
    //   6800: aload #7
    //   6802: iconst_1
    //   6803: invokevirtual setAccessible : (Z)V
    //   6806: aload #7
    //   6808: aconst_null
    //   6809: iconst_2
    //   6810: anewarray java/lang/Object
    //   6813: dup
    //   6814: iconst_0
    //   6815: aload_0
    //   6816: aastore
    //   6817: dup
    //   6818: iconst_1
    //   6819: aload_1
    //   6820: ifnonnull -> 6838
    //   6823: goto -> 6830
    //   6826: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6829: athrow
    //   6830: aload_1
    //   6831: goto -> 6845
    //   6834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6837: athrow
    //   6838: aload_1
    //   6839: checkcast [B
    //   6842: invokevirtual clone : ()Ljava/lang/Object;
    //   6845: aastore
    //   6846: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6849: checkcast java/lang/Boolean
    //   6852: invokevirtual booleanValue : ()Z
    //   6855: istore_3
    //   6856: iload_2
    //   6857: ifne -> 6874
    //   6860: iinc #6, 1
    //   6863: iload_2
    //   6864: ifne -> 6734
    //   6867: goto -> 6874
    //   6870: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6873: athrow
    //   6874: iload_3
    //   6875: ireturn
    //   6876: astore_3
    //   6877: new java/lang/Exception
    //   6880: dup
    //   6881: aload_3
    //   6882: invokevirtual getMessage : ()Ljava/lang/String;
    //   6885: invokespecial <init> : (Ljava/lang/String;)V
    //   6888: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3956	6876	java/lang/Throwable
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
    //   3658	3672	3672	java/lang/Throwable
    //   3683	3696	3699	java/lang/Throwable
    //   3688	3711	3714	java/lang/Throwable
    //   3703	3729	3732	java/lang/Throwable
    //   3718	3759	3762	java/lang/Throwable
    //   3825	3852	3855	java/lang/Throwable
    //   3842	3870	3873	java/lang/Throwable
    //   3859	3900	3903	java/lang/Throwable
    //   3877	3911	3911	java/lang/Throwable
    //   3933	3944	3947	java/lang/Throwable
    //   3957	4687	6876	java/lang/Throwable
    //   4047	4061	4061	java/lang/Throwable
    //   4072	4085	4088	java/lang/Throwable
    //   4077	4100	4103	java/lang/Throwable
    //   4092	4118	4121	java/lang/Throwable
    //   4107	4148	4151	java/lang/Throwable
    //   4214	4241	4244	java/lang/Throwable
    //   4231	4259	4262	java/lang/Throwable
    //   4248	4289	4292	java/lang/Throwable
    //   4266	4300	4300	java/lang/Throwable
    //   4322	4333	4336	java/lang/Throwable
    //   4389	4403	4403	java/lang/Throwable
    //   4414	4427	4430	java/lang/Throwable
    //   4419	4442	4445	java/lang/Throwable
    //   4434	4460	4463	java/lang/Throwable
    //   4449	4490	4493	java/lang/Throwable
    //   4556	4583	4586	java/lang/Throwable
    //   4573	4601	4604	java/lang/Throwable
    //   4590	4631	4634	java/lang/Throwable
    //   4608	4642	4642	java/lang/Throwable
    //   4664	4675	4678	java/lang/Throwable
    //   4688	5418	6876	java/lang/Throwable
    //   4778	4792	4792	java/lang/Throwable
    //   4803	4816	4819	java/lang/Throwable
    //   4808	4831	4834	java/lang/Throwable
    //   4823	4849	4852	java/lang/Throwable
    //   4838	4879	4882	java/lang/Throwable
    //   4945	4972	4975	java/lang/Throwable
    //   4962	4990	4993	java/lang/Throwable
    //   4979	5020	5023	java/lang/Throwable
    //   4997	5031	5031	java/lang/Throwable
    //   5053	5064	5067	java/lang/Throwable
    //   5120	5134	5134	java/lang/Throwable
    //   5145	5158	5161	java/lang/Throwable
    //   5150	5173	5176	java/lang/Throwable
    //   5165	5191	5194	java/lang/Throwable
    //   5180	5221	5224	java/lang/Throwable
    //   5287	5314	5317	java/lang/Throwable
    //   5304	5332	5335	java/lang/Throwable
    //   5321	5362	5365	java/lang/Throwable
    //   5339	5373	5373	java/lang/Throwable
    //   5395	5406	5409	java/lang/Throwable
    //   5419	6148	6876	java/lang/Throwable
    //   5509	5523	5523	java/lang/Throwable
    //   5534	5547	5550	java/lang/Throwable
    //   5539	5562	5565	java/lang/Throwable
    //   5554	5580	5583	java/lang/Throwable
    //   5569	5610	5613	java/lang/Throwable
    //   5676	5703	5706	java/lang/Throwable
    //   5693	5721	5724	java/lang/Throwable
    //   5710	5751	5754	java/lang/Throwable
    //   5728	5762	5762	java/lang/Throwable
    //   5784	5795	5798	java/lang/Throwable
    //   5851	5865	5865	java/lang/Throwable
    //   5876	5889	5892	java/lang/Throwable
    //   5881	5904	5907	java/lang/Throwable
    //   5896	5922	5925	java/lang/Throwable
    //   5911	5952	5955	java/lang/Throwable
    //   6017	6044	6047	java/lang/Throwable
    //   6034	6062	6065	java/lang/Throwable
    //   6051	6092	6095	java/lang/Throwable
    //   6069	6103	6103	java/lang/Throwable
    //   6125	6136	6139	java/lang/Throwable
    //   6149	6875	6876	java/lang/Throwable
    //   6239	6253	6253	java/lang/Throwable
    //   6264	6277	6280	java/lang/Throwable
    //   6269	6292	6295	java/lang/Throwable
    //   6284	6310	6313	java/lang/Throwable
    //   6299	6340	6343	java/lang/Throwable
    //   6406	6433	6436	java/lang/Throwable
    //   6423	6451	6454	java/lang/Throwable
    //   6440	6481	6484	java/lang/Throwable
    //   6458	6492	6492	java/lang/Throwable
    //   6514	6525	6528	java/lang/Throwable
    //   6581	6595	6595	java/lang/Throwable
    //   6606	6619	6622	java/lang/Throwable
    //   6611	6634	6637	java/lang/Throwable
    //   6626	6652	6655	java/lang/Throwable
    //   6641	6682	6685	java/lang/Throwable
    //   6748	6775	6778	java/lang/Throwable
    //   6765	6793	6796	java/lang/Throwable
    //   6782	6823	6826	java/lang/Throwable
    //   6800	6834	6834	java/lang/Throwable
    //   6856	6867	6870	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '3ÁòR¨X¬$\\tî·4ä2X\\t5f2¦°Æ~\\tðG§Bfð'B!ÃËZDf0Ì¶\\tæï\\t¤ yö=]\\bE\\t¶¤¼bÙ^ dõ}îg"c3rHFã,Õþ?=\\r\ãZ]Ïz\\tûÄëòLä/¿8¹\\tO»}Y±¡ÐáMÁw¡+«ÕeJlóC>DZ;« U¸?Óò2xâñÍú',Mz¶­#§àIÀ#×E»7ø4UJÅ2[¬KÚ^Fâ{q-O¶\\tdWõ3çH\\t=*3/÷ZÄ (¥³cñEå+¯ðBß´0Á/x«ªq(X®Ùq;Ç\\t±ç\\\nß±\\tÃ ìnkßà\2\\tS\\rþË)k¹v\\tñ7T¨\\twZz!¹6¢pi\\t³-âÏªëÎ<\\tÕ3.\\f3ìH掠矣潬に柭ﺉꭊ쨯쥄絛䝎굥ꊚ鲉牸뜴錰㘟㒌燩ㄇӸ⍰ᢀԽމ耽늭ॵⱂᬡ婾刍혀⧟⾥厃_₨녑橵뻢䪴墻킮ꩵ䌻㍧䖻ɂ傻齢冠䃏銖㢳벮?ၘ춶ጇ弍䑢쑕纖摫ᦊ惒佑∥郓䘷렸?ஂ㨞䥠Ⓠ싖곜鄮㞬跏丳汱攉김멚┽᱕됻璧䮆讴烶뗤䢕愥垌蛀ᶓ颟椬躕鮝蝫츩⢩賊觔뿫䊺䇨⴯뀬뮬捹眮濕「柚﹥ꮬ쪲즘靖䟕괓ꋩ鱇爖럭鏽㘤㓫焅㇡ѥ⎬ᠳ֦߿聎닃বⲏᬚ嫇剪혷⤳⽃匞‛뇊樃뺑䩺壕큷ꪸ䌀㏞䗜ɵ偗龄儽䀓鈥㠨볘?႖쵯Ꮚ弶䓛쐲纡撇ᥬ恏侍⊖遈䙁롋?௬㫓䥛⑿슱곫釂㝰赼亨氇旇긮몃◰ᱮ뒂璐䭪譒火딸䠦慓埿蘎᷽顒椗踬鯺蝜컅⡏豗褈뽘䈡䆞ⵜ냢믂\\tABZåÎ\\t÷\\bAõn Yj\\txö´"#Ã\\ba¸Há½Ø\\të}éÅËªìû§'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #41
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
    //   68: ldc '%f Æð}ù\\bºv\\r\\b°û'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #114
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
    //   129: putstatic burp/Zl50.a : [Ljava/lang/String;
    //   132: bipush #32
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zl50.b : [Ljava/lang/String;
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
    //   217: bipush #127
    //   219: goto -> 244
    //   222: bipush #69
    //   224: goto -> 244
    //   227: bipush #34
    //   229: goto -> 244
    //   232: bipush #64
    //   234: goto -> 244
    //   237: bipush #126
    //   239: goto -> 244
    //   242: bipush #22
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
    //   311: bipush #112
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: iconst_1
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-26
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-28
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #89
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-88
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-9
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-22
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-58
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #11
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: iconst_3
    //   366: bastore
    //   367: dup
    //   368: bipush #11
    //   370: bipush #35
    //   372: bastore
    //   373: dup
    //   374: bipush #12
    //   376: bipush #-3
    //   378: bastore
    //   379: dup
    //   380: bipush #13
    //   382: bipush #-69
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #44
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #-106
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #-127
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #76
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #-78
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #74
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #-123
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #6
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #-104
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #-76
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #-54
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-69
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #31
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #-82
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #114
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-122
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #65
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: iconst_2
    //   491: bastore
    //   492: invokespecial <init> : (I[B)V
    //   495: putstatic burp/Zl50.ZV : Ljava/lang/Object;
    //   498: sipush #3816
    //   501: sipush #-27071
    //   504: invokestatic a : (II)Ljava/lang/String;
    //   507: putstatic burp/Zl50.Zm : Ljava/lang/String;
    //   510: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xEE6) & 0xFFFF;
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
      char c = 'ü';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl50.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */