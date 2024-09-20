package burp;

import java.math.BigInteger;

class Zx_s extends ClassLoader {
  static String Za;
  
  static Object ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zb20.ZL : Ljava/lang/String;
    //   172: getstatic burp/Zx_s.ZX : Ljava/lang/Object;
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
    //   206: getstatic burp/Ztkc.ZU : Ljava/lang/String;
    //   209: getstatic burp/Zzok.ZY : Ljava/lang/Object;
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
    //   243: getstatic burp/Zejj.ZQ : Ljava/lang/String;
    //   246: getstatic burp/Zzou.Zz : Ljava/lang/Object;
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
    //   280: getstatic burp/Zmlu.ZF : Ljava/lang/String;
    //   283: getstatic burp/Zb14.ZT : Ljava/lang/Object;
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
    //   317: getstatic burp/Zl8y.ZY : Ljava/lang/String;
    //   320: getstatic burp/Zxpb.Zo : Ljava/lang/Object;
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
    //   354: getstatic burp/Zlsw.ZE : Ljava/lang/String;
    //   357: getstatic burp/Zr5k.Zj : Ljava/lang/Object;
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
    //   391: getstatic burp/Zgt6.Zu : Ljava/lang/String;
    //   394: getstatic burp/Zkco.Zg : Ljava/lang/Object;
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
    //   428: getstatic burp/Zx_s.Za : Ljava/lang/String;
    //   431: getstatic burp/Zgw_.Zf : Ljava/lang/Object;
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
    //   465: getstatic burp/Zbp_.ZQ : Ljava/lang/String;
    //   468: getstatic burp/Zmtf.ZH : Ljava/lang/Object;
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
    //   502: getstatic burp/Ztkc.ZU : Ljava/lang/String;
    //   505: getstatic burp/Zb2k.ZZ : Ljava/lang/Object;
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
    //   539: getstatic burp/Zm5p.ZX : Ljava/lang/String;
    //   542: getstatic burp/Zrs0.Zz : Ljava/lang/Object;
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
    //   576: getstatic burp/Zmt7.Zl : Ljava/lang/String;
    //   579: getstatic burp/Zx_s.ZX : Ljava/lang/Object;
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
    //   613: getstatic burp/Zb20.ZL : Ljava/lang/String;
    //   616: getstatic burp/Zb9h.Zm : Ljava/lang/Object;
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
    //   650: getstatic burp/Zb0z.ZM : Ljava/lang/String;
    //   653: getstatic burp/Zzxs.Zg : Ljava/lang/Object;
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
    //   687: getstatic burp/Zdk.Ze : Ljava/lang/String;
    //   690: getstatic burp/Zgw_.Zf : Ljava/lang/Object;
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
    //   724: getstatic burp/Zro5.ZY : Ljava/lang/String;
    //   727: getstatic burp/Zx_s.ZX : Ljava/lang/Object;
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
    //   761: getstatic burp/Zgta.ZL : Ljava/lang/String;
    //   764: getstatic burp/Zb20.Zq : Ljava/lang/Object;
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
    //   798: getstatic burp/Zbzc.ZL : Ljava/lang/String;
    //   801: getstatic burp/Zr5k.Zj : Ljava/lang/Object;
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
    //   835: getstatic burp/Zmt7.Zl : Ljava/lang/String;
    //   838: getstatic burp/Zzxs.Zg : Ljava/lang/Object;
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
    //   872: getstatic burp/Zlps.ZO : Ljava/lang/String;
    //   875: getstatic burp/Zdk.Zy : Ljava/lang/Object;
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
    //   909: getstatic burp/Zro5.ZY : Ljava/lang/String;
    //   912: getstatic burp/Zz3w.ZX : Ljava/lang/Object;
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
    //   946: getstatic burp/Zecw.Zb : Ljava/lang/String;
    //   949: getstatic burp/Zzok.ZY : Ljava/lang/Object;
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
    //   983: getstatic burp/Zb2k.Zu : Ljava/lang/String;
    //   986: getstatic burp/Zbzc.Zp : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zrml.Zt : Ljava/lang/String;
    //   1023: getstatic burp/Ztkc.ZV : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zmji.Zs : Ljava/lang/String;
    //   1060: getstatic burp/Zrs0.Zz : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zb14.Ze : Ljava/lang/String;
    //   1097: getstatic burp/Zztz.Zq : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zlnq.ZQ : Ljava/lang/String;
    //   1134: getstatic burp/Zx8t.ZA : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zejj.ZQ : Ljava/lang/String;
    //   1171: getstatic burp/Zlps.ZU : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zztz.Zp : Ljava/lang/String;
    //   1208: getstatic burp/Zeqo.ZZ : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zgwu.Zd : Ljava/lang/String;
    //   1245: getstatic burp/Zme.Zd : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zgw_.ZH : Ljava/lang/String;
    //   1282: getstatic burp/Zzs9.ZO : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zzok.ZC : Ljava/lang/String;
    //   1319: getstatic burp/Zlsw.ZJ : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zzxv.Z_ : Ljava/lang/String;
    //   1362: new java/io/ByteArrayOutputStream
    //   1365: dup
    //   1366: invokespecial <init> : ()V
    //   1369: astore #4
    //   1371: getstatic burp/Zx_x.Zv : Ljava/lang/String;
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
    //   1414: ifne -> 1379
    //   1417: aload #4
    //   1419: invokevirtual toByteArray : ()[B
    //   1422: astore #6
    //   1424: getstatic burp/Zlb6.Zz : Ljava/lang/Object;
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
    //   1492: sipush #24680
    //   1495: sipush #-23368
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
    //   1720: ifne -> 1484
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
    //   1780: ifne -> 1738
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
    //   1891: ifne -> 1822
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
    //   2029: ifne -> 1901
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
    //   2467: ifne -> 2102
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
    //   2540: sipush #24686
    //   2543: sipush #17303
    //   2546: invokestatic a : (II)Ljava/lang/String;
    //   2549: invokespecial <init> : (Ljava/lang/String;)V
    //   2552: athrow
    //   2553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2556: athrow
    //   2557: bipush #10
    //   2559: istore #37
    //   2561: sipush #24676
    //   2564: sipush #256
    //   2567: newarray byte
    //   2569: astore #38
    //   2571: sipush #-2989
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
    //   2844: ifne -> 2615
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
    //   2910: ifne -> 2883
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
    //   3361: ifne -> 3117
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
    //   3769: ifne -> 3742
    //   3772: iinc #45, 1
    //   3775: iload_2
    //   3776: ifne -> 2857
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
    //   3807: ifne -> 3863
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
    //   3853: ifne -> 3823
    //   3856: goto -> 3863
    //   3859: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3862: athrow
    //   3863: aload #36
    //   3865: astore #8
    //   3867: new java/math/BigInteger
    //   3870: dup
    //   3871: aload #8
    //   3873: invokespecial <init> : ([B)V
    //   3876: invokevirtual abs : ()Ljava/math/BigInteger;
    //   3879: putstatic burp/Zmpp.Z_ : Ljava/lang/Object;
    //   3882: getstatic burp/Zx8t.ZA : Ljava/lang/Object;
    //   3885: checkcast java/math/BigInteger
    //   3888: invokevirtual toByteArray : ()[B
    //   3891: astore #4
    //   3893: aload #4
    //   3895: arraylength
    //   3896: iconst_2
    //   3897: iadd
    //   3898: newarray byte
    //   3900: astore #6
    //   3902: iconst_0
    //   3903: istore #7
    //   3905: iload #7
    //   3907: aload #4
    //   3909: arraylength
    //   3910: if_icmpge -> 3930
    //   3913: aload #6
    //   3915: iload #7
    //   3917: aload #4
    //   3919: iload #7
    //   3921: baload
    //   3922: bastore
    //   3923: iinc #7, 1
    //   3926: iload_2
    //   3927: ifne -> 3905
    //   3930: aload #6
    //   3932: arraylength
    //   3933: iconst_3
    //   3934: idiv
    //   3935: iconst_4
    //   3936: imul
    //   3937: newarray byte
    //   3939: astore #5
    //   3941: iconst_0
    //   3942: istore #7
    //   3944: iconst_0
    //   3945: istore #8
    //   3947: iload #7
    //   3949: aload #4
    //   3951: arraylength
    //   3952: if_icmpge -> 4063
    //   3955: aload #5
    //   3957: iload #8
    //   3959: aload #6
    //   3961: iload #7
    //   3963: baload
    //   3964: iconst_2
    //   3965: iushr
    //   3966: bipush #63
    //   3968: iand
    //   3969: i2b
    //   3970: bastore
    //   3971: aload #5
    //   3973: iload #8
    //   3975: iconst_1
    //   3976: iadd
    //   3977: aload #6
    //   3979: iload #7
    //   3981: iconst_1
    //   3982: iadd
    //   3983: baload
    //   3984: iconst_4
    //   3985: iushr
    //   3986: bipush #15
    //   3988: iand
    //   3989: aload #6
    //   3991: iload #7
    //   3993: baload
    //   3994: iconst_4
    //   3995: ishl
    //   3996: bipush #63
    //   3998: iand
    //   3999: ior
    //   4000: i2b
    //   4001: bastore
    //   4002: aload #5
    //   4004: iload #8
    //   4006: iconst_2
    //   4007: iadd
    //   4008: aload #6
    //   4010: iload #7
    //   4012: iconst_2
    //   4013: iadd
    //   4014: baload
    //   4015: bipush #6
    //   4017: iushr
    //   4018: iconst_3
    //   4019: iand
    //   4020: aload #6
    //   4022: iload #7
    //   4024: iconst_1
    //   4025: iadd
    //   4026: baload
    //   4027: iconst_2
    //   4028: ishl
    //   4029: bipush #63
    //   4031: iand
    //   4032: ior
    //   4033: i2b
    //   4034: bastore
    //   4035: aload #5
    //   4037: iload #8
    //   4039: iconst_3
    //   4040: iadd
    //   4041: aload #6
    //   4043: iload #7
    //   4045: iconst_2
    //   4046: iadd
    //   4047: baload
    //   4048: bipush #63
    //   4050: iand
    //   4051: i2b
    //   4052: bastore
    //   4053: iinc #7, 3
    //   4056: iinc #8, 4
    //   4059: iload_2
    //   4060: ifne -> 3947
    //   4063: iconst_0
    //   4064: istore #7
    //   4066: iload #7
    //   4068: aload #5
    //   4070: arraylength
    //   4071: if_icmpge -> 4255
    //   4074: aload #5
    //   4076: iload #7
    //   4078: baload
    //   4079: bipush #26
    //   4081: if_icmpge -> 4109
    //   4084: aload #5
    //   4086: iload #7
    //   4088: aload #5
    //   4090: iload #7
    //   4092: baload
    //   4093: bipush #65
    //   4095: iadd
    //   4096: i2b
    //   4097: bastore
    //   4098: iload_2
    //   4099: ifne -> 4248
    //   4102: goto -> 4109
    //   4105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4108: athrow
    //   4109: aload #5
    //   4111: iload #7
    //   4113: baload
    //   4114: bipush #52
    //   4116: if_icmpge -> 4154
    //   4119: goto -> 4126
    //   4122: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4125: athrow
    //   4126: aload #5
    //   4128: iload #7
    //   4130: aload #5
    //   4132: iload #7
    //   4134: baload
    //   4135: bipush #97
    //   4137: iadd
    //   4138: bipush #26
    //   4140: isub
    //   4141: i2b
    //   4142: bastore
    //   4143: iload_2
    //   4144: ifne -> 4248
    //   4147: goto -> 4154
    //   4150: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4153: athrow
    //   4154: aload #5
    //   4156: iload #7
    //   4158: baload
    //   4159: bipush #62
    //   4161: if_icmpge -> 4199
    //   4164: goto -> 4171
    //   4167: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4170: athrow
    //   4171: aload #5
    //   4173: iload #7
    //   4175: aload #5
    //   4177: iload #7
    //   4179: baload
    //   4180: bipush #48
    //   4182: iadd
    //   4183: bipush #52
    //   4185: isub
    //   4186: i2b
    //   4187: bastore
    //   4188: iload_2
    //   4189: ifne -> 4248
    //   4192: goto -> 4199
    //   4195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4198: athrow
    //   4199: aload #5
    //   4201: iload #7
    //   4203: baload
    //   4204: bipush #63
    //   4206: if_icmpge -> 4234
    //   4209: goto -> 4216
    //   4212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4215: athrow
    //   4216: aload #5
    //   4218: iload #7
    //   4220: bipush #43
    //   4222: bastore
    //   4223: iload_2
    //   4224: ifne -> 4248
    //   4227: goto -> 4234
    //   4230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4233: athrow
    //   4234: aload #5
    //   4236: iload #7
    //   4238: bipush #47
    //   4240: bastore
    //   4241: goto -> 4248
    //   4244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4247: athrow
    //   4248: iinc #7, 1
    //   4251: iload_2
    //   4252: ifne -> 4066
    //   4255: aload #5
    //   4257: arraylength
    //   4258: iconst_1
    //   4259: isub
    //   4260: istore #7
    //   4262: iload #7
    //   4264: aload #4
    //   4266: arraylength
    //   4267: iconst_4
    //   4268: imul
    //   4269: iconst_3
    //   4270: idiv
    //   4271: if_icmple -> 4288
    //   4274: aload #5
    //   4276: iload #7
    //   4278: bipush #61
    //   4280: bastore
    //   4281: iinc #7, -1
    //   4284: iload_2
    //   4285: ifne -> 4262
    //   4288: new java/math/BigInteger
    //   4291: dup
    //   4292: aload #5
    //   4294: invokespecial <init> : ([B)V
    //   4297: invokevirtual abs : ()Ljava/math/BigInteger;
    //   4300: putstatic burp/Zr04.ZB : Ljava/lang/Object;
    //   4303: sipush #24685
    //   4306: sipush #6533
    //   4309: invokestatic a : (II)Ljava/lang/String;
    //   4312: iconst_1
    //   4313: ldc burp/Zbzk
    //   4315: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4318: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4321: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4324: astore #4
    //   4326: aload #4
    //   4328: arraylength
    //   4329: istore #5
    //   4331: iconst_0
    //   4332: istore #6
    //   4334: iload #6
    //   4336: iload #5
    //   4338: if_icmpge -> 4476
    //   4341: aload #4
    //   4343: iload #6
    //   4345: aaload
    //   4346: astore #7
    //   4348: aload #7
    //   4350: invokevirtual getModifiers : ()I
    //   4353: invokestatic isStatic : (I)Z
    //   4356: ifne -> 4366
    //   4359: goto -> 4469
    //   4362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4365: athrow
    //   4366: aload #7
    //   4368: invokevirtual getType : ()Ljava/lang/Class;
    //   4371: astore #8
    //   4373: aload #8
    //   4375: ifnull -> 4456
    //   4378: aload #8
    //   4380: invokevirtual isPrimitive : ()Z
    //   4383: ifne -> 4456
    //   4386: goto -> 4393
    //   4389: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4392: athrow
    //   4393: aload #8
    //   4395: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4398: ifnull -> 4456
    //   4401: goto -> 4408
    //   4404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4407: athrow
    //   4408: aload #8
    //   4410: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4413: invokevirtual getName : ()Ljava/lang/String;
    //   4416: ifnull -> 4456
    //   4419: goto -> 4426
    //   4422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4425: athrow
    //   4426: aload #8
    //   4428: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4431: invokevirtual getName : ()Ljava/lang/String;
    //   4434: sipush #24682
    //   4437: sipush #30057
    //   4440: invokestatic a : (II)Ljava/lang/String;
    //   4443: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4446: ifne -> 4456
    //   4449: goto -> 4456
    //   4452: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4455: athrow
    //   4456: aload #7
    //   4458: iconst_1
    //   4459: invokevirtual setAccessible : (Z)V
    //   4462: aload #7
    //   4464: aconst_null
    //   4465: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4468: pop
    //   4469: iinc #6, 1
    //   4472: iload_2
    //   4473: ifne -> 4334
    //   4476: sipush #24679
    //   4479: sipush #23085
    //   4482: invokestatic a : (II)Ljava/lang/String;
    //   4485: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4488: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4491: astore #4
    //   4493: aload #4
    //   4495: arraylength
    //   4496: istore #5
    //   4498: iconst_0
    //   4499: istore #6
    //   4501: iload #6
    //   4503: iload #5
    //   4505: if_icmpge -> 4638
    //   4508: aload #4
    //   4510: iload #6
    //   4512: aaload
    //   4513: astore #7
    //   4515: aload #7
    //   4517: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4520: pop
    //   4521: aload #7
    //   4523: invokevirtual getModifiers : ()I
    //   4526: invokestatic isStatic : (I)Z
    //   4529: ifeq -> 4624
    //   4532: aload #7
    //   4534: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4537: arraylength
    //   4538: iconst_2
    //   4539: if_icmpne -> 4624
    //   4542: goto -> 4549
    //   4545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4548: athrow
    //   4549: aload #7
    //   4551: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4554: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   4557: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4560: ifeq -> 4624
    //   4563: goto -> 4570
    //   4566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4569: athrow
    //   4570: aload #7
    //   4572: iconst_1
    //   4573: invokevirtual setAccessible : (Z)V
    //   4576: aload #7
    //   4578: aconst_null
    //   4579: iconst_2
    //   4580: anewarray java/lang/Object
    //   4583: dup
    //   4584: iconst_0
    //   4585: aload_0
    //   4586: aastore
    //   4587: dup
    //   4588: iconst_1
    //   4589: aload_1
    //   4590: ifnonnull -> 4608
    //   4593: goto -> 4600
    //   4596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4599: athrow
    //   4600: aload_1
    //   4601: goto -> 4615
    //   4604: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4607: athrow
    //   4608: aload_1
    //   4609: checkcast [B
    //   4612: invokevirtual clone : ()Ljava/lang/Object;
    //   4615: aastore
    //   4616: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4619: pop
    //   4620: iload_2
    //   4621: ifne -> 4638
    //   4624: iinc #6, 1
    //   4627: iload_2
    //   4628: ifne -> 4501
    //   4631: goto -> 4638
    //   4634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4637: athrow
    //   4638: getstatic burp/Zry0.Zr : Ljava/lang/Object;
    //   4641: checkcast java/math/BigInteger
    //   4644: invokevirtual intValue : ()I
    //   4647: i2l
    //   4648: invokestatic currentTimeMillis : ()J
    //   4651: ladd
    //   4652: getstatic burp/Zmt7.Z_ : Ljava/lang/Object;
    //   4655: checkcast java/math/BigInteger
    //   4658: invokevirtual intValue : ()I
    //   4661: i2l
    //   4662: lcmp
    //   4663: ifge -> 5001
    //   4666: sipush #24672
    //   4669: sipush #21312
    //   4672: invokestatic a : (II)Ljava/lang/String;
    //   4675: iconst_1
    //   4676: ldc burp/Zry7
    //   4678: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4681: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4684: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4687: astore #4
    //   4689: aload #4
    //   4691: arraylength
    //   4692: istore #5
    //   4694: iconst_0
    //   4695: istore #6
    //   4697: iload #6
    //   4699: iload #5
    //   4701: if_icmpge -> 4839
    //   4704: aload #4
    //   4706: iload #6
    //   4708: aaload
    //   4709: astore #7
    //   4711: aload #7
    //   4713: invokevirtual getModifiers : ()I
    //   4716: invokestatic isStatic : (I)Z
    //   4719: ifne -> 4729
    //   4722: goto -> 4832
    //   4725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4728: athrow
    //   4729: aload #7
    //   4731: invokevirtual getType : ()Ljava/lang/Class;
    //   4734: astore #8
    //   4736: aload #8
    //   4738: ifnull -> 4819
    //   4741: aload #8
    //   4743: invokevirtual isPrimitive : ()Z
    //   4746: ifne -> 4819
    //   4749: goto -> 4756
    //   4752: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4755: athrow
    //   4756: aload #8
    //   4758: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4761: ifnull -> 4819
    //   4764: goto -> 4771
    //   4767: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4770: athrow
    //   4771: aload #8
    //   4773: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4776: invokevirtual getName : ()Ljava/lang/String;
    //   4779: ifnull -> 4819
    //   4782: goto -> 4789
    //   4785: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4788: athrow
    //   4789: aload #8
    //   4791: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4794: invokevirtual getName : ()Ljava/lang/String;
    //   4797: sipush #24683
    //   4800: sipush #-17120
    //   4803: invokestatic a : (II)Ljava/lang/String;
    //   4806: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4809: ifne -> 4819
    //   4812: goto -> 4819
    //   4815: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4818: athrow
    //   4819: aload #7
    //   4821: iconst_1
    //   4822: invokevirtual setAccessible : (Z)V
    //   4825: aload #7
    //   4827: aconst_null
    //   4828: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4831: pop
    //   4832: iinc #6, 1
    //   4835: iload_2
    //   4836: ifne -> 4697
    //   4839: sipush #24684
    //   4842: sipush #-27617
    //   4845: invokestatic a : (II)Ljava/lang/String;
    //   4848: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4851: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4854: astore #4
    //   4856: aload #4
    //   4858: arraylength
    //   4859: istore #5
    //   4861: iconst_0
    //   4862: istore #6
    //   4864: iload #6
    //   4866: iload #5
    //   4868: if_icmpge -> 5001
    //   4871: aload #4
    //   4873: iload #6
    //   4875: aaload
    //   4876: astore #7
    //   4878: aload #7
    //   4880: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4883: pop
    //   4884: aload #7
    //   4886: invokevirtual getModifiers : ()I
    //   4889: invokestatic isStatic : (I)Z
    //   4892: ifeq -> 4987
    //   4895: aload #7
    //   4897: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4900: arraylength
    //   4901: iconst_2
    //   4902: if_icmpne -> 4987
    //   4905: goto -> 4912
    //   4908: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4911: athrow
    //   4912: aload #7
    //   4914: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4917: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   4920: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4923: ifeq -> 4987
    //   4926: goto -> 4933
    //   4929: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4932: athrow
    //   4933: aload #7
    //   4935: iconst_1
    //   4936: invokevirtual setAccessible : (Z)V
    //   4939: aload #7
    //   4941: aconst_null
    //   4942: iconst_2
    //   4943: anewarray java/lang/Object
    //   4946: dup
    //   4947: iconst_0
    //   4948: aload_0
    //   4949: aastore
    //   4950: dup
    //   4951: iconst_1
    //   4952: aload_1
    //   4953: ifnonnull -> 4971
    //   4956: goto -> 4963
    //   4959: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4962: athrow
    //   4963: aload_1
    //   4964: goto -> 4978
    //   4967: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4970: athrow
    //   4971: aload_1
    //   4972: checkcast [B
    //   4975: invokevirtual clone : ()Ljava/lang/Object;
    //   4978: aastore
    //   4979: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4982: pop
    //   4983: iload_2
    //   4984: ifne -> 5001
    //   4987: iinc #6, 1
    //   4990: iload_2
    //   4991: ifne -> 4864
    //   4994: goto -> 5001
    //   4997: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5000: athrow
    //   5001: getstatic burp/Zx_s.Za : Ljava/lang/String;
    //   5004: getstatic burp/Zgkn.Zm : Ljava/lang/Object;
    //   5007: checkcast java/math/BigInteger
    //   5010: invokevirtual intValue : ()I
    //   5013: bipush #32
    //   5015: irem
    //   5016: invokestatic abs : (I)I
    //   5019: invokevirtual charAt : (I)C
    //   5022: getstatic burp/Zm5p.ZX : Ljava/lang/String;
    //   5025: getstatic burp/Zrd4.Ze : Ljava/lang/Object;
    //   5028: checkcast java/math/BigInteger
    //   5031: invokevirtual intValue : ()I
    //   5034: bipush #32
    //   5036: irem
    //   5037: invokestatic abs : (I)I
    //   5040: invokevirtual charAt : (I)C
    //   5043: if_icmple -> 5158
    //   5046: getstatic burp/Zry0.Zz : Ljava/lang/String;
    //   5049: getstatic burp/Zro5.ZT : Ljava/lang/Object;
    //   5052: checkcast java/math/BigInteger
    //   5055: invokevirtual intValue : ()I
    //   5058: bipush #32
    //   5060: irem
    //   5061: invokestatic abs : (I)I
    //   5064: invokevirtual charAt : (I)C
    //   5067: getstatic burp/Zmlu.ZF : Ljava/lang/String;
    //   5070: getstatic burp/Ztkc.ZV : Ljava/lang/Object;
    //   5073: checkcast java/math/BigInteger
    //   5076: invokevirtual intValue : ()I
    //   5079: bipush #32
    //   5081: irem
    //   5082: invokestatic abs : (I)I
    //   5085: invokevirtual charAt : (I)C
    //   5088: if_icmple -> 5158
    //   5091: goto -> 5098
    //   5094: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5097: athrow
    //   5098: getstatic burp/Zldt.Zj : Ljava/lang/String;
    //   5101: getstatic burp/Zz3w.ZX : Ljava/lang/Object;
    //   5104: checkcast java/math/BigInteger
    //   5107: invokevirtual intValue : ()I
    //   5110: bipush #32
    //   5112: irem
    //   5113: invokestatic abs : (I)I
    //   5116: invokevirtual charAt : (I)C
    //   5119: getstatic burp/Zx_s.Za : Ljava/lang/String;
    //   5122: getstatic burp/Zzxv.ZZ : Ljava/lang/Object;
    //   5125: checkcast java/math/BigInteger
    //   5128: invokevirtual intValue : ()I
    //   5131: bipush #32
    //   5133: irem
    //   5134: invokestatic abs : (I)I
    //   5137: invokevirtual charAt : (I)C
    //   5140: if_icmple -> 5158
    //   5143: goto -> 5150
    //   5146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5149: athrow
    //   5150: iconst_1
    //   5151: goto -> 5159
    //   5154: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5157: athrow
    //   5158: iconst_0
    //   5159: ireturn
    //   5160: astore_3
    //   5161: new java/lang/Exception
    //   5164: dup
    //   5165: aload_3
    //   5166: invokevirtual getMessage : ()Ljava/lang/String;
    //   5169: invokespecial <init> : (Ljava/lang/String;)V
    //   5172: athrow
    // Exception table:
    //   from	to	target	type
    //   4	5159	5160	java/lang/Throwable
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
    //   4074	4102	4105	java/lang/Throwable
    //   4084	4119	4122	java/lang/Throwable
    //   4109	4147	4150	java/lang/Throwable
    //   4126	4164	4167	java/lang/Throwable
    //   4154	4192	4195	java/lang/Throwable
    //   4171	4209	4212	java/lang/Throwable
    //   4199	4227	4230	java/lang/Throwable
    //   4216	4241	4244	java/lang/Throwable
    //   4348	4362	4362	java/lang/Throwable
    //   4373	4386	4389	java/lang/Throwable
    //   4378	4401	4404	java/lang/Throwable
    //   4393	4419	4422	java/lang/Throwable
    //   4408	4449	4452	java/lang/Throwable
    //   4515	4542	4545	java/lang/Throwable
    //   4532	4563	4566	java/lang/Throwable
    //   4549	4593	4596	java/lang/Throwable
    //   4570	4604	4604	java/lang/Throwable
    //   4615	4631	4634	java/lang/Throwable
    //   4711	4725	4725	java/lang/Throwable
    //   4736	4749	4752	java/lang/Throwable
    //   4741	4764	4767	java/lang/Throwable
    //   4756	4782	4785	java/lang/Throwable
    //   4771	4812	4815	java/lang/Throwable
    //   4878	4905	4908	java/lang/Throwable
    //   4895	4926	4929	java/lang/Throwable
    //   4912	4956	4959	java/lang/Throwable
    //   4933	4967	4967	java/lang/Throwable
    //   4978	4994	4997	java/lang/Throwable
    //   5001	5091	5094	java/lang/Throwable
    //   5046	5143	5146	java/lang/Throwable
    //   5098	5154	5154	java/lang/Throwable
  }
  
  static void Zc(Object paramObject) {
    Za = a(24681, -19932);
    ZX = new BigInteger(a(24674, 5254));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zrs0.Zt.charAt(Math.abs(((BigInteger)Ztdx.ZX).intValue() % 32)) > Za.charAt(Math.abs(((BigInteger)Zeor.Zb).intValue() % 32))) {
          try {
            Zgw_.ZS(Class.forName(a(24677, -30637)));
            if (bool)
              Zegw.ZT(Class.forName(a(24675, 4671))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zegw.ZT(Class.forName(a(24675, 4671)));
    } catch (Throwable throwable) {}
  }
  
  static void ZD(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ô®þ=V7n!IÎXæ¹\\bÐ3}T[u¦ÂòàÃWuÊ揍瞌澣ぴ杗ﻰꮳ쨅쥋靖䜃귊ꊩ鳒爛띯鍾㛘㓮熠㇈ӳ⌥ᢢԍݣ耾닯ॴⱉᮛ媱剟훉⦷⼰反w⃏녑檩뻀䪃墼탒꨻䎱㎞䗈ˑ傖龊冫䃗鋇㢒밨?ဒ췺፿徦䓁쑣繸搃ᥒ惯佨∮邷䛌렚?௶㨼䦎␘슥갂酰㟐趹丒沺敒깮멲╢᳾듕瑘䮂謈烬뗝䣓懏埂蛞᷀飰榱蹚鮂蟑칐⡐賠觛뾌䋷䅇ⴜ끷믏Øø¿W7NB\\tÈ½jí»i\\tÅÇð¢ODúR b\\fvápvÿvÝ/^¶pö/@DÈoùø¦\\r«± aÑÎ\\bÄÏHÔða2©EWLFI¨µXÝãePö¢µêÆõ¦.´d#[ÞKUpæCéÑ¸Ò°K jÇÊºî(êÈ_]Wì®cz#øVc\×Tè\\túûX%Z´XL\\tävÔËlMÝ}~d$ÔÕ#Ü\\t|Zè.²2 }ØÎ>ªG1¸¿^8.r7qAY\\fU8Oëº>7ß2ß=ÊDüÓP5ÒQI\\tg¶`ÙJ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #19
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 144
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
    //   68: ldc '挭矛漐ゅ杸ﺗ꬏쪰즅﨧䞃굮ꋠ鰟牫랏錩㚝㐟燇ㅴц⏫ᡍ֍߇職늟ঔⰞᯞ娂劮훦⧐⾌卸¹†뇑樍뺉䩎壌퀲ꩬ䏴㌭䔹˾僱鼶儞䀙鈨㠒벌?ჟ촚ጨ忣䑲쒒繗摤᧮恚侦⋁逷䙨롓?ஆ㩫䧋⒫쉔갭鄗㜞赖互氞斟긞몒┵᲻둦瑷䯥讴灙딓䠼慫型蘓ᶰ颧槴軩魳蟾츷⣬豕褕뽣䉷䇣ⵕ낺뮿\\t/5· þ_¬'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: sipush #128
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #9
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zx_s.a : [Ljava/lang/String;
    //   133: bipush #15
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zx_s.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #93
    //   214: goto -> 244
    //   217: bipush #15
    //   219: goto -> 244
    //   222: bipush #34
    //   224: goto -> 244
    //   227: bipush #115
    //   229: goto -> 244
    //   232: bipush #125
    //   234: goto -> 244
    //   237: bipush #106
    //   239: goto -> 244
    //   242: bipush #86
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 100
    //   300: sipush #24687
    //   303: sipush #26314
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zx_s.Za : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #24673
    //   319: sipush #22110
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zx_s.ZX : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6069) & 0xFFFF;
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
      char c = 'Ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */