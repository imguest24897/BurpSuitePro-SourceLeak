package burp;

import java.math.BigInteger;

class Zz4m extends ClassLoader {
  static String ZI;
  
  static Object Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zu(Object paramObject) {
    Zepy.Zg = a(5215, 6138);
    Zepy.Ze = new BigInteger(a(5205, -20724));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zepy.Zg.charAt(Math.abs(((BigInteger)Zxln.ZJ).intValue() % 32)) > Zkf6.ZO.charAt(Math.abs(((BigInteger)Zxln.ZJ).intValue() % 32))) {
          try {
            Zkql.ZD(Class.forName(a(5214, 31367)));
            if (bool)
              Zstq.ZC(Class.forName(a(5204, -1991))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zstq.ZC(Class.forName(a(5204, -1991)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZN(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: ldc2_w 8682522807148012
    //   7: invokestatic currentTimeMillis : ()J
    //   10: lxor
    //   11: lstore #4
    //   13: lload #4
    //   15: ldc2_w 25214903917
    //   18: lmul
    //   19: ldc2_w 11
    //   22: ladd
    //   23: ldc2_w 281474976710655
    //   26: land
    //   27: lstore #4
    //   29: lload #4
    //   31: bipush #32
    //   33: lshl
    //   34: lstore #6
    //   36: lload #4
    //   38: ldc2_w 25214903917
    //   41: lmul
    //   42: ldc2_w 11
    //   45: ladd
    //   46: ldc2_w 281474976710655
    //   49: land
    //   50: lstore #4
    //   52: lload #6
    //   54: lload #4
    //   56: ladd
    //   57: lstore #6
    //   59: bipush #16
    //   61: newarray byte
    //   63: dup
    //   64: iconst_0
    //   65: bipush #48
    //   67: bastore
    //   68: dup
    //   69: iconst_1
    //   70: bipush #49
    //   72: bastore
    //   73: dup
    //   74: iconst_2
    //   75: bipush #50
    //   77: bastore
    //   78: dup
    //   79: iconst_3
    //   80: bipush #51
    //   82: bastore
    //   83: dup
    //   84: iconst_4
    //   85: bipush #52
    //   87: bastore
    //   88: dup
    //   89: iconst_5
    //   90: bipush #53
    //   92: bastore
    //   93: dup
    //   94: bipush #6
    //   96: bipush #54
    //   98: bastore
    //   99: dup
    //   100: bipush #7
    //   102: bipush #55
    //   104: bastore
    //   105: dup
    //   106: bipush #8
    //   108: bipush #56
    //   110: bastore
    //   111: dup
    //   112: bipush #9
    //   114: bipush #57
    //   116: bastore
    //   117: dup
    //   118: bipush #10
    //   120: bipush #97
    //   122: bastore
    //   123: dup
    //   124: bipush #11
    //   126: bipush #98
    //   128: bastore
    //   129: dup
    //   130: bipush #12
    //   132: bipush #99
    //   134: bastore
    //   135: dup
    //   136: bipush #13
    //   138: bipush #100
    //   140: bastore
    //   141: dup
    //   142: bipush #14
    //   144: bipush #101
    //   146: bastore
    //   147: dup
    //   148: bipush #15
    //   150: bipush #102
    //   152: bastore
    //   153: astore #8
    //   155: bipush #64
    //   157: newarray byte
    //   159: astore #9
    //   161: bipush #64
    //   163: istore #10
    //   165: bipush #16
    //   167: istore #11
    //   169: iload #11
    //   171: iconst_1
    //   172: isub
    //   173: i2l
    //   174: lstore #12
    //   176: aload #9
    //   178: iinc #10, -1
    //   181: iload #10
    //   183: aload #8
    //   185: lload #6
    //   187: lload #12
    //   189: land
    //   190: l2i
    //   191: baload
    //   192: bastore
    //   193: lload #6
    //   195: iconst_4
    //   196: lushr
    //   197: lstore #6
    //   199: lload #6
    //   201: lconst_0
    //   202: lcmp
    //   203: ifne -> 176
    //   206: bipush #64
    //   208: iload #10
    //   210: isub
    //   211: newarray byte
    //   213: astore_3
    //   214: iconst_0
    //   215: istore #14
    //   217: iload #14
    //   219: aload_3
    //   220: arraylength
    //   221: if_icmpge -> 243
    //   224: aload_3
    //   225: iload #14
    //   227: aload #9
    //   229: iload #10
    //   231: iload #14
    //   233: iadd
    //   234: baload
    //   235: bastore
    //   236: iinc #14, 1
    //   239: iload_2
    //   240: ifeq -> 217
    //   243: aload_3
    //   244: arraylength
    //   245: bipush #10
    //   247: if_icmplt -> 13
    //   250: getstatic burp/Zscz.ZN : Ljava/lang/Object;
    //   253: checkcast java/math/BigInteger
    //   256: getstatic burp/Zesw.ZB : Ljava/lang/Object;
    //   259: checkcast java/math/BigInteger
    //   262: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   265: putstatic burp/Zz0y.Zp : Ljava/lang/Object;
    //   268: new java/io/ByteArrayOutputStream
    //   271: dup
    //   272: invokespecial <init> : ()V
    //   275: astore_3
    //   276: getstatic burp/Zthx.Ze : Ljava/lang/String;
    //   279: astore #4
    //   281: iconst_0
    //   282: istore #5
    //   284: iload #5
    //   286: aload #4
    //   288: invokevirtual length : ()I
    //   291: if_icmpge -> 321
    //   294: aload_3
    //   295: aload #4
    //   297: iload #5
    //   299: iload #5
    //   301: iconst_2
    //   302: iadd
    //   303: invokevirtual substring : (II)Ljava/lang/String;
    //   306: bipush #16
    //   308: invokestatic parseInt : (Ljava/lang/String;I)I
    //   311: invokevirtual write : (I)V
    //   314: iinc #5, 2
    //   317: iload_2
    //   318: ifeq -> 284
    //   321: aload_3
    //   322: invokevirtual toByteArray : ()[B
    //   325: astore #5
    //   327: getstatic burp/Zm83.Zl : Ljava/lang/Object;
    //   330: checkcast java/math/BigInteger
    //   333: invokevirtual toByteArray : ()[B
    //   336: astore #6
    //   338: sipush #256
    //   341: newarray byte
    //   343: astore #8
    //   345: sipush #256
    //   348: newarray int
    //   350: astore #9
    //   352: sipush #256
    //   355: newarray int
    //   357: astore #10
    //   359: sipush #256
    //   362: newarray int
    //   364: astore #11
    //   366: sipush #256
    //   369: newarray int
    //   371: astore #12
    //   373: bipush #10
    //   375: newarray int
    //   377: astore #13
    //   379: sipush #283
    //   382: istore #14
    //   384: iconst_0
    //   385: istore #16
    //   387: iload #16
    //   389: sipush #256
    //   392: if_icmpge -> 626
    //   395: sipush #5213
    //   398: sipush #-11776
    //   401: invokestatic a : (II)Ljava/lang/String;
    //   404: iload #16
    //   406: iconst_1
    //   407: iushr
    //   408: invokevirtual charAt : (I)C
    //   411: istore #25
    //   413: iload #16
    //   415: iconst_1
    //   416: iand
    //   417: ifne -> 432
    //   420: iload #25
    //   422: bipush #8
    //   424: iushr
    //   425: goto -> 434
    //   428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   431: athrow
    //   432: iload #25
    //   434: i2b
    //   435: sipush #255
    //   438: iand
    //   439: istore #15
    //   441: iload #16
    //   443: iconst_1
    //   444: ishl
    //   445: istore #17
    //   447: iload #17
    //   449: sipush #256
    //   452: if_icmplt -> 462
    //   455: iload #17
    //   457: iload #14
    //   459: ixor
    //   460: istore #17
    //   462: iload #17
    //   464: iconst_1
    //   465: ishl
    //   466: istore #18
    //   468: iload #18
    //   470: sipush #256
    //   473: if_icmplt -> 483
    //   476: iload #18
    //   478: iload #14
    //   480: ixor
    //   481: istore #18
    //   483: iload #18
    //   485: iconst_1
    //   486: ishl
    //   487: istore #19
    //   489: iload #19
    //   491: sipush #256
    //   494: if_icmplt -> 504
    //   497: iload #19
    //   499: iload #14
    //   501: ixor
    //   502: istore #19
    //   504: iload #19
    //   506: iload #16
    //   508: ixor
    //   509: istore #20
    //   511: iload #20
    //   513: iload #17
    //   515: ixor
    //   516: istore #21
    //   518: iload #20
    //   520: iload #18
    //   522: ixor
    //   523: istore #22
    //   525: iload #19
    //   527: iload #18
    //   529: ixor
    //   530: iload #17
    //   532: ixor
    //   533: istore #23
    //   535: aload #8
    //   537: iload #16
    //   539: iload #15
    //   541: i2b
    //   542: bastore
    //   543: aload #9
    //   545: iload #15
    //   547: iload #23
    //   549: bipush #24
    //   551: ishl
    //   552: iload #20
    //   554: bipush #16
    //   556: ishl
    //   557: ior
    //   558: iload #22
    //   560: bipush #8
    //   562: ishl
    //   563: ior
    //   564: iload #21
    //   566: ior
    //   567: dup
    //   568: istore #24
    //   570: iastore
    //   571: aload #10
    //   573: iload #15
    //   575: iload #24
    //   577: bipush #8
    //   579: iushr
    //   580: iload #24
    //   582: bipush #24
    //   584: ishl
    //   585: ior
    //   586: iastore
    //   587: aload #11
    //   589: iload #15
    //   591: iload #24
    //   593: bipush #16
    //   595: iushr
    //   596: iload #24
    //   598: bipush #16
    //   600: ishl
    //   601: ior
    //   602: iastore
    //   603: aload #12
    //   605: iload #15
    //   607: iload #24
    //   609: bipush #24
    //   611: iushr
    //   612: iload #24
    //   614: bipush #8
    //   616: ishl
    //   617: ior
    //   618: iastore
    //   619: iinc #16, 1
    //   622: iload_2
    //   623: ifeq -> 387
    //   626: iconst_1
    //   627: istore #25
    //   629: aload #13
    //   631: iconst_0
    //   632: iload #25
    //   634: bipush #24
    //   636: ishl
    //   637: iastore
    //   638: iconst_1
    //   639: istore #26
    //   641: iload #26
    //   643: bipush #10
    //   645: if_icmpge -> 686
    //   648: iload #25
    //   650: iconst_1
    //   651: ishl
    //   652: istore #25
    //   654: iload #25
    //   656: sipush #256
    //   659: if_icmplt -> 669
    //   662: iload #25
    //   664: iload #14
    //   666: ixor
    //   667: istore #25
    //   669: aload #13
    //   671: iload #26
    //   673: iload #25
    //   675: bipush #24
    //   677: ishl
    //   678: iastore
    //   679: iinc #26, 1
    //   682: iload_2
    //   683: ifeq -> 641
    //   686: iconst_4
    //   687: istore #26
    //   689: iload #26
    //   691: bipush #6
    //   693: iadd
    //   694: istore #27
    //   696: iconst_4
    //   697: iload #27
    //   699: iconst_1
    //   700: iadd
    //   701: imul
    //   702: istore #28
    //   704: iload #28
    //   706: newarray int
    //   708: astore #29
    //   710: iload #28
    //   712: newarray int
    //   714: astore #30
    //   716: iconst_0
    //   717: istore #25
    //   719: iconst_0
    //   720: istore #32
    //   722: iconst_0
    //   723: istore #33
    //   725: iload #32
    //   727: iload #26
    //   729: if_icmpge -> 797
    //   732: aload #29
    //   734: iload #32
    //   736: aload #5
    //   738: iload #33
    //   740: baload
    //   741: bipush #24
    //   743: ishl
    //   744: aload #5
    //   746: iload #33
    //   748: iconst_1
    //   749: iadd
    //   750: baload
    //   751: sipush #255
    //   754: iand
    //   755: bipush #16
    //   757: ishl
    //   758: ior
    //   759: aload #5
    //   761: iload #33
    //   763: iconst_2
    //   764: iadd
    //   765: baload
    //   766: sipush #255
    //   769: iand
    //   770: bipush #8
    //   772: ishl
    //   773: ior
    //   774: aload #5
    //   776: iload #33
    //   778: iconst_3
    //   779: iadd
    //   780: baload
    //   781: sipush #255
    //   784: iand
    //   785: ior
    //   786: iastore
    //   787: iinc #32, 1
    //   790: iinc #33, 4
    //   793: iload_2
    //   794: ifeq -> 725
    //   797: iload #26
    //   799: istore #32
    //   801: iconst_0
    //   802: istore #33
    //   804: iload #32
    //   806: iload #28
    //   808: if_icmpge -> 935
    //   811: aload #29
    //   813: iload #32
    //   815: iconst_1
    //   816: isub
    //   817: iaload
    //   818: istore #31
    //   820: iload #33
    //   822: ifne -> 909
    //   825: iload #26
    //   827: istore #33
    //   829: aload #8
    //   831: iload #31
    //   833: bipush #16
    //   835: iushr
    //   836: sipush #255
    //   839: iand
    //   840: baload
    //   841: bipush #24
    //   843: ishl
    //   844: aload #8
    //   846: iload #31
    //   848: bipush #8
    //   850: iushr
    //   851: sipush #255
    //   854: iand
    //   855: baload
    //   856: sipush #255
    //   859: iand
    //   860: bipush #16
    //   862: ishl
    //   863: ior
    //   864: aload #8
    //   866: iload #31
    //   868: sipush #255
    //   871: iand
    //   872: baload
    //   873: sipush #255
    //   876: iand
    //   877: bipush #8
    //   879: ishl
    //   880: ior
    //   881: aload #8
    //   883: iload #31
    //   885: bipush #24
    //   887: iushr
    //   888: baload
    //   889: sipush #255
    //   892: iand
    //   893: ior
    //   894: istore #31
    //   896: iload #31
    //   898: aload #13
    //   900: iload #25
    //   902: iinc #25, 1
    //   905: iaload
    //   906: ixor
    //   907: istore #31
    //   909: aload #29
    //   911: iload #32
    //   913: aload #29
    //   915: iload #32
    //   917: iload #26
    //   919: isub
    //   920: iaload
    //   921: iload #31
    //   923: ixor
    //   924: iastore
    //   925: iinc #32, 1
    //   928: iinc #33, -1
    //   931: iload_2
    //   932: ifeq -> 804
    //   935: iconst_0
    //   936: istore #32
    //   938: iconst_4
    //   939: iload #27
    //   941: imul
    //   942: istore #33
    //   944: aload #30
    //   946: iload #32
    //   948: aload #29
    //   950: iload #33
    //   952: iaload
    //   953: iastore
    //   954: aload #30
    //   956: iload #32
    //   958: iconst_1
    //   959: iadd
    //   960: aload #29
    //   962: iload #33
    //   964: iconst_1
    //   965: iadd
    //   966: iaload
    //   967: iastore
    //   968: aload #30
    //   970: iload #32
    //   972: iconst_2
    //   973: iadd
    //   974: aload #29
    //   976: iload #33
    //   978: iconst_2
    //   979: iadd
    //   980: iaload
    //   981: iastore
    //   982: aload #30
    //   984: iload #32
    //   986: iconst_3
    //   987: iadd
    //   988: aload #29
    //   990: iload #33
    //   992: iconst_3
    //   993: iadd
    //   994: iaload
    //   995: iastore
    //   996: iinc #32, 4
    //   999: iinc #33, -4
    //   1002: iconst_1
    //   1003: istore #35
    //   1005: iload #35
    //   1007: iload #27
    //   1009: if_icmpge -> 1373
    //   1012: aload #29
    //   1014: iload #33
    //   1016: iaload
    //   1017: istore #34
    //   1019: aload #30
    //   1021: iload #32
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
    //   1096: aload #29
    //   1098: iload #33
    //   1100: iconst_1
    //   1101: iadd
    //   1102: iaload
    //   1103: istore #34
    //   1105: aload #30
    //   1107: iload #32
    //   1109: iconst_1
    //   1110: iadd
    //   1111: aload #9
    //   1113: aload #8
    //   1115: iload #34
    //   1117: bipush #24
    //   1119: iushr
    //   1120: baload
    //   1121: sipush #255
    //   1124: iand
    //   1125: iaload
    //   1126: aload #10
    //   1128: aload #8
    //   1130: iload #34
    //   1132: bipush #16
    //   1134: iushr
    //   1135: sipush #255
    //   1138: iand
    //   1139: baload
    //   1140: sipush #255
    //   1143: iand
    //   1144: iaload
    //   1145: ixor
    //   1146: aload #11
    //   1148: aload #8
    //   1150: iload #34
    //   1152: bipush #8
    //   1154: iushr
    //   1155: sipush #255
    //   1158: iand
    //   1159: baload
    //   1160: sipush #255
    //   1163: iand
    //   1164: iaload
    //   1165: ixor
    //   1166: aload #12
    //   1168: aload #8
    //   1170: iload #34
    //   1172: sipush #255
    //   1175: iand
    //   1176: baload
    //   1177: sipush #255
    //   1180: iand
    //   1181: iaload
    //   1182: ixor
    //   1183: iastore
    //   1184: aload #29
    //   1186: iload #33
    //   1188: iconst_2
    //   1189: iadd
    //   1190: iaload
    //   1191: istore #34
    //   1193: aload #30
    //   1195: iload #32
    //   1197: iconst_2
    //   1198: iadd
    //   1199: aload #9
    //   1201: aload #8
    //   1203: iload #34
    //   1205: bipush #24
    //   1207: iushr
    //   1208: baload
    //   1209: sipush #255
    //   1212: iand
    //   1213: iaload
    //   1214: aload #10
    //   1216: aload #8
    //   1218: iload #34
    //   1220: bipush #16
    //   1222: iushr
    //   1223: sipush #255
    //   1226: iand
    //   1227: baload
    //   1228: sipush #255
    //   1231: iand
    //   1232: iaload
    //   1233: ixor
    //   1234: aload #11
    //   1236: aload #8
    //   1238: iload #34
    //   1240: bipush #8
    //   1242: iushr
    //   1243: sipush #255
    //   1246: iand
    //   1247: baload
    //   1248: sipush #255
    //   1251: iand
    //   1252: iaload
    //   1253: ixor
    //   1254: aload #12
    //   1256: aload #8
    //   1258: iload #34
    //   1260: sipush #255
    //   1263: iand
    //   1264: baload
    //   1265: sipush #255
    //   1268: iand
    //   1269: iaload
    //   1270: ixor
    //   1271: iastore
    //   1272: aload #29
    //   1274: iload #33
    //   1276: iconst_3
    //   1277: iadd
    //   1278: iaload
    //   1279: istore #34
    //   1281: aload #30
    //   1283: iload #32
    //   1285: iconst_3
    //   1286: iadd
    //   1287: aload #9
    //   1289: aload #8
    //   1291: iload #34
    //   1293: bipush #24
    //   1295: iushr
    //   1296: baload
    //   1297: sipush #255
    //   1300: iand
    //   1301: iaload
    //   1302: aload #10
    //   1304: aload #8
    //   1306: iload #34
    //   1308: bipush #16
    //   1310: iushr
    //   1311: sipush #255
    //   1314: iand
    //   1315: baload
    //   1316: sipush #255
    //   1319: iand
    //   1320: iaload
    //   1321: ixor
    //   1322: aload #11
    //   1324: aload #8
    //   1326: iload #34
    //   1328: bipush #8
    //   1330: iushr
    //   1331: sipush #255
    //   1334: iand
    //   1335: baload
    //   1336: sipush #255
    //   1339: iand
    //   1340: iaload
    //   1341: ixor
    //   1342: aload #12
    //   1344: aload #8
    //   1346: iload #34
    //   1348: sipush #255
    //   1351: iand
    //   1352: baload
    //   1353: sipush #255
    //   1356: iand
    //   1357: iaload
    //   1358: ixor
    //   1359: iastore
    //   1360: iinc #32, 4
    //   1363: iinc #33, -4
    //   1366: iinc #35, 1
    //   1369: iload_2
    //   1370: ifeq -> 1005
    //   1373: aload #30
    //   1375: iload #32
    //   1377: aload #29
    //   1379: iload #33
    //   1381: iaload
    //   1382: iastore
    //   1383: aload #30
    //   1385: iload #32
    //   1387: iconst_1
    //   1388: iadd
    //   1389: aload #29
    //   1391: iload #33
    //   1393: iconst_1
    //   1394: iadd
    //   1395: iaload
    //   1396: iastore
    //   1397: aload #30
    //   1399: iload #32
    //   1401: iconst_2
    //   1402: iadd
    //   1403: aload #29
    //   1405: iload #33
    //   1407: iconst_2
    //   1408: iadd
    //   1409: iaload
    //   1410: iastore
    //   1411: aload #30
    //   1413: iload #32
    //   1415: iconst_3
    //   1416: iadd
    //   1417: aload #29
    //   1419: iload #33
    //   1421: iconst_3
    //   1422: iadd
    //   1423: iaload
    //   1424: iastore
    //   1425: iconst_0
    //   1426: newarray byte
    //   1428: astore #35
    //   1430: aload #6
    //   1432: arraylength
    //   1433: bipush #16
    //   1435: irem
    //   1436: ifeq -> 1460
    //   1439: new java/lang/Exception
    //   1442: dup
    //   1443: sipush #5200
    //   1446: sipush #-32465
    //   1449: invokestatic a : (II)Ljava/lang/String;
    //   1452: invokespecial <init> : (Ljava/lang/String;)V
    //   1455: athrow
    //   1456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1459: athrow
    //   1460: bipush #10
    //   1462: istore #36
    //   1464: sipush #5206
    //   1467: sipush #256
    //   1470: newarray byte
    //   1472: astore #37
    //   1474: sipush #-11282
    //   1477: sipush #256
    //   1480: newarray int
    //   1482: astore #38
    //   1484: sipush #256
    //   1487: newarray int
    //   1489: astore #39
    //   1491: sipush #256
    //   1494: newarray int
    //   1496: astore #40
    //   1498: sipush #256
    //   1501: newarray int
    //   1503: astore #41
    //   1505: sipush #283
    //   1508: istore #14
    //   1510: invokestatic a : (II)Ljava/lang/String;
    //   1513: astore #42
    //   1515: iconst_0
    //   1516: istore #16
    //   1518: iload #16
    //   1520: sipush #256
    //   1523: if_icmpge -> 1750
    //   1526: aload #42
    //   1528: iload #16
    //   1530: iconst_1
    //   1531: iushr
    //   1532: invokevirtual charAt : (I)C
    //   1535: istore #43
    //   1537: iload #16
    //   1539: iconst_1
    //   1540: iand
    //   1541: ifne -> 1556
    //   1544: iload #43
    //   1546: bipush #8
    //   1548: iushr
    //   1549: goto -> 1558
    //   1552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1555: athrow
    //   1556: iload #43
    //   1558: i2b
    //   1559: sipush #255
    //   1562: iand
    //   1563: istore #15
    //   1565: iload #16
    //   1567: iconst_1
    //   1568: ishl
    //   1569: istore #17
    //   1571: iload #17
    //   1573: sipush #256
    //   1576: if_icmplt -> 1586
    //   1579: iload #17
    //   1581: iload #14
    //   1583: ixor
    //   1584: istore #17
    //   1586: iload #17
    //   1588: iconst_1
    //   1589: ishl
    //   1590: istore #18
    //   1592: iload #18
    //   1594: sipush #256
    //   1597: if_icmplt -> 1607
    //   1600: iload #18
    //   1602: iload #14
    //   1604: ixor
    //   1605: istore #18
    //   1607: iload #18
    //   1609: iconst_1
    //   1610: ishl
    //   1611: istore #19
    //   1613: iload #19
    //   1615: sipush #256
    //   1618: if_icmplt -> 1628
    //   1621: iload #19
    //   1623: iload #14
    //   1625: ixor
    //   1626: istore #19
    //   1628: iload #19
    //   1630: iload #16
    //   1632: ixor
    //   1633: istore #20
    //   1635: iload #20
    //   1637: iload #17
    //   1639: ixor
    //   1640: istore #21
    //   1642: iload #20
    //   1644: iload #18
    //   1646: ixor
    //   1647: istore #22
    //   1649: iload #19
    //   1651: iload #18
    //   1653: ixor
    //   1654: iload #17
    //   1656: ixor
    //   1657: istore #23
    //   1659: aload #37
    //   1661: iload #15
    //   1663: iload #16
    //   1665: i2b
    //   1666: bastore
    //   1667: aload #38
    //   1669: iload #15
    //   1671: iload #23
    //   1673: bipush #24
    //   1675: ishl
    //   1676: iload #20
    //   1678: bipush #16
    //   1680: ishl
    //   1681: ior
    //   1682: iload #22
    //   1684: bipush #8
    //   1686: ishl
    //   1687: ior
    //   1688: iload #21
    //   1690: ior
    //   1691: dup
    //   1692: istore #24
    //   1694: iastore
    //   1695: aload #39
    //   1697: iload #15
    //   1699: iload #24
    //   1701: bipush #8
    //   1703: iushr
    //   1704: iload #24
    //   1706: bipush #24
    //   1708: ishl
    //   1709: ior
    //   1710: iastore
    //   1711: aload #40
    //   1713: iload #15
    //   1715: iload #24
    //   1717: bipush #16
    //   1719: iushr
    //   1720: iload #24
    //   1722: bipush #16
    //   1724: ishl
    //   1725: ior
    //   1726: iastore
    //   1727: aload #41
    //   1729: iload #15
    //   1731: iload #24
    //   1733: bipush #24
    //   1735: iushr
    //   1736: iload #24
    //   1738: bipush #8
    //   1740: ishl
    //   1741: ior
    //   1742: iastore
    //   1743: iinc #16, 1
    //   1746: iload_2
    //   1747: ifeq -> 1518
    //   1750: aload #6
    //   1752: arraylength
    //   1753: newarray byte
    //   1755: astore #43
    //   1757: iconst_0
    //   1758: istore #44
    //   1760: iload #44
    //   1762: aload #6
    //   1764: arraylength
    //   1765: bipush #16
    //   1767: idiv
    //   1768: if_icmpge -> 2682
    //   1771: bipush #16
    //   1773: newarray byte
    //   1775: astore #45
    //   1777: bipush #16
    //   1779: newarray byte
    //   1781: astore #46
    //   1783: iconst_0
    //   1784: istore #47
    //   1786: iload #47
    //   1788: bipush #16
    //   1790: if_icmpge -> 1816
    //   1793: aload #45
    //   1795: iload #47
    //   1797: aload #6
    //   1799: iload #47
    //   1801: iload #44
    //   1803: bipush #16
    //   1805: imul
    //   1806: iadd
    //   1807: baload
    //   1808: bastore
    //   1809: iinc #47, 1
    //   1812: iload_2
    //   1813: ifeq -> 1786
    //   1816: iconst_0
    //   1817: istore #47
    //   1819: aload #45
    //   1821: iconst_0
    //   1822: baload
    //   1823: bipush #24
    //   1825: ishl
    //   1826: aload #45
    //   1828: iconst_1
    //   1829: baload
    //   1830: sipush #255
    //   1833: iand
    //   1834: bipush #16
    //   1836: ishl
    //   1837: ior
    //   1838: aload #45
    //   1840: iconst_2
    //   1841: baload
    //   1842: sipush #255
    //   1845: iand
    //   1846: bipush #8
    //   1848: ishl
    //   1849: ior
    //   1850: aload #45
    //   1852: iconst_3
    //   1853: baload
    //   1854: sipush #255
    //   1857: iand
    //   1858: ior
    //   1859: aload #30
    //   1861: iconst_0
    //   1862: iaload
    //   1863: ixor
    //   1864: istore #49
    //   1866: aload #45
    //   1868: iconst_4
    //   1869: baload
    //   1870: bipush #24
    //   1872: ishl
    //   1873: aload #45
    //   1875: iconst_5
    //   1876: baload
    //   1877: sipush #255
    //   1880: iand
    //   1881: bipush #16
    //   1883: ishl
    //   1884: ior
    //   1885: aload #45
    //   1887: bipush #6
    //   1889: baload
    //   1890: sipush #255
    //   1893: iand
    //   1894: bipush #8
    //   1896: ishl
    //   1897: ior
    //   1898: aload #45
    //   1900: bipush #7
    //   1902: baload
    //   1903: sipush #255
    //   1906: iand
    //   1907: ior
    //   1908: aload #30
    //   1910: iconst_1
    //   1911: iaload
    //   1912: ixor
    //   1913: istore #50
    //   1915: aload #45
    //   1917: bipush #8
    //   1919: baload
    //   1920: bipush #24
    //   1922: ishl
    //   1923: aload #45
    //   1925: bipush #9
    //   1927: baload
    //   1928: sipush #255
    //   1931: iand
    //   1932: bipush #16
    //   1934: ishl
    //   1935: ior
    //   1936: aload #45
    //   1938: bipush #10
    //   1940: baload
    //   1941: sipush #255
    //   1944: iand
    //   1945: bipush #8
    //   1947: ishl
    //   1948: ior
    //   1949: aload #45
    //   1951: bipush #11
    //   1953: baload
    //   1954: sipush #255
    //   1957: iand
    //   1958: ior
    //   1959: aload #30
    //   1961: iconst_2
    //   1962: iaload
    //   1963: ixor
    //   1964: istore #51
    //   1966: aload #45
    //   1968: bipush #12
    //   1970: baload
    //   1971: bipush #24
    //   1973: ishl
    //   1974: aload #45
    //   1976: bipush #13
    //   1978: baload
    //   1979: sipush #255
    //   1982: iand
    //   1983: bipush #16
    //   1985: ishl
    //   1986: ior
    //   1987: aload #45
    //   1989: bipush #14
    //   1991: baload
    //   1992: sipush #255
    //   1995: iand
    //   1996: bipush #8
    //   1998: ishl
    //   1999: ior
    //   2000: aload #45
    //   2002: bipush #15
    //   2004: baload
    //   2005: sipush #255
    //   2008: iand
    //   2009: ior
    //   2010: aload #30
    //   2012: iconst_3
    //   2013: iaload
    //   2014: ixor
    //   2015: istore #52
    //   2017: iconst_1
    //   2018: istore #53
    //   2020: iload #53
    //   2022: iload #36
    //   2024: if_icmpge -> 2267
    //   2027: iinc #47, 4
    //   2030: aload #38
    //   2032: iload #49
    //   2034: bipush #24
    //   2036: iushr
    //   2037: iaload
    //   2038: aload #39
    //   2040: iload #52
    //   2042: bipush #16
    //   2044: iushr
    //   2045: sipush #255
    //   2048: iand
    //   2049: iaload
    //   2050: ixor
    //   2051: aload #40
    //   2053: iload #51
    //   2055: bipush #8
    //   2057: iushr
    //   2058: sipush #255
    //   2061: iand
    //   2062: iaload
    //   2063: ixor
    //   2064: aload #41
    //   2066: iload #50
    //   2068: sipush #255
    //   2071: iand
    //   2072: iaload
    //   2073: ixor
    //   2074: aload #30
    //   2076: iload #47
    //   2078: iaload
    //   2079: ixor
    //   2080: istore #54
    //   2082: aload #38
    //   2084: iload #50
    //   2086: bipush #24
    //   2088: iushr
    //   2089: iaload
    //   2090: aload #39
    //   2092: iload #49
    //   2094: bipush #16
    //   2096: iushr
    //   2097: sipush #255
    //   2100: iand
    //   2101: iaload
    //   2102: ixor
    //   2103: aload #40
    //   2105: iload #52
    //   2107: bipush #8
    //   2109: iushr
    //   2110: sipush #255
    //   2113: iand
    //   2114: iaload
    //   2115: ixor
    //   2116: aload #41
    //   2118: iload #51
    //   2120: sipush #255
    //   2123: iand
    //   2124: iaload
    //   2125: ixor
    //   2126: aload #30
    //   2128: iload #47
    //   2130: iconst_1
    //   2131: iadd
    //   2132: iaload
    //   2133: ixor
    //   2134: istore #55
    //   2136: aload #38
    //   2138: iload #51
    //   2140: bipush #24
    //   2142: iushr
    //   2143: iaload
    //   2144: aload #39
    //   2146: iload #50
    //   2148: bipush #16
    //   2150: iushr
    //   2151: sipush #255
    //   2154: iand
    //   2155: iaload
    //   2156: ixor
    //   2157: aload #40
    //   2159: iload #49
    //   2161: bipush #8
    //   2163: iushr
    //   2164: sipush #255
    //   2167: iand
    //   2168: iaload
    //   2169: ixor
    //   2170: aload #41
    //   2172: iload #52
    //   2174: sipush #255
    //   2177: iand
    //   2178: iaload
    //   2179: ixor
    //   2180: aload #30
    //   2182: iload #47
    //   2184: iconst_2
    //   2185: iadd
    //   2186: iaload
    //   2187: ixor
    //   2188: istore #56
    //   2190: aload #38
    //   2192: iload #52
    //   2194: bipush #24
    //   2196: iushr
    //   2197: iaload
    //   2198: aload #39
    //   2200: iload #51
    //   2202: bipush #16
    //   2204: iushr
    //   2205: sipush #255
    //   2208: iand
    //   2209: iaload
    //   2210: ixor
    //   2211: aload #40
    //   2213: iload #50
    //   2215: bipush #8
    //   2217: iushr
    //   2218: sipush #255
    //   2221: iand
    //   2222: iaload
    //   2223: ixor
    //   2224: aload #41
    //   2226: iload #49
    //   2228: sipush #255
    //   2231: iand
    //   2232: iaload
    //   2233: ixor
    //   2234: aload #30
    //   2236: iload #47
    //   2238: iconst_3
    //   2239: iadd
    //   2240: iaload
    //   2241: ixor
    //   2242: istore #57
    //   2244: iload #54
    //   2246: istore #49
    //   2248: iload #55
    //   2250: istore #50
    //   2252: iload #56
    //   2254: istore #51
    //   2256: iload #57
    //   2258: istore #52
    //   2260: iinc #53, 1
    //   2263: iload_2
    //   2264: ifeq -> 2020
    //   2267: iinc #47, 4
    //   2270: aload #30
    //   2272: iload #47
    //   2274: iaload
    //   2275: istore #48
    //   2277: aload #46
    //   2279: iconst_0
    //   2280: aload #37
    //   2282: iload #49
    //   2284: bipush #24
    //   2286: iushr
    //   2287: baload
    //   2288: iload #48
    //   2290: bipush #24
    //   2292: iushr
    //   2293: ixor
    //   2294: i2b
    //   2295: bastore
    //   2296: aload #46
    //   2298: iconst_1
    //   2299: aload #37
    //   2301: iload #52
    //   2303: bipush #16
    //   2305: iushr
    //   2306: sipush #255
    //   2309: iand
    //   2310: baload
    //   2311: iload #48
    //   2313: bipush #16
    //   2315: iushr
    //   2316: ixor
    //   2317: i2b
    //   2318: bastore
    //   2319: aload #46
    //   2321: iconst_2
    //   2322: aload #37
    //   2324: iload #51
    //   2326: bipush #8
    //   2328: iushr
    //   2329: sipush #255
    //   2332: iand
    //   2333: baload
    //   2334: iload #48
    //   2336: bipush #8
    //   2338: iushr
    //   2339: ixor
    //   2340: i2b
    //   2341: bastore
    //   2342: aload #46
    //   2344: iconst_3
    //   2345: aload #37
    //   2347: iload #50
    //   2349: sipush #255
    //   2352: iand
    //   2353: baload
    //   2354: iload #48
    //   2356: ixor
    //   2357: i2b
    //   2358: bastore
    //   2359: aload #30
    //   2361: iload #47
    //   2363: iconst_1
    //   2364: iadd
    //   2365: iaload
    //   2366: istore #48
    //   2368: aload #46
    //   2370: iconst_4
    //   2371: aload #37
    //   2373: iload #50
    //   2375: bipush #24
    //   2377: iushr
    //   2378: baload
    //   2379: iload #48
    //   2381: bipush #24
    //   2383: iushr
    //   2384: ixor
    //   2385: i2b
    //   2386: bastore
    //   2387: aload #46
    //   2389: iconst_5
    //   2390: aload #37
    //   2392: iload #49
    //   2394: bipush #16
    //   2396: iushr
    //   2397: sipush #255
    //   2400: iand
    //   2401: baload
    //   2402: iload #48
    //   2404: bipush #16
    //   2406: iushr
    //   2407: ixor
    //   2408: i2b
    //   2409: bastore
    //   2410: aload #46
    //   2412: bipush #6
    //   2414: aload #37
    //   2416: iload #52
    //   2418: bipush #8
    //   2420: iushr
    //   2421: sipush #255
    //   2424: iand
    //   2425: baload
    //   2426: iload #48
    //   2428: bipush #8
    //   2430: iushr
    //   2431: ixor
    //   2432: i2b
    //   2433: bastore
    //   2434: aload #46
    //   2436: bipush #7
    //   2438: aload #37
    //   2440: iload #51
    //   2442: sipush #255
    //   2445: iand
    //   2446: baload
    //   2447: iload #48
    //   2449: ixor
    //   2450: i2b
    //   2451: bastore
    //   2452: aload #30
    //   2454: iload #47
    //   2456: iconst_2
    //   2457: iadd
    //   2458: iaload
    //   2459: istore #48
    //   2461: aload #46
    //   2463: bipush #8
    //   2465: aload #37
    //   2467: iload #51
    //   2469: bipush #24
    //   2471: iushr
    //   2472: baload
    //   2473: iload #48
    //   2475: bipush #24
    //   2477: iushr
    //   2478: ixor
    //   2479: i2b
    //   2480: bastore
    //   2481: aload #46
    //   2483: bipush #9
    //   2485: aload #37
    //   2487: iload #50
    //   2489: bipush #16
    //   2491: iushr
    //   2492: sipush #255
    //   2495: iand
    //   2496: baload
    //   2497: iload #48
    //   2499: bipush #16
    //   2501: iushr
    //   2502: ixor
    //   2503: i2b
    //   2504: bastore
    //   2505: aload #46
    //   2507: bipush #10
    //   2509: aload #37
    //   2511: iload #49
    //   2513: bipush #8
    //   2515: iushr
    //   2516: sipush #255
    //   2519: iand
    //   2520: baload
    //   2521: iload #48
    //   2523: bipush #8
    //   2525: iushr
    //   2526: ixor
    //   2527: i2b
    //   2528: bastore
    //   2529: aload #46
    //   2531: bipush #11
    //   2533: aload #37
    //   2535: iload #52
    //   2537: sipush #255
    //   2540: iand
    //   2541: baload
    //   2542: iload #48
    //   2544: ixor
    //   2545: i2b
    //   2546: bastore
    //   2547: aload #30
    //   2549: iload #47
    //   2551: iconst_3
    //   2552: iadd
    //   2553: iaload
    //   2554: istore #48
    //   2556: aload #46
    //   2558: bipush #12
    //   2560: aload #37
    //   2562: iload #52
    //   2564: bipush #24
    //   2566: iushr
    //   2567: baload
    //   2568: iload #48
    //   2570: bipush #24
    //   2572: iushr
    //   2573: ixor
    //   2574: i2b
    //   2575: bastore
    //   2576: aload #46
    //   2578: bipush #13
    //   2580: aload #37
    //   2582: iload #51
    //   2584: bipush #16
    //   2586: iushr
    //   2587: sipush #255
    //   2590: iand
    //   2591: baload
    //   2592: iload #48
    //   2594: bipush #16
    //   2596: iushr
    //   2597: ixor
    //   2598: i2b
    //   2599: bastore
    //   2600: aload #46
    //   2602: bipush #14
    //   2604: aload #37
    //   2606: iload #50
    //   2608: bipush #8
    //   2610: iushr
    //   2611: sipush #255
    //   2614: iand
    //   2615: baload
    //   2616: iload #48
    //   2618: bipush #8
    //   2620: iushr
    //   2621: ixor
    //   2622: i2b
    //   2623: bastore
    //   2624: aload #46
    //   2626: bipush #15
    //   2628: aload #37
    //   2630: iload #49
    //   2632: sipush #255
    //   2635: iand
    //   2636: baload
    //   2637: iload #48
    //   2639: ixor
    //   2640: i2b
    //   2641: bastore
    //   2642: iconst_0
    //   2643: istore #53
    //   2645: iload #53
    //   2647: bipush #16
    //   2649: if_icmpge -> 2675
    //   2652: aload #43
    //   2654: iload #53
    //   2656: iload #44
    //   2658: bipush #16
    //   2660: imul
    //   2661: iadd
    //   2662: aload #46
    //   2664: iload #53
    //   2666: baload
    //   2667: bastore
    //   2668: iinc #53, 1
    //   2671: iload_2
    //   2672: ifeq -> 2645
    //   2675: iinc #44, 1
    //   2678: iload_2
    //   2679: ifeq -> 1760
    //   2682: aload #43
    //   2684: arraylength
    //   2685: ifle -> 2766
    //   2688: aload #43
    //   2690: aload #43
    //   2692: arraylength
    //   2693: iconst_1
    //   2694: isub
    //   2695: baload
    //   2696: istore #44
    //   2698: iload #44
    //   2700: bipush #16
    //   2702: if_icmple -> 2713
    //   2705: aload #43
    //   2707: astore #35
    //   2709: iload_2
    //   2710: ifeq -> 2766
    //   2713: aload #43
    //   2715: arraylength
    //   2716: iload #44
    //   2718: isub
    //   2719: newarray byte
    //   2721: astore #35
    //   2723: iconst_0
    //   2724: istore #45
    //   2726: iload #45
    //   2728: aload #35
    //   2730: arraylength
    //   2731: if_icmpge -> 2766
    //   2734: iload #45
    //   2736: aload #43
    //   2738: arraylength
    //   2739: if_icmpge -> 2766
    //   2742: aload #35
    //   2744: iload #45
    //   2746: aload #43
    //   2748: iload #45
    //   2750: baload
    //   2751: bastore
    //   2752: iinc #45, 1
    //   2755: iload_2
    //   2756: ifeq -> 2726
    //   2759: goto -> 2766
    //   2762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2765: athrow
    //   2766: aload #35
    //   2768: astore #7
    //   2770: sipush #5201
    //   2773: new java/math/BigInteger
    //   2776: dup
    //   2777: aload #7
    //   2779: invokespecial <init> : ([B)V
    //   2782: invokevirtual abs : ()Ljava/math/BigInteger;
    //   2785: putstatic burp/Zkca.ZQ : Ljava/lang/Object;
    //   2788: sipush #25366
    //   2791: invokestatic a : (II)Ljava/lang/String;
    //   2794: iconst_1
    //   2795: ldc burp/Zrh1
    //   2797: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2800: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2803: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2806: astore_3
    //   2807: aload_3
    //   2808: arraylength
    //   2809: istore #4
    //   2811: iconst_0
    //   2812: istore #5
    //   2814: iload #5
    //   2816: iload #4
    //   2818: if_icmpge -> 2955
    //   2821: aload_3
    //   2822: iload #5
    //   2824: aaload
    //   2825: astore #6
    //   2827: aload #6
    //   2829: invokevirtual getModifiers : ()I
    //   2832: invokestatic isStatic : (I)Z
    //   2835: ifne -> 2845
    //   2838: goto -> 2948
    //   2841: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2844: athrow
    //   2845: aload #6
    //   2847: invokevirtual getType : ()Ljava/lang/Class;
    //   2850: astore #7
    //   2852: aload #7
    //   2854: ifnull -> 2935
    //   2857: aload #7
    //   2859: invokevirtual isPrimitive : ()Z
    //   2862: ifne -> 2935
    //   2865: goto -> 2872
    //   2868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2871: athrow
    //   2872: aload #7
    //   2874: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2877: ifnull -> 2935
    //   2880: goto -> 2887
    //   2883: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2886: athrow
    //   2887: aload #7
    //   2889: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2892: invokevirtual getName : ()Ljava/lang/String;
    //   2895: ifnull -> 2935
    //   2898: goto -> 2905
    //   2901: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2904: athrow
    //   2905: aload #7
    //   2907: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2910: invokevirtual getName : ()Ljava/lang/String;
    //   2913: sipush #5203
    //   2916: sipush #-8032
    //   2919: invokestatic a : (II)Ljava/lang/String;
    //   2922: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2925: ifne -> 2935
    //   2928: goto -> 2935
    //   2931: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2934: athrow
    //   2935: aload #6
    //   2937: iconst_1
    //   2938: invokevirtual setAccessible : (Z)V
    //   2941: aload #6
    //   2943: aconst_null
    //   2944: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2947: pop
    //   2948: iinc #5, 1
    //   2951: iload_2
    //   2952: ifeq -> 2814
    //   2955: sipush #5202
    //   2958: sipush #-23893
    //   2961: invokestatic a : (II)Ljava/lang/String;
    //   2964: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2967: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2970: astore_3
    //   2971: aload_3
    //   2972: arraylength
    //   2973: istore #4
    //   2975: iconst_0
    //   2976: istore #5
    //   2978: iload #5
    //   2980: iload #4
    //   2982: if_icmpge -> 3114
    //   2985: aload_3
    //   2986: iload #5
    //   2988: aaload
    //   2989: astore #6
    //   2991: aload #6
    //   2993: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2996: pop
    //   2997: aload #6
    //   2999: invokevirtual getModifiers : ()I
    //   3002: invokestatic isStatic : (I)Z
    //   3005: ifeq -> 3100
    //   3008: aload #6
    //   3010: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3013: arraylength
    //   3014: iconst_2
    //   3015: if_icmpne -> 3100
    //   3018: goto -> 3025
    //   3021: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3024: athrow
    //   3025: aload #6
    //   3027: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3030: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   3033: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3036: ifeq -> 3100
    //   3039: goto -> 3046
    //   3042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3045: athrow
    //   3046: aload #6
    //   3048: iconst_1
    //   3049: invokevirtual setAccessible : (Z)V
    //   3052: aload #6
    //   3054: aconst_null
    //   3055: iconst_2
    //   3056: anewarray java/lang/Object
    //   3059: dup
    //   3060: iconst_0
    //   3061: aload_0
    //   3062: aastore
    //   3063: dup
    //   3064: iconst_1
    //   3065: aload_1
    //   3066: ifnonnull -> 3084
    //   3069: goto -> 3076
    //   3072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3075: athrow
    //   3076: aload_1
    //   3077: goto -> 3091
    //   3080: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3083: athrow
    //   3084: aload_1
    //   3085: checkcast [B
    //   3088: invokevirtual clone : ()Ljava/lang/Object;
    //   3091: aastore
    //   3092: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3095: pop
    //   3096: iload_2
    //   3097: ifeq -> 3114
    //   3100: iinc #5, 1
    //   3103: iload_2
    //   3104: ifeq -> 2978
    //   3107: goto -> 3114
    //   3110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3113: athrow
    //   3114: getstatic burp/Zg7e.Zg : Ljava/lang/String;
    //   3117: getstatic burp/Zgtd.Zo : Ljava/lang/Object;
    //   3120: checkcast java/math/BigInteger
    //   3123: invokevirtual intValue : ()I
    //   3126: bipush #32
    //   3128: irem
    //   3129: invokestatic abs : (I)I
    //   3132: invokevirtual charAt : (I)C
    //   3135: getstatic burp/Zrtp.Zq : Ljava/lang/String;
    //   3138: getstatic burp/Ztzj.Zv : Ljava/lang/Object;
    //   3141: checkcast java/math/BigInteger
    //   3144: invokevirtual intValue : ()I
    //   3147: bipush #32
    //   3149: irem
    //   3150: invokestatic abs : (I)I
    //   3153: invokevirtual charAt : (I)C
    //   3156: if_icmpgt -> 3263
    //   3159: getstatic burp/Zlsg.Zs : Ljava/lang/String;
    //   3162: getstatic burp/Zxn9.ZN : Ljava/lang/Object;
    //   3165: checkcast java/math/BigInteger
    //   3168: invokevirtual intValue : ()I
    //   3171: bipush #32
    //   3173: irem
    //   3174: invokestatic abs : (I)I
    //   3177: invokevirtual charAt : (I)C
    //   3180: getstatic burp/Zttd.Ze : Ljava/lang/String;
    //   3183: getstatic burp/Zt0m.Zt : Ljava/lang/Object;
    //   3186: checkcast java/math/BigInteger
    //   3189: invokevirtual intValue : ()I
    //   3192: bipush #32
    //   3194: irem
    //   3195: invokestatic abs : (I)I
    //   3198: invokevirtual charAt : (I)C
    //   3201: if_icmple -> 3263
    //   3204: goto -> 3211
    //   3207: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3210: athrow
    //   3211: getstatic burp/Ze4w.Zc : Ljava/lang/String;
    //   3214: getstatic burp/Zr9u.ZX : Ljava/lang/Object;
    //   3217: checkcast java/math/BigInteger
    //   3220: invokevirtual intValue : ()I
    //   3223: bipush #32
    //   3225: irem
    //   3226: invokestatic abs : (I)I
    //   3229: invokevirtual charAt : (I)C
    //   3232: getstatic burp/Zb2n.Za : Ljava/lang/String;
    //   3235: getstatic burp/Zb2n.ZR : Ljava/lang/Object;
    //   3238: checkcast java/math/BigInteger
    //   3241: invokevirtual intValue : ()I
    //   3244: bipush #32
    //   3246: irem
    //   3247: invokestatic abs : (I)I
    //   3250: invokevirtual charAt : (I)C
    //   3253: if_icmple -> 3271
    //   3256: goto -> 3263
    //   3259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3262: athrow
    //   3263: iconst_1
    //   3264: goto -> 3272
    //   3267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3270: athrow
    //   3271: iconst_0
    //   3272: ireturn
    //   3273: astore_3
    //   3274: new java/lang/Exception
    //   3277: dup
    //   3278: aload_3
    //   3279: invokevirtual getMessage : ()Ljava/lang/String;
    //   3282: invokespecial <init> : (Ljava/lang/String;)V
    //   3285: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3272	3273	java/lang/Throwable
    //   413	428	428	java/lang/Throwable
    //   1430	1456	1456	java/lang/Throwable
    //   1537	1552	1552	java/lang/Throwable
    //   2734	2759	2762	java/lang/Throwable
    //   2827	2841	2841	java/lang/Throwable
    //   2852	2865	2868	java/lang/Throwable
    //   2857	2880	2883	java/lang/Throwable
    //   2872	2898	2901	java/lang/Throwable
    //   2887	2928	2931	java/lang/Throwable
    //   2991	3018	3021	java/lang/Throwable
    //   3008	3039	3042	java/lang/Throwable
    //   3025	3069	3072	java/lang/Throwable
    //   3046	3080	3080	java/lang/Throwable
    //   3091	3107	3110	java/lang/Throwable
    //   3114	3204	3207	java/lang/Throwable
    //   3159	3256	3259	java/lang/Throwable
    //   3211	3267	3267	java/lang/Throwable
  }
  
  static void Zz(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'É\ S7ò0LÅãßW&7¥¤&xúß$}p_i揲瞉濥ぱ枬ﺹ꬙쫳줹﫰䝐귾ꈪ鲁犴뜢鍭㙬㒑熐ㄐГ⌣ᢍԤݓ胄뉖्ⱍ᭕嫤剙홄⦑⾜区⃤넁櫫븬䫖堒킑꨻䌆㎹䗘Ȩ傧齜兘䃒銞㣔밞?ွ췀ግ弇䒒쑤绻搶᧽恮佻∃郦䚀룥?ମ㨺䤸␱슦곸鄷㟔跮乇沏攒껂멉┞᱌뒅璴䮱讦灣뗝䣽懬圻蚉ᴖ飵楱踜鮇蜪츙⣺谖覩뾴䊤䅳⶟뀤뭠MaÃÔRÁ)U×¬axºål0þÊ¹æRhiL-D \\t½cì\\nPaåëÏ^ièê­­>Gy&[6hFµ¤\\f²Û<\\tB_÷¬\\tó¼ý9øEï:Î\\t­ 6º5À4+5ç:-mZ¯»¼_P j¼(çµùS¬ÎUM¤¾p¹¦á¶Íuõ÷'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #105
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
    //   68: ldc 'VQÚôj揺睼漄ュ柏ﹴꬪ쨕준侀䜨귑ꉺ鰻狡뜪鎘㘲㐅煝ㄣӵ⌚᠎՜ݼ肔눃ॅⲸᬋ娅勍혧⥜⾯叜2⁧녹櫄빼䩬塇킙꫎䍘㍘䕌ɋ偪齯冾䃫鈝㢬백?ႇ췈ᏸ彙䑳쓰纘擻᧎悈佂⊀邞䚯뢵?୻㫏䥦ⓐ숲겛釺㟭赭丿沠斨꺗멁◫ᰒ둤瓗䭼讕炅뗤䡾懃坫蘳ᵃ頀椯軽鬓蝉컔⣉賰覐뼷䋜䅜⷏낞묵'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #24
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
    //   129: putstatic burp/Zz4m.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zz4m.b : [Ljava/lang/String;
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
    //   212: bipush #20
    //   214: goto -> 244
    //   217: bipush #67
    //   219: goto -> 244
    //   222: bipush #25
    //   224: goto -> 244
    //   227: bipush #41
    //   229: goto -> 244
    //   232: bipush #50
    //   234: goto -> 244
    //   237: bipush #39
    //   239: goto -> 244
    //   242: bipush #99
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
    //   300: sipush #5207
    //   303: sipush #-914
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zz4m.ZI : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #104
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #13
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: iconst_m1
    //   333: bastore
    //   334: dup
    //   335: iconst_3
    //   336: bipush #75
    //   338: bastore
    //   339: dup
    //   340: iconst_4
    //   341: bipush #98
    //   343: bastore
    //   344: dup
    //   345: iconst_5
    //   346: bipush #-16
    //   348: bastore
    //   349: dup
    //   350: bipush #6
    //   352: bipush #-42
    //   354: bastore
    //   355: dup
    //   356: bipush #7
    //   358: bipush #-51
    //   360: bastore
    //   361: dup
    //   362: bipush #8
    //   364: bipush #-8
    //   366: bastore
    //   367: dup
    //   368: bipush #9
    //   370: bipush #74
    //   372: bastore
    //   373: dup
    //   374: bipush #10
    //   376: bipush #-111
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: bipush #-103
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #-40
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #-18
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #-106
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: bipush #-112
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #-30
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #13
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #-121
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #-112
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #46
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #-64
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #106
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #27
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #126
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #94
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #-44
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #50
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #99
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #-121
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #76
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #-117
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zz4m.Zo : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1457) & 0xFFFF;
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
      byte b1 = 121;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz4m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */