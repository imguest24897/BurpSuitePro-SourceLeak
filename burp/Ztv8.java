package burp;

import java.math.BigInteger;

class Ztv8 extends ClassLoader {
  static Object ZS;
  
  static String ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Ze(Object paramObject) {
    Zlkm.ZH = a(1308, 6751);
    Zlkm.ZQ = new BigInteger(a(1291, 16881));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zkht.Zd.charAt(Math.abs(((BigInteger)Zbj.ZY).intValue() % 32)) <= Zg68.Zg.charAt(Math.abs(((BigInteger)Zkk2.Zq).intValue() % 32))) {
          try {
            Zzx8.ZM(Class.forName(a(1304, -846)));
            if (bool)
              Zgrf.Zt(Class.forName(a(1307, -31889))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgrf.Zt(Class.forName(a(1307, -31889)));
    } catch (Throwable throwable) {}
  }
  
  static void Zm(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zy(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: getstatic burp/Zsow.Zh : Ljava/lang/String;
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
    //   63: getstatic burp/Zb38.ZC : Ljava/lang/Object;
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
    //   131: sipush #1305
    //   134: sipush #30978
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
    //   1179: sipush #1297
    //   1182: sipush #-30853
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: invokespecial <init> : (Ljava/lang/String;)V
    //   1191: athrow
    //   1192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1195: athrow
    //   1196: bipush #10
    //   1198: istore #36
    //   1200: sipush #1306
    //   1203: sipush #256
    //   1206: newarray byte
    //   1208: astore #37
    //   1210: sipush #21177
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
    //   2518: putstatic burp/Zlo4.ZC : Ljava/lang/Object;
    //   2521: new java/io/ByteArrayOutputStream
    //   2524: dup
    //   2525: invokespecial <init> : ()V
    //   2528: astore_3
    //   2529: getstatic burp/Zkqx.Ze : Ljava/lang/String;
    //   2532: astore #4
    //   2534: iconst_0
    //   2535: istore #5
    //   2537: iload #5
    //   2539: aload #4
    //   2541: invokevirtual length : ()I
    //   2544: if_icmpge -> 2574
    //   2547: aload_3
    //   2548: aload #4
    //   2550: iload #5
    //   2552: iload #5
    //   2554: iconst_2
    //   2555: iadd
    //   2556: invokevirtual substring : (II)Ljava/lang/String;
    //   2559: bipush #16
    //   2561: invokestatic parseInt : (Ljava/lang/String;I)I
    //   2564: invokevirtual write : (I)V
    //   2567: iinc #5, 2
    //   2570: iload_2
    //   2571: ifeq -> 2537
    //   2574: aload_3
    //   2575: invokevirtual toByteArray : ()[B
    //   2578: astore #5
    //   2580: getstatic burp/Zzh1.Zf : Ljava/lang/Object;
    //   2583: checkcast java/math/BigInteger
    //   2586: invokevirtual toByteArray : ()[B
    //   2589: astore #6
    //   2591: sipush #256
    //   2594: newarray byte
    //   2596: astore #8
    //   2598: sipush #256
    //   2601: newarray int
    //   2603: astore #9
    //   2605: sipush #256
    //   2608: newarray int
    //   2610: astore #10
    //   2612: sipush #256
    //   2615: newarray int
    //   2617: astore #11
    //   2619: sipush #256
    //   2622: newarray int
    //   2624: astore #12
    //   2626: bipush #10
    //   2628: newarray int
    //   2630: astore #13
    //   2632: sipush #283
    //   2635: istore #14
    //   2637: iconst_0
    //   2638: istore #16
    //   2640: iload #16
    //   2642: sipush #256
    //   2645: if_icmpge -> 2879
    //   2648: sipush #1306
    //   2651: sipush #21177
    //   2654: invokestatic a : (II)Ljava/lang/String;
    //   2657: iload #16
    //   2659: iconst_1
    //   2660: iushr
    //   2661: invokevirtual charAt : (I)C
    //   2664: istore #25
    //   2666: iload #16
    //   2668: iconst_1
    //   2669: iand
    //   2670: ifne -> 2685
    //   2673: iload #25
    //   2675: bipush #8
    //   2677: iushr
    //   2678: goto -> 2687
    //   2681: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2684: athrow
    //   2685: iload #25
    //   2687: i2b
    //   2688: sipush #255
    //   2691: iand
    //   2692: istore #15
    //   2694: iload #16
    //   2696: iconst_1
    //   2697: ishl
    //   2698: istore #17
    //   2700: iload #17
    //   2702: sipush #256
    //   2705: if_icmplt -> 2715
    //   2708: iload #17
    //   2710: iload #14
    //   2712: ixor
    //   2713: istore #17
    //   2715: iload #17
    //   2717: iconst_1
    //   2718: ishl
    //   2719: istore #18
    //   2721: iload #18
    //   2723: sipush #256
    //   2726: if_icmplt -> 2736
    //   2729: iload #18
    //   2731: iload #14
    //   2733: ixor
    //   2734: istore #18
    //   2736: iload #18
    //   2738: iconst_1
    //   2739: ishl
    //   2740: istore #19
    //   2742: iload #19
    //   2744: sipush #256
    //   2747: if_icmplt -> 2757
    //   2750: iload #19
    //   2752: iload #14
    //   2754: ixor
    //   2755: istore #19
    //   2757: iload #19
    //   2759: iload #16
    //   2761: ixor
    //   2762: istore #20
    //   2764: iload #20
    //   2766: iload #17
    //   2768: ixor
    //   2769: istore #21
    //   2771: iload #20
    //   2773: iload #18
    //   2775: ixor
    //   2776: istore #22
    //   2778: iload #19
    //   2780: iload #18
    //   2782: ixor
    //   2783: iload #17
    //   2785: ixor
    //   2786: istore #23
    //   2788: aload #8
    //   2790: iload #16
    //   2792: iload #15
    //   2794: i2b
    //   2795: bastore
    //   2796: aload #9
    //   2798: iload #15
    //   2800: iload #23
    //   2802: bipush #24
    //   2804: ishl
    //   2805: iload #20
    //   2807: bipush #16
    //   2809: ishl
    //   2810: ior
    //   2811: iload #22
    //   2813: bipush #8
    //   2815: ishl
    //   2816: ior
    //   2817: iload #21
    //   2819: ior
    //   2820: dup
    //   2821: istore #24
    //   2823: iastore
    //   2824: aload #10
    //   2826: iload #15
    //   2828: iload #24
    //   2830: bipush #8
    //   2832: iushr
    //   2833: iload #24
    //   2835: bipush #24
    //   2837: ishl
    //   2838: ior
    //   2839: iastore
    //   2840: aload #11
    //   2842: iload #15
    //   2844: iload #24
    //   2846: bipush #16
    //   2848: iushr
    //   2849: iload #24
    //   2851: bipush #16
    //   2853: ishl
    //   2854: ior
    //   2855: iastore
    //   2856: aload #12
    //   2858: iload #15
    //   2860: iload #24
    //   2862: bipush #24
    //   2864: iushr
    //   2865: iload #24
    //   2867: bipush #8
    //   2869: ishl
    //   2870: ior
    //   2871: iastore
    //   2872: iinc #16, 1
    //   2875: iload_2
    //   2876: ifeq -> 2640
    //   2879: iconst_1
    //   2880: istore #25
    //   2882: aload #13
    //   2884: iconst_0
    //   2885: iload #25
    //   2887: bipush #24
    //   2889: ishl
    //   2890: iastore
    //   2891: iconst_1
    //   2892: istore #26
    //   2894: iload #26
    //   2896: bipush #10
    //   2898: if_icmpge -> 2939
    //   2901: iload #25
    //   2903: iconst_1
    //   2904: ishl
    //   2905: istore #25
    //   2907: iload #25
    //   2909: sipush #256
    //   2912: if_icmplt -> 2922
    //   2915: iload #25
    //   2917: iload #14
    //   2919: ixor
    //   2920: istore #25
    //   2922: aload #13
    //   2924: iload #26
    //   2926: iload #25
    //   2928: bipush #24
    //   2930: ishl
    //   2931: iastore
    //   2932: iinc #26, 1
    //   2935: iload_2
    //   2936: ifeq -> 2894
    //   2939: iconst_4
    //   2940: istore #26
    //   2942: iload #26
    //   2944: bipush #6
    //   2946: iadd
    //   2947: istore #27
    //   2949: iconst_4
    //   2950: iload #27
    //   2952: iconst_1
    //   2953: iadd
    //   2954: imul
    //   2955: istore #28
    //   2957: iload #28
    //   2959: newarray int
    //   2961: astore #29
    //   2963: iload #28
    //   2965: newarray int
    //   2967: astore #30
    //   2969: iconst_0
    //   2970: istore #25
    //   2972: iconst_0
    //   2973: istore #32
    //   2975: iconst_0
    //   2976: istore #33
    //   2978: iload #32
    //   2980: iload #26
    //   2982: if_icmpge -> 3050
    //   2985: aload #29
    //   2987: iload #32
    //   2989: aload #5
    //   2991: iload #33
    //   2993: baload
    //   2994: bipush #24
    //   2996: ishl
    //   2997: aload #5
    //   2999: iload #33
    //   3001: iconst_1
    //   3002: iadd
    //   3003: baload
    //   3004: sipush #255
    //   3007: iand
    //   3008: bipush #16
    //   3010: ishl
    //   3011: ior
    //   3012: aload #5
    //   3014: iload #33
    //   3016: iconst_2
    //   3017: iadd
    //   3018: baload
    //   3019: sipush #255
    //   3022: iand
    //   3023: bipush #8
    //   3025: ishl
    //   3026: ior
    //   3027: aload #5
    //   3029: iload #33
    //   3031: iconst_3
    //   3032: iadd
    //   3033: baload
    //   3034: sipush #255
    //   3037: iand
    //   3038: ior
    //   3039: iastore
    //   3040: iinc #32, 1
    //   3043: iinc #33, 4
    //   3046: iload_2
    //   3047: ifeq -> 2978
    //   3050: iload #26
    //   3052: istore #32
    //   3054: iconst_0
    //   3055: istore #33
    //   3057: iload #32
    //   3059: iload #28
    //   3061: if_icmpge -> 3188
    //   3064: aload #29
    //   3066: iload #32
    //   3068: iconst_1
    //   3069: isub
    //   3070: iaload
    //   3071: istore #31
    //   3073: iload #33
    //   3075: ifne -> 3162
    //   3078: iload #26
    //   3080: istore #33
    //   3082: aload #8
    //   3084: iload #31
    //   3086: bipush #16
    //   3088: iushr
    //   3089: sipush #255
    //   3092: iand
    //   3093: baload
    //   3094: bipush #24
    //   3096: ishl
    //   3097: aload #8
    //   3099: iload #31
    //   3101: bipush #8
    //   3103: iushr
    //   3104: sipush #255
    //   3107: iand
    //   3108: baload
    //   3109: sipush #255
    //   3112: iand
    //   3113: bipush #16
    //   3115: ishl
    //   3116: ior
    //   3117: aload #8
    //   3119: iload #31
    //   3121: sipush #255
    //   3124: iand
    //   3125: baload
    //   3126: sipush #255
    //   3129: iand
    //   3130: bipush #8
    //   3132: ishl
    //   3133: ior
    //   3134: aload #8
    //   3136: iload #31
    //   3138: bipush #24
    //   3140: iushr
    //   3141: baload
    //   3142: sipush #255
    //   3145: iand
    //   3146: ior
    //   3147: istore #31
    //   3149: iload #31
    //   3151: aload #13
    //   3153: iload #25
    //   3155: iinc #25, 1
    //   3158: iaload
    //   3159: ixor
    //   3160: istore #31
    //   3162: aload #29
    //   3164: iload #32
    //   3166: aload #29
    //   3168: iload #32
    //   3170: iload #26
    //   3172: isub
    //   3173: iaload
    //   3174: iload #31
    //   3176: ixor
    //   3177: iastore
    //   3178: iinc #32, 1
    //   3181: iinc #33, -1
    //   3184: iload_2
    //   3185: ifeq -> 3057
    //   3188: iconst_0
    //   3189: istore #32
    //   3191: iconst_4
    //   3192: iload #27
    //   3194: imul
    //   3195: istore #33
    //   3197: aload #30
    //   3199: iload #32
    //   3201: aload #29
    //   3203: iload #33
    //   3205: iaload
    //   3206: iastore
    //   3207: aload #30
    //   3209: iload #32
    //   3211: iconst_1
    //   3212: iadd
    //   3213: aload #29
    //   3215: iload #33
    //   3217: iconst_1
    //   3218: iadd
    //   3219: iaload
    //   3220: iastore
    //   3221: aload #30
    //   3223: iload #32
    //   3225: iconst_2
    //   3226: iadd
    //   3227: aload #29
    //   3229: iload #33
    //   3231: iconst_2
    //   3232: iadd
    //   3233: iaload
    //   3234: iastore
    //   3235: aload #30
    //   3237: iload #32
    //   3239: iconst_3
    //   3240: iadd
    //   3241: aload #29
    //   3243: iload #33
    //   3245: iconst_3
    //   3246: iadd
    //   3247: iaload
    //   3248: iastore
    //   3249: iinc #32, 4
    //   3252: iinc #33, -4
    //   3255: iconst_1
    //   3256: istore #35
    //   3258: iload #35
    //   3260: iload #27
    //   3262: if_icmpge -> 3626
    //   3265: aload #29
    //   3267: iload #33
    //   3269: iaload
    //   3270: istore #34
    //   3272: aload #30
    //   3274: iload #32
    //   3276: aload #9
    //   3278: aload #8
    //   3280: iload #34
    //   3282: bipush #24
    //   3284: iushr
    //   3285: baload
    //   3286: sipush #255
    //   3289: iand
    //   3290: iaload
    //   3291: aload #10
    //   3293: aload #8
    //   3295: iload #34
    //   3297: bipush #16
    //   3299: iushr
    //   3300: sipush #255
    //   3303: iand
    //   3304: baload
    //   3305: sipush #255
    //   3308: iand
    //   3309: iaload
    //   3310: ixor
    //   3311: aload #11
    //   3313: aload #8
    //   3315: iload #34
    //   3317: bipush #8
    //   3319: iushr
    //   3320: sipush #255
    //   3323: iand
    //   3324: baload
    //   3325: sipush #255
    //   3328: iand
    //   3329: iaload
    //   3330: ixor
    //   3331: aload #12
    //   3333: aload #8
    //   3335: iload #34
    //   3337: sipush #255
    //   3340: iand
    //   3341: baload
    //   3342: sipush #255
    //   3345: iand
    //   3346: iaload
    //   3347: ixor
    //   3348: iastore
    //   3349: aload #29
    //   3351: iload #33
    //   3353: iconst_1
    //   3354: iadd
    //   3355: iaload
    //   3356: istore #34
    //   3358: aload #30
    //   3360: iload #32
    //   3362: iconst_1
    //   3363: iadd
    //   3364: aload #9
    //   3366: aload #8
    //   3368: iload #34
    //   3370: bipush #24
    //   3372: iushr
    //   3373: baload
    //   3374: sipush #255
    //   3377: iand
    //   3378: iaload
    //   3379: aload #10
    //   3381: aload #8
    //   3383: iload #34
    //   3385: bipush #16
    //   3387: iushr
    //   3388: sipush #255
    //   3391: iand
    //   3392: baload
    //   3393: sipush #255
    //   3396: iand
    //   3397: iaload
    //   3398: ixor
    //   3399: aload #11
    //   3401: aload #8
    //   3403: iload #34
    //   3405: bipush #8
    //   3407: iushr
    //   3408: sipush #255
    //   3411: iand
    //   3412: baload
    //   3413: sipush #255
    //   3416: iand
    //   3417: iaload
    //   3418: ixor
    //   3419: aload #12
    //   3421: aload #8
    //   3423: iload #34
    //   3425: sipush #255
    //   3428: iand
    //   3429: baload
    //   3430: sipush #255
    //   3433: iand
    //   3434: iaload
    //   3435: ixor
    //   3436: iastore
    //   3437: aload #29
    //   3439: iload #33
    //   3441: iconst_2
    //   3442: iadd
    //   3443: iaload
    //   3444: istore #34
    //   3446: aload #30
    //   3448: iload #32
    //   3450: iconst_2
    //   3451: iadd
    //   3452: aload #9
    //   3454: aload #8
    //   3456: iload #34
    //   3458: bipush #24
    //   3460: iushr
    //   3461: baload
    //   3462: sipush #255
    //   3465: iand
    //   3466: iaload
    //   3467: aload #10
    //   3469: aload #8
    //   3471: iload #34
    //   3473: bipush #16
    //   3475: iushr
    //   3476: sipush #255
    //   3479: iand
    //   3480: baload
    //   3481: sipush #255
    //   3484: iand
    //   3485: iaload
    //   3486: ixor
    //   3487: aload #11
    //   3489: aload #8
    //   3491: iload #34
    //   3493: bipush #8
    //   3495: iushr
    //   3496: sipush #255
    //   3499: iand
    //   3500: baload
    //   3501: sipush #255
    //   3504: iand
    //   3505: iaload
    //   3506: ixor
    //   3507: aload #12
    //   3509: aload #8
    //   3511: iload #34
    //   3513: sipush #255
    //   3516: iand
    //   3517: baload
    //   3518: sipush #255
    //   3521: iand
    //   3522: iaload
    //   3523: ixor
    //   3524: iastore
    //   3525: aload #29
    //   3527: iload #33
    //   3529: iconst_3
    //   3530: iadd
    //   3531: iaload
    //   3532: istore #34
    //   3534: aload #30
    //   3536: iload #32
    //   3538: iconst_3
    //   3539: iadd
    //   3540: aload #9
    //   3542: aload #8
    //   3544: iload #34
    //   3546: bipush #24
    //   3548: iushr
    //   3549: baload
    //   3550: sipush #255
    //   3553: iand
    //   3554: iaload
    //   3555: aload #10
    //   3557: aload #8
    //   3559: iload #34
    //   3561: bipush #16
    //   3563: iushr
    //   3564: sipush #255
    //   3567: iand
    //   3568: baload
    //   3569: sipush #255
    //   3572: iand
    //   3573: iaload
    //   3574: ixor
    //   3575: aload #11
    //   3577: aload #8
    //   3579: iload #34
    //   3581: bipush #8
    //   3583: iushr
    //   3584: sipush #255
    //   3587: iand
    //   3588: baload
    //   3589: sipush #255
    //   3592: iand
    //   3593: iaload
    //   3594: ixor
    //   3595: aload #12
    //   3597: aload #8
    //   3599: iload #34
    //   3601: sipush #255
    //   3604: iand
    //   3605: baload
    //   3606: sipush #255
    //   3609: iand
    //   3610: iaload
    //   3611: ixor
    //   3612: iastore
    //   3613: iinc #32, 4
    //   3616: iinc #33, -4
    //   3619: iinc #35, 1
    //   3622: iload_2
    //   3623: ifeq -> 3258
    //   3626: aload #30
    //   3628: iload #32
    //   3630: aload #29
    //   3632: iload #33
    //   3634: iaload
    //   3635: iastore
    //   3636: aload #30
    //   3638: iload #32
    //   3640: iconst_1
    //   3641: iadd
    //   3642: aload #29
    //   3644: iload #33
    //   3646: iconst_1
    //   3647: iadd
    //   3648: iaload
    //   3649: iastore
    //   3650: aload #30
    //   3652: iload #32
    //   3654: iconst_2
    //   3655: iadd
    //   3656: aload #29
    //   3658: iload #33
    //   3660: iconst_2
    //   3661: iadd
    //   3662: iaload
    //   3663: iastore
    //   3664: aload #30
    //   3666: iload #32
    //   3668: iconst_3
    //   3669: iadd
    //   3670: aload #29
    //   3672: iload #33
    //   3674: iconst_3
    //   3675: iadd
    //   3676: iaload
    //   3677: iastore
    //   3678: iconst_0
    //   3679: newarray byte
    //   3681: astore #35
    //   3683: aload #6
    //   3685: arraylength
    //   3686: bipush #16
    //   3688: irem
    //   3689: ifeq -> 3713
    //   3692: new java/lang/Exception
    //   3695: dup
    //   3696: sipush #1290
    //   3699: sipush #20989
    //   3702: invokestatic a : (II)Ljava/lang/String;
    //   3705: invokespecial <init> : (Ljava/lang/String;)V
    //   3708: athrow
    //   3709: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3712: athrow
    //   3713: bipush #10
    //   3715: istore #36
    //   3717: sipush #1306
    //   3720: sipush #256
    //   3723: newarray byte
    //   3725: astore #37
    //   3727: sipush #21177
    //   3730: sipush #256
    //   3733: newarray int
    //   3735: astore #38
    //   3737: sipush #256
    //   3740: newarray int
    //   3742: astore #39
    //   3744: sipush #256
    //   3747: newarray int
    //   3749: astore #40
    //   3751: sipush #256
    //   3754: newarray int
    //   3756: astore #41
    //   3758: sipush #283
    //   3761: istore #14
    //   3763: invokestatic a : (II)Ljava/lang/String;
    //   3766: astore #42
    //   3768: iconst_0
    //   3769: istore #16
    //   3771: iload #16
    //   3773: sipush #256
    //   3776: if_icmpge -> 4003
    //   3779: aload #42
    //   3781: iload #16
    //   3783: iconst_1
    //   3784: iushr
    //   3785: invokevirtual charAt : (I)C
    //   3788: istore #43
    //   3790: iload #16
    //   3792: iconst_1
    //   3793: iand
    //   3794: ifne -> 3809
    //   3797: iload #43
    //   3799: bipush #8
    //   3801: iushr
    //   3802: goto -> 3811
    //   3805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3808: athrow
    //   3809: iload #43
    //   3811: i2b
    //   3812: sipush #255
    //   3815: iand
    //   3816: istore #15
    //   3818: iload #16
    //   3820: iconst_1
    //   3821: ishl
    //   3822: istore #17
    //   3824: iload #17
    //   3826: sipush #256
    //   3829: if_icmplt -> 3839
    //   3832: iload #17
    //   3834: iload #14
    //   3836: ixor
    //   3837: istore #17
    //   3839: iload #17
    //   3841: iconst_1
    //   3842: ishl
    //   3843: istore #18
    //   3845: iload #18
    //   3847: sipush #256
    //   3850: if_icmplt -> 3860
    //   3853: iload #18
    //   3855: iload #14
    //   3857: ixor
    //   3858: istore #18
    //   3860: iload #18
    //   3862: iconst_1
    //   3863: ishl
    //   3864: istore #19
    //   3866: iload #19
    //   3868: sipush #256
    //   3871: if_icmplt -> 3881
    //   3874: iload #19
    //   3876: iload #14
    //   3878: ixor
    //   3879: istore #19
    //   3881: iload #19
    //   3883: iload #16
    //   3885: ixor
    //   3886: istore #20
    //   3888: iload #20
    //   3890: iload #17
    //   3892: ixor
    //   3893: istore #21
    //   3895: iload #20
    //   3897: iload #18
    //   3899: ixor
    //   3900: istore #22
    //   3902: iload #19
    //   3904: iload #18
    //   3906: ixor
    //   3907: iload #17
    //   3909: ixor
    //   3910: istore #23
    //   3912: aload #37
    //   3914: iload #15
    //   3916: iload #16
    //   3918: i2b
    //   3919: bastore
    //   3920: aload #38
    //   3922: iload #15
    //   3924: iload #23
    //   3926: bipush #24
    //   3928: ishl
    //   3929: iload #20
    //   3931: bipush #16
    //   3933: ishl
    //   3934: ior
    //   3935: iload #22
    //   3937: bipush #8
    //   3939: ishl
    //   3940: ior
    //   3941: iload #21
    //   3943: ior
    //   3944: dup
    //   3945: istore #24
    //   3947: iastore
    //   3948: aload #39
    //   3950: iload #15
    //   3952: iload #24
    //   3954: bipush #8
    //   3956: iushr
    //   3957: iload #24
    //   3959: bipush #24
    //   3961: ishl
    //   3962: ior
    //   3963: iastore
    //   3964: aload #40
    //   3966: iload #15
    //   3968: iload #24
    //   3970: bipush #16
    //   3972: iushr
    //   3973: iload #24
    //   3975: bipush #16
    //   3977: ishl
    //   3978: ior
    //   3979: iastore
    //   3980: aload #41
    //   3982: iload #15
    //   3984: iload #24
    //   3986: bipush #24
    //   3988: iushr
    //   3989: iload #24
    //   3991: bipush #8
    //   3993: ishl
    //   3994: ior
    //   3995: iastore
    //   3996: iinc #16, 1
    //   3999: iload_2
    //   4000: ifeq -> 3771
    //   4003: aload #6
    //   4005: arraylength
    //   4006: newarray byte
    //   4008: astore #43
    //   4010: iconst_0
    //   4011: istore #44
    //   4013: iload #44
    //   4015: aload #6
    //   4017: arraylength
    //   4018: bipush #16
    //   4020: idiv
    //   4021: if_icmpge -> 4935
    //   4024: bipush #16
    //   4026: newarray byte
    //   4028: astore #45
    //   4030: bipush #16
    //   4032: newarray byte
    //   4034: astore #46
    //   4036: iconst_0
    //   4037: istore #47
    //   4039: iload #47
    //   4041: bipush #16
    //   4043: if_icmpge -> 4069
    //   4046: aload #45
    //   4048: iload #47
    //   4050: aload #6
    //   4052: iload #47
    //   4054: iload #44
    //   4056: bipush #16
    //   4058: imul
    //   4059: iadd
    //   4060: baload
    //   4061: bastore
    //   4062: iinc #47, 1
    //   4065: iload_2
    //   4066: ifeq -> 4039
    //   4069: iconst_0
    //   4070: istore #47
    //   4072: aload #45
    //   4074: iconst_0
    //   4075: baload
    //   4076: bipush #24
    //   4078: ishl
    //   4079: aload #45
    //   4081: iconst_1
    //   4082: baload
    //   4083: sipush #255
    //   4086: iand
    //   4087: bipush #16
    //   4089: ishl
    //   4090: ior
    //   4091: aload #45
    //   4093: iconst_2
    //   4094: baload
    //   4095: sipush #255
    //   4098: iand
    //   4099: bipush #8
    //   4101: ishl
    //   4102: ior
    //   4103: aload #45
    //   4105: iconst_3
    //   4106: baload
    //   4107: sipush #255
    //   4110: iand
    //   4111: ior
    //   4112: aload #30
    //   4114: iconst_0
    //   4115: iaload
    //   4116: ixor
    //   4117: istore #49
    //   4119: aload #45
    //   4121: iconst_4
    //   4122: baload
    //   4123: bipush #24
    //   4125: ishl
    //   4126: aload #45
    //   4128: iconst_5
    //   4129: baload
    //   4130: sipush #255
    //   4133: iand
    //   4134: bipush #16
    //   4136: ishl
    //   4137: ior
    //   4138: aload #45
    //   4140: bipush #6
    //   4142: baload
    //   4143: sipush #255
    //   4146: iand
    //   4147: bipush #8
    //   4149: ishl
    //   4150: ior
    //   4151: aload #45
    //   4153: bipush #7
    //   4155: baload
    //   4156: sipush #255
    //   4159: iand
    //   4160: ior
    //   4161: aload #30
    //   4163: iconst_1
    //   4164: iaload
    //   4165: ixor
    //   4166: istore #50
    //   4168: aload #45
    //   4170: bipush #8
    //   4172: baload
    //   4173: bipush #24
    //   4175: ishl
    //   4176: aload #45
    //   4178: bipush #9
    //   4180: baload
    //   4181: sipush #255
    //   4184: iand
    //   4185: bipush #16
    //   4187: ishl
    //   4188: ior
    //   4189: aload #45
    //   4191: bipush #10
    //   4193: baload
    //   4194: sipush #255
    //   4197: iand
    //   4198: bipush #8
    //   4200: ishl
    //   4201: ior
    //   4202: aload #45
    //   4204: bipush #11
    //   4206: baload
    //   4207: sipush #255
    //   4210: iand
    //   4211: ior
    //   4212: aload #30
    //   4214: iconst_2
    //   4215: iaload
    //   4216: ixor
    //   4217: istore #51
    //   4219: aload #45
    //   4221: bipush #12
    //   4223: baload
    //   4224: bipush #24
    //   4226: ishl
    //   4227: aload #45
    //   4229: bipush #13
    //   4231: baload
    //   4232: sipush #255
    //   4235: iand
    //   4236: bipush #16
    //   4238: ishl
    //   4239: ior
    //   4240: aload #45
    //   4242: bipush #14
    //   4244: baload
    //   4245: sipush #255
    //   4248: iand
    //   4249: bipush #8
    //   4251: ishl
    //   4252: ior
    //   4253: aload #45
    //   4255: bipush #15
    //   4257: baload
    //   4258: sipush #255
    //   4261: iand
    //   4262: ior
    //   4263: aload #30
    //   4265: iconst_3
    //   4266: iaload
    //   4267: ixor
    //   4268: istore #52
    //   4270: iconst_1
    //   4271: istore #53
    //   4273: iload #53
    //   4275: iload #36
    //   4277: if_icmpge -> 4520
    //   4280: iinc #47, 4
    //   4283: aload #38
    //   4285: iload #49
    //   4287: bipush #24
    //   4289: iushr
    //   4290: iaload
    //   4291: aload #39
    //   4293: iload #52
    //   4295: bipush #16
    //   4297: iushr
    //   4298: sipush #255
    //   4301: iand
    //   4302: iaload
    //   4303: ixor
    //   4304: aload #40
    //   4306: iload #51
    //   4308: bipush #8
    //   4310: iushr
    //   4311: sipush #255
    //   4314: iand
    //   4315: iaload
    //   4316: ixor
    //   4317: aload #41
    //   4319: iload #50
    //   4321: sipush #255
    //   4324: iand
    //   4325: iaload
    //   4326: ixor
    //   4327: aload #30
    //   4329: iload #47
    //   4331: iaload
    //   4332: ixor
    //   4333: istore #54
    //   4335: aload #38
    //   4337: iload #50
    //   4339: bipush #24
    //   4341: iushr
    //   4342: iaload
    //   4343: aload #39
    //   4345: iload #49
    //   4347: bipush #16
    //   4349: iushr
    //   4350: sipush #255
    //   4353: iand
    //   4354: iaload
    //   4355: ixor
    //   4356: aload #40
    //   4358: iload #52
    //   4360: bipush #8
    //   4362: iushr
    //   4363: sipush #255
    //   4366: iand
    //   4367: iaload
    //   4368: ixor
    //   4369: aload #41
    //   4371: iload #51
    //   4373: sipush #255
    //   4376: iand
    //   4377: iaload
    //   4378: ixor
    //   4379: aload #30
    //   4381: iload #47
    //   4383: iconst_1
    //   4384: iadd
    //   4385: iaload
    //   4386: ixor
    //   4387: istore #55
    //   4389: aload #38
    //   4391: iload #51
    //   4393: bipush #24
    //   4395: iushr
    //   4396: iaload
    //   4397: aload #39
    //   4399: iload #50
    //   4401: bipush #16
    //   4403: iushr
    //   4404: sipush #255
    //   4407: iand
    //   4408: iaload
    //   4409: ixor
    //   4410: aload #40
    //   4412: iload #49
    //   4414: bipush #8
    //   4416: iushr
    //   4417: sipush #255
    //   4420: iand
    //   4421: iaload
    //   4422: ixor
    //   4423: aload #41
    //   4425: iload #52
    //   4427: sipush #255
    //   4430: iand
    //   4431: iaload
    //   4432: ixor
    //   4433: aload #30
    //   4435: iload #47
    //   4437: iconst_2
    //   4438: iadd
    //   4439: iaload
    //   4440: ixor
    //   4441: istore #56
    //   4443: aload #38
    //   4445: iload #52
    //   4447: bipush #24
    //   4449: iushr
    //   4450: iaload
    //   4451: aload #39
    //   4453: iload #51
    //   4455: bipush #16
    //   4457: iushr
    //   4458: sipush #255
    //   4461: iand
    //   4462: iaload
    //   4463: ixor
    //   4464: aload #40
    //   4466: iload #50
    //   4468: bipush #8
    //   4470: iushr
    //   4471: sipush #255
    //   4474: iand
    //   4475: iaload
    //   4476: ixor
    //   4477: aload #41
    //   4479: iload #49
    //   4481: sipush #255
    //   4484: iand
    //   4485: iaload
    //   4486: ixor
    //   4487: aload #30
    //   4489: iload #47
    //   4491: iconst_3
    //   4492: iadd
    //   4493: iaload
    //   4494: ixor
    //   4495: istore #57
    //   4497: iload #54
    //   4499: istore #49
    //   4501: iload #55
    //   4503: istore #50
    //   4505: iload #56
    //   4507: istore #51
    //   4509: iload #57
    //   4511: istore #52
    //   4513: iinc #53, 1
    //   4516: iload_2
    //   4517: ifeq -> 4273
    //   4520: iinc #47, 4
    //   4523: aload #30
    //   4525: iload #47
    //   4527: iaload
    //   4528: istore #48
    //   4530: aload #46
    //   4532: iconst_0
    //   4533: aload #37
    //   4535: iload #49
    //   4537: bipush #24
    //   4539: iushr
    //   4540: baload
    //   4541: iload #48
    //   4543: bipush #24
    //   4545: iushr
    //   4546: ixor
    //   4547: i2b
    //   4548: bastore
    //   4549: aload #46
    //   4551: iconst_1
    //   4552: aload #37
    //   4554: iload #52
    //   4556: bipush #16
    //   4558: iushr
    //   4559: sipush #255
    //   4562: iand
    //   4563: baload
    //   4564: iload #48
    //   4566: bipush #16
    //   4568: iushr
    //   4569: ixor
    //   4570: i2b
    //   4571: bastore
    //   4572: aload #46
    //   4574: iconst_2
    //   4575: aload #37
    //   4577: iload #51
    //   4579: bipush #8
    //   4581: iushr
    //   4582: sipush #255
    //   4585: iand
    //   4586: baload
    //   4587: iload #48
    //   4589: bipush #8
    //   4591: iushr
    //   4592: ixor
    //   4593: i2b
    //   4594: bastore
    //   4595: aload #46
    //   4597: iconst_3
    //   4598: aload #37
    //   4600: iload #50
    //   4602: sipush #255
    //   4605: iand
    //   4606: baload
    //   4607: iload #48
    //   4609: ixor
    //   4610: i2b
    //   4611: bastore
    //   4612: aload #30
    //   4614: iload #47
    //   4616: iconst_1
    //   4617: iadd
    //   4618: iaload
    //   4619: istore #48
    //   4621: aload #46
    //   4623: iconst_4
    //   4624: aload #37
    //   4626: iload #50
    //   4628: bipush #24
    //   4630: iushr
    //   4631: baload
    //   4632: iload #48
    //   4634: bipush #24
    //   4636: iushr
    //   4637: ixor
    //   4638: i2b
    //   4639: bastore
    //   4640: aload #46
    //   4642: iconst_5
    //   4643: aload #37
    //   4645: iload #49
    //   4647: bipush #16
    //   4649: iushr
    //   4650: sipush #255
    //   4653: iand
    //   4654: baload
    //   4655: iload #48
    //   4657: bipush #16
    //   4659: iushr
    //   4660: ixor
    //   4661: i2b
    //   4662: bastore
    //   4663: aload #46
    //   4665: bipush #6
    //   4667: aload #37
    //   4669: iload #52
    //   4671: bipush #8
    //   4673: iushr
    //   4674: sipush #255
    //   4677: iand
    //   4678: baload
    //   4679: iload #48
    //   4681: bipush #8
    //   4683: iushr
    //   4684: ixor
    //   4685: i2b
    //   4686: bastore
    //   4687: aload #46
    //   4689: bipush #7
    //   4691: aload #37
    //   4693: iload #51
    //   4695: sipush #255
    //   4698: iand
    //   4699: baload
    //   4700: iload #48
    //   4702: ixor
    //   4703: i2b
    //   4704: bastore
    //   4705: aload #30
    //   4707: iload #47
    //   4709: iconst_2
    //   4710: iadd
    //   4711: iaload
    //   4712: istore #48
    //   4714: aload #46
    //   4716: bipush #8
    //   4718: aload #37
    //   4720: iload #51
    //   4722: bipush #24
    //   4724: iushr
    //   4725: baload
    //   4726: iload #48
    //   4728: bipush #24
    //   4730: iushr
    //   4731: ixor
    //   4732: i2b
    //   4733: bastore
    //   4734: aload #46
    //   4736: bipush #9
    //   4738: aload #37
    //   4740: iload #50
    //   4742: bipush #16
    //   4744: iushr
    //   4745: sipush #255
    //   4748: iand
    //   4749: baload
    //   4750: iload #48
    //   4752: bipush #16
    //   4754: iushr
    //   4755: ixor
    //   4756: i2b
    //   4757: bastore
    //   4758: aload #46
    //   4760: bipush #10
    //   4762: aload #37
    //   4764: iload #49
    //   4766: bipush #8
    //   4768: iushr
    //   4769: sipush #255
    //   4772: iand
    //   4773: baload
    //   4774: iload #48
    //   4776: bipush #8
    //   4778: iushr
    //   4779: ixor
    //   4780: i2b
    //   4781: bastore
    //   4782: aload #46
    //   4784: bipush #11
    //   4786: aload #37
    //   4788: iload #52
    //   4790: sipush #255
    //   4793: iand
    //   4794: baload
    //   4795: iload #48
    //   4797: ixor
    //   4798: i2b
    //   4799: bastore
    //   4800: aload #30
    //   4802: iload #47
    //   4804: iconst_3
    //   4805: iadd
    //   4806: iaload
    //   4807: istore #48
    //   4809: aload #46
    //   4811: bipush #12
    //   4813: aload #37
    //   4815: iload #52
    //   4817: bipush #24
    //   4819: iushr
    //   4820: baload
    //   4821: iload #48
    //   4823: bipush #24
    //   4825: iushr
    //   4826: ixor
    //   4827: i2b
    //   4828: bastore
    //   4829: aload #46
    //   4831: bipush #13
    //   4833: aload #37
    //   4835: iload #51
    //   4837: bipush #16
    //   4839: iushr
    //   4840: sipush #255
    //   4843: iand
    //   4844: baload
    //   4845: iload #48
    //   4847: bipush #16
    //   4849: iushr
    //   4850: ixor
    //   4851: i2b
    //   4852: bastore
    //   4853: aload #46
    //   4855: bipush #14
    //   4857: aload #37
    //   4859: iload #50
    //   4861: bipush #8
    //   4863: iushr
    //   4864: sipush #255
    //   4867: iand
    //   4868: baload
    //   4869: iload #48
    //   4871: bipush #8
    //   4873: iushr
    //   4874: ixor
    //   4875: i2b
    //   4876: bastore
    //   4877: aload #46
    //   4879: bipush #15
    //   4881: aload #37
    //   4883: iload #49
    //   4885: sipush #255
    //   4888: iand
    //   4889: baload
    //   4890: iload #48
    //   4892: ixor
    //   4893: i2b
    //   4894: bastore
    //   4895: iconst_0
    //   4896: istore #53
    //   4898: iload #53
    //   4900: bipush #16
    //   4902: if_icmpge -> 4928
    //   4905: aload #43
    //   4907: iload #53
    //   4909: iload #44
    //   4911: bipush #16
    //   4913: imul
    //   4914: iadd
    //   4915: aload #46
    //   4917: iload #53
    //   4919: baload
    //   4920: bastore
    //   4921: iinc #53, 1
    //   4924: iload_2
    //   4925: ifeq -> 4898
    //   4928: iinc #44, 1
    //   4931: iload_2
    //   4932: ifeq -> 4013
    //   4935: aload #43
    //   4937: arraylength
    //   4938: ifle -> 5019
    //   4941: aload #43
    //   4943: aload #43
    //   4945: arraylength
    //   4946: iconst_1
    //   4947: isub
    //   4948: baload
    //   4949: istore #44
    //   4951: iload #44
    //   4953: bipush #16
    //   4955: if_icmple -> 4966
    //   4958: aload #43
    //   4960: astore #35
    //   4962: iload_2
    //   4963: ifeq -> 5019
    //   4966: aload #43
    //   4968: arraylength
    //   4969: iload #44
    //   4971: isub
    //   4972: newarray byte
    //   4974: astore #35
    //   4976: iconst_0
    //   4977: istore #45
    //   4979: iload #45
    //   4981: aload #35
    //   4983: arraylength
    //   4984: if_icmpge -> 5019
    //   4987: iload #45
    //   4989: aload #43
    //   4991: arraylength
    //   4992: if_icmpge -> 5019
    //   4995: aload #35
    //   4997: iload #45
    //   4999: aload #43
    //   5001: iload #45
    //   5003: baload
    //   5004: bastore
    //   5005: iinc #45, 1
    //   5008: iload_2
    //   5009: ifeq -> 4979
    //   5012: goto -> 5019
    //   5015: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5018: athrow
    //   5019: aload #35
    //   5021: astore #7
    //   5023: sipush #1309
    //   5026: new java/math/BigInteger
    //   5029: dup
    //   5030: aload #7
    //   5032: invokespecial <init> : ([B)V
    //   5035: invokevirtual abs : ()Ljava/math/BigInteger;
    //   5038: putstatic burp/Zb0s.Zv : Ljava/lang/Object;
    //   5041: sipush #-21263
    //   5044: getstatic burp/Zkgp.Zw : Ljava/lang/Object;
    //   5047: checkcast java/math/BigInteger
    //   5050: getstatic burp/Zs0b.ZI : Ljava/lang/Object;
    //   5053: checkcast java/math/BigInteger
    //   5056: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   5059: putstatic burp/Zexn.Zl : Ljava/lang/Object;
    //   5062: invokestatic a : (II)Ljava/lang/String;
    //   5065: iconst_1
    //   5066: ldc burp/Ze5f
    //   5068: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5071: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5074: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5077: astore_3
    //   5078: aload_3
    //   5079: arraylength
    //   5080: istore #4
    //   5082: iconst_0
    //   5083: istore #5
    //   5085: iload #5
    //   5087: iload #4
    //   5089: if_icmpge -> 5226
    //   5092: aload_3
    //   5093: iload #5
    //   5095: aaload
    //   5096: astore #6
    //   5098: aload #6
    //   5100: invokevirtual getModifiers : ()I
    //   5103: invokestatic isStatic : (I)Z
    //   5106: ifne -> 5116
    //   5109: goto -> 5219
    //   5112: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5115: athrow
    //   5116: aload #6
    //   5118: invokevirtual getType : ()Ljava/lang/Class;
    //   5121: astore #7
    //   5123: aload #7
    //   5125: ifnull -> 5206
    //   5128: aload #7
    //   5130: invokevirtual isPrimitive : ()Z
    //   5133: ifne -> 5206
    //   5136: goto -> 5143
    //   5139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5142: athrow
    //   5143: aload #7
    //   5145: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5148: ifnull -> 5206
    //   5151: goto -> 5158
    //   5154: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5157: athrow
    //   5158: aload #7
    //   5160: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5163: invokevirtual getName : ()Ljava/lang/String;
    //   5166: ifnull -> 5206
    //   5169: goto -> 5176
    //   5172: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5175: athrow
    //   5176: aload #7
    //   5178: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5181: invokevirtual getName : ()Ljava/lang/String;
    //   5184: sipush #1302
    //   5187: sipush #10705
    //   5190: invokestatic a : (II)Ljava/lang/String;
    //   5193: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5196: ifne -> 5206
    //   5199: goto -> 5206
    //   5202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5205: athrow
    //   5206: aload #6
    //   5208: iconst_1
    //   5209: invokevirtual setAccessible : (Z)V
    //   5212: aload #6
    //   5214: aconst_null
    //   5215: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5218: pop
    //   5219: iinc #5, 1
    //   5222: iload_2
    //   5223: ifeq -> 5085
    //   5226: sipush #1310
    //   5229: sipush #6813
    //   5232: invokestatic a : (II)Ljava/lang/String;
    //   5235: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5238: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5241: astore_3
    //   5242: aload_3
    //   5243: arraylength
    //   5244: istore #4
    //   5246: iconst_0
    //   5247: istore #5
    //   5249: iload #5
    //   5251: iload #4
    //   5253: if_icmpge -> 5364
    //   5256: aload_3
    //   5257: iload #5
    //   5259: aaload
    //   5260: astore #6
    //   5262: aload #6
    //   5264: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5267: pop
    //   5268: aload #6
    //   5270: invokevirtual getModifiers : ()I
    //   5273: invokestatic isStatic : (I)Z
    //   5276: ifeq -> 5350
    //   5279: aload #6
    //   5281: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5284: arraylength
    //   5285: iconst_2
    //   5286: if_icmpne -> 5350
    //   5289: goto -> 5296
    //   5292: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5295: athrow
    //   5296: aload #6
    //   5298: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5301: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5304: if_acmpne -> 5350
    //   5307: goto -> 5314
    //   5310: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5313: athrow
    //   5314: aload #6
    //   5316: iconst_1
    //   5317: invokevirtual setAccessible : (Z)V
    //   5320: aload #6
    //   5322: aconst_null
    //   5323: iconst_2
    //   5324: anewarray java/lang/Object
    //   5327: dup
    //   5328: iconst_0
    //   5329: aload_0
    //   5330: aastore
    //   5331: dup
    //   5332: iconst_1
    //   5333: aload_1
    //   5334: aastore
    //   5335: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5338: pop
    //   5339: iload_2
    //   5340: ifeq -> 5364
    //   5343: goto -> 5350
    //   5346: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5349: athrow
    //   5350: iinc #5, 1
    //   5353: iload_2
    //   5354: ifeq -> 5249
    //   5357: goto -> 5364
    //   5360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5363: athrow
    //   5364: sipush #1300
    //   5367: sipush #-28246
    //   5370: invokestatic a : (II)Ljava/lang/String;
    //   5373: iconst_1
    //   5374: ldc burp/Zx0t
    //   5376: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5379: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5382: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5385: astore_3
    //   5386: aload_3
    //   5387: arraylength
    //   5388: istore #4
    //   5390: iconst_0
    //   5391: istore #5
    //   5393: iload #5
    //   5395: iload #4
    //   5397: if_icmpge -> 5534
    //   5400: aload_3
    //   5401: iload #5
    //   5403: aaload
    //   5404: astore #6
    //   5406: aload #6
    //   5408: invokevirtual getModifiers : ()I
    //   5411: invokestatic isStatic : (I)Z
    //   5414: ifne -> 5424
    //   5417: goto -> 5527
    //   5420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5423: athrow
    //   5424: aload #6
    //   5426: invokevirtual getType : ()Ljava/lang/Class;
    //   5429: astore #7
    //   5431: aload #7
    //   5433: ifnull -> 5514
    //   5436: aload #7
    //   5438: invokevirtual isPrimitive : ()Z
    //   5441: ifne -> 5514
    //   5444: goto -> 5451
    //   5447: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5450: athrow
    //   5451: aload #7
    //   5453: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5456: ifnull -> 5514
    //   5459: goto -> 5466
    //   5462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5465: athrow
    //   5466: aload #7
    //   5468: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5471: invokevirtual getName : ()Ljava/lang/String;
    //   5474: ifnull -> 5514
    //   5477: goto -> 5484
    //   5480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5483: athrow
    //   5484: aload #7
    //   5486: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5489: invokevirtual getName : ()Ljava/lang/String;
    //   5492: sipush #1296
    //   5495: sipush #18713
    //   5498: invokestatic a : (II)Ljava/lang/String;
    //   5501: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5504: ifne -> 5514
    //   5507: goto -> 5514
    //   5510: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5513: athrow
    //   5514: aload #6
    //   5516: iconst_1
    //   5517: invokevirtual setAccessible : (Z)V
    //   5520: aload #6
    //   5522: aconst_null
    //   5523: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5526: pop
    //   5527: iinc #5, 1
    //   5530: iload_2
    //   5531: ifeq -> 5393
    //   5534: sipush #1298
    //   5537: sipush #31661
    //   5540: invokestatic a : (II)Ljava/lang/String;
    //   5543: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5546: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5549: astore_3
    //   5550: aload_3
    //   5551: arraylength
    //   5552: istore #4
    //   5554: iconst_0
    //   5555: istore #5
    //   5557: iload #5
    //   5559: iload #4
    //   5561: if_icmpge -> 5693
    //   5564: aload_3
    //   5565: iload #5
    //   5567: aaload
    //   5568: astore #6
    //   5570: aload #6
    //   5572: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5575: pop
    //   5576: aload #6
    //   5578: invokevirtual getModifiers : ()I
    //   5581: invokestatic isStatic : (I)Z
    //   5584: ifeq -> 5679
    //   5587: aload #6
    //   5589: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5592: arraylength
    //   5593: iconst_2
    //   5594: if_icmpne -> 5679
    //   5597: goto -> 5604
    //   5600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5603: athrow
    //   5604: aload #6
    //   5606: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5609: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   5612: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5615: ifeq -> 5679
    //   5618: goto -> 5625
    //   5621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5624: athrow
    //   5625: aload #6
    //   5627: iconst_1
    //   5628: invokevirtual setAccessible : (Z)V
    //   5631: aload #6
    //   5633: aconst_null
    //   5634: iconst_2
    //   5635: anewarray java/lang/Object
    //   5638: dup
    //   5639: iconst_0
    //   5640: aload_0
    //   5641: aastore
    //   5642: dup
    //   5643: iconst_1
    //   5644: aload_1
    //   5645: ifnonnull -> 5663
    //   5648: goto -> 5655
    //   5651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5654: athrow
    //   5655: aload_1
    //   5656: goto -> 5670
    //   5659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5662: athrow
    //   5663: aload_1
    //   5664: checkcast [B
    //   5667: invokevirtual clone : ()Ljava/lang/Object;
    //   5670: aastore
    //   5671: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5674: pop
    //   5675: iload_2
    //   5676: ifeq -> 5693
    //   5679: iinc #5, 1
    //   5682: iload_2
    //   5683: ifeq -> 5557
    //   5686: goto -> 5693
    //   5689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5692: athrow
    //   5693: new java/io/ByteArrayOutputStream
    //   5696: dup
    //   5697: invokespecial <init> : ()V
    //   5700: astore_3
    //   5701: sipush #1303
    //   5704: aload_3
    //   5705: sipush #202
    //   5708: invokevirtual write : (I)V
    //   5711: sipush #-27890
    //   5714: aload_3
    //   5715: sipush #254
    //   5718: invokevirtual write : (I)V
    //   5721: aload_3
    //   5722: sipush #186
    //   5725: invokevirtual write : (I)V
    //   5728: aload_3
    //   5729: sipush #190
    //   5732: invokevirtual write : (I)V
    //   5735: aload_3
    //   5736: iconst_0
    //   5737: invokevirtual write : (I)V
    //   5740: aload_3
    //   5741: iconst_1
    //   5742: invokevirtual write : (I)V
    //   5745: aload_3
    //   5746: iconst_0
    //   5747: invokevirtual write : (I)V
    //   5750: aload_3
    //   5751: bipush #50
    //   5753: invokevirtual write : (I)V
    //   5756: aload_3
    //   5757: getstatic burp/Zzqj.Zq : Ljava/lang/Object;
    //   5760: checkcast java/math/BigInteger
    //   5763: invokevirtual toByteArray : ()[B
    //   5766: invokevirtual write : ([B)V
    //   5769: aload_3
    //   5770: getstatic burp/Zgqi.Zp : Ljava/lang/Object;
    //   5773: checkcast java/math/BigInteger
    //   5776: invokevirtual toByteArray : ()[B
    //   5779: invokevirtual write : ([B)V
    //   5782: aload_3
    //   5783: getstatic burp/Ztq2.Zj : Ljava/lang/Object;
    //   5786: checkcast java/math/BigInteger
    //   5789: invokevirtual toByteArray : ()[B
    //   5792: invokevirtual write : ([B)V
    //   5795: aload_3
    //   5796: invokevirtual toByteArray : ()[B
    //   5799: astore #4
    //   5801: aconst_null
    //   5802: astore #5
    //   5804: invokestatic a : (II)Ljava/lang/String;
    //   5807: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5810: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5813: astore #6
    //   5815: aload #6
    //   5817: arraylength
    //   5818: istore #7
    //   5820: iconst_0
    //   5821: istore #8
    //   5823: iload #8
    //   5825: iload #7
    //   5827: if_icmpge -> 5955
    //   5830: aload #6
    //   5832: iload #8
    //   5834: aaload
    //   5835: astore #9
    //   5837: aload #9
    //   5839: invokevirtual getName : ()Ljava/lang/String;
    //   5842: sipush #1299
    //   5845: sipush #1955
    //   5848: invokestatic a : (II)Ljava/lang/String;
    //   5851: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5854: ifeq -> 5948
    //   5857: aload #9
    //   5859: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5862: astore #10
    //   5864: aload #10
    //   5866: arraylength
    //   5867: iconst_4
    //   5868: if_icmpeq -> 5878
    //   5871: goto -> 5948
    //   5874: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5877: athrow
    //   5878: aload #10
    //   5880: iconst_0
    //   5881: aaload
    //   5882: ldc java/lang/String
    //   5884: if_acmpeq -> 5894
    //   5887: goto -> 5948
    //   5890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5893: athrow
    //   5894: aload #10
    //   5896: iconst_1
    //   5897: aaload
    //   5898: ldc [B
    //   5900: if_acmpeq -> 5910
    //   5903: goto -> 5948
    //   5906: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5909: athrow
    //   5910: aload #10
    //   5912: iconst_2
    //   5913: aaload
    //   5914: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   5917: if_acmpeq -> 5927
    //   5920: goto -> 5948
    //   5923: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5926: athrow
    //   5927: aload #10
    //   5929: iconst_3
    //   5930: aaload
    //   5931: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   5934: if_acmpeq -> 5944
    //   5937: goto -> 5948
    //   5940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5943: athrow
    //   5944: aload #9
    //   5946: astore #5
    //   5948: iinc #8, 1
    //   5951: iload_2
    //   5952: ifeq -> 5823
    //   5955: aload #5
    //   5957: iconst_1
    //   5958: invokevirtual setAccessible : (Z)V
    //   5961: ldc burp/Zs9x
    //   5963: iconst_0
    //   5964: anewarray java/lang/Class
    //   5967: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   5970: astore #6
    //   5972: aload #6
    //   5974: iconst_1
    //   5975: invokevirtual setAccessible : (Z)V
    //   5978: aload #5
    //   5980: aload #6
    //   5982: iconst_0
    //   5983: anewarray java/lang/Object
    //   5986: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   5989: iconst_4
    //   5990: anewarray java/lang/Object
    //   5993: dup
    //   5994: iconst_0
    //   5995: sipush #1311
    //   5998: sipush #14948
    //   6001: invokestatic a : (II)Ljava/lang/String;
    //   6004: aastore
    //   6005: dup
    //   6006: iconst_1
    //   6007: aload #4
    //   6009: aastore
    //   6010: dup
    //   6011: iconst_2
    //   6012: iconst_0
    //   6013: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6016: aastore
    //   6017: dup
    //   6018: iconst_3
    //   6019: aload #4
    //   6021: arraylength
    //   6022: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6025: aastore
    //   6026: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6029: pop
    //   6030: goto -> 6034
    //   6033: astore_3
    //   6034: getstatic burp/Zz20.ZX : Ljava/lang/String;
    //   6037: getstatic burp/Zrhp.Zw : Ljava/lang/Object;
    //   6040: checkcast java/math/BigInteger
    //   6043: invokevirtual intValue : ()I
    //   6046: bipush #32
    //   6048: irem
    //   6049: invokestatic abs : (I)I
    //   6052: invokevirtual charAt : (I)C
    //   6055: getstatic burp/Zm6g.ZG : Ljava/lang/String;
    //   6058: getstatic burp/Zth8.Zk : Ljava/lang/Object;
    //   6061: checkcast java/math/BigInteger
    //   6064: invokevirtual intValue : ()I
    //   6067: bipush #32
    //   6069: irem
    //   6070: invokestatic abs : (I)I
    //   6073: invokevirtual charAt : (I)C
    //   6076: if_icmpgt -> 6183
    //   6079: getstatic burp/Zsx6.ZJ : Ljava/lang/String;
    //   6082: getstatic burp/Zx4k.ZE : Ljava/lang/Object;
    //   6085: checkcast java/math/BigInteger
    //   6088: invokevirtual intValue : ()I
    //   6091: bipush #32
    //   6093: irem
    //   6094: invokestatic abs : (I)I
    //   6097: invokevirtual charAt : (I)C
    //   6100: getstatic burp/Zxn5.ZI : Ljava/lang/String;
    //   6103: getstatic burp/Zbp.ZD : Ljava/lang/Object;
    //   6106: checkcast java/math/BigInteger
    //   6109: invokevirtual intValue : ()I
    //   6112: bipush #32
    //   6114: irem
    //   6115: invokestatic abs : (I)I
    //   6118: invokevirtual charAt : (I)C
    //   6121: if_icmpgt -> 6183
    //   6124: goto -> 6131
    //   6127: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6130: athrow
    //   6131: getstatic burp/Zelz.ZK : Ljava/lang/String;
    //   6134: getstatic burp/Zt5a.Zs : Ljava/lang/Object;
    //   6137: checkcast java/math/BigInteger
    //   6140: invokevirtual intValue : ()I
    //   6143: bipush #32
    //   6145: irem
    //   6146: invokestatic abs : (I)I
    //   6149: invokevirtual charAt : (I)C
    //   6152: getstatic burp/Zro2.ZF : Ljava/lang/String;
    //   6155: getstatic burp/Zxxd.Zn : Ljava/lang/Object;
    //   6158: checkcast java/math/BigInteger
    //   6161: invokevirtual intValue : ()I
    //   6164: bipush #32
    //   6166: irem
    //   6167: invokestatic abs : (I)I
    //   6170: invokevirtual charAt : (I)C
    //   6173: if_icmple -> 6191
    //   6176: goto -> 6183
    //   6179: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6182: athrow
    //   6183: iconst_1
    //   6184: goto -> 6192
    //   6187: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6190: athrow
    //   6191: iconst_0
    //   6192: ireturn
    //   6193: astore_3
    //   6194: new java/lang/Exception
    //   6197: dup
    //   6198: aload_3
    //   6199: invokevirtual getMessage : ()Ljava/lang/String;
    //   6202: invokespecial <init> : (Ljava/lang/String;)V
    //   6205: athrow
    // Exception table:
    //   from	to	target	type
    //   4	6192	6193	java/lang/Throwable
    //   149	164	164	java/lang/Throwable
    //   1166	1192	1192	java/lang/Throwable
    //   1273	1288	1288	java/lang/Throwable
    //   2470	2495	2498	java/lang/Throwable
    //   2666	2681	2681	java/lang/Throwable
    //   3683	3709	3709	java/lang/Throwable
    //   3790	3805	3805	java/lang/Throwable
    //   4987	5012	5015	java/lang/Throwable
    //   5098	5112	5112	java/lang/Throwable
    //   5123	5136	5139	java/lang/Throwable
    //   5128	5151	5154	java/lang/Throwable
    //   5143	5169	5172	java/lang/Throwable
    //   5158	5199	5202	java/lang/Throwable
    //   5262	5289	5292	java/lang/Throwable
    //   5279	5307	5310	java/lang/Throwable
    //   5296	5343	5346	java/lang/Throwable
    //   5314	5357	5360	java/lang/Throwable
    //   5406	5420	5420	java/lang/Throwable
    //   5431	5444	5447	java/lang/Throwable
    //   5436	5459	5462	java/lang/Throwable
    //   5451	5477	5480	java/lang/Throwable
    //   5466	5507	5510	java/lang/Throwable
    //   5570	5597	5600	java/lang/Throwable
    //   5587	5618	5621	java/lang/Throwable
    //   5604	5648	5651	java/lang/Throwable
    //   5625	5659	5659	java/lang/Throwable
    //   5670	5686	5689	java/lang/Throwable
    //   5693	6030	6033	java/lang/Throwable
    //   5864	5874	5874	java/lang/Throwable
    //   5878	5890	5890	java/lang/Throwable
    //   5894	5906	5906	java/lang/Throwable
    //   5910	5923	5923	java/lang/Throwable
    //   5927	5940	5940	java/lang/Throwable
    //   6034	6124	6127	java/lang/Throwable
    //   6079	6176	6179	java/lang/Throwable
    //   6131	6187	6187	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '掞眛澾ゑ杺﹐꯲쨯짚謁䞮광ꈀ鱍爐뜥鏰㘎㐨煆㆐Ӏ⎱ᡊփޚ胑닽ऻⲅ᭮嫌募훟⥈⽭厼À 놙橉븶䨀壬킾꫕䌂㏺䕑˂倫鿴凸䀦鈔㡃볍?Ⴒ췐ᎈ弌䒠쒸繈撜ᥪ悥侀⋸逤䘊뢌?஝㫎䥦⑚쉜건釶㝺赌亣氺断글먃△ᰴ듑琷䬁譫炀땕䡠慖坈虣ᶍ顧楢蹇魧蟼컰⠑賊襊뼦䉚䆜ⶵ냨믄\\t¦öÉyüðú\\tK¹tKÍtO挸瞟漮》杨︃ꮰ쩅즒隷䞧궸ꈡ鱸爴랃鍴㛚㒲焕㇒Ҫ⏹᠇֊ܳ胰닙ঝⰁᮺ婜剅훍⤛⼯取⁈놐櫠븗䨵壈퀘꩑䏖㍪䗋ː偸龶冒䁮鉙㡊뱤?ႇ쵶ጌ忘䐰쐢繚擏ᤨ惏俈⊵逭䚣뢭?ஹ㩊䦲Ⓤ싆걦醥㜲贁亪沓斘긤몥┷᳠둁琥䭒謩烪딝䠭懿坩虖ᶩ飣榶軗鯽蟮캣⡓負褂뽫䉓䄵ⶔ냝믠\\tDýwÜöh¶\\bÕ§W14u (2²èO_¹bæÕrl­:¶ëÚ oõ=Nx4\\tçátùQ'Ù\\t4>`¶ÓÅä£5»\\ndøSß¹É~Òõ+/JéQLÓyíÈã÷*g¸A¿)5ñçäâü[ÚtàU/Ô\\tåà¡»ñ¨;ä¾ §Ø¼MÔþÓñUd0úedyç\\r¬w¥\\rÖü6å^Ë+'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #128
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #30
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
    //   69: ldc 'x¬ôMø;\q9ußMyäKµ*f^êZotvÔì³)ú¹FòÅÚHÐ-­æÊÊau"åÐb-Ù?w0fèOjÒÐø±QKy¼´X_EÛl\®;Oñµ'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #19
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
    //   130: putstatic burp/Ztv8.a : [Ljava/lang/String;
    //   133: bipush #18
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Ztv8.b : [Ljava/lang/String;
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
    //   212: bipush #116
    //   214: goto -> 244
    //   217: bipush #95
    //   219: goto -> 244
    //   222: bipush #18
    //   224: goto -> 244
    //   227: bipush #58
    //   229: goto -> 244
    //   232: bipush #72
    //   234: goto -> 244
    //   237: bipush #97
    //   239: goto -> 244
    //   242: bipush #64
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
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #47
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #118
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #25
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-2
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #95
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-52
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-33
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #22
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #42
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #116
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #55
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #65
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: iconst_2
    //   378: bastore
    //   379: dup
    //   380: bipush #13
    //   382: bipush #101
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #32
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #116
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #81
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #-57
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #18
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #121
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #96
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #16
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #83
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #-64
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #92
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-21
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #50
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #126
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #-84
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #24
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-57
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #-40
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Ztv8.ZS : Ljava/lang/Object;
    //   499: sipush #1301
    //   502: sipush #-15336
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Ztv8.ZJ : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x51A) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztv8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */