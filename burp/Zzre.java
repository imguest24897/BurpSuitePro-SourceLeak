package burp;

import java.math.BigInteger;

class Zzre extends ClassLoader {
  static String Zr;
  
  static Object ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZY(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zkjj.ZT : Ljava/lang/String;
    //   172: getstatic burp/Zmzj.Zm : Ljava/lang/Object;
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
    //   206: getstatic burp/Zzk_.ZX : Ljava/lang/String;
    //   209: getstatic burp/Zsvd.Zk : Ljava/lang/Object;
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
    //   243: getstatic burp/Zv8d.Zi : Ljava/lang/String;
    //   246: getstatic burp/Zspg.ZJ : Ljava/lang/Object;
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
    //   280: getstatic burp/Zk9q.Zk : Ljava/lang/String;
    //   283: getstatic burp/Zs1k.Ze : Ljava/lang/Object;
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
    //   317: getstatic burp/Zssc.ZR : Ljava/lang/String;
    //   320: getstatic burp/Ze4a.ZP : Ljava/lang/Object;
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
    //   354: getstatic burp/Zrp2.ZJ : Ljava/lang/String;
    //   357: getstatic burp/Zzyb.ZV : Ljava/lang/Object;
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
    //   391: getstatic burp/Ztq2.Zt : Ljava/lang/String;
    //   394: getstatic burp/Zkdq.ZG : Ljava/lang/Object;
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
    //   428: getstatic burp/Zt6z.ZL : Ljava/lang/String;
    //   431: getstatic burp/Zbx4.Zw : Ljava/lang/Object;
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
    //   465: getstatic burp/Zka9.ZM : Ljava/lang/String;
    //   468: getstatic burp/Zb2u.ZY : Ljava/lang/Object;
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
    //   502: getstatic burp/Zrov.ZU : Ljava/lang/String;
    //   505: getstatic burp/Zgcg.Zi : Ljava/lang/Object;
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
    //   539: getstatic burp/Zrjw.Zz : Ljava/lang/String;
    //   542: getstatic burp/Zxxh.Za : Ljava/lang/Object;
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
    //   576: getstatic burp/Zld5.ZO : Ljava/lang/String;
    //   579: getstatic burp/Zb9q.ZI : Ljava/lang/Object;
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
    //   613: getstatic burp/Zld9.Zx : Ljava/lang/String;
    //   616: getstatic burp/Ztdl.Zw : Ljava/lang/Object;
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
    //   650: getstatic burp/Zsbo.Zg : Ljava/lang/String;
    //   653: getstatic burp/Zkql.Zl : Ljava/lang/Object;
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
    //   687: getstatic burp/Zzre.Zr : Ljava/lang/String;
    //   690: getstatic burp/Zl_a.ZP : Ljava/lang/Object;
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
    //   724: getstatic burp/Zrye.Za : Ljava/lang/String;
    //   727: getstatic burp/Zz0f.ZL : Ljava/lang/Object;
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
    //   761: getstatic burp/Zv8l.Zo : Ljava/lang/String;
    //   764: getstatic burp/Zlg2.ZO : Ljava/lang/Object;
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
    //   798: getstatic burp/Zbwj.ZP : Ljava/lang/String;
    //   801: getstatic burp/Zgi9.Zc : Ljava/lang/Object;
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
    //   835: getstatic burp/Zz0b.ZD : Ljava/lang/String;
    //   838: getstatic burp/Zx4u.Zn : Ljava/lang/Object;
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
    //   872: getstatic burp/Zej8.ZP : Ljava/lang/String;
    //   875: getstatic burp/Zmli.Zh : Ljava/lang/Object;
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
    //   909: getstatic burp/Zd9.Ze : Ljava/lang/String;
    //   912: getstatic burp/Ze2k.ZK : Ljava/lang/Object;
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
    //   946: getstatic burp/Zrfa.ZT : Ljava/lang/String;
    //   949: getstatic burp/Zso.ZA : Ljava/lang/Object;
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
    //   983: getstatic burp/Zm69.ZE : Ljava/lang/String;
    //   986: getstatic burp/Zejz.ZF : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zsn4.ZZ : Ljava/lang/String;
    //   1023: getstatic burp/Zlab.ZM : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zs4g.ZV : Ljava/lang/String;
    //   1060: getstatic burp/Zmc_.Zj : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zsn3.ZS : Ljava/lang/String;
    //   1097: getstatic burp/Ze1k.ZD : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zkeb.ZW : Ljava/lang/String;
    //   1134: getstatic burp/Zb87.Zb : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zzna.Zi : Ljava/lang/String;
    //   1171: getstatic burp/Zlcc.ZP : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zgeq.ZF : Ljava/lang/String;
    //   1208: getstatic burp/Zz0f.ZL : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zk5k.Zx : Ljava/lang/String;
    //   1245: getstatic burp/Zxp1.ZP : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zg7u.ZA : Ljava/lang/String;
    //   1282: getstatic burp/Zrqe.ZX : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zmf6.Zn : Ljava/lang/String;
    //   1319: getstatic burp/Zb3r.ZI : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zlcc.Zw : Ljava/lang/String;
    //   1362: getstatic burp/Zrd3.ZI : Ljava/lang/Object;
    //   1365: checkcast java/math/BigInteger
    //   1368: invokevirtual toByteArray : ()[B
    //   1371: astore #4
    //   1373: new java/lang/StringBuilder
    //   1376: dup
    //   1377: invokespecial <init> : ()V
    //   1380: astore #6
    //   1382: aload #6
    //   1384: sipush #18890
    //   1387: sipush #-22584
    //   1390: invokestatic a : (II)Ljava/lang/String;
    //   1393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1396: pop
    //   1397: aload #4
    //   1399: astore #7
    //   1401: aload #7
    //   1403: arraylength
    //   1404: istore #8
    //   1406: iconst_0
    //   1407: istore #9
    //   1409: iload #9
    //   1411: iload #8
    //   1413: if_icmpge -> 1439
    //   1416: aload #7
    //   1418: iload #9
    //   1420: baload
    //   1421: istore #10
    //   1423: aload #6
    //   1425: iload #10
    //   1427: i2c
    //   1428: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1431: pop
    //   1432: iinc #9, 1
    //   1435: iload_2
    //   1436: ifne -> 1409
    //   1439: aload #6
    //   1441: sipush #18887
    //   1444: sipush #1701
    //   1447: invokestatic a : (II)Ljava/lang/String;
    //   1450: ldc ''
    //   1452: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1455: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1458: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1461: pop
    //   1462: aload #6
    //   1464: sipush #18886
    //   1467: sipush #-19027
    //   1470: invokestatic a : (II)Ljava/lang/String;
    //   1473: ldc ''
    //   1475: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1478: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1481: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1484: pop
    //   1485: aload #6
    //   1487: invokevirtual toString : ()Ljava/lang/String;
    //   1490: invokevirtual getBytes : ()[B
    //   1493: astore #5
    //   1495: aload #5
    //   1497: astore #4
    //   1499: aload #4
    //   1501: arraylength
    //   1502: bipush #8
    //   1504: iadd
    //   1505: bipush #6
    //   1507: ishr
    //   1508: iconst_1
    //   1509: iadd
    //   1510: bipush #16
    //   1512: imul
    //   1513: newarray int
    //   1515: astore #6
    //   1517: iconst_0
    //   1518: istore #7
    //   1520: iload #7
    //   1522: aload #4
    //   1524: arraylength
    //   1525: if_icmpge -> 1569
    //   1528: aload #4
    //   1530: iload #7
    //   1532: baload
    //   1533: sipush #255
    //   1536: iand
    //   1537: istore #8
    //   1539: aload #6
    //   1541: iload #7
    //   1543: iconst_2
    //   1544: ishr
    //   1545: dup2
    //   1546: iaload
    //   1547: iload #8
    //   1549: bipush #24
    //   1551: iload #7
    //   1553: iconst_4
    //   1554: irem
    //   1555: bipush #8
    //   1557: imul
    //   1558: isub
    //   1559: ishl
    //   1560: ior
    //   1561: iastore
    //   1562: iinc #7, 1
    //   1565: iload_2
    //   1566: ifne -> 1520
    //   1569: aload #6
    //   1571: iload #7
    //   1573: iconst_2
    //   1574: ishr
    //   1575: dup2
    //   1576: iaload
    //   1577: sipush #128
    //   1580: bipush #24
    //   1582: iload #7
    //   1584: iconst_4
    //   1585: irem
    //   1586: bipush #8
    //   1588: imul
    //   1589: isub
    //   1590: ishl
    //   1591: ior
    //   1592: iastore
    //   1593: aload #6
    //   1595: aload #6
    //   1597: arraylength
    //   1598: iconst_1
    //   1599: isub
    //   1600: aload #4
    //   1602: arraylength
    //   1603: bipush #8
    //   1605: imul
    //   1606: iastore
    //   1607: bipush #80
    //   1609: newarray int
    //   1611: astore #8
    //   1613: ldc 1732584193
    //   1615: istore #9
    //   1617: ldc -271733879
    //   1619: istore #10
    //   1621: ldc -1732584194
    //   1623: istore #11
    //   1625: ldc 271733878
    //   1627: istore #12
    //   1629: ldc -1009589776
    //   1631: istore #13
    //   1633: iconst_0
    //   1634: istore #7
    //   1636: iload #7
    //   1638: aload #6
    //   1640: arraylength
    //   1641: if_icmpge -> 1963
    //   1644: iload #9
    //   1646: istore #14
    //   1648: iload #10
    //   1650: istore #15
    //   1652: iload #11
    //   1654: istore #16
    //   1656: iload #12
    //   1658: istore #17
    //   1660: iload #13
    //   1662: istore #18
    //   1664: iconst_0
    //   1665: istore #19
    //   1667: iload #19
    //   1669: bipush #80
    //   1671: if_icmpge -> 1921
    //   1674: iload #19
    //   1676: bipush #16
    //   1678: if_icmpge -> 1705
    //   1681: aload #8
    //   1683: iload #19
    //   1685: aload #6
    //   1687: iload #7
    //   1689: iload #19
    //   1691: iadd
    //   1692: iaload
    //   1693: iastore
    //   1694: iload_2
    //   1695: ifne -> 1760
    //   1698: goto -> 1705
    //   1701: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1704: athrow
    //   1705: aload #8
    //   1707: iload #19
    //   1709: iconst_3
    //   1710: isub
    //   1711: iaload
    //   1712: aload #8
    //   1714: iload #19
    //   1716: bipush #8
    //   1718: isub
    //   1719: iaload
    //   1720: ixor
    //   1721: aload #8
    //   1723: iload #19
    //   1725: bipush #14
    //   1727: isub
    //   1728: iaload
    //   1729: ixor
    //   1730: aload #8
    //   1732: iload #19
    //   1734: bipush #16
    //   1736: isub
    //   1737: iaload
    //   1738: ixor
    //   1739: istore #20
    //   1741: iload #20
    //   1743: iconst_1
    //   1744: ishl
    //   1745: iload #20
    //   1747: bipush #31
    //   1749: iushr
    //   1750: ior
    //   1751: istore #21
    //   1753: aload #8
    //   1755: iload #19
    //   1757: iload #21
    //   1759: iastore
    //   1760: iload #9
    //   1762: iconst_5
    //   1763: ishl
    //   1764: iload #9
    //   1766: bipush #27
    //   1768: iushr
    //   1769: ior
    //   1770: istore #20
    //   1772: iload #20
    //   1774: iload #13
    //   1776: iadd
    //   1777: aload #8
    //   1779: iload #19
    //   1781: iaload
    //   1782: iadd
    //   1783: iload #19
    //   1785: bipush #20
    //   1787: if_icmpge -> 1813
    //   1790: ldc 1518500249
    //   1792: iload #10
    //   1794: iload #11
    //   1796: iand
    //   1797: iload #10
    //   1799: iconst_m1
    //   1800: ixor
    //   1801: iload #12
    //   1803: iand
    //   1804: ior
    //   1805: iadd
    //   1806: goto -> 1883
    //   1809: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1812: athrow
    //   1813: iload #19
    //   1815: bipush #40
    //   1817: if_icmpge -> 1838
    //   1820: ldc 1859775393
    //   1822: iload #10
    //   1824: iload #11
    //   1826: ixor
    //   1827: iload #12
    //   1829: ixor
    //   1830: iadd
    //   1831: goto -> 1883
    //   1834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1837: athrow
    //   1838: iload #19
    //   1840: bipush #60
    //   1842: if_icmpge -> 1872
    //   1845: ldc -1894007588
    //   1847: iload #10
    //   1849: iload #11
    //   1851: iand
    //   1852: iload #10
    //   1854: iload #12
    //   1856: iand
    //   1857: ior
    //   1858: iload #11
    //   1860: iload #12
    //   1862: iand
    //   1863: ior
    //   1864: iadd
    //   1865: goto -> 1883
    //   1868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1871: athrow
    //   1872: ldc -899497514
    //   1874: iload #10
    //   1876: iload #11
    //   1878: ixor
    //   1879: iload #12
    //   1881: ixor
    //   1882: iadd
    //   1883: iadd
    //   1884: istore #21
    //   1886: iload #12
    //   1888: istore #13
    //   1890: iload #11
    //   1892: istore #12
    //   1894: iload #10
    //   1896: bipush #30
    //   1898: ishl
    //   1899: iload #10
    //   1901: iconst_2
    //   1902: iushr
    //   1903: ior
    //   1904: istore #11
    //   1906: iload #9
    //   1908: istore #10
    //   1910: iload #21
    //   1912: istore #9
    //   1914: iinc #19, 1
    //   1917: iload_2
    //   1918: ifne -> 1667
    //   1921: iload #9
    //   1923: iload #14
    //   1925: iadd
    //   1926: istore #9
    //   1928: iload #10
    //   1930: iload #15
    //   1932: iadd
    //   1933: istore #10
    //   1935: iload #11
    //   1937: iload #16
    //   1939: iadd
    //   1940: istore #11
    //   1942: iload #12
    //   1944: iload #17
    //   1946: iadd
    //   1947: istore #12
    //   1949: iload #13
    //   1951: iload #18
    //   1953: iadd
    //   1954: istore #13
    //   1956: iinc #7, 16
    //   1959: iload_2
    //   1960: ifne -> 1636
    //   1963: iconst_5
    //   1964: newarray int
    //   1966: dup
    //   1967: iconst_0
    //   1968: iload #9
    //   1970: iastore
    //   1971: dup
    //   1972: iconst_1
    //   1973: iload #10
    //   1975: iastore
    //   1976: dup
    //   1977: iconst_2
    //   1978: iload #11
    //   1980: iastore
    //   1981: dup
    //   1982: iconst_3
    //   1983: iload #12
    //   1985: iastore
    //   1986: dup
    //   1987: iconst_4
    //   1988: iload #13
    //   1990: iastore
    //   1991: astore #14
    //   1993: bipush #20
    //   1995: newarray byte
    //   1997: astore #15
    //   1999: iconst_0
    //   2000: istore #16
    //   2002: iload #16
    //   2004: bipush #20
    //   2006: if_icmpge -> 2047
    //   2009: aload #14
    //   2011: iload #16
    //   2013: iconst_4
    //   2014: idiv
    //   2015: iaload
    //   2016: istore #17
    //   2018: iconst_3
    //   2019: iload #16
    //   2021: iconst_4
    //   2022: irem
    //   2023: isub
    //   2024: bipush #8
    //   2026: imul
    //   2027: istore #18
    //   2029: aload #15
    //   2031: iload #16
    //   2033: iload #17
    //   2035: iload #18
    //   2037: iushr
    //   2038: i2b
    //   2039: bastore
    //   2040: iinc #16, 1
    //   2043: iload_2
    //   2044: ifne -> 2002
    //   2047: aload #15
    //   2049: astore #5
    //   2051: sipush #18895
    //   2054: getstatic burp/Zrye.Zx : Ljava/lang/Object;
    //   2057: checkcast java/math/BigInteger
    //   2060: getstatic burp/Zmkq.Zg : Ljava/lang/Object;
    //   2063: checkcast java/math/BigInteger
    //   2066: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   2069: putstatic burp/Zbx5.ZL : Ljava/lang/Object;
    //   2072: sipush #2789
    //   2075: invokestatic a : (II)Ljava/lang/String;
    //   2078: iconst_1
    //   2079: ldc burp/Zrm4
    //   2081: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2084: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2087: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2090: astore #4
    //   2092: aload #4
    //   2094: arraylength
    //   2095: istore #5
    //   2097: iconst_0
    //   2098: istore #6
    //   2100: iload #6
    //   2102: iload #5
    //   2104: if_icmpge -> 2242
    //   2107: aload #4
    //   2109: iload #6
    //   2111: aaload
    //   2112: astore #7
    //   2114: aload #7
    //   2116: invokevirtual getModifiers : ()I
    //   2119: invokestatic isStatic : (I)Z
    //   2122: ifne -> 2132
    //   2125: goto -> 2235
    //   2128: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2131: athrow
    //   2132: aload #7
    //   2134: invokevirtual getType : ()Ljava/lang/Class;
    //   2137: astore #8
    //   2139: aload #8
    //   2141: ifnull -> 2222
    //   2144: aload #8
    //   2146: invokevirtual isPrimitive : ()Z
    //   2149: ifne -> 2222
    //   2152: goto -> 2159
    //   2155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2158: athrow
    //   2159: aload #8
    //   2161: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2164: ifnull -> 2222
    //   2167: goto -> 2174
    //   2170: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2173: athrow
    //   2174: aload #8
    //   2176: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2179: invokevirtual getName : ()Ljava/lang/String;
    //   2182: ifnull -> 2222
    //   2185: goto -> 2192
    //   2188: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2191: athrow
    //   2192: aload #8
    //   2194: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2197: invokevirtual getName : ()Ljava/lang/String;
    //   2200: sipush #18888
    //   2203: sipush #30692
    //   2206: invokestatic a : (II)Ljava/lang/String;
    //   2209: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2212: ifne -> 2222
    //   2215: goto -> 2222
    //   2218: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2221: athrow
    //   2222: aload #7
    //   2224: iconst_1
    //   2225: invokevirtual setAccessible : (Z)V
    //   2228: aload #7
    //   2230: aconst_null
    //   2231: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2234: pop
    //   2235: iinc #6, 1
    //   2238: iload_2
    //   2239: ifne -> 2100
    //   2242: sipush #18892
    //   2245: sipush #-27284
    //   2248: invokestatic a : (II)Ljava/lang/String;
    //   2251: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2254: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2257: astore #4
    //   2259: aload #4
    //   2261: arraylength
    //   2262: istore #5
    //   2264: iconst_0
    //   2265: istore #6
    //   2267: iload #6
    //   2269: iload #5
    //   2271: if_icmpge -> 2404
    //   2274: aload #4
    //   2276: iload #6
    //   2278: aaload
    //   2279: astore #7
    //   2281: aload #7
    //   2283: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2286: pop
    //   2287: aload #7
    //   2289: invokevirtual getModifiers : ()I
    //   2292: invokestatic isStatic : (I)Z
    //   2295: ifeq -> 2390
    //   2298: aload #7
    //   2300: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2303: arraylength
    //   2304: iconst_2
    //   2305: if_icmpne -> 2390
    //   2308: goto -> 2315
    //   2311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2314: athrow
    //   2315: aload #7
    //   2317: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2320: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2323: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2326: ifeq -> 2390
    //   2329: goto -> 2336
    //   2332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2335: athrow
    //   2336: aload #7
    //   2338: iconst_1
    //   2339: invokevirtual setAccessible : (Z)V
    //   2342: aload #7
    //   2344: aconst_null
    //   2345: iconst_2
    //   2346: anewarray java/lang/Object
    //   2349: dup
    //   2350: iconst_0
    //   2351: aload_0
    //   2352: aastore
    //   2353: dup
    //   2354: iconst_1
    //   2355: aload_1
    //   2356: ifnonnull -> 2374
    //   2359: goto -> 2366
    //   2362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2365: athrow
    //   2366: aload_1
    //   2367: goto -> 2381
    //   2370: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2373: athrow
    //   2374: aload_1
    //   2375: checkcast [B
    //   2378: invokevirtual clone : ()Ljava/lang/Object;
    //   2381: aastore
    //   2382: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2385: pop
    //   2386: iload_2
    //   2387: ifne -> 2404
    //   2390: iinc #6, 1
    //   2393: iload_2
    //   2394: ifne -> 2267
    //   2397: goto -> 2404
    //   2400: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2403: athrow
    //   2404: getstatic burp/Zsdl.ZJ : Ljava/lang/String;
    //   2407: getstatic burp/Ztvy.ZH : Ljava/lang/Object;
    //   2410: checkcast java/math/BigInteger
    //   2413: invokevirtual intValue : ()I
    //   2416: bipush #32
    //   2418: irem
    //   2419: invokestatic abs : (I)I
    //   2422: invokevirtual charAt : (I)C
    //   2425: getstatic burp/Zvh.ZP : Ljava/lang/String;
    //   2428: getstatic burp/Zz5e.Zl : Ljava/lang/Object;
    //   2431: checkcast java/math/BigInteger
    //   2434: invokevirtual intValue : ()I
    //   2437: bipush #32
    //   2439: irem
    //   2440: invokestatic abs : (I)I
    //   2443: invokevirtual charAt : (I)C
    //   2446: if_icmpgt -> 2561
    //   2449: getstatic burp/Zsdl.ZJ : Ljava/lang/String;
    //   2452: getstatic burp/Zsjw.Zw : Ljava/lang/Object;
    //   2455: checkcast java/math/BigInteger
    //   2458: invokevirtual intValue : ()I
    //   2461: bipush #32
    //   2463: irem
    //   2464: invokestatic abs : (I)I
    //   2467: invokevirtual charAt : (I)C
    //   2470: getstatic burp/Zea.Zj : Ljava/lang/String;
    //   2473: getstatic burp/Ztle.ZP : Ljava/lang/Object;
    //   2476: checkcast java/math/BigInteger
    //   2479: invokevirtual intValue : ()I
    //   2482: bipush #32
    //   2484: irem
    //   2485: invokestatic abs : (I)I
    //   2488: invokevirtual charAt : (I)C
    //   2491: if_icmple -> 2561
    //   2494: goto -> 2501
    //   2497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2500: athrow
    //   2501: getstatic burp/Zz41.Zc : Ljava/lang/String;
    //   2504: getstatic burp/Zx63.ZX : Ljava/lang/Object;
    //   2507: checkcast java/math/BigInteger
    //   2510: invokevirtual intValue : ()I
    //   2513: bipush #32
    //   2515: irem
    //   2516: invokestatic abs : (I)I
    //   2519: invokevirtual charAt : (I)C
    //   2522: getstatic burp/Zmli.Zc : Ljava/lang/String;
    //   2525: getstatic burp/Ze2w.ZA : Ljava/lang/Object;
    //   2528: checkcast java/math/BigInteger
    //   2531: invokevirtual intValue : ()I
    //   2534: bipush #32
    //   2536: irem
    //   2537: invokestatic abs : (I)I
    //   2540: invokevirtual charAt : (I)C
    //   2543: if_icmple -> 2561
    //   2546: goto -> 2553
    //   2549: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2552: athrow
    //   2553: iconst_1
    //   2554: goto -> 2562
    //   2557: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2560: athrow
    //   2561: iconst_0
    //   2562: ireturn
    //   2563: astore_3
    //   2564: new java/lang/Exception
    //   2567: dup
    //   2568: aload_3
    //   2569: invokevirtual getMessage : ()Ljava/lang/String;
    //   2572: invokespecial <init> : (Ljava/lang/String;)V
    //   2575: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2562	2563	java/lang/Throwable
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
    //   1674	1698	1701	java/lang/Throwable
    //   1772	1809	1809	java/lang/Throwable
    //   1813	1834	1834	java/lang/Throwable
    //   1838	1868	1868	java/lang/Throwable
    //   2114	2128	2128	java/lang/Throwable
    //   2139	2152	2155	java/lang/Throwable
    //   2144	2167	2170	java/lang/Throwable
    //   2159	2185	2188	java/lang/Throwable
    //   2174	2215	2218	java/lang/Throwable
    //   2281	2308	2311	java/lang/Throwable
    //   2298	2329	2332	java/lang/Throwable
    //   2315	2359	2362	java/lang/Throwable
    //   2336	2370	2370	java/lang/Throwable
    //   2381	2397	2400	java/lang/Throwable
    //   2404	2494	2497	java/lang/Throwable
    //   2449	2546	2549	java/lang/Throwable
    //   2501	2557	2557	java/lang/Throwable
  }
  
  static void ZP(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZY(Object paramObject) {
    Zb2u.ZM = a(18884, -13460);
    Zb2u.ZY = new BigInteger(a(18894, -17298));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zrt3.Zu.charAt(Math.abs(((BigInteger)Zea8.ZF).intValue() % 32)) <= Zkhf.Zb.charAt(Math.abs(((BigInteger)Zewr.Zw).intValue() % 32))) {
          try {
            Zlum.Zk(Class.forName(a(18893, 4474)));
            if (!bool)
              Zlw8.Zk(Class.forName(a(18889, -15873))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlw8.Zk(Class.forName(a(18889, -15873)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'b\\nOâOcRúZR(VÖbÍ\\rT=8óþòù'ç´æxÔ×iì×¼£CF?ï­ùjo8²¼{ªèÁü©b´w/e³×·ÖZ+\\td),É\\t6kfQ\\tuÞQÿxQ¾n 91d°dççtÝ\Ê{@$mÍ©Va¤íìW²³ñ ¥Qü¨  èòRï\\n²S¼cÉ*k^Ä;ÕËEG$å{s\\tn2kÒ\\tÛÀfìî&0'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #58
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
    //   68: ldc 'NS ²Ú %õÕ÷b¬¹ú IkT w;Óo8xÐKÞoC'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #100
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
    //   129: putstatic burp/Zzre.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzre.b : [Ljava/lang/String;
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
    //   212: bipush #76
    //   214: goto -> 244
    //   217: bipush #105
    //   219: goto -> 244
    //   222: bipush #87
    //   224: goto -> 244
    //   227: bipush #52
    //   229: goto -> 244
    //   232: bipush #80
    //   234: goto -> 244
    //   237: bipush #37
    //   239: goto -> 244
    //   242: bipush #70
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
    //   300: sipush #18891
    //   303: sipush #32119
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zzre.Zr : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #51
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #91
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #6
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-10
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-89
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-111
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #18
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #-69
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #44
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-73
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-96
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #30
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-67
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #-7
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-42
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-81
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #17
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #10
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #11
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-16
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #-49
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-108
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #106
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-86
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #45
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #51
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #-41
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #109
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #-64
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #61
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #60
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #28
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zzre.ZE : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x49CE) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzre.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */