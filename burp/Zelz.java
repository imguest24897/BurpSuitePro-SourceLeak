package burp;

import java.math.BigInteger;

class Zelz extends ClassLoader {
  static Object Z_;
  
  static String ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Z_(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zq(Object paramObject) {
    Zl1q.ZY = a(14406, 4240);
    Zl1q.Zh = new BigInteger(a(14422, -12701));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Ztzw.Zi.charAt(Math.abs(((BigInteger)Zl1q.Zh).intValue() % 32)) > Zec_.Zv.charAt(Math.abs(((BigInteger)Zl1q.Zh).intValue() % 32))) {
          try {
            Zbqo.ZX(Class.forName(a(14417, 25071)));
            if (!bool)
              Ze3z.Zz(Class.forName(a(14425, -11104))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ze3z.Zz(Class.forName(a(14425, -11104)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zo(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zlum.ZW : Ljava/lang/String;
    //   172: getstatic burp/Zrw7.ZV : Ljava/lang/Object;
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
    //   206: getstatic burp/Zz16.ZA : Ljava/lang/String;
    //   209: getstatic burp/Zsqi.Zf : Ljava/lang/Object;
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
    //   243: getstatic burp/Zm81.ZY : Ljava/lang/String;
    //   246: getstatic burp/Zlfi.ZV : Ljava/lang/Object;
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
    //   280: getstatic burp/Zkde.Zb : Ljava/lang/String;
    //   283: getstatic burp/Ztzw.Zk : Ljava/lang/Object;
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
    //   317: getstatic burp/Zeqr.Zb : Ljava/lang/String;
    //   320: getstatic burp/Zevf.Zu : Ljava/lang/Object;
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
    //   354: getstatic burp/Zsbd.ZA : Ljava/lang/String;
    //   357: getstatic burp/Zelz.Z_ : Ljava/lang/Object;
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
    //   391: getstatic burp/Zrw7.Zo : Ljava/lang/String;
    //   394: getstatic burp/Zty2.Zl : Ljava/lang/Object;
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
    //   428: getstatic burp/Zsyu.ZJ : Ljava/lang/String;
    //   431: getstatic burp/Zex5.Zb : Ljava/lang/Object;
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
    //   465: getstatic burp/Zx_u.Z_ : Ljava/lang/String;
    //   468: getstatic burp/Zs15.Zk : Ljava/lang/Object;
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
    //   502: getstatic burp/Zl4v.ZD : Ljava/lang/String;
    //   505: getstatic burp/Ze7y.Zh : Ljava/lang/Object;
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
    //   539: getstatic burp/Zb6e.ZR : Ljava/lang/String;
    //   542: getstatic burp/Zgfm.ZV : Ljava/lang/Object;
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
    //   576: getstatic burp/Zly7.ZC : Ljava/lang/String;
    //   579: getstatic burp/Zlum.Zj : Ljava/lang/Object;
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
    //   613: getstatic burp/Zeoi.Zh : Ljava/lang/String;
    //   616: getstatic burp/Zly7.Zt : Ljava/lang/Object;
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
    //   650: getstatic burp/Zlpu.ZA : Ljava/lang/String;
    //   653: getstatic burp/Zg7j.Zr : Ljava/lang/Object;
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
    //   687: getstatic burp/Zegk.Ze : Ljava/lang/String;
    //   690: getstatic burp/Zmsl.ZB : Ljava/lang/Object;
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
    //   724: getstatic burp/Zrcx.ZW : Ljava/lang/String;
    //   727: getstatic burp/Zeoi.ZE : Ljava/lang/Object;
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
    //   761: getstatic burp/Zkde.Zb : Ljava/lang/String;
    //   764: getstatic burp/Ze6k.Zs : Ljava/lang/Object;
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
    //   798: getstatic burp/Zx_u.Z_ : Ljava/lang/String;
    //   801: getstatic burp/Zm81.Zy : Ljava/lang/Object;
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
    //   835: getstatic burp/Zl4v.ZD : Ljava/lang/String;
    //   838: getstatic burp/Zsqi.Zf : Ljava/lang/Object;
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
    //   872: getstatic burp/Zboa.Zq : Ljava/lang/String;
    //   875: getstatic burp/Zem6.Zm : Ljava/lang/Object;
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
    //   909: getstatic burp/Zxxd.Za : Ljava/lang/String;
    //   912: getstatic burp/Zsqi.Zf : Ljava/lang/Object;
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
    //   946: getstatic burp/Zvi.ZR : Ljava/lang/String;
    //   949: getstatic burp/Zmpc.Zc : Ljava/lang/Object;
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
    //   983: getstatic burp/Zsbd.ZA : Ljava/lang/String;
    //   986: getstatic burp/Zd0.ZT : Ljava/lang/Object;
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
    //   1020: getstatic burp/Ze3z.Zv : Ljava/lang/String;
    //   1023: getstatic burp/Zlbr.Zp : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zs15.Zs : Ljava/lang/String;
    //   1060: getstatic burp/Zm_w.ZW : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zl1q.ZY : Ljava/lang/String;
    //   1097: getstatic burp/Zkde.Zk : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zm1l.Zp : Ljava/lang/String;
    //   1134: getstatic burp/Zmir.ZF : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zs15.Zs : Ljava/lang/String;
    //   1171: getstatic burp/Zevf.Zu : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zrfl.Zy : Ljava/lang/String;
    //   1208: getstatic burp/Zl1n.ZM : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zztx.Zg : Ljava/lang/String;
    //   1245: getstatic burp/Zg27.ZQ : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zm_w.ZA : Ljava/lang/String;
    //   1282: getstatic burp/Ze3z.Zf : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zlpu.ZA : Ljava/lang/String;
    //   1319: getstatic burp/Zm_w.ZW : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zm81.ZY : Ljava/lang/String;
    //   1362: getstatic burp/Zrcu.Zs : Ljava/lang/Object;
    //   1365: checkcast java/math/BigInteger
    //   1368: invokevirtual toByteArray : ()[B
    //   1371: astore #4
    //   1373: new java/lang/StringBuilder
    //   1376: dup
    //   1377: invokespecial <init> : ()V
    //   1380: astore #6
    //   1382: aload #6
    //   1384: sipush #14427
    //   1387: sipush #21729
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
    //   1441: sipush #14423
    //   1444: sipush #23685
    //   1447: invokestatic a : (II)Ljava/lang/String;
    //   1450: ldc ''
    //   1452: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1455: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1458: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1461: pop
    //   1462: aload #6
    //   1464: sipush #14410
    //   1467: sipush #20892
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
    //   2051: sipush #14408
    //   2054: getstatic burp/Zkde.Zk : Ljava/lang/Object;
    //   2057: checkcast java/math/BigInteger
    //   2060: getstatic burp/Zkff.Zr : Ljava/lang/Object;
    //   2063: checkcast java/math/BigInteger
    //   2066: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   2069: putstatic burp/Zs9x.Zo : Ljava/lang/Object;
    //   2072: sipush #-239
    //   2075: invokestatic a : (II)Ljava/lang/String;
    //   2078: iconst_1
    //   2079: ldc burp/Zszm
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
    //   2200: sipush #14424
    //   2203: sipush #18502
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
    //   2242: sipush #14415
    //   2245: sipush #-13618
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
    //   2404: iconst_0
    //   2405: istore #4
    //   2407: getstatic burp/Zl6e.ZC : Ljava/lang/String;
    //   2410: getstatic burp/Zsbd.Zh : Ljava/lang/Object;
    //   2413: checkcast java/math/BigInteger
    //   2416: invokevirtual intValue : ()I
    //   2419: bipush #32
    //   2421: irem
    //   2422: invokestatic abs : (I)I
    //   2425: invokevirtual charAt : (I)C
    //   2428: getstatic burp/Zegk.Ze : Ljava/lang/String;
    //   2431: getstatic burp/Zl5d.Za : Ljava/lang/Object;
    //   2434: checkcast java/math/BigInteger
    //   2437: invokevirtual intValue : ()I
    //   2440: bipush #32
    //   2442: irem
    //   2443: invokestatic abs : (I)I
    //   2446: invokevirtual charAt : (I)C
    //   2449: if_icmpgt -> 2794
    //   2452: sipush #14412
    //   2455: sipush #-7715
    //   2458: invokestatic a : (II)Ljava/lang/String;
    //   2461: iconst_1
    //   2462: ldc burp/Zr8g
    //   2464: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2467: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2470: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2473: astore #5
    //   2475: aload #5
    //   2477: arraylength
    //   2478: istore #6
    //   2480: iconst_0
    //   2481: istore #7
    //   2483: iload #7
    //   2485: iload #6
    //   2487: if_icmpge -> 2625
    //   2490: aload #5
    //   2492: iload #7
    //   2494: aaload
    //   2495: astore #8
    //   2497: aload #8
    //   2499: invokevirtual getModifiers : ()I
    //   2502: invokestatic isStatic : (I)Z
    //   2505: ifne -> 2515
    //   2508: goto -> 2618
    //   2511: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2514: athrow
    //   2515: aload #8
    //   2517: invokevirtual getType : ()Ljava/lang/Class;
    //   2520: astore #9
    //   2522: aload #9
    //   2524: ifnull -> 2605
    //   2527: aload #9
    //   2529: invokevirtual isPrimitive : ()Z
    //   2532: ifne -> 2605
    //   2535: goto -> 2542
    //   2538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2541: athrow
    //   2542: aload #9
    //   2544: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2547: ifnull -> 2605
    //   2550: goto -> 2557
    //   2553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2556: athrow
    //   2557: aload #9
    //   2559: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2562: invokevirtual getName : ()Ljava/lang/String;
    //   2565: ifnull -> 2605
    //   2568: goto -> 2575
    //   2571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2574: athrow
    //   2575: aload #9
    //   2577: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2580: invokevirtual getName : ()Ljava/lang/String;
    //   2583: sipush #14409
    //   2586: sipush #-12720
    //   2589: invokestatic a : (II)Ljava/lang/String;
    //   2592: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2595: ifne -> 2605
    //   2598: goto -> 2605
    //   2601: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2604: athrow
    //   2605: aload #8
    //   2607: iconst_1
    //   2608: invokevirtual setAccessible : (Z)V
    //   2611: aload #8
    //   2613: aconst_null
    //   2614: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2617: pop
    //   2618: iinc #7, 1
    //   2621: iload_2
    //   2622: ifne -> 2483
    //   2625: sipush #14401
    //   2628: sipush #20144
    //   2631: invokestatic a : (II)Ljava/lang/String;
    //   2634: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2637: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2640: astore #5
    //   2642: aload #5
    //   2644: arraylength
    //   2645: istore #6
    //   2647: iconst_0
    //   2648: istore #7
    //   2650: iload #7
    //   2652: iload #6
    //   2654: if_icmpge -> 2791
    //   2657: aload #5
    //   2659: iload #7
    //   2661: aaload
    //   2662: astore #8
    //   2664: aload #8
    //   2666: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2669: pop
    //   2670: aload #8
    //   2672: invokevirtual getModifiers : ()I
    //   2675: invokestatic isStatic : (I)Z
    //   2678: ifeq -> 2777
    //   2681: aload #8
    //   2683: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2686: arraylength
    //   2687: iconst_2
    //   2688: if_icmpne -> 2777
    //   2691: goto -> 2698
    //   2694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2697: athrow
    //   2698: aload #8
    //   2700: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2703: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2706: if_acmpne -> 2777
    //   2709: goto -> 2716
    //   2712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2715: athrow
    //   2716: aload #8
    //   2718: iconst_1
    //   2719: invokevirtual setAccessible : (Z)V
    //   2722: aload #8
    //   2724: aconst_null
    //   2725: iconst_2
    //   2726: anewarray java/lang/Object
    //   2729: dup
    //   2730: iconst_0
    //   2731: aload_0
    //   2732: aastore
    //   2733: dup
    //   2734: iconst_1
    //   2735: aload_1
    //   2736: ifnonnull -> 2754
    //   2739: goto -> 2746
    //   2742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2745: athrow
    //   2746: aload_1
    //   2747: goto -> 2761
    //   2750: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2753: athrow
    //   2754: aload_1
    //   2755: checkcast [B
    //   2758: invokevirtual clone : ()Ljava/lang/Object;
    //   2761: aastore
    //   2762: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2765: checkcast java/lang/Boolean
    //   2768: invokevirtual booleanValue : ()Z
    //   2771: istore #4
    //   2773: iload_2
    //   2774: ifne -> 2791
    //   2777: iinc #7, 1
    //   2780: iload_2
    //   2781: ifne -> 2650
    //   2784: goto -> 2791
    //   2787: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2790: athrow
    //   2791: goto -> 3133
    //   2794: sipush #14418
    //   2797: sipush #25366
    //   2800: invokestatic a : (II)Ljava/lang/String;
    //   2803: iconst_1
    //   2804: ldc burp/Zz5h
    //   2806: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2809: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2812: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2815: astore #5
    //   2817: aload #5
    //   2819: arraylength
    //   2820: istore #6
    //   2822: iconst_0
    //   2823: istore #7
    //   2825: iload #7
    //   2827: iload #6
    //   2829: if_icmpge -> 2967
    //   2832: aload #5
    //   2834: iload #7
    //   2836: aaload
    //   2837: astore #8
    //   2839: aload #8
    //   2841: invokevirtual getModifiers : ()I
    //   2844: invokestatic isStatic : (I)Z
    //   2847: ifne -> 2857
    //   2850: goto -> 2960
    //   2853: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2856: athrow
    //   2857: aload #8
    //   2859: invokevirtual getType : ()Ljava/lang/Class;
    //   2862: astore #9
    //   2864: aload #9
    //   2866: ifnull -> 2947
    //   2869: aload #9
    //   2871: invokevirtual isPrimitive : ()Z
    //   2874: ifne -> 2947
    //   2877: goto -> 2884
    //   2880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2883: athrow
    //   2884: aload #9
    //   2886: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2889: ifnull -> 2947
    //   2892: goto -> 2899
    //   2895: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2898: athrow
    //   2899: aload #9
    //   2901: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2904: invokevirtual getName : ()Ljava/lang/String;
    //   2907: ifnull -> 2947
    //   2910: goto -> 2917
    //   2913: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2916: athrow
    //   2917: aload #9
    //   2919: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2922: invokevirtual getName : ()Ljava/lang/String;
    //   2925: sipush #14409
    //   2928: sipush #-12720
    //   2931: invokestatic a : (II)Ljava/lang/String;
    //   2934: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2937: ifne -> 2947
    //   2940: goto -> 2947
    //   2943: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2946: athrow
    //   2947: aload #8
    //   2949: iconst_1
    //   2950: invokevirtual setAccessible : (Z)V
    //   2953: aload #8
    //   2955: aconst_null
    //   2956: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2959: pop
    //   2960: iinc #7, 1
    //   2963: iload_2
    //   2964: ifne -> 2825
    //   2967: sipush #14411
    //   2970: sipush #26512
    //   2973: invokestatic a : (II)Ljava/lang/String;
    //   2976: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2979: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2982: astore #5
    //   2984: aload #5
    //   2986: arraylength
    //   2987: istore #6
    //   2989: iconst_0
    //   2990: istore #7
    //   2992: iload #7
    //   2994: iload #6
    //   2996: if_icmpge -> 3133
    //   2999: aload #5
    //   3001: iload #7
    //   3003: aaload
    //   3004: astore #8
    //   3006: aload #8
    //   3008: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3011: pop
    //   3012: aload #8
    //   3014: invokevirtual getModifiers : ()I
    //   3017: invokestatic isStatic : (I)Z
    //   3020: ifeq -> 3119
    //   3023: aload #8
    //   3025: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3028: arraylength
    //   3029: iconst_2
    //   3030: if_icmpne -> 3119
    //   3033: goto -> 3040
    //   3036: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3039: athrow
    //   3040: aload #8
    //   3042: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3045: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3048: if_acmpne -> 3119
    //   3051: goto -> 3058
    //   3054: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3057: athrow
    //   3058: aload #8
    //   3060: iconst_1
    //   3061: invokevirtual setAccessible : (Z)V
    //   3064: aload #8
    //   3066: aconst_null
    //   3067: iconst_2
    //   3068: anewarray java/lang/Object
    //   3071: dup
    //   3072: iconst_0
    //   3073: aload_0
    //   3074: aastore
    //   3075: dup
    //   3076: iconst_1
    //   3077: aload_1
    //   3078: ifnonnull -> 3096
    //   3081: goto -> 3088
    //   3084: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3087: athrow
    //   3088: aload_1
    //   3089: goto -> 3103
    //   3092: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3095: athrow
    //   3096: aload_1
    //   3097: checkcast [B
    //   3100: invokevirtual clone : ()Ljava/lang/Object;
    //   3103: aastore
    //   3104: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3107: checkcast java/lang/Boolean
    //   3110: invokevirtual booleanValue : ()Z
    //   3113: istore #4
    //   3115: iload_2
    //   3116: ifne -> 3133
    //   3119: iinc #7, 1
    //   3122: iload_2
    //   3123: ifne -> 2992
    //   3126: goto -> 3133
    //   3129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3132: athrow
    //   3133: iload #4
    //   3135: ifeq -> 3141
    //   3138: iload #4
    //   3140: ireturn
    //   3141: getstatic burp/Zsmn.Zo : Ljava/lang/String;
    //   3144: getstatic burp/Zgr4.ZL : Ljava/lang/Object;
    //   3147: checkcast java/math/BigInteger
    //   3150: invokevirtual intValue : ()I
    //   3153: bipush #32
    //   3155: irem
    //   3156: invokestatic abs : (I)I
    //   3159: invokevirtual charAt : (I)C
    //   3162: getstatic burp/Zmsl.ZP : Ljava/lang/String;
    //   3165: getstatic burp/Zm81.Zy : Ljava/lang/Object;
    //   3168: checkcast java/math/BigInteger
    //   3171: invokevirtual intValue : ()I
    //   3174: bipush #32
    //   3176: irem
    //   3177: invokestatic abs : (I)I
    //   3180: invokevirtual charAt : (I)C
    //   3183: if_icmple -> 3529
    //   3186: sipush #14413
    //   3189: sipush #13812
    //   3192: invokestatic a : (II)Ljava/lang/String;
    //   3195: iconst_1
    //   3196: ldc burp/Zmf6
    //   3198: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3201: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3204: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3207: astore #5
    //   3209: aload #5
    //   3211: arraylength
    //   3212: istore #6
    //   3214: iconst_0
    //   3215: istore #7
    //   3217: iload #7
    //   3219: iload #6
    //   3221: if_icmpge -> 3359
    //   3224: aload #5
    //   3226: iload #7
    //   3228: aaload
    //   3229: astore #8
    //   3231: aload #8
    //   3233: invokevirtual getModifiers : ()I
    //   3236: invokestatic isStatic : (I)Z
    //   3239: ifne -> 3249
    //   3242: goto -> 3352
    //   3245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3248: athrow
    //   3249: aload #8
    //   3251: invokevirtual getType : ()Ljava/lang/Class;
    //   3254: astore #9
    //   3256: aload #9
    //   3258: ifnull -> 3339
    //   3261: aload #9
    //   3263: invokevirtual isPrimitive : ()Z
    //   3266: ifne -> 3339
    //   3269: goto -> 3276
    //   3272: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3275: athrow
    //   3276: aload #9
    //   3278: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3281: ifnull -> 3339
    //   3284: goto -> 3291
    //   3287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3290: athrow
    //   3291: aload #9
    //   3293: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3296: invokevirtual getName : ()Ljava/lang/String;
    //   3299: ifnull -> 3339
    //   3302: goto -> 3309
    //   3305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3308: athrow
    //   3309: aload #9
    //   3311: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3314: invokevirtual getName : ()Ljava/lang/String;
    //   3317: sipush #14409
    //   3320: sipush #-12720
    //   3323: invokestatic a : (II)Ljava/lang/String;
    //   3326: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3329: ifne -> 3339
    //   3332: goto -> 3339
    //   3335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3338: athrow
    //   3339: aload #8
    //   3341: iconst_1
    //   3342: invokevirtual setAccessible : (Z)V
    //   3345: aload #8
    //   3347: aconst_null
    //   3348: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3351: pop
    //   3352: iinc #7, 1
    //   3355: iload_2
    //   3356: ifne -> 3217
    //   3359: sipush #14405
    //   3362: sipush #-7112
    //   3365: invokestatic a : (II)Ljava/lang/String;
    //   3368: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3371: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3374: astore #5
    //   3376: aload #5
    //   3378: arraylength
    //   3379: istore #6
    //   3381: iconst_0
    //   3382: istore #7
    //   3384: iload #7
    //   3386: iload #6
    //   3388: if_icmpge -> 3525
    //   3391: aload #5
    //   3393: iload #7
    //   3395: aaload
    //   3396: astore #8
    //   3398: aload #8
    //   3400: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3403: pop
    //   3404: aload #8
    //   3406: invokevirtual getModifiers : ()I
    //   3409: invokestatic isStatic : (I)Z
    //   3412: ifeq -> 3511
    //   3415: aload #8
    //   3417: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3420: arraylength
    //   3421: iconst_2
    //   3422: if_icmpne -> 3511
    //   3425: goto -> 3432
    //   3428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3431: athrow
    //   3432: aload #8
    //   3434: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3437: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3440: if_acmpne -> 3511
    //   3443: goto -> 3450
    //   3446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3449: athrow
    //   3450: aload #8
    //   3452: iconst_1
    //   3453: invokevirtual setAccessible : (Z)V
    //   3456: aload #8
    //   3458: aconst_null
    //   3459: iconst_2
    //   3460: anewarray java/lang/Object
    //   3463: dup
    //   3464: iconst_0
    //   3465: aload_0
    //   3466: aastore
    //   3467: dup
    //   3468: iconst_1
    //   3469: aload_1
    //   3470: ifnonnull -> 3488
    //   3473: goto -> 3480
    //   3476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3479: athrow
    //   3480: aload_1
    //   3481: goto -> 3495
    //   3484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3487: athrow
    //   3488: aload_1
    //   3489: checkcast [B
    //   3492: invokevirtual clone : ()Ljava/lang/Object;
    //   3495: aastore
    //   3496: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3499: checkcast java/lang/Boolean
    //   3502: invokevirtual booleanValue : ()Z
    //   3505: istore #4
    //   3507: iload_2
    //   3508: ifne -> 3525
    //   3511: iinc #7, 1
    //   3514: iload_2
    //   3515: ifne -> 3384
    //   3518: goto -> 3525
    //   3521: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3524: athrow
    //   3525: iload_2
    //   3526: ifne -> 3868
    //   3529: sipush #14416
    //   3532: sipush #-8583
    //   3535: invokestatic a : (II)Ljava/lang/String;
    //   3538: iconst_1
    //   3539: ldc burp/Zelz
    //   3541: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3544: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3547: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3550: astore #5
    //   3552: aload #5
    //   3554: arraylength
    //   3555: istore #6
    //   3557: iconst_0
    //   3558: istore #7
    //   3560: iload #7
    //   3562: iload #6
    //   3564: if_icmpge -> 3702
    //   3567: aload #5
    //   3569: iload #7
    //   3571: aaload
    //   3572: astore #8
    //   3574: aload #8
    //   3576: invokevirtual getModifiers : ()I
    //   3579: invokestatic isStatic : (I)Z
    //   3582: ifne -> 3592
    //   3585: goto -> 3695
    //   3588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3591: athrow
    //   3592: aload #8
    //   3594: invokevirtual getType : ()Ljava/lang/Class;
    //   3597: astore #9
    //   3599: aload #9
    //   3601: ifnull -> 3682
    //   3604: aload #9
    //   3606: invokevirtual isPrimitive : ()Z
    //   3609: ifne -> 3682
    //   3612: goto -> 3619
    //   3615: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3618: athrow
    //   3619: aload #9
    //   3621: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3624: ifnull -> 3682
    //   3627: goto -> 3634
    //   3630: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3633: athrow
    //   3634: aload #9
    //   3636: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3639: invokevirtual getName : ()Ljava/lang/String;
    //   3642: ifnull -> 3682
    //   3645: goto -> 3652
    //   3648: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3651: athrow
    //   3652: aload #9
    //   3654: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3657: invokevirtual getName : ()Ljava/lang/String;
    //   3660: sipush #14409
    //   3663: sipush #-12720
    //   3666: invokestatic a : (II)Ljava/lang/String;
    //   3669: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3672: ifne -> 3682
    //   3675: goto -> 3682
    //   3678: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3681: athrow
    //   3682: aload #8
    //   3684: iconst_1
    //   3685: invokevirtual setAccessible : (Z)V
    //   3688: aload #8
    //   3690: aconst_null
    //   3691: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3694: pop
    //   3695: iinc #7, 1
    //   3698: iload_2
    //   3699: ifne -> 3560
    //   3702: sipush #14414
    //   3705: sipush #-20719
    //   3708: invokestatic a : (II)Ljava/lang/String;
    //   3711: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3714: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3717: astore #5
    //   3719: aload #5
    //   3721: arraylength
    //   3722: istore #6
    //   3724: iconst_0
    //   3725: istore #7
    //   3727: iload #7
    //   3729: iload #6
    //   3731: if_icmpge -> 3868
    //   3734: aload #5
    //   3736: iload #7
    //   3738: aaload
    //   3739: astore #8
    //   3741: aload #8
    //   3743: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3746: pop
    //   3747: aload #8
    //   3749: invokevirtual getModifiers : ()I
    //   3752: invokestatic isStatic : (I)Z
    //   3755: ifeq -> 3854
    //   3758: aload #8
    //   3760: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3763: arraylength
    //   3764: iconst_2
    //   3765: if_icmpne -> 3854
    //   3768: goto -> 3775
    //   3771: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3774: athrow
    //   3775: aload #8
    //   3777: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3780: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3783: if_acmpne -> 3854
    //   3786: goto -> 3793
    //   3789: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3792: athrow
    //   3793: aload #8
    //   3795: iconst_1
    //   3796: invokevirtual setAccessible : (Z)V
    //   3799: aload #8
    //   3801: aconst_null
    //   3802: iconst_2
    //   3803: anewarray java/lang/Object
    //   3806: dup
    //   3807: iconst_0
    //   3808: aload_0
    //   3809: aastore
    //   3810: dup
    //   3811: iconst_1
    //   3812: aload_1
    //   3813: ifnonnull -> 3831
    //   3816: goto -> 3823
    //   3819: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3822: athrow
    //   3823: aload_1
    //   3824: goto -> 3838
    //   3827: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3830: athrow
    //   3831: aload_1
    //   3832: checkcast [B
    //   3835: invokevirtual clone : ()Ljava/lang/Object;
    //   3838: aastore
    //   3839: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3842: checkcast java/lang/Boolean
    //   3845: invokevirtual booleanValue : ()Z
    //   3848: istore #4
    //   3850: iload_2
    //   3851: ifne -> 3868
    //   3854: iinc #7, 1
    //   3857: iload_2
    //   3858: ifne -> 3727
    //   3861: goto -> 3868
    //   3864: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3867: athrow
    //   3868: iload #4
    //   3870: ifeq -> 3876
    //   3873: iload #4
    //   3875: ireturn
    //   3876: getstatic burp/Zt7w.Zi : Ljava/lang/String;
    //   3879: getstatic burp/Zl4v.ZT : Ljava/lang/Object;
    //   3882: checkcast java/math/BigInteger
    //   3885: invokevirtual intValue : ()I
    //   3888: bipush #32
    //   3890: irem
    //   3891: invokestatic abs : (I)I
    //   3894: invokevirtual charAt : (I)C
    //   3897: getstatic burp/Zxyu.ZM : Ljava/lang/String;
    //   3900: getstatic burp/Zb6e.ZD : Ljava/lang/Object;
    //   3903: checkcast java/math/BigInteger
    //   3906: invokevirtual intValue : ()I
    //   3909: bipush #32
    //   3911: irem
    //   3912: invokestatic abs : (I)I
    //   3915: invokevirtual charAt : (I)C
    //   3918: if_icmple -> 4264
    //   3921: sipush #14429
    //   3924: sipush #17633
    //   3927: invokestatic a : (II)Ljava/lang/String;
    //   3930: iconst_1
    //   3931: ldc burp/Zlc5
    //   3933: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3936: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3939: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3942: astore #5
    //   3944: aload #5
    //   3946: arraylength
    //   3947: istore #6
    //   3949: iconst_0
    //   3950: istore #7
    //   3952: iload #7
    //   3954: iload #6
    //   3956: if_icmpge -> 4094
    //   3959: aload #5
    //   3961: iload #7
    //   3963: aaload
    //   3964: astore #8
    //   3966: aload #8
    //   3968: invokevirtual getModifiers : ()I
    //   3971: invokestatic isStatic : (I)Z
    //   3974: ifne -> 3984
    //   3977: goto -> 4087
    //   3980: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3983: athrow
    //   3984: aload #8
    //   3986: invokevirtual getType : ()Ljava/lang/Class;
    //   3989: astore #9
    //   3991: aload #9
    //   3993: ifnull -> 4074
    //   3996: aload #9
    //   3998: invokevirtual isPrimitive : ()Z
    //   4001: ifne -> 4074
    //   4004: goto -> 4011
    //   4007: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4010: athrow
    //   4011: aload #9
    //   4013: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4016: ifnull -> 4074
    //   4019: goto -> 4026
    //   4022: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4025: athrow
    //   4026: aload #9
    //   4028: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4031: invokevirtual getName : ()Ljava/lang/String;
    //   4034: ifnull -> 4074
    //   4037: goto -> 4044
    //   4040: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4043: athrow
    //   4044: aload #9
    //   4046: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4049: invokevirtual getName : ()Ljava/lang/String;
    //   4052: sipush #14409
    //   4055: sipush #-12720
    //   4058: invokestatic a : (II)Ljava/lang/String;
    //   4061: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4064: ifne -> 4074
    //   4067: goto -> 4074
    //   4070: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4073: athrow
    //   4074: aload #8
    //   4076: iconst_1
    //   4077: invokevirtual setAccessible : (Z)V
    //   4080: aload #8
    //   4082: aconst_null
    //   4083: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4086: pop
    //   4087: iinc #7, 1
    //   4090: iload_2
    //   4091: ifne -> 3952
    //   4094: sipush #14426
    //   4097: sipush #-12924
    //   4100: invokestatic a : (II)Ljava/lang/String;
    //   4103: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4106: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4109: astore #5
    //   4111: aload #5
    //   4113: arraylength
    //   4114: istore #6
    //   4116: iconst_0
    //   4117: istore #7
    //   4119: iload #7
    //   4121: iload #6
    //   4123: if_icmpge -> 4260
    //   4126: aload #5
    //   4128: iload #7
    //   4130: aaload
    //   4131: astore #8
    //   4133: aload #8
    //   4135: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4138: pop
    //   4139: aload #8
    //   4141: invokevirtual getModifiers : ()I
    //   4144: invokestatic isStatic : (I)Z
    //   4147: ifeq -> 4246
    //   4150: aload #8
    //   4152: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4155: arraylength
    //   4156: iconst_2
    //   4157: if_icmpne -> 4246
    //   4160: goto -> 4167
    //   4163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4166: athrow
    //   4167: aload #8
    //   4169: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4172: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4175: if_acmpne -> 4246
    //   4178: goto -> 4185
    //   4181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4184: athrow
    //   4185: aload #8
    //   4187: iconst_1
    //   4188: invokevirtual setAccessible : (Z)V
    //   4191: aload #8
    //   4193: aconst_null
    //   4194: iconst_2
    //   4195: anewarray java/lang/Object
    //   4198: dup
    //   4199: iconst_0
    //   4200: aload_0
    //   4201: aastore
    //   4202: dup
    //   4203: iconst_1
    //   4204: aload_1
    //   4205: ifnonnull -> 4223
    //   4208: goto -> 4215
    //   4211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4214: athrow
    //   4215: aload_1
    //   4216: goto -> 4230
    //   4219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4222: athrow
    //   4223: aload_1
    //   4224: checkcast [B
    //   4227: invokevirtual clone : ()Ljava/lang/Object;
    //   4230: aastore
    //   4231: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4234: checkcast java/lang/Boolean
    //   4237: invokevirtual booleanValue : ()Z
    //   4240: istore #4
    //   4242: iload_2
    //   4243: ifne -> 4260
    //   4246: iinc #7, 1
    //   4249: iload_2
    //   4250: ifne -> 4119
    //   4253: goto -> 4260
    //   4256: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4259: athrow
    //   4260: iload_2
    //   4261: ifne -> 4603
    //   4264: sipush #14430
    //   4267: sipush #19856
    //   4270: invokestatic a : (II)Ljava/lang/String;
    //   4273: iconst_1
    //   4274: ldc burp/Zr3q
    //   4276: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4279: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4282: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4285: astore #5
    //   4287: aload #5
    //   4289: arraylength
    //   4290: istore #6
    //   4292: iconst_0
    //   4293: istore #7
    //   4295: iload #7
    //   4297: iload #6
    //   4299: if_icmpge -> 4437
    //   4302: aload #5
    //   4304: iload #7
    //   4306: aaload
    //   4307: astore #8
    //   4309: aload #8
    //   4311: invokevirtual getModifiers : ()I
    //   4314: invokestatic isStatic : (I)Z
    //   4317: ifne -> 4327
    //   4320: goto -> 4430
    //   4323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4326: athrow
    //   4327: aload #8
    //   4329: invokevirtual getType : ()Ljava/lang/Class;
    //   4332: astore #9
    //   4334: aload #9
    //   4336: ifnull -> 4417
    //   4339: aload #9
    //   4341: invokevirtual isPrimitive : ()Z
    //   4344: ifne -> 4417
    //   4347: goto -> 4354
    //   4350: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4353: athrow
    //   4354: aload #9
    //   4356: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4359: ifnull -> 4417
    //   4362: goto -> 4369
    //   4365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4368: athrow
    //   4369: aload #9
    //   4371: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4374: invokevirtual getName : ()Ljava/lang/String;
    //   4377: ifnull -> 4417
    //   4380: goto -> 4387
    //   4383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4386: athrow
    //   4387: aload #9
    //   4389: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4392: invokevirtual getName : ()Ljava/lang/String;
    //   4395: sipush #14409
    //   4398: sipush #-12720
    //   4401: invokestatic a : (II)Ljava/lang/String;
    //   4404: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4407: ifne -> 4417
    //   4410: goto -> 4417
    //   4413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4416: athrow
    //   4417: aload #8
    //   4419: iconst_1
    //   4420: invokevirtual setAccessible : (Z)V
    //   4423: aload #8
    //   4425: aconst_null
    //   4426: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4429: pop
    //   4430: iinc #7, 1
    //   4433: iload_2
    //   4434: ifne -> 4295
    //   4437: sipush #14404
    //   4440: sipush #20937
    //   4443: invokestatic a : (II)Ljava/lang/String;
    //   4446: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4449: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4452: astore #5
    //   4454: aload #5
    //   4456: arraylength
    //   4457: istore #6
    //   4459: iconst_0
    //   4460: istore #7
    //   4462: iload #7
    //   4464: iload #6
    //   4466: if_icmpge -> 4603
    //   4469: aload #5
    //   4471: iload #7
    //   4473: aaload
    //   4474: astore #8
    //   4476: aload #8
    //   4478: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4481: pop
    //   4482: aload #8
    //   4484: invokevirtual getModifiers : ()I
    //   4487: invokestatic isStatic : (I)Z
    //   4490: ifeq -> 4589
    //   4493: aload #8
    //   4495: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4498: arraylength
    //   4499: iconst_2
    //   4500: if_icmpne -> 4589
    //   4503: goto -> 4510
    //   4506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4509: athrow
    //   4510: aload #8
    //   4512: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4515: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4518: if_acmpne -> 4589
    //   4521: goto -> 4528
    //   4524: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4527: athrow
    //   4528: aload #8
    //   4530: iconst_1
    //   4531: invokevirtual setAccessible : (Z)V
    //   4534: aload #8
    //   4536: aconst_null
    //   4537: iconst_2
    //   4538: anewarray java/lang/Object
    //   4541: dup
    //   4542: iconst_0
    //   4543: aload_0
    //   4544: aastore
    //   4545: dup
    //   4546: iconst_1
    //   4547: aload_1
    //   4548: ifnonnull -> 4566
    //   4551: goto -> 4558
    //   4554: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4557: athrow
    //   4558: aload_1
    //   4559: goto -> 4573
    //   4562: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4565: athrow
    //   4566: aload_1
    //   4567: checkcast [B
    //   4570: invokevirtual clone : ()Ljava/lang/Object;
    //   4573: aastore
    //   4574: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4577: checkcast java/lang/Boolean
    //   4580: invokevirtual booleanValue : ()Z
    //   4583: istore #4
    //   4585: iload_2
    //   4586: ifne -> 4603
    //   4589: iinc #7, 1
    //   4592: iload_2
    //   4593: ifne -> 4462
    //   4596: goto -> 4603
    //   4599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4602: athrow
    //   4603: iload #4
    //   4605: ifeq -> 4611
    //   4608: iload #4
    //   4610: ireturn
    //   4611: getstatic burp/Zxyu.ZM : Ljava/lang/String;
    //   4614: getstatic burp/Zm81.Zy : Ljava/lang/Object;
    //   4617: checkcast java/math/BigInteger
    //   4620: invokevirtual intValue : ()I
    //   4623: bipush #32
    //   4625: irem
    //   4626: invokestatic abs : (I)I
    //   4629: invokevirtual charAt : (I)C
    //   4632: getstatic burp/Zmpc.ZT : Ljava/lang/String;
    //   4635: getstatic burp/Zgco.Zx : Ljava/lang/Object;
    //   4638: checkcast java/math/BigInteger
    //   4641: invokevirtual intValue : ()I
    //   4644: bipush #32
    //   4646: irem
    //   4647: invokestatic abs : (I)I
    //   4650: invokevirtual charAt : (I)C
    //   4653: if_icmpgt -> 4999
    //   4656: sipush #14407
    //   4659: sipush #28153
    //   4662: invokestatic a : (II)Ljava/lang/String;
    //   4665: iconst_1
    //   4666: ldc burp/Ztjh
    //   4668: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4671: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4674: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4677: astore #5
    //   4679: aload #5
    //   4681: arraylength
    //   4682: istore #6
    //   4684: iconst_0
    //   4685: istore #7
    //   4687: iload #7
    //   4689: iload #6
    //   4691: if_icmpge -> 4829
    //   4694: aload #5
    //   4696: iload #7
    //   4698: aaload
    //   4699: astore #8
    //   4701: aload #8
    //   4703: invokevirtual getModifiers : ()I
    //   4706: invokestatic isStatic : (I)Z
    //   4709: ifne -> 4719
    //   4712: goto -> 4822
    //   4715: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4718: athrow
    //   4719: aload #8
    //   4721: invokevirtual getType : ()Ljava/lang/Class;
    //   4724: astore #9
    //   4726: aload #9
    //   4728: ifnull -> 4809
    //   4731: aload #9
    //   4733: invokevirtual isPrimitive : ()Z
    //   4736: ifne -> 4809
    //   4739: goto -> 4746
    //   4742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4745: athrow
    //   4746: aload #9
    //   4748: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4751: ifnull -> 4809
    //   4754: goto -> 4761
    //   4757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4760: athrow
    //   4761: aload #9
    //   4763: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4766: invokevirtual getName : ()Ljava/lang/String;
    //   4769: ifnull -> 4809
    //   4772: goto -> 4779
    //   4775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4778: athrow
    //   4779: aload #9
    //   4781: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4784: invokevirtual getName : ()Ljava/lang/String;
    //   4787: sipush #14409
    //   4790: sipush #-12720
    //   4793: invokestatic a : (II)Ljava/lang/String;
    //   4796: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4799: ifne -> 4809
    //   4802: goto -> 4809
    //   4805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4808: athrow
    //   4809: aload #8
    //   4811: iconst_1
    //   4812: invokevirtual setAccessible : (Z)V
    //   4815: aload #8
    //   4817: aconst_null
    //   4818: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4821: pop
    //   4822: iinc #7, 1
    //   4825: iload_2
    //   4826: ifne -> 4687
    //   4829: sipush #14428
    //   4832: sipush #10145
    //   4835: invokestatic a : (II)Ljava/lang/String;
    //   4838: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4841: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4844: astore #5
    //   4846: aload #5
    //   4848: arraylength
    //   4849: istore #6
    //   4851: iconst_0
    //   4852: istore #7
    //   4854: iload #7
    //   4856: iload #6
    //   4858: if_icmpge -> 4995
    //   4861: aload #5
    //   4863: iload #7
    //   4865: aaload
    //   4866: astore #8
    //   4868: aload #8
    //   4870: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4873: pop
    //   4874: aload #8
    //   4876: invokevirtual getModifiers : ()I
    //   4879: invokestatic isStatic : (I)Z
    //   4882: ifeq -> 4981
    //   4885: aload #8
    //   4887: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4890: arraylength
    //   4891: iconst_2
    //   4892: if_icmpne -> 4981
    //   4895: goto -> 4902
    //   4898: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4901: athrow
    //   4902: aload #8
    //   4904: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4907: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4910: if_acmpne -> 4981
    //   4913: goto -> 4920
    //   4916: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4919: athrow
    //   4920: aload #8
    //   4922: iconst_1
    //   4923: invokevirtual setAccessible : (Z)V
    //   4926: aload #8
    //   4928: aconst_null
    //   4929: iconst_2
    //   4930: anewarray java/lang/Object
    //   4933: dup
    //   4934: iconst_0
    //   4935: aload_0
    //   4936: aastore
    //   4937: dup
    //   4938: iconst_1
    //   4939: aload_1
    //   4940: ifnonnull -> 4958
    //   4943: goto -> 4950
    //   4946: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4949: athrow
    //   4950: aload_1
    //   4951: goto -> 4965
    //   4954: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4957: athrow
    //   4958: aload_1
    //   4959: checkcast [B
    //   4962: invokevirtual clone : ()Ljava/lang/Object;
    //   4965: aastore
    //   4966: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4969: checkcast java/lang/Boolean
    //   4972: invokevirtual booleanValue : ()Z
    //   4975: istore #4
    //   4977: iload_2
    //   4978: ifne -> 4995
    //   4981: iinc #7, 1
    //   4984: iload_2
    //   4985: ifne -> 4854
    //   4988: goto -> 4995
    //   4991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4994: athrow
    //   4995: iload_2
    //   4996: ifne -> 5338
    //   4999: sipush #14420
    //   5002: sipush #4425
    //   5005: invokestatic a : (II)Ljava/lang/String;
    //   5008: iconst_1
    //   5009: ldc burp/Zko9
    //   5011: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5014: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5017: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5020: astore #5
    //   5022: aload #5
    //   5024: arraylength
    //   5025: istore #6
    //   5027: iconst_0
    //   5028: istore #7
    //   5030: iload #7
    //   5032: iload #6
    //   5034: if_icmpge -> 5172
    //   5037: aload #5
    //   5039: iload #7
    //   5041: aaload
    //   5042: astore #8
    //   5044: aload #8
    //   5046: invokevirtual getModifiers : ()I
    //   5049: invokestatic isStatic : (I)Z
    //   5052: ifne -> 5062
    //   5055: goto -> 5165
    //   5058: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5061: athrow
    //   5062: aload #8
    //   5064: invokevirtual getType : ()Ljava/lang/Class;
    //   5067: astore #9
    //   5069: aload #9
    //   5071: ifnull -> 5152
    //   5074: aload #9
    //   5076: invokevirtual isPrimitive : ()Z
    //   5079: ifne -> 5152
    //   5082: goto -> 5089
    //   5085: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5088: athrow
    //   5089: aload #9
    //   5091: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5094: ifnull -> 5152
    //   5097: goto -> 5104
    //   5100: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5103: athrow
    //   5104: aload #9
    //   5106: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5109: invokevirtual getName : ()Ljava/lang/String;
    //   5112: ifnull -> 5152
    //   5115: goto -> 5122
    //   5118: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5121: athrow
    //   5122: aload #9
    //   5124: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5127: invokevirtual getName : ()Ljava/lang/String;
    //   5130: sipush #14409
    //   5133: sipush #-12720
    //   5136: invokestatic a : (II)Ljava/lang/String;
    //   5139: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5142: ifne -> 5152
    //   5145: goto -> 5152
    //   5148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5151: athrow
    //   5152: aload #8
    //   5154: iconst_1
    //   5155: invokevirtual setAccessible : (Z)V
    //   5158: aload #8
    //   5160: aconst_null
    //   5161: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5164: pop
    //   5165: iinc #7, 1
    //   5168: iload_2
    //   5169: ifne -> 5030
    //   5172: sipush #14419
    //   5175: sipush #19937
    //   5178: invokestatic a : (II)Ljava/lang/String;
    //   5181: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5184: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5187: astore #5
    //   5189: aload #5
    //   5191: arraylength
    //   5192: istore #6
    //   5194: iconst_0
    //   5195: istore #7
    //   5197: iload #7
    //   5199: iload #6
    //   5201: if_icmpge -> 5338
    //   5204: aload #5
    //   5206: iload #7
    //   5208: aaload
    //   5209: astore #8
    //   5211: aload #8
    //   5213: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5216: pop
    //   5217: aload #8
    //   5219: invokevirtual getModifiers : ()I
    //   5222: invokestatic isStatic : (I)Z
    //   5225: ifeq -> 5324
    //   5228: aload #8
    //   5230: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5233: arraylength
    //   5234: iconst_2
    //   5235: if_icmpne -> 5324
    //   5238: goto -> 5245
    //   5241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5244: athrow
    //   5245: aload #8
    //   5247: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5250: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5253: if_acmpne -> 5324
    //   5256: goto -> 5263
    //   5259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5262: athrow
    //   5263: aload #8
    //   5265: iconst_1
    //   5266: invokevirtual setAccessible : (Z)V
    //   5269: aload #8
    //   5271: aconst_null
    //   5272: iconst_2
    //   5273: anewarray java/lang/Object
    //   5276: dup
    //   5277: iconst_0
    //   5278: aload_0
    //   5279: aastore
    //   5280: dup
    //   5281: iconst_1
    //   5282: aload_1
    //   5283: ifnonnull -> 5301
    //   5286: goto -> 5293
    //   5289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5292: athrow
    //   5293: aload_1
    //   5294: goto -> 5308
    //   5297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5300: athrow
    //   5301: aload_1
    //   5302: checkcast [B
    //   5305: invokevirtual clone : ()Ljava/lang/Object;
    //   5308: aastore
    //   5309: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5312: checkcast java/lang/Boolean
    //   5315: invokevirtual booleanValue : ()Z
    //   5318: istore #4
    //   5320: iload_2
    //   5321: ifne -> 5338
    //   5324: iinc #7, 1
    //   5327: iload_2
    //   5328: ifne -> 5197
    //   5331: goto -> 5338
    //   5334: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5337: athrow
    //   5338: iload #4
    //   5340: ireturn
    //   5341: astore_3
    //   5342: new java/lang/Exception
    //   5345: dup
    //   5346: aload_3
    //   5347: invokevirtual getMessage : ()Ljava/lang/String;
    //   5350: invokespecial <init> : (Ljava/lang/String;)V
    //   5353: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3140	5341	java/lang/Throwable
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
    //   2497	2511	2511	java/lang/Throwable
    //   2522	2535	2538	java/lang/Throwable
    //   2527	2550	2553	java/lang/Throwable
    //   2542	2568	2571	java/lang/Throwable
    //   2557	2598	2601	java/lang/Throwable
    //   2664	2691	2694	java/lang/Throwable
    //   2681	2709	2712	java/lang/Throwable
    //   2698	2739	2742	java/lang/Throwable
    //   2716	2750	2750	java/lang/Throwable
    //   2773	2784	2787	java/lang/Throwable
    //   2839	2853	2853	java/lang/Throwable
    //   2864	2877	2880	java/lang/Throwable
    //   2869	2892	2895	java/lang/Throwable
    //   2884	2910	2913	java/lang/Throwable
    //   2899	2940	2943	java/lang/Throwable
    //   3006	3033	3036	java/lang/Throwable
    //   3023	3051	3054	java/lang/Throwable
    //   3040	3081	3084	java/lang/Throwable
    //   3058	3092	3092	java/lang/Throwable
    //   3115	3126	3129	java/lang/Throwable
    //   3141	3875	5341	java/lang/Throwable
    //   3231	3245	3245	java/lang/Throwable
    //   3256	3269	3272	java/lang/Throwable
    //   3261	3284	3287	java/lang/Throwable
    //   3276	3302	3305	java/lang/Throwable
    //   3291	3332	3335	java/lang/Throwable
    //   3398	3425	3428	java/lang/Throwable
    //   3415	3443	3446	java/lang/Throwable
    //   3432	3473	3476	java/lang/Throwable
    //   3450	3484	3484	java/lang/Throwable
    //   3507	3518	3521	java/lang/Throwable
    //   3574	3588	3588	java/lang/Throwable
    //   3599	3612	3615	java/lang/Throwable
    //   3604	3627	3630	java/lang/Throwable
    //   3619	3645	3648	java/lang/Throwable
    //   3634	3675	3678	java/lang/Throwable
    //   3741	3768	3771	java/lang/Throwable
    //   3758	3786	3789	java/lang/Throwable
    //   3775	3816	3819	java/lang/Throwable
    //   3793	3827	3827	java/lang/Throwable
    //   3850	3861	3864	java/lang/Throwable
    //   3876	4610	5341	java/lang/Throwable
    //   3966	3980	3980	java/lang/Throwable
    //   3991	4004	4007	java/lang/Throwable
    //   3996	4019	4022	java/lang/Throwable
    //   4011	4037	4040	java/lang/Throwable
    //   4026	4067	4070	java/lang/Throwable
    //   4133	4160	4163	java/lang/Throwable
    //   4150	4178	4181	java/lang/Throwable
    //   4167	4208	4211	java/lang/Throwable
    //   4185	4219	4219	java/lang/Throwable
    //   4242	4253	4256	java/lang/Throwable
    //   4309	4323	4323	java/lang/Throwable
    //   4334	4347	4350	java/lang/Throwable
    //   4339	4362	4365	java/lang/Throwable
    //   4354	4380	4383	java/lang/Throwable
    //   4369	4410	4413	java/lang/Throwable
    //   4476	4503	4506	java/lang/Throwable
    //   4493	4521	4524	java/lang/Throwable
    //   4510	4551	4554	java/lang/Throwable
    //   4528	4562	4562	java/lang/Throwable
    //   4585	4596	4599	java/lang/Throwable
    //   4611	5340	5341	java/lang/Throwable
    //   4701	4715	4715	java/lang/Throwable
    //   4726	4739	4742	java/lang/Throwable
    //   4731	4754	4757	java/lang/Throwable
    //   4746	4772	4775	java/lang/Throwable
    //   4761	4802	4805	java/lang/Throwable
    //   4868	4895	4898	java/lang/Throwable
    //   4885	4913	4916	java/lang/Throwable
    //   4902	4943	4946	java/lang/Throwable
    //   4920	4954	4954	java/lang/Throwable
    //   4977	4988	4991	java/lang/Throwable
    //   5044	5058	5058	java/lang/Throwable
    //   5069	5082	5085	java/lang/Throwable
    //   5074	5097	5100	java/lang/Throwable
    //   5089	5115	5118	java/lang/Throwable
    //   5104	5145	5148	java/lang/Throwable
    //   5211	5238	5241	java/lang/Throwable
    //   5228	5256	5259	java/lang/Throwable
    //   5245	5286	5289	java/lang/Throwable
    //   5263	5297	5297	java/lang/Throwable
    //   5320	5331	5334	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ö-õÆ¼÷g\\tO,a . w zÌ«ùÊ$×÷ó«ÂÂ½µÅí'e*àÛïê\\túÃ(öóJÂ\\t®²Íù¾ÄÈ oËäáÅ|Y SÝb0åêûf§Ã¼6qÚ<æ.Ãì'\\tJÏ©47©ØMÛmáY`À8ã?/¤âE¡·ËÇÑ·.¨ÙAØÏbàøÎ|ÛñIÈs°ÈÃÆÕ¼¬b¬¾O3Aø´ª!¡vpÝ×kÇé]Ê£ÎÀ\\tîª¦¢ï¯d\\b±é½M«{M7\Àê\\rüYª`ôØþ>mö#\\rôN;7Yù"ñµ+V,å(©8n??¤dEt»×Êÿ_®5MÿXÚVî-~fpN~2¨\\t]Ón*hG"X©\\t°aÓ|ßÀw\\tWÀOÒ¸#\\tç(9U¨sâ\\r\\t3 £PÑ\\bô_\\tÐ ßD^æôb\\tÌ¼\Ç.úõå±\\tPZ'IßîF\\tÂ¬ÅºòíQ\\tó7|ÅxÛ\\tÚà|ßeÒ±n\\tUuú][\\n?\\teibN4\\tU@üA'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #64
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
    //   68: ldc 'ìT¹øP\\bÉV%¬Ù}Zq\\fíÏTúf=d\\tù'Pk.ý'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #38
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
    //   129: putstatic burp/Zelz.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zelz.b : [Ljava/lang/String;
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
    //   212: bipush #54
    //   214: goto -> 244
    //   217: bipush #93
    //   219: goto -> 244
    //   222: bipush #23
    //   224: goto -> 244
    //   227: bipush #24
    //   229: goto -> 244
    //   232: bipush #29
    //   234: goto -> 244
    //   237: bipush #109
    //   239: goto -> 244
    //   242: bipush #72
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
    //   304: sipush #14421
    //   307: sipush #11023
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zelz.Z_ : Ljava/lang/Object;
    //   319: sipush #14431
    //   322: sipush #18381
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zelz.ZK : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x385D) & 0xFFFF;
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
      char c = 'Ô';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zelz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */