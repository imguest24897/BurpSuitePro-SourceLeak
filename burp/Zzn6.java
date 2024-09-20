package burp;

import java.math.BigInteger;

class Zzn6 extends ClassLoader {
  static Object ZO;
  
  static String Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
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
    //   169: getstatic burp/Zgtx.ZN : Ljava/lang/String;
    //   172: getstatic burp/Zgi9.Zc : Ljava/lang/Object;
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
    //   206: getstatic burp/Zr02.ZG : Ljava/lang/String;
    //   209: getstatic burp/Zld9.ZF : Ljava/lang/Object;
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
    //   243: getstatic burp/Zb87.ZK : Ljava/lang/String;
    //   246: getstatic burp/Zzc9.ZZ : Ljava/lang/Object;
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
    //   280: getstatic burp/Zs4g.ZV : Ljava/lang/String;
    //   283: getstatic burp/Zer1.ZL : Ljava/lang/Object;
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
    //   317: getstatic burp/Zscf.Zu : Ljava/lang/String;
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
    //   343: ifne -> 1348
    //   346: goto -> 353
    //   349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   352: athrow
    //   353: aload_3
    //   354: getstatic burp/Zmtr.Zd : Ljava/lang/String;
    //   357: getstatic burp/Zbjx.ZT : Ljava/lang/Object;
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
    //   391: getstatic burp/Zg2u.Zy : Ljava/lang/String;
    //   394: getstatic burp/Zrn4.Zq : Ljava/lang/Object;
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
    //   428: getstatic burp/Zxzv.ZI : Ljava/lang/String;
    //   431: getstatic burp/Zgu4.Zs : Ljava/lang/Object;
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
    //   465: getstatic burp/Ztq8.ZI : Ljava/lang/String;
    //   468: getstatic burp/Zg1l.Zg : Ljava/lang/Object;
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
    //   502: getstatic burp/Zmdi.ZA : Ljava/lang/String;
    //   505: getstatic burp/Zzr8.ZC : Ljava/lang/Object;
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
    //   539: getstatic burp/Zk92.Zc : Ljava/lang/String;
    //   542: getstatic burp/Ze4g.Zz : Ljava/lang/Object;
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
    //   576: getstatic burp/Zt0m.ZH : Ljava/lang/String;
    //   579: getstatic burp/Zmdf.ZH : Ljava/lang/Object;
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
    //   613: getstatic burp/Zmyk.Zx : Ljava/lang/String;
    //   616: getstatic burp/Zz0b.ZT : Ljava/lang/Object;
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
    //   650: getstatic burp/Ze1k.ZI : Ljava/lang/String;
    //   653: getstatic burp/Zg0q.Zf : Ljava/lang/Object;
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
    //   687: getstatic burp/Zma0.ZP : Ljava/lang/String;
    //   690: getstatic burp/Zzk_.Zx : Ljava/lang/Object;
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
    //   724: getstatic burp/Zk7o.Zb : Ljava/lang/String;
    //   727: getstatic burp/Ze1k.ZD : Ljava/lang/Object;
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
    //   761: getstatic burp/Zlwc.ZM : Ljava/lang/String;
    //   764: getstatic burp/Zs0h.ZU : Ljava/lang/Object;
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
    //   798: getstatic burp/Zt4p.ZL : Ljava/lang/String;
    //   801: getstatic burp/Zz3b.Zu : Ljava/lang/Object;
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
    //   835: getstatic burp/Zssc.ZR : Ljava/lang/String;
    //   838: getstatic burp/Zenr.ZA : Ljava/lang/Object;
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
    //   872: getstatic burp/Zlc2.Zz : Ljava/lang/String;
    //   875: getstatic burp/Ztgv.Zg : Ljava/lang/Object;
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
    //   909: getstatic burp/Ze2k.ZY : Ljava/lang/String;
    //   912: getstatic burp/Zsdl.Zx : Ljava/lang/Object;
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
    //   946: getstatic burp/Zlwj.ZQ : Ljava/lang/String;
    //   949: getstatic burp/Ztgv.Zg : Ljava/lang/Object;
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
    //   983: getstatic burp/Zspg.ZG : Ljava/lang/String;
    //   986: getstatic burp/Zb9q.ZI : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zb0q.Zr : Ljava/lang/String;
    //   1023: getstatic burp/Zrp2.Zw : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zmkq.Zr : Ljava/lang/String;
    //   1060: getstatic burp/Zly9.Zz : Ljava/lang/Object;
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
    //   1094: getstatic burp/Ztle.ZR : Ljava/lang/String;
    //   1097: getstatic burp/Zsfj.ZL : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zlxr.ZS : Ljava/lang/String;
    //   1134: getstatic burp/Zegv.ZL : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zttd.Ze : Ljava/lang/String;
    //   1171: getstatic burp/Zr9u.ZX : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zkeb.ZW : Ljava/lang/String;
    //   1208: getstatic burp/Zzhx.ZB : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zm8j.Zp : Ljava/lang/String;
    //   1245: getstatic burp/Zmui.Zz : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zllk.Zs : Ljava/lang/String;
    //   1282: getstatic burp/Zewr.Zw : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zb2u.ZM : Ljava/lang/String;
    //   1319: getstatic burp/Zz0b.ZT : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zzk_.ZX : Ljava/lang/String;
    //   1362: sipush #-2010
    //   1365: sipush #-28581
    //   1368: invokestatic a : (II)Ljava/lang/String;
    //   1371: iconst_1
    //   1372: ldc burp/Zrcx
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
    //   1493: sipush #-1990
    //   1496: sipush #22698
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
    //   1535: sipush #-2002
    //   1538: sipush #-1807
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
    //   1697: iconst_0
    //   1698: istore #4
    //   1700: getstatic burp/Zlg2.ZL : Ljava/lang/String;
    //   1703: getstatic burp/Zti7.Zw : Ljava/lang/Object;
    //   1706: checkcast java/math/BigInteger
    //   1709: invokevirtual intValue : ()I
    //   1712: bipush #32
    //   1714: irem
    //   1715: invokestatic abs : (I)I
    //   1718: invokevirtual charAt : (I)C
    //   1721: getstatic burp/Zssc.ZR : Ljava/lang/String;
    //   1724: getstatic burp/Zz5e.Zl : Ljava/lang/Object;
    //   1727: checkcast java/math/BigInteger
    //   1730: invokevirtual intValue : ()I
    //   1733: bipush #32
    //   1735: irem
    //   1736: invokestatic abs : (I)I
    //   1739: invokevirtual charAt : (I)C
    //   1742: if_icmpgt -> 2087
    //   1745: sipush #-2005
    //   1748: sipush #8820
    //   1751: invokestatic a : (II)Ljava/lang/String;
    //   1754: iconst_1
    //   1755: ldc burp/Zmy3
    //   1757: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1760: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1763: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1766: astore #5
    //   1768: aload #5
    //   1770: arraylength
    //   1771: istore #6
    //   1773: iconst_0
    //   1774: istore #7
    //   1776: iload #7
    //   1778: iload #6
    //   1780: if_icmpge -> 1918
    //   1783: aload #5
    //   1785: iload #7
    //   1787: aaload
    //   1788: astore #8
    //   1790: aload #8
    //   1792: invokevirtual getModifiers : ()I
    //   1795: invokestatic isStatic : (I)Z
    //   1798: ifne -> 1808
    //   1801: goto -> 1911
    //   1804: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1807: athrow
    //   1808: aload #8
    //   1810: invokevirtual getType : ()Ljava/lang/Class;
    //   1813: astore #9
    //   1815: aload #9
    //   1817: ifnull -> 1898
    //   1820: aload #9
    //   1822: invokevirtual isPrimitive : ()Z
    //   1825: ifne -> 1898
    //   1828: goto -> 1835
    //   1831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1834: athrow
    //   1835: aload #9
    //   1837: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1840: ifnull -> 1898
    //   1843: goto -> 1850
    //   1846: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1849: athrow
    //   1850: aload #9
    //   1852: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1855: invokevirtual getName : ()Ljava/lang/String;
    //   1858: ifnull -> 1898
    //   1861: goto -> 1868
    //   1864: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1867: athrow
    //   1868: aload #9
    //   1870: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1873: invokevirtual getName : ()Ljava/lang/String;
    //   1876: sipush #-2008
    //   1879: sipush #11129
    //   1882: invokestatic a : (II)Ljava/lang/String;
    //   1885: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1888: ifne -> 1898
    //   1891: goto -> 1898
    //   1894: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1897: athrow
    //   1898: aload #8
    //   1900: iconst_1
    //   1901: invokevirtual setAccessible : (Z)V
    //   1904: aload #8
    //   1906: aconst_null
    //   1907: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1910: pop
    //   1911: iinc #7, 1
    //   1914: iload_2
    //   1915: ifne -> 1776
    //   1918: sipush #-1992
    //   1921: sipush #-18703
    //   1924: invokestatic a : (II)Ljava/lang/String;
    //   1927: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1930: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1933: astore #5
    //   1935: aload #5
    //   1937: arraylength
    //   1938: istore #6
    //   1940: iconst_0
    //   1941: istore #7
    //   1943: iload #7
    //   1945: iload #6
    //   1947: if_icmpge -> 2084
    //   1950: aload #5
    //   1952: iload #7
    //   1954: aaload
    //   1955: astore #8
    //   1957: aload #8
    //   1959: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1962: pop
    //   1963: aload #8
    //   1965: invokevirtual getModifiers : ()I
    //   1968: invokestatic isStatic : (I)Z
    //   1971: ifeq -> 2070
    //   1974: aload #8
    //   1976: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1979: arraylength
    //   1980: iconst_2
    //   1981: if_icmpne -> 2070
    //   1984: goto -> 1991
    //   1987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1990: athrow
    //   1991: aload #8
    //   1993: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1996: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1999: if_acmpne -> 2070
    //   2002: goto -> 2009
    //   2005: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2008: athrow
    //   2009: aload #8
    //   2011: iconst_1
    //   2012: invokevirtual setAccessible : (Z)V
    //   2015: aload #8
    //   2017: aconst_null
    //   2018: iconst_2
    //   2019: anewarray java/lang/Object
    //   2022: dup
    //   2023: iconst_0
    //   2024: aload_0
    //   2025: aastore
    //   2026: dup
    //   2027: iconst_1
    //   2028: aload_1
    //   2029: ifnonnull -> 2047
    //   2032: goto -> 2039
    //   2035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2038: athrow
    //   2039: aload_1
    //   2040: goto -> 2054
    //   2043: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2046: athrow
    //   2047: aload_1
    //   2048: checkcast [B
    //   2051: invokevirtual clone : ()Ljava/lang/Object;
    //   2054: aastore
    //   2055: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2058: checkcast java/lang/Boolean
    //   2061: invokevirtual booleanValue : ()Z
    //   2064: istore #4
    //   2066: iload_2
    //   2067: ifne -> 2084
    //   2070: iinc #7, 1
    //   2073: iload_2
    //   2074: ifne -> 1943
    //   2077: goto -> 2084
    //   2080: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2083: athrow
    //   2084: goto -> 2426
    //   2087: sipush #-1998
    //   2090: sipush #-3968
    //   2093: invokestatic a : (II)Ljava/lang/String;
    //   2096: iconst_1
    //   2097: ldc burp/Zb38
    //   2099: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2102: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2105: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2108: astore #5
    //   2110: aload #5
    //   2112: arraylength
    //   2113: istore #6
    //   2115: iconst_0
    //   2116: istore #7
    //   2118: iload #7
    //   2120: iload #6
    //   2122: if_icmpge -> 2260
    //   2125: aload #5
    //   2127: iload #7
    //   2129: aaload
    //   2130: astore #8
    //   2132: aload #8
    //   2134: invokevirtual getModifiers : ()I
    //   2137: invokestatic isStatic : (I)Z
    //   2140: ifne -> 2150
    //   2143: goto -> 2253
    //   2146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2149: athrow
    //   2150: aload #8
    //   2152: invokevirtual getType : ()Ljava/lang/Class;
    //   2155: astore #9
    //   2157: aload #9
    //   2159: ifnull -> 2240
    //   2162: aload #9
    //   2164: invokevirtual isPrimitive : ()Z
    //   2167: ifne -> 2240
    //   2170: goto -> 2177
    //   2173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2176: athrow
    //   2177: aload #9
    //   2179: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2182: ifnull -> 2240
    //   2185: goto -> 2192
    //   2188: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2191: athrow
    //   2192: aload #9
    //   2194: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2197: invokevirtual getName : ()Ljava/lang/String;
    //   2200: ifnull -> 2240
    //   2203: goto -> 2210
    //   2206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2209: athrow
    //   2210: aload #9
    //   2212: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2215: invokevirtual getName : ()Ljava/lang/String;
    //   2218: sipush #-2008
    //   2221: sipush #11129
    //   2224: invokestatic a : (II)Ljava/lang/String;
    //   2227: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2230: ifne -> 2240
    //   2233: goto -> 2240
    //   2236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2239: athrow
    //   2240: aload #8
    //   2242: iconst_1
    //   2243: invokevirtual setAccessible : (Z)V
    //   2246: aload #8
    //   2248: aconst_null
    //   2249: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2252: pop
    //   2253: iinc #7, 1
    //   2256: iload_2
    //   2257: ifne -> 2118
    //   2260: sipush #-2004
    //   2263: sipush #-7224
    //   2266: invokestatic a : (II)Ljava/lang/String;
    //   2269: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2272: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2275: astore #5
    //   2277: aload #5
    //   2279: arraylength
    //   2280: istore #6
    //   2282: iconst_0
    //   2283: istore #7
    //   2285: iload #7
    //   2287: iload #6
    //   2289: if_icmpge -> 2426
    //   2292: aload #5
    //   2294: iload #7
    //   2296: aaload
    //   2297: astore #8
    //   2299: aload #8
    //   2301: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2304: pop
    //   2305: aload #8
    //   2307: invokevirtual getModifiers : ()I
    //   2310: invokestatic isStatic : (I)Z
    //   2313: ifeq -> 2412
    //   2316: aload #8
    //   2318: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2321: arraylength
    //   2322: iconst_2
    //   2323: if_icmpne -> 2412
    //   2326: goto -> 2333
    //   2329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2332: athrow
    //   2333: aload #8
    //   2335: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2338: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2341: if_acmpne -> 2412
    //   2344: goto -> 2351
    //   2347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2350: athrow
    //   2351: aload #8
    //   2353: iconst_1
    //   2354: invokevirtual setAccessible : (Z)V
    //   2357: aload #8
    //   2359: aconst_null
    //   2360: iconst_2
    //   2361: anewarray java/lang/Object
    //   2364: dup
    //   2365: iconst_0
    //   2366: aload_0
    //   2367: aastore
    //   2368: dup
    //   2369: iconst_1
    //   2370: aload_1
    //   2371: ifnonnull -> 2389
    //   2374: goto -> 2381
    //   2377: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2380: athrow
    //   2381: aload_1
    //   2382: goto -> 2396
    //   2385: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2388: athrow
    //   2389: aload_1
    //   2390: checkcast [B
    //   2393: invokevirtual clone : ()Ljava/lang/Object;
    //   2396: aastore
    //   2397: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2400: checkcast java/lang/Boolean
    //   2403: invokevirtual booleanValue : ()Z
    //   2406: istore #4
    //   2408: iload_2
    //   2409: ifne -> 2426
    //   2412: iinc #7, 1
    //   2415: iload_2
    //   2416: ifne -> 2285
    //   2419: goto -> 2426
    //   2422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2425: athrow
    //   2426: iload #4
    //   2428: ifeq -> 2434
    //   2431: iload #4
    //   2433: ireturn
    //   2434: getstatic burp/Zrjw.Zz : Ljava/lang/String;
    //   2437: getstatic burp/Zg4l.ZI : Ljava/lang/Object;
    //   2440: checkcast java/math/BigInteger
    //   2443: invokevirtual intValue : ()I
    //   2446: bipush #32
    //   2448: irem
    //   2449: invokestatic abs : (I)I
    //   2452: invokevirtual charAt : (I)C
    //   2455: getstatic burp/Ze2k.ZY : Ljava/lang/String;
    //   2458: getstatic burp/Zmui.Zz : Ljava/lang/Object;
    //   2461: checkcast java/math/BigInteger
    //   2464: invokevirtual intValue : ()I
    //   2467: bipush #32
    //   2469: irem
    //   2470: invokestatic abs : (I)I
    //   2473: invokevirtual charAt : (I)C
    //   2476: if_icmpgt -> 2822
    //   2479: sipush #-1991
    //   2482: sipush #26552
    //   2485: invokestatic a : (II)Ljava/lang/String;
    //   2488: iconst_1
    //   2489: ldc burp/Zkq9
    //   2491: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2494: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2497: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2500: astore #5
    //   2502: aload #5
    //   2504: arraylength
    //   2505: istore #6
    //   2507: iconst_0
    //   2508: istore #7
    //   2510: iload #7
    //   2512: iload #6
    //   2514: if_icmpge -> 2652
    //   2517: aload #5
    //   2519: iload #7
    //   2521: aaload
    //   2522: astore #8
    //   2524: aload #8
    //   2526: invokevirtual getModifiers : ()I
    //   2529: invokestatic isStatic : (I)Z
    //   2532: ifne -> 2542
    //   2535: goto -> 2645
    //   2538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2541: athrow
    //   2542: aload #8
    //   2544: invokevirtual getType : ()Ljava/lang/Class;
    //   2547: astore #9
    //   2549: aload #9
    //   2551: ifnull -> 2632
    //   2554: aload #9
    //   2556: invokevirtual isPrimitive : ()Z
    //   2559: ifne -> 2632
    //   2562: goto -> 2569
    //   2565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2568: athrow
    //   2569: aload #9
    //   2571: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2574: ifnull -> 2632
    //   2577: goto -> 2584
    //   2580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2583: athrow
    //   2584: aload #9
    //   2586: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2589: invokevirtual getName : ()Ljava/lang/String;
    //   2592: ifnull -> 2632
    //   2595: goto -> 2602
    //   2598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2601: athrow
    //   2602: aload #9
    //   2604: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2607: invokevirtual getName : ()Ljava/lang/String;
    //   2610: sipush #-2008
    //   2613: sipush #11129
    //   2616: invokestatic a : (II)Ljava/lang/String;
    //   2619: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2622: ifne -> 2632
    //   2625: goto -> 2632
    //   2628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2631: athrow
    //   2632: aload #8
    //   2634: iconst_1
    //   2635: invokevirtual setAccessible : (Z)V
    //   2638: aload #8
    //   2640: aconst_null
    //   2641: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2644: pop
    //   2645: iinc #7, 1
    //   2648: iload_2
    //   2649: ifne -> 2510
    //   2652: sipush #-2011
    //   2655: sipush #2528
    //   2658: invokestatic a : (II)Ljava/lang/String;
    //   2661: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2664: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2667: astore #5
    //   2669: aload #5
    //   2671: arraylength
    //   2672: istore #6
    //   2674: iconst_0
    //   2675: istore #7
    //   2677: iload #7
    //   2679: iload #6
    //   2681: if_icmpge -> 2818
    //   2684: aload #5
    //   2686: iload #7
    //   2688: aaload
    //   2689: astore #8
    //   2691: aload #8
    //   2693: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2696: pop
    //   2697: aload #8
    //   2699: invokevirtual getModifiers : ()I
    //   2702: invokestatic isStatic : (I)Z
    //   2705: ifeq -> 2804
    //   2708: aload #8
    //   2710: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2713: arraylength
    //   2714: iconst_2
    //   2715: if_icmpne -> 2804
    //   2718: goto -> 2725
    //   2721: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2724: athrow
    //   2725: aload #8
    //   2727: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2730: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2733: if_acmpne -> 2804
    //   2736: goto -> 2743
    //   2739: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2742: athrow
    //   2743: aload #8
    //   2745: iconst_1
    //   2746: invokevirtual setAccessible : (Z)V
    //   2749: aload #8
    //   2751: aconst_null
    //   2752: iconst_2
    //   2753: anewarray java/lang/Object
    //   2756: dup
    //   2757: iconst_0
    //   2758: aload_0
    //   2759: aastore
    //   2760: dup
    //   2761: iconst_1
    //   2762: aload_1
    //   2763: ifnonnull -> 2781
    //   2766: goto -> 2773
    //   2769: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2772: athrow
    //   2773: aload_1
    //   2774: goto -> 2788
    //   2777: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2780: athrow
    //   2781: aload_1
    //   2782: checkcast [B
    //   2785: invokevirtual clone : ()Ljava/lang/Object;
    //   2788: aastore
    //   2789: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2792: checkcast java/lang/Boolean
    //   2795: invokevirtual booleanValue : ()Z
    //   2798: istore #4
    //   2800: iload_2
    //   2801: ifne -> 2818
    //   2804: iinc #7, 1
    //   2807: iload_2
    //   2808: ifne -> 2677
    //   2811: goto -> 2818
    //   2814: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2817: athrow
    //   2818: iload_2
    //   2819: ifne -> 3161
    //   2822: sipush #-1986
    //   2825: sipush #10349
    //   2828: invokestatic a : (II)Ljava/lang/String;
    //   2831: iconst_1
    //   2832: ldc burp/Zza3
    //   2834: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2837: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2840: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2843: astore #5
    //   2845: aload #5
    //   2847: arraylength
    //   2848: istore #6
    //   2850: iconst_0
    //   2851: istore #7
    //   2853: iload #7
    //   2855: iload #6
    //   2857: if_icmpge -> 2995
    //   2860: aload #5
    //   2862: iload #7
    //   2864: aaload
    //   2865: astore #8
    //   2867: aload #8
    //   2869: invokevirtual getModifiers : ()I
    //   2872: invokestatic isStatic : (I)Z
    //   2875: ifne -> 2885
    //   2878: goto -> 2988
    //   2881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2884: athrow
    //   2885: aload #8
    //   2887: invokevirtual getType : ()Ljava/lang/Class;
    //   2890: astore #9
    //   2892: aload #9
    //   2894: ifnull -> 2975
    //   2897: aload #9
    //   2899: invokevirtual isPrimitive : ()Z
    //   2902: ifne -> 2975
    //   2905: goto -> 2912
    //   2908: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2911: athrow
    //   2912: aload #9
    //   2914: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2917: ifnull -> 2975
    //   2920: goto -> 2927
    //   2923: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2926: athrow
    //   2927: aload #9
    //   2929: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2932: invokevirtual getName : ()Ljava/lang/String;
    //   2935: ifnull -> 2975
    //   2938: goto -> 2945
    //   2941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2944: athrow
    //   2945: aload #9
    //   2947: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2950: invokevirtual getName : ()Ljava/lang/String;
    //   2953: sipush #-2008
    //   2956: sipush #11129
    //   2959: invokestatic a : (II)Ljava/lang/String;
    //   2962: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2965: ifne -> 2975
    //   2968: goto -> 2975
    //   2971: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2974: athrow
    //   2975: aload #8
    //   2977: iconst_1
    //   2978: invokevirtual setAccessible : (Z)V
    //   2981: aload #8
    //   2983: aconst_null
    //   2984: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2987: pop
    //   2988: iinc #7, 1
    //   2991: iload_2
    //   2992: ifne -> 2853
    //   2995: sipush #-2015
    //   2998: sipush #15840
    //   3001: invokestatic a : (II)Ljava/lang/String;
    //   3004: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3007: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3010: astore #5
    //   3012: aload #5
    //   3014: arraylength
    //   3015: istore #6
    //   3017: iconst_0
    //   3018: istore #7
    //   3020: iload #7
    //   3022: iload #6
    //   3024: if_icmpge -> 3161
    //   3027: aload #5
    //   3029: iload #7
    //   3031: aaload
    //   3032: astore #8
    //   3034: aload #8
    //   3036: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3039: pop
    //   3040: aload #8
    //   3042: invokevirtual getModifiers : ()I
    //   3045: invokestatic isStatic : (I)Z
    //   3048: ifeq -> 3147
    //   3051: aload #8
    //   3053: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3056: arraylength
    //   3057: iconst_2
    //   3058: if_icmpne -> 3147
    //   3061: goto -> 3068
    //   3064: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3067: athrow
    //   3068: aload #8
    //   3070: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3073: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3076: if_acmpne -> 3147
    //   3079: goto -> 3086
    //   3082: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3085: athrow
    //   3086: aload #8
    //   3088: iconst_1
    //   3089: invokevirtual setAccessible : (Z)V
    //   3092: aload #8
    //   3094: aconst_null
    //   3095: iconst_2
    //   3096: anewarray java/lang/Object
    //   3099: dup
    //   3100: iconst_0
    //   3101: aload_0
    //   3102: aastore
    //   3103: dup
    //   3104: iconst_1
    //   3105: aload_1
    //   3106: ifnonnull -> 3124
    //   3109: goto -> 3116
    //   3112: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3115: athrow
    //   3116: aload_1
    //   3117: goto -> 3131
    //   3120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3123: athrow
    //   3124: aload_1
    //   3125: checkcast [B
    //   3128: invokevirtual clone : ()Ljava/lang/Object;
    //   3131: aastore
    //   3132: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3135: checkcast java/lang/Boolean
    //   3138: invokevirtual booleanValue : ()Z
    //   3141: istore #4
    //   3143: iload_2
    //   3144: ifne -> 3161
    //   3147: iinc #7, 1
    //   3150: iload_2
    //   3151: ifne -> 3020
    //   3154: goto -> 3161
    //   3157: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3160: athrow
    //   3161: iload #4
    //   3163: ifeq -> 3169
    //   3166: iload #4
    //   3168: ireturn
    //   3169: getstatic burp/Zge2.ZT : Ljava/lang/String;
    //   3172: getstatic burp/Ztgv.Zg : Ljava/lang/Object;
    //   3175: checkcast java/math/BigInteger
    //   3178: invokevirtual intValue : ()I
    //   3181: bipush #32
    //   3183: irem
    //   3184: invokestatic abs : (I)I
    //   3187: invokevirtual charAt : (I)C
    //   3190: getstatic burp/Zti7.Zc : Ljava/lang/String;
    //   3193: getstatic burp/Zry1.Zf : Ljava/lang/Object;
    //   3196: checkcast java/math/BigInteger
    //   3199: invokevirtual intValue : ()I
    //   3202: bipush #32
    //   3204: irem
    //   3205: invokestatic abs : (I)I
    //   3208: invokevirtual charAt : (I)C
    //   3211: if_icmpgt -> 3557
    //   3214: sipush #-2012
    //   3217: sipush #-11719
    //   3220: invokestatic a : (II)Ljava/lang/String;
    //   3223: iconst_1
    //   3224: ldc burp/Zth8
    //   3226: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3229: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3232: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3235: astore #5
    //   3237: aload #5
    //   3239: arraylength
    //   3240: istore #6
    //   3242: iconst_0
    //   3243: istore #7
    //   3245: iload #7
    //   3247: iload #6
    //   3249: if_icmpge -> 3387
    //   3252: aload #5
    //   3254: iload #7
    //   3256: aaload
    //   3257: astore #8
    //   3259: aload #8
    //   3261: invokevirtual getModifiers : ()I
    //   3264: invokestatic isStatic : (I)Z
    //   3267: ifne -> 3277
    //   3270: goto -> 3380
    //   3273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3276: athrow
    //   3277: aload #8
    //   3279: invokevirtual getType : ()Ljava/lang/Class;
    //   3282: astore #9
    //   3284: aload #9
    //   3286: ifnull -> 3367
    //   3289: aload #9
    //   3291: invokevirtual isPrimitive : ()Z
    //   3294: ifne -> 3367
    //   3297: goto -> 3304
    //   3300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3303: athrow
    //   3304: aload #9
    //   3306: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3309: ifnull -> 3367
    //   3312: goto -> 3319
    //   3315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3318: athrow
    //   3319: aload #9
    //   3321: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3324: invokevirtual getName : ()Ljava/lang/String;
    //   3327: ifnull -> 3367
    //   3330: goto -> 3337
    //   3333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3336: athrow
    //   3337: aload #9
    //   3339: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3342: invokevirtual getName : ()Ljava/lang/String;
    //   3345: sipush #-2008
    //   3348: sipush #11129
    //   3351: invokestatic a : (II)Ljava/lang/String;
    //   3354: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3357: ifne -> 3367
    //   3360: goto -> 3367
    //   3363: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3366: athrow
    //   3367: aload #8
    //   3369: iconst_1
    //   3370: invokevirtual setAccessible : (Z)V
    //   3373: aload #8
    //   3375: aconst_null
    //   3376: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3379: pop
    //   3380: iinc #7, 1
    //   3383: iload_2
    //   3384: ifne -> 3245
    //   3387: sipush #-2014
    //   3390: sipush #12865
    //   3393: invokestatic a : (II)Ljava/lang/String;
    //   3396: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3399: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3402: astore #5
    //   3404: aload #5
    //   3406: arraylength
    //   3407: istore #6
    //   3409: iconst_0
    //   3410: istore #7
    //   3412: iload #7
    //   3414: iload #6
    //   3416: if_icmpge -> 3553
    //   3419: aload #5
    //   3421: iload #7
    //   3423: aaload
    //   3424: astore #8
    //   3426: aload #8
    //   3428: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3431: pop
    //   3432: aload #8
    //   3434: invokevirtual getModifiers : ()I
    //   3437: invokestatic isStatic : (I)Z
    //   3440: ifeq -> 3539
    //   3443: aload #8
    //   3445: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3448: arraylength
    //   3449: iconst_2
    //   3450: if_icmpne -> 3539
    //   3453: goto -> 3460
    //   3456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3459: athrow
    //   3460: aload #8
    //   3462: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3465: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3468: if_acmpne -> 3539
    //   3471: goto -> 3478
    //   3474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3477: athrow
    //   3478: aload #8
    //   3480: iconst_1
    //   3481: invokevirtual setAccessible : (Z)V
    //   3484: aload #8
    //   3486: aconst_null
    //   3487: iconst_2
    //   3488: anewarray java/lang/Object
    //   3491: dup
    //   3492: iconst_0
    //   3493: aload_0
    //   3494: aastore
    //   3495: dup
    //   3496: iconst_1
    //   3497: aload_1
    //   3498: ifnonnull -> 3516
    //   3501: goto -> 3508
    //   3504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3507: athrow
    //   3508: aload_1
    //   3509: goto -> 3523
    //   3512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3515: athrow
    //   3516: aload_1
    //   3517: checkcast [B
    //   3520: invokevirtual clone : ()Ljava/lang/Object;
    //   3523: aastore
    //   3524: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3527: checkcast java/lang/Boolean
    //   3530: invokevirtual booleanValue : ()Z
    //   3533: istore #4
    //   3535: iload_2
    //   3536: ifne -> 3553
    //   3539: iinc #7, 1
    //   3542: iload_2
    //   3543: ifne -> 3412
    //   3546: goto -> 3553
    //   3549: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3552: athrow
    //   3553: iload_2
    //   3554: ifne -> 3896
    //   3557: sipush #-1989
    //   3560: sipush #31064
    //   3563: invokestatic a : (II)Ljava/lang/String;
    //   3566: iconst_1
    //   3567: ldc burp/Zlo4
    //   3569: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3572: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3575: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3578: astore #5
    //   3580: aload #5
    //   3582: arraylength
    //   3583: istore #6
    //   3585: iconst_0
    //   3586: istore #7
    //   3588: iload #7
    //   3590: iload #6
    //   3592: if_icmpge -> 3730
    //   3595: aload #5
    //   3597: iload #7
    //   3599: aaload
    //   3600: astore #8
    //   3602: aload #8
    //   3604: invokevirtual getModifiers : ()I
    //   3607: invokestatic isStatic : (I)Z
    //   3610: ifne -> 3620
    //   3613: goto -> 3723
    //   3616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3619: athrow
    //   3620: aload #8
    //   3622: invokevirtual getType : ()Ljava/lang/Class;
    //   3625: astore #9
    //   3627: aload #9
    //   3629: ifnull -> 3710
    //   3632: aload #9
    //   3634: invokevirtual isPrimitive : ()Z
    //   3637: ifne -> 3710
    //   3640: goto -> 3647
    //   3643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3646: athrow
    //   3647: aload #9
    //   3649: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3652: ifnull -> 3710
    //   3655: goto -> 3662
    //   3658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3661: athrow
    //   3662: aload #9
    //   3664: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3667: invokevirtual getName : ()Ljava/lang/String;
    //   3670: ifnull -> 3710
    //   3673: goto -> 3680
    //   3676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3679: athrow
    //   3680: aload #9
    //   3682: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3685: invokevirtual getName : ()Ljava/lang/String;
    //   3688: sipush #-2008
    //   3691: sipush #11129
    //   3694: invokestatic a : (II)Ljava/lang/String;
    //   3697: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3700: ifne -> 3710
    //   3703: goto -> 3710
    //   3706: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3709: athrow
    //   3710: aload #8
    //   3712: iconst_1
    //   3713: invokevirtual setAccessible : (Z)V
    //   3716: aload #8
    //   3718: aconst_null
    //   3719: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3722: pop
    //   3723: iinc #7, 1
    //   3726: iload_2
    //   3727: ifne -> 3588
    //   3730: sipush #-2007
    //   3733: sipush #15290
    //   3736: invokestatic a : (II)Ljava/lang/String;
    //   3739: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3742: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3745: astore #5
    //   3747: aload #5
    //   3749: arraylength
    //   3750: istore #6
    //   3752: iconst_0
    //   3753: istore #7
    //   3755: iload #7
    //   3757: iload #6
    //   3759: if_icmpge -> 3896
    //   3762: aload #5
    //   3764: iload #7
    //   3766: aaload
    //   3767: astore #8
    //   3769: aload #8
    //   3771: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3774: pop
    //   3775: aload #8
    //   3777: invokevirtual getModifiers : ()I
    //   3780: invokestatic isStatic : (I)Z
    //   3783: ifeq -> 3882
    //   3786: aload #8
    //   3788: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3791: arraylength
    //   3792: iconst_2
    //   3793: if_icmpne -> 3882
    //   3796: goto -> 3803
    //   3799: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3802: athrow
    //   3803: aload #8
    //   3805: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3808: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3811: if_acmpne -> 3882
    //   3814: goto -> 3821
    //   3817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3820: athrow
    //   3821: aload #8
    //   3823: iconst_1
    //   3824: invokevirtual setAccessible : (Z)V
    //   3827: aload #8
    //   3829: aconst_null
    //   3830: iconst_2
    //   3831: anewarray java/lang/Object
    //   3834: dup
    //   3835: iconst_0
    //   3836: aload_0
    //   3837: aastore
    //   3838: dup
    //   3839: iconst_1
    //   3840: aload_1
    //   3841: ifnonnull -> 3859
    //   3844: goto -> 3851
    //   3847: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3850: athrow
    //   3851: aload_1
    //   3852: goto -> 3866
    //   3855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3858: athrow
    //   3859: aload_1
    //   3860: checkcast [B
    //   3863: invokevirtual clone : ()Ljava/lang/Object;
    //   3866: aastore
    //   3867: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3870: checkcast java/lang/Boolean
    //   3873: invokevirtual booleanValue : ()Z
    //   3876: istore #4
    //   3878: iload_2
    //   3879: ifne -> 3896
    //   3882: iinc #7, 1
    //   3885: iload_2
    //   3886: ifne -> 3755
    //   3889: goto -> 3896
    //   3892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3895: athrow
    //   3896: iload #4
    //   3898: ifeq -> 3904
    //   3901: iload #4
    //   3903: ireturn
    //   3904: getstatic burp/Zgsb.ZM : Ljava/lang/String;
    //   3907: getstatic burp/Zr2q.ZS : Ljava/lang/Object;
    //   3910: checkcast java/math/BigInteger
    //   3913: invokevirtual intValue : ()I
    //   3916: bipush #32
    //   3918: irem
    //   3919: invokestatic abs : (I)I
    //   3922: invokevirtual charAt : (I)C
    //   3925: getstatic burp/Zxcn.ZF : Ljava/lang/String;
    //   3928: getstatic burp/Zrye.Zx : Ljava/lang/Object;
    //   3931: checkcast java/math/BigInteger
    //   3934: invokevirtual intValue : ()I
    //   3937: bipush #32
    //   3939: irem
    //   3940: invokestatic abs : (I)I
    //   3943: invokevirtual charAt : (I)C
    //   3946: if_icmpgt -> 4292
    //   3949: sipush #-1987
    //   3952: sipush #-27660
    //   3955: invokestatic a : (II)Ljava/lang/String;
    //   3958: iconst_1
    //   3959: ldc burp/Zbzj
    //   3961: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3964: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3967: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3970: astore #5
    //   3972: aload #5
    //   3974: arraylength
    //   3975: istore #6
    //   3977: iconst_0
    //   3978: istore #7
    //   3980: iload #7
    //   3982: iload #6
    //   3984: if_icmpge -> 4122
    //   3987: aload #5
    //   3989: iload #7
    //   3991: aaload
    //   3992: astore #8
    //   3994: aload #8
    //   3996: invokevirtual getModifiers : ()I
    //   3999: invokestatic isStatic : (I)Z
    //   4002: ifne -> 4012
    //   4005: goto -> 4115
    //   4008: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4011: athrow
    //   4012: aload #8
    //   4014: invokevirtual getType : ()Ljava/lang/Class;
    //   4017: astore #9
    //   4019: aload #9
    //   4021: ifnull -> 4102
    //   4024: aload #9
    //   4026: invokevirtual isPrimitive : ()Z
    //   4029: ifne -> 4102
    //   4032: goto -> 4039
    //   4035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4038: athrow
    //   4039: aload #9
    //   4041: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4044: ifnull -> 4102
    //   4047: goto -> 4054
    //   4050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4053: athrow
    //   4054: aload #9
    //   4056: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4059: invokevirtual getName : ()Ljava/lang/String;
    //   4062: ifnull -> 4102
    //   4065: goto -> 4072
    //   4068: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4071: athrow
    //   4072: aload #9
    //   4074: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4077: invokevirtual getName : ()Ljava/lang/String;
    //   4080: sipush #-2008
    //   4083: sipush #11129
    //   4086: invokestatic a : (II)Ljava/lang/String;
    //   4089: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4092: ifne -> 4102
    //   4095: goto -> 4102
    //   4098: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4101: athrow
    //   4102: aload #8
    //   4104: iconst_1
    //   4105: invokevirtual setAccessible : (Z)V
    //   4108: aload #8
    //   4110: aconst_null
    //   4111: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4114: pop
    //   4115: iinc #7, 1
    //   4118: iload_2
    //   4119: ifne -> 3980
    //   4122: sipush #-2013
    //   4125: sipush #19382
    //   4128: invokestatic a : (II)Ljava/lang/String;
    //   4131: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4134: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4137: astore #5
    //   4139: aload #5
    //   4141: arraylength
    //   4142: istore #6
    //   4144: iconst_0
    //   4145: istore #7
    //   4147: iload #7
    //   4149: iload #6
    //   4151: if_icmpge -> 4288
    //   4154: aload #5
    //   4156: iload #7
    //   4158: aaload
    //   4159: astore #8
    //   4161: aload #8
    //   4163: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4166: pop
    //   4167: aload #8
    //   4169: invokevirtual getModifiers : ()I
    //   4172: invokestatic isStatic : (I)Z
    //   4175: ifeq -> 4274
    //   4178: aload #8
    //   4180: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4183: arraylength
    //   4184: iconst_2
    //   4185: if_icmpne -> 4274
    //   4188: goto -> 4195
    //   4191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4194: athrow
    //   4195: aload #8
    //   4197: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4200: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4203: if_acmpne -> 4274
    //   4206: goto -> 4213
    //   4209: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4212: athrow
    //   4213: aload #8
    //   4215: iconst_1
    //   4216: invokevirtual setAccessible : (Z)V
    //   4219: aload #8
    //   4221: aconst_null
    //   4222: iconst_2
    //   4223: anewarray java/lang/Object
    //   4226: dup
    //   4227: iconst_0
    //   4228: aload_0
    //   4229: aastore
    //   4230: dup
    //   4231: iconst_1
    //   4232: aload_1
    //   4233: ifnonnull -> 4251
    //   4236: goto -> 4243
    //   4239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4242: athrow
    //   4243: aload_1
    //   4244: goto -> 4258
    //   4247: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4250: athrow
    //   4251: aload_1
    //   4252: checkcast [B
    //   4255: invokevirtual clone : ()Ljava/lang/Object;
    //   4258: aastore
    //   4259: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4262: checkcast java/lang/Boolean
    //   4265: invokevirtual booleanValue : ()Z
    //   4268: istore #4
    //   4270: iload_2
    //   4271: ifne -> 4288
    //   4274: iinc #7, 1
    //   4277: iload_2
    //   4278: ifne -> 4147
    //   4281: goto -> 4288
    //   4284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4287: athrow
    //   4288: iload_2
    //   4289: ifne -> 4631
    //   4292: sipush #-2001
    //   4295: sipush #-30193
    //   4298: invokestatic a : (II)Ljava/lang/String;
    //   4301: iconst_1
    //   4302: ldc burp/Zr4z
    //   4304: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4307: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4310: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4313: astore #5
    //   4315: aload #5
    //   4317: arraylength
    //   4318: istore #6
    //   4320: iconst_0
    //   4321: istore #7
    //   4323: iload #7
    //   4325: iload #6
    //   4327: if_icmpge -> 4465
    //   4330: aload #5
    //   4332: iload #7
    //   4334: aaload
    //   4335: astore #8
    //   4337: aload #8
    //   4339: invokevirtual getModifiers : ()I
    //   4342: invokestatic isStatic : (I)Z
    //   4345: ifne -> 4355
    //   4348: goto -> 4458
    //   4351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4354: athrow
    //   4355: aload #8
    //   4357: invokevirtual getType : ()Ljava/lang/Class;
    //   4360: astore #9
    //   4362: aload #9
    //   4364: ifnull -> 4445
    //   4367: aload #9
    //   4369: invokevirtual isPrimitive : ()Z
    //   4372: ifne -> 4445
    //   4375: goto -> 4382
    //   4378: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4381: athrow
    //   4382: aload #9
    //   4384: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4387: ifnull -> 4445
    //   4390: goto -> 4397
    //   4393: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4396: athrow
    //   4397: aload #9
    //   4399: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4402: invokevirtual getName : ()Ljava/lang/String;
    //   4405: ifnull -> 4445
    //   4408: goto -> 4415
    //   4411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4414: athrow
    //   4415: aload #9
    //   4417: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4420: invokevirtual getName : ()Ljava/lang/String;
    //   4423: sipush #-2008
    //   4426: sipush #11129
    //   4429: invokestatic a : (II)Ljava/lang/String;
    //   4432: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4435: ifne -> 4445
    //   4438: goto -> 4445
    //   4441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4444: athrow
    //   4445: aload #8
    //   4447: iconst_1
    //   4448: invokevirtual setAccessible : (Z)V
    //   4451: aload #8
    //   4453: aconst_null
    //   4454: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4457: pop
    //   4458: iinc #7, 1
    //   4461: iload_2
    //   4462: ifne -> 4323
    //   4465: sipush #-2009
    //   4468: sipush #-6886
    //   4471: invokestatic a : (II)Ljava/lang/String;
    //   4474: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4477: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4480: astore #5
    //   4482: aload #5
    //   4484: arraylength
    //   4485: istore #6
    //   4487: iconst_0
    //   4488: istore #7
    //   4490: iload #7
    //   4492: iload #6
    //   4494: if_icmpge -> 4631
    //   4497: aload #5
    //   4499: iload #7
    //   4501: aaload
    //   4502: astore #8
    //   4504: aload #8
    //   4506: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4509: pop
    //   4510: aload #8
    //   4512: invokevirtual getModifiers : ()I
    //   4515: invokestatic isStatic : (I)Z
    //   4518: ifeq -> 4617
    //   4521: aload #8
    //   4523: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4526: arraylength
    //   4527: iconst_2
    //   4528: if_icmpne -> 4617
    //   4531: goto -> 4538
    //   4534: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4537: athrow
    //   4538: aload #8
    //   4540: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4543: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4546: if_acmpne -> 4617
    //   4549: goto -> 4556
    //   4552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4555: athrow
    //   4556: aload #8
    //   4558: iconst_1
    //   4559: invokevirtual setAccessible : (Z)V
    //   4562: aload #8
    //   4564: aconst_null
    //   4565: iconst_2
    //   4566: anewarray java/lang/Object
    //   4569: dup
    //   4570: iconst_0
    //   4571: aload_0
    //   4572: aastore
    //   4573: dup
    //   4574: iconst_1
    //   4575: aload_1
    //   4576: ifnonnull -> 4594
    //   4579: goto -> 4586
    //   4582: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4585: athrow
    //   4586: aload_1
    //   4587: goto -> 4601
    //   4590: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4593: athrow
    //   4594: aload_1
    //   4595: checkcast [B
    //   4598: invokevirtual clone : ()Ljava/lang/Object;
    //   4601: aastore
    //   4602: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4605: checkcast java/lang/Boolean
    //   4608: invokevirtual booleanValue : ()Z
    //   4611: istore #4
    //   4613: iload_2
    //   4614: ifne -> 4631
    //   4617: iinc #7, 1
    //   4620: iload_2
    //   4621: ifne -> 4490
    //   4624: goto -> 4631
    //   4627: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4630: athrow
    //   4631: iload #4
    //   4633: ireturn
    //   4634: astore_3
    //   4635: new java/lang/Exception
    //   4638: dup
    //   4639: aload_3
    //   4640: invokevirtual getMessage : ()Ljava/lang/String;
    //   4643: invokespecial <init> : (Ljava/lang/String;)V
    //   4646: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2433	4634	java/lang/Throwable
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
    //   1790	1804	1804	java/lang/Throwable
    //   1815	1828	1831	java/lang/Throwable
    //   1820	1843	1846	java/lang/Throwable
    //   1835	1861	1864	java/lang/Throwable
    //   1850	1891	1894	java/lang/Throwable
    //   1957	1984	1987	java/lang/Throwable
    //   1974	2002	2005	java/lang/Throwable
    //   1991	2032	2035	java/lang/Throwable
    //   2009	2043	2043	java/lang/Throwable
    //   2066	2077	2080	java/lang/Throwable
    //   2132	2146	2146	java/lang/Throwable
    //   2157	2170	2173	java/lang/Throwable
    //   2162	2185	2188	java/lang/Throwable
    //   2177	2203	2206	java/lang/Throwable
    //   2192	2233	2236	java/lang/Throwable
    //   2299	2326	2329	java/lang/Throwable
    //   2316	2344	2347	java/lang/Throwable
    //   2333	2374	2377	java/lang/Throwable
    //   2351	2385	2385	java/lang/Throwable
    //   2408	2419	2422	java/lang/Throwable
    //   2434	3168	4634	java/lang/Throwable
    //   2524	2538	2538	java/lang/Throwable
    //   2549	2562	2565	java/lang/Throwable
    //   2554	2577	2580	java/lang/Throwable
    //   2569	2595	2598	java/lang/Throwable
    //   2584	2625	2628	java/lang/Throwable
    //   2691	2718	2721	java/lang/Throwable
    //   2708	2736	2739	java/lang/Throwable
    //   2725	2766	2769	java/lang/Throwable
    //   2743	2777	2777	java/lang/Throwable
    //   2800	2811	2814	java/lang/Throwable
    //   2867	2881	2881	java/lang/Throwable
    //   2892	2905	2908	java/lang/Throwable
    //   2897	2920	2923	java/lang/Throwable
    //   2912	2938	2941	java/lang/Throwable
    //   2927	2968	2971	java/lang/Throwable
    //   3034	3061	3064	java/lang/Throwable
    //   3051	3079	3082	java/lang/Throwable
    //   3068	3109	3112	java/lang/Throwable
    //   3086	3120	3120	java/lang/Throwable
    //   3143	3154	3157	java/lang/Throwable
    //   3169	3903	4634	java/lang/Throwable
    //   3259	3273	3273	java/lang/Throwable
    //   3284	3297	3300	java/lang/Throwable
    //   3289	3312	3315	java/lang/Throwable
    //   3304	3330	3333	java/lang/Throwable
    //   3319	3360	3363	java/lang/Throwable
    //   3426	3453	3456	java/lang/Throwable
    //   3443	3471	3474	java/lang/Throwable
    //   3460	3501	3504	java/lang/Throwable
    //   3478	3512	3512	java/lang/Throwable
    //   3535	3546	3549	java/lang/Throwable
    //   3602	3616	3616	java/lang/Throwable
    //   3627	3640	3643	java/lang/Throwable
    //   3632	3655	3658	java/lang/Throwable
    //   3647	3673	3676	java/lang/Throwable
    //   3662	3703	3706	java/lang/Throwable
    //   3769	3796	3799	java/lang/Throwable
    //   3786	3814	3817	java/lang/Throwable
    //   3803	3844	3847	java/lang/Throwable
    //   3821	3855	3855	java/lang/Throwable
    //   3878	3889	3892	java/lang/Throwable
    //   3904	4633	4634	java/lang/Throwable
    //   3994	4008	4008	java/lang/Throwable
    //   4019	4032	4035	java/lang/Throwable
    //   4024	4047	4050	java/lang/Throwable
    //   4039	4065	4068	java/lang/Throwable
    //   4054	4095	4098	java/lang/Throwable
    //   4161	4188	4191	java/lang/Throwable
    //   4178	4206	4209	java/lang/Throwable
    //   4195	4236	4239	java/lang/Throwable
    //   4213	4247	4247	java/lang/Throwable
    //   4270	4281	4284	java/lang/Throwable
    //   4337	4351	4351	java/lang/Throwable
    //   4362	4375	4378	java/lang/Throwable
    //   4367	4390	4393	java/lang/Throwable
    //   4382	4408	4411	java/lang/Throwable
    //   4397	4438	4441	java/lang/Throwable
    //   4504	4531	4534	java/lang/Throwable
    //   4521	4549	4552	java/lang/Throwable
    //   4538	4579	4582	java/lang/Throwable
    //   4556	4590	4590	java/lang/Throwable
    //   4613	4624	4627	java/lang/Throwable
  }
  
  static void ZY(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZW(Object paramObject) {
    Zlsg.Zs = a(-1985, -7055);
    Zlsg.ZD = new BigInteger(a(-2016, -9757));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zrip.Zy.charAt(Math.abs(((BigInteger)Zxp5.ZA).intValue() % 32)) <= Zr17.Zu.charAt(Math.abs(((BigInteger)Zry1.Zf).intValue() % 32))) {
          try {
            Zr1h.Zy(Class.forName(a(-1988, 28128)));
            if (bool)
              Zeud.Zw(Class.forName(a(-2006, 18380))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zeud.Zw(Class.forName(a(-2006, 18380)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'yÄµ#Ø\\rpÀ\\t H»gûe¼ò\\rå\\tÃxâ´2ÿ$áu\\tNqSÛüTá\\t"ÞµÔ*?\\tÅÀ"£*1 K33©ëmk²%\\r\\f°XÅ<Î\\nÔp"û%åü\\tÕ øjv;Ð\\tä)®º¶ YM®3Bú¯Á²i§-%V:/9ù~òÙ¡]óP£Åj"g°ý1ìX2jsø¬k®PºÙí1êTféõ×GÛUnç~Z|Ír\\t²/Ì^÷¢{$\\to w»lìó\\túÅÖz±d¼\\tø)Þº¸ Æ\\tì\\n(«7¦×A`\\t{ õ¿ÐxÍþ\\tóKÅÑNº\\tßVaqBG*ö§\\tfùwQ\ß¾ -âC£\\tÚAtÑ¤6Ñ¶Ô¾M Q;6³+¥ºÞ\\tì)º«e'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #121
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
    //   68: ldc 'ÞØÒÇ)õ\\t°>\\n¥Á&'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #77
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
    //   129: putstatic burp/Zzn6.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzn6.b : [Ljava/lang/String;
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
    //   212: bipush #77
    //   214: goto -> 244
    //   217: bipush #98
    //   219: goto -> 244
    //   222: bipush #57
    //   224: goto -> 244
    //   227: bipush #10
    //   229: goto -> 244
    //   232: bipush #13
    //   234: goto -> 244
    //   237: bipush #90
    //   239: goto -> 244
    //   242: bipush #18
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
    //   311: bipush #106
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #119
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #99
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-99
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #72
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #60
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-28
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-21
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #109
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-20
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #15
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-85
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #13
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #22
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #95
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-30
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-60
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-104
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-6
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #85
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #116
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #84
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-19
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #114
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #105
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-83
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-113
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #9
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #-47
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #-49
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #30
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #68
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zzn6.ZO : Ljava/lang/Object;
    //   501: sipush #-2003
    //   504: sipush #-7248
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zzn6.Za : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF82A) & 0xFFFF;
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
      byte b1 = 50;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzn6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */