package burp;

import java.math.BigInteger;

class Ztbn extends ClassLoader {
  static Object ZA;
  
  static String Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
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
    //   169: getstatic burp/Zt8m.ZT : Ljava/lang/String;
    //   172: getstatic burp/Zrw0.ZC : Ljava/lang/Object;
    //   175: checkcast java/math/BigInteger
    //   178: invokevirtual intValue : ()I
    //   181: bipush #32
    //   183: irem
    //   184: invokestatic abs : (I)I
    //   187: invokevirtual charAt : (I)C
    //   190: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: iload_2
    //   195: ifeq -> 1348
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   204: athrow
    //   205: aload_3
    //   206: getstatic burp/Ztq8.ZI : Ljava/lang/String;
    //   209: getstatic burp/Zrgo.ZJ : Ljava/lang/Object;
    //   212: checkcast java/math/BigInteger
    //   215: invokevirtual intValue : ()I
    //   218: bipush #32
    //   220: irem
    //   221: invokestatic abs : (I)I
    //   224: invokevirtual charAt : (I)C
    //   227: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: iload_2
    //   232: ifeq -> 1348
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   241: athrow
    //   242: aload_3
    //   243: getstatic burp/Zsko.Zd : Ljava/lang/String;
    //   246: getstatic burp/Zbun.ZH : Ljava/lang/Object;
    //   249: checkcast java/math/BigInteger
    //   252: invokevirtual intValue : ()I
    //   255: bipush #32
    //   257: irem
    //   258: invokestatic abs : (I)I
    //   261: invokevirtual charAt : (I)C
    //   264: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   267: pop
    //   268: iload_2
    //   269: ifeq -> 1348
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   278: athrow
    //   279: aload_3
    //   280: getstatic burp/Zr36.Ze : Ljava/lang/String;
    //   283: getstatic burp/Ztq8.Zm : Ljava/lang/Object;
    //   286: checkcast java/math/BigInteger
    //   289: invokevirtual intValue : ()I
    //   292: bipush #32
    //   294: irem
    //   295: invokestatic abs : (I)I
    //   298: invokevirtual charAt : (I)C
    //   301: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   304: pop
    //   305: iload_2
    //   306: ifeq -> 1348
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   315: athrow
    //   316: aload_3
    //   317: getstatic burp/Zxcn.ZF : Ljava/lang/String;
    //   320: getstatic burp/Zs3m.ZW : Ljava/lang/Object;
    //   323: checkcast java/math/BigInteger
    //   326: invokevirtual intValue : ()I
    //   329: bipush #32
    //   331: irem
    //   332: invokestatic abs : (I)I
    //   335: invokevirtual charAt : (I)C
    //   338: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   341: pop
    //   342: iload_2
    //   343: ifeq -> 1348
    //   346: goto -> 353
    //   349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   352: athrow
    //   353: aload_3
    //   354: getstatic burp/Zrtp.Zq : Ljava/lang/String;
    //   357: getstatic burp/Zgtx.Z_ : Ljava/lang/Object;
    //   360: checkcast java/math/BigInteger
    //   363: invokevirtual intValue : ()I
    //   366: bipush #32
    //   368: irem
    //   369: invokestatic abs : (I)I
    //   372: invokevirtual charAt : (I)C
    //   375: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: iload_2
    //   380: ifeq -> 1348
    //   383: goto -> 390
    //   386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   389: athrow
    //   390: aload_3
    //   391: getstatic burp/Zl7x.Zo : Ljava/lang/String;
    //   394: getstatic burp/Zrkw.ZV : Ljava/lang/Object;
    //   397: checkcast java/math/BigInteger
    //   400: invokevirtual intValue : ()I
    //   403: bipush #32
    //   405: irem
    //   406: invokestatic abs : (I)I
    //   409: invokevirtual charAt : (I)C
    //   412: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   415: pop
    //   416: iload_2
    //   417: ifeq -> 1348
    //   420: goto -> 427
    //   423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   426: athrow
    //   427: aload_3
    //   428: getstatic burp/Zsjc.ZO : Ljava/lang/String;
    //   431: getstatic burp/Zl3j.ZY : Ljava/lang/Object;
    //   434: checkcast java/math/BigInteger
    //   437: invokevirtual intValue : ()I
    //   440: bipush #32
    //   442: irem
    //   443: invokestatic abs : (I)I
    //   446: invokevirtual charAt : (I)C
    //   449: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   452: pop
    //   453: iload_2
    //   454: ifeq -> 1348
    //   457: goto -> 464
    //   460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   463: athrow
    //   464: aload_3
    //   465: getstatic burp/Zk8i.ZS : Ljava/lang/String;
    //   468: getstatic burp/Ztwp.Ze : Ljava/lang/Object;
    //   471: checkcast java/math/BigInteger
    //   474: invokevirtual intValue : ()I
    //   477: bipush #32
    //   479: irem
    //   480: invokestatic abs : (I)I
    //   483: invokevirtual charAt : (I)C
    //   486: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   489: pop
    //   490: iload_2
    //   491: ifeq -> 1348
    //   494: goto -> 501
    //   497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   500: athrow
    //   501: aload_3
    //   502: getstatic burp/Zsu2.Zq : Ljava/lang/String;
    //   505: getstatic burp/Ze4g.Zz : Ljava/lang/Object;
    //   508: checkcast java/math/BigInteger
    //   511: invokevirtual intValue : ()I
    //   514: bipush #32
    //   516: irem
    //   517: invokestatic abs : (I)I
    //   520: invokevirtual charAt : (I)C
    //   523: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   526: pop
    //   527: iload_2
    //   528: ifeq -> 1348
    //   531: goto -> 538
    //   534: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   537: athrow
    //   538: aload_3
    //   539: getstatic burp/Ze4g.Zk : Ljava/lang/String;
    //   542: getstatic burp/Zg0q.Zf : Ljava/lang/Object;
    //   545: checkcast java/math/BigInteger
    //   548: invokevirtual intValue : ()I
    //   551: bipush #32
    //   553: irem
    //   554: invokestatic abs : (I)I
    //   557: invokevirtual charAt : (I)C
    //   560: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   563: pop
    //   564: iload_2
    //   565: ifeq -> 1348
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   574: athrow
    //   575: aload_3
    //   576: getstatic burp/Zrp2.ZJ : Ljava/lang/String;
    //   579: getstatic burp/Zmkq.Zg : Ljava/lang/Object;
    //   582: checkcast java/math/BigInteger
    //   585: invokevirtual intValue : ()I
    //   588: bipush #32
    //   590: irem
    //   591: invokestatic abs : (I)I
    //   594: invokevirtual charAt : (I)C
    //   597: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   600: pop
    //   601: iload_2
    //   602: ifeq -> 1348
    //   605: goto -> 612
    //   608: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   611: athrow
    //   612: aload_3
    //   613: getstatic burp/Zz66.ZM : Ljava/lang/String;
    //   616: getstatic burp/Zgcg.Zi : Ljava/lang/Object;
    //   619: checkcast java/math/BigInteger
    //   622: invokevirtual intValue : ()I
    //   625: bipush #32
    //   627: irem
    //   628: invokestatic abs : (I)I
    //   631: invokevirtual charAt : (I)C
    //   634: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   637: pop
    //   638: iload_2
    //   639: ifeq -> 1348
    //   642: goto -> 649
    //   645: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   648: athrow
    //   649: aload_3
    //   650: getstatic burp/Zmlr.ZJ : Ljava/lang/String;
    //   653: getstatic burp/Zxci.Zx : Ljava/lang/Object;
    //   656: checkcast java/math/BigInteger
    //   659: invokevirtual intValue : ()I
    //   662: bipush #32
    //   664: irem
    //   665: invokestatic abs : (I)I
    //   668: invokevirtual charAt : (I)C
    //   671: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   674: pop
    //   675: iload_2
    //   676: ifeq -> 1348
    //   679: goto -> 686
    //   682: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   685: athrow
    //   686: aload_3
    //   687: getstatic burp/Zg4l.Z_ : Ljava/lang/String;
    //   690: getstatic burp/Zrt3.ZG : Ljava/lang/Object;
    //   693: checkcast java/math/BigInteger
    //   696: invokevirtual intValue : ()I
    //   699: bipush #32
    //   701: irem
    //   702: invokestatic abs : (I)I
    //   705: invokevirtual charAt : (I)C
    //   708: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   711: pop
    //   712: iload_2
    //   713: ifeq -> 1348
    //   716: goto -> 723
    //   719: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   722: athrow
    //   723: aload_3
    //   724: getstatic burp/Zld9.Zx : Ljava/lang/String;
    //   727: getstatic burp/Zrww.ZN : Ljava/lang/Object;
    //   730: checkcast java/math/BigInteger
    //   733: invokevirtual intValue : ()I
    //   736: bipush #32
    //   738: irem
    //   739: invokestatic abs : (I)I
    //   742: invokevirtual charAt : (I)C
    //   745: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   748: pop
    //   749: iload_2
    //   750: ifeq -> 1348
    //   753: goto -> 760
    //   756: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   759: athrow
    //   760: aload_3
    //   761: getstatic burp/Zl_a.ZD : Ljava/lang/String;
    //   764: getstatic burp/Ztq4.ZA : Ljava/lang/Object;
    //   767: checkcast java/math/BigInteger
    //   770: invokevirtual intValue : ()I
    //   773: bipush #32
    //   775: irem
    //   776: invokestatic abs : (I)I
    //   779: invokevirtual charAt : (I)C
    //   782: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   785: pop
    //   786: iload_2
    //   787: ifeq -> 1348
    //   790: goto -> 797
    //   793: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   796: athrow
    //   797: aload_3
    //   798: getstatic burp/Zes.ZW : Ljava/lang/String;
    //   801: getstatic burp/Zej8.Zu : Ljava/lang/Object;
    //   804: checkcast java/math/BigInteger
    //   807: invokevirtual intValue : ()I
    //   810: bipush #32
    //   812: irem
    //   813: invokestatic abs : (I)I
    //   816: invokevirtual charAt : (I)C
    //   819: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   822: pop
    //   823: iload_2
    //   824: ifeq -> 1348
    //   827: goto -> 834
    //   830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   833: athrow
    //   834: aload_3
    //   835: getstatic burp/Zllk.Zs : Ljava/lang/String;
    //   838: getstatic burp/Zelt.ZC : Ljava/lang/Object;
    //   841: checkcast java/math/BigInteger
    //   844: invokevirtual intValue : ()I
    //   847: bipush #32
    //   849: irem
    //   850: invokestatic abs : (I)I
    //   853: invokevirtual charAt : (I)C
    //   856: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   859: pop
    //   860: iload_2
    //   861: ifeq -> 1348
    //   864: goto -> 871
    //   867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   870: athrow
    //   871: aload_3
    //   872: getstatic burp/Zlwc.ZM : Ljava/lang/String;
    //   875: getstatic burp/Zsfj.ZL : Ljava/lang/Object;
    //   878: checkcast java/math/BigInteger
    //   881: invokevirtual intValue : ()I
    //   884: bipush #32
    //   886: irem
    //   887: invokestatic abs : (I)I
    //   890: invokevirtual charAt : (I)C
    //   893: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   896: pop
    //   897: iload_2
    //   898: ifeq -> 1348
    //   901: goto -> 908
    //   904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   907: athrow
    //   908: aload_3
    //   909: getstatic burp/Zdv.Zz : Ljava/lang/String;
    //   912: getstatic burp/Zb2n.ZR : Ljava/lang/Object;
    //   915: checkcast java/math/BigInteger
    //   918: invokevirtual intValue : ()I
    //   921: bipush #32
    //   923: irem
    //   924: invokestatic abs : (I)I
    //   927: invokevirtual charAt : (I)C
    //   930: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   933: pop
    //   934: iload_2
    //   935: ifeq -> 1348
    //   938: goto -> 945
    //   941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   944: athrow
    //   945: aload_3
    //   946: getstatic burp/Zg0f.Zd : Ljava/lang/String;
    //   949: getstatic burp/Zg0q.Zf : Ljava/lang/Object;
    //   952: checkcast java/math/BigInteger
    //   955: invokevirtual intValue : ()I
    //   958: bipush #32
    //   960: irem
    //   961: invokestatic abs : (I)I
    //   964: invokevirtual charAt : (I)C
    //   967: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   970: pop
    //   971: iload_2
    //   972: ifeq -> 1348
    //   975: goto -> 982
    //   978: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   981: athrow
    //   982: aload_3
    //   983: getstatic burp/Zzi_.ZG : Ljava/lang/String;
    //   986: getstatic burp/Zg6z.ZS : Ljava/lang/Object;
    //   989: checkcast java/math/BigInteger
    //   992: invokevirtual intValue : ()I
    //   995: bipush #32
    //   997: irem
    //   998: invokestatic abs : (I)I
    //   1001: invokevirtual charAt : (I)C
    //   1004: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1007: pop
    //   1008: iload_2
    //   1009: ifeq -> 1348
    //   1012: goto -> 1019
    //   1015: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1018: athrow
    //   1019: aload_3
    //   1020: getstatic burp/Ze4w.Zc : Ljava/lang/String;
    //   1023: getstatic burp/Zql.Zt : Ljava/lang/Object;
    //   1026: checkcast java/math/BigInteger
    //   1029: invokevirtual intValue : ()I
    //   1032: bipush #32
    //   1034: irem
    //   1035: invokestatic abs : (I)I
    //   1038: invokevirtual charAt : (I)C
    //   1041: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1044: pop
    //   1045: iload_2
    //   1046: ifeq -> 1348
    //   1049: goto -> 1056
    //   1052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1055: athrow
    //   1056: aload_3
    //   1057: getstatic burp/Zrkw.ZU : Ljava/lang/String;
    //   1060: getstatic burp/Zm7v.ZP : Ljava/lang/Object;
    //   1063: checkcast java/math/BigInteger
    //   1066: invokevirtual intValue : ()I
    //   1069: bipush #32
    //   1071: irem
    //   1072: invokestatic abs : (I)I
    //   1075: invokevirtual charAt : (I)C
    //   1078: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1081: pop
    //   1082: iload_2
    //   1083: ifeq -> 1348
    //   1086: goto -> 1093
    //   1089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1092: athrow
    //   1093: aload_3
    //   1094: getstatic burp/Zt7x.Zu : Ljava/lang/String;
    //   1097: getstatic burp/Zxxf.ZZ : Ljava/lang/Object;
    //   1100: checkcast java/math/BigInteger
    //   1103: invokevirtual intValue : ()I
    //   1106: bipush #32
    //   1108: irem
    //   1109: invokestatic abs : (I)I
    //   1112: invokevirtual charAt : (I)C
    //   1115: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1118: pop
    //   1119: iload_2
    //   1120: ifeq -> 1348
    //   1123: goto -> 1130
    //   1126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1129: athrow
    //   1130: aload_3
    //   1131: getstatic burp/Zgeq.ZF : Ljava/lang/String;
    //   1134: getstatic burp/Zzht.Zb : Ljava/lang/Object;
    //   1137: checkcast java/math/BigInteger
    //   1140: invokevirtual intValue : ()I
    //   1143: bipush #32
    //   1145: irem
    //   1146: invokestatic abs : (I)I
    //   1149: invokevirtual charAt : (I)C
    //   1152: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1155: pop
    //   1156: iload_2
    //   1157: ifeq -> 1348
    //   1160: goto -> 1167
    //   1163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1166: athrow
    //   1167: aload_3
    //   1168: getstatic burp/Zxd1.ZQ : Ljava/lang/String;
    //   1171: getstatic burp/Ze84.Zj : Ljava/lang/Object;
    //   1174: checkcast java/math/BigInteger
    //   1177: invokevirtual intValue : ()I
    //   1180: bipush #32
    //   1182: irem
    //   1183: invokestatic abs : (I)I
    //   1186: invokevirtual charAt : (I)C
    //   1189: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1192: pop
    //   1193: iload_2
    //   1194: ifeq -> 1348
    //   1197: goto -> 1204
    //   1200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1203: athrow
    //   1204: aload_3
    //   1205: getstatic burp/Zlbd.Zq : Ljava/lang/String;
    //   1208: getstatic burp/Zgu4.Zs : Ljava/lang/Object;
    //   1211: checkcast java/math/BigInteger
    //   1214: invokevirtual intValue : ()I
    //   1217: bipush #32
    //   1219: irem
    //   1220: invokestatic abs : (I)I
    //   1223: invokevirtual charAt : (I)C
    //   1226: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1229: pop
    //   1230: iload_2
    //   1231: ifeq -> 1348
    //   1234: goto -> 1241
    //   1237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1240: athrow
    //   1241: aload_3
    //   1242: getstatic burp/Zlwj.ZQ : Ljava/lang/String;
    //   1245: getstatic burp/Zm0d.Zz : Ljava/lang/Object;
    //   1248: checkcast java/math/BigInteger
    //   1251: invokevirtual intValue : ()I
    //   1254: bipush #32
    //   1256: irem
    //   1257: invokestatic abs : (I)I
    //   1260: invokevirtual charAt : (I)C
    //   1263: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1266: pop
    //   1267: iload_2
    //   1268: ifeq -> 1348
    //   1271: goto -> 1278
    //   1274: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1277: athrow
    //   1278: aload_3
    //   1279: getstatic burp/Zkkl.Zh : Ljava/lang/String;
    //   1282: getstatic burp/Zgrz.ZX : Ljava/lang/Object;
    //   1285: checkcast java/math/BigInteger
    //   1288: invokevirtual intValue : ()I
    //   1291: bipush #32
    //   1293: irem
    //   1294: invokestatic abs : (I)I
    //   1297: invokevirtual charAt : (I)C
    //   1300: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1303: pop
    //   1304: iload_2
    //   1305: ifeq -> 1348
    //   1308: goto -> 1315
    //   1311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1314: athrow
    //   1315: aload_3
    //   1316: getstatic burp/Zgpx.Z_ : Ljava/lang/String;
    //   1319: getstatic burp/Zrnk.ZM : Ljava/lang/Object;
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
    //   1352: ifeq -> 15
    //   1355: aload_3
    //   1356: invokevirtual toString : ()Ljava/lang/String;
    //   1359: putstatic burp/Zg61.ZX : Ljava/lang/String;
    //   1362: sipush #7290
    //   1365: getstatic burp/Zzr8.ZC : Ljava/lang/Object;
    //   1368: checkcast java/math/BigInteger
    //   1371: getstatic burp/Zv8d.ZN : Ljava/lang/Object;
    //   1374: checkcast java/math/BigInteger
    //   1377: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1380: putstatic burp/Zr1t.ZP : Ljava/lang/Object;
    //   1383: sipush #11103
    //   1386: invokestatic a : (II)Ljava/lang/String;
    //   1389: iconst_1
    //   1390: ldc burp/Zkvr
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
    //   1511: sipush #7278
    //   1514: sipush #-4528
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
    //   1550: ifeq -> 1411
    //   1553: sipush #7291
    //   1556: sipush #-19700
    //   1559: invokestatic a : (II)Ljava/lang/String;
    //   1562: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1565: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1568: astore #4
    //   1570: aload #4
    //   1572: arraylength
    //   1573: istore #5
    //   1575: iconst_0
    //   1576: istore #6
    //   1578: iload #6
    //   1580: iload #5
    //   1582: if_icmpge -> 1715
    //   1585: aload #4
    //   1587: iload #6
    //   1589: aaload
    //   1590: astore #7
    //   1592: aload #7
    //   1594: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1597: pop
    //   1598: aload #7
    //   1600: invokevirtual getModifiers : ()I
    //   1603: invokestatic isStatic : (I)Z
    //   1606: ifeq -> 1701
    //   1609: aload #7
    //   1611: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1614: arraylength
    //   1615: iconst_2
    //   1616: if_icmpne -> 1701
    //   1619: goto -> 1626
    //   1622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1625: athrow
    //   1626: aload #7
    //   1628: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1631: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1634: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1637: ifeq -> 1701
    //   1640: goto -> 1647
    //   1643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1646: athrow
    //   1647: aload #7
    //   1649: iconst_1
    //   1650: invokevirtual setAccessible : (Z)V
    //   1653: aload #7
    //   1655: aconst_null
    //   1656: iconst_2
    //   1657: anewarray java/lang/Object
    //   1660: dup
    //   1661: iconst_0
    //   1662: aload_0
    //   1663: aastore
    //   1664: dup
    //   1665: iconst_1
    //   1666: aload_1
    //   1667: ifnonnull -> 1685
    //   1670: goto -> 1677
    //   1673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1676: athrow
    //   1677: aload_1
    //   1678: goto -> 1692
    //   1681: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1684: athrow
    //   1685: aload_1
    //   1686: checkcast [B
    //   1689: invokevirtual clone : ()Ljava/lang/Object;
    //   1692: aastore
    //   1693: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1696: pop
    //   1697: iload_2
    //   1698: ifeq -> 1715
    //   1701: iinc #6, 1
    //   1704: iload_2
    //   1705: ifeq -> 1578
    //   1708: goto -> 1715
    //   1711: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1714: athrow
    //   1715: sipush #7293
    //   1718: sipush #14928
    //   1721: invokestatic a : (II)Ljava/lang/String;
    //   1724: iconst_1
    //   1725: ldc burp/Zzxs
    //   1727: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1730: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1733: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1736: astore #4
    //   1738: aload #4
    //   1740: arraylength
    //   1741: istore #5
    //   1743: iconst_0
    //   1744: istore #6
    //   1746: iload #6
    //   1748: iload #5
    //   1750: if_icmpge -> 1888
    //   1753: aload #4
    //   1755: iload #6
    //   1757: aaload
    //   1758: astore #7
    //   1760: aload #7
    //   1762: invokevirtual getModifiers : ()I
    //   1765: invokestatic isStatic : (I)Z
    //   1768: ifne -> 1778
    //   1771: goto -> 1881
    //   1774: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1777: athrow
    //   1778: aload #7
    //   1780: invokevirtual getType : ()Ljava/lang/Class;
    //   1783: astore #8
    //   1785: aload #8
    //   1787: ifnull -> 1868
    //   1790: aload #8
    //   1792: invokevirtual isPrimitive : ()Z
    //   1795: ifne -> 1868
    //   1798: goto -> 1805
    //   1801: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1804: athrow
    //   1805: aload #8
    //   1807: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1810: ifnull -> 1868
    //   1813: goto -> 1820
    //   1816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1819: athrow
    //   1820: aload #8
    //   1822: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1825: invokevirtual getName : ()Ljava/lang/String;
    //   1828: ifnull -> 1868
    //   1831: goto -> 1838
    //   1834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1837: athrow
    //   1838: aload #8
    //   1840: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1843: invokevirtual getName : ()Ljava/lang/String;
    //   1846: sipush #7272
    //   1849: sipush #-8842
    //   1852: invokestatic a : (II)Ljava/lang/String;
    //   1855: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1858: ifne -> 1868
    //   1861: goto -> 1868
    //   1864: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1867: athrow
    //   1868: aload #7
    //   1870: iconst_1
    //   1871: invokevirtual setAccessible : (Z)V
    //   1874: aload #7
    //   1876: aconst_null
    //   1877: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1880: pop
    //   1881: iinc #6, 1
    //   1884: iload_2
    //   1885: ifeq -> 1746
    //   1888: sipush #7271
    //   1891: sipush #-12322
    //   1894: invokestatic a : (II)Ljava/lang/String;
    //   1897: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1900: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1903: astore #4
    //   1905: aload #4
    //   1907: arraylength
    //   1908: istore #5
    //   1910: iconst_0
    //   1911: istore #6
    //   1913: iload #6
    //   1915: iload #5
    //   1917: if_icmpge -> 2029
    //   1920: aload #4
    //   1922: iload #6
    //   1924: aaload
    //   1925: astore #7
    //   1927: aload #7
    //   1929: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1932: pop
    //   1933: aload #7
    //   1935: invokevirtual getModifiers : ()I
    //   1938: invokestatic isStatic : (I)Z
    //   1941: ifeq -> 2015
    //   1944: aload #7
    //   1946: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1949: arraylength
    //   1950: iconst_2
    //   1951: if_icmpne -> 2015
    //   1954: goto -> 1961
    //   1957: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1960: athrow
    //   1961: aload #7
    //   1963: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1966: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1969: if_acmpne -> 2015
    //   1972: goto -> 1979
    //   1975: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1978: athrow
    //   1979: aload #7
    //   1981: iconst_1
    //   1982: invokevirtual setAccessible : (Z)V
    //   1985: aload #7
    //   1987: aconst_null
    //   1988: iconst_2
    //   1989: anewarray java/lang/Object
    //   1992: dup
    //   1993: iconst_0
    //   1994: aload_0
    //   1995: aastore
    //   1996: dup
    //   1997: iconst_1
    //   1998: aload_1
    //   1999: aastore
    //   2000: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2003: pop
    //   2004: iload_2
    //   2005: ifeq -> 2029
    //   2008: goto -> 2015
    //   2011: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2014: athrow
    //   2015: iinc #6, 1
    //   2018: iload_2
    //   2019: ifeq -> 1913
    //   2022: goto -> 2029
    //   2025: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2028: athrow
    //   2029: iconst_0
    //   2030: istore #4
    //   2032: getstatic burp/Zg4z.Zm : Ljava/lang/String;
    //   2035: getstatic burp/Zmll.ZU : Ljava/lang/Object;
    //   2038: checkcast java/math/BigInteger
    //   2041: invokevirtual intValue : ()I
    //   2044: bipush #32
    //   2046: irem
    //   2047: invokestatic abs : (I)I
    //   2050: invokevirtual charAt : (I)C
    //   2053: getstatic burp/Zea9.Zd : Ljava/lang/String;
    //   2056: getstatic burp/Zr14.Zy : Ljava/lang/Object;
    //   2059: checkcast java/math/BigInteger
    //   2062: invokevirtual intValue : ()I
    //   2065: bipush #32
    //   2067: irem
    //   2068: invokestatic abs : (I)I
    //   2071: invokevirtual charAt : (I)C
    //   2074: if_icmple -> 2419
    //   2077: sipush #7284
    //   2080: sipush #6780
    //   2083: invokestatic a : (II)Ljava/lang/String;
    //   2086: iconst_1
    //   2087: ldc burp/Zz16
    //   2089: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2092: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2095: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2098: astore #5
    //   2100: aload #5
    //   2102: arraylength
    //   2103: istore #6
    //   2105: iconst_0
    //   2106: istore #7
    //   2108: iload #7
    //   2110: iload #6
    //   2112: if_icmpge -> 2250
    //   2115: aload #5
    //   2117: iload #7
    //   2119: aaload
    //   2120: astore #8
    //   2122: aload #8
    //   2124: invokevirtual getModifiers : ()I
    //   2127: invokestatic isStatic : (I)Z
    //   2130: ifne -> 2140
    //   2133: goto -> 2243
    //   2136: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2139: athrow
    //   2140: aload #8
    //   2142: invokevirtual getType : ()Ljava/lang/Class;
    //   2145: astore #9
    //   2147: aload #9
    //   2149: ifnull -> 2230
    //   2152: aload #9
    //   2154: invokevirtual isPrimitive : ()Z
    //   2157: ifne -> 2230
    //   2160: goto -> 2167
    //   2163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2166: athrow
    //   2167: aload #9
    //   2169: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2172: ifnull -> 2230
    //   2175: goto -> 2182
    //   2178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2181: athrow
    //   2182: aload #9
    //   2184: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2187: invokevirtual getName : ()Ljava/lang/String;
    //   2190: ifnull -> 2230
    //   2193: goto -> 2200
    //   2196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2199: athrow
    //   2200: aload #9
    //   2202: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2205: invokevirtual getName : ()Ljava/lang/String;
    //   2208: sipush #7272
    //   2211: sipush #-8842
    //   2214: invokestatic a : (II)Ljava/lang/String;
    //   2217: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2220: ifne -> 2230
    //   2223: goto -> 2230
    //   2226: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2229: athrow
    //   2230: aload #8
    //   2232: iconst_1
    //   2233: invokevirtual setAccessible : (Z)V
    //   2236: aload #8
    //   2238: aconst_null
    //   2239: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2242: pop
    //   2243: iinc #7, 1
    //   2246: iload_2
    //   2247: ifeq -> 2108
    //   2250: sipush #7287
    //   2253: sipush #-10971
    //   2256: invokestatic a : (II)Ljava/lang/String;
    //   2259: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2262: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2265: astore #5
    //   2267: aload #5
    //   2269: arraylength
    //   2270: istore #6
    //   2272: iconst_0
    //   2273: istore #7
    //   2275: iload #7
    //   2277: iload #6
    //   2279: if_icmpge -> 2416
    //   2282: aload #5
    //   2284: iload #7
    //   2286: aaload
    //   2287: astore #8
    //   2289: aload #8
    //   2291: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2294: pop
    //   2295: aload #8
    //   2297: invokevirtual getModifiers : ()I
    //   2300: invokestatic isStatic : (I)Z
    //   2303: ifeq -> 2402
    //   2306: aload #8
    //   2308: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2311: arraylength
    //   2312: iconst_2
    //   2313: if_icmpne -> 2402
    //   2316: goto -> 2323
    //   2319: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2322: athrow
    //   2323: aload #8
    //   2325: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2328: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2331: if_acmpne -> 2402
    //   2334: goto -> 2341
    //   2337: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2340: athrow
    //   2341: aload #8
    //   2343: iconst_1
    //   2344: invokevirtual setAccessible : (Z)V
    //   2347: aload #8
    //   2349: aconst_null
    //   2350: iconst_2
    //   2351: anewarray java/lang/Object
    //   2354: dup
    //   2355: iconst_0
    //   2356: aload_0
    //   2357: aastore
    //   2358: dup
    //   2359: iconst_1
    //   2360: aload_1
    //   2361: ifnonnull -> 2379
    //   2364: goto -> 2371
    //   2367: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2370: athrow
    //   2371: aload_1
    //   2372: goto -> 2386
    //   2375: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2378: athrow
    //   2379: aload_1
    //   2380: checkcast [B
    //   2383: invokevirtual clone : ()Ljava/lang/Object;
    //   2386: aastore
    //   2387: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2390: checkcast java/lang/Boolean
    //   2393: invokevirtual booleanValue : ()Z
    //   2396: istore #4
    //   2398: iload_2
    //   2399: ifeq -> 2416
    //   2402: iinc #7, 1
    //   2405: iload_2
    //   2406: ifeq -> 2275
    //   2409: goto -> 2416
    //   2412: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2415: athrow
    //   2416: goto -> 2758
    //   2419: sipush #7283
    //   2422: sipush #8064
    //   2425: invokestatic a : (II)Ljava/lang/String;
    //   2428: iconst_1
    //   2429: ldc burp/Zm14
    //   2431: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2434: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2437: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2440: astore #5
    //   2442: aload #5
    //   2444: arraylength
    //   2445: istore #6
    //   2447: iconst_0
    //   2448: istore #7
    //   2450: iload #7
    //   2452: iload #6
    //   2454: if_icmpge -> 2592
    //   2457: aload #5
    //   2459: iload #7
    //   2461: aaload
    //   2462: astore #8
    //   2464: aload #8
    //   2466: invokevirtual getModifiers : ()I
    //   2469: invokestatic isStatic : (I)Z
    //   2472: ifne -> 2482
    //   2475: goto -> 2585
    //   2478: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2481: athrow
    //   2482: aload #8
    //   2484: invokevirtual getType : ()Ljava/lang/Class;
    //   2487: astore #9
    //   2489: aload #9
    //   2491: ifnull -> 2572
    //   2494: aload #9
    //   2496: invokevirtual isPrimitive : ()Z
    //   2499: ifne -> 2572
    //   2502: goto -> 2509
    //   2505: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2508: athrow
    //   2509: aload #9
    //   2511: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2514: ifnull -> 2572
    //   2517: goto -> 2524
    //   2520: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2523: athrow
    //   2524: aload #9
    //   2526: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2529: invokevirtual getName : ()Ljava/lang/String;
    //   2532: ifnull -> 2572
    //   2535: goto -> 2542
    //   2538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2541: athrow
    //   2542: aload #9
    //   2544: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2547: invokevirtual getName : ()Ljava/lang/String;
    //   2550: sipush #7272
    //   2553: sipush #-8842
    //   2556: invokestatic a : (II)Ljava/lang/String;
    //   2559: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2562: ifne -> 2572
    //   2565: goto -> 2572
    //   2568: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2571: athrow
    //   2572: aload #8
    //   2574: iconst_1
    //   2575: invokevirtual setAccessible : (Z)V
    //   2578: aload #8
    //   2580: aconst_null
    //   2581: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2584: pop
    //   2585: iinc #7, 1
    //   2588: iload_2
    //   2589: ifeq -> 2450
    //   2592: sipush #7289
    //   2595: sipush #29563
    //   2598: invokestatic a : (II)Ljava/lang/String;
    //   2601: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2604: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2607: astore #5
    //   2609: aload #5
    //   2611: arraylength
    //   2612: istore #6
    //   2614: iconst_0
    //   2615: istore #7
    //   2617: iload #7
    //   2619: iload #6
    //   2621: if_icmpge -> 2758
    //   2624: aload #5
    //   2626: iload #7
    //   2628: aaload
    //   2629: astore #8
    //   2631: aload #8
    //   2633: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2636: pop
    //   2637: aload #8
    //   2639: invokevirtual getModifiers : ()I
    //   2642: invokestatic isStatic : (I)Z
    //   2645: ifeq -> 2744
    //   2648: aload #8
    //   2650: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2653: arraylength
    //   2654: iconst_2
    //   2655: if_icmpne -> 2744
    //   2658: goto -> 2665
    //   2661: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2664: athrow
    //   2665: aload #8
    //   2667: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2670: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2673: if_acmpne -> 2744
    //   2676: goto -> 2683
    //   2679: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2682: athrow
    //   2683: aload #8
    //   2685: iconst_1
    //   2686: invokevirtual setAccessible : (Z)V
    //   2689: aload #8
    //   2691: aconst_null
    //   2692: iconst_2
    //   2693: anewarray java/lang/Object
    //   2696: dup
    //   2697: iconst_0
    //   2698: aload_0
    //   2699: aastore
    //   2700: dup
    //   2701: iconst_1
    //   2702: aload_1
    //   2703: ifnonnull -> 2721
    //   2706: goto -> 2713
    //   2709: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2712: athrow
    //   2713: aload_1
    //   2714: goto -> 2728
    //   2717: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2720: athrow
    //   2721: aload_1
    //   2722: checkcast [B
    //   2725: invokevirtual clone : ()Ljava/lang/Object;
    //   2728: aastore
    //   2729: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2732: checkcast java/lang/Boolean
    //   2735: invokevirtual booleanValue : ()Z
    //   2738: istore #4
    //   2740: iload_2
    //   2741: ifeq -> 2758
    //   2744: iinc #7, 1
    //   2747: iload_2
    //   2748: ifeq -> 2617
    //   2751: goto -> 2758
    //   2754: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2757: athrow
    //   2758: iload #4
    //   2760: ifeq -> 2766
    //   2763: iload #4
    //   2765: ireturn
    //   2766: getstatic burp/Zld9.Zx : Ljava/lang/String;
    //   2769: getstatic burp/Zrww.ZN : Ljava/lang/Object;
    //   2772: checkcast java/math/BigInteger
    //   2775: invokevirtual intValue : ()I
    //   2778: bipush #32
    //   2780: irem
    //   2781: invokestatic abs : (I)I
    //   2784: invokevirtual charAt : (I)C
    //   2787: getstatic burp/Zti7.Zc : Ljava/lang/String;
    //   2790: getstatic burp/Zx5w.Zo : Ljava/lang/Object;
    //   2793: checkcast java/math/BigInteger
    //   2796: invokevirtual intValue : ()I
    //   2799: bipush #32
    //   2801: irem
    //   2802: invokestatic abs : (I)I
    //   2805: invokevirtual charAt : (I)C
    //   2808: if_icmpgt -> 3154
    //   2811: sipush #7276
    //   2814: sipush #16296
    //   2817: invokestatic a : (II)Ljava/lang/String;
    //   2820: iconst_1
    //   2821: ldc burp/Zmli
    //   2823: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2826: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2829: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2832: astore #5
    //   2834: aload #5
    //   2836: arraylength
    //   2837: istore #6
    //   2839: iconst_0
    //   2840: istore #7
    //   2842: iload #7
    //   2844: iload #6
    //   2846: if_icmpge -> 2984
    //   2849: aload #5
    //   2851: iload #7
    //   2853: aaload
    //   2854: astore #8
    //   2856: aload #8
    //   2858: invokevirtual getModifiers : ()I
    //   2861: invokestatic isStatic : (I)Z
    //   2864: ifne -> 2874
    //   2867: goto -> 2977
    //   2870: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2873: athrow
    //   2874: aload #8
    //   2876: invokevirtual getType : ()Ljava/lang/Class;
    //   2879: astore #9
    //   2881: aload #9
    //   2883: ifnull -> 2964
    //   2886: aload #9
    //   2888: invokevirtual isPrimitive : ()Z
    //   2891: ifne -> 2964
    //   2894: goto -> 2901
    //   2897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2900: athrow
    //   2901: aload #9
    //   2903: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2906: ifnull -> 2964
    //   2909: goto -> 2916
    //   2912: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2915: athrow
    //   2916: aload #9
    //   2918: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2921: invokevirtual getName : ()Ljava/lang/String;
    //   2924: ifnull -> 2964
    //   2927: goto -> 2934
    //   2930: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2933: athrow
    //   2934: aload #9
    //   2936: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2939: invokevirtual getName : ()Ljava/lang/String;
    //   2942: sipush #7272
    //   2945: sipush #-8842
    //   2948: invokestatic a : (II)Ljava/lang/String;
    //   2951: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2954: ifne -> 2964
    //   2957: goto -> 2964
    //   2960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2963: athrow
    //   2964: aload #8
    //   2966: iconst_1
    //   2967: invokevirtual setAccessible : (Z)V
    //   2970: aload #8
    //   2972: aconst_null
    //   2973: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2976: pop
    //   2977: iinc #7, 1
    //   2980: iload_2
    //   2981: ifeq -> 2842
    //   2984: sipush #7274
    //   2987: sipush #6294
    //   2990: invokestatic a : (II)Ljava/lang/String;
    //   2993: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2996: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2999: astore #5
    //   3001: aload #5
    //   3003: arraylength
    //   3004: istore #6
    //   3006: iconst_0
    //   3007: istore #7
    //   3009: iload #7
    //   3011: iload #6
    //   3013: if_icmpge -> 3150
    //   3016: aload #5
    //   3018: iload #7
    //   3020: aaload
    //   3021: astore #8
    //   3023: aload #8
    //   3025: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3028: pop
    //   3029: aload #8
    //   3031: invokevirtual getModifiers : ()I
    //   3034: invokestatic isStatic : (I)Z
    //   3037: ifeq -> 3136
    //   3040: aload #8
    //   3042: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3045: arraylength
    //   3046: iconst_2
    //   3047: if_icmpne -> 3136
    //   3050: goto -> 3057
    //   3053: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3056: athrow
    //   3057: aload #8
    //   3059: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3062: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3065: if_acmpne -> 3136
    //   3068: goto -> 3075
    //   3071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3074: athrow
    //   3075: aload #8
    //   3077: iconst_1
    //   3078: invokevirtual setAccessible : (Z)V
    //   3081: aload #8
    //   3083: aconst_null
    //   3084: iconst_2
    //   3085: anewarray java/lang/Object
    //   3088: dup
    //   3089: iconst_0
    //   3090: aload_0
    //   3091: aastore
    //   3092: dup
    //   3093: iconst_1
    //   3094: aload_1
    //   3095: ifnonnull -> 3113
    //   3098: goto -> 3105
    //   3101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3104: athrow
    //   3105: aload_1
    //   3106: goto -> 3120
    //   3109: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3112: athrow
    //   3113: aload_1
    //   3114: checkcast [B
    //   3117: invokevirtual clone : ()Ljava/lang/Object;
    //   3120: aastore
    //   3121: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3124: checkcast java/lang/Boolean
    //   3127: invokevirtual booleanValue : ()Z
    //   3130: istore #4
    //   3132: iload_2
    //   3133: ifeq -> 3150
    //   3136: iinc #7, 1
    //   3139: iload_2
    //   3140: ifeq -> 3009
    //   3143: goto -> 3150
    //   3146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3149: athrow
    //   3150: iload_2
    //   3151: ifeq -> 3493
    //   3154: sipush #7295
    //   3157: sipush #-3908
    //   3160: invokestatic a : (II)Ljava/lang/String;
    //   3163: iconst_1
    //   3164: ldc burp/Zx4k
    //   3166: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3169: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3172: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3175: astore #5
    //   3177: aload #5
    //   3179: arraylength
    //   3180: istore #6
    //   3182: iconst_0
    //   3183: istore #7
    //   3185: iload #7
    //   3187: iload #6
    //   3189: if_icmpge -> 3327
    //   3192: aload #5
    //   3194: iload #7
    //   3196: aaload
    //   3197: astore #8
    //   3199: aload #8
    //   3201: invokevirtual getModifiers : ()I
    //   3204: invokestatic isStatic : (I)Z
    //   3207: ifne -> 3217
    //   3210: goto -> 3320
    //   3213: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3216: athrow
    //   3217: aload #8
    //   3219: invokevirtual getType : ()Ljava/lang/Class;
    //   3222: astore #9
    //   3224: aload #9
    //   3226: ifnull -> 3307
    //   3229: aload #9
    //   3231: invokevirtual isPrimitive : ()Z
    //   3234: ifne -> 3307
    //   3237: goto -> 3244
    //   3240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3243: athrow
    //   3244: aload #9
    //   3246: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3249: ifnull -> 3307
    //   3252: goto -> 3259
    //   3255: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3258: athrow
    //   3259: aload #9
    //   3261: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3264: invokevirtual getName : ()Ljava/lang/String;
    //   3267: ifnull -> 3307
    //   3270: goto -> 3277
    //   3273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3276: athrow
    //   3277: aload #9
    //   3279: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3282: invokevirtual getName : ()Ljava/lang/String;
    //   3285: sipush #7272
    //   3288: sipush #-8842
    //   3291: invokestatic a : (II)Ljava/lang/String;
    //   3294: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3297: ifne -> 3307
    //   3300: goto -> 3307
    //   3303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3306: athrow
    //   3307: aload #8
    //   3309: iconst_1
    //   3310: invokevirtual setAccessible : (Z)V
    //   3313: aload #8
    //   3315: aconst_null
    //   3316: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3319: pop
    //   3320: iinc #7, 1
    //   3323: iload_2
    //   3324: ifeq -> 3185
    //   3327: sipush #7273
    //   3330: sipush #-26607
    //   3333: invokestatic a : (II)Ljava/lang/String;
    //   3336: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3339: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3342: astore #5
    //   3344: aload #5
    //   3346: arraylength
    //   3347: istore #6
    //   3349: iconst_0
    //   3350: istore #7
    //   3352: iload #7
    //   3354: iload #6
    //   3356: if_icmpge -> 3493
    //   3359: aload #5
    //   3361: iload #7
    //   3363: aaload
    //   3364: astore #8
    //   3366: aload #8
    //   3368: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3371: pop
    //   3372: aload #8
    //   3374: invokevirtual getModifiers : ()I
    //   3377: invokestatic isStatic : (I)Z
    //   3380: ifeq -> 3479
    //   3383: aload #8
    //   3385: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3388: arraylength
    //   3389: iconst_2
    //   3390: if_icmpne -> 3479
    //   3393: goto -> 3400
    //   3396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3399: athrow
    //   3400: aload #8
    //   3402: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3405: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3408: if_acmpne -> 3479
    //   3411: goto -> 3418
    //   3414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3417: athrow
    //   3418: aload #8
    //   3420: iconst_1
    //   3421: invokevirtual setAccessible : (Z)V
    //   3424: aload #8
    //   3426: aconst_null
    //   3427: iconst_2
    //   3428: anewarray java/lang/Object
    //   3431: dup
    //   3432: iconst_0
    //   3433: aload_0
    //   3434: aastore
    //   3435: dup
    //   3436: iconst_1
    //   3437: aload_1
    //   3438: ifnonnull -> 3456
    //   3441: goto -> 3448
    //   3444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3447: athrow
    //   3448: aload_1
    //   3449: goto -> 3463
    //   3452: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3455: athrow
    //   3456: aload_1
    //   3457: checkcast [B
    //   3460: invokevirtual clone : ()Ljava/lang/Object;
    //   3463: aastore
    //   3464: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3467: checkcast java/lang/Boolean
    //   3470: invokevirtual booleanValue : ()Z
    //   3473: istore #4
    //   3475: iload_2
    //   3476: ifeq -> 3493
    //   3479: iinc #7, 1
    //   3482: iload_2
    //   3483: ifeq -> 3352
    //   3486: goto -> 3493
    //   3489: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3492: athrow
    //   3493: iload #4
    //   3495: ifeq -> 3501
    //   3498: iload #4
    //   3500: ireturn
    //   3501: getstatic burp/Zrp2.ZJ : Ljava/lang/String;
    //   3504: getstatic burp/Zlg2.ZO : Ljava/lang/Object;
    //   3507: checkcast java/math/BigInteger
    //   3510: invokevirtual intValue : ()I
    //   3513: bipush #32
    //   3515: irem
    //   3516: invokestatic abs : (I)I
    //   3519: invokevirtual charAt : (I)C
    //   3522: getstatic burp/Zr9u.Zc : Ljava/lang/String;
    //   3525: getstatic burp/Zxju.ZN : Ljava/lang/Object;
    //   3528: checkcast java/math/BigInteger
    //   3531: invokevirtual intValue : ()I
    //   3534: bipush #32
    //   3536: irem
    //   3537: invokestatic abs : (I)I
    //   3540: invokevirtual charAt : (I)C
    //   3543: if_icmpgt -> 3889
    //   3546: sipush #7286
    //   3549: sipush #-4893
    //   3552: invokestatic a : (II)Ljava/lang/String;
    //   3555: iconst_1
    //   3556: ldc burp/Zzc_
    //   3558: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3561: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3564: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3567: astore #5
    //   3569: aload #5
    //   3571: arraylength
    //   3572: istore #6
    //   3574: iconst_0
    //   3575: istore #7
    //   3577: iload #7
    //   3579: iload #6
    //   3581: if_icmpge -> 3719
    //   3584: aload #5
    //   3586: iload #7
    //   3588: aaload
    //   3589: astore #8
    //   3591: aload #8
    //   3593: invokevirtual getModifiers : ()I
    //   3596: invokestatic isStatic : (I)Z
    //   3599: ifne -> 3609
    //   3602: goto -> 3712
    //   3605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3608: athrow
    //   3609: aload #8
    //   3611: invokevirtual getType : ()Ljava/lang/Class;
    //   3614: astore #9
    //   3616: aload #9
    //   3618: ifnull -> 3699
    //   3621: aload #9
    //   3623: invokevirtual isPrimitive : ()Z
    //   3626: ifne -> 3699
    //   3629: goto -> 3636
    //   3632: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3635: athrow
    //   3636: aload #9
    //   3638: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3641: ifnull -> 3699
    //   3644: goto -> 3651
    //   3647: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3650: athrow
    //   3651: aload #9
    //   3653: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3656: invokevirtual getName : ()Ljava/lang/String;
    //   3659: ifnull -> 3699
    //   3662: goto -> 3669
    //   3665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3668: athrow
    //   3669: aload #9
    //   3671: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3674: invokevirtual getName : ()Ljava/lang/String;
    //   3677: sipush #7272
    //   3680: sipush #-8842
    //   3683: invokestatic a : (II)Ljava/lang/String;
    //   3686: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3689: ifne -> 3699
    //   3692: goto -> 3699
    //   3695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3698: athrow
    //   3699: aload #8
    //   3701: iconst_1
    //   3702: invokevirtual setAccessible : (Z)V
    //   3705: aload #8
    //   3707: aconst_null
    //   3708: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3711: pop
    //   3712: iinc #7, 1
    //   3715: iload_2
    //   3716: ifeq -> 3577
    //   3719: sipush #7285
    //   3722: sipush #-32348
    //   3725: invokestatic a : (II)Ljava/lang/String;
    //   3728: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3731: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3734: astore #5
    //   3736: aload #5
    //   3738: arraylength
    //   3739: istore #6
    //   3741: iconst_0
    //   3742: istore #7
    //   3744: iload #7
    //   3746: iload #6
    //   3748: if_icmpge -> 3885
    //   3751: aload #5
    //   3753: iload #7
    //   3755: aaload
    //   3756: astore #8
    //   3758: aload #8
    //   3760: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3763: pop
    //   3764: aload #8
    //   3766: invokevirtual getModifiers : ()I
    //   3769: invokestatic isStatic : (I)Z
    //   3772: ifeq -> 3871
    //   3775: aload #8
    //   3777: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3780: arraylength
    //   3781: iconst_2
    //   3782: if_icmpne -> 3871
    //   3785: goto -> 3792
    //   3788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3791: athrow
    //   3792: aload #8
    //   3794: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3797: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3800: if_acmpne -> 3871
    //   3803: goto -> 3810
    //   3806: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3809: athrow
    //   3810: aload #8
    //   3812: iconst_1
    //   3813: invokevirtual setAccessible : (Z)V
    //   3816: aload #8
    //   3818: aconst_null
    //   3819: iconst_2
    //   3820: anewarray java/lang/Object
    //   3823: dup
    //   3824: iconst_0
    //   3825: aload_0
    //   3826: aastore
    //   3827: dup
    //   3828: iconst_1
    //   3829: aload_1
    //   3830: ifnonnull -> 3848
    //   3833: goto -> 3840
    //   3836: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3839: athrow
    //   3840: aload_1
    //   3841: goto -> 3855
    //   3844: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3847: athrow
    //   3848: aload_1
    //   3849: checkcast [B
    //   3852: invokevirtual clone : ()Ljava/lang/Object;
    //   3855: aastore
    //   3856: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3859: checkcast java/lang/Boolean
    //   3862: invokevirtual booleanValue : ()Z
    //   3865: istore #4
    //   3867: iload_2
    //   3868: ifeq -> 3885
    //   3871: iinc #7, 1
    //   3874: iload_2
    //   3875: ifeq -> 3744
    //   3878: goto -> 3885
    //   3881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3884: athrow
    //   3885: iload_2
    //   3886: ifeq -> 4228
    //   3889: sipush #7280
    //   3892: sipush #24378
    //   3895: invokestatic a : (II)Ljava/lang/String;
    //   3898: iconst_1
    //   3899: ldc burp/Zzoi
    //   3901: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3904: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3907: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3910: astore #5
    //   3912: aload #5
    //   3914: arraylength
    //   3915: istore #6
    //   3917: iconst_0
    //   3918: istore #7
    //   3920: iload #7
    //   3922: iload #6
    //   3924: if_icmpge -> 4062
    //   3927: aload #5
    //   3929: iload #7
    //   3931: aaload
    //   3932: astore #8
    //   3934: aload #8
    //   3936: invokevirtual getModifiers : ()I
    //   3939: invokestatic isStatic : (I)Z
    //   3942: ifne -> 3952
    //   3945: goto -> 4055
    //   3948: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3951: athrow
    //   3952: aload #8
    //   3954: invokevirtual getType : ()Ljava/lang/Class;
    //   3957: astore #9
    //   3959: aload #9
    //   3961: ifnull -> 4042
    //   3964: aload #9
    //   3966: invokevirtual isPrimitive : ()Z
    //   3969: ifne -> 4042
    //   3972: goto -> 3979
    //   3975: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3978: athrow
    //   3979: aload #9
    //   3981: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3984: ifnull -> 4042
    //   3987: goto -> 3994
    //   3990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3993: athrow
    //   3994: aload #9
    //   3996: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3999: invokevirtual getName : ()Ljava/lang/String;
    //   4002: ifnull -> 4042
    //   4005: goto -> 4012
    //   4008: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4011: athrow
    //   4012: aload #9
    //   4014: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4017: invokevirtual getName : ()Ljava/lang/String;
    //   4020: sipush #7272
    //   4023: sipush #-8842
    //   4026: invokestatic a : (II)Ljava/lang/String;
    //   4029: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4032: ifne -> 4042
    //   4035: goto -> 4042
    //   4038: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4041: athrow
    //   4042: aload #8
    //   4044: iconst_1
    //   4045: invokevirtual setAccessible : (Z)V
    //   4048: aload #8
    //   4050: aconst_null
    //   4051: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4054: pop
    //   4055: iinc #7, 1
    //   4058: iload_2
    //   4059: ifeq -> 3920
    //   4062: sipush #7294
    //   4065: sipush #19725
    //   4068: invokestatic a : (II)Ljava/lang/String;
    //   4071: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4074: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4077: astore #5
    //   4079: aload #5
    //   4081: arraylength
    //   4082: istore #6
    //   4084: iconst_0
    //   4085: istore #7
    //   4087: iload #7
    //   4089: iload #6
    //   4091: if_icmpge -> 4228
    //   4094: aload #5
    //   4096: iload #7
    //   4098: aaload
    //   4099: astore #8
    //   4101: aload #8
    //   4103: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4106: pop
    //   4107: aload #8
    //   4109: invokevirtual getModifiers : ()I
    //   4112: invokestatic isStatic : (I)Z
    //   4115: ifeq -> 4214
    //   4118: aload #8
    //   4120: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4123: arraylength
    //   4124: iconst_2
    //   4125: if_icmpne -> 4214
    //   4128: goto -> 4135
    //   4131: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4134: athrow
    //   4135: aload #8
    //   4137: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4140: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4143: if_acmpne -> 4214
    //   4146: goto -> 4153
    //   4149: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4152: athrow
    //   4153: aload #8
    //   4155: iconst_1
    //   4156: invokevirtual setAccessible : (Z)V
    //   4159: aload #8
    //   4161: aconst_null
    //   4162: iconst_2
    //   4163: anewarray java/lang/Object
    //   4166: dup
    //   4167: iconst_0
    //   4168: aload_0
    //   4169: aastore
    //   4170: dup
    //   4171: iconst_1
    //   4172: aload_1
    //   4173: ifnonnull -> 4191
    //   4176: goto -> 4183
    //   4179: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4182: athrow
    //   4183: aload_1
    //   4184: goto -> 4198
    //   4187: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4190: athrow
    //   4191: aload_1
    //   4192: checkcast [B
    //   4195: invokevirtual clone : ()Ljava/lang/Object;
    //   4198: aastore
    //   4199: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4202: checkcast java/lang/Boolean
    //   4205: invokevirtual booleanValue : ()Z
    //   4208: istore #4
    //   4210: iload_2
    //   4211: ifeq -> 4228
    //   4214: iinc #7, 1
    //   4217: iload_2
    //   4218: ifeq -> 4087
    //   4221: goto -> 4228
    //   4224: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4227: athrow
    //   4228: iload #4
    //   4230: ifeq -> 4236
    //   4233: iload #4
    //   4235: ireturn
    //   4236: getstatic burp/Zlg2.ZL : Ljava/lang/String;
    //   4239: getstatic burp/Zrnt.Zh : Ljava/lang/Object;
    //   4242: checkcast java/math/BigInteger
    //   4245: invokevirtual intValue : ()I
    //   4248: bipush #32
    //   4250: irem
    //   4251: invokestatic abs : (I)I
    //   4254: invokevirtual charAt : (I)C
    //   4257: getstatic burp/Zsvd.ZB : Ljava/lang/String;
    //   4260: getstatic burp/Zthx.ZH : Ljava/lang/Object;
    //   4263: checkcast java/math/BigInteger
    //   4266: invokevirtual intValue : ()I
    //   4269: bipush #32
    //   4271: irem
    //   4272: invokestatic abs : (I)I
    //   4275: invokevirtual charAt : (I)C
    //   4278: if_icmpgt -> 4624
    //   4281: sipush #7269
    //   4284: sipush #-27649
    //   4287: invokestatic a : (II)Ljava/lang/String;
    //   4290: iconst_1
    //   4291: ldc burp/Zt4g
    //   4293: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4296: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4299: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4302: astore #5
    //   4304: aload #5
    //   4306: arraylength
    //   4307: istore #6
    //   4309: iconst_0
    //   4310: istore #7
    //   4312: iload #7
    //   4314: iload #6
    //   4316: if_icmpge -> 4454
    //   4319: aload #5
    //   4321: iload #7
    //   4323: aaload
    //   4324: astore #8
    //   4326: aload #8
    //   4328: invokevirtual getModifiers : ()I
    //   4331: invokestatic isStatic : (I)Z
    //   4334: ifne -> 4344
    //   4337: goto -> 4447
    //   4340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4343: athrow
    //   4344: aload #8
    //   4346: invokevirtual getType : ()Ljava/lang/Class;
    //   4349: astore #9
    //   4351: aload #9
    //   4353: ifnull -> 4434
    //   4356: aload #9
    //   4358: invokevirtual isPrimitive : ()Z
    //   4361: ifne -> 4434
    //   4364: goto -> 4371
    //   4367: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4370: athrow
    //   4371: aload #9
    //   4373: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4376: ifnull -> 4434
    //   4379: goto -> 4386
    //   4382: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4385: athrow
    //   4386: aload #9
    //   4388: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4391: invokevirtual getName : ()Ljava/lang/String;
    //   4394: ifnull -> 4434
    //   4397: goto -> 4404
    //   4400: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4403: athrow
    //   4404: aload #9
    //   4406: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4409: invokevirtual getName : ()Ljava/lang/String;
    //   4412: sipush #7272
    //   4415: sipush #-8842
    //   4418: invokestatic a : (II)Ljava/lang/String;
    //   4421: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4424: ifne -> 4434
    //   4427: goto -> 4434
    //   4430: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4433: athrow
    //   4434: aload #8
    //   4436: iconst_1
    //   4437: invokevirtual setAccessible : (Z)V
    //   4440: aload #8
    //   4442: aconst_null
    //   4443: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4446: pop
    //   4447: iinc #7, 1
    //   4450: iload_2
    //   4451: ifeq -> 4312
    //   4454: sipush #7292
    //   4457: sipush #26397
    //   4460: invokestatic a : (II)Ljava/lang/String;
    //   4463: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4466: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4469: astore #5
    //   4471: aload #5
    //   4473: arraylength
    //   4474: istore #6
    //   4476: iconst_0
    //   4477: istore #7
    //   4479: iload #7
    //   4481: iload #6
    //   4483: if_icmpge -> 4620
    //   4486: aload #5
    //   4488: iload #7
    //   4490: aaload
    //   4491: astore #8
    //   4493: aload #8
    //   4495: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4498: pop
    //   4499: aload #8
    //   4501: invokevirtual getModifiers : ()I
    //   4504: invokestatic isStatic : (I)Z
    //   4507: ifeq -> 4606
    //   4510: aload #8
    //   4512: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4515: arraylength
    //   4516: iconst_2
    //   4517: if_icmpne -> 4606
    //   4520: goto -> 4527
    //   4523: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4526: athrow
    //   4527: aload #8
    //   4529: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4532: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4535: if_acmpne -> 4606
    //   4538: goto -> 4545
    //   4541: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4544: athrow
    //   4545: aload #8
    //   4547: iconst_1
    //   4548: invokevirtual setAccessible : (Z)V
    //   4551: aload #8
    //   4553: aconst_null
    //   4554: iconst_2
    //   4555: anewarray java/lang/Object
    //   4558: dup
    //   4559: iconst_0
    //   4560: aload_0
    //   4561: aastore
    //   4562: dup
    //   4563: iconst_1
    //   4564: aload_1
    //   4565: ifnonnull -> 4583
    //   4568: goto -> 4575
    //   4571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4574: athrow
    //   4575: aload_1
    //   4576: goto -> 4590
    //   4579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4582: athrow
    //   4583: aload_1
    //   4584: checkcast [B
    //   4587: invokevirtual clone : ()Ljava/lang/Object;
    //   4590: aastore
    //   4591: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4594: checkcast java/lang/Boolean
    //   4597: invokevirtual booleanValue : ()Z
    //   4600: istore #4
    //   4602: iload_2
    //   4603: ifeq -> 4620
    //   4606: iinc #7, 1
    //   4609: iload_2
    //   4610: ifeq -> 4479
    //   4613: goto -> 4620
    //   4616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4619: athrow
    //   4620: iload_2
    //   4621: ifeq -> 4963
    //   4624: sipush #7279
    //   4627: sipush #4791
    //   4630: invokestatic a : (II)Ljava/lang/String;
    //   4633: iconst_1
    //   4634: ldc burp/Zg1k
    //   4636: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4639: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4642: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4645: astore #5
    //   4647: aload #5
    //   4649: arraylength
    //   4650: istore #6
    //   4652: iconst_0
    //   4653: istore #7
    //   4655: iload #7
    //   4657: iload #6
    //   4659: if_icmpge -> 4797
    //   4662: aload #5
    //   4664: iload #7
    //   4666: aaload
    //   4667: astore #8
    //   4669: aload #8
    //   4671: invokevirtual getModifiers : ()I
    //   4674: invokestatic isStatic : (I)Z
    //   4677: ifne -> 4687
    //   4680: goto -> 4790
    //   4683: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4686: athrow
    //   4687: aload #8
    //   4689: invokevirtual getType : ()Ljava/lang/Class;
    //   4692: astore #9
    //   4694: aload #9
    //   4696: ifnull -> 4777
    //   4699: aload #9
    //   4701: invokevirtual isPrimitive : ()Z
    //   4704: ifne -> 4777
    //   4707: goto -> 4714
    //   4710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4713: athrow
    //   4714: aload #9
    //   4716: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4719: ifnull -> 4777
    //   4722: goto -> 4729
    //   4725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4728: athrow
    //   4729: aload #9
    //   4731: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4734: invokevirtual getName : ()Ljava/lang/String;
    //   4737: ifnull -> 4777
    //   4740: goto -> 4747
    //   4743: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4746: athrow
    //   4747: aload #9
    //   4749: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4752: invokevirtual getName : ()Ljava/lang/String;
    //   4755: sipush #7272
    //   4758: sipush #-8842
    //   4761: invokestatic a : (II)Ljava/lang/String;
    //   4764: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4767: ifne -> 4777
    //   4770: goto -> 4777
    //   4773: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4776: athrow
    //   4777: aload #8
    //   4779: iconst_1
    //   4780: invokevirtual setAccessible : (Z)V
    //   4783: aload #8
    //   4785: aconst_null
    //   4786: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4789: pop
    //   4790: iinc #7, 1
    //   4793: iload_2
    //   4794: ifeq -> 4655
    //   4797: sipush #7268
    //   4800: sipush #29442
    //   4803: invokestatic a : (II)Ljava/lang/String;
    //   4806: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4809: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4812: astore #5
    //   4814: aload #5
    //   4816: arraylength
    //   4817: istore #6
    //   4819: iconst_0
    //   4820: istore #7
    //   4822: iload #7
    //   4824: iload #6
    //   4826: if_icmpge -> 4963
    //   4829: aload #5
    //   4831: iload #7
    //   4833: aaload
    //   4834: astore #8
    //   4836: aload #8
    //   4838: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4841: pop
    //   4842: aload #8
    //   4844: invokevirtual getModifiers : ()I
    //   4847: invokestatic isStatic : (I)Z
    //   4850: ifeq -> 4949
    //   4853: aload #8
    //   4855: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4858: arraylength
    //   4859: iconst_2
    //   4860: if_icmpne -> 4949
    //   4863: goto -> 4870
    //   4866: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4869: athrow
    //   4870: aload #8
    //   4872: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4875: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4878: if_acmpne -> 4949
    //   4881: goto -> 4888
    //   4884: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4887: athrow
    //   4888: aload #8
    //   4890: iconst_1
    //   4891: invokevirtual setAccessible : (Z)V
    //   4894: aload #8
    //   4896: aconst_null
    //   4897: iconst_2
    //   4898: anewarray java/lang/Object
    //   4901: dup
    //   4902: iconst_0
    //   4903: aload_0
    //   4904: aastore
    //   4905: dup
    //   4906: iconst_1
    //   4907: aload_1
    //   4908: ifnonnull -> 4926
    //   4911: goto -> 4918
    //   4914: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4917: athrow
    //   4918: aload_1
    //   4919: goto -> 4933
    //   4922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4925: athrow
    //   4926: aload_1
    //   4927: checkcast [B
    //   4930: invokevirtual clone : ()Ljava/lang/Object;
    //   4933: aastore
    //   4934: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4937: checkcast java/lang/Boolean
    //   4940: invokevirtual booleanValue : ()Z
    //   4943: istore #4
    //   4945: iload_2
    //   4946: ifeq -> 4963
    //   4949: iinc #7, 1
    //   4952: iload_2
    //   4953: ifeq -> 4822
    //   4956: goto -> 4963
    //   4959: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4962: athrow
    //   4963: iload #4
    //   4965: ireturn
    //   4966: astore_3
    //   4967: new java/lang/Exception
    //   4970: dup
    //   4971: aload_3
    //   4972: invokevirtual getMessage : ()Ljava/lang/String;
    //   4975: invokespecial <init> : (Ljava/lang/String;)V
    //   4978: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2765	4966	java/lang/Throwable
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
    //   1592	1619	1622	java/lang/Throwable
    //   1609	1640	1643	java/lang/Throwable
    //   1626	1670	1673	java/lang/Throwable
    //   1647	1681	1681	java/lang/Throwable
    //   1692	1708	1711	java/lang/Throwable
    //   1760	1774	1774	java/lang/Throwable
    //   1785	1798	1801	java/lang/Throwable
    //   1790	1813	1816	java/lang/Throwable
    //   1805	1831	1834	java/lang/Throwable
    //   1820	1861	1864	java/lang/Throwable
    //   1927	1954	1957	java/lang/Throwable
    //   1944	1972	1975	java/lang/Throwable
    //   1961	2008	2011	java/lang/Throwable
    //   1979	2022	2025	java/lang/Throwable
    //   2122	2136	2136	java/lang/Throwable
    //   2147	2160	2163	java/lang/Throwable
    //   2152	2175	2178	java/lang/Throwable
    //   2167	2193	2196	java/lang/Throwable
    //   2182	2223	2226	java/lang/Throwable
    //   2289	2316	2319	java/lang/Throwable
    //   2306	2334	2337	java/lang/Throwable
    //   2323	2364	2367	java/lang/Throwable
    //   2341	2375	2375	java/lang/Throwable
    //   2398	2409	2412	java/lang/Throwable
    //   2464	2478	2478	java/lang/Throwable
    //   2489	2502	2505	java/lang/Throwable
    //   2494	2517	2520	java/lang/Throwable
    //   2509	2535	2538	java/lang/Throwable
    //   2524	2565	2568	java/lang/Throwable
    //   2631	2658	2661	java/lang/Throwable
    //   2648	2676	2679	java/lang/Throwable
    //   2665	2706	2709	java/lang/Throwable
    //   2683	2717	2717	java/lang/Throwable
    //   2740	2751	2754	java/lang/Throwable
    //   2766	3500	4966	java/lang/Throwable
    //   2856	2870	2870	java/lang/Throwable
    //   2881	2894	2897	java/lang/Throwable
    //   2886	2909	2912	java/lang/Throwable
    //   2901	2927	2930	java/lang/Throwable
    //   2916	2957	2960	java/lang/Throwable
    //   3023	3050	3053	java/lang/Throwable
    //   3040	3068	3071	java/lang/Throwable
    //   3057	3098	3101	java/lang/Throwable
    //   3075	3109	3109	java/lang/Throwable
    //   3132	3143	3146	java/lang/Throwable
    //   3199	3213	3213	java/lang/Throwable
    //   3224	3237	3240	java/lang/Throwable
    //   3229	3252	3255	java/lang/Throwable
    //   3244	3270	3273	java/lang/Throwable
    //   3259	3300	3303	java/lang/Throwable
    //   3366	3393	3396	java/lang/Throwable
    //   3383	3411	3414	java/lang/Throwable
    //   3400	3441	3444	java/lang/Throwable
    //   3418	3452	3452	java/lang/Throwable
    //   3475	3486	3489	java/lang/Throwable
    //   3501	4235	4966	java/lang/Throwable
    //   3591	3605	3605	java/lang/Throwable
    //   3616	3629	3632	java/lang/Throwable
    //   3621	3644	3647	java/lang/Throwable
    //   3636	3662	3665	java/lang/Throwable
    //   3651	3692	3695	java/lang/Throwable
    //   3758	3785	3788	java/lang/Throwable
    //   3775	3803	3806	java/lang/Throwable
    //   3792	3833	3836	java/lang/Throwable
    //   3810	3844	3844	java/lang/Throwable
    //   3867	3878	3881	java/lang/Throwable
    //   3934	3948	3948	java/lang/Throwable
    //   3959	3972	3975	java/lang/Throwable
    //   3964	3987	3990	java/lang/Throwable
    //   3979	4005	4008	java/lang/Throwable
    //   3994	4035	4038	java/lang/Throwable
    //   4101	4128	4131	java/lang/Throwable
    //   4118	4146	4149	java/lang/Throwable
    //   4135	4176	4179	java/lang/Throwable
    //   4153	4187	4187	java/lang/Throwable
    //   4210	4221	4224	java/lang/Throwable
    //   4236	4965	4966	java/lang/Throwable
    //   4326	4340	4340	java/lang/Throwable
    //   4351	4364	4367	java/lang/Throwable
    //   4356	4379	4382	java/lang/Throwable
    //   4371	4397	4400	java/lang/Throwable
    //   4386	4427	4430	java/lang/Throwable
    //   4493	4520	4523	java/lang/Throwable
    //   4510	4538	4541	java/lang/Throwable
    //   4527	4568	4571	java/lang/Throwable
    //   4545	4579	4579	java/lang/Throwable
    //   4602	4613	4616	java/lang/Throwable
    //   4669	4683	4683	java/lang/Throwable
    //   4694	4707	4710	java/lang/Throwable
    //   4699	4722	4725	java/lang/Throwable
    //   4714	4740	4743	java/lang/Throwable
    //   4729	4770	4773	java/lang/Throwable
    //   4836	4863	4866	java/lang/Throwable
    //   4853	4881	4884	java/lang/Throwable
    //   4870	4911	4914	java/lang/Throwable
    //   4888	4922	4922	java/lang/Throwable
    //   4945	4956	4959	java/lang/Throwable
  }
  
  static void Zr(Object paramObject) {
    Zlg2.ZL = a(7275, -25911);
    Zlg2.ZO = new BigInteger(a(7288, 14739));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zgei.Zl.charAt(Math.abs(((BigInteger)Zz66.ZQ).intValue() % 32)) > Zz5e.Zd.charAt(Math.abs(((BigInteger)Zxln.ZJ).intValue() % 32))) {
          try {
            Zv8d.ZO(Class.forName(a(7277, 8823)));
            if (bool)
              Zzef.Zc(Class.forName(a(7281, -19932))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zzef.Zc(Class.forName(a(7281, -19932)));
    } catch (Throwable throwable) {}
  }
  
  static void Zk(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'CM^k!Ã¶\\tprg.\\t`\\tºÞ+í§WEtÈ\\tÙ)G*ýÝê\\t0z5L)7M`ñÉ½@ÏÂÑöøyCX¨Ý{õaßÃx¸3åä6tÏ"ÊËR=È© â[*I§`¿"lÅTeEÀ¥4ÙßÁ±~#]Uj\\tû$¢núVÂ\\t¯K_óÐ»\\t\÷W<  ³\\t«y\\tãÉÄ­Ï\\tKËO`´ôÁ\\tJe5d¹*§Õ\\t¥ÈVÛ Ê\\t¨ÿiÉïÓE¶ý\\t{(3 «Û lD2;2üHïÄìjÅs¨£:$óàÕbïâ(+\\tQÊVo\\b¯|n\\t¿Æ52Ñ\\tZ7Æ$2(ßÆCÑ\\f\\tµ\\nÊwËK7´  f*úÐÐ­s>zûíKX:7nÅ\\t®9Ü,|b\\tqÃRN#±¢'\\têN!ÿæckÉ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #118
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
    //   68: ldc '^ÿÝ£ô·` \\bÖ÷Ì¢1Ôâb'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #125
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
    //   129: putstatic burp/Ztbn.a : [Ljava/lang/String;
    //   132: bipush #27
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztbn.b : [Ljava/lang/String;
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
    //   212: bipush #21
    //   214: goto -> 244
    //   217: bipush #50
    //   219: goto -> 244
    //   222: bipush #58
    //   224: goto -> 244
    //   227: bipush #99
    //   229: goto -> 244
    //   232: bipush #47
    //   234: goto -> 244
    //   237: bipush #26
    //   239: goto -> 244
    //   242: bipush #125
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
    //   310: bipush #32
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #107
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #7
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #67
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #78
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-113
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-120
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #125
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-105
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-8
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #74
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #91
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-60
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-110
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-98
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-27
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #58
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-82
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #13
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #118
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #13
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #84
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-18
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-98
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #102
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #62
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-117
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-8
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-7
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #32
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #96
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #125
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Ztbn.ZA : Ljava/lang/Object;
    //   500: sipush #7282
    //   503: sipush #-11003
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Ztbn.Zx : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1C7D) & 0xFFFF;
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
      char c = 'å';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztbn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */