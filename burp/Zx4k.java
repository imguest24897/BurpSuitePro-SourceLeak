package burp;

import java.math.BigInteger;

class Zx4k extends ClassLoader {
  static String ZC;
  
  static Object ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zf(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZI(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #-11553
    //   7: sipush #-22033
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic ZO : (Ljava/lang/Object;)V
    //   19: new java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore_3
    //   27: iconst_0
    //   28: istore #4
    //   30: iload #4
    //   32: bipush #32
    //   34: if_icmpge -> 1367
    //   37: iload #4
    //   39: tableswitch default -> 1360, 0 -> 180, 1 -> 217, 2 -> 254, 3 -> 291, 4 -> 328, 5 -> 365, 6 -> 402, 7 -> 439, 8 -> 476, 9 -> 513, 10 -> 550, 11 -> 587, 12 -> 624, 13 -> 661, 14 -> 698, 15 -> 735, 16 -> 772, 17 -> 809, 18 -> 846, 19 -> 883, 20 -> 920, 21 -> 957, 22 -> 994, 23 -> 1031, 24 -> 1068, 25 -> 1105, 26 -> 1142, 27 -> 1179, 28 -> 1216, 29 -> 1253, 30 -> 1290, 31 -> 1327
    //   180: aload_3
    //   181: getstatic burp/Zss6.ZN : Ljava/lang/String;
    //   184: getstatic burp/Zso7.ZB : Ljava/lang/Object;
    //   187: checkcast java/math/BigInteger
    //   190: invokevirtual intValue : ()I
    //   193: bipush #32
    //   195: irem
    //   196: invokestatic abs : (I)I
    //   199: invokevirtual charAt : (I)C
    //   202: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: iload_2
    //   207: ifeq -> 1360
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   216: athrow
    //   217: aload_3
    //   218: getstatic burp/Zrd3.Z_ : Ljava/lang/String;
    //   221: getstatic burp/Zek5.ZP : Ljava/lang/Object;
    //   224: checkcast java/math/BigInteger
    //   227: invokevirtual intValue : ()I
    //   230: bipush #32
    //   232: irem
    //   233: invokestatic abs : (I)I
    //   236: invokevirtual charAt : (I)C
    //   239: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   242: pop
    //   243: iload_2
    //   244: ifeq -> 1360
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   253: athrow
    //   254: aload_3
    //   255: getstatic burp/Zml2.Zh : Ljava/lang/String;
    //   258: getstatic burp/Zvh.Zb : Ljava/lang/Object;
    //   261: checkcast java/math/BigInteger
    //   264: invokevirtual intValue : ()I
    //   267: bipush #32
    //   269: irem
    //   270: invokestatic abs : (I)I
    //   273: invokevirtual charAt : (I)C
    //   276: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   279: pop
    //   280: iload_2
    //   281: ifeq -> 1360
    //   284: goto -> 291
    //   287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   290: athrow
    //   291: aload_3
    //   292: getstatic burp/Zg_5.ZG : Ljava/lang/String;
    //   295: getstatic burp/Zs36.Zs : Ljava/lang/Object;
    //   298: checkcast java/math/BigInteger
    //   301: invokevirtual intValue : ()I
    //   304: bipush #32
    //   306: irem
    //   307: invokestatic abs : (I)I
    //   310: invokevirtual charAt : (I)C
    //   313: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: iload_2
    //   318: ifeq -> 1360
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   327: athrow
    //   328: aload_3
    //   329: getstatic burp/Ze54.ZU : Ljava/lang/String;
    //   332: getstatic burp/Zbu.ZW : Ljava/lang/Object;
    //   335: checkcast java/math/BigInteger
    //   338: invokevirtual intValue : ()I
    //   341: bipush #32
    //   343: irem
    //   344: invokestatic abs : (I)I
    //   347: invokevirtual charAt : (I)C
    //   350: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   353: pop
    //   354: iload_2
    //   355: ifeq -> 1360
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   364: athrow
    //   365: aload_3
    //   366: getstatic burp/Zkbm.Zb : Ljava/lang/String;
    //   369: getstatic burp/Zzvr.Z_ : Ljava/lang/Object;
    //   372: checkcast java/math/BigInteger
    //   375: invokevirtual intValue : ()I
    //   378: bipush #32
    //   380: irem
    //   381: invokestatic abs : (I)I
    //   384: invokevirtual charAt : (I)C
    //   387: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   390: pop
    //   391: iload_2
    //   392: ifeq -> 1360
    //   395: goto -> 402
    //   398: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   401: athrow
    //   402: aload_3
    //   403: getstatic burp/Zxx4.Zq : Ljava/lang/String;
    //   406: getstatic burp/Zg1l.Zg : Ljava/lang/Object;
    //   409: checkcast java/math/BigInteger
    //   412: invokevirtual intValue : ()I
    //   415: bipush #32
    //   417: irem
    //   418: invokestatic abs : (I)I
    //   421: invokevirtual charAt : (I)C
    //   424: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   427: pop
    //   428: iload_2
    //   429: ifeq -> 1360
    //   432: goto -> 439
    //   435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   438: athrow
    //   439: aload_3
    //   440: getstatic burp/Zm14.ZE : Ljava/lang/String;
    //   443: getstatic burp/Zxl5.Zh : Ljava/lang/Object;
    //   446: checkcast java/math/BigInteger
    //   449: invokevirtual intValue : ()I
    //   452: bipush #32
    //   454: irem
    //   455: invokestatic abs : (I)I
    //   458: invokevirtual charAt : (I)C
    //   461: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   464: pop
    //   465: iload_2
    //   466: ifeq -> 1360
    //   469: goto -> 476
    //   472: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   475: athrow
    //   476: aload_3
    //   477: getstatic burp/Zzef.Za : Ljava/lang/String;
    //   480: getstatic burp/Zkk6.Zb : Ljava/lang/Object;
    //   483: checkcast java/math/BigInteger
    //   486: invokevirtual intValue : ()I
    //   489: bipush #32
    //   491: irem
    //   492: invokestatic abs : (I)I
    //   495: invokevirtual charAt : (I)C
    //   498: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   501: pop
    //   502: iload_2
    //   503: ifeq -> 1360
    //   506: goto -> 513
    //   509: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   512: athrow
    //   513: aload_3
    //   514: getstatic burp/Zgkl.ZR : Ljava/lang/String;
    //   517: getstatic burp/Zrt9.Zy : Ljava/lang/Object;
    //   520: checkcast java/math/BigInteger
    //   523: invokevirtual intValue : ()I
    //   526: bipush #32
    //   528: irem
    //   529: invokestatic abs : (I)I
    //   532: invokevirtual charAt : (I)C
    //   535: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   538: pop
    //   539: iload_2
    //   540: ifeq -> 1360
    //   543: goto -> 550
    //   546: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   549: athrow
    //   550: aload_3
    //   551: getstatic burp/Zstq.ZL : Ljava/lang/String;
    //   554: getstatic burp/Zkc5.ZZ : Ljava/lang/Object;
    //   557: checkcast java/math/BigInteger
    //   560: invokevirtual intValue : ()I
    //   563: bipush #32
    //   565: irem
    //   566: invokestatic abs : (I)I
    //   569: invokevirtual charAt : (I)C
    //   572: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   575: pop
    //   576: iload_2
    //   577: ifeq -> 1360
    //   580: goto -> 587
    //   583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   586: athrow
    //   587: aload_3
    //   588: getstatic burp/Zeig.Zg : Ljava/lang/String;
    //   591: getstatic burp/Ze_0.ZY : Ljava/lang/Object;
    //   594: checkcast java/math/BigInteger
    //   597: invokevirtual intValue : ()I
    //   600: bipush #32
    //   602: irem
    //   603: invokestatic abs : (I)I
    //   606: invokevirtual charAt : (I)C
    //   609: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   612: pop
    //   613: iload_2
    //   614: ifeq -> 1360
    //   617: goto -> 624
    //   620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   623: athrow
    //   624: aload_3
    //   625: getstatic burp/Zkc8.Za : Ljava/lang/String;
    //   628: getstatic burp/Zzqj.Zq : Ljava/lang/Object;
    //   631: checkcast java/math/BigInteger
    //   634: invokevirtual intValue : ()I
    //   637: bipush #32
    //   639: irem
    //   640: invokestatic abs : (I)I
    //   643: invokevirtual charAt : (I)C
    //   646: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   649: pop
    //   650: iload_2
    //   651: ifeq -> 1360
    //   654: goto -> 661
    //   657: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   660: athrow
    //   661: aload_3
    //   662: getstatic burp/Zsk2.ZE : Ljava/lang/String;
    //   665: getstatic burp/Zrnw.ZN : Ljava/lang/Object;
    //   668: checkcast java/math/BigInteger
    //   671: invokevirtual intValue : ()I
    //   674: bipush #32
    //   676: irem
    //   677: invokestatic abs : (I)I
    //   680: invokevirtual charAt : (I)C
    //   683: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   686: pop
    //   687: iload_2
    //   688: ifeq -> 1360
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   697: athrow
    //   698: aload_3
    //   699: getstatic burp/Zscf.Zu : Ljava/lang/String;
    //   702: getstatic burp/Zrw7.ZV : Ljava/lang/Object;
    //   705: checkcast java/math/BigInteger
    //   708: invokevirtual intValue : ()I
    //   711: bipush #32
    //   713: irem
    //   714: invokestatic abs : (I)I
    //   717: invokevirtual charAt : (I)C
    //   720: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   723: pop
    //   724: iload_2
    //   725: ifeq -> 1360
    //   728: goto -> 735
    //   731: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   734: athrow
    //   735: aload_3
    //   736: getstatic burp/Zei_.ZZ : Ljava/lang/String;
    //   739: getstatic burp/Zbp.ZD : Ljava/lang/Object;
    //   742: checkcast java/math/BigInteger
    //   745: invokevirtual intValue : ()I
    //   748: bipush #32
    //   750: irem
    //   751: invokestatic abs : (I)I
    //   754: invokevirtual charAt : (I)C
    //   757: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   760: pop
    //   761: iload_2
    //   762: ifeq -> 1360
    //   765: goto -> 772
    //   768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   771: athrow
    //   772: aload_3
    //   773: getstatic burp/Ze54.ZU : Ljava/lang/String;
    //   776: getstatic burp/Zsxo.Za : Ljava/lang/Object;
    //   779: checkcast java/math/BigInteger
    //   782: invokevirtual intValue : ()I
    //   785: bipush #32
    //   787: irem
    //   788: invokestatic abs : (I)I
    //   791: invokevirtual charAt : (I)C
    //   794: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   797: pop
    //   798: iload_2
    //   799: ifeq -> 1360
    //   802: goto -> 809
    //   805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   808: athrow
    //   809: aload_3
    //   810: getstatic burp/Zlos.Zp : Ljava/lang/String;
    //   813: getstatic burp/Zlp8.Zu : Ljava/lang/Object;
    //   816: checkcast java/math/BigInteger
    //   819: invokevirtual intValue : ()I
    //   822: bipush #32
    //   824: irem
    //   825: invokestatic abs : (I)I
    //   828: invokevirtual charAt : (I)C
    //   831: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   834: pop
    //   835: iload_2
    //   836: ifeq -> 1360
    //   839: goto -> 846
    //   842: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   845: athrow
    //   846: aload_3
    //   847: getstatic burp/Zxzd.ZM : Ljava/lang/String;
    //   850: getstatic burp/Zgil.ZG : Ljava/lang/Object;
    //   853: checkcast java/math/BigInteger
    //   856: invokevirtual intValue : ()I
    //   859: bipush #32
    //   861: irem
    //   862: invokestatic abs : (I)I
    //   865: invokevirtual charAt : (I)C
    //   868: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   871: pop
    //   872: iload_2
    //   873: ifeq -> 1360
    //   876: goto -> 883
    //   879: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   882: athrow
    //   883: aload_3
    //   884: getstatic burp/Zxoa.Z_ : Ljava/lang/String;
    //   887: getstatic burp/Zrcx.Za : Ljava/lang/Object;
    //   890: checkcast java/math/BigInteger
    //   893: invokevirtual intValue : ()I
    //   896: bipush #32
    //   898: irem
    //   899: invokestatic abs : (I)I
    //   902: invokevirtual charAt : (I)C
    //   905: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   908: pop
    //   909: iload_2
    //   910: ifeq -> 1360
    //   913: goto -> 920
    //   916: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   919: athrow
    //   920: aload_3
    //   921: getstatic burp/Zm06.Zg : Ljava/lang/String;
    //   924: getstatic burp/Zl4v.ZT : Ljava/lang/Object;
    //   927: checkcast java/math/BigInteger
    //   930: invokevirtual intValue : ()I
    //   933: bipush #32
    //   935: irem
    //   936: invokestatic abs : (I)I
    //   939: invokevirtual charAt : (I)C
    //   942: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   945: pop
    //   946: iload_2
    //   947: ifeq -> 1360
    //   950: goto -> 957
    //   953: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   956: athrow
    //   957: aload_3
    //   958: getstatic burp/Zr3q.ZM : Ljava/lang/String;
    //   961: getstatic burp/Zxpb.Zo : Ljava/lang/Object;
    //   964: checkcast java/math/BigInteger
    //   967: invokevirtual intValue : ()I
    //   970: bipush #32
    //   972: irem
    //   973: invokestatic abs : (I)I
    //   976: invokevirtual charAt : (I)C
    //   979: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   982: pop
    //   983: iload_2
    //   984: ifeq -> 1360
    //   987: goto -> 994
    //   990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   993: athrow
    //   994: aload_3
    //   995: getstatic burp/Zg_6.Zc : Ljava/lang/String;
    //   998: getstatic burp/Zms1.ZE : Ljava/lang/Object;
    //   1001: checkcast java/math/BigInteger
    //   1004: invokevirtual intValue : ()I
    //   1007: bipush #32
    //   1009: irem
    //   1010: invokestatic abs : (I)I
    //   1013: invokevirtual charAt : (I)C
    //   1016: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1019: pop
    //   1020: iload_2
    //   1021: ifeq -> 1360
    //   1024: goto -> 1031
    //   1027: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1030: athrow
    //   1031: aload_3
    //   1032: getstatic burp/Zzrb.ZA : Ljava/lang/String;
    //   1035: getstatic burp/Zg_i.ZQ : Ljava/lang/Object;
    //   1038: checkcast java/math/BigInteger
    //   1041: invokevirtual intValue : ()I
    //   1044: bipush #32
    //   1046: irem
    //   1047: invokestatic abs : (I)I
    //   1050: invokevirtual charAt : (I)C
    //   1053: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1056: pop
    //   1057: iload_2
    //   1058: ifeq -> 1360
    //   1061: goto -> 1068
    //   1064: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1067: athrow
    //   1068: aload_3
    //   1069: getstatic burp/Zlhy.ZS : Ljava/lang/String;
    //   1072: getstatic burp/Zmh0.Zt : Ljava/lang/Object;
    //   1075: checkcast java/math/BigInteger
    //   1078: invokevirtual intValue : ()I
    //   1081: bipush #32
    //   1083: irem
    //   1084: invokestatic abs : (I)I
    //   1087: invokevirtual charAt : (I)C
    //   1090: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1093: pop
    //   1094: iload_2
    //   1095: ifeq -> 1360
    //   1098: goto -> 1105
    //   1101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1104: athrow
    //   1105: aload_3
    //   1106: getstatic burp/Zgkl.ZR : Ljava/lang/String;
    //   1109: getstatic burp/Ze57.ZR : Ljava/lang/Object;
    //   1112: checkcast java/math/BigInteger
    //   1115: invokevirtual intValue : ()I
    //   1118: bipush #32
    //   1120: irem
    //   1121: invokestatic abs : (I)I
    //   1124: invokevirtual charAt : (I)C
    //   1127: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1130: pop
    //   1131: iload_2
    //   1132: ifeq -> 1360
    //   1135: goto -> 1142
    //   1138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1141: athrow
    //   1142: aload_3
    //   1143: getstatic burp/Zsun.Zu : Ljava/lang/String;
    //   1146: getstatic burp/Zzs9.ZO : Ljava/lang/Object;
    //   1149: checkcast java/math/BigInteger
    //   1152: invokevirtual intValue : ()I
    //   1155: bipush #32
    //   1157: irem
    //   1158: invokestatic abs : (I)I
    //   1161: invokevirtual charAt : (I)C
    //   1164: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1167: pop
    //   1168: iload_2
    //   1169: ifeq -> 1360
    //   1172: goto -> 1179
    //   1175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1178: athrow
    //   1179: aload_3
    //   1180: getstatic burp/Zejj.ZQ : Ljava/lang/String;
    //   1183: getstatic burp/Zk7w.ZF : Ljava/lang/Object;
    //   1186: checkcast java/math/BigInteger
    //   1189: invokevirtual intValue : ()I
    //   1192: bipush #32
    //   1194: irem
    //   1195: invokestatic abs : (I)I
    //   1198: invokevirtual charAt : (I)C
    //   1201: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1204: pop
    //   1205: iload_2
    //   1206: ifeq -> 1360
    //   1209: goto -> 1216
    //   1212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1215: athrow
    //   1216: aload_3
    //   1217: getstatic burp/Zzi_.ZG : Ljava/lang/String;
    //   1220: getstatic burp/Zsfj.ZL : Ljava/lang/Object;
    //   1223: checkcast java/math/BigInteger
    //   1226: invokevirtual intValue : ()I
    //   1229: bipush #32
    //   1231: irem
    //   1232: invokestatic abs : (I)I
    //   1235: invokevirtual charAt : (I)C
    //   1238: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1241: pop
    //   1242: iload_2
    //   1243: ifeq -> 1360
    //   1246: goto -> 1253
    //   1249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1252: athrow
    //   1253: aload_3
    //   1254: getstatic burp/Zs33.ZX : Ljava/lang/String;
    //   1257: getstatic burp/Zbu.ZW : Ljava/lang/Object;
    //   1260: checkcast java/math/BigInteger
    //   1263: invokevirtual intValue : ()I
    //   1266: bipush #32
    //   1268: irem
    //   1269: invokestatic abs : (I)I
    //   1272: invokevirtual charAt : (I)C
    //   1275: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1278: pop
    //   1279: iload_2
    //   1280: ifeq -> 1360
    //   1283: goto -> 1290
    //   1286: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1289: athrow
    //   1290: aload_3
    //   1291: getstatic burp/Zx_b.ZD : Ljava/lang/String;
    //   1294: getstatic burp/Zm06.ZU : Ljava/lang/Object;
    //   1297: checkcast java/math/BigInteger
    //   1300: invokevirtual intValue : ()I
    //   1303: bipush #32
    //   1305: irem
    //   1306: invokestatic abs : (I)I
    //   1309: invokevirtual charAt : (I)C
    //   1312: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1315: pop
    //   1316: iload_2
    //   1317: ifeq -> 1360
    //   1320: goto -> 1327
    //   1323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1326: athrow
    //   1327: aload_3
    //   1328: getstatic burp/Zzx8.Z_ : Ljava/lang/String;
    //   1331: getstatic burp/Zb8v.ZA : Ljava/lang/Object;
    //   1334: checkcast java/math/BigInteger
    //   1337: invokevirtual intValue : ()I
    //   1340: bipush #32
    //   1342: irem
    //   1343: invokestatic abs : (I)I
    //   1346: invokevirtual charAt : (I)C
    //   1349: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1352: pop
    //   1353: goto -> 1360
    //   1356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1359: athrow
    //   1360: iinc #4, 1
    //   1363: iload_2
    //   1364: ifeq -> 30
    //   1367: aload_3
    //   1368: invokevirtual toString : ()Ljava/lang/String;
    //   1371: putstatic burp/Zeuz.Zb : Ljava/lang/String;
    //   1374: sipush #-11554
    //   1377: sipush #-2898
    //   1380: invokestatic a : (II)Ljava/lang/String;
    //   1383: iconst_1
    //   1384: ldc burp/Ze13
    //   1386: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1389: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1392: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1395: astore #4
    //   1397: aload #4
    //   1399: arraylength
    //   1400: istore #5
    //   1402: iconst_0
    //   1403: istore #6
    //   1405: iload #6
    //   1407: iload #5
    //   1409: if_icmpge -> 1547
    //   1412: aload #4
    //   1414: iload #6
    //   1416: aaload
    //   1417: astore #7
    //   1419: aload #7
    //   1421: invokevirtual getModifiers : ()I
    //   1424: invokestatic isStatic : (I)Z
    //   1427: ifne -> 1437
    //   1430: goto -> 1540
    //   1433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1436: athrow
    //   1437: aload #7
    //   1439: invokevirtual getType : ()Ljava/lang/Class;
    //   1442: astore #8
    //   1444: aload #8
    //   1446: ifnull -> 1527
    //   1449: aload #8
    //   1451: invokevirtual isPrimitive : ()Z
    //   1454: ifne -> 1527
    //   1457: goto -> 1464
    //   1460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1463: athrow
    //   1464: aload #8
    //   1466: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1469: ifnull -> 1527
    //   1472: goto -> 1479
    //   1475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1478: athrow
    //   1479: aload #8
    //   1481: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1484: invokevirtual getName : ()Ljava/lang/String;
    //   1487: ifnull -> 1527
    //   1490: goto -> 1497
    //   1493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1496: athrow
    //   1497: aload #8
    //   1499: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1502: invokevirtual getName : ()Ljava/lang/String;
    //   1505: sipush #-11557
    //   1508: sipush #-24417
    //   1511: invokestatic a : (II)Ljava/lang/String;
    //   1514: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1517: ifne -> 1527
    //   1520: goto -> 1527
    //   1523: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1526: athrow
    //   1527: aload #7
    //   1529: iconst_1
    //   1530: invokevirtual setAccessible : (Z)V
    //   1533: aload #7
    //   1535: aconst_null
    //   1536: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1539: pop
    //   1540: iinc #6, 1
    //   1543: iload_2
    //   1544: ifeq -> 1405
    //   1547: sipush #-11564
    //   1550: sipush #-6608
    //   1553: invokestatic a : (II)Ljava/lang/String;
    //   1556: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1559: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1562: astore #4
    //   1564: aload #4
    //   1566: arraylength
    //   1567: istore #5
    //   1569: iconst_0
    //   1570: istore #6
    //   1572: iload #6
    //   1574: iload #5
    //   1576: if_icmpge -> 1688
    //   1579: aload #4
    //   1581: iload #6
    //   1583: aaload
    //   1584: astore #7
    //   1586: aload #7
    //   1588: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1591: pop
    //   1592: aload #7
    //   1594: invokevirtual getModifiers : ()I
    //   1597: invokestatic isStatic : (I)Z
    //   1600: ifeq -> 1674
    //   1603: aload #7
    //   1605: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1608: arraylength
    //   1609: iconst_2
    //   1610: if_icmpne -> 1674
    //   1613: goto -> 1620
    //   1616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1619: athrow
    //   1620: aload #7
    //   1622: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1625: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1628: if_acmpne -> 1674
    //   1631: goto -> 1638
    //   1634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1637: athrow
    //   1638: aload #7
    //   1640: iconst_1
    //   1641: invokevirtual setAccessible : (Z)V
    //   1644: aload #7
    //   1646: aconst_null
    //   1647: iconst_2
    //   1648: anewarray java/lang/Object
    //   1651: dup
    //   1652: iconst_0
    //   1653: aload_0
    //   1654: aastore
    //   1655: dup
    //   1656: iconst_1
    //   1657: aload_1
    //   1658: aastore
    //   1659: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1662: pop
    //   1663: iload_2
    //   1664: ifeq -> 1688
    //   1667: goto -> 1674
    //   1670: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1673: athrow
    //   1674: iinc #6, 1
    //   1677: iload_2
    //   1678: ifeq -> 1572
    //   1681: goto -> 1688
    //   1684: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1687: athrow
    //   1688: sipush #-11556
    //   1691: sipush #13951
    //   1694: invokestatic a : (II)Ljava/lang/String;
    //   1697: iconst_1
    //   1698: ldc burp/Zxzt
    //   1700: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1703: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1706: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1709: astore #4
    //   1711: aload #4
    //   1713: arraylength
    //   1714: istore #5
    //   1716: iconst_0
    //   1717: istore #6
    //   1719: iload #6
    //   1721: iload #5
    //   1723: if_icmpge -> 1861
    //   1726: aload #4
    //   1728: iload #6
    //   1730: aaload
    //   1731: astore #7
    //   1733: aload #7
    //   1735: invokevirtual getModifiers : ()I
    //   1738: invokestatic isStatic : (I)Z
    //   1741: ifne -> 1751
    //   1744: goto -> 1854
    //   1747: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1750: athrow
    //   1751: aload #7
    //   1753: invokevirtual getType : ()Ljava/lang/Class;
    //   1756: astore #8
    //   1758: aload #8
    //   1760: ifnull -> 1841
    //   1763: aload #8
    //   1765: invokevirtual isPrimitive : ()Z
    //   1768: ifne -> 1841
    //   1771: goto -> 1778
    //   1774: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1777: athrow
    //   1778: aload #8
    //   1780: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1783: ifnull -> 1841
    //   1786: goto -> 1793
    //   1789: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1792: athrow
    //   1793: aload #8
    //   1795: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1798: invokevirtual getName : ()Ljava/lang/String;
    //   1801: ifnull -> 1841
    //   1804: goto -> 1811
    //   1807: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1810: athrow
    //   1811: aload #8
    //   1813: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1816: invokevirtual getName : ()Ljava/lang/String;
    //   1819: sipush #-11558
    //   1822: sipush #-31078
    //   1825: invokestatic a : (II)Ljava/lang/String;
    //   1828: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1831: ifne -> 1841
    //   1834: goto -> 1841
    //   1837: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1840: athrow
    //   1841: aload #7
    //   1843: iconst_1
    //   1844: invokevirtual setAccessible : (Z)V
    //   1847: aload #7
    //   1849: aconst_null
    //   1850: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1853: pop
    //   1854: iinc #6, 1
    //   1857: iload_2
    //   1858: ifeq -> 1719
    //   1861: sipush #-11563
    //   1864: sipush #8190
    //   1867: invokestatic a : (II)Ljava/lang/String;
    //   1870: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1873: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1876: astore #4
    //   1878: aload #4
    //   1880: arraylength
    //   1881: istore #5
    //   1883: iconst_0
    //   1884: istore #6
    //   1886: iload #6
    //   1888: iload #5
    //   1890: if_icmpge -> 2023
    //   1893: aload #4
    //   1895: iload #6
    //   1897: aaload
    //   1898: astore #7
    //   1900: aload #7
    //   1902: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1905: pop
    //   1906: aload #7
    //   1908: invokevirtual getModifiers : ()I
    //   1911: invokestatic isStatic : (I)Z
    //   1914: ifeq -> 2009
    //   1917: aload #7
    //   1919: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1922: arraylength
    //   1923: iconst_2
    //   1924: if_icmpne -> 2009
    //   1927: goto -> 1934
    //   1930: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1933: athrow
    //   1934: aload #7
    //   1936: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1939: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1942: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1945: ifeq -> 2009
    //   1948: goto -> 1955
    //   1951: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1954: athrow
    //   1955: aload #7
    //   1957: iconst_1
    //   1958: invokevirtual setAccessible : (Z)V
    //   1961: aload #7
    //   1963: aconst_null
    //   1964: iconst_2
    //   1965: anewarray java/lang/Object
    //   1968: dup
    //   1969: iconst_0
    //   1970: aload_0
    //   1971: aastore
    //   1972: dup
    //   1973: iconst_1
    //   1974: aload_1
    //   1975: ifnonnull -> 1993
    //   1978: goto -> 1985
    //   1981: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1984: athrow
    //   1985: aload_1
    //   1986: goto -> 2000
    //   1989: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1992: athrow
    //   1993: aload_1
    //   1994: checkcast [B
    //   1997: invokevirtual clone : ()Ljava/lang/Object;
    //   2000: aastore
    //   2001: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2004: pop
    //   2005: iload_2
    //   2006: ifeq -> 2023
    //   2009: iinc #6, 1
    //   2012: iload_2
    //   2013: ifeq -> 1886
    //   2016: goto -> 2023
    //   2019: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2022: athrow
    //   2023: getstatic burp/Zre4.Zh : Ljava/lang/String;
    //   2026: getstatic burp/Zl1n.ZM : Ljava/lang/Object;
    //   2029: checkcast java/math/BigInteger
    //   2032: invokevirtual intValue : ()I
    //   2035: bipush #32
    //   2037: irem
    //   2038: invokestatic abs : (I)I
    //   2041: invokevirtual charAt : (I)C
    //   2044: getstatic burp/Zkbm.Zb : Ljava/lang/String;
    //   2047: getstatic burp/Zz8o.Zg : Ljava/lang/Object;
    //   2050: checkcast java/math/BigInteger
    //   2053: invokevirtual intValue : ()I
    //   2056: bipush #32
    //   2058: irem
    //   2059: invokestatic abs : (I)I
    //   2062: invokevirtual charAt : (I)C
    //   2065: if_icmpgt -> 2172
    //   2068: getstatic burp/Zd1.ZN : Ljava/lang/String;
    //   2071: getstatic burp/Zxxd.Zn : Ljava/lang/Object;
    //   2074: checkcast java/math/BigInteger
    //   2077: invokevirtual intValue : ()I
    //   2080: bipush #32
    //   2082: irem
    //   2083: invokestatic abs : (I)I
    //   2086: invokevirtual charAt : (I)C
    //   2089: getstatic burp/Zmjr.Zc : Ljava/lang/String;
    //   2092: getstatic burp/Zzna.ZD : Ljava/lang/Object;
    //   2095: checkcast java/math/BigInteger
    //   2098: invokevirtual intValue : ()I
    //   2101: bipush #32
    //   2103: irem
    //   2104: invokestatic abs : (I)I
    //   2107: invokevirtual charAt : (I)C
    //   2110: if_icmple -> 2172
    //   2113: goto -> 2120
    //   2116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2119: athrow
    //   2120: getstatic burp/Zx4k.ZC : Ljava/lang/String;
    //   2123: getstatic burp/Zg1l.Zg : Ljava/lang/Object;
    //   2126: checkcast java/math/BigInteger
    //   2129: invokevirtual intValue : ()I
    //   2132: bipush #32
    //   2134: irem
    //   2135: invokestatic abs : (I)I
    //   2138: invokevirtual charAt : (I)C
    //   2141: getstatic burp/Ztpg.Zr : Ljava/lang/String;
    //   2144: getstatic burp/Zlo0.Zu : Ljava/lang/Object;
    //   2147: checkcast java/math/BigInteger
    //   2150: invokevirtual intValue : ()I
    //   2153: bipush #32
    //   2155: irem
    //   2156: invokestatic abs : (I)I
    //   2159: invokevirtual charAt : (I)C
    //   2162: if_icmpgt -> 2180
    //   2165: goto -> 2172
    //   2168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2171: athrow
    //   2172: iconst_1
    //   2173: goto -> 2181
    //   2176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2179: athrow
    //   2180: iconst_0
    //   2181: ireturn
    //   2182: astore_3
    //   2183: new java/lang/Exception
    //   2186: dup
    //   2187: aload_3
    //   2188: invokevirtual getMessage : ()Ljava/lang/String;
    //   2191: invokespecial <init> : (Ljava/lang/String;)V
    //   2194: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2181	2182	java/lang/Throwable
    //   37	210	213	java/lang/Throwable
    //   180	247	250	java/lang/Throwable
    //   217	284	287	java/lang/Throwable
    //   254	321	324	java/lang/Throwable
    //   291	358	361	java/lang/Throwable
    //   328	395	398	java/lang/Throwable
    //   365	432	435	java/lang/Throwable
    //   402	469	472	java/lang/Throwable
    //   439	506	509	java/lang/Throwable
    //   476	543	546	java/lang/Throwable
    //   513	580	583	java/lang/Throwable
    //   550	617	620	java/lang/Throwable
    //   587	654	657	java/lang/Throwable
    //   624	691	694	java/lang/Throwable
    //   661	728	731	java/lang/Throwable
    //   698	765	768	java/lang/Throwable
    //   735	802	805	java/lang/Throwable
    //   772	839	842	java/lang/Throwable
    //   809	876	879	java/lang/Throwable
    //   846	913	916	java/lang/Throwable
    //   883	950	953	java/lang/Throwable
    //   920	987	990	java/lang/Throwable
    //   957	1024	1027	java/lang/Throwable
    //   994	1061	1064	java/lang/Throwable
    //   1031	1098	1101	java/lang/Throwable
    //   1068	1135	1138	java/lang/Throwable
    //   1105	1172	1175	java/lang/Throwable
    //   1142	1209	1212	java/lang/Throwable
    //   1179	1246	1249	java/lang/Throwable
    //   1216	1283	1286	java/lang/Throwable
    //   1253	1320	1323	java/lang/Throwable
    //   1290	1353	1356	java/lang/Throwable
    //   1419	1433	1433	java/lang/Throwable
    //   1444	1457	1460	java/lang/Throwable
    //   1449	1472	1475	java/lang/Throwable
    //   1464	1490	1493	java/lang/Throwable
    //   1479	1520	1523	java/lang/Throwable
    //   1586	1613	1616	java/lang/Throwable
    //   1603	1631	1634	java/lang/Throwable
    //   1620	1667	1670	java/lang/Throwable
    //   1638	1681	1684	java/lang/Throwable
    //   1733	1747	1747	java/lang/Throwable
    //   1758	1771	1774	java/lang/Throwable
    //   1763	1786	1789	java/lang/Throwable
    //   1778	1804	1807	java/lang/Throwable
    //   1793	1834	1837	java/lang/Throwable
    //   1900	1927	1930	java/lang/Throwable
    //   1917	1948	1951	java/lang/Throwable
    //   1934	1978	1981	java/lang/Throwable
    //   1955	1989	1989	java/lang/Throwable
    //   2000	2016	2019	java/lang/Throwable
    //   2023	2113	2116	java/lang/Throwable
    //   2068	2165	2168	java/lang/Throwable
    //   2120	2176	2176	java/lang/Throwable
  }
  
  static void ZF(Object paramObject) {
    Zkaw.ZI = a(-11559, 27266);
    Zkaw.ZB = new BigInteger(a(-11561, -13570));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zl7k.ZX.charAt(Math.abs(((BigInteger)Zxdh.ZD).intValue() % 32)) <= Zb_c.ZS.charAt(Math.abs(((BigInteger)Zl7k.ZS).intValue() % 32))) {
          try {
            Zero.ZY(Class.forName(a(-11562, -3686)));
            if (bool)
              Zxdh.ZY(Class.forName(a(-11560, 18812))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxdh.ZY(Class.forName(a(-11560, 18812)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'nßÛâ×\\t@qS½3ów [\\f0uÅt«ïÀXæ¨¢üaËL2²'N?Ht\É\\t2Ô;ä>ÏsÍ©¯H\\tN7´ ÅÕV\\t»BPÿiUû¾ R£Ø2øöêâ]ö\\t¦©þlhyMÏa®ßÔ¸µÙYLmí#MÜº²YDCuñ)N½dZ£m¬m÷U[þû\ÜZú?ÇìðIYQÏï ÜO$-!ÅT\\bøè\\t`_U¹I'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_1
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
    //   64: goto -> 23
    //   67: ldc '½çFfQrÑ\\tpÕÿ fºoR'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #6
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
    //   128: putstatic burp/Zx4k.a : [Ljava/lang/String;
    //   131: bipush #12
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zx4k.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_1
    //   213: goto -> 243
    //   216: bipush #109
    //   218: goto -> 243
    //   221: bipush #75
    //   223: goto -> 243
    //   226: bipush #90
    //   228: goto -> 243
    //   231: bipush #36
    //   233: goto -> 243
    //   236: bipush #23
    //   238: goto -> 243
    //   241: bipush #120
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: sipush #-11555
    //   303: sipush #7734
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zx4k.ZC : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #23
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-99
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-114
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-90
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-93
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: iconst_1
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-116
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #45
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: iconst_2
    //   366: bastore
    //   367: dup
    //   368: bipush #9
    //   370: bipush #118
    //   372: bastore
    //   373: dup
    //   374: bipush #10
    //   376: bipush #103
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: bipush #-116
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #78
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #-93
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #110
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: bipush #108
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #-19
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #-108
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #71
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #-67
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #41
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #68
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #-18
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #64
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #60
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #-4
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #43
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #16
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #116
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: iconst_0
    //   491: bastore
    //   492: dup
    //   493: bipush #30
    //   495: bipush #48
    //   497: bastore
    //   498: dup
    //   499: bipush #31
    //   501: bipush #102
    //   503: bastore
    //   504: invokespecial <init> : (I[B)V
    //   507: putstatic burp/Zx4k.ZE : Ljava/lang/Object;
    //   510: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD2DF) & 0xFFFF;
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
      char c = 'Ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx4k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */