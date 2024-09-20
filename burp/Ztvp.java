package burp;

import java.math.BigInteger;

class Ztvp extends ClassLoader {
  static String ZZ;
  
  static Object Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZF(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zg2z.ZE : Ljava/lang/String;
    //   172: getstatic burp/Zsuw.ZB : Ljava/lang/Object;
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
    //   206: getstatic burp/Zevf.ZL : Ljava/lang/String;
    //   209: getstatic burp/Zx58.ZE : Ljava/lang/Object;
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
    //   243: getstatic burp/Zm4k.ZW : Ljava/lang/String;
    //   246: getstatic burp/Zx_b.ZX : Ljava/lang/Object;
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
    //   280: getstatic burp/Zrw7.Zo : Ljava/lang/String;
    //   283: getstatic burp/Zt7w.ZF : Ljava/lang/Object;
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
    //   317: getstatic burp/Zg27.ZP : Ljava/lang/String;
    //   320: getstatic burp/Zm4k.Zm : Ljava/lang/Object;
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
    //   354: getstatic burp/Zt7w.Zi : Ljava/lang/String;
    //   357: getstatic burp/Ztzw.Zk : Ljava/lang/Object;
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
    //   391: getstatic burp/Zlpu.ZA : Ljava/lang/String;
    //   394: getstatic burp/Zsbd.Zh : Ljava/lang/Object;
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
    //   428: getstatic burp/Ze7y.Zm : Ljava/lang/String;
    //   431: getstatic burp/Zk5y.ZL : Ljava/lang/Object;
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
    //   465: getstatic burp/Zxjm.ZG : Ljava/lang/String;
    //   468: getstatic burp/Zec0.Zg : Ljava/lang/Object;
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
    //   502: getstatic burp/Zd0.Zi : Ljava/lang/String;
    //   505: getstatic burp/Zgr4.ZL : Ljava/lang/Object;
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
    //   539: getstatic burp/Zmpc.ZT : Ljava/lang/String;
    //   542: getstatic burp/Zec_.ZN : Ljava/lang/Object;
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
    //   576: getstatic burp/Zz16.ZA : Ljava/lang/String;
    //   579: getstatic burp/Zmsl.ZB : Ljava/lang/Object;
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
    //   613: getstatic burp/Zd0.Zi : Ljava/lang/String;
    //   616: getstatic burp/Zsbd.Zh : Ljava/lang/Object;
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
    //   650: getstatic burp/Zd0.Zi : Ljava/lang/String;
    //   653: getstatic burp/Zs9x.Zo : Ljava/lang/Object;
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
    //   687: getstatic burp/Zlpu.ZA : Ljava/lang/String;
    //   690: getstatic burp/Zg27.ZQ : Ljava/lang/Object;
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
    //   724: getstatic burp/Zlum.ZW : Ljava/lang/String;
    //   727: getstatic burp/Zg27.ZQ : Ljava/lang/Object;
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
    //   761: getstatic burp/Zg27.ZP : Ljava/lang/String;
    //   764: getstatic burp/Zry9.Zw : Ljava/lang/Object;
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
    //   798: getstatic burp/Zs15.Zs : Ljava/lang/String;
    //   801: getstatic burp/Zex5.Zb : Ljava/lang/Object;
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
    //   835: getstatic burp/Zsmn.Zo : Ljava/lang/String;
    //   838: getstatic burp/Zxjm.Zn : Ljava/lang/Object;
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
    //   872: getstatic burp/Ztfr.Zo : Ljava/lang/String;
    //   875: getstatic burp/Zxjm.Zn : Ljava/lang/Object;
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
    //   909: getstatic burp/Zxyu.ZM : Ljava/lang/String;
    //   912: getstatic burp/Zxjm.Zn : Ljava/lang/Object;
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
    //   946: getstatic burp/Zmd.Zf : Ljava/lang/String;
    //   949: getstatic burp/Zbu.ZW : Ljava/lang/Object;
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
    //   983: getstatic burp/Zszz.Zg : Ljava/lang/String;
    //   986: getstatic burp/Zd8.Zs : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zk5y.ZZ : Ljava/lang/String;
    //   1023: getstatic burp/Zszz.ZG : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zbu.ZV : Ljava/lang/String;
    //   1060: getstatic burp/Zsqi.Zf : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zg2z.ZE : Ljava/lang/String;
    //   1097: getstatic burp/Zry9.Zw : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zmd.Zf : Ljava/lang/String;
    //   1134: getstatic burp/Ze40.ZO : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zg27.ZP : Ljava/lang/String;
    //   1171: getstatic burp/Zkff.Zr : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zevf.ZL : Ljava/lang/String;
    //   1208: getstatic burp/Zlfi.ZV : Ljava/lang/Object;
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
    //   1242: getstatic burp/Ze08.Zh : Ljava/lang/String;
    //   1245: getstatic burp/Zvi.Zs : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zt7w.Zi : Ljava/lang/String;
    //   1282: getstatic burp/Zsyu.Zj : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zeqr.Zb : Ljava/lang/String;
    //   1319: getstatic burp/Ze7y.Zh : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zgfm.ZE : Ljava/lang/String;
    //   1362: new java/io/ByteArrayOutputStream
    //   1365: dup
    //   1366: invokespecial <init> : ()V
    //   1369: astore #4
    //   1371: getstatic burp/Zsx6.ZJ : Ljava/lang/String;
    //   1374: astore #5
    //   1376: iconst_0
    //   1377: istore #6
    //   1379: iload #6
    //   1381: aload #5
    //   1383: invokevirtual length : ()I
    //   1386: if_icmpge -> 1417
    //   1389: aload #4
    //   1391: aload #5
    //   1393: iload #6
    //   1395: iload #6
    //   1397: iconst_2
    //   1398: iadd
    //   1399: invokevirtual substring : (II)Ljava/lang/String;
    //   1402: bipush #16
    //   1404: invokestatic parseInt : (Ljava/lang/String;I)I
    //   1407: invokevirtual write : (I)V
    //   1410: iinc #6, 2
    //   1413: iload_2
    //   1414: ifeq -> 1379
    //   1417: aload #4
    //   1419: invokevirtual toByteArray : ()[B
    //   1422: astore #6
    //   1424: getstatic burp/Zxyu.Zp : Ljava/lang/Object;
    //   1427: checkcast java/math/BigInteger
    //   1430: invokevirtual toByteArray : ()[B
    //   1433: astore #7
    //   1435: sipush #256
    //   1438: newarray byte
    //   1440: astore #9
    //   1442: sipush #256
    //   1445: newarray int
    //   1447: astore #10
    //   1449: sipush #256
    //   1452: newarray int
    //   1454: astore #11
    //   1456: sipush #256
    //   1459: newarray int
    //   1461: astore #12
    //   1463: sipush #256
    //   1466: newarray int
    //   1468: astore #13
    //   1470: bipush #10
    //   1472: newarray int
    //   1474: astore #14
    //   1476: sipush #283
    //   1479: istore #15
    //   1481: iconst_0
    //   1482: istore #17
    //   1484: iload #17
    //   1486: sipush #256
    //   1489: if_icmpge -> 1723
    //   1492: sipush #-9746
    //   1495: sipush #4251
    //   1498: invokestatic a : (II)Ljava/lang/String;
    //   1501: iload #17
    //   1503: iconst_1
    //   1504: iushr
    //   1505: invokevirtual charAt : (I)C
    //   1508: istore #26
    //   1510: iload #17
    //   1512: iconst_1
    //   1513: iand
    //   1514: ifne -> 1529
    //   1517: iload #26
    //   1519: bipush #8
    //   1521: iushr
    //   1522: goto -> 1531
    //   1525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1528: athrow
    //   1529: iload #26
    //   1531: i2b
    //   1532: sipush #255
    //   1535: iand
    //   1536: istore #16
    //   1538: iload #17
    //   1540: iconst_1
    //   1541: ishl
    //   1542: istore #18
    //   1544: iload #18
    //   1546: sipush #256
    //   1549: if_icmplt -> 1559
    //   1552: iload #18
    //   1554: iload #15
    //   1556: ixor
    //   1557: istore #18
    //   1559: iload #18
    //   1561: iconst_1
    //   1562: ishl
    //   1563: istore #19
    //   1565: iload #19
    //   1567: sipush #256
    //   1570: if_icmplt -> 1580
    //   1573: iload #19
    //   1575: iload #15
    //   1577: ixor
    //   1578: istore #19
    //   1580: iload #19
    //   1582: iconst_1
    //   1583: ishl
    //   1584: istore #20
    //   1586: iload #20
    //   1588: sipush #256
    //   1591: if_icmplt -> 1601
    //   1594: iload #20
    //   1596: iload #15
    //   1598: ixor
    //   1599: istore #20
    //   1601: iload #20
    //   1603: iload #17
    //   1605: ixor
    //   1606: istore #21
    //   1608: iload #21
    //   1610: iload #18
    //   1612: ixor
    //   1613: istore #22
    //   1615: iload #21
    //   1617: iload #19
    //   1619: ixor
    //   1620: istore #23
    //   1622: iload #20
    //   1624: iload #19
    //   1626: ixor
    //   1627: iload #18
    //   1629: ixor
    //   1630: istore #24
    //   1632: aload #9
    //   1634: iload #17
    //   1636: iload #16
    //   1638: i2b
    //   1639: bastore
    //   1640: aload #10
    //   1642: iload #16
    //   1644: iload #24
    //   1646: bipush #24
    //   1648: ishl
    //   1649: iload #21
    //   1651: bipush #16
    //   1653: ishl
    //   1654: ior
    //   1655: iload #23
    //   1657: bipush #8
    //   1659: ishl
    //   1660: ior
    //   1661: iload #22
    //   1663: ior
    //   1664: dup
    //   1665: istore #25
    //   1667: iastore
    //   1668: aload #11
    //   1670: iload #16
    //   1672: iload #25
    //   1674: bipush #8
    //   1676: iushr
    //   1677: iload #25
    //   1679: bipush #24
    //   1681: ishl
    //   1682: ior
    //   1683: iastore
    //   1684: aload #12
    //   1686: iload #16
    //   1688: iload #25
    //   1690: bipush #16
    //   1692: iushr
    //   1693: iload #25
    //   1695: bipush #16
    //   1697: ishl
    //   1698: ior
    //   1699: iastore
    //   1700: aload #13
    //   1702: iload #16
    //   1704: iload #25
    //   1706: bipush #24
    //   1708: iushr
    //   1709: iload #25
    //   1711: bipush #8
    //   1713: ishl
    //   1714: ior
    //   1715: iastore
    //   1716: iinc #17, 1
    //   1719: iload_2
    //   1720: ifeq -> 1484
    //   1723: iconst_1
    //   1724: istore #26
    //   1726: aload #14
    //   1728: iconst_0
    //   1729: iload #26
    //   1731: bipush #24
    //   1733: ishl
    //   1734: iastore
    //   1735: iconst_1
    //   1736: istore #27
    //   1738: iload #27
    //   1740: bipush #10
    //   1742: if_icmpge -> 1783
    //   1745: iload #26
    //   1747: iconst_1
    //   1748: ishl
    //   1749: istore #26
    //   1751: iload #26
    //   1753: sipush #256
    //   1756: if_icmplt -> 1766
    //   1759: iload #26
    //   1761: iload #15
    //   1763: ixor
    //   1764: istore #26
    //   1766: aload #14
    //   1768: iload #27
    //   1770: iload #26
    //   1772: bipush #24
    //   1774: ishl
    //   1775: iastore
    //   1776: iinc #27, 1
    //   1779: iload_2
    //   1780: ifeq -> 1738
    //   1783: iconst_4
    //   1784: istore #27
    //   1786: iload #27
    //   1788: bipush #6
    //   1790: iadd
    //   1791: istore #28
    //   1793: iconst_4
    //   1794: iload #28
    //   1796: iconst_1
    //   1797: iadd
    //   1798: imul
    //   1799: istore #29
    //   1801: iload #29
    //   1803: newarray int
    //   1805: astore #30
    //   1807: iload #29
    //   1809: newarray int
    //   1811: astore #31
    //   1813: iconst_0
    //   1814: istore #26
    //   1816: iconst_0
    //   1817: istore #33
    //   1819: iconst_0
    //   1820: istore #34
    //   1822: iload #33
    //   1824: iload #27
    //   1826: if_icmpge -> 1894
    //   1829: aload #30
    //   1831: iload #33
    //   1833: aload #6
    //   1835: iload #34
    //   1837: baload
    //   1838: bipush #24
    //   1840: ishl
    //   1841: aload #6
    //   1843: iload #34
    //   1845: iconst_1
    //   1846: iadd
    //   1847: baload
    //   1848: sipush #255
    //   1851: iand
    //   1852: bipush #16
    //   1854: ishl
    //   1855: ior
    //   1856: aload #6
    //   1858: iload #34
    //   1860: iconst_2
    //   1861: iadd
    //   1862: baload
    //   1863: sipush #255
    //   1866: iand
    //   1867: bipush #8
    //   1869: ishl
    //   1870: ior
    //   1871: aload #6
    //   1873: iload #34
    //   1875: iconst_3
    //   1876: iadd
    //   1877: baload
    //   1878: sipush #255
    //   1881: iand
    //   1882: ior
    //   1883: iastore
    //   1884: iinc #33, 1
    //   1887: iinc #34, 4
    //   1890: iload_2
    //   1891: ifeq -> 1822
    //   1894: iload #27
    //   1896: istore #33
    //   1898: iconst_0
    //   1899: istore #34
    //   1901: iload #33
    //   1903: iload #29
    //   1905: if_icmpge -> 2032
    //   1908: aload #30
    //   1910: iload #33
    //   1912: iconst_1
    //   1913: isub
    //   1914: iaload
    //   1915: istore #32
    //   1917: iload #34
    //   1919: ifne -> 2006
    //   1922: iload #27
    //   1924: istore #34
    //   1926: aload #9
    //   1928: iload #32
    //   1930: bipush #16
    //   1932: iushr
    //   1933: sipush #255
    //   1936: iand
    //   1937: baload
    //   1938: bipush #24
    //   1940: ishl
    //   1941: aload #9
    //   1943: iload #32
    //   1945: bipush #8
    //   1947: iushr
    //   1948: sipush #255
    //   1951: iand
    //   1952: baload
    //   1953: sipush #255
    //   1956: iand
    //   1957: bipush #16
    //   1959: ishl
    //   1960: ior
    //   1961: aload #9
    //   1963: iload #32
    //   1965: sipush #255
    //   1968: iand
    //   1969: baload
    //   1970: sipush #255
    //   1973: iand
    //   1974: bipush #8
    //   1976: ishl
    //   1977: ior
    //   1978: aload #9
    //   1980: iload #32
    //   1982: bipush #24
    //   1984: iushr
    //   1985: baload
    //   1986: sipush #255
    //   1989: iand
    //   1990: ior
    //   1991: istore #32
    //   1993: iload #32
    //   1995: aload #14
    //   1997: iload #26
    //   1999: iinc #26, 1
    //   2002: iaload
    //   2003: ixor
    //   2004: istore #32
    //   2006: aload #30
    //   2008: iload #33
    //   2010: aload #30
    //   2012: iload #33
    //   2014: iload #27
    //   2016: isub
    //   2017: iaload
    //   2018: iload #32
    //   2020: ixor
    //   2021: iastore
    //   2022: iinc #33, 1
    //   2025: iinc #34, -1
    //   2028: iload_2
    //   2029: ifeq -> 1901
    //   2032: iconst_0
    //   2033: istore #33
    //   2035: iconst_4
    //   2036: iload #28
    //   2038: imul
    //   2039: istore #34
    //   2041: aload #31
    //   2043: iload #33
    //   2045: aload #30
    //   2047: iload #34
    //   2049: iaload
    //   2050: iastore
    //   2051: aload #31
    //   2053: iload #33
    //   2055: iconst_1
    //   2056: iadd
    //   2057: aload #30
    //   2059: iload #34
    //   2061: iconst_1
    //   2062: iadd
    //   2063: iaload
    //   2064: iastore
    //   2065: aload #31
    //   2067: iload #33
    //   2069: iconst_2
    //   2070: iadd
    //   2071: aload #30
    //   2073: iload #34
    //   2075: iconst_2
    //   2076: iadd
    //   2077: iaload
    //   2078: iastore
    //   2079: aload #31
    //   2081: iload #33
    //   2083: iconst_3
    //   2084: iadd
    //   2085: aload #30
    //   2087: iload #34
    //   2089: iconst_3
    //   2090: iadd
    //   2091: iaload
    //   2092: iastore
    //   2093: iinc #33, 4
    //   2096: iinc #34, -4
    //   2099: iconst_1
    //   2100: istore #36
    //   2102: iload #36
    //   2104: iload #28
    //   2106: if_icmpge -> 2470
    //   2109: aload #30
    //   2111: iload #34
    //   2113: iaload
    //   2114: istore #35
    //   2116: aload #31
    //   2118: iload #33
    //   2120: aload #10
    //   2122: aload #9
    //   2124: iload #35
    //   2126: bipush #24
    //   2128: iushr
    //   2129: baload
    //   2130: sipush #255
    //   2133: iand
    //   2134: iaload
    //   2135: aload #11
    //   2137: aload #9
    //   2139: iload #35
    //   2141: bipush #16
    //   2143: iushr
    //   2144: sipush #255
    //   2147: iand
    //   2148: baload
    //   2149: sipush #255
    //   2152: iand
    //   2153: iaload
    //   2154: ixor
    //   2155: aload #12
    //   2157: aload #9
    //   2159: iload #35
    //   2161: bipush #8
    //   2163: iushr
    //   2164: sipush #255
    //   2167: iand
    //   2168: baload
    //   2169: sipush #255
    //   2172: iand
    //   2173: iaload
    //   2174: ixor
    //   2175: aload #13
    //   2177: aload #9
    //   2179: iload #35
    //   2181: sipush #255
    //   2184: iand
    //   2185: baload
    //   2186: sipush #255
    //   2189: iand
    //   2190: iaload
    //   2191: ixor
    //   2192: iastore
    //   2193: aload #30
    //   2195: iload #34
    //   2197: iconst_1
    //   2198: iadd
    //   2199: iaload
    //   2200: istore #35
    //   2202: aload #31
    //   2204: iload #33
    //   2206: iconst_1
    //   2207: iadd
    //   2208: aload #10
    //   2210: aload #9
    //   2212: iload #35
    //   2214: bipush #24
    //   2216: iushr
    //   2217: baload
    //   2218: sipush #255
    //   2221: iand
    //   2222: iaload
    //   2223: aload #11
    //   2225: aload #9
    //   2227: iload #35
    //   2229: bipush #16
    //   2231: iushr
    //   2232: sipush #255
    //   2235: iand
    //   2236: baload
    //   2237: sipush #255
    //   2240: iand
    //   2241: iaload
    //   2242: ixor
    //   2243: aload #12
    //   2245: aload #9
    //   2247: iload #35
    //   2249: bipush #8
    //   2251: iushr
    //   2252: sipush #255
    //   2255: iand
    //   2256: baload
    //   2257: sipush #255
    //   2260: iand
    //   2261: iaload
    //   2262: ixor
    //   2263: aload #13
    //   2265: aload #9
    //   2267: iload #35
    //   2269: sipush #255
    //   2272: iand
    //   2273: baload
    //   2274: sipush #255
    //   2277: iand
    //   2278: iaload
    //   2279: ixor
    //   2280: iastore
    //   2281: aload #30
    //   2283: iload #34
    //   2285: iconst_2
    //   2286: iadd
    //   2287: iaload
    //   2288: istore #35
    //   2290: aload #31
    //   2292: iload #33
    //   2294: iconst_2
    //   2295: iadd
    //   2296: aload #10
    //   2298: aload #9
    //   2300: iload #35
    //   2302: bipush #24
    //   2304: iushr
    //   2305: baload
    //   2306: sipush #255
    //   2309: iand
    //   2310: iaload
    //   2311: aload #11
    //   2313: aload #9
    //   2315: iload #35
    //   2317: bipush #16
    //   2319: iushr
    //   2320: sipush #255
    //   2323: iand
    //   2324: baload
    //   2325: sipush #255
    //   2328: iand
    //   2329: iaload
    //   2330: ixor
    //   2331: aload #12
    //   2333: aload #9
    //   2335: iload #35
    //   2337: bipush #8
    //   2339: iushr
    //   2340: sipush #255
    //   2343: iand
    //   2344: baload
    //   2345: sipush #255
    //   2348: iand
    //   2349: iaload
    //   2350: ixor
    //   2351: aload #13
    //   2353: aload #9
    //   2355: iload #35
    //   2357: sipush #255
    //   2360: iand
    //   2361: baload
    //   2362: sipush #255
    //   2365: iand
    //   2366: iaload
    //   2367: ixor
    //   2368: iastore
    //   2369: aload #30
    //   2371: iload #34
    //   2373: iconst_3
    //   2374: iadd
    //   2375: iaload
    //   2376: istore #35
    //   2378: aload #31
    //   2380: iload #33
    //   2382: iconst_3
    //   2383: iadd
    //   2384: aload #10
    //   2386: aload #9
    //   2388: iload #35
    //   2390: bipush #24
    //   2392: iushr
    //   2393: baload
    //   2394: sipush #255
    //   2397: iand
    //   2398: iaload
    //   2399: aload #11
    //   2401: aload #9
    //   2403: iload #35
    //   2405: bipush #16
    //   2407: iushr
    //   2408: sipush #255
    //   2411: iand
    //   2412: baload
    //   2413: sipush #255
    //   2416: iand
    //   2417: iaload
    //   2418: ixor
    //   2419: aload #12
    //   2421: aload #9
    //   2423: iload #35
    //   2425: bipush #8
    //   2427: iushr
    //   2428: sipush #255
    //   2431: iand
    //   2432: baload
    //   2433: sipush #255
    //   2436: iand
    //   2437: iaload
    //   2438: ixor
    //   2439: aload #13
    //   2441: aload #9
    //   2443: iload #35
    //   2445: sipush #255
    //   2448: iand
    //   2449: baload
    //   2450: sipush #255
    //   2453: iand
    //   2454: iaload
    //   2455: ixor
    //   2456: iastore
    //   2457: iinc #33, 4
    //   2460: iinc #34, -4
    //   2463: iinc #36, 1
    //   2466: iload_2
    //   2467: ifeq -> 2102
    //   2470: aload #31
    //   2472: iload #33
    //   2474: aload #30
    //   2476: iload #34
    //   2478: iaload
    //   2479: iastore
    //   2480: aload #31
    //   2482: iload #33
    //   2484: iconst_1
    //   2485: iadd
    //   2486: aload #30
    //   2488: iload #34
    //   2490: iconst_1
    //   2491: iadd
    //   2492: iaload
    //   2493: iastore
    //   2494: aload #31
    //   2496: iload #33
    //   2498: iconst_2
    //   2499: iadd
    //   2500: aload #30
    //   2502: iload #34
    //   2504: iconst_2
    //   2505: iadd
    //   2506: iaload
    //   2507: iastore
    //   2508: aload #31
    //   2510: iload #33
    //   2512: iconst_3
    //   2513: iadd
    //   2514: aload #30
    //   2516: iload #34
    //   2518: iconst_3
    //   2519: iadd
    //   2520: iaload
    //   2521: iastore
    //   2522: iconst_0
    //   2523: newarray byte
    //   2525: astore #36
    //   2527: aload #7
    //   2529: arraylength
    //   2530: bipush #16
    //   2532: irem
    //   2533: ifeq -> 2557
    //   2536: new java/lang/Exception
    //   2539: dup
    //   2540: sipush #-9759
    //   2543: sipush #11355
    //   2546: invokestatic a : (II)Ljava/lang/String;
    //   2549: invokespecial <init> : (Ljava/lang/String;)V
    //   2552: athrow
    //   2553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2556: athrow
    //   2557: bipush #10
    //   2559: istore #37
    //   2561: sipush #-9747
    //   2564: sipush #256
    //   2567: newarray byte
    //   2569: astore #38
    //   2571: sipush #-17892
    //   2574: sipush #256
    //   2577: newarray int
    //   2579: astore #39
    //   2581: sipush #256
    //   2584: newarray int
    //   2586: astore #40
    //   2588: sipush #256
    //   2591: newarray int
    //   2593: astore #41
    //   2595: sipush #256
    //   2598: newarray int
    //   2600: astore #42
    //   2602: sipush #283
    //   2605: istore #15
    //   2607: invokestatic a : (II)Ljava/lang/String;
    //   2610: astore #43
    //   2612: iconst_0
    //   2613: istore #17
    //   2615: iload #17
    //   2617: sipush #256
    //   2620: if_icmpge -> 2847
    //   2623: aload #43
    //   2625: iload #17
    //   2627: iconst_1
    //   2628: iushr
    //   2629: invokevirtual charAt : (I)C
    //   2632: istore #44
    //   2634: iload #17
    //   2636: iconst_1
    //   2637: iand
    //   2638: ifne -> 2653
    //   2641: iload #44
    //   2643: bipush #8
    //   2645: iushr
    //   2646: goto -> 2655
    //   2649: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2652: athrow
    //   2653: iload #44
    //   2655: i2b
    //   2656: sipush #255
    //   2659: iand
    //   2660: istore #16
    //   2662: iload #17
    //   2664: iconst_1
    //   2665: ishl
    //   2666: istore #18
    //   2668: iload #18
    //   2670: sipush #256
    //   2673: if_icmplt -> 2683
    //   2676: iload #18
    //   2678: iload #15
    //   2680: ixor
    //   2681: istore #18
    //   2683: iload #18
    //   2685: iconst_1
    //   2686: ishl
    //   2687: istore #19
    //   2689: iload #19
    //   2691: sipush #256
    //   2694: if_icmplt -> 2704
    //   2697: iload #19
    //   2699: iload #15
    //   2701: ixor
    //   2702: istore #19
    //   2704: iload #19
    //   2706: iconst_1
    //   2707: ishl
    //   2708: istore #20
    //   2710: iload #20
    //   2712: sipush #256
    //   2715: if_icmplt -> 2725
    //   2718: iload #20
    //   2720: iload #15
    //   2722: ixor
    //   2723: istore #20
    //   2725: iload #20
    //   2727: iload #17
    //   2729: ixor
    //   2730: istore #21
    //   2732: iload #21
    //   2734: iload #18
    //   2736: ixor
    //   2737: istore #22
    //   2739: iload #21
    //   2741: iload #19
    //   2743: ixor
    //   2744: istore #23
    //   2746: iload #20
    //   2748: iload #19
    //   2750: ixor
    //   2751: iload #18
    //   2753: ixor
    //   2754: istore #24
    //   2756: aload #38
    //   2758: iload #16
    //   2760: iload #17
    //   2762: i2b
    //   2763: bastore
    //   2764: aload #39
    //   2766: iload #16
    //   2768: iload #24
    //   2770: bipush #24
    //   2772: ishl
    //   2773: iload #21
    //   2775: bipush #16
    //   2777: ishl
    //   2778: ior
    //   2779: iload #23
    //   2781: bipush #8
    //   2783: ishl
    //   2784: ior
    //   2785: iload #22
    //   2787: ior
    //   2788: dup
    //   2789: istore #25
    //   2791: iastore
    //   2792: aload #40
    //   2794: iload #16
    //   2796: iload #25
    //   2798: bipush #8
    //   2800: iushr
    //   2801: iload #25
    //   2803: bipush #24
    //   2805: ishl
    //   2806: ior
    //   2807: iastore
    //   2808: aload #41
    //   2810: iload #16
    //   2812: iload #25
    //   2814: bipush #16
    //   2816: iushr
    //   2817: iload #25
    //   2819: bipush #16
    //   2821: ishl
    //   2822: ior
    //   2823: iastore
    //   2824: aload #42
    //   2826: iload #16
    //   2828: iload #25
    //   2830: bipush #24
    //   2832: iushr
    //   2833: iload #25
    //   2835: bipush #8
    //   2837: ishl
    //   2838: ior
    //   2839: iastore
    //   2840: iinc #17, 1
    //   2843: iload_2
    //   2844: ifeq -> 2615
    //   2847: aload #7
    //   2849: arraylength
    //   2850: newarray byte
    //   2852: astore #44
    //   2854: iconst_0
    //   2855: istore #45
    //   2857: iload #45
    //   2859: aload #7
    //   2861: arraylength
    //   2862: bipush #16
    //   2864: idiv
    //   2865: if_icmpge -> 3779
    //   2868: bipush #16
    //   2870: newarray byte
    //   2872: astore #46
    //   2874: bipush #16
    //   2876: newarray byte
    //   2878: astore #47
    //   2880: iconst_0
    //   2881: istore #48
    //   2883: iload #48
    //   2885: bipush #16
    //   2887: if_icmpge -> 2913
    //   2890: aload #46
    //   2892: iload #48
    //   2894: aload #7
    //   2896: iload #48
    //   2898: iload #45
    //   2900: bipush #16
    //   2902: imul
    //   2903: iadd
    //   2904: baload
    //   2905: bastore
    //   2906: iinc #48, 1
    //   2909: iload_2
    //   2910: ifeq -> 2883
    //   2913: iconst_0
    //   2914: istore #48
    //   2916: aload #46
    //   2918: iconst_0
    //   2919: baload
    //   2920: bipush #24
    //   2922: ishl
    //   2923: aload #46
    //   2925: iconst_1
    //   2926: baload
    //   2927: sipush #255
    //   2930: iand
    //   2931: bipush #16
    //   2933: ishl
    //   2934: ior
    //   2935: aload #46
    //   2937: iconst_2
    //   2938: baload
    //   2939: sipush #255
    //   2942: iand
    //   2943: bipush #8
    //   2945: ishl
    //   2946: ior
    //   2947: aload #46
    //   2949: iconst_3
    //   2950: baload
    //   2951: sipush #255
    //   2954: iand
    //   2955: ior
    //   2956: aload #31
    //   2958: iconst_0
    //   2959: iaload
    //   2960: ixor
    //   2961: istore #50
    //   2963: aload #46
    //   2965: iconst_4
    //   2966: baload
    //   2967: bipush #24
    //   2969: ishl
    //   2970: aload #46
    //   2972: iconst_5
    //   2973: baload
    //   2974: sipush #255
    //   2977: iand
    //   2978: bipush #16
    //   2980: ishl
    //   2981: ior
    //   2982: aload #46
    //   2984: bipush #6
    //   2986: baload
    //   2987: sipush #255
    //   2990: iand
    //   2991: bipush #8
    //   2993: ishl
    //   2994: ior
    //   2995: aload #46
    //   2997: bipush #7
    //   2999: baload
    //   3000: sipush #255
    //   3003: iand
    //   3004: ior
    //   3005: aload #31
    //   3007: iconst_1
    //   3008: iaload
    //   3009: ixor
    //   3010: istore #51
    //   3012: aload #46
    //   3014: bipush #8
    //   3016: baload
    //   3017: bipush #24
    //   3019: ishl
    //   3020: aload #46
    //   3022: bipush #9
    //   3024: baload
    //   3025: sipush #255
    //   3028: iand
    //   3029: bipush #16
    //   3031: ishl
    //   3032: ior
    //   3033: aload #46
    //   3035: bipush #10
    //   3037: baload
    //   3038: sipush #255
    //   3041: iand
    //   3042: bipush #8
    //   3044: ishl
    //   3045: ior
    //   3046: aload #46
    //   3048: bipush #11
    //   3050: baload
    //   3051: sipush #255
    //   3054: iand
    //   3055: ior
    //   3056: aload #31
    //   3058: iconst_2
    //   3059: iaload
    //   3060: ixor
    //   3061: istore #52
    //   3063: aload #46
    //   3065: bipush #12
    //   3067: baload
    //   3068: bipush #24
    //   3070: ishl
    //   3071: aload #46
    //   3073: bipush #13
    //   3075: baload
    //   3076: sipush #255
    //   3079: iand
    //   3080: bipush #16
    //   3082: ishl
    //   3083: ior
    //   3084: aload #46
    //   3086: bipush #14
    //   3088: baload
    //   3089: sipush #255
    //   3092: iand
    //   3093: bipush #8
    //   3095: ishl
    //   3096: ior
    //   3097: aload #46
    //   3099: bipush #15
    //   3101: baload
    //   3102: sipush #255
    //   3105: iand
    //   3106: ior
    //   3107: aload #31
    //   3109: iconst_3
    //   3110: iaload
    //   3111: ixor
    //   3112: istore #53
    //   3114: iconst_1
    //   3115: istore #54
    //   3117: iload #54
    //   3119: iload #37
    //   3121: if_icmpge -> 3364
    //   3124: iinc #48, 4
    //   3127: aload #39
    //   3129: iload #50
    //   3131: bipush #24
    //   3133: iushr
    //   3134: iaload
    //   3135: aload #40
    //   3137: iload #53
    //   3139: bipush #16
    //   3141: iushr
    //   3142: sipush #255
    //   3145: iand
    //   3146: iaload
    //   3147: ixor
    //   3148: aload #41
    //   3150: iload #52
    //   3152: bipush #8
    //   3154: iushr
    //   3155: sipush #255
    //   3158: iand
    //   3159: iaload
    //   3160: ixor
    //   3161: aload #42
    //   3163: iload #51
    //   3165: sipush #255
    //   3168: iand
    //   3169: iaload
    //   3170: ixor
    //   3171: aload #31
    //   3173: iload #48
    //   3175: iaload
    //   3176: ixor
    //   3177: istore #55
    //   3179: aload #39
    //   3181: iload #51
    //   3183: bipush #24
    //   3185: iushr
    //   3186: iaload
    //   3187: aload #40
    //   3189: iload #50
    //   3191: bipush #16
    //   3193: iushr
    //   3194: sipush #255
    //   3197: iand
    //   3198: iaload
    //   3199: ixor
    //   3200: aload #41
    //   3202: iload #53
    //   3204: bipush #8
    //   3206: iushr
    //   3207: sipush #255
    //   3210: iand
    //   3211: iaload
    //   3212: ixor
    //   3213: aload #42
    //   3215: iload #52
    //   3217: sipush #255
    //   3220: iand
    //   3221: iaload
    //   3222: ixor
    //   3223: aload #31
    //   3225: iload #48
    //   3227: iconst_1
    //   3228: iadd
    //   3229: iaload
    //   3230: ixor
    //   3231: istore #56
    //   3233: aload #39
    //   3235: iload #52
    //   3237: bipush #24
    //   3239: iushr
    //   3240: iaload
    //   3241: aload #40
    //   3243: iload #51
    //   3245: bipush #16
    //   3247: iushr
    //   3248: sipush #255
    //   3251: iand
    //   3252: iaload
    //   3253: ixor
    //   3254: aload #41
    //   3256: iload #50
    //   3258: bipush #8
    //   3260: iushr
    //   3261: sipush #255
    //   3264: iand
    //   3265: iaload
    //   3266: ixor
    //   3267: aload #42
    //   3269: iload #53
    //   3271: sipush #255
    //   3274: iand
    //   3275: iaload
    //   3276: ixor
    //   3277: aload #31
    //   3279: iload #48
    //   3281: iconst_2
    //   3282: iadd
    //   3283: iaload
    //   3284: ixor
    //   3285: istore #57
    //   3287: aload #39
    //   3289: iload #53
    //   3291: bipush #24
    //   3293: iushr
    //   3294: iaload
    //   3295: aload #40
    //   3297: iload #52
    //   3299: bipush #16
    //   3301: iushr
    //   3302: sipush #255
    //   3305: iand
    //   3306: iaload
    //   3307: ixor
    //   3308: aload #41
    //   3310: iload #51
    //   3312: bipush #8
    //   3314: iushr
    //   3315: sipush #255
    //   3318: iand
    //   3319: iaload
    //   3320: ixor
    //   3321: aload #42
    //   3323: iload #50
    //   3325: sipush #255
    //   3328: iand
    //   3329: iaload
    //   3330: ixor
    //   3331: aload #31
    //   3333: iload #48
    //   3335: iconst_3
    //   3336: iadd
    //   3337: iaload
    //   3338: ixor
    //   3339: istore #58
    //   3341: iload #55
    //   3343: istore #50
    //   3345: iload #56
    //   3347: istore #51
    //   3349: iload #57
    //   3351: istore #52
    //   3353: iload #58
    //   3355: istore #53
    //   3357: iinc #54, 1
    //   3360: iload_2
    //   3361: ifeq -> 3117
    //   3364: iinc #48, 4
    //   3367: aload #31
    //   3369: iload #48
    //   3371: iaload
    //   3372: istore #49
    //   3374: aload #47
    //   3376: iconst_0
    //   3377: aload #38
    //   3379: iload #50
    //   3381: bipush #24
    //   3383: iushr
    //   3384: baload
    //   3385: iload #49
    //   3387: bipush #24
    //   3389: iushr
    //   3390: ixor
    //   3391: i2b
    //   3392: bastore
    //   3393: aload #47
    //   3395: iconst_1
    //   3396: aload #38
    //   3398: iload #53
    //   3400: bipush #16
    //   3402: iushr
    //   3403: sipush #255
    //   3406: iand
    //   3407: baload
    //   3408: iload #49
    //   3410: bipush #16
    //   3412: iushr
    //   3413: ixor
    //   3414: i2b
    //   3415: bastore
    //   3416: aload #47
    //   3418: iconst_2
    //   3419: aload #38
    //   3421: iload #52
    //   3423: bipush #8
    //   3425: iushr
    //   3426: sipush #255
    //   3429: iand
    //   3430: baload
    //   3431: iload #49
    //   3433: bipush #8
    //   3435: iushr
    //   3436: ixor
    //   3437: i2b
    //   3438: bastore
    //   3439: aload #47
    //   3441: iconst_3
    //   3442: aload #38
    //   3444: iload #51
    //   3446: sipush #255
    //   3449: iand
    //   3450: baload
    //   3451: iload #49
    //   3453: ixor
    //   3454: i2b
    //   3455: bastore
    //   3456: aload #31
    //   3458: iload #48
    //   3460: iconst_1
    //   3461: iadd
    //   3462: iaload
    //   3463: istore #49
    //   3465: aload #47
    //   3467: iconst_4
    //   3468: aload #38
    //   3470: iload #51
    //   3472: bipush #24
    //   3474: iushr
    //   3475: baload
    //   3476: iload #49
    //   3478: bipush #24
    //   3480: iushr
    //   3481: ixor
    //   3482: i2b
    //   3483: bastore
    //   3484: aload #47
    //   3486: iconst_5
    //   3487: aload #38
    //   3489: iload #50
    //   3491: bipush #16
    //   3493: iushr
    //   3494: sipush #255
    //   3497: iand
    //   3498: baload
    //   3499: iload #49
    //   3501: bipush #16
    //   3503: iushr
    //   3504: ixor
    //   3505: i2b
    //   3506: bastore
    //   3507: aload #47
    //   3509: bipush #6
    //   3511: aload #38
    //   3513: iload #53
    //   3515: bipush #8
    //   3517: iushr
    //   3518: sipush #255
    //   3521: iand
    //   3522: baload
    //   3523: iload #49
    //   3525: bipush #8
    //   3527: iushr
    //   3528: ixor
    //   3529: i2b
    //   3530: bastore
    //   3531: aload #47
    //   3533: bipush #7
    //   3535: aload #38
    //   3537: iload #52
    //   3539: sipush #255
    //   3542: iand
    //   3543: baload
    //   3544: iload #49
    //   3546: ixor
    //   3547: i2b
    //   3548: bastore
    //   3549: aload #31
    //   3551: iload #48
    //   3553: iconst_2
    //   3554: iadd
    //   3555: iaload
    //   3556: istore #49
    //   3558: aload #47
    //   3560: bipush #8
    //   3562: aload #38
    //   3564: iload #52
    //   3566: bipush #24
    //   3568: iushr
    //   3569: baload
    //   3570: iload #49
    //   3572: bipush #24
    //   3574: iushr
    //   3575: ixor
    //   3576: i2b
    //   3577: bastore
    //   3578: aload #47
    //   3580: bipush #9
    //   3582: aload #38
    //   3584: iload #51
    //   3586: bipush #16
    //   3588: iushr
    //   3589: sipush #255
    //   3592: iand
    //   3593: baload
    //   3594: iload #49
    //   3596: bipush #16
    //   3598: iushr
    //   3599: ixor
    //   3600: i2b
    //   3601: bastore
    //   3602: aload #47
    //   3604: bipush #10
    //   3606: aload #38
    //   3608: iload #50
    //   3610: bipush #8
    //   3612: iushr
    //   3613: sipush #255
    //   3616: iand
    //   3617: baload
    //   3618: iload #49
    //   3620: bipush #8
    //   3622: iushr
    //   3623: ixor
    //   3624: i2b
    //   3625: bastore
    //   3626: aload #47
    //   3628: bipush #11
    //   3630: aload #38
    //   3632: iload #53
    //   3634: sipush #255
    //   3637: iand
    //   3638: baload
    //   3639: iload #49
    //   3641: ixor
    //   3642: i2b
    //   3643: bastore
    //   3644: aload #31
    //   3646: iload #48
    //   3648: iconst_3
    //   3649: iadd
    //   3650: iaload
    //   3651: istore #49
    //   3653: aload #47
    //   3655: bipush #12
    //   3657: aload #38
    //   3659: iload #53
    //   3661: bipush #24
    //   3663: iushr
    //   3664: baload
    //   3665: iload #49
    //   3667: bipush #24
    //   3669: iushr
    //   3670: ixor
    //   3671: i2b
    //   3672: bastore
    //   3673: aload #47
    //   3675: bipush #13
    //   3677: aload #38
    //   3679: iload #52
    //   3681: bipush #16
    //   3683: iushr
    //   3684: sipush #255
    //   3687: iand
    //   3688: baload
    //   3689: iload #49
    //   3691: bipush #16
    //   3693: iushr
    //   3694: ixor
    //   3695: i2b
    //   3696: bastore
    //   3697: aload #47
    //   3699: bipush #14
    //   3701: aload #38
    //   3703: iload #51
    //   3705: bipush #8
    //   3707: iushr
    //   3708: sipush #255
    //   3711: iand
    //   3712: baload
    //   3713: iload #49
    //   3715: bipush #8
    //   3717: iushr
    //   3718: ixor
    //   3719: i2b
    //   3720: bastore
    //   3721: aload #47
    //   3723: bipush #15
    //   3725: aload #38
    //   3727: iload #50
    //   3729: sipush #255
    //   3732: iand
    //   3733: baload
    //   3734: iload #49
    //   3736: ixor
    //   3737: i2b
    //   3738: bastore
    //   3739: iconst_0
    //   3740: istore #54
    //   3742: iload #54
    //   3744: bipush #16
    //   3746: if_icmpge -> 3772
    //   3749: aload #44
    //   3751: iload #54
    //   3753: iload #45
    //   3755: bipush #16
    //   3757: imul
    //   3758: iadd
    //   3759: aload #47
    //   3761: iload #54
    //   3763: baload
    //   3764: bastore
    //   3765: iinc #54, 1
    //   3768: iload_2
    //   3769: ifeq -> 3742
    //   3772: iinc #45, 1
    //   3775: iload_2
    //   3776: ifeq -> 2857
    //   3779: aload #44
    //   3781: arraylength
    //   3782: ifle -> 3863
    //   3785: aload #44
    //   3787: aload #44
    //   3789: arraylength
    //   3790: iconst_1
    //   3791: isub
    //   3792: baload
    //   3793: istore #45
    //   3795: iload #45
    //   3797: bipush #16
    //   3799: if_icmple -> 3810
    //   3802: aload #44
    //   3804: astore #36
    //   3806: iload_2
    //   3807: ifeq -> 3863
    //   3810: aload #44
    //   3812: arraylength
    //   3813: iload #45
    //   3815: isub
    //   3816: newarray byte
    //   3818: astore #36
    //   3820: iconst_0
    //   3821: istore #46
    //   3823: iload #46
    //   3825: aload #36
    //   3827: arraylength
    //   3828: if_icmpge -> 3863
    //   3831: iload #46
    //   3833: aload #44
    //   3835: arraylength
    //   3836: if_icmpge -> 3863
    //   3839: aload #36
    //   3841: iload #46
    //   3843: aload #44
    //   3845: iload #46
    //   3847: baload
    //   3848: bastore
    //   3849: iinc #46, 1
    //   3852: iload_2
    //   3853: ifeq -> 3823
    //   3856: goto -> 3863
    //   3859: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3862: athrow
    //   3863: aload #36
    //   3865: astore #8
    //   3867: sipush #-9760
    //   3870: new java/math/BigInteger
    //   3873: dup
    //   3874: aload #8
    //   3876: invokespecial <init> : ([B)V
    //   3879: invokevirtual abs : ()Ljava/math/BigInteger;
    //   3882: putstatic burp/Zem6.Zm : Ljava/lang/Object;
    //   3885: sipush #28344
    //   3888: invokestatic a : (II)Ljava/lang/String;
    //   3891: iconst_1
    //   3892: ldc burp/Zg7w
    //   3894: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3897: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3900: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3903: astore #4
    //   3905: aload #4
    //   3907: arraylength
    //   3908: istore #5
    //   3910: iconst_0
    //   3911: istore #6
    //   3913: iload #6
    //   3915: iload #5
    //   3917: if_icmpge -> 4055
    //   3920: aload #4
    //   3922: iload #6
    //   3924: aaload
    //   3925: astore #7
    //   3927: aload #7
    //   3929: invokevirtual getModifiers : ()I
    //   3932: invokestatic isStatic : (I)Z
    //   3935: ifne -> 3945
    //   3938: goto -> 4048
    //   3941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3944: athrow
    //   3945: aload #7
    //   3947: invokevirtual getType : ()Ljava/lang/Class;
    //   3950: astore #8
    //   3952: aload #8
    //   3954: ifnull -> 4035
    //   3957: aload #8
    //   3959: invokevirtual isPrimitive : ()Z
    //   3962: ifne -> 4035
    //   3965: goto -> 3972
    //   3968: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3971: athrow
    //   3972: aload #8
    //   3974: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3977: ifnull -> 4035
    //   3980: goto -> 3987
    //   3983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3986: athrow
    //   3987: aload #8
    //   3989: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3992: invokevirtual getName : ()Ljava/lang/String;
    //   3995: ifnull -> 4035
    //   3998: goto -> 4005
    //   4001: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4004: athrow
    //   4005: aload #8
    //   4007: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4010: invokevirtual getName : ()Ljava/lang/String;
    //   4013: sipush #-9752
    //   4016: sipush #-3276
    //   4019: invokestatic a : (II)Ljava/lang/String;
    //   4022: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4025: ifne -> 4035
    //   4028: goto -> 4035
    //   4031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4034: athrow
    //   4035: aload #7
    //   4037: iconst_1
    //   4038: invokevirtual setAccessible : (Z)V
    //   4041: aload #7
    //   4043: aconst_null
    //   4044: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4047: pop
    //   4048: iinc #6, 1
    //   4051: iload_2
    //   4052: ifeq -> 3913
    //   4055: sipush #-9757
    //   4058: sipush #-29577
    //   4061: invokestatic a : (II)Ljava/lang/String;
    //   4064: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4067: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4070: astore #4
    //   4072: aload #4
    //   4074: arraylength
    //   4075: istore #5
    //   4077: iconst_0
    //   4078: istore #6
    //   4080: iload #6
    //   4082: iload #5
    //   4084: if_icmpge -> 4217
    //   4087: aload #4
    //   4089: iload #6
    //   4091: aaload
    //   4092: astore #7
    //   4094: aload #7
    //   4096: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4099: pop
    //   4100: aload #7
    //   4102: invokevirtual getModifiers : ()I
    //   4105: invokestatic isStatic : (I)Z
    //   4108: ifeq -> 4203
    //   4111: aload #7
    //   4113: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4116: arraylength
    //   4117: iconst_2
    //   4118: if_icmpne -> 4203
    //   4121: goto -> 4128
    //   4124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4127: athrow
    //   4128: aload #7
    //   4130: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4133: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   4136: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4139: ifeq -> 4203
    //   4142: goto -> 4149
    //   4145: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4148: athrow
    //   4149: aload #7
    //   4151: iconst_1
    //   4152: invokevirtual setAccessible : (Z)V
    //   4155: aload #7
    //   4157: aconst_null
    //   4158: iconst_2
    //   4159: anewarray java/lang/Object
    //   4162: dup
    //   4163: iconst_0
    //   4164: aload_0
    //   4165: aastore
    //   4166: dup
    //   4167: iconst_1
    //   4168: aload_1
    //   4169: ifnonnull -> 4187
    //   4172: goto -> 4179
    //   4175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4178: athrow
    //   4179: aload_1
    //   4180: goto -> 4194
    //   4183: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4186: athrow
    //   4187: aload_1
    //   4188: checkcast [B
    //   4191: invokevirtual clone : ()Ljava/lang/Object;
    //   4194: aastore
    //   4195: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4198: pop
    //   4199: iload_2
    //   4200: ifeq -> 4217
    //   4203: iinc #6, 1
    //   4206: iload_2
    //   4207: ifeq -> 4080
    //   4210: goto -> 4217
    //   4213: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4216: athrow
    //   4217: getstatic burp/Zlbr.Zr : Ljava/lang/String;
    //   4220: getstatic burp/Zlxh.ZU : Ljava/lang/Object;
    //   4223: checkcast java/math/BigInteger
    //   4226: invokevirtual intValue : ()I
    //   4229: bipush #32
    //   4231: irem
    //   4232: invokestatic abs : (I)I
    //   4235: invokevirtual charAt : (I)C
    //   4238: getstatic burp/Zgde.Zr : Ljava/lang/String;
    //   4241: getstatic burp/Zg27.ZQ : Ljava/lang/Object;
    //   4244: checkcast java/math/BigInteger
    //   4247: invokevirtual intValue : ()I
    //   4250: bipush #32
    //   4252: irem
    //   4253: invokestatic abs : (I)I
    //   4256: invokevirtual charAt : (I)C
    //   4259: if_icmple -> 4366
    //   4262: getstatic burp/Ze7y.Zm : Ljava/lang/String;
    //   4265: getstatic burp/Zs9x.Zo : Ljava/lang/Object;
    //   4268: checkcast java/math/BigInteger
    //   4271: invokevirtual intValue : ()I
    //   4274: bipush #32
    //   4276: irem
    //   4277: invokestatic abs : (I)I
    //   4280: invokevirtual charAt : (I)C
    //   4283: getstatic burp/Zz16.ZA : Ljava/lang/String;
    //   4286: getstatic burp/Zrcu.Zs : Ljava/lang/Object;
    //   4289: checkcast java/math/BigInteger
    //   4292: invokevirtual intValue : ()I
    //   4295: bipush #32
    //   4297: irem
    //   4298: invokestatic abs : (I)I
    //   4301: invokevirtual charAt : (I)C
    //   4304: if_icmple -> 4366
    //   4307: goto -> 4314
    //   4310: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4313: athrow
    //   4314: getstatic burp/Zszz.Zg : Ljava/lang/String;
    //   4317: getstatic burp/Zl1q.Zh : Ljava/lang/Object;
    //   4320: checkcast java/math/BigInteger
    //   4323: invokevirtual intValue : ()I
    //   4326: bipush #32
    //   4328: irem
    //   4329: invokestatic abs : (I)I
    //   4332: invokevirtual charAt : (I)C
    //   4335: getstatic burp/Zm1l.Zp : Ljava/lang/String;
    //   4338: getstatic burp/Zty2.Zl : Ljava/lang/Object;
    //   4341: checkcast java/math/BigInteger
    //   4344: invokevirtual intValue : ()I
    //   4347: bipush #32
    //   4349: irem
    //   4350: invokestatic abs : (I)I
    //   4353: invokevirtual charAt : (I)C
    //   4356: if_icmpgt -> 4374
    //   4359: goto -> 4366
    //   4362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4365: athrow
    //   4366: iconst_1
    //   4367: goto -> 4375
    //   4370: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4373: athrow
    //   4374: iconst_0
    //   4375: ireturn
    //   4376: astore_3
    //   4377: new java/lang/Exception
    //   4380: dup
    //   4381: aload_3
    //   4382: invokevirtual getMessage : ()Ljava/lang/String;
    //   4385: invokespecial <init> : (Ljava/lang/String;)V
    //   4388: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4375	4376	java/lang/Throwable
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
    //   1510	1525	1525	java/lang/Throwable
    //   2527	2553	2553	java/lang/Throwable
    //   2634	2649	2649	java/lang/Throwable
    //   3831	3856	3859	java/lang/Throwable
    //   3927	3941	3941	java/lang/Throwable
    //   3952	3965	3968	java/lang/Throwable
    //   3957	3980	3983	java/lang/Throwable
    //   3972	3998	4001	java/lang/Throwable
    //   3987	4028	4031	java/lang/Throwable
    //   4094	4121	4124	java/lang/Throwable
    //   4111	4142	4145	java/lang/Throwable
    //   4128	4172	4175	java/lang/Throwable
    //   4149	4183	4183	java/lang/Throwable
    //   4194	4210	4213	java/lang/Throwable
    //   4217	4307	4310	java/lang/Throwable
    //   4262	4359	4362	java/lang/Throwable
    //   4314	4370	4370	java/lang/Throwable
  }
  
  static void Zc(Object paramObject) {
    Zxjm.ZG = a(-9751, 29796);
    Zxjm.Zn = new BigInteger(a(-9750, -28531));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zmsl.ZP.charAt(Math.abs(((BigInteger)Zs9x.Zo).intValue() % 32)) <= Zty4.Zu.charAt(Math.abs(((BigInteger)Ztzw.Zk).intValue() % 32))) {
          try {
            Zg27.Zi(Class.forName(a(-9748, 31976)));
            if (bool)
              Zbp.ZI(Class.forName(a(-9749, 8238))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zbp.ZI(Class.forName(a(-9749, 8238)));
    } catch (Throwable throwable) {}
  }
  
  static void Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '_IY[ª¹Î¶Û,ü]g´xÞºpS±ÊªËè´%A\\tÀé êöÏÆÖÎM5ÌÆî¶áÓÊâ_Ðãñ(&ÂÀ>\\tpéLúv½\©¦ÕX¦ÌÉ(~MÍ­í²ï°îIR¬/OâÿÕåÛïùLBÊ¢Xët%挏矢濱い柞ﻡꮬ쨕줴突䝄궺ꉖ鳲狖럷鍘㙣㒎熞ㆍҫ⌥ᡪԚݔ胮뉪ওⰺ᭰嫱刐홝⧁⼊叀'⁀녩櫄빘䪆塬큥ꨏ䍵㎄䗏Ⱥ債鿠凡䂨鈒㣢밺?၇쵢጑弪䒤쐱练摧ᤗ惿佟⊄邒䚎뢐?଻㨭䥗␭슰겖酎㞲赃买泗敠껜뫷┣ᱠ듏璄䯃譐烓뗸䠆懪坭蚹ᴢ颞極踈鮲蝘칁⡏賰覤뼑䊰䄷ⷣ끗묂\\t§ÌUk8cnê ®#£cO5cÔ'#fÇú¤\\nÄ}r«À¼×þSn%v¢挊瞈澼ぐ杷﹣ꮙ쩅즒著䞐귻ꋌ鳚犅럲録㛃㒚焜ㆸӻ⎃ᡠ׎ܕ聴눹খⱐᯐ媼刄훴⥃⼿厐⁊놽檅뻂䪮堿큠ꩥ䏕㏉䗛ʓ倷鿕冱䀎鈘㠶뱻?ၯ쵧፻徊䓩쐥繪擥ᤢ悯俹⊎遆䛏렊?୨㩇䧷①스갿里㜔赉交沖效꺏뫲╉᳀뒂琭䭁譥炃땞䠌憫執蚑ᵱ飴槕蹅鮦蟱컃⡺負褂뼛䉤䅶⵹끿뭑rhDqåÒÏKQÿÄ0qÌ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #122
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
    //   68: ldc '[×\\n< \\tJHõZÈ]1'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #126
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
    //   129: putstatic burp/Ztvp.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztvp.b : [Ljava/lang/String;
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
    //   212: bipush #50
    //   214: goto -> 244
    //   217: bipush #58
    //   219: goto -> 244
    //   222: bipush #23
    //   224: goto -> 244
    //   227: bipush #14
    //   229: goto -> 244
    //   232: bipush #55
    //   234: goto -> 244
    //   237: bipush #66
    //   239: goto -> 244
    //   242: bipush #76
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
    //   300: sipush #-9745
    //   303: sipush #-8831
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Ztvp.ZZ : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #17
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #98
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: iconst_0
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #20
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #46
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #126
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-111
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #51
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: iconst_5
    //   366: bastore
    //   367: dup
    //   368: bipush #9
    //   370: bipush #-125
    //   372: bastore
    //   373: dup
    //   374: bipush #10
    //   376: bipush #-118
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: bipush #-69
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #45
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #-103
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #-77
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: bipush #-123
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #-91
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #-128
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #32
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #54
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #54
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #49
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #76
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #103
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #-40
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #107
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #-66
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #-102
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #58
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #105
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #-103
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #-126
    //   504: bastore
    //   505: invokespecial <init> : (I[B)V
    //   508: putstatic burp/Ztvp.Zy : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD9E9) & 0xFFFF;
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
      char c = 'Á';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztvp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */