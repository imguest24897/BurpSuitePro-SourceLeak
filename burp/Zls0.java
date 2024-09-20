package burp;

import java.math.BigInteger;

class Zls0 extends ClassLoader {
  static Object ZZ;
  
  static String ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zn(Object paramObject) {
    Zt7j.Zx = a(4582, 1550);
    Zt7j.ZH = new BigInteger(a(4578, 2007));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zxf8.Zq.charAt(Math.abs(((BigInteger)Zro2.Zu).intValue() % 32)) <= Zrpm.ZG.charAt(Math.abs(((BigInteger)Zeuz.Zp).intValue() % 32))) {
          try {
            Zexn.Zg(Class.forName(a(4577, 32653)));
            if (!bool)
              Ztd6.ZZ(Class.forName(a(4581, -18801))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztd6.ZZ(Class.forName(a(4581, -18801)));
    } catch (Throwable throwable) {}
  }
  
  static void ZX(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zc(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zgjs.Zp : Ljava/lang/String;
    //   172: getstatic burp/Zsts.Zu : Ljava/lang/Object;
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
    //   206: getstatic burp/Zxx4.Zq : Ljava/lang/String;
    //   209: getstatic burp/Zml.ZR : Ljava/lang/Object;
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
    //   243: getstatic burp/Zxf8.Zq : Ljava/lang/String;
    //   246: getstatic burp/Zxo4.ZV : Ljava/lang/Object;
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
    //   280: getstatic burp/Zmv9.Zm : Ljava/lang/String;
    //   283: getstatic burp/Zxt5.ZG : Ljava/lang/Object;
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
    //   317: getstatic burp/Zgds.ZA : Ljava/lang/String;
    //   320: getstatic burp/Zvk.ZN : Ljava/lang/Object;
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
    //   354: getstatic burp/Zmu6.Zl : Ljava/lang/String;
    //   357: getstatic burp/Zlxs.ZK : Ljava/lang/Object;
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
    //   391: getstatic burp/Zk88.ZZ : Ljava/lang/String;
    //   394: getstatic burp/Zgyc.ZT : Ljava/lang/Object;
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
    //   428: getstatic burp/Zsjo.Zu : Ljava/lang/String;
    //   431: getstatic burp/Zro2.Zu : Ljava/lang/Object;
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
    //   465: getstatic burp/Zxf8.Zq : Ljava/lang/String;
    //   468: getstatic burp/Zgly.ZN : Ljava/lang/Object;
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
    //   502: getstatic burp/Zzri.ZL : Ljava/lang/String;
    //   505: getstatic burp/Zmze.Zo : Ljava/lang/Object;
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
    //   539: getstatic burp/Zsts.ZI : Ljava/lang/String;
    //   542: getstatic burp/Zgds.Z_ : Ljava/lang/Object;
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
    //   576: getstatic burp/Zml.ZN : Ljava/lang/String;
    //   579: getstatic burp/Zmze.Zo : Ljava/lang/Object;
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
    //   613: getstatic burp/Zlkm.ZH : Ljava/lang/String;
    //   616: getstatic burp/Zk88.ZX : Ljava/lang/Object;
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
    //   650: getstatic burp/Zmuj.ZG : Ljava/lang/String;
    //   653: getstatic burp/Zgia.Zx : Ljava/lang/Object;
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
    //   687: getstatic burp/Zxt5.ZM : Ljava/lang/String;
    //   690: getstatic burp/Zrka.Zr : Ljava/lang/Object;
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
    //   724: getstatic burp/Zgyc.Zj : Ljava/lang/String;
    //   727: getstatic burp/Zb0s.Zv : Ljava/lang/Object;
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
    //   761: getstatic burp/Zll8.ZZ : Ljava/lang/String;
    //   764: getstatic burp/Zls0.ZZ : Ljava/lang/Object;
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
    //   798: getstatic burp/Zmy4.ZS : Ljava/lang/String;
    //   801: getstatic burp/Zg7w.Zy : Ljava/lang/Object;
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
    //   835: getstatic burp/Zrly.ZS : Ljava/lang/String;
    //   838: getstatic burp/Zlbt.ZF : Ljava/lang/Object;
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
    //   872: getstatic burp/Zgjs.Zp : Ljava/lang/String;
    //   875: getstatic burp/Ztp.Zp : Ljava/lang/Object;
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
    //   909: getstatic burp/Ze57.ZV : Ljava/lang/String;
    //   912: getstatic burp/Zvos.Zr : Ljava/lang/Object;
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
    //   946: getstatic burp/Zsts.ZI : Ljava/lang/String;
    //   949: getstatic burp/Zbo2.ZQ : Ljava/lang/Object;
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
    //   983: getstatic burp/Zxc.Zx : Ljava/lang/String;
    //   986: getstatic burp/Zt5b.Zc : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zlp8.ZW : Ljava/lang/String;
    //   1023: getstatic burp/Zzri.ZG : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zmv9.Zm : Ljava/lang/String;
    //   1060: getstatic burp/Zf.Zh : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zmze.ZO : Ljava/lang/String;
    //   1097: getstatic burp/Zvk.ZN : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zxo4.ZW : Ljava/lang/String;
    //   1134: getstatic burp/Zrka.Zr : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zxzp.ZH : Ljava/lang/String;
    //   1171: getstatic burp/Zva.Zu : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zez0.Zp : Ljava/lang/String;
    //   1208: getstatic burp/Zgja.ZD : Ljava/lang/Object;
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
    //   1242: getstatic burp/Ztsj.ZU : Ljava/lang/String;
    //   1245: getstatic burp/Zmv9.Zw : Ljava/lang/Object;
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
    //   1279: getstatic burp/Ztzh.ZE : Ljava/lang/String;
    //   1282: getstatic burp/Zrn0.ZE : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zmuj.ZG : Ljava/lang/String;
    //   1319: getstatic burp/Zsts.Zu : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zbqk.ZZ : Ljava/lang/String;
    //   1362: ldc2_w 8682522807148012
    //   1365: invokestatic currentTimeMillis : ()J
    //   1368: lxor
    //   1369: lstore #5
    //   1371: lload #5
    //   1373: ldc2_w 25214903917
    //   1376: lmul
    //   1377: ldc2_w 11
    //   1380: ladd
    //   1381: ldc2_w 281474976710655
    //   1384: land
    //   1385: lstore #5
    //   1387: lload #5
    //   1389: bipush #32
    //   1391: lshl
    //   1392: lstore #7
    //   1394: lload #5
    //   1396: ldc2_w 25214903917
    //   1399: lmul
    //   1400: ldc2_w 11
    //   1403: ladd
    //   1404: ldc2_w 281474976710655
    //   1407: land
    //   1408: lstore #5
    //   1410: lload #7
    //   1412: lload #5
    //   1414: ladd
    //   1415: lstore #7
    //   1417: bipush #16
    //   1419: newarray byte
    //   1421: dup
    //   1422: iconst_0
    //   1423: bipush #48
    //   1425: bastore
    //   1426: dup
    //   1427: iconst_1
    //   1428: bipush #49
    //   1430: bastore
    //   1431: dup
    //   1432: iconst_2
    //   1433: bipush #50
    //   1435: bastore
    //   1436: dup
    //   1437: iconst_3
    //   1438: bipush #51
    //   1440: bastore
    //   1441: dup
    //   1442: iconst_4
    //   1443: bipush #52
    //   1445: bastore
    //   1446: dup
    //   1447: iconst_5
    //   1448: bipush #53
    //   1450: bastore
    //   1451: dup
    //   1452: bipush #6
    //   1454: bipush #54
    //   1456: bastore
    //   1457: dup
    //   1458: bipush #7
    //   1460: bipush #55
    //   1462: bastore
    //   1463: dup
    //   1464: bipush #8
    //   1466: bipush #56
    //   1468: bastore
    //   1469: dup
    //   1470: bipush #9
    //   1472: bipush #57
    //   1474: bastore
    //   1475: dup
    //   1476: bipush #10
    //   1478: bipush #97
    //   1480: bastore
    //   1481: dup
    //   1482: bipush #11
    //   1484: bipush #98
    //   1486: bastore
    //   1487: dup
    //   1488: bipush #12
    //   1490: bipush #99
    //   1492: bastore
    //   1493: dup
    //   1494: bipush #13
    //   1496: bipush #100
    //   1498: bastore
    //   1499: dup
    //   1500: bipush #14
    //   1502: bipush #101
    //   1504: bastore
    //   1505: dup
    //   1506: bipush #15
    //   1508: bipush #102
    //   1510: bastore
    //   1511: astore #9
    //   1513: bipush #64
    //   1515: newarray byte
    //   1517: astore #10
    //   1519: bipush #64
    //   1521: istore #11
    //   1523: bipush #16
    //   1525: istore #12
    //   1527: iload #12
    //   1529: iconst_1
    //   1530: isub
    //   1531: i2l
    //   1532: lstore #13
    //   1534: aload #10
    //   1536: iinc #11, -1
    //   1539: iload #11
    //   1541: aload #9
    //   1543: lload #7
    //   1545: lload #13
    //   1547: land
    //   1548: l2i
    //   1549: baload
    //   1550: bastore
    //   1551: lload #7
    //   1553: iconst_4
    //   1554: lushr
    //   1555: lstore #7
    //   1557: lload #7
    //   1559: lconst_0
    //   1560: lcmp
    //   1561: ifne -> 1534
    //   1564: bipush #64
    //   1566: iload #11
    //   1568: isub
    //   1569: newarray byte
    //   1571: astore #4
    //   1573: iconst_0
    //   1574: istore #15
    //   1576: iload #15
    //   1578: aload #4
    //   1580: arraylength
    //   1581: if_icmpge -> 1604
    //   1584: aload #4
    //   1586: iload #15
    //   1588: aload #10
    //   1590: iload #11
    //   1592: iload #15
    //   1594: iadd
    //   1595: baload
    //   1596: bastore
    //   1597: iinc #15, 1
    //   1600: iload_2
    //   1601: ifne -> 1576
    //   1604: aload #4
    //   1606: arraylength
    //   1607: bipush #10
    //   1609: if_icmplt -> 1371
    //   1612: new java/lang/StringBuilder
    //   1615: dup
    //   1616: invokespecial <init> : ()V
    //   1619: astore #4
    //   1621: iconst_0
    //   1622: istore #5
    //   1624: iload #5
    //   1626: bipush #32
    //   1628: if_icmpge -> 2995
    //   1631: iload #5
    //   1633: tableswitch default -> 2988, 0 -> 1776, 1 -> 1814, 2 -> 1852, 3 -> 1890, 4 -> 1928, 5 -> 1966, 6 -> 2004, 7 -> 2042, 8 -> 2080, 9 -> 2118, 10 -> 2156, 11 -> 2194, 12 -> 2232, 13 -> 2270, 14 -> 2308, 15 -> 2346, 16 -> 2384, 17 -> 2422, 18 -> 2460, 19 -> 2498, 20 -> 2536, 21 -> 2574, 22 -> 2612, 23 -> 2650, 24 -> 2688, 25 -> 2726, 26 -> 2764, 27 -> 2802, 28 -> 2840, 29 -> 2878, 30 -> 2916, 31 -> 2954
    //   1776: aload #4
    //   1778: getstatic burp/Zgre.Zj : Ljava/lang/String;
    //   1781: getstatic burp/Zb0s.Zv : Ljava/lang/Object;
    //   1784: checkcast java/math/BigInteger
    //   1787: invokevirtual intValue : ()I
    //   1790: bipush #32
    //   1792: irem
    //   1793: invokestatic abs : (I)I
    //   1796: invokevirtual charAt : (I)C
    //   1799: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1802: pop
    //   1803: iload_2
    //   1804: ifne -> 2988
    //   1807: goto -> 1814
    //   1810: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1813: athrow
    //   1814: aload #4
    //   1816: getstatic burp/Zgjj.Zi : Ljava/lang/String;
    //   1819: getstatic burp/Zkht.ZR : Ljava/lang/Object;
    //   1822: checkcast java/math/BigInteger
    //   1825: invokevirtual intValue : ()I
    //   1828: bipush #32
    //   1830: irem
    //   1831: invokestatic abs : (I)I
    //   1834: invokevirtual charAt : (I)C
    //   1837: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1840: pop
    //   1841: iload_2
    //   1842: ifne -> 2988
    //   1845: goto -> 1852
    //   1848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1851: athrow
    //   1852: aload #4
    //   1854: getstatic burp/Zg7w.ZI : Ljava/lang/String;
    //   1857: getstatic burp/Zsjo.ZB : Ljava/lang/Object;
    //   1860: checkcast java/math/BigInteger
    //   1863: invokevirtual intValue : ()I
    //   1866: bipush #32
    //   1868: irem
    //   1869: invokestatic abs : (I)I
    //   1872: invokevirtual charAt : (I)C
    //   1875: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1878: pop
    //   1879: iload_2
    //   1880: ifne -> 2988
    //   1883: goto -> 1890
    //   1886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1889: athrow
    //   1890: aload #4
    //   1892: getstatic burp/Zmgl.Zh : Ljava/lang/String;
    //   1895: getstatic burp/Zb0s.Zv : Ljava/lang/Object;
    //   1898: checkcast java/math/BigInteger
    //   1901: invokevirtual intValue : ()I
    //   1904: bipush #32
    //   1906: irem
    //   1907: invokestatic abs : (I)I
    //   1910: invokevirtual charAt : (I)C
    //   1913: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1916: pop
    //   1917: iload_2
    //   1918: ifne -> 2988
    //   1921: goto -> 1928
    //   1924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1927: athrow
    //   1928: aload #4
    //   1930: getstatic burp/Ztip.Z_ : Ljava/lang/String;
    //   1933: getstatic burp/Zva.Zu : Ljava/lang/Object;
    //   1936: checkcast java/math/BigInteger
    //   1939: invokevirtual intValue : ()I
    //   1942: bipush #32
    //   1944: irem
    //   1945: invokestatic abs : (I)I
    //   1948: invokevirtual charAt : (I)C
    //   1951: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1954: pop
    //   1955: iload_2
    //   1956: ifne -> 2988
    //   1959: goto -> 1966
    //   1962: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1965: athrow
    //   1966: aload #4
    //   1968: getstatic burp/Zb6a.ZY : Ljava/lang/String;
    //   1971: getstatic burp/Zxf8.Zz : Ljava/lang/Object;
    //   1974: checkcast java/math/BigInteger
    //   1977: invokevirtual intValue : ()I
    //   1980: bipush #32
    //   1982: irem
    //   1983: invokestatic abs : (I)I
    //   1986: invokevirtual charAt : (I)C
    //   1989: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1992: pop
    //   1993: iload_2
    //   1994: ifne -> 2988
    //   1997: goto -> 2004
    //   2000: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2003: athrow
    //   2004: aload #4
    //   2006: getstatic burp/Zlot.ZD : Ljava/lang/String;
    //   2009: getstatic burp/Zle6.ZM : Ljava/lang/Object;
    //   2012: checkcast java/math/BigInteger
    //   2015: invokevirtual intValue : ()I
    //   2018: bipush #32
    //   2020: irem
    //   2021: invokestatic abs : (I)I
    //   2024: invokevirtual charAt : (I)C
    //   2027: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2030: pop
    //   2031: iload_2
    //   2032: ifne -> 2988
    //   2035: goto -> 2042
    //   2038: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2041: athrow
    //   2042: aload #4
    //   2044: getstatic burp/Zgp_.Zn : Ljava/lang/String;
    //   2047: getstatic burp/Zg68.Zs : Ljava/lang/Object;
    //   2050: checkcast java/math/BigInteger
    //   2053: invokevirtual intValue : ()I
    //   2056: bipush #32
    //   2058: irem
    //   2059: invokestatic abs : (I)I
    //   2062: invokevirtual charAt : (I)C
    //   2065: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2068: pop
    //   2069: iload_2
    //   2070: ifne -> 2988
    //   2073: goto -> 2080
    //   2076: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2079: athrow
    //   2080: aload #4
    //   2082: getstatic burp/Zgjs.Zp : Ljava/lang/String;
    //   2085: getstatic burp/Zxzp.Zh : Ljava/lang/Object;
    //   2088: checkcast java/math/BigInteger
    //   2091: invokevirtual intValue : ()I
    //   2094: bipush #32
    //   2096: irem
    //   2097: invokestatic abs : (I)I
    //   2100: invokevirtual charAt : (I)C
    //   2103: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2106: pop
    //   2107: iload_2
    //   2108: ifne -> 2988
    //   2111: goto -> 2118
    //   2114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2117: athrow
    //   2118: aload #4
    //   2120: getstatic burp/Zez0.Zp : Ljava/lang/String;
    //   2123: getstatic burp/Zgrf.ZN : Ljava/lang/Object;
    //   2126: checkcast java/math/BigInteger
    //   2129: invokevirtual intValue : ()I
    //   2132: bipush #32
    //   2134: irem
    //   2135: invokestatic abs : (I)I
    //   2138: invokevirtual charAt : (I)C
    //   2141: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2144: pop
    //   2145: iload_2
    //   2146: ifne -> 2988
    //   2149: goto -> 2156
    //   2152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2155: athrow
    //   2156: aload #4
    //   2158: getstatic burp/Zzco.Zu : Ljava/lang/String;
    //   2161: getstatic burp/Zlkm.ZQ : Ljava/lang/Object;
    //   2164: checkcast java/math/BigInteger
    //   2167: invokevirtual intValue : ()I
    //   2170: bipush #32
    //   2172: irem
    //   2173: invokestatic abs : (I)I
    //   2176: invokevirtual charAt : (I)C
    //   2179: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2182: pop
    //   2183: iload_2
    //   2184: ifne -> 2988
    //   2187: goto -> 2194
    //   2190: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2193: athrow
    //   2194: aload #4
    //   2196: getstatic burp/Zkk2.ZI : Ljava/lang/String;
    //   2199: getstatic burp/Zva.Zu : Ljava/lang/Object;
    //   2202: checkcast java/math/BigInteger
    //   2205: invokevirtual intValue : ()I
    //   2208: bipush #32
    //   2210: irem
    //   2211: invokestatic abs : (I)I
    //   2214: invokevirtual charAt : (I)C
    //   2217: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2220: pop
    //   2221: iload_2
    //   2222: ifne -> 2988
    //   2225: goto -> 2232
    //   2228: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2231: athrow
    //   2232: aload #4
    //   2234: getstatic burp/Zlbt.ZE : Ljava/lang/String;
    //   2237: getstatic burp/Ze_0.ZY : Ljava/lang/Object;
    //   2240: checkcast java/math/BigInteger
    //   2243: invokevirtual intValue : ()I
    //   2246: bipush #32
    //   2248: irem
    //   2249: invokestatic abs : (I)I
    //   2252: invokevirtual charAt : (I)C
    //   2255: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2258: pop
    //   2259: iload_2
    //   2260: ifne -> 2988
    //   2263: goto -> 2270
    //   2266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2269: athrow
    //   2270: aload #4
    //   2272: getstatic burp/Zkqx.Ze : Ljava/lang/String;
    //   2275: getstatic burp/Zkqx.ZW : Ljava/lang/Object;
    //   2278: checkcast java/math/BigInteger
    //   2281: invokevirtual intValue : ()I
    //   2284: bipush #32
    //   2286: irem
    //   2287: invokestatic abs : (I)I
    //   2290: invokevirtual charAt : (I)C
    //   2293: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2296: pop
    //   2297: iload_2
    //   2298: ifne -> 2988
    //   2301: goto -> 2308
    //   2304: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2307: athrow
    //   2308: aload #4
    //   2310: getstatic burp/Ze_0.Zi : Ljava/lang/String;
    //   2313: getstatic burp/Zbj.ZY : Ljava/lang/Object;
    //   2316: checkcast java/math/BigInteger
    //   2319: invokevirtual intValue : ()I
    //   2322: bipush #32
    //   2324: irem
    //   2325: invokestatic abs : (I)I
    //   2328: invokevirtual charAt : (I)C
    //   2331: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2334: pop
    //   2335: iload_2
    //   2336: ifne -> 2988
    //   2339: goto -> 2346
    //   2342: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2345: athrow
    //   2346: aload #4
    //   2348: getstatic burp/Zxc.Zx : Ljava/lang/String;
    //   2351: getstatic burp/Zgyc.ZT : Ljava/lang/Object;
    //   2354: checkcast java/math/BigInteger
    //   2357: invokevirtual intValue : ()I
    //   2360: bipush #32
    //   2362: irem
    //   2363: invokestatic abs : (I)I
    //   2366: invokevirtual charAt : (I)C
    //   2369: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2372: pop
    //   2373: iload_2
    //   2374: ifne -> 2988
    //   2377: goto -> 2384
    //   2380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2383: athrow
    //   2384: aload #4
    //   2386: getstatic burp/Zxo4.ZW : Ljava/lang/String;
    //   2389: getstatic burp/Zbj.ZY : Ljava/lang/Object;
    //   2392: checkcast java/math/BigInteger
    //   2395: invokevirtual intValue : ()I
    //   2398: bipush #32
    //   2400: irem
    //   2401: invokestatic abs : (I)I
    //   2404: invokevirtual charAt : (I)C
    //   2407: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2410: pop
    //   2411: iload_2
    //   2412: ifne -> 2988
    //   2415: goto -> 2422
    //   2418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2421: athrow
    //   2422: aload #4
    //   2424: getstatic burp/Zsjo.Zu : Ljava/lang/String;
    //   2427: getstatic burp/Zlbt.ZF : Ljava/lang/Object;
    //   2430: checkcast java/math/BigInteger
    //   2433: invokevirtual intValue : ()I
    //   2436: bipush #32
    //   2438: irem
    //   2439: invokestatic abs : (I)I
    //   2442: invokevirtual charAt : (I)C
    //   2445: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2448: pop
    //   2449: iload_2
    //   2450: ifne -> 2988
    //   2453: goto -> 2460
    //   2456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2459: athrow
    //   2460: aload #4
    //   2462: getstatic burp/Zk88.ZZ : Ljava/lang/String;
    //   2465: getstatic burp/Zro2.Zu : Ljava/lang/Object;
    //   2468: checkcast java/math/BigInteger
    //   2471: invokevirtual intValue : ()I
    //   2474: bipush #32
    //   2476: irem
    //   2477: invokestatic abs : (I)I
    //   2480: invokevirtual charAt : (I)C
    //   2483: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2486: pop
    //   2487: iload_2
    //   2488: ifne -> 2988
    //   2491: goto -> 2498
    //   2494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2497: athrow
    //   2498: aload #4
    //   2500: getstatic burp/Zlot.ZD : Ljava/lang/String;
    //   2503: getstatic burp/Zmu6.Zb : Ljava/lang/Object;
    //   2506: checkcast java/math/BigInteger
    //   2509: invokevirtual intValue : ()I
    //   2512: bipush #32
    //   2514: irem
    //   2515: invokestatic abs : (I)I
    //   2518: invokevirtual charAt : (I)C
    //   2521: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2524: pop
    //   2525: iload_2
    //   2526: ifne -> 2988
    //   2529: goto -> 2536
    //   2532: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2535: athrow
    //   2536: aload #4
    //   2538: getstatic burp/Zrpm.ZG : Ljava/lang/String;
    //   2541: getstatic burp/Zva.Zu : Ljava/lang/Object;
    //   2544: checkcast java/math/BigInteger
    //   2547: invokevirtual intValue : ()I
    //   2550: bipush #32
    //   2552: irem
    //   2553: invokestatic abs : (I)I
    //   2556: invokevirtual charAt : (I)C
    //   2559: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2562: pop
    //   2563: iload_2
    //   2564: ifne -> 2988
    //   2567: goto -> 2574
    //   2570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2573: athrow
    //   2574: aload #4
    //   2576: getstatic burp/Zgds.ZA : Ljava/lang/String;
    //   2579: getstatic burp/Zgp_.Zm : Ljava/lang/Object;
    //   2582: checkcast java/math/BigInteger
    //   2585: invokevirtual intValue : ()I
    //   2588: bipush #32
    //   2590: irem
    //   2591: invokestatic abs : (I)I
    //   2594: invokevirtual charAt : (I)C
    //   2597: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2600: pop
    //   2601: iload_2
    //   2602: ifne -> 2988
    //   2605: goto -> 2612
    //   2608: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2611: athrow
    //   2612: aload #4
    //   2614: getstatic burp/Zb2p.ZV : Ljava/lang/String;
    //   2617: getstatic burp/Zkq9.Ze : Ljava/lang/Object;
    //   2620: checkcast java/math/BigInteger
    //   2623: invokevirtual intValue : ()I
    //   2626: bipush #32
    //   2628: irem
    //   2629: invokestatic abs : (I)I
    //   2632: invokevirtual charAt : (I)C
    //   2635: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2638: pop
    //   2639: iload_2
    //   2640: ifne -> 2988
    //   2643: goto -> 2650
    //   2646: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2649: athrow
    //   2650: aload #4
    //   2652: getstatic burp/Zmv9.Zm : Ljava/lang/String;
    //   2655: getstatic burp/Zeuz.Zp : Ljava/lang/Object;
    //   2658: checkcast java/math/BigInteger
    //   2661: invokevirtual intValue : ()I
    //   2664: bipush #32
    //   2666: irem
    //   2667: invokestatic abs : (I)I
    //   2670: invokevirtual charAt : (I)C
    //   2673: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2676: pop
    //   2677: iload_2
    //   2678: ifne -> 2988
    //   2681: goto -> 2688
    //   2684: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2687: athrow
    //   2688: aload #4
    //   2690: getstatic burp/Zg8v.Zd : Ljava/lang/String;
    //   2693: getstatic burp/Zl8i.ZY : Ljava/lang/Object;
    //   2696: checkcast java/math/BigInteger
    //   2699: invokevirtual intValue : ()I
    //   2702: bipush #32
    //   2704: irem
    //   2705: invokestatic abs : (I)I
    //   2708: invokevirtual charAt : (I)C
    //   2711: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2714: pop
    //   2715: iload_2
    //   2716: ifne -> 2988
    //   2719: goto -> 2726
    //   2722: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2725: athrow
    //   2726: aload #4
    //   2728: getstatic burp/Zkk2.ZI : Ljava/lang/String;
    //   2731: getstatic burp/Zgp_.Zm : Ljava/lang/Object;
    //   2734: checkcast java/math/BigInteger
    //   2737: invokevirtual intValue : ()I
    //   2740: bipush #32
    //   2742: irem
    //   2743: invokestatic abs : (I)I
    //   2746: invokevirtual charAt : (I)C
    //   2749: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2752: pop
    //   2753: iload_2
    //   2754: ifne -> 2988
    //   2757: goto -> 2764
    //   2760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2763: athrow
    //   2764: aload #4
    //   2766: getstatic burp/Zgly.Zb : Ljava/lang/String;
    //   2769: getstatic burp/Zb6a.Zz : Ljava/lang/Object;
    //   2772: checkcast java/math/BigInteger
    //   2775: invokevirtual intValue : ()I
    //   2778: bipush #32
    //   2780: irem
    //   2781: invokestatic abs : (I)I
    //   2784: invokevirtual charAt : (I)C
    //   2787: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2790: pop
    //   2791: iload_2
    //   2792: ifne -> 2988
    //   2795: goto -> 2802
    //   2798: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2801: athrow
    //   2802: aload #4
    //   2804: getstatic burp/Ze57.ZV : Ljava/lang/String;
    //   2807: getstatic burp/Zb0s.Zv : Ljava/lang/Object;
    //   2810: checkcast java/math/BigInteger
    //   2813: invokevirtual intValue : ()I
    //   2816: bipush #32
    //   2818: irem
    //   2819: invokestatic abs : (I)I
    //   2822: invokevirtual charAt : (I)C
    //   2825: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2828: pop
    //   2829: iload_2
    //   2830: ifne -> 2988
    //   2833: goto -> 2840
    //   2836: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2839: athrow
    //   2840: aload #4
    //   2842: getstatic burp/Zsow.Zh : Ljava/lang/String;
    //   2845: getstatic burp/Zkq9.Ze : Ljava/lang/Object;
    //   2848: checkcast java/math/BigInteger
    //   2851: invokevirtual intValue : ()I
    //   2854: bipush #32
    //   2856: irem
    //   2857: invokestatic abs : (I)I
    //   2860: invokevirtual charAt : (I)C
    //   2863: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2866: pop
    //   2867: iload_2
    //   2868: ifne -> 2988
    //   2871: goto -> 2878
    //   2874: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2877: athrow
    //   2878: aload #4
    //   2880: getstatic burp/Zb6a.ZY : Ljava/lang/String;
    //   2883: getstatic burp/Zxx4.Zo : Ljava/lang/Object;
    //   2886: checkcast java/math/BigInteger
    //   2889: invokevirtual intValue : ()I
    //   2892: bipush #32
    //   2894: irem
    //   2895: invokestatic abs : (I)I
    //   2898: invokevirtual charAt : (I)C
    //   2901: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2904: pop
    //   2905: iload_2
    //   2906: ifne -> 2988
    //   2909: goto -> 2916
    //   2912: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2915: athrow
    //   2916: aload #4
    //   2918: getstatic burp/Zb0s.Zi : Ljava/lang/String;
    //   2921: getstatic burp/Zbz_.ZU : Ljava/lang/Object;
    //   2924: checkcast java/math/BigInteger
    //   2927: invokevirtual intValue : ()I
    //   2930: bipush #32
    //   2932: irem
    //   2933: invokestatic abs : (I)I
    //   2936: invokevirtual charAt : (I)C
    //   2939: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2942: pop
    //   2943: iload_2
    //   2944: ifne -> 2988
    //   2947: goto -> 2954
    //   2950: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2953: athrow
    //   2954: aload #4
    //   2956: getstatic burp/Zxx4.Zq : Ljava/lang/String;
    //   2959: getstatic burp/Zmuj.ZH : Ljava/lang/Object;
    //   2962: checkcast java/math/BigInteger
    //   2965: invokevirtual intValue : ()I
    //   2968: bipush #32
    //   2970: irem
    //   2971: invokestatic abs : (I)I
    //   2974: invokevirtual charAt : (I)C
    //   2977: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2980: pop
    //   2981: goto -> 2988
    //   2984: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2987: athrow
    //   2988: iinc #5, 1
    //   2991: iload_2
    //   2992: ifne -> 1624
    //   2995: aload #4
    //   2997: invokevirtual toString : ()Ljava/lang/String;
    //   3000: putstatic burp/Zstf.ZZ : Ljava/lang/String;
    //   3003: sipush #4580
    //   3006: sipush #25378
    //   3009: invokestatic a : (II)Ljava/lang/String;
    //   3012: iconst_1
    //   3013: ldc burp/Zgkp
    //   3015: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3018: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3021: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3024: astore #5
    //   3026: aload #5
    //   3028: arraylength
    //   3029: istore #6
    //   3031: iconst_0
    //   3032: istore #7
    //   3034: iload #7
    //   3036: iload #6
    //   3038: if_icmpge -> 3176
    //   3041: aload #5
    //   3043: iload #7
    //   3045: aaload
    //   3046: astore #8
    //   3048: aload #8
    //   3050: invokevirtual getModifiers : ()I
    //   3053: invokestatic isStatic : (I)Z
    //   3056: ifne -> 3066
    //   3059: goto -> 3169
    //   3062: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3065: athrow
    //   3066: aload #8
    //   3068: invokevirtual getType : ()Ljava/lang/Class;
    //   3071: astore #9
    //   3073: aload #9
    //   3075: ifnull -> 3156
    //   3078: aload #9
    //   3080: invokevirtual isPrimitive : ()Z
    //   3083: ifne -> 3156
    //   3086: goto -> 3093
    //   3089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3092: athrow
    //   3093: aload #9
    //   3095: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3098: ifnull -> 3156
    //   3101: goto -> 3108
    //   3104: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3107: athrow
    //   3108: aload #9
    //   3110: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3113: invokevirtual getName : ()Ljava/lang/String;
    //   3116: ifnull -> 3156
    //   3119: goto -> 3126
    //   3122: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3125: athrow
    //   3126: aload #9
    //   3128: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3131: invokevirtual getName : ()Ljava/lang/String;
    //   3134: sipush #4579
    //   3137: sipush #13947
    //   3140: invokestatic a : (II)Ljava/lang/String;
    //   3143: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3146: ifne -> 3156
    //   3149: goto -> 3156
    //   3152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3155: athrow
    //   3156: aload #8
    //   3158: iconst_1
    //   3159: invokevirtual setAccessible : (Z)V
    //   3162: aload #8
    //   3164: aconst_null
    //   3165: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3168: pop
    //   3169: iinc #7, 1
    //   3172: iload_2
    //   3173: ifne -> 3034
    //   3176: sipush #4583
    //   3179: sipush #-30346
    //   3182: invokestatic a : (II)Ljava/lang/String;
    //   3185: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3188: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3191: astore #5
    //   3193: aload #5
    //   3195: arraylength
    //   3196: istore #6
    //   3198: iconst_0
    //   3199: istore #7
    //   3201: iload #7
    //   3203: iload #6
    //   3205: if_icmpge -> 3338
    //   3208: aload #5
    //   3210: iload #7
    //   3212: aaload
    //   3213: astore #8
    //   3215: aload #8
    //   3217: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3220: pop
    //   3221: aload #8
    //   3223: invokevirtual getModifiers : ()I
    //   3226: invokestatic isStatic : (I)Z
    //   3229: ifeq -> 3324
    //   3232: aload #8
    //   3234: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3237: arraylength
    //   3238: iconst_2
    //   3239: if_icmpne -> 3324
    //   3242: goto -> 3249
    //   3245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3248: athrow
    //   3249: aload #8
    //   3251: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3254: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   3257: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3260: ifeq -> 3324
    //   3263: goto -> 3270
    //   3266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3269: athrow
    //   3270: aload #8
    //   3272: iconst_1
    //   3273: invokevirtual setAccessible : (Z)V
    //   3276: aload #8
    //   3278: aconst_null
    //   3279: iconst_2
    //   3280: anewarray java/lang/Object
    //   3283: dup
    //   3284: iconst_0
    //   3285: aload_0
    //   3286: aastore
    //   3287: dup
    //   3288: iconst_1
    //   3289: aload_1
    //   3290: ifnonnull -> 3308
    //   3293: goto -> 3300
    //   3296: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3299: athrow
    //   3300: aload_1
    //   3301: goto -> 3315
    //   3304: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3307: athrow
    //   3308: aload_1
    //   3309: checkcast [B
    //   3312: invokevirtual clone : ()Ljava/lang/Object;
    //   3315: aastore
    //   3316: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3319: pop
    //   3320: iload_2
    //   3321: ifne -> 3338
    //   3324: iinc #7, 1
    //   3327: iload_2
    //   3328: ifne -> 3201
    //   3331: goto -> 3338
    //   3334: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3337: athrow
    //   3338: getstatic burp/Zbqk.ZZ : Ljava/lang/String;
    //   3341: getstatic burp/Zeuz.Zp : Ljava/lang/Object;
    //   3344: checkcast java/math/BigInteger
    //   3347: invokevirtual intValue : ()I
    //   3350: bipush #32
    //   3352: irem
    //   3353: invokestatic abs : (I)I
    //   3356: invokevirtual charAt : (I)C
    //   3359: getstatic burp/Zrpm.ZG : Ljava/lang/String;
    //   3362: getstatic burp/Ztzh.ZT : Ljava/lang/Object;
    //   3365: checkcast java/math/BigInteger
    //   3368: invokevirtual intValue : ()I
    //   3371: bipush #32
    //   3373: irem
    //   3374: invokestatic abs : (I)I
    //   3377: invokevirtual charAt : (I)C
    //   3380: if_icmple -> 3487
    //   3383: getstatic burp/Zf.Zd : Ljava/lang/String;
    //   3386: getstatic burp/Zva.Zu : Ljava/lang/Object;
    //   3389: checkcast java/math/BigInteger
    //   3392: invokevirtual intValue : ()I
    //   3395: bipush #32
    //   3397: irem
    //   3398: invokestatic abs : (I)I
    //   3401: invokevirtual charAt : (I)C
    //   3404: getstatic burp/Zxc.Zx : Ljava/lang/String;
    //   3407: getstatic burp/Zg7w.Zy : Ljava/lang/Object;
    //   3410: checkcast java/math/BigInteger
    //   3413: invokevirtual intValue : ()I
    //   3416: bipush #32
    //   3418: irem
    //   3419: invokestatic abs : (I)I
    //   3422: invokevirtual charAt : (I)C
    //   3425: if_icmple -> 3487
    //   3428: goto -> 3435
    //   3431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3434: athrow
    //   3435: getstatic burp/Zkht.Zd : Ljava/lang/String;
    //   3438: getstatic burp/Ztgj.ZY : Ljava/lang/Object;
    //   3441: checkcast java/math/BigInteger
    //   3444: invokevirtual intValue : ()I
    //   3447: bipush #32
    //   3449: irem
    //   3450: invokestatic abs : (I)I
    //   3453: invokevirtual charAt : (I)C
    //   3456: getstatic burp/Zxx4.Zq : Ljava/lang/String;
    //   3459: getstatic burp/Zxx4.Zo : Ljava/lang/Object;
    //   3462: checkcast java/math/BigInteger
    //   3465: invokevirtual intValue : ()I
    //   3468: bipush #32
    //   3470: irem
    //   3471: invokestatic abs : (I)I
    //   3474: invokevirtual charAt : (I)C
    //   3477: if_icmple -> 3495
    //   3480: goto -> 3487
    //   3483: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3486: athrow
    //   3487: iconst_1
    //   3488: goto -> 3496
    //   3491: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3494: athrow
    //   3495: iconst_0
    //   3496: ireturn
    //   3497: astore_3
    //   3498: new java/lang/Exception
    //   3501: dup
    //   3502: aload_3
    //   3503: invokevirtual getMessage : ()Ljava/lang/String;
    //   3506: invokespecial <init> : (Ljava/lang/String;)V
    //   3509: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3496	3497	java/lang/Throwable
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
    //   1631	1807	1810	java/lang/Throwable
    //   1776	1845	1848	java/lang/Throwable
    //   1814	1883	1886	java/lang/Throwable
    //   1852	1921	1924	java/lang/Throwable
    //   1890	1959	1962	java/lang/Throwable
    //   1928	1997	2000	java/lang/Throwable
    //   1966	2035	2038	java/lang/Throwable
    //   2004	2073	2076	java/lang/Throwable
    //   2042	2111	2114	java/lang/Throwable
    //   2080	2149	2152	java/lang/Throwable
    //   2118	2187	2190	java/lang/Throwable
    //   2156	2225	2228	java/lang/Throwable
    //   2194	2263	2266	java/lang/Throwable
    //   2232	2301	2304	java/lang/Throwable
    //   2270	2339	2342	java/lang/Throwable
    //   2308	2377	2380	java/lang/Throwable
    //   2346	2415	2418	java/lang/Throwable
    //   2384	2453	2456	java/lang/Throwable
    //   2422	2491	2494	java/lang/Throwable
    //   2460	2529	2532	java/lang/Throwable
    //   2498	2567	2570	java/lang/Throwable
    //   2536	2605	2608	java/lang/Throwable
    //   2574	2643	2646	java/lang/Throwable
    //   2612	2681	2684	java/lang/Throwable
    //   2650	2719	2722	java/lang/Throwable
    //   2688	2757	2760	java/lang/Throwable
    //   2726	2795	2798	java/lang/Throwable
    //   2764	2833	2836	java/lang/Throwable
    //   2802	2871	2874	java/lang/Throwable
    //   2840	2909	2912	java/lang/Throwable
    //   2878	2947	2950	java/lang/Throwable
    //   2916	2981	2984	java/lang/Throwable
    //   3048	3062	3062	java/lang/Throwable
    //   3073	3086	3089	java/lang/Throwable
    //   3078	3101	3104	java/lang/Throwable
    //   3093	3119	3122	java/lang/Throwable
    //   3108	3149	3152	java/lang/Throwable
    //   3215	3242	3245	java/lang/Throwable
    //   3232	3263	3266	java/lang/Throwable
    //   3249	3293	3296	java/lang/Throwable
    //   3270	3304	3304	java/lang/Throwable
    //   3315	3331	3334	java/lang/Throwable
    //   3338	3428	3431	java/lang/Throwable
    //   3383	3480	3483	java/lang/Throwable
    //   3435	3491	3491	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'MöUH«³ u46Ö0$_P@åõá¸ÛqWW0¼öJ?\\bü'õöç]5,ù3MV-©ÚÅ¶ù5/ENîö]MJé¬¦òz °-0o½T¿ s¡h¾ëí}â<Kîø5x¹¨Z\\r$\*Cx\\b"¾Å×V\\trI´òc\\f\\tÛÄ$.ÄH´Ð'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #105
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
    //   68: ldc '´ý6ö¯  ×& Õá>MUN3IÉ#ÚÞs%Øë4Î²¬£Ûÿr'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #60
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
    //   129: putstatic burp/Zls0.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zls0.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #73
    //   214: goto -> 243
    //   217: iconst_2
    //   218: goto -> 243
    //   221: bipush #110
    //   223: goto -> 243
    //   226: bipush #25
    //   228: goto -> 243
    //   231: bipush #13
    //   233: goto -> 243
    //   236: bipush #66
    //   238: goto -> 243
    //   241: bipush #104
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
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #91
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-78
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #77
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-55
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #90
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #25
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #87
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-128
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-62
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #24
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #68
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #69
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #86
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-55
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #9
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-74
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-116
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #87
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #118
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-35
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #47
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-59
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #58
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-84
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-56
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-15
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #21
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-9
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-128
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #17
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #43
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-11
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zls0.ZZ : Ljava/lang/Object;
    //   500: sipush #4576
    //   503: sipush #-2067
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zls0.ZI : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x11E1) & 0xFFFF;
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
      char c = 'Ü';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zls0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */