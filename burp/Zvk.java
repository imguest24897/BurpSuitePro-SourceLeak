package burp;

import java.math.BigInteger;

class Zvk extends ClassLoader {
  static Object ZN;
  
  static String ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zm(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zkcd.Zj : Ljava/lang/String;
    //   172: getstatic burp/Zz6t.ZA : Ljava/lang/Object;
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
    //   206: getstatic burp/Znp.Zr : Ljava/lang/String;
    //   209: getstatic burp/Zeai.ZI : Ljava/lang/Object;
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
    //   243: getstatic burp/Zttq.ZO : Ljava/lang/String;
    //   246: getstatic burp/Zbp_.Zi : Ljava/lang/Object;
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
    //   280: getstatic burp/Zrcx.ZW : Ljava/lang/String;
    //   283: getstatic burp/Zgia.Zx : Ljava/lang/Object;
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
    //   317: getstatic burp/Zk12.Zu : Ljava/lang/String;
    //   320: getstatic burp/Zzc_.Zi : Ljava/lang/Object;
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
    //   354: getstatic burp/Zry7.Z_ : Ljava/lang/String;
    //   357: getstatic burp/Zrod.ZX : Ljava/lang/Object;
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
    //   391: getstatic burp/Zti7.Zc : Ljava/lang/String;
    //   394: getstatic burp/Zsun.ZP : Ljava/lang/Object;
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
    //   428: getstatic burp/Zry9.ZW : Ljava/lang/String;
    //   431: getstatic burp/Zlqy.ZP : Ljava/lang/Object;
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
    //   465: getstatic burp/Zxl5.Zq : Ljava/lang/String;
    //   468: getstatic burp/Zsqi.Zf : Ljava/lang/Object;
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
    //   502: getstatic burp/Zz0j.Zf : Ljava/lang/String;
    //   505: getstatic burp/Zz7j.ZR : Ljava/lang/Object;
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
    //   539: getstatic burp/Zssb.ZY : Ljava/lang/String;
    //   542: getstatic burp/Zt5a.Zs : Ljava/lang/Object;
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
    //   576: getstatic burp/Zlpu.ZA : Ljava/lang/String;
    //   579: getstatic burp/Zb9h.Zm : Ljava/lang/Object;
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
    //   613: getstatic burp/Zsby.Zx : Ljava/lang/String;
    //   616: getstatic burp/Zstf.ZA : Ljava/lang/Object;
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
    //   650: getstatic burp/Ze54.ZU : Ljava/lang/String;
    //   653: getstatic burp/Zb1.Zf : Ljava/lang/Object;
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
    //   687: getstatic burp/Zzb2.ZJ : Ljava/lang/String;
    //   690: getstatic burp/Ze0w.ZU : Ljava/lang/Object;
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
    //   724: getstatic burp/Zgny.Zf : Ljava/lang/String;
    //   727: getstatic burp/Zzrb.Zj : Ljava/lang/Object;
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
    //   761: getstatic burp/Zxc.Zx : Ljava/lang/String;
    //   764: getstatic burp/Zg3m.ZK : Ljava/lang/Object;
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
    //   798: getstatic burp/Zmjw.ZB : Ljava/lang/String;
    //   801: getstatic burp/Zejg.ZR : Ljava/lang/Object;
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
    //   835: getstatic burp/Zsjo.Zu : Ljava/lang/String;
    //   838: getstatic burp/Zoa.ZI : Ljava/lang/Object;
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
    //   872: getstatic burp/Zr3x.ZM : Ljava/lang/String;
    //   875: getstatic burp/Zgx6.Zo : Ljava/lang/Object;
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
    //   909: getstatic burp/Zevf.ZL : Ljava/lang/String;
    //   912: getstatic burp/Zr9j.Zw : Ljava/lang/Object;
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
    //   946: getstatic burp/Zmiy.ZT : Ljava/lang/String;
    //   949: getstatic burp/Zrxm.ZL : Ljava/lang/Object;
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
    //   983: getstatic burp/Zts_.Zx : Ljava/lang/String;
    //   986: getstatic burp/Zzok.ZY : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zmf6.Zn : Ljava/lang/String;
    //   1023: getstatic burp/Zz5d.Zk : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zgqp.ZA : Ljava/lang/String;
    //   1060: getstatic burp/Zxyq.ZQ : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zezn.Ze : Ljava/lang/String;
    //   1097: getstatic burp/Zep8.Zs : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zea9.Zd : Ljava/lang/String;
    //   1134: getstatic burp/Zkv2.ZC : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zlgh.Zm : Ljava/lang/String;
    //   1171: getstatic burp/Zl5b.ZI : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zgdt.Zd : Ljava/lang/String;
    //   1208: getstatic burp/Zrcx.Za : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zrt3.Zu : Ljava/lang/String;
    //   1245: getstatic burp/Zbwj.ZW : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zthx.Ze : Ljava/lang/String;
    //   1282: getstatic burp/Zlum.Zj : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zsts.ZI : Ljava/lang/String;
    //   1319: getstatic burp/Zro5.ZT : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zmt6.Zx : Ljava/lang/String;
    //   1362: getstatic burp/Zxo4.ZV : Ljava/lang/Object;
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
    //   1440: ifeq -> 1394
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
    //   1569: ifeq -> 1634
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
    //   1792: ifeq -> 1541
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
    //   1834: ifeq -> 1510
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
    //   1918: ifeq -> 1876
    //   1921: aload #15
    //   1923: astore #5
    //   1925: sipush #7540
    //   1928: new java/math/BigInteger
    //   1931: dup
    //   1932: aload #5
    //   1934: invokespecial <init> : ([B)V
    //   1937: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1940: putstatic burp/Zsow.ZV : Ljava/lang/Object;
    //   1943: sipush #-9312
    //   1946: invokestatic a : (II)Ljava/lang/String;
    //   1949: iconst_1
    //   1950: ldc burp/Ztkc
    //   1952: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1955: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1958: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1961: astore #4
    //   1963: aload #4
    //   1965: arraylength
    //   1966: istore #5
    //   1968: iconst_0
    //   1969: istore #6
    //   1971: iload #6
    //   1973: iload #5
    //   1975: if_icmpge -> 2113
    //   1978: aload #4
    //   1980: iload #6
    //   1982: aaload
    //   1983: astore #7
    //   1985: aload #7
    //   1987: invokevirtual getModifiers : ()I
    //   1990: invokestatic isStatic : (I)Z
    //   1993: ifne -> 2003
    //   1996: goto -> 2106
    //   1999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2002: athrow
    //   2003: aload #7
    //   2005: invokevirtual getType : ()Ljava/lang/Class;
    //   2008: astore #8
    //   2010: aload #8
    //   2012: ifnull -> 2093
    //   2015: aload #8
    //   2017: invokevirtual isPrimitive : ()Z
    //   2020: ifne -> 2093
    //   2023: goto -> 2030
    //   2026: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2029: athrow
    //   2030: aload #8
    //   2032: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2035: ifnull -> 2093
    //   2038: goto -> 2045
    //   2041: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2044: athrow
    //   2045: aload #8
    //   2047: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2050: invokevirtual getName : ()Ljava/lang/String;
    //   2053: ifnull -> 2093
    //   2056: goto -> 2063
    //   2059: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2062: athrow
    //   2063: aload #8
    //   2065: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2068: invokevirtual getName : ()Ljava/lang/String;
    //   2071: sipush #7539
    //   2074: sipush #19694
    //   2077: invokestatic a : (II)Ljava/lang/String;
    //   2080: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2083: ifne -> 2093
    //   2086: goto -> 2093
    //   2089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2092: athrow
    //   2093: aload #7
    //   2095: iconst_1
    //   2096: invokevirtual setAccessible : (Z)V
    //   2099: aload #7
    //   2101: aconst_null
    //   2102: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2105: pop
    //   2106: iinc #6, 1
    //   2109: iload_2
    //   2110: ifeq -> 1971
    //   2113: sipush #7548
    //   2116: sipush #-13712
    //   2119: invokestatic a : (II)Ljava/lang/String;
    //   2122: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2125: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2128: astore #4
    //   2130: aload #4
    //   2132: arraylength
    //   2133: istore #5
    //   2135: iconst_0
    //   2136: istore #6
    //   2138: iload #6
    //   2140: iload #5
    //   2142: if_icmpge -> 2272
    //   2145: aload #4
    //   2147: iload #6
    //   2149: aaload
    //   2150: astore #7
    //   2152: aload #7
    //   2154: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2157: pop
    //   2158: aload #7
    //   2160: invokevirtual getModifiers : ()I
    //   2163: invokestatic isStatic : (I)Z
    //   2166: ifeq -> 2258
    //   2169: aload #7
    //   2171: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2174: arraylength
    //   2175: iconst_2
    //   2176: if_icmpne -> 2258
    //   2179: goto -> 2186
    //   2182: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2185: athrow
    //   2186: aload #7
    //   2188: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2191: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2194: if_acmpne -> 2258
    //   2197: goto -> 2204
    //   2200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2203: athrow
    //   2204: aload #7
    //   2206: iconst_1
    //   2207: invokevirtual setAccessible : (Z)V
    //   2210: aload #7
    //   2212: aconst_null
    //   2213: iconst_2
    //   2214: anewarray java/lang/Object
    //   2217: dup
    //   2218: iconst_0
    //   2219: aload_0
    //   2220: aastore
    //   2221: dup
    //   2222: iconst_1
    //   2223: aload_1
    //   2224: ifnonnull -> 2242
    //   2227: goto -> 2234
    //   2230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2233: athrow
    //   2234: aload_1
    //   2235: goto -> 2249
    //   2238: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2241: athrow
    //   2242: aload_1
    //   2243: checkcast [B
    //   2246: invokevirtual clone : ()Ljava/lang/Object;
    //   2249: aastore
    //   2250: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2253: pop
    //   2254: iload_2
    //   2255: ifeq -> 2272
    //   2258: iinc #6, 1
    //   2261: iload_2
    //   2262: ifeq -> 2138
    //   2265: goto -> 2272
    //   2268: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2271: athrow
    //   2272: sipush #7534
    //   2275: sipush #22124
    //   2278: invokestatic a : (II)Ljava/lang/String;
    //   2281: iconst_1
    //   2282: ldc burp/Zs8y
    //   2284: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2287: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2290: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2293: astore #4
    //   2295: aload #4
    //   2297: arraylength
    //   2298: istore #5
    //   2300: iconst_0
    //   2301: istore #6
    //   2303: iload #6
    //   2305: iload #5
    //   2307: if_icmpge -> 2445
    //   2310: aload #4
    //   2312: iload #6
    //   2314: aaload
    //   2315: astore #7
    //   2317: aload #7
    //   2319: invokevirtual getModifiers : ()I
    //   2322: invokestatic isStatic : (I)Z
    //   2325: ifne -> 2335
    //   2328: goto -> 2438
    //   2331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2334: athrow
    //   2335: aload #7
    //   2337: invokevirtual getType : ()Ljava/lang/Class;
    //   2340: astore #8
    //   2342: aload #8
    //   2344: ifnull -> 2425
    //   2347: aload #8
    //   2349: invokevirtual isPrimitive : ()Z
    //   2352: ifne -> 2425
    //   2355: goto -> 2362
    //   2358: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2361: athrow
    //   2362: aload #8
    //   2364: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2367: ifnull -> 2425
    //   2370: goto -> 2377
    //   2373: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2376: athrow
    //   2377: aload #8
    //   2379: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2382: invokevirtual getName : ()Ljava/lang/String;
    //   2385: ifnull -> 2425
    //   2388: goto -> 2395
    //   2391: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2394: athrow
    //   2395: aload #8
    //   2397: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2400: invokevirtual getName : ()Ljava/lang/String;
    //   2403: sipush #7529
    //   2406: sipush #-17897
    //   2409: invokestatic a : (II)Ljava/lang/String;
    //   2412: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2415: ifne -> 2425
    //   2418: goto -> 2425
    //   2421: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2424: athrow
    //   2425: aload #7
    //   2427: iconst_1
    //   2428: invokevirtual setAccessible : (Z)V
    //   2431: aload #7
    //   2433: aconst_null
    //   2434: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2437: pop
    //   2438: iinc #6, 1
    //   2441: iload_2
    //   2442: ifeq -> 2303
    //   2445: sipush #7541
    //   2448: sipush #30390
    //   2451: invokestatic a : (II)Ljava/lang/String;
    //   2454: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2457: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2460: astore #4
    //   2462: aload #4
    //   2464: arraylength
    //   2465: istore #5
    //   2467: iconst_0
    //   2468: istore #6
    //   2470: iload #6
    //   2472: iload #5
    //   2474: if_icmpge -> 2607
    //   2477: aload #4
    //   2479: iload #6
    //   2481: aaload
    //   2482: astore #7
    //   2484: aload #7
    //   2486: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2489: pop
    //   2490: aload #7
    //   2492: invokevirtual getModifiers : ()I
    //   2495: invokestatic isStatic : (I)Z
    //   2498: ifeq -> 2593
    //   2501: aload #7
    //   2503: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2506: arraylength
    //   2507: iconst_2
    //   2508: if_icmpne -> 2593
    //   2511: goto -> 2518
    //   2514: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2517: athrow
    //   2518: aload #7
    //   2520: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2523: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2526: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2529: ifeq -> 2593
    //   2532: goto -> 2539
    //   2535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2538: athrow
    //   2539: aload #7
    //   2541: iconst_1
    //   2542: invokevirtual setAccessible : (Z)V
    //   2545: aload #7
    //   2547: aconst_null
    //   2548: iconst_2
    //   2549: anewarray java/lang/Object
    //   2552: dup
    //   2553: iconst_0
    //   2554: aload_0
    //   2555: aastore
    //   2556: dup
    //   2557: iconst_1
    //   2558: aload_1
    //   2559: ifnonnull -> 2577
    //   2562: goto -> 2569
    //   2565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2568: athrow
    //   2569: aload_1
    //   2570: goto -> 2584
    //   2573: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2576: athrow
    //   2577: aload_1
    //   2578: checkcast [B
    //   2581: invokevirtual clone : ()Ljava/lang/Object;
    //   2584: aastore
    //   2585: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2588: pop
    //   2589: iload_2
    //   2590: ifeq -> 2607
    //   2593: iinc #6, 1
    //   2596: iload_2
    //   2597: ifeq -> 2470
    //   2600: goto -> 2607
    //   2603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2606: athrow
    //   2607: new java/io/ByteArrayOutputStream
    //   2610: dup
    //   2611: invokespecial <init> : ()V
    //   2614: astore #4
    //   2616: sipush #7532
    //   2619: aload #4
    //   2621: sipush #202
    //   2624: invokevirtual write : (I)V
    //   2627: sipush #15333
    //   2630: aload #4
    //   2632: sipush #254
    //   2635: invokevirtual write : (I)V
    //   2638: aload #4
    //   2640: sipush #186
    //   2643: invokevirtual write : (I)V
    //   2646: aload #4
    //   2648: sipush #190
    //   2651: invokevirtual write : (I)V
    //   2654: aload #4
    //   2656: iconst_0
    //   2657: invokevirtual write : (I)V
    //   2660: aload #4
    //   2662: iconst_1
    //   2663: invokevirtual write : (I)V
    //   2666: aload #4
    //   2668: iconst_0
    //   2669: invokevirtual write : (I)V
    //   2672: aload #4
    //   2674: bipush #50
    //   2676: invokevirtual write : (I)V
    //   2679: aload #4
    //   2681: getstatic burp/Zzox.Zq : Ljava/lang/Object;
    //   2684: checkcast java/math/BigInteger
    //   2687: invokevirtual toByteArray : ()[B
    //   2690: invokevirtual write : ([B)V
    //   2693: aload #4
    //   2695: getstatic burp/Zmpp.Z_ : Ljava/lang/Object;
    //   2698: checkcast java/math/BigInteger
    //   2701: invokevirtual toByteArray : ()[B
    //   2704: invokevirtual write : ([B)V
    //   2707: aload #4
    //   2709: getstatic burp/Zmu6.Zb : Ljava/lang/Object;
    //   2712: checkcast java/math/BigInteger
    //   2715: invokevirtual toByteArray : ()[B
    //   2718: invokevirtual write : ([B)V
    //   2721: aload #4
    //   2723: invokevirtual toByteArray : ()[B
    //   2726: astore #5
    //   2728: aconst_null
    //   2729: astore #6
    //   2731: invokestatic a : (II)Ljava/lang/String;
    //   2734: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2737: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2740: astore #7
    //   2742: aload #7
    //   2744: arraylength
    //   2745: istore #8
    //   2747: iconst_0
    //   2748: istore #9
    //   2750: iload #9
    //   2752: iload #8
    //   2754: if_icmpge -> 2882
    //   2757: aload #7
    //   2759: iload #9
    //   2761: aaload
    //   2762: astore #10
    //   2764: aload #10
    //   2766: invokevirtual getName : ()Ljava/lang/String;
    //   2769: sipush #7521
    //   2772: sipush #-28394
    //   2775: invokestatic a : (II)Ljava/lang/String;
    //   2778: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2781: ifeq -> 2875
    //   2784: aload #10
    //   2786: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2789: astore #11
    //   2791: aload #11
    //   2793: arraylength
    //   2794: iconst_4
    //   2795: if_icmpeq -> 2805
    //   2798: goto -> 2875
    //   2801: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2804: athrow
    //   2805: aload #11
    //   2807: iconst_0
    //   2808: aaload
    //   2809: ldc java/lang/String
    //   2811: if_acmpeq -> 2821
    //   2814: goto -> 2875
    //   2817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2820: athrow
    //   2821: aload #11
    //   2823: iconst_1
    //   2824: aaload
    //   2825: ldc [B
    //   2827: if_acmpeq -> 2837
    //   2830: goto -> 2875
    //   2833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2836: athrow
    //   2837: aload #11
    //   2839: iconst_2
    //   2840: aaload
    //   2841: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   2844: if_acmpeq -> 2854
    //   2847: goto -> 2875
    //   2850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2853: athrow
    //   2854: aload #11
    //   2856: iconst_3
    //   2857: aaload
    //   2858: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   2861: if_acmpeq -> 2871
    //   2864: goto -> 2875
    //   2867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2870: athrow
    //   2871: aload #10
    //   2873: astore #6
    //   2875: iinc #9, 1
    //   2878: iload_2
    //   2879: ifeq -> 2750
    //   2882: aload #6
    //   2884: iconst_1
    //   2885: invokevirtual setAccessible : (Z)V
    //   2888: ldc burp/Zg7w
    //   2890: iconst_0
    //   2891: anewarray java/lang/Class
    //   2894: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   2897: astore #7
    //   2899: aload #7
    //   2901: iconst_1
    //   2902: invokevirtual setAccessible : (Z)V
    //   2905: aload #6
    //   2907: aload #7
    //   2909: iconst_0
    //   2910: anewarray java/lang/Object
    //   2913: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   2916: iconst_4
    //   2917: anewarray java/lang/Object
    //   2920: dup
    //   2921: iconst_0
    //   2922: sipush #7545
    //   2925: sipush #-28601
    //   2928: invokestatic a : (II)Ljava/lang/String;
    //   2931: aastore
    //   2932: dup
    //   2933: iconst_1
    //   2934: aload #5
    //   2936: aastore
    //   2937: dup
    //   2938: iconst_2
    //   2939: iconst_0
    //   2940: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2943: aastore
    //   2944: dup
    //   2945: iconst_3
    //   2946: aload #5
    //   2948: arraylength
    //   2949: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2952: aastore
    //   2953: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2956: pop
    //   2957: goto -> 2962
    //   2960: astore #4
    //   2962: iconst_0
    //   2963: istore #4
    //   2965: getstatic burp/Zkht.Zd : Ljava/lang/String;
    //   2968: getstatic burp/Zzmo.ZI : Ljava/lang/Object;
    //   2971: checkcast java/math/BigInteger
    //   2974: invokevirtual intValue : ()I
    //   2977: bipush #32
    //   2979: irem
    //   2980: invokestatic abs : (I)I
    //   2983: invokevirtual charAt : (I)C
    //   2986: getstatic burp/Zbo2.Zr : Ljava/lang/String;
    //   2989: getstatic burp/Zxc.ZR : Ljava/lang/Object;
    //   2992: checkcast java/math/BigInteger
    //   2995: invokevirtual intValue : ()I
    //   2998: bipush #32
    //   3000: irem
    //   3001: invokestatic abs : (I)I
    //   3004: invokevirtual charAt : (I)C
    //   3007: if_icmple -> 3352
    //   3010: sipush #7530
    //   3013: sipush #22050
    //   3016: invokestatic a : (II)Ljava/lang/String;
    //   3019: iconst_1
    //   3020: ldc burp/Zbxa
    //   3022: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3025: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3028: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3031: astore #5
    //   3033: aload #5
    //   3035: arraylength
    //   3036: istore #6
    //   3038: iconst_0
    //   3039: istore #7
    //   3041: iload #7
    //   3043: iload #6
    //   3045: if_icmpge -> 3183
    //   3048: aload #5
    //   3050: iload #7
    //   3052: aaload
    //   3053: astore #8
    //   3055: aload #8
    //   3057: invokevirtual getModifiers : ()I
    //   3060: invokestatic isStatic : (I)Z
    //   3063: ifne -> 3073
    //   3066: goto -> 3176
    //   3069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3072: athrow
    //   3073: aload #8
    //   3075: invokevirtual getType : ()Ljava/lang/Class;
    //   3078: astore #9
    //   3080: aload #9
    //   3082: ifnull -> 3163
    //   3085: aload #9
    //   3087: invokevirtual isPrimitive : ()Z
    //   3090: ifne -> 3163
    //   3093: goto -> 3100
    //   3096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3099: athrow
    //   3100: aload #9
    //   3102: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3105: ifnull -> 3163
    //   3108: goto -> 3115
    //   3111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3114: athrow
    //   3115: aload #9
    //   3117: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3120: invokevirtual getName : ()Ljava/lang/String;
    //   3123: ifnull -> 3163
    //   3126: goto -> 3133
    //   3129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3132: athrow
    //   3133: aload #9
    //   3135: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3138: invokevirtual getName : ()Ljava/lang/String;
    //   3141: sipush #7529
    //   3144: sipush #-17897
    //   3147: invokestatic a : (II)Ljava/lang/String;
    //   3150: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3153: ifne -> 3163
    //   3156: goto -> 3163
    //   3159: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3162: athrow
    //   3163: aload #8
    //   3165: iconst_1
    //   3166: invokevirtual setAccessible : (Z)V
    //   3169: aload #8
    //   3171: aconst_null
    //   3172: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3175: pop
    //   3176: iinc #7, 1
    //   3179: iload_2
    //   3180: ifeq -> 3041
    //   3183: sipush #7547
    //   3186: sipush #18980
    //   3189: invokestatic a : (II)Ljava/lang/String;
    //   3192: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3195: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3198: astore #5
    //   3200: aload #5
    //   3202: arraylength
    //   3203: istore #6
    //   3205: iconst_0
    //   3206: istore #7
    //   3208: iload #7
    //   3210: iload #6
    //   3212: if_icmpge -> 3349
    //   3215: aload #5
    //   3217: iload #7
    //   3219: aaload
    //   3220: astore #8
    //   3222: aload #8
    //   3224: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3227: pop
    //   3228: aload #8
    //   3230: invokevirtual getModifiers : ()I
    //   3233: invokestatic isStatic : (I)Z
    //   3236: ifeq -> 3335
    //   3239: aload #8
    //   3241: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3244: arraylength
    //   3245: iconst_2
    //   3246: if_icmpne -> 3335
    //   3249: goto -> 3256
    //   3252: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3255: athrow
    //   3256: aload #8
    //   3258: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3261: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3264: if_acmpne -> 3335
    //   3267: goto -> 3274
    //   3270: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3273: athrow
    //   3274: aload #8
    //   3276: iconst_1
    //   3277: invokevirtual setAccessible : (Z)V
    //   3280: aload #8
    //   3282: aconst_null
    //   3283: iconst_2
    //   3284: anewarray java/lang/Object
    //   3287: dup
    //   3288: iconst_0
    //   3289: aload_0
    //   3290: aastore
    //   3291: dup
    //   3292: iconst_1
    //   3293: aload_1
    //   3294: ifnonnull -> 3312
    //   3297: goto -> 3304
    //   3300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3303: athrow
    //   3304: aload_1
    //   3305: goto -> 3319
    //   3308: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3311: athrow
    //   3312: aload_1
    //   3313: checkcast [B
    //   3316: invokevirtual clone : ()Ljava/lang/Object;
    //   3319: aastore
    //   3320: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3323: checkcast java/lang/Boolean
    //   3326: invokevirtual booleanValue : ()Z
    //   3329: istore #4
    //   3331: iload_2
    //   3332: ifeq -> 3349
    //   3335: iinc #7, 1
    //   3338: iload_2
    //   3339: ifeq -> 3208
    //   3342: goto -> 3349
    //   3345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3348: athrow
    //   3349: goto -> 3691
    //   3352: sipush #7527
    //   3355: sipush #-13392
    //   3358: invokestatic a : (II)Ljava/lang/String;
    //   3361: iconst_1
    //   3362: ldc burp/Zb14
    //   3364: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3367: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3370: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3373: astore #5
    //   3375: aload #5
    //   3377: arraylength
    //   3378: istore #6
    //   3380: iconst_0
    //   3381: istore #7
    //   3383: iload #7
    //   3385: iload #6
    //   3387: if_icmpge -> 3525
    //   3390: aload #5
    //   3392: iload #7
    //   3394: aaload
    //   3395: astore #8
    //   3397: aload #8
    //   3399: invokevirtual getModifiers : ()I
    //   3402: invokestatic isStatic : (I)Z
    //   3405: ifne -> 3415
    //   3408: goto -> 3518
    //   3411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3414: athrow
    //   3415: aload #8
    //   3417: invokevirtual getType : ()Ljava/lang/Class;
    //   3420: astore #9
    //   3422: aload #9
    //   3424: ifnull -> 3505
    //   3427: aload #9
    //   3429: invokevirtual isPrimitive : ()Z
    //   3432: ifne -> 3505
    //   3435: goto -> 3442
    //   3438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3441: athrow
    //   3442: aload #9
    //   3444: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3447: ifnull -> 3505
    //   3450: goto -> 3457
    //   3453: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3456: athrow
    //   3457: aload #9
    //   3459: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3462: invokevirtual getName : ()Ljava/lang/String;
    //   3465: ifnull -> 3505
    //   3468: goto -> 3475
    //   3471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3474: athrow
    //   3475: aload #9
    //   3477: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3480: invokevirtual getName : ()Ljava/lang/String;
    //   3483: sipush #7529
    //   3486: sipush #-17897
    //   3489: invokestatic a : (II)Ljava/lang/String;
    //   3492: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3495: ifne -> 3505
    //   3498: goto -> 3505
    //   3501: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3504: athrow
    //   3505: aload #8
    //   3507: iconst_1
    //   3508: invokevirtual setAccessible : (Z)V
    //   3511: aload #8
    //   3513: aconst_null
    //   3514: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3517: pop
    //   3518: iinc #7, 1
    //   3521: iload_2
    //   3522: ifeq -> 3383
    //   3525: sipush #7533
    //   3528: sipush #-11129
    //   3531: invokestatic a : (II)Ljava/lang/String;
    //   3534: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3537: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3540: astore #5
    //   3542: aload #5
    //   3544: arraylength
    //   3545: istore #6
    //   3547: iconst_0
    //   3548: istore #7
    //   3550: iload #7
    //   3552: iload #6
    //   3554: if_icmpge -> 3691
    //   3557: aload #5
    //   3559: iload #7
    //   3561: aaload
    //   3562: astore #8
    //   3564: aload #8
    //   3566: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3569: pop
    //   3570: aload #8
    //   3572: invokevirtual getModifiers : ()I
    //   3575: invokestatic isStatic : (I)Z
    //   3578: ifeq -> 3677
    //   3581: aload #8
    //   3583: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3586: arraylength
    //   3587: iconst_2
    //   3588: if_icmpne -> 3677
    //   3591: goto -> 3598
    //   3594: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3597: athrow
    //   3598: aload #8
    //   3600: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3603: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3606: if_acmpne -> 3677
    //   3609: goto -> 3616
    //   3612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3615: athrow
    //   3616: aload #8
    //   3618: iconst_1
    //   3619: invokevirtual setAccessible : (Z)V
    //   3622: aload #8
    //   3624: aconst_null
    //   3625: iconst_2
    //   3626: anewarray java/lang/Object
    //   3629: dup
    //   3630: iconst_0
    //   3631: aload_0
    //   3632: aastore
    //   3633: dup
    //   3634: iconst_1
    //   3635: aload_1
    //   3636: ifnonnull -> 3654
    //   3639: goto -> 3646
    //   3642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3645: athrow
    //   3646: aload_1
    //   3647: goto -> 3661
    //   3650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3653: athrow
    //   3654: aload_1
    //   3655: checkcast [B
    //   3658: invokevirtual clone : ()Ljava/lang/Object;
    //   3661: aastore
    //   3662: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3665: checkcast java/lang/Boolean
    //   3668: invokevirtual booleanValue : ()Z
    //   3671: istore #4
    //   3673: iload_2
    //   3674: ifeq -> 3691
    //   3677: iinc #7, 1
    //   3680: iload_2
    //   3681: ifeq -> 3550
    //   3684: goto -> 3691
    //   3687: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3690: athrow
    //   3691: iload #4
    //   3693: ifeq -> 3699
    //   3696: iload #4
    //   3698: ireturn
    //   3699: getstatic burp/Zlot.ZD : Ljava/lang/String;
    //   3702: getstatic burp/Zt7j.ZH : Ljava/lang/Object;
    //   3705: checkcast java/math/BigInteger
    //   3708: invokevirtual intValue : ()I
    //   3711: bipush #32
    //   3713: irem
    //   3714: invokestatic abs : (I)I
    //   3717: invokevirtual charAt : (I)C
    //   3720: getstatic burp/Zbj.ZD : Ljava/lang/String;
    //   3723: getstatic burp/Ztgj.ZY : Ljava/lang/Object;
    //   3726: checkcast java/math/BigInteger
    //   3729: invokevirtual intValue : ()I
    //   3732: bipush #32
    //   3734: irem
    //   3735: invokestatic abs : (I)I
    //   3738: invokevirtual charAt : (I)C
    //   3741: if_icmple -> 4087
    //   3744: sipush #7526
    //   3747: sipush #-22193
    //   3750: invokestatic a : (II)Ljava/lang/String;
    //   3753: iconst_1
    //   3754: ldc burp/Zmlr
    //   3756: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3759: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3762: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3765: astore #5
    //   3767: aload #5
    //   3769: arraylength
    //   3770: istore #6
    //   3772: iconst_0
    //   3773: istore #7
    //   3775: iload #7
    //   3777: iload #6
    //   3779: if_icmpge -> 3917
    //   3782: aload #5
    //   3784: iload #7
    //   3786: aaload
    //   3787: astore #8
    //   3789: aload #8
    //   3791: invokevirtual getModifiers : ()I
    //   3794: invokestatic isStatic : (I)Z
    //   3797: ifne -> 3807
    //   3800: goto -> 3910
    //   3803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3806: athrow
    //   3807: aload #8
    //   3809: invokevirtual getType : ()Ljava/lang/Class;
    //   3812: astore #9
    //   3814: aload #9
    //   3816: ifnull -> 3897
    //   3819: aload #9
    //   3821: invokevirtual isPrimitive : ()Z
    //   3824: ifne -> 3897
    //   3827: goto -> 3834
    //   3830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3833: athrow
    //   3834: aload #9
    //   3836: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3839: ifnull -> 3897
    //   3842: goto -> 3849
    //   3845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3848: athrow
    //   3849: aload #9
    //   3851: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3854: invokevirtual getName : ()Ljava/lang/String;
    //   3857: ifnull -> 3897
    //   3860: goto -> 3867
    //   3863: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3866: athrow
    //   3867: aload #9
    //   3869: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3872: invokevirtual getName : ()Ljava/lang/String;
    //   3875: sipush #7529
    //   3878: sipush #-17897
    //   3881: invokestatic a : (II)Ljava/lang/String;
    //   3884: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3887: ifne -> 3897
    //   3890: goto -> 3897
    //   3893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3896: athrow
    //   3897: aload #8
    //   3899: iconst_1
    //   3900: invokevirtual setAccessible : (Z)V
    //   3903: aload #8
    //   3905: aconst_null
    //   3906: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3909: pop
    //   3910: iinc #7, 1
    //   3913: iload_2
    //   3914: ifeq -> 3775
    //   3917: sipush #7523
    //   3920: sipush #21839
    //   3923: invokestatic a : (II)Ljava/lang/String;
    //   3926: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3929: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3932: astore #5
    //   3934: aload #5
    //   3936: arraylength
    //   3937: istore #6
    //   3939: iconst_0
    //   3940: istore #7
    //   3942: iload #7
    //   3944: iload #6
    //   3946: if_icmpge -> 4083
    //   3949: aload #5
    //   3951: iload #7
    //   3953: aaload
    //   3954: astore #8
    //   3956: aload #8
    //   3958: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3961: pop
    //   3962: aload #8
    //   3964: invokevirtual getModifiers : ()I
    //   3967: invokestatic isStatic : (I)Z
    //   3970: ifeq -> 4069
    //   3973: aload #8
    //   3975: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3978: arraylength
    //   3979: iconst_2
    //   3980: if_icmpne -> 4069
    //   3983: goto -> 3990
    //   3986: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3989: athrow
    //   3990: aload #8
    //   3992: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3995: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3998: if_acmpne -> 4069
    //   4001: goto -> 4008
    //   4004: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4007: athrow
    //   4008: aload #8
    //   4010: iconst_1
    //   4011: invokevirtual setAccessible : (Z)V
    //   4014: aload #8
    //   4016: aconst_null
    //   4017: iconst_2
    //   4018: anewarray java/lang/Object
    //   4021: dup
    //   4022: iconst_0
    //   4023: aload_0
    //   4024: aastore
    //   4025: dup
    //   4026: iconst_1
    //   4027: aload_1
    //   4028: ifnonnull -> 4046
    //   4031: goto -> 4038
    //   4034: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4037: athrow
    //   4038: aload_1
    //   4039: goto -> 4053
    //   4042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4045: athrow
    //   4046: aload_1
    //   4047: checkcast [B
    //   4050: invokevirtual clone : ()Ljava/lang/Object;
    //   4053: aastore
    //   4054: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4057: checkcast java/lang/Boolean
    //   4060: invokevirtual booleanValue : ()Z
    //   4063: istore #4
    //   4065: iload_2
    //   4066: ifeq -> 4083
    //   4069: iinc #7, 1
    //   4072: iload_2
    //   4073: ifeq -> 3942
    //   4076: goto -> 4083
    //   4079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4082: athrow
    //   4083: iload_2
    //   4084: ifeq -> 4426
    //   4087: sipush #7546
    //   4090: sipush #3732
    //   4093: invokestatic a : (II)Ljava/lang/String;
    //   4096: iconst_1
    //   4097: ldc burp/Ztkc
    //   4099: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4102: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4105: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4108: astore #5
    //   4110: aload #5
    //   4112: arraylength
    //   4113: istore #6
    //   4115: iconst_0
    //   4116: istore #7
    //   4118: iload #7
    //   4120: iload #6
    //   4122: if_icmpge -> 4260
    //   4125: aload #5
    //   4127: iload #7
    //   4129: aaload
    //   4130: astore #8
    //   4132: aload #8
    //   4134: invokevirtual getModifiers : ()I
    //   4137: invokestatic isStatic : (I)Z
    //   4140: ifne -> 4150
    //   4143: goto -> 4253
    //   4146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4149: athrow
    //   4150: aload #8
    //   4152: invokevirtual getType : ()Ljava/lang/Class;
    //   4155: astore #9
    //   4157: aload #9
    //   4159: ifnull -> 4240
    //   4162: aload #9
    //   4164: invokevirtual isPrimitive : ()Z
    //   4167: ifne -> 4240
    //   4170: goto -> 4177
    //   4173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4176: athrow
    //   4177: aload #9
    //   4179: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4182: ifnull -> 4240
    //   4185: goto -> 4192
    //   4188: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4191: athrow
    //   4192: aload #9
    //   4194: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4197: invokevirtual getName : ()Ljava/lang/String;
    //   4200: ifnull -> 4240
    //   4203: goto -> 4210
    //   4206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4209: athrow
    //   4210: aload #9
    //   4212: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4215: invokevirtual getName : ()Ljava/lang/String;
    //   4218: sipush #7529
    //   4221: sipush #-17897
    //   4224: invokestatic a : (II)Ljava/lang/String;
    //   4227: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4230: ifne -> 4240
    //   4233: goto -> 4240
    //   4236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4239: athrow
    //   4240: aload #8
    //   4242: iconst_1
    //   4243: invokevirtual setAccessible : (Z)V
    //   4246: aload #8
    //   4248: aconst_null
    //   4249: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4252: pop
    //   4253: iinc #7, 1
    //   4256: iload_2
    //   4257: ifeq -> 4118
    //   4260: sipush #7535
    //   4263: sipush #-25896
    //   4266: invokestatic a : (II)Ljava/lang/String;
    //   4269: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4272: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4275: astore #5
    //   4277: aload #5
    //   4279: arraylength
    //   4280: istore #6
    //   4282: iconst_0
    //   4283: istore #7
    //   4285: iload #7
    //   4287: iload #6
    //   4289: if_icmpge -> 4426
    //   4292: aload #5
    //   4294: iload #7
    //   4296: aaload
    //   4297: astore #8
    //   4299: aload #8
    //   4301: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4304: pop
    //   4305: aload #8
    //   4307: invokevirtual getModifiers : ()I
    //   4310: invokestatic isStatic : (I)Z
    //   4313: ifeq -> 4412
    //   4316: aload #8
    //   4318: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4321: arraylength
    //   4322: iconst_2
    //   4323: if_icmpne -> 4412
    //   4326: goto -> 4333
    //   4329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4332: athrow
    //   4333: aload #8
    //   4335: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4338: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4341: if_acmpne -> 4412
    //   4344: goto -> 4351
    //   4347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4350: athrow
    //   4351: aload #8
    //   4353: iconst_1
    //   4354: invokevirtual setAccessible : (Z)V
    //   4357: aload #8
    //   4359: aconst_null
    //   4360: iconst_2
    //   4361: anewarray java/lang/Object
    //   4364: dup
    //   4365: iconst_0
    //   4366: aload_0
    //   4367: aastore
    //   4368: dup
    //   4369: iconst_1
    //   4370: aload_1
    //   4371: ifnonnull -> 4389
    //   4374: goto -> 4381
    //   4377: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4380: athrow
    //   4381: aload_1
    //   4382: goto -> 4396
    //   4385: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4388: athrow
    //   4389: aload_1
    //   4390: checkcast [B
    //   4393: invokevirtual clone : ()Ljava/lang/Object;
    //   4396: aastore
    //   4397: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4400: checkcast java/lang/Boolean
    //   4403: invokevirtual booleanValue : ()Z
    //   4406: istore #4
    //   4408: iload_2
    //   4409: ifeq -> 4426
    //   4412: iinc #7, 1
    //   4415: iload_2
    //   4416: ifeq -> 4285
    //   4419: goto -> 4426
    //   4422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4425: athrow
    //   4426: iload #4
    //   4428: ifeq -> 4434
    //   4431: iload #4
    //   4433: ireturn
    //   4434: getstatic burp/Ztgj.Zw : Ljava/lang/String;
    //   4437: getstatic burp/Zsts.Zu : Ljava/lang/Object;
    //   4440: checkcast java/math/BigInteger
    //   4443: invokevirtual intValue : ()I
    //   4446: bipush #32
    //   4448: irem
    //   4449: invokestatic abs : (I)I
    //   4452: invokevirtual charAt : (I)C
    //   4455: getstatic burp/Zmze.ZO : Ljava/lang/String;
    //   4458: getstatic burp/Zva.Zu : Ljava/lang/Object;
    //   4461: checkcast java/math/BigInteger
    //   4464: invokevirtual intValue : ()I
    //   4467: bipush #32
    //   4469: irem
    //   4470: invokestatic abs : (I)I
    //   4473: invokevirtual charAt : (I)C
    //   4476: if_icmpgt -> 4822
    //   4479: sipush #7536
    //   4482: sipush #26141
    //   4485: invokestatic a : (II)Ljava/lang/String;
    //   4488: iconst_1
    //   4489: ldc burp/Zrhu
    //   4491: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4494: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4497: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4500: astore #5
    //   4502: aload #5
    //   4504: arraylength
    //   4505: istore #6
    //   4507: iconst_0
    //   4508: istore #7
    //   4510: iload #7
    //   4512: iload #6
    //   4514: if_icmpge -> 4652
    //   4517: aload #5
    //   4519: iload #7
    //   4521: aaload
    //   4522: astore #8
    //   4524: aload #8
    //   4526: invokevirtual getModifiers : ()I
    //   4529: invokestatic isStatic : (I)Z
    //   4532: ifne -> 4542
    //   4535: goto -> 4645
    //   4538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4541: athrow
    //   4542: aload #8
    //   4544: invokevirtual getType : ()Ljava/lang/Class;
    //   4547: astore #9
    //   4549: aload #9
    //   4551: ifnull -> 4632
    //   4554: aload #9
    //   4556: invokevirtual isPrimitive : ()Z
    //   4559: ifne -> 4632
    //   4562: goto -> 4569
    //   4565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4568: athrow
    //   4569: aload #9
    //   4571: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4574: ifnull -> 4632
    //   4577: goto -> 4584
    //   4580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4583: athrow
    //   4584: aload #9
    //   4586: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4589: invokevirtual getName : ()Ljava/lang/String;
    //   4592: ifnull -> 4632
    //   4595: goto -> 4602
    //   4598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4601: athrow
    //   4602: aload #9
    //   4604: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4607: invokevirtual getName : ()Ljava/lang/String;
    //   4610: sipush #7529
    //   4613: sipush #-17897
    //   4616: invokestatic a : (II)Ljava/lang/String;
    //   4619: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4622: ifne -> 4632
    //   4625: goto -> 4632
    //   4628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4631: athrow
    //   4632: aload #8
    //   4634: iconst_1
    //   4635: invokevirtual setAccessible : (Z)V
    //   4638: aload #8
    //   4640: aconst_null
    //   4641: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4644: pop
    //   4645: iinc #7, 1
    //   4648: iload_2
    //   4649: ifeq -> 4510
    //   4652: sipush #7551
    //   4655: sipush #-4726
    //   4658: invokestatic a : (II)Ljava/lang/String;
    //   4661: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4664: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4667: astore #5
    //   4669: aload #5
    //   4671: arraylength
    //   4672: istore #6
    //   4674: iconst_0
    //   4675: istore #7
    //   4677: iload #7
    //   4679: iload #6
    //   4681: if_icmpge -> 4818
    //   4684: aload #5
    //   4686: iload #7
    //   4688: aaload
    //   4689: astore #8
    //   4691: aload #8
    //   4693: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4696: pop
    //   4697: aload #8
    //   4699: invokevirtual getModifiers : ()I
    //   4702: invokestatic isStatic : (I)Z
    //   4705: ifeq -> 4804
    //   4708: aload #8
    //   4710: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4713: arraylength
    //   4714: iconst_2
    //   4715: if_icmpne -> 4804
    //   4718: goto -> 4725
    //   4721: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4724: athrow
    //   4725: aload #8
    //   4727: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4730: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4733: if_acmpne -> 4804
    //   4736: goto -> 4743
    //   4739: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4742: athrow
    //   4743: aload #8
    //   4745: iconst_1
    //   4746: invokevirtual setAccessible : (Z)V
    //   4749: aload #8
    //   4751: aconst_null
    //   4752: iconst_2
    //   4753: anewarray java/lang/Object
    //   4756: dup
    //   4757: iconst_0
    //   4758: aload_0
    //   4759: aastore
    //   4760: dup
    //   4761: iconst_1
    //   4762: aload_1
    //   4763: ifnonnull -> 4781
    //   4766: goto -> 4773
    //   4769: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4772: athrow
    //   4773: aload_1
    //   4774: goto -> 4788
    //   4777: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4780: athrow
    //   4781: aload_1
    //   4782: checkcast [B
    //   4785: invokevirtual clone : ()Ljava/lang/Object;
    //   4788: aastore
    //   4789: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4792: checkcast java/lang/Boolean
    //   4795: invokevirtual booleanValue : ()Z
    //   4798: istore #4
    //   4800: iload_2
    //   4801: ifeq -> 4818
    //   4804: iinc #7, 1
    //   4807: iload_2
    //   4808: ifeq -> 4677
    //   4811: goto -> 4818
    //   4814: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4817: athrow
    //   4818: iload_2
    //   4819: ifeq -> 5161
    //   4822: sipush #7525
    //   4825: sipush #4379
    //   4828: invokestatic a : (II)Ljava/lang/String;
    //   4831: iconst_1
    //   4832: ldc burp/Zl3l
    //   4834: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4837: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4840: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4843: astore #5
    //   4845: aload #5
    //   4847: arraylength
    //   4848: istore #6
    //   4850: iconst_0
    //   4851: istore #7
    //   4853: iload #7
    //   4855: iload #6
    //   4857: if_icmpge -> 4995
    //   4860: aload #5
    //   4862: iload #7
    //   4864: aaload
    //   4865: astore #8
    //   4867: aload #8
    //   4869: invokevirtual getModifiers : ()I
    //   4872: invokestatic isStatic : (I)Z
    //   4875: ifne -> 4885
    //   4878: goto -> 4988
    //   4881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4884: athrow
    //   4885: aload #8
    //   4887: invokevirtual getType : ()Ljava/lang/Class;
    //   4890: astore #9
    //   4892: aload #9
    //   4894: ifnull -> 4975
    //   4897: aload #9
    //   4899: invokevirtual isPrimitive : ()Z
    //   4902: ifne -> 4975
    //   4905: goto -> 4912
    //   4908: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4911: athrow
    //   4912: aload #9
    //   4914: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4917: ifnull -> 4975
    //   4920: goto -> 4927
    //   4923: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4926: athrow
    //   4927: aload #9
    //   4929: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4932: invokevirtual getName : ()Ljava/lang/String;
    //   4935: ifnull -> 4975
    //   4938: goto -> 4945
    //   4941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4944: athrow
    //   4945: aload #9
    //   4947: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4950: invokevirtual getName : ()Ljava/lang/String;
    //   4953: sipush #7529
    //   4956: sipush #-17897
    //   4959: invokestatic a : (II)Ljava/lang/String;
    //   4962: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4965: ifne -> 4975
    //   4968: goto -> 4975
    //   4971: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4974: athrow
    //   4975: aload #8
    //   4977: iconst_1
    //   4978: invokevirtual setAccessible : (Z)V
    //   4981: aload #8
    //   4983: aconst_null
    //   4984: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4987: pop
    //   4988: iinc #7, 1
    //   4991: iload_2
    //   4992: ifeq -> 4853
    //   4995: sipush #7537
    //   4998: sipush #520
    //   5001: invokestatic a : (II)Ljava/lang/String;
    //   5004: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5007: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5010: astore #5
    //   5012: aload #5
    //   5014: arraylength
    //   5015: istore #6
    //   5017: iconst_0
    //   5018: istore #7
    //   5020: iload #7
    //   5022: iload #6
    //   5024: if_icmpge -> 5161
    //   5027: aload #5
    //   5029: iload #7
    //   5031: aaload
    //   5032: astore #8
    //   5034: aload #8
    //   5036: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5039: pop
    //   5040: aload #8
    //   5042: invokevirtual getModifiers : ()I
    //   5045: invokestatic isStatic : (I)Z
    //   5048: ifeq -> 5147
    //   5051: aload #8
    //   5053: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5056: arraylength
    //   5057: iconst_2
    //   5058: if_icmpne -> 5147
    //   5061: goto -> 5068
    //   5064: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5067: athrow
    //   5068: aload #8
    //   5070: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5073: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5076: if_acmpne -> 5147
    //   5079: goto -> 5086
    //   5082: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5085: athrow
    //   5086: aload #8
    //   5088: iconst_1
    //   5089: invokevirtual setAccessible : (Z)V
    //   5092: aload #8
    //   5094: aconst_null
    //   5095: iconst_2
    //   5096: anewarray java/lang/Object
    //   5099: dup
    //   5100: iconst_0
    //   5101: aload_0
    //   5102: aastore
    //   5103: dup
    //   5104: iconst_1
    //   5105: aload_1
    //   5106: ifnonnull -> 5124
    //   5109: goto -> 5116
    //   5112: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5115: athrow
    //   5116: aload_1
    //   5117: goto -> 5131
    //   5120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5123: athrow
    //   5124: aload_1
    //   5125: checkcast [B
    //   5128: invokevirtual clone : ()Ljava/lang/Object;
    //   5131: aastore
    //   5132: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5135: checkcast java/lang/Boolean
    //   5138: invokevirtual booleanValue : ()Z
    //   5141: istore #4
    //   5143: iload_2
    //   5144: ifeq -> 5161
    //   5147: iinc #7, 1
    //   5150: iload_2
    //   5151: ifeq -> 5020
    //   5154: goto -> 5161
    //   5157: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5160: athrow
    //   5161: iload #4
    //   5163: ifeq -> 5169
    //   5166: iload #4
    //   5168: ireturn
    //   5169: getstatic burp/Zk88.ZZ : Ljava/lang/String;
    //   5172: getstatic burp/Zxx4.Zo : Ljava/lang/Object;
    //   5175: checkcast java/math/BigInteger
    //   5178: invokevirtual intValue : ()I
    //   5181: bipush #32
    //   5183: irem
    //   5184: invokestatic abs : (I)I
    //   5187: invokevirtual charAt : (I)C
    //   5190: getstatic burp/Zb2p.ZV : Ljava/lang/String;
    //   5193: getstatic burp/Zkk2.Zq : Ljava/lang/Object;
    //   5196: checkcast java/math/BigInteger
    //   5199: invokevirtual intValue : ()I
    //   5202: bipush #32
    //   5204: irem
    //   5205: invokestatic abs : (I)I
    //   5208: invokevirtual charAt : (I)C
    //   5211: if_icmple -> 5557
    //   5214: sipush #7524
    //   5217: sipush #29190
    //   5220: invokestatic a : (II)Ljava/lang/String;
    //   5223: iconst_1
    //   5224: ldc burp/Zs9x
    //   5226: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5229: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5232: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5235: astore #5
    //   5237: aload #5
    //   5239: arraylength
    //   5240: istore #6
    //   5242: iconst_0
    //   5243: istore #7
    //   5245: iload #7
    //   5247: iload #6
    //   5249: if_icmpge -> 5387
    //   5252: aload #5
    //   5254: iload #7
    //   5256: aaload
    //   5257: astore #8
    //   5259: aload #8
    //   5261: invokevirtual getModifiers : ()I
    //   5264: invokestatic isStatic : (I)Z
    //   5267: ifne -> 5277
    //   5270: goto -> 5380
    //   5273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5276: athrow
    //   5277: aload #8
    //   5279: invokevirtual getType : ()Ljava/lang/Class;
    //   5282: astore #9
    //   5284: aload #9
    //   5286: ifnull -> 5367
    //   5289: aload #9
    //   5291: invokevirtual isPrimitive : ()Z
    //   5294: ifne -> 5367
    //   5297: goto -> 5304
    //   5300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5303: athrow
    //   5304: aload #9
    //   5306: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5309: ifnull -> 5367
    //   5312: goto -> 5319
    //   5315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5318: athrow
    //   5319: aload #9
    //   5321: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5324: invokevirtual getName : ()Ljava/lang/String;
    //   5327: ifnull -> 5367
    //   5330: goto -> 5337
    //   5333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5336: athrow
    //   5337: aload #9
    //   5339: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5342: invokevirtual getName : ()Ljava/lang/String;
    //   5345: sipush #7529
    //   5348: sipush #-17897
    //   5351: invokestatic a : (II)Ljava/lang/String;
    //   5354: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5357: ifne -> 5367
    //   5360: goto -> 5367
    //   5363: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5366: athrow
    //   5367: aload #8
    //   5369: iconst_1
    //   5370: invokevirtual setAccessible : (Z)V
    //   5373: aload #8
    //   5375: aconst_null
    //   5376: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5379: pop
    //   5380: iinc #7, 1
    //   5383: iload_2
    //   5384: ifeq -> 5245
    //   5387: sipush #7550
    //   5390: sipush #-3961
    //   5393: invokestatic a : (II)Ljava/lang/String;
    //   5396: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5399: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5402: astore #5
    //   5404: aload #5
    //   5406: arraylength
    //   5407: istore #6
    //   5409: iconst_0
    //   5410: istore #7
    //   5412: iload #7
    //   5414: iload #6
    //   5416: if_icmpge -> 5553
    //   5419: aload #5
    //   5421: iload #7
    //   5423: aaload
    //   5424: astore #8
    //   5426: aload #8
    //   5428: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5431: pop
    //   5432: aload #8
    //   5434: invokevirtual getModifiers : ()I
    //   5437: invokestatic isStatic : (I)Z
    //   5440: ifeq -> 5539
    //   5443: aload #8
    //   5445: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5448: arraylength
    //   5449: iconst_2
    //   5450: if_icmpne -> 5539
    //   5453: goto -> 5460
    //   5456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5459: athrow
    //   5460: aload #8
    //   5462: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5465: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5468: if_acmpne -> 5539
    //   5471: goto -> 5478
    //   5474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5477: athrow
    //   5478: aload #8
    //   5480: iconst_1
    //   5481: invokevirtual setAccessible : (Z)V
    //   5484: aload #8
    //   5486: aconst_null
    //   5487: iconst_2
    //   5488: anewarray java/lang/Object
    //   5491: dup
    //   5492: iconst_0
    //   5493: aload_0
    //   5494: aastore
    //   5495: dup
    //   5496: iconst_1
    //   5497: aload_1
    //   5498: ifnonnull -> 5516
    //   5501: goto -> 5508
    //   5504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5507: athrow
    //   5508: aload_1
    //   5509: goto -> 5523
    //   5512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5515: athrow
    //   5516: aload_1
    //   5517: checkcast [B
    //   5520: invokevirtual clone : ()Ljava/lang/Object;
    //   5523: aastore
    //   5524: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5527: checkcast java/lang/Boolean
    //   5530: invokevirtual booleanValue : ()Z
    //   5533: istore #4
    //   5535: iload_2
    //   5536: ifeq -> 5553
    //   5539: iinc #7, 1
    //   5542: iload_2
    //   5543: ifeq -> 5412
    //   5546: goto -> 5553
    //   5549: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5552: athrow
    //   5553: iload_2
    //   5554: ifeq -> 5896
    //   5557: sipush #7538
    //   5560: sipush #26378
    //   5563: invokestatic a : (II)Ljava/lang/String;
    //   5566: iconst_1
    //   5567: ldc burp/Zzi3
    //   5569: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5572: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5575: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5578: astore #5
    //   5580: aload #5
    //   5582: arraylength
    //   5583: istore #6
    //   5585: iconst_0
    //   5586: istore #7
    //   5588: iload #7
    //   5590: iload #6
    //   5592: if_icmpge -> 5730
    //   5595: aload #5
    //   5597: iload #7
    //   5599: aaload
    //   5600: astore #8
    //   5602: aload #8
    //   5604: invokevirtual getModifiers : ()I
    //   5607: invokestatic isStatic : (I)Z
    //   5610: ifne -> 5620
    //   5613: goto -> 5723
    //   5616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5619: athrow
    //   5620: aload #8
    //   5622: invokevirtual getType : ()Ljava/lang/Class;
    //   5625: astore #9
    //   5627: aload #9
    //   5629: ifnull -> 5710
    //   5632: aload #9
    //   5634: invokevirtual isPrimitive : ()Z
    //   5637: ifne -> 5710
    //   5640: goto -> 5647
    //   5643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5646: athrow
    //   5647: aload #9
    //   5649: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5652: ifnull -> 5710
    //   5655: goto -> 5662
    //   5658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5661: athrow
    //   5662: aload #9
    //   5664: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5667: invokevirtual getName : ()Ljava/lang/String;
    //   5670: ifnull -> 5710
    //   5673: goto -> 5680
    //   5676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5679: athrow
    //   5680: aload #9
    //   5682: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5685: invokevirtual getName : ()Ljava/lang/String;
    //   5688: sipush #7529
    //   5691: sipush #-17897
    //   5694: invokestatic a : (II)Ljava/lang/String;
    //   5697: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5700: ifne -> 5710
    //   5703: goto -> 5710
    //   5706: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5709: athrow
    //   5710: aload #8
    //   5712: iconst_1
    //   5713: invokevirtual setAccessible : (Z)V
    //   5716: aload #8
    //   5718: aconst_null
    //   5719: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5722: pop
    //   5723: iinc #7, 1
    //   5726: iload_2
    //   5727: ifeq -> 5588
    //   5730: sipush #7522
    //   5733: sipush #-16276
    //   5736: invokestatic a : (II)Ljava/lang/String;
    //   5739: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5742: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5745: astore #5
    //   5747: aload #5
    //   5749: arraylength
    //   5750: istore #6
    //   5752: iconst_0
    //   5753: istore #7
    //   5755: iload #7
    //   5757: iload #6
    //   5759: if_icmpge -> 5896
    //   5762: aload #5
    //   5764: iload #7
    //   5766: aaload
    //   5767: astore #8
    //   5769: aload #8
    //   5771: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5774: pop
    //   5775: aload #8
    //   5777: invokevirtual getModifiers : ()I
    //   5780: invokestatic isStatic : (I)Z
    //   5783: ifeq -> 5882
    //   5786: aload #8
    //   5788: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5791: arraylength
    //   5792: iconst_2
    //   5793: if_icmpne -> 5882
    //   5796: goto -> 5803
    //   5799: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5802: athrow
    //   5803: aload #8
    //   5805: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5808: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5811: if_acmpne -> 5882
    //   5814: goto -> 5821
    //   5817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5820: athrow
    //   5821: aload #8
    //   5823: iconst_1
    //   5824: invokevirtual setAccessible : (Z)V
    //   5827: aload #8
    //   5829: aconst_null
    //   5830: iconst_2
    //   5831: anewarray java/lang/Object
    //   5834: dup
    //   5835: iconst_0
    //   5836: aload_0
    //   5837: aastore
    //   5838: dup
    //   5839: iconst_1
    //   5840: aload_1
    //   5841: ifnonnull -> 5859
    //   5844: goto -> 5851
    //   5847: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5850: athrow
    //   5851: aload_1
    //   5852: goto -> 5866
    //   5855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5858: athrow
    //   5859: aload_1
    //   5860: checkcast [B
    //   5863: invokevirtual clone : ()Ljava/lang/Object;
    //   5866: aastore
    //   5867: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5870: checkcast java/lang/Boolean
    //   5873: invokevirtual booleanValue : ()Z
    //   5876: istore #4
    //   5878: iload_2
    //   5879: ifeq -> 5896
    //   5882: iinc #7, 1
    //   5885: iload_2
    //   5886: ifeq -> 5755
    //   5889: goto -> 5896
    //   5892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5895: athrow
    //   5896: iload #4
    //   5898: ireturn
    //   5899: astore_3
    //   5900: new java/lang/Exception
    //   5903: dup
    //   5904: aload_3
    //   5905: invokevirtual getMessage : ()Ljava/lang/String;
    //   5908: invokespecial <init> : (Ljava/lang/String;)V
    //   5911: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3698	5899	java/lang/Throwable
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
    //   1985	1999	1999	java/lang/Throwable
    //   2010	2023	2026	java/lang/Throwable
    //   2015	2038	2041	java/lang/Throwable
    //   2030	2056	2059	java/lang/Throwable
    //   2045	2086	2089	java/lang/Throwable
    //   2152	2179	2182	java/lang/Throwable
    //   2169	2197	2200	java/lang/Throwable
    //   2186	2227	2230	java/lang/Throwable
    //   2204	2238	2238	java/lang/Throwable
    //   2249	2265	2268	java/lang/Throwable
    //   2317	2331	2331	java/lang/Throwable
    //   2342	2355	2358	java/lang/Throwable
    //   2347	2370	2373	java/lang/Throwable
    //   2362	2388	2391	java/lang/Throwable
    //   2377	2418	2421	java/lang/Throwable
    //   2484	2511	2514	java/lang/Throwable
    //   2501	2532	2535	java/lang/Throwable
    //   2518	2562	2565	java/lang/Throwable
    //   2539	2573	2573	java/lang/Throwable
    //   2584	2600	2603	java/lang/Throwable
    //   2607	2957	2960	java/lang/Throwable
    //   2791	2801	2801	java/lang/Throwable
    //   2805	2817	2817	java/lang/Throwable
    //   2821	2833	2833	java/lang/Throwable
    //   2837	2850	2850	java/lang/Throwable
    //   2854	2867	2867	java/lang/Throwable
    //   3055	3069	3069	java/lang/Throwable
    //   3080	3093	3096	java/lang/Throwable
    //   3085	3108	3111	java/lang/Throwable
    //   3100	3126	3129	java/lang/Throwable
    //   3115	3156	3159	java/lang/Throwable
    //   3222	3249	3252	java/lang/Throwable
    //   3239	3267	3270	java/lang/Throwable
    //   3256	3297	3300	java/lang/Throwable
    //   3274	3308	3308	java/lang/Throwable
    //   3331	3342	3345	java/lang/Throwable
    //   3397	3411	3411	java/lang/Throwable
    //   3422	3435	3438	java/lang/Throwable
    //   3427	3450	3453	java/lang/Throwable
    //   3442	3468	3471	java/lang/Throwable
    //   3457	3498	3501	java/lang/Throwable
    //   3564	3591	3594	java/lang/Throwable
    //   3581	3609	3612	java/lang/Throwable
    //   3598	3639	3642	java/lang/Throwable
    //   3616	3650	3650	java/lang/Throwable
    //   3673	3684	3687	java/lang/Throwable
    //   3699	4433	5899	java/lang/Throwable
    //   3789	3803	3803	java/lang/Throwable
    //   3814	3827	3830	java/lang/Throwable
    //   3819	3842	3845	java/lang/Throwable
    //   3834	3860	3863	java/lang/Throwable
    //   3849	3890	3893	java/lang/Throwable
    //   3956	3983	3986	java/lang/Throwable
    //   3973	4001	4004	java/lang/Throwable
    //   3990	4031	4034	java/lang/Throwable
    //   4008	4042	4042	java/lang/Throwable
    //   4065	4076	4079	java/lang/Throwable
    //   4132	4146	4146	java/lang/Throwable
    //   4157	4170	4173	java/lang/Throwable
    //   4162	4185	4188	java/lang/Throwable
    //   4177	4203	4206	java/lang/Throwable
    //   4192	4233	4236	java/lang/Throwable
    //   4299	4326	4329	java/lang/Throwable
    //   4316	4344	4347	java/lang/Throwable
    //   4333	4374	4377	java/lang/Throwable
    //   4351	4385	4385	java/lang/Throwable
    //   4408	4419	4422	java/lang/Throwable
    //   4434	5168	5899	java/lang/Throwable
    //   4524	4538	4538	java/lang/Throwable
    //   4549	4562	4565	java/lang/Throwable
    //   4554	4577	4580	java/lang/Throwable
    //   4569	4595	4598	java/lang/Throwable
    //   4584	4625	4628	java/lang/Throwable
    //   4691	4718	4721	java/lang/Throwable
    //   4708	4736	4739	java/lang/Throwable
    //   4725	4766	4769	java/lang/Throwable
    //   4743	4777	4777	java/lang/Throwable
    //   4800	4811	4814	java/lang/Throwable
    //   4867	4881	4881	java/lang/Throwable
    //   4892	4905	4908	java/lang/Throwable
    //   4897	4920	4923	java/lang/Throwable
    //   4912	4938	4941	java/lang/Throwable
    //   4927	4968	4971	java/lang/Throwable
    //   5034	5061	5064	java/lang/Throwable
    //   5051	5079	5082	java/lang/Throwable
    //   5068	5109	5112	java/lang/Throwable
    //   5086	5120	5120	java/lang/Throwable
    //   5143	5154	5157	java/lang/Throwable
    //   5169	5898	5899	java/lang/Throwable
    //   5259	5273	5273	java/lang/Throwable
    //   5284	5297	5300	java/lang/Throwable
    //   5289	5312	5315	java/lang/Throwable
    //   5304	5330	5333	java/lang/Throwable
    //   5319	5360	5363	java/lang/Throwable
    //   5426	5453	5456	java/lang/Throwable
    //   5443	5471	5474	java/lang/Throwable
    //   5460	5501	5504	java/lang/Throwable
    //   5478	5512	5512	java/lang/Throwable
    //   5535	5546	5549	java/lang/Throwable
    //   5602	5616	5616	java/lang/Throwable
    //   5627	5640	5643	java/lang/Throwable
    //   5632	5655	5658	java/lang/Throwable
    //   5647	5673	5676	java/lang/Throwable
    //   5662	5703	5706	java/lang/Throwable
    //   5769	5796	5799	java/lang/Throwable
    //   5786	5814	5817	java/lang/Throwable
    //   5803	5844	5847	java/lang/Throwable
    //   5821	5855	5855	java/lang/Throwable
    //   5878	5889	5892	java/lang/Throwable
  }
  
  static void Zc(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZP(Object paramObject) {
    Zg7w.ZI = a(7520, -20841);
    Zg7w.Zy = new BigInteger(a(7528, 23242));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zvos.Zk.charAt(Math.abs(((BigInteger)Zkht.ZR).intValue() % 32)) > Zb38.Zr.charAt(Math.abs(((BigInteger)Zb38.ZC).intValue() % 32))) {
          try {
            Zg8v.Zy(Class.forName(a(7544, -6905)));
            if (bool)
              Zz75.ZI(Class.forName(a(7549, 18597))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zz75.ZI(Class.forName(a(7549, 18597)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #30
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ôaqÛÉ\\tê!êîvÍù1Î^ÇRçx¿YuÔKnóR'P\\f±*=¹Î[èìk î'Om(ÿê§Ýù¹o_\þï\\t÷u.Ãà¾nDG Ï1bÏFy4/Të°ã¬u×:4Òxw:ÿõá¼6ò¾kIl'=LÇ\\r_Á:ò/\\tòQGô.ë Y\\tåáÑüI\ñ\\tÀôÈó<¸êÆ{ Ï±Py8Þ#Ïc$ücÔ¡möÃ¿lhÍewk©{fsª¡ÍÊ§¡\\t0Í#5\\b\\tJ­s©­È\\tÄ^H¦,ù(\\tw;>\\nâ)#\\tJÚ6 ¨\\tU>zªj1«4\\bÒ}ií\\bdÛ\®8 b\\t{¿ÒE7yÀ\\tuå~Ñêü/\\fo\\tÙEëÅX~j»\\tDX_.-¤v3\\t*ÅÕ|\È\\tí>mªd¼í\\t¬âøyÙBô0\\tê0UÀßËÝ\\t1àöqûè\\rÇkø(Ïh'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
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
    //   68: ldc '\\b¹íf¤6Ü9ã\\tª¹Â.¢³'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #59
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
    //   129: putstatic burp/Zvk.a : [Ljava/lang/String;
    //   132: bipush #30
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zvk.b : [Ljava/lang/String;
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
    //   212: bipush #63
    //   214: goto -> 244
    //   217: bipush #94
    //   219: goto -> 244
    //   222: bipush #11
    //   224: goto -> 244
    //   227: bipush #109
    //   229: goto -> 244
    //   232: bipush #54
    //   234: goto -> 244
    //   237: bipush #47
    //   239: goto -> 244
    //   242: bipush #84
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
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #57
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-99
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-48
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-31
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-114
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-62
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-40
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-63
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-74
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-61
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-101
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #45
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #93
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-9
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #117
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-39
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-9
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-122
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-51
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #31
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #12
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-47
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-66
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-126
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #-64
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #92
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-14
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #-117
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #-53
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: iconst_0
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #44
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-3
    //   493: bastore
    //   494: invokespecial <init> : (I[B)V
    //   497: putstatic burp/Zvk.ZN : Ljava/lang/Object;
    //   500: sipush #7531
    //   503: sipush #9882
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zvk.ZG : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1D68) & 0xFFFF;
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
      char c = 'Ï';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */