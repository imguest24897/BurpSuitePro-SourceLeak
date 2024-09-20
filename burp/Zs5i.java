package burp;

import java.math.BigInteger;

class Zs5i extends ClassLoader {
  static Object ZD;
  
  static String ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zn(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zs5k.ZI : Ljava/lang/String;
    //   172: getstatic burp/Zlfi.ZV : Ljava/lang/Object;
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
    //   206: getstatic burp/Zluk.ZW : Ljava/lang/String;
    //   209: getstatic burp/Zlqy.ZP : Ljava/lang/Object;
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
    //   243: getstatic burp/Zgii.Ze : Ljava/lang/String;
    //   246: getstatic burp/Zgcg.Zi : Ljava/lang/Object;
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
    //   283: getstatic burp/Ze5f.Zh : Ljava/lang/Object;
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
    //   317: getstatic burp/Zedz.Zh : Ljava/lang/String;
    //   320: getstatic burp/Zxzd.ZD : Ljava/lang/Object;
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
    //   354: getstatic burp/Zg8v.Zd : Ljava/lang/String;
    //   357: getstatic burp/Zbzc.Zp : Ljava/lang/Object;
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
    //   391: getstatic burp/Ztp.ZG : Ljava/lang/String;
    //   394: getstatic burp/Ztnw.Zt : Ljava/lang/Object;
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
    //   428: getstatic burp/Zm5p.ZX : Ljava/lang/String;
    //   431: getstatic burp/Zxyq.ZQ : Ljava/lang/Object;
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
    //   465: getstatic burp/Zti7.Zc : Ljava/lang/String;
    //   468: getstatic burp/Zmli.Zh : Ljava/lang/Object;
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
    //   502: getstatic burp/Ztfh.ZU : Ljava/lang/String;
    //   505: getstatic burp/Zkf9.ZX : Ljava/lang/Object;
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
    //   539: getstatic burp/Zgnp.ZL : Ljava/lang/String;
    //   542: getstatic burp/Zlw8.ZA : Ljava/lang/Object;
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
    //   576: getstatic burp/Zrf9.ZV : Ljava/lang/String;
    //   579: getstatic burp/Zrd3.ZI : Ljava/lang/Object;
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
    //   613: getstatic burp/Zgd7.Zs : Ljava/lang/String;
    //   616: getstatic burp/Ztq2.Zj : Ljava/lang/Object;
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
    //   650: getstatic burp/Zzr5.Zg : Ljava/lang/String;
    //   653: getstatic burp/Zmtr.Zv : Ljava/lang/Object;
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
    //   687: getstatic burp/Zmhx.ZD : Ljava/lang/String;
    //   690: getstatic burp/Zewo.ZZ : Ljava/lang/Object;
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
    //   724: getstatic burp/Zx58.Zs : Ljava/lang/String;
    //   727: getstatic burp/Zeu2.ZW : Ljava/lang/Object;
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
    //   761: getstatic burp/Zldt.Zj : Ljava/lang/String;
    //   764: getstatic burp/Zts_.ZH : Ljava/lang/Object;
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
    //   798: getstatic burp/Zer.Zp : Ljava/lang/String;
    //   801: getstatic burp/Zbf9.ZC : Ljava/lang/Object;
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
    //   835: getstatic burp/Zbz_.ZW : Ljava/lang/String;
    //   838: getstatic burp/Zzb2.ZW : Ljava/lang/Object;
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
    //   872: getstatic burp/Zlc5.Z_ : Ljava/lang/String;
    //   875: getstatic burp/Zlot.ZJ : Ljava/lang/Object;
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
    //   909: getstatic burp/Zlw8.Zs : Ljava/lang/String;
    //   912: getstatic burp/Zl1q.Zh : Ljava/lang/Object;
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
    //   946: getstatic burp/Zmzh.Zm : Ljava/lang/String;
    //   949: getstatic burp/Zeqr.ZM : Ljava/lang/Object;
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
    //   983: getstatic burp/Zm0s.Zm : Ljava/lang/String;
    //   986: getstatic burp/Zb14.ZT : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zsfj.Zg : Ljava/lang/String;
    //   1023: getstatic burp/Ze3j.Ze : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zb2p.ZV : Ljava/lang/String;
    //   1060: getstatic burp/Ze7y.Zh : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zeuz.Zb : Ljava/lang/String;
    //   1097: getstatic burp/Zlg1.ZH : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zkde.Zb : Ljava/lang/String;
    //   1134: getstatic burp/Zgw0.ZM : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zl7k.ZX : Ljava/lang/String;
    //   1171: getstatic burp/Zge1.ZK : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zzri.ZL : Ljava/lang/String;
    //   1208: getstatic burp/Zgb9.Zb : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zz0j.Zf : Ljava/lang/String;
    //   1245: getstatic burp/Zvof.Zl : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zb8y.Zn : Ljava/lang/String;
    //   1282: getstatic burp/Zeu2.ZW : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zbow.Zr : Ljava/lang/String;
    //   1319: getstatic burp/Ze6t.Zu : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zmfw.ZV : Ljava/lang/String;
    //   1362: getstatic burp/Zllw.ZW : Ljava/lang/Object;
    //   1365: checkcast java/math/BigInteger
    //   1368: getstatic burp/Zm__.Zz : Ljava/lang/Object;
    //   1371: checkcast java/math/BigInteger
    //   1374: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1377: putstatic burp/Zxdh.ZD : Ljava/lang/Object;
    //   1380: getstatic burp/Zzoc.Zx : Ljava/lang/Object;
    //   1383: checkcast java/math/BigInteger
    //   1386: invokevirtual toByteArray : ()[B
    //   1389: astore #4
    //   1391: aload #4
    //   1393: arraylength
    //   1394: iconst_2
    //   1395: iadd
    //   1396: newarray byte
    //   1398: astore #6
    //   1400: iconst_0
    //   1401: istore #7
    //   1403: iload #7
    //   1405: aload #4
    //   1407: arraylength
    //   1408: if_icmpge -> 1428
    //   1411: aload #6
    //   1413: iload #7
    //   1415: aload #4
    //   1417: iload #7
    //   1419: baload
    //   1420: bastore
    //   1421: iinc #7, 1
    //   1424: iload_2
    //   1425: ifeq -> 1403
    //   1428: aload #6
    //   1430: arraylength
    //   1431: iconst_3
    //   1432: idiv
    //   1433: iconst_4
    //   1434: imul
    //   1435: newarray byte
    //   1437: astore #5
    //   1439: iconst_0
    //   1440: istore #7
    //   1442: iconst_0
    //   1443: istore #8
    //   1445: iload #7
    //   1447: aload #4
    //   1449: arraylength
    //   1450: if_icmpge -> 1561
    //   1453: aload #5
    //   1455: iload #8
    //   1457: aload #6
    //   1459: iload #7
    //   1461: baload
    //   1462: iconst_2
    //   1463: iushr
    //   1464: bipush #63
    //   1466: iand
    //   1467: i2b
    //   1468: bastore
    //   1469: aload #5
    //   1471: iload #8
    //   1473: iconst_1
    //   1474: iadd
    //   1475: aload #6
    //   1477: iload #7
    //   1479: iconst_1
    //   1480: iadd
    //   1481: baload
    //   1482: iconst_4
    //   1483: iushr
    //   1484: bipush #15
    //   1486: iand
    //   1487: aload #6
    //   1489: iload #7
    //   1491: baload
    //   1492: iconst_4
    //   1493: ishl
    //   1494: bipush #63
    //   1496: iand
    //   1497: ior
    //   1498: i2b
    //   1499: bastore
    //   1500: aload #5
    //   1502: iload #8
    //   1504: iconst_2
    //   1505: iadd
    //   1506: aload #6
    //   1508: iload #7
    //   1510: iconst_2
    //   1511: iadd
    //   1512: baload
    //   1513: bipush #6
    //   1515: iushr
    //   1516: iconst_3
    //   1517: iand
    //   1518: aload #6
    //   1520: iload #7
    //   1522: iconst_1
    //   1523: iadd
    //   1524: baload
    //   1525: iconst_2
    //   1526: ishl
    //   1527: bipush #63
    //   1529: iand
    //   1530: ior
    //   1531: i2b
    //   1532: bastore
    //   1533: aload #5
    //   1535: iload #8
    //   1537: iconst_3
    //   1538: iadd
    //   1539: aload #6
    //   1541: iload #7
    //   1543: iconst_2
    //   1544: iadd
    //   1545: baload
    //   1546: bipush #63
    //   1548: iand
    //   1549: i2b
    //   1550: bastore
    //   1551: iinc #7, 3
    //   1554: iinc #8, 4
    //   1557: iload_2
    //   1558: ifeq -> 1445
    //   1561: iconst_0
    //   1562: istore #7
    //   1564: iload #7
    //   1566: aload #5
    //   1568: arraylength
    //   1569: if_icmpge -> 1753
    //   1572: aload #5
    //   1574: iload #7
    //   1576: baload
    //   1577: bipush #26
    //   1579: if_icmpge -> 1607
    //   1582: aload #5
    //   1584: iload #7
    //   1586: aload #5
    //   1588: iload #7
    //   1590: baload
    //   1591: bipush #65
    //   1593: iadd
    //   1594: i2b
    //   1595: bastore
    //   1596: iload_2
    //   1597: ifeq -> 1746
    //   1600: goto -> 1607
    //   1603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1606: athrow
    //   1607: aload #5
    //   1609: iload #7
    //   1611: baload
    //   1612: bipush #52
    //   1614: if_icmpge -> 1652
    //   1617: goto -> 1624
    //   1620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1623: athrow
    //   1624: aload #5
    //   1626: iload #7
    //   1628: aload #5
    //   1630: iload #7
    //   1632: baload
    //   1633: bipush #97
    //   1635: iadd
    //   1636: bipush #26
    //   1638: isub
    //   1639: i2b
    //   1640: bastore
    //   1641: iload_2
    //   1642: ifeq -> 1746
    //   1645: goto -> 1652
    //   1648: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1651: athrow
    //   1652: aload #5
    //   1654: iload #7
    //   1656: baload
    //   1657: bipush #62
    //   1659: if_icmpge -> 1697
    //   1662: goto -> 1669
    //   1665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1668: athrow
    //   1669: aload #5
    //   1671: iload #7
    //   1673: aload #5
    //   1675: iload #7
    //   1677: baload
    //   1678: bipush #48
    //   1680: iadd
    //   1681: bipush #52
    //   1683: isub
    //   1684: i2b
    //   1685: bastore
    //   1686: iload_2
    //   1687: ifeq -> 1746
    //   1690: goto -> 1697
    //   1693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1696: athrow
    //   1697: aload #5
    //   1699: iload #7
    //   1701: baload
    //   1702: bipush #63
    //   1704: if_icmpge -> 1732
    //   1707: goto -> 1714
    //   1710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1713: athrow
    //   1714: aload #5
    //   1716: iload #7
    //   1718: bipush #43
    //   1720: bastore
    //   1721: iload_2
    //   1722: ifeq -> 1746
    //   1725: goto -> 1732
    //   1728: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1731: athrow
    //   1732: aload #5
    //   1734: iload #7
    //   1736: bipush #47
    //   1738: bastore
    //   1739: goto -> 1746
    //   1742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1745: athrow
    //   1746: iinc #7, 1
    //   1749: iload_2
    //   1750: ifeq -> 1564
    //   1753: aload #5
    //   1755: arraylength
    //   1756: iconst_1
    //   1757: isub
    //   1758: istore #7
    //   1760: iload #7
    //   1762: aload #4
    //   1764: arraylength
    //   1765: iconst_4
    //   1766: imul
    //   1767: iconst_3
    //   1768: idiv
    //   1769: if_icmple -> 1786
    //   1772: aload #5
    //   1774: iload #7
    //   1776: bipush #61
    //   1778: bastore
    //   1779: iinc #7, -1
    //   1782: iload_2
    //   1783: ifeq -> 1760
    //   1786: new java/math/BigInteger
    //   1789: dup
    //   1790: aload #5
    //   1792: invokespecial <init> : ([B)V
    //   1795: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1798: putstatic burp/Zzhu.ZW : Ljava/lang/Object;
    //   1801: sipush #-8251
    //   1804: sipush #-14175
    //   1807: invokestatic a : (II)Ljava/lang/String;
    //   1810: iconst_1
    //   1811: ldc burp/Zl4v
    //   1813: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1816: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1819: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1822: astore #4
    //   1824: aload #4
    //   1826: arraylength
    //   1827: istore #5
    //   1829: iconst_0
    //   1830: istore #6
    //   1832: iload #6
    //   1834: iload #5
    //   1836: if_icmpge -> 1974
    //   1839: aload #4
    //   1841: iload #6
    //   1843: aaload
    //   1844: astore #7
    //   1846: aload #7
    //   1848: invokevirtual getModifiers : ()I
    //   1851: invokestatic isStatic : (I)Z
    //   1854: ifne -> 1864
    //   1857: goto -> 1967
    //   1860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1863: athrow
    //   1864: aload #7
    //   1866: invokevirtual getType : ()Ljava/lang/Class;
    //   1869: astore #8
    //   1871: aload #8
    //   1873: ifnull -> 1954
    //   1876: aload #8
    //   1878: invokevirtual isPrimitive : ()Z
    //   1881: ifne -> 1954
    //   1884: goto -> 1891
    //   1887: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1890: athrow
    //   1891: aload #8
    //   1893: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1896: ifnull -> 1954
    //   1899: goto -> 1906
    //   1902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1905: athrow
    //   1906: aload #8
    //   1908: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1911: invokevirtual getName : ()Ljava/lang/String;
    //   1914: ifnull -> 1954
    //   1917: goto -> 1924
    //   1920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1923: athrow
    //   1924: aload #8
    //   1926: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1929: invokevirtual getName : ()Ljava/lang/String;
    //   1932: sipush #-8242
    //   1935: sipush #12810
    //   1938: invokestatic a : (II)Ljava/lang/String;
    //   1941: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1944: ifne -> 1954
    //   1947: goto -> 1954
    //   1950: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1953: athrow
    //   1954: aload #7
    //   1956: iconst_1
    //   1957: invokevirtual setAccessible : (Z)V
    //   1960: aload #7
    //   1962: aconst_null
    //   1963: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1966: pop
    //   1967: iinc #6, 1
    //   1970: iload_2
    //   1971: ifeq -> 1832
    //   1974: sipush #-8253
    //   1977: sipush #13197
    //   1980: invokestatic a : (II)Ljava/lang/String;
    //   1983: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1986: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1989: astore #4
    //   1991: aload #4
    //   1993: arraylength
    //   1994: istore #5
    //   1996: iconst_0
    //   1997: istore #6
    //   1999: iload #6
    //   2001: iload #5
    //   2003: if_icmpge -> 2115
    //   2006: aload #4
    //   2008: iload #6
    //   2010: aaload
    //   2011: astore #7
    //   2013: aload #7
    //   2015: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2018: pop
    //   2019: aload #7
    //   2021: invokevirtual getModifiers : ()I
    //   2024: invokestatic isStatic : (I)Z
    //   2027: ifeq -> 2101
    //   2030: aload #7
    //   2032: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2035: arraylength
    //   2036: iconst_2
    //   2037: if_icmpne -> 2101
    //   2040: goto -> 2047
    //   2043: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2046: athrow
    //   2047: aload #7
    //   2049: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2052: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2055: if_acmpne -> 2101
    //   2058: goto -> 2065
    //   2061: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2064: athrow
    //   2065: aload #7
    //   2067: iconst_1
    //   2068: invokevirtual setAccessible : (Z)V
    //   2071: aload #7
    //   2073: aconst_null
    //   2074: iconst_2
    //   2075: anewarray java/lang/Object
    //   2078: dup
    //   2079: iconst_0
    //   2080: aload_0
    //   2081: aastore
    //   2082: dup
    //   2083: iconst_1
    //   2084: aload_1
    //   2085: aastore
    //   2086: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2089: pop
    //   2090: iload_2
    //   2091: ifeq -> 2115
    //   2094: goto -> 2101
    //   2097: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2100: athrow
    //   2101: iinc #6, 1
    //   2104: iload_2
    //   2105: ifeq -> 1999
    //   2108: goto -> 2115
    //   2111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2114: athrow
    //   2115: sipush #-8256
    //   2118: sipush #27169
    //   2121: invokestatic a : (II)Ljava/lang/String;
    //   2124: iconst_1
    //   2125: ldc burp/Zxn7
    //   2127: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2130: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2133: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2136: astore #4
    //   2138: aload #4
    //   2140: arraylength
    //   2141: istore #5
    //   2143: iconst_0
    //   2144: istore #6
    //   2146: iload #6
    //   2148: iload #5
    //   2150: if_icmpge -> 2288
    //   2153: aload #4
    //   2155: iload #6
    //   2157: aaload
    //   2158: astore #7
    //   2160: aload #7
    //   2162: invokevirtual getModifiers : ()I
    //   2165: invokestatic isStatic : (I)Z
    //   2168: ifne -> 2178
    //   2171: goto -> 2281
    //   2174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2177: athrow
    //   2178: aload #7
    //   2180: invokevirtual getType : ()Ljava/lang/Class;
    //   2183: astore #8
    //   2185: aload #8
    //   2187: ifnull -> 2268
    //   2190: aload #8
    //   2192: invokevirtual isPrimitive : ()Z
    //   2195: ifne -> 2268
    //   2198: goto -> 2205
    //   2201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2204: athrow
    //   2205: aload #8
    //   2207: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2210: ifnull -> 2268
    //   2213: goto -> 2220
    //   2216: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2219: athrow
    //   2220: aload #8
    //   2222: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2225: invokevirtual getName : ()Ljava/lang/String;
    //   2228: ifnull -> 2268
    //   2231: goto -> 2238
    //   2234: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2237: athrow
    //   2238: aload #8
    //   2240: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2243: invokevirtual getName : ()Ljava/lang/String;
    //   2246: sipush #-8238
    //   2249: sipush #-7946
    //   2252: invokestatic a : (II)Ljava/lang/String;
    //   2255: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2258: ifne -> 2268
    //   2261: goto -> 2268
    //   2264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2267: athrow
    //   2268: aload #7
    //   2270: iconst_1
    //   2271: invokevirtual setAccessible : (Z)V
    //   2274: aload #7
    //   2276: aconst_null
    //   2277: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2280: pop
    //   2281: iinc #6, 1
    //   2284: iload_2
    //   2285: ifeq -> 2146
    //   2288: sipush #-8243
    //   2291: sipush #-5897
    //   2294: invokestatic a : (II)Ljava/lang/String;
    //   2297: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2300: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2303: astore #4
    //   2305: aload #4
    //   2307: arraylength
    //   2308: istore #5
    //   2310: iconst_0
    //   2311: istore #6
    //   2313: iload #6
    //   2315: iload #5
    //   2317: if_icmpge -> 2450
    //   2320: aload #4
    //   2322: iload #6
    //   2324: aaload
    //   2325: astore #7
    //   2327: aload #7
    //   2329: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2332: pop
    //   2333: aload #7
    //   2335: invokevirtual getModifiers : ()I
    //   2338: invokestatic isStatic : (I)Z
    //   2341: ifeq -> 2436
    //   2344: aload #7
    //   2346: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2349: arraylength
    //   2350: iconst_2
    //   2351: if_icmpne -> 2436
    //   2354: goto -> 2361
    //   2357: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2360: athrow
    //   2361: aload #7
    //   2363: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2366: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2369: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2372: ifeq -> 2436
    //   2375: goto -> 2382
    //   2378: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2381: athrow
    //   2382: aload #7
    //   2384: iconst_1
    //   2385: invokevirtual setAccessible : (Z)V
    //   2388: aload #7
    //   2390: aconst_null
    //   2391: iconst_2
    //   2392: anewarray java/lang/Object
    //   2395: dup
    //   2396: iconst_0
    //   2397: aload_0
    //   2398: aastore
    //   2399: dup
    //   2400: iconst_1
    //   2401: aload_1
    //   2402: ifnonnull -> 2420
    //   2405: goto -> 2412
    //   2408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2411: athrow
    //   2412: aload_1
    //   2413: goto -> 2427
    //   2416: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2419: athrow
    //   2420: aload_1
    //   2421: checkcast [B
    //   2424: invokevirtual clone : ()Ljava/lang/Object;
    //   2427: aastore
    //   2428: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2431: pop
    //   2432: iload_2
    //   2433: ifeq -> 2450
    //   2436: iinc #6, 1
    //   2439: iload_2
    //   2440: ifeq -> 2313
    //   2443: goto -> 2450
    //   2446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2449: athrow
    //   2450: iconst_0
    //   2451: istore #4
    //   2453: getstatic burp/Zenq.ZG : Ljava/lang/String;
    //   2456: getstatic burp/Zlzs.ZL : Ljava/lang/Object;
    //   2459: checkcast java/math/BigInteger
    //   2462: invokevirtual intValue : ()I
    //   2465: bipush #32
    //   2467: irem
    //   2468: invokestatic abs : (I)I
    //   2471: invokevirtual charAt : (I)C
    //   2474: getstatic burp/Zecm.Zv : Ljava/lang/String;
    //   2477: getstatic burp/Zr9j.Zw : Ljava/lang/Object;
    //   2480: checkcast java/math/BigInteger
    //   2483: invokevirtual intValue : ()I
    //   2486: bipush #32
    //   2488: irem
    //   2489: invokestatic abs : (I)I
    //   2492: invokevirtual charAt : (I)C
    //   2495: if_icmple -> 2840
    //   2498: sipush #-8239
    //   2501: sipush #26862
    //   2504: invokestatic a : (II)Ljava/lang/String;
    //   2507: iconst_1
    //   2508: ldc burp/Zz80
    //   2510: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2513: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2516: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2519: astore #5
    //   2521: aload #5
    //   2523: arraylength
    //   2524: istore #6
    //   2526: iconst_0
    //   2527: istore #7
    //   2529: iload #7
    //   2531: iload #6
    //   2533: if_icmpge -> 2671
    //   2536: aload #5
    //   2538: iload #7
    //   2540: aaload
    //   2541: astore #8
    //   2543: aload #8
    //   2545: invokevirtual getModifiers : ()I
    //   2548: invokestatic isStatic : (I)Z
    //   2551: ifne -> 2561
    //   2554: goto -> 2664
    //   2557: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2560: athrow
    //   2561: aload #8
    //   2563: invokevirtual getType : ()Ljava/lang/Class;
    //   2566: astore #9
    //   2568: aload #9
    //   2570: ifnull -> 2651
    //   2573: aload #9
    //   2575: invokevirtual isPrimitive : ()Z
    //   2578: ifne -> 2651
    //   2581: goto -> 2588
    //   2584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2587: athrow
    //   2588: aload #9
    //   2590: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2593: ifnull -> 2651
    //   2596: goto -> 2603
    //   2599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2602: athrow
    //   2603: aload #9
    //   2605: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2608: invokevirtual getName : ()Ljava/lang/String;
    //   2611: ifnull -> 2651
    //   2614: goto -> 2621
    //   2617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2620: athrow
    //   2621: aload #9
    //   2623: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2626: invokevirtual getName : ()Ljava/lang/String;
    //   2629: sipush #-8238
    //   2632: sipush #-7946
    //   2635: invokestatic a : (II)Ljava/lang/String;
    //   2638: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2641: ifne -> 2651
    //   2644: goto -> 2651
    //   2647: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2650: athrow
    //   2651: aload #8
    //   2653: iconst_1
    //   2654: invokevirtual setAccessible : (Z)V
    //   2657: aload #8
    //   2659: aconst_null
    //   2660: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2663: pop
    //   2664: iinc #7, 1
    //   2667: iload_2
    //   2668: ifeq -> 2529
    //   2671: sipush #-8234
    //   2674: sipush #-5044
    //   2677: invokestatic a : (II)Ljava/lang/String;
    //   2680: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2683: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2686: astore #5
    //   2688: aload #5
    //   2690: arraylength
    //   2691: istore #6
    //   2693: iconst_0
    //   2694: istore #7
    //   2696: iload #7
    //   2698: iload #6
    //   2700: if_icmpge -> 2837
    //   2703: aload #5
    //   2705: iload #7
    //   2707: aaload
    //   2708: astore #8
    //   2710: aload #8
    //   2712: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2715: pop
    //   2716: aload #8
    //   2718: invokevirtual getModifiers : ()I
    //   2721: invokestatic isStatic : (I)Z
    //   2724: ifeq -> 2823
    //   2727: aload #8
    //   2729: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2732: arraylength
    //   2733: iconst_2
    //   2734: if_icmpne -> 2823
    //   2737: goto -> 2744
    //   2740: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2743: athrow
    //   2744: aload #8
    //   2746: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2749: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2752: if_acmpne -> 2823
    //   2755: goto -> 2762
    //   2758: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2761: athrow
    //   2762: aload #8
    //   2764: iconst_1
    //   2765: invokevirtual setAccessible : (Z)V
    //   2768: aload #8
    //   2770: aconst_null
    //   2771: iconst_2
    //   2772: anewarray java/lang/Object
    //   2775: dup
    //   2776: iconst_0
    //   2777: aload_0
    //   2778: aastore
    //   2779: dup
    //   2780: iconst_1
    //   2781: aload_1
    //   2782: ifnonnull -> 2800
    //   2785: goto -> 2792
    //   2788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2791: athrow
    //   2792: aload_1
    //   2793: goto -> 2807
    //   2796: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2799: athrow
    //   2800: aload_1
    //   2801: checkcast [B
    //   2804: invokevirtual clone : ()Ljava/lang/Object;
    //   2807: aastore
    //   2808: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2811: checkcast java/lang/Boolean
    //   2814: invokevirtual booleanValue : ()Z
    //   2817: istore #4
    //   2819: iload_2
    //   2820: ifeq -> 2837
    //   2823: iinc #7, 1
    //   2826: iload_2
    //   2827: ifeq -> 2696
    //   2830: goto -> 2837
    //   2833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2836: athrow
    //   2837: goto -> 3179
    //   2840: sipush #-8255
    //   2843: sipush #-3501
    //   2846: invokestatic a : (II)Ljava/lang/String;
    //   2849: iconst_1
    //   2850: ldc burp/Zl1q
    //   2852: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2855: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2858: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2861: astore #5
    //   2863: aload #5
    //   2865: arraylength
    //   2866: istore #6
    //   2868: iconst_0
    //   2869: istore #7
    //   2871: iload #7
    //   2873: iload #6
    //   2875: if_icmpge -> 3013
    //   2878: aload #5
    //   2880: iload #7
    //   2882: aaload
    //   2883: astore #8
    //   2885: aload #8
    //   2887: invokevirtual getModifiers : ()I
    //   2890: invokestatic isStatic : (I)Z
    //   2893: ifne -> 2903
    //   2896: goto -> 3006
    //   2899: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2902: athrow
    //   2903: aload #8
    //   2905: invokevirtual getType : ()Ljava/lang/Class;
    //   2908: astore #9
    //   2910: aload #9
    //   2912: ifnull -> 2993
    //   2915: aload #9
    //   2917: invokevirtual isPrimitive : ()Z
    //   2920: ifne -> 2993
    //   2923: goto -> 2930
    //   2926: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2929: athrow
    //   2930: aload #9
    //   2932: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2935: ifnull -> 2993
    //   2938: goto -> 2945
    //   2941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2944: athrow
    //   2945: aload #9
    //   2947: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2950: invokevirtual getName : ()Ljava/lang/String;
    //   2953: ifnull -> 2993
    //   2956: goto -> 2963
    //   2959: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2962: athrow
    //   2963: aload #9
    //   2965: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2968: invokevirtual getName : ()Ljava/lang/String;
    //   2971: sipush #-8238
    //   2974: sipush #-7946
    //   2977: invokestatic a : (II)Ljava/lang/String;
    //   2980: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2983: ifne -> 2993
    //   2986: goto -> 2993
    //   2989: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2992: athrow
    //   2993: aload #8
    //   2995: iconst_1
    //   2996: invokevirtual setAccessible : (Z)V
    //   2999: aload #8
    //   3001: aconst_null
    //   3002: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3005: pop
    //   3006: iinc #7, 1
    //   3009: iload_2
    //   3010: ifeq -> 2871
    //   3013: sipush #-8241
    //   3016: sipush #-8329
    //   3019: invokestatic a : (II)Ljava/lang/String;
    //   3022: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3025: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3028: astore #5
    //   3030: aload #5
    //   3032: arraylength
    //   3033: istore #6
    //   3035: iconst_0
    //   3036: istore #7
    //   3038: iload #7
    //   3040: iload #6
    //   3042: if_icmpge -> 3179
    //   3045: aload #5
    //   3047: iload #7
    //   3049: aaload
    //   3050: astore #8
    //   3052: aload #8
    //   3054: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3057: pop
    //   3058: aload #8
    //   3060: invokevirtual getModifiers : ()I
    //   3063: invokestatic isStatic : (I)Z
    //   3066: ifeq -> 3165
    //   3069: aload #8
    //   3071: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3074: arraylength
    //   3075: iconst_2
    //   3076: if_icmpne -> 3165
    //   3079: goto -> 3086
    //   3082: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3085: athrow
    //   3086: aload #8
    //   3088: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3091: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3094: if_acmpne -> 3165
    //   3097: goto -> 3104
    //   3100: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3103: athrow
    //   3104: aload #8
    //   3106: iconst_1
    //   3107: invokevirtual setAccessible : (Z)V
    //   3110: aload #8
    //   3112: aconst_null
    //   3113: iconst_2
    //   3114: anewarray java/lang/Object
    //   3117: dup
    //   3118: iconst_0
    //   3119: aload_0
    //   3120: aastore
    //   3121: dup
    //   3122: iconst_1
    //   3123: aload_1
    //   3124: ifnonnull -> 3142
    //   3127: goto -> 3134
    //   3130: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3133: athrow
    //   3134: aload_1
    //   3135: goto -> 3149
    //   3138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3141: athrow
    //   3142: aload_1
    //   3143: checkcast [B
    //   3146: invokevirtual clone : ()Ljava/lang/Object;
    //   3149: aastore
    //   3150: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3153: checkcast java/lang/Boolean
    //   3156: invokevirtual booleanValue : ()Z
    //   3159: istore #4
    //   3161: iload_2
    //   3162: ifeq -> 3179
    //   3165: iinc #7, 1
    //   3168: iload_2
    //   3169: ifeq -> 3038
    //   3172: goto -> 3179
    //   3175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3178: athrow
    //   3179: iload #4
    //   3181: ifeq -> 3187
    //   3184: iload #4
    //   3186: ireturn
    //   3187: getstatic burp/Zgr1.Za : Ljava/lang/String;
    //   3190: getstatic burp/Zeqw.ZV : Ljava/lang/Object;
    //   3193: checkcast java/math/BigInteger
    //   3196: invokevirtual intValue : ()I
    //   3199: bipush #32
    //   3201: irem
    //   3202: invokestatic abs : (I)I
    //   3205: invokevirtual charAt : (I)C
    //   3208: getstatic burp/Zro_.Zz : Ljava/lang/String;
    //   3211: getstatic burp/Zbsc.ZA : Ljava/lang/Object;
    //   3214: checkcast java/math/BigInteger
    //   3217: invokevirtual intValue : ()I
    //   3220: bipush #32
    //   3222: irem
    //   3223: invokestatic abs : (I)I
    //   3226: invokevirtual charAt : (I)C
    //   3229: if_icmpgt -> 3575
    //   3232: sipush #-8254
    //   3235: sipush #-21509
    //   3238: invokestatic a : (II)Ljava/lang/String;
    //   3241: iconst_1
    //   3242: ldc burp/Zl1z
    //   3244: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3247: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3250: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3253: astore #5
    //   3255: aload #5
    //   3257: arraylength
    //   3258: istore #6
    //   3260: iconst_0
    //   3261: istore #7
    //   3263: iload #7
    //   3265: iload #6
    //   3267: if_icmpge -> 3405
    //   3270: aload #5
    //   3272: iload #7
    //   3274: aaload
    //   3275: astore #8
    //   3277: aload #8
    //   3279: invokevirtual getModifiers : ()I
    //   3282: invokestatic isStatic : (I)Z
    //   3285: ifne -> 3295
    //   3288: goto -> 3398
    //   3291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3294: athrow
    //   3295: aload #8
    //   3297: invokevirtual getType : ()Ljava/lang/Class;
    //   3300: astore #9
    //   3302: aload #9
    //   3304: ifnull -> 3385
    //   3307: aload #9
    //   3309: invokevirtual isPrimitive : ()Z
    //   3312: ifne -> 3385
    //   3315: goto -> 3322
    //   3318: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3321: athrow
    //   3322: aload #9
    //   3324: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3327: ifnull -> 3385
    //   3330: goto -> 3337
    //   3333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3336: athrow
    //   3337: aload #9
    //   3339: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3342: invokevirtual getName : ()Ljava/lang/String;
    //   3345: ifnull -> 3385
    //   3348: goto -> 3355
    //   3351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3354: athrow
    //   3355: aload #9
    //   3357: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3360: invokevirtual getName : ()Ljava/lang/String;
    //   3363: sipush #-8238
    //   3366: sipush #-7946
    //   3369: invokestatic a : (II)Ljava/lang/String;
    //   3372: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3375: ifne -> 3385
    //   3378: goto -> 3385
    //   3381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3384: athrow
    //   3385: aload #8
    //   3387: iconst_1
    //   3388: invokevirtual setAccessible : (Z)V
    //   3391: aload #8
    //   3393: aconst_null
    //   3394: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3397: pop
    //   3398: iinc #7, 1
    //   3401: iload_2
    //   3402: ifeq -> 3263
    //   3405: sipush #-8244
    //   3408: sipush #-22924
    //   3411: invokestatic a : (II)Ljava/lang/String;
    //   3414: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3417: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3420: astore #5
    //   3422: aload #5
    //   3424: arraylength
    //   3425: istore #6
    //   3427: iconst_0
    //   3428: istore #7
    //   3430: iload #7
    //   3432: iload #6
    //   3434: if_icmpge -> 3571
    //   3437: aload #5
    //   3439: iload #7
    //   3441: aaload
    //   3442: astore #8
    //   3444: aload #8
    //   3446: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3449: pop
    //   3450: aload #8
    //   3452: invokevirtual getModifiers : ()I
    //   3455: invokestatic isStatic : (I)Z
    //   3458: ifeq -> 3557
    //   3461: aload #8
    //   3463: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3466: arraylength
    //   3467: iconst_2
    //   3468: if_icmpne -> 3557
    //   3471: goto -> 3478
    //   3474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3477: athrow
    //   3478: aload #8
    //   3480: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3483: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3486: if_acmpne -> 3557
    //   3489: goto -> 3496
    //   3492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3495: athrow
    //   3496: aload #8
    //   3498: iconst_1
    //   3499: invokevirtual setAccessible : (Z)V
    //   3502: aload #8
    //   3504: aconst_null
    //   3505: iconst_2
    //   3506: anewarray java/lang/Object
    //   3509: dup
    //   3510: iconst_0
    //   3511: aload_0
    //   3512: aastore
    //   3513: dup
    //   3514: iconst_1
    //   3515: aload_1
    //   3516: ifnonnull -> 3534
    //   3519: goto -> 3526
    //   3522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3525: athrow
    //   3526: aload_1
    //   3527: goto -> 3541
    //   3530: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3533: athrow
    //   3534: aload_1
    //   3535: checkcast [B
    //   3538: invokevirtual clone : ()Ljava/lang/Object;
    //   3541: aastore
    //   3542: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3545: checkcast java/lang/Boolean
    //   3548: invokevirtual booleanValue : ()Z
    //   3551: istore #4
    //   3553: iload_2
    //   3554: ifeq -> 3571
    //   3557: iinc #7, 1
    //   3560: iload_2
    //   3561: ifeq -> 3430
    //   3564: goto -> 3571
    //   3567: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3570: athrow
    //   3571: iload_2
    //   3572: ifeq -> 3914
    //   3575: sipush #-8235
    //   3578: sipush #16821
    //   3581: invokestatic a : (II)Ljava/lang/String;
    //   3584: iconst_1
    //   3585: ldc burp/Zre1
    //   3587: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3590: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3593: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3596: astore #5
    //   3598: aload #5
    //   3600: arraylength
    //   3601: istore #6
    //   3603: iconst_0
    //   3604: istore #7
    //   3606: iload #7
    //   3608: iload #6
    //   3610: if_icmpge -> 3748
    //   3613: aload #5
    //   3615: iload #7
    //   3617: aaload
    //   3618: astore #8
    //   3620: aload #8
    //   3622: invokevirtual getModifiers : ()I
    //   3625: invokestatic isStatic : (I)Z
    //   3628: ifne -> 3638
    //   3631: goto -> 3741
    //   3634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3637: athrow
    //   3638: aload #8
    //   3640: invokevirtual getType : ()Ljava/lang/Class;
    //   3643: astore #9
    //   3645: aload #9
    //   3647: ifnull -> 3728
    //   3650: aload #9
    //   3652: invokevirtual isPrimitive : ()Z
    //   3655: ifne -> 3728
    //   3658: goto -> 3665
    //   3661: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3664: athrow
    //   3665: aload #9
    //   3667: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3670: ifnull -> 3728
    //   3673: goto -> 3680
    //   3676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3679: athrow
    //   3680: aload #9
    //   3682: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3685: invokevirtual getName : ()Ljava/lang/String;
    //   3688: ifnull -> 3728
    //   3691: goto -> 3698
    //   3694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3697: athrow
    //   3698: aload #9
    //   3700: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3703: invokevirtual getName : ()Ljava/lang/String;
    //   3706: sipush #-8238
    //   3709: sipush #-7946
    //   3712: invokestatic a : (II)Ljava/lang/String;
    //   3715: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3718: ifne -> 3728
    //   3721: goto -> 3728
    //   3724: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3727: athrow
    //   3728: aload #8
    //   3730: iconst_1
    //   3731: invokevirtual setAccessible : (Z)V
    //   3734: aload #8
    //   3736: aconst_null
    //   3737: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3740: pop
    //   3741: iinc #7, 1
    //   3744: iload_2
    //   3745: ifeq -> 3606
    //   3748: sipush #-8249
    //   3751: sipush #1798
    //   3754: invokestatic a : (II)Ljava/lang/String;
    //   3757: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3760: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3763: astore #5
    //   3765: aload #5
    //   3767: arraylength
    //   3768: istore #6
    //   3770: iconst_0
    //   3771: istore #7
    //   3773: iload #7
    //   3775: iload #6
    //   3777: if_icmpge -> 3914
    //   3780: aload #5
    //   3782: iload #7
    //   3784: aaload
    //   3785: astore #8
    //   3787: aload #8
    //   3789: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3792: pop
    //   3793: aload #8
    //   3795: invokevirtual getModifiers : ()I
    //   3798: invokestatic isStatic : (I)Z
    //   3801: ifeq -> 3900
    //   3804: aload #8
    //   3806: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3809: arraylength
    //   3810: iconst_2
    //   3811: if_icmpne -> 3900
    //   3814: goto -> 3821
    //   3817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3820: athrow
    //   3821: aload #8
    //   3823: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3826: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3829: if_acmpne -> 3900
    //   3832: goto -> 3839
    //   3835: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3838: athrow
    //   3839: aload #8
    //   3841: iconst_1
    //   3842: invokevirtual setAccessible : (Z)V
    //   3845: aload #8
    //   3847: aconst_null
    //   3848: iconst_2
    //   3849: anewarray java/lang/Object
    //   3852: dup
    //   3853: iconst_0
    //   3854: aload_0
    //   3855: aastore
    //   3856: dup
    //   3857: iconst_1
    //   3858: aload_1
    //   3859: ifnonnull -> 3877
    //   3862: goto -> 3869
    //   3865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3868: athrow
    //   3869: aload_1
    //   3870: goto -> 3884
    //   3873: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3876: athrow
    //   3877: aload_1
    //   3878: checkcast [B
    //   3881: invokevirtual clone : ()Ljava/lang/Object;
    //   3884: aastore
    //   3885: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3888: checkcast java/lang/Boolean
    //   3891: invokevirtual booleanValue : ()Z
    //   3894: istore #4
    //   3896: iload_2
    //   3897: ifeq -> 3914
    //   3900: iinc #7, 1
    //   3903: iload_2
    //   3904: ifeq -> 3773
    //   3907: goto -> 3914
    //   3910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3913: athrow
    //   3914: iload #4
    //   3916: ifeq -> 3922
    //   3919: iload #4
    //   3921: ireturn
    //   3922: getstatic burp/Zzh9.ZF : Ljava/lang/String;
    //   3925: getstatic burp/Zml2.Zo : Ljava/lang/Object;
    //   3928: checkcast java/math/BigInteger
    //   3931: invokevirtual intValue : ()I
    //   3934: bipush #32
    //   3936: irem
    //   3937: invokestatic abs : (I)I
    //   3940: invokevirtual charAt : (I)C
    //   3943: getstatic burp/Zr8r.Zn : Ljava/lang/String;
    //   3946: getstatic burp/Zspk.ZF : Ljava/lang/Object;
    //   3949: checkcast java/math/BigInteger
    //   3952: invokevirtual intValue : ()I
    //   3955: bipush #32
    //   3957: irem
    //   3958: invokestatic abs : (I)I
    //   3961: invokevirtual charAt : (I)C
    //   3964: if_icmpgt -> 4310
    //   3967: sipush #-8233
    //   3970: sipush #7859
    //   3973: invokestatic a : (II)Ljava/lang/String;
    //   3976: iconst_1
    //   3977: ldc burp/Zehi
    //   3979: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3982: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3985: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3988: astore #5
    //   3990: aload #5
    //   3992: arraylength
    //   3993: istore #6
    //   3995: iconst_0
    //   3996: istore #7
    //   3998: iload #7
    //   4000: iload #6
    //   4002: if_icmpge -> 4140
    //   4005: aload #5
    //   4007: iload #7
    //   4009: aaload
    //   4010: astore #8
    //   4012: aload #8
    //   4014: invokevirtual getModifiers : ()I
    //   4017: invokestatic isStatic : (I)Z
    //   4020: ifne -> 4030
    //   4023: goto -> 4133
    //   4026: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4029: athrow
    //   4030: aload #8
    //   4032: invokevirtual getType : ()Ljava/lang/Class;
    //   4035: astore #9
    //   4037: aload #9
    //   4039: ifnull -> 4120
    //   4042: aload #9
    //   4044: invokevirtual isPrimitive : ()Z
    //   4047: ifne -> 4120
    //   4050: goto -> 4057
    //   4053: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4056: athrow
    //   4057: aload #9
    //   4059: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4062: ifnull -> 4120
    //   4065: goto -> 4072
    //   4068: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4071: athrow
    //   4072: aload #9
    //   4074: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4077: invokevirtual getName : ()Ljava/lang/String;
    //   4080: ifnull -> 4120
    //   4083: goto -> 4090
    //   4086: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4089: athrow
    //   4090: aload #9
    //   4092: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4095: invokevirtual getName : ()Ljava/lang/String;
    //   4098: sipush #-8238
    //   4101: sipush #-7946
    //   4104: invokestatic a : (II)Ljava/lang/String;
    //   4107: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4110: ifne -> 4120
    //   4113: goto -> 4120
    //   4116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4119: athrow
    //   4120: aload #8
    //   4122: iconst_1
    //   4123: invokevirtual setAccessible : (Z)V
    //   4126: aload #8
    //   4128: aconst_null
    //   4129: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4132: pop
    //   4133: iinc #7, 1
    //   4136: iload_2
    //   4137: ifeq -> 3998
    //   4140: sipush #-8230
    //   4143: sipush #-16838
    //   4146: invokestatic a : (II)Ljava/lang/String;
    //   4149: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4152: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4155: astore #5
    //   4157: aload #5
    //   4159: arraylength
    //   4160: istore #6
    //   4162: iconst_0
    //   4163: istore #7
    //   4165: iload #7
    //   4167: iload #6
    //   4169: if_icmpge -> 4306
    //   4172: aload #5
    //   4174: iload #7
    //   4176: aaload
    //   4177: astore #8
    //   4179: aload #8
    //   4181: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4184: pop
    //   4185: aload #8
    //   4187: invokevirtual getModifiers : ()I
    //   4190: invokestatic isStatic : (I)Z
    //   4193: ifeq -> 4292
    //   4196: aload #8
    //   4198: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4201: arraylength
    //   4202: iconst_2
    //   4203: if_icmpne -> 4292
    //   4206: goto -> 4213
    //   4209: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4212: athrow
    //   4213: aload #8
    //   4215: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4218: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4221: if_acmpne -> 4292
    //   4224: goto -> 4231
    //   4227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4230: athrow
    //   4231: aload #8
    //   4233: iconst_1
    //   4234: invokevirtual setAccessible : (Z)V
    //   4237: aload #8
    //   4239: aconst_null
    //   4240: iconst_2
    //   4241: anewarray java/lang/Object
    //   4244: dup
    //   4245: iconst_0
    //   4246: aload_0
    //   4247: aastore
    //   4248: dup
    //   4249: iconst_1
    //   4250: aload_1
    //   4251: ifnonnull -> 4269
    //   4254: goto -> 4261
    //   4257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4260: athrow
    //   4261: aload_1
    //   4262: goto -> 4276
    //   4265: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4268: athrow
    //   4269: aload_1
    //   4270: checkcast [B
    //   4273: invokevirtual clone : ()Ljava/lang/Object;
    //   4276: aastore
    //   4277: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4280: checkcast java/lang/Boolean
    //   4283: invokevirtual booleanValue : ()Z
    //   4286: istore #4
    //   4288: iload_2
    //   4289: ifeq -> 4306
    //   4292: iinc #7, 1
    //   4295: iload_2
    //   4296: ifeq -> 4165
    //   4299: goto -> 4306
    //   4302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4305: athrow
    //   4306: iload_2
    //   4307: ifeq -> 4649
    //   4310: sipush #-8236
    //   4313: sipush #-6161
    //   4316: invokestatic a : (II)Ljava/lang/String;
    //   4319: iconst_1
    //   4320: ldc burp/Zs9x
    //   4322: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4325: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4328: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4331: astore #5
    //   4333: aload #5
    //   4335: arraylength
    //   4336: istore #6
    //   4338: iconst_0
    //   4339: istore #7
    //   4341: iload #7
    //   4343: iload #6
    //   4345: if_icmpge -> 4483
    //   4348: aload #5
    //   4350: iload #7
    //   4352: aaload
    //   4353: astore #8
    //   4355: aload #8
    //   4357: invokevirtual getModifiers : ()I
    //   4360: invokestatic isStatic : (I)Z
    //   4363: ifne -> 4373
    //   4366: goto -> 4476
    //   4369: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4372: athrow
    //   4373: aload #8
    //   4375: invokevirtual getType : ()Ljava/lang/Class;
    //   4378: astore #9
    //   4380: aload #9
    //   4382: ifnull -> 4463
    //   4385: aload #9
    //   4387: invokevirtual isPrimitive : ()Z
    //   4390: ifne -> 4463
    //   4393: goto -> 4400
    //   4396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4399: athrow
    //   4400: aload #9
    //   4402: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4405: ifnull -> 4463
    //   4408: goto -> 4415
    //   4411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4414: athrow
    //   4415: aload #9
    //   4417: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4420: invokevirtual getName : ()Ljava/lang/String;
    //   4423: ifnull -> 4463
    //   4426: goto -> 4433
    //   4429: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4432: athrow
    //   4433: aload #9
    //   4435: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4438: invokevirtual getName : ()Ljava/lang/String;
    //   4441: sipush #-8238
    //   4444: sipush #-7946
    //   4447: invokestatic a : (II)Ljava/lang/String;
    //   4450: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4453: ifne -> 4463
    //   4456: goto -> 4463
    //   4459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4462: athrow
    //   4463: aload #8
    //   4465: iconst_1
    //   4466: invokevirtual setAccessible : (Z)V
    //   4469: aload #8
    //   4471: aconst_null
    //   4472: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4475: pop
    //   4476: iinc #7, 1
    //   4479: iload_2
    //   4480: ifeq -> 4341
    //   4483: sipush #-8245
    //   4486: sipush #-31364
    //   4489: invokestatic a : (II)Ljava/lang/String;
    //   4492: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4495: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4498: astore #5
    //   4500: aload #5
    //   4502: arraylength
    //   4503: istore #6
    //   4505: iconst_0
    //   4506: istore #7
    //   4508: iload #7
    //   4510: iload #6
    //   4512: if_icmpge -> 4649
    //   4515: aload #5
    //   4517: iload #7
    //   4519: aaload
    //   4520: astore #8
    //   4522: aload #8
    //   4524: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4527: pop
    //   4528: aload #8
    //   4530: invokevirtual getModifiers : ()I
    //   4533: invokestatic isStatic : (I)Z
    //   4536: ifeq -> 4635
    //   4539: aload #8
    //   4541: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4544: arraylength
    //   4545: iconst_2
    //   4546: if_icmpne -> 4635
    //   4549: goto -> 4556
    //   4552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4555: athrow
    //   4556: aload #8
    //   4558: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4561: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4564: if_acmpne -> 4635
    //   4567: goto -> 4574
    //   4570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4573: athrow
    //   4574: aload #8
    //   4576: iconst_1
    //   4577: invokevirtual setAccessible : (Z)V
    //   4580: aload #8
    //   4582: aconst_null
    //   4583: iconst_2
    //   4584: anewarray java/lang/Object
    //   4587: dup
    //   4588: iconst_0
    //   4589: aload_0
    //   4590: aastore
    //   4591: dup
    //   4592: iconst_1
    //   4593: aload_1
    //   4594: ifnonnull -> 4612
    //   4597: goto -> 4604
    //   4600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4603: athrow
    //   4604: aload_1
    //   4605: goto -> 4619
    //   4608: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4611: athrow
    //   4612: aload_1
    //   4613: checkcast [B
    //   4616: invokevirtual clone : ()Ljava/lang/Object;
    //   4619: aastore
    //   4620: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4623: checkcast java/lang/Boolean
    //   4626: invokevirtual booleanValue : ()Z
    //   4629: istore #4
    //   4631: iload_2
    //   4632: ifeq -> 4649
    //   4635: iinc #7, 1
    //   4638: iload_2
    //   4639: ifeq -> 4508
    //   4642: goto -> 4649
    //   4645: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4648: athrow
    //   4649: iload #4
    //   4651: ifeq -> 4657
    //   4654: iload #4
    //   4656: ireturn
    //   4657: getstatic burp/Zrx5.ZD : Ljava/lang/String;
    //   4660: getstatic burp/Zzpj.ZI : Ljava/lang/Object;
    //   4663: checkcast java/math/BigInteger
    //   4666: invokevirtual intValue : ()I
    //   4669: bipush #32
    //   4671: irem
    //   4672: invokestatic abs : (I)I
    //   4675: invokevirtual charAt : (I)C
    //   4678: getstatic burp/Zsot.Zb : Ljava/lang/String;
    //   4681: getstatic burp/Zevc.Zm : Ljava/lang/Object;
    //   4684: checkcast java/math/BigInteger
    //   4687: invokevirtual intValue : ()I
    //   4690: bipush #32
    //   4692: irem
    //   4693: invokestatic abs : (I)I
    //   4696: invokevirtual charAt : (I)C
    //   4699: if_icmple -> 5045
    //   4702: sipush #-8229
    //   4705: sipush #-27689
    //   4708: invokestatic a : (II)Ljava/lang/String;
    //   4711: iconst_1
    //   4712: ldc burp/Zmpp
    //   4714: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4717: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4720: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4723: astore #5
    //   4725: aload #5
    //   4727: arraylength
    //   4728: istore #6
    //   4730: iconst_0
    //   4731: istore #7
    //   4733: iload #7
    //   4735: iload #6
    //   4737: if_icmpge -> 4875
    //   4740: aload #5
    //   4742: iload #7
    //   4744: aaload
    //   4745: astore #8
    //   4747: aload #8
    //   4749: invokevirtual getModifiers : ()I
    //   4752: invokestatic isStatic : (I)Z
    //   4755: ifne -> 4765
    //   4758: goto -> 4868
    //   4761: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4764: athrow
    //   4765: aload #8
    //   4767: invokevirtual getType : ()Ljava/lang/Class;
    //   4770: astore #9
    //   4772: aload #9
    //   4774: ifnull -> 4855
    //   4777: aload #9
    //   4779: invokevirtual isPrimitive : ()Z
    //   4782: ifne -> 4855
    //   4785: goto -> 4792
    //   4788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4791: athrow
    //   4792: aload #9
    //   4794: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4797: ifnull -> 4855
    //   4800: goto -> 4807
    //   4803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4806: athrow
    //   4807: aload #9
    //   4809: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4812: invokevirtual getName : ()Ljava/lang/String;
    //   4815: ifnull -> 4855
    //   4818: goto -> 4825
    //   4821: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4824: athrow
    //   4825: aload #9
    //   4827: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4830: invokevirtual getName : ()Ljava/lang/String;
    //   4833: sipush #-8238
    //   4836: sipush #-7946
    //   4839: invokestatic a : (II)Ljava/lang/String;
    //   4842: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4845: ifne -> 4855
    //   4848: goto -> 4855
    //   4851: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4854: athrow
    //   4855: aload #8
    //   4857: iconst_1
    //   4858: invokevirtual setAccessible : (Z)V
    //   4861: aload #8
    //   4863: aconst_null
    //   4864: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4867: pop
    //   4868: iinc #7, 1
    //   4871: iload_2
    //   4872: ifeq -> 4733
    //   4875: sipush #-8250
    //   4878: sipush #-12422
    //   4881: invokestatic a : (II)Ljava/lang/String;
    //   4884: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4887: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4890: astore #5
    //   4892: aload #5
    //   4894: arraylength
    //   4895: istore #6
    //   4897: iconst_0
    //   4898: istore #7
    //   4900: iload #7
    //   4902: iload #6
    //   4904: if_icmpge -> 5041
    //   4907: aload #5
    //   4909: iload #7
    //   4911: aaload
    //   4912: astore #8
    //   4914: aload #8
    //   4916: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4919: pop
    //   4920: aload #8
    //   4922: invokevirtual getModifiers : ()I
    //   4925: invokestatic isStatic : (I)Z
    //   4928: ifeq -> 5027
    //   4931: aload #8
    //   4933: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4936: arraylength
    //   4937: iconst_2
    //   4938: if_icmpne -> 5027
    //   4941: goto -> 4948
    //   4944: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4947: athrow
    //   4948: aload #8
    //   4950: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4953: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4956: if_acmpne -> 5027
    //   4959: goto -> 4966
    //   4962: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4965: athrow
    //   4966: aload #8
    //   4968: iconst_1
    //   4969: invokevirtual setAccessible : (Z)V
    //   4972: aload #8
    //   4974: aconst_null
    //   4975: iconst_2
    //   4976: anewarray java/lang/Object
    //   4979: dup
    //   4980: iconst_0
    //   4981: aload_0
    //   4982: aastore
    //   4983: dup
    //   4984: iconst_1
    //   4985: aload_1
    //   4986: ifnonnull -> 5004
    //   4989: goto -> 4996
    //   4992: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4995: athrow
    //   4996: aload_1
    //   4997: goto -> 5011
    //   5000: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5003: athrow
    //   5004: aload_1
    //   5005: checkcast [B
    //   5008: invokevirtual clone : ()Ljava/lang/Object;
    //   5011: aastore
    //   5012: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5015: checkcast java/lang/Boolean
    //   5018: invokevirtual booleanValue : ()Z
    //   5021: istore #4
    //   5023: iload_2
    //   5024: ifeq -> 5041
    //   5027: iinc #7, 1
    //   5030: iload_2
    //   5031: ifeq -> 4900
    //   5034: goto -> 5041
    //   5037: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5040: athrow
    //   5041: iload_2
    //   5042: ifeq -> 5384
    //   5045: sipush #-8240
    //   5048: sipush #27168
    //   5051: invokestatic a : (II)Ljava/lang/String;
    //   5054: iconst_1
    //   5055: ldc burp/Zz8o
    //   5057: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5060: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5063: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5066: astore #5
    //   5068: aload #5
    //   5070: arraylength
    //   5071: istore #6
    //   5073: iconst_0
    //   5074: istore #7
    //   5076: iload #7
    //   5078: iload #6
    //   5080: if_icmpge -> 5218
    //   5083: aload #5
    //   5085: iload #7
    //   5087: aaload
    //   5088: astore #8
    //   5090: aload #8
    //   5092: invokevirtual getModifiers : ()I
    //   5095: invokestatic isStatic : (I)Z
    //   5098: ifne -> 5108
    //   5101: goto -> 5211
    //   5104: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5107: athrow
    //   5108: aload #8
    //   5110: invokevirtual getType : ()Ljava/lang/Class;
    //   5113: astore #9
    //   5115: aload #9
    //   5117: ifnull -> 5198
    //   5120: aload #9
    //   5122: invokevirtual isPrimitive : ()Z
    //   5125: ifne -> 5198
    //   5128: goto -> 5135
    //   5131: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5134: athrow
    //   5135: aload #9
    //   5137: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5140: ifnull -> 5198
    //   5143: goto -> 5150
    //   5146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5149: athrow
    //   5150: aload #9
    //   5152: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5155: invokevirtual getName : ()Ljava/lang/String;
    //   5158: ifnull -> 5198
    //   5161: goto -> 5168
    //   5164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5167: athrow
    //   5168: aload #9
    //   5170: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5173: invokevirtual getName : ()Ljava/lang/String;
    //   5176: sipush #-8238
    //   5179: sipush #-7946
    //   5182: invokestatic a : (II)Ljava/lang/String;
    //   5185: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5188: ifne -> 5198
    //   5191: goto -> 5198
    //   5194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5197: athrow
    //   5198: aload #8
    //   5200: iconst_1
    //   5201: invokevirtual setAccessible : (Z)V
    //   5204: aload #8
    //   5206: aconst_null
    //   5207: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5210: pop
    //   5211: iinc #7, 1
    //   5214: iload_2
    //   5215: ifeq -> 5076
    //   5218: sipush #-8246
    //   5221: sipush #-4681
    //   5224: invokestatic a : (II)Ljava/lang/String;
    //   5227: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5230: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5233: astore #5
    //   5235: aload #5
    //   5237: arraylength
    //   5238: istore #6
    //   5240: iconst_0
    //   5241: istore #7
    //   5243: iload #7
    //   5245: iload #6
    //   5247: if_icmpge -> 5384
    //   5250: aload #5
    //   5252: iload #7
    //   5254: aaload
    //   5255: astore #8
    //   5257: aload #8
    //   5259: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5262: pop
    //   5263: aload #8
    //   5265: invokevirtual getModifiers : ()I
    //   5268: invokestatic isStatic : (I)Z
    //   5271: ifeq -> 5370
    //   5274: aload #8
    //   5276: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5279: arraylength
    //   5280: iconst_2
    //   5281: if_icmpne -> 5370
    //   5284: goto -> 5291
    //   5287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5290: athrow
    //   5291: aload #8
    //   5293: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5296: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5299: if_acmpne -> 5370
    //   5302: goto -> 5309
    //   5305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5308: athrow
    //   5309: aload #8
    //   5311: iconst_1
    //   5312: invokevirtual setAccessible : (Z)V
    //   5315: aload #8
    //   5317: aconst_null
    //   5318: iconst_2
    //   5319: anewarray java/lang/Object
    //   5322: dup
    //   5323: iconst_0
    //   5324: aload_0
    //   5325: aastore
    //   5326: dup
    //   5327: iconst_1
    //   5328: aload_1
    //   5329: ifnonnull -> 5347
    //   5332: goto -> 5339
    //   5335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5338: athrow
    //   5339: aload_1
    //   5340: goto -> 5354
    //   5343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5346: athrow
    //   5347: aload_1
    //   5348: checkcast [B
    //   5351: invokevirtual clone : ()Ljava/lang/Object;
    //   5354: aastore
    //   5355: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5358: checkcast java/lang/Boolean
    //   5361: invokevirtual booleanValue : ()Z
    //   5364: istore #4
    //   5366: iload_2
    //   5367: ifeq -> 5384
    //   5370: iinc #7, 1
    //   5373: iload_2
    //   5374: ifeq -> 5243
    //   5377: goto -> 5384
    //   5380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5383: athrow
    //   5384: iload #4
    //   5386: ireturn
    //   5387: astore_3
    //   5388: new java/lang/Exception
    //   5391: dup
    //   5392: aload_3
    //   5393: invokevirtual getMessage : ()Ljava/lang/String;
    //   5396: invokespecial <init> : (Ljava/lang/String;)V
    //   5399: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3186	5387	java/lang/Throwable
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
    //   1572	1600	1603	java/lang/Throwable
    //   1582	1617	1620	java/lang/Throwable
    //   1607	1645	1648	java/lang/Throwable
    //   1624	1662	1665	java/lang/Throwable
    //   1652	1690	1693	java/lang/Throwable
    //   1669	1707	1710	java/lang/Throwable
    //   1697	1725	1728	java/lang/Throwable
    //   1714	1739	1742	java/lang/Throwable
    //   1846	1860	1860	java/lang/Throwable
    //   1871	1884	1887	java/lang/Throwable
    //   1876	1899	1902	java/lang/Throwable
    //   1891	1917	1920	java/lang/Throwable
    //   1906	1947	1950	java/lang/Throwable
    //   2013	2040	2043	java/lang/Throwable
    //   2030	2058	2061	java/lang/Throwable
    //   2047	2094	2097	java/lang/Throwable
    //   2065	2108	2111	java/lang/Throwable
    //   2160	2174	2174	java/lang/Throwable
    //   2185	2198	2201	java/lang/Throwable
    //   2190	2213	2216	java/lang/Throwable
    //   2205	2231	2234	java/lang/Throwable
    //   2220	2261	2264	java/lang/Throwable
    //   2327	2354	2357	java/lang/Throwable
    //   2344	2375	2378	java/lang/Throwable
    //   2361	2405	2408	java/lang/Throwable
    //   2382	2416	2416	java/lang/Throwable
    //   2427	2443	2446	java/lang/Throwable
    //   2543	2557	2557	java/lang/Throwable
    //   2568	2581	2584	java/lang/Throwable
    //   2573	2596	2599	java/lang/Throwable
    //   2588	2614	2617	java/lang/Throwable
    //   2603	2644	2647	java/lang/Throwable
    //   2710	2737	2740	java/lang/Throwable
    //   2727	2755	2758	java/lang/Throwable
    //   2744	2785	2788	java/lang/Throwable
    //   2762	2796	2796	java/lang/Throwable
    //   2819	2830	2833	java/lang/Throwable
    //   2885	2899	2899	java/lang/Throwable
    //   2910	2923	2926	java/lang/Throwable
    //   2915	2938	2941	java/lang/Throwable
    //   2930	2956	2959	java/lang/Throwable
    //   2945	2986	2989	java/lang/Throwable
    //   3052	3079	3082	java/lang/Throwable
    //   3069	3097	3100	java/lang/Throwable
    //   3086	3127	3130	java/lang/Throwable
    //   3104	3138	3138	java/lang/Throwable
    //   3161	3172	3175	java/lang/Throwable
    //   3187	3921	5387	java/lang/Throwable
    //   3277	3291	3291	java/lang/Throwable
    //   3302	3315	3318	java/lang/Throwable
    //   3307	3330	3333	java/lang/Throwable
    //   3322	3348	3351	java/lang/Throwable
    //   3337	3378	3381	java/lang/Throwable
    //   3444	3471	3474	java/lang/Throwable
    //   3461	3489	3492	java/lang/Throwable
    //   3478	3519	3522	java/lang/Throwable
    //   3496	3530	3530	java/lang/Throwable
    //   3553	3564	3567	java/lang/Throwable
    //   3620	3634	3634	java/lang/Throwable
    //   3645	3658	3661	java/lang/Throwable
    //   3650	3673	3676	java/lang/Throwable
    //   3665	3691	3694	java/lang/Throwable
    //   3680	3721	3724	java/lang/Throwable
    //   3787	3814	3817	java/lang/Throwable
    //   3804	3832	3835	java/lang/Throwable
    //   3821	3862	3865	java/lang/Throwable
    //   3839	3873	3873	java/lang/Throwable
    //   3896	3907	3910	java/lang/Throwable
    //   3922	4656	5387	java/lang/Throwable
    //   4012	4026	4026	java/lang/Throwable
    //   4037	4050	4053	java/lang/Throwable
    //   4042	4065	4068	java/lang/Throwable
    //   4057	4083	4086	java/lang/Throwable
    //   4072	4113	4116	java/lang/Throwable
    //   4179	4206	4209	java/lang/Throwable
    //   4196	4224	4227	java/lang/Throwable
    //   4213	4254	4257	java/lang/Throwable
    //   4231	4265	4265	java/lang/Throwable
    //   4288	4299	4302	java/lang/Throwable
    //   4355	4369	4369	java/lang/Throwable
    //   4380	4393	4396	java/lang/Throwable
    //   4385	4408	4411	java/lang/Throwable
    //   4400	4426	4429	java/lang/Throwable
    //   4415	4456	4459	java/lang/Throwable
    //   4522	4549	4552	java/lang/Throwable
    //   4539	4567	4570	java/lang/Throwable
    //   4556	4597	4600	java/lang/Throwable
    //   4574	4608	4608	java/lang/Throwable
    //   4631	4642	4645	java/lang/Throwable
    //   4657	5386	5387	java/lang/Throwable
    //   4747	4761	4761	java/lang/Throwable
    //   4772	4785	4788	java/lang/Throwable
    //   4777	4800	4803	java/lang/Throwable
    //   4792	4818	4821	java/lang/Throwable
    //   4807	4848	4851	java/lang/Throwable
    //   4914	4941	4944	java/lang/Throwable
    //   4931	4959	4962	java/lang/Throwable
    //   4948	4989	4992	java/lang/Throwable
    //   4966	5000	5000	java/lang/Throwable
    //   5023	5034	5037	java/lang/Throwable
    //   5090	5104	5104	java/lang/Throwable
    //   5115	5128	5131	java/lang/Throwable
    //   5120	5143	5146	java/lang/Throwable
    //   5135	5161	5164	java/lang/Throwable
    //   5150	5191	5194	java/lang/Throwable
    //   5257	5284	5287	java/lang/Throwable
    //   5274	5302	5305	java/lang/Throwable
    //   5291	5332	5335	java/lang/Throwable
    //   5309	5343	5343	java/lang/Throwable
    //   5366	5377	5380	java/lang/Throwable
  }
  
  static void Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zu(Object paramObject) {
    Ztc2.Zr = a(-8232, -10274);
    Ztc2.ZM = new BigInteger(a(-8247, -22270));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zbzj.Zw.charAt(Math.abs(((BigInteger)Zth8.Zk).intValue() % 32)) <= Zbzj.Zw.charAt(Math.abs(((BigInteger)Zlwi.Zw).intValue() % 32))) {
          try {
            Zbzj.ZW(Class.forName(a(-8237, -12380)));
            if (bool)
              Ztzh.ZO(Class.forName(a(-8248, 31044))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztzh.ZO(Class.forName(a(-8248, 31044)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Zøb4dx\\t\\fËÄ[k\\tNkÍzoÀ/\\tkº'*Y=ä?\\tvo-j{Úò\\t¹Ê}$üE u3´¨¹\\n¦dUÒìMôMØ{^ygoKä\\t\\t\þóçò\\t¢>~¿9à\\t\\nwÜ\\nSÌ}\\t\qÁSf\MÅ*ØãëH711ìä¬E:ÜÔ´åYõf¾u.ØJqzRAãÌ¡¦þB\\bOc%Z)Ís)m<<-·3pÌ&°\>\\tWûÂÃ\\b\\t¸Ij5KhT\\bÊßé+·ôÔî\\t®é@NpÃr\\t¿;½\\n;ïj\\tÿ*ø(Æý\\tã16[{¶åó\\t¸']KîF\\tkh°zÞÂÌ\\t<úÍ"<A\\tó4Ý;Ã¨±é'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #69
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
    //   68: ldc 'ãÐË!3 iTsmûÙyÚã» ßê[®Ra1x}Üì®â°Ü¹'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #75
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
    //   129: putstatic burp/Zs5i.a : [Ljava/lang/String;
    //   132: bipush #27
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zs5i.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #78
    //   214: goto -> 243
    //   217: bipush #43
    //   219: goto -> 243
    //   222: bipush #50
    //   224: goto -> 243
    //   227: bipush #94
    //   229: goto -> 243
    //   232: iconst_4
    //   233: goto -> 243
    //   236: bipush #122
    //   238: goto -> 243
    //   241: bipush #61
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #25
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-16
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-76
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-40
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #81
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-121
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-110
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-36
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #8
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #105
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #16
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #56
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #14
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-81
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-67
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: iconst_4
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #13
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-15
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #46
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-125
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #51
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: iconst_1
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #40
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #-32
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #70
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-47
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #74
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #81
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #90
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-44
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-48
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #-35
    //   492: bastore
    //   493: invokespecial <init> : (I[B)V
    //   496: putstatic burp/Zs5i.ZD : Ljava/lang/Object;
    //   499: sipush #-8252
    //   502: sipush #-32381
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zs5i.ZJ : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDFC2) & 0xFFFF;
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
      byte b1 = 89;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */