package burp;

import java.math.BigInteger;

class Zlhu extends ClassLoader {
  static Object ZJ;
  
  static String ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZE(Object paramObject) {
    Zm14.ZE = a(9422, 32429);
    Zm14.ZZ = new BigInteger(a(9423, 13973));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Ze9.Zh.charAt(Math.abs(((BigInteger)Zenq.Zd).intValue() % 32)) <= Ze_e.ZH.charAt(Math.abs(((BigInteger)Zm14.ZZ).intValue() % 32))) {
          try {
            Zt5a.Za(Class.forName(a(9411, 18592)));
            if (bool)
              Zxf8.Zf(Class.forName(a(9410, 1500))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxf8.Zf(Class.forName(a(9410, 1500)));
    } catch (Throwable throwable) {}
  }
  
  static void Zw(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZG(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zx_x.Zv : Ljava/lang/String;
    //   172: getstatic burp/Zgjs.Za : Ljava/lang/Object;
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
    //   206: getstatic burp/Zgds.ZA : Ljava/lang/String;
    //   209: getstatic burp/Zg7z.ZV : Ljava/lang/Object;
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
    //   243: getstatic burp/Zz16.ZA : Ljava/lang/String;
    //   246: getstatic burp/Zlpu.ZE : Ljava/lang/Object;
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
    //   280: getstatic burp/Zsm3.Zl : Ljava/lang/String;
    //   283: getstatic burp/Ze_e.Za : Ljava/lang/Object;
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
    //   317: getstatic burp/Ztte.ZD : Ljava/lang/String;
    //   320: getstatic burp/Zmj8.Zz : Ljava/lang/Object;
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
    //   354: getstatic burp/Zk7w.ZB : Ljava/lang/String;
    //   357: getstatic burp/Zlhu.ZJ : Ljava/lang/Object;
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
    //   391: getstatic burp/Zebj.ZF : Ljava/lang/String;
    //   394: getstatic burp/Zr4z.ZH : Ljava/lang/Object;
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
    //   428: getstatic burp/Zv8c.ZO : Ljava/lang/String;
    //   431: getstatic burp/Zxxf.ZZ : Ljava/lang/Object;
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
    //   465: getstatic burp/Zgt7.ZO : Ljava/lang/String;
    //   468: getstatic burp/Zge1.ZK : Ljava/lang/Object;
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
    //   502: getstatic burp/Zeqo.Zw : Ljava/lang/String;
    //   505: getstatic burp/Zl2q.Zg : Ljava/lang/Object;
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
    //   539: getstatic burp/Zbqo.ZS : Ljava/lang/String;
    //   542: getstatic burp/Zzvr.Z_ : Ljava/lang/Object;
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
    //   576: getstatic burp/Zlpl.ZO : Ljava/lang/String;
    //   579: getstatic burp/Zeno.Zo : Ljava/lang/Object;
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
    //   613: getstatic burp/Zgx6.ZX : Ljava/lang/String;
    //   616: getstatic burp/Zttq.Zh : Ljava/lang/Object;
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
    //   650: getstatic burp/Zry9.ZW : Ljava/lang/String;
    //   653: getstatic burp/Ztfh.Zo : Ljava/lang/Object;
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
    //   687: getstatic burp/Zm3x.Zu : Ljava/lang/String;
    //   690: getstatic burp/Zzxv.ZZ : Ljava/lang/Object;
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
    //   724: getstatic burp/Zm0v.Zd : Ljava/lang/String;
    //   727: getstatic burp/Zbp.ZD : Ljava/lang/Object;
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
    //   764: getstatic burp/Zehi.Zb : Ljava/lang/Object;
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
    //   798: getstatic burp/Zl2t.Zg : Ljava/lang/String;
    //   801: getstatic burp/Ztmy.ZH : Ljava/lang/Object;
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
    //   835: getstatic burp/Zbqk.ZZ : Ljava/lang/String;
    //   838: getstatic burp/Zsq5.ZF : Ljava/lang/Object;
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
    //   872: getstatic burp/Zxzp.ZH : Ljava/lang/String;
    //   875: getstatic burp/Zgr1.Zf : Ljava/lang/Object;
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
    //   909: getstatic burp/Zea8.ZE : Ljava/lang/String;
    //   912: getstatic burp/Zll8.ZE : Ljava/lang/Object;
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
    //   946: getstatic burp/Zlo0.ZD : Ljava/lang/String;
    //   949: getstatic burp/Zgrz.ZX : Ljava/lang/Object;
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
    //   983: getstatic burp/Zg2u.Zy : Ljava/lang/String;
    //   986: getstatic burp/Zg3v.Zk : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zlzo.Zs : Ljava/lang/String;
    //   1023: getstatic burp/Zzlg.Z_ : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zrxm.Zp : Ljava/lang/String;
    //   1060: getstatic burp/Zlos.Zk : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zmli.Zc : Ljava/lang/String;
    //   1097: getstatic burp/Zgwq.Ze : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zbwj.ZP : Ljava/lang/String;
    //   1134: getstatic burp/Zram.ZF : Ljava/lang/Object;
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
    //   1168: getstatic burp/Ztzh.ZE : Ljava/lang/String;
    //   1171: getstatic burp/Zk5y.ZL : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zbf9.Zp : Ljava/lang/String;
    //   1208: getstatic burp/Ztes.ZX : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zl6z.ZL : Ljava/lang/String;
    //   1245: getstatic burp/Zmha.ZM : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zex5.Zh : Ljava/lang/String;
    //   1282: getstatic burp/Zrfl.Z_ : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zbsc.Zp : Ljava/lang/String;
    //   1319: getstatic burp/Zbzc.Zp : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zemp.Zs : Ljava/lang/String;
    //   1362: sipush #9409
    //   1365: sipush #5812
    //   1368: invokestatic a : (II)Ljava/lang/String;
    //   1371: iconst_1
    //   1372: ldc burp/Zmt7
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
    //   1493: sipush #9413
    //   1496: sipush #-19959
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
    //   1532: ifne -> 1393
    //   1535: sipush #9414
    //   1538: sipush #-13626
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
    //   1680: ifne -> 1697
    //   1683: iinc #6, 1
    //   1686: iload_2
    //   1687: ifne -> 1560
    //   1690: goto -> 1697
    //   1693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1696: athrow
    //   1697: getstatic burp/Zlzs.ZL : Ljava/lang/Object;
    //   1700: checkcast java/math/BigInteger
    //   1703: invokevirtual toByteArray : ()[B
    //   1706: astore #4
    //   1708: aload #4
    //   1710: arraylength
    //   1711: bipush #8
    //   1713: iadd
    //   1714: bipush #6
    //   1716: ishr
    //   1717: iconst_1
    //   1718: iadd
    //   1719: bipush #16
    //   1721: imul
    //   1722: newarray int
    //   1724: astore #6
    //   1726: iconst_0
    //   1727: istore #7
    //   1729: iload #7
    //   1731: aload #4
    //   1733: arraylength
    //   1734: if_icmpge -> 1778
    //   1737: aload #4
    //   1739: iload #7
    //   1741: baload
    //   1742: sipush #255
    //   1745: iand
    //   1746: istore #8
    //   1748: aload #6
    //   1750: iload #7
    //   1752: iconst_2
    //   1753: ishr
    //   1754: dup2
    //   1755: iaload
    //   1756: iload #8
    //   1758: bipush #24
    //   1760: iload #7
    //   1762: iconst_4
    //   1763: irem
    //   1764: bipush #8
    //   1766: imul
    //   1767: isub
    //   1768: ishl
    //   1769: ior
    //   1770: iastore
    //   1771: iinc #7, 1
    //   1774: iload_2
    //   1775: ifne -> 1729
    //   1778: aload #6
    //   1780: iload #7
    //   1782: iconst_2
    //   1783: ishr
    //   1784: dup2
    //   1785: iaload
    //   1786: sipush #128
    //   1789: bipush #24
    //   1791: iload #7
    //   1793: iconst_4
    //   1794: irem
    //   1795: bipush #8
    //   1797: imul
    //   1798: isub
    //   1799: ishl
    //   1800: ior
    //   1801: iastore
    //   1802: aload #6
    //   1804: aload #6
    //   1806: arraylength
    //   1807: iconst_1
    //   1808: isub
    //   1809: aload #4
    //   1811: arraylength
    //   1812: bipush #8
    //   1814: imul
    //   1815: iastore
    //   1816: bipush #80
    //   1818: newarray int
    //   1820: astore #8
    //   1822: ldc 1732584193
    //   1824: istore #9
    //   1826: ldc -271733879
    //   1828: istore #10
    //   1830: ldc -1732584194
    //   1832: istore #11
    //   1834: ldc 271733878
    //   1836: istore #12
    //   1838: ldc -1009589776
    //   1840: istore #13
    //   1842: iconst_0
    //   1843: istore #7
    //   1845: iload #7
    //   1847: aload #6
    //   1849: arraylength
    //   1850: if_icmpge -> 2172
    //   1853: iload #9
    //   1855: istore #14
    //   1857: iload #10
    //   1859: istore #15
    //   1861: iload #11
    //   1863: istore #16
    //   1865: iload #12
    //   1867: istore #17
    //   1869: iload #13
    //   1871: istore #18
    //   1873: iconst_0
    //   1874: istore #19
    //   1876: iload #19
    //   1878: bipush #80
    //   1880: if_icmpge -> 2130
    //   1883: iload #19
    //   1885: bipush #16
    //   1887: if_icmpge -> 1914
    //   1890: aload #8
    //   1892: iload #19
    //   1894: aload #6
    //   1896: iload #7
    //   1898: iload #19
    //   1900: iadd
    //   1901: iaload
    //   1902: iastore
    //   1903: iload_2
    //   1904: ifne -> 1969
    //   1907: goto -> 1914
    //   1910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1913: athrow
    //   1914: aload #8
    //   1916: iload #19
    //   1918: iconst_3
    //   1919: isub
    //   1920: iaload
    //   1921: aload #8
    //   1923: iload #19
    //   1925: bipush #8
    //   1927: isub
    //   1928: iaload
    //   1929: ixor
    //   1930: aload #8
    //   1932: iload #19
    //   1934: bipush #14
    //   1936: isub
    //   1937: iaload
    //   1938: ixor
    //   1939: aload #8
    //   1941: iload #19
    //   1943: bipush #16
    //   1945: isub
    //   1946: iaload
    //   1947: ixor
    //   1948: istore #20
    //   1950: iload #20
    //   1952: iconst_1
    //   1953: ishl
    //   1954: iload #20
    //   1956: bipush #31
    //   1958: iushr
    //   1959: ior
    //   1960: istore #21
    //   1962: aload #8
    //   1964: iload #19
    //   1966: iload #21
    //   1968: iastore
    //   1969: iload #9
    //   1971: iconst_5
    //   1972: ishl
    //   1973: iload #9
    //   1975: bipush #27
    //   1977: iushr
    //   1978: ior
    //   1979: istore #20
    //   1981: iload #20
    //   1983: iload #13
    //   1985: iadd
    //   1986: aload #8
    //   1988: iload #19
    //   1990: iaload
    //   1991: iadd
    //   1992: iload #19
    //   1994: bipush #20
    //   1996: if_icmpge -> 2022
    //   1999: ldc 1518500249
    //   2001: iload #10
    //   2003: iload #11
    //   2005: iand
    //   2006: iload #10
    //   2008: iconst_m1
    //   2009: ixor
    //   2010: iload #12
    //   2012: iand
    //   2013: ior
    //   2014: iadd
    //   2015: goto -> 2092
    //   2018: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2021: athrow
    //   2022: iload #19
    //   2024: bipush #40
    //   2026: if_icmpge -> 2047
    //   2029: ldc 1859775393
    //   2031: iload #10
    //   2033: iload #11
    //   2035: ixor
    //   2036: iload #12
    //   2038: ixor
    //   2039: iadd
    //   2040: goto -> 2092
    //   2043: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2046: athrow
    //   2047: iload #19
    //   2049: bipush #60
    //   2051: if_icmpge -> 2081
    //   2054: ldc -1894007588
    //   2056: iload #10
    //   2058: iload #11
    //   2060: iand
    //   2061: iload #10
    //   2063: iload #12
    //   2065: iand
    //   2066: ior
    //   2067: iload #11
    //   2069: iload #12
    //   2071: iand
    //   2072: ior
    //   2073: iadd
    //   2074: goto -> 2092
    //   2077: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2080: athrow
    //   2081: ldc -899497514
    //   2083: iload #10
    //   2085: iload #11
    //   2087: ixor
    //   2088: iload #12
    //   2090: ixor
    //   2091: iadd
    //   2092: iadd
    //   2093: istore #21
    //   2095: iload #12
    //   2097: istore #13
    //   2099: iload #11
    //   2101: istore #12
    //   2103: iload #10
    //   2105: bipush #30
    //   2107: ishl
    //   2108: iload #10
    //   2110: iconst_2
    //   2111: iushr
    //   2112: ior
    //   2113: istore #11
    //   2115: iload #9
    //   2117: istore #10
    //   2119: iload #21
    //   2121: istore #9
    //   2123: iinc #19, 1
    //   2126: iload_2
    //   2127: ifne -> 1876
    //   2130: iload #9
    //   2132: iload #14
    //   2134: iadd
    //   2135: istore #9
    //   2137: iload #10
    //   2139: iload #15
    //   2141: iadd
    //   2142: istore #10
    //   2144: iload #11
    //   2146: iload #16
    //   2148: iadd
    //   2149: istore #11
    //   2151: iload #12
    //   2153: iload #17
    //   2155: iadd
    //   2156: istore #12
    //   2158: iload #13
    //   2160: iload #18
    //   2162: iadd
    //   2163: istore #13
    //   2165: iinc #7, 16
    //   2168: iload_2
    //   2169: ifne -> 1845
    //   2172: iconst_5
    //   2173: newarray int
    //   2175: dup
    //   2176: iconst_0
    //   2177: iload #9
    //   2179: iastore
    //   2180: dup
    //   2181: iconst_1
    //   2182: iload #10
    //   2184: iastore
    //   2185: dup
    //   2186: iconst_2
    //   2187: iload #11
    //   2189: iastore
    //   2190: dup
    //   2191: iconst_3
    //   2192: iload #12
    //   2194: iastore
    //   2195: dup
    //   2196: iconst_4
    //   2197: iload #13
    //   2199: iastore
    //   2200: astore #14
    //   2202: bipush #20
    //   2204: newarray byte
    //   2206: astore #15
    //   2208: iconst_0
    //   2209: istore #16
    //   2211: iload #16
    //   2213: bipush #20
    //   2215: if_icmpge -> 2256
    //   2218: aload #14
    //   2220: iload #16
    //   2222: iconst_4
    //   2223: idiv
    //   2224: iaload
    //   2225: istore #17
    //   2227: iconst_3
    //   2228: iload #16
    //   2230: iconst_4
    //   2231: irem
    //   2232: isub
    //   2233: bipush #8
    //   2235: imul
    //   2236: istore #18
    //   2238: aload #15
    //   2240: iload #16
    //   2242: iload #17
    //   2244: iload #18
    //   2246: iushr
    //   2247: i2b
    //   2248: bastore
    //   2249: iinc #16, 1
    //   2252: iload_2
    //   2253: ifne -> 2211
    //   2256: aload #15
    //   2258: astore #5
    //   2260: sipush #9408
    //   2263: iconst_0
    //   2264: istore #4
    //   2266: sipush #-21157
    //   2269: invokestatic a : (II)Ljava/lang/String;
    //   2272: iconst_1
    //   2273: ldc burp/Zb3z
    //   2275: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2278: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2281: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2284: astore #5
    //   2286: aload #5
    //   2288: arraylength
    //   2289: istore #6
    //   2291: iconst_0
    //   2292: istore #7
    //   2294: iload #7
    //   2296: iload #6
    //   2298: if_icmpge -> 2436
    //   2301: aload #5
    //   2303: iload #7
    //   2305: aaload
    //   2306: astore #8
    //   2308: aload #8
    //   2310: invokevirtual getModifiers : ()I
    //   2313: invokestatic isStatic : (I)Z
    //   2316: ifne -> 2326
    //   2319: goto -> 2429
    //   2322: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2325: athrow
    //   2326: aload #8
    //   2328: invokevirtual getType : ()Ljava/lang/Class;
    //   2331: astore #9
    //   2333: aload #9
    //   2335: ifnull -> 2416
    //   2338: aload #9
    //   2340: invokevirtual isPrimitive : ()Z
    //   2343: ifne -> 2416
    //   2346: goto -> 2353
    //   2349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2352: athrow
    //   2353: aload #9
    //   2355: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2358: ifnull -> 2416
    //   2361: goto -> 2368
    //   2364: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2367: athrow
    //   2368: aload #9
    //   2370: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2373: invokevirtual getName : ()Ljava/lang/String;
    //   2376: ifnull -> 2416
    //   2379: goto -> 2386
    //   2382: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2385: athrow
    //   2386: aload #9
    //   2388: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2391: invokevirtual getName : ()Ljava/lang/String;
    //   2394: sipush #9412
    //   2397: sipush #-22015
    //   2400: invokestatic a : (II)Ljava/lang/String;
    //   2403: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2406: ifne -> 2416
    //   2409: goto -> 2416
    //   2412: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2415: athrow
    //   2416: aload #8
    //   2418: iconst_1
    //   2419: invokevirtual setAccessible : (Z)V
    //   2422: aload #8
    //   2424: aconst_null
    //   2425: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2428: pop
    //   2429: iinc #7, 1
    //   2432: iload_2
    //   2433: ifne -> 2294
    //   2436: sipush #9420
    //   2439: sipush #30037
    //   2442: invokestatic a : (II)Ljava/lang/String;
    //   2445: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2448: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2451: astore #5
    //   2453: aload #5
    //   2455: arraylength
    //   2456: istore #6
    //   2458: iconst_0
    //   2459: istore #7
    //   2461: iload #7
    //   2463: iload #6
    //   2465: if_icmpge -> 2602
    //   2468: aload #5
    //   2470: iload #7
    //   2472: aaload
    //   2473: astore #8
    //   2475: aload #8
    //   2477: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2480: pop
    //   2481: aload #8
    //   2483: invokevirtual getModifiers : ()I
    //   2486: invokestatic isStatic : (I)Z
    //   2489: ifeq -> 2588
    //   2492: aload #8
    //   2494: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2497: arraylength
    //   2498: iconst_2
    //   2499: if_icmpne -> 2588
    //   2502: goto -> 2509
    //   2505: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2508: athrow
    //   2509: aload #8
    //   2511: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2514: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2517: if_acmpne -> 2588
    //   2520: goto -> 2527
    //   2523: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2526: athrow
    //   2527: aload #8
    //   2529: iconst_1
    //   2530: invokevirtual setAccessible : (Z)V
    //   2533: aload #8
    //   2535: aconst_null
    //   2536: iconst_2
    //   2537: anewarray java/lang/Object
    //   2540: dup
    //   2541: iconst_0
    //   2542: aload_0
    //   2543: aastore
    //   2544: dup
    //   2545: iconst_1
    //   2546: aload_1
    //   2547: ifnonnull -> 2565
    //   2550: goto -> 2557
    //   2553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2556: athrow
    //   2557: aload_1
    //   2558: goto -> 2572
    //   2561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2564: athrow
    //   2565: aload_1
    //   2566: checkcast [B
    //   2569: invokevirtual clone : ()Ljava/lang/Object;
    //   2572: aastore
    //   2573: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2576: checkcast java/lang/Boolean
    //   2579: invokevirtual booleanValue : ()Z
    //   2582: istore #4
    //   2584: iload_2
    //   2585: ifne -> 2602
    //   2588: iinc #7, 1
    //   2591: iload_2
    //   2592: ifne -> 2461
    //   2595: goto -> 2602
    //   2598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2601: athrow
    //   2602: iload #4
    //   2604: ireturn
    //   2605: astore_3
    //   2606: new java/lang/Exception
    //   2609: dup
    //   2610: aload_3
    //   2611: invokevirtual getMessage : ()Ljava/lang/String;
    //   2614: invokespecial <init> : (Ljava/lang/String;)V
    //   2617: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2604	2605	java/lang/Throwable
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
    //   1883	1907	1910	java/lang/Throwable
    //   1981	2018	2018	java/lang/Throwable
    //   2022	2043	2043	java/lang/Throwable
    //   2047	2077	2077	java/lang/Throwable
    //   2308	2322	2322	java/lang/Throwable
    //   2333	2346	2349	java/lang/Throwable
    //   2338	2361	2364	java/lang/Throwable
    //   2353	2379	2382	java/lang/Throwable
    //   2368	2409	2412	java/lang/Throwable
    //   2475	2502	2505	java/lang/Throwable
    //   2492	2520	2523	java/lang/Throwable
    //   2509	2550	2553	java/lang/Throwable
    //   2527	2561	2561	java/lang/Throwable
    //   2584	2595	2598	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÛÒQHç NvNw}]Òá­ÜênÏg¼­^~_ªÉÖ\\t{¼dhG»D#\\t³Q~ð0Ù0\\t¹dc.<ì¯\\f\\tG$\\fÐ#JKa%\\tst:,µÁ Ç`XL[ç<h#6Þ\\tí®Å(+ty>'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #123
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
    //   68: ldc 'Ñ6M{{Q4wõV2(¹_m¹ngpX ÖYÓiÊ9ªXëB¦¼&_qW¼ù\\t£Wn=Ð»ä"¢±á±zí×K.ßðËhh\\t§TBl\øÜÐ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #18
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
    //   129: putstatic burp/Zlhu.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlhu.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 257
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 239, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 230, 5 -> 234
    //   212: bipush #77
    //   214: goto -> 241
    //   217: bipush #79
    //   219: goto -> 241
    //   222: iconst_5
    //   223: goto -> 241
    //   226: iconst_2
    //   227: goto -> 241
    //   230: iconst_4
    //   231: goto -> 241
    //   234: bipush #32
    //   236: goto -> 241
    //   239: bipush #34
    //   241: ixor
    //   242: ixor
    //   243: i2c
    //   244: castore
    //   245: iinc #6, 1
    //   248: dup
    //   249: ifne -> 257
    //   252: dup2
    //   253: dup_x1
    //   254: goto -> 166
    //   257: dup2_x1
    //   258: pop2
    //   259: dup_x2
    //   260: iload #6
    //   262: if_icmpgt -> 162
    //   265: pop
    //   266: new java/lang/String
    //   269: dup_x1
    //   270: swap
    //   271: invokespecial <init> : ([C)V
    //   274: invokevirtual intern : ()Ljava/lang/String;
    //   277: swap
    //   278: pop
    //   279: swap
    //   280: tableswitch default -> 40, 0 -> 99
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #74
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-29
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #81
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-12
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #59
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #126
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-12
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-94
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-16
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-30
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #6
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #70
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-86
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #71
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #41
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-100
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-75
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #20
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #29
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #44
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #79
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #94
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-39
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #30
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #60
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #83
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #102
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-99
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-68
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #72
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-105
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #88
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zlhu.ZJ : Ljava/lang/Object;
    //   500: sipush #9415
    //   503: sipush #31783
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zlhu.ZC : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x24C6) & 0xFFFF;
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
      byte b1 = 62;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlhu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */