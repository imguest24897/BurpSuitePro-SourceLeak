package burp;

import java.math.BigInteger;

class Zbx4 extends ClassLoader {
  static String ZS;
  
  static Object Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZE(Object paramObject) {
    Ztq4.Zb = a(22212, 20403);
    Ztq4.ZA = new BigInteger(a(22218, -24877));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zxln.Zz.charAt(Math.abs(((BigInteger)Zgis.ZV).intValue() % 32)) <= Ztl6.Zb.charAt(Math.abs(((BigInteger)Zxln.ZJ).intValue() % 32))) {
          try {
            Zzac.ZP(Class.forName(a(22223, 22885)));
            if (bool)
              Zrs0.ZS(Class.forName(a(22216, 18150))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrs0.ZS(Class.forName(a(22216, 18150)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZH(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zz0b.ZD : Ljava/lang/String;
    //   172: getstatic burp/Zzc9.ZZ : Ljava/lang/Object;
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
    //   206: getstatic burp/Zrt3.Zu : Ljava/lang/String;
    //   209: getstatic burp/Zs4g.ZC : Ljava/lang/Object;
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
    //   243: getstatic burp/Zz7j.ZP : Ljava/lang/String;
    //   246: getstatic burp/Zz4j.Zu : Ljava/lang/Object;
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
    //   280: getstatic burp/Zrd2.Zj : Ljava/lang/String;
    //   283: getstatic burp/Zzmc.Zg : Ljava/lang/Object;
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
    //   317: getstatic burp/Zejz.Zd : Ljava/lang/String;
    //   320: getstatic burp/Zgpx.ZQ : Ljava/lang/Object;
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
    //   354: getstatic burp/Zt9f.Zg : Ljava/lang/String;
    //   357: getstatic burp/Zrnk.ZM : Ljava/lang/Object;
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
    //   391: getstatic burp/Zr_x.ZF : Ljava/lang/String;
    //   394: getstatic burp/Zrip.ZB : Ljava/lang/Object;
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
    //   428: getstatic burp/Zt9f.Zg : Ljava/lang/String;
    //   431: getstatic burp/Zl_f.ZI : Ljava/lang/Object;
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
    //   465: getstatic burp/Zld5.ZO : Ljava/lang/String;
    //   468: getstatic burp/Zzpm.Ze : Ljava/lang/Object;
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
    //   502: getstatic burp/Zg61.ZX : Ljava/lang/String;
    //   505: getstatic burp/Zg6z.ZS : Ljava/lang/Object;
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
    //   539: getstatic burp/Zxju.Zt : Ljava/lang/String;
    //   542: getstatic burp/Zg7e.Zr : Ljava/lang/Object;
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
    //   576: getstatic burp/Zmf2.ZK : Ljava/lang/String;
    //   579: getstatic burp/Zs0h.ZU : Ljava/lang/Object;
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
    //   613: getstatic burp/Zrnt.Zy : Ljava/lang/String;
    //   616: getstatic burp/Zmf2.Zx : Ljava/lang/Object;
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
    //   650: getstatic burp/Ztvy.Zk : Ljava/lang/String;
    //   653: getstatic burp/Zzk_.Zx : Ljava/lang/Object;
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
    //   687: getstatic burp/Zrzg.ZX : Ljava/lang/String;
    //   690: getstatic burp/Zxn4.Zx : Ljava/lang/Object;
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
    //   724: getstatic burp/Zr_x.ZF : Ljava/lang/String;
    //   727: getstatic burp/Zr36.Za : Ljava/lang/Object;
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
    //   761: getstatic burp/Zzef.Za : Ljava/lang/String;
    //   764: getstatic burp/Zso.ZA : Ljava/lang/Object;
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
    //   798: getstatic burp/Zmpx.ZC : Ljava/lang/String;
    //   801: getstatic burp/Zrl5.ZI : Ljava/lang/Object;
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
    //   835: getstatic burp/Zk9q.Zk : Ljava/lang/String;
    //   838: getstatic burp/Zb_1.ZK : Ljava/lang/Object;
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
    //   872: getstatic burp/Zk8f.ZV : Ljava/lang/String;
    //   875: getstatic burp/Zezi.ZQ : Ljava/lang/Object;
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
    //   909: getstatic burp/Zz3b.Zi : Ljava/lang/String;
    //   912: getstatic burp/Zes.Zx : Ljava/lang/Object;
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
    //   946: getstatic burp/Zr6c.Zf : Ljava/lang/String;
    //   949: getstatic burp/Zrh_.Zb : Ljava/lang/Object;
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
    //   983: getstatic burp/Zrfa.ZT : Ljava/lang/String;
    //   986: getstatic burp/Zzi_.Zf : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zepy.Zg : Ljava/lang/String;
    //   1023: getstatic burp/Zg0f.Zm : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zv8d.Zi : Ljava/lang/String;
    //   1060: getstatic burp/Zej8.Zu : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zxln.Zz : Ljava/lang/String;
    //   1097: getstatic burp/Zxln.ZJ : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zzi_.ZG : Ljava/lang/String;
    //   1134: getstatic burp/Zz4j.Zu : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zxan.ZJ : Ljava/lang/String;
    //   1171: getstatic burp/Zg0q.Zf : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zl_f.ZF : Ljava/lang/String;
    //   1208: getstatic burp/Zrye.Zx : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zlg2.ZL : Ljava/lang/String;
    //   1245: getstatic burp/Zry1.Zf : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zb_1.Zc : Ljava/lang/String;
    //   1282: getstatic burp/Zgei.ZN : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zs_m.Zt : Ljava/lang/String;
    //   1319: getstatic burp/Zgtd.Zo : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zrqe.ZB : Ljava/lang/String;
    //   1362: getstatic burp/Ztq2.Zj : Ljava/lang/Object;
    //   1365: checkcast java/math/BigInteger
    //   1368: invokevirtual toByteArray : ()[B
    //   1371: astore #4
    //   1373: aload #4
    //   1375: arraylength
    //   1376: bipush #8
    //   1378: iadd
    //   1379: bipush #6
    //   1381: ishr
    //   1382: iconst_1
    //   1383: iadd
    //   1384: bipush #16
    //   1386: imul
    //   1387: newarray int
    //   1389: astore #6
    //   1391: iconst_0
    //   1392: istore #7
    //   1394: iload #7
    //   1396: aload #4
    //   1398: arraylength
    //   1399: if_icmpge -> 1443
    //   1402: aload #4
    //   1404: iload #7
    //   1406: baload
    //   1407: sipush #255
    //   1410: iand
    //   1411: istore #8
    //   1413: aload #6
    //   1415: iload #7
    //   1417: iconst_2
    //   1418: ishr
    //   1419: dup2
    //   1420: iaload
    //   1421: iload #8
    //   1423: bipush #24
    //   1425: iload #7
    //   1427: iconst_4
    //   1428: irem
    //   1429: bipush #8
    //   1431: imul
    //   1432: isub
    //   1433: ishl
    //   1434: ior
    //   1435: iastore
    //   1436: iinc #7, 1
    //   1439: iload_2
    //   1440: ifeq -> 1394
    //   1443: aload #6
    //   1445: iload #7
    //   1447: iconst_2
    //   1448: ishr
    //   1449: dup2
    //   1450: iaload
    //   1451: sipush #128
    //   1454: bipush #24
    //   1456: iload #7
    //   1458: iconst_4
    //   1459: irem
    //   1460: bipush #8
    //   1462: imul
    //   1463: isub
    //   1464: ishl
    //   1465: ior
    //   1466: iastore
    //   1467: aload #6
    //   1469: aload #6
    //   1471: arraylength
    //   1472: iconst_1
    //   1473: isub
    //   1474: aload #4
    //   1476: arraylength
    //   1477: bipush #8
    //   1479: imul
    //   1480: iastore
    //   1481: bipush #80
    //   1483: newarray int
    //   1485: astore #8
    //   1487: ldc 1732584193
    //   1489: istore #9
    //   1491: ldc -271733879
    //   1493: istore #10
    //   1495: ldc -1732584194
    //   1497: istore #11
    //   1499: ldc 271733878
    //   1501: istore #12
    //   1503: ldc -1009589776
    //   1505: istore #13
    //   1507: iconst_0
    //   1508: istore #7
    //   1510: iload #7
    //   1512: aload #6
    //   1514: arraylength
    //   1515: if_icmpge -> 1837
    //   1518: iload #9
    //   1520: istore #14
    //   1522: iload #10
    //   1524: istore #15
    //   1526: iload #11
    //   1528: istore #16
    //   1530: iload #12
    //   1532: istore #17
    //   1534: iload #13
    //   1536: istore #18
    //   1538: iconst_0
    //   1539: istore #19
    //   1541: iload #19
    //   1543: bipush #80
    //   1545: if_icmpge -> 1795
    //   1548: iload #19
    //   1550: bipush #16
    //   1552: if_icmpge -> 1579
    //   1555: aload #8
    //   1557: iload #19
    //   1559: aload #6
    //   1561: iload #7
    //   1563: iload #19
    //   1565: iadd
    //   1566: iaload
    //   1567: iastore
    //   1568: iload_2
    //   1569: ifeq -> 1634
    //   1572: goto -> 1579
    //   1575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1578: athrow
    //   1579: aload #8
    //   1581: iload #19
    //   1583: iconst_3
    //   1584: isub
    //   1585: iaload
    //   1586: aload #8
    //   1588: iload #19
    //   1590: bipush #8
    //   1592: isub
    //   1593: iaload
    //   1594: ixor
    //   1595: aload #8
    //   1597: iload #19
    //   1599: bipush #14
    //   1601: isub
    //   1602: iaload
    //   1603: ixor
    //   1604: aload #8
    //   1606: iload #19
    //   1608: bipush #16
    //   1610: isub
    //   1611: iaload
    //   1612: ixor
    //   1613: istore #20
    //   1615: iload #20
    //   1617: iconst_1
    //   1618: ishl
    //   1619: iload #20
    //   1621: bipush #31
    //   1623: iushr
    //   1624: ior
    //   1625: istore #21
    //   1627: aload #8
    //   1629: iload #19
    //   1631: iload #21
    //   1633: iastore
    //   1634: iload #9
    //   1636: iconst_5
    //   1637: ishl
    //   1638: iload #9
    //   1640: bipush #27
    //   1642: iushr
    //   1643: ior
    //   1644: istore #20
    //   1646: iload #20
    //   1648: iload #13
    //   1650: iadd
    //   1651: aload #8
    //   1653: iload #19
    //   1655: iaload
    //   1656: iadd
    //   1657: iload #19
    //   1659: bipush #20
    //   1661: if_icmpge -> 1687
    //   1664: ldc 1518500249
    //   1666: iload #10
    //   1668: iload #11
    //   1670: iand
    //   1671: iload #10
    //   1673: iconst_m1
    //   1674: ixor
    //   1675: iload #12
    //   1677: iand
    //   1678: ior
    //   1679: iadd
    //   1680: goto -> 1757
    //   1683: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1686: athrow
    //   1687: iload #19
    //   1689: bipush #40
    //   1691: if_icmpge -> 1712
    //   1694: ldc 1859775393
    //   1696: iload #10
    //   1698: iload #11
    //   1700: ixor
    //   1701: iload #12
    //   1703: ixor
    //   1704: iadd
    //   1705: goto -> 1757
    //   1708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1711: athrow
    //   1712: iload #19
    //   1714: bipush #60
    //   1716: if_icmpge -> 1746
    //   1719: ldc -1894007588
    //   1721: iload #10
    //   1723: iload #11
    //   1725: iand
    //   1726: iload #10
    //   1728: iload #12
    //   1730: iand
    //   1731: ior
    //   1732: iload #11
    //   1734: iload #12
    //   1736: iand
    //   1737: ior
    //   1738: iadd
    //   1739: goto -> 1757
    //   1742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1745: athrow
    //   1746: ldc -899497514
    //   1748: iload #10
    //   1750: iload #11
    //   1752: ixor
    //   1753: iload #12
    //   1755: ixor
    //   1756: iadd
    //   1757: iadd
    //   1758: istore #21
    //   1760: iload #12
    //   1762: istore #13
    //   1764: iload #11
    //   1766: istore #12
    //   1768: iload #10
    //   1770: bipush #30
    //   1772: ishl
    //   1773: iload #10
    //   1775: iconst_2
    //   1776: iushr
    //   1777: ior
    //   1778: istore #11
    //   1780: iload #9
    //   1782: istore #10
    //   1784: iload #21
    //   1786: istore #9
    //   1788: iinc #19, 1
    //   1791: iload_2
    //   1792: ifeq -> 1541
    //   1795: iload #9
    //   1797: iload #14
    //   1799: iadd
    //   1800: istore #9
    //   1802: iload #10
    //   1804: iload #15
    //   1806: iadd
    //   1807: istore #10
    //   1809: iload #11
    //   1811: iload #16
    //   1813: iadd
    //   1814: istore #11
    //   1816: iload #12
    //   1818: iload #17
    //   1820: iadd
    //   1821: istore #12
    //   1823: iload #13
    //   1825: iload #18
    //   1827: iadd
    //   1828: istore #13
    //   1830: iinc #7, 16
    //   1833: iload_2
    //   1834: ifeq -> 1510
    //   1837: iconst_5
    //   1838: newarray int
    //   1840: dup
    //   1841: iconst_0
    //   1842: iload #9
    //   1844: iastore
    //   1845: dup
    //   1846: iconst_1
    //   1847: iload #10
    //   1849: iastore
    //   1850: dup
    //   1851: iconst_2
    //   1852: iload #11
    //   1854: iastore
    //   1855: dup
    //   1856: iconst_3
    //   1857: iload #12
    //   1859: iastore
    //   1860: dup
    //   1861: iconst_4
    //   1862: iload #13
    //   1864: iastore
    //   1865: astore #14
    //   1867: bipush #20
    //   1869: newarray byte
    //   1871: astore #15
    //   1873: iconst_0
    //   1874: istore #16
    //   1876: iload #16
    //   1878: bipush #20
    //   1880: if_icmpge -> 1921
    //   1883: aload #14
    //   1885: iload #16
    //   1887: iconst_4
    //   1888: idiv
    //   1889: iaload
    //   1890: istore #17
    //   1892: iconst_3
    //   1893: iload #16
    //   1895: iconst_4
    //   1896: irem
    //   1897: isub
    //   1898: bipush #8
    //   1900: imul
    //   1901: istore #18
    //   1903: aload #15
    //   1905: iload #16
    //   1907: iload #17
    //   1909: iload #18
    //   1911: iushr
    //   1912: i2b
    //   1913: bastore
    //   1914: iinc #16, 1
    //   1917: iload_2
    //   1918: ifeq -> 1876
    //   1921: aload #15
    //   1923: astore #5
    //   1925: sipush #22219
    //   1928: new java/math/BigInteger
    //   1931: dup
    //   1932: aload #5
    //   1934: invokespecial <init> : ([B)V
    //   1937: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1940: putstatic burp/Zb2u.ZY : Ljava/lang/Object;
    //   1943: sipush #15334
    //   1946: getstatic burp/Zebe.Zw : Ljava/lang/Object;
    //   1949: checkcast java/math/BigInteger
    //   1952: getstatic burp/Zea8.ZF : Ljava/lang/Object;
    //   1955: checkcast java/math/BigInteger
    //   1958: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1961: putstatic burp/Zr6c.ZG : Ljava/lang/Object;
    //   1964: invokestatic a : (II)Ljava/lang/String;
    //   1967: iconst_1
    //   1968: ldc burp/Zk8g
    //   1970: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1973: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1976: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1979: astore #4
    //   1981: aload #4
    //   1983: arraylength
    //   1984: istore #5
    //   1986: iconst_0
    //   1987: istore #6
    //   1989: iload #6
    //   1991: iload #5
    //   1993: if_icmpge -> 2131
    //   1996: aload #4
    //   1998: iload #6
    //   2000: aaload
    //   2001: astore #7
    //   2003: aload #7
    //   2005: invokevirtual getModifiers : ()I
    //   2008: invokestatic isStatic : (I)Z
    //   2011: ifne -> 2021
    //   2014: goto -> 2124
    //   2017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2020: athrow
    //   2021: aload #7
    //   2023: invokevirtual getType : ()Ljava/lang/Class;
    //   2026: astore #8
    //   2028: aload #8
    //   2030: ifnull -> 2111
    //   2033: aload #8
    //   2035: invokevirtual isPrimitive : ()Z
    //   2038: ifne -> 2111
    //   2041: goto -> 2048
    //   2044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2047: athrow
    //   2048: aload #8
    //   2050: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2053: ifnull -> 2111
    //   2056: goto -> 2063
    //   2059: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2062: athrow
    //   2063: aload #8
    //   2065: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2068: invokevirtual getName : ()Ljava/lang/String;
    //   2071: ifnull -> 2111
    //   2074: goto -> 2081
    //   2077: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2080: athrow
    //   2081: aload #8
    //   2083: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2086: invokevirtual getName : ()Ljava/lang/String;
    //   2089: sipush #22222
    //   2092: sipush #32613
    //   2095: invokestatic a : (II)Ljava/lang/String;
    //   2098: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2101: ifne -> 2111
    //   2104: goto -> 2111
    //   2107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2110: athrow
    //   2111: aload #7
    //   2113: iconst_1
    //   2114: invokevirtual setAccessible : (Z)V
    //   2117: aload #7
    //   2119: aconst_null
    //   2120: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2123: pop
    //   2124: iinc #6, 1
    //   2127: iload_2
    //   2128: ifeq -> 1989
    //   2131: sipush #22215
    //   2134: sipush #-7821
    //   2137: invokestatic a : (II)Ljava/lang/String;
    //   2140: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2143: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2146: astore #4
    //   2148: aload #4
    //   2150: arraylength
    //   2151: istore #5
    //   2153: iconst_0
    //   2154: istore #6
    //   2156: iload #6
    //   2158: iload #5
    //   2160: if_icmpge -> 2293
    //   2163: aload #4
    //   2165: iload #6
    //   2167: aaload
    //   2168: astore #7
    //   2170: aload #7
    //   2172: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2175: pop
    //   2176: aload #7
    //   2178: invokevirtual getModifiers : ()I
    //   2181: invokestatic isStatic : (I)Z
    //   2184: ifeq -> 2279
    //   2187: aload #7
    //   2189: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2192: arraylength
    //   2193: iconst_2
    //   2194: if_icmpne -> 2279
    //   2197: goto -> 2204
    //   2200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2203: athrow
    //   2204: aload #7
    //   2206: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2209: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2212: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2215: ifeq -> 2279
    //   2218: goto -> 2225
    //   2221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2224: athrow
    //   2225: aload #7
    //   2227: iconst_1
    //   2228: invokevirtual setAccessible : (Z)V
    //   2231: aload #7
    //   2233: aconst_null
    //   2234: iconst_2
    //   2235: anewarray java/lang/Object
    //   2238: dup
    //   2239: iconst_0
    //   2240: aload_0
    //   2241: aastore
    //   2242: dup
    //   2243: iconst_1
    //   2244: aload_1
    //   2245: ifnonnull -> 2263
    //   2248: goto -> 2255
    //   2251: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2254: athrow
    //   2255: aload_1
    //   2256: goto -> 2270
    //   2259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2262: athrow
    //   2263: aload_1
    //   2264: checkcast [B
    //   2267: invokevirtual clone : ()Ljava/lang/Object;
    //   2270: aastore
    //   2271: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2274: pop
    //   2275: iload_2
    //   2276: ifeq -> 2293
    //   2279: iinc #6, 1
    //   2282: iload_2
    //   2283: ifeq -> 2156
    //   2286: goto -> 2293
    //   2289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2292: athrow
    //   2293: new java/io/ByteArrayOutputStream
    //   2296: dup
    //   2297: invokespecial <init> : ()V
    //   2300: astore #4
    //   2302: sipush #22214
    //   2305: aload #4
    //   2307: sipush #202
    //   2310: invokevirtual write : (I)V
    //   2313: sipush #22032
    //   2316: aload #4
    //   2318: sipush #254
    //   2321: invokevirtual write : (I)V
    //   2324: aload #4
    //   2326: sipush #186
    //   2329: invokevirtual write : (I)V
    //   2332: aload #4
    //   2334: sipush #190
    //   2337: invokevirtual write : (I)V
    //   2340: aload #4
    //   2342: iconst_0
    //   2343: invokevirtual write : (I)V
    //   2346: aload #4
    //   2348: iconst_1
    //   2349: invokevirtual write : (I)V
    //   2352: aload #4
    //   2354: iconst_0
    //   2355: invokevirtual write : (I)V
    //   2358: aload #4
    //   2360: bipush #50
    //   2362: invokevirtual write : (I)V
    //   2365: aload #4
    //   2367: getstatic burp/Ze_0.ZY : Ljava/lang/Object;
    //   2370: checkcast java/math/BigInteger
    //   2373: invokevirtual toByteArray : ()[B
    //   2376: invokevirtual write : ([B)V
    //   2379: aload #4
    //   2381: getstatic burp/Zttj.ZF : Ljava/lang/Object;
    //   2384: checkcast java/math/BigInteger
    //   2387: invokevirtual toByteArray : ()[B
    //   2390: invokevirtual write : ([B)V
    //   2393: aload #4
    //   2395: getstatic burp/Zlfg.Zv : Ljava/lang/Object;
    //   2398: checkcast java/math/BigInteger
    //   2401: invokevirtual toByteArray : ()[B
    //   2404: invokevirtual write : ([B)V
    //   2407: aload #4
    //   2409: invokevirtual toByteArray : ()[B
    //   2412: astore #5
    //   2414: aconst_null
    //   2415: astore #6
    //   2417: invokestatic a : (II)Ljava/lang/String;
    //   2420: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2423: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2426: astore #7
    //   2428: aload #7
    //   2430: arraylength
    //   2431: istore #8
    //   2433: iconst_0
    //   2434: istore #9
    //   2436: iload #9
    //   2438: iload #8
    //   2440: if_icmpge -> 2568
    //   2443: aload #7
    //   2445: iload #9
    //   2447: aaload
    //   2448: astore #10
    //   2450: aload #10
    //   2452: invokevirtual getName : ()Ljava/lang/String;
    //   2455: sipush #22217
    //   2458: sipush #-305
    //   2461: invokestatic a : (II)Ljava/lang/String;
    //   2464: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2467: ifeq -> 2561
    //   2470: aload #10
    //   2472: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2475: astore #11
    //   2477: aload #11
    //   2479: arraylength
    //   2480: iconst_4
    //   2481: if_icmpeq -> 2491
    //   2484: goto -> 2561
    //   2487: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2490: athrow
    //   2491: aload #11
    //   2493: iconst_0
    //   2494: aaload
    //   2495: ldc java/lang/String
    //   2497: if_acmpeq -> 2507
    //   2500: goto -> 2561
    //   2503: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2506: athrow
    //   2507: aload #11
    //   2509: iconst_1
    //   2510: aaload
    //   2511: ldc [B
    //   2513: if_acmpeq -> 2523
    //   2516: goto -> 2561
    //   2519: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2522: athrow
    //   2523: aload #11
    //   2525: iconst_2
    //   2526: aaload
    //   2527: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   2530: if_acmpeq -> 2540
    //   2533: goto -> 2561
    //   2536: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2539: athrow
    //   2540: aload #11
    //   2542: iconst_3
    //   2543: aaload
    //   2544: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   2547: if_acmpeq -> 2557
    //   2550: goto -> 2561
    //   2553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2556: athrow
    //   2557: aload #10
    //   2559: astore #6
    //   2561: iinc #9, 1
    //   2564: iload_2
    //   2565: ifeq -> 2436
    //   2568: aload #6
    //   2570: iconst_1
    //   2571: invokevirtual setAccessible : (Z)V
    //   2574: ldc burp/Ztgv
    //   2576: iconst_0
    //   2577: anewarray java/lang/Class
    //   2580: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   2583: astore #7
    //   2585: aload #7
    //   2587: iconst_1
    //   2588: invokevirtual setAccessible : (Z)V
    //   2591: aload #6
    //   2593: aload #7
    //   2595: iconst_0
    //   2596: anewarray java/lang/Object
    //   2599: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   2602: iconst_4
    //   2603: anewarray java/lang/Object
    //   2606: dup
    //   2607: iconst_0
    //   2608: sipush #22220
    //   2611: sipush #-27442
    //   2614: invokestatic a : (II)Ljava/lang/String;
    //   2617: aastore
    //   2618: dup
    //   2619: iconst_1
    //   2620: aload #5
    //   2622: aastore
    //   2623: dup
    //   2624: iconst_2
    //   2625: iconst_0
    //   2626: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2629: aastore
    //   2630: dup
    //   2631: iconst_3
    //   2632: aload #5
    //   2634: arraylength
    //   2635: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2638: aastore
    //   2639: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2642: pop
    //   2643: goto -> 2648
    //   2646: astore #4
    //   2648: getstatic burp/Zmdi.ZA : Ljava/lang/String;
    //   2651: getstatic burp/Zzac.ZH : Ljava/lang/Object;
    //   2654: checkcast java/math/BigInteger
    //   2657: invokevirtual intValue : ()I
    //   2660: bipush #32
    //   2662: irem
    //   2663: invokestatic abs : (I)I
    //   2666: invokevirtual charAt : (I)C
    //   2669: getstatic burp/Zrd2.Zj : Ljava/lang/String;
    //   2672: getstatic burp/Zthx.ZH : Ljava/lang/Object;
    //   2675: checkcast java/math/BigInteger
    //   2678: invokevirtual intValue : ()I
    //   2681: bipush #32
    //   2683: irem
    //   2684: invokestatic abs : (I)I
    //   2687: invokevirtual charAt : (I)C
    //   2690: if_icmple -> 2805
    //   2693: getstatic burp/Zt8m.ZT : Ljava/lang/String;
    //   2696: getstatic burp/Zg4z.ZB : Ljava/lang/Object;
    //   2699: checkcast java/math/BigInteger
    //   2702: invokevirtual intValue : ()I
    //   2705: bipush #32
    //   2707: irem
    //   2708: invokestatic abs : (I)I
    //   2711: invokevirtual charAt : (I)C
    //   2714: getstatic burp/Zek4.Zo : Ljava/lang/String;
    //   2717: getstatic burp/Zz7j.ZR : Ljava/lang/Object;
    //   2720: checkcast java/math/BigInteger
    //   2723: invokevirtual intValue : ()I
    //   2726: bipush #32
    //   2728: irem
    //   2729: invokestatic abs : (I)I
    //   2732: invokevirtual charAt : (I)C
    //   2735: if_icmpgt -> 2805
    //   2738: goto -> 2745
    //   2741: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2744: athrow
    //   2745: getstatic burp/Zl_a.ZD : Ljava/lang/String;
    //   2748: getstatic burp/Zmz.ZW : Ljava/lang/Object;
    //   2751: checkcast java/math/BigInteger
    //   2754: invokevirtual intValue : ()I
    //   2757: bipush #32
    //   2759: irem
    //   2760: invokestatic abs : (I)I
    //   2763: invokevirtual charAt : (I)C
    //   2766: getstatic burp/Zt81.ZL : Ljava/lang/String;
    //   2769: getstatic burp/Zzre.ZE : Ljava/lang/Object;
    //   2772: checkcast java/math/BigInteger
    //   2775: invokevirtual intValue : ()I
    //   2778: bipush #32
    //   2780: irem
    //   2781: invokestatic abs : (I)I
    //   2784: invokevirtual charAt : (I)C
    //   2787: if_icmpgt -> 2805
    //   2790: goto -> 2797
    //   2793: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2796: athrow
    //   2797: iconst_1
    //   2798: goto -> 2806
    //   2801: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2804: athrow
    //   2805: iconst_0
    //   2806: ireturn
    //   2807: astore_3
    //   2808: new java/lang/Exception
    //   2811: dup
    //   2812: aload_3
    //   2813: invokevirtual getMessage : ()Ljava/lang/String;
    //   2816: invokespecial <init> : (Ljava/lang/String;)V
    //   2819: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2806	2807	java/lang/Throwable
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
    //   1548	1572	1575	java/lang/Throwable
    //   1646	1683	1683	java/lang/Throwable
    //   1687	1708	1708	java/lang/Throwable
    //   1712	1742	1742	java/lang/Throwable
    //   2003	2017	2017	java/lang/Throwable
    //   2028	2041	2044	java/lang/Throwable
    //   2033	2056	2059	java/lang/Throwable
    //   2048	2074	2077	java/lang/Throwable
    //   2063	2104	2107	java/lang/Throwable
    //   2170	2197	2200	java/lang/Throwable
    //   2187	2218	2221	java/lang/Throwable
    //   2204	2248	2251	java/lang/Throwable
    //   2225	2259	2259	java/lang/Throwable
    //   2270	2286	2289	java/lang/Throwable
    //   2293	2643	2646	java/lang/Throwable
    //   2477	2487	2487	java/lang/Throwable
    //   2491	2503	2503	java/lang/Throwable
    //   2507	2519	2519	java/lang/Throwable
    //   2523	2536	2536	java/lang/Throwable
    //   2540	2553	2553	java/lang/Throwable
    //   2648	2738	2741	java/lang/Throwable
    //   2693	2790	2793	java/lang/Throwable
    //   2745	2801	2801	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'üä\\tÃÈ~Ò8)|×\\b¦:¯A>ô¹¹ ¡(Yr,Ù½e]s®¡x±ínÁÑTÈêÏ_:óoYOÐ8Lµ±¸@,\\f/\\n1°¾¶P}²R+Fjhwdì,7QC0IÙe ª¤¦0f/áÄ¹F'Ôlè¿íü·Úf ò^m:ø\\tðWeìgj'T\\tÎ<¢Çôbå¯¡+K%Ü7uÁØ¹TÅÿ9ßïJyIz pÿk\\tîJ¦O©µ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #32
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc '® 8Þ©­jSGøROÃAçäo­squâºð5M%9`p´ÀÐ=ûÆaÛ#;©Ñ@«¥ÉnéRã7Ò!ûL3æ ¡#.ÃH\\f:ÁóT»#Ì{þí¾Ô'£<QÚ7«'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #32
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #105
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zbx4.a : [Ljava/lang/String;
    //   131: bipush #12
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbx4.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #96
    //   214: goto -> 244
    //   217: bipush #37
    //   219: goto -> 244
    //   222: bipush #15
    //   224: goto -> 244
    //   227: bipush #45
    //   229: goto -> 244
    //   232: bipush #28
    //   234: goto -> 244
    //   237: bipush #82
    //   239: goto -> 244
    //   242: bipush #88
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: sipush #22221
    //   303: sipush #23702
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zbx4.ZS : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #22213
    //   319: sipush #29077
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zbx4.Zw : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x56CE) & 0xFFFF;
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
      char c = 'Ð';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbx4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */