package burp;

import java.math.BigInteger;

class Zmhi extends ClassLoader {
  static Object ZZ;
  
  static String ZQ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZC(Object paramObject) {
    Zef0.ZR = a(-29962, -22523);
    Zef0.ZX = new BigInteger(a(-29966, 649));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zkll.ZX.charAt(Math.abs(((BigInteger)Zk7e.ZW).intValue() % 32)) <= Zl8f.ZK.charAt(Math.abs(((BigInteger)Ze8i.Zq).intValue() % 32))) {
          try {
            Zzbr.ZQ(Class.forName(a(-29961, -30180)));
            if (bool)
              Zz20.ZZ(Class.forName(a(-29965, -16874))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zz20.ZZ(Class.forName(a(-29965, -16874)));
    } catch (Throwable throwable) {}
  }
  
  static void Zb(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zu(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zef0.ZR : Ljava/lang/String;
    //   172: getstatic burp/Zg_5.ZA : Ljava/lang/Object;
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
    //   206: getstatic burp/Zs_v.Zn : Ljava/lang/String;
    //   209: getstatic burp/Zmyg.Zj : Ljava/lang/Object;
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
    //   243: getstatic burp/Zgva.ZV : Ljava/lang/String;
    //   246: getstatic burp/Zrpu.Zi : Ljava/lang/Object;
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
    //   280: getstatic burp/Zzyr.Z_ : Ljava/lang/String;
    //   283: getstatic burp/Ze64.ZW : Ljava/lang/Object;
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
    //   317: getstatic burp/Zl8f.ZK : Ljava/lang/String;
    //   320: getstatic burp/Zb4a.ZJ : Ljava/lang/Object;
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
    //   354: getstatic burp/Zef0.ZR : Ljava/lang/String;
    //   357: getstatic burp/Zt3f.Zp : Ljava/lang/Object;
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
    //   391: getstatic burp/Zlf0.ZS : Ljava/lang/String;
    //   394: getstatic burp/Zs75.Zo : Ljava/lang/Object;
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
    //   428: getstatic burp/Zm7x.ZP : Ljava/lang/String;
    //   431: getstatic burp/Zs00.ZF : Ljava/lang/Object;
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
    //   465: getstatic burp/Zefo.Zb : Ljava/lang/String;
    //   468: getstatic burp/Zg4k.ZE : Ljava/lang/Object;
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
    //   502: getstatic burp/Zlnm.ZL : Ljava/lang/String;
    //   505: getstatic burp/Ze5t.Zc : Ljava/lang/Object;
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
    //   539: getstatic burp/Zm6h.Za : Ljava/lang/String;
    //   542: getstatic burp/Zrof.ZB : Ljava/lang/Object;
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
    //   576: getstatic burp/Zm6h.Za : Ljava/lang/String;
    //   579: getstatic burp/Zm4i.Zr : Ljava/lang/Object;
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
    //   613: getstatic burp/Zrhp.ZQ : Ljava/lang/String;
    //   616: getstatic burp/Zzmu.Zy : Ljava/lang/Object;
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
    //   650: getstatic burp/Zgq_.ZQ : Ljava/lang/String;
    //   653: getstatic burp/Ztdd.ZD : Ljava/lang/Object;
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
    //   687: getstatic burp/Zram.Ze : Ljava/lang/String;
    //   690: getstatic burp/Zg4w.ZR : Ljava/lang/Object;
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
    //   724: getstatic burp/Zxg7.Zi : Ljava/lang/String;
    //   727: getstatic burp/Ztsu.Zr : Ljava/lang/Object;
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
    //   761: getstatic burp/Zg4d.ZE : Ljava/lang/String;
    //   764: getstatic burp/Zt5j.Zn : Ljava/lang/Object;
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
    //   798: getstatic burp/Ze54.ZU : Ljava/lang/String;
    //   801: getstatic burp/Zgnp.Zm : Ljava/lang/Object;
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
    //   835: getstatic burp/Zmyg.ZE : Ljava/lang/String;
    //   838: getstatic burp/Zlo5.Zf : Ljava/lang/Object;
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
    //   872: getstatic burp/Zix.Zp : Ljava/lang/String;
    //   875: getstatic burp/Zzyr.Za : Ljava/lang/Object;
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
    //   909: getstatic burp/Ze54.ZU : Ljava/lang/String;
    //   912: getstatic burp/Zrpu.Zi : Ljava/lang/Object;
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
    //   946: getstatic burp/Ztkh.ZP : Ljava/lang/String;
    //   949: getstatic burp/Zs0_.Zu : Ljava/lang/Object;
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
    //   983: getstatic burp/Ztkh.ZP : Ljava/lang/String;
    //   986: getstatic burp/Zm7x.Zv : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zlck.ZL : Ljava/lang/String;
    //   1023: getstatic burp/Zrva.ZE : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zbzk.ZS : Ljava/lang/String;
    //   1060: getstatic burp/Zkjr.Zw : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zera.Zn : Ljava/lang/String;
    //   1097: getstatic burp/Zsbt.Zl : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zrva.Zr : Ljava/lang/String;
    //   1134: getstatic burp/Zlr.ZK : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zs8q.Zs : Ljava/lang/String;
    //   1171: getstatic burp/Zz6t.ZA : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zt0t.ZR : Ljava/lang/String;
    //   1208: getstatic burp/Zrof.ZB : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zv8c.ZO : Ljava/lang/String;
    //   1245: getstatic burp/Zmsn.Zk : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zmx6.ZG : Ljava/lang/String;
    //   1282: getstatic burp/Zeuc.Zd : Ljava/lang/Object;
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
    //   1316: getstatic burp/Ztdd.ZA : Ljava/lang/String;
    //   1319: getstatic burp/Ze6d.Zw : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zzoi.ZR : Ljava/lang/String;
    //   1362: getstatic burp/Zs_3.ZZ : Ljava/lang/Object;
    //   1365: checkcast java/math/BigInteger
    //   1368: invokevirtual toByteArray : ()[B
    //   1371: astore #4
    //   1373: iconst_0
    //   1374: istore #6
    //   1376: iconst_0
    //   1377: istore #7
    //   1379: iload #7
    //   1381: aload #4
    //   1383: arraylength
    //   1384: if_icmpge -> 1530
    //   1387: aload #4
    //   1389: iload #7
    //   1391: baload
    //   1392: istore #8
    //   1394: iload #8
    //   1396: bipush #48
    //   1398: if_icmplt -> 1415
    //   1401: iload #8
    //   1403: bipush #57
    //   1405: if_icmple -> 1513
    //   1408: goto -> 1415
    //   1411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1414: athrow
    //   1415: iload #8
    //   1417: bipush #65
    //   1419: if_icmplt -> 1443
    //   1422: goto -> 1429
    //   1425: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1428: athrow
    //   1429: iload #8
    //   1431: bipush #90
    //   1433: if_icmple -> 1513
    //   1436: goto -> 1443
    //   1439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1442: athrow
    //   1443: iload #8
    //   1445: bipush #97
    //   1447: if_icmplt -> 1471
    //   1450: goto -> 1457
    //   1453: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1456: athrow
    //   1457: iload #8
    //   1459: bipush #122
    //   1461: if_icmple -> 1513
    //   1464: goto -> 1471
    //   1467: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1470: athrow
    //   1471: iload #8
    //   1473: bipush #43
    //   1475: if_icmpeq -> 1513
    //   1478: goto -> 1485
    //   1481: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1484: athrow
    //   1485: iload #8
    //   1487: bipush #47
    //   1489: if_icmpeq -> 1513
    //   1492: goto -> 1499
    //   1495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1498: athrow
    //   1499: iload #8
    //   1501: bipush #61
    //   1503: if_icmpne -> 1523
    //   1506: goto -> 1513
    //   1509: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1512: athrow
    //   1513: iinc #6, 1
    //   1516: goto -> 1523
    //   1519: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1522: athrow
    //   1523: iinc #7, 1
    //   1526: iload_2
    //   1527: ifeq -> 1379
    //   1530: iload #6
    //   1532: newarray byte
    //   1534: astore #7
    //   1536: iconst_0
    //   1537: istore #8
    //   1539: iconst_0
    //   1540: istore #9
    //   1542: iload #9
    //   1544: aload #4
    //   1546: arraylength
    //   1547: if_icmpge -> 1700
    //   1550: aload #4
    //   1552: iload #9
    //   1554: baload
    //   1555: istore #10
    //   1557: iload #10
    //   1559: bipush #48
    //   1561: if_icmplt -> 1578
    //   1564: iload #10
    //   1566: bipush #57
    //   1568: if_icmple -> 1676
    //   1571: goto -> 1578
    //   1574: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1577: athrow
    //   1578: iload #10
    //   1580: bipush #65
    //   1582: if_icmplt -> 1606
    //   1585: goto -> 1592
    //   1588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1591: athrow
    //   1592: iload #10
    //   1594: bipush #90
    //   1596: if_icmple -> 1676
    //   1599: goto -> 1606
    //   1602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1605: athrow
    //   1606: iload #10
    //   1608: bipush #97
    //   1610: if_icmplt -> 1634
    //   1613: goto -> 1620
    //   1616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1619: athrow
    //   1620: iload #10
    //   1622: bipush #122
    //   1624: if_icmple -> 1676
    //   1627: goto -> 1634
    //   1630: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1633: athrow
    //   1634: iload #10
    //   1636: bipush #43
    //   1638: if_icmpeq -> 1676
    //   1641: goto -> 1648
    //   1644: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1647: athrow
    //   1648: iload #10
    //   1650: bipush #47
    //   1652: if_icmpeq -> 1676
    //   1655: goto -> 1662
    //   1658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1661: athrow
    //   1662: iload #10
    //   1664: bipush #61
    //   1666: if_icmpne -> 1693
    //   1669: goto -> 1676
    //   1672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1675: athrow
    //   1676: aload #7
    //   1678: iload #8
    //   1680: iload #10
    //   1682: bastore
    //   1683: iinc #8, 1
    //   1686: goto -> 1693
    //   1689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1692: athrow
    //   1693: iinc #9, 1
    //   1696: iload_2
    //   1697: ifeq -> 1542
    //   1700: aload #7
    //   1702: astore #5
    //   1704: aload #5
    //   1706: astore #4
    //   1708: aload #4
    //   1710: arraylength
    //   1711: istore #6
    //   1713: aload #4
    //   1715: iload #6
    //   1717: iconst_1
    //   1718: isub
    //   1719: baload
    //   1720: bipush #61
    //   1722: if_icmpne -> 1732
    //   1725: iinc #6, -1
    //   1728: iload_2
    //   1729: ifeq -> 1713
    //   1732: iload #6
    //   1734: aload #4
    //   1736: arraylength
    //   1737: iconst_4
    //   1738: idiv
    //   1739: isub
    //   1740: newarray byte
    //   1742: astore #7
    //   1744: iconst_0
    //   1745: istore #8
    //   1747: iload #8
    //   1749: aload #4
    //   1751: arraylength
    //   1752: if_icmpge -> 2032
    //   1755: aload #4
    //   1757: iload #8
    //   1759: baload
    //   1760: bipush #61
    //   1762: if_icmpne -> 1782
    //   1765: aload #4
    //   1767: iload #8
    //   1769: iconst_0
    //   1770: bastore
    //   1771: iload_2
    //   1772: ifeq -> 2025
    //   1775: goto -> 1782
    //   1778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1781: athrow
    //   1782: aload #4
    //   1784: iload #8
    //   1786: baload
    //   1787: bipush #47
    //   1789: if_icmpne -> 1817
    //   1792: goto -> 1799
    //   1795: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1798: athrow
    //   1799: aload #4
    //   1801: iload #8
    //   1803: bipush #63
    //   1805: bastore
    //   1806: iload_2
    //   1807: ifeq -> 2025
    //   1810: goto -> 1817
    //   1813: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1816: athrow
    //   1817: aload #4
    //   1819: iload #8
    //   1821: baload
    //   1822: bipush #43
    //   1824: if_icmpne -> 1852
    //   1827: goto -> 1834
    //   1830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1833: athrow
    //   1834: aload #4
    //   1836: iload #8
    //   1838: bipush #62
    //   1840: bastore
    //   1841: iload_2
    //   1842: ifeq -> 2025
    //   1845: goto -> 1852
    //   1848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1851: athrow
    //   1852: aload #4
    //   1854: iload #8
    //   1856: baload
    //   1857: bipush #48
    //   1859: if_icmplt -> 1911
    //   1862: goto -> 1869
    //   1865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1868: athrow
    //   1869: aload #4
    //   1871: iload #8
    //   1873: baload
    //   1874: bipush #57
    //   1876: if_icmpgt -> 1911
    //   1879: goto -> 1886
    //   1882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1885: athrow
    //   1886: aload #4
    //   1888: iload #8
    //   1890: aload #4
    //   1892: iload #8
    //   1894: baload
    //   1895: bipush #-4
    //   1897: isub
    //   1898: i2b
    //   1899: bastore
    //   1900: iload_2
    //   1901: ifeq -> 2025
    //   1904: goto -> 1911
    //   1907: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1910: athrow
    //   1911: aload #4
    //   1913: iload #8
    //   1915: baload
    //   1916: bipush #97
    //   1918: if_icmplt -> 1970
    //   1921: goto -> 1928
    //   1924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1927: athrow
    //   1928: aload #4
    //   1930: iload #8
    //   1932: baload
    //   1933: bipush #122
    //   1935: if_icmpgt -> 1970
    //   1938: goto -> 1945
    //   1941: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1944: athrow
    //   1945: aload #4
    //   1947: iload #8
    //   1949: aload #4
    //   1951: iload #8
    //   1953: baload
    //   1954: bipush #71
    //   1956: isub
    //   1957: i2b
    //   1958: bastore
    //   1959: iload_2
    //   1960: ifeq -> 2025
    //   1963: goto -> 1970
    //   1966: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1969: athrow
    //   1970: aload #4
    //   1972: iload #8
    //   1974: baload
    //   1975: bipush #65
    //   1977: if_icmplt -> 2025
    //   1980: goto -> 1987
    //   1983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1986: athrow
    //   1987: aload #4
    //   1989: iload #8
    //   1991: baload
    //   1992: bipush #90
    //   1994: if_icmpgt -> 2025
    //   1997: goto -> 2004
    //   2000: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2003: athrow
    //   2004: aload #4
    //   2006: iload #8
    //   2008: aload #4
    //   2010: iload #8
    //   2012: baload
    //   2013: bipush #65
    //   2015: isub
    //   2016: i2b
    //   2017: bastore
    //   2018: goto -> 2025
    //   2021: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2024: athrow
    //   2025: iinc #8, 1
    //   2028: iload_2
    //   2029: ifeq -> 1747
    //   2032: iconst_0
    //   2033: istore #8
    //   2035: iconst_0
    //   2036: istore #9
    //   2038: iload #9
    //   2040: aload #7
    //   2042: arraylength
    //   2043: iconst_2
    //   2044: isub
    //   2045: if_icmpge -> 2154
    //   2048: aload #7
    //   2050: iload #9
    //   2052: aload #4
    //   2054: iload #8
    //   2056: baload
    //   2057: iconst_2
    //   2058: ishl
    //   2059: sipush #255
    //   2062: iand
    //   2063: aload #4
    //   2065: iload #8
    //   2067: iconst_1
    //   2068: iadd
    //   2069: baload
    //   2070: iconst_4
    //   2071: iushr
    //   2072: iconst_3
    //   2073: iand
    //   2074: ior
    //   2075: i2b
    //   2076: bastore
    //   2077: aload #7
    //   2079: iload #9
    //   2081: iconst_1
    //   2082: iadd
    //   2083: aload #4
    //   2085: iload #8
    //   2087: iconst_1
    //   2088: iadd
    //   2089: baload
    //   2090: iconst_4
    //   2091: ishl
    //   2092: sipush #255
    //   2095: iand
    //   2096: aload #4
    //   2098: iload #8
    //   2100: iconst_2
    //   2101: iadd
    //   2102: baload
    //   2103: iconst_2
    //   2104: iushr
    //   2105: bipush #15
    //   2107: iand
    //   2108: ior
    //   2109: i2b
    //   2110: bastore
    //   2111: aload #7
    //   2113: iload #9
    //   2115: iconst_2
    //   2116: iadd
    //   2117: aload #4
    //   2119: iload #8
    //   2121: iconst_2
    //   2122: iadd
    //   2123: baload
    //   2124: bipush #6
    //   2126: ishl
    //   2127: sipush #255
    //   2130: iand
    //   2131: aload #4
    //   2133: iload #8
    //   2135: iconst_3
    //   2136: iadd
    //   2137: baload
    //   2138: bipush #63
    //   2140: iand
    //   2141: ior
    //   2142: i2b
    //   2143: bastore
    //   2144: iinc #8, 4
    //   2147: iinc #9, 3
    //   2150: iload_2
    //   2151: ifeq -> 2038
    //   2154: iload #9
    //   2156: aload #7
    //   2158: arraylength
    //   2159: if_icmpge -> 2198
    //   2162: aload #7
    //   2164: iload #9
    //   2166: aload #4
    //   2168: iload #8
    //   2170: baload
    //   2171: iconst_2
    //   2172: ishl
    //   2173: sipush #255
    //   2176: iand
    //   2177: aload #4
    //   2179: iload #8
    //   2181: iconst_1
    //   2182: iadd
    //   2183: baload
    //   2184: iconst_4
    //   2185: iushr
    //   2186: iconst_3
    //   2187: iand
    //   2188: ior
    //   2189: i2b
    //   2190: bastore
    //   2191: goto -> 2198
    //   2194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2197: athrow
    //   2198: iinc #9, 1
    //   2201: iload #9
    //   2203: aload #7
    //   2205: arraylength
    //   2206: if_icmpge -> 2248
    //   2209: aload #7
    //   2211: iload #9
    //   2213: aload #4
    //   2215: iload #8
    //   2217: iconst_1
    //   2218: iadd
    //   2219: baload
    //   2220: iconst_4
    //   2221: ishl
    //   2222: sipush #255
    //   2225: iand
    //   2226: aload #4
    //   2228: iload #8
    //   2230: iconst_2
    //   2231: iadd
    //   2232: baload
    //   2233: iconst_2
    //   2234: iushr
    //   2235: bipush #15
    //   2237: iand
    //   2238: ior
    //   2239: i2b
    //   2240: bastore
    //   2241: goto -> 2248
    //   2244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2247: athrow
    //   2248: aload #7
    //   2250: astore #5
    //   2252: new java/math/BigInteger
    //   2255: dup
    //   2256: aload #5
    //   2258: invokespecial <init> : ([B)V
    //   2261: invokevirtual abs : ()Ljava/math/BigInteger;
    //   2264: putstatic burp/Zsbt.Zl : Ljava/lang/Object;
    //   2267: new java/lang/StringBuilder
    //   2270: dup
    //   2271: invokespecial <init> : ()V
    //   2274: astore #4
    //   2276: iconst_0
    //   2277: istore #5
    //   2279: iload #5
    //   2281: bipush #32
    //   2283: if_icmpge -> 3651
    //   2286: iload #5
    //   2288: tableswitch default -> 3644, 0 -> 2432, 1 -> 2470, 2 -> 2508, 3 -> 2546, 4 -> 2584, 5 -> 2622, 6 -> 2660, 7 -> 2698, 8 -> 2736, 9 -> 2774, 10 -> 2812, 11 -> 2850, 12 -> 2888, 13 -> 2926, 14 -> 2964, 15 -> 3002, 16 -> 3040, 17 -> 3078, 18 -> 3116, 19 -> 3154, 20 -> 3192, 21 -> 3230, 22 -> 3268, 23 -> 3306, 24 -> 3344, 25 -> 3382, 26 -> 3420, 27 -> 3458, 28 -> 3496, 29 -> 3534, 30 -> 3572, 31 -> 3610
    //   2432: aload #4
    //   2434: getstatic burp/Zkc8.Za : Ljava/lang/String;
    //   2437: getstatic burp/Zram.ZF : Ljava/lang/Object;
    //   2440: checkcast java/math/BigInteger
    //   2443: invokevirtual intValue : ()I
    //   2446: bipush #32
    //   2448: irem
    //   2449: invokestatic abs : (I)I
    //   2452: invokevirtual charAt : (I)C
    //   2455: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2458: pop
    //   2459: iload_2
    //   2460: ifeq -> 3644
    //   2463: goto -> 2470
    //   2466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2469: athrow
    //   2470: aload #4
    //   2472: getstatic burp/Zzmu.ZF : Ljava/lang/String;
    //   2475: getstatic burp/Zb4a.ZJ : Ljava/lang/Object;
    //   2478: checkcast java/math/BigInteger
    //   2481: invokevirtual intValue : ()I
    //   2484: bipush #32
    //   2486: irem
    //   2487: invokestatic abs : (I)I
    //   2490: invokevirtual charAt : (I)C
    //   2493: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2496: pop
    //   2497: iload_2
    //   2498: ifeq -> 3644
    //   2501: goto -> 2508
    //   2504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2507: athrow
    //   2508: aload #4
    //   2510: getstatic burp/Zsxo.ZW : Ljava/lang/String;
    //   2513: getstatic burp/Ztsu.Zr : Ljava/lang/Object;
    //   2516: checkcast java/math/BigInteger
    //   2519: invokevirtual intValue : ()I
    //   2522: bipush #32
    //   2524: irem
    //   2525: invokestatic abs : (I)I
    //   2528: invokevirtual charAt : (I)C
    //   2531: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2534: pop
    //   2535: iload_2
    //   2536: ifeq -> 3644
    //   2539: goto -> 2546
    //   2542: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2545: athrow
    //   2546: aload #4
    //   2548: getstatic burp/Ztex.Zx : Ljava/lang/String;
    //   2551: getstatic burp/Zs8s.ZG : Ljava/lang/Object;
    //   2554: checkcast java/math/BigInteger
    //   2557: invokevirtual intValue : ()I
    //   2560: bipush #32
    //   2562: irem
    //   2563: invokestatic abs : (I)I
    //   2566: invokevirtual charAt : (I)C
    //   2569: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2572: pop
    //   2573: iload_2
    //   2574: ifeq -> 3644
    //   2577: goto -> 2584
    //   2580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2583: athrow
    //   2584: aload #4
    //   2586: getstatic burp/Zsxh.Z_ : Ljava/lang/String;
    //   2589: getstatic burp/Zgq_.ZM : Ljava/lang/Object;
    //   2592: checkcast java/math/BigInteger
    //   2595: invokevirtual intValue : ()I
    //   2598: bipush #32
    //   2600: irem
    //   2601: invokestatic abs : (I)I
    //   2604: invokevirtual charAt : (I)C
    //   2607: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2610: pop
    //   2611: iload_2
    //   2612: ifeq -> 3644
    //   2615: goto -> 2622
    //   2618: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2621: athrow
    //   2622: aload #4
    //   2624: getstatic burp/Zsj5.Zn : Ljava/lang/String;
    //   2627: getstatic burp/Zefo.ZW : Ljava/lang/Object;
    //   2630: checkcast java/math/BigInteger
    //   2633: invokevirtual intValue : ()I
    //   2636: bipush #32
    //   2638: irem
    //   2639: invokestatic abs : (I)I
    //   2642: invokevirtual charAt : (I)C
    //   2645: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2648: pop
    //   2649: iload_2
    //   2650: ifeq -> 3644
    //   2653: goto -> 2660
    //   2656: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2659: athrow
    //   2660: aload #4
    //   2662: getstatic burp/Zgpp.Zm : Ljava/lang/String;
    //   2665: getstatic burp/Ztkh.Zh : Ljava/lang/Object;
    //   2668: checkcast java/math/BigInteger
    //   2671: invokevirtual intValue : ()I
    //   2674: bipush #32
    //   2676: irem
    //   2677: invokestatic abs : (I)I
    //   2680: invokevirtual charAt : (I)C
    //   2683: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2686: pop
    //   2687: iload_2
    //   2688: ifeq -> 3644
    //   2691: goto -> 2698
    //   2694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2697: athrow
    //   2698: aload #4
    //   2700: getstatic burp/Zs2n.ZI : Ljava/lang/String;
    //   2703: getstatic burp/Zm4i.Zr : Ljava/lang/Object;
    //   2706: checkcast java/math/BigInteger
    //   2709: invokevirtual intValue : ()I
    //   2712: bipush #32
    //   2714: irem
    //   2715: invokestatic abs : (I)I
    //   2718: invokevirtual charAt : (I)C
    //   2721: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2724: pop
    //   2725: iload_2
    //   2726: ifeq -> 3644
    //   2729: goto -> 2736
    //   2732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2735: athrow
    //   2736: aload #4
    //   2738: getstatic burp/Ztex.Zx : Ljava/lang/String;
    //   2741: getstatic burp/Zztn.ZO : Ljava/lang/Object;
    //   2744: checkcast java/math/BigInteger
    //   2747: invokevirtual intValue : ()I
    //   2750: bipush #32
    //   2752: irem
    //   2753: invokestatic abs : (I)I
    //   2756: invokevirtual charAt : (I)C
    //   2759: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2762: pop
    //   2763: iload_2
    //   2764: ifeq -> 3644
    //   2767: goto -> 2774
    //   2770: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2773: athrow
    //   2774: aload #4
    //   2776: getstatic burp/Zstb.Zd : Ljava/lang/String;
    //   2779: getstatic burp/Zr48.ZZ : Ljava/lang/Object;
    //   2782: checkcast java/math/BigInteger
    //   2785: invokevirtual intValue : ()I
    //   2788: bipush #32
    //   2790: irem
    //   2791: invokestatic abs : (I)I
    //   2794: invokevirtual charAt : (I)C
    //   2797: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2800: pop
    //   2801: iload_2
    //   2802: ifeq -> 3644
    //   2805: goto -> 2812
    //   2808: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2811: athrow
    //   2812: aload #4
    //   2814: getstatic burp/Zs0_.ZH : Ljava/lang/String;
    //   2817: getstatic burp/Zke7.Zj : Ljava/lang/Object;
    //   2820: checkcast java/math/BigInteger
    //   2823: invokevirtual intValue : ()I
    //   2826: bipush #32
    //   2828: irem
    //   2829: invokestatic abs : (I)I
    //   2832: invokevirtual charAt : (I)C
    //   2835: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2838: pop
    //   2839: iload_2
    //   2840: ifeq -> 3644
    //   2843: goto -> 2850
    //   2846: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2849: athrow
    //   2850: aload #4
    //   2852: getstatic burp/Zke7.Zl : Ljava/lang/String;
    //   2855: getstatic burp/Ztdd.ZD : Ljava/lang/Object;
    //   2858: checkcast java/math/BigInteger
    //   2861: invokevirtual intValue : ()I
    //   2864: bipush #32
    //   2866: irem
    //   2867: invokestatic abs : (I)I
    //   2870: invokevirtual charAt : (I)C
    //   2873: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2876: pop
    //   2877: iload_2
    //   2878: ifeq -> 3644
    //   2881: goto -> 2888
    //   2884: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2887: athrow
    //   2888: aload #4
    //   2890: getstatic burp/Zg_5.ZG : Ljava/lang/String;
    //   2893: getstatic burp/Zxo7.Zi : Ljava/lang/Object;
    //   2896: checkcast java/math/BigInteger
    //   2899: invokevirtual intValue : ()I
    //   2902: bipush #32
    //   2904: irem
    //   2905: invokestatic abs : (I)I
    //   2908: invokevirtual charAt : (I)C
    //   2911: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2914: pop
    //   2915: iload_2
    //   2916: ifeq -> 3644
    //   2919: goto -> 2926
    //   2922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2925: athrow
    //   2926: aload #4
    //   2928: getstatic burp/Zlf0.ZS : Ljava/lang/String;
    //   2931: getstatic burp/Zz2e.Zm : Ljava/lang/Object;
    //   2934: checkcast java/math/BigInteger
    //   2937: invokevirtual intValue : ()I
    //   2940: bipush #32
    //   2942: irem
    //   2943: invokestatic abs : (I)I
    //   2946: invokevirtual charAt : (I)C
    //   2949: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2952: pop
    //   2953: iload_2
    //   2954: ifeq -> 3644
    //   2957: goto -> 2964
    //   2960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2963: athrow
    //   2964: aload #4
    //   2966: getstatic burp/Zl06.ZL : Ljava/lang/String;
    //   2969: getstatic burp/Zk7e.ZW : Ljava/lang/Object;
    //   2972: checkcast java/math/BigInteger
    //   2975: invokevirtual intValue : ()I
    //   2978: bipush #32
    //   2980: irem
    //   2981: invokestatic abs : (I)I
    //   2984: invokevirtual charAt : (I)C
    //   2987: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2990: pop
    //   2991: iload_2
    //   2992: ifeq -> 3644
    //   2995: goto -> 3002
    //   2998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3001: athrow
    //   3002: aload #4
    //   3004: getstatic burp/Zt5j.ZR : Ljava/lang/String;
    //   3007: getstatic burp/Zix.ZO : Ljava/lang/Object;
    //   3010: checkcast java/math/BigInteger
    //   3013: invokevirtual intValue : ()I
    //   3016: bipush #32
    //   3018: irem
    //   3019: invokestatic abs : (I)I
    //   3022: invokevirtual charAt : (I)C
    //   3025: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3028: pop
    //   3029: iload_2
    //   3030: ifeq -> 3644
    //   3033: goto -> 3040
    //   3036: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3039: athrow
    //   3040: aload #4
    //   3042: getstatic burp/Ze6d.Zx : Ljava/lang/String;
    //   3045: getstatic burp/Ze5t.Zc : Ljava/lang/Object;
    //   3048: checkcast java/math/BigInteger
    //   3051: invokevirtual intValue : ()I
    //   3054: bipush #32
    //   3056: irem
    //   3057: invokestatic abs : (I)I
    //   3060: invokevirtual charAt : (I)C
    //   3063: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3066: pop
    //   3067: iload_2
    //   3068: ifeq -> 3644
    //   3071: goto -> 3078
    //   3074: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3077: athrow
    //   3078: aload #4
    //   3080: getstatic burp/Zb8y.Zn : Ljava/lang/String;
    //   3083: getstatic burp/Zlx5.Zp : Ljava/lang/Object;
    //   3086: checkcast java/math/BigInteger
    //   3089: invokevirtual intValue : ()I
    //   3092: bipush #32
    //   3094: irem
    //   3095: invokestatic abs : (I)I
    //   3098: invokevirtual charAt : (I)C
    //   3101: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3104: pop
    //   3105: iload_2
    //   3106: ifeq -> 3644
    //   3109: goto -> 3116
    //   3112: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3115: athrow
    //   3116: aload #4
    //   3118: getstatic burp/Zsj5.Zn : Ljava/lang/String;
    //   3121: getstatic burp/Zlrm.ZM : Ljava/lang/Object;
    //   3124: checkcast java/math/BigInteger
    //   3127: invokevirtual intValue : ()I
    //   3130: bipush #32
    //   3132: irem
    //   3133: invokestatic abs : (I)I
    //   3136: invokevirtual charAt : (I)C
    //   3139: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3142: pop
    //   3143: iload_2
    //   3144: ifeq -> 3644
    //   3147: goto -> 3154
    //   3150: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3153: athrow
    //   3154: aload #4
    //   3156: getstatic burp/Zgzv.Zy : Ljava/lang/String;
    //   3159: getstatic burp/Zz20.ZN : Ljava/lang/Object;
    //   3162: checkcast java/math/BigInteger
    //   3165: invokevirtual intValue : ()I
    //   3168: bipush #32
    //   3170: irem
    //   3171: invokestatic abs : (I)I
    //   3174: invokevirtual charAt : (I)C
    //   3177: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3180: pop
    //   3181: iload_2
    //   3182: ifeq -> 3644
    //   3185: goto -> 3192
    //   3188: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3191: athrow
    //   3192: aload #4
    //   3194: getstatic burp/Zeqg.Zh : Ljava/lang/String;
    //   3197: getstatic burp/Zvo3.Ze : Ljava/lang/Object;
    //   3200: checkcast java/math/BigInteger
    //   3203: invokevirtual intValue : ()I
    //   3206: bipush #32
    //   3208: irem
    //   3209: invokestatic abs : (I)I
    //   3212: invokevirtual charAt : (I)C
    //   3215: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3218: pop
    //   3219: iload_2
    //   3220: ifeq -> 3644
    //   3223: goto -> 3230
    //   3226: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3229: athrow
    //   3230: aload #4
    //   3232: getstatic burp/Zgpp.Zm : Ljava/lang/String;
    //   3235: getstatic burp/Zlhy.ZN : Ljava/lang/Object;
    //   3238: checkcast java/math/BigInteger
    //   3241: invokevirtual intValue : ()I
    //   3244: bipush #32
    //   3246: irem
    //   3247: invokestatic abs : (I)I
    //   3250: invokevirtual charAt : (I)C
    //   3253: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3256: pop
    //   3257: iload_2
    //   3258: ifeq -> 3644
    //   3261: goto -> 3268
    //   3264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3267: athrow
    //   3268: aload #4
    //   3270: getstatic burp/Zg6f.Zf : Ljava/lang/String;
    //   3273: getstatic burp/Zm8v.ZU : Ljava/lang/Object;
    //   3276: checkcast java/math/BigInteger
    //   3279: invokevirtual intValue : ()I
    //   3282: bipush #32
    //   3284: irem
    //   3285: invokestatic abs : (I)I
    //   3288: invokevirtual charAt : (I)C
    //   3291: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3294: pop
    //   3295: iload_2
    //   3296: ifeq -> 3644
    //   3299: goto -> 3306
    //   3302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3305: athrow
    //   3306: aload #4
    //   3308: getstatic burp/Zm8w.ZL : Ljava/lang/String;
    //   3311: getstatic burp/Zt9_.ZN : Ljava/lang/Object;
    //   3314: checkcast java/math/BigInteger
    //   3317: invokevirtual intValue : ()I
    //   3320: bipush #32
    //   3322: irem
    //   3323: invokestatic abs : (I)I
    //   3326: invokevirtual charAt : (I)C
    //   3329: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3332: pop
    //   3333: iload_2
    //   3334: ifeq -> 3644
    //   3337: goto -> 3344
    //   3340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3343: athrow
    //   3344: aload #4
    //   3346: getstatic burp/Zlem.Zl : Ljava/lang/String;
    //   3349: getstatic burp/Ztex.Z_ : Ljava/lang/Object;
    //   3352: checkcast java/math/BigInteger
    //   3355: invokevirtual intValue : ()I
    //   3358: bipush #32
    //   3360: irem
    //   3361: invokestatic abs : (I)I
    //   3364: invokevirtual charAt : (I)C
    //   3367: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3370: pop
    //   3371: iload_2
    //   3372: ifeq -> 3644
    //   3375: goto -> 3382
    //   3378: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3381: athrow
    //   3382: aload #4
    //   3384: getstatic burp/Zb8y.Zn : Ljava/lang/String;
    //   3387: getstatic burp/Zex.ZO : Ljava/lang/Object;
    //   3390: checkcast java/math/BigInteger
    //   3393: invokevirtual intValue : ()I
    //   3396: bipush #32
    //   3398: irem
    //   3399: invokestatic abs : (I)I
    //   3402: invokevirtual charAt : (I)C
    //   3405: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3408: pop
    //   3409: iload_2
    //   3410: ifeq -> 3644
    //   3413: goto -> 3420
    //   3416: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3419: athrow
    //   3420: aload #4
    //   3422: getstatic burp/Zm6h.Za : Ljava/lang/String;
    //   3425: getstatic burp/Zevr.ZG : Ljava/lang/Object;
    //   3428: checkcast java/math/BigInteger
    //   3431: invokevirtual intValue : ()I
    //   3434: bipush #32
    //   3436: irem
    //   3437: invokestatic abs : (I)I
    //   3440: invokevirtual charAt : (I)C
    //   3443: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3446: pop
    //   3447: iload_2
    //   3448: ifeq -> 3644
    //   3451: goto -> 3458
    //   3454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3457: athrow
    //   3458: aload #4
    //   3460: getstatic burp/Zsj5.Zn : Ljava/lang/String;
    //   3463: getstatic burp/Zlrm.ZM : Ljava/lang/Object;
    //   3466: checkcast java/math/BigInteger
    //   3469: invokevirtual intValue : ()I
    //   3472: bipush #32
    //   3474: irem
    //   3475: invokestatic abs : (I)I
    //   3478: invokevirtual charAt : (I)C
    //   3481: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3484: pop
    //   3485: iload_2
    //   3486: ifeq -> 3644
    //   3489: goto -> 3496
    //   3492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3495: athrow
    //   3496: aload #4
    //   3498: getstatic burp/Ze54.ZU : Ljava/lang/String;
    //   3501: getstatic burp/Zefo.ZW : Ljava/lang/Object;
    //   3504: checkcast java/math/BigInteger
    //   3507: invokevirtual intValue : ()I
    //   3510: bipush #32
    //   3512: irem
    //   3513: invokestatic abs : (I)I
    //   3516: invokevirtual charAt : (I)C
    //   3519: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3522: pop
    //   3523: iload_2
    //   3524: ifeq -> 3644
    //   3527: goto -> 3534
    //   3530: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3533: athrow
    //   3534: aload #4
    //   3536: getstatic burp/Ztcv.Zl : Ljava/lang/String;
    //   3539: getstatic burp/Zlh8.Zm : Ljava/lang/Object;
    //   3542: checkcast java/math/BigInteger
    //   3545: invokevirtual intValue : ()I
    //   3548: bipush #32
    //   3550: irem
    //   3551: invokestatic abs : (I)I
    //   3554: invokevirtual charAt : (I)C
    //   3557: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3560: pop
    //   3561: iload_2
    //   3562: ifeq -> 3644
    //   3565: goto -> 3572
    //   3568: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3571: athrow
    //   3572: aload #4
    //   3574: getstatic burp/Zr2i.Z_ : Ljava/lang/String;
    //   3577: getstatic burp/Zvo3.Ze : Ljava/lang/Object;
    //   3580: checkcast java/math/BigInteger
    //   3583: invokevirtual intValue : ()I
    //   3586: bipush #32
    //   3588: irem
    //   3589: invokestatic abs : (I)I
    //   3592: invokevirtual charAt : (I)C
    //   3595: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3598: pop
    //   3599: iload_2
    //   3600: ifeq -> 3644
    //   3603: goto -> 3610
    //   3606: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3609: athrow
    //   3610: aload #4
    //   3612: getstatic burp/Zlhq.Zl : Ljava/lang/String;
    //   3615: getstatic burp/Ztlz.ZW : Ljava/lang/Object;
    //   3618: checkcast java/math/BigInteger
    //   3621: invokevirtual intValue : ()I
    //   3624: bipush #32
    //   3626: irem
    //   3627: invokestatic abs : (I)I
    //   3630: invokevirtual charAt : (I)C
    //   3633: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   3636: pop
    //   3637: goto -> 3644
    //   3640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3643: athrow
    //   3644: iinc #5, 1
    //   3647: iload_2
    //   3648: ifeq -> 2279
    //   3651: aload #4
    //   3653: invokevirtual toString : ()Ljava/lang/String;
    //   3656: putstatic burp/Zza8.Zm : Ljava/lang/String;
    //   3659: sipush #-29967
    //   3662: sipush #-15199
    //   3665: invokestatic a : (II)Ljava/lang/String;
    //   3668: iconst_1
    //   3669: ldc burp/Zs4v
    //   3671: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3674: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3677: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3680: astore #5
    //   3682: aload #5
    //   3684: arraylength
    //   3685: istore #6
    //   3687: iconst_0
    //   3688: istore #7
    //   3690: iload #7
    //   3692: iload #6
    //   3694: if_icmpge -> 3832
    //   3697: aload #5
    //   3699: iload #7
    //   3701: aaload
    //   3702: astore #8
    //   3704: aload #8
    //   3706: invokevirtual getModifiers : ()I
    //   3709: invokestatic isStatic : (I)Z
    //   3712: ifne -> 3722
    //   3715: goto -> 3825
    //   3718: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3721: athrow
    //   3722: aload #8
    //   3724: invokevirtual getType : ()Ljava/lang/Class;
    //   3727: astore #9
    //   3729: aload #9
    //   3731: ifnull -> 3812
    //   3734: aload #9
    //   3736: invokevirtual isPrimitive : ()Z
    //   3739: ifne -> 3812
    //   3742: goto -> 3749
    //   3745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3748: athrow
    //   3749: aload #9
    //   3751: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3754: ifnull -> 3812
    //   3757: goto -> 3764
    //   3760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3763: athrow
    //   3764: aload #9
    //   3766: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3769: invokevirtual getName : ()Ljava/lang/String;
    //   3772: ifnull -> 3812
    //   3775: goto -> 3782
    //   3778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3781: athrow
    //   3782: aload #9
    //   3784: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3787: invokevirtual getName : ()Ljava/lang/String;
    //   3790: sipush #-29964
    //   3793: sipush #-7747
    //   3796: invokestatic a : (II)Ljava/lang/String;
    //   3799: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3802: ifne -> 3812
    //   3805: goto -> 3812
    //   3808: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3811: athrow
    //   3812: aload #8
    //   3814: iconst_1
    //   3815: invokevirtual setAccessible : (Z)V
    //   3818: aload #8
    //   3820: aconst_null
    //   3821: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3824: pop
    //   3825: iinc #7, 1
    //   3828: iload_2
    //   3829: ifeq -> 3690
    //   3832: sipush #-29968
    //   3835: sipush #-4052
    //   3838: invokestatic a : (II)Ljava/lang/String;
    //   3841: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3844: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3847: astore #5
    //   3849: aload #5
    //   3851: arraylength
    //   3852: istore #6
    //   3854: iconst_0
    //   3855: istore #7
    //   3857: iload #7
    //   3859: iload #6
    //   3861: if_icmpge -> 3994
    //   3864: aload #5
    //   3866: iload #7
    //   3868: aaload
    //   3869: astore #8
    //   3871: aload #8
    //   3873: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3876: pop
    //   3877: aload #8
    //   3879: invokevirtual getModifiers : ()I
    //   3882: invokestatic isStatic : (I)Z
    //   3885: ifeq -> 3980
    //   3888: aload #8
    //   3890: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3893: arraylength
    //   3894: iconst_2
    //   3895: if_icmpne -> 3980
    //   3898: goto -> 3905
    //   3901: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3904: athrow
    //   3905: aload #8
    //   3907: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3910: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   3913: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3916: ifeq -> 3980
    //   3919: goto -> 3926
    //   3922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3925: athrow
    //   3926: aload #8
    //   3928: iconst_1
    //   3929: invokevirtual setAccessible : (Z)V
    //   3932: aload #8
    //   3934: aconst_null
    //   3935: iconst_2
    //   3936: anewarray java/lang/Object
    //   3939: dup
    //   3940: iconst_0
    //   3941: aload_0
    //   3942: aastore
    //   3943: dup
    //   3944: iconst_1
    //   3945: aload_1
    //   3946: ifnonnull -> 3964
    //   3949: goto -> 3956
    //   3952: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3955: athrow
    //   3956: aload_1
    //   3957: goto -> 3971
    //   3960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3963: athrow
    //   3964: aload_1
    //   3965: checkcast [B
    //   3968: invokevirtual clone : ()Ljava/lang/Object;
    //   3971: aastore
    //   3972: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3975: pop
    //   3976: iload_2
    //   3977: ifeq -> 3994
    //   3980: iinc #7, 1
    //   3983: iload_2
    //   3984: ifeq -> 3857
    //   3987: goto -> 3994
    //   3990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3993: athrow
    //   3994: getstatic burp/Zlem.Zl : Ljava/lang/String;
    //   3997: getstatic burp/Zxjk.Zk : Ljava/lang/Object;
    //   4000: checkcast java/math/BigInteger
    //   4003: invokevirtual intValue : ()I
    //   4006: bipush #32
    //   4008: irem
    //   4009: invokestatic abs : (I)I
    //   4012: invokevirtual charAt : (I)C
    //   4015: getstatic burp/Zzoi.ZR : Ljava/lang/String;
    //   4018: getstatic burp/Zeb7.ZJ : Ljava/lang/Object;
    //   4021: checkcast java/math/BigInteger
    //   4024: invokevirtual intValue : ()I
    //   4027: bipush #32
    //   4029: irem
    //   4030: invokestatic abs : (I)I
    //   4033: invokevirtual charAt : (I)C
    //   4036: if_icmpgt -> 4151
    //   4039: getstatic burp/Zkll.ZX : Ljava/lang/String;
    //   4042: getstatic burp/Zmj8.Zz : Ljava/lang/Object;
    //   4045: checkcast java/math/BigInteger
    //   4048: invokevirtual intValue : ()I
    //   4051: bipush #32
    //   4053: irem
    //   4054: invokestatic abs : (I)I
    //   4057: invokevirtual charAt : (I)C
    //   4060: getstatic burp/Zs_v.Zn : Ljava/lang/String;
    //   4063: getstatic burp/Ze5f.Zh : Ljava/lang/Object;
    //   4066: checkcast java/math/BigInteger
    //   4069: invokevirtual intValue : ()I
    //   4072: bipush #32
    //   4074: irem
    //   4075: invokestatic abs : (I)I
    //   4078: invokevirtual charAt : (I)C
    //   4081: if_icmpgt -> 4151
    //   4084: goto -> 4091
    //   4087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4090: athrow
    //   4091: getstatic burp/Zm3p.ZE : Ljava/lang/String;
    //   4094: getstatic burp/Zrcy.Zr : Ljava/lang/Object;
    //   4097: checkcast java/math/BigInteger
    //   4100: invokevirtual intValue : ()I
    //   4103: bipush #32
    //   4105: irem
    //   4106: invokestatic abs : (I)I
    //   4109: invokevirtual charAt : (I)C
    //   4112: getstatic burp/Zmsn.ZD : Ljava/lang/String;
    //   4115: getstatic burp/Zs8y.ZG : Ljava/lang/Object;
    //   4118: checkcast java/math/BigInteger
    //   4121: invokevirtual intValue : ()I
    //   4124: bipush #32
    //   4126: irem
    //   4127: invokestatic abs : (I)I
    //   4130: invokevirtual charAt : (I)C
    //   4133: if_icmple -> 4151
    //   4136: goto -> 4143
    //   4139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4142: athrow
    //   4143: iconst_1
    //   4144: goto -> 4152
    //   4147: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4150: athrow
    //   4151: iconst_0
    //   4152: ireturn
    //   4153: astore_3
    //   4154: new java/lang/Exception
    //   4157: dup
    //   4158: aload_3
    //   4159: invokevirtual getMessage : ()Ljava/lang/String;
    //   4162: invokespecial <init> : (Ljava/lang/String;)V
    //   4165: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4152	4153	java/lang/Throwable
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
    //   1394	1408	1411	java/lang/Throwable
    //   1401	1422	1425	java/lang/Throwable
    //   1415	1436	1439	java/lang/Throwable
    //   1429	1450	1453	java/lang/Throwable
    //   1443	1464	1467	java/lang/Throwable
    //   1457	1478	1481	java/lang/Throwable
    //   1471	1492	1495	java/lang/Throwable
    //   1485	1506	1509	java/lang/Throwable
    //   1499	1516	1519	java/lang/Throwable
    //   1557	1571	1574	java/lang/Throwable
    //   1564	1585	1588	java/lang/Throwable
    //   1578	1599	1602	java/lang/Throwable
    //   1592	1613	1616	java/lang/Throwable
    //   1606	1627	1630	java/lang/Throwable
    //   1620	1641	1644	java/lang/Throwable
    //   1634	1655	1658	java/lang/Throwable
    //   1648	1669	1672	java/lang/Throwable
    //   1662	1686	1689	java/lang/Throwable
    //   1755	1775	1778	java/lang/Throwable
    //   1765	1792	1795	java/lang/Throwable
    //   1782	1810	1813	java/lang/Throwable
    //   1799	1827	1830	java/lang/Throwable
    //   1817	1845	1848	java/lang/Throwable
    //   1834	1862	1865	java/lang/Throwable
    //   1852	1879	1882	java/lang/Throwable
    //   1869	1904	1907	java/lang/Throwable
    //   1886	1921	1924	java/lang/Throwable
    //   1911	1938	1941	java/lang/Throwable
    //   1928	1963	1966	java/lang/Throwable
    //   1945	1980	1983	java/lang/Throwable
    //   1970	1997	2000	java/lang/Throwable
    //   1987	2018	2021	java/lang/Throwable
    //   2154	2191	2194	java/lang/Throwable
    //   2198	2241	2244	java/lang/Throwable
    //   2286	2463	2466	java/lang/Throwable
    //   2432	2501	2504	java/lang/Throwable
    //   2470	2539	2542	java/lang/Throwable
    //   2508	2577	2580	java/lang/Throwable
    //   2546	2615	2618	java/lang/Throwable
    //   2584	2653	2656	java/lang/Throwable
    //   2622	2691	2694	java/lang/Throwable
    //   2660	2729	2732	java/lang/Throwable
    //   2698	2767	2770	java/lang/Throwable
    //   2736	2805	2808	java/lang/Throwable
    //   2774	2843	2846	java/lang/Throwable
    //   2812	2881	2884	java/lang/Throwable
    //   2850	2919	2922	java/lang/Throwable
    //   2888	2957	2960	java/lang/Throwable
    //   2926	2995	2998	java/lang/Throwable
    //   2964	3033	3036	java/lang/Throwable
    //   3002	3071	3074	java/lang/Throwable
    //   3040	3109	3112	java/lang/Throwable
    //   3078	3147	3150	java/lang/Throwable
    //   3116	3185	3188	java/lang/Throwable
    //   3154	3223	3226	java/lang/Throwable
    //   3192	3261	3264	java/lang/Throwable
    //   3230	3299	3302	java/lang/Throwable
    //   3268	3337	3340	java/lang/Throwable
    //   3306	3375	3378	java/lang/Throwable
    //   3344	3413	3416	java/lang/Throwable
    //   3382	3451	3454	java/lang/Throwable
    //   3420	3489	3492	java/lang/Throwable
    //   3458	3527	3530	java/lang/Throwable
    //   3496	3565	3568	java/lang/Throwable
    //   3534	3603	3606	java/lang/Throwable
    //   3572	3637	3640	java/lang/Throwable
    //   3704	3718	3718	java/lang/Throwable
    //   3729	3742	3745	java/lang/Throwable
    //   3734	3757	3760	java/lang/Throwable
    //   3749	3775	3778	java/lang/Throwable
    //   3764	3805	3808	java/lang/Throwable
    //   3871	3898	3901	java/lang/Throwable
    //   3888	3919	3922	java/lang/Throwable
    //   3905	3949	3952	java/lang/Throwable
    //   3926	3960	3960	java/lang/Throwable
    //   3971	3987	3990	java/lang/Throwable
    //   3994	4084	4087	java/lang/Throwable
    //   4039	4136	4139	java/lang/Throwable
    //   4091	4147	4147	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '3ë^¤ EA(Lñï©¸Åjß+\\b3PvVÆÁ¯²8 Ì0dIYWs?ÀoÚº²'}×URÂË¼}ï;\\týS³¬b¼Ù[\\tÓ+B¼§Ùä\\tJSq³rbkå}'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #56
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
    //   67: ldc '7×Ùës>ú³2ï*û8B{¦91õ\\f°¦ÿaó{MYâ½§va,ÒÉòy¢$F\\tûàKëZP\\fÙÎÉ)BÁû\\tÖ2fó#~ '
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #76
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #60
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
    //   128: putstatic burp/Zmhi.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmhi.b : [Ljava/lang/String;
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
    //   212: bipush #17
    //   214: goto -> 244
    //   217: bipush #58
    //   219: goto -> 244
    //   222: bipush #121
    //   224: goto -> 244
    //   227: bipush #10
    //   229: goto -> 244
    //   232: bipush #94
    //   234: goto -> 244
    //   237: bipush #78
    //   239: goto -> 244
    //   242: bipush #93
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #20
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-97
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #75
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #122
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-101
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #14
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #94
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #34
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #43
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-34
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-22
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #75
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-54
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-118
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #70
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-25
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-112
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #58
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-34
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-117
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #100
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-124
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #41
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #69
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #21
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #58
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #86
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #91
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #11
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #84
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #-2
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #16
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zmhi.ZZ : Ljava/lang/Object;
    //   501: sipush #-29963
    //   504: sipush #19371
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zmhi.ZQ : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8AF4) & 0xFFFF;
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
      char c = '°';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmhi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */