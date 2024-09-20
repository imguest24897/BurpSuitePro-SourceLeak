package burp;

import java.math.BigInteger;

class Zzc7 extends ClassLoader {
  static Object ZG;
  
  static String ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zu(Object paramObject) {
    Zxyq.Zr = a(8142, -30842);
    Zxyq.ZQ = new BigInteger(a(8143, 13343));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zsin.ZC.charAt(Math.abs(((BigInteger)Zbxp.ZW).intValue() % 32)) <= Zsin.ZC.charAt(Math.abs(((BigInteger)Zty5.Zf).intValue() % 32))) {
          try {
            Zsgj.ZL(Class.forName(a(8138, -17575)));
            if (!bool)
              Zgl2.Ze(Class.forName(a(8137, -28877))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgl2.Ze(Class.forName(a(8137, -28877)));
    } catch (Throwable throwable) {}
  }
  
  static void Za(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZB(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Zl1u.ZO : Ljava/lang/String;
    //   172: getstatic burp/Zljx.ZZ : Ljava/lang/Object;
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
    //   206: getstatic burp/Zebj.ZF : Ljava/lang/String;
    //   209: getstatic burp/Zttj.ZF : Ljava/lang/Object;
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
    //   243: getstatic burp/Zs9u.ZM : Ljava/lang/String;
    //   246: getstatic burp/Zz58.ZD : Ljava/lang/Object;
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
    //   280: getstatic burp/Zzwl.Zy : Ljava/lang/String;
    //   283: getstatic burp/Zmjr.ZU : Ljava/lang/Object;
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
    //   317: getstatic burp/Zrvb.ZU : Ljava/lang/String;
    //   320: getstatic burp/Zb3p.Zx : Ljava/lang/Object;
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
    //   354: getstatic burp/Zkvq.Zg : Ljava/lang/String;
    //   357: getstatic burp/Zm06.ZU : Ljava/lang/Object;
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
    //   391: getstatic burp/Zzwl.Zy : Ljava/lang/String;
    //   394: getstatic burp/Ze3t.Zp : Ljava/lang/Object;
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
    //   428: getstatic burp/Zls_.Zn : Ljava/lang/String;
    //   431: getstatic burp/Zlno.ZU : Ljava/lang/Object;
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
    //   465: getstatic burp/Zsej.Zd : Ljava/lang/String;
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
    //   491: ifeq -> 1348
    //   494: goto -> 501
    //   497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   500: athrow
    //   501: aload_3
    //   502: getstatic burp/Ztd6.Zu : Ljava/lang/String;
    //   505: getstatic burp/Zoa.ZI : Ljava/lang/Object;
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
    //   539: getstatic burp/Zltb.ZO : Ljava/lang/String;
    //   542: getstatic burp/Zgd7.ZZ : Ljava/lang/Object;
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
    //   576: getstatic burp/Zl_9.ZP : Ljava/lang/String;
    //   579: getstatic burp/Zs_.Zs : Ljava/lang/Object;
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
    //   613: getstatic burp/Zgwq.ZV : Ljava/lang/String;
    //   616: getstatic burp/Zxd0.Za : Ljava/lang/Object;
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
    //   650: getstatic burp/Zz58.ZT : Ljava/lang/String;
    //   653: getstatic burp/Zezz.Zu : Ljava/lang/Object;
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
    //   687: getstatic burp/Zgd7.Zs : Ljava/lang/String;
    //   690: getstatic burp/Zl_9.ZM : Ljava/lang/Object;
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
    //   724: getstatic burp/Zzc7.ZN : Ljava/lang/String;
    //   727: getstatic burp/Zr3x.Zb : Ljava/lang/Object;
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
    //   761: getstatic burp/Zzc7.ZN : Ljava/lang/String;
    //   764: getstatic burp/Ztes.ZX : Ljava/lang/Object;
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
    //   798: getstatic burp/Zls_.Zn : Ljava/lang/String;
    //   801: getstatic burp/Zg97.Zc : Ljava/lang/Object;
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
    //   835: getstatic burp/Zxsb.Zh : Ljava/lang/String;
    //   838: getstatic burp/Zl_1.ZL : Ljava/lang/Object;
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
    //   872: getstatic burp/Zttj.ZN : Ljava/lang/String;
    //   875: getstatic burp/Zgdt.Zb : Ljava/lang/Object;
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
    //   909: getstatic burp/Zttj.ZN : Ljava/lang/String;
    //   912: getstatic burp/Zxtn.ZY : Ljava/lang/Object;
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
    //   946: getstatic burp/Zsgj.ZN : Ljava/lang/String;
    //   949: getstatic burp/Zty5.Zf : Ljava/lang/Object;
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
    //   983: getstatic burp/Zs59.Zc : Ljava/lang/String;
    //   986: getstatic burp/Zmt6.ZK : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zzvr.Zc : Ljava/lang/String;
    //   1023: getstatic burp/Zzy5.ZG : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zgdj.Zt : Ljava/lang/String;
    //   1060: getstatic burp/Zxoa.Zr : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zei_.ZZ : Ljava/lang/String;
    //   1097: getstatic burp/Zttj.ZF : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zly0.ZE : Ljava/lang/String;
    //   1134: getstatic burp/Zzvr.Z_ : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zzv.Zy : Ljava/lang/String;
    //   1171: getstatic burp/Zxsb.ZN : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zty3.ZW : Ljava/lang/String;
    //   1208: getstatic burp/Zsej.ZT : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zmiy.ZT : Ljava/lang/String;
    //   1245: getstatic burp/Zkvq.Zz : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zljx.ZD : Ljava/lang/String;
    //   1282: getstatic burp/Zxoa.Zr : Ljava/lang/Object;
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
    //   1316: getstatic burp/Zkul.ZJ : Ljava/lang/String;
    //   1319: getstatic burp/Zxyq.ZQ : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zejg.ZP : Ljava/lang/String;
    //   1362: sipush #8136
    //   1365: sipush #3195
    //   1368: invokestatic a : (II)Ljava/lang/String;
    //   1371: iconst_1
    //   1372: ldc burp/Zeqw
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
    //   1493: sipush #8140
    //   1496: sipush #2796
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
    //   1535: sipush #8134
    //   1538: sipush #-22943
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
    //   1697: getstatic burp/Zgd7.ZZ : Ljava/lang/Object;
    //   1700: checkcast java/math/BigInteger
    //   1703: invokevirtual toByteArray : ()[B
    //   1706: astore #4
    //   1708: aload #4
    //   1710: arraylength
    //   1711: iconst_2
    //   1712: iadd
    //   1713: newarray byte
    //   1715: astore #6
    //   1717: iconst_0
    //   1718: istore #7
    //   1720: iload #7
    //   1722: aload #4
    //   1724: arraylength
    //   1725: if_icmpge -> 1745
    //   1728: aload #6
    //   1730: iload #7
    //   1732: aload #4
    //   1734: iload #7
    //   1736: baload
    //   1737: bastore
    //   1738: iinc #7, 1
    //   1741: iload_2
    //   1742: ifeq -> 1720
    //   1745: aload #6
    //   1747: arraylength
    //   1748: iconst_3
    //   1749: idiv
    //   1750: iconst_4
    //   1751: imul
    //   1752: newarray byte
    //   1754: astore #5
    //   1756: iconst_0
    //   1757: istore #7
    //   1759: iconst_0
    //   1760: istore #8
    //   1762: iload #7
    //   1764: aload #4
    //   1766: arraylength
    //   1767: if_icmpge -> 1878
    //   1770: aload #5
    //   1772: iload #8
    //   1774: aload #6
    //   1776: iload #7
    //   1778: baload
    //   1779: iconst_2
    //   1780: iushr
    //   1781: bipush #63
    //   1783: iand
    //   1784: i2b
    //   1785: bastore
    //   1786: aload #5
    //   1788: iload #8
    //   1790: iconst_1
    //   1791: iadd
    //   1792: aload #6
    //   1794: iload #7
    //   1796: iconst_1
    //   1797: iadd
    //   1798: baload
    //   1799: iconst_4
    //   1800: iushr
    //   1801: bipush #15
    //   1803: iand
    //   1804: aload #6
    //   1806: iload #7
    //   1808: baload
    //   1809: iconst_4
    //   1810: ishl
    //   1811: bipush #63
    //   1813: iand
    //   1814: ior
    //   1815: i2b
    //   1816: bastore
    //   1817: aload #5
    //   1819: iload #8
    //   1821: iconst_2
    //   1822: iadd
    //   1823: aload #6
    //   1825: iload #7
    //   1827: iconst_2
    //   1828: iadd
    //   1829: baload
    //   1830: bipush #6
    //   1832: iushr
    //   1833: iconst_3
    //   1834: iand
    //   1835: aload #6
    //   1837: iload #7
    //   1839: iconst_1
    //   1840: iadd
    //   1841: baload
    //   1842: iconst_2
    //   1843: ishl
    //   1844: bipush #63
    //   1846: iand
    //   1847: ior
    //   1848: i2b
    //   1849: bastore
    //   1850: aload #5
    //   1852: iload #8
    //   1854: iconst_3
    //   1855: iadd
    //   1856: aload #6
    //   1858: iload #7
    //   1860: iconst_2
    //   1861: iadd
    //   1862: baload
    //   1863: bipush #63
    //   1865: iand
    //   1866: i2b
    //   1867: bastore
    //   1868: iinc #7, 3
    //   1871: iinc #8, 4
    //   1874: iload_2
    //   1875: ifeq -> 1762
    //   1878: iconst_0
    //   1879: istore #7
    //   1881: iload #7
    //   1883: aload #5
    //   1885: arraylength
    //   1886: if_icmpge -> 2070
    //   1889: aload #5
    //   1891: iload #7
    //   1893: baload
    //   1894: bipush #26
    //   1896: if_icmpge -> 1924
    //   1899: aload #5
    //   1901: iload #7
    //   1903: aload #5
    //   1905: iload #7
    //   1907: baload
    //   1908: bipush #65
    //   1910: iadd
    //   1911: i2b
    //   1912: bastore
    //   1913: iload_2
    //   1914: ifeq -> 2063
    //   1917: goto -> 1924
    //   1920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1923: athrow
    //   1924: aload #5
    //   1926: iload #7
    //   1928: baload
    //   1929: bipush #52
    //   1931: if_icmpge -> 1969
    //   1934: goto -> 1941
    //   1937: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1940: athrow
    //   1941: aload #5
    //   1943: iload #7
    //   1945: aload #5
    //   1947: iload #7
    //   1949: baload
    //   1950: bipush #97
    //   1952: iadd
    //   1953: bipush #26
    //   1955: isub
    //   1956: i2b
    //   1957: bastore
    //   1958: iload_2
    //   1959: ifeq -> 2063
    //   1962: goto -> 1969
    //   1965: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1968: athrow
    //   1969: aload #5
    //   1971: iload #7
    //   1973: baload
    //   1974: bipush #62
    //   1976: if_icmpge -> 2014
    //   1979: goto -> 1986
    //   1982: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1985: athrow
    //   1986: aload #5
    //   1988: iload #7
    //   1990: aload #5
    //   1992: iload #7
    //   1994: baload
    //   1995: bipush #48
    //   1997: iadd
    //   1998: bipush #52
    //   2000: isub
    //   2001: i2b
    //   2002: bastore
    //   2003: iload_2
    //   2004: ifeq -> 2063
    //   2007: goto -> 2014
    //   2010: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2013: athrow
    //   2014: aload #5
    //   2016: iload #7
    //   2018: baload
    //   2019: bipush #63
    //   2021: if_icmpge -> 2049
    //   2024: goto -> 2031
    //   2027: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2030: athrow
    //   2031: aload #5
    //   2033: iload #7
    //   2035: bipush #43
    //   2037: bastore
    //   2038: iload_2
    //   2039: ifeq -> 2063
    //   2042: goto -> 2049
    //   2045: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2048: athrow
    //   2049: aload #5
    //   2051: iload #7
    //   2053: bipush #47
    //   2055: bastore
    //   2056: goto -> 2063
    //   2059: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2062: athrow
    //   2063: iinc #7, 1
    //   2066: iload_2
    //   2067: ifeq -> 1881
    //   2070: aload #5
    //   2072: arraylength
    //   2073: iconst_1
    //   2074: isub
    //   2075: istore #7
    //   2077: iload #7
    //   2079: aload #4
    //   2081: arraylength
    //   2082: iconst_4
    //   2083: imul
    //   2084: iconst_3
    //   2085: idiv
    //   2086: if_icmple -> 2103
    //   2089: aload #5
    //   2091: iload #7
    //   2093: bipush #61
    //   2095: bastore
    //   2096: iinc #7, -1
    //   2099: iload_2
    //   2100: ifeq -> 2077
    //   2103: getstatic burp/Zly0.ZE : Ljava/lang/String;
    //   2106: getstatic burp/Ztid.ZL : Ljava/lang/Object;
    //   2109: checkcast java/math/BigInteger
    //   2112: invokevirtual intValue : ()I
    //   2115: bipush #32
    //   2117: irem
    //   2118: invokestatic abs : (I)I
    //   2121: invokevirtual charAt : (I)C
    //   2124: getstatic burp/Zk7w.ZB : Ljava/lang/String;
    //   2127: getstatic burp/Zls_.ZR : Ljava/lang/Object;
    //   2130: checkcast java/math/BigInteger
    //   2133: invokevirtual intValue : ()I
    //   2136: bipush #32
    //   2138: irem
    //   2139: invokestatic abs : (I)I
    //   2142: invokevirtual charAt : (I)C
    //   2145: if_icmple -> 2260
    //   2148: getstatic burp/Zb9k.Za : Ljava/lang/String;
    //   2151: getstatic burp/Zmiy.Zi : Ljava/lang/Object;
    //   2154: checkcast java/math/BigInteger
    //   2157: invokevirtual intValue : ()I
    //   2160: bipush #32
    //   2162: irem
    //   2163: invokestatic abs : (I)I
    //   2166: invokevirtual charAt : (I)C
    //   2169: getstatic burp/Zko9.Zf : Ljava/lang/String;
    //   2172: getstatic burp/Zmiy.Zi : Ljava/lang/Object;
    //   2175: checkcast java/math/BigInteger
    //   2178: invokevirtual intValue : ()I
    //   2181: bipush #32
    //   2183: irem
    //   2184: invokestatic abs : (I)I
    //   2187: invokevirtual charAt : (I)C
    //   2190: if_icmpgt -> 2260
    //   2193: goto -> 2200
    //   2196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2199: athrow
    //   2200: getstatic burp/Zzv.Zy : Ljava/lang/String;
    //   2203: getstatic burp/Zxn7.ZU : Ljava/lang/Object;
    //   2206: checkcast java/math/BigInteger
    //   2209: invokevirtual intValue : ()I
    //   2212: bipush #32
    //   2214: irem
    //   2215: invokestatic abs : (I)I
    //   2218: invokevirtual charAt : (I)C
    //   2221: getstatic burp/Zzvr.Zc : Ljava/lang/String;
    //   2224: getstatic burp/Zgkl.ZK : Ljava/lang/Object;
    //   2227: checkcast java/math/BigInteger
    //   2230: invokevirtual intValue : ()I
    //   2233: bipush #32
    //   2235: irem
    //   2236: invokestatic abs : (I)I
    //   2239: invokevirtual charAt : (I)C
    //   2242: if_icmpgt -> 2260
    //   2245: goto -> 2252
    //   2248: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2251: athrow
    //   2252: iconst_1
    //   2253: goto -> 2261
    //   2256: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2259: athrow
    //   2260: iconst_0
    //   2261: ireturn
    //   2262: astore_3
    //   2263: new java/lang/Exception
    //   2266: dup
    //   2267: aload_3
    //   2268: invokevirtual getMessage : ()Ljava/lang/String;
    //   2271: invokespecial <init> : (Ljava/lang/String;)V
    //   2274: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2261	2262	java/lang/Throwable
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
    //   1889	1917	1920	java/lang/Throwable
    //   1899	1934	1937	java/lang/Throwable
    //   1924	1962	1965	java/lang/Throwable
    //   1941	1979	1982	java/lang/Throwable
    //   1969	2007	2010	java/lang/Throwable
    //   1986	2024	2027	java/lang/Throwable
    //   2014	2042	2045	java/lang/Throwable
    //   2031	2056	2059	java/lang/Throwable
    //   2103	2193	2196	java/lang/Throwable
    //   2148	2245	2248	java/lang/Throwable
    //   2200	2256	2256	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÀÄüæ­EÀ½y(dEê6)¥³·@*snãªfe±2MÐÆxß¨Ìtwú¤\ZW@ylé<\\nFlý\\byx¯0xÁw éå\\nR£5ëBúÿø¯õ§¼±Ö4ùpQ¡«¥^*J»  2$Ê¸"WÞÃN©Ò#31B©ªw.Ê/3\\tþÚ!A?±Ã/Mò!xÊ»Iï[ßmËS¯°[¢´1\1#à¸+IÁ9.ÑG=|ËÏlÔÎÍç/µ\\fÖ4éµ>1tloÜ§Ð1ïü\\tWâçßqø'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #94
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
    //   68: ldc '*ÀúËÿö\\tALk#ù@îw'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #114
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
    //   129: putstatic burp/Zzc7.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzc7.b : [Ljava/lang/String;
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
    //   212: bipush #82
    //   214: goto -> 243
    //   217: iconst_3
    //   218: goto -> 243
    //   221: bipush #125
    //   223: goto -> 243
    //   226: bipush #21
    //   228: goto -> 243
    //   231: bipush #77
    //   233: goto -> 243
    //   236: bipush #46
    //   238: goto -> 243
    //   241: bipush #61
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
    //   304: sipush #8139
    //   307: sipush #-31228
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zzc7.ZG : Ljava/lang/Object;
    //   319: sipush #8141
    //   322: sipush #-25508
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zzc7.ZN : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1FCE) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzc7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */