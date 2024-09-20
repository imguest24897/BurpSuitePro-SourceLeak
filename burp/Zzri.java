package burp;

import java.math.BigInteger;

class Zzri extends ClassLoader {
  static String ZL;
  
  static Object ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZF(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #-27274
    //   7: sipush #-2384
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic ZJ : (Ljava/lang/Object;)V
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
    //   181: getstatic burp/Zlp8.ZW : Ljava/lang/String;
    //   184: getstatic burp/Zkup.Zf : Ljava/lang/Object;
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
    //   218: getstatic burp/Zm0v.Zd : Ljava/lang/String;
    //   221: getstatic burp/Zedz.Za : Ljava/lang/Object;
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
    //   255: getstatic burp/Zbwj.ZP : Ljava/lang/String;
    //   258: getstatic burp/Zzxv.ZZ : Ljava/lang/Object;
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
    //   292: getstatic burp/Zgde.Zr : Ljava/lang/String;
    //   295: getstatic burp/Zzk9.ZK : Ljava/lang/Object;
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
    //   329: getstatic burp/Zoa.ZF : Ljava/lang/String;
    //   332: getstatic burp/Ze3t.Zp : Ljava/lang/Object;
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
    //   366: getstatic burp/Zbnb.Zd : Ljava/lang/String;
    //   369: getstatic burp/Zkby.Zv : Ljava/lang/Object;
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
    //   403: getstatic burp/Zlo2.ZJ : Ljava/lang/String;
    //   406: getstatic burp/Zxdh.ZD : Ljava/lang/Object;
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
    //   440: getstatic burp/Zsx6.ZJ : Ljava/lang/String;
    //   443: getstatic burp/Zl3l.Zv : Ljava/lang/Object;
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
    //   477: getstatic burp/Zgw7.ZN : Ljava/lang/String;
    //   480: getstatic burp/Zmz.ZW : Ljava/lang/Object;
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
    //   514: getstatic burp/Zx8t.Zi : Ljava/lang/String;
    //   517: getstatic burp/Zblj.Zl : Ljava/lang/Object;
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
    //   551: getstatic burp/Zzy5.ZD : Ljava/lang/String;
    //   554: getstatic burp/Zr4z.ZH : Ljava/lang/Object;
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
    //   588: getstatic burp/Ztgv.ZC : Ljava/lang/String;
    //   591: getstatic burp/Zgb9.Zb : Ljava/lang/Object;
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
    //   625: getstatic burp/Zxdh.Zj : Ljava/lang/String;
    //   628: getstatic burp/Zb9k.Zi : Ljava/lang/Object;
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
    //   662: getstatic burp/Zkht.Zd : Ljava/lang/String;
    //   665: getstatic burp/Zt7j.ZH : Ljava/lang/Object;
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
    //   699: getstatic burp/Zlyf.ZU : Ljava/lang/String;
    //   702: getstatic burp/Ztte.ZR : Ljava/lang/Object;
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
    //   736: getstatic burp/Ztq8.ZI : Ljava/lang/String;
    //   739: getstatic burp/Zrx5.ZE : Ljava/lang/Object;
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
    //   773: getstatic burp/Ztid.Zz : Ljava/lang/String;
    //   776: getstatic burp/Zbqk.ZT : Ljava/lang/Object;
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
    //   810: getstatic burp/Zxx4.Zq : Ljava/lang/String;
    //   813: getstatic burp/Zr48.ZZ : Ljava/lang/Object;
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
    //   847: getstatic burp/Zz58.ZT : Ljava/lang/String;
    //   850: getstatic burp/Zxd0.Za : Ljava/lang/Object;
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
    //   884: getstatic burp/Zk8g.ZH : Ljava/lang/String;
    //   887: getstatic burp/Zz0b.ZT : Ljava/lang/Object;
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
    //   921: getstatic burp/Zzxv.Z_ : Ljava/lang/String;
    //   924: getstatic burp/Zetv.ZI : Ljava/lang/Object;
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
    //   958: getstatic burp/Zx4l.Zy : Ljava/lang/String;
    //   961: getstatic burp/Zl50.ZV : Ljava/lang/Object;
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
    //   995: getstatic burp/Zxe.ZD : Ljava/lang/String;
    //   998: getstatic burp/Zzr.ZZ : Ljava/lang/Object;
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
    //   1032: getstatic burp/Zlzo.Zs : Ljava/lang/String;
    //   1035: getstatic burp/Ze3d.Ze : Ljava/lang/Object;
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
    //   1069: getstatic burp/Zgmo.Zr : Ljava/lang/String;
    //   1072: getstatic burp/Zlem.ZI : Ljava/lang/Object;
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
    //   1106: getstatic burp/Ze_0.Zi : Ljava/lang/String;
    //   1109: getstatic burp/Zzr.ZZ : Ljava/lang/Object;
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
    //   1143: getstatic burp/Zgzv.Zy : Ljava/lang/String;
    //   1146: getstatic burp/Zxd4.Zt : Ljava/lang/Object;
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
    //   1180: getstatic burp/Zeai.ZA : Ljava/lang/String;
    //   1183: getstatic burp/Zvi.Zs : Ljava/lang/Object;
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
    //   1217: getstatic burp/Zs75.Zn : Ljava/lang/String;
    //   1220: getstatic burp/Zrly.ZB : Ljava/lang/Object;
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
    //   1254: getstatic burp/Zrpx.ZM : Ljava/lang/String;
    //   1257: getstatic burp/Zs15.Zk : Ljava/lang/Object;
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
    //   1291: getstatic burp/Zez0.Zp : Ljava/lang/String;
    //   1294: getstatic burp/Zrkc.ZI : Ljava/lang/Object;
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
    //   1328: getstatic burp/Zrfh.ZH : Ljava/lang/String;
    //   1331: getstatic burp/Zbzj.Zz : Ljava/lang/Object;
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
    //   1371: putstatic burp/Zzr5.Zg : Ljava/lang/String;
    //   1374: sipush #-27267
    //   1377: getstatic burp/Zl3j.ZY : Ljava/lang/Object;
    //   1380: checkcast java/math/BigInteger
    //   1383: getstatic burp/Zsxm.Zv : Ljava/lang/Object;
    //   1386: checkcast java/math/BigInteger
    //   1389: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1392: putstatic burp/Zg68.Zs : Ljava/lang/Object;
    //   1395: sipush #24168
    //   1398: invokestatic a : (II)Ljava/lang/String;
    //   1401: iconst_1
    //   1402: ldc burp/Ztmy
    //   1404: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1407: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1410: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1413: astore #4
    //   1415: aload #4
    //   1417: arraylength
    //   1418: istore #5
    //   1420: iconst_0
    //   1421: istore #6
    //   1423: iload #6
    //   1425: iload #5
    //   1427: if_icmpge -> 1565
    //   1430: aload #4
    //   1432: iload #6
    //   1434: aaload
    //   1435: astore #7
    //   1437: aload #7
    //   1439: invokevirtual getModifiers : ()I
    //   1442: invokestatic isStatic : (I)Z
    //   1445: ifne -> 1455
    //   1448: goto -> 1558
    //   1451: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1454: athrow
    //   1455: aload #7
    //   1457: invokevirtual getType : ()Ljava/lang/Class;
    //   1460: astore #8
    //   1462: aload #8
    //   1464: ifnull -> 1545
    //   1467: aload #8
    //   1469: invokevirtual isPrimitive : ()Z
    //   1472: ifne -> 1545
    //   1475: goto -> 1482
    //   1478: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1481: athrow
    //   1482: aload #8
    //   1484: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1487: ifnull -> 1545
    //   1490: goto -> 1497
    //   1493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1496: athrow
    //   1497: aload #8
    //   1499: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1502: invokevirtual getName : ()Ljava/lang/String;
    //   1505: ifnull -> 1545
    //   1508: goto -> 1515
    //   1511: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1514: athrow
    //   1515: aload #8
    //   1517: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1520: invokevirtual getName : ()Ljava/lang/String;
    //   1523: sipush #-27271
    //   1526: sipush #-4201
    //   1529: invokestatic a : (II)Ljava/lang/String;
    //   1532: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1535: ifne -> 1545
    //   1538: goto -> 1545
    //   1541: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1544: athrow
    //   1545: aload #7
    //   1547: iconst_1
    //   1548: invokevirtual setAccessible : (Z)V
    //   1551: aload #7
    //   1553: aconst_null
    //   1554: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1557: pop
    //   1558: iinc #6, 1
    //   1561: iload_2
    //   1562: ifeq -> 1423
    //   1565: sipush #-27270
    //   1568: sipush #9516
    //   1571: invokestatic a : (II)Ljava/lang/String;
    //   1574: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1577: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1580: astore #4
    //   1582: aload #4
    //   1584: arraylength
    //   1585: istore #5
    //   1587: iconst_0
    //   1588: istore #6
    //   1590: iload #6
    //   1592: iload #5
    //   1594: if_icmpge -> 1724
    //   1597: aload #4
    //   1599: iload #6
    //   1601: aaload
    //   1602: astore #7
    //   1604: aload #7
    //   1606: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1609: pop
    //   1610: aload #7
    //   1612: invokevirtual getModifiers : ()I
    //   1615: invokestatic isStatic : (I)Z
    //   1618: ifeq -> 1710
    //   1621: aload #7
    //   1623: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1626: arraylength
    //   1627: iconst_2
    //   1628: if_icmpne -> 1710
    //   1631: goto -> 1638
    //   1634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1637: athrow
    //   1638: aload #7
    //   1640: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1643: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1646: if_acmpne -> 1710
    //   1649: goto -> 1656
    //   1652: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1655: athrow
    //   1656: aload #7
    //   1658: iconst_1
    //   1659: invokevirtual setAccessible : (Z)V
    //   1662: aload #7
    //   1664: aconst_null
    //   1665: iconst_2
    //   1666: anewarray java/lang/Object
    //   1669: dup
    //   1670: iconst_0
    //   1671: aload_0
    //   1672: aastore
    //   1673: dup
    //   1674: iconst_1
    //   1675: aload_1
    //   1676: ifnonnull -> 1694
    //   1679: goto -> 1686
    //   1682: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1685: athrow
    //   1686: aload_1
    //   1687: goto -> 1701
    //   1690: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1693: athrow
    //   1694: aload_1
    //   1695: checkcast [B
    //   1698: invokevirtual clone : ()Ljava/lang/Object;
    //   1701: aastore
    //   1702: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1705: pop
    //   1706: iload_2
    //   1707: ifeq -> 1724
    //   1710: iinc #6, 1
    //   1713: iload_2
    //   1714: ifeq -> 1590
    //   1717: goto -> 1724
    //   1720: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1723: athrow
    //   1724: sipush #-27268
    //   1727: sipush #19363
    //   1730: invokestatic a : (II)Ljava/lang/String;
    //   1733: iconst_1
    //   1734: ldc burp/Zxzp
    //   1736: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1739: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1742: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1745: astore #4
    //   1747: aload #4
    //   1749: arraylength
    //   1750: istore #5
    //   1752: iconst_0
    //   1753: istore #6
    //   1755: iload #6
    //   1757: iload #5
    //   1759: if_icmpge -> 1897
    //   1762: aload #4
    //   1764: iload #6
    //   1766: aaload
    //   1767: astore #7
    //   1769: aload #7
    //   1771: invokevirtual getModifiers : ()I
    //   1774: invokestatic isStatic : (I)Z
    //   1777: ifne -> 1787
    //   1780: goto -> 1890
    //   1783: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1786: athrow
    //   1787: aload #7
    //   1789: invokevirtual getType : ()Ljava/lang/Class;
    //   1792: astore #8
    //   1794: aload #8
    //   1796: ifnull -> 1877
    //   1799: aload #8
    //   1801: invokevirtual isPrimitive : ()Z
    //   1804: ifne -> 1877
    //   1807: goto -> 1814
    //   1810: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1813: athrow
    //   1814: aload #8
    //   1816: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1819: ifnull -> 1877
    //   1822: goto -> 1829
    //   1825: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1828: athrow
    //   1829: aload #8
    //   1831: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1834: invokevirtual getName : ()Ljava/lang/String;
    //   1837: ifnull -> 1877
    //   1840: goto -> 1847
    //   1843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1846: athrow
    //   1847: aload #8
    //   1849: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1852: invokevirtual getName : ()Ljava/lang/String;
    //   1855: sipush #-27269
    //   1858: sipush #2602
    //   1861: invokestatic a : (II)Ljava/lang/String;
    //   1864: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1867: ifne -> 1877
    //   1870: goto -> 1877
    //   1873: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1876: athrow
    //   1877: aload #7
    //   1879: iconst_1
    //   1880: invokevirtual setAccessible : (Z)V
    //   1883: aload #7
    //   1885: aconst_null
    //   1886: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1889: pop
    //   1890: iinc #6, 1
    //   1893: iload_2
    //   1894: ifeq -> 1755
    //   1897: sipush #-27272
    //   1900: sipush #-9298
    //   1903: invokestatic a : (II)Ljava/lang/String;
    //   1906: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1909: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1912: astore #4
    //   1914: aload #4
    //   1916: arraylength
    //   1917: istore #5
    //   1919: iconst_0
    //   1920: istore #6
    //   1922: iload #6
    //   1924: iload #5
    //   1926: if_icmpge -> 2059
    //   1929: aload #4
    //   1931: iload #6
    //   1933: aaload
    //   1934: astore #7
    //   1936: aload #7
    //   1938: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1941: pop
    //   1942: aload #7
    //   1944: invokevirtual getModifiers : ()I
    //   1947: invokestatic isStatic : (I)Z
    //   1950: ifeq -> 2045
    //   1953: aload #7
    //   1955: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1958: arraylength
    //   1959: iconst_2
    //   1960: if_icmpne -> 2045
    //   1963: goto -> 1970
    //   1966: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1969: athrow
    //   1970: aload #7
    //   1972: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1975: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1978: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1981: ifeq -> 2045
    //   1984: goto -> 1991
    //   1987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1990: athrow
    //   1991: aload #7
    //   1993: iconst_1
    //   1994: invokevirtual setAccessible : (Z)V
    //   1997: aload #7
    //   1999: aconst_null
    //   2000: iconst_2
    //   2001: anewarray java/lang/Object
    //   2004: dup
    //   2005: iconst_0
    //   2006: aload_0
    //   2007: aastore
    //   2008: dup
    //   2009: iconst_1
    //   2010: aload_1
    //   2011: ifnonnull -> 2029
    //   2014: goto -> 2021
    //   2017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2020: athrow
    //   2021: aload_1
    //   2022: goto -> 2036
    //   2025: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2028: athrow
    //   2029: aload_1
    //   2030: checkcast [B
    //   2033: invokevirtual clone : ()Ljava/lang/Object;
    //   2036: aastore
    //   2037: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2040: pop
    //   2041: iload_2
    //   2042: ifeq -> 2059
    //   2045: iinc #6, 1
    //   2048: iload_2
    //   2049: ifeq -> 1922
    //   2052: goto -> 2059
    //   2055: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2058: athrow
    //   2059: getstatic burp/Zgii.Ze : Ljava/lang/String;
    //   2062: getstatic burp/Zmpv.ZI : Ljava/lang/Object;
    //   2065: checkcast java/math/BigInteger
    //   2068: invokevirtual intValue : ()I
    //   2071: bipush #32
    //   2073: irem
    //   2074: invokestatic abs : (I)I
    //   2077: invokevirtual charAt : (I)C
    //   2080: getstatic burp/Zgta.ZL : Ljava/lang/String;
    //   2083: getstatic burp/Zbzj.Zz : Ljava/lang/Object;
    //   2086: checkcast java/math/BigInteger
    //   2089: invokevirtual intValue : ()I
    //   2092: bipush #32
    //   2094: irem
    //   2095: invokestatic abs : (I)I
    //   2098: invokevirtual charAt : (I)C
    //   2101: if_icmpgt -> 2216
    //   2104: getstatic burp/Ztd6.Zu : Ljava/lang/String;
    //   2107: getstatic burp/Zlbr.Zp : Ljava/lang/Object;
    //   2110: checkcast java/math/BigInteger
    //   2113: invokevirtual intValue : ()I
    //   2116: bipush #32
    //   2118: irem
    //   2119: invokestatic abs : (I)I
    //   2122: invokevirtual charAt : (I)C
    //   2125: getstatic burp/Zbo7.ZZ : Ljava/lang/String;
    //   2128: getstatic burp/Zg99.ZZ : Ljava/lang/Object;
    //   2131: checkcast java/math/BigInteger
    //   2134: invokevirtual intValue : ()I
    //   2137: bipush #32
    //   2139: irem
    //   2140: invokestatic abs : (I)I
    //   2143: invokevirtual charAt : (I)C
    //   2146: if_icmple -> 2216
    //   2149: goto -> 2156
    //   2152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2155: athrow
    //   2156: getstatic burp/Zb3l.Zz : Ljava/lang/String;
    //   2159: getstatic burp/Ze13.ZD : Ljava/lang/Object;
    //   2162: checkcast java/math/BigInteger
    //   2165: invokevirtual intValue : ()I
    //   2168: bipush #32
    //   2170: irem
    //   2171: invokestatic abs : (I)I
    //   2174: invokevirtual charAt : (I)C
    //   2177: getstatic burp/Zzgh.Zn : Ljava/lang/String;
    //   2180: getstatic burp/Zgyc.ZT : Ljava/lang/Object;
    //   2183: checkcast java/math/BigInteger
    //   2186: invokevirtual intValue : ()I
    //   2189: bipush #32
    //   2191: irem
    //   2192: invokestatic abs : (I)I
    //   2195: invokevirtual charAt : (I)C
    //   2198: if_icmpgt -> 2216
    //   2201: goto -> 2208
    //   2204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2207: athrow
    //   2208: iconst_1
    //   2209: goto -> 2217
    //   2212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2215: athrow
    //   2216: iconst_0
    //   2217: ireturn
    //   2218: astore_3
    //   2219: new java/lang/Exception
    //   2222: dup
    //   2223: aload_3
    //   2224: invokevirtual getMessage : ()Ljava/lang/String;
    //   2227: invokespecial <init> : (Ljava/lang/String;)V
    //   2230: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2217	2218	java/lang/Throwable
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
    //   1437	1451	1451	java/lang/Throwable
    //   1462	1475	1478	java/lang/Throwable
    //   1467	1490	1493	java/lang/Throwable
    //   1482	1508	1511	java/lang/Throwable
    //   1497	1538	1541	java/lang/Throwable
    //   1604	1631	1634	java/lang/Throwable
    //   1621	1649	1652	java/lang/Throwable
    //   1638	1679	1682	java/lang/Throwable
    //   1656	1690	1690	java/lang/Throwable
    //   1701	1717	1720	java/lang/Throwable
    //   1769	1783	1783	java/lang/Throwable
    //   1794	1807	1810	java/lang/Throwable
    //   1799	1822	1825	java/lang/Throwable
    //   1814	1840	1843	java/lang/Throwable
    //   1829	1870	1873	java/lang/Throwable
    //   1936	1963	1966	java/lang/Throwable
    //   1953	1984	1987	java/lang/Throwable
    //   1970	2014	2017	java/lang/Throwable
    //   1991	2025	2025	java/lang/Throwable
    //   2036	2052	2055	java/lang/Throwable
    //   2059	2149	2152	java/lang/Throwable
    //   2104	2201	2204	java/lang/Throwable
    //   2156	2212	2212	java/lang/Throwable
  }
  
  static void Zd(Object paramObject) {
    Zf.Zd = a(-27265, 26793);
    Zf.Zh = new BigInteger(a(-27276, 10891));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zxf8.Zq.charAt(Math.abs(((BigInteger)Zg8v.ZB).intValue() % 32)) <= Zxd4.Zf.charAt(Math.abs(((BigInteger)Zmha.ZM).intValue() % 32))) {
          try {
            Zlkm.ZW(Class.forName(a(-27266, -5503)));
            if (bool)
              Zzoc.ZE(Class.forName(a(-27275, 30568))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zzoc.ZE(Class.forName(a(-27275, 30568)));
    } catch (Throwable throwable) {}
  }
  
  static void ZE(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '©Ëã~¥¡ö\\tÄ Nz*QE| H©«â~J~û;CòÆ_e%ûì\\nj5%üdÓ+vpö\\tö5\\bÜâÚ[ÈÌÏã\\tipûtËc¨ÝQmP\\t\;]H½NÌå\\t©Òã ¼=µL$½HEµH·(.6àä²7C×vß¤¨B)*gÀyÅ.`6ñqáû·­r±Àxç'ë_O:{V¸ôâÖ¯ôÅ ;]\-'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #75
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
    //   68: ldc '\\b-å­l:¥Îþfdµ ëªùª§Á±Lx[s\\t¸µ]eÄ«c'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #16
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
    //   129: putstatic burp/Zzri.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzri.b : [Ljava/lang/String;
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
    //   212: bipush #108
    //   214: goto -> 244
    //   217: bipush #23
    //   219: goto -> 244
    //   222: bipush #37
    //   224: goto -> 244
    //   227: bipush #17
    //   229: goto -> 244
    //   232: bipush #119
    //   234: goto -> 244
    //   237: bipush #58
    //   239: goto -> 244
    //   242: bipush #26
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
    //   300: sipush #-27273
    //   303: sipush #28917
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zzri.ZL : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #12
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-74
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #122
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #44
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-119
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-52
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-32
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-30
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-108
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #31
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-101
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-26
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-117
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-108
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-27
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-72
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-33
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #68
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-2
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #113
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #81
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-97
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #9
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-68
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #39
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-30
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-83
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #107
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-58
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #30
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #45
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-46
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zzri.ZG : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF957D) & 0xFFFF;
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
      byte b1 = 58;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzri.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */