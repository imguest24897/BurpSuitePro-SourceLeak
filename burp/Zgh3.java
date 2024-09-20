package burp;

import java.math.BigInteger;

class Zgh3 extends ClassLoader {
  static Object ZZ;
  
  static String ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZT(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZV(Object paramObject) {
    Zmcb.Zl = a(-24573, -8877);
    Zmcb.ZR = new BigInteger(a(-24563, -13197));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zmcb.Zl.charAt(Math.abs(((BigInteger)Zzi3.ZJ).intValue() % 32)) <= Ztgt.ZQ.charAt(Math.abs(((BigInteger)Zeoa.ZF).intValue() % 32))) {
          try {
            Zluk.Zh(Class.forName(a(-24567, 15857)));
            if (bool)
              Zrd0.Zs(Class.forName(a(-24564, -11547))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrd0.Zs(Class.forName(a(-24564, -11547)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZC(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: getstatic burp/Zrc0.ZL : Ljava/lang/String;
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
    //   63: getstatic burp/Zss8.ZO : Ljava/lang/Object;
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
    //   131: sipush #-24574
    //   134: sipush #21756
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
    //   1179: sipush #-24562
    //   1182: sipush #-15337
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: invokespecial <init> : (Ljava/lang/String;)V
    //   1191: athrow
    //   1192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1195: athrow
    //   1196: bipush #10
    //   1198: istore #36
    //   1200: sipush #-24565
    //   1203: sipush #256
    //   1206: newarray byte
    //   1208: astore #37
    //   1210: sipush #-25338
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
    //   2518: putstatic burp/Zkby.Zv : Ljava/lang/Object;
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
    //   2757: ifeq -> 2734
    //   2760: aload_3
    //   2761: arraylength
    //   2762: bipush #10
    //   2764: if_icmplt -> 2530
    //   2767: new java/lang/StringBuilder
    //   2770: dup
    //   2771: invokespecial <init> : ()V
    //   2774: astore_3
    //   2775: iconst_0
    //   2776: istore #4
    //   2778: iload #4
    //   2780: bipush #32
    //   2782: if_icmpge -> 4115
    //   2785: iload #4
    //   2787: tableswitch default -> 4108, 0 -> 2928, 1 -> 2965, 2 -> 3002, 3 -> 3039, 4 -> 3076, 5 -> 3113, 6 -> 3150, 7 -> 3187, 8 -> 3224, 9 -> 3261, 10 -> 3298, 11 -> 3335, 12 -> 3372, 13 -> 3409, 14 -> 3446, 15 -> 3483, 16 -> 3520, 17 -> 3557, 18 -> 3594, 19 -> 3631, 20 -> 3668, 21 -> 3705, 22 -> 3742, 23 -> 3779, 24 -> 3816, 25 -> 3853, 26 -> 3890, 27 -> 3927, 28 -> 3964, 29 -> 4001, 30 -> 4038, 31 -> 4075
    //   2928: aload_3
    //   2929: getstatic burp/Zsvh.ZV : Ljava/lang/String;
    //   2932: getstatic burp/Zltp.ZT : Ljava/lang/Object;
    //   2935: checkcast java/math/BigInteger
    //   2938: invokevirtual intValue : ()I
    //   2941: bipush #32
    //   2943: irem
    //   2944: invokestatic abs : (I)I
    //   2947: invokevirtual charAt : (I)C
    //   2950: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2953: pop
    //   2954: iload_2
    //   2955: ifeq -> 4108
    //   2958: goto -> 2965
    //   2961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2964: athrow
    //   2965: aload_3
    //   2966: getstatic burp/Zsji.Zr : Ljava/lang/String;
    //   2969: getstatic burp/Ztvn.Zl : Ljava/lang/Object;
    //   2972: checkcast java/math/BigInteger
    //   2975: invokevirtual intValue : ()I
    //   2978: bipush #32
    //   2980: irem
    //   2981: invokestatic abs : (I)I
    //   2984: invokevirtual charAt : (I)C
    //   2987: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2990: pop
    //   2991: iload_2
    //   2992: ifeq -> 4108
    //   2995: goto -> 3002
    //   2998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3001: athrow
    //   3002: aload_3
    //   3003: getstatic burp/Zlqm.ZQ : Ljava/lang/String;
    //   3006: getstatic burp/Ztjh.ZU : Ljava/lang/Object;
    //   3009: checkcast java/math/BigInteger
    //   3012: invokevirtual intValue : ()I
    //   3015: bipush #32
    //   3017: irem
    //   3018: invokestatic abs : (I)I
    //   3021: invokevirtual charAt : (I)C
    //   3024: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3027: pop
    //   3028: iload_2
    //   3029: ifeq -> 4108
    //   3032: goto -> 3039
    //   3035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3038: athrow
    //   3039: aload_3
    //   3040: getstatic burp/Zm54.Zg : Ljava/lang/String;
    //   3043: getstatic burp/Zgqp.Zf : Ljava/lang/Object;
    //   3046: checkcast java/math/BigInteger
    //   3049: invokevirtual intValue : ()I
    //   3052: bipush #32
    //   3054: irem
    //   3055: invokestatic abs : (I)I
    //   3058: invokevirtual charAt : (I)C
    //   3061: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3064: pop
    //   3065: iload_2
    //   3066: ifeq -> 4108
    //   3069: goto -> 3076
    //   3072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3075: athrow
    //   3076: aload_3
    //   3077: getstatic burp/Zgl4.ZX : Ljava/lang/String;
    //   3080: getstatic burp/Zss8.ZO : Ljava/lang/Object;
    //   3083: checkcast java/math/BigInteger
    //   3086: invokevirtual intValue : ()I
    //   3089: bipush #32
    //   3091: irem
    //   3092: invokestatic abs : (I)I
    //   3095: invokevirtual charAt : (I)C
    //   3098: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3101: pop
    //   3102: iload_2
    //   3103: ifeq -> 4108
    //   3106: goto -> 3113
    //   3109: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3112: athrow
    //   3113: aload_3
    //   3114: getstatic burp/Zlfg.Zb : Ljava/lang/String;
    //   3117: getstatic burp/Zlqq.ZV : Ljava/lang/Object;
    //   3120: checkcast java/math/BigInteger
    //   3123: invokevirtual intValue : ()I
    //   3126: bipush #32
    //   3128: irem
    //   3129: invokestatic abs : (I)I
    //   3132: invokevirtual charAt : (I)C
    //   3135: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3138: pop
    //   3139: iload_2
    //   3140: ifeq -> 4108
    //   3143: goto -> 3150
    //   3146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3149: athrow
    //   3150: aload_3
    //   3151: getstatic burp/Zr_z.ZE : Ljava/lang/String;
    //   3154: getstatic burp/Ztgt.ZU : Ljava/lang/Object;
    //   3157: checkcast java/math/BigInteger
    //   3160: invokevirtual intValue : ()I
    //   3163: bipush #32
    //   3165: irem
    //   3166: invokestatic abs : (I)I
    //   3169: invokevirtual charAt : (I)C
    //   3172: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3175: pop
    //   3176: iload_2
    //   3177: ifeq -> 4108
    //   3180: goto -> 3187
    //   3183: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3186: athrow
    //   3187: aload_3
    //   3188: getstatic burp/Zgl4.ZX : Ljava/lang/String;
    //   3191: getstatic burp/Zs4v.ZB : Ljava/lang/Object;
    //   3194: checkcast java/math/BigInteger
    //   3197: invokevirtual intValue : ()I
    //   3200: bipush #32
    //   3202: irem
    //   3203: invokestatic abs : (I)I
    //   3206: invokevirtual charAt : (I)C
    //   3209: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3212: pop
    //   3213: iload_2
    //   3214: ifeq -> 4108
    //   3217: goto -> 3224
    //   3220: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3223: athrow
    //   3224: aload_3
    //   3225: getstatic burp/Zep1.ZQ : Ljava/lang/String;
    //   3228: getstatic burp/Zrqd.Zi : Ljava/lang/Object;
    //   3231: checkcast java/math/BigInteger
    //   3234: invokevirtual intValue : ()I
    //   3237: bipush #32
    //   3239: irem
    //   3240: invokestatic abs : (I)I
    //   3243: invokevirtual charAt : (I)C
    //   3246: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3249: pop
    //   3250: iload_2
    //   3251: ifeq -> 4108
    //   3254: goto -> 3261
    //   3257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3260: athrow
    //   3261: aload_3
    //   3262: getstatic burp/Zg3v.Zt : Ljava/lang/String;
    //   3265: getstatic burp/Zgqp.Zf : Ljava/lang/Object;
    //   3268: checkcast java/math/BigInteger
    //   3271: invokevirtual intValue : ()I
    //   3274: bipush #32
    //   3276: irem
    //   3277: invokestatic abs : (I)I
    //   3280: invokevirtual charAt : (I)C
    //   3283: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3286: pop
    //   3287: iload_2
    //   3288: ifeq -> 4108
    //   3291: goto -> 3298
    //   3294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3297: athrow
    //   3298: aload_3
    //   3299: getstatic burp/Zgfq.Zn : Ljava/lang/String;
    //   3302: getstatic burp/Zsji.Zg : Ljava/lang/Object;
    //   3305: checkcast java/math/BigInteger
    //   3308: invokevirtual intValue : ()I
    //   3311: bipush #32
    //   3313: irem
    //   3314: invokestatic abs : (I)I
    //   3317: invokevirtual charAt : (I)C
    //   3320: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3323: pop
    //   3324: iload_2
    //   3325: ifeq -> 4108
    //   3328: goto -> 3335
    //   3331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3334: athrow
    //   3335: aload_3
    //   3336: getstatic burp/Zsvh.ZV : Ljava/lang/String;
    //   3339: getstatic burp/Zx0t.Zt : Ljava/lang/Object;
    //   3342: checkcast java/math/BigInteger
    //   3345: invokevirtual intValue : ()I
    //   3348: bipush #32
    //   3350: irem
    //   3351: invokestatic abs : (I)I
    //   3354: invokevirtual charAt : (I)C
    //   3357: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3360: pop
    //   3361: iload_2
    //   3362: ifeq -> 4108
    //   3365: goto -> 3372
    //   3368: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3371: athrow
    //   3372: aload_3
    //   3373: getstatic burp/Zrdo.Zj : Ljava/lang/String;
    //   3376: getstatic burp/Zgl4.Zb : Ljava/lang/Object;
    //   3379: checkcast java/math/BigInteger
    //   3382: invokevirtual intValue : ()I
    //   3385: bipush #32
    //   3387: irem
    //   3388: invokestatic abs : (I)I
    //   3391: invokevirtual charAt : (I)C
    //   3394: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3397: pop
    //   3398: iload_2
    //   3399: ifeq -> 4108
    //   3402: goto -> 3409
    //   3405: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3408: athrow
    //   3409: aload_3
    //   3410: getstatic burp/Zts_.Zx : Ljava/lang/String;
    //   3413: getstatic burp/Zbu6.ZJ : Ljava/lang/Object;
    //   3416: checkcast java/math/BigInteger
    //   3419: invokevirtual intValue : ()I
    //   3422: bipush #32
    //   3424: irem
    //   3425: invokestatic abs : (I)I
    //   3428: invokevirtual charAt : (I)C
    //   3431: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3434: pop
    //   3435: iload_2
    //   3436: ifeq -> 4108
    //   3439: goto -> 3446
    //   3442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3445: athrow
    //   3446: aload_3
    //   3447: getstatic burp/Zk52.ZL : Ljava/lang/String;
    //   3450: getstatic burp/Zmpv.ZI : Ljava/lang/Object;
    //   3453: checkcast java/math/BigInteger
    //   3456: invokevirtual intValue : ()I
    //   3459: bipush #32
    //   3461: irem
    //   3462: invokestatic abs : (I)I
    //   3465: invokevirtual charAt : (I)C
    //   3468: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3471: pop
    //   3472: iload_2
    //   3473: ifeq -> 4108
    //   3476: goto -> 3483
    //   3479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3482: athrow
    //   3483: aload_3
    //   3484: getstatic burp/Zxz_.Zb : Ljava/lang/String;
    //   3487: getstatic burp/Zb1.Zf : Ljava/lang/Object;
    //   3490: checkcast java/math/BigInteger
    //   3493: invokevirtual intValue : ()I
    //   3496: bipush #32
    //   3498: irem
    //   3499: invokestatic abs : (I)I
    //   3502: invokevirtual charAt : (I)C
    //   3505: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3508: pop
    //   3509: iload_2
    //   3510: ifeq -> 4108
    //   3513: goto -> 3520
    //   3516: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3519: athrow
    //   3520: aload_3
    //   3521: getstatic burp/Zkor.Za : Ljava/lang/String;
    //   3524: getstatic burp/Zgz2.Zs : Ljava/lang/Object;
    //   3527: checkcast java/math/BigInteger
    //   3530: invokevirtual intValue : ()I
    //   3533: bipush #32
    //   3535: irem
    //   3536: invokestatic abs : (I)I
    //   3539: invokevirtual charAt : (I)C
    //   3542: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3545: pop
    //   3546: iload_2
    //   3547: ifeq -> 4108
    //   3550: goto -> 3557
    //   3553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3556: athrow
    //   3557: aload_3
    //   3558: getstatic burp/Zvof.ZR : Ljava/lang/String;
    //   3561: getstatic burp/Zgfq.Za : Ljava/lang/Object;
    //   3564: checkcast java/math/BigInteger
    //   3567: invokevirtual intValue : ()I
    //   3570: bipush #32
    //   3572: irem
    //   3573: invokestatic abs : (I)I
    //   3576: invokevirtual charAt : (I)C
    //   3579: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3582: pop
    //   3583: iload_2
    //   3584: ifeq -> 4108
    //   3587: goto -> 3594
    //   3590: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3593: athrow
    //   3594: aload_3
    //   3595: getstatic burp/Zmjw.ZB : Ljava/lang/String;
    //   3598: getstatic burp/Zsn6.Zo : Ljava/lang/Object;
    //   3601: checkcast java/math/BigInteger
    //   3604: invokevirtual intValue : ()I
    //   3607: bipush #32
    //   3609: irem
    //   3610: invokestatic abs : (I)I
    //   3613: invokevirtual charAt : (I)C
    //   3616: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3619: pop
    //   3620: iload_2
    //   3621: ifeq -> 4108
    //   3624: goto -> 3631
    //   3627: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3630: athrow
    //   3631: aload_3
    //   3632: getstatic burp/Zmpv.Zb : Ljava/lang/String;
    //   3635: getstatic burp/Zr_z.ZT : Ljava/lang/Object;
    //   3638: checkcast java/math/BigInteger
    //   3641: invokevirtual intValue : ()I
    //   3644: bipush #32
    //   3646: irem
    //   3647: invokestatic abs : (I)I
    //   3650: invokevirtual charAt : (I)C
    //   3653: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3656: pop
    //   3657: iload_2
    //   3658: ifeq -> 4108
    //   3661: goto -> 3668
    //   3664: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3667: athrow
    //   3668: aload_3
    //   3669: getstatic burp/Zmpv.Zb : Ljava/lang/String;
    //   3672: getstatic burp/Zkor.Ze : Ljava/lang/Object;
    //   3675: checkcast java/math/BigInteger
    //   3678: invokevirtual intValue : ()I
    //   3681: bipush #32
    //   3683: irem
    //   3684: invokestatic abs : (I)I
    //   3687: invokevirtual charAt : (I)C
    //   3690: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3693: pop
    //   3694: iload_2
    //   3695: ifeq -> 4108
    //   3698: goto -> 3705
    //   3701: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3704: athrow
    //   3705: aload_3
    //   3706: getstatic burp/Zb9d.Zh : Ljava/lang/String;
    //   3709: getstatic burp/Zz5h.ZD : Ljava/lang/Object;
    //   3712: checkcast java/math/BigInteger
    //   3715: invokevirtual intValue : ()I
    //   3718: bipush #32
    //   3720: irem
    //   3721: invokestatic abs : (I)I
    //   3724: invokevirtual charAt : (I)C
    //   3727: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3730: pop
    //   3731: iload_2
    //   3732: ifeq -> 4108
    //   3735: goto -> 3742
    //   3738: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3741: athrow
    //   3742: aload_3
    //   3743: getstatic burp/Zmjw.ZB : Ljava/lang/String;
    //   3746: getstatic burp/Zg_i.ZQ : Ljava/lang/Object;
    //   3749: checkcast java/math/BigInteger
    //   3752: invokevirtual intValue : ()I
    //   3755: bipush #32
    //   3757: irem
    //   3758: invokestatic abs : (I)I
    //   3761: invokevirtual charAt : (I)C
    //   3764: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3767: pop
    //   3768: iload_2
    //   3769: ifeq -> 4108
    //   3772: goto -> 3779
    //   3775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3778: athrow
    //   3779: aload_3
    //   3780: getstatic burp/Zr3j.Zj : Ljava/lang/String;
    //   3783: getstatic burp/Zgz2.Zs : Ljava/lang/Object;
    //   3786: checkcast java/math/BigInteger
    //   3789: invokevirtual intValue : ()I
    //   3792: bipush #32
    //   3794: irem
    //   3795: invokestatic abs : (I)I
    //   3798: invokevirtual charAt : (I)C
    //   3801: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3804: pop
    //   3805: iload_2
    //   3806: ifeq -> 4108
    //   3809: goto -> 3816
    //   3812: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3815: athrow
    //   3816: aload_3
    //   3817: getstatic burp/Zkor.Za : Ljava/lang/String;
    //   3820: getstatic burp/Zb9d.Ze : Ljava/lang/Object;
    //   3823: checkcast java/math/BigInteger
    //   3826: invokevirtual intValue : ()I
    //   3829: bipush #32
    //   3831: irem
    //   3832: invokestatic abs : (I)I
    //   3835: invokevirtual charAt : (I)C
    //   3838: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3841: pop
    //   3842: iload_2
    //   3843: ifeq -> 4108
    //   3846: goto -> 3853
    //   3849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3852: athrow
    //   3853: aload_3
    //   3854: getstatic burp/Zz4r.Zq : Ljava/lang/String;
    //   3857: getstatic burp/Zlfg.Zv : Ljava/lang/Object;
    //   3860: checkcast java/math/BigInteger
    //   3863: invokevirtual intValue : ()I
    //   3866: bipush #32
    //   3868: irem
    //   3869: invokestatic abs : (I)I
    //   3872: invokevirtual charAt : (I)C
    //   3875: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3878: pop
    //   3879: iload_2
    //   3880: ifeq -> 4108
    //   3883: goto -> 3890
    //   3886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3889: athrow
    //   3890: aload_3
    //   3891: getstatic burp/Zluk.ZW : Ljava/lang/String;
    //   3894: getstatic burp/Zg8.ZX : Ljava/lang/Object;
    //   3897: checkcast java/math/BigInteger
    //   3900: invokevirtual intValue : ()I
    //   3903: bipush #32
    //   3905: irem
    //   3906: invokestatic abs : (I)I
    //   3909: invokevirtual charAt : (I)C
    //   3912: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3915: pop
    //   3916: iload_2
    //   3917: ifeq -> 4108
    //   3920: goto -> 3927
    //   3923: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3926: athrow
    //   3927: aload_3
    //   3928: getstatic burp/Zzi3.ZS : Ljava/lang/String;
    //   3931: getstatic burp/Zgk1.ZD : Ljava/lang/Object;
    //   3934: checkcast java/math/BigInteger
    //   3937: invokevirtual intValue : ()I
    //   3940: bipush #32
    //   3942: irem
    //   3943: invokestatic abs : (I)I
    //   3946: invokevirtual charAt : (I)C
    //   3949: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3952: pop
    //   3953: iload_2
    //   3954: ifeq -> 4108
    //   3957: goto -> 3964
    //   3960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3963: athrow
    //   3964: aload_3
    //   3965: getstatic burp/Zl8l.ZG : Ljava/lang/String;
    //   3968: getstatic burp/Zr3j.ZT : Ljava/lang/Object;
    //   3971: checkcast java/math/BigInteger
    //   3974: invokevirtual intValue : ()I
    //   3977: bipush #32
    //   3979: irem
    //   3980: invokestatic abs : (I)I
    //   3983: invokevirtual charAt : (I)C
    //   3986: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3989: pop
    //   3990: iload_2
    //   3991: ifeq -> 4108
    //   3994: goto -> 4001
    //   3997: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4000: athrow
    //   4001: aload_3
    //   4002: getstatic burp/Zltp.ZY : Ljava/lang/String;
    //   4005: getstatic burp/Zlqy.ZP : Ljava/lang/Object;
    //   4008: checkcast java/math/BigInteger
    //   4011: invokevirtual intValue : ()I
    //   4014: bipush #32
    //   4016: irem
    //   4017: invokestatic abs : (I)I
    //   4020: invokevirtual charAt : (I)C
    //   4023: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   4026: pop
    //   4027: iload_2
    //   4028: ifeq -> 4108
    //   4031: goto -> 4038
    //   4034: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4037: athrow
    //   4038: aload_3
    //   4039: getstatic burp/Zge1.Zx : Ljava/lang/String;
    //   4042: getstatic burp/Ze0z.ZQ : Ljava/lang/Object;
    //   4045: checkcast java/math/BigInteger
    //   4048: invokevirtual intValue : ()I
    //   4051: bipush #32
    //   4053: irem
    //   4054: invokestatic abs : (I)I
    //   4057: invokevirtual charAt : (I)C
    //   4060: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   4063: pop
    //   4064: iload_2
    //   4065: ifeq -> 4108
    //   4068: goto -> 4075
    //   4071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4074: athrow
    //   4075: aload_3
    //   4076: getstatic burp/Zmwx.ZB : Ljava/lang/String;
    //   4079: getstatic burp/Zk7b.ZR : Ljava/lang/Object;
    //   4082: checkcast java/math/BigInteger
    //   4085: invokevirtual intValue : ()I
    //   4088: bipush #32
    //   4090: irem
    //   4091: invokestatic abs : (I)I
    //   4094: invokevirtual charAt : (I)C
    //   4097: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   4100: pop
    //   4101: goto -> 4108
    //   4104: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4107: athrow
    //   4108: iinc #4, 1
    //   4111: iload_2
    //   4112: ifeq -> 2778
    //   4115: aload_3
    //   4116: invokevirtual toString : ()Ljava/lang/String;
    //   4119: putstatic burp/Zgz2.ZI : Ljava/lang/String;
    //   4122: sipush #-24566
    //   4125: sipush #-26956
    //   4128: invokestatic a : (II)Ljava/lang/String;
    //   4131: iconst_1
    //   4132: ldc burp/Zzi3
    //   4134: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4137: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4140: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4143: astore #4
    //   4145: aload #4
    //   4147: arraylength
    //   4148: istore #5
    //   4150: iconst_0
    //   4151: istore #6
    //   4153: iload #6
    //   4155: iload #5
    //   4157: if_icmpge -> 4295
    //   4160: aload #4
    //   4162: iload #6
    //   4164: aaload
    //   4165: astore #7
    //   4167: aload #7
    //   4169: invokevirtual getModifiers : ()I
    //   4172: invokestatic isStatic : (I)Z
    //   4175: ifne -> 4185
    //   4178: goto -> 4288
    //   4181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4184: athrow
    //   4185: aload #7
    //   4187: invokevirtual getType : ()Ljava/lang/Class;
    //   4190: astore #8
    //   4192: aload #8
    //   4194: ifnull -> 4275
    //   4197: aload #8
    //   4199: invokevirtual isPrimitive : ()Z
    //   4202: ifne -> 4275
    //   4205: goto -> 4212
    //   4208: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4211: athrow
    //   4212: aload #8
    //   4214: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4217: ifnull -> 4275
    //   4220: goto -> 4227
    //   4223: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4226: athrow
    //   4227: aload #8
    //   4229: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4232: invokevirtual getName : ()Ljava/lang/String;
    //   4235: ifnull -> 4275
    //   4238: goto -> 4245
    //   4241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4244: athrow
    //   4245: aload #8
    //   4247: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4250: invokevirtual getName : ()Ljava/lang/String;
    //   4253: sipush #-24561
    //   4256: sipush #8243
    //   4259: invokestatic a : (II)Ljava/lang/String;
    //   4262: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4265: ifne -> 4275
    //   4268: goto -> 4275
    //   4271: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4274: athrow
    //   4275: aload #7
    //   4277: iconst_1
    //   4278: invokevirtual setAccessible : (Z)V
    //   4281: aload #7
    //   4283: aconst_null
    //   4284: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4287: pop
    //   4288: iinc #6, 1
    //   4291: iload_2
    //   4292: ifeq -> 4153
    //   4295: sipush #-24575
    //   4298: sipush #15933
    //   4301: invokestatic a : (II)Ljava/lang/String;
    //   4304: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4307: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4310: astore #4
    //   4312: aload #4
    //   4314: arraylength
    //   4315: istore #5
    //   4317: iconst_0
    //   4318: istore #6
    //   4320: iload #6
    //   4322: iload #5
    //   4324: if_icmpge -> 4457
    //   4327: aload #4
    //   4329: iload #6
    //   4331: aaload
    //   4332: astore #7
    //   4334: aload #7
    //   4336: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4339: pop
    //   4340: aload #7
    //   4342: invokevirtual getModifiers : ()I
    //   4345: invokestatic isStatic : (I)Z
    //   4348: ifeq -> 4443
    //   4351: aload #7
    //   4353: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4356: arraylength
    //   4357: iconst_2
    //   4358: if_icmpne -> 4443
    //   4361: goto -> 4368
    //   4364: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4367: athrow
    //   4368: aload #7
    //   4370: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4373: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   4376: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4379: ifeq -> 4443
    //   4382: goto -> 4389
    //   4385: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4388: athrow
    //   4389: aload #7
    //   4391: iconst_1
    //   4392: invokevirtual setAccessible : (Z)V
    //   4395: aload #7
    //   4397: aconst_null
    //   4398: iconst_2
    //   4399: anewarray java/lang/Object
    //   4402: dup
    //   4403: iconst_0
    //   4404: aload_0
    //   4405: aastore
    //   4406: dup
    //   4407: iconst_1
    //   4408: aload_1
    //   4409: ifnonnull -> 4427
    //   4412: goto -> 4419
    //   4415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4418: athrow
    //   4419: aload_1
    //   4420: goto -> 4434
    //   4423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4426: athrow
    //   4427: aload_1
    //   4428: checkcast [B
    //   4431: invokevirtual clone : ()Ljava/lang/Object;
    //   4434: aastore
    //   4435: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4438: pop
    //   4439: iload_2
    //   4440: ifeq -> 4457
    //   4443: iinc #6, 1
    //   4446: iload_2
    //   4447: ifeq -> 4320
    //   4450: goto -> 4457
    //   4453: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4456: athrow
    //   4457: getstatic burp/Zgfq.Zn : Ljava/lang/String;
    //   4460: getstatic burp/Zr64.ZN : Ljava/lang/Object;
    //   4463: checkcast java/math/BigInteger
    //   4466: invokevirtual intValue : ()I
    //   4469: bipush #32
    //   4471: irem
    //   4472: invokestatic abs : (I)I
    //   4475: invokevirtual charAt : (I)C
    //   4478: getstatic burp/Zvof.ZR : Ljava/lang/String;
    //   4481: getstatic burp/Zg3v.Zk : Ljava/lang/Object;
    //   4484: checkcast java/math/BigInteger
    //   4487: invokevirtual intValue : ()I
    //   4490: bipush #32
    //   4492: irem
    //   4493: invokestatic abs : (I)I
    //   4496: invokevirtual charAt : (I)C
    //   4499: if_icmpgt -> 4606
    //   4502: getstatic burp/Zm7y.ZL : Ljava/lang/String;
    //   4505: getstatic burp/Zmcb.ZR : Ljava/lang/Object;
    //   4508: checkcast java/math/BigInteger
    //   4511: invokevirtual intValue : ()I
    //   4514: bipush #32
    //   4516: irem
    //   4517: invokestatic abs : (I)I
    //   4520: invokevirtual charAt : (I)C
    //   4523: getstatic burp/Zz4r.Zq : Ljava/lang/String;
    //   4526: getstatic burp/Zrqd.Zi : Ljava/lang/Object;
    //   4529: checkcast java/math/BigInteger
    //   4532: invokevirtual intValue : ()I
    //   4535: bipush #32
    //   4537: irem
    //   4538: invokestatic abs : (I)I
    //   4541: invokevirtual charAt : (I)C
    //   4544: if_icmpgt -> 4606
    //   4547: goto -> 4554
    //   4550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4553: athrow
    //   4554: getstatic burp/Zgqp.ZA : Ljava/lang/String;
    //   4557: getstatic burp/Zz5h.ZD : Ljava/lang/Object;
    //   4560: checkcast java/math/BigInteger
    //   4563: invokevirtual intValue : ()I
    //   4566: bipush #32
    //   4568: irem
    //   4569: invokestatic abs : (I)I
    //   4572: invokevirtual charAt : (I)C
    //   4575: getstatic burp/Zssb.ZY : Ljava/lang/String;
    //   4578: getstatic burp/Zg8.ZX : Ljava/lang/Object;
    //   4581: checkcast java/math/BigInteger
    //   4584: invokevirtual intValue : ()I
    //   4587: bipush #32
    //   4589: irem
    //   4590: invokestatic abs : (I)I
    //   4593: invokevirtual charAt : (I)C
    //   4596: if_icmple -> 4614
    //   4599: goto -> 4606
    //   4602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4605: athrow
    //   4606: iconst_1
    //   4607: goto -> 4615
    //   4610: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4613: athrow
    //   4614: iconst_0
    //   4615: ireturn
    //   4616: astore_3
    //   4617: new java/lang/Exception
    //   4620: dup
    //   4621: aload_3
    //   4622: invokevirtual getMessage : ()Ljava/lang/String;
    //   4625: invokespecial <init> : (Ljava/lang/String;)V
    //   4628: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4615	4616	java/lang/Throwable
    //   149	164	164	java/lang/Throwable
    //   1166	1192	1192	java/lang/Throwable
    //   1273	1288	1288	java/lang/Throwable
    //   2470	2495	2498	java/lang/Throwable
    //   2785	2958	2961	java/lang/Throwable
    //   2928	2995	2998	java/lang/Throwable
    //   2965	3032	3035	java/lang/Throwable
    //   3002	3069	3072	java/lang/Throwable
    //   3039	3106	3109	java/lang/Throwable
    //   3076	3143	3146	java/lang/Throwable
    //   3113	3180	3183	java/lang/Throwable
    //   3150	3217	3220	java/lang/Throwable
    //   3187	3254	3257	java/lang/Throwable
    //   3224	3291	3294	java/lang/Throwable
    //   3261	3328	3331	java/lang/Throwable
    //   3298	3365	3368	java/lang/Throwable
    //   3335	3402	3405	java/lang/Throwable
    //   3372	3439	3442	java/lang/Throwable
    //   3409	3476	3479	java/lang/Throwable
    //   3446	3513	3516	java/lang/Throwable
    //   3483	3550	3553	java/lang/Throwable
    //   3520	3587	3590	java/lang/Throwable
    //   3557	3624	3627	java/lang/Throwable
    //   3594	3661	3664	java/lang/Throwable
    //   3631	3698	3701	java/lang/Throwable
    //   3668	3735	3738	java/lang/Throwable
    //   3705	3772	3775	java/lang/Throwable
    //   3742	3809	3812	java/lang/Throwable
    //   3779	3846	3849	java/lang/Throwable
    //   3816	3883	3886	java/lang/Throwable
    //   3853	3920	3923	java/lang/Throwable
    //   3890	3957	3960	java/lang/Throwable
    //   3927	3994	3997	java/lang/Throwable
    //   3964	4031	4034	java/lang/Throwable
    //   4001	4068	4071	java/lang/Throwable
    //   4038	4101	4104	java/lang/Throwable
    //   4167	4181	4181	java/lang/Throwable
    //   4192	4205	4208	java/lang/Throwable
    //   4197	4220	4223	java/lang/Throwable
    //   4212	4238	4241	java/lang/Throwable
    //   4227	4268	4271	java/lang/Throwable
    //   4334	4361	4364	java/lang/Throwable
    //   4351	4382	4385	java/lang/Throwable
    //   4368	4412	4415	java/lang/Throwable
    //   4389	4423	4423	java/lang/Throwable
    //   4434	4450	4453	java/lang/Throwable
    //   4457	4547	4550	java/lang/Throwable
    //   4502	4599	4602	java/lang/Throwable
    //   4554	4610	4610	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'úË`Ñh)@ÑM°uðà ¨æ@ºM·ðû¾ ãp¸;²Àë&GÓ|¦pÓ¿È7¬mRöú*¾wWJÚþßà¼s$²èSD\>.õ@õ×掺睾漝ヤ柂ﻹꬥ쫣줂﫴䜔괏ꉐ鱎狣띧鎁㛧㐒燸ㄡИ⌦ᢝնޠ肖눚शⲵᯈ娊勲혥⧢⾓匥⃶녻樕빥䨪塊탼꫁䎳㍚䕨ɷ僀齅充䃩銁㢵볞?თ춅ᏺ復䑏쓀纲摓᧌恾佛∢邓䙖뢺?୹㫳䦂⓺숀겙酟㟠跙丰汱旋꺫먃◁᳴둦瓎䯧讘灛뗫䣢愉块虄ᵩ頂槄軤鬒蝄칙⣆谆覒뾰䋠䆂ⷥ냫묷\\t`^¤¯þÇMþM g³É4\\nñËåúl%¿ËÈlRÄ\\nË§²­õ7È²KÕ>¡Z\\fÞé3×svY®/ðù{BsÏ<ÝB®¸\\tíU4SIø¸ê(õrØC£[Mbâòþ\\tOÖÈ¾\\nÜ! -öY^·è%ÿû«$48´{óÊeî\:~\\tÑ4'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #38
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
    //   68: ldc ',þ'*£q­bç\\fûÃ¦Yÿ±²Älç\á\\nþå挊矿潬く枭ﻍꮉ쨤짖祉䟏굹ꉪ鳁狥럗錀㚰㒹燌ㆍӟ⏲ᠤ֭ߖ肬눜আⰴᮟ婻剙홊⧖⼿叢Ì⁏놠橣빟䪥塌큌ꩀ䏤㌫䗃Ș僴鿩冂䀽鈸㡮벨?ၘ촵፻忾䐾쑫绝摧ᥠ悹侏⊛遈䘠뢀?୿㩲䧕⒋슫곶酫㜴赠仫氇敄꺭몳╀Უ됗璡䯓謴炜딿䡛慿坭蛋ᵯ颃榓躕鮹蜫칭⡪賁襆뼉䈻䇴⷟끤묱'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #110
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
    //   129: putstatic burp/Zgh3.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgh3.b : [Ljava/lang/String;
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
    //   212: bipush #37
    //   214: goto -> 244
    //   217: bipush #127
    //   219: goto -> 244
    //   222: bipush #37
    //   224: goto -> 244
    //   227: bipush #14
    //   229: goto -> 244
    //   232: bipush #48
    //   234: goto -> 244
    //   237: bipush #20
    //   239: goto -> 244
    //   242: bipush #119
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
    //   304: sipush #-24568
    //   307: sipush #-22768
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zgh3.ZZ : Ljava/lang/Object;
    //   319: sipush #-24576
    //   322: sipush #3975
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zgh3.ZR : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA009) & 0xFFFF;
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
      char c = 'õ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgh3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */