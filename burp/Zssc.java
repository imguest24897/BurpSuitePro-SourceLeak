package burp;

import java.math.BigInteger;

class Zssc extends ClassLoader {
  static Object Zr;
  
  static String ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zs(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zbsz.Zu : Ljava/lang/String;
    //   172: getstatic burp/Zz4a.ZB : Ljava/lang/Object;
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
    //   206: getstatic burp/Zrex.Za : Ljava/lang/String;
    //   209: getstatic burp/Zs0h.ZU : Ljava/lang/Object;
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
    //   243: getstatic burp/Zku9.Zl : Ljava/lang/String;
    //   246: getstatic burp/Zk5k.Zr : Ljava/lang/Object;
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
    //   280: getstatic burp/Zreu.ZI : Ljava/lang/String;
    //   283: getstatic burp/Zzts.Zp : Ljava/lang/Object;
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
    //   317: getstatic burp/Zkeb.ZW : Ljava/lang/String;
    //   320: getstatic burp/Zs1k.Ze : Ljava/lang/Object;
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
    //   354: getstatic burp/Zt85.ZR : Ljava/lang/String;
    //   357: getstatic burp/Ztdl.Zw : Ljava/lang/Object;
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
    //   391: getstatic burp/Zlc2.Zz : Ljava/lang/String;
    //   394: getstatic burp/Zmui.Zz : Ljava/lang/Object;
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
    //   428: getstatic burp/Znu.ZF : Ljava/lang/String;
    //   431: getstatic burp/Zg1l.Zg : Ljava/lang/Object;
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
    //   465: getstatic burp/Znu.ZF : Ljava/lang/String;
    //   468: getstatic burp/Zos.ZB : Ljava/lang/Object;
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
    //   502: getstatic burp/Zzts.Zk : Ljava/lang/String;
    //   505: getstatic burp/Zzht.Zb : Ljava/lang/Object;
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
    //   539: getstatic burp/Zz3b.Zi : Ljava/lang/String;
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
    //   565: ifeq -> 1348
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   574: athrow
    //   575: aload_3
    //   576: getstatic burp/Zgeq.ZF : Ljava/lang/String;
    //   579: getstatic burp/Zgis.ZV : Ljava/lang/Object;
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
    //   613: getstatic burp/Zk8f.ZV : Ljava/lang/String;
    //   616: getstatic burp/Zk8f.ZG : Ljava/lang/Object;
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
    //   650: getstatic burp/Zeub.ZT : Ljava/lang/String;
    //   653: getstatic burp/Zzah.Za : Ljava/lang/Object;
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
    //   687: getstatic burp/Zz0b.ZD : Ljava/lang/String;
    //   690: getstatic burp/Zg61.Zp : Ljava/lang/Object;
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
    //   724: getstatic burp/Zxn9.ZU : Ljava/lang/String;
    //   727: getstatic burp/Zt4p.Zh : Ljava/lang/Object;
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
    //   761: getstatic burp/Zl3j.Zr : Ljava/lang/String;
    //   764: getstatic burp/Zb_1.ZK : Ljava/lang/Object;
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
    //   798: getstatic burp/Zz5e.Zd : Ljava/lang/String;
    //   801: getstatic burp/Zgsb.Zl : Ljava/lang/Object;
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
    //   835: getstatic burp/Zg61.ZX : Ljava/lang/String;
    //   838: getstatic burp/Zr14.Zy : Ljava/lang/Object;
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
    //   872: getstatic burp/Zm83.Zq : Ljava/lang/String;
    //   875: getstatic burp/Ztr5.ZZ : Ljava/lang/Object;
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
    //   909: getstatic burp/Zgk9.Zf : Ljava/lang/String;
    //   912: getstatic burp/Zzi_.Zf : Ljava/lang/Object;
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
    //   946: getstatic burp/Zos.Za : Ljava/lang/String;
    //   949: getstatic burp/Zrn4.Zq : Ljava/lang/Object;
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
    //   983: getstatic burp/Zzac.ZE : Ljava/lang/String;
    //   986: getstatic burp/Zsfg.Zm : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zx4u.ZL : Ljava/lang/String;
    //   1023: getstatic burp/Zrkd.ZO : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zeig.Zg : Ljava/lang/String;
    //   1060: getstatic burp/Ztwp.Ze : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zsn9.Zp : Ljava/lang/String;
    //   1097: getstatic burp/Zt7x.ZE : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zxxo.ZH : Ljava/lang/String;
    //   1134: getstatic burp/Ze84.Zj : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zz4m.ZI : Ljava/lang/String;
    //   1171: getstatic burp/Zttd.Zi : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zk8f.ZV : Ljava/lang/String;
    //   1208: getstatic burp/Zzts.Zp : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zb2u.ZM : Ljava/lang/String;
    //   1245: getstatic burp/Zspg.ZJ : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zrn4.ZY : Ljava/lang/String;
    //   1282: getstatic burp/Zes.Zx : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zz4m.ZI : Ljava/lang/String;
    //   1319: getstatic burp/Zrym.Zk : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zmn0.Zk : Ljava/lang/String;
    //   1362: sipush #-4632
    //   1365: getstatic burp/Zxn9.ZN : Ljava/lang/Object;
    //   1368: checkcast java/math/BigInteger
    //   1371: getstatic burp/Zr1h.Z_ : Ljava/lang/Object;
    //   1374: checkcast java/math/BigInteger
    //   1377: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1380: putstatic burp/Zbjx.ZT : Ljava/lang/Object;
    //   1383: sipush #-13196
    //   1386: invokestatic a : (II)Ljava/lang/String;
    //   1389: iconst_1
    //   1390: ldc burp/Zbli
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
    //   1511: sipush #-4639
    //   1514: sipush #-32188
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
    //   1553: sipush #-4628
    //   1556: sipush #20546
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
    //   1715: getstatic burp/Zz4j.Zu : Ljava/lang/Object;
    //   1718: checkcast java/math/BigInteger
    //   1721: invokevirtual intValue : ()I
    //   1724: i2l
    //   1725: invokestatic currentTimeMillis : ()J
    //   1728: ladd
    //   1729: getstatic burp/Zz3b.Zu : Ljava/lang/Object;
    //   1732: checkcast java/math/BigInteger
    //   1735: invokevirtual intValue : ()I
    //   1738: i2l
    //   1739: lcmp
    //   1740: ifge -> 2078
    //   1743: sipush #-4636
    //   1746: sipush #24745
    //   1749: invokestatic a : (II)Ljava/lang/String;
    //   1752: iconst_1
    //   1753: ldc burp/Zr14
    //   1755: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1758: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1761: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1764: astore #4
    //   1766: aload #4
    //   1768: arraylength
    //   1769: istore #5
    //   1771: iconst_0
    //   1772: istore #6
    //   1774: iload #6
    //   1776: iload #5
    //   1778: if_icmpge -> 1916
    //   1781: aload #4
    //   1783: iload #6
    //   1785: aaload
    //   1786: astore #7
    //   1788: aload #7
    //   1790: invokevirtual getModifiers : ()I
    //   1793: invokestatic isStatic : (I)Z
    //   1796: ifne -> 1806
    //   1799: goto -> 1909
    //   1802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1805: athrow
    //   1806: aload #7
    //   1808: invokevirtual getType : ()Ljava/lang/Class;
    //   1811: astore #8
    //   1813: aload #8
    //   1815: ifnull -> 1896
    //   1818: aload #8
    //   1820: invokevirtual isPrimitive : ()Z
    //   1823: ifne -> 1896
    //   1826: goto -> 1833
    //   1829: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1832: athrow
    //   1833: aload #8
    //   1835: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1838: ifnull -> 1896
    //   1841: goto -> 1848
    //   1844: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1847: athrow
    //   1848: aload #8
    //   1850: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1853: invokevirtual getName : ()Ljava/lang/String;
    //   1856: ifnull -> 1896
    //   1859: goto -> 1866
    //   1862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1865: athrow
    //   1866: aload #8
    //   1868: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1871: invokevirtual getName : ()Ljava/lang/String;
    //   1874: sipush #-4638
    //   1877: sipush #31643
    //   1880: invokestatic a : (II)Ljava/lang/String;
    //   1883: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1886: ifne -> 1896
    //   1889: goto -> 1896
    //   1892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1895: athrow
    //   1896: aload #7
    //   1898: iconst_1
    //   1899: invokevirtual setAccessible : (Z)V
    //   1902: aload #7
    //   1904: aconst_null
    //   1905: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1908: pop
    //   1909: iinc #6, 1
    //   1912: iload_2
    //   1913: ifeq -> 1774
    //   1916: sipush #-4630
    //   1919: sipush #7992
    //   1922: invokestatic a : (II)Ljava/lang/String;
    //   1925: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1928: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1931: astore #4
    //   1933: aload #4
    //   1935: arraylength
    //   1936: istore #5
    //   1938: iconst_0
    //   1939: istore #6
    //   1941: iload #6
    //   1943: iload #5
    //   1945: if_icmpge -> 2078
    //   1948: aload #4
    //   1950: iload #6
    //   1952: aaload
    //   1953: astore #7
    //   1955: aload #7
    //   1957: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1960: pop
    //   1961: aload #7
    //   1963: invokevirtual getModifiers : ()I
    //   1966: invokestatic isStatic : (I)Z
    //   1969: ifeq -> 2064
    //   1972: aload #7
    //   1974: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1977: arraylength
    //   1978: iconst_2
    //   1979: if_icmpne -> 2064
    //   1982: goto -> 1989
    //   1985: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1988: athrow
    //   1989: aload #7
    //   1991: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1994: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1997: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2000: ifeq -> 2064
    //   2003: goto -> 2010
    //   2006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2009: athrow
    //   2010: aload #7
    //   2012: iconst_1
    //   2013: invokevirtual setAccessible : (Z)V
    //   2016: aload #7
    //   2018: aconst_null
    //   2019: iconst_2
    //   2020: anewarray java/lang/Object
    //   2023: dup
    //   2024: iconst_0
    //   2025: aload_0
    //   2026: aastore
    //   2027: dup
    //   2028: iconst_1
    //   2029: aload_1
    //   2030: ifnonnull -> 2048
    //   2033: goto -> 2040
    //   2036: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2039: athrow
    //   2040: aload_1
    //   2041: goto -> 2055
    //   2044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2047: athrow
    //   2048: aload_1
    //   2049: checkcast [B
    //   2052: invokevirtual clone : ()Ljava/lang/Object;
    //   2055: aastore
    //   2056: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2059: pop
    //   2060: iload_2
    //   2061: ifeq -> 2078
    //   2064: iinc #6, 1
    //   2067: iload_2
    //   2068: ifeq -> 1941
    //   2071: goto -> 2078
    //   2074: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2077: athrow
    //   2078: new java/io/ByteArrayOutputStream
    //   2081: dup
    //   2082: invokespecial <init> : ()V
    //   2085: astore #4
    //   2087: sipush #-4627
    //   2090: aload #4
    //   2092: sipush #202
    //   2095: invokevirtual write : (I)V
    //   2098: sipush #-20400
    //   2101: aload #4
    //   2103: sipush #254
    //   2106: invokevirtual write : (I)V
    //   2109: aload #4
    //   2111: sipush #186
    //   2114: invokevirtual write : (I)V
    //   2117: aload #4
    //   2119: sipush #190
    //   2122: invokevirtual write : (I)V
    //   2125: aload #4
    //   2127: iconst_0
    //   2128: invokevirtual write : (I)V
    //   2131: aload #4
    //   2133: iconst_1
    //   2134: invokevirtual write : (I)V
    //   2137: aload #4
    //   2139: iconst_0
    //   2140: invokevirtual write : (I)V
    //   2143: aload #4
    //   2145: bipush #50
    //   2147: invokevirtual write : (I)V
    //   2150: aload #4
    //   2152: getstatic burp/Zs5k.Zg : Ljava/lang/Object;
    //   2155: checkcast java/math/BigInteger
    //   2158: invokevirtual toByteArray : ()[B
    //   2161: invokevirtual write : ([B)V
    //   2164: aload #4
    //   2166: getstatic burp/Zl3j.ZY : Ljava/lang/Object;
    //   2169: checkcast java/math/BigInteger
    //   2172: invokevirtual toByteArray : ()[B
    //   2175: invokevirtual write : ([B)V
    //   2178: aload #4
    //   2180: getstatic burp/Zsk2.ZD : Ljava/lang/Object;
    //   2183: checkcast java/math/BigInteger
    //   2186: invokevirtual toByteArray : ()[B
    //   2189: invokevirtual write : ([B)V
    //   2192: aload #4
    //   2194: invokevirtual toByteArray : ()[B
    //   2197: astore #5
    //   2199: aconst_null
    //   2200: astore #6
    //   2202: invokestatic a : (II)Ljava/lang/String;
    //   2205: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2208: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2211: astore #7
    //   2213: aload #7
    //   2215: arraylength
    //   2216: istore #8
    //   2218: iconst_0
    //   2219: istore #9
    //   2221: iload #9
    //   2223: iload #8
    //   2225: if_icmpge -> 2353
    //   2228: aload #7
    //   2230: iload #9
    //   2232: aaload
    //   2233: astore #10
    //   2235: aload #10
    //   2237: invokevirtual getName : ()Ljava/lang/String;
    //   2240: sipush #-4640
    //   2243: sipush #1437
    //   2246: invokestatic a : (II)Ljava/lang/String;
    //   2249: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2252: ifeq -> 2346
    //   2255: aload #10
    //   2257: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2260: astore #11
    //   2262: aload #11
    //   2264: arraylength
    //   2265: iconst_4
    //   2266: if_icmpeq -> 2276
    //   2269: goto -> 2346
    //   2272: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2275: athrow
    //   2276: aload #11
    //   2278: iconst_0
    //   2279: aaload
    //   2280: ldc java/lang/String
    //   2282: if_acmpeq -> 2292
    //   2285: goto -> 2346
    //   2288: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2291: athrow
    //   2292: aload #11
    //   2294: iconst_1
    //   2295: aaload
    //   2296: ldc [B
    //   2298: if_acmpeq -> 2308
    //   2301: goto -> 2346
    //   2304: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2307: athrow
    //   2308: aload #11
    //   2310: iconst_2
    //   2311: aaload
    //   2312: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   2315: if_acmpeq -> 2325
    //   2318: goto -> 2346
    //   2321: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2324: athrow
    //   2325: aload #11
    //   2327: iconst_3
    //   2328: aaload
    //   2329: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   2332: if_acmpeq -> 2342
    //   2335: goto -> 2346
    //   2338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2341: athrow
    //   2342: aload #10
    //   2344: astore #6
    //   2346: iinc #9, 1
    //   2349: iload_2
    //   2350: ifeq -> 2221
    //   2353: aload #6
    //   2355: iconst_1
    //   2356: invokevirtual setAccessible : (Z)V
    //   2359: ldc burp/Zzxs
    //   2361: iconst_0
    //   2362: anewarray java/lang/Class
    //   2365: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   2368: astore #7
    //   2370: aload #7
    //   2372: iconst_1
    //   2373: invokevirtual setAccessible : (Z)V
    //   2376: aload #6
    //   2378: aload #7
    //   2380: iconst_0
    //   2381: anewarray java/lang/Object
    //   2384: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   2387: iconst_4
    //   2388: anewarray java/lang/Object
    //   2391: dup
    //   2392: iconst_0
    //   2393: sipush #-4631
    //   2396: sipush #-20461
    //   2399: invokestatic a : (II)Ljava/lang/String;
    //   2402: aastore
    //   2403: dup
    //   2404: iconst_1
    //   2405: aload #5
    //   2407: aastore
    //   2408: dup
    //   2409: iconst_2
    //   2410: iconst_0
    //   2411: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2414: aastore
    //   2415: dup
    //   2416: iconst_3
    //   2417: aload #5
    //   2419: arraylength
    //   2420: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2423: aastore
    //   2424: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2427: pop
    //   2428: goto -> 2433
    //   2431: astore #4
    //   2433: getstatic burp/Zlbd.Zq : Ljava/lang/String;
    //   2436: getstatic burp/Zegj.ZT : Ljava/lang/Object;
    //   2439: checkcast java/math/BigInteger
    //   2442: invokevirtual intValue : ()I
    //   2445: bipush #32
    //   2447: irem
    //   2448: invokestatic abs : (I)I
    //   2451: invokevirtual charAt : (I)C
    //   2454: getstatic burp/Zrkd.ZL : Ljava/lang/String;
    //   2457: getstatic burp/Zmh3.ZF : Ljava/lang/Object;
    //   2460: checkcast java/math/BigInteger
    //   2463: invokevirtual intValue : ()I
    //   2466: bipush #32
    //   2468: irem
    //   2469: invokestatic abs : (I)I
    //   2472: invokevirtual charAt : (I)C
    //   2475: if_icmpgt -> 2590
    //   2478: getstatic burp/Ze2k.ZY : Ljava/lang/String;
    //   2481: getstatic burp/Zgis.ZV : Ljava/lang/Object;
    //   2484: checkcast java/math/BigInteger
    //   2487: invokevirtual intValue : ()I
    //   2490: bipush #32
    //   2492: irem
    //   2493: invokestatic abs : (I)I
    //   2496: invokevirtual charAt : (I)C
    //   2499: getstatic burp/Zkhf.Zb : Ljava/lang/String;
    //   2502: getstatic burp/Zmt_.Zl : Ljava/lang/Object;
    //   2505: checkcast java/math/BigInteger
    //   2508: invokevirtual intValue : ()I
    //   2511: bipush #32
    //   2513: irem
    //   2514: invokestatic abs : (I)I
    //   2517: invokevirtual charAt : (I)C
    //   2520: if_icmple -> 2590
    //   2523: goto -> 2530
    //   2526: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2529: athrow
    //   2530: getstatic burp/Zb0q.Zr : Ljava/lang/String;
    //   2533: getstatic burp/Zlwm.Ze : Ljava/lang/Object;
    //   2536: checkcast java/math/BigInteger
    //   2539: invokevirtual intValue : ()I
    //   2542: bipush #32
    //   2544: irem
    //   2545: invokestatic abs : (I)I
    //   2548: invokevirtual charAt : (I)C
    //   2551: getstatic burp/Zsn3.ZS : Ljava/lang/String;
    //   2554: getstatic burp/Zrjq.ZU : Ljava/lang/Object;
    //   2557: checkcast java/math/BigInteger
    //   2560: invokevirtual intValue : ()I
    //   2563: bipush #32
    //   2565: irem
    //   2566: invokestatic abs : (I)I
    //   2569: invokevirtual charAt : (I)C
    //   2572: if_icmple -> 2590
    //   2575: goto -> 2582
    //   2578: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2581: athrow
    //   2582: iconst_1
    //   2583: goto -> 2591
    //   2586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2589: athrow
    //   2590: iconst_0
    //   2591: ireturn
    //   2592: astore_3
    //   2593: new java/lang/Exception
    //   2596: dup
    //   2597: aload_3
    //   2598: invokevirtual getMessage : ()Ljava/lang/String;
    //   2601: invokespecial <init> : (Ljava/lang/String;)V
    //   2604: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2591	2592	java/lang/Throwable
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
    //   1788	1802	1802	java/lang/Throwable
    //   1813	1826	1829	java/lang/Throwable
    //   1818	1841	1844	java/lang/Throwable
    //   1833	1859	1862	java/lang/Throwable
    //   1848	1889	1892	java/lang/Throwable
    //   1955	1982	1985	java/lang/Throwable
    //   1972	2003	2006	java/lang/Throwable
    //   1989	2033	2036	java/lang/Throwable
    //   2010	2044	2044	java/lang/Throwable
    //   2055	2071	2074	java/lang/Throwable
    //   2078	2428	2431	java/lang/Throwable
    //   2262	2272	2272	java/lang/Throwable
    //   2276	2288	2288	java/lang/Throwable
    //   2292	2304	2304	java/lang/Throwable
    //   2308	2321	2321	java/lang/Throwable
    //   2325	2338	2338	java/lang/Throwable
    //   2433	2523	2526	java/lang/Throwable
    //   2478	2575	2578	java/lang/Throwable
    //   2530	2586	2586	java/lang/Throwable
  }
  
  static void ZX(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zk(Object paramObject) {
    Zgtd.Zj = a(-4629, 2096);
    Zgtd.Zo = new BigInteger(a(-4635, -26963));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Ze8j.ZU.charAt(Math.abs(((BigInteger)Zzyb.ZV).intValue() % 32)) > Zti7.Zc.charAt(Math.abs(((BigInteger)Zkdq.ZG).intValue() % 32))) {
          try {
            Zbl4.ZH(Class.forName(a(-4626, -720)));
            if (bool)
              Zt7w.Zt(Class.forName(a(-4625, -17016))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zt7w.Zt(Class.forName(a(-4625, -17016)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ov4ë\\bØ\\t=åØ ÝÚaQ>\\f5iTC´®}<(b e5¤ÎkªkÜ0\\t´ë£ Q=E³M¬f­þô"@ ¶¤ú~úÔK\\t÷ÓË§\Ýïëy\\tøù*â`uwõ\\td¥¹i2½MtNö.\\b6-Úråµô @­Í¾¼ÝW¾¼¨¯%5Aä§\\týù­Z¡¯Ú&o,Á²$r±'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #107
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
    //   68: ldc ']FÁÒ]²®5¾¯Ó3ÇøzX/M»lò5§ADL ³Í°¼(RäôZà4z>.±eOGõ1)¤)îÍû Õº)0\{\\tþz_óÿR'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #53
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
    //   129: putstatic burp/Zssc.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zssc.b : [Ljava/lang/String;
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
    //   212: bipush #120
    //   214: goto -> 244
    //   217: bipush #89
    //   219: goto -> 244
    //   222: bipush #96
    //   224: goto -> 244
    //   227: bipush #91
    //   229: goto -> 244
    //   232: bipush #61
    //   234: goto -> 244
    //   237: bipush #96
    //   239: goto -> 244
    //   242: bipush #93
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
    //   311: bipush #40
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-84
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #122
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-79
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-92
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #123
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #29
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-71
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-92
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-20
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #126
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-15
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-116
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #25
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #75
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #112
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-117
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-59
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #85
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-11
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #92
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #51
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-61
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #12
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #90
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-21
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-115
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #15
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #-91
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #45
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #79
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-47
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zssc.Zr : Ljava/lang/Object;
    //   501: sipush #-4637
    //   504: sipush #18121
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zssc.ZR : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEDE9) & 0xFFFF;
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
      char c = 'Ý';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zssc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */