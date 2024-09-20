package burp;

import java.math.BigInteger;

class Zbf9 extends ClassLoader {
  static String Zp;
  
  static Object ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZE(Object paramObject) {
    Zg8.ZE = a(19004, -14798);
    Zg8.ZX = new BigInteger(a(18992, 21777));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zr64.Zj.charAt(Math.abs(((BigInteger)Zm3s.ZW).intValue() % 32)) <= Zgh3.ZR.charAt(Math.abs(((BigInteger)Zb9d.Ze).intValue() % 32))) {
          try {
            Ztjh.Zy(Class.forName(a(19007, 21129)));
            if (bool)
              Zstf.Zz(Class.forName(a(19003, -12341))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zstf.Zz(Class.forName(a(19003, -12341)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZG(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zebu.ZI : Ljava/lang/String;
    //   172: getstatic burp/Ztvn.Zl : Ljava/lang/Object;
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
    //   206: getstatic burp/Ztvn.ZU : Ljava/lang/String;
    //   209: getstatic burp/Zkw.ZY : Ljava/lang/Object;
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
    //   243: getstatic burp/Ztvn.ZU : Ljava/lang/String;
    //   246: getstatic burp/Zgk1.ZD : Ljava/lang/Object;
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
    //   280: getstatic burp/Zkor.Za : Ljava/lang/String;
    //   283: getstatic burp/Zgil.ZG : Ljava/lang/Object;
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
    //   317: getstatic burp/Zeyd.Zr : Ljava/lang/String;
    //   320: getstatic burp/Zeoa.ZF : Ljava/lang/Object;
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
    //   354: getstatic burp/Zssb.ZY : Ljava/lang/String;
    //   357: getstatic burp/Zbf9.ZC : Ljava/lang/Object;
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
    //   391: getstatic burp/Zge1.Zx : Ljava/lang/String;
    //   394: getstatic burp/Zlfg.Zv : Ljava/lang/Object;
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
    //   428: getstatic burp/Zep1.ZQ : Ljava/lang/String;
    //   431: getstatic burp/Zx0t.Zt : Ljava/lang/Object;
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
    //   465: getstatic burp/Zm0v.Zd : Ljava/lang/String;
    //   468: getstatic burp/Zm7y.Zr : Ljava/lang/Object;
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
    //   502: getstatic burp/Ztgt.ZQ : Ljava/lang/String;
    //   505: getstatic burp/Zlqm.Zw : Ljava/lang/Object;
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
    //   539: getstatic burp/Zlfg.Zb : Ljava/lang/String;
    //   542: getstatic burp/Zl8l.ZJ : Ljava/lang/Object;
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
    //   576: getstatic burp/Zxti.ZD : Ljava/lang/String;
    //   579: getstatic burp/Zgz1.ZX : Ljava/lang/Object;
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
    //   613: getstatic burp/Zltp.ZY : Ljava/lang/String;
    //   616: getstatic burp/Ztvn.Zl : Ljava/lang/Object;
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
    //   650: getstatic burp/Zgx6.ZX : Ljava/lang/String;
    //   653: getstatic burp/Zbf9.ZC : Ljava/lang/Object;
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
    //   687: getstatic burp/Zs4v.Za : Ljava/lang/String;
    //   690: getstatic burp/Zmou.ZT : Ljava/lang/Object;
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
    //   724: getstatic burp/Zsvh.ZV : Ljava/lang/String;
    //   727: getstatic burp/Zsvh.Zv : Ljava/lang/Object;
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
    //   761: getstatic burp/Zlhk.Zb : Ljava/lang/String;
    //   764: getstatic burp/Zgk1.ZD : Ljava/lang/Object;
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
    //   798: getstatic burp/Zlqy.ZZ : Ljava/lang/String;
    //   801: getstatic burp/Zmpv.ZI : Ljava/lang/Object;
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
    //   835: getstatic burp/Zge1.Zx : Ljava/lang/String;
    //   838: getstatic burp/Zkw.ZY : Ljava/lang/Object;
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
    //   872: getstatic burp/Zxzt.ZG : Ljava/lang/String;
    //   875: getstatic burp/Zbu6.ZJ : Ljava/lang/Object;
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
    //   909: getstatic burp/Zl55.Zp : Ljava/lang/String;
    //   912: getstatic burp/Zrc0.Zz : Ljava/lang/Object;
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
    //   946: getstatic burp/Zmcb.Zl : Ljava/lang/String;
    //   949: getstatic burp/Zl8l.ZJ : Ljava/lang/Object;
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
    //   983: getstatic burp/Zmou.ZP : Ljava/lang/String;
    //   986: getstatic burp/Zr64.ZN : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zs4v.Za : Ljava/lang/String;
    //   1023: getstatic burp/Zsq6.ZS : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zlqy.ZZ : Ljava/lang/String;
    //   1060: getstatic burp/Zgz1.ZX : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zkw.ZU : Ljava/lang/String;
    //   1097: getstatic burp/Zb9d.Ze : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zmou.ZP : Ljava/lang/String;
    //   1134: getstatic burp/Zg_i.ZQ : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zbu6.ZQ : Ljava/lang/String;
    //   1171: getstatic burp/Zgh3.ZZ : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zg3v.Zt : Ljava/lang/String;
    //   1208: getstatic burp/Zrqd.Zi : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zgil.ZK : Ljava/lang/String;
    //   1245: getstatic burp/Zsvh.Zv : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zkup.Zr : Ljava/lang/String;
    //   1282: getstatic burp/Zzx8.Zi : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zxzt.ZG : Ljava/lang/String;
    //   1319: getstatic burp/Zeoa.ZF : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zsq6.Zm : Ljava/lang/String;
    //   1362: getstatic burp/Zgx6.Zo : Ljava/lang/Object;
    //   1365: checkcast java/math/BigInteger
    //   1368: invokevirtual toByteArray : ()[B
    //   1371: astore #4
    //   1373: aload #4
    //   1375: arraylength
    //   1376: bipush #8
    //   1378: iadd
    //   1379: bipush #6
    //   1381: ishr
    //   1382: iconst_1
    //   1383: iadd
    //   1384: bipush #16
    //   1386: imul
    //   1387: newarray int
    //   1389: astore #6
    //   1391: iconst_0
    //   1392: istore #7
    //   1394: iload #7
    //   1396: aload #4
    //   1398: arraylength
    //   1399: if_icmpge -> 1443
    //   1402: aload #4
    //   1404: iload #7
    //   1406: baload
    //   1407: sipush #255
    //   1410: iand
    //   1411: istore #8
    //   1413: aload #6
    //   1415: iload #7
    //   1417: iconst_2
    //   1418: ishr
    //   1419: dup2
    //   1420: iaload
    //   1421: iload #8
    //   1423: bipush #24
    //   1425: iload #7
    //   1427: iconst_4
    //   1428: irem
    //   1429: bipush #8
    //   1431: imul
    //   1432: isub
    //   1433: ishl
    //   1434: ior
    //   1435: iastore
    //   1436: iinc #7, 1
    //   1439: iload_2
    //   1440: ifne -> 1394
    //   1443: aload #6
    //   1445: iload #7
    //   1447: iconst_2
    //   1448: ishr
    //   1449: dup2
    //   1450: iaload
    //   1451: sipush #128
    //   1454: bipush #24
    //   1456: iload #7
    //   1458: iconst_4
    //   1459: irem
    //   1460: bipush #8
    //   1462: imul
    //   1463: isub
    //   1464: ishl
    //   1465: ior
    //   1466: iastore
    //   1467: aload #6
    //   1469: aload #6
    //   1471: arraylength
    //   1472: iconst_1
    //   1473: isub
    //   1474: aload #4
    //   1476: arraylength
    //   1477: bipush #8
    //   1479: imul
    //   1480: iastore
    //   1481: bipush #80
    //   1483: newarray int
    //   1485: astore #8
    //   1487: ldc 1732584193
    //   1489: istore #9
    //   1491: ldc -271733879
    //   1493: istore #10
    //   1495: ldc -1732584194
    //   1497: istore #11
    //   1499: ldc 271733878
    //   1501: istore #12
    //   1503: ldc -1009589776
    //   1505: istore #13
    //   1507: iconst_0
    //   1508: istore #7
    //   1510: iload #7
    //   1512: aload #6
    //   1514: arraylength
    //   1515: if_icmpge -> 1837
    //   1518: iload #9
    //   1520: istore #14
    //   1522: iload #10
    //   1524: istore #15
    //   1526: iload #11
    //   1528: istore #16
    //   1530: iload #12
    //   1532: istore #17
    //   1534: iload #13
    //   1536: istore #18
    //   1538: iconst_0
    //   1539: istore #19
    //   1541: iload #19
    //   1543: bipush #80
    //   1545: if_icmpge -> 1795
    //   1548: iload #19
    //   1550: bipush #16
    //   1552: if_icmpge -> 1579
    //   1555: aload #8
    //   1557: iload #19
    //   1559: aload #6
    //   1561: iload #7
    //   1563: iload #19
    //   1565: iadd
    //   1566: iaload
    //   1567: iastore
    //   1568: iload_2
    //   1569: ifne -> 1634
    //   1572: goto -> 1579
    //   1575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1578: athrow
    //   1579: aload #8
    //   1581: iload #19
    //   1583: iconst_3
    //   1584: isub
    //   1585: iaload
    //   1586: aload #8
    //   1588: iload #19
    //   1590: bipush #8
    //   1592: isub
    //   1593: iaload
    //   1594: ixor
    //   1595: aload #8
    //   1597: iload #19
    //   1599: bipush #14
    //   1601: isub
    //   1602: iaload
    //   1603: ixor
    //   1604: aload #8
    //   1606: iload #19
    //   1608: bipush #16
    //   1610: isub
    //   1611: iaload
    //   1612: ixor
    //   1613: istore #20
    //   1615: iload #20
    //   1617: iconst_1
    //   1618: ishl
    //   1619: iload #20
    //   1621: bipush #31
    //   1623: iushr
    //   1624: ior
    //   1625: istore #21
    //   1627: aload #8
    //   1629: iload #19
    //   1631: iload #21
    //   1633: iastore
    //   1634: iload #9
    //   1636: iconst_5
    //   1637: ishl
    //   1638: iload #9
    //   1640: bipush #27
    //   1642: iushr
    //   1643: ior
    //   1644: istore #20
    //   1646: iload #20
    //   1648: iload #13
    //   1650: iadd
    //   1651: aload #8
    //   1653: iload #19
    //   1655: iaload
    //   1656: iadd
    //   1657: iload #19
    //   1659: bipush #20
    //   1661: if_icmpge -> 1687
    //   1664: ldc 1518500249
    //   1666: iload #10
    //   1668: iload #11
    //   1670: iand
    //   1671: iload #10
    //   1673: iconst_m1
    //   1674: ixor
    //   1675: iload #12
    //   1677: iand
    //   1678: ior
    //   1679: iadd
    //   1680: goto -> 1757
    //   1683: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1686: athrow
    //   1687: iload #19
    //   1689: bipush #40
    //   1691: if_icmpge -> 1712
    //   1694: ldc 1859775393
    //   1696: iload #10
    //   1698: iload #11
    //   1700: ixor
    //   1701: iload #12
    //   1703: ixor
    //   1704: iadd
    //   1705: goto -> 1757
    //   1708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1711: athrow
    //   1712: iload #19
    //   1714: bipush #60
    //   1716: if_icmpge -> 1746
    //   1719: ldc -1894007588
    //   1721: iload #10
    //   1723: iload #11
    //   1725: iand
    //   1726: iload #10
    //   1728: iload #12
    //   1730: iand
    //   1731: ior
    //   1732: iload #11
    //   1734: iload #12
    //   1736: iand
    //   1737: ior
    //   1738: iadd
    //   1739: goto -> 1757
    //   1742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1745: athrow
    //   1746: ldc -899497514
    //   1748: iload #10
    //   1750: iload #11
    //   1752: ixor
    //   1753: iload #12
    //   1755: ixor
    //   1756: iadd
    //   1757: iadd
    //   1758: istore #21
    //   1760: iload #12
    //   1762: istore #13
    //   1764: iload #11
    //   1766: istore #12
    //   1768: iload #10
    //   1770: bipush #30
    //   1772: ishl
    //   1773: iload #10
    //   1775: iconst_2
    //   1776: iushr
    //   1777: ior
    //   1778: istore #11
    //   1780: iload #9
    //   1782: istore #10
    //   1784: iload #21
    //   1786: istore #9
    //   1788: iinc #19, 1
    //   1791: iload_2
    //   1792: ifne -> 1541
    //   1795: iload #9
    //   1797: iload #14
    //   1799: iadd
    //   1800: istore #9
    //   1802: iload #10
    //   1804: iload #15
    //   1806: iadd
    //   1807: istore #10
    //   1809: iload #11
    //   1811: iload #16
    //   1813: iadd
    //   1814: istore #11
    //   1816: iload #12
    //   1818: iload #17
    //   1820: iadd
    //   1821: istore #12
    //   1823: iload #13
    //   1825: iload #18
    //   1827: iadd
    //   1828: istore #13
    //   1830: iinc #7, 16
    //   1833: iload_2
    //   1834: ifne -> 1510
    //   1837: iconst_5
    //   1838: newarray int
    //   1840: dup
    //   1841: iconst_0
    //   1842: iload #9
    //   1844: iastore
    //   1845: dup
    //   1846: iconst_1
    //   1847: iload #10
    //   1849: iastore
    //   1850: dup
    //   1851: iconst_2
    //   1852: iload #11
    //   1854: iastore
    //   1855: dup
    //   1856: iconst_3
    //   1857: iload #12
    //   1859: iastore
    //   1860: dup
    //   1861: iconst_4
    //   1862: iload #13
    //   1864: iastore
    //   1865: astore #14
    //   1867: bipush #20
    //   1869: newarray byte
    //   1871: astore #15
    //   1873: iconst_0
    //   1874: istore #16
    //   1876: iload #16
    //   1878: bipush #20
    //   1880: if_icmpge -> 1921
    //   1883: aload #14
    //   1885: iload #16
    //   1887: iconst_4
    //   1888: idiv
    //   1889: iaload
    //   1890: istore #17
    //   1892: iconst_3
    //   1893: iload #16
    //   1895: iconst_4
    //   1896: irem
    //   1897: isub
    //   1898: bipush #8
    //   1900: imul
    //   1901: istore #18
    //   1903: aload #15
    //   1905: iload #16
    //   1907: iload #17
    //   1909: iload #18
    //   1911: iushr
    //   1912: i2b
    //   1913: bastore
    //   1914: iinc #16, 1
    //   1917: iload_2
    //   1918: ifne -> 1876
    //   1921: aload #15
    //   1923: astore #5
    //   1925: sipush #18995
    //   1928: new java/math/BigInteger
    //   1931: dup
    //   1932: aload #5
    //   1934: invokespecial <init> : ([B)V
    //   1937: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1940: putstatic burp/Zbf9.ZC : Ljava/lang/Object;
    //   1943: sipush #-11583
    //   1946: getstatic burp/Zk7b.ZR : Ljava/lang/Object;
    //   1949: checkcast java/math/BigInteger
    //   1952: getstatic burp/Zeoa.ZF : Ljava/lang/Object;
    //   1955: checkcast java/math/BigInteger
    //   1958: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1961: putstatic burp/Zluk.Zz : Ljava/lang/Object;
    //   1964: invokestatic a : (II)Ljava/lang/String;
    //   1967: iconst_1
    //   1968: ldc burp/Zelc
    //   1970: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1973: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1976: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1979: astore #4
    //   1981: aload #4
    //   1983: arraylength
    //   1984: istore #5
    //   1986: iconst_0
    //   1987: istore #6
    //   1989: iload #6
    //   1991: iload #5
    //   1993: if_icmpge -> 2131
    //   1996: aload #4
    //   1998: iload #6
    //   2000: aaload
    //   2001: astore #7
    //   2003: aload #7
    //   2005: invokevirtual getModifiers : ()I
    //   2008: invokestatic isStatic : (I)Z
    //   2011: ifne -> 2021
    //   2014: goto -> 2124
    //   2017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2020: athrow
    //   2021: aload #7
    //   2023: invokevirtual getType : ()Ljava/lang/Class;
    //   2026: astore #8
    //   2028: aload #8
    //   2030: ifnull -> 2111
    //   2033: aload #8
    //   2035: invokevirtual isPrimitive : ()Z
    //   2038: ifne -> 2111
    //   2041: goto -> 2048
    //   2044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2047: athrow
    //   2048: aload #8
    //   2050: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2053: ifnull -> 2111
    //   2056: goto -> 2063
    //   2059: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2062: athrow
    //   2063: aload #8
    //   2065: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2068: invokevirtual getName : ()Ljava/lang/String;
    //   2071: ifnull -> 2111
    //   2074: goto -> 2081
    //   2077: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2080: athrow
    //   2081: aload #8
    //   2083: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2086: invokevirtual getName : ()Ljava/lang/String;
    //   2089: sipush #18986
    //   2092: sipush #-19735
    //   2095: invokestatic a : (II)Ljava/lang/String;
    //   2098: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2101: ifne -> 2111
    //   2104: goto -> 2111
    //   2107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2110: athrow
    //   2111: aload #7
    //   2113: iconst_1
    //   2114: invokevirtual setAccessible : (Z)V
    //   2117: aload #7
    //   2119: aconst_null
    //   2120: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2123: pop
    //   2124: iinc #6, 1
    //   2127: iload_2
    //   2128: ifne -> 1989
    //   2131: sipush #18994
    //   2134: sipush #-6375
    //   2137: invokestatic a : (II)Ljava/lang/String;
    //   2140: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2143: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2146: astore #4
    //   2148: aload #4
    //   2150: arraylength
    //   2151: istore #5
    //   2153: iconst_0
    //   2154: istore #6
    //   2156: iload #6
    //   2158: iload #5
    //   2160: if_icmpge -> 2293
    //   2163: aload #4
    //   2165: iload #6
    //   2167: aaload
    //   2168: astore #7
    //   2170: aload #7
    //   2172: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2175: pop
    //   2176: aload #7
    //   2178: invokevirtual getModifiers : ()I
    //   2181: invokestatic isStatic : (I)Z
    //   2184: ifeq -> 2279
    //   2187: aload #7
    //   2189: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2192: arraylength
    //   2193: iconst_2
    //   2194: if_icmpne -> 2279
    //   2197: goto -> 2204
    //   2200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2203: athrow
    //   2204: aload #7
    //   2206: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2209: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2212: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2215: ifeq -> 2279
    //   2218: goto -> 2225
    //   2221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2224: athrow
    //   2225: aload #7
    //   2227: iconst_1
    //   2228: invokevirtual setAccessible : (Z)V
    //   2231: aload #7
    //   2233: aconst_null
    //   2234: iconst_2
    //   2235: anewarray java/lang/Object
    //   2238: dup
    //   2239: iconst_0
    //   2240: aload_0
    //   2241: aastore
    //   2242: dup
    //   2243: iconst_1
    //   2244: aload_1
    //   2245: ifnonnull -> 2263
    //   2248: goto -> 2255
    //   2251: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2254: athrow
    //   2255: aload_1
    //   2256: goto -> 2270
    //   2259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2262: athrow
    //   2263: aload_1
    //   2264: checkcast [B
    //   2267: invokevirtual clone : ()Ljava/lang/Object;
    //   2270: aastore
    //   2271: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2274: pop
    //   2275: iload_2
    //   2276: ifne -> 2293
    //   2279: iinc #6, 1
    //   2282: iload_2
    //   2283: ifne -> 2156
    //   2286: goto -> 2293
    //   2289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2292: athrow
    //   2293: getstatic burp/Zmpv.ZI : Ljava/lang/Object;
    //   2296: checkcast java/math/BigInteger
    //   2299: invokevirtual intValue : ()I
    //   2302: i2l
    //   2303: invokestatic currentTimeMillis : ()J
    //   2306: ladd
    //   2307: getstatic burp/Zbf9.ZC : Ljava/lang/Object;
    //   2310: checkcast java/math/BigInteger
    //   2313: invokevirtual intValue : ()I
    //   2316: i2l
    //   2317: lcmp
    //   2318: ifge -> 2656
    //   2321: sipush #18979
    //   2324: sipush #-24510
    //   2327: invokestatic a : (II)Ljava/lang/String;
    //   2330: iconst_1
    //   2331: ldc burp/Zsn6
    //   2333: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2336: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2339: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2342: astore #4
    //   2344: aload #4
    //   2346: arraylength
    //   2347: istore #5
    //   2349: iconst_0
    //   2350: istore #6
    //   2352: iload #6
    //   2354: iload #5
    //   2356: if_icmpge -> 2494
    //   2359: aload #4
    //   2361: iload #6
    //   2363: aaload
    //   2364: astore #7
    //   2366: aload #7
    //   2368: invokevirtual getModifiers : ()I
    //   2371: invokestatic isStatic : (I)Z
    //   2374: ifne -> 2384
    //   2377: goto -> 2487
    //   2380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2383: athrow
    //   2384: aload #7
    //   2386: invokevirtual getType : ()Ljava/lang/Class;
    //   2389: astore #8
    //   2391: aload #8
    //   2393: ifnull -> 2474
    //   2396: aload #8
    //   2398: invokevirtual isPrimitive : ()Z
    //   2401: ifne -> 2474
    //   2404: goto -> 2411
    //   2407: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2410: athrow
    //   2411: aload #8
    //   2413: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2416: ifnull -> 2474
    //   2419: goto -> 2426
    //   2422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2425: athrow
    //   2426: aload #8
    //   2428: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2431: invokevirtual getName : ()Ljava/lang/String;
    //   2434: ifnull -> 2474
    //   2437: goto -> 2444
    //   2440: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2443: athrow
    //   2444: aload #8
    //   2446: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2449: invokevirtual getName : ()Ljava/lang/String;
    //   2452: sipush #18991
    //   2455: sipush #15507
    //   2458: invokestatic a : (II)Ljava/lang/String;
    //   2461: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2464: ifne -> 2474
    //   2467: goto -> 2474
    //   2470: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2473: athrow
    //   2474: aload #7
    //   2476: iconst_1
    //   2477: invokevirtual setAccessible : (Z)V
    //   2480: aload #7
    //   2482: aconst_null
    //   2483: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2486: pop
    //   2487: iinc #6, 1
    //   2490: iload_2
    //   2491: ifne -> 2352
    //   2494: sipush #18982
    //   2497: sipush #-781
    //   2500: invokestatic a : (II)Ljava/lang/String;
    //   2503: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2506: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2509: astore #4
    //   2511: aload #4
    //   2513: arraylength
    //   2514: istore #5
    //   2516: iconst_0
    //   2517: istore #6
    //   2519: iload #6
    //   2521: iload #5
    //   2523: if_icmpge -> 2656
    //   2526: aload #4
    //   2528: iload #6
    //   2530: aaload
    //   2531: astore #7
    //   2533: aload #7
    //   2535: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2538: pop
    //   2539: aload #7
    //   2541: invokevirtual getModifiers : ()I
    //   2544: invokestatic isStatic : (I)Z
    //   2547: ifeq -> 2642
    //   2550: aload #7
    //   2552: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2555: arraylength
    //   2556: iconst_2
    //   2557: if_icmpne -> 2642
    //   2560: goto -> 2567
    //   2563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2566: athrow
    //   2567: aload #7
    //   2569: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2572: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2575: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2578: ifeq -> 2642
    //   2581: goto -> 2588
    //   2584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2587: athrow
    //   2588: aload #7
    //   2590: iconst_1
    //   2591: invokevirtual setAccessible : (Z)V
    //   2594: aload #7
    //   2596: aconst_null
    //   2597: iconst_2
    //   2598: anewarray java/lang/Object
    //   2601: dup
    //   2602: iconst_0
    //   2603: aload_0
    //   2604: aastore
    //   2605: dup
    //   2606: iconst_1
    //   2607: aload_1
    //   2608: ifnonnull -> 2626
    //   2611: goto -> 2618
    //   2614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2617: athrow
    //   2618: aload_1
    //   2619: goto -> 2633
    //   2622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2625: athrow
    //   2626: aload_1
    //   2627: checkcast [B
    //   2630: invokevirtual clone : ()Ljava/lang/Object;
    //   2633: aastore
    //   2634: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2637: pop
    //   2638: iload_2
    //   2639: ifne -> 2656
    //   2642: iinc #6, 1
    //   2645: iload_2
    //   2646: ifne -> 2519
    //   2649: goto -> 2656
    //   2652: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2655: athrow
    //   2656: iconst_0
    //   2657: istore #4
    //   2659: getstatic burp/Zltp.ZY : Ljava/lang/String;
    //   2662: getstatic burp/Zvof.Zl : Ljava/lang/Object;
    //   2665: checkcast java/math/BigInteger
    //   2668: invokevirtual intValue : ()I
    //   2671: bipush #32
    //   2673: irem
    //   2674: invokestatic abs : (I)I
    //   2677: invokevirtual charAt : (I)C
    //   2680: getstatic burp/Zeyd.Zr : Ljava/lang/String;
    //   2683: getstatic burp/Zzi3.ZJ : Ljava/lang/Object;
    //   2686: checkcast java/math/BigInteger
    //   2689: invokevirtual intValue : ()I
    //   2692: bipush #32
    //   2694: irem
    //   2695: invokestatic abs : (I)I
    //   2698: invokevirtual charAt : (I)C
    //   2701: if_icmple -> 3046
    //   2704: sipush #18990
    //   2707: sipush #-31289
    //   2710: invokestatic a : (II)Ljava/lang/String;
    //   2713: iconst_1
    //   2714: ldc burp/Zs59
    //   2716: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2719: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2722: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2725: astore #5
    //   2727: aload #5
    //   2729: arraylength
    //   2730: istore #6
    //   2732: iconst_0
    //   2733: istore #7
    //   2735: iload #7
    //   2737: iload #6
    //   2739: if_icmpge -> 2877
    //   2742: aload #5
    //   2744: iload #7
    //   2746: aaload
    //   2747: astore #8
    //   2749: aload #8
    //   2751: invokevirtual getModifiers : ()I
    //   2754: invokestatic isStatic : (I)Z
    //   2757: ifne -> 2767
    //   2760: goto -> 2870
    //   2763: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2766: athrow
    //   2767: aload #8
    //   2769: invokevirtual getType : ()Ljava/lang/Class;
    //   2772: astore #9
    //   2774: aload #9
    //   2776: ifnull -> 2857
    //   2779: aload #9
    //   2781: invokevirtual isPrimitive : ()Z
    //   2784: ifne -> 2857
    //   2787: goto -> 2794
    //   2790: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2793: athrow
    //   2794: aload #9
    //   2796: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2799: ifnull -> 2857
    //   2802: goto -> 2809
    //   2805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2808: athrow
    //   2809: aload #9
    //   2811: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2814: invokevirtual getName : ()Ljava/lang/String;
    //   2817: ifnull -> 2857
    //   2820: goto -> 2827
    //   2823: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2826: athrow
    //   2827: aload #9
    //   2829: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2832: invokevirtual getName : ()Ljava/lang/String;
    //   2835: sipush #18991
    //   2838: sipush #15507
    //   2841: invokestatic a : (II)Ljava/lang/String;
    //   2844: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2847: ifne -> 2857
    //   2850: goto -> 2857
    //   2853: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2856: athrow
    //   2857: aload #8
    //   2859: iconst_1
    //   2860: invokevirtual setAccessible : (Z)V
    //   2863: aload #8
    //   2865: aconst_null
    //   2866: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2869: pop
    //   2870: iinc #7, 1
    //   2873: iload_2
    //   2874: ifne -> 2735
    //   2877: sipush #18985
    //   2880: sipush #-30907
    //   2883: invokestatic a : (II)Ljava/lang/String;
    //   2886: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2889: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2892: astore #5
    //   2894: aload #5
    //   2896: arraylength
    //   2897: istore #6
    //   2899: iconst_0
    //   2900: istore #7
    //   2902: iload #7
    //   2904: iload #6
    //   2906: if_icmpge -> 3043
    //   2909: aload #5
    //   2911: iload #7
    //   2913: aaload
    //   2914: astore #8
    //   2916: aload #8
    //   2918: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2921: pop
    //   2922: aload #8
    //   2924: invokevirtual getModifiers : ()I
    //   2927: invokestatic isStatic : (I)Z
    //   2930: ifeq -> 3029
    //   2933: aload #8
    //   2935: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2938: arraylength
    //   2939: iconst_2
    //   2940: if_icmpne -> 3029
    //   2943: goto -> 2950
    //   2946: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2949: athrow
    //   2950: aload #8
    //   2952: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2955: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2958: if_acmpne -> 3029
    //   2961: goto -> 2968
    //   2964: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2967: athrow
    //   2968: aload #8
    //   2970: iconst_1
    //   2971: invokevirtual setAccessible : (Z)V
    //   2974: aload #8
    //   2976: aconst_null
    //   2977: iconst_2
    //   2978: anewarray java/lang/Object
    //   2981: dup
    //   2982: iconst_0
    //   2983: aload_0
    //   2984: aastore
    //   2985: dup
    //   2986: iconst_1
    //   2987: aload_1
    //   2988: ifnonnull -> 3006
    //   2991: goto -> 2998
    //   2994: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2997: athrow
    //   2998: aload_1
    //   2999: goto -> 3013
    //   3002: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3005: athrow
    //   3006: aload_1
    //   3007: checkcast [B
    //   3010: invokevirtual clone : ()Ljava/lang/Object;
    //   3013: aastore
    //   3014: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3017: checkcast java/lang/Boolean
    //   3020: invokevirtual booleanValue : ()Z
    //   3023: istore #4
    //   3025: iload_2
    //   3026: ifne -> 3043
    //   3029: iinc #7, 1
    //   3032: iload_2
    //   3033: ifne -> 2902
    //   3036: goto -> 3043
    //   3039: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3042: athrow
    //   3043: goto -> 3385
    //   3046: sipush #18983
    //   3049: sipush #-23715
    //   3052: invokestatic a : (II)Ljava/lang/String;
    //   3055: iconst_1
    //   3056: ldc burp/Zlp8
    //   3058: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3061: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3064: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3067: astore #5
    //   3069: aload #5
    //   3071: arraylength
    //   3072: istore #6
    //   3074: iconst_0
    //   3075: istore #7
    //   3077: iload #7
    //   3079: iload #6
    //   3081: if_icmpge -> 3219
    //   3084: aload #5
    //   3086: iload #7
    //   3088: aaload
    //   3089: astore #8
    //   3091: aload #8
    //   3093: invokevirtual getModifiers : ()I
    //   3096: invokestatic isStatic : (I)Z
    //   3099: ifne -> 3109
    //   3102: goto -> 3212
    //   3105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3108: athrow
    //   3109: aload #8
    //   3111: invokevirtual getType : ()Ljava/lang/Class;
    //   3114: astore #9
    //   3116: aload #9
    //   3118: ifnull -> 3199
    //   3121: aload #9
    //   3123: invokevirtual isPrimitive : ()Z
    //   3126: ifne -> 3199
    //   3129: goto -> 3136
    //   3132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3135: athrow
    //   3136: aload #9
    //   3138: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3141: ifnull -> 3199
    //   3144: goto -> 3151
    //   3147: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3150: athrow
    //   3151: aload #9
    //   3153: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3156: invokevirtual getName : ()Ljava/lang/String;
    //   3159: ifnull -> 3199
    //   3162: goto -> 3169
    //   3165: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3168: athrow
    //   3169: aload #9
    //   3171: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3174: invokevirtual getName : ()Ljava/lang/String;
    //   3177: sipush #18991
    //   3180: sipush #15507
    //   3183: invokestatic a : (II)Ljava/lang/String;
    //   3186: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3189: ifne -> 3199
    //   3192: goto -> 3199
    //   3195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3198: athrow
    //   3199: aload #8
    //   3201: iconst_1
    //   3202: invokevirtual setAccessible : (Z)V
    //   3205: aload #8
    //   3207: aconst_null
    //   3208: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3211: pop
    //   3212: iinc #7, 1
    //   3215: iload_2
    //   3216: ifne -> 3077
    //   3219: sipush #19005
    //   3222: sipush #-146
    //   3225: invokestatic a : (II)Ljava/lang/String;
    //   3228: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3231: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3234: astore #5
    //   3236: aload #5
    //   3238: arraylength
    //   3239: istore #6
    //   3241: iconst_0
    //   3242: istore #7
    //   3244: iload #7
    //   3246: iload #6
    //   3248: if_icmpge -> 3385
    //   3251: aload #5
    //   3253: iload #7
    //   3255: aaload
    //   3256: astore #8
    //   3258: aload #8
    //   3260: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3263: pop
    //   3264: aload #8
    //   3266: invokevirtual getModifiers : ()I
    //   3269: invokestatic isStatic : (I)Z
    //   3272: ifeq -> 3371
    //   3275: aload #8
    //   3277: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3280: arraylength
    //   3281: iconst_2
    //   3282: if_icmpne -> 3371
    //   3285: goto -> 3292
    //   3288: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3291: athrow
    //   3292: aload #8
    //   3294: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3297: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3300: if_acmpne -> 3371
    //   3303: goto -> 3310
    //   3306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3309: athrow
    //   3310: aload #8
    //   3312: iconst_1
    //   3313: invokevirtual setAccessible : (Z)V
    //   3316: aload #8
    //   3318: aconst_null
    //   3319: iconst_2
    //   3320: anewarray java/lang/Object
    //   3323: dup
    //   3324: iconst_0
    //   3325: aload_0
    //   3326: aastore
    //   3327: dup
    //   3328: iconst_1
    //   3329: aload_1
    //   3330: ifnonnull -> 3348
    //   3333: goto -> 3340
    //   3336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3339: athrow
    //   3340: aload_1
    //   3341: goto -> 3355
    //   3344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3347: athrow
    //   3348: aload_1
    //   3349: checkcast [B
    //   3352: invokevirtual clone : ()Ljava/lang/Object;
    //   3355: aastore
    //   3356: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3359: checkcast java/lang/Boolean
    //   3362: invokevirtual booleanValue : ()Z
    //   3365: istore #4
    //   3367: iload_2
    //   3368: ifne -> 3385
    //   3371: iinc #7, 1
    //   3374: iload_2
    //   3375: ifne -> 3244
    //   3378: goto -> 3385
    //   3381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3384: athrow
    //   3385: iload #4
    //   3387: ifeq -> 3393
    //   3390: iload #4
    //   3392: ireturn
    //   3393: getstatic burp/Zlfg.Zb : Ljava/lang/String;
    //   3396: getstatic burp/Zk7b.ZR : Ljava/lang/Object;
    //   3399: checkcast java/math/BigInteger
    //   3402: invokevirtual intValue : ()I
    //   3405: bipush #32
    //   3407: irem
    //   3408: invokestatic abs : (I)I
    //   3411: invokevirtual charAt : (I)C
    //   3414: getstatic burp/Zxz_.Zb : Ljava/lang/String;
    //   3417: getstatic burp/Zlhk.ZD : Ljava/lang/Object;
    //   3420: checkcast java/math/BigInteger
    //   3423: invokevirtual intValue : ()I
    //   3426: bipush #32
    //   3428: irem
    //   3429: invokestatic abs : (I)I
    //   3432: invokevirtual charAt : (I)C
    //   3435: if_icmpgt -> 3781
    //   3438: sipush #18989
    //   3441: sipush #8865
    //   3444: invokestatic a : (II)Ljava/lang/String;
    //   3447: iconst_1
    //   3448: ldc burp/Zgja
    //   3450: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3453: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3456: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3459: astore #5
    //   3461: aload #5
    //   3463: arraylength
    //   3464: istore #6
    //   3466: iconst_0
    //   3467: istore #7
    //   3469: iload #7
    //   3471: iload #6
    //   3473: if_icmpge -> 3611
    //   3476: aload #5
    //   3478: iload #7
    //   3480: aaload
    //   3481: astore #8
    //   3483: aload #8
    //   3485: invokevirtual getModifiers : ()I
    //   3488: invokestatic isStatic : (I)Z
    //   3491: ifne -> 3501
    //   3494: goto -> 3604
    //   3497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3500: athrow
    //   3501: aload #8
    //   3503: invokevirtual getType : ()Ljava/lang/Class;
    //   3506: astore #9
    //   3508: aload #9
    //   3510: ifnull -> 3591
    //   3513: aload #9
    //   3515: invokevirtual isPrimitive : ()Z
    //   3518: ifne -> 3591
    //   3521: goto -> 3528
    //   3524: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3527: athrow
    //   3528: aload #9
    //   3530: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3533: ifnull -> 3591
    //   3536: goto -> 3543
    //   3539: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3542: athrow
    //   3543: aload #9
    //   3545: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3548: invokevirtual getName : ()Ljava/lang/String;
    //   3551: ifnull -> 3591
    //   3554: goto -> 3561
    //   3557: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3560: athrow
    //   3561: aload #9
    //   3563: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3566: invokevirtual getName : ()Ljava/lang/String;
    //   3569: sipush #18991
    //   3572: sipush #15507
    //   3575: invokestatic a : (II)Ljava/lang/String;
    //   3578: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3581: ifne -> 3591
    //   3584: goto -> 3591
    //   3587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3590: athrow
    //   3591: aload #8
    //   3593: iconst_1
    //   3594: invokevirtual setAccessible : (Z)V
    //   3597: aload #8
    //   3599: aconst_null
    //   3600: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3603: pop
    //   3604: iinc #7, 1
    //   3607: iload_2
    //   3608: ifne -> 3469
    //   3611: sipush #18980
    //   3614: sipush #19999
    //   3617: invokestatic a : (II)Ljava/lang/String;
    //   3620: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3623: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3626: astore #5
    //   3628: aload #5
    //   3630: arraylength
    //   3631: istore #6
    //   3633: iconst_0
    //   3634: istore #7
    //   3636: iload #7
    //   3638: iload #6
    //   3640: if_icmpge -> 3777
    //   3643: aload #5
    //   3645: iload #7
    //   3647: aaload
    //   3648: astore #8
    //   3650: aload #8
    //   3652: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3655: pop
    //   3656: aload #8
    //   3658: invokevirtual getModifiers : ()I
    //   3661: invokestatic isStatic : (I)Z
    //   3664: ifeq -> 3763
    //   3667: aload #8
    //   3669: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3672: arraylength
    //   3673: iconst_2
    //   3674: if_icmpne -> 3763
    //   3677: goto -> 3684
    //   3680: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3683: athrow
    //   3684: aload #8
    //   3686: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3689: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3692: if_acmpne -> 3763
    //   3695: goto -> 3702
    //   3698: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3701: athrow
    //   3702: aload #8
    //   3704: iconst_1
    //   3705: invokevirtual setAccessible : (Z)V
    //   3708: aload #8
    //   3710: aconst_null
    //   3711: iconst_2
    //   3712: anewarray java/lang/Object
    //   3715: dup
    //   3716: iconst_0
    //   3717: aload_0
    //   3718: aastore
    //   3719: dup
    //   3720: iconst_1
    //   3721: aload_1
    //   3722: ifnonnull -> 3740
    //   3725: goto -> 3732
    //   3728: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3731: athrow
    //   3732: aload_1
    //   3733: goto -> 3747
    //   3736: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3739: athrow
    //   3740: aload_1
    //   3741: checkcast [B
    //   3744: invokevirtual clone : ()Ljava/lang/Object;
    //   3747: aastore
    //   3748: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3751: checkcast java/lang/Boolean
    //   3754: invokevirtual booleanValue : ()Z
    //   3757: istore #4
    //   3759: iload_2
    //   3760: ifne -> 3777
    //   3763: iinc #7, 1
    //   3766: iload_2
    //   3767: ifne -> 3636
    //   3770: goto -> 3777
    //   3773: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3776: athrow
    //   3777: iload_2
    //   3778: ifne -> 4120
    //   3781: sipush #19006
    //   3784: sipush #28252
    //   3787: invokestatic a : (II)Ljava/lang/String;
    //   3790: iconst_1
    //   3791: ldc burp/Zgr1
    //   3793: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3796: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3799: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3802: astore #5
    //   3804: aload #5
    //   3806: arraylength
    //   3807: istore #6
    //   3809: iconst_0
    //   3810: istore #7
    //   3812: iload #7
    //   3814: iload #6
    //   3816: if_icmpge -> 3954
    //   3819: aload #5
    //   3821: iload #7
    //   3823: aaload
    //   3824: astore #8
    //   3826: aload #8
    //   3828: invokevirtual getModifiers : ()I
    //   3831: invokestatic isStatic : (I)Z
    //   3834: ifne -> 3844
    //   3837: goto -> 3947
    //   3840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3843: athrow
    //   3844: aload #8
    //   3846: invokevirtual getType : ()Ljava/lang/Class;
    //   3849: astore #9
    //   3851: aload #9
    //   3853: ifnull -> 3934
    //   3856: aload #9
    //   3858: invokevirtual isPrimitive : ()Z
    //   3861: ifne -> 3934
    //   3864: goto -> 3871
    //   3867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3870: athrow
    //   3871: aload #9
    //   3873: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3876: ifnull -> 3934
    //   3879: goto -> 3886
    //   3882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3885: athrow
    //   3886: aload #9
    //   3888: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3891: invokevirtual getName : ()Ljava/lang/String;
    //   3894: ifnull -> 3934
    //   3897: goto -> 3904
    //   3900: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3903: athrow
    //   3904: aload #9
    //   3906: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3909: invokevirtual getName : ()Ljava/lang/String;
    //   3912: sipush #18991
    //   3915: sipush #15507
    //   3918: invokestatic a : (II)Ljava/lang/String;
    //   3921: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3924: ifne -> 3934
    //   3927: goto -> 3934
    //   3930: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3933: athrow
    //   3934: aload #8
    //   3936: iconst_1
    //   3937: invokevirtual setAccessible : (Z)V
    //   3940: aload #8
    //   3942: aconst_null
    //   3943: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3946: pop
    //   3947: iinc #7, 1
    //   3950: iload_2
    //   3951: ifne -> 3812
    //   3954: sipush #18976
    //   3957: sipush #19783
    //   3960: invokestatic a : (II)Ljava/lang/String;
    //   3963: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3966: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3969: astore #5
    //   3971: aload #5
    //   3973: arraylength
    //   3974: istore #6
    //   3976: iconst_0
    //   3977: istore #7
    //   3979: iload #7
    //   3981: iload #6
    //   3983: if_icmpge -> 4120
    //   3986: aload #5
    //   3988: iload #7
    //   3990: aaload
    //   3991: astore #8
    //   3993: aload #8
    //   3995: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3998: pop
    //   3999: aload #8
    //   4001: invokevirtual getModifiers : ()I
    //   4004: invokestatic isStatic : (I)Z
    //   4007: ifeq -> 4106
    //   4010: aload #8
    //   4012: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4015: arraylength
    //   4016: iconst_2
    //   4017: if_icmpne -> 4106
    //   4020: goto -> 4027
    //   4023: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4026: athrow
    //   4027: aload #8
    //   4029: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4032: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4035: if_acmpne -> 4106
    //   4038: goto -> 4045
    //   4041: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4044: athrow
    //   4045: aload #8
    //   4047: iconst_1
    //   4048: invokevirtual setAccessible : (Z)V
    //   4051: aload #8
    //   4053: aconst_null
    //   4054: iconst_2
    //   4055: anewarray java/lang/Object
    //   4058: dup
    //   4059: iconst_0
    //   4060: aload_0
    //   4061: aastore
    //   4062: dup
    //   4063: iconst_1
    //   4064: aload_1
    //   4065: ifnonnull -> 4083
    //   4068: goto -> 4075
    //   4071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4074: athrow
    //   4075: aload_1
    //   4076: goto -> 4090
    //   4079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4082: athrow
    //   4083: aload_1
    //   4084: checkcast [B
    //   4087: invokevirtual clone : ()Ljava/lang/Object;
    //   4090: aastore
    //   4091: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4094: checkcast java/lang/Boolean
    //   4097: invokevirtual booleanValue : ()Z
    //   4100: istore #4
    //   4102: iload_2
    //   4103: ifne -> 4120
    //   4106: iinc #7, 1
    //   4109: iload_2
    //   4110: ifne -> 3979
    //   4113: goto -> 4120
    //   4116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4119: athrow
    //   4120: iload #4
    //   4122: ifeq -> 4128
    //   4125: iload #4
    //   4127: ireturn
    //   4128: getstatic burp/Zm3s.Ze : Ljava/lang/String;
    //   4131: getstatic burp/Ze0z.ZQ : Ljava/lang/Object;
    //   4134: checkcast java/math/BigInteger
    //   4137: invokevirtual intValue : ()I
    //   4140: bipush #32
    //   4142: irem
    //   4143: invokestatic abs : (I)I
    //   4146: invokevirtual charAt : (I)C
    //   4149: getstatic burp/Zltp.ZY : Ljava/lang/String;
    //   4152: getstatic burp/Zts_.ZH : Ljava/lang/Object;
    //   4155: checkcast java/math/BigInteger
    //   4158: invokevirtual intValue : ()I
    //   4161: bipush #32
    //   4163: irem
    //   4164: invokestatic abs : (I)I
    //   4167: invokevirtual charAt : (I)C
    //   4170: if_icmpgt -> 4516
    //   4173: sipush #18978
    //   4176: sipush #6803
    //   4179: invokestatic a : (II)Ljava/lang/String;
    //   4182: iconst_1
    //   4183: ldc burp/Zxyp
    //   4185: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4188: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4191: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4194: astore #5
    //   4196: aload #5
    //   4198: arraylength
    //   4199: istore #6
    //   4201: iconst_0
    //   4202: istore #7
    //   4204: iload #7
    //   4206: iload #6
    //   4208: if_icmpge -> 4346
    //   4211: aload #5
    //   4213: iload #7
    //   4215: aaload
    //   4216: astore #8
    //   4218: aload #8
    //   4220: invokevirtual getModifiers : ()I
    //   4223: invokestatic isStatic : (I)Z
    //   4226: ifne -> 4236
    //   4229: goto -> 4339
    //   4232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4235: athrow
    //   4236: aload #8
    //   4238: invokevirtual getType : ()Ljava/lang/Class;
    //   4241: astore #9
    //   4243: aload #9
    //   4245: ifnull -> 4326
    //   4248: aload #9
    //   4250: invokevirtual isPrimitive : ()Z
    //   4253: ifne -> 4326
    //   4256: goto -> 4263
    //   4259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4262: athrow
    //   4263: aload #9
    //   4265: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4268: ifnull -> 4326
    //   4271: goto -> 4278
    //   4274: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4277: athrow
    //   4278: aload #9
    //   4280: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4283: invokevirtual getName : ()Ljava/lang/String;
    //   4286: ifnull -> 4326
    //   4289: goto -> 4296
    //   4292: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4295: athrow
    //   4296: aload #9
    //   4298: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4301: invokevirtual getName : ()Ljava/lang/String;
    //   4304: sipush #18991
    //   4307: sipush #15507
    //   4310: invokestatic a : (II)Ljava/lang/String;
    //   4313: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4316: ifne -> 4326
    //   4319: goto -> 4326
    //   4322: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4325: athrow
    //   4326: aload #8
    //   4328: iconst_1
    //   4329: invokevirtual setAccessible : (Z)V
    //   4332: aload #8
    //   4334: aconst_null
    //   4335: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4338: pop
    //   4339: iinc #7, 1
    //   4342: iload_2
    //   4343: ifne -> 4204
    //   4346: sipush #18977
    //   4349: sipush #-4542
    //   4352: invokestatic a : (II)Ljava/lang/String;
    //   4355: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4358: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4361: astore #5
    //   4363: aload #5
    //   4365: arraylength
    //   4366: istore #6
    //   4368: iconst_0
    //   4369: istore #7
    //   4371: iload #7
    //   4373: iload #6
    //   4375: if_icmpge -> 4512
    //   4378: aload #5
    //   4380: iload #7
    //   4382: aaload
    //   4383: astore #8
    //   4385: aload #8
    //   4387: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4390: pop
    //   4391: aload #8
    //   4393: invokevirtual getModifiers : ()I
    //   4396: invokestatic isStatic : (I)Z
    //   4399: ifeq -> 4498
    //   4402: aload #8
    //   4404: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4407: arraylength
    //   4408: iconst_2
    //   4409: if_icmpne -> 4498
    //   4412: goto -> 4419
    //   4415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4418: athrow
    //   4419: aload #8
    //   4421: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4424: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4427: if_acmpne -> 4498
    //   4430: goto -> 4437
    //   4433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4436: athrow
    //   4437: aload #8
    //   4439: iconst_1
    //   4440: invokevirtual setAccessible : (Z)V
    //   4443: aload #8
    //   4445: aconst_null
    //   4446: iconst_2
    //   4447: anewarray java/lang/Object
    //   4450: dup
    //   4451: iconst_0
    //   4452: aload_0
    //   4453: aastore
    //   4454: dup
    //   4455: iconst_1
    //   4456: aload_1
    //   4457: ifnonnull -> 4475
    //   4460: goto -> 4467
    //   4463: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4466: athrow
    //   4467: aload_1
    //   4468: goto -> 4482
    //   4471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4474: athrow
    //   4475: aload_1
    //   4476: checkcast [B
    //   4479: invokevirtual clone : ()Ljava/lang/Object;
    //   4482: aastore
    //   4483: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4486: checkcast java/lang/Boolean
    //   4489: invokevirtual booleanValue : ()Z
    //   4492: istore #4
    //   4494: iload_2
    //   4495: ifne -> 4512
    //   4498: iinc #7, 1
    //   4501: iload_2
    //   4502: ifne -> 4371
    //   4505: goto -> 4512
    //   4508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4511: athrow
    //   4512: iload_2
    //   4513: ifne -> 4855
    //   4516: sipush #19000
    //   4519: sipush #-7005
    //   4522: invokestatic a : (II)Ljava/lang/String;
    //   4525: iconst_1
    //   4526: ldc burp/Zx58
    //   4528: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4531: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4534: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4537: astore #5
    //   4539: aload #5
    //   4541: arraylength
    //   4542: istore #6
    //   4544: iconst_0
    //   4545: istore #7
    //   4547: iload #7
    //   4549: iload #6
    //   4551: if_icmpge -> 4689
    //   4554: aload #5
    //   4556: iload #7
    //   4558: aaload
    //   4559: astore #8
    //   4561: aload #8
    //   4563: invokevirtual getModifiers : ()I
    //   4566: invokestatic isStatic : (I)Z
    //   4569: ifne -> 4579
    //   4572: goto -> 4682
    //   4575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4578: athrow
    //   4579: aload #8
    //   4581: invokevirtual getType : ()Ljava/lang/Class;
    //   4584: astore #9
    //   4586: aload #9
    //   4588: ifnull -> 4669
    //   4591: aload #9
    //   4593: invokevirtual isPrimitive : ()Z
    //   4596: ifne -> 4669
    //   4599: goto -> 4606
    //   4602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4605: athrow
    //   4606: aload #9
    //   4608: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4611: ifnull -> 4669
    //   4614: goto -> 4621
    //   4617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4620: athrow
    //   4621: aload #9
    //   4623: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4626: invokevirtual getName : ()Ljava/lang/String;
    //   4629: ifnull -> 4669
    //   4632: goto -> 4639
    //   4635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4638: athrow
    //   4639: aload #9
    //   4641: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4644: invokevirtual getName : ()Ljava/lang/String;
    //   4647: sipush #18991
    //   4650: sipush #15507
    //   4653: invokestatic a : (II)Ljava/lang/String;
    //   4656: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4659: ifne -> 4669
    //   4662: goto -> 4669
    //   4665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4668: athrow
    //   4669: aload #8
    //   4671: iconst_1
    //   4672: invokevirtual setAccessible : (Z)V
    //   4675: aload #8
    //   4677: aconst_null
    //   4678: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4681: pop
    //   4682: iinc #7, 1
    //   4685: iload_2
    //   4686: ifne -> 4547
    //   4689: sipush #19001
    //   4692: sipush #-19085
    //   4695: invokestatic a : (II)Ljava/lang/String;
    //   4698: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4701: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4704: astore #5
    //   4706: aload #5
    //   4708: arraylength
    //   4709: istore #6
    //   4711: iconst_0
    //   4712: istore #7
    //   4714: iload #7
    //   4716: iload #6
    //   4718: if_icmpge -> 4855
    //   4721: aload #5
    //   4723: iload #7
    //   4725: aaload
    //   4726: astore #8
    //   4728: aload #8
    //   4730: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4733: pop
    //   4734: aload #8
    //   4736: invokevirtual getModifiers : ()I
    //   4739: invokestatic isStatic : (I)Z
    //   4742: ifeq -> 4841
    //   4745: aload #8
    //   4747: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4750: arraylength
    //   4751: iconst_2
    //   4752: if_icmpne -> 4841
    //   4755: goto -> 4762
    //   4758: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4761: athrow
    //   4762: aload #8
    //   4764: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4767: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4770: if_acmpne -> 4841
    //   4773: goto -> 4780
    //   4776: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4779: athrow
    //   4780: aload #8
    //   4782: iconst_1
    //   4783: invokevirtual setAccessible : (Z)V
    //   4786: aload #8
    //   4788: aconst_null
    //   4789: iconst_2
    //   4790: anewarray java/lang/Object
    //   4793: dup
    //   4794: iconst_0
    //   4795: aload_0
    //   4796: aastore
    //   4797: dup
    //   4798: iconst_1
    //   4799: aload_1
    //   4800: ifnonnull -> 4818
    //   4803: goto -> 4810
    //   4806: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4809: athrow
    //   4810: aload_1
    //   4811: goto -> 4825
    //   4814: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4817: athrow
    //   4818: aload_1
    //   4819: checkcast [B
    //   4822: invokevirtual clone : ()Ljava/lang/Object;
    //   4825: aastore
    //   4826: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4829: checkcast java/lang/Boolean
    //   4832: invokevirtual booleanValue : ()Z
    //   4835: istore #4
    //   4837: iload_2
    //   4838: ifne -> 4855
    //   4841: iinc #7, 1
    //   4844: iload_2
    //   4845: ifne -> 4714
    //   4848: goto -> 4855
    //   4851: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4854: athrow
    //   4855: iload #4
    //   4857: ifeq -> 4863
    //   4860: iload #4
    //   4862: ireturn
    //   4863: getstatic burp/Zgz2.ZI : Ljava/lang/String;
    //   4866: getstatic burp/Zmpv.ZI : Ljava/lang/Object;
    //   4869: checkcast java/math/BigInteger
    //   4872: invokevirtual intValue : ()I
    //   4875: bipush #32
    //   4877: irem
    //   4878: invokestatic abs : (I)I
    //   4881: invokevirtual charAt : (I)C
    //   4884: getstatic burp/Zbf9.Zp : Ljava/lang/String;
    //   4887: getstatic burp/Zm6g.ZO : Ljava/lang/Object;
    //   4890: checkcast java/math/BigInteger
    //   4893: invokevirtual intValue : ()I
    //   4896: bipush #32
    //   4898: irem
    //   4899: invokestatic abs : (I)I
    //   4902: invokevirtual charAt : (I)C
    //   4905: if_icmple -> 5251
    //   4908: sipush #19002
    //   4911: sipush #-15346
    //   4914: invokestatic a : (II)Ljava/lang/String;
    //   4917: iconst_1
    //   4918: ldc burp/Zrnw
    //   4920: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4923: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4926: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4929: astore #5
    //   4931: aload #5
    //   4933: arraylength
    //   4934: istore #6
    //   4936: iconst_0
    //   4937: istore #7
    //   4939: iload #7
    //   4941: iload #6
    //   4943: if_icmpge -> 5081
    //   4946: aload #5
    //   4948: iload #7
    //   4950: aaload
    //   4951: astore #8
    //   4953: aload #8
    //   4955: invokevirtual getModifiers : ()I
    //   4958: invokestatic isStatic : (I)Z
    //   4961: ifne -> 4971
    //   4964: goto -> 5074
    //   4967: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4970: athrow
    //   4971: aload #8
    //   4973: invokevirtual getType : ()Ljava/lang/Class;
    //   4976: astore #9
    //   4978: aload #9
    //   4980: ifnull -> 5061
    //   4983: aload #9
    //   4985: invokevirtual isPrimitive : ()Z
    //   4988: ifne -> 5061
    //   4991: goto -> 4998
    //   4994: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4997: athrow
    //   4998: aload #9
    //   5000: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5003: ifnull -> 5061
    //   5006: goto -> 5013
    //   5009: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5012: athrow
    //   5013: aload #9
    //   5015: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5018: invokevirtual getName : ()Ljava/lang/String;
    //   5021: ifnull -> 5061
    //   5024: goto -> 5031
    //   5027: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5030: athrow
    //   5031: aload #9
    //   5033: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5036: invokevirtual getName : ()Ljava/lang/String;
    //   5039: sipush #18991
    //   5042: sipush #15507
    //   5045: invokestatic a : (II)Ljava/lang/String;
    //   5048: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5051: ifne -> 5061
    //   5054: goto -> 5061
    //   5057: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5060: athrow
    //   5061: aload #8
    //   5063: iconst_1
    //   5064: invokevirtual setAccessible : (Z)V
    //   5067: aload #8
    //   5069: aconst_null
    //   5070: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5073: pop
    //   5074: iinc #7, 1
    //   5077: iload_2
    //   5078: ifne -> 4939
    //   5081: sipush #18987
    //   5084: sipush #-9372
    //   5087: invokestatic a : (II)Ljava/lang/String;
    //   5090: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5093: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5096: astore #5
    //   5098: aload #5
    //   5100: arraylength
    //   5101: istore #6
    //   5103: iconst_0
    //   5104: istore #7
    //   5106: iload #7
    //   5108: iload #6
    //   5110: if_icmpge -> 5247
    //   5113: aload #5
    //   5115: iload #7
    //   5117: aaload
    //   5118: astore #8
    //   5120: aload #8
    //   5122: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5125: pop
    //   5126: aload #8
    //   5128: invokevirtual getModifiers : ()I
    //   5131: invokestatic isStatic : (I)Z
    //   5134: ifeq -> 5233
    //   5137: aload #8
    //   5139: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5142: arraylength
    //   5143: iconst_2
    //   5144: if_icmpne -> 5233
    //   5147: goto -> 5154
    //   5150: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5153: athrow
    //   5154: aload #8
    //   5156: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5159: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5162: if_acmpne -> 5233
    //   5165: goto -> 5172
    //   5168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5171: athrow
    //   5172: aload #8
    //   5174: iconst_1
    //   5175: invokevirtual setAccessible : (Z)V
    //   5178: aload #8
    //   5180: aconst_null
    //   5181: iconst_2
    //   5182: anewarray java/lang/Object
    //   5185: dup
    //   5186: iconst_0
    //   5187: aload_0
    //   5188: aastore
    //   5189: dup
    //   5190: iconst_1
    //   5191: aload_1
    //   5192: ifnonnull -> 5210
    //   5195: goto -> 5202
    //   5198: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5201: athrow
    //   5202: aload_1
    //   5203: goto -> 5217
    //   5206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5209: athrow
    //   5210: aload_1
    //   5211: checkcast [B
    //   5214: invokevirtual clone : ()Ljava/lang/Object;
    //   5217: aastore
    //   5218: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5221: checkcast java/lang/Boolean
    //   5224: invokevirtual booleanValue : ()Z
    //   5227: istore #4
    //   5229: iload_2
    //   5230: ifne -> 5247
    //   5233: iinc #7, 1
    //   5236: iload_2
    //   5237: ifne -> 5106
    //   5240: goto -> 5247
    //   5243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5246: athrow
    //   5247: iload_2
    //   5248: ifne -> 5590
    //   5251: sipush #18993
    //   5254: sipush #-16945
    //   5257: invokestatic a : (II)Ljava/lang/String;
    //   5260: iconst_1
    //   5261: ldc burp/Zsf7
    //   5263: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5266: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5269: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5272: astore #5
    //   5274: aload #5
    //   5276: arraylength
    //   5277: istore #6
    //   5279: iconst_0
    //   5280: istore #7
    //   5282: iload #7
    //   5284: iload #6
    //   5286: if_icmpge -> 5424
    //   5289: aload #5
    //   5291: iload #7
    //   5293: aaload
    //   5294: astore #8
    //   5296: aload #8
    //   5298: invokevirtual getModifiers : ()I
    //   5301: invokestatic isStatic : (I)Z
    //   5304: ifne -> 5314
    //   5307: goto -> 5417
    //   5310: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5313: athrow
    //   5314: aload #8
    //   5316: invokevirtual getType : ()Ljava/lang/Class;
    //   5319: astore #9
    //   5321: aload #9
    //   5323: ifnull -> 5404
    //   5326: aload #9
    //   5328: invokevirtual isPrimitive : ()Z
    //   5331: ifne -> 5404
    //   5334: goto -> 5341
    //   5337: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5340: athrow
    //   5341: aload #9
    //   5343: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5346: ifnull -> 5404
    //   5349: goto -> 5356
    //   5352: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5355: athrow
    //   5356: aload #9
    //   5358: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5361: invokevirtual getName : ()Ljava/lang/String;
    //   5364: ifnull -> 5404
    //   5367: goto -> 5374
    //   5370: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5373: athrow
    //   5374: aload #9
    //   5376: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5379: invokevirtual getName : ()Ljava/lang/String;
    //   5382: sipush #18991
    //   5385: sipush #15507
    //   5388: invokestatic a : (II)Ljava/lang/String;
    //   5391: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5394: ifne -> 5404
    //   5397: goto -> 5404
    //   5400: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5403: athrow
    //   5404: aload #8
    //   5406: iconst_1
    //   5407: invokevirtual setAccessible : (Z)V
    //   5410: aload #8
    //   5412: aconst_null
    //   5413: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5416: pop
    //   5417: iinc #7, 1
    //   5420: iload_2
    //   5421: ifne -> 5282
    //   5424: sipush #18988
    //   5427: sipush #-5259
    //   5430: invokestatic a : (II)Ljava/lang/String;
    //   5433: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5436: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5439: astore #5
    //   5441: aload #5
    //   5443: arraylength
    //   5444: istore #6
    //   5446: iconst_0
    //   5447: istore #7
    //   5449: iload #7
    //   5451: iload #6
    //   5453: if_icmpge -> 5590
    //   5456: aload #5
    //   5458: iload #7
    //   5460: aaload
    //   5461: astore #8
    //   5463: aload #8
    //   5465: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5468: pop
    //   5469: aload #8
    //   5471: invokevirtual getModifiers : ()I
    //   5474: invokestatic isStatic : (I)Z
    //   5477: ifeq -> 5576
    //   5480: aload #8
    //   5482: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5485: arraylength
    //   5486: iconst_2
    //   5487: if_icmpne -> 5576
    //   5490: goto -> 5497
    //   5493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5496: athrow
    //   5497: aload #8
    //   5499: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5502: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5505: if_acmpne -> 5576
    //   5508: goto -> 5515
    //   5511: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5514: athrow
    //   5515: aload #8
    //   5517: iconst_1
    //   5518: invokevirtual setAccessible : (Z)V
    //   5521: aload #8
    //   5523: aconst_null
    //   5524: iconst_2
    //   5525: anewarray java/lang/Object
    //   5528: dup
    //   5529: iconst_0
    //   5530: aload_0
    //   5531: aastore
    //   5532: dup
    //   5533: iconst_1
    //   5534: aload_1
    //   5535: ifnonnull -> 5553
    //   5538: goto -> 5545
    //   5541: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5544: athrow
    //   5545: aload_1
    //   5546: goto -> 5560
    //   5549: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5552: athrow
    //   5553: aload_1
    //   5554: checkcast [B
    //   5557: invokevirtual clone : ()Ljava/lang/Object;
    //   5560: aastore
    //   5561: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5564: checkcast java/lang/Boolean
    //   5567: invokevirtual booleanValue : ()Z
    //   5570: istore #4
    //   5572: iload_2
    //   5573: ifne -> 5590
    //   5576: iinc #7, 1
    //   5579: iload_2
    //   5580: ifne -> 5449
    //   5583: goto -> 5590
    //   5586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5589: athrow
    //   5590: iload #4
    //   5592: ireturn
    //   5593: astore_3
    //   5594: new java/lang/Exception
    //   5597: dup
    //   5598: aload_3
    //   5599: invokevirtual getMessage : ()Ljava/lang/String;
    //   5602: invokespecial <init> : (Ljava/lang/String;)V
    //   5605: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3392	5593	java/lang/Throwable
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
    //   1548	1572	1575	java/lang/Throwable
    //   1646	1683	1683	java/lang/Throwable
    //   1687	1708	1708	java/lang/Throwable
    //   1712	1742	1742	java/lang/Throwable
    //   2003	2017	2017	java/lang/Throwable
    //   2028	2041	2044	java/lang/Throwable
    //   2033	2056	2059	java/lang/Throwable
    //   2048	2074	2077	java/lang/Throwable
    //   2063	2104	2107	java/lang/Throwable
    //   2170	2197	2200	java/lang/Throwable
    //   2187	2218	2221	java/lang/Throwable
    //   2204	2248	2251	java/lang/Throwable
    //   2225	2259	2259	java/lang/Throwable
    //   2270	2286	2289	java/lang/Throwable
    //   2366	2380	2380	java/lang/Throwable
    //   2391	2404	2407	java/lang/Throwable
    //   2396	2419	2422	java/lang/Throwable
    //   2411	2437	2440	java/lang/Throwable
    //   2426	2467	2470	java/lang/Throwable
    //   2533	2560	2563	java/lang/Throwable
    //   2550	2581	2584	java/lang/Throwable
    //   2567	2611	2614	java/lang/Throwable
    //   2588	2622	2622	java/lang/Throwable
    //   2633	2649	2652	java/lang/Throwable
    //   2749	2763	2763	java/lang/Throwable
    //   2774	2787	2790	java/lang/Throwable
    //   2779	2802	2805	java/lang/Throwable
    //   2794	2820	2823	java/lang/Throwable
    //   2809	2850	2853	java/lang/Throwable
    //   2916	2943	2946	java/lang/Throwable
    //   2933	2961	2964	java/lang/Throwable
    //   2950	2991	2994	java/lang/Throwable
    //   2968	3002	3002	java/lang/Throwable
    //   3025	3036	3039	java/lang/Throwable
    //   3091	3105	3105	java/lang/Throwable
    //   3116	3129	3132	java/lang/Throwable
    //   3121	3144	3147	java/lang/Throwable
    //   3136	3162	3165	java/lang/Throwable
    //   3151	3192	3195	java/lang/Throwable
    //   3258	3285	3288	java/lang/Throwable
    //   3275	3303	3306	java/lang/Throwable
    //   3292	3333	3336	java/lang/Throwable
    //   3310	3344	3344	java/lang/Throwable
    //   3367	3378	3381	java/lang/Throwable
    //   3393	4127	5593	java/lang/Throwable
    //   3483	3497	3497	java/lang/Throwable
    //   3508	3521	3524	java/lang/Throwable
    //   3513	3536	3539	java/lang/Throwable
    //   3528	3554	3557	java/lang/Throwable
    //   3543	3584	3587	java/lang/Throwable
    //   3650	3677	3680	java/lang/Throwable
    //   3667	3695	3698	java/lang/Throwable
    //   3684	3725	3728	java/lang/Throwable
    //   3702	3736	3736	java/lang/Throwable
    //   3759	3770	3773	java/lang/Throwable
    //   3826	3840	3840	java/lang/Throwable
    //   3851	3864	3867	java/lang/Throwable
    //   3856	3879	3882	java/lang/Throwable
    //   3871	3897	3900	java/lang/Throwable
    //   3886	3927	3930	java/lang/Throwable
    //   3993	4020	4023	java/lang/Throwable
    //   4010	4038	4041	java/lang/Throwable
    //   4027	4068	4071	java/lang/Throwable
    //   4045	4079	4079	java/lang/Throwable
    //   4102	4113	4116	java/lang/Throwable
    //   4128	4862	5593	java/lang/Throwable
    //   4218	4232	4232	java/lang/Throwable
    //   4243	4256	4259	java/lang/Throwable
    //   4248	4271	4274	java/lang/Throwable
    //   4263	4289	4292	java/lang/Throwable
    //   4278	4319	4322	java/lang/Throwable
    //   4385	4412	4415	java/lang/Throwable
    //   4402	4430	4433	java/lang/Throwable
    //   4419	4460	4463	java/lang/Throwable
    //   4437	4471	4471	java/lang/Throwable
    //   4494	4505	4508	java/lang/Throwable
    //   4561	4575	4575	java/lang/Throwable
    //   4586	4599	4602	java/lang/Throwable
    //   4591	4614	4617	java/lang/Throwable
    //   4606	4632	4635	java/lang/Throwable
    //   4621	4662	4665	java/lang/Throwable
    //   4728	4755	4758	java/lang/Throwable
    //   4745	4773	4776	java/lang/Throwable
    //   4762	4803	4806	java/lang/Throwable
    //   4780	4814	4814	java/lang/Throwable
    //   4837	4848	4851	java/lang/Throwable
    //   4863	5592	5593	java/lang/Throwable
    //   4953	4967	4967	java/lang/Throwable
    //   4978	4991	4994	java/lang/Throwable
    //   4983	5006	5009	java/lang/Throwable
    //   4998	5024	5027	java/lang/Throwable
    //   5013	5054	5057	java/lang/Throwable
    //   5120	5147	5150	java/lang/Throwable
    //   5137	5165	5168	java/lang/Throwable
    //   5154	5195	5198	java/lang/Throwable
    //   5172	5206	5206	java/lang/Throwable
    //   5229	5240	5243	java/lang/Throwable
    //   5296	5310	5310	java/lang/Throwable
    //   5321	5334	5337	java/lang/Throwable
    //   5326	5349	5352	java/lang/Throwable
    //   5341	5367	5370	java/lang/Throwable
    //   5356	5397	5400	java/lang/Throwable
    //   5463	5490	5493	java/lang/Throwable
    //   5480	5508	5511	java/lang/Throwable
    //   5497	5538	5541	java/lang/Throwable
    //   5515	5549	5549	java/lang/Throwable
    //   5572	5583	5586	java/lang/Throwable
  }
  
  static void Zx(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '~\\t\\t±PêÃþ×H÷ !ñÝ(Ú´M@0j"ÏnT¡ôÏÓ,@5ä¿ßÖÁÎt\\täþ@«mû¤U\\tHÖÕÍ§êö|\\t0ÖÚøÍã\\t_\\f""ëÓg)\\tÉ(åÌ6e\\t9Çû1Ü\\f!¹\\tK)µì2&Iæ\\t9ûkÜÂ\\tf7/¡J£YL\\tpfÒù»ó\\tÿÖ#ÇÍv²¦M<Õ£|"ãÊ\\t\%ÚOp?Ba`õ«ÆÜeéDS9Æ?ìB}5á¹o´DVßg°Ð¼x¡Aða·O¢Ö OmkÃL\\t*8ÎvÄ©\\tAôk=Â7T\\tì>þ^È\\r\\tYp7\\tY÷«]Ú/TÇ\\t>?.ÀjLü \\nïà(nF©¤ÔGàöHx«&UÖßxÑIð¯yÔ\\t¡è¾¼S\\f\\b-Ky »c\\bÆ¯<#(ì'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: iconst_2
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 141
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 22
    //   66: ldc ')®!¾1ò¦íj\èþ:56LÒ&ûÂóOûåo"ÍÆ*7£öDòGJëî)§ÃàEx(äÃ T6\\fÂAGÆ.ìÝSÐ¨Á÷]íD\\tñ­u¨g'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #76
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #109
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zbf9.a : [Ljava/lang/String;
    //   130: bipush #28
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbf9.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #52
    //   214: goto -> 244
    //   217: bipush #123
    //   219: goto -> 244
    //   222: bipush #68
    //   224: goto -> 244
    //   227: bipush #79
    //   229: goto -> 244
    //   232: bipush #123
    //   234: goto -> 244
    //   237: bipush #32
    //   239: goto -> 244
    //   242: bipush #37
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 38, 0 -> 97
    //   300: sipush #18984
    //   303: sipush #25376
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zbf9.Zp : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #18981
    //   319: sipush #-22193
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zbf9.ZC : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4A2A) & 0xFFFF;
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
      char c = 'ö';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbf9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */