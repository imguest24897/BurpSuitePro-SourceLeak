package burp;

import java.math.BigInteger;

class Zma8 extends ClassLoader {
  static Object Zb;
  
  static String Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zl(Object paramObject) {
    Ze82.Zx = a(21029, -17362);
    Ze82.ZR = new BigInteger(1, new byte[] { 
          107, -117, -88, 39, 46, 98, 2, -103, 99, -68, 
          -107, -62, -122, 82, 106, 9, 95, -25, 86, -22, 
          -38, -106, 59, -122, 72, 10, 25, -91, -109, 6, 
          -36, 51 });
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zezq.Zp.charAt(Math.abs(((BigInteger)Zz9v.Zl).intValue() % 32)) <= Zr8g.ZH.charAt(Math.abs(((BigInteger)Zlqq.ZV).intValue() % 32))) {
          try {
            Ztkh.Zh(Class.forName(a(21024, -18181)));
            if (bool)
              Zl88.ZI(Class.forName(a(21028, 9045))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zl88.ZI(Class.forName(a(21028, 9045)));
    } catch (Throwable throwable) {}
  }
  
  static void ZY(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zk(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zt9_.Zf : Ljava/lang/String;
    //   172: getstatic burp/Zix.ZO : Ljava/lang/Object;
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
    //   206: getstatic burp/Ze8i.ZM : Ljava/lang/String;
    //   209: getstatic burp/Zrpu.Zi : Ljava/lang/Object;
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
    //   243: getstatic burp/Zb.Zt : Ljava/lang/String;
    //   246: getstatic burp/Zsqy.ZV : Ljava/lang/Object;
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
    //   280: getstatic burp/Zsf7.ZS : Ljava/lang/String;
    //   283: getstatic burp/Zeqg.Zm : Ljava/lang/Object;
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
    //   317: getstatic burp/Zefo.Zb : Ljava/lang/String;
    //   320: getstatic burp/Zztk.Za : Ljava/lang/Object;
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
    //   354: getstatic burp/Zg_5.ZG : Ljava/lang/String;
    //   357: getstatic burp/Zg4w.ZR : Ljava/lang/Object;
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
    //   391: getstatic burp/Zk7f.ZA : Ljava/lang/String;
    //   394: getstatic burp/Zza8.Zh : Ljava/lang/Object;
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
    //   428: getstatic burp/Zztk.Zf : Ljava/lang/String;
    //   431: getstatic burp/Zzo5.Zf : Ljava/lang/Object;
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
    //   465: getstatic burp/Ze_t.ZZ : Ljava/lang/String;
    //   468: getstatic burp/Zrtc.Zr : Ljava/lang/Object;
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
    //   502: getstatic burp/Zlhq.Zl : Ljava/lang/String;
    //   505: getstatic burp/Zz0w.ZF : Ljava/lang/Object;
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
    //   539: getstatic burp/Zmr7.Zo : Ljava/lang/String;
    //   542: getstatic burp/Zz6t.ZA : Ljava/lang/Object;
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
    //   576: getstatic burp/Zeb7.ZH : Ljava/lang/String;
    //   579: getstatic burp/Zlpj.Zc : Ljava/lang/Object;
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
    //   613: getstatic burp/Zsxh.Z_ : Ljava/lang/String;
    //   616: getstatic burp/Zgqi.Zp : Ljava/lang/Object;
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
    //   650: getstatic burp/Zstb.Zd : Ljava/lang/String;
    //   653: getstatic burp/Zt0t.ZL : Ljava/lang/Object;
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
    //   687: getstatic burp/Zeoy.ZS : Ljava/lang/String;
    //   690: getstatic burp/Zkm0.ZI : Ljava/lang/Object;
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
    //   724: getstatic burp/Zmx6.ZG : Ljava/lang/String;
    //   727: getstatic burp/Zz0w.ZF : Ljava/lang/Object;
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
    //   761: getstatic burp/Zxn5.ZI : Ljava/lang/String;
    //   764: getstatic burp/Zs_3.ZZ : Ljava/lang/Object;
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
    //   798: getstatic burp/Zt98.Zh : Ljava/lang/String;
    //   801: getstatic burp/Zxo7.Zi : Ljava/lang/Object;
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
    //   835: getstatic burp/Zzox.ZB : Ljava/lang/String;
    //   838: getstatic burp/Zix.ZO : Ljava/lang/Object;
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
    //   872: getstatic burp/Zeqg.Zh : Ljava/lang/String;
    //   875: getstatic burp/Zzr5.Za : Ljava/lang/Object;
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
    //   909: getstatic burp/Zzc_.Zg : Ljava/lang/String;
    //   912: getstatic burp/Zlvb.ZN : Ljava/lang/Object;
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
    //   946: getstatic burp/Zefo.Zb : Ljava/lang/String;
    //   949: getstatic burp/Zb8y.ZI : Ljava/lang/Object;
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
    //   983: getstatic burp/Zevr.Zk : Ljava/lang/String;
    //   986: getstatic burp/Zlf0.ZC : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zm3p.ZE : Ljava/lang/String;
    //   1023: getstatic burp/Zt9_.ZN : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zr2i.Z_ : Ljava/lang/String;
    //   1060: getstatic burp/Zs75.Zo : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zt3p.ZD : Ljava/lang/String;
    //   1097: getstatic burp/Zevr.ZG : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zsf7.ZS : Ljava/lang/String;
    //   1134: getstatic burp/Zmhi.ZZ : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zlh8.ZY : Ljava/lang/String;
    //   1171: getstatic burp/Ztcv.ZY : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zt3f.ZU : Ljava/lang/String;
    //   1208: getstatic burp/Zztn.ZO : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zlh8.ZY : Ljava/lang/String;
    //   1245: getstatic burp/Zl39.ZA : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zs8q.Zs : Ljava/lang/String;
    //   1282: getstatic burp/Zex.ZO : Ljava/lang/Object;
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
    //   1316: getstatic burp/Ze69.ZA : Ljava/lang/String;
    //   1319: getstatic burp/Zt5j.Zn : Ljava/lang/Object;
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
    //   1355: sipush #21025
    //   1358: sipush #-12246
    //   1361: invokestatic a : (II)Ljava/lang/String;
    //   1364: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1367: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1370: astore #4
    //   1372: aload #4
    //   1374: arraylength
    //   1375: istore #5
    //   1377: iconst_0
    //   1378: istore #6
    //   1380: iload #6
    //   1382: iload #5
    //   1384: if_icmpge -> 1472
    //   1387: aload #4
    //   1389: iload #6
    //   1391: aaload
    //   1392: astore #7
    //   1394: aload #7
    //   1396: invokevirtual getModifiers : ()I
    //   1399: invokestatic isStatic : (I)Z
    //   1402: ifeq -> 1465
    //   1405: aload #7
    //   1407: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1410: arraylength
    //   1411: iconst_2
    //   1412: if_icmpne -> 1465
    //   1415: goto -> 1422
    //   1418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1421: athrow
    //   1422: aload #7
    //   1424: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1427: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1430: if_acmpne -> 1465
    //   1433: goto -> 1440
    //   1436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1439: athrow
    //   1440: aload #7
    //   1442: aconst_null
    //   1443: iconst_2
    //   1444: anewarray java/lang/Object
    //   1447: dup
    //   1448: iconst_0
    //   1449: aload_0
    //   1450: aastore
    //   1451: dup
    //   1452: iconst_1
    //   1453: aload_1
    //   1454: aastore
    //   1455: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1458: checkcast java/lang/Boolean
    //   1461: invokevirtual booleanValue : ()Z
    //   1464: ireturn
    //   1465: iinc #6, 1
    //   1468: iload_2
    //   1469: ifne -> 1380
    //   1472: sipush #21026
    //   1475: sipush #12955
    //   1478: invokestatic a : (II)Ljava/lang/String;
    //   1481: iconst_1
    //   1482: ldc burp/Zl6z
    //   1484: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1487: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1490: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1493: astore #4
    //   1495: aload #4
    //   1497: arraylength
    //   1498: istore #5
    //   1500: iconst_0
    //   1501: istore #6
    //   1503: iload #6
    //   1505: iload #5
    //   1507: if_icmpge -> 1645
    //   1510: aload #4
    //   1512: iload #6
    //   1514: aaload
    //   1515: astore #7
    //   1517: aload #7
    //   1519: invokevirtual getModifiers : ()I
    //   1522: invokestatic isStatic : (I)Z
    //   1525: ifne -> 1535
    //   1528: goto -> 1638
    //   1531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1534: athrow
    //   1535: aload #7
    //   1537: invokevirtual getType : ()Ljava/lang/Class;
    //   1540: astore #8
    //   1542: aload #8
    //   1544: ifnull -> 1625
    //   1547: aload #8
    //   1549: invokevirtual isPrimitive : ()Z
    //   1552: ifne -> 1625
    //   1555: goto -> 1562
    //   1558: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1561: athrow
    //   1562: aload #8
    //   1564: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1567: ifnull -> 1625
    //   1570: goto -> 1577
    //   1573: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1576: athrow
    //   1577: aload #8
    //   1579: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1582: invokevirtual getName : ()Ljava/lang/String;
    //   1585: ifnull -> 1625
    //   1588: goto -> 1595
    //   1591: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1594: athrow
    //   1595: aload #8
    //   1597: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1600: invokevirtual getName : ()Ljava/lang/String;
    //   1603: sipush #21030
    //   1606: sipush #-485
    //   1609: invokestatic a : (II)Ljava/lang/String;
    //   1612: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1615: ifne -> 1625
    //   1618: goto -> 1625
    //   1621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1624: athrow
    //   1625: aload #7
    //   1627: iconst_1
    //   1628: invokevirtual setAccessible : (Z)V
    //   1631: aload #7
    //   1633: aconst_null
    //   1634: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1637: pop
    //   1638: iinc #6, 1
    //   1641: iload_2
    //   1642: ifne -> 1503
    //   1645: sipush #21027
    //   1648: sipush #-19178
    //   1651: invokestatic a : (II)Ljava/lang/String;
    //   1654: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1657: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1660: astore #4
    //   1662: aload #4
    //   1664: arraylength
    //   1665: istore #5
    //   1667: iconst_0
    //   1668: istore #6
    //   1670: iload #6
    //   1672: iload #5
    //   1674: if_icmpge -> 1807
    //   1677: aload #4
    //   1679: iload #6
    //   1681: aaload
    //   1682: astore #7
    //   1684: aload #7
    //   1686: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1689: pop
    //   1690: aload #7
    //   1692: invokevirtual getModifiers : ()I
    //   1695: invokestatic isStatic : (I)Z
    //   1698: ifeq -> 1793
    //   1701: aload #7
    //   1703: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1706: arraylength
    //   1707: iconst_2
    //   1708: if_icmpne -> 1793
    //   1711: goto -> 1718
    //   1714: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1717: athrow
    //   1718: aload #7
    //   1720: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1723: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1726: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1729: ifeq -> 1793
    //   1732: goto -> 1739
    //   1735: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1738: athrow
    //   1739: aload #7
    //   1741: iconst_1
    //   1742: invokevirtual setAccessible : (Z)V
    //   1745: aload #7
    //   1747: aconst_null
    //   1748: iconst_2
    //   1749: anewarray java/lang/Object
    //   1752: dup
    //   1753: iconst_0
    //   1754: aload_0
    //   1755: aastore
    //   1756: dup
    //   1757: iconst_1
    //   1758: aload_1
    //   1759: ifnonnull -> 1777
    //   1762: goto -> 1769
    //   1765: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1768: athrow
    //   1769: aload_1
    //   1770: goto -> 1784
    //   1773: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1776: athrow
    //   1777: aload_1
    //   1778: checkcast [B
    //   1781: invokevirtual clone : ()Ljava/lang/Object;
    //   1784: aastore
    //   1785: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1788: pop
    //   1789: iload_2
    //   1790: ifne -> 1807
    //   1793: iinc #6, 1
    //   1796: iload_2
    //   1797: ifne -> 1670
    //   1800: goto -> 1807
    //   1803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1806: athrow
    //   1807: getstatic burp/Zlf0.ZS : Ljava/lang/String;
    //   1810: getstatic burp/Zt3p.ZO : Ljava/lang/Object;
    //   1813: checkcast java/math/BigInteger
    //   1816: invokevirtual intValue : ()I
    //   1819: bipush #32
    //   1821: irem
    //   1822: invokestatic abs : (I)I
    //   1825: invokevirtual charAt : (I)C
    //   1828: getstatic burp/Zevr.Zk : Ljava/lang/String;
    //   1831: getstatic burp/Zzoi.ZI : Ljava/lang/Object;
    //   1834: checkcast java/math/BigInteger
    //   1837: invokevirtual intValue : ()I
    //   1840: bipush #32
    //   1842: irem
    //   1843: invokestatic abs : (I)I
    //   1846: invokevirtual charAt : (I)C
    //   1849: if_icmpgt -> 1956
    //   1852: getstatic burp/Zzox.ZB : Ljava/lang/String;
    //   1855: getstatic burp/Zram.ZF : Ljava/lang/Object;
    //   1858: checkcast java/math/BigInteger
    //   1861: invokevirtual intValue : ()I
    //   1864: bipush #32
    //   1866: irem
    //   1867: invokestatic abs : (I)I
    //   1870: invokevirtual charAt : (I)C
    //   1873: getstatic burp/Zera.Zn : Ljava/lang/String;
    //   1876: getstatic burp/Ze64.ZW : Ljava/lang/Object;
    //   1879: checkcast java/math/BigInteger
    //   1882: invokevirtual intValue : ()I
    //   1885: bipush #32
    //   1887: irem
    //   1888: invokestatic abs : (I)I
    //   1891: invokevirtual charAt : (I)C
    //   1894: if_icmple -> 1956
    //   1897: goto -> 1904
    //   1900: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1903: athrow
    //   1904: getstatic burp/Zgq_.ZQ : Ljava/lang/String;
    //   1907: getstatic burp/Zmx6.ZJ : Ljava/lang/Object;
    //   1910: checkcast java/math/BigInteger
    //   1913: invokevirtual intValue : ()I
    //   1916: bipush #32
    //   1918: irem
    //   1919: invokestatic abs : (I)I
    //   1922: invokevirtual charAt : (I)C
    //   1925: getstatic burp/Zstb.Zd : Ljava/lang/String;
    //   1928: getstatic burp/Ze5f.Zh : Ljava/lang/Object;
    //   1931: checkcast java/math/BigInteger
    //   1934: invokevirtual intValue : ()I
    //   1937: bipush #32
    //   1939: irem
    //   1940: invokestatic abs : (I)I
    //   1943: invokevirtual charAt : (I)C
    //   1946: if_icmpgt -> 1964
    //   1949: goto -> 1956
    //   1952: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1955: athrow
    //   1956: iconst_1
    //   1957: goto -> 1965
    //   1960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1963: athrow
    //   1964: iconst_0
    //   1965: ireturn
    //   1966: astore_3
    //   1967: new java/lang/Exception
    //   1970: dup
    //   1971: aload_3
    //   1972: invokevirtual getMessage : ()Ljava/lang/String;
    //   1975: invokespecial <init> : (Ljava/lang/String;)V
    //   1978: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1464	1966	java/lang/Throwable
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
    //   1394	1415	1418	java/lang/Throwable
    //   1405	1433	1436	java/lang/Throwable
    //   1465	1965	1966	java/lang/Throwable
    //   1517	1531	1531	java/lang/Throwable
    //   1542	1555	1558	java/lang/Throwable
    //   1547	1570	1573	java/lang/Throwable
    //   1562	1588	1591	java/lang/Throwable
    //   1577	1618	1621	java/lang/Throwable
    //   1684	1711	1714	java/lang/Throwable
    //   1701	1732	1735	java/lang/Throwable
    //   1718	1762	1765	java/lang/Throwable
    //   1739	1773	1773	java/lang/Throwable
    //   1784	1800	1803	java/lang/Throwable
    //   1807	1897	1900	java/lang/Throwable
    //   1852	1949	1952	java/lang/Throwable
    //   1904	1960	1960	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¾'ÿÀ\\bmÔÊÚ\\tÑ0Êºj»^{\\tk¶HPpæÐ\\tqYÞµ8Ïø§  ÷E¤d1!=ª1-²hýÂcU'ÿ~¬:ÆF'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #57
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'yî­1 ÌK±\D\\tï94o(ÅuÛÎ¢þõT\\r&55©R[Ó'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #96
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
    //   128: putstatic burp/Zma8.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zma8.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #108
    //   214: goto -> 243
    //   217: iconst_1
    //   218: goto -> 243
    //   221: bipush #63
    //   223: goto -> 243
    //   226: bipush #11
    //   228: goto -> 243
    //   231: bipush #8
    //   233: goto -> 243
    //   236: bipush #34
    //   238: goto -> 243
    //   241: bipush #127
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #36
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-119
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-51
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-76
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-97
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-85
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-5
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #105
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #44
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-113
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #96
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-33
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #111
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #88
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #79
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #115
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-54
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #68
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-34
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #111
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #72
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-97
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-43
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #33
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-97
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-16
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #63
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #97
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #127
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-34
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #16
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-30
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zma8.Zb : Ljava/lang/Object;
    //   500: sipush #21031
    //   503: sipush #5615
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zma8.Zk : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5220) & 0xFFFF;
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
      char c = '­';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zma8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */