package burp;

import java.math.BigInteger;

class Ztsc extends ClassLoader {
  static String ZL;
  
  static Object Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zm3s.Ze : Ljava/lang/String;
    //   172: getstatic burp/Zevf.Zu : Ljava/lang/Object;
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
    //   206: getstatic burp/Zzuh.ZX : Ljava/lang/String;
    //   209: getstatic burp/Zsbd.Zh : Ljava/lang/Object;
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
    //   243: getstatic burp/Zgp_.Zn : Ljava/lang/String;
    //   246: getstatic burp/Zszm.ZI : Ljava/lang/Object;
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
    //   280: getstatic burp/Zz5l.ZH : Ljava/lang/String;
    //   283: getstatic burp/Zsdn.ZE : Ljava/lang/Object;
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
    //   317: getstatic burp/Zrh1.Zg : Ljava/lang/String;
    //   320: getstatic burp/Zxzt.ZY : Ljava/lang/Object;
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
    //   354: getstatic burp/Zlb6.ZP : Ljava/lang/String;
    //   357: getstatic burp/Zsf7.Zg : Ljava/lang/Object;
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
    //   391: getstatic burp/Zgta.ZL : Ljava/lang/String;
    //   394: getstatic burp/Zx_x.Zi : Ljava/lang/Object;
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
    //   428: getstatic burp/Zmy3.ZP : Ljava/lang/String;
    //   431: getstatic burp/Zzox.Zq : Ljava/lang/Object;
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
    //   465: getstatic burp/Ze6t.ZR : Ljava/lang/String;
    //   468: getstatic burp/Zg99.ZZ : Ljava/lang/Object;
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
    //   502: getstatic burp/Zgii.Ze : Ljava/lang/String;
    //   505: getstatic burp/Ztc2.ZM : Ljava/lang/Object;
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
    //   539: getstatic burp/Zrva.Zr : Ljava/lang/String;
    //   542: getstatic burp/Zmdi.Zw : Ljava/lang/Object;
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
    //   576: getstatic burp/Zkco.Zz : Ljava/lang/String;
    //   579: getstatic burp/Zgdt.Zb : Ljava/lang/Object;
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
    //   613: getstatic burp/Zr1t.Ze : Ljava/lang/String;
    //   616: getstatic burp/Zmjr.ZU : Ljava/lang/Object;
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
    //   650: getstatic burp/Zex.Zn : Ljava/lang/String;
    //   653: getstatic burp/Zkaw.ZB : Ljava/lang/Object;
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
    //   687: getstatic burp/Ztys.Zn : Ljava/lang/String;
    //   690: getstatic burp/Zz0b.ZT : Ljava/lang/Object;
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
    //   724: getstatic burp/Zrcu.Zb : Ljava/lang/String;
    //   727: getstatic burp/Zxfu.ZA : Ljava/lang/Object;
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
    //   761: getstatic burp/Zezq.Zp : Ljava/lang/String;
    //   764: getstatic burp/Zxc.ZR : Ljava/lang/Object;
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
    //   798: getstatic burp/Zr3x.ZM : Ljava/lang/String;
    //   801: getstatic burp/Zg3v.Zk : Ljava/lang/Object;
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
    //   835: getstatic burp/Zrfh.ZH : Ljava/lang/String;
    //   838: getstatic burp/Zl6z.Zt : Ljava/lang/Object;
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
    //   872: getstatic burp/Zep8.ZC : Ljava/lang/String;
    //   875: getstatic burp/Zbo2.ZQ : Ljava/lang/Object;
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
    //   909: getstatic burp/Zero.ZL : Ljava/lang/String;
    //   912: getstatic burp/Zgnp.Zm : Ljava/lang/Object;
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
    //   946: getstatic burp/Zmfw.ZV : Ljava/lang/String;
    //   949: getstatic burp/Zmzj.Zm : Ljava/lang/Object;
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
    //   983: getstatic burp/Zeig.Zg : Ljava/lang/String;
    //   986: getstatic burp/Zxee.Zj : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zb8v.Zo : Ljava/lang/String;
    //   1023: getstatic burp/Zz75.ZX : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zeoi.Zh : Ljava/lang/String;
    //   1060: getstatic burp/Zzb2.ZW : Ljava/lang/Object;
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
    //   1094: getstatic burp/Ztdx.Zl : Ljava/lang/String;
    //   1097: getstatic burp/Zrfh.ZJ : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zzna.Zi : Ljava/lang/String;
    //   1134: getstatic burp/Ztap.ZK : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zle6.Zh : Ljava/lang/String;
    //   1171: getstatic burp/Zmdm.ZZ : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zscz.ZJ : Ljava/lang/String;
    //   1208: getstatic burp/Zk7w.ZF : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zeqo.Zw : Ljava/lang/String;
    //   1245: getstatic burp/Ztgj.ZY : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zth7.Zf : Ljava/lang/String;
    //   1282: getstatic burp/Zenr.ZA : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zmdi.ZA : Ljava/lang/String;
    //   1319: getstatic burp/Zgii.ZD : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zmd.Zf : Ljava/lang/String;
    //   1362: new java/lang/StringBuilder
    //   1365: dup
    //   1366: invokespecial <init> : ()V
    //   1369: astore #4
    //   1371: iconst_0
    //   1372: istore #5
    //   1374: iload #5
    //   1376: bipush #32
    //   1378: if_icmpge -> 2743
    //   1381: iload #5
    //   1383: tableswitch default -> 2736, 0 -> 1524, 1 -> 1562, 2 -> 1600, 3 -> 1638, 4 -> 1676, 5 -> 1714, 6 -> 1752, 7 -> 1790, 8 -> 1828, 9 -> 1866, 10 -> 1904, 11 -> 1942, 12 -> 1980, 13 -> 2018, 14 -> 2056, 15 -> 2094, 16 -> 2132, 17 -> 2170, 18 -> 2208, 19 -> 2246, 20 -> 2284, 21 -> 2322, 22 -> 2360, 23 -> 2398, 24 -> 2436, 25 -> 2474, 26 -> 2512, 27 -> 2550, 28 -> 2588, 29 -> 2626, 30 -> 2664, 31 -> 2702
    //   1524: aload #4
    //   1526: getstatic burp/Ztt0.Zl : Ljava/lang/String;
    //   1529: getstatic burp/Ztzw.Zk : Ljava/lang/Object;
    //   1532: checkcast java/math/BigInteger
    //   1535: invokevirtual intValue : ()I
    //   1538: bipush #32
    //   1540: irem
    //   1541: invokestatic abs : (I)I
    //   1544: invokevirtual charAt : (I)C
    //   1547: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1550: pop
    //   1551: iload_2
    //   1552: ifne -> 2736
    //   1555: goto -> 1562
    //   1558: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1561: athrow
    //   1562: aload #4
    //   1564: getstatic burp/Ztfr.Zo : Ljava/lang/String;
    //   1567: getstatic burp/Zrye.Zx : Ljava/lang/Object;
    //   1570: checkcast java/math/BigInteger
    //   1573: invokevirtual intValue : ()I
    //   1576: bipush #32
    //   1578: irem
    //   1579: invokestatic abs : (I)I
    //   1582: invokevirtual charAt : (I)C
    //   1585: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1588: pop
    //   1589: iload_2
    //   1590: ifne -> 2736
    //   1593: goto -> 1600
    //   1596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1599: athrow
    //   1600: aload #4
    //   1602: getstatic burp/Ztkh.ZP : Ljava/lang/String;
    //   1605: getstatic burp/Zth7.ZT : Ljava/lang/Object;
    //   1608: checkcast java/math/BigInteger
    //   1611: invokevirtual intValue : ()I
    //   1614: bipush #32
    //   1616: irem
    //   1617: invokestatic abs : (I)I
    //   1620: invokevirtual charAt : (I)C
    //   1623: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1626: pop
    //   1627: iload_2
    //   1628: ifne -> 2736
    //   1631: goto -> 1638
    //   1634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1637: athrow
    //   1638: aload #4
    //   1640: getstatic burp/Zg8v.Zd : Ljava/lang/String;
    //   1643: getstatic burp/Zea8.ZF : Ljava/lang/Object;
    //   1646: checkcast java/math/BigInteger
    //   1649: invokevirtual intValue : ()I
    //   1652: bipush #32
    //   1654: irem
    //   1655: invokestatic abs : (I)I
    //   1658: invokevirtual charAt : (I)C
    //   1661: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1664: pop
    //   1665: iload_2
    //   1666: ifne -> 2736
    //   1669: goto -> 1676
    //   1672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1675: athrow
    //   1676: aload #4
    //   1678: getstatic burp/Zgq_.ZQ : Ljava/lang/String;
    //   1681: getstatic burp/Zmd.ZU : Ljava/lang/Object;
    //   1684: checkcast java/math/BigInteger
    //   1687: invokevirtual intValue : ()I
    //   1690: bipush #32
    //   1692: irem
    //   1693: invokestatic abs : (I)I
    //   1696: invokevirtual charAt : (I)C
    //   1699: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1702: pop
    //   1703: iload_2
    //   1704: ifne -> 2736
    //   1707: goto -> 1714
    //   1710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1713: athrow
    //   1714: aload #4
    //   1716: getstatic burp/Zls0.ZI : Ljava/lang/String;
    //   1719: getstatic burp/Zzox.Zq : Ljava/lang/Object;
    //   1722: checkcast java/math/BigInteger
    //   1725: invokevirtual intValue : ()I
    //   1728: bipush #32
    //   1730: irem
    //   1731: invokestatic abs : (I)I
    //   1734: invokevirtual charAt : (I)C
    //   1737: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1740: pop
    //   1741: iload_2
    //   1742: ifne -> 2736
    //   1745: goto -> 1752
    //   1748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1751: athrow
    //   1752: aload #4
    //   1754: getstatic burp/Zs33.ZX : Ljava/lang/String;
    //   1757: getstatic burp/Zlwm.Ze : Ljava/lang/Object;
    //   1760: checkcast java/math/BigInteger
    //   1763: invokevirtual intValue : ()I
    //   1766: bipush #32
    //   1768: irem
    //   1769: invokestatic abs : (I)I
    //   1772: invokevirtual charAt : (I)C
    //   1775: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1778: pop
    //   1779: iload_2
    //   1780: ifne -> 2736
    //   1783: goto -> 1790
    //   1786: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1789: athrow
    //   1790: aload #4
    //   1792: getstatic burp/Zbow.Zr : Ljava/lang/String;
    //   1795: getstatic burp/Zbwj.ZW : Ljava/lang/Object;
    //   1798: checkcast java/math/BigInteger
    //   1801: invokevirtual intValue : ()I
    //   1804: bipush #32
    //   1806: irem
    //   1807: invokestatic abs : (I)I
    //   1810: invokevirtual charAt : (I)C
    //   1813: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1816: pop
    //   1817: iload_2
    //   1818: ifne -> 2736
    //   1821: goto -> 1828
    //   1824: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1827: athrow
    //   1828: aload #4
    //   1830: getstatic burp/Zlpj.Zj : Ljava/lang/String;
    //   1833: getstatic burp/Zrd4.Ze : Ljava/lang/Object;
    //   1836: checkcast java/math/BigInteger
    //   1839: invokevirtual intValue : ()I
    //   1842: bipush #32
    //   1844: irem
    //   1845: invokestatic abs : (I)I
    //   1848: invokevirtual charAt : (I)C
    //   1851: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1854: pop
    //   1855: iload_2
    //   1856: ifne -> 2736
    //   1859: goto -> 1866
    //   1862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1865: athrow
    //   1866: aload #4
    //   1868: getstatic burp/Zt4g.Zj : Ljava/lang/String;
    //   1871: getstatic burp/Zl1u.Zq : Ljava/lang/Object;
    //   1874: checkcast java/math/BigInteger
    //   1877: invokevirtual intValue : ()I
    //   1880: bipush #32
    //   1882: irem
    //   1883: invokestatic abs : (I)I
    //   1886: invokevirtual charAt : (I)C
    //   1889: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1892: pop
    //   1893: iload_2
    //   1894: ifne -> 2736
    //   1897: goto -> 1904
    //   1900: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1903: athrow
    //   1904: aload #4
    //   1906: getstatic burp/Zb2k.Zu : Ljava/lang/String;
    //   1909: getstatic burp/Zm__.Zz : Ljava/lang/Object;
    //   1912: checkcast java/math/BigInteger
    //   1915: invokevirtual intValue : ()I
    //   1918: bipush #32
    //   1920: irem
    //   1921: invokestatic abs : (I)I
    //   1924: invokevirtual charAt : (I)C
    //   1927: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1930: pop
    //   1931: iload_2
    //   1932: ifne -> 2736
    //   1935: goto -> 1942
    //   1938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1941: athrow
    //   1942: aload #4
    //   1944: getstatic burp/Zmpp.Zk : Ljava/lang/String;
    //   1947: getstatic burp/Zegk.ZR : Ljava/lang/Object;
    //   1950: checkcast java/math/BigInteger
    //   1953: invokevirtual intValue : ()I
    //   1956: bipush #32
    //   1958: irem
    //   1959: invokestatic abs : (I)I
    //   1962: invokevirtual charAt : (I)C
    //   1965: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1968: pop
    //   1969: iload_2
    //   1970: ifne -> 2736
    //   1973: goto -> 1980
    //   1976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1979: athrow
    //   1980: aload #4
    //   1982: getstatic burp/Zei_.ZZ : Ljava/lang/String;
    //   1985: getstatic burp/Zb_c.ZN : Ljava/lang/Object;
    //   1988: checkcast java/math/BigInteger
    //   1991: invokevirtual intValue : ()I
    //   1994: bipush #32
    //   1996: irem
    //   1997: invokestatic abs : (I)I
    //   2000: invokevirtual charAt : (I)C
    //   2003: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2006: pop
    //   2007: iload_2
    //   2008: ifne -> 2736
    //   2011: goto -> 2018
    //   2014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2017: athrow
    //   2018: aload #4
    //   2020: getstatic burp/Zxf8.Zq : Ljava/lang/String;
    //   2023: getstatic burp/Zxz_.Zv : Ljava/lang/Object;
    //   2026: checkcast java/math/BigInteger
    //   2029: invokevirtual intValue : ()I
    //   2032: bipush #32
    //   2034: irem
    //   2035: invokestatic abs : (I)I
    //   2038: invokevirtual charAt : (I)C
    //   2041: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2044: pop
    //   2045: iload_2
    //   2046: ifne -> 2736
    //   2049: goto -> 2056
    //   2052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2055: athrow
    //   2056: aload #4
    //   2058: getstatic burp/Zr5k.Zq : Ljava/lang/String;
    //   2061: getstatic burp/Zeor.Zb : Ljava/lang/Object;
    //   2064: checkcast java/math/BigInteger
    //   2067: invokevirtual intValue : ()I
    //   2070: bipush #32
    //   2072: irem
    //   2073: invokestatic abs : (I)I
    //   2076: invokevirtual charAt : (I)C
    //   2079: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2082: pop
    //   2083: iload_2
    //   2084: ifne -> 2736
    //   2087: goto -> 2094
    //   2090: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2093: athrow
    //   2094: aload #4
    //   2096: getstatic burp/Zm84.Zd : Ljava/lang/String;
    //   2099: getstatic burp/Ztdg.ZE : Ljava/lang/Object;
    //   2102: checkcast java/math/BigInteger
    //   2105: invokevirtual intValue : ()I
    //   2108: bipush #32
    //   2110: irem
    //   2111: invokestatic abs : (I)I
    //   2114: invokevirtual charAt : (I)C
    //   2117: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2120: pop
    //   2121: iload_2
    //   2122: ifne -> 2736
    //   2125: goto -> 2132
    //   2128: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2131: athrow
    //   2132: aload #4
    //   2134: getstatic burp/Zz4r.Zq : Ljava/lang/String;
    //   2137: getstatic burp/Zlpl.Ze : Ljava/lang/Object;
    //   2140: checkcast java/math/BigInteger
    //   2143: invokevirtual intValue : ()I
    //   2146: bipush #32
    //   2148: irem
    //   2149: invokestatic abs : (I)I
    //   2152: invokevirtual charAt : (I)C
    //   2155: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2158: pop
    //   2159: iload_2
    //   2160: ifne -> 2736
    //   2163: goto -> 2170
    //   2166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2169: athrow
    //   2170: aload #4
    //   2172: getstatic burp/Zm6h.Za : Ljava/lang/String;
    //   2175: getstatic burp/Ze57.ZR : Ljava/lang/Object;
    //   2178: checkcast java/math/BigInteger
    //   2181: invokevirtual intValue : ()I
    //   2184: bipush #32
    //   2186: irem
    //   2187: invokestatic abs : (I)I
    //   2190: invokevirtual charAt : (I)C
    //   2193: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2196: pop
    //   2197: iload_2
    //   2198: ifne -> 2736
    //   2201: goto -> 2208
    //   2204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2207: athrow
    //   2208: aload #4
    //   2210: getstatic burp/Zztz.Zp : Ljava/lang/String;
    //   2213: getstatic burp/Zmdm.ZZ : Ljava/lang/Object;
    //   2216: checkcast java/math/BigInteger
    //   2219: invokevirtual intValue : ()I
    //   2222: bipush #32
    //   2224: irem
    //   2225: invokestatic abs : (I)I
    //   2228: invokevirtual charAt : (I)C
    //   2231: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2234: pop
    //   2235: iload_2
    //   2236: ifne -> 2736
    //   2239: goto -> 2246
    //   2242: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2245: athrow
    //   2246: aload #4
    //   2248: getstatic burp/Zr_w.Zi : Ljava/lang/String;
    //   2251: getstatic burp/Ztsj.Zc : Ljava/lang/Object;
    //   2254: checkcast java/math/BigInteger
    //   2257: invokevirtual intValue : ()I
    //   2260: bipush #32
    //   2262: irem
    //   2263: invokestatic abs : (I)I
    //   2266: invokevirtual charAt : (I)C
    //   2269: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2272: pop
    //   2273: iload_2
    //   2274: ifne -> 2736
    //   2277: goto -> 2284
    //   2280: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2283: athrow
    //   2284: aload #4
    //   2286: getstatic burp/Zso7.Zr : Ljava/lang/String;
    //   2289: getstatic burp/Zexn.Zl : Ljava/lang/Object;
    //   2292: checkcast java/math/BigInteger
    //   2295: invokevirtual intValue : ()I
    //   2298: bipush #32
    //   2300: irem
    //   2301: invokestatic abs : (I)I
    //   2304: invokevirtual charAt : (I)C
    //   2307: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2310: pop
    //   2311: iload_2
    //   2312: ifne -> 2736
    //   2315: goto -> 2322
    //   2318: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2321: athrow
    //   2322: aload #4
    //   2324: getstatic burp/Zbsc.Zp : Ljava/lang/String;
    //   2327: getstatic burp/Zxx4.Zo : Ljava/lang/Object;
    //   2330: checkcast java/math/BigInteger
    //   2333: invokevirtual intValue : ()I
    //   2336: bipush #32
    //   2338: irem
    //   2339: invokestatic abs : (I)I
    //   2342: invokevirtual charAt : (I)C
    //   2345: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2348: pop
    //   2349: iload_2
    //   2350: ifne -> 2736
    //   2353: goto -> 2360
    //   2356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2359: athrow
    //   2360: aload #4
    //   2362: getstatic burp/Zgfm.ZE : Ljava/lang/String;
    //   2365: getstatic burp/Zlxs.ZK : Ljava/lang/Object;
    //   2368: checkcast java/math/BigInteger
    //   2371: invokevirtual intValue : ()I
    //   2374: bipush #32
    //   2376: irem
    //   2377: invokestatic abs : (I)I
    //   2380: invokevirtual charAt : (I)C
    //   2383: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2386: pop
    //   2387: iload_2
    //   2388: ifne -> 2736
    //   2391: goto -> 2398
    //   2394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2397: athrow
    //   2398: aload #4
    //   2400: getstatic burp/Zmt7.Zl : Ljava/lang/String;
    //   2403: getstatic burp/Zxzj.ZO : Ljava/lang/Object;
    //   2406: checkcast java/math/BigInteger
    //   2409: invokevirtual intValue : ()I
    //   2412: bipush #32
    //   2414: irem
    //   2415: invokestatic abs : (I)I
    //   2418: invokevirtual charAt : (I)C
    //   2421: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2424: pop
    //   2425: iload_2
    //   2426: ifne -> 2736
    //   2429: goto -> 2436
    //   2432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2435: athrow
    //   2436: aload #4
    //   2438: getstatic burp/Zxnm.Zw : Ljava/lang/String;
    //   2441: getstatic burp/Zt4g.Zv : Ljava/lang/Object;
    //   2444: checkcast java/math/BigInteger
    //   2447: invokevirtual intValue : ()I
    //   2450: bipush #32
    //   2452: irem
    //   2453: invokestatic abs : (I)I
    //   2456: invokevirtual charAt : (I)C
    //   2459: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2462: pop
    //   2463: iload_2
    //   2464: ifne -> 2736
    //   2467: goto -> 2474
    //   2470: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2473: athrow
    //   2474: aload #4
    //   2476: getstatic burp/Zl3n.Zy : Ljava/lang/String;
    //   2479: getstatic burp/Zgia.Zx : Ljava/lang/Object;
    //   2482: checkcast java/math/BigInteger
    //   2485: invokevirtual intValue : ()I
    //   2488: bipush #32
    //   2490: irem
    //   2491: invokestatic abs : (I)I
    //   2494: invokevirtual charAt : (I)C
    //   2497: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2500: pop
    //   2501: iload_2
    //   2502: ifne -> 2736
    //   2505: goto -> 2512
    //   2508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2511: athrow
    //   2512: aload #4
    //   2514: getstatic burp/Zsin.ZC : Ljava/lang/String;
    //   2517: getstatic burp/Zgsy.ZC : Ljava/lang/Object;
    //   2520: checkcast java/math/BigInteger
    //   2523: invokevirtual intValue : ()I
    //   2526: bipush #32
    //   2528: irem
    //   2529: invokestatic abs : (I)I
    //   2532: invokevirtual charAt : (I)C
    //   2535: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2538: pop
    //   2539: iload_2
    //   2540: ifne -> 2736
    //   2543: goto -> 2550
    //   2546: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2549: athrow
    //   2550: aload #4
    //   2552: getstatic burp/Zl15.ZI : Ljava/lang/String;
    //   2555: getstatic burp/Zb20.Zq : Ljava/lang/Object;
    //   2558: checkcast java/math/BigInteger
    //   2561: invokevirtual intValue : ()I
    //   2564: bipush #32
    //   2566: irem
    //   2567: invokestatic abs : (I)I
    //   2570: invokevirtual charAt : (I)C
    //   2573: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2576: pop
    //   2577: iload_2
    //   2578: ifne -> 2736
    //   2581: goto -> 2588
    //   2584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2587: athrow
    //   2588: aload #4
    //   2590: getstatic burp/Zxn5.ZI : Ljava/lang/String;
    //   2593: getstatic burp/Zx4u.Zn : Ljava/lang/Object;
    //   2596: checkcast java/math/BigInteger
    //   2599: invokevirtual intValue : ()I
    //   2602: bipush #32
    //   2604: irem
    //   2605: invokestatic abs : (I)I
    //   2608: invokevirtual charAt : (I)C
    //   2611: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2614: pop
    //   2615: iload_2
    //   2616: ifne -> 2736
    //   2619: goto -> 2626
    //   2622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2625: athrow
    //   2626: aload #4
    //   2628: getstatic burp/Zl1z.Zh : Ljava/lang/String;
    //   2631: getstatic burp/Zrj3.ZA : Ljava/lang/Object;
    //   2634: checkcast java/math/BigInteger
    //   2637: invokevirtual intValue : ()I
    //   2640: bipush #32
    //   2642: irem
    //   2643: invokestatic abs : (I)I
    //   2646: invokevirtual charAt : (I)C
    //   2649: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2652: pop
    //   2653: iload_2
    //   2654: ifne -> 2736
    //   2657: goto -> 2664
    //   2660: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2663: athrow
    //   2664: aload #4
    //   2666: getstatic burp/Zzqj.Zk : Ljava/lang/String;
    //   2669: getstatic burp/Zmdm.ZZ : Ljava/lang/Object;
    //   2672: checkcast java/math/BigInteger
    //   2675: invokevirtual intValue : ()I
    //   2678: bipush #32
    //   2680: irem
    //   2681: invokestatic abs : (I)I
    //   2684: invokevirtual charAt : (I)C
    //   2687: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2690: pop
    //   2691: iload_2
    //   2692: ifne -> 2736
    //   2695: goto -> 2702
    //   2698: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2701: athrow
    //   2702: aload #4
    //   2704: getstatic burp/Zzah.Zs : Ljava/lang/String;
    //   2707: getstatic burp/Zva.Zu : Ljava/lang/Object;
    //   2710: checkcast java/math/BigInteger
    //   2713: invokevirtual intValue : ()I
    //   2716: bipush #32
    //   2718: irem
    //   2719: invokestatic abs : (I)I
    //   2722: invokevirtual charAt : (I)C
    //   2725: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2728: pop
    //   2729: goto -> 2736
    //   2732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2735: athrow
    //   2736: iinc #5, 1
    //   2739: iload_2
    //   2740: ifne -> 1374
    //   2743: aload #4
    //   2745: invokevirtual toString : ()Ljava/lang/String;
    //   2748: putstatic burp/Zl5.ZE : Ljava/lang/String;
    //   2751: sipush #-10738
    //   2754: sipush #22094
    //   2757: invokestatic a : (II)Ljava/lang/String;
    //   2760: iconst_1
    //   2761: ldc burp/Zm0v
    //   2763: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2766: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2769: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2772: astore #5
    //   2774: aload #5
    //   2776: arraylength
    //   2777: istore #6
    //   2779: iconst_0
    //   2780: istore #7
    //   2782: iload #7
    //   2784: iload #6
    //   2786: if_icmpge -> 2924
    //   2789: aload #5
    //   2791: iload #7
    //   2793: aaload
    //   2794: astore #8
    //   2796: aload #8
    //   2798: invokevirtual getModifiers : ()I
    //   2801: invokestatic isStatic : (I)Z
    //   2804: ifne -> 2814
    //   2807: goto -> 2917
    //   2810: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2813: athrow
    //   2814: aload #8
    //   2816: invokevirtual getType : ()Ljava/lang/Class;
    //   2819: astore #9
    //   2821: aload #9
    //   2823: ifnull -> 2904
    //   2826: aload #9
    //   2828: invokevirtual isPrimitive : ()Z
    //   2831: ifne -> 2904
    //   2834: goto -> 2841
    //   2837: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2840: athrow
    //   2841: aload #9
    //   2843: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2846: ifnull -> 2904
    //   2849: goto -> 2856
    //   2852: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2855: athrow
    //   2856: aload #9
    //   2858: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2861: invokevirtual getName : ()Ljava/lang/String;
    //   2864: ifnull -> 2904
    //   2867: goto -> 2874
    //   2870: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2873: athrow
    //   2874: aload #9
    //   2876: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2879: invokevirtual getName : ()Ljava/lang/String;
    //   2882: sipush #-10752
    //   2885: sipush #15254
    //   2888: invokestatic a : (II)Ljava/lang/String;
    //   2891: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2894: ifne -> 2904
    //   2897: goto -> 2904
    //   2900: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2903: athrow
    //   2904: aload #8
    //   2906: iconst_1
    //   2907: invokevirtual setAccessible : (Z)V
    //   2910: aload #8
    //   2912: aconst_null
    //   2913: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2916: pop
    //   2917: iinc #7, 1
    //   2920: iload_2
    //   2921: ifne -> 2782
    //   2924: sipush #-10747
    //   2927: sipush #-7534
    //   2930: invokestatic a : (II)Ljava/lang/String;
    //   2933: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2936: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2939: astore #5
    //   2941: aload #5
    //   2943: arraylength
    //   2944: istore #6
    //   2946: iconst_0
    //   2947: istore #7
    //   2949: iload #7
    //   2951: iload #6
    //   2953: if_icmpge -> 3083
    //   2956: aload #5
    //   2958: iload #7
    //   2960: aaload
    //   2961: astore #8
    //   2963: aload #8
    //   2965: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2968: pop
    //   2969: aload #8
    //   2971: invokevirtual getModifiers : ()I
    //   2974: invokestatic isStatic : (I)Z
    //   2977: ifeq -> 3069
    //   2980: aload #8
    //   2982: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2985: arraylength
    //   2986: iconst_2
    //   2987: if_icmpne -> 3069
    //   2990: goto -> 2997
    //   2993: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2996: athrow
    //   2997: aload #8
    //   2999: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3002: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3005: if_acmpne -> 3069
    //   3008: goto -> 3015
    //   3011: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3014: athrow
    //   3015: aload #8
    //   3017: iconst_1
    //   3018: invokevirtual setAccessible : (Z)V
    //   3021: aload #8
    //   3023: aconst_null
    //   3024: iconst_2
    //   3025: anewarray java/lang/Object
    //   3028: dup
    //   3029: iconst_0
    //   3030: aload_0
    //   3031: aastore
    //   3032: dup
    //   3033: iconst_1
    //   3034: aload_1
    //   3035: ifnonnull -> 3053
    //   3038: goto -> 3045
    //   3041: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3044: athrow
    //   3045: aload_1
    //   3046: goto -> 3060
    //   3049: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3052: athrow
    //   3053: aload_1
    //   3054: checkcast [B
    //   3057: invokevirtual clone : ()Ljava/lang/Object;
    //   3060: aastore
    //   3061: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3064: pop
    //   3065: iload_2
    //   3066: ifne -> 3083
    //   3069: iinc #7, 1
    //   3072: iload_2
    //   3073: ifne -> 2949
    //   3076: goto -> 3083
    //   3079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3082: athrow
    //   3083: sipush #-10751
    //   3086: sipush #12276
    //   3089: invokestatic a : (II)Ljava/lang/String;
    //   3092: iconst_1
    //   3093: ldc burp/Zl1z
    //   3095: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3098: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3101: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3104: astore #5
    //   3106: aload #5
    //   3108: arraylength
    //   3109: istore #6
    //   3111: iconst_0
    //   3112: istore #7
    //   3114: iload #7
    //   3116: iload #6
    //   3118: if_icmpge -> 3256
    //   3121: aload #5
    //   3123: iload #7
    //   3125: aaload
    //   3126: astore #8
    //   3128: aload #8
    //   3130: invokevirtual getModifiers : ()I
    //   3133: invokestatic isStatic : (I)Z
    //   3136: ifne -> 3146
    //   3139: goto -> 3249
    //   3142: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3145: athrow
    //   3146: aload #8
    //   3148: invokevirtual getType : ()Ljava/lang/Class;
    //   3151: astore #9
    //   3153: aload #9
    //   3155: ifnull -> 3236
    //   3158: aload #9
    //   3160: invokevirtual isPrimitive : ()Z
    //   3163: ifne -> 3236
    //   3166: goto -> 3173
    //   3169: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3172: athrow
    //   3173: aload #9
    //   3175: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3178: ifnull -> 3236
    //   3181: goto -> 3188
    //   3184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3187: athrow
    //   3188: aload #9
    //   3190: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3193: invokevirtual getName : ()Ljava/lang/String;
    //   3196: ifnull -> 3236
    //   3199: goto -> 3206
    //   3202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3205: athrow
    //   3206: aload #9
    //   3208: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3211: invokevirtual getName : ()Ljava/lang/String;
    //   3214: sipush #-10739
    //   3217: sipush #12770
    //   3220: invokestatic a : (II)Ljava/lang/String;
    //   3223: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3226: ifne -> 3236
    //   3229: goto -> 3236
    //   3232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3235: athrow
    //   3236: aload #8
    //   3238: iconst_1
    //   3239: invokevirtual setAccessible : (Z)V
    //   3242: aload #8
    //   3244: aconst_null
    //   3245: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3248: pop
    //   3249: iinc #7, 1
    //   3252: iload_2
    //   3253: ifne -> 3114
    //   3256: sipush #-10746
    //   3259: sipush #-2628
    //   3262: invokestatic a : (II)Ljava/lang/String;
    //   3265: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3268: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3271: astore #5
    //   3273: aload #5
    //   3275: arraylength
    //   3276: istore #6
    //   3278: iconst_0
    //   3279: istore #7
    //   3281: iload #7
    //   3283: iload #6
    //   3285: if_icmpge -> 3418
    //   3288: aload #5
    //   3290: iload #7
    //   3292: aaload
    //   3293: astore #8
    //   3295: aload #8
    //   3297: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3300: pop
    //   3301: aload #8
    //   3303: invokevirtual getModifiers : ()I
    //   3306: invokestatic isStatic : (I)Z
    //   3309: ifeq -> 3404
    //   3312: aload #8
    //   3314: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3317: arraylength
    //   3318: iconst_2
    //   3319: if_icmpne -> 3404
    //   3322: goto -> 3329
    //   3325: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3328: athrow
    //   3329: aload #8
    //   3331: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3334: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   3337: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3340: ifeq -> 3404
    //   3343: goto -> 3350
    //   3346: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3349: athrow
    //   3350: aload #8
    //   3352: iconst_1
    //   3353: invokevirtual setAccessible : (Z)V
    //   3356: aload #8
    //   3358: aconst_null
    //   3359: iconst_2
    //   3360: anewarray java/lang/Object
    //   3363: dup
    //   3364: iconst_0
    //   3365: aload_0
    //   3366: aastore
    //   3367: dup
    //   3368: iconst_1
    //   3369: aload_1
    //   3370: ifnonnull -> 3388
    //   3373: goto -> 3380
    //   3376: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3379: athrow
    //   3380: aload_1
    //   3381: goto -> 3395
    //   3384: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3387: athrow
    //   3388: aload_1
    //   3389: checkcast [B
    //   3392: invokevirtual clone : ()Ljava/lang/Object;
    //   3395: aastore
    //   3396: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3399: pop
    //   3400: iload_2
    //   3401: ifne -> 3418
    //   3404: iinc #7, 1
    //   3407: iload_2
    //   3408: ifne -> 3281
    //   3411: goto -> 3418
    //   3414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3417: athrow
    //   3418: getstatic burp/Zkfb.ZN : Ljava/lang/Object;
    //   3421: checkcast java/math/BigInteger
    //   3424: invokevirtual toByteArray : ()[B
    //   3427: astore #5
    //   3429: aload #5
    //   3431: arraylength
    //   3432: bipush #8
    //   3434: iadd
    //   3435: bipush #6
    //   3437: ishr
    //   3438: iconst_1
    //   3439: iadd
    //   3440: bipush #16
    //   3442: imul
    //   3443: newarray int
    //   3445: astore #7
    //   3447: iconst_0
    //   3448: istore #8
    //   3450: iload #8
    //   3452: aload #5
    //   3454: arraylength
    //   3455: if_icmpge -> 3499
    //   3458: aload #5
    //   3460: iload #8
    //   3462: baload
    //   3463: sipush #255
    //   3466: iand
    //   3467: istore #9
    //   3469: aload #7
    //   3471: iload #8
    //   3473: iconst_2
    //   3474: ishr
    //   3475: dup2
    //   3476: iaload
    //   3477: iload #9
    //   3479: bipush #24
    //   3481: iload #8
    //   3483: iconst_4
    //   3484: irem
    //   3485: bipush #8
    //   3487: imul
    //   3488: isub
    //   3489: ishl
    //   3490: ior
    //   3491: iastore
    //   3492: iinc #8, 1
    //   3495: iload_2
    //   3496: ifne -> 3450
    //   3499: aload #7
    //   3501: iload #8
    //   3503: iconst_2
    //   3504: ishr
    //   3505: dup2
    //   3506: iaload
    //   3507: sipush #128
    //   3510: bipush #24
    //   3512: iload #8
    //   3514: iconst_4
    //   3515: irem
    //   3516: bipush #8
    //   3518: imul
    //   3519: isub
    //   3520: ishl
    //   3521: ior
    //   3522: iastore
    //   3523: aload #7
    //   3525: aload #7
    //   3527: arraylength
    //   3528: iconst_1
    //   3529: isub
    //   3530: aload #5
    //   3532: arraylength
    //   3533: bipush #8
    //   3535: imul
    //   3536: iastore
    //   3537: bipush #80
    //   3539: newarray int
    //   3541: astore #9
    //   3543: ldc 1732584193
    //   3545: istore #10
    //   3547: ldc -271733879
    //   3549: istore #11
    //   3551: ldc -1732584194
    //   3553: istore #12
    //   3555: ldc 271733878
    //   3557: istore #13
    //   3559: ldc -1009589776
    //   3561: istore #14
    //   3563: iconst_0
    //   3564: istore #8
    //   3566: iload #8
    //   3568: aload #7
    //   3570: arraylength
    //   3571: if_icmpge -> 3893
    //   3574: iload #10
    //   3576: istore #15
    //   3578: iload #11
    //   3580: istore #16
    //   3582: iload #12
    //   3584: istore #17
    //   3586: iload #13
    //   3588: istore #18
    //   3590: iload #14
    //   3592: istore #19
    //   3594: iconst_0
    //   3595: istore #20
    //   3597: iload #20
    //   3599: bipush #80
    //   3601: if_icmpge -> 3851
    //   3604: iload #20
    //   3606: bipush #16
    //   3608: if_icmpge -> 3635
    //   3611: aload #9
    //   3613: iload #20
    //   3615: aload #7
    //   3617: iload #8
    //   3619: iload #20
    //   3621: iadd
    //   3622: iaload
    //   3623: iastore
    //   3624: iload_2
    //   3625: ifne -> 3690
    //   3628: goto -> 3635
    //   3631: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3634: athrow
    //   3635: aload #9
    //   3637: iload #20
    //   3639: iconst_3
    //   3640: isub
    //   3641: iaload
    //   3642: aload #9
    //   3644: iload #20
    //   3646: bipush #8
    //   3648: isub
    //   3649: iaload
    //   3650: ixor
    //   3651: aload #9
    //   3653: iload #20
    //   3655: bipush #14
    //   3657: isub
    //   3658: iaload
    //   3659: ixor
    //   3660: aload #9
    //   3662: iload #20
    //   3664: bipush #16
    //   3666: isub
    //   3667: iaload
    //   3668: ixor
    //   3669: istore #21
    //   3671: iload #21
    //   3673: iconst_1
    //   3674: ishl
    //   3675: iload #21
    //   3677: bipush #31
    //   3679: iushr
    //   3680: ior
    //   3681: istore #22
    //   3683: aload #9
    //   3685: iload #20
    //   3687: iload #22
    //   3689: iastore
    //   3690: iload #10
    //   3692: iconst_5
    //   3693: ishl
    //   3694: iload #10
    //   3696: bipush #27
    //   3698: iushr
    //   3699: ior
    //   3700: istore #21
    //   3702: iload #21
    //   3704: iload #14
    //   3706: iadd
    //   3707: aload #9
    //   3709: iload #20
    //   3711: iaload
    //   3712: iadd
    //   3713: iload #20
    //   3715: bipush #20
    //   3717: if_icmpge -> 3743
    //   3720: ldc 1518500249
    //   3722: iload #11
    //   3724: iload #12
    //   3726: iand
    //   3727: iload #11
    //   3729: iconst_m1
    //   3730: ixor
    //   3731: iload #13
    //   3733: iand
    //   3734: ior
    //   3735: iadd
    //   3736: goto -> 3813
    //   3739: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3742: athrow
    //   3743: iload #20
    //   3745: bipush #40
    //   3747: if_icmpge -> 3768
    //   3750: ldc 1859775393
    //   3752: iload #11
    //   3754: iload #12
    //   3756: ixor
    //   3757: iload #13
    //   3759: ixor
    //   3760: iadd
    //   3761: goto -> 3813
    //   3764: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3767: athrow
    //   3768: iload #20
    //   3770: bipush #60
    //   3772: if_icmpge -> 3802
    //   3775: ldc -1894007588
    //   3777: iload #11
    //   3779: iload #12
    //   3781: iand
    //   3782: iload #11
    //   3784: iload #13
    //   3786: iand
    //   3787: ior
    //   3788: iload #12
    //   3790: iload #13
    //   3792: iand
    //   3793: ior
    //   3794: iadd
    //   3795: goto -> 3813
    //   3798: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3801: athrow
    //   3802: ldc -899497514
    //   3804: iload #11
    //   3806: iload #12
    //   3808: ixor
    //   3809: iload #13
    //   3811: ixor
    //   3812: iadd
    //   3813: iadd
    //   3814: istore #22
    //   3816: iload #13
    //   3818: istore #14
    //   3820: iload #12
    //   3822: istore #13
    //   3824: iload #11
    //   3826: bipush #30
    //   3828: ishl
    //   3829: iload #11
    //   3831: iconst_2
    //   3832: iushr
    //   3833: ior
    //   3834: istore #12
    //   3836: iload #10
    //   3838: istore #11
    //   3840: iload #22
    //   3842: istore #10
    //   3844: iinc #20, 1
    //   3847: iload_2
    //   3848: ifne -> 3597
    //   3851: iload #10
    //   3853: iload #15
    //   3855: iadd
    //   3856: istore #10
    //   3858: iload #11
    //   3860: iload #16
    //   3862: iadd
    //   3863: istore #11
    //   3865: iload #12
    //   3867: iload #17
    //   3869: iadd
    //   3870: istore #12
    //   3872: iload #13
    //   3874: iload #18
    //   3876: iadd
    //   3877: istore #13
    //   3879: iload #14
    //   3881: iload #19
    //   3883: iadd
    //   3884: istore #14
    //   3886: iinc #8, 16
    //   3889: iload_2
    //   3890: ifne -> 3566
    //   3893: iconst_5
    //   3894: newarray int
    //   3896: dup
    //   3897: iconst_0
    //   3898: iload #10
    //   3900: iastore
    //   3901: dup
    //   3902: iconst_1
    //   3903: iload #11
    //   3905: iastore
    //   3906: dup
    //   3907: iconst_2
    //   3908: iload #12
    //   3910: iastore
    //   3911: dup
    //   3912: iconst_3
    //   3913: iload #13
    //   3915: iastore
    //   3916: dup
    //   3917: iconst_4
    //   3918: iload #14
    //   3920: iastore
    //   3921: astore #15
    //   3923: bipush #20
    //   3925: newarray byte
    //   3927: astore #16
    //   3929: iconst_0
    //   3930: istore #17
    //   3932: iload #17
    //   3934: bipush #20
    //   3936: if_icmpge -> 3977
    //   3939: aload #15
    //   3941: iload #17
    //   3943: iconst_4
    //   3944: idiv
    //   3945: iaload
    //   3946: istore #18
    //   3948: iconst_3
    //   3949: iload #17
    //   3951: iconst_4
    //   3952: irem
    //   3953: isub
    //   3954: bipush #8
    //   3956: imul
    //   3957: istore #19
    //   3959: aload #16
    //   3961: iload #17
    //   3963: iload #18
    //   3965: iload #19
    //   3967: iushr
    //   3968: i2b
    //   3969: bastore
    //   3970: iinc #17, 1
    //   3973: iload_2
    //   3974: ifne -> 3932
    //   3977: aload #16
    //   3979: astore #6
    //   3981: getstatic burp/Zlav.ZW : Ljava/lang/String;
    //   3984: getstatic burp/Zvos.Zr : Ljava/lang/Object;
    //   3987: checkcast java/math/BigInteger
    //   3990: invokevirtual intValue : ()I
    //   3993: bipush #32
    //   3995: irem
    //   3996: invokestatic abs : (I)I
    //   3999: invokevirtual charAt : (I)C
    //   4002: getstatic burp/Zblv.ZF : Ljava/lang/String;
    //   4005: getstatic burp/Zgw0.ZM : Ljava/lang/Object;
    //   4008: checkcast java/math/BigInteger
    //   4011: invokevirtual intValue : ()I
    //   4014: bipush #32
    //   4016: irem
    //   4017: invokestatic abs : (I)I
    //   4020: invokevirtual charAt : (I)C
    //   4023: if_icmple -> 4130
    //   4026: getstatic burp/Zenr.Z_ : Ljava/lang/String;
    //   4029: getstatic burp/Zl1e.Zp : Ljava/lang/Object;
    //   4032: checkcast java/math/BigInteger
    //   4035: invokevirtual intValue : ()I
    //   4038: bipush #32
    //   4040: irem
    //   4041: invokestatic abs : (I)I
    //   4044: invokevirtual charAt : (I)C
    //   4047: getstatic burp/Zzxa.Zl : Ljava/lang/String;
    //   4050: getstatic burp/Zbo2.ZQ : Ljava/lang/Object;
    //   4053: checkcast java/math/BigInteger
    //   4056: invokevirtual intValue : ()I
    //   4059: bipush #32
    //   4061: irem
    //   4062: invokestatic abs : (I)I
    //   4065: invokevirtual charAt : (I)C
    //   4068: if_icmpgt -> 4130
    //   4071: goto -> 4078
    //   4074: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4077: athrow
    //   4078: getstatic burp/Zrva.Zr : Ljava/lang/String;
    //   4081: getstatic burp/Ze4x.Zp : Ljava/lang/Object;
    //   4084: checkcast java/math/BigInteger
    //   4087: invokevirtual intValue : ()I
    //   4090: bipush #32
    //   4092: irem
    //   4093: invokestatic abs : (I)I
    //   4096: invokevirtual charAt : (I)C
    //   4099: getstatic burp/Zein.ZN : Ljava/lang/String;
    //   4102: getstatic burp/Zgjj.ZW : Ljava/lang/Object;
    //   4105: checkcast java/math/BigInteger
    //   4108: invokevirtual intValue : ()I
    //   4111: bipush #32
    //   4113: irem
    //   4114: invokestatic abs : (I)I
    //   4117: invokevirtual charAt : (I)C
    //   4120: if_icmple -> 4138
    //   4123: goto -> 4130
    //   4126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4129: athrow
    //   4130: iconst_1
    //   4131: goto -> 4139
    //   4134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4137: athrow
    //   4138: iconst_0
    //   4139: ireturn
    //   4140: astore_3
    //   4141: new java/lang/Exception
    //   4144: dup
    //   4145: aload_3
    //   4146: invokevirtual getMessage : ()Ljava/lang/String;
    //   4149: invokespecial <init> : (Ljava/lang/String;)V
    //   4152: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4139	4140	java/lang/Throwable
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
    //   1381	1555	1558	java/lang/Throwable
    //   1524	1593	1596	java/lang/Throwable
    //   1562	1631	1634	java/lang/Throwable
    //   1600	1669	1672	java/lang/Throwable
    //   1638	1707	1710	java/lang/Throwable
    //   1676	1745	1748	java/lang/Throwable
    //   1714	1783	1786	java/lang/Throwable
    //   1752	1821	1824	java/lang/Throwable
    //   1790	1859	1862	java/lang/Throwable
    //   1828	1897	1900	java/lang/Throwable
    //   1866	1935	1938	java/lang/Throwable
    //   1904	1973	1976	java/lang/Throwable
    //   1942	2011	2014	java/lang/Throwable
    //   1980	2049	2052	java/lang/Throwable
    //   2018	2087	2090	java/lang/Throwable
    //   2056	2125	2128	java/lang/Throwable
    //   2094	2163	2166	java/lang/Throwable
    //   2132	2201	2204	java/lang/Throwable
    //   2170	2239	2242	java/lang/Throwable
    //   2208	2277	2280	java/lang/Throwable
    //   2246	2315	2318	java/lang/Throwable
    //   2284	2353	2356	java/lang/Throwable
    //   2322	2391	2394	java/lang/Throwable
    //   2360	2429	2432	java/lang/Throwable
    //   2398	2467	2470	java/lang/Throwable
    //   2436	2505	2508	java/lang/Throwable
    //   2474	2543	2546	java/lang/Throwable
    //   2512	2581	2584	java/lang/Throwable
    //   2550	2619	2622	java/lang/Throwable
    //   2588	2657	2660	java/lang/Throwable
    //   2626	2695	2698	java/lang/Throwable
    //   2664	2729	2732	java/lang/Throwable
    //   2796	2810	2810	java/lang/Throwable
    //   2821	2834	2837	java/lang/Throwable
    //   2826	2849	2852	java/lang/Throwable
    //   2841	2867	2870	java/lang/Throwable
    //   2856	2897	2900	java/lang/Throwable
    //   2963	2990	2993	java/lang/Throwable
    //   2980	3008	3011	java/lang/Throwable
    //   2997	3038	3041	java/lang/Throwable
    //   3015	3049	3049	java/lang/Throwable
    //   3060	3076	3079	java/lang/Throwable
    //   3128	3142	3142	java/lang/Throwable
    //   3153	3166	3169	java/lang/Throwable
    //   3158	3181	3184	java/lang/Throwable
    //   3173	3199	3202	java/lang/Throwable
    //   3188	3229	3232	java/lang/Throwable
    //   3295	3322	3325	java/lang/Throwable
    //   3312	3343	3346	java/lang/Throwable
    //   3329	3373	3376	java/lang/Throwable
    //   3350	3384	3384	java/lang/Throwable
    //   3395	3411	3414	java/lang/Throwable
    //   3604	3628	3631	java/lang/Throwable
    //   3702	3739	3739	java/lang/Throwable
    //   3743	3764	3764	java/lang/Throwable
    //   3768	3798	3798	java/lang/Throwable
    //   3981	4071	4074	java/lang/Throwable
    //   4026	4123	4126	java/lang/Throwable
    //   4078	4134	4134	java/lang/Throwable
  }
  
  static void ZE(Object paramObject) {
    Zgl2.Zw = a(-10748, 14484);
    Zgl2.ZS = new BigInteger(a(-10737, -2380));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zm14.ZE.charAt(Math.abs(((BigInteger)Zefn.ZJ).intValue() % 32)) <= Zs56.ZW.charAt(Math.abs(((BigInteger)Zeai.ZI).intValue() % 32))) {
          try {
            Zzxa.Zq(Class.forName(a(-10740, -17819)));
            if (bool)
              Ztc2.ZQ(Class.forName(a(-10749, -25434))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztc2.ZQ(Class.forName(a(-10749, -25434)));
    } catch (Throwable throwable) {}
  }
  
  static void Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ïWÖÓ{"\\nä ì¼ö'!3(FE'E¥+°Á{ý_»cÏç§â£ü"\\nÁ B²­í(ÿZ!ùi§2Aãß\\fxZïÇ2ÈGi\\ténôcÆ\\b°Î\\t{þDæ)@ð¡P}!\\t4­éeòÉXLxÍS }×»á¸¤Î),­s)XvÒ&ú©`,pª».ÑYcÚÃÃ»èao? w»ZjÚôÎ\\b\\b;1eS¾_éîS¸ïVÉá \\tîKöPR%ë'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #74
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
    //   68: ldc '§¿Q\\r«uÃá:ÛªµÑ=.,§6"rOA\­Ð±§ñµ¿B\\rg Dadk?¤çFý3ÛâÓ°ÔfzëÌW-réÏ¾]\\tÕD¾éù'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #49
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
    //   129: putstatic burp/Ztsc.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztsc.b : [Ljava/lang/String;
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
    //   212: bipush #26
    //   214: goto -> 244
    //   217: bipush #69
    //   219: goto -> 244
    //   222: bipush #55
    //   224: goto -> 244
    //   227: bipush #57
    //   229: goto -> 244
    //   232: bipush #86
    //   234: goto -> 244
    //   237: bipush #88
    //   239: goto -> 244
    //   242: bipush #53
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
    //   300: sipush #-10745
    //   303: sipush #32286
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Ztsc.ZL : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-10750
    //   319: sipush #-2548
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Ztsc.Zr : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD605) & 0xFFFF;
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
      char c = '¿';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztsc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */