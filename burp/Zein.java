package burp;

import java.math.BigInteger;

class Zein extends ClassLoader {
  static Object Zb;
  
  static String ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zs(Object paramObject) {
    Ztnw.Zr = a(-25658, -7230);
    Ztnw.Zt = new BigInteger(a(-25651, -17769));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zr3q.ZM.charAt(Math.abs(((BigInteger)Zl2q.Zg).intValue() % 32)) <= Zxyp.Z_.charAt(Math.abs(((BigInteger)Zr0g.Zj).intValue() % 32))) {
          try {
            Zkyc.ZD(Class.forName(a(-25636, -25621)));
            if (bool)
              Zlhu.ZE(Class.forName(a(-25642, -19382))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlhu.ZE(Class.forName(a(-25642, -19382)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZI(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Ze13.Zg : Ljava/lang/String;
    //   172: getstatic burp/Zehi.Zb : Ljava/lang/Object;
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
    //   206: getstatic burp/Zehi.Zi : Ljava/lang/String;
    //   209: getstatic burp/Ze7q.Zk : Ljava/lang/Object;
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
    //   243: getstatic burp/Zg0j.Ze : Ljava/lang/String;
    //   246: getstatic burp/Zr0u.ZB : Ljava/lang/Object;
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
    //   280: getstatic burp/Zrdy.ZO : Ljava/lang/String;
    //   283: getstatic burp/Zedz.Za : Ljava/lang/Object;
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
    //   317: getstatic burp/Zer.Zp : Ljava/lang/String;
    //   320: getstatic burp/Zxzj.ZO : Ljava/lang/Object;
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
    //   354: getstatic burp/Zb8v.Zo : Ljava/lang/String;
    //   357: getstatic burp/Zk8b.ZK : Ljava/lang/Object;
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
    //   391: getstatic burp/Zxso.ZH : Ljava/lang/String;
    //   394: getstatic burp/Zllw.ZW : Ljava/lang/Object;
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
    //   428: getstatic burp/Ztnw.Zr : Ljava/lang/String;
    //   431: getstatic burp/Zr0g.Zj : Ljava/lang/Object;
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
    //   465: getstatic burp/Zllw.Zg : Ljava/lang/String;
    //   468: getstatic burp/Zx4w.Zp : Ljava/lang/Object;
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
    //   502: getstatic burp/Zm__.Zf : Ljava/lang/String;
    //   505: getstatic burp/Zmj4.Zm : Ljava/lang/Object;
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
    //   539: getstatic burp/Zkmx.Zg : Ljava/lang/String;
    //   542: getstatic burp/Zer.Zk : Ljava/lang/Object;
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
    //   576: getstatic burp/Zt3l.Zi : Ljava/lang/String;
    //   579: getstatic burp/Zb3z.ZR : Ljava/lang/Object;
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
    //   613: getstatic burp/Zl88.Zd : Ljava/lang/String;
    //   616: getstatic burp/Zl2q.Zg : Ljava/lang/Object;
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
    //   650: getstatic burp/Zkig.ZE : Ljava/lang/String;
    //   653: getstatic burp/Ztbf.Zv : Ljava/lang/Object;
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
    //   687: getstatic burp/Zr3q.ZM : Ljava/lang/String;
    //   690: getstatic burp/Zb8v.ZA : Ljava/lang/Object;
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
    //   724: getstatic burp/Ztnw.Zr : Ljava/lang/String;
    //   727: getstatic burp/Zl2g.ZG : Ljava/lang/Object;
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
    //   761: getstatic burp/Zzqj.Zk : Ljava/lang/String;
    //   764: getstatic burp/Zsby.ZZ : Ljava/lang/Object;
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
    //   798: getstatic burp/Zkbf.Zv : Ljava/lang/String;
    //   801: getstatic burp/Zl_u.ZR : Ljava/lang/Object;
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
    //   835: getstatic burp/Zl2g.ZI : Ljava/lang/String;
    //   838: getstatic burp/Zxl5.Zh : Ljava/lang/Object;
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
    //   872: getstatic burp/Zsxm.Zq : Ljava/lang/String;
    //   875: getstatic burp/Zl_u.ZR : Ljava/lang/Object;
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
    //   909: getstatic burp/Zg99.ZH : Ljava/lang/String;
    //   912: getstatic burp/Zl88.ZK : Ljava/lang/Object;
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
    //   946: getstatic burp/Zshq.Zi : Ljava/lang/String;
    //   949: getstatic burp/Zbo7.Zl : Ljava/lang/Object;
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
    //   983: getstatic burp/Zzip.Za : Ljava/lang/String;
    //   986: getstatic burp/Zedz.Za : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zeh9.ZF : Ljava/lang/String;
    //   1023: getstatic burp/Zzqj.Zq : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zk9s.ZM : Ljava/lang/String;
    //   1060: getstatic burp/Zbp.ZD : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zzip.Za : Ljava/lang/String;
    //   1097: getstatic burp/Zedz.Za : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zg0j.Ze : Ljava/lang/String;
    //   1134: getstatic burp/Zz1k.ZP : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zeh9.ZF : Ljava/lang/String;
    //   1171: getstatic burp/Zg7z.ZV : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zzap.ZA : Ljava/lang/String;
    //   1208: getstatic burp/Zm0s.Zl : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zrdy.ZO : Ljava/lang/String;
    //   1245: getstatic burp/Zxzd.ZD : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zsxm.Zq : Ljava/lang/String;
    //   1282: getstatic burp/Zt4g.Zv : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zzai.Zy : Ljava/lang/String;
    //   1319: getstatic burp/Ztnw.Zt : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zl2q.ZI : Ljava/lang/String;
    //   1362: sipush #-25654
    //   1365: getstatic burp/Zsgl.Zn : Ljava/lang/Object;
    //   1368: checkcast java/math/BigInteger
    //   1371: getstatic burp/Zbp.ZD : Ljava/lang/Object;
    //   1374: checkcast java/math/BigInteger
    //   1377: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1380: putstatic burp/Zxwl.Ze : Ljava/lang/Object;
    //   1383: sipush #25008
    //   1386: invokestatic a : (II)Ljava/lang/String;
    //   1389: iconst_1
    //   1390: ldc burp/Zrvb
    //   1392: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1395: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1398: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1401: astore #4
    //   1403: aload #4
    //   1405: arraylength
    //   1406: istore #5
    //   1408: iconst_0
    //   1409: istore #6
    //   1411: iload #6
    //   1413: iload #5
    //   1415: if_icmpge -> 1553
    //   1418: aload #4
    //   1420: iload #6
    //   1422: aaload
    //   1423: astore #7
    //   1425: aload #7
    //   1427: invokevirtual getModifiers : ()I
    //   1430: invokestatic isStatic : (I)Z
    //   1433: ifne -> 1443
    //   1436: goto -> 1546
    //   1439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1442: athrow
    //   1443: aload #7
    //   1445: invokevirtual getType : ()Ljava/lang/Class;
    //   1448: astore #8
    //   1450: aload #8
    //   1452: ifnull -> 1533
    //   1455: aload #8
    //   1457: invokevirtual isPrimitive : ()Z
    //   1460: ifne -> 1533
    //   1463: goto -> 1470
    //   1466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1469: athrow
    //   1470: aload #8
    //   1472: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1475: ifnull -> 1533
    //   1478: goto -> 1485
    //   1481: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1484: athrow
    //   1485: aload #8
    //   1487: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1490: invokevirtual getName : ()Ljava/lang/String;
    //   1493: ifnull -> 1533
    //   1496: goto -> 1503
    //   1499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1502: athrow
    //   1503: aload #8
    //   1505: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1508: invokevirtual getName : ()Ljava/lang/String;
    //   1511: sipush #-25657
    //   1514: sipush #-19881
    //   1517: invokestatic a : (II)Ljava/lang/String;
    //   1520: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1523: ifne -> 1533
    //   1526: goto -> 1533
    //   1529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1532: athrow
    //   1533: aload #7
    //   1535: iconst_1
    //   1536: invokevirtual setAccessible : (Z)V
    //   1539: aload #7
    //   1541: aconst_null
    //   1542: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1545: pop
    //   1546: iinc #6, 1
    //   1549: iload_2
    //   1550: ifne -> 1411
    //   1553: sipush #-25641
    //   1556: bipush #-44
    //   1558: invokestatic a : (II)Ljava/lang/String;
    //   1561: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1564: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1567: astore #4
    //   1569: aload #4
    //   1571: arraylength
    //   1572: istore #5
    //   1574: iconst_0
    //   1575: istore #6
    //   1577: iload #6
    //   1579: iload #5
    //   1581: if_icmpge -> 1714
    //   1584: aload #4
    //   1586: iload #6
    //   1588: aaload
    //   1589: astore #7
    //   1591: aload #7
    //   1593: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1596: pop
    //   1597: aload #7
    //   1599: invokevirtual getModifiers : ()I
    //   1602: invokestatic isStatic : (I)Z
    //   1605: ifeq -> 1700
    //   1608: aload #7
    //   1610: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1613: arraylength
    //   1614: iconst_2
    //   1615: if_icmpne -> 1700
    //   1618: goto -> 1625
    //   1621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1624: athrow
    //   1625: aload #7
    //   1627: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1630: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1633: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1636: ifeq -> 1700
    //   1639: goto -> 1646
    //   1642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1645: athrow
    //   1646: aload #7
    //   1648: iconst_1
    //   1649: invokevirtual setAccessible : (Z)V
    //   1652: aload #7
    //   1654: aconst_null
    //   1655: iconst_2
    //   1656: anewarray java/lang/Object
    //   1659: dup
    //   1660: iconst_0
    //   1661: aload_0
    //   1662: aastore
    //   1663: dup
    //   1664: iconst_1
    //   1665: aload_1
    //   1666: ifnonnull -> 1684
    //   1669: goto -> 1676
    //   1672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1675: athrow
    //   1676: aload_1
    //   1677: goto -> 1691
    //   1680: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1683: athrow
    //   1684: aload_1
    //   1685: checkcast [B
    //   1688: invokevirtual clone : ()Ljava/lang/Object;
    //   1691: aastore
    //   1692: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1695: pop
    //   1696: iload_2
    //   1697: ifne -> 1714
    //   1700: iinc #6, 1
    //   1703: iload_2
    //   1704: ifne -> 1577
    //   1707: goto -> 1714
    //   1710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1713: athrow
    //   1714: iconst_0
    //   1715: istore #4
    //   1717: getstatic burp/Zzsq.Zc : Ljava/lang/String;
    //   1720: getstatic burp/Zsde.Zx : Ljava/lang/Object;
    //   1723: checkcast java/math/BigInteger
    //   1726: invokevirtual intValue : ()I
    //   1729: bipush #32
    //   1731: irem
    //   1732: invokestatic abs : (I)I
    //   1735: invokevirtual charAt : (I)C
    //   1738: getstatic burp/Zg7p.ZA : Ljava/lang/String;
    //   1741: getstatic burp/Zeh9.ZY : Ljava/lang/Object;
    //   1744: checkcast java/math/BigInteger
    //   1747: invokevirtual intValue : ()I
    //   1750: bipush #32
    //   1752: irem
    //   1753: invokestatic abs : (I)I
    //   1756: invokevirtual charAt : (I)C
    //   1759: if_icmpgt -> 2104
    //   1762: sipush #-25653
    //   1765: sipush #9968
    //   1768: invokestatic a : (II)Ljava/lang/String;
    //   1771: iconst_1
    //   1772: ldc burp/Zr8h
    //   1774: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1777: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1780: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1783: astore #5
    //   1785: aload #5
    //   1787: arraylength
    //   1788: istore #6
    //   1790: iconst_0
    //   1791: istore #7
    //   1793: iload #7
    //   1795: iload #6
    //   1797: if_icmpge -> 1935
    //   1800: aload #5
    //   1802: iload #7
    //   1804: aaload
    //   1805: astore #8
    //   1807: aload #8
    //   1809: invokevirtual getModifiers : ()I
    //   1812: invokestatic isStatic : (I)Z
    //   1815: ifne -> 1825
    //   1818: goto -> 1928
    //   1821: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1824: athrow
    //   1825: aload #8
    //   1827: invokevirtual getType : ()Ljava/lang/Class;
    //   1830: astore #9
    //   1832: aload #9
    //   1834: ifnull -> 1915
    //   1837: aload #9
    //   1839: invokevirtual isPrimitive : ()Z
    //   1842: ifne -> 1915
    //   1845: goto -> 1852
    //   1848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1851: athrow
    //   1852: aload #9
    //   1854: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1857: ifnull -> 1915
    //   1860: goto -> 1867
    //   1863: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1866: athrow
    //   1867: aload #9
    //   1869: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1872: invokevirtual getName : ()Ljava/lang/String;
    //   1875: ifnull -> 1915
    //   1878: goto -> 1885
    //   1881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1884: athrow
    //   1885: aload #9
    //   1887: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1890: invokevirtual getName : ()Ljava/lang/String;
    //   1893: sipush #-25656
    //   1896: sipush #-27204
    //   1899: invokestatic a : (II)Ljava/lang/String;
    //   1902: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1905: ifne -> 1915
    //   1908: goto -> 1915
    //   1911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1914: athrow
    //   1915: aload #8
    //   1917: iconst_1
    //   1918: invokevirtual setAccessible : (Z)V
    //   1921: aload #8
    //   1923: aconst_null
    //   1924: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1927: pop
    //   1928: iinc #7, 1
    //   1931: iload_2
    //   1932: ifne -> 1793
    //   1935: sipush #-25655
    //   1938: sipush #-24258
    //   1941: invokestatic a : (II)Ljava/lang/String;
    //   1944: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1947: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1950: astore #5
    //   1952: aload #5
    //   1954: arraylength
    //   1955: istore #6
    //   1957: iconst_0
    //   1958: istore #7
    //   1960: iload #7
    //   1962: iload #6
    //   1964: if_icmpge -> 2101
    //   1967: aload #5
    //   1969: iload #7
    //   1971: aaload
    //   1972: astore #8
    //   1974: aload #8
    //   1976: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1979: pop
    //   1980: aload #8
    //   1982: invokevirtual getModifiers : ()I
    //   1985: invokestatic isStatic : (I)Z
    //   1988: ifeq -> 2087
    //   1991: aload #8
    //   1993: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1996: arraylength
    //   1997: iconst_2
    //   1998: if_icmpne -> 2087
    //   2001: goto -> 2008
    //   2004: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2007: athrow
    //   2008: aload #8
    //   2010: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2013: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2016: if_acmpne -> 2087
    //   2019: goto -> 2026
    //   2022: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2025: athrow
    //   2026: aload #8
    //   2028: iconst_1
    //   2029: invokevirtual setAccessible : (Z)V
    //   2032: aload #8
    //   2034: aconst_null
    //   2035: iconst_2
    //   2036: anewarray java/lang/Object
    //   2039: dup
    //   2040: iconst_0
    //   2041: aload_0
    //   2042: aastore
    //   2043: dup
    //   2044: iconst_1
    //   2045: aload_1
    //   2046: ifnonnull -> 2064
    //   2049: goto -> 2056
    //   2052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2055: athrow
    //   2056: aload_1
    //   2057: goto -> 2071
    //   2060: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2063: athrow
    //   2064: aload_1
    //   2065: checkcast [B
    //   2068: invokevirtual clone : ()Ljava/lang/Object;
    //   2071: aastore
    //   2072: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2075: checkcast java/lang/Boolean
    //   2078: invokevirtual booleanValue : ()Z
    //   2081: istore #4
    //   2083: iload_2
    //   2084: ifne -> 2101
    //   2087: iinc #7, 1
    //   2090: iload_2
    //   2091: ifne -> 1960
    //   2094: goto -> 2101
    //   2097: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2100: athrow
    //   2101: goto -> 2443
    //   2104: sipush #-25661
    //   2107: sipush #12796
    //   2110: invokestatic a : (II)Ljava/lang/String;
    //   2113: iconst_1
    //   2114: ldc burp/Zgrf
    //   2116: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2119: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2122: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2125: astore #5
    //   2127: aload #5
    //   2129: arraylength
    //   2130: istore #6
    //   2132: iconst_0
    //   2133: istore #7
    //   2135: iload #7
    //   2137: iload #6
    //   2139: if_icmpge -> 2277
    //   2142: aload #5
    //   2144: iload #7
    //   2146: aaload
    //   2147: astore #8
    //   2149: aload #8
    //   2151: invokevirtual getModifiers : ()I
    //   2154: invokestatic isStatic : (I)Z
    //   2157: ifne -> 2167
    //   2160: goto -> 2270
    //   2163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2166: athrow
    //   2167: aload #8
    //   2169: invokevirtual getType : ()Ljava/lang/Class;
    //   2172: astore #9
    //   2174: aload #9
    //   2176: ifnull -> 2257
    //   2179: aload #9
    //   2181: invokevirtual isPrimitive : ()Z
    //   2184: ifne -> 2257
    //   2187: goto -> 2194
    //   2190: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2193: athrow
    //   2194: aload #9
    //   2196: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2199: ifnull -> 2257
    //   2202: goto -> 2209
    //   2205: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2208: athrow
    //   2209: aload #9
    //   2211: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2214: invokevirtual getName : ()Ljava/lang/String;
    //   2217: ifnull -> 2257
    //   2220: goto -> 2227
    //   2223: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2226: athrow
    //   2227: aload #9
    //   2229: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2232: invokevirtual getName : ()Ljava/lang/String;
    //   2235: sipush #-25656
    //   2238: sipush #-27204
    //   2241: invokestatic a : (II)Ljava/lang/String;
    //   2244: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2247: ifne -> 2257
    //   2250: goto -> 2257
    //   2253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2256: athrow
    //   2257: aload #8
    //   2259: iconst_1
    //   2260: invokevirtual setAccessible : (Z)V
    //   2263: aload #8
    //   2265: aconst_null
    //   2266: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2269: pop
    //   2270: iinc #7, 1
    //   2273: iload_2
    //   2274: ifne -> 2135
    //   2277: sipush #-25638
    //   2280: sipush #-26958
    //   2283: invokestatic a : (II)Ljava/lang/String;
    //   2286: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2289: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2292: astore #5
    //   2294: aload #5
    //   2296: arraylength
    //   2297: istore #6
    //   2299: iconst_0
    //   2300: istore #7
    //   2302: iload #7
    //   2304: iload #6
    //   2306: if_icmpge -> 2443
    //   2309: aload #5
    //   2311: iload #7
    //   2313: aaload
    //   2314: astore #8
    //   2316: aload #8
    //   2318: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2321: pop
    //   2322: aload #8
    //   2324: invokevirtual getModifiers : ()I
    //   2327: invokestatic isStatic : (I)Z
    //   2330: ifeq -> 2429
    //   2333: aload #8
    //   2335: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2338: arraylength
    //   2339: iconst_2
    //   2340: if_icmpne -> 2429
    //   2343: goto -> 2350
    //   2346: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2349: athrow
    //   2350: aload #8
    //   2352: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2355: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2358: if_acmpne -> 2429
    //   2361: goto -> 2368
    //   2364: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2367: athrow
    //   2368: aload #8
    //   2370: iconst_1
    //   2371: invokevirtual setAccessible : (Z)V
    //   2374: aload #8
    //   2376: aconst_null
    //   2377: iconst_2
    //   2378: anewarray java/lang/Object
    //   2381: dup
    //   2382: iconst_0
    //   2383: aload_0
    //   2384: aastore
    //   2385: dup
    //   2386: iconst_1
    //   2387: aload_1
    //   2388: ifnonnull -> 2406
    //   2391: goto -> 2398
    //   2394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2397: athrow
    //   2398: aload_1
    //   2399: goto -> 2413
    //   2402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2405: athrow
    //   2406: aload_1
    //   2407: checkcast [B
    //   2410: invokevirtual clone : ()Ljava/lang/Object;
    //   2413: aastore
    //   2414: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2417: checkcast java/lang/Boolean
    //   2420: invokevirtual booleanValue : ()Z
    //   2423: istore #4
    //   2425: iload_2
    //   2426: ifne -> 2443
    //   2429: iinc #7, 1
    //   2432: iload_2
    //   2433: ifne -> 2302
    //   2436: goto -> 2443
    //   2439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2442: athrow
    //   2443: iload #4
    //   2445: ifeq -> 2451
    //   2448: iload #4
    //   2450: ireturn
    //   2451: getstatic burp/Zsde.Zi : Ljava/lang/String;
    //   2454: getstatic burp/Zz1k.ZP : Ljava/lang/Object;
    //   2457: checkcast java/math/BigInteger
    //   2460: invokevirtual intValue : ()I
    //   2463: bipush #32
    //   2465: irem
    //   2466: invokestatic abs : (I)I
    //   2469: invokevirtual charAt : (I)C
    //   2472: getstatic burp/Zl88.Zd : Ljava/lang/String;
    //   2475: getstatic burp/Zrdy.Zt : Ljava/lang/Object;
    //   2478: checkcast java/math/BigInteger
    //   2481: invokevirtual intValue : ()I
    //   2484: bipush #32
    //   2486: irem
    //   2487: invokestatic abs : (I)I
    //   2490: invokevirtual charAt : (I)C
    //   2493: if_icmple -> 2839
    //   2496: sipush #-25660
    //   2499: sipush #14390
    //   2502: invokestatic a : (II)Ljava/lang/String;
    //   2505: iconst_1
    //   2506: ldc burp/Zle6
    //   2508: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2511: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2514: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2517: astore #5
    //   2519: aload #5
    //   2521: arraylength
    //   2522: istore #6
    //   2524: iconst_0
    //   2525: istore #7
    //   2527: iload #7
    //   2529: iload #6
    //   2531: if_icmpge -> 2669
    //   2534: aload #5
    //   2536: iload #7
    //   2538: aaload
    //   2539: astore #8
    //   2541: aload #8
    //   2543: invokevirtual getModifiers : ()I
    //   2546: invokestatic isStatic : (I)Z
    //   2549: ifne -> 2559
    //   2552: goto -> 2662
    //   2555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2558: athrow
    //   2559: aload #8
    //   2561: invokevirtual getType : ()Ljava/lang/Class;
    //   2564: astore #9
    //   2566: aload #9
    //   2568: ifnull -> 2649
    //   2571: aload #9
    //   2573: invokevirtual isPrimitive : ()Z
    //   2576: ifne -> 2649
    //   2579: goto -> 2586
    //   2582: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2585: athrow
    //   2586: aload #9
    //   2588: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2591: ifnull -> 2649
    //   2594: goto -> 2601
    //   2597: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2600: athrow
    //   2601: aload #9
    //   2603: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2606: invokevirtual getName : ()Ljava/lang/String;
    //   2609: ifnull -> 2649
    //   2612: goto -> 2619
    //   2615: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2618: athrow
    //   2619: aload #9
    //   2621: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2624: invokevirtual getName : ()Ljava/lang/String;
    //   2627: sipush #-25656
    //   2630: sipush #-27204
    //   2633: invokestatic a : (II)Ljava/lang/String;
    //   2636: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2639: ifne -> 2649
    //   2642: goto -> 2649
    //   2645: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2648: athrow
    //   2649: aload #8
    //   2651: iconst_1
    //   2652: invokevirtual setAccessible : (Z)V
    //   2655: aload #8
    //   2657: aconst_null
    //   2658: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2661: pop
    //   2662: iinc #7, 1
    //   2665: iload_2
    //   2666: ifne -> 2527
    //   2669: sipush #-25663
    //   2672: sipush #-1120
    //   2675: invokestatic a : (II)Ljava/lang/String;
    //   2678: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2681: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2684: astore #5
    //   2686: aload #5
    //   2688: arraylength
    //   2689: istore #6
    //   2691: iconst_0
    //   2692: istore #7
    //   2694: iload #7
    //   2696: iload #6
    //   2698: if_icmpge -> 2835
    //   2701: aload #5
    //   2703: iload #7
    //   2705: aaload
    //   2706: astore #8
    //   2708: aload #8
    //   2710: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2713: pop
    //   2714: aload #8
    //   2716: invokevirtual getModifiers : ()I
    //   2719: invokestatic isStatic : (I)Z
    //   2722: ifeq -> 2821
    //   2725: aload #8
    //   2727: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2730: arraylength
    //   2731: iconst_2
    //   2732: if_icmpne -> 2821
    //   2735: goto -> 2742
    //   2738: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2741: athrow
    //   2742: aload #8
    //   2744: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2747: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2750: if_acmpne -> 2821
    //   2753: goto -> 2760
    //   2756: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2759: athrow
    //   2760: aload #8
    //   2762: iconst_1
    //   2763: invokevirtual setAccessible : (Z)V
    //   2766: aload #8
    //   2768: aconst_null
    //   2769: iconst_2
    //   2770: anewarray java/lang/Object
    //   2773: dup
    //   2774: iconst_0
    //   2775: aload_0
    //   2776: aastore
    //   2777: dup
    //   2778: iconst_1
    //   2779: aload_1
    //   2780: ifnonnull -> 2798
    //   2783: goto -> 2790
    //   2786: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2789: athrow
    //   2790: aload_1
    //   2791: goto -> 2805
    //   2794: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2797: athrow
    //   2798: aload_1
    //   2799: checkcast [B
    //   2802: invokevirtual clone : ()Ljava/lang/Object;
    //   2805: aastore
    //   2806: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2809: checkcast java/lang/Boolean
    //   2812: invokevirtual booleanValue : ()Z
    //   2815: istore #4
    //   2817: iload_2
    //   2818: ifne -> 2835
    //   2821: iinc #7, 1
    //   2824: iload_2
    //   2825: ifne -> 2694
    //   2828: goto -> 2835
    //   2831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2834: athrow
    //   2835: iload_2
    //   2836: ifne -> 3178
    //   2839: sipush #-25652
    //   2842: sipush #-3535
    //   2845: invokestatic a : (II)Ljava/lang/String;
    //   2848: iconst_1
    //   2849: ldc burp/Zt7k
    //   2851: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2854: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2857: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2860: astore #5
    //   2862: aload #5
    //   2864: arraylength
    //   2865: istore #6
    //   2867: iconst_0
    //   2868: istore #7
    //   2870: iload #7
    //   2872: iload #6
    //   2874: if_icmpge -> 3012
    //   2877: aload #5
    //   2879: iload #7
    //   2881: aaload
    //   2882: astore #8
    //   2884: aload #8
    //   2886: invokevirtual getModifiers : ()I
    //   2889: invokestatic isStatic : (I)Z
    //   2892: ifne -> 2902
    //   2895: goto -> 3005
    //   2898: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2901: athrow
    //   2902: aload #8
    //   2904: invokevirtual getType : ()Ljava/lang/Class;
    //   2907: astore #9
    //   2909: aload #9
    //   2911: ifnull -> 2992
    //   2914: aload #9
    //   2916: invokevirtual isPrimitive : ()Z
    //   2919: ifne -> 2992
    //   2922: goto -> 2929
    //   2925: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2928: athrow
    //   2929: aload #9
    //   2931: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2934: ifnull -> 2992
    //   2937: goto -> 2944
    //   2940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2943: athrow
    //   2944: aload #9
    //   2946: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2949: invokevirtual getName : ()Ljava/lang/String;
    //   2952: ifnull -> 2992
    //   2955: goto -> 2962
    //   2958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2961: athrow
    //   2962: aload #9
    //   2964: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2967: invokevirtual getName : ()Ljava/lang/String;
    //   2970: sipush #-25656
    //   2973: sipush #-27204
    //   2976: invokestatic a : (II)Ljava/lang/String;
    //   2979: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2982: ifne -> 2992
    //   2985: goto -> 2992
    //   2988: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2991: athrow
    //   2992: aload #8
    //   2994: iconst_1
    //   2995: invokevirtual setAccessible : (Z)V
    //   2998: aload #8
    //   3000: aconst_null
    //   3001: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3004: pop
    //   3005: iinc #7, 1
    //   3008: iload_2
    //   3009: ifne -> 2870
    //   3012: sipush #-25637
    //   3015: sipush #-19674
    //   3018: invokestatic a : (II)Ljava/lang/String;
    //   3021: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3024: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3027: astore #5
    //   3029: aload #5
    //   3031: arraylength
    //   3032: istore #6
    //   3034: iconst_0
    //   3035: istore #7
    //   3037: iload #7
    //   3039: iload #6
    //   3041: if_icmpge -> 3178
    //   3044: aload #5
    //   3046: iload #7
    //   3048: aaload
    //   3049: astore #8
    //   3051: aload #8
    //   3053: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3056: pop
    //   3057: aload #8
    //   3059: invokevirtual getModifiers : ()I
    //   3062: invokestatic isStatic : (I)Z
    //   3065: ifeq -> 3164
    //   3068: aload #8
    //   3070: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3073: arraylength
    //   3074: iconst_2
    //   3075: if_icmpne -> 3164
    //   3078: goto -> 3085
    //   3081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3084: athrow
    //   3085: aload #8
    //   3087: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3090: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3093: if_acmpne -> 3164
    //   3096: goto -> 3103
    //   3099: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3102: athrow
    //   3103: aload #8
    //   3105: iconst_1
    //   3106: invokevirtual setAccessible : (Z)V
    //   3109: aload #8
    //   3111: aconst_null
    //   3112: iconst_2
    //   3113: anewarray java/lang/Object
    //   3116: dup
    //   3117: iconst_0
    //   3118: aload_0
    //   3119: aastore
    //   3120: dup
    //   3121: iconst_1
    //   3122: aload_1
    //   3123: ifnonnull -> 3141
    //   3126: goto -> 3133
    //   3129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3132: athrow
    //   3133: aload_1
    //   3134: goto -> 3148
    //   3137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3140: athrow
    //   3141: aload_1
    //   3142: checkcast [B
    //   3145: invokevirtual clone : ()Ljava/lang/Object;
    //   3148: aastore
    //   3149: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3152: checkcast java/lang/Boolean
    //   3155: invokevirtual booleanValue : ()Z
    //   3158: istore #4
    //   3160: iload_2
    //   3161: ifne -> 3178
    //   3164: iinc #7, 1
    //   3167: iload_2
    //   3168: ifne -> 3037
    //   3171: goto -> 3178
    //   3174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3177: athrow
    //   3178: iload #4
    //   3180: ifeq -> 3186
    //   3183: iload #4
    //   3185: ireturn
    //   3186: getstatic burp/Ztnw.Zr : Ljava/lang/String;
    //   3189: getstatic burp/Zsde.Zx : Ljava/lang/Object;
    //   3192: checkcast java/math/BigInteger
    //   3195: invokevirtual intValue : ()I
    //   3198: bipush #32
    //   3200: irem
    //   3201: invokestatic abs : (I)I
    //   3204: invokevirtual charAt : (I)C
    //   3207: getstatic burp/Zod.ZS : Ljava/lang/String;
    //   3210: getstatic burp/Zzsq.Zh : Ljava/lang/Object;
    //   3213: checkcast java/math/BigInteger
    //   3216: invokevirtual intValue : ()I
    //   3219: bipush #32
    //   3221: irem
    //   3222: invokestatic abs : (I)I
    //   3225: invokevirtual charAt : (I)C
    //   3228: if_icmpgt -> 3574
    //   3231: sipush #-25635
    //   3234: sipush #8887
    //   3237: invokestatic a : (II)Ljava/lang/String;
    //   3240: iconst_1
    //   3241: ldc burp/Zrnu
    //   3243: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3246: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3249: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3252: astore #5
    //   3254: aload #5
    //   3256: arraylength
    //   3257: istore #6
    //   3259: iconst_0
    //   3260: istore #7
    //   3262: iload #7
    //   3264: iload #6
    //   3266: if_icmpge -> 3404
    //   3269: aload #5
    //   3271: iload #7
    //   3273: aaload
    //   3274: astore #8
    //   3276: aload #8
    //   3278: invokevirtual getModifiers : ()I
    //   3281: invokestatic isStatic : (I)Z
    //   3284: ifne -> 3294
    //   3287: goto -> 3397
    //   3290: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3293: athrow
    //   3294: aload #8
    //   3296: invokevirtual getType : ()Ljava/lang/Class;
    //   3299: astore #9
    //   3301: aload #9
    //   3303: ifnull -> 3384
    //   3306: aload #9
    //   3308: invokevirtual isPrimitive : ()Z
    //   3311: ifne -> 3384
    //   3314: goto -> 3321
    //   3317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3320: athrow
    //   3321: aload #9
    //   3323: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3326: ifnull -> 3384
    //   3329: goto -> 3336
    //   3332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3335: athrow
    //   3336: aload #9
    //   3338: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3341: invokevirtual getName : ()Ljava/lang/String;
    //   3344: ifnull -> 3384
    //   3347: goto -> 3354
    //   3350: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3353: athrow
    //   3354: aload #9
    //   3356: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3359: invokevirtual getName : ()Ljava/lang/String;
    //   3362: sipush #-25656
    //   3365: sipush #-27204
    //   3368: invokestatic a : (II)Ljava/lang/String;
    //   3371: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3374: ifne -> 3384
    //   3377: goto -> 3384
    //   3380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3383: athrow
    //   3384: aload #8
    //   3386: iconst_1
    //   3387: invokevirtual setAccessible : (Z)V
    //   3390: aload #8
    //   3392: aconst_null
    //   3393: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3396: pop
    //   3397: iinc #7, 1
    //   3400: iload_2
    //   3401: ifne -> 3262
    //   3404: sipush #-25664
    //   3407: sipush #22239
    //   3410: invokestatic a : (II)Ljava/lang/String;
    //   3413: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3416: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3419: astore #5
    //   3421: aload #5
    //   3423: arraylength
    //   3424: istore #6
    //   3426: iconst_0
    //   3427: istore #7
    //   3429: iload #7
    //   3431: iload #6
    //   3433: if_icmpge -> 3570
    //   3436: aload #5
    //   3438: iload #7
    //   3440: aaload
    //   3441: astore #8
    //   3443: aload #8
    //   3445: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3448: pop
    //   3449: aload #8
    //   3451: invokevirtual getModifiers : ()I
    //   3454: invokestatic isStatic : (I)Z
    //   3457: ifeq -> 3556
    //   3460: aload #8
    //   3462: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3465: arraylength
    //   3466: iconst_2
    //   3467: if_icmpne -> 3556
    //   3470: goto -> 3477
    //   3473: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3476: athrow
    //   3477: aload #8
    //   3479: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3482: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3485: if_acmpne -> 3556
    //   3488: goto -> 3495
    //   3491: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3494: athrow
    //   3495: aload #8
    //   3497: iconst_1
    //   3498: invokevirtual setAccessible : (Z)V
    //   3501: aload #8
    //   3503: aconst_null
    //   3504: iconst_2
    //   3505: anewarray java/lang/Object
    //   3508: dup
    //   3509: iconst_0
    //   3510: aload_0
    //   3511: aastore
    //   3512: dup
    //   3513: iconst_1
    //   3514: aload_1
    //   3515: ifnonnull -> 3533
    //   3518: goto -> 3525
    //   3521: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3524: athrow
    //   3525: aload_1
    //   3526: goto -> 3540
    //   3529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3532: athrow
    //   3533: aload_1
    //   3534: checkcast [B
    //   3537: invokevirtual clone : ()Ljava/lang/Object;
    //   3540: aastore
    //   3541: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3544: checkcast java/lang/Boolean
    //   3547: invokevirtual booleanValue : ()Z
    //   3550: istore #4
    //   3552: iload_2
    //   3553: ifne -> 3570
    //   3556: iinc #7, 1
    //   3559: iload_2
    //   3560: ifne -> 3429
    //   3563: goto -> 3570
    //   3566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3569: athrow
    //   3570: iload_2
    //   3571: ifne -> 3913
    //   3574: sipush #-25659
    //   3577: sipush #11961
    //   3580: invokestatic a : (II)Ljava/lang/String;
    //   3583: iconst_1
    //   3584: ldc burp/Zs6g
    //   3586: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3589: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3592: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3595: astore #5
    //   3597: aload #5
    //   3599: arraylength
    //   3600: istore #6
    //   3602: iconst_0
    //   3603: istore #7
    //   3605: iload #7
    //   3607: iload #6
    //   3609: if_icmpge -> 3747
    //   3612: aload #5
    //   3614: iload #7
    //   3616: aaload
    //   3617: astore #8
    //   3619: aload #8
    //   3621: invokevirtual getModifiers : ()I
    //   3624: invokestatic isStatic : (I)Z
    //   3627: ifne -> 3637
    //   3630: goto -> 3740
    //   3633: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3636: athrow
    //   3637: aload #8
    //   3639: invokevirtual getType : ()Ljava/lang/Class;
    //   3642: astore #9
    //   3644: aload #9
    //   3646: ifnull -> 3727
    //   3649: aload #9
    //   3651: invokevirtual isPrimitive : ()Z
    //   3654: ifne -> 3727
    //   3657: goto -> 3664
    //   3660: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3663: athrow
    //   3664: aload #9
    //   3666: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3669: ifnull -> 3727
    //   3672: goto -> 3679
    //   3675: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3678: athrow
    //   3679: aload #9
    //   3681: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3684: invokevirtual getName : ()Ljava/lang/String;
    //   3687: ifnull -> 3727
    //   3690: goto -> 3697
    //   3693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3696: athrow
    //   3697: aload #9
    //   3699: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3702: invokevirtual getName : ()Ljava/lang/String;
    //   3705: sipush #-25656
    //   3708: sipush #-27204
    //   3711: invokestatic a : (II)Ljava/lang/String;
    //   3714: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3717: ifne -> 3727
    //   3720: goto -> 3727
    //   3723: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3726: athrow
    //   3727: aload #8
    //   3729: iconst_1
    //   3730: invokevirtual setAccessible : (Z)V
    //   3733: aload #8
    //   3735: aconst_null
    //   3736: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3739: pop
    //   3740: iinc #7, 1
    //   3743: iload_2
    //   3744: ifne -> 3605
    //   3747: sipush #-25640
    //   3750: sipush #12891
    //   3753: invokestatic a : (II)Ljava/lang/String;
    //   3756: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3759: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3762: astore #5
    //   3764: aload #5
    //   3766: arraylength
    //   3767: istore #6
    //   3769: iconst_0
    //   3770: istore #7
    //   3772: iload #7
    //   3774: iload #6
    //   3776: if_icmpge -> 3913
    //   3779: aload #5
    //   3781: iload #7
    //   3783: aaload
    //   3784: astore #8
    //   3786: aload #8
    //   3788: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3791: pop
    //   3792: aload #8
    //   3794: invokevirtual getModifiers : ()I
    //   3797: invokestatic isStatic : (I)Z
    //   3800: ifeq -> 3899
    //   3803: aload #8
    //   3805: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3808: arraylength
    //   3809: iconst_2
    //   3810: if_icmpne -> 3899
    //   3813: goto -> 3820
    //   3816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3819: athrow
    //   3820: aload #8
    //   3822: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3825: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3828: if_acmpne -> 3899
    //   3831: goto -> 3838
    //   3834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3837: athrow
    //   3838: aload #8
    //   3840: iconst_1
    //   3841: invokevirtual setAccessible : (Z)V
    //   3844: aload #8
    //   3846: aconst_null
    //   3847: iconst_2
    //   3848: anewarray java/lang/Object
    //   3851: dup
    //   3852: iconst_0
    //   3853: aload_0
    //   3854: aastore
    //   3855: dup
    //   3856: iconst_1
    //   3857: aload_1
    //   3858: ifnonnull -> 3876
    //   3861: goto -> 3868
    //   3864: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3867: athrow
    //   3868: aload_1
    //   3869: goto -> 3883
    //   3872: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3875: athrow
    //   3876: aload_1
    //   3877: checkcast [B
    //   3880: invokevirtual clone : ()Ljava/lang/Object;
    //   3883: aastore
    //   3884: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3887: checkcast java/lang/Boolean
    //   3890: invokevirtual booleanValue : ()Z
    //   3893: istore #4
    //   3895: iload_2
    //   3896: ifne -> 3913
    //   3899: iinc #7, 1
    //   3902: iload_2
    //   3903: ifne -> 3772
    //   3906: goto -> 3913
    //   3909: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3912: athrow
    //   3913: iload #4
    //   3915: ifeq -> 3921
    //   3918: iload #4
    //   3920: ireturn
    //   3921: getstatic burp/Zsxj.Zp : Ljava/lang/String;
    //   3924: getstatic burp/Ze13.ZD : Ljava/lang/Object;
    //   3927: checkcast java/math/BigInteger
    //   3930: invokevirtual intValue : ()I
    //   3933: bipush #32
    //   3935: irem
    //   3936: invokestatic abs : (I)I
    //   3939: invokevirtual charAt : (I)C
    //   3942: getstatic burp/Zxyp.Z_ : Ljava/lang/String;
    //   3945: getstatic burp/Zxzd.ZD : Ljava/lang/Object;
    //   3948: checkcast java/math/BigInteger
    //   3951: invokevirtual intValue : ()I
    //   3954: bipush #32
    //   3956: irem
    //   3957: invokestatic abs : (I)I
    //   3960: invokevirtual charAt : (I)C
    //   3963: if_icmpgt -> 4309
    //   3966: sipush #-25649
    //   3969: sipush #-13493
    //   3972: invokestatic a : (II)Ljava/lang/String;
    //   3975: iconst_1
    //   3976: ldc burp/Zre1
    //   3978: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3981: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3984: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3987: astore #5
    //   3989: aload #5
    //   3991: arraylength
    //   3992: istore #6
    //   3994: iconst_0
    //   3995: istore #7
    //   3997: iload #7
    //   3999: iload #6
    //   4001: if_icmpge -> 4139
    //   4004: aload #5
    //   4006: iload #7
    //   4008: aaload
    //   4009: astore #8
    //   4011: aload #8
    //   4013: invokevirtual getModifiers : ()I
    //   4016: invokestatic isStatic : (I)Z
    //   4019: ifne -> 4029
    //   4022: goto -> 4132
    //   4025: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4028: athrow
    //   4029: aload #8
    //   4031: invokevirtual getType : ()Ljava/lang/Class;
    //   4034: astore #9
    //   4036: aload #9
    //   4038: ifnull -> 4119
    //   4041: aload #9
    //   4043: invokevirtual isPrimitive : ()Z
    //   4046: ifne -> 4119
    //   4049: goto -> 4056
    //   4052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4055: athrow
    //   4056: aload #9
    //   4058: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4061: ifnull -> 4119
    //   4064: goto -> 4071
    //   4067: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4070: athrow
    //   4071: aload #9
    //   4073: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4076: invokevirtual getName : ()Ljava/lang/String;
    //   4079: ifnull -> 4119
    //   4082: goto -> 4089
    //   4085: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4088: athrow
    //   4089: aload #9
    //   4091: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4094: invokevirtual getName : ()Ljava/lang/String;
    //   4097: sipush #-25656
    //   4100: sipush #-27204
    //   4103: invokestatic a : (II)Ljava/lang/String;
    //   4106: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4109: ifne -> 4119
    //   4112: goto -> 4119
    //   4115: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4118: athrow
    //   4119: aload #8
    //   4121: iconst_1
    //   4122: invokevirtual setAccessible : (Z)V
    //   4125: aload #8
    //   4127: aconst_null
    //   4128: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4131: pop
    //   4132: iinc #7, 1
    //   4135: iload_2
    //   4136: ifne -> 3997
    //   4139: sipush #-25650
    //   4142: sipush #-12128
    //   4145: invokestatic a : (II)Ljava/lang/String;
    //   4148: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4151: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4154: astore #5
    //   4156: aload #5
    //   4158: arraylength
    //   4159: istore #6
    //   4161: iconst_0
    //   4162: istore #7
    //   4164: iload #7
    //   4166: iload #6
    //   4168: if_icmpge -> 4305
    //   4171: aload #5
    //   4173: iload #7
    //   4175: aaload
    //   4176: astore #8
    //   4178: aload #8
    //   4180: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4183: pop
    //   4184: aload #8
    //   4186: invokevirtual getModifiers : ()I
    //   4189: invokestatic isStatic : (I)Z
    //   4192: ifeq -> 4291
    //   4195: aload #8
    //   4197: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4200: arraylength
    //   4201: iconst_2
    //   4202: if_icmpne -> 4291
    //   4205: goto -> 4212
    //   4208: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4211: athrow
    //   4212: aload #8
    //   4214: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4217: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4220: if_acmpne -> 4291
    //   4223: goto -> 4230
    //   4226: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4229: athrow
    //   4230: aload #8
    //   4232: iconst_1
    //   4233: invokevirtual setAccessible : (Z)V
    //   4236: aload #8
    //   4238: aconst_null
    //   4239: iconst_2
    //   4240: anewarray java/lang/Object
    //   4243: dup
    //   4244: iconst_0
    //   4245: aload_0
    //   4246: aastore
    //   4247: dup
    //   4248: iconst_1
    //   4249: aload_1
    //   4250: ifnonnull -> 4268
    //   4253: goto -> 4260
    //   4256: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4259: athrow
    //   4260: aload_1
    //   4261: goto -> 4275
    //   4264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4267: athrow
    //   4268: aload_1
    //   4269: checkcast [B
    //   4272: invokevirtual clone : ()Ljava/lang/Object;
    //   4275: aastore
    //   4276: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4279: checkcast java/lang/Boolean
    //   4282: invokevirtual booleanValue : ()Z
    //   4285: istore #4
    //   4287: iload_2
    //   4288: ifne -> 4305
    //   4291: iinc #7, 1
    //   4294: iload_2
    //   4295: ifne -> 4164
    //   4298: goto -> 4305
    //   4301: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4304: athrow
    //   4305: iload_2
    //   4306: ifne -> 4648
    //   4309: sipush #-25662
    //   4312: sipush #22498
    //   4315: invokestatic a : (II)Ljava/lang/String;
    //   4318: iconst_1
    //   4319: ldc burp/Zm7x
    //   4321: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4324: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4327: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4330: astore #5
    //   4332: aload #5
    //   4334: arraylength
    //   4335: istore #6
    //   4337: iconst_0
    //   4338: istore #7
    //   4340: iload #7
    //   4342: iload #6
    //   4344: if_icmpge -> 4482
    //   4347: aload #5
    //   4349: iload #7
    //   4351: aaload
    //   4352: astore #8
    //   4354: aload #8
    //   4356: invokevirtual getModifiers : ()I
    //   4359: invokestatic isStatic : (I)Z
    //   4362: ifne -> 4372
    //   4365: goto -> 4475
    //   4368: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4371: athrow
    //   4372: aload #8
    //   4374: invokevirtual getType : ()Ljava/lang/Class;
    //   4377: astore #9
    //   4379: aload #9
    //   4381: ifnull -> 4462
    //   4384: aload #9
    //   4386: invokevirtual isPrimitive : ()Z
    //   4389: ifne -> 4462
    //   4392: goto -> 4399
    //   4395: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4398: athrow
    //   4399: aload #9
    //   4401: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4404: ifnull -> 4462
    //   4407: goto -> 4414
    //   4410: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4413: athrow
    //   4414: aload #9
    //   4416: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4419: invokevirtual getName : ()Ljava/lang/String;
    //   4422: ifnull -> 4462
    //   4425: goto -> 4432
    //   4428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4431: athrow
    //   4432: aload #9
    //   4434: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4437: invokevirtual getName : ()Ljava/lang/String;
    //   4440: sipush #-25656
    //   4443: sipush #-27204
    //   4446: invokestatic a : (II)Ljava/lang/String;
    //   4449: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4452: ifne -> 4462
    //   4455: goto -> 4462
    //   4458: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4461: athrow
    //   4462: aload #8
    //   4464: iconst_1
    //   4465: invokevirtual setAccessible : (Z)V
    //   4468: aload #8
    //   4470: aconst_null
    //   4471: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4474: pop
    //   4475: iinc #7, 1
    //   4478: iload_2
    //   4479: ifne -> 4340
    //   4482: sipush #-25634
    //   4485: sipush #8950
    //   4488: invokestatic a : (II)Ljava/lang/String;
    //   4491: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4494: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4497: astore #5
    //   4499: aload #5
    //   4501: arraylength
    //   4502: istore #6
    //   4504: iconst_0
    //   4505: istore #7
    //   4507: iload #7
    //   4509: iload #6
    //   4511: if_icmpge -> 4648
    //   4514: aload #5
    //   4516: iload #7
    //   4518: aaload
    //   4519: astore #8
    //   4521: aload #8
    //   4523: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4526: pop
    //   4527: aload #8
    //   4529: invokevirtual getModifiers : ()I
    //   4532: invokestatic isStatic : (I)Z
    //   4535: ifeq -> 4634
    //   4538: aload #8
    //   4540: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4543: arraylength
    //   4544: iconst_2
    //   4545: if_icmpne -> 4634
    //   4548: goto -> 4555
    //   4551: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4554: athrow
    //   4555: aload #8
    //   4557: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4560: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4563: if_acmpne -> 4634
    //   4566: goto -> 4573
    //   4569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4572: athrow
    //   4573: aload #8
    //   4575: iconst_1
    //   4576: invokevirtual setAccessible : (Z)V
    //   4579: aload #8
    //   4581: aconst_null
    //   4582: iconst_2
    //   4583: anewarray java/lang/Object
    //   4586: dup
    //   4587: iconst_0
    //   4588: aload_0
    //   4589: aastore
    //   4590: dup
    //   4591: iconst_1
    //   4592: aload_1
    //   4593: ifnonnull -> 4611
    //   4596: goto -> 4603
    //   4599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4602: athrow
    //   4603: aload_1
    //   4604: goto -> 4618
    //   4607: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4610: athrow
    //   4611: aload_1
    //   4612: checkcast [B
    //   4615: invokevirtual clone : ()Ljava/lang/Object;
    //   4618: aastore
    //   4619: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4622: checkcast java/lang/Boolean
    //   4625: invokevirtual booleanValue : ()Z
    //   4628: istore #4
    //   4630: iload_2
    //   4631: ifne -> 4648
    //   4634: iinc #7, 1
    //   4637: iload_2
    //   4638: ifne -> 4507
    //   4641: goto -> 4648
    //   4644: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4647: athrow
    //   4648: iload #4
    //   4650: ireturn
    //   4651: astore_3
    //   4652: new java/lang/Exception
    //   4655: dup
    //   4656: aload_3
    //   4657: invokevirtual getMessage : ()Ljava/lang/String;
    //   4660: invokespecial <init> : (Ljava/lang/String;)V
    //   4663: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2450	4651	java/lang/Throwable
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
    //   1425	1439	1439	java/lang/Throwable
    //   1450	1463	1466	java/lang/Throwable
    //   1455	1478	1481	java/lang/Throwable
    //   1470	1496	1499	java/lang/Throwable
    //   1485	1526	1529	java/lang/Throwable
    //   1591	1618	1621	java/lang/Throwable
    //   1608	1639	1642	java/lang/Throwable
    //   1625	1669	1672	java/lang/Throwable
    //   1646	1680	1680	java/lang/Throwable
    //   1691	1707	1710	java/lang/Throwable
    //   1807	1821	1821	java/lang/Throwable
    //   1832	1845	1848	java/lang/Throwable
    //   1837	1860	1863	java/lang/Throwable
    //   1852	1878	1881	java/lang/Throwable
    //   1867	1908	1911	java/lang/Throwable
    //   1974	2001	2004	java/lang/Throwable
    //   1991	2019	2022	java/lang/Throwable
    //   2008	2049	2052	java/lang/Throwable
    //   2026	2060	2060	java/lang/Throwable
    //   2083	2094	2097	java/lang/Throwable
    //   2149	2163	2163	java/lang/Throwable
    //   2174	2187	2190	java/lang/Throwable
    //   2179	2202	2205	java/lang/Throwable
    //   2194	2220	2223	java/lang/Throwable
    //   2209	2250	2253	java/lang/Throwable
    //   2316	2343	2346	java/lang/Throwable
    //   2333	2361	2364	java/lang/Throwable
    //   2350	2391	2394	java/lang/Throwable
    //   2368	2402	2402	java/lang/Throwable
    //   2425	2436	2439	java/lang/Throwable
    //   2451	3185	4651	java/lang/Throwable
    //   2541	2555	2555	java/lang/Throwable
    //   2566	2579	2582	java/lang/Throwable
    //   2571	2594	2597	java/lang/Throwable
    //   2586	2612	2615	java/lang/Throwable
    //   2601	2642	2645	java/lang/Throwable
    //   2708	2735	2738	java/lang/Throwable
    //   2725	2753	2756	java/lang/Throwable
    //   2742	2783	2786	java/lang/Throwable
    //   2760	2794	2794	java/lang/Throwable
    //   2817	2828	2831	java/lang/Throwable
    //   2884	2898	2898	java/lang/Throwable
    //   2909	2922	2925	java/lang/Throwable
    //   2914	2937	2940	java/lang/Throwable
    //   2929	2955	2958	java/lang/Throwable
    //   2944	2985	2988	java/lang/Throwable
    //   3051	3078	3081	java/lang/Throwable
    //   3068	3096	3099	java/lang/Throwable
    //   3085	3126	3129	java/lang/Throwable
    //   3103	3137	3137	java/lang/Throwable
    //   3160	3171	3174	java/lang/Throwable
    //   3186	3920	4651	java/lang/Throwable
    //   3276	3290	3290	java/lang/Throwable
    //   3301	3314	3317	java/lang/Throwable
    //   3306	3329	3332	java/lang/Throwable
    //   3321	3347	3350	java/lang/Throwable
    //   3336	3377	3380	java/lang/Throwable
    //   3443	3470	3473	java/lang/Throwable
    //   3460	3488	3491	java/lang/Throwable
    //   3477	3518	3521	java/lang/Throwable
    //   3495	3529	3529	java/lang/Throwable
    //   3552	3563	3566	java/lang/Throwable
    //   3619	3633	3633	java/lang/Throwable
    //   3644	3657	3660	java/lang/Throwable
    //   3649	3672	3675	java/lang/Throwable
    //   3664	3690	3693	java/lang/Throwable
    //   3679	3720	3723	java/lang/Throwable
    //   3786	3813	3816	java/lang/Throwable
    //   3803	3831	3834	java/lang/Throwable
    //   3820	3861	3864	java/lang/Throwable
    //   3838	3872	3872	java/lang/Throwable
    //   3895	3906	3909	java/lang/Throwable
    //   3921	4650	4651	java/lang/Throwable
    //   4011	4025	4025	java/lang/Throwable
    //   4036	4049	4052	java/lang/Throwable
    //   4041	4064	4067	java/lang/Throwable
    //   4056	4082	4085	java/lang/Throwable
    //   4071	4112	4115	java/lang/Throwable
    //   4178	4205	4208	java/lang/Throwable
    //   4195	4223	4226	java/lang/Throwable
    //   4212	4253	4256	java/lang/Throwable
    //   4230	4264	4264	java/lang/Throwable
    //   4287	4298	4301	java/lang/Throwable
    //   4354	4368	4368	java/lang/Throwable
    //   4379	4392	4395	java/lang/Throwable
    //   4384	4407	4410	java/lang/Throwable
    //   4399	4425	4428	java/lang/Throwable
    //   4414	4455	4458	java/lang/Throwable
    //   4521	4548	4551	java/lang/Throwable
    //   4538	4566	4569	java/lang/Throwable
    //   4555	4596	4599	java/lang/Throwable
    //   4573	4607	4607	java/lang/Throwable
    //   4630	4641	4644	java/lang/Throwable
  }
  
  static void ZA(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '5±\\tP¢ NT]\\tnºb1Ï\\fãÑèMKaøJkJg7B&×ËÖ¬¢GLn?jÝ#m¿Gä¤-ùÏË8BãÞ^O%<1ª7½Ý_' +\\b­ÕÎ.ãéo^»âl±{c#G\\t¯lZëÈWúâ\\tÂ÷å}¿È7\\tSèÅ{;E}í!\\tµä ¶Á_|_é8¨ D|tR©¦ü6pü÷).eeÇ/§n£8g\\t[ÔÄüµd¦£\\t½´4¼Ò\\t§},xMz\\täu3Èå3­<Q\\tÊ)öC]B¬¢\\tÌ_6E¾eÕMÿïMËðÍ¼ÁU|gFÝ&iHF:(\á0ÕI/þê)íÜeyP¥0¹­Óý\\fòø¹°ÄYÀÃ¹£|¡}8ñçáíï²\\tÉEQ-\\t_¦D²|wï\\t@Êï\\tª[ú\\rÜa²\\t)1@Ò"B 4çñd>¨Ëìõ­GzÔ±j·T£.Ø#%*6^\\ta\íóyâ '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #88
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
    //   68: ldc '|U>ÒZnOy\\tÖLkñð\\nÇ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #97
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
    //   129: putstatic burp/Zein.a : [Ljava/lang/String;
    //   132: bipush #26
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zein.b : [Ljava/lang/String;
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
    //   212: bipush #46
    //   214: goto -> 244
    //   217: bipush #61
    //   219: goto -> 244
    //   222: bipush #101
    //   224: goto -> 244
    //   227: bipush #57
    //   229: goto -> 244
    //   232: bipush #110
    //   234: goto -> 244
    //   237: bipush #122
    //   239: goto -> 244
    //   242: bipush #23
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
    //   304: sipush #-25633
    //   307: sipush #12344
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zein.Zb : Ljava/lang/Object;
    //   319: sipush #-25639
    //   322: sipush #-11119
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zein.ZN : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9BCF) & 0xFFFF;
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
      char c = '¤';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zein.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */