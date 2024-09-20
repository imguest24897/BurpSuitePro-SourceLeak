package burp;

import java.math.BigInteger;

class Zxf8 extends ClassLoader {
  static Object Zz;
  
  static String Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Za(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zf(Object paramObject) {
    Zmha.Zo = a(28508, -32497);
    Zmha.ZM = new BigInteger(a(28504, -12293));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zmha.Zo.charAt(Math.abs(((BigInteger)Zrpm.ZR).intValue() % 32)) <= Zeuz.Zb.charAt(Math.abs(((BigInteger)Zgia.Zx).intValue() % 32))) {
          try {
            Zlxs.Zc(Class.forName(a(28506, -6833)));
            if (bool)
              Zlwi.ZE(Class.forName(a(28509, 24867))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlwi.ZE(Class.forName(a(28509, 24867)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zl(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: sipush #28496
    //   7: sipush #-16452
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic Zn : (Ljava/lang/Object;)V
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
    //   181: getstatic burp/Zb0s.Zi : Ljava/lang/String;
    //   184: getstatic burp/Zl5d.Za : Ljava/lang/Object;
    //   187: checkcast java/math/BigInteger
    //   190: invokevirtual intValue : ()I
    //   193: bipush #32
    //   195: irem
    //   196: invokestatic abs : (I)I
    //   199: invokevirtual charAt : (I)C
    //   202: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: iload_2
    //   207: ifne -> 1360
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   216: athrow
    //   217: aload_3
    //   218: getstatic burp/Zsm3.Zl : Ljava/lang/String;
    //   221: getstatic burp/Zs15.Zk : Ljava/lang/Object;
    //   224: checkcast java/math/BigInteger
    //   227: invokevirtual intValue : ()I
    //   230: bipush #32
    //   232: irem
    //   233: invokestatic abs : (I)I
    //   236: invokevirtual charAt : (I)C
    //   239: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   242: pop
    //   243: iload_2
    //   244: ifne -> 1360
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   253: athrow
    //   254: aload_3
    //   255: getstatic burp/Ze7y.Zm : Ljava/lang/String;
    //   258: getstatic burp/Zk7w.ZF : Ljava/lang/Object;
    //   261: checkcast java/math/BigInteger
    //   264: invokevirtual intValue : ()I
    //   267: bipush #32
    //   269: irem
    //   270: invokestatic abs : (I)I
    //   273: invokevirtual charAt : (I)C
    //   276: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   279: pop
    //   280: iload_2
    //   281: ifne -> 1360
    //   284: goto -> 291
    //   287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   290: athrow
    //   291: aload_3
    //   292: getstatic burp/Zspk.ZA : Ljava/lang/String;
    //   295: getstatic burp/Zz5l.Zb : Ljava/lang/Object;
    //   298: checkcast java/math/BigInteger
    //   301: invokevirtual intValue : ()I
    //   304: bipush #32
    //   306: irem
    //   307: invokestatic abs : (I)I
    //   310: invokevirtual charAt : (I)C
    //   313: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: iload_2
    //   318: ifne -> 1360
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   327: athrow
    //   328: aload_3
    //   329: getstatic burp/Zlpl.ZO : Ljava/lang/String;
    //   332: getstatic burp/Zlo4.ZC : Ljava/lang/Object;
    //   335: checkcast java/math/BigInteger
    //   338: invokevirtual intValue : ()I
    //   341: bipush #32
    //   343: irem
    //   344: invokestatic abs : (I)I
    //   347: invokevirtual charAt : (I)C
    //   350: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   353: pop
    //   354: iload_2
    //   355: ifne -> 1360
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   364: athrow
    //   365: aload_3
    //   366: getstatic burp/Zs00.Zv : Ljava/lang/String;
    //   369: getstatic burp/Zvi.Zs : Ljava/lang/Object;
    //   372: checkcast java/math/BigInteger
    //   375: invokevirtual intValue : ()I
    //   378: bipush #32
    //   380: irem
    //   381: invokestatic abs : (I)I
    //   384: invokevirtual charAt : (I)C
    //   387: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   390: pop
    //   391: iload_2
    //   392: ifne -> 1360
    //   395: goto -> 402
    //   398: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   401: athrow
    //   402: aload_3
    //   403: getstatic burp/Zmz.Zp : Ljava/lang/String;
    //   406: getstatic burp/Zxzj.ZO : Ljava/lang/Object;
    //   409: checkcast java/math/BigInteger
    //   412: invokevirtual intValue : ()I
    //   415: bipush #32
    //   417: irem
    //   418: invokestatic abs : (I)I
    //   421: invokevirtual charAt : (I)C
    //   424: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   427: pop
    //   428: iload_2
    //   429: ifne -> 1360
    //   432: goto -> 439
    //   435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   438: athrow
    //   439: aload_3
    //   440: getstatic burp/Zb6b.Zn : Ljava/lang/String;
    //   443: getstatic burp/Zk7b.ZR : Ljava/lang/Object;
    //   446: checkcast java/math/BigInteger
    //   449: invokevirtual intValue : ()I
    //   452: bipush #32
    //   454: irem
    //   455: invokestatic abs : (I)I
    //   458: invokevirtual charAt : (I)C
    //   461: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   464: pop
    //   465: iload_2
    //   466: ifne -> 1360
    //   469: goto -> 476
    //   472: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   475: athrow
    //   476: aload_3
    //   477: getstatic burp/Zspk.ZA : Ljava/lang/String;
    //   480: getstatic burp/Ztys.Zs : Ljava/lang/Object;
    //   483: checkcast java/math/BigInteger
    //   486: invokevirtual intValue : ()I
    //   489: bipush #32
    //   491: irem
    //   492: invokestatic abs : (I)I
    //   495: invokevirtual charAt : (I)C
    //   498: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   501: pop
    //   502: iload_2
    //   503: ifne -> 1360
    //   506: goto -> 513
    //   509: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   512: athrow
    //   513: aload_3
    //   514: getstatic burp/Zg0j.Ze : Ljava/lang/String;
    //   517: getstatic burp/Ze5f.Zh : Ljava/lang/Object;
    //   520: checkcast java/math/BigInteger
    //   523: invokevirtual intValue : ()I
    //   526: bipush #32
    //   528: irem
    //   529: invokestatic abs : (I)I
    //   532: invokevirtual charAt : (I)C
    //   535: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   538: pop
    //   539: iload_2
    //   540: ifne -> 1360
    //   543: goto -> 550
    //   546: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   549: athrow
    //   550: aload_3
    //   551: getstatic burp/Zlvx.Zr : Ljava/lang/String;
    //   554: getstatic burp/Zgx6.Zo : Ljava/lang/Object;
    //   557: checkcast java/math/BigInteger
    //   560: invokevirtual intValue : ()I
    //   563: bipush #32
    //   565: irem
    //   566: invokestatic abs : (I)I
    //   569: invokevirtual charAt : (I)C
    //   572: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   575: pop
    //   576: iload_2
    //   577: ifne -> 1360
    //   580: goto -> 587
    //   583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   586: athrow
    //   587: aload_3
    //   588: getstatic burp/Zrpm.ZG : Ljava/lang/String;
    //   591: getstatic burp/Zlbr.Zp : Ljava/lang/Object;
    //   594: checkcast java/math/BigInteger
    //   597: invokevirtual intValue : ()I
    //   600: bipush #32
    //   602: irem
    //   603: invokestatic abs : (I)I
    //   606: invokevirtual charAt : (I)C
    //   609: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   612: pop
    //   613: iload_2
    //   614: ifne -> 1360
    //   617: goto -> 624
    //   620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   623: athrow
    //   624: aload_3
    //   625: getstatic burp/Zlnq.ZQ : Ljava/lang/String;
    //   628: getstatic burp/Zlav.Zp : Ljava/lang/Object;
    //   631: checkcast java/math/BigInteger
    //   634: invokevirtual intValue : ()I
    //   637: bipush #32
    //   639: irem
    //   640: invokestatic abs : (I)I
    //   643: invokevirtual charAt : (I)C
    //   646: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   649: pop
    //   650: iload_2
    //   651: ifne -> 1360
    //   654: goto -> 661
    //   657: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   660: athrow
    //   661: aload_3
    //   662: getstatic burp/Zgdj.Zt : Ljava/lang/String;
    //   665: getstatic burp/Zl2t.ZS : Ljava/lang/Object;
    //   668: checkcast java/math/BigInteger
    //   671: invokevirtual intValue : ()I
    //   674: bipush #32
    //   676: irem
    //   677: invokestatic abs : (I)I
    //   680: invokevirtual charAt : (I)C
    //   683: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   686: pop
    //   687: iload_2
    //   688: ifne -> 1360
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   697: athrow
    //   698: aload_3
    //   699: getstatic burp/Zg3v.Zt : Ljava/lang/String;
    //   702: getstatic burp/Zxzp.Zh : Ljava/lang/Object;
    //   705: checkcast java/math/BigInteger
    //   708: invokevirtual intValue : ()I
    //   711: bipush #32
    //   713: irem
    //   714: invokestatic abs : (I)I
    //   717: invokevirtual charAt : (I)C
    //   720: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   723: pop
    //   724: iload_2
    //   725: ifne -> 1360
    //   728: goto -> 735
    //   731: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   734: athrow
    //   735: aload_3
    //   736: getstatic burp/Zod.ZS : Ljava/lang/String;
    //   739: getstatic burp/Zlos.Zk : Ljava/lang/Object;
    //   742: checkcast java/math/BigInteger
    //   745: invokevirtual intValue : ()I
    //   748: bipush #32
    //   750: irem
    //   751: invokestatic abs : (I)I
    //   754: invokevirtual charAt : (I)C
    //   757: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   760: pop
    //   761: iload_2
    //   762: ifne -> 1360
    //   765: goto -> 772
    //   768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   771: athrow
    //   772: aload_3
    //   773: getstatic burp/Zb0z.ZM : Ljava/lang/String;
    //   776: getstatic burp/Zllw.ZW : Ljava/lang/Object;
    //   779: checkcast java/math/BigInteger
    //   782: invokevirtual intValue : ()I
    //   785: bipush #32
    //   787: irem
    //   788: invokestatic abs : (I)I
    //   791: invokevirtual charAt : (I)C
    //   794: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   797: pop
    //   798: iload_2
    //   799: ifne -> 1360
    //   802: goto -> 809
    //   805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   808: athrow
    //   809: aload_3
    //   810: getstatic burp/Zry7.Z_ : Ljava/lang/String;
    //   813: getstatic burp/Zltz.Zg : Ljava/lang/Object;
    //   816: checkcast java/math/BigInteger
    //   819: invokevirtual intValue : ()I
    //   822: bipush #32
    //   824: irem
    //   825: invokestatic abs : (I)I
    //   828: invokevirtual charAt : (I)C
    //   831: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   834: pop
    //   835: iload_2
    //   836: ifne -> 1360
    //   839: goto -> 846
    //   842: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   845: athrow
    //   846: aload_3
    //   847: getstatic burp/Zkht.Zd : Ljava/lang/String;
    //   850: getstatic burp/Zr0u.ZB : Ljava/lang/Object;
    //   853: checkcast java/math/BigInteger
    //   856: invokevirtual intValue : ()I
    //   859: bipush #32
    //   861: irem
    //   862: invokestatic abs : (I)I
    //   865: invokevirtual charAt : (I)C
    //   868: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   871: pop
    //   872: iload_2
    //   873: ifne -> 1360
    //   876: goto -> 883
    //   879: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   882: athrow
    //   883: aload_3
    //   884: getstatic burp/Zr9b.ZC : Ljava/lang/String;
    //   887: getstatic burp/Zxof.Zi : Ljava/lang/Object;
    //   890: checkcast java/math/BigInteger
    //   893: invokevirtual intValue : ()I
    //   896: bipush #32
    //   898: irem
    //   899: invokestatic abs : (I)I
    //   902: invokevirtual charAt : (I)C
    //   905: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   908: pop
    //   909: iload_2
    //   910: ifne -> 1360
    //   913: goto -> 920
    //   916: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   919: athrow
    //   920: aload_3
    //   921: getstatic burp/Zxn5.ZI : Ljava/lang/String;
    //   924: getstatic burp/Zec0.Zg : Ljava/lang/Object;
    //   927: checkcast java/math/BigInteger
    //   930: invokevirtual intValue : ()I
    //   933: bipush #32
    //   935: irem
    //   936: invokestatic abs : (I)I
    //   939: invokevirtual charAt : (I)C
    //   942: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   945: pop
    //   946: iload_2
    //   947: ifne -> 1360
    //   950: goto -> 957
    //   953: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   956: athrow
    //   957: aload_3
    //   958: getstatic burp/Ze69.ZA : Ljava/lang/String;
    //   961: getstatic burp/Zedz.Za : Ljava/lang/Object;
    //   964: checkcast java/math/BigInteger
    //   967: invokevirtual intValue : ()I
    //   970: bipush #32
    //   972: irem
    //   973: invokestatic abs : (I)I
    //   976: invokevirtual charAt : (I)C
    //   979: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   982: pop
    //   983: iload_2
    //   984: ifne -> 1360
    //   987: goto -> 994
    //   990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   993: athrow
    //   994: aload_3
    //   995: getstatic burp/Zmtf.Zx : Ljava/lang/String;
    //   998: getstatic burp/Zxsb.ZN : Ljava/lang/Object;
    //   1001: checkcast java/math/BigInteger
    //   1004: invokevirtual intValue : ()I
    //   1007: bipush #32
    //   1009: irem
    //   1010: invokestatic abs : (I)I
    //   1013: invokevirtual charAt : (I)C
    //   1016: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1019: pop
    //   1020: iload_2
    //   1021: ifne -> 1360
    //   1024: goto -> 1031
    //   1027: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1030: athrow
    //   1031: aload_3
    //   1032: getstatic burp/Zmdm.Za : Ljava/lang/String;
    //   1035: getstatic burp/Zg68.Zs : Ljava/lang/Object;
    //   1038: checkcast java/math/BigInteger
    //   1041: invokevirtual intValue : ()I
    //   1044: bipush #32
    //   1046: irem
    //   1047: invokestatic abs : (I)I
    //   1050: invokevirtual charAt : (I)C
    //   1053: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1056: pop
    //   1057: iload_2
    //   1058: ifne -> 1360
    //   1061: goto -> 1068
    //   1064: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1067: athrow
    //   1068: aload_3
    //   1069: getstatic burp/Zsmn.Zo : Ljava/lang/String;
    //   1072: getstatic burp/Zmir.ZF : Ljava/lang/Object;
    //   1075: checkcast java/math/BigInteger
    //   1078: invokevirtual intValue : ()I
    //   1081: bipush #32
    //   1083: irem
    //   1084: invokestatic abs : (I)I
    //   1087: invokevirtual charAt : (I)C
    //   1090: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1093: pop
    //   1094: iload_2
    //   1095: ifne -> 1360
    //   1098: goto -> 1105
    //   1101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1104: athrow
    //   1105: aload_3
    //   1106: getstatic burp/Zr8h.Zk : Ljava/lang/String;
    //   1109: getstatic burp/Zkor.Ze : Ljava/lang/Object;
    //   1112: checkcast java/math/BigInteger
    //   1115: invokevirtual intValue : ()I
    //   1118: bipush #32
    //   1120: irem
    //   1121: invokestatic abs : (I)I
    //   1124: invokevirtual charAt : (I)C
    //   1127: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1130: pop
    //   1131: iload_2
    //   1132: ifne -> 1360
    //   1135: goto -> 1142
    //   1138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1141: athrow
    //   1142: aload_3
    //   1143: getstatic burp/Zx5w.Zq : Ljava/lang/String;
    //   1146: getstatic burp/Zlhy.ZN : Ljava/lang/Object;
    //   1149: checkcast java/math/BigInteger
    //   1152: invokevirtual intValue : ()I
    //   1155: bipush #32
    //   1157: irem
    //   1158: invokestatic abs : (I)I
    //   1161: invokevirtual charAt : (I)C
    //   1164: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1167: pop
    //   1168: iload_2
    //   1169: ifne -> 1360
    //   1172: goto -> 1179
    //   1175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1178: athrow
    //   1179: aload_3
    //   1180: getstatic burp/Zlfi.Zg : Ljava/lang/String;
    //   1183: getstatic burp/Zzym.ZK : Ljava/lang/Object;
    //   1186: checkcast java/math/BigInteger
    //   1189: invokevirtual intValue : ()I
    //   1192: bipush #32
    //   1194: irem
    //   1195: invokestatic abs : (I)I
    //   1198: invokevirtual charAt : (I)C
    //   1201: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1204: pop
    //   1205: iload_2
    //   1206: ifne -> 1360
    //   1209: goto -> 1216
    //   1212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1215: athrow
    //   1216: aload_3
    //   1217: getstatic burp/Zk7f.ZA : Ljava/lang/String;
    //   1220: getstatic burp/Zm81.Zy : Ljava/lang/Object;
    //   1223: checkcast java/math/BigInteger
    //   1226: invokevirtual intValue : ()I
    //   1229: bipush #32
    //   1231: irem
    //   1232: invokestatic abs : (I)I
    //   1235: invokevirtual charAt : (I)C
    //   1238: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1241: pop
    //   1242: iload_2
    //   1243: ifne -> 1360
    //   1246: goto -> 1253
    //   1249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1252: athrow
    //   1253: aload_3
    //   1254: getstatic burp/Zel.Zi : Ljava/lang/String;
    //   1257: getstatic burp/Zl5.ZY : Ljava/lang/Object;
    //   1260: checkcast java/math/BigInteger
    //   1263: invokevirtual intValue : ()I
    //   1266: bipush #32
    //   1268: irem
    //   1269: invokestatic abs : (I)I
    //   1272: invokevirtual charAt : (I)C
    //   1275: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1278: pop
    //   1279: iload_2
    //   1280: ifne -> 1360
    //   1283: goto -> 1290
    //   1286: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1289: athrow
    //   1290: aload_3
    //   1291: getstatic burp/Zg8.ZE : Ljava/lang/String;
    //   1294: getstatic burp/Zmtr.Zv : Ljava/lang/Object;
    //   1297: checkcast java/math/BigInteger
    //   1300: invokevirtual intValue : ()I
    //   1303: bipush #32
    //   1305: irem
    //   1306: invokestatic abs : (I)I
    //   1309: invokevirtual charAt : (I)C
    //   1312: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1315: pop
    //   1316: iload_2
    //   1317: ifne -> 1360
    //   1320: goto -> 1327
    //   1323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1326: athrow
    //   1327: aload_3
    //   1328: getstatic burp/Zg2u.Zy : Ljava/lang/String;
    //   1331: getstatic burp/Zl8i.ZY : Ljava/lang/Object;
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
    //   1364: ifne -> 30
    //   1367: aload_3
    //   1368: invokevirtual toString : ()Ljava/lang/String;
    //   1371: putstatic burp/Zxn9.ZU : Ljava/lang/String;
    //   1374: new java/lang/StringBuilder
    //   1377: dup
    //   1378: invokespecial <init> : ()V
    //   1381: astore #4
    //   1383: iconst_0
    //   1384: istore #5
    //   1386: iload #5
    //   1388: bipush #32
    //   1390: if_icmpge -> 2755
    //   1393: iload #5
    //   1395: tableswitch default -> 2748, 0 -> 1536, 1 -> 1574, 2 -> 1612, 3 -> 1650, 4 -> 1688, 5 -> 1726, 6 -> 1764, 7 -> 1802, 8 -> 1840, 9 -> 1878, 10 -> 1916, 11 -> 1954, 12 -> 1992, 13 -> 2030, 14 -> 2068, 15 -> 2106, 16 -> 2144, 17 -> 2182, 18 -> 2220, 19 -> 2258, 20 -> 2296, 21 -> 2334, 22 -> 2372, 23 -> 2410, 24 -> 2448, 25 -> 2486, 26 -> 2524, 27 -> 2562, 28 -> 2600, 29 -> 2638, 30 -> 2676, 31 -> 2714
    //   1536: aload #4
    //   1538: getstatic burp/Zrpm.ZG : Ljava/lang/String;
    //   1541: getstatic burp/Zsfj.ZL : Ljava/lang/Object;
    //   1544: checkcast java/math/BigInteger
    //   1547: invokevirtual intValue : ()I
    //   1550: bipush #32
    //   1552: irem
    //   1553: invokestatic abs : (I)I
    //   1556: invokevirtual charAt : (I)C
    //   1559: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1562: pop
    //   1563: iload_2
    //   1564: ifne -> 2748
    //   1567: goto -> 1574
    //   1570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1573: athrow
    //   1574: aload #4
    //   1576: getstatic burp/Zl2q.ZI : Ljava/lang/String;
    //   1579: getstatic burp/Zs75.Zo : Ljava/lang/Object;
    //   1582: checkcast java/math/BigInteger
    //   1585: invokevirtual intValue : ()I
    //   1588: bipush #32
    //   1590: irem
    //   1591: invokestatic abs : (I)I
    //   1594: invokevirtual charAt : (I)C
    //   1597: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1600: pop
    //   1601: iload_2
    //   1602: ifne -> 2748
    //   1605: goto -> 1612
    //   1608: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1611: athrow
    //   1612: aload #4
    //   1614: getstatic burp/Zefm.ZK : Ljava/lang/String;
    //   1617: getstatic burp/Zx0t.Zt : Ljava/lang/Object;
    //   1620: checkcast java/math/BigInteger
    //   1623: invokevirtual intValue : ()I
    //   1626: bipush #32
    //   1628: irem
    //   1629: invokestatic abs : (I)I
    //   1632: invokevirtual charAt : (I)C
    //   1635: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1638: pop
    //   1639: iload_2
    //   1640: ifne -> 2748
    //   1643: goto -> 1650
    //   1646: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1649: athrow
    //   1650: aload #4
    //   1652: getstatic burp/Zg7w.ZI : Ljava/lang/String;
    //   1655: getstatic burp/Zko9.ZC : Ljava/lang/Object;
    //   1658: checkcast java/math/BigInteger
    //   1661: invokevirtual intValue : ()I
    //   1664: bipush #32
    //   1666: irem
    //   1667: invokestatic abs : (I)I
    //   1670: invokevirtual charAt : (I)C
    //   1673: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1676: pop
    //   1677: iload_2
    //   1678: ifne -> 2748
    //   1681: goto -> 1688
    //   1684: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1687: athrow
    //   1688: aload #4
    //   1690: getstatic burp/Zm5p.ZX : Ljava/lang/String;
    //   1693: getstatic burp/Zrod.ZX : Ljava/lang/Object;
    //   1696: checkcast java/math/BigInteger
    //   1699: invokevirtual intValue : ()I
    //   1702: bipush #32
    //   1704: irem
    //   1705: invokestatic abs : (I)I
    //   1708: invokevirtual charAt : (I)C
    //   1711: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1714: pop
    //   1715: iload_2
    //   1716: ifne -> 2748
    //   1719: goto -> 1726
    //   1722: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1725: athrow
    //   1726: aload #4
    //   1728: getstatic burp/Zs8s.Za : Ljava/lang/String;
    //   1731: getstatic burp/Zzpj.ZI : Ljava/lang/Object;
    //   1734: checkcast java/math/BigInteger
    //   1737: invokevirtual intValue : ()I
    //   1740: bipush #32
    //   1742: irem
    //   1743: invokestatic abs : (I)I
    //   1746: invokevirtual charAt : (I)C
    //   1749: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1752: pop
    //   1753: iload_2
    //   1754: ifne -> 2748
    //   1757: goto -> 1764
    //   1760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1763: athrow
    //   1764: aload #4
    //   1766: getstatic burp/Zgwq.ZV : Ljava/lang/String;
    //   1769: getstatic burp/Zb3p.Zx : Ljava/lang/Object;
    //   1772: checkcast java/math/BigInteger
    //   1775: invokevirtual intValue : ()I
    //   1778: bipush #32
    //   1780: irem
    //   1781: invokestatic abs : (I)I
    //   1784: invokevirtual charAt : (I)C
    //   1787: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1790: pop
    //   1791: iload_2
    //   1792: ifne -> 2748
    //   1795: goto -> 1802
    //   1798: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1801: athrow
    //   1802: aload #4
    //   1804: getstatic burp/Ztq8.ZI : Ljava/lang/String;
    //   1807: getstatic burp/Ze54.Zx : Ljava/lang/Object;
    //   1810: checkcast java/math/BigInteger
    //   1813: invokevirtual intValue : ()I
    //   1816: bipush #32
    //   1818: irem
    //   1819: invokestatic abs : (I)I
    //   1822: invokevirtual charAt : (I)C
    //   1825: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1828: pop
    //   1829: iload_2
    //   1830: ifne -> 2748
    //   1833: goto -> 1840
    //   1836: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1839: athrow
    //   1840: aload #4
    //   1842: getstatic burp/Zgwh.Zq : Ljava/lang/String;
    //   1845: getstatic burp/Zex5.Zb : Ljava/lang/Object;
    //   1848: checkcast java/math/BigInteger
    //   1851: invokevirtual intValue : ()I
    //   1854: bipush #32
    //   1856: irem
    //   1857: invokestatic abs : (I)I
    //   1860: invokevirtual charAt : (I)C
    //   1863: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1866: pop
    //   1867: iload_2
    //   1868: ifne -> 2748
    //   1871: goto -> 1878
    //   1874: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1877: athrow
    //   1878: aload #4
    //   1880: getstatic burp/Zevc.ZF : Ljava/lang/String;
    //   1883: getstatic burp/Zrvb.ZD : Ljava/lang/Object;
    //   1886: checkcast java/math/BigInteger
    //   1889: invokevirtual intValue : ()I
    //   1892: bipush #32
    //   1894: irem
    //   1895: invokestatic abs : (I)I
    //   1898: invokevirtual charAt : (I)C
    //   1901: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1904: pop
    //   1905: iload_2
    //   1906: ifne -> 2748
    //   1909: goto -> 1916
    //   1912: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1915: athrow
    //   1916: aload #4
    //   1918: getstatic burp/Zzoi.ZR : Ljava/lang/String;
    //   1921: getstatic burp/Zk7f.Za : Ljava/lang/Object;
    //   1924: checkcast java/math/BigInteger
    //   1927: invokevirtual intValue : ()I
    //   1930: bipush #32
    //   1932: irem
    //   1933: invokestatic abs : (I)I
    //   1936: invokevirtual charAt : (I)C
    //   1939: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1942: pop
    //   1943: iload_2
    //   1944: ifne -> 2748
    //   1947: goto -> 1954
    //   1950: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1953: athrow
    //   1954: aload #4
    //   1956: getstatic burp/Zr1t.Ze : Ljava/lang/String;
    //   1959: getstatic burp/Zst7.ZI : Ljava/lang/Object;
    //   1962: checkcast java/math/BigInteger
    //   1965: invokevirtual intValue : ()I
    //   1968: bipush #32
    //   1970: irem
    //   1971: invokestatic abs : (I)I
    //   1974: invokevirtual charAt : (I)C
    //   1977: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1980: pop
    //   1981: iload_2
    //   1982: ifne -> 2748
    //   1985: goto -> 1992
    //   1988: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1991: athrow
    //   1992: aload #4
    //   1994: getstatic burp/Zec_.Zv : Ljava/lang/String;
    //   1997: getstatic burp/Zeb3.Zb : Ljava/lang/Object;
    //   2000: checkcast java/math/BigInteger
    //   2003: invokevirtual intValue : ()I
    //   2006: bipush #32
    //   2008: irem
    //   2009: invokestatic abs : (I)I
    //   2012: invokevirtual charAt : (I)C
    //   2015: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2018: pop
    //   2019: iload_2
    //   2020: ifne -> 2748
    //   2023: goto -> 2030
    //   2026: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2029: athrow
    //   2030: aload #4
    //   2032: getstatic burp/Zgdt.Zd : Ljava/lang/String;
    //   2035: getstatic burp/Zb3r.ZI : Ljava/lang/Object;
    //   2038: checkcast java/math/BigInteger
    //   2041: invokevirtual intValue : ()I
    //   2044: bipush #32
    //   2046: irem
    //   2047: invokestatic abs : (I)I
    //   2050: invokevirtual charAt : (I)C
    //   2053: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2056: pop
    //   2057: iload_2
    //   2058: ifne -> 2748
    //   2061: goto -> 2068
    //   2064: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2067: athrow
    //   2068: aload #4
    //   2070: getstatic burp/Zbxp.ZS : Ljava/lang/String;
    //   2073: getstatic burp/Zgmo.Zo : Ljava/lang/Object;
    //   2076: checkcast java/math/BigInteger
    //   2079: invokevirtual intValue : ()I
    //   2082: bipush #32
    //   2084: irem
    //   2085: invokestatic abs : (I)I
    //   2088: invokevirtual charAt : (I)C
    //   2091: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2094: pop
    //   2095: iload_2
    //   2096: ifne -> 2748
    //   2099: goto -> 2106
    //   2102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2105: athrow
    //   2106: aload #4
    //   2108: getstatic burp/Zbp.Z_ : Ljava/lang/String;
    //   2111: getstatic burp/Zmiy.Zi : Ljava/lang/Object;
    //   2114: checkcast java/math/BigInteger
    //   2117: invokevirtual intValue : ()I
    //   2120: bipush #32
    //   2122: irem
    //   2123: invokestatic abs : (I)I
    //   2126: invokevirtual charAt : (I)C
    //   2129: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2132: pop
    //   2133: iload_2
    //   2134: ifne -> 2748
    //   2137: goto -> 2144
    //   2140: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2143: athrow
    //   2144: aload #4
    //   2146: getstatic burp/Zmh0.Zs : Ljava/lang/String;
    //   2149: getstatic burp/Zxzd.ZD : Ljava/lang/Object;
    //   2152: checkcast java/math/BigInteger
    //   2155: invokevirtual intValue : ()I
    //   2158: bipush #32
    //   2160: irem
    //   2161: invokestatic abs : (I)I
    //   2164: invokevirtual charAt : (I)C
    //   2167: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2170: pop
    //   2171: iload_2
    //   2172: ifne -> 2748
    //   2175: goto -> 2182
    //   2178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2181: athrow
    //   2182: aload #4
    //   2184: getstatic burp/Zltz.Za : Ljava/lang/String;
    //   2187: getstatic burp/Zscf.ZG : Ljava/lang/Object;
    //   2190: checkcast java/math/BigInteger
    //   2193: invokevirtual intValue : ()I
    //   2196: bipush #32
    //   2198: irem
    //   2199: invokestatic abs : (I)I
    //   2202: invokevirtual charAt : (I)C
    //   2205: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2208: pop
    //   2209: iload_2
    //   2210: ifne -> 2748
    //   2213: goto -> 2220
    //   2216: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2219: athrow
    //   2220: aload #4
    //   2222: getstatic burp/Zl50.Zm : Ljava/lang/String;
    //   2225: getstatic burp/Zrpm.ZR : Ljava/lang/Object;
    //   2228: checkcast java/math/BigInteger
    //   2231: invokevirtual intValue : ()I
    //   2234: bipush #32
    //   2236: irem
    //   2237: invokestatic abs : (I)I
    //   2240: invokevirtual charAt : (I)C
    //   2243: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2246: pop
    //   2247: iload_2
    //   2248: ifne -> 2748
    //   2251: goto -> 2258
    //   2254: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2257: athrow
    //   2258: aload #4
    //   2260: getstatic burp/Zl1n.ZZ : Ljava/lang/String;
    //   2263: getstatic burp/Zzxa.ZI : Ljava/lang/Object;
    //   2266: checkcast java/math/BigInteger
    //   2269: invokevirtual intValue : ()I
    //   2272: bipush #32
    //   2274: irem
    //   2275: invokestatic abs : (I)I
    //   2278: invokevirtual charAt : (I)C
    //   2281: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2284: pop
    //   2285: iload_2
    //   2286: ifne -> 2748
    //   2289: goto -> 2296
    //   2292: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2295: athrow
    //   2296: aload #4
    //   2298: getstatic burp/Zrod.ZQ : Ljava/lang/String;
    //   2301: getstatic burp/Zdk.Zy : Ljava/lang/Object;
    //   2304: checkcast java/math/BigInteger
    //   2307: invokevirtual intValue : ()I
    //   2310: bipush #32
    //   2312: irem
    //   2313: invokestatic abs : (I)I
    //   2316: invokevirtual charAt : (I)C
    //   2319: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2322: pop
    //   2323: iload_2
    //   2324: ifne -> 2748
    //   2327: goto -> 2334
    //   2330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2333: athrow
    //   2334: aload #4
    //   2336: getstatic burp/Ztuj.Zk : Ljava/lang/String;
    //   2339: getstatic burp/Zrug.Zp : Ljava/lang/Object;
    //   2342: checkcast java/math/BigInteger
    //   2345: invokevirtual intValue : ()I
    //   2348: bipush #32
    //   2350: irem
    //   2351: invokestatic abs : (I)I
    //   2354: invokevirtual charAt : (I)C
    //   2357: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2360: pop
    //   2361: iload_2
    //   2362: ifne -> 2748
    //   2365: goto -> 2372
    //   2368: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2371: athrow
    //   2372: aload #4
    //   2374: getstatic burp/Zrka.Zy : Ljava/lang/String;
    //   2377: getstatic burp/Zgpx.ZQ : Ljava/lang/Object;
    //   2380: checkcast java/math/BigInteger
    //   2383: invokevirtual intValue : ()I
    //   2386: bipush #32
    //   2388: irem
    //   2389: invokestatic abs : (I)I
    //   2392: invokevirtual charAt : (I)C
    //   2395: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2398: pop
    //   2399: iload_2
    //   2400: ifne -> 2748
    //   2403: goto -> 2410
    //   2406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2409: athrow
    //   2410: aload #4
    //   2412: getstatic burp/Zrx5.ZD : Ljava/lang/String;
    //   2415: getstatic burp/Zlhm.ZT : Ljava/lang/Object;
    //   2418: checkcast java/math/BigInteger
    //   2421: invokevirtual intValue : ()I
    //   2424: bipush #32
    //   2426: irem
    //   2427: invokestatic abs : (I)I
    //   2430: invokevirtual charAt : (I)C
    //   2433: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2436: pop
    //   2437: iload_2
    //   2438: ifne -> 2748
    //   2441: goto -> 2448
    //   2444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2447: athrow
    //   2448: aload #4
    //   2450: getstatic burp/Ze08.Zh : Ljava/lang/String;
    //   2453: getstatic burp/Zzk9.ZK : Ljava/lang/Object;
    //   2456: checkcast java/math/BigInteger
    //   2459: invokevirtual intValue : ()I
    //   2462: bipush #32
    //   2464: irem
    //   2465: invokestatic abs : (I)I
    //   2468: invokevirtual charAt : (I)C
    //   2471: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2474: pop
    //   2475: iload_2
    //   2476: ifne -> 2748
    //   2479: goto -> 2486
    //   2482: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2485: athrow
    //   2486: aload #4
    //   2488: getstatic burp/Zszz.Zg : Ljava/lang/String;
    //   2491: getstatic burp/Zxxd.Zn : Ljava/lang/Object;
    //   2494: checkcast java/math/BigInteger
    //   2497: invokevirtual intValue : ()I
    //   2500: bipush #32
    //   2502: irem
    //   2503: invokestatic abs : (I)I
    //   2506: invokevirtual charAt : (I)C
    //   2509: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2512: pop
    //   2513: iload_2
    //   2514: ifne -> 2748
    //   2517: goto -> 2524
    //   2520: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2523: athrow
    //   2524: aload #4
    //   2526: getstatic burp/Zb29.Zf : Ljava/lang/String;
    //   2529: getstatic burp/Zeqr.ZM : Ljava/lang/Object;
    //   2532: checkcast java/math/BigInteger
    //   2535: invokevirtual intValue : ()I
    //   2538: bipush #32
    //   2540: irem
    //   2541: invokestatic abs : (I)I
    //   2544: invokevirtual charAt : (I)C
    //   2547: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2550: pop
    //   2551: iload_2
    //   2552: ifne -> 2748
    //   2555: goto -> 2562
    //   2558: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2561: athrow
    //   2562: aload #4
    //   2564: getstatic burp/Zkvq.Zg : Ljava/lang/String;
    //   2567: getstatic burp/Zmrc.ZU : Ljava/lang/Object;
    //   2570: checkcast java/math/BigInteger
    //   2573: invokevirtual intValue : ()I
    //   2576: bipush #32
    //   2578: irem
    //   2579: invokestatic abs : (I)I
    //   2582: invokevirtual charAt : (I)C
    //   2585: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2588: pop
    //   2589: iload_2
    //   2590: ifne -> 2748
    //   2593: goto -> 2600
    //   2596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2599: athrow
    //   2600: aload #4
    //   2602: getstatic burp/Zls_.Zn : Ljava/lang/String;
    //   2605: getstatic burp/Zk9s.ZY : Ljava/lang/Object;
    //   2608: checkcast java/math/BigInteger
    //   2611: invokevirtual intValue : ()I
    //   2614: bipush #32
    //   2616: irem
    //   2617: invokestatic abs : (I)I
    //   2620: invokevirtual charAt : (I)C
    //   2623: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2626: pop
    //   2627: iload_2
    //   2628: ifne -> 2748
    //   2631: goto -> 2638
    //   2634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2637: athrow
    //   2638: aload #4
    //   2640: getstatic burp/Zmwx.ZB : Ljava/lang/String;
    //   2643: getstatic burp/Ztap.ZK : Ljava/lang/Object;
    //   2646: checkcast java/math/BigInteger
    //   2649: invokevirtual intValue : ()I
    //   2652: bipush #32
    //   2654: irem
    //   2655: invokestatic abs : (I)I
    //   2658: invokevirtual charAt : (I)C
    //   2661: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2664: pop
    //   2665: iload_2
    //   2666: ifne -> 2748
    //   2669: goto -> 2676
    //   2672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2675: athrow
    //   2676: aload #4
    //   2678: getstatic burp/Zmt6.Zx : Ljava/lang/String;
    //   2681: getstatic burp/Zgcg.Zi : Ljava/lang/Object;
    //   2684: checkcast java/math/BigInteger
    //   2687: invokevirtual intValue : ()I
    //   2690: bipush #32
    //   2692: irem
    //   2693: invokestatic abs : (I)I
    //   2696: invokevirtual charAt : (I)C
    //   2699: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2702: pop
    //   2703: iload_2
    //   2704: ifne -> 2748
    //   2707: goto -> 2714
    //   2710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2713: athrow
    //   2714: aload #4
    //   2716: getstatic burp/Zeoi.Zh : Ljava/lang/String;
    //   2719: getstatic burp/Zty2.Zl : Ljava/lang/Object;
    //   2722: checkcast java/math/BigInteger
    //   2725: invokevirtual intValue : ()I
    //   2728: bipush #32
    //   2730: irem
    //   2731: invokestatic abs : (I)I
    //   2734: invokevirtual charAt : (I)C
    //   2737: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2740: pop
    //   2741: goto -> 2748
    //   2744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2747: athrow
    //   2748: iinc #5, 1
    //   2751: iload_2
    //   2752: ifne -> 1386
    //   2755: aload #4
    //   2757: invokevirtual toString : ()Ljava/lang/String;
    //   2760: putstatic burp/Zsf3.Zb : Ljava/lang/String;
    //   2763: sipush #28507
    //   2766: getstatic burp/Zmt6.ZK : Ljava/lang/Object;
    //   2769: checkcast java/math/BigInteger
    //   2772: getstatic burp/Zm06.ZU : Ljava/lang/Object;
    //   2775: checkcast java/math/BigInteger
    //   2778: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   2781: putstatic burp/Zxoa.Zr : Ljava/lang/Object;
    //   2784: sipush #19197
    //   2787: invokestatic a : (II)Ljava/lang/String;
    //   2790: iconst_1
    //   2791: ldc burp/Zdm
    //   2793: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2796: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2799: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2802: astore #5
    //   2804: aload #5
    //   2806: arraylength
    //   2807: istore #6
    //   2809: iconst_0
    //   2810: istore #7
    //   2812: iload #7
    //   2814: iload #6
    //   2816: if_icmpge -> 2954
    //   2819: aload #5
    //   2821: iload #7
    //   2823: aaload
    //   2824: astore #8
    //   2826: aload #8
    //   2828: invokevirtual getModifiers : ()I
    //   2831: invokestatic isStatic : (I)Z
    //   2834: ifne -> 2844
    //   2837: goto -> 2947
    //   2840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2843: athrow
    //   2844: aload #8
    //   2846: invokevirtual getType : ()Ljava/lang/Class;
    //   2849: astore #9
    //   2851: aload #9
    //   2853: ifnull -> 2934
    //   2856: aload #9
    //   2858: invokevirtual isPrimitive : ()Z
    //   2861: ifne -> 2934
    //   2864: goto -> 2871
    //   2867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2870: athrow
    //   2871: aload #9
    //   2873: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2876: ifnull -> 2934
    //   2879: goto -> 2886
    //   2882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2885: athrow
    //   2886: aload #9
    //   2888: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2891: invokevirtual getName : ()Ljava/lang/String;
    //   2894: ifnull -> 2934
    //   2897: goto -> 2904
    //   2900: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2903: athrow
    //   2904: aload #9
    //   2906: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2909: invokevirtual getName : ()Ljava/lang/String;
    //   2912: sipush #28497
    //   2915: sipush #3368
    //   2918: invokestatic a : (II)Ljava/lang/String;
    //   2921: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2924: ifne -> 2934
    //   2927: goto -> 2934
    //   2930: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2933: athrow
    //   2934: aload #8
    //   2936: iconst_1
    //   2937: invokevirtual setAccessible : (Z)V
    //   2940: aload #8
    //   2942: aconst_null
    //   2943: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2946: pop
    //   2947: iinc #7, 1
    //   2950: iload_2
    //   2951: ifne -> 2812
    //   2954: sipush #28501
    //   2957: sipush #3026
    //   2960: invokestatic a : (II)Ljava/lang/String;
    //   2963: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2966: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2969: astore #5
    //   2971: aload #5
    //   2973: arraylength
    //   2974: istore #6
    //   2976: iconst_0
    //   2977: istore #7
    //   2979: iload #7
    //   2981: iload #6
    //   2983: if_icmpge -> 3095
    //   2986: aload #5
    //   2988: iload #7
    //   2990: aaload
    //   2991: astore #8
    //   2993: aload #8
    //   2995: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2998: pop
    //   2999: aload #8
    //   3001: invokevirtual getModifiers : ()I
    //   3004: invokestatic isStatic : (I)Z
    //   3007: ifeq -> 3081
    //   3010: aload #8
    //   3012: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3015: arraylength
    //   3016: iconst_2
    //   3017: if_icmpne -> 3081
    //   3020: goto -> 3027
    //   3023: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3026: athrow
    //   3027: aload #8
    //   3029: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3032: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3035: if_acmpne -> 3081
    //   3038: goto -> 3045
    //   3041: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3044: athrow
    //   3045: aload #8
    //   3047: iconst_1
    //   3048: invokevirtual setAccessible : (Z)V
    //   3051: aload #8
    //   3053: aconst_null
    //   3054: iconst_2
    //   3055: anewarray java/lang/Object
    //   3058: dup
    //   3059: iconst_0
    //   3060: aload_0
    //   3061: aastore
    //   3062: dup
    //   3063: iconst_1
    //   3064: aload_1
    //   3065: aastore
    //   3066: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3069: pop
    //   3070: iload_2
    //   3071: ifne -> 3095
    //   3074: goto -> 3081
    //   3077: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3080: athrow
    //   3081: iinc #7, 1
    //   3084: iload_2
    //   3085: ifne -> 2979
    //   3088: goto -> 3095
    //   3091: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3094: athrow
    //   3095: sipush #28498
    //   3098: sipush #-20722
    //   3101: invokestatic a : (II)Ljava/lang/String;
    //   3104: iconst_1
    //   3105: ldc burp/Zr4z
    //   3107: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3110: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3113: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3116: astore #5
    //   3118: aload #5
    //   3120: arraylength
    //   3121: istore #6
    //   3123: iconst_0
    //   3124: istore #7
    //   3126: iload #7
    //   3128: iload #6
    //   3130: if_icmpge -> 3268
    //   3133: aload #5
    //   3135: iload #7
    //   3137: aaload
    //   3138: astore #8
    //   3140: aload #8
    //   3142: invokevirtual getModifiers : ()I
    //   3145: invokestatic isStatic : (I)Z
    //   3148: ifne -> 3158
    //   3151: goto -> 3261
    //   3154: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3157: athrow
    //   3158: aload #8
    //   3160: invokevirtual getType : ()Ljava/lang/Class;
    //   3163: astore #9
    //   3165: aload #9
    //   3167: ifnull -> 3248
    //   3170: aload #9
    //   3172: invokevirtual isPrimitive : ()Z
    //   3175: ifne -> 3248
    //   3178: goto -> 3185
    //   3181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3184: athrow
    //   3185: aload #9
    //   3187: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3190: ifnull -> 3248
    //   3193: goto -> 3200
    //   3196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3199: athrow
    //   3200: aload #9
    //   3202: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3205: invokevirtual getName : ()Ljava/lang/String;
    //   3208: ifnull -> 3248
    //   3211: goto -> 3218
    //   3214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3217: athrow
    //   3218: aload #9
    //   3220: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3223: invokevirtual getName : ()Ljava/lang/String;
    //   3226: sipush #28510
    //   3229: sipush #-20900
    //   3232: invokestatic a : (II)Ljava/lang/String;
    //   3235: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3238: ifne -> 3248
    //   3241: goto -> 3248
    //   3244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3247: athrow
    //   3248: aload #8
    //   3250: iconst_1
    //   3251: invokevirtual setAccessible : (Z)V
    //   3254: aload #8
    //   3256: aconst_null
    //   3257: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3260: pop
    //   3261: iinc #7, 1
    //   3264: iload_2
    //   3265: ifne -> 3126
    //   3268: sipush #28499
    //   3271: sipush #6926
    //   3274: invokestatic a : (II)Ljava/lang/String;
    //   3277: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3280: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3283: astore #5
    //   3285: aload #5
    //   3287: arraylength
    //   3288: istore #6
    //   3290: iconst_0
    //   3291: istore #7
    //   3293: iload #7
    //   3295: iload #6
    //   3297: if_icmpge -> 3430
    //   3300: aload #5
    //   3302: iload #7
    //   3304: aaload
    //   3305: astore #8
    //   3307: aload #8
    //   3309: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3312: pop
    //   3313: aload #8
    //   3315: invokevirtual getModifiers : ()I
    //   3318: invokestatic isStatic : (I)Z
    //   3321: ifeq -> 3416
    //   3324: aload #8
    //   3326: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3329: arraylength
    //   3330: iconst_2
    //   3331: if_icmpne -> 3416
    //   3334: goto -> 3341
    //   3337: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3340: athrow
    //   3341: aload #8
    //   3343: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3346: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   3349: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3352: ifeq -> 3416
    //   3355: goto -> 3362
    //   3358: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3361: athrow
    //   3362: aload #8
    //   3364: iconst_1
    //   3365: invokevirtual setAccessible : (Z)V
    //   3368: aload #8
    //   3370: aconst_null
    //   3371: iconst_2
    //   3372: anewarray java/lang/Object
    //   3375: dup
    //   3376: iconst_0
    //   3377: aload_0
    //   3378: aastore
    //   3379: dup
    //   3380: iconst_1
    //   3381: aload_1
    //   3382: ifnonnull -> 3400
    //   3385: goto -> 3392
    //   3388: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3391: athrow
    //   3392: aload_1
    //   3393: goto -> 3407
    //   3396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3399: athrow
    //   3400: aload_1
    //   3401: checkcast [B
    //   3404: invokevirtual clone : ()Ljava/lang/Object;
    //   3407: aastore
    //   3408: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3411: pop
    //   3412: iload_2
    //   3413: ifne -> 3430
    //   3416: iinc #7, 1
    //   3419: iload_2
    //   3420: ifne -> 3293
    //   3423: goto -> 3430
    //   3426: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3429: athrow
    //   3430: iconst_0
    //   3431: istore #5
    //   3433: sipush #28505
    //   3436: sipush #-18248
    //   3439: invokestatic a : (II)Ljava/lang/String;
    //   3442: iconst_1
    //   3443: ldc burp/Zzh0
    //   3445: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3448: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3451: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3454: astore #6
    //   3456: aload #6
    //   3458: arraylength
    //   3459: istore #7
    //   3461: iconst_0
    //   3462: istore #8
    //   3464: iload #8
    //   3466: iload #7
    //   3468: if_icmpge -> 3606
    //   3471: aload #6
    //   3473: iload #8
    //   3475: aaload
    //   3476: astore #9
    //   3478: aload #9
    //   3480: invokevirtual getModifiers : ()I
    //   3483: invokestatic isStatic : (I)Z
    //   3486: ifne -> 3496
    //   3489: goto -> 3599
    //   3492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3495: athrow
    //   3496: aload #9
    //   3498: invokevirtual getType : ()Ljava/lang/Class;
    //   3501: astore #10
    //   3503: aload #10
    //   3505: ifnull -> 3586
    //   3508: aload #10
    //   3510: invokevirtual isPrimitive : ()Z
    //   3513: ifne -> 3586
    //   3516: goto -> 3523
    //   3519: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3522: athrow
    //   3523: aload #10
    //   3525: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3528: ifnull -> 3586
    //   3531: goto -> 3538
    //   3534: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3537: athrow
    //   3538: aload #10
    //   3540: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3543: invokevirtual getName : ()Ljava/lang/String;
    //   3546: ifnull -> 3586
    //   3549: goto -> 3556
    //   3552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3555: athrow
    //   3556: aload #10
    //   3558: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3561: invokevirtual getName : ()Ljava/lang/String;
    //   3564: sipush #28510
    //   3567: sipush #-20900
    //   3570: invokestatic a : (II)Ljava/lang/String;
    //   3573: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3576: ifne -> 3586
    //   3579: goto -> 3586
    //   3582: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3585: athrow
    //   3586: aload #9
    //   3588: iconst_1
    //   3589: invokevirtual setAccessible : (Z)V
    //   3592: aload #9
    //   3594: aconst_null
    //   3595: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3598: pop
    //   3599: iinc #8, 1
    //   3602: iload_2
    //   3603: ifne -> 3464
    //   3606: sipush #28500
    //   3609: sipush #-13776
    //   3612: invokestatic a : (II)Ljava/lang/String;
    //   3615: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3618: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3621: astore #6
    //   3623: aload #6
    //   3625: arraylength
    //   3626: istore #7
    //   3628: iconst_0
    //   3629: istore #8
    //   3631: iload #8
    //   3633: iload #7
    //   3635: if_icmpge -> 3772
    //   3638: aload #6
    //   3640: iload #8
    //   3642: aaload
    //   3643: astore #9
    //   3645: aload #9
    //   3647: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3650: pop
    //   3651: aload #9
    //   3653: invokevirtual getModifiers : ()I
    //   3656: invokestatic isStatic : (I)Z
    //   3659: ifeq -> 3758
    //   3662: aload #9
    //   3664: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3667: arraylength
    //   3668: iconst_2
    //   3669: if_icmpne -> 3758
    //   3672: goto -> 3679
    //   3675: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3678: athrow
    //   3679: aload #9
    //   3681: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3684: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3687: if_acmpne -> 3758
    //   3690: goto -> 3697
    //   3693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3696: athrow
    //   3697: aload #9
    //   3699: iconst_1
    //   3700: invokevirtual setAccessible : (Z)V
    //   3703: aload #9
    //   3705: aconst_null
    //   3706: iconst_2
    //   3707: anewarray java/lang/Object
    //   3710: dup
    //   3711: iconst_0
    //   3712: aload_0
    //   3713: aastore
    //   3714: dup
    //   3715: iconst_1
    //   3716: aload_1
    //   3717: ifnonnull -> 3735
    //   3720: goto -> 3727
    //   3723: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3726: athrow
    //   3727: aload_1
    //   3728: goto -> 3742
    //   3731: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3734: athrow
    //   3735: aload_1
    //   3736: checkcast [B
    //   3739: invokevirtual clone : ()Ljava/lang/Object;
    //   3742: aastore
    //   3743: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3746: checkcast java/lang/Boolean
    //   3749: invokevirtual booleanValue : ()Z
    //   3752: istore #5
    //   3754: iload_2
    //   3755: ifne -> 3772
    //   3758: iinc #8, 1
    //   3761: iload_2
    //   3762: ifne -> 3631
    //   3765: goto -> 3772
    //   3768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3771: athrow
    //   3772: iload #5
    //   3774: ireturn
    //   3775: astore_3
    //   3776: new java/lang/Exception
    //   3779: dup
    //   3780: aload_3
    //   3781: invokevirtual getMessage : ()Ljava/lang/String;
    //   3784: invokespecial <init> : (Ljava/lang/String;)V
    //   3787: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3774	3775	java/lang/Throwable
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
    //   1393	1567	1570	java/lang/Throwable
    //   1536	1605	1608	java/lang/Throwable
    //   1574	1643	1646	java/lang/Throwable
    //   1612	1681	1684	java/lang/Throwable
    //   1650	1719	1722	java/lang/Throwable
    //   1688	1757	1760	java/lang/Throwable
    //   1726	1795	1798	java/lang/Throwable
    //   1764	1833	1836	java/lang/Throwable
    //   1802	1871	1874	java/lang/Throwable
    //   1840	1909	1912	java/lang/Throwable
    //   1878	1947	1950	java/lang/Throwable
    //   1916	1985	1988	java/lang/Throwable
    //   1954	2023	2026	java/lang/Throwable
    //   1992	2061	2064	java/lang/Throwable
    //   2030	2099	2102	java/lang/Throwable
    //   2068	2137	2140	java/lang/Throwable
    //   2106	2175	2178	java/lang/Throwable
    //   2144	2213	2216	java/lang/Throwable
    //   2182	2251	2254	java/lang/Throwable
    //   2220	2289	2292	java/lang/Throwable
    //   2258	2327	2330	java/lang/Throwable
    //   2296	2365	2368	java/lang/Throwable
    //   2334	2403	2406	java/lang/Throwable
    //   2372	2441	2444	java/lang/Throwable
    //   2410	2479	2482	java/lang/Throwable
    //   2448	2517	2520	java/lang/Throwable
    //   2486	2555	2558	java/lang/Throwable
    //   2524	2593	2596	java/lang/Throwable
    //   2562	2631	2634	java/lang/Throwable
    //   2600	2669	2672	java/lang/Throwable
    //   2638	2707	2710	java/lang/Throwable
    //   2676	2741	2744	java/lang/Throwable
    //   2826	2840	2840	java/lang/Throwable
    //   2851	2864	2867	java/lang/Throwable
    //   2856	2879	2882	java/lang/Throwable
    //   2871	2897	2900	java/lang/Throwable
    //   2886	2927	2930	java/lang/Throwable
    //   2993	3020	3023	java/lang/Throwable
    //   3010	3038	3041	java/lang/Throwable
    //   3027	3074	3077	java/lang/Throwable
    //   3045	3088	3091	java/lang/Throwable
    //   3140	3154	3154	java/lang/Throwable
    //   3165	3178	3181	java/lang/Throwable
    //   3170	3193	3196	java/lang/Throwable
    //   3185	3211	3214	java/lang/Throwable
    //   3200	3241	3244	java/lang/Throwable
    //   3307	3334	3337	java/lang/Throwable
    //   3324	3355	3358	java/lang/Throwable
    //   3341	3385	3388	java/lang/Throwable
    //   3362	3396	3396	java/lang/Throwable
    //   3407	3423	3426	java/lang/Throwable
    //   3478	3492	3492	java/lang/Throwable
    //   3503	3516	3519	java/lang/Throwable
    //   3508	3531	3534	java/lang/Throwable
    //   3523	3549	3552	java/lang/Throwable
    //   3538	3579	3582	java/lang/Throwable
    //   3645	3672	3675	java/lang/Throwable
    //   3662	3690	3693	java/lang/Throwable
    //   3679	3720	3723	java/lang/Throwable
    //   3697	3731	3731	java/lang/Throwable
    //   3754	3765	3768	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'q\\rÖÑ¶LÕ=ñÕÐÜ×Ó¡×ç2`ÙÝýùÕQIîeÉAi*~OOûJLE uý¨²?âf¬¬37æ2°Ô\\r üM.³fº>\\t*¾Ê¢.`u\\tï4À\\tmV\\r\\t®\\fZô<²Ç9 j}¶¨@X*µ}<A¤K?jÖ¶>ðÓx%EB X²}]ï£xÌ¼g|®($\\nXÇGY`>7DsçýUÖ£´Iâàa\\trsÍÎY\\tý\\rÊÖkÂ\\t{¿Rx?xÝE'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #66
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
    //   68: ldc ' \\b?U±¿V¯\\t#ìx3[0y5'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #67
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
    //   129: putstatic burp/Zxf8.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zxf8.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #27
    //   214: goto -> 243
    //   217: bipush #105
    //   219: goto -> 243
    //   222: bipush #8
    //   224: goto -> 243
    //   227: iconst_3
    //   228: goto -> 243
    //   231: bipush #108
    //   233: goto -> 243
    //   236: bipush #57
    //   238: goto -> 243
    //   241: bipush #44
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #90
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-124
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #40
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #61
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: iconst_5
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-104
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-94
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #124
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #120
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #93
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-123
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-9
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-42
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-98
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #104
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #59
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-77
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-128
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #76
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-81
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-66
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #73
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-14
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-26
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-75
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-109
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #101
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-102
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #35
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-54
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #66
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #19
    //   493: bastore
    //   494: invokespecial <init> : (I[B)V
    //   497: putstatic burp/Zxf8.Zz : Ljava/lang/Object;
    //   500: sipush #28511
    //   503: sipush #-26284
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zxf8.Zq : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6F59) & 0xFFFF;
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
      byte b1 = 37;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxf8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */