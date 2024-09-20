package burp;

import java.math.BigInteger;

class Ztw4 extends ClassLoader {
  static Object ZF;
  
  static String Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZB(Object paramObject) {
    Zl5.ZE = a(-6288, 24639);
    Zl5.ZY = new BigInteger(a(-6282, 23353));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zewq.ZV.charAt(Math.abs(((BigInteger)Zs56.ZC).intValue() % 32)) > Zs5i.ZJ.charAt(Math.abs(((BigInteger)Zktq.Zn).intValue() % 32))) {
          try {
            Zezi.Zu(Class.forName(a(-6276, -588)));
            if (!bool)
              Zre4.Zm(Class.forName(a(-6283, -22967))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zre4.Zm(Class.forName(a(-6283, -22967)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zl(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zm14.ZE : Ljava/lang/String;
    //   172: getstatic burp/Zzoc.Zx : Ljava/lang/Object;
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
    //   206: getstatic burp/Zlzs.Zp : Ljava/lang/String;
    //   209: getstatic burp/Ztw4.ZF : Ljava/lang/Object;
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
    //   243: getstatic burp/Zgl2.Zw : Ljava/lang/String;
    //   246: getstatic burp/Zth8.Zk : Ljava/lang/Object;
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
    //   280: getstatic burp/Zefn.Ze : Ljava/lang/String;
    //   283: getstatic burp/Zmh0.Zt : Ljava/lang/Object;
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
    //   317: getstatic burp/Zefn.Ze : Ljava/lang/String;
    //   320: getstatic burp/Zs5k.Zg : Ljava/lang/Object;
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
    //   354: getstatic burp/Zl1z.Zh : Ljava/lang/String;
    //   357: getstatic burp/Zlwi.Zw : Ljava/lang/Object;
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
    //   391: getstatic burp/Zlhu.ZC : Ljava/lang/String;
    //   394: getstatic burp/Zm5s.ZB : Ljava/lang/Object;
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
    //   428: getstatic burp/Zrh1.Zg : Ljava/lang/String;
    //   431: getstatic burp/Zzh9.Zv : Ljava/lang/Object;
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
    //   465: getstatic burp/Ztw4.Zb : Ljava/lang/String;
    //   468: getstatic burp/Zlzs.ZL : Ljava/lang/Object;
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
    //   502: getstatic burp/Zm5s.Z_ : Ljava/lang/String;
    //   505: getstatic burp/Zsot.ZJ : Ljava/lang/Object;
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
    //   539: getstatic burp/Zlvx.Zr : Ljava/lang/String;
    //   542: getstatic burp/Ztdg.ZE : Ljava/lang/Object;
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
    //   576: getstatic burp/Zmvk.Z_ : Ljava/lang/String;
    //   579: getstatic burp/Zefn.ZJ : Ljava/lang/Object;
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
    //   613: getstatic burp/Zlvx.Zr : Ljava/lang/String;
    //   616: getstatic burp/Zzxa.ZI : Ljava/lang/Object;
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
    //   650: getstatic burp/Zgl2.Zw : Ljava/lang/String;
    //   653: getstatic burp/Ztpg.Z_ : Ljava/lang/Object;
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
    //   687: getstatic burp/Zgr1.Za : Ljava/lang/String;
    //   690: getstatic burp/Zgr1.Zf : Ljava/lang/Object;
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
    //   724: getstatic burp/Zre4.Zh : Ljava/lang/String;
    //   727: getstatic burp/Ztsc.Zr : Ljava/lang/Object;
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
    //   761: getstatic burp/Zrnw.Zg : Ljava/lang/String;
    //   764: getstatic burp/Zml2.Zo : Ljava/lang/Object;
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
    //   798: getstatic burp/Zszm.Zf : Ljava/lang/String;
    //   801: getstatic burp/Zspk.ZF : Ljava/lang/Object;
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
    //   835: getstatic burp/Zrx5.ZD : Ljava/lang/String;
    //   838: getstatic burp/Zl1z.ZV : Ljava/lang/Object;
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
    //   872: getstatic burp/Zro_.Zz : Ljava/lang/String;
    //   875: getstatic burp/Zlwi.Zw : Ljava/lang/Object;
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
    //   909: getstatic burp/Zlzs.Zp : Ljava/lang/String;
    //   912: getstatic burp/Zr8r.ZR : Ljava/lang/Object;
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
    //   946: getstatic burp/Zl5.ZE : Ljava/lang/String;
    //   949: getstatic burp/Zlhu.ZJ : Ljava/lang/Object;
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
    //   983: getstatic burp/Ztpg.Zr : Ljava/lang/String;
    //   986: getstatic burp/Zspk.ZF : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zl15.ZI : Ljava/lang/String;
    //   1023: getstatic burp/Zbzj.Zz : Ljava/lang/Object;
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
    //   1057: getstatic burp/Ztdg.ZS : Ljava/lang/String;
    //   1060: getstatic burp/Zg5.Zs : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zrt9.Zc : Ljava/lang/String;
    //   1097: getstatic burp/Zmh0.Zt : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zg3m.Za : Ljava/lang/String;
    //   1134: getstatic burp/Zmdm.ZZ : Ljava/lang/Object;
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
    //   1168: getstatic burp/Ztc2.Zr : Ljava/lang/String;
    //   1171: getstatic burp/Ztg3.Zg : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zl8s.Zn : Ljava/lang/String;
    //   1208: getstatic burp/Zl8s.ZY : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zeju.ZR : Ljava/lang/String;
    //   1245: getstatic burp/Zenq.Zd : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zszm.Zf : Ljava/lang/String;
    //   1282: getstatic burp/Zb8_.ZT : Ljava/lang/Object;
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
    //   1319: getstatic burp/Zsot.ZJ : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zs56.ZW : Ljava/lang/String;
    //   1362: sipush #-6287
    //   1365: getstatic burp/Zs5i.ZD : Ljava/lang/Object;
    //   1368: checkcast java/math/BigInteger
    //   1371: getstatic burp/Ztw4.ZF : Ljava/lang/Object;
    //   1374: checkcast java/math/BigInteger
    //   1377: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1380: putstatic burp/Zeju.Zk : Ljava/lang/Object;
    //   1383: sipush #-28824
    //   1386: invokestatic a : (II)Ljava/lang/String;
    //   1389: iconst_1
    //   1390: ldc burp/Zl88
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
    //   1415: if_icmpge -> 1551
    //   1418: aload #4
    //   1420: iload #6
    //   1422: aaload
    //   1423: astore #7
    //   1425: aload #7
    //   1427: invokevirtual getModifiers : ()I
    //   1430: invokestatic isStatic : (I)Z
    //   1433: ifne -> 1443
    //   1436: goto -> 1544
    //   1439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1442: athrow
    //   1443: aload #7
    //   1445: invokevirtual getType : ()Ljava/lang/Class;
    //   1448: astore #8
    //   1450: aload #8
    //   1452: ifnull -> 1531
    //   1455: aload #8
    //   1457: invokevirtual isPrimitive : ()Z
    //   1460: ifne -> 1531
    //   1463: goto -> 1470
    //   1466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1469: athrow
    //   1470: aload #8
    //   1472: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1475: ifnull -> 1531
    //   1478: goto -> 1485
    //   1481: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1484: athrow
    //   1485: aload #8
    //   1487: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1490: invokevirtual getName : ()Ljava/lang/String;
    //   1493: ifnull -> 1531
    //   1496: goto -> 1503
    //   1499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1502: athrow
    //   1503: aload #8
    //   1505: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1508: invokevirtual getName : ()Ljava/lang/String;
    //   1511: sipush #-6286
    //   1514: iconst_4
    //   1515: invokestatic a : (II)Ljava/lang/String;
    //   1518: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1521: ifne -> 1531
    //   1524: goto -> 1531
    //   1527: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1530: athrow
    //   1531: aload #7
    //   1533: iconst_1
    //   1534: invokevirtual setAccessible : (Z)V
    //   1537: aload #7
    //   1539: aconst_null
    //   1540: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1543: pop
    //   1544: iinc #6, 1
    //   1547: iload_2
    //   1548: ifne -> 1411
    //   1551: sipush #-6274
    //   1554: sipush #-26278
    //   1557: invokestatic a : (II)Ljava/lang/String;
    //   1560: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1563: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1566: astore #4
    //   1568: aload #4
    //   1570: arraylength
    //   1571: istore #5
    //   1573: iconst_0
    //   1574: istore #6
    //   1576: iload #6
    //   1578: iload #5
    //   1580: if_icmpge -> 1713
    //   1583: aload #4
    //   1585: iload #6
    //   1587: aaload
    //   1588: astore #7
    //   1590: aload #7
    //   1592: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1595: pop
    //   1596: aload #7
    //   1598: invokevirtual getModifiers : ()I
    //   1601: invokestatic isStatic : (I)Z
    //   1604: ifeq -> 1699
    //   1607: aload #7
    //   1609: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1612: arraylength
    //   1613: iconst_2
    //   1614: if_icmpne -> 1699
    //   1617: goto -> 1624
    //   1620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1623: athrow
    //   1624: aload #7
    //   1626: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1629: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1632: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1635: ifeq -> 1699
    //   1638: goto -> 1645
    //   1641: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1644: athrow
    //   1645: aload #7
    //   1647: iconst_1
    //   1648: invokevirtual setAccessible : (Z)V
    //   1651: aload #7
    //   1653: aconst_null
    //   1654: iconst_2
    //   1655: anewarray java/lang/Object
    //   1658: dup
    //   1659: iconst_0
    //   1660: aload_0
    //   1661: aastore
    //   1662: dup
    //   1663: iconst_1
    //   1664: aload_1
    //   1665: ifnonnull -> 1683
    //   1668: goto -> 1675
    //   1671: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1674: athrow
    //   1675: aload_1
    //   1676: goto -> 1690
    //   1679: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1682: athrow
    //   1683: aload_1
    //   1684: checkcast [B
    //   1687: invokevirtual clone : ()Ljava/lang/Object;
    //   1690: aastore
    //   1691: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1694: pop
    //   1695: iload_2
    //   1696: ifne -> 1713
    //   1699: iinc #6, 1
    //   1702: iload_2
    //   1703: ifne -> 1576
    //   1706: goto -> 1713
    //   1709: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1712: athrow
    //   1713: getstatic burp/Zg_6.ZU : Ljava/lang/Object;
    //   1716: checkcast java/math/BigInteger
    //   1719: invokevirtual intValue : ()I
    //   1722: i2l
    //   1723: invokestatic currentTimeMillis : ()J
    //   1726: ladd
    //   1727: getstatic burp/Zej5.ZB : Ljava/lang/Object;
    //   1730: checkcast java/math/BigInteger
    //   1733: invokevirtual intValue : ()I
    //   1736: i2l
    //   1737: lcmp
    //   1738: ifge -> 2076
    //   1741: sipush #-6284
    //   1744: sipush #-28117
    //   1747: invokestatic a : (II)Ljava/lang/String;
    //   1750: iconst_1
    //   1751: ldc burp/Zecm
    //   1753: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1756: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1759: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1762: astore #4
    //   1764: aload #4
    //   1766: arraylength
    //   1767: istore #5
    //   1769: iconst_0
    //   1770: istore #6
    //   1772: iload #6
    //   1774: iload #5
    //   1776: if_icmpge -> 1914
    //   1779: aload #4
    //   1781: iload #6
    //   1783: aaload
    //   1784: astore #7
    //   1786: aload #7
    //   1788: invokevirtual getModifiers : ()I
    //   1791: invokestatic isStatic : (I)Z
    //   1794: ifne -> 1804
    //   1797: goto -> 1907
    //   1800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1803: athrow
    //   1804: aload #7
    //   1806: invokevirtual getType : ()Ljava/lang/Class;
    //   1809: astore #8
    //   1811: aload #8
    //   1813: ifnull -> 1894
    //   1816: aload #8
    //   1818: invokevirtual isPrimitive : ()Z
    //   1821: ifne -> 1894
    //   1824: goto -> 1831
    //   1827: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1830: athrow
    //   1831: aload #8
    //   1833: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1836: ifnull -> 1894
    //   1839: goto -> 1846
    //   1842: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1845: athrow
    //   1846: aload #8
    //   1848: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1851: invokevirtual getName : ()Ljava/lang/String;
    //   1854: ifnull -> 1894
    //   1857: goto -> 1864
    //   1860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1863: athrow
    //   1864: aload #8
    //   1866: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1869: invokevirtual getName : ()Ljava/lang/String;
    //   1872: sipush #-6281
    //   1875: sipush #-26300
    //   1878: invokestatic a : (II)Ljava/lang/String;
    //   1881: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1884: ifne -> 1894
    //   1887: goto -> 1894
    //   1890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1893: athrow
    //   1894: aload #7
    //   1896: iconst_1
    //   1897: invokevirtual setAccessible : (Z)V
    //   1900: aload #7
    //   1902: aconst_null
    //   1903: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1906: pop
    //   1907: iinc #6, 1
    //   1910: iload_2
    //   1911: ifne -> 1772
    //   1914: sipush #-6285
    //   1917: sipush #21050
    //   1920: invokestatic a : (II)Ljava/lang/String;
    //   1923: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1926: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1929: astore #4
    //   1931: aload #4
    //   1933: arraylength
    //   1934: istore #5
    //   1936: iconst_0
    //   1937: istore #6
    //   1939: iload #6
    //   1941: iload #5
    //   1943: if_icmpge -> 2076
    //   1946: aload #4
    //   1948: iload #6
    //   1950: aaload
    //   1951: astore #7
    //   1953: aload #7
    //   1955: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1958: pop
    //   1959: aload #7
    //   1961: invokevirtual getModifiers : ()I
    //   1964: invokestatic isStatic : (I)Z
    //   1967: ifeq -> 2062
    //   1970: aload #7
    //   1972: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1975: arraylength
    //   1976: iconst_2
    //   1977: if_icmpne -> 2062
    //   1980: goto -> 1987
    //   1983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1986: athrow
    //   1987: aload #7
    //   1989: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1992: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1995: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1998: ifeq -> 2062
    //   2001: goto -> 2008
    //   2004: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2007: athrow
    //   2008: aload #7
    //   2010: iconst_1
    //   2011: invokevirtual setAccessible : (Z)V
    //   2014: aload #7
    //   2016: aconst_null
    //   2017: iconst_2
    //   2018: anewarray java/lang/Object
    //   2021: dup
    //   2022: iconst_0
    //   2023: aload_0
    //   2024: aastore
    //   2025: dup
    //   2026: iconst_1
    //   2027: aload_1
    //   2028: ifnonnull -> 2046
    //   2031: goto -> 2038
    //   2034: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2037: athrow
    //   2038: aload_1
    //   2039: goto -> 2053
    //   2042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2045: athrow
    //   2046: aload_1
    //   2047: checkcast [B
    //   2050: invokevirtual clone : ()Ljava/lang/Object;
    //   2053: aastore
    //   2054: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2057: pop
    //   2058: iload_2
    //   2059: ifne -> 2076
    //   2062: iinc #6, 1
    //   2065: iload_2
    //   2066: ifne -> 1939
    //   2069: goto -> 2076
    //   2072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2075: athrow
    //   2076: getstatic burp/Zl5.ZE : Ljava/lang/String;
    //   2079: getstatic burp/Ztg3.Zg : Ljava/lang/Object;
    //   2082: checkcast java/math/BigInteger
    //   2085: invokevirtual intValue : ()I
    //   2088: bipush #32
    //   2090: irem
    //   2091: invokestatic abs : (I)I
    //   2094: invokevirtual charAt : (I)C
    //   2097: getstatic burp/Zevc.ZF : Ljava/lang/String;
    //   2100: getstatic burp/Zmfw.ZS : Ljava/lang/Object;
    //   2103: checkcast java/math/BigInteger
    //   2106: invokevirtual intValue : ()I
    //   2109: bipush #32
    //   2111: irem
    //   2112: invokestatic abs : (I)I
    //   2115: invokevirtual charAt : (I)C
    //   2118: if_icmple -> 2225
    //   2121: getstatic burp/Zrt9.Zc : Ljava/lang/String;
    //   2124: getstatic burp/Zevc.Zm : Ljava/lang/Object;
    //   2127: checkcast java/math/BigInteger
    //   2130: invokevirtual intValue : ()I
    //   2133: bipush #32
    //   2135: irem
    //   2136: invokestatic abs : (I)I
    //   2139: invokevirtual charAt : (I)C
    //   2142: getstatic burp/Ztw4.Zb : Ljava/lang/String;
    //   2145: getstatic burp/Zbsc.ZA : Ljava/lang/Object;
    //   2148: checkcast java/math/BigInteger
    //   2151: invokevirtual intValue : ()I
    //   2154: bipush #32
    //   2156: irem
    //   2157: invokestatic abs : (I)I
    //   2160: invokevirtual charAt : (I)C
    //   2163: if_icmpgt -> 2225
    //   2166: goto -> 2173
    //   2169: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2172: athrow
    //   2173: getstatic burp/Zz5l.ZH : Ljava/lang/String;
    //   2176: getstatic burp/Zlwi.Zw : Ljava/lang/Object;
    //   2179: checkcast java/math/BigInteger
    //   2182: invokevirtual intValue : ()I
    //   2185: bipush #32
    //   2187: irem
    //   2188: invokestatic abs : (I)I
    //   2191: invokevirtual charAt : (I)C
    //   2194: getstatic burp/Zg5.ZF : Ljava/lang/String;
    //   2197: getstatic burp/Zmly.ZT : Ljava/lang/Object;
    //   2200: checkcast java/math/BigInteger
    //   2203: invokevirtual intValue : ()I
    //   2206: bipush #32
    //   2208: irem
    //   2209: invokestatic abs : (I)I
    //   2212: invokevirtual charAt : (I)C
    //   2215: if_icmpgt -> 2233
    //   2218: goto -> 2225
    //   2221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2224: athrow
    //   2225: iconst_1
    //   2226: goto -> 2234
    //   2229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2232: athrow
    //   2233: iconst_0
    //   2234: ireturn
    //   2235: astore_3
    //   2236: new java/lang/Exception
    //   2239: dup
    //   2240: aload_3
    //   2241: invokevirtual getMessage : ()Ljava/lang/String;
    //   2244: invokespecial <init> : (Ljava/lang/String;)V
    //   2247: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2234	2235	java/lang/Throwable
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
    //   1485	1524	1527	java/lang/Throwable
    //   1590	1617	1620	java/lang/Throwable
    //   1607	1638	1641	java/lang/Throwable
    //   1624	1668	1671	java/lang/Throwable
    //   1645	1679	1679	java/lang/Throwable
    //   1690	1706	1709	java/lang/Throwable
    //   1786	1800	1800	java/lang/Throwable
    //   1811	1824	1827	java/lang/Throwable
    //   1816	1839	1842	java/lang/Throwable
    //   1831	1857	1860	java/lang/Throwable
    //   1846	1887	1890	java/lang/Throwable
    //   1953	1980	1983	java/lang/Throwable
    //   1970	2001	2004	java/lang/Throwable
    //   1987	2031	2034	java/lang/Throwable
    //   2008	2042	2042	java/lang/Throwable
    //   2053	2069	2072	java/lang/Throwable
    //   2076	2166	2169	java/lang/Throwable
    //   2121	2218	2221	java/lang/Throwable
    //   2173	2229	2229	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'b='Úã_K\\tçì%´M¨×>yÆÒRªû¿°1I3-îË¡RozÈ&ÞüZ\\rkÚ¤û)ì"1îx0¯ÈVï¡Ú+:^Cîj~É¯!þ¦Ç½J¢½K·ZË  ­ïý<Îi%°Yâ½{G¿¥GRÊÖú^È\\te H}n£ÌÛÿ\\tø³ÛÙ¬\\f\\t¾2{-Âäl.'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #77
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
    //   68: ldc 'À^¥öù}7§Á°ïÜbáIôÿI+£ôù°ö\\tä³{T'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #112
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
    //   129: putstatic burp/Ztw4.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztw4.b : [Ljava/lang/String;
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
    //   212: bipush #65
    //   214: goto -> 244
    //   217: bipush #19
    //   219: goto -> 244
    //   222: bipush #60
    //   224: goto -> 244
    //   227: bipush #70
    //   229: goto -> 244
    //   232: bipush #12
    //   234: goto -> 244
    //   237: bipush #111
    //   239: goto -> 244
    //   242: bipush #91
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
    //   311: bipush #54
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-62
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: iconst_2
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-65
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-37
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #41
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-80
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: iconst_5
    //   348: bastore
    //   349: dup
    //   350: bipush #8
    //   352: bipush #91
    //   354: bastore
    //   355: dup
    //   356: bipush #9
    //   358: bipush #116
    //   360: bastore
    //   361: dup
    //   362: bipush #10
    //   364: bipush #-44
    //   366: bastore
    //   367: dup
    //   368: bipush #11
    //   370: bipush #-124
    //   372: bastore
    //   373: dup
    //   374: bipush #12
    //   376: bipush #-55
    //   378: bastore
    //   379: dup
    //   380: bipush #13
    //   382: bipush #38
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #-126
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #-73
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #-80
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #67
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #123
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #-123
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #-15
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #87
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #-93
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #16
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #72
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-102
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #23
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #-118
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #-75
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-80
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-81
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #127
    //   492: bastore
    //   493: invokespecial <init> : (I[B)V
    //   496: putstatic burp/Ztw4.ZF : Ljava/lang/Object;
    //   499: sipush #-6275
    //   502: sipush #31334
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Ztw4.Zb : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE774) & 0xFFFF;
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
      byte b1 = 105;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztw4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */