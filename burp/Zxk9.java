package burp;

import java.math.BigInteger;

class Zxk9 extends ClassLoader {
  static Object ZI;
  
  static String Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZK(Object paramObject) {
    Ze3j.ZI = a(31625, -386);
    Ze3j.Ze = new BigInteger(a(31618, 15424));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zrbp.Ze.charAt(Math.abs(((BigInteger)Zehi.Zb).intValue() % 32)) <= Zg0j.Ze.charAt(Math.abs(((BigInteger)Zbsr.ZD).intValue() % 32))) {
          try {
            Zmf6.ZJ(Class.forName(a(31622, 18462)));
            if (bool)
              Zl2g.Zp(Class.forName(a(31631, 29679))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zl2g.Zp(Class.forName(a(31631, 29679)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zh(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: sipush #31627
    //   7: sipush #14608
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic Zn : (Ljava/lang/Object;)V
    //   19: getstatic burp/Zsgl.Zn : Ljava/lang/Object;
    //   22: checkcast java/math/BigInteger
    //   25: getstatic burp/Zkyc.ZD : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   34: putstatic burp/Zbo7.Zl : Ljava/lang/Object;
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
    //   201: getstatic burp/Zrdy.ZO : Ljava/lang/String;
    //   204: getstatic burp/Zg7p.Zb : Ljava/lang/Object;
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
    //   238: getstatic burp/Zg0j.Ze : Ljava/lang/String;
    //   241: getstatic burp/Zb2s.Ze : Ljava/lang/Object;
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
    //   275: getstatic burp/Zsxm.Zq : Ljava/lang/String;
    //   278: getstatic burp/Zkmx.Zu : Ljava/lang/Object;
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
    //   312: getstatic burp/Zgss.Zc : Ljava/lang/String;
    //   315: getstatic burp/Zlos.Zk : Ljava/lang/Object;
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
    //   349: getstatic burp/Zg7p.ZA : Ljava/lang/String;
    //   352: getstatic burp/Ztbf.Zv : Ljava/lang/Object;
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
    //   386: getstatic burp/Zsby.Zx : Ljava/lang/String;
    //   389: getstatic burp/Ze13.ZD : Ljava/lang/Object;
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
    //   423: getstatic burp/Zbsr.Zq : Ljava/lang/String;
    //   426: getstatic burp/Zkbm.Zp : Ljava/lang/Object;
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
    //   460: getstatic burp/Zl88.Zd : Ljava/lang/String;
    //   463: getstatic burp/Zl_u.ZR : Ljava/lang/Object;
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
    //   497: getstatic burp/Zsm3.Zl : Ljava/lang/String;
    //   500: getstatic burp/Zxyp.ZZ : Ljava/lang/Object;
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
    //   534: getstatic burp/Zshq.Zi : Ljava/lang/String;
    //   537: getstatic burp/Zxo6.Zw : Ljava/lang/Object;
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
    //   571: getstatic burp/Zxzd.ZM : Ljava/lang/String;
    //   574: getstatic burp/Ze3j.Ze : Ljava/lang/Object;
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
    //   608: getstatic burp/Zzip.Za : Ljava/lang/String;
    //   611: getstatic burp/Zkyc.ZD : Ljava/lang/Object;
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
    //   645: getstatic burp/Zt4g.Zj : Ljava/lang/String;
    //   648: getstatic burp/Zl2q.Zg : Ljava/lang/Object;
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
    //   682: getstatic burp/Zsm3.Zl : Ljava/lang/String;
    //   685: getstatic burp/Zr0u.ZB : Ljava/lang/Object;
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
    //   719: getstatic burp/Zx4w.Zo : Ljava/lang/String;
    //   722: getstatic burp/Zlhm.ZT : Ljava/lang/Object;
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
    //   756: getstatic burp/Zgw0.ZL : Ljava/lang/String;
    //   759: getstatic burp/Ztbf.Zv : Ljava/lang/Object;
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
    //   793: getstatic burp/Zxzj.ZZ : Ljava/lang/String;
    //   796: getstatic burp/Zgss.Zl : Ljava/lang/Object;
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
    //   830: getstatic burp/Zl_u.Zc : Ljava/lang/String;
    //   833: getstatic burp/Zxo6.Zw : Ljava/lang/Object;
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
    //   867: getstatic burp/Zl2g.ZI : Ljava/lang/String;
    //   870: getstatic burp/Zlv6.ZN : Ljava/lang/Object;
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
    //   904: getstatic burp/Zb3z.Zi : Ljava/lang/String;
    //   907: getstatic burp/Zl2q.Zg : Ljava/lang/Object;
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
    //   941: getstatic burp/Zd1.ZN : Ljava/lang/String;
    //   944: getstatic burp/Zmj4.Zm : Ljava/lang/Object;
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
    //   978: getstatic burp/Zr0u.Z_ : Ljava/lang/String;
    //   981: getstatic burp/Zx4l.Zt : Ljava/lang/Object;
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
    //   1015: getstatic burp/Zgw0.ZL : Ljava/lang/String;
    //   1018: getstatic burp/Zer.Zk : Ljava/lang/Object;
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
    //   1052: getstatic burp/Zxk9.Zx : Ljava/lang/String;
    //   1055: getstatic burp/Zlv6.ZN : Ljava/lang/Object;
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
    //   1089: getstatic burp/Zl_u.Zc : Ljava/lang/String;
    //   1092: getstatic burp/Zt3l.Zq : Ljava/lang/Object;
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
    //   1126: getstatic burp/Zk8b.ZT : Ljava/lang/String;
    //   1129: getstatic burp/Zmj4.Zm : Ljava/lang/Object;
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
    //   1163: getstatic burp/Ze13.Zg : Ljava/lang/String;
    //   1166: getstatic burp/Zehi.Zb : Ljava/lang/Object;
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
    //   1200: getstatic burp/Zzk9.Zb : Ljava/lang/String;
    //   1203: getstatic burp/Zg_p.Zx : Ljava/lang/Object;
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
    //   1237: getstatic burp/Zk8b.ZT : Ljava/lang/String;
    //   1240: getstatic burp/Ze3d.Ze : Ljava/lang/Object;
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
    //   1274: getstatic burp/Zxl5.Zq : Ljava/lang/String;
    //   1277: getstatic burp/Ze3j.Ze : Ljava/lang/Object;
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
    //   1311: getstatic burp/Zrbp.Ze : Ljava/lang/String;
    //   1314: getstatic burp/Zkbm.Zp : Ljava/lang/Object;
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
    //   1348: getstatic burp/Zg7p.ZA : Ljava/lang/String;
    //   1351: getstatic burp/Ztnw.Zt : Ljava/lang/Object;
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
    //   1391: putstatic burp/Zr0u.Z_ : Ljava/lang/String;
    //   1394: sipush #31637
    //   1397: sipush #32185
    //   1400: invokestatic a : (II)Ljava/lang/String;
    //   1403: iconst_1
    //   1404: ldc burp/Zg_5
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
    //   1525: sipush #31630
    //   1528: sipush #-29732
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
    //   1567: sipush #31617
    //   1570: sipush #-4950
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
    //   1729: iconst_0
    //   1730: istore #4
    //   1732: getstatic burp/Zes_.ZM : Ljava/lang/String;
    //   1735: getstatic burp/Zsxj.Zi : Ljava/lang/Object;
    //   1738: checkcast java/math/BigInteger
    //   1741: invokevirtual intValue : ()I
    //   1744: bipush #32
    //   1746: irem
    //   1747: invokestatic abs : (I)I
    //   1750: invokevirtual charAt : (I)C
    //   1753: getstatic burp/Zm0s.Zm : Ljava/lang/String;
    //   1756: getstatic burp/Zr0u.ZB : Ljava/lang/Object;
    //   1759: checkcast java/math/BigInteger
    //   1762: invokevirtual intValue : ()I
    //   1765: bipush #32
    //   1767: irem
    //   1768: invokestatic abs : (I)I
    //   1771: invokevirtual charAt : (I)C
    //   1774: if_icmpgt -> 2119
    //   1777: sipush #31619
    //   1780: sipush #131
    //   1783: invokestatic a : (II)Ljava/lang/String;
    //   1786: iconst_1
    //   1787: ldc burp/Zluk
    //   1789: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1792: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1795: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1798: astore #5
    //   1800: aload #5
    //   1802: arraylength
    //   1803: istore #6
    //   1805: iconst_0
    //   1806: istore #7
    //   1808: iload #7
    //   1810: iload #6
    //   1812: if_icmpge -> 1950
    //   1815: aload #5
    //   1817: iload #7
    //   1819: aaload
    //   1820: astore #8
    //   1822: aload #8
    //   1824: invokevirtual getModifiers : ()I
    //   1827: invokestatic isStatic : (I)Z
    //   1830: ifne -> 1840
    //   1833: goto -> 1943
    //   1836: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1839: athrow
    //   1840: aload #8
    //   1842: invokevirtual getType : ()Ljava/lang/Class;
    //   1845: astore #9
    //   1847: aload #9
    //   1849: ifnull -> 1930
    //   1852: aload #9
    //   1854: invokevirtual isPrimitive : ()Z
    //   1857: ifne -> 1930
    //   1860: goto -> 1867
    //   1863: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1866: athrow
    //   1867: aload #9
    //   1869: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1872: ifnull -> 1930
    //   1875: goto -> 1882
    //   1878: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1881: athrow
    //   1882: aload #9
    //   1884: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1887: invokevirtual getName : ()Ljava/lang/String;
    //   1890: ifnull -> 1930
    //   1893: goto -> 1900
    //   1896: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1899: athrow
    //   1900: aload #9
    //   1902: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1905: invokevirtual getName : ()Ljava/lang/String;
    //   1908: sipush #31638
    //   1911: sipush #-19108
    //   1914: invokestatic a : (II)Ljava/lang/String;
    //   1917: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1920: ifne -> 1930
    //   1923: goto -> 1930
    //   1926: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1929: athrow
    //   1930: aload #8
    //   1932: iconst_1
    //   1933: invokevirtual setAccessible : (Z)V
    //   1936: aload #8
    //   1938: aconst_null
    //   1939: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1942: pop
    //   1943: iinc #7, 1
    //   1946: iload_2
    //   1947: ifne -> 1808
    //   1950: sipush #31623
    //   1953: sipush #15790
    //   1956: invokestatic a : (II)Ljava/lang/String;
    //   1959: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1962: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1965: astore #5
    //   1967: aload #5
    //   1969: arraylength
    //   1970: istore #6
    //   1972: iconst_0
    //   1973: istore #7
    //   1975: iload #7
    //   1977: iload #6
    //   1979: if_icmpge -> 2116
    //   1982: aload #5
    //   1984: iload #7
    //   1986: aaload
    //   1987: astore #8
    //   1989: aload #8
    //   1991: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1994: pop
    //   1995: aload #8
    //   1997: invokevirtual getModifiers : ()I
    //   2000: invokestatic isStatic : (I)Z
    //   2003: ifeq -> 2102
    //   2006: aload #8
    //   2008: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2011: arraylength
    //   2012: iconst_2
    //   2013: if_icmpne -> 2102
    //   2016: goto -> 2023
    //   2019: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2022: athrow
    //   2023: aload #8
    //   2025: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2028: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2031: if_acmpne -> 2102
    //   2034: goto -> 2041
    //   2037: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2040: athrow
    //   2041: aload #8
    //   2043: iconst_1
    //   2044: invokevirtual setAccessible : (Z)V
    //   2047: aload #8
    //   2049: aconst_null
    //   2050: iconst_2
    //   2051: anewarray java/lang/Object
    //   2054: dup
    //   2055: iconst_0
    //   2056: aload_0
    //   2057: aastore
    //   2058: dup
    //   2059: iconst_1
    //   2060: aload_1
    //   2061: ifnonnull -> 2079
    //   2064: goto -> 2071
    //   2067: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2070: athrow
    //   2071: aload_1
    //   2072: goto -> 2086
    //   2075: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2078: athrow
    //   2079: aload_1
    //   2080: checkcast [B
    //   2083: invokevirtual clone : ()Ljava/lang/Object;
    //   2086: aastore
    //   2087: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2090: checkcast java/lang/Boolean
    //   2093: invokevirtual booleanValue : ()Z
    //   2096: istore #4
    //   2098: iload_2
    //   2099: ifne -> 2116
    //   2102: iinc #7, 1
    //   2105: iload_2
    //   2106: ifne -> 1975
    //   2109: goto -> 2116
    //   2112: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2115: athrow
    //   2116: goto -> 2458
    //   2119: sipush #31639
    //   2122: sipush #26570
    //   2125: invokestatic a : (II)Ljava/lang/String;
    //   2128: iconst_1
    //   2129: ldc burp/Zz16
    //   2131: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2134: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2137: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2140: astore #5
    //   2142: aload #5
    //   2144: arraylength
    //   2145: istore #6
    //   2147: iconst_0
    //   2148: istore #7
    //   2150: iload #7
    //   2152: iload #6
    //   2154: if_icmpge -> 2292
    //   2157: aload #5
    //   2159: iload #7
    //   2161: aaload
    //   2162: astore #8
    //   2164: aload #8
    //   2166: invokevirtual getModifiers : ()I
    //   2169: invokestatic isStatic : (I)Z
    //   2172: ifne -> 2182
    //   2175: goto -> 2285
    //   2178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2181: athrow
    //   2182: aload #8
    //   2184: invokevirtual getType : ()Ljava/lang/Class;
    //   2187: astore #9
    //   2189: aload #9
    //   2191: ifnull -> 2272
    //   2194: aload #9
    //   2196: invokevirtual isPrimitive : ()Z
    //   2199: ifne -> 2272
    //   2202: goto -> 2209
    //   2205: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2208: athrow
    //   2209: aload #9
    //   2211: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2214: ifnull -> 2272
    //   2217: goto -> 2224
    //   2220: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2223: athrow
    //   2224: aload #9
    //   2226: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2229: invokevirtual getName : ()Ljava/lang/String;
    //   2232: ifnull -> 2272
    //   2235: goto -> 2242
    //   2238: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2241: athrow
    //   2242: aload #9
    //   2244: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2247: invokevirtual getName : ()Ljava/lang/String;
    //   2250: sipush #31638
    //   2253: sipush #-19108
    //   2256: invokestatic a : (II)Ljava/lang/String;
    //   2259: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2262: ifne -> 2272
    //   2265: goto -> 2272
    //   2268: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2271: athrow
    //   2272: aload #8
    //   2274: iconst_1
    //   2275: invokevirtual setAccessible : (Z)V
    //   2278: aload #8
    //   2280: aconst_null
    //   2281: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2284: pop
    //   2285: iinc #7, 1
    //   2288: iload_2
    //   2289: ifne -> 2150
    //   2292: sipush #31626
    //   2295: sipush #17605
    //   2298: invokestatic a : (II)Ljava/lang/String;
    //   2301: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2304: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2307: astore #5
    //   2309: aload #5
    //   2311: arraylength
    //   2312: istore #6
    //   2314: iconst_0
    //   2315: istore #7
    //   2317: iload #7
    //   2319: iload #6
    //   2321: if_icmpge -> 2458
    //   2324: aload #5
    //   2326: iload #7
    //   2328: aaload
    //   2329: astore #8
    //   2331: aload #8
    //   2333: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2336: pop
    //   2337: aload #8
    //   2339: invokevirtual getModifiers : ()I
    //   2342: invokestatic isStatic : (I)Z
    //   2345: ifeq -> 2444
    //   2348: aload #8
    //   2350: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2353: arraylength
    //   2354: iconst_2
    //   2355: if_icmpne -> 2444
    //   2358: goto -> 2365
    //   2361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2364: athrow
    //   2365: aload #8
    //   2367: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2370: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2373: if_acmpne -> 2444
    //   2376: goto -> 2383
    //   2379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2382: athrow
    //   2383: aload #8
    //   2385: iconst_1
    //   2386: invokevirtual setAccessible : (Z)V
    //   2389: aload #8
    //   2391: aconst_null
    //   2392: iconst_2
    //   2393: anewarray java/lang/Object
    //   2396: dup
    //   2397: iconst_0
    //   2398: aload_0
    //   2399: aastore
    //   2400: dup
    //   2401: iconst_1
    //   2402: aload_1
    //   2403: ifnonnull -> 2421
    //   2406: goto -> 2413
    //   2409: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2412: athrow
    //   2413: aload_1
    //   2414: goto -> 2428
    //   2417: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2420: athrow
    //   2421: aload_1
    //   2422: checkcast [B
    //   2425: invokevirtual clone : ()Ljava/lang/Object;
    //   2428: aastore
    //   2429: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2432: checkcast java/lang/Boolean
    //   2435: invokevirtual booleanValue : ()Z
    //   2438: istore #4
    //   2440: iload_2
    //   2441: ifne -> 2458
    //   2444: iinc #7, 1
    //   2447: iload_2
    //   2448: ifne -> 2317
    //   2451: goto -> 2458
    //   2454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2457: athrow
    //   2458: iload #4
    //   2460: ifeq -> 2466
    //   2463: iload #4
    //   2465: ireturn
    //   2466: getstatic burp/Zein.ZN : Ljava/lang/String;
    //   2469: getstatic burp/Zzip.ZW : Ljava/lang/Object;
    //   2472: checkcast java/math/BigInteger
    //   2475: invokevirtual intValue : ()I
    //   2478: bipush #32
    //   2480: irem
    //   2481: invokestatic abs : (I)I
    //   2484: invokevirtual charAt : (I)C
    //   2487: getstatic burp/Zr8h.Zk : Ljava/lang/String;
    //   2490: getstatic burp/Zehi.Zb : Ljava/lang/Object;
    //   2493: checkcast java/math/BigInteger
    //   2496: invokevirtual intValue : ()I
    //   2499: bipush #32
    //   2501: irem
    //   2502: invokestatic abs : (I)I
    //   2505: invokevirtual charAt : (I)C
    //   2508: if_icmple -> 2854
    //   2511: sipush #31621
    //   2514: sipush #-10630
    //   2517: invokestatic a : (II)Ljava/lang/String;
    //   2520: iconst_1
    //   2521: ldc burp/Zkc8
    //   2523: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2526: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2529: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2532: astore #5
    //   2534: aload #5
    //   2536: arraylength
    //   2537: istore #6
    //   2539: iconst_0
    //   2540: istore #7
    //   2542: iload #7
    //   2544: iload #6
    //   2546: if_icmpge -> 2684
    //   2549: aload #5
    //   2551: iload #7
    //   2553: aaload
    //   2554: astore #8
    //   2556: aload #8
    //   2558: invokevirtual getModifiers : ()I
    //   2561: invokestatic isStatic : (I)Z
    //   2564: ifne -> 2574
    //   2567: goto -> 2677
    //   2570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2573: athrow
    //   2574: aload #8
    //   2576: invokevirtual getType : ()Ljava/lang/Class;
    //   2579: astore #9
    //   2581: aload #9
    //   2583: ifnull -> 2664
    //   2586: aload #9
    //   2588: invokevirtual isPrimitive : ()Z
    //   2591: ifne -> 2664
    //   2594: goto -> 2601
    //   2597: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2600: athrow
    //   2601: aload #9
    //   2603: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2606: ifnull -> 2664
    //   2609: goto -> 2616
    //   2612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2615: athrow
    //   2616: aload #9
    //   2618: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2621: invokevirtual getName : ()Ljava/lang/String;
    //   2624: ifnull -> 2664
    //   2627: goto -> 2634
    //   2630: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2633: athrow
    //   2634: aload #9
    //   2636: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2639: invokevirtual getName : ()Ljava/lang/String;
    //   2642: sipush #31638
    //   2645: sipush #-19108
    //   2648: invokestatic a : (II)Ljava/lang/String;
    //   2651: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2654: ifne -> 2664
    //   2657: goto -> 2664
    //   2660: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2663: athrow
    //   2664: aload #8
    //   2666: iconst_1
    //   2667: invokevirtual setAccessible : (Z)V
    //   2670: aload #8
    //   2672: aconst_null
    //   2673: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2676: pop
    //   2677: iinc #7, 1
    //   2680: iload_2
    //   2681: ifne -> 2542
    //   2684: sipush #31633
    //   2687: sipush #-9714
    //   2690: invokestatic a : (II)Ljava/lang/String;
    //   2693: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2696: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2699: astore #5
    //   2701: aload #5
    //   2703: arraylength
    //   2704: istore #6
    //   2706: iconst_0
    //   2707: istore #7
    //   2709: iload #7
    //   2711: iload #6
    //   2713: if_icmpge -> 2850
    //   2716: aload #5
    //   2718: iload #7
    //   2720: aaload
    //   2721: astore #8
    //   2723: aload #8
    //   2725: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2728: pop
    //   2729: aload #8
    //   2731: invokevirtual getModifiers : ()I
    //   2734: invokestatic isStatic : (I)Z
    //   2737: ifeq -> 2836
    //   2740: aload #8
    //   2742: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2745: arraylength
    //   2746: iconst_2
    //   2747: if_icmpne -> 2836
    //   2750: goto -> 2757
    //   2753: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2756: athrow
    //   2757: aload #8
    //   2759: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2762: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2765: if_acmpne -> 2836
    //   2768: goto -> 2775
    //   2771: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2774: athrow
    //   2775: aload #8
    //   2777: iconst_1
    //   2778: invokevirtual setAccessible : (Z)V
    //   2781: aload #8
    //   2783: aconst_null
    //   2784: iconst_2
    //   2785: anewarray java/lang/Object
    //   2788: dup
    //   2789: iconst_0
    //   2790: aload_0
    //   2791: aastore
    //   2792: dup
    //   2793: iconst_1
    //   2794: aload_1
    //   2795: ifnonnull -> 2813
    //   2798: goto -> 2805
    //   2801: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2804: athrow
    //   2805: aload_1
    //   2806: goto -> 2820
    //   2809: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2812: athrow
    //   2813: aload_1
    //   2814: checkcast [B
    //   2817: invokevirtual clone : ()Ljava/lang/Object;
    //   2820: aastore
    //   2821: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2824: checkcast java/lang/Boolean
    //   2827: invokevirtual booleanValue : ()Z
    //   2830: istore #4
    //   2832: iload_2
    //   2833: ifne -> 2850
    //   2836: iinc #7, 1
    //   2839: iload_2
    //   2840: ifne -> 2709
    //   2843: goto -> 2850
    //   2846: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2849: athrow
    //   2850: iload_2
    //   2851: ifne -> 3193
    //   2854: sipush #31616
    //   2857: sipush #28133
    //   2860: invokestatic a : (II)Ljava/lang/String;
    //   2863: iconst_1
    //   2864: ldc burp/Zxf8
    //   2866: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2869: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2872: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2875: astore #5
    //   2877: aload #5
    //   2879: arraylength
    //   2880: istore #6
    //   2882: iconst_0
    //   2883: istore #7
    //   2885: iload #7
    //   2887: iload #6
    //   2889: if_icmpge -> 3027
    //   2892: aload #5
    //   2894: iload #7
    //   2896: aaload
    //   2897: astore #8
    //   2899: aload #8
    //   2901: invokevirtual getModifiers : ()I
    //   2904: invokestatic isStatic : (I)Z
    //   2907: ifne -> 2917
    //   2910: goto -> 3020
    //   2913: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2916: athrow
    //   2917: aload #8
    //   2919: invokevirtual getType : ()Ljava/lang/Class;
    //   2922: astore #9
    //   2924: aload #9
    //   2926: ifnull -> 3007
    //   2929: aload #9
    //   2931: invokevirtual isPrimitive : ()Z
    //   2934: ifne -> 3007
    //   2937: goto -> 2944
    //   2940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2943: athrow
    //   2944: aload #9
    //   2946: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2949: ifnull -> 3007
    //   2952: goto -> 2959
    //   2955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2958: athrow
    //   2959: aload #9
    //   2961: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2964: invokevirtual getName : ()Ljava/lang/String;
    //   2967: ifnull -> 3007
    //   2970: goto -> 2977
    //   2973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2976: athrow
    //   2977: aload #9
    //   2979: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2982: invokevirtual getName : ()Ljava/lang/String;
    //   2985: sipush #31638
    //   2988: sipush #-19108
    //   2991: invokestatic a : (II)Ljava/lang/String;
    //   2994: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2997: ifne -> 3007
    //   3000: goto -> 3007
    //   3003: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3006: athrow
    //   3007: aload #8
    //   3009: iconst_1
    //   3010: invokevirtual setAccessible : (Z)V
    //   3013: aload #8
    //   3015: aconst_null
    //   3016: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3019: pop
    //   3020: iinc #7, 1
    //   3023: iload_2
    //   3024: ifne -> 2885
    //   3027: sipush #31629
    //   3030: sipush #-27077
    //   3033: invokestatic a : (II)Ljava/lang/String;
    //   3036: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3039: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3042: astore #5
    //   3044: aload #5
    //   3046: arraylength
    //   3047: istore #6
    //   3049: iconst_0
    //   3050: istore #7
    //   3052: iload #7
    //   3054: iload #6
    //   3056: if_icmpge -> 3193
    //   3059: aload #5
    //   3061: iload #7
    //   3063: aaload
    //   3064: astore #8
    //   3066: aload #8
    //   3068: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3071: pop
    //   3072: aload #8
    //   3074: invokevirtual getModifiers : ()I
    //   3077: invokestatic isStatic : (I)Z
    //   3080: ifeq -> 3179
    //   3083: aload #8
    //   3085: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3088: arraylength
    //   3089: iconst_2
    //   3090: if_icmpne -> 3179
    //   3093: goto -> 3100
    //   3096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3099: athrow
    //   3100: aload #8
    //   3102: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3105: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3108: if_acmpne -> 3179
    //   3111: goto -> 3118
    //   3114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3117: athrow
    //   3118: aload #8
    //   3120: iconst_1
    //   3121: invokevirtual setAccessible : (Z)V
    //   3124: aload #8
    //   3126: aconst_null
    //   3127: iconst_2
    //   3128: anewarray java/lang/Object
    //   3131: dup
    //   3132: iconst_0
    //   3133: aload_0
    //   3134: aastore
    //   3135: dup
    //   3136: iconst_1
    //   3137: aload_1
    //   3138: ifnonnull -> 3156
    //   3141: goto -> 3148
    //   3144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3147: athrow
    //   3148: aload_1
    //   3149: goto -> 3163
    //   3152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3155: athrow
    //   3156: aload_1
    //   3157: checkcast [B
    //   3160: invokevirtual clone : ()Ljava/lang/Object;
    //   3163: aastore
    //   3164: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3167: checkcast java/lang/Boolean
    //   3170: invokevirtual booleanValue : ()Z
    //   3173: istore #4
    //   3175: iload_2
    //   3176: ifne -> 3193
    //   3179: iinc #7, 1
    //   3182: iload_2
    //   3183: ifne -> 3052
    //   3186: goto -> 3193
    //   3189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3192: athrow
    //   3193: iload #4
    //   3195: ifeq -> 3201
    //   3198: iload #4
    //   3200: ireturn
    //   3201: getstatic burp/Zk9s.ZM : Ljava/lang/String;
    //   3204: getstatic burp/Zg_p.Zx : Ljava/lang/Object;
    //   3207: checkcast java/math/BigInteger
    //   3210: invokevirtual intValue : ()I
    //   3213: bipush #32
    //   3215: irem
    //   3216: invokestatic abs : (I)I
    //   3219: invokevirtual charAt : (I)C
    //   3222: getstatic burp/Ze3d.ZL : Ljava/lang/String;
    //   3225: getstatic burp/Zein.Zb : Ljava/lang/Object;
    //   3228: checkcast java/math/BigInteger
    //   3231: invokevirtual intValue : ()I
    //   3234: bipush #32
    //   3236: irem
    //   3237: invokestatic abs : (I)I
    //   3240: invokevirtual charAt : (I)C
    //   3243: if_icmpgt -> 3589
    //   3246: sipush #31634
    //   3249: sipush #25416
    //   3252: invokestatic a : (II)Ljava/lang/String;
    //   3255: iconst_1
    //   3256: ldc burp/Zgcg
    //   3258: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3261: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3264: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3267: astore #5
    //   3269: aload #5
    //   3271: arraylength
    //   3272: istore #6
    //   3274: iconst_0
    //   3275: istore #7
    //   3277: iload #7
    //   3279: iload #6
    //   3281: if_icmpge -> 3419
    //   3284: aload #5
    //   3286: iload #7
    //   3288: aaload
    //   3289: astore #8
    //   3291: aload #8
    //   3293: invokevirtual getModifiers : ()I
    //   3296: invokestatic isStatic : (I)Z
    //   3299: ifne -> 3309
    //   3302: goto -> 3412
    //   3305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3308: athrow
    //   3309: aload #8
    //   3311: invokevirtual getType : ()Ljava/lang/Class;
    //   3314: astore #9
    //   3316: aload #9
    //   3318: ifnull -> 3399
    //   3321: aload #9
    //   3323: invokevirtual isPrimitive : ()Z
    //   3326: ifne -> 3399
    //   3329: goto -> 3336
    //   3332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3335: athrow
    //   3336: aload #9
    //   3338: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3341: ifnull -> 3399
    //   3344: goto -> 3351
    //   3347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3350: athrow
    //   3351: aload #9
    //   3353: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3356: invokevirtual getName : ()Ljava/lang/String;
    //   3359: ifnull -> 3399
    //   3362: goto -> 3369
    //   3365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3368: athrow
    //   3369: aload #9
    //   3371: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3374: invokevirtual getName : ()Ljava/lang/String;
    //   3377: sipush #31638
    //   3380: sipush #-19108
    //   3383: invokestatic a : (II)Ljava/lang/String;
    //   3386: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3389: ifne -> 3399
    //   3392: goto -> 3399
    //   3395: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3398: athrow
    //   3399: aload #8
    //   3401: iconst_1
    //   3402: invokevirtual setAccessible : (Z)V
    //   3405: aload #8
    //   3407: aconst_null
    //   3408: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3411: pop
    //   3412: iinc #7, 1
    //   3415: iload_2
    //   3416: ifne -> 3277
    //   3419: sipush #31632
    //   3422: sipush #26456
    //   3425: invokestatic a : (II)Ljava/lang/String;
    //   3428: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3431: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3434: astore #5
    //   3436: aload #5
    //   3438: arraylength
    //   3439: istore #6
    //   3441: iconst_0
    //   3442: istore #7
    //   3444: iload #7
    //   3446: iload #6
    //   3448: if_icmpge -> 3585
    //   3451: aload #5
    //   3453: iload #7
    //   3455: aaload
    //   3456: astore #8
    //   3458: aload #8
    //   3460: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3463: pop
    //   3464: aload #8
    //   3466: invokevirtual getModifiers : ()I
    //   3469: invokestatic isStatic : (I)Z
    //   3472: ifeq -> 3571
    //   3475: aload #8
    //   3477: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3480: arraylength
    //   3481: iconst_2
    //   3482: if_icmpne -> 3571
    //   3485: goto -> 3492
    //   3488: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3491: athrow
    //   3492: aload #8
    //   3494: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3497: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3500: if_acmpne -> 3571
    //   3503: goto -> 3510
    //   3506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3509: athrow
    //   3510: aload #8
    //   3512: iconst_1
    //   3513: invokevirtual setAccessible : (Z)V
    //   3516: aload #8
    //   3518: aconst_null
    //   3519: iconst_2
    //   3520: anewarray java/lang/Object
    //   3523: dup
    //   3524: iconst_0
    //   3525: aload_0
    //   3526: aastore
    //   3527: dup
    //   3528: iconst_1
    //   3529: aload_1
    //   3530: ifnonnull -> 3548
    //   3533: goto -> 3540
    //   3536: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3539: athrow
    //   3540: aload_1
    //   3541: goto -> 3555
    //   3544: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3547: athrow
    //   3548: aload_1
    //   3549: checkcast [B
    //   3552: invokevirtual clone : ()Ljava/lang/Object;
    //   3555: aastore
    //   3556: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3559: checkcast java/lang/Boolean
    //   3562: invokevirtual booleanValue : ()Z
    //   3565: istore #4
    //   3567: iload_2
    //   3568: ifne -> 3585
    //   3571: iinc #7, 1
    //   3574: iload_2
    //   3575: ifne -> 3444
    //   3578: goto -> 3585
    //   3581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3584: athrow
    //   3585: iload_2
    //   3586: ifne -> 3928
    //   3589: sipush #31623
    //   3592: sipush #15790
    //   3595: invokestatic a : (II)Ljava/lang/String;
    //   3598: iconst_1
    //   3599: ldc burp/Zmvk
    //   3601: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3604: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3607: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3610: astore #5
    //   3612: aload #5
    //   3614: arraylength
    //   3615: istore #6
    //   3617: iconst_0
    //   3618: istore #7
    //   3620: iload #7
    //   3622: iload #6
    //   3624: if_icmpge -> 3762
    //   3627: aload #5
    //   3629: iload #7
    //   3631: aaload
    //   3632: astore #8
    //   3634: aload #8
    //   3636: invokevirtual getModifiers : ()I
    //   3639: invokestatic isStatic : (I)Z
    //   3642: ifne -> 3652
    //   3645: goto -> 3755
    //   3648: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3651: athrow
    //   3652: aload #8
    //   3654: invokevirtual getType : ()Ljava/lang/Class;
    //   3657: astore #9
    //   3659: aload #9
    //   3661: ifnull -> 3742
    //   3664: aload #9
    //   3666: invokevirtual isPrimitive : ()Z
    //   3669: ifne -> 3742
    //   3672: goto -> 3679
    //   3675: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3678: athrow
    //   3679: aload #9
    //   3681: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3684: ifnull -> 3742
    //   3687: goto -> 3694
    //   3690: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3693: athrow
    //   3694: aload #9
    //   3696: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3699: invokevirtual getName : ()Ljava/lang/String;
    //   3702: ifnull -> 3742
    //   3705: goto -> 3712
    //   3708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3711: athrow
    //   3712: aload #9
    //   3714: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3717: invokevirtual getName : ()Ljava/lang/String;
    //   3720: sipush #31638
    //   3723: sipush #-19108
    //   3726: invokestatic a : (II)Ljava/lang/String;
    //   3729: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3732: ifne -> 3742
    //   3735: goto -> 3742
    //   3738: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3741: athrow
    //   3742: aload #8
    //   3744: iconst_1
    //   3745: invokevirtual setAccessible : (Z)V
    //   3748: aload #8
    //   3750: aconst_null
    //   3751: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3754: pop
    //   3755: iinc #7, 1
    //   3758: iload_2
    //   3759: ifne -> 3620
    //   3762: sipush #31624
    //   3765: sipush #-8384
    //   3768: invokestatic a : (II)Ljava/lang/String;
    //   3771: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3774: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3777: astore #5
    //   3779: aload #5
    //   3781: arraylength
    //   3782: istore #6
    //   3784: iconst_0
    //   3785: istore #7
    //   3787: iload #7
    //   3789: iload #6
    //   3791: if_icmpge -> 3928
    //   3794: aload #5
    //   3796: iload #7
    //   3798: aaload
    //   3799: astore #8
    //   3801: aload #8
    //   3803: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3806: pop
    //   3807: aload #8
    //   3809: invokevirtual getModifiers : ()I
    //   3812: invokestatic isStatic : (I)Z
    //   3815: ifeq -> 3914
    //   3818: aload #8
    //   3820: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3823: arraylength
    //   3824: iconst_2
    //   3825: if_icmpne -> 3914
    //   3828: goto -> 3835
    //   3831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3834: athrow
    //   3835: aload #8
    //   3837: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3840: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3843: if_acmpne -> 3914
    //   3846: goto -> 3853
    //   3849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3852: athrow
    //   3853: aload #8
    //   3855: iconst_1
    //   3856: invokevirtual setAccessible : (Z)V
    //   3859: aload #8
    //   3861: aconst_null
    //   3862: iconst_2
    //   3863: anewarray java/lang/Object
    //   3866: dup
    //   3867: iconst_0
    //   3868: aload_0
    //   3869: aastore
    //   3870: dup
    //   3871: iconst_1
    //   3872: aload_1
    //   3873: ifnonnull -> 3891
    //   3876: goto -> 3883
    //   3879: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3882: athrow
    //   3883: aload_1
    //   3884: goto -> 3898
    //   3887: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3890: athrow
    //   3891: aload_1
    //   3892: checkcast [B
    //   3895: invokevirtual clone : ()Ljava/lang/Object;
    //   3898: aastore
    //   3899: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3902: checkcast java/lang/Boolean
    //   3905: invokevirtual booleanValue : ()Z
    //   3908: istore #4
    //   3910: iload_2
    //   3911: ifne -> 3928
    //   3914: iinc #7, 1
    //   3917: iload_2
    //   3918: ifne -> 3787
    //   3921: goto -> 3928
    //   3924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3927: athrow
    //   3928: iload #4
    //   3930: ifeq -> 3936
    //   3933: iload #4
    //   3935: ireturn
    //   3936: getstatic burp/Zr3q.ZM : Ljava/lang/String;
    //   3939: getstatic burp/Zedz.Za : Ljava/lang/Object;
    //   3942: checkcast java/math/BigInteger
    //   3945: invokevirtual intValue : ()I
    //   3948: bipush #32
    //   3950: irem
    //   3951: invokestatic abs : (I)I
    //   3954: invokevirtual charAt : (I)C
    //   3957: getstatic burp/Zedz.Zh : Ljava/lang/String;
    //   3960: getstatic burp/Ze13.ZD : Ljava/lang/Object;
    //   3963: checkcast java/math/BigInteger
    //   3966: invokevirtual intValue : ()I
    //   3969: bipush #32
    //   3971: irem
    //   3972: invokestatic abs : (I)I
    //   3975: invokevirtual charAt : (I)C
    //   3978: if_icmpgt -> 4324
    //   3981: sipush #31628
    //   3984: sipush #-23984
    //   3987: invokestatic a : (II)Ljava/lang/String;
    //   3990: iconst_1
    //   3991: ldc burp/Zera
    //   3993: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3996: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3999: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4002: astore #5
    //   4004: aload #5
    //   4006: arraylength
    //   4007: istore #6
    //   4009: iconst_0
    //   4010: istore #7
    //   4012: iload #7
    //   4014: iload #6
    //   4016: if_icmpge -> 4154
    //   4019: aload #5
    //   4021: iload #7
    //   4023: aaload
    //   4024: astore #8
    //   4026: aload #8
    //   4028: invokevirtual getModifiers : ()I
    //   4031: invokestatic isStatic : (I)Z
    //   4034: ifne -> 4044
    //   4037: goto -> 4147
    //   4040: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4043: athrow
    //   4044: aload #8
    //   4046: invokevirtual getType : ()Ljava/lang/Class;
    //   4049: astore #9
    //   4051: aload #9
    //   4053: ifnull -> 4134
    //   4056: aload #9
    //   4058: invokevirtual isPrimitive : ()Z
    //   4061: ifne -> 4134
    //   4064: goto -> 4071
    //   4067: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4070: athrow
    //   4071: aload #9
    //   4073: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4076: ifnull -> 4134
    //   4079: goto -> 4086
    //   4082: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4085: athrow
    //   4086: aload #9
    //   4088: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4091: invokevirtual getName : ()Ljava/lang/String;
    //   4094: ifnull -> 4134
    //   4097: goto -> 4104
    //   4100: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4103: athrow
    //   4104: aload #9
    //   4106: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4109: invokevirtual getName : ()Ljava/lang/String;
    //   4112: sipush #31638
    //   4115: sipush #-19108
    //   4118: invokestatic a : (II)Ljava/lang/String;
    //   4121: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4124: ifne -> 4134
    //   4127: goto -> 4134
    //   4130: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4133: athrow
    //   4134: aload #8
    //   4136: iconst_1
    //   4137: invokevirtual setAccessible : (Z)V
    //   4140: aload #8
    //   4142: aconst_null
    //   4143: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4146: pop
    //   4147: iinc #7, 1
    //   4150: iload_2
    //   4151: ifne -> 4012
    //   4154: sipush #31631
    //   4157: sipush #29679
    //   4160: invokestatic a : (II)Ljava/lang/String;
    //   4163: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4166: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4169: astore #5
    //   4171: aload #5
    //   4173: arraylength
    //   4174: istore #6
    //   4176: iconst_0
    //   4177: istore #7
    //   4179: iload #7
    //   4181: iload #6
    //   4183: if_icmpge -> 4320
    //   4186: aload #5
    //   4188: iload #7
    //   4190: aaload
    //   4191: astore #8
    //   4193: aload #8
    //   4195: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4198: pop
    //   4199: aload #8
    //   4201: invokevirtual getModifiers : ()I
    //   4204: invokestatic isStatic : (I)Z
    //   4207: ifeq -> 4306
    //   4210: aload #8
    //   4212: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4215: arraylength
    //   4216: iconst_2
    //   4217: if_icmpne -> 4306
    //   4220: goto -> 4227
    //   4223: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4226: athrow
    //   4227: aload #8
    //   4229: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4232: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4235: if_acmpne -> 4306
    //   4238: goto -> 4245
    //   4241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4244: athrow
    //   4245: aload #8
    //   4247: iconst_1
    //   4248: invokevirtual setAccessible : (Z)V
    //   4251: aload #8
    //   4253: aconst_null
    //   4254: iconst_2
    //   4255: anewarray java/lang/Object
    //   4258: dup
    //   4259: iconst_0
    //   4260: aload_0
    //   4261: aastore
    //   4262: dup
    //   4263: iconst_1
    //   4264: aload_1
    //   4265: ifnonnull -> 4283
    //   4268: goto -> 4275
    //   4271: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4274: athrow
    //   4275: aload_1
    //   4276: goto -> 4290
    //   4279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4282: athrow
    //   4283: aload_1
    //   4284: checkcast [B
    //   4287: invokevirtual clone : ()Ljava/lang/Object;
    //   4290: aastore
    //   4291: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4294: checkcast java/lang/Boolean
    //   4297: invokevirtual booleanValue : ()Z
    //   4300: istore #4
    //   4302: iload_2
    //   4303: ifne -> 4320
    //   4306: iinc #7, 1
    //   4309: iload_2
    //   4310: ifne -> 4179
    //   4313: goto -> 4320
    //   4316: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4319: athrow
    //   4320: iload_2
    //   4321: ifne -> 4663
    //   4324: sipush #31633
    //   4327: sipush #-9714
    //   4330: invokestatic a : (II)Ljava/lang/String;
    //   4333: iconst_1
    //   4334: ldc burp/Zg5
    //   4336: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4339: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4342: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4345: astore #5
    //   4347: aload #5
    //   4349: arraylength
    //   4350: istore #6
    //   4352: iconst_0
    //   4353: istore #7
    //   4355: iload #7
    //   4357: iload #6
    //   4359: if_icmpge -> 4497
    //   4362: aload #5
    //   4364: iload #7
    //   4366: aaload
    //   4367: astore #8
    //   4369: aload #8
    //   4371: invokevirtual getModifiers : ()I
    //   4374: invokestatic isStatic : (I)Z
    //   4377: ifne -> 4387
    //   4380: goto -> 4490
    //   4383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4386: athrow
    //   4387: aload #8
    //   4389: invokevirtual getType : ()Ljava/lang/Class;
    //   4392: astore #9
    //   4394: aload #9
    //   4396: ifnull -> 4477
    //   4399: aload #9
    //   4401: invokevirtual isPrimitive : ()Z
    //   4404: ifne -> 4477
    //   4407: goto -> 4414
    //   4410: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4413: athrow
    //   4414: aload #9
    //   4416: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4419: ifnull -> 4477
    //   4422: goto -> 4429
    //   4425: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4428: athrow
    //   4429: aload #9
    //   4431: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4434: invokevirtual getName : ()Ljava/lang/String;
    //   4437: ifnull -> 4477
    //   4440: goto -> 4447
    //   4443: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4446: athrow
    //   4447: aload #9
    //   4449: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4452: invokevirtual getName : ()Ljava/lang/String;
    //   4455: sipush #31638
    //   4458: sipush #-19108
    //   4461: invokestatic a : (II)Ljava/lang/String;
    //   4464: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4467: ifne -> 4477
    //   4470: goto -> 4477
    //   4473: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4476: athrow
    //   4477: aload #8
    //   4479: iconst_1
    //   4480: invokevirtual setAccessible : (Z)V
    //   4483: aload #8
    //   4485: aconst_null
    //   4486: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4489: pop
    //   4490: iinc #7, 1
    //   4493: iload_2
    //   4494: ifne -> 4355
    //   4497: sipush #31620
    //   4500: sipush #17551
    //   4503: invokestatic a : (II)Ljava/lang/String;
    //   4506: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4509: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4512: astore #5
    //   4514: aload #5
    //   4516: arraylength
    //   4517: istore #6
    //   4519: iconst_0
    //   4520: istore #7
    //   4522: iload #7
    //   4524: iload #6
    //   4526: if_icmpge -> 4663
    //   4529: aload #5
    //   4531: iload #7
    //   4533: aaload
    //   4534: astore #8
    //   4536: aload #8
    //   4538: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4541: pop
    //   4542: aload #8
    //   4544: invokevirtual getModifiers : ()I
    //   4547: invokestatic isStatic : (I)Z
    //   4550: ifeq -> 4649
    //   4553: aload #8
    //   4555: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4558: arraylength
    //   4559: iconst_2
    //   4560: if_icmpne -> 4649
    //   4563: goto -> 4570
    //   4566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4569: athrow
    //   4570: aload #8
    //   4572: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4575: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4578: if_acmpne -> 4649
    //   4581: goto -> 4588
    //   4584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4587: athrow
    //   4588: aload #8
    //   4590: iconst_1
    //   4591: invokevirtual setAccessible : (Z)V
    //   4594: aload #8
    //   4596: aconst_null
    //   4597: iconst_2
    //   4598: anewarray java/lang/Object
    //   4601: dup
    //   4602: iconst_0
    //   4603: aload_0
    //   4604: aastore
    //   4605: dup
    //   4606: iconst_1
    //   4607: aload_1
    //   4608: ifnonnull -> 4626
    //   4611: goto -> 4618
    //   4614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4617: athrow
    //   4618: aload_1
    //   4619: goto -> 4633
    //   4622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4625: athrow
    //   4626: aload_1
    //   4627: checkcast [B
    //   4630: invokevirtual clone : ()Ljava/lang/Object;
    //   4633: aastore
    //   4634: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4637: checkcast java/lang/Boolean
    //   4640: invokevirtual booleanValue : ()Z
    //   4643: istore #4
    //   4645: iload_2
    //   4646: ifne -> 4663
    //   4649: iinc #7, 1
    //   4652: iload_2
    //   4653: ifne -> 4522
    //   4656: goto -> 4663
    //   4659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4662: athrow
    //   4663: iload #4
    //   4665: ireturn
    //   4666: astore_3
    //   4667: new java/lang/Exception
    //   4670: dup
    //   4671: aload_3
    //   4672: invokevirtual getMessage : ()Ljava/lang/String;
    //   4675: invokespecial <init> : (Ljava/lang/String;)V
    //   4678: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2465	4666	java/lang/Throwable
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
    //   1822	1836	1836	java/lang/Throwable
    //   1847	1860	1863	java/lang/Throwable
    //   1852	1875	1878	java/lang/Throwable
    //   1867	1893	1896	java/lang/Throwable
    //   1882	1923	1926	java/lang/Throwable
    //   1989	2016	2019	java/lang/Throwable
    //   2006	2034	2037	java/lang/Throwable
    //   2023	2064	2067	java/lang/Throwable
    //   2041	2075	2075	java/lang/Throwable
    //   2098	2109	2112	java/lang/Throwable
    //   2164	2178	2178	java/lang/Throwable
    //   2189	2202	2205	java/lang/Throwable
    //   2194	2217	2220	java/lang/Throwable
    //   2209	2235	2238	java/lang/Throwable
    //   2224	2265	2268	java/lang/Throwable
    //   2331	2358	2361	java/lang/Throwable
    //   2348	2376	2379	java/lang/Throwable
    //   2365	2406	2409	java/lang/Throwable
    //   2383	2417	2417	java/lang/Throwable
    //   2440	2451	2454	java/lang/Throwable
    //   2466	3200	4666	java/lang/Throwable
    //   2556	2570	2570	java/lang/Throwable
    //   2581	2594	2597	java/lang/Throwable
    //   2586	2609	2612	java/lang/Throwable
    //   2601	2627	2630	java/lang/Throwable
    //   2616	2657	2660	java/lang/Throwable
    //   2723	2750	2753	java/lang/Throwable
    //   2740	2768	2771	java/lang/Throwable
    //   2757	2798	2801	java/lang/Throwable
    //   2775	2809	2809	java/lang/Throwable
    //   2832	2843	2846	java/lang/Throwable
    //   2899	2913	2913	java/lang/Throwable
    //   2924	2937	2940	java/lang/Throwable
    //   2929	2952	2955	java/lang/Throwable
    //   2944	2970	2973	java/lang/Throwable
    //   2959	3000	3003	java/lang/Throwable
    //   3066	3093	3096	java/lang/Throwable
    //   3083	3111	3114	java/lang/Throwable
    //   3100	3141	3144	java/lang/Throwable
    //   3118	3152	3152	java/lang/Throwable
    //   3175	3186	3189	java/lang/Throwable
    //   3201	3935	4666	java/lang/Throwable
    //   3291	3305	3305	java/lang/Throwable
    //   3316	3329	3332	java/lang/Throwable
    //   3321	3344	3347	java/lang/Throwable
    //   3336	3362	3365	java/lang/Throwable
    //   3351	3392	3395	java/lang/Throwable
    //   3458	3485	3488	java/lang/Throwable
    //   3475	3503	3506	java/lang/Throwable
    //   3492	3533	3536	java/lang/Throwable
    //   3510	3544	3544	java/lang/Throwable
    //   3567	3578	3581	java/lang/Throwable
    //   3634	3648	3648	java/lang/Throwable
    //   3659	3672	3675	java/lang/Throwable
    //   3664	3687	3690	java/lang/Throwable
    //   3679	3705	3708	java/lang/Throwable
    //   3694	3735	3738	java/lang/Throwable
    //   3801	3828	3831	java/lang/Throwable
    //   3818	3846	3849	java/lang/Throwable
    //   3835	3876	3879	java/lang/Throwable
    //   3853	3887	3887	java/lang/Throwable
    //   3910	3921	3924	java/lang/Throwable
    //   3936	4665	4666	java/lang/Throwable
    //   4026	4040	4040	java/lang/Throwable
    //   4051	4064	4067	java/lang/Throwable
    //   4056	4079	4082	java/lang/Throwable
    //   4071	4097	4100	java/lang/Throwable
    //   4086	4127	4130	java/lang/Throwable
    //   4193	4220	4223	java/lang/Throwable
    //   4210	4238	4241	java/lang/Throwable
    //   4227	4268	4271	java/lang/Throwable
    //   4245	4279	4279	java/lang/Throwable
    //   4302	4313	4316	java/lang/Throwable
    //   4369	4383	4383	java/lang/Throwable
    //   4394	4407	4410	java/lang/Throwable
    //   4399	4422	4425	java/lang/Throwable
    //   4414	4440	4443	java/lang/Throwable
    //   4429	4470	4473	java/lang/Throwable
    //   4536	4563	4566	java/lang/Throwable
    //   4553	4581	4584	java/lang/Throwable
    //   4570	4611	4614	java/lang/Throwable
    //   4588	4622	4622	java/lang/Throwable
    //   4645	4656	4659	java/lang/Throwable
  }
  
  static void ZP(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¢5îY©e±MpC mê±!ÁÊØåÅ¡øÞîµeNp"¢Z>Ô³±ÛÌNÃf´ï;°¥lqö4¦ÇZ\\nG1Ì:ª§Amÿ\\n8MñMwË\\ts\\rÐ_åãu\\thèn|3pÄ\\t)®F´6i²cÒ\\tàò?NZ]\\t½áÔ]dTëÕ\\tÙXóõÜrÏ\\tÒ9ÁÙÇAäg\\tQ£Ôö2S À:¦¡]B4ÖbÇÆ:Ð}}¬ø"îú¿èÉÞ¾\\tJÑ(ÄúôFW\\tÌúp¡ñ@&ë#\\tÒ¢¤«ç#\\t'aMVµÒ3 <´Ji\\b%ø]©ã%i©ÐíÞyFWÎí¤x\\n\\t·1Ø\\r~äp\\t&ê§<\\nx&P$\\t8dCr+·Ú\\bÍÚs¥Ì{'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #23
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
    //   68: ldc 'Ág_\\t9EBÏ° rY\\f'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #124
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
    //   128: putstatic burp/Zxk9.a : [Ljava/lang/String;
    //   131: bipush #23
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zxk9.b : [Ljava/lang/String;
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
    //   212: bipush #68
    //   214: goto -> 244
    //   217: bipush #107
    //   219: goto -> 244
    //   222: bipush #66
    //   224: goto -> 244
    //   227: bipush #82
    //   229: goto -> 244
    //   232: bipush #81
    //   234: goto -> 244
    //   237: bipush #100
    //   239: goto -> 244
    //   242: bipush #52
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #45
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-88
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #65
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #36
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #96
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #60
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-32
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #22
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #32
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #17
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #121
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-44
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #79
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-127
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-36
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #55
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-65
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-96
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-30
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #37
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #-92
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #61
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-117
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #107
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #-118
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-65
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #26
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #56
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #26
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #91
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #-122
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-76
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zxk9.ZI : Ljava/lang/Object;
    //   501: sipush #31635
    //   504: sipush #13298
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zxk9.Zx : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7B83) & 0xFFFF;
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
      char c = 'Þ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxk9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */