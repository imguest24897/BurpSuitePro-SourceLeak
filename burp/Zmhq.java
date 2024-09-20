package burp;

import java.math.BigInteger;

class Zmhq extends ClassLoader {
  static String Zy;
  
  static Object ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZO(Object paramObject) {
    Zr36.Ze = a(4331, 8774);
    Zr36.Za = new BigInteger(a(4334, -2935));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zzc9.Zv.charAt(Math.abs(((BigInteger)Zxju.ZN).intValue() % 32)) <= Zz0b.ZD.charAt(Math.abs(((BigInteger)Zdv.Zw).intValue() % 32))) {
          try {
            Zgei.ZR(Class.forName(a(4333, 4458)));
            if (bool)
              Zejg.Za(Class.forName(a(4322, 13306))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zejg.Za(Class.forName(a(4322, 13306)));
    } catch (Throwable throwable) {}
  }
  
  static void ZX(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZU(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: new java/lang/StringBuilder
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: iconst_0
    //   13: istore #4
    //   15: iload #4
    //   17: bipush #32
    //   19: if_icmpge -> 1355
    //   22: iload #4
    //   24: tableswitch default -> 1348, 0 -> 168, 1 -> 205, 2 -> 242, 3 -> 279, 4 -> 316, 5 -> 353, 6 -> 390, 7 -> 427, 8 -> 464, 9 -> 501, 10 -> 538, 11 -> 575, 12 -> 612, 13 -> 649, 14 -> 686, 15 -> 723, 16 -> 760, 17 -> 797, 18 -> 834, 19 -> 871, 20 -> 908, 21 -> 945, 22 -> 982, 23 -> 1019, 24 -> 1056, 25 -> 1093, 26 -> 1130, 27 -> 1167, 28 -> 1204, 29 -> 1241, 30 -> 1278, 31 -> 1315
    //   168: aload_3
    //   169: getstatic burp/Zbsz.Zu : Ljava/lang/String;
    //   172: getstatic burp/Zrzg.ZA : Ljava/lang/Object;
    //   175: checkcast java/math/BigInteger
    //   178: invokevirtual intValue : ()I
    //   181: bipush #32
    //   183: irem
    //   184: invokestatic abs : (I)I
    //   187: invokevirtual charAt : (I)C
    //   190: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: iload_2
    //   195: ifne -> 1348
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   204: athrow
    //   205: aload_3
    //   206: getstatic burp/Ze1k.ZI : Ljava/lang/String;
    //   209: getstatic burp/Zg2u.ZI : Ljava/lang/Object;
    //   212: checkcast java/math/BigInteger
    //   215: invokevirtual intValue : ()I
    //   218: bipush #32
    //   220: irem
    //   221: invokestatic abs : (I)I
    //   224: invokevirtual charAt : (I)C
    //   227: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: iload_2
    //   232: ifne -> 1348
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   241: athrow
    //   242: aload_3
    //   243: getstatic burp/Zs3m.Zl : Ljava/lang/String;
    //   246: getstatic burp/Zbss.Zh : Ljava/lang/Object;
    //   249: checkcast java/math/BigInteger
    //   252: invokevirtual intValue : ()I
    //   255: bipush #32
    //   257: irem
    //   258: invokestatic abs : (I)I
    //   261: invokevirtual charAt : (I)C
    //   264: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   267: pop
    //   268: iload_2
    //   269: ifne -> 1348
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   278: athrow
    //   279: aload_3
    //   280: getstatic burp/Zedu.ZD : Ljava/lang/String;
    //   283: getstatic burp/Zesw.ZB : Ljava/lang/Object;
    //   286: checkcast java/math/BigInteger
    //   289: invokevirtual intValue : ()I
    //   292: bipush #32
    //   294: irem
    //   295: invokestatic abs : (I)I
    //   298: invokevirtual charAt : (I)C
    //   301: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   304: pop
    //   305: iload_2
    //   306: ifne -> 1348
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   315: athrow
    //   316: aload_3
    //   317: getstatic burp/Zsdl.ZJ : Ljava/lang/String;
    //   320: getstatic burp/Zgk9.ZD : Ljava/lang/Object;
    //   323: checkcast java/math/BigInteger
    //   326: invokevirtual intValue : ()I
    //   329: bipush #32
    //   331: irem
    //   332: invokestatic abs : (I)I
    //   335: invokevirtual charAt : (I)C
    //   338: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   341: pop
    //   342: iload_2
    //   343: ifne -> 1348
    //   346: goto -> 353
    //   349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   352: athrow
    //   353: aload_3
    //   354: getstatic burp/Zeub.ZT : Ljava/lang/String;
    //   357: getstatic burp/Zsn9.Zg : Ljava/lang/Object;
    //   360: checkcast java/math/BigInteger
    //   363: invokevirtual intValue : ()I
    //   366: bipush #32
    //   368: irem
    //   369: invokestatic abs : (I)I
    //   372: invokevirtual charAt : (I)C
    //   375: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: iload_2
    //   380: ifne -> 1348
    //   383: goto -> 390
    //   386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   389: athrow
    //   390: aload_3
    //   391: getstatic burp/Zxd1.ZQ : Ljava/lang/String;
    //   394: getstatic burp/Zek4.ZR : Ljava/lang/Object;
    //   397: checkcast java/math/BigInteger
    //   400: invokevirtual intValue : ()I
    //   403: bipush #32
    //   405: irem
    //   406: invokestatic abs : (I)I
    //   409: invokevirtual charAt : (I)C
    //   412: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   415: pop
    //   416: iload_2
    //   417: ifne -> 1348
    //   420: goto -> 427
    //   423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   426: athrow
    //   427: aload_3
    //   428: getstatic burp/Zeqx.Zu : Ljava/lang/String;
    //   431: getstatic burp/Zvh.Zb : Ljava/lang/Object;
    //   434: checkcast java/math/BigInteger
    //   437: invokevirtual intValue : ()I
    //   440: bipush #32
    //   442: irem
    //   443: invokestatic abs : (I)I
    //   446: invokevirtual charAt : (I)C
    //   449: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   452: pop
    //   453: iload_2
    //   454: ifne -> 1348
    //   457: goto -> 464
    //   460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   463: athrow
    //   464: aload_3
    //   465: getstatic burp/Zrfs.ZD : Ljava/lang/String;
    //   468: getstatic burp/Zld5.ZX : Ljava/lang/Object;
    //   471: checkcast java/math/BigInteger
    //   474: invokevirtual intValue : ()I
    //   477: bipush #32
    //   479: irem
    //   480: invokestatic abs : (I)I
    //   483: invokevirtual charAt : (I)C
    //   486: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   489: pop
    //   490: iload_2
    //   491: ifne -> 1348
    //   494: goto -> 501
    //   497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   500: athrow
    //   501: aload_3
    //   502: getstatic burp/Ze8j.ZU : Ljava/lang/String;
    //   505: getstatic burp/Zlw8.ZA : Ljava/lang/Object;
    //   508: checkcast java/math/BigInteger
    //   511: invokevirtual intValue : ()I
    //   514: bipush #32
    //   516: irem
    //   517: invokestatic abs : (I)I
    //   520: invokevirtual charAt : (I)C
    //   523: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   526: pop
    //   527: iload_2
    //   528: ifne -> 1348
    //   531: goto -> 538
    //   534: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   537: athrow
    //   538: aload_3
    //   539: getstatic burp/Zl2t.Zg : Ljava/lang/String;
    //   542: getstatic burp/Ze7e.Z_ : Ljava/lang/Object;
    //   545: checkcast java/math/BigInteger
    //   548: invokevirtual intValue : ()I
    //   551: bipush #32
    //   553: irem
    //   554: invokestatic abs : (I)I
    //   557: invokevirtual charAt : (I)C
    //   560: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   563: pop
    //   564: iload_2
    //   565: ifne -> 1348
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   574: athrow
    //   575: aload_3
    //   576: getstatic burp/Zm83.Zq : Ljava/lang/String;
    //   579: getstatic burp/Zzk_.Zx : Ljava/lang/Object;
    //   582: checkcast java/math/BigInteger
    //   585: invokevirtual intValue : ()I
    //   588: bipush #32
    //   590: irem
    //   591: invokestatic abs : (I)I
    //   594: invokevirtual charAt : (I)C
    //   597: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   600: pop
    //   601: iload_2
    //   602: ifne -> 1348
    //   605: goto -> 612
    //   608: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   611: athrow
    //   612: aload_3
    //   613: getstatic burp/Zma0.ZP : Ljava/lang/String;
    //   616: getstatic burp/Zma0.ZQ : Ljava/lang/Object;
    //   619: checkcast java/math/BigInteger
    //   622: invokevirtual intValue : ()I
    //   625: bipush #32
    //   627: irem
    //   628: invokestatic abs : (I)I
    //   631: invokevirtual charAt : (I)C
    //   634: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   637: pop
    //   638: iload_2
    //   639: ifne -> 1348
    //   642: goto -> 649
    //   645: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   648: athrow
    //   649: aload_3
    //   650: getstatic burp/Zb3r.Zo : Ljava/lang/String;
    //   653: getstatic burp/Zmlr.Zh : Ljava/lang/Object;
    //   656: checkcast java/math/BigInteger
    //   659: invokevirtual intValue : ()I
    //   662: bipush #32
    //   664: irem
    //   665: invokestatic abs : (I)I
    //   668: invokevirtual charAt : (I)C
    //   671: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   674: pop
    //   675: iload_2
    //   676: ifne -> 1348
    //   679: goto -> 686
    //   682: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   685: athrow
    //   686: aload_3
    //   687: getstatic burp/Zkjj.ZT : Ljava/lang/String;
    //   690: getstatic burp/Zlsg.ZD : Ljava/lang/Object;
    //   693: checkcast java/math/BigInteger
    //   696: invokevirtual intValue : ()I
    //   699: bipush #32
    //   701: irem
    //   702: invokestatic abs : (I)I
    //   705: invokevirtual charAt : (I)C
    //   708: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   711: pop
    //   712: iload_2
    //   713: ifne -> 1348
    //   716: goto -> 723
    //   719: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   722: athrow
    //   723: aload_3
    //   724: getstatic burp/Zkhf.Zb : Ljava/lang/String;
    //   727: getstatic burp/Ztbn.ZA : Ljava/lang/Object;
    //   730: checkcast java/math/BigInteger
    //   733: invokevirtual intValue : ()I
    //   736: bipush #32
    //   738: irem
    //   739: invokestatic abs : (I)I
    //   742: invokevirtual charAt : (I)C
    //   745: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   748: pop
    //   749: iload_2
    //   750: ifne -> 1348
    //   753: goto -> 760
    //   756: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   759: athrow
    //   760: aload_3
    //   761: getstatic burp/Zv8d.Zi : Ljava/lang/String;
    //   764: getstatic burp/Zg7e.Zr : Ljava/lang/Object;
    //   767: checkcast java/math/BigInteger
    //   770: invokevirtual intValue : ()I
    //   773: bipush #32
    //   775: irem
    //   776: invokestatic abs : (I)I
    //   779: invokevirtual charAt : (I)C
    //   782: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   785: pop
    //   786: iload_2
    //   787: ifne -> 1348
    //   790: goto -> 797
    //   793: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   796: athrow
    //   797: aload_3
    //   798: getstatic burp/Ztvg.ZZ : Ljava/lang/String;
    //   801: getstatic burp/Zb3r.ZI : Ljava/lang/Object;
    //   804: checkcast java/math/BigInteger
    //   807: invokevirtual intValue : ()I
    //   810: bipush #32
    //   812: irem
    //   813: invokestatic abs : (I)I
    //   816: invokevirtual charAt : (I)C
    //   819: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   822: pop
    //   823: iload_2
    //   824: ifne -> 1348
    //   827: goto -> 834
    //   830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   833: athrow
    //   834: aload_3
    //   835: getstatic burp/Zzhx.ZV : Ljava/lang/String;
    //   838: getstatic burp/Ztlo.ZP : Ljava/lang/Object;
    //   841: checkcast java/math/BigInteger
    //   844: invokevirtual intValue : ()I
    //   847: bipush #32
    //   849: irem
    //   850: invokestatic abs : (I)I
    //   853: invokevirtual charAt : (I)C
    //   856: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   859: pop
    //   860: iload_2
    //   861: ifne -> 1348
    //   864: goto -> 871
    //   867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   870: athrow
    //   871: aload_3
    //   872: getstatic burp/Zeva.Zo : Ljava/lang/String;
    //   875: getstatic burp/Zr1h.Z_ : Ljava/lang/Object;
    //   878: checkcast java/math/BigInteger
    //   881: invokevirtual intValue : ()I
    //   884: bipush #32
    //   886: irem
    //   887: invokestatic abs : (I)I
    //   890: invokevirtual charAt : (I)C
    //   893: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   896: pop
    //   897: iload_2
    //   898: ifne -> 1348
    //   901: goto -> 908
    //   904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   907: athrow
    //   908: aload_3
    //   909: getstatic burp/Zenr.Z_ : Ljava/lang/String;
    //   912: getstatic burp/Zrnt.Zh : Ljava/lang/Object;
    //   915: checkcast java/math/BigInteger
    //   918: invokevirtual intValue : ()I
    //   921: bipush #32
    //   923: irem
    //   924: invokestatic abs : (I)I
    //   927: invokevirtual charAt : (I)C
    //   930: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   933: pop
    //   934: iload_2
    //   935: ifne -> 1348
    //   938: goto -> 945
    //   941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   944: athrow
    //   945: aload_3
    //   946: getstatic burp/Zg6z.ZY : Ljava/lang/String;
    //   949: getstatic burp/Zbow.ZS : Ljava/lang/Object;
    //   952: checkcast java/math/BigInteger
    //   955: invokevirtual intValue : ()I
    //   958: bipush #32
    //   960: irem
    //   961: invokestatic abs : (I)I
    //   964: invokevirtual charAt : (I)C
    //   967: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   970: pop
    //   971: iload_2
    //   972: ifne -> 1348
    //   975: goto -> 982
    //   978: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   981: athrow
    //   982: aload_3
    //   983: getstatic burp/Ze1k.ZI : Ljava/lang/String;
    //   986: getstatic burp/Zrb6.ZQ : Ljava/lang/Object;
    //   989: checkcast java/math/BigInteger
    //   992: invokevirtual intValue : ()I
    //   995: bipush #32
    //   997: irem
    //   998: invokestatic abs : (I)I
    //   1001: invokevirtual charAt : (I)C
    //   1004: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1007: pop
    //   1008: iload_2
    //   1009: ifne -> 1348
    //   1012: goto -> 1019
    //   1015: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1018: athrow
    //   1019: aload_3
    //   1020: getstatic burp/Zejz.Zd : Ljava/lang/String;
    //   1023: getstatic burp/Zkhf.ZU : Ljava/lang/Object;
    //   1026: checkcast java/math/BigInteger
    //   1029: invokevirtual intValue : ()I
    //   1032: bipush #32
    //   1034: irem
    //   1035: invokestatic abs : (I)I
    //   1038: invokevirtual charAt : (I)C
    //   1041: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1044: pop
    //   1045: iload_2
    //   1046: ifne -> 1348
    //   1049: goto -> 1056
    //   1052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1055: athrow
    //   1056: aload_3
    //   1057: getstatic burp/Zlwj.ZQ : Ljava/lang/String;
    //   1060: getstatic burp/Zscz.ZN : Ljava/lang/Object;
    //   1063: checkcast java/math/BigInteger
    //   1066: invokevirtual intValue : ()I
    //   1069: bipush #32
    //   1071: irem
    //   1072: invokestatic abs : (I)I
    //   1075: invokevirtual charAt : (I)C
    //   1078: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1081: pop
    //   1082: iload_2
    //   1083: ifne -> 1348
    //   1086: goto -> 1093
    //   1089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1092: athrow
    //   1093: aload_3
    //   1094: getstatic burp/Zm_u.Zi : Ljava/lang/String;
    //   1097: getstatic burp/Zelt.ZC : Ljava/lang/Object;
    //   1100: checkcast java/math/BigInteger
    //   1103: invokevirtual intValue : ()I
    //   1106: bipush #32
    //   1108: irem
    //   1109: invokestatic abs : (I)I
    //   1112: invokevirtual charAt : (I)C
    //   1115: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1118: pop
    //   1119: iload_2
    //   1120: ifne -> 1348
    //   1123: goto -> 1130
    //   1126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1129: athrow
    //   1130: aload_3
    //   1131: getstatic burp/Zvob.Zn : Ljava/lang/String;
    //   1134: getstatic burp/Zr14.Zy : Ljava/lang/Object;
    //   1137: checkcast java/math/BigInteger
    //   1140: invokevirtual intValue : ()I
    //   1143: bipush #32
    //   1145: irem
    //   1146: invokestatic abs : (I)I
    //   1149: invokevirtual charAt : (I)C
    //   1152: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1155: pop
    //   1156: iload_2
    //   1157: ifne -> 1348
    //   1160: goto -> 1167
    //   1163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1166: athrow
    //   1167: aload_3
    //   1168: getstatic burp/Zz4a.ZC : Ljava/lang/String;
    //   1171: getstatic burp/Zbl4.ZW : Ljava/lang/Object;
    //   1174: checkcast java/math/BigInteger
    //   1177: invokevirtual intValue : ()I
    //   1180: bipush #32
    //   1182: irem
    //   1183: invokestatic abs : (I)I
    //   1186: invokevirtual charAt : (I)C
    //   1189: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1192: pop
    //   1193: iload_2
    //   1194: ifne -> 1348
    //   1197: goto -> 1204
    //   1200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1203: athrow
    //   1204: aload_3
    //   1205: getstatic burp/Zl3j.Zr : Ljava/lang/String;
    //   1208: getstatic burp/Ze4g.Zz : Ljava/lang/Object;
    //   1211: checkcast java/math/BigInteger
    //   1214: invokevirtual intValue : ()I
    //   1217: bipush #32
    //   1219: irem
    //   1220: invokestatic abs : (I)I
    //   1223: invokevirtual charAt : (I)C
    //   1226: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1229: pop
    //   1230: iload_2
    //   1231: ifne -> 1348
    //   1234: goto -> 1241
    //   1237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1240: athrow
    //   1241: aload_3
    //   1242: getstatic burp/Zzk_.ZX : Ljava/lang/String;
    //   1245: getstatic burp/Ze1k.ZD : Ljava/lang/Object;
    //   1248: checkcast java/math/BigInteger
    //   1251: invokevirtual intValue : ()I
    //   1254: bipush #32
    //   1256: irem
    //   1257: invokestatic abs : (I)I
    //   1260: invokevirtual charAt : (I)C
    //   1263: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1266: pop
    //   1267: iload_2
    //   1268: ifne -> 1348
    //   1271: goto -> 1278
    //   1274: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1277: athrow
    //   1278: aload_3
    //   1279: getstatic burp/Zxy6.ZR : Ljava/lang/String;
    //   1282: getstatic burp/Zg6z.ZS : Ljava/lang/Object;
    //   1285: checkcast java/math/BigInteger
    //   1288: invokevirtual intValue : ()I
    //   1291: bipush #32
    //   1293: irem
    //   1294: invokestatic abs : (I)I
    //   1297: invokevirtual charAt : (I)C
    //   1300: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1303: pop
    //   1304: iload_2
    //   1305: ifne -> 1348
    //   1308: goto -> 1315
    //   1311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1314: athrow
    //   1315: aload_3
    //   1316: getstatic burp/Zlwm.Zj : Ljava/lang/String;
    //   1319: getstatic burp/Zreu.Zi : Ljava/lang/Object;
    //   1322: checkcast java/math/BigInteger
    //   1325: invokevirtual intValue : ()I
    //   1328: bipush #32
    //   1330: irem
    //   1331: invokestatic abs : (I)I
    //   1334: invokevirtual charAt : (I)C
    //   1337: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1340: pop
    //   1341: goto -> 1348
    //   1344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1347: athrow
    //   1348: iinc #4, 1
    //   1351: iload_2
    //   1352: ifne -> 15
    //   1355: aload_3
    //   1356: invokevirtual toString : ()Ljava/lang/String;
    //   1359: putstatic burp/Zscz.ZJ : Ljava/lang/String;
    //   1362: sipush #4328
    //   1365: sipush #-15997
    //   1368: invokestatic a : (II)Ljava/lang/String;
    //   1371: iconst_1
    //   1372: ldc burp/Zsq6
    //   1374: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1377: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1380: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1383: astore #4
    //   1385: aload #4
    //   1387: arraylength
    //   1388: istore #5
    //   1390: iconst_0
    //   1391: istore #6
    //   1393: iload #6
    //   1395: iload #5
    //   1397: if_icmpge -> 1535
    //   1400: aload #4
    //   1402: iload #6
    //   1404: aaload
    //   1405: astore #7
    //   1407: aload #7
    //   1409: invokevirtual getModifiers : ()I
    //   1412: invokestatic isStatic : (I)Z
    //   1415: ifne -> 1425
    //   1418: goto -> 1528
    //   1421: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1424: athrow
    //   1425: aload #7
    //   1427: invokevirtual getType : ()Ljava/lang/Class;
    //   1430: astore #8
    //   1432: aload #8
    //   1434: ifnull -> 1515
    //   1437: aload #8
    //   1439: invokevirtual isPrimitive : ()Z
    //   1442: ifne -> 1515
    //   1445: goto -> 1452
    //   1448: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1451: athrow
    //   1452: aload #8
    //   1454: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1457: ifnull -> 1515
    //   1460: goto -> 1467
    //   1463: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1466: athrow
    //   1467: aload #8
    //   1469: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1472: invokevirtual getName : ()Ljava/lang/String;
    //   1475: ifnull -> 1515
    //   1478: goto -> 1485
    //   1481: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1484: athrow
    //   1485: aload #8
    //   1487: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1490: invokevirtual getName : ()Ljava/lang/String;
    //   1493: sipush #4323
    //   1496: sipush #32339
    //   1499: invokestatic a : (II)Ljava/lang/String;
    //   1502: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1505: ifne -> 1515
    //   1508: goto -> 1515
    //   1511: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1514: athrow
    //   1515: aload #7
    //   1517: iconst_1
    //   1518: invokevirtual setAccessible : (Z)V
    //   1521: aload #7
    //   1523: aconst_null
    //   1524: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1527: pop
    //   1528: iinc #6, 1
    //   1531: iload_2
    //   1532: ifne -> 1393
    //   1535: sipush #4332
    //   1538: sipush #12645
    //   1541: invokestatic a : (II)Ljava/lang/String;
    //   1544: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1547: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1550: astore #4
    //   1552: aload #4
    //   1554: arraylength
    //   1555: istore #5
    //   1557: iconst_0
    //   1558: istore #6
    //   1560: iload #6
    //   1562: iload #5
    //   1564: if_icmpge -> 1697
    //   1567: aload #4
    //   1569: iload #6
    //   1571: aaload
    //   1572: astore #7
    //   1574: aload #7
    //   1576: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1579: pop
    //   1580: aload #7
    //   1582: invokevirtual getModifiers : ()I
    //   1585: invokestatic isStatic : (I)Z
    //   1588: ifeq -> 1683
    //   1591: aload #7
    //   1593: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1596: arraylength
    //   1597: iconst_2
    //   1598: if_icmpne -> 1683
    //   1601: goto -> 1608
    //   1604: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1607: athrow
    //   1608: aload #7
    //   1610: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1613: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1616: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1619: ifeq -> 1683
    //   1622: goto -> 1629
    //   1625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1628: athrow
    //   1629: aload #7
    //   1631: iconst_1
    //   1632: invokevirtual setAccessible : (Z)V
    //   1635: aload #7
    //   1637: aconst_null
    //   1638: iconst_2
    //   1639: anewarray java/lang/Object
    //   1642: dup
    //   1643: iconst_0
    //   1644: aload_0
    //   1645: aastore
    //   1646: dup
    //   1647: iconst_1
    //   1648: aload_1
    //   1649: ifnonnull -> 1667
    //   1652: goto -> 1659
    //   1655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1658: athrow
    //   1659: aload_1
    //   1660: goto -> 1674
    //   1663: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1666: athrow
    //   1667: aload_1
    //   1668: checkcast [B
    //   1671: invokevirtual clone : ()Ljava/lang/Object;
    //   1674: aastore
    //   1675: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1678: pop
    //   1679: iload_2
    //   1680: ifne -> 1697
    //   1683: iinc #6, 1
    //   1686: iload_2
    //   1687: ifne -> 1560
    //   1690: goto -> 1697
    //   1693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1696: athrow
    //   1697: new java/io/ByteArrayOutputStream
    //   1700: dup
    //   1701: invokespecial <init> : ()V
    //   1704: astore #4
    //   1706: getstatic burp/Zsvd.ZB : Ljava/lang/String;
    //   1709: astore #5
    //   1711: iconst_0
    //   1712: istore #6
    //   1714: iload #6
    //   1716: aload #5
    //   1718: invokevirtual length : ()I
    //   1721: if_icmpge -> 1752
    //   1724: aload #4
    //   1726: aload #5
    //   1728: iload #6
    //   1730: iload #6
    //   1732: iconst_2
    //   1733: iadd
    //   1734: invokevirtual substring : (II)Ljava/lang/String;
    //   1737: bipush #16
    //   1739: invokestatic parseInt : (Ljava/lang/String;I)I
    //   1742: invokevirtual write : (I)V
    //   1745: iinc #6, 2
    //   1748: iload_2
    //   1749: ifne -> 1714
    //   1752: aload #4
    //   1754: invokevirtual toByteArray : ()[B
    //   1757: astore #6
    //   1759: getstatic burp/Zebc.Zr : Ljava/lang/Object;
    //   1762: checkcast java/math/BigInteger
    //   1765: invokevirtual toByteArray : ()[B
    //   1768: astore #7
    //   1770: sipush #256
    //   1773: newarray byte
    //   1775: astore #9
    //   1777: sipush #256
    //   1780: newarray int
    //   1782: astore #10
    //   1784: sipush #256
    //   1787: newarray int
    //   1789: astore #11
    //   1791: sipush #256
    //   1794: newarray int
    //   1796: astore #12
    //   1798: sipush #256
    //   1801: newarray int
    //   1803: astore #13
    //   1805: bipush #10
    //   1807: newarray int
    //   1809: astore #14
    //   1811: sipush #283
    //   1814: istore #15
    //   1816: iconst_0
    //   1817: istore #17
    //   1819: iload #17
    //   1821: sipush #256
    //   1824: if_icmpge -> 2058
    //   1827: sipush #4330
    //   1830: sipush #-1808
    //   1833: invokestatic a : (II)Ljava/lang/String;
    //   1836: iload #17
    //   1838: iconst_1
    //   1839: iushr
    //   1840: invokevirtual charAt : (I)C
    //   1843: istore #26
    //   1845: iload #17
    //   1847: iconst_1
    //   1848: iand
    //   1849: ifne -> 1864
    //   1852: iload #26
    //   1854: bipush #8
    //   1856: iushr
    //   1857: goto -> 1866
    //   1860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1863: athrow
    //   1864: iload #26
    //   1866: i2b
    //   1867: sipush #255
    //   1870: iand
    //   1871: istore #16
    //   1873: iload #17
    //   1875: iconst_1
    //   1876: ishl
    //   1877: istore #18
    //   1879: iload #18
    //   1881: sipush #256
    //   1884: if_icmplt -> 1894
    //   1887: iload #18
    //   1889: iload #15
    //   1891: ixor
    //   1892: istore #18
    //   1894: iload #18
    //   1896: iconst_1
    //   1897: ishl
    //   1898: istore #19
    //   1900: iload #19
    //   1902: sipush #256
    //   1905: if_icmplt -> 1915
    //   1908: iload #19
    //   1910: iload #15
    //   1912: ixor
    //   1913: istore #19
    //   1915: iload #19
    //   1917: iconst_1
    //   1918: ishl
    //   1919: istore #20
    //   1921: iload #20
    //   1923: sipush #256
    //   1926: if_icmplt -> 1936
    //   1929: iload #20
    //   1931: iload #15
    //   1933: ixor
    //   1934: istore #20
    //   1936: iload #20
    //   1938: iload #17
    //   1940: ixor
    //   1941: istore #21
    //   1943: iload #21
    //   1945: iload #18
    //   1947: ixor
    //   1948: istore #22
    //   1950: iload #21
    //   1952: iload #19
    //   1954: ixor
    //   1955: istore #23
    //   1957: iload #20
    //   1959: iload #19
    //   1961: ixor
    //   1962: iload #18
    //   1964: ixor
    //   1965: istore #24
    //   1967: aload #9
    //   1969: iload #17
    //   1971: iload #16
    //   1973: i2b
    //   1974: bastore
    //   1975: aload #10
    //   1977: iload #16
    //   1979: iload #24
    //   1981: bipush #24
    //   1983: ishl
    //   1984: iload #21
    //   1986: bipush #16
    //   1988: ishl
    //   1989: ior
    //   1990: iload #23
    //   1992: bipush #8
    //   1994: ishl
    //   1995: ior
    //   1996: iload #22
    //   1998: ior
    //   1999: dup
    //   2000: istore #25
    //   2002: iastore
    //   2003: aload #11
    //   2005: iload #16
    //   2007: iload #25
    //   2009: bipush #8
    //   2011: iushr
    //   2012: iload #25
    //   2014: bipush #24
    //   2016: ishl
    //   2017: ior
    //   2018: iastore
    //   2019: aload #12
    //   2021: iload #16
    //   2023: iload #25
    //   2025: bipush #16
    //   2027: iushr
    //   2028: iload #25
    //   2030: bipush #16
    //   2032: ishl
    //   2033: ior
    //   2034: iastore
    //   2035: aload #13
    //   2037: iload #16
    //   2039: iload #25
    //   2041: bipush #24
    //   2043: iushr
    //   2044: iload #25
    //   2046: bipush #8
    //   2048: ishl
    //   2049: ior
    //   2050: iastore
    //   2051: iinc #17, 1
    //   2054: iload_2
    //   2055: ifne -> 1819
    //   2058: iconst_1
    //   2059: istore #26
    //   2061: aload #14
    //   2063: iconst_0
    //   2064: iload #26
    //   2066: bipush #24
    //   2068: ishl
    //   2069: iastore
    //   2070: iconst_1
    //   2071: istore #27
    //   2073: iload #27
    //   2075: bipush #10
    //   2077: if_icmpge -> 2118
    //   2080: iload #26
    //   2082: iconst_1
    //   2083: ishl
    //   2084: istore #26
    //   2086: iload #26
    //   2088: sipush #256
    //   2091: if_icmplt -> 2101
    //   2094: iload #26
    //   2096: iload #15
    //   2098: ixor
    //   2099: istore #26
    //   2101: aload #14
    //   2103: iload #27
    //   2105: iload #26
    //   2107: bipush #24
    //   2109: ishl
    //   2110: iastore
    //   2111: iinc #27, 1
    //   2114: iload_2
    //   2115: ifne -> 2073
    //   2118: iconst_4
    //   2119: istore #27
    //   2121: iload #27
    //   2123: bipush #6
    //   2125: iadd
    //   2126: istore #28
    //   2128: iconst_4
    //   2129: iload #28
    //   2131: iconst_1
    //   2132: iadd
    //   2133: imul
    //   2134: istore #29
    //   2136: iload #29
    //   2138: newarray int
    //   2140: astore #30
    //   2142: iload #29
    //   2144: newarray int
    //   2146: astore #31
    //   2148: iconst_0
    //   2149: istore #26
    //   2151: iconst_0
    //   2152: istore #33
    //   2154: iconst_0
    //   2155: istore #34
    //   2157: iload #33
    //   2159: iload #27
    //   2161: if_icmpge -> 2229
    //   2164: aload #30
    //   2166: iload #33
    //   2168: aload #6
    //   2170: iload #34
    //   2172: baload
    //   2173: bipush #24
    //   2175: ishl
    //   2176: aload #6
    //   2178: iload #34
    //   2180: iconst_1
    //   2181: iadd
    //   2182: baload
    //   2183: sipush #255
    //   2186: iand
    //   2187: bipush #16
    //   2189: ishl
    //   2190: ior
    //   2191: aload #6
    //   2193: iload #34
    //   2195: iconst_2
    //   2196: iadd
    //   2197: baload
    //   2198: sipush #255
    //   2201: iand
    //   2202: bipush #8
    //   2204: ishl
    //   2205: ior
    //   2206: aload #6
    //   2208: iload #34
    //   2210: iconst_3
    //   2211: iadd
    //   2212: baload
    //   2213: sipush #255
    //   2216: iand
    //   2217: ior
    //   2218: iastore
    //   2219: iinc #33, 1
    //   2222: iinc #34, 4
    //   2225: iload_2
    //   2226: ifne -> 2157
    //   2229: iload #27
    //   2231: istore #33
    //   2233: iconst_0
    //   2234: istore #34
    //   2236: iload #33
    //   2238: iload #29
    //   2240: if_icmpge -> 2367
    //   2243: aload #30
    //   2245: iload #33
    //   2247: iconst_1
    //   2248: isub
    //   2249: iaload
    //   2250: istore #32
    //   2252: iload #34
    //   2254: ifne -> 2341
    //   2257: iload #27
    //   2259: istore #34
    //   2261: aload #9
    //   2263: iload #32
    //   2265: bipush #16
    //   2267: iushr
    //   2268: sipush #255
    //   2271: iand
    //   2272: baload
    //   2273: bipush #24
    //   2275: ishl
    //   2276: aload #9
    //   2278: iload #32
    //   2280: bipush #8
    //   2282: iushr
    //   2283: sipush #255
    //   2286: iand
    //   2287: baload
    //   2288: sipush #255
    //   2291: iand
    //   2292: bipush #16
    //   2294: ishl
    //   2295: ior
    //   2296: aload #9
    //   2298: iload #32
    //   2300: sipush #255
    //   2303: iand
    //   2304: baload
    //   2305: sipush #255
    //   2308: iand
    //   2309: bipush #8
    //   2311: ishl
    //   2312: ior
    //   2313: aload #9
    //   2315: iload #32
    //   2317: bipush #24
    //   2319: iushr
    //   2320: baload
    //   2321: sipush #255
    //   2324: iand
    //   2325: ior
    //   2326: istore #32
    //   2328: iload #32
    //   2330: aload #14
    //   2332: iload #26
    //   2334: iinc #26, 1
    //   2337: iaload
    //   2338: ixor
    //   2339: istore #32
    //   2341: aload #30
    //   2343: iload #33
    //   2345: aload #30
    //   2347: iload #33
    //   2349: iload #27
    //   2351: isub
    //   2352: iaload
    //   2353: iload #32
    //   2355: ixor
    //   2356: iastore
    //   2357: iinc #33, 1
    //   2360: iinc #34, -1
    //   2363: iload_2
    //   2364: ifne -> 2236
    //   2367: iconst_0
    //   2368: istore #33
    //   2370: iconst_4
    //   2371: iload #28
    //   2373: imul
    //   2374: istore #34
    //   2376: aload #31
    //   2378: iload #33
    //   2380: aload #30
    //   2382: iload #34
    //   2384: iaload
    //   2385: iastore
    //   2386: aload #31
    //   2388: iload #33
    //   2390: iconst_1
    //   2391: iadd
    //   2392: aload #30
    //   2394: iload #34
    //   2396: iconst_1
    //   2397: iadd
    //   2398: iaload
    //   2399: iastore
    //   2400: aload #31
    //   2402: iload #33
    //   2404: iconst_2
    //   2405: iadd
    //   2406: aload #30
    //   2408: iload #34
    //   2410: iconst_2
    //   2411: iadd
    //   2412: iaload
    //   2413: iastore
    //   2414: aload #31
    //   2416: iload #33
    //   2418: iconst_3
    //   2419: iadd
    //   2420: aload #30
    //   2422: iload #34
    //   2424: iconst_3
    //   2425: iadd
    //   2426: iaload
    //   2427: iastore
    //   2428: iinc #33, 4
    //   2431: iinc #34, -4
    //   2434: iconst_1
    //   2435: istore #36
    //   2437: iload #36
    //   2439: iload #28
    //   2441: if_icmpge -> 2805
    //   2444: aload #30
    //   2446: iload #34
    //   2448: iaload
    //   2449: istore #35
    //   2451: aload #31
    //   2453: iload #33
    //   2455: aload #10
    //   2457: aload #9
    //   2459: iload #35
    //   2461: bipush #24
    //   2463: iushr
    //   2464: baload
    //   2465: sipush #255
    //   2468: iand
    //   2469: iaload
    //   2470: aload #11
    //   2472: aload #9
    //   2474: iload #35
    //   2476: bipush #16
    //   2478: iushr
    //   2479: sipush #255
    //   2482: iand
    //   2483: baload
    //   2484: sipush #255
    //   2487: iand
    //   2488: iaload
    //   2489: ixor
    //   2490: aload #12
    //   2492: aload #9
    //   2494: iload #35
    //   2496: bipush #8
    //   2498: iushr
    //   2499: sipush #255
    //   2502: iand
    //   2503: baload
    //   2504: sipush #255
    //   2507: iand
    //   2508: iaload
    //   2509: ixor
    //   2510: aload #13
    //   2512: aload #9
    //   2514: iload #35
    //   2516: sipush #255
    //   2519: iand
    //   2520: baload
    //   2521: sipush #255
    //   2524: iand
    //   2525: iaload
    //   2526: ixor
    //   2527: iastore
    //   2528: aload #30
    //   2530: iload #34
    //   2532: iconst_1
    //   2533: iadd
    //   2534: iaload
    //   2535: istore #35
    //   2537: aload #31
    //   2539: iload #33
    //   2541: iconst_1
    //   2542: iadd
    //   2543: aload #10
    //   2545: aload #9
    //   2547: iload #35
    //   2549: bipush #24
    //   2551: iushr
    //   2552: baload
    //   2553: sipush #255
    //   2556: iand
    //   2557: iaload
    //   2558: aload #11
    //   2560: aload #9
    //   2562: iload #35
    //   2564: bipush #16
    //   2566: iushr
    //   2567: sipush #255
    //   2570: iand
    //   2571: baload
    //   2572: sipush #255
    //   2575: iand
    //   2576: iaload
    //   2577: ixor
    //   2578: aload #12
    //   2580: aload #9
    //   2582: iload #35
    //   2584: bipush #8
    //   2586: iushr
    //   2587: sipush #255
    //   2590: iand
    //   2591: baload
    //   2592: sipush #255
    //   2595: iand
    //   2596: iaload
    //   2597: ixor
    //   2598: aload #13
    //   2600: aload #9
    //   2602: iload #35
    //   2604: sipush #255
    //   2607: iand
    //   2608: baload
    //   2609: sipush #255
    //   2612: iand
    //   2613: iaload
    //   2614: ixor
    //   2615: iastore
    //   2616: aload #30
    //   2618: iload #34
    //   2620: iconst_2
    //   2621: iadd
    //   2622: iaload
    //   2623: istore #35
    //   2625: aload #31
    //   2627: iload #33
    //   2629: iconst_2
    //   2630: iadd
    //   2631: aload #10
    //   2633: aload #9
    //   2635: iload #35
    //   2637: bipush #24
    //   2639: iushr
    //   2640: baload
    //   2641: sipush #255
    //   2644: iand
    //   2645: iaload
    //   2646: aload #11
    //   2648: aload #9
    //   2650: iload #35
    //   2652: bipush #16
    //   2654: iushr
    //   2655: sipush #255
    //   2658: iand
    //   2659: baload
    //   2660: sipush #255
    //   2663: iand
    //   2664: iaload
    //   2665: ixor
    //   2666: aload #12
    //   2668: aload #9
    //   2670: iload #35
    //   2672: bipush #8
    //   2674: iushr
    //   2675: sipush #255
    //   2678: iand
    //   2679: baload
    //   2680: sipush #255
    //   2683: iand
    //   2684: iaload
    //   2685: ixor
    //   2686: aload #13
    //   2688: aload #9
    //   2690: iload #35
    //   2692: sipush #255
    //   2695: iand
    //   2696: baload
    //   2697: sipush #255
    //   2700: iand
    //   2701: iaload
    //   2702: ixor
    //   2703: iastore
    //   2704: aload #30
    //   2706: iload #34
    //   2708: iconst_3
    //   2709: iadd
    //   2710: iaload
    //   2711: istore #35
    //   2713: aload #31
    //   2715: iload #33
    //   2717: iconst_3
    //   2718: iadd
    //   2719: aload #10
    //   2721: aload #9
    //   2723: iload #35
    //   2725: bipush #24
    //   2727: iushr
    //   2728: baload
    //   2729: sipush #255
    //   2732: iand
    //   2733: iaload
    //   2734: aload #11
    //   2736: aload #9
    //   2738: iload #35
    //   2740: bipush #16
    //   2742: iushr
    //   2743: sipush #255
    //   2746: iand
    //   2747: baload
    //   2748: sipush #255
    //   2751: iand
    //   2752: iaload
    //   2753: ixor
    //   2754: aload #12
    //   2756: aload #9
    //   2758: iload #35
    //   2760: bipush #8
    //   2762: iushr
    //   2763: sipush #255
    //   2766: iand
    //   2767: baload
    //   2768: sipush #255
    //   2771: iand
    //   2772: iaload
    //   2773: ixor
    //   2774: aload #13
    //   2776: aload #9
    //   2778: iload #35
    //   2780: sipush #255
    //   2783: iand
    //   2784: baload
    //   2785: sipush #255
    //   2788: iand
    //   2789: iaload
    //   2790: ixor
    //   2791: iastore
    //   2792: iinc #33, 4
    //   2795: iinc #34, -4
    //   2798: iinc #36, 1
    //   2801: iload_2
    //   2802: ifne -> 2437
    //   2805: aload #31
    //   2807: iload #33
    //   2809: aload #30
    //   2811: iload #34
    //   2813: iaload
    //   2814: iastore
    //   2815: aload #31
    //   2817: iload #33
    //   2819: iconst_1
    //   2820: iadd
    //   2821: aload #30
    //   2823: iload #34
    //   2825: iconst_1
    //   2826: iadd
    //   2827: iaload
    //   2828: iastore
    //   2829: aload #31
    //   2831: iload #33
    //   2833: iconst_2
    //   2834: iadd
    //   2835: aload #30
    //   2837: iload #34
    //   2839: iconst_2
    //   2840: iadd
    //   2841: iaload
    //   2842: iastore
    //   2843: aload #31
    //   2845: iload #33
    //   2847: iconst_3
    //   2848: iadd
    //   2849: aload #30
    //   2851: iload #34
    //   2853: iconst_3
    //   2854: iadd
    //   2855: iaload
    //   2856: iastore
    //   2857: iconst_0
    //   2858: newarray byte
    //   2860: astore #36
    //   2862: aload #7
    //   2864: arraylength
    //   2865: bipush #16
    //   2867: irem
    //   2868: ifeq -> 2892
    //   2871: new java/lang/Exception
    //   2874: dup
    //   2875: sipush #4320
    //   2878: sipush #2298
    //   2881: invokestatic a : (II)Ljava/lang/String;
    //   2884: invokespecial <init> : (Ljava/lang/String;)V
    //   2887: athrow
    //   2888: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2891: athrow
    //   2892: bipush #10
    //   2894: istore #37
    //   2896: sipush #4335
    //   2899: sipush #256
    //   2902: newarray byte
    //   2904: astore #38
    //   2906: sipush #17313
    //   2909: sipush #256
    //   2912: newarray int
    //   2914: astore #39
    //   2916: sipush #256
    //   2919: newarray int
    //   2921: astore #40
    //   2923: sipush #256
    //   2926: newarray int
    //   2928: astore #41
    //   2930: sipush #256
    //   2933: newarray int
    //   2935: astore #42
    //   2937: sipush #283
    //   2940: istore #15
    //   2942: invokestatic a : (II)Ljava/lang/String;
    //   2945: astore #43
    //   2947: iconst_0
    //   2948: istore #17
    //   2950: iload #17
    //   2952: sipush #256
    //   2955: if_icmpge -> 3182
    //   2958: aload #43
    //   2960: iload #17
    //   2962: iconst_1
    //   2963: iushr
    //   2964: invokevirtual charAt : (I)C
    //   2967: istore #44
    //   2969: iload #17
    //   2971: iconst_1
    //   2972: iand
    //   2973: ifne -> 2988
    //   2976: iload #44
    //   2978: bipush #8
    //   2980: iushr
    //   2981: goto -> 2990
    //   2984: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2987: athrow
    //   2988: iload #44
    //   2990: i2b
    //   2991: sipush #255
    //   2994: iand
    //   2995: istore #16
    //   2997: iload #17
    //   2999: iconst_1
    //   3000: ishl
    //   3001: istore #18
    //   3003: iload #18
    //   3005: sipush #256
    //   3008: if_icmplt -> 3018
    //   3011: iload #18
    //   3013: iload #15
    //   3015: ixor
    //   3016: istore #18
    //   3018: iload #18
    //   3020: iconst_1
    //   3021: ishl
    //   3022: istore #19
    //   3024: iload #19
    //   3026: sipush #256
    //   3029: if_icmplt -> 3039
    //   3032: iload #19
    //   3034: iload #15
    //   3036: ixor
    //   3037: istore #19
    //   3039: iload #19
    //   3041: iconst_1
    //   3042: ishl
    //   3043: istore #20
    //   3045: iload #20
    //   3047: sipush #256
    //   3050: if_icmplt -> 3060
    //   3053: iload #20
    //   3055: iload #15
    //   3057: ixor
    //   3058: istore #20
    //   3060: iload #20
    //   3062: iload #17
    //   3064: ixor
    //   3065: istore #21
    //   3067: iload #21
    //   3069: iload #18
    //   3071: ixor
    //   3072: istore #22
    //   3074: iload #21
    //   3076: iload #19
    //   3078: ixor
    //   3079: istore #23
    //   3081: iload #20
    //   3083: iload #19
    //   3085: ixor
    //   3086: iload #18
    //   3088: ixor
    //   3089: istore #24
    //   3091: aload #38
    //   3093: iload #16
    //   3095: iload #17
    //   3097: i2b
    //   3098: bastore
    //   3099: aload #39
    //   3101: iload #16
    //   3103: iload #24
    //   3105: bipush #24
    //   3107: ishl
    //   3108: iload #21
    //   3110: bipush #16
    //   3112: ishl
    //   3113: ior
    //   3114: iload #23
    //   3116: bipush #8
    //   3118: ishl
    //   3119: ior
    //   3120: iload #22
    //   3122: ior
    //   3123: dup
    //   3124: istore #25
    //   3126: iastore
    //   3127: aload #40
    //   3129: iload #16
    //   3131: iload #25
    //   3133: bipush #8
    //   3135: iushr
    //   3136: iload #25
    //   3138: bipush #24
    //   3140: ishl
    //   3141: ior
    //   3142: iastore
    //   3143: aload #41
    //   3145: iload #16
    //   3147: iload #25
    //   3149: bipush #16
    //   3151: iushr
    //   3152: iload #25
    //   3154: bipush #16
    //   3156: ishl
    //   3157: ior
    //   3158: iastore
    //   3159: aload #42
    //   3161: iload #16
    //   3163: iload #25
    //   3165: bipush #24
    //   3167: iushr
    //   3168: iload #25
    //   3170: bipush #8
    //   3172: ishl
    //   3173: ior
    //   3174: iastore
    //   3175: iinc #17, 1
    //   3178: iload_2
    //   3179: ifne -> 2950
    //   3182: aload #7
    //   3184: arraylength
    //   3185: newarray byte
    //   3187: astore #44
    //   3189: iconst_0
    //   3190: istore #45
    //   3192: iload #45
    //   3194: aload #7
    //   3196: arraylength
    //   3197: bipush #16
    //   3199: idiv
    //   3200: if_icmpge -> 4114
    //   3203: bipush #16
    //   3205: newarray byte
    //   3207: astore #46
    //   3209: bipush #16
    //   3211: newarray byte
    //   3213: astore #47
    //   3215: iconst_0
    //   3216: istore #48
    //   3218: iload #48
    //   3220: bipush #16
    //   3222: if_icmpge -> 3248
    //   3225: aload #46
    //   3227: iload #48
    //   3229: aload #7
    //   3231: iload #48
    //   3233: iload #45
    //   3235: bipush #16
    //   3237: imul
    //   3238: iadd
    //   3239: baload
    //   3240: bastore
    //   3241: iinc #48, 1
    //   3244: iload_2
    //   3245: ifne -> 3218
    //   3248: iconst_0
    //   3249: istore #48
    //   3251: aload #46
    //   3253: iconst_0
    //   3254: baload
    //   3255: bipush #24
    //   3257: ishl
    //   3258: aload #46
    //   3260: iconst_1
    //   3261: baload
    //   3262: sipush #255
    //   3265: iand
    //   3266: bipush #16
    //   3268: ishl
    //   3269: ior
    //   3270: aload #46
    //   3272: iconst_2
    //   3273: baload
    //   3274: sipush #255
    //   3277: iand
    //   3278: bipush #8
    //   3280: ishl
    //   3281: ior
    //   3282: aload #46
    //   3284: iconst_3
    //   3285: baload
    //   3286: sipush #255
    //   3289: iand
    //   3290: ior
    //   3291: aload #31
    //   3293: iconst_0
    //   3294: iaload
    //   3295: ixor
    //   3296: istore #50
    //   3298: aload #46
    //   3300: iconst_4
    //   3301: baload
    //   3302: bipush #24
    //   3304: ishl
    //   3305: aload #46
    //   3307: iconst_5
    //   3308: baload
    //   3309: sipush #255
    //   3312: iand
    //   3313: bipush #16
    //   3315: ishl
    //   3316: ior
    //   3317: aload #46
    //   3319: bipush #6
    //   3321: baload
    //   3322: sipush #255
    //   3325: iand
    //   3326: bipush #8
    //   3328: ishl
    //   3329: ior
    //   3330: aload #46
    //   3332: bipush #7
    //   3334: baload
    //   3335: sipush #255
    //   3338: iand
    //   3339: ior
    //   3340: aload #31
    //   3342: iconst_1
    //   3343: iaload
    //   3344: ixor
    //   3345: istore #51
    //   3347: aload #46
    //   3349: bipush #8
    //   3351: baload
    //   3352: bipush #24
    //   3354: ishl
    //   3355: aload #46
    //   3357: bipush #9
    //   3359: baload
    //   3360: sipush #255
    //   3363: iand
    //   3364: bipush #16
    //   3366: ishl
    //   3367: ior
    //   3368: aload #46
    //   3370: bipush #10
    //   3372: baload
    //   3373: sipush #255
    //   3376: iand
    //   3377: bipush #8
    //   3379: ishl
    //   3380: ior
    //   3381: aload #46
    //   3383: bipush #11
    //   3385: baload
    //   3386: sipush #255
    //   3389: iand
    //   3390: ior
    //   3391: aload #31
    //   3393: iconst_2
    //   3394: iaload
    //   3395: ixor
    //   3396: istore #52
    //   3398: aload #46
    //   3400: bipush #12
    //   3402: baload
    //   3403: bipush #24
    //   3405: ishl
    //   3406: aload #46
    //   3408: bipush #13
    //   3410: baload
    //   3411: sipush #255
    //   3414: iand
    //   3415: bipush #16
    //   3417: ishl
    //   3418: ior
    //   3419: aload #46
    //   3421: bipush #14
    //   3423: baload
    //   3424: sipush #255
    //   3427: iand
    //   3428: bipush #8
    //   3430: ishl
    //   3431: ior
    //   3432: aload #46
    //   3434: bipush #15
    //   3436: baload
    //   3437: sipush #255
    //   3440: iand
    //   3441: ior
    //   3442: aload #31
    //   3444: iconst_3
    //   3445: iaload
    //   3446: ixor
    //   3447: istore #53
    //   3449: iconst_1
    //   3450: istore #54
    //   3452: iload #54
    //   3454: iload #37
    //   3456: if_icmpge -> 3699
    //   3459: iinc #48, 4
    //   3462: aload #39
    //   3464: iload #50
    //   3466: bipush #24
    //   3468: iushr
    //   3469: iaload
    //   3470: aload #40
    //   3472: iload #53
    //   3474: bipush #16
    //   3476: iushr
    //   3477: sipush #255
    //   3480: iand
    //   3481: iaload
    //   3482: ixor
    //   3483: aload #41
    //   3485: iload #52
    //   3487: bipush #8
    //   3489: iushr
    //   3490: sipush #255
    //   3493: iand
    //   3494: iaload
    //   3495: ixor
    //   3496: aload #42
    //   3498: iload #51
    //   3500: sipush #255
    //   3503: iand
    //   3504: iaload
    //   3505: ixor
    //   3506: aload #31
    //   3508: iload #48
    //   3510: iaload
    //   3511: ixor
    //   3512: istore #55
    //   3514: aload #39
    //   3516: iload #51
    //   3518: bipush #24
    //   3520: iushr
    //   3521: iaload
    //   3522: aload #40
    //   3524: iload #50
    //   3526: bipush #16
    //   3528: iushr
    //   3529: sipush #255
    //   3532: iand
    //   3533: iaload
    //   3534: ixor
    //   3535: aload #41
    //   3537: iload #53
    //   3539: bipush #8
    //   3541: iushr
    //   3542: sipush #255
    //   3545: iand
    //   3546: iaload
    //   3547: ixor
    //   3548: aload #42
    //   3550: iload #52
    //   3552: sipush #255
    //   3555: iand
    //   3556: iaload
    //   3557: ixor
    //   3558: aload #31
    //   3560: iload #48
    //   3562: iconst_1
    //   3563: iadd
    //   3564: iaload
    //   3565: ixor
    //   3566: istore #56
    //   3568: aload #39
    //   3570: iload #52
    //   3572: bipush #24
    //   3574: iushr
    //   3575: iaload
    //   3576: aload #40
    //   3578: iload #51
    //   3580: bipush #16
    //   3582: iushr
    //   3583: sipush #255
    //   3586: iand
    //   3587: iaload
    //   3588: ixor
    //   3589: aload #41
    //   3591: iload #50
    //   3593: bipush #8
    //   3595: iushr
    //   3596: sipush #255
    //   3599: iand
    //   3600: iaload
    //   3601: ixor
    //   3602: aload #42
    //   3604: iload #53
    //   3606: sipush #255
    //   3609: iand
    //   3610: iaload
    //   3611: ixor
    //   3612: aload #31
    //   3614: iload #48
    //   3616: iconst_2
    //   3617: iadd
    //   3618: iaload
    //   3619: ixor
    //   3620: istore #57
    //   3622: aload #39
    //   3624: iload #53
    //   3626: bipush #24
    //   3628: iushr
    //   3629: iaload
    //   3630: aload #40
    //   3632: iload #52
    //   3634: bipush #16
    //   3636: iushr
    //   3637: sipush #255
    //   3640: iand
    //   3641: iaload
    //   3642: ixor
    //   3643: aload #41
    //   3645: iload #51
    //   3647: bipush #8
    //   3649: iushr
    //   3650: sipush #255
    //   3653: iand
    //   3654: iaload
    //   3655: ixor
    //   3656: aload #42
    //   3658: iload #50
    //   3660: sipush #255
    //   3663: iand
    //   3664: iaload
    //   3665: ixor
    //   3666: aload #31
    //   3668: iload #48
    //   3670: iconst_3
    //   3671: iadd
    //   3672: iaload
    //   3673: ixor
    //   3674: istore #58
    //   3676: iload #55
    //   3678: istore #50
    //   3680: iload #56
    //   3682: istore #51
    //   3684: iload #57
    //   3686: istore #52
    //   3688: iload #58
    //   3690: istore #53
    //   3692: iinc #54, 1
    //   3695: iload_2
    //   3696: ifne -> 3452
    //   3699: iinc #48, 4
    //   3702: aload #31
    //   3704: iload #48
    //   3706: iaload
    //   3707: istore #49
    //   3709: aload #47
    //   3711: iconst_0
    //   3712: aload #38
    //   3714: iload #50
    //   3716: bipush #24
    //   3718: iushr
    //   3719: baload
    //   3720: iload #49
    //   3722: bipush #24
    //   3724: iushr
    //   3725: ixor
    //   3726: i2b
    //   3727: bastore
    //   3728: aload #47
    //   3730: iconst_1
    //   3731: aload #38
    //   3733: iload #53
    //   3735: bipush #16
    //   3737: iushr
    //   3738: sipush #255
    //   3741: iand
    //   3742: baload
    //   3743: iload #49
    //   3745: bipush #16
    //   3747: iushr
    //   3748: ixor
    //   3749: i2b
    //   3750: bastore
    //   3751: aload #47
    //   3753: iconst_2
    //   3754: aload #38
    //   3756: iload #52
    //   3758: bipush #8
    //   3760: iushr
    //   3761: sipush #255
    //   3764: iand
    //   3765: baload
    //   3766: iload #49
    //   3768: bipush #8
    //   3770: iushr
    //   3771: ixor
    //   3772: i2b
    //   3773: bastore
    //   3774: aload #47
    //   3776: iconst_3
    //   3777: aload #38
    //   3779: iload #51
    //   3781: sipush #255
    //   3784: iand
    //   3785: baload
    //   3786: iload #49
    //   3788: ixor
    //   3789: i2b
    //   3790: bastore
    //   3791: aload #31
    //   3793: iload #48
    //   3795: iconst_1
    //   3796: iadd
    //   3797: iaload
    //   3798: istore #49
    //   3800: aload #47
    //   3802: iconst_4
    //   3803: aload #38
    //   3805: iload #51
    //   3807: bipush #24
    //   3809: iushr
    //   3810: baload
    //   3811: iload #49
    //   3813: bipush #24
    //   3815: iushr
    //   3816: ixor
    //   3817: i2b
    //   3818: bastore
    //   3819: aload #47
    //   3821: iconst_5
    //   3822: aload #38
    //   3824: iload #50
    //   3826: bipush #16
    //   3828: iushr
    //   3829: sipush #255
    //   3832: iand
    //   3833: baload
    //   3834: iload #49
    //   3836: bipush #16
    //   3838: iushr
    //   3839: ixor
    //   3840: i2b
    //   3841: bastore
    //   3842: aload #47
    //   3844: bipush #6
    //   3846: aload #38
    //   3848: iload #53
    //   3850: bipush #8
    //   3852: iushr
    //   3853: sipush #255
    //   3856: iand
    //   3857: baload
    //   3858: iload #49
    //   3860: bipush #8
    //   3862: iushr
    //   3863: ixor
    //   3864: i2b
    //   3865: bastore
    //   3866: aload #47
    //   3868: bipush #7
    //   3870: aload #38
    //   3872: iload #52
    //   3874: sipush #255
    //   3877: iand
    //   3878: baload
    //   3879: iload #49
    //   3881: ixor
    //   3882: i2b
    //   3883: bastore
    //   3884: aload #31
    //   3886: iload #48
    //   3888: iconst_2
    //   3889: iadd
    //   3890: iaload
    //   3891: istore #49
    //   3893: aload #47
    //   3895: bipush #8
    //   3897: aload #38
    //   3899: iload #52
    //   3901: bipush #24
    //   3903: iushr
    //   3904: baload
    //   3905: iload #49
    //   3907: bipush #24
    //   3909: iushr
    //   3910: ixor
    //   3911: i2b
    //   3912: bastore
    //   3913: aload #47
    //   3915: bipush #9
    //   3917: aload #38
    //   3919: iload #51
    //   3921: bipush #16
    //   3923: iushr
    //   3924: sipush #255
    //   3927: iand
    //   3928: baload
    //   3929: iload #49
    //   3931: bipush #16
    //   3933: iushr
    //   3934: ixor
    //   3935: i2b
    //   3936: bastore
    //   3937: aload #47
    //   3939: bipush #10
    //   3941: aload #38
    //   3943: iload #50
    //   3945: bipush #8
    //   3947: iushr
    //   3948: sipush #255
    //   3951: iand
    //   3952: baload
    //   3953: iload #49
    //   3955: bipush #8
    //   3957: iushr
    //   3958: ixor
    //   3959: i2b
    //   3960: bastore
    //   3961: aload #47
    //   3963: bipush #11
    //   3965: aload #38
    //   3967: iload #53
    //   3969: sipush #255
    //   3972: iand
    //   3973: baload
    //   3974: iload #49
    //   3976: ixor
    //   3977: i2b
    //   3978: bastore
    //   3979: aload #31
    //   3981: iload #48
    //   3983: iconst_3
    //   3984: iadd
    //   3985: iaload
    //   3986: istore #49
    //   3988: aload #47
    //   3990: bipush #12
    //   3992: aload #38
    //   3994: iload #53
    //   3996: bipush #24
    //   3998: iushr
    //   3999: baload
    //   4000: iload #49
    //   4002: bipush #24
    //   4004: iushr
    //   4005: ixor
    //   4006: i2b
    //   4007: bastore
    //   4008: aload #47
    //   4010: bipush #13
    //   4012: aload #38
    //   4014: iload #52
    //   4016: bipush #16
    //   4018: iushr
    //   4019: sipush #255
    //   4022: iand
    //   4023: baload
    //   4024: iload #49
    //   4026: bipush #16
    //   4028: iushr
    //   4029: ixor
    //   4030: i2b
    //   4031: bastore
    //   4032: aload #47
    //   4034: bipush #14
    //   4036: aload #38
    //   4038: iload #51
    //   4040: bipush #8
    //   4042: iushr
    //   4043: sipush #255
    //   4046: iand
    //   4047: baload
    //   4048: iload #49
    //   4050: bipush #8
    //   4052: iushr
    //   4053: ixor
    //   4054: i2b
    //   4055: bastore
    //   4056: aload #47
    //   4058: bipush #15
    //   4060: aload #38
    //   4062: iload #50
    //   4064: sipush #255
    //   4067: iand
    //   4068: baload
    //   4069: iload #49
    //   4071: ixor
    //   4072: i2b
    //   4073: bastore
    //   4074: iconst_0
    //   4075: istore #54
    //   4077: iload #54
    //   4079: bipush #16
    //   4081: if_icmpge -> 4107
    //   4084: aload #44
    //   4086: iload #54
    //   4088: iload #45
    //   4090: bipush #16
    //   4092: imul
    //   4093: iadd
    //   4094: aload #47
    //   4096: iload #54
    //   4098: baload
    //   4099: bastore
    //   4100: iinc #54, 1
    //   4103: iload_2
    //   4104: ifne -> 4077
    //   4107: iinc #45, 1
    //   4110: iload_2
    //   4111: ifne -> 3192
    //   4114: aload #44
    //   4116: arraylength
    //   4117: ifle -> 4198
    //   4120: aload #44
    //   4122: aload #44
    //   4124: arraylength
    //   4125: iconst_1
    //   4126: isub
    //   4127: baload
    //   4128: istore #45
    //   4130: iload #45
    //   4132: bipush #16
    //   4134: if_icmple -> 4145
    //   4137: aload #44
    //   4139: astore #36
    //   4141: iload_2
    //   4142: ifne -> 4198
    //   4145: aload #44
    //   4147: arraylength
    //   4148: iload #45
    //   4150: isub
    //   4151: newarray byte
    //   4153: astore #36
    //   4155: iconst_0
    //   4156: istore #46
    //   4158: iload #46
    //   4160: aload #36
    //   4162: arraylength
    //   4163: if_icmpge -> 4198
    //   4166: iload #46
    //   4168: aload #44
    //   4170: arraylength
    //   4171: if_icmpge -> 4198
    //   4174: aload #36
    //   4176: iload #46
    //   4178: aload #44
    //   4180: iload #46
    //   4182: baload
    //   4183: bastore
    //   4184: iinc #46, 1
    //   4187: iload_2
    //   4188: ifne -> 4158
    //   4191: goto -> 4198
    //   4194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4197: athrow
    //   4198: aload #36
    //   4200: astore #8
    //   4202: getstatic burp/Zso.ZL : Ljava/lang/String;
    //   4205: getstatic burp/Zkf6.ZS : Ljava/lang/Object;
    //   4208: checkcast java/math/BigInteger
    //   4211: invokevirtual intValue : ()I
    //   4214: bipush #32
    //   4216: irem
    //   4217: invokestatic abs : (I)I
    //   4220: invokevirtual charAt : (I)C
    //   4223: getstatic burp/Zl_a.ZD : Ljava/lang/String;
    //   4226: getstatic burp/Zlxr.Zz : Ljava/lang/Object;
    //   4229: checkcast java/math/BigInteger
    //   4232: invokevirtual intValue : ()I
    //   4235: bipush #32
    //   4237: irem
    //   4238: invokestatic abs : (I)I
    //   4241: invokevirtual charAt : (I)C
    //   4244: if_icmple -> 4351
    //   4247: getstatic burp/Zxy6.ZR : Ljava/lang/String;
    //   4250: getstatic burp/Zeqx.Zh : Ljava/lang/Object;
    //   4253: checkcast java/math/BigInteger
    //   4256: invokevirtual intValue : ()I
    //   4259: bipush #32
    //   4261: irem
    //   4262: invokestatic abs : (I)I
    //   4265: invokevirtual charAt : (I)C
    //   4268: getstatic burp/Zeub.ZT : Ljava/lang/String;
    //   4271: getstatic burp/Zkjj.Zh : Ljava/lang/Object;
    //   4274: checkcast java/math/BigInteger
    //   4277: invokevirtual intValue : ()I
    //   4280: bipush #32
    //   4282: irem
    //   4283: invokestatic abs : (I)I
    //   4286: invokevirtual charAt : (I)C
    //   4289: if_icmple -> 4351
    //   4292: goto -> 4299
    //   4295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4298: athrow
    //   4299: getstatic burp/Zsvd.ZB : Ljava/lang/String;
    //   4302: getstatic burp/Zepy.Ze : Ljava/lang/Object;
    //   4305: checkcast java/math/BigInteger
    //   4308: invokevirtual intValue : ()I
    //   4311: bipush #32
    //   4313: irem
    //   4314: invokestatic abs : (I)I
    //   4317: invokevirtual charAt : (I)C
    //   4320: getstatic burp/Zzyb.Zh : Ljava/lang/String;
    //   4323: getstatic burp/Zdv.Zw : Ljava/lang/Object;
    //   4326: checkcast java/math/BigInteger
    //   4329: invokevirtual intValue : ()I
    //   4332: bipush #32
    //   4334: irem
    //   4335: invokestatic abs : (I)I
    //   4338: invokevirtual charAt : (I)C
    //   4341: if_icmpgt -> 4359
    //   4344: goto -> 4351
    //   4347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4350: athrow
    //   4351: iconst_1
    //   4352: goto -> 4360
    //   4355: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4358: athrow
    //   4359: iconst_0
    //   4360: ireturn
    //   4361: astore_3
    //   4362: new java/lang/Exception
    //   4365: dup
    //   4366: aload_3
    //   4367: invokevirtual getMessage : ()Ljava/lang/String;
    //   4370: invokespecial <init> : (Ljava/lang/String;)V
    //   4373: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4360	4361	java/lang/Throwable
    //   22	198	201	java/lang/Throwable
    //   168	235	238	java/lang/Throwable
    //   205	272	275	java/lang/Throwable
    //   242	309	312	java/lang/Throwable
    //   279	346	349	java/lang/Throwable
    //   316	383	386	java/lang/Throwable
    //   353	420	423	java/lang/Throwable
    //   390	457	460	java/lang/Throwable
    //   427	494	497	java/lang/Throwable
    //   464	531	534	java/lang/Throwable
    //   501	568	571	java/lang/Throwable
    //   538	605	608	java/lang/Throwable
    //   575	642	645	java/lang/Throwable
    //   612	679	682	java/lang/Throwable
    //   649	716	719	java/lang/Throwable
    //   686	753	756	java/lang/Throwable
    //   723	790	793	java/lang/Throwable
    //   760	827	830	java/lang/Throwable
    //   797	864	867	java/lang/Throwable
    //   834	901	904	java/lang/Throwable
    //   871	938	941	java/lang/Throwable
    //   908	975	978	java/lang/Throwable
    //   945	1012	1015	java/lang/Throwable
    //   982	1049	1052	java/lang/Throwable
    //   1019	1086	1089	java/lang/Throwable
    //   1056	1123	1126	java/lang/Throwable
    //   1093	1160	1163	java/lang/Throwable
    //   1130	1197	1200	java/lang/Throwable
    //   1167	1234	1237	java/lang/Throwable
    //   1204	1271	1274	java/lang/Throwable
    //   1241	1308	1311	java/lang/Throwable
    //   1278	1341	1344	java/lang/Throwable
    //   1407	1421	1421	java/lang/Throwable
    //   1432	1445	1448	java/lang/Throwable
    //   1437	1460	1463	java/lang/Throwable
    //   1452	1478	1481	java/lang/Throwable
    //   1467	1508	1511	java/lang/Throwable
    //   1574	1601	1604	java/lang/Throwable
    //   1591	1622	1625	java/lang/Throwable
    //   1608	1652	1655	java/lang/Throwable
    //   1629	1663	1663	java/lang/Throwable
    //   1674	1690	1693	java/lang/Throwable
    //   1845	1860	1860	java/lang/Throwable
    //   2862	2888	2888	java/lang/Throwable
    //   2969	2984	2984	java/lang/Throwable
    //   4166	4191	4194	java/lang/Throwable
    //   4202	4292	4295	java/lang/Throwable
    //   4247	4344	4347	java/lang/Throwable
    //   4299	4355	4355	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '掭瞸演ぴ杀ﻄꯒ쪇줖睊䜇괇ꈝ鳨犉띙錝㚱㓷熇ㇿЦ⍬᣹Ԑދ肙눪ॖⰐᯫ娙剕횭⧇⼓匢'₱녟樗븰䫻塃탩ꩇ䏒㍠䖕ʡ僜龰兡䂔鋯㣋벂?ၳ췒ፕ徒䐫쐄縑摬᥻恳佼−郔䙿룵?୺㨂䦀⓫싧걸酉㟾趜乔氚敷껶먷╅᳕됵瑵䮯譌災뗖䣥愸坯蛁ᵁ飄槌軭鮂蟆칤⠱豢覆뿭䋳䆊ⶨ끍뭝 ¸ÚOÜv4áî£\\bØô¤®ñ·1¯çÎò N3¯ÑRÙ¥\\tÀ´acY #f=ÛÂ´CRqë:2%0Âê ­ÓwaÔ¶Mñ~ÁíÍ Ñè¼ÀupµY;s±ð\\t~&VSL[I¼ÈÂ\\n[g;ãÂ;¨É)°ôøËµI",=ÄSrò¿Ûo²÷;d×挚瞡漷オ朤︟ꭞ쫼즇陼䜵귪ꉛ鱕牁럮錄㙇㐩煜ㅳѝ⏽ᢖԢݦ胟닢ৡⰉᬝ娺劋훉⤜⾟卙¶⃞녭櫺빶䩆墋큞꩞䌤㍃䕋˅倇鼼儚䀅銀㣹뱯?჎쵥ፌ彤䐈쓚繵撷᧷怈俭≽郦䚒뢳?ல㨛䥶Ⓢ숹개醒㝯跳书泷旊긾몀╜ᰣ됖琑䭴诀瀆땇䢊懕圩虼ᶉ飝椺軎魜螢캿⢽谙褗뾂䋁䅧ⷮ냰뮕\\t^¯6!ó¯Õ\\tÈ~Ì¶lf¶Kå\\t7u[CPôn'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #128
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: iconst_4
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
    //   65: goto -> 24
    //   68: ldc 'E³{\\t0ç;bÔ=Ë÷eV7Á~y'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #111
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
    //   128: putstatic burp/Zmhq.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmhq.b : [Ljava/lang/String;
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
    //   212: bipush #32
    //   214: goto -> 244
    //   217: bipush #58
    //   219: goto -> 244
    //   222: bipush #9
    //   224: goto -> 244
    //   227: bipush #17
    //   229: goto -> 244
    //   232: bipush #66
    //   234: goto -> 244
    //   237: bipush #50
    //   239: goto -> 244
    //   242: bipush #112
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
    //   300: sipush #4329
    //   303: sipush #19815
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zmhq.Zy : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: iconst_3
    //   323: bastore
    //   324: dup
    //   325: iconst_1
    //   326: bipush #124
    //   328: bastore
    //   329: dup
    //   330: iconst_2
    //   331: bipush #-57
    //   333: bastore
    //   334: dup
    //   335: iconst_3
    //   336: bipush #-111
    //   338: bastore
    //   339: dup
    //   340: iconst_4
    //   341: bipush #-4
    //   343: bastore
    //   344: dup
    //   345: iconst_5
    //   346: bipush #-24
    //   348: bastore
    //   349: dup
    //   350: bipush #6
    //   352: iconst_1
    //   353: bastore
    //   354: dup
    //   355: bipush #7
    //   357: bipush #-18
    //   359: bastore
    //   360: dup
    //   361: bipush #8
    //   363: bipush #42
    //   365: bastore
    //   366: dup
    //   367: bipush #9
    //   369: bipush #-13
    //   371: bastore
    //   372: dup
    //   373: bipush #10
    //   375: bipush #90
    //   377: bastore
    //   378: dup
    //   379: bipush #11
    //   381: bipush #-102
    //   383: bastore
    //   384: dup
    //   385: bipush #12
    //   387: bipush #-91
    //   389: bastore
    //   390: dup
    //   391: bipush #13
    //   393: bipush #126
    //   395: bastore
    //   396: dup
    //   397: bipush #14
    //   399: bipush #123
    //   401: bastore
    //   402: dup
    //   403: bipush #15
    //   405: bipush #49
    //   407: bastore
    //   408: dup
    //   409: bipush #16
    //   411: bipush #114
    //   413: bastore
    //   414: dup
    //   415: bipush #17
    //   417: bipush #-75
    //   419: bastore
    //   420: dup
    //   421: bipush #18
    //   423: bipush #46
    //   425: bastore
    //   426: dup
    //   427: bipush #19
    //   429: bipush #8
    //   431: bastore
    //   432: dup
    //   433: bipush #20
    //   435: bipush #116
    //   437: bastore
    //   438: dup
    //   439: bipush #21
    //   441: bipush #-48
    //   443: bastore
    //   444: dup
    //   445: bipush #22
    //   447: bipush #-14
    //   449: bastore
    //   450: dup
    //   451: bipush #23
    //   453: bipush #43
    //   455: bastore
    //   456: dup
    //   457: bipush #24
    //   459: bipush #34
    //   461: bastore
    //   462: dup
    //   463: bipush #25
    //   465: bipush #60
    //   467: bastore
    //   468: dup
    //   469: bipush #26
    //   471: bipush #-105
    //   473: bastore
    //   474: dup
    //   475: bipush #27
    //   477: bipush #48
    //   479: bastore
    //   480: dup
    //   481: bipush #28
    //   483: bipush #120
    //   485: bastore
    //   486: dup
    //   487: bipush #29
    //   489: bipush #120
    //   491: bastore
    //   492: dup
    //   493: bipush #30
    //   495: bipush #-61
    //   497: bastore
    //   498: dup
    //   499: bipush #31
    //   501: bipush #52
    //   503: bastore
    //   504: invokespecial <init> : ([B)V
    //   507: putstatic burp/Zmhq.ZK : Ljava/lang/Object;
    //   510: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x10EA) & 0xFFFF;
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
      byte b1 = 39;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmhq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */