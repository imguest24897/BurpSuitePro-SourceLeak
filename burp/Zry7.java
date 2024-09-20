package burp;

import java.math.BigInteger;

class Zry7 extends ClassLoader {
  static Object ZZ;
  
  static String Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZJ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zp(Object paramObject) {
    Ztev.Zp = a(24814, 4225);
    Ztev.Zr = new BigInteger(a(24810, 3505));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zl3l.Z_.charAt(Math.abs(((BigInteger)Zkdc.Zv).intValue() % 32)) <= Zsun.Zu.charAt(Math.abs(((BigInteger)Zsk2.ZD).intValue() % 32))) {
          try {
            Zrdy.Zn(Class.forName(a(24813, 8140)));
            if (bool)
              Zxdh.ZY(Class.forName(a(24808, 18423))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxdh.ZY(Class.forName(a(24808, 18423)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZE(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: getstatic burp/Zgkp.ZS : Ljava/lang/String;
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
    //   63: getstatic burp/Zz9v.Zl : Ljava/lang/Object;
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
    //   131: sipush #24809
    //   134: sipush #-1247
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
    //   1179: sipush #24803
    //   1182: sipush #18367
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: invokespecial <init> : (Ljava/lang/String;)V
    //   1191: athrow
    //   1192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1195: athrow
    //   1196: bipush #10
    //   1198: istore #36
    //   1200: sipush #24812
    //   1203: sipush #256
    //   1206: newarray byte
    //   1208: astore #37
    //   1210: sipush #15029
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
    //   2518: putstatic burp/Zkaw.ZB : Ljava/lang/Object;
    //   2521: getstatic burp/Zz3k.Zz : Ljava/lang/Object;
    //   2524: checkcast java/math/BigInteger
    //   2527: invokevirtual toByteArray : ()[B
    //   2530: astore_3
    //   2531: bipush #32
    //   2533: newarray int
    //   2535: dup
    //   2536: iconst_0
    //   2537: ldc 943331329
    //   2539: iastore
    //   2540: dup
    //   2541: iconst_1
    //   2542: ldc 170788368
    //   2544: iastore
    //   2545: dup
    //   2546: iconst_2
    //   2547: ldc 1008414755
    //   2549: iastore
    //   2550: dup
    //   2551: iconst_3
    //   2552: ldc 187049985
    //   2554: iastore
    //   2555: dup
    //   2556: iconst_4
    //   2557: ldc 1010368540
    //   2559: iastore
    //   2560: dup
    //   2561: iconst_5
    //   2562: ldc 220604441
    //   2564: iastore
    //   2565: dup
    //   2566: bipush #6
    //   2568: ldc 940377620
    //   2570: iastore
    //   2571: dup
    //   2572: bipush #7
    //   2574: ldc 255209728
    //   2576: iastore
    //   2577: dup
    //   2578: bipush #8
    //   2580: ldc 689771012
    //   2582: iastore
    //   2583: dup
    //   2584: bipush #9
    //   2586: ldc 221709344
    //   2588: iastore
    //   2589: dup
    //   2590: bipush #10
    //   2592: ldc 957157408
    //   2594: iastore
    //   2595: dup
    //   2596: bipush #11
    //   2598: ldc 892536332
    //   2600: iastore
    //   2601: dup
    //   2602: bipush #12
    //   2604: ldc 722417666
    //   2606: iastore
    //   2607: dup
    //   2608: bipush #13
    //   2610: ldc 1026621720
    //   2612: iastore
    //   2613: dup
    //   2614: bipush #14
    //   2616: ldc 655302664
    //   2618: iastore
    //   2619: dup
    //   2620: bipush #15
    //   2622: ldc 890966315
    //   2624: iastore
    //   2625: dup
    //   2626: bipush #16
    //   2628: ldc 187632156
    //   2630: iastore
    //   2631: dup
    //   2632: bipush #17
    //   2634: ldc 874189824
    //   2636: iastore
    //   2637: dup
    //   2638: bipush #18
    //   2640: ldc 254150144
    //   2642: iastore
    //   2643: dup
    //   2644: bipush #19
    //   2646: ldc 924386310
    //   2648: iastore
    //   2649: dup
    //   2650: bipush #20
    //   2652: ldc 121057538
    //   2654: iastore
    //   2655: dup
    //   2656: bipush #21
    //   2658: ldc 840500228
    //   2660: iastore
    //   2661: dup
    //   2662: bipush #22
    //   2664: ldc 389160971
    //   2666: iastore
    //   2667: dup
    //   2668: bipush #23
    //   2670: ldc 907870729
    //   2672: iastore
    //   2673: dup
    //   2674: bipush #24
    //   2676: ldc 389426184
    //   2678: iastore
    //   2679: dup
    //   2680: bipush #25
    //   2682: ldc 973875457
    //   2684: iastore
    //   2685: dup
    //   2686: bipush #26
    //   2688: ldc 372376604
    //   2690: iastore
    //   2691: dup
    //   2692: bipush #27
    //   2694: ldc 707731490
    //   2696: iastore
    //   2697: dup
    //   2698: bipush #28
    //   2700: ldc 1043334948
    //   2702: iastore
    //   2703: dup
    //   2704: bipush #29
    //   2706: ldc 439222784
    //   2708: iastore
    //   2709: dup
    //   2710: bipush #30
    //   2712: ldc 876216579
    //   2714: iastore
    //   2715: dup
    //   2716: bipush #31
    //   2718: ldc 455999525
    //   2720: iastore
    //   2721: astore #5
    //   2723: bipush #8
    //   2725: aload_3
    //   2726: arraylength
    //   2727: bipush #8
    //   2729: irem
    //   2730: isub
    //   2731: istore #6
    //   2733: aload_3
    //   2734: arraylength
    //   2735: iload #6
    //   2737: iadd
    //   2738: newarray byte
    //   2740: astore #7
    //   2742: iconst_0
    //   2743: istore #8
    //   2745: iload #8
    //   2747: aload_3
    //   2748: arraylength
    //   2749: if_icmpge -> 2768
    //   2752: aload #7
    //   2754: iload #8
    //   2756: aload_3
    //   2757: iload #8
    //   2759: baload
    //   2760: bastore
    //   2761: iinc #8, 1
    //   2764: iload_2
    //   2765: ifeq -> 2745
    //   2768: aload_3
    //   2769: arraylength
    //   2770: istore #8
    //   2772: iload #8
    //   2774: aload #7
    //   2776: arraylength
    //   2777: if_icmpge -> 2795
    //   2780: aload #7
    //   2782: iload #8
    //   2784: iload #6
    //   2786: i2b
    //   2787: bastore
    //   2788: iinc #8, 1
    //   2791: iload_2
    //   2792: ifeq -> 2772
    //   2795: aload #7
    //   2797: astore_3
    //   2798: bipush #64
    //   2800: newarray int
    //   2802: dup
    //   2803: iconst_0
    //   2804: ldc 16843776
    //   2806: iastore
    //   2807: dup
    //   2808: iconst_1
    //   2809: iconst_0
    //   2810: iastore
    //   2811: dup
    //   2812: iconst_2
    //   2813: ldc 65536
    //   2815: iastore
    //   2816: dup
    //   2817: iconst_3
    //   2818: ldc 16843780
    //   2820: iastore
    //   2821: dup
    //   2822: iconst_4
    //   2823: ldc 16842756
    //   2825: iastore
    //   2826: dup
    //   2827: iconst_5
    //   2828: ldc 66564
    //   2830: iastore
    //   2831: dup
    //   2832: bipush #6
    //   2834: iconst_4
    //   2835: iastore
    //   2836: dup
    //   2837: bipush #7
    //   2839: ldc 65536
    //   2841: iastore
    //   2842: dup
    //   2843: bipush #8
    //   2845: sipush #1024
    //   2848: iastore
    //   2849: dup
    //   2850: bipush #9
    //   2852: ldc 16843776
    //   2854: iastore
    //   2855: dup
    //   2856: bipush #10
    //   2858: ldc 16843780
    //   2860: iastore
    //   2861: dup
    //   2862: bipush #11
    //   2864: sipush #1024
    //   2867: iastore
    //   2868: dup
    //   2869: bipush #12
    //   2871: ldc 16778244
    //   2873: iastore
    //   2874: dup
    //   2875: bipush #13
    //   2877: ldc 16842756
    //   2879: iastore
    //   2880: dup
    //   2881: bipush #14
    //   2883: ldc 16777216
    //   2885: iastore
    //   2886: dup
    //   2887: bipush #15
    //   2889: iconst_4
    //   2890: iastore
    //   2891: dup
    //   2892: bipush #16
    //   2894: sipush #1028
    //   2897: iastore
    //   2898: dup
    //   2899: bipush #17
    //   2901: ldc 16778240
    //   2903: iastore
    //   2904: dup
    //   2905: bipush #18
    //   2907: ldc 16778240
    //   2909: iastore
    //   2910: dup
    //   2911: bipush #19
    //   2913: ldc 66560
    //   2915: iastore
    //   2916: dup
    //   2917: bipush #20
    //   2919: ldc 66560
    //   2921: iastore
    //   2922: dup
    //   2923: bipush #21
    //   2925: ldc 16842752
    //   2927: iastore
    //   2928: dup
    //   2929: bipush #22
    //   2931: ldc 16842752
    //   2933: iastore
    //   2934: dup
    //   2935: bipush #23
    //   2937: ldc 16778244
    //   2939: iastore
    //   2940: dup
    //   2941: bipush #24
    //   2943: ldc 65540
    //   2945: iastore
    //   2946: dup
    //   2947: bipush #25
    //   2949: ldc 16777220
    //   2951: iastore
    //   2952: dup
    //   2953: bipush #26
    //   2955: ldc 16777220
    //   2957: iastore
    //   2958: dup
    //   2959: bipush #27
    //   2961: ldc 65540
    //   2963: iastore
    //   2964: dup
    //   2965: bipush #28
    //   2967: iconst_0
    //   2968: iastore
    //   2969: dup
    //   2970: bipush #29
    //   2972: sipush #1028
    //   2975: iastore
    //   2976: dup
    //   2977: bipush #30
    //   2979: ldc 66564
    //   2981: iastore
    //   2982: dup
    //   2983: bipush #31
    //   2985: ldc 16777216
    //   2987: iastore
    //   2988: dup
    //   2989: bipush #32
    //   2991: ldc 65536
    //   2993: iastore
    //   2994: dup
    //   2995: bipush #33
    //   2997: ldc 16843780
    //   2999: iastore
    //   3000: dup
    //   3001: bipush #34
    //   3003: iconst_4
    //   3004: iastore
    //   3005: dup
    //   3006: bipush #35
    //   3008: ldc 16842752
    //   3010: iastore
    //   3011: dup
    //   3012: bipush #36
    //   3014: ldc 16843776
    //   3016: iastore
    //   3017: dup
    //   3018: bipush #37
    //   3020: ldc 16777216
    //   3022: iastore
    //   3023: dup
    //   3024: bipush #38
    //   3026: ldc 16777216
    //   3028: iastore
    //   3029: dup
    //   3030: bipush #39
    //   3032: sipush #1024
    //   3035: iastore
    //   3036: dup
    //   3037: bipush #40
    //   3039: ldc 16842756
    //   3041: iastore
    //   3042: dup
    //   3043: bipush #41
    //   3045: ldc 65536
    //   3047: iastore
    //   3048: dup
    //   3049: bipush #42
    //   3051: ldc 66560
    //   3053: iastore
    //   3054: dup
    //   3055: bipush #43
    //   3057: ldc 16777220
    //   3059: iastore
    //   3060: dup
    //   3061: bipush #44
    //   3063: sipush #1024
    //   3066: iastore
    //   3067: dup
    //   3068: bipush #45
    //   3070: iconst_4
    //   3071: iastore
    //   3072: dup
    //   3073: bipush #46
    //   3075: ldc 16778244
    //   3077: iastore
    //   3078: dup
    //   3079: bipush #47
    //   3081: ldc 66564
    //   3083: iastore
    //   3084: dup
    //   3085: bipush #48
    //   3087: ldc 16843780
    //   3089: iastore
    //   3090: dup
    //   3091: bipush #49
    //   3093: ldc 65540
    //   3095: iastore
    //   3096: dup
    //   3097: bipush #50
    //   3099: ldc 16842752
    //   3101: iastore
    //   3102: dup
    //   3103: bipush #51
    //   3105: ldc 16778244
    //   3107: iastore
    //   3108: dup
    //   3109: bipush #52
    //   3111: ldc 16777220
    //   3113: iastore
    //   3114: dup
    //   3115: bipush #53
    //   3117: sipush #1028
    //   3120: iastore
    //   3121: dup
    //   3122: bipush #54
    //   3124: ldc 66564
    //   3126: iastore
    //   3127: dup
    //   3128: bipush #55
    //   3130: ldc 16843776
    //   3132: iastore
    //   3133: dup
    //   3134: bipush #56
    //   3136: sipush #1028
    //   3139: iastore
    //   3140: dup
    //   3141: bipush #57
    //   3143: ldc 16778240
    //   3145: iastore
    //   3146: dup
    //   3147: bipush #58
    //   3149: ldc 16778240
    //   3151: iastore
    //   3152: dup
    //   3153: bipush #59
    //   3155: iconst_0
    //   3156: iastore
    //   3157: dup
    //   3158: bipush #60
    //   3160: ldc 65540
    //   3162: iastore
    //   3163: dup
    //   3164: bipush #61
    //   3166: ldc 66560
    //   3168: iastore
    //   3169: dup
    //   3170: bipush #62
    //   3172: iconst_0
    //   3173: iastore
    //   3174: dup
    //   3175: bipush #63
    //   3177: ldc 16842756
    //   3179: iastore
    //   3180: astore #8
    //   3182: bipush #64
    //   3184: newarray int
    //   3186: dup
    //   3187: iconst_0
    //   3188: ldc -2146402272
    //   3190: iastore
    //   3191: dup
    //   3192: iconst_1
    //   3193: ldc -2147450880
    //   3195: iastore
    //   3196: dup
    //   3197: iconst_2
    //   3198: ldc 32768
    //   3200: iastore
    //   3201: dup
    //   3202: iconst_3
    //   3203: ldc 1081376
    //   3205: iastore
    //   3206: dup
    //   3207: iconst_4
    //   3208: ldc 1048576
    //   3210: iastore
    //   3211: dup
    //   3212: iconst_5
    //   3213: bipush #32
    //   3215: iastore
    //   3216: dup
    //   3217: bipush #6
    //   3219: ldc -2146435040
    //   3221: iastore
    //   3222: dup
    //   3223: bipush #7
    //   3225: ldc -2147450848
    //   3227: iastore
    //   3228: dup
    //   3229: bipush #8
    //   3231: ldc -2147483616
    //   3233: iastore
    //   3234: dup
    //   3235: bipush #9
    //   3237: ldc -2146402272
    //   3239: iastore
    //   3240: dup
    //   3241: bipush #10
    //   3243: ldc -2146402304
    //   3245: iastore
    //   3246: dup
    //   3247: bipush #11
    //   3249: ldc -2147483648
    //   3251: iastore
    //   3252: dup
    //   3253: bipush #12
    //   3255: ldc -2147450880
    //   3257: iastore
    //   3258: dup
    //   3259: bipush #13
    //   3261: ldc 1048576
    //   3263: iastore
    //   3264: dup
    //   3265: bipush #14
    //   3267: bipush #32
    //   3269: iastore
    //   3270: dup
    //   3271: bipush #15
    //   3273: ldc -2146435040
    //   3275: iastore
    //   3276: dup
    //   3277: bipush #16
    //   3279: ldc 1081344
    //   3281: iastore
    //   3282: dup
    //   3283: bipush #17
    //   3285: ldc 1048608
    //   3287: iastore
    //   3288: dup
    //   3289: bipush #18
    //   3291: ldc -2147450848
    //   3293: iastore
    //   3294: dup
    //   3295: bipush #19
    //   3297: iconst_0
    //   3298: iastore
    //   3299: dup
    //   3300: bipush #20
    //   3302: ldc -2147483648
    //   3304: iastore
    //   3305: dup
    //   3306: bipush #21
    //   3308: ldc 32768
    //   3310: iastore
    //   3311: dup
    //   3312: bipush #22
    //   3314: ldc 1081376
    //   3316: iastore
    //   3317: dup
    //   3318: bipush #23
    //   3320: ldc -2146435072
    //   3322: iastore
    //   3323: dup
    //   3324: bipush #24
    //   3326: ldc 1048608
    //   3328: iastore
    //   3329: dup
    //   3330: bipush #25
    //   3332: ldc -2147483616
    //   3334: iastore
    //   3335: dup
    //   3336: bipush #26
    //   3338: iconst_0
    //   3339: iastore
    //   3340: dup
    //   3341: bipush #27
    //   3343: ldc 1081344
    //   3345: iastore
    //   3346: dup
    //   3347: bipush #28
    //   3349: ldc 32800
    //   3351: iastore
    //   3352: dup
    //   3353: bipush #29
    //   3355: ldc -2146402304
    //   3357: iastore
    //   3358: dup
    //   3359: bipush #30
    //   3361: ldc -2146435072
    //   3363: iastore
    //   3364: dup
    //   3365: bipush #31
    //   3367: ldc 32800
    //   3369: iastore
    //   3370: dup
    //   3371: bipush #32
    //   3373: iconst_0
    //   3374: iastore
    //   3375: dup
    //   3376: bipush #33
    //   3378: ldc 1081376
    //   3380: iastore
    //   3381: dup
    //   3382: bipush #34
    //   3384: ldc -2146435040
    //   3386: iastore
    //   3387: dup
    //   3388: bipush #35
    //   3390: ldc 1048576
    //   3392: iastore
    //   3393: dup
    //   3394: bipush #36
    //   3396: ldc -2147450848
    //   3398: iastore
    //   3399: dup
    //   3400: bipush #37
    //   3402: ldc -2146435072
    //   3404: iastore
    //   3405: dup
    //   3406: bipush #38
    //   3408: ldc -2146402304
    //   3410: iastore
    //   3411: dup
    //   3412: bipush #39
    //   3414: ldc 32768
    //   3416: iastore
    //   3417: dup
    //   3418: bipush #40
    //   3420: ldc -2146435072
    //   3422: iastore
    //   3423: dup
    //   3424: bipush #41
    //   3426: ldc -2147450880
    //   3428: iastore
    //   3429: dup
    //   3430: bipush #42
    //   3432: bipush #32
    //   3434: iastore
    //   3435: dup
    //   3436: bipush #43
    //   3438: ldc -2146402272
    //   3440: iastore
    //   3441: dup
    //   3442: bipush #44
    //   3444: ldc 1081376
    //   3446: iastore
    //   3447: dup
    //   3448: bipush #45
    //   3450: bipush #32
    //   3452: iastore
    //   3453: dup
    //   3454: bipush #46
    //   3456: ldc 32768
    //   3458: iastore
    //   3459: dup
    //   3460: bipush #47
    //   3462: ldc -2147483648
    //   3464: iastore
    //   3465: dup
    //   3466: bipush #48
    //   3468: ldc 32800
    //   3470: iastore
    //   3471: dup
    //   3472: bipush #49
    //   3474: ldc -2146402304
    //   3476: iastore
    //   3477: dup
    //   3478: bipush #50
    //   3480: ldc 1048576
    //   3482: iastore
    //   3483: dup
    //   3484: bipush #51
    //   3486: ldc -2147483616
    //   3488: iastore
    //   3489: dup
    //   3490: bipush #52
    //   3492: ldc 1048608
    //   3494: iastore
    //   3495: dup
    //   3496: bipush #53
    //   3498: ldc -2147450848
    //   3500: iastore
    //   3501: dup
    //   3502: bipush #54
    //   3504: ldc -2147483616
    //   3506: iastore
    //   3507: dup
    //   3508: bipush #55
    //   3510: ldc 1048608
    //   3512: iastore
    //   3513: dup
    //   3514: bipush #56
    //   3516: ldc 1081344
    //   3518: iastore
    //   3519: dup
    //   3520: bipush #57
    //   3522: iconst_0
    //   3523: iastore
    //   3524: dup
    //   3525: bipush #58
    //   3527: ldc -2147450880
    //   3529: iastore
    //   3530: dup
    //   3531: bipush #59
    //   3533: ldc 32800
    //   3535: iastore
    //   3536: dup
    //   3537: bipush #60
    //   3539: ldc -2147483648
    //   3541: iastore
    //   3542: dup
    //   3543: bipush #61
    //   3545: ldc -2146435040
    //   3547: iastore
    //   3548: dup
    //   3549: bipush #62
    //   3551: ldc -2146402272
    //   3553: iastore
    //   3554: dup
    //   3555: bipush #63
    //   3557: ldc 1081344
    //   3559: iastore
    //   3560: astore #9
    //   3562: bipush #64
    //   3564: newarray int
    //   3566: dup
    //   3567: iconst_0
    //   3568: sipush #520
    //   3571: iastore
    //   3572: dup
    //   3573: iconst_1
    //   3574: ldc 134349312
    //   3576: iastore
    //   3577: dup
    //   3578: iconst_2
    //   3579: iconst_0
    //   3580: iastore
    //   3581: dup
    //   3582: iconst_3
    //   3583: ldc 134348808
    //   3585: iastore
    //   3586: dup
    //   3587: iconst_4
    //   3588: ldc 134218240
    //   3590: iastore
    //   3591: dup
    //   3592: iconst_5
    //   3593: iconst_0
    //   3594: iastore
    //   3595: dup
    //   3596: bipush #6
    //   3598: ldc 131592
    //   3600: iastore
    //   3601: dup
    //   3602: bipush #7
    //   3604: ldc 134218240
    //   3606: iastore
    //   3607: dup
    //   3608: bipush #8
    //   3610: ldc 131080
    //   3612: iastore
    //   3613: dup
    //   3614: bipush #9
    //   3616: ldc 134217736
    //   3618: iastore
    //   3619: dup
    //   3620: bipush #10
    //   3622: ldc 134217736
    //   3624: iastore
    //   3625: dup
    //   3626: bipush #11
    //   3628: ldc 131072
    //   3630: iastore
    //   3631: dup
    //   3632: bipush #12
    //   3634: ldc 134349320
    //   3636: iastore
    //   3637: dup
    //   3638: bipush #13
    //   3640: ldc 131080
    //   3642: iastore
    //   3643: dup
    //   3644: bipush #14
    //   3646: ldc 134348800
    //   3648: iastore
    //   3649: dup
    //   3650: bipush #15
    //   3652: sipush #520
    //   3655: iastore
    //   3656: dup
    //   3657: bipush #16
    //   3659: ldc 134217728
    //   3661: iastore
    //   3662: dup
    //   3663: bipush #17
    //   3665: bipush #8
    //   3667: iastore
    //   3668: dup
    //   3669: bipush #18
    //   3671: ldc 134349312
    //   3673: iastore
    //   3674: dup
    //   3675: bipush #19
    //   3677: sipush #512
    //   3680: iastore
    //   3681: dup
    //   3682: bipush #20
    //   3684: ldc 131584
    //   3686: iastore
    //   3687: dup
    //   3688: bipush #21
    //   3690: ldc 134348800
    //   3692: iastore
    //   3693: dup
    //   3694: bipush #22
    //   3696: ldc 134348808
    //   3698: iastore
    //   3699: dup
    //   3700: bipush #23
    //   3702: ldc 131592
    //   3704: iastore
    //   3705: dup
    //   3706: bipush #24
    //   3708: ldc 134218248
    //   3710: iastore
    //   3711: dup
    //   3712: bipush #25
    //   3714: ldc 131584
    //   3716: iastore
    //   3717: dup
    //   3718: bipush #26
    //   3720: ldc 131072
    //   3722: iastore
    //   3723: dup
    //   3724: bipush #27
    //   3726: ldc 134218248
    //   3728: iastore
    //   3729: dup
    //   3730: bipush #28
    //   3732: bipush #8
    //   3734: iastore
    //   3735: dup
    //   3736: bipush #29
    //   3738: ldc 134349320
    //   3740: iastore
    //   3741: dup
    //   3742: bipush #30
    //   3744: sipush #512
    //   3747: iastore
    //   3748: dup
    //   3749: bipush #31
    //   3751: ldc 134217728
    //   3753: iastore
    //   3754: dup
    //   3755: bipush #32
    //   3757: ldc 134349312
    //   3759: iastore
    //   3760: dup
    //   3761: bipush #33
    //   3763: ldc 134217728
    //   3765: iastore
    //   3766: dup
    //   3767: bipush #34
    //   3769: ldc 131080
    //   3771: iastore
    //   3772: dup
    //   3773: bipush #35
    //   3775: sipush #520
    //   3778: iastore
    //   3779: dup
    //   3780: bipush #36
    //   3782: ldc 131072
    //   3784: iastore
    //   3785: dup
    //   3786: bipush #37
    //   3788: ldc 134349312
    //   3790: iastore
    //   3791: dup
    //   3792: bipush #38
    //   3794: ldc 134218240
    //   3796: iastore
    //   3797: dup
    //   3798: bipush #39
    //   3800: iconst_0
    //   3801: iastore
    //   3802: dup
    //   3803: bipush #40
    //   3805: sipush #512
    //   3808: iastore
    //   3809: dup
    //   3810: bipush #41
    //   3812: ldc 131080
    //   3814: iastore
    //   3815: dup
    //   3816: bipush #42
    //   3818: ldc 134349320
    //   3820: iastore
    //   3821: dup
    //   3822: bipush #43
    //   3824: ldc 134218240
    //   3826: iastore
    //   3827: dup
    //   3828: bipush #44
    //   3830: ldc 134217736
    //   3832: iastore
    //   3833: dup
    //   3834: bipush #45
    //   3836: sipush #512
    //   3839: iastore
    //   3840: dup
    //   3841: bipush #46
    //   3843: iconst_0
    //   3844: iastore
    //   3845: dup
    //   3846: bipush #47
    //   3848: ldc 134348808
    //   3850: iastore
    //   3851: dup
    //   3852: bipush #48
    //   3854: ldc 134218248
    //   3856: iastore
    //   3857: dup
    //   3858: bipush #49
    //   3860: ldc 131072
    //   3862: iastore
    //   3863: dup
    //   3864: bipush #50
    //   3866: ldc 134217728
    //   3868: iastore
    //   3869: dup
    //   3870: bipush #51
    //   3872: ldc 134349320
    //   3874: iastore
    //   3875: dup
    //   3876: bipush #52
    //   3878: bipush #8
    //   3880: iastore
    //   3881: dup
    //   3882: bipush #53
    //   3884: ldc 131592
    //   3886: iastore
    //   3887: dup
    //   3888: bipush #54
    //   3890: ldc 131584
    //   3892: iastore
    //   3893: dup
    //   3894: bipush #55
    //   3896: ldc 134217736
    //   3898: iastore
    //   3899: dup
    //   3900: bipush #56
    //   3902: ldc 134348800
    //   3904: iastore
    //   3905: dup
    //   3906: bipush #57
    //   3908: ldc 134218248
    //   3910: iastore
    //   3911: dup
    //   3912: bipush #58
    //   3914: sipush #520
    //   3917: iastore
    //   3918: dup
    //   3919: bipush #59
    //   3921: ldc 134348800
    //   3923: iastore
    //   3924: dup
    //   3925: bipush #60
    //   3927: ldc 131592
    //   3929: iastore
    //   3930: dup
    //   3931: bipush #61
    //   3933: bipush #8
    //   3935: iastore
    //   3936: dup
    //   3937: bipush #62
    //   3939: ldc 134348808
    //   3941: iastore
    //   3942: dup
    //   3943: bipush #63
    //   3945: ldc 131584
    //   3947: iastore
    //   3948: astore #10
    //   3950: bipush #64
    //   3952: newarray int
    //   3954: dup
    //   3955: iconst_0
    //   3956: ldc 8396801
    //   3958: iastore
    //   3959: dup
    //   3960: iconst_1
    //   3961: sipush #8321
    //   3964: iastore
    //   3965: dup
    //   3966: iconst_2
    //   3967: sipush #8321
    //   3970: iastore
    //   3971: dup
    //   3972: iconst_3
    //   3973: sipush #128
    //   3976: iastore
    //   3977: dup
    //   3978: iconst_4
    //   3979: ldc 8396928
    //   3981: iastore
    //   3982: dup
    //   3983: iconst_5
    //   3984: ldc 8388737
    //   3986: iastore
    //   3987: dup
    //   3988: bipush #6
    //   3990: ldc 8388609
    //   3992: iastore
    //   3993: dup
    //   3994: bipush #7
    //   3996: sipush #8193
    //   3999: iastore
    //   4000: dup
    //   4001: bipush #8
    //   4003: iconst_0
    //   4004: iastore
    //   4005: dup
    //   4006: bipush #9
    //   4008: ldc 8396800
    //   4010: iastore
    //   4011: dup
    //   4012: bipush #10
    //   4014: ldc 8396800
    //   4016: iastore
    //   4017: dup
    //   4018: bipush #11
    //   4020: ldc 8396929
    //   4022: iastore
    //   4023: dup
    //   4024: bipush #12
    //   4026: sipush #129
    //   4029: iastore
    //   4030: dup
    //   4031: bipush #13
    //   4033: iconst_0
    //   4034: iastore
    //   4035: dup
    //   4036: bipush #14
    //   4038: ldc 8388736
    //   4040: iastore
    //   4041: dup
    //   4042: bipush #15
    //   4044: ldc 8388609
    //   4046: iastore
    //   4047: dup
    //   4048: bipush #16
    //   4050: iconst_1
    //   4051: iastore
    //   4052: dup
    //   4053: bipush #17
    //   4055: sipush #8192
    //   4058: iastore
    //   4059: dup
    //   4060: bipush #18
    //   4062: ldc 8388608
    //   4064: iastore
    //   4065: dup
    //   4066: bipush #19
    //   4068: ldc 8396801
    //   4070: iastore
    //   4071: dup
    //   4072: bipush #20
    //   4074: sipush #128
    //   4077: iastore
    //   4078: dup
    //   4079: bipush #21
    //   4081: ldc 8388608
    //   4083: iastore
    //   4084: dup
    //   4085: bipush #22
    //   4087: sipush #8193
    //   4090: iastore
    //   4091: dup
    //   4092: bipush #23
    //   4094: sipush #8320
    //   4097: iastore
    //   4098: dup
    //   4099: bipush #24
    //   4101: ldc 8388737
    //   4103: iastore
    //   4104: dup
    //   4105: bipush #25
    //   4107: iconst_1
    //   4108: iastore
    //   4109: dup
    //   4110: bipush #26
    //   4112: sipush #8320
    //   4115: iastore
    //   4116: dup
    //   4117: bipush #27
    //   4119: ldc 8388736
    //   4121: iastore
    //   4122: dup
    //   4123: bipush #28
    //   4125: sipush #8192
    //   4128: iastore
    //   4129: dup
    //   4130: bipush #29
    //   4132: ldc 8396928
    //   4134: iastore
    //   4135: dup
    //   4136: bipush #30
    //   4138: ldc 8396929
    //   4140: iastore
    //   4141: dup
    //   4142: bipush #31
    //   4144: sipush #129
    //   4147: iastore
    //   4148: dup
    //   4149: bipush #32
    //   4151: ldc 8388736
    //   4153: iastore
    //   4154: dup
    //   4155: bipush #33
    //   4157: ldc 8388609
    //   4159: iastore
    //   4160: dup
    //   4161: bipush #34
    //   4163: ldc 8396800
    //   4165: iastore
    //   4166: dup
    //   4167: bipush #35
    //   4169: ldc 8396929
    //   4171: iastore
    //   4172: dup
    //   4173: bipush #36
    //   4175: sipush #129
    //   4178: iastore
    //   4179: dup
    //   4180: bipush #37
    //   4182: iconst_0
    //   4183: iastore
    //   4184: dup
    //   4185: bipush #38
    //   4187: iconst_0
    //   4188: iastore
    //   4189: dup
    //   4190: bipush #39
    //   4192: ldc 8396800
    //   4194: iastore
    //   4195: dup
    //   4196: bipush #40
    //   4198: sipush #8320
    //   4201: iastore
    //   4202: dup
    //   4203: bipush #41
    //   4205: ldc 8388736
    //   4207: iastore
    //   4208: dup
    //   4209: bipush #42
    //   4211: ldc 8388737
    //   4213: iastore
    //   4214: dup
    //   4215: bipush #43
    //   4217: iconst_1
    //   4218: iastore
    //   4219: dup
    //   4220: bipush #44
    //   4222: ldc 8396801
    //   4224: iastore
    //   4225: dup
    //   4226: bipush #45
    //   4228: sipush #8321
    //   4231: iastore
    //   4232: dup
    //   4233: bipush #46
    //   4235: sipush #8321
    //   4238: iastore
    //   4239: dup
    //   4240: bipush #47
    //   4242: sipush #128
    //   4245: iastore
    //   4246: dup
    //   4247: bipush #48
    //   4249: ldc 8396929
    //   4251: iastore
    //   4252: dup
    //   4253: bipush #49
    //   4255: sipush #129
    //   4258: iastore
    //   4259: dup
    //   4260: bipush #50
    //   4262: iconst_1
    //   4263: iastore
    //   4264: dup
    //   4265: bipush #51
    //   4267: sipush #8192
    //   4270: iastore
    //   4271: dup
    //   4272: bipush #52
    //   4274: ldc 8388609
    //   4276: iastore
    //   4277: dup
    //   4278: bipush #53
    //   4280: sipush #8193
    //   4283: iastore
    //   4284: dup
    //   4285: bipush #54
    //   4287: ldc 8396928
    //   4289: iastore
    //   4290: dup
    //   4291: bipush #55
    //   4293: ldc 8388737
    //   4295: iastore
    //   4296: dup
    //   4297: bipush #56
    //   4299: sipush #8193
    //   4302: iastore
    //   4303: dup
    //   4304: bipush #57
    //   4306: sipush #8320
    //   4309: iastore
    //   4310: dup
    //   4311: bipush #58
    //   4313: ldc 8388608
    //   4315: iastore
    //   4316: dup
    //   4317: bipush #59
    //   4319: ldc 8396801
    //   4321: iastore
    //   4322: dup
    //   4323: bipush #60
    //   4325: sipush #128
    //   4328: iastore
    //   4329: dup
    //   4330: bipush #61
    //   4332: ldc 8388608
    //   4334: iastore
    //   4335: dup
    //   4336: bipush #62
    //   4338: sipush #8192
    //   4341: iastore
    //   4342: dup
    //   4343: bipush #63
    //   4345: ldc 8396928
    //   4347: iastore
    //   4348: astore #11
    //   4350: bipush #64
    //   4352: newarray int
    //   4354: dup
    //   4355: iconst_0
    //   4356: sipush #256
    //   4359: iastore
    //   4360: dup
    //   4361: iconst_1
    //   4362: ldc 34078976
    //   4364: iastore
    //   4365: dup
    //   4366: iconst_2
    //   4367: ldc 34078720
    //   4369: iastore
    //   4370: dup
    //   4371: iconst_3
    //   4372: ldc 1107296512
    //   4374: iastore
    //   4375: dup
    //   4376: iconst_4
    //   4377: ldc 524288
    //   4379: iastore
    //   4380: dup
    //   4381: iconst_5
    //   4382: sipush #256
    //   4385: iastore
    //   4386: dup
    //   4387: bipush #6
    //   4389: ldc 1073741824
    //   4391: iastore
    //   4392: dup
    //   4393: bipush #7
    //   4395: ldc 34078720
    //   4397: iastore
    //   4398: dup
    //   4399: bipush #8
    //   4401: ldc 1074266368
    //   4403: iastore
    //   4404: dup
    //   4405: bipush #9
    //   4407: ldc 524288
    //   4409: iastore
    //   4410: dup
    //   4411: bipush #10
    //   4413: ldc 33554688
    //   4415: iastore
    //   4416: dup
    //   4417: bipush #11
    //   4419: ldc 1074266368
    //   4421: iastore
    //   4422: dup
    //   4423: bipush #12
    //   4425: ldc 1107296512
    //   4427: iastore
    //   4428: dup
    //   4429: bipush #13
    //   4431: ldc 1107820544
    //   4433: iastore
    //   4434: dup
    //   4435: bipush #14
    //   4437: ldc 524544
    //   4439: iastore
    //   4440: dup
    //   4441: bipush #15
    //   4443: ldc 1073741824
    //   4445: iastore
    //   4446: dup
    //   4447: bipush #16
    //   4449: ldc 33554432
    //   4451: iastore
    //   4452: dup
    //   4453: bipush #17
    //   4455: ldc 1074266112
    //   4457: iastore
    //   4458: dup
    //   4459: bipush #18
    //   4461: ldc 1074266112
    //   4463: iastore
    //   4464: dup
    //   4465: bipush #19
    //   4467: iconst_0
    //   4468: iastore
    //   4469: dup
    //   4470: bipush #20
    //   4472: ldc 1073742080
    //   4474: iastore
    //   4475: dup
    //   4476: bipush #21
    //   4478: ldc 1107820800
    //   4480: iastore
    //   4481: dup
    //   4482: bipush #22
    //   4484: ldc 1107820800
    //   4486: iastore
    //   4487: dup
    //   4488: bipush #23
    //   4490: ldc 33554688
    //   4492: iastore
    //   4493: dup
    //   4494: bipush #24
    //   4496: ldc 1107820544
    //   4498: iastore
    //   4499: dup
    //   4500: bipush #25
    //   4502: ldc 1073742080
    //   4504: iastore
    //   4505: dup
    //   4506: bipush #26
    //   4508: iconst_0
    //   4509: iastore
    //   4510: dup
    //   4511: bipush #27
    //   4513: ldc 1107296256
    //   4515: iastore
    //   4516: dup
    //   4517: bipush #28
    //   4519: ldc 34078976
    //   4521: iastore
    //   4522: dup
    //   4523: bipush #29
    //   4525: ldc 33554432
    //   4527: iastore
    //   4528: dup
    //   4529: bipush #30
    //   4531: ldc 1107296256
    //   4533: iastore
    //   4534: dup
    //   4535: bipush #31
    //   4537: ldc 524544
    //   4539: iastore
    //   4540: dup
    //   4541: bipush #32
    //   4543: ldc 524288
    //   4545: iastore
    //   4546: dup
    //   4547: bipush #33
    //   4549: ldc 1107296512
    //   4551: iastore
    //   4552: dup
    //   4553: bipush #34
    //   4555: sipush #256
    //   4558: iastore
    //   4559: dup
    //   4560: bipush #35
    //   4562: ldc 33554432
    //   4564: iastore
    //   4565: dup
    //   4566: bipush #36
    //   4568: ldc 1073741824
    //   4570: iastore
    //   4571: dup
    //   4572: bipush #37
    //   4574: ldc 34078720
    //   4576: iastore
    //   4577: dup
    //   4578: bipush #38
    //   4580: ldc 1107296512
    //   4582: iastore
    //   4583: dup
    //   4584: bipush #39
    //   4586: ldc 1074266368
    //   4588: iastore
    //   4589: dup
    //   4590: bipush #40
    //   4592: ldc 33554688
    //   4594: iastore
    //   4595: dup
    //   4596: bipush #41
    //   4598: ldc 1073741824
    //   4600: iastore
    //   4601: dup
    //   4602: bipush #42
    //   4604: ldc 1107820544
    //   4606: iastore
    //   4607: dup
    //   4608: bipush #43
    //   4610: ldc 34078976
    //   4612: iastore
    //   4613: dup
    //   4614: bipush #44
    //   4616: ldc 1074266368
    //   4618: iastore
    //   4619: dup
    //   4620: bipush #45
    //   4622: sipush #256
    //   4625: iastore
    //   4626: dup
    //   4627: bipush #46
    //   4629: ldc 33554432
    //   4631: iastore
    //   4632: dup
    //   4633: bipush #47
    //   4635: ldc 1107820544
    //   4637: iastore
    //   4638: dup
    //   4639: bipush #48
    //   4641: ldc 1107820800
    //   4643: iastore
    //   4644: dup
    //   4645: bipush #49
    //   4647: ldc 524544
    //   4649: iastore
    //   4650: dup
    //   4651: bipush #50
    //   4653: ldc 1107296256
    //   4655: iastore
    //   4656: dup
    //   4657: bipush #51
    //   4659: ldc 1107820800
    //   4661: iastore
    //   4662: dup
    //   4663: bipush #52
    //   4665: ldc 34078720
    //   4667: iastore
    //   4668: dup
    //   4669: bipush #53
    //   4671: iconst_0
    //   4672: iastore
    //   4673: dup
    //   4674: bipush #54
    //   4676: ldc 1074266112
    //   4678: iastore
    //   4679: dup
    //   4680: bipush #55
    //   4682: ldc 1107296256
    //   4684: iastore
    //   4685: dup
    //   4686: bipush #56
    //   4688: ldc 524544
    //   4690: iastore
    //   4691: dup
    //   4692: bipush #57
    //   4694: ldc 33554688
    //   4696: iastore
    //   4697: dup
    //   4698: bipush #58
    //   4700: ldc 1073742080
    //   4702: iastore
    //   4703: dup
    //   4704: bipush #59
    //   4706: ldc 524288
    //   4708: iastore
    //   4709: dup
    //   4710: bipush #60
    //   4712: iconst_0
    //   4713: iastore
    //   4714: dup
    //   4715: bipush #61
    //   4717: ldc 1074266112
    //   4719: iastore
    //   4720: dup
    //   4721: bipush #62
    //   4723: ldc 34078976
    //   4725: iastore
    //   4726: dup
    //   4727: bipush #63
    //   4729: ldc 1073742080
    //   4731: iastore
    //   4732: astore #12
    //   4734: bipush #64
    //   4736: newarray int
    //   4738: dup
    //   4739: iconst_0
    //   4740: ldc 536870928
    //   4742: iastore
    //   4743: dup
    //   4744: iconst_1
    //   4745: ldc 541065216
    //   4747: iastore
    //   4748: dup
    //   4749: iconst_2
    //   4750: sipush #16384
    //   4753: iastore
    //   4754: dup
    //   4755: iconst_3
    //   4756: ldc 541081616
    //   4758: iastore
    //   4759: dup
    //   4760: iconst_4
    //   4761: ldc 541065216
    //   4763: iastore
    //   4764: dup
    //   4765: iconst_5
    //   4766: bipush #16
    //   4768: iastore
    //   4769: dup
    //   4770: bipush #6
    //   4772: ldc 541081616
    //   4774: iastore
    //   4775: dup
    //   4776: bipush #7
    //   4778: ldc 4194304
    //   4780: iastore
    //   4781: dup
    //   4782: bipush #8
    //   4784: ldc 536887296
    //   4786: iastore
    //   4787: dup
    //   4788: bipush #9
    //   4790: ldc 4210704
    //   4792: iastore
    //   4793: dup
    //   4794: bipush #10
    //   4796: ldc 4194304
    //   4798: iastore
    //   4799: dup
    //   4800: bipush #11
    //   4802: ldc 536870928
    //   4804: iastore
    //   4805: dup
    //   4806: bipush #12
    //   4808: ldc 4194320
    //   4810: iastore
    //   4811: dup
    //   4812: bipush #13
    //   4814: ldc 536887296
    //   4816: iastore
    //   4817: dup
    //   4818: bipush #14
    //   4820: ldc 536870912
    //   4822: iastore
    //   4823: dup
    //   4824: bipush #15
    //   4826: sipush #16400
    //   4829: iastore
    //   4830: dup
    //   4831: bipush #16
    //   4833: iconst_0
    //   4834: iastore
    //   4835: dup
    //   4836: bipush #17
    //   4838: ldc 4194320
    //   4840: iastore
    //   4841: dup
    //   4842: bipush #18
    //   4844: ldc 536887312
    //   4846: iastore
    //   4847: dup
    //   4848: bipush #19
    //   4850: sipush #16384
    //   4853: iastore
    //   4854: dup
    //   4855: bipush #20
    //   4857: ldc 4210688
    //   4859: iastore
    //   4860: dup
    //   4861: bipush #21
    //   4863: ldc 536887312
    //   4865: iastore
    //   4866: dup
    //   4867: bipush #22
    //   4869: bipush #16
    //   4871: iastore
    //   4872: dup
    //   4873: bipush #23
    //   4875: ldc 541065232
    //   4877: iastore
    //   4878: dup
    //   4879: bipush #24
    //   4881: ldc 541065232
    //   4883: iastore
    //   4884: dup
    //   4885: bipush #25
    //   4887: iconst_0
    //   4888: iastore
    //   4889: dup
    //   4890: bipush #26
    //   4892: ldc 4210704
    //   4894: iastore
    //   4895: dup
    //   4896: bipush #27
    //   4898: ldc 541081600
    //   4900: iastore
    //   4901: dup
    //   4902: bipush #28
    //   4904: sipush #16400
    //   4907: iastore
    //   4908: dup
    //   4909: bipush #29
    //   4911: ldc 4210688
    //   4913: iastore
    //   4914: dup
    //   4915: bipush #30
    //   4917: ldc 541081600
    //   4919: iastore
    //   4920: dup
    //   4921: bipush #31
    //   4923: ldc 536870912
    //   4925: iastore
    //   4926: dup
    //   4927: bipush #32
    //   4929: ldc 536887296
    //   4931: iastore
    //   4932: dup
    //   4933: bipush #33
    //   4935: bipush #16
    //   4937: iastore
    //   4938: dup
    //   4939: bipush #34
    //   4941: ldc 541065232
    //   4943: iastore
    //   4944: dup
    //   4945: bipush #35
    //   4947: ldc 4210688
    //   4949: iastore
    //   4950: dup
    //   4951: bipush #36
    //   4953: ldc 541081616
    //   4955: iastore
    //   4956: dup
    //   4957: bipush #37
    //   4959: ldc 4194304
    //   4961: iastore
    //   4962: dup
    //   4963: bipush #38
    //   4965: sipush #16400
    //   4968: iastore
    //   4969: dup
    //   4970: bipush #39
    //   4972: ldc 536870928
    //   4974: iastore
    //   4975: dup
    //   4976: bipush #40
    //   4978: ldc 4194304
    //   4980: iastore
    //   4981: dup
    //   4982: bipush #41
    //   4984: ldc 536887296
    //   4986: iastore
    //   4987: dup
    //   4988: bipush #42
    //   4990: ldc 536870912
    //   4992: iastore
    //   4993: dup
    //   4994: bipush #43
    //   4996: sipush #16400
    //   4999: iastore
    //   5000: dup
    //   5001: bipush #44
    //   5003: ldc 536870928
    //   5005: iastore
    //   5006: dup
    //   5007: bipush #45
    //   5009: ldc 541081616
    //   5011: iastore
    //   5012: dup
    //   5013: bipush #46
    //   5015: ldc 4210688
    //   5017: iastore
    //   5018: dup
    //   5019: bipush #47
    //   5021: ldc 541065216
    //   5023: iastore
    //   5024: dup
    //   5025: bipush #48
    //   5027: ldc 4210704
    //   5029: iastore
    //   5030: dup
    //   5031: bipush #49
    //   5033: ldc 541081600
    //   5035: iastore
    //   5036: dup
    //   5037: bipush #50
    //   5039: iconst_0
    //   5040: iastore
    //   5041: dup
    //   5042: bipush #51
    //   5044: ldc 541065232
    //   5046: iastore
    //   5047: dup
    //   5048: bipush #52
    //   5050: bipush #16
    //   5052: iastore
    //   5053: dup
    //   5054: bipush #53
    //   5056: sipush #16384
    //   5059: iastore
    //   5060: dup
    //   5061: bipush #54
    //   5063: ldc 541065216
    //   5065: iastore
    //   5066: dup
    //   5067: bipush #55
    //   5069: ldc 4210704
    //   5071: iastore
    //   5072: dup
    //   5073: bipush #56
    //   5075: sipush #16384
    //   5078: iastore
    //   5079: dup
    //   5080: bipush #57
    //   5082: ldc 4194320
    //   5084: iastore
    //   5085: dup
    //   5086: bipush #58
    //   5088: ldc 536887312
    //   5090: iastore
    //   5091: dup
    //   5092: bipush #59
    //   5094: iconst_0
    //   5095: iastore
    //   5096: dup
    //   5097: bipush #60
    //   5099: ldc 541081600
    //   5101: iastore
    //   5102: dup
    //   5103: bipush #61
    //   5105: ldc 536870912
    //   5107: iastore
    //   5108: dup
    //   5109: bipush #62
    //   5111: ldc 4194320
    //   5113: iastore
    //   5114: dup
    //   5115: bipush #63
    //   5117: ldc 536887312
    //   5119: iastore
    //   5120: astore #13
    //   5122: bipush #64
    //   5124: newarray int
    //   5126: dup
    //   5127: iconst_0
    //   5128: ldc 2097152
    //   5130: iastore
    //   5131: dup
    //   5132: iconst_1
    //   5133: ldc 69206018
    //   5135: iastore
    //   5136: dup
    //   5137: iconst_2
    //   5138: ldc 67110914
    //   5140: iastore
    //   5141: dup
    //   5142: iconst_3
    //   5143: iconst_0
    //   5144: iastore
    //   5145: dup
    //   5146: iconst_4
    //   5147: sipush #2048
    //   5150: iastore
    //   5151: dup
    //   5152: iconst_5
    //   5153: ldc 67110914
    //   5155: iastore
    //   5156: dup
    //   5157: bipush #6
    //   5159: ldc 2099202
    //   5161: iastore
    //   5162: dup
    //   5163: bipush #7
    //   5165: ldc 69208064
    //   5167: iastore
    //   5168: dup
    //   5169: bipush #8
    //   5171: ldc 69208066
    //   5173: iastore
    //   5174: dup
    //   5175: bipush #9
    //   5177: ldc 2097152
    //   5179: iastore
    //   5180: dup
    //   5181: bipush #10
    //   5183: iconst_0
    //   5184: iastore
    //   5185: dup
    //   5186: bipush #11
    //   5188: ldc 67108866
    //   5190: iastore
    //   5191: dup
    //   5192: bipush #12
    //   5194: iconst_2
    //   5195: iastore
    //   5196: dup
    //   5197: bipush #13
    //   5199: ldc 67108864
    //   5201: iastore
    //   5202: dup
    //   5203: bipush #14
    //   5205: ldc 69206018
    //   5207: iastore
    //   5208: dup
    //   5209: bipush #15
    //   5211: sipush #2050
    //   5214: iastore
    //   5215: dup
    //   5216: bipush #16
    //   5218: ldc 67110912
    //   5220: iastore
    //   5221: dup
    //   5222: bipush #17
    //   5224: ldc 2099202
    //   5226: iastore
    //   5227: dup
    //   5228: bipush #18
    //   5230: ldc 2097154
    //   5232: iastore
    //   5233: dup
    //   5234: bipush #19
    //   5236: ldc 67110912
    //   5238: iastore
    //   5239: dup
    //   5240: bipush #20
    //   5242: ldc 67108866
    //   5244: iastore
    //   5245: dup
    //   5246: bipush #21
    //   5248: ldc 69206016
    //   5250: iastore
    //   5251: dup
    //   5252: bipush #22
    //   5254: ldc 69208064
    //   5256: iastore
    //   5257: dup
    //   5258: bipush #23
    //   5260: ldc 2097154
    //   5262: iastore
    //   5263: dup
    //   5264: bipush #24
    //   5266: ldc 69206016
    //   5268: iastore
    //   5269: dup
    //   5270: bipush #25
    //   5272: sipush #2048
    //   5275: iastore
    //   5276: dup
    //   5277: bipush #26
    //   5279: sipush #2050
    //   5282: iastore
    //   5283: dup
    //   5284: bipush #27
    //   5286: ldc 69208066
    //   5288: iastore
    //   5289: dup
    //   5290: bipush #28
    //   5292: ldc 2099200
    //   5294: iastore
    //   5295: dup
    //   5296: bipush #29
    //   5298: iconst_2
    //   5299: iastore
    //   5300: dup
    //   5301: bipush #30
    //   5303: ldc 67108864
    //   5305: iastore
    //   5306: dup
    //   5307: bipush #31
    //   5309: ldc 2099200
    //   5311: iastore
    //   5312: dup
    //   5313: bipush #32
    //   5315: ldc 67108864
    //   5317: iastore
    //   5318: dup
    //   5319: bipush #33
    //   5321: ldc 2099200
    //   5323: iastore
    //   5324: dup
    //   5325: bipush #34
    //   5327: ldc 2097152
    //   5329: iastore
    //   5330: dup
    //   5331: bipush #35
    //   5333: ldc 67110914
    //   5335: iastore
    //   5336: dup
    //   5337: bipush #36
    //   5339: ldc 67110914
    //   5341: iastore
    //   5342: dup
    //   5343: bipush #37
    //   5345: ldc 69206018
    //   5347: iastore
    //   5348: dup
    //   5349: bipush #38
    //   5351: ldc 69206018
    //   5353: iastore
    //   5354: dup
    //   5355: bipush #39
    //   5357: iconst_2
    //   5358: iastore
    //   5359: dup
    //   5360: bipush #40
    //   5362: ldc 2097154
    //   5364: iastore
    //   5365: dup
    //   5366: bipush #41
    //   5368: ldc 67108864
    //   5370: iastore
    //   5371: dup
    //   5372: bipush #42
    //   5374: ldc 67110912
    //   5376: iastore
    //   5377: dup
    //   5378: bipush #43
    //   5380: ldc 2097152
    //   5382: iastore
    //   5383: dup
    //   5384: bipush #44
    //   5386: ldc 69208064
    //   5388: iastore
    //   5389: dup
    //   5390: bipush #45
    //   5392: sipush #2050
    //   5395: iastore
    //   5396: dup
    //   5397: bipush #46
    //   5399: ldc 2099202
    //   5401: iastore
    //   5402: dup
    //   5403: bipush #47
    //   5405: ldc 69208064
    //   5407: iastore
    //   5408: dup
    //   5409: bipush #48
    //   5411: sipush #2050
    //   5414: iastore
    //   5415: dup
    //   5416: bipush #49
    //   5418: ldc 67108866
    //   5420: iastore
    //   5421: dup
    //   5422: bipush #50
    //   5424: ldc 69208066
    //   5426: iastore
    //   5427: dup
    //   5428: bipush #51
    //   5430: ldc 69206016
    //   5432: iastore
    //   5433: dup
    //   5434: bipush #52
    //   5436: ldc 2099200
    //   5438: iastore
    //   5439: dup
    //   5440: bipush #53
    //   5442: iconst_0
    //   5443: iastore
    //   5444: dup
    //   5445: bipush #54
    //   5447: iconst_2
    //   5448: iastore
    //   5449: dup
    //   5450: bipush #55
    //   5452: ldc 69208066
    //   5454: iastore
    //   5455: dup
    //   5456: bipush #56
    //   5458: iconst_0
    //   5459: iastore
    //   5460: dup
    //   5461: bipush #57
    //   5463: ldc 2099202
    //   5465: iastore
    //   5466: dup
    //   5467: bipush #58
    //   5469: ldc 69206016
    //   5471: iastore
    //   5472: dup
    //   5473: bipush #59
    //   5475: sipush #2048
    //   5478: iastore
    //   5479: dup
    //   5480: bipush #60
    //   5482: ldc 67108866
    //   5484: iastore
    //   5485: dup
    //   5486: bipush #61
    //   5488: ldc 67110912
    //   5490: iastore
    //   5491: dup
    //   5492: bipush #62
    //   5494: sipush #2048
    //   5497: iastore
    //   5498: dup
    //   5499: bipush #63
    //   5501: ldc 2097154
    //   5503: iastore
    //   5504: astore #14
    //   5506: bipush #64
    //   5508: newarray int
    //   5510: dup
    //   5511: iconst_0
    //   5512: ldc 268439616
    //   5514: iastore
    //   5515: dup
    //   5516: iconst_1
    //   5517: sipush #4096
    //   5520: iastore
    //   5521: dup
    //   5522: iconst_2
    //   5523: ldc 262144
    //   5525: iastore
    //   5526: dup
    //   5527: iconst_3
    //   5528: ldc 268701760
    //   5530: iastore
    //   5531: dup
    //   5532: iconst_4
    //   5533: ldc 268435456
    //   5535: iastore
    //   5536: dup
    //   5537: iconst_5
    //   5538: ldc 268439616
    //   5540: iastore
    //   5541: dup
    //   5542: bipush #6
    //   5544: bipush #64
    //   5546: iastore
    //   5547: dup
    //   5548: bipush #7
    //   5550: ldc 268435456
    //   5552: iastore
    //   5553: dup
    //   5554: bipush #8
    //   5556: ldc 262208
    //   5558: iastore
    //   5559: dup
    //   5560: bipush #9
    //   5562: ldc 268697600
    //   5564: iastore
    //   5565: dup
    //   5566: bipush #10
    //   5568: ldc 268701760
    //   5570: iastore
    //   5571: dup
    //   5572: bipush #11
    //   5574: ldc 266240
    //   5576: iastore
    //   5577: dup
    //   5578: bipush #12
    //   5580: ldc 268701696
    //   5582: iastore
    //   5583: dup
    //   5584: bipush #13
    //   5586: ldc 266304
    //   5588: iastore
    //   5589: dup
    //   5590: bipush #14
    //   5592: sipush #4096
    //   5595: iastore
    //   5596: dup
    //   5597: bipush #15
    //   5599: bipush #64
    //   5601: iastore
    //   5602: dup
    //   5603: bipush #16
    //   5605: ldc 268697600
    //   5607: iastore
    //   5608: dup
    //   5609: bipush #17
    //   5611: ldc 268435520
    //   5613: iastore
    //   5614: dup
    //   5615: bipush #18
    //   5617: ldc 268439552
    //   5619: iastore
    //   5620: dup
    //   5621: bipush #19
    //   5623: sipush #4160
    //   5626: iastore
    //   5627: dup
    //   5628: bipush #20
    //   5630: ldc 266240
    //   5632: iastore
    //   5633: dup
    //   5634: bipush #21
    //   5636: ldc 262208
    //   5638: iastore
    //   5639: dup
    //   5640: bipush #22
    //   5642: ldc 268697664
    //   5644: iastore
    //   5645: dup
    //   5646: bipush #23
    //   5648: ldc 268701696
    //   5650: iastore
    //   5651: dup
    //   5652: bipush #24
    //   5654: sipush #4160
    //   5657: iastore
    //   5658: dup
    //   5659: bipush #25
    //   5661: iconst_0
    //   5662: iastore
    //   5663: dup
    //   5664: bipush #26
    //   5666: iconst_0
    //   5667: iastore
    //   5668: dup
    //   5669: bipush #27
    //   5671: ldc 268697664
    //   5673: iastore
    //   5674: dup
    //   5675: bipush #28
    //   5677: ldc 268435520
    //   5679: iastore
    //   5680: dup
    //   5681: bipush #29
    //   5683: ldc 268439552
    //   5685: iastore
    //   5686: dup
    //   5687: bipush #30
    //   5689: ldc 266304
    //   5691: iastore
    //   5692: dup
    //   5693: bipush #31
    //   5695: ldc 262144
    //   5697: iastore
    //   5698: dup
    //   5699: bipush #32
    //   5701: ldc 266304
    //   5703: iastore
    //   5704: dup
    //   5705: bipush #33
    //   5707: ldc 262144
    //   5709: iastore
    //   5710: dup
    //   5711: bipush #34
    //   5713: ldc 268701696
    //   5715: iastore
    //   5716: dup
    //   5717: bipush #35
    //   5719: sipush #4096
    //   5722: iastore
    //   5723: dup
    //   5724: bipush #36
    //   5726: bipush #64
    //   5728: iastore
    //   5729: dup
    //   5730: bipush #37
    //   5732: ldc 268697664
    //   5734: iastore
    //   5735: dup
    //   5736: bipush #38
    //   5738: sipush #4096
    //   5741: iastore
    //   5742: dup
    //   5743: bipush #39
    //   5745: ldc 266304
    //   5747: iastore
    //   5748: dup
    //   5749: bipush #40
    //   5751: ldc 268439552
    //   5753: iastore
    //   5754: dup
    //   5755: bipush #41
    //   5757: bipush #64
    //   5759: iastore
    //   5760: dup
    //   5761: bipush #42
    //   5763: ldc 268435520
    //   5765: iastore
    //   5766: dup
    //   5767: bipush #43
    //   5769: ldc 268697600
    //   5771: iastore
    //   5772: dup
    //   5773: bipush #44
    //   5775: ldc 268697664
    //   5777: iastore
    //   5778: dup
    //   5779: bipush #45
    //   5781: ldc 268435456
    //   5783: iastore
    //   5784: dup
    //   5785: bipush #46
    //   5787: ldc 262144
    //   5789: iastore
    //   5790: dup
    //   5791: bipush #47
    //   5793: ldc 268439616
    //   5795: iastore
    //   5796: dup
    //   5797: bipush #48
    //   5799: iconst_0
    //   5800: iastore
    //   5801: dup
    //   5802: bipush #49
    //   5804: ldc 268701760
    //   5806: iastore
    //   5807: dup
    //   5808: bipush #50
    //   5810: ldc 262208
    //   5812: iastore
    //   5813: dup
    //   5814: bipush #51
    //   5816: ldc 268435520
    //   5818: iastore
    //   5819: dup
    //   5820: bipush #52
    //   5822: ldc 268697600
    //   5824: iastore
    //   5825: dup
    //   5826: bipush #53
    //   5828: ldc 268439552
    //   5830: iastore
    //   5831: dup
    //   5832: bipush #54
    //   5834: ldc 268439616
    //   5836: iastore
    //   5837: dup
    //   5838: bipush #55
    //   5840: iconst_0
    //   5841: iastore
    //   5842: dup
    //   5843: bipush #56
    //   5845: ldc 268701760
    //   5847: iastore
    //   5848: dup
    //   5849: bipush #57
    //   5851: ldc 266240
    //   5853: iastore
    //   5854: dup
    //   5855: bipush #58
    //   5857: ldc 266240
    //   5859: iastore
    //   5860: dup
    //   5861: bipush #59
    //   5863: sipush #4160
    //   5866: iastore
    //   5867: dup
    //   5868: bipush #60
    //   5870: sipush #4160
    //   5873: iastore
    //   5874: dup
    //   5875: bipush #61
    //   5877: ldc 262208
    //   5879: iastore
    //   5880: dup
    //   5881: bipush #62
    //   5883: ldc 268435456
    //   5885: iastore
    //   5886: dup
    //   5887: bipush #63
    //   5889: ldc 268701696
    //   5891: iastore
    //   5892: astore #15
    //   5894: aload_3
    //   5895: arraylength
    //   5896: istore #16
    //   5898: iconst_2
    //   5899: newarray int
    //   5901: astore #17
    //   5903: iload #16
    //   5905: newarray byte
    //   5907: astore #4
    //   5909: iload #16
    //   5911: bipush #8
    //   5913: idiv
    //   5914: istore #18
    //   5916: iconst_0
    //   5917: istore #19
    //   5919: iload #19
    //   5921: iload #18
    //   5923: if_icmpge -> 6837
    //   5926: iload #19
    //   5928: bipush #8
    //   5930: imul
    //   5931: istore #20
    //   5933: iconst_0
    //   5934: istore #21
    //   5936: iload #21
    //   5938: iconst_2
    //   5939: if_icmpge -> 6024
    //   5942: aload #17
    //   5944: iload #21
    //   5946: aload_3
    //   5947: iload #20
    //   5949: iload #21
    //   5951: iconst_4
    //   5952: imul
    //   5953: iadd
    //   5954: baload
    //   5955: sipush #255
    //   5958: iand
    //   5959: bipush #24
    //   5961: ishl
    //   5962: aload_3
    //   5963: iload #20
    //   5965: iload #21
    //   5967: iconst_4
    //   5968: imul
    //   5969: iadd
    //   5970: iconst_1
    //   5971: iadd
    //   5972: baload
    //   5973: sipush #255
    //   5976: iand
    //   5977: bipush #16
    //   5979: ishl
    //   5980: ior
    //   5981: aload_3
    //   5982: iload #20
    //   5984: iload #21
    //   5986: iconst_4
    //   5987: imul
    //   5988: iadd
    //   5989: iconst_2
    //   5990: iadd
    //   5991: baload
    //   5992: sipush #255
    //   5995: iand
    //   5996: bipush #8
    //   5998: ishl
    //   5999: ior
    //   6000: aload_3
    //   6001: iload #20
    //   6003: iload #21
    //   6005: iconst_4
    //   6006: imul
    //   6007: iadd
    //   6008: iconst_3
    //   6009: iadd
    //   6010: baload
    //   6011: sipush #255
    //   6014: iand
    //   6015: ior
    //   6016: iastore
    //   6017: iinc #21, 1
    //   6020: iload_2
    //   6021: ifeq -> 5936
    //   6024: iconst_0
    //   6025: istore #26
    //   6027: aload #17
    //   6029: iconst_0
    //   6030: iaload
    //   6031: istore #24
    //   6033: aload #17
    //   6035: iconst_1
    //   6036: iaload
    //   6037: istore #23
    //   6039: iload #24
    //   6041: iconst_4
    //   6042: iushr
    //   6043: iload #23
    //   6045: ixor
    //   6046: ldc 252645135
    //   6048: iand
    //   6049: istore #22
    //   6051: iload #23
    //   6053: iload #22
    //   6055: ixor
    //   6056: istore #23
    //   6058: iload #24
    //   6060: iload #22
    //   6062: iconst_4
    //   6063: ishl
    //   6064: ixor
    //   6065: istore #24
    //   6067: iload #24
    //   6069: bipush #16
    //   6071: iushr
    //   6072: iload #23
    //   6074: ixor
    //   6075: ldc 65535
    //   6077: iand
    //   6078: istore #22
    //   6080: iload #23
    //   6082: iload #22
    //   6084: ixor
    //   6085: istore #23
    //   6087: iload #24
    //   6089: iload #22
    //   6091: bipush #16
    //   6093: ishl
    //   6094: ixor
    //   6095: istore #24
    //   6097: iload #23
    //   6099: iconst_2
    //   6100: iushr
    //   6101: iload #24
    //   6103: ixor
    //   6104: ldc 858993459
    //   6106: iand
    //   6107: istore #22
    //   6109: iload #24
    //   6111: iload #22
    //   6113: ixor
    //   6114: istore #24
    //   6116: iload #23
    //   6118: iload #22
    //   6120: iconst_2
    //   6121: ishl
    //   6122: ixor
    //   6123: istore #23
    //   6125: iload #23
    //   6127: bipush #8
    //   6129: iushr
    //   6130: iload #24
    //   6132: ixor
    //   6133: ldc 16711935
    //   6135: iand
    //   6136: istore #22
    //   6138: iload #24
    //   6140: iload #22
    //   6142: ixor
    //   6143: istore #24
    //   6145: iload #23
    //   6147: iload #22
    //   6149: bipush #8
    //   6151: ishl
    //   6152: ixor
    //   6153: istore #23
    //   6155: iload #23
    //   6157: iconst_1
    //   6158: ishl
    //   6159: iload #23
    //   6161: bipush #31
    //   6163: iushr
    //   6164: iconst_1
    //   6165: iand
    //   6166: ior
    //   6167: istore #23
    //   6169: iload #24
    //   6171: iload #23
    //   6173: ixor
    //   6174: ldc -1431655766
    //   6176: iand
    //   6177: istore #22
    //   6179: iload #24
    //   6181: iload #22
    //   6183: ixor
    //   6184: istore #24
    //   6186: iload #23
    //   6188: iload #22
    //   6190: ixor
    //   6191: istore #23
    //   6193: iload #24
    //   6195: iconst_1
    //   6196: ishl
    //   6197: iload #24
    //   6199: bipush #31
    //   6201: iushr
    //   6202: iconst_1
    //   6203: iand
    //   6204: ior
    //   6205: istore #24
    //   6207: iconst_0
    //   6208: istore #25
    //   6210: iload #25
    //   6212: bipush #8
    //   6214: if_icmpge -> 6552
    //   6217: iload #23
    //   6219: bipush #28
    //   6221: ishl
    //   6222: iload #23
    //   6224: iconst_4
    //   6225: iushr
    //   6226: ior
    //   6227: istore #22
    //   6229: iload #22
    //   6231: aload #5
    //   6233: iload #26
    //   6235: iinc #26, 1
    //   6238: iaload
    //   6239: ixor
    //   6240: istore #22
    //   6242: aload #14
    //   6244: iload #22
    //   6246: bipush #63
    //   6248: iand
    //   6249: iaload
    //   6250: istore #21
    //   6252: iload #21
    //   6254: aload #12
    //   6256: iload #22
    //   6258: bipush #8
    //   6260: iushr
    //   6261: bipush #63
    //   6263: iand
    //   6264: iaload
    //   6265: ior
    //   6266: istore #21
    //   6268: iload #21
    //   6270: aload #10
    //   6272: iload #22
    //   6274: bipush #16
    //   6276: iushr
    //   6277: bipush #63
    //   6279: iand
    //   6280: iaload
    //   6281: ior
    //   6282: istore #21
    //   6284: iload #21
    //   6286: aload #8
    //   6288: iload #22
    //   6290: bipush #24
    //   6292: iushr
    //   6293: bipush #63
    //   6295: iand
    //   6296: iaload
    //   6297: ior
    //   6298: istore #21
    //   6300: iload #23
    //   6302: aload #5
    //   6304: iload #26
    //   6306: iinc #26, 1
    //   6309: iaload
    //   6310: ixor
    //   6311: istore #22
    //   6313: iload #21
    //   6315: aload #15
    //   6317: iload #22
    //   6319: bipush #63
    //   6321: iand
    //   6322: iaload
    //   6323: ior
    //   6324: istore #21
    //   6326: iload #21
    //   6328: aload #13
    //   6330: iload #22
    //   6332: bipush #8
    //   6334: iushr
    //   6335: bipush #63
    //   6337: iand
    //   6338: iaload
    //   6339: ior
    //   6340: istore #21
    //   6342: iload #21
    //   6344: aload #11
    //   6346: iload #22
    //   6348: bipush #16
    //   6350: iushr
    //   6351: bipush #63
    //   6353: iand
    //   6354: iaload
    //   6355: ior
    //   6356: istore #21
    //   6358: iload #21
    //   6360: aload #9
    //   6362: iload #22
    //   6364: bipush #24
    //   6366: iushr
    //   6367: bipush #63
    //   6369: iand
    //   6370: iaload
    //   6371: ior
    //   6372: istore #21
    //   6374: iload #24
    //   6376: iload #21
    //   6378: ixor
    //   6379: istore #24
    //   6381: iload #24
    //   6383: bipush #28
    //   6385: ishl
    //   6386: iload #24
    //   6388: iconst_4
    //   6389: iushr
    //   6390: ior
    //   6391: istore #22
    //   6393: iload #22
    //   6395: aload #5
    //   6397: iload #26
    //   6399: iinc #26, 1
    //   6402: iaload
    //   6403: ixor
    //   6404: istore #22
    //   6406: aload #14
    //   6408: iload #22
    //   6410: bipush #63
    //   6412: iand
    //   6413: iaload
    //   6414: istore #21
    //   6416: iload #21
    //   6418: aload #12
    //   6420: iload #22
    //   6422: bipush #8
    //   6424: iushr
    //   6425: bipush #63
    //   6427: iand
    //   6428: iaload
    //   6429: ior
    //   6430: istore #21
    //   6432: iload #21
    //   6434: aload #10
    //   6436: iload #22
    //   6438: bipush #16
    //   6440: iushr
    //   6441: bipush #63
    //   6443: iand
    //   6444: iaload
    //   6445: ior
    //   6446: istore #21
    //   6448: iload #21
    //   6450: aload #8
    //   6452: iload #22
    //   6454: bipush #24
    //   6456: iushr
    //   6457: bipush #63
    //   6459: iand
    //   6460: iaload
    //   6461: ior
    //   6462: istore #21
    //   6464: iload #24
    //   6466: aload #5
    //   6468: iload #26
    //   6470: iinc #26, 1
    //   6473: iaload
    //   6474: ixor
    //   6475: istore #22
    //   6477: iload #21
    //   6479: aload #15
    //   6481: iload #22
    //   6483: bipush #63
    //   6485: iand
    //   6486: iaload
    //   6487: ior
    //   6488: istore #21
    //   6490: iload #21
    //   6492: aload #13
    //   6494: iload #22
    //   6496: bipush #8
    //   6498: iushr
    //   6499: bipush #63
    //   6501: iand
    //   6502: iaload
    //   6503: ior
    //   6504: istore #21
    //   6506: iload #21
    //   6508: aload #11
    //   6510: iload #22
    //   6512: bipush #16
    //   6514: iushr
    //   6515: bipush #63
    //   6517: iand
    //   6518: iaload
    //   6519: ior
    //   6520: istore #21
    //   6522: iload #21
    //   6524: aload #9
    //   6526: iload #22
    //   6528: bipush #24
    //   6530: iushr
    //   6531: bipush #63
    //   6533: iand
    //   6534: iaload
    //   6535: ior
    //   6536: istore #21
    //   6538: iload #23
    //   6540: iload #21
    //   6542: ixor
    //   6543: istore #23
    //   6545: iinc #25, 1
    //   6548: iload_2
    //   6549: ifeq -> 6210
    //   6552: iload #23
    //   6554: bipush #31
    //   6556: ishl
    //   6557: iload #23
    //   6559: iconst_1
    //   6560: iushr
    //   6561: ior
    //   6562: istore #23
    //   6564: iload #24
    //   6566: iload #23
    //   6568: ixor
    //   6569: ldc -1431655766
    //   6571: iand
    //   6572: istore #22
    //   6574: iload #24
    //   6576: iload #22
    //   6578: ixor
    //   6579: istore #24
    //   6581: iload #23
    //   6583: iload #22
    //   6585: ixor
    //   6586: istore #23
    //   6588: iload #24
    //   6590: bipush #31
    //   6592: ishl
    //   6593: iload #24
    //   6595: iconst_1
    //   6596: iushr
    //   6597: ior
    //   6598: istore #24
    //   6600: iload #24
    //   6602: bipush #8
    //   6604: iushr
    //   6605: iload #23
    //   6607: ixor
    //   6608: ldc 16711935
    //   6610: iand
    //   6611: istore #22
    //   6613: iload #23
    //   6615: iload #22
    //   6617: ixor
    //   6618: istore #23
    //   6620: iload #24
    //   6622: iload #22
    //   6624: bipush #8
    //   6626: ishl
    //   6627: ixor
    //   6628: istore #24
    //   6630: iload #24
    //   6632: iconst_2
    //   6633: iushr
    //   6634: iload #23
    //   6636: ixor
    //   6637: ldc 858993459
    //   6639: iand
    //   6640: istore #22
    //   6642: iload #23
    //   6644: iload #22
    //   6646: ixor
    //   6647: istore #23
    //   6649: iload #24
    //   6651: iload #22
    //   6653: iconst_2
    //   6654: ishl
    //   6655: ixor
    //   6656: istore #24
    //   6658: iload #23
    //   6660: bipush #16
    //   6662: iushr
    //   6663: iload #24
    //   6665: ixor
    //   6666: ldc 65535
    //   6668: iand
    //   6669: istore #22
    //   6671: iload #24
    //   6673: iload #22
    //   6675: ixor
    //   6676: istore #24
    //   6678: iload #23
    //   6680: iload #22
    //   6682: bipush #16
    //   6684: ishl
    //   6685: ixor
    //   6686: istore #23
    //   6688: iload #23
    //   6690: iconst_4
    //   6691: iushr
    //   6692: iload #24
    //   6694: ixor
    //   6695: ldc 252645135
    //   6697: iand
    //   6698: istore #22
    //   6700: iload #24
    //   6702: iload #22
    //   6704: ixor
    //   6705: istore #24
    //   6707: iload #23
    //   6709: iload #22
    //   6711: iconst_4
    //   6712: ishl
    //   6713: ixor
    //   6714: istore #23
    //   6716: aload #17
    //   6718: iconst_0
    //   6719: iload #23
    //   6721: iastore
    //   6722: aload #17
    //   6724: iconst_1
    //   6725: iload #24
    //   6727: iastore
    //   6728: iload #19
    //   6730: bipush #8
    //   6732: imul
    //   6733: istore #27
    //   6735: iconst_0
    //   6736: istore #28
    //   6738: iload #28
    //   6740: iconst_2
    //   6741: if_icmpge -> 6830
    //   6744: aload #4
    //   6746: iload #27
    //   6748: iload #28
    //   6750: iconst_4
    //   6751: imul
    //   6752: iadd
    //   6753: aload #17
    //   6755: iload #28
    //   6757: iaload
    //   6758: bipush #24
    //   6760: iushr
    //   6761: i2b
    //   6762: bastore
    //   6763: aload #4
    //   6765: iload #27
    //   6767: iload #28
    //   6769: iconst_4
    //   6770: imul
    //   6771: iadd
    //   6772: iconst_1
    //   6773: iadd
    //   6774: aload #17
    //   6776: iload #28
    //   6778: iaload
    //   6779: bipush #16
    //   6781: iushr
    //   6782: i2b
    //   6783: bastore
    //   6784: aload #4
    //   6786: iload #27
    //   6788: iload #28
    //   6790: iconst_4
    //   6791: imul
    //   6792: iadd
    //   6793: iconst_2
    //   6794: iadd
    //   6795: aload #17
    //   6797: iload #28
    //   6799: iaload
    //   6800: bipush #8
    //   6802: iushr
    //   6803: i2b
    //   6804: bastore
    //   6805: aload #4
    //   6807: iload #27
    //   6809: iload #28
    //   6811: iconst_4
    //   6812: imul
    //   6813: iadd
    //   6814: iconst_3
    //   6815: iadd
    //   6816: aload #17
    //   6818: iload #28
    //   6820: iaload
    //   6821: i2b
    //   6822: bastore
    //   6823: iinc #28, 1
    //   6826: iload_2
    //   6827: ifeq -> 6738
    //   6830: iinc #19, 1
    //   6833: iload_2
    //   6834: ifeq -> 5919
    //   6837: new java/math/BigInteger
    //   6840: dup
    //   6841: aload #4
    //   6843: invokespecial <init> : ([B)V
    //   6846: invokevirtual abs : ()Ljava/math/BigInteger;
    //   6849: putstatic burp/Zb_c.ZN : Ljava/lang/Object;
    //   6852: sipush #24801
    //   6855: getstatic burp/Zmh5.ZN : Ljava/lang/Object;
    //   6858: checkcast java/math/BigInteger
    //   6861: getstatic burp/Zr4k.Zf : Ljava/lang/Object;
    //   6864: checkcast java/math/BigInteger
    //   6867: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   6870: putstatic burp/Zezq.Zu : Ljava/lang/Object;
    //   6873: sipush #-6483
    //   6876: invokestatic a : (II)Ljava/lang/String;
    //   6879: iconst_1
    //   6880: ldc burp/Zxyp
    //   6882: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6885: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6888: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6891: astore_3
    //   6892: aload_3
    //   6893: arraylength
    //   6894: istore #4
    //   6896: iconst_0
    //   6897: istore #5
    //   6899: iload #5
    //   6901: iload #4
    //   6903: if_icmpge -> 7040
    //   6906: aload_3
    //   6907: iload #5
    //   6909: aaload
    //   6910: astore #6
    //   6912: aload #6
    //   6914: invokevirtual getModifiers : ()I
    //   6917: invokestatic isStatic : (I)Z
    //   6920: ifne -> 6930
    //   6923: goto -> 7033
    //   6926: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6929: athrow
    //   6930: aload #6
    //   6932: invokevirtual getType : ()Ljava/lang/Class;
    //   6935: astore #7
    //   6937: aload #7
    //   6939: ifnull -> 7020
    //   6942: aload #7
    //   6944: invokevirtual isPrimitive : ()Z
    //   6947: ifne -> 7020
    //   6950: goto -> 6957
    //   6953: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6956: athrow
    //   6957: aload #7
    //   6959: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6962: ifnull -> 7020
    //   6965: goto -> 6972
    //   6968: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6971: athrow
    //   6972: aload #7
    //   6974: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6977: invokevirtual getName : ()Ljava/lang/String;
    //   6980: ifnull -> 7020
    //   6983: goto -> 6990
    //   6986: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6989: athrow
    //   6990: aload #7
    //   6992: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6995: invokevirtual getName : ()Ljava/lang/String;
    //   6998: sipush #24802
    //   7001: sipush #17627
    //   7004: invokestatic a : (II)Ljava/lang/String;
    //   7007: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7010: ifne -> 7020
    //   7013: goto -> 7020
    //   7016: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7019: athrow
    //   7020: aload #6
    //   7022: iconst_1
    //   7023: invokevirtual setAccessible : (Z)V
    //   7026: aload #6
    //   7028: aconst_null
    //   7029: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7032: pop
    //   7033: iinc #5, 1
    //   7036: iload_2
    //   7037: ifeq -> 6899
    //   7040: sipush #24811
    //   7043: sipush #-13890
    //   7046: invokestatic a : (II)Ljava/lang/String;
    //   7049: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7052: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7055: astore_3
    //   7056: aload_3
    //   7057: arraylength
    //   7058: istore #4
    //   7060: iconst_0
    //   7061: istore #5
    //   7063: iload #5
    //   7065: iload #4
    //   7067: if_icmpge -> 7199
    //   7070: aload_3
    //   7071: iload #5
    //   7073: aaload
    //   7074: astore #6
    //   7076: aload #6
    //   7078: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7081: pop
    //   7082: aload #6
    //   7084: invokevirtual getModifiers : ()I
    //   7087: invokestatic isStatic : (I)Z
    //   7090: ifeq -> 7185
    //   7093: aload #6
    //   7095: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7098: arraylength
    //   7099: iconst_2
    //   7100: if_icmpne -> 7185
    //   7103: goto -> 7110
    //   7106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7109: athrow
    //   7110: aload #6
    //   7112: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7115: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   7118: invokevirtual equals : (Ljava/lang/Object;)Z
    //   7121: ifeq -> 7185
    //   7124: goto -> 7131
    //   7127: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7130: athrow
    //   7131: aload #6
    //   7133: iconst_1
    //   7134: invokevirtual setAccessible : (Z)V
    //   7137: aload #6
    //   7139: aconst_null
    //   7140: iconst_2
    //   7141: anewarray java/lang/Object
    //   7144: dup
    //   7145: iconst_0
    //   7146: aload_0
    //   7147: aastore
    //   7148: dup
    //   7149: iconst_1
    //   7150: aload_1
    //   7151: ifnonnull -> 7169
    //   7154: goto -> 7161
    //   7157: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7160: athrow
    //   7161: aload_1
    //   7162: goto -> 7176
    //   7165: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7168: athrow
    //   7169: aload_1
    //   7170: checkcast [B
    //   7173: invokevirtual clone : ()Ljava/lang/Object;
    //   7176: aastore
    //   7177: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7180: pop
    //   7181: iload_2
    //   7182: ifeq -> 7199
    //   7185: iinc #5, 1
    //   7188: iload_2
    //   7189: ifeq -> 7063
    //   7192: goto -> 7199
    //   7195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7198: athrow
    //   7199: getstatic burp/Ztod.ZP : Ljava/lang/Object;
    //   7202: checkcast java/math/BigInteger
    //   7205: invokevirtual toByteArray : ()[B
    //   7208: astore_3
    //   7209: aload_3
    //   7210: arraylength
    //   7211: bipush #8
    //   7213: iadd
    //   7214: bipush #6
    //   7216: ishr
    //   7217: iconst_1
    //   7218: iadd
    //   7219: bipush #16
    //   7221: imul
    //   7222: newarray int
    //   7224: astore #5
    //   7226: iconst_0
    //   7227: istore #6
    //   7229: iload #6
    //   7231: aload_3
    //   7232: arraylength
    //   7233: if_icmpge -> 7276
    //   7236: aload_3
    //   7237: iload #6
    //   7239: baload
    //   7240: sipush #255
    //   7243: iand
    //   7244: istore #7
    //   7246: aload #5
    //   7248: iload #6
    //   7250: iconst_2
    //   7251: ishr
    //   7252: dup2
    //   7253: iaload
    //   7254: iload #7
    //   7256: bipush #24
    //   7258: iload #6
    //   7260: iconst_4
    //   7261: irem
    //   7262: bipush #8
    //   7264: imul
    //   7265: isub
    //   7266: ishl
    //   7267: ior
    //   7268: iastore
    //   7269: iinc #6, 1
    //   7272: iload_2
    //   7273: ifeq -> 7229
    //   7276: aload #5
    //   7278: iload #6
    //   7280: iconst_2
    //   7281: ishr
    //   7282: dup2
    //   7283: iaload
    //   7284: sipush #128
    //   7287: bipush #24
    //   7289: iload #6
    //   7291: iconst_4
    //   7292: irem
    //   7293: bipush #8
    //   7295: imul
    //   7296: isub
    //   7297: ishl
    //   7298: ior
    //   7299: iastore
    //   7300: aload #5
    //   7302: aload #5
    //   7304: arraylength
    //   7305: iconst_1
    //   7306: isub
    //   7307: aload_3
    //   7308: arraylength
    //   7309: bipush #8
    //   7311: imul
    //   7312: iastore
    //   7313: bipush #80
    //   7315: newarray int
    //   7317: astore #7
    //   7319: ldc 1732584193
    //   7321: istore #8
    //   7323: ldc -271733879
    //   7325: istore #9
    //   7327: ldc -1732584194
    //   7329: istore #10
    //   7331: ldc 271733878
    //   7333: istore #11
    //   7335: ldc -1009589776
    //   7337: istore #12
    //   7339: iconst_0
    //   7340: istore #6
    //   7342: iload #6
    //   7344: aload #5
    //   7346: arraylength
    //   7347: if_icmpge -> 7669
    //   7350: iload #8
    //   7352: istore #13
    //   7354: iload #9
    //   7356: istore #14
    //   7358: iload #10
    //   7360: istore #15
    //   7362: iload #11
    //   7364: istore #16
    //   7366: iload #12
    //   7368: istore #17
    //   7370: iconst_0
    //   7371: istore #18
    //   7373: iload #18
    //   7375: bipush #80
    //   7377: if_icmpge -> 7627
    //   7380: iload #18
    //   7382: bipush #16
    //   7384: if_icmpge -> 7411
    //   7387: aload #7
    //   7389: iload #18
    //   7391: aload #5
    //   7393: iload #6
    //   7395: iload #18
    //   7397: iadd
    //   7398: iaload
    //   7399: iastore
    //   7400: iload_2
    //   7401: ifeq -> 7466
    //   7404: goto -> 7411
    //   7407: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7410: athrow
    //   7411: aload #7
    //   7413: iload #18
    //   7415: iconst_3
    //   7416: isub
    //   7417: iaload
    //   7418: aload #7
    //   7420: iload #18
    //   7422: bipush #8
    //   7424: isub
    //   7425: iaload
    //   7426: ixor
    //   7427: aload #7
    //   7429: iload #18
    //   7431: bipush #14
    //   7433: isub
    //   7434: iaload
    //   7435: ixor
    //   7436: aload #7
    //   7438: iload #18
    //   7440: bipush #16
    //   7442: isub
    //   7443: iaload
    //   7444: ixor
    //   7445: istore #19
    //   7447: iload #19
    //   7449: iconst_1
    //   7450: ishl
    //   7451: iload #19
    //   7453: bipush #31
    //   7455: iushr
    //   7456: ior
    //   7457: istore #20
    //   7459: aload #7
    //   7461: iload #18
    //   7463: iload #20
    //   7465: iastore
    //   7466: iload #8
    //   7468: iconst_5
    //   7469: ishl
    //   7470: iload #8
    //   7472: bipush #27
    //   7474: iushr
    //   7475: ior
    //   7476: istore #19
    //   7478: iload #19
    //   7480: iload #12
    //   7482: iadd
    //   7483: aload #7
    //   7485: iload #18
    //   7487: iaload
    //   7488: iadd
    //   7489: iload #18
    //   7491: bipush #20
    //   7493: if_icmpge -> 7519
    //   7496: ldc 1518500249
    //   7498: iload #9
    //   7500: iload #10
    //   7502: iand
    //   7503: iload #9
    //   7505: iconst_m1
    //   7506: ixor
    //   7507: iload #11
    //   7509: iand
    //   7510: ior
    //   7511: iadd
    //   7512: goto -> 7589
    //   7515: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7518: athrow
    //   7519: iload #18
    //   7521: bipush #40
    //   7523: if_icmpge -> 7544
    //   7526: ldc 1859775393
    //   7528: iload #9
    //   7530: iload #10
    //   7532: ixor
    //   7533: iload #11
    //   7535: ixor
    //   7536: iadd
    //   7537: goto -> 7589
    //   7540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7543: athrow
    //   7544: iload #18
    //   7546: bipush #60
    //   7548: if_icmpge -> 7578
    //   7551: ldc -1894007588
    //   7553: iload #9
    //   7555: iload #10
    //   7557: iand
    //   7558: iload #9
    //   7560: iload #11
    //   7562: iand
    //   7563: ior
    //   7564: iload #10
    //   7566: iload #11
    //   7568: iand
    //   7569: ior
    //   7570: iadd
    //   7571: goto -> 7589
    //   7574: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7577: athrow
    //   7578: ldc -899497514
    //   7580: iload #9
    //   7582: iload #10
    //   7584: ixor
    //   7585: iload #11
    //   7587: ixor
    //   7588: iadd
    //   7589: iadd
    //   7590: istore #20
    //   7592: iload #11
    //   7594: istore #12
    //   7596: iload #10
    //   7598: istore #11
    //   7600: iload #9
    //   7602: bipush #30
    //   7604: ishl
    //   7605: iload #9
    //   7607: iconst_2
    //   7608: iushr
    //   7609: ior
    //   7610: istore #10
    //   7612: iload #8
    //   7614: istore #9
    //   7616: iload #20
    //   7618: istore #8
    //   7620: iinc #18, 1
    //   7623: iload_2
    //   7624: ifeq -> 7373
    //   7627: iload #8
    //   7629: iload #13
    //   7631: iadd
    //   7632: istore #8
    //   7634: iload #9
    //   7636: iload #14
    //   7638: iadd
    //   7639: istore #9
    //   7641: iload #10
    //   7643: iload #15
    //   7645: iadd
    //   7646: istore #10
    //   7648: iload #11
    //   7650: iload #16
    //   7652: iadd
    //   7653: istore #11
    //   7655: iload #12
    //   7657: iload #17
    //   7659: iadd
    //   7660: istore #12
    //   7662: iinc #6, 16
    //   7665: iload_2
    //   7666: ifeq -> 7342
    //   7669: iconst_5
    //   7670: newarray int
    //   7672: dup
    //   7673: iconst_0
    //   7674: iload #8
    //   7676: iastore
    //   7677: dup
    //   7678: iconst_1
    //   7679: iload #9
    //   7681: iastore
    //   7682: dup
    //   7683: iconst_2
    //   7684: iload #10
    //   7686: iastore
    //   7687: dup
    //   7688: iconst_3
    //   7689: iload #11
    //   7691: iastore
    //   7692: dup
    //   7693: iconst_4
    //   7694: iload #12
    //   7696: iastore
    //   7697: astore #13
    //   7699: bipush #20
    //   7701: newarray byte
    //   7703: astore #14
    //   7705: iconst_0
    //   7706: istore #15
    //   7708: iload #15
    //   7710: bipush #20
    //   7712: if_icmpge -> 7753
    //   7715: aload #13
    //   7717: iload #15
    //   7719: iconst_4
    //   7720: idiv
    //   7721: iaload
    //   7722: istore #16
    //   7724: iconst_3
    //   7725: iload #15
    //   7727: iconst_4
    //   7728: irem
    //   7729: isub
    //   7730: bipush #8
    //   7732: imul
    //   7733: istore #17
    //   7735: aload #14
    //   7737: iload #15
    //   7739: iload #16
    //   7741: iload #17
    //   7743: iushr
    //   7744: i2b
    //   7745: bastore
    //   7746: iinc #15, 1
    //   7749: iload_2
    //   7750: ifeq -> 7708
    //   7753: aload #14
    //   7755: astore #4
    //   7757: getstatic burp/Ztdt.Zk : Ljava/lang/String;
    //   7760: getstatic burp/Zrj3.ZA : Ljava/lang/Object;
    //   7763: checkcast java/math/BigInteger
    //   7766: invokevirtual intValue : ()I
    //   7769: bipush #32
    //   7771: irem
    //   7772: invokestatic abs : (I)I
    //   7775: invokevirtual charAt : (I)C
    //   7778: getstatic burp/Zb_c.ZS : Ljava/lang/String;
    //   7781: getstatic burp/Zl22.ZJ : Ljava/lang/Object;
    //   7784: checkcast java/math/BigInteger
    //   7787: invokevirtual intValue : ()I
    //   7790: bipush #32
    //   7792: irem
    //   7793: invokestatic abs : (I)I
    //   7796: invokevirtual charAt : (I)C
    //   7799: if_icmpgt -> 7906
    //   7802: getstatic burp/Zgw7.ZN : Ljava/lang/String;
    //   7805: getstatic burp/Zz9v.Zl : Ljava/lang/Object;
    //   7808: checkcast java/math/BigInteger
    //   7811: invokevirtual intValue : ()I
    //   7814: bipush #32
    //   7816: irem
    //   7817: invokestatic abs : (I)I
    //   7820: invokevirtual charAt : (I)C
    //   7823: getstatic burp/Zzlg.Zw : Ljava/lang/String;
    //   7826: getstatic burp/Zsq5.ZF : Ljava/lang/Object;
    //   7829: checkcast java/math/BigInteger
    //   7832: invokevirtual intValue : ()I
    //   7835: bipush #32
    //   7837: irem
    //   7838: invokestatic abs : (I)I
    //   7841: invokevirtual charAt : (I)C
    //   7844: if_icmple -> 7906
    //   7847: goto -> 7854
    //   7850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7853: athrow
    //   7854: getstatic burp/Zkaw.ZI : Ljava/lang/String;
    //   7857: getstatic burp/Zkaw.ZB : Ljava/lang/Object;
    //   7860: checkcast java/math/BigInteger
    //   7863: invokevirtual intValue : ()I
    //   7866: bipush #32
    //   7868: irem
    //   7869: invokestatic abs : (I)I
    //   7872: invokevirtual charAt : (I)C
    //   7875: getstatic burp/Zm84.Zd : Ljava/lang/String;
    //   7878: getstatic burp/Zb6b.ZU : Ljava/lang/Object;
    //   7881: checkcast java/math/BigInteger
    //   7884: invokevirtual intValue : ()I
    //   7887: bipush #32
    //   7889: irem
    //   7890: invokestatic abs : (I)I
    //   7893: invokevirtual charAt : (I)C
    //   7896: if_icmpgt -> 7914
    //   7899: goto -> 7906
    //   7902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7905: athrow
    //   7906: iconst_1
    //   7907: goto -> 7915
    //   7910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7913: athrow
    //   7914: iconst_0
    //   7915: ireturn
    //   7916: astore_3
    //   7917: new java/lang/Exception
    //   7920: dup
    //   7921: aload_3
    //   7922: invokevirtual getMessage : ()Ljava/lang/String;
    //   7925: invokespecial <init> : (Ljava/lang/String;)V
    //   7928: athrow
    // Exception table:
    //   from	to	target	type
    //   4	7915	7916	java/lang/Throwable
    //   149	164	164	java/lang/Throwable
    //   1166	1192	1192	java/lang/Throwable
    //   1273	1288	1288	java/lang/Throwable
    //   2470	2495	2498	java/lang/Throwable
    //   6912	6926	6926	java/lang/Throwable
    //   6937	6950	6953	java/lang/Throwable
    //   6942	6965	6968	java/lang/Throwable
    //   6957	6983	6986	java/lang/Throwable
    //   6972	7013	7016	java/lang/Throwable
    //   7076	7103	7106	java/lang/Throwable
    //   7093	7124	7127	java/lang/Throwable
    //   7110	7154	7157	java/lang/Throwable
    //   7131	7165	7165	java/lang/Throwable
    //   7176	7192	7195	java/lang/Throwable
    //   7380	7404	7407	java/lang/Throwable
    //   7478	7515	7515	java/lang/Throwable
    //   7519	7540	7540	java/lang/Throwable
    //   7544	7574	7574	java/lang/Throwable
    //   7757	7847	7850	java/lang/Throwable
    //   7802	7899	7902	java/lang/Throwable
    //   7854	7910	7910	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'sR0Ý4>¤Mï`¶ ßØmëÞÍ8I6"Qyu]e´°g.¨¿ù¢/<nS2w÷ilzIö Æçò@/\\t×í捫眕澢〰朔ﻦꯣ쪥줕﫮䞜국ꋄ鰞狔랢鎵㘵㓍熦ㇳЁ⌖ᢟ׵߼聃뉲৔ⲙᬑ媓剬훙⧣⽦匤#⃊놹橝뻯䩉堺퀕꫓䌫㏗䖩ʬ僙龻兺䂓銩㠨벱?Ⴟ촭ᏼ彮䓥쐙繢摴ᥳ恕佾∭逖䘲렖?ଣ㫒䥝⑛싧갈酬㟝距事汔施껖뫬◫ᰕ뒆琀䯳譠灜뗨䢧慳埈蘪ᴟ顩椱蹛鯆螒칆⠀豀覅뾪䉨䇠⵱낻묀\\tôâäR®Õî0 ^âÿË_Ü+ú4ñüF¨«ºªVyRä_ 0aôÚøk»9W²Çà'­ @·Öòo½"ñv\\t§&¾åK援瞭澵ぎ柶︩ꮿ쩜즞𣏕䟭궊ꋪ鳢爑뜽錍㛆㒳煩ㆯӸ⎝ᢠքܛ聭늷ोⰡᯢ媄划혻⤬⼺叝¨⃵뇈檺뻁䪵壿킊ꩫ䏘㏀䗗Ɏ倖鿧冃䀘銖㡙뱖?၃춲ፄ徝䓲쑧纀撻᤯悬俵−遧䛕렸?௦㩪䦮⑌슙곪醣㝖跢仺河敁긓멳╓᳦뒑瓢䬼謼炥땣䢘憔埦蛖ᷚ飑槂蹌鮸蝰캉⡜貹褎뾕䈙䄇ⵟ끇믅qùìî\\f\-®\\tQ>_ôÍõúv'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #120
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'û6L\\t_¢ØíÖLh'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #95
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zry7.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zry7.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 258
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 240, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #14
    //   214: goto -> 242
    //   217: bipush #45
    //   219: goto -> 242
    //   222: bipush #26
    //   224: goto -> 242
    //   227: iconst_3
    //   228: goto -> 242
    //   231: bipush #40
    //   233: goto -> 242
    //   236: iconst_1
    //   237: goto -> 242
    //   240: bipush #100
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 165
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 161
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 40, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #91
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-27
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #7
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #74
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: iconst_0
    //   331: bastore
    //   332: dup
    //   333: iconst_5
    //   334: bipush #-99
    //   336: bastore
    //   337: dup
    //   338: bipush #6
    //   340: bipush #113
    //   342: bastore
    //   343: dup
    //   344: bipush #7
    //   346: bipush #46
    //   348: bastore
    //   349: dup
    //   350: bipush #8
    //   352: bipush #123
    //   354: bastore
    //   355: dup
    //   356: bipush #9
    //   358: bipush #-108
    //   360: bastore
    //   361: dup
    //   362: bipush #10
    //   364: bipush #-34
    //   366: bastore
    //   367: dup
    //   368: bipush #11
    //   370: bipush #-121
    //   372: bastore
    //   373: dup
    //   374: bipush #12
    //   376: bipush #-69
    //   378: bastore
    //   379: dup
    //   380: bipush #13
    //   382: bipush #55
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #-126
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #75
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #-31
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #23
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #6
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #-114
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #15
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #106
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #101
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #-103
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #110
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-117
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #79
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #37
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #-25
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-67
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-125
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #-50
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zry7.ZZ : Ljava/lang/Object;
    //   499: sipush #24815
    //   502: sipush #6572
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zry7.Z_ : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x60EB) & 0xFFFF;
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
      char c = 'å';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zry7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */