package burp;

import java.math.BigInteger;

class Zgis extends ClassLoader {
  static Object ZV;
  
  static String Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zi(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZB(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Ze8j.ZQ : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zsfj.ZL : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ztq4.ZA : Ljava/lang/Object;
    //   22: getstatic burp/Zl_a.ZP : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_3
    //   32: iconst_0
    //   33: istore #5
    //   35: iconst_0
    //   36: istore #6
    //   38: iload #6
    //   40: aload_3
    //   41: arraylength
    //   42: if_icmpge -> 187
    //   45: aload_3
    //   46: iload #6
    //   48: baload
    //   49: istore #7
    //   51: iload #7
    //   53: bipush #48
    //   55: if_icmplt -> 72
    //   58: iload #7
    //   60: bipush #57
    //   62: if_icmple -> 170
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   71: athrow
    //   72: iload #7
    //   74: bipush #65
    //   76: if_icmplt -> 100
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   85: athrow
    //   86: iload #7
    //   88: bipush #90
    //   90: if_icmple -> 170
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   99: athrow
    //   100: iload #7
    //   102: bipush #97
    //   104: if_icmplt -> 128
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   113: athrow
    //   114: iload #7
    //   116: bipush #122
    //   118: if_icmple -> 170
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   127: athrow
    //   128: iload #7
    //   130: bipush #43
    //   132: if_icmpeq -> 170
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: iload #7
    //   144: bipush #47
    //   146: if_icmpeq -> 170
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   155: athrow
    //   156: iload #7
    //   158: bipush #61
    //   160: if_icmpne -> 180
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   169: athrow
    //   170: iinc #5, 1
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   179: athrow
    //   180: iinc #6, 1
    //   183: iload_2
    //   184: ifeq -> 38
    //   187: iload #5
    //   189: newarray byte
    //   191: astore #6
    //   193: iconst_0
    //   194: istore #7
    //   196: iconst_0
    //   197: istore #8
    //   199: iload #8
    //   201: aload_3
    //   202: arraylength
    //   203: if_icmpge -> 355
    //   206: aload_3
    //   207: iload #8
    //   209: baload
    //   210: istore #9
    //   212: iload #9
    //   214: bipush #48
    //   216: if_icmplt -> 233
    //   219: iload #9
    //   221: bipush #57
    //   223: if_icmple -> 331
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   232: athrow
    //   233: iload #9
    //   235: bipush #65
    //   237: if_icmplt -> 261
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   246: athrow
    //   247: iload #9
    //   249: bipush #90
    //   251: if_icmple -> 331
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   260: athrow
    //   261: iload #9
    //   263: bipush #97
    //   265: if_icmplt -> 289
    //   268: goto -> 275
    //   271: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   274: athrow
    //   275: iload #9
    //   277: bipush #122
    //   279: if_icmple -> 331
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   288: athrow
    //   289: iload #9
    //   291: bipush #43
    //   293: if_icmpeq -> 331
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   302: athrow
    //   303: iload #9
    //   305: bipush #47
    //   307: if_icmpeq -> 331
    //   310: goto -> 317
    //   313: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   316: athrow
    //   317: iload #9
    //   319: bipush #61
    //   321: if_icmpne -> 348
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   330: athrow
    //   331: aload #6
    //   333: iload #7
    //   335: iload #9
    //   337: bastore
    //   338: iinc #7, 1
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   347: athrow
    //   348: iinc #8, 1
    //   351: iload_2
    //   352: ifeq -> 199
    //   355: aload #6
    //   357: astore #4
    //   359: aload #4
    //   361: astore_3
    //   362: aload_3
    //   363: arraylength
    //   364: istore #5
    //   366: aload_3
    //   367: iload #5
    //   369: iconst_1
    //   370: isub
    //   371: baload
    //   372: bipush #61
    //   374: if_icmpne -> 384
    //   377: iinc #5, -1
    //   380: iload_2
    //   381: ifeq -> 366
    //   384: iload #5
    //   386: aload_3
    //   387: arraylength
    //   388: iconst_4
    //   389: idiv
    //   390: isub
    //   391: newarray byte
    //   393: astore #6
    //   395: iconst_0
    //   396: istore #7
    //   398: iload #7
    //   400: aload_3
    //   401: arraylength
    //   402: if_icmpge -> 664
    //   405: aload_3
    //   406: iload #7
    //   408: baload
    //   409: bipush #61
    //   411: if_icmpne -> 430
    //   414: aload_3
    //   415: iload #7
    //   417: iconst_0
    //   418: bastore
    //   419: iload_2
    //   420: ifeq -> 657
    //   423: goto -> 430
    //   426: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   429: athrow
    //   430: aload_3
    //   431: iload #7
    //   433: baload
    //   434: bipush #47
    //   436: if_icmpne -> 463
    //   439: goto -> 446
    //   442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   445: athrow
    //   446: aload_3
    //   447: iload #7
    //   449: bipush #63
    //   451: bastore
    //   452: iload_2
    //   453: ifeq -> 657
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   462: athrow
    //   463: aload_3
    //   464: iload #7
    //   466: baload
    //   467: bipush #43
    //   469: if_icmpne -> 496
    //   472: goto -> 479
    //   475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   478: athrow
    //   479: aload_3
    //   480: iload #7
    //   482: bipush #62
    //   484: bastore
    //   485: iload_2
    //   486: ifeq -> 657
    //   489: goto -> 496
    //   492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   495: athrow
    //   496: aload_3
    //   497: iload #7
    //   499: baload
    //   500: bipush #48
    //   502: if_icmplt -> 551
    //   505: goto -> 512
    //   508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   511: athrow
    //   512: aload_3
    //   513: iload #7
    //   515: baload
    //   516: bipush #57
    //   518: if_icmpgt -> 551
    //   521: goto -> 528
    //   524: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   527: athrow
    //   528: aload_3
    //   529: iload #7
    //   531: aload_3
    //   532: iload #7
    //   534: baload
    //   535: bipush #-4
    //   537: isub
    //   538: i2b
    //   539: bastore
    //   540: iload_2
    //   541: ifeq -> 657
    //   544: goto -> 551
    //   547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   550: athrow
    //   551: aload_3
    //   552: iload #7
    //   554: baload
    //   555: bipush #97
    //   557: if_icmplt -> 606
    //   560: goto -> 567
    //   563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   566: athrow
    //   567: aload_3
    //   568: iload #7
    //   570: baload
    //   571: bipush #122
    //   573: if_icmpgt -> 606
    //   576: goto -> 583
    //   579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   582: athrow
    //   583: aload_3
    //   584: iload #7
    //   586: aload_3
    //   587: iload #7
    //   589: baload
    //   590: bipush #71
    //   592: isub
    //   593: i2b
    //   594: bastore
    //   595: iload_2
    //   596: ifeq -> 657
    //   599: goto -> 606
    //   602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   605: athrow
    //   606: aload_3
    //   607: iload #7
    //   609: baload
    //   610: bipush #65
    //   612: if_icmplt -> 657
    //   615: goto -> 622
    //   618: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   621: athrow
    //   622: aload_3
    //   623: iload #7
    //   625: baload
    //   626: bipush #90
    //   628: if_icmpgt -> 657
    //   631: goto -> 638
    //   634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   637: athrow
    //   638: aload_3
    //   639: iload #7
    //   641: aload_3
    //   642: iload #7
    //   644: baload
    //   645: bipush #65
    //   647: isub
    //   648: i2b
    //   649: bastore
    //   650: goto -> 657
    //   653: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   656: athrow
    //   657: iinc #7, 1
    //   660: iload_2
    //   661: ifeq -> 398
    //   664: iconst_0
    //   665: istore #7
    //   667: iconst_0
    //   668: istore #8
    //   670: iload #8
    //   672: aload #6
    //   674: arraylength
    //   675: iconst_2
    //   676: isub
    //   677: if_icmpge -> 780
    //   680: aload #6
    //   682: iload #8
    //   684: aload_3
    //   685: iload #7
    //   687: baload
    //   688: iconst_2
    //   689: ishl
    //   690: sipush #255
    //   693: iand
    //   694: aload_3
    //   695: iload #7
    //   697: iconst_1
    //   698: iadd
    //   699: baload
    //   700: iconst_4
    //   701: iushr
    //   702: iconst_3
    //   703: iand
    //   704: ior
    //   705: i2b
    //   706: bastore
    //   707: aload #6
    //   709: iload #8
    //   711: iconst_1
    //   712: iadd
    //   713: aload_3
    //   714: iload #7
    //   716: iconst_1
    //   717: iadd
    //   718: baload
    //   719: iconst_4
    //   720: ishl
    //   721: sipush #255
    //   724: iand
    //   725: aload_3
    //   726: iload #7
    //   728: iconst_2
    //   729: iadd
    //   730: baload
    //   731: iconst_2
    //   732: iushr
    //   733: bipush #15
    //   735: iand
    //   736: ior
    //   737: i2b
    //   738: bastore
    //   739: aload #6
    //   741: iload #8
    //   743: iconst_2
    //   744: iadd
    //   745: aload_3
    //   746: iload #7
    //   748: iconst_2
    //   749: iadd
    //   750: baload
    //   751: bipush #6
    //   753: ishl
    //   754: sipush #255
    //   757: iand
    //   758: aload_3
    //   759: iload #7
    //   761: iconst_3
    //   762: iadd
    //   763: baload
    //   764: bipush #63
    //   766: iand
    //   767: ior
    //   768: i2b
    //   769: bastore
    //   770: iinc #7, 4
    //   773: iinc #8, 3
    //   776: iload_2
    //   777: ifeq -> 670
    //   780: iload #8
    //   782: aload #6
    //   784: arraylength
    //   785: if_icmpge -> 822
    //   788: aload #6
    //   790: iload #8
    //   792: aload_3
    //   793: iload #7
    //   795: baload
    //   796: iconst_2
    //   797: ishl
    //   798: sipush #255
    //   801: iand
    //   802: aload_3
    //   803: iload #7
    //   805: iconst_1
    //   806: iadd
    //   807: baload
    //   808: iconst_4
    //   809: iushr
    //   810: iconst_3
    //   811: iand
    //   812: ior
    //   813: i2b
    //   814: bastore
    //   815: goto -> 822
    //   818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   821: athrow
    //   822: iinc #8, 1
    //   825: iload #8
    //   827: aload #6
    //   829: arraylength
    //   830: if_icmpge -> 870
    //   833: aload #6
    //   835: iload #8
    //   837: aload_3
    //   838: iload #7
    //   840: iconst_1
    //   841: iadd
    //   842: baload
    //   843: iconst_4
    //   844: ishl
    //   845: sipush #255
    //   848: iand
    //   849: aload_3
    //   850: iload #7
    //   852: iconst_2
    //   853: iadd
    //   854: baload
    //   855: iconst_2
    //   856: iushr
    //   857: bipush #15
    //   859: iand
    //   860: ior
    //   861: i2b
    //   862: bastore
    //   863: goto -> 870
    //   866: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   869: athrow
    //   870: aload #6
    //   872: astore #4
    //   874: new java/math/BigInteger
    //   877: dup
    //   878: aload #4
    //   880: invokespecial <init> : ([B)V
    //   883: invokevirtual abs : ()Ljava/math/BigInteger;
    //   886: putstatic burp/Zld9.ZF : Ljava/lang/Object;
    //   889: new java/lang/StringBuilder
    //   892: dup
    //   893: invokespecial <init> : ()V
    //   896: astore_3
    //   897: iconst_0
    //   898: istore #4
    //   900: iload #4
    //   902: bipush #32
    //   904: if_icmpge -> 2239
    //   907: iload #4
    //   909: tableswitch default -> 2232, 0 -> 1052, 1 -> 1089, 2 -> 1126, 3 -> 1163, 4 -> 1200, 5 -> 1237, 6 -> 1274, 7 -> 1311, 8 -> 1348, 9 -> 1385, 10 -> 1422, 11 -> 1459, 12 -> 1496, 13 -> 1533, 14 -> 1570, 15 -> 1607, 16 -> 1644, 17 -> 1681, 18 -> 1718, 19 -> 1755, 20 -> 1792, 21 -> 1829, 22 -> 1866, 23 -> 1903, 24 -> 1940, 25 -> 1977, 26 -> 2014, 27 -> 2051, 28 -> 2088, 29 -> 2125, 30 -> 2162, 31 -> 2199
    //   1052: aload_3
    //   1053: getstatic burp/Zs1d.Zl : Ljava/lang/String;
    //   1056: getstatic burp/Zr2q.ZS : Ljava/lang/Object;
    //   1059: checkcast java/math/BigInteger
    //   1062: invokevirtual intValue : ()I
    //   1065: bipush #32
    //   1067: irem
    //   1068: invokestatic abs : (I)I
    //   1071: invokevirtual charAt : (I)C
    //   1074: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1077: pop
    //   1078: iload_2
    //   1079: ifeq -> 2232
    //   1082: goto -> 1089
    //   1085: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1088: athrow
    //   1089: aload_3
    //   1090: getstatic burp/Zbss.ZV : Ljava/lang/String;
    //   1093: getstatic burp/Zs3m.ZW : Ljava/lang/Object;
    //   1096: checkcast java/math/BigInteger
    //   1099: invokevirtual intValue : ()I
    //   1102: bipush #32
    //   1104: irem
    //   1105: invokestatic abs : (I)I
    //   1108: invokevirtual charAt : (I)C
    //   1111: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1114: pop
    //   1115: iload_2
    //   1116: ifeq -> 2232
    //   1119: goto -> 1126
    //   1122: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1125: athrow
    //   1126: aload_3
    //   1127: getstatic burp/Zz66.ZM : Ljava/lang/String;
    //   1130: getstatic burp/Zg61.Zp : Ljava/lang/Object;
    //   1133: checkcast java/math/BigInteger
    //   1136: invokevirtual intValue : ()I
    //   1139: bipush #32
    //   1141: irem
    //   1142: invokestatic abs : (I)I
    //   1145: invokevirtual charAt : (I)C
    //   1148: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1151: pop
    //   1152: iload_2
    //   1153: ifeq -> 2232
    //   1156: goto -> 1163
    //   1159: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1162: athrow
    //   1163: aload_3
    //   1164: getstatic burp/Zer1.ZV : Ljava/lang/String;
    //   1167: getstatic burp/Zzl4.ZX : Ljava/lang/Object;
    //   1170: checkcast java/math/BigInteger
    //   1173: invokevirtual intValue : ()I
    //   1176: bipush #32
    //   1178: irem
    //   1179: invokestatic abs : (I)I
    //   1182: invokevirtual charAt : (I)C
    //   1185: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1188: pop
    //   1189: iload_2
    //   1190: ifeq -> 2232
    //   1193: goto -> 1200
    //   1196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1199: athrow
    //   1200: aload_3
    //   1201: getstatic burp/Zzna.Zi : Ljava/lang/String;
    //   1204: getstatic burp/Zmf6.ZD : Ljava/lang/Object;
    //   1207: checkcast java/math/BigInteger
    //   1210: invokevirtual intValue : ()I
    //   1213: bipush #32
    //   1215: irem
    //   1216: invokestatic abs : (I)I
    //   1219: invokevirtual charAt : (I)C
    //   1222: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1225: pop
    //   1226: iload_2
    //   1227: ifeq -> 2232
    //   1230: goto -> 1237
    //   1233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1236: athrow
    //   1237: aload_3
    //   1238: getstatic burp/Zskf.ZV : Ljava/lang/String;
    //   1241: getstatic burp/Zspg.ZJ : Ljava/lang/Object;
    //   1244: checkcast java/math/BigInteger
    //   1247: invokevirtual intValue : ()I
    //   1250: bipush #32
    //   1252: irem
    //   1253: invokestatic abs : (I)I
    //   1256: invokevirtual charAt : (I)C
    //   1259: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1262: pop
    //   1263: iload_2
    //   1264: ifeq -> 2232
    //   1267: goto -> 1274
    //   1270: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1273: athrow
    //   1274: aload_3
    //   1275: getstatic burp/Zetf.Zo : Ljava/lang/String;
    //   1278: getstatic burp/Ztlo.ZP : Ljava/lang/Object;
    //   1281: checkcast java/math/BigInteger
    //   1284: invokevirtual intValue : ()I
    //   1287: bipush #32
    //   1289: irem
    //   1290: invokestatic abs : (I)I
    //   1293: invokevirtual charAt : (I)C
    //   1296: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1299: pop
    //   1300: iload_2
    //   1301: ifeq -> 2232
    //   1304: goto -> 1311
    //   1307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1310: athrow
    //   1311: aload_3
    //   1312: getstatic burp/Zmlr.ZJ : Ljava/lang/String;
    //   1315: getstatic burp/Zlg2.ZO : Ljava/lang/Object;
    //   1318: checkcast java/math/BigInteger
    //   1321: invokevirtual intValue : ()I
    //   1324: bipush #32
    //   1326: irem
    //   1327: invokestatic abs : (I)I
    //   1330: invokevirtual charAt : (I)C
    //   1333: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1336: pop
    //   1337: iload_2
    //   1338: ifeq -> 2232
    //   1341: goto -> 1348
    //   1344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1347: athrow
    //   1348: aload_3
    //   1349: getstatic burp/Zmdf.Zo : Ljava/lang/String;
    //   1352: getstatic burp/Ztvg.ZO : Ljava/lang/Object;
    //   1355: checkcast java/math/BigInteger
    //   1358: invokevirtual intValue : ()I
    //   1361: bipush #32
    //   1363: irem
    //   1364: invokestatic abs : (I)I
    //   1367: invokevirtual charAt : (I)C
    //   1370: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1373: pop
    //   1374: iload_2
    //   1375: ifeq -> 2232
    //   1378: goto -> 1385
    //   1381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1384: athrow
    //   1385: aload_3
    //   1386: getstatic burp/Zlt1.ZA : Ljava/lang/String;
    //   1389: getstatic burp/Ztq8.Zm : Ljava/lang/Object;
    //   1392: checkcast java/math/BigInteger
    //   1395: invokevirtual intValue : ()I
    //   1398: bipush #32
    //   1400: irem
    //   1401: invokestatic abs : (I)I
    //   1404: invokevirtual charAt : (I)C
    //   1407: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1410: pop
    //   1411: iload_2
    //   1412: ifeq -> 2232
    //   1415: goto -> 1422
    //   1418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1421: athrow
    //   1422: aload_3
    //   1423: getstatic burp/Zt4p.ZL : Ljava/lang/String;
    //   1426: getstatic burp/Zmf6.ZD : Ljava/lang/Object;
    //   1429: checkcast java/math/BigInteger
    //   1432: invokevirtual intValue : ()I
    //   1435: bipush #32
    //   1437: irem
    //   1438: invokestatic abs : (I)I
    //   1441: invokevirtual charAt : (I)C
    //   1444: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1447: pop
    //   1448: iload_2
    //   1449: ifeq -> 2232
    //   1452: goto -> 1459
    //   1455: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1458: athrow
    //   1459: aload_3
    //   1460: getstatic burp/Zxwf.ZX : Ljava/lang/String;
    //   1463: getstatic burp/Zsbv.Zl : Ljava/lang/Object;
    //   1466: checkcast java/math/BigInteger
    //   1469: invokevirtual intValue : ()I
    //   1472: bipush #32
    //   1474: irem
    //   1475: invokestatic abs : (I)I
    //   1478: invokevirtual charAt : (I)C
    //   1481: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1484: pop
    //   1485: iload_2
    //   1486: ifeq -> 2232
    //   1489: goto -> 1496
    //   1492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1495: athrow
    //   1496: aload_3
    //   1497: getstatic burp/Ze4a.Zm : Ljava/lang/String;
    //   1500: getstatic burp/Zkjj.Zh : Ljava/lang/Object;
    //   1503: checkcast java/math/BigInteger
    //   1506: invokevirtual intValue : ()I
    //   1509: bipush #32
    //   1511: irem
    //   1512: invokestatic abs : (I)I
    //   1515: invokevirtual charAt : (I)C
    //   1518: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1521: pop
    //   1522: iload_2
    //   1523: ifeq -> 2232
    //   1526: goto -> 1533
    //   1529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1532: athrow
    //   1533: aload_3
    //   1534: getstatic burp/Zzl4.ZT : Ljava/lang/String;
    //   1537: getstatic burp/Zm63.ZT : Ljava/lang/Object;
    //   1540: checkcast java/math/BigInteger
    //   1543: invokevirtual intValue : ()I
    //   1546: bipush #32
    //   1548: irem
    //   1549: invokestatic abs : (I)I
    //   1552: invokevirtual charAt : (I)C
    //   1555: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1558: pop
    //   1559: iload_2
    //   1560: ifeq -> 2232
    //   1563: goto -> 1570
    //   1566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1569: athrow
    //   1570: aload_3
    //   1571: getstatic burp/Zsfg.Zh : Ljava/lang/String;
    //   1574: getstatic burp/Zrkw.ZV : Ljava/lang/Object;
    //   1577: checkcast java/math/BigInteger
    //   1580: invokevirtual intValue : ()I
    //   1583: bipush #32
    //   1585: irem
    //   1586: invokestatic abs : (I)I
    //   1589: invokevirtual charAt : (I)C
    //   1592: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1595: pop
    //   1596: iload_2
    //   1597: ifeq -> 2232
    //   1600: goto -> 1607
    //   1603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1606: athrow
    //   1607: aload_3
    //   1608: getstatic burp/Zl3j.Zr : Ljava/lang/String;
    //   1611: getstatic burp/Zxp1.ZP : Ljava/lang/Object;
    //   1614: checkcast java/math/BigInteger
    //   1617: invokevirtual intValue : ()I
    //   1620: bipush #32
    //   1622: irem
    //   1623: invokestatic abs : (I)I
    //   1626: invokevirtual charAt : (I)C
    //   1629: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1632: pop
    //   1633: iload_2
    //   1634: ifeq -> 2232
    //   1637: goto -> 1644
    //   1640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1643: athrow
    //   1644: aload_3
    //   1645: getstatic burp/Zea.Zj : Ljava/lang/String;
    //   1648: getstatic burp/Zx4u.Zn : Ljava/lang/Object;
    //   1651: checkcast java/math/BigInteger
    //   1654: invokevirtual intValue : ()I
    //   1657: bipush #32
    //   1659: irem
    //   1660: invokestatic abs : (I)I
    //   1663: invokevirtual charAt : (I)C
    //   1666: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1669: pop
    //   1670: iload_2
    //   1671: ifeq -> 2232
    //   1674: goto -> 1681
    //   1677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1680: athrow
    //   1681: aload_3
    //   1682: getstatic burp/Zg0f.Zd : Ljava/lang/String;
    //   1685: getstatic burp/Zr_x.Zd : Ljava/lang/Object;
    //   1688: checkcast java/math/BigInteger
    //   1691: invokevirtual intValue : ()I
    //   1694: bipush #32
    //   1696: irem
    //   1697: invokestatic abs : (I)I
    //   1700: invokevirtual charAt : (I)C
    //   1703: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1706: pop
    //   1707: iload_2
    //   1708: ifeq -> 2232
    //   1711: goto -> 1718
    //   1714: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1717: athrow
    //   1718: aload_3
    //   1719: getstatic burp/Zzht.Zv : Ljava/lang/String;
    //   1722: getstatic burp/Zl_f.ZI : Ljava/lang/Object;
    //   1725: checkcast java/math/BigInteger
    //   1728: invokevirtual intValue : ()I
    //   1731: bipush #32
    //   1733: irem
    //   1734: invokestatic abs : (I)I
    //   1737: invokevirtual charAt : (I)C
    //   1740: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1743: pop
    //   1744: iload_2
    //   1745: ifeq -> 2232
    //   1748: goto -> 1755
    //   1751: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1754: athrow
    //   1755: aload_3
    //   1756: getstatic burp/Zbss.ZV : Ljava/lang/String;
    //   1759: getstatic burp/Zxc0.Zl : Ljava/lang/Object;
    //   1762: checkcast java/math/BigInteger
    //   1765: invokevirtual intValue : ()I
    //   1768: bipush #32
    //   1770: irem
    //   1771: invokestatic abs : (I)I
    //   1774: invokevirtual charAt : (I)C
    //   1777: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1780: pop
    //   1781: iload_2
    //   1782: ifeq -> 2232
    //   1785: goto -> 1792
    //   1788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1791: athrow
    //   1792: aload_3
    //   1793: getstatic burp/Zbow.Zr : Ljava/lang/String;
    //   1796: getstatic burp/Zmf2.Zx : Ljava/lang/Object;
    //   1799: checkcast java/math/BigInteger
    //   1802: invokevirtual intValue : ()I
    //   1805: bipush #32
    //   1807: irem
    //   1808: invokestatic abs : (I)I
    //   1811: invokevirtual charAt : (I)C
    //   1814: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1817: pop
    //   1818: iload_2
    //   1819: ifeq -> 2232
    //   1822: goto -> 1829
    //   1825: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1828: athrow
    //   1829: aload_3
    //   1830: getstatic burp/Zkhf.Zb : Ljava/lang/String;
    //   1833: getstatic burp/Zscz.ZN : Ljava/lang/Object;
    //   1836: checkcast java/math/BigInteger
    //   1839: invokevirtual intValue : ()I
    //   1842: bipush #32
    //   1844: irem
    //   1845: invokestatic abs : (I)I
    //   1848: invokevirtual charAt : (I)C
    //   1851: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1854: pop
    //   1855: iload_2
    //   1856: ifeq -> 2232
    //   1859: goto -> 1866
    //   1862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1865: athrow
    //   1866: aload_3
    //   1867: getstatic burp/Zzc9.Zv : Ljava/lang/String;
    //   1870: getstatic burp/Zmz.ZW : Ljava/lang/Object;
    //   1873: checkcast java/math/BigInteger
    //   1876: invokevirtual intValue : ()I
    //   1879: bipush #32
    //   1881: irem
    //   1882: invokestatic abs : (I)I
    //   1885: invokevirtual charAt : (I)C
    //   1888: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1891: pop
    //   1892: iload_2
    //   1893: ifeq -> 2232
    //   1896: goto -> 1903
    //   1899: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1902: athrow
    //   1903: aload_3
    //   1904: getstatic burp/Zsko.Zd : Ljava/lang/String;
    //   1907: getstatic burp/Zl1e.Zp : Ljava/lang/Object;
    //   1910: checkcast java/math/BigInteger
    //   1913: invokevirtual intValue : ()I
    //   1916: bipush #32
    //   1918: irem
    //   1919: invokestatic abs : (I)I
    //   1922: invokevirtual charAt : (I)C
    //   1925: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1928: pop
    //   1929: iload_2
    //   1930: ifeq -> 2232
    //   1933: goto -> 1940
    //   1936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1939: athrow
    //   1940: aload_3
    //   1941: getstatic burp/Zzht.Zv : Ljava/lang/String;
    //   1944: getstatic burp/Zs0h.ZU : Ljava/lang/Object;
    //   1947: checkcast java/math/BigInteger
    //   1950: invokevirtual intValue : ()I
    //   1953: bipush #32
    //   1955: irem
    //   1956: invokestatic abs : (I)I
    //   1959: invokevirtual charAt : (I)C
    //   1962: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1965: pop
    //   1966: iload_2
    //   1967: ifeq -> 2232
    //   1970: goto -> 1977
    //   1973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1976: athrow
    //   1977: aload_3
    //   1978: getstatic burp/Zxp5.ZO : Ljava/lang/String;
    //   1981: getstatic burp/Zb0q.ZK : Ljava/lang/Object;
    //   1984: checkcast java/math/BigInteger
    //   1987: invokevirtual intValue : ()I
    //   1990: bipush #32
    //   1992: irem
    //   1993: invokestatic abs : (I)I
    //   1996: invokevirtual charAt : (I)C
    //   1999: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2002: pop
    //   2003: iload_2
    //   2004: ifeq -> 2232
    //   2007: goto -> 2014
    //   2010: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2013: athrow
    //   2014: aload_3
    //   2015: getstatic burp/Zxp5.ZO : Ljava/lang/String;
    //   2018: getstatic burp/Ztq8.Zm : Ljava/lang/Object;
    //   2021: checkcast java/math/BigInteger
    //   2024: invokevirtual intValue : ()I
    //   2027: bipush #32
    //   2029: irem
    //   2030: invokestatic abs : (I)I
    //   2033: invokevirtual charAt : (I)C
    //   2036: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2039: pop
    //   2040: iload_2
    //   2041: ifeq -> 2232
    //   2044: goto -> 2051
    //   2047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2050: athrow
    //   2051: aload_3
    //   2052: getstatic burp/Zllk.Zs : Ljava/lang/String;
    //   2055: getstatic burp/Zgeq.ZT : Ljava/lang/Object;
    //   2058: checkcast java/math/BigInteger
    //   2061: invokevirtual intValue : ()I
    //   2064: bipush #32
    //   2066: irem
    //   2067: invokestatic abs : (I)I
    //   2070: invokevirtual charAt : (I)C
    //   2073: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2076: pop
    //   2077: iload_2
    //   2078: ifeq -> 2232
    //   2081: goto -> 2088
    //   2084: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2087: athrow
    //   2088: aload_3
    //   2089: getstatic burp/Zr_x.ZF : Ljava/lang/String;
    //   2092: getstatic burp/Ztl6.ZQ : Ljava/lang/Object;
    //   2095: checkcast java/math/BigInteger
    //   2098: invokevirtual intValue : ()I
    //   2101: bipush #32
    //   2103: irem
    //   2104: invokestatic abs : (I)I
    //   2107: invokevirtual charAt : (I)C
    //   2110: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2113: pop
    //   2114: iload_2
    //   2115: ifeq -> 2232
    //   2118: goto -> 2125
    //   2121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2124: athrow
    //   2125: aload_3
    //   2126: getstatic burp/Zgpx.Z_ : Ljava/lang/String;
    //   2129: getstatic burp/Zz41.Zv : Ljava/lang/Object;
    //   2132: checkcast java/math/BigInteger
    //   2135: invokevirtual intValue : ()I
    //   2138: bipush #32
    //   2140: irem
    //   2141: invokestatic abs : (I)I
    //   2144: invokevirtual charAt : (I)C
    //   2147: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2150: pop
    //   2151: iload_2
    //   2152: ifeq -> 2232
    //   2155: goto -> 2162
    //   2158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2161: athrow
    //   2162: aload_3
    //   2163: getstatic burp/Zxp5.ZO : Ljava/lang/String;
    //   2166: getstatic burp/Zkdx.Zn : Ljava/lang/Object;
    //   2169: checkcast java/math/BigInteger
    //   2172: invokevirtual intValue : ()I
    //   2175: bipush #32
    //   2177: irem
    //   2178: invokestatic abs : (I)I
    //   2181: invokevirtual charAt : (I)C
    //   2184: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2187: pop
    //   2188: iload_2
    //   2189: ifeq -> 2232
    //   2192: goto -> 2199
    //   2195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2198: athrow
    //   2199: aload_3
    //   2200: getstatic burp/Zrom.ZD : Ljava/lang/String;
    //   2203: getstatic burp/Zti4.Zi : Ljava/lang/Object;
    //   2206: checkcast java/math/BigInteger
    //   2209: invokevirtual intValue : ()I
    //   2212: bipush #32
    //   2214: irem
    //   2215: invokestatic abs : (I)I
    //   2218: invokevirtual charAt : (I)C
    //   2221: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2224: pop
    //   2225: goto -> 2232
    //   2228: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2231: athrow
    //   2232: iinc #4, 1
    //   2235: iload_2
    //   2236: ifeq -> 900
    //   2239: aload_3
    //   2240: invokevirtual toString : ()Ljava/lang/String;
    //   2243: putstatic burp/Zg61.ZX : Ljava/lang/String;
    //   2246: sipush #2999
    //   2249: sipush #-28949
    //   2252: invokestatic a : (II)Ljava/lang/String;
    //   2255: iconst_1
    //   2256: ldc burp/Zbu6
    //   2258: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2261: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2264: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2267: astore #4
    //   2269: aload #4
    //   2271: arraylength
    //   2272: istore #5
    //   2274: iconst_0
    //   2275: istore #6
    //   2277: iload #6
    //   2279: iload #5
    //   2281: if_icmpge -> 2419
    //   2284: aload #4
    //   2286: iload #6
    //   2288: aaload
    //   2289: astore #7
    //   2291: aload #7
    //   2293: invokevirtual getModifiers : ()I
    //   2296: invokestatic isStatic : (I)Z
    //   2299: ifne -> 2309
    //   2302: goto -> 2412
    //   2305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2308: athrow
    //   2309: aload #7
    //   2311: invokevirtual getType : ()Ljava/lang/Class;
    //   2314: astore #8
    //   2316: aload #8
    //   2318: ifnull -> 2399
    //   2321: aload #8
    //   2323: invokevirtual isPrimitive : ()Z
    //   2326: ifne -> 2399
    //   2329: goto -> 2336
    //   2332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2335: athrow
    //   2336: aload #8
    //   2338: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2341: ifnull -> 2399
    //   2344: goto -> 2351
    //   2347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2350: athrow
    //   2351: aload #8
    //   2353: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2356: invokevirtual getName : ()Ljava/lang/String;
    //   2359: ifnull -> 2399
    //   2362: goto -> 2369
    //   2365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2368: athrow
    //   2369: aload #8
    //   2371: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2374: invokevirtual getName : ()Ljava/lang/String;
    //   2377: sipush #2995
    //   2380: sipush #23519
    //   2383: invokestatic a : (II)Ljava/lang/String;
    //   2386: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2389: ifne -> 2399
    //   2392: goto -> 2399
    //   2395: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2398: athrow
    //   2399: aload #7
    //   2401: iconst_1
    //   2402: invokevirtual setAccessible : (Z)V
    //   2405: aload #7
    //   2407: aconst_null
    //   2408: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2411: pop
    //   2412: iinc #6, 1
    //   2415: iload_2
    //   2416: ifeq -> 2277
    //   2419: sipush #2996
    //   2422: sipush #-1834
    //   2425: invokestatic a : (II)Ljava/lang/String;
    //   2428: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2431: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2434: astore #4
    //   2436: aload #4
    //   2438: arraylength
    //   2439: istore #5
    //   2441: iconst_0
    //   2442: istore #6
    //   2444: iload #6
    //   2446: iload #5
    //   2448: if_icmpge -> 2581
    //   2451: aload #4
    //   2453: iload #6
    //   2455: aaload
    //   2456: astore #7
    //   2458: aload #7
    //   2460: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2463: pop
    //   2464: aload #7
    //   2466: invokevirtual getModifiers : ()I
    //   2469: invokestatic isStatic : (I)Z
    //   2472: ifeq -> 2567
    //   2475: aload #7
    //   2477: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2480: arraylength
    //   2481: iconst_2
    //   2482: if_icmpne -> 2567
    //   2485: goto -> 2492
    //   2488: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2491: athrow
    //   2492: aload #7
    //   2494: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2497: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2500: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2503: ifeq -> 2567
    //   2506: goto -> 2513
    //   2509: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2512: athrow
    //   2513: aload #7
    //   2515: iconst_1
    //   2516: invokevirtual setAccessible : (Z)V
    //   2519: aload #7
    //   2521: aconst_null
    //   2522: iconst_2
    //   2523: anewarray java/lang/Object
    //   2526: dup
    //   2527: iconst_0
    //   2528: aload_0
    //   2529: aastore
    //   2530: dup
    //   2531: iconst_1
    //   2532: aload_1
    //   2533: ifnonnull -> 2551
    //   2536: goto -> 2543
    //   2539: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2542: athrow
    //   2543: aload_1
    //   2544: goto -> 2558
    //   2547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2550: athrow
    //   2551: aload_1
    //   2552: checkcast [B
    //   2555: invokevirtual clone : ()Ljava/lang/Object;
    //   2558: aastore
    //   2559: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2562: pop
    //   2563: iload_2
    //   2564: ifeq -> 2581
    //   2567: iinc #6, 1
    //   2570: iload_2
    //   2571: ifeq -> 2444
    //   2574: goto -> 2581
    //   2577: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2580: athrow
    //   2581: getstatic burp/Zej8.ZP : Ljava/lang/String;
    //   2584: getstatic burp/Zzk_.Zx : Ljava/lang/Object;
    //   2587: checkcast java/math/BigInteger
    //   2590: invokevirtual intValue : ()I
    //   2593: bipush #32
    //   2595: irem
    //   2596: invokestatic abs : (I)I
    //   2599: invokevirtual charAt : (I)C
    //   2602: getstatic burp/Zeva.Zo : Ljava/lang/String;
    //   2605: getstatic burp/Zmhq.ZK : Ljava/lang/Object;
    //   2608: checkcast java/math/BigInteger
    //   2611: invokevirtual intValue : ()I
    //   2614: bipush #32
    //   2616: irem
    //   2617: invokestatic abs : (I)I
    //   2620: invokevirtual charAt : (I)C
    //   2623: if_icmple -> 2738
    //   2626: getstatic burp/Znu.ZF : Ljava/lang/String;
    //   2629: getstatic burp/Zrtp.Zy : Ljava/lang/Object;
    //   2632: checkcast java/math/BigInteger
    //   2635: invokevirtual intValue : ()I
    //   2638: bipush #32
    //   2640: irem
    //   2641: invokestatic abs : (I)I
    //   2644: invokevirtual charAt : (I)C
    //   2647: getstatic burp/Zxd1.ZQ : Ljava/lang/String;
    //   2650: getstatic burp/Ztr5.ZZ : Ljava/lang/Object;
    //   2653: checkcast java/math/BigInteger
    //   2656: invokevirtual intValue : ()I
    //   2659: bipush #32
    //   2661: irem
    //   2662: invokestatic abs : (I)I
    //   2665: invokevirtual charAt : (I)C
    //   2668: if_icmpgt -> 2738
    //   2671: goto -> 2678
    //   2674: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2677: athrow
    //   2678: getstatic burp/Zsvd.ZB : Ljava/lang/String;
    //   2681: getstatic burp/Zgeq.ZT : Ljava/lang/Object;
    //   2684: checkcast java/math/BigInteger
    //   2687: invokevirtual intValue : ()I
    //   2690: bipush #32
    //   2692: irem
    //   2693: invokestatic abs : (I)I
    //   2696: invokevirtual charAt : (I)C
    //   2699: getstatic burp/Zsdl.ZJ : Ljava/lang/String;
    //   2702: getstatic burp/Zbsz.ZP : Ljava/lang/Object;
    //   2705: checkcast java/math/BigInteger
    //   2708: invokevirtual intValue : ()I
    //   2711: bipush #32
    //   2713: irem
    //   2714: invokestatic abs : (I)I
    //   2717: invokevirtual charAt : (I)C
    //   2720: if_icmple -> 2738
    //   2723: goto -> 2730
    //   2726: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2729: athrow
    //   2730: iconst_1
    //   2731: goto -> 2739
    //   2734: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2737: athrow
    //   2738: iconst_0
    //   2739: ireturn
    //   2740: astore_3
    //   2741: new java/lang/Exception
    //   2744: dup
    //   2745: aload_3
    //   2746: invokevirtual getMessage : ()Ljava/lang/String;
    //   2749: invokespecial <init> : (Ljava/lang/String;)V
    //   2752: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2739	2740	java/lang/Throwable
    //   51	65	68	java/lang/Throwable
    //   58	79	82	java/lang/Throwable
    //   72	93	96	java/lang/Throwable
    //   86	107	110	java/lang/Throwable
    //   100	121	124	java/lang/Throwable
    //   114	135	138	java/lang/Throwable
    //   128	149	152	java/lang/Throwable
    //   142	163	166	java/lang/Throwable
    //   156	173	176	java/lang/Throwable
    //   212	226	229	java/lang/Throwable
    //   219	240	243	java/lang/Throwable
    //   233	254	257	java/lang/Throwable
    //   247	268	271	java/lang/Throwable
    //   261	282	285	java/lang/Throwable
    //   275	296	299	java/lang/Throwable
    //   289	310	313	java/lang/Throwable
    //   303	324	327	java/lang/Throwable
    //   317	341	344	java/lang/Throwable
    //   405	423	426	java/lang/Throwable
    //   414	439	442	java/lang/Throwable
    //   430	456	459	java/lang/Throwable
    //   446	472	475	java/lang/Throwable
    //   463	489	492	java/lang/Throwable
    //   479	505	508	java/lang/Throwable
    //   496	521	524	java/lang/Throwable
    //   512	544	547	java/lang/Throwable
    //   528	560	563	java/lang/Throwable
    //   551	576	579	java/lang/Throwable
    //   567	599	602	java/lang/Throwable
    //   583	615	618	java/lang/Throwable
    //   606	631	634	java/lang/Throwable
    //   622	650	653	java/lang/Throwable
    //   780	815	818	java/lang/Throwable
    //   822	863	866	java/lang/Throwable
    //   907	1082	1085	java/lang/Throwable
    //   1052	1119	1122	java/lang/Throwable
    //   1089	1156	1159	java/lang/Throwable
    //   1126	1193	1196	java/lang/Throwable
    //   1163	1230	1233	java/lang/Throwable
    //   1200	1267	1270	java/lang/Throwable
    //   1237	1304	1307	java/lang/Throwable
    //   1274	1341	1344	java/lang/Throwable
    //   1311	1378	1381	java/lang/Throwable
    //   1348	1415	1418	java/lang/Throwable
    //   1385	1452	1455	java/lang/Throwable
    //   1422	1489	1492	java/lang/Throwable
    //   1459	1526	1529	java/lang/Throwable
    //   1496	1563	1566	java/lang/Throwable
    //   1533	1600	1603	java/lang/Throwable
    //   1570	1637	1640	java/lang/Throwable
    //   1607	1674	1677	java/lang/Throwable
    //   1644	1711	1714	java/lang/Throwable
    //   1681	1748	1751	java/lang/Throwable
    //   1718	1785	1788	java/lang/Throwable
    //   1755	1822	1825	java/lang/Throwable
    //   1792	1859	1862	java/lang/Throwable
    //   1829	1896	1899	java/lang/Throwable
    //   1866	1933	1936	java/lang/Throwable
    //   1903	1970	1973	java/lang/Throwable
    //   1940	2007	2010	java/lang/Throwable
    //   1977	2044	2047	java/lang/Throwable
    //   2014	2081	2084	java/lang/Throwable
    //   2051	2118	2121	java/lang/Throwable
    //   2088	2155	2158	java/lang/Throwable
    //   2125	2192	2195	java/lang/Throwable
    //   2162	2225	2228	java/lang/Throwable
    //   2291	2305	2305	java/lang/Throwable
    //   2316	2329	2332	java/lang/Throwable
    //   2321	2344	2347	java/lang/Throwable
    //   2336	2362	2365	java/lang/Throwable
    //   2351	2392	2395	java/lang/Throwable
    //   2458	2485	2488	java/lang/Throwable
    //   2475	2506	2509	java/lang/Throwable
    //   2492	2536	2539	java/lang/Throwable
    //   2513	2547	2547	java/lang/Throwable
    //   2558	2574	2577	java/lang/Throwable
    //   2581	2671	2674	java/lang/Throwable
    //   2626	2723	2726	java/lang/Throwable
    //   2678	2734	2734	java/lang/Throwable
  }
  
  static void ZS(Object paramObject) {
    Zrex.Za = a(2998, -7669);
    Zrex.Zr = new BigInteger(a(2994, -7189));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Ze4g.Zk.charAt(Math.abs(((BigInteger)Zz4j.Zu).intValue() % 32)) <= Zxxo.ZH.charAt(Math.abs(((BigInteger)Zxxf.ZZ).intValue() % 32))) {
          try {
            Zr1t.ZX(Class.forName(a(2993, 2431)));
            if (bool)
              Zs5y.ZX(Class.forName(a(2997, -30753))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zs5y.ZX(Class.forName(a(2997, -30753)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '[báL¾Øåã+1X¾2¸fN(f,gÑ=ïÉ¢OA%A}ÛÇiyãr¶¶yvZ~À{£jÛxÒ6¥:»Ùä\\bá\\tK«`%ÉlÐÜ ïÈ?ÑÙ{,÷Ôo7=ýí&3§ÍQ.w3Î\\b4ã,4Mjô ¿¹ 5±Q$O2üÎØ-Û2«Û¶gyÁàtÐÍ#'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #115
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc '*3Áïú]\\b9uo¿i~Ó'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #59
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
    //   128: putstatic burp/Zgis.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zgis.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #42
    //   214: goto -> 244
    //   217: bipush #87
    //   219: goto -> 244
    //   222: bipush #13
    //   224: goto -> 244
    //   227: bipush #12
    //   229: goto -> 244
    //   232: bipush #107
    //   234: goto -> 244
    //   237: bipush #112
    //   239: goto -> 244
    //   242: bipush #25
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #72
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-70
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #58
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-18
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #32
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #109
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #50
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #25
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #104
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-2
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #98
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-40
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-81
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #33
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #54
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-104
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #6
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-67
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-96
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-18
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: iconst_0
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #-120
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #-120
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #-30
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #45
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #111
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #-7
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #-6
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #88
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-20
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-91
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #23
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zgis.ZV : Ljava/lang/Object;
    //   499: sipush #2992
    //   502: sipush #-18770
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zgis.Zh : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xBB3) & 0xFFFF;
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
      byte b1 = 67;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgis.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */