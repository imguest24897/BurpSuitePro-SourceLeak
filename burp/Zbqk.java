package burp;

import java.math.BigInteger;

class Zbqk extends ClassLoader {
  static String ZZ;
  
  static Object ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZF(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: sipush #21638
    //   7: sipush #-168
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic Zh : (Ljava/lang/Object;)V
    //   19: getstatic burp/Zgvl.ZK : Ljava/lang/Object;
    //   22: checkcast java/math/BigInteger
    //   25: getstatic burp/Zs26.Z_ : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   34: putstatic burp/Zs8q.ZI : Ljava/lang/Object;
    //   37: new java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: astore_3
    //   45: iconst_0
    //   46: istore #4
    //   48: iload #4
    //   50: bipush #32
    //   52: if_icmpge -> 1387
    //   55: iload #4
    //   57: tableswitch default -> 1380, 0 -> 200, 1 -> 237, 2 -> 274, 3 -> 311, 4 -> 348, 5 -> 385, 6 -> 422, 7 -> 459, 8 -> 496, 9 -> 533, 10 -> 570, 11 -> 607, 12 -> 644, 13 -> 681, 14 -> 718, 15 -> 755, 16 -> 792, 17 -> 829, 18 -> 866, 19 -> 903, 20 -> 940, 21 -> 977, 22 -> 1014, 23 -> 1051, 24 -> 1088, 25 -> 1125, 26 -> 1162, 27 -> 1199, 28 -> 1236, 29 -> 1273, 30 -> 1310, 31 -> 1347
    //   200: aload_3
    //   201: getstatic burp/Zst7.Zi : Ljava/lang/String;
    //   204: getstatic burp/Zs36.Zs : Ljava/lang/Object;
    //   207: checkcast java/math/BigInteger
    //   210: invokevirtual intValue : ()I
    //   213: bipush #32
    //   215: irem
    //   216: invokestatic abs : (I)I
    //   219: invokevirtual charAt : (I)C
    //   222: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: iload_2
    //   227: ifne -> 1380
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   236: athrow
    //   237: aload_3
    //   238: getstatic burp/Zv8c.ZO : Ljava/lang/String;
    //   241: getstatic burp/Zlno.ZU : Ljava/lang/Object;
    //   244: checkcast java/math/BigInteger
    //   247: invokevirtual intValue : ()I
    //   250: bipush #32
    //   252: irem
    //   253: invokestatic abs : (I)I
    //   256: invokevirtual charAt : (I)C
    //   259: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   262: pop
    //   263: iload_2
    //   264: ifne -> 1380
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   273: athrow
    //   274: aload_3
    //   275: getstatic burp/Zeqr.Zb : Ljava/lang/String;
    //   278: getstatic burp/Zl1q.Zh : Ljava/lang/Object;
    //   281: checkcast java/math/BigInteger
    //   284: invokevirtual intValue : ()I
    //   287: bipush #32
    //   289: irem
    //   290: invokestatic abs : (I)I
    //   293: invokevirtual charAt : (I)C
    //   296: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   299: pop
    //   300: iload_2
    //   301: ifne -> 1380
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   310: athrow
    //   311: aload_3
    //   312: getstatic burp/Zb2k.Zu : Ljava/lang/String;
    //   315: getstatic burp/Ztv8.ZS : Ljava/lang/Object;
    //   318: checkcast java/math/BigInteger
    //   321: invokevirtual intValue : ()I
    //   324: bipush #32
    //   326: irem
    //   327: invokestatic abs : (I)I
    //   330: invokevirtual charAt : (I)C
    //   333: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   336: pop
    //   337: iload_2
    //   338: ifne -> 1380
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   347: athrow
    //   348: aload_3
    //   349: getstatic burp/Ze64.ZM : Ljava/lang/String;
    //   352: getstatic burp/Zrt9.Zy : Ljava/lang/Object;
    //   355: checkcast java/math/BigInteger
    //   358: invokevirtual intValue : ()I
    //   361: bipush #32
    //   363: irem
    //   364: invokestatic abs : (I)I
    //   367: invokevirtual charAt : (I)C
    //   370: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   373: pop
    //   374: iload_2
    //   375: ifne -> 1380
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   384: athrow
    //   385: aload_3
    //   386: getstatic burp/Zl_k.Zw : Ljava/lang/String;
    //   389: getstatic burp/Zle4.Zh : Ljava/lang/Object;
    //   392: checkcast java/math/BigInteger
    //   395: invokevirtual intValue : ()I
    //   398: bipush #32
    //   400: irem
    //   401: invokestatic abs : (I)I
    //   404: invokevirtual charAt : (I)C
    //   407: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   410: pop
    //   411: iload_2
    //   412: ifne -> 1380
    //   415: goto -> 422
    //   418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   421: athrow
    //   422: aload_3
    //   423: getstatic burp/Zmt7.Zl : Ljava/lang/String;
    //   426: getstatic burp/Zl50.ZV : Ljava/lang/Object;
    //   429: checkcast java/math/BigInteger
    //   432: invokevirtual intValue : ()I
    //   435: bipush #32
    //   437: irem
    //   438: invokestatic abs : (I)I
    //   441: invokevirtual charAt : (I)C
    //   444: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   447: pop
    //   448: iload_2
    //   449: ifne -> 1380
    //   452: goto -> 459
    //   455: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   458: athrow
    //   459: aload_3
    //   460: getstatic burp/Zva.Zi : Ljava/lang/String;
    //   463: getstatic burp/Zxxf.ZZ : Ljava/lang/Object;
    //   466: checkcast java/math/BigInteger
    //   469: invokevirtual intValue : ()I
    //   472: bipush #32
    //   474: irem
    //   475: invokestatic abs : (I)I
    //   478: invokevirtual charAt : (I)C
    //   481: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   484: pop
    //   485: iload_2
    //   486: ifne -> 1380
    //   489: goto -> 496
    //   492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   495: athrow
    //   496: aload_3
    //   497: getstatic burp/Zsq6.Zm : Ljava/lang/String;
    //   500: getstatic burp/Zedz.Za : Ljava/lang/Object;
    //   503: checkcast java/math/BigInteger
    //   506: invokevirtual intValue : ()I
    //   509: bipush #32
    //   511: irem
    //   512: invokestatic abs : (I)I
    //   515: invokevirtual charAt : (I)C
    //   518: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   521: pop
    //   522: iload_2
    //   523: ifne -> 1380
    //   526: goto -> 533
    //   529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   532: athrow
    //   533: aload_3
    //   534: getstatic burp/Ztzh.ZE : Ljava/lang/String;
    //   537: getstatic burp/Zgja.ZD : Ljava/lang/Object;
    //   540: checkcast java/math/BigInteger
    //   543: invokevirtual intValue : ()I
    //   546: bipush #32
    //   548: irem
    //   549: invokestatic abs : (I)I
    //   552: invokevirtual charAt : (I)C
    //   555: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   558: pop
    //   559: iload_2
    //   560: ifne -> 1380
    //   563: goto -> 570
    //   566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   569: athrow
    //   570: aload_3
    //   571: getstatic burp/Zzh9.ZF : Ljava/lang/String;
    //   574: getstatic burp/Zrd3.ZI : Ljava/lang/Object;
    //   577: checkcast java/math/BigInteger
    //   580: invokevirtual intValue : ()I
    //   583: bipush #32
    //   585: irem
    //   586: invokestatic abs : (I)I
    //   589: invokevirtual charAt : (I)C
    //   592: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   595: pop
    //   596: iload_2
    //   597: ifne -> 1380
    //   600: goto -> 607
    //   603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   606: athrow
    //   607: aload_3
    //   608: getstatic burp/Ze6k.ZM : Ljava/lang/String;
    //   611: getstatic burp/Zgde.ZG : Ljava/lang/Object;
    //   614: checkcast java/math/BigInteger
    //   617: invokevirtual intValue : ()I
    //   620: bipush #32
    //   622: irem
    //   623: invokestatic abs : (I)I
    //   626: invokevirtual charAt : (I)C
    //   629: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   632: pop
    //   633: iload_2
    //   634: ifne -> 1380
    //   637: goto -> 644
    //   640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   643: athrow
    //   644: aload_3
    //   645: getstatic burp/Zsqi.Zs : Ljava/lang/String;
    //   648: getstatic burp/Zztn.ZO : Ljava/lang/Object;
    //   651: checkcast java/math/BigInteger
    //   654: invokevirtual intValue : ()I
    //   657: bipush #32
    //   659: irem
    //   660: invokestatic abs : (I)I
    //   663: invokevirtual charAt : (I)C
    //   666: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   669: pop
    //   670: iload_2
    //   671: ifne -> 1380
    //   674: goto -> 681
    //   677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   680: athrow
    //   681: aload_3
    //   682: getstatic burp/Zxsb.Zh : Ljava/lang/String;
    //   685: getstatic burp/Zbo7.Zl : Ljava/lang/Object;
    //   688: checkcast java/math/BigInteger
    //   691: invokevirtual intValue : ()I
    //   694: bipush #32
    //   696: irem
    //   697: invokestatic abs : (I)I
    //   700: invokevirtual charAt : (I)C
    //   703: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   706: pop
    //   707: iload_2
    //   708: ifne -> 1380
    //   711: goto -> 718
    //   714: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   717: athrow
    //   718: aload_3
    //   719: getstatic burp/Zgta.ZL : Ljava/lang/String;
    //   722: getstatic burp/Zxdh.ZD : Ljava/lang/Object;
    //   725: checkcast java/math/BigInteger
    //   728: invokevirtual intValue : ()I
    //   731: bipush #32
    //   733: irem
    //   734: invokestatic abs : (I)I
    //   737: invokevirtual charAt : (I)C
    //   740: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   743: pop
    //   744: iload_2
    //   745: ifne -> 1380
    //   748: goto -> 755
    //   751: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   754: athrow
    //   755: aload_3
    //   756: getstatic burp/Zlv6.Zt : Ljava/lang/String;
    //   759: getstatic burp/Zzc7.ZG : Ljava/lang/Object;
    //   762: checkcast java/math/BigInteger
    //   765: invokevirtual intValue : ()I
    //   768: bipush #32
    //   770: irem
    //   771: invokestatic abs : (I)I
    //   774: invokevirtual charAt : (I)C
    //   777: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   780: pop
    //   781: iload_2
    //   782: ifne -> 1380
    //   785: goto -> 792
    //   788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   791: athrow
    //   792: aload_3
    //   793: getstatic burp/Zxzd.ZM : Ljava/lang/String;
    //   796: getstatic burp/Zefm.ZP : Ljava/lang/Object;
    //   799: checkcast java/math/BigInteger
    //   802: invokevirtual intValue : ()I
    //   805: bipush #32
    //   807: irem
    //   808: invokestatic abs : (I)I
    //   811: invokevirtual charAt : (I)C
    //   814: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   817: pop
    //   818: iload_2
    //   819: ifne -> 1380
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   828: athrow
    //   829: aload_3
    //   830: getstatic burp/Zlgh.Zm : Ljava/lang/String;
    //   833: getstatic burp/Zoa.ZI : Ljava/lang/Object;
    //   836: checkcast java/math/BigInteger
    //   839: invokevirtual intValue : ()I
    //   842: bipush #32
    //   844: irem
    //   845: invokestatic abs : (I)I
    //   848: invokevirtual charAt : (I)C
    //   851: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   854: pop
    //   855: iload_2
    //   856: ifne -> 1380
    //   859: goto -> 866
    //   862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   865: athrow
    //   866: aload_3
    //   867: getstatic burp/Zl55.Zp : Ljava/lang/String;
    //   870: getstatic burp/Zead.ZI : Ljava/lang/Object;
    //   873: checkcast java/math/BigInteger
    //   876: invokevirtual intValue : ()I
    //   879: bipush #32
    //   881: irem
    //   882: invokestatic abs : (I)I
    //   885: invokevirtual charAt : (I)C
    //   888: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   891: pop
    //   892: iload_2
    //   893: ifne -> 1380
    //   896: goto -> 903
    //   899: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   902: athrow
    //   903: aload_3
    //   904: getstatic burp/Zgny.Zf : Ljava/lang/String;
    //   907: getstatic burp/Zty3.Zz : Ljava/lang/Object;
    //   910: checkcast java/math/BigInteger
    //   913: invokevirtual intValue : ()I
    //   916: bipush #32
    //   918: irem
    //   919: invokestatic abs : (I)I
    //   922: invokevirtual charAt : (I)C
    //   925: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   928: pop
    //   929: iload_2
    //   930: ifne -> 1380
    //   933: goto -> 940
    //   936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   939: athrow
    //   940: aload_3
    //   941: getstatic burp/Zewo.ZM : Ljava/lang/String;
    //   944: getstatic burp/Zram.ZF : Ljava/lang/Object;
    //   947: checkcast java/math/BigInteger
    //   950: invokevirtual intValue : ()I
    //   953: bipush #32
    //   955: irem
    //   956: invokestatic abs : (I)I
    //   959: invokevirtual charAt : (I)C
    //   962: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   965: pop
    //   966: iload_2
    //   967: ifne -> 1380
    //   970: goto -> 977
    //   973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   976: athrow
    //   977: aload_3
    //   978: getstatic burp/Zenq.ZG : Ljava/lang/String;
    //   981: getstatic burp/Zrc0.Zz : Ljava/lang/Object;
    //   984: checkcast java/math/BigInteger
    //   987: invokevirtual intValue : ()I
    //   990: bipush #32
    //   992: irem
    //   993: invokestatic abs : (I)I
    //   996: invokevirtual charAt : (I)C
    //   999: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1002: pop
    //   1003: iload_2
    //   1004: ifne -> 1380
    //   1007: goto -> 1014
    //   1010: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1013: athrow
    //   1014: aload_3
    //   1015: getstatic burp/Zv8c.ZO : Ljava/lang/String;
    //   1018: getstatic burp/Zz3k.Zz : Ljava/lang/Object;
    //   1021: checkcast java/math/BigInteger
    //   1024: invokevirtual intValue : ()I
    //   1027: bipush #32
    //   1029: irem
    //   1030: invokestatic abs : (I)I
    //   1033: invokevirtual charAt : (I)C
    //   1036: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1039: pop
    //   1040: iload_2
    //   1041: ifne -> 1380
    //   1044: goto -> 1051
    //   1047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1050: athrow
    //   1051: aload_3
    //   1052: getstatic burp/Zsk4.ZH : Ljava/lang/String;
    //   1055: getstatic burp/Zgz2.Zs : Ljava/lang/Object;
    //   1058: checkcast java/math/BigInteger
    //   1061: invokevirtual intValue : ()I
    //   1064: bipush #32
    //   1066: irem
    //   1067: invokestatic abs : (I)I
    //   1070: invokevirtual charAt : (I)C
    //   1073: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1076: pop
    //   1077: iload_2
    //   1078: ifne -> 1380
    //   1081: goto -> 1088
    //   1084: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1087: athrow
    //   1088: aload_3
    //   1089: getstatic burp/Zg3v.Zt : Ljava/lang/String;
    //   1092: getstatic burp/Zkdq.ZG : Ljava/lang/Object;
    //   1095: checkcast java/math/BigInteger
    //   1098: invokevirtual intValue : ()I
    //   1101: bipush #32
    //   1103: irem
    //   1104: invokestatic abs : (I)I
    //   1107: invokevirtual charAt : (I)C
    //   1110: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1113: pop
    //   1114: iload_2
    //   1115: ifne -> 1380
    //   1118: goto -> 1125
    //   1121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1124: athrow
    //   1125: aload_3
    //   1126: getstatic burp/Zz20.ZX : Ljava/lang/String;
    //   1129: getstatic burp/Zmlr.Zh : Ljava/lang/Object;
    //   1132: checkcast java/math/BigInteger
    //   1135: invokevirtual intValue : ()I
    //   1138: bipush #32
    //   1140: irem
    //   1141: invokestatic abs : (I)I
    //   1144: invokevirtual charAt : (I)C
    //   1147: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1150: pop
    //   1151: iload_2
    //   1152: ifne -> 1380
    //   1155: goto -> 1162
    //   1158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1161: athrow
    //   1162: aload_3
    //   1163: getstatic burp/Zlh2.Zf : Ljava/lang/String;
    //   1166: getstatic burp/Zzo5.Zf : Ljava/lang/Object;
    //   1169: checkcast java/math/BigInteger
    //   1172: invokevirtual intValue : ()I
    //   1175: bipush #32
    //   1177: irem
    //   1178: invokestatic abs : (I)I
    //   1181: invokevirtual charAt : (I)C
    //   1184: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1187: pop
    //   1188: iload_2
    //   1189: ifne -> 1380
    //   1192: goto -> 1199
    //   1195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1198: athrow
    //   1199: aload_3
    //   1200: getstatic burp/Zsf7.ZS : Ljava/lang/String;
    //   1203: getstatic burp/Zzh1.Zf : Ljava/lang/Object;
    //   1206: checkcast java/math/BigInteger
    //   1209: invokevirtual intValue : ()I
    //   1212: bipush #32
    //   1214: irem
    //   1215: invokestatic abs : (I)I
    //   1218: invokevirtual charAt : (I)C
    //   1221: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1224: pop
    //   1225: iload_2
    //   1226: ifne -> 1380
    //   1229: goto -> 1236
    //   1232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1235: athrow
    //   1236: aload_3
    //   1237: getstatic burp/Zr_w.Zi : Ljava/lang/String;
    //   1240: getstatic burp/Zgcg.Zi : Ljava/lang/Object;
    //   1243: checkcast java/math/BigInteger
    //   1246: invokevirtual intValue : ()I
    //   1249: bipush #32
    //   1251: irem
    //   1252: invokestatic abs : (I)I
    //   1255: invokevirtual charAt : (I)C
    //   1258: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1261: pop
    //   1262: iload_2
    //   1263: ifne -> 1380
    //   1266: goto -> 1273
    //   1269: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1272: athrow
    //   1273: aload_3
    //   1274: getstatic burp/Zxpb.ZQ : Ljava/lang/String;
    //   1277: getstatic burp/Zkaw.ZB : Ljava/lang/Object;
    //   1280: checkcast java/math/BigInteger
    //   1283: invokevirtual intValue : ()I
    //   1286: bipush #32
    //   1288: irem
    //   1289: invokestatic abs : (I)I
    //   1292: invokevirtual charAt : (I)C
    //   1295: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1298: pop
    //   1299: iload_2
    //   1300: ifne -> 1380
    //   1303: goto -> 1310
    //   1306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1309: athrow
    //   1310: aload_3
    //   1311: getstatic burp/Zkdq.ZZ : Ljava/lang/String;
    //   1314: getstatic burp/Zeqw.ZV : Ljava/lang/Object;
    //   1317: checkcast java/math/BigInteger
    //   1320: invokevirtual intValue : ()I
    //   1323: bipush #32
    //   1325: irem
    //   1326: invokestatic abs : (I)I
    //   1329: invokevirtual charAt : (I)C
    //   1332: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1335: pop
    //   1336: iload_2
    //   1337: ifne -> 1380
    //   1340: goto -> 1347
    //   1343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1346: athrow
    //   1347: aload_3
    //   1348: getstatic burp/Zl5.ZE : Ljava/lang/String;
    //   1351: getstatic burp/Zmlr.Zh : Ljava/lang/Object;
    //   1354: checkcast java/math/BigInteger
    //   1357: invokevirtual intValue : ()I
    //   1360: bipush #32
    //   1362: irem
    //   1363: invokestatic abs : (I)I
    //   1366: invokevirtual charAt : (I)C
    //   1369: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1372: pop
    //   1373: goto -> 1380
    //   1376: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1379: athrow
    //   1380: iinc #4, 1
    //   1383: iload_2
    //   1384: ifne -> 48
    //   1387: aload_3
    //   1388: invokevirtual toString : ()Ljava/lang/String;
    //   1391: putstatic burp/Zt5a.Zl : Ljava/lang/String;
    //   1394: sipush #21634
    //   1397: sipush #20037
    //   1400: invokestatic a : (II)Ljava/lang/String;
    //   1403: iconst_1
    //   1404: ldc burp/Zmz
    //   1406: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1409: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1412: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1415: astore #4
    //   1417: aload #4
    //   1419: arraylength
    //   1420: istore #5
    //   1422: iconst_0
    //   1423: istore #6
    //   1425: iload #6
    //   1427: iload #5
    //   1429: if_icmpge -> 1567
    //   1432: aload #4
    //   1434: iload #6
    //   1436: aaload
    //   1437: astore #7
    //   1439: aload #7
    //   1441: invokevirtual getModifiers : ()I
    //   1444: invokestatic isStatic : (I)Z
    //   1447: ifne -> 1457
    //   1450: goto -> 1560
    //   1453: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1456: athrow
    //   1457: aload #7
    //   1459: invokevirtual getType : ()Ljava/lang/Class;
    //   1462: astore #8
    //   1464: aload #8
    //   1466: ifnull -> 1547
    //   1469: aload #8
    //   1471: invokevirtual isPrimitive : ()Z
    //   1474: ifne -> 1547
    //   1477: goto -> 1484
    //   1480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1483: athrow
    //   1484: aload #8
    //   1486: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1489: ifnull -> 1547
    //   1492: goto -> 1499
    //   1495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1498: athrow
    //   1499: aload #8
    //   1501: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1504: invokevirtual getName : ()Ljava/lang/String;
    //   1507: ifnull -> 1547
    //   1510: goto -> 1517
    //   1513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1516: athrow
    //   1517: aload #8
    //   1519: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1522: invokevirtual getName : ()Ljava/lang/String;
    //   1525: sipush #21642
    //   1528: sipush #24986
    //   1531: invokestatic a : (II)Ljava/lang/String;
    //   1534: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1537: ifne -> 1547
    //   1540: goto -> 1547
    //   1543: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1546: athrow
    //   1547: aload #7
    //   1549: iconst_1
    //   1550: invokevirtual setAccessible : (Z)V
    //   1553: aload #7
    //   1555: aconst_null
    //   1556: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1559: pop
    //   1560: iinc #6, 1
    //   1563: iload_2
    //   1564: ifne -> 1425
    //   1567: sipush #21637
    //   1570: sipush #2876
    //   1573: invokestatic a : (II)Ljava/lang/String;
    //   1576: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1579: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1582: astore #4
    //   1584: aload #4
    //   1586: arraylength
    //   1587: istore #5
    //   1589: iconst_0
    //   1590: istore #6
    //   1592: iload #6
    //   1594: iload #5
    //   1596: if_icmpge -> 1729
    //   1599: aload #4
    //   1601: iload #6
    //   1603: aaload
    //   1604: astore #7
    //   1606: aload #7
    //   1608: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1611: pop
    //   1612: aload #7
    //   1614: invokevirtual getModifiers : ()I
    //   1617: invokestatic isStatic : (I)Z
    //   1620: ifeq -> 1715
    //   1623: aload #7
    //   1625: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1628: arraylength
    //   1629: iconst_2
    //   1630: if_icmpne -> 1715
    //   1633: goto -> 1640
    //   1636: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1639: athrow
    //   1640: aload #7
    //   1642: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1645: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1648: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1651: ifeq -> 1715
    //   1654: goto -> 1661
    //   1657: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1660: athrow
    //   1661: aload #7
    //   1663: iconst_1
    //   1664: invokevirtual setAccessible : (Z)V
    //   1667: aload #7
    //   1669: aconst_null
    //   1670: iconst_2
    //   1671: anewarray java/lang/Object
    //   1674: dup
    //   1675: iconst_0
    //   1676: aload_0
    //   1677: aastore
    //   1678: dup
    //   1679: iconst_1
    //   1680: aload_1
    //   1681: ifnonnull -> 1699
    //   1684: goto -> 1691
    //   1687: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1690: athrow
    //   1691: aload_1
    //   1692: goto -> 1706
    //   1695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1698: athrow
    //   1699: aload_1
    //   1700: checkcast [B
    //   1703: invokevirtual clone : ()Ljava/lang/Object;
    //   1706: aastore
    //   1707: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1710: pop
    //   1711: iload_2
    //   1712: ifne -> 1729
    //   1715: iinc #6, 1
    //   1718: iload_2
    //   1719: ifne -> 1592
    //   1722: goto -> 1729
    //   1725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1728: athrow
    //   1729: getstatic burp/Zb0s.Zv : Ljava/lang/Object;
    //   1732: checkcast java/math/BigInteger
    //   1735: invokevirtual toByteArray : ()[B
    //   1738: astore #4
    //   1740: bipush #32
    //   1742: newarray int
    //   1744: dup
    //   1745: iconst_0
    //   1746: ldc 943331329
    //   1748: iastore
    //   1749: dup
    //   1750: iconst_1
    //   1751: ldc 170788368
    //   1753: iastore
    //   1754: dup
    //   1755: iconst_2
    //   1756: ldc 1008414755
    //   1758: iastore
    //   1759: dup
    //   1760: iconst_3
    //   1761: ldc 187049985
    //   1763: iastore
    //   1764: dup
    //   1765: iconst_4
    //   1766: ldc 1010368540
    //   1768: iastore
    //   1769: dup
    //   1770: iconst_5
    //   1771: ldc 220604441
    //   1773: iastore
    //   1774: dup
    //   1775: bipush #6
    //   1777: ldc 940377620
    //   1779: iastore
    //   1780: dup
    //   1781: bipush #7
    //   1783: ldc 255209728
    //   1785: iastore
    //   1786: dup
    //   1787: bipush #8
    //   1789: ldc 689771012
    //   1791: iastore
    //   1792: dup
    //   1793: bipush #9
    //   1795: ldc 221709344
    //   1797: iastore
    //   1798: dup
    //   1799: bipush #10
    //   1801: ldc 957157408
    //   1803: iastore
    //   1804: dup
    //   1805: bipush #11
    //   1807: ldc 892536332
    //   1809: iastore
    //   1810: dup
    //   1811: bipush #12
    //   1813: ldc 722417666
    //   1815: iastore
    //   1816: dup
    //   1817: bipush #13
    //   1819: ldc 1026621720
    //   1821: iastore
    //   1822: dup
    //   1823: bipush #14
    //   1825: ldc 655302664
    //   1827: iastore
    //   1828: dup
    //   1829: bipush #15
    //   1831: ldc 890966315
    //   1833: iastore
    //   1834: dup
    //   1835: bipush #16
    //   1837: ldc 187632156
    //   1839: iastore
    //   1840: dup
    //   1841: bipush #17
    //   1843: ldc 874189824
    //   1845: iastore
    //   1846: dup
    //   1847: bipush #18
    //   1849: ldc 254150144
    //   1851: iastore
    //   1852: dup
    //   1853: bipush #19
    //   1855: ldc 924386310
    //   1857: iastore
    //   1858: dup
    //   1859: bipush #20
    //   1861: ldc 121057538
    //   1863: iastore
    //   1864: dup
    //   1865: bipush #21
    //   1867: ldc 840500228
    //   1869: iastore
    //   1870: dup
    //   1871: bipush #22
    //   1873: ldc 389160971
    //   1875: iastore
    //   1876: dup
    //   1877: bipush #23
    //   1879: ldc 907870729
    //   1881: iastore
    //   1882: dup
    //   1883: bipush #24
    //   1885: ldc 389426184
    //   1887: iastore
    //   1888: dup
    //   1889: bipush #25
    //   1891: ldc 973875457
    //   1893: iastore
    //   1894: dup
    //   1895: bipush #26
    //   1897: ldc 372376604
    //   1899: iastore
    //   1900: dup
    //   1901: bipush #27
    //   1903: ldc 707731490
    //   1905: iastore
    //   1906: dup
    //   1907: bipush #28
    //   1909: ldc 1043334948
    //   1911: iastore
    //   1912: dup
    //   1913: bipush #29
    //   1915: ldc 439222784
    //   1917: iastore
    //   1918: dup
    //   1919: bipush #30
    //   1921: ldc 876216579
    //   1923: iastore
    //   1924: dup
    //   1925: bipush #31
    //   1927: ldc 455999525
    //   1929: iastore
    //   1930: astore #6
    //   1932: bipush #8
    //   1934: aload #4
    //   1936: arraylength
    //   1937: bipush #8
    //   1939: irem
    //   1940: isub
    //   1941: istore #7
    //   1943: aload #4
    //   1945: arraylength
    //   1946: iload #7
    //   1948: iadd
    //   1949: newarray byte
    //   1951: astore #8
    //   1953: iconst_0
    //   1954: istore #9
    //   1956: iload #9
    //   1958: aload #4
    //   1960: arraylength
    //   1961: if_icmpge -> 1981
    //   1964: aload #8
    //   1966: iload #9
    //   1968: aload #4
    //   1970: iload #9
    //   1972: baload
    //   1973: bastore
    //   1974: iinc #9, 1
    //   1977: iload_2
    //   1978: ifne -> 1956
    //   1981: aload #4
    //   1983: arraylength
    //   1984: istore #9
    //   1986: iload #9
    //   1988: aload #8
    //   1990: arraylength
    //   1991: if_icmpge -> 2009
    //   1994: aload #8
    //   1996: iload #9
    //   1998: iload #7
    //   2000: i2b
    //   2001: bastore
    //   2002: iinc #9, 1
    //   2005: iload_2
    //   2006: ifne -> 1986
    //   2009: aload #8
    //   2011: astore #4
    //   2013: bipush #64
    //   2015: newarray int
    //   2017: dup
    //   2018: iconst_0
    //   2019: ldc 16843776
    //   2021: iastore
    //   2022: dup
    //   2023: iconst_1
    //   2024: iconst_0
    //   2025: iastore
    //   2026: dup
    //   2027: iconst_2
    //   2028: ldc 65536
    //   2030: iastore
    //   2031: dup
    //   2032: iconst_3
    //   2033: ldc 16843780
    //   2035: iastore
    //   2036: dup
    //   2037: iconst_4
    //   2038: ldc 16842756
    //   2040: iastore
    //   2041: dup
    //   2042: iconst_5
    //   2043: ldc 66564
    //   2045: iastore
    //   2046: dup
    //   2047: bipush #6
    //   2049: iconst_4
    //   2050: iastore
    //   2051: dup
    //   2052: bipush #7
    //   2054: ldc 65536
    //   2056: iastore
    //   2057: dup
    //   2058: bipush #8
    //   2060: sipush #1024
    //   2063: iastore
    //   2064: dup
    //   2065: bipush #9
    //   2067: ldc 16843776
    //   2069: iastore
    //   2070: dup
    //   2071: bipush #10
    //   2073: ldc 16843780
    //   2075: iastore
    //   2076: dup
    //   2077: bipush #11
    //   2079: sipush #1024
    //   2082: iastore
    //   2083: dup
    //   2084: bipush #12
    //   2086: ldc 16778244
    //   2088: iastore
    //   2089: dup
    //   2090: bipush #13
    //   2092: ldc 16842756
    //   2094: iastore
    //   2095: dup
    //   2096: bipush #14
    //   2098: ldc 16777216
    //   2100: iastore
    //   2101: dup
    //   2102: bipush #15
    //   2104: iconst_4
    //   2105: iastore
    //   2106: dup
    //   2107: bipush #16
    //   2109: sipush #1028
    //   2112: iastore
    //   2113: dup
    //   2114: bipush #17
    //   2116: ldc 16778240
    //   2118: iastore
    //   2119: dup
    //   2120: bipush #18
    //   2122: ldc 16778240
    //   2124: iastore
    //   2125: dup
    //   2126: bipush #19
    //   2128: ldc 66560
    //   2130: iastore
    //   2131: dup
    //   2132: bipush #20
    //   2134: ldc 66560
    //   2136: iastore
    //   2137: dup
    //   2138: bipush #21
    //   2140: ldc 16842752
    //   2142: iastore
    //   2143: dup
    //   2144: bipush #22
    //   2146: ldc 16842752
    //   2148: iastore
    //   2149: dup
    //   2150: bipush #23
    //   2152: ldc 16778244
    //   2154: iastore
    //   2155: dup
    //   2156: bipush #24
    //   2158: ldc 65540
    //   2160: iastore
    //   2161: dup
    //   2162: bipush #25
    //   2164: ldc 16777220
    //   2166: iastore
    //   2167: dup
    //   2168: bipush #26
    //   2170: ldc 16777220
    //   2172: iastore
    //   2173: dup
    //   2174: bipush #27
    //   2176: ldc 65540
    //   2178: iastore
    //   2179: dup
    //   2180: bipush #28
    //   2182: iconst_0
    //   2183: iastore
    //   2184: dup
    //   2185: bipush #29
    //   2187: sipush #1028
    //   2190: iastore
    //   2191: dup
    //   2192: bipush #30
    //   2194: ldc 66564
    //   2196: iastore
    //   2197: dup
    //   2198: bipush #31
    //   2200: ldc 16777216
    //   2202: iastore
    //   2203: dup
    //   2204: bipush #32
    //   2206: ldc 65536
    //   2208: iastore
    //   2209: dup
    //   2210: bipush #33
    //   2212: ldc 16843780
    //   2214: iastore
    //   2215: dup
    //   2216: bipush #34
    //   2218: iconst_4
    //   2219: iastore
    //   2220: dup
    //   2221: bipush #35
    //   2223: ldc 16842752
    //   2225: iastore
    //   2226: dup
    //   2227: bipush #36
    //   2229: ldc 16843776
    //   2231: iastore
    //   2232: dup
    //   2233: bipush #37
    //   2235: ldc 16777216
    //   2237: iastore
    //   2238: dup
    //   2239: bipush #38
    //   2241: ldc 16777216
    //   2243: iastore
    //   2244: dup
    //   2245: bipush #39
    //   2247: sipush #1024
    //   2250: iastore
    //   2251: dup
    //   2252: bipush #40
    //   2254: ldc 16842756
    //   2256: iastore
    //   2257: dup
    //   2258: bipush #41
    //   2260: ldc 65536
    //   2262: iastore
    //   2263: dup
    //   2264: bipush #42
    //   2266: ldc 66560
    //   2268: iastore
    //   2269: dup
    //   2270: bipush #43
    //   2272: ldc 16777220
    //   2274: iastore
    //   2275: dup
    //   2276: bipush #44
    //   2278: sipush #1024
    //   2281: iastore
    //   2282: dup
    //   2283: bipush #45
    //   2285: iconst_4
    //   2286: iastore
    //   2287: dup
    //   2288: bipush #46
    //   2290: ldc 16778244
    //   2292: iastore
    //   2293: dup
    //   2294: bipush #47
    //   2296: ldc 66564
    //   2298: iastore
    //   2299: dup
    //   2300: bipush #48
    //   2302: ldc 16843780
    //   2304: iastore
    //   2305: dup
    //   2306: bipush #49
    //   2308: ldc 65540
    //   2310: iastore
    //   2311: dup
    //   2312: bipush #50
    //   2314: ldc 16842752
    //   2316: iastore
    //   2317: dup
    //   2318: bipush #51
    //   2320: ldc 16778244
    //   2322: iastore
    //   2323: dup
    //   2324: bipush #52
    //   2326: ldc 16777220
    //   2328: iastore
    //   2329: dup
    //   2330: bipush #53
    //   2332: sipush #1028
    //   2335: iastore
    //   2336: dup
    //   2337: bipush #54
    //   2339: ldc 66564
    //   2341: iastore
    //   2342: dup
    //   2343: bipush #55
    //   2345: ldc 16843776
    //   2347: iastore
    //   2348: dup
    //   2349: bipush #56
    //   2351: sipush #1028
    //   2354: iastore
    //   2355: dup
    //   2356: bipush #57
    //   2358: ldc 16778240
    //   2360: iastore
    //   2361: dup
    //   2362: bipush #58
    //   2364: ldc 16778240
    //   2366: iastore
    //   2367: dup
    //   2368: bipush #59
    //   2370: iconst_0
    //   2371: iastore
    //   2372: dup
    //   2373: bipush #60
    //   2375: ldc 65540
    //   2377: iastore
    //   2378: dup
    //   2379: bipush #61
    //   2381: ldc 66560
    //   2383: iastore
    //   2384: dup
    //   2385: bipush #62
    //   2387: iconst_0
    //   2388: iastore
    //   2389: dup
    //   2390: bipush #63
    //   2392: ldc 16842756
    //   2394: iastore
    //   2395: astore #9
    //   2397: bipush #64
    //   2399: newarray int
    //   2401: dup
    //   2402: iconst_0
    //   2403: ldc -2146402272
    //   2405: iastore
    //   2406: dup
    //   2407: iconst_1
    //   2408: ldc -2147450880
    //   2410: iastore
    //   2411: dup
    //   2412: iconst_2
    //   2413: ldc 32768
    //   2415: iastore
    //   2416: dup
    //   2417: iconst_3
    //   2418: ldc 1081376
    //   2420: iastore
    //   2421: dup
    //   2422: iconst_4
    //   2423: ldc 1048576
    //   2425: iastore
    //   2426: dup
    //   2427: iconst_5
    //   2428: bipush #32
    //   2430: iastore
    //   2431: dup
    //   2432: bipush #6
    //   2434: ldc -2146435040
    //   2436: iastore
    //   2437: dup
    //   2438: bipush #7
    //   2440: ldc -2147450848
    //   2442: iastore
    //   2443: dup
    //   2444: bipush #8
    //   2446: ldc -2147483616
    //   2448: iastore
    //   2449: dup
    //   2450: bipush #9
    //   2452: ldc -2146402272
    //   2454: iastore
    //   2455: dup
    //   2456: bipush #10
    //   2458: ldc -2146402304
    //   2460: iastore
    //   2461: dup
    //   2462: bipush #11
    //   2464: ldc -2147483648
    //   2466: iastore
    //   2467: dup
    //   2468: bipush #12
    //   2470: ldc -2147450880
    //   2472: iastore
    //   2473: dup
    //   2474: bipush #13
    //   2476: ldc 1048576
    //   2478: iastore
    //   2479: dup
    //   2480: bipush #14
    //   2482: bipush #32
    //   2484: iastore
    //   2485: dup
    //   2486: bipush #15
    //   2488: ldc -2146435040
    //   2490: iastore
    //   2491: dup
    //   2492: bipush #16
    //   2494: ldc 1081344
    //   2496: iastore
    //   2497: dup
    //   2498: bipush #17
    //   2500: ldc 1048608
    //   2502: iastore
    //   2503: dup
    //   2504: bipush #18
    //   2506: ldc -2147450848
    //   2508: iastore
    //   2509: dup
    //   2510: bipush #19
    //   2512: iconst_0
    //   2513: iastore
    //   2514: dup
    //   2515: bipush #20
    //   2517: ldc -2147483648
    //   2519: iastore
    //   2520: dup
    //   2521: bipush #21
    //   2523: ldc 32768
    //   2525: iastore
    //   2526: dup
    //   2527: bipush #22
    //   2529: ldc 1081376
    //   2531: iastore
    //   2532: dup
    //   2533: bipush #23
    //   2535: ldc -2146435072
    //   2537: iastore
    //   2538: dup
    //   2539: bipush #24
    //   2541: ldc 1048608
    //   2543: iastore
    //   2544: dup
    //   2545: bipush #25
    //   2547: ldc -2147483616
    //   2549: iastore
    //   2550: dup
    //   2551: bipush #26
    //   2553: iconst_0
    //   2554: iastore
    //   2555: dup
    //   2556: bipush #27
    //   2558: ldc 1081344
    //   2560: iastore
    //   2561: dup
    //   2562: bipush #28
    //   2564: ldc 32800
    //   2566: iastore
    //   2567: dup
    //   2568: bipush #29
    //   2570: ldc -2146402304
    //   2572: iastore
    //   2573: dup
    //   2574: bipush #30
    //   2576: ldc -2146435072
    //   2578: iastore
    //   2579: dup
    //   2580: bipush #31
    //   2582: ldc 32800
    //   2584: iastore
    //   2585: dup
    //   2586: bipush #32
    //   2588: iconst_0
    //   2589: iastore
    //   2590: dup
    //   2591: bipush #33
    //   2593: ldc 1081376
    //   2595: iastore
    //   2596: dup
    //   2597: bipush #34
    //   2599: ldc -2146435040
    //   2601: iastore
    //   2602: dup
    //   2603: bipush #35
    //   2605: ldc 1048576
    //   2607: iastore
    //   2608: dup
    //   2609: bipush #36
    //   2611: ldc -2147450848
    //   2613: iastore
    //   2614: dup
    //   2615: bipush #37
    //   2617: ldc -2146435072
    //   2619: iastore
    //   2620: dup
    //   2621: bipush #38
    //   2623: ldc -2146402304
    //   2625: iastore
    //   2626: dup
    //   2627: bipush #39
    //   2629: ldc 32768
    //   2631: iastore
    //   2632: dup
    //   2633: bipush #40
    //   2635: ldc -2146435072
    //   2637: iastore
    //   2638: dup
    //   2639: bipush #41
    //   2641: ldc -2147450880
    //   2643: iastore
    //   2644: dup
    //   2645: bipush #42
    //   2647: bipush #32
    //   2649: iastore
    //   2650: dup
    //   2651: bipush #43
    //   2653: ldc -2146402272
    //   2655: iastore
    //   2656: dup
    //   2657: bipush #44
    //   2659: ldc 1081376
    //   2661: iastore
    //   2662: dup
    //   2663: bipush #45
    //   2665: bipush #32
    //   2667: iastore
    //   2668: dup
    //   2669: bipush #46
    //   2671: ldc 32768
    //   2673: iastore
    //   2674: dup
    //   2675: bipush #47
    //   2677: ldc -2147483648
    //   2679: iastore
    //   2680: dup
    //   2681: bipush #48
    //   2683: ldc 32800
    //   2685: iastore
    //   2686: dup
    //   2687: bipush #49
    //   2689: ldc -2146402304
    //   2691: iastore
    //   2692: dup
    //   2693: bipush #50
    //   2695: ldc 1048576
    //   2697: iastore
    //   2698: dup
    //   2699: bipush #51
    //   2701: ldc -2147483616
    //   2703: iastore
    //   2704: dup
    //   2705: bipush #52
    //   2707: ldc 1048608
    //   2709: iastore
    //   2710: dup
    //   2711: bipush #53
    //   2713: ldc -2147450848
    //   2715: iastore
    //   2716: dup
    //   2717: bipush #54
    //   2719: ldc -2147483616
    //   2721: iastore
    //   2722: dup
    //   2723: bipush #55
    //   2725: ldc 1048608
    //   2727: iastore
    //   2728: dup
    //   2729: bipush #56
    //   2731: ldc 1081344
    //   2733: iastore
    //   2734: dup
    //   2735: bipush #57
    //   2737: iconst_0
    //   2738: iastore
    //   2739: dup
    //   2740: bipush #58
    //   2742: ldc -2147450880
    //   2744: iastore
    //   2745: dup
    //   2746: bipush #59
    //   2748: ldc 32800
    //   2750: iastore
    //   2751: dup
    //   2752: bipush #60
    //   2754: ldc -2147483648
    //   2756: iastore
    //   2757: dup
    //   2758: bipush #61
    //   2760: ldc -2146435040
    //   2762: iastore
    //   2763: dup
    //   2764: bipush #62
    //   2766: ldc -2146402272
    //   2768: iastore
    //   2769: dup
    //   2770: bipush #63
    //   2772: ldc 1081344
    //   2774: iastore
    //   2775: astore #10
    //   2777: bipush #64
    //   2779: newarray int
    //   2781: dup
    //   2782: iconst_0
    //   2783: sipush #520
    //   2786: iastore
    //   2787: dup
    //   2788: iconst_1
    //   2789: ldc 134349312
    //   2791: iastore
    //   2792: dup
    //   2793: iconst_2
    //   2794: iconst_0
    //   2795: iastore
    //   2796: dup
    //   2797: iconst_3
    //   2798: ldc 134348808
    //   2800: iastore
    //   2801: dup
    //   2802: iconst_4
    //   2803: ldc 134218240
    //   2805: iastore
    //   2806: dup
    //   2807: iconst_5
    //   2808: iconst_0
    //   2809: iastore
    //   2810: dup
    //   2811: bipush #6
    //   2813: ldc 131592
    //   2815: iastore
    //   2816: dup
    //   2817: bipush #7
    //   2819: ldc 134218240
    //   2821: iastore
    //   2822: dup
    //   2823: bipush #8
    //   2825: ldc 131080
    //   2827: iastore
    //   2828: dup
    //   2829: bipush #9
    //   2831: ldc 134217736
    //   2833: iastore
    //   2834: dup
    //   2835: bipush #10
    //   2837: ldc 134217736
    //   2839: iastore
    //   2840: dup
    //   2841: bipush #11
    //   2843: ldc 131072
    //   2845: iastore
    //   2846: dup
    //   2847: bipush #12
    //   2849: ldc 134349320
    //   2851: iastore
    //   2852: dup
    //   2853: bipush #13
    //   2855: ldc 131080
    //   2857: iastore
    //   2858: dup
    //   2859: bipush #14
    //   2861: ldc 134348800
    //   2863: iastore
    //   2864: dup
    //   2865: bipush #15
    //   2867: sipush #520
    //   2870: iastore
    //   2871: dup
    //   2872: bipush #16
    //   2874: ldc 134217728
    //   2876: iastore
    //   2877: dup
    //   2878: bipush #17
    //   2880: bipush #8
    //   2882: iastore
    //   2883: dup
    //   2884: bipush #18
    //   2886: ldc 134349312
    //   2888: iastore
    //   2889: dup
    //   2890: bipush #19
    //   2892: sipush #512
    //   2895: iastore
    //   2896: dup
    //   2897: bipush #20
    //   2899: ldc 131584
    //   2901: iastore
    //   2902: dup
    //   2903: bipush #21
    //   2905: ldc 134348800
    //   2907: iastore
    //   2908: dup
    //   2909: bipush #22
    //   2911: ldc 134348808
    //   2913: iastore
    //   2914: dup
    //   2915: bipush #23
    //   2917: ldc 131592
    //   2919: iastore
    //   2920: dup
    //   2921: bipush #24
    //   2923: ldc 134218248
    //   2925: iastore
    //   2926: dup
    //   2927: bipush #25
    //   2929: ldc 131584
    //   2931: iastore
    //   2932: dup
    //   2933: bipush #26
    //   2935: ldc 131072
    //   2937: iastore
    //   2938: dup
    //   2939: bipush #27
    //   2941: ldc 134218248
    //   2943: iastore
    //   2944: dup
    //   2945: bipush #28
    //   2947: bipush #8
    //   2949: iastore
    //   2950: dup
    //   2951: bipush #29
    //   2953: ldc 134349320
    //   2955: iastore
    //   2956: dup
    //   2957: bipush #30
    //   2959: sipush #512
    //   2962: iastore
    //   2963: dup
    //   2964: bipush #31
    //   2966: ldc 134217728
    //   2968: iastore
    //   2969: dup
    //   2970: bipush #32
    //   2972: ldc 134349312
    //   2974: iastore
    //   2975: dup
    //   2976: bipush #33
    //   2978: ldc 134217728
    //   2980: iastore
    //   2981: dup
    //   2982: bipush #34
    //   2984: ldc 131080
    //   2986: iastore
    //   2987: dup
    //   2988: bipush #35
    //   2990: sipush #520
    //   2993: iastore
    //   2994: dup
    //   2995: bipush #36
    //   2997: ldc 131072
    //   2999: iastore
    //   3000: dup
    //   3001: bipush #37
    //   3003: ldc 134349312
    //   3005: iastore
    //   3006: dup
    //   3007: bipush #38
    //   3009: ldc 134218240
    //   3011: iastore
    //   3012: dup
    //   3013: bipush #39
    //   3015: iconst_0
    //   3016: iastore
    //   3017: dup
    //   3018: bipush #40
    //   3020: sipush #512
    //   3023: iastore
    //   3024: dup
    //   3025: bipush #41
    //   3027: ldc 131080
    //   3029: iastore
    //   3030: dup
    //   3031: bipush #42
    //   3033: ldc 134349320
    //   3035: iastore
    //   3036: dup
    //   3037: bipush #43
    //   3039: ldc 134218240
    //   3041: iastore
    //   3042: dup
    //   3043: bipush #44
    //   3045: ldc 134217736
    //   3047: iastore
    //   3048: dup
    //   3049: bipush #45
    //   3051: sipush #512
    //   3054: iastore
    //   3055: dup
    //   3056: bipush #46
    //   3058: iconst_0
    //   3059: iastore
    //   3060: dup
    //   3061: bipush #47
    //   3063: ldc 134348808
    //   3065: iastore
    //   3066: dup
    //   3067: bipush #48
    //   3069: ldc 134218248
    //   3071: iastore
    //   3072: dup
    //   3073: bipush #49
    //   3075: ldc 131072
    //   3077: iastore
    //   3078: dup
    //   3079: bipush #50
    //   3081: ldc 134217728
    //   3083: iastore
    //   3084: dup
    //   3085: bipush #51
    //   3087: ldc 134349320
    //   3089: iastore
    //   3090: dup
    //   3091: bipush #52
    //   3093: bipush #8
    //   3095: iastore
    //   3096: dup
    //   3097: bipush #53
    //   3099: ldc 131592
    //   3101: iastore
    //   3102: dup
    //   3103: bipush #54
    //   3105: ldc 131584
    //   3107: iastore
    //   3108: dup
    //   3109: bipush #55
    //   3111: ldc 134217736
    //   3113: iastore
    //   3114: dup
    //   3115: bipush #56
    //   3117: ldc 134348800
    //   3119: iastore
    //   3120: dup
    //   3121: bipush #57
    //   3123: ldc 134218248
    //   3125: iastore
    //   3126: dup
    //   3127: bipush #58
    //   3129: sipush #520
    //   3132: iastore
    //   3133: dup
    //   3134: bipush #59
    //   3136: ldc 134348800
    //   3138: iastore
    //   3139: dup
    //   3140: bipush #60
    //   3142: ldc 131592
    //   3144: iastore
    //   3145: dup
    //   3146: bipush #61
    //   3148: bipush #8
    //   3150: iastore
    //   3151: dup
    //   3152: bipush #62
    //   3154: ldc 134348808
    //   3156: iastore
    //   3157: dup
    //   3158: bipush #63
    //   3160: ldc 131584
    //   3162: iastore
    //   3163: astore #11
    //   3165: bipush #64
    //   3167: newarray int
    //   3169: dup
    //   3170: iconst_0
    //   3171: ldc 8396801
    //   3173: iastore
    //   3174: dup
    //   3175: iconst_1
    //   3176: sipush #8321
    //   3179: iastore
    //   3180: dup
    //   3181: iconst_2
    //   3182: sipush #8321
    //   3185: iastore
    //   3186: dup
    //   3187: iconst_3
    //   3188: sipush #128
    //   3191: iastore
    //   3192: dup
    //   3193: iconst_4
    //   3194: ldc 8396928
    //   3196: iastore
    //   3197: dup
    //   3198: iconst_5
    //   3199: ldc 8388737
    //   3201: iastore
    //   3202: dup
    //   3203: bipush #6
    //   3205: ldc 8388609
    //   3207: iastore
    //   3208: dup
    //   3209: bipush #7
    //   3211: sipush #8193
    //   3214: iastore
    //   3215: dup
    //   3216: bipush #8
    //   3218: iconst_0
    //   3219: iastore
    //   3220: dup
    //   3221: bipush #9
    //   3223: ldc 8396800
    //   3225: iastore
    //   3226: dup
    //   3227: bipush #10
    //   3229: ldc 8396800
    //   3231: iastore
    //   3232: dup
    //   3233: bipush #11
    //   3235: ldc 8396929
    //   3237: iastore
    //   3238: dup
    //   3239: bipush #12
    //   3241: sipush #129
    //   3244: iastore
    //   3245: dup
    //   3246: bipush #13
    //   3248: iconst_0
    //   3249: iastore
    //   3250: dup
    //   3251: bipush #14
    //   3253: ldc 8388736
    //   3255: iastore
    //   3256: dup
    //   3257: bipush #15
    //   3259: ldc 8388609
    //   3261: iastore
    //   3262: dup
    //   3263: bipush #16
    //   3265: iconst_1
    //   3266: iastore
    //   3267: dup
    //   3268: bipush #17
    //   3270: sipush #8192
    //   3273: iastore
    //   3274: dup
    //   3275: bipush #18
    //   3277: ldc 8388608
    //   3279: iastore
    //   3280: dup
    //   3281: bipush #19
    //   3283: ldc 8396801
    //   3285: iastore
    //   3286: dup
    //   3287: bipush #20
    //   3289: sipush #128
    //   3292: iastore
    //   3293: dup
    //   3294: bipush #21
    //   3296: ldc 8388608
    //   3298: iastore
    //   3299: dup
    //   3300: bipush #22
    //   3302: sipush #8193
    //   3305: iastore
    //   3306: dup
    //   3307: bipush #23
    //   3309: sipush #8320
    //   3312: iastore
    //   3313: dup
    //   3314: bipush #24
    //   3316: ldc 8388737
    //   3318: iastore
    //   3319: dup
    //   3320: bipush #25
    //   3322: iconst_1
    //   3323: iastore
    //   3324: dup
    //   3325: bipush #26
    //   3327: sipush #8320
    //   3330: iastore
    //   3331: dup
    //   3332: bipush #27
    //   3334: ldc 8388736
    //   3336: iastore
    //   3337: dup
    //   3338: bipush #28
    //   3340: sipush #8192
    //   3343: iastore
    //   3344: dup
    //   3345: bipush #29
    //   3347: ldc 8396928
    //   3349: iastore
    //   3350: dup
    //   3351: bipush #30
    //   3353: ldc 8396929
    //   3355: iastore
    //   3356: dup
    //   3357: bipush #31
    //   3359: sipush #129
    //   3362: iastore
    //   3363: dup
    //   3364: bipush #32
    //   3366: ldc 8388736
    //   3368: iastore
    //   3369: dup
    //   3370: bipush #33
    //   3372: ldc 8388609
    //   3374: iastore
    //   3375: dup
    //   3376: bipush #34
    //   3378: ldc 8396800
    //   3380: iastore
    //   3381: dup
    //   3382: bipush #35
    //   3384: ldc 8396929
    //   3386: iastore
    //   3387: dup
    //   3388: bipush #36
    //   3390: sipush #129
    //   3393: iastore
    //   3394: dup
    //   3395: bipush #37
    //   3397: iconst_0
    //   3398: iastore
    //   3399: dup
    //   3400: bipush #38
    //   3402: iconst_0
    //   3403: iastore
    //   3404: dup
    //   3405: bipush #39
    //   3407: ldc 8396800
    //   3409: iastore
    //   3410: dup
    //   3411: bipush #40
    //   3413: sipush #8320
    //   3416: iastore
    //   3417: dup
    //   3418: bipush #41
    //   3420: ldc 8388736
    //   3422: iastore
    //   3423: dup
    //   3424: bipush #42
    //   3426: ldc 8388737
    //   3428: iastore
    //   3429: dup
    //   3430: bipush #43
    //   3432: iconst_1
    //   3433: iastore
    //   3434: dup
    //   3435: bipush #44
    //   3437: ldc 8396801
    //   3439: iastore
    //   3440: dup
    //   3441: bipush #45
    //   3443: sipush #8321
    //   3446: iastore
    //   3447: dup
    //   3448: bipush #46
    //   3450: sipush #8321
    //   3453: iastore
    //   3454: dup
    //   3455: bipush #47
    //   3457: sipush #128
    //   3460: iastore
    //   3461: dup
    //   3462: bipush #48
    //   3464: ldc 8396929
    //   3466: iastore
    //   3467: dup
    //   3468: bipush #49
    //   3470: sipush #129
    //   3473: iastore
    //   3474: dup
    //   3475: bipush #50
    //   3477: iconst_1
    //   3478: iastore
    //   3479: dup
    //   3480: bipush #51
    //   3482: sipush #8192
    //   3485: iastore
    //   3486: dup
    //   3487: bipush #52
    //   3489: ldc 8388609
    //   3491: iastore
    //   3492: dup
    //   3493: bipush #53
    //   3495: sipush #8193
    //   3498: iastore
    //   3499: dup
    //   3500: bipush #54
    //   3502: ldc 8396928
    //   3504: iastore
    //   3505: dup
    //   3506: bipush #55
    //   3508: ldc 8388737
    //   3510: iastore
    //   3511: dup
    //   3512: bipush #56
    //   3514: sipush #8193
    //   3517: iastore
    //   3518: dup
    //   3519: bipush #57
    //   3521: sipush #8320
    //   3524: iastore
    //   3525: dup
    //   3526: bipush #58
    //   3528: ldc 8388608
    //   3530: iastore
    //   3531: dup
    //   3532: bipush #59
    //   3534: ldc 8396801
    //   3536: iastore
    //   3537: dup
    //   3538: bipush #60
    //   3540: sipush #128
    //   3543: iastore
    //   3544: dup
    //   3545: bipush #61
    //   3547: ldc 8388608
    //   3549: iastore
    //   3550: dup
    //   3551: bipush #62
    //   3553: sipush #8192
    //   3556: iastore
    //   3557: dup
    //   3558: bipush #63
    //   3560: ldc 8396928
    //   3562: iastore
    //   3563: astore #12
    //   3565: bipush #64
    //   3567: newarray int
    //   3569: dup
    //   3570: iconst_0
    //   3571: sipush #256
    //   3574: iastore
    //   3575: dup
    //   3576: iconst_1
    //   3577: ldc 34078976
    //   3579: iastore
    //   3580: dup
    //   3581: iconst_2
    //   3582: ldc 34078720
    //   3584: iastore
    //   3585: dup
    //   3586: iconst_3
    //   3587: ldc 1107296512
    //   3589: iastore
    //   3590: dup
    //   3591: iconst_4
    //   3592: ldc 524288
    //   3594: iastore
    //   3595: dup
    //   3596: iconst_5
    //   3597: sipush #256
    //   3600: iastore
    //   3601: dup
    //   3602: bipush #6
    //   3604: ldc 1073741824
    //   3606: iastore
    //   3607: dup
    //   3608: bipush #7
    //   3610: ldc 34078720
    //   3612: iastore
    //   3613: dup
    //   3614: bipush #8
    //   3616: ldc 1074266368
    //   3618: iastore
    //   3619: dup
    //   3620: bipush #9
    //   3622: ldc 524288
    //   3624: iastore
    //   3625: dup
    //   3626: bipush #10
    //   3628: ldc 33554688
    //   3630: iastore
    //   3631: dup
    //   3632: bipush #11
    //   3634: ldc 1074266368
    //   3636: iastore
    //   3637: dup
    //   3638: bipush #12
    //   3640: ldc 1107296512
    //   3642: iastore
    //   3643: dup
    //   3644: bipush #13
    //   3646: ldc 1107820544
    //   3648: iastore
    //   3649: dup
    //   3650: bipush #14
    //   3652: ldc 524544
    //   3654: iastore
    //   3655: dup
    //   3656: bipush #15
    //   3658: ldc 1073741824
    //   3660: iastore
    //   3661: dup
    //   3662: bipush #16
    //   3664: ldc 33554432
    //   3666: iastore
    //   3667: dup
    //   3668: bipush #17
    //   3670: ldc 1074266112
    //   3672: iastore
    //   3673: dup
    //   3674: bipush #18
    //   3676: ldc 1074266112
    //   3678: iastore
    //   3679: dup
    //   3680: bipush #19
    //   3682: iconst_0
    //   3683: iastore
    //   3684: dup
    //   3685: bipush #20
    //   3687: ldc 1073742080
    //   3689: iastore
    //   3690: dup
    //   3691: bipush #21
    //   3693: ldc 1107820800
    //   3695: iastore
    //   3696: dup
    //   3697: bipush #22
    //   3699: ldc 1107820800
    //   3701: iastore
    //   3702: dup
    //   3703: bipush #23
    //   3705: ldc 33554688
    //   3707: iastore
    //   3708: dup
    //   3709: bipush #24
    //   3711: ldc 1107820544
    //   3713: iastore
    //   3714: dup
    //   3715: bipush #25
    //   3717: ldc 1073742080
    //   3719: iastore
    //   3720: dup
    //   3721: bipush #26
    //   3723: iconst_0
    //   3724: iastore
    //   3725: dup
    //   3726: bipush #27
    //   3728: ldc 1107296256
    //   3730: iastore
    //   3731: dup
    //   3732: bipush #28
    //   3734: ldc 34078976
    //   3736: iastore
    //   3737: dup
    //   3738: bipush #29
    //   3740: ldc 33554432
    //   3742: iastore
    //   3743: dup
    //   3744: bipush #30
    //   3746: ldc 1107296256
    //   3748: iastore
    //   3749: dup
    //   3750: bipush #31
    //   3752: ldc 524544
    //   3754: iastore
    //   3755: dup
    //   3756: bipush #32
    //   3758: ldc 524288
    //   3760: iastore
    //   3761: dup
    //   3762: bipush #33
    //   3764: ldc 1107296512
    //   3766: iastore
    //   3767: dup
    //   3768: bipush #34
    //   3770: sipush #256
    //   3773: iastore
    //   3774: dup
    //   3775: bipush #35
    //   3777: ldc 33554432
    //   3779: iastore
    //   3780: dup
    //   3781: bipush #36
    //   3783: ldc 1073741824
    //   3785: iastore
    //   3786: dup
    //   3787: bipush #37
    //   3789: ldc 34078720
    //   3791: iastore
    //   3792: dup
    //   3793: bipush #38
    //   3795: ldc 1107296512
    //   3797: iastore
    //   3798: dup
    //   3799: bipush #39
    //   3801: ldc 1074266368
    //   3803: iastore
    //   3804: dup
    //   3805: bipush #40
    //   3807: ldc 33554688
    //   3809: iastore
    //   3810: dup
    //   3811: bipush #41
    //   3813: ldc 1073741824
    //   3815: iastore
    //   3816: dup
    //   3817: bipush #42
    //   3819: ldc 1107820544
    //   3821: iastore
    //   3822: dup
    //   3823: bipush #43
    //   3825: ldc 34078976
    //   3827: iastore
    //   3828: dup
    //   3829: bipush #44
    //   3831: ldc 1074266368
    //   3833: iastore
    //   3834: dup
    //   3835: bipush #45
    //   3837: sipush #256
    //   3840: iastore
    //   3841: dup
    //   3842: bipush #46
    //   3844: ldc 33554432
    //   3846: iastore
    //   3847: dup
    //   3848: bipush #47
    //   3850: ldc 1107820544
    //   3852: iastore
    //   3853: dup
    //   3854: bipush #48
    //   3856: ldc 1107820800
    //   3858: iastore
    //   3859: dup
    //   3860: bipush #49
    //   3862: ldc 524544
    //   3864: iastore
    //   3865: dup
    //   3866: bipush #50
    //   3868: ldc 1107296256
    //   3870: iastore
    //   3871: dup
    //   3872: bipush #51
    //   3874: ldc 1107820800
    //   3876: iastore
    //   3877: dup
    //   3878: bipush #52
    //   3880: ldc 34078720
    //   3882: iastore
    //   3883: dup
    //   3884: bipush #53
    //   3886: iconst_0
    //   3887: iastore
    //   3888: dup
    //   3889: bipush #54
    //   3891: ldc 1074266112
    //   3893: iastore
    //   3894: dup
    //   3895: bipush #55
    //   3897: ldc 1107296256
    //   3899: iastore
    //   3900: dup
    //   3901: bipush #56
    //   3903: ldc 524544
    //   3905: iastore
    //   3906: dup
    //   3907: bipush #57
    //   3909: ldc 33554688
    //   3911: iastore
    //   3912: dup
    //   3913: bipush #58
    //   3915: ldc 1073742080
    //   3917: iastore
    //   3918: dup
    //   3919: bipush #59
    //   3921: ldc 524288
    //   3923: iastore
    //   3924: dup
    //   3925: bipush #60
    //   3927: iconst_0
    //   3928: iastore
    //   3929: dup
    //   3930: bipush #61
    //   3932: ldc 1074266112
    //   3934: iastore
    //   3935: dup
    //   3936: bipush #62
    //   3938: ldc 34078976
    //   3940: iastore
    //   3941: dup
    //   3942: bipush #63
    //   3944: ldc 1073742080
    //   3946: iastore
    //   3947: astore #13
    //   3949: bipush #64
    //   3951: newarray int
    //   3953: dup
    //   3954: iconst_0
    //   3955: ldc 536870928
    //   3957: iastore
    //   3958: dup
    //   3959: iconst_1
    //   3960: ldc 541065216
    //   3962: iastore
    //   3963: dup
    //   3964: iconst_2
    //   3965: sipush #16384
    //   3968: iastore
    //   3969: dup
    //   3970: iconst_3
    //   3971: ldc 541081616
    //   3973: iastore
    //   3974: dup
    //   3975: iconst_4
    //   3976: ldc 541065216
    //   3978: iastore
    //   3979: dup
    //   3980: iconst_5
    //   3981: bipush #16
    //   3983: iastore
    //   3984: dup
    //   3985: bipush #6
    //   3987: ldc 541081616
    //   3989: iastore
    //   3990: dup
    //   3991: bipush #7
    //   3993: ldc 4194304
    //   3995: iastore
    //   3996: dup
    //   3997: bipush #8
    //   3999: ldc 536887296
    //   4001: iastore
    //   4002: dup
    //   4003: bipush #9
    //   4005: ldc 4210704
    //   4007: iastore
    //   4008: dup
    //   4009: bipush #10
    //   4011: ldc 4194304
    //   4013: iastore
    //   4014: dup
    //   4015: bipush #11
    //   4017: ldc 536870928
    //   4019: iastore
    //   4020: dup
    //   4021: bipush #12
    //   4023: ldc 4194320
    //   4025: iastore
    //   4026: dup
    //   4027: bipush #13
    //   4029: ldc 536887296
    //   4031: iastore
    //   4032: dup
    //   4033: bipush #14
    //   4035: ldc 536870912
    //   4037: iastore
    //   4038: dup
    //   4039: bipush #15
    //   4041: sipush #16400
    //   4044: iastore
    //   4045: dup
    //   4046: bipush #16
    //   4048: iconst_0
    //   4049: iastore
    //   4050: dup
    //   4051: bipush #17
    //   4053: ldc 4194320
    //   4055: iastore
    //   4056: dup
    //   4057: bipush #18
    //   4059: ldc 536887312
    //   4061: iastore
    //   4062: dup
    //   4063: bipush #19
    //   4065: sipush #16384
    //   4068: iastore
    //   4069: dup
    //   4070: bipush #20
    //   4072: ldc 4210688
    //   4074: iastore
    //   4075: dup
    //   4076: bipush #21
    //   4078: ldc 536887312
    //   4080: iastore
    //   4081: dup
    //   4082: bipush #22
    //   4084: bipush #16
    //   4086: iastore
    //   4087: dup
    //   4088: bipush #23
    //   4090: ldc 541065232
    //   4092: iastore
    //   4093: dup
    //   4094: bipush #24
    //   4096: ldc 541065232
    //   4098: iastore
    //   4099: dup
    //   4100: bipush #25
    //   4102: iconst_0
    //   4103: iastore
    //   4104: dup
    //   4105: bipush #26
    //   4107: ldc 4210704
    //   4109: iastore
    //   4110: dup
    //   4111: bipush #27
    //   4113: ldc 541081600
    //   4115: iastore
    //   4116: dup
    //   4117: bipush #28
    //   4119: sipush #16400
    //   4122: iastore
    //   4123: dup
    //   4124: bipush #29
    //   4126: ldc 4210688
    //   4128: iastore
    //   4129: dup
    //   4130: bipush #30
    //   4132: ldc 541081600
    //   4134: iastore
    //   4135: dup
    //   4136: bipush #31
    //   4138: ldc 536870912
    //   4140: iastore
    //   4141: dup
    //   4142: bipush #32
    //   4144: ldc 536887296
    //   4146: iastore
    //   4147: dup
    //   4148: bipush #33
    //   4150: bipush #16
    //   4152: iastore
    //   4153: dup
    //   4154: bipush #34
    //   4156: ldc 541065232
    //   4158: iastore
    //   4159: dup
    //   4160: bipush #35
    //   4162: ldc 4210688
    //   4164: iastore
    //   4165: dup
    //   4166: bipush #36
    //   4168: ldc 541081616
    //   4170: iastore
    //   4171: dup
    //   4172: bipush #37
    //   4174: ldc 4194304
    //   4176: iastore
    //   4177: dup
    //   4178: bipush #38
    //   4180: sipush #16400
    //   4183: iastore
    //   4184: dup
    //   4185: bipush #39
    //   4187: ldc 536870928
    //   4189: iastore
    //   4190: dup
    //   4191: bipush #40
    //   4193: ldc 4194304
    //   4195: iastore
    //   4196: dup
    //   4197: bipush #41
    //   4199: ldc 536887296
    //   4201: iastore
    //   4202: dup
    //   4203: bipush #42
    //   4205: ldc 536870912
    //   4207: iastore
    //   4208: dup
    //   4209: bipush #43
    //   4211: sipush #16400
    //   4214: iastore
    //   4215: dup
    //   4216: bipush #44
    //   4218: ldc 536870928
    //   4220: iastore
    //   4221: dup
    //   4222: bipush #45
    //   4224: ldc 541081616
    //   4226: iastore
    //   4227: dup
    //   4228: bipush #46
    //   4230: ldc 4210688
    //   4232: iastore
    //   4233: dup
    //   4234: bipush #47
    //   4236: ldc 541065216
    //   4238: iastore
    //   4239: dup
    //   4240: bipush #48
    //   4242: ldc 4210704
    //   4244: iastore
    //   4245: dup
    //   4246: bipush #49
    //   4248: ldc 541081600
    //   4250: iastore
    //   4251: dup
    //   4252: bipush #50
    //   4254: iconst_0
    //   4255: iastore
    //   4256: dup
    //   4257: bipush #51
    //   4259: ldc 541065232
    //   4261: iastore
    //   4262: dup
    //   4263: bipush #52
    //   4265: bipush #16
    //   4267: iastore
    //   4268: dup
    //   4269: bipush #53
    //   4271: sipush #16384
    //   4274: iastore
    //   4275: dup
    //   4276: bipush #54
    //   4278: ldc 541065216
    //   4280: iastore
    //   4281: dup
    //   4282: bipush #55
    //   4284: ldc 4210704
    //   4286: iastore
    //   4287: dup
    //   4288: bipush #56
    //   4290: sipush #16384
    //   4293: iastore
    //   4294: dup
    //   4295: bipush #57
    //   4297: ldc 4194320
    //   4299: iastore
    //   4300: dup
    //   4301: bipush #58
    //   4303: ldc 536887312
    //   4305: iastore
    //   4306: dup
    //   4307: bipush #59
    //   4309: iconst_0
    //   4310: iastore
    //   4311: dup
    //   4312: bipush #60
    //   4314: ldc 541081600
    //   4316: iastore
    //   4317: dup
    //   4318: bipush #61
    //   4320: ldc 536870912
    //   4322: iastore
    //   4323: dup
    //   4324: bipush #62
    //   4326: ldc 4194320
    //   4328: iastore
    //   4329: dup
    //   4330: bipush #63
    //   4332: ldc 536887312
    //   4334: iastore
    //   4335: astore #14
    //   4337: bipush #64
    //   4339: newarray int
    //   4341: dup
    //   4342: iconst_0
    //   4343: ldc 2097152
    //   4345: iastore
    //   4346: dup
    //   4347: iconst_1
    //   4348: ldc 69206018
    //   4350: iastore
    //   4351: dup
    //   4352: iconst_2
    //   4353: ldc 67110914
    //   4355: iastore
    //   4356: dup
    //   4357: iconst_3
    //   4358: iconst_0
    //   4359: iastore
    //   4360: dup
    //   4361: iconst_4
    //   4362: sipush #2048
    //   4365: iastore
    //   4366: dup
    //   4367: iconst_5
    //   4368: ldc 67110914
    //   4370: iastore
    //   4371: dup
    //   4372: bipush #6
    //   4374: ldc 2099202
    //   4376: iastore
    //   4377: dup
    //   4378: bipush #7
    //   4380: ldc 69208064
    //   4382: iastore
    //   4383: dup
    //   4384: bipush #8
    //   4386: ldc 69208066
    //   4388: iastore
    //   4389: dup
    //   4390: bipush #9
    //   4392: ldc 2097152
    //   4394: iastore
    //   4395: dup
    //   4396: bipush #10
    //   4398: iconst_0
    //   4399: iastore
    //   4400: dup
    //   4401: bipush #11
    //   4403: ldc 67108866
    //   4405: iastore
    //   4406: dup
    //   4407: bipush #12
    //   4409: iconst_2
    //   4410: iastore
    //   4411: dup
    //   4412: bipush #13
    //   4414: ldc 67108864
    //   4416: iastore
    //   4417: dup
    //   4418: bipush #14
    //   4420: ldc 69206018
    //   4422: iastore
    //   4423: dup
    //   4424: bipush #15
    //   4426: sipush #2050
    //   4429: iastore
    //   4430: dup
    //   4431: bipush #16
    //   4433: ldc 67110912
    //   4435: iastore
    //   4436: dup
    //   4437: bipush #17
    //   4439: ldc 2099202
    //   4441: iastore
    //   4442: dup
    //   4443: bipush #18
    //   4445: ldc 2097154
    //   4447: iastore
    //   4448: dup
    //   4449: bipush #19
    //   4451: ldc 67110912
    //   4453: iastore
    //   4454: dup
    //   4455: bipush #20
    //   4457: ldc 67108866
    //   4459: iastore
    //   4460: dup
    //   4461: bipush #21
    //   4463: ldc 69206016
    //   4465: iastore
    //   4466: dup
    //   4467: bipush #22
    //   4469: ldc 69208064
    //   4471: iastore
    //   4472: dup
    //   4473: bipush #23
    //   4475: ldc 2097154
    //   4477: iastore
    //   4478: dup
    //   4479: bipush #24
    //   4481: ldc 69206016
    //   4483: iastore
    //   4484: dup
    //   4485: bipush #25
    //   4487: sipush #2048
    //   4490: iastore
    //   4491: dup
    //   4492: bipush #26
    //   4494: sipush #2050
    //   4497: iastore
    //   4498: dup
    //   4499: bipush #27
    //   4501: ldc 69208066
    //   4503: iastore
    //   4504: dup
    //   4505: bipush #28
    //   4507: ldc 2099200
    //   4509: iastore
    //   4510: dup
    //   4511: bipush #29
    //   4513: iconst_2
    //   4514: iastore
    //   4515: dup
    //   4516: bipush #30
    //   4518: ldc 67108864
    //   4520: iastore
    //   4521: dup
    //   4522: bipush #31
    //   4524: ldc 2099200
    //   4526: iastore
    //   4527: dup
    //   4528: bipush #32
    //   4530: ldc 67108864
    //   4532: iastore
    //   4533: dup
    //   4534: bipush #33
    //   4536: ldc 2099200
    //   4538: iastore
    //   4539: dup
    //   4540: bipush #34
    //   4542: ldc 2097152
    //   4544: iastore
    //   4545: dup
    //   4546: bipush #35
    //   4548: ldc 67110914
    //   4550: iastore
    //   4551: dup
    //   4552: bipush #36
    //   4554: ldc 67110914
    //   4556: iastore
    //   4557: dup
    //   4558: bipush #37
    //   4560: ldc 69206018
    //   4562: iastore
    //   4563: dup
    //   4564: bipush #38
    //   4566: ldc 69206018
    //   4568: iastore
    //   4569: dup
    //   4570: bipush #39
    //   4572: iconst_2
    //   4573: iastore
    //   4574: dup
    //   4575: bipush #40
    //   4577: ldc 2097154
    //   4579: iastore
    //   4580: dup
    //   4581: bipush #41
    //   4583: ldc 67108864
    //   4585: iastore
    //   4586: dup
    //   4587: bipush #42
    //   4589: ldc 67110912
    //   4591: iastore
    //   4592: dup
    //   4593: bipush #43
    //   4595: ldc 2097152
    //   4597: iastore
    //   4598: dup
    //   4599: bipush #44
    //   4601: ldc 69208064
    //   4603: iastore
    //   4604: dup
    //   4605: bipush #45
    //   4607: sipush #2050
    //   4610: iastore
    //   4611: dup
    //   4612: bipush #46
    //   4614: ldc 2099202
    //   4616: iastore
    //   4617: dup
    //   4618: bipush #47
    //   4620: ldc 69208064
    //   4622: iastore
    //   4623: dup
    //   4624: bipush #48
    //   4626: sipush #2050
    //   4629: iastore
    //   4630: dup
    //   4631: bipush #49
    //   4633: ldc 67108866
    //   4635: iastore
    //   4636: dup
    //   4637: bipush #50
    //   4639: ldc 69208066
    //   4641: iastore
    //   4642: dup
    //   4643: bipush #51
    //   4645: ldc 69206016
    //   4647: iastore
    //   4648: dup
    //   4649: bipush #52
    //   4651: ldc 2099200
    //   4653: iastore
    //   4654: dup
    //   4655: bipush #53
    //   4657: iconst_0
    //   4658: iastore
    //   4659: dup
    //   4660: bipush #54
    //   4662: iconst_2
    //   4663: iastore
    //   4664: dup
    //   4665: bipush #55
    //   4667: ldc 69208066
    //   4669: iastore
    //   4670: dup
    //   4671: bipush #56
    //   4673: iconst_0
    //   4674: iastore
    //   4675: dup
    //   4676: bipush #57
    //   4678: ldc 2099202
    //   4680: iastore
    //   4681: dup
    //   4682: bipush #58
    //   4684: ldc 69206016
    //   4686: iastore
    //   4687: dup
    //   4688: bipush #59
    //   4690: sipush #2048
    //   4693: iastore
    //   4694: dup
    //   4695: bipush #60
    //   4697: ldc 67108866
    //   4699: iastore
    //   4700: dup
    //   4701: bipush #61
    //   4703: ldc 67110912
    //   4705: iastore
    //   4706: dup
    //   4707: bipush #62
    //   4709: sipush #2048
    //   4712: iastore
    //   4713: dup
    //   4714: bipush #63
    //   4716: ldc 2097154
    //   4718: iastore
    //   4719: astore #15
    //   4721: bipush #64
    //   4723: newarray int
    //   4725: dup
    //   4726: iconst_0
    //   4727: ldc 268439616
    //   4729: iastore
    //   4730: dup
    //   4731: iconst_1
    //   4732: sipush #4096
    //   4735: iastore
    //   4736: dup
    //   4737: iconst_2
    //   4738: ldc 262144
    //   4740: iastore
    //   4741: dup
    //   4742: iconst_3
    //   4743: ldc 268701760
    //   4745: iastore
    //   4746: dup
    //   4747: iconst_4
    //   4748: ldc 268435456
    //   4750: iastore
    //   4751: dup
    //   4752: iconst_5
    //   4753: ldc 268439616
    //   4755: iastore
    //   4756: dup
    //   4757: bipush #6
    //   4759: bipush #64
    //   4761: iastore
    //   4762: dup
    //   4763: bipush #7
    //   4765: ldc 268435456
    //   4767: iastore
    //   4768: dup
    //   4769: bipush #8
    //   4771: ldc 262208
    //   4773: iastore
    //   4774: dup
    //   4775: bipush #9
    //   4777: ldc 268697600
    //   4779: iastore
    //   4780: dup
    //   4781: bipush #10
    //   4783: ldc 268701760
    //   4785: iastore
    //   4786: dup
    //   4787: bipush #11
    //   4789: ldc 266240
    //   4791: iastore
    //   4792: dup
    //   4793: bipush #12
    //   4795: ldc 268701696
    //   4797: iastore
    //   4798: dup
    //   4799: bipush #13
    //   4801: ldc 266304
    //   4803: iastore
    //   4804: dup
    //   4805: bipush #14
    //   4807: sipush #4096
    //   4810: iastore
    //   4811: dup
    //   4812: bipush #15
    //   4814: bipush #64
    //   4816: iastore
    //   4817: dup
    //   4818: bipush #16
    //   4820: ldc 268697600
    //   4822: iastore
    //   4823: dup
    //   4824: bipush #17
    //   4826: ldc 268435520
    //   4828: iastore
    //   4829: dup
    //   4830: bipush #18
    //   4832: ldc 268439552
    //   4834: iastore
    //   4835: dup
    //   4836: bipush #19
    //   4838: sipush #4160
    //   4841: iastore
    //   4842: dup
    //   4843: bipush #20
    //   4845: ldc 266240
    //   4847: iastore
    //   4848: dup
    //   4849: bipush #21
    //   4851: ldc 262208
    //   4853: iastore
    //   4854: dup
    //   4855: bipush #22
    //   4857: ldc 268697664
    //   4859: iastore
    //   4860: dup
    //   4861: bipush #23
    //   4863: ldc 268701696
    //   4865: iastore
    //   4866: dup
    //   4867: bipush #24
    //   4869: sipush #4160
    //   4872: iastore
    //   4873: dup
    //   4874: bipush #25
    //   4876: iconst_0
    //   4877: iastore
    //   4878: dup
    //   4879: bipush #26
    //   4881: iconst_0
    //   4882: iastore
    //   4883: dup
    //   4884: bipush #27
    //   4886: ldc 268697664
    //   4888: iastore
    //   4889: dup
    //   4890: bipush #28
    //   4892: ldc 268435520
    //   4894: iastore
    //   4895: dup
    //   4896: bipush #29
    //   4898: ldc 268439552
    //   4900: iastore
    //   4901: dup
    //   4902: bipush #30
    //   4904: ldc 266304
    //   4906: iastore
    //   4907: dup
    //   4908: bipush #31
    //   4910: ldc 262144
    //   4912: iastore
    //   4913: dup
    //   4914: bipush #32
    //   4916: ldc 266304
    //   4918: iastore
    //   4919: dup
    //   4920: bipush #33
    //   4922: ldc 262144
    //   4924: iastore
    //   4925: dup
    //   4926: bipush #34
    //   4928: ldc 268701696
    //   4930: iastore
    //   4931: dup
    //   4932: bipush #35
    //   4934: sipush #4096
    //   4937: iastore
    //   4938: dup
    //   4939: bipush #36
    //   4941: bipush #64
    //   4943: iastore
    //   4944: dup
    //   4945: bipush #37
    //   4947: ldc 268697664
    //   4949: iastore
    //   4950: dup
    //   4951: bipush #38
    //   4953: sipush #4096
    //   4956: iastore
    //   4957: dup
    //   4958: bipush #39
    //   4960: ldc 266304
    //   4962: iastore
    //   4963: dup
    //   4964: bipush #40
    //   4966: ldc 268439552
    //   4968: iastore
    //   4969: dup
    //   4970: bipush #41
    //   4972: bipush #64
    //   4974: iastore
    //   4975: dup
    //   4976: bipush #42
    //   4978: ldc 268435520
    //   4980: iastore
    //   4981: dup
    //   4982: bipush #43
    //   4984: ldc 268697600
    //   4986: iastore
    //   4987: dup
    //   4988: bipush #44
    //   4990: ldc 268697664
    //   4992: iastore
    //   4993: dup
    //   4994: bipush #45
    //   4996: ldc 268435456
    //   4998: iastore
    //   4999: dup
    //   5000: bipush #46
    //   5002: ldc 262144
    //   5004: iastore
    //   5005: dup
    //   5006: bipush #47
    //   5008: ldc 268439616
    //   5010: iastore
    //   5011: dup
    //   5012: bipush #48
    //   5014: iconst_0
    //   5015: iastore
    //   5016: dup
    //   5017: bipush #49
    //   5019: ldc 268701760
    //   5021: iastore
    //   5022: dup
    //   5023: bipush #50
    //   5025: ldc 262208
    //   5027: iastore
    //   5028: dup
    //   5029: bipush #51
    //   5031: ldc 268435520
    //   5033: iastore
    //   5034: dup
    //   5035: bipush #52
    //   5037: ldc 268697600
    //   5039: iastore
    //   5040: dup
    //   5041: bipush #53
    //   5043: ldc 268439552
    //   5045: iastore
    //   5046: dup
    //   5047: bipush #54
    //   5049: ldc 268439616
    //   5051: iastore
    //   5052: dup
    //   5053: bipush #55
    //   5055: iconst_0
    //   5056: iastore
    //   5057: dup
    //   5058: bipush #56
    //   5060: ldc 268701760
    //   5062: iastore
    //   5063: dup
    //   5064: bipush #57
    //   5066: ldc 266240
    //   5068: iastore
    //   5069: dup
    //   5070: bipush #58
    //   5072: ldc 266240
    //   5074: iastore
    //   5075: dup
    //   5076: bipush #59
    //   5078: sipush #4160
    //   5081: iastore
    //   5082: dup
    //   5083: bipush #60
    //   5085: sipush #4160
    //   5088: iastore
    //   5089: dup
    //   5090: bipush #61
    //   5092: ldc 262208
    //   5094: iastore
    //   5095: dup
    //   5096: bipush #62
    //   5098: ldc 268435456
    //   5100: iastore
    //   5101: dup
    //   5102: bipush #63
    //   5104: ldc 268701696
    //   5106: iastore
    //   5107: astore #16
    //   5109: aload #4
    //   5111: arraylength
    //   5112: istore #17
    //   5114: iconst_2
    //   5115: newarray int
    //   5117: astore #18
    //   5119: iload #17
    //   5121: newarray byte
    //   5123: astore #5
    //   5125: iload #17
    //   5127: bipush #8
    //   5129: idiv
    //   5130: istore #19
    //   5132: iconst_0
    //   5133: istore #20
    //   5135: iload #20
    //   5137: iload #19
    //   5139: if_icmpge -> 6057
    //   5142: iload #20
    //   5144: bipush #8
    //   5146: imul
    //   5147: istore #21
    //   5149: iconst_0
    //   5150: istore #22
    //   5152: iload #22
    //   5154: iconst_2
    //   5155: if_icmpge -> 5244
    //   5158: aload #18
    //   5160: iload #22
    //   5162: aload #4
    //   5164: iload #21
    //   5166: iload #22
    //   5168: iconst_4
    //   5169: imul
    //   5170: iadd
    //   5171: baload
    //   5172: sipush #255
    //   5175: iand
    //   5176: bipush #24
    //   5178: ishl
    //   5179: aload #4
    //   5181: iload #21
    //   5183: iload #22
    //   5185: iconst_4
    //   5186: imul
    //   5187: iadd
    //   5188: iconst_1
    //   5189: iadd
    //   5190: baload
    //   5191: sipush #255
    //   5194: iand
    //   5195: bipush #16
    //   5197: ishl
    //   5198: ior
    //   5199: aload #4
    //   5201: iload #21
    //   5203: iload #22
    //   5205: iconst_4
    //   5206: imul
    //   5207: iadd
    //   5208: iconst_2
    //   5209: iadd
    //   5210: baload
    //   5211: sipush #255
    //   5214: iand
    //   5215: bipush #8
    //   5217: ishl
    //   5218: ior
    //   5219: aload #4
    //   5221: iload #21
    //   5223: iload #22
    //   5225: iconst_4
    //   5226: imul
    //   5227: iadd
    //   5228: iconst_3
    //   5229: iadd
    //   5230: baload
    //   5231: sipush #255
    //   5234: iand
    //   5235: ior
    //   5236: iastore
    //   5237: iinc #22, 1
    //   5240: iload_2
    //   5241: ifne -> 5152
    //   5244: iconst_0
    //   5245: istore #27
    //   5247: aload #18
    //   5249: iconst_0
    //   5250: iaload
    //   5251: istore #25
    //   5253: aload #18
    //   5255: iconst_1
    //   5256: iaload
    //   5257: istore #24
    //   5259: iload #25
    //   5261: iconst_4
    //   5262: iushr
    //   5263: iload #24
    //   5265: ixor
    //   5266: ldc 252645135
    //   5268: iand
    //   5269: istore #23
    //   5271: iload #24
    //   5273: iload #23
    //   5275: ixor
    //   5276: istore #24
    //   5278: iload #25
    //   5280: iload #23
    //   5282: iconst_4
    //   5283: ishl
    //   5284: ixor
    //   5285: istore #25
    //   5287: iload #25
    //   5289: bipush #16
    //   5291: iushr
    //   5292: iload #24
    //   5294: ixor
    //   5295: ldc 65535
    //   5297: iand
    //   5298: istore #23
    //   5300: iload #24
    //   5302: iload #23
    //   5304: ixor
    //   5305: istore #24
    //   5307: iload #25
    //   5309: iload #23
    //   5311: bipush #16
    //   5313: ishl
    //   5314: ixor
    //   5315: istore #25
    //   5317: iload #24
    //   5319: iconst_2
    //   5320: iushr
    //   5321: iload #25
    //   5323: ixor
    //   5324: ldc 858993459
    //   5326: iand
    //   5327: istore #23
    //   5329: iload #25
    //   5331: iload #23
    //   5333: ixor
    //   5334: istore #25
    //   5336: iload #24
    //   5338: iload #23
    //   5340: iconst_2
    //   5341: ishl
    //   5342: ixor
    //   5343: istore #24
    //   5345: iload #24
    //   5347: bipush #8
    //   5349: iushr
    //   5350: iload #25
    //   5352: ixor
    //   5353: ldc 16711935
    //   5355: iand
    //   5356: istore #23
    //   5358: iload #25
    //   5360: iload #23
    //   5362: ixor
    //   5363: istore #25
    //   5365: iload #24
    //   5367: iload #23
    //   5369: bipush #8
    //   5371: ishl
    //   5372: ixor
    //   5373: istore #24
    //   5375: iload #24
    //   5377: iconst_1
    //   5378: ishl
    //   5379: iload #24
    //   5381: bipush #31
    //   5383: iushr
    //   5384: iconst_1
    //   5385: iand
    //   5386: ior
    //   5387: istore #24
    //   5389: iload #25
    //   5391: iload #24
    //   5393: ixor
    //   5394: ldc -1431655766
    //   5396: iand
    //   5397: istore #23
    //   5399: iload #25
    //   5401: iload #23
    //   5403: ixor
    //   5404: istore #25
    //   5406: iload #24
    //   5408: iload #23
    //   5410: ixor
    //   5411: istore #24
    //   5413: iload #25
    //   5415: iconst_1
    //   5416: ishl
    //   5417: iload #25
    //   5419: bipush #31
    //   5421: iushr
    //   5422: iconst_1
    //   5423: iand
    //   5424: ior
    //   5425: istore #25
    //   5427: iconst_0
    //   5428: istore #26
    //   5430: iload #26
    //   5432: bipush #8
    //   5434: if_icmpge -> 5772
    //   5437: iload #24
    //   5439: bipush #28
    //   5441: ishl
    //   5442: iload #24
    //   5444: iconst_4
    //   5445: iushr
    //   5446: ior
    //   5447: istore #23
    //   5449: iload #23
    //   5451: aload #6
    //   5453: iload #27
    //   5455: iinc #27, 1
    //   5458: iaload
    //   5459: ixor
    //   5460: istore #23
    //   5462: aload #15
    //   5464: iload #23
    //   5466: bipush #63
    //   5468: iand
    //   5469: iaload
    //   5470: istore #22
    //   5472: iload #22
    //   5474: aload #13
    //   5476: iload #23
    //   5478: bipush #8
    //   5480: iushr
    //   5481: bipush #63
    //   5483: iand
    //   5484: iaload
    //   5485: ior
    //   5486: istore #22
    //   5488: iload #22
    //   5490: aload #11
    //   5492: iload #23
    //   5494: bipush #16
    //   5496: iushr
    //   5497: bipush #63
    //   5499: iand
    //   5500: iaload
    //   5501: ior
    //   5502: istore #22
    //   5504: iload #22
    //   5506: aload #9
    //   5508: iload #23
    //   5510: bipush #24
    //   5512: iushr
    //   5513: bipush #63
    //   5515: iand
    //   5516: iaload
    //   5517: ior
    //   5518: istore #22
    //   5520: iload #24
    //   5522: aload #6
    //   5524: iload #27
    //   5526: iinc #27, 1
    //   5529: iaload
    //   5530: ixor
    //   5531: istore #23
    //   5533: iload #22
    //   5535: aload #16
    //   5537: iload #23
    //   5539: bipush #63
    //   5541: iand
    //   5542: iaload
    //   5543: ior
    //   5544: istore #22
    //   5546: iload #22
    //   5548: aload #14
    //   5550: iload #23
    //   5552: bipush #8
    //   5554: iushr
    //   5555: bipush #63
    //   5557: iand
    //   5558: iaload
    //   5559: ior
    //   5560: istore #22
    //   5562: iload #22
    //   5564: aload #12
    //   5566: iload #23
    //   5568: bipush #16
    //   5570: iushr
    //   5571: bipush #63
    //   5573: iand
    //   5574: iaload
    //   5575: ior
    //   5576: istore #22
    //   5578: iload #22
    //   5580: aload #10
    //   5582: iload #23
    //   5584: bipush #24
    //   5586: iushr
    //   5587: bipush #63
    //   5589: iand
    //   5590: iaload
    //   5591: ior
    //   5592: istore #22
    //   5594: iload #25
    //   5596: iload #22
    //   5598: ixor
    //   5599: istore #25
    //   5601: iload #25
    //   5603: bipush #28
    //   5605: ishl
    //   5606: iload #25
    //   5608: iconst_4
    //   5609: iushr
    //   5610: ior
    //   5611: istore #23
    //   5613: iload #23
    //   5615: aload #6
    //   5617: iload #27
    //   5619: iinc #27, 1
    //   5622: iaload
    //   5623: ixor
    //   5624: istore #23
    //   5626: aload #15
    //   5628: iload #23
    //   5630: bipush #63
    //   5632: iand
    //   5633: iaload
    //   5634: istore #22
    //   5636: iload #22
    //   5638: aload #13
    //   5640: iload #23
    //   5642: bipush #8
    //   5644: iushr
    //   5645: bipush #63
    //   5647: iand
    //   5648: iaload
    //   5649: ior
    //   5650: istore #22
    //   5652: iload #22
    //   5654: aload #11
    //   5656: iload #23
    //   5658: bipush #16
    //   5660: iushr
    //   5661: bipush #63
    //   5663: iand
    //   5664: iaload
    //   5665: ior
    //   5666: istore #22
    //   5668: iload #22
    //   5670: aload #9
    //   5672: iload #23
    //   5674: bipush #24
    //   5676: iushr
    //   5677: bipush #63
    //   5679: iand
    //   5680: iaload
    //   5681: ior
    //   5682: istore #22
    //   5684: iload #25
    //   5686: aload #6
    //   5688: iload #27
    //   5690: iinc #27, 1
    //   5693: iaload
    //   5694: ixor
    //   5695: istore #23
    //   5697: iload #22
    //   5699: aload #16
    //   5701: iload #23
    //   5703: bipush #63
    //   5705: iand
    //   5706: iaload
    //   5707: ior
    //   5708: istore #22
    //   5710: iload #22
    //   5712: aload #14
    //   5714: iload #23
    //   5716: bipush #8
    //   5718: iushr
    //   5719: bipush #63
    //   5721: iand
    //   5722: iaload
    //   5723: ior
    //   5724: istore #22
    //   5726: iload #22
    //   5728: aload #12
    //   5730: iload #23
    //   5732: bipush #16
    //   5734: iushr
    //   5735: bipush #63
    //   5737: iand
    //   5738: iaload
    //   5739: ior
    //   5740: istore #22
    //   5742: iload #22
    //   5744: aload #10
    //   5746: iload #23
    //   5748: bipush #24
    //   5750: iushr
    //   5751: bipush #63
    //   5753: iand
    //   5754: iaload
    //   5755: ior
    //   5756: istore #22
    //   5758: iload #24
    //   5760: iload #22
    //   5762: ixor
    //   5763: istore #24
    //   5765: iinc #26, 1
    //   5768: iload_2
    //   5769: ifne -> 5430
    //   5772: iload #24
    //   5774: bipush #31
    //   5776: ishl
    //   5777: iload #24
    //   5779: iconst_1
    //   5780: iushr
    //   5781: ior
    //   5782: istore #24
    //   5784: iload #25
    //   5786: iload #24
    //   5788: ixor
    //   5789: ldc -1431655766
    //   5791: iand
    //   5792: istore #23
    //   5794: iload #25
    //   5796: iload #23
    //   5798: ixor
    //   5799: istore #25
    //   5801: iload #24
    //   5803: iload #23
    //   5805: ixor
    //   5806: istore #24
    //   5808: iload #25
    //   5810: bipush #31
    //   5812: ishl
    //   5813: iload #25
    //   5815: iconst_1
    //   5816: iushr
    //   5817: ior
    //   5818: istore #25
    //   5820: iload #25
    //   5822: bipush #8
    //   5824: iushr
    //   5825: iload #24
    //   5827: ixor
    //   5828: ldc 16711935
    //   5830: iand
    //   5831: istore #23
    //   5833: iload #24
    //   5835: iload #23
    //   5837: ixor
    //   5838: istore #24
    //   5840: iload #25
    //   5842: iload #23
    //   5844: bipush #8
    //   5846: ishl
    //   5847: ixor
    //   5848: istore #25
    //   5850: iload #25
    //   5852: iconst_2
    //   5853: iushr
    //   5854: iload #24
    //   5856: ixor
    //   5857: ldc 858993459
    //   5859: iand
    //   5860: istore #23
    //   5862: iload #24
    //   5864: iload #23
    //   5866: ixor
    //   5867: istore #24
    //   5869: iload #25
    //   5871: iload #23
    //   5873: iconst_2
    //   5874: ishl
    //   5875: ixor
    //   5876: istore #25
    //   5878: iload #24
    //   5880: bipush #16
    //   5882: iushr
    //   5883: iload #25
    //   5885: ixor
    //   5886: ldc 65535
    //   5888: iand
    //   5889: istore #23
    //   5891: iload #25
    //   5893: iload #23
    //   5895: ixor
    //   5896: istore #25
    //   5898: iload #24
    //   5900: iload #23
    //   5902: bipush #16
    //   5904: ishl
    //   5905: ixor
    //   5906: istore #24
    //   5908: iload #24
    //   5910: iconst_4
    //   5911: iushr
    //   5912: iload #25
    //   5914: ixor
    //   5915: ldc 252645135
    //   5917: iand
    //   5918: istore #23
    //   5920: iload #25
    //   5922: iload #23
    //   5924: ixor
    //   5925: istore #25
    //   5927: iload #24
    //   5929: iload #23
    //   5931: iconst_4
    //   5932: ishl
    //   5933: ixor
    //   5934: istore #24
    //   5936: aload #18
    //   5938: iconst_0
    //   5939: iload #24
    //   5941: iastore
    //   5942: aload #18
    //   5944: iconst_1
    //   5945: iload #25
    //   5947: iastore
    //   5948: iload #20
    //   5950: bipush #8
    //   5952: imul
    //   5953: istore #28
    //   5955: iconst_0
    //   5956: istore #29
    //   5958: iload #29
    //   5960: iconst_2
    //   5961: if_icmpge -> 6050
    //   5964: aload #5
    //   5966: iload #28
    //   5968: iload #29
    //   5970: iconst_4
    //   5971: imul
    //   5972: iadd
    //   5973: aload #18
    //   5975: iload #29
    //   5977: iaload
    //   5978: bipush #24
    //   5980: iushr
    //   5981: i2b
    //   5982: bastore
    //   5983: aload #5
    //   5985: iload #28
    //   5987: iload #29
    //   5989: iconst_4
    //   5990: imul
    //   5991: iadd
    //   5992: iconst_1
    //   5993: iadd
    //   5994: aload #18
    //   5996: iload #29
    //   5998: iaload
    //   5999: bipush #16
    //   6001: iushr
    //   6002: i2b
    //   6003: bastore
    //   6004: aload #5
    //   6006: iload #28
    //   6008: iload #29
    //   6010: iconst_4
    //   6011: imul
    //   6012: iadd
    //   6013: iconst_2
    //   6014: iadd
    //   6015: aload #18
    //   6017: iload #29
    //   6019: iaload
    //   6020: bipush #8
    //   6022: iushr
    //   6023: i2b
    //   6024: bastore
    //   6025: aload #5
    //   6027: iload #28
    //   6029: iload #29
    //   6031: iconst_4
    //   6032: imul
    //   6033: iadd
    //   6034: iconst_3
    //   6035: iadd
    //   6036: aload #18
    //   6038: iload #29
    //   6040: iaload
    //   6041: i2b
    //   6042: bastore
    //   6043: iinc #29, 1
    //   6046: iload_2
    //   6047: ifne -> 5958
    //   6050: iinc #20, 1
    //   6053: iload_2
    //   6054: ifne -> 5135
    //   6057: getstatic burp/Zk7f.ZA : Ljava/lang/String;
    //   6060: getstatic burp/Zm3s.ZW : Ljava/lang/Object;
    //   6063: checkcast java/math/BigInteger
    //   6066: invokevirtual intValue : ()I
    //   6069: bipush #32
    //   6071: irem
    //   6072: invokestatic abs : (I)I
    //   6075: invokevirtual charAt : (I)C
    //   6078: getstatic burp/Zlc5.Z_ : Ljava/lang/String;
    //   6081: getstatic burp/Zsej.ZT : Ljava/lang/Object;
    //   6084: checkcast java/math/BigInteger
    //   6087: invokevirtual intValue : ()I
    //   6090: bipush #32
    //   6092: irem
    //   6093: invokestatic abs : (I)I
    //   6096: invokevirtual charAt : (I)C
    //   6099: if_icmpgt -> 6206
    //   6102: getstatic burp/Zl88.Zd : Ljava/lang/String;
    //   6105: getstatic burp/Zmv9.Zw : Ljava/lang/Object;
    //   6108: checkcast java/math/BigInteger
    //   6111: invokevirtual intValue : ()I
    //   6114: bipush #32
    //   6116: irem
    //   6117: invokestatic abs : (I)I
    //   6120: invokevirtual charAt : (I)C
    //   6123: getstatic burp/Zxzv.ZI : Ljava/lang/String;
    //   6126: getstatic burp/Zb0s.Zv : Ljava/lang/Object;
    //   6129: checkcast java/math/BigInteger
    //   6132: invokevirtual intValue : ()I
    //   6135: bipush #32
    //   6137: irem
    //   6138: invokestatic abs : (I)I
    //   6141: invokevirtual charAt : (I)C
    //   6144: if_icmple -> 6206
    //   6147: goto -> 6154
    //   6150: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6153: athrow
    //   6154: getstatic burp/Ztfh.ZU : Ljava/lang/String;
    //   6157: getstatic burp/Zz9p.Zw : Ljava/lang/Object;
    //   6160: checkcast java/math/BigInteger
    //   6163: invokevirtual intValue : ()I
    //   6166: bipush #32
    //   6168: irem
    //   6169: invokestatic abs : (I)I
    //   6172: invokevirtual charAt : (I)C
    //   6175: getstatic burp/Zr_k.Zu : Ljava/lang/String;
    //   6178: getstatic burp/Zsn6.Zo : Ljava/lang/Object;
    //   6181: checkcast java/math/BigInteger
    //   6184: invokevirtual intValue : ()I
    //   6187: bipush #32
    //   6189: irem
    //   6190: invokestatic abs : (I)I
    //   6193: invokevirtual charAt : (I)C
    //   6196: if_icmpgt -> 6214
    //   6199: goto -> 6206
    //   6202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6205: athrow
    //   6206: iconst_1
    //   6207: goto -> 6215
    //   6210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6213: athrow
    //   6214: iconst_0
    //   6215: ireturn
    //   6216: astore_3
    //   6217: new java/lang/Exception
    //   6220: dup
    //   6221: aload_3
    //   6222: invokevirtual getMessage : ()Ljava/lang/String;
    //   6225: invokespecial <init> : (Ljava/lang/String;)V
    //   6228: athrow
    // Exception table:
    //   from	to	target	type
    //   4	6215	6216	java/lang/Throwable
    //   55	230	233	java/lang/Throwable
    //   200	267	270	java/lang/Throwable
    //   237	304	307	java/lang/Throwable
    //   274	341	344	java/lang/Throwable
    //   311	378	381	java/lang/Throwable
    //   348	415	418	java/lang/Throwable
    //   385	452	455	java/lang/Throwable
    //   422	489	492	java/lang/Throwable
    //   459	526	529	java/lang/Throwable
    //   496	563	566	java/lang/Throwable
    //   533	600	603	java/lang/Throwable
    //   570	637	640	java/lang/Throwable
    //   607	674	677	java/lang/Throwable
    //   644	711	714	java/lang/Throwable
    //   681	748	751	java/lang/Throwable
    //   718	785	788	java/lang/Throwable
    //   755	822	825	java/lang/Throwable
    //   792	859	862	java/lang/Throwable
    //   829	896	899	java/lang/Throwable
    //   866	933	936	java/lang/Throwable
    //   903	970	973	java/lang/Throwable
    //   940	1007	1010	java/lang/Throwable
    //   977	1044	1047	java/lang/Throwable
    //   1014	1081	1084	java/lang/Throwable
    //   1051	1118	1121	java/lang/Throwable
    //   1088	1155	1158	java/lang/Throwable
    //   1125	1192	1195	java/lang/Throwable
    //   1162	1229	1232	java/lang/Throwable
    //   1199	1266	1269	java/lang/Throwable
    //   1236	1303	1306	java/lang/Throwable
    //   1273	1340	1343	java/lang/Throwable
    //   1310	1373	1376	java/lang/Throwable
    //   1439	1453	1453	java/lang/Throwable
    //   1464	1477	1480	java/lang/Throwable
    //   1469	1492	1495	java/lang/Throwable
    //   1484	1510	1513	java/lang/Throwable
    //   1499	1540	1543	java/lang/Throwable
    //   1606	1633	1636	java/lang/Throwable
    //   1623	1654	1657	java/lang/Throwable
    //   1640	1684	1687	java/lang/Throwable
    //   1661	1695	1695	java/lang/Throwable
    //   1706	1722	1725	java/lang/Throwable
    //   6057	6147	6150	java/lang/Throwable
    //   6102	6199	6202	java/lang/Throwable
    //   6154	6210	6210	java/lang/Throwable
  }
  
  static void Zm(Object paramObject) {
    Zxx4.Zq = a(21632, -28161);
    Zxx4.Zo = new BigInteger(a(21636, 21506));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zvk.ZG.charAt(Math.abs(((BigInteger)Zbo2.ZQ).intValue() % 32)) > Zf.Zd.charAt(Math.abs(((BigInteger)Zvk.ZN).intValue() % 32))) {
          try {
            Zmy4.Zh(Class.forName(a(21639, 24501)));
            if (bool)
              Zm(Class.forName(a(21635, 9521))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zm(Class.forName(a(21635, 9521)));
    } catch (Throwable throwable) {}
  }
  
  static void Zv(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '°·¨¨¨#¢²\\tP@´Vw@\\b© LgªÊÐpÊ?ï\\nãQ[/ÖIa¬ì08Îr}Æ è°!¹JI+·r´dzcüÐã÷PÔ}:q\\t}Æ8mÃ}\\t¿\\rIÿ3B½»@L*ð"\\f¯ÞîÃ±®{ÍOôK+á|'[ÿªØ¯b¦âÃ_5\\rÜ$©ËKE?xçÝiXÇÙ4^r+ÛCÅº Q±¯i§UpÕg*'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #73
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
    //   68: ldc '²ý\\fùÉ-Kn3w'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_4
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zbqk.a : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbqk.b : [Ljava/lang/String;
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
    //   212: bipush #22
    //   214: goto -> 244
    //   217: bipush #29
    //   219: goto -> 244
    //   222: bipush #64
    //   224: goto -> 244
    //   227: bipush #54
    //   229: goto -> 244
    //   232: bipush #96
    //   234: goto -> 244
    //   237: bipush #63
    //   239: goto -> 244
    //   242: bipush #49
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: sipush #21633
    //   303: sipush #-31616
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zbqk.ZZ : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #108
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #30
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-31
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-115
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-86
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-123
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #41
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #19
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-82
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-92
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #28
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #52
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-114
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-85
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-114
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-107
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: iconst_m1
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #-47
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #-15
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #65
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #-10
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #37
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #113
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #-30
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #-32
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #-13
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #106
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #88
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #100
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #-7
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #-14
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #21
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zbqk.ZT : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5482) & 0xFFFF;
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
      char c = '²';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbqk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */