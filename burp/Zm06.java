package burp;

import java.math.BigInteger;

class Zm06 extends ClassLoader {
  static Object ZU;
  
  static String Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zm(Object paramObject) {
    Ztes.Zo = a(-22202, -2641);
    Ztes.ZX = new BigInteger(a(-22194, -27817));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zead.Zo.charAt(Math.abs(((BigInteger)Zxsb.ZN).intValue() % 32)) > Zre1.ZA.charAt(Math.abs(((BigInteger)Zbxp.ZW).intValue() % 32))) {
          try {
            Zltb.Zc(Class.forName(a(-22197, -32640)));
            if (!bool)
              Zs5y.ZX(Class.forName(a(-22198, -26840))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zs5y.ZX(Class.forName(a(-22198, -26840)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #-22195
    //   7: sipush #5803
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic ZA : (Ljava/lang/Object;)V
    //   19: getstatic burp/Zbqo.Zb : Ljava/lang/Object;
    //   22: checkcast java/math/BigInteger
    //   25: getstatic burp/Zgia.Zx : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   34: putstatic burp/Zvh.Zb : Ljava/lang/Object;
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
    //   201: getstatic burp/Zest.Zd : Ljava/lang/String;
    //   204: getstatic burp/Zmu6.Zb : Ljava/lang/Object;
    //   207: checkcast java/math/BigInteger
    //   210: invokevirtual intValue : ()I
    //   213: bipush #32
    //   215: irem
    //   216: invokestatic abs : (I)I
    //   219: invokevirtual charAt : (I)C
    //   222: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: iload_2
    //   227: ifeq -> 1380
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   236: athrow
    //   237: aload_3
    //   238: getstatic burp/Zlos.Zp : Ljava/lang/String;
    //   241: getstatic burp/Ztnw.Zt : Ljava/lang/Object;
    //   244: checkcast java/math/BigInteger
    //   247: invokevirtual intValue : ()I
    //   250: bipush #32
    //   252: irem
    //   253: invokestatic abs : (I)I
    //   256: invokevirtual charAt : (I)C
    //   259: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   262: pop
    //   263: iload_2
    //   264: ifeq -> 1380
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   273: athrow
    //   274: aload_3
    //   275: getstatic burp/Zztx.Zg : Ljava/lang/String;
    //   278: getstatic burp/Zkhy.Zc : Ljava/lang/Object;
    //   281: checkcast java/math/BigInteger
    //   284: invokevirtual intValue : ()I
    //   287: bipush #32
    //   289: irem
    //   290: invokestatic abs : (I)I
    //   293: invokevirtual charAt : (I)C
    //   296: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   299: pop
    //   300: iload_2
    //   301: ifeq -> 1380
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   310: athrow
    //   311: aload_3
    //   312: getstatic burp/Zsxo.ZW : Ljava/lang/String;
    //   315: getstatic burp/Zmy4.ZB : Ljava/lang/Object;
    //   318: checkcast java/math/BigInteger
    //   321: invokevirtual intValue : ()I
    //   324: bipush #32
    //   326: irem
    //   327: invokestatic abs : (I)I
    //   330: invokevirtual charAt : (I)C
    //   333: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   336: pop
    //   337: iload_2
    //   338: ifeq -> 1380
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   347: athrow
    //   348: aload_3
    //   349: getstatic burp/Zsk2.ZE : Ljava/lang/String;
    //   352: getstatic burp/Zscs.Zg : Ljava/lang/Object;
    //   355: checkcast java/math/BigInteger
    //   358: invokevirtual intValue : ()I
    //   361: bipush #32
    //   363: irem
    //   364: invokestatic abs : (I)I
    //   367: invokevirtual charAt : (I)C
    //   370: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   373: pop
    //   374: iload_2
    //   375: ifeq -> 1380
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   384: athrow
    //   385: aload_3
    //   386: getstatic burp/Zx4y.Zh : Ljava/lang/String;
    //   389: getstatic burp/Zl2q.Zg : Ljava/lang/Object;
    //   392: checkcast java/math/BigInteger
    //   395: invokevirtual intValue : ()I
    //   398: bipush #32
    //   400: irem
    //   401: invokestatic abs : (I)I
    //   404: invokevirtual charAt : (I)C
    //   407: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   410: pop
    //   411: iload_2
    //   412: ifeq -> 1380
    //   415: goto -> 422
    //   418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   421: athrow
    //   422: aload_3
    //   423: getstatic burp/Zblj.Za : Ljava/lang/String;
    //   426: getstatic burp/Zzgh.ZV : Ljava/lang/Object;
    //   429: checkcast java/math/BigInteger
    //   432: invokevirtual intValue : ()I
    //   435: bipush #32
    //   437: irem
    //   438: invokestatic abs : (I)I
    //   441: invokevirtual charAt : (I)C
    //   444: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   447: pop
    //   448: iload_2
    //   449: ifeq -> 1380
    //   452: goto -> 459
    //   455: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   458: athrow
    //   459: aload_3
    //   460: getstatic burp/Zd0.Zi : Ljava/lang/String;
    //   463: getstatic burp/Zzip.ZW : Ljava/lang/Object;
    //   466: checkcast java/math/BigInteger
    //   469: invokevirtual intValue : ()I
    //   472: bipush #32
    //   474: irem
    //   475: invokestatic abs : (I)I
    //   478: invokevirtual charAt : (I)C
    //   481: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   484: pop
    //   485: iload_2
    //   486: ifeq -> 1380
    //   489: goto -> 496
    //   492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   495: athrow
    //   496: aload_3
    //   497: getstatic burp/Zb3l.Zz : Ljava/lang/String;
    //   500: getstatic burp/Zt7w.ZF : Ljava/lang/Object;
    //   503: checkcast java/math/BigInteger
    //   506: invokevirtual intValue : ()I
    //   509: bipush #32
    //   511: irem
    //   512: invokestatic abs : (I)I
    //   515: invokevirtual charAt : (I)C
    //   518: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   521: pop
    //   522: iload_2
    //   523: ifeq -> 1380
    //   526: goto -> 533
    //   529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   532: athrow
    //   533: aload_3
    //   534: getstatic burp/Zs0h.ZX : Ljava/lang/String;
    //   537: getstatic burp/Zbz_.ZU : Ljava/lang/Object;
    //   540: checkcast java/math/BigInteger
    //   543: invokevirtual intValue : ()I
    //   546: bipush #32
    //   548: irem
    //   549: invokestatic abs : (I)I
    //   552: invokevirtual charAt : (I)C
    //   555: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   558: pop
    //   559: iload_2
    //   560: ifeq -> 1380
    //   563: goto -> 570
    //   566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   569: athrow
    //   570: aload_3
    //   571: getstatic burp/Zg0j.Ze : Ljava/lang/String;
    //   574: getstatic burp/Zb6a.Zz : Ljava/lang/Object;
    //   577: checkcast java/math/BigInteger
    //   580: invokevirtual intValue : ()I
    //   583: bipush #32
    //   585: irem
    //   586: invokestatic abs : (I)I
    //   589: invokevirtual charAt : (I)C
    //   592: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   595: pop
    //   596: iload_2
    //   597: ifeq -> 1380
    //   600: goto -> 607
    //   603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   606: athrow
    //   607: aload_3
    //   608: getstatic burp/Ztd3.ZC : Ljava/lang/String;
    //   611: getstatic burp/Ze7y.Zh : Ljava/lang/Object;
    //   614: checkcast java/math/BigInteger
    //   617: invokevirtual intValue : ()I
    //   620: bipush #32
    //   622: irem
    //   623: invokestatic abs : (I)I
    //   626: invokevirtual charAt : (I)C
    //   629: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   632: pop
    //   633: iload_2
    //   634: ifeq -> 1380
    //   637: goto -> 644
    //   640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   643: athrow
    //   644: aload_3
    //   645: getstatic burp/Zg6f.Zf : Ljava/lang/String;
    //   648: getstatic burp/Ztsc.Zr : Ljava/lang/Object;
    //   651: checkcast java/math/BigInteger
    //   654: invokevirtual intValue : ()I
    //   657: bipush #32
    //   659: irem
    //   660: invokestatic abs : (I)I
    //   663: invokevirtual charAt : (I)C
    //   666: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   669: pop
    //   670: iload_2
    //   671: ifeq -> 1380
    //   674: goto -> 681
    //   677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   680: athrow
    //   681: aload_3
    //   682: getstatic burp/Zkv2.Z_ : Ljava/lang/String;
    //   685: getstatic burp/Zg4k.ZE : Ljava/lang/Object;
    //   688: checkcast java/math/BigInteger
    //   691: invokevirtual intValue : ()I
    //   694: bipush #32
    //   696: irem
    //   697: invokestatic abs : (I)I
    //   700: invokevirtual charAt : (I)C
    //   703: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   706: pop
    //   707: iload_2
    //   708: ifeq -> 1380
    //   711: goto -> 718
    //   714: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   717: athrow
    //   718: aload_3
    //   719: getstatic burp/Zt7x.Zu : Ljava/lang/String;
    //   722: getstatic burp/Zel.ZB : Ljava/lang/Object;
    //   725: checkcast java/math/BigInteger
    //   728: invokevirtual intValue : ()I
    //   731: bipush #32
    //   733: irem
    //   734: invokestatic abs : (I)I
    //   737: invokevirtual charAt : (I)C
    //   740: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   743: pop
    //   744: iload_2
    //   745: ifeq -> 1380
    //   748: goto -> 755
    //   751: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   754: athrow
    //   755: aload_3
    //   756: getstatic burp/Zgdt.Zd : Ljava/lang/String;
    //   759: getstatic burp/Zzuh.ZV : Ljava/lang/Object;
    //   762: checkcast java/math/BigInteger
    //   765: invokevirtual intValue : ()I
    //   768: bipush #32
    //   770: irem
    //   771: invokestatic abs : (I)I
    //   774: invokevirtual charAt : (I)C
    //   777: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   780: pop
    //   781: iload_2
    //   782: ifeq -> 1380
    //   785: goto -> 792
    //   788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   791: athrow
    //   792: aload_3
    //   793: getstatic burp/Zl3l.Z_ : Ljava/lang/String;
    //   796: getstatic burp/Zsjo.ZB : Ljava/lang/Object;
    //   799: checkcast java/math/BigInteger
    //   802: invokevirtual intValue : ()I
    //   805: bipush #32
    //   807: irem
    //   808: invokestatic abs : (I)I
    //   811: invokevirtual charAt : (I)C
    //   814: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   817: pop
    //   818: iload_2
    //   819: ifeq -> 1380
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   828: athrow
    //   829: aload_3
    //   830: getstatic burp/Zgqi.Zv : Ljava/lang/String;
    //   833: getstatic burp/Zt5a.Zs : Ljava/lang/Object;
    //   836: checkcast java/math/BigInteger
    //   839: invokevirtual intValue : ()I
    //   842: bipush #32
    //   844: irem
    //   845: invokestatic abs : (I)I
    //   848: invokevirtual charAt : (I)C
    //   851: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   854: pop
    //   855: iload_2
    //   856: ifeq -> 1380
    //   859: goto -> 866
    //   862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   865: athrow
    //   866: aload_3
    //   867: getstatic burp/Zg8v.Zd : Ljava/lang/String;
    //   870: getstatic burp/Zk5y.ZL : Ljava/lang/Object;
    //   873: checkcast java/math/BigInteger
    //   876: invokevirtual intValue : ()I
    //   879: bipush #32
    //   881: irem
    //   882: invokestatic abs : (I)I
    //   885: invokevirtual charAt : (I)C
    //   888: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   891: pop
    //   892: iload_2
    //   893: ifeq -> 1380
    //   896: goto -> 903
    //   899: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   902: athrow
    //   903: aload_3
    //   904: getstatic burp/Zzs9.Zg : Ljava/lang/String;
    //   907: getstatic burp/Zb38.ZC : Ljava/lang/Object;
    //   910: checkcast java/math/BigInteger
    //   913: invokevirtual intValue : ()I
    //   916: bipush #32
    //   918: irem
    //   919: invokestatic abs : (I)I
    //   922: invokevirtual charAt : (I)C
    //   925: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   928: pop
    //   929: iload_2
    //   930: ifeq -> 1380
    //   933: goto -> 940
    //   936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   939: athrow
    //   940: aload_3
    //   941: getstatic burp/Zxdh.Zj : Ljava/lang/String;
    //   944: getstatic burp/Zl3l.Zv : Ljava/lang/Object;
    //   947: checkcast java/math/BigInteger
    //   950: invokevirtual intValue : ()I
    //   953: bipush #32
    //   955: irem
    //   956: invokestatic abs : (I)I
    //   959: invokevirtual charAt : (I)C
    //   962: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   965: pop
    //   966: iload_2
    //   967: ifeq -> 1380
    //   970: goto -> 977
    //   973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   976: athrow
    //   977: aload_3
    //   978: getstatic burp/Zeju.ZR : Ljava/lang/String;
    //   981: getstatic burp/Zz58.ZD : Ljava/lang/Object;
    //   984: checkcast java/math/BigInteger
    //   987: invokevirtual intValue : ()I
    //   990: bipush #32
    //   992: irem
    //   993: invokestatic abs : (I)I
    //   996: invokevirtual charAt : (I)C
    //   999: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1002: pop
    //   1003: iload_2
    //   1004: ifeq -> 1380
    //   1007: goto -> 1014
    //   1010: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1013: athrow
    //   1014: aload_3
    //   1015: getstatic burp/Zz0j.Zf : Ljava/lang/String;
    //   1018: getstatic burp/Zg68.Zs : Ljava/lang/Object;
    //   1021: checkcast java/math/BigInteger
    //   1024: invokevirtual intValue : ()I
    //   1027: bipush #32
    //   1029: irem
    //   1030: invokestatic abs : (I)I
    //   1033: invokevirtual charAt : (I)C
    //   1036: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1039: pop
    //   1040: iload_2
    //   1041: ifeq -> 1380
    //   1044: goto -> 1051
    //   1047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1050: athrow
    //   1051: aload_3
    //   1052: getstatic burp/Zr1t.Ze : Ljava/lang/String;
    //   1055: getstatic burp/Zvos.Zr : Ljava/lang/Object;
    //   1058: checkcast java/math/BigInteger
    //   1061: invokevirtual intValue : ()I
    //   1064: bipush #32
    //   1066: irem
    //   1067: invokestatic abs : (I)I
    //   1070: invokevirtual charAt : (I)C
    //   1073: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1076: pop
    //   1077: iload_2
    //   1078: ifeq -> 1380
    //   1081: goto -> 1088
    //   1084: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1087: athrow
    //   1088: aload_3
    //   1089: getstatic burp/Zz5h.Zk : Ljava/lang/String;
    //   1092: getstatic burp/Zm8i.Zm : Ljava/lang/Object;
    //   1095: checkcast java/math/BigInteger
    //   1098: invokevirtual intValue : ()I
    //   1101: bipush #32
    //   1103: irem
    //   1104: invokestatic abs : (I)I
    //   1107: invokevirtual charAt : (I)C
    //   1110: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1113: pop
    //   1114: iload_2
    //   1115: ifeq -> 1380
    //   1118: goto -> 1125
    //   1121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1124: athrow
    //   1125: aload_3
    //   1126: getstatic burp/Zbj.ZD : Ljava/lang/String;
    //   1129: getstatic burp/Zgkl.ZK : Ljava/lang/Object;
    //   1132: checkcast java/math/BigInteger
    //   1135: invokevirtual intValue : ()I
    //   1138: bipush #32
    //   1140: irem
    //   1141: invokestatic abs : (I)I
    //   1144: invokevirtual charAt : (I)C
    //   1147: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1150: pop
    //   1151: iload_2
    //   1152: ifeq -> 1380
    //   1155: goto -> 1162
    //   1158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1161: athrow
    //   1162: aload_3
    //   1163: getstatic burp/Zl50.Zm : Ljava/lang/String;
    //   1166: getstatic burp/Ztap.ZK : Ljava/lang/Object;
    //   1169: checkcast java/math/BigInteger
    //   1172: invokevirtual intValue : ()I
    //   1175: bipush #32
    //   1177: irem
    //   1178: invokestatic abs : (I)I
    //   1181: invokevirtual charAt : (I)C
    //   1184: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1187: pop
    //   1188: iload_2
    //   1189: ifeq -> 1380
    //   1192: goto -> 1199
    //   1195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1198: athrow
    //   1199: aload_3
    //   1200: getstatic burp/Zzxs.Zd : Ljava/lang/String;
    //   1203: getstatic burp/Zty4.ZQ : Ljava/lang/Object;
    //   1206: checkcast java/math/BigInteger
    //   1209: invokevirtual intValue : ()I
    //   1212: bipush #32
    //   1214: irem
    //   1215: invokestatic abs : (I)I
    //   1218: invokevirtual charAt : (I)C
    //   1221: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1224: pop
    //   1225: iload_2
    //   1226: ifeq -> 1380
    //   1229: goto -> 1236
    //   1232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1235: athrow
    //   1236: aload_3
    //   1237: getstatic burp/Zgyc.Zj : Ljava/lang/String;
    //   1240: getstatic burp/Zgre.ZD : Ljava/lang/Object;
    //   1243: checkcast java/math/BigInteger
    //   1246: invokevirtual intValue : ()I
    //   1249: bipush #32
    //   1251: irem
    //   1252: invokestatic abs : (I)I
    //   1255: invokevirtual charAt : (I)C
    //   1258: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1261: pop
    //   1262: iload_2
    //   1263: ifeq -> 1380
    //   1266: goto -> 1273
    //   1269: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1272: athrow
    //   1273: aload_3
    //   1274: getstatic burp/Ztjh.ZZ : Ljava/lang/String;
    //   1277: getstatic burp/Zlqy.ZP : Ljava/lang/Object;
    //   1280: checkcast java/math/BigInteger
    //   1283: invokevirtual intValue : ()I
    //   1286: bipush #32
    //   1288: irem
    //   1289: invokestatic abs : (I)I
    //   1292: invokevirtual charAt : (I)C
    //   1295: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1298: pop
    //   1299: iload_2
    //   1300: ifeq -> 1380
    //   1303: goto -> 1310
    //   1306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1309: athrow
    //   1310: aload_3
    //   1311: getstatic burp/Zsxj.Zp : Ljava/lang/String;
    //   1314: getstatic burp/Zrd3.ZI : Ljava/lang/Object;
    //   1317: checkcast java/math/BigInteger
    //   1320: invokevirtual intValue : ()I
    //   1323: bipush #32
    //   1325: irem
    //   1326: invokestatic abs : (I)I
    //   1329: invokevirtual charAt : (I)C
    //   1332: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1335: pop
    //   1336: iload_2
    //   1337: ifeq -> 1380
    //   1340: goto -> 1347
    //   1343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1346: athrow
    //   1347: aload_3
    //   1348: getstatic burp/Zel.Zi : Ljava/lang/String;
    //   1351: getstatic burp/Zlhz.Zy : Ljava/lang/Object;
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
    //   1384: ifeq -> 48
    //   1387: aload_3
    //   1388: invokevirtual toString : ()Ljava/lang/String;
    //   1391: putstatic burp/Zl4v.ZD : Ljava/lang/String;
    //   1394: sipush #-22196
    //   1397: sipush #32635
    //   1400: invokestatic a : (II)Ljava/lang/String;
    //   1403: iconst_1
    //   1404: ldc burp/Zltb
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
    //   1525: sipush #-22203
    //   1528: sipush #1280
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
    //   1564: ifeq -> 1425
    //   1567: sipush #-22199
    //   1570: sipush #-17526
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
    //   1712: ifeq -> 1729
    //   1715: iinc #6, 1
    //   1718: iload_2
    //   1719: ifeq -> 1592
    //   1722: goto -> 1729
    //   1725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1728: athrow
    //   1729: new java/io/ByteArrayOutputStream
    //   1732: dup
    //   1733: invokespecial <init> : ()V
    //   1736: astore #4
    //   1738: sipush #-22193
    //   1741: aload #4
    //   1743: sipush #202
    //   1746: invokevirtual write : (I)V
    //   1749: sipush #19288
    //   1752: aload #4
    //   1754: sipush #254
    //   1757: invokevirtual write : (I)V
    //   1760: aload #4
    //   1762: sipush #186
    //   1765: invokevirtual write : (I)V
    //   1768: aload #4
    //   1770: sipush #190
    //   1773: invokevirtual write : (I)V
    //   1776: aload #4
    //   1778: iconst_0
    //   1779: invokevirtual write : (I)V
    //   1782: aload #4
    //   1784: iconst_1
    //   1785: invokevirtual write : (I)V
    //   1788: aload #4
    //   1790: iconst_0
    //   1791: invokevirtual write : (I)V
    //   1794: aload #4
    //   1796: bipush #50
    //   1798: invokevirtual write : (I)V
    //   1801: aload #4
    //   1803: getstatic burp/Zl5b.ZI : Ljava/lang/Object;
    //   1806: checkcast java/math/BigInteger
    //   1809: invokevirtual toByteArray : ()[B
    //   1812: invokevirtual write : ([B)V
    //   1815: aload #4
    //   1817: getstatic burp/Zgii.ZD : Ljava/lang/Object;
    //   1820: checkcast java/math/BigInteger
    //   1823: invokevirtual toByteArray : ()[B
    //   1826: invokevirtual write : ([B)V
    //   1829: aload #4
    //   1831: getstatic burp/Zbsc.ZA : Ljava/lang/Object;
    //   1834: checkcast java/math/BigInteger
    //   1837: invokevirtual toByteArray : ()[B
    //   1840: invokevirtual write : ([B)V
    //   1843: aload #4
    //   1845: invokevirtual toByteArray : ()[B
    //   1848: astore #5
    //   1850: aconst_null
    //   1851: astore #6
    //   1853: invokestatic a : (II)Ljava/lang/String;
    //   1856: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1859: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1862: astore #7
    //   1864: aload #7
    //   1866: arraylength
    //   1867: istore #8
    //   1869: iconst_0
    //   1870: istore #9
    //   1872: iload #9
    //   1874: iload #8
    //   1876: if_icmpge -> 2004
    //   1879: aload #7
    //   1881: iload #9
    //   1883: aaload
    //   1884: astore #10
    //   1886: aload #10
    //   1888: invokevirtual getName : ()Ljava/lang/String;
    //   1891: sipush #-22200
    //   1894: sipush #14650
    //   1897: invokestatic a : (II)Ljava/lang/String;
    //   1900: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1903: ifeq -> 1997
    //   1906: aload #10
    //   1908: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1911: astore #11
    //   1913: aload #11
    //   1915: arraylength
    //   1916: iconst_4
    //   1917: if_icmpeq -> 1927
    //   1920: goto -> 1997
    //   1923: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1926: athrow
    //   1927: aload #11
    //   1929: iconst_0
    //   1930: aaload
    //   1931: ldc java/lang/String
    //   1933: if_acmpeq -> 1943
    //   1936: goto -> 1997
    //   1939: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1942: athrow
    //   1943: aload #11
    //   1945: iconst_1
    //   1946: aaload
    //   1947: ldc [B
    //   1949: if_acmpeq -> 1959
    //   1952: goto -> 1997
    //   1955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1958: athrow
    //   1959: aload #11
    //   1961: iconst_2
    //   1962: aaload
    //   1963: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1966: if_acmpeq -> 1976
    //   1969: goto -> 1997
    //   1972: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1975: athrow
    //   1976: aload #11
    //   1978: iconst_3
    //   1979: aaload
    //   1980: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1983: if_acmpeq -> 1993
    //   1986: goto -> 1997
    //   1989: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1992: athrow
    //   1993: aload #10
    //   1995: astore #6
    //   1997: iinc #9, 1
    //   2000: iload_2
    //   2001: ifeq -> 1872
    //   2004: aload #6
    //   2006: iconst_1
    //   2007: invokevirtual setAccessible : (Z)V
    //   2010: ldc burp/Zxwl
    //   2012: iconst_0
    //   2013: anewarray java/lang/Class
    //   2016: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   2019: astore #7
    //   2021: aload #7
    //   2023: iconst_1
    //   2024: invokevirtual setAccessible : (Z)V
    //   2027: aload #6
    //   2029: aload #7
    //   2031: iconst_0
    //   2032: anewarray java/lang/Object
    //   2035: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   2038: iconst_4
    //   2039: anewarray java/lang/Object
    //   2042: dup
    //   2043: iconst_0
    //   2044: sipush #-22204
    //   2047: sipush #30693
    //   2050: invokestatic a : (II)Ljava/lang/String;
    //   2053: aastore
    //   2054: dup
    //   2055: iconst_1
    //   2056: aload #5
    //   2058: aastore
    //   2059: dup
    //   2060: iconst_2
    //   2061: iconst_0
    //   2062: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2065: aastore
    //   2066: dup
    //   2067: iconst_3
    //   2068: aload #5
    //   2070: arraylength
    //   2071: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2074: aastore
    //   2075: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2078: pop
    //   2079: goto -> 2084
    //   2082: astore #4
    //   2084: getstatic burp/Zl5.ZE : Ljava/lang/String;
    //   2087: getstatic burp/Zbp.ZD : Ljava/lang/Object;
    //   2090: checkcast java/math/BigInteger
    //   2093: invokevirtual intValue : ()I
    //   2096: bipush #32
    //   2098: irem
    //   2099: invokestatic abs : (I)I
    //   2102: invokevirtual charAt : (I)C
    //   2105: getstatic burp/Zgny.Zf : Ljava/lang/String;
    //   2108: getstatic burp/Zt7j.ZH : Ljava/lang/Object;
    //   2111: checkcast java/math/BigInteger
    //   2114: invokevirtual intValue : ()I
    //   2117: bipush #32
    //   2119: irem
    //   2120: invokestatic abs : (I)I
    //   2123: invokevirtual charAt : (I)C
    //   2126: if_icmpgt -> 2233
    //   2129: getstatic burp/Ztnw.Zr : Ljava/lang/String;
    //   2132: getstatic burp/Zsfj.ZL : Ljava/lang/Object;
    //   2135: checkcast java/math/BigInteger
    //   2138: invokevirtual intValue : ()I
    //   2141: bipush #32
    //   2143: irem
    //   2144: invokestatic abs : (I)I
    //   2147: invokevirtual charAt : (I)C
    //   2150: getstatic burp/Zg1l.Zl : Ljava/lang/String;
    //   2153: getstatic burp/Zs56.ZC : Ljava/lang/Object;
    //   2156: checkcast java/math/BigInteger
    //   2159: invokevirtual intValue : ()I
    //   2162: bipush #32
    //   2164: irem
    //   2165: invokestatic abs : (I)I
    //   2168: invokevirtual charAt : (I)C
    //   2171: if_icmple -> 2233
    //   2174: goto -> 2181
    //   2177: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2180: athrow
    //   2181: getstatic burp/Zr9j.Zc : Ljava/lang/String;
    //   2184: getstatic burp/Zrod.ZX : Ljava/lang/Object;
    //   2187: checkcast java/math/BigInteger
    //   2190: invokevirtual intValue : ()I
    //   2193: bipush #32
    //   2195: irem
    //   2196: invokestatic abs : (I)I
    //   2199: invokevirtual charAt : (I)C
    //   2202: getstatic burp/Zsgl.ZG : Ljava/lang/String;
    //   2205: getstatic burp/Zx54.Zn : Ljava/lang/Object;
    //   2208: checkcast java/math/BigInteger
    //   2211: invokevirtual intValue : ()I
    //   2214: bipush #32
    //   2216: irem
    //   2217: invokestatic abs : (I)I
    //   2220: invokevirtual charAt : (I)C
    //   2223: if_icmpgt -> 2241
    //   2226: goto -> 2233
    //   2229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2232: athrow
    //   2233: iconst_1
    //   2234: goto -> 2242
    //   2237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2240: athrow
    //   2241: iconst_0
    //   2242: ireturn
    //   2243: astore_3
    //   2244: new java/lang/Exception
    //   2247: dup
    //   2248: aload_3
    //   2249: invokevirtual getMessage : ()Ljava/lang/String;
    //   2252: invokespecial <init> : (Ljava/lang/String;)V
    //   2255: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2242	2243	java/lang/Throwable
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
    //   1729	2079	2082	java/lang/Throwable
    //   1913	1923	1923	java/lang/Throwable
    //   1927	1939	1939	java/lang/Throwable
    //   1943	1955	1955	java/lang/Throwable
    //   1959	1972	1972	java/lang/Throwable
    //   1976	1989	1989	java/lang/Throwable
    //   2084	2174	2177	java/lang/Throwable
    //   2129	2226	2229	java/lang/Throwable
    //   2181	2237	2237	java/lang/Throwable
  }
  
  static void ZL(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ç?uÖ®©\\tLèÛÞ~²4M+¿\\t±ß«ç®\](kõúQU^ì(I¼5õµÈÒÒÄb;ü÷0;²+¤ÖtVw°Bâ"æs!£\\bhDyâõ¾¨+Û9VK+cð0±Ui´qLí»aÕ¨\\tÒ1nJcµÃï\\tpCo¤+¥vÔê\\tHhËÞ{±(\\tò?!ò14\\bð")'G\\rdÀ@'
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
    //   68: ldc 'nÛª¬utXùwÞ_ï87ÿrÿèJkí=jF À«3_#²9ÜUPöZÛ¢{h\\nçÄI^n¦µê\\bo'
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
    //   129: putstatic burp/Zm06.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zm06.b : [Ljava/lang/String;
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
    //   212: bipush #64
    //   214: goto -> 244
    //   217: bipush #51
    //   219: goto -> 244
    //   222: bipush #85
    //   224: goto -> 244
    //   227: bipush #97
    //   229: goto -> 244
    //   232: bipush #30
    //   234: goto -> 244
    //   237: bipush #89
    //   239: goto -> 244
    //   242: bipush #47
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
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #108
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #106
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #95
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-46
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-32
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-51
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-79
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #102
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-95
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #47
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-57
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-91
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #87
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-111
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #9
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #31
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #72
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #50
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #46
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-58
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-29
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-107
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-114
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #28
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-29
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-84
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-97
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #108
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #11
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-115
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-34
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-21
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zm06.ZU : Ljava/lang/Object;
    //   500: sipush #-22201
    //   503: sipush #-10117
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zm06.Zg : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA94C) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm06.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */