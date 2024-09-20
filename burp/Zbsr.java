package burp;

import java.math.BigInteger;

class Zbsr extends ClassLoader {
  static String Zq;
  
  static Object ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zg(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zy(Object paramObject) {
    Zxso.ZH = a(8714, -8951);
    Zxso.ZF = new BigInteger(a(8718, 16082));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zmj4.ZM.charAt(Math.abs(((BigInteger)Zx54.Zn).intValue() % 32)) <= Zx4l.Zy.charAt(Math.abs(((BigInteger)Ztbf.Zv).intValue() % 32))) {
          try {
            Zxfu.Zl(Class.forName(a(8712, -3251)));
            if (bool)
              Zebu.Zt(Class.forName(a(8716, 25823))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zebu.Zt(Class.forName(a(8716, 25823)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zi(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zg_p.ZO : Ljava/lang/String;
    //   172: getstatic burp/Zehi.Zb : Ljava/lang/Object;
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
    //   206: getstatic burp/Zsm3.Zl : Ljava/lang/String;
    //   209: getstatic burp/Zm0s.Zl : Ljava/lang/Object;
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
    //   243: getstatic burp/Zl_u.Zc : Ljava/lang/String;
    //   246: getstatic burp/Zsde.Zx : Ljava/lang/Object;
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
    //   280: getstatic burp/Zg_p.ZO : Ljava/lang/String;
    //   283: getstatic burp/Ze13.ZD : Ljava/lang/Object;
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
    //   317: getstatic burp/Zsby.Zx : Ljava/lang/String;
    //   320: getstatic burp/Zter.Zc : Ljava/lang/Object;
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
    //   354: getstatic burp/Zbsr.Zq : Ljava/lang/String;
    //   357: getstatic burp/Ztnw.Zt : Ljava/lang/Object;
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
    //   391: getstatic burp/Zgw0.ZL : Ljava/lang/String;
    //   394: getstatic burp/Zedz.Za : Ljava/lang/Object;
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
    //   428: getstatic burp/Ze3d.ZL : Ljava/lang/String;
    //   431: getstatic burp/Zeh9.ZY : Ljava/lang/Object;
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
    //   465: getstatic burp/Zgmt.Zu : Ljava/lang/String;
    //   468: getstatic burp/Zk9s.ZY : Ljava/lang/Object;
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
    //   502: getstatic burp/Zl2g.ZI : Ljava/lang/String;
    //   505: getstatic burp/Zx54.Zn : Ljava/lang/Object;
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
    //   539: getstatic burp/Ze3d.ZL : Ljava/lang/String;
    //   542: getstatic burp/Zr0u.ZB : Ljava/lang/Object;
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
    //   576: getstatic burp/Zehi.Zi : Ljava/lang/String;
    //   579: getstatic burp/Zxzd.ZD : Ljava/lang/Object;
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
    //   613: getstatic burp/Zkfz.Zs : Ljava/lang/String;
    //   616: getstatic burp/Zl2g.ZG : Ljava/lang/Object;
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
    //   650: getstatic burp/Zx54.Zs : Ljava/lang/String;
    //   653: getstatic burp/Zm0s.Zl : Ljava/lang/Object;
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
    //   687: getstatic burp/Zehi.Zi : Ljava/lang/String;
    //   690: getstatic burp/Zb2s.Ze : Ljava/lang/Object;
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
    //   724: getstatic burp/Zxl5.Zq : Ljava/lang/String;
    //   727: getstatic burp/Zb2s.Ze : Ljava/lang/Object;
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
    //   761: getstatic burp/Zlv6.Zt : Ljava/lang/String;
    //   764: getstatic burp/Zt4g.Zv : Ljava/lang/Object;
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
    //   798: getstatic burp/Zx4w.Zo : Ljava/lang/String;
    //   801: getstatic burp/Zm0s.Zl : Ljava/lang/Object;
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
    //   835: getstatic burp/Zl_k.Zw : Ljava/lang/String;
    //   838: getstatic burp/Ze7q.Zk : Ljava/lang/Object;
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
    //   872: getstatic burp/Zxso.ZH : Ljava/lang/String;
    //   875: getstatic burp/Zrbp.Z_ : Ljava/lang/Object;
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
    //   909: getstatic burp/Ze3j.ZI : Ljava/lang/String;
    //   912: getstatic burp/Zsde.Zx : Ljava/lang/Object;
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
    //   946: getstatic burp/Zkbm.Zb : Ljava/lang/String;
    //   949: getstatic burp/Zxk9.ZI : Ljava/lang/Object;
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
    //   983: getstatic burp/Zxyp.Z_ : Ljava/lang/String;
    //   986: getstatic burp/Zg99.ZZ : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zedz.Zh : Ljava/lang/String;
    //   1023: getstatic burp/Zb8v.ZA : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zl_u.Zc : Ljava/lang/String;
    //   1060: getstatic burp/Zg7z.ZV : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zkig.ZE : Ljava/lang/String;
    //   1097: getstatic burp/Zk8b.ZK : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zes_.ZM : Ljava/lang/String;
    //   1134: getstatic burp/Zkfz.Zr : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zer.Zp : Ljava/lang/String;
    //   1171: getstatic burp/Zg_p.Zx : Ljava/lang/Object;
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
    //   1205: getstatic burp/Ze7q.ZW : Ljava/lang/String;
    //   1208: getstatic burp/Zes_.ZJ : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zkig.ZE : Ljava/lang/String;
    //   1245: getstatic burp/Zsm3.ZC : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zxyp.Z_ : Ljava/lang/String;
    //   1282: getstatic burp/Zkbf.Zx : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zzap.ZA : Ljava/lang/String;
    //   1319: getstatic burp/Ze3d.Ze : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zx4w.Zo : Ljava/lang/String;
    //   1362: sipush #8713
    //   1365: sipush #12150
    //   1368: invokestatic a : (II)Ljava/lang/String;
    //   1371: iconst_1
    //   1372: ldc burp/Zmz
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
    //   1493: sipush #8715
    //   1496: sipush #-12580
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
    //   1532: ifeq -> 1393
    //   1535: sipush #8717
    //   1538: sipush #-1190
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
    //   1680: ifeq -> 1697
    //   1683: iinc #6, 1
    //   1686: iload_2
    //   1687: ifeq -> 1560
    //   1690: goto -> 1697
    //   1693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1696: athrow
    //   1697: getstatic burp/Ze7q.Zk : Ljava/lang/Object;
    //   1700: checkcast java/math/BigInteger
    //   1703: invokevirtual toByteArray : ()[B
    //   1706: astore #4
    //   1708: bipush #32
    //   1710: newarray int
    //   1712: dup
    //   1713: iconst_0
    //   1714: ldc 943331329
    //   1716: iastore
    //   1717: dup
    //   1718: iconst_1
    //   1719: ldc 170788368
    //   1721: iastore
    //   1722: dup
    //   1723: iconst_2
    //   1724: ldc 1008414755
    //   1726: iastore
    //   1727: dup
    //   1728: iconst_3
    //   1729: ldc 187049985
    //   1731: iastore
    //   1732: dup
    //   1733: iconst_4
    //   1734: ldc 1010368540
    //   1736: iastore
    //   1737: dup
    //   1738: iconst_5
    //   1739: ldc 220604441
    //   1741: iastore
    //   1742: dup
    //   1743: bipush #6
    //   1745: ldc 940377620
    //   1747: iastore
    //   1748: dup
    //   1749: bipush #7
    //   1751: ldc 255209728
    //   1753: iastore
    //   1754: dup
    //   1755: bipush #8
    //   1757: ldc 689771012
    //   1759: iastore
    //   1760: dup
    //   1761: bipush #9
    //   1763: ldc 221709344
    //   1765: iastore
    //   1766: dup
    //   1767: bipush #10
    //   1769: ldc 957157408
    //   1771: iastore
    //   1772: dup
    //   1773: bipush #11
    //   1775: ldc 892536332
    //   1777: iastore
    //   1778: dup
    //   1779: bipush #12
    //   1781: ldc 722417666
    //   1783: iastore
    //   1784: dup
    //   1785: bipush #13
    //   1787: ldc 1026621720
    //   1789: iastore
    //   1790: dup
    //   1791: bipush #14
    //   1793: ldc 655302664
    //   1795: iastore
    //   1796: dup
    //   1797: bipush #15
    //   1799: ldc 890966315
    //   1801: iastore
    //   1802: dup
    //   1803: bipush #16
    //   1805: ldc 187632156
    //   1807: iastore
    //   1808: dup
    //   1809: bipush #17
    //   1811: ldc 874189824
    //   1813: iastore
    //   1814: dup
    //   1815: bipush #18
    //   1817: ldc 254150144
    //   1819: iastore
    //   1820: dup
    //   1821: bipush #19
    //   1823: ldc 924386310
    //   1825: iastore
    //   1826: dup
    //   1827: bipush #20
    //   1829: ldc 121057538
    //   1831: iastore
    //   1832: dup
    //   1833: bipush #21
    //   1835: ldc 840500228
    //   1837: iastore
    //   1838: dup
    //   1839: bipush #22
    //   1841: ldc 389160971
    //   1843: iastore
    //   1844: dup
    //   1845: bipush #23
    //   1847: ldc 907870729
    //   1849: iastore
    //   1850: dup
    //   1851: bipush #24
    //   1853: ldc 389426184
    //   1855: iastore
    //   1856: dup
    //   1857: bipush #25
    //   1859: ldc 973875457
    //   1861: iastore
    //   1862: dup
    //   1863: bipush #26
    //   1865: ldc 372376604
    //   1867: iastore
    //   1868: dup
    //   1869: bipush #27
    //   1871: ldc 707731490
    //   1873: iastore
    //   1874: dup
    //   1875: bipush #28
    //   1877: ldc 1043334948
    //   1879: iastore
    //   1880: dup
    //   1881: bipush #29
    //   1883: ldc 439222784
    //   1885: iastore
    //   1886: dup
    //   1887: bipush #30
    //   1889: ldc 876216579
    //   1891: iastore
    //   1892: dup
    //   1893: bipush #31
    //   1895: ldc 455999525
    //   1897: iastore
    //   1898: astore #6
    //   1900: bipush #8
    //   1902: aload #4
    //   1904: arraylength
    //   1905: bipush #8
    //   1907: irem
    //   1908: isub
    //   1909: istore #7
    //   1911: aload #4
    //   1913: arraylength
    //   1914: iload #7
    //   1916: iadd
    //   1917: newarray byte
    //   1919: astore #8
    //   1921: iconst_0
    //   1922: istore #9
    //   1924: iload #9
    //   1926: aload #4
    //   1928: arraylength
    //   1929: if_icmpge -> 1949
    //   1932: aload #8
    //   1934: iload #9
    //   1936: aload #4
    //   1938: iload #9
    //   1940: baload
    //   1941: bastore
    //   1942: iinc #9, 1
    //   1945: iload_2
    //   1946: ifeq -> 1924
    //   1949: aload #4
    //   1951: arraylength
    //   1952: istore #9
    //   1954: iload #9
    //   1956: aload #8
    //   1958: arraylength
    //   1959: if_icmpge -> 1977
    //   1962: aload #8
    //   1964: iload #9
    //   1966: iload #7
    //   1968: i2b
    //   1969: bastore
    //   1970: iinc #9, 1
    //   1973: iload_2
    //   1974: ifeq -> 1954
    //   1977: aload #8
    //   1979: astore #4
    //   1981: bipush #64
    //   1983: newarray int
    //   1985: dup
    //   1986: iconst_0
    //   1987: ldc 16843776
    //   1989: iastore
    //   1990: dup
    //   1991: iconst_1
    //   1992: iconst_0
    //   1993: iastore
    //   1994: dup
    //   1995: iconst_2
    //   1996: ldc 65536
    //   1998: iastore
    //   1999: dup
    //   2000: iconst_3
    //   2001: ldc 16843780
    //   2003: iastore
    //   2004: dup
    //   2005: iconst_4
    //   2006: ldc 16842756
    //   2008: iastore
    //   2009: dup
    //   2010: iconst_5
    //   2011: ldc 66564
    //   2013: iastore
    //   2014: dup
    //   2015: bipush #6
    //   2017: iconst_4
    //   2018: iastore
    //   2019: dup
    //   2020: bipush #7
    //   2022: ldc 65536
    //   2024: iastore
    //   2025: dup
    //   2026: bipush #8
    //   2028: sipush #1024
    //   2031: iastore
    //   2032: dup
    //   2033: bipush #9
    //   2035: ldc 16843776
    //   2037: iastore
    //   2038: dup
    //   2039: bipush #10
    //   2041: ldc 16843780
    //   2043: iastore
    //   2044: dup
    //   2045: bipush #11
    //   2047: sipush #1024
    //   2050: iastore
    //   2051: dup
    //   2052: bipush #12
    //   2054: ldc 16778244
    //   2056: iastore
    //   2057: dup
    //   2058: bipush #13
    //   2060: ldc 16842756
    //   2062: iastore
    //   2063: dup
    //   2064: bipush #14
    //   2066: ldc 16777216
    //   2068: iastore
    //   2069: dup
    //   2070: bipush #15
    //   2072: iconst_4
    //   2073: iastore
    //   2074: dup
    //   2075: bipush #16
    //   2077: sipush #1028
    //   2080: iastore
    //   2081: dup
    //   2082: bipush #17
    //   2084: ldc 16778240
    //   2086: iastore
    //   2087: dup
    //   2088: bipush #18
    //   2090: ldc 16778240
    //   2092: iastore
    //   2093: dup
    //   2094: bipush #19
    //   2096: ldc 66560
    //   2098: iastore
    //   2099: dup
    //   2100: bipush #20
    //   2102: ldc 66560
    //   2104: iastore
    //   2105: dup
    //   2106: bipush #21
    //   2108: ldc 16842752
    //   2110: iastore
    //   2111: dup
    //   2112: bipush #22
    //   2114: ldc 16842752
    //   2116: iastore
    //   2117: dup
    //   2118: bipush #23
    //   2120: ldc 16778244
    //   2122: iastore
    //   2123: dup
    //   2124: bipush #24
    //   2126: ldc 65540
    //   2128: iastore
    //   2129: dup
    //   2130: bipush #25
    //   2132: ldc 16777220
    //   2134: iastore
    //   2135: dup
    //   2136: bipush #26
    //   2138: ldc 16777220
    //   2140: iastore
    //   2141: dup
    //   2142: bipush #27
    //   2144: ldc 65540
    //   2146: iastore
    //   2147: dup
    //   2148: bipush #28
    //   2150: iconst_0
    //   2151: iastore
    //   2152: dup
    //   2153: bipush #29
    //   2155: sipush #1028
    //   2158: iastore
    //   2159: dup
    //   2160: bipush #30
    //   2162: ldc 66564
    //   2164: iastore
    //   2165: dup
    //   2166: bipush #31
    //   2168: ldc 16777216
    //   2170: iastore
    //   2171: dup
    //   2172: bipush #32
    //   2174: ldc 65536
    //   2176: iastore
    //   2177: dup
    //   2178: bipush #33
    //   2180: ldc 16843780
    //   2182: iastore
    //   2183: dup
    //   2184: bipush #34
    //   2186: iconst_4
    //   2187: iastore
    //   2188: dup
    //   2189: bipush #35
    //   2191: ldc 16842752
    //   2193: iastore
    //   2194: dup
    //   2195: bipush #36
    //   2197: ldc 16843776
    //   2199: iastore
    //   2200: dup
    //   2201: bipush #37
    //   2203: ldc 16777216
    //   2205: iastore
    //   2206: dup
    //   2207: bipush #38
    //   2209: ldc 16777216
    //   2211: iastore
    //   2212: dup
    //   2213: bipush #39
    //   2215: sipush #1024
    //   2218: iastore
    //   2219: dup
    //   2220: bipush #40
    //   2222: ldc 16842756
    //   2224: iastore
    //   2225: dup
    //   2226: bipush #41
    //   2228: ldc 65536
    //   2230: iastore
    //   2231: dup
    //   2232: bipush #42
    //   2234: ldc 66560
    //   2236: iastore
    //   2237: dup
    //   2238: bipush #43
    //   2240: ldc 16777220
    //   2242: iastore
    //   2243: dup
    //   2244: bipush #44
    //   2246: sipush #1024
    //   2249: iastore
    //   2250: dup
    //   2251: bipush #45
    //   2253: iconst_4
    //   2254: iastore
    //   2255: dup
    //   2256: bipush #46
    //   2258: ldc 16778244
    //   2260: iastore
    //   2261: dup
    //   2262: bipush #47
    //   2264: ldc 66564
    //   2266: iastore
    //   2267: dup
    //   2268: bipush #48
    //   2270: ldc 16843780
    //   2272: iastore
    //   2273: dup
    //   2274: bipush #49
    //   2276: ldc 65540
    //   2278: iastore
    //   2279: dup
    //   2280: bipush #50
    //   2282: ldc 16842752
    //   2284: iastore
    //   2285: dup
    //   2286: bipush #51
    //   2288: ldc 16778244
    //   2290: iastore
    //   2291: dup
    //   2292: bipush #52
    //   2294: ldc 16777220
    //   2296: iastore
    //   2297: dup
    //   2298: bipush #53
    //   2300: sipush #1028
    //   2303: iastore
    //   2304: dup
    //   2305: bipush #54
    //   2307: ldc 66564
    //   2309: iastore
    //   2310: dup
    //   2311: bipush #55
    //   2313: ldc 16843776
    //   2315: iastore
    //   2316: dup
    //   2317: bipush #56
    //   2319: sipush #1028
    //   2322: iastore
    //   2323: dup
    //   2324: bipush #57
    //   2326: ldc 16778240
    //   2328: iastore
    //   2329: dup
    //   2330: bipush #58
    //   2332: ldc 16778240
    //   2334: iastore
    //   2335: dup
    //   2336: bipush #59
    //   2338: iconst_0
    //   2339: iastore
    //   2340: dup
    //   2341: bipush #60
    //   2343: ldc 65540
    //   2345: iastore
    //   2346: dup
    //   2347: bipush #61
    //   2349: ldc 66560
    //   2351: iastore
    //   2352: dup
    //   2353: bipush #62
    //   2355: iconst_0
    //   2356: iastore
    //   2357: dup
    //   2358: bipush #63
    //   2360: ldc 16842756
    //   2362: iastore
    //   2363: astore #9
    //   2365: bipush #64
    //   2367: newarray int
    //   2369: dup
    //   2370: iconst_0
    //   2371: ldc -2146402272
    //   2373: iastore
    //   2374: dup
    //   2375: iconst_1
    //   2376: ldc -2147450880
    //   2378: iastore
    //   2379: dup
    //   2380: iconst_2
    //   2381: ldc 32768
    //   2383: iastore
    //   2384: dup
    //   2385: iconst_3
    //   2386: ldc 1081376
    //   2388: iastore
    //   2389: dup
    //   2390: iconst_4
    //   2391: ldc 1048576
    //   2393: iastore
    //   2394: dup
    //   2395: iconst_5
    //   2396: bipush #32
    //   2398: iastore
    //   2399: dup
    //   2400: bipush #6
    //   2402: ldc -2146435040
    //   2404: iastore
    //   2405: dup
    //   2406: bipush #7
    //   2408: ldc -2147450848
    //   2410: iastore
    //   2411: dup
    //   2412: bipush #8
    //   2414: ldc -2147483616
    //   2416: iastore
    //   2417: dup
    //   2418: bipush #9
    //   2420: ldc -2146402272
    //   2422: iastore
    //   2423: dup
    //   2424: bipush #10
    //   2426: ldc -2146402304
    //   2428: iastore
    //   2429: dup
    //   2430: bipush #11
    //   2432: ldc -2147483648
    //   2434: iastore
    //   2435: dup
    //   2436: bipush #12
    //   2438: ldc -2147450880
    //   2440: iastore
    //   2441: dup
    //   2442: bipush #13
    //   2444: ldc 1048576
    //   2446: iastore
    //   2447: dup
    //   2448: bipush #14
    //   2450: bipush #32
    //   2452: iastore
    //   2453: dup
    //   2454: bipush #15
    //   2456: ldc -2146435040
    //   2458: iastore
    //   2459: dup
    //   2460: bipush #16
    //   2462: ldc 1081344
    //   2464: iastore
    //   2465: dup
    //   2466: bipush #17
    //   2468: ldc 1048608
    //   2470: iastore
    //   2471: dup
    //   2472: bipush #18
    //   2474: ldc -2147450848
    //   2476: iastore
    //   2477: dup
    //   2478: bipush #19
    //   2480: iconst_0
    //   2481: iastore
    //   2482: dup
    //   2483: bipush #20
    //   2485: ldc -2147483648
    //   2487: iastore
    //   2488: dup
    //   2489: bipush #21
    //   2491: ldc 32768
    //   2493: iastore
    //   2494: dup
    //   2495: bipush #22
    //   2497: ldc 1081376
    //   2499: iastore
    //   2500: dup
    //   2501: bipush #23
    //   2503: ldc -2146435072
    //   2505: iastore
    //   2506: dup
    //   2507: bipush #24
    //   2509: ldc 1048608
    //   2511: iastore
    //   2512: dup
    //   2513: bipush #25
    //   2515: ldc -2147483616
    //   2517: iastore
    //   2518: dup
    //   2519: bipush #26
    //   2521: iconst_0
    //   2522: iastore
    //   2523: dup
    //   2524: bipush #27
    //   2526: ldc 1081344
    //   2528: iastore
    //   2529: dup
    //   2530: bipush #28
    //   2532: ldc 32800
    //   2534: iastore
    //   2535: dup
    //   2536: bipush #29
    //   2538: ldc -2146402304
    //   2540: iastore
    //   2541: dup
    //   2542: bipush #30
    //   2544: ldc -2146435072
    //   2546: iastore
    //   2547: dup
    //   2548: bipush #31
    //   2550: ldc 32800
    //   2552: iastore
    //   2553: dup
    //   2554: bipush #32
    //   2556: iconst_0
    //   2557: iastore
    //   2558: dup
    //   2559: bipush #33
    //   2561: ldc 1081376
    //   2563: iastore
    //   2564: dup
    //   2565: bipush #34
    //   2567: ldc -2146435040
    //   2569: iastore
    //   2570: dup
    //   2571: bipush #35
    //   2573: ldc 1048576
    //   2575: iastore
    //   2576: dup
    //   2577: bipush #36
    //   2579: ldc -2147450848
    //   2581: iastore
    //   2582: dup
    //   2583: bipush #37
    //   2585: ldc -2146435072
    //   2587: iastore
    //   2588: dup
    //   2589: bipush #38
    //   2591: ldc -2146402304
    //   2593: iastore
    //   2594: dup
    //   2595: bipush #39
    //   2597: ldc 32768
    //   2599: iastore
    //   2600: dup
    //   2601: bipush #40
    //   2603: ldc -2146435072
    //   2605: iastore
    //   2606: dup
    //   2607: bipush #41
    //   2609: ldc -2147450880
    //   2611: iastore
    //   2612: dup
    //   2613: bipush #42
    //   2615: bipush #32
    //   2617: iastore
    //   2618: dup
    //   2619: bipush #43
    //   2621: ldc -2146402272
    //   2623: iastore
    //   2624: dup
    //   2625: bipush #44
    //   2627: ldc 1081376
    //   2629: iastore
    //   2630: dup
    //   2631: bipush #45
    //   2633: bipush #32
    //   2635: iastore
    //   2636: dup
    //   2637: bipush #46
    //   2639: ldc 32768
    //   2641: iastore
    //   2642: dup
    //   2643: bipush #47
    //   2645: ldc -2147483648
    //   2647: iastore
    //   2648: dup
    //   2649: bipush #48
    //   2651: ldc 32800
    //   2653: iastore
    //   2654: dup
    //   2655: bipush #49
    //   2657: ldc -2146402304
    //   2659: iastore
    //   2660: dup
    //   2661: bipush #50
    //   2663: ldc 1048576
    //   2665: iastore
    //   2666: dup
    //   2667: bipush #51
    //   2669: ldc -2147483616
    //   2671: iastore
    //   2672: dup
    //   2673: bipush #52
    //   2675: ldc 1048608
    //   2677: iastore
    //   2678: dup
    //   2679: bipush #53
    //   2681: ldc -2147450848
    //   2683: iastore
    //   2684: dup
    //   2685: bipush #54
    //   2687: ldc -2147483616
    //   2689: iastore
    //   2690: dup
    //   2691: bipush #55
    //   2693: ldc 1048608
    //   2695: iastore
    //   2696: dup
    //   2697: bipush #56
    //   2699: ldc 1081344
    //   2701: iastore
    //   2702: dup
    //   2703: bipush #57
    //   2705: iconst_0
    //   2706: iastore
    //   2707: dup
    //   2708: bipush #58
    //   2710: ldc -2147450880
    //   2712: iastore
    //   2713: dup
    //   2714: bipush #59
    //   2716: ldc 32800
    //   2718: iastore
    //   2719: dup
    //   2720: bipush #60
    //   2722: ldc -2147483648
    //   2724: iastore
    //   2725: dup
    //   2726: bipush #61
    //   2728: ldc -2146435040
    //   2730: iastore
    //   2731: dup
    //   2732: bipush #62
    //   2734: ldc -2146402272
    //   2736: iastore
    //   2737: dup
    //   2738: bipush #63
    //   2740: ldc 1081344
    //   2742: iastore
    //   2743: astore #10
    //   2745: bipush #64
    //   2747: newarray int
    //   2749: dup
    //   2750: iconst_0
    //   2751: sipush #520
    //   2754: iastore
    //   2755: dup
    //   2756: iconst_1
    //   2757: ldc 134349312
    //   2759: iastore
    //   2760: dup
    //   2761: iconst_2
    //   2762: iconst_0
    //   2763: iastore
    //   2764: dup
    //   2765: iconst_3
    //   2766: ldc 134348808
    //   2768: iastore
    //   2769: dup
    //   2770: iconst_4
    //   2771: ldc 134218240
    //   2773: iastore
    //   2774: dup
    //   2775: iconst_5
    //   2776: iconst_0
    //   2777: iastore
    //   2778: dup
    //   2779: bipush #6
    //   2781: ldc 131592
    //   2783: iastore
    //   2784: dup
    //   2785: bipush #7
    //   2787: ldc 134218240
    //   2789: iastore
    //   2790: dup
    //   2791: bipush #8
    //   2793: ldc 131080
    //   2795: iastore
    //   2796: dup
    //   2797: bipush #9
    //   2799: ldc 134217736
    //   2801: iastore
    //   2802: dup
    //   2803: bipush #10
    //   2805: ldc 134217736
    //   2807: iastore
    //   2808: dup
    //   2809: bipush #11
    //   2811: ldc 131072
    //   2813: iastore
    //   2814: dup
    //   2815: bipush #12
    //   2817: ldc 134349320
    //   2819: iastore
    //   2820: dup
    //   2821: bipush #13
    //   2823: ldc 131080
    //   2825: iastore
    //   2826: dup
    //   2827: bipush #14
    //   2829: ldc 134348800
    //   2831: iastore
    //   2832: dup
    //   2833: bipush #15
    //   2835: sipush #520
    //   2838: iastore
    //   2839: dup
    //   2840: bipush #16
    //   2842: ldc 134217728
    //   2844: iastore
    //   2845: dup
    //   2846: bipush #17
    //   2848: bipush #8
    //   2850: iastore
    //   2851: dup
    //   2852: bipush #18
    //   2854: ldc 134349312
    //   2856: iastore
    //   2857: dup
    //   2858: bipush #19
    //   2860: sipush #512
    //   2863: iastore
    //   2864: dup
    //   2865: bipush #20
    //   2867: ldc 131584
    //   2869: iastore
    //   2870: dup
    //   2871: bipush #21
    //   2873: ldc 134348800
    //   2875: iastore
    //   2876: dup
    //   2877: bipush #22
    //   2879: ldc 134348808
    //   2881: iastore
    //   2882: dup
    //   2883: bipush #23
    //   2885: ldc 131592
    //   2887: iastore
    //   2888: dup
    //   2889: bipush #24
    //   2891: ldc 134218248
    //   2893: iastore
    //   2894: dup
    //   2895: bipush #25
    //   2897: ldc 131584
    //   2899: iastore
    //   2900: dup
    //   2901: bipush #26
    //   2903: ldc 131072
    //   2905: iastore
    //   2906: dup
    //   2907: bipush #27
    //   2909: ldc 134218248
    //   2911: iastore
    //   2912: dup
    //   2913: bipush #28
    //   2915: bipush #8
    //   2917: iastore
    //   2918: dup
    //   2919: bipush #29
    //   2921: ldc 134349320
    //   2923: iastore
    //   2924: dup
    //   2925: bipush #30
    //   2927: sipush #512
    //   2930: iastore
    //   2931: dup
    //   2932: bipush #31
    //   2934: ldc 134217728
    //   2936: iastore
    //   2937: dup
    //   2938: bipush #32
    //   2940: ldc 134349312
    //   2942: iastore
    //   2943: dup
    //   2944: bipush #33
    //   2946: ldc 134217728
    //   2948: iastore
    //   2949: dup
    //   2950: bipush #34
    //   2952: ldc 131080
    //   2954: iastore
    //   2955: dup
    //   2956: bipush #35
    //   2958: sipush #520
    //   2961: iastore
    //   2962: dup
    //   2963: bipush #36
    //   2965: ldc 131072
    //   2967: iastore
    //   2968: dup
    //   2969: bipush #37
    //   2971: ldc 134349312
    //   2973: iastore
    //   2974: dup
    //   2975: bipush #38
    //   2977: ldc 134218240
    //   2979: iastore
    //   2980: dup
    //   2981: bipush #39
    //   2983: iconst_0
    //   2984: iastore
    //   2985: dup
    //   2986: bipush #40
    //   2988: sipush #512
    //   2991: iastore
    //   2992: dup
    //   2993: bipush #41
    //   2995: ldc 131080
    //   2997: iastore
    //   2998: dup
    //   2999: bipush #42
    //   3001: ldc 134349320
    //   3003: iastore
    //   3004: dup
    //   3005: bipush #43
    //   3007: ldc 134218240
    //   3009: iastore
    //   3010: dup
    //   3011: bipush #44
    //   3013: ldc 134217736
    //   3015: iastore
    //   3016: dup
    //   3017: bipush #45
    //   3019: sipush #512
    //   3022: iastore
    //   3023: dup
    //   3024: bipush #46
    //   3026: iconst_0
    //   3027: iastore
    //   3028: dup
    //   3029: bipush #47
    //   3031: ldc 134348808
    //   3033: iastore
    //   3034: dup
    //   3035: bipush #48
    //   3037: ldc 134218248
    //   3039: iastore
    //   3040: dup
    //   3041: bipush #49
    //   3043: ldc 131072
    //   3045: iastore
    //   3046: dup
    //   3047: bipush #50
    //   3049: ldc 134217728
    //   3051: iastore
    //   3052: dup
    //   3053: bipush #51
    //   3055: ldc 134349320
    //   3057: iastore
    //   3058: dup
    //   3059: bipush #52
    //   3061: bipush #8
    //   3063: iastore
    //   3064: dup
    //   3065: bipush #53
    //   3067: ldc 131592
    //   3069: iastore
    //   3070: dup
    //   3071: bipush #54
    //   3073: ldc 131584
    //   3075: iastore
    //   3076: dup
    //   3077: bipush #55
    //   3079: ldc 134217736
    //   3081: iastore
    //   3082: dup
    //   3083: bipush #56
    //   3085: ldc 134348800
    //   3087: iastore
    //   3088: dup
    //   3089: bipush #57
    //   3091: ldc 134218248
    //   3093: iastore
    //   3094: dup
    //   3095: bipush #58
    //   3097: sipush #520
    //   3100: iastore
    //   3101: dup
    //   3102: bipush #59
    //   3104: ldc 134348800
    //   3106: iastore
    //   3107: dup
    //   3108: bipush #60
    //   3110: ldc 131592
    //   3112: iastore
    //   3113: dup
    //   3114: bipush #61
    //   3116: bipush #8
    //   3118: iastore
    //   3119: dup
    //   3120: bipush #62
    //   3122: ldc 134348808
    //   3124: iastore
    //   3125: dup
    //   3126: bipush #63
    //   3128: ldc 131584
    //   3130: iastore
    //   3131: astore #11
    //   3133: bipush #64
    //   3135: newarray int
    //   3137: dup
    //   3138: iconst_0
    //   3139: ldc 8396801
    //   3141: iastore
    //   3142: dup
    //   3143: iconst_1
    //   3144: sipush #8321
    //   3147: iastore
    //   3148: dup
    //   3149: iconst_2
    //   3150: sipush #8321
    //   3153: iastore
    //   3154: dup
    //   3155: iconst_3
    //   3156: sipush #128
    //   3159: iastore
    //   3160: dup
    //   3161: iconst_4
    //   3162: ldc 8396928
    //   3164: iastore
    //   3165: dup
    //   3166: iconst_5
    //   3167: ldc 8388737
    //   3169: iastore
    //   3170: dup
    //   3171: bipush #6
    //   3173: ldc 8388609
    //   3175: iastore
    //   3176: dup
    //   3177: bipush #7
    //   3179: sipush #8193
    //   3182: iastore
    //   3183: dup
    //   3184: bipush #8
    //   3186: iconst_0
    //   3187: iastore
    //   3188: dup
    //   3189: bipush #9
    //   3191: ldc 8396800
    //   3193: iastore
    //   3194: dup
    //   3195: bipush #10
    //   3197: ldc 8396800
    //   3199: iastore
    //   3200: dup
    //   3201: bipush #11
    //   3203: ldc 8396929
    //   3205: iastore
    //   3206: dup
    //   3207: bipush #12
    //   3209: sipush #129
    //   3212: iastore
    //   3213: dup
    //   3214: bipush #13
    //   3216: iconst_0
    //   3217: iastore
    //   3218: dup
    //   3219: bipush #14
    //   3221: ldc 8388736
    //   3223: iastore
    //   3224: dup
    //   3225: bipush #15
    //   3227: ldc 8388609
    //   3229: iastore
    //   3230: dup
    //   3231: bipush #16
    //   3233: iconst_1
    //   3234: iastore
    //   3235: dup
    //   3236: bipush #17
    //   3238: sipush #8192
    //   3241: iastore
    //   3242: dup
    //   3243: bipush #18
    //   3245: ldc 8388608
    //   3247: iastore
    //   3248: dup
    //   3249: bipush #19
    //   3251: ldc 8396801
    //   3253: iastore
    //   3254: dup
    //   3255: bipush #20
    //   3257: sipush #128
    //   3260: iastore
    //   3261: dup
    //   3262: bipush #21
    //   3264: ldc 8388608
    //   3266: iastore
    //   3267: dup
    //   3268: bipush #22
    //   3270: sipush #8193
    //   3273: iastore
    //   3274: dup
    //   3275: bipush #23
    //   3277: sipush #8320
    //   3280: iastore
    //   3281: dup
    //   3282: bipush #24
    //   3284: ldc 8388737
    //   3286: iastore
    //   3287: dup
    //   3288: bipush #25
    //   3290: iconst_1
    //   3291: iastore
    //   3292: dup
    //   3293: bipush #26
    //   3295: sipush #8320
    //   3298: iastore
    //   3299: dup
    //   3300: bipush #27
    //   3302: ldc 8388736
    //   3304: iastore
    //   3305: dup
    //   3306: bipush #28
    //   3308: sipush #8192
    //   3311: iastore
    //   3312: dup
    //   3313: bipush #29
    //   3315: ldc 8396928
    //   3317: iastore
    //   3318: dup
    //   3319: bipush #30
    //   3321: ldc 8396929
    //   3323: iastore
    //   3324: dup
    //   3325: bipush #31
    //   3327: sipush #129
    //   3330: iastore
    //   3331: dup
    //   3332: bipush #32
    //   3334: ldc 8388736
    //   3336: iastore
    //   3337: dup
    //   3338: bipush #33
    //   3340: ldc 8388609
    //   3342: iastore
    //   3343: dup
    //   3344: bipush #34
    //   3346: ldc 8396800
    //   3348: iastore
    //   3349: dup
    //   3350: bipush #35
    //   3352: ldc 8396929
    //   3354: iastore
    //   3355: dup
    //   3356: bipush #36
    //   3358: sipush #129
    //   3361: iastore
    //   3362: dup
    //   3363: bipush #37
    //   3365: iconst_0
    //   3366: iastore
    //   3367: dup
    //   3368: bipush #38
    //   3370: iconst_0
    //   3371: iastore
    //   3372: dup
    //   3373: bipush #39
    //   3375: ldc 8396800
    //   3377: iastore
    //   3378: dup
    //   3379: bipush #40
    //   3381: sipush #8320
    //   3384: iastore
    //   3385: dup
    //   3386: bipush #41
    //   3388: ldc 8388736
    //   3390: iastore
    //   3391: dup
    //   3392: bipush #42
    //   3394: ldc 8388737
    //   3396: iastore
    //   3397: dup
    //   3398: bipush #43
    //   3400: iconst_1
    //   3401: iastore
    //   3402: dup
    //   3403: bipush #44
    //   3405: ldc 8396801
    //   3407: iastore
    //   3408: dup
    //   3409: bipush #45
    //   3411: sipush #8321
    //   3414: iastore
    //   3415: dup
    //   3416: bipush #46
    //   3418: sipush #8321
    //   3421: iastore
    //   3422: dup
    //   3423: bipush #47
    //   3425: sipush #128
    //   3428: iastore
    //   3429: dup
    //   3430: bipush #48
    //   3432: ldc 8396929
    //   3434: iastore
    //   3435: dup
    //   3436: bipush #49
    //   3438: sipush #129
    //   3441: iastore
    //   3442: dup
    //   3443: bipush #50
    //   3445: iconst_1
    //   3446: iastore
    //   3447: dup
    //   3448: bipush #51
    //   3450: sipush #8192
    //   3453: iastore
    //   3454: dup
    //   3455: bipush #52
    //   3457: ldc 8388609
    //   3459: iastore
    //   3460: dup
    //   3461: bipush #53
    //   3463: sipush #8193
    //   3466: iastore
    //   3467: dup
    //   3468: bipush #54
    //   3470: ldc 8396928
    //   3472: iastore
    //   3473: dup
    //   3474: bipush #55
    //   3476: ldc 8388737
    //   3478: iastore
    //   3479: dup
    //   3480: bipush #56
    //   3482: sipush #8193
    //   3485: iastore
    //   3486: dup
    //   3487: bipush #57
    //   3489: sipush #8320
    //   3492: iastore
    //   3493: dup
    //   3494: bipush #58
    //   3496: ldc 8388608
    //   3498: iastore
    //   3499: dup
    //   3500: bipush #59
    //   3502: ldc 8396801
    //   3504: iastore
    //   3505: dup
    //   3506: bipush #60
    //   3508: sipush #128
    //   3511: iastore
    //   3512: dup
    //   3513: bipush #61
    //   3515: ldc 8388608
    //   3517: iastore
    //   3518: dup
    //   3519: bipush #62
    //   3521: sipush #8192
    //   3524: iastore
    //   3525: dup
    //   3526: bipush #63
    //   3528: ldc 8396928
    //   3530: iastore
    //   3531: astore #12
    //   3533: bipush #64
    //   3535: newarray int
    //   3537: dup
    //   3538: iconst_0
    //   3539: sipush #256
    //   3542: iastore
    //   3543: dup
    //   3544: iconst_1
    //   3545: ldc 34078976
    //   3547: iastore
    //   3548: dup
    //   3549: iconst_2
    //   3550: ldc 34078720
    //   3552: iastore
    //   3553: dup
    //   3554: iconst_3
    //   3555: ldc 1107296512
    //   3557: iastore
    //   3558: dup
    //   3559: iconst_4
    //   3560: ldc 524288
    //   3562: iastore
    //   3563: dup
    //   3564: iconst_5
    //   3565: sipush #256
    //   3568: iastore
    //   3569: dup
    //   3570: bipush #6
    //   3572: ldc 1073741824
    //   3574: iastore
    //   3575: dup
    //   3576: bipush #7
    //   3578: ldc 34078720
    //   3580: iastore
    //   3581: dup
    //   3582: bipush #8
    //   3584: ldc 1074266368
    //   3586: iastore
    //   3587: dup
    //   3588: bipush #9
    //   3590: ldc 524288
    //   3592: iastore
    //   3593: dup
    //   3594: bipush #10
    //   3596: ldc 33554688
    //   3598: iastore
    //   3599: dup
    //   3600: bipush #11
    //   3602: ldc 1074266368
    //   3604: iastore
    //   3605: dup
    //   3606: bipush #12
    //   3608: ldc 1107296512
    //   3610: iastore
    //   3611: dup
    //   3612: bipush #13
    //   3614: ldc 1107820544
    //   3616: iastore
    //   3617: dup
    //   3618: bipush #14
    //   3620: ldc 524544
    //   3622: iastore
    //   3623: dup
    //   3624: bipush #15
    //   3626: ldc 1073741824
    //   3628: iastore
    //   3629: dup
    //   3630: bipush #16
    //   3632: ldc 33554432
    //   3634: iastore
    //   3635: dup
    //   3636: bipush #17
    //   3638: ldc 1074266112
    //   3640: iastore
    //   3641: dup
    //   3642: bipush #18
    //   3644: ldc 1074266112
    //   3646: iastore
    //   3647: dup
    //   3648: bipush #19
    //   3650: iconst_0
    //   3651: iastore
    //   3652: dup
    //   3653: bipush #20
    //   3655: ldc 1073742080
    //   3657: iastore
    //   3658: dup
    //   3659: bipush #21
    //   3661: ldc 1107820800
    //   3663: iastore
    //   3664: dup
    //   3665: bipush #22
    //   3667: ldc 1107820800
    //   3669: iastore
    //   3670: dup
    //   3671: bipush #23
    //   3673: ldc 33554688
    //   3675: iastore
    //   3676: dup
    //   3677: bipush #24
    //   3679: ldc 1107820544
    //   3681: iastore
    //   3682: dup
    //   3683: bipush #25
    //   3685: ldc 1073742080
    //   3687: iastore
    //   3688: dup
    //   3689: bipush #26
    //   3691: iconst_0
    //   3692: iastore
    //   3693: dup
    //   3694: bipush #27
    //   3696: ldc 1107296256
    //   3698: iastore
    //   3699: dup
    //   3700: bipush #28
    //   3702: ldc 34078976
    //   3704: iastore
    //   3705: dup
    //   3706: bipush #29
    //   3708: ldc 33554432
    //   3710: iastore
    //   3711: dup
    //   3712: bipush #30
    //   3714: ldc 1107296256
    //   3716: iastore
    //   3717: dup
    //   3718: bipush #31
    //   3720: ldc 524544
    //   3722: iastore
    //   3723: dup
    //   3724: bipush #32
    //   3726: ldc 524288
    //   3728: iastore
    //   3729: dup
    //   3730: bipush #33
    //   3732: ldc 1107296512
    //   3734: iastore
    //   3735: dup
    //   3736: bipush #34
    //   3738: sipush #256
    //   3741: iastore
    //   3742: dup
    //   3743: bipush #35
    //   3745: ldc 33554432
    //   3747: iastore
    //   3748: dup
    //   3749: bipush #36
    //   3751: ldc 1073741824
    //   3753: iastore
    //   3754: dup
    //   3755: bipush #37
    //   3757: ldc 34078720
    //   3759: iastore
    //   3760: dup
    //   3761: bipush #38
    //   3763: ldc 1107296512
    //   3765: iastore
    //   3766: dup
    //   3767: bipush #39
    //   3769: ldc 1074266368
    //   3771: iastore
    //   3772: dup
    //   3773: bipush #40
    //   3775: ldc 33554688
    //   3777: iastore
    //   3778: dup
    //   3779: bipush #41
    //   3781: ldc 1073741824
    //   3783: iastore
    //   3784: dup
    //   3785: bipush #42
    //   3787: ldc 1107820544
    //   3789: iastore
    //   3790: dup
    //   3791: bipush #43
    //   3793: ldc 34078976
    //   3795: iastore
    //   3796: dup
    //   3797: bipush #44
    //   3799: ldc 1074266368
    //   3801: iastore
    //   3802: dup
    //   3803: bipush #45
    //   3805: sipush #256
    //   3808: iastore
    //   3809: dup
    //   3810: bipush #46
    //   3812: ldc 33554432
    //   3814: iastore
    //   3815: dup
    //   3816: bipush #47
    //   3818: ldc 1107820544
    //   3820: iastore
    //   3821: dup
    //   3822: bipush #48
    //   3824: ldc 1107820800
    //   3826: iastore
    //   3827: dup
    //   3828: bipush #49
    //   3830: ldc 524544
    //   3832: iastore
    //   3833: dup
    //   3834: bipush #50
    //   3836: ldc 1107296256
    //   3838: iastore
    //   3839: dup
    //   3840: bipush #51
    //   3842: ldc 1107820800
    //   3844: iastore
    //   3845: dup
    //   3846: bipush #52
    //   3848: ldc 34078720
    //   3850: iastore
    //   3851: dup
    //   3852: bipush #53
    //   3854: iconst_0
    //   3855: iastore
    //   3856: dup
    //   3857: bipush #54
    //   3859: ldc 1074266112
    //   3861: iastore
    //   3862: dup
    //   3863: bipush #55
    //   3865: ldc 1107296256
    //   3867: iastore
    //   3868: dup
    //   3869: bipush #56
    //   3871: ldc 524544
    //   3873: iastore
    //   3874: dup
    //   3875: bipush #57
    //   3877: ldc 33554688
    //   3879: iastore
    //   3880: dup
    //   3881: bipush #58
    //   3883: ldc 1073742080
    //   3885: iastore
    //   3886: dup
    //   3887: bipush #59
    //   3889: ldc 524288
    //   3891: iastore
    //   3892: dup
    //   3893: bipush #60
    //   3895: iconst_0
    //   3896: iastore
    //   3897: dup
    //   3898: bipush #61
    //   3900: ldc 1074266112
    //   3902: iastore
    //   3903: dup
    //   3904: bipush #62
    //   3906: ldc 34078976
    //   3908: iastore
    //   3909: dup
    //   3910: bipush #63
    //   3912: ldc 1073742080
    //   3914: iastore
    //   3915: astore #13
    //   3917: bipush #64
    //   3919: newarray int
    //   3921: dup
    //   3922: iconst_0
    //   3923: ldc 536870928
    //   3925: iastore
    //   3926: dup
    //   3927: iconst_1
    //   3928: ldc 541065216
    //   3930: iastore
    //   3931: dup
    //   3932: iconst_2
    //   3933: sipush #16384
    //   3936: iastore
    //   3937: dup
    //   3938: iconst_3
    //   3939: ldc 541081616
    //   3941: iastore
    //   3942: dup
    //   3943: iconst_4
    //   3944: ldc 541065216
    //   3946: iastore
    //   3947: dup
    //   3948: iconst_5
    //   3949: bipush #16
    //   3951: iastore
    //   3952: dup
    //   3953: bipush #6
    //   3955: ldc 541081616
    //   3957: iastore
    //   3958: dup
    //   3959: bipush #7
    //   3961: ldc 4194304
    //   3963: iastore
    //   3964: dup
    //   3965: bipush #8
    //   3967: ldc 536887296
    //   3969: iastore
    //   3970: dup
    //   3971: bipush #9
    //   3973: ldc 4210704
    //   3975: iastore
    //   3976: dup
    //   3977: bipush #10
    //   3979: ldc 4194304
    //   3981: iastore
    //   3982: dup
    //   3983: bipush #11
    //   3985: ldc 536870928
    //   3987: iastore
    //   3988: dup
    //   3989: bipush #12
    //   3991: ldc 4194320
    //   3993: iastore
    //   3994: dup
    //   3995: bipush #13
    //   3997: ldc 536887296
    //   3999: iastore
    //   4000: dup
    //   4001: bipush #14
    //   4003: ldc 536870912
    //   4005: iastore
    //   4006: dup
    //   4007: bipush #15
    //   4009: sipush #16400
    //   4012: iastore
    //   4013: dup
    //   4014: bipush #16
    //   4016: iconst_0
    //   4017: iastore
    //   4018: dup
    //   4019: bipush #17
    //   4021: ldc 4194320
    //   4023: iastore
    //   4024: dup
    //   4025: bipush #18
    //   4027: ldc 536887312
    //   4029: iastore
    //   4030: dup
    //   4031: bipush #19
    //   4033: sipush #16384
    //   4036: iastore
    //   4037: dup
    //   4038: bipush #20
    //   4040: ldc 4210688
    //   4042: iastore
    //   4043: dup
    //   4044: bipush #21
    //   4046: ldc 536887312
    //   4048: iastore
    //   4049: dup
    //   4050: bipush #22
    //   4052: bipush #16
    //   4054: iastore
    //   4055: dup
    //   4056: bipush #23
    //   4058: ldc 541065232
    //   4060: iastore
    //   4061: dup
    //   4062: bipush #24
    //   4064: ldc 541065232
    //   4066: iastore
    //   4067: dup
    //   4068: bipush #25
    //   4070: iconst_0
    //   4071: iastore
    //   4072: dup
    //   4073: bipush #26
    //   4075: ldc 4210704
    //   4077: iastore
    //   4078: dup
    //   4079: bipush #27
    //   4081: ldc 541081600
    //   4083: iastore
    //   4084: dup
    //   4085: bipush #28
    //   4087: sipush #16400
    //   4090: iastore
    //   4091: dup
    //   4092: bipush #29
    //   4094: ldc 4210688
    //   4096: iastore
    //   4097: dup
    //   4098: bipush #30
    //   4100: ldc 541081600
    //   4102: iastore
    //   4103: dup
    //   4104: bipush #31
    //   4106: ldc 536870912
    //   4108: iastore
    //   4109: dup
    //   4110: bipush #32
    //   4112: ldc 536887296
    //   4114: iastore
    //   4115: dup
    //   4116: bipush #33
    //   4118: bipush #16
    //   4120: iastore
    //   4121: dup
    //   4122: bipush #34
    //   4124: ldc 541065232
    //   4126: iastore
    //   4127: dup
    //   4128: bipush #35
    //   4130: ldc 4210688
    //   4132: iastore
    //   4133: dup
    //   4134: bipush #36
    //   4136: ldc 541081616
    //   4138: iastore
    //   4139: dup
    //   4140: bipush #37
    //   4142: ldc 4194304
    //   4144: iastore
    //   4145: dup
    //   4146: bipush #38
    //   4148: sipush #16400
    //   4151: iastore
    //   4152: dup
    //   4153: bipush #39
    //   4155: ldc 536870928
    //   4157: iastore
    //   4158: dup
    //   4159: bipush #40
    //   4161: ldc 4194304
    //   4163: iastore
    //   4164: dup
    //   4165: bipush #41
    //   4167: ldc 536887296
    //   4169: iastore
    //   4170: dup
    //   4171: bipush #42
    //   4173: ldc 536870912
    //   4175: iastore
    //   4176: dup
    //   4177: bipush #43
    //   4179: sipush #16400
    //   4182: iastore
    //   4183: dup
    //   4184: bipush #44
    //   4186: ldc 536870928
    //   4188: iastore
    //   4189: dup
    //   4190: bipush #45
    //   4192: ldc 541081616
    //   4194: iastore
    //   4195: dup
    //   4196: bipush #46
    //   4198: ldc 4210688
    //   4200: iastore
    //   4201: dup
    //   4202: bipush #47
    //   4204: ldc 541065216
    //   4206: iastore
    //   4207: dup
    //   4208: bipush #48
    //   4210: ldc 4210704
    //   4212: iastore
    //   4213: dup
    //   4214: bipush #49
    //   4216: ldc 541081600
    //   4218: iastore
    //   4219: dup
    //   4220: bipush #50
    //   4222: iconst_0
    //   4223: iastore
    //   4224: dup
    //   4225: bipush #51
    //   4227: ldc 541065232
    //   4229: iastore
    //   4230: dup
    //   4231: bipush #52
    //   4233: bipush #16
    //   4235: iastore
    //   4236: dup
    //   4237: bipush #53
    //   4239: sipush #16384
    //   4242: iastore
    //   4243: dup
    //   4244: bipush #54
    //   4246: ldc 541065216
    //   4248: iastore
    //   4249: dup
    //   4250: bipush #55
    //   4252: ldc 4210704
    //   4254: iastore
    //   4255: dup
    //   4256: bipush #56
    //   4258: sipush #16384
    //   4261: iastore
    //   4262: dup
    //   4263: bipush #57
    //   4265: ldc 4194320
    //   4267: iastore
    //   4268: dup
    //   4269: bipush #58
    //   4271: ldc 536887312
    //   4273: iastore
    //   4274: dup
    //   4275: bipush #59
    //   4277: iconst_0
    //   4278: iastore
    //   4279: dup
    //   4280: bipush #60
    //   4282: ldc 541081600
    //   4284: iastore
    //   4285: dup
    //   4286: bipush #61
    //   4288: ldc 536870912
    //   4290: iastore
    //   4291: dup
    //   4292: bipush #62
    //   4294: ldc 4194320
    //   4296: iastore
    //   4297: dup
    //   4298: bipush #63
    //   4300: ldc 536887312
    //   4302: iastore
    //   4303: astore #14
    //   4305: bipush #64
    //   4307: newarray int
    //   4309: dup
    //   4310: iconst_0
    //   4311: ldc 2097152
    //   4313: iastore
    //   4314: dup
    //   4315: iconst_1
    //   4316: ldc 69206018
    //   4318: iastore
    //   4319: dup
    //   4320: iconst_2
    //   4321: ldc 67110914
    //   4323: iastore
    //   4324: dup
    //   4325: iconst_3
    //   4326: iconst_0
    //   4327: iastore
    //   4328: dup
    //   4329: iconst_4
    //   4330: sipush #2048
    //   4333: iastore
    //   4334: dup
    //   4335: iconst_5
    //   4336: ldc 67110914
    //   4338: iastore
    //   4339: dup
    //   4340: bipush #6
    //   4342: ldc 2099202
    //   4344: iastore
    //   4345: dup
    //   4346: bipush #7
    //   4348: ldc 69208064
    //   4350: iastore
    //   4351: dup
    //   4352: bipush #8
    //   4354: ldc 69208066
    //   4356: iastore
    //   4357: dup
    //   4358: bipush #9
    //   4360: ldc 2097152
    //   4362: iastore
    //   4363: dup
    //   4364: bipush #10
    //   4366: iconst_0
    //   4367: iastore
    //   4368: dup
    //   4369: bipush #11
    //   4371: ldc 67108866
    //   4373: iastore
    //   4374: dup
    //   4375: bipush #12
    //   4377: iconst_2
    //   4378: iastore
    //   4379: dup
    //   4380: bipush #13
    //   4382: ldc 67108864
    //   4384: iastore
    //   4385: dup
    //   4386: bipush #14
    //   4388: ldc 69206018
    //   4390: iastore
    //   4391: dup
    //   4392: bipush #15
    //   4394: sipush #2050
    //   4397: iastore
    //   4398: dup
    //   4399: bipush #16
    //   4401: ldc 67110912
    //   4403: iastore
    //   4404: dup
    //   4405: bipush #17
    //   4407: ldc 2099202
    //   4409: iastore
    //   4410: dup
    //   4411: bipush #18
    //   4413: ldc 2097154
    //   4415: iastore
    //   4416: dup
    //   4417: bipush #19
    //   4419: ldc 67110912
    //   4421: iastore
    //   4422: dup
    //   4423: bipush #20
    //   4425: ldc 67108866
    //   4427: iastore
    //   4428: dup
    //   4429: bipush #21
    //   4431: ldc 69206016
    //   4433: iastore
    //   4434: dup
    //   4435: bipush #22
    //   4437: ldc 69208064
    //   4439: iastore
    //   4440: dup
    //   4441: bipush #23
    //   4443: ldc 2097154
    //   4445: iastore
    //   4446: dup
    //   4447: bipush #24
    //   4449: ldc 69206016
    //   4451: iastore
    //   4452: dup
    //   4453: bipush #25
    //   4455: sipush #2048
    //   4458: iastore
    //   4459: dup
    //   4460: bipush #26
    //   4462: sipush #2050
    //   4465: iastore
    //   4466: dup
    //   4467: bipush #27
    //   4469: ldc 69208066
    //   4471: iastore
    //   4472: dup
    //   4473: bipush #28
    //   4475: ldc 2099200
    //   4477: iastore
    //   4478: dup
    //   4479: bipush #29
    //   4481: iconst_2
    //   4482: iastore
    //   4483: dup
    //   4484: bipush #30
    //   4486: ldc 67108864
    //   4488: iastore
    //   4489: dup
    //   4490: bipush #31
    //   4492: ldc 2099200
    //   4494: iastore
    //   4495: dup
    //   4496: bipush #32
    //   4498: ldc 67108864
    //   4500: iastore
    //   4501: dup
    //   4502: bipush #33
    //   4504: ldc 2099200
    //   4506: iastore
    //   4507: dup
    //   4508: bipush #34
    //   4510: ldc 2097152
    //   4512: iastore
    //   4513: dup
    //   4514: bipush #35
    //   4516: ldc 67110914
    //   4518: iastore
    //   4519: dup
    //   4520: bipush #36
    //   4522: ldc 67110914
    //   4524: iastore
    //   4525: dup
    //   4526: bipush #37
    //   4528: ldc 69206018
    //   4530: iastore
    //   4531: dup
    //   4532: bipush #38
    //   4534: ldc 69206018
    //   4536: iastore
    //   4537: dup
    //   4538: bipush #39
    //   4540: iconst_2
    //   4541: iastore
    //   4542: dup
    //   4543: bipush #40
    //   4545: ldc 2097154
    //   4547: iastore
    //   4548: dup
    //   4549: bipush #41
    //   4551: ldc 67108864
    //   4553: iastore
    //   4554: dup
    //   4555: bipush #42
    //   4557: ldc 67110912
    //   4559: iastore
    //   4560: dup
    //   4561: bipush #43
    //   4563: ldc 2097152
    //   4565: iastore
    //   4566: dup
    //   4567: bipush #44
    //   4569: ldc 69208064
    //   4571: iastore
    //   4572: dup
    //   4573: bipush #45
    //   4575: sipush #2050
    //   4578: iastore
    //   4579: dup
    //   4580: bipush #46
    //   4582: ldc 2099202
    //   4584: iastore
    //   4585: dup
    //   4586: bipush #47
    //   4588: ldc 69208064
    //   4590: iastore
    //   4591: dup
    //   4592: bipush #48
    //   4594: sipush #2050
    //   4597: iastore
    //   4598: dup
    //   4599: bipush #49
    //   4601: ldc 67108866
    //   4603: iastore
    //   4604: dup
    //   4605: bipush #50
    //   4607: ldc 69208066
    //   4609: iastore
    //   4610: dup
    //   4611: bipush #51
    //   4613: ldc 69206016
    //   4615: iastore
    //   4616: dup
    //   4617: bipush #52
    //   4619: ldc 2099200
    //   4621: iastore
    //   4622: dup
    //   4623: bipush #53
    //   4625: iconst_0
    //   4626: iastore
    //   4627: dup
    //   4628: bipush #54
    //   4630: iconst_2
    //   4631: iastore
    //   4632: dup
    //   4633: bipush #55
    //   4635: ldc 69208066
    //   4637: iastore
    //   4638: dup
    //   4639: bipush #56
    //   4641: iconst_0
    //   4642: iastore
    //   4643: dup
    //   4644: bipush #57
    //   4646: ldc 2099202
    //   4648: iastore
    //   4649: dup
    //   4650: bipush #58
    //   4652: ldc 69206016
    //   4654: iastore
    //   4655: dup
    //   4656: bipush #59
    //   4658: sipush #2048
    //   4661: iastore
    //   4662: dup
    //   4663: bipush #60
    //   4665: ldc 67108866
    //   4667: iastore
    //   4668: dup
    //   4669: bipush #61
    //   4671: ldc 67110912
    //   4673: iastore
    //   4674: dup
    //   4675: bipush #62
    //   4677: sipush #2048
    //   4680: iastore
    //   4681: dup
    //   4682: bipush #63
    //   4684: ldc 2097154
    //   4686: iastore
    //   4687: astore #15
    //   4689: bipush #64
    //   4691: newarray int
    //   4693: dup
    //   4694: iconst_0
    //   4695: ldc 268439616
    //   4697: iastore
    //   4698: dup
    //   4699: iconst_1
    //   4700: sipush #4096
    //   4703: iastore
    //   4704: dup
    //   4705: iconst_2
    //   4706: ldc 262144
    //   4708: iastore
    //   4709: dup
    //   4710: iconst_3
    //   4711: ldc 268701760
    //   4713: iastore
    //   4714: dup
    //   4715: iconst_4
    //   4716: ldc 268435456
    //   4718: iastore
    //   4719: dup
    //   4720: iconst_5
    //   4721: ldc 268439616
    //   4723: iastore
    //   4724: dup
    //   4725: bipush #6
    //   4727: bipush #64
    //   4729: iastore
    //   4730: dup
    //   4731: bipush #7
    //   4733: ldc 268435456
    //   4735: iastore
    //   4736: dup
    //   4737: bipush #8
    //   4739: ldc 262208
    //   4741: iastore
    //   4742: dup
    //   4743: bipush #9
    //   4745: ldc 268697600
    //   4747: iastore
    //   4748: dup
    //   4749: bipush #10
    //   4751: ldc 268701760
    //   4753: iastore
    //   4754: dup
    //   4755: bipush #11
    //   4757: ldc 266240
    //   4759: iastore
    //   4760: dup
    //   4761: bipush #12
    //   4763: ldc 268701696
    //   4765: iastore
    //   4766: dup
    //   4767: bipush #13
    //   4769: ldc 266304
    //   4771: iastore
    //   4772: dup
    //   4773: bipush #14
    //   4775: sipush #4096
    //   4778: iastore
    //   4779: dup
    //   4780: bipush #15
    //   4782: bipush #64
    //   4784: iastore
    //   4785: dup
    //   4786: bipush #16
    //   4788: ldc 268697600
    //   4790: iastore
    //   4791: dup
    //   4792: bipush #17
    //   4794: ldc 268435520
    //   4796: iastore
    //   4797: dup
    //   4798: bipush #18
    //   4800: ldc 268439552
    //   4802: iastore
    //   4803: dup
    //   4804: bipush #19
    //   4806: sipush #4160
    //   4809: iastore
    //   4810: dup
    //   4811: bipush #20
    //   4813: ldc 266240
    //   4815: iastore
    //   4816: dup
    //   4817: bipush #21
    //   4819: ldc 262208
    //   4821: iastore
    //   4822: dup
    //   4823: bipush #22
    //   4825: ldc 268697664
    //   4827: iastore
    //   4828: dup
    //   4829: bipush #23
    //   4831: ldc 268701696
    //   4833: iastore
    //   4834: dup
    //   4835: bipush #24
    //   4837: sipush #4160
    //   4840: iastore
    //   4841: dup
    //   4842: bipush #25
    //   4844: iconst_0
    //   4845: iastore
    //   4846: dup
    //   4847: bipush #26
    //   4849: iconst_0
    //   4850: iastore
    //   4851: dup
    //   4852: bipush #27
    //   4854: ldc 268697664
    //   4856: iastore
    //   4857: dup
    //   4858: bipush #28
    //   4860: ldc 268435520
    //   4862: iastore
    //   4863: dup
    //   4864: bipush #29
    //   4866: ldc 268439552
    //   4868: iastore
    //   4869: dup
    //   4870: bipush #30
    //   4872: ldc 266304
    //   4874: iastore
    //   4875: dup
    //   4876: bipush #31
    //   4878: ldc 262144
    //   4880: iastore
    //   4881: dup
    //   4882: bipush #32
    //   4884: ldc 266304
    //   4886: iastore
    //   4887: dup
    //   4888: bipush #33
    //   4890: ldc 262144
    //   4892: iastore
    //   4893: dup
    //   4894: bipush #34
    //   4896: ldc 268701696
    //   4898: iastore
    //   4899: dup
    //   4900: bipush #35
    //   4902: sipush #4096
    //   4905: iastore
    //   4906: dup
    //   4907: bipush #36
    //   4909: bipush #64
    //   4911: iastore
    //   4912: dup
    //   4913: bipush #37
    //   4915: ldc 268697664
    //   4917: iastore
    //   4918: dup
    //   4919: bipush #38
    //   4921: sipush #4096
    //   4924: iastore
    //   4925: dup
    //   4926: bipush #39
    //   4928: ldc 266304
    //   4930: iastore
    //   4931: dup
    //   4932: bipush #40
    //   4934: ldc 268439552
    //   4936: iastore
    //   4937: dup
    //   4938: bipush #41
    //   4940: bipush #64
    //   4942: iastore
    //   4943: dup
    //   4944: bipush #42
    //   4946: ldc 268435520
    //   4948: iastore
    //   4949: dup
    //   4950: bipush #43
    //   4952: ldc 268697600
    //   4954: iastore
    //   4955: dup
    //   4956: bipush #44
    //   4958: ldc 268697664
    //   4960: iastore
    //   4961: dup
    //   4962: bipush #45
    //   4964: ldc 268435456
    //   4966: iastore
    //   4967: dup
    //   4968: bipush #46
    //   4970: ldc 262144
    //   4972: iastore
    //   4973: dup
    //   4974: bipush #47
    //   4976: ldc 268439616
    //   4978: iastore
    //   4979: dup
    //   4980: bipush #48
    //   4982: iconst_0
    //   4983: iastore
    //   4984: dup
    //   4985: bipush #49
    //   4987: ldc 268701760
    //   4989: iastore
    //   4990: dup
    //   4991: bipush #50
    //   4993: ldc 262208
    //   4995: iastore
    //   4996: dup
    //   4997: bipush #51
    //   4999: ldc 268435520
    //   5001: iastore
    //   5002: dup
    //   5003: bipush #52
    //   5005: ldc 268697600
    //   5007: iastore
    //   5008: dup
    //   5009: bipush #53
    //   5011: ldc 268439552
    //   5013: iastore
    //   5014: dup
    //   5015: bipush #54
    //   5017: ldc 268439616
    //   5019: iastore
    //   5020: dup
    //   5021: bipush #55
    //   5023: iconst_0
    //   5024: iastore
    //   5025: dup
    //   5026: bipush #56
    //   5028: ldc 268701760
    //   5030: iastore
    //   5031: dup
    //   5032: bipush #57
    //   5034: ldc 266240
    //   5036: iastore
    //   5037: dup
    //   5038: bipush #58
    //   5040: ldc 266240
    //   5042: iastore
    //   5043: dup
    //   5044: bipush #59
    //   5046: sipush #4160
    //   5049: iastore
    //   5050: dup
    //   5051: bipush #60
    //   5053: sipush #4160
    //   5056: iastore
    //   5057: dup
    //   5058: bipush #61
    //   5060: ldc 262208
    //   5062: iastore
    //   5063: dup
    //   5064: bipush #62
    //   5066: ldc 268435456
    //   5068: iastore
    //   5069: dup
    //   5070: bipush #63
    //   5072: ldc 268701696
    //   5074: iastore
    //   5075: astore #16
    //   5077: aload #4
    //   5079: arraylength
    //   5080: istore #17
    //   5082: iconst_2
    //   5083: newarray int
    //   5085: astore #18
    //   5087: iload #17
    //   5089: newarray byte
    //   5091: astore #5
    //   5093: iload #17
    //   5095: bipush #8
    //   5097: idiv
    //   5098: istore #19
    //   5100: iconst_0
    //   5101: istore #20
    //   5103: iload #20
    //   5105: iload #19
    //   5107: if_icmpge -> 6025
    //   5110: iload #20
    //   5112: bipush #8
    //   5114: imul
    //   5115: istore #21
    //   5117: iconst_0
    //   5118: istore #22
    //   5120: iload #22
    //   5122: iconst_2
    //   5123: if_icmpge -> 5212
    //   5126: aload #18
    //   5128: iload #22
    //   5130: aload #4
    //   5132: iload #21
    //   5134: iload #22
    //   5136: iconst_4
    //   5137: imul
    //   5138: iadd
    //   5139: baload
    //   5140: sipush #255
    //   5143: iand
    //   5144: bipush #24
    //   5146: ishl
    //   5147: aload #4
    //   5149: iload #21
    //   5151: iload #22
    //   5153: iconst_4
    //   5154: imul
    //   5155: iadd
    //   5156: iconst_1
    //   5157: iadd
    //   5158: baload
    //   5159: sipush #255
    //   5162: iand
    //   5163: bipush #16
    //   5165: ishl
    //   5166: ior
    //   5167: aload #4
    //   5169: iload #21
    //   5171: iload #22
    //   5173: iconst_4
    //   5174: imul
    //   5175: iadd
    //   5176: iconst_2
    //   5177: iadd
    //   5178: baload
    //   5179: sipush #255
    //   5182: iand
    //   5183: bipush #8
    //   5185: ishl
    //   5186: ior
    //   5187: aload #4
    //   5189: iload #21
    //   5191: iload #22
    //   5193: iconst_4
    //   5194: imul
    //   5195: iadd
    //   5196: iconst_3
    //   5197: iadd
    //   5198: baload
    //   5199: sipush #255
    //   5202: iand
    //   5203: ior
    //   5204: iastore
    //   5205: iinc #22, 1
    //   5208: iload_2
    //   5209: ifeq -> 5120
    //   5212: iconst_0
    //   5213: istore #27
    //   5215: aload #18
    //   5217: iconst_0
    //   5218: iaload
    //   5219: istore #25
    //   5221: aload #18
    //   5223: iconst_1
    //   5224: iaload
    //   5225: istore #24
    //   5227: iload #25
    //   5229: iconst_4
    //   5230: iushr
    //   5231: iload #24
    //   5233: ixor
    //   5234: ldc 252645135
    //   5236: iand
    //   5237: istore #23
    //   5239: iload #24
    //   5241: iload #23
    //   5243: ixor
    //   5244: istore #24
    //   5246: iload #25
    //   5248: iload #23
    //   5250: iconst_4
    //   5251: ishl
    //   5252: ixor
    //   5253: istore #25
    //   5255: iload #25
    //   5257: bipush #16
    //   5259: iushr
    //   5260: iload #24
    //   5262: ixor
    //   5263: ldc 65535
    //   5265: iand
    //   5266: istore #23
    //   5268: iload #24
    //   5270: iload #23
    //   5272: ixor
    //   5273: istore #24
    //   5275: iload #25
    //   5277: iload #23
    //   5279: bipush #16
    //   5281: ishl
    //   5282: ixor
    //   5283: istore #25
    //   5285: iload #24
    //   5287: iconst_2
    //   5288: iushr
    //   5289: iload #25
    //   5291: ixor
    //   5292: ldc 858993459
    //   5294: iand
    //   5295: istore #23
    //   5297: iload #25
    //   5299: iload #23
    //   5301: ixor
    //   5302: istore #25
    //   5304: iload #24
    //   5306: iload #23
    //   5308: iconst_2
    //   5309: ishl
    //   5310: ixor
    //   5311: istore #24
    //   5313: iload #24
    //   5315: bipush #8
    //   5317: iushr
    //   5318: iload #25
    //   5320: ixor
    //   5321: ldc 16711935
    //   5323: iand
    //   5324: istore #23
    //   5326: iload #25
    //   5328: iload #23
    //   5330: ixor
    //   5331: istore #25
    //   5333: iload #24
    //   5335: iload #23
    //   5337: bipush #8
    //   5339: ishl
    //   5340: ixor
    //   5341: istore #24
    //   5343: iload #24
    //   5345: iconst_1
    //   5346: ishl
    //   5347: iload #24
    //   5349: bipush #31
    //   5351: iushr
    //   5352: iconst_1
    //   5353: iand
    //   5354: ior
    //   5355: istore #24
    //   5357: iload #25
    //   5359: iload #24
    //   5361: ixor
    //   5362: ldc -1431655766
    //   5364: iand
    //   5365: istore #23
    //   5367: iload #25
    //   5369: iload #23
    //   5371: ixor
    //   5372: istore #25
    //   5374: iload #24
    //   5376: iload #23
    //   5378: ixor
    //   5379: istore #24
    //   5381: iload #25
    //   5383: iconst_1
    //   5384: ishl
    //   5385: iload #25
    //   5387: bipush #31
    //   5389: iushr
    //   5390: iconst_1
    //   5391: iand
    //   5392: ior
    //   5393: istore #25
    //   5395: iconst_0
    //   5396: istore #26
    //   5398: iload #26
    //   5400: bipush #8
    //   5402: if_icmpge -> 5740
    //   5405: iload #24
    //   5407: bipush #28
    //   5409: ishl
    //   5410: iload #24
    //   5412: iconst_4
    //   5413: iushr
    //   5414: ior
    //   5415: istore #23
    //   5417: iload #23
    //   5419: aload #6
    //   5421: iload #27
    //   5423: iinc #27, 1
    //   5426: iaload
    //   5427: ixor
    //   5428: istore #23
    //   5430: aload #15
    //   5432: iload #23
    //   5434: bipush #63
    //   5436: iand
    //   5437: iaload
    //   5438: istore #22
    //   5440: iload #22
    //   5442: aload #13
    //   5444: iload #23
    //   5446: bipush #8
    //   5448: iushr
    //   5449: bipush #63
    //   5451: iand
    //   5452: iaload
    //   5453: ior
    //   5454: istore #22
    //   5456: iload #22
    //   5458: aload #11
    //   5460: iload #23
    //   5462: bipush #16
    //   5464: iushr
    //   5465: bipush #63
    //   5467: iand
    //   5468: iaload
    //   5469: ior
    //   5470: istore #22
    //   5472: iload #22
    //   5474: aload #9
    //   5476: iload #23
    //   5478: bipush #24
    //   5480: iushr
    //   5481: bipush #63
    //   5483: iand
    //   5484: iaload
    //   5485: ior
    //   5486: istore #22
    //   5488: iload #24
    //   5490: aload #6
    //   5492: iload #27
    //   5494: iinc #27, 1
    //   5497: iaload
    //   5498: ixor
    //   5499: istore #23
    //   5501: iload #22
    //   5503: aload #16
    //   5505: iload #23
    //   5507: bipush #63
    //   5509: iand
    //   5510: iaload
    //   5511: ior
    //   5512: istore #22
    //   5514: iload #22
    //   5516: aload #14
    //   5518: iload #23
    //   5520: bipush #8
    //   5522: iushr
    //   5523: bipush #63
    //   5525: iand
    //   5526: iaload
    //   5527: ior
    //   5528: istore #22
    //   5530: iload #22
    //   5532: aload #12
    //   5534: iload #23
    //   5536: bipush #16
    //   5538: iushr
    //   5539: bipush #63
    //   5541: iand
    //   5542: iaload
    //   5543: ior
    //   5544: istore #22
    //   5546: iload #22
    //   5548: aload #10
    //   5550: iload #23
    //   5552: bipush #24
    //   5554: iushr
    //   5555: bipush #63
    //   5557: iand
    //   5558: iaload
    //   5559: ior
    //   5560: istore #22
    //   5562: iload #25
    //   5564: iload #22
    //   5566: ixor
    //   5567: istore #25
    //   5569: iload #25
    //   5571: bipush #28
    //   5573: ishl
    //   5574: iload #25
    //   5576: iconst_4
    //   5577: iushr
    //   5578: ior
    //   5579: istore #23
    //   5581: iload #23
    //   5583: aload #6
    //   5585: iload #27
    //   5587: iinc #27, 1
    //   5590: iaload
    //   5591: ixor
    //   5592: istore #23
    //   5594: aload #15
    //   5596: iload #23
    //   5598: bipush #63
    //   5600: iand
    //   5601: iaload
    //   5602: istore #22
    //   5604: iload #22
    //   5606: aload #13
    //   5608: iload #23
    //   5610: bipush #8
    //   5612: iushr
    //   5613: bipush #63
    //   5615: iand
    //   5616: iaload
    //   5617: ior
    //   5618: istore #22
    //   5620: iload #22
    //   5622: aload #11
    //   5624: iload #23
    //   5626: bipush #16
    //   5628: iushr
    //   5629: bipush #63
    //   5631: iand
    //   5632: iaload
    //   5633: ior
    //   5634: istore #22
    //   5636: iload #22
    //   5638: aload #9
    //   5640: iload #23
    //   5642: bipush #24
    //   5644: iushr
    //   5645: bipush #63
    //   5647: iand
    //   5648: iaload
    //   5649: ior
    //   5650: istore #22
    //   5652: iload #25
    //   5654: aload #6
    //   5656: iload #27
    //   5658: iinc #27, 1
    //   5661: iaload
    //   5662: ixor
    //   5663: istore #23
    //   5665: iload #22
    //   5667: aload #16
    //   5669: iload #23
    //   5671: bipush #63
    //   5673: iand
    //   5674: iaload
    //   5675: ior
    //   5676: istore #22
    //   5678: iload #22
    //   5680: aload #14
    //   5682: iload #23
    //   5684: bipush #8
    //   5686: iushr
    //   5687: bipush #63
    //   5689: iand
    //   5690: iaload
    //   5691: ior
    //   5692: istore #22
    //   5694: iload #22
    //   5696: aload #12
    //   5698: iload #23
    //   5700: bipush #16
    //   5702: iushr
    //   5703: bipush #63
    //   5705: iand
    //   5706: iaload
    //   5707: ior
    //   5708: istore #22
    //   5710: iload #22
    //   5712: aload #10
    //   5714: iload #23
    //   5716: bipush #24
    //   5718: iushr
    //   5719: bipush #63
    //   5721: iand
    //   5722: iaload
    //   5723: ior
    //   5724: istore #22
    //   5726: iload #24
    //   5728: iload #22
    //   5730: ixor
    //   5731: istore #24
    //   5733: iinc #26, 1
    //   5736: iload_2
    //   5737: ifeq -> 5398
    //   5740: iload #24
    //   5742: bipush #31
    //   5744: ishl
    //   5745: iload #24
    //   5747: iconst_1
    //   5748: iushr
    //   5749: ior
    //   5750: istore #24
    //   5752: iload #25
    //   5754: iload #24
    //   5756: ixor
    //   5757: ldc -1431655766
    //   5759: iand
    //   5760: istore #23
    //   5762: iload #25
    //   5764: iload #23
    //   5766: ixor
    //   5767: istore #25
    //   5769: iload #24
    //   5771: iload #23
    //   5773: ixor
    //   5774: istore #24
    //   5776: iload #25
    //   5778: bipush #31
    //   5780: ishl
    //   5781: iload #25
    //   5783: iconst_1
    //   5784: iushr
    //   5785: ior
    //   5786: istore #25
    //   5788: iload #25
    //   5790: bipush #8
    //   5792: iushr
    //   5793: iload #24
    //   5795: ixor
    //   5796: ldc 16711935
    //   5798: iand
    //   5799: istore #23
    //   5801: iload #24
    //   5803: iload #23
    //   5805: ixor
    //   5806: istore #24
    //   5808: iload #25
    //   5810: iload #23
    //   5812: bipush #8
    //   5814: ishl
    //   5815: ixor
    //   5816: istore #25
    //   5818: iload #25
    //   5820: iconst_2
    //   5821: iushr
    //   5822: iload #24
    //   5824: ixor
    //   5825: ldc 858993459
    //   5827: iand
    //   5828: istore #23
    //   5830: iload #24
    //   5832: iload #23
    //   5834: ixor
    //   5835: istore #24
    //   5837: iload #25
    //   5839: iload #23
    //   5841: iconst_2
    //   5842: ishl
    //   5843: ixor
    //   5844: istore #25
    //   5846: iload #24
    //   5848: bipush #16
    //   5850: iushr
    //   5851: iload #25
    //   5853: ixor
    //   5854: ldc 65535
    //   5856: iand
    //   5857: istore #23
    //   5859: iload #25
    //   5861: iload #23
    //   5863: ixor
    //   5864: istore #25
    //   5866: iload #24
    //   5868: iload #23
    //   5870: bipush #16
    //   5872: ishl
    //   5873: ixor
    //   5874: istore #24
    //   5876: iload #24
    //   5878: iconst_4
    //   5879: iushr
    //   5880: iload #25
    //   5882: ixor
    //   5883: ldc 252645135
    //   5885: iand
    //   5886: istore #23
    //   5888: iload #25
    //   5890: iload #23
    //   5892: ixor
    //   5893: istore #25
    //   5895: iload #24
    //   5897: iload #23
    //   5899: iconst_4
    //   5900: ishl
    //   5901: ixor
    //   5902: istore #24
    //   5904: aload #18
    //   5906: iconst_0
    //   5907: iload #24
    //   5909: iastore
    //   5910: aload #18
    //   5912: iconst_1
    //   5913: iload #25
    //   5915: iastore
    //   5916: iload #20
    //   5918: bipush #8
    //   5920: imul
    //   5921: istore #28
    //   5923: iconst_0
    //   5924: istore #29
    //   5926: iload #29
    //   5928: iconst_2
    //   5929: if_icmpge -> 6018
    //   5932: aload #5
    //   5934: iload #28
    //   5936: iload #29
    //   5938: iconst_4
    //   5939: imul
    //   5940: iadd
    //   5941: aload #18
    //   5943: iload #29
    //   5945: iaload
    //   5946: bipush #24
    //   5948: iushr
    //   5949: i2b
    //   5950: bastore
    //   5951: aload #5
    //   5953: iload #28
    //   5955: iload #29
    //   5957: iconst_4
    //   5958: imul
    //   5959: iadd
    //   5960: iconst_1
    //   5961: iadd
    //   5962: aload #18
    //   5964: iload #29
    //   5966: iaload
    //   5967: bipush #16
    //   5969: iushr
    //   5970: i2b
    //   5971: bastore
    //   5972: aload #5
    //   5974: iload #28
    //   5976: iload #29
    //   5978: iconst_4
    //   5979: imul
    //   5980: iadd
    //   5981: iconst_2
    //   5982: iadd
    //   5983: aload #18
    //   5985: iload #29
    //   5987: iaload
    //   5988: bipush #8
    //   5990: iushr
    //   5991: i2b
    //   5992: bastore
    //   5993: aload #5
    //   5995: iload #28
    //   5997: iload #29
    //   5999: iconst_4
    //   6000: imul
    //   6001: iadd
    //   6002: iconst_3
    //   6003: iadd
    //   6004: aload #18
    //   6006: iload #29
    //   6008: iaload
    //   6009: i2b
    //   6010: bastore
    //   6011: iinc #29, 1
    //   6014: iload_2
    //   6015: ifeq -> 5926
    //   6018: iinc #20, 1
    //   6021: iload_2
    //   6022: ifeq -> 5103
    //   6025: getstatic burp/Zzsq.Zc : Ljava/lang/String;
    //   6028: getstatic burp/Zr0u.ZB : Ljava/lang/Object;
    //   6031: checkcast java/math/BigInteger
    //   6034: invokevirtual intValue : ()I
    //   6037: bipush #32
    //   6039: irem
    //   6040: invokestatic abs : (I)I
    //   6043: invokevirtual charAt : (I)C
    //   6046: getstatic burp/Zk8b.ZT : Ljava/lang/String;
    //   6049: getstatic burp/Zlhm.ZT : Ljava/lang/Object;
    //   6052: checkcast java/math/BigInteger
    //   6055: invokevirtual intValue : ()I
    //   6058: bipush #32
    //   6060: irem
    //   6061: invokestatic abs : (I)I
    //   6064: invokevirtual charAt : (I)C
    //   6067: if_icmpgt -> 6174
    //   6070: getstatic burp/Zbp.Z_ : Ljava/lang/String;
    //   6073: getstatic burp/Zter.Zc : Ljava/lang/Object;
    //   6076: checkcast java/math/BigInteger
    //   6079: invokevirtual intValue : ()I
    //   6082: bipush #32
    //   6084: irem
    //   6085: invokestatic abs : (I)I
    //   6088: invokevirtual charAt : (I)C
    //   6091: getstatic burp/Zbp.Z_ : Ljava/lang/String;
    //   6094: getstatic burp/Zbo7.Zl : Ljava/lang/Object;
    //   6097: checkcast java/math/BigInteger
    //   6100: invokevirtual intValue : ()I
    //   6103: bipush #32
    //   6105: irem
    //   6106: invokestatic abs : (I)I
    //   6109: invokevirtual charAt : (I)C
    //   6112: if_icmpgt -> 6174
    //   6115: goto -> 6122
    //   6118: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6121: athrow
    //   6122: getstatic burp/Zkbf.Zv : Ljava/lang/String;
    //   6125: getstatic burp/Zzap.ZL : Ljava/lang/Object;
    //   6128: checkcast java/math/BigInteger
    //   6131: invokevirtual intValue : ()I
    //   6134: bipush #32
    //   6136: irem
    //   6137: invokestatic abs : (I)I
    //   6140: invokevirtual charAt : (I)C
    //   6143: getstatic burp/Zeh9.ZF : Ljava/lang/String;
    //   6146: getstatic burp/Zx54.Zn : Ljava/lang/Object;
    //   6149: checkcast java/math/BigInteger
    //   6152: invokevirtual intValue : ()I
    //   6155: bipush #32
    //   6157: irem
    //   6158: invokestatic abs : (I)I
    //   6161: invokevirtual charAt : (I)C
    //   6164: if_icmpgt -> 6182
    //   6167: goto -> 6174
    //   6170: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6173: athrow
    //   6174: iconst_1
    //   6175: goto -> 6183
    //   6178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6181: athrow
    //   6182: iconst_0
    //   6183: ireturn
    //   6184: astore_3
    //   6185: new java/lang/Exception
    //   6188: dup
    //   6189: aload_3
    //   6190: invokevirtual getMessage : ()Ljava/lang/String;
    //   6193: invokespecial <init> : (Ljava/lang/String;)V
    //   6196: athrow
    // Exception table:
    //   from	to	target	type
    //   4	6183	6184	java/lang/Throwable
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
    //   6025	6115	6118	java/lang/Throwable
    //   6070	6167	6170	java/lang/Throwable
    //   6122	6178	6178	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ih3ôØÀ\\tyÉ¤ÑÃè²'¯Ç~  O\\rî½S ;ÚÐg´KÞ*\\n¿CÏé9¥bÑºÖëæ\\têSÖÄ©&¶\\tí26®Ø,¼Ig'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #20
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
    //   68: ldc ' Nü¤X¼v²¦±\\nö¥X¸squÊOzMeáH\\f-Î1ÅåîÀ\±)=UJ6ë¦(cìic®V°r¨v÷£J1 Ê%¹GçQKê$f©À#ððÆ\ÿ3ð>.«'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #78
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
    //   129: putstatic burp/Zbsr.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbsr.b : [Ljava/lang/String;
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
    //   212: bipush #57
    //   214: goto -> 244
    //   217: bipush #116
    //   219: goto -> 244
    //   222: bipush #102
    //   224: goto -> 244
    //   227: bipush #91
    //   229: goto -> 244
    //   232: bipush #86
    //   234: goto -> 244
    //   237: bipush #32
    //   239: goto -> 244
    //   242: bipush #98
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
    //   300: sipush #8719
    //   303: sipush #-29915
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zbsr.Zq : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #119
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #34
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-19
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-87
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-36
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-51
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-69
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #85
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #24
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-93
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #96
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-56
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #81
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #-6
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-3
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-33
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #-46
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #33
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #-114
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #85
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #-32
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-75
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #-9
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-22
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #119
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #26
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #-92
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #107
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #-24
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #-7
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #-110
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #-105
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zbsr.ZD : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2209) & 0xFFFF;
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
      byte b1 = 117;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbsr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */