package burp;

import java.math.BigInteger;

class Zg8 extends ClassLoader {
  static String ZE;
  
  static Object ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZV(Object paramObject) {
    Zmpv.Zb = a(-10839, 24632);
    Zmpv.ZI = new BigInteger(a(-10838, 23030));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zxz_.Zb.charAt(Math.abs(((BigInteger)Zsji.Zg).intValue() % 32)) > Zx0t.Ze.charAt(Math.abs(((BigInteger)Zr3j.ZT).intValue() % 32))) {
          try {
            Zt7k.Zp(Class.forName(a(-10834, -17804)));
            if (!bool)
              Zgb9.ZG(Class.forName(a(-10840, 19388))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgb9.ZG(Class.forName(a(-10840, 19388)));
    } catch (Throwable throwable) {}
  }
  
  static void Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZQ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zmjw.ZB : Ljava/lang/String;
    //   172: getstatic burp/Zssb.ZW : Ljava/lang/Object;
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
    //   206: getstatic burp/Zkup.Zr : Ljava/lang/String;
    //   209: getstatic burp/Zmpv.ZI : Ljava/lang/Object;
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
    //   243: getstatic burp/Zl55.Zp : Ljava/lang/String;
    //   246: getstatic burp/Zb9d.Ze : Ljava/lang/Object;
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
    //   280: getstatic burp/Zgk1.Zv : Ljava/lang/String;
    //   283: getstatic burp/Zm7y.Zr : Ljava/lang/Object;
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
    //   317: getstatic burp/Zz4r.Zq : Ljava/lang/String;
    //   320: getstatic burp/Zr_w.ZK : Ljava/lang/Object;
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
    //   354: getstatic burp/Zxti.ZD : Ljava/lang/String;
    //   357: getstatic burp/Zm7y.Zr : Ljava/lang/Object;
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
    //   391: getstatic burp/Zzi3.ZS : Ljava/lang/String;
    //   394: getstatic burp/Ze6t.Zu : Ljava/lang/Object;
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
    //   428: getstatic burp/Zr_z.ZE : Ljava/lang/String;
    //   431: getstatic burp/Zzi3.ZJ : Ljava/lang/Object;
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
    //   465: getstatic burp/Zlqq.Za : Ljava/lang/String;
    //   468: getstatic burp/Zmpv.ZI : Ljava/lang/Object;
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
    //   502: getstatic burp/Zxzt.ZG : Ljava/lang/String;
    //   505: getstatic burp/Zbf9.ZC : Ljava/lang/Object;
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
    //   539: getstatic burp/Zkw.ZU : Ljava/lang/String;
    //   542: getstatic burp/Zm3s.ZW : Ljava/lang/Object;
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
    //   576: getstatic burp/Zrqd.Zk : Ljava/lang/String;
    //   579: getstatic burp/Zluk.Zz : Ljava/lang/Object;
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
    //   613: getstatic burp/Zk52.ZL : Ljava/lang/String;
    //   616: getstatic burp/Zep1.ZW : Ljava/lang/Object;
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
    //   650: getstatic burp/Zbu6.ZQ : Ljava/lang/String;
    //   653: getstatic burp/Zts_.ZH : Ljava/lang/Object;
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
    //   687: getstatic burp/Zx0t.Ze : Ljava/lang/String;
    //   690: getstatic burp/Zltp.ZT : Ljava/lang/Object;
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
    //   724: getstatic burp/Zmpv.Zb : Ljava/lang/String;
    //   727: getstatic burp/Zm3s.ZW : Ljava/lang/Object;
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
    //   761: getstatic burp/Zlqq.Za : Ljava/lang/String;
    //   764: getstatic burp/Zm6g.ZO : Ljava/lang/Object;
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
    //   798: getstatic burp/Zg_i.ZW : Ljava/lang/String;
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
    //   835: getstatic burp/Zrug.Zq : Ljava/lang/String;
    //   838: getstatic burp/Zr64.ZN : Ljava/lang/Object;
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
    //   872: getstatic burp/Zg_i.ZW : Ljava/lang/String;
    //   875: getstatic burp/Zrqd.Zi : Ljava/lang/Object;
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
    //   909: getstatic burp/Zg_i.ZW : Ljava/lang/String;
    //   912: getstatic burp/Ze6t.Zu : Ljava/lang/Object;
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
    //   946: getstatic burp/Zk52.ZL : Ljava/lang/String;
    //   949: getstatic burp/Zmwx.Zk : Ljava/lang/Object;
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
    //   983: getstatic burp/Ztgt.ZQ : Ljava/lang/String;
    //   986: getstatic burp/Zbf9.ZC : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zgz1.Zs : Ljava/lang/String;
    //   1023: getstatic burp/Zr_w.ZK : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zkup.Zr : Ljava/lang/String;
    //   1060: getstatic burp/Zeoa.ZF : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zrqd.Zk : Ljava/lang/String;
    //   1097: getstatic burp/Zmou.ZT : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zstq.ZL : Ljava/lang/String;
    //   1134: getstatic burp/Zkw.ZY : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zrqd.Zk : Ljava/lang/String;
    //   1171: getstatic burp/Zl8l.ZJ : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zm3s.Ze : Ljava/lang/String;
    //   1208: getstatic burp/Zgl4.Zb : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zl55.Zp : Ljava/lang/String;
    //   1245: getstatic burp/Zb9d.Ze : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zgqp.ZA : Ljava/lang/String;
    //   1282: getstatic burp/Zs4v.ZB : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zk7b.ZE : Ljava/lang/String;
    //   1319: getstatic burp/Zssb.ZW : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zgz2.ZI : Ljava/lang/String;
    //   1362: sipush #-10833
    //   1365: getstatic burp/Zl55.ZZ : Ljava/lang/Object;
    //   1368: checkcast java/math/BigInteger
    //   1371: getstatic burp/Zb1.Zf : Ljava/lang/Object;
    //   1374: checkcast java/math/BigInteger
    //   1377: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1380: putstatic burp/Zgl4.Zb : Ljava/lang/Object;
    //   1383: sipush #-23447
    //   1386: getstatic burp/Zltp.ZT : Ljava/lang/Object;
    //   1389: checkcast java/math/BigInteger
    //   1392: getstatic burp/Zebu.Zu : Ljava/lang/Object;
    //   1395: checkcast java/math/BigInteger
    //   1398: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1401: putstatic burp/Zmpv.ZI : Ljava/lang/Object;
    //   1404: invokestatic a : (II)Ljava/lang/String;
    //   1407: iconst_1
    //   1408: ldc burp/Ze3t
    //   1410: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1413: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1416: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1419: astore #4
    //   1421: aload #4
    //   1423: arraylength
    //   1424: istore #5
    //   1426: iconst_0
    //   1427: istore #6
    //   1429: iload #6
    //   1431: iload #5
    //   1433: if_icmpge -> 1571
    //   1436: aload #4
    //   1438: iload #6
    //   1440: aaload
    //   1441: astore #7
    //   1443: aload #7
    //   1445: invokevirtual getModifiers : ()I
    //   1448: invokestatic isStatic : (I)Z
    //   1451: ifne -> 1461
    //   1454: goto -> 1564
    //   1457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1460: athrow
    //   1461: aload #7
    //   1463: invokevirtual getType : ()Ljava/lang/Class;
    //   1466: astore #8
    //   1468: aload #8
    //   1470: ifnull -> 1551
    //   1473: aload #8
    //   1475: invokevirtual isPrimitive : ()Z
    //   1478: ifne -> 1551
    //   1481: goto -> 1488
    //   1484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1487: athrow
    //   1488: aload #8
    //   1490: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1493: ifnull -> 1551
    //   1496: goto -> 1503
    //   1499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1502: athrow
    //   1503: aload #8
    //   1505: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1508: invokevirtual getName : ()Ljava/lang/String;
    //   1511: ifnull -> 1551
    //   1514: goto -> 1521
    //   1517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1520: athrow
    //   1521: aload #8
    //   1523: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1526: invokevirtual getName : ()Ljava/lang/String;
    //   1529: sipush #-10848
    //   1532: sipush #7430
    //   1535: invokestatic a : (II)Ljava/lang/String;
    //   1538: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1541: ifne -> 1551
    //   1544: goto -> 1551
    //   1547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1550: athrow
    //   1551: aload #7
    //   1553: iconst_1
    //   1554: invokevirtual setAccessible : (Z)V
    //   1557: aload #7
    //   1559: aconst_null
    //   1560: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1563: pop
    //   1564: iinc #6, 1
    //   1567: iload_2
    //   1568: ifeq -> 1429
    //   1571: sipush #-10847
    //   1574: sipush #10717
    //   1577: invokestatic a : (II)Ljava/lang/String;
    //   1580: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1583: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1586: astore #4
    //   1588: aload #4
    //   1590: arraylength
    //   1591: istore #5
    //   1593: iconst_0
    //   1594: istore #6
    //   1596: iload #6
    //   1598: iload #5
    //   1600: if_icmpge -> 1733
    //   1603: aload #4
    //   1605: iload #6
    //   1607: aaload
    //   1608: astore #7
    //   1610: aload #7
    //   1612: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1615: pop
    //   1616: aload #7
    //   1618: invokevirtual getModifiers : ()I
    //   1621: invokestatic isStatic : (I)Z
    //   1624: ifeq -> 1719
    //   1627: aload #7
    //   1629: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1632: arraylength
    //   1633: iconst_2
    //   1634: if_icmpne -> 1719
    //   1637: goto -> 1644
    //   1640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1643: athrow
    //   1644: aload #7
    //   1646: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1649: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1652: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1655: ifeq -> 1719
    //   1658: goto -> 1665
    //   1661: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1664: athrow
    //   1665: aload #7
    //   1667: iconst_1
    //   1668: invokevirtual setAccessible : (Z)V
    //   1671: aload #7
    //   1673: aconst_null
    //   1674: iconst_2
    //   1675: anewarray java/lang/Object
    //   1678: dup
    //   1679: iconst_0
    //   1680: aload_0
    //   1681: aastore
    //   1682: dup
    //   1683: iconst_1
    //   1684: aload_1
    //   1685: ifnonnull -> 1703
    //   1688: goto -> 1695
    //   1691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1694: athrow
    //   1695: aload_1
    //   1696: goto -> 1710
    //   1699: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1702: athrow
    //   1703: aload_1
    //   1704: checkcast [B
    //   1707: invokevirtual clone : ()Ljava/lang/Object;
    //   1710: aastore
    //   1711: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1714: pop
    //   1715: iload_2
    //   1716: ifeq -> 1733
    //   1719: iinc #6, 1
    //   1722: iload_2
    //   1723: ifeq -> 1596
    //   1726: goto -> 1733
    //   1729: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1732: athrow
    //   1733: new java/io/ByteArrayOutputStream
    //   1736: dup
    //   1737: invokespecial <init> : ()V
    //   1740: astore #4
    //   1742: getstatic burp/Zgk1.Zv : Ljava/lang/String;
    //   1745: astore #5
    //   1747: iconst_0
    //   1748: istore #6
    //   1750: iload #6
    //   1752: aload #5
    //   1754: invokevirtual length : ()I
    //   1757: if_icmpge -> 1788
    //   1760: aload #4
    //   1762: aload #5
    //   1764: iload #6
    //   1766: iload #6
    //   1768: iconst_2
    //   1769: iadd
    //   1770: invokevirtual substring : (II)Ljava/lang/String;
    //   1773: bipush #16
    //   1775: invokestatic parseInt : (Ljava/lang/String;I)I
    //   1778: invokevirtual write : (I)V
    //   1781: iinc #6, 2
    //   1784: iload_2
    //   1785: ifeq -> 1750
    //   1788: aload #4
    //   1790: invokevirtual toByteArray : ()[B
    //   1793: astore #6
    //   1795: getstatic burp/Zgl4.Zb : Ljava/lang/Object;
    //   1798: checkcast java/math/BigInteger
    //   1801: invokevirtual toByteArray : ()[B
    //   1804: astore #7
    //   1806: sipush #256
    //   1809: newarray byte
    //   1811: astore #9
    //   1813: sipush #256
    //   1816: newarray int
    //   1818: astore #10
    //   1820: sipush #256
    //   1823: newarray int
    //   1825: astore #11
    //   1827: sipush #256
    //   1830: newarray int
    //   1832: astore #12
    //   1834: sipush #256
    //   1837: newarray int
    //   1839: astore #13
    //   1841: bipush #10
    //   1843: newarray int
    //   1845: astore #14
    //   1847: sipush #283
    //   1850: istore #15
    //   1852: iconst_0
    //   1853: istore #17
    //   1855: iload #17
    //   1857: sipush #256
    //   1860: if_icmpge -> 2094
    //   1863: sipush #-10846
    //   1866: sipush #-12568
    //   1869: invokestatic a : (II)Ljava/lang/String;
    //   1872: iload #17
    //   1874: iconst_1
    //   1875: iushr
    //   1876: invokevirtual charAt : (I)C
    //   1879: istore #26
    //   1881: iload #17
    //   1883: iconst_1
    //   1884: iand
    //   1885: ifne -> 1900
    //   1888: iload #26
    //   1890: bipush #8
    //   1892: iushr
    //   1893: goto -> 1902
    //   1896: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1899: athrow
    //   1900: iload #26
    //   1902: i2b
    //   1903: sipush #255
    //   1906: iand
    //   1907: istore #16
    //   1909: iload #17
    //   1911: iconst_1
    //   1912: ishl
    //   1913: istore #18
    //   1915: iload #18
    //   1917: sipush #256
    //   1920: if_icmplt -> 1930
    //   1923: iload #18
    //   1925: iload #15
    //   1927: ixor
    //   1928: istore #18
    //   1930: iload #18
    //   1932: iconst_1
    //   1933: ishl
    //   1934: istore #19
    //   1936: iload #19
    //   1938: sipush #256
    //   1941: if_icmplt -> 1951
    //   1944: iload #19
    //   1946: iload #15
    //   1948: ixor
    //   1949: istore #19
    //   1951: iload #19
    //   1953: iconst_1
    //   1954: ishl
    //   1955: istore #20
    //   1957: iload #20
    //   1959: sipush #256
    //   1962: if_icmplt -> 1972
    //   1965: iload #20
    //   1967: iload #15
    //   1969: ixor
    //   1970: istore #20
    //   1972: iload #20
    //   1974: iload #17
    //   1976: ixor
    //   1977: istore #21
    //   1979: iload #21
    //   1981: iload #18
    //   1983: ixor
    //   1984: istore #22
    //   1986: iload #21
    //   1988: iload #19
    //   1990: ixor
    //   1991: istore #23
    //   1993: iload #20
    //   1995: iload #19
    //   1997: ixor
    //   1998: iload #18
    //   2000: ixor
    //   2001: istore #24
    //   2003: aload #9
    //   2005: iload #17
    //   2007: iload #16
    //   2009: i2b
    //   2010: bastore
    //   2011: aload #10
    //   2013: iload #16
    //   2015: iload #24
    //   2017: bipush #24
    //   2019: ishl
    //   2020: iload #21
    //   2022: bipush #16
    //   2024: ishl
    //   2025: ior
    //   2026: iload #23
    //   2028: bipush #8
    //   2030: ishl
    //   2031: ior
    //   2032: iload #22
    //   2034: ior
    //   2035: dup
    //   2036: istore #25
    //   2038: iastore
    //   2039: aload #11
    //   2041: iload #16
    //   2043: iload #25
    //   2045: bipush #8
    //   2047: iushr
    //   2048: iload #25
    //   2050: bipush #24
    //   2052: ishl
    //   2053: ior
    //   2054: iastore
    //   2055: aload #12
    //   2057: iload #16
    //   2059: iload #25
    //   2061: bipush #16
    //   2063: iushr
    //   2064: iload #25
    //   2066: bipush #16
    //   2068: ishl
    //   2069: ior
    //   2070: iastore
    //   2071: aload #13
    //   2073: iload #16
    //   2075: iload #25
    //   2077: bipush #24
    //   2079: iushr
    //   2080: iload #25
    //   2082: bipush #8
    //   2084: ishl
    //   2085: ior
    //   2086: iastore
    //   2087: iinc #17, 1
    //   2090: iload_2
    //   2091: ifeq -> 1855
    //   2094: iconst_1
    //   2095: istore #26
    //   2097: aload #14
    //   2099: iconst_0
    //   2100: iload #26
    //   2102: bipush #24
    //   2104: ishl
    //   2105: iastore
    //   2106: iconst_1
    //   2107: istore #27
    //   2109: iload #27
    //   2111: bipush #10
    //   2113: if_icmpge -> 2154
    //   2116: iload #26
    //   2118: iconst_1
    //   2119: ishl
    //   2120: istore #26
    //   2122: iload #26
    //   2124: sipush #256
    //   2127: if_icmplt -> 2137
    //   2130: iload #26
    //   2132: iload #15
    //   2134: ixor
    //   2135: istore #26
    //   2137: aload #14
    //   2139: iload #27
    //   2141: iload #26
    //   2143: bipush #24
    //   2145: ishl
    //   2146: iastore
    //   2147: iinc #27, 1
    //   2150: iload_2
    //   2151: ifeq -> 2109
    //   2154: iconst_4
    //   2155: istore #27
    //   2157: iload #27
    //   2159: bipush #6
    //   2161: iadd
    //   2162: istore #28
    //   2164: iconst_4
    //   2165: iload #28
    //   2167: iconst_1
    //   2168: iadd
    //   2169: imul
    //   2170: istore #29
    //   2172: iload #29
    //   2174: newarray int
    //   2176: astore #30
    //   2178: iload #29
    //   2180: newarray int
    //   2182: astore #31
    //   2184: iconst_0
    //   2185: istore #26
    //   2187: iconst_0
    //   2188: istore #33
    //   2190: iconst_0
    //   2191: istore #34
    //   2193: iload #33
    //   2195: iload #27
    //   2197: if_icmpge -> 2265
    //   2200: aload #30
    //   2202: iload #33
    //   2204: aload #6
    //   2206: iload #34
    //   2208: baload
    //   2209: bipush #24
    //   2211: ishl
    //   2212: aload #6
    //   2214: iload #34
    //   2216: iconst_1
    //   2217: iadd
    //   2218: baload
    //   2219: sipush #255
    //   2222: iand
    //   2223: bipush #16
    //   2225: ishl
    //   2226: ior
    //   2227: aload #6
    //   2229: iload #34
    //   2231: iconst_2
    //   2232: iadd
    //   2233: baload
    //   2234: sipush #255
    //   2237: iand
    //   2238: bipush #8
    //   2240: ishl
    //   2241: ior
    //   2242: aload #6
    //   2244: iload #34
    //   2246: iconst_3
    //   2247: iadd
    //   2248: baload
    //   2249: sipush #255
    //   2252: iand
    //   2253: ior
    //   2254: iastore
    //   2255: iinc #33, 1
    //   2258: iinc #34, 4
    //   2261: iload_2
    //   2262: ifeq -> 2193
    //   2265: iload #27
    //   2267: istore #33
    //   2269: iconst_0
    //   2270: istore #34
    //   2272: iload #33
    //   2274: iload #29
    //   2276: if_icmpge -> 2403
    //   2279: aload #30
    //   2281: iload #33
    //   2283: iconst_1
    //   2284: isub
    //   2285: iaload
    //   2286: istore #32
    //   2288: iload #34
    //   2290: ifne -> 2377
    //   2293: iload #27
    //   2295: istore #34
    //   2297: aload #9
    //   2299: iload #32
    //   2301: bipush #16
    //   2303: iushr
    //   2304: sipush #255
    //   2307: iand
    //   2308: baload
    //   2309: bipush #24
    //   2311: ishl
    //   2312: aload #9
    //   2314: iload #32
    //   2316: bipush #8
    //   2318: iushr
    //   2319: sipush #255
    //   2322: iand
    //   2323: baload
    //   2324: sipush #255
    //   2327: iand
    //   2328: bipush #16
    //   2330: ishl
    //   2331: ior
    //   2332: aload #9
    //   2334: iload #32
    //   2336: sipush #255
    //   2339: iand
    //   2340: baload
    //   2341: sipush #255
    //   2344: iand
    //   2345: bipush #8
    //   2347: ishl
    //   2348: ior
    //   2349: aload #9
    //   2351: iload #32
    //   2353: bipush #24
    //   2355: iushr
    //   2356: baload
    //   2357: sipush #255
    //   2360: iand
    //   2361: ior
    //   2362: istore #32
    //   2364: iload #32
    //   2366: aload #14
    //   2368: iload #26
    //   2370: iinc #26, 1
    //   2373: iaload
    //   2374: ixor
    //   2375: istore #32
    //   2377: aload #30
    //   2379: iload #33
    //   2381: aload #30
    //   2383: iload #33
    //   2385: iload #27
    //   2387: isub
    //   2388: iaload
    //   2389: iload #32
    //   2391: ixor
    //   2392: iastore
    //   2393: iinc #33, 1
    //   2396: iinc #34, -1
    //   2399: iload_2
    //   2400: ifeq -> 2272
    //   2403: iconst_0
    //   2404: istore #33
    //   2406: iconst_4
    //   2407: iload #28
    //   2409: imul
    //   2410: istore #34
    //   2412: aload #31
    //   2414: iload #33
    //   2416: aload #30
    //   2418: iload #34
    //   2420: iaload
    //   2421: iastore
    //   2422: aload #31
    //   2424: iload #33
    //   2426: iconst_1
    //   2427: iadd
    //   2428: aload #30
    //   2430: iload #34
    //   2432: iconst_1
    //   2433: iadd
    //   2434: iaload
    //   2435: iastore
    //   2436: aload #31
    //   2438: iload #33
    //   2440: iconst_2
    //   2441: iadd
    //   2442: aload #30
    //   2444: iload #34
    //   2446: iconst_2
    //   2447: iadd
    //   2448: iaload
    //   2449: iastore
    //   2450: aload #31
    //   2452: iload #33
    //   2454: iconst_3
    //   2455: iadd
    //   2456: aload #30
    //   2458: iload #34
    //   2460: iconst_3
    //   2461: iadd
    //   2462: iaload
    //   2463: iastore
    //   2464: iinc #33, 4
    //   2467: iinc #34, -4
    //   2470: iconst_1
    //   2471: istore #36
    //   2473: iload #36
    //   2475: iload #28
    //   2477: if_icmpge -> 2841
    //   2480: aload #30
    //   2482: iload #34
    //   2484: iaload
    //   2485: istore #35
    //   2487: aload #31
    //   2489: iload #33
    //   2491: aload #10
    //   2493: aload #9
    //   2495: iload #35
    //   2497: bipush #24
    //   2499: iushr
    //   2500: baload
    //   2501: sipush #255
    //   2504: iand
    //   2505: iaload
    //   2506: aload #11
    //   2508: aload #9
    //   2510: iload #35
    //   2512: bipush #16
    //   2514: iushr
    //   2515: sipush #255
    //   2518: iand
    //   2519: baload
    //   2520: sipush #255
    //   2523: iand
    //   2524: iaload
    //   2525: ixor
    //   2526: aload #12
    //   2528: aload #9
    //   2530: iload #35
    //   2532: bipush #8
    //   2534: iushr
    //   2535: sipush #255
    //   2538: iand
    //   2539: baload
    //   2540: sipush #255
    //   2543: iand
    //   2544: iaload
    //   2545: ixor
    //   2546: aload #13
    //   2548: aload #9
    //   2550: iload #35
    //   2552: sipush #255
    //   2555: iand
    //   2556: baload
    //   2557: sipush #255
    //   2560: iand
    //   2561: iaload
    //   2562: ixor
    //   2563: iastore
    //   2564: aload #30
    //   2566: iload #34
    //   2568: iconst_1
    //   2569: iadd
    //   2570: iaload
    //   2571: istore #35
    //   2573: aload #31
    //   2575: iload #33
    //   2577: iconst_1
    //   2578: iadd
    //   2579: aload #10
    //   2581: aload #9
    //   2583: iload #35
    //   2585: bipush #24
    //   2587: iushr
    //   2588: baload
    //   2589: sipush #255
    //   2592: iand
    //   2593: iaload
    //   2594: aload #11
    //   2596: aload #9
    //   2598: iload #35
    //   2600: bipush #16
    //   2602: iushr
    //   2603: sipush #255
    //   2606: iand
    //   2607: baload
    //   2608: sipush #255
    //   2611: iand
    //   2612: iaload
    //   2613: ixor
    //   2614: aload #12
    //   2616: aload #9
    //   2618: iload #35
    //   2620: bipush #8
    //   2622: iushr
    //   2623: sipush #255
    //   2626: iand
    //   2627: baload
    //   2628: sipush #255
    //   2631: iand
    //   2632: iaload
    //   2633: ixor
    //   2634: aload #13
    //   2636: aload #9
    //   2638: iload #35
    //   2640: sipush #255
    //   2643: iand
    //   2644: baload
    //   2645: sipush #255
    //   2648: iand
    //   2649: iaload
    //   2650: ixor
    //   2651: iastore
    //   2652: aload #30
    //   2654: iload #34
    //   2656: iconst_2
    //   2657: iadd
    //   2658: iaload
    //   2659: istore #35
    //   2661: aload #31
    //   2663: iload #33
    //   2665: iconst_2
    //   2666: iadd
    //   2667: aload #10
    //   2669: aload #9
    //   2671: iload #35
    //   2673: bipush #24
    //   2675: iushr
    //   2676: baload
    //   2677: sipush #255
    //   2680: iand
    //   2681: iaload
    //   2682: aload #11
    //   2684: aload #9
    //   2686: iload #35
    //   2688: bipush #16
    //   2690: iushr
    //   2691: sipush #255
    //   2694: iand
    //   2695: baload
    //   2696: sipush #255
    //   2699: iand
    //   2700: iaload
    //   2701: ixor
    //   2702: aload #12
    //   2704: aload #9
    //   2706: iload #35
    //   2708: bipush #8
    //   2710: iushr
    //   2711: sipush #255
    //   2714: iand
    //   2715: baload
    //   2716: sipush #255
    //   2719: iand
    //   2720: iaload
    //   2721: ixor
    //   2722: aload #13
    //   2724: aload #9
    //   2726: iload #35
    //   2728: sipush #255
    //   2731: iand
    //   2732: baload
    //   2733: sipush #255
    //   2736: iand
    //   2737: iaload
    //   2738: ixor
    //   2739: iastore
    //   2740: aload #30
    //   2742: iload #34
    //   2744: iconst_3
    //   2745: iadd
    //   2746: iaload
    //   2747: istore #35
    //   2749: aload #31
    //   2751: iload #33
    //   2753: iconst_3
    //   2754: iadd
    //   2755: aload #10
    //   2757: aload #9
    //   2759: iload #35
    //   2761: bipush #24
    //   2763: iushr
    //   2764: baload
    //   2765: sipush #255
    //   2768: iand
    //   2769: iaload
    //   2770: aload #11
    //   2772: aload #9
    //   2774: iload #35
    //   2776: bipush #16
    //   2778: iushr
    //   2779: sipush #255
    //   2782: iand
    //   2783: baload
    //   2784: sipush #255
    //   2787: iand
    //   2788: iaload
    //   2789: ixor
    //   2790: aload #12
    //   2792: aload #9
    //   2794: iload #35
    //   2796: bipush #8
    //   2798: iushr
    //   2799: sipush #255
    //   2802: iand
    //   2803: baload
    //   2804: sipush #255
    //   2807: iand
    //   2808: iaload
    //   2809: ixor
    //   2810: aload #13
    //   2812: aload #9
    //   2814: iload #35
    //   2816: sipush #255
    //   2819: iand
    //   2820: baload
    //   2821: sipush #255
    //   2824: iand
    //   2825: iaload
    //   2826: ixor
    //   2827: iastore
    //   2828: iinc #33, 4
    //   2831: iinc #34, -4
    //   2834: iinc #36, 1
    //   2837: iload_2
    //   2838: ifeq -> 2473
    //   2841: aload #31
    //   2843: iload #33
    //   2845: aload #30
    //   2847: iload #34
    //   2849: iaload
    //   2850: iastore
    //   2851: aload #31
    //   2853: iload #33
    //   2855: iconst_1
    //   2856: iadd
    //   2857: aload #30
    //   2859: iload #34
    //   2861: iconst_1
    //   2862: iadd
    //   2863: iaload
    //   2864: iastore
    //   2865: aload #31
    //   2867: iload #33
    //   2869: iconst_2
    //   2870: iadd
    //   2871: aload #30
    //   2873: iload #34
    //   2875: iconst_2
    //   2876: iadd
    //   2877: iaload
    //   2878: iastore
    //   2879: aload #31
    //   2881: iload #33
    //   2883: iconst_3
    //   2884: iadd
    //   2885: aload #30
    //   2887: iload #34
    //   2889: iconst_3
    //   2890: iadd
    //   2891: iaload
    //   2892: iastore
    //   2893: iconst_0
    //   2894: newarray byte
    //   2896: astore #36
    //   2898: aload #7
    //   2900: arraylength
    //   2901: bipush #16
    //   2903: irem
    //   2904: ifeq -> 2928
    //   2907: new java/lang/Exception
    //   2910: dup
    //   2911: sipush #-10835
    //   2914: sipush #544
    //   2917: invokestatic a : (II)Ljava/lang/String;
    //   2920: invokespecial <init> : (Ljava/lang/String;)V
    //   2923: athrow
    //   2924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2927: athrow
    //   2928: bipush #10
    //   2930: istore #37
    //   2932: sipush #-10845
    //   2935: sipush #256
    //   2938: newarray byte
    //   2940: astore #38
    //   2942: sipush #-3347
    //   2945: sipush #256
    //   2948: newarray int
    //   2950: astore #39
    //   2952: sipush #256
    //   2955: newarray int
    //   2957: astore #40
    //   2959: sipush #256
    //   2962: newarray int
    //   2964: astore #41
    //   2966: sipush #256
    //   2969: newarray int
    //   2971: astore #42
    //   2973: sipush #283
    //   2976: istore #15
    //   2978: invokestatic a : (II)Ljava/lang/String;
    //   2981: astore #43
    //   2983: iconst_0
    //   2984: istore #17
    //   2986: iload #17
    //   2988: sipush #256
    //   2991: if_icmpge -> 3218
    //   2994: aload #43
    //   2996: iload #17
    //   2998: iconst_1
    //   2999: iushr
    //   3000: invokevirtual charAt : (I)C
    //   3003: istore #44
    //   3005: iload #17
    //   3007: iconst_1
    //   3008: iand
    //   3009: ifne -> 3024
    //   3012: iload #44
    //   3014: bipush #8
    //   3016: iushr
    //   3017: goto -> 3026
    //   3020: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3023: athrow
    //   3024: iload #44
    //   3026: i2b
    //   3027: sipush #255
    //   3030: iand
    //   3031: istore #16
    //   3033: iload #17
    //   3035: iconst_1
    //   3036: ishl
    //   3037: istore #18
    //   3039: iload #18
    //   3041: sipush #256
    //   3044: if_icmplt -> 3054
    //   3047: iload #18
    //   3049: iload #15
    //   3051: ixor
    //   3052: istore #18
    //   3054: iload #18
    //   3056: iconst_1
    //   3057: ishl
    //   3058: istore #19
    //   3060: iload #19
    //   3062: sipush #256
    //   3065: if_icmplt -> 3075
    //   3068: iload #19
    //   3070: iload #15
    //   3072: ixor
    //   3073: istore #19
    //   3075: iload #19
    //   3077: iconst_1
    //   3078: ishl
    //   3079: istore #20
    //   3081: iload #20
    //   3083: sipush #256
    //   3086: if_icmplt -> 3096
    //   3089: iload #20
    //   3091: iload #15
    //   3093: ixor
    //   3094: istore #20
    //   3096: iload #20
    //   3098: iload #17
    //   3100: ixor
    //   3101: istore #21
    //   3103: iload #21
    //   3105: iload #18
    //   3107: ixor
    //   3108: istore #22
    //   3110: iload #21
    //   3112: iload #19
    //   3114: ixor
    //   3115: istore #23
    //   3117: iload #20
    //   3119: iload #19
    //   3121: ixor
    //   3122: iload #18
    //   3124: ixor
    //   3125: istore #24
    //   3127: aload #38
    //   3129: iload #16
    //   3131: iload #17
    //   3133: i2b
    //   3134: bastore
    //   3135: aload #39
    //   3137: iload #16
    //   3139: iload #24
    //   3141: bipush #24
    //   3143: ishl
    //   3144: iload #21
    //   3146: bipush #16
    //   3148: ishl
    //   3149: ior
    //   3150: iload #23
    //   3152: bipush #8
    //   3154: ishl
    //   3155: ior
    //   3156: iload #22
    //   3158: ior
    //   3159: dup
    //   3160: istore #25
    //   3162: iastore
    //   3163: aload #40
    //   3165: iload #16
    //   3167: iload #25
    //   3169: bipush #8
    //   3171: iushr
    //   3172: iload #25
    //   3174: bipush #24
    //   3176: ishl
    //   3177: ior
    //   3178: iastore
    //   3179: aload #41
    //   3181: iload #16
    //   3183: iload #25
    //   3185: bipush #16
    //   3187: iushr
    //   3188: iload #25
    //   3190: bipush #16
    //   3192: ishl
    //   3193: ior
    //   3194: iastore
    //   3195: aload #42
    //   3197: iload #16
    //   3199: iload #25
    //   3201: bipush #24
    //   3203: iushr
    //   3204: iload #25
    //   3206: bipush #8
    //   3208: ishl
    //   3209: ior
    //   3210: iastore
    //   3211: iinc #17, 1
    //   3214: iload_2
    //   3215: ifeq -> 2986
    //   3218: aload #7
    //   3220: arraylength
    //   3221: newarray byte
    //   3223: astore #44
    //   3225: iconst_0
    //   3226: istore #45
    //   3228: iload #45
    //   3230: aload #7
    //   3232: arraylength
    //   3233: bipush #16
    //   3235: idiv
    //   3236: if_icmpge -> 4150
    //   3239: bipush #16
    //   3241: newarray byte
    //   3243: astore #46
    //   3245: bipush #16
    //   3247: newarray byte
    //   3249: astore #47
    //   3251: iconst_0
    //   3252: istore #48
    //   3254: iload #48
    //   3256: bipush #16
    //   3258: if_icmpge -> 3284
    //   3261: aload #46
    //   3263: iload #48
    //   3265: aload #7
    //   3267: iload #48
    //   3269: iload #45
    //   3271: bipush #16
    //   3273: imul
    //   3274: iadd
    //   3275: baload
    //   3276: bastore
    //   3277: iinc #48, 1
    //   3280: iload_2
    //   3281: ifeq -> 3254
    //   3284: iconst_0
    //   3285: istore #48
    //   3287: aload #46
    //   3289: iconst_0
    //   3290: baload
    //   3291: bipush #24
    //   3293: ishl
    //   3294: aload #46
    //   3296: iconst_1
    //   3297: baload
    //   3298: sipush #255
    //   3301: iand
    //   3302: bipush #16
    //   3304: ishl
    //   3305: ior
    //   3306: aload #46
    //   3308: iconst_2
    //   3309: baload
    //   3310: sipush #255
    //   3313: iand
    //   3314: bipush #8
    //   3316: ishl
    //   3317: ior
    //   3318: aload #46
    //   3320: iconst_3
    //   3321: baload
    //   3322: sipush #255
    //   3325: iand
    //   3326: ior
    //   3327: aload #31
    //   3329: iconst_0
    //   3330: iaload
    //   3331: ixor
    //   3332: istore #50
    //   3334: aload #46
    //   3336: iconst_4
    //   3337: baload
    //   3338: bipush #24
    //   3340: ishl
    //   3341: aload #46
    //   3343: iconst_5
    //   3344: baload
    //   3345: sipush #255
    //   3348: iand
    //   3349: bipush #16
    //   3351: ishl
    //   3352: ior
    //   3353: aload #46
    //   3355: bipush #6
    //   3357: baload
    //   3358: sipush #255
    //   3361: iand
    //   3362: bipush #8
    //   3364: ishl
    //   3365: ior
    //   3366: aload #46
    //   3368: bipush #7
    //   3370: baload
    //   3371: sipush #255
    //   3374: iand
    //   3375: ior
    //   3376: aload #31
    //   3378: iconst_1
    //   3379: iaload
    //   3380: ixor
    //   3381: istore #51
    //   3383: aload #46
    //   3385: bipush #8
    //   3387: baload
    //   3388: bipush #24
    //   3390: ishl
    //   3391: aload #46
    //   3393: bipush #9
    //   3395: baload
    //   3396: sipush #255
    //   3399: iand
    //   3400: bipush #16
    //   3402: ishl
    //   3403: ior
    //   3404: aload #46
    //   3406: bipush #10
    //   3408: baload
    //   3409: sipush #255
    //   3412: iand
    //   3413: bipush #8
    //   3415: ishl
    //   3416: ior
    //   3417: aload #46
    //   3419: bipush #11
    //   3421: baload
    //   3422: sipush #255
    //   3425: iand
    //   3426: ior
    //   3427: aload #31
    //   3429: iconst_2
    //   3430: iaload
    //   3431: ixor
    //   3432: istore #52
    //   3434: aload #46
    //   3436: bipush #12
    //   3438: baload
    //   3439: bipush #24
    //   3441: ishl
    //   3442: aload #46
    //   3444: bipush #13
    //   3446: baload
    //   3447: sipush #255
    //   3450: iand
    //   3451: bipush #16
    //   3453: ishl
    //   3454: ior
    //   3455: aload #46
    //   3457: bipush #14
    //   3459: baload
    //   3460: sipush #255
    //   3463: iand
    //   3464: bipush #8
    //   3466: ishl
    //   3467: ior
    //   3468: aload #46
    //   3470: bipush #15
    //   3472: baload
    //   3473: sipush #255
    //   3476: iand
    //   3477: ior
    //   3478: aload #31
    //   3480: iconst_3
    //   3481: iaload
    //   3482: ixor
    //   3483: istore #53
    //   3485: iconst_1
    //   3486: istore #54
    //   3488: iload #54
    //   3490: iload #37
    //   3492: if_icmpge -> 3735
    //   3495: iinc #48, 4
    //   3498: aload #39
    //   3500: iload #50
    //   3502: bipush #24
    //   3504: iushr
    //   3505: iaload
    //   3506: aload #40
    //   3508: iload #53
    //   3510: bipush #16
    //   3512: iushr
    //   3513: sipush #255
    //   3516: iand
    //   3517: iaload
    //   3518: ixor
    //   3519: aload #41
    //   3521: iload #52
    //   3523: bipush #8
    //   3525: iushr
    //   3526: sipush #255
    //   3529: iand
    //   3530: iaload
    //   3531: ixor
    //   3532: aload #42
    //   3534: iload #51
    //   3536: sipush #255
    //   3539: iand
    //   3540: iaload
    //   3541: ixor
    //   3542: aload #31
    //   3544: iload #48
    //   3546: iaload
    //   3547: ixor
    //   3548: istore #55
    //   3550: aload #39
    //   3552: iload #51
    //   3554: bipush #24
    //   3556: iushr
    //   3557: iaload
    //   3558: aload #40
    //   3560: iload #50
    //   3562: bipush #16
    //   3564: iushr
    //   3565: sipush #255
    //   3568: iand
    //   3569: iaload
    //   3570: ixor
    //   3571: aload #41
    //   3573: iload #53
    //   3575: bipush #8
    //   3577: iushr
    //   3578: sipush #255
    //   3581: iand
    //   3582: iaload
    //   3583: ixor
    //   3584: aload #42
    //   3586: iload #52
    //   3588: sipush #255
    //   3591: iand
    //   3592: iaload
    //   3593: ixor
    //   3594: aload #31
    //   3596: iload #48
    //   3598: iconst_1
    //   3599: iadd
    //   3600: iaload
    //   3601: ixor
    //   3602: istore #56
    //   3604: aload #39
    //   3606: iload #52
    //   3608: bipush #24
    //   3610: iushr
    //   3611: iaload
    //   3612: aload #40
    //   3614: iload #51
    //   3616: bipush #16
    //   3618: iushr
    //   3619: sipush #255
    //   3622: iand
    //   3623: iaload
    //   3624: ixor
    //   3625: aload #41
    //   3627: iload #50
    //   3629: bipush #8
    //   3631: iushr
    //   3632: sipush #255
    //   3635: iand
    //   3636: iaload
    //   3637: ixor
    //   3638: aload #42
    //   3640: iload #53
    //   3642: sipush #255
    //   3645: iand
    //   3646: iaload
    //   3647: ixor
    //   3648: aload #31
    //   3650: iload #48
    //   3652: iconst_2
    //   3653: iadd
    //   3654: iaload
    //   3655: ixor
    //   3656: istore #57
    //   3658: aload #39
    //   3660: iload #53
    //   3662: bipush #24
    //   3664: iushr
    //   3665: iaload
    //   3666: aload #40
    //   3668: iload #52
    //   3670: bipush #16
    //   3672: iushr
    //   3673: sipush #255
    //   3676: iand
    //   3677: iaload
    //   3678: ixor
    //   3679: aload #41
    //   3681: iload #51
    //   3683: bipush #8
    //   3685: iushr
    //   3686: sipush #255
    //   3689: iand
    //   3690: iaload
    //   3691: ixor
    //   3692: aload #42
    //   3694: iload #50
    //   3696: sipush #255
    //   3699: iand
    //   3700: iaload
    //   3701: ixor
    //   3702: aload #31
    //   3704: iload #48
    //   3706: iconst_3
    //   3707: iadd
    //   3708: iaload
    //   3709: ixor
    //   3710: istore #58
    //   3712: iload #55
    //   3714: istore #50
    //   3716: iload #56
    //   3718: istore #51
    //   3720: iload #57
    //   3722: istore #52
    //   3724: iload #58
    //   3726: istore #53
    //   3728: iinc #54, 1
    //   3731: iload_2
    //   3732: ifeq -> 3488
    //   3735: iinc #48, 4
    //   3738: aload #31
    //   3740: iload #48
    //   3742: iaload
    //   3743: istore #49
    //   3745: aload #47
    //   3747: iconst_0
    //   3748: aload #38
    //   3750: iload #50
    //   3752: bipush #24
    //   3754: iushr
    //   3755: baload
    //   3756: iload #49
    //   3758: bipush #24
    //   3760: iushr
    //   3761: ixor
    //   3762: i2b
    //   3763: bastore
    //   3764: aload #47
    //   3766: iconst_1
    //   3767: aload #38
    //   3769: iload #53
    //   3771: bipush #16
    //   3773: iushr
    //   3774: sipush #255
    //   3777: iand
    //   3778: baload
    //   3779: iload #49
    //   3781: bipush #16
    //   3783: iushr
    //   3784: ixor
    //   3785: i2b
    //   3786: bastore
    //   3787: aload #47
    //   3789: iconst_2
    //   3790: aload #38
    //   3792: iload #52
    //   3794: bipush #8
    //   3796: iushr
    //   3797: sipush #255
    //   3800: iand
    //   3801: baload
    //   3802: iload #49
    //   3804: bipush #8
    //   3806: iushr
    //   3807: ixor
    //   3808: i2b
    //   3809: bastore
    //   3810: aload #47
    //   3812: iconst_3
    //   3813: aload #38
    //   3815: iload #51
    //   3817: sipush #255
    //   3820: iand
    //   3821: baload
    //   3822: iload #49
    //   3824: ixor
    //   3825: i2b
    //   3826: bastore
    //   3827: aload #31
    //   3829: iload #48
    //   3831: iconst_1
    //   3832: iadd
    //   3833: iaload
    //   3834: istore #49
    //   3836: aload #47
    //   3838: iconst_4
    //   3839: aload #38
    //   3841: iload #51
    //   3843: bipush #24
    //   3845: iushr
    //   3846: baload
    //   3847: iload #49
    //   3849: bipush #24
    //   3851: iushr
    //   3852: ixor
    //   3853: i2b
    //   3854: bastore
    //   3855: aload #47
    //   3857: iconst_5
    //   3858: aload #38
    //   3860: iload #50
    //   3862: bipush #16
    //   3864: iushr
    //   3865: sipush #255
    //   3868: iand
    //   3869: baload
    //   3870: iload #49
    //   3872: bipush #16
    //   3874: iushr
    //   3875: ixor
    //   3876: i2b
    //   3877: bastore
    //   3878: aload #47
    //   3880: bipush #6
    //   3882: aload #38
    //   3884: iload #53
    //   3886: bipush #8
    //   3888: iushr
    //   3889: sipush #255
    //   3892: iand
    //   3893: baload
    //   3894: iload #49
    //   3896: bipush #8
    //   3898: iushr
    //   3899: ixor
    //   3900: i2b
    //   3901: bastore
    //   3902: aload #47
    //   3904: bipush #7
    //   3906: aload #38
    //   3908: iload #52
    //   3910: sipush #255
    //   3913: iand
    //   3914: baload
    //   3915: iload #49
    //   3917: ixor
    //   3918: i2b
    //   3919: bastore
    //   3920: aload #31
    //   3922: iload #48
    //   3924: iconst_2
    //   3925: iadd
    //   3926: iaload
    //   3927: istore #49
    //   3929: aload #47
    //   3931: bipush #8
    //   3933: aload #38
    //   3935: iload #52
    //   3937: bipush #24
    //   3939: iushr
    //   3940: baload
    //   3941: iload #49
    //   3943: bipush #24
    //   3945: iushr
    //   3946: ixor
    //   3947: i2b
    //   3948: bastore
    //   3949: aload #47
    //   3951: bipush #9
    //   3953: aload #38
    //   3955: iload #51
    //   3957: bipush #16
    //   3959: iushr
    //   3960: sipush #255
    //   3963: iand
    //   3964: baload
    //   3965: iload #49
    //   3967: bipush #16
    //   3969: iushr
    //   3970: ixor
    //   3971: i2b
    //   3972: bastore
    //   3973: aload #47
    //   3975: bipush #10
    //   3977: aload #38
    //   3979: iload #50
    //   3981: bipush #8
    //   3983: iushr
    //   3984: sipush #255
    //   3987: iand
    //   3988: baload
    //   3989: iload #49
    //   3991: bipush #8
    //   3993: iushr
    //   3994: ixor
    //   3995: i2b
    //   3996: bastore
    //   3997: aload #47
    //   3999: bipush #11
    //   4001: aload #38
    //   4003: iload #53
    //   4005: sipush #255
    //   4008: iand
    //   4009: baload
    //   4010: iload #49
    //   4012: ixor
    //   4013: i2b
    //   4014: bastore
    //   4015: aload #31
    //   4017: iload #48
    //   4019: iconst_3
    //   4020: iadd
    //   4021: iaload
    //   4022: istore #49
    //   4024: aload #47
    //   4026: bipush #12
    //   4028: aload #38
    //   4030: iload #53
    //   4032: bipush #24
    //   4034: iushr
    //   4035: baload
    //   4036: iload #49
    //   4038: bipush #24
    //   4040: iushr
    //   4041: ixor
    //   4042: i2b
    //   4043: bastore
    //   4044: aload #47
    //   4046: bipush #13
    //   4048: aload #38
    //   4050: iload #52
    //   4052: bipush #16
    //   4054: iushr
    //   4055: sipush #255
    //   4058: iand
    //   4059: baload
    //   4060: iload #49
    //   4062: bipush #16
    //   4064: iushr
    //   4065: ixor
    //   4066: i2b
    //   4067: bastore
    //   4068: aload #47
    //   4070: bipush #14
    //   4072: aload #38
    //   4074: iload #51
    //   4076: bipush #8
    //   4078: iushr
    //   4079: sipush #255
    //   4082: iand
    //   4083: baload
    //   4084: iload #49
    //   4086: bipush #8
    //   4088: iushr
    //   4089: ixor
    //   4090: i2b
    //   4091: bastore
    //   4092: aload #47
    //   4094: bipush #15
    //   4096: aload #38
    //   4098: iload #50
    //   4100: sipush #255
    //   4103: iand
    //   4104: baload
    //   4105: iload #49
    //   4107: ixor
    //   4108: i2b
    //   4109: bastore
    //   4110: iconst_0
    //   4111: istore #54
    //   4113: iload #54
    //   4115: bipush #16
    //   4117: if_icmpge -> 4143
    //   4120: aload #44
    //   4122: iload #54
    //   4124: iload #45
    //   4126: bipush #16
    //   4128: imul
    //   4129: iadd
    //   4130: aload #47
    //   4132: iload #54
    //   4134: baload
    //   4135: bastore
    //   4136: iinc #54, 1
    //   4139: iload_2
    //   4140: ifeq -> 4113
    //   4143: iinc #45, 1
    //   4146: iload_2
    //   4147: ifeq -> 3228
    //   4150: aload #44
    //   4152: arraylength
    //   4153: ifle -> 4234
    //   4156: aload #44
    //   4158: aload #44
    //   4160: arraylength
    //   4161: iconst_1
    //   4162: isub
    //   4163: baload
    //   4164: istore #45
    //   4166: iload #45
    //   4168: bipush #16
    //   4170: if_icmple -> 4181
    //   4173: aload #44
    //   4175: astore #36
    //   4177: iload_2
    //   4178: ifeq -> 4234
    //   4181: aload #44
    //   4183: arraylength
    //   4184: iload #45
    //   4186: isub
    //   4187: newarray byte
    //   4189: astore #36
    //   4191: iconst_0
    //   4192: istore #46
    //   4194: iload #46
    //   4196: aload #36
    //   4198: arraylength
    //   4199: if_icmpge -> 4234
    //   4202: iload #46
    //   4204: aload #44
    //   4206: arraylength
    //   4207: if_icmpge -> 4234
    //   4210: aload #36
    //   4212: iload #46
    //   4214: aload #44
    //   4216: iload #46
    //   4218: baload
    //   4219: bastore
    //   4220: iinc #46, 1
    //   4223: iload_2
    //   4224: ifeq -> 4194
    //   4227: goto -> 4234
    //   4230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4233: athrow
    //   4234: aload #36
    //   4236: astore #8
    //   4238: getstatic burp/Zkby.Zf : Ljava/lang/String;
    //   4241: getstatic burp/Zluk.Zz : Ljava/lang/Object;
    //   4244: checkcast java/math/BigInteger
    //   4247: invokevirtual intValue : ()I
    //   4250: bipush #32
    //   4252: irem
    //   4253: invokestatic abs : (I)I
    //   4256: invokevirtual charAt : (I)C
    //   4259: getstatic burp/Zgh3.ZR : Ljava/lang/String;
    //   4262: getstatic burp/Ztjh.ZU : Ljava/lang/Object;
    //   4265: checkcast java/math/BigInteger
    //   4268: invokevirtual intValue : ()I
    //   4271: bipush #32
    //   4273: irem
    //   4274: invokestatic abs : (I)I
    //   4277: invokevirtual charAt : (I)C
    //   4280: if_icmple -> 4395
    //   4283: getstatic burp/Zb1.Z_ : Ljava/lang/String;
    //   4286: getstatic burp/Zkor.Ze : Ljava/lang/Object;
    //   4289: checkcast java/math/BigInteger
    //   4292: invokevirtual intValue : ()I
    //   4295: bipush #32
    //   4297: irem
    //   4298: invokestatic abs : (I)I
    //   4301: invokevirtual charAt : (I)C
    //   4304: getstatic burp/Zgqp.ZA : Ljava/lang/String;
    //   4307: getstatic burp/Zkor.Ze : Ljava/lang/Object;
    //   4310: checkcast java/math/BigInteger
    //   4313: invokevirtual intValue : ()I
    //   4316: bipush #32
    //   4318: irem
    //   4319: invokestatic abs : (I)I
    //   4322: invokevirtual charAt : (I)C
    //   4325: if_icmpgt -> 4395
    //   4328: goto -> 4335
    //   4331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4334: athrow
    //   4335: getstatic burp/Zm6g.ZG : Ljava/lang/String;
    //   4338: getstatic burp/Zzx8.Zi : Ljava/lang/Object;
    //   4341: checkcast java/math/BigInteger
    //   4344: invokevirtual intValue : ()I
    //   4347: bipush #32
    //   4349: irem
    //   4350: invokestatic abs : (I)I
    //   4353: invokevirtual charAt : (I)C
    //   4356: getstatic burp/Zzx8.Z_ : Ljava/lang/String;
    //   4359: getstatic burp/Zm54.ZS : Ljava/lang/Object;
    //   4362: checkcast java/math/BigInteger
    //   4365: invokevirtual intValue : ()I
    //   4368: bipush #32
    //   4370: irem
    //   4371: invokestatic abs : (I)I
    //   4374: invokevirtual charAt : (I)C
    //   4377: if_icmpgt -> 4395
    //   4380: goto -> 4387
    //   4383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4386: athrow
    //   4387: iconst_1
    //   4388: goto -> 4396
    //   4391: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4394: athrow
    //   4395: iconst_0
    //   4396: ireturn
    //   4397: astore_3
    //   4398: new java/lang/Exception
    //   4401: dup
    //   4402: aload_3
    //   4403: invokevirtual getMessage : ()Ljava/lang/String;
    //   4406: invokespecial <init> : (Ljava/lang/String;)V
    //   4409: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4396	4397	java/lang/Throwable
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
    //   1443	1457	1457	java/lang/Throwable
    //   1468	1481	1484	java/lang/Throwable
    //   1473	1496	1499	java/lang/Throwable
    //   1488	1514	1517	java/lang/Throwable
    //   1503	1544	1547	java/lang/Throwable
    //   1610	1637	1640	java/lang/Throwable
    //   1627	1658	1661	java/lang/Throwable
    //   1644	1688	1691	java/lang/Throwable
    //   1665	1699	1699	java/lang/Throwable
    //   1710	1726	1729	java/lang/Throwable
    //   1881	1896	1896	java/lang/Throwable
    //   2898	2924	2924	java/lang/Throwable
    //   3005	3020	3020	java/lang/Throwable
    //   4202	4227	4230	java/lang/Throwable
    //   4238	4328	4331	java/lang/Throwable
    //   4283	4380	4383	java/lang/Throwable
    //   4335	4391	4391	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¶rÑcÎYÂpJ!ùðfµ¡Uå½\\btÕM%µÍÍ9µ¼+2¬ådêVîK+Z×ôH]m9ÌìÄ¦dÐ õñAN'¯ÍMvX!43¡kªVcrÜê3e^ô­ôA*¸vP¬°)Ð\\ry­1J"®£ÈãÎÍ£7^ÍyÉ>ýr ÜiQú2-»ß3Ñ¿ä ÄÝË@&Zw*·À¨hüh\^4ó YüNÙ\\tÎïb÷,À\\t2iaÒ Ì\\tÇv³áFÃnOçÆ\Çnk-'6±ã]«²} uIÛGºÆ&´èB[#%\-ä>Rk8$ûm8çêë捓眇澵゙朻ﻲꭋ쨭즻着䝷괨ꊘ鳻牕랥鏐㛫㐷燳ㅤӾ⏚᢭Ս߷聞늄঱Ⲋᮜ媼勗횇⧁⾓厭¼₶녀橩뺅䫱墺퀣ꪎ䏧㏇䕥ʐ傍鼝冽䁍鋪㢦볧?ၔ쵚᎞忕䒗쒣縍摮ᦔ悭俗∌郮䘷롄?௒㫒䦐⑺숓갦酉㜂趯丽氐敠깅몚▸Ზ듦瑙䮴讆炕땹䢔慀埇蚁ᷟ须榍蹌魯螽칒⢨賈褫뿮䊃䆥ⴭ끞뮁揽瞼濂〣柕ﺥꮖ쫇준﫷䜀궃ꉶ鲎犈뜋鍫㘾㒍熤ㆹД⍡ᣰԺݜ肰뉙टⰱᭉ嫋剭황⦖⽎升⃫넷櫂빫䪄塧킍ꨵ䌲㎰䗟ɾ僚鿀兗䃶銷㣑뱌?အ췴ጥ开䓠쐙绣搹᥉恇佬≑邙䚜뢪?ଏ㩩䥅␍슩곈鄞㞹跲乊治攕꺘먴┃᱃뒑璷䯣譛灿뗂䣉懫圩蛴ᴂ飀楘踻鯕蝓츅⡵谢覐뾳䋴䄎ⷃ뀫뭜'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
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
    //   68: ldc 'J\\n®Òlù«6'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #42
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
    //   129: putstatic burp/Zg8.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zg8.b : [Ljava/lang/String;
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
    //   212: bipush #56
    //   214: goto -> 244
    //   217: bipush #84
    //   219: goto -> 244
    //   222: bipush #19
    //   224: goto -> 244
    //   227: bipush #13
    //   229: goto -> 244
    //   232: bipush #67
    //   234: goto -> 244
    //   237: bipush #121
    //   239: goto -> 244
    //   242: bipush #92
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
    //   300: sipush #-10836
    //   303: sipush #-30461
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zg8.ZE : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-10837
    //   319: sipush #21745
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zg8.ZX : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD5AB) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */