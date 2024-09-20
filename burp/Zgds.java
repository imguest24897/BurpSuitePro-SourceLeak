package burp;

import java.math.BigInteger;

class Zgds extends ClassLoader {
  static String ZA;
  
  static Object Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Za(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zo(Object paramObject) {
    Zb2p.ZV = a(6118, 31675);
    Zb2p.ZQ = new BigInteger(a(6141, -29260));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zgjj.Zi.charAt(Math.abs(((BigInteger)Zb2p.ZQ).intValue() % 32)) > Zkgp.ZM.charAt(Math.abs(((BigInteger)Zxo4.ZV).intValue() % 32))) {
          try {
            Zzef.Zc(Class.forName(a(6130, -16187)));
            if (!bool)
              Zkgp.ZS(Class.forName(a(6125, 19096))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkgp.ZS(Class.forName(a(6125, 19096)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zm(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   169: getstatic burp/Ze69.ZA : Ljava/lang/String;
    //   172: getstatic burp/Zxso.ZF : Ljava/lang/Object;
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
    //   206: getstatic burp/Ztt0.Zl : Ljava/lang/String;
    //   209: getstatic burp/Zgqp.Zf : Ljava/lang/Object;
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
    //   243: getstatic burp/Zg2.ZN : Ljava/lang/String;
    //   246: getstatic burp/Zeqr.ZM : Ljava/lang/Object;
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
    //   280: getstatic burp/Zmcb.Zl : Ljava/lang/String;
    //   283: getstatic burp/Ze82.ZR : Ljava/lang/Object;
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
    //   317: getstatic burp/Zr5k.Zq : Ljava/lang/String;
    //   320: getstatic burp/Zsq6.ZS : Ljava/lang/Object;
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
    //   354: getstatic burp/Zbqk.ZZ : Ljava/lang/String;
    //   357: getstatic burp/Ze82.ZR : Ljava/lang/Object;
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
    //   391: getstatic burp/Zm8i.Z_ : Ljava/lang/String;
    //   394: getstatic burp/Zrd4.Ze : Ljava/lang/Object;
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
    //   428: getstatic burp/Zlqq.Za : Ljava/lang/String;
    //   431: getstatic burp/Zg2u.ZI : Ljava/lang/Object;
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
    //   465: getstatic burp/Zk7b.ZE : Ljava/lang/String;
    //   468: getstatic burp/Zry9.Zw : Ljava/lang/Object;
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
    //   502: getstatic burp/Zre4.Zh : Ljava/lang/String;
    //   505: getstatic burp/Zero.ZE : Ljava/lang/Object;
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
    //   539: getstatic burp/Ztid.Zz : Ljava/lang/String;
    //   542: getstatic burp/Zgrf.ZN : Ljava/lang/Object;
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
    //   576: getstatic burp/Zgu4.Za : Ljava/lang/String;
    //   579: getstatic burp/Zz0b.ZT : Ljava/lang/Object;
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
    //   613: getstatic burp/Zb8v.Zo : Ljava/lang/String;
    //   616: getstatic burp/Zxe.Zg : Ljava/lang/Object;
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
    //   650: getstatic burp/Zdm.ZJ : Ljava/lang/String;
    //   653: getstatic burp/Zmu6.Zb : Ljava/lang/Object;
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
    //   687: getstatic burp/Zes_.ZM : Ljava/lang/String;
    //   690: getstatic burp/Ztbf.Zv : Ljava/lang/Object;
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
    //   724: getstatic burp/Zro2.ZF : Ljava/lang/String;
    //   727: getstatic burp/Zgqi.Zp : Ljava/lang/Object;
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
    //   761: getstatic burp/Zxyu.ZM : Ljava/lang/String;
    //   764: getstatic burp/Zzuh.ZV : Ljava/lang/Object;
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
    //   798: getstatic burp/Zzri.ZL : Ljava/lang/String;
    //   801: getstatic burp/Zrpy.ZG : Ljava/lang/Object;
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
    //   835: getstatic burp/Zsbd.ZA : Ljava/lang/String;
    //   838: getstatic burp/Zxz_.Zv : Ljava/lang/Object;
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
    //   872: getstatic burp/Zmvk.Z_ : Ljava/lang/String;
    //   875: getstatic burp/Zkc5.ZZ : Ljava/lang/Object;
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
    //   909: getstatic burp/Zrw7.Zo : Ljava/lang/String;
    //   912: getstatic burp/Zgt6.ZU : Ljava/lang/Object;
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
    //   946: getstatic burp/Zmzh.Zm : Ljava/lang/String;
    //   949: getstatic burp/Zezi.ZQ : Ljava/lang/Object;
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
    //   983: getstatic burp/Zb8v.Zo : Ljava/lang/String;
    //   986: getstatic burp/Zeor.Zb : Ljava/lang/Object;
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
    //   1020: getstatic burp/Zsej.Zd : Ljava/lang/String;
    //   1023: getstatic burp/Zm3s.ZW : Ljava/lang/Object;
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
    //   1057: getstatic burp/Zg3m.Za : Ljava/lang/String;
    //   1060: getstatic burp/Zmv9.Zw : Ljava/lang/Object;
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
    //   1094: getstatic burp/Zbzj.Zw : Ljava/lang/String;
    //   1097: getstatic burp/Zkjr.Zw : Ljava/lang/Object;
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
    //   1131: getstatic burp/Zzwl.Zy : Ljava/lang/String;
    //   1134: getstatic burp/Zb_u.Zp : Ljava/lang/Object;
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
    //   1168: getstatic burp/Zro5.ZY : Ljava/lang/String;
    //   1171: getstatic burp/Zsq6.ZS : Ljava/lang/Object;
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
    //   1205: getstatic burp/Zle4.ZX : Ljava/lang/String;
    //   1208: getstatic burp/Zzef.Zw : Ljava/lang/Object;
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
    //   1242: getstatic burp/Zxjw.Zv : Ljava/lang/String;
    //   1245: getstatic burp/Zex5.Zb : Ljava/lang/Object;
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
    //   1279: getstatic burp/Zry0.Zz : Ljava/lang/String;
    //   1282: getstatic burp/Zter.Zc : Ljava/lang/Object;
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
    //   1316: getstatic burp/Ztys.Zn : Ljava/lang/String;
    //   1319: getstatic burp/Zvk.ZN : Ljava/lang/Object;
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
    //   1359: putstatic burp/Zrx5.ZD : Ljava/lang/String;
    //   1362: sipush #6119
    //   1365: sipush #-2387
    //   1368: invokestatic a : (II)Ljava/lang/String;
    //   1371: iconst_1
    //   1372: ldc burp/Zztz
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
    //   1493: sipush #6112
    //   1496: sipush #20575
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
    //   1535: sipush #6123
    //   1538: sipush #26843
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
    //   1697: getstatic burp/Zbz_.ZU : Ljava/lang/Object;
    //   1700: checkcast java/math/BigInteger
    //   1703: invokevirtual toByteArray : ()[B
    //   1706: astore #4
    //   1708: new java/lang/StringBuilder
    //   1711: dup
    //   1712: invokespecial <init> : ()V
    //   1715: astore #6
    //   1717: aload #6
    //   1719: sipush #6117
    //   1722: sipush #-17831
    //   1725: invokestatic a : (II)Ljava/lang/String;
    //   1728: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1731: pop
    //   1732: aload #4
    //   1734: astore #7
    //   1736: aload #7
    //   1738: arraylength
    //   1739: istore #8
    //   1741: iconst_0
    //   1742: istore #9
    //   1744: iload #9
    //   1746: iload #8
    //   1748: if_icmpge -> 1774
    //   1751: aload #7
    //   1753: iload #9
    //   1755: baload
    //   1756: istore #10
    //   1758: aload #6
    //   1760: iload #10
    //   1762: i2c
    //   1763: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1766: pop
    //   1767: iinc #9, 1
    //   1770: iload_2
    //   1771: ifeq -> 1744
    //   1774: aload #6
    //   1776: sipush #6140
    //   1779: sipush #-26599
    //   1782: invokestatic a : (II)Ljava/lang/String;
    //   1785: ldc ''
    //   1787: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1790: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1793: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1796: pop
    //   1797: aload #6
    //   1799: sipush #6134
    //   1802: sipush #18030
    //   1805: invokestatic a : (II)Ljava/lang/String;
    //   1808: ldc ''
    //   1810: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1813: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1816: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1819: pop
    //   1820: aload #6
    //   1822: invokevirtual toString : ()Ljava/lang/String;
    //   1825: invokevirtual getBytes : ()[B
    //   1828: astore #5
    //   1830: aload #5
    //   1832: astore #4
    //   1834: aload #4
    //   1836: arraylength
    //   1837: bipush #8
    //   1839: iadd
    //   1840: bipush #6
    //   1842: ishr
    //   1843: iconst_1
    //   1844: iadd
    //   1845: bipush #16
    //   1847: imul
    //   1848: newarray int
    //   1850: astore #6
    //   1852: iconst_0
    //   1853: istore #7
    //   1855: iload #7
    //   1857: aload #4
    //   1859: arraylength
    //   1860: if_icmpge -> 1904
    //   1863: aload #4
    //   1865: iload #7
    //   1867: baload
    //   1868: sipush #255
    //   1871: iand
    //   1872: istore #8
    //   1874: aload #6
    //   1876: iload #7
    //   1878: iconst_2
    //   1879: ishr
    //   1880: dup2
    //   1881: iaload
    //   1882: iload #8
    //   1884: bipush #24
    //   1886: iload #7
    //   1888: iconst_4
    //   1889: irem
    //   1890: bipush #8
    //   1892: imul
    //   1893: isub
    //   1894: ishl
    //   1895: ior
    //   1896: iastore
    //   1897: iinc #7, 1
    //   1900: iload_2
    //   1901: ifeq -> 1855
    //   1904: aload #6
    //   1906: iload #7
    //   1908: iconst_2
    //   1909: ishr
    //   1910: dup2
    //   1911: iaload
    //   1912: sipush #128
    //   1915: bipush #24
    //   1917: iload #7
    //   1919: iconst_4
    //   1920: irem
    //   1921: bipush #8
    //   1923: imul
    //   1924: isub
    //   1925: ishl
    //   1926: ior
    //   1927: iastore
    //   1928: aload #6
    //   1930: aload #6
    //   1932: arraylength
    //   1933: iconst_1
    //   1934: isub
    //   1935: aload #4
    //   1937: arraylength
    //   1938: bipush #8
    //   1940: imul
    //   1941: iastore
    //   1942: bipush #80
    //   1944: newarray int
    //   1946: astore #8
    //   1948: ldc 1732584193
    //   1950: istore #9
    //   1952: ldc -271733879
    //   1954: istore #10
    //   1956: ldc -1732584194
    //   1958: istore #11
    //   1960: ldc 271733878
    //   1962: istore #12
    //   1964: ldc -1009589776
    //   1966: istore #13
    //   1968: iconst_0
    //   1969: istore #7
    //   1971: iload #7
    //   1973: aload #6
    //   1975: arraylength
    //   1976: if_icmpge -> 2298
    //   1979: iload #9
    //   1981: istore #14
    //   1983: iload #10
    //   1985: istore #15
    //   1987: iload #11
    //   1989: istore #16
    //   1991: iload #12
    //   1993: istore #17
    //   1995: iload #13
    //   1997: istore #18
    //   1999: iconst_0
    //   2000: istore #19
    //   2002: iload #19
    //   2004: bipush #80
    //   2006: if_icmpge -> 2256
    //   2009: iload #19
    //   2011: bipush #16
    //   2013: if_icmpge -> 2040
    //   2016: aload #8
    //   2018: iload #19
    //   2020: aload #6
    //   2022: iload #7
    //   2024: iload #19
    //   2026: iadd
    //   2027: iaload
    //   2028: iastore
    //   2029: iload_2
    //   2030: ifeq -> 2095
    //   2033: goto -> 2040
    //   2036: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2039: athrow
    //   2040: aload #8
    //   2042: iload #19
    //   2044: iconst_3
    //   2045: isub
    //   2046: iaload
    //   2047: aload #8
    //   2049: iload #19
    //   2051: bipush #8
    //   2053: isub
    //   2054: iaload
    //   2055: ixor
    //   2056: aload #8
    //   2058: iload #19
    //   2060: bipush #14
    //   2062: isub
    //   2063: iaload
    //   2064: ixor
    //   2065: aload #8
    //   2067: iload #19
    //   2069: bipush #16
    //   2071: isub
    //   2072: iaload
    //   2073: ixor
    //   2074: istore #20
    //   2076: iload #20
    //   2078: iconst_1
    //   2079: ishl
    //   2080: iload #20
    //   2082: bipush #31
    //   2084: iushr
    //   2085: ior
    //   2086: istore #21
    //   2088: aload #8
    //   2090: iload #19
    //   2092: iload #21
    //   2094: iastore
    //   2095: iload #9
    //   2097: iconst_5
    //   2098: ishl
    //   2099: iload #9
    //   2101: bipush #27
    //   2103: iushr
    //   2104: ior
    //   2105: istore #20
    //   2107: iload #20
    //   2109: iload #13
    //   2111: iadd
    //   2112: aload #8
    //   2114: iload #19
    //   2116: iaload
    //   2117: iadd
    //   2118: iload #19
    //   2120: bipush #20
    //   2122: if_icmpge -> 2148
    //   2125: ldc 1518500249
    //   2127: iload #10
    //   2129: iload #11
    //   2131: iand
    //   2132: iload #10
    //   2134: iconst_m1
    //   2135: ixor
    //   2136: iload #12
    //   2138: iand
    //   2139: ior
    //   2140: iadd
    //   2141: goto -> 2218
    //   2144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2147: athrow
    //   2148: iload #19
    //   2150: bipush #40
    //   2152: if_icmpge -> 2173
    //   2155: ldc 1859775393
    //   2157: iload #10
    //   2159: iload #11
    //   2161: ixor
    //   2162: iload #12
    //   2164: ixor
    //   2165: iadd
    //   2166: goto -> 2218
    //   2169: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2172: athrow
    //   2173: iload #19
    //   2175: bipush #60
    //   2177: if_icmpge -> 2207
    //   2180: ldc -1894007588
    //   2182: iload #10
    //   2184: iload #11
    //   2186: iand
    //   2187: iload #10
    //   2189: iload #12
    //   2191: iand
    //   2192: ior
    //   2193: iload #11
    //   2195: iload #12
    //   2197: iand
    //   2198: ior
    //   2199: iadd
    //   2200: goto -> 2218
    //   2203: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2206: athrow
    //   2207: ldc -899497514
    //   2209: iload #10
    //   2211: iload #11
    //   2213: ixor
    //   2214: iload #12
    //   2216: ixor
    //   2217: iadd
    //   2218: iadd
    //   2219: istore #21
    //   2221: iload #12
    //   2223: istore #13
    //   2225: iload #11
    //   2227: istore #12
    //   2229: iload #10
    //   2231: bipush #30
    //   2233: ishl
    //   2234: iload #10
    //   2236: iconst_2
    //   2237: iushr
    //   2238: ior
    //   2239: istore #11
    //   2241: iload #9
    //   2243: istore #10
    //   2245: iload #21
    //   2247: istore #9
    //   2249: iinc #19, 1
    //   2252: iload_2
    //   2253: ifeq -> 2002
    //   2256: iload #9
    //   2258: iload #14
    //   2260: iadd
    //   2261: istore #9
    //   2263: iload #10
    //   2265: iload #15
    //   2267: iadd
    //   2268: istore #10
    //   2270: iload #11
    //   2272: iload #16
    //   2274: iadd
    //   2275: istore #11
    //   2277: iload #12
    //   2279: iload #17
    //   2281: iadd
    //   2282: istore #12
    //   2284: iload #13
    //   2286: iload #18
    //   2288: iadd
    //   2289: istore #13
    //   2291: iinc #7, 16
    //   2294: iload_2
    //   2295: ifeq -> 1971
    //   2298: iconst_5
    //   2299: newarray int
    //   2301: dup
    //   2302: iconst_0
    //   2303: iload #9
    //   2305: iastore
    //   2306: dup
    //   2307: iconst_1
    //   2308: iload #10
    //   2310: iastore
    //   2311: dup
    //   2312: iconst_2
    //   2313: iload #11
    //   2315: iastore
    //   2316: dup
    //   2317: iconst_3
    //   2318: iload #12
    //   2320: iastore
    //   2321: dup
    //   2322: iconst_4
    //   2323: iload #13
    //   2325: iastore
    //   2326: astore #14
    //   2328: bipush #20
    //   2330: newarray byte
    //   2332: astore #15
    //   2334: iconst_0
    //   2335: istore #16
    //   2337: iload #16
    //   2339: bipush #20
    //   2341: if_icmpge -> 2382
    //   2344: aload #14
    //   2346: iload #16
    //   2348: iconst_4
    //   2349: idiv
    //   2350: iaload
    //   2351: istore #17
    //   2353: iconst_3
    //   2354: iload #16
    //   2356: iconst_4
    //   2357: irem
    //   2358: isub
    //   2359: bipush #8
    //   2361: imul
    //   2362: istore #18
    //   2364: aload #15
    //   2366: iload #16
    //   2368: iload #17
    //   2370: iload #18
    //   2372: iushr
    //   2373: i2b
    //   2374: bastore
    //   2375: iinc #16, 1
    //   2378: iload_2
    //   2379: ifeq -> 2337
    //   2382: aload #15
    //   2384: astore #5
    //   2386: iconst_0
    //   2387: istore #4
    //   2389: getstatic burp/Zmv9.Zm : Ljava/lang/String;
    //   2392: getstatic burp/Zzh1.Zf : Ljava/lang/Object;
    //   2395: checkcast java/math/BigInteger
    //   2398: invokevirtual intValue : ()I
    //   2401: bipush #32
    //   2403: irem
    //   2404: invokestatic abs : (I)I
    //   2407: invokevirtual charAt : (I)C
    //   2410: getstatic burp/Zb4m.ZQ : Ljava/lang/String;
    //   2413: getstatic burp/Ztzh.ZT : Ljava/lang/Object;
    //   2416: checkcast java/math/BigInteger
    //   2419: invokevirtual intValue : ()I
    //   2422: bipush #32
    //   2424: irem
    //   2425: invokestatic abs : (I)I
    //   2428: invokevirtual charAt : (I)C
    //   2431: if_icmpgt -> 2776
    //   2434: sipush #6114
    //   2437: sipush #12333
    //   2440: invokestatic a : (II)Ljava/lang/String;
    //   2443: iconst_1
    //   2444: ldc burp/Zgmo
    //   2446: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2449: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2452: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2455: astore #5
    //   2457: aload #5
    //   2459: arraylength
    //   2460: istore #6
    //   2462: iconst_0
    //   2463: istore #7
    //   2465: iload #7
    //   2467: iload #6
    //   2469: if_icmpge -> 2607
    //   2472: aload #5
    //   2474: iload #7
    //   2476: aaload
    //   2477: astore #8
    //   2479: aload #8
    //   2481: invokevirtual getModifiers : ()I
    //   2484: invokestatic isStatic : (I)Z
    //   2487: ifne -> 2497
    //   2490: goto -> 2600
    //   2493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2496: athrow
    //   2497: aload #8
    //   2499: invokevirtual getType : ()Ljava/lang/Class;
    //   2502: astore #9
    //   2504: aload #9
    //   2506: ifnull -> 2587
    //   2509: aload #9
    //   2511: invokevirtual isPrimitive : ()Z
    //   2514: ifne -> 2587
    //   2517: goto -> 2524
    //   2520: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2523: athrow
    //   2524: aload #9
    //   2526: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2529: ifnull -> 2587
    //   2532: goto -> 2539
    //   2535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2538: athrow
    //   2539: aload #9
    //   2541: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2544: invokevirtual getName : ()Ljava/lang/String;
    //   2547: ifnull -> 2587
    //   2550: goto -> 2557
    //   2553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2556: athrow
    //   2557: aload #9
    //   2559: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2562: invokevirtual getName : ()Ljava/lang/String;
    //   2565: sipush #6126
    //   2568: sipush #-2937
    //   2571: invokestatic a : (II)Ljava/lang/String;
    //   2574: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2577: ifne -> 2587
    //   2580: goto -> 2587
    //   2583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2586: athrow
    //   2587: aload #8
    //   2589: iconst_1
    //   2590: invokevirtual setAccessible : (Z)V
    //   2593: aload #8
    //   2595: aconst_null
    //   2596: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2599: pop
    //   2600: iinc #7, 1
    //   2603: iload_2
    //   2604: ifeq -> 2465
    //   2607: sipush #6116
    //   2610: sipush #-7620
    //   2613: invokestatic a : (II)Ljava/lang/String;
    //   2616: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2619: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2622: astore #5
    //   2624: aload #5
    //   2626: arraylength
    //   2627: istore #6
    //   2629: iconst_0
    //   2630: istore #7
    //   2632: iload #7
    //   2634: iload #6
    //   2636: if_icmpge -> 2773
    //   2639: aload #5
    //   2641: iload #7
    //   2643: aaload
    //   2644: astore #8
    //   2646: aload #8
    //   2648: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2651: pop
    //   2652: aload #8
    //   2654: invokevirtual getModifiers : ()I
    //   2657: invokestatic isStatic : (I)Z
    //   2660: ifeq -> 2759
    //   2663: aload #8
    //   2665: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2668: arraylength
    //   2669: iconst_2
    //   2670: if_icmpne -> 2759
    //   2673: goto -> 2680
    //   2676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2679: athrow
    //   2680: aload #8
    //   2682: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2685: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2688: if_acmpne -> 2759
    //   2691: goto -> 2698
    //   2694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2697: athrow
    //   2698: aload #8
    //   2700: iconst_1
    //   2701: invokevirtual setAccessible : (Z)V
    //   2704: aload #8
    //   2706: aconst_null
    //   2707: iconst_2
    //   2708: anewarray java/lang/Object
    //   2711: dup
    //   2712: iconst_0
    //   2713: aload_0
    //   2714: aastore
    //   2715: dup
    //   2716: iconst_1
    //   2717: aload_1
    //   2718: ifnonnull -> 2736
    //   2721: goto -> 2728
    //   2724: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2727: athrow
    //   2728: aload_1
    //   2729: goto -> 2743
    //   2732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2735: athrow
    //   2736: aload_1
    //   2737: checkcast [B
    //   2740: invokevirtual clone : ()Ljava/lang/Object;
    //   2743: aastore
    //   2744: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2747: checkcast java/lang/Boolean
    //   2750: invokevirtual booleanValue : ()Z
    //   2753: istore #4
    //   2755: iload_2
    //   2756: ifeq -> 2773
    //   2759: iinc #7, 1
    //   2762: iload_2
    //   2763: ifeq -> 2632
    //   2766: goto -> 2773
    //   2769: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2772: athrow
    //   2773: goto -> 3115
    //   2776: sipush #6129
    //   2779: sipush #8066
    //   2782: invokestatic a : (II)Ljava/lang/String;
    //   2785: iconst_1
    //   2786: ldc burp/Zs5y
    //   2788: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2791: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2794: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2797: astore #5
    //   2799: aload #5
    //   2801: arraylength
    //   2802: istore #6
    //   2804: iconst_0
    //   2805: istore #7
    //   2807: iload #7
    //   2809: iload #6
    //   2811: if_icmpge -> 2949
    //   2814: aload #5
    //   2816: iload #7
    //   2818: aaload
    //   2819: astore #8
    //   2821: aload #8
    //   2823: invokevirtual getModifiers : ()I
    //   2826: invokestatic isStatic : (I)Z
    //   2829: ifne -> 2839
    //   2832: goto -> 2942
    //   2835: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2838: athrow
    //   2839: aload #8
    //   2841: invokevirtual getType : ()Ljava/lang/Class;
    //   2844: astore #9
    //   2846: aload #9
    //   2848: ifnull -> 2929
    //   2851: aload #9
    //   2853: invokevirtual isPrimitive : ()Z
    //   2856: ifne -> 2929
    //   2859: goto -> 2866
    //   2862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2865: athrow
    //   2866: aload #9
    //   2868: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2871: ifnull -> 2929
    //   2874: goto -> 2881
    //   2877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2880: athrow
    //   2881: aload #9
    //   2883: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2886: invokevirtual getName : ()Ljava/lang/String;
    //   2889: ifnull -> 2929
    //   2892: goto -> 2899
    //   2895: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2898: athrow
    //   2899: aload #9
    //   2901: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2904: invokevirtual getName : ()Ljava/lang/String;
    //   2907: sipush #6126
    //   2910: sipush #-2937
    //   2913: invokestatic a : (II)Ljava/lang/String;
    //   2916: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2919: ifne -> 2929
    //   2922: goto -> 2929
    //   2925: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2928: athrow
    //   2929: aload #8
    //   2931: iconst_1
    //   2932: invokevirtual setAccessible : (Z)V
    //   2935: aload #8
    //   2937: aconst_null
    //   2938: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2941: pop
    //   2942: iinc #7, 1
    //   2945: iload_2
    //   2946: ifeq -> 2807
    //   2949: sipush #6127
    //   2952: sipush #-3196
    //   2955: invokestatic a : (II)Ljava/lang/String;
    //   2958: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2961: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2964: astore #5
    //   2966: aload #5
    //   2968: arraylength
    //   2969: istore #6
    //   2971: iconst_0
    //   2972: istore #7
    //   2974: iload #7
    //   2976: iload #6
    //   2978: if_icmpge -> 3115
    //   2981: aload #5
    //   2983: iload #7
    //   2985: aaload
    //   2986: astore #8
    //   2988: aload #8
    //   2990: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2993: pop
    //   2994: aload #8
    //   2996: invokevirtual getModifiers : ()I
    //   2999: invokestatic isStatic : (I)Z
    //   3002: ifeq -> 3101
    //   3005: aload #8
    //   3007: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3010: arraylength
    //   3011: iconst_2
    //   3012: if_icmpne -> 3101
    //   3015: goto -> 3022
    //   3018: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3021: athrow
    //   3022: aload #8
    //   3024: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3027: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3030: if_acmpne -> 3101
    //   3033: goto -> 3040
    //   3036: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3039: athrow
    //   3040: aload #8
    //   3042: iconst_1
    //   3043: invokevirtual setAccessible : (Z)V
    //   3046: aload #8
    //   3048: aconst_null
    //   3049: iconst_2
    //   3050: anewarray java/lang/Object
    //   3053: dup
    //   3054: iconst_0
    //   3055: aload_0
    //   3056: aastore
    //   3057: dup
    //   3058: iconst_1
    //   3059: aload_1
    //   3060: ifnonnull -> 3078
    //   3063: goto -> 3070
    //   3066: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3069: athrow
    //   3070: aload_1
    //   3071: goto -> 3085
    //   3074: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3077: athrow
    //   3078: aload_1
    //   3079: checkcast [B
    //   3082: invokevirtual clone : ()Ljava/lang/Object;
    //   3085: aastore
    //   3086: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3089: checkcast java/lang/Boolean
    //   3092: invokevirtual booleanValue : ()Z
    //   3095: istore #4
    //   3097: iload_2
    //   3098: ifeq -> 3115
    //   3101: iinc #7, 1
    //   3104: iload_2
    //   3105: ifeq -> 2974
    //   3108: goto -> 3115
    //   3111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3114: athrow
    //   3115: iload #4
    //   3117: ifeq -> 3123
    //   3120: iload #4
    //   3122: ireturn
    //   3123: getstatic burp/Zbz_.ZW : Ljava/lang/String;
    //   3126: getstatic burp/Zb0s.Zv : Ljava/lang/Object;
    //   3129: checkcast java/math/BigInteger
    //   3132: invokevirtual intValue : ()I
    //   3135: bipush #32
    //   3137: irem
    //   3138: invokestatic abs : (I)I
    //   3141: invokevirtual charAt : (I)C
    //   3144: getstatic burp/Zgjj.Zi : Ljava/lang/String;
    //   3147: getstatic burp/Zle6.ZM : Ljava/lang/Object;
    //   3150: checkcast java/math/BigInteger
    //   3153: invokevirtual intValue : ()I
    //   3156: bipush #32
    //   3158: irem
    //   3159: invokestatic abs : (I)I
    //   3162: invokevirtual charAt : (I)C
    //   3165: if_icmple -> 3511
    //   3168: sipush #6143
    //   3171: sipush #6720
    //   3174: invokestatic a : (II)Ljava/lang/String;
    //   3177: iconst_1
    //   3178: ldc burp/Zrpu
    //   3180: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3183: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3186: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3189: astore #5
    //   3191: aload #5
    //   3193: arraylength
    //   3194: istore #6
    //   3196: iconst_0
    //   3197: istore #7
    //   3199: iload #7
    //   3201: iload #6
    //   3203: if_icmpge -> 3341
    //   3206: aload #5
    //   3208: iload #7
    //   3210: aaload
    //   3211: astore #8
    //   3213: aload #8
    //   3215: invokevirtual getModifiers : ()I
    //   3218: invokestatic isStatic : (I)Z
    //   3221: ifne -> 3231
    //   3224: goto -> 3334
    //   3227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3230: athrow
    //   3231: aload #8
    //   3233: invokevirtual getType : ()Ljava/lang/Class;
    //   3236: astore #9
    //   3238: aload #9
    //   3240: ifnull -> 3321
    //   3243: aload #9
    //   3245: invokevirtual isPrimitive : ()Z
    //   3248: ifne -> 3321
    //   3251: goto -> 3258
    //   3254: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3257: athrow
    //   3258: aload #9
    //   3260: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3263: ifnull -> 3321
    //   3266: goto -> 3273
    //   3269: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3272: athrow
    //   3273: aload #9
    //   3275: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3278: invokevirtual getName : ()Ljava/lang/String;
    //   3281: ifnull -> 3321
    //   3284: goto -> 3291
    //   3287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3290: athrow
    //   3291: aload #9
    //   3293: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3296: invokevirtual getName : ()Ljava/lang/String;
    //   3299: sipush #6126
    //   3302: sipush #-2937
    //   3305: invokestatic a : (II)Ljava/lang/String;
    //   3308: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3311: ifne -> 3321
    //   3314: goto -> 3321
    //   3317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3320: athrow
    //   3321: aload #8
    //   3323: iconst_1
    //   3324: invokevirtual setAccessible : (Z)V
    //   3327: aload #8
    //   3329: aconst_null
    //   3330: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3333: pop
    //   3334: iinc #7, 1
    //   3337: iload_2
    //   3338: ifeq -> 3199
    //   3341: sipush #6133
    //   3344: sipush #16364
    //   3347: invokestatic a : (II)Ljava/lang/String;
    //   3350: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3353: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3356: astore #5
    //   3358: aload #5
    //   3360: arraylength
    //   3361: istore #6
    //   3363: iconst_0
    //   3364: istore #7
    //   3366: iload #7
    //   3368: iload #6
    //   3370: if_icmpge -> 3507
    //   3373: aload #5
    //   3375: iload #7
    //   3377: aaload
    //   3378: astore #8
    //   3380: aload #8
    //   3382: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3385: pop
    //   3386: aload #8
    //   3388: invokevirtual getModifiers : ()I
    //   3391: invokestatic isStatic : (I)Z
    //   3394: ifeq -> 3493
    //   3397: aload #8
    //   3399: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3402: arraylength
    //   3403: iconst_2
    //   3404: if_icmpne -> 3493
    //   3407: goto -> 3414
    //   3410: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3413: athrow
    //   3414: aload #8
    //   3416: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3419: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3422: if_acmpne -> 3493
    //   3425: goto -> 3432
    //   3428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3431: athrow
    //   3432: aload #8
    //   3434: iconst_1
    //   3435: invokevirtual setAccessible : (Z)V
    //   3438: aload #8
    //   3440: aconst_null
    //   3441: iconst_2
    //   3442: anewarray java/lang/Object
    //   3445: dup
    //   3446: iconst_0
    //   3447: aload_0
    //   3448: aastore
    //   3449: dup
    //   3450: iconst_1
    //   3451: aload_1
    //   3452: ifnonnull -> 3470
    //   3455: goto -> 3462
    //   3458: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3461: athrow
    //   3462: aload_1
    //   3463: goto -> 3477
    //   3466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3469: athrow
    //   3470: aload_1
    //   3471: checkcast [B
    //   3474: invokevirtual clone : ()Ljava/lang/Object;
    //   3477: aastore
    //   3478: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3481: checkcast java/lang/Boolean
    //   3484: invokevirtual booleanValue : ()Z
    //   3487: istore #4
    //   3489: iload_2
    //   3490: ifeq -> 3507
    //   3493: iinc #7, 1
    //   3496: iload_2
    //   3497: ifeq -> 3366
    //   3500: goto -> 3507
    //   3503: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3506: athrow
    //   3507: iload_2
    //   3508: ifeq -> 3850
    //   3511: sipush #6131
    //   3514: sipush #19389
    //   3517: invokestatic a : (II)Ljava/lang/String;
    //   3520: iconst_1
    //   3521: ldc burp/Zm3x
    //   3523: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3526: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3529: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3532: astore #5
    //   3534: aload #5
    //   3536: arraylength
    //   3537: istore #6
    //   3539: iconst_0
    //   3540: istore #7
    //   3542: iload #7
    //   3544: iload #6
    //   3546: if_icmpge -> 3684
    //   3549: aload #5
    //   3551: iload #7
    //   3553: aaload
    //   3554: astore #8
    //   3556: aload #8
    //   3558: invokevirtual getModifiers : ()I
    //   3561: invokestatic isStatic : (I)Z
    //   3564: ifne -> 3574
    //   3567: goto -> 3677
    //   3570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3573: athrow
    //   3574: aload #8
    //   3576: invokevirtual getType : ()Ljava/lang/Class;
    //   3579: astore #9
    //   3581: aload #9
    //   3583: ifnull -> 3664
    //   3586: aload #9
    //   3588: invokevirtual isPrimitive : ()Z
    //   3591: ifne -> 3664
    //   3594: goto -> 3601
    //   3597: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3600: athrow
    //   3601: aload #9
    //   3603: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3606: ifnull -> 3664
    //   3609: goto -> 3616
    //   3612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3615: athrow
    //   3616: aload #9
    //   3618: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3621: invokevirtual getName : ()Ljava/lang/String;
    //   3624: ifnull -> 3664
    //   3627: goto -> 3634
    //   3630: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3633: athrow
    //   3634: aload #9
    //   3636: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3639: invokevirtual getName : ()Ljava/lang/String;
    //   3642: sipush #6126
    //   3645: sipush #-2937
    //   3648: invokestatic a : (II)Ljava/lang/String;
    //   3651: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3654: ifne -> 3664
    //   3657: goto -> 3664
    //   3660: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3663: athrow
    //   3664: aload #8
    //   3666: iconst_1
    //   3667: invokevirtual setAccessible : (Z)V
    //   3670: aload #8
    //   3672: aconst_null
    //   3673: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3676: pop
    //   3677: iinc #7, 1
    //   3680: iload_2
    //   3681: ifeq -> 3542
    //   3684: sipush #6121
    //   3687: sipush #-13217
    //   3690: invokestatic a : (II)Ljava/lang/String;
    //   3693: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3696: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3699: astore #5
    //   3701: aload #5
    //   3703: arraylength
    //   3704: istore #6
    //   3706: iconst_0
    //   3707: istore #7
    //   3709: iload #7
    //   3711: iload #6
    //   3713: if_icmpge -> 3850
    //   3716: aload #5
    //   3718: iload #7
    //   3720: aaload
    //   3721: astore #8
    //   3723: aload #8
    //   3725: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3728: pop
    //   3729: aload #8
    //   3731: invokevirtual getModifiers : ()I
    //   3734: invokestatic isStatic : (I)Z
    //   3737: ifeq -> 3836
    //   3740: aload #8
    //   3742: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3745: arraylength
    //   3746: iconst_2
    //   3747: if_icmpne -> 3836
    //   3750: goto -> 3757
    //   3753: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3756: athrow
    //   3757: aload #8
    //   3759: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3762: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3765: if_acmpne -> 3836
    //   3768: goto -> 3775
    //   3771: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3774: athrow
    //   3775: aload #8
    //   3777: iconst_1
    //   3778: invokevirtual setAccessible : (Z)V
    //   3781: aload #8
    //   3783: aconst_null
    //   3784: iconst_2
    //   3785: anewarray java/lang/Object
    //   3788: dup
    //   3789: iconst_0
    //   3790: aload_0
    //   3791: aastore
    //   3792: dup
    //   3793: iconst_1
    //   3794: aload_1
    //   3795: ifnonnull -> 3813
    //   3798: goto -> 3805
    //   3801: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3804: athrow
    //   3805: aload_1
    //   3806: goto -> 3820
    //   3809: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3812: athrow
    //   3813: aload_1
    //   3814: checkcast [B
    //   3817: invokevirtual clone : ()Ljava/lang/Object;
    //   3820: aastore
    //   3821: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3824: checkcast java/lang/Boolean
    //   3827: invokevirtual booleanValue : ()Z
    //   3830: istore #4
    //   3832: iload_2
    //   3833: ifeq -> 3850
    //   3836: iinc #7, 1
    //   3839: iload_2
    //   3840: ifeq -> 3709
    //   3843: goto -> 3850
    //   3846: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3849: athrow
    //   3850: iload #4
    //   3852: ifeq -> 3858
    //   3855: iload #4
    //   3857: ireturn
    //   3858: getstatic burp/Ze4x.Zk : Ljava/lang/String;
    //   3861: getstatic burp/Ze57.ZR : Ljava/lang/Object;
    //   3864: checkcast java/math/BigInteger
    //   3867: invokevirtual intValue : ()I
    //   3870: bipush #32
    //   3872: irem
    //   3873: invokestatic abs : (I)I
    //   3876: invokevirtual charAt : (I)C
    //   3879: getstatic burp/Ztv8.ZJ : Ljava/lang/String;
    //   3882: getstatic burp/Zl8i.ZY : Ljava/lang/Object;
    //   3885: checkcast java/math/BigInteger
    //   3888: invokevirtual intValue : ()I
    //   3891: bipush #32
    //   3893: irem
    //   3894: invokestatic abs : (I)I
    //   3897: invokevirtual charAt : (I)C
    //   3900: if_icmple -> 4246
    //   3903: sipush #6142
    //   3906: sipush #32064
    //   3909: invokestatic a : (II)Ljava/lang/String;
    //   3912: iconst_1
    //   3913: ldc burp/Zg8
    //   3915: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3918: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3921: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3924: astore #5
    //   3926: aload #5
    //   3928: arraylength
    //   3929: istore #6
    //   3931: iconst_0
    //   3932: istore #7
    //   3934: iload #7
    //   3936: iload #6
    //   3938: if_icmpge -> 4076
    //   3941: aload #5
    //   3943: iload #7
    //   3945: aaload
    //   3946: astore #8
    //   3948: aload #8
    //   3950: invokevirtual getModifiers : ()I
    //   3953: invokestatic isStatic : (I)Z
    //   3956: ifne -> 3966
    //   3959: goto -> 4069
    //   3962: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3965: athrow
    //   3966: aload #8
    //   3968: invokevirtual getType : ()Ljava/lang/Class;
    //   3971: astore #9
    //   3973: aload #9
    //   3975: ifnull -> 4056
    //   3978: aload #9
    //   3980: invokevirtual isPrimitive : ()Z
    //   3983: ifne -> 4056
    //   3986: goto -> 3993
    //   3989: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3992: athrow
    //   3993: aload #9
    //   3995: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3998: ifnull -> 4056
    //   4001: goto -> 4008
    //   4004: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4007: athrow
    //   4008: aload #9
    //   4010: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4013: invokevirtual getName : ()Ljava/lang/String;
    //   4016: ifnull -> 4056
    //   4019: goto -> 4026
    //   4022: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4025: athrow
    //   4026: aload #9
    //   4028: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4031: invokevirtual getName : ()Ljava/lang/String;
    //   4034: sipush #6126
    //   4037: sipush #-2937
    //   4040: invokestatic a : (II)Ljava/lang/String;
    //   4043: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4046: ifne -> 4056
    //   4049: goto -> 4056
    //   4052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4055: athrow
    //   4056: aload #8
    //   4058: iconst_1
    //   4059: invokevirtual setAccessible : (Z)V
    //   4062: aload #8
    //   4064: aconst_null
    //   4065: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4068: pop
    //   4069: iinc #7, 1
    //   4072: iload_2
    //   4073: ifeq -> 3934
    //   4076: sipush #6113
    //   4079: sipush #-11085
    //   4082: invokestatic a : (II)Ljava/lang/String;
    //   4085: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4088: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4091: astore #5
    //   4093: aload #5
    //   4095: arraylength
    //   4096: istore #6
    //   4098: iconst_0
    //   4099: istore #7
    //   4101: iload #7
    //   4103: iload #6
    //   4105: if_icmpge -> 4242
    //   4108: aload #5
    //   4110: iload #7
    //   4112: aaload
    //   4113: astore #8
    //   4115: aload #8
    //   4117: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4120: pop
    //   4121: aload #8
    //   4123: invokevirtual getModifiers : ()I
    //   4126: invokestatic isStatic : (I)Z
    //   4129: ifeq -> 4228
    //   4132: aload #8
    //   4134: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4137: arraylength
    //   4138: iconst_2
    //   4139: if_icmpne -> 4228
    //   4142: goto -> 4149
    //   4145: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4148: athrow
    //   4149: aload #8
    //   4151: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4154: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4157: if_acmpne -> 4228
    //   4160: goto -> 4167
    //   4163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4166: athrow
    //   4167: aload #8
    //   4169: iconst_1
    //   4170: invokevirtual setAccessible : (Z)V
    //   4173: aload #8
    //   4175: aconst_null
    //   4176: iconst_2
    //   4177: anewarray java/lang/Object
    //   4180: dup
    //   4181: iconst_0
    //   4182: aload_0
    //   4183: aastore
    //   4184: dup
    //   4185: iconst_1
    //   4186: aload_1
    //   4187: ifnonnull -> 4205
    //   4190: goto -> 4197
    //   4193: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4196: athrow
    //   4197: aload_1
    //   4198: goto -> 4212
    //   4201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4204: athrow
    //   4205: aload_1
    //   4206: checkcast [B
    //   4209: invokevirtual clone : ()Ljava/lang/Object;
    //   4212: aastore
    //   4213: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4216: checkcast java/lang/Boolean
    //   4219: invokevirtual booleanValue : ()Z
    //   4222: istore #4
    //   4224: iload_2
    //   4225: ifeq -> 4242
    //   4228: iinc #7, 1
    //   4231: iload_2
    //   4232: ifeq -> 4101
    //   4235: goto -> 4242
    //   4238: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4241: athrow
    //   4242: iload_2
    //   4243: ifeq -> 4585
    //   4246: sipush #6120
    //   4249: sipush #-22242
    //   4252: invokestatic a : (II)Ljava/lang/String;
    //   4255: iconst_1
    //   4256: ldc burp/Zm1l
    //   4258: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4261: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4264: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4267: astore #5
    //   4269: aload #5
    //   4271: arraylength
    //   4272: istore #6
    //   4274: iconst_0
    //   4275: istore #7
    //   4277: iload #7
    //   4279: iload #6
    //   4281: if_icmpge -> 4419
    //   4284: aload #5
    //   4286: iload #7
    //   4288: aaload
    //   4289: astore #8
    //   4291: aload #8
    //   4293: invokevirtual getModifiers : ()I
    //   4296: invokestatic isStatic : (I)Z
    //   4299: ifne -> 4309
    //   4302: goto -> 4412
    //   4305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4308: athrow
    //   4309: aload #8
    //   4311: invokevirtual getType : ()Ljava/lang/Class;
    //   4314: astore #9
    //   4316: aload #9
    //   4318: ifnull -> 4399
    //   4321: aload #9
    //   4323: invokevirtual isPrimitive : ()Z
    //   4326: ifne -> 4399
    //   4329: goto -> 4336
    //   4332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4335: athrow
    //   4336: aload #9
    //   4338: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4341: ifnull -> 4399
    //   4344: goto -> 4351
    //   4347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4350: athrow
    //   4351: aload #9
    //   4353: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4356: invokevirtual getName : ()Ljava/lang/String;
    //   4359: ifnull -> 4399
    //   4362: goto -> 4369
    //   4365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4368: athrow
    //   4369: aload #9
    //   4371: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4374: invokevirtual getName : ()Ljava/lang/String;
    //   4377: sipush #6126
    //   4380: sipush #-2937
    //   4383: invokestatic a : (II)Ljava/lang/String;
    //   4386: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4389: ifne -> 4399
    //   4392: goto -> 4399
    //   4395: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4398: athrow
    //   4399: aload #8
    //   4401: iconst_1
    //   4402: invokevirtual setAccessible : (Z)V
    //   4405: aload #8
    //   4407: aconst_null
    //   4408: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4411: pop
    //   4412: iinc #7, 1
    //   4415: iload_2
    //   4416: ifeq -> 4277
    //   4419: sipush #6124
    //   4422: sipush #-17248
    //   4425: invokestatic a : (II)Ljava/lang/String;
    //   4428: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4431: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4434: astore #5
    //   4436: aload #5
    //   4438: arraylength
    //   4439: istore #6
    //   4441: iconst_0
    //   4442: istore #7
    //   4444: iload #7
    //   4446: iload #6
    //   4448: if_icmpge -> 4585
    //   4451: aload #5
    //   4453: iload #7
    //   4455: aaload
    //   4456: astore #8
    //   4458: aload #8
    //   4460: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4463: pop
    //   4464: aload #8
    //   4466: invokevirtual getModifiers : ()I
    //   4469: invokestatic isStatic : (I)Z
    //   4472: ifeq -> 4571
    //   4475: aload #8
    //   4477: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4480: arraylength
    //   4481: iconst_2
    //   4482: if_icmpne -> 4571
    //   4485: goto -> 4492
    //   4488: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4491: athrow
    //   4492: aload #8
    //   4494: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4497: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4500: if_acmpne -> 4571
    //   4503: goto -> 4510
    //   4506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4509: athrow
    //   4510: aload #8
    //   4512: iconst_1
    //   4513: invokevirtual setAccessible : (Z)V
    //   4516: aload #8
    //   4518: aconst_null
    //   4519: iconst_2
    //   4520: anewarray java/lang/Object
    //   4523: dup
    //   4524: iconst_0
    //   4525: aload_0
    //   4526: aastore
    //   4527: dup
    //   4528: iconst_1
    //   4529: aload_1
    //   4530: ifnonnull -> 4548
    //   4533: goto -> 4540
    //   4536: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4539: athrow
    //   4540: aload_1
    //   4541: goto -> 4555
    //   4544: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4547: athrow
    //   4548: aload_1
    //   4549: checkcast [B
    //   4552: invokevirtual clone : ()Ljava/lang/Object;
    //   4555: aastore
    //   4556: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4559: checkcast java/lang/Boolean
    //   4562: invokevirtual booleanValue : ()Z
    //   4565: istore #4
    //   4567: iload_2
    //   4568: ifeq -> 4585
    //   4571: iinc #7, 1
    //   4574: iload_2
    //   4575: ifeq -> 4444
    //   4578: goto -> 4585
    //   4581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4584: athrow
    //   4585: iload #4
    //   4587: ifeq -> 4593
    //   4590: iload #4
    //   4592: ireturn
    //   4593: getstatic burp/Zlot.ZD : Ljava/lang/String;
    //   4596: getstatic burp/Zva.Zu : Ljava/lang/Object;
    //   4599: checkcast java/math/BigInteger
    //   4602: invokevirtual intValue : ()I
    //   4605: bipush #32
    //   4607: irem
    //   4608: invokestatic abs : (I)I
    //   4611: invokevirtual charAt : (I)C
    //   4614: getstatic burp/Zlkm.ZH : Ljava/lang/String;
    //   4617: getstatic burp/Zsts.Zu : Ljava/lang/Object;
    //   4620: checkcast java/math/BigInteger
    //   4623: invokevirtual intValue : ()I
    //   4626: bipush #32
    //   4628: irem
    //   4629: invokestatic abs : (I)I
    //   4632: invokevirtual charAt : (I)C
    //   4635: if_icmpgt -> 4981
    //   4638: sipush #6135
    //   4641: sipush #-21155
    //   4644: invokestatic a : (II)Ljava/lang/String;
    //   4647: iconst_1
    //   4648: ldc burp/Zxyp
    //   4650: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4653: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4656: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4659: astore #5
    //   4661: aload #5
    //   4663: arraylength
    //   4664: istore #6
    //   4666: iconst_0
    //   4667: istore #7
    //   4669: iload #7
    //   4671: iload #6
    //   4673: if_icmpge -> 4811
    //   4676: aload #5
    //   4678: iload #7
    //   4680: aaload
    //   4681: astore #8
    //   4683: aload #8
    //   4685: invokevirtual getModifiers : ()I
    //   4688: invokestatic isStatic : (I)Z
    //   4691: ifne -> 4701
    //   4694: goto -> 4804
    //   4697: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4700: athrow
    //   4701: aload #8
    //   4703: invokevirtual getType : ()Ljava/lang/Class;
    //   4706: astore #9
    //   4708: aload #9
    //   4710: ifnull -> 4791
    //   4713: aload #9
    //   4715: invokevirtual isPrimitive : ()Z
    //   4718: ifne -> 4791
    //   4721: goto -> 4728
    //   4724: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4727: athrow
    //   4728: aload #9
    //   4730: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4733: ifnull -> 4791
    //   4736: goto -> 4743
    //   4739: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4742: athrow
    //   4743: aload #9
    //   4745: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4748: invokevirtual getName : ()Ljava/lang/String;
    //   4751: ifnull -> 4791
    //   4754: goto -> 4761
    //   4757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4760: athrow
    //   4761: aload #9
    //   4763: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4766: invokevirtual getName : ()Ljava/lang/String;
    //   4769: sipush #6126
    //   4772: sipush #-2937
    //   4775: invokestatic a : (II)Ljava/lang/String;
    //   4778: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4781: ifne -> 4791
    //   4784: goto -> 4791
    //   4787: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4790: athrow
    //   4791: aload #8
    //   4793: iconst_1
    //   4794: invokevirtual setAccessible : (Z)V
    //   4797: aload #8
    //   4799: aconst_null
    //   4800: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4803: pop
    //   4804: iinc #7, 1
    //   4807: iload_2
    //   4808: ifeq -> 4669
    //   4811: sipush #6122
    //   4814: sipush #-26725
    //   4817: invokestatic a : (II)Ljava/lang/String;
    //   4820: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4823: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4826: astore #5
    //   4828: aload #5
    //   4830: arraylength
    //   4831: istore #6
    //   4833: iconst_0
    //   4834: istore #7
    //   4836: iload #7
    //   4838: iload #6
    //   4840: if_icmpge -> 4977
    //   4843: aload #5
    //   4845: iload #7
    //   4847: aaload
    //   4848: astore #8
    //   4850: aload #8
    //   4852: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4855: pop
    //   4856: aload #8
    //   4858: invokevirtual getModifiers : ()I
    //   4861: invokestatic isStatic : (I)Z
    //   4864: ifeq -> 4963
    //   4867: aload #8
    //   4869: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4872: arraylength
    //   4873: iconst_2
    //   4874: if_icmpne -> 4963
    //   4877: goto -> 4884
    //   4880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4883: athrow
    //   4884: aload #8
    //   4886: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4889: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4892: if_acmpne -> 4963
    //   4895: goto -> 4902
    //   4898: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4901: athrow
    //   4902: aload #8
    //   4904: iconst_1
    //   4905: invokevirtual setAccessible : (Z)V
    //   4908: aload #8
    //   4910: aconst_null
    //   4911: iconst_2
    //   4912: anewarray java/lang/Object
    //   4915: dup
    //   4916: iconst_0
    //   4917: aload_0
    //   4918: aastore
    //   4919: dup
    //   4920: iconst_1
    //   4921: aload_1
    //   4922: ifnonnull -> 4940
    //   4925: goto -> 4932
    //   4928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4931: athrow
    //   4932: aload_1
    //   4933: goto -> 4947
    //   4936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4939: athrow
    //   4940: aload_1
    //   4941: checkcast [B
    //   4944: invokevirtual clone : ()Ljava/lang/Object;
    //   4947: aastore
    //   4948: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4951: checkcast java/lang/Boolean
    //   4954: invokevirtual booleanValue : ()Z
    //   4957: istore #4
    //   4959: iload_2
    //   4960: ifeq -> 4977
    //   4963: iinc #7, 1
    //   4966: iload_2
    //   4967: ifeq -> 4836
    //   4970: goto -> 4977
    //   4973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4976: athrow
    //   4977: iload_2
    //   4978: ifeq -> 5319
    //   4981: sipush #6115
    //   4984: bipush #62
    //   4986: invokestatic a : (II)Ljava/lang/String;
    //   4989: iconst_1
    //   4990: ldc burp/Zltz
    //   4992: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4995: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4998: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5001: astore #5
    //   5003: aload #5
    //   5005: arraylength
    //   5006: istore #6
    //   5008: iconst_0
    //   5009: istore #7
    //   5011: iload #7
    //   5013: iload #6
    //   5015: if_icmpge -> 5153
    //   5018: aload #5
    //   5020: iload #7
    //   5022: aaload
    //   5023: astore #8
    //   5025: aload #8
    //   5027: invokevirtual getModifiers : ()I
    //   5030: invokestatic isStatic : (I)Z
    //   5033: ifne -> 5043
    //   5036: goto -> 5146
    //   5039: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5042: athrow
    //   5043: aload #8
    //   5045: invokevirtual getType : ()Ljava/lang/Class;
    //   5048: astore #9
    //   5050: aload #9
    //   5052: ifnull -> 5133
    //   5055: aload #9
    //   5057: invokevirtual isPrimitive : ()Z
    //   5060: ifne -> 5133
    //   5063: goto -> 5070
    //   5066: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5069: athrow
    //   5070: aload #9
    //   5072: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5075: ifnull -> 5133
    //   5078: goto -> 5085
    //   5081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5084: athrow
    //   5085: aload #9
    //   5087: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5090: invokevirtual getName : ()Ljava/lang/String;
    //   5093: ifnull -> 5133
    //   5096: goto -> 5103
    //   5099: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5102: athrow
    //   5103: aload #9
    //   5105: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5108: invokevirtual getName : ()Ljava/lang/String;
    //   5111: sipush #6126
    //   5114: sipush #-2937
    //   5117: invokestatic a : (II)Ljava/lang/String;
    //   5120: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5123: ifne -> 5133
    //   5126: goto -> 5133
    //   5129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5132: athrow
    //   5133: aload #8
    //   5135: iconst_1
    //   5136: invokevirtual setAccessible : (Z)V
    //   5139: aload #8
    //   5141: aconst_null
    //   5142: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5145: pop
    //   5146: iinc #7, 1
    //   5149: iload_2
    //   5150: ifeq -> 5011
    //   5153: sipush #6128
    //   5156: sipush #-13796
    //   5159: invokestatic a : (II)Ljava/lang/String;
    //   5162: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5165: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5168: astore #5
    //   5170: aload #5
    //   5172: arraylength
    //   5173: istore #6
    //   5175: iconst_0
    //   5176: istore #7
    //   5178: iload #7
    //   5180: iload #6
    //   5182: if_icmpge -> 5319
    //   5185: aload #5
    //   5187: iload #7
    //   5189: aaload
    //   5190: astore #8
    //   5192: aload #8
    //   5194: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5197: pop
    //   5198: aload #8
    //   5200: invokevirtual getModifiers : ()I
    //   5203: invokestatic isStatic : (I)Z
    //   5206: ifeq -> 5305
    //   5209: aload #8
    //   5211: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5214: arraylength
    //   5215: iconst_2
    //   5216: if_icmpne -> 5305
    //   5219: goto -> 5226
    //   5222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5225: athrow
    //   5226: aload #8
    //   5228: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5231: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5234: if_acmpne -> 5305
    //   5237: goto -> 5244
    //   5240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5243: athrow
    //   5244: aload #8
    //   5246: iconst_1
    //   5247: invokevirtual setAccessible : (Z)V
    //   5250: aload #8
    //   5252: aconst_null
    //   5253: iconst_2
    //   5254: anewarray java/lang/Object
    //   5257: dup
    //   5258: iconst_0
    //   5259: aload_0
    //   5260: aastore
    //   5261: dup
    //   5262: iconst_1
    //   5263: aload_1
    //   5264: ifnonnull -> 5282
    //   5267: goto -> 5274
    //   5270: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5273: athrow
    //   5274: aload_1
    //   5275: goto -> 5289
    //   5278: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5281: athrow
    //   5282: aload_1
    //   5283: checkcast [B
    //   5286: invokevirtual clone : ()Ljava/lang/Object;
    //   5289: aastore
    //   5290: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5293: checkcast java/lang/Boolean
    //   5296: invokevirtual booleanValue : ()Z
    //   5299: istore #4
    //   5301: iload_2
    //   5302: ifeq -> 5319
    //   5305: iinc #7, 1
    //   5308: iload_2
    //   5309: ifeq -> 5178
    //   5312: goto -> 5319
    //   5315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5318: athrow
    //   5319: iload #4
    //   5321: ireturn
    //   5322: astore_3
    //   5323: new java/lang/Exception
    //   5326: dup
    //   5327: aload_3
    //   5328: invokevirtual getMessage : ()Ljava/lang/String;
    //   5331: invokespecial <init> : (Ljava/lang/String;)V
    //   5334: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3122	5322	java/lang/Throwable
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
    //   2009	2033	2036	java/lang/Throwable
    //   2107	2144	2144	java/lang/Throwable
    //   2148	2169	2169	java/lang/Throwable
    //   2173	2203	2203	java/lang/Throwable
    //   2479	2493	2493	java/lang/Throwable
    //   2504	2517	2520	java/lang/Throwable
    //   2509	2532	2535	java/lang/Throwable
    //   2524	2550	2553	java/lang/Throwable
    //   2539	2580	2583	java/lang/Throwable
    //   2646	2673	2676	java/lang/Throwable
    //   2663	2691	2694	java/lang/Throwable
    //   2680	2721	2724	java/lang/Throwable
    //   2698	2732	2732	java/lang/Throwable
    //   2755	2766	2769	java/lang/Throwable
    //   2821	2835	2835	java/lang/Throwable
    //   2846	2859	2862	java/lang/Throwable
    //   2851	2874	2877	java/lang/Throwable
    //   2866	2892	2895	java/lang/Throwable
    //   2881	2922	2925	java/lang/Throwable
    //   2988	3015	3018	java/lang/Throwable
    //   3005	3033	3036	java/lang/Throwable
    //   3022	3063	3066	java/lang/Throwable
    //   3040	3074	3074	java/lang/Throwable
    //   3097	3108	3111	java/lang/Throwable
    //   3123	3857	5322	java/lang/Throwable
    //   3213	3227	3227	java/lang/Throwable
    //   3238	3251	3254	java/lang/Throwable
    //   3243	3266	3269	java/lang/Throwable
    //   3258	3284	3287	java/lang/Throwable
    //   3273	3314	3317	java/lang/Throwable
    //   3380	3407	3410	java/lang/Throwable
    //   3397	3425	3428	java/lang/Throwable
    //   3414	3455	3458	java/lang/Throwable
    //   3432	3466	3466	java/lang/Throwable
    //   3489	3500	3503	java/lang/Throwable
    //   3556	3570	3570	java/lang/Throwable
    //   3581	3594	3597	java/lang/Throwable
    //   3586	3609	3612	java/lang/Throwable
    //   3601	3627	3630	java/lang/Throwable
    //   3616	3657	3660	java/lang/Throwable
    //   3723	3750	3753	java/lang/Throwable
    //   3740	3768	3771	java/lang/Throwable
    //   3757	3798	3801	java/lang/Throwable
    //   3775	3809	3809	java/lang/Throwable
    //   3832	3843	3846	java/lang/Throwable
    //   3858	4592	5322	java/lang/Throwable
    //   3948	3962	3962	java/lang/Throwable
    //   3973	3986	3989	java/lang/Throwable
    //   3978	4001	4004	java/lang/Throwable
    //   3993	4019	4022	java/lang/Throwable
    //   4008	4049	4052	java/lang/Throwable
    //   4115	4142	4145	java/lang/Throwable
    //   4132	4160	4163	java/lang/Throwable
    //   4149	4190	4193	java/lang/Throwable
    //   4167	4201	4201	java/lang/Throwable
    //   4224	4235	4238	java/lang/Throwable
    //   4291	4305	4305	java/lang/Throwable
    //   4316	4329	4332	java/lang/Throwable
    //   4321	4344	4347	java/lang/Throwable
    //   4336	4362	4365	java/lang/Throwable
    //   4351	4392	4395	java/lang/Throwable
    //   4458	4485	4488	java/lang/Throwable
    //   4475	4503	4506	java/lang/Throwable
    //   4492	4533	4536	java/lang/Throwable
    //   4510	4544	4544	java/lang/Throwable
    //   4567	4578	4581	java/lang/Throwable
    //   4593	5321	5322	java/lang/Throwable
    //   4683	4697	4697	java/lang/Throwable
    //   4708	4721	4724	java/lang/Throwable
    //   4713	4736	4739	java/lang/Throwable
    //   4728	4754	4757	java/lang/Throwable
    //   4743	4784	4787	java/lang/Throwable
    //   4850	4877	4880	java/lang/Throwable
    //   4867	4895	4898	java/lang/Throwable
    //   4884	4925	4928	java/lang/Throwable
    //   4902	4936	4936	java/lang/Throwable
    //   4959	4970	4973	java/lang/Throwable
    //   5025	5039	5039	java/lang/Throwable
    //   5050	5063	5066	java/lang/Throwable
    //   5055	5078	5081	java/lang/Throwable
    //   5070	5096	5099	java/lang/Throwable
    //   5085	5126	5129	java/lang/Throwable
    //   5192	5219	5222	java/lang/Throwable
    //   5209	5237	5240	java/lang/Throwable
    //   5226	5267	5270	java/lang/Throwable
    //   5244	5278	5278	java/lang/Throwable
    //   5301	5312	5315	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'yhòµN!Ì]ÇøµúÔ+y§(¦­eè^rñ4³Í\\t±`WH<NÆª½¾¶ µ@ Ø2Ö<ø¤Ð­àc;]´vU{â9¹/ÿJUlG£\\t=wÆª-s¤Àõ\\\t%°ÅRn\\rÑ¥\\ts*#\\tBÔÝÐ8\\tÎA¸lÁÊj9C\\bÂbÄ£5+Ç!\\t-ÓÄ>N{i\\t¡uUê|Ý#µ\\tç9ce+ò\\tá]}ÕâÂç\\tT0ÎÐO® ¿Ý/4òé]ªÆñ8èiqõi¨!\\tøC~,Ân v\\t^H*Qüì\\toR©rÏ7"\\tp©oq;i#H¸\\tqOU?í­Ýå\\tB$)Àó_?MHì|®äÚm34.v©ÔövùÊ ñÒId¿µ+f!þÄÝn®\\b­JPÍgn/ãÃETÔïõ{$ªQîpûð¶¸98ÛçQv'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #39
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
    //   68: ldc '/j5¸ÁáÜðÕ\\t/5ÄÁnÍF'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #89
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
    //   129: putstatic burp/Zgds.a : [Ljava/lang/String;
    //   132: bipush #28
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgds.b : [Ljava/lang/String;
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
    //   212: bipush #126
    //   214: goto -> 243
    //   217: iconst_2
    //   218: goto -> 243
    //   221: bipush #49
    //   223: goto -> 243
    //   226: bipush #108
    //   228: goto -> 243
    //   231: bipush #33
    //   233: goto -> 243
    //   236: bipush #45
    //   238: goto -> 243
    //   241: bipush #42
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
    //   300: sipush #6132
    //   303: sipush #-10518
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zgds.ZA : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #94
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #120
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-126
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-15
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-49
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-14
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #25
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #-42
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-66
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #58
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #86
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #64
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #113
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: iconst_5
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #21
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-119
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-60
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #60
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #67
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #31
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #21
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #123
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-4
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-36
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #68
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-29
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #110
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #-41
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-49
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #24
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-126
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-20
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zgds.Z_ : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x17E5) & 0xFFFF;
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
      byte b1 = 20;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgds.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */