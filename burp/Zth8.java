package burp;

import java.math.BigInteger;

class Zth8 extends ClassLoader {
  static Object Zk;
  
  static String ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZN(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zt5a.Zl : Ljava/lang/String;
    //   172: getstatic burp/Zl22.ZJ : Ljava/lang/Object;
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
    //   206: getstatic burp/Zzxv.Z_ : Ljava/lang/String;
    //   209: getstatic burp/Zrkc.ZI : Ljava/lang/Object;
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
    //   243: getstatic burp/Zs5i.ZJ : Ljava/lang/String;
    //   246: getstatic burp/Zstf.ZA : Ljava/lang/Object;
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
    //   280: getstatic burp/Zmh0.Zs : Ljava/lang/String;
    //   283: getstatic burp/Zmuj.ZH : Ljava/lang/Object;
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
    //   317: getstatic burp/Zls0.ZI : Ljava/lang/String;
    //   320: getstatic burp/Zl2g.ZG : Ljava/lang/Object;
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
    //   354: getstatic burp/Ztc2.Zr : Ljava/lang/String;
    //   357: getstatic burp/Zejg.ZR : Ljava/lang/Object;
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
    //   391: getstatic burp/Zlo2.ZJ : Ljava/lang/String;
    //   394: getstatic burp/Zso7.ZB : Ljava/lang/Object;
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
    //   428: getstatic burp/Ztgv.ZC : Ljava/lang/String;
    //   431: getstatic burp/Zz5l.Zb : Ljava/lang/Object;
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
    //   465: getstatic burp/Zmgl.Zh : Ljava/lang/String;
    //   468: getstatic burp/Zle4.Zh : Ljava/lang/Object;
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
    //   502: getstatic burp/Ztip.Z_ : Ljava/lang/String;
    //   505: getstatic burp/Zkul.Zb : Ljava/lang/Object;
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
    //   539: getstatic burp/Zs33.ZX : Ljava/lang/String;
    //   542: getstatic burp/Zr9p.ZC : Ljava/lang/Object;
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
    //   576: getstatic burp/Zms1.ZZ : Ljava/lang/String;
    //   579: getstatic burp/Ztdg.ZE : Ljava/lang/Object;
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
    //   613: getstatic burp/Ztzw.Zi : Ljava/lang/String;
    //   616: getstatic burp/Ztfr.Zr : Ljava/lang/Object;
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
    //   650: getstatic burp/Zx_b.ZD : Ljava/lang/String;
    //   653: getstatic burp/Zxtn.ZY : Ljava/lang/Object;
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
    //   687: getstatic burp/Ztvn.ZU : Ljava/lang/String;
    //   690: getstatic burp/Zxfu.ZA : Ljava/lang/Object;
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
    //   724: getstatic burp/Zewq.ZV : Ljava/lang/String;
    //   727: getstatic burp/Zlvb.ZN : Ljava/lang/Object;
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
    //   761: getstatic burp/Zti7.Zc : Ljava/lang/String;
    //   764: getstatic burp/Ztvp.Zy : Ljava/lang/Object;
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
    //   798: getstatic burp/Zl3j.Zr : Ljava/lang/String;
    //   801: getstatic burp/Ze40.ZO : Ljava/lang/Object;
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
    //   835: getstatic burp/Zeu2.ZK : Ljava/lang/String;
    //   838: getstatic burp/Zr8s.Zt : Ljava/lang/Object;
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
    //   872: getstatic burp/Ze3z.Zv : Ljava/lang/String;
    //   875: getstatic burp/Zs5k.Zg : Ljava/lang/Object;
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
    //   909: getstatic burp/Zzi_.ZG : Ljava/lang/String;
    //   912: getstatic burp/Zx58.ZE : Ljava/lang/Object;
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
    //   946: getstatic burp/Zlna.Zo : Ljava/lang/String;
    //   949: getstatic burp/Zx_u.Zy : Ljava/lang/Object;
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
    //   983: getstatic burp/Zgh3.ZR : Ljava/lang/String;
    //   986: getstatic burp/Ztex.Z_ : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zx4l.Zy : Ljava/lang/String;
    //   1023: getstatic burp/Zgmo.Zo : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zz6t.Zx : Ljava/lang/String;
    //   1060: getstatic burp/Zlh2.Zc : Ljava/lang/Object;
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
    //   1094: getstatic burp/Ze08.Zh : Ljava/lang/String;
    //   1097: getstatic burp/Zkvr.Zb : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zlhy.ZS : Ljava/lang/String;
    //   1134: getstatic burp/Zrw7.ZV : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zs8s.Za : Ljava/lang/String;
    //   1171: getstatic burp/Zzv.Zu : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zmdi.ZA : Ljava/lang/String;
    //   1208: getstatic burp/Zx5w.Zo : Ljava/lang/Object;
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
    //   1242: getstatic burp/Znp.Zr : Ljava/lang/String;
    //   1245: getstatic burp/Zlh2.Zc : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zgdj.Zt : Ljava/lang/String;
    //   1282: getstatic burp/Zz80.ZR : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zl6z.ZL : Ljava/lang/String;
    //   1319: getstatic burp/Zs6g.Zq : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zr9p.Za : Ljava/lang/String;
    //   1362: sipush #18675
    //   1365: getstatic burp/Zbsc.ZA : Ljava/lang/Object;
    //   1368: checkcast java/math/BigInteger
    //   1371: getstatic burp/Zk52.Zu : Ljava/lang/Object;
    //   1374: checkcast java/math/BigInteger
    //   1377: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1380: putstatic burp/Zg_6.ZU : Ljava/lang/Object;
    //   1383: sipush #3930
    //   1386: invokestatic a : (II)Ljava/lang/String;
    //   1389: iconst_1
    //   1390: ldc burp/Zsf7
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
    //   1511: sipush #18674
    //   1514: sipush #-2198
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
    //   1553: sipush #18677
    //   1556: sipush #-2048
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
    //   1582: if_icmpge -> 1694
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
    //   1606: ifeq -> 1680
    //   1609: aload #7
    //   1611: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1614: arraylength
    //   1615: iconst_2
    //   1616: if_icmpne -> 1680
    //   1619: goto -> 1626
    //   1622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1625: athrow
    //   1626: aload #7
    //   1628: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1631: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1634: if_acmpne -> 1680
    //   1637: goto -> 1644
    //   1640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1643: athrow
    //   1644: aload #7
    //   1646: iconst_1
    //   1647: invokevirtual setAccessible : (Z)V
    //   1650: aload #7
    //   1652: aconst_null
    //   1653: iconst_2
    //   1654: anewarray java/lang/Object
    //   1657: dup
    //   1658: iconst_0
    //   1659: aload_0
    //   1660: aastore
    //   1661: dup
    //   1662: iconst_1
    //   1663: aload_1
    //   1664: aastore
    //   1665: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1668: pop
    //   1669: iload_2
    //   1670: ifne -> 1694
    //   1673: goto -> 1680
    //   1676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1679: athrow
    //   1680: iinc #6, 1
    //   1683: iload_2
    //   1684: ifne -> 1578
    //   1687: goto -> 1694
    //   1690: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1693: athrow
    //   1694: sipush #18681
    //   1697: sipush #26649
    //   1700: invokestatic a : (II)Ljava/lang/String;
    //   1703: iconst_1
    //   1704: ldc burp/Zxo4
    //   1706: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1709: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1712: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1715: astore #4
    //   1717: aload #4
    //   1719: arraylength
    //   1720: istore #5
    //   1722: iconst_0
    //   1723: istore #6
    //   1725: iload #6
    //   1727: iload #5
    //   1729: if_icmpge -> 1867
    //   1732: aload #4
    //   1734: iload #6
    //   1736: aaload
    //   1737: astore #7
    //   1739: aload #7
    //   1741: invokevirtual getModifiers : ()I
    //   1744: invokestatic isStatic : (I)Z
    //   1747: ifne -> 1757
    //   1750: goto -> 1860
    //   1753: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1756: athrow
    //   1757: aload #7
    //   1759: invokevirtual getType : ()Ljava/lang/Class;
    //   1762: astore #8
    //   1764: aload #8
    //   1766: ifnull -> 1847
    //   1769: aload #8
    //   1771: invokevirtual isPrimitive : ()Z
    //   1774: ifne -> 1847
    //   1777: goto -> 1784
    //   1780: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1783: athrow
    //   1784: aload #8
    //   1786: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1789: ifnull -> 1847
    //   1792: goto -> 1799
    //   1795: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1798: athrow
    //   1799: aload #8
    //   1801: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1804: invokevirtual getName : ()Ljava/lang/String;
    //   1807: ifnull -> 1847
    //   1810: goto -> 1817
    //   1813: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1816: athrow
    //   1817: aload #8
    //   1819: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1822: invokevirtual getName : ()Ljava/lang/String;
    //   1825: sipush #18678
    //   1828: sipush #5359
    //   1831: invokestatic a : (II)Ljava/lang/String;
    //   1834: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1837: ifne -> 1847
    //   1840: goto -> 1847
    //   1843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1846: athrow
    //   1847: aload #7
    //   1849: iconst_1
    //   1850: invokevirtual setAccessible : (Z)V
    //   1853: aload #7
    //   1855: aconst_null
    //   1856: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1859: pop
    //   1860: iinc #6, 1
    //   1863: iload_2
    //   1864: ifne -> 1725
    //   1867: sipush #18682
    //   1870: sipush #17580
    //   1873: invokestatic a : (II)Ljava/lang/String;
    //   1876: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1879: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1882: astore #4
    //   1884: aload #4
    //   1886: arraylength
    //   1887: istore #5
    //   1889: iconst_0
    //   1890: istore #6
    //   1892: iload #6
    //   1894: iload #5
    //   1896: if_icmpge -> 2029
    //   1899: aload #4
    //   1901: iload #6
    //   1903: aaload
    //   1904: astore #7
    //   1906: aload #7
    //   1908: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1911: pop
    //   1912: aload #7
    //   1914: invokevirtual getModifiers : ()I
    //   1917: invokestatic isStatic : (I)Z
    //   1920: ifeq -> 2015
    //   1923: aload #7
    //   1925: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1928: arraylength
    //   1929: iconst_2
    //   1930: if_icmpne -> 2015
    //   1933: goto -> 1940
    //   1936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1939: athrow
    //   1940: aload #7
    //   1942: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1945: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1948: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1951: ifeq -> 2015
    //   1954: goto -> 1961
    //   1957: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1960: athrow
    //   1961: aload #7
    //   1963: iconst_1
    //   1964: invokevirtual setAccessible : (Z)V
    //   1967: aload #7
    //   1969: aconst_null
    //   1970: iconst_2
    //   1971: anewarray java/lang/Object
    //   1974: dup
    //   1975: iconst_0
    //   1976: aload_0
    //   1977: aastore
    //   1978: dup
    //   1979: iconst_1
    //   1980: aload_1
    //   1981: ifnonnull -> 1999
    //   1984: goto -> 1991
    //   1987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1990: athrow
    //   1991: aload_1
    //   1992: goto -> 2006
    //   1995: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1998: athrow
    //   1999: aload_1
    //   2000: checkcast [B
    //   2003: invokevirtual clone : ()Ljava/lang/Object;
    //   2006: aastore
    //   2007: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2010: pop
    //   2011: iload_2
    //   2012: ifne -> 2029
    //   2015: iinc #6, 1
    //   2018: iload_2
    //   2019: ifne -> 1892
    //   2022: goto -> 2029
    //   2025: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2028: athrow
    //   2029: getstatic burp/Zzsq.Zc : Ljava/lang/String;
    //   2032: getstatic burp/Zlwi.Zw : Ljava/lang/Object;
    //   2035: checkcast java/math/BigInteger
    //   2038: invokevirtual intValue : ()I
    //   2041: bipush #32
    //   2043: irem
    //   2044: invokestatic abs : (I)I
    //   2047: invokevirtual charAt : (I)C
    //   2050: getstatic burp/Zmli.Zc : Ljava/lang/String;
    //   2053: getstatic burp/Ztap.ZK : Ljava/lang/Object;
    //   2056: checkcast java/math/BigInteger
    //   2059: invokevirtual intValue : ()I
    //   2062: bipush #32
    //   2064: irem
    //   2065: invokestatic abs : (I)I
    //   2068: invokevirtual charAt : (I)C
    //   2071: if_icmple -> 2186
    //   2074: getstatic burp/Zsgj.ZN : Ljava/lang/String;
    //   2077: getstatic burp/Zeai.ZI : Ljava/lang/Object;
    //   2080: checkcast java/math/BigInteger
    //   2083: invokevirtual intValue : ()I
    //   2086: bipush #32
    //   2088: irem
    //   2089: invokestatic abs : (I)I
    //   2092: invokevirtual charAt : (I)C
    //   2095: getstatic burp/Zb6e.ZR : Ljava/lang/String;
    //   2098: getstatic burp/Zk8b.ZK : Ljava/lang/Object;
    //   2101: checkcast java/math/BigInteger
    //   2104: invokevirtual intValue : ()I
    //   2107: bipush #32
    //   2109: irem
    //   2110: invokestatic abs : (I)I
    //   2113: invokevirtual charAt : (I)C
    //   2116: if_icmple -> 2186
    //   2119: goto -> 2126
    //   2122: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2125: athrow
    //   2126: getstatic burp/Zebu.ZI : Ljava/lang/String;
    //   2129: getstatic burp/Zzai.Z_ : Ljava/lang/Object;
    //   2132: checkcast java/math/BigInteger
    //   2135: invokevirtual intValue : ()I
    //   2138: bipush #32
    //   2140: irem
    //   2141: invokestatic abs : (I)I
    //   2144: invokevirtual charAt : (I)C
    //   2147: getstatic burp/Zs_3.ZC : Ljava/lang/String;
    //   2150: getstatic burp/Ztgj.ZY : Ljava/lang/Object;
    //   2153: checkcast java/math/BigInteger
    //   2156: invokevirtual intValue : ()I
    //   2159: bipush #32
    //   2161: irem
    //   2162: invokestatic abs : (I)I
    //   2165: invokevirtual charAt : (I)C
    //   2168: if_icmpgt -> 2186
    //   2171: goto -> 2178
    //   2174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2177: athrow
    //   2178: iconst_1
    //   2179: goto -> 2187
    //   2182: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2185: athrow
    //   2186: iconst_0
    //   2187: ireturn
    //   2188: astore_3
    //   2189: new java/lang/Exception
    //   2192: dup
    //   2193: aload_3
    //   2194: invokevirtual getMessage : ()Ljava/lang/String;
    //   2197: invokespecial <init> : (Ljava/lang/String;)V
    //   2200: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2187	2188	java/lang/Throwable
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
    //   1609	1637	1640	java/lang/Throwable
    //   1626	1673	1676	java/lang/Throwable
    //   1644	1687	1690	java/lang/Throwable
    //   1739	1753	1753	java/lang/Throwable
    //   1764	1777	1780	java/lang/Throwable
    //   1769	1792	1795	java/lang/Throwable
    //   1784	1810	1813	java/lang/Throwable
    //   1799	1840	1843	java/lang/Throwable
    //   1906	1933	1936	java/lang/Throwable
    //   1923	1954	1957	java/lang/Throwable
    //   1940	1984	1987	java/lang/Throwable
    //   1961	1995	1995	java/lang/Throwable
    //   2006	2022	2025	java/lang/Throwable
    //   2029	2119	2122	java/lang/Throwable
    //   2074	2171	2174	java/lang/Throwable
    //   2126	2182	2182	java/lang/Throwable
  }
  
  static void ZP(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zp(Object paramObject) {
    Zb8_.ZP = a(18679, -8643);
    Zb8_.ZT = new BigInteger(a(18672, -12357));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zl6z.ZL.charAt(Math.abs(((BigInteger)Zmec.ZY).intValue() % 32)) <= Ztw4.Zb.charAt(Math.abs(((BigInteger)Zm5s.ZB).intValue() % 32))) {
          try {
            Zr4z.Z_(Class.forName(a(18683, 29941)));
            if (bool)
              Zlpl.ZX(Class.forName(a(18673, 26884))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlpl.ZX(Class.forName(a(18673, 26884)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'jÄÇp|°~\\t`®ÐFïÙNMJéR<rYt³e©>27ýC¨È³R´w¶½Ï>}2Æ÷]ë((Þõ£ÅÆiÎFÇ²Ð!;4cÇq:\ú òØ¢*¬äNJêIùF´Ót¼ÿ¬¨5¢û$EeÇN\\b\\tmqSÛ{\\fÀ ¨ç½èÅm¸ÚôE¶£¡\åºã/R^¬ V±¥\\tÅ'dwyÿVF'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #10
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
    //   68: ldc '¥¸þ½\\tcQI@%à#ï'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #52
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
    //   129: putstatic burp/Zth8.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zth8.b : [Ljava/lang/String;
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
    //   212: bipush #62
    //   214: goto -> 244
    //   217: bipush #74
    //   219: goto -> 244
    //   222: bipush #12
    //   224: goto -> 244
    //   227: bipush #58
    //   229: goto -> 244
    //   232: bipush #45
    //   234: goto -> 244
    //   237: bipush #57
    //   239: goto -> 244
    //   242: bipush #16
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
    //   311: bipush #120
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #86
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-116
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #13
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-119
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-90
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-27
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #44
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #26
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-119
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #44
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-97
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #57
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-91
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #37
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-28
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #28
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #78
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #105
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #46
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #114
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-71
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #120
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-126
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #110
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #52
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #6
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #-17
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #91
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #118
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #76
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #46
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zth8.Zk : Ljava/lang/Object;
    //   501: sipush #18676
    //   504: sipush #14142
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zth8.ZN : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x48F3) & 0xFFFF;
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
      byte b1 = 2;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zth8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */