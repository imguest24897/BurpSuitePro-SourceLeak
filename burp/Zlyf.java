package burp;

import java.math.BigInteger;

class Zlyf extends ClassLoader {
  static String ZU;
  
  static Object Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZQ(Object paramObject) {
    Zgdj.Zt = a(-6623, 30122);
    Zgdj.ZT = new BigInteger(a(-6622, -32486));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zgd7.Zs.charAt(Math.abs(((BigInteger)Zmjr.ZU).intValue() % 32)) > ZU.charAt(Math.abs(((BigInteger)Zs6g.Zq).intValue() % 32))) {
          try {
            Zgii.Zl(Class.forName(a(-6618, 14601)));
            if (!bool)
              Zm5p.Zh(Class.forName(a(-6619, -24352))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zm5p.Zh(Class.forName(a(-6619, -24352)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZB(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zbxp.ZS : Ljava/lang/String;
    //   172: getstatic burp/Zre1.ZN : Ljava/lang/Object;
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
    //   206: getstatic burp/Ztd6.Zu : Ljava/lang/String;
    //   209: getstatic burp/Zzy5.ZG : Ljava/lang/Object;
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
    //   243: getstatic burp/Zz58.ZT : Ljava/lang/String;
    //   246: getstatic burp/Zzwl.Z_ : Ljava/lang/Object;
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
    //   280: getstatic burp/Zxtn.Zu : Ljava/lang/String;
    //   283: getstatic burp/Zxoa.Zr : Ljava/lang/Object;
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
    //   317: getstatic burp/Zl_9.ZP : Ljava/lang/String;
    //   320: getstatic burp/Zz58.ZD : Ljava/lang/Object;
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
    //   354: getstatic burp/Zzv.Zy : Ljava/lang/String;
    //   357: getstatic burp/Zejg.ZR : Ljava/lang/Object;
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
    //   391: getstatic burp/Zkul.ZJ : Ljava/lang/String;
    //   394: getstatic burp/Zxrd.ZL : Ljava/lang/Object;
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
    //   428: getstatic burp/Zewo.ZM : Ljava/lang/String;
    //   431: getstatic burp/Zoa.ZI : Ljava/lang/Object;
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
    //   465: getstatic burp/Zk7w.ZB : Ljava/lang/String;
    //   468: getstatic burp/Zm06.ZU : Ljava/lang/Object;
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
    //   502: getstatic burp/Zead.Zo : Ljava/lang/String;
    //   505: getstatic burp/Zs59.Zw : Ljava/lang/Object;
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
    //   539: getstatic burp/Ztd6.Zu : Ljava/lang/String;
    //   542: getstatic burp/Zls_.ZR : Ljava/lang/Object;
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
    //   576: getstatic burp/Zbxp.ZS : Ljava/lang/String;
    //   579: getstatic burp/Zs9u.Zd : Ljava/lang/Object;
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
    //   613: getstatic burp/Zead.Zo : Ljava/lang/String;
    //   616: getstatic burp/Zxtn.ZY : Ljava/lang/Object;
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
    //   650: getstatic burp/Ztid.Zz : Ljava/lang/String;
    //   653: getstatic burp/Zxtn.ZY : Ljava/lang/Object;
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
    //   687: getstatic burp/Zly0.ZE : Ljava/lang/String;
    //   690: getstatic burp/Zezz.Zu : Ljava/lang/Object;
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
    //   724: getstatic burp/Zko9.Zf : Ljava/lang/String;
    //   727: getstatic burp/Zlyf.Zm : Ljava/lang/Object;
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
    //   761: getstatic burp/Zs59.Zc : Ljava/lang/String;
    //   764: getstatic burp/Zmiy.Zi : Ljava/lang/Object;
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
    //   798: getstatic burp/Ztid.Zz : Ljava/lang/String;
    //   801: getstatic burp/Zk7w.ZF : Ljava/lang/Object;
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
    //   835: getstatic burp/Ztid.Zz : Ljava/lang/String;
    //   838: getstatic burp/Zly0.ZB : Ljava/lang/Object;
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
    //   872: getstatic burp/Zxn7.ZG : Ljava/lang/String;
    //   875: getstatic burp/Zebj.Zf : Ljava/lang/Object;
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
    //   909: getstatic burp/Zzvr.Zc : Ljava/lang/String;
    //   912: getstatic burp/Zty5.Zf : Ljava/lang/Object;
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
    //   946: getstatic burp/Zre1.ZA : Ljava/lang/String;
    //   949: getstatic burp/Zei_.Za : Ljava/lang/Object;
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
    //   983: getstatic burp/Zmjr.Zc : Ljava/lang/String;
    //   986: getstatic burp/Zlno.ZU : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zr_k.Zu : Ljava/lang/String;
    //   1023: getstatic burp/Zljx.ZZ : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zxnm.Zw : Ljava/lang/String;
    //   1060: getstatic burp/Zbxp.ZW : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zkvq.Zg : Ljava/lang/String;
    //   1097: getstatic burp/Zxn7.ZU : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zblv.ZF : Ljava/lang/String;
    //   1134: getstatic burp/Zls_.ZR : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zr8g.ZH : Ljava/lang/String;
    //   1171: getstatic burp/Zxoa.Zr : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zmt6.Zx : Ljava/lang/String;
    //   1208: getstatic burp/Zko9.ZC : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zr3x.ZM : Ljava/lang/String;
    //   1245: getstatic burp/Zgny.ZR : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zr8g.ZH : Ljava/lang/String;
    //   1282: getstatic burp/Zoa.ZI : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zl_1.ZH : Ljava/lang/String;
    //   1319: getstatic burp/Ztes.ZX : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zlyf.ZU : Ljava/lang/String;
    //   1362: getstatic burp/Zm06.ZU : Ljava/lang/Object;
    //   1365: checkcast java/math/BigInteger
    //   1368: invokevirtual toByteArray : ()[B
    //   1371: astore #4
    //   1373: new java/lang/StringBuilder
    //   1376: dup
    //   1377: invokespecial <init> : ()V
    //   1380: astore #6
    //   1382: aload #6
    //   1384: sipush #-6616
    //   1387: sipush #-7513
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
    //   1441: sipush #-6610
    //   1444: sipush #-13122
    //   1447: invokestatic a : (II)Ljava/lang/String;
    //   1450: ldc ''
    //   1452: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1455: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1458: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1461: pop
    //   1462: aload #6
    //   1464: sipush #-6617
    //   1467: sipush #19358
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
    //   2051: sipush #-6620
    //   2054: sipush #32305
    //   2057: invokestatic a : (II)Ljava/lang/String;
    //   2060: iconst_1
    //   2061: ldc burp/Zm7x
    //   2063: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2066: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2069: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2072: astore #4
    //   2074: aload #4
    //   2076: arraylength
    //   2077: istore #5
    //   2079: iconst_0
    //   2080: istore #6
    //   2082: iload #6
    //   2084: iload #5
    //   2086: if_icmpge -> 2224
    //   2089: aload #4
    //   2091: iload #6
    //   2093: aaload
    //   2094: astore #7
    //   2096: aload #7
    //   2098: invokevirtual getModifiers : ()I
    //   2101: invokestatic isStatic : (I)Z
    //   2104: ifne -> 2114
    //   2107: goto -> 2217
    //   2110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2113: athrow
    //   2114: aload #7
    //   2116: invokevirtual getType : ()Ljava/lang/Class;
    //   2119: astore #8
    //   2121: aload #8
    //   2123: ifnull -> 2204
    //   2126: aload #8
    //   2128: invokevirtual isPrimitive : ()Z
    //   2131: ifne -> 2204
    //   2134: goto -> 2141
    //   2137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2140: athrow
    //   2141: aload #8
    //   2143: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2146: ifnull -> 2204
    //   2149: goto -> 2156
    //   2152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2155: athrow
    //   2156: aload #8
    //   2158: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2161: invokevirtual getName : ()Ljava/lang/String;
    //   2164: ifnull -> 2204
    //   2167: goto -> 2174
    //   2170: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2173: athrow
    //   2174: aload #8
    //   2176: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2179: invokevirtual getName : ()Ljava/lang/String;
    //   2182: sipush #-6615
    //   2185: sipush #-11284
    //   2188: invokestatic a : (II)Ljava/lang/String;
    //   2191: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2194: ifne -> 2204
    //   2197: goto -> 2204
    //   2200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2203: athrow
    //   2204: aload #7
    //   2206: iconst_1
    //   2207: invokevirtual setAccessible : (Z)V
    //   2210: aload #7
    //   2212: aconst_null
    //   2213: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2216: pop
    //   2217: iinc #6, 1
    //   2220: iload_2
    //   2221: ifne -> 2082
    //   2224: sipush #-6612
    //   2227: sipush #-21395
    //   2230: invokestatic a : (II)Ljava/lang/String;
    //   2233: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2236: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2239: astore #4
    //   2241: aload #4
    //   2243: arraylength
    //   2244: istore #5
    //   2246: iconst_0
    //   2247: istore #6
    //   2249: iload #6
    //   2251: iload #5
    //   2253: if_icmpge -> 2386
    //   2256: aload #4
    //   2258: iload #6
    //   2260: aaload
    //   2261: astore #7
    //   2263: aload #7
    //   2265: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2268: pop
    //   2269: aload #7
    //   2271: invokevirtual getModifiers : ()I
    //   2274: invokestatic isStatic : (I)Z
    //   2277: ifeq -> 2372
    //   2280: aload #7
    //   2282: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2285: arraylength
    //   2286: iconst_2
    //   2287: if_icmpne -> 2372
    //   2290: goto -> 2297
    //   2293: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2296: athrow
    //   2297: aload #7
    //   2299: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2302: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2305: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2308: ifeq -> 2372
    //   2311: goto -> 2318
    //   2314: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2317: athrow
    //   2318: aload #7
    //   2320: iconst_1
    //   2321: invokevirtual setAccessible : (Z)V
    //   2324: aload #7
    //   2326: aconst_null
    //   2327: iconst_2
    //   2328: anewarray java/lang/Object
    //   2331: dup
    //   2332: iconst_0
    //   2333: aload_0
    //   2334: aastore
    //   2335: dup
    //   2336: iconst_1
    //   2337: aload_1
    //   2338: ifnonnull -> 2356
    //   2341: goto -> 2348
    //   2344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2347: athrow
    //   2348: aload_1
    //   2349: goto -> 2363
    //   2352: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2355: athrow
    //   2356: aload_1
    //   2357: checkcast [B
    //   2360: invokevirtual clone : ()Ljava/lang/Object;
    //   2363: aastore
    //   2364: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2367: pop
    //   2368: iload_2
    //   2369: ifne -> 2386
    //   2372: iinc #6, 1
    //   2375: iload_2
    //   2376: ifne -> 2249
    //   2379: goto -> 2386
    //   2382: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2385: athrow
    //   2386: new java/io/ByteArrayOutputStream
    //   2389: dup
    //   2390: invokespecial <init> : ()V
    //   2393: astore #4
    //   2395: sipush #-6624
    //   2398: aload #4
    //   2400: sipush #202
    //   2403: invokevirtual write : (I)V
    //   2406: sipush #-2603
    //   2409: aload #4
    //   2411: sipush #254
    //   2414: invokevirtual write : (I)V
    //   2417: aload #4
    //   2419: sipush #186
    //   2422: invokevirtual write : (I)V
    //   2425: aload #4
    //   2427: sipush #190
    //   2430: invokevirtual write : (I)V
    //   2433: aload #4
    //   2435: iconst_0
    //   2436: invokevirtual write : (I)V
    //   2439: aload #4
    //   2441: iconst_1
    //   2442: invokevirtual write : (I)V
    //   2445: aload #4
    //   2447: iconst_0
    //   2448: invokevirtual write : (I)V
    //   2451: aload #4
    //   2453: bipush #50
    //   2455: invokevirtual write : (I)V
    //   2458: aload #4
    //   2460: getstatic burp/Zrom.ZF : Ljava/lang/Object;
    //   2463: checkcast java/math/BigInteger
    //   2466: invokevirtual toByteArray : ()[B
    //   2469: invokevirtual write : ([B)V
    //   2472: aload #4
    //   2474: getstatic burp/Ze64.ZW : Ljava/lang/Object;
    //   2477: checkcast java/math/BigInteger
    //   2480: invokevirtual toByteArray : ()[B
    //   2483: invokevirtual write : ([B)V
    //   2486: aload #4
    //   2488: getstatic burp/Zbu6.ZJ : Ljava/lang/Object;
    //   2491: checkcast java/math/BigInteger
    //   2494: invokevirtual toByteArray : ()[B
    //   2497: invokevirtual write : ([B)V
    //   2500: aload #4
    //   2502: invokevirtual toByteArray : ()[B
    //   2505: astore #5
    //   2507: aconst_null
    //   2508: astore #6
    //   2510: invokestatic a : (II)Ljava/lang/String;
    //   2513: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2516: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2519: astore #7
    //   2521: aload #7
    //   2523: arraylength
    //   2524: istore #8
    //   2526: iconst_0
    //   2527: istore #9
    //   2529: iload #9
    //   2531: iload #8
    //   2533: if_icmpge -> 2661
    //   2536: aload #7
    //   2538: iload #9
    //   2540: aaload
    //   2541: astore #10
    //   2543: aload #10
    //   2545: invokevirtual getName : ()Ljava/lang/String;
    //   2548: sipush #-6621
    //   2551: sipush #20984
    //   2554: invokestatic a : (II)Ljava/lang/String;
    //   2557: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2560: ifeq -> 2654
    //   2563: aload #10
    //   2565: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2568: astore #11
    //   2570: aload #11
    //   2572: arraylength
    //   2573: iconst_4
    //   2574: if_icmpeq -> 2584
    //   2577: goto -> 2654
    //   2580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2583: athrow
    //   2584: aload #11
    //   2586: iconst_0
    //   2587: aaload
    //   2588: ldc java/lang/String
    //   2590: if_acmpeq -> 2600
    //   2593: goto -> 2654
    //   2596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2599: athrow
    //   2600: aload #11
    //   2602: iconst_1
    //   2603: aaload
    //   2604: ldc [B
    //   2606: if_acmpeq -> 2616
    //   2609: goto -> 2654
    //   2612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2615: athrow
    //   2616: aload #11
    //   2618: iconst_2
    //   2619: aaload
    //   2620: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   2623: if_acmpeq -> 2633
    //   2626: goto -> 2654
    //   2629: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2632: athrow
    //   2633: aload #11
    //   2635: iconst_3
    //   2636: aaload
    //   2637: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   2640: if_acmpeq -> 2650
    //   2643: goto -> 2654
    //   2646: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2649: athrow
    //   2650: aload #10
    //   2652: astore #6
    //   2654: iinc #9, 1
    //   2657: iload_2
    //   2658: ifne -> 2529
    //   2661: aload #6
    //   2663: iconst_1
    //   2664: invokevirtual setAccessible : (Z)V
    //   2667: ldc burp/Zzr
    //   2669: iconst_0
    //   2670: anewarray java/lang/Class
    //   2673: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   2676: astore #7
    //   2678: aload #7
    //   2680: iconst_1
    //   2681: invokevirtual setAccessible : (Z)V
    //   2684: aload #6
    //   2686: aload #7
    //   2688: iconst_0
    //   2689: anewarray java/lang/Object
    //   2692: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   2695: iconst_4
    //   2696: anewarray java/lang/Object
    //   2699: dup
    //   2700: iconst_0
    //   2701: sipush #-6609
    //   2704: sipush #-31982
    //   2707: invokestatic a : (II)Ljava/lang/String;
    //   2710: aastore
    //   2711: dup
    //   2712: iconst_1
    //   2713: aload #5
    //   2715: aastore
    //   2716: dup
    //   2717: iconst_2
    //   2718: iconst_0
    //   2719: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2722: aastore
    //   2723: dup
    //   2724: iconst_3
    //   2725: aload #5
    //   2727: arraylength
    //   2728: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2731: aastore
    //   2732: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2735: pop
    //   2736: goto -> 2741
    //   2739: astore #4
    //   2741: getstatic burp/Zr8g.ZH : Ljava/lang/String;
    //   2744: getstatic burp/Zxrd.ZL : Ljava/lang/Object;
    //   2747: checkcast java/math/BigInteger
    //   2750: invokevirtual intValue : ()I
    //   2753: bipush #32
    //   2755: irem
    //   2756: invokestatic abs : (I)I
    //   2759: invokevirtual charAt : (I)C
    //   2762: getstatic burp/Zg97.ZX : Ljava/lang/String;
    //   2765: getstatic burp/Zxoa.Zr : Ljava/lang/Object;
    //   2768: checkcast java/math/BigInteger
    //   2771: invokevirtual intValue : ()I
    //   2774: bipush #32
    //   2776: irem
    //   2777: invokestatic abs : (I)I
    //   2780: invokevirtual charAt : (I)C
    //   2783: if_icmpgt -> 2890
    //   2786: getstatic burp/Zgdt.Zd : Ljava/lang/String;
    //   2789: getstatic burp/Zoa.ZI : Ljava/lang/Object;
    //   2792: checkcast java/math/BigInteger
    //   2795: invokevirtual intValue : ()I
    //   2798: bipush #32
    //   2800: irem
    //   2801: invokestatic abs : (I)I
    //   2804: invokevirtual charAt : (I)C
    //   2807: getstatic burp/Zs33.ZX : Ljava/lang/String;
    //   2810: getstatic burp/Zs_.Zs : Ljava/lang/Object;
    //   2813: checkcast java/math/BigInteger
    //   2816: invokevirtual intValue : ()I
    //   2819: bipush #32
    //   2821: irem
    //   2822: invokestatic abs : (I)I
    //   2825: invokevirtual charAt : (I)C
    //   2828: if_icmple -> 2890
    //   2831: goto -> 2838
    //   2834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2837: athrow
    //   2838: getstatic burp/Zzy5.ZD : Ljava/lang/String;
    //   2841: getstatic burp/Zmjr.ZU : Ljava/lang/Object;
    //   2844: checkcast java/math/BigInteger
    //   2847: invokevirtual intValue : ()I
    //   2850: bipush #32
    //   2852: irem
    //   2853: invokestatic abs : (I)I
    //   2856: invokevirtual charAt : (I)C
    //   2859: getstatic burp/Zlyf.ZU : Ljava/lang/String;
    //   2862: getstatic burp/Zs6g.Zq : Ljava/lang/Object;
    //   2865: checkcast java/math/BigInteger
    //   2868: invokevirtual intValue : ()I
    //   2871: bipush #32
    //   2873: irem
    //   2874: invokestatic abs : (I)I
    //   2877: invokevirtual charAt : (I)C
    //   2880: if_icmpgt -> 2898
    //   2883: goto -> 2890
    //   2886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2889: athrow
    //   2890: iconst_1
    //   2891: goto -> 2899
    //   2894: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2897: athrow
    //   2898: iconst_0
    //   2899: ireturn
    //   2900: astore_3
    //   2901: new java/lang/Exception
    //   2904: dup
    //   2905: aload_3
    //   2906: invokevirtual getMessage : ()Ljava/lang/String;
    //   2909: invokespecial <init> : (Ljava/lang/String;)V
    //   2912: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2899	2900	java/lang/Throwable
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
    //   2096	2110	2110	java/lang/Throwable
    //   2121	2134	2137	java/lang/Throwable
    //   2126	2149	2152	java/lang/Throwable
    //   2141	2167	2170	java/lang/Throwable
    //   2156	2197	2200	java/lang/Throwable
    //   2263	2290	2293	java/lang/Throwable
    //   2280	2311	2314	java/lang/Throwable
    //   2297	2341	2344	java/lang/Throwable
    //   2318	2352	2352	java/lang/Throwable
    //   2363	2379	2382	java/lang/Throwable
    //   2386	2736	2739	java/lang/Throwable
    //   2570	2580	2580	java/lang/Throwable
    //   2584	2596	2596	java/lang/Throwable
    //   2600	2612	2612	java/lang/Throwable
    //   2616	2629	2629	java/lang/Throwable
    //   2633	2646	2646	java/lang/Throwable
    //   2741	2831	2834	java/lang/Throwable
    //   2786	2883	2886	java/lang/Throwable
    //   2838	2894	2894	java/lang/Throwable
  }
  
  static void Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'WÙ-l}oæ\\tÔ÷º{\\b¶Û,uî\\t`)`ðÔ¢NNï-ÄPR¸§j`N¡ lÐqÀ Îê=¼µùMý£5jxÓ¯ægBz9\\fÆµ?öB±¦MÃ:¯¼ÍJR¼ºÈPÊã\\fÇôH³ýJªx³¬%XzQ1[kÒENý6º^k"Y£5\\t¶¹ÌÁ§ÙI8¦ÁHNÞ>áûkj1»Ó×âLUK\\t¾ C"Z N¾²¥àÂ_TÎ»õÀ?!¬UÑTp©¸Ð©7Nd»Ïû\\bwÝ)ì]dÙ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #65
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
    //   68: ldc 'tÃeæ!·®FDõgr¶J5\\bÇtMÿ#CmcÔ!¨\TL'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #62
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
    //   129: putstatic burp/Zlyf.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlyf.b : [Ljava/lang/String;
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
    //   212: bipush #31
    //   214: goto -> 244
    //   217: bipush #85
    //   219: goto -> 244
    //   222: bipush #17
    //   224: goto -> 244
    //   227: bipush #63
    //   229: goto -> 244
    //   232: bipush #121
    //   234: goto -> 244
    //   237: bipush #90
    //   239: goto -> 244
    //   242: bipush #6
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
    //   300: sipush #-6611
    //   303: sipush #10109
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zlyf.ZU : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #48
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #47
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #71
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #125
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-47
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #24
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-46
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #7
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #45
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-45
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-18
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-14
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: iconst_4
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-61
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-48
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-45
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-76
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #95
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-48
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #111
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #9
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-4
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #24
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-108
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-80
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-91
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-128
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #-18
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-64
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #10
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-19
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #30
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zlyf.Zm : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE624) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlyf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */