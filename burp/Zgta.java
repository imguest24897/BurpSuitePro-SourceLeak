package burp;

import java.math.BigInteger;

class Zgta extends ClassLoader {
  static Object ZF;
  
  static String ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZL(Object paramObject) {
    Ztkc.ZU = a(31407, 7444);
    Ztkc.ZV = new BigInteger(a(31419, -6142));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zb2k.Zu.charAt(Math.abs(((BigInteger)ZF).intValue() % 32)) <= Zgwu.Zd.charAt(Math.abs(((BigInteger)Ztd3.ZX).intValue() % 32))) {
          try {
            Zl55.Zv(Class.forName(a(31398, -13556)));
            if (bool)
              Zss6.Zx(Class.forName(a(31406, -4801))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zss6.Zx(Class.forName(a(31406, -4801)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zrhu.ZJ : Ljava/lang/String;
    //   172: getstatic burp/Zg2.ZE : Ljava/lang/Object;
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
    //   206: getstatic burp/Zlnq.ZQ : Ljava/lang/String;
    //   209: getstatic burp/Zbzc.Zp : Ljava/lang/Object;
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
    //   243: getstatic burp/Zmtf.Zx : Ljava/lang/String;
    //   246: getstatic burp/Zzbr.ZC : Ljava/lang/Object;
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
    //   280: getstatic burp/Zlo2.ZJ : Ljava/lang/String;
    //   283: getstatic burp/Zm5p.Ze : Ljava/lang/Object;
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
    //   317: getstatic burp/Zr04.ZA : Ljava/lang/String;
    //   320: getstatic burp/Zeqo.ZZ : Ljava/lang/Object;
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
    //   354: getstatic burp/Zlr2.ZV : Ljava/lang/String;
    //   357: getstatic burp/Zm8i.Zm : Ljava/lang/Object;
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
    //   391: getstatic burp/Zlav.ZW : Ljava/lang/String;
    //   394: getstatic burp/Zlnq.ZO : Ljava/lang/Object;
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
    //   428: getstatic burp/Zx_x.Zv : Ljava/lang/String;
    //   431: getstatic burp/Zlps.ZU : Ljava/lang/Object;
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
    //   465: getstatic burp/Zlsw.ZE : Ljava/lang/String;
    //   468: getstatic burp/Zlav.Zp : Ljava/lang/Object;
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
    //   502: getstatic burp/Zztz.Zp : Ljava/lang/String;
    //   505: getstatic burp/Ztd3.ZX : Ljava/lang/Object;
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
    //   539: getstatic burp/Zzok.ZC : Ljava/lang/String;
    //   542: getstatic burp/Zgwu.ZD : Ljava/lang/Object;
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
    //   576: getstatic burp/Zm8i.Z_ : Ljava/lang/String;
    //   579: getstatic burp/Zz3w.ZX : Ljava/lang/Object;
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
    //   613: getstatic burp/Zzpu.Zq : Ljava/lang/String;
    //   616: getstatic burp/Zkco.Zg : Ljava/lang/Object;
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
    //   650: getstatic burp/Zefm.ZK : Ljava/lang/String;
    //   653: getstatic burp/Zeor.Zb : Ljava/lang/Object;
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
    //   687: getstatic burp/Zkco.Zz : Ljava/lang/String;
    //   690: getstatic burp/Zb0z.ZQ : Ljava/lang/Object;
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
    //   724: getstatic burp/Zx4y.Zh : Ljava/lang/String;
    //   727: getstatic burp/Zzou.Zz : Ljava/lang/Object;
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
    //   761: getstatic burp/Zztz.Zp : Ljava/lang/String;
    //   764: getstatic burp/Zbp_.Zi : Ljava/lang/Object;
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
    //   798: getstatic burp/Zb14.Ze : Ljava/lang/String;
    //   801: getstatic burp/Zb9h.Zm : Ljava/lang/Object;
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
    //   835: getstatic burp/Zmji.Zs : Ljava/lang/String;
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
    //   872: getstatic burp/Zrhu.ZJ : Ljava/lang/String;
    //   875: getstatic burp/Zb14.ZT : Ljava/lang/Object;
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
    //   909: getstatic burp/Zkco.Zz : Ljava/lang/String;
    //   912: getstatic burp/Zkco.Zg : Ljava/lang/Object;
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
    //   946: getstatic burp/Zmt7.Zl : Ljava/lang/String;
    //   949: getstatic burp/Zlsw.ZJ : Ljava/lang/Object;
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
    //   983: getstatic burp/Zx8t.Zi : Ljava/lang/String;
    //   986: getstatic burp/Zz3w.ZX : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zx_s.Za : Ljava/lang/String;
    //   1023: getstatic burp/Zgt6.ZU : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zrhu.ZJ : Ljava/lang/String;
    //   1060: getstatic burp/Zbp_.Zi : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zdk.Ze : Ljava/lang/String;
    //   1097: getstatic burp/Zgw_.Zf : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zlna.Zo : Ljava/lang/String;
    //   1134: getstatic burp/Zm5p.Ze : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zrod.ZQ : Ljava/lang/String;
    //   1171: getstatic burp/Zkco.Zg : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zss6.ZN : Ljava/lang/String;
    //   1208: getstatic burp/Zx8t.ZA : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zbzc.ZL : Ljava/lang/String;
    //   1245: getstatic burp/Zbzc.Zp : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zme.Zp : Ljava/lang/String;
    //   1282: getstatic burp/Zss6.ZG : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zmt7.Zl : Ljava/lang/String;
    //   1319: getstatic burp/Zzok.ZY : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zzxs.Zd : Ljava/lang/String;
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
    //   1526: getstatic burp/Zlr2.ZV : Ljava/lang/String;
    //   1529: getstatic burp/Zmpp.Z_ : Ljava/lang/Object;
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
    //   1564: getstatic burp/Zgkn.ZV : Ljava/lang/String;
    //   1567: getstatic burp/Zefm.ZP : Ljava/lang/Object;
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
    //   1602: getstatic burp/Ztkc.ZU : Ljava/lang/String;
    //   1605: getstatic burp/Zgta.ZF : Ljava/lang/Object;
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
    //   1640: getstatic burp/Zry0.Zz : Ljava/lang/String;
    //   1643: getstatic burp/Zss6.ZG : Ljava/lang/Object;
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
    //   1678: getstatic burp/Zdk.Ze : Ljava/lang/String;
    //   1681: getstatic burp/Zx8t.ZA : Ljava/lang/Object;
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
    //   1716: getstatic burp/Zme.Zp : Ljava/lang/String;
    //   1719: getstatic burp/Zxtc.ZF : Ljava/lang/Object;
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
    //   1754: getstatic burp/Zgt7.ZO : Ljava/lang/String;
    //   1757: getstatic burp/Zrhu.Zs : Ljava/lang/Object;
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
    //   1792: getstatic burp/Zeor.Zj : Ljava/lang/String;
    //   1795: getstatic burp/Zztz.Zq : Ljava/lang/Object;
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
    //   1830: getstatic burp/Zeb3.ZG : Ljava/lang/String;
    //   1833: getstatic burp/Zrpy.ZG : Ljava/lang/Object;
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
    //   1868: getstatic burp/Zmrc.Zx : Ljava/lang/String;
    //   1871: getstatic burp/Zeb3.Zb : Ljava/lang/Object;
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
    //   1906: getstatic burp/Zlpn.ZF : Ljava/lang/String;
    //   1909: getstatic burp/Zxpb.Zo : Ljava/lang/Object;
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
    //   1944: getstatic burp/Zrod.ZQ : Ljava/lang/String;
    //   1947: getstatic burp/Zlav.Zp : Ljava/lang/Object;
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
    //   1982: getstatic burp/Zeqo.Zw : Ljava/lang/String;
    //   1985: getstatic burp/Zxpb.Zo : Ljava/lang/Object;
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
    //   2020: getstatic burp/Zmzh.Zm : Ljava/lang/String;
    //   2023: getstatic burp/Zzok.ZY : Ljava/lang/Object;
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
    //   2058: getstatic burp/Zzh0.ZK : Ljava/lang/String;
    //   2061: getstatic burp/Zkf9.ZX : Ljava/lang/Object;
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
    //   2096: getstatic burp/Zgwu.Zd : Ljava/lang/String;
    //   2099: getstatic burp/Zxpb.Zo : Ljava/lang/Object;
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
    //   2134: getstatic burp/Zztz.Zp : Ljava/lang/String;
    //   2137: getstatic burp/Zry0.Zr : Ljava/lang/Object;
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
    //   2172: getstatic burp/Zx4y.Zh : Ljava/lang/String;
    //   2175: getstatic burp/Ztys.Zs : Ljava/lang/Object;
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
    //   2210: getstatic burp/Zldt.Zj : Ljava/lang/String;
    //   2213: getstatic burp/Zmtf.ZH : Ljava/lang/Object;
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
    //   2248: getstatic burp/Zgt6.Zu : Ljava/lang/String;
    //   2251: getstatic burp/Zkco.Zg : Ljava/lang/Object;
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
    //   2286: getstatic burp/Zkco.Zz : Ljava/lang/String;
    //   2289: getstatic burp/Zrs0.Zz : Ljava/lang/Object;
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
    //   2324: getstatic burp/Ztkc.ZU : Ljava/lang/String;
    //   2327: getstatic burp/Zb0z.ZQ : Ljava/lang/Object;
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
    //   2362: getstatic burp/Zgkn.ZV : Ljava/lang/String;
    //   2365: getstatic burp/Zg2.ZE : Ljava/lang/Object;
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
    //   2400: getstatic burp/Zrhu.ZJ : Ljava/lang/String;
    //   2403: getstatic burp/Zeor.Zb : Ljava/lang/Object;
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
    //   2438: getstatic burp/Zx_x.Zv : Ljava/lang/String;
    //   2441: getstatic burp/Zzpu.ZS : Ljava/lang/Object;
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
    //   2476: getstatic burp/Zbp_.ZQ : Ljava/lang/String;
    //   2479: getstatic burp/Zefm.ZP : Ljava/lang/Object;
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
    //   2514: getstatic burp/Zmlu.ZF : Ljava/lang/String;
    //   2517: getstatic burp/Zeb3.Zb : Ljava/lang/Object;
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
    //   2552: getstatic burp/Zlo2.ZJ : Ljava/lang/String;
    //   2555: getstatic burp/Zmlu.Zi : Ljava/lang/Object;
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
    //   2590: getstatic burp/Zlr2.ZV : Ljava/lang/String;
    //   2593: getstatic burp/Zkf9.ZX : Ljava/lang/Object;
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
    //   2628: getstatic burp/Zbp_.ZQ : Ljava/lang/String;
    //   2631: getstatic burp/Zkf9.ZX : Ljava/lang/Object;
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
    //   2666: getstatic burp/Zg2.ZN : Ljava/lang/String;
    //   2669: getstatic burp/Zkfa.Zw : Ljava/lang/Object;
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
    //   2704: getstatic burp/Zmlu.ZF : Ljava/lang/String;
    //   2707: getstatic burp/Zmrc.ZU : Ljava/lang/Object;
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
    //   2748: putstatic burp/Zx4y.Zh : Ljava/lang/String;
    //   2751: sipush #31394
    //   2754: sipush #-5833
    //   2757: invokestatic a : (II)Ljava/lang/String;
    //   2760: iconst_1
    //   2761: ldc burp/Zlhm
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
    //   2882: sipush #31399
    //   2885: sipush #-14638
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
    //   2924: sipush #31402
    //   2927: sipush #13992
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
    //   2953: if_icmpge -> 3086
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
    //   2977: ifeq -> 3072
    //   2980: aload #8
    //   2982: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2985: arraylength
    //   2986: iconst_2
    //   2987: if_icmpne -> 3072
    //   2990: goto -> 2997
    //   2993: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2996: athrow
    //   2997: aload #8
    //   2999: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3002: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   3005: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3008: ifeq -> 3072
    //   3011: goto -> 3018
    //   3014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3017: athrow
    //   3018: aload #8
    //   3020: iconst_1
    //   3021: invokevirtual setAccessible : (Z)V
    //   3024: aload #8
    //   3026: aconst_null
    //   3027: iconst_2
    //   3028: anewarray java/lang/Object
    //   3031: dup
    //   3032: iconst_0
    //   3033: aload_0
    //   3034: aastore
    //   3035: dup
    //   3036: iconst_1
    //   3037: aload_1
    //   3038: ifnonnull -> 3056
    //   3041: goto -> 3048
    //   3044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3047: athrow
    //   3048: aload_1
    //   3049: goto -> 3063
    //   3052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3055: athrow
    //   3056: aload_1
    //   3057: checkcast [B
    //   3060: invokevirtual clone : ()Ljava/lang/Object;
    //   3063: aastore
    //   3064: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3067: pop
    //   3068: iload_2
    //   3069: ifne -> 3086
    //   3072: iinc #7, 1
    //   3075: iload_2
    //   3076: ifne -> 2949
    //   3079: goto -> 3086
    //   3082: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3085: athrow
    //   3086: getstatic burp/Zro5.ZT : Ljava/lang/Object;
    //   3089: checkcast java/math/BigInteger
    //   3092: invokevirtual toByteArray : ()[B
    //   3095: astore #5
    //   3097: aload #5
    //   3099: arraylength
    //   3100: iconst_2
    //   3101: iadd
    //   3102: newarray byte
    //   3104: astore #7
    //   3106: iconst_0
    //   3107: istore #8
    //   3109: iload #8
    //   3111: aload #5
    //   3113: arraylength
    //   3114: if_icmpge -> 3134
    //   3117: aload #7
    //   3119: iload #8
    //   3121: aload #5
    //   3123: iload #8
    //   3125: baload
    //   3126: bastore
    //   3127: iinc #8, 1
    //   3130: iload_2
    //   3131: ifne -> 3109
    //   3134: aload #7
    //   3136: arraylength
    //   3137: iconst_3
    //   3138: idiv
    //   3139: iconst_4
    //   3140: imul
    //   3141: newarray byte
    //   3143: astore #6
    //   3145: iconst_0
    //   3146: istore #8
    //   3148: iconst_0
    //   3149: istore #9
    //   3151: iload #8
    //   3153: aload #5
    //   3155: arraylength
    //   3156: if_icmpge -> 3267
    //   3159: aload #6
    //   3161: iload #9
    //   3163: aload #7
    //   3165: iload #8
    //   3167: baload
    //   3168: iconst_2
    //   3169: iushr
    //   3170: bipush #63
    //   3172: iand
    //   3173: i2b
    //   3174: bastore
    //   3175: aload #6
    //   3177: iload #9
    //   3179: iconst_1
    //   3180: iadd
    //   3181: aload #7
    //   3183: iload #8
    //   3185: iconst_1
    //   3186: iadd
    //   3187: baload
    //   3188: iconst_4
    //   3189: iushr
    //   3190: bipush #15
    //   3192: iand
    //   3193: aload #7
    //   3195: iload #8
    //   3197: baload
    //   3198: iconst_4
    //   3199: ishl
    //   3200: bipush #63
    //   3202: iand
    //   3203: ior
    //   3204: i2b
    //   3205: bastore
    //   3206: aload #6
    //   3208: iload #9
    //   3210: iconst_2
    //   3211: iadd
    //   3212: aload #7
    //   3214: iload #8
    //   3216: iconst_2
    //   3217: iadd
    //   3218: baload
    //   3219: bipush #6
    //   3221: iushr
    //   3222: iconst_3
    //   3223: iand
    //   3224: aload #7
    //   3226: iload #8
    //   3228: iconst_1
    //   3229: iadd
    //   3230: baload
    //   3231: iconst_2
    //   3232: ishl
    //   3233: bipush #63
    //   3235: iand
    //   3236: ior
    //   3237: i2b
    //   3238: bastore
    //   3239: aload #6
    //   3241: iload #9
    //   3243: iconst_3
    //   3244: iadd
    //   3245: aload #7
    //   3247: iload #8
    //   3249: iconst_2
    //   3250: iadd
    //   3251: baload
    //   3252: bipush #63
    //   3254: iand
    //   3255: i2b
    //   3256: bastore
    //   3257: iinc #8, 3
    //   3260: iinc #9, 4
    //   3263: iload_2
    //   3264: ifne -> 3151
    //   3267: iconst_0
    //   3268: istore #8
    //   3270: iload #8
    //   3272: aload #6
    //   3274: arraylength
    //   3275: if_icmpge -> 3459
    //   3278: aload #6
    //   3280: iload #8
    //   3282: baload
    //   3283: bipush #26
    //   3285: if_icmpge -> 3313
    //   3288: aload #6
    //   3290: iload #8
    //   3292: aload #6
    //   3294: iload #8
    //   3296: baload
    //   3297: bipush #65
    //   3299: iadd
    //   3300: i2b
    //   3301: bastore
    //   3302: iload_2
    //   3303: ifne -> 3452
    //   3306: goto -> 3313
    //   3309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3312: athrow
    //   3313: aload #6
    //   3315: iload #8
    //   3317: baload
    //   3318: bipush #52
    //   3320: if_icmpge -> 3358
    //   3323: goto -> 3330
    //   3326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3329: athrow
    //   3330: aload #6
    //   3332: iload #8
    //   3334: aload #6
    //   3336: iload #8
    //   3338: baload
    //   3339: bipush #97
    //   3341: iadd
    //   3342: bipush #26
    //   3344: isub
    //   3345: i2b
    //   3346: bastore
    //   3347: iload_2
    //   3348: ifne -> 3452
    //   3351: goto -> 3358
    //   3354: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3357: athrow
    //   3358: aload #6
    //   3360: iload #8
    //   3362: baload
    //   3363: bipush #62
    //   3365: if_icmpge -> 3403
    //   3368: goto -> 3375
    //   3371: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3374: athrow
    //   3375: aload #6
    //   3377: iload #8
    //   3379: aload #6
    //   3381: iload #8
    //   3383: baload
    //   3384: bipush #48
    //   3386: iadd
    //   3387: bipush #52
    //   3389: isub
    //   3390: i2b
    //   3391: bastore
    //   3392: iload_2
    //   3393: ifne -> 3452
    //   3396: goto -> 3403
    //   3399: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3402: athrow
    //   3403: aload #6
    //   3405: iload #8
    //   3407: baload
    //   3408: bipush #63
    //   3410: if_icmpge -> 3438
    //   3413: goto -> 3420
    //   3416: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3419: athrow
    //   3420: aload #6
    //   3422: iload #8
    //   3424: bipush #43
    //   3426: bastore
    //   3427: iload_2
    //   3428: ifne -> 3452
    //   3431: goto -> 3438
    //   3434: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3437: athrow
    //   3438: aload #6
    //   3440: iload #8
    //   3442: bipush #47
    //   3444: bastore
    //   3445: goto -> 3452
    //   3448: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3451: athrow
    //   3452: iinc #8, 1
    //   3455: iload_2
    //   3456: ifne -> 3270
    //   3459: aload #6
    //   3461: arraylength
    //   3462: iconst_1
    //   3463: isub
    //   3464: istore #8
    //   3466: iload #8
    //   3468: aload #5
    //   3470: arraylength
    //   3471: iconst_4
    //   3472: imul
    //   3473: iconst_3
    //   3474: idiv
    //   3475: if_icmple -> 3492
    //   3478: aload #6
    //   3480: iload #8
    //   3482: bipush #61
    //   3484: bastore
    //   3485: iinc #8, -1
    //   3488: iload_2
    //   3489: ifne -> 3466
    //   3492: iconst_0
    //   3493: istore #5
    //   3495: getstatic burp/Zkco.Zz : Ljava/lang/String;
    //   3498: getstatic burp/Zx8t.ZA : Ljava/lang/Object;
    //   3501: checkcast java/math/BigInteger
    //   3504: invokevirtual intValue : ()I
    //   3507: bipush #32
    //   3509: irem
    //   3510: invokestatic abs : (I)I
    //   3513: invokevirtual charAt : (I)C
    //   3516: getstatic burp/Zrod.ZQ : Ljava/lang/String;
    //   3519: getstatic burp/Zzxs.Zg : Ljava/lang/Object;
    //   3522: checkcast java/math/BigInteger
    //   3525: invokevirtual intValue : ()I
    //   3528: bipush #32
    //   3530: irem
    //   3531: invokestatic abs : (I)I
    //   3534: invokevirtual charAt : (I)C
    //   3537: if_icmpgt -> 3882
    //   3540: sipush #31393
    //   3543: sipush #6094
    //   3546: invokestatic a : (II)Ljava/lang/String;
    //   3549: iconst_1
    //   3550: ldc burp/Zsxj
    //   3552: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3555: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3558: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3561: astore #6
    //   3563: aload #6
    //   3565: arraylength
    //   3566: istore #7
    //   3568: iconst_0
    //   3569: istore #8
    //   3571: iload #8
    //   3573: iload #7
    //   3575: if_icmpge -> 3713
    //   3578: aload #6
    //   3580: iload #8
    //   3582: aaload
    //   3583: astore #9
    //   3585: aload #9
    //   3587: invokevirtual getModifiers : ()I
    //   3590: invokestatic isStatic : (I)Z
    //   3593: ifne -> 3603
    //   3596: goto -> 3706
    //   3599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3602: athrow
    //   3603: aload #9
    //   3605: invokevirtual getType : ()Ljava/lang/Class;
    //   3608: astore #10
    //   3610: aload #10
    //   3612: ifnull -> 3693
    //   3615: aload #10
    //   3617: invokevirtual isPrimitive : ()Z
    //   3620: ifne -> 3693
    //   3623: goto -> 3630
    //   3626: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3629: athrow
    //   3630: aload #10
    //   3632: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3635: ifnull -> 3693
    //   3638: goto -> 3645
    //   3641: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3644: athrow
    //   3645: aload #10
    //   3647: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3650: invokevirtual getName : ()Ljava/lang/String;
    //   3653: ifnull -> 3693
    //   3656: goto -> 3663
    //   3659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3662: athrow
    //   3663: aload #10
    //   3665: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3668: invokevirtual getName : ()Ljava/lang/String;
    //   3671: sipush #31405
    //   3674: sipush #-2496
    //   3677: invokestatic a : (II)Ljava/lang/String;
    //   3680: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3683: ifne -> 3693
    //   3686: goto -> 3693
    //   3689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3692: athrow
    //   3693: aload #9
    //   3695: iconst_1
    //   3696: invokevirtual setAccessible : (Z)V
    //   3699: aload #9
    //   3701: aconst_null
    //   3702: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3705: pop
    //   3706: iinc #8, 1
    //   3709: iload_2
    //   3710: ifne -> 3571
    //   3713: sipush #31409
    //   3716: sipush #2625
    //   3719: invokestatic a : (II)Ljava/lang/String;
    //   3722: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3725: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3728: astore #6
    //   3730: aload #6
    //   3732: arraylength
    //   3733: istore #7
    //   3735: iconst_0
    //   3736: istore #8
    //   3738: iload #8
    //   3740: iload #7
    //   3742: if_icmpge -> 3879
    //   3745: aload #6
    //   3747: iload #8
    //   3749: aaload
    //   3750: astore #9
    //   3752: aload #9
    //   3754: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3757: pop
    //   3758: aload #9
    //   3760: invokevirtual getModifiers : ()I
    //   3763: invokestatic isStatic : (I)Z
    //   3766: ifeq -> 3865
    //   3769: aload #9
    //   3771: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3774: arraylength
    //   3775: iconst_2
    //   3776: if_icmpne -> 3865
    //   3779: goto -> 3786
    //   3782: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3785: athrow
    //   3786: aload #9
    //   3788: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3791: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3794: if_acmpne -> 3865
    //   3797: goto -> 3804
    //   3800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3803: athrow
    //   3804: aload #9
    //   3806: iconst_1
    //   3807: invokevirtual setAccessible : (Z)V
    //   3810: aload #9
    //   3812: aconst_null
    //   3813: iconst_2
    //   3814: anewarray java/lang/Object
    //   3817: dup
    //   3818: iconst_0
    //   3819: aload_0
    //   3820: aastore
    //   3821: dup
    //   3822: iconst_1
    //   3823: aload_1
    //   3824: ifnonnull -> 3842
    //   3827: goto -> 3834
    //   3830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3833: athrow
    //   3834: aload_1
    //   3835: goto -> 3849
    //   3838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3841: athrow
    //   3842: aload_1
    //   3843: checkcast [B
    //   3846: invokevirtual clone : ()Ljava/lang/Object;
    //   3849: aastore
    //   3850: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3853: checkcast java/lang/Boolean
    //   3856: invokevirtual booleanValue : ()Z
    //   3859: istore #5
    //   3861: iload_2
    //   3862: ifne -> 3879
    //   3865: iinc #8, 1
    //   3868: iload_2
    //   3869: ifne -> 3738
    //   3872: goto -> 3879
    //   3875: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3878: athrow
    //   3879: goto -> 4221
    //   3882: sipush #31418
    //   3885: sipush #7926
    //   3888: invokestatic a : (II)Ljava/lang/String;
    //   3891: iconst_1
    //   3892: ldc burp/Zec_
    //   3894: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3897: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3900: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3903: astore #6
    //   3905: aload #6
    //   3907: arraylength
    //   3908: istore #7
    //   3910: iconst_0
    //   3911: istore #8
    //   3913: iload #8
    //   3915: iload #7
    //   3917: if_icmpge -> 4055
    //   3920: aload #6
    //   3922: iload #8
    //   3924: aaload
    //   3925: astore #9
    //   3927: aload #9
    //   3929: invokevirtual getModifiers : ()I
    //   3932: invokestatic isStatic : (I)Z
    //   3935: ifne -> 3945
    //   3938: goto -> 4048
    //   3941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3944: athrow
    //   3945: aload #9
    //   3947: invokevirtual getType : ()Ljava/lang/Class;
    //   3950: astore #10
    //   3952: aload #10
    //   3954: ifnull -> 4035
    //   3957: aload #10
    //   3959: invokevirtual isPrimitive : ()Z
    //   3962: ifne -> 4035
    //   3965: goto -> 3972
    //   3968: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3971: athrow
    //   3972: aload #10
    //   3974: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3977: ifnull -> 4035
    //   3980: goto -> 3987
    //   3983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3986: athrow
    //   3987: aload #10
    //   3989: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3992: invokevirtual getName : ()Ljava/lang/String;
    //   3995: ifnull -> 4035
    //   3998: goto -> 4005
    //   4001: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4004: athrow
    //   4005: aload #10
    //   4007: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4010: invokevirtual getName : ()Ljava/lang/String;
    //   4013: sipush #31405
    //   4016: sipush #-2496
    //   4019: invokestatic a : (II)Ljava/lang/String;
    //   4022: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4025: ifne -> 4035
    //   4028: goto -> 4035
    //   4031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4034: athrow
    //   4035: aload #9
    //   4037: iconst_1
    //   4038: invokevirtual setAccessible : (Z)V
    //   4041: aload #9
    //   4043: aconst_null
    //   4044: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4047: pop
    //   4048: iinc #8, 1
    //   4051: iload_2
    //   4052: ifne -> 3913
    //   4055: sipush #31421
    //   4058: sipush #27200
    //   4061: invokestatic a : (II)Ljava/lang/String;
    //   4064: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4067: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4070: astore #6
    //   4072: aload #6
    //   4074: arraylength
    //   4075: istore #7
    //   4077: iconst_0
    //   4078: istore #8
    //   4080: iload #8
    //   4082: iload #7
    //   4084: if_icmpge -> 4221
    //   4087: aload #6
    //   4089: iload #8
    //   4091: aaload
    //   4092: astore #9
    //   4094: aload #9
    //   4096: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4099: pop
    //   4100: aload #9
    //   4102: invokevirtual getModifiers : ()I
    //   4105: invokestatic isStatic : (I)Z
    //   4108: ifeq -> 4207
    //   4111: aload #9
    //   4113: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4116: arraylength
    //   4117: iconst_2
    //   4118: if_icmpne -> 4207
    //   4121: goto -> 4128
    //   4124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4127: athrow
    //   4128: aload #9
    //   4130: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4133: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4136: if_acmpne -> 4207
    //   4139: goto -> 4146
    //   4142: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4145: athrow
    //   4146: aload #9
    //   4148: iconst_1
    //   4149: invokevirtual setAccessible : (Z)V
    //   4152: aload #9
    //   4154: aconst_null
    //   4155: iconst_2
    //   4156: anewarray java/lang/Object
    //   4159: dup
    //   4160: iconst_0
    //   4161: aload_0
    //   4162: aastore
    //   4163: dup
    //   4164: iconst_1
    //   4165: aload_1
    //   4166: ifnonnull -> 4184
    //   4169: goto -> 4176
    //   4172: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4175: athrow
    //   4176: aload_1
    //   4177: goto -> 4191
    //   4180: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4183: athrow
    //   4184: aload_1
    //   4185: checkcast [B
    //   4188: invokevirtual clone : ()Ljava/lang/Object;
    //   4191: aastore
    //   4192: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4195: checkcast java/lang/Boolean
    //   4198: invokevirtual booleanValue : ()Z
    //   4201: istore #5
    //   4203: iload_2
    //   4204: ifne -> 4221
    //   4207: iinc #8, 1
    //   4210: iload_2
    //   4211: ifne -> 4080
    //   4214: goto -> 4221
    //   4217: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4220: athrow
    //   4221: iload #5
    //   4223: ifeq -> 4229
    //   4226: iload #5
    //   4228: ireturn
    //   4229: getstatic burp/Zg2.ZN : Ljava/lang/String;
    //   4232: getstatic burp/Zgkn.Zm : Ljava/lang/Object;
    //   4235: checkcast java/math/BigInteger
    //   4238: invokevirtual intValue : ()I
    //   4241: bipush #32
    //   4243: irem
    //   4244: invokestatic abs : (I)I
    //   4247: invokevirtual charAt : (I)C
    //   4250: getstatic burp/Zlpn.ZF : Ljava/lang/String;
    //   4253: getstatic burp/Zx4y.Zc : Ljava/lang/Object;
    //   4256: checkcast java/math/BigInteger
    //   4259: invokevirtual intValue : ()I
    //   4262: bipush #32
    //   4264: irem
    //   4265: invokestatic abs : (I)I
    //   4268: invokevirtual charAt : (I)C
    //   4271: if_icmpgt -> 4617
    //   4274: sipush #31404
    //   4277: sipush #28286
    //   4280: invokestatic a : (II)Ljava/lang/String;
    //   4283: iconst_1
    //   4284: ldc burp/Zz5h
    //   4286: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4289: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4292: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4295: astore #6
    //   4297: aload #6
    //   4299: arraylength
    //   4300: istore #7
    //   4302: iconst_0
    //   4303: istore #8
    //   4305: iload #8
    //   4307: iload #7
    //   4309: if_icmpge -> 4447
    //   4312: aload #6
    //   4314: iload #8
    //   4316: aaload
    //   4317: astore #9
    //   4319: aload #9
    //   4321: invokevirtual getModifiers : ()I
    //   4324: invokestatic isStatic : (I)Z
    //   4327: ifne -> 4337
    //   4330: goto -> 4440
    //   4333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4336: athrow
    //   4337: aload #9
    //   4339: invokevirtual getType : ()Ljava/lang/Class;
    //   4342: astore #10
    //   4344: aload #10
    //   4346: ifnull -> 4427
    //   4349: aload #10
    //   4351: invokevirtual isPrimitive : ()Z
    //   4354: ifne -> 4427
    //   4357: goto -> 4364
    //   4360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4363: athrow
    //   4364: aload #10
    //   4366: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4369: ifnull -> 4427
    //   4372: goto -> 4379
    //   4375: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4378: athrow
    //   4379: aload #10
    //   4381: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4384: invokevirtual getName : ()Ljava/lang/String;
    //   4387: ifnull -> 4427
    //   4390: goto -> 4397
    //   4393: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4396: athrow
    //   4397: aload #10
    //   4399: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4402: invokevirtual getName : ()Ljava/lang/String;
    //   4405: sipush #31405
    //   4408: sipush #-2496
    //   4411: invokestatic a : (II)Ljava/lang/String;
    //   4414: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4417: ifne -> 4427
    //   4420: goto -> 4427
    //   4423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4426: athrow
    //   4427: aload #9
    //   4429: iconst_1
    //   4430: invokevirtual setAccessible : (Z)V
    //   4433: aload #9
    //   4435: aconst_null
    //   4436: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4439: pop
    //   4440: iinc #8, 1
    //   4443: iload_2
    //   4444: ifne -> 4305
    //   4447: sipush #31395
    //   4450: sipush #-8038
    //   4453: invokestatic a : (II)Ljava/lang/String;
    //   4456: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4459: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4462: astore #6
    //   4464: aload #6
    //   4466: arraylength
    //   4467: istore #7
    //   4469: iconst_0
    //   4470: istore #8
    //   4472: iload #8
    //   4474: iload #7
    //   4476: if_icmpge -> 4613
    //   4479: aload #6
    //   4481: iload #8
    //   4483: aaload
    //   4484: astore #9
    //   4486: aload #9
    //   4488: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4491: pop
    //   4492: aload #9
    //   4494: invokevirtual getModifiers : ()I
    //   4497: invokestatic isStatic : (I)Z
    //   4500: ifeq -> 4599
    //   4503: aload #9
    //   4505: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4508: arraylength
    //   4509: iconst_2
    //   4510: if_icmpne -> 4599
    //   4513: goto -> 4520
    //   4516: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4519: athrow
    //   4520: aload #9
    //   4522: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4525: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4528: if_acmpne -> 4599
    //   4531: goto -> 4538
    //   4534: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4537: athrow
    //   4538: aload #9
    //   4540: iconst_1
    //   4541: invokevirtual setAccessible : (Z)V
    //   4544: aload #9
    //   4546: aconst_null
    //   4547: iconst_2
    //   4548: anewarray java/lang/Object
    //   4551: dup
    //   4552: iconst_0
    //   4553: aload_0
    //   4554: aastore
    //   4555: dup
    //   4556: iconst_1
    //   4557: aload_1
    //   4558: ifnonnull -> 4576
    //   4561: goto -> 4568
    //   4564: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4567: athrow
    //   4568: aload_1
    //   4569: goto -> 4583
    //   4572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4575: athrow
    //   4576: aload_1
    //   4577: checkcast [B
    //   4580: invokevirtual clone : ()Ljava/lang/Object;
    //   4583: aastore
    //   4584: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4587: checkcast java/lang/Boolean
    //   4590: invokevirtual booleanValue : ()Z
    //   4593: istore #5
    //   4595: iload_2
    //   4596: ifne -> 4613
    //   4599: iinc #8, 1
    //   4602: iload_2
    //   4603: ifne -> 4472
    //   4606: goto -> 4613
    //   4609: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4612: athrow
    //   4613: iload_2
    //   4614: ifne -> 4956
    //   4617: sipush #31423
    //   4620: sipush #-9496
    //   4623: invokestatic a : (II)Ljava/lang/String;
    //   4626: iconst_1
    //   4627: ldc burp/Zbxa
    //   4629: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4632: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4635: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4638: astore #6
    //   4640: aload #6
    //   4642: arraylength
    //   4643: istore #7
    //   4645: iconst_0
    //   4646: istore #8
    //   4648: iload #8
    //   4650: iload #7
    //   4652: if_icmpge -> 4790
    //   4655: aload #6
    //   4657: iload #8
    //   4659: aaload
    //   4660: astore #9
    //   4662: aload #9
    //   4664: invokevirtual getModifiers : ()I
    //   4667: invokestatic isStatic : (I)Z
    //   4670: ifne -> 4680
    //   4673: goto -> 4783
    //   4676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4679: athrow
    //   4680: aload #9
    //   4682: invokevirtual getType : ()Ljava/lang/Class;
    //   4685: astore #10
    //   4687: aload #10
    //   4689: ifnull -> 4770
    //   4692: aload #10
    //   4694: invokevirtual isPrimitive : ()Z
    //   4697: ifne -> 4770
    //   4700: goto -> 4707
    //   4703: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4706: athrow
    //   4707: aload #10
    //   4709: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4712: ifnull -> 4770
    //   4715: goto -> 4722
    //   4718: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4721: athrow
    //   4722: aload #10
    //   4724: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4727: invokevirtual getName : ()Ljava/lang/String;
    //   4730: ifnull -> 4770
    //   4733: goto -> 4740
    //   4736: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4739: athrow
    //   4740: aload #10
    //   4742: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4745: invokevirtual getName : ()Ljava/lang/String;
    //   4748: sipush #31405
    //   4751: sipush #-2496
    //   4754: invokestatic a : (II)Ljava/lang/String;
    //   4757: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4760: ifne -> 4770
    //   4763: goto -> 4770
    //   4766: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4769: athrow
    //   4770: aload #9
    //   4772: iconst_1
    //   4773: invokevirtual setAccessible : (Z)V
    //   4776: aload #9
    //   4778: aconst_null
    //   4779: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4782: pop
    //   4783: iinc #8, 1
    //   4786: iload_2
    //   4787: ifne -> 4648
    //   4790: sipush #31403
    //   4793: sipush #-252
    //   4796: invokestatic a : (II)Ljava/lang/String;
    //   4799: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4802: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4805: astore #6
    //   4807: aload #6
    //   4809: arraylength
    //   4810: istore #7
    //   4812: iconst_0
    //   4813: istore #8
    //   4815: iload #8
    //   4817: iload #7
    //   4819: if_icmpge -> 4956
    //   4822: aload #6
    //   4824: iload #8
    //   4826: aaload
    //   4827: astore #9
    //   4829: aload #9
    //   4831: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4834: pop
    //   4835: aload #9
    //   4837: invokevirtual getModifiers : ()I
    //   4840: invokestatic isStatic : (I)Z
    //   4843: ifeq -> 4942
    //   4846: aload #9
    //   4848: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4851: arraylength
    //   4852: iconst_2
    //   4853: if_icmpne -> 4942
    //   4856: goto -> 4863
    //   4859: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4862: athrow
    //   4863: aload #9
    //   4865: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4868: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4871: if_acmpne -> 4942
    //   4874: goto -> 4881
    //   4877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4880: athrow
    //   4881: aload #9
    //   4883: iconst_1
    //   4884: invokevirtual setAccessible : (Z)V
    //   4887: aload #9
    //   4889: aconst_null
    //   4890: iconst_2
    //   4891: anewarray java/lang/Object
    //   4894: dup
    //   4895: iconst_0
    //   4896: aload_0
    //   4897: aastore
    //   4898: dup
    //   4899: iconst_1
    //   4900: aload_1
    //   4901: ifnonnull -> 4919
    //   4904: goto -> 4911
    //   4907: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4910: athrow
    //   4911: aload_1
    //   4912: goto -> 4926
    //   4915: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4918: athrow
    //   4919: aload_1
    //   4920: checkcast [B
    //   4923: invokevirtual clone : ()Ljava/lang/Object;
    //   4926: aastore
    //   4927: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4930: checkcast java/lang/Boolean
    //   4933: invokevirtual booleanValue : ()Z
    //   4936: istore #5
    //   4938: iload_2
    //   4939: ifne -> 4956
    //   4942: iinc #8, 1
    //   4945: iload_2
    //   4946: ifne -> 4815
    //   4949: goto -> 4956
    //   4952: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4955: athrow
    //   4956: iload #5
    //   4958: ifeq -> 4964
    //   4961: iload #5
    //   4963: ireturn
    //   4964: getstatic burp/Zmji.Zs : Ljava/lang/String;
    //   4967: getstatic burp/Zztz.Zq : Ljava/lang/Object;
    //   4970: checkcast java/math/BigInteger
    //   4973: invokevirtual intValue : ()I
    //   4976: bipush #32
    //   4978: irem
    //   4979: invokestatic abs : (I)I
    //   4982: invokevirtual charAt : (I)C
    //   4985: getstatic burp/Zlav.ZW : Ljava/lang/String;
    //   4988: getstatic burp/Zscs.Zg : Ljava/lang/Object;
    //   4991: checkcast java/math/BigInteger
    //   4994: invokevirtual intValue : ()I
    //   4997: bipush #32
    //   4999: irem
    //   5000: invokestatic abs : (I)I
    //   5003: invokevirtual charAt : (I)C
    //   5006: if_icmple -> 5352
    //   5009: sipush #31400
    //   5012: sipush #-29718
    //   5015: invokestatic a : (II)Ljava/lang/String;
    //   5018: iconst_1
    //   5019: ldc burp/Zmv9
    //   5021: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5024: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5027: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5030: astore #6
    //   5032: aload #6
    //   5034: arraylength
    //   5035: istore #7
    //   5037: iconst_0
    //   5038: istore #8
    //   5040: iload #8
    //   5042: iload #7
    //   5044: if_icmpge -> 5182
    //   5047: aload #6
    //   5049: iload #8
    //   5051: aaload
    //   5052: astore #9
    //   5054: aload #9
    //   5056: invokevirtual getModifiers : ()I
    //   5059: invokestatic isStatic : (I)Z
    //   5062: ifne -> 5072
    //   5065: goto -> 5175
    //   5068: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5071: athrow
    //   5072: aload #9
    //   5074: invokevirtual getType : ()Ljava/lang/Class;
    //   5077: astore #10
    //   5079: aload #10
    //   5081: ifnull -> 5162
    //   5084: aload #10
    //   5086: invokevirtual isPrimitive : ()Z
    //   5089: ifne -> 5162
    //   5092: goto -> 5099
    //   5095: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5098: athrow
    //   5099: aload #10
    //   5101: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5104: ifnull -> 5162
    //   5107: goto -> 5114
    //   5110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5113: athrow
    //   5114: aload #10
    //   5116: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5119: invokevirtual getName : ()Ljava/lang/String;
    //   5122: ifnull -> 5162
    //   5125: goto -> 5132
    //   5128: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5131: athrow
    //   5132: aload #10
    //   5134: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5137: invokevirtual getName : ()Ljava/lang/String;
    //   5140: sipush #31405
    //   5143: sipush #-2496
    //   5146: invokestatic a : (II)Ljava/lang/String;
    //   5149: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5152: ifne -> 5162
    //   5155: goto -> 5162
    //   5158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5161: athrow
    //   5162: aload #9
    //   5164: iconst_1
    //   5165: invokevirtual setAccessible : (Z)V
    //   5168: aload #9
    //   5170: aconst_null
    //   5171: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5174: pop
    //   5175: iinc #8, 1
    //   5178: iload_2
    //   5179: ifne -> 5040
    //   5182: sipush #31401
    //   5185: sipush #24513
    //   5188: invokestatic a : (II)Ljava/lang/String;
    //   5191: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5194: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5197: astore #6
    //   5199: aload #6
    //   5201: arraylength
    //   5202: istore #7
    //   5204: iconst_0
    //   5205: istore #8
    //   5207: iload #8
    //   5209: iload #7
    //   5211: if_icmpge -> 5348
    //   5214: aload #6
    //   5216: iload #8
    //   5218: aaload
    //   5219: astore #9
    //   5221: aload #9
    //   5223: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5226: pop
    //   5227: aload #9
    //   5229: invokevirtual getModifiers : ()I
    //   5232: invokestatic isStatic : (I)Z
    //   5235: ifeq -> 5334
    //   5238: aload #9
    //   5240: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5243: arraylength
    //   5244: iconst_2
    //   5245: if_icmpne -> 5334
    //   5248: goto -> 5255
    //   5251: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5254: athrow
    //   5255: aload #9
    //   5257: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5260: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5263: if_acmpne -> 5334
    //   5266: goto -> 5273
    //   5269: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5272: athrow
    //   5273: aload #9
    //   5275: iconst_1
    //   5276: invokevirtual setAccessible : (Z)V
    //   5279: aload #9
    //   5281: aconst_null
    //   5282: iconst_2
    //   5283: anewarray java/lang/Object
    //   5286: dup
    //   5287: iconst_0
    //   5288: aload_0
    //   5289: aastore
    //   5290: dup
    //   5291: iconst_1
    //   5292: aload_1
    //   5293: ifnonnull -> 5311
    //   5296: goto -> 5303
    //   5299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5302: athrow
    //   5303: aload_1
    //   5304: goto -> 5318
    //   5307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5310: athrow
    //   5311: aload_1
    //   5312: checkcast [B
    //   5315: invokevirtual clone : ()Ljava/lang/Object;
    //   5318: aastore
    //   5319: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5322: checkcast java/lang/Boolean
    //   5325: invokevirtual booleanValue : ()Z
    //   5328: istore #5
    //   5330: iload_2
    //   5331: ifne -> 5348
    //   5334: iinc #8, 1
    //   5337: iload_2
    //   5338: ifne -> 5207
    //   5341: goto -> 5348
    //   5344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5347: athrow
    //   5348: iload_2
    //   5349: ifne -> 5691
    //   5352: sipush #31416
    //   5355: sipush #24145
    //   5358: invokestatic a : (II)Ljava/lang/String;
    //   5361: iconst_1
    //   5362: ldc burp/Zegw
    //   5364: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5367: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5370: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5373: astore #6
    //   5375: aload #6
    //   5377: arraylength
    //   5378: istore #7
    //   5380: iconst_0
    //   5381: istore #8
    //   5383: iload #8
    //   5385: iload #7
    //   5387: if_icmpge -> 5525
    //   5390: aload #6
    //   5392: iload #8
    //   5394: aaload
    //   5395: astore #9
    //   5397: aload #9
    //   5399: invokevirtual getModifiers : ()I
    //   5402: invokestatic isStatic : (I)Z
    //   5405: ifne -> 5415
    //   5408: goto -> 5518
    //   5411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5414: athrow
    //   5415: aload #9
    //   5417: invokevirtual getType : ()Ljava/lang/Class;
    //   5420: astore #10
    //   5422: aload #10
    //   5424: ifnull -> 5505
    //   5427: aload #10
    //   5429: invokevirtual isPrimitive : ()Z
    //   5432: ifne -> 5505
    //   5435: goto -> 5442
    //   5438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5441: athrow
    //   5442: aload #10
    //   5444: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5447: ifnull -> 5505
    //   5450: goto -> 5457
    //   5453: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5456: athrow
    //   5457: aload #10
    //   5459: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5462: invokevirtual getName : ()Ljava/lang/String;
    //   5465: ifnull -> 5505
    //   5468: goto -> 5475
    //   5471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5474: athrow
    //   5475: aload #10
    //   5477: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5480: invokevirtual getName : ()Ljava/lang/String;
    //   5483: sipush #31405
    //   5486: sipush #-2496
    //   5489: invokestatic a : (II)Ljava/lang/String;
    //   5492: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5495: ifne -> 5505
    //   5498: goto -> 5505
    //   5501: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5504: athrow
    //   5505: aload #9
    //   5507: iconst_1
    //   5508: invokevirtual setAccessible : (Z)V
    //   5511: aload #9
    //   5513: aconst_null
    //   5514: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5517: pop
    //   5518: iinc #8, 1
    //   5521: iload_2
    //   5522: ifne -> 5383
    //   5525: sipush #31397
    //   5528: sipush #-14327
    //   5531: invokestatic a : (II)Ljava/lang/String;
    //   5534: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5537: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5540: astore #6
    //   5542: aload #6
    //   5544: arraylength
    //   5545: istore #7
    //   5547: iconst_0
    //   5548: istore #8
    //   5550: iload #8
    //   5552: iload #7
    //   5554: if_icmpge -> 5691
    //   5557: aload #6
    //   5559: iload #8
    //   5561: aaload
    //   5562: astore #9
    //   5564: aload #9
    //   5566: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5569: pop
    //   5570: aload #9
    //   5572: invokevirtual getModifiers : ()I
    //   5575: invokestatic isStatic : (I)Z
    //   5578: ifeq -> 5677
    //   5581: aload #9
    //   5583: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5586: arraylength
    //   5587: iconst_2
    //   5588: if_icmpne -> 5677
    //   5591: goto -> 5598
    //   5594: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5597: athrow
    //   5598: aload #9
    //   5600: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5603: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5606: if_acmpne -> 5677
    //   5609: goto -> 5616
    //   5612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5615: athrow
    //   5616: aload #9
    //   5618: iconst_1
    //   5619: invokevirtual setAccessible : (Z)V
    //   5622: aload #9
    //   5624: aconst_null
    //   5625: iconst_2
    //   5626: anewarray java/lang/Object
    //   5629: dup
    //   5630: iconst_0
    //   5631: aload_0
    //   5632: aastore
    //   5633: dup
    //   5634: iconst_1
    //   5635: aload_1
    //   5636: ifnonnull -> 5654
    //   5639: goto -> 5646
    //   5642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5645: athrow
    //   5646: aload_1
    //   5647: goto -> 5661
    //   5650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5653: athrow
    //   5654: aload_1
    //   5655: checkcast [B
    //   5658: invokevirtual clone : ()Ljava/lang/Object;
    //   5661: aastore
    //   5662: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5665: checkcast java/lang/Boolean
    //   5668: invokevirtual booleanValue : ()Z
    //   5671: istore #5
    //   5673: iload_2
    //   5674: ifne -> 5691
    //   5677: iinc #8, 1
    //   5680: iload_2
    //   5681: ifne -> 5550
    //   5684: goto -> 5691
    //   5687: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5690: athrow
    //   5691: iload #5
    //   5693: ifeq -> 5699
    //   5696: iload #5
    //   5698: ireturn
    //   5699: getstatic burp/Zdk.Ze : Ljava/lang/String;
    //   5702: getstatic burp/Zgt6.ZU : Ljava/lang/Object;
    //   5705: checkcast java/math/BigInteger
    //   5708: invokevirtual intValue : ()I
    //   5711: bipush #32
    //   5713: irem
    //   5714: invokestatic abs : (I)I
    //   5717: invokevirtual charAt : (I)C
    //   5720: getstatic burp/Zro5.ZY : Ljava/lang/String;
    //   5723: getstatic burp/Zldt.ZS : Ljava/lang/Object;
    //   5726: checkcast java/math/BigInteger
    //   5729: invokevirtual intValue : ()I
    //   5732: bipush #32
    //   5734: irem
    //   5735: invokestatic abs : (I)I
    //   5738: invokevirtual charAt : (I)C
    //   5741: if_icmple -> 6087
    //   5744: sipush #31392
    //   5747: sipush #9737
    //   5750: invokestatic a : (II)Ljava/lang/String;
    //   5753: iconst_1
    //   5754: ldc burp/Zb8_
    //   5756: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5759: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5762: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5765: astore #6
    //   5767: aload #6
    //   5769: arraylength
    //   5770: istore #7
    //   5772: iconst_0
    //   5773: istore #8
    //   5775: iload #8
    //   5777: iload #7
    //   5779: if_icmpge -> 5917
    //   5782: aload #6
    //   5784: iload #8
    //   5786: aaload
    //   5787: astore #9
    //   5789: aload #9
    //   5791: invokevirtual getModifiers : ()I
    //   5794: invokestatic isStatic : (I)Z
    //   5797: ifne -> 5807
    //   5800: goto -> 5910
    //   5803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5806: athrow
    //   5807: aload #9
    //   5809: invokevirtual getType : ()Ljava/lang/Class;
    //   5812: astore #10
    //   5814: aload #10
    //   5816: ifnull -> 5897
    //   5819: aload #10
    //   5821: invokevirtual isPrimitive : ()Z
    //   5824: ifne -> 5897
    //   5827: goto -> 5834
    //   5830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5833: athrow
    //   5834: aload #10
    //   5836: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5839: ifnull -> 5897
    //   5842: goto -> 5849
    //   5845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5848: athrow
    //   5849: aload #10
    //   5851: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5854: invokevirtual getName : ()Ljava/lang/String;
    //   5857: ifnull -> 5897
    //   5860: goto -> 5867
    //   5863: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5866: athrow
    //   5867: aload #10
    //   5869: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5872: invokevirtual getName : ()Ljava/lang/String;
    //   5875: sipush #31405
    //   5878: sipush #-2496
    //   5881: invokestatic a : (II)Ljava/lang/String;
    //   5884: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5887: ifne -> 5897
    //   5890: goto -> 5897
    //   5893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5896: athrow
    //   5897: aload #9
    //   5899: iconst_1
    //   5900: invokevirtual setAccessible : (Z)V
    //   5903: aload #9
    //   5905: aconst_null
    //   5906: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5909: pop
    //   5910: iinc #8, 1
    //   5913: iload_2
    //   5914: ifne -> 5775
    //   5917: sipush #31417
    //   5920: sipush #-24220
    //   5923: invokestatic a : (II)Ljava/lang/String;
    //   5926: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5929: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5932: astore #6
    //   5934: aload #6
    //   5936: arraylength
    //   5937: istore #7
    //   5939: iconst_0
    //   5940: istore #8
    //   5942: iload #8
    //   5944: iload #7
    //   5946: if_icmpge -> 6083
    //   5949: aload #6
    //   5951: iload #8
    //   5953: aaload
    //   5954: astore #9
    //   5956: aload #9
    //   5958: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5961: pop
    //   5962: aload #9
    //   5964: invokevirtual getModifiers : ()I
    //   5967: invokestatic isStatic : (I)Z
    //   5970: ifeq -> 6069
    //   5973: aload #9
    //   5975: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5978: arraylength
    //   5979: iconst_2
    //   5980: if_icmpne -> 6069
    //   5983: goto -> 5990
    //   5986: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5989: athrow
    //   5990: aload #9
    //   5992: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5995: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5998: if_acmpne -> 6069
    //   6001: goto -> 6008
    //   6004: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6007: athrow
    //   6008: aload #9
    //   6010: iconst_1
    //   6011: invokevirtual setAccessible : (Z)V
    //   6014: aload #9
    //   6016: aconst_null
    //   6017: iconst_2
    //   6018: anewarray java/lang/Object
    //   6021: dup
    //   6022: iconst_0
    //   6023: aload_0
    //   6024: aastore
    //   6025: dup
    //   6026: iconst_1
    //   6027: aload_1
    //   6028: ifnonnull -> 6046
    //   6031: goto -> 6038
    //   6034: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6037: athrow
    //   6038: aload_1
    //   6039: goto -> 6053
    //   6042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6045: athrow
    //   6046: aload_1
    //   6047: checkcast [B
    //   6050: invokevirtual clone : ()Ljava/lang/Object;
    //   6053: aastore
    //   6054: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6057: checkcast java/lang/Boolean
    //   6060: invokevirtual booleanValue : ()Z
    //   6063: istore #5
    //   6065: iload_2
    //   6066: ifne -> 6083
    //   6069: iinc #8, 1
    //   6072: iload_2
    //   6073: ifne -> 5942
    //   6076: goto -> 6083
    //   6079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6082: athrow
    //   6083: iload_2
    //   6084: ifne -> 6426
    //   6087: sipush #31420
    //   6090: sipush #19880
    //   6093: invokestatic a : (II)Ljava/lang/String;
    //   6096: iconst_1
    //   6097: ldc burp/Zm52
    //   6099: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6102: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6105: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6108: astore #6
    //   6110: aload #6
    //   6112: arraylength
    //   6113: istore #7
    //   6115: iconst_0
    //   6116: istore #8
    //   6118: iload #8
    //   6120: iload #7
    //   6122: if_icmpge -> 6260
    //   6125: aload #6
    //   6127: iload #8
    //   6129: aaload
    //   6130: astore #9
    //   6132: aload #9
    //   6134: invokevirtual getModifiers : ()I
    //   6137: invokestatic isStatic : (I)Z
    //   6140: ifne -> 6150
    //   6143: goto -> 6253
    //   6146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6149: athrow
    //   6150: aload #9
    //   6152: invokevirtual getType : ()Ljava/lang/Class;
    //   6155: astore #10
    //   6157: aload #10
    //   6159: ifnull -> 6240
    //   6162: aload #10
    //   6164: invokevirtual isPrimitive : ()Z
    //   6167: ifne -> 6240
    //   6170: goto -> 6177
    //   6173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6176: athrow
    //   6177: aload #10
    //   6179: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6182: ifnull -> 6240
    //   6185: goto -> 6192
    //   6188: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6191: athrow
    //   6192: aload #10
    //   6194: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6197: invokevirtual getName : ()Ljava/lang/String;
    //   6200: ifnull -> 6240
    //   6203: goto -> 6210
    //   6206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6209: athrow
    //   6210: aload #10
    //   6212: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6215: invokevirtual getName : ()Ljava/lang/String;
    //   6218: sipush #31405
    //   6221: sipush #-2496
    //   6224: invokestatic a : (II)Ljava/lang/String;
    //   6227: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6230: ifne -> 6240
    //   6233: goto -> 6240
    //   6236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6239: athrow
    //   6240: aload #9
    //   6242: iconst_1
    //   6243: invokevirtual setAccessible : (Z)V
    //   6246: aload #9
    //   6248: aconst_null
    //   6249: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6252: pop
    //   6253: iinc #8, 1
    //   6256: iload_2
    //   6257: ifne -> 6118
    //   6260: sipush #31422
    //   6263: sipush #16899
    //   6266: invokestatic a : (II)Ljava/lang/String;
    //   6269: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6272: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6275: astore #6
    //   6277: aload #6
    //   6279: arraylength
    //   6280: istore #7
    //   6282: iconst_0
    //   6283: istore #8
    //   6285: iload #8
    //   6287: iload #7
    //   6289: if_icmpge -> 6426
    //   6292: aload #6
    //   6294: iload #8
    //   6296: aaload
    //   6297: astore #9
    //   6299: aload #9
    //   6301: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6304: pop
    //   6305: aload #9
    //   6307: invokevirtual getModifiers : ()I
    //   6310: invokestatic isStatic : (I)Z
    //   6313: ifeq -> 6412
    //   6316: aload #9
    //   6318: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6321: arraylength
    //   6322: iconst_2
    //   6323: if_icmpne -> 6412
    //   6326: goto -> 6333
    //   6329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6332: athrow
    //   6333: aload #9
    //   6335: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6338: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6341: if_acmpne -> 6412
    //   6344: goto -> 6351
    //   6347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6350: athrow
    //   6351: aload #9
    //   6353: iconst_1
    //   6354: invokevirtual setAccessible : (Z)V
    //   6357: aload #9
    //   6359: aconst_null
    //   6360: iconst_2
    //   6361: anewarray java/lang/Object
    //   6364: dup
    //   6365: iconst_0
    //   6366: aload_0
    //   6367: aastore
    //   6368: dup
    //   6369: iconst_1
    //   6370: aload_1
    //   6371: ifnonnull -> 6389
    //   6374: goto -> 6381
    //   6377: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6380: athrow
    //   6381: aload_1
    //   6382: goto -> 6396
    //   6385: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6388: athrow
    //   6389: aload_1
    //   6390: checkcast [B
    //   6393: invokevirtual clone : ()Ljava/lang/Object;
    //   6396: aastore
    //   6397: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6400: checkcast java/lang/Boolean
    //   6403: invokevirtual booleanValue : ()Z
    //   6406: istore #5
    //   6408: iload_2
    //   6409: ifne -> 6426
    //   6412: iinc #8, 1
    //   6415: iload_2
    //   6416: ifne -> 6285
    //   6419: goto -> 6426
    //   6422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6425: athrow
    //   6426: iload #5
    //   6428: ireturn
    //   6429: astore_3
    //   6430: new java/lang/Exception
    //   6433: dup
    //   6434: aload_3
    //   6435: invokevirtual getMessage : ()Ljava/lang/String;
    //   6438: invokespecial <init> : (Ljava/lang/String;)V
    //   6441: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4228	6429	java/lang/Throwable
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
    //   2980	3011	3014	java/lang/Throwable
    //   2997	3041	3044	java/lang/Throwable
    //   3018	3052	3052	java/lang/Throwable
    //   3063	3079	3082	java/lang/Throwable
    //   3278	3306	3309	java/lang/Throwable
    //   3288	3323	3326	java/lang/Throwable
    //   3313	3351	3354	java/lang/Throwable
    //   3330	3368	3371	java/lang/Throwable
    //   3358	3396	3399	java/lang/Throwable
    //   3375	3413	3416	java/lang/Throwable
    //   3403	3431	3434	java/lang/Throwable
    //   3420	3445	3448	java/lang/Throwable
    //   3585	3599	3599	java/lang/Throwable
    //   3610	3623	3626	java/lang/Throwable
    //   3615	3638	3641	java/lang/Throwable
    //   3630	3656	3659	java/lang/Throwable
    //   3645	3686	3689	java/lang/Throwable
    //   3752	3779	3782	java/lang/Throwable
    //   3769	3797	3800	java/lang/Throwable
    //   3786	3827	3830	java/lang/Throwable
    //   3804	3838	3838	java/lang/Throwable
    //   3861	3872	3875	java/lang/Throwable
    //   3927	3941	3941	java/lang/Throwable
    //   3952	3965	3968	java/lang/Throwable
    //   3957	3980	3983	java/lang/Throwable
    //   3972	3998	4001	java/lang/Throwable
    //   3987	4028	4031	java/lang/Throwable
    //   4094	4121	4124	java/lang/Throwable
    //   4111	4139	4142	java/lang/Throwable
    //   4128	4169	4172	java/lang/Throwable
    //   4146	4180	4180	java/lang/Throwable
    //   4203	4214	4217	java/lang/Throwable
    //   4229	4963	6429	java/lang/Throwable
    //   4319	4333	4333	java/lang/Throwable
    //   4344	4357	4360	java/lang/Throwable
    //   4349	4372	4375	java/lang/Throwable
    //   4364	4390	4393	java/lang/Throwable
    //   4379	4420	4423	java/lang/Throwable
    //   4486	4513	4516	java/lang/Throwable
    //   4503	4531	4534	java/lang/Throwable
    //   4520	4561	4564	java/lang/Throwable
    //   4538	4572	4572	java/lang/Throwable
    //   4595	4606	4609	java/lang/Throwable
    //   4662	4676	4676	java/lang/Throwable
    //   4687	4700	4703	java/lang/Throwable
    //   4692	4715	4718	java/lang/Throwable
    //   4707	4733	4736	java/lang/Throwable
    //   4722	4763	4766	java/lang/Throwable
    //   4829	4856	4859	java/lang/Throwable
    //   4846	4874	4877	java/lang/Throwable
    //   4863	4904	4907	java/lang/Throwable
    //   4881	4915	4915	java/lang/Throwable
    //   4938	4949	4952	java/lang/Throwable
    //   4964	5698	6429	java/lang/Throwable
    //   5054	5068	5068	java/lang/Throwable
    //   5079	5092	5095	java/lang/Throwable
    //   5084	5107	5110	java/lang/Throwable
    //   5099	5125	5128	java/lang/Throwable
    //   5114	5155	5158	java/lang/Throwable
    //   5221	5248	5251	java/lang/Throwable
    //   5238	5266	5269	java/lang/Throwable
    //   5255	5296	5299	java/lang/Throwable
    //   5273	5307	5307	java/lang/Throwable
    //   5330	5341	5344	java/lang/Throwable
    //   5397	5411	5411	java/lang/Throwable
    //   5422	5435	5438	java/lang/Throwable
    //   5427	5450	5453	java/lang/Throwable
    //   5442	5468	5471	java/lang/Throwable
    //   5457	5498	5501	java/lang/Throwable
    //   5564	5591	5594	java/lang/Throwable
    //   5581	5609	5612	java/lang/Throwable
    //   5598	5639	5642	java/lang/Throwable
    //   5616	5650	5650	java/lang/Throwable
    //   5673	5684	5687	java/lang/Throwable
    //   5699	6428	6429	java/lang/Throwable
    //   5789	5803	5803	java/lang/Throwable
    //   5814	5827	5830	java/lang/Throwable
    //   5819	5842	5845	java/lang/Throwable
    //   5834	5860	5863	java/lang/Throwable
    //   5849	5890	5893	java/lang/Throwable
    //   5956	5983	5986	java/lang/Throwable
    //   5973	6001	6004	java/lang/Throwable
    //   5990	6031	6034	java/lang/Throwable
    //   6008	6042	6042	java/lang/Throwable
    //   6065	6076	6079	java/lang/Throwable
    //   6132	6146	6146	java/lang/Throwable
    //   6157	6170	6173	java/lang/Throwable
    //   6162	6185	6188	java/lang/Throwable
    //   6177	6203	6206	java/lang/Throwable
    //   6192	6233	6236	java/lang/Throwable
    //   6299	6326	6329	java/lang/Throwable
    //   6316	6344	6347	java/lang/Throwable
    //   6333	6374	6377	java/lang/Throwable
    //   6351	6385	6385	java/lang/Throwable
    //   6408	6419	6422	java/lang/Throwable
  }
  
  static void ZT(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '£Q´FzAE,\\tzÆ!­*±\\tßRÌ@Ì \\t´RV}vÂÅJ 7\\tdÀL/Y<µ_ Sï´þø÷IWñÞd¢2ÅI½{ìÝý"cäBr\\f°*±\\tõs~Yò|CZ\\tÌÁYû8ÿ#\\bªcb¼û\\bëá½g¸o\\r\\t¬NUþzÎËË\\t\\bc6¼ò AÑBZ,½1qC<^îX×EµqPG¨I@Ã?\\t!tôW£ô\\b2£C ±\\bj+Ra¤1M3x@Éûz6èÞåßb=¦+×J\\tHC)bû,doðÎÀÞ÷½©µÏ¼uA_h¤ËJÃK£i8¡¿Y/*èë u,\\bßØñÉ0\\tHdÉ»é®³Ê\\t¥ mäï\\t@ùÈ\\bÉØ¦Y\\tU¢jEh'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
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
    //   68: ldc '^Kè«³\\tNcó¡TïP'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #14
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
    //   129: putstatic burp/Zgta.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgta.b : [Ljava/lang/String;
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
    //   212: bipush #126
    //   214: goto -> 244
    //   217: bipush #61
    //   219: goto -> 244
    //   222: bipush #102
    //   224: goto -> 244
    //   227: bipush #14
    //   229: goto -> 244
    //   232: bipush #59
    //   234: goto -> 244
    //   237: bipush #9
    //   239: goto -> 244
    //   242: bipush #85
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
    //   310: bipush #112
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #48
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-64
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #25
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-124
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-124
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-42
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #60
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-41
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-106
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-61
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #42
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-108
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-32
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-62
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #80
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #56
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-82
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #109
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #57
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-21
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-124
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-15
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #117
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #8
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-94
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-76
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #123
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-51
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-121
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #82
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-81
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zgta.ZF : Ljava/lang/Object;
    //   500: sipush #31396
    //   503: sipush #26434
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zgta.ZL : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7AA9) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgta.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */