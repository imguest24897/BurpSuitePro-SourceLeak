package burp;

import java.math.BigInteger;

class Zcc extends ClassLoader {
  static String Zb;
  
  static Object Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZO(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zv(Object paramObject) {
    Zrcu.Zb = a(14485, -22941);
    Zrcu.Zs = new BigInteger(a(14493, 31849));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zs9x.ZY.charAt(Math.abs(((BigInteger)Zm1l.Za).intValue() % 32)) <= Zsmn.Zo.charAt(Math.abs(((BigInteger)Zmpc.Zc).intValue() % 32))) {
          try {
            Zb9m.Zc(Class.forName(a(14482, -27369)));
            if (!bool)
              Zl_9.Zi(Class.forName(a(14495, 16860))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zl_9.Zi(Class.forName(a(14495, 16860)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Ze(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: sipush #14487
    //   7: sipush #14017
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic ZX : (Ljava/lang/Object;)V
    //   19: new java/io/ByteArrayOutputStream
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore_3
    //   27: getstatic burp/Zmsl.ZP : Ljava/lang/String;
    //   30: astore #4
    //   32: iconst_0
    //   33: istore #5
    //   35: iload #5
    //   37: aload #4
    //   39: invokevirtual length : ()I
    //   42: if_icmpge -> 72
    //   45: aload_3
    //   46: aload #4
    //   48: iload #5
    //   50: iload #5
    //   52: iconst_2
    //   53: iadd
    //   54: invokevirtual substring : (II)Ljava/lang/String;
    //   57: bipush #16
    //   59: invokestatic parseInt : (Ljava/lang/String;I)I
    //   62: invokevirtual write : (I)V
    //   65: iinc #5, 2
    //   68: iload_2
    //   69: ifne -> 35
    //   72: aload_3
    //   73: invokevirtual toByteArray : ()[B
    //   76: astore #5
    //   78: getstatic burp/Zd0.ZT : Ljava/lang/Object;
    //   81: checkcast java/math/BigInteger
    //   84: invokevirtual toByteArray : ()[B
    //   87: astore #6
    //   89: sipush #256
    //   92: newarray byte
    //   94: astore #8
    //   96: sipush #256
    //   99: newarray int
    //   101: astore #9
    //   103: sipush #256
    //   106: newarray int
    //   108: astore #10
    //   110: sipush #256
    //   113: newarray int
    //   115: astore #11
    //   117: sipush #256
    //   120: newarray int
    //   122: astore #12
    //   124: bipush #10
    //   126: newarray int
    //   128: astore #13
    //   130: sipush #283
    //   133: istore #14
    //   135: iconst_0
    //   136: istore #16
    //   138: iload #16
    //   140: sipush #256
    //   143: if_icmpge -> 377
    //   146: sipush #14478
    //   149: sipush #11513
    //   152: invokestatic a : (II)Ljava/lang/String;
    //   155: iload #16
    //   157: iconst_1
    //   158: iushr
    //   159: invokevirtual charAt : (I)C
    //   162: istore #25
    //   164: iload #16
    //   166: iconst_1
    //   167: iand
    //   168: ifne -> 183
    //   171: iload #25
    //   173: bipush #8
    //   175: iushr
    //   176: goto -> 185
    //   179: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   182: athrow
    //   183: iload #25
    //   185: i2b
    //   186: sipush #255
    //   189: iand
    //   190: istore #15
    //   192: iload #16
    //   194: iconst_1
    //   195: ishl
    //   196: istore #17
    //   198: iload #17
    //   200: sipush #256
    //   203: if_icmplt -> 213
    //   206: iload #17
    //   208: iload #14
    //   210: ixor
    //   211: istore #17
    //   213: iload #17
    //   215: iconst_1
    //   216: ishl
    //   217: istore #18
    //   219: iload #18
    //   221: sipush #256
    //   224: if_icmplt -> 234
    //   227: iload #18
    //   229: iload #14
    //   231: ixor
    //   232: istore #18
    //   234: iload #18
    //   236: iconst_1
    //   237: ishl
    //   238: istore #19
    //   240: iload #19
    //   242: sipush #256
    //   245: if_icmplt -> 255
    //   248: iload #19
    //   250: iload #14
    //   252: ixor
    //   253: istore #19
    //   255: iload #19
    //   257: iload #16
    //   259: ixor
    //   260: istore #20
    //   262: iload #20
    //   264: iload #17
    //   266: ixor
    //   267: istore #21
    //   269: iload #20
    //   271: iload #18
    //   273: ixor
    //   274: istore #22
    //   276: iload #19
    //   278: iload #18
    //   280: ixor
    //   281: iload #17
    //   283: ixor
    //   284: istore #23
    //   286: aload #8
    //   288: iload #16
    //   290: iload #15
    //   292: i2b
    //   293: bastore
    //   294: aload #9
    //   296: iload #15
    //   298: iload #23
    //   300: bipush #24
    //   302: ishl
    //   303: iload #20
    //   305: bipush #16
    //   307: ishl
    //   308: ior
    //   309: iload #22
    //   311: bipush #8
    //   313: ishl
    //   314: ior
    //   315: iload #21
    //   317: ior
    //   318: dup
    //   319: istore #24
    //   321: iastore
    //   322: aload #10
    //   324: iload #15
    //   326: iload #24
    //   328: bipush #8
    //   330: iushr
    //   331: iload #24
    //   333: bipush #24
    //   335: ishl
    //   336: ior
    //   337: iastore
    //   338: aload #11
    //   340: iload #15
    //   342: iload #24
    //   344: bipush #16
    //   346: iushr
    //   347: iload #24
    //   349: bipush #16
    //   351: ishl
    //   352: ior
    //   353: iastore
    //   354: aload #12
    //   356: iload #15
    //   358: iload #24
    //   360: bipush #24
    //   362: iushr
    //   363: iload #24
    //   365: bipush #8
    //   367: ishl
    //   368: ior
    //   369: iastore
    //   370: iinc #16, 1
    //   373: iload_2
    //   374: ifne -> 138
    //   377: iconst_1
    //   378: istore #25
    //   380: aload #13
    //   382: iconst_0
    //   383: iload #25
    //   385: bipush #24
    //   387: ishl
    //   388: iastore
    //   389: iconst_1
    //   390: istore #26
    //   392: iload #26
    //   394: bipush #10
    //   396: if_icmpge -> 437
    //   399: iload #25
    //   401: iconst_1
    //   402: ishl
    //   403: istore #25
    //   405: iload #25
    //   407: sipush #256
    //   410: if_icmplt -> 420
    //   413: iload #25
    //   415: iload #14
    //   417: ixor
    //   418: istore #25
    //   420: aload #13
    //   422: iload #26
    //   424: iload #25
    //   426: bipush #24
    //   428: ishl
    //   429: iastore
    //   430: iinc #26, 1
    //   433: iload_2
    //   434: ifne -> 392
    //   437: iconst_4
    //   438: istore #26
    //   440: iload #26
    //   442: bipush #6
    //   444: iadd
    //   445: istore #27
    //   447: iconst_4
    //   448: iload #27
    //   450: iconst_1
    //   451: iadd
    //   452: imul
    //   453: istore #28
    //   455: iload #28
    //   457: newarray int
    //   459: astore #29
    //   461: iload #28
    //   463: newarray int
    //   465: astore #30
    //   467: iconst_0
    //   468: istore #25
    //   470: iconst_0
    //   471: istore #32
    //   473: iconst_0
    //   474: istore #33
    //   476: iload #32
    //   478: iload #26
    //   480: if_icmpge -> 548
    //   483: aload #29
    //   485: iload #32
    //   487: aload #5
    //   489: iload #33
    //   491: baload
    //   492: bipush #24
    //   494: ishl
    //   495: aload #5
    //   497: iload #33
    //   499: iconst_1
    //   500: iadd
    //   501: baload
    //   502: sipush #255
    //   505: iand
    //   506: bipush #16
    //   508: ishl
    //   509: ior
    //   510: aload #5
    //   512: iload #33
    //   514: iconst_2
    //   515: iadd
    //   516: baload
    //   517: sipush #255
    //   520: iand
    //   521: bipush #8
    //   523: ishl
    //   524: ior
    //   525: aload #5
    //   527: iload #33
    //   529: iconst_3
    //   530: iadd
    //   531: baload
    //   532: sipush #255
    //   535: iand
    //   536: ior
    //   537: iastore
    //   538: iinc #32, 1
    //   541: iinc #33, 4
    //   544: iload_2
    //   545: ifne -> 476
    //   548: iload #26
    //   550: istore #32
    //   552: iconst_0
    //   553: istore #33
    //   555: iload #32
    //   557: iload #28
    //   559: if_icmpge -> 686
    //   562: aload #29
    //   564: iload #32
    //   566: iconst_1
    //   567: isub
    //   568: iaload
    //   569: istore #31
    //   571: iload #33
    //   573: ifne -> 660
    //   576: iload #26
    //   578: istore #33
    //   580: aload #8
    //   582: iload #31
    //   584: bipush #16
    //   586: iushr
    //   587: sipush #255
    //   590: iand
    //   591: baload
    //   592: bipush #24
    //   594: ishl
    //   595: aload #8
    //   597: iload #31
    //   599: bipush #8
    //   601: iushr
    //   602: sipush #255
    //   605: iand
    //   606: baload
    //   607: sipush #255
    //   610: iand
    //   611: bipush #16
    //   613: ishl
    //   614: ior
    //   615: aload #8
    //   617: iload #31
    //   619: sipush #255
    //   622: iand
    //   623: baload
    //   624: sipush #255
    //   627: iand
    //   628: bipush #8
    //   630: ishl
    //   631: ior
    //   632: aload #8
    //   634: iload #31
    //   636: bipush #24
    //   638: iushr
    //   639: baload
    //   640: sipush #255
    //   643: iand
    //   644: ior
    //   645: istore #31
    //   647: iload #31
    //   649: aload #13
    //   651: iload #25
    //   653: iinc #25, 1
    //   656: iaload
    //   657: ixor
    //   658: istore #31
    //   660: aload #29
    //   662: iload #32
    //   664: aload #29
    //   666: iload #32
    //   668: iload #26
    //   670: isub
    //   671: iaload
    //   672: iload #31
    //   674: ixor
    //   675: iastore
    //   676: iinc #32, 1
    //   679: iinc #33, -1
    //   682: iload_2
    //   683: ifne -> 555
    //   686: iconst_0
    //   687: istore #32
    //   689: iconst_4
    //   690: iload #27
    //   692: imul
    //   693: istore #33
    //   695: aload #30
    //   697: iload #32
    //   699: aload #29
    //   701: iload #33
    //   703: iaload
    //   704: iastore
    //   705: aload #30
    //   707: iload #32
    //   709: iconst_1
    //   710: iadd
    //   711: aload #29
    //   713: iload #33
    //   715: iconst_1
    //   716: iadd
    //   717: iaload
    //   718: iastore
    //   719: aload #30
    //   721: iload #32
    //   723: iconst_2
    //   724: iadd
    //   725: aload #29
    //   727: iload #33
    //   729: iconst_2
    //   730: iadd
    //   731: iaload
    //   732: iastore
    //   733: aload #30
    //   735: iload #32
    //   737: iconst_3
    //   738: iadd
    //   739: aload #29
    //   741: iload #33
    //   743: iconst_3
    //   744: iadd
    //   745: iaload
    //   746: iastore
    //   747: iinc #32, 4
    //   750: iinc #33, -4
    //   753: iconst_1
    //   754: istore #35
    //   756: iload #35
    //   758: iload #27
    //   760: if_icmpge -> 1124
    //   763: aload #29
    //   765: iload #33
    //   767: iaload
    //   768: istore #34
    //   770: aload #30
    //   772: iload #32
    //   774: aload #9
    //   776: aload #8
    //   778: iload #34
    //   780: bipush #24
    //   782: iushr
    //   783: baload
    //   784: sipush #255
    //   787: iand
    //   788: iaload
    //   789: aload #10
    //   791: aload #8
    //   793: iload #34
    //   795: bipush #16
    //   797: iushr
    //   798: sipush #255
    //   801: iand
    //   802: baload
    //   803: sipush #255
    //   806: iand
    //   807: iaload
    //   808: ixor
    //   809: aload #11
    //   811: aload #8
    //   813: iload #34
    //   815: bipush #8
    //   817: iushr
    //   818: sipush #255
    //   821: iand
    //   822: baload
    //   823: sipush #255
    //   826: iand
    //   827: iaload
    //   828: ixor
    //   829: aload #12
    //   831: aload #8
    //   833: iload #34
    //   835: sipush #255
    //   838: iand
    //   839: baload
    //   840: sipush #255
    //   843: iand
    //   844: iaload
    //   845: ixor
    //   846: iastore
    //   847: aload #29
    //   849: iload #33
    //   851: iconst_1
    //   852: iadd
    //   853: iaload
    //   854: istore #34
    //   856: aload #30
    //   858: iload #32
    //   860: iconst_1
    //   861: iadd
    //   862: aload #9
    //   864: aload #8
    //   866: iload #34
    //   868: bipush #24
    //   870: iushr
    //   871: baload
    //   872: sipush #255
    //   875: iand
    //   876: iaload
    //   877: aload #10
    //   879: aload #8
    //   881: iload #34
    //   883: bipush #16
    //   885: iushr
    //   886: sipush #255
    //   889: iand
    //   890: baload
    //   891: sipush #255
    //   894: iand
    //   895: iaload
    //   896: ixor
    //   897: aload #11
    //   899: aload #8
    //   901: iload #34
    //   903: bipush #8
    //   905: iushr
    //   906: sipush #255
    //   909: iand
    //   910: baload
    //   911: sipush #255
    //   914: iand
    //   915: iaload
    //   916: ixor
    //   917: aload #12
    //   919: aload #8
    //   921: iload #34
    //   923: sipush #255
    //   926: iand
    //   927: baload
    //   928: sipush #255
    //   931: iand
    //   932: iaload
    //   933: ixor
    //   934: iastore
    //   935: aload #29
    //   937: iload #33
    //   939: iconst_2
    //   940: iadd
    //   941: iaload
    //   942: istore #34
    //   944: aload #30
    //   946: iload #32
    //   948: iconst_2
    //   949: iadd
    //   950: aload #9
    //   952: aload #8
    //   954: iload #34
    //   956: bipush #24
    //   958: iushr
    //   959: baload
    //   960: sipush #255
    //   963: iand
    //   964: iaload
    //   965: aload #10
    //   967: aload #8
    //   969: iload #34
    //   971: bipush #16
    //   973: iushr
    //   974: sipush #255
    //   977: iand
    //   978: baload
    //   979: sipush #255
    //   982: iand
    //   983: iaload
    //   984: ixor
    //   985: aload #11
    //   987: aload #8
    //   989: iload #34
    //   991: bipush #8
    //   993: iushr
    //   994: sipush #255
    //   997: iand
    //   998: baload
    //   999: sipush #255
    //   1002: iand
    //   1003: iaload
    //   1004: ixor
    //   1005: aload #12
    //   1007: aload #8
    //   1009: iload #34
    //   1011: sipush #255
    //   1014: iand
    //   1015: baload
    //   1016: sipush #255
    //   1019: iand
    //   1020: iaload
    //   1021: ixor
    //   1022: iastore
    //   1023: aload #29
    //   1025: iload #33
    //   1027: iconst_3
    //   1028: iadd
    //   1029: iaload
    //   1030: istore #34
    //   1032: aload #30
    //   1034: iload #32
    //   1036: iconst_3
    //   1037: iadd
    //   1038: aload #9
    //   1040: aload #8
    //   1042: iload #34
    //   1044: bipush #24
    //   1046: iushr
    //   1047: baload
    //   1048: sipush #255
    //   1051: iand
    //   1052: iaload
    //   1053: aload #10
    //   1055: aload #8
    //   1057: iload #34
    //   1059: bipush #16
    //   1061: iushr
    //   1062: sipush #255
    //   1065: iand
    //   1066: baload
    //   1067: sipush #255
    //   1070: iand
    //   1071: iaload
    //   1072: ixor
    //   1073: aload #11
    //   1075: aload #8
    //   1077: iload #34
    //   1079: bipush #8
    //   1081: iushr
    //   1082: sipush #255
    //   1085: iand
    //   1086: baload
    //   1087: sipush #255
    //   1090: iand
    //   1091: iaload
    //   1092: ixor
    //   1093: aload #12
    //   1095: aload #8
    //   1097: iload #34
    //   1099: sipush #255
    //   1102: iand
    //   1103: baload
    //   1104: sipush #255
    //   1107: iand
    //   1108: iaload
    //   1109: ixor
    //   1110: iastore
    //   1111: iinc #32, 4
    //   1114: iinc #33, -4
    //   1117: iinc #35, 1
    //   1120: iload_2
    //   1121: ifne -> 756
    //   1124: aload #30
    //   1126: iload #32
    //   1128: aload #29
    //   1130: iload #33
    //   1132: iaload
    //   1133: iastore
    //   1134: aload #30
    //   1136: iload #32
    //   1138: iconst_1
    //   1139: iadd
    //   1140: aload #29
    //   1142: iload #33
    //   1144: iconst_1
    //   1145: iadd
    //   1146: iaload
    //   1147: iastore
    //   1148: aload #30
    //   1150: iload #32
    //   1152: iconst_2
    //   1153: iadd
    //   1154: aload #29
    //   1156: iload #33
    //   1158: iconst_2
    //   1159: iadd
    //   1160: iaload
    //   1161: iastore
    //   1162: aload #30
    //   1164: iload #32
    //   1166: iconst_3
    //   1167: iadd
    //   1168: aload #29
    //   1170: iload #33
    //   1172: iconst_3
    //   1173: iadd
    //   1174: iaload
    //   1175: iastore
    //   1176: iconst_0
    //   1177: newarray byte
    //   1179: astore #35
    //   1181: aload #6
    //   1183: arraylength
    //   1184: bipush #16
    //   1186: irem
    //   1187: ifeq -> 1211
    //   1190: new java/lang/Exception
    //   1193: dup
    //   1194: sipush #14492
    //   1197: sipush #-23233
    //   1200: invokestatic a : (II)Ljava/lang/String;
    //   1203: invokespecial <init> : (Ljava/lang/String;)V
    //   1206: athrow
    //   1207: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1210: athrow
    //   1211: bipush #10
    //   1213: istore #36
    //   1215: sipush #14477
    //   1218: sipush #256
    //   1221: newarray byte
    //   1223: astore #37
    //   1225: sipush #2402
    //   1228: sipush #256
    //   1231: newarray int
    //   1233: astore #38
    //   1235: sipush #256
    //   1238: newarray int
    //   1240: astore #39
    //   1242: sipush #256
    //   1245: newarray int
    //   1247: astore #40
    //   1249: sipush #256
    //   1252: newarray int
    //   1254: astore #41
    //   1256: sipush #283
    //   1259: istore #14
    //   1261: invokestatic a : (II)Ljava/lang/String;
    //   1264: astore #42
    //   1266: iconst_0
    //   1267: istore #16
    //   1269: iload #16
    //   1271: sipush #256
    //   1274: if_icmpge -> 1501
    //   1277: aload #42
    //   1279: iload #16
    //   1281: iconst_1
    //   1282: iushr
    //   1283: invokevirtual charAt : (I)C
    //   1286: istore #43
    //   1288: iload #16
    //   1290: iconst_1
    //   1291: iand
    //   1292: ifne -> 1307
    //   1295: iload #43
    //   1297: bipush #8
    //   1299: iushr
    //   1300: goto -> 1309
    //   1303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1306: athrow
    //   1307: iload #43
    //   1309: i2b
    //   1310: sipush #255
    //   1313: iand
    //   1314: istore #15
    //   1316: iload #16
    //   1318: iconst_1
    //   1319: ishl
    //   1320: istore #17
    //   1322: iload #17
    //   1324: sipush #256
    //   1327: if_icmplt -> 1337
    //   1330: iload #17
    //   1332: iload #14
    //   1334: ixor
    //   1335: istore #17
    //   1337: iload #17
    //   1339: iconst_1
    //   1340: ishl
    //   1341: istore #18
    //   1343: iload #18
    //   1345: sipush #256
    //   1348: if_icmplt -> 1358
    //   1351: iload #18
    //   1353: iload #14
    //   1355: ixor
    //   1356: istore #18
    //   1358: iload #18
    //   1360: iconst_1
    //   1361: ishl
    //   1362: istore #19
    //   1364: iload #19
    //   1366: sipush #256
    //   1369: if_icmplt -> 1379
    //   1372: iload #19
    //   1374: iload #14
    //   1376: ixor
    //   1377: istore #19
    //   1379: iload #19
    //   1381: iload #16
    //   1383: ixor
    //   1384: istore #20
    //   1386: iload #20
    //   1388: iload #17
    //   1390: ixor
    //   1391: istore #21
    //   1393: iload #20
    //   1395: iload #18
    //   1397: ixor
    //   1398: istore #22
    //   1400: iload #19
    //   1402: iload #18
    //   1404: ixor
    //   1405: iload #17
    //   1407: ixor
    //   1408: istore #23
    //   1410: aload #37
    //   1412: iload #15
    //   1414: iload #16
    //   1416: i2b
    //   1417: bastore
    //   1418: aload #38
    //   1420: iload #15
    //   1422: iload #23
    //   1424: bipush #24
    //   1426: ishl
    //   1427: iload #20
    //   1429: bipush #16
    //   1431: ishl
    //   1432: ior
    //   1433: iload #22
    //   1435: bipush #8
    //   1437: ishl
    //   1438: ior
    //   1439: iload #21
    //   1441: ior
    //   1442: dup
    //   1443: istore #24
    //   1445: iastore
    //   1446: aload #39
    //   1448: iload #15
    //   1450: iload #24
    //   1452: bipush #8
    //   1454: iushr
    //   1455: iload #24
    //   1457: bipush #24
    //   1459: ishl
    //   1460: ior
    //   1461: iastore
    //   1462: aload #40
    //   1464: iload #15
    //   1466: iload #24
    //   1468: bipush #16
    //   1470: iushr
    //   1471: iload #24
    //   1473: bipush #16
    //   1475: ishl
    //   1476: ior
    //   1477: iastore
    //   1478: aload #41
    //   1480: iload #15
    //   1482: iload #24
    //   1484: bipush #24
    //   1486: iushr
    //   1487: iload #24
    //   1489: bipush #8
    //   1491: ishl
    //   1492: ior
    //   1493: iastore
    //   1494: iinc #16, 1
    //   1497: iload_2
    //   1498: ifne -> 1269
    //   1501: aload #6
    //   1503: arraylength
    //   1504: newarray byte
    //   1506: astore #43
    //   1508: iconst_0
    //   1509: istore #44
    //   1511: iload #44
    //   1513: aload #6
    //   1515: arraylength
    //   1516: bipush #16
    //   1518: idiv
    //   1519: if_icmpge -> 2433
    //   1522: bipush #16
    //   1524: newarray byte
    //   1526: astore #45
    //   1528: bipush #16
    //   1530: newarray byte
    //   1532: astore #46
    //   1534: iconst_0
    //   1535: istore #47
    //   1537: iload #47
    //   1539: bipush #16
    //   1541: if_icmpge -> 1567
    //   1544: aload #45
    //   1546: iload #47
    //   1548: aload #6
    //   1550: iload #47
    //   1552: iload #44
    //   1554: bipush #16
    //   1556: imul
    //   1557: iadd
    //   1558: baload
    //   1559: bastore
    //   1560: iinc #47, 1
    //   1563: iload_2
    //   1564: ifne -> 1537
    //   1567: iconst_0
    //   1568: istore #47
    //   1570: aload #45
    //   1572: iconst_0
    //   1573: baload
    //   1574: bipush #24
    //   1576: ishl
    //   1577: aload #45
    //   1579: iconst_1
    //   1580: baload
    //   1581: sipush #255
    //   1584: iand
    //   1585: bipush #16
    //   1587: ishl
    //   1588: ior
    //   1589: aload #45
    //   1591: iconst_2
    //   1592: baload
    //   1593: sipush #255
    //   1596: iand
    //   1597: bipush #8
    //   1599: ishl
    //   1600: ior
    //   1601: aload #45
    //   1603: iconst_3
    //   1604: baload
    //   1605: sipush #255
    //   1608: iand
    //   1609: ior
    //   1610: aload #30
    //   1612: iconst_0
    //   1613: iaload
    //   1614: ixor
    //   1615: istore #49
    //   1617: aload #45
    //   1619: iconst_4
    //   1620: baload
    //   1621: bipush #24
    //   1623: ishl
    //   1624: aload #45
    //   1626: iconst_5
    //   1627: baload
    //   1628: sipush #255
    //   1631: iand
    //   1632: bipush #16
    //   1634: ishl
    //   1635: ior
    //   1636: aload #45
    //   1638: bipush #6
    //   1640: baload
    //   1641: sipush #255
    //   1644: iand
    //   1645: bipush #8
    //   1647: ishl
    //   1648: ior
    //   1649: aload #45
    //   1651: bipush #7
    //   1653: baload
    //   1654: sipush #255
    //   1657: iand
    //   1658: ior
    //   1659: aload #30
    //   1661: iconst_1
    //   1662: iaload
    //   1663: ixor
    //   1664: istore #50
    //   1666: aload #45
    //   1668: bipush #8
    //   1670: baload
    //   1671: bipush #24
    //   1673: ishl
    //   1674: aload #45
    //   1676: bipush #9
    //   1678: baload
    //   1679: sipush #255
    //   1682: iand
    //   1683: bipush #16
    //   1685: ishl
    //   1686: ior
    //   1687: aload #45
    //   1689: bipush #10
    //   1691: baload
    //   1692: sipush #255
    //   1695: iand
    //   1696: bipush #8
    //   1698: ishl
    //   1699: ior
    //   1700: aload #45
    //   1702: bipush #11
    //   1704: baload
    //   1705: sipush #255
    //   1708: iand
    //   1709: ior
    //   1710: aload #30
    //   1712: iconst_2
    //   1713: iaload
    //   1714: ixor
    //   1715: istore #51
    //   1717: aload #45
    //   1719: bipush #12
    //   1721: baload
    //   1722: bipush #24
    //   1724: ishl
    //   1725: aload #45
    //   1727: bipush #13
    //   1729: baload
    //   1730: sipush #255
    //   1733: iand
    //   1734: bipush #16
    //   1736: ishl
    //   1737: ior
    //   1738: aload #45
    //   1740: bipush #14
    //   1742: baload
    //   1743: sipush #255
    //   1746: iand
    //   1747: bipush #8
    //   1749: ishl
    //   1750: ior
    //   1751: aload #45
    //   1753: bipush #15
    //   1755: baload
    //   1756: sipush #255
    //   1759: iand
    //   1760: ior
    //   1761: aload #30
    //   1763: iconst_3
    //   1764: iaload
    //   1765: ixor
    //   1766: istore #52
    //   1768: iconst_1
    //   1769: istore #53
    //   1771: iload #53
    //   1773: iload #36
    //   1775: if_icmpge -> 2018
    //   1778: iinc #47, 4
    //   1781: aload #38
    //   1783: iload #49
    //   1785: bipush #24
    //   1787: iushr
    //   1788: iaload
    //   1789: aload #39
    //   1791: iload #52
    //   1793: bipush #16
    //   1795: iushr
    //   1796: sipush #255
    //   1799: iand
    //   1800: iaload
    //   1801: ixor
    //   1802: aload #40
    //   1804: iload #51
    //   1806: bipush #8
    //   1808: iushr
    //   1809: sipush #255
    //   1812: iand
    //   1813: iaload
    //   1814: ixor
    //   1815: aload #41
    //   1817: iload #50
    //   1819: sipush #255
    //   1822: iand
    //   1823: iaload
    //   1824: ixor
    //   1825: aload #30
    //   1827: iload #47
    //   1829: iaload
    //   1830: ixor
    //   1831: istore #54
    //   1833: aload #38
    //   1835: iload #50
    //   1837: bipush #24
    //   1839: iushr
    //   1840: iaload
    //   1841: aload #39
    //   1843: iload #49
    //   1845: bipush #16
    //   1847: iushr
    //   1848: sipush #255
    //   1851: iand
    //   1852: iaload
    //   1853: ixor
    //   1854: aload #40
    //   1856: iload #52
    //   1858: bipush #8
    //   1860: iushr
    //   1861: sipush #255
    //   1864: iand
    //   1865: iaload
    //   1866: ixor
    //   1867: aload #41
    //   1869: iload #51
    //   1871: sipush #255
    //   1874: iand
    //   1875: iaload
    //   1876: ixor
    //   1877: aload #30
    //   1879: iload #47
    //   1881: iconst_1
    //   1882: iadd
    //   1883: iaload
    //   1884: ixor
    //   1885: istore #55
    //   1887: aload #38
    //   1889: iload #51
    //   1891: bipush #24
    //   1893: iushr
    //   1894: iaload
    //   1895: aload #39
    //   1897: iload #50
    //   1899: bipush #16
    //   1901: iushr
    //   1902: sipush #255
    //   1905: iand
    //   1906: iaload
    //   1907: ixor
    //   1908: aload #40
    //   1910: iload #49
    //   1912: bipush #8
    //   1914: iushr
    //   1915: sipush #255
    //   1918: iand
    //   1919: iaload
    //   1920: ixor
    //   1921: aload #41
    //   1923: iload #52
    //   1925: sipush #255
    //   1928: iand
    //   1929: iaload
    //   1930: ixor
    //   1931: aload #30
    //   1933: iload #47
    //   1935: iconst_2
    //   1936: iadd
    //   1937: iaload
    //   1938: ixor
    //   1939: istore #56
    //   1941: aload #38
    //   1943: iload #52
    //   1945: bipush #24
    //   1947: iushr
    //   1948: iaload
    //   1949: aload #39
    //   1951: iload #51
    //   1953: bipush #16
    //   1955: iushr
    //   1956: sipush #255
    //   1959: iand
    //   1960: iaload
    //   1961: ixor
    //   1962: aload #40
    //   1964: iload #50
    //   1966: bipush #8
    //   1968: iushr
    //   1969: sipush #255
    //   1972: iand
    //   1973: iaload
    //   1974: ixor
    //   1975: aload #41
    //   1977: iload #49
    //   1979: sipush #255
    //   1982: iand
    //   1983: iaload
    //   1984: ixor
    //   1985: aload #30
    //   1987: iload #47
    //   1989: iconst_3
    //   1990: iadd
    //   1991: iaload
    //   1992: ixor
    //   1993: istore #57
    //   1995: iload #54
    //   1997: istore #49
    //   1999: iload #55
    //   2001: istore #50
    //   2003: iload #56
    //   2005: istore #51
    //   2007: iload #57
    //   2009: istore #52
    //   2011: iinc #53, 1
    //   2014: iload_2
    //   2015: ifne -> 1771
    //   2018: iinc #47, 4
    //   2021: aload #30
    //   2023: iload #47
    //   2025: iaload
    //   2026: istore #48
    //   2028: aload #46
    //   2030: iconst_0
    //   2031: aload #37
    //   2033: iload #49
    //   2035: bipush #24
    //   2037: iushr
    //   2038: baload
    //   2039: iload #48
    //   2041: bipush #24
    //   2043: iushr
    //   2044: ixor
    //   2045: i2b
    //   2046: bastore
    //   2047: aload #46
    //   2049: iconst_1
    //   2050: aload #37
    //   2052: iload #52
    //   2054: bipush #16
    //   2056: iushr
    //   2057: sipush #255
    //   2060: iand
    //   2061: baload
    //   2062: iload #48
    //   2064: bipush #16
    //   2066: iushr
    //   2067: ixor
    //   2068: i2b
    //   2069: bastore
    //   2070: aload #46
    //   2072: iconst_2
    //   2073: aload #37
    //   2075: iload #51
    //   2077: bipush #8
    //   2079: iushr
    //   2080: sipush #255
    //   2083: iand
    //   2084: baload
    //   2085: iload #48
    //   2087: bipush #8
    //   2089: iushr
    //   2090: ixor
    //   2091: i2b
    //   2092: bastore
    //   2093: aload #46
    //   2095: iconst_3
    //   2096: aload #37
    //   2098: iload #50
    //   2100: sipush #255
    //   2103: iand
    //   2104: baload
    //   2105: iload #48
    //   2107: ixor
    //   2108: i2b
    //   2109: bastore
    //   2110: aload #30
    //   2112: iload #47
    //   2114: iconst_1
    //   2115: iadd
    //   2116: iaload
    //   2117: istore #48
    //   2119: aload #46
    //   2121: iconst_4
    //   2122: aload #37
    //   2124: iload #50
    //   2126: bipush #24
    //   2128: iushr
    //   2129: baload
    //   2130: iload #48
    //   2132: bipush #24
    //   2134: iushr
    //   2135: ixor
    //   2136: i2b
    //   2137: bastore
    //   2138: aload #46
    //   2140: iconst_5
    //   2141: aload #37
    //   2143: iload #49
    //   2145: bipush #16
    //   2147: iushr
    //   2148: sipush #255
    //   2151: iand
    //   2152: baload
    //   2153: iload #48
    //   2155: bipush #16
    //   2157: iushr
    //   2158: ixor
    //   2159: i2b
    //   2160: bastore
    //   2161: aload #46
    //   2163: bipush #6
    //   2165: aload #37
    //   2167: iload #52
    //   2169: bipush #8
    //   2171: iushr
    //   2172: sipush #255
    //   2175: iand
    //   2176: baload
    //   2177: iload #48
    //   2179: bipush #8
    //   2181: iushr
    //   2182: ixor
    //   2183: i2b
    //   2184: bastore
    //   2185: aload #46
    //   2187: bipush #7
    //   2189: aload #37
    //   2191: iload #51
    //   2193: sipush #255
    //   2196: iand
    //   2197: baload
    //   2198: iload #48
    //   2200: ixor
    //   2201: i2b
    //   2202: bastore
    //   2203: aload #30
    //   2205: iload #47
    //   2207: iconst_2
    //   2208: iadd
    //   2209: iaload
    //   2210: istore #48
    //   2212: aload #46
    //   2214: bipush #8
    //   2216: aload #37
    //   2218: iload #51
    //   2220: bipush #24
    //   2222: iushr
    //   2223: baload
    //   2224: iload #48
    //   2226: bipush #24
    //   2228: iushr
    //   2229: ixor
    //   2230: i2b
    //   2231: bastore
    //   2232: aload #46
    //   2234: bipush #9
    //   2236: aload #37
    //   2238: iload #50
    //   2240: bipush #16
    //   2242: iushr
    //   2243: sipush #255
    //   2246: iand
    //   2247: baload
    //   2248: iload #48
    //   2250: bipush #16
    //   2252: iushr
    //   2253: ixor
    //   2254: i2b
    //   2255: bastore
    //   2256: aload #46
    //   2258: bipush #10
    //   2260: aload #37
    //   2262: iload #49
    //   2264: bipush #8
    //   2266: iushr
    //   2267: sipush #255
    //   2270: iand
    //   2271: baload
    //   2272: iload #48
    //   2274: bipush #8
    //   2276: iushr
    //   2277: ixor
    //   2278: i2b
    //   2279: bastore
    //   2280: aload #46
    //   2282: bipush #11
    //   2284: aload #37
    //   2286: iload #52
    //   2288: sipush #255
    //   2291: iand
    //   2292: baload
    //   2293: iload #48
    //   2295: ixor
    //   2296: i2b
    //   2297: bastore
    //   2298: aload #30
    //   2300: iload #47
    //   2302: iconst_3
    //   2303: iadd
    //   2304: iaload
    //   2305: istore #48
    //   2307: aload #46
    //   2309: bipush #12
    //   2311: aload #37
    //   2313: iload #52
    //   2315: bipush #24
    //   2317: iushr
    //   2318: baload
    //   2319: iload #48
    //   2321: bipush #24
    //   2323: iushr
    //   2324: ixor
    //   2325: i2b
    //   2326: bastore
    //   2327: aload #46
    //   2329: bipush #13
    //   2331: aload #37
    //   2333: iload #51
    //   2335: bipush #16
    //   2337: iushr
    //   2338: sipush #255
    //   2341: iand
    //   2342: baload
    //   2343: iload #48
    //   2345: bipush #16
    //   2347: iushr
    //   2348: ixor
    //   2349: i2b
    //   2350: bastore
    //   2351: aload #46
    //   2353: bipush #14
    //   2355: aload #37
    //   2357: iload #50
    //   2359: bipush #8
    //   2361: iushr
    //   2362: sipush #255
    //   2365: iand
    //   2366: baload
    //   2367: iload #48
    //   2369: bipush #8
    //   2371: iushr
    //   2372: ixor
    //   2373: i2b
    //   2374: bastore
    //   2375: aload #46
    //   2377: bipush #15
    //   2379: aload #37
    //   2381: iload #49
    //   2383: sipush #255
    //   2386: iand
    //   2387: baload
    //   2388: iload #48
    //   2390: ixor
    //   2391: i2b
    //   2392: bastore
    //   2393: iconst_0
    //   2394: istore #53
    //   2396: iload #53
    //   2398: bipush #16
    //   2400: if_icmpge -> 2426
    //   2403: aload #43
    //   2405: iload #53
    //   2407: iload #44
    //   2409: bipush #16
    //   2411: imul
    //   2412: iadd
    //   2413: aload #46
    //   2415: iload #53
    //   2417: baload
    //   2418: bastore
    //   2419: iinc #53, 1
    //   2422: iload_2
    //   2423: ifne -> 2396
    //   2426: iinc #44, 1
    //   2429: iload_2
    //   2430: ifne -> 1511
    //   2433: aload #43
    //   2435: arraylength
    //   2436: ifle -> 2517
    //   2439: aload #43
    //   2441: aload #43
    //   2443: arraylength
    //   2444: iconst_1
    //   2445: isub
    //   2446: baload
    //   2447: istore #44
    //   2449: iload #44
    //   2451: bipush #16
    //   2453: if_icmple -> 2464
    //   2456: aload #43
    //   2458: astore #35
    //   2460: iload_2
    //   2461: ifne -> 2517
    //   2464: aload #43
    //   2466: arraylength
    //   2467: iload #44
    //   2469: isub
    //   2470: newarray byte
    //   2472: astore #35
    //   2474: iconst_0
    //   2475: istore #45
    //   2477: iload #45
    //   2479: aload #35
    //   2481: arraylength
    //   2482: if_icmpge -> 2517
    //   2485: iload #45
    //   2487: aload #43
    //   2489: arraylength
    //   2490: if_icmpge -> 2517
    //   2493: aload #35
    //   2495: iload #45
    //   2497: aload #43
    //   2499: iload #45
    //   2501: baload
    //   2502: bastore
    //   2503: iinc #45, 1
    //   2506: iload_2
    //   2507: ifne -> 2477
    //   2510: goto -> 2517
    //   2513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2516: athrow
    //   2517: aload #35
    //   2519: astore #7
    //   2521: sipush #14483
    //   2524: new java/math/BigInteger
    //   2527: dup
    //   2528: aload #7
    //   2530: invokespecial <init> : ([B)V
    //   2533: invokevirtual abs : ()Ljava/math/BigInteger;
    //   2536: putstatic burp/Zgde.ZG : Ljava/lang/Object;
    //   2539: sipush #-32177
    //   2542: getstatic burp/Zrd4.Ze : Ljava/lang/Object;
    //   2545: checkcast java/math/BigInteger
    //   2548: getstatic burp/Zstf.ZA : Ljava/lang/Object;
    //   2551: checkcast java/math/BigInteger
    //   2554: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   2557: putstatic burp/Zg3v.Zk : Ljava/lang/Object;
    //   2560: getstatic burp/Zz58.ZD : Ljava/lang/Object;
    //   2563: checkcast java/math/BigInteger
    //   2566: getstatic burp/Zmt_.Zl : Ljava/lang/Object;
    //   2569: checkcast java/math/BigInteger
    //   2572: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   2575: putstatic burp/Zzs9.ZO : Ljava/lang/Object;
    //   2578: invokestatic a : (II)Ljava/lang/String;
    //   2581: iconst_1
    //   2582: ldc burp/Zmtr
    //   2584: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2587: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2590: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2593: astore_3
    //   2594: aload_3
    //   2595: arraylength
    //   2596: istore #4
    //   2598: iconst_0
    //   2599: istore #5
    //   2601: iload #5
    //   2603: iload #4
    //   2605: if_icmpge -> 2742
    //   2608: aload_3
    //   2609: iload #5
    //   2611: aaload
    //   2612: astore #6
    //   2614: aload #6
    //   2616: invokevirtual getModifiers : ()I
    //   2619: invokestatic isStatic : (I)Z
    //   2622: ifne -> 2632
    //   2625: goto -> 2735
    //   2628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2631: athrow
    //   2632: aload #6
    //   2634: invokevirtual getType : ()Ljava/lang/Class;
    //   2637: astore #7
    //   2639: aload #7
    //   2641: ifnull -> 2722
    //   2644: aload #7
    //   2646: invokevirtual isPrimitive : ()Z
    //   2649: ifne -> 2722
    //   2652: goto -> 2659
    //   2655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2658: athrow
    //   2659: aload #7
    //   2661: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2664: ifnull -> 2722
    //   2667: goto -> 2674
    //   2670: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2673: athrow
    //   2674: aload #7
    //   2676: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2679: invokevirtual getName : ()Ljava/lang/String;
    //   2682: ifnull -> 2722
    //   2685: goto -> 2692
    //   2688: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2691: athrow
    //   2692: aload #7
    //   2694: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2697: invokevirtual getName : ()Ljava/lang/String;
    //   2700: sipush #14491
    //   2703: sipush #-6488
    //   2706: invokestatic a : (II)Ljava/lang/String;
    //   2709: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2712: ifne -> 2722
    //   2715: goto -> 2722
    //   2718: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2721: athrow
    //   2722: aload #6
    //   2724: iconst_1
    //   2725: invokevirtual setAccessible : (Z)V
    //   2728: aload #6
    //   2730: aconst_null
    //   2731: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2734: pop
    //   2735: iinc #5, 1
    //   2738: iload_2
    //   2739: ifne -> 2601
    //   2742: sipush #14484
    //   2745: sipush #293
    //   2748: invokestatic a : (II)Ljava/lang/String;
    //   2751: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2754: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2757: astore_3
    //   2758: aload_3
    //   2759: arraylength
    //   2760: istore #4
    //   2762: iconst_0
    //   2763: istore #5
    //   2765: iload #5
    //   2767: iload #4
    //   2769: if_icmpge -> 2880
    //   2772: aload_3
    //   2773: iload #5
    //   2775: aaload
    //   2776: astore #6
    //   2778: aload #6
    //   2780: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2783: pop
    //   2784: aload #6
    //   2786: invokevirtual getModifiers : ()I
    //   2789: invokestatic isStatic : (I)Z
    //   2792: ifeq -> 2866
    //   2795: aload #6
    //   2797: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2800: arraylength
    //   2801: iconst_2
    //   2802: if_icmpne -> 2866
    //   2805: goto -> 2812
    //   2808: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2811: athrow
    //   2812: aload #6
    //   2814: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2817: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2820: if_acmpne -> 2866
    //   2823: goto -> 2830
    //   2826: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2829: athrow
    //   2830: aload #6
    //   2832: iconst_1
    //   2833: invokevirtual setAccessible : (Z)V
    //   2836: aload #6
    //   2838: aconst_null
    //   2839: iconst_2
    //   2840: anewarray java/lang/Object
    //   2843: dup
    //   2844: iconst_0
    //   2845: aload_0
    //   2846: aastore
    //   2847: dup
    //   2848: iconst_1
    //   2849: aload_1
    //   2850: aastore
    //   2851: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2854: pop
    //   2855: iload_2
    //   2856: ifne -> 2880
    //   2859: goto -> 2866
    //   2862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2865: athrow
    //   2866: iinc #5, 1
    //   2869: iload_2
    //   2870: ifne -> 2765
    //   2873: goto -> 2880
    //   2876: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2879: athrow
    //   2880: sipush #14479
    //   2883: sipush #14253
    //   2886: invokestatic a : (II)Ljava/lang/String;
    //   2889: iconst_1
    //   2890: ldc burp/Zsf4
    //   2892: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2895: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2898: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2901: astore_3
    //   2902: aload_3
    //   2903: arraylength
    //   2904: istore #4
    //   2906: iconst_0
    //   2907: istore #5
    //   2909: iload #5
    //   2911: iload #4
    //   2913: if_icmpge -> 3050
    //   2916: aload_3
    //   2917: iload #5
    //   2919: aaload
    //   2920: astore #6
    //   2922: aload #6
    //   2924: invokevirtual getModifiers : ()I
    //   2927: invokestatic isStatic : (I)Z
    //   2930: ifne -> 2940
    //   2933: goto -> 3043
    //   2936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2939: athrow
    //   2940: aload #6
    //   2942: invokevirtual getType : ()Ljava/lang/Class;
    //   2945: astore #7
    //   2947: aload #7
    //   2949: ifnull -> 3030
    //   2952: aload #7
    //   2954: invokevirtual isPrimitive : ()Z
    //   2957: ifne -> 3030
    //   2960: goto -> 2967
    //   2963: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2966: athrow
    //   2967: aload #7
    //   2969: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2972: ifnull -> 3030
    //   2975: goto -> 2982
    //   2978: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2981: athrow
    //   2982: aload #7
    //   2984: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2987: invokevirtual getName : ()Ljava/lang/String;
    //   2990: ifnull -> 3030
    //   2993: goto -> 3000
    //   2996: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2999: athrow
    //   3000: aload #7
    //   3002: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3005: invokevirtual getName : ()Ljava/lang/String;
    //   3008: sipush #14490
    //   3011: sipush #4391
    //   3014: invokestatic a : (II)Ljava/lang/String;
    //   3017: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3020: ifne -> 3030
    //   3023: goto -> 3030
    //   3026: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3029: athrow
    //   3030: aload #6
    //   3032: iconst_1
    //   3033: invokevirtual setAccessible : (Z)V
    //   3036: aload #6
    //   3038: aconst_null
    //   3039: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3042: pop
    //   3043: iinc #5, 1
    //   3046: iload_2
    //   3047: ifne -> 2909
    //   3050: sipush #14486
    //   3053: sipush #12333
    //   3056: invokestatic a : (II)Ljava/lang/String;
    //   3059: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3062: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3065: astore_3
    //   3066: aload_3
    //   3067: arraylength
    //   3068: istore #4
    //   3070: iconst_0
    //   3071: istore #5
    //   3073: iload #5
    //   3075: iload #4
    //   3077: if_icmpge -> 3209
    //   3080: aload_3
    //   3081: iload #5
    //   3083: aaload
    //   3084: astore #6
    //   3086: aload #6
    //   3088: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3091: pop
    //   3092: aload #6
    //   3094: invokevirtual getModifiers : ()I
    //   3097: invokestatic isStatic : (I)Z
    //   3100: ifeq -> 3195
    //   3103: aload #6
    //   3105: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3108: arraylength
    //   3109: iconst_2
    //   3110: if_icmpne -> 3195
    //   3113: goto -> 3120
    //   3116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3119: athrow
    //   3120: aload #6
    //   3122: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3125: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   3128: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3131: ifeq -> 3195
    //   3134: goto -> 3141
    //   3137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3140: athrow
    //   3141: aload #6
    //   3143: iconst_1
    //   3144: invokevirtual setAccessible : (Z)V
    //   3147: aload #6
    //   3149: aconst_null
    //   3150: iconst_2
    //   3151: anewarray java/lang/Object
    //   3154: dup
    //   3155: iconst_0
    //   3156: aload_0
    //   3157: aastore
    //   3158: dup
    //   3159: iconst_1
    //   3160: aload_1
    //   3161: ifnonnull -> 3179
    //   3164: goto -> 3171
    //   3167: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3170: athrow
    //   3171: aload_1
    //   3172: goto -> 3186
    //   3175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3178: athrow
    //   3179: aload_1
    //   3180: checkcast [B
    //   3183: invokevirtual clone : ()Ljava/lang/Object;
    //   3186: aastore
    //   3187: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3190: pop
    //   3191: iload_2
    //   3192: ifne -> 3209
    //   3195: iinc #5, 1
    //   3198: iload_2
    //   3199: ifne -> 3073
    //   3202: goto -> 3209
    //   3205: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3208: athrow
    //   3209: new java/io/ByteArrayOutputStream
    //   3212: dup
    //   3213: invokespecial <init> : ()V
    //   3216: astore_3
    //   3217: sipush #14494
    //   3220: aload_3
    //   3221: sipush #202
    //   3224: invokevirtual write : (I)V
    //   3227: sipush #-29894
    //   3230: aload_3
    //   3231: sipush #254
    //   3234: invokevirtual write : (I)V
    //   3237: aload_3
    //   3238: sipush #186
    //   3241: invokevirtual write : (I)V
    //   3244: aload_3
    //   3245: sipush #190
    //   3248: invokevirtual write : (I)V
    //   3251: aload_3
    //   3252: iconst_0
    //   3253: invokevirtual write : (I)V
    //   3256: aload_3
    //   3257: iconst_1
    //   3258: invokevirtual write : (I)V
    //   3261: aload_3
    //   3262: iconst_0
    //   3263: invokevirtual write : (I)V
    //   3266: aload_3
    //   3267: bipush #50
    //   3269: invokevirtual write : (I)V
    //   3272: aload_3
    //   3273: getstatic burp/Zevf.Zu : Ljava/lang/Object;
    //   3276: checkcast java/math/BigInteger
    //   3279: invokevirtual toByteArray : ()[B
    //   3282: invokevirtual write : ([B)V
    //   3285: aload_3
    //   3286: getstatic burp/Zvi.Zs : Ljava/lang/Object;
    //   3289: checkcast java/math/BigInteger
    //   3292: invokevirtual toByteArray : ()[B
    //   3295: invokevirtual write : ([B)V
    //   3298: aload_3
    //   3299: getstatic burp/Zva.Zu : Ljava/lang/Object;
    //   3302: checkcast java/math/BigInteger
    //   3305: invokevirtual toByteArray : ()[B
    //   3308: invokevirtual write : ([B)V
    //   3311: aload_3
    //   3312: invokevirtual toByteArray : ()[B
    //   3315: astore #4
    //   3317: aconst_null
    //   3318: astore #5
    //   3320: invokestatic a : (II)Ljava/lang/String;
    //   3323: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3326: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3329: astore #6
    //   3331: aload #6
    //   3333: arraylength
    //   3334: istore #7
    //   3336: iconst_0
    //   3337: istore #8
    //   3339: iload #8
    //   3341: iload #7
    //   3343: if_icmpge -> 3471
    //   3346: aload #6
    //   3348: iload #8
    //   3350: aaload
    //   3351: astore #9
    //   3353: aload #9
    //   3355: invokevirtual getName : ()Ljava/lang/String;
    //   3358: sipush #14488
    //   3361: sipush #18893
    //   3364: invokestatic a : (II)Ljava/lang/String;
    //   3367: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3370: ifeq -> 3464
    //   3373: aload #9
    //   3375: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3378: astore #10
    //   3380: aload #10
    //   3382: arraylength
    //   3383: iconst_4
    //   3384: if_icmpeq -> 3394
    //   3387: goto -> 3464
    //   3390: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3393: athrow
    //   3394: aload #10
    //   3396: iconst_0
    //   3397: aaload
    //   3398: ldc java/lang/String
    //   3400: if_acmpeq -> 3410
    //   3403: goto -> 3464
    //   3406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3409: athrow
    //   3410: aload #10
    //   3412: iconst_1
    //   3413: aaload
    //   3414: ldc [B
    //   3416: if_acmpeq -> 3426
    //   3419: goto -> 3464
    //   3422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3425: athrow
    //   3426: aload #10
    //   3428: iconst_2
    //   3429: aaload
    //   3430: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   3433: if_acmpeq -> 3443
    //   3436: goto -> 3464
    //   3439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3442: athrow
    //   3443: aload #10
    //   3445: iconst_3
    //   3446: aaload
    //   3447: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   3450: if_acmpeq -> 3460
    //   3453: goto -> 3464
    //   3456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3459: athrow
    //   3460: aload #9
    //   3462: astore #5
    //   3464: iinc #8, 1
    //   3467: iload_2
    //   3468: ifne -> 3339
    //   3471: aload #5
    //   3473: iconst_1
    //   3474: invokevirtual setAccessible : (Z)V
    //   3477: ldc burp/Zelc
    //   3479: iconst_0
    //   3480: anewarray java/lang/Class
    //   3483: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   3486: astore #6
    //   3488: aload #6
    //   3490: iconst_1
    //   3491: invokevirtual setAccessible : (Z)V
    //   3494: aload #5
    //   3496: aload #6
    //   3498: iconst_0
    //   3499: anewarray java/lang/Object
    //   3502: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   3505: iconst_4
    //   3506: anewarray java/lang/Object
    //   3509: dup
    //   3510: iconst_0
    //   3511: sipush #14489
    //   3514: sipush #-10631
    //   3517: invokestatic a : (II)Ljava/lang/String;
    //   3520: aastore
    //   3521: dup
    //   3522: iconst_1
    //   3523: aload #4
    //   3525: aastore
    //   3526: dup
    //   3527: iconst_2
    //   3528: iconst_0
    //   3529: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3532: aastore
    //   3533: dup
    //   3534: iconst_3
    //   3535: aload #4
    //   3537: arraylength
    //   3538: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3541: aastore
    //   3542: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3545: pop
    //   3546: goto -> 3550
    //   3549: astore_3
    //   3550: getstatic burp/Zzox.ZB : Ljava/lang/String;
    //   3553: getstatic burp/Zeai.ZI : Ljava/lang/Object;
    //   3556: checkcast java/math/BigInteger
    //   3559: invokevirtual intValue : ()I
    //   3562: bipush #32
    //   3564: irem
    //   3565: invokestatic abs : (I)I
    //   3568: invokevirtual charAt : (I)C
    //   3571: getstatic burp/Zeuz.Zb : Ljava/lang/String;
    //   3574: getstatic burp/Zkbf.Zx : Ljava/lang/Object;
    //   3577: checkcast java/math/BigInteger
    //   3580: invokevirtual intValue : ()I
    //   3583: bipush #32
    //   3585: irem
    //   3586: invokestatic abs : (I)I
    //   3589: invokevirtual charAt : (I)C
    //   3592: if_icmpgt -> 3699
    //   3595: getstatic burp/Zt5a.Zl : Ljava/lang/String;
    //   3598: getstatic burp/Zeh9.ZY : Ljava/lang/Object;
    //   3601: checkcast java/math/BigInteger
    //   3604: invokevirtual intValue : ()I
    //   3607: bipush #32
    //   3609: irem
    //   3610: invokestatic abs : (I)I
    //   3613: invokevirtual charAt : (I)C
    //   3616: getstatic burp/Zzpj.ZR : Ljava/lang/String;
    //   3619: getstatic burp/Zzhu.ZW : Ljava/lang/Object;
    //   3622: checkcast java/math/BigInteger
    //   3625: invokevirtual intValue : ()I
    //   3628: bipush #32
    //   3630: irem
    //   3631: invokestatic abs : (I)I
    //   3634: invokevirtual charAt : (I)C
    //   3637: if_icmple -> 3699
    //   3640: goto -> 3647
    //   3643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3646: athrow
    //   3647: getstatic burp/Zboa.Zq : Ljava/lang/String;
    //   3650: getstatic burp/Zd8.Zs : Ljava/lang/Object;
    //   3653: checkcast java/math/BigInteger
    //   3656: invokevirtual intValue : ()I
    //   3659: bipush #32
    //   3661: irem
    //   3662: invokestatic abs : (I)I
    //   3665: invokevirtual charAt : (I)C
    //   3668: getstatic burp/Zg2z.ZE : Ljava/lang/String;
    //   3671: getstatic burp/Zg_p.Zx : Ljava/lang/Object;
    //   3674: checkcast java/math/BigInteger
    //   3677: invokevirtual intValue : ()I
    //   3680: bipush #32
    //   3682: irem
    //   3683: invokestatic abs : (I)I
    //   3686: invokevirtual charAt : (I)C
    //   3689: if_icmple -> 3707
    //   3692: goto -> 3699
    //   3695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3698: athrow
    //   3699: iconst_1
    //   3700: goto -> 3708
    //   3703: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3706: athrow
    //   3707: iconst_0
    //   3708: ireturn
    //   3709: astore_3
    //   3710: new java/lang/Exception
    //   3713: dup
    //   3714: aload_3
    //   3715: invokevirtual getMessage : ()Ljava/lang/String;
    //   3718: invokespecial <init> : (Ljava/lang/String;)V
    //   3721: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3708	3709	java/lang/Throwable
    //   164	179	179	java/lang/Throwable
    //   1181	1207	1207	java/lang/Throwable
    //   1288	1303	1303	java/lang/Throwable
    //   2485	2510	2513	java/lang/Throwable
    //   2614	2628	2628	java/lang/Throwable
    //   2639	2652	2655	java/lang/Throwable
    //   2644	2667	2670	java/lang/Throwable
    //   2659	2685	2688	java/lang/Throwable
    //   2674	2715	2718	java/lang/Throwable
    //   2778	2805	2808	java/lang/Throwable
    //   2795	2823	2826	java/lang/Throwable
    //   2812	2859	2862	java/lang/Throwable
    //   2830	2873	2876	java/lang/Throwable
    //   2922	2936	2936	java/lang/Throwable
    //   2947	2960	2963	java/lang/Throwable
    //   2952	2975	2978	java/lang/Throwable
    //   2967	2993	2996	java/lang/Throwable
    //   2982	3023	3026	java/lang/Throwable
    //   3086	3113	3116	java/lang/Throwable
    //   3103	3134	3137	java/lang/Throwable
    //   3120	3164	3167	java/lang/Throwable
    //   3141	3175	3175	java/lang/Throwable
    //   3186	3202	3205	java/lang/Throwable
    //   3209	3546	3549	java/lang/Throwable
    //   3380	3390	3390	java/lang/Throwable
    //   3394	3406	3406	java/lang/Throwable
    //   3410	3422	3422	java/lang/Throwable
    //   3426	3439	3439	java/lang/Throwable
    //   3443	3456	3456	java/lang/Throwable
    //   3550	3640	3643	java/lang/Throwable
    //   3595	3692	3695	java/lang/Throwable
    //   3647	3703	3703	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '8c Ç×¼TÁ¸Ý\\bRoÁ,\»ÿ  :\\fúMÂâkN\\to¤ÆT#Å¾Z× O÷í2[o¢Pi,m ­Í  EhâåÏðIx©3Mì3ÁÌâ¦ùÖ^Ôgë¤Þ:mÚæ¼µÕèuP>é pa±\\r*ú|ÌL2AOAù/\\bÑuÙ$¶ÿ|dl\\t\\b·ìÃ\\tÞË4Ò·ñ ç(½÷pÖI©mì6Uäh/¨YÉ¬¢R6H)Hé\\t+uèR)«\\tq>l\\tÂxH\\b¢®ª"Mº V][Ê¬s÷éh Hû8\;²å\Ã@ÅÏ:¼hæ±k¸/°x¬µÕ;qæ\\tz¥Â ®!9@/]Ú.r¦¯²K\Â (,¼úæ¤n+=G[K;äÒ×%Óî\ÿÃç\\t=¿·ð]HÏ'
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
    //   68: ldc '揋眮濝ヂ架ﺨ꭪쩾즡揄䟊굌ꈞ鳧犝뜘鎄㚢㐯燨ㅠӐ⎤ᣨֳߏ肙눱२Ⲽᮖ嫪劎홳⦧⿳叡₯뇿橴븿䪬塭킹ꫤ䎬㎴䕁Ȁ傉鼾冭䀱鋖㡤벞?၊춁Ꮡ忣䒀쓥绞搶᧶悘俖≔過䘍룀?୼㫹䧄␮숉겴鄴㝡趴仁汫敂꺏멞◐Პ듳璶䮭读炇땆䣎慆圂蛁ᵖ顒榠踤鬴蜰츈⢉貛褱뿉䈾䇁ⶫ끂뭉挐瞓潪キ杀﹅ꮴ쫃쥺墨䞱궺ꉱ鰹牰럃錹㛙㑀焅ㆾѭ⍿ᡟ׈ܹ胶닜঳Ⰱᯭ婝勡횅⥊⼭卜Z‘놄檂빐䩲墀큢꩙䏗㌃䔮˶偤鿠儐䃪鉡㠟뱨?႔쵚፬徘䐷쒊縨擛ᤨ急伍⋣逵䛻뢯?஑㩄䦿⒙쉦걂釙㞺贃人沝斜깢명╭᳥둄瑀䭀謥瀺떝䡹憰坭蘟ᶻ飯槛躓魛蟆컥⡗谦觪뽾䉅䄷ⷄ난뮤'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: sipush #128
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #76
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
    //   130: putstatic burp/Zcc.a : [Ljava/lang/String;
    //   133: bipush #19
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zcc.b : [Ljava/lang/String;
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
    //   212: bipush #38
    //   214: goto -> 244
    //   217: bipush #9
    //   219: goto -> 244
    //   222: bipush #40
    //   224: goto -> 244
    //   227: bipush #45
    //   229: goto -> 244
    //   232: bipush #28
    //   234: goto -> 244
    //   237: bipush #59
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
    //   283: tableswitch default -> 40, 0 -> 100
    //   300: sipush #14480
    //   303: sipush #17968
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zcc.Zb : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #14481
    //   319: sipush #-31658
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zcc.Zd : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x389F) & 0xFFFF;
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
      byte b1 = 25;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zcc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */