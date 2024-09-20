package burp;

import java.math.BigInteger;

class Ztkh extends ClassLoader {
  static Object Zh;
  
  static String ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zh(Object paramObject) {
    Zel.Zi = a(-3664, 5951);
    Zel.ZB = new BigInteger(a(-3665, -28582));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (ZP.charAt(Math.abs(((BigInteger)Ze82.ZR).intValue() % 32)) > Zlo5.ZJ.charAt(Math.abs(((BigInteger)Zrcy.Zr).intValue() % 32))) {
          try {
            Zt7w.Zt(Class.forName(a(-3676, -18660)));
            if (bool)
              Zrva.ZO(Class.forName(a(-3666, -10100))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrva.ZO(Class.forName(a(-3666, -10100)));
    } catch (Throwable throwable) {}
  }
  
  static void Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZB(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: getstatic burp/Zzc_.Zg : Ljava/lang/String;
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
    //   63: getstatic burp/Zg4k.ZE : Ljava/lang/Object;
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
    //   131: sipush #-3671
    //   134: sipush #-24599
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
    //   1179: sipush #-3650
    //   1182: sipush #11110
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: invokespecial <init> : (Ljava/lang/String;)V
    //   1191: athrow
    //   1192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1195: athrow
    //   1196: bipush #10
    //   1198: istore #36
    //   1200: sipush #-3658
    //   1203: sipush #256
    //   1206: newarray byte
    //   1208: astore #37
    //   1210: sipush #5270
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
    //   2518: putstatic burp/Zz75.ZX : Ljava/lang/Object;
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
    //   2685: getstatic burp/Zs00.Zv : Ljava/lang/String;
    //   2688: getstatic burp/Zzym.ZK : Ljava/lang/Object;
    //   2691: checkcast java/math/BigInteger
    //   2694: invokevirtual intValue : ()I
    //   2697: bipush #32
    //   2699: irem
    //   2700: invokestatic abs : (I)I
    //   2703: invokevirtual charAt : (I)C
    //   2706: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2709: pop
    //   2710: iload_2
    //   2711: ifne -> 3864
    //   2714: goto -> 2721
    //   2717: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2720: athrow
    //   2721: aload_3
    //   2722: getstatic burp/Zm7x.ZP : Ljava/lang/String;
    //   2725: getstatic burp/Ze69.ZH : Ljava/lang/Object;
    //   2728: checkcast java/math/BigInteger
    //   2731: invokevirtual intValue : ()I
    //   2734: bipush #32
    //   2736: irem
    //   2737: invokestatic abs : (I)I
    //   2740: invokevirtual charAt : (I)C
    //   2743: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2746: pop
    //   2747: iload_2
    //   2748: ifne -> 3864
    //   2751: goto -> 2758
    //   2754: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2757: athrow
    //   2758: aload_3
    //   2759: getstatic burp/Zzox.ZB : Ljava/lang/String;
    //   2762: getstatic burp/Zeoy.Zt : Ljava/lang/Object;
    //   2765: checkcast java/math/BigInteger
    //   2768: invokevirtual intValue : ()I
    //   2771: bipush #32
    //   2773: irem
    //   2774: invokestatic abs : (I)I
    //   2777: invokevirtual charAt : (I)C
    //   2780: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2783: pop
    //   2784: iload_2
    //   2785: ifne -> 3864
    //   2788: goto -> 2795
    //   2791: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2794: athrow
    //   2795: aload_3
    //   2796: getstatic burp/Zs83.ZG : Ljava/lang/String;
    //   2799: getstatic burp/Zs8s.ZG : Ljava/lang/Object;
    //   2802: checkcast java/math/BigInteger
    //   2805: invokevirtual intValue : ()I
    //   2808: bipush #32
    //   2810: irem
    //   2811: invokestatic abs : (I)I
    //   2814: invokevirtual charAt : (I)C
    //   2817: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2820: pop
    //   2821: iload_2
    //   2822: ifne -> 3864
    //   2825: goto -> 2832
    //   2828: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2831: athrow
    //   2832: aload_3
    //   2833: getstatic burp/Zlhq.Zl : Ljava/lang/String;
    //   2836: getstatic burp/Zl50.ZV : Ljava/lang/Object;
    //   2839: checkcast java/math/BigInteger
    //   2842: invokevirtual intValue : ()I
    //   2845: bipush #32
    //   2847: irem
    //   2848: invokestatic abs : (I)I
    //   2851: invokevirtual charAt : (I)C
    //   2854: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2857: pop
    //   2858: iload_2
    //   2859: ifne -> 3864
    //   2862: goto -> 2869
    //   2865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2868: athrow
    //   2869: aload_3
    //   2870: getstatic burp/Zt5j.ZR : Ljava/lang/String;
    //   2873: getstatic burp/Zzo5.Zf : Ljava/lang/Object;
    //   2876: checkcast java/math/BigInteger
    //   2879: invokevirtual intValue : ()I
    //   2882: bipush #32
    //   2884: irem
    //   2885: invokestatic abs : (I)I
    //   2888: invokevirtual charAt : (I)C
    //   2891: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2894: pop
    //   2895: iload_2
    //   2896: ifne -> 3864
    //   2899: goto -> 2906
    //   2902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2905: athrow
    //   2906: aload_3
    //   2907: getstatic burp/Zm7x.ZP : Ljava/lang/String;
    //   2910: getstatic burp/Zl06.Zw : Ljava/lang/Object;
    //   2913: checkcast java/math/BigInteger
    //   2916: invokevirtual intValue : ()I
    //   2919: bipush #32
    //   2921: irem
    //   2922: invokestatic abs : (I)I
    //   2925: invokevirtual charAt : (I)C
    //   2928: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2931: pop
    //   2932: iload_2
    //   2933: ifne -> 3864
    //   2936: goto -> 2943
    //   2939: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2942: athrow
    //   2943: aload_3
    //   2944: getstatic burp/Zb8y.Zn : Ljava/lang/String;
    //   2947: getstatic burp/Zeoy.Zt : Ljava/lang/Object;
    //   2950: checkcast java/math/BigInteger
    //   2953: invokevirtual intValue : ()I
    //   2956: bipush #32
    //   2958: irem
    //   2959: invokestatic abs : (I)I
    //   2962: invokevirtual charAt : (I)C
    //   2965: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2968: pop
    //   2969: iload_2
    //   2970: ifne -> 3864
    //   2973: goto -> 2980
    //   2976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2979: athrow
    //   2980: aload_3
    //   2981: getstatic burp/Ze69.ZA : Ljava/lang/String;
    //   2984: getstatic burp/Zs8y.ZG : Ljava/lang/Object;
    //   2987: checkcast java/math/BigInteger
    //   2990: invokevirtual intValue : ()I
    //   2993: bipush #32
    //   2995: irem
    //   2996: invokestatic abs : (I)I
    //   2999: invokevirtual charAt : (I)C
    //   3002: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3005: pop
    //   3006: iload_2
    //   3007: ifne -> 3864
    //   3010: goto -> 3017
    //   3013: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3016: athrow
    //   3017: aload_3
    //   3018: getstatic burp/Ztsu.ZE : Ljava/lang/String;
    //   3021: getstatic burp/Zs_v.Zs : Ljava/lang/Object;
    //   3024: checkcast java/math/BigInteger
    //   3027: invokevirtual intValue : ()I
    //   3030: bipush #32
    //   3032: irem
    //   3033: invokestatic abs : (I)I
    //   3036: invokevirtual charAt : (I)C
    //   3039: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3042: pop
    //   3043: iload_2
    //   3044: ifne -> 3864
    //   3047: goto -> 3054
    //   3050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3053: athrow
    //   3054: aload_3
    //   3055: getstatic burp/Zgq_.ZQ : Ljava/lang/String;
    //   3058: getstatic burp/Zzmw.ZS : Ljava/lang/Object;
    //   3061: checkcast java/math/BigInteger
    //   3064: invokevirtual intValue : ()I
    //   3067: bipush #32
    //   3069: irem
    //   3070: invokestatic abs : (I)I
    //   3073: invokevirtual charAt : (I)C
    //   3076: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3079: pop
    //   3080: iload_2
    //   3081: ifne -> 3864
    //   3084: goto -> 3091
    //   3087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3090: athrow
    //   3091: aload_3
    //   3092: getstatic burp/Zs8q.Zs : Ljava/lang/String;
    //   3095: getstatic burp/Zk7e.ZW : Ljava/lang/Object;
    //   3098: checkcast java/math/BigInteger
    //   3101: invokevirtual intValue : ()I
    //   3104: bipush #32
    //   3106: irem
    //   3107: invokestatic abs : (I)I
    //   3110: invokevirtual charAt : (I)C
    //   3113: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3116: pop
    //   3117: iload_2
    //   3118: ifne -> 3864
    //   3121: goto -> 3128
    //   3124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3127: athrow
    //   3128: aload_3
    //   3129: getstatic burp/Zxzz.ZT : Ljava/lang/String;
    //   3132: getstatic burp/Zb8y.ZI : Ljava/lang/Object;
    //   3135: checkcast java/math/BigInteger
    //   3138: invokevirtual intValue : ()I
    //   3141: bipush #32
    //   3143: irem
    //   3144: invokestatic abs : (I)I
    //   3147: invokevirtual charAt : (I)C
    //   3150: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3153: pop
    //   3154: iload_2
    //   3155: ifne -> 3864
    //   3158: goto -> 3165
    //   3161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3164: athrow
    //   3165: aload_3
    //   3166: getstatic burp/Zlvb.Zs : Ljava/lang/String;
    //   3169: getstatic burp/Ze8i.Zq : Ljava/lang/Object;
    //   3172: checkcast java/math/BigInteger
    //   3175: invokevirtual intValue : ()I
    //   3178: bipush #32
    //   3180: irem
    //   3181: invokestatic abs : (I)I
    //   3184: invokevirtual charAt : (I)C
    //   3187: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3190: pop
    //   3191: iload_2
    //   3192: ifne -> 3864
    //   3195: goto -> 3202
    //   3198: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3201: athrow
    //   3202: aload_3
    //   3203: getstatic burp/Zz6t.Zx : Ljava/lang/String;
    //   3206: getstatic burp/Zt9_.ZN : Ljava/lang/Object;
    //   3209: checkcast java/math/BigInteger
    //   3212: invokevirtual intValue : ()I
    //   3215: bipush #32
    //   3217: irem
    //   3218: invokestatic abs : (I)I
    //   3221: invokevirtual charAt : (I)C
    //   3224: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3227: pop
    //   3228: iload_2
    //   3229: ifne -> 3864
    //   3232: goto -> 3239
    //   3235: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3238: athrow
    //   3239: aload_3
    //   3240: getstatic burp/Zztk.Zf : Ljava/lang/String;
    //   3243: getstatic burp/Zli5.Zt : Ljava/lang/Object;
    //   3246: checkcast java/math/BigInteger
    //   3249: invokevirtual intValue : ()I
    //   3252: bipush #32
    //   3254: irem
    //   3255: invokestatic abs : (I)I
    //   3258: invokevirtual charAt : (I)C
    //   3261: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3264: pop
    //   3265: iload_2
    //   3266: ifne -> 3864
    //   3269: goto -> 3276
    //   3272: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3275: athrow
    //   3276: aload_3
    //   3277: getstatic burp/Zlpj.Zj : Ljava/lang/String;
    //   3280: getstatic burp/Zl8f.ZA : Ljava/lang/Object;
    //   3283: checkcast java/math/BigInteger
    //   3286: invokevirtual intValue : ()I
    //   3289: bipush #32
    //   3291: irem
    //   3292: invokestatic abs : (I)I
    //   3295: invokevirtual charAt : (I)C
    //   3298: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3301: pop
    //   3302: iload_2
    //   3303: ifne -> 3864
    //   3306: goto -> 3313
    //   3309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3312: athrow
    //   3313: aload_3
    //   3314: getstatic burp/Zs83.ZG : Ljava/lang/String;
    //   3317: getstatic burp/Zm8w.Zz : Ljava/lang/Object;
    //   3320: checkcast java/math/BigInteger
    //   3323: invokevirtual intValue : ()I
    //   3326: bipush #32
    //   3328: irem
    //   3329: invokestatic abs : (I)I
    //   3332: invokevirtual charAt : (I)C
    //   3335: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3338: pop
    //   3339: iload_2
    //   3340: ifne -> 3864
    //   3343: goto -> 3350
    //   3346: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3349: athrow
    //   3350: aload_3
    //   3351: getstatic burp/Zs4z.Zs : Ljava/lang/String;
    //   3354: getstatic burp/Zs83.ZT : Ljava/lang/Object;
    //   3357: checkcast java/math/BigInteger
    //   3360: invokevirtual intValue : ()I
    //   3363: bipush #32
    //   3365: irem
    //   3366: invokestatic abs : (I)I
    //   3369: invokevirtual charAt : (I)C
    //   3372: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3375: pop
    //   3376: iload_2
    //   3377: ifne -> 3864
    //   3380: goto -> 3387
    //   3383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3386: athrow
    //   3387: aload_3
    //   3388: getstatic burp/Ze82.Zx : Ljava/lang/String;
    //   3391: getstatic burp/Zg4d.Zm : Ljava/lang/Object;
    //   3394: checkcast java/math/BigInteger
    //   3397: invokevirtual intValue : ()I
    //   3400: bipush #32
    //   3402: irem
    //   3403: invokestatic abs : (I)I
    //   3406: invokevirtual charAt : (I)C
    //   3409: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3412: pop
    //   3413: iload_2
    //   3414: ifne -> 3864
    //   3417: goto -> 3424
    //   3420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3423: athrow
    //   3424: aload_3
    //   3425: getstatic burp/Zlo5.ZJ : Ljava/lang/String;
    //   3428: getstatic burp/Zgzv.Zb : Ljava/lang/Object;
    //   3431: checkcast java/math/BigInteger
    //   3434: invokevirtual intValue : ()I
    //   3437: bipush #32
    //   3439: irem
    //   3440: invokestatic abs : (I)I
    //   3443: invokevirtual charAt : (I)C
    //   3446: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3449: pop
    //   3450: iload_2
    //   3451: ifne -> 3864
    //   3454: goto -> 3461
    //   3457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3460: athrow
    //   3461: aload_3
    //   3462: getstatic burp/Zzmu.ZF : Ljava/lang/String;
    //   3465: getstatic burp/Zz0w.ZF : Ljava/lang/Object;
    //   3468: checkcast java/math/BigInteger
    //   3471: invokevirtual intValue : ()I
    //   3474: bipush #32
    //   3476: irem
    //   3477: invokestatic abs : (I)I
    //   3480: invokevirtual charAt : (I)C
    //   3483: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3486: pop
    //   3487: iload_2
    //   3488: ifne -> 3864
    //   3491: goto -> 3498
    //   3494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3497: athrow
    //   3498: aload_3
    //   3499: getstatic burp/Zgzv.Zy : Ljava/lang/String;
    //   3502: getstatic burp/Zs4z.Ze : Ljava/lang/Object;
    //   3505: checkcast java/math/BigInteger
    //   3508: invokevirtual intValue : ()I
    //   3511: bipush #32
    //   3513: irem
    //   3514: invokestatic abs : (I)I
    //   3517: invokevirtual charAt : (I)C
    //   3520: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3523: pop
    //   3524: iload_2
    //   3525: ifne -> 3864
    //   3528: goto -> 3535
    //   3531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3534: athrow
    //   3535: aload_3
    //   3536: getstatic burp/Zb4a.Zi : Ljava/lang/String;
    //   3539: getstatic burp/Zsxh.Zk : Ljava/lang/Object;
    //   3542: checkcast java/math/BigInteger
    //   3545: invokevirtual intValue : ()I
    //   3548: bipush #32
    //   3550: irem
    //   3551: invokestatic abs : (I)I
    //   3554: invokevirtual charAt : (I)C
    //   3557: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3560: pop
    //   3561: iload_2
    //   3562: ifne -> 3864
    //   3565: goto -> 3572
    //   3568: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3571: athrow
    //   3572: aload_3
    //   3573: getstatic burp/Zt98.Zh : Ljava/lang/String;
    //   3576: getstatic burp/Zzr5.Za : Ljava/lang/Object;
    //   3579: checkcast java/math/BigInteger
    //   3582: invokevirtual intValue : ()I
    //   3585: bipush #32
    //   3587: irem
    //   3588: invokestatic abs : (I)I
    //   3591: invokevirtual charAt : (I)C
    //   3594: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3597: pop
    //   3598: iload_2
    //   3599: ifne -> 3864
    //   3602: goto -> 3609
    //   3605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3608: athrow
    //   3609: aload_3
    //   3610: getstatic burp/Zkjr.Zg : Ljava/lang/String;
    //   3613: getstatic burp/Zke7.Zj : Ljava/lang/Object;
    //   3616: checkcast java/math/BigInteger
    //   3619: invokevirtual intValue : ()I
    //   3622: bipush #32
    //   3624: irem
    //   3625: invokestatic abs : (I)I
    //   3628: invokevirtual charAt : (I)C
    //   3631: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3634: pop
    //   3635: iload_2
    //   3636: ifne -> 3864
    //   3639: goto -> 3646
    //   3642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3645: athrow
    //   3646: aload_3
    //   3647: getstatic burp/Zlhq.Zl : Ljava/lang/String;
    //   3650: getstatic burp/Zztn.ZO : Ljava/lang/Object;
    //   3653: checkcast java/math/BigInteger
    //   3656: invokevirtual intValue : ()I
    //   3659: bipush #32
    //   3661: irem
    //   3662: invokestatic abs : (I)I
    //   3665: invokevirtual charAt : (I)C
    //   3668: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3671: pop
    //   3672: iload_2
    //   3673: ifne -> 3864
    //   3676: goto -> 3683
    //   3679: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3682: athrow
    //   3683: aload_3
    //   3684: getstatic burp/Zke7.Zl : Ljava/lang/String;
    //   3687: getstatic burp/Zgpp.Zt : Ljava/lang/Object;
    //   3690: checkcast java/math/BigInteger
    //   3693: invokevirtual intValue : ()I
    //   3696: bipush #32
    //   3698: irem
    //   3699: invokestatic abs : (I)I
    //   3702: invokevirtual charAt : (I)C
    //   3705: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3708: pop
    //   3709: iload_2
    //   3710: ifne -> 3864
    //   3713: goto -> 3720
    //   3716: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3719: athrow
    //   3720: aload_3
    //   3721: getstatic burp/Zkll.ZX : Ljava/lang/String;
    //   3724: getstatic burp/Zz20.ZN : Ljava/lang/Object;
    //   3727: checkcast java/math/BigInteger
    //   3730: invokevirtual intValue : ()I
    //   3733: bipush #32
    //   3735: irem
    //   3736: invokestatic abs : (I)I
    //   3739: invokevirtual charAt : (I)C
    //   3742: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3745: pop
    //   3746: iload_2
    //   3747: ifne -> 3864
    //   3750: goto -> 3757
    //   3753: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3756: athrow
    //   3757: aload_3
    //   3758: getstatic burp/Zg4w.ZC : Ljava/lang/String;
    //   3761: getstatic burp/Zb.ZV : Ljava/lang/Object;
    //   3764: checkcast java/math/BigInteger
    //   3767: invokevirtual intValue : ()I
    //   3770: bipush #32
    //   3772: irem
    //   3773: invokestatic abs : (I)I
    //   3776: invokevirtual charAt : (I)C
    //   3779: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3782: pop
    //   3783: iload_2
    //   3784: ifne -> 3864
    //   3787: goto -> 3794
    //   3790: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3793: athrow
    //   3794: aload_3
    //   3795: getstatic burp/Zefo.Zb : Ljava/lang/String;
    //   3798: getstatic burp/Zsxh.Zk : Ljava/lang/Object;
    //   3801: checkcast java/math/BigInteger
    //   3804: invokevirtual intValue : ()I
    //   3807: bipush #32
    //   3809: irem
    //   3810: invokestatic abs : (I)I
    //   3813: invokevirtual charAt : (I)C
    //   3816: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3819: pop
    //   3820: iload_2
    //   3821: ifne -> 3864
    //   3824: goto -> 3831
    //   3827: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3830: athrow
    //   3831: aload_3
    //   3832: getstatic burp/Zkll.ZX : Ljava/lang/String;
    //   3835: getstatic burp/Zzo5.Zf : Ljava/lang/Object;
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
    //   3868: ifne -> 2532
    //   3871: aload_3
    //   3872: invokevirtual toString : ()Ljava/lang/String;
    //   3875: putstatic burp/Zsbt.ZX : Ljava/lang/String;
    //   3878: sipush #-3657
    //   3881: sipush #-28471
    //   3884: invokestatic a : (II)Ljava/lang/String;
    //   3887: iconst_1
    //   3888: ldc burp/Zlvb
    //   3890: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3893: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3896: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3899: astore #4
    //   3901: aload #4
    //   3903: arraylength
    //   3904: istore #5
    //   3906: iconst_0
    //   3907: istore #6
    //   3909: iload #6
    //   3911: iload #5
    //   3913: if_icmpge -> 4051
    //   3916: aload #4
    //   3918: iload #6
    //   3920: aaload
    //   3921: astore #7
    //   3923: aload #7
    //   3925: invokevirtual getModifiers : ()I
    //   3928: invokestatic isStatic : (I)Z
    //   3931: ifne -> 3941
    //   3934: goto -> 4044
    //   3937: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3940: athrow
    //   3941: aload #7
    //   3943: invokevirtual getType : ()Ljava/lang/Class;
    //   3946: astore #8
    //   3948: aload #8
    //   3950: ifnull -> 4031
    //   3953: aload #8
    //   3955: invokevirtual isPrimitive : ()Z
    //   3958: ifne -> 4031
    //   3961: goto -> 3968
    //   3964: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3967: athrow
    //   3968: aload #8
    //   3970: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3973: ifnull -> 4031
    //   3976: goto -> 3983
    //   3979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3982: athrow
    //   3983: aload #8
    //   3985: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3988: invokevirtual getName : ()Ljava/lang/String;
    //   3991: ifnull -> 4031
    //   3994: goto -> 4001
    //   3997: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4000: athrow
    //   4001: aload #8
    //   4003: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4006: invokevirtual getName : ()Ljava/lang/String;
    //   4009: sipush #-3663
    //   4012: sipush #-5609
    //   4015: invokestatic a : (II)Ljava/lang/String;
    //   4018: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4021: ifne -> 4031
    //   4024: goto -> 4031
    //   4027: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4030: athrow
    //   4031: aload #7
    //   4033: iconst_1
    //   4034: invokevirtual setAccessible : (Z)V
    //   4037: aload #7
    //   4039: aconst_null
    //   4040: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4043: pop
    //   4044: iinc #6, 1
    //   4047: iload_2
    //   4048: ifne -> 3909
    //   4051: sipush #-3668
    //   4054: sipush #26666
    //   4057: invokestatic a : (II)Ljava/lang/String;
    //   4060: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4063: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4066: astore #4
    //   4068: aload #4
    //   4070: arraylength
    //   4071: istore #5
    //   4073: iconst_0
    //   4074: istore #6
    //   4076: iload #6
    //   4078: iload #5
    //   4080: if_icmpge -> 4213
    //   4083: aload #4
    //   4085: iload #6
    //   4087: aaload
    //   4088: astore #7
    //   4090: aload #7
    //   4092: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4095: pop
    //   4096: aload #7
    //   4098: invokevirtual getModifiers : ()I
    //   4101: invokestatic isStatic : (I)Z
    //   4104: ifeq -> 4199
    //   4107: aload #7
    //   4109: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4112: arraylength
    //   4113: iconst_2
    //   4114: if_icmpne -> 4199
    //   4117: goto -> 4124
    //   4120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4123: athrow
    //   4124: aload #7
    //   4126: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4129: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   4132: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4135: ifeq -> 4199
    //   4138: goto -> 4145
    //   4141: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4144: athrow
    //   4145: aload #7
    //   4147: iconst_1
    //   4148: invokevirtual setAccessible : (Z)V
    //   4151: aload #7
    //   4153: aconst_null
    //   4154: iconst_2
    //   4155: anewarray java/lang/Object
    //   4158: dup
    //   4159: iconst_0
    //   4160: aload_0
    //   4161: aastore
    //   4162: dup
    //   4163: iconst_1
    //   4164: aload_1
    //   4165: ifnonnull -> 4183
    //   4168: goto -> 4175
    //   4171: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4174: athrow
    //   4175: aload_1
    //   4176: goto -> 4190
    //   4179: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4182: athrow
    //   4183: aload_1
    //   4184: checkcast [B
    //   4187: invokevirtual clone : ()Ljava/lang/Object;
    //   4190: aastore
    //   4191: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4194: pop
    //   4195: iload_2
    //   4196: ifne -> 4213
    //   4199: iinc #6, 1
    //   4202: iload_2
    //   4203: ifne -> 4076
    //   4206: goto -> 4213
    //   4209: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4212: athrow
    //   4213: iconst_0
    //   4214: istore #4
    //   4216: getstatic burp/Ze5t.ZX : Ljava/lang/String;
    //   4219: getstatic burp/Zt3f.Zp : Ljava/lang/Object;
    //   4222: checkcast java/math/BigInteger
    //   4225: invokevirtual intValue : ()I
    //   4228: bipush #32
    //   4230: irem
    //   4231: invokestatic abs : (I)I
    //   4234: invokevirtual charAt : (I)C
    //   4237: getstatic burp/Zs2n.ZI : Ljava/lang/String;
    //   4240: getstatic burp/Zxe.Zg : Ljava/lang/Object;
    //   4243: checkcast java/math/BigInteger
    //   4246: invokevirtual intValue : ()I
    //   4249: bipush #32
    //   4251: irem
    //   4252: invokestatic abs : (I)I
    //   4255: invokevirtual charAt : (I)C
    //   4258: if_icmpgt -> 4603
    //   4261: sipush #-3656
    //   4264: sipush #-5035
    //   4267: invokestatic a : (II)Ljava/lang/String;
    //   4270: iconst_1
    //   4271: ldc burp/Zlhk
    //   4273: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4276: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4279: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4282: astore #5
    //   4284: aload #5
    //   4286: arraylength
    //   4287: istore #6
    //   4289: iconst_0
    //   4290: istore #7
    //   4292: iload #7
    //   4294: iload #6
    //   4296: if_icmpge -> 4434
    //   4299: aload #5
    //   4301: iload #7
    //   4303: aaload
    //   4304: astore #8
    //   4306: aload #8
    //   4308: invokevirtual getModifiers : ()I
    //   4311: invokestatic isStatic : (I)Z
    //   4314: ifne -> 4324
    //   4317: goto -> 4427
    //   4320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4323: athrow
    //   4324: aload #8
    //   4326: invokevirtual getType : ()Ljava/lang/Class;
    //   4329: astore #9
    //   4331: aload #9
    //   4333: ifnull -> 4414
    //   4336: aload #9
    //   4338: invokevirtual isPrimitive : ()Z
    //   4341: ifne -> 4414
    //   4344: goto -> 4351
    //   4347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4350: athrow
    //   4351: aload #9
    //   4353: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4356: ifnull -> 4414
    //   4359: goto -> 4366
    //   4362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4365: athrow
    //   4366: aload #9
    //   4368: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4371: invokevirtual getName : ()Ljava/lang/String;
    //   4374: ifnull -> 4414
    //   4377: goto -> 4384
    //   4380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4383: athrow
    //   4384: aload #9
    //   4386: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4389: invokevirtual getName : ()Ljava/lang/String;
    //   4392: sipush #-3662
    //   4395: sipush #20655
    //   4398: invokestatic a : (II)Ljava/lang/String;
    //   4401: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4404: ifne -> 4414
    //   4407: goto -> 4414
    //   4410: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4413: athrow
    //   4414: aload #8
    //   4416: iconst_1
    //   4417: invokevirtual setAccessible : (Z)V
    //   4420: aload #8
    //   4422: aconst_null
    //   4423: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4426: pop
    //   4427: iinc #7, 1
    //   4430: iload_2
    //   4431: ifne -> 4292
    //   4434: sipush #-3673
    //   4437: sipush #-10063
    //   4440: invokestatic a : (II)Ljava/lang/String;
    //   4443: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4446: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4449: astore #5
    //   4451: aload #5
    //   4453: arraylength
    //   4454: istore #6
    //   4456: iconst_0
    //   4457: istore #7
    //   4459: iload #7
    //   4461: iload #6
    //   4463: if_icmpge -> 4600
    //   4466: aload #5
    //   4468: iload #7
    //   4470: aaload
    //   4471: astore #8
    //   4473: aload #8
    //   4475: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4478: pop
    //   4479: aload #8
    //   4481: invokevirtual getModifiers : ()I
    //   4484: invokestatic isStatic : (I)Z
    //   4487: ifeq -> 4586
    //   4490: aload #8
    //   4492: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4495: arraylength
    //   4496: iconst_2
    //   4497: if_icmpne -> 4586
    //   4500: goto -> 4507
    //   4503: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4506: athrow
    //   4507: aload #8
    //   4509: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4512: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4515: if_acmpne -> 4586
    //   4518: goto -> 4525
    //   4521: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4524: athrow
    //   4525: aload #8
    //   4527: iconst_1
    //   4528: invokevirtual setAccessible : (Z)V
    //   4531: aload #8
    //   4533: aconst_null
    //   4534: iconst_2
    //   4535: anewarray java/lang/Object
    //   4538: dup
    //   4539: iconst_0
    //   4540: aload_0
    //   4541: aastore
    //   4542: dup
    //   4543: iconst_1
    //   4544: aload_1
    //   4545: ifnonnull -> 4563
    //   4548: goto -> 4555
    //   4551: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4554: athrow
    //   4555: aload_1
    //   4556: goto -> 4570
    //   4559: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4562: athrow
    //   4563: aload_1
    //   4564: checkcast [B
    //   4567: invokevirtual clone : ()Ljava/lang/Object;
    //   4570: aastore
    //   4571: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4574: checkcast java/lang/Boolean
    //   4577: invokevirtual booleanValue : ()Z
    //   4580: istore #4
    //   4582: iload_2
    //   4583: ifne -> 4600
    //   4586: iinc #7, 1
    //   4589: iload_2
    //   4590: ifne -> 4459
    //   4593: goto -> 4600
    //   4596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4599: athrow
    //   4600: goto -> 4942
    //   4603: sipush #-3653
    //   4606: sipush #-16298
    //   4609: invokestatic a : (II)Ljava/lang/String;
    //   4612: iconst_1
    //   4613: ldc burp/Zgja
    //   4615: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4618: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4621: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4624: astore #5
    //   4626: aload #5
    //   4628: arraylength
    //   4629: istore #6
    //   4631: iconst_0
    //   4632: istore #7
    //   4634: iload #7
    //   4636: iload #6
    //   4638: if_icmpge -> 4776
    //   4641: aload #5
    //   4643: iload #7
    //   4645: aaload
    //   4646: astore #8
    //   4648: aload #8
    //   4650: invokevirtual getModifiers : ()I
    //   4653: invokestatic isStatic : (I)Z
    //   4656: ifne -> 4666
    //   4659: goto -> 4769
    //   4662: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4665: athrow
    //   4666: aload #8
    //   4668: invokevirtual getType : ()Ljava/lang/Class;
    //   4671: astore #9
    //   4673: aload #9
    //   4675: ifnull -> 4756
    //   4678: aload #9
    //   4680: invokevirtual isPrimitive : ()Z
    //   4683: ifne -> 4756
    //   4686: goto -> 4693
    //   4689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4692: athrow
    //   4693: aload #9
    //   4695: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4698: ifnull -> 4756
    //   4701: goto -> 4708
    //   4704: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4707: athrow
    //   4708: aload #9
    //   4710: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4713: invokevirtual getName : ()Ljava/lang/String;
    //   4716: ifnull -> 4756
    //   4719: goto -> 4726
    //   4722: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4725: athrow
    //   4726: aload #9
    //   4728: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4731: invokevirtual getName : ()Ljava/lang/String;
    //   4734: sipush #-3662
    //   4737: sipush #20655
    //   4740: invokestatic a : (II)Ljava/lang/String;
    //   4743: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4746: ifne -> 4756
    //   4749: goto -> 4756
    //   4752: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4755: athrow
    //   4756: aload #8
    //   4758: iconst_1
    //   4759: invokevirtual setAccessible : (Z)V
    //   4762: aload #8
    //   4764: aconst_null
    //   4765: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4768: pop
    //   4769: iinc #7, 1
    //   4772: iload_2
    //   4773: ifne -> 4634
    //   4776: sipush #-3680
    //   4779: sipush #-15713
    //   4782: invokestatic a : (II)Ljava/lang/String;
    //   4785: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4788: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4791: astore #5
    //   4793: aload #5
    //   4795: arraylength
    //   4796: istore #6
    //   4798: iconst_0
    //   4799: istore #7
    //   4801: iload #7
    //   4803: iload #6
    //   4805: if_icmpge -> 4942
    //   4808: aload #5
    //   4810: iload #7
    //   4812: aaload
    //   4813: astore #8
    //   4815: aload #8
    //   4817: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4820: pop
    //   4821: aload #8
    //   4823: invokevirtual getModifiers : ()I
    //   4826: invokestatic isStatic : (I)Z
    //   4829: ifeq -> 4928
    //   4832: aload #8
    //   4834: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4837: arraylength
    //   4838: iconst_2
    //   4839: if_icmpne -> 4928
    //   4842: goto -> 4849
    //   4845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4848: athrow
    //   4849: aload #8
    //   4851: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4854: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4857: if_acmpne -> 4928
    //   4860: goto -> 4867
    //   4863: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4866: athrow
    //   4867: aload #8
    //   4869: iconst_1
    //   4870: invokevirtual setAccessible : (Z)V
    //   4873: aload #8
    //   4875: aconst_null
    //   4876: iconst_2
    //   4877: anewarray java/lang/Object
    //   4880: dup
    //   4881: iconst_0
    //   4882: aload_0
    //   4883: aastore
    //   4884: dup
    //   4885: iconst_1
    //   4886: aload_1
    //   4887: ifnonnull -> 4905
    //   4890: goto -> 4897
    //   4893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4896: athrow
    //   4897: aload_1
    //   4898: goto -> 4912
    //   4901: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4904: athrow
    //   4905: aload_1
    //   4906: checkcast [B
    //   4909: invokevirtual clone : ()Ljava/lang/Object;
    //   4912: aastore
    //   4913: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4916: checkcast java/lang/Boolean
    //   4919: invokevirtual booleanValue : ()Z
    //   4922: istore #4
    //   4924: iload_2
    //   4925: ifne -> 4942
    //   4928: iinc #7, 1
    //   4931: iload_2
    //   4932: ifne -> 4801
    //   4935: goto -> 4942
    //   4938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4941: athrow
    //   4942: iload #4
    //   4944: ifeq -> 4950
    //   4947: iload #4
    //   4949: ireturn
    //   4950: getstatic burp/Ze5t.ZX : Ljava/lang/String;
    //   4953: getstatic burp/Zl50.ZV : Ljava/lang/Object;
    //   4956: checkcast java/math/BigInteger
    //   4959: invokevirtual intValue : ()I
    //   4962: bipush #32
    //   4964: irem
    //   4965: invokestatic abs : (I)I
    //   4968: invokevirtual charAt : (I)C
    //   4971: getstatic burp/Zeqg.Zh : Ljava/lang/String;
    //   4974: getstatic burp/Zv8c.Zx : Ljava/lang/Object;
    //   4977: checkcast java/math/BigInteger
    //   4980: invokevirtual intValue : ()I
    //   4983: bipush #32
    //   4985: irem
    //   4986: invokestatic abs : (I)I
    //   4989: invokevirtual charAt : (I)C
    //   4992: if_icmple -> 5338
    //   4995: sipush #-3661
    //   4998: sipush #-17463
    //   5001: invokestatic a : (II)Ljava/lang/String;
    //   5004: iconst_1
    //   5005: ldc burp/Zrhu
    //   5007: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5010: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5013: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5016: astore #5
    //   5018: aload #5
    //   5020: arraylength
    //   5021: istore #6
    //   5023: iconst_0
    //   5024: istore #7
    //   5026: iload #7
    //   5028: iload #6
    //   5030: if_icmpge -> 5168
    //   5033: aload #5
    //   5035: iload #7
    //   5037: aaload
    //   5038: astore #8
    //   5040: aload #8
    //   5042: invokevirtual getModifiers : ()I
    //   5045: invokestatic isStatic : (I)Z
    //   5048: ifne -> 5058
    //   5051: goto -> 5161
    //   5054: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5057: athrow
    //   5058: aload #8
    //   5060: invokevirtual getType : ()Ljava/lang/Class;
    //   5063: astore #9
    //   5065: aload #9
    //   5067: ifnull -> 5148
    //   5070: aload #9
    //   5072: invokevirtual isPrimitive : ()Z
    //   5075: ifne -> 5148
    //   5078: goto -> 5085
    //   5081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5084: athrow
    //   5085: aload #9
    //   5087: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5090: ifnull -> 5148
    //   5093: goto -> 5100
    //   5096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5099: athrow
    //   5100: aload #9
    //   5102: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5105: invokevirtual getName : ()Ljava/lang/String;
    //   5108: ifnull -> 5148
    //   5111: goto -> 5118
    //   5114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5117: athrow
    //   5118: aload #9
    //   5120: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5123: invokevirtual getName : ()Ljava/lang/String;
    //   5126: sipush #-3662
    //   5129: sipush #20655
    //   5132: invokestatic a : (II)Ljava/lang/String;
    //   5135: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5138: ifne -> 5148
    //   5141: goto -> 5148
    //   5144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5147: athrow
    //   5148: aload #8
    //   5150: iconst_1
    //   5151: invokevirtual setAccessible : (Z)V
    //   5154: aload #8
    //   5156: aconst_null
    //   5157: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5160: pop
    //   5161: iinc #7, 1
    //   5164: iload_2
    //   5165: ifne -> 5026
    //   5168: sipush #-3651
    //   5171: sipush #-19204
    //   5174: invokestatic a : (II)Ljava/lang/String;
    //   5177: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5180: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5183: astore #5
    //   5185: aload #5
    //   5187: arraylength
    //   5188: istore #6
    //   5190: iconst_0
    //   5191: istore #7
    //   5193: iload #7
    //   5195: iload #6
    //   5197: if_icmpge -> 5334
    //   5200: aload #5
    //   5202: iload #7
    //   5204: aaload
    //   5205: astore #8
    //   5207: aload #8
    //   5209: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5212: pop
    //   5213: aload #8
    //   5215: invokevirtual getModifiers : ()I
    //   5218: invokestatic isStatic : (I)Z
    //   5221: ifeq -> 5320
    //   5224: aload #8
    //   5226: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5229: arraylength
    //   5230: iconst_2
    //   5231: if_icmpne -> 5320
    //   5234: goto -> 5241
    //   5237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5240: athrow
    //   5241: aload #8
    //   5243: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5246: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5249: if_acmpne -> 5320
    //   5252: goto -> 5259
    //   5255: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5258: athrow
    //   5259: aload #8
    //   5261: iconst_1
    //   5262: invokevirtual setAccessible : (Z)V
    //   5265: aload #8
    //   5267: aconst_null
    //   5268: iconst_2
    //   5269: anewarray java/lang/Object
    //   5272: dup
    //   5273: iconst_0
    //   5274: aload_0
    //   5275: aastore
    //   5276: dup
    //   5277: iconst_1
    //   5278: aload_1
    //   5279: ifnonnull -> 5297
    //   5282: goto -> 5289
    //   5285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5288: athrow
    //   5289: aload_1
    //   5290: goto -> 5304
    //   5293: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5296: athrow
    //   5297: aload_1
    //   5298: checkcast [B
    //   5301: invokevirtual clone : ()Ljava/lang/Object;
    //   5304: aastore
    //   5305: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5308: checkcast java/lang/Boolean
    //   5311: invokevirtual booleanValue : ()Z
    //   5314: istore #4
    //   5316: iload_2
    //   5317: ifne -> 5334
    //   5320: iinc #7, 1
    //   5323: iload_2
    //   5324: ifne -> 5193
    //   5327: goto -> 5334
    //   5330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5333: athrow
    //   5334: iload_2
    //   5335: ifne -> 5677
    //   5338: sipush #-3652
    //   5341: sipush #-17298
    //   5344: invokestatic a : (II)Ljava/lang/String;
    //   5347: iconst_1
    //   5348: ldc burp/Zgsy
    //   5350: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5353: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5356: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5359: astore #5
    //   5361: aload #5
    //   5363: arraylength
    //   5364: istore #6
    //   5366: iconst_0
    //   5367: istore #7
    //   5369: iload #7
    //   5371: iload #6
    //   5373: if_icmpge -> 5511
    //   5376: aload #5
    //   5378: iload #7
    //   5380: aaload
    //   5381: astore #8
    //   5383: aload #8
    //   5385: invokevirtual getModifiers : ()I
    //   5388: invokestatic isStatic : (I)Z
    //   5391: ifne -> 5401
    //   5394: goto -> 5504
    //   5397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5400: athrow
    //   5401: aload #8
    //   5403: invokevirtual getType : ()Ljava/lang/Class;
    //   5406: astore #9
    //   5408: aload #9
    //   5410: ifnull -> 5491
    //   5413: aload #9
    //   5415: invokevirtual isPrimitive : ()Z
    //   5418: ifne -> 5491
    //   5421: goto -> 5428
    //   5424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5427: athrow
    //   5428: aload #9
    //   5430: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5433: ifnull -> 5491
    //   5436: goto -> 5443
    //   5439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5442: athrow
    //   5443: aload #9
    //   5445: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5448: invokevirtual getName : ()Ljava/lang/String;
    //   5451: ifnull -> 5491
    //   5454: goto -> 5461
    //   5457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5460: athrow
    //   5461: aload #9
    //   5463: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5466: invokevirtual getName : ()Ljava/lang/String;
    //   5469: sipush #-3662
    //   5472: sipush #20655
    //   5475: invokestatic a : (II)Ljava/lang/String;
    //   5478: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5481: ifne -> 5491
    //   5484: goto -> 5491
    //   5487: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5490: athrow
    //   5491: aload #8
    //   5493: iconst_1
    //   5494: invokevirtual setAccessible : (Z)V
    //   5497: aload #8
    //   5499: aconst_null
    //   5500: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5503: pop
    //   5504: iinc #7, 1
    //   5507: iload_2
    //   5508: ifne -> 5369
    //   5511: sipush #-3659
    //   5514: sipush #28447
    //   5517: invokestatic a : (II)Ljava/lang/String;
    //   5520: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5523: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5526: astore #5
    //   5528: aload #5
    //   5530: arraylength
    //   5531: istore #6
    //   5533: iconst_0
    //   5534: istore #7
    //   5536: iload #7
    //   5538: iload #6
    //   5540: if_icmpge -> 5677
    //   5543: aload #5
    //   5545: iload #7
    //   5547: aaload
    //   5548: astore #8
    //   5550: aload #8
    //   5552: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5555: pop
    //   5556: aload #8
    //   5558: invokevirtual getModifiers : ()I
    //   5561: invokestatic isStatic : (I)Z
    //   5564: ifeq -> 5663
    //   5567: aload #8
    //   5569: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5572: arraylength
    //   5573: iconst_2
    //   5574: if_icmpne -> 5663
    //   5577: goto -> 5584
    //   5580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5583: athrow
    //   5584: aload #8
    //   5586: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5589: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5592: if_acmpne -> 5663
    //   5595: goto -> 5602
    //   5598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5601: athrow
    //   5602: aload #8
    //   5604: iconst_1
    //   5605: invokevirtual setAccessible : (Z)V
    //   5608: aload #8
    //   5610: aconst_null
    //   5611: iconst_2
    //   5612: anewarray java/lang/Object
    //   5615: dup
    //   5616: iconst_0
    //   5617: aload_0
    //   5618: aastore
    //   5619: dup
    //   5620: iconst_1
    //   5621: aload_1
    //   5622: ifnonnull -> 5640
    //   5625: goto -> 5632
    //   5628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5631: athrow
    //   5632: aload_1
    //   5633: goto -> 5647
    //   5636: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5639: athrow
    //   5640: aload_1
    //   5641: checkcast [B
    //   5644: invokevirtual clone : ()Ljava/lang/Object;
    //   5647: aastore
    //   5648: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5651: checkcast java/lang/Boolean
    //   5654: invokevirtual booleanValue : ()Z
    //   5657: istore #4
    //   5659: iload_2
    //   5660: ifne -> 5677
    //   5663: iinc #7, 1
    //   5666: iload_2
    //   5667: ifne -> 5536
    //   5670: goto -> 5677
    //   5673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5676: athrow
    //   5677: iload #4
    //   5679: ifeq -> 5685
    //   5682: iload #4
    //   5684: ireturn
    //   5685: getstatic burp/Zefo.Zb : Ljava/lang/String;
    //   5688: getstatic burp/Zmx6.ZJ : Ljava/lang/Object;
    //   5691: checkcast java/math/BigInteger
    //   5694: invokevirtual intValue : ()I
    //   5697: bipush #32
    //   5699: irem
    //   5700: invokestatic abs : (I)I
    //   5703: invokevirtual charAt : (I)C
    //   5706: getstatic burp/Zgq_.ZQ : Ljava/lang/String;
    //   5709: getstatic burp/Zm6h.ZB : Ljava/lang/Object;
    //   5712: checkcast java/math/BigInteger
    //   5715: invokevirtual intValue : ()I
    //   5718: bipush #32
    //   5720: irem
    //   5721: invokestatic abs : (I)I
    //   5724: invokevirtual charAt : (I)C
    //   5727: if_icmple -> 6073
    //   5730: sipush #-3670
    //   5733: sipush #24491
    //   5736: invokestatic a : (II)Ljava/lang/String;
    //   5739: iconst_1
    //   5740: ldc burp/Zxn9
    //   5742: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5745: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5748: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5751: astore #5
    //   5753: aload #5
    //   5755: arraylength
    //   5756: istore #6
    //   5758: iconst_0
    //   5759: istore #7
    //   5761: iload #7
    //   5763: iload #6
    //   5765: if_icmpge -> 5903
    //   5768: aload #5
    //   5770: iload #7
    //   5772: aaload
    //   5773: astore #8
    //   5775: aload #8
    //   5777: invokevirtual getModifiers : ()I
    //   5780: invokestatic isStatic : (I)Z
    //   5783: ifne -> 5793
    //   5786: goto -> 5896
    //   5789: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5792: athrow
    //   5793: aload #8
    //   5795: invokevirtual getType : ()Ljava/lang/Class;
    //   5798: astore #9
    //   5800: aload #9
    //   5802: ifnull -> 5883
    //   5805: aload #9
    //   5807: invokevirtual isPrimitive : ()Z
    //   5810: ifne -> 5883
    //   5813: goto -> 5820
    //   5816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5819: athrow
    //   5820: aload #9
    //   5822: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5825: ifnull -> 5883
    //   5828: goto -> 5835
    //   5831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5834: athrow
    //   5835: aload #9
    //   5837: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5840: invokevirtual getName : ()Ljava/lang/String;
    //   5843: ifnull -> 5883
    //   5846: goto -> 5853
    //   5849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5852: athrow
    //   5853: aload #9
    //   5855: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5858: invokevirtual getName : ()Ljava/lang/String;
    //   5861: sipush #-3662
    //   5864: sipush #20655
    //   5867: invokestatic a : (II)Ljava/lang/String;
    //   5870: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5873: ifne -> 5883
    //   5876: goto -> 5883
    //   5879: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5882: athrow
    //   5883: aload #8
    //   5885: iconst_1
    //   5886: invokevirtual setAccessible : (Z)V
    //   5889: aload #8
    //   5891: aconst_null
    //   5892: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5895: pop
    //   5896: iinc #7, 1
    //   5899: iload_2
    //   5900: ifne -> 5761
    //   5903: sipush #-3675
    //   5906: sipush #6827
    //   5909: invokestatic a : (II)Ljava/lang/String;
    //   5912: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5915: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5918: astore #5
    //   5920: aload #5
    //   5922: arraylength
    //   5923: istore #6
    //   5925: iconst_0
    //   5926: istore #7
    //   5928: iload #7
    //   5930: iload #6
    //   5932: if_icmpge -> 6069
    //   5935: aload #5
    //   5937: iload #7
    //   5939: aaload
    //   5940: astore #8
    //   5942: aload #8
    //   5944: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5947: pop
    //   5948: aload #8
    //   5950: invokevirtual getModifiers : ()I
    //   5953: invokestatic isStatic : (I)Z
    //   5956: ifeq -> 6055
    //   5959: aload #8
    //   5961: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5964: arraylength
    //   5965: iconst_2
    //   5966: if_icmpne -> 6055
    //   5969: goto -> 5976
    //   5972: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5975: athrow
    //   5976: aload #8
    //   5978: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5981: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5984: if_acmpne -> 6055
    //   5987: goto -> 5994
    //   5990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5993: athrow
    //   5994: aload #8
    //   5996: iconst_1
    //   5997: invokevirtual setAccessible : (Z)V
    //   6000: aload #8
    //   6002: aconst_null
    //   6003: iconst_2
    //   6004: anewarray java/lang/Object
    //   6007: dup
    //   6008: iconst_0
    //   6009: aload_0
    //   6010: aastore
    //   6011: dup
    //   6012: iconst_1
    //   6013: aload_1
    //   6014: ifnonnull -> 6032
    //   6017: goto -> 6024
    //   6020: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6023: athrow
    //   6024: aload_1
    //   6025: goto -> 6039
    //   6028: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6031: athrow
    //   6032: aload_1
    //   6033: checkcast [B
    //   6036: invokevirtual clone : ()Ljava/lang/Object;
    //   6039: aastore
    //   6040: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6043: checkcast java/lang/Boolean
    //   6046: invokevirtual booleanValue : ()Z
    //   6049: istore #4
    //   6051: iload_2
    //   6052: ifne -> 6069
    //   6055: iinc #7, 1
    //   6058: iload_2
    //   6059: ifne -> 5928
    //   6062: goto -> 6069
    //   6065: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6068: athrow
    //   6069: iload_2
    //   6070: ifne -> 6412
    //   6073: sipush #-3677
    //   6076: sipush #-17398
    //   6079: invokestatic a : (II)Ljava/lang/String;
    //   6082: iconst_1
    //   6083: ldc burp/Zmli
    //   6085: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6088: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6091: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6094: astore #5
    //   6096: aload #5
    //   6098: arraylength
    //   6099: istore #6
    //   6101: iconst_0
    //   6102: istore #7
    //   6104: iload #7
    //   6106: iload #6
    //   6108: if_icmpge -> 6246
    //   6111: aload #5
    //   6113: iload #7
    //   6115: aaload
    //   6116: astore #8
    //   6118: aload #8
    //   6120: invokevirtual getModifiers : ()I
    //   6123: invokestatic isStatic : (I)Z
    //   6126: ifne -> 6136
    //   6129: goto -> 6239
    //   6132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6135: athrow
    //   6136: aload #8
    //   6138: invokevirtual getType : ()Ljava/lang/Class;
    //   6141: astore #9
    //   6143: aload #9
    //   6145: ifnull -> 6226
    //   6148: aload #9
    //   6150: invokevirtual isPrimitive : ()Z
    //   6153: ifne -> 6226
    //   6156: goto -> 6163
    //   6159: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6162: athrow
    //   6163: aload #9
    //   6165: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6168: ifnull -> 6226
    //   6171: goto -> 6178
    //   6174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6177: athrow
    //   6178: aload #9
    //   6180: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6183: invokevirtual getName : ()Ljava/lang/String;
    //   6186: ifnull -> 6226
    //   6189: goto -> 6196
    //   6192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6195: athrow
    //   6196: aload #9
    //   6198: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6201: invokevirtual getName : ()Ljava/lang/String;
    //   6204: sipush #-3662
    //   6207: sipush #20655
    //   6210: invokestatic a : (II)Ljava/lang/String;
    //   6213: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6216: ifne -> 6226
    //   6219: goto -> 6226
    //   6222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6225: athrow
    //   6226: aload #8
    //   6228: iconst_1
    //   6229: invokevirtual setAccessible : (Z)V
    //   6232: aload #8
    //   6234: aconst_null
    //   6235: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6238: pop
    //   6239: iinc #7, 1
    //   6242: iload_2
    //   6243: ifne -> 6104
    //   6246: sipush #-3678
    //   6249: sipush #25006
    //   6252: invokestatic a : (II)Ljava/lang/String;
    //   6255: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6258: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6261: astore #5
    //   6263: aload #5
    //   6265: arraylength
    //   6266: istore #6
    //   6268: iconst_0
    //   6269: istore #7
    //   6271: iload #7
    //   6273: iload #6
    //   6275: if_icmpge -> 6412
    //   6278: aload #5
    //   6280: iload #7
    //   6282: aaload
    //   6283: astore #8
    //   6285: aload #8
    //   6287: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6290: pop
    //   6291: aload #8
    //   6293: invokevirtual getModifiers : ()I
    //   6296: invokestatic isStatic : (I)Z
    //   6299: ifeq -> 6398
    //   6302: aload #8
    //   6304: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6307: arraylength
    //   6308: iconst_2
    //   6309: if_icmpne -> 6398
    //   6312: goto -> 6319
    //   6315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6318: athrow
    //   6319: aload #8
    //   6321: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6324: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6327: if_acmpne -> 6398
    //   6330: goto -> 6337
    //   6333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6336: athrow
    //   6337: aload #8
    //   6339: iconst_1
    //   6340: invokevirtual setAccessible : (Z)V
    //   6343: aload #8
    //   6345: aconst_null
    //   6346: iconst_2
    //   6347: anewarray java/lang/Object
    //   6350: dup
    //   6351: iconst_0
    //   6352: aload_0
    //   6353: aastore
    //   6354: dup
    //   6355: iconst_1
    //   6356: aload_1
    //   6357: ifnonnull -> 6375
    //   6360: goto -> 6367
    //   6363: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6366: athrow
    //   6367: aload_1
    //   6368: goto -> 6382
    //   6371: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6374: athrow
    //   6375: aload_1
    //   6376: checkcast [B
    //   6379: invokevirtual clone : ()Ljava/lang/Object;
    //   6382: aastore
    //   6383: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6386: checkcast java/lang/Boolean
    //   6389: invokevirtual booleanValue : ()Z
    //   6392: istore #4
    //   6394: iload_2
    //   6395: ifne -> 6412
    //   6398: iinc #7, 1
    //   6401: iload_2
    //   6402: ifne -> 6271
    //   6405: goto -> 6412
    //   6408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6411: athrow
    //   6412: iload #4
    //   6414: ifeq -> 6420
    //   6417: iload #4
    //   6419: ireturn
    //   6420: getstatic burp/Ze54.ZU : Ljava/lang/String;
    //   6423: getstatic burp/Zest.Zq : Ljava/lang/Object;
    //   6426: checkcast java/math/BigInteger
    //   6429: invokevirtual intValue : ()I
    //   6432: bipush #32
    //   6434: irem
    //   6435: invokestatic abs : (I)I
    //   6438: invokevirtual charAt : (I)C
    //   6441: getstatic burp/Ztex.Zx : Ljava/lang/String;
    //   6444: getstatic burp/Zk7f.Za : Ljava/lang/Object;
    //   6447: checkcast java/math/BigInteger
    //   6450: invokevirtual intValue : ()I
    //   6453: bipush #32
    //   6455: irem
    //   6456: invokestatic abs : (I)I
    //   6459: invokevirtual charAt : (I)C
    //   6462: if_icmpgt -> 6808
    //   6465: sipush #-3655
    //   6468: sipush #19940
    //   6471: invokestatic a : (II)Ljava/lang/String;
    //   6474: iconst_1
    //   6475: ldc burp/Zrdy
    //   6477: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6480: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6483: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6486: astore #5
    //   6488: aload #5
    //   6490: arraylength
    //   6491: istore #6
    //   6493: iconst_0
    //   6494: istore #7
    //   6496: iload #7
    //   6498: iload #6
    //   6500: if_icmpge -> 6638
    //   6503: aload #5
    //   6505: iload #7
    //   6507: aaload
    //   6508: astore #8
    //   6510: aload #8
    //   6512: invokevirtual getModifiers : ()I
    //   6515: invokestatic isStatic : (I)Z
    //   6518: ifne -> 6528
    //   6521: goto -> 6631
    //   6524: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6527: athrow
    //   6528: aload #8
    //   6530: invokevirtual getType : ()Ljava/lang/Class;
    //   6533: astore #9
    //   6535: aload #9
    //   6537: ifnull -> 6618
    //   6540: aload #9
    //   6542: invokevirtual isPrimitive : ()Z
    //   6545: ifne -> 6618
    //   6548: goto -> 6555
    //   6551: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6554: athrow
    //   6555: aload #9
    //   6557: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6560: ifnull -> 6618
    //   6563: goto -> 6570
    //   6566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6569: athrow
    //   6570: aload #9
    //   6572: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6575: invokevirtual getName : ()Ljava/lang/String;
    //   6578: ifnull -> 6618
    //   6581: goto -> 6588
    //   6584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6587: athrow
    //   6588: aload #9
    //   6590: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6593: invokevirtual getName : ()Ljava/lang/String;
    //   6596: sipush #-3662
    //   6599: sipush #20655
    //   6602: invokestatic a : (II)Ljava/lang/String;
    //   6605: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6608: ifne -> 6618
    //   6611: goto -> 6618
    //   6614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6617: athrow
    //   6618: aload #8
    //   6620: iconst_1
    //   6621: invokevirtual setAccessible : (Z)V
    //   6624: aload #8
    //   6626: aconst_null
    //   6627: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6630: pop
    //   6631: iinc #7, 1
    //   6634: iload_2
    //   6635: ifne -> 6496
    //   6638: sipush #-3649
    //   6641: sipush #-2046
    //   6644: invokestatic a : (II)Ljava/lang/String;
    //   6647: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6650: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6653: astore #5
    //   6655: aload #5
    //   6657: arraylength
    //   6658: istore #6
    //   6660: iconst_0
    //   6661: istore #7
    //   6663: iload #7
    //   6665: iload #6
    //   6667: if_icmpge -> 6804
    //   6670: aload #5
    //   6672: iload #7
    //   6674: aaload
    //   6675: astore #8
    //   6677: aload #8
    //   6679: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6682: pop
    //   6683: aload #8
    //   6685: invokevirtual getModifiers : ()I
    //   6688: invokestatic isStatic : (I)Z
    //   6691: ifeq -> 6790
    //   6694: aload #8
    //   6696: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6699: arraylength
    //   6700: iconst_2
    //   6701: if_icmpne -> 6790
    //   6704: goto -> 6711
    //   6707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6710: athrow
    //   6711: aload #8
    //   6713: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6716: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6719: if_acmpne -> 6790
    //   6722: goto -> 6729
    //   6725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6728: athrow
    //   6729: aload #8
    //   6731: iconst_1
    //   6732: invokevirtual setAccessible : (Z)V
    //   6735: aload #8
    //   6737: aconst_null
    //   6738: iconst_2
    //   6739: anewarray java/lang/Object
    //   6742: dup
    //   6743: iconst_0
    //   6744: aload_0
    //   6745: aastore
    //   6746: dup
    //   6747: iconst_1
    //   6748: aload_1
    //   6749: ifnonnull -> 6767
    //   6752: goto -> 6759
    //   6755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6758: athrow
    //   6759: aload_1
    //   6760: goto -> 6774
    //   6763: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6766: athrow
    //   6767: aload_1
    //   6768: checkcast [B
    //   6771: invokevirtual clone : ()Ljava/lang/Object;
    //   6774: aastore
    //   6775: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6778: checkcast java/lang/Boolean
    //   6781: invokevirtual booleanValue : ()Z
    //   6784: istore #4
    //   6786: iload_2
    //   6787: ifne -> 6804
    //   6790: iinc #7, 1
    //   6793: iload_2
    //   6794: ifne -> 6663
    //   6797: goto -> 6804
    //   6800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6803: athrow
    //   6804: iload_2
    //   6805: ifne -> 7147
    //   6808: sipush #-3660
    //   6811: sipush #4529
    //   6814: invokestatic a : (II)Ljava/lang/String;
    //   6817: iconst_1
    //   6818: ldc burp/Zl2t
    //   6820: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6823: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6826: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6829: astore #5
    //   6831: aload #5
    //   6833: arraylength
    //   6834: istore #6
    //   6836: iconst_0
    //   6837: istore #7
    //   6839: iload #7
    //   6841: iload #6
    //   6843: if_icmpge -> 6981
    //   6846: aload #5
    //   6848: iload #7
    //   6850: aaload
    //   6851: astore #8
    //   6853: aload #8
    //   6855: invokevirtual getModifiers : ()I
    //   6858: invokestatic isStatic : (I)Z
    //   6861: ifne -> 6871
    //   6864: goto -> 6974
    //   6867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6870: athrow
    //   6871: aload #8
    //   6873: invokevirtual getType : ()Ljava/lang/Class;
    //   6876: astore #9
    //   6878: aload #9
    //   6880: ifnull -> 6961
    //   6883: aload #9
    //   6885: invokevirtual isPrimitive : ()Z
    //   6888: ifne -> 6961
    //   6891: goto -> 6898
    //   6894: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6897: athrow
    //   6898: aload #9
    //   6900: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6903: ifnull -> 6961
    //   6906: goto -> 6913
    //   6909: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6912: athrow
    //   6913: aload #9
    //   6915: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6918: invokevirtual getName : ()Ljava/lang/String;
    //   6921: ifnull -> 6961
    //   6924: goto -> 6931
    //   6927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6930: athrow
    //   6931: aload #9
    //   6933: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6936: invokevirtual getName : ()Ljava/lang/String;
    //   6939: sipush #-3662
    //   6942: sipush #20655
    //   6945: invokestatic a : (II)Ljava/lang/String;
    //   6948: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6951: ifne -> 6961
    //   6954: goto -> 6961
    //   6957: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6960: athrow
    //   6961: aload #8
    //   6963: iconst_1
    //   6964: invokevirtual setAccessible : (Z)V
    //   6967: aload #8
    //   6969: aconst_null
    //   6970: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6973: pop
    //   6974: iinc #7, 1
    //   6977: iload_2
    //   6978: ifne -> 6839
    //   6981: sipush #-3672
    //   6984: sipush #27935
    //   6987: invokestatic a : (II)Ljava/lang/String;
    //   6990: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6993: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6996: astore #5
    //   6998: aload #5
    //   7000: arraylength
    //   7001: istore #6
    //   7003: iconst_0
    //   7004: istore #7
    //   7006: iload #7
    //   7008: iload #6
    //   7010: if_icmpge -> 7147
    //   7013: aload #5
    //   7015: iload #7
    //   7017: aaload
    //   7018: astore #8
    //   7020: aload #8
    //   7022: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7025: pop
    //   7026: aload #8
    //   7028: invokevirtual getModifiers : ()I
    //   7031: invokestatic isStatic : (I)Z
    //   7034: ifeq -> 7133
    //   7037: aload #8
    //   7039: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7042: arraylength
    //   7043: iconst_2
    //   7044: if_icmpne -> 7133
    //   7047: goto -> 7054
    //   7050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7053: athrow
    //   7054: aload #8
    //   7056: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7059: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7062: if_acmpne -> 7133
    //   7065: goto -> 7072
    //   7068: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7071: athrow
    //   7072: aload #8
    //   7074: iconst_1
    //   7075: invokevirtual setAccessible : (Z)V
    //   7078: aload #8
    //   7080: aconst_null
    //   7081: iconst_2
    //   7082: anewarray java/lang/Object
    //   7085: dup
    //   7086: iconst_0
    //   7087: aload_0
    //   7088: aastore
    //   7089: dup
    //   7090: iconst_1
    //   7091: aload_1
    //   7092: ifnonnull -> 7110
    //   7095: goto -> 7102
    //   7098: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7101: athrow
    //   7102: aload_1
    //   7103: goto -> 7117
    //   7106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7109: athrow
    //   7110: aload_1
    //   7111: checkcast [B
    //   7114: invokevirtual clone : ()Ljava/lang/Object;
    //   7117: aastore
    //   7118: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7121: checkcast java/lang/Boolean
    //   7124: invokevirtual booleanValue : ()Z
    //   7127: istore #4
    //   7129: iload_2
    //   7130: ifne -> 7147
    //   7133: iinc #7, 1
    //   7136: iload_2
    //   7137: ifne -> 7006
    //   7140: goto -> 7147
    //   7143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7146: athrow
    //   7147: iload #4
    //   7149: ifeq -> 7155
    //   7152: iload #4
    //   7154: ireturn
    //   7155: getstatic burp/Zkm0.ZL : Ljava/lang/String;
    //   7158: getstatic burp/Zt3p.ZO : Ljava/lang/Object;
    //   7161: checkcast java/math/BigInteger
    //   7164: invokevirtual intValue : ()I
    //   7167: bipush #32
    //   7169: irem
    //   7170: invokestatic abs : (I)I
    //   7173: invokevirtual charAt : (I)C
    //   7176: getstatic burp/Zv8c.ZO : Ljava/lang/String;
    //   7179: getstatic burp/Zg4d.Zm : Ljava/lang/Object;
    //   7182: checkcast java/math/BigInteger
    //   7185: invokevirtual intValue : ()I
    //   7188: bipush #32
    //   7190: irem
    //   7191: invokestatic abs : (I)I
    //   7194: invokevirtual charAt : (I)C
    //   7197: if_icmple -> 7543
    //   7200: sipush #-3654
    //   7203: sipush #10542
    //   7206: invokestatic a : (II)Ljava/lang/String;
    //   7209: iconst_1
    //   7210: ldc burp/Zm54
    //   7212: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7215: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7218: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7221: astore #5
    //   7223: aload #5
    //   7225: arraylength
    //   7226: istore #6
    //   7228: iconst_0
    //   7229: istore #7
    //   7231: iload #7
    //   7233: iload #6
    //   7235: if_icmpge -> 7373
    //   7238: aload #5
    //   7240: iload #7
    //   7242: aaload
    //   7243: astore #8
    //   7245: aload #8
    //   7247: invokevirtual getModifiers : ()I
    //   7250: invokestatic isStatic : (I)Z
    //   7253: ifne -> 7263
    //   7256: goto -> 7366
    //   7259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7262: athrow
    //   7263: aload #8
    //   7265: invokevirtual getType : ()Ljava/lang/Class;
    //   7268: astore #9
    //   7270: aload #9
    //   7272: ifnull -> 7353
    //   7275: aload #9
    //   7277: invokevirtual isPrimitive : ()Z
    //   7280: ifne -> 7353
    //   7283: goto -> 7290
    //   7286: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7289: athrow
    //   7290: aload #9
    //   7292: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7295: ifnull -> 7353
    //   7298: goto -> 7305
    //   7301: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7304: athrow
    //   7305: aload #9
    //   7307: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7310: invokevirtual getName : ()Ljava/lang/String;
    //   7313: ifnull -> 7353
    //   7316: goto -> 7323
    //   7319: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7322: athrow
    //   7323: aload #9
    //   7325: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7328: invokevirtual getName : ()Ljava/lang/String;
    //   7331: sipush #-3662
    //   7334: sipush #20655
    //   7337: invokestatic a : (II)Ljava/lang/String;
    //   7340: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7343: ifne -> 7353
    //   7346: goto -> 7353
    //   7349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7352: athrow
    //   7353: aload #8
    //   7355: iconst_1
    //   7356: invokevirtual setAccessible : (Z)V
    //   7359: aload #8
    //   7361: aconst_null
    //   7362: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7365: pop
    //   7366: iinc #7, 1
    //   7369: iload_2
    //   7370: ifne -> 7231
    //   7373: sipush #-3681
    //   7376: sipush #6427
    //   7379: invokestatic a : (II)Ljava/lang/String;
    //   7382: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7385: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7388: astore #5
    //   7390: aload #5
    //   7392: arraylength
    //   7393: istore #6
    //   7395: iconst_0
    //   7396: istore #7
    //   7398: iload #7
    //   7400: iload #6
    //   7402: if_icmpge -> 7539
    //   7405: aload #5
    //   7407: iload #7
    //   7409: aaload
    //   7410: astore #8
    //   7412: aload #8
    //   7414: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7417: pop
    //   7418: aload #8
    //   7420: invokevirtual getModifiers : ()I
    //   7423: invokestatic isStatic : (I)Z
    //   7426: ifeq -> 7525
    //   7429: aload #8
    //   7431: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7434: arraylength
    //   7435: iconst_2
    //   7436: if_icmpne -> 7525
    //   7439: goto -> 7446
    //   7442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7445: athrow
    //   7446: aload #8
    //   7448: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7451: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7454: if_acmpne -> 7525
    //   7457: goto -> 7464
    //   7460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7463: athrow
    //   7464: aload #8
    //   7466: iconst_1
    //   7467: invokevirtual setAccessible : (Z)V
    //   7470: aload #8
    //   7472: aconst_null
    //   7473: iconst_2
    //   7474: anewarray java/lang/Object
    //   7477: dup
    //   7478: iconst_0
    //   7479: aload_0
    //   7480: aastore
    //   7481: dup
    //   7482: iconst_1
    //   7483: aload_1
    //   7484: ifnonnull -> 7502
    //   7487: goto -> 7494
    //   7490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7493: athrow
    //   7494: aload_1
    //   7495: goto -> 7509
    //   7498: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7501: athrow
    //   7502: aload_1
    //   7503: checkcast [B
    //   7506: invokevirtual clone : ()Ljava/lang/Object;
    //   7509: aastore
    //   7510: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7513: checkcast java/lang/Boolean
    //   7516: invokevirtual booleanValue : ()Z
    //   7519: istore #4
    //   7521: iload_2
    //   7522: ifne -> 7539
    //   7525: iinc #7, 1
    //   7528: iload_2
    //   7529: ifne -> 7398
    //   7532: goto -> 7539
    //   7535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7538: athrow
    //   7539: iload_2
    //   7540: ifne -> 7882
    //   7543: sipush #-3669
    //   7546: sipush #22877
    //   7549: invokestatic a : (II)Ljava/lang/String;
    //   7552: iconst_1
    //   7553: ldc burp/Zmec
    //   7555: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7558: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7561: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7564: astore #5
    //   7566: aload #5
    //   7568: arraylength
    //   7569: istore #6
    //   7571: iconst_0
    //   7572: istore #7
    //   7574: iload #7
    //   7576: iload #6
    //   7578: if_icmpge -> 7716
    //   7581: aload #5
    //   7583: iload #7
    //   7585: aaload
    //   7586: astore #8
    //   7588: aload #8
    //   7590: invokevirtual getModifiers : ()I
    //   7593: invokestatic isStatic : (I)Z
    //   7596: ifne -> 7606
    //   7599: goto -> 7709
    //   7602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7605: athrow
    //   7606: aload #8
    //   7608: invokevirtual getType : ()Ljava/lang/Class;
    //   7611: astore #9
    //   7613: aload #9
    //   7615: ifnull -> 7696
    //   7618: aload #9
    //   7620: invokevirtual isPrimitive : ()Z
    //   7623: ifne -> 7696
    //   7626: goto -> 7633
    //   7629: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7632: athrow
    //   7633: aload #9
    //   7635: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7638: ifnull -> 7696
    //   7641: goto -> 7648
    //   7644: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7647: athrow
    //   7648: aload #9
    //   7650: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7653: invokevirtual getName : ()Ljava/lang/String;
    //   7656: ifnull -> 7696
    //   7659: goto -> 7666
    //   7662: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7665: athrow
    //   7666: aload #9
    //   7668: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7671: invokevirtual getName : ()Ljava/lang/String;
    //   7674: sipush #-3662
    //   7677: sipush #20655
    //   7680: invokestatic a : (II)Ljava/lang/String;
    //   7683: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7686: ifne -> 7696
    //   7689: goto -> 7696
    //   7692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7695: athrow
    //   7696: aload #8
    //   7698: iconst_1
    //   7699: invokevirtual setAccessible : (Z)V
    //   7702: aload #8
    //   7704: aconst_null
    //   7705: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7708: pop
    //   7709: iinc #7, 1
    //   7712: iload_2
    //   7713: ifne -> 7574
    //   7716: sipush #-3674
    //   7719: sipush #10267
    //   7722: invokestatic a : (II)Ljava/lang/String;
    //   7725: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7728: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7731: astore #5
    //   7733: aload #5
    //   7735: arraylength
    //   7736: istore #6
    //   7738: iconst_0
    //   7739: istore #7
    //   7741: iload #7
    //   7743: iload #6
    //   7745: if_icmpge -> 7882
    //   7748: aload #5
    //   7750: iload #7
    //   7752: aaload
    //   7753: astore #8
    //   7755: aload #8
    //   7757: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7760: pop
    //   7761: aload #8
    //   7763: invokevirtual getModifiers : ()I
    //   7766: invokestatic isStatic : (I)Z
    //   7769: ifeq -> 7868
    //   7772: aload #8
    //   7774: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7777: arraylength
    //   7778: iconst_2
    //   7779: if_icmpne -> 7868
    //   7782: goto -> 7789
    //   7785: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7788: athrow
    //   7789: aload #8
    //   7791: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7794: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7797: if_acmpne -> 7868
    //   7800: goto -> 7807
    //   7803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7806: athrow
    //   7807: aload #8
    //   7809: iconst_1
    //   7810: invokevirtual setAccessible : (Z)V
    //   7813: aload #8
    //   7815: aconst_null
    //   7816: iconst_2
    //   7817: anewarray java/lang/Object
    //   7820: dup
    //   7821: iconst_0
    //   7822: aload_0
    //   7823: aastore
    //   7824: dup
    //   7825: iconst_1
    //   7826: aload_1
    //   7827: ifnonnull -> 7845
    //   7830: goto -> 7837
    //   7833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7836: athrow
    //   7837: aload_1
    //   7838: goto -> 7852
    //   7841: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7844: athrow
    //   7845: aload_1
    //   7846: checkcast [B
    //   7849: invokevirtual clone : ()Ljava/lang/Object;
    //   7852: aastore
    //   7853: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7856: checkcast java/lang/Boolean
    //   7859: invokevirtual booleanValue : ()Z
    //   7862: istore #4
    //   7864: iload_2
    //   7865: ifne -> 7882
    //   7868: iinc #7, 1
    //   7871: iload_2
    //   7872: ifne -> 7741
    //   7875: goto -> 7882
    //   7878: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7881: athrow
    //   7882: iload #4
    //   7884: ireturn
    //   7885: astore_3
    //   7886: new java/lang/Exception
    //   7889: dup
    //   7890: aload_3
    //   7891: invokevirtual getMessage : ()Ljava/lang/String;
    //   7894: invokespecial <init> : (Ljava/lang/String;)V
    //   7897: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4949	7885	java/lang/Throwable
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
    //   3923	3937	3937	java/lang/Throwable
    //   3948	3961	3964	java/lang/Throwable
    //   3953	3976	3979	java/lang/Throwable
    //   3968	3994	3997	java/lang/Throwable
    //   3983	4024	4027	java/lang/Throwable
    //   4090	4117	4120	java/lang/Throwable
    //   4107	4138	4141	java/lang/Throwable
    //   4124	4168	4171	java/lang/Throwable
    //   4145	4179	4179	java/lang/Throwable
    //   4190	4206	4209	java/lang/Throwable
    //   4306	4320	4320	java/lang/Throwable
    //   4331	4344	4347	java/lang/Throwable
    //   4336	4359	4362	java/lang/Throwable
    //   4351	4377	4380	java/lang/Throwable
    //   4366	4407	4410	java/lang/Throwable
    //   4473	4500	4503	java/lang/Throwable
    //   4490	4518	4521	java/lang/Throwable
    //   4507	4548	4551	java/lang/Throwable
    //   4525	4559	4559	java/lang/Throwable
    //   4582	4593	4596	java/lang/Throwable
    //   4648	4662	4662	java/lang/Throwable
    //   4673	4686	4689	java/lang/Throwable
    //   4678	4701	4704	java/lang/Throwable
    //   4693	4719	4722	java/lang/Throwable
    //   4708	4749	4752	java/lang/Throwable
    //   4815	4842	4845	java/lang/Throwable
    //   4832	4860	4863	java/lang/Throwable
    //   4849	4890	4893	java/lang/Throwable
    //   4867	4901	4901	java/lang/Throwable
    //   4924	4935	4938	java/lang/Throwable
    //   4950	5684	7885	java/lang/Throwable
    //   5040	5054	5054	java/lang/Throwable
    //   5065	5078	5081	java/lang/Throwable
    //   5070	5093	5096	java/lang/Throwable
    //   5085	5111	5114	java/lang/Throwable
    //   5100	5141	5144	java/lang/Throwable
    //   5207	5234	5237	java/lang/Throwable
    //   5224	5252	5255	java/lang/Throwable
    //   5241	5282	5285	java/lang/Throwable
    //   5259	5293	5293	java/lang/Throwable
    //   5316	5327	5330	java/lang/Throwable
    //   5383	5397	5397	java/lang/Throwable
    //   5408	5421	5424	java/lang/Throwable
    //   5413	5436	5439	java/lang/Throwable
    //   5428	5454	5457	java/lang/Throwable
    //   5443	5484	5487	java/lang/Throwable
    //   5550	5577	5580	java/lang/Throwable
    //   5567	5595	5598	java/lang/Throwable
    //   5584	5625	5628	java/lang/Throwable
    //   5602	5636	5636	java/lang/Throwable
    //   5659	5670	5673	java/lang/Throwable
    //   5685	6419	7885	java/lang/Throwable
    //   5775	5789	5789	java/lang/Throwable
    //   5800	5813	5816	java/lang/Throwable
    //   5805	5828	5831	java/lang/Throwable
    //   5820	5846	5849	java/lang/Throwable
    //   5835	5876	5879	java/lang/Throwable
    //   5942	5969	5972	java/lang/Throwable
    //   5959	5987	5990	java/lang/Throwable
    //   5976	6017	6020	java/lang/Throwable
    //   5994	6028	6028	java/lang/Throwable
    //   6051	6062	6065	java/lang/Throwable
    //   6118	6132	6132	java/lang/Throwable
    //   6143	6156	6159	java/lang/Throwable
    //   6148	6171	6174	java/lang/Throwable
    //   6163	6189	6192	java/lang/Throwable
    //   6178	6219	6222	java/lang/Throwable
    //   6285	6312	6315	java/lang/Throwable
    //   6302	6330	6333	java/lang/Throwable
    //   6319	6360	6363	java/lang/Throwable
    //   6337	6371	6371	java/lang/Throwable
    //   6394	6405	6408	java/lang/Throwable
    //   6420	7154	7885	java/lang/Throwable
    //   6510	6524	6524	java/lang/Throwable
    //   6535	6548	6551	java/lang/Throwable
    //   6540	6563	6566	java/lang/Throwable
    //   6555	6581	6584	java/lang/Throwable
    //   6570	6611	6614	java/lang/Throwable
    //   6677	6704	6707	java/lang/Throwable
    //   6694	6722	6725	java/lang/Throwable
    //   6711	6752	6755	java/lang/Throwable
    //   6729	6763	6763	java/lang/Throwable
    //   6786	6797	6800	java/lang/Throwable
    //   6853	6867	6867	java/lang/Throwable
    //   6878	6891	6894	java/lang/Throwable
    //   6883	6906	6909	java/lang/Throwable
    //   6898	6924	6927	java/lang/Throwable
    //   6913	6954	6957	java/lang/Throwable
    //   7020	7047	7050	java/lang/Throwable
    //   7037	7065	7068	java/lang/Throwable
    //   7054	7095	7098	java/lang/Throwable
    //   7072	7106	7106	java/lang/Throwable
    //   7129	7140	7143	java/lang/Throwable
    //   7155	7884	7885	java/lang/Throwable
    //   7245	7259	7259	java/lang/Throwable
    //   7270	7283	7286	java/lang/Throwable
    //   7275	7298	7301	java/lang/Throwable
    //   7290	7316	7319	java/lang/Throwable
    //   7305	7346	7349	java/lang/Throwable
    //   7412	7439	7442	java/lang/Throwable
    //   7429	7457	7460	java/lang/Throwable
    //   7446	7487	7490	java/lang/Throwable
    //   7464	7498	7498	java/lang/Throwable
    //   7521	7532	7535	java/lang/Throwable
    //   7588	7602	7602	java/lang/Throwable
    //   7613	7626	7629	java/lang/Throwable
    //   7618	7641	7644	java/lang/Throwable
    //   7633	7659	7662	java/lang/Throwable
    //   7648	7689	7692	java/lang/Throwable
    //   7755	7782	7785	java/lang/Throwable
    //   7772	7800	7803	java/lang/Throwable
    //   7789	7830	7833	java/lang/Throwable
    //   7807	7841	7841	java/lang/Throwable
    //   7864	7875	7878	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #33
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Wk%¥væÅ÷OMåþÝÚò$ïëPKd£\\t,ÝHQ0Em\\ttCÏ)+\\tEá\\t¹¶äNúût\\t¥ç5[n¹û_ñ\\t>F´ D8è\\r\\t*úÄøPÍ$\\tqæpäe捵瞮漈゠枡﹝ꭅ쫗즰墳䟮귿ꈣ鱜爭랛鍗㛔㑘焑ㅲЪ⏠᠚ւݜ肨닒াⱭ᯵娝勵홹⤍⾴匙Ð⁽뇂櫚빝䩿墌큺ꨕ䏃㍾䕩ɟ倡齬兵䁬鈹㠊뱥?ႌ쵎ጝ忟䐟쓏纔撾ᦨ恽俘⋮逢䛣뢀?஀㩠䧺⒤숃곲醁㝭贛亍沉旛긦뫀╜ᲀ둵璣䭍说瀢땪䡭懷圪虚ᷪ飒榃軱魖蜧컽⢦谲褠뼹䈚䅲ⶖ냹믹\\tX¡ 6+\\tSH¢Ûs\\tøq¸æÅå××9£oñl 4¼ÇMc/Ô¶©[y¸êi ¼|Ó^¾V§LTÂR+½85^¦0n,T\ÝÏOgÈÕDøº\\fS[e¶=Ý{F÷¼eMWÔâ"¥« 5Î¼¯U'1\\reWa=î×\\r\\tíè<ºOØt \\t¢;ê?}«%ÌÚ`¦`«*ÔÔWyþìc\\t3å®ní¦¶\\t´ñ*ák¾\\tAÄ©?ý5È«掂瞍潬み札ﺦꯔ쪨즂朗䞨괂ꋫ鳣爴띬鍴㘪㒇燪㇣ѕ⏒ᣵׄޡ聠닋ॉⱎᬋ婹刪훵⧶⼥卦âₒ놄樧뺕䫀墕킍ꨶ䌽㌚䖶˓僚鿽儊䁞鋖㡌벘?ဳ춹ጾ弡䑻쐐縘摅᤹怂俪∁遤䘞롈?ங㩃䤄Ⓚ시걾酺㝟跴介汴敤긿먷╿᱾됑琯䮶譥灝땘䢂愊埢蛥ᷳ飱楽躕鮉螫츆⠷豍褒뿖䉜䆏ⵞ끆믠\\tX§S¸|x\\tSg¢>lª\\tþ^74N±\\t\\t÷ YÜù¢Q/\\t7#A¬ú­bê\\t¼§S\\n¸~)#\\t~âNû­GMt7?-¶Úëz³ÀZÐ¦Ñê(ú¶êÏ¶Ä8bÞ#õüÌèÆØ7\\bSËÍrÑºsk»2¼¶IYWü¼Lb=xÐ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #76
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
    //   68: ldc 'þÈ£\\n}£F\\tÀ+dv9@7'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #57
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
    //   129: putstatic burp/Ztkh.a : [Ljava/lang/String;
    //   132: bipush #33
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztkh.b : [Ljava/lang/String;
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
    //   212: bipush #67
    //   214: goto -> 244
    //   217: bipush #29
    //   219: goto -> 244
    //   222: bipush #112
    //   224: goto -> 244
    //   227: bipush #106
    //   229: goto -> 244
    //   232: bipush #17
    //   234: goto -> 244
    //   237: bipush #126
    //   239: goto -> 244
    //   242: bipush #88
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
    //   304: sipush #-3679
    //   307: sipush #-23139
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Ztkh.Zh : Ljava/lang/Object;
    //   319: sipush #-3667
    //   322: sipush #-19778
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Ztkh.ZP : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF1BF) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztkh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */